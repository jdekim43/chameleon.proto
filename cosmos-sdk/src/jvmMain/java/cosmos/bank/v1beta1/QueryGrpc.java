package cosmos.bank.v1beta1;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * Query defines the gRPC querier service.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.54.0)",
    comments = "Source: cosmos/bank/v1beta1/query.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class QueryGrpc {

  private QueryGrpc() {}

  public static final String SERVICE_NAME = "cosmos.bank.v1beta1.Query";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<cosmos.bank.v1beta1.QueryOuterClass.QueryBalanceRequest,
      cosmos.bank.v1beta1.QueryOuterClass.QueryBalanceResponse> getBalanceMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Balance",
      requestType = cosmos.bank.v1beta1.QueryOuterClass.QueryBalanceRequest.class,
      responseType = cosmos.bank.v1beta1.QueryOuterClass.QueryBalanceResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<cosmos.bank.v1beta1.QueryOuterClass.QueryBalanceRequest,
      cosmos.bank.v1beta1.QueryOuterClass.QueryBalanceResponse> getBalanceMethod() {
    io.grpc.MethodDescriptor<cosmos.bank.v1beta1.QueryOuterClass.QueryBalanceRequest, cosmos.bank.v1beta1.QueryOuterClass.QueryBalanceResponse> getBalanceMethod;
    if ((getBalanceMethod = QueryGrpc.getBalanceMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getBalanceMethod = QueryGrpc.getBalanceMethod) == null) {
          QueryGrpc.getBalanceMethod = getBalanceMethod =
              io.grpc.MethodDescriptor.<cosmos.bank.v1beta1.QueryOuterClass.QueryBalanceRequest, cosmos.bank.v1beta1.QueryOuterClass.QueryBalanceResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Balance"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  cosmos.bank.v1beta1.QueryOuterClass.QueryBalanceRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  cosmos.bank.v1beta1.QueryOuterClass.QueryBalanceResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("Balance"))
              .build();
        }
      }
    }
    return getBalanceMethod;
  }

  private static volatile io.grpc.MethodDescriptor<cosmos.bank.v1beta1.QueryOuterClass.QueryAllBalancesRequest,
      cosmos.bank.v1beta1.QueryOuterClass.QueryAllBalancesResponse> getAllBalancesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "AllBalances",
      requestType = cosmos.bank.v1beta1.QueryOuterClass.QueryAllBalancesRequest.class,
      responseType = cosmos.bank.v1beta1.QueryOuterClass.QueryAllBalancesResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<cosmos.bank.v1beta1.QueryOuterClass.QueryAllBalancesRequest,
      cosmos.bank.v1beta1.QueryOuterClass.QueryAllBalancesResponse> getAllBalancesMethod() {
    io.grpc.MethodDescriptor<cosmos.bank.v1beta1.QueryOuterClass.QueryAllBalancesRequest, cosmos.bank.v1beta1.QueryOuterClass.QueryAllBalancesResponse> getAllBalancesMethod;
    if ((getAllBalancesMethod = QueryGrpc.getAllBalancesMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getAllBalancesMethod = QueryGrpc.getAllBalancesMethod) == null) {
          QueryGrpc.getAllBalancesMethod = getAllBalancesMethod =
              io.grpc.MethodDescriptor.<cosmos.bank.v1beta1.QueryOuterClass.QueryAllBalancesRequest, cosmos.bank.v1beta1.QueryOuterClass.QueryAllBalancesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "AllBalances"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  cosmos.bank.v1beta1.QueryOuterClass.QueryAllBalancesRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  cosmos.bank.v1beta1.QueryOuterClass.QueryAllBalancesResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("AllBalances"))
              .build();
        }
      }
    }
    return getAllBalancesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<cosmos.bank.v1beta1.QueryOuterClass.QuerySpendableBalancesRequest,
      cosmos.bank.v1beta1.QueryOuterClass.QuerySpendableBalancesResponse> getSpendableBalancesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SpendableBalances",
      requestType = cosmos.bank.v1beta1.QueryOuterClass.QuerySpendableBalancesRequest.class,
      responseType = cosmos.bank.v1beta1.QueryOuterClass.QuerySpendableBalancesResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<cosmos.bank.v1beta1.QueryOuterClass.QuerySpendableBalancesRequest,
      cosmos.bank.v1beta1.QueryOuterClass.QuerySpendableBalancesResponse> getSpendableBalancesMethod() {
    io.grpc.MethodDescriptor<cosmos.bank.v1beta1.QueryOuterClass.QuerySpendableBalancesRequest, cosmos.bank.v1beta1.QueryOuterClass.QuerySpendableBalancesResponse> getSpendableBalancesMethod;
    if ((getSpendableBalancesMethod = QueryGrpc.getSpendableBalancesMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getSpendableBalancesMethod = QueryGrpc.getSpendableBalancesMethod) == null) {
          QueryGrpc.getSpendableBalancesMethod = getSpendableBalancesMethod =
              io.grpc.MethodDescriptor.<cosmos.bank.v1beta1.QueryOuterClass.QuerySpendableBalancesRequest, cosmos.bank.v1beta1.QueryOuterClass.QuerySpendableBalancesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SpendableBalances"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  cosmos.bank.v1beta1.QueryOuterClass.QuerySpendableBalancesRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  cosmos.bank.v1beta1.QueryOuterClass.QuerySpendableBalancesResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("SpendableBalances"))
              .build();
        }
      }
    }
    return getSpendableBalancesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<cosmos.bank.v1beta1.QueryOuterClass.QuerySpendableBalanceByDenomRequest,
      cosmos.bank.v1beta1.QueryOuterClass.QuerySpendableBalanceByDenomResponse> getSpendableBalanceByDenomMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SpendableBalanceByDenom",
      requestType = cosmos.bank.v1beta1.QueryOuterClass.QuerySpendableBalanceByDenomRequest.class,
      responseType = cosmos.bank.v1beta1.QueryOuterClass.QuerySpendableBalanceByDenomResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<cosmos.bank.v1beta1.QueryOuterClass.QuerySpendableBalanceByDenomRequest,
      cosmos.bank.v1beta1.QueryOuterClass.QuerySpendableBalanceByDenomResponse> getSpendableBalanceByDenomMethod() {
    io.grpc.MethodDescriptor<cosmos.bank.v1beta1.QueryOuterClass.QuerySpendableBalanceByDenomRequest, cosmos.bank.v1beta1.QueryOuterClass.QuerySpendableBalanceByDenomResponse> getSpendableBalanceByDenomMethod;
    if ((getSpendableBalanceByDenomMethod = QueryGrpc.getSpendableBalanceByDenomMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getSpendableBalanceByDenomMethod = QueryGrpc.getSpendableBalanceByDenomMethod) == null) {
          QueryGrpc.getSpendableBalanceByDenomMethod = getSpendableBalanceByDenomMethod =
              io.grpc.MethodDescriptor.<cosmos.bank.v1beta1.QueryOuterClass.QuerySpendableBalanceByDenomRequest, cosmos.bank.v1beta1.QueryOuterClass.QuerySpendableBalanceByDenomResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SpendableBalanceByDenom"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  cosmos.bank.v1beta1.QueryOuterClass.QuerySpendableBalanceByDenomRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  cosmos.bank.v1beta1.QueryOuterClass.QuerySpendableBalanceByDenomResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("SpendableBalanceByDenom"))
              .build();
        }
      }
    }
    return getSpendableBalanceByDenomMethod;
  }

  private static volatile io.grpc.MethodDescriptor<cosmos.bank.v1beta1.QueryOuterClass.QueryTotalSupplyRequest,
      cosmos.bank.v1beta1.QueryOuterClass.QueryTotalSupplyResponse> getTotalSupplyMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "TotalSupply",
      requestType = cosmos.bank.v1beta1.QueryOuterClass.QueryTotalSupplyRequest.class,
      responseType = cosmos.bank.v1beta1.QueryOuterClass.QueryTotalSupplyResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<cosmos.bank.v1beta1.QueryOuterClass.QueryTotalSupplyRequest,
      cosmos.bank.v1beta1.QueryOuterClass.QueryTotalSupplyResponse> getTotalSupplyMethod() {
    io.grpc.MethodDescriptor<cosmos.bank.v1beta1.QueryOuterClass.QueryTotalSupplyRequest, cosmos.bank.v1beta1.QueryOuterClass.QueryTotalSupplyResponse> getTotalSupplyMethod;
    if ((getTotalSupplyMethod = QueryGrpc.getTotalSupplyMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getTotalSupplyMethod = QueryGrpc.getTotalSupplyMethod) == null) {
          QueryGrpc.getTotalSupplyMethod = getTotalSupplyMethod =
              io.grpc.MethodDescriptor.<cosmos.bank.v1beta1.QueryOuterClass.QueryTotalSupplyRequest, cosmos.bank.v1beta1.QueryOuterClass.QueryTotalSupplyResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "TotalSupply"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  cosmos.bank.v1beta1.QueryOuterClass.QueryTotalSupplyRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  cosmos.bank.v1beta1.QueryOuterClass.QueryTotalSupplyResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("TotalSupply"))
              .build();
        }
      }
    }
    return getTotalSupplyMethod;
  }

  private static volatile io.grpc.MethodDescriptor<cosmos.bank.v1beta1.QueryOuterClass.QuerySupplyOfRequest,
      cosmos.bank.v1beta1.QueryOuterClass.QuerySupplyOfResponse> getSupplyOfMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SupplyOf",
      requestType = cosmos.bank.v1beta1.QueryOuterClass.QuerySupplyOfRequest.class,
      responseType = cosmos.bank.v1beta1.QueryOuterClass.QuerySupplyOfResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<cosmos.bank.v1beta1.QueryOuterClass.QuerySupplyOfRequest,
      cosmos.bank.v1beta1.QueryOuterClass.QuerySupplyOfResponse> getSupplyOfMethod() {
    io.grpc.MethodDescriptor<cosmos.bank.v1beta1.QueryOuterClass.QuerySupplyOfRequest, cosmos.bank.v1beta1.QueryOuterClass.QuerySupplyOfResponse> getSupplyOfMethod;
    if ((getSupplyOfMethod = QueryGrpc.getSupplyOfMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getSupplyOfMethod = QueryGrpc.getSupplyOfMethod) == null) {
          QueryGrpc.getSupplyOfMethod = getSupplyOfMethod =
              io.grpc.MethodDescriptor.<cosmos.bank.v1beta1.QueryOuterClass.QuerySupplyOfRequest, cosmos.bank.v1beta1.QueryOuterClass.QuerySupplyOfResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SupplyOf"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  cosmos.bank.v1beta1.QueryOuterClass.QuerySupplyOfRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  cosmos.bank.v1beta1.QueryOuterClass.QuerySupplyOfResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("SupplyOf"))
              .build();
        }
      }
    }
    return getSupplyOfMethod;
  }

  private static volatile io.grpc.MethodDescriptor<cosmos.bank.v1beta1.QueryOuterClass.QueryParamsRequest,
      cosmos.bank.v1beta1.QueryOuterClass.QueryParamsResponse> getParamsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Params",
      requestType = cosmos.bank.v1beta1.QueryOuterClass.QueryParamsRequest.class,
      responseType = cosmos.bank.v1beta1.QueryOuterClass.QueryParamsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<cosmos.bank.v1beta1.QueryOuterClass.QueryParamsRequest,
      cosmos.bank.v1beta1.QueryOuterClass.QueryParamsResponse> getParamsMethod() {
    io.grpc.MethodDescriptor<cosmos.bank.v1beta1.QueryOuterClass.QueryParamsRequest, cosmos.bank.v1beta1.QueryOuterClass.QueryParamsResponse> getParamsMethod;
    if ((getParamsMethod = QueryGrpc.getParamsMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getParamsMethod = QueryGrpc.getParamsMethod) == null) {
          QueryGrpc.getParamsMethod = getParamsMethod =
              io.grpc.MethodDescriptor.<cosmos.bank.v1beta1.QueryOuterClass.QueryParamsRequest, cosmos.bank.v1beta1.QueryOuterClass.QueryParamsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Params"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  cosmos.bank.v1beta1.QueryOuterClass.QueryParamsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  cosmos.bank.v1beta1.QueryOuterClass.QueryParamsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("Params"))
              .build();
        }
      }
    }
    return getParamsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<cosmos.bank.v1beta1.QueryOuterClass.QueryDenomMetadataRequest,
      cosmos.bank.v1beta1.QueryOuterClass.QueryDenomMetadataResponse> getDenomMetadataMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DenomMetadata",
      requestType = cosmos.bank.v1beta1.QueryOuterClass.QueryDenomMetadataRequest.class,
      responseType = cosmos.bank.v1beta1.QueryOuterClass.QueryDenomMetadataResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<cosmos.bank.v1beta1.QueryOuterClass.QueryDenomMetadataRequest,
      cosmos.bank.v1beta1.QueryOuterClass.QueryDenomMetadataResponse> getDenomMetadataMethod() {
    io.grpc.MethodDescriptor<cosmos.bank.v1beta1.QueryOuterClass.QueryDenomMetadataRequest, cosmos.bank.v1beta1.QueryOuterClass.QueryDenomMetadataResponse> getDenomMetadataMethod;
    if ((getDenomMetadataMethod = QueryGrpc.getDenomMetadataMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getDenomMetadataMethod = QueryGrpc.getDenomMetadataMethod) == null) {
          QueryGrpc.getDenomMetadataMethod = getDenomMetadataMethod =
              io.grpc.MethodDescriptor.<cosmos.bank.v1beta1.QueryOuterClass.QueryDenomMetadataRequest, cosmos.bank.v1beta1.QueryOuterClass.QueryDenomMetadataResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DenomMetadata"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  cosmos.bank.v1beta1.QueryOuterClass.QueryDenomMetadataRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  cosmos.bank.v1beta1.QueryOuterClass.QueryDenomMetadataResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("DenomMetadata"))
              .build();
        }
      }
    }
    return getDenomMetadataMethod;
  }

  private static volatile io.grpc.MethodDescriptor<cosmos.bank.v1beta1.QueryOuterClass.QueryDenomsMetadataRequest,
      cosmos.bank.v1beta1.QueryOuterClass.QueryDenomsMetadataResponse> getDenomsMetadataMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DenomsMetadata",
      requestType = cosmos.bank.v1beta1.QueryOuterClass.QueryDenomsMetadataRequest.class,
      responseType = cosmos.bank.v1beta1.QueryOuterClass.QueryDenomsMetadataResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<cosmos.bank.v1beta1.QueryOuterClass.QueryDenomsMetadataRequest,
      cosmos.bank.v1beta1.QueryOuterClass.QueryDenomsMetadataResponse> getDenomsMetadataMethod() {
    io.grpc.MethodDescriptor<cosmos.bank.v1beta1.QueryOuterClass.QueryDenomsMetadataRequest, cosmos.bank.v1beta1.QueryOuterClass.QueryDenomsMetadataResponse> getDenomsMetadataMethod;
    if ((getDenomsMetadataMethod = QueryGrpc.getDenomsMetadataMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getDenomsMetadataMethod = QueryGrpc.getDenomsMetadataMethod) == null) {
          QueryGrpc.getDenomsMetadataMethod = getDenomsMetadataMethod =
              io.grpc.MethodDescriptor.<cosmos.bank.v1beta1.QueryOuterClass.QueryDenomsMetadataRequest, cosmos.bank.v1beta1.QueryOuterClass.QueryDenomsMetadataResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DenomsMetadata"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  cosmos.bank.v1beta1.QueryOuterClass.QueryDenomsMetadataRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  cosmos.bank.v1beta1.QueryOuterClass.QueryDenomsMetadataResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("DenomsMetadata"))
              .build();
        }
      }
    }
    return getDenomsMetadataMethod;
  }

  private static volatile io.grpc.MethodDescriptor<cosmos.bank.v1beta1.QueryOuterClass.QueryDenomOwnersRequest,
      cosmos.bank.v1beta1.QueryOuterClass.QueryDenomOwnersResponse> getDenomOwnersMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DenomOwners",
      requestType = cosmos.bank.v1beta1.QueryOuterClass.QueryDenomOwnersRequest.class,
      responseType = cosmos.bank.v1beta1.QueryOuterClass.QueryDenomOwnersResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<cosmos.bank.v1beta1.QueryOuterClass.QueryDenomOwnersRequest,
      cosmos.bank.v1beta1.QueryOuterClass.QueryDenomOwnersResponse> getDenomOwnersMethod() {
    io.grpc.MethodDescriptor<cosmos.bank.v1beta1.QueryOuterClass.QueryDenomOwnersRequest, cosmos.bank.v1beta1.QueryOuterClass.QueryDenomOwnersResponse> getDenomOwnersMethod;
    if ((getDenomOwnersMethod = QueryGrpc.getDenomOwnersMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getDenomOwnersMethod = QueryGrpc.getDenomOwnersMethod) == null) {
          QueryGrpc.getDenomOwnersMethod = getDenomOwnersMethod =
              io.grpc.MethodDescriptor.<cosmos.bank.v1beta1.QueryOuterClass.QueryDenomOwnersRequest, cosmos.bank.v1beta1.QueryOuterClass.QueryDenomOwnersResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DenomOwners"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  cosmos.bank.v1beta1.QueryOuterClass.QueryDenomOwnersRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  cosmos.bank.v1beta1.QueryOuterClass.QueryDenomOwnersResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("DenomOwners"))
              .build();
        }
      }
    }
    return getDenomOwnersMethod;
  }

  private static volatile io.grpc.MethodDescriptor<cosmos.bank.v1beta1.QueryOuterClass.QuerySendEnabledRequest,
      cosmos.bank.v1beta1.QueryOuterClass.QuerySendEnabledResponse> getSendEnabledMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SendEnabled",
      requestType = cosmos.bank.v1beta1.QueryOuterClass.QuerySendEnabledRequest.class,
      responseType = cosmos.bank.v1beta1.QueryOuterClass.QuerySendEnabledResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<cosmos.bank.v1beta1.QueryOuterClass.QuerySendEnabledRequest,
      cosmos.bank.v1beta1.QueryOuterClass.QuerySendEnabledResponse> getSendEnabledMethod() {
    io.grpc.MethodDescriptor<cosmos.bank.v1beta1.QueryOuterClass.QuerySendEnabledRequest, cosmos.bank.v1beta1.QueryOuterClass.QuerySendEnabledResponse> getSendEnabledMethod;
    if ((getSendEnabledMethod = QueryGrpc.getSendEnabledMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getSendEnabledMethod = QueryGrpc.getSendEnabledMethod) == null) {
          QueryGrpc.getSendEnabledMethod = getSendEnabledMethod =
              io.grpc.MethodDescriptor.<cosmos.bank.v1beta1.QueryOuterClass.QuerySendEnabledRequest, cosmos.bank.v1beta1.QueryOuterClass.QuerySendEnabledResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SendEnabled"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  cosmos.bank.v1beta1.QueryOuterClass.QuerySendEnabledRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  cosmos.bank.v1beta1.QueryOuterClass.QuerySendEnabledResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("SendEnabled"))
              .build();
        }
      }
    }
    return getSendEnabledMethod;
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
     * Balance queries the balance of a single coin for a single account.
     * </pre>
     */
    default void balance(cosmos.bank.v1beta1.QueryOuterClass.QueryBalanceRequest request,
        io.grpc.stub.StreamObserver<cosmos.bank.v1beta1.QueryOuterClass.QueryBalanceResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getBalanceMethod(), responseObserver);
    }

    /**
     * <pre>
     * AllBalances queries the balance of all coins for a single account.
     * When called from another module, this query might consume a high amount of
     * gas if the pagination field is incorrectly set.
     * </pre>
     */
    default void allBalances(cosmos.bank.v1beta1.QueryOuterClass.QueryAllBalancesRequest request,
        io.grpc.stub.StreamObserver<cosmos.bank.v1beta1.QueryOuterClass.QueryAllBalancesResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getAllBalancesMethod(), responseObserver);
    }

    /**
     * <pre>
     * SpendableBalances queries the spendable balance of all coins for a single
     * account.
     * When called from another module, this query might consume a high amount of
     * gas if the pagination field is incorrectly set.
     * Since: cosmos-sdk 0.46
     * </pre>
     */
    default void spendableBalances(cosmos.bank.v1beta1.QueryOuterClass.QuerySpendableBalancesRequest request,
        io.grpc.stub.StreamObserver<cosmos.bank.v1beta1.QueryOuterClass.QuerySpendableBalancesResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSpendableBalancesMethod(), responseObserver);
    }

    /**
     * <pre>
     * SpendableBalanceByDenom queries the spendable balance of a single denom for
     * a single account.
     * When called from another module, this query might consume a high amount of
     * gas if the pagination field is incorrectly set.
     * Since: cosmos-sdk 0.47
     * </pre>
     */
    default void spendableBalanceByDenom(cosmos.bank.v1beta1.QueryOuterClass.QuerySpendableBalanceByDenomRequest request,
        io.grpc.stub.StreamObserver<cosmos.bank.v1beta1.QueryOuterClass.QuerySpendableBalanceByDenomResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSpendableBalanceByDenomMethod(), responseObserver);
    }

    /**
     * <pre>
     * TotalSupply queries the total supply of all coins.
     * When called from another module, this query might consume a high amount of
     * gas if the pagination field is incorrectly set.
     * </pre>
     */
    default void totalSupply(cosmos.bank.v1beta1.QueryOuterClass.QueryTotalSupplyRequest request,
        io.grpc.stub.StreamObserver<cosmos.bank.v1beta1.QueryOuterClass.QueryTotalSupplyResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getTotalSupplyMethod(), responseObserver);
    }

    /**
     * <pre>
     * SupplyOf queries the supply of a single coin.
     * When called from another module, this query might consume a high amount of
     * gas if the pagination field is incorrectly set.
     * </pre>
     */
    default void supplyOf(cosmos.bank.v1beta1.QueryOuterClass.QuerySupplyOfRequest request,
        io.grpc.stub.StreamObserver<cosmos.bank.v1beta1.QueryOuterClass.QuerySupplyOfResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSupplyOfMethod(), responseObserver);
    }

    /**
     * <pre>
     * Params queries the parameters of x/bank module.
     * </pre>
     */
    default void params(cosmos.bank.v1beta1.QueryOuterClass.QueryParamsRequest request,
        io.grpc.stub.StreamObserver<cosmos.bank.v1beta1.QueryOuterClass.QueryParamsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getParamsMethod(), responseObserver);
    }

    /**
     * <pre>
     * DenomsMetadata queries the client metadata of a given coin denomination.
     * </pre>
     */
    default void denomMetadata(cosmos.bank.v1beta1.QueryOuterClass.QueryDenomMetadataRequest request,
        io.grpc.stub.StreamObserver<cosmos.bank.v1beta1.QueryOuterClass.QueryDenomMetadataResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDenomMetadataMethod(), responseObserver);
    }

    /**
     * <pre>
     * DenomsMetadata queries the client metadata for all registered coin
     * denominations.
     * </pre>
     */
    default void denomsMetadata(cosmos.bank.v1beta1.QueryOuterClass.QueryDenomsMetadataRequest request,
        io.grpc.stub.StreamObserver<cosmos.bank.v1beta1.QueryOuterClass.QueryDenomsMetadataResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDenomsMetadataMethod(), responseObserver);
    }

    /**
     * <pre>
     * DenomOwners queries for all account addresses that own a particular token
     * denomination.
     * When called from another module, this query might consume a high amount of
     * gas if the pagination field is incorrectly set.
     * Since: cosmos-sdk 0.46
     * </pre>
     */
    default void denomOwners(cosmos.bank.v1beta1.QueryOuterClass.QueryDenomOwnersRequest request,
        io.grpc.stub.StreamObserver<cosmos.bank.v1beta1.QueryOuterClass.QueryDenomOwnersResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDenomOwnersMethod(), responseObserver);
    }

    /**
     * <pre>
     * SendEnabled queries for SendEnabled entries.
     * This query only returns denominations that have specific SendEnabled settings.
     * Any denomination that does not have a specific setting will use the default
     * params.default_send_enabled, and will not be returned by this query.
     * Since: cosmos-sdk 0.47
     * </pre>
     */
    default void sendEnabled(cosmos.bank.v1beta1.QueryOuterClass.QuerySendEnabledRequest request,
        io.grpc.stub.StreamObserver<cosmos.bank.v1beta1.QueryOuterClass.QuerySendEnabledResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSendEnabledMethod(), responseObserver);
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
     * Balance queries the balance of a single coin for a single account.
     * </pre>
     */
    public void balance(cosmos.bank.v1beta1.QueryOuterClass.QueryBalanceRequest request,
        io.grpc.stub.StreamObserver<cosmos.bank.v1beta1.QueryOuterClass.QueryBalanceResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getBalanceMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * AllBalances queries the balance of all coins for a single account.
     * When called from another module, this query might consume a high amount of
     * gas if the pagination field is incorrectly set.
     * </pre>
     */
    public void allBalances(cosmos.bank.v1beta1.QueryOuterClass.QueryAllBalancesRequest request,
        io.grpc.stub.StreamObserver<cosmos.bank.v1beta1.QueryOuterClass.QueryAllBalancesResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getAllBalancesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * SpendableBalances queries the spendable balance of all coins for a single
     * account.
     * When called from another module, this query might consume a high amount of
     * gas if the pagination field is incorrectly set.
     * Since: cosmos-sdk 0.46
     * </pre>
     */
    public void spendableBalances(cosmos.bank.v1beta1.QueryOuterClass.QuerySpendableBalancesRequest request,
        io.grpc.stub.StreamObserver<cosmos.bank.v1beta1.QueryOuterClass.QuerySpendableBalancesResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSpendableBalancesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * SpendableBalanceByDenom queries the spendable balance of a single denom for
     * a single account.
     * When called from another module, this query might consume a high amount of
     * gas if the pagination field is incorrectly set.
     * Since: cosmos-sdk 0.47
     * </pre>
     */
    public void spendableBalanceByDenom(cosmos.bank.v1beta1.QueryOuterClass.QuerySpendableBalanceByDenomRequest request,
        io.grpc.stub.StreamObserver<cosmos.bank.v1beta1.QueryOuterClass.QuerySpendableBalanceByDenomResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSpendableBalanceByDenomMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * TotalSupply queries the total supply of all coins.
     * When called from another module, this query might consume a high amount of
     * gas if the pagination field is incorrectly set.
     * </pre>
     */
    public void totalSupply(cosmos.bank.v1beta1.QueryOuterClass.QueryTotalSupplyRequest request,
        io.grpc.stub.StreamObserver<cosmos.bank.v1beta1.QueryOuterClass.QueryTotalSupplyResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getTotalSupplyMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * SupplyOf queries the supply of a single coin.
     * When called from another module, this query might consume a high amount of
     * gas if the pagination field is incorrectly set.
     * </pre>
     */
    public void supplyOf(cosmos.bank.v1beta1.QueryOuterClass.QuerySupplyOfRequest request,
        io.grpc.stub.StreamObserver<cosmos.bank.v1beta1.QueryOuterClass.QuerySupplyOfResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSupplyOfMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Params queries the parameters of x/bank module.
     * </pre>
     */
    public void params(cosmos.bank.v1beta1.QueryOuterClass.QueryParamsRequest request,
        io.grpc.stub.StreamObserver<cosmos.bank.v1beta1.QueryOuterClass.QueryParamsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getParamsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * DenomsMetadata queries the client metadata of a given coin denomination.
     * </pre>
     */
    public void denomMetadata(cosmos.bank.v1beta1.QueryOuterClass.QueryDenomMetadataRequest request,
        io.grpc.stub.StreamObserver<cosmos.bank.v1beta1.QueryOuterClass.QueryDenomMetadataResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDenomMetadataMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * DenomsMetadata queries the client metadata for all registered coin
     * denominations.
     * </pre>
     */
    public void denomsMetadata(cosmos.bank.v1beta1.QueryOuterClass.QueryDenomsMetadataRequest request,
        io.grpc.stub.StreamObserver<cosmos.bank.v1beta1.QueryOuterClass.QueryDenomsMetadataResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDenomsMetadataMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * DenomOwners queries for all account addresses that own a particular token
     * denomination.
     * When called from another module, this query might consume a high amount of
     * gas if the pagination field is incorrectly set.
     * Since: cosmos-sdk 0.46
     * </pre>
     */
    public void denomOwners(cosmos.bank.v1beta1.QueryOuterClass.QueryDenomOwnersRequest request,
        io.grpc.stub.StreamObserver<cosmos.bank.v1beta1.QueryOuterClass.QueryDenomOwnersResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDenomOwnersMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * SendEnabled queries for SendEnabled entries.
     * This query only returns denominations that have specific SendEnabled settings.
     * Any denomination that does not have a specific setting will use the default
     * params.default_send_enabled, and will not be returned by this query.
     * Since: cosmos-sdk 0.47
     * </pre>
     */
    public void sendEnabled(cosmos.bank.v1beta1.QueryOuterClass.QuerySendEnabledRequest request,
        io.grpc.stub.StreamObserver<cosmos.bank.v1beta1.QueryOuterClass.QuerySendEnabledResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSendEnabledMethod(), getCallOptions()), request, responseObserver);
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
     * Balance queries the balance of a single coin for a single account.
     * </pre>
     */
    public cosmos.bank.v1beta1.QueryOuterClass.QueryBalanceResponse balance(cosmos.bank.v1beta1.QueryOuterClass.QueryBalanceRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getBalanceMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * AllBalances queries the balance of all coins for a single account.
     * When called from another module, this query might consume a high amount of
     * gas if the pagination field is incorrectly set.
     * </pre>
     */
    public cosmos.bank.v1beta1.QueryOuterClass.QueryAllBalancesResponse allBalances(cosmos.bank.v1beta1.QueryOuterClass.QueryAllBalancesRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getAllBalancesMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * SpendableBalances queries the spendable balance of all coins for a single
     * account.
     * When called from another module, this query might consume a high amount of
     * gas if the pagination field is incorrectly set.
     * Since: cosmos-sdk 0.46
     * </pre>
     */
    public cosmos.bank.v1beta1.QueryOuterClass.QuerySpendableBalancesResponse spendableBalances(cosmos.bank.v1beta1.QueryOuterClass.QuerySpendableBalancesRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSpendableBalancesMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * SpendableBalanceByDenom queries the spendable balance of a single denom for
     * a single account.
     * When called from another module, this query might consume a high amount of
     * gas if the pagination field is incorrectly set.
     * Since: cosmos-sdk 0.47
     * </pre>
     */
    public cosmos.bank.v1beta1.QueryOuterClass.QuerySpendableBalanceByDenomResponse spendableBalanceByDenom(cosmos.bank.v1beta1.QueryOuterClass.QuerySpendableBalanceByDenomRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSpendableBalanceByDenomMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * TotalSupply queries the total supply of all coins.
     * When called from another module, this query might consume a high amount of
     * gas if the pagination field is incorrectly set.
     * </pre>
     */
    public cosmos.bank.v1beta1.QueryOuterClass.QueryTotalSupplyResponse totalSupply(cosmos.bank.v1beta1.QueryOuterClass.QueryTotalSupplyRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getTotalSupplyMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * SupplyOf queries the supply of a single coin.
     * When called from another module, this query might consume a high amount of
     * gas if the pagination field is incorrectly set.
     * </pre>
     */
    public cosmos.bank.v1beta1.QueryOuterClass.QuerySupplyOfResponse supplyOf(cosmos.bank.v1beta1.QueryOuterClass.QuerySupplyOfRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSupplyOfMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Params queries the parameters of x/bank module.
     * </pre>
     */
    public cosmos.bank.v1beta1.QueryOuterClass.QueryParamsResponse params(cosmos.bank.v1beta1.QueryOuterClass.QueryParamsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getParamsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * DenomsMetadata queries the client metadata of a given coin denomination.
     * </pre>
     */
    public cosmos.bank.v1beta1.QueryOuterClass.QueryDenomMetadataResponse denomMetadata(cosmos.bank.v1beta1.QueryOuterClass.QueryDenomMetadataRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDenomMetadataMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * DenomsMetadata queries the client metadata for all registered coin
     * denominations.
     * </pre>
     */
    public cosmos.bank.v1beta1.QueryOuterClass.QueryDenomsMetadataResponse denomsMetadata(cosmos.bank.v1beta1.QueryOuterClass.QueryDenomsMetadataRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDenomsMetadataMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * DenomOwners queries for all account addresses that own a particular token
     * denomination.
     * When called from another module, this query might consume a high amount of
     * gas if the pagination field is incorrectly set.
     * Since: cosmos-sdk 0.46
     * </pre>
     */
    public cosmos.bank.v1beta1.QueryOuterClass.QueryDenomOwnersResponse denomOwners(cosmos.bank.v1beta1.QueryOuterClass.QueryDenomOwnersRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDenomOwnersMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * SendEnabled queries for SendEnabled entries.
     * This query only returns denominations that have specific SendEnabled settings.
     * Any denomination that does not have a specific setting will use the default
     * params.default_send_enabled, and will not be returned by this query.
     * Since: cosmos-sdk 0.47
     * </pre>
     */
    public cosmos.bank.v1beta1.QueryOuterClass.QuerySendEnabledResponse sendEnabled(cosmos.bank.v1beta1.QueryOuterClass.QuerySendEnabledRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSendEnabledMethod(), getCallOptions(), request);
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
     * Balance queries the balance of a single coin for a single account.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<cosmos.bank.v1beta1.QueryOuterClass.QueryBalanceResponse> balance(
        cosmos.bank.v1beta1.QueryOuterClass.QueryBalanceRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getBalanceMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * AllBalances queries the balance of all coins for a single account.
     * When called from another module, this query might consume a high amount of
     * gas if the pagination field is incorrectly set.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<cosmos.bank.v1beta1.QueryOuterClass.QueryAllBalancesResponse> allBalances(
        cosmos.bank.v1beta1.QueryOuterClass.QueryAllBalancesRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getAllBalancesMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * SpendableBalances queries the spendable balance of all coins for a single
     * account.
     * When called from another module, this query might consume a high amount of
     * gas if the pagination field is incorrectly set.
     * Since: cosmos-sdk 0.46
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<cosmos.bank.v1beta1.QueryOuterClass.QuerySpendableBalancesResponse> spendableBalances(
        cosmos.bank.v1beta1.QueryOuterClass.QuerySpendableBalancesRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSpendableBalancesMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * SpendableBalanceByDenom queries the spendable balance of a single denom for
     * a single account.
     * When called from another module, this query might consume a high amount of
     * gas if the pagination field is incorrectly set.
     * Since: cosmos-sdk 0.47
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<cosmos.bank.v1beta1.QueryOuterClass.QuerySpendableBalanceByDenomResponse> spendableBalanceByDenom(
        cosmos.bank.v1beta1.QueryOuterClass.QuerySpendableBalanceByDenomRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSpendableBalanceByDenomMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * TotalSupply queries the total supply of all coins.
     * When called from another module, this query might consume a high amount of
     * gas if the pagination field is incorrectly set.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<cosmos.bank.v1beta1.QueryOuterClass.QueryTotalSupplyResponse> totalSupply(
        cosmos.bank.v1beta1.QueryOuterClass.QueryTotalSupplyRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getTotalSupplyMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * SupplyOf queries the supply of a single coin.
     * When called from another module, this query might consume a high amount of
     * gas if the pagination field is incorrectly set.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<cosmos.bank.v1beta1.QueryOuterClass.QuerySupplyOfResponse> supplyOf(
        cosmos.bank.v1beta1.QueryOuterClass.QuerySupplyOfRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSupplyOfMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Params queries the parameters of x/bank module.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<cosmos.bank.v1beta1.QueryOuterClass.QueryParamsResponse> params(
        cosmos.bank.v1beta1.QueryOuterClass.QueryParamsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getParamsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * DenomsMetadata queries the client metadata of a given coin denomination.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<cosmos.bank.v1beta1.QueryOuterClass.QueryDenomMetadataResponse> denomMetadata(
        cosmos.bank.v1beta1.QueryOuterClass.QueryDenomMetadataRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDenomMetadataMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * DenomsMetadata queries the client metadata for all registered coin
     * denominations.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<cosmos.bank.v1beta1.QueryOuterClass.QueryDenomsMetadataResponse> denomsMetadata(
        cosmos.bank.v1beta1.QueryOuterClass.QueryDenomsMetadataRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDenomsMetadataMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * DenomOwners queries for all account addresses that own a particular token
     * denomination.
     * When called from another module, this query might consume a high amount of
     * gas if the pagination field is incorrectly set.
     * Since: cosmos-sdk 0.46
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<cosmos.bank.v1beta1.QueryOuterClass.QueryDenomOwnersResponse> denomOwners(
        cosmos.bank.v1beta1.QueryOuterClass.QueryDenomOwnersRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDenomOwnersMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * SendEnabled queries for SendEnabled entries.
     * This query only returns denominations that have specific SendEnabled settings.
     * Any denomination that does not have a specific setting will use the default
     * params.default_send_enabled, and will not be returned by this query.
     * Since: cosmos-sdk 0.47
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<cosmos.bank.v1beta1.QueryOuterClass.QuerySendEnabledResponse> sendEnabled(
        cosmos.bank.v1beta1.QueryOuterClass.QuerySendEnabledRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSendEnabledMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_BALANCE = 0;
  private static final int METHODID_ALL_BALANCES = 1;
  private static final int METHODID_SPENDABLE_BALANCES = 2;
  private static final int METHODID_SPENDABLE_BALANCE_BY_DENOM = 3;
  private static final int METHODID_TOTAL_SUPPLY = 4;
  private static final int METHODID_SUPPLY_OF = 5;
  private static final int METHODID_PARAMS = 6;
  private static final int METHODID_DENOM_METADATA = 7;
  private static final int METHODID_DENOMS_METADATA = 8;
  private static final int METHODID_DENOM_OWNERS = 9;
  private static final int METHODID_SEND_ENABLED = 10;

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
        case METHODID_BALANCE:
          serviceImpl.balance((cosmos.bank.v1beta1.QueryOuterClass.QueryBalanceRequest) request,
              (io.grpc.stub.StreamObserver<cosmos.bank.v1beta1.QueryOuterClass.QueryBalanceResponse>) responseObserver);
          break;
        case METHODID_ALL_BALANCES:
          serviceImpl.allBalances((cosmos.bank.v1beta1.QueryOuterClass.QueryAllBalancesRequest) request,
              (io.grpc.stub.StreamObserver<cosmos.bank.v1beta1.QueryOuterClass.QueryAllBalancesResponse>) responseObserver);
          break;
        case METHODID_SPENDABLE_BALANCES:
          serviceImpl.spendableBalances((cosmos.bank.v1beta1.QueryOuterClass.QuerySpendableBalancesRequest) request,
              (io.grpc.stub.StreamObserver<cosmos.bank.v1beta1.QueryOuterClass.QuerySpendableBalancesResponse>) responseObserver);
          break;
        case METHODID_SPENDABLE_BALANCE_BY_DENOM:
          serviceImpl.spendableBalanceByDenom((cosmos.bank.v1beta1.QueryOuterClass.QuerySpendableBalanceByDenomRequest) request,
              (io.grpc.stub.StreamObserver<cosmos.bank.v1beta1.QueryOuterClass.QuerySpendableBalanceByDenomResponse>) responseObserver);
          break;
        case METHODID_TOTAL_SUPPLY:
          serviceImpl.totalSupply((cosmos.bank.v1beta1.QueryOuterClass.QueryTotalSupplyRequest) request,
              (io.grpc.stub.StreamObserver<cosmos.bank.v1beta1.QueryOuterClass.QueryTotalSupplyResponse>) responseObserver);
          break;
        case METHODID_SUPPLY_OF:
          serviceImpl.supplyOf((cosmos.bank.v1beta1.QueryOuterClass.QuerySupplyOfRequest) request,
              (io.grpc.stub.StreamObserver<cosmos.bank.v1beta1.QueryOuterClass.QuerySupplyOfResponse>) responseObserver);
          break;
        case METHODID_PARAMS:
          serviceImpl.params((cosmos.bank.v1beta1.QueryOuterClass.QueryParamsRequest) request,
              (io.grpc.stub.StreamObserver<cosmos.bank.v1beta1.QueryOuterClass.QueryParamsResponse>) responseObserver);
          break;
        case METHODID_DENOM_METADATA:
          serviceImpl.denomMetadata((cosmos.bank.v1beta1.QueryOuterClass.QueryDenomMetadataRequest) request,
              (io.grpc.stub.StreamObserver<cosmos.bank.v1beta1.QueryOuterClass.QueryDenomMetadataResponse>) responseObserver);
          break;
        case METHODID_DENOMS_METADATA:
          serviceImpl.denomsMetadata((cosmos.bank.v1beta1.QueryOuterClass.QueryDenomsMetadataRequest) request,
              (io.grpc.stub.StreamObserver<cosmos.bank.v1beta1.QueryOuterClass.QueryDenomsMetadataResponse>) responseObserver);
          break;
        case METHODID_DENOM_OWNERS:
          serviceImpl.denomOwners((cosmos.bank.v1beta1.QueryOuterClass.QueryDenomOwnersRequest) request,
              (io.grpc.stub.StreamObserver<cosmos.bank.v1beta1.QueryOuterClass.QueryDenomOwnersResponse>) responseObserver);
          break;
        case METHODID_SEND_ENABLED:
          serviceImpl.sendEnabled((cosmos.bank.v1beta1.QueryOuterClass.QuerySendEnabledRequest) request,
              (io.grpc.stub.StreamObserver<cosmos.bank.v1beta1.QueryOuterClass.QuerySendEnabledResponse>) responseObserver);
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
          getBalanceMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              cosmos.bank.v1beta1.QueryOuterClass.QueryBalanceRequest,
              cosmos.bank.v1beta1.QueryOuterClass.QueryBalanceResponse>(
                service, METHODID_BALANCE)))
        .addMethod(
          getAllBalancesMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              cosmos.bank.v1beta1.QueryOuterClass.QueryAllBalancesRequest,
              cosmos.bank.v1beta1.QueryOuterClass.QueryAllBalancesResponse>(
                service, METHODID_ALL_BALANCES)))
        .addMethod(
          getSpendableBalancesMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              cosmos.bank.v1beta1.QueryOuterClass.QuerySpendableBalancesRequest,
              cosmos.bank.v1beta1.QueryOuterClass.QuerySpendableBalancesResponse>(
                service, METHODID_SPENDABLE_BALANCES)))
        .addMethod(
          getSpendableBalanceByDenomMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              cosmos.bank.v1beta1.QueryOuterClass.QuerySpendableBalanceByDenomRequest,
              cosmos.bank.v1beta1.QueryOuterClass.QuerySpendableBalanceByDenomResponse>(
                service, METHODID_SPENDABLE_BALANCE_BY_DENOM)))
        .addMethod(
          getTotalSupplyMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              cosmos.bank.v1beta1.QueryOuterClass.QueryTotalSupplyRequest,
              cosmos.bank.v1beta1.QueryOuterClass.QueryTotalSupplyResponse>(
                service, METHODID_TOTAL_SUPPLY)))
        .addMethod(
          getSupplyOfMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              cosmos.bank.v1beta1.QueryOuterClass.QuerySupplyOfRequest,
              cosmos.bank.v1beta1.QueryOuterClass.QuerySupplyOfResponse>(
                service, METHODID_SUPPLY_OF)))
        .addMethod(
          getParamsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              cosmos.bank.v1beta1.QueryOuterClass.QueryParamsRequest,
              cosmos.bank.v1beta1.QueryOuterClass.QueryParamsResponse>(
                service, METHODID_PARAMS)))
        .addMethod(
          getDenomMetadataMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              cosmos.bank.v1beta1.QueryOuterClass.QueryDenomMetadataRequest,
              cosmos.bank.v1beta1.QueryOuterClass.QueryDenomMetadataResponse>(
                service, METHODID_DENOM_METADATA)))
        .addMethod(
          getDenomsMetadataMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              cosmos.bank.v1beta1.QueryOuterClass.QueryDenomsMetadataRequest,
              cosmos.bank.v1beta1.QueryOuterClass.QueryDenomsMetadataResponse>(
                service, METHODID_DENOMS_METADATA)))
        .addMethod(
          getDenomOwnersMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              cosmos.bank.v1beta1.QueryOuterClass.QueryDenomOwnersRequest,
              cosmos.bank.v1beta1.QueryOuterClass.QueryDenomOwnersResponse>(
                service, METHODID_DENOM_OWNERS)))
        .addMethod(
          getSendEnabledMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              cosmos.bank.v1beta1.QueryOuterClass.QuerySendEnabledRequest,
              cosmos.bank.v1beta1.QueryOuterClass.QuerySendEnabledResponse>(
                service, METHODID_SEND_ENABLED)))
        .build();
  }

  private static abstract class QueryBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    QueryBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return cosmos.bank.v1beta1.QueryOuterClass.getDescriptor();
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
              .addMethod(getBalanceMethod())
              .addMethod(getAllBalancesMethod())
              .addMethod(getSpendableBalancesMethod())
              .addMethod(getSpendableBalanceByDenomMethod())
              .addMethod(getTotalSupplyMethod())
              .addMethod(getSupplyOfMethod())
              .addMethod(getParamsMethod())
              .addMethod(getDenomMetadataMethod())
              .addMethod(getDenomsMetadataMethod())
              .addMethod(getDenomOwnersMethod())
              .addMethod(getSendEnabledMethod())
              .build();
        }
      }
    }
    return result;
  }
}
