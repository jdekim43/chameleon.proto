package cosmwasm.wasm.v1;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * Query provides defines the gRPC querier service
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.54.0)",
    comments = "Source: cosmwasm/wasm/v1/query.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class QueryGrpc {

  private QueryGrpc() {}

  public static final String SERVICE_NAME = "cosmwasm.wasm.v1.Query";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<cosmwasm.wasm.v1.QueryOuterClass.QueryContractInfoRequest,
      cosmwasm.wasm.v1.QueryOuterClass.QueryContractInfoResponse> getContractInfoMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ContractInfo",
      requestType = cosmwasm.wasm.v1.QueryOuterClass.QueryContractInfoRequest.class,
      responseType = cosmwasm.wasm.v1.QueryOuterClass.QueryContractInfoResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<cosmwasm.wasm.v1.QueryOuterClass.QueryContractInfoRequest,
      cosmwasm.wasm.v1.QueryOuterClass.QueryContractInfoResponse> getContractInfoMethod() {
    io.grpc.MethodDescriptor<cosmwasm.wasm.v1.QueryOuterClass.QueryContractInfoRequest, cosmwasm.wasm.v1.QueryOuterClass.QueryContractInfoResponse> getContractInfoMethod;
    if ((getContractInfoMethod = QueryGrpc.getContractInfoMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getContractInfoMethod = QueryGrpc.getContractInfoMethod) == null) {
          QueryGrpc.getContractInfoMethod = getContractInfoMethod =
              io.grpc.MethodDescriptor.<cosmwasm.wasm.v1.QueryOuterClass.QueryContractInfoRequest, cosmwasm.wasm.v1.QueryOuterClass.QueryContractInfoResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ContractInfo"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  cosmwasm.wasm.v1.QueryOuterClass.QueryContractInfoRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  cosmwasm.wasm.v1.QueryOuterClass.QueryContractInfoResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("ContractInfo"))
              .build();
        }
      }
    }
    return getContractInfoMethod;
  }

  private static volatile io.grpc.MethodDescriptor<cosmwasm.wasm.v1.QueryOuterClass.QueryContractHistoryRequest,
      cosmwasm.wasm.v1.QueryOuterClass.QueryContractHistoryResponse> getContractHistoryMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ContractHistory",
      requestType = cosmwasm.wasm.v1.QueryOuterClass.QueryContractHistoryRequest.class,
      responseType = cosmwasm.wasm.v1.QueryOuterClass.QueryContractHistoryResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<cosmwasm.wasm.v1.QueryOuterClass.QueryContractHistoryRequest,
      cosmwasm.wasm.v1.QueryOuterClass.QueryContractHistoryResponse> getContractHistoryMethod() {
    io.grpc.MethodDescriptor<cosmwasm.wasm.v1.QueryOuterClass.QueryContractHistoryRequest, cosmwasm.wasm.v1.QueryOuterClass.QueryContractHistoryResponse> getContractHistoryMethod;
    if ((getContractHistoryMethod = QueryGrpc.getContractHistoryMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getContractHistoryMethod = QueryGrpc.getContractHistoryMethod) == null) {
          QueryGrpc.getContractHistoryMethod = getContractHistoryMethod =
              io.grpc.MethodDescriptor.<cosmwasm.wasm.v1.QueryOuterClass.QueryContractHistoryRequest, cosmwasm.wasm.v1.QueryOuterClass.QueryContractHistoryResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ContractHistory"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  cosmwasm.wasm.v1.QueryOuterClass.QueryContractHistoryRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  cosmwasm.wasm.v1.QueryOuterClass.QueryContractHistoryResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("ContractHistory"))
              .build();
        }
      }
    }
    return getContractHistoryMethod;
  }

  private static volatile io.grpc.MethodDescriptor<cosmwasm.wasm.v1.QueryOuterClass.QueryContractsByCodeRequest,
      cosmwasm.wasm.v1.QueryOuterClass.QueryContractsByCodeResponse> getContractsByCodeMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ContractsByCode",
      requestType = cosmwasm.wasm.v1.QueryOuterClass.QueryContractsByCodeRequest.class,
      responseType = cosmwasm.wasm.v1.QueryOuterClass.QueryContractsByCodeResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<cosmwasm.wasm.v1.QueryOuterClass.QueryContractsByCodeRequest,
      cosmwasm.wasm.v1.QueryOuterClass.QueryContractsByCodeResponse> getContractsByCodeMethod() {
    io.grpc.MethodDescriptor<cosmwasm.wasm.v1.QueryOuterClass.QueryContractsByCodeRequest, cosmwasm.wasm.v1.QueryOuterClass.QueryContractsByCodeResponse> getContractsByCodeMethod;
    if ((getContractsByCodeMethod = QueryGrpc.getContractsByCodeMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getContractsByCodeMethod = QueryGrpc.getContractsByCodeMethod) == null) {
          QueryGrpc.getContractsByCodeMethod = getContractsByCodeMethod =
              io.grpc.MethodDescriptor.<cosmwasm.wasm.v1.QueryOuterClass.QueryContractsByCodeRequest, cosmwasm.wasm.v1.QueryOuterClass.QueryContractsByCodeResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ContractsByCode"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  cosmwasm.wasm.v1.QueryOuterClass.QueryContractsByCodeRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  cosmwasm.wasm.v1.QueryOuterClass.QueryContractsByCodeResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("ContractsByCode"))
              .build();
        }
      }
    }
    return getContractsByCodeMethod;
  }

  private static volatile io.grpc.MethodDescriptor<cosmwasm.wasm.v1.QueryOuterClass.QueryAllContractStateRequest,
      cosmwasm.wasm.v1.QueryOuterClass.QueryAllContractStateResponse> getAllContractStateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "AllContractState",
      requestType = cosmwasm.wasm.v1.QueryOuterClass.QueryAllContractStateRequest.class,
      responseType = cosmwasm.wasm.v1.QueryOuterClass.QueryAllContractStateResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<cosmwasm.wasm.v1.QueryOuterClass.QueryAllContractStateRequest,
      cosmwasm.wasm.v1.QueryOuterClass.QueryAllContractStateResponse> getAllContractStateMethod() {
    io.grpc.MethodDescriptor<cosmwasm.wasm.v1.QueryOuterClass.QueryAllContractStateRequest, cosmwasm.wasm.v1.QueryOuterClass.QueryAllContractStateResponse> getAllContractStateMethod;
    if ((getAllContractStateMethod = QueryGrpc.getAllContractStateMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getAllContractStateMethod = QueryGrpc.getAllContractStateMethod) == null) {
          QueryGrpc.getAllContractStateMethod = getAllContractStateMethod =
              io.grpc.MethodDescriptor.<cosmwasm.wasm.v1.QueryOuterClass.QueryAllContractStateRequest, cosmwasm.wasm.v1.QueryOuterClass.QueryAllContractStateResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "AllContractState"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  cosmwasm.wasm.v1.QueryOuterClass.QueryAllContractStateRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  cosmwasm.wasm.v1.QueryOuterClass.QueryAllContractStateResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("AllContractState"))
              .build();
        }
      }
    }
    return getAllContractStateMethod;
  }

  private static volatile io.grpc.MethodDescriptor<cosmwasm.wasm.v1.QueryOuterClass.QueryRawContractStateRequest,
      cosmwasm.wasm.v1.QueryOuterClass.QueryRawContractStateResponse> getRawContractStateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "RawContractState",
      requestType = cosmwasm.wasm.v1.QueryOuterClass.QueryRawContractStateRequest.class,
      responseType = cosmwasm.wasm.v1.QueryOuterClass.QueryRawContractStateResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<cosmwasm.wasm.v1.QueryOuterClass.QueryRawContractStateRequest,
      cosmwasm.wasm.v1.QueryOuterClass.QueryRawContractStateResponse> getRawContractStateMethod() {
    io.grpc.MethodDescriptor<cosmwasm.wasm.v1.QueryOuterClass.QueryRawContractStateRequest, cosmwasm.wasm.v1.QueryOuterClass.QueryRawContractStateResponse> getRawContractStateMethod;
    if ((getRawContractStateMethod = QueryGrpc.getRawContractStateMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getRawContractStateMethod = QueryGrpc.getRawContractStateMethod) == null) {
          QueryGrpc.getRawContractStateMethod = getRawContractStateMethod =
              io.grpc.MethodDescriptor.<cosmwasm.wasm.v1.QueryOuterClass.QueryRawContractStateRequest, cosmwasm.wasm.v1.QueryOuterClass.QueryRawContractStateResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "RawContractState"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  cosmwasm.wasm.v1.QueryOuterClass.QueryRawContractStateRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  cosmwasm.wasm.v1.QueryOuterClass.QueryRawContractStateResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("RawContractState"))
              .build();
        }
      }
    }
    return getRawContractStateMethod;
  }

  private static volatile io.grpc.MethodDescriptor<cosmwasm.wasm.v1.QueryOuterClass.QuerySmartContractStateRequest,
      cosmwasm.wasm.v1.QueryOuterClass.QuerySmartContractStateResponse> getSmartContractStateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SmartContractState",
      requestType = cosmwasm.wasm.v1.QueryOuterClass.QuerySmartContractStateRequest.class,
      responseType = cosmwasm.wasm.v1.QueryOuterClass.QuerySmartContractStateResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<cosmwasm.wasm.v1.QueryOuterClass.QuerySmartContractStateRequest,
      cosmwasm.wasm.v1.QueryOuterClass.QuerySmartContractStateResponse> getSmartContractStateMethod() {
    io.grpc.MethodDescriptor<cosmwasm.wasm.v1.QueryOuterClass.QuerySmartContractStateRequest, cosmwasm.wasm.v1.QueryOuterClass.QuerySmartContractStateResponse> getSmartContractStateMethod;
    if ((getSmartContractStateMethod = QueryGrpc.getSmartContractStateMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getSmartContractStateMethod = QueryGrpc.getSmartContractStateMethod) == null) {
          QueryGrpc.getSmartContractStateMethod = getSmartContractStateMethod =
              io.grpc.MethodDescriptor.<cosmwasm.wasm.v1.QueryOuterClass.QuerySmartContractStateRequest, cosmwasm.wasm.v1.QueryOuterClass.QuerySmartContractStateResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SmartContractState"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  cosmwasm.wasm.v1.QueryOuterClass.QuerySmartContractStateRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  cosmwasm.wasm.v1.QueryOuterClass.QuerySmartContractStateResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("SmartContractState"))
              .build();
        }
      }
    }
    return getSmartContractStateMethod;
  }

  private static volatile io.grpc.MethodDescriptor<cosmwasm.wasm.v1.QueryOuterClass.QueryCodeRequest,
      cosmwasm.wasm.v1.QueryOuterClass.QueryCodeResponse> getCodeMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Code",
      requestType = cosmwasm.wasm.v1.QueryOuterClass.QueryCodeRequest.class,
      responseType = cosmwasm.wasm.v1.QueryOuterClass.QueryCodeResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<cosmwasm.wasm.v1.QueryOuterClass.QueryCodeRequest,
      cosmwasm.wasm.v1.QueryOuterClass.QueryCodeResponse> getCodeMethod() {
    io.grpc.MethodDescriptor<cosmwasm.wasm.v1.QueryOuterClass.QueryCodeRequest, cosmwasm.wasm.v1.QueryOuterClass.QueryCodeResponse> getCodeMethod;
    if ((getCodeMethod = QueryGrpc.getCodeMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getCodeMethod = QueryGrpc.getCodeMethod) == null) {
          QueryGrpc.getCodeMethod = getCodeMethod =
              io.grpc.MethodDescriptor.<cosmwasm.wasm.v1.QueryOuterClass.QueryCodeRequest, cosmwasm.wasm.v1.QueryOuterClass.QueryCodeResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Code"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  cosmwasm.wasm.v1.QueryOuterClass.QueryCodeRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  cosmwasm.wasm.v1.QueryOuterClass.QueryCodeResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("Code"))
              .build();
        }
      }
    }
    return getCodeMethod;
  }

  private static volatile io.grpc.MethodDescriptor<cosmwasm.wasm.v1.QueryOuterClass.QueryCodesRequest,
      cosmwasm.wasm.v1.QueryOuterClass.QueryCodesResponse> getCodesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Codes",
      requestType = cosmwasm.wasm.v1.QueryOuterClass.QueryCodesRequest.class,
      responseType = cosmwasm.wasm.v1.QueryOuterClass.QueryCodesResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<cosmwasm.wasm.v1.QueryOuterClass.QueryCodesRequest,
      cosmwasm.wasm.v1.QueryOuterClass.QueryCodesResponse> getCodesMethod() {
    io.grpc.MethodDescriptor<cosmwasm.wasm.v1.QueryOuterClass.QueryCodesRequest, cosmwasm.wasm.v1.QueryOuterClass.QueryCodesResponse> getCodesMethod;
    if ((getCodesMethod = QueryGrpc.getCodesMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getCodesMethod = QueryGrpc.getCodesMethod) == null) {
          QueryGrpc.getCodesMethod = getCodesMethod =
              io.grpc.MethodDescriptor.<cosmwasm.wasm.v1.QueryOuterClass.QueryCodesRequest, cosmwasm.wasm.v1.QueryOuterClass.QueryCodesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Codes"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  cosmwasm.wasm.v1.QueryOuterClass.QueryCodesRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  cosmwasm.wasm.v1.QueryOuterClass.QueryCodesResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("Codes"))
              .build();
        }
      }
    }
    return getCodesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<cosmwasm.wasm.v1.QueryOuterClass.QueryPinnedCodesRequest,
      cosmwasm.wasm.v1.QueryOuterClass.QueryPinnedCodesResponse> getPinnedCodesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "PinnedCodes",
      requestType = cosmwasm.wasm.v1.QueryOuterClass.QueryPinnedCodesRequest.class,
      responseType = cosmwasm.wasm.v1.QueryOuterClass.QueryPinnedCodesResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<cosmwasm.wasm.v1.QueryOuterClass.QueryPinnedCodesRequest,
      cosmwasm.wasm.v1.QueryOuterClass.QueryPinnedCodesResponse> getPinnedCodesMethod() {
    io.grpc.MethodDescriptor<cosmwasm.wasm.v1.QueryOuterClass.QueryPinnedCodesRequest, cosmwasm.wasm.v1.QueryOuterClass.QueryPinnedCodesResponse> getPinnedCodesMethod;
    if ((getPinnedCodesMethod = QueryGrpc.getPinnedCodesMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getPinnedCodesMethod = QueryGrpc.getPinnedCodesMethod) == null) {
          QueryGrpc.getPinnedCodesMethod = getPinnedCodesMethod =
              io.grpc.MethodDescriptor.<cosmwasm.wasm.v1.QueryOuterClass.QueryPinnedCodesRequest, cosmwasm.wasm.v1.QueryOuterClass.QueryPinnedCodesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "PinnedCodes"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  cosmwasm.wasm.v1.QueryOuterClass.QueryPinnedCodesRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  cosmwasm.wasm.v1.QueryOuterClass.QueryPinnedCodesResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("PinnedCodes"))
              .build();
        }
      }
    }
    return getPinnedCodesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<cosmwasm.wasm.v1.QueryOuterClass.QueryParamsRequest,
      cosmwasm.wasm.v1.QueryOuterClass.QueryParamsResponse> getParamsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Params",
      requestType = cosmwasm.wasm.v1.QueryOuterClass.QueryParamsRequest.class,
      responseType = cosmwasm.wasm.v1.QueryOuterClass.QueryParamsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<cosmwasm.wasm.v1.QueryOuterClass.QueryParamsRequest,
      cosmwasm.wasm.v1.QueryOuterClass.QueryParamsResponse> getParamsMethod() {
    io.grpc.MethodDescriptor<cosmwasm.wasm.v1.QueryOuterClass.QueryParamsRequest, cosmwasm.wasm.v1.QueryOuterClass.QueryParamsResponse> getParamsMethod;
    if ((getParamsMethod = QueryGrpc.getParamsMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getParamsMethod = QueryGrpc.getParamsMethod) == null) {
          QueryGrpc.getParamsMethod = getParamsMethod =
              io.grpc.MethodDescriptor.<cosmwasm.wasm.v1.QueryOuterClass.QueryParamsRequest, cosmwasm.wasm.v1.QueryOuterClass.QueryParamsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Params"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  cosmwasm.wasm.v1.QueryOuterClass.QueryParamsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  cosmwasm.wasm.v1.QueryOuterClass.QueryParamsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("Params"))
              .build();
        }
      }
    }
    return getParamsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<cosmwasm.wasm.v1.QueryOuterClass.QueryContractsByCreatorRequest,
      cosmwasm.wasm.v1.QueryOuterClass.QueryContractsByCreatorResponse> getContractsByCreatorMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ContractsByCreator",
      requestType = cosmwasm.wasm.v1.QueryOuterClass.QueryContractsByCreatorRequest.class,
      responseType = cosmwasm.wasm.v1.QueryOuterClass.QueryContractsByCreatorResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<cosmwasm.wasm.v1.QueryOuterClass.QueryContractsByCreatorRequest,
      cosmwasm.wasm.v1.QueryOuterClass.QueryContractsByCreatorResponse> getContractsByCreatorMethod() {
    io.grpc.MethodDescriptor<cosmwasm.wasm.v1.QueryOuterClass.QueryContractsByCreatorRequest, cosmwasm.wasm.v1.QueryOuterClass.QueryContractsByCreatorResponse> getContractsByCreatorMethod;
    if ((getContractsByCreatorMethod = QueryGrpc.getContractsByCreatorMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getContractsByCreatorMethod = QueryGrpc.getContractsByCreatorMethod) == null) {
          QueryGrpc.getContractsByCreatorMethod = getContractsByCreatorMethod =
              io.grpc.MethodDescriptor.<cosmwasm.wasm.v1.QueryOuterClass.QueryContractsByCreatorRequest, cosmwasm.wasm.v1.QueryOuterClass.QueryContractsByCreatorResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ContractsByCreator"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  cosmwasm.wasm.v1.QueryOuterClass.QueryContractsByCreatorRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  cosmwasm.wasm.v1.QueryOuterClass.QueryContractsByCreatorResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("ContractsByCreator"))
              .build();
        }
      }
    }
    return getContractsByCreatorMethod;
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
   * Query provides defines the gRPC querier service
   * </pre>
   */
  public interface AsyncService {

    /**
     * <pre>
     * ContractInfo gets the contract meta data
     * </pre>
     */
    default void contractInfo(cosmwasm.wasm.v1.QueryOuterClass.QueryContractInfoRequest request,
        io.grpc.stub.StreamObserver<cosmwasm.wasm.v1.QueryOuterClass.QueryContractInfoResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getContractInfoMethod(), responseObserver);
    }

    /**
     * <pre>
     * ContractHistory gets the contract code history
     * </pre>
     */
    default void contractHistory(cosmwasm.wasm.v1.QueryOuterClass.QueryContractHistoryRequest request,
        io.grpc.stub.StreamObserver<cosmwasm.wasm.v1.QueryOuterClass.QueryContractHistoryResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getContractHistoryMethod(), responseObserver);
    }

    /**
     * <pre>
     * ContractsByCode lists all smart contracts for a code id
     * </pre>
     */
    default void contractsByCode(cosmwasm.wasm.v1.QueryOuterClass.QueryContractsByCodeRequest request,
        io.grpc.stub.StreamObserver<cosmwasm.wasm.v1.QueryOuterClass.QueryContractsByCodeResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getContractsByCodeMethod(), responseObserver);
    }

    /**
     * <pre>
     * AllContractState gets all raw store data for a single contract
     * </pre>
     */
    default void allContractState(cosmwasm.wasm.v1.QueryOuterClass.QueryAllContractStateRequest request,
        io.grpc.stub.StreamObserver<cosmwasm.wasm.v1.QueryOuterClass.QueryAllContractStateResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getAllContractStateMethod(), responseObserver);
    }

    /**
     * <pre>
     * RawContractState gets single key from the raw store data of a contract
     * </pre>
     */
    default void rawContractState(cosmwasm.wasm.v1.QueryOuterClass.QueryRawContractStateRequest request,
        io.grpc.stub.StreamObserver<cosmwasm.wasm.v1.QueryOuterClass.QueryRawContractStateResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getRawContractStateMethod(), responseObserver);
    }

    /**
     * <pre>
     * SmartContractState get smart query result from the contract
     * </pre>
     */
    default void smartContractState(cosmwasm.wasm.v1.QueryOuterClass.QuerySmartContractStateRequest request,
        io.grpc.stub.StreamObserver<cosmwasm.wasm.v1.QueryOuterClass.QuerySmartContractStateResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSmartContractStateMethod(), responseObserver);
    }

    /**
     * <pre>
     * Code gets the binary code and metadata for a singe wasm code
     * </pre>
     */
    default void code(cosmwasm.wasm.v1.QueryOuterClass.QueryCodeRequest request,
        io.grpc.stub.StreamObserver<cosmwasm.wasm.v1.QueryOuterClass.QueryCodeResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCodeMethod(), responseObserver);
    }

    /**
     * <pre>
     * Codes gets the metadata for all stored wasm codes
     * </pre>
     */
    default void codes(cosmwasm.wasm.v1.QueryOuterClass.QueryCodesRequest request,
        io.grpc.stub.StreamObserver<cosmwasm.wasm.v1.QueryOuterClass.QueryCodesResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCodesMethod(), responseObserver);
    }

    /**
     * <pre>
     * PinnedCodes gets the pinned code ids
     * </pre>
     */
    default void pinnedCodes(cosmwasm.wasm.v1.QueryOuterClass.QueryPinnedCodesRequest request,
        io.grpc.stub.StreamObserver<cosmwasm.wasm.v1.QueryOuterClass.QueryPinnedCodesResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getPinnedCodesMethod(), responseObserver);
    }

    /**
     * <pre>
     * Params gets the module params
     * </pre>
     */
    default void params(cosmwasm.wasm.v1.QueryOuterClass.QueryParamsRequest request,
        io.grpc.stub.StreamObserver<cosmwasm.wasm.v1.QueryOuterClass.QueryParamsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getParamsMethod(), responseObserver);
    }

    /**
     * <pre>
     * ContractsByCreator gets the contracts by creator
     * </pre>
     */
    default void contractsByCreator(cosmwasm.wasm.v1.QueryOuterClass.QueryContractsByCreatorRequest request,
        io.grpc.stub.StreamObserver<cosmwasm.wasm.v1.QueryOuterClass.QueryContractsByCreatorResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getContractsByCreatorMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service Query.
   * <pre>
   * Query provides defines the gRPC querier service
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
   * Query provides defines the gRPC querier service
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
     * ContractInfo gets the contract meta data
     * </pre>
     */
    public void contractInfo(cosmwasm.wasm.v1.QueryOuterClass.QueryContractInfoRequest request,
        io.grpc.stub.StreamObserver<cosmwasm.wasm.v1.QueryOuterClass.QueryContractInfoResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getContractInfoMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * ContractHistory gets the contract code history
     * </pre>
     */
    public void contractHistory(cosmwasm.wasm.v1.QueryOuterClass.QueryContractHistoryRequest request,
        io.grpc.stub.StreamObserver<cosmwasm.wasm.v1.QueryOuterClass.QueryContractHistoryResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getContractHistoryMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * ContractsByCode lists all smart contracts for a code id
     * </pre>
     */
    public void contractsByCode(cosmwasm.wasm.v1.QueryOuterClass.QueryContractsByCodeRequest request,
        io.grpc.stub.StreamObserver<cosmwasm.wasm.v1.QueryOuterClass.QueryContractsByCodeResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getContractsByCodeMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * AllContractState gets all raw store data for a single contract
     * </pre>
     */
    public void allContractState(cosmwasm.wasm.v1.QueryOuterClass.QueryAllContractStateRequest request,
        io.grpc.stub.StreamObserver<cosmwasm.wasm.v1.QueryOuterClass.QueryAllContractStateResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getAllContractStateMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * RawContractState gets single key from the raw store data of a contract
     * </pre>
     */
    public void rawContractState(cosmwasm.wasm.v1.QueryOuterClass.QueryRawContractStateRequest request,
        io.grpc.stub.StreamObserver<cosmwasm.wasm.v1.QueryOuterClass.QueryRawContractStateResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getRawContractStateMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * SmartContractState get smart query result from the contract
     * </pre>
     */
    public void smartContractState(cosmwasm.wasm.v1.QueryOuterClass.QuerySmartContractStateRequest request,
        io.grpc.stub.StreamObserver<cosmwasm.wasm.v1.QueryOuterClass.QuerySmartContractStateResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSmartContractStateMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Code gets the binary code and metadata for a singe wasm code
     * </pre>
     */
    public void code(cosmwasm.wasm.v1.QueryOuterClass.QueryCodeRequest request,
        io.grpc.stub.StreamObserver<cosmwasm.wasm.v1.QueryOuterClass.QueryCodeResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCodeMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Codes gets the metadata for all stored wasm codes
     * </pre>
     */
    public void codes(cosmwasm.wasm.v1.QueryOuterClass.QueryCodesRequest request,
        io.grpc.stub.StreamObserver<cosmwasm.wasm.v1.QueryOuterClass.QueryCodesResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCodesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * PinnedCodes gets the pinned code ids
     * </pre>
     */
    public void pinnedCodes(cosmwasm.wasm.v1.QueryOuterClass.QueryPinnedCodesRequest request,
        io.grpc.stub.StreamObserver<cosmwasm.wasm.v1.QueryOuterClass.QueryPinnedCodesResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getPinnedCodesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Params gets the module params
     * </pre>
     */
    public void params(cosmwasm.wasm.v1.QueryOuterClass.QueryParamsRequest request,
        io.grpc.stub.StreamObserver<cosmwasm.wasm.v1.QueryOuterClass.QueryParamsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getParamsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * ContractsByCreator gets the contracts by creator
     * </pre>
     */
    public void contractsByCreator(cosmwasm.wasm.v1.QueryOuterClass.QueryContractsByCreatorRequest request,
        io.grpc.stub.StreamObserver<cosmwasm.wasm.v1.QueryOuterClass.QueryContractsByCreatorResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getContractsByCreatorMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service Query.
   * <pre>
   * Query provides defines the gRPC querier service
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
     * ContractInfo gets the contract meta data
     * </pre>
     */
    public cosmwasm.wasm.v1.QueryOuterClass.QueryContractInfoResponse contractInfo(cosmwasm.wasm.v1.QueryOuterClass.QueryContractInfoRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getContractInfoMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * ContractHistory gets the contract code history
     * </pre>
     */
    public cosmwasm.wasm.v1.QueryOuterClass.QueryContractHistoryResponse contractHistory(cosmwasm.wasm.v1.QueryOuterClass.QueryContractHistoryRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getContractHistoryMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * ContractsByCode lists all smart contracts for a code id
     * </pre>
     */
    public cosmwasm.wasm.v1.QueryOuterClass.QueryContractsByCodeResponse contractsByCode(cosmwasm.wasm.v1.QueryOuterClass.QueryContractsByCodeRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getContractsByCodeMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * AllContractState gets all raw store data for a single contract
     * </pre>
     */
    public cosmwasm.wasm.v1.QueryOuterClass.QueryAllContractStateResponse allContractState(cosmwasm.wasm.v1.QueryOuterClass.QueryAllContractStateRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getAllContractStateMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * RawContractState gets single key from the raw store data of a contract
     * </pre>
     */
    public cosmwasm.wasm.v1.QueryOuterClass.QueryRawContractStateResponse rawContractState(cosmwasm.wasm.v1.QueryOuterClass.QueryRawContractStateRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getRawContractStateMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * SmartContractState get smart query result from the contract
     * </pre>
     */
    public cosmwasm.wasm.v1.QueryOuterClass.QuerySmartContractStateResponse smartContractState(cosmwasm.wasm.v1.QueryOuterClass.QuerySmartContractStateRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSmartContractStateMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Code gets the binary code and metadata for a singe wasm code
     * </pre>
     */
    public cosmwasm.wasm.v1.QueryOuterClass.QueryCodeResponse code(cosmwasm.wasm.v1.QueryOuterClass.QueryCodeRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCodeMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Codes gets the metadata for all stored wasm codes
     * </pre>
     */
    public cosmwasm.wasm.v1.QueryOuterClass.QueryCodesResponse codes(cosmwasm.wasm.v1.QueryOuterClass.QueryCodesRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCodesMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * PinnedCodes gets the pinned code ids
     * </pre>
     */
    public cosmwasm.wasm.v1.QueryOuterClass.QueryPinnedCodesResponse pinnedCodes(cosmwasm.wasm.v1.QueryOuterClass.QueryPinnedCodesRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getPinnedCodesMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Params gets the module params
     * </pre>
     */
    public cosmwasm.wasm.v1.QueryOuterClass.QueryParamsResponse params(cosmwasm.wasm.v1.QueryOuterClass.QueryParamsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getParamsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * ContractsByCreator gets the contracts by creator
     * </pre>
     */
    public cosmwasm.wasm.v1.QueryOuterClass.QueryContractsByCreatorResponse contractsByCreator(cosmwasm.wasm.v1.QueryOuterClass.QueryContractsByCreatorRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getContractsByCreatorMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service Query.
   * <pre>
   * Query provides defines the gRPC querier service
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
     * ContractInfo gets the contract meta data
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<cosmwasm.wasm.v1.QueryOuterClass.QueryContractInfoResponse> contractInfo(
        cosmwasm.wasm.v1.QueryOuterClass.QueryContractInfoRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getContractInfoMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * ContractHistory gets the contract code history
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<cosmwasm.wasm.v1.QueryOuterClass.QueryContractHistoryResponse> contractHistory(
        cosmwasm.wasm.v1.QueryOuterClass.QueryContractHistoryRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getContractHistoryMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * ContractsByCode lists all smart contracts for a code id
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<cosmwasm.wasm.v1.QueryOuterClass.QueryContractsByCodeResponse> contractsByCode(
        cosmwasm.wasm.v1.QueryOuterClass.QueryContractsByCodeRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getContractsByCodeMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * AllContractState gets all raw store data for a single contract
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<cosmwasm.wasm.v1.QueryOuterClass.QueryAllContractStateResponse> allContractState(
        cosmwasm.wasm.v1.QueryOuterClass.QueryAllContractStateRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getAllContractStateMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * RawContractState gets single key from the raw store data of a contract
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<cosmwasm.wasm.v1.QueryOuterClass.QueryRawContractStateResponse> rawContractState(
        cosmwasm.wasm.v1.QueryOuterClass.QueryRawContractStateRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getRawContractStateMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * SmartContractState get smart query result from the contract
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<cosmwasm.wasm.v1.QueryOuterClass.QuerySmartContractStateResponse> smartContractState(
        cosmwasm.wasm.v1.QueryOuterClass.QuerySmartContractStateRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSmartContractStateMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Code gets the binary code and metadata for a singe wasm code
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<cosmwasm.wasm.v1.QueryOuterClass.QueryCodeResponse> code(
        cosmwasm.wasm.v1.QueryOuterClass.QueryCodeRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCodeMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Codes gets the metadata for all stored wasm codes
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<cosmwasm.wasm.v1.QueryOuterClass.QueryCodesResponse> codes(
        cosmwasm.wasm.v1.QueryOuterClass.QueryCodesRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCodesMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * PinnedCodes gets the pinned code ids
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<cosmwasm.wasm.v1.QueryOuterClass.QueryPinnedCodesResponse> pinnedCodes(
        cosmwasm.wasm.v1.QueryOuterClass.QueryPinnedCodesRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getPinnedCodesMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Params gets the module params
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<cosmwasm.wasm.v1.QueryOuterClass.QueryParamsResponse> params(
        cosmwasm.wasm.v1.QueryOuterClass.QueryParamsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getParamsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * ContractsByCreator gets the contracts by creator
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<cosmwasm.wasm.v1.QueryOuterClass.QueryContractsByCreatorResponse> contractsByCreator(
        cosmwasm.wasm.v1.QueryOuterClass.QueryContractsByCreatorRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getContractsByCreatorMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_CONTRACT_INFO = 0;
  private static final int METHODID_CONTRACT_HISTORY = 1;
  private static final int METHODID_CONTRACTS_BY_CODE = 2;
  private static final int METHODID_ALL_CONTRACT_STATE = 3;
  private static final int METHODID_RAW_CONTRACT_STATE = 4;
  private static final int METHODID_SMART_CONTRACT_STATE = 5;
  private static final int METHODID_CODE = 6;
  private static final int METHODID_CODES = 7;
  private static final int METHODID_PINNED_CODES = 8;
  private static final int METHODID_PARAMS = 9;
  private static final int METHODID_CONTRACTS_BY_CREATOR = 10;

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
        case METHODID_CONTRACT_INFO:
          serviceImpl.contractInfo((cosmwasm.wasm.v1.QueryOuterClass.QueryContractInfoRequest) request,
              (io.grpc.stub.StreamObserver<cosmwasm.wasm.v1.QueryOuterClass.QueryContractInfoResponse>) responseObserver);
          break;
        case METHODID_CONTRACT_HISTORY:
          serviceImpl.contractHistory((cosmwasm.wasm.v1.QueryOuterClass.QueryContractHistoryRequest) request,
              (io.grpc.stub.StreamObserver<cosmwasm.wasm.v1.QueryOuterClass.QueryContractHistoryResponse>) responseObserver);
          break;
        case METHODID_CONTRACTS_BY_CODE:
          serviceImpl.contractsByCode((cosmwasm.wasm.v1.QueryOuterClass.QueryContractsByCodeRequest) request,
              (io.grpc.stub.StreamObserver<cosmwasm.wasm.v1.QueryOuterClass.QueryContractsByCodeResponse>) responseObserver);
          break;
        case METHODID_ALL_CONTRACT_STATE:
          serviceImpl.allContractState((cosmwasm.wasm.v1.QueryOuterClass.QueryAllContractStateRequest) request,
              (io.grpc.stub.StreamObserver<cosmwasm.wasm.v1.QueryOuterClass.QueryAllContractStateResponse>) responseObserver);
          break;
        case METHODID_RAW_CONTRACT_STATE:
          serviceImpl.rawContractState((cosmwasm.wasm.v1.QueryOuterClass.QueryRawContractStateRequest) request,
              (io.grpc.stub.StreamObserver<cosmwasm.wasm.v1.QueryOuterClass.QueryRawContractStateResponse>) responseObserver);
          break;
        case METHODID_SMART_CONTRACT_STATE:
          serviceImpl.smartContractState((cosmwasm.wasm.v1.QueryOuterClass.QuerySmartContractStateRequest) request,
              (io.grpc.stub.StreamObserver<cosmwasm.wasm.v1.QueryOuterClass.QuerySmartContractStateResponse>) responseObserver);
          break;
        case METHODID_CODE:
          serviceImpl.code((cosmwasm.wasm.v1.QueryOuterClass.QueryCodeRequest) request,
              (io.grpc.stub.StreamObserver<cosmwasm.wasm.v1.QueryOuterClass.QueryCodeResponse>) responseObserver);
          break;
        case METHODID_CODES:
          serviceImpl.codes((cosmwasm.wasm.v1.QueryOuterClass.QueryCodesRequest) request,
              (io.grpc.stub.StreamObserver<cosmwasm.wasm.v1.QueryOuterClass.QueryCodesResponse>) responseObserver);
          break;
        case METHODID_PINNED_CODES:
          serviceImpl.pinnedCodes((cosmwasm.wasm.v1.QueryOuterClass.QueryPinnedCodesRequest) request,
              (io.grpc.stub.StreamObserver<cosmwasm.wasm.v1.QueryOuterClass.QueryPinnedCodesResponse>) responseObserver);
          break;
        case METHODID_PARAMS:
          serviceImpl.params((cosmwasm.wasm.v1.QueryOuterClass.QueryParamsRequest) request,
              (io.grpc.stub.StreamObserver<cosmwasm.wasm.v1.QueryOuterClass.QueryParamsResponse>) responseObserver);
          break;
        case METHODID_CONTRACTS_BY_CREATOR:
          serviceImpl.contractsByCreator((cosmwasm.wasm.v1.QueryOuterClass.QueryContractsByCreatorRequest) request,
              (io.grpc.stub.StreamObserver<cosmwasm.wasm.v1.QueryOuterClass.QueryContractsByCreatorResponse>) responseObserver);
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
          getContractInfoMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              cosmwasm.wasm.v1.QueryOuterClass.QueryContractInfoRequest,
              cosmwasm.wasm.v1.QueryOuterClass.QueryContractInfoResponse>(
                service, METHODID_CONTRACT_INFO)))
        .addMethod(
          getContractHistoryMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              cosmwasm.wasm.v1.QueryOuterClass.QueryContractHistoryRequest,
              cosmwasm.wasm.v1.QueryOuterClass.QueryContractHistoryResponse>(
                service, METHODID_CONTRACT_HISTORY)))
        .addMethod(
          getContractsByCodeMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              cosmwasm.wasm.v1.QueryOuterClass.QueryContractsByCodeRequest,
              cosmwasm.wasm.v1.QueryOuterClass.QueryContractsByCodeResponse>(
                service, METHODID_CONTRACTS_BY_CODE)))
        .addMethod(
          getAllContractStateMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              cosmwasm.wasm.v1.QueryOuterClass.QueryAllContractStateRequest,
              cosmwasm.wasm.v1.QueryOuterClass.QueryAllContractStateResponse>(
                service, METHODID_ALL_CONTRACT_STATE)))
        .addMethod(
          getRawContractStateMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              cosmwasm.wasm.v1.QueryOuterClass.QueryRawContractStateRequest,
              cosmwasm.wasm.v1.QueryOuterClass.QueryRawContractStateResponse>(
                service, METHODID_RAW_CONTRACT_STATE)))
        .addMethod(
          getSmartContractStateMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              cosmwasm.wasm.v1.QueryOuterClass.QuerySmartContractStateRequest,
              cosmwasm.wasm.v1.QueryOuterClass.QuerySmartContractStateResponse>(
                service, METHODID_SMART_CONTRACT_STATE)))
        .addMethod(
          getCodeMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              cosmwasm.wasm.v1.QueryOuterClass.QueryCodeRequest,
              cosmwasm.wasm.v1.QueryOuterClass.QueryCodeResponse>(
                service, METHODID_CODE)))
        .addMethod(
          getCodesMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              cosmwasm.wasm.v1.QueryOuterClass.QueryCodesRequest,
              cosmwasm.wasm.v1.QueryOuterClass.QueryCodesResponse>(
                service, METHODID_CODES)))
        .addMethod(
          getPinnedCodesMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              cosmwasm.wasm.v1.QueryOuterClass.QueryPinnedCodesRequest,
              cosmwasm.wasm.v1.QueryOuterClass.QueryPinnedCodesResponse>(
                service, METHODID_PINNED_CODES)))
        .addMethod(
          getParamsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              cosmwasm.wasm.v1.QueryOuterClass.QueryParamsRequest,
              cosmwasm.wasm.v1.QueryOuterClass.QueryParamsResponse>(
                service, METHODID_PARAMS)))
        .addMethod(
          getContractsByCreatorMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              cosmwasm.wasm.v1.QueryOuterClass.QueryContractsByCreatorRequest,
              cosmwasm.wasm.v1.QueryOuterClass.QueryContractsByCreatorResponse>(
                service, METHODID_CONTRACTS_BY_CREATOR)))
        .build();
  }

  private static abstract class QueryBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    QueryBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return cosmwasm.wasm.v1.QueryOuterClass.getDescriptor();
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
              .addMethod(getContractInfoMethod())
              .addMethod(getContractHistoryMethod())
              .addMethod(getContractsByCodeMethod())
              .addMethod(getAllContractStateMethod())
              .addMethod(getRawContractStateMethod())
              .addMethod(getSmartContractStateMethod())
              .addMethod(getCodeMethod())
              .addMethod(getCodesMethod())
              .addMethod(getPinnedCodesMethod())
              .addMethod(getParamsMethod())
              .addMethod(getContractsByCreatorMethod())
              .build();
        }
      }
    }
    return result;
  }
}
