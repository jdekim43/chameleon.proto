package terra.market.v1beta1;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * Query defines the gRPC querier service.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.54.0)",
    comments = "Source: terra/market/v1beta1/query.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class QueryGrpc {

  private QueryGrpc() {}

  public static final String SERVICE_NAME = "terra.market.v1beta1.Query";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<terra.market.v1beta1.QueryOuterClass.QuerySwapRequest,
      terra.market.v1beta1.QueryOuterClass.QuerySwapResponse> getSwapMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Swap",
      requestType = terra.market.v1beta1.QueryOuterClass.QuerySwapRequest.class,
      responseType = terra.market.v1beta1.QueryOuterClass.QuerySwapResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<terra.market.v1beta1.QueryOuterClass.QuerySwapRequest,
      terra.market.v1beta1.QueryOuterClass.QuerySwapResponse> getSwapMethod() {
    io.grpc.MethodDescriptor<terra.market.v1beta1.QueryOuterClass.QuerySwapRequest, terra.market.v1beta1.QueryOuterClass.QuerySwapResponse> getSwapMethod;
    if ((getSwapMethod = QueryGrpc.getSwapMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getSwapMethod = QueryGrpc.getSwapMethod) == null) {
          QueryGrpc.getSwapMethod = getSwapMethod =
              io.grpc.MethodDescriptor.<terra.market.v1beta1.QueryOuterClass.QuerySwapRequest, terra.market.v1beta1.QueryOuterClass.QuerySwapResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Swap"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  terra.market.v1beta1.QueryOuterClass.QuerySwapRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  terra.market.v1beta1.QueryOuterClass.QuerySwapResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("Swap"))
              .build();
        }
      }
    }
    return getSwapMethod;
  }

  private static volatile io.grpc.MethodDescriptor<terra.market.v1beta1.QueryOuterClass.QueryTerraPoolDeltaRequest,
      terra.market.v1beta1.QueryOuterClass.QueryTerraPoolDeltaResponse> getTerraPoolDeltaMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "TerraPoolDelta",
      requestType = terra.market.v1beta1.QueryOuterClass.QueryTerraPoolDeltaRequest.class,
      responseType = terra.market.v1beta1.QueryOuterClass.QueryTerraPoolDeltaResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<terra.market.v1beta1.QueryOuterClass.QueryTerraPoolDeltaRequest,
      terra.market.v1beta1.QueryOuterClass.QueryTerraPoolDeltaResponse> getTerraPoolDeltaMethod() {
    io.grpc.MethodDescriptor<terra.market.v1beta1.QueryOuterClass.QueryTerraPoolDeltaRequest, terra.market.v1beta1.QueryOuterClass.QueryTerraPoolDeltaResponse> getTerraPoolDeltaMethod;
    if ((getTerraPoolDeltaMethod = QueryGrpc.getTerraPoolDeltaMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getTerraPoolDeltaMethod = QueryGrpc.getTerraPoolDeltaMethod) == null) {
          QueryGrpc.getTerraPoolDeltaMethod = getTerraPoolDeltaMethod =
              io.grpc.MethodDescriptor.<terra.market.v1beta1.QueryOuterClass.QueryTerraPoolDeltaRequest, terra.market.v1beta1.QueryOuterClass.QueryTerraPoolDeltaResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "TerraPoolDelta"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  terra.market.v1beta1.QueryOuterClass.QueryTerraPoolDeltaRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  terra.market.v1beta1.QueryOuterClass.QueryTerraPoolDeltaResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("TerraPoolDelta"))
              .build();
        }
      }
    }
    return getTerraPoolDeltaMethod;
  }

  private static volatile io.grpc.MethodDescriptor<terra.market.v1beta1.QueryOuterClass.QueryParamsRequest,
      terra.market.v1beta1.QueryOuterClass.QueryParamsResponse> getParamsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Params",
      requestType = terra.market.v1beta1.QueryOuterClass.QueryParamsRequest.class,
      responseType = terra.market.v1beta1.QueryOuterClass.QueryParamsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<terra.market.v1beta1.QueryOuterClass.QueryParamsRequest,
      terra.market.v1beta1.QueryOuterClass.QueryParamsResponse> getParamsMethod() {
    io.grpc.MethodDescriptor<terra.market.v1beta1.QueryOuterClass.QueryParamsRequest, terra.market.v1beta1.QueryOuterClass.QueryParamsResponse> getParamsMethod;
    if ((getParamsMethod = QueryGrpc.getParamsMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getParamsMethod = QueryGrpc.getParamsMethod) == null) {
          QueryGrpc.getParamsMethod = getParamsMethod =
              io.grpc.MethodDescriptor.<terra.market.v1beta1.QueryOuterClass.QueryParamsRequest, terra.market.v1beta1.QueryOuterClass.QueryParamsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Params"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  terra.market.v1beta1.QueryOuterClass.QueryParamsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  terra.market.v1beta1.QueryOuterClass.QueryParamsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("Params"))
              .build();
        }
      }
    }
    return getParamsMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static QueryStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<QueryStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<QueryStub>() {
        @java.lang.Override
        public QueryStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new QueryStub(channel, callOptions);
        }
      };
    return QueryStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static QueryBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<QueryBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<QueryBlockingStub>() {
        @java.lang.Override
        public QueryBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new QueryBlockingStub(channel, callOptions);
        }
      };
    return QueryBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static QueryFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<QueryFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<QueryFutureStub>() {
        @java.lang.Override
        public QueryFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new QueryFutureStub(channel, callOptions);
        }
      };
    return QueryFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * Query defines the gRPC querier service.
   * </pre>
   */
  public interface AsyncService {

    /**
     * <pre>
     * Swap returns simulated swap amount.
     * </pre>
     */
    default void swap(terra.market.v1beta1.QueryOuterClass.QuerySwapRequest request,
        io.grpc.stub.StreamObserver<terra.market.v1beta1.QueryOuterClass.QuerySwapResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSwapMethod(), responseObserver);
    }

    /**
     * <pre>
     * TerraPoolDelta returns terra_pool_delta amount.
     * </pre>
     */
    default void terraPoolDelta(terra.market.v1beta1.QueryOuterClass.QueryTerraPoolDeltaRequest request,
        io.grpc.stub.StreamObserver<terra.market.v1beta1.QueryOuterClass.QueryTerraPoolDeltaResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getTerraPoolDeltaMethod(), responseObserver);
    }

    /**
     * <pre>
     * Params queries all parameters.
     * </pre>
     */
    default void params(terra.market.v1beta1.QueryOuterClass.QueryParamsRequest request,
        io.grpc.stub.StreamObserver<terra.market.v1beta1.QueryOuterClass.QueryParamsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getParamsMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service Query.
   * <pre>
   * Query defines the gRPC querier service.
   * </pre>
   */
  public static abstract class QueryImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return QueryGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service Query.
   * <pre>
   * Query defines the gRPC querier service.
   * </pre>
   */
  public static final class QueryStub
      extends io.grpc.stub.AbstractAsyncStub<QueryStub> {
    private QueryStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected QueryStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new QueryStub(channel, callOptions);
    }

    /**
     * <pre>
     * Swap returns simulated swap amount.
     * </pre>
     */
    public void swap(terra.market.v1beta1.QueryOuterClass.QuerySwapRequest request,
        io.grpc.stub.StreamObserver<terra.market.v1beta1.QueryOuterClass.QuerySwapResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSwapMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * TerraPoolDelta returns terra_pool_delta amount.
     * </pre>
     */
    public void terraPoolDelta(terra.market.v1beta1.QueryOuterClass.QueryTerraPoolDeltaRequest request,
        io.grpc.stub.StreamObserver<terra.market.v1beta1.QueryOuterClass.QueryTerraPoolDeltaResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getTerraPoolDeltaMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Params queries all parameters.
     * </pre>
     */
    public void params(terra.market.v1beta1.QueryOuterClass.QueryParamsRequest request,
        io.grpc.stub.StreamObserver<terra.market.v1beta1.QueryOuterClass.QueryParamsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getParamsMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service Query.
   * <pre>
   * Query defines the gRPC querier service.
   * </pre>
   */
  public static final class QueryBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<QueryBlockingStub> {
    private QueryBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected QueryBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new QueryBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Swap returns simulated swap amount.
     * </pre>
     */
    public terra.market.v1beta1.QueryOuterClass.QuerySwapResponse swap(terra.market.v1beta1.QueryOuterClass.QuerySwapRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSwapMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * TerraPoolDelta returns terra_pool_delta amount.
     * </pre>
     */
    public terra.market.v1beta1.QueryOuterClass.QueryTerraPoolDeltaResponse terraPoolDelta(terra.market.v1beta1.QueryOuterClass.QueryTerraPoolDeltaRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getTerraPoolDeltaMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Params queries all parameters.
     * </pre>
     */
    public terra.market.v1beta1.QueryOuterClass.QueryParamsResponse params(terra.market.v1beta1.QueryOuterClass.QueryParamsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getParamsMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service Query.
   * <pre>
   * Query defines the gRPC querier service.
   * </pre>
   */
  public static final class QueryFutureStub
      extends io.grpc.stub.AbstractFutureStub<QueryFutureStub> {
    private QueryFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected QueryFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new QueryFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Swap returns simulated swap amount.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<terra.market.v1beta1.QueryOuterClass.QuerySwapResponse> swap(
        terra.market.v1beta1.QueryOuterClass.QuerySwapRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSwapMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * TerraPoolDelta returns terra_pool_delta amount.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<terra.market.v1beta1.QueryOuterClass.QueryTerraPoolDeltaResponse> terraPoolDelta(
        terra.market.v1beta1.QueryOuterClass.QueryTerraPoolDeltaRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getTerraPoolDeltaMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Params queries all parameters.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<terra.market.v1beta1.QueryOuterClass.QueryParamsResponse> params(
        terra.market.v1beta1.QueryOuterClass.QueryParamsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getParamsMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_SWAP = 0;
  private static final int METHODID_TERRA_POOL_DELTA = 1;
  private static final int METHODID_PARAMS = 2;

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
        case METHODID_SWAP:
          serviceImpl.swap((terra.market.v1beta1.QueryOuterClass.QuerySwapRequest) request,
              (io.grpc.stub.StreamObserver<terra.market.v1beta1.QueryOuterClass.QuerySwapResponse>) responseObserver);
          break;
        case METHODID_TERRA_POOL_DELTA:
          serviceImpl.terraPoolDelta((terra.market.v1beta1.QueryOuterClass.QueryTerraPoolDeltaRequest) request,
              (io.grpc.stub.StreamObserver<terra.market.v1beta1.QueryOuterClass.QueryTerraPoolDeltaResponse>) responseObserver);
          break;
        case METHODID_PARAMS:
          serviceImpl.params((terra.market.v1beta1.QueryOuterClass.QueryParamsRequest) request,
              (io.grpc.stub.StreamObserver<terra.market.v1beta1.QueryOuterClass.QueryParamsResponse>) responseObserver);
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
          getSwapMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              terra.market.v1beta1.QueryOuterClass.QuerySwapRequest,
              terra.market.v1beta1.QueryOuterClass.QuerySwapResponse>(
                service, METHODID_SWAP)))
        .addMethod(
          getTerraPoolDeltaMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              terra.market.v1beta1.QueryOuterClass.QueryTerraPoolDeltaRequest,
              terra.market.v1beta1.QueryOuterClass.QueryTerraPoolDeltaResponse>(
                service, METHODID_TERRA_POOL_DELTA)))
        .addMethod(
          getParamsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              terra.market.v1beta1.QueryOuterClass.QueryParamsRequest,
              terra.market.v1beta1.QueryOuterClass.QueryParamsResponse>(
                service, METHODID_PARAMS)))
        .build();
  }

  private static abstract class QueryBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    QueryBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return terra.market.v1beta1.QueryOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("Query");
    }
  }

  private static final class QueryFileDescriptorSupplier
      extends QueryBaseDescriptorSupplier {
    QueryFileDescriptorSupplier() {}
  }

  private static final class QueryMethodDescriptorSupplier
      extends QueryBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    QueryMethodDescriptorSupplier(String methodName) {
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
      synchronized (QueryGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new QueryFileDescriptorSupplier())
              .addMethod(getSwapMethod())
              .addMethod(getTerraPoolDeltaMethod())
              .addMethod(getParamsMethod())
              .build();
        }
      }
    }
    return result;
  }
}
