package services;

import java.net.URISyntaxException;
import java.util.UUID;

import com.google.flatbuffers.ByteVector;
import com.google.flatbuffers.FlatBufferBuilder;

import mobsya.fb.AnyMessage;
import mobsya.fb.CompileAndLoadCodeOnVM;
import mobsya.fb.ConnectionHandshake;
import mobsya.fb.LockNode;
import mobsya.fb.Message;
import mobsya.fb.Node;
import models.Thymio;

/**
 * Thymio sender application for Thymio Java Connect. This application is used to send messages to the Thymio on a thread.
 * 
 */
public class ThymioSender implements Runnable {

    /**
     * Constructor ot the ThymioSender class.
     */
    public ThymioSender() {
    }

    /**
     * The thread run method that sends messages to the Thymio.
     * The sequence of messages is:
     * - ConnectionHandshake
     * - LockNode
     * - CompileAndLoadCodeOnVM
     * 
     */
    @Override
    public void run() {
        try {
            Thymio thymio = new Thymio();
            ThymioService client = new ThymioService(thymio);

            // Connect and send FlatBuffer message
            client.connect();
            while (!client.isOpen()) {
                // wait for the connection to open
            }

            // Initialize FlatBuffers builders
            FlatBufferBuilder builderConnectionHandshake = new FlatBufferBuilder();
            FlatBufferBuilder builderLockNode = new FlatBufferBuilder();
            FlatBufferBuilder builderCompileAndLoadCodeOnVM = new FlatBufferBuilder();

            // Initialize variables
            int offsetPassword = builderConnectionHandshake.createString("");
            int offsetCodeId = builderCompileAndLoadCodeOnVM.createString("leds.top[0] = 0\n" +
                    "leds.top[1] = 0\n" +
                    "leds.top[2] = 0");

            // Create a ConnectionHandshake message
            ConnectionHandshake.startConnectionHandshake(builderConnectionHandshake);
            ConnectionHandshake.addMinProtocolVersion(builderConnectionHandshake, 1);
            ConnectionHandshake.addProtocolVersion(builderConnectionHandshake, 1);
            ConnectionHandshake.addPassword(builderConnectionHandshake, offsetPassword);
            int offset = ConnectionHandshake.endConnectionHandshake(builderConnectionHandshake);

            // Send the ConnectionHandshake message
            Message.startMessage(builderConnectionHandshake);
            Message.addMessageType(builderConnectionHandshake, AnyMessage.ConnectionHandshake);
            Message.addMessage(builderConnectionHandshake, offset);
            int messageOffset = Message.endMessage(builderConnectionHandshake);
            builderConnectionHandshake.finish(messageOffset);
            client.send(builderConnectionHandshake.dataBuffer());


            // Wait for the Thymio to send the NodesChanged message
            synchronized (thymio) {
                try {
                    thymio.wait();

                    Node thymioNode = thymio.getThymioNode();

                    System.out.println("===============");
                    System.out.println("Node name: " + thymioNode.name());
                    System.out.println("Node status: " + thymioNode.status());
                    System.out.println("Node fwVersion: " + thymioNode.fwVersion());
                    System.out.println("Node type: " + thymioNode.type());
                    System.out.println("Node NodeId: " + thymioNode.nodeId());
                    System.out.println("===============");
                    
                    ByteVector byteVector = thymio.getThymioNode().nodeId().idVector();
                    byte[] bytes = new byte[byteVector.length()];
                    for (int i = 0; i < byteVector.length(); i++) {
                        bytes[i] = byteVector.get(i);
                    }
                    System.out.println(bytes.toString());
                    
                    // TODO : The problem is here, the nodeId is not the same as the one in the NodesChanged message
                    int offsetNodeId = builderLockNode.createString(thymioNode.name());

                    long lockUuid = UUID.randomUUID().getMostSignificantBits();

                    // Create a LockNode message
                    LockNode.startLockNode(builderLockNode);
                    LockNode.addRequestId(builderLockNode, lockUuid);
                    LockNode.addNodeId(builderLockNode, offsetNodeId);
                    int offsetLock = LockNode.endLockNode(builderLockNode);

                    // Send the LockNode message
                    Message.startMessage(builderLockNode);
                    Message.addMessageType(builderLockNode, AnyMessage.LockNode);
                    Message.addMessage(builderLockNode, offsetLock);
                    int messageLockOffset = Message.endMessage(builderLockNode);
                    builderLockNode.finish(messageLockOffset);
                    client.send(builderLockNode.dataBuffer());

                    // Create a CompileAndLoadCodeOnVM message
                    long loadCodeVM = System.currentTimeMillis();
                    CompileAndLoadCodeOnVM.startCompileAndLoadCodeOnVM(builderCompileAndLoadCodeOnVM);
                    CompileAndLoadCodeOnVM.addNodeId(builderCompileAndLoadCodeOnVM, offsetNodeId);
                    CompileAndLoadCodeOnVM.addRequestId(builderCompileAndLoadCodeOnVM, loadCodeVM);
                    CompileAndLoadCodeOnVM.addProgram(builderCompileAndLoadCodeOnVM, offsetCodeId);
                    int offsetLoadCodeVM = CompileAndLoadCodeOnVM.endCompileAndLoadCodeOnVM(builderCompileAndLoadCodeOnVM);

                    Message.startMessage(builderCompileAndLoadCodeOnVM);
                    Message.addMessageType(builderCompileAndLoadCodeOnVM, AnyMessage.CompileAndLoadCodeOnVM);
                    Message.addMessage(builderCompileAndLoadCodeOnVM, offsetLoadCodeVM);
                    messageOffset = Message.endMessage(builderCompileAndLoadCodeOnVM);
                    builderCompileAndLoadCodeOnVM.finish(messageOffset);
                    client.send(builderCompileAndLoadCodeOnVM.dataBuffer());

                } catch (InterruptedException e) {
                    System.out.println(e.toString());
                    e.printStackTrace();
                } catch (Exception e) {
                    System.out.println(e.toString());
                    e.printStackTrace();
                }
            }
        } catch (URISyntaxException e) {
            System.out.println(e.toString());
            e.printStackTrace();
        } catch (Exception e) {
            System.out.println(e.toString());
            e.printStackTrace();
        }

    }

}
