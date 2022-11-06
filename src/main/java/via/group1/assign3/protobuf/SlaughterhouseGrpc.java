package via.group1.assign3.protobuf;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.39.0)",
    comments = "Source: assign3.proto")
public final class SlaughterhouseGrpc {

  private SlaughterhouseGrpc() {}

  public static final String SERVICE_NAME = "Slaughterhouse";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<via.group1.assign3.protobuf.ProductId,
      via.group1.assign3.protobuf.InvolvedAnimals> getRetrieveRegNumsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "retrieveRegNums",
      requestType = via.group1.assign3.protobuf.ProductId.class,
      responseType = via.group1.assign3.protobuf.InvolvedAnimals.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<via.group1.assign3.protobuf.ProductId,
      via.group1.assign3.protobuf.InvolvedAnimals> getRetrieveRegNumsMethod() {
    io.grpc.MethodDescriptor<via.group1.assign3.protobuf.ProductId, via.group1.assign3.protobuf.InvolvedAnimals> getRetrieveRegNumsMethod;
    if ((getRetrieveRegNumsMethod = SlaughterhouseGrpc.getRetrieveRegNumsMethod) == null) {
      synchronized (SlaughterhouseGrpc.class) {
        if ((getRetrieveRegNumsMethod = SlaughterhouseGrpc.getRetrieveRegNumsMethod) == null) {
          SlaughterhouseGrpc.getRetrieveRegNumsMethod = getRetrieveRegNumsMethod =
              io.grpc.MethodDescriptor.<via.group1.assign3.protobuf.ProductId, via.group1.assign3.protobuf.InvolvedAnimals>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "retrieveRegNums"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  via.group1.assign3.protobuf.ProductId.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  via.group1.assign3.protobuf.InvolvedAnimals.getDefaultInstance()))
              .setSchemaDescriptor(new SlaughterhouseMethodDescriptorSupplier("retrieveRegNums"))
              .build();
        }
      }
    }
    return getRetrieveRegNumsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<via.group1.assign3.protobuf.AnimalId,
      via.group1.assign3.protobuf.InvolvedProducts> getRetrieveProdNumsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "retrieveProdNums",
      requestType = via.group1.assign3.protobuf.AnimalId.class,
      responseType = via.group1.assign3.protobuf.InvolvedProducts.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<via.group1.assign3.protobuf.AnimalId,
      via.group1.assign3.protobuf.InvolvedProducts> getRetrieveProdNumsMethod() {
    io.grpc.MethodDescriptor<via.group1.assign3.protobuf.AnimalId, via.group1.assign3.protobuf.InvolvedProducts> getRetrieveProdNumsMethod;
    if ((getRetrieveProdNumsMethod = SlaughterhouseGrpc.getRetrieveProdNumsMethod) == null) {
      synchronized (SlaughterhouseGrpc.class) {
        if ((getRetrieveProdNumsMethod = SlaughterhouseGrpc.getRetrieveProdNumsMethod) == null) {
          SlaughterhouseGrpc.getRetrieveProdNumsMethod = getRetrieveProdNumsMethod =
              io.grpc.MethodDescriptor.<via.group1.assign3.protobuf.AnimalId, via.group1.assign3.protobuf.InvolvedProducts>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "retrieveProdNums"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  via.group1.assign3.protobuf.AnimalId.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  via.group1.assign3.protobuf.InvolvedProducts.getDefaultInstance()))
              .setSchemaDescriptor(new SlaughterhouseMethodDescriptorSupplier("retrieveProdNums"))
              .build();
        }
      }
    }
    return getRetrieveProdNumsMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static SlaughterhouseStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<SlaughterhouseStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<SlaughterhouseStub>() {
        @java.lang.Override
        public SlaughterhouseStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new SlaughterhouseStub(channel, callOptions);
        }
      };
    return SlaughterhouseStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static SlaughterhouseBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<SlaughterhouseBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<SlaughterhouseBlockingStub>() {
        @java.lang.Override
        public SlaughterhouseBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new SlaughterhouseBlockingStub(channel, callOptions);
        }
      };
    return SlaughterhouseBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static SlaughterhouseFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<SlaughterhouseFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<SlaughterhouseFutureStub>() {
        @java.lang.Override
        public SlaughterhouseFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new SlaughterhouseFutureStub(channel, callOptions);
        }
      };
    return SlaughterhouseFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class SlaughterhouseImplBase implements io.grpc.BindableService {

    /**
     */
    public void retrieveRegNums(via.group1.assign3.protobuf.ProductId request,
        io.grpc.stub.StreamObserver<via.group1.assign3.protobuf.InvolvedAnimals> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getRetrieveRegNumsMethod(), responseObserver);
    }

    /**
     */
    public void retrieveProdNums(via.group1.assign3.protobuf.AnimalId request,
        io.grpc.stub.StreamObserver<via.group1.assign3.protobuf.InvolvedProducts> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getRetrieveProdNumsMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getRetrieveRegNumsMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                via.group1.assign3.protobuf.ProductId,
                via.group1.assign3.protobuf.InvolvedAnimals>(
                  this, METHODID_RETRIEVE_REG_NUMS)))
          .addMethod(
            getRetrieveProdNumsMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                via.group1.assign3.protobuf.AnimalId,
                via.group1.assign3.protobuf.InvolvedProducts>(
                  this, METHODID_RETRIEVE_PROD_NUMS)))
          .build();
    }
  }

  /**
   */
  public static final class SlaughterhouseStub extends io.grpc.stub.AbstractAsyncStub<SlaughterhouseStub> {
    private SlaughterhouseStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SlaughterhouseStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new SlaughterhouseStub(channel, callOptions);
    }

    /**
     */
    public void retrieveRegNums(via.group1.assign3.protobuf.ProductId request,
        io.grpc.stub.StreamObserver<via.group1.assign3.protobuf.InvolvedAnimals> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getRetrieveRegNumsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void retrieveProdNums(via.group1.assign3.protobuf.AnimalId request,
        io.grpc.stub.StreamObserver<via.group1.assign3.protobuf.InvolvedProducts> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getRetrieveProdNumsMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class SlaughterhouseBlockingStub extends io.grpc.stub.AbstractBlockingStub<SlaughterhouseBlockingStub> {
    private SlaughterhouseBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SlaughterhouseBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new SlaughterhouseBlockingStub(channel, callOptions);
    }

    /**
     */
    public via.group1.assign3.protobuf.InvolvedAnimals retrieveRegNums(via.group1.assign3.protobuf.ProductId request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getRetrieveRegNumsMethod(), getCallOptions(), request);
    }

    /**
     */
    public via.group1.assign3.protobuf.InvolvedProducts retrieveProdNums(via.group1.assign3.protobuf.AnimalId request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getRetrieveProdNumsMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class SlaughterhouseFutureStub extends io.grpc.stub.AbstractFutureStub<SlaughterhouseFutureStub> {
    private SlaughterhouseFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SlaughterhouseFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new SlaughterhouseFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<via.group1.assign3.protobuf.InvolvedAnimals> retrieveRegNums(
        via.group1.assign3.protobuf.ProductId request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getRetrieveRegNumsMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<via.group1.assign3.protobuf.InvolvedProducts> retrieveProdNums(
        via.group1.assign3.protobuf.AnimalId request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getRetrieveProdNumsMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_RETRIEVE_REG_NUMS = 0;
  private static final int METHODID_RETRIEVE_PROD_NUMS = 1;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final SlaughterhouseImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(SlaughterhouseImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_RETRIEVE_REG_NUMS:
          serviceImpl.retrieveRegNums((via.group1.assign3.protobuf.ProductId) request,
              (io.grpc.stub.StreamObserver<via.group1.assign3.protobuf.InvolvedAnimals>) responseObserver);
          break;
        case METHODID_RETRIEVE_PROD_NUMS:
          serviceImpl.retrieveProdNums((via.group1.assign3.protobuf.AnimalId) request,
              (io.grpc.stub.StreamObserver<via.group1.assign3.protobuf.InvolvedProducts>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class SlaughterhouseBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    SlaughterhouseBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return via.group1.assign3.protobuf.Assign3.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("Slaughterhouse");
    }
  }

  private static final class SlaughterhouseFileDescriptorSupplier
      extends SlaughterhouseBaseDescriptorSupplier {
    SlaughterhouseFileDescriptorSupplier() {}
  }

  private static final class SlaughterhouseMethodDescriptorSupplier
      extends SlaughterhouseBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    SlaughterhouseMethodDescriptorSupplier(String methodName) {
      this.methodName = methodName;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (SlaughterhouseGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new SlaughterhouseFileDescriptorSupplier())
              .addMethod(getRetrieveRegNumsMethod())
              .addMethod(getRetrieveProdNumsMethod())
              .build();
        }
      }
    }
    return result;
  }
}
