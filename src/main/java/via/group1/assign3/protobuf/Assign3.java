// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: assign3.proto

package via.group1.assign3.protobuf;

public final class Assign3 {
  private Assign3() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_ProductId_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_ProductId_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_AnimalId_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_AnimalId_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_InvolvedAnimals_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_InvolvedAnimals_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_InvolvedProducts_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_InvolvedProducts_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\rassign3.proto\" \n\tProductId\022\023\n\013idOfProd" +
      "uct\030\001 \001(\005\"\036\n\010AnimalId\022\022\n\nidOfAnimal\030\001 \001(" +
      "\005\"%\n\017InvolvedAnimals\022\022\n\nidOfAnimal\030\001 \003(\005" +
      "\"\'\n\020InvolvedProducts\022\023\n\013idOfProduct\030\001 \003(" +
      "\0052s\n\016Slaughterhouse\022/\n\017retrieveRegNums\022\n" +
      ".ProductId\032\020.InvolvedAnimals\0220\n\020retrieve" +
      "ProdNums\022\t.AnimalId\032\021.InvolvedProductsB\037" +
      "\n\033via.group1.assign3.protobufP\001b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_ProductId_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_ProductId_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_ProductId_descriptor,
        new java.lang.String[] { "IdOfProduct", });
    internal_static_AnimalId_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_AnimalId_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_AnimalId_descriptor,
        new java.lang.String[] { "IdOfAnimal", });
    internal_static_InvolvedAnimals_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_InvolvedAnimals_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_InvolvedAnimals_descriptor,
        new java.lang.String[] { "IdOfAnimal", });
    internal_static_InvolvedProducts_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_InvolvedProducts_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_InvolvedProducts_descriptor,
        new java.lang.String[] { "IdOfProduct", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
