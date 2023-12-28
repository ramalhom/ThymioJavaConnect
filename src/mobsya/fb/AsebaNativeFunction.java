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
public final class AsebaNativeFunction extends Table {
  public static void ValidateVersion() { Constants.FLATBUFFERS_23_5_26(); }
  public static AsebaNativeFunction getRootAsAsebaNativeFunction(ByteBuffer _bb) { return getRootAsAsebaNativeFunction(_bb, new AsebaNativeFunction()); }
  public static AsebaNativeFunction getRootAsAsebaNativeFunction(ByteBuffer _bb, AsebaNativeFunction obj) { _bb.order(ByteOrder.LITTLE_ENDIAN); return (obj.__assign(_bb.getInt(_bb.position()) + _bb.position(), _bb)); }
  public void __init(int _i, ByteBuffer _bb) { __reset(_i, _bb); }
  public AsebaNativeFunction __assign(int _i, ByteBuffer _bb) { __init(_i, _bb); return this; }

  public int index() { int o = __offset(4); return o != 0 ? bb.getShort(o + bb_pos) & 0xFFFF : 0; }
  public String name() { int o = __offset(6); return o != 0 ? __string(o + bb_pos) : null; }
  public ByteBuffer nameAsByteBuffer() { return __vector_as_bytebuffer(6, 1); }
  public ByteBuffer nameInByteBuffer(ByteBuffer _bb) { return __vector_in_bytebuffer(_bb, 6, 1); }
  public String description() { int o = __offset(8); return o != 0 ? __string(o + bb_pos) : null; }
  public ByteBuffer descriptionAsByteBuffer() { return __vector_as_bytebuffer(8, 1); }
  public ByteBuffer descriptionInByteBuffer(ByteBuffer _bb) { return __vector_in_bytebuffer(_bb, 8, 1); }
  public mobsya.fb.AsebaNativeFunctionParameter parameters(int j) { return parameters(new mobsya.fb.AsebaNativeFunctionParameter(), j); }
  public mobsya.fb.AsebaNativeFunctionParameter parameters(mobsya.fb.AsebaNativeFunctionParameter obj, int j) { int o = __offset(10); return o != 0 ? obj.__assign(__indirect(__vector(o) + j * 4), bb) : null; }
  public int parametersLength() { int o = __offset(10); return o != 0 ? __vector_len(o) : 0; }
  public mobsya.fb.AsebaNativeFunctionParameter.Vector parametersVector() { return parametersVector(new mobsya.fb.AsebaNativeFunctionParameter.Vector()); }
  public mobsya.fb.AsebaNativeFunctionParameter.Vector parametersVector(mobsya.fb.AsebaNativeFunctionParameter.Vector obj) { int o = __offset(10); return o != 0 ? obj.__assign(__vector(o), 4, bb) : null; }

  public static int createAsebaNativeFunction(FlatBufferBuilder builder,
      int index,
      int nameOffset,
      int descriptionOffset,
      int parametersOffset) {
    builder.startTable(4);
    AsebaNativeFunction.addParameters(builder, parametersOffset);
    AsebaNativeFunction.addDescription(builder, descriptionOffset);
    AsebaNativeFunction.addName(builder, nameOffset);
    AsebaNativeFunction.addIndex(builder, index);
    return AsebaNativeFunction.endAsebaNativeFunction(builder);
  }

  public static void startAsebaNativeFunction(FlatBufferBuilder builder) { builder.startTable(4); }
  public static void addIndex(FlatBufferBuilder builder, int index) { builder.addShort(0, (short) index, (short) 0); }
  public static void addName(FlatBufferBuilder builder, int nameOffset) { builder.addOffset(1, nameOffset, 0); }
  public static void addDescription(FlatBufferBuilder builder, int descriptionOffset) { builder.addOffset(2, descriptionOffset, 0); }
  public static void addParameters(FlatBufferBuilder builder, int parametersOffset) { builder.addOffset(3, parametersOffset, 0); }
  public static int createParametersVector(FlatBufferBuilder builder, int[] data) { builder.startVector(4, data.length, 4); for (int i = data.length - 1; i >= 0; i--) builder.addOffset(data[i]); return builder.endVector(); }
  public static void startParametersVector(FlatBufferBuilder builder, int numElems) { builder.startVector(4, numElems, 4); }
  public static int endAsebaNativeFunction(FlatBufferBuilder builder) {
    int o = builder.endTable();
    return o;
  }

  public static final class Vector extends BaseVector {
    public Vector __assign(int _vector, int _element_size, ByteBuffer _bb) { __reset(_vector, _element_size, _bb); return this; }

    public AsebaNativeFunction get(int j) { return get(new AsebaNativeFunction(), j); }
    public AsebaNativeFunction get(AsebaNativeFunction obj, int j) {  return obj.__assign(__indirect(__element(j), bb), bb); }
  }
}
