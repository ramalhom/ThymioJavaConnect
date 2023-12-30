package services;

import java.net.URI;
import java.net.URISyntaxException;
import java.nio.ByteBuffer;

import org.java_websocket.client.WebSocketClient;
import org.java_websocket.handshake.ServerHandshake;

import mobsya.fb.AnyMessage;
import mobsya.fb.ErrorType;
import mobsya.fb.Message;
import mobsya.fb.NodesChanged;
import mobsya.fb.RequestCompleted;
import models.Thymio;
import mobsya.fb.Node;
import mobsya.fb.NodeStatus;

/**
 * Thymio service for Thymio Java Connect. This service is used to receive messages from the Thymio.
 * 
 */
public class ThymioService extends WebSocketClient {

    /**
     * The URL of the Thymio Java Connect server.
     */
    public static final String URL = "ws://localhost:8597";

    /**
     * The Thymio model.
     */
    private Thymio thymio;

    /**
     * Constructor of the ThymioService class.
     * 
     * @param thymio
     *            The Thymio model.
     * @throws URISyntaxException
     *             If the URI is not valid.
     */
    public ThymioService(Thymio thymio) throws URISyntaxException {
        super(new URI(URL));
        this.thymio = thymio;
    }

    /**
     * Constructor of the ThymioService class.
     * 
     * @param thymio
     *            The Thymio model.
     * @param url
     *            The URL of the Thymio Java Connect server.
     * @throws URISyntaxException
     *             If the URI is not valid.
     */
    public ThymioService(Thymio thymio, String url) throws URISyntaxException {
        super(new URI(url));
        this.thymio = thymio;
    }

    /**
     * Event when the connection is opened.
     */
    @Override
    public void onOpen(ServerHandshake handshakedata) {
        System.out.println("Opened connection");
        System.out.println("Status code: " + handshakedata.getHttpStatus());
        System.out.println("Status message: " + handshakedata.getHttpStatusMessage());
    }

    /**
     * Event when a message is received.
     */
    @Override
    public void onMessage(String message) {
        System.out.println("Received message: " + message);
    }

    /**
     * Event when a message is received.
     */
    @Override
    public void onMessage(ByteBuffer bytes) {
        //System.out.println("Received message: " + bytes.toString());
        Message msg = Message.getRootAsMessage(bytes);
        System.out.println("> Message type: " + AnyMessage.name(msg.messageType()));
        switch (msg.messageType()) {
            case AnyMessage.ConnectionHandshake:
                System.out.println("ConnectionHandshake");
                break;
            case AnyMessage.RequestCompleted:
                System.out.println("RequestCompleted");
                RequestCompleted requestCompleted = (RequestCompleted) msg.message(new RequestCompleted());
                System.out.println("Request ID : " + requestCompleted.requestId());
                break;
            case AnyMessage.NodesChanged:
                System.out.println("NodesChanged");
                NodesChanged nodesChanged = (NodesChanged) msg.message(msg.message(new NodesChanged()));
                ;
                System.out.println("Number node : " + nodesChanged.nodesLength());
                for (int i = 0; i < nodesChanged.nodesLength(); i++) {
                    Node node = nodesChanged.nodes(i);
                    System.out.println("===============");
                    System.out.println("Node name: " + node.name());
                    System.out.println("Node status: " + NodeStatus.name(node.status()));
                    System.out.println("Node fwVersion: " + node.fwVersion());
                    System.out.println("Node type: " + node.type());
                    System.out.println("Node NodeId: " + node.nodeId());
                    System.out.println("===============");
                    synchronized (thymio) {
                        thymio.setThymioNode(node);
                        thymio.notify();
                    }
                    break;
                }
                break;
            case AnyMessage.LockNode:
                System.out.println("LockNode");
                break;
            case AnyMessage.CompileAndLoadCodeOnVM:
                System.out.println("CompileAndLoadCodeOnVM");
                break;
            case AnyMessage.Ping:
                System.out.println("Ping");
                break;
            case AnyMessage.Error:
                mobsya.fb.Error error = (mobsya.fb.Error) msg.message(new mobsya.fb.Error());
                System.out.println("!!!!!!! Error: " + ErrorType.names[error.error()]);
                break;
            case AnyMessage.RequestListOfNodes:
                System.out.println("RequestListOfNodes");
                break;
            case AnyMessage.CompilationResultSuccess:
                System.out.println("CompilationResultSuccess");
                break;
            default:
                System.out.println("Unknown message type " + msg.messageType());
                break;
        }
    }

    /**
     * Event when the connection is closed.
     */
    @Override
    public void onClose(int code, String reason, boolean remote) {
        
        System.out.println("Closed connection");
        System.out.println("Code: " + code);
        System.out.println("Reason: " + reason);
        System.out.println("Remote: " + remote);
    }

    /**
     * Event when an error occurs.
     */
    @Override
    public void onError(Exception ex) {
        System.out.println("Error");
        ex.printStackTrace();
    }



}
