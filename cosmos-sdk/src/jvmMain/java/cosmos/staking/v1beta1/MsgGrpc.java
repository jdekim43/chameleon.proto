package cosmos.staking.v1beta1;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * Msg defines the staking Msg service.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.54.0)",
    comments = "Source: cosmos/staking/v1beta1/tx.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class MsgGrpc {

  private MsgGrpc() {}

  public static final String SERVICE_NAME = "cosmos.staking.v1beta1.Msg";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<cosmos.staking.v1beta1.Tx.MsgCreateValidator,
      cosmos.staking.v1beta1.Tx.MsgCreateValidatorResponse> getCreateValidatorMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateValidator",
      requestType = cosmos.staking.v1beta1.Tx.MsgCreateValidator.class,
      responseType = cosmos.staking.v1beta1.Tx.MsgCreateValidatorResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<cosmos.staking.v1beta1.Tx.MsgCreateValidator,
      cosmos.staking.v1beta1.Tx.MsgCreateValidatorResponse> getCreateValidatorMethod() {
    io.grpc.MethodDescriptor<cosmos.staking.v1beta1.Tx.MsgCreateValidator, cosmos.staking.v1beta1.Tx.MsgCreateValidatorResponse> getCreateValidatorMethod;
    if ((getCreateValidatorMethod = MsgGrpc.getCreateValidatorMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getCreateValidatorMethod = MsgGrpc.getCreateValidatorMethod) == null) {
          MsgGrpc.getCreateValidatorMethod = getCreateValidatorMethod =
              io.grpc.MethodDescriptor.<cosmos.staking.v1beta1.Tx.MsgCreateValidator, cosmos.staking.v1beta1.Tx.MsgCreateValidatorResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateValidator"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  cosmos.staking.v1beta1.Tx.MsgCreateValidator.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  cosmos.staking.v1beta1.Tx.MsgCreateValidatorResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("CreateValidator"))
              .build();
        }
      }
    }
    return getCreateValidatorMethod;
  }

  private static volatile io.grpc.MethodDescriptor<cosmos.staking.v1beta1.Tx.MsgEditValidator,
      cosmos.staking.v1beta1.Tx.MsgEditValidatorResponse> getEditValidatorMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "EditValidator",
      requestType = cosmos.staking.v1beta1.Tx.MsgEditValidator.class,
      responseType = cosmos.staking.v1beta1.Tx.MsgEditValidatorResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<cosmos.staking.v1beta1.Tx.MsgEditValidator,
      cosmos.staking.v1beta1.Tx.MsgEditValidatorResponse> getEditValidatorMethod() {
    io.grpc.MethodDescriptor<cosmos.staking.v1beta1.Tx.MsgEditValidator, cosmos.staking.v1beta1.Tx.MsgEditValidatorResponse> getEditValidatorMethod;
    if ((getEditValidatorMethod = MsgGrpc.getEditValidatorMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getEditValidatorMethod = MsgGrpc.getEditValidatorMethod) == null) {
          MsgGrpc.getEditValidatorMethod = getEditValidatorMethod =
              io.grpc.MethodDescriptor.<cosmos.staking.v1beta1.Tx.MsgEditValidator, cosmos.staking.v1beta1.Tx.MsgEditValidatorResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "EditValidator"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  cosmos.staking.v1beta1.Tx.MsgEditValidator.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  cosmos.staking.v1beta1.Tx.MsgEditValidatorResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("EditValidator"))
              .build();
        }
      }
    }
    return getEditValidatorMethod;
  }

  private static volatile io.grpc.MethodDescriptor<cosmos.staking.v1beta1.Tx.MsgDelegate,
      cosmos.staking.v1beta1.Tx.MsgDelegateResponse> getDelegateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Delegate",
      requestType = cosmos.staking.v1beta1.Tx.MsgDelegate.class,
      responseType = cosmos.staking.v1beta1.Tx.MsgDelegateResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<cosmos.staking.v1beta1.Tx.MsgDelegate,
      cosmos.staking.v1beta1.Tx.MsgDelegateResponse> getDelegateMethod() {
    io.grpc.MethodDescriptor<cosmos.staking.v1beta1.Tx.MsgDelegate, cosmos.staking.v1beta1.Tx.MsgDelegateResponse> getDelegateMethod;
    if ((getDelegateMethod = MsgGrpc.getDelegateMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getDelegateMethod = MsgGrpc.getDelegateMethod) == null) {
          MsgGrpc.getDelegateMethod = getDelegateMethod =
              io.grpc.MethodDescriptor.<cosmos.staking.v1beta1.Tx.MsgDelegate, cosmos.staking.v1beta1.Tx.MsgDelegateResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Delegate"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  cosmos.staking.v1beta1.Tx.MsgDelegate.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  cosmos.staking.v1beta1.Tx.MsgDelegateResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("Delegate"))
              .build();
        }
      }
    }
    return getDelegateMethod;
  }

  private static volatile io.grpc.MethodDescriptor<cosmos.staking.v1beta1.Tx.MsgBeginRedelegate,
      cosmos.staking.v1beta1.Tx.MsgBeginRedelegateResponse> getBeginRedelegateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "BeginRedelegate",
      requestType = cosmos.staking.v1beta1.Tx.MsgBeginRedelegate.class,
      responseType = cosmos.staking.v1beta1.Tx.MsgBeginRedelegateResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<cosmos.staking.v1beta1.Tx.MsgBeginRedelegate,
      cosmos.staking.v1beta1.Tx.MsgBeginRedelegateResponse> getBeginRedelegateMethod() {
    io.grpc.MethodDescriptor<cosmos.staking.v1beta1.Tx.MsgBeginRedelegate, cosmos.staking.v1beta1.Tx.MsgBeginRedelegateResponse> getBeginRedelegateMethod;
    if ((getBeginRedelegateMethod = MsgGrpc.getBeginRedelegateMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getBeginRedelegateMethod = MsgGrpc.getBeginRedelegateMethod) == null) {
          MsgGrpc.getBeginRedelegateMethod = getBeginRedelegateMethod =
              io.grpc.MethodDescriptor.<cosmos.staking.v1beta1.Tx.MsgBeginRedelegate, cosmos.staking.v1beta1.Tx.MsgBeginRedelegateResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "BeginRedelegate"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  cosmos.staking.v1beta1.Tx.MsgBeginRedelegate.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  cosmos.staking.v1beta1.Tx.MsgBeginRedelegateResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("BeginRedelegate"))
              .build();
        }
      }
    }
    return getBeginRedelegateMethod;
  }

  private static volatile io.grpc.MethodDescriptor<cosmos.staking.v1beta1.Tx.MsgUndelegate,
      cosmos.staking.v1beta1.Tx.MsgUndelegateResponse> getUndelegateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Undelegate",
      requestType = cosmos.staking.v1beta1.Tx.MsgUndelegate.class,
      responseType = cosmos.staking.v1beta1.Tx.MsgUndelegateResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<cosmos.staking.v1beta1.Tx.MsgUndelegate,
      cosmos.staking.v1beta1.Tx.MsgUndelegateResponse> getUndelegateMethod() {
    io.grpc.MethodDescriptor<cosmos.staking.v1beta1.Tx.MsgUndelegate, cosmos.staking.v1beta1.Tx.MsgUndelegateResponse> getUndelegateMethod;
    if ((getUndelegateMethod = MsgGrpc.getUndelegateMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getUndelegateMethod = MsgGrpc.getUndelegateMethod) == null) {
          MsgGrpc.getUndelegateMethod = getUndelegateMethod =
              io.grpc.MethodDescriptor.<cosmos.staking.v1beta1.Tx.MsgUndelegate, cosmos.staking.v1beta1.Tx.MsgUndelegateResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Undelegate"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  cosmos.staking.v1beta1.Tx.MsgUndelegate.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  cosmos.staking.v1beta1.Tx.MsgUndelegateResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("Undelegate"))
              .build();
        }
      }
    }
    return getUndelegateMethod;
  }

  private static volatile io.grpc.MethodDescriptor<cosmos.staking.v1beta1.Tx.MsgCancelUnbondingDelegation,
      cosmos.staking.v1beta1.Tx.MsgCancelUnbondingDelegationResponse> getCancelUnbondingDelegationMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CancelUnbondingDelegation",
      requestType = cosmos.staking.v1beta1.Tx.MsgCancelUnbondingDelegation.class,
      responseType = cosmos.staking.v1beta1.Tx.MsgCancelUnbondingDelegationResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<cosmos.staking.v1beta1.Tx.MsgCancelUnbondingDelegation,
      cosmos.staking.v1beta1.Tx.MsgCancelUnbondingDelegationResponse> getCancelUnbondingDelegationMethod() {
    io.grpc.MethodDescriptor<cosmos.staking.v1beta1.Tx.MsgCancelUnbondingDelegation, cosmos.staking.v1beta1.Tx.MsgCancelUnbondingDelegationResponse> getCancelUnbondingDelegationMethod;
    if ((getCancelUnbondingDelegationMethod = MsgGrpc.getCancelUnbondingDelegationMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getCancelUnbondingDelegationMethod = MsgGrpc.getCancelUnbondingDelegationMethod) == null) {
          MsgGrpc.getCancelUnbondingDelegationMethod = getCancelUnbondingDelegationMethod =
              io.grpc.MethodDescriptor.<cosmos.staking.v1beta1.Tx.MsgCancelUnbondingDelegation, cosmos.staking.v1beta1.Tx.MsgCancelUnbondingDelegationResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CancelUnbondingDelegation"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  cosmos.staking.v1beta1.Tx.MsgCancelUnbondingDelegation.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  cosmos.staking.v1beta1.Tx.MsgCancelUnbondingDelegationResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("CancelUnbondingDelegation"))
              .build();
        }
      }
    }
    return getCancelUnbondingDelegationMethod;
  }

  private static volatile io.grpc.MethodDescriptor<cosmos.staking.v1beta1.Tx.MsgUpdateParams,
      cosmos.staking.v1beta1.Tx.MsgUpdateParamsResponse> getUpdateParamsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateParams",
      requestType = cosmos.staking.v1beta1.Tx.MsgUpdateParams.class,
      responseType = cosmos.staking.v1beta1.Tx.MsgUpdateParamsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<cosmos.staking.v1beta1.Tx.MsgUpdateParams,
      cosmos.staking.v1beta1.Tx.MsgUpdateParamsResponse> getUpdateParamsMethod() {
    io.grpc.MethodDescriptor<cosmos.staking.v1beta1.Tx.MsgUpdateParams, cosmos.staking.v1beta1.Tx.MsgUpdateParamsResponse> getUpdateParamsMethod;
    if ((getUpdateParamsMethod = MsgGrpc.getUpdateParamsMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getUpdateParamsMethod = MsgGrpc.getUpdateParamsMethod) == null) {
          MsgGrpc.getUpdateParamsMethod = getUpdateParamsMethod =
              io.grpc.MethodDescriptor.<cosmos.staking.v1beta1.Tx.MsgUpdateParams, cosmos.staking.v1beta1.Tx.MsgUpdateParamsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateParams"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  cosmos.staking.v1beta1.Tx.MsgUpdateParams.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  cosmos.staking.v1beta1.Tx.MsgUpdateParamsResponse.getDefaultInstance()))
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
   * Msg defines the staking Msg service.
   * </pre>
   */
  public interface AsyncService {

    /**
     * <pre>
     * CreateValidator defines a method for creating a new validator.
     * </pre>
     */
    default void createValidator(cosmos.staking.v1beta1.Tx.MsgCreateValidator request,
        io.grpc.stub.StreamObserver<cosmos.staking.v1beta1.Tx.MsgCreateValidatorResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateValidatorMethod(), responseObserver);
    }

    /**
     * <pre>
     * EditValidator defines a method for editing an existing validator.
     * </pre>
     */
    default void editValidator(cosmos.staking.v1beta1.Tx.MsgEditValidator request,
        io.grpc.stub.StreamObserver<cosmos.staking.v1beta1.Tx.MsgEditValidatorResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getEditValidatorMethod(), responseObserver);
    }

    /**
     * <pre>
     * Delegate defines a method for performing a delegation of coins
     * from a delegator to a validator.
     * </pre>
     */
    default void delegate(cosmos.staking.v1beta1.Tx.MsgDelegate request,
        io.grpc.stub.StreamObserver<cosmos.staking.v1beta1.Tx.MsgDelegateResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDelegateMethod(), responseObserver);
    }

    /**
     * <pre>
     * BeginRedelegate defines a method for performing a redelegation
     * of coins from a delegator and source validator to a destination validator.
     * </pre>
     */
    default void beginRedelegate(cosmos.staking.v1beta1.Tx.MsgBeginRedelegate request,
        io.grpc.stub.StreamObserver<cosmos.staking.v1beta1.Tx.MsgBeginRedelegateResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getBeginRedelegateMethod(), responseObserver);
    }

    /**
     * <pre>
     * Undelegate defines a method for performing an undelegation from a
     * delegate and a validator.
     * </pre>
     */
    default void undelegate(cosmos.staking.v1beta1.Tx.MsgUndelegate request,
        io.grpc.stub.StreamObserver<cosmos.staking.v1beta1.Tx.MsgUndelegateResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUndelegateMethod(), responseObserver);
    }

    /**
     * <pre>
     * CancelUnbondingDelegation defines a method for performing canceling the unbonding delegation
     * and delegate back to previous validator.
     * Since: cosmos-sdk 0.46
     * </pre>
     */
    default void cancelUnbondingDelegation(cosmos.staking.v1beta1.Tx.MsgCancelUnbondingDelegation request,
        io.grpc.stub.StreamObserver<cosmos.staking.v1beta1.Tx.MsgCancelUnbondingDelegationResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCancelUnbondingDelegationMethod(), responseObserver);
    }

    /**
     * <pre>
     * UpdateParams defines an operation for updating the x/staking module
     * parameters.
     * Since: cosmos-sdk 0.47
     * </pre>
     */
    default void updateParams(cosmos.staking.v1beta1.Tx.MsgUpdateParams request,
        io.grpc.stub.StreamObserver<cosmos.staking.v1beta1.Tx.MsgUpdateParamsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateParamsMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service Msg.
   * <pre>
   * Msg defines the staking Msg service.
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
   * Msg defines the staking Msg service.
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
     * CreateValidator defines a method for creating a new validator.
     * </pre>
     */
    public void createValidator(cosmos.staking.v1beta1.Tx.MsgCreateValidator request,
        io.grpc.stub.StreamObserver<cosmos.staking.v1beta1.Tx.MsgCreateValidatorResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateValidatorMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * EditValidator defines a method for editing an existing validator.
     * </pre>
     */
    public void editValidator(cosmos.staking.v1beta1.Tx.MsgEditValidator request,
        io.grpc.stub.StreamObserver<cosmos.staking.v1beta1.Tx.MsgEditValidatorResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getEditValidatorMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Delegate defines a method for performing a delegation of coins
     * from a delegator to a validator.
     * </pre>
     */
    public void delegate(cosmos.staking.v1beta1.Tx.MsgDelegate request,
        io.grpc.stub.StreamObserver<cosmos.staking.v1beta1.Tx.MsgDelegateResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDelegateMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * BeginRedelegate defines a method for performing a redelegation
     * of coins from a delegator and source validator to a destination validator.
     * </pre>
     */
    public void beginRedelegate(cosmos.staking.v1beta1.Tx.MsgBeginRedelegate request,
        io.grpc.stub.StreamObserver<cosmos.staking.v1beta1.Tx.MsgBeginRedelegateResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getBeginRedelegateMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Undelegate defines a method for performing an undelegation from a
     * delegate and a validator.
     * </pre>
     */
    public void undelegate(cosmos.staking.v1beta1.Tx.MsgUndelegate request,
        io.grpc.stub.StreamObserver<cosmos.staking.v1beta1.Tx.MsgUndelegateResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUndelegateMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * CancelUnbondingDelegation defines a method for performing canceling the unbonding delegation
     * and delegate back to previous validator.
     * Since: cosmos-sdk 0.46
     * </pre>
     */
    public void cancelUnbondingDelegation(cosmos.staking.v1beta1.Tx.MsgCancelUnbondingDelegation request,
        io.grpc.stub.StreamObserver<cosmos.staking.v1beta1.Tx.MsgCancelUnbondingDelegationResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCancelUnbondingDelegationMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * UpdateParams defines an operation for updating the x/staking module
     * parameters.
     * Since: cosmos-sdk 0.47
     * </pre>
     */
    public void updateParams(cosmos.staking.v1beta1.Tx.MsgUpdateParams request,
        io.grpc.stub.StreamObserver<cosmos.staking.v1beta1.Tx.MsgUpdateParamsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateParamsMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service Msg.
   * <pre>
   * Msg defines the staking Msg service.
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
     * CreateValidator defines a method for creating a new validator.
     * </pre>
     */
    public cosmos.staking.v1beta1.Tx.MsgCreateValidatorResponse createValidator(cosmos.staking.v1beta1.Tx.MsgCreateValidator request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateValidatorMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * EditValidator defines a method for editing an existing validator.
     * </pre>
     */
    public cosmos.staking.v1beta1.Tx.MsgEditValidatorResponse editValidator(cosmos.staking.v1beta1.Tx.MsgEditValidator request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getEditValidatorMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Delegate defines a method for performing a delegation of coins
     * from a delegator to a validator.
     * </pre>
     */
    public cosmos.staking.v1beta1.Tx.MsgDelegateResponse delegate(cosmos.staking.v1beta1.Tx.MsgDelegate request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDelegateMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * BeginRedelegate defines a method for performing a redelegation
     * of coins from a delegator and source validator to a destination validator.
     * </pre>
     */
    public cosmos.staking.v1beta1.Tx.MsgBeginRedelegateResponse beginRedelegate(cosmos.staking.v1beta1.Tx.MsgBeginRedelegate request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getBeginRedelegateMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Undelegate defines a method for performing an undelegation from a
     * delegate and a validator.
     * </pre>
     */
    public cosmos.staking.v1beta1.Tx.MsgUndelegateResponse undelegate(cosmos.staking.v1beta1.Tx.MsgUndelegate request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUndelegateMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * CancelUnbondingDelegation defines a method for performing canceling the unbonding delegation
     * and delegate back to previous validator.
     * Since: cosmos-sdk 0.46
     * </pre>
     */
    public cosmos.staking.v1beta1.Tx.MsgCancelUnbondingDelegationResponse cancelUnbondingDelegation(cosmos.staking.v1beta1.Tx.MsgCancelUnbondingDelegation request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCancelUnbondingDelegationMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * UpdateParams defines an operation for updating the x/staking module
     * parameters.
     * Since: cosmos-sdk 0.47
     * </pre>
     */
    public cosmos.staking.v1beta1.Tx.MsgUpdateParamsResponse updateParams(cosmos.staking.v1beta1.Tx.MsgUpdateParams request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateParamsMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service Msg.
   * <pre>
   * Msg defines the staking Msg service.
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
     * CreateValidator defines a method for creating a new validator.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<cosmos.staking.v1beta1.Tx.MsgCreateValidatorResponse> createValidator(
        cosmos.staking.v1beta1.Tx.MsgCreateValidator request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateValidatorMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * EditValidator defines a method for editing an existing validator.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<cosmos.staking.v1beta1.Tx.MsgEditValidatorResponse> editValidator(
        cosmos.staking.v1beta1.Tx.MsgEditValidator request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getEditValidatorMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Delegate defines a method for performing a delegation of coins
     * from a delegator to a validator.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<cosmos.staking.v1beta1.Tx.MsgDelegateResponse> delegate(
        cosmos.staking.v1beta1.Tx.MsgDelegate request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDelegateMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * BeginRedelegate defines a method for performing a redelegation
     * of coins from a delegator and source validator to a destination validator.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<cosmos.staking.v1beta1.Tx.MsgBeginRedelegateResponse> beginRedelegate(
        cosmos.staking.v1beta1.Tx.MsgBeginRedelegate request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getBeginRedelegateMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Undelegate defines a method for performing an undelegation from a
     * delegate and a validator.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<cosmos.staking.v1beta1.Tx.MsgUndelegateResponse> undelegate(
        cosmos.staking.v1beta1.Tx.MsgUndelegate request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUndelegateMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * CancelUnbondingDelegation defines a method for performing canceling the unbonding delegation
     * and delegate back to previous validator.
     * Since: cosmos-sdk 0.46
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<cosmos.staking.v1beta1.Tx.MsgCancelUnbondingDelegationResponse> cancelUnbondingDelegation(
        cosmos.staking.v1beta1.Tx.MsgCancelUnbondingDelegation request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCancelUnbondingDelegationMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * UpdateParams defines an operation for updating the x/staking module
     * parameters.
     * Since: cosmos-sdk 0.47
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<cosmos.staking.v1beta1.Tx.MsgUpdateParamsResponse> updateParams(
        cosmos.staking.v1beta1.Tx.MsgUpdateParams request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateParamsMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_CREATE_VALIDATOR = 0;
  private static final int METHODID_EDIT_VALIDATOR = 1;
  private static final int METHODID_DELEGATE = 2;
  private static final int METHODID_BEGIN_REDELEGATE = 3;
  private static final int METHODID_UNDELEGATE = 4;
  private static final int METHODID_CANCEL_UNBONDING_DELEGATION = 5;
  private static final int METHODID_UPDATE_PARAMS = 6;

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
        case METHODID_CREATE_VALIDATOR:
          serviceImpl.createValidator((cosmos.staking.v1beta1.Tx.MsgCreateValidator) request,
              (io.grpc.stub.StreamObserver<cosmos.staking.v1beta1.Tx.MsgCreateValidatorResponse>) responseObserver);
          break;
        case METHODID_EDIT_VALIDATOR:
          serviceImpl.editValidator((cosmos.staking.v1beta1.Tx.MsgEditValidator) request,
              (io.grpc.stub.StreamObserver<cosmos.staking.v1beta1.Tx.MsgEditValidatorResponse>) responseObserver);
          break;
        case METHODID_DELEGATE:
          serviceImpl.delegate((cosmos.staking.v1beta1.Tx.MsgDelegate) request,
              (io.grpc.stub.StreamObserver<cosmos.staking.v1beta1.Tx.MsgDelegateResponse>) responseObserver);
          break;
        case METHODID_BEGIN_REDELEGATE:
          serviceImpl.beginRedelegate((cosmos.staking.v1beta1.Tx.MsgBeginRedelegate) request,
              (io.grpc.stub.StreamObserver<cosmos.staking.v1beta1.Tx.MsgBeginRedelegateResponse>) responseObserver);
          break;
        case METHODID_UNDELEGATE:
          serviceImpl.undelegate((cosmos.staking.v1beta1.Tx.MsgUndelegate) request,
              (io.grpc.stub.StreamObserver<cosmos.staking.v1beta1.Tx.MsgUndelegateResponse>) responseObserver);
          break;
        case METHODID_CANCEL_UNBONDING_DELEGATION:
          serviceImpl.cancelUnbondingDelegation((cosmos.staking.v1beta1.Tx.MsgCancelUnbondingDelegation) request,
              (io.grpc.stub.StreamObserver<cosmos.staking.v1beta1.Tx.MsgCancelUnbondingDelegationResponse>) responseObserver);
          break;
        case METHODID_UPDATE_PARAMS:
          serviceImpl.updateParams((cosmos.staking.v1beta1.Tx.MsgUpdateParams) request,
              (io.grpc.stub.StreamObserver<cosmos.staking.v1beta1.Tx.MsgUpdateParamsResponse>) responseObserver);
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
          getCreateValidatorMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              cosmos.staking.v1beta1.Tx.MsgCreateValidator,
              cosmos.staking.v1beta1.Tx.MsgCreateValidatorResponse>(
                service, METHODID_CREATE_VALIDATOR)))
        .addMethod(
          getEditValidatorMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              cosmos.staking.v1beta1.Tx.MsgEditValidator,
              cosmos.staking.v1beta1.Tx.MsgEditValidatorResponse>(
                service, METHODID_EDIT_VALIDATOR)))
        .addMethod(
          getDelegateMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              cosmos.staking.v1beta1.Tx.MsgDelegate,
              cosmos.staking.v1beta1.Tx.MsgDelegateResponse>(
                service, METHODID_DELEGATE)))
        .addMethod(
          getBeginRedelegateMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              cosmos.staking.v1beta1.Tx.MsgBeginRedelegate,
              cosmos.staking.v1beta1.Tx.MsgBeginRedelegateResponse>(
                service, METHODID_BEGIN_REDELEGATE)))
        .addMethod(
          getUndelegateMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              cosmos.staking.v1beta1.Tx.MsgUndelegate,
              cosmos.staking.v1beta1.Tx.MsgUndelegateResponse>(
                service, METHODID_UNDELEGATE)))
        .addMethod(
          getCancelUnbondingDelegationMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              cosmos.staking.v1beta1.Tx.MsgCancelUnbondingDelegation,
              cosmos.staking.v1beta1.Tx.MsgCancelUnbondingDelegationResponse>(
                service, METHODID_CANCEL_UNBONDING_DELEGATION)))
        .addMethod(
          getUpdateParamsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              cosmos.staking.v1beta1.Tx.MsgUpdateParams,
              cosmos.staking.v1beta1.Tx.MsgUpdateParamsResponse>(
                service, METHODID_UPDATE_PARAMS)))
        .build();
  }

  private static abstract class MsgBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    MsgBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return cosmos.staking.v1beta1.Tx.getDescriptor();
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
              .addMethod(getCreateValidatorMethod())
              .addMethod(getEditValidatorMethod())
              .addMethod(getDelegateMethod())
              .addMethod(getBeginRedelegateMethod())
              .addMethod(getUndelegateMethod())
              .addMethod(getCancelUnbondingDelegationMethod())
              .addMethod(getUpdateParamsMethod())
              .build();
        }
      }
    }
    return result;
  }
}
