package injective.permissions.v1beta1;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * Query defines the gRPC querier service.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.54.0)",
    comments = "Source: injective/permissions/v1beta1/query.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class QueryGrpc {

  private QueryGrpc() {}

  public static final String SERVICE_NAME = "injective.permissions.v1beta1.Query";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<injective.permissions.v1beta1.QueryOuterClass.QueryParamsRequest,
      injective.permissions.v1beta1.QueryOuterClass.QueryParamsResponse> getParamsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Params",
      requestType = injective.permissions.v1beta1.QueryOuterClass.QueryParamsRequest.class,
      responseType = injective.permissions.v1beta1.QueryOuterClass.QueryParamsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<injective.permissions.v1beta1.QueryOuterClass.QueryParamsRequest,
      injective.permissions.v1beta1.QueryOuterClass.QueryParamsResponse> getParamsMethod() {
    io.grpc.MethodDescriptor<injective.permissions.v1beta1.QueryOuterClass.QueryParamsRequest, injective.permissions.v1beta1.QueryOuterClass.QueryParamsResponse> getParamsMethod;
    if ((getParamsMethod = QueryGrpc.getParamsMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getParamsMethod = QueryGrpc.getParamsMethod) == null) {
          QueryGrpc.getParamsMethod = getParamsMethod =
              io.grpc.MethodDescriptor.<injective.permissions.v1beta1.QueryOuterClass.QueryParamsRequest, injective.permissions.v1beta1.QueryOuterClass.QueryParamsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Params"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  injective.permissions.v1beta1.QueryOuterClass.QueryParamsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  injective.permissions.v1beta1.QueryOuterClass.QueryParamsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("Params"))
              .build();
        }
      }
    }
    return getParamsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<injective.permissions.v1beta1.QueryOuterClass.QueryAllNamespacesRequest,
      injective.permissions.v1beta1.QueryOuterClass.QueryAllNamespacesResponse> getAllNamespacesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "AllNamespaces",
      requestType = injective.permissions.v1beta1.QueryOuterClass.QueryAllNamespacesRequest.class,
      responseType = injective.permissions.v1beta1.QueryOuterClass.QueryAllNamespacesResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<injective.permissions.v1beta1.QueryOuterClass.QueryAllNamespacesRequest,
      injective.permissions.v1beta1.QueryOuterClass.QueryAllNamespacesResponse> getAllNamespacesMethod() {
    io.grpc.MethodDescriptor<injective.permissions.v1beta1.QueryOuterClass.QueryAllNamespacesRequest, injective.permissions.v1beta1.QueryOuterClass.QueryAllNamespacesResponse> getAllNamespacesMethod;
    if ((getAllNamespacesMethod = QueryGrpc.getAllNamespacesMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getAllNamespacesMethod = QueryGrpc.getAllNamespacesMethod) == null) {
          QueryGrpc.getAllNamespacesMethod = getAllNamespacesMethod =
              io.grpc.MethodDescriptor.<injective.permissions.v1beta1.QueryOuterClass.QueryAllNamespacesRequest, injective.permissions.v1beta1.QueryOuterClass.QueryAllNamespacesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "AllNamespaces"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  injective.permissions.v1beta1.QueryOuterClass.QueryAllNamespacesRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  injective.permissions.v1beta1.QueryOuterClass.QueryAllNamespacesResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("AllNamespaces"))
              .build();
        }
      }
    }
    return getAllNamespacesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<injective.permissions.v1beta1.QueryOuterClass.QueryNamespaceByDenomRequest,
      injective.permissions.v1beta1.QueryOuterClass.QueryNamespaceByDenomResponse> getNamespaceByDenomMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "NamespaceByDenom",
      requestType = injective.permissions.v1beta1.QueryOuterClass.QueryNamespaceByDenomRequest.class,
      responseType = injective.permissions.v1beta1.QueryOuterClass.QueryNamespaceByDenomResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<injective.permissions.v1beta1.QueryOuterClass.QueryNamespaceByDenomRequest,
      injective.permissions.v1beta1.QueryOuterClass.QueryNamespaceByDenomResponse> getNamespaceByDenomMethod() {
    io.grpc.MethodDescriptor<injective.permissions.v1beta1.QueryOuterClass.QueryNamespaceByDenomRequest, injective.permissions.v1beta1.QueryOuterClass.QueryNamespaceByDenomResponse> getNamespaceByDenomMethod;
    if ((getNamespaceByDenomMethod = QueryGrpc.getNamespaceByDenomMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getNamespaceByDenomMethod = QueryGrpc.getNamespaceByDenomMethod) == null) {
          QueryGrpc.getNamespaceByDenomMethod = getNamespaceByDenomMethod =
              io.grpc.MethodDescriptor.<injective.permissions.v1beta1.QueryOuterClass.QueryNamespaceByDenomRequest, injective.permissions.v1beta1.QueryOuterClass.QueryNamespaceByDenomResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "NamespaceByDenom"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  injective.permissions.v1beta1.QueryOuterClass.QueryNamespaceByDenomRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  injective.permissions.v1beta1.QueryOuterClass.QueryNamespaceByDenomResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("NamespaceByDenom"))
              .build();
        }
      }
    }
    return getNamespaceByDenomMethod;
  }

  private static volatile io.grpc.MethodDescriptor<injective.permissions.v1beta1.QueryOuterClass.QueryAddressRolesRequest,
      injective.permissions.v1beta1.QueryOuterClass.QueryAddressRolesResponse> getAddressRolesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "AddressRoles",
      requestType = injective.permissions.v1beta1.QueryOuterClass.QueryAddressRolesRequest.class,
      responseType = injective.permissions.v1beta1.QueryOuterClass.QueryAddressRolesResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<injective.permissions.v1beta1.QueryOuterClass.QueryAddressRolesRequest,
      injective.permissions.v1beta1.QueryOuterClass.QueryAddressRolesResponse> getAddressRolesMethod() {
    io.grpc.MethodDescriptor<injective.permissions.v1beta1.QueryOuterClass.QueryAddressRolesRequest, injective.permissions.v1beta1.QueryOuterClass.QueryAddressRolesResponse> getAddressRolesMethod;
    if ((getAddressRolesMethod = QueryGrpc.getAddressRolesMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getAddressRolesMethod = QueryGrpc.getAddressRolesMethod) == null) {
          QueryGrpc.getAddressRolesMethod = getAddressRolesMethod =
              io.grpc.MethodDescriptor.<injective.permissions.v1beta1.QueryOuterClass.QueryAddressRolesRequest, injective.permissions.v1beta1.QueryOuterClass.QueryAddressRolesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "AddressRoles"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  injective.permissions.v1beta1.QueryOuterClass.QueryAddressRolesRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  injective.permissions.v1beta1.QueryOuterClass.QueryAddressRolesResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("AddressRoles"))
              .build();
        }
      }
    }
    return getAddressRolesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<injective.permissions.v1beta1.QueryOuterClass.QueryAddressesByRoleRequest,
      injective.permissions.v1beta1.QueryOuterClass.QueryAddressesByRoleResponse> getAddressesByRoleMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "AddressesByRole",
      requestType = injective.permissions.v1beta1.QueryOuterClass.QueryAddressesByRoleRequest.class,
      responseType = injective.permissions.v1beta1.QueryOuterClass.QueryAddressesByRoleResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<injective.permissions.v1beta1.QueryOuterClass.QueryAddressesByRoleRequest,
      injective.permissions.v1beta1.QueryOuterClass.QueryAddressesByRoleResponse> getAddressesByRoleMethod() {
    io.grpc.MethodDescriptor<injective.permissions.v1beta1.QueryOuterClass.QueryAddressesByRoleRequest, injective.permissions.v1beta1.QueryOuterClass.QueryAddressesByRoleResponse> getAddressesByRoleMethod;
    if ((getAddressesByRoleMethod = QueryGrpc.getAddressesByRoleMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getAddressesByRoleMethod = QueryGrpc.getAddressesByRoleMethod) == null) {
          QueryGrpc.getAddressesByRoleMethod = getAddressesByRoleMethod =
              io.grpc.MethodDescriptor.<injective.permissions.v1beta1.QueryOuterClass.QueryAddressesByRoleRequest, injective.permissions.v1beta1.QueryOuterClass.QueryAddressesByRoleResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "AddressesByRole"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  injective.permissions.v1beta1.QueryOuterClass.QueryAddressesByRoleRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  injective.permissions.v1beta1.QueryOuterClass.QueryAddressesByRoleResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("AddressesByRole"))
              .build();
        }
      }
    }
    return getAddressesByRoleMethod;
  }

  private static volatile io.grpc.MethodDescriptor<injective.permissions.v1beta1.QueryOuterClass.QueryVouchersForAddressRequest,
      injective.permissions.v1beta1.QueryOuterClass.QueryVouchersForAddressResponse> getVouchersForAddressMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "VouchersForAddress",
      requestType = injective.permissions.v1beta1.QueryOuterClass.QueryVouchersForAddressRequest.class,
      responseType = injective.permissions.v1beta1.QueryOuterClass.QueryVouchersForAddressResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<injective.permissions.v1beta1.QueryOuterClass.QueryVouchersForAddressRequest,
      injective.permissions.v1beta1.QueryOuterClass.QueryVouchersForAddressResponse> getVouchersForAddressMethod() {
    io.grpc.MethodDescriptor<injective.permissions.v1beta1.QueryOuterClass.QueryVouchersForAddressRequest, injective.permissions.v1beta1.QueryOuterClass.QueryVouchersForAddressResponse> getVouchersForAddressMethod;
    if ((getVouchersForAddressMethod = QueryGrpc.getVouchersForAddressMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getVouchersForAddressMethod = QueryGrpc.getVouchersForAddressMethod) == null) {
          QueryGrpc.getVouchersForAddressMethod = getVouchersForAddressMethod =
              io.grpc.MethodDescriptor.<injective.permissions.v1beta1.QueryOuterClass.QueryVouchersForAddressRequest, injective.permissions.v1beta1.QueryOuterClass.QueryVouchersForAddressResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "VouchersForAddress"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  injective.permissions.v1beta1.QueryOuterClass.QueryVouchersForAddressRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  injective.permissions.v1beta1.QueryOuterClass.QueryVouchersForAddressResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("VouchersForAddress"))
              .build();
        }
      }
    }
    return getVouchersForAddressMethod;
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
     * Params defines a gRPC query method that returns the permissions module's
     * parameters.
     * </pre>
     */
    default void params(injective.permissions.v1beta1.QueryOuterClass.QueryParamsRequest request,
        io.grpc.stub.StreamObserver<injective.permissions.v1beta1.QueryOuterClass.QueryParamsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getParamsMethod(), responseObserver);
    }

    /**
     * <pre>
     * AllNamespaces defines a gRPC query method that returns the permissions
     * module's created namespaces.
     * </pre>
     */
    default void allNamespaces(injective.permissions.v1beta1.QueryOuterClass.QueryAllNamespacesRequest request,
        io.grpc.stub.StreamObserver<injective.permissions.v1beta1.QueryOuterClass.QueryAllNamespacesResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getAllNamespacesMethod(), responseObserver);
    }

    /**
     * <pre>
     * NamespaceByDenom defines a gRPC query method that returns the permissions
     * module's namespace associated with the provided denom.
     * </pre>
     */
    default void namespaceByDenom(injective.permissions.v1beta1.QueryOuterClass.QueryNamespaceByDenomRequest request,
        io.grpc.stub.StreamObserver<injective.permissions.v1beta1.QueryOuterClass.QueryNamespaceByDenomResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getNamespaceByDenomMethod(), responseObserver);
    }

    /**
     * <pre>
     * AddressRoles defines a gRPC query method that returns address roles in the
     * namespace
     * </pre>
     */
    default void addressRoles(injective.permissions.v1beta1.QueryOuterClass.QueryAddressRolesRequest request,
        io.grpc.stub.StreamObserver<injective.permissions.v1beta1.QueryOuterClass.QueryAddressRolesResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getAddressRolesMethod(), responseObserver);
    }

    /**
     * <pre>
     * AddressesByRole defines a gRPC query method that returns a namespace's
     * roles associated with the provided address.
     * </pre>
     */
    default void addressesByRole(injective.permissions.v1beta1.QueryOuterClass.QueryAddressesByRoleRequest request,
        io.grpc.stub.StreamObserver<injective.permissions.v1beta1.QueryOuterClass.QueryAddressesByRoleResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getAddressesByRoleMethod(), responseObserver);
    }

    /**
     * <pre>
     * VouchersForAddress defines a gRPC query method that returns a map of
     * vouchers that are held by permissions module for this address, keyed by the
     * originator address
     * </pre>
     */
    default void vouchersForAddress(injective.permissions.v1beta1.QueryOuterClass.QueryVouchersForAddressRequest request,
        io.grpc.stub.StreamObserver<injective.permissions.v1beta1.QueryOuterClass.QueryVouchersForAddressResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getVouchersForAddressMethod(), responseObserver);
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
     * Params defines a gRPC query method that returns the permissions module's
     * parameters.
     * </pre>
     */
    public void params(injective.permissions.v1beta1.QueryOuterClass.QueryParamsRequest request,
        io.grpc.stub.StreamObserver<injective.permissions.v1beta1.QueryOuterClass.QueryParamsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getParamsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * AllNamespaces defines a gRPC query method that returns the permissions
     * module's created namespaces.
     * </pre>
     */
    public void allNamespaces(injective.permissions.v1beta1.QueryOuterClass.QueryAllNamespacesRequest request,
        io.grpc.stub.StreamObserver<injective.permissions.v1beta1.QueryOuterClass.QueryAllNamespacesResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getAllNamespacesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * NamespaceByDenom defines a gRPC query method that returns the permissions
     * module's namespace associated with the provided denom.
     * </pre>
     */
    public void namespaceByDenom(injective.permissions.v1beta1.QueryOuterClass.QueryNamespaceByDenomRequest request,
        io.grpc.stub.StreamObserver<injective.permissions.v1beta1.QueryOuterClass.QueryNamespaceByDenomResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getNamespaceByDenomMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * AddressRoles defines a gRPC query method that returns address roles in the
     * namespace
     * </pre>
     */
    public void addressRoles(injective.permissions.v1beta1.QueryOuterClass.QueryAddressRolesRequest request,
        io.grpc.stub.StreamObserver<injective.permissions.v1beta1.QueryOuterClass.QueryAddressRolesResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getAddressRolesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * AddressesByRole defines a gRPC query method that returns a namespace's
     * roles associated with the provided address.
     * </pre>
     */
    public void addressesByRole(injective.permissions.v1beta1.QueryOuterClass.QueryAddressesByRoleRequest request,
        io.grpc.stub.StreamObserver<injective.permissions.v1beta1.QueryOuterClass.QueryAddressesByRoleResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getAddressesByRoleMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * VouchersForAddress defines a gRPC query method that returns a map of
     * vouchers that are held by permissions module for this address, keyed by the
     * originator address
     * </pre>
     */
    public void vouchersForAddress(injective.permissions.v1beta1.QueryOuterClass.QueryVouchersForAddressRequest request,
        io.grpc.stub.StreamObserver<injective.permissions.v1beta1.QueryOuterClass.QueryVouchersForAddressResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getVouchersForAddressMethod(), getCallOptions()), request, responseObserver);
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
     * Params defines a gRPC query method that returns the permissions module's
     * parameters.
     * </pre>
     */
    public injective.permissions.v1beta1.QueryOuterClass.QueryParamsResponse params(injective.permissions.v1beta1.QueryOuterClass.QueryParamsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getParamsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * AllNamespaces defines a gRPC query method that returns the permissions
     * module's created namespaces.
     * </pre>
     */
    public injective.permissions.v1beta1.QueryOuterClass.QueryAllNamespacesResponse allNamespaces(injective.permissions.v1beta1.QueryOuterClass.QueryAllNamespacesRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getAllNamespacesMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * NamespaceByDenom defines a gRPC query method that returns the permissions
     * module's namespace associated with the provided denom.
     * </pre>
     */
    public injective.permissions.v1beta1.QueryOuterClass.QueryNamespaceByDenomResponse namespaceByDenom(injective.permissions.v1beta1.QueryOuterClass.QueryNamespaceByDenomRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getNamespaceByDenomMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * AddressRoles defines a gRPC query method that returns address roles in the
     * namespace
     * </pre>
     */
    public injective.permissions.v1beta1.QueryOuterClass.QueryAddressRolesResponse addressRoles(injective.permissions.v1beta1.QueryOuterClass.QueryAddressRolesRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getAddressRolesMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * AddressesByRole defines a gRPC query method that returns a namespace's
     * roles associated with the provided address.
     * </pre>
     */
    public injective.permissions.v1beta1.QueryOuterClass.QueryAddressesByRoleResponse addressesByRole(injective.permissions.v1beta1.QueryOuterClass.QueryAddressesByRoleRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getAddressesByRoleMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * VouchersForAddress defines a gRPC query method that returns a map of
     * vouchers that are held by permissions module for this address, keyed by the
     * originator address
     * </pre>
     */
    public injective.permissions.v1beta1.QueryOuterClass.QueryVouchersForAddressResponse vouchersForAddress(injective.permissions.v1beta1.QueryOuterClass.QueryVouchersForAddressRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getVouchersForAddressMethod(), getCallOptions(), request);
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
     * Params defines a gRPC query method that returns the permissions module's
     * parameters.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<injective.permissions.v1beta1.QueryOuterClass.QueryParamsResponse> params(
        injective.permissions.v1beta1.QueryOuterClass.QueryParamsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getParamsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * AllNamespaces defines a gRPC query method that returns the permissions
     * module's created namespaces.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<injective.permissions.v1beta1.QueryOuterClass.QueryAllNamespacesResponse> allNamespaces(
        injective.permissions.v1beta1.QueryOuterClass.QueryAllNamespacesRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getAllNamespacesMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * NamespaceByDenom defines a gRPC query method that returns the permissions
     * module's namespace associated with the provided denom.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<injective.permissions.v1beta1.QueryOuterClass.QueryNamespaceByDenomResponse> namespaceByDenom(
        injective.permissions.v1beta1.QueryOuterClass.QueryNamespaceByDenomRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getNamespaceByDenomMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * AddressRoles defines a gRPC query method that returns address roles in the
     * namespace
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<injective.permissions.v1beta1.QueryOuterClass.QueryAddressRolesResponse> addressRoles(
        injective.permissions.v1beta1.QueryOuterClass.QueryAddressRolesRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getAddressRolesMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * AddressesByRole defines a gRPC query method that returns a namespace's
     * roles associated with the provided address.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<injective.permissions.v1beta1.QueryOuterClass.QueryAddressesByRoleResponse> addressesByRole(
        injective.permissions.v1beta1.QueryOuterClass.QueryAddressesByRoleRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getAddressesByRoleMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * VouchersForAddress defines a gRPC query method that returns a map of
     * vouchers that are held by permissions module for this address, keyed by the
     * originator address
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<injective.permissions.v1beta1.QueryOuterClass.QueryVouchersForAddressResponse> vouchersForAddress(
        injective.permissions.v1beta1.QueryOuterClass.QueryVouchersForAddressRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getVouchersForAddressMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_PARAMS = 0;
  private static final int METHODID_ALL_NAMESPACES = 1;
  private static final int METHODID_NAMESPACE_BY_DENOM = 2;
  private static final int METHODID_ADDRESS_ROLES = 3;
  private static final int METHODID_ADDRESSES_BY_ROLE = 4;
  private static final int METHODID_VOUCHERS_FOR_ADDRESS = 5;

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
        case METHODID_PARAMS:
          serviceImpl.params((injective.permissions.v1beta1.QueryOuterClass.QueryParamsRequest) request,
              (io.grpc.stub.StreamObserver<injective.permissions.v1beta1.QueryOuterClass.QueryParamsResponse>) responseObserver);
          break;
        case METHODID_ALL_NAMESPACES:
          serviceImpl.allNamespaces((injective.permissions.v1beta1.QueryOuterClass.QueryAllNamespacesRequest) request,
              (io.grpc.stub.StreamObserver<injective.permissions.v1beta1.QueryOuterClass.QueryAllNamespacesResponse>) responseObserver);
          break;
        case METHODID_NAMESPACE_BY_DENOM:
          serviceImpl.namespaceByDenom((injective.permissions.v1beta1.QueryOuterClass.QueryNamespaceByDenomRequest) request,
              (io.grpc.stub.StreamObserver<injective.permissions.v1beta1.QueryOuterClass.QueryNamespaceByDenomResponse>) responseObserver);
          break;
        case METHODID_ADDRESS_ROLES:
          serviceImpl.addressRoles((injective.permissions.v1beta1.QueryOuterClass.QueryAddressRolesRequest) request,
              (io.grpc.stub.StreamObserver<injective.permissions.v1beta1.QueryOuterClass.QueryAddressRolesResponse>) responseObserver);
          break;
        case METHODID_ADDRESSES_BY_ROLE:
          serviceImpl.addressesByRole((injective.permissions.v1beta1.QueryOuterClass.QueryAddressesByRoleRequest) request,
              (io.grpc.stub.StreamObserver<injective.permissions.v1beta1.QueryOuterClass.QueryAddressesByRoleResponse>) responseObserver);
          break;
        case METHODID_VOUCHERS_FOR_ADDRESS:
          serviceImpl.vouchersForAddress((injective.permissions.v1beta1.QueryOuterClass.QueryVouchersForAddressRequest) request,
              (io.grpc.stub.StreamObserver<injective.permissions.v1beta1.QueryOuterClass.QueryVouchersForAddressResponse>) responseObserver);
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
          getParamsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              injective.permissions.v1beta1.QueryOuterClass.QueryParamsRequest,
              injective.permissions.v1beta1.QueryOuterClass.QueryParamsResponse>(
                service, METHODID_PARAMS)))
        .addMethod(
          getAllNamespacesMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              injective.permissions.v1beta1.QueryOuterClass.QueryAllNamespacesRequest,
              injective.permissions.v1beta1.QueryOuterClass.QueryAllNamespacesResponse>(
                service, METHODID_ALL_NAMESPACES)))
        .addMethod(
          getNamespaceByDenomMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              injective.permissions.v1beta1.QueryOuterClass.QueryNamespaceByDenomRequest,
              injective.permissions.v1beta1.QueryOuterClass.QueryNamespaceByDenomResponse>(
                service, METHODID_NAMESPACE_BY_DENOM)))
        .addMethod(
          getAddressRolesMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              injective.permissions.v1beta1.QueryOuterClass.QueryAddressRolesRequest,
              injective.permissions.v1beta1.QueryOuterClass.QueryAddressRolesResponse>(
                service, METHODID_ADDRESS_ROLES)))
        .addMethod(
          getAddressesByRoleMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              injective.permissions.v1beta1.QueryOuterClass.QueryAddressesByRoleRequest,
              injective.permissions.v1beta1.QueryOuterClass.QueryAddressesByRoleResponse>(
                service, METHODID_ADDRESSES_BY_ROLE)))
        .addMethod(
          getVouchersForAddressMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              injective.permissions.v1beta1.QueryOuterClass.QueryVouchersForAddressRequest,
              injective.permissions.v1beta1.QueryOuterClass.QueryVouchersForAddressResponse>(
                service, METHODID_VOUCHERS_FOR_ADDRESS)))
        .build();
  }

  private static abstract class QueryBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    QueryBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return injective.permissions.v1beta1.QueryOuterClass.getDescriptor();
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
              .addMethod(getParamsMethod())
              .addMethod(getAllNamespacesMethod())
              .addMethod(getNamespaceByDenomMethod())
              .addMethod(getAddressRolesMethod())
              .addMethod(getAddressesByRoleMethod())
              .addMethod(getVouchersForAddressMethod())
              .build();
        }
      }
    }
    return result;
  }
}
