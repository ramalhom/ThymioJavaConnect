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
public final class RequestCompleted extends Table {
  public static void ValidateVersion() { Constants.FLATBUFFERS_23_5_26(); }
  public static RequestCompleted getRootAsRequestCompleted(ByteBuffer _bb) { return getRootAsRequestCompleted(_bb, new RequestCompleted()); }
  public static RequestCompleted getRootAsRequestCompleted(ByteBuffer _bb, RequestCompleted obj) { _bb.order(ByteOrder.LITTLE_ENDIAN); return (obj.__assign(_bb.getInt(_bb.position()) + _bb.position(), _bb)); }
  public void __init(int _i, ByteBuffer _bb) { __reset(_i, _bb); }
  public RequestCompleted __assign(int _i, ByteBuffer _bb) { __init(_i, _bb); return this; }

  public long requestId() { int o = __offset(4); return o != 0 ? (long)bb.getInt(o + bb_pos) & 0xFFFFFFFFL : 0L; }

  public static int createRequestCompleted(FlatBufferBuilder builder,
      long requestId) {
    builder.startTable(1);
    RequestCompleted.addRequestId(builder, requestId);
    return RequestCompleted.endRequestCompleted(builder);
  }

  public static void startRequestCompleted(FlatBufferBuilder builder) { builder.startTable(1); }
  public static void addRequestId(FlatBufferBuilder builder, long requestId) { builder.addInt(0, (int) requestId, (int) 0L); }
  public static int endRequestCompleted(FlatBufferBuilder builder) {
    int o = builder.endTable();
    return o;
  }

  public static final class Vector extends BaseVector {
    public Vector __assign(int _vector, int _element_size, ByteBuffer _bb) { __reset(_vector, _element_size, _bb); return this; }

    public RequestCompleted get(int j) { return get(new RequestCompleted(), j); }
    public RequestCompleted get(RequestCompleted obj, int j) {  return obj.__assign(__indirect(__element(j), bb), bb); }
  }
}

