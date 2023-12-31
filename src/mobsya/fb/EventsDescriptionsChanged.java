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
public final class EventsDescriptionsChanged extends Table {
  public static void ValidateVersion() { Constants.FLATBUFFERS_23_5_26(); }
  public static EventsDescriptionsChanged getRootAsEventsDescriptionsChanged(ByteBuffer _bb) { return getRootAsEventsDescriptionsChanged(_bb, new EventsDescriptionsChanged()); }
  public static EventsDescriptionsChanged getRootAsEventsDescriptionsChanged(ByteBuffer _bb, EventsDescriptionsChanged obj) { _bb.order(ByteOrder.LITTLE_ENDIAN); return (obj.__assign(_bb.getInt(_bb.position()) + _bb.position(), _bb)); }
  public void __init(int _i, ByteBuffer _bb) { __reset(_i, _bb); }
  public EventsDescriptionsChanged __assign(int _i, ByteBuffer _bb) { __init(_i, _bb); return this; }

  public mobsya.fb.NodeId nodeOrGroupId() { return nodeOrGroupId(new mobsya.fb.NodeId()); }
  public mobsya.fb.NodeId nodeOrGroupId(mobsya.fb.NodeId obj) { int o = __offset(4); return o != 0 ? obj.__assign(__indirect(o + bb_pos), bb) : null; }
  public mobsya.fb.EventDescription events(int j) { return events(new mobsya.fb.EventDescription(), j); }
  public mobsya.fb.EventDescription events(mobsya.fb.EventDescription obj, int j) { int o = __offset(6); return o != 0 ? obj.__assign(__indirect(__vector(o) + j * 4), bb) : null; }
  public int eventsLength() { int o = __offset(6); return o != 0 ? __vector_len(o) : 0; }
  public mobsya.fb.EventDescription.Vector eventsVector() { return eventsVector(new mobsya.fb.EventDescription.Vector()); }
  public mobsya.fb.EventDescription.Vector eventsVector(mobsya.fb.EventDescription.Vector obj) { int o = __offset(6); return o != 0 ? obj.__assign(__vector(o), 4, bb) : null; }

  public static int createEventsDescriptionsChanged(FlatBufferBuilder builder,
      int nodeOrGroupIdOffset,
      int eventsOffset) {
    builder.startTable(2);
    EventsDescriptionsChanged.addEvents(builder, eventsOffset);
    EventsDescriptionsChanged.addNodeOrGroupId(builder, nodeOrGroupIdOffset);
    return EventsDescriptionsChanged.endEventsDescriptionsChanged(builder);
  }

  public static void startEventsDescriptionsChanged(FlatBufferBuilder builder) { builder.startTable(2); }
  public static void addNodeOrGroupId(FlatBufferBuilder builder, int nodeOrGroupIdOffset) { builder.addOffset(0, nodeOrGroupIdOffset, 0); }
  public static void addEvents(FlatBufferBuilder builder, int eventsOffset) { builder.addOffset(1, eventsOffset, 0); }
  public static int createEventsVector(FlatBufferBuilder builder, int[] data) { builder.startVector(4, data.length, 4); for (int i = data.length - 1; i >= 0; i--) builder.addOffset(data[i]); return builder.endVector(); }
  public static void startEventsVector(FlatBufferBuilder builder, int numElems) { builder.startVector(4, numElems, 4); }
  public static int endEventsDescriptionsChanged(FlatBufferBuilder builder) {
    int o = builder.endTable();
    return o;
  }

  public static final class Vector extends BaseVector {
    public Vector __assign(int _vector, int _element_size, ByteBuffer _bb) { __reset(_vector, _element_size, _bb); return this; }

    public EventsDescriptionsChanged get(int j) { return get(new EventsDescriptionsChanged(), j); }
    public EventsDescriptionsChanged get(EventsDescriptionsChanged obj, int j) {  return obj.__assign(__indirect(__element(j), bb), bb); }
  }
}

