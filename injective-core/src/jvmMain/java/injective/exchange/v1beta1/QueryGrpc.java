package injective.exchange.v1beta1;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * Query defines the gRPC querier service.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.54.0)",
    comments = "Source: injective/exchange/v1beta1/query.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class QueryGrpc {

  private QueryGrpc() {}

  public static final String SERVICE_NAME = "injective.exchange.v1beta1.Query";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<injective.exchange.v1beta1.QueryOuterClass.QueryExchangeParamsRequest,
      injective.exchange.v1beta1.QueryOuterClass.QueryExchangeParamsResponse> getQueryExchangeParamsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "QueryExchangeParams",
      requestType = injective.exchange.v1beta1.QueryOuterClass.QueryExchangeParamsRequest.class,
      responseType = injective.exchange.v1beta1.QueryOuterClass.QueryExchangeParamsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<injective.exchange.v1beta1.QueryOuterClass.QueryExchangeParamsRequest,
      injective.exchange.v1beta1.QueryOuterClass.QueryExchangeParamsResponse> getQueryExchangeParamsMethod() {
    io.grpc.MethodDescriptor<injective.exchange.v1beta1.QueryOuterClass.QueryExchangeParamsRequest, injective.exchange.v1beta1.QueryOuterClass.QueryExchangeParamsResponse> getQueryExchangeParamsMethod;
    if ((getQueryExchangeParamsMethod = QueryGrpc.getQueryExchangeParamsMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getQueryExchangeParamsMethod = QueryGrpc.getQueryExchangeParamsMethod) == null) {
          QueryGrpc.getQueryExchangeParamsMethod = getQueryExchangeParamsMethod =
              io.grpc.MethodDescriptor.<injective.exchange.v1beta1.QueryOuterClass.QueryExchangeParamsRequest, injective.exchange.v1beta1.QueryOuterClass.QueryExchangeParamsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "QueryExchangeParams"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  injective.exchange.v1beta1.QueryOuterClass.QueryExchangeParamsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  injective.exchange.v1beta1.QueryOuterClass.QueryExchangeParamsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("QueryExchangeParams"))
              .build();
        }
      }
    }
    return getQueryExchangeParamsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<injective.exchange.v1beta1.QueryOuterClass.QuerySubaccountDepositsRequest,
      injective.exchange.v1beta1.QueryOuterClass.QuerySubaccountDepositsResponse> getSubaccountDepositsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SubaccountDeposits",
      requestType = injective.exchange.v1beta1.QueryOuterClass.QuerySubaccountDepositsRequest.class,
      responseType = injective.exchange.v1beta1.QueryOuterClass.QuerySubaccountDepositsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<injective.exchange.v1beta1.QueryOuterClass.QuerySubaccountDepositsRequest,
      injective.exchange.v1beta1.QueryOuterClass.QuerySubaccountDepositsResponse> getSubaccountDepositsMethod() {
    io.grpc.MethodDescriptor<injective.exchange.v1beta1.QueryOuterClass.QuerySubaccountDepositsRequest, injective.exchange.v1beta1.QueryOuterClass.QuerySubaccountDepositsResponse> getSubaccountDepositsMethod;
    if ((getSubaccountDepositsMethod = QueryGrpc.getSubaccountDepositsMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getSubaccountDepositsMethod = QueryGrpc.getSubaccountDepositsMethod) == null) {
          QueryGrpc.getSubaccountDepositsMethod = getSubaccountDepositsMethod =
              io.grpc.MethodDescriptor.<injective.exchange.v1beta1.QueryOuterClass.QuerySubaccountDepositsRequest, injective.exchange.v1beta1.QueryOuterClass.QuerySubaccountDepositsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SubaccountDeposits"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  injective.exchange.v1beta1.QueryOuterClass.QuerySubaccountDepositsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  injective.exchange.v1beta1.QueryOuterClass.QuerySubaccountDepositsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("SubaccountDeposits"))
              .build();
        }
      }
    }
    return getSubaccountDepositsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<injective.exchange.v1beta1.QueryOuterClass.QuerySubaccountDepositRequest,
      injective.exchange.v1beta1.QueryOuterClass.QuerySubaccountDepositResponse> getSubaccountDepositMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SubaccountDeposit",
      requestType = injective.exchange.v1beta1.QueryOuterClass.QuerySubaccountDepositRequest.class,
      responseType = injective.exchange.v1beta1.QueryOuterClass.QuerySubaccountDepositResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<injective.exchange.v1beta1.QueryOuterClass.QuerySubaccountDepositRequest,
      injective.exchange.v1beta1.QueryOuterClass.QuerySubaccountDepositResponse> getSubaccountDepositMethod() {
    io.grpc.MethodDescriptor<injective.exchange.v1beta1.QueryOuterClass.QuerySubaccountDepositRequest, injective.exchange.v1beta1.QueryOuterClass.QuerySubaccountDepositResponse> getSubaccountDepositMethod;
    if ((getSubaccountDepositMethod = QueryGrpc.getSubaccountDepositMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getSubaccountDepositMethod = QueryGrpc.getSubaccountDepositMethod) == null) {
          QueryGrpc.getSubaccountDepositMethod = getSubaccountDepositMethod =
              io.grpc.MethodDescriptor.<injective.exchange.v1beta1.QueryOuterClass.QuerySubaccountDepositRequest, injective.exchange.v1beta1.QueryOuterClass.QuerySubaccountDepositResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SubaccountDeposit"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  injective.exchange.v1beta1.QueryOuterClass.QuerySubaccountDepositRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  injective.exchange.v1beta1.QueryOuterClass.QuerySubaccountDepositResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("SubaccountDeposit"))
              .build();
        }
      }
    }
    return getSubaccountDepositMethod;
  }

  private static volatile io.grpc.MethodDescriptor<injective.exchange.v1beta1.QueryOuterClass.QueryExchangeBalancesRequest,
      injective.exchange.v1beta1.QueryOuterClass.QueryExchangeBalancesResponse> getExchangeBalancesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ExchangeBalances",
      requestType = injective.exchange.v1beta1.QueryOuterClass.QueryExchangeBalancesRequest.class,
      responseType = injective.exchange.v1beta1.QueryOuterClass.QueryExchangeBalancesResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<injective.exchange.v1beta1.QueryOuterClass.QueryExchangeBalancesRequest,
      injective.exchange.v1beta1.QueryOuterClass.QueryExchangeBalancesResponse> getExchangeBalancesMethod() {
    io.grpc.MethodDescriptor<injective.exchange.v1beta1.QueryOuterClass.QueryExchangeBalancesRequest, injective.exchange.v1beta1.QueryOuterClass.QueryExchangeBalancesResponse> getExchangeBalancesMethod;
    if ((getExchangeBalancesMethod = QueryGrpc.getExchangeBalancesMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getExchangeBalancesMethod = QueryGrpc.getExchangeBalancesMethod) == null) {
          QueryGrpc.getExchangeBalancesMethod = getExchangeBalancesMethod =
              io.grpc.MethodDescriptor.<injective.exchange.v1beta1.QueryOuterClass.QueryExchangeBalancesRequest, injective.exchange.v1beta1.QueryOuterClass.QueryExchangeBalancesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ExchangeBalances"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  injective.exchange.v1beta1.QueryOuterClass.QueryExchangeBalancesRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  injective.exchange.v1beta1.QueryOuterClass.QueryExchangeBalancesResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("ExchangeBalances"))
              .build();
        }
      }
    }
    return getExchangeBalancesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<injective.exchange.v1beta1.QueryOuterClass.QueryAggregateVolumeRequest,
      injective.exchange.v1beta1.QueryOuterClass.QueryAggregateVolumeResponse> getAggregateVolumeMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "AggregateVolume",
      requestType = injective.exchange.v1beta1.QueryOuterClass.QueryAggregateVolumeRequest.class,
      responseType = injective.exchange.v1beta1.QueryOuterClass.QueryAggregateVolumeResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<injective.exchange.v1beta1.QueryOuterClass.QueryAggregateVolumeRequest,
      injective.exchange.v1beta1.QueryOuterClass.QueryAggregateVolumeResponse> getAggregateVolumeMethod() {
    io.grpc.MethodDescriptor<injective.exchange.v1beta1.QueryOuterClass.QueryAggregateVolumeRequest, injective.exchange.v1beta1.QueryOuterClass.QueryAggregateVolumeResponse> getAggregateVolumeMethod;
    if ((getAggregateVolumeMethod = QueryGrpc.getAggregateVolumeMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getAggregateVolumeMethod = QueryGrpc.getAggregateVolumeMethod) == null) {
          QueryGrpc.getAggregateVolumeMethod = getAggregateVolumeMethod =
              io.grpc.MethodDescriptor.<injective.exchange.v1beta1.QueryOuterClass.QueryAggregateVolumeRequest, injective.exchange.v1beta1.QueryOuterClass.QueryAggregateVolumeResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "AggregateVolume"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  injective.exchange.v1beta1.QueryOuterClass.QueryAggregateVolumeRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  injective.exchange.v1beta1.QueryOuterClass.QueryAggregateVolumeResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("AggregateVolume"))
              .build();
        }
      }
    }
    return getAggregateVolumeMethod;
  }

  private static volatile io.grpc.MethodDescriptor<injective.exchange.v1beta1.QueryOuterClass.QueryAggregateVolumesRequest,
      injective.exchange.v1beta1.QueryOuterClass.QueryAggregateVolumesResponse> getAggregateVolumesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "AggregateVolumes",
      requestType = injective.exchange.v1beta1.QueryOuterClass.QueryAggregateVolumesRequest.class,
      responseType = injective.exchange.v1beta1.QueryOuterClass.QueryAggregateVolumesResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<injective.exchange.v1beta1.QueryOuterClass.QueryAggregateVolumesRequest,
      injective.exchange.v1beta1.QueryOuterClass.QueryAggregateVolumesResponse> getAggregateVolumesMethod() {
    io.grpc.MethodDescriptor<injective.exchange.v1beta1.QueryOuterClass.QueryAggregateVolumesRequest, injective.exchange.v1beta1.QueryOuterClass.QueryAggregateVolumesResponse> getAggregateVolumesMethod;
    if ((getAggregateVolumesMethod = QueryGrpc.getAggregateVolumesMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getAggregateVolumesMethod = QueryGrpc.getAggregateVolumesMethod) == null) {
          QueryGrpc.getAggregateVolumesMethod = getAggregateVolumesMethod =
              io.grpc.MethodDescriptor.<injective.exchange.v1beta1.QueryOuterClass.QueryAggregateVolumesRequest, injective.exchange.v1beta1.QueryOuterClass.QueryAggregateVolumesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "AggregateVolumes"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  injective.exchange.v1beta1.QueryOuterClass.QueryAggregateVolumesRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  injective.exchange.v1beta1.QueryOuterClass.QueryAggregateVolumesResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("AggregateVolumes"))
              .build();
        }
      }
    }
    return getAggregateVolumesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<injective.exchange.v1beta1.QueryOuterClass.QueryAggregateMarketVolumeRequest,
      injective.exchange.v1beta1.QueryOuterClass.QueryAggregateMarketVolumeResponse> getAggregateMarketVolumeMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "AggregateMarketVolume",
      requestType = injective.exchange.v1beta1.QueryOuterClass.QueryAggregateMarketVolumeRequest.class,
      responseType = injective.exchange.v1beta1.QueryOuterClass.QueryAggregateMarketVolumeResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<injective.exchange.v1beta1.QueryOuterClass.QueryAggregateMarketVolumeRequest,
      injective.exchange.v1beta1.QueryOuterClass.QueryAggregateMarketVolumeResponse> getAggregateMarketVolumeMethod() {
    io.grpc.MethodDescriptor<injective.exchange.v1beta1.QueryOuterClass.QueryAggregateMarketVolumeRequest, injective.exchange.v1beta1.QueryOuterClass.QueryAggregateMarketVolumeResponse> getAggregateMarketVolumeMethod;
    if ((getAggregateMarketVolumeMethod = QueryGrpc.getAggregateMarketVolumeMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getAggregateMarketVolumeMethod = QueryGrpc.getAggregateMarketVolumeMethod) == null) {
          QueryGrpc.getAggregateMarketVolumeMethod = getAggregateMarketVolumeMethod =
              io.grpc.MethodDescriptor.<injective.exchange.v1beta1.QueryOuterClass.QueryAggregateMarketVolumeRequest, injective.exchange.v1beta1.QueryOuterClass.QueryAggregateMarketVolumeResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "AggregateMarketVolume"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  injective.exchange.v1beta1.QueryOuterClass.QueryAggregateMarketVolumeRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  injective.exchange.v1beta1.QueryOuterClass.QueryAggregateMarketVolumeResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("AggregateMarketVolume"))
              .build();
        }
      }
    }
    return getAggregateMarketVolumeMethod;
  }

  private static volatile io.grpc.MethodDescriptor<injective.exchange.v1beta1.QueryOuterClass.QueryAggregateMarketVolumesRequest,
      injective.exchange.v1beta1.QueryOuterClass.QueryAggregateMarketVolumesResponse> getAggregateMarketVolumesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "AggregateMarketVolumes",
      requestType = injective.exchange.v1beta1.QueryOuterClass.QueryAggregateMarketVolumesRequest.class,
      responseType = injective.exchange.v1beta1.QueryOuterClass.QueryAggregateMarketVolumesResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<injective.exchange.v1beta1.QueryOuterClass.QueryAggregateMarketVolumesRequest,
      injective.exchange.v1beta1.QueryOuterClass.QueryAggregateMarketVolumesResponse> getAggregateMarketVolumesMethod() {
    io.grpc.MethodDescriptor<injective.exchange.v1beta1.QueryOuterClass.QueryAggregateMarketVolumesRequest, injective.exchange.v1beta1.QueryOuterClass.QueryAggregateMarketVolumesResponse> getAggregateMarketVolumesMethod;
    if ((getAggregateMarketVolumesMethod = QueryGrpc.getAggregateMarketVolumesMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getAggregateMarketVolumesMethod = QueryGrpc.getAggregateMarketVolumesMethod) == null) {
          QueryGrpc.getAggregateMarketVolumesMethod = getAggregateMarketVolumesMethod =
              io.grpc.MethodDescriptor.<injective.exchange.v1beta1.QueryOuterClass.QueryAggregateMarketVolumesRequest, injective.exchange.v1beta1.QueryOuterClass.QueryAggregateMarketVolumesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "AggregateMarketVolumes"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  injective.exchange.v1beta1.QueryOuterClass.QueryAggregateMarketVolumesRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  injective.exchange.v1beta1.QueryOuterClass.QueryAggregateMarketVolumesResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("AggregateMarketVolumes"))
              .build();
        }
      }
    }
    return getAggregateMarketVolumesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<injective.exchange.v1beta1.QueryOuterClass.QueryDenomDecimalRequest,
      injective.exchange.v1beta1.QueryOuterClass.QueryDenomDecimalResponse> getDenomDecimalMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DenomDecimal",
      requestType = injective.exchange.v1beta1.QueryOuterClass.QueryDenomDecimalRequest.class,
      responseType = injective.exchange.v1beta1.QueryOuterClass.QueryDenomDecimalResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<injective.exchange.v1beta1.QueryOuterClass.QueryDenomDecimalRequest,
      injective.exchange.v1beta1.QueryOuterClass.QueryDenomDecimalResponse> getDenomDecimalMethod() {
    io.grpc.MethodDescriptor<injective.exchange.v1beta1.QueryOuterClass.QueryDenomDecimalRequest, injective.exchange.v1beta1.QueryOuterClass.QueryDenomDecimalResponse> getDenomDecimalMethod;
    if ((getDenomDecimalMethod = QueryGrpc.getDenomDecimalMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getDenomDecimalMethod = QueryGrpc.getDenomDecimalMethod) == null) {
          QueryGrpc.getDenomDecimalMethod = getDenomDecimalMethod =
              io.grpc.MethodDescriptor.<injective.exchange.v1beta1.QueryOuterClass.QueryDenomDecimalRequest, injective.exchange.v1beta1.QueryOuterClass.QueryDenomDecimalResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DenomDecimal"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  injective.exchange.v1beta1.QueryOuterClass.QueryDenomDecimalRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  injective.exchange.v1beta1.QueryOuterClass.QueryDenomDecimalResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("DenomDecimal"))
              .build();
        }
      }
    }
    return getDenomDecimalMethod;
  }

  private static volatile io.grpc.MethodDescriptor<injective.exchange.v1beta1.QueryOuterClass.QueryDenomDecimalsRequest,
      injective.exchange.v1beta1.QueryOuterClass.QueryDenomDecimalsResponse> getDenomDecimalsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DenomDecimals",
      requestType = injective.exchange.v1beta1.QueryOuterClass.QueryDenomDecimalsRequest.class,
      responseType = injective.exchange.v1beta1.QueryOuterClass.QueryDenomDecimalsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<injective.exchange.v1beta1.QueryOuterClass.QueryDenomDecimalsRequest,
      injective.exchange.v1beta1.QueryOuterClass.QueryDenomDecimalsResponse> getDenomDecimalsMethod() {
    io.grpc.MethodDescriptor<injective.exchange.v1beta1.QueryOuterClass.QueryDenomDecimalsRequest, injective.exchange.v1beta1.QueryOuterClass.QueryDenomDecimalsResponse> getDenomDecimalsMethod;
    if ((getDenomDecimalsMethod = QueryGrpc.getDenomDecimalsMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getDenomDecimalsMethod = QueryGrpc.getDenomDecimalsMethod) == null) {
          QueryGrpc.getDenomDecimalsMethod = getDenomDecimalsMethod =
              io.grpc.MethodDescriptor.<injective.exchange.v1beta1.QueryOuterClass.QueryDenomDecimalsRequest, injective.exchange.v1beta1.QueryOuterClass.QueryDenomDecimalsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DenomDecimals"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  injective.exchange.v1beta1.QueryOuterClass.QueryDenomDecimalsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  injective.exchange.v1beta1.QueryOuterClass.QueryDenomDecimalsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("DenomDecimals"))
              .build();
        }
      }
    }
    return getDenomDecimalsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<injective.exchange.v1beta1.QueryOuterClass.QuerySpotMarketsRequest,
      injective.exchange.v1beta1.QueryOuterClass.QuerySpotMarketsResponse> getSpotMarketsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SpotMarkets",
      requestType = injective.exchange.v1beta1.QueryOuterClass.QuerySpotMarketsRequest.class,
      responseType = injective.exchange.v1beta1.QueryOuterClass.QuerySpotMarketsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<injective.exchange.v1beta1.QueryOuterClass.QuerySpotMarketsRequest,
      injective.exchange.v1beta1.QueryOuterClass.QuerySpotMarketsResponse> getSpotMarketsMethod() {
    io.grpc.MethodDescriptor<injective.exchange.v1beta1.QueryOuterClass.QuerySpotMarketsRequest, injective.exchange.v1beta1.QueryOuterClass.QuerySpotMarketsResponse> getSpotMarketsMethod;
    if ((getSpotMarketsMethod = QueryGrpc.getSpotMarketsMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getSpotMarketsMethod = QueryGrpc.getSpotMarketsMethod) == null) {
          QueryGrpc.getSpotMarketsMethod = getSpotMarketsMethod =
              io.grpc.MethodDescriptor.<injective.exchange.v1beta1.QueryOuterClass.QuerySpotMarketsRequest, injective.exchange.v1beta1.QueryOuterClass.QuerySpotMarketsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SpotMarkets"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  injective.exchange.v1beta1.QueryOuterClass.QuerySpotMarketsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  injective.exchange.v1beta1.QueryOuterClass.QuerySpotMarketsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("SpotMarkets"))
              .build();
        }
      }
    }
    return getSpotMarketsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<injective.exchange.v1beta1.QueryOuterClass.QuerySpotMarketRequest,
      injective.exchange.v1beta1.QueryOuterClass.QuerySpotMarketResponse> getSpotMarketMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SpotMarket",
      requestType = injective.exchange.v1beta1.QueryOuterClass.QuerySpotMarketRequest.class,
      responseType = injective.exchange.v1beta1.QueryOuterClass.QuerySpotMarketResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<injective.exchange.v1beta1.QueryOuterClass.QuerySpotMarketRequest,
      injective.exchange.v1beta1.QueryOuterClass.QuerySpotMarketResponse> getSpotMarketMethod() {
    io.grpc.MethodDescriptor<injective.exchange.v1beta1.QueryOuterClass.QuerySpotMarketRequest, injective.exchange.v1beta1.QueryOuterClass.QuerySpotMarketResponse> getSpotMarketMethod;
    if ((getSpotMarketMethod = QueryGrpc.getSpotMarketMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getSpotMarketMethod = QueryGrpc.getSpotMarketMethod) == null) {
          QueryGrpc.getSpotMarketMethod = getSpotMarketMethod =
              io.grpc.MethodDescriptor.<injective.exchange.v1beta1.QueryOuterClass.QuerySpotMarketRequest, injective.exchange.v1beta1.QueryOuterClass.QuerySpotMarketResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SpotMarket"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  injective.exchange.v1beta1.QueryOuterClass.QuerySpotMarketRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  injective.exchange.v1beta1.QueryOuterClass.QuerySpotMarketResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("SpotMarket"))
              .build();
        }
      }
    }
    return getSpotMarketMethod;
  }

  private static volatile io.grpc.MethodDescriptor<injective.exchange.v1beta1.QueryOuterClass.QueryFullSpotMarketsRequest,
      injective.exchange.v1beta1.QueryOuterClass.QueryFullSpotMarketsResponse> getFullSpotMarketsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "FullSpotMarkets",
      requestType = injective.exchange.v1beta1.QueryOuterClass.QueryFullSpotMarketsRequest.class,
      responseType = injective.exchange.v1beta1.QueryOuterClass.QueryFullSpotMarketsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<injective.exchange.v1beta1.QueryOuterClass.QueryFullSpotMarketsRequest,
      injective.exchange.v1beta1.QueryOuterClass.QueryFullSpotMarketsResponse> getFullSpotMarketsMethod() {
    io.grpc.MethodDescriptor<injective.exchange.v1beta1.QueryOuterClass.QueryFullSpotMarketsRequest, injective.exchange.v1beta1.QueryOuterClass.QueryFullSpotMarketsResponse> getFullSpotMarketsMethod;
    if ((getFullSpotMarketsMethod = QueryGrpc.getFullSpotMarketsMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getFullSpotMarketsMethod = QueryGrpc.getFullSpotMarketsMethod) == null) {
          QueryGrpc.getFullSpotMarketsMethod = getFullSpotMarketsMethod =
              io.grpc.MethodDescriptor.<injective.exchange.v1beta1.QueryOuterClass.QueryFullSpotMarketsRequest, injective.exchange.v1beta1.QueryOuterClass.QueryFullSpotMarketsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "FullSpotMarkets"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  injective.exchange.v1beta1.QueryOuterClass.QueryFullSpotMarketsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  injective.exchange.v1beta1.QueryOuterClass.QueryFullSpotMarketsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("FullSpotMarkets"))
              .build();
        }
      }
    }
    return getFullSpotMarketsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<injective.exchange.v1beta1.QueryOuterClass.QueryFullSpotMarketRequest,
      injective.exchange.v1beta1.QueryOuterClass.QueryFullSpotMarketResponse> getFullSpotMarketMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "FullSpotMarket",
      requestType = injective.exchange.v1beta1.QueryOuterClass.QueryFullSpotMarketRequest.class,
      responseType = injective.exchange.v1beta1.QueryOuterClass.QueryFullSpotMarketResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<injective.exchange.v1beta1.QueryOuterClass.QueryFullSpotMarketRequest,
      injective.exchange.v1beta1.QueryOuterClass.QueryFullSpotMarketResponse> getFullSpotMarketMethod() {
    io.grpc.MethodDescriptor<injective.exchange.v1beta1.QueryOuterClass.QueryFullSpotMarketRequest, injective.exchange.v1beta1.QueryOuterClass.QueryFullSpotMarketResponse> getFullSpotMarketMethod;
    if ((getFullSpotMarketMethod = QueryGrpc.getFullSpotMarketMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getFullSpotMarketMethod = QueryGrpc.getFullSpotMarketMethod) == null) {
          QueryGrpc.getFullSpotMarketMethod = getFullSpotMarketMethod =
              io.grpc.MethodDescriptor.<injective.exchange.v1beta1.QueryOuterClass.QueryFullSpotMarketRequest, injective.exchange.v1beta1.QueryOuterClass.QueryFullSpotMarketResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "FullSpotMarket"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  injective.exchange.v1beta1.QueryOuterClass.QueryFullSpotMarketRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  injective.exchange.v1beta1.QueryOuterClass.QueryFullSpotMarketResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("FullSpotMarket"))
              .build();
        }
      }
    }
    return getFullSpotMarketMethod;
  }

  private static volatile io.grpc.MethodDescriptor<injective.exchange.v1beta1.QueryOuterClass.QuerySpotOrderbookRequest,
      injective.exchange.v1beta1.QueryOuterClass.QuerySpotOrderbookResponse> getSpotOrderbookMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SpotOrderbook",
      requestType = injective.exchange.v1beta1.QueryOuterClass.QuerySpotOrderbookRequest.class,
      responseType = injective.exchange.v1beta1.QueryOuterClass.QuerySpotOrderbookResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<injective.exchange.v1beta1.QueryOuterClass.QuerySpotOrderbookRequest,
      injective.exchange.v1beta1.QueryOuterClass.QuerySpotOrderbookResponse> getSpotOrderbookMethod() {
    io.grpc.MethodDescriptor<injective.exchange.v1beta1.QueryOuterClass.QuerySpotOrderbookRequest, injective.exchange.v1beta1.QueryOuterClass.QuerySpotOrderbookResponse> getSpotOrderbookMethod;
    if ((getSpotOrderbookMethod = QueryGrpc.getSpotOrderbookMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getSpotOrderbookMethod = QueryGrpc.getSpotOrderbookMethod) == null) {
          QueryGrpc.getSpotOrderbookMethod = getSpotOrderbookMethod =
              io.grpc.MethodDescriptor.<injective.exchange.v1beta1.QueryOuterClass.QuerySpotOrderbookRequest, injective.exchange.v1beta1.QueryOuterClass.QuerySpotOrderbookResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SpotOrderbook"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  injective.exchange.v1beta1.QueryOuterClass.QuerySpotOrderbookRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  injective.exchange.v1beta1.QueryOuterClass.QuerySpotOrderbookResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("SpotOrderbook"))
              .build();
        }
      }
    }
    return getSpotOrderbookMethod;
  }

  private static volatile io.grpc.MethodDescriptor<injective.exchange.v1beta1.QueryOuterClass.QueryTraderSpotOrdersRequest,
      injective.exchange.v1beta1.QueryOuterClass.QueryTraderSpotOrdersResponse> getTraderSpotOrdersMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "TraderSpotOrders",
      requestType = injective.exchange.v1beta1.QueryOuterClass.QueryTraderSpotOrdersRequest.class,
      responseType = injective.exchange.v1beta1.QueryOuterClass.QueryTraderSpotOrdersResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<injective.exchange.v1beta1.QueryOuterClass.QueryTraderSpotOrdersRequest,
      injective.exchange.v1beta1.QueryOuterClass.QueryTraderSpotOrdersResponse> getTraderSpotOrdersMethod() {
    io.grpc.MethodDescriptor<injective.exchange.v1beta1.QueryOuterClass.QueryTraderSpotOrdersRequest, injective.exchange.v1beta1.QueryOuterClass.QueryTraderSpotOrdersResponse> getTraderSpotOrdersMethod;
    if ((getTraderSpotOrdersMethod = QueryGrpc.getTraderSpotOrdersMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getTraderSpotOrdersMethod = QueryGrpc.getTraderSpotOrdersMethod) == null) {
          QueryGrpc.getTraderSpotOrdersMethod = getTraderSpotOrdersMethod =
              io.grpc.MethodDescriptor.<injective.exchange.v1beta1.QueryOuterClass.QueryTraderSpotOrdersRequest, injective.exchange.v1beta1.QueryOuterClass.QueryTraderSpotOrdersResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "TraderSpotOrders"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  injective.exchange.v1beta1.QueryOuterClass.QueryTraderSpotOrdersRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  injective.exchange.v1beta1.QueryOuterClass.QueryTraderSpotOrdersResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("TraderSpotOrders"))
              .build();
        }
      }
    }
    return getTraderSpotOrdersMethod;
  }

  private static volatile io.grpc.MethodDescriptor<injective.exchange.v1beta1.QueryOuterClass.QueryAccountAddressSpotOrdersRequest,
      injective.exchange.v1beta1.QueryOuterClass.QueryAccountAddressSpotOrdersResponse> getAccountAddressSpotOrdersMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "AccountAddressSpotOrders",
      requestType = injective.exchange.v1beta1.QueryOuterClass.QueryAccountAddressSpotOrdersRequest.class,
      responseType = injective.exchange.v1beta1.QueryOuterClass.QueryAccountAddressSpotOrdersResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<injective.exchange.v1beta1.QueryOuterClass.QueryAccountAddressSpotOrdersRequest,
      injective.exchange.v1beta1.QueryOuterClass.QueryAccountAddressSpotOrdersResponse> getAccountAddressSpotOrdersMethod() {
    io.grpc.MethodDescriptor<injective.exchange.v1beta1.QueryOuterClass.QueryAccountAddressSpotOrdersRequest, injective.exchange.v1beta1.QueryOuterClass.QueryAccountAddressSpotOrdersResponse> getAccountAddressSpotOrdersMethod;
    if ((getAccountAddressSpotOrdersMethod = QueryGrpc.getAccountAddressSpotOrdersMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getAccountAddressSpotOrdersMethod = QueryGrpc.getAccountAddressSpotOrdersMethod) == null) {
          QueryGrpc.getAccountAddressSpotOrdersMethod = getAccountAddressSpotOrdersMethod =
              io.grpc.MethodDescriptor.<injective.exchange.v1beta1.QueryOuterClass.QueryAccountAddressSpotOrdersRequest, injective.exchange.v1beta1.QueryOuterClass.QueryAccountAddressSpotOrdersResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "AccountAddressSpotOrders"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  injective.exchange.v1beta1.QueryOuterClass.QueryAccountAddressSpotOrdersRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  injective.exchange.v1beta1.QueryOuterClass.QueryAccountAddressSpotOrdersResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("AccountAddressSpotOrders"))
              .build();
        }
      }
    }
    return getAccountAddressSpotOrdersMethod;
  }

  private static volatile io.grpc.MethodDescriptor<injective.exchange.v1beta1.QueryOuterClass.QuerySpotOrdersByHashesRequest,
      injective.exchange.v1beta1.QueryOuterClass.QuerySpotOrdersByHashesResponse> getSpotOrdersByHashesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SpotOrdersByHashes",
      requestType = injective.exchange.v1beta1.QueryOuterClass.QuerySpotOrdersByHashesRequest.class,
      responseType = injective.exchange.v1beta1.QueryOuterClass.QuerySpotOrdersByHashesResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<injective.exchange.v1beta1.QueryOuterClass.QuerySpotOrdersByHashesRequest,
      injective.exchange.v1beta1.QueryOuterClass.QuerySpotOrdersByHashesResponse> getSpotOrdersByHashesMethod() {
    io.grpc.MethodDescriptor<injective.exchange.v1beta1.QueryOuterClass.QuerySpotOrdersByHashesRequest, injective.exchange.v1beta1.QueryOuterClass.QuerySpotOrdersByHashesResponse> getSpotOrdersByHashesMethod;
    if ((getSpotOrdersByHashesMethod = QueryGrpc.getSpotOrdersByHashesMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getSpotOrdersByHashesMethod = QueryGrpc.getSpotOrdersByHashesMethod) == null) {
          QueryGrpc.getSpotOrdersByHashesMethod = getSpotOrdersByHashesMethod =
              io.grpc.MethodDescriptor.<injective.exchange.v1beta1.QueryOuterClass.QuerySpotOrdersByHashesRequest, injective.exchange.v1beta1.QueryOuterClass.QuerySpotOrdersByHashesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SpotOrdersByHashes"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  injective.exchange.v1beta1.QueryOuterClass.QuerySpotOrdersByHashesRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  injective.exchange.v1beta1.QueryOuterClass.QuerySpotOrdersByHashesResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("SpotOrdersByHashes"))
              .build();
        }
      }
    }
    return getSpotOrdersByHashesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<injective.exchange.v1beta1.QueryOuterClass.QuerySubaccountOrdersRequest,
      injective.exchange.v1beta1.QueryOuterClass.QuerySubaccountOrdersResponse> getSubaccountOrdersMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SubaccountOrders",
      requestType = injective.exchange.v1beta1.QueryOuterClass.QuerySubaccountOrdersRequest.class,
      responseType = injective.exchange.v1beta1.QueryOuterClass.QuerySubaccountOrdersResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<injective.exchange.v1beta1.QueryOuterClass.QuerySubaccountOrdersRequest,
      injective.exchange.v1beta1.QueryOuterClass.QuerySubaccountOrdersResponse> getSubaccountOrdersMethod() {
    io.grpc.MethodDescriptor<injective.exchange.v1beta1.QueryOuterClass.QuerySubaccountOrdersRequest, injective.exchange.v1beta1.QueryOuterClass.QuerySubaccountOrdersResponse> getSubaccountOrdersMethod;
    if ((getSubaccountOrdersMethod = QueryGrpc.getSubaccountOrdersMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getSubaccountOrdersMethod = QueryGrpc.getSubaccountOrdersMethod) == null) {
          QueryGrpc.getSubaccountOrdersMethod = getSubaccountOrdersMethod =
              io.grpc.MethodDescriptor.<injective.exchange.v1beta1.QueryOuterClass.QuerySubaccountOrdersRequest, injective.exchange.v1beta1.QueryOuterClass.QuerySubaccountOrdersResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SubaccountOrders"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  injective.exchange.v1beta1.QueryOuterClass.QuerySubaccountOrdersRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  injective.exchange.v1beta1.QueryOuterClass.QuerySubaccountOrdersResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("SubaccountOrders"))
              .build();
        }
      }
    }
    return getSubaccountOrdersMethod;
  }

  private static volatile io.grpc.MethodDescriptor<injective.exchange.v1beta1.QueryOuterClass.QueryTraderSpotOrdersRequest,
      injective.exchange.v1beta1.QueryOuterClass.QueryTraderSpotOrdersResponse> getTraderSpotTransientOrdersMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "TraderSpotTransientOrders",
      requestType = injective.exchange.v1beta1.QueryOuterClass.QueryTraderSpotOrdersRequest.class,
      responseType = injective.exchange.v1beta1.QueryOuterClass.QueryTraderSpotOrdersResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<injective.exchange.v1beta1.QueryOuterClass.QueryTraderSpotOrdersRequest,
      injective.exchange.v1beta1.QueryOuterClass.QueryTraderSpotOrdersResponse> getTraderSpotTransientOrdersMethod() {
    io.grpc.MethodDescriptor<injective.exchange.v1beta1.QueryOuterClass.QueryTraderSpotOrdersRequest, injective.exchange.v1beta1.QueryOuterClass.QueryTraderSpotOrdersResponse> getTraderSpotTransientOrdersMethod;
    if ((getTraderSpotTransientOrdersMethod = QueryGrpc.getTraderSpotTransientOrdersMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getTraderSpotTransientOrdersMethod = QueryGrpc.getTraderSpotTransientOrdersMethod) == null) {
          QueryGrpc.getTraderSpotTransientOrdersMethod = getTraderSpotTransientOrdersMethod =
              io.grpc.MethodDescriptor.<injective.exchange.v1beta1.QueryOuterClass.QueryTraderSpotOrdersRequest, injective.exchange.v1beta1.QueryOuterClass.QueryTraderSpotOrdersResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "TraderSpotTransientOrders"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  injective.exchange.v1beta1.QueryOuterClass.QueryTraderSpotOrdersRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  injective.exchange.v1beta1.QueryOuterClass.QueryTraderSpotOrdersResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("TraderSpotTransientOrders"))
              .build();
        }
      }
    }
    return getTraderSpotTransientOrdersMethod;
  }

  private static volatile io.grpc.MethodDescriptor<injective.exchange.v1beta1.QueryOuterClass.QuerySpotMidPriceAndTOBRequest,
      injective.exchange.v1beta1.QueryOuterClass.QuerySpotMidPriceAndTOBResponse> getSpotMidPriceAndTOBMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SpotMidPriceAndTOB",
      requestType = injective.exchange.v1beta1.QueryOuterClass.QuerySpotMidPriceAndTOBRequest.class,
      responseType = injective.exchange.v1beta1.QueryOuterClass.QuerySpotMidPriceAndTOBResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<injective.exchange.v1beta1.QueryOuterClass.QuerySpotMidPriceAndTOBRequest,
      injective.exchange.v1beta1.QueryOuterClass.QuerySpotMidPriceAndTOBResponse> getSpotMidPriceAndTOBMethod() {
    io.grpc.MethodDescriptor<injective.exchange.v1beta1.QueryOuterClass.QuerySpotMidPriceAndTOBRequest, injective.exchange.v1beta1.QueryOuterClass.QuerySpotMidPriceAndTOBResponse> getSpotMidPriceAndTOBMethod;
    if ((getSpotMidPriceAndTOBMethod = QueryGrpc.getSpotMidPriceAndTOBMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getSpotMidPriceAndTOBMethod = QueryGrpc.getSpotMidPriceAndTOBMethod) == null) {
          QueryGrpc.getSpotMidPriceAndTOBMethod = getSpotMidPriceAndTOBMethod =
              io.grpc.MethodDescriptor.<injective.exchange.v1beta1.QueryOuterClass.QuerySpotMidPriceAndTOBRequest, injective.exchange.v1beta1.QueryOuterClass.QuerySpotMidPriceAndTOBResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SpotMidPriceAndTOB"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  injective.exchange.v1beta1.QueryOuterClass.QuerySpotMidPriceAndTOBRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  injective.exchange.v1beta1.QueryOuterClass.QuerySpotMidPriceAndTOBResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("SpotMidPriceAndTOB"))
              .build();
        }
      }
    }
    return getSpotMidPriceAndTOBMethod;
  }

  private static volatile io.grpc.MethodDescriptor<injective.exchange.v1beta1.QueryOuterClass.QueryDerivativeMidPriceAndTOBRequest,
      injective.exchange.v1beta1.QueryOuterClass.QueryDerivativeMidPriceAndTOBResponse> getDerivativeMidPriceAndTOBMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DerivativeMidPriceAndTOB",
      requestType = injective.exchange.v1beta1.QueryOuterClass.QueryDerivativeMidPriceAndTOBRequest.class,
      responseType = injective.exchange.v1beta1.QueryOuterClass.QueryDerivativeMidPriceAndTOBResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<injective.exchange.v1beta1.QueryOuterClass.QueryDerivativeMidPriceAndTOBRequest,
      injective.exchange.v1beta1.QueryOuterClass.QueryDerivativeMidPriceAndTOBResponse> getDerivativeMidPriceAndTOBMethod() {
    io.grpc.MethodDescriptor<injective.exchange.v1beta1.QueryOuterClass.QueryDerivativeMidPriceAndTOBRequest, injective.exchange.v1beta1.QueryOuterClass.QueryDerivativeMidPriceAndTOBResponse> getDerivativeMidPriceAndTOBMethod;
    if ((getDerivativeMidPriceAndTOBMethod = QueryGrpc.getDerivativeMidPriceAndTOBMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getDerivativeMidPriceAndTOBMethod = QueryGrpc.getDerivativeMidPriceAndTOBMethod) == null) {
          QueryGrpc.getDerivativeMidPriceAndTOBMethod = getDerivativeMidPriceAndTOBMethod =
              io.grpc.MethodDescriptor.<injective.exchange.v1beta1.QueryOuterClass.QueryDerivativeMidPriceAndTOBRequest, injective.exchange.v1beta1.QueryOuterClass.QueryDerivativeMidPriceAndTOBResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DerivativeMidPriceAndTOB"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  injective.exchange.v1beta1.QueryOuterClass.QueryDerivativeMidPriceAndTOBRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  injective.exchange.v1beta1.QueryOuterClass.QueryDerivativeMidPriceAndTOBResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("DerivativeMidPriceAndTOB"))
              .build();
        }
      }
    }
    return getDerivativeMidPriceAndTOBMethod;
  }

  private static volatile io.grpc.MethodDescriptor<injective.exchange.v1beta1.QueryOuterClass.QueryDerivativeOrderbookRequest,
      injective.exchange.v1beta1.QueryOuterClass.QueryDerivativeOrderbookResponse> getDerivativeOrderbookMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DerivativeOrderbook",
      requestType = injective.exchange.v1beta1.QueryOuterClass.QueryDerivativeOrderbookRequest.class,
      responseType = injective.exchange.v1beta1.QueryOuterClass.QueryDerivativeOrderbookResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<injective.exchange.v1beta1.QueryOuterClass.QueryDerivativeOrderbookRequest,
      injective.exchange.v1beta1.QueryOuterClass.QueryDerivativeOrderbookResponse> getDerivativeOrderbookMethod() {
    io.grpc.MethodDescriptor<injective.exchange.v1beta1.QueryOuterClass.QueryDerivativeOrderbookRequest, injective.exchange.v1beta1.QueryOuterClass.QueryDerivativeOrderbookResponse> getDerivativeOrderbookMethod;
    if ((getDerivativeOrderbookMethod = QueryGrpc.getDerivativeOrderbookMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getDerivativeOrderbookMethod = QueryGrpc.getDerivativeOrderbookMethod) == null) {
          QueryGrpc.getDerivativeOrderbookMethod = getDerivativeOrderbookMethod =
              io.grpc.MethodDescriptor.<injective.exchange.v1beta1.QueryOuterClass.QueryDerivativeOrderbookRequest, injective.exchange.v1beta1.QueryOuterClass.QueryDerivativeOrderbookResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DerivativeOrderbook"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  injective.exchange.v1beta1.QueryOuterClass.QueryDerivativeOrderbookRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  injective.exchange.v1beta1.QueryOuterClass.QueryDerivativeOrderbookResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("DerivativeOrderbook"))
              .build();
        }
      }
    }
    return getDerivativeOrderbookMethod;
  }

  private static volatile io.grpc.MethodDescriptor<injective.exchange.v1beta1.QueryOuterClass.QueryTraderDerivativeOrdersRequest,
      injective.exchange.v1beta1.QueryOuterClass.QueryTraderDerivativeOrdersResponse> getTraderDerivativeOrdersMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "TraderDerivativeOrders",
      requestType = injective.exchange.v1beta1.QueryOuterClass.QueryTraderDerivativeOrdersRequest.class,
      responseType = injective.exchange.v1beta1.QueryOuterClass.QueryTraderDerivativeOrdersResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<injective.exchange.v1beta1.QueryOuterClass.QueryTraderDerivativeOrdersRequest,
      injective.exchange.v1beta1.QueryOuterClass.QueryTraderDerivativeOrdersResponse> getTraderDerivativeOrdersMethod() {
    io.grpc.MethodDescriptor<injective.exchange.v1beta1.QueryOuterClass.QueryTraderDerivativeOrdersRequest, injective.exchange.v1beta1.QueryOuterClass.QueryTraderDerivativeOrdersResponse> getTraderDerivativeOrdersMethod;
    if ((getTraderDerivativeOrdersMethod = QueryGrpc.getTraderDerivativeOrdersMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getTraderDerivativeOrdersMethod = QueryGrpc.getTraderDerivativeOrdersMethod) == null) {
          QueryGrpc.getTraderDerivativeOrdersMethod = getTraderDerivativeOrdersMethod =
              io.grpc.MethodDescriptor.<injective.exchange.v1beta1.QueryOuterClass.QueryTraderDerivativeOrdersRequest, injective.exchange.v1beta1.QueryOuterClass.QueryTraderDerivativeOrdersResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "TraderDerivativeOrders"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  injective.exchange.v1beta1.QueryOuterClass.QueryTraderDerivativeOrdersRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  injective.exchange.v1beta1.QueryOuterClass.QueryTraderDerivativeOrdersResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("TraderDerivativeOrders"))
              .build();
        }
      }
    }
    return getTraderDerivativeOrdersMethod;
  }

  private static volatile io.grpc.MethodDescriptor<injective.exchange.v1beta1.QueryOuterClass.QueryAccountAddressDerivativeOrdersRequest,
      injective.exchange.v1beta1.QueryOuterClass.QueryAccountAddressDerivativeOrdersResponse> getAccountAddressDerivativeOrdersMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "AccountAddressDerivativeOrders",
      requestType = injective.exchange.v1beta1.QueryOuterClass.QueryAccountAddressDerivativeOrdersRequest.class,
      responseType = injective.exchange.v1beta1.QueryOuterClass.QueryAccountAddressDerivativeOrdersResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<injective.exchange.v1beta1.QueryOuterClass.QueryAccountAddressDerivativeOrdersRequest,
      injective.exchange.v1beta1.QueryOuterClass.QueryAccountAddressDerivativeOrdersResponse> getAccountAddressDerivativeOrdersMethod() {
    io.grpc.MethodDescriptor<injective.exchange.v1beta1.QueryOuterClass.QueryAccountAddressDerivativeOrdersRequest, injective.exchange.v1beta1.QueryOuterClass.QueryAccountAddressDerivativeOrdersResponse> getAccountAddressDerivativeOrdersMethod;
    if ((getAccountAddressDerivativeOrdersMethod = QueryGrpc.getAccountAddressDerivativeOrdersMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getAccountAddressDerivativeOrdersMethod = QueryGrpc.getAccountAddressDerivativeOrdersMethod) == null) {
          QueryGrpc.getAccountAddressDerivativeOrdersMethod = getAccountAddressDerivativeOrdersMethod =
              io.grpc.MethodDescriptor.<injective.exchange.v1beta1.QueryOuterClass.QueryAccountAddressDerivativeOrdersRequest, injective.exchange.v1beta1.QueryOuterClass.QueryAccountAddressDerivativeOrdersResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "AccountAddressDerivativeOrders"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  injective.exchange.v1beta1.QueryOuterClass.QueryAccountAddressDerivativeOrdersRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  injective.exchange.v1beta1.QueryOuterClass.QueryAccountAddressDerivativeOrdersResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("AccountAddressDerivativeOrders"))
              .build();
        }
      }
    }
    return getAccountAddressDerivativeOrdersMethod;
  }

  private static volatile io.grpc.MethodDescriptor<injective.exchange.v1beta1.QueryOuterClass.QueryDerivativeOrdersByHashesRequest,
      injective.exchange.v1beta1.QueryOuterClass.QueryDerivativeOrdersByHashesResponse> getDerivativeOrdersByHashesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DerivativeOrdersByHashes",
      requestType = injective.exchange.v1beta1.QueryOuterClass.QueryDerivativeOrdersByHashesRequest.class,
      responseType = injective.exchange.v1beta1.QueryOuterClass.QueryDerivativeOrdersByHashesResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<injective.exchange.v1beta1.QueryOuterClass.QueryDerivativeOrdersByHashesRequest,
      injective.exchange.v1beta1.QueryOuterClass.QueryDerivativeOrdersByHashesResponse> getDerivativeOrdersByHashesMethod() {
    io.grpc.MethodDescriptor<injective.exchange.v1beta1.QueryOuterClass.QueryDerivativeOrdersByHashesRequest, injective.exchange.v1beta1.QueryOuterClass.QueryDerivativeOrdersByHashesResponse> getDerivativeOrdersByHashesMethod;
    if ((getDerivativeOrdersByHashesMethod = QueryGrpc.getDerivativeOrdersByHashesMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getDerivativeOrdersByHashesMethod = QueryGrpc.getDerivativeOrdersByHashesMethod) == null) {
          QueryGrpc.getDerivativeOrdersByHashesMethod = getDerivativeOrdersByHashesMethod =
              io.grpc.MethodDescriptor.<injective.exchange.v1beta1.QueryOuterClass.QueryDerivativeOrdersByHashesRequest, injective.exchange.v1beta1.QueryOuterClass.QueryDerivativeOrdersByHashesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DerivativeOrdersByHashes"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  injective.exchange.v1beta1.QueryOuterClass.QueryDerivativeOrdersByHashesRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  injective.exchange.v1beta1.QueryOuterClass.QueryDerivativeOrdersByHashesResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("DerivativeOrdersByHashes"))
              .build();
        }
      }
    }
    return getDerivativeOrdersByHashesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<injective.exchange.v1beta1.QueryOuterClass.QueryTraderDerivativeOrdersRequest,
      injective.exchange.v1beta1.QueryOuterClass.QueryTraderDerivativeOrdersResponse> getTraderDerivativeTransientOrdersMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "TraderDerivativeTransientOrders",
      requestType = injective.exchange.v1beta1.QueryOuterClass.QueryTraderDerivativeOrdersRequest.class,
      responseType = injective.exchange.v1beta1.QueryOuterClass.QueryTraderDerivativeOrdersResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<injective.exchange.v1beta1.QueryOuterClass.QueryTraderDerivativeOrdersRequest,
      injective.exchange.v1beta1.QueryOuterClass.QueryTraderDerivativeOrdersResponse> getTraderDerivativeTransientOrdersMethod() {
    io.grpc.MethodDescriptor<injective.exchange.v1beta1.QueryOuterClass.QueryTraderDerivativeOrdersRequest, injective.exchange.v1beta1.QueryOuterClass.QueryTraderDerivativeOrdersResponse> getTraderDerivativeTransientOrdersMethod;
    if ((getTraderDerivativeTransientOrdersMethod = QueryGrpc.getTraderDerivativeTransientOrdersMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getTraderDerivativeTransientOrdersMethod = QueryGrpc.getTraderDerivativeTransientOrdersMethod) == null) {
          QueryGrpc.getTraderDerivativeTransientOrdersMethod = getTraderDerivativeTransientOrdersMethod =
              io.grpc.MethodDescriptor.<injective.exchange.v1beta1.QueryOuterClass.QueryTraderDerivativeOrdersRequest, injective.exchange.v1beta1.QueryOuterClass.QueryTraderDerivativeOrdersResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "TraderDerivativeTransientOrders"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  injective.exchange.v1beta1.QueryOuterClass.QueryTraderDerivativeOrdersRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  injective.exchange.v1beta1.QueryOuterClass.QueryTraderDerivativeOrdersResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("TraderDerivativeTransientOrders"))
              .build();
        }
      }
    }
    return getTraderDerivativeTransientOrdersMethod;
  }

  private static volatile io.grpc.MethodDescriptor<injective.exchange.v1beta1.QueryOuterClass.QueryDerivativeMarketsRequest,
      injective.exchange.v1beta1.QueryOuterClass.QueryDerivativeMarketsResponse> getDerivativeMarketsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DerivativeMarkets",
      requestType = injective.exchange.v1beta1.QueryOuterClass.QueryDerivativeMarketsRequest.class,
      responseType = injective.exchange.v1beta1.QueryOuterClass.QueryDerivativeMarketsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<injective.exchange.v1beta1.QueryOuterClass.QueryDerivativeMarketsRequest,
      injective.exchange.v1beta1.QueryOuterClass.QueryDerivativeMarketsResponse> getDerivativeMarketsMethod() {
    io.grpc.MethodDescriptor<injective.exchange.v1beta1.QueryOuterClass.QueryDerivativeMarketsRequest, injective.exchange.v1beta1.QueryOuterClass.QueryDerivativeMarketsResponse> getDerivativeMarketsMethod;
    if ((getDerivativeMarketsMethod = QueryGrpc.getDerivativeMarketsMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getDerivativeMarketsMethod = QueryGrpc.getDerivativeMarketsMethod) == null) {
          QueryGrpc.getDerivativeMarketsMethod = getDerivativeMarketsMethod =
              io.grpc.MethodDescriptor.<injective.exchange.v1beta1.QueryOuterClass.QueryDerivativeMarketsRequest, injective.exchange.v1beta1.QueryOuterClass.QueryDerivativeMarketsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DerivativeMarkets"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  injective.exchange.v1beta1.QueryOuterClass.QueryDerivativeMarketsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  injective.exchange.v1beta1.QueryOuterClass.QueryDerivativeMarketsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("DerivativeMarkets"))
              .build();
        }
      }
    }
    return getDerivativeMarketsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<injective.exchange.v1beta1.QueryOuterClass.QueryDerivativeMarketRequest,
      injective.exchange.v1beta1.QueryOuterClass.QueryDerivativeMarketResponse> getDerivativeMarketMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DerivativeMarket",
      requestType = injective.exchange.v1beta1.QueryOuterClass.QueryDerivativeMarketRequest.class,
      responseType = injective.exchange.v1beta1.QueryOuterClass.QueryDerivativeMarketResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<injective.exchange.v1beta1.QueryOuterClass.QueryDerivativeMarketRequest,
      injective.exchange.v1beta1.QueryOuterClass.QueryDerivativeMarketResponse> getDerivativeMarketMethod() {
    io.grpc.MethodDescriptor<injective.exchange.v1beta1.QueryOuterClass.QueryDerivativeMarketRequest, injective.exchange.v1beta1.QueryOuterClass.QueryDerivativeMarketResponse> getDerivativeMarketMethod;
    if ((getDerivativeMarketMethod = QueryGrpc.getDerivativeMarketMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getDerivativeMarketMethod = QueryGrpc.getDerivativeMarketMethod) == null) {
          QueryGrpc.getDerivativeMarketMethod = getDerivativeMarketMethod =
              io.grpc.MethodDescriptor.<injective.exchange.v1beta1.QueryOuterClass.QueryDerivativeMarketRequest, injective.exchange.v1beta1.QueryOuterClass.QueryDerivativeMarketResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DerivativeMarket"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  injective.exchange.v1beta1.QueryOuterClass.QueryDerivativeMarketRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  injective.exchange.v1beta1.QueryOuterClass.QueryDerivativeMarketResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("DerivativeMarket"))
              .build();
        }
      }
    }
    return getDerivativeMarketMethod;
  }

  private static volatile io.grpc.MethodDescriptor<injective.exchange.v1beta1.QueryOuterClass.QueryDerivativeMarketAddressRequest,
      injective.exchange.v1beta1.QueryOuterClass.QueryDerivativeMarketAddressResponse> getDerivativeMarketAddressMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DerivativeMarketAddress",
      requestType = injective.exchange.v1beta1.QueryOuterClass.QueryDerivativeMarketAddressRequest.class,
      responseType = injective.exchange.v1beta1.QueryOuterClass.QueryDerivativeMarketAddressResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<injective.exchange.v1beta1.QueryOuterClass.QueryDerivativeMarketAddressRequest,
      injective.exchange.v1beta1.QueryOuterClass.QueryDerivativeMarketAddressResponse> getDerivativeMarketAddressMethod() {
    io.grpc.MethodDescriptor<injective.exchange.v1beta1.QueryOuterClass.QueryDerivativeMarketAddressRequest, injective.exchange.v1beta1.QueryOuterClass.QueryDerivativeMarketAddressResponse> getDerivativeMarketAddressMethod;
    if ((getDerivativeMarketAddressMethod = QueryGrpc.getDerivativeMarketAddressMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getDerivativeMarketAddressMethod = QueryGrpc.getDerivativeMarketAddressMethod) == null) {
          QueryGrpc.getDerivativeMarketAddressMethod = getDerivativeMarketAddressMethod =
              io.grpc.MethodDescriptor.<injective.exchange.v1beta1.QueryOuterClass.QueryDerivativeMarketAddressRequest, injective.exchange.v1beta1.QueryOuterClass.QueryDerivativeMarketAddressResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DerivativeMarketAddress"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  injective.exchange.v1beta1.QueryOuterClass.QueryDerivativeMarketAddressRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  injective.exchange.v1beta1.QueryOuterClass.QueryDerivativeMarketAddressResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("DerivativeMarketAddress"))
              .build();
        }
      }
    }
    return getDerivativeMarketAddressMethod;
  }

  private static volatile io.grpc.MethodDescriptor<injective.exchange.v1beta1.QueryOuterClass.QuerySubaccountTradeNonceRequest,
      injective.exchange.v1beta1.QueryOuterClass.QuerySubaccountTradeNonceResponse> getSubaccountTradeNonceMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SubaccountTradeNonce",
      requestType = injective.exchange.v1beta1.QueryOuterClass.QuerySubaccountTradeNonceRequest.class,
      responseType = injective.exchange.v1beta1.QueryOuterClass.QuerySubaccountTradeNonceResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<injective.exchange.v1beta1.QueryOuterClass.QuerySubaccountTradeNonceRequest,
      injective.exchange.v1beta1.QueryOuterClass.QuerySubaccountTradeNonceResponse> getSubaccountTradeNonceMethod() {
    io.grpc.MethodDescriptor<injective.exchange.v1beta1.QueryOuterClass.QuerySubaccountTradeNonceRequest, injective.exchange.v1beta1.QueryOuterClass.QuerySubaccountTradeNonceResponse> getSubaccountTradeNonceMethod;
    if ((getSubaccountTradeNonceMethod = QueryGrpc.getSubaccountTradeNonceMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getSubaccountTradeNonceMethod = QueryGrpc.getSubaccountTradeNonceMethod) == null) {
          QueryGrpc.getSubaccountTradeNonceMethod = getSubaccountTradeNonceMethod =
              io.grpc.MethodDescriptor.<injective.exchange.v1beta1.QueryOuterClass.QuerySubaccountTradeNonceRequest, injective.exchange.v1beta1.QueryOuterClass.QuerySubaccountTradeNonceResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SubaccountTradeNonce"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  injective.exchange.v1beta1.QueryOuterClass.QuerySubaccountTradeNonceRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  injective.exchange.v1beta1.QueryOuterClass.QuerySubaccountTradeNonceResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("SubaccountTradeNonce"))
              .build();
        }
      }
    }
    return getSubaccountTradeNonceMethod;
  }

  private static volatile io.grpc.MethodDescriptor<injective.exchange.v1beta1.QueryOuterClass.QueryModuleStateRequest,
      injective.exchange.v1beta1.QueryOuterClass.QueryModuleStateResponse> getExchangeModuleStateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ExchangeModuleState",
      requestType = injective.exchange.v1beta1.QueryOuterClass.QueryModuleStateRequest.class,
      responseType = injective.exchange.v1beta1.QueryOuterClass.QueryModuleStateResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<injective.exchange.v1beta1.QueryOuterClass.QueryModuleStateRequest,
      injective.exchange.v1beta1.QueryOuterClass.QueryModuleStateResponse> getExchangeModuleStateMethod() {
    io.grpc.MethodDescriptor<injective.exchange.v1beta1.QueryOuterClass.QueryModuleStateRequest, injective.exchange.v1beta1.QueryOuterClass.QueryModuleStateResponse> getExchangeModuleStateMethod;
    if ((getExchangeModuleStateMethod = QueryGrpc.getExchangeModuleStateMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getExchangeModuleStateMethod = QueryGrpc.getExchangeModuleStateMethod) == null) {
          QueryGrpc.getExchangeModuleStateMethod = getExchangeModuleStateMethod =
              io.grpc.MethodDescriptor.<injective.exchange.v1beta1.QueryOuterClass.QueryModuleStateRequest, injective.exchange.v1beta1.QueryOuterClass.QueryModuleStateResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ExchangeModuleState"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  injective.exchange.v1beta1.QueryOuterClass.QueryModuleStateRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  injective.exchange.v1beta1.QueryOuterClass.QueryModuleStateResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("ExchangeModuleState"))
              .build();
        }
      }
    }
    return getExchangeModuleStateMethod;
  }

  private static volatile io.grpc.MethodDescriptor<injective.exchange.v1beta1.QueryOuterClass.QueryPositionsRequest,
      injective.exchange.v1beta1.QueryOuterClass.QueryPositionsResponse> getPositionsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Positions",
      requestType = injective.exchange.v1beta1.QueryOuterClass.QueryPositionsRequest.class,
      responseType = injective.exchange.v1beta1.QueryOuterClass.QueryPositionsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<injective.exchange.v1beta1.QueryOuterClass.QueryPositionsRequest,
      injective.exchange.v1beta1.QueryOuterClass.QueryPositionsResponse> getPositionsMethod() {
    io.grpc.MethodDescriptor<injective.exchange.v1beta1.QueryOuterClass.QueryPositionsRequest, injective.exchange.v1beta1.QueryOuterClass.QueryPositionsResponse> getPositionsMethod;
    if ((getPositionsMethod = QueryGrpc.getPositionsMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getPositionsMethod = QueryGrpc.getPositionsMethod) == null) {
          QueryGrpc.getPositionsMethod = getPositionsMethod =
              io.grpc.MethodDescriptor.<injective.exchange.v1beta1.QueryOuterClass.QueryPositionsRequest, injective.exchange.v1beta1.QueryOuterClass.QueryPositionsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Positions"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  injective.exchange.v1beta1.QueryOuterClass.QueryPositionsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  injective.exchange.v1beta1.QueryOuterClass.QueryPositionsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("Positions"))
              .build();
        }
      }
    }
    return getPositionsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<injective.exchange.v1beta1.QueryOuterClass.QuerySubaccountPositionsRequest,
      injective.exchange.v1beta1.QueryOuterClass.QuerySubaccountPositionsResponse> getSubaccountPositionsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SubaccountPositions",
      requestType = injective.exchange.v1beta1.QueryOuterClass.QuerySubaccountPositionsRequest.class,
      responseType = injective.exchange.v1beta1.QueryOuterClass.QuerySubaccountPositionsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<injective.exchange.v1beta1.QueryOuterClass.QuerySubaccountPositionsRequest,
      injective.exchange.v1beta1.QueryOuterClass.QuerySubaccountPositionsResponse> getSubaccountPositionsMethod() {
    io.grpc.MethodDescriptor<injective.exchange.v1beta1.QueryOuterClass.QuerySubaccountPositionsRequest, injective.exchange.v1beta1.QueryOuterClass.QuerySubaccountPositionsResponse> getSubaccountPositionsMethod;
    if ((getSubaccountPositionsMethod = QueryGrpc.getSubaccountPositionsMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getSubaccountPositionsMethod = QueryGrpc.getSubaccountPositionsMethod) == null) {
          QueryGrpc.getSubaccountPositionsMethod = getSubaccountPositionsMethod =
              io.grpc.MethodDescriptor.<injective.exchange.v1beta1.QueryOuterClass.QuerySubaccountPositionsRequest, injective.exchange.v1beta1.QueryOuterClass.QuerySubaccountPositionsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SubaccountPositions"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  injective.exchange.v1beta1.QueryOuterClass.QuerySubaccountPositionsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  injective.exchange.v1beta1.QueryOuterClass.QuerySubaccountPositionsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("SubaccountPositions"))
              .build();
        }
      }
    }
    return getSubaccountPositionsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<injective.exchange.v1beta1.QueryOuterClass.QuerySubaccountPositionInMarketRequest,
      injective.exchange.v1beta1.QueryOuterClass.QuerySubaccountPositionInMarketResponse> getSubaccountPositionInMarketMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SubaccountPositionInMarket",
      requestType = injective.exchange.v1beta1.QueryOuterClass.QuerySubaccountPositionInMarketRequest.class,
      responseType = injective.exchange.v1beta1.QueryOuterClass.QuerySubaccountPositionInMarketResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<injective.exchange.v1beta1.QueryOuterClass.QuerySubaccountPositionInMarketRequest,
      injective.exchange.v1beta1.QueryOuterClass.QuerySubaccountPositionInMarketResponse> getSubaccountPositionInMarketMethod() {
    io.grpc.MethodDescriptor<injective.exchange.v1beta1.QueryOuterClass.QuerySubaccountPositionInMarketRequest, injective.exchange.v1beta1.QueryOuterClass.QuerySubaccountPositionInMarketResponse> getSubaccountPositionInMarketMethod;
    if ((getSubaccountPositionInMarketMethod = QueryGrpc.getSubaccountPositionInMarketMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getSubaccountPositionInMarketMethod = QueryGrpc.getSubaccountPositionInMarketMethod) == null) {
          QueryGrpc.getSubaccountPositionInMarketMethod = getSubaccountPositionInMarketMethod =
              io.grpc.MethodDescriptor.<injective.exchange.v1beta1.QueryOuterClass.QuerySubaccountPositionInMarketRequest, injective.exchange.v1beta1.QueryOuterClass.QuerySubaccountPositionInMarketResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SubaccountPositionInMarket"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  injective.exchange.v1beta1.QueryOuterClass.QuerySubaccountPositionInMarketRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  injective.exchange.v1beta1.QueryOuterClass.QuerySubaccountPositionInMarketResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("SubaccountPositionInMarket"))
              .build();
        }
      }
    }
    return getSubaccountPositionInMarketMethod;
  }

  private static volatile io.grpc.MethodDescriptor<injective.exchange.v1beta1.QueryOuterClass.QuerySubaccountEffectivePositionInMarketRequest,
      injective.exchange.v1beta1.QueryOuterClass.QuerySubaccountEffectivePositionInMarketResponse> getSubaccountEffectivePositionInMarketMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SubaccountEffectivePositionInMarket",
      requestType = injective.exchange.v1beta1.QueryOuterClass.QuerySubaccountEffectivePositionInMarketRequest.class,
      responseType = injective.exchange.v1beta1.QueryOuterClass.QuerySubaccountEffectivePositionInMarketResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<injective.exchange.v1beta1.QueryOuterClass.QuerySubaccountEffectivePositionInMarketRequest,
      injective.exchange.v1beta1.QueryOuterClass.QuerySubaccountEffectivePositionInMarketResponse> getSubaccountEffectivePositionInMarketMethod() {
    io.grpc.MethodDescriptor<injective.exchange.v1beta1.QueryOuterClass.QuerySubaccountEffectivePositionInMarketRequest, injective.exchange.v1beta1.QueryOuterClass.QuerySubaccountEffectivePositionInMarketResponse> getSubaccountEffectivePositionInMarketMethod;
    if ((getSubaccountEffectivePositionInMarketMethod = QueryGrpc.getSubaccountEffectivePositionInMarketMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getSubaccountEffectivePositionInMarketMethod = QueryGrpc.getSubaccountEffectivePositionInMarketMethod) == null) {
          QueryGrpc.getSubaccountEffectivePositionInMarketMethod = getSubaccountEffectivePositionInMarketMethod =
              io.grpc.MethodDescriptor.<injective.exchange.v1beta1.QueryOuterClass.QuerySubaccountEffectivePositionInMarketRequest, injective.exchange.v1beta1.QueryOuterClass.QuerySubaccountEffectivePositionInMarketResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SubaccountEffectivePositionInMarket"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  injective.exchange.v1beta1.QueryOuterClass.QuerySubaccountEffectivePositionInMarketRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  injective.exchange.v1beta1.QueryOuterClass.QuerySubaccountEffectivePositionInMarketResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("SubaccountEffectivePositionInMarket"))
              .build();
        }
      }
    }
    return getSubaccountEffectivePositionInMarketMethod;
  }

  private static volatile io.grpc.MethodDescriptor<injective.exchange.v1beta1.QueryOuterClass.QueryPerpetualMarketInfoRequest,
      injective.exchange.v1beta1.QueryOuterClass.QueryPerpetualMarketInfoResponse> getPerpetualMarketInfoMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "PerpetualMarketInfo",
      requestType = injective.exchange.v1beta1.QueryOuterClass.QueryPerpetualMarketInfoRequest.class,
      responseType = injective.exchange.v1beta1.QueryOuterClass.QueryPerpetualMarketInfoResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<injective.exchange.v1beta1.QueryOuterClass.QueryPerpetualMarketInfoRequest,
      injective.exchange.v1beta1.QueryOuterClass.QueryPerpetualMarketInfoResponse> getPerpetualMarketInfoMethod() {
    io.grpc.MethodDescriptor<injective.exchange.v1beta1.QueryOuterClass.QueryPerpetualMarketInfoRequest, injective.exchange.v1beta1.QueryOuterClass.QueryPerpetualMarketInfoResponse> getPerpetualMarketInfoMethod;
    if ((getPerpetualMarketInfoMethod = QueryGrpc.getPerpetualMarketInfoMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getPerpetualMarketInfoMethod = QueryGrpc.getPerpetualMarketInfoMethod) == null) {
          QueryGrpc.getPerpetualMarketInfoMethod = getPerpetualMarketInfoMethod =
              io.grpc.MethodDescriptor.<injective.exchange.v1beta1.QueryOuterClass.QueryPerpetualMarketInfoRequest, injective.exchange.v1beta1.QueryOuterClass.QueryPerpetualMarketInfoResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "PerpetualMarketInfo"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  injective.exchange.v1beta1.QueryOuterClass.QueryPerpetualMarketInfoRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  injective.exchange.v1beta1.QueryOuterClass.QueryPerpetualMarketInfoResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("PerpetualMarketInfo"))
              .build();
        }
      }
    }
    return getPerpetualMarketInfoMethod;
  }

  private static volatile io.grpc.MethodDescriptor<injective.exchange.v1beta1.QueryOuterClass.QueryExpiryFuturesMarketInfoRequest,
      injective.exchange.v1beta1.QueryOuterClass.QueryExpiryFuturesMarketInfoResponse> getExpiryFuturesMarketInfoMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ExpiryFuturesMarketInfo",
      requestType = injective.exchange.v1beta1.QueryOuterClass.QueryExpiryFuturesMarketInfoRequest.class,
      responseType = injective.exchange.v1beta1.QueryOuterClass.QueryExpiryFuturesMarketInfoResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<injective.exchange.v1beta1.QueryOuterClass.QueryExpiryFuturesMarketInfoRequest,
      injective.exchange.v1beta1.QueryOuterClass.QueryExpiryFuturesMarketInfoResponse> getExpiryFuturesMarketInfoMethod() {
    io.grpc.MethodDescriptor<injective.exchange.v1beta1.QueryOuterClass.QueryExpiryFuturesMarketInfoRequest, injective.exchange.v1beta1.QueryOuterClass.QueryExpiryFuturesMarketInfoResponse> getExpiryFuturesMarketInfoMethod;
    if ((getExpiryFuturesMarketInfoMethod = QueryGrpc.getExpiryFuturesMarketInfoMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getExpiryFuturesMarketInfoMethod = QueryGrpc.getExpiryFuturesMarketInfoMethod) == null) {
          QueryGrpc.getExpiryFuturesMarketInfoMethod = getExpiryFuturesMarketInfoMethod =
              io.grpc.MethodDescriptor.<injective.exchange.v1beta1.QueryOuterClass.QueryExpiryFuturesMarketInfoRequest, injective.exchange.v1beta1.QueryOuterClass.QueryExpiryFuturesMarketInfoResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ExpiryFuturesMarketInfo"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  injective.exchange.v1beta1.QueryOuterClass.QueryExpiryFuturesMarketInfoRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  injective.exchange.v1beta1.QueryOuterClass.QueryExpiryFuturesMarketInfoResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("ExpiryFuturesMarketInfo"))
              .build();
        }
      }
    }
    return getExpiryFuturesMarketInfoMethod;
  }

  private static volatile io.grpc.MethodDescriptor<injective.exchange.v1beta1.QueryOuterClass.QueryPerpetualMarketFundingRequest,
      injective.exchange.v1beta1.QueryOuterClass.QueryPerpetualMarketFundingResponse> getPerpetualMarketFundingMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "PerpetualMarketFunding",
      requestType = injective.exchange.v1beta1.QueryOuterClass.QueryPerpetualMarketFundingRequest.class,
      responseType = injective.exchange.v1beta1.QueryOuterClass.QueryPerpetualMarketFundingResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<injective.exchange.v1beta1.QueryOuterClass.QueryPerpetualMarketFundingRequest,
      injective.exchange.v1beta1.QueryOuterClass.QueryPerpetualMarketFundingResponse> getPerpetualMarketFundingMethod() {
    io.grpc.MethodDescriptor<injective.exchange.v1beta1.QueryOuterClass.QueryPerpetualMarketFundingRequest, injective.exchange.v1beta1.QueryOuterClass.QueryPerpetualMarketFundingResponse> getPerpetualMarketFundingMethod;
    if ((getPerpetualMarketFundingMethod = QueryGrpc.getPerpetualMarketFundingMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getPerpetualMarketFundingMethod = QueryGrpc.getPerpetualMarketFundingMethod) == null) {
          QueryGrpc.getPerpetualMarketFundingMethod = getPerpetualMarketFundingMethod =
              io.grpc.MethodDescriptor.<injective.exchange.v1beta1.QueryOuterClass.QueryPerpetualMarketFundingRequest, injective.exchange.v1beta1.QueryOuterClass.QueryPerpetualMarketFundingResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "PerpetualMarketFunding"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  injective.exchange.v1beta1.QueryOuterClass.QueryPerpetualMarketFundingRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  injective.exchange.v1beta1.QueryOuterClass.QueryPerpetualMarketFundingResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("PerpetualMarketFunding"))
              .build();
        }
      }
    }
    return getPerpetualMarketFundingMethod;
  }

  private static volatile io.grpc.MethodDescriptor<injective.exchange.v1beta1.QueryOuterClass.QuerySubaccountOrderMetadataRequest,
      injective.exchange.v1beta1.QueryOuterClass.QuerySubaccountOrderMetadataResponse> getSubaccountOrderMetadataMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SubaccountOrderMetadata",
      requestType = injective.exchange.v1beta1.QueryOuterClass.QuerySubaccountOrderMetadataRequest.class,
      responseType = injective.exchange.v1beta1.QueryOuterClass.QuerySubaccountOrderMetadataResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<injective.exchange.v1beta1.QueryOuterClass.QuerySubaccountOrderMetadataRequest,
      injective.exchange.v1beta1.QueryOuterClass.QuerySubaccountOrderMetadataResponse> getSubaccountOrderMetadataMethod() {
    io.grpc.MethodDescriptor<injective.exchange.v1beta1.QueryOuterClass.QuerySubaccountOrderMetadataRequest, injective.exchange.v1beta1.QueryOuterClass.QuerySubaccountOrderMetadataResponse> getSubaccountOrderMetadataMethod;
    if ((getSubaccountOrderMetadataMethod = QueryGrpc.getSubaccountOrderMetadataMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getSubaccountOrderMetadataMethod = QueryGrpc.getSubaccountOrderMetadataMethod) == null) {
          QueryGrpc.getSubaccountOrderMetadataMethod = getSubaccountOrderMetadataMethod =
              io.grpc.MethodDescriptor.<injective.exchange.v1beta1.QueryOuterClass.QuerySubaccountOrderMetadataRequest, injective.exchange.v1beta1.QueryOuterClass.QuerySubaccountOrderMetadataResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SubaccountOrderMetadata"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  injective.exchange.v1beta1.QueryOuterClass.QuerySubaccountOrderMetadataRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  injective.exchange.v1beta1.QueryOuterClass.QuerySubaccountOrderMetadataResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("SubaccountOrderMetadata"))
              .build();
        }
      }
    }
    return getSubaccountOrderMetadataMethod;
  }

  private static volatile io.grpc.MethodDescriptor<injective.exchange.v1beta1.QueryOuterClass.QueryTradeRewardPointsRequest,
      injective.exchange.v1beta1.QueryOuterClass.QueryTradeRewardPointsResponse> getTradeRewardPointsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "TradeRewardPoints",
      requestType = injective.exchange.v1beta1.QueryOuterClass.QueryTradeRewardPointsRequest.class,
      responseType = injective.exchange.v1beta1.QueryOuterClass.QueryTradeRewardPointsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<injective.exchange.v1beta1.QueryOuterClass.QueryTradeRewardPointsRequest,
      injective.exchange.v1beta1.QueryOuterClass.QueryTradeRewardPointsResponse> getTradeRewardPointsMethod() {
    io.grpc.MethodDescriptor<injective.exchange.v1beta1.QueryOuterClass.QueryTradeRewardPointsRequest, injective.exchange.v1beta1.QueryOuterClass.QueryTradeRewardPointsResponse> getTradeRewardPointsMethod;
    if ((getTradeRewardPointsMethod = QueryGrpc.getTradeRewardPointsMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getTradeRewardPointsMethod = QueryGrpc.getTradeRewardPointsMethod) == null) {
          QueryGrpc.getTradeRewardPointsMethod = getTradeRewardPointsMethod =
              io.grpc.MethodDescriptor.<injective.exchange.v1beta1.QueryOuterClass.QueryTradeRewardPointsRequest, injective.exchange.v1beta1.QueryOuterClass.QueryTradeRewardPointsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "TradeRewardPoints"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  injective.exchange.v1beta1.QueryOuterClass.QueryTradeRewardPointsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  injective.exchange.v1beta1.QueryOuterClass.QueryTradeRewardPointsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("TradeRewardPoints"))
              .build();
        }
      }
    }
    return getTradeRewardPointsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<injective.exchange.v1beta1.QueryOuterClass.QueryTradeRewardPointsRequest,
      injective.exchange.v1beta1.QueryOuterClass.QueryTradeRewardPointsResponse> getPendingTradeRewardPointsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "PendingTradeRewardPoints",
      requestType = injective.exchange.v1beta1.QueryOuterClass.QueryTradeRewardPointsRequest.class,
      responseType = injective.exchange.v1beta1.QueryOuterClass.QueryTradeRewardPointsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<injective.exchange.v1beta1.QueryOuterClass.QueryTradeRewardPointsRequest,
      injective.exchange.v1beta1.QueryOuterClass.QueryTradeRewardPointsResponse> getPendingTradeRewardPointsMethod() {
    io.grpc.MethodDescriptor<injective.exchange.v1beta1.QueryOuterClass.QueryTradeRewardPointsRequest, injective.exchange.v1beta1.QueryOuterClass.QueryTradeRewardPointsResponse> getPendingTradeRewardPointsMethod;
    if ((getPendingTradeRewardPointsMethod = QueryGrpc.getPendingTradeRewardPointsMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getPendingTradeRewardPointsMethod = QueryGrpc.getPendingTradeRewardPointsMethod) == null) {
          QueryGrpc.getPendingTradeRewardPointsMethod = getPendingTradeRewardPointsMethod =
              io.grpc.MethodDescriptor.<injective.exchange.v1beta1.QueryOuterClass.QueryTradeRewardPointsRequest, injective.exchange.v1beta1.QueryOuterClass.QueryTradeRewardPointsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "PendingTradeRewardPoints"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  injective.exchange.v1beta1.QueryOuterClass.QueryTradeRewardPointsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  injective.exchange.v1beta1.QueryOuterClass.QueryTradeRewardPointsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("PendingTradeRewardPoints"))
              .build();
        }
      }
    }
    return getPendingTradeRewardPointsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<injective.exchange.v1beta1.QueryOuterClass.QueryTradeRewardCampaignRequest,
      injective.exchange.v1beta1.QueryOuterClass.QueryTradeRewardCampaignResponse> getTradeRewardCampaignMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "TradeRewardCampaign",
      requestType = injective.exchange.v1beta1.QueryOuterClass.QueryTradeRewardCampaignRequest.class,
      responseType = injective.exchange.v1beta1.QueryOuterClass.QueryTradeRewardCampaignResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<injective.exchange.v1beta1.QueryOuterClass.QueryTradeRewardCampaignRequest,
      injective.exchange.v1beta1.QueryOuterClass.QueryTradeRewardCampaignResponse> getTradeRewardCampaignMethod() {
    io.grpc.MethodDescriptor<injective.exchange.v1beta1.QueryOuterClass.QueryTradeRewardCampaignRequest, injective.exchange.v1beta1.QueryOuterClass.QueryTradeRewardCampaignResponse> getTradeRewardCampaignMethod;
    if ((getTradeRewardCampaignMethod = QueryGrpc.getTradeRewardCampaignMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getTradeRewardCampaignMethod = QueryGrpc.getTradeRewardCampaignMethod) == null) {
          QueryGrpc.getTradeRewardCampaignMethod = getTradeRewardCampaignMethod =
              io.grpc.MethodDescriptor.<injective.exchange.v1beta1.QueryOuterClass.QueryTradeRewardCampaignRequest, injective.exchange.v1beta1.QueryOuterClass.QueryTradeRewardCampaignResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "TradeRewardCampaign"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  injective.exchange.v1beta1.QueryOuterClass.QueryTradeRewardCampaignRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  injective.exchange.v1beta1.QueryOuterClass.QueryTradeRewardCampaignResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("TradeRewardCampaign"))
              .build();
        }
      }
    }
    return getTradeRewardCampaignMethod;
  }

  private static volatile io.grpc.MethodDescriptor<injective.exchange.v1beta1.QueryOuterClass.QueryFeeDiscountAccountInfoRequest,
      injective.exchange.v1beta1.QueryOuterClass.QueryFeeDiscountAccountInfoResponse> getFeeDiscountAccountInfoMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "FeeDiscountAccountInfo",
      requestType = injective.exchange.v1beta1.QueryOuterClass.QueryFeeDiscountAccountInfoRequest.class,
      responseType = injective.exchange.v1beta1.QueryOuterClass.QueryFeeDiscountAccountInfoResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<injective.exchange.v1beta1.QueryOuterClass.QueryFeeDiscountAccountInfoRequest,
      injective.exchange.v1beta1.QueryOuterClass.QueryFeeDiscountAccountInfoResponse> getFeeDiscountAccountInfoMethod() {
    io.grpc.MethodDescriptor<injective.exchange.v1beta1.QueryOuterClass.QueryFeeDiscountAccountInfoRequest, injective.exchange.v1beta1.QueryOuterClass.QueryFeeDiscountAccountInfoResponse> getFeeDiscountAccountInfoMethod;
    if ((getFeeDiscountAccountInfoMethod = QueryGrpc.getFeeDiscountAccountInfoMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getFeeDiscountAccountInfoMethod = QueryGrpc.getFeeDiscountAccountInfoMethod) == null) {
          QueryGrpc.getFeeDiscountAccountInfoMethod = getFeeDiscountAccountInfoMethod =
              io.grpc.MethodDescriptor.<injective.exchange.v1beta1.QueryOuterClass.QueryFeeDiscountAccountInfoRequest, injective.exchange.v1beta1.QueryOuterClass.QueryFeeDiscountAccountInfoResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "FeeDiscountAccountInfo"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  injective.exchange.v1beta1.QueryOuterClass.QueryFeeDiscountAccountInfoRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  injective.exchange.v1beta1.QueryOuterClass.QueryFeeDiscountAccountInfoResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("FeeDiscountAccountInfo"))
              .build();
        }
      }
    }
    return getFeeDiscountAccountInfoMethod;
  }

  private static volatile io.grpc.MethodDescriptor<injective.exchange.v1beta1.QueryOuterClass.QueryFeeDiscountScheduleRequest,
      injective.exchange.v1beta1.QueryOuterClass.QueryFeeDiscountScheduleResponse> getFeeDiscountScheduleMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "FeeDiscountSchedule",
      requestType = injective.exchange.v1beta1.QueryOuterClass.QueryFeeDiscountScheduleRequest.class,
      responseType = injective.exchange.v1beta1.QueryOuterClass.QueryFeeDiscountScheduleResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<injective.exchange.v1beta1.QueryOuterClass.QueryFeeDiscountScheduleRequest,
      injective.exchange.v1beta1.QueryOuterClass.QueryFeeDiscountScheduleResponse> getFeeDiscountScheduleMethod() {
    io.grpc.MethodDescriptor<injective.exchange.v1beta1.QueryOuterClass.QueryFeeDiscountScheduleRequest, injective.exchange.v1beta1.QueryOuterClass.QueryFeeDiscountScheduleResponse> getFeeDiscountScheduleMethod;
    if ((getFeeDiscountScheduleMethod = QueryGrpc.getFeeDiscountScheduleMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getFeeDiscountScheduleMethod = QueryGrpc.getFeeDiscountScheduleMethod) == null) {
          QueryGrpc.getFeeDiscountScheduleMethod = getFeeDiscountScheduleMethod =
              io.grpc.MethodDescriptor.<injective.exchange.v1beta1.QueryOuterClass.QueryFeeDiscountScheduleRequest, injective.exchange.v1beta1.QueryOuterClass.QueryFeeDiscountScheduleResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "FeeDiscountSchedule"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  injective.exchange.v1beta1.QueryOuterClass.QueryFeeDiscountScheduleRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  injective.exchange.v1beta1.QueryOuterClass.QueryFeeDiscountScheduleResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("FeeDiscountSchedule"))
              .build();
        }
      }
    }
    return getFeeDiscountScheduleMethod;
  }

  private static volatile io.grpc.MethodDescriptor<injective.exchange.v1beta1.QueryOuterClass.QueryBalanceMismatchesRequest,
      injective.exchange.v1beta1.QueryOuterClass.QueryBalanceMismatchesResponse> getBalanceMismatchesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "BalanceMismatches",
      requestType = injective.exchange.v1beta1.QueryOuterClass.QueryBalanceMismatchesRequest.class,
      responseType = injective.exchange.v1beta1.QueryOuterClass.QueryBalanceMismatchesResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<injective.exchange.v1beta1.QueryOuterClass.QueryBalanceMismatchesRequest,
      injective.exchange.v1beta1.QueryOuterClass.QueryBalanceMismatchesResponse> getBalanceMismatchesMethod() {
    io.grpc.MethodDescriptor<injective.exchange.v1beta1.QueryOuterClass.QueryBalanceMismatchesRequest, injective.exchange.v1beta1.QueryOuterClass.QueryBalanceMismatchesResponse> getBalanceMismatchesMethod;
    if ((getBalanceMismatchesMethod = QueryGrpc.getBalanceMismatchesMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getBalanceMismatchesMethod = QueryGrpc.getBalanceMismatchesMethod) == null) {
          QueryGrpc.getBalanceMismatchesMethod = getBalanceMismatchesMethod =
              io.grpc.MethodDescriptor.<injective.exchange.v1beta1.QueryOuterClass.QueryBalanceMismatchesRequest, injective.exchange.v1beta1.QueryOuterClass.QueryBalanceMismatchesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "BalanceMismatches"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  injective.exchange.v1beta1.QueryOuterClass.QueryBalanceMismatchesRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  injective.exchange.v1beta1.QueryOuterClass.QueryBalanceMismatchesResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("BalanceMismatches"))
              .build();
        }
      }
    }
    return getBalanceMismatchesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<injective.exchange.v1beta1.QueryOuterClass.QueryBalanceWithBalanceHoldsRequest,
      injective.exchange.v1beta1.QueryOuterClass.QueryBalanceWithBalanceHoldsResponse> getBalanceWithBalanceHoldsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "BalanceWithBalanceHolds",
      requestType = injective.exchange.v1beta1.QueryOuterClass.QueryBalanceWithBalanceHoldsRequest.class,
      responseType = injective.exchange.v1beta1.QueryOuterClass.QueryBalanceWithBalanceHoldsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<injective.exchange.v1beta1.QueryOuterClass.QueryBalanceWithBalanceHoldsRequest,
      injective.exchange.v1beta1.QueryOuterClass.QueryBalanceWithBalanceHoldsResponse> getBalanceWithBalanceHoldsMethod() {
    io.grpc.MethodDescriptor<injective.exchange.v1beta1.QueryOuterClass.QueryBalanceWithBalanceHoldsRequest, injective.exchange.v1beta1.QueryOuterClass.QueryBalanceWithBalanceHoldsResponse> getBalanceWithBalanceHoldsMethod;
    if ((getBalanceWithBalanceHoldsMethod = QueryGrpc.getBalanceWithBalanceHoldsMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getBalanceWithBalanceHoldsMethod = QueryGrpc.getBalanceWithBalanceHoldsMethod) == null) {
          QueryGrpc.getBalanceWithBalanceHoldsMethod = getBalanceWithBalanceHoldsMethod =
              io.grpc.MethodDescriptor.<injective.exchange.v1beta1.QueryOuterClass.QueryBalanceWithBalanceHoldsRequest, injective.exchange.v1beta1.QueryOuterClass.QueryBalanceWithBalanceHoldsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "BalanceWithBalanceHolds"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  injective.exchange.v1beta1.QueryOuterClass.QueryBalanceWithBalanceHoldsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  injective.exchange.v1beta1.QueryOuterClass.QueryBalanceWithBalanceHoldsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("BalanceWithBalanceHolds"))
              .build();
        }
      }
    }
    return getBalanceWithBalanceHoldsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<injective.exchange.v1beta1.QueryOuterClass.QueryFeeDiscountTierStatisticsRequest,
      injective.exchange.v1beta1.QueryOuterClass.QueryFeeDiscountTierStatisticsResponse> getFeeDiscountTierStatisticsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "FeeDiscountTierStatistics",
      requestType = injective.exchange.v1beta1.QueryOuterClass.QueryFeeDiscountTierStatisticsRequest.class,
      responseType = injective.exchange.v1beta1.QueryOuterClass.QueryFeeDiscountTierStatisticsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<injective.exchange.v1beta1.QueryOuterClass.QueryFeeDiscountTierStatisticsRequest,
      injective.exchange.v1beta1.QueryOuterClass.QueryFeeDiscountTierStatisticsResponse> getFeeDiscountTierStatisticsMethod() {
    io.grpc.MethodDescriptor<injective.exchange.v1beta1.QueryOuterClass.QueryFeeDiscountTierStatisticsRequest, injective.exchange.v1beta1.QueryOuterClass.QueryFeeDiscountTierStatisticsResponse> getFeeDiscountTierStatisticsMethod;
    if ((getFeeDiscountTierStatisticsMethod = QueryGrpc.getFeeDiscountTierStatisticsMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getFeeDiscountTierStatisticsMethod = QueryGrpc.getFeeDiscountTierStatisticsMethod) == null) {
          QueryGrpc.getFeeDiscountTierStatisticsMethod = getFeeDiscountTierStatisticsMethod =
              io.grpc.MethodDescriptor.<injective.exchange.v1beta1.QueryOuterClass.QueryFeeDiscountTierStatisticsRequest, injective.exchange.v1beta1.QueryOuterClass.QueryFeeDiscountTierStatisticsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "FeeDiscountTierStatistics"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  injective.exchange.v1beta1.QueryOuterClass.QueryFeeDiscountTierStatisticsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  injective.exchange.v1beta1.QueryOuterClass.QueryFeeDiscountTierStatisticsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("FeeDiscountTierStatistics"))
              .build();
        }
      }
    }
    return getFeeDiscountTierStatisticsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<injective.exchange.v1beta1.QueryOuterClass.MitoVaultInfosRequest,
      injective.exchange.v1beta1.QueryOuterClass.MitoVaultInfosResponse> getMitoVaultInfosMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "MitoVaultInfos",
      requestType = injective.exchange.v1beta1.QueryOuterClass.MitoVaultInfosRequest.class,
      responseType = injective.exchange.v1beta1.QueryOuterClass.MitoVaultInfosResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<injective.exchange.v1beta1.QueryOuterClass.MitoVaultInfosRequest,
      injective.exchange.v1beta1.QueryOuterClass.MitoVaultInfosResponse> getMitoVaultInfosMethod() {
    io.grpc.MethodDescriptor<injective.exchange.v1beta1.QueryOuterClass.MitoVaultInfosRequest, injective.exchange.v1beta1.QueryOuterClass.MitoVaultInfosResponse> getMitoVaultInfosMethod;
    if ((getMitoVaultInfosMethod = QueryGrpc.getMitoVaultInfosMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getMitoVaultInfosMethod = QueryGrpc.getMitoVaultInfosMethod) == null) {
          QueryGrpc.getMitoVaultInfosMethod = getMitoVaultInfosMethod =
              io.grpc.MethodDescriptor.<injective.exchange.v1beta1.QueryOuterClass.MitoVaultInfosRequest, injective.exchange.v1beta1.QueryOuterClass.MitoVaultInfosResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "MitoVaultInfos"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  injective.exchange.v1beta1.QueryOuterClass.MitoVaultInfosRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  injective.exchange.v1beta1.QueryOuterClass.MitoVaultInfosResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("MitoVaultInfos"))
              .build();
        }
      }
    }
    return getMitoVaultInfosMethod;
  }

  private static volatile io.grpc.MethodDescriptor<injective.exchange.v1beta1.QueryOuterClass.QueryMarketIDFromVaultRequest,
      injective.exchange.v1beta1.QueryOuterClass.QueryMarketIDFromVaultResponse> getQueryMarketIDFromVaultMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "QueryMarketIDFromVault",
      requestType = injective.exchange.v1beta1.QueryOuterClass.QueryMarketIDFromVaultRequest.class,
      responseType = injective.exchange.v1beta1.QueryOuterClass.QueryMarketIDFromVaultResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<injective.exchange.v1beta1.QueryOuterClass.QueryMarketIDFromVaultRequest,
      injective.exchange.v1beta1.QueryOuterClass.QueryMarketIDFromVaultResponse> getQueryMarketIDFromVaultMethod() {
    io.grpc.MethodDescriptor<injective.exchange.v1beta1.QueryOuterClass.QueryMarketIDFromVaultRequest, injective.exchange.v1beta1.QueryOuterClass.QueryMarketIDFromVaultResponse> getQueryMarketIDFromVaultMethod;
    if ((getQueryMarketIDFromVaultMethod = QueryGrpc.getQueryMarketIDFromVaultMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getQueryMarketIDFromVaultMethod = QueryGrpc.getQueryMarketIDFromVaultMethod) == null) {
          QueryGrpc.getQueryMarketIDFromVaultMethod = getQueryMarketIDFromVaultMethod =
              io.grpc.MethodDescriptor.<injective.exchange.v1beta1.QueryOuterClass.QueryMarketIDFromVaultRequest, injective.exchange.v1beta1.QueryOuterClass.QueryMarketIDFromVaultResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "QueryMarketIDFromVault"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  injective.exchange.v1beta1.QueryOuterClass.QueryMarketIDFromVaultRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  injective.exchange.v1beta1.QueryOuterClass.QueryMarketIDFromVaultResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("QueryMarketIDFromVault"))
              .build();
        }
      }
    }
    return getQueryMarketIDFromVaultMethod;
  }

  private static volatile io.grpc.MethodDescriptor<injective.exchange.v1beta1.QueryOuterClass.QueryHistoricalTradeRecordsRequest,
      injective.exchange.v1beta1.QueryOuterClass.QueryHistoricalTradeRecordsResponse> getHistoricalTradeRecordsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "HistoricalTradeRecords",
      requestType = injective.exchange.v1beta1.QueryOuterClass.QueryHistoricalTradeRecordsRequest.class,
      responseType = injective.exchange.v1beta1.QueryOuterClass.QueryHistoricalTradeRecordsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<injective.exchange.v1beta1.QueryOuterClass.QueryHistoricalTradeRecordsRequest,
      injective.exchange.v1beta1.QueryOuterClass.QueryHistoricalTradeRecordsResponse> getHistoricalTradeRecordsMethod() {
    io.grpc.MethodDescriptor<injective.exchange.v1beta1.QueryOuterClass.QueryHistoricalTradeRecordsRequest, injective.exchange.v1beta1.QueryOuterClass.QueryHistoricalTradeRecordsResponse> getHistoricalTradeRecordsMethod;
    if ((getHistoricalTradeRecordsMethod = QueryGrpc.getHistoricalTradeRecordsMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getHistoricalTradeRecordsMethod = QueryGrpc.getHistoricalTradeRecordsMethod) == null) {
          QueryGrpc.getHistoricalTradeRecordsMethod = getHistoricalTradeRecordsMethod =
              io.grpc.MethodDescriptor.<injective.exchange.v1beta1.QueryOuterClass.QueryHistoricalTradeRecordsRequest, injective.exchange.v1beta1.QueryOuterClass.QueryHistoricalTradeRecordsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "HistoricalTradeRecords"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  injective.exchange.v1beta1.QueryOuterClass.QueryHistoricalTradeRecordsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  injective.exchange.v1beta1.QueryOuterClass.QueryHistoricalTradeRecordsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("HistoricalTradeRecords"))
              .build();
        }
      }
    }
    return getHistoricalTradeRecordsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<injective.exchange.v1beta1.QueryOuterClass.QueryIsOptedOutOfRewardsRequest,
      injective.exchange.v1beta1.QueryOuterClass.QueryIsOptedOutOfRewardsResponse> getIsOptedOutOfRewardsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "IsOptedOutOfRewards",
      requestType = injective.exchange.v1beta1.QueryOuterClass.QueryIsOptedOutOfRewardsRequest.class,
      responseType = injective.exchange.v1beta1.QueryOuterClass.QueryIsOptedOutOfRewardsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<injective.exchange.v1beta1.QueryOuterClass.QueryIsOptedOutOfRewardsRequest,
      injective.exchange.v1beta1.QueryOuterClass.QueryIsOptedOutOfRewardsResponse> getIsOptedOutOfRewardsMethod() {
    io.grpc.MethodDescriptor<injective.exchange.v1beta1.QueryOuterClass.QueryIsOptedOutOfRewardsRequest, injective.exchange.v1beta1.QueryOuterClass.QueryIsOptedOutOfRewardsResponse> getIsOptedOutOfRewardsMethod;
    if ((getIsOptedOutOfRewardsMethod = QueryGrpc.getIsOptedOutOfRewardsMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getIsOptedOutOfRewardsMethod = QueryGrpc.getIsOptedOutOfRewardsMethod) == null) {
          QueryGrpc.getIsOptedOutOfRewardsMethod = getIsOptedOutOfRewardsMethod =
              io.grpc.MethodDescriptor.<injective.exchange.v1beta1.QueryOuterClass.QueryIsOptedOutOfRewardsRequest, injective.exchange.v1beta1.QueryOuterClass.QueryIsOptedOutOfRewardsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "IsOptedOutOfRewards"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  injective.exchange.v1beta1.QueryOuterClass.QueryIsOptedOutOfRewardsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  injective.exchange.v1beta1.QueryOuterClass.QueryIsOptedOutOfRewardsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("IsOptedOutOfRewards"))
              .build();
        }
      }
    }
    return getIsOptedOutOfRewardsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<injective.exchange.v1beta1.QueryOuterClass.QueryOptedOutOfRewardsAccountsRequest,
      injective.exchange.v1beta1.QueryOuterClass.QueryOptedOutOfRewardsAccountsResponse> getOptedOutOfRewardsAccountsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "OptedOutOfRewardsAccounts",
      requestType = injective.exchange.v1beta1.QueryOuterClass.QueryOptedOutOfRewardsAccountsRequest.class,
      responseType = injective.exchange.v1beta1.QueryOuterClass.QueryOptedOutOfRewardsAccountsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<injective.exchange.v1beta1.QueryOuterClass.QueryOptedOutOfRewardsAccountsRequest,
      injective.exchange.v1beta1.QueryOuterClass.QueryOptedOutOfRewardsAccountsResponse> getOptedOutOfRewardsAccountsMethod() {
    io.grpc.MethodDescriptor<injective.exchange.v1beta1.QueryOuterClass.QueryOptedOutOfRewardsAccountsRequest, injective.exchange.v1beta1.QueryOuterClass.QueryOptedOutOfRewardsAccountsResponse> getOptedOutOfRewardsAccountsMethod;
    if ((getOptedOutOfRewardsAccountsMethod = QueryGrpc.getOptedOutOfRewardsAccountsMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getOptedOutOfRewardsAccountsMethod = QueryGrpc.getOptedOutOfRewardsAccountsMethod) == null) {
          QueryGrpc.getOptedOutOfRewardsAccountsMethod = getOptedOutOfRewardsAccountsMethod =
              io.grpc.MethodDescriptor.<injective.exchange.v1beta1.QueryOuterClass.QueryOptedOutOfRewardsAccountsRequest, injective.exchange.v1beta1.QueryOuterClass.QueryOptedOutOfRewardsAccountsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "OptedOutOfRewardsAccounts"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  injective.exchange.v1beta1.QueryOuterClass.QueryOptedOutOfRewardsAccountsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  injective.exchange.v1beta1.QueryOuterClass.QueryOptedOutOfRewardsAccountsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("OptedOutOfRewardsAccounts"))
              .build();
        }
      }
    }
    return getOptedOutOfRewardsAccountsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<injective.exchange.v1beta1.QueryOuterClass.QueryMarketVolatilityRequest,
      injective.exchange.v1beta1.QueryOuterClass.QueryMarketVolatilityResponse> getMarketVolatilityMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "MarketVolatility",
      requestType = injective.exchange.v1beta1.QueryOuterClass.QueryMarketVolatilityRequest.class,
      responseType = injective.exchange.v1beta1.QueryOuterClass.QueryMarketVolatilityResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<injective.exchange.v1beta1.QueryOuterClass.QueryMarketVolatilityRequest,
      injective.exchange.v1beta1.QueryOuterClass.QueryMarketVolatilityResponse> getMarketVolatilityMethod() {
    io.grpc.MethodDescriptor<injective.exchange.v1beta1.QueryOuterClass.QueryMarketVolatilityRequest, injective.exchange.v1beta1.QueryOuterClass.QueryMarketVolatilityResponse> getMarketVolatilityMethod;
    if ((getMarketVolatilityMethod = QueryGrpc.getMarketVolatilityMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getMarketVolatilityMethod = QueryGrpc.getMarketVolatilityMethod) == null) {
          QueryGrpc.getMarketVolatilityMethod = getMarketVolatilityMethod =
              io.grpc.MethodDescriptor.<injective.exchange.v1beta1.QueryOuterClass.QueryMarketVolatilityRequest, injective.exchange.v1beta1.QueryOuterClass.QueryMarketVolatilityResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "MarketVolatility"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  injective.exchange.v1beta1.QueryOuterClass.QueryMarketVolatilityRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  injective.exchange.v1beta1.QueryOuterClass.QueryMarketVolatilityResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("MarketVolatility"))
              .build();
        }
      }
    }
    return getMarketVolatilityMethod;
  }

  private static volatile io.grpc.MethodDescriptor<injective.exchange.v1beta1.QueryOuterClass.QueryBinaryMarketsRequest,
      injective.exchange.v1beta1.QueryOuterClass.QueryBinaryMarketsResponse> getBinaryOptionsMarketsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "BinaryOptionsMarkets",
      requestType = injective.exchange.v1beta1.QueryOuterClass.QueryBinaryMarketsRequest.class,
      responseType = injective.exchange.v1beta1.QueryOuterClass.QueryBinaryMarketsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<injective.exchange.v1beta1.QueryOuterClass.QueryBinaryMarketsRequest,
      injective.exchange.v1beta1.QueryOuterClass.QueryBinaryMarketsResponse> getBinaryOptionsMarketsMethod() {
    io.grpc.MethodDescriptor<injective.exchange.v1beta1.QueryOuterClass.QueryBinaryMarketsRequest, injective.exchange.v1beta1.QueryOuterClass.QueryBinaryMarketsResponse> getBinaryOptionsMarketsMethod;
    if ((getBinaryOptionsMarketsMethod = QueryGrpc.getBinaryOptionsMarketsMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getBinaryOptionsMarketsMethod = QueryGrpc.getBinaryOptionsMarketsMethod) == null) {
          QueryGrpc.getBinaryOptionsMarketsMethod = getBinaryOptionsMarketsMethod =
              io.grpc.MethodDescriptor.<injective.exchange.v1beta1.QueryOuterClass.QueryBinaryMarketsRequest, injective.exchange.v1beta1.QueryOuterClass.QueryBinaryMarketsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "BinaryOptionsMarkets"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  injective.exchange.v1beta1.QueryOuterClass.QueryBinaryMarketsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  injective.exchange.v1beta1.QueryOuterClass.QueryBinaryMarketsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("BinaryOptionsMarkets"))
              .build();
        }
      }
    }
    return getBinaryOptionsMarketsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<injective.exchange.v1beta1.QueryOuterClass.QueryTraderDerivativeConditionalOrdersRequest,
      injective.exchange.v1beta1.QueryOuterClass.QueryTraderDerivativeConditionalOrdersResponse> getTraderDerivativeConditionalOrdersMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "TraderDerivativeConditionalOrders",
      requestType = injective.exchange.v1beta1.QueryOuterClass.QueryTraderDerivativeConditionalOrdersRequest.class,
      responseType = injective.exchange.v1beta1.QueryOuterClass.QueryTraderDerivativeConditionalOrdersResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<injective.exchange.v1beta1.QueryOuterClass.QueryTraderDerivativeConditionalOrdersRequest,
      injective.exchange.v1beta1.QueryOuterClass.QueryTraderDerivativeConditionalOrdersResponse> getTraderDerivativeConditionalOrdersMethod() {
    io.grpc.MethodDescriptor<injective.exchange.v1beta1.QueryOuterClass.QueryTraderDerivativeConditionalOrdersRequest, injective.exchange.v1beta1.QueryOuterClass.QueryTraderDerivativeConditionalOrdersResponse> getTraderDerivativeConditionalOrdersMethod;
    if ((getTraderDerivativeConditionalOrdersMethod = QueryGrpc.getTraderDerivativeConditionalOrdersMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getTraderDerivativeConditionalOrdersMethod = QueryGrpc.getTraderDerivativeConditionalOrdersMethod) == null) {
          QueryGrpc.getTraderDerivativeConditionalOrdersMethod = getTraderDerivativeConditionalOrdersMethod =
              io.grpc.MethodDescriptor.<injective.exchange.v1beta1.QueryOuterClass.QueryTraderDerivativeConditionalOrdersRequest, injective.exchange.v1beta1.QueryOuterClass.QueryTraderDerivativeConditionalOrdersResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "TraderDerivativeConditionalOrders"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  injective.exchange.v1beta1.QueryOuterClass.QueryTraderDerivativeConditionalOrdersRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  injective.exchange.v1beta1.QueryOuterClass.QueryTraderDerivativeConditionalOrdersResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("TraderDerivativeConditionalOrders"))
              .build();
        }
      }
    }
    return getTraderDerivativeConditionalOrdersMethod;
  }

  private static volatile io.grpc.MethodDescriptor<injective.exchange.v1beta1.QueryOuterClass.QueryMarketAtomicExecutionFeeMultiplierRequest,
      injective.exchange.v1beta1.QueryOuterClass.QueryMarketAtomicExecutionFeeMultiplierResponse> getMarketAtomicExecutionFeeMultiplierMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "MarketAtomicExecutionFeeMultiplier",
      requestType = injective.exchange.v1beta1.QueryOuterClass.QueryMarketAtomicExecutionFeeMultiplierRequest.class,
      responseType = injective.exchange.v1beta1.QueryOuterClass.QueryMarketAtomicExecutionFeeMultiplierResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<injective.exchange.v1beta1.QueryOuterClass.QueryMarketAtomicExecutionFeeMultiplierRequest,
      injective.exchange.v1beta1.QueryOuterClass.QueryMarketAtomicExecutionFeeMultiplierResponse> getMarketAtomicExecutionFeeMultiplierMethod() {
    io.grpc.MethodDescriptor<injective.exchange.v1beta1.QueryOuterClass.QueryMarketAtomicExecutionFeeMultiplierRequest, injective.exchange.v1beta1.QueryOuterClass.QueryMarketAtomicExecutionFeeMultiplierResponse> getMarketAtomicExecutionFeeMultiplierMethod;
    if ((getMarketAtomicExecutionFeeMultiplierMethod = QueryGrpc.getMarketAtomicExecutionFeeMultiplierMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getMarketAtomicExecutionFeeMultiplierMethod = QueryGrpc.getMarketAtomicExecutionFeeMultiplierMethod) == null) {
          QueryGrpc.getMarketAtomicExecutionFeeMultiplierMethod = getMarketAtomicExecutionFeeMultiplierMethod =
              io.grpc.MethodDescriptor.<injective.exchange.v1beta1.QueryOuterClass.QueryMarketAtomicExecutionFeeMultiplierRequest, injective.exchange.v1beta1.QueryOuterClass.QueryMarketAtomicExecutionFeeMultiplierResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "MarketAtomicExecutionFeeMultiplier"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  injective.exchange.v1beta1.QueryOuterClass.QueryMarketAtomicExecutionFeeMultiplierRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  injective.exchange.v1beta1.QueryOuterClass.QueryMarketAtomicExecutionFeeMultiplierResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("MarketAtomicExecutionFeeMultiplier"))
              .build();
        }
      }
    }
    return getMarketAtomicExecutionFeeMultiplierMethod;
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
     * Retrieves exchange params
     * </pre>
     */
    default void queryExchangeParams(injective.exchange.v1beta1.QueryOuterClass.QueryExchangeParamsRequest request,
        io.grpc.stub.StreamObserver<injective.exchange.v1beta1.QueryOuterClass.QueryExchangeParamsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getQueryExchangeParamsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Retrieves a Subaccount's Deposits
     * </pre>
     */
    default void subaccountDeposits(injective.exchange.v1beta1.QueryOuterClass.QuerySubaccountDepositsRequest request,
        io.grpc.stub.StreamObserver<injective.exchange.v1beta1.QueryOuterClass.QuerySubaccountDepositsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSubaccountDepositsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Retrieves a Subaccount's Deposits
     * </pre>
     */
    default void subaccountDeposit(injective.exchange.v1beta1.QueryOuterClass.QuerySubaccountDepositRequest request,
        io.grpc.stub.StreamObserver<injective.exchange.v1beta1.QueryOuterClass.QuerySubaccountDepositResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSubaccountDepositMethod(), responseObserver);
    }

    /**
     * <pre>
     * Retrieves all of the balances of all users on the exchange.
     * </pre>
     */
    default void exchangeBalances(injective.exchange.v1beta1.QueryOuterClass.QueryExchangeBalancesRequest request,
        io.grpc.stub.StreamObserver<injective.exchange.v1beta1.QueryOuterClass.QueryExchangeBalancesResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getExchangeBalancesMethod(), responseObserver);
    }

    /**
     * <pre>
     * Retrieves the aggregate volumes for the specified account or subaccount
     * </pre>
     */
    default void aggregateVolume(injective.exchange.v1beta1.QueryOuterClass.QueryAggregateVolumeRequest request,
        io.grpc.stub.StreamObserver<injective.exchange.v1beta1.QueryOuterClass.QueryAggregateVolumeResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getAggregateVolumeMethod(), responseObserver);
    }

    /**
     * <pre>
     * Retrieves the aggregate volumes for specified accounts
     * </pre>
     */
    default void aggregateVolumes(injective.exchange.v1beta1.QueryOuterClass.QueryAggregateVolumesRequest request,
        io.grpc.stub.StreamObserver<injective.exchange.v1beta1.QueryOuterClass.QueryAggregateVolumesResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getAggregateVolumesMethod(), responseObserver);
    }

    /**
     * <pre>
     * Retrieves the aggregate volume for the specified market
     * </pre>
     */
    default void aggregateMarketVolume(injective.exchange.v1beta1.QueryOuterClass.QueryAggregateMarketVolumeRequest request,
        io.grpc.stub.StreamObserver<injective.exchange.v1beta1.QueryOuterClass.QueryAggregateMarketVolumeResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getAggregateMarketVolumeMethod(), responseObserver);
    }

    /**
     * <pre>
     * Retrieves the aggregate market volumes for specified markets
     * </pre>
     */
    default void aggregateMarketVolumes(injective.exchange.v1beta1.QueryOuterClass.QueryAggregateMarketVolumesRequest request,
        io.grpc.stub.StreamObserver<injective.exchange.v1beta1.QueryOuterClass.QueryAggregateMarketVolumesResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getAggregateMarketVolumesMethod(), responseObserver);
    }

    /**
     * <pre>
     * Retrieves the denom decimals for a denom.
     * </pre>
     */
    default void denomDecimal(injective.exchange.v1beta1.QueryOuterClass.QueryDenomDecimalRequest request,
        io.grpc.stub.StreamObserver<injective.exchange.v1beta1.QueryOuterClass.QueryDenomDecimalResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDenomDecimalMethod(), responseObserver);
    }

    /**
     * <pre>
     * Retrieves the denom decimals for multiple denoms. Returns all denom
     * decimals if unspecified.
     * </pre>
     */
    default void denomDecimals(injective.exchange.v1beta1.QueryOuterClass.QueryDenomDecimalsRequest request,
        io.grpc.stub.StreamObserver<injective.exchange.v1beta1.QueryOuterClass.QueryDenomDecimalsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDenomDecimalsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Retrieves a list of spot markets.
     * </pre>
     */
    default void spotMarkets(injective.exchange.v1beta1.QueryOuterClass.QuerySpotMarketsRequest request,
        io.grpc.stub.StreamObserver<injective.exchange.v1beta1.QueryOuterClass.QuerySpotMarketsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSpotMarketsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Retrieves a spot market by ticker
     * </pre>
     */
    default void spotMarket(injective.exchange.v1beta1.QueryOuterClass.QuerySpotMarketRequest request,
        io.grpc.stub.StreamObserver<injective.exchange.v1beta1.QueryOuterClass.QuerySpotMarketResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSpotMarketMethod(), responseObserver);
    }

    /**
     * <pre>
     * Retrieves a list of spot markets with extra information.
     * </pre>
     */
    default void fullSpotMarkets(injective.exchange.v1beta1.QueryOuterClass.QueryFullSpotMarketsRequest request,
        io.grpc.stub.StreamObserver<injective.exchange.v1beta1.QueryOuterClass.QueryFullSpotMarketsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getFullSpotMarketsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Retrieves a spot market with extra information.
     * </pre>
     */
    default void fullSpotMarket(injective.exchange.v1beta1.QueryOuterClass.QueryFullSpotMarketRequest request,
        io.grpc.stub.StreamObserver<injective.exchange.v1beta1.QueryOuterClass.QueryFullSpotMarketResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getFullSpotMarketMethod(), responseObserver);
    }

    /**
     * <pre>
     * Retrieves a spot market's orderbook by marketID
     * </pre>
     */
    default void spotOrderbook(injective.exchange.v1beta1.QueryOuterClass.QuerySpotOrderbookRequest request,
        io.grpc.stub.StreamObserver<injective.exchange.v1beta1.QueryOuterClass.QuerySpotOrderbookResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSpotOrderbookMethod(), responseObserver);
    }

    /**
     * <pre>
     * Retrieves a trader's spot orders
     * </pre>
     */
    default void traderSpotOrders(injective.exchange.v1beta1.QueryOuterClass.QueryTraderSpotOrdersRequest request,
        io.grpc.stub.StreamObserver<injective.exchange.v1beta1.QueryOuterClass.QueryTraderSpotOrdersResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getTraderSpotOrdersMethod(), responseObserver);
    }

    /**
     * <pre>
     * Retrieves all account address spot orders
     * </pre>
     */
    default void accountAddressSpotOrders(injective.exchange.v1beta1.QueryOuterClass.QueryAccountAddressSpotOrdersRequest request,
        io.grpc.stub.StreamObserver<injective.exchange.v1beta1.QueryOuterClass.QueryAccountAddressSpotOrdersResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getAccountAddressSpotOrdersMethod(), responseObserver);
    }

    /**
     * <pre>
     * Retrieves spot orders corresponding to specified order hashes for a given
     * subaccountID and marketID
     * </pre>
     */
    default void spotOrdersByHashes(injective.exchange.v1beta1.QueryOuterClass.QuerySpotOrdersByHashesRequest request,
        io.grpc.stub.StreamObserver<injective.exchange.v1beta1.QueryOuterClass.QuerySpotOrdersByHashesResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSpotOrdersByHashesMethod(), responseObserver);
    }

    /**
     * <pre>
     * Retrieves subaccount's orders
     * </pre>
     */
    default void subaccountOrders(injective.exchange.v1beta1.QueryOuterClass.QuerySubaccountOrdersRequest request,
        io.grpc.stub.StreamObserver<injective.exchange.v1beta1.QueryOuterClass.QuerySubaccountOrdersResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSubaccountOrdersMethod(), responseObserver);
    }

    /**
     * <pre>
     * Retrieves a trader's transient spot orders
     * </pre>
     */
    default void traderSpotTransientOrders(injective.exchange.v1beta1.QueryOuterClass.QueryTraderSpotOrdersRequest request,
        io.grpc.stub.StreamObserver<injective.exchange.v1beta1.QueryOuterClass.QueryTraderSpotOrdersResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getTraderSpotTransientOrdersMethod(), responseObserver);
    }

    /**
     * <pre>
     * Retrieves a spot market's mid-price
     * </pre>
     */
    default void spotMidPriceAndTOB(injective.exchange.v1beta1.QueryOuterClass.QuerySpotMidPriceAndTOBRequest request,
        io.grpc.stub.StreamObserver<injective.exchange.v1beta1.QueryOuterClass.QuerySpotMidPriceAndTOBResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSpotMidPriceAndTOBMethod(), responseObserver);
    }

    /**
     * <pre>
     * Retrieves a derivative market's mid-price
     * </pre>
     */
    default void derivativeMidPriceAndTOB(injective.exchange.v1beta1.QueryOuterClass.QueryDerivativeMidPriceAndTOBRequest request,
        io.grpc.stub.StreamObserver<injective.exchange.v1beta1.QueryOuterClass.QueryDerivativeMidPriceAndTOBResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDerivativeMidPriceAndTOBMethod(), responseObserver);
    }

    /**
     * <pre>
     * Retrieves a derivative market's orderbook by marketID
     * </pre>
     */
    default void derivativeOrderbook(injective.exchange.v1beta1.QueryOuterClass.QueryDerivativeOrderbookRequest request,
        io.grpc.stub.StreamObserver<injective.exchange.v1beta1.QueryOuterClass.QueryDerivativeOrderbookResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDerivativeOrderbookMethod(), responseObserver);
    }

    /**
     * <pre>
     * Retrieves a trader's derivative orders
     * </pre>
     */
    default void traderDerivativeOrders(injective.exchange.v1beta1.QueryOuterClass.QueryTraderDerivativeOrdersRequest request,
        io.grpc.stub.StreamObserver<injective.exchange.v1beta1.QueryOuterClass.QueryTraderDerivativeOrdersResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getTraderDerivativeOrdersMethod(), responseObserver);
    }

    /**
     * <pre>
     * Retrieves all account address derivative orders
     * </pre>
     */
    default void accountAddressDerivativeOrders(injective.exchange.v1beta1.QueryOuterClass.QueryAccountAddressDerivativeOrdersRequest request,
        io.grpc.stub.StreamObserver<injective.exchange.v1beta1.QueryOuterClass.QueryAccountAddressDerivativeOrdersResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getAccountAddressDerivativeOrdersMethod(), responseObserver);
    }

    /**
     * <pre>
     * Retrieves a trader's derivative orders
     * </pre>
     */
    default void derivativeOrdersByHashes(injective.exchange.v1beta1.QueryOuterClass.QueryDerivativeOrdersByHashesRequest request,
        io.grpc.stub.StreamObserver<injective.exchange.v1beta1.QueryOuterClass.QueryDerivativeOrdersByHashesResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDerivativeOrdersByHashesMethod(), responseObserver);
    }

    /**
     * <pre>
     * Retrieves a trader's transient derivative orders
     * </pre>
     */
    default void traderDerivativeTransientOrders(injective.exchange.v1beta1.QueryOuterClass.QueryTraderDerivativeOrdersRequest request,
        io.grpc.stub.StreamObserver<injective.exchange.v1beta1.QueryOuterClass.QueryTraderDerivativeOrdersResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getTraderDerivativeTransientOrdersMethod(), responseObserver);
    }

    /**
     * <pre>
     * Retrieves a list of derivative markets.
     * </pre>
     */
    default void derivativeMarkets(injective.exchange.v1beta1.QueryOuterClass.QueryDerivativeMarketsRequest request,
        io.grpc.stub.StreamObserver<injective.exchange.v1beta1.QueryOuterClass.QueryDerivativeMarketsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDerivativeMarketsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Retrieves a derivative market by ticker
     * </pre>
     */
    default void derivativeMarket(injective.exchange.v1beta1.QueryOuterClass.QueryDerivativeMarketRequest request,
        io.grpc.stub.StreamObserver<injective.exchange.v1beta1.QueryOuterClass.QueryDerivativeMarketResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDerivativeMarketMethod(), responseObserver);
    }

    /**
     * <pre>
     * Retrieves a derivative market's corresponding address for fees that
     * contribute to the market's insurance fund
     * </pre>
     */
    default void derivativeMarketAddress(injective.exchange.v1beta1.QueryOuterClass.QueryDerivativeMarketAddressRequest request,
        io.grpc.stub.StreamObserver<injective.exchange.v1beta1.QueryOuterClass.QueryDerivativeMarketAddressResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDerivativeMarketAddressMethod(), responseObserver);
    }

    /**
     * <pre>
     * Retrieves a subaccount's trade nonce
     * </pre>
     */
    default void subaccountTradeNonce(injective.exchange.v1beta1.QueryOuterClass.QuerySubaccountTradeNonceRequest request,
        io.grpc.stub.StreamObserver<injective.exchange.v1beta1.QueryOuterClass.QuerySubaccountTradeNonceResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSubaccountTradeNonceMethod(), responseObserver);
    }

    /**
     * <pre>
     * Retrieves the entire exchange module's state
     * </pre>
     */
    default void exchangeModuleState(injective.exchange.v1beta1.QueryOuterClass.QueryModuleStateRequest request,
        io.grpc.stub.StreamObserver<injective.exchange.v1beta1.QueryOuterClass.QueryModuleStateResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getExchangeModuleStateMethod(), responseObserver);
    }

    /**
     * <pre>
     * Retrieves the entire exchange module's positions
     * </pre>
     */
    default void positions(injective.exchange.v1beta1.QueryOuterClass.QueryPositionsRequest request,
        io.grpc.stub.StreamObserver<injective.exchange.v1beta1.QueryOuterClass.QueryPositionsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getPositionsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Retrieves subaccount's positions
     * </pre>
     */
    default void subaccountPositions(injective.exchange.v1beta1.QueryOuterClass.QuerySubaccountPositionsRequest request,
        io.grpc.stub.StreamObserver<injective.exchange.v1beta1.QueryOuterClass.QuerySubaccountPositionsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSubaccountPositionsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Retrieves subaccount's position in market
     * </pre>
     */
    default void subaccountPositionInMarket(injective.exchange.v1beta1.QueryOuterClass.QuerySubaccountPositionInMarketRequest request,
        io.grpc.stub.StreamObserver<injective.exchange.v1beta1.QueryOuterClass.QuerySubaccountPositionInMarketResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSubaccountPositionInMarketMethod(), responseObserver);
    }

    /**
     * <pre>
     * Retrieves subaccount's position in market
     * </pre>
     */
    default void subaccountEffectivePositionInMarket(injective.exchange.v1beta1.QueryOuterClass.QuerySubaccountEffectivePositionInMarketRequest request,
        io.grpc.stub.StreamObserver<injective.exchange.v1beta1.QueryOuterClass.QuerySubaccountEffectivePositionInMarketResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSubaccountEffectivePositionInMarketMethod(), responseObserver);
    }

    /**
     * <pre>
     * Retrieves perpetual market info
     * </pre>
     */
    default void perpetualMarketInfo(injective.exchange.v1beta1.QueryOuterClass.QueryPerpetualMarketInfoRequest request,
        io.grpc.stub.StreamObserver<injective.exchange.v1beta1.QueryOuterClass.QueryPerpetualMarketInfoResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getPerpetualMarketInfoMethod(), responseObserver);
    }

    /**
     * <pre>
     * Retrieves expiry market info
     * </pre>
     */
    default void expiryFuturesMarketInfo(injective.exchange.v1beta1.QueryOuterClass.QueryExpiryFuturesMarketInfoRequest request,
        io.grpc.stub.StreamObserver<injective.exchange.v1beta1.QueryOuterClass.QueryExpiryFuturesMarketInfoResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getExpiryFuturesMarketInfoMethod(), responseObserver);
    }

    /**
     * <pre>
     * Retrieves perpetual market funding
     * </pre>
     */
    default void perpetualMarketFunding(injective.exchange.v1beta1.QueryOuterClass.QueryPerpetualMarketFundingRequest request,
        io.grpc.stub.StreamObserver<injective.exchange.v1beta1.QueryOuterClass.QueryPerpetualMarketFundingResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getPerpetualMarketFundingMethod(), responseObserver);
    }

    /**
     * <pre>
     * Retrieves subaccount's order metadata
     * </pre>
     */
    default void subaccountOrderMetadata(injective.exchange.v1beta1.QueryOuterClass.QuerySubaccountOrderMetadataRequest request,
        io.grpc.stub.StreamObserver<injective.exchange.v1beta1.QueryOuterClass.QuerySubaccountOrderMetadataResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSubaccountOrderMetadataMethod(), responseObserver);
    }

    /**
     * <pre>
     * Retrieves the account and total trade rewards points
     * </pre>
     */
    default void tradeRewardPoints(injective.exchange.v1beta1.QueryOuterClass.QueryTradeRewardPointsRequest request,
        io.grpc.stub.StreamObserver<injective.exchange.v1beta1.QueryOuterClass.QueryTradeRewardPointsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getTradeRewardPointsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Retrieves the pending account and total trade rewards points
     * </pre>
     */
    default void pendingTradeRewardPoints(injective.exchange.v1beta1.QueryOuterClass.QueryTradeRewardPointsRequest request,
        io.grpc.stub.StreamObserver<injective.exchange.v1beta1.QueryOuterClass.QueryTradeRewardPointsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getPendingTradeRewardPointsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Retrieves the trade reward campaign
     * </pre>
     */
    default void tradeRewardCampaign(injective.exchange.v1beta1.QueryOuterClass.QueryTradeRewardCampaignRequest request,
        io.grpc.stub.StreamObserver<injective.exchange.v1beta1.QueryOuterClass.QueryTradeRewardCampaignResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getTradeRewardCampaignMethod(), responseObserver);
    }

    /**
     * <pre>
     * Retrieves the account's fee discount info
     * </pre>
     */
    default void feeDiscountAccountInfo(injective.exchange.v1beta1.QueryOuterClass.QueryFeeDiscountAccountInfoRequest request,
        io.grpc.stub.StreamObserver<injective.exchange.v1beta1.QueryOuterClass.QueryFeeDiscountAccountInfoResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getFeeDiscountAccountInfoMethod(), responseObserver);
    }

    /**
     * <pre>
     * Retrieves the fee discount schedule
     * </pre>
     */
    default void feeDiscountSchedule(injective.exchange.v1beta1.QueryOuterClass.QueryFeeDiscountScheduleRequest request,
        io.grpc.stub.StreamObserver<injective.exchange.v1beta1.QueryOuterClass.QueryFeeDiscountScheduleResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getFeeDiscountScheduleMethod(), responseObserver);
    }

    /**
     * <pre>
     * Retrieves mismatches between available vs. total balance
     * </pre>
     */
    default void balanceMismatches(injective.exchange.v1beta1.QueryOuterClass.QueryBalanceMismatchesRequest request,
        io.grpc.stub.StreamObserver<injective.exchange.v1beta1.QueryOuterClass.QueryBalanceMismatchesResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getBalanceMismatchesMethod(), responseObserver);
    }

    /**
     * <pre>
     * Retrieves available and total balances with balance holds
     * </pre>
     */
    default void balanceWithBalanceHolds(injective.exchange.v1beta1.QueryOuterClass.QueryBalanceWithBalanceHoldsRequest request,
        io.grpc.stub.StreamObserver<injective.exchange.v1beta1.QueryOuterClass.QueryBalanceWithBalanceHoldsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getBalanceWithBalanceHoldsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Retrieves fee discount tier stats
     * </pre>
     */
    default void feeDiscountTierStatistics(injective.exchange.v1beta1.QueryOuterClass.QueryFeeDiscountTierStatisticsRequest request,
        io.grpc.stub.StreamObserver<injective.exchange.v1beta1.QueryOuterClass.QueryFeeDiscountTierStatisticsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getFeeDiscountTierStatisticsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Retrieves market making pool info
     * </pre>
     */
    default void mitoVaultInfos(injective.exchange.v1beta1.QueryOuterClass.MitoVaultInfosRequest request,
        io.grpc.stub.StreamObserver<injective.exchange.v1beta1.QueryOuterClass.MitoVaultInfosResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getMitoVaultInfosMethod(), responseObserver);
    }

    /**
     * <pre>
     * QueryMarketIDFromVault returns the market ID for a given vault subaccount
     * ID
     * </pre>
     */
    default void queryMarketIDFromVault(injective.exchange.v1beta1.QueryOuterClass.QueryMarketIDFromVaultRequest request,
        io.grpc.stub.StreamObserver<injective.exchange.v1beta1.QueryOuterClass.QueryMarketIDFromVaultResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getQueryMarketIDFromVaultMethod(), responseObserver);
    }

    /**
     * <pre>
     * Retrieves historical trade records for a given market ID
     * </pre>
     */
    default void historicalTradeRecords(injective.exchange.v1beta1.QueryOuterClass.QueryHistoricalTradeRecordsRequest request,
        io.grpc.stub.StreamObserver<injective.exchange.v1beta1.QueryOuterClass.QueryHistoricalTradeRecordsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getHistoricalTradeRecordsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Retrieves if the account is opted out of rewards
     * </pre>
     */
    default void isOptedOutOfRewards(injective.exchange.v1beta1.QueryOuterClass.QueryIsOptedOutOfRewardsRequest request,
        io.grpc.stub.StreamObserver<injective.exchange.v1beta1.QueryOuterClass.QueryIsOptedOutOfRewardsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getIsOptedOutOfRewardsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Retrieves all accounts opted out of rewards
     * </pre>
     */
    default void optedOutOfRewardsAccounts(injective.exchange.v1beta1.QueryOuterClass.QueryOptedOutOfRewardsAccountsRequest request,
        io.grpc.stub.StreamObserver<injective.exchange.v1beta1.QueryOuterClass.QueryOptedOutOfRewardsAccountsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getOptedOutOfRewardsAccountsMethod(), responseObserver);
    }

    /**
     * <pre>
     * MarketVolatility computes the volatility for spot and derivative markets
     * trading history.
     * </pre>
     */
    default void marketVolatility(injective.exchange.v1beta1.QueryOuterClass.QueryMarketVolatilityRequest request,
        io.grpc.stub.StreamObserver<injective.exchange.v1beta1.QueryOuterClass.QueryMarketVolatilityResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getMarketVolatilityMethod(), responseObserver);
    }

    /**
     * <pre>
     * Retrieves a spot market's orderbook by marketID
     * </pre>
     */
    default void binaryOptionsMarkets(injective.exchange.v1beta1.QueryOuterClass.QueryBinaryMarketsRequest request,
        io.grpc.stub.StreamObserver<injective.exchange.v1beta1.QueryOuterClass.QueryBinaryMarketsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getBinaryOptionsMarketsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Retrieves a trader's derivative conditional orders
     * </pre>
     */
    default void traderDerivativeConditionalOrders(injective.exchange.v1beta1.QueryOuterClass.QueryTraderDerivativeConditionalOrdersRequest request,
        io.grpc.stub.StreamObserver<injective.exchange.v1beta1.QueryOuterClass.QueryTraderDerivativeConditionalOrdersResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getTraderDerivativeConditionalOrdersMethod(), responseObserver);
    }

    /**
     */
    default void marketAtomicExecutionFeeMultiplier(injective.exchange.v1beta1.QueryOuterClass.QueryMarketAtomicExecutionFeeMultiplierRequest request,
        io.grpc.stub.StreamObserver<injective.exchange.v1beta1.QueryOuterClass.QueryMarketAtomicExecutionFeeMultiplierResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getMarketAtomicExecutionFeeMultiplierMethod(), responseObserver);
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
     * Retrieves exchange params
     * </pre>
     */
    public void queryExchangeParams(injective.exchange.v1beta1.QueryOuterClass.QueryExchangeParamsRequest request,
        io.grpc.stub.StreamObserver<injective.exchange.v1beta1.QueryOuterClass.QueryExchangeParamsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getQueryExchangeParamsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Retrieves a Subaccount's Deposits
     * </pre>
     */
    public void subaccountDeposits(injective.exchange.v1beta1.QueryOuterClass.QuerySubaccountDepositsRequest request,
        io.grpc.stub.StreamObserver<injective.exchange.v1beta1.QueryOuterClass.QuerySubaccountDepositsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSubaccountDepositsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Retrieves a Subaccount's Deposits
     * </pre>
     */
    public void subaccountDeposit(injective.exchange.v1beta1.QueryOuterClass.QuerySubaccountDepositRequest request,
        io.grpc.stub.StreamObserver<injective.exchange.v1beta1.QueryOuterClass.QuerySubaccountDepositResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSubaccountDepositMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Retrieves all of the balances of all users on the exchange.
     * </pre>
     */
    public void exchangeBalances(injective.exchange.v1beta1.QueryOuterClass.QueryExchangeBalancesRequest request,
        io.grpc.stub.StreamObserver<injective.exchange.v1beta1.QueryOuterClass.QueryExchangeBalancesResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getExchangeBalancesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Retrieves the aggregate volumes for the specified account or subaccount
     * </pre>
     */
    public void aggregateVolume(injective.exchange.v1beta1.QueryOuterClass.QueryAggregateVolumeRequest request,
        io.grpc.stub.StreamObserver<injective.exchange.v1beta1.QueryOuterClass.QueryAggregateVolumeResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getAggregateVolumeMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Retrieves the aggregate volumes for specified accounts
     * </pre>
     */
    public void aggregateVolumes(injective.exchange.v1beta1.QueryOuterClass.QueryAggregateVolumesRequest request,
        io.grpc.stub.StreamObserver<injective.exchange.v1beta1.QueryOuterClass.QueryAggregateVolumesResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getAggregateVolumesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Retrieves the aggregate volume for the specified market
     * </pre>
     */
    public void aggregateMarketVolume(injective.exchange.v1beta1.QueryOuterClass.QueryAggregateMarketVolumeRequest request,
        io.grpc.stub.StreamObserver<injective.exchange.v1beta1.QueryOuterClass.QueryAggregateMarketVolumeResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getAggregateMarketVolumeMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Retrieves the aggregate market volumes for specified markets
     * </pre>
     */
    public void aggregateMarketVolumes(injective.exchange.v1beta1.QueryOuterClass.QueryAggregateMarketVolumesRequest request,
        io.grpc.stub.StreamObserver<injective.exchange.v1beta1.QueryOuterClass.QueryAggregateMarketVolumesResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getAggregateMarketVolumesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Retrieves the denom decimals for a denom.
     * </pre>
     */
    public void denomDecimal(injective.exchange.v1beta1.QueryOuterClass.QueryDenomDecimalRequest request,
        io.grpc.stub.StreamObserver<injective.exchange.v1beta1.QueryOuterClass.QueryDenomDecimalResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDenomDecimalMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Retrieves the denom decimals for multiple denoms. Returns all denom
     * decimals if unspecified.
     * </pre>
     */
    public void denomDecimals(injective.exchange.v1beta1.QueryOuterClass.QueryDenomDecimalsRequest request,
        io.grpc.stub.StreamObserver<injective.exchange.v1beta1.QueryOuterClass.QueryDenomDecimalsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDenomDecimalsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Retrieves a list of spot markets.
     * </pre>
     */
    public void spotMarkets(injective.exchange.v1beta1.QueryOuterClass.QuerySpotMarketsRequest request,
        io.grpc.stub.StreamObserver<injective.exchange.v1beta1.QueryOuterClass.QuerySpotMarketsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSpotMarketsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Retrieves a spot market by ticker
     * </pre>
     */
    public void spotMarket(injective.exchange.v1beta1.QueryOuterClass.QuerySpotMarketRequest request,
        io.grpc.stub.StreamObserver<injective.exchange.v1beta1.QueryOuterClass.QuerySpotMarketResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSpotMarketMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Retrieves a list of spot markets with extra information.
     * </pre>
     */
    public void fullSpotMarkets(injective.exchange.v1beta1.QueryOuterClass.QueryFullSpotMarketsRequest request,
        io.grpc.stub.StreamObserver<injective.exchange.v1beta1.QueryOuterClass.QueryFullSpotMarketsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getFullSpotMarketsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Retrieves a spot market with extra information.
     * </pre>
     */
    public void fullSpotMarket(injective.exchange.v1beta1.QueryOuterClass.QueryFullSpotMarketRequest request,
        io.grpc.stub.StreamObserver<injective.exchange.v1beta1.QueryOuterClass.QueryFullSpotMarketResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getFullSpotMarketMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Retrieves a spot market's orderbook by marketID
     * </pre>
     */
    public void spotOrderbook(injective.exchange.v1beta1.QueryOuterClass.QuerySpotOrderbookRequest request,
        io.grpc.stub.StreamObserver<injective.exchange.v1beta1.QueryOuterClass.QuerySpotOrderbookResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSpotOrderbookMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Retrieves a trader's spot orders
     * </pre>
     */
    public void traderSpotOrders(injective.exchange.v1beta1.QueryOuterClass.QueryTraderSpotOrdersRequest request,
        io.grpc.stub.StreamObserver<injective.exchange.v1beta1.QueryOuterClass.QueryTraderSpotOrdersResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getTraderSpotOrdersMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Retrieves all account address spot orders
     * </pre>
     */
    public void accountAddressSpotOrders(injective.exchange.v1beta1.QueryOuterClass.QueryAccountAddressSpotOrdersRequest request,
        io.grpc.stub.StreamObserver<injective.exchange.v1beta1.QueryOuterClass.QueryAccountAddressSpotOrdersResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getAccountAddressSpotOrdersMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Retrieves spot orders corresponding to specified order hashes for a given
     * subaccountID and marketID
     * </pre>
     */
    public void spotOrdersByHashes(injective.exchange.v1beta1.QueryOuterClass.QuerySpotOrdersByHashesRequest request,
        io.grpc.stub.StreamObserver<injective.exchange.v1beta1.QueryOuterClass.QuerySpotOrdersByHashesResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSpotOrdersByHashesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Retrieves subaccount's orders
     * </pre>
     */
    public void subaccountOrders(injective.exchange.v1beta1.QueryOuterClass.QuerySubaccountOrdersRequest request,
        io.grpc.stub.StreamObserver<injective.exchange.v1beta1.QueryOuterClass.QuerySubaccountOrdersResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSubaccountOrdersMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Retrieves a trader's transient spot orders
     * </pre>
     */
    public void traderSpotTransientOrders(injective.exchange.v1beta1.QueryOuterClass.QueryTraderSpotOrdersRequest request,
        io.grpc.stub.StreamObserver<injective.exchange.v1beta1.QueryOuterClass.QueryTraderSpotOrdersResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getTraderSpotTransientOrdersMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Retrieves a spot market's mid-price
     * </pre>
     */
    public void spotMidPriceAndTOB(injective.exchange.v1beta1.QueryOuterClass.QuerySpotMidPriceAndTOBRequest request,
        io.grpc.stub.StreamObserver<injective.exchange.v1beta1.QueryOuterClass.QuerySpotMidPriceAndTOBResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSpotMidPriceAndTOBMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Retrieves a derivative market's mid-price
     * </pre>
     */
    public void derivativeMidPriceAndTOB(injective.exchange.v1beta1.QueryOuterClass.QueryDerivativeMidPriceAndTOBRequest request,
        io.grpc.stub.StreamObserver<injective.exchange.v1beta1.QueryOuterClass.QueryDerivativeMidPriceAndTOBResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDerivativeMidPriceAndTOBMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Retrieves a derivative market's orderbook by marketID
     * </pre>
     */
    public void derivativeOrderbook(injective.exchange.v1beta1.QueryOuterClass.QueryDerivativeOrderbookRequest request,
        io.grpc.stub.StreamObserver<injective.exchange.v1beta1.QueryOuterClass.QueryDerivativeOrderbookResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDerivativeOrderbookMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Retrieves a trader's derivative orders
     * </pre>
     */
    public void traderDerivativeOrders(injective.exchange.v1beta1.QueryOuterClass.QueryTraderDerivativeOrdersRequest request,
        io.grpc.stub.StreamObserver<injective.exchange.v1beta1.QueryOuterClass.QueryTraderDerivativeOrdersResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getTraderDerivativeOrdersMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Retrieves all account address derivative orders
     * </pre>
     */
    public void accountAddressDerivativeOrders(injective.exchange.v1beta1.QueryOuterClass.QueryAccountAddressDerivativeOrdersRequest request,
        io.grpc.stub.StreamObserver<injective.exchange.v1beta1.QueryOuterClass.QueryAccountAddressDerivativeOrdersResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getAccountAddressDerivativeOrdersMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Retrieves a trader's derivative orders
     * </pre>
     */
    public void derivativeOrdersByHashes(injective.exchange.v1beta1.QueryOuterClass.QueryDerivativeOrdersByHashesRequest request,
        io.grpc.stub.StreamObserver<injective.exchange.v1beta1.QueryOuterClass.QueryDerivativeOrdersByHashesResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDerivativeOrdersByHashesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Retrieves a trader's transient derivative orders
     * </pre>
     */
    public void traderDerivativeTransientOrders(injective.exchange.v1beta1.QueryOuterClass.QueryTraderDerivativeOrdersRequest request,
        io.grpc.stub.StreamObserver<injective.exchange.v1beta1.QueryOuterClass.QueryTraderDerivativeOrdersResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getTraderDerivativeTransientOrdersMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Retrieves a list of derivative markets.
     * </pre>
     */
    public void derivativeMarkets(injective.exchange.v1beta1.QueryOuterClass.QueryDerivativeMarketsRequest request,
        io.grpc.stub.StreamObserver<injective.exchange.v1beta1.QueryOuterClass.QueryDerivativeMarketsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDerivativeMarketsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Retrieves a derivative market by ticker
     * </pre>
     */
    public void derivativeMarket(injective.exchange.v1beta1.QueryOuterClass.QueryDerivativeMarketRequest request,
        io.grpc.stub.StreamObserver<injective.exchange.v1beta1.QueryOuterClass.QueryDerivativeMarketResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDerivativeMarketMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Retrieves a derivative market's corresponding address for fees that
     * contribute to the market's insurance fund
     * </pre>
     */
    public void derivativeMarketAddress(injective.exchange.v1beta1.QueryOuterClass.QueryDerivativeMarketAddressRequest request,
        io.grpc.stub.StreamObserver<injective.exchange.v1beta1.QueryOuterClass.QueryDerivativeMarketAddressResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDerivativeMarketAddressMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Retrieves a subaccount's trade nonce
     * </pre>
     */
    public void subaccountTradeNonce(injective.exchange.v1beta1.QueryOuterClass.QuerySubaccountTradeNonceRequest request,
        io.grpc.stub.StreamObserver<injective.exchange.v1beta1.QueryOuterClass.QuerySubaccountTradeNonceResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSubaccountTradeNonceMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Retrieves the entire exchange module's state
     * </pre>
     */
    public void exchangeModuleState(injective.exchange.v1beta1.QueryOuterClass.QueryModuleStateRequest request,
        io.grpc.stub.StreamObserver<injective.exchange.v1beta1.QueryOuterClass.QueryModuleStateResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getExchangeModuleStateMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Retrieves the entire exchange module's positions
     * </pre>
     */
    public void positions(injective.exchange.v1beta1.QueryOuterClass.QueryPositionsRequest request,
        io.grpc.stub.StreamObserver<injective.exchange.v1beta1.QueryOuterClass.QueryPositionsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getPositionsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Retrieves subaccount's positions
     * </pre>
     */
    public void subaccountPositions(injective.exchange.v1beta1.QueryOuterClass.QuerySubaccountPositionsRequest request,
        io.grpc.stub.StreamObserver<injective.exchange.v1beta1.QueryOuterClass.QuerySubaccountPositionsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSubaccountPositionsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Retrieves subaccount's position in market
     * </pre>
     */
    public void subaccountPositionInMarket(injective.exchange.v1beta1.QueryOuterClass.QuerySubaccountPositionInMarketRequest request,
        io.grpc.stub.StreamObserver<injective.exchange.v1beta1.QueryOuterClass.QuerySubaccountPositionInMarketResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSubaccountPositionInMarketMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Retrieves subaccount's position in market
     * </pre>
     */
    public void subaccountEffectivePositionInMarket(injective.exchange.v1beta1.QueryOuterClass.QuerySubaccountEffectivePositionInMarketRequest request,
        io.grpc.stub.StreamObserver<injective.exchange.v1beta1.QueryOuterClass.QuerySubaccountEffectivePositionInMarketResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSubaccountEffectivePositionInMarketMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Retrieves perpetual market info
     * </pre>
     */
    public void perpetualMarketInfo(injective.exchange.v1beta1.QueryOuterClass.QueryPerpetualMarketInfoRequest request,
        io.grpc.stub.StreamObserver<injective.exchange.v1beta1.QueryOuterClass.QueryPerpetualMarketInfoResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getPerpetualMarketInfoMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Retrieves expiry market info
     * </pre>
     */
    public void expiryFuturesMarketInfo(injective.exchange.v1beta1.QueryOuterClass.QueryExpiryFuturesMarketInfoRequest request,
        io.grpc.stub.StreamObserver<injective.exchange.v1beta1.QueryOuterClass.QueryExpiryFuturesMarketInfoResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getExpiryFuturesMarketInfoMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Retrieves perpetual market funding
     * </pre>
     */
    public void perpetualMarketFunding(injective.exchange.v1beta1.QueryOuterClass.QueryPerpetualMarketFundingRequest request,
        io.grpc.stub.StreamObserver<injective.exchange.v1beta1.QueryOuterClass.QueryPerpetualMarketFundingResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getPerpetualMarketFundingMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Retrieves subaccount's order metadata
     * </pre>
     */
    public void subaccountOrderMetadata(injective.exchange.v1beta1.QueryOuterClass.QuerySubaccountOrderMetadataRequest request,
        io.grpc.stub.StreamObserver<injective.exchange.v1beta1.QueryOuterClass.QuerySubaccountOrderMetadataResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSubaccountOrderMetadataMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Retrieves the account and total trade rewards points
     * </pre>
     */
    public void tradeRewardPoints(injective.exchange.v1beta1.QueryOuterClass.QueryTradeRewardPointsRequest request,
        io.grpc.stub.StreamObserver<injective.exchange.v1beta1.QueryOuterClass.QueryTradeRewardPointsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getTradeRewardPointsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Retrieves the pending account and total trade rewards points
     * </pre>
     */
    public void pendingTradeRewardPoints(injective.exchange.v1beta1.QueryOuterClass.QueryTradeRewardPointsRequest request,
        io.grpc.stub.StreamObserver<injective.exchange.v1beta1.QueryOuterClass.QueryTradeRewardPointsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getPendingTradeRewardPointsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Retrieves the trade reward campaign
     * </pre>
     */
    public void tradeRewardCampaign(injective.exchange.v1beta1.QueryOuterClass.QueryTradeRewardCampaignRequest request,
        io.grpc.stub.StreamObserver<injective.exchange.v1beta1.QueryOuterClass.QueryTradeRewardCampaignResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getTradeRewardCampaignMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Retrieves the account's fee discount info
     * </pre>
     */
    public void feeDiscountAccountInfo(injective.exchange.v1beta1.QueryOuterClass.QueryFeeDiscountAccountInfoRequest request,
        io.grpc.stub.StreamObserver<injective.exchange.v1beta1.QueryOuterClass.QueryFeeDiscountAccountInfoResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getFeeDiscountAccountInfoMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Retrieves the fee discount schedule
     * </pre>
     */
    public void feeDiscountSchedule(injective.exchange.v1beta1.QueryOuterClass.QueryFeeDiscountScheduleRequest request,
        io.grpc.stub.StreamObserver<injective.exchange.v1beta1.QueryOuterClass.QueryFeeDiscountScheduleResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getFeeDiscountScheduleMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Retrieves mismatches between available vs. total balance
     * </pre>
     */
    public void balanceMismatches(injective.exchange.v1beta1.QueryOuterClass.QueryBalanceMismatchesRequest request,
        io.grpc.stub.StreamObserver<injective.exchange.v1beta1.QueryOuterClass.QueryBalanceMismatchesResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getBalanceMismatchesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Retrieves available and total balances with balance holds
     * </pre>
     */
    public void balanceWithBalanceHolds(injective.exchange.v1beta1.QueryOuterClass.QueryBalanceWithBalanceHoldsRequest request,
        io.grpc.stub.StreamObserver<injective.exchange.v1beta1.QueryOuterClass.QueryBalanceWithBalanceHoldsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getBalanceWithBalanceHoldsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Retrieves fee discount tier stats
     * </pre>
     */
    public void feeDiscountTierStatistics(injective.exchange.v1beta1.QueryOuterClass.QueryFeeDiscountTierStatisticsRequest request,
        io.grpc.stub.StreamObserver<injective.exchange.v1beta1.QueryOuterClass.QueryFeeDiscountTierStatisticsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getFeeDiscountTierStatisticsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Retrieves market making pool info
     * </pre>
     */
    public void mitoVaultInfos(injective.exchange.v1beta1.QueryOuterClass.MitoVaultInfosRequest request,
        io.grpc.stub.StreamObserver<injective.exchange.v1beta1.QueryOuterClass.MitoVaultInfosResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getMitoVaultInfosMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * QueryMarketIDFromVault returns the market ID for a given vault subaccount
     * ID
     * </pre>
     */
    public void queryMarketIDFromVault(injective.exchange.v1beta1.QueryOuterClass.QueryMarketIDFromVaultRequest request,
        io.grpc.stub.StreamObserver<injective.exchange.v1beta1.QueryOuterClass.QueryMarketIDFromVaultResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getQueryMarketIDFromVaultMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Retrieves historical trade records for a given market ID
     * </pre>
     */
    public void historicalTradeRecords(injective.exchange.v1beta1.QueryOuterClass.QueryHistoricalTradeRecordsRequest request,
        io.grpc.stub.StreamObserver<injective.exchange.v1beta1.QueryOuterClass.QueryHistoricalTradeRecordsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getHistoricalTradeRecordsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Retrieves if the account is opted out of rewards
     * </pre>
     */
    public void isOptedOutOfRewards(injective.exchange.v1beta1.QueryOuterClass.QueryIsOptedOutOfRewardsRequest request,
        io.grpc.stub.StreamObserver<injective.exchange.v1beta1.QueryOuterClass.QueryIsOptedOutOfRewardsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getIsOptedOutOfRewardsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Retrieves all accounts opted out of rewards
     * </pre>
     */
    public void optedOutOfRewardsAccounts(injective.exchange.v1beta1.QueryOuterClass.QueryOptedOutOfRewardsAccountsRequest request,
        io.grpc.stub.StreamObserver<injective.exchange.v1beta1.QueryOuterClass.QueryOptedOutOfRewardsAccountsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getOptedOutOfRewardsAccountsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * MarketVolatility computes the volatility for spot and derivative markets
     * trading history.
     * </pre>
     */
    public void marketVolatility(injective.exchange.v1beta1.QueryOuterClass.QueryMarketVolatilityRequest request,
        io.grpc.stub.StreamObserver<injective.exchange.v1beta1.QueryOuterClass.QueryMarketVolatilityResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getMarketVolatilityMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Retrieves a spot market's orderbook by marketID
     * </pre>
     */
    public void binaryOptionsMarkets(injective.exchange.v1beta1.QueryOuterClass.QueryBinaryMarketsRequest request,
        io.grpc.stub.StreamObserver<injective.exchange.v1beta1.QueryOuterClass.QueryBinaryMarketsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getBinaryOptionsMarketsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Retrieves a trader's derivative conditional orders
     * </pre>
     */
    public void traderDerivativeConditionalOrders(injective.exchange.v1beta1.QueryOuterClass.QueryTraderDerivativeConditionalOrdersRequest request,
        io.grpc.stub.StreamObserver<injective.exchange.v1beta1.QueryOuterClass.QueryTraderDerivativeConditionalOrdersResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getTraderDerivativeConditionalOrdersMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void marketAtomicExecutionFeeMultiplier(injective.exchange.v1beta1.QueryOuterClass.QueryMarketAtomicExecutionFeeMultiplierRequest request,
        io.grpc.stub.StreamObserver<injective.exchange.v1beta1.QueryOuterClass.QueryMarketAtomicExecutionFeeMultiplierResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getMarketAtomicExecutionFeeMultiplierMethod(), getCallOptions()), request, responseObserver);
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
     * Retrieves exchange params
     * </pre>
     */
    public injective.exchange.v1beta1.QueryOuterClass.QueryExchangeParamsResponse queryExchangeParams(injective.exchange.v1beta1.QueryOuterClass.QueryExchangeParamsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getQueryExchangeParamsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Retrieves a Subaccount's Deposits
     * </pre>
     */
    public injective.exchange.v1beta1.QueryOuterClass.QuerySubaccountDepositsResponse subaccountDeposits(injective.exchange.v1beta1.QueryOuterClass.QuerySubaccountDepositsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSubaccountDepositsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Retrieves a Subaccount's Deposits
     * </pre>
     */
    public injective.exchange.v1beta1.QueryOuterClass.QuerySubaccountDepositResponse subaccountDeposit(injective.exchange.v1beta1.QueryOuterClass.QuerySubaccountDepositRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSubaccountDepositMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Retrieves all of the balances of all users on the exchange.
     * </pre>
     */
    public injective.exchange.v1beta1.QueryOuterClass.QueryExchangeBalancesResponse exchangeBalances(injective.exchange.v1beta1.QueryOuterClass.QueryExchangeBalancesRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getExchangeBalancesMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Retrieves the aggregate volumes for the specified account or subaccount
     * </pre>
     */
    public injective.exchange.v1beta1.QueryOuterClass.QueryAggregateVolumeResponse aggregateVolume(injective.exchange.v1beta1.QueryOuterClass.QueryAggregateVolumeRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getAggregateVolumeMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Retrieves the aggregate volumes for specified accounts
     * </pre>
     */
    public injective.exchange.v1beta1.QueryOuterClass.QueryAggregateVolumesResponse aggregateVolumes(injective.exchange.v1beta1.QueryOuterClass.QueryAggregateVolumesRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getAggregateVolumesMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Retrieves the aggregate volume for the specified market
     * </pre>
     */
    public injective.exchange.v1beta1.QueryOuterClass.QueryAggregateMarketVolumeResponse aggregateMarketVolume(injective.exchange.v1beta1.QueryOuterClass.QueryAggregateMarketVolumeRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getAggregateMarketVolumeMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Retrieves the aggregate market volumes for specified markets
     * </pre>
     */
    public injective.exchange.v1beta1.QueryOuterClass.QueryAggregateMarketVolumesResponse aggregateMarketVolumes(injective.exchange.v1beta1.QueryOuterClass.QueryAggregateMarketVolumesRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getAggregateMarketVolumesMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Retrieves the denom decimals for a denom.
     * </pre>
     */
    public injective.exchange.v1beta1.QueryOuterClass.QueryDenomDecimalResponse denomDecimal(injective.exchange.v1beta1.QueryOuterClass.QueryDenomDecimalRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDenomDecimalMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Retrieves the denom decimals for multiple denoms. Returns all denom
     * decimals if unspecified.
     * </pre>
     */
    public injective.exchange.v1beta1.QueryOuterClass.QueryDenomDecimalsResponse denomDecimals(injective.exchange.v1beta1.QueryOuterClass.QueryDenomDecimalsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDenomDecimalsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Retrieves a list of spot markets.
     * </pre>
     */
    public injective.exchange.v1beta1.QueryOuterClass.QuerySpotMarketsResponse spotMarkets(injective.exchange.v1beta1.QueryOuterClass.QuerySpotMarketsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSpotMarketsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Retrieves a spot market by ticker
     * </pre>
     */
    public injective.exchange.v1beta1.QueryOuterClass.QuerySpotMarketResponse spotMarket(injective.exchange.v1beta1.QueryOuterClass.QuerySpotMarketRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSpotMarketMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Retrieves a list of spot markets with extra information.
     * </pre>
     */
    public injective.exchange.v1beta1.QueryOuterClass.QueryFullSpotMarketsResponse fullSpotMarkets(injective.exchange.v1beta1.QueryOuterClass.QueryFullSpotMarketsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getFullSpotMarketsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Retrieves a spot market with extra information.
     * </pre>
     */
    public injective.exchange.v1beta1.QueryOuterClass.QueryFullSpotMarketResponse fullSpotMarket(injective.exchange.v1beta1.QueryOuterClass.QueryFullSpotMarketRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getFullSpotMarketMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Retrieves a spot market's orderbook by marketID
     * </pre>
     */
    public injective.exchange.v1beta1.QueryOuterClass.QuerySpotOrderbookResponse spotOrderbook(injective.exchange.v1beta1.QueryOuterClass.QuerySpotOrderbookRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSpotOrderbookMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Retrieves a trader's spot orders
     * </pre>
     */
    public injective.exchange.v1beta1.QueryOuterClass.QueryTraderSpotOrdersResponse traderSpotOrders(injective.exchange.v1beta1.QueryOuterClass.QueryTraderSpotOrdersRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getTraderSpotOrdersMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Retrieves all account address spot orders
     * </pre>
     */
    public injective.exchange.v1beta1.QueryOuterClass.QueryAccountAddressSpotOrdersResponse accountAddressSpotOrders(injective.exchange.v1beta1.QueryOuterClass.QueryAccountAddressSpotOrdersRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getAccountAddressSpotOrdersMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Retrieves spot orders corresponding to specified order hashes for a given
     * subaccountID and marketID
     * </pre>
     */
    public injective.exchange.v1beta1.QueryOuterClass.QuerySpotOrdersByHashesResponse spotOrdersByHashes(injective.exchange.v1beta1.QueryOuterClass.QuerySpotOrdersByHashesRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSpotOrdersByHashesMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Retrieves subaccount's orders
     * </pre>
     */
    public injective.exchange.v1beta1.QueryOuterClass.QuerySubaccountOrdersResponse subaccountOrders(injective.exchange.v1beta1.QueryOuterClass.QuerySubaccountOrdersRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSubaccountOrdersMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Retrieves a trader's transient spot orders
     * </pre>
     */
    public injective.exchange.v1beta1.QueryOuterClass.QueryTraderSpotOrdersResponse traderSpotTransientOrders(injective.exchange.v1beta1.QueryOuterClass.QueryTraderSpotOrdersRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getTraderSpotTransientOrdersMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Retrieves a spot market's mid-price
     * </pre>
     */
    public injective.exchange.v1beta1.QueryOuterClass.QuerySpotMidPriceAndTOBResponse spotMidPriceAndTOB(injective.exchange.v1beta1.QueryOuterClass.QuerySpotMidPriceAndTOBRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSpotMidPriceAndTOBMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Retrieves a derivative market's mid-price
     * </pre>
     */
    public injective.exchange.v1beta1.QueryOuterClass.QueryDerivativeMidPriceAndTOBResponse derivativeMidPriceAndTOB(injective.exchange.v1beta1.QueryOuterClass.QueryDerivativeMidPriceAndTOBRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDerivativeMidPriceAndTOBMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Retrieves a derivative market's orderbook by marketID
     * </pre>
     */
    public injective.exchange.v1beta1.QueryOuterClass.QueryDerivativeOrderbookResponse derivativeOrderbook(injective.exchange.v1beta1.QueryOuterClass.QueryDerivativeOrderbookRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDerivativeOrderbookMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Retrieves a trader's derivative orders
     * </pre>
     */
    public injective.exchange.v1beta1.QueryOuterClass.QueryTraderDerivativeOrdersResponse traderDerivativeOrders(injective.exchange.v1beta1.QueryOuterClass.QueryTraderDerivativeOrdersRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getTraderDerivativeOrdersMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Retrieves all account address derivative orders
     * </pre>
     */
    public injective.exchange.v1beta1.QueryOuterClass.QueryAccountAddressDerivativeOrdersResponse accountAddressDerivativeOrders(injective.exchange.v1beta1.QueryOuterClass.QueryAccountAddressDerivativeOrdersRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getAccountAddressDerivativeOrdersMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Retrieves a trader's derivative orders
     * </pre>
     */
    public injective.exchange.v1beta1.QueryOuterClass.QueryDerivativeOrdersByHashesResponse derivativeOrdersByHashes(injective.exchange.v1beta1.QueryOuterClass.QueryDerivativeOrdersByHashesRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDerivativeOrdersByHashesMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Retrieves a trader's transient derivative orders
     * </pre>
     */
    public injective.exchange.v1beta1.QueryOuterClass.QueryTraderDerivativeOrdersResponse traderDerivativeTransientOrders(injective.exchange.v1beta1.QueryOuterClass.QueryTraderDerivativeOrdersRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getTraderDerivativeTransientOrdersMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Retrieves a list of derivative markets.
     * </pre>
     */
    public injective.exchange.v1beta1.QueryOuterClass.QueryDerivativeMarketsResponse derivativeMarkets(injective.exchange.v1beta1.QueryOuterClass.QueryDerivativeMarketsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDerivativeMarketsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Retrieves a derivative market by ticker
     * </pre>
     */
    public injective.exchange.v1beta1.QueryOuterClass.QueryDerivativeMarketResponse derivativeMarket(injective.exchange.v1beta1.QueryOuterClass.QueryDerivativeMarketRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDerivativeMarketMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Retrieves a derivative market's corresponding address for fees that
     * contribute to the market's insurance fund
     * </pre>
     */
    public injective.exchange.v1beta1.QueryOuterClass.QueryDerivativeMarketAddressResponse derivativeMarketAddress(injective.exchange.v1beta1.QueryOuterClass.QueryDerivativeMarketAddressRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDerivativeMarketAddressMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Retrieves a subaccount's trade nonce
     * </pre>
     */
    public injective.exchange.v1beta1.QueryOuterClass.QuerySubaccountTradeNonceResponse subaccountTradeNonce(injective.exchange.v1beta1.QueryOuterClass.QuerySubaccountTradeNonceRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSubaccountTradeNonceMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Retrieves the entire exchange module's state
     * </pre>
     */
    public injective.exchange.v1beta1.QueryOuterClass.QueryModuleStateResponse exchangeModuleState(injective.exchange.v1beta1.QueryOuterClass.QueryModuleStateRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getExchangeModuleStateMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Retrieves the entire exchange module's positions
     * </pre>
     */
    public injective.exchange.v1beta1.QueryOuterClass.QueryPositionsResponse positions(injective.exchange.v1beta1.QueryOuterClass.QueryPositionsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getPositionsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Retrieves subaccount's positions
     * </pre>
     */
    public injective.exchange.v1beta1.QueryOuterClass.QuerySubaccountPositionsResponse subaccountPositions(injective.exchange.v1beta1.QueryOuterClass.QuerySubaccountPositionsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSubaccountPositionsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Retrieves subaccount's position in market
     * </pre>
     */
    public injective.exchange.v1beta1.QueryOuterClass.QuerySubaccountPositionInMarketResponse subaccountPositionInMarket(injective.exchange.v1beta1.QueryOuterClass.QuerySubaccountPositionInMarketRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSubaccountPositionInMarketMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Retrieves subaccount's position in market
     * </pre>
     */
    public injective.exchange.v1beta1.QueryOuterClass.QuerySubaccountEffectivePositionInMarketResponse subaccountEffectivePositionInMarket(injective.exchange.v1beta1.QueryOuterClass.QuerySubaccountEffectivePositionInMarketRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSubaccountEffectivePositionInMarketMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Retrieves perpetual market info
     * </pre>
     */
    public injective.exchange.v1beta1.QueryOuterClass.QueryPerpetualMarketInfoResponse perpetualMarketInfo(injective.exchange.v1beta1.QueryOuterClass.QueryPerpetualMarketInfoRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getPerpetualMarketInfoMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Retrieves expiry market info
     * </pre>
     */
    public injective.exchange.v1beta1.QueryOuterClass.QueryExpiryFuturesMarketInfoResponse expiryFuturesMarketInfo(injective.exchange.v1beta1.QueryOuterClass.QueryExpiryFuturesMarketInfoRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getExpiryFuturesMarketInfoMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Retrieves perpetual market funding
     * </pre>
     */
    public injective.exchange.v1beta1.QueryOuterClass.QueryPerpetualMarketFundingResponse perpetualMarketFunding(injective.exchange.v1beta1.QueryOuterClass.QueryPerpetualMarketFundingRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getPerpetualMarketFundingMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Retrieves subaccount's order metadata
     * </pre>
     */
    public injective.exchange.v1beta1.QueryOuterClass.QuerySubaccountOrderMetadataResponse subaccountOrderMetadata(injective.exchange.v1beta1.QueryOuterClass.QuerySubaccountOrderMetadataRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSubaccountOrderMetadataMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Retrieves the account and total trade rewards points
     * </pre>
     */
    public injective.exchange.v1beta1.QueryOuterClass.QueryTradeRewardPointsResponse tradeRewardPoints(injective.exchange.v1beta1.QueryOuterClass.QueryTradeRewardPointsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getTradeRewardPointsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Retrieves the pending account and total trade rewards points
     * </pre>
     */
    public injective.exchange.v1beta1.QueryOuterClass.QueryTradeRewardPointsResponse pendingTradeRewardPoints(injective.exchange.v1beta1.QueryOuterClass.QueryTradeRewardPointsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getPendingTradeRewardPointsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Retrieves the trade reward campaign
     * </pre>
     */
    public injective.exchange.v1beta1.QueryOuterClass.QueryTradeRewardCampaignResponse tradeRewardCampaign(injective.exchange.v1beta1.QueryOuterClass.QueryTradeRewardCampaignRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getTradeRewardCampaignMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Retrieves the account's fee discount info
     * </pre>
     */
    public injective.exchange.v1beta1.QueryOuterClass.QueryFeeDiscountAccountInfoResponse feeDiscountAccountInfo(injective.exchange.v1beta1.QueryOuterClass.QueryFeeDiscountAccountInfoRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getFeeDiscountAccountInfoMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Retrieves the fee discount schedule
     * </pre>
     */
    public injective.exchange.v1beta1.QueryOuterClass.QueryFeeDiscountScheduleResponse feeDiscountSchedule(injective.exchange.v1beta1.QueryOuterClass.QueryFeeDiscountScheduleRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getFeeDiscountScheduleMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Retrieves mismatches between available vs. total balance
     * </pre>
     */
    public injective.exchange.v1beta1.QueryOuterClass.QueryBalanceMismatchesResponse balanceMismatches(injective.exchange.v1beta1.QueryOuterClass.QueryBalanceMismatchesRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getBalanceMismatchesMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Retrieves available and total balances with balance holds
     * </pre>
     */
    public injective.exchange.v1beta1.QueryOuterClass.QueryBalanceWithBalanceHoldsResponse balanceWithBalanceHolds(injective.exchange.v1beta1.QueryOuterClass.QueryBalanceWithBalanceHoldsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getBalanceWithBalanceHoldsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Retrieves fee discount tier stats
     * </pre>
     */
    public injective.exchange.v1beta1.QueryOuterClass.QueryFeeDiscountTierStatisticsResponse feeDiscountTierStatistics(injective.exchange.v1beta1.QueryOuterClass.QueryFeeDiscountTierStatisticsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getFeeDiscountTierStatisticsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Retrieves market making pool info
     * </pre>
     */
    public injective.exchange.v1beta1.QueryOuterClass.MitoVaultInfosResponse mitoVaultInfos(injective.exchange.v1beta1.QueryOuterClass.MitoVaultInfosRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getMitoVaultInfosMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * QueryMarketIDFromVault returns the market ID for a given vault subaccount
     * ID
     * </pre>
     */
    public injective.exchange.v1beta1.QueryOuterClass.QueryMarketIDFromVaultResponse queryMarketIDFromVault(injective.exchange.v1beta1.QueryOuterClass.QueryMarketIDFromVaultRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getQueryMarketIDFromVaultMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Retrieves historical trade records for a given market ID
     * </pre>
     */
    public injective.exchange.v1beta1.QueryOuterClass.QueryHistoricalTradeRecordsResponse historicalTradeRecords(injective.exchange.v1beta1.QueryOuterClass.QueryHistoricalTradeRecordsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getHistoricalTradeRecordsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Retrieves if the account is opted out of rewards
     * </pre>
     */
    public injective.exchange.v1beta1.QueryOuterClass.QueryIsOptedOutOfRewardsResponse isOptedOutOfRewards(injective.exchange.v1beta1.QueryOuterClass.QueryIsOptedOutOfRewardsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getIsOptedOutOfRewardsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Retrieves all accounts opted out of rewards
     * </pre>
     */
    public injective.exchange.v1beta1.QueryOuterClass.QueryOptedOutOfRewardsAccountsResponse optedOutOfRewardsAccounts(injective.exchange.v1beta1.QueryOuterClass.QueryOptedOutOfRewardsAccountsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getOptedOutOfRewardsAccountsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * MarketVolatility computes the volatility for spot and derivative markets
     * trading history.
     * </pre>
     */
    public injective.exchange.v1beta1.QueryOuterClass.QueryMarketVolatilityResponse marketVolatility(injective.exchange.v1beta1.QueryOuterClass.QueryMarketVolatilityRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getMarketVolatilityMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Retrieves a spot market's orderbook by marketID
     * </pre>
     */
    public injective.exchange.v1beta1.QueryOuterClass.QueryBinaryMarketsResponse binaryOptionsMarkets(injective.exchange.v1beta1.QueryOuterClass.QueryBinaryMarketsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getBinaryOptionsMarketsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Retrieves a trader's derivative conditional orders
     * </pre>
     */
    public injective.exchange.v1beta1.QueryOuterClass.QueryTraderDerivativeConditionalOrdersResponse traderDerivativeConditionalOrders(injective.exchange.v1beta1.QueryOuterClass.QueryTraderDerivativeConditionalOrdersRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getTraderDerivativeConditionalOrdersMethod(), getCallOptions(), request);
    }

    /**
     */
    public injective.exchange.v1beta1.QueryOuterClass.QueryMarketAtomicExecutionFeeMultiplierResponse marketAtomicExecutionFeeMultiplier(injective.exchange.v1beta1.QueryOuterClass.QueryMarketAtomicExecutionFeeMultiplierRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getMarketAtomicExecutionFeeMultiplierMethod(), getCallOptions(), request);
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
     * Retrieves exchange params
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<injective.exchange.v1beta1.QueryOuterClass.QueryExchangeParamsResponse> queryExchangeParams(
        injective.exchange.v1beta1.QueryOuterClass.QueryExchangeParamsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getQueryExchangeParamsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Retrieves a Subaccount's Deposits
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<injective.exchange.v1beta1.QueryOuterClass.QuerySubaccountDepositsResponse> subaccountDeposits(
        injective.exchange.v1beta1.QueryOuterClass.QuerySubaccountDepositsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSubaccountDepositsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Retrieves a Subaccount's Deposits
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<injective.exchange.v1beta1.QueryOuterClass.QuerySubaccountDepositResponse> subaccountDeposit(
        injective.exchange.v1beta1.QueryOuterClass.QuerySubaccountDepositRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSubaccountDepositMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Retrieves all of the balances of all users on the exchange.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<injective.exchange.v1beta1.QueryOuterClass.QueryExchangeBalancesResponse> exchangeBalances(
        injective.exchange.v1beta1.QueryOuterClass.QueryExchangeBalancesRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getExchangeBalancesMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Retrieves the aggregate volumes for the specified account or subaccount
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<injective.exchange.v1beta1.QueryOuterClass.QueryAggregateVolumeResponse> aggregateVolume(
        injective.exchange.v1beta1.QueryOuterClass.QueryAggregateVolumeRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getAggregateVolumeMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Retrieves the aggregate volumes for specified accounts
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<injective.exchange.v1beta1.QueryOuterClass.QueryAggregateVolumesResponse> aggregateVolumes(
        injective.exchange.v1beta1.QueryOuterClass.QueryAggregateVolumesRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getAggregateVolumesMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Retrieves the aggregate volume for the specified market
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<injective.exchange.v1beta1.QueryOuterClass.QueryAggregateMarketVolumeResponse> aggregateMarketVolume(
        injective.exchange.v1beta1.QueryOuterClass.QueryAggregateMarketVolumeRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getAggregateMarketVolumeMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Retrieves the aggregate market volumes for specified markets
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<injective.exchange.v1beta1.QueryOuterClass.QueryAggregateMarketVolumesResponse> aggregateMarketVolumes(
        injective.exchange.v1beta1.QueryOuterClass.QueryAggregateMarketVolumesRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getAggregateMarketVolumesMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Retrieves the denom decimals for a denom.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<injective.exchange.v1beta1.QueryOuterClass.QueryDenomDecimalResponse> denomDecimal(
        injective.exchange.v1beta1.QueryOuterClass.QueryDenomDecimalRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDenomDecimalMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Retrieves the denom decimals for multiple denoms. Returns all denom
     * decimals if unspecified.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<injective.exchange.v1beta1.QueryOuterClass.QueryDenomDecimalsResponse> denomDecimals(
        injective.exchange.v1beta1.QueryOuterClass.QueryDenomDecimalsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDenomDecimalsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Retrieves a list of spot markets.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<injective.exchange.v1beta1.QueryOuterClass.QuerySpotMarketsResponse> spotMarkets(
        injective.exchange.v1beta1.QueryOuterClass.QuerySpotMarketsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSpotMarketsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Retrieves a spot market by ticker
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<injective.exchange.v1beta1.QueryOuterClass.QuerySpotMarketResponse> spotMarket(
        injective.exchange.v1beta1.QueryOuterClass.QuerySpotMarketRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSpotMarketMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Retrieves a list of spot markets with extra information.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<injective.exchange.v1beta1.QueryOuterClass.QueryFullSpotMarketsResponse> fullSpotMarkets(
        injective.exchange.v1beta1.QueryOuterClass.QueryFullSpotMarketsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getFullSpotMarketsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Retrieves a spot market with extra information.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<injective.exchange.v1beta1.QueryOuterClass.QueryFullSpotMarketResponse> fullSpotMarket(
        injective.exchange.v1beta1.QueryOuterClass.QueryFullSpotMarketRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getFullSpotMarketMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Retrieves a spot market's orderbook by marketID
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<injective.exchange.v1beta1.QueryOuterClass.QuerySpotOrderbookResponse> spotOrderbook(
        injective.exchange.v1beta1.QueryOuterClass.QuerySpotOrderbookRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSpotOrderbookMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Retrieves a trader's spot orders
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<injective.exchange.v1beta1.QueryOuterClass.QueryTraderSpotOrdersResponse> traderSpotOrders(
        injective.exchange.v1beta1.QueryOuterClass.QueryTraderSpotOrdersRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getTraderSpotOrdersMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Retrieves all account address spot orders
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<injective.exchange.v1beta1.QueryOuterClass.QueryAccountAddressSpotOrdersResponse> accountAddressSpotOrders(
        injective.exchange.v1beta1.QueryOuterClass.QueryAccountAddressSpotOrdersRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getAccountAddressSpotOrdersMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Retrieves spot orders corresponding to specified order hashes for a given
     * subaccountID and marketID
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<injective.exchange.v1beta1.QueryOuterClass.QuerySpotOrdersByHashesResponse> spotOrdersByHashes(
        injective.exchange.v1beta1.QueryOuterClass.QuerySpotOrdersByHashesRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSpotOrdersByHashesMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Retrieves subaccount's orders
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<injective.exchange.v1beta1.QueryOuterClass.QuerySubaccountOrdersResponse> subaccountOrders(
        injective.exchange.v1beta1.QueryOuterClass.QuerySubaccountOrdersRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSubaccountOrdersMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Retrieves a trader's transient spot orders
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<injective.exchange.v1beta1.QueryOuterClass.QueryTraderSpotOrdersResponse> traderSpotTransientOrders(
        injective.exchange.v1beta1.QueryOuterClass.QueryTraderSpotOrdersRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getTraderSpotTransientOrdersMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Retrieves a spot market's mid-price
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<injective.exchange.v1beta1.QueryOuterClass.QuerySpotMidPriceAndTOBResponse> spotMidPriceAndTOB(
        injective.exchange.v1beta1.QueryOuterClass.QuerySpotMidPriceAndTOBRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSpotMidPriceAndTOBMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Retrieves a derivative market's mid-price
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<injective.exchange.v1beta1.QueryOuterClass.QueryDerivativeMidPriceAndTOBResponse> derivativeMidPriceAndTOB(
        injective.exchange.v1beta1.QueryOuterClass.QueryDerivativeMidPriceAndTOBRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDerivativeMidPriceAndTOBMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Retrieves a derivative market's orderbook by marketID
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<injective.exchange.v1beta1.QueryOuterClass.QueryDerivativeOrderbookResponse> derivativeOrderbook(
        injective.exchange.v1beta1.QueryOuterClass.QueryDerivativeOrderbookRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDerivativeOrderbookMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Retrieves a trader's derivative orders
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<injective.exchange.v1beta1.QueryOuterClass.QueryTraderDerivativeOrdersResponse> traderDerivativeOrders(
        injective.exchange.v1beta1.QueryOuterClass.QueryTraderDerivativeOrdersRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getTraderDerivativeOrdersMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Retrieves all account address derivative orders
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<injective.exchange.v1beta1.QueryOuterClass.QueryAccountAddressDerivativeOrdersResponse> accountAddressDerivativeOrders(
        injective.exchange.v1beta1.QueryOuterClass.QueryAccountAddressDerivativeOrdersRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getAccountAddressDerivativeOrdersMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Retrieves a trader's derivative orders
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<injective.exchange.v1beta1.QueryOuterClass.QueryDerivativeOrdersByHashesResponse> derivativeOrdersByHashes(
        injective.exchange.v1beta1.QueryOuterClass.QueryDerivativeOrdersByHashesRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDerivativeOrdersByHashesMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Retrieves a trader's transient derivative orders
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<injective.exchange.v1beta1.QueryOuterClass.QueryTraderDerivativeOrdersResponse> traderDerivativeTransientOrders(
        injective.exchange.v1beta1.QueryOuterClass.QueryTraderDerivativeOrdersRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getTraderDerivativeTransientOrdersMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Retrieves a list of derivative markets.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<injective.exchange.v1beta1.QueryOuterClass.QueryDerivativeMarketsResponse> derivativeMarkets(
        injective.exchange.v1beta1.QueryOuterClass.QueryDerivativeMarketsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDerivativeMarketsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Retrieves a derivative market by ticker
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<injective.exchange.v1beta1.QueryOuterClass.QueryDerivativeMarketResponse> derivativeMarket(
        injective.exchange.v1beta1.QueryOuterClass.QueryDerivativeMarketRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDerivativeMarketMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Retrieves a derivative market's corresponding address for fees that
     * contribute to the market's insurance fund
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<injective.exchange.v1beta1.QueryOuterClass.QueryDerivativeMarketAddressResponse> derivativeMarketAddress(
        injective.exchange.v1beta1.QueryOuterClass.QueryDerivativeMarketAddressRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDerivativeMarketAddressMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Retrieves a subaccount's trade nonce
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<injective.exchange.v1beta1.QueryOuterClass.QuerySubaccountTradeNonceResponse> subaccountTradeNonce(
        injective.exchange.v1beta1.QueryOuterClass.QuerySubaccountTradeNonceRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSubaccountTradeNonceMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Retrieves the entire exchange module's state
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<injective.exchange.v1beta1.QueryOuterClass.QueryModuleStateResponse> exchangeModuleState(
        injective.exchange.v1beta1.QueryOuterClass.QueryModuleStateRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getExchangeModuleStateMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Retrieves the entire exchange module's positions
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<injective.exchange.v1beta1.QueryOuterClass.QueryPositionsResponse> positions(
        injective.exchange.v1beta1.QueryOuterClass.QueryPositionsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getPositionsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Retrieves subaccount's positions
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<injective.exchange.v1beta1.QueryOuterClass.QuerySubaccountPositionsResponse> subaccountPositions(
        injective.exchange.v1beta1.QueryOuterClass.QuerySubaccountPositionsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSubaccountPositionsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Retrieves subaccount's position in market
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<injective.exchange.v1beta1.QueryOuterClass.QuerySubaccountPositionInMarketResponse> subaccountPositionInMarket(
        injective.exchange.v1beta1.QueryOuterClass.QuerySubaccountPositionInMarketRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSubaccountPositionInMarketMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Retrieves subaccount's position in market
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<injective.exchange.v1beta1.QueryOuterClass.QuerySubaccountEffectivePositionInMarketResponse> subaccountEffectivePositionInMarket(
        injective.exchange.v1beta1.QueryOuterClass.QuerySubaccountEffectivePositionInMarketRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSubaccountEffectivePositionInMarketMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Retrieves perpetual market info
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<injective.exchange.v1beta1.QueryOuterClass.QueryPerpetualMarketInfoResponse> perpetualMarketInfo(
        injective.exchange.v1beta1.QueryOuterClass.QueryPerpetualMarketInfoRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getPerpetualMarketInfoMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Retrieves expiry market info
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<injective.exchange.v1beta1.QueryOuterClass.QueryExpiryFuturesMarketInfoResponse> expiryFuturesMarketInfo(
        injective.exchange.v1beta1.QueryOuterClass.QueryExpiryFuturesMarketInfoRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getExpiryFuturesMarketInfoMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Retrieves perpetual market funding
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<injective.exchange.v1beta1.QueryOuterClass.QueryPerpetualMarketFundingResponse> perpetualMarketFunding(
        injective.exchange.v1beta1.QueryOuterClass.QueryPerpetualMarketFundingRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getPerpetualMarketFundingMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Retrieves subaccount's order metadata
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<injective.exchange.v1beta1.QueryOuterClass.QuerySubaccountOrderMetadataResponse> subaccountOrderMetadata(
        injective.exchange.v1beta1.QueryOuterClass.QuerySubaccountOrderMetadataRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSubaccountOrderMetadataMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Retrieves the account and total trade rewards points
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<injective.exchange.v1beta1.QueryOuterClass.QueryTradeRewardPointsResponse> tradeRewardPoints(
        injective.exchange.v1beta1.QueryOuterClass.QueryTradeRewardPointsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getTradeRewardPointsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Retrieves the pending account and total trade rewards points
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<injective.exchange.v1beta1.QueryOuterClass.QueryTradeRewardPointsResponse> pendingTradeRewardPoints(
        injective.exchange.v1beta1.QueryOuterClass.QueryTradeRewardPointsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getPendingTradeRewardPointsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Retrieves the trade reward campaign
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<injective.exchange.v1beta1.QueryOuterClass.QueryTradeRewardCampaignResponse> tradeRewardCampaign(
        injective.exchange.v1beta1.QueryOuterClass.QueryTradeRewardCampaignRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getTradeRewardCampaignMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Retrieves the account's fee discount info
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<injective.exchange.v1beta1.QueryOuterClass.QueryFeeDiscountAccountInfoResponse> feeDiscountAccountInfo(
        injective.exchange.v1beta1.QueryOuterClass.QueryFeeDiscountAccountInfoRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getFeeDiscountAccountInfoMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Retrieves the fee discount schedule
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<injective.exchange.v1beta1.QueryOuterClass.QueryFeeDiscountScheduleResponse> feeDiscountSchedule(
        injective.exchange.v1beta1.QueryOuterClass.QueryFeeDiscountScheduleRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getFeeDiscountScheduleMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Retrieves mismatches between available vs. total balance
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<injective.exchange.v1beta1.QueryOuterClass.QueryBalanceMismatchesResponse> balanceMismatches(
        injective.exchange.v1beta1.QueryOuterClass.QueryBalanceMismatchesRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getBalanceMismatchesMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Retrieves available and total balances with balance holds
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<injective.exchange.v1beta1.QueryOuterClass.QueryBalanceWithBalanceHoldsResponse> balanceWithBalanceHolds(
        injective.exchange.v1beta1.QueryOuterClass.QueryBalanceWithBalanceHoldsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getBalanceWithBalanceHoldsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Retrieves fee discount tier stats
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<injective.exchange.v1beta1.QueryOuterClass.QueryFeeDiscountTierStatisticsResponse> feeDiscountTierStatistics(
        injective.exchange.v1beta1.QueryOuterClass.QueryFeeDiscountTierStatisticsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getFeeDiscountTierStatisticsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Retrieves market making pool info
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<injective.exchange.v1beta1.QueryOuterClass.MitoVaultInfosResponse> mitoVaultInfos(
        injective.exchange.v1beta1.QueryOuterClass.MitoVaultInfosRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getMitoVaultInfosMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * QueryMarketIDFromVault returns the market ID for a given vault subaccount
     * ID
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<injective.exchange.v1beta1.QueryOuterClass.QueryMarketIDFromVaultResponse> queryMarketIDFromVault(
        injective.exchange.v1beta1.QueryOuterClass.QueryMarketIDFromVaultRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getQueryMarketIDFromVaultMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Retrieves historical trade records for a given market ID
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<injective.exchange.v1beta1.QueryOuterClass.QueryHistoricalTradeRecordsResponse> historicalTradeRecords(
        injective.exchange.v1beta1.QueryOuterClass.QueryHistoricalTradeRecordsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getHistoricalTradeRecordsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Retrieves if the account is opted out of rewards
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<injective.exchange.v1beta1.QueryOuterClass.QueryIsOptedOutOfRewardsResponse> isOptedOutOfRewards(
        injective.exchange.v1beta1.QueryOuterClass.QueryIsOptedOutOfRewardsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getIsOptedOutOfRewardsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Retrieves all accounts opted out of rewards
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<injective.exchange.v1beta1.QueryOuterClass.QueryOptedOutOfRewardsAccountsResponse> optedOutOfRewardsAccounts(
        injective.exchange.v1beta1.QueryOuterClass.QueryOptedOutOfRewardsAccountsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getOptedOutOfRewardsAccountsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * MarketVolatility computes the volatility for spot and derivative markets
     * trading history.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<injective.exchange.v1beta1.QueryOuterClass.QueryMarketVolatilityResponse> marketVolatility(
        injective.exchange.v1beta1.QueryOuterClass.QueryMarketVolatilityRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getMarketVolatilityMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Retrieves a spot market's orderbook by marketID
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<injective.exchange.v1beta1.QueryOuterClass.QueryBinaryMarketsResponse> binaryOptionsMarkets(
        injective.exchange.v1beta1.QueryOuterClass.QueryBinaryMarketsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getBinaryOptionsMarketsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Retrieves a trader's derivative conditional orders
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<injective.exchange.v1beta1.QueryOuterClass.QueryTraderDerivativeConditionalOrdersResponse> traderDerivativeConditionalOrders(
        injective.exchange.v1beta1.QueryOuterClass.QueryTraderDerivativeConditionalOrdersRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getTraderDerivativeConditionalOrdersMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<injective.exchange.v1beta1.QueryOuterClass.QueryMarketAtomicExecutionFeeMultiplierResponse> marketAtomicExecutionFeeMultiplier(
        injective.exchange.v1beta1.QueryOuterClass.QueryMarketAtomicExecutionFeeMultiplierRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getMarketAtomicExecutionFeeMultiplierMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_QUERY_EXCHANGE_PARAMS = 0;
  private static final int METHODID_SUBACCOUNT_DEPOSITS = 1;
  private static final int METHODID_SUBACCOUNT_DEPOSIT = 2;
  private static final int METHODID_EXCHANGE_BALANCES = 3;
  private static final int METHODID_AGGREGATE_VOLUME = 4;
  private static final int METHODID_AGGREGATE_VOLUMES = 5;
  private static final int METHODID_AGGREGATE_MARKET_VOLUME = 6;
  private static final int METHODID_AGGREGATE_MARKET_VOLUMES = 7;
  private static final int METHODID_DENOM_DECIMAL = 8;
  private static final int METHODID_DENOM_DECIMALS = 9;
  private static final int METHODID_SPOT_MARKETS = 10;
  private static final int METHODID_SPOT_MARKET = 11;
  private static final int METHODID_FULL_SPOT_MARKETS = 12;
  private static final int METHODID_FULL_SPOT_MARKET = 13;
  private static final int METHODID_SPOT_ORDERBOOK = 14;
  private static final int METHODID_TRADER_SPOT_ORDERS = 15;
  private static final int METHODID_ACCOUNT_ADDRESS_SPOT_ORDERS = 16;
  private static final int METHODID_SPOT_ORDERS_BY_HASHES = 17;
  private static final int METHODID_SUBACCOUNT_ORDERS = 18;
  private static final int METHODID_TRADER_SPOT_TRANSIENT_ORDERS = 19;
  private static final int METHODID_SPOT_MID_PRICE_AND_TOB = 20;
  private static final int METHODID_DERIVATIVE_MID_PRICE_AND_TOB = 21;
  private static final int METHODID_DERIVATIVE_ORDERBOOK = 22;
  private static final int METHODID_TRADER_DERIVATIVE_ORDERS = 23;
  private static final int METHODID_ACCOUNT_ADDRESS_DERIVATIVE_ORDERS = 24;
  private static final int METHODID_DERIVATIVE_ORDERS_BY_HASHES = 25;
  private static final int METHODID_TRADER_DERIVATIVE_TRANSIENT_ORDERS = 26;
  private static final int METHODID_DERIVATIVE_MARKETS = 27;
  private static final int METHODID_DERIVATIVE_MARKET = 28;
  private static final int METHODID_DERIVATIVE_MARKET_ADDRESS = 29;
  private static final int METHODID_SUBACCOUNT_TRADE_NONCE = 30;
  private static final int METHODID_EXCHANGE_MODULE_STATE = 31;
  private static final int METHODID_POSITIONS = 32;
  private static final int METHODID_SUBACCOUNT_POSITIONS = 33;
  private static final int METHODID_SUBACCOUNT_POSITION_IN_MARKET = 34;
  private static final int METHODID_SUBACCOUNT_EFFECTIVE_POSITION_IN_MARKET = 35;
  private static final int METHODID_PERPETUAL_MARKET_INFO = 36;
  private static final int METHODID_EXPIRY_FUTURES_MARKET_INFO = 37;
  private static final int METHODID_PERPETUAL_MARKET_FUNDING = 38;
  private static final int METHODID_SUBACCOUNT_ORDER_METADATA = 39;
  private static final int METHODID_TRADE_REWARD_POINTS = 40;
  private static final int METHODID_PENDING_TRADE_REWARD_POINTS = 41;
  private static final int METHODID_TRADE_REWARD_CAMPAIGN = 42;
  private static final int METHODID_FEE_DISCOUNT_ACCOUNT_INFO = 43;
  private static final int METHODID_FEE_DISCOUNT_SCHEDULE = 44;
  private static final int METHODID_BALANCE_MISMATCHES = 45;
  private static final int METHODID_BALANCE_WITH_BALANCE_HOLDS = 46;
  private static final int METHODID_FEE_DISCOUNT_TIER_STATISTICS = 47;
  private static final int METHODID_MITO_VAULT_INFOS = 48;
  private static final int METHODID_QUERY_MARKET_IDFROM_VAULT = 49;
  private static final int METHODID_HISTORICAL_TRADE_RECORDS = 50;
  private static final int METHODID_IS_OPTED_OUT_OF_REWARDS = 51;
  private static final int METHODID_OPTED_OUT_OF_REWARDS_ACCOUNTS = 52;
  private static final int METHODID_MARKET_VOLATILITY = 53;
  private static final int METHODID_BINARY_OPTIONS_MARKETS = 54;
  private static final int METHODID_TRADER_DERIVATIVE_CONDITIONAL_ORDERS = 55;
  private static final int METHODID_MARKET_ATOMIC_EXECUTION_FEE_MULTIPLIER = 56;

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
        case METHODID_QUERY_EXCHANGE_PARAMS:
          serviceImpl.queryExchangeParams((injective.exchange.v1beta1.QueryOuterClass.QueryExchangeParamsRequest) request,
              (io.grpc.stub.StreamObserver<injective.exchange.v1beta1.QueryOuterClass.QueryExchangeParamsResponse>) responseObserver);
          break;
        case METHODID_SUBACCOUNT_DEPOSITS:
          serviceImpl.subaccountDeposits((injective.exchange.v1beta1.QueryOuterClass.QuerySubaccountDepositsRequest) request,
              (io.grpc.stub.StreamObserver<injective.exchange.v1beta1.QueryOuterClass.QuerySubaccountDepositsResponse>) responseObserver);
          break;
        case METHODID_SUBACCOUNT_DEPOSIT:
          serviceImpl.subaccountDeposit((injective.exchange.v1beta1.QueryOuterClass.QuerySubaccountDepositRequest) request,
              (io.grpc.stub.StreamObserver<injective.exchange.v1beta1.QueryOuterClass.QuerySubaccountDepositResponse>) responseObserver);
          break;
        case METHODID_EXCHANGE_BALANCES:
          serviceImpl.exchangeBalances((injective.exchange.v1beta1.QueryOuterClass.QueryExchangeBalancesRequest) request,
              (io.grpc.stub.StreamObserver<injective.exchange.v1beta1.QueryOuterClass.QueryExchangeBalancesResponse>) responseObserver);
          break;
        case METHODID_AGGREGATE_VOLUME:
          serviceImpl.aggregateVolume((injective.exchange.v1beta1.QueryOuterClass.QueryAggregateVolumeRequest) request,
              (io.grpc.stub.StreamObserver<injective.exchange.v1beta1.QueryOuterClass.QueryAggregateVolumeResponse>) responseObserver);
          break;
        case METHODID_AGGREGATE_VOLUMES:
          serviceImpl.aggregateVolumes((injective.exchange.v1beta1.QueryOuterClass.QueryAggregateVolumesRequest) request,
              (io.grpc.stub.StreamObserver<injective.exchange.v1beta1.QueryOuterClass.QueryAggregateVolumesResponse>) responseObserver);
          break;
        case METHODID_AGGREGATE_MARKET_VOLUME:
          serviceImpl.aggregateMarketVolume((injective.exchange.v1beta1.QueryOuterClass.QueryAggregateMarketVolumeRequest) request,
              (io.grpc.stub.StreamObserver<injective.exchange.v1beta1.QueryOuterClass.QueryAggregateMarketVolumeResponse>) responseObserver);
          break;
        case METHODID_AGGREGATE_MARKET_VOLUMES:
          serviceImpl.aggregateMarketVolumes((injective.exchange.v1beta1.QueryOuterClass.QueryAggregateMarketVolumesRequest) request,
              (io.grpc.stub.StreamObserver<injective.exchange.v1beta1.QueryOuterClass.QueryAggregateMarketVolumesResponse>) responseObserver);
          break;
        case METHODID_DENOM_DECIMAL:
          serviceImpl.denomDecimal((injective.exchange.v1beta1.QueryOuterClass.QueryDenomDecimalRequest) request,
              (io.grpc.stub.StreamObserver<injective.exchange.v1beta1.QueryOuterClass.QueryDenomDecimalResponse>) responseObserver);
          break;
        case METHODID_DENOM_DECIMALS:
          serviceImpl.denomDecimals((injective.exchange.v1beta1.QueryOuterClass.QueryDenomDecimalsRequest) request,
              (io.grpc.stub.StreamObserver<injective.exchange.v1beta1.QueryOuterClass.QueryDenomDecimalsResponse>) responseObserver);
          break;
        case METHODID_SPOT_MARKETS:
          serviceImpl.spotMarkets((injective.exchange.v1beta1.QueryOuterClass.QuerySpotMarketsRequest) request,
              (io.grpc.stub.StreamObserver<injective.exchange.v1beta1.QueryOuterClass.QuerySpotMarketsResponse>) responseObserver);
          break;
        case METHODID_SPOT_MARKET:
          serviceImpl.spotMarket((injective.exchange.v1beta1.QueryOuterClass.QuerySpotMarketRequest) request,
              (io.grpc.stub.StreamObserver<injective.exchange.v1beta1.QueryOuterClass.QuerySpotMarketResponse>) responseObserver);
          break;
        case METHODID_FULL_SPOT_MARKETS:
          serviceImpl.fullSpotMarkets((injective.exchange.v1beta1.QueryOuterClass.QueryFullSpotMarketsRequest) request,
              (io.grpc.stub.StreamObserver<injective.exchange.v1beta1.QueryOuterClass.QueryFullSpotMarketsResponse>) responseObserver);
          break;
        case METHODID_FULL_SPOT_MARKET:
          serviceImpl.fullSpotMarket((injective.exchange.v1beta1.QueryOuterClass.QueryFullSpotMarketRequest) request,
              (io.grpc.stub.StreamObserver<injective.exchange.v1beta1.QueryOuterClass.QueryFullSpotMarketResponse>) responseObserver);
          break;
        case METHODID_SPOT_ORDERBOOK:
          serviceImpl.spotOrderbook((injective.exchange.v1beta1.QueryOuterClass.QuerySpotOrderbookRequest) request,
              (io.grpc.stub.StreamObserver<injective.exchange.v1beta1.QueryOuterClass.QuerySpotOrderbookResponse>) responseObserver);
          break;
        case METHODID_TRADER_SPOT_ORDERS:
          serviceImpl.traderSpotOrders((injective.exchange.v1beta1.QueryOuterClass.QueryTraderSpotOrdersRequest) request,
              (io.grpc.stub.StreamObserver<injective.exchange.v1beta1.QueryOuterClass.QueryTraderSpotOrdersResponse>) responseObserver);
          break;
        case METHODID_ACCOUNT_ADDRESS_SPOT_ORDERS:
          serviceImpl.accountAddressSpotOrders((injective.exchange.v1beta1.QueryOuterClass.QueryAccountAddressSpotOrdersRequest) request,
              (io.grpc.stub.StreamObserver<injective.exchange.v1beta1.QueryOuterClass.QueryAccountAddressSpotOrdersResponse>) responseObserver);
          break;
        case METHODID_SPOT_ORDERS_BY_HASHES:
          serviceImpl.spotOrdersByHashes((injective.exchange.v1beta1.QueryOuterClass.QuerySpotOrdersByHashesRequest) request,
              (io.grpc.stub.StreamObserver<injective.exchange.v1beta1.QueryOuterClass.QuerySpotOrdersByHashesResponse>) responseObserver);
          break;
        case METHODID_SUBACCOUNT_ORDERS:
          serviceImpl.subaccountOrders((injective.exchange.v1beta1.QueryOuterClass.QuerySubaccountOrdersRequest) request,
              (io.grpc.stub.StreamObserver<injective.exchange.v1beta1.QueryOuterClass.QuerySubaccountOrdersResponse>) responseObserver);
          break;
        case METHODID_TRADER_SPOT_TRANSIENT_ORDERS:
          serviceImpl.traderSpotTransientOrders((injective.exchange.v1beta1.QueryOuterClass.QueryTraderSpotOrdersRequest) request,
              (io.grpc.stub.StreamObserver<injective.exchange.v1beta1.QueryOuterClass.QueryTraderSpotOrdersResponse>) responseObserver);
          break;
        case METHODID_SPOT_MID_PRICE_AND_TOB:
          serviceImpl.spotMidPriceAndTOB((injective.exchange.v1beta1.QueryOuterClass.QuerySpotMidPriceAndTOBRequest) request,
              (io.grpc.stub.StreamObserver<injective.exchange.v1beta1.QueryOuterClass.QuerySpotMidPriceAndTOBResponse>) responseObserver);
          break;
        case METHODID_DERIVATIVE_MID_PRICE_AND_TOB:
          serviceImpl.derivativeMidPriceAndTOB((injective.exchange.v1beta1.QueryOuterClass.QueryDerivativeMidPriceAndTOBRequest) request,
              (io.grpc.stub.StreamObserver<injective.exchange.v1beta1.QueryOuterClass.QueryDerivativeMidPriceAndTOBResponse>) responseObserver);
          break;
        case METHODID_DERIVATIVE_ORDERBOOK:
          serviceImpl.derivativeOrderbook((injective.exchange.v1beta1.QueryOuterClass.QueryDerivativeOrderbookRequest) request,
              (io.grpc.stub.StreamObserver<injective.exchange.v1beta1.QueryOuterClass.QueryDerivativeOrderbookResponse>) responseObserver);
          break;
        case METHODID_TRADER_DERIVATIVE_ORDERS:
          serviceImpl.traderDerivativeOrders((injective.exchange.v1beta1.QueryOuterClass.QueryTraderDerivativeOrdersRequest) request,
              (io.grpc.stub.StreamObserver<injective.exchange.v1beta1.QueryOuterClass.QueryTraderDerivativeOrdersResponse>) responseObserver);
          break;
        case METHODID_ACCOUNT_ADDRESS_DERIVATIVE_ORDERS:
          serviceImpl.accountAddressDerivativeOrders((injective.exchange.v1beta1.QueryOuterClass.QueryAccountAddressDerivativeOrdersRequest) request,
              (io.grpc.stub.StreamObserver<injective.exchange.v1beta1.QueryOuterClass.QueryAccountAddressDerivativeOrdersResponse>) responseObserver);
          break;
        case METHODID_DERIVATIVE_ORDERS_BY_HASHES:
          serviceImpl.derivativeOrdersByHashes((injective.exchange.v1beta1.QueryOuterClass.QueryDerivativeOrdersByHashesRequest) request,
              (io.grpc.stub.StreamObserver<injective.exchange.v1beta1.QueryOuterClass.QueryDerivativeOrdersByHashesResponse>) responseObserver);
          break;
        case METHODID_TRADER_DERIVATIVE_TRANSIENT_ORDERS:
          serviceImpl.traderDerivativeTransientOrders((injective.exchange.v1beta1.QueryOuterClass.QueryTraderDerivativeOrdersRequest) request,
              (io.grpc.stub.StreamObserver<injective.exchange.v1beta1.QueryOuterClass.QueryTraderDerivativeOrdersResponse>) responseObserver);
          break;
        case METHODID_DERIVATIVE_MARKETS:
          serviceImpl.derivativeMarkets((injective.exchange.v1beta1.QueryOuterClass.QueryDerivativeMarketsRequest) request,
              (io.grpc.stub.StreamObserver<injective.exchange.v1beta1.QueryOuterClass.QueryDerivativeMarketsResponse>) responseObserver);
          break;
        case METHODID_DERIVATIVE_MARKET:
          serviceImpl.derivativeMarket((injective.exchange.v1beta1.QueryOuterClass.QueryDerivativeMarketRequest) request,
              (io.grpc.stub.StreamObserver<injective.exchange.v1beta1.QueryOuterClass.QueryDerivativeMarketResponse>) responseObserver);
          break;
        case METHODID_DERIVATIVE_MARKET_ADDRESS:
          serviceImpl.derivativeMarketAddress((injective.exchange.v1beta1.QueryOuterClass.QueryDerivativeMarketAddressRequest) request,
              (io.grpc.stub.StreamObserver<injective.exchange.v1beta1.QueryOuterClass.QueryDerivativeMarketAddressResponse>) responseObserver);
          break;
        case METHODID_SUBACCOUNT_TRADE_NONCE:
          serviceImpl.subaccountTradeNonce((injective.exchange.v1beta1.QueryOuterClass.QuerySubaccountTradeNonceRequest) request,
              (io.grpc.stub.StreamObserver<injective.exchange.v1beta1.QueryOuterClass.QuerySubaccountTradeNonceResponse>) responseObserver);
          break;
        case METHODID_EXCHANGE_MODULE_STATE:
          serviceImpl.exchangeModuleState((injective.exchange.v1beta1.QueryOuterClass.QueryModuleStateRequest) request,
              (io.grpc.stub.StreamObserver<injective.exchange.v1beta1.QueryOuterClass.QueryModuleStateResponse>) responseObserver);
          break;
        case METHODID_POSITIONS:
          serviceImpl.positions((injective.exchange.v1beta1.QueryOuterClass.QueryPositionsRequest) request,
              (io.grpc.stub.StreamObserver<injective.exchange.v1beta1.QueryOuterClass.QueryPositionsResponse>) responseObserver);
          break;
        case METHODID_SUBACCOUNT_POSITIONS:
          serviceImpl.subaccountPositions((injective.exchange.v1beta1.QueryOuterClass.QuerySubaccountPositionsRequest) request,
              (io.grpc.stub.StreamObserver<injective.exchange.v1beta1.QueryOuterClass.QuerySubaccountPositionsResponse>) responseObserver);
          break;
        case METHODID_SUBACCOUNT_POSITION_IN_MARKET:
          serviceImpl.subaccountPositionInMarket((injective.exchange.v1beta1.QueryOuterClass.QuerySubaccountPositionInMarketRequest) request,
              (io.grpc.stub.StreamObserver<injective.exchange.v1beta1.QueryOuterClass.QuerySubaccountPositionInMarketResponse>) responseObserver);
          break;
        case METHODID_SUBACCOUNT_EFFECTIVE_POSITION_IN_MARKET:
          serviceImpl.subaccountEffectivePositionInMarket((injective.exchange.v1beta1.QueryOuterClass.QuerySubaccountEffectivePositionInMarketRequest) request,
              (io.grpc.stub.StreamObserver<injective.exchange.v1beta1.QueryOuterClass.QuerySubaccountEffectivePositionInMarketResponse>) responseObserver);
          break;
        case METHODID_PERPETUAL_MARKET_INFO:
          serviceImpl.perpetualMarketInfo((injective.exchange.v1beta1.QueryOuterClass.QueryPerpetualMarketInfoRequest) request,
              (io.grpc.stub.StreamObserver<injective.exchange.v1beta1.QueryOuterClass.QueryPerpetualMarketInfoResponse>) responseObserver);
          break;
        case METHODID_EXPIRY_FUTURES_MARKET_INFO:
          serviceImpl.expiryFuturesMarketInfo((injective.exchange.v1beta1.QueryOuterClass.QueryExpiryFuturesMarketInfoRequest) request,
              (io.grpc.stub.StreamObserver<injective.exchange.v1beta1.QueryOuterClass.QueryExpiryFuturesMarketInfoResponse>) responseObserver);
          break;
        case METHODID_PERPETUAL_MARKET_FUNDING:
          serviceImpl.perpetualMarketFunding((injective.exchange.v1beta1.QueryOuterClass.QueryPerpetualMarketFundingRequest) request,
              (io.grpc.stub.StreamObserver<injective.exchange.v1beta1.QueryOuterClass.QueryPerpetualMarketFundingResponse>) responseObserver);
          break;
        case METHODID_SUBACCOUNT_ORDER_METADATA:
          serviceImpl.subaccountOrderMetadata((injective.exchange.v1beta1.QueryOuterClass.QuerySubaccountOrderMetadataRequest) request,
              (io.grpc.stub.StreamObserver<injective.exchange.v1beta1.QueryOuterClass.QuerySubaccountOrderMetadataResponse>) responseObserver);
          break;
        case METHODID_TRADE_REWARD_POINTS:
          serviceImpl.tradeRewardPoints((injective.exchange.v1beta1.QueryOuterClass.QueryTradeRewardPointsRequest) request,
              (io.grpc.stub.StreamObserver<injective.exchange.v1beta1.QueryOuterClass.QueryTradeRewardPointsResponse>) responseObserver);
          break;
        case METHODID_PENDING_TRADE_REWARD_POINTS:
          serviceImpl.pendingTradeRewardPoints((injective.exchange.v1beta1.QueryOuterClass.QueryTradeRewardPointsRequest) request,
              (io.grpc.stub.StreamObserver<injective.exchange.v1beta1.QueryOuterClass.QueryTradeRewardPointsResponse>) responseObserver);
          break;
        case METHODID_TRADE_REWARD_CAMPAIGN:
          serviceImpl.tradeRewardCampaign((injective.exchange.v1beta1.QueryOuterClass.QueryTradeRewardCampaignRequest) request,
              (io.grpc.stub.StreamObserver<injective.exchange.v1beta1.QueryOuterClass.QueryTradeRewardCampaignResponse>) responseObserver);
          break;
        case METHODID_FEE_DISCOUNT_ACCOUNT_INFO:
          serviceImpl.feeDiscountAccountInfo((injective.exchange.v1beta1.QueryOuterClass.QueryFeeDiscountAccountInfoRequest) request,
              (io.grpc.stub.StreamObserver<injective.exchange.v1beta1.QueryOuterClass.QueryFeeDiscountAccountInfoResponse>) responseObserver);
          break;
        case METHODID_FEE_DISCOUNT_SCHEDULE:
          serviceImpl.feeDiscountSchedule((injective.exchange.v1beta1.QueryOuterClass.QueryFeeDiscountScheduleRequest) request,
              (io.grpc.stub.StreamObserver<injective.exchange.v1beta1.QueryOuterClass.QueryFeeDiscountScheduleResponse>) responseObserver);
          break;
        case METHODID_BALANCE_MISMATCHES:
          serviceImpl.balanceMismatches((injective.exchange.v1beta1.QueryOuterClass.QueryBalanceMismatchesRequest) request,
              (io.grpc.stub.StreamObserver<injective.exchange.v1beta1.QueryOuterClass.QueryBalanceMismatchesResponse>) responseObserver);
          break;
        case METHODID_BALANCE_WITH_BALANCE_HOLDS:
          serviceImpl.balanceWithBalanceHolds((injective.exchange.v1beta1.QueryOuterClass.QueryBalanceWithBalanceHoldsRequest) request,
              (io.grpc.stub.StreamObserver<injective.exchange.v1beta1.QueryOuterClass.QueryBalanceWithBalanceHoldsResponse>) responseObserver);
          break;
        case METHODID_FEE_DISCOUNT_TIER_STATISTICS:
          serviceImpl.feeDiscountTierStatistics((injective.exchange.v1beta1.QueryOuterClass.QueryFeeDiscountTierStatisticsRequest) request,
              (io.grpc.stub.StreamObserver<injective.exchange.v1beta1.QueryOuterClass.QueryFeeDiscountTierStatisticsResponse>) responseObserver);
          break;
        case METHODID_MITO_VAULT_INFOS:
          serviceImpl.mitoVaultInfos((injective.exchange.v1beta1.QueryOuterClass.MitoVaultInfosRequest) request,
              (io.grpc.stub.StreamObserver<injective.exchange.v1beta1.QueryOuterClass.MitoVaultInfosResponse>) responseObserver);
          break;
        case METHODID_QUERY_MARKET_IDFROM_VAULT:
          serviceImpl.queryMarketIDFromVault((injective.exchange.v1beta1.QueryOuterClass.QueryMarketIDFromVaultRequest) request,
              (io.grpc.stub.StreamObserver<injective.exchange.v1beta1.QueryOuterClass.QueryMarketIDFromVaultResponse>) responseObserver);
          break;
        case METHODID_HISTORICAL_TRADE_RECORDS:
          serviceImpl.historicalTradeRecords((injective.exchange.v1beta1.QueryOuterClass.QueryHistoricalTradeRecordsRequest) request,
              (io.grpc.stub.StreamObserver<injective.exchange.v1beta1.QueryOuterClass.QueryHistoricalTradeRecordsResponse>) responseObserver);
          break;
        case METHODID_IS_OPTED_OUT_OF_REWARDS:
          serviceImpl.isOptedOutOfRewards((injective.exchange.v1beta1.QueryOuterClass.QueryIsOptedOutOfRewardsRequest) request,
              (io.grpc.stub.StreamObserver<injective.exchange.v1beta1.QueryOuterClass.QueryIsOptedOutOfRewardsResponse>) responseObserver);
          break;
        case METHODID_OPTED_OUT_OF_REWARDS_ACCOUNTS:
          serviceImpl.optedOutOfRewardsAccounts((injective.exchange.v1beta1.QueryOuterClass.QueryOptedOutOfRewardsAccountsRequest) request,
              (io.grpc.stub.StreamObserver<injective.exchange.v1beta1.QueryOuterClass.QueryOptedOutOfRewardsAccountsResponse>) responseObserver);
          break;
        case METHODID_MARKET_VOLATILITY:
          serviceImpl.marketVolatility((injective.exchange.v1beta1.QueryOuterClass.QueryMarketVolatilityRequest) request,
              (io.grpc.stub.StreamObserver<injective.exchange.v1beta1.QueryOuterClass.QueryMarketVolatilityResponse>) responseObserver);
          break;
        case METHODID_BINARY_OPTIONS_MARKETS:
          serviceImpl.binaryOptionsMarkets((injective.exchange.v1beta1.QueryOuterClass.QueryBinaryMarketsRequest) request,
              (io.grpc.stub.StreamObserver<injective.exchange.v1beta1.QueryOuterClass.QueryBinaryMarketsResponse>) responseObserver);
          break;
        case METHODID_TRADER_DERIVATIVE_CONDITIONAL_ORDERS:
          serviceImpl.traderDerivativeConditionalOrders((injective.exchange.v1beta1.QueryOuterClass.QueryTraderDerivativeConditionalOrdersRequest) request,
              (io.grpc.stub.StreamObserver<injective.exchange.v1beta1.QueryOuterClass.QueryTraderDerivativeConditionalOrdersResponse>) responseObserver);
          break;
        case METHODID_MARKET_ATOMIC_EXECUTION_FEE_MULTIPLIER:
          serviceImpl.marketAtomicExecutionFeeMultiplier((injective.exchange.v1beta1.QueryOuterClass.QueryMarketAtomicExecutionFeeMultiplierRequest) request,
              (io.grpc.stub.StreamObserver<injective.exchange.v1beta1.QueryOuterClass.QueryMarketAtomicExecutionFeeMultiplierResponse>) responseObserver);
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
          getQueryExchangeParamsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              injective.exchange.v1beta1.QueryOuterClass.QueryExchangeParamsRequest,
              injective.exchange.v1beta1.QueryOuterClass.QueryExchangeParamsResponse>(
                service, METHODID_QUERY_EXCHANGE_PARAMS)))
        .addMethod(
          getSubaccountDepositsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              injective.exchange.v1beta1.QueryOuterClass.QuerySubaccountDepositsRequest,
              injective.exchange.v1beta1.QueryOuterClass.QuerySubaccountDepositsResponse>(
                service, METHODID_SUBACCOUNT_DEPOSITS)))
        .addMethod(
          getSubaccountDepositMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              injective.exchange.v1beta1.QueryOuterClass.QuerySubaccountDepositRequest,
              injective.exchange.v1beta1.QueryOuterClass.QuerySubaccountDepositResponse>(
                service, METHODID_SUBACCOUNT_DEPOSIT)))
        .addMethod(
          getExchangeBalancesMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              injective.exchange.v1beta1.QueryOuterClass.QueryExchangeBalancesRequest,
              injective.exchange.v1beta1.QueryOuterClass.QueryExchangeBalancesResponse>(
                service, METHODID_EXCHANGE_BALANCES)))
        .addMethod(
          getAggregateVolumeMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              injective.exchange.v1beta1.QueryOuterClass.QueryAggregateVolumeRequest,
              injective.exchange.v1beta1.QueryOuterClass.QueryAggregateVolumeResponse>(
                service, METHODID_AGGREGATE_VOLUME)))
        .addMethod(
          getAggregateVolumesMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              injective.exchange.v1beta1.QueryOuterClass.QueryAggregateVolumesRequest,
              injective.exchange.v1beta1.QueryOuterClass.QueryAggregateVolumesResponse>(
                service, METHODID_AGGREGATE_VOLUMES)))
        .addMethod(
          getAggregateMarketVolumeMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              injective.exchange.v1beta1.QueryOuterClass.QueryAggregateMarketVolumeRequest,
              injective.exchange.v1beta1.QueryOuterClass.QueryAggregateMarketVolumeResponse>(
                service, METHODID_AGGREGATE_MARKET_VOLUME)))
        .addMethod(
          getAggregateMarketVolumesMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              injective.exchange.v1beta1.QueryOuterClass.QueryAggregateMarketVolumesRequest,
              injective.exchange.v1beta1.QueryOuterClass.QueryAggregateMarketVolumesResponse>(
                service, METHODID_AGGREGATE_MARKET_VOLUMES)))
        .addMethod(
          getDenomDecimalMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              injective.exchange.v1beta1.QueryOuterClass.QueryDenomDecimalRequest,
              injective.exchange.v1beta1.QueryOuterClass.QueryDenomDecimalResponse>(
                service, METHODID_DENOM_DECIMAL)))
        .addMethod(
          getDenomDecimalsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              injective.exchange.v1beta1.QueryOuterClass.QueryDenomDecimalsRequest,
              injective.exchange.v1beta1.QueryOuterClass.QueryDenomDecimalsResponse>(
                service, METHODID_DENOM_DECIMALS)))
        .addMethod(
          getSpotMarketsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              injective.exchange.v1beta1.QueryOuterClass.QuerySpotMarketsRequest,
              injective.exchange.v1beta1.QueryOuterClass.QuerySpotMarketsResponse>(
                service, METHODID_SPOT_MARKETS)))
        .addMethod(
          getSpotMarketMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              injective.exchange.v1beta1.QueryOuterClass.QuerySpotMarketRequest,
              injective.exchange.v1beta1.QueryOuterClass.QuerySpotMarketResponse>(
                service, METHODID_SPOT_MARKET)))
        .addMethod(
          getFullSpotMarketsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              injective.exchange.v1beta1.QueryOuterClass.QueryFullSpotMarketsRequest,
              injective.exchange.v1beta1.QueryOuterClass.QueryFullSpotMarketsResponse>(
                service, METHODID_FULL_SPOT_MARKETS)))
        .addMethod(
          getFullSpotMarketMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              injective.exchange.v1beta1.QueryOuterClass.QueryFullSpotMarketRequest,
              injective.exchange.v1beta1.QueryOuterClass.QueryFullSpotMarketResponse>(
                service, METHODID_FULL_SPOT_MARKET)))
        .addMethod(
          getSpotOrderbookMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              injective.exchange.v1beta1.QueryOuterClass.QuerySpotOrderbookRequest,
              injective.exchange.v1beta1.QueryOuterClass.QuerySpotOrderbookResponse>(
                service, METHODID_SPOT_ORDERBOOK)))
        .addMethod(
          getTraderSpotOrdersMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              injective.exchange.v1beta1.QueryOuterClass.QueryTraderSpotOrdersRequest,
              injective.exchange.v1beta1.QueryOuterClass.QueryTraderSpotOrdersResponse>(
                service, METHODID_TRADER_SPOT_ORDERS)))
        .addMethod(
          getAccountAddressSpotOrdersMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              injective.exchange.v1beta1.QueryOuterClass.QueryAccountAddressSpotOrdersRequest,
              injective.exchange.v1beta1.QueryOuterClass.QueryAccountAddressSpotOrdersResponse>(
                service, METHODID_ACCOUNT_ADDRESS_SPOT_ORDERS)))
        .addMethod(
          getSpotOrdersByHashesMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              injective.exchange.v1beta1.QueryOuterClass.QuerySpotOrdersByHashesRequest,
              injective.exchange.v1beta1.QueryOuterClass.QuerySpotOrdersByHashesResponse>(
                service, METHODID_SPOT_ORDERS_BY_HASHES)))
        .addMethod(
          getSubaccountOrdersMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              injective.exchange.v1beta1.QueryOuterClass.QuerySubaccountOrdersRequest,
              injective.exchange.v1beta1.QueryOuterClass.QuerySubaccountOrdersResponse>(
                service, METHODID_SUBACCOUNT_ORDERS)))
        .addMethod(
          getTraderSpotTransientOrdersMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              injective.exchange.v1beta1.QueryOuterClass.QueryTraderSpotOrdersRequest,
              injective.exchange.v1beta1.QueryOuterClass.QueryTraderSpotOrdersResponse>(
                service, METHODID_TRADER_SPOT_TRANSIENT_ORDERS)))
        .addMethod(
          getSpotMidPriceAndTOBMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              injective.exchange.v1beta1.QueryOuterClass.QuerySpotMidPriceAndTOBRequest,
              injective.exchange.v1beta1.QueryOuterClass.QuerySpotMidPriceAndTOBResponse>(
                service, METHODID_SPOT_MID_PRICE_AND_TOB)))
        .addMethod(
          getDerivativeMidPriceAndTOBMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              injective.exchange.v1beta1.QueryOuterClass.QueryDerivativeMidPriceAndTOBRequest,
              injective.exchange.v1beta1.QueryOuterClass.QueryDerivativeMidPriceAndTOBResponse>(
                service, METHODID_DERIVATIVE_MID_PRICE_AND_TOB)))
        .addMethod(
          getDerivativeOrderbookMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              injective.exchange.v1beta1.QueryOuterClass.QueryDerivativeOrderbookRequest,
              injective.exchange.v1beta1.QueryOuterClass.QueryDerivativeOrderbookResponse>(
                service, METHODID_DERIVATIVE_ORDERBOOK)))
        .addMethod(
          getTraderDerivativeOrdersMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              injective.exchange.v1beta1.QueryOuterClass.QueryTraderDerivativeOrdersRequest,
              injective.exchange.v1beta1.QueryOuterClass.QueryTraderDerivativeOrdersResponse>(
                service, METHODID_TRADER_DERIVATIVE_ORDERS)))
        .addMethod(
          getAccountAddressDerivativeOrdersMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              injective.exchange.v1beta1.QueryOuterClass.QueryAccountAddressDerivativeOrdersRequest,
              injective.exchange.v1beta1.QueryOuterClass.QueryAccountAddressDerivativeOrdersResponse>(
                service, METHODID_ACCOUNT_ADDRESS_DERIVATIVE_ORDERS)))
        .addMethod(
          getDerivativeOrdersByHashesMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              injective.exchange.v1beta1.QueryOuterClass.QueryDerivativeOrdersByHashesRequest,
              injective.exchange.v1beta1.QueryOuterClass.QueryDerivativeOrdersByHashesResponse>(
                service, METHODID_DERIVATIVE_ORDERS_BY_HASHES)))
        .addMethod(
          getTraderDerivativeTransientOrdersMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              injective.exchange.v1beta1.QueryOuterClass.QueryTraderDerivativeOrdersRequest,
              injective.exchange.v1beta1.QueryOuterClass.QueryTraderDerivativeOrdersResponse>(
                service, METHODID_TRADER_DERIVATIVE_TRANSIENT_ORDERS)))
        .addMethod(
          getDerivativeMarketsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              injective.exchange.v1beta1.QueryOuterClass.QueryDerivativeMarketsRequest,
              injective.exchange.v1beta1.QueryOuterClass.QueryDerivativeMarketsResponse>(
                service, METHODID_DERIVATIVE_MARKETS)))
        .addMethod(
          getDerivativeMarketMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              injective.exchange.v1beta1.QueryOuterClass.QueryDerivativeMarketRequest,
              injective.exchange.v1beta1.QueryOuterClass.QueryDerivativeMarketResponse>(
                service, METHODID_DERIVATIVE_MARKET)))
        .addMethod(
          getDerivativeMarketAddressMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              injective.exchange.v1beta1.QueryOuterClass.QueryDerivativeMarketAddressRequest,
              injective.exchange.v1beta1.QueryOuterClass.QueryDerivativeMarketAddressResponse>(
                service, METHODID_DERIVATIVE_MARKET_ADDRESS)))
        .addMethod(
          getSubaccountTradeNonceMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              injective.exchange.v1beta1.QueryOuterClass.QuerySubaccountTradeNonceRequest,
              injective.exchange.v1beta1.QueryOuterClass.QuerySubaccountTradeNonceResponse>(
                service, METHODID_SUBACCOUNT_TRADE_NONCE)))
        .addMethod(
          getExchangeModuleStateMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              injective.exchange.v1beta1.QueryOuterClass.QueryModuleStateRequest,
              injective.exchange.v1beta1.QueryOuterClass.QueryModuleStateResponse>(
                service, METHODID_EXCHANGE_MODULE_STATE)))
        .addMethod(
          getPositionsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              injective.exchange.v1beta1.QueryOuterClass.QueryPositionsRequest,
              injective.exchange.v1beta1.QueryOuterClass.QueryPositionsResponse>(
                service, METHODID_POSITIONS)))
        .addMethod(
          getSubaccountPositionsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              injective.exchange.v1beta1.QueryOuterClass.QuerySubaccountPositionsRequest,
              injective.exchange.v1beta1.QueryOuterClass.QuerySubaccountPositionsResponse>(
                service, METHODID_SUBACCOUNT_POSITIONS)))
        .addMethod(
          getSubaccountPositionInMarketMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              injective.exchange.v1beta1.QueryOuterClass.QuerySubaccountPositionInMarketRequest,
              injective.exchange.v1beta1.QueryOuterClass.QuerySubaccountPositionInMarketResponse>(
                service, METHODID_SUBACCOUNT_POSITION_IN_MARKET)))
        .addMethod(
          getSubaccountEffectivePositionInMarketMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              injective.exchange.v1beta1.QueryOuterClass.QuerySubaccountEffectivePositionInMarketRequest,
              injective.exchange.v1beta1.QueryOuterClass.QuerySubaccountEffectivePositionInMarketResponse>(
                service, METHODID_SUBACCOUNT_EFFECTIVE_POSITION_IN_MARKET)))
        .addMethod(
          getPerpetualMarketInfoMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              injective.exchange.v1beta1.QueryOuterClass.QueryPerpetualMarketInfoRequest,
              injective.exchange.v1beta1.QueryOuterClass.QueryPerpetualMarketInfoResponse>(
                service, METHODID_PERPETUAL_MARKET_INFO)))
        .addMethod(
          getExpiryFuturesMarketInfoMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              injective.exchange.v1beta1.QueryOuterClass.QueryExpiryFuturesMarketInfoRequest,
              injective.exchange.v1beta1.QueryOuterClass.QueryExpiryFuturesMarketInfoResponse>(
                service, METHODID_EXPIRY_FUTURES_MARKET_INFO)))
        .addMethod(
          getPerpetualMarketFundingMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              injective.exchange.v1beta1.QueryOuterClass.QueryPerpetualMarketFundingRequest,
              injective.exchange.v1beta1.QueryOuterClass.QueryPerpetualMarketFundingResponse>(
                service, METHODID_PERPETUAL_MARKET_FUNDING)))
        .addMethod(
          getSubaccountOrderMetadataMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              injective.exchange.v1beta1.QueryOuterClass.QuerySubaccountOrderMetadataRequest,
              injective.exchange.v1beta1.QueryOuterClass.QuerySubaccountOrderMetadataResponse>(
                service, METHODID_SUBACCOUNT_ORDER_METADATA)))
        .addMethod(
          getTradeRewardPointsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              injective.exchange.v1beta1.QueryOuterClass.QueryTradeRewardPointsRequest,
              injective.exchange.v1beta1.QueryOuterClass.QueryTradeRewardPointsResponse>(
                service, METHODID_TRADE_REWARD_POINTS)))
        .addMethod(
          getPendingTradeRewardPointsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              injective.exchange.v1beta1.QueryOuterClass.QueryTradeRewardPointsRequest,
              injective.exchange.v1beta1.QueryOuterClass.QueryTradeRewardPointsResponse>(
                service, METHODID_PENDING_TRADE_REWARD_POINTS)))
        .addMethod(
          getTradeRewardCampaignMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              injective.exchange.v1beta1.QueryOuterClass.QueryTradeRewardCampaignRequest,
              injective.exchange.v1beta1.QueryOuterClass.QueryTradeRewardCampaignResponse>(
                service, METHODID_TRADE_REWARD_CAMPAIGN)))
        .addMethod(
          getFeeDiscountAccountInfoMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              injective.exchange.v1beta1.QueryOuterClass.QueryFeeDiscountAccountInfoRequest,
              injective.exchange.v1beta1.QueryOuterClass.QueryFeeDiscountAccountInfoResponse>(
                service, METHODID_FEE_DISCOUNT_ACCOUNT_INFO)))
        .addMethod(
          getFeeDiscountScheduleMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              injective.exchange.v1beta1.QueryOuterClass.QueryFeeDiscountScheduleRequest,
              injective.exchange.v1beta1.QueryOuterClass.QueryFeeDiscountScheduleResponse>(
                service, METHODID_FEE_DISCOUNT_SCHEDULE)))
        .addMethod(
          getBalanceMismatchesMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              injective.exchange.v1beta1.QueryOuterClass.QueryBalanceMismatchesRequest,
              injective.exchange.v1beta1.QueryOuterClass.QueryBalanceMismatchesResponse>(
                service, METHODID_BALANCE_MISMATCHES)))
        .addMethod(
          getBalanceWithBalanceHoldsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              injective.exchange.v1beta1.QueryOuterClass.QueryBalanceWithBalanceHoldsRequest,
              injective.exchange.v1beta1.QueryOuterClass.QueryBalanceWithBalanceHoldsResponse>(
                service, METHODID_BALANCE_WITH_BALANCE_HOLDS)))
        .addMethod(
          getFeeDiscountTierStatisticsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              injective.exchange.v1beta1.QueryOuterClass.QueryFeeDiscountTierStatisticsRequest,
              injective.exchange.v1beta1.QueryOuterClass.QueryFeeDiscountTierStatisticsResponse>(
                service, METHODID_FEE_DISCOUNT_TIER_STATISTICS)))
        .addMethod(
          getMitoVaultInfosMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              injective.exchange.v1beta1.QueryOuterClass.MitoVaultInfosRequest,
              injective.exchange.v1beta1.QueryOuterClass.MitoVaultInfosResponse>(
                service, METHODID_MITO_VAULT_INFOS)))
        .addMethod(
          getQueryMarketIDFromVaultMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              injective.exchange.v1beta1.QueryOuterClass.QueryMarketIDFromVaultRequest,
              injective.exchange.v1beta1.QueryOuterClass.QueryMarketIDFromVaultResponse>(
                service, METHODID_QUERY_MARKET_IDFROM_VAULT)))
        .addMethod(
          getHistoricalTradeRecordsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              injective.exchange.v1beta1.QueryOuterClass.QueryHistoricalTradeRecordsRequest,
              injective.exchange.v1beta1.QueryOuterClass.QueryHistoricalTradeRecordsResponse>(
                service, METHODID_HISTORICAL_TRADE_RECORDS)))
        .addMethod(
          getIsOptedOutOfRewardsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              injective.exchange.v1beta1.QueryOuterClass.QueryIsOptedOutOfRewardsRequest,
              injective.exchange.v1beta1.QueryOuterClass.QueryIsOptedOutOfRewardsResponse>(
                service, METHODID_IS_OPTED_OUT_OF_REWARDS)))
        .addMethod(
          getOptedOutOfRewardsAccountsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              injective.exchange.v1beta1.QueryOuterClass.QueryOptedOutOfRewardsAccountsRequest,
              injective.exchange.v1beta1.QueryOuterClass.QueryOptedOutOfRewardsAccountsResponse>(
                service, METHODID_OPTED_OUT_OF_REWARDS_ACCOUNTS)))
        .addMethod(
          getMarketVolatilityMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              injective.exchange.v1beta1.QueryOuterClass.QueryMarketVolatilityRequest,
              injective.exchange.v1beta1.QueryOuterClass.QueryMarketVolatilityResponse>(
                service, METHODID_MARKET_VOLATILITY)))
        .addMethod(
          getBinaryOptionsMarketsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              injective.exchange.v1beta1.QueryOuterClass.QueryBinaryMarketsRequest,
              injective.exchange.v1beta1.QueryOuterClass.QueryBinaryMarketsResponse>(
                service, METHODID_BINARY_OPTIONS_MARKETS)))
        .addMethod(
          getTraderDerivativeConditionalOrdersMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              injective.exchange.v1beta1.QueryOuterClass.QueryTraderDerivativeConditionalOrdersRequest,
              injective.exchange.v1beta1.QueryOuterClass.QueryTraderDerivativeConditionalOrdersResponse>(
                service, METHODID_TRADER_DERIVATIVE_CONDITIONAL_ORDERS)))
        .addMethod(
          getMarketAtomicExecutionFeeMultiplierMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              injective.exchange.v1beta1.QueryOuterClass.QueryMarketAtomicExecutionFeeMultiplierRequest,
              injective.exchange.v1beta1.QueryOuterClass.QueryMarketAtomicExecutionFeeMultiplierResponse>(
                service, METHODID_MARKET_ATOMIC_EXECUTION_FEE_MULTIPLIER)))
        .build();
  }

  private static abstract class QueryBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    QueryBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return injective.exchange.v1beta1.QueryOuterClass.getDescriptor();
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
              .addMethod(getQueryExchangeParamsMethod())
              .addMethod(getSubaccountDepositsMethod())
              .addMethod(getSubaccountDepositMethod())
              .addMethod(getExchangeBalancesMethod())
              .addMethod(getAggregateVolumeMethod())
              .addMethod(getAggregateVolumesMethod())
              .addMethod(getAggregateMarketVolumeMethod())
              .addMethod(getAggregateMarketVolumesMethod())
              .addMethod(getDenomDecimalMethod())
              .addMethod(getDenomDecimalsMethod())
              .addMethod(getSpotMarketsMethod())
              .addMethod(getSpotMarketMethod())
              .addMethod(getFullSpotMarketsMethod())
              .addMethod(getFullSpotMarketMethod())
              .addMethod(getSpotOrderbookMethod())
              .addMethod(getTraderSpotOrdersMethod())
              .addMethod(getAccountAddressSpotOrdersMethod())
              .addMethod(getSpotOrdersByHashesMethod())
              .addMethod(getSubaccountOrdersMethod())
              .addMethod(getTraderSpotTransientOrdersMethod())
              .addMethod(getSpotMidPriceAndTOBMethod())
              .addMethod(getDerivativeMidPriceAndTOBMethod())
              .addMethod(getDerivativeOrderbookMethod())
              .addMethod(getTraderDerivativeOrdersMethod())
              .addMethod(getAccountAddressDerivativeOrdersMethod())
              .addMethod(getDerivativeOrdersByHashesMethod())
              .addMethod(getTraderDerivativeTransientOrdersMethod())
              .addMethod(getDerivativeMarketsMethod())
              .addMethod(getDerivativeMarketMethod())
              .addMethod(getDerivativeMarketAddressMethod())
              .addMethod(getSubaccountTradeNonceMethod())
              .addMethod(getExchangeModuleStateMethod())
              .addMethod(getPositionsMethod())
              .addMethod(getSubaccountPositionsMethod())
              .addMethod(getSubaccountPositionInMarketMethod())
              .addMethod(getSubaccountEffectivePositionInMarketMethod())
              .addMethod(getPerpetualMarketInfoMethod())
              .addMethod(getExpiryFuturesMarketInfoMethod())
              .addMethod(getPerpetualMarketFundingMethod())
              .addMethod(getSubaccountOrderMetadataMethod())
              .addMethod(getTradeRewardPointsMethod())
              .addMethod(getPendingTradeRewardPointsMethod())
              .addMethod(getTradeRewardCampaignMethod())
              .addMethod(getFeeDiscountAccountInfoMethod())
              .addMethod(getFeeDiscountScheduleMethod())
              .addMethod(getBalanceMismatchesMethod())
              .addMethod(getBalanceWithBalanceHoldsMethod())
              .addMethod(getFeeDiscountTierStatisticsMethod())
              .addMethod(getMitoVaultInfosMethod())
              .addMethod(getQueryMarketIDFromVaultMethod())
              .addMethod(getHistoricalTradeRecordsMethod())
              .addMethod(getIsOptedOutOfRewardsMethod())
              .addMethod(getOptedOutOfRewardsAccountsMethod())
              .addMethod(getMarketVolatilityMethod())
              .addMethod(getBinaryOptionsMarketsMethod())
              .addMethod(getTraderDerivativeConditionalOrdersMethod())
              .addMethod(getMarketAtomicExecutionFeeMultiplierMethod())
              .build();
        }
      }
    }
    return result;
  }
}
