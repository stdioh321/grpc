// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: contrato.proto

package generated;

public final class UserProtos {
  private UserProtos() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_proto_LoginRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_proto_LoginRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_proto_APIResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_proto_APIResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_proto_Empty_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_proto_Empty_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\016contrato.proto\022\005proto\"2\n\014LoginRequest\022" +
      "\020\n\010username\030\001 \001(\t\022\020\n\010password\030\002 \001(\t\"<\n\013A" +
      "PIResponse\022\027\n\017responseMessage\030\001 \001(\t\022\024\n\014r" +
      "esponseCode\030\002 \001(\005\"\007\n\005Empty2d\n\004user\0220\n\005lo" +
      "gin\022\023.proto.LoginRequest\032\022.proto.APIResp" +
      "onse\022*\n\006logout\022\014.proto.Empty\032\022.proto.API" +
      "ResponseB\031\n\tgeneratedB\nUserProtosP\001b\006pro" +
      "to3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_proto_LoginRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_proto_LoginRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_proto_LoginRequest_descriptor,
        new java.lang.String[] { "Username", "Password", });
    internal_static_proto_APIResponse_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_proto_APIResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_proto_APIResponse_descriptor,
        new java.lang.String[] { "ResponseMessage", "ResponseCode", });
    internal_static_proto_Empty_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_proto_Empty_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_proto_Empty_descriptor,
        new java.lang.String[] { });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
