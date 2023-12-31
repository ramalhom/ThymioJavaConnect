// automatically generated by the FlatBuffers compiler, do not modify

package mobsya.fb;

import com.google.flatbuffers.BaseVector;
import com.google.flatbuffers.BooleanVector;
import com.google.flatbuffers.ByteVector;
import com.google.flatbuffers.Constants;
import com.google.flatbuffers.DoubleVector;
import com.google.flatbuffers.FlatBufferBuilder;
import com.google.flatbuffers.FloatVector;
import com.google.flatbuffers.IntVector;
import com.google.flatbuffers.LongVector;
import com.google.flatbuffers.ShortVector;
import com.google.flatbuffers.StringVector;
import com.google.flatbuffers.Struct;
import com.google.flatbuffers.Table;
import com.google.flatbuffers.UnionVector;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/**
 * Represent a node
 */
@SuppressWarnings("unused")
public final class Node extends Table {
  public static void ValidateVersion() { Constants.FLATBUFFERS_23_5_26(); }
  public static Node getRootAsNode(ByteBuffer _bb) { return getRootAsNode(_bb, new Node()); }
  public static Node getRootAsNode(ByteBuffer _bb, Node obj) { _bb.order(ByteOrder.LITTLE_ENDIAN); return (obj.__assign(_bb.getInt(_bb.position()) + _bb.position(), _bb)); }
  public void __init(int _i, ByteBuffer _bb) { __reset(_i, _bb); }
  public Node __assign(int _i, ByteBuffer _bb) { __init(_i, _bb); return this; }

  public mobsya.fb.NodeId nodeId() { return nodeId(new mobsya.fb.NodeId()); }
  public mobsya.fb.NodeId nodeId(mobsya.fb.NodeId obj) { int o = __offset(4); return o != 0 ? obj.__assign(__indirect(o + bb_pos), bb) : null; }
  public mobsya.fb.NodeId groupId() { return groupId(new mobsya.fb.NodeId()); }
  public mobsya.fb.NodeId groupId(mobsya.fb.NodeId obj) { int o = __offset(6); return o != 0 ? obj.__assign(__indirect(o + bb_pos), bb) : null; }
  public int status() { int o = __offset(8); return o != 0 ? bb.getInt(o + bb_pos) : 0; }
  public int type() { int o = __offset(10); return o != 0 ? bb.getInt(o + bb_pos) : 0; }
  public String name() { int o = __offset(12); return o != 0 ? __string(o + bb_pos) : null; }
  public ByteBuffer nameAsByteBuffer() { return __vector_as_bytebuffer(12, 1); }
  public ByteBuffer nameInByteBuffer(ByteBuffer _bb) { return __vector_in_bytebuffer(_bb, 12, 1); }
  public long capabilities() { int o = __offset(14); return o != 0 ? bb.getLong(o + bb_pos) : 0L; }
  public String fwVersion() { int o = __offset(16); return o != 0 ? __string(o + bb_pos) : null; }
  public ByteBuffer fwVersionAsByteBuffer() { return __vector_as_bytebuffer(16, 1); }
  public ByteBuffer fwVersionInByteBuffer(ByteBuffer _bb) { return __vector_in_bytebuffer(_bb, 16, 1); }
  public String latestFwVersion() { int o = __offset(18); return o != 0 ? __string(o + bb_pos) : null; }
  public ByteBuffer latestFwVersionAsByteBuffer() { return __vector_as_bytebuffer(18, 1); }
  public ByteBuffer latestFwVersionInByteBuffer(ByteBuffer _bb) { return __vector_in_bytebuffer(_bb, 18, 1); }

  public static int createNode(FlatBufferBuilder builder,
      int nodeIdOffset,
      int groupIdOffset,
      int status,
      int type,
      int nameOffset,
      long capabilities,
      int fwVersionOffset,
      int latestFwVersionOffset) {
    builder.startTable(8);
    Node.addCapabilities(builder, capabilities);
    Node.addLatestFwVersion(builder, latestFwVersionOffset);
    Node.addFwVersion(builder, fwVersionOffset);
    Node.addName(builder, nameOffset);
    Node.addType(builder, type);
    Node.addStatus(builder, status);
    Node.addGroupId(builder, groupIdOffset);
    Node.addNodeId(builder, nodeIdOffset);
    return Node.endNode(builder);
  }

  public static void startNode(FlatBufferBuilder builder) { builder.startTable(8); }
  public static void addNodeId(FlatBufferBuilder builder, int nodeIdOffset) { builder.addOffset(0, nodeIdOffset, 0); }
  public static void addGroupId(FlatBufferBuilder builder, int groupIdOffset) { builder.addOffset(1, groupIdOffset, 0); }
  public static void addStatus(FlatBufferBuilder builder, int status) { builder.addInt(2, status, 0); }
  public static void addType(FlatBufferBuilder builder, int type) { builder.addInt(3, type, 0); }
  public static void addName(FlatBufferBuilder builder, int nameOffset) { builder.addOffset(4, nameOffset, 0); }
  public static void addCapabilities(FlatBufferBuilder builder, long capabilities) { builder.addLong(5, capabilities, 0L); }
  public static void addFwVersion(FlatBufferBuilder builder, int fwVersionOffset) { builder.addOffset(6, fwVersionOffset, 0); }
  public static void addLatestFwVersion(FlatBufferBuilder builder, int latestFwVersionOffset) { builder.addOffset(7, latestFwVersionOffset, 0); }
  public static int endNode(FlatBufferBuilder builder) {
    int o = builder.endTable();
    return o;
  }

  public static final class Vector extends BaseVector {
    public Vector __assign(int _vector, int _element_size, ByteBuffer _bb) { __reset(_vector, _element_size, _bb); return this; }

    public Node get(int j) { return get(new Node(), j); }
    public Node get(Node obj, int j) {  return obj.__assign(__indirect(__element(j), bb), bb); }
  }
}

