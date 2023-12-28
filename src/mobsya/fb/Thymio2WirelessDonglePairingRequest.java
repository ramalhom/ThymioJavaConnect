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

@SuppressWarnings("unused")
public final class Thymio2WirelessDonglePairingRequest extends Table {
  public static void ValidateVersion() { Constants.FLATBUFFERS_23_5_26(); }
  public static Thymio2WirelessDonglePairingRequest getRootAsThymio2WirelessDonglePairingRequest(ByteBuffer _bb) { return getRootAsThymio2WirelessDonglePairingRequest(_bb, new Thymio2WirelessDonglePairingRequest()); }
  public static Thymio2WirelessDonglePairingRequest getRootAsThymio2WirelessDonglePairingRequest(ByteBuffer _bb, Thymio2WirelessDonglePairingRequest obj) { _bb.order(ByteOrder.LITTLE_ENDIAN); return (obj.__assign(_bb.getInt(_bb.position()) + _bb.position(), _bb)); }
  public void __init(int _i, ByteBuffer _bb) { __reset(_i, _bb); }
  public Thymio2WirelessDonglePairingRequest __assign(int _i, ByteBuffer _bb) { __init(_i, _bb); return this; }

  public long requestId() { int o = __offset(4); return o != 0 ? (long)bb.getInt(o + bb_pos) & 0xFFFFFFFFL : 0L; }
  public mobsya.fb.NodeId dongleId() { return dongleId(new mobsya.fb.NodeId()); }
  public mobsya.fb.NodeId dongleId(mobsya.fb.NodeId obj) { int o = __offset(6); return o != 0 ? obj.__assign(__indirect(o + bb_pos), bb) : null; }
  public mobsya.fb.NodeId nodeId() { return nodeId(new mobsya.fb.NodeId()); }
  public mobsya.fb.NodeId nodeId(mobsya.fb.NodeId obj) { int o = __offset(8); return o != 0 ? obj.__assign(__indirect(o + bb_pos), bb) : null; }
  public int networkId() { int o = __offset(10); return o != 0 ? bb.getShort(o + bb_pos) & 0xFFFF : 0; }
  public int channelId() { int o = __offset(12); return o != 0 ? bb.get(o + bb_pos) & 0xFF : 0; }

  public static int createThymio2WirelessDonglePairingRequest(FlatBufferBuilder builder,
      long requestId,
      int dongleIdOffset,
      int nodeIdOffset,
      int networkId,
      int channelId) {
    builder.startTable(5);
    Thymio2WirelessDonglePairingRequest.addNodeId(builder, nodeIdOffset);
    Thymio2WirelessDonglePairingRequest.addDongleId(builder, dongleIdOffset);
    Thymio2WirelessDonglePairingRequest.addRequestId(builder, requestId);
    Thymio2WirelessDonglePairingRequest.addNetworkId(builder, networkId);
    Thymio2WirelessDonglePairingRequest.addChannelId(builder, channelId);
    return Thymio2WirelessDonglePairingRequest.endThymio2WirelessDonglePairingRequest(builder);
  }

  public static void startThymio2WirelessDonglePairingRequest(FlatBufferBuilder builder) { builder.startTable(5); }
  public static void addRequestId(FlatBufferBuilder builder, long requestId) { builder.addInt(0, (int) requestId, (int) 0L); }
  public static void addDongleId(FlatBufferBuilder builder, int dongleIdOffset) { builder.addOffset(1, dongleIdOffset, 0); }
  public static void addNodeId(FlatBufferBuilder builder, int nodeIdOffset) { builder.addOffset(2, nodeIdOffset, 0); }
  public static void addNetworkId(FlatBufferBuilder builder, int networkId) { builder.addShort(3, (short) networkId, (short) 0); }
  public static void addChannelId(FlatBufferBuilder builder, int channelId) { builder.addByte(4, (byte) channelId, (byte) 0); }
  public static int endThymio2WirelessDonglePairingRequest(FlatBufferBuilder builder) {
    int o = builder.endTable();
    return o;
  }

  public static final class Vector extends BaseVector {
    public Vector __assign(int _vector, int _element_size, ByteBuffer _bb) { __reset(_vector, _element_size, _bb); return this; }

    public Thymio2WirelessDonglePairingRequest get(int j) { return get(new Thymio2WirelessDonglePairingRequest(), j); }
    public Thymio2WirelessDonglePairingRequest get(Thymio2WirelessDonglePairingRequest obj, int j) {  return obj.__assign(__indirect(__element(j), bb), bb); }
  }
}
