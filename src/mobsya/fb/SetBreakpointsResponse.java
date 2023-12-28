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
public final class SetBreakpointsResponse extends Table {
  public static void ValidateVersion() { Constants.FLATBUFFERS_23_5_26(); }
  public static SetBreakpointsResponse getRootAsSetBreakpointsResponse(ByteBuffer _bb) { return getRootAsSetBreakpointsResponse(_bb, new SetBreakpointsResponse()); }
  public static SetBreakpointsResponse getRootAsSetBreakpointsResponse(ByteBuffer _bb, SetBreakpointsResponse obj) { _bb.order(ByteOrder.LITTLE_ENDIAN); return (obj.__assign(_bb.getInt(_bb.position()) + _bb.position(), _bb)); }
  public void __init(int _i, ByteBuffer _bb) { __reset(_i, _bb); }
  public SetBreakpointsResponse __assign(int _i, ByteBuffer _bb) { __init(_i, _bb); return this; }

  public long requestId() { int o = __offset(4); return o != 0 ? (long)bb.getInt(o + bb_pos) & 0xFFFFFFFFL : 0L; }
  public int error() { int o = __offset(6); return o != 0 ? bb.getInt(o + bb_pos) : 0; }
  public mobsya.fb.Breakpoint breakpoints(int j) { return breakpoints(new mobsya.fb.Breakpoint(), j); }
  public mobsya.fb.Breakpoint breakpoints(mobsya.fb.Breakpoint obj, int j) { int o = __offset(8); return o != 0 ? obj.__assign(__indirect(__vector(o) + j * 4), bb) : null; }
  public int breakpointsLength() { int o = __offset(8); return o != 0 ? __vector_len(o) : 0; }
  public mobsya.fb.Breakpoint.Vector breakpointsVector() { return breakpointsVector(new mobsya.fb.Breakpoint.Vector()); }
  public mobsya.fb.Breakpoint.Vector breakpointsVector(mobsya.fb.Breakpoint.Vector obj) { int o = __offset(8); return o != 0 ? obj.__assign(__vector(o), 4, bb) : null; }

  public static int createSetBreakpointsResponse(FlatBufferBuilder builder,
      long requestId,
      int error,
      int breakpointsOffset) {
    builder.startTable(3);
    SetBreakpointsResponse.addBreakpoints(builder, breakpointsOffset);
    SetBreakpointsResponse.addError(builder, error);
    SetBreakpointsResponse.addRequestId(builder, requestId);
    return SetBreakpointsResponse.endSetBreakpointsResponse(builder);
  }

  public static void startSetBreakpointsResponse(FlatBufferBuilder builder) { builder.startTable(3); }
  public static void addRequestId(FlatBufferBuilder builder, long requestId) { builder.addInt(0, (int) requestId, (int) 0L); }
  public static void addError(FlatBufferBuilder builder, int error) { builder.addInt(1, error, 0); }
  public static void addBreakpoints(FlatBufferBuilder builder, int breakpointsOffset) { builder.addOffset(2, breakpointsOffset, 0); }
  public static int createBreakpointsVector(FlatBufferBuilder builder, int[] data) { builder.startVector(4, data.length, 4); for (int i = data.length - 1; i >= 0; i--) builder.addOffset(data[i]); return builder.endVector(); }
  public static void startBreakpointsVector(FlatBufferBuilder builder, int numElems) { builder.startVector(4, numElems, 4); }
  public static int endSetBreakpointsResponse(FlatBufferBuilder builder) {
    int o = builder.endTable();
    return o;
  }

  public static final class Vector extends BaseVector {
    public Vector __assign(int _vector, int _element_size, ByteBuffer _bb) { __reset(_vector, _element_size, _bb); return this; }

    public SetBreakpointsResponse get(int j) { return get(new SetBreakpointsResponse(), j); }
    public SetBreakpointsResponse get(SetBreakpointsResponse obj, int j) {  return obj.__assign(__indirect(__element(j), bb), bb); }
  }
}

