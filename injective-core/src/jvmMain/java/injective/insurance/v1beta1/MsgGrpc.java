package injective.insurance.v1beta1;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * Msg defines the insurance Msg service.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.54.0)",
    comments = "Source: injective/insurance/v1beta1/tx.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class MsgGrpc {

  private MsgGrpc() {}

  public static final String SERVICE_NAME = "injective.insurance.v1beta1.Msg";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<injective.insurance.v1beta1.Tx.MsgCreateInsuranceFund,
      injective.insurance.v1beta1.Tx.MsgCreateInsuranceFundResponse> getCreateInsuranceFundMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateInsuranceFund",
      requestType = injective.insurance.v1beta1.Tx.MsgCreateInsuranceFund.class,
      responseType = injective.insurance.v1beta1.Tx.MsgCreateInsuranceFundResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<injective.insurance.v1beta1.Tx.MsgCreateInsuranceFund,
      injective.insurance.v1beta1.Tx.MsgCreateInsuranceFundResponse> getCreateInsuranceFundMethod() {
    io.grpc.MethodDescriptor<injective.insurance.v1beta1.Tx.MsgCreateInsuranceFund, injective.insurance.v1beta1.Tx.MsgCreateInsuranceFundResponse> getCreateInsuranceFundMethod;
    if ((getCreateInsuranceFundMethod = MsgGrpc.getCreateInsuranceFundMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getCreateInsuranceFundMethod = MsgGrpc.getCreateInsuranceFundMethod) == null) {
          MsgGrpc.getCreateInsuranceFundMethod = getCreateInsuranceFundMethod =
              io.grpc.MethodDescriptor.<injective.insurance.v1beta1.Tx.MsgCreateInsuranceFund, injective.insurance.v1beta1.Tx.MsgCreateInsuranceFundResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateInsuranceFund"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  injective.insurance.v1beta1.Tx.MsgCreateInsuranceFund.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  injective.insurance.v1beta1.Tx.MsgCreateInsuranceFundResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("CreateInsuranceFund"))
              .build();
        }
      }
    }
    return getCreateInsuranceFundMethod;
  }

  private static volatile io.grpc.MethodDescriptor<injective.insurance.v1beta1.Tx.MsgUnderwrite,
      injective.insurance.v1beta1.Tx.MsgUnderwriteResponse> getUnderwriteMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Underwrite",
      requestType = injective.insurance.v1beta1.Tx.MsgUnderwrite.class,
      responseType = injective.insurance.v1beta1.Tx.MsgUnderwriteResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<injective.insurance.v1beta1.Tx.MsgUnderwrite,
      injective.insurance.v1beta1.Tx.MsgUnderwriteResponse> getUnderwriteMethod() {
    io.grpc.MethodDescriptor<injective.insurance.v1beta1.Tx.MsgUnderwrite, injective.insurance.v1beta1.Tx.MsgUnderwriteResponse> getUnderwriteMethod;
    if ((getUnderwriteMethod = MsgGrpc.getUnderwriteMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getUnderwriteMethod = MsgGrpc.getUnderwriteMethod) == null) {
          MsgGrpc.getUnderwriteMethod = getUnderwriteMethod =
              io.grpc.MethodDescriptor.<injective.insurance.v1beta1.Tx.MsgUnderwrite, injective.insurance.v1beta1.Tx.MsgUnderwriteResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Underwrite"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  injective.insurance.v1beta1.Tx.MsgUnderwrite.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  injective.insurance.v1beta1.Tx.MsgUnderwriteResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("Underwrite"))
              .build();
        }
      }
    }
    return getUnderwriteMethod;
  }

  private static volatile io.grpc.MethodDescriptor<injective.insurance.v1beta1.Tx.MsgRequestRedemption,
      injective.insurance.v1beta1.Tx.MsgRequestRedemptionResponse> getRequestRedemptionMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "RequestRedemption",
      requestType = injective.insurance.v1beta1.Tx.MsgRequestRedemption.class,
      responseType = injective.insurance.v1beta1.Tx.MsgRequestRedemptionResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<injective.insurance.v1beta1.Tx.MsgRequestRedemption,
      injective.insurance.v1beta1.Tx.MsgRequestRedemptionResponse> getRequestRedemptionMethod() {
    io.grpc.MethodDescriptor<injective.insurance.v1beta1.Tx.MsgRequestRedemption, injective.insurance.v1beta1.Tx.MsgRequestRedemptionResponse> getRequestRedemptionMethod;
    if ((getRequestRedemptionMethod = MsgGrpc.getRequestRedemptionMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getRequestRedemptionMethod = MsgGrpc.getRequestRedemptionMethod) == null) {
          MsgGrpc.getRequestRedemptionMethod = getRequestRedemptionMethod =
              io.grpc.MethodDescriptor.<injective.insurance.v1beta1.Tx.MsgRequestRedemption, injective.insurance.v1beta1.Tx.MsgRequestRedemptionResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "RequestRedemption"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  injective.insurance.v1beta1.Tx.MsgRequestRedemption.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  injective.insurance.v1beta1.Tx.MsgRequestRedemptionResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("RequestRedemption"))
              .build();
        }
      }
    }
    return getRequestRedemptionMethod;
  }

  private static volatile io.grpc.MethodDescriptor<injective.insurance.v1beta1.Tx.MsgUpdateParams,
      injective.insurance.v1beta1.Tx.MsgUpdateParamsResponse> getUpdateParamsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateParams",
      requestType = injective.insurance.v1beta1.Tx.MsgUpdateParams.class,
      responseType = injective.insurance.v1beta1.Tx.MsgUpdateParamsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<injective.insurance.v1beta1.Tx.MsgUpdateParams,
      injective.insurance.v1beta1.Tx.MsgUpdateParamsResponse> getUpdateParamsMethod() {
    io.grpc.MethodDescriptor<injective.insurance.v1beta1.Tx.MsgUpdateParams, injective.insurance.v1beta1.Tx.MsgUpdateParamsResponse> getUpdateParamsMethod;
    if ((getUpdateParamsMethod = MsgGrpc.getUpdateParamsMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getUpdateParamsMethod = MsgGrpc.getUpdateParamsMethod) == null) {
          MsgGrpc.getUpdateParamsMethod = getUpdateParamsMethod =
              io.grpc.MethodDescriptor.<injective.insurance.v1beta1.Tx.MsgUpdateParams, injective.insurance.v1beta1.Tx.MsgUpdateParamsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateParams"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  injective.insurance.v1beta1.Tx.MsgUpdateParams.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  injective.insurance.v1beta1.Tx.MsgUpdateParamsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("UpdateParams"))
              .build();
        }
      }
    }
    return getUpdateParamsMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static MsgStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<MsgStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<MsgStub>() {
        @java.lang.Override
        public MsgStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new MsgStub(channel, callOptions);
        }
      };
    return MsgStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static MsgBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<MsgBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<MsgBlockingStub>() {
        @java.lang.Override
        public MsgBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new MsgBlockingStub(channel, callOptions);
        }
      };
    return MsgBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static MsgFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<MsgFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<MsgFutureStub>() {
        @java.lang.Override
        public MsgFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new MsgFutureStub(channel, callOptions);
        }
      };
    return MsgFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * Msg defines the insurance Msg service.
   * </pre>
   */
  public interface AsyncService {

    /**
     * <pre>
     * CreateInsuranceFund defines a method for creating an insurance fund
     * </pre>
     */
    default void createInsuranceFund(injective.insurance.v1beta1.Tx.MsgCreateInsuranceFund request,
        io.grpc.stub.StreamObserver<injective.insurance.v1beta1.Tx.MsgCreateInsuranceFundResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateInsuranceFundMethod(), responseObserver);
    }

    /**
     * <pre>
     * Underwrite defines a method for depositing tokens to underwrite an
     * insurance fund
     * </pre>
     */
    default void underwrite(injective.insurance.v1beta1.Tx.MsgUnderwrite request,
        io.grpc.stub.StreamObserver<injective.insurance.v1beta1.Tx.MsgUnderwriteResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUnderwriteMethod(), responseObserver);
    }

    /**
     * <pre>
     * RequestRedemption defines a method for requesting a redemption of the
     * sender's insurance fund tokens
     * </pre>
     */
    default void requestRedemption(injective.insurance.v1beta1.Tx.MsgRequestRedemption request,
        io.grpc.stub.StreamObserver<injective.insurance.v1beta1.Tx.MsgRequestRedemptionResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getRequestRedemptionMethod(), responseObserver);
    }

    /**
     */
    default void updateParams(injective.insurance.v1beta1.Tx.MsgUpdateParams request,
        io.grpc.stub.StreamObserver<injective.insurance.v1beta1.Tx.MsgUpdateParamsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateParamsMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service Msg.
   * <pre>
   * Msg defines the insurance Msg service.
   * </pre>
   */
  public static abstract class MsgImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return MsgGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service Msg.
   * <pre>
   * Msg defines the insurance Msg service.
   * </pre>
   */
  public static final class MsgStub
      extends io.grpc.stub.AbstractAsyncStub<MsgStub> {
    private MsgStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected MsgStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new MsgStub(channel, callOptions);
    }

    /**
     * <pre>
     * CreateInsuranceFund defines a method for creating an insurance fund
     * </pre>
     */
    public void createInsuranceFund(injective.insurance.v1beta1.Tx.MsgCreateInsuranceFund request,
        io.grpc.stub.StreamObserver<injective.insurance.v1beta1.Tx.MsgCreateInsuranceFundResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateInsuranceFundMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Underwrite defines a method for depositing tokens to underwrite an
     * insurance fund
     * </pre>
     */
    public void underwrite(injective.insurance.v1beta1.Tx.MsgUnderwrite request,
        io.grpc.stub.StreamObserver<injective.insurance.v1beta1.Tx.MsgUnderwriteResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUnderwriteMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * RequestRedemption defines a method for requesting a redemption of the
     * sender's insurance fund tokens
     * </pre>
     */
    public void requestRedemption(injective.insurance.v1beta1.Tx.MsgRequestRedemption request,
        io.grpc.stub.StreamObserver<injective.insurance.v1beta1.Tx.MsgRequestRedemptionResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getRequestRedemptionMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void updateParams(injective.insurance.v1beta1.Tx.MsgUpdateParams request,
        io.grpc.stub.StreamObserver<injective.insurance.v1beta1.Tx.MsgUpdateParamsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateParamsMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service Msg.
   * <pre>
   * Msg defines the insurance Msg service.
   * </pre>
   */
  public static final class MsgBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<MsgBlockingStub> {
    private MsgBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected MsgBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new MsgBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * CreateInsuranceFund defines a method for creating an insurance fund
     * </pre>
     */
    public injective.insurance.v1beta1.Tx.MsgCreateInsuranceFundResponse createInsuranceFund(injective.insurance.v1beta1.Tx.MsgCreateInsuranceFund request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateInsuranceFundMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Underwrite defines a method for depositing tokens to underwrite an
     * insurance fund
     * </pre>
     */
    public injective.insurance.v1beta1.Tx.MsgUnderwriteResponse underwrite(injective.insurance.v1beta1.Tx.MsgUnderwrite request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUnderwriteMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * RequestRedemption defines a method for requesting a redemption of the
     * sender's insurance fund tokens
     * </pre>
     */
    public injective.insurance.v1beta1.Tx.MsgRequestRedemptionResponse requestRedemption(injective.insurance.v1beta1.Tx.MsgRequestRedemption request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getRequestRedemptionMethod(), getCallOptions(), request);
    }

    /**
     */
    public injective.insurance.v1beta1.Tx.MsgUpdateParamsResponse updateParams(injective.insurance.v1beta1.Tx.MsgUpdateParams request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateParamsMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service Msg.
   * <pre>
   * Msg defines the insurance Msg service.
   * </pre>
   */
  public static final class MsgFutureStub
      extends io.grpc.stub.AbstractFutureStub<MsgFutureStub> {
    private MsgFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected MsgFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new MsgFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * CreateInsuranceFund defines a method for creating an insurance fund
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<injective.insurance.v1beta1.Tx.MsgCreateInsuranceFundResponse> createInsuranceFund(
        injective.insurance.v1beta1.Tx.MsgCreateInsuranceFund request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateInsuranceFundMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Underwrite defines a method for depositing tokens to underwrite an
     * insurance fund
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<injective.insurance.v1beta1.Tx.MsgUnderwriteResponse> underwrite(
        injective.insurance.v1beta1.Tx.MsgUnderwrite request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUnderwriteMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * RequestRedemption defines a method for requesting a redemption of the
     * sender's insurance fund tokens
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<injective.insurance.v1beta1.Tx.MsgRequestRedemptionResponse> requestRedemption(
        injective.insurance.v1beta1.Tx.MsgRequestRedemption request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getRequestRedemptionMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<injective.insurance.v1beta1.Tx.MsgUpdateParamsResponse> updateParams(
        injective.insurance.v1beta1.Tx.MsgUpdateParams request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateParamsMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_CREATE_INSURANCE_FUND = 0;
  private static final int METHODID_UNDERWRITE = 1;
  private static final int METHODID_REQUEST_REDEMPTION = 2;
  private static final int METHODID_UPDATE_PARAMS = 3;

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
        case METHODID_CREATE_INSURANCE_FUND:
          serviceImpl.createInsuranceFund((injective.insurance.v1beta1.Tx.MsgCreateInsuranceFund) request,
              (io.grpc.stub.StreamObserver<injective.insurance.v1beta1.Tx.MsgCreateInsuranceFundResponse>) responseObserver);
          break;
        case METHODID_UNDERWRITE:
          serviceImpl.underwrite((injective.insurance.v1beta1.Tx.MsgUnderwrite) request,
              (io.grpc.stub.StreamObserver<injective.insurance.v1beta1.Tx.MsgUnderwriteResponse>) responseObserver);
          break;
        case METHODID_REQUEST_REDEMPTION:
          serviceImpl.requestRedemption((injective.insurance.v1beta1.Tx.MsgRequestRedemption) request,
              (io.grpc.stub.StreamObserver<injective.insurance.v1beta1.Tx.MsgRequestRedemptionResponse>) responseObserver);
          break;
        case METHODID_UPDATE_PARAMS:
          serviceImpl.updateParams((injective.insurance.v1beta1.Tx.MsgUpdateParams) request,
              (io.grpc.stub.StreamObserver<injective.insurance.v1beta1.Tx.MsgUpdateParamsResponse>) responseObserver);
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
          getCreateInsuranceFundMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              injective.insurance.v1beta1.Tx.MsgCreateInsuranceFund,
              injective.insurance.v1beta1.Tx.MsgCreateInsuranceFundResponse>(
                service, METHODID_CREATE_INSURANCE_FUND)))
        .addMethod(
          getUnderwriteMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              injective.insurance.v1beta1.Tx.MsgUnderwrite,
              injective.insurance.v1beta1.Tx.MsgUnderwriteResponse>(
                service, METHODID_UNDERWRITE)))
        .addMethod(
          getRequestRedemptionMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              injective.insurance.v1beta1.Tx.MsgRequestRedemption,
              injective.insurance.v1beta1.Tx.MsgRequestRedemptionResponse>(
                service, METHODID_REQUEST_REDEMPTION)))
        .addMethod(
          getUpdateParamsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              injective.insurance.v1beta1.Tx.MsgUpdateParams,
              injective.insurance.v1beta1.Tx.MsgUpdateParamsResponse>(
                service, METHODID_UPDATE_PARAMS)))
        .build();
  }

  private static abstract class MsgBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    MsgBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return injective.insurance.v1beta1.Tx.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("Msg");
    }
  }

  private static final class MsgFileDescriptorSupplier
      extends MsgBaseDescriptorSupplier {
    MsgFileDescriptorSupplier() {}
  }

  private static final class MsgMethodDescriptorSupplier
      extends MsgBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    MsgMethodDescriptorSupplier(String methodName) {
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
      synchronized (MsgGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new MsgFileDescriptorSupplier())
              .addMethod(getCreateInsuranceFundMethod())
              .addMethod(getUnderwriteMethod())
              .addMethod(getRequestRedemptionMethod())
              .addMethod(getUpdateParamsMethod())
              .build();
        }
      }
    }
    return result;
  }
}
