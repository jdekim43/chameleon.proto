package injective.stream.v1beta1;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * ChainStream defines the gRPC streaming service.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.54.0)",
    comments = "Source: injective/stream/v1beta1/query.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class StreamGrpc {

  private StreamGrpc() {}

  public static final String SERVICE_NAME = "injective.stream.v1beta1.Stream";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<injective.stream.v1beta1.Query.StreamRequest,
      injective.stream.v1beta1.Query.StreamResponse> getStreamMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Stream",
      requestType = injective.stream.v1beta1.Query.StreamRequest.class,
      responseType = injective.stream.v1beta1.Query.StreamResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<injective.stream.v1beta1.Query.StreamRequest,
      injective.stream.v1beta1.Query.StreamResponse> getStreamMethod() {
    io.grpc.MethodDescriptor<injective.stream.v1beta1.Query.StreamRequest, injective.stream.v1beta1.Query.StreamResponse> getStreamMethod;
    if ((getStreamMethod = StreamGrpc.getStreamMethod) == null) {
      synchronized (StreamGrpc.class) {
        if ((getStreamMethod = StreamGrpc.getStreamMethod) == null) {
          StreamGrpc.getStreamMethod = getStreamMethod =
              io.grpc.MethodDescriptor.<injective.stream.v1beta1.Query.StreamRequest, injective.stream.v1beta1.Query.StreamResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Stream"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  injective.stream.v1beta1.Query.StreamRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  injective.stream.v1beta1.Query.StreamResponse.getDefaultInstance()))
              .setSchemaDescriptor(new StreamMethodDescriptorSupplier("Stream"))
              .build();
        }
      }
    }
    return getStreamMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static StreamStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<StreamStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<StreamStub>() {
        @java.lang.Override
        public StreamStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new StreamStub(channel, callOptions);
        }
      };
    return StreamStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static StreamBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<StreamBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<StreamBlockingStub>() {
        @java.lang.Override
        public StreamBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new StreamBlockingStub(channel, callOptions);
        }
      };
    return StreamBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static StreamFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<StreamFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<StreamFutureStub>() {
        @java.lang.Override
        public StreamFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new StreamFutureStub(channel, callOptions);
        }
      };
    return StreamFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * ChainStream defines the gRPC streaming service.
   * </pre>
   */
  public interface AsyncService {

    /**
     */
    default void stream(injective.stream.v1beta1.Query.StreamRequest request,
        io.grpc.stub.StreamObserver<injective.stream.v1beta1.Query.StreamResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getStreamMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service Stream.
   * <pre>
   * ChainStream defines the gRPC streaming service.
   * </pre>
   */
  public static abstract class StreamImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return StreamGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service Stream.
   * <pre>
   * ChainStream defines the gRPC streaming service.
   * </pre>
   */
  public static final class StreamStub
      extends io.grpc.stub.AbstractAsyncStub<StreamStub> {
    private StreamStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected StreamStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new StreamStub(channel, callOptions);
    }

    /**
     */
    public void stream(injective.stream.v1beta1.Query.StreamRequest request,
        io.grpc.stub.StreamObserver<injective.stream.v1beta1.Query.StreamResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncServerStreamingCall(
          getChannel().newCall(getStreamMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service Stream.
   * <pre>
   * ChainStream defines the gRPC streaming service.
   * </pre>
   */
  public static final class StreamBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<StreamBlockingStub> {
    private StreamBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected StreamBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new StreamBlockingStub(channel, callOptions);
    }

    /**
     */
    public java.util.Iterator<injective.stream.v1beta1.Query.StreamResponse> stream(
        injective.stream.v1beta1.Query.StreamRequest request) {
      return io.grpc.stub.ClientCalls.blockingServerStreamingCall(
          getChannel(), getStreamMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service Stream.
   * <pre>
   * ChainStream defines the gRPC streaming service.
   * </pre>
   */
  public static final class StreamFutureStub
      extends io.grpc.stub.AbstractFutureStub<StreamFutureStub> {
    private StreamFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected StreamFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new StreamFutureStub(channel, callOptions);
    }
  }

  private static final int METHODID_STREAM = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final AsyncService serviceImpl;
    private final int methodId;

    MethodHandlers(AsyncService serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_STREAM:
          serviceImpl.stream((injective.stream.v1beta1.Query.StreamRequest) request,
              (io.grpc.stub.StreamObserver<injective.stream.v1beta1.Query.StreamResponse>) responseObserver);
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

  public static final io.grpc.ServerServiceDefinition bindService(AsyncService service) {
    return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
        .addMethod(
          getStreamMethod(),
          io.grpc.stub.ServerCalls.asyncServerStreamingCall(
            new MethodHandlers<
              injective.stream.v1beta1.Query.StreamRequest,
              injective.stream.v1beta1.Query.StreamResponse>(
                service, METHODID_STREAM)))
        .build();
  }

  private static abstract class StreamBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    StreamBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return injective.stream.v1beta1.Query.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("Stream");
    }
  }

  private static final class StreamFileDescriptorSupplier
      extends StreamBaseDescriptorSupplier {
    StreamFileDescriptorSupplier() {}
  }

  private static final class StreamMethodDescriptorSupplier
      extends StreamBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    StreamMethodDescriptorSupplier(String methodName) {
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
      synchronized (StreamGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new StreamFileDescriptorSupplier())
              .addMethod(getStreamMethod())
              .build();
        }
      }
    }
    return result;
  }
}
