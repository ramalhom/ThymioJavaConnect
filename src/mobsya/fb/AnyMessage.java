// automatically generated by the FlatBuffers compiler, do not modify

package mobsya.fb;

@SuppressWarnings("unused")
public final class AnyMessage {
  private AnyMessage() { }
  public static final byte NONE = 0;
  public static final byte ConnectionHandshake = 1;
  public static final byte DeviceManagerShutdownRequest = 2;
  public static final byte RequestListOfNodes = 3;
  public static final byte RequestNodeAsebaVMDescription = 4;
  public static final byte LockNode = 5;
  public static final byte UnlockNode = 6;
  public static final byte RenameNode = 7;
  public static final byte CompileAndLoadCodeOnVM = 8;
  public static final byte NodesChanged = 9;
  public static final byte NodeAsebaVMDescription = 10;
  public static final byte RequestCompleted = 11;
  public static final byte Error = 12;
  public static final byte CompilationResultFailure = 13;
  public static final byte CompilationResultSuccess = 14;
  public static final byte WatchNode = 15;
  public static final byte VariablesChanged = 16;
  public static final byte SetVariables = 17;
  public static final byte EventsDescriptionsChanged = 18;
  public static final byte RegisterEvents = 19;
  public static final byte SendEvents = 20;
  public static final byte EventsEmitted = 21;
  public static final byte SetBreakpoints = 22;
  public static final byte SetBreakpointsResponse = 23;
  public static final byte SetVMExecutionState = 24;
  public static final byte VMExecutionStateChanged = 25;
  public static final byte ScratchpadUpdate = 26;
  public static final byte FirmwareUpgradeRequest = 27;
  public static final byte FirmwareUpgradeStatus = 28;
  public static final byte Ping = 29;
  public static final byte EnableThymio2PairingMode = 30;
  public static final byte Thymio2WirelessDonglesChanged = 31;
  public static final byte Thymio2WirelessDonglePairingRequest = 32;
  public static final byte Thymio2WirelessDonglePairingResponse = 33;
  public static final byte CompileAndSave = 34;
  public static final byte SaveBytecode = 35;

  public static final String[] names = { "NONE", "ConnectionHandshake", "DeviceManagerShutdownRequest", "RequestListOfNodes", "RequestNodeAsebaVMDescription", "LockNode", "UnlockNode", "RenameNode", "CompileAndLoadCodeOnVM", "NodesChanged", "NodeAsebaVMDescription", "RequestCompleted", "Error", "CompilationResultFailure", "CompilationResultSuccess", "WatchNode", "VariablesChanged", "SetVariables", "EventsDescriptionsChanged", "RegisterEvents", "SendEvents", "EventsEmitted", "SetBreakpoints", "SetBreakpointsResponse", "SetVMExecutionState", "VMExecutionStateChanged", "ScratchpadUpdate", "FirmwareUpgradeRequest", "FirmwareUpgradeStatus", "Ping", "EnableThymio2PairingMode", "Thymio2WirelessDonglesChanged", "Thymio2WirelessDonglePairingRequest", "Thymio2WirelessDonglePairingResponse", "CompileAndSave", "SaveBytecode", };

  public static String name(int e) { return names[e]; }
}

