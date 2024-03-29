package injective.ocr.v1beta1;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * Msg defines the OCR Msg service.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.54.0)",
    comments = "Source: injective/ocr/v1beta1/tx.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class MsgGrpc {

  private MsgGrpc() {}

  public static final String SERVICE_NAME = "injective.ocr.v1beta1.Msg";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<injective.ocr.v1beta1.Tx.MsgCreateFeed,
      injective.ocr.v1beta1.Tx.MsgCreateFeedResponse> getCreateFeedMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateFeed",
      requestType = injective.ocr.v1beta1.Tx.MsgCreateFeed.class,
      responseType = injective.ocr.v1beta1.Tx.MsgCreateFeedResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<injective.ocr.v1beta1.Tx.MsgCreateFeed,
      injective.ocr.v1beta1.Tx.MsgCreateFeedResponse> getCreateFeedMethod() {
    io.grpc.MethodDescriptor<injective.ocr.v1beta1.Tx.MsgCreateFeed, injective.ocr.v1beta1.Tx.MsgCreateFeedResponse> getCreateFeedMethod;
    if ((getCreateFeedMethod = MsgGrpc.getCreateFeedMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getCreateFeedMethod = MsgGrpc.getCreateFeedMethod) == null) {
          MsgGrpc.getCreateFeedMethod = getCreateFeedMethod =
              io.grpc.MethodDescriptor.<injective.ocr.v1beta1.Tx.MsgCreateFeed, injective.ocr.v1beta1.Tx.MsgCreateFeedResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateFeed"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  injective.ocr.v1beta1.Tx.MsgCreateFeed.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  injective.ocr.v1beta1.Tx.MsgCreateFeedResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("CreateFeed"))
              .build();
        }
      }
    }
    return getCreateFeedMethod;
  }

  private static volatile io.grpc.MethodDescriptor<injective.ocr.v1beta1.Tx.MsgUpdateFeed,
      injective.ocr.v1beta1.Tx.MsgUpdateFeedResponse> getUpdateFeedMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateFeed",
      requestType = injective.ocr.v1beta1.Tx.MsgUpdateFeed.class,
      responseType = injective.ocr.v1beta1.Tx.MsgUpdateFeedResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<injective.ocr.v1beta1.Tx.MsgUpdateFeed,
      injective.ocr.v1beta1.Tx.MsgUpdateFeedResponse> getUpdateFeedMethod() {
    io.grpc.MethodDescriptor<injective.ocr.v1beta1.Tx.MsgUpdateFeed, injective.ocr.v1beta1.Tx.MsgUpdateFeedResponse> getUpdateFeedMethod;
    if ((getUpdateFeedMethod = MsgGrpc.getUpdateFeedMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getUpdateFeedMethod = MsgGrpc.getUpdateFeedMethod) == null) {
          MsgGrpc.getUpdateFeedMethod = getUpdateFeedMethod =
              io.grpc.MethodDescriptor.<injective.ocr.v1beta1.Tx.MsgUpdateFeed, injective.ocr.v1beta1.Tx.MsgUpdateFeedResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateFeed"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  injective.ocr.v1beta1.Tx.MsgUpdateFeed.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  injective.ocr.v1beta1.Tx.MsgUpdateFeedResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("UpdateFeed"))
              .build();
        }
      }
    }
    return getUpdateFeedMethod;
  }

  private static volatile io.grpc.MethodDescriptor<injective.ocr.v1beta1.Tx.MsgTransmit,
      injective.ocr.v1beta1.Tx.MsgTransmitResponse> getTransmitMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Transmit",
      requestType = injective.ocr.v1beta1.Tx.MsgTransmit.class,
      responseType = injective.ocr.v1beta1.Tx.MsgTransmitResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<injective.ocr.v1beta1.Tx.MsgTransmit,
      injective.ocr.v1beta1.Tx.MsgTransmitResponse> getTransmitMethod() {
    io.grpc.MethodDescriptor<injective.ocr.v1beta1.Tx.MsgTransmit, injective.ocr.v1beta1.Tx.MsgTransmitResponse> getTransmitMethod;
    if ((getTransmitMethod = MsgGrpc.getTransmitMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getTransmitMethod = MsgGrpc.getTransmitMethod) == null) {
          MsgGrpc.getTransmitMethod = getTransmitMethod =
              io.grpc.MethodDescriptor.<injective.ocr.v1beta1.Tx.MsgTransmit, injective.ocr.v1beta1.Tx.MsgTransmitResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Transmit"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  injective.ocr.v1beta1.Tx.MsgTransmit.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  injective.ocr.v1beta1.Tx.MsgTransmitResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("Transmit"))
              .build();
        }
      }
    }
    return getTransmitMethod;
  }

  private static volatile io.grpc.MethodDescriptor<injective.ocr.v1beta1.Tx.MsgFundFeedRewardPool,
      injective.ocr.v1beta1.Tx.MsgFundFeedRewardPoolResponse> getFundFeedRewardPoolMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "FundFeedRewardPool",
      requestType = injective.ocr.v1beta1.Tx.MsgFundFeedRewardPool.class,
      responseType = injective.ocr.v1beta1.Tx.MsgFundFeedRewardPoolResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<injective.ocr.v1beta1.Tx.MsgFundFeedRewardPool,
      injective.ocr.v1beta1.Tx.MsgFundFeedRewardPoolResponse> getFundFeedRewardPoolMethod() {
    io.grpc.MethodDescriptor<injective.ocr.v1beta1.Tx.MsgFundFeedRewardPool, injective.ocr.v1beta1.Tx.MsgFundFeedRewardPoolResponse> getFundFeedRewardPoolMethod;
    if ((getFundFeedRewardPoolMethod = MsgGrpc.getFundFeedRewardPoolMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getFundFeedRewardPoolMethod = MsgGrpc.getFundFeedRewardPoolMethod) == null) {
          MsgGrpc.getFundFeedRewardPoolMethod = getFundFeedRewardPoolMethod =
              io.grpc.MethodDescriptor.<injective.ocr.v1beta1.Tx.MsgFundFeedRewardPool, injective.ocr.v1beta1.Tx.MsgFundFeedRewardPoolResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "FundFeedRewardPool"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  injective.ocr.v1beta1.Tx.MsgFundFeedRewardPool.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  injective.ocr.v1beta1.Tx.MsgFundFeedRewardPoolResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("FundFeedRewardPool"))
              .build();
        }
      }
    }
    return getFundFeedRewardPoolMethod;
  }

  private static volatile io.grpc.MethodDescriptor<injective.ocr.v1beta1.Tx.MsgWithdrawFeedRewardPool,
      injective.ocr.v1beta1.Tx.MsgWithdrawFeedRewardPoolResponse> getWithdrawFeedRewardPoolMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "WithdrawFeedRewardPool",
      requestType = injective.ocr.v1beta1.Tx.MsgWithdrawFeedRewardPool.class,
      responseType = injective.ocr.v1beta1.Tx.MsgWithdrawFeedRewardPoolResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<injective.ocr.v1beta1.Tx.MsgWithdrawFeedRewardPool,
      injective.ocr.v1beta1.Tx.MsgWithdrawFeedRewardPoolResponse> getWithdrawFeedRewardPoolMethod() {
    io.grpc.MethodDescriptor<injective.ocr.v1beta1.Tx.MsgWithdrawFeedRewardPool, injective.ocr.v1beta1.Tx.MsgWithdrawFeedRewardPoolResponse> getWithdrawFeedRewardPoolMethod;
    if ((getWithdrawFeedRewardPoolMethod = MsgGrpc.getWithdrawFeedRewardPoolMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getWithdrawFeedRewardPoolMethod = MsgGrpc.getWithdrawFeedRewardPoolMethod) == null) {
          MsgGrpc.getWithdrawFeedRewardPoolMethod = getWithdrawFeedRewardPoolMethod =
              io.grpc.MethodDescriptor.<injective.ocr.v1beta1.Tx.MsgWithdrawFeedRewardPool, injective.ocr.v1beta1.Tx.MsgWithdrawFeedRewardPoolResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "WithdrawFeedRewardPool"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  injective.ocr.v1beta1.Tx.MsgWithdrawFeedRewardPool.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  injective.ocr.v1beta1.Tx.MsgWithdrawFeedRewardPoolResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("WithdrawFeedRewardPool"))
              .build();
        }
      }
    }
    return getWithdrawFeedRewardPoolMethod;
  }

  private static volatile io.grpc.MethodDescriptor<injective.ocr.v1beta1.Tx.MsgSetPayees,
      injective.ocr.v1beta1.Tx.MsgSetPayeesResponse> getSetPayeesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SetPayees",
      requestType = injective.ocr.v1beta1.Tx.MsgSetPayees.class,
      responseType = injective.ocr.v1beta1.Tx.MsgSetPayeesResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<injective.ocr.v1beta1.Tx.MsgSetPayees,
      injective.ocr.v1beta1.Tx.MsgSetPayeesResponse> getSetPayeesMethod() {
    io.grpc.MethodDescriptor<injective.ocr.v1beta1.Tx.MsgSetPayees, injective.ocr.v1beta1.Tx.MsgSetPayeesResponse> getSetPayeesMethod;
    if ((getSetPayeesMethod = MsgGrpc.getSetPayeesMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getSetPayeesMethod = MsgGrpc.getSetPayeesMethod) == null) {
          MsgGrpc.getSetPayeesMethod = getSetPayeesMethod =
              io.grpc.MethodDescriptor.<injective.ocr.v1beta1.Tx.MsgSetPayees, injective.ocr.v1beta1.Tx.MsgSetPayeesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SetPayees"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  injective.ocr.v1beta1.Tx.MsgSetPayees.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  injective.ocr.v1beta1.Tx.MsgSetPayeesResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("SetPayees"))
              .build();
        }
      }
    }
    return getSetPayeesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<injective.ocr.v1beta1.Tx.MsgTransferPayeeship,
      injective.ocr.v1beta1.Tx.MsgTransferPayeeshipResponse> getTransferPayeeshipMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "TransferPayeeship",
      requestType = injective.ocr.v1beta1.Tx.MsgTransferPayeeship.class,
      responseType = injective.ocr.v1beta1.Tx.MsgTransferPayeeshipResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<injective.ocr.v1beta1.Tx.MsgTransferPayeeship,
      injective.ocr.v1beta1.Tx.MsgTransferPayeeshipResponse> getTransferPayeeshipMethod() {
    io.grpc.MethodDescriptor<injective.ocr.v1beta1.Tx.MsgTransferPayeeship, injective.ocr.v1beta1.Tx.MsgTransferPayeeshipResponse> getTransferPayeeshipMethod;
    if ((getTransferPayeeshipMethod = MsgGrpc.getTransferPayeeshipMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getTransferPayeeshipMethod = MsgGrpc.getTransferPayeeshipMethod) == null) {
          MsgGrpc.getTransferPayeeshipMethod = getTransferPayeeshipMethod =
              io.grpc.MethodDescriptor.<injective.ocr.v1beta1.Tx.MsgTransferPayeeship, injective.ocr.v1beta1.Tx.MsgTransferPayeeshipResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "TransferPayeeship"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  injective.ocr.v1beta1.Tx.MsgTransferPayeeship.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  injective.ocr.v1beta1.Tx.MsgTransferPayeeshipResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("TransferPayeeship"))
              .build();
        }
      }
    }
    return getTransferPayeeshipMethod;
  }

  private static volatile io.grpc.MethodDescriptor<injective.ocr.v1beta1.Tx.MsgAcceptPayeeship,
      injective.ocr.v1beta1.Tx.MsgAcceptPayeeshipResponse> getAcceptPayeeshipMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "AcceptPayeeship",
      requestType = injective.ocr.v1beta1.Tx.MsgAcceptPayeeship.class,
      responseType = injective.ocr.v1beta1.Tx.MsgAcceptPayeeshipResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<injective.ocr.v1beta1.Tx.MsgAcceptPayeeship,
      injective.ocr.v1beta1.Tx.MsgAcceptPayeeshipResponse> getAcceptPayeeshipMethod() {
    io.grpc.MethodDescriptor<injective.ocr.v1beta1.Tx.MsgAcceptPayeeship, injective.ocr.v1beta1.Tx.MsgAcceptPayeeshipResponse> getAcceptPayeeshipMethod;
    if ((getAcceptPayeeshipMethod = MsgGrpc.getAcceptPayeeshipMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getAcceptPayeeshipMethod = MsgGrpc.getAcceptPayeeshipMethod) == null) {
          MsgGrpc.getAcceptPayeeshipMethod = getAcceptPayeeshipMethod =
              io.grpc.MethodDescriptor.<injective.ocr.v1beta1.Tx.MsgAcceptPayeeship, injective.ocr.v1beta1.Tx.MsgAcceptPayeeshipResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "AcceptPayeeship"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  injective.ocr.v1beta1.Tx.MsgAcceptPayeeship.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  injective.ocr.v1beta1.Tx.MsgAcceptPayeeshipResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("AcceptPayeeship"))
              .build();
        }
      }
    }
    return getAcceptPayeeshipMethod;
  }

  private static volatile io.grpc.MethodDescriptor<injective.ocr.v1beta1.Tx.MsgUpdateParams,
      injective.ocr.v1beta1.Tx.MsgUpdateParamsResponse> getUpdateParamsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateParams",
      requestType = injective.ocr.v1beta1.Tx.MsgUpdateParams.class,
      responseType = injective.ocr.v1beta1.Tx.MsgUpdateParamsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<injective.ocr.v1beta1.Tx.MsgUpdateParams,
      injective.ocr.v1beta1.Tx.MsgUpdateParamsResponse> getUpdateParamsMethod() {
    io.grpc.MethodDescriptor<injective.ocr.v1beta1.Tx.MsgUpdateParams, injective.ocr.v1beta1.Tx.MsgUpdateParamsResponse> getUpdateParamsMethod;
    if ((getUpdateParamsMethod = MsgGrpc.getUpdateParamsMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getUpdateParamsMethod = MsgGrpc.getUpdateParamsMethod) == null) {
          MsgGrpc.getUpdateParamsMethod = getUpdateParamsMethod =
              io.grpc.MethodDescriptor.<injective.ocr.v1beta1.Tx.MsgUpdateParams, injective.ocr.v1beta1.Tx.MsgUpdateParamsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateParams"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  injective.ocr.v1beta1.Tx.MsgUpdateParams.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  injective.ocr.v1beta1.Tx.MsgUpdateParamsResponse.getDefaultInstance()))
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
   * Msg defines the OCR Msg service.
   * </pre>
   */
  public interface AsyncService {

    /**
     * <pre>
     * CreateFeed defines a method for creating feed by module admin
     * </pre>
     */
    default void createFeed(injective.ocr.v1beta1.Tx.MsgCreateFeed request,
        io.grpc.stub.StreamObserver<injective.ocr.v1beta1.Tx.MsgCreateFeedResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateFeedMethod(), responseObserver);
    }

    /**
     * <pre>
     * CreateFeed defines a method for creating feed by feed admin or feed billing
     * admin
     * </pre>
     */
    default void updateFeed(injective.ocr.v1beta1.Tx.MsgUpdateFeed request,
        io.grpc.stub.StreamObserver<injective.ocr.v1beta1.Tx.MsgUpdateFeedResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateFeedMethod(), responseObserver);
    }

    /**
     * <pre>
     * Transmit defines a method for transmitting the feed info by transmitter
     * </pre>
     */
    default void transmit(injective.ocr.v1beta1.Tx.MsgTransmit request,
        io.grpc.stub.StreamObserver<injective.ocr.v1beta1.Tx.MsgTransmitResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getTransmitMethod(), responseObserver);
    }

    /**
     * <pre>
     * FundFeedRewardPool defines a method to put funds into feed reward pool
     * </pre>
     */
    default void fundFeedRewardPool(injective.ocr.v1beta1.Tx.MsgFundFeedRewardPool request,
        io.grpc.stub.StreamObserver<injective.ocr.v1beta1.Tx.MsgFundFeedRewardPoolResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getFundFeedRewardPoolMethod(), responseObserver);
    }

    /**
     * <pre>
     * WithdrawFeedRewardPool defines a method to witdhraw feed reward by feed
     * admin or billing admin
     * </pre>
     */
    default void withdrawFeedRewardPool(injective.ocr.v1beta1.Tx.MsgWithdrawFeedRewardPool request,
        io.grpc.stub.StreamObserver<injective.ocr.v1beta1.Tx.MsgWithdrawFeedRewardPoolResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getWithdrawFeedRewardPoolMethod(), responseObserver);
    }

    /**
     * <pre>
     * SetPayees defines a method to set payees for transmitters (batch action)
     * </pre>
     */
    default void setPayees(injective.ocr.v1beta1.Tx.MsgSetPayees request,
        io.grpc.stub.StreamObserver<injective.ocr.v1beta1.Tx.MsgSetPayeesResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSetPayeesMethod(), responseObserver);
    }

    /**
     * <pre>
     * TransferPayeeship defines a method for a payee to transfer reward receive
     * ownership
     * </pre>
     */
    default void transferPayeeship(injective.ocr.v1beta1.Tx.MsgTransferPayeeship request,
        io.grpc.stub.StreamObserver<injective.ocr.v1beta1.Tx.MsgTransferPayeeshipResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getTransferPayeeshipMethod(), responseObserver);
    }

    /**
     * <pre>
     * AcceptPayeeship defines a method for a new payee to accept reward receive
     * ownership
     * </pre>
     */
    default void acceptPayeeship(injective.ocr.v1beta1.Tx.MsgAcceptPayeeship request,
        io.grpc.stub.StreamObserver<injective.ocr.v1beta1.Tx.MsgAcceptPayeeshipResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getAcceptPayeeshipMethod(), responseObserver);
    }

    /**
     */
    default void updateParams(injective.ocr.v1beta1.Tx.MsgUpdateParams request,
        io.grpc.stub.StreamObserver<injective.ocr.v1beta1.Tx.MsgUpdateParamsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateParamsMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service Msg.
   * <pre>
   * Msg defines the OCR Msg service.
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
   * Msg defines the OCR Msg service.
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
     * CreateFeed defines a method for creating feed by module admin
     * </pre>
     */
    public void createFeed(injective.ocr.v1beta1.Tx.MsgCreateFeed request,
        io.grpc.stub.StreamObserver<injective.ocr.v1beta1.Tx.MsgCreateFeedResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateFeedMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * CreateFeed defines a method for creating feed by feed admin or feed billing
     * admin
     * </pre>
     */
    public void updateFeed(injective.ocr.v1beta1.Tx.MsgUpdateFeed request,
        io.grpc.stub.StreamObserver<injective.ocr.v1beta1.Tx.MsgUpdateFeedResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateFeedMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Transmit defines a method for transmitting the feed info by transmitter
     * </pre>
     */
    public void transmit(injective.ocr.v1beta1.Tx.MsgTransmit request,
        io.grpc.stub.StreamObserver<injective.ocr.v1beta1.Tx.MsgTransmitResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getTransmitMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * FundFeedRewardPool defines a method to put funds into feed reward pool
     * </pre>
     */
    public void fundFeedRewardPool(injective.ocr.v1beta1.Tx.MsgFundFeedRewardPool request,
        io.grpc.stub.StreamObserver<injective.ocr.v1beta1.Tx.MsgFundFeedRewardPoolResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getFundFeedRewardPoolMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * WithdrawFeedRewardPool defines a method to witdhraw feed reward by feed
     * admin or billing admin
     * </pre>
     */
    public void withdrawFeedRewardPool(injective.ocr.v1beta1.Tx.MsgWithdrawFeedRewardPool request,
        io.grpc.stub.StreamObserver<injective.ocr.v1beta1.Tx.MsgWithdrawFeedRewardPoolResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getWithdrawFeedRewardPoolMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * SetPayees defines a method to set payees for transmitters (batch action)
     * </pre>
     */
    public void setPayees(injective.ocr.v1beta1.Tx.MsgSetPayees request,
        io.grpc.stub.StreamObserver<injective.ocr.v1beta1.Tx.MsgSetPayeesResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSetPayeesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * TransferPayeeship defines a method for a payee to transfer reward receive
     * ownership
     * </pre>
     */
    public void transferPayeeship(injective.ocr.v1beta1.Tx.MsgTransferPayeeship request,
        io.grpc.stub.StreamObserver<injective.ocr.v1beta1.Tx.MsgTransferPayeeshipResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getTransferPayeeshipMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * AcceptPayeeship defines a method for a new payee to accept reward receive
     * ownership
     * </pre>
     */
    public void acceptPayeeship(injective.ocr.v1beta1.Tx.MsgAcceptPayeeship request,
        io.grpc.stub.StreamObserver<injective.ocr.v1beta1.Tx.MsgAcceptPayeeshipResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getAcceptPayeeshipMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void updateParams(injective.ocr.v1beta1.Tx.MsgUpdateParams request,
        io.grpc.stub.StreamObserver<injective.ocr.v1beta1.Tx.MsgUpdateParamsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateParamsMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service Msg.
   * <pre>
   * Msg defines the OCR Msg service.
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
     * CreateFeed defines a method for creating feed by module admin
     * </pre>
     */
    public injective.ocr.v1beta1.Tx.MsgCreateFeedResponse createFeed(injective.ocr.v1beta1.Tx.MsgCreateFeed request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateFeedMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * CreateFeed defines a method for creating feed by feed admin or feed billing
     * admin
     * </pre>
     */
    public injective.ocr.v1beta1.Tx.MsgUpdateFeedResponse updateFeed(injective.ocr.v1beta1.Tx.MsgUpdateFeed request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateFeedMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Transmit defines a method for transmitting the feed info by transmitter
     * </pre>
     */
    public injective.ocr.v1beta1.Tx.MsgTransmitResponse transmit(injective.ocr.v1beta1.Tx.MsgTransmit request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getTransmitMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * FundFeedRewardPool defines a method to put funds into feed reward pool
     * </pre>
     */
    public injective.ocr.v1beta1.Tx.MsgFundFeedRewardPoolResponse fundFeedRewardPool(injective.ocr.v1beta1.Tx.MsgFundFeedRewardPool request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getFundFeedRewardPoolMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * WithdrawFeedRewardPool defines a method to witdhraw feed reward by feed
     * admin or billing admin
     * </pre>
     */
    public injective.ocr.v1beta1.Tx.MsgWithdrawFeedRewardPoolResponse withdrawFeedRewardPool(injective.ocr.v1beta1.Tx.MsgWithdrawFeedRewardPool request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getWithdrawFeedRewardPoolMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * SetPayees defines a method to set payees for transmitters (batch action)
     * </pre>
     */
    public injective.ocr.v1beta1.Tx.MsgSetPayeesResponse setPayees(injective.ocr.v1beta1.Tx.MsgSetPayees request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSetPayeesMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * TransferPayeeship defines a method for a payee to transfer reward receive
     * ownership
     * </pre>
     */
    public injective.ocr.v1beta1.Tx.MsgTransferPayeeshipResponse transferPayeeship(injective.ocr.v1beta1.Tx.MsgTransferPayeeship request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getTransferPayeeshipMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * AcceptPayeeship defines a method for a new payee to accept reward receive
     * ownership
     * </pre>
     */
    public injective.ocr.v1beta1.Tx.MsgAcceptPayeeshipResponse acceptPayeeship(injective.ocr.v1beta1.Tx.MsgAcceptPayeeship request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getAcceptPayeeshipMethod(), getCallOptions(), request);
    }

    /**
     */
    public injective.ocr.v1beta1.Tx.MsgUpdateParamsResponse updateParams(injective.ocr.v1beta1.Tx.MsgUpdateParams request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateParamsMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service Msg.
   * <pre>
   * Msg defines the OCR Msg service.
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
     * CreateFeed defines a method for creating feed by module admin
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<injective.ocr.v1beta1.Tx.MsgCreateFeedResponse> createFeed(
        injective.ocr.v1beta1.Tx.MsgCreateFeed request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateFeedMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * CreateFeed defines a method for creating feed by feed admin or feed billing
     * admin
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<injective.ocr.v1beta1.Tx.MsgUpdateFeedResponse> updateFeed(
        injective.ocr.v1beta1.Tx.MsgUpdateFeed request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateFeedMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Transmit defines a method for transmitting the feed info by transmitter
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<injective.ocr.v1beta1.Tx.MsgTransmitResponse> transmit(
        injective.ocr.v1beta1.Tx.MsgTransmit request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getTransmitMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * FundFeedRewardPool defines a method to put funds into feed reward pool
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<injective.ocr.v1beta1.Tx.MsgFundFeedRewardPoolResponse> fundFeedRewardPool(
        injective.ocr.v1beta1.Tx.MsgFundFeedRewardPool request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getFundFeedRewardPoolMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * WithdrawFeedRewardPool defines a method to witdhraw feed reward by feed
     * admin or billing admin
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<injective.ocr.v1beta1.Tx.MsgWithdrawFeedRewardPoolResponse> withdrawFeedRewardPool(
        injective.ocr.v1beta1.Tx.MsgWithdrawFeedRewardPool request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getWithdrawFeedRewardPoolMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * SetPayees defines a method to set payees for transmitters (batch action)
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<injective.ocr.v1beta1.Tx.MsgSetPayeesResponse> setPayees(
        injective.ocr.v1beta1.Tx.MsgSetPayees request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSetPayeesMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * TransferPayeeship defines a method for a payee to transfer reward receive
     * ownership
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<injective.ocr.v1beta1.Tx.MsgTransferPayeeshipResponse> transferPayeeship(
        injective.ocr.v1beta1.Tx.MsgTransferPayeeship request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getTransferPayeeshipMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * AcceptPayeeship defines a method for a new payee to accept reward receive
     * ownership
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<injective.ocr.v1beta1.Tx.MsgAcceptPayeeshipResponse> acceptPayeeship(
        injective.ocr.v1beta1.Tx.MsgAcceptPayeeship request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getAcceptPayeeshipMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<injective.ocr.v1beta1.Tx.MsgUpdateParamsResponse> updateParams(
        injective.ocr.v1beta1.Tx.MsgUpdateParams request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateParamsMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_CREATE_FEED = 0;
  private static final int METHODID_UPDATE_FEED = 1;
  private static final int METHODID_TRANSMIT = 2;
  private static final int METHODID_FUND_FEED_REWARD_POOL = 3;
  private static final int METHODID_WITHDRAW_FEED_REWARD_POOL = 4;
  private static final int METHODID_SET_PAYEES = 5;
  private static final int METHODID_TRANSFER_PAYEESHIP = 6;
  private static final int METHODID_ACCEPT_PAYEESHIP = 7;
  private static final int METHODID_UPDATE_PARAMS = 8;

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
        case METHODID_CREATE_FEED:
          serviceImpl.createFeed((injective.ocr.v1beta1.Tx.MsgCreateFeed) request,
              (io.grpc.stub.StreamObserver<injective.ocr.v1beta1.Tx.MsgCreateFeedResponse>) responseObserver);
          break;
        case METHODID_UPDATE_FEED:
          serviceImpl.updateFeed((injective.ocr.v1beta1.Tx.MsgUpdateFeed) request,
              (io.grpc.stub.StreamObserver<injective.ocr.v1beta1.Tx.MsgUpdateFeedResponse>) responseObserver);
          break;
        case METHODID_TRANSMIT:
          serviceImpl.transmit((injective.ocr.v1beta1.Tx.MsgTransmit) request,
              (io.grpc.stub.StreamObserver<injective.ocr.v1beta1.Tx.MsgTransmitResponse>) responseObserver);
          break;
        case METHODID_FUND_FEED_REWARD_POOL:
          serviceImpl.fundFeedRewardPool((injective.ocr.v1beta1.Tx.MsgFundFeedRewardPool) request,
              (io.grpc.stub.StreamObserver<injective.ocr.v1beta1.Tx.MsgFundFeedRewardPoolResponse>) responseObserver);
          break;
        case METHODID_WITHDRAW_FEED_REWARD_POOL:
          serviceImpl.withdrawFeedRewardPool((injective.ocr.v1beta1.Tx.MsgWithdrawFeedRewardPool) request,
              (io.grpc.stub.StreamObserver<injective.ocr.v1beta1.Tx.MsgWithdrawFeedRewardPoolResponse>) responseObserver);
          break;
        case METHODID_SET_PAYEES:
          serviceImpl.setPayees((injective.ocr.v1beta1.Tx.MsgSetPayees) request,
              (io.grpc.stub.StreamObserver<injective.ocr.v1beta1.Tx.MsgSetPayeesResponse>) responseObserver);
          break;
        case METHODID_TRANSFER_PAYEESHIP:
          serviceImpl.transferPayeeship((injective.ocr.v1beta1.Tx.MsgTransferPayeeship) request,
              (io.grpc.stub.StreamObserver<injective.ocr.v1beta1.Tx.MsgTransferPayeeshipResponse>) responseObserver);
          break;
        case METHODID_ACCEPT_PAYEESHIP:
          serviceImpl.acceptPayeeship((injective.ocr.v1beta1.Tx.MsgAcceptPayeeship) request,
              (io.grpc.stub.StreamObserver<injective.ocr.v1beta1.Tx.MsgAcceptPayeeshipResponse>) responseObserver);
          break;
        case METHODID_UPDATE_PARAMS:
          serviceImpl.updateParams((injective.ocr.v1beta1.Tx.MsgUpdateParams) request,
              (io.grpc.stub.StreamObserver<injective.ocr.v1beta1.Tx.MsgUpdateParamsResponse>) responseObserver);
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
          getCreateFeedMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              injective.ocr.v1beta1.Tx.MsgCreateFeed,
              injective.ocr.v1beta1.Tx.MsgCreateFeedResponse>(
                service, METHODID_CREATE_FEED)))
        .addMethod(
          getUpdateFeedMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              injective.ocr.v1beta1.Tx.MsgUpdateFeed,
              injective.ocr.v1beta1.Tx.MsgUpdateFeedResponse>(
                service, METHODID_UPDATE_FEED)))
        .addMethod(
          getTransmitMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              injective.ocr.v1beta1.Tx.MsgTransmit,
              injective.ocr.v1beta1.Tx.MsgTransmitResponse>(
                service, METHODID_TRANSMIT)))
        .addMethod(
          getFundFeedRewardPoolMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              injective.ocr.v1beta1.Tx.MsgFundFeedRewardPool,
              injective.ocr.v1beta1.Tx.MsgFundFeedRewardPoolResponse>(
                service, METHODID_FUND_FEED_REWARD_POOL)))
        .addMethod(
          getWithdrawFeedRewardPoolMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              injective.ocr.v1beta1.Tx.MsgWithdrawFeedRewardPool,
              injective.ocr.v1beta1.Tx.MsgWithdrawFeedRewardPoolResponse>(
                service, METHODID_WITHDRAW_FEED_REWARD_POOL)))
        .addMethod(
          getSetPayeesMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              injective.ocr.v1beta1.Tx.MsgSetPayees,
              injective.ocr.v1beta1.Tx.MsgSetPayeesResponse>(
                service, METHODID_SET_PAYEES)))
        .addMethod(
          getTransferPayeeshipMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              injective.ocr.v1beta1.Tx.MsgTransferPayeeship,
              injective.ocr.v1beta1.Tx.MsgTransferPayeeshipResponse>(
                service, METHODID_TRANSFER_PAYEESHIP)))
        .addMethod(
          getAcceptPayeeshipMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              injective.ocr.v1beta1.Tx.MsgAcceptPayeeship,
              injective.ocr.v1beta1.Tx.MsgAcceptPayeeshipResponse>(
                service, METHODID_ACCEPT_PAYEESHIP)))
        .addMethod(
          getUpdateParamsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              injective.ocr.v1beta1.Tx.MsgUpdateParams,
              injective.ocr.v1beta1.Tx.MsgUpdateParamsResponse>(
                service, METHODID_UPDATE_PARAMS)))
        .build();
  }

  private static abstract class MsgBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    MsgBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return injective.ocr.v1beta1.Tx.getDescriptor();
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
              .addMethod(getCreateFeedMethod())
              .addMethod(getUpdateFeedMethod())
              .addMethod(getTransmitMethod())
              .addMethod(getFundFeedRewardPoolMethod())
              .addMethod(getWithdrawFeedRewardPoolMethod())
              .addMethod(getSetPayeesMethod())
              .addMethod(getTransferPayeeshipMethod())
              .addMethod(getAcceptPayeeshipMethod())
              .addMethod(getUpdateParamsMethod())
              .build();
        }
      }
    }
    return result;
  }
}
