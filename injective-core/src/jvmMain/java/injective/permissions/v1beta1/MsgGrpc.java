package injective.permissions.v1beta1;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * Msg defines the permissions module's gRPC message service.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.54.0)",
    comments = "Source: injective/permissions/v1beta1/tx.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class MsgGrpc {

  private MsgGrpc() {}

  public static final String SERVICE_NAME = "injective.permissions.v1beta1.Msg";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<injective.permissions.v1beta1.Tx.MsgUpdateParams,
      injective.permissions.v1beta1.Tx.MsgUpdateParamsResponse> getUpdateParamsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateParams",
      requestType = injective.permissions.v1beta1.Tx.MsgUpdateParams.class,
      responseType = injective.permissions.v1beta1.Tx.MsgUpdateParamsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<injective.permissions.v1beta1.Tx.MsgUpdateParams,
      injective.permissions.v1beta1.Tx.MsgUpdateParamsResponse> getUpdateParamsMethod() {
    io.grpc.MethodDescriptor<injective.permissions.v1beta1.Tx.MsgUpdateParams, injective.permissions.v1beta1.Tx.MsgUpdateParamsResponse> getUpdateParamsMethod;
    if ((getUpdateParamsMethod = MsgGrpc.getUpdateParamsMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getUpdateParamsMethod = MsgGrpc.getUpdateParamsMethod) == null) {
          MsgGrpc.getUpdateParamsMethod = getUpdateParamsMethod =
              io.grpc.MethodDescriptor.<injective.permissions.v1beta1.Tx.MsgUpdateParams, injective.permissions.v1beta1.Tx.MsgUpdateParamsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateParams"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  injective.permissions.v1beta1.Tx.MsgUpdateParams.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  injective.permissions.v1beta1.Tx.MsgUpdateParamsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("UpdateParams"))
              .build();
        }
      }
    }
    return getUpdateParamsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<injective.permissions.v1beta1.Tx.MsgCreateNamespace,
      injective.permissions.v1beta1.Tx.MsgCreateNamespaceResponse> getCreateNamespaceMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateNamespace",
      requestType = injective.permissions.v1beta1.Tx.MsgCreateNamespace.class,
      responseType = injective.permissions.v1beta1.Tx.MsgCreateNamespaceResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<injective.permissions.v1beta1.Tx.MsgCreateNamespace,
      injective.permissions.v1beta1.Tx.MsgCreateNamespaceResponse> getCreateNamespaceMethod() {
    io.grpc.MethodDescriptor<injective.permissions.v1beta1.Tx.MsgCreateNamespace, injective.permissions.v1beta1.Tx.MsgCreateNamespaceResponse> getCreateNamespaceMethod;
    if ((getCreateNamespaceMethod = MsgGrpc.getCreateNamespaceMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getCreateNamespaceMethod = MsgGrpc.getCreateNamespaceMethod) == null) {
          MsgGrpc.getCreateNamespaceMethod = getCreateNamespaceMethod =
              io.grpc.MethodDescriptor.<injective.permissions.v1beta1.Tx.MsgCreateNamespace, injective.permissions.v1beta1.Tx.MsgCreateNamespaceResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateNamespace"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  injective.permissions.v1beta1.Tx.MsgCreateNamespace.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  injective.permissions.v1beta1.Tx.MsgCreateNamespaceResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("CreateNamespace"))
              .build();
        }
      }
    }
    return getCreateNamespaceMethod;
  }

  private static volatile io.grpc.MethodDescriptor<injective.permissions.v1beta1.Tx.MsgDeleteNamespace,
      injective.permissions.v1beta1.Tx.MsgDeleteNamespaceResponse> getDeleteNamespaceMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteNamespace",
      requestType = injective.permissions.v1beta1.Tx.MsgDeleteNamespace.class,
      responseType = injective.permissions.v1beta1.Tx.MsgDeleteNamespaceResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<injective.permissions.v1beta1.Tx.MsgDeleteNamespace,
      injective.permissions.v1beta1.Tx.MsgDeleteNamespaceResponse> getDeleteNamespaceMethod() {
    io.grpc.MethodDescriptor<injective.permissions.v1beta1.Tx.MsgDeleteNamespace, injective.permissions.v1beta1.Tx.MsgDeleteNamespaceResponse> getDeleteNamespaceMethod;
    if ((getDeleteNamespaceMethod = MsgGrpc.getDeleteNamespaceMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getDeleteNamespaceMethod = MsgGrpc.getDeleteNamespaceMethod) == null) {
          MsgGrpc.getDeleteNamespaceMethod = getDeleteNamespaceMethod =
              io.grpc.MethodDescriptor.<injective.permissions.v1beta1.Tx.MsgDeleteNamespace, injective.permissions.v1beta1.Tx.MsgDeleteNamespaceResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeleteNamespace"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  injective.permissions.v1beta1.Tx.MsgDeleteNamespace.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  injective.permissions.v1beta1.Tx.MsgDeleteNamespaceResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("DeleteNamespace"))
              .build();
        }
      }
    }
    return getDeleteNamespaceMethod;
  }

  private static volatile io.grpc.MethodDescriptor<injective.permissions.v1beta1.Tx.MsgUpdateNamespace,
      injective.permissions.v1beta1.Tx.MsgUpdateNamespaceResponse> getUpdateNamespaceMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateNamespace",
      requestType = injective.permissions.v1beta1.Tx.MsgUpdateNamespace.class,
      responseType = injective.permissions.v1beta1.Tx.MsgUpdateNamespaceResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<injective.permissions.v1beta1.Tx.MsgUpdateNamespace,
      injective.permissions.v1beta1.Tx.MsgUpdateNamespaceResponse> getUpdateNamespaceMethod() {
    io.grpc.MethodDescriptor<injective.permissions.v1beta1.Tx.MsgUpdateNamespace, injective.permissions.v1beta1.Tx.MsgUpdateNamespaceResponse> getUpdateNamespaceMethod;
    if ((getUpdateNamespaceMethod = MsgGrpc.getUpdateNamespaceMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getUpdateNamespaceMethod = MsgGrpc.getUpdateNamespaceMethod) == null) {
          MsgGrpc.getUpdateNamespaceMethod = getUpdateNamespaceMethod =
              io.grpc.MethodDescriptor.<injective.permissions.v1beta1.Tx.MsgUpdateNamespace, injective.permissions.v1beta1.Tx.MsgUpdateNamespaceResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateNamespace"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  injective.permissions.v1beta1.Tx.MsgUpdateNamespace.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  injective.permissions.v1beta1.Tx.MsgUpdateNamespaceResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("UpdateNamespace"))
              .build();
        }
      }
    }
    return getUpdateNamespaceMethod;
  }

  private static volatile io.grpc.MethodDescriptor<injective.permissions.v1beta1.Tx.MsgUpdateNamespaceRoles,
      injective.permissions.v1beta1.Tx.MsgUpdateNamespaceRolesResponse> getUpdateNamespaceRolesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateNamespaceRoles",
      requestType = injective.permissions.v1beta1.Tx.MsgUpdateNamespaceRoles.class,
      responseType = injective.permissions.v1beta1.Tx.MsgUpdateNamespaceRolesResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<injective.permissions.v1beta1.Tx.MsgUpdateNamespaceRoles,
      injective.permissions.v1beta1.Tx.MsgUpdateNamespaceRolesResponse> getUpdateNamespaceRolesMethod() {
    io.grpc.MethodDescriptor<injective.permissions.v1beta1.Tx.MsgUpdateNamespaceRoles, injective.permissions.v1beta1.Tx.MsgUpdateNamespaceRolesResponse> getUpdateNamespaceRolesMethod;
    if ((getUpdateNamespaceRolesMethod = MsgGrpc.getUpdateNamespaceRolesMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getUpdateNamespaceRolesMethod = MsgGrpc.getUpdateNamespaceRolesMethod) == null) {
          MsgGrpc.getUpdateNamespaceRolesMethod = getUpdateNamespaceRolesMethod =
              io.grpc.MethodDescriptor.<injective.permissions.v1beta1.Tx.MsgUpdateNamespaceRoles, injective.permissions.v1beta1.Tx.MsgUpdateNamespaceRolesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateNamespaceRoles"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  injective.permissions.v1beta1.Tx.MsgUpdateNamespaceRoles.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  injective.permissions.v1beta1.Tx.MsgUpdateNamespaceRolesResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("UpdateNamespaceRoles"))
              .build();
        }
      }
    }
    return getUpdateNamespaceRolesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<injective.permissions.v1beta1.Tx.MsgRevokeNamespaceRoles,
      injective.permissions.v1beta1.Tx.MsgRevokeNamespaceRolesResponse> getRevokeNamespaceRolesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "RevokeNamespaceRoles",
      requestType = injective.permissions.v1beta1.Tx.MsgRevokeNamespaceRoles.class,
      responseType = injective.permissions.v1beta1.Tx.MsgRevokeNamespaceRolesResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<injective.permissions.v1beta1.Tx.MsgRevokeNamespaceRoles,
      injective.permissions.v1beta1.Tx.MsgRevokeNamespaceRolesResponse> getRevokeNamespaceRolesMethod() {
    io.grpc.MethodDescriptor<injective.permissions.v1beta1.Tx.MsgRevokeNamespaceRoles, injective.permissions.v1beta1.Tx.MsgRevokeNamespaceRolesResponse> getRevokeNamespaceRolesMethod;
    if ((getRevokeNamespaceRolesMethod = MsgGrpc.getRevokeNamespaceRolesMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getRevokeNamespaceRolesMethod = MsgGrpc.getRevokeNamespaceRolesMethod) == null) {
          MsgGrpc.getRevokeNamespaceRolesMethod = getRevokeNamespaceRolesMethod =
              io.grpc.MethodDescriptor.<injective.permissions.v1beta1.Tx.MsgRevokeNamespaceRoles, injective.permissions.v1beta1.Tx.MsgRevokeNamespaceRolesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "RevokeNamespaceRoles"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  injective.permissions.v1beta1.Tx.MsgRevokeNamespaceRoles.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  injective.permissions.v1beta1.Tx.MsgRevokeNamespaceRolesResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("RevokeNamespaceRoles"))
              .build();
        }
      }
    }
    return getRevokeNamespaceRolesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<injective.permissions.v1beta1.Tx.MsgClaimVoucher,
      injective.permissions.v1beta1.Tx.MsgClaimVoucherResponse> getClaimVoucherMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ClaimVoucher",
      requestType = injective.permissions.v1beta1.Tx.MsgClaimVoucher.class,
      responseType = injective.permissions.v1beta1.Tx.MsgClaimVoucherResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<injective.permissions.v1beta1.Tx.MsgClaimVoucher,
      injective.permissions.v1beta1.Tx.MsgClaimVoucherResponse> getClaimVoucherMethod() {
    io.grpc.MethodDescriptor<injective.permissions.v1beta1.Tx.MsgClaimVoucher, injective.permissions.v1beta1.Tx.MsgClaimVoucherResponse> getClaimVoucherMethod;
    if ((getClaimVoucherMethod = MsgGrpc.getClaimVoucherMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getClaimVoucherMethod = MsgGrpc.getClaimVoucherMethod) == null) {
          MsgGrpc.getClaimVoucherMethod = getClaimVoucherMethod =
              io.grpc.MethodDescriptor.<injective.permissions.v1beta1.Tx.MsgClaimVoucher, injective.permissions.v1beta1.Tx.MsgClaimVoucherResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ClaimVoucher"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  injective.permissions.v1beta1.Tx.MsgClaimVoucher.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  injective.permissions.v1beta1.Tx.MsgClaimVoucherResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("ClaimVoucher"))
              .build();
        }
      }
    }
    return getClaimVoucherMethod;
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
   * Msg defines the permissions module's gRPC message service.
   * </pre>
   */
  public interface AsyncService {

    /**
     */
    default void updateParams(injective.permissions.v1beta1.Tx.MsgUpdateParams request,
        io.grpc.stub.StreamObserver<injective.permissions.v1beta1.Tx.MsgUpdateParamsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateParamsMethod(), responseObserver);
    }

    /**
     */
    default void createNamespace(injective.permissions.v1beta1.Tx.MsgCreateNamespace request,
        io.grpc.stub.StreamObserver<injective.permissions.v1beta1.Tx.MsgCreateNamespaceResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateNamespaceMethod(), responseObserver);
    }

    /**
     */
    default void deleteNamespace(injective.permissions.v1beta1.Tx.MsgDeleteNamespace request,
        io.grpc.stub.StreamObserver<injective.permissions.v1beta1.Tx.MsgDeleteNamespaceResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteNamespaceMethod(), responseObserver);
    }

    /**
     */
    default void updateNamespace(injective.permissions.v1beta1.Tx.MsgUpdateNamespace request,
        io.grpc.stub.StreamObserver<injective.permissions.v1beta1.Tx.MsgUpdateNamespaceResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateNamespaceMethod(), responseObserver);
    }

    /**
     */
    default void updateNamespaceRoles(injective.permissions.v1beta1.Tx.MsgUpdateNamespaceRoles request,
        io.grpc.stub.StreamObserver<injective.permissions.v1beta1.Tx.MsgUpdateNamespaceRolesResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateNamespaceRolesMethod(), responseObserver);
    }

    /**
     */
    default void revokeNamespaceRoles(injective.permissions.v1beta1.Tx.MsgRevokeNamespaceRoles request,
        io.grpc.stub.StreamObserver<injective.permissions.v1beta1.Tx.MsgRevokeNamespaceRolesResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getRevokeNamespaceRolesMethod(), responseObserver);
    }

    /**
     */
    default void claimVoucher(injective.permissions.v1beta1.Tx.MsgClaimVoucher request,
        io.grpc.stub.StreamObserver<injective.permissions.v1beta1.Tx.MsgClaimVoucherResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getClaimVoucherMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service Msg.
   * <pre>
   * Msg defines the permissions module's gRPC message service.
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
   * Msg defines the permissions module's gRPC message service.
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
     */
    public void updateParams(injective.permissions.v1beta1.Tx.MsgUpdateParams request,
        io.grpc.stub.StreamObserver<injective.permissions.v1beta1.Tx.MsgUpdateParamsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateParamsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void createNamespace(injective.permissions.v1beta1.Tx.MsgCreateNamespace request,
        io.grpc.stub.StreamObserver<injective.permissions.v1beta1.Tx.MsgCreateNamespaceResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateNamespaceMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void deleteNamespace(injective.permissions.v1beta1.Tx.MsgDeleteNamespace request,
        io.grpc.stub.StreamObserver<injective.permissions.v1beta1.Tx.MsgDeleteNamespaceResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteNamespaceMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void updateNamespace(injective.permissions.v1beta1.Tx.MsgUpdateNamespace request,
        io.grpc.stub.StreamObserver<injective.permissions.v1beta1.Tx.MsgUpdateNamespaceResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateNamespaceMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void updateNamespaceRoles(injective.permissions.v1beta1.Tx.MsgUpdateNamespaceRoles request,
        io.grpc.stub.StreamObserver<injective.permissions.v1beta1.Tx.MsgUpdateNamespaceRolesResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateNamespaceRolesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void revokeNamespaceRoles(injective.permissions.v1beta1.Tx.MsgRevokeNamespaceRoles request,
        io.grpc.stub.StreamObserver<injective.permissions.v1beta1.Tx.MsgRevokeNamespaceRolesResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getRevokeNamespaceRolesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void claimVoucher(injective.permissions.v1beta1.Tx.MsgClaimVoucher request,
        io.grpc.stub.StreamObserver<injective.permissions.v1beta1.Tx.MsgClaimVoucherResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getClaimVoucherMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service Msg.
   * <pre>
   * Msg defines the permissions module's gRPC message service.
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
     */
    public injective.permissions.v1beta1.Tx.MsgUpdateParamsResponse updateParams(injective.permissions.v1beta1.Tx.MsgUpdateParams request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateParamsMethod(), getCallOptions(), request);
    }

    /**
     */
    public injective.permissions.v1beta1.Tx.MsgCreateNamespaceResponse createNamespace(injective.permissions.v1beta1.Tx.MsgCreateNamespace request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateNamespaceMethod(), getCallOptions(), request);
    }

    /**
     */
    public injective.permissions.v1beta1.Tx.MsgDeleteNamespaceResponse deleteNamespace(injective.permissions.v1beta1.Tx.MsgDeleteNamespace request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteNamespaceMethod(), getCallOptions(), request);
    }

    /**
     */
    public injective.permissions.v1beta1.Tx.MsgUpdateNamespaceResponse updateNamespace(injective.permissions.v1beta1.Tx.MsgUpdateNamespace request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateNamespaceMethod(), getCallOptions(), request);
    }

    /**
     */
    public injective.permissions.v1beta1.Tx.MsgUpdateNamespaceRolesResponse updateNamespaceRoles(injective.permissions.v1beta1.Tx.MsgUpdateNamespaceRoles request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateNamespaceRolesMethod(), getCallOptions(), request);
    }

    /**
     */
    public injective.permissions.v1beta1.Tx.MsgRevokeNamespaceRolesResponse revokeNamespaceRoles(injective.permissions.v1beta1.Tx.MsgRevokeNamespaceRoles request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getRevokeNamespaceRolesMethod(), getCallOptions(), request);
    }

    /**
     */
    public injective.permissions.v1beta1.Tx.MsgClaimVoucherResponse claimVoucher(injective.permissions.v1beta1.Tx.MsgClaimVoucher request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getClaimVoucherMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service Msg.
   * <pre>
   * Msg defines the permissions module's gRPC message service.
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
     */
    public com.google.common.util.concurrent.ListenableFuture<injective.permissions.v1beta1.Tx.MsgUpdateParamsResponse> updateParams(
        injective.permissions.v1beta1.Tx.MsgUpdateParams request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateParamsMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<injective.permissions.v1beta1.Tx.MsgCreateNamespaceResponse> createNamespace(
        injective.permissions.v1beta1.Tx.MsgCreateNamespace request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateNamespaceMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<injective.permissions.v1beta1.Tx.MsgDeleteNamespaceResponse> deleteNamespace(
        injective.permissions.v1beta1.Tx.MsgDeleteNamespace request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteNamespaceMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<injective.permissions.v1beta1.Tx.MsgUpdateNamespaceResponse> updateNamespace(
        injective.permissions.v1beta1.Tx.MsgUpdateNamespace request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateNamespaceMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<injective.permissions.v1beta1.Tx.MsgUpdateNamespaceRolesResponse> updateNamespaceRoles(
        injective.permissions.v1beta1.Tx.MsgUpdateNamespaceRoles request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateNamespaceRolesMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<injective.permissions.v1beta1.Tx.MsgRevokeNamespaceRolesResponse> revokeNamespaceRoles(
        injective.permissions.v1beta1.Tx.MsgRevokeNamespaceRoles request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getRevokeNamespaceRolesMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<injective.permissions.v1beta1.Tx.MsgClaimVoucherResponse> claimVoucher(
        injective.permissions.v1beta1.Tx.MsgClaimVoucher request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getClaimVoucherMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_UPDATE_PARAMS = 0;
  private static final int METHODID_CREATE_NAMESPACE = 1;
  private static final int METHODID_DELETE_NAMESPACE = 2;
  private static final int METHODID_UPDATE_NAMESPACE = 3;
  private static final int METHODID_UPDATE_NAMESPACE_ROLES = 4;
  private static final int METHODID_REVOKE_NAMESPACE_ROLES = 5;
  private static final int METHODID_CLAIM_VOUCHER = 6;

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
        case METHODID_UPDATE_PARAMS:
          serviceImpl.updateParams((injective.permissions.v1beta1.Tx.MsgUpdateParams) request,
              (io.grpc.stub.StreamObserver<injective.permissions.v1beta1.Tx.MsgUpdateParamsResponse>) responseObserver);
          break;
        case METHODID_CREATE_NAMESPACE:
          serviceImpl.createNamespace((injective.permissions.v1beta1.Tx.MsgCreateNamespace) request,
              (io.grpc.stub.StreamObserver<injective.permissions.v1beta1.Tx.MsgCreateNamespaceResponse>) responseObserver);
          break;
        case METHODID_DELETE_NAMESPACE:
          serviceImpl.deleteNamespace((injective.permissions.v1beta1.Tx.MsgDeleteNamespace) request,
              (io.grpc.stub.StreamObserver<injective.permissions.v1beta1.Tx.MsgDeleteNamespaceResponse>) responseObserver);
          break;
        case METHODID_UPDATE_NAMESPACE:
          serviceImpl.updateNamespace((injective.permissions.v1beta1.Tx.MsgUpdateNamespace) request,
              (io.grpc.stub.StreamObserver<injective.permissions.v1beta1.Tx.MsgUpdateNamespaceResponse>) responseObserver);
          break;
        case METHODID_UPDATE_NAMESPACE_ROLES:
          serviceImpl.updateNamespaceRoles((injective.permissions.v1beta1.Tx.MsgUpdateNamespaceRoles) request,
              (io.grpc.stub.StreamObserver<injective.permissions.v1beta1.Tx.MsgUpdateNamespaceRolesResponse>) responseObserver);
          break;
        case METHODID_REVOKE_NAMESPACE_ROLES:
          serviceImpl.revokeNamespaceRoles((injective.permissions.v1beta1.Tx.MsgRevokeNamespaceRoles) request,
              (io.grpc.stub.StreamObserver<injective.permissions.v1beta1.Tx.MsgRevokeNamespaceRolesResponse>) responseObserver);
          break;
        case METHODID_CLAIM_VOUCHER:
          serviceImpl.claimVoucher((injective.permissions.v1beta1.Tx.MsgClaimVoucher) request,
              (io.grpc.stub.StreamObserver<injective.permissions.v1beta1.Tx.MsgClaimVoucherResponse>) responseObserver);
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
          getUpdateParamsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              injective.permissions.v1beta1.Tx.MsgUpdateParams,
              injective.permissions.v1beta1.Tx.MsgUpdateParamsResponse>(
                service, METHODID_UPDATE_PARAMS)))
        .addMethod(
          getCreateNamespaceMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              injective.permissions.v1beta1.Tx.MsgCreateNamespace,
              injective.permissions.v1beta1.Tx.MsgCreateNamespaceResponse>(
                service, METHODID_CREATE_NAMESPACE)))
        .addMethod(
          getDeleteNamespaceMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              injective.permissions.v1beta1.Tx.MsgDeleteNamespace,
              injective.permissions.v1beta1.Tx.MsgDeleteNamespaceResponse>(
                service, METHODID_DELETE_NAMESPACE)))
        .addMethod(
          getUpdateNamespaceMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              injective.permissions.v1beta1.Tx.MsgUpdateNamespace,
              injective.permissions.v1beta1.Tx.MsgUpdateNamespaceResponse>(
                service, METHODID_UPDATE_NAMESPACE)))
        .addMethod(
          getUpdateNamespaceRolesMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              injective.permissions.v1beta1.Tx.MsgUpdateNamespaceRoles,
              injective.permissions.v1beta1.Tx.MsgUpdateNamespaceRolesResponse>(
                service, METHODID_UPDATE_NAMESPACE_ROLES)))
        .addMethod(
          getRevokeNamespaceRolesMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              injective.permissions.v1beta1.Tx.MsgRevokeNamespaceRoles,
              injective.permissions.v1beta1.Tx.MsgRevokeNamespaceRolesResponse>(
                service, METHODID_REVOKE_NAMESPACE_ROLES)))
        .addMethod(
          getClaimVoucherMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              injective.permissions.v1beta1.Tx.MsgClaimVoucher,
              injective.permissions.v1beta1.Tx.MsgClaimVoucherResponse>(
                service, METHODID_CLAIM_VOUCHER)))
        .build();
  }

  private static abstract class MsgBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    MsgBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return injective.permissions.v1beta1.Tx.getDescriptor();
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
              .addMethod(getUpdateParamsMethod())
              .addMethod(getCreateNamespaceMethod())
              .addMethod(getDeleteNamespaceMethod())
              .addMethod(getUpdateNamespaceMethod())
              .addMethod(getUpdateNamespaceRolesMethod())
              .addMethod(getRevokeNamespaceRolesMethod())
              .addMethod(getClaimVoucherMethod())
              .build();
        }
      }
    }
    return result;
  }
}
