package injective.oracle.v1beta1;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * Query defines the gRPC querier service.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.54.0)",
    comments = "Source: injective/oracle/v1beta1/query.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class QueryGrpc {

  private QueryGrpc() {}

  public static final String SERVICE_NAME = "injective.oracle.v1beta1.Query";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<injective.oracle.v1beta1.QueryOuterClass.QueryParamsRequest,
      injective.oracle.v1beta1.QueryOuterClass.QueryParamsResponse> getParamsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Params",
      requestType = injective.oracle.v1beta1.QueryOuterClass.QueryParamsRequest.class,
      responseType = injective.oracle.v1beta1.QueryOuterClass.QueryParamsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<injective.oracle.v1beta1.QueryOuterClass.QueryParamsRequest,
      injective.oracle.v1beta1.QueryOuterClass.QueryParamsResponse> getParamsMethod() {
    io.grpc.MethodDescriptor<injective.oracle.v1beta1.QueryOuterClass.QueryParamsRequest, injective.oracle.v1beta1.QueryOuterClass.QueryParamsResponse> getParamsMethod;
    if ((getParamsMethod = QueryGrpc.getParamsMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getParamsMethod = QueryGrpc.getParamsMethod) == null) {
          QueryGrpc.getParamsMethod = getParamsMethod =
              io.grpc.MethodDescriptor.<injective.oracle.v1beta1.QueryOuterClass.QueryParamsRequest, injective.oracle.v1beta1.QueryOuterClass.QueryParamsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Params"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  injective.oracle.v1beta1.QueryOuterClass.QueryParamsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  injective.oracle.v1beta1.QueryOuterClass.QueryParamsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("Params"))
              .build();
        }
      }
    }
    return getParamsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<injective.oracle.v1beta1.QueryOuterClass.QueryBandRelayersRequest,
      injective.oracle.v1beta1.QueryOuterClass.QueryBandRelayersResponse> getBandRelayersMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "BandRelayers",
      requestType = injective.oracle.v1beta1.QueryOuterClass.QueryBandRelayersRequest.class,
      responseType = injective.oracle.v1beta1.QueryOuterClass.QueryBandRelayersResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<injective.oracle.v1beta1.QueryOuterClass.QueryBandRelayersRequest,
      injective.oracle.v1beta1.QueryOuterClass.QueryBandRelayersResponse> getBandRelayersMethod() {
    io.grpc.MethodDescriptor<injective.oracle.v1beta1.QueryOuterClass.QueryBandRelayersRequest, injective.oracle.v1beta1.QueryOuterClass.QueryBandRelayersResponse> getBandRelayersMethod;
    if ((getBandRelayersMethod = QueryGrpc.getBandRelayersMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getBandRelayersMethod = QueryGrpc.getBandRelayersMethod) == null) {
          QueryGrpc.getBandRelayersMethod = getBandRelayersMethod =
              io.grpc.MethodDescriptor.<injective.oracle.v1beta1.QueryOuterClass.QueryBandRelayersRequest, injective.oracle.v1beta1.QueryOuterClass.QueryBandRelayersResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "BandRelayers"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  injective.oracle.v1beta1.QueryOuterClass.QueryBandRelayersRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  injective.oracle.v1beta1.QueryOuterClass.QueryBandRelayersResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("BandRelayers"))
              .build();
        }
      }
    }
    return getBandRelayersMethod;
  }

  private static volatile io.grpc.MethodDescriptor<injective.oracle.v1beta1.QueryOuterClass.QueryBandPriceStatesRequest,
      injective.oracle.v1beta1.QueryOuterClass.QueryBandPriceStatesResponse> getBandPriceStatesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "BandPriceStates",
      requestType = injective.oracle.v1beta1.QueryOuterClass.QueryBandPriceStatesRequest.class,
      responseType = injective.oracle.v1beta1.QueryOuterClass.QueryBandPriceStatesResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<injective.oracle.v1beta1.QueryOuterClass.QueryBandPriceStatesRequest,
      injective.oracle.v1beta1.QueryOuterClass.QueryBandPriceStatesResponse> getBandPriceStatesMethod() {
    io.grpc.MethodDescriptor<injective.oracle.v1beta1.QueryOuterClass.QueryBandPriceStatesRequest, injective.oracle.v1beta1.QueryOuterClass.QueryBandPriceStatesResponse> getBandPriceStatesMethod;
    if ((getBandPriceStatesMethod = QueryGrpc.getBandPriceStatesMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getBandPriceStatesMethod = QueryGrpc.getBandPriceStatesMethod) == null) {
          QueryGrpc.getBandPriceStatesMethod = getBandPriceStatesMethod =
              io.grpc.MethodDescriptor.<injective.oracle.v1beta1.QueryOuterClass.QueryBandPriceStatesRequest, injective.oracle.v1beta1.QueryOuterClass.QueryBandPriceStatesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "BandPriceStates"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  injective.oracle.v1beta1.QueryOuterClass.QueryBandPriceStatesRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  injective.oracle.v1beta1.QueryOuterClass.QueryBandPriceStatesResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("BandPriceStates"))
              .build();
        }
      }
    }
    return getBandPriceStatesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<injective.oracle.v1beta1.QueryOuterClass.QueryBandIBCPriceStatesRequest,
      injective.oracle.v1beta1.QueryOuterClass.QueryBandIBCPriceStatesResponse> getBandIBCPriceStatesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "BandIBCPriceStates",
      requestType = injective.oracle.v1beta1.QueryOuterClass.QueryBandIBCPriceStatesRequest.class,
      responseType = injective.oracle.v1beta1.QueryOuterClass.QueryBandIBCPriceStatesResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<injective.oracle.v1beta1.QueryOuterClass.QueryBandIBCPriceStatesRequest,
      injective.oracle.v1beta1.QueryOuterClass.QueryBandIBCPriceStatesResponse> getBandIBCPriceStatesMethod() {
    io.grpc.MethodDescriptor<injective.oracle.v1beta1.QueryOuterClass.QueryBandIBCPriceStatesRequest, injective.oracle.v1beta1.QueryOuterClass.QueryBandIBCPriceStatesResponse> getBandIBCPriceStatesMethod;
    if ((getBandIBCPriceStatesMethod = QueryGrpc.getBandIBCPriceStatesMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getBandIBCPriceStatesMethod = QueryGrpc.getBandIBCPriceStatesMethod) == null) {
          QueryGrpc.getBandIBCPriceStatesMethod = getBandIBCPriceStatesMethod =
              io.grpc.MethodDescriptor.<injective.oracle.v1beta1.QueryOuterClass.QueryBandIBCPriceStatesRequest, injective.oracle.v1beta1.QueryOuterClass.QueryBandIBCPriceStatesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "BandIBCPriceStates"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  injective.oracle.v1beta1.QueryOuterClass.QueryBandIBCPriceStatesRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  injective.oracle.v1beta1.QueryOuterClass.QueryBandIBCPriceStatesResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("BandIBCPriceStates"))
              .build();
        }
      }
    }
    return getBandIBCPriceStatesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<injective.oracle.v1beta1.QueryOuterClass.QueryPriceFeedPriceStatesRequest,
      injective.oracle.v1beta1.QueryOuterClass.QueryPriceFeedPriceStatesResponse> getPriceFeedPriceStatesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "PriceFeedPriceStates",
      requestType = injective.oracle.v1beta1.QueryOuterClass.QueryPriceFeedPriceStatesRequest.class,
      responseType = injective.oracle.v1beta1.QueryOuterClass.QueryPriceFeedPriceStatesResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<injective.oracle.v1beta1.QueryOuterClass.QueryPriceFeedPriceStatesRequest,
      injective.oracle.v1beta1.QueryOuterClass.QueryPriceFeedPriceStatesResponse> getPriceFeedPriceStatesMethod() {
    io.grpc.MethodDescriptor<injective.oracle.v1beta1.QueryOuterClass.QueryPriceFeedPriceStatesRequest, injective.oracle.v1beta1.QueryOuterClass.QueryPriceFeedPriceStatesResponse> getPriceFeedPriceStatesMethod;
    if ((getPriceFeedPriceStatesMethod = QueryGrpc.getPriceFeedPriceStatesMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getPriceFeedPriceStatesMethod = QueryGrpc.getPriceFeedPriceStatesMethod) == null) {
          QueryGrpc.getPriceFeedPriceStatesMethod = getPriceFeedPriceStatesMethod =
              io.grpc.MethodDescriptor.<injective.oracle.v1beta1.QueryOuterClass.QueryPriceFeedPriceStatesRequest, injective.oracle.v1beta1.QueryOuterClass.QueryPriceFeedPriceStatesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "PriceFeedPriceStates"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  injective.oracle.v1beta1.QueryOuterClass.QueryPriceFeedPriceStatesRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  injective.oracle.v1beta1.QueryOuterClass.QueryPriceFeedPriceStatesResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("PriceFeedPriceStates"))
              .build();
        }
      }
    }
    return getPriceFeedPriceStatesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<injective.oracle.v1beta1.QueryOuterClass.QueryCoinbasePriceStatesRequest,
      injective.oracle.v1beta1.QueryOuterClass.QueryCoinbasePriceStatesResponse> getCoinbasePriceStatesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CoinbasePriceStates",
      requestType = injective.oracle.v1beta1.QueryOuterClass.QueryCoinbasePriceStatesRequest.class,
      responseType = injective.oracle.v1beta1.QueryOuterClass.QueryCoinbasePriceStatesResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<injective.oracle.v1beta1.QueryOuterClass.QueryCoinbasePriceStatesRequest,
      injective.oracle.v1beta1.QueryOuterClass.QueryCoinbasePriceStatesResponse> getCoinbasePriceStatesMethod() {
    io.grpc.MethodDescriptor<injective.oracle.v1beta1.QueryOuterClass.QueryCoinbasePriceStatesRequest, injective.oracle.v1beta1.QueryOuterClass.QueryCoinbasePriceStatesResponse> getCoinbasePriceStatesMethod;
    if ((getCoinbasePriceStatesMethod = QueryGrpc.getCoinbasePriceStatesMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getCoinbasePriceStatesMethod = QueryGrpc.getCoinbasePriceStatesMethod) == null) {
          QueryGrpc.getCoinbasePriceStatesMethod = getCoinbasePriceStatesMethod =
              io.grpc.MethodDescriptor.<injective.oracle.v1beta1.QueryOuterClass.QueryCoinbasePriceStatesRequest, injective.oracle.v1beta1.QueryOuterClass.QueryCoinbasePriceStatesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CoinbasePriceStates"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  injective.oracle.v1beta1.QueryOuterClass.QueryCoinbasePriceStatesRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  injective.oracle.v1beta1.QueryOuterClass.QueryCoinbasePriceStatesResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("CoinbasePriceStates"))
              .build();
        }
      }
    }
    return getCoinbasePriceStatesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<injective.oracle.v1beta1.QueryOuterClass.QueryPythPriceStatesRequest,
      injective.oracle.v1beta1.QueryOuterClass.QueryPythPriceStatesResponse> getPythPriceStatesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "PythPriceStates",
      requestType = injective.oracle.v1beta1.QueryOuterClass.QueryPythPriceStatesRequest.class,
      responseType = injective.oracle.v1beta1.QueryOuterClass.QueryPythPriceStatesResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<injective.oracle.v1beta1.QueryOuterClass.QueryPythPriceStatesRequest,
      injective.oracle.v1beta1.QueryOuterClass.QueryPythPriceStatesResponse> getPythPriceStatesMethod() {
    io.grpc.MethodDescriptor<injective.oracle.v1beta1.QueryOuterClass.QueryPythPriceStatesRequest, injective.oracle.v1beta1.QueryOuterClass.QueryPythPriceStatesResponse> getPythPriceStatesMethod;
    if ((getPythPriceStatesMethod = QueryGrpc.getPythPriceStatesMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getPythPriceStatesMethod = QueryGrpc.getPythPriceStatesMethod) == null) {
          QueryGrpc.getPythPriceStatesMethod = getPythPriceStatesMethod =
              io.grpc.MethodDescriptor.<injective.oracle.v1beta1.QueryOuterClass.QueryPythPriceStatesRequest, injective.oracle.v1beta1.QueryOuterClass.QueryPythPriceStatesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "PythPriceStates"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  injective.oracle.v1beta1.QueryOuterClass.QueryPythPriceStatesRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  injective.oracle.v1beta1.QueryOuterClass.QueryPythPriceStatesResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("PythPriceStates"))
              .build();
        }
      }
    }
    return getPythPriceStatesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<injective.oracle.v1beta1.QueryOuterClass.QueryProviderPriceStateRequest,
      injective.oracle.v1beta1.QueryOuterClass.QueryProviderPriceStateResponse> getProviderPriceStateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ProviderPriceState",
      requestType = injective.oracle.v1beta1.QueryOuterClass.QueryProviderPriceStateRequest.class,
      responseType = injective.oracle.v1beta1.QueryOuterClass.QueryProviderPriceStateResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<injective.oracle.v1beta1.QueryOuterClass.QueryProviderPriceStateRequest,
      injective.oracle.v1beta1.QueryOuterClass.QueryProviderPriceStateResponse> getProviderPriceStateMethod() {
    io.grpc.MethodDescriptor<injective.oracle.v1beta1.QueryOuterClass.QueryProviderPriceStateRequest, injective.oracle.v1beta1.QueryOuterClass.QueryProviderPriceStateResponse> getProviderPriceStateMethod;
    if ((getProviderPriceStateMethod = QueryGrpc.getProviderPriceStateMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getProviderPriceStateMethod = QueryGrpc.getProviderPriceStateMethod) == null) {
          QueryGrpc.getProviderPriceStateMethod = getProviderPriceStateMethod =
              io.grpc.MethodDescriptor.<injective.oracle.v1beta1.QueryOuterClass.QueryProviderPriceStateRequest, injective.oracle.v1beta1.QueryOuterClass.QueryProviderPriceStateResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ProviderPriceState"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  injective.oracle.v1beta1.QueryOuterClass.QueryProviderPriceStateRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  injective.oracle.v1beta1.QueryOuterClass.QueryProviderPriceStateResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("ProviderPriceState"))
              .build();
        }
      }
    }
    return getProviderPriceStateMethod;
  }

  private static volatile io.grpc.MethodDescriptor<injective.oracle.v1beta1.QueryOuterClass.QueryModuleStateRequest,
      injective.oracle.v1beta1.QueryOuterClass.QueryModuleStateResponse> getOracleModuleStateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "OracleModuleState",
      requestType = injective.oracle.v1beta1.QueryOuterClass.QueryModuleStateRequest.class,
      responseType = injective.oracle.v1beta1.QueryOuterClass.QueryModuleStateResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<injective.oracle.v1beta1.QueryOuterClass.QueryModuleStateRequest,
      injective.oracle.v1beta1.QueryOuterClass.QueryModuleStateResponse> getOracleModuleStateMethod() {
    io.grpc.MethodDescriptor<injective.oracle.v1beta1.QueryOuterClass.QueryModuleStateRequest, injective.oracle.v1beta1.QueryOuterClass.QueryModuleStateResponse> getOracleModuleStateMethod;
    if ((getOracleModuleStateMethod = QueryGrpc.getOracleModuleStateMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getOracleModuleStateMethod = QueryGrpc.getOracleModuleStateMethod) == null) {
          QueryGrpc.getOracleModuleStateMethod = getOracleModuleStateMethod =
              io.grpc.MethodDescriptor.<injective.oracle.v1beta1.QueryOuterClass.QueryModuleStateRequest, injective.oracle.v1beta1.QueryOuterClass.QueryModuleStateResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "OracleModuleState"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  injective.oracle.v1beta1.QueryOuterClass.QueryModuleStateRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  injective.oracle.v1beta1.QueryOuterClass.QueryModuleStateResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("OracleModuleState"))
              .build();
        }
      }
    }
    return getOracleModuleStateMethod;
  }

  private static volatile io.grpc.MethodDescriptor<injective.oracle.v1beta1.QueryOuterClass.QueryHistoricalPriceRecordsRequest,
      injective.oracle.v1beta1.QueryOuterClass.QueryHistoricalPriceRecordsResponse> getHistoricalPriceRecordsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "HistoricalPriceRecords",
      requestType = injective.oracle.v1beta1.QueryOuterClass.QueryHistoricalPriceRecordsRequest.class,
      responseType = injective.oracle.v1beta1.QueryOuterClass.QueryHistoricalPriceRecordsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<injective.oracle.v1beta1.QueryOuterClass.QueryHistoricalPriceRecordsRequest,
      injective.oracle.v1beta1.QueryOuterClass.QueryHistoricalPriceRecordsResponse> getHistoricalPriceRecordsMethod() {
    io.grpc.MethodDescriptor<injective.oracle.v1beta1.QueryOuterClass.QueryHistoricalPriceRecordsRequest, injective.oracle.v1beta1.QueryOuterClass.QueryHistoricalPriceRecordsResponse> getHistoricalPriceRecordsMethod;
    if ((getHistoricalPriceRecordsMethod = QueryGrpc.getHistoricalPriceRecordsMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getHistoricalPriceRecordsMethod = QueryGrpc.getHistoricalPriceRecordsMethod) == null) {
          QueryGrpc.getHistoricalPriceRecordsMethod = getHistoricalPriceRecordsMethod =
              io.grpc.MethodDescriptor.<injective.oracle.v1beta1.QueryOuterClass.QueryHistoricalPriceRecordsRequest, injective.oracle.v1beta1.QueryOuterClass.QueryHistoricalPriceRecordsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "HistoricalPriceRecords"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  injective.oracle.v1beta1.QueryOuterClass.QueryHistoricalPriceRecordsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  injective.oracle.v1beta1.QueryOuterClass.QueryHistoricalPriceRecordsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("HistoricalPriceRecords"))
              .build();
        }
      }
    }
    return getHistoricalPriceRecordsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<injective.oracle.v1beta1.QueryOuterClass.QueryOracleVolatilityRequest,
      injective.oracle.v1beta1.QueryOuterClass.QueryOracleVolatilityResponse> getOracleVolatilityMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "OracleVolatility",
      requestType = injective.oracle.v1beta1.QueryOuterClass.QueryOracleVolatilityRequest.class,
      responseType = injective.oracle.v1beta1.QueryOuterClass.QueryOracleVolatilityResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<injective.oracle.v1beta1.QueryOuterClass.QueryOracleVolatilityRequest,
      injective.oracle.v1beta1.QueryOuterClass.QueryOracleVolatilityResponse> getOracleVolatilityMethod() {
    io.grpc.MethodDescriptor<injective.oracle.v1beta1.QueryOuterClass.QueryOracleVolatilityRequest, injective.oracle.v1beta1.QueryOuterClass.QueryOracleVolatilityResponse> getOracleVolatilityMethod;
    if ((getOracleVolatilityMethod = QueryGrpc.getOracleVolatilityMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getOracleVolatilityMethod = QueryGrpc.getOracleVolatilityMethod) == null) {
          QueryGrpc.getOracleVolatilityMethod = getOracleVolatilityMethod =
              io.grpc.MethodDescriptor.<injective.oracle.v1beta1.QueryOuterClass.QueryOracleVolatilityRequest, injective.oracle.v1beta1.QueryOuterClass.QueryOracleVolatilityResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "OracleVolatility"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  injective.oracle.v1beta1.QueryOuterClass.QueryOracleVolatilityRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  injective.oracle.v1beta1.QueryOuterClass.QueryOracleVolatilityResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("OracleVolatility"))
              .build();
        }
      }
    }
    return getOracleVolatilityMethod;
  }

  private static volatile io.grpc.MethodDescriptor<injective.oracle.v1beta1.QueryOuterClass.QueryOracleProvidersInfoRequest,
      injective.oracle.v1beta1.QueryOuterClass.QueryOracleProvidersInfoResponse> getOracleProvidersInfoMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "OracleProvidersInfo",
      requestType = injective.oracle.v1beta1.QueryOuterClass.QueryOracleProvidersInfoRequest.class,
      responseType = injective.oracle.v1beta1.QueryOuterClass.QueryOracleProvidersInfoResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<injective.oracle.v1beta1.QueryOuterClass.QueryOracleProvidersInfoRequest,
      injective.oracle.v1beta1.QueryOuterClass.QueryOracleProvidersInfoResponse> getOracleProvidersInfoMethod() {
    io.grpc.MethodDescriptor<injective.oracle.v1beta1.QueryOuterClass.QueryOracleProvidersInfoRequest, injective.oracle.v1beta1.QueryOuterClass.QueryOracleProvidersInfoResponse> getOracleProvidersInfoMethod;
    if ((getOracleProvidersInfoMethod = QueryGrpc.getOracleProvidersInfoMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getOracleProvidersInfoMethod = QueryGrpc.getOracleProvidersInfoMethod) == null) {
          QueryGrpc.getOracleProvidersInfoMethod = getOracleProvidersInfoMethod =
              io.grpc.MethodDescriptor.<injective.oracle.v1beta1.QueryOuterClass.QueryOracleProvidersInfoRequest, injective.oracle.v1beta1.QueryOuterClass.QueryOracleProvidersInfoResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "OracleProvidersInfo"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  injective.oracle.v1beta1.QueryOuterClass.QueryOracleProvidersInfoRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  injective.oracle.v1beta1.QueryOuterClass.QueryOracleProvidersInfoResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("OracleProvidersInfo"))
              .build();
        }
      }
    }
    return getOracleProvidersInfoMethod;
  }

  private static volatile io.grpc.MethodDescriptor<injective.oracle.v1beta1.QueryOuterClass.QueryOracleProviderPricesRequest,
      injective.oracle.v1beta1.QueryOuterClass.QueryOracleProviderPricesResponse> getOracleProviderPricesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "OracleProviderPrices",
      requestType = injective.oracle.v1beta1.QueryOuterClass.QueryOracleProviderPricesRequest.class,
      responseType = injective.oracle.v1beta1.QueryOuterClass.QueryOracleProviderPricesResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<injective.oracle.v1beta1.QueryOuterClass.QueryOracleProviderPricesRequest,
      injective.oracle.v1beta1.QueryOuterClass.QueryOracleProviderPricesResponse> getOracleProviderPricesMethod() {
    io.grpc.MethodDescriptor<injective.oracle.v1beta1.QueryOuterClass.QueryOracleProviderPricesRequest, injective.oracle.v1beta1.QueryOuterClass.QueryOracleProviderPricesResponse> getOracleProviderPricesMethod;
    if ((getOracleProviderPricesMethod = QueryGrpc.getOracleProviderPricesMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getOracleProviderPricesMethod = QueryGrpc.getOracleProviderPricesMethod) == null) {
          QueryGrpc.getOracleProviderPricesMethod = getOracleProviderPricesMethod =
              io.grpc.MethodDescriptor.<injective.oracle.v1beta1.QueryOuterClass.QueryOracleProviderPricesRequest, injective.oracle.v1beta1.QueryOuterClass.QueryOracleProviderPricesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "OracleProviderPrices"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  injective.oracle.v1beta1.QueryOuterClass.QueryOracleProviderPricesRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  injective.oracle.v1beta1.QueryOuterClass.QueryOracleProviderPricesResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("OracleProviderPrices"))
              .build();
        }
      }
    }
    return getOracleProviderPricesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<injective.oracle.v1beta1.QueryOuterClass.QueryOraclePriceRequest,
      injective.oracle.v1beta1.QueryOuterClass.QueryOraclePriceResponse> getOraclePriceMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "OraclePrice",
      requestType = injective.oracle.v1beta1.QueryOuterClass.QueryOraclePriceRequest.class,
      responseType = injective.oracle.v1beta1.QueryOuterClass.QueryOraclePriceResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<injective.oracle.v1beta1.QueryOuterClass.QueryOraclePriceRequest,
      injective.oracle.v1beta1.QueryOuterClass.QueryOraclePriceResponse> getOraclePriceMethod() {
    io.grpc.MethodDescriptor<injective.oracle.v1beta1.QueryOuterClass.QueryOraclePriceRequest, injective.oracle.v1beta1.QueryOuterClass.QueryOraclePriceResponse> getOraclePriceMethod;
    if ((getOraclePriceMethod = QueryGrpc.getOraclePriceMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getOraclePriceMethod = QueryGrpc.getOraclePriceMethod) == null) {
          QueryGrpc.getOraclePriceMethod = getOraclePriceMethod =
              io.grpc.MethodDescriptor.<injective.oracle.v1beta1.QueryOuterClass.QueryOraclePriceRequest, injective.oracle.v1beta1.QueryOuterClass.QueryOraclePriceResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "OraclePrice"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  injective.oracle.v1beta1.QueryOuterClass.QueryOraclePriceRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  injective.oracle.v1beta1.QueryOuterClass.QueryOraclePriceResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("OraclePrice"))
              .build();
        }
      }
    }
    return getOraclePriceMethod;
  }

  private static volatile io.grpc.MethodDescriptor<injective.oracle.v1beta1.QueryOuterClass.QueryPythPriceRequest,
      injective.oracle.v1beta1.QueryOuterClass.QueryPythPriceResponse> getPythPriceMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "PythPrice",
      requestType = injective.oracle.v1beta1.QueryOuterClass.QueryPythPriceRequest.class,
      responseType = injective.oracle.v1beta1.QueryOuterClass.QueryPythPriceResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<injective.oracle.v1beta1.QueryOuterClass.QueryPythPriceRequest,
      injective.oracle.v1beta1.QueryOuterClass.QueryPythPriceResponse> getPythPriceMethod() {
    io.grpc.MethodDescriptor<injective.oracle.v1beta1.QueryOuterClass.QueryPythPriceRequest, injective.oracle.v1beta1.QueryOuterClass.QueryPythPriceResponse> getPythPriceMethod;
    if ((getPythPriceMethod = QueryGrpc.getPythPriceMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getPythPriceMethod = QueryGrpc.getPythPriceMethod) == null) {
          QueryGrpc.getPythPriceMethod = getPythPriceMethod =
              io.grpc.MethodDescriptor.<injective.oracle.v1beta1.QueryOuterClass.QueryPythPriceRequest, injective.oracle.v1beta1.QueryOuterClass.QueryPythPriceResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "PythPrice"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  injective.oracle.v1beta1.QueryOuterClass.QueryPythPriceRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  injective.oracle.v1beta1.QueryOuterClass.QueryPythPriceResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("PythPrice"))
              .build();
        }
      }
    }
    return getPythPriceMethod;
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
     * Retrieves oracle params
     * </pre>
     */
    default void params(injective.oracle.v1beta1.QueryOuterClass.QueryParamsRequest request,
        io.grpc.stub.StreamObserver<injective.oracle.v1beta1.QueryOuterClass.QueryParamsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getParamsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Retrieves the band relayers
     * </pre>
     */
    default void bandRelayers(injective.oracle.v1beta1.QueryOuterClass.QueryBandRelayersRequest request,
        io.grpc.stub.StreamObserver<injective.oracle.v1beta1.QueryOuterClass.QueryBandRelayersResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getBandRelayersMethod(), responseObserver);
    }

    /**
     * <pre>
     * Retrieves the state for all band price feeds
     * </pre>
     */
    default void bandPriceStates(injective.oracle.v1beta1.QueryOuterClass.QueryBandPriceStatesRequest request,
        io.grpc.stub.StreamObserver<injective.oracle.v1beta1.QueryOuterClass.QueryBandPriceStatesResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getBandPriceStatesMethod(), responseObserver);
    }

    /**
     * <pre>
     * Retrieves the state for all band ibc price feeds
     * </pre>
     */
    default void bandIBCPriceStates(injective.oracle.v1beta1.QueryOuterClass.QueryBandIBCPriceStatesRequest request,
        io.grpc.stub.StreamObserver<injective.oracle.v1beta1.QueryOuterClass.QueryBandIBCPriceStatesResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getBandIBCPriceStatesMethod(), responseObserver);
    }

    /**
     * <pre>
     * Retrieves the state for all price feeds
     * </pre>
     */
    default void priceFeedPriceStates(injective.oracle.v1beta1.QueryOuterClass.QueryPriceFeedPriceStatesRequest request,
        io.grpc.stub.StreamObserver<injective.oracle.v1beta1.QueryOuterClass.QueryPriceFeedPriceStatesResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getPriceFeedPriceStatesMethod(), responseObserver);
    }

    /**
     * <pre>
     * Retrieves the state for all coinbase price feeds
     * </pre>
     */
    default void coinbasePriceStates(injective.oracle.v1beta1.QueryOuterClass.QueryCoinbasePriceStatesRequest request,
        io.grpc.stub.StreamObserver<injective.oracle.v1beta1.QueryOuterClass.QueryCoinbasePriceStatesResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCoinbasePriceStatesMethod(), responseObserver);
    }

    /**
     * <pre>
     * Retrieves the state for all pyth price feeds
     * </pre>
     */
    default void pythPriceStates(injective.oracle.v1beta1.QueryOuterClass.QueryPythPriceStatesRequest request,
        io.grpc.stub.StreamObserver<injective.oracle.v1beta1.QueryOuterClass.QueryPythPriceStatesResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getPythPriceStatesMethod(), responseObserver);
    }

    /**
     * <pre>
     * Retrieves the state for all provider price feeds
     * </pre>
     */
    default void providerPriceState(injective.oracle.v1beta1.QueryOuterClass.QueryProviderPriceStateRequest request,
        io.grpc.stub.StreamObserver<injective.oracle.v1beta1.QueryOuterClass.QueryProviderPriceStateResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getProviderPriceStateMethod(), responseObserver);
    }

    /**
     * <pre>
     * Retrieves the entire oracle module's state
     * </pre>
     */
    default void oracleModuleState(injective.oracle.v1beta1.QueryOuterClass.QueryModuleStateRequest request,
        io.grpc.stub.StreamObserver<injective.oracle.v1beta1.QueryOuterClass.QueryModuleStateResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getOracleModuleStateMethod(), responseObserver);
    }

    /**
     * <pre>
     * Retrieves historical price records for a given OracleType and Symbol
     * </pre>
     */
    default void historicalPriceRecords(injective.oracle.v1beta1.QueryOuterClass.QueryHistoricalPriceRecordsRequest request,
        io.grpc.stub.StreamObserver<injective.oracle.v1beta1.QueryOuterClass.QueryHistoricalPriceRecordsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getHistoricalPriceRecordsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Retrieves mixed volatility value for the specified pair of base/quote
     * </pre>
     */
    default void oracleVolatility(injective.oracle.v1beta1.QueryOuterClass.QueryOracleVolatilityRequest request,
        io.grpc.stub.StreamObserver<injective.oracle.v1beta1.QueryOuterClass.QueryOracleVolatilityResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getOracleVolatilityMethod(), responseObserver);
    }

    /**
     */
    default void oracleProvidersInfo(injective.oracle.v1beta1.QueryOuterClass.QueryOracleProvidersInfoRequest request,
        io.grpc.stub.StreamObserver<injective.oracle.v1beta1.QueryOuterClass.QueryOracleProvidersInfoResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getOracleProvidersInfoMethod(), responseObserver);
    }

    /**
     */
    default void oracleProviderPrices(injective.oracle.v1beta1.QueryOuterClass.QueryOracleProviderPricesRequest request,
        io.grpc.stub.StreamObserver<injective.oracle.v1beta1.QueryOuterClass.QueryOracleProviderPricesResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getOracleProviderPricesMethod(), responseObserver);
    }

    /**
     */
    default void oraclePrice(injective.oracle.v1beta1.QueryOuterClass.QueryOraclePriceRequest request,
        io.grpc.stub.StreamObserver<injective.oracle.v1beta1.QueryOuterClass.QueryOraclePriceResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getOraclePriceMethod(), responseObserver);
    }

    /**
     */
    default void pythPrice(injective.oracle.v1beta1.QueryOuterClass.QueryPythPriceRequest request,
        io.grpc.stub.StreamObserver<injective.oracle.v1beta1.QueryOuterClass.QueryPythPriceResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getPythPriceMethod(), responseObserver);
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
     * Retrieves oracle params
     * </pre>
     */
    public void params(injective.oracle.v1beta1.QueryOuterClass.QueryParamsRequest request,
        io.grpc.stub.StreamObserver<injective.oracle.v1beta1.QueryOuterClass.QueryParamsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getParamsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Retrieves the band relayers
     * </pre>
     */
    public void bandRelayers(injective.oracle.v1beta1.QueryOuterClass.QueryBandRelayersRequest request,
        io.grpc.stub.StreamObserver<injective.oracle.v1beta1.QueryOuterClass.QueryBandRelayersResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getBandRelayersMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Retrieves the state for all band price feeds
     * </pre>
     */
    public void bandPriceStates(injective.oracle.v1beta1.QueryOuterClass.QueryBandPriceStatesRequest request,
        io.grpc.stub.StreamObserver<injective.oracle.v1beta1.QueryOuterClass.QueryBandPriceStatesResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getBandPriceStatesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Retrieves the state for all band ibc price feeds
     * </pre>
     */
    public void bandIBCPriceStates(injective.oracle.v1beta1.QueryOuterClass.QueryBandIBCPriceStatesRequest request,
        io.grpc.stub.StreamObserver<injective.oracle.v1beta1.QueryOuterClass.QueryBandIBCPriceStatesResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getBandIBCPriceStatesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Retrieves the state for all price feeds
     * </pre>
     */
    public void priceFeedPriceStates(injective.oracle.v1beta1.QueryOuterClass.QueryPriceFeedPriceStatesRequest request,
        io.grpc.stub.StreamObserver<injective.oracle.v1beta1.QueryOuterClass.QueryPriceFeedPriceStatesResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getPriceFeedPriceStatesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Retrieves the state for all coinbase price feeds
     * </pre>
     */
    public void coinbasePriceStates(injective.oracle.v1beta1.QueryOuterClass.QueryCoinbasePriceStatesRequest request,
        io.grpc.stub.StreamObserver<injective.oracle.v1beta1.QueryOuterClass.QueryCoinbasePriceStatesResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCoinbasePriceStatesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Retrieves the state for all pyth price feeds
     * </pre>
     */
    public void pythPriceStates(injective.oracle.v1beta1.QueryOuterClass.QueryPythPriceStatesRequest request,
        io.grpc.stub.StreamObserver<injective.oracle.v1beta1.QueryOuterClass.QueryPythPriceStatesResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getPythPriceStatesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Retrieves the state for all provider price feeds
     * </pre>
     */
    public void providerPriceState(injective.oracle.v1beta1.QueryOuterClass.QueryProviderPriceStateRequest request,
        io.grpc.stub.StreamObserver<injective.oracle.v1beta1.QueryOuterClass.QueryProviderPriceStateResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getProviderPriceStateMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Retrieves the entire oracle module's state
     * </pre>
     */
    public void oracleModuleState(injective.oracle.v1beta1.QueryOuterClass.QueryModuleStateRequest request,
        io.grpc.stub.StreamObserver<injective.oracle.v1beta1.QueryOuterClass.QueryModuleStateResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getOracleModuleStateMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Retrieves historical price records for a given OracleType and Symbol
     * </pre>
     */
    public void historicalPriceRecords(injective.oracle.v1beta1.QueryOuterClass.QueryHistoricalPriceRecordsRequest request,
        io.grpc.stub.StreamObserver<injective.oracle.v1beta1.QueryOuterClass.QueryHistoricalPriceRecordsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getHistoricalPriceRecordsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Retrieves mixed volatility value for the specified pair of base/quote
     * </pre>
     */
    public void oracleVolatility(injective.oracle.v1beta1.QueryOuterClass.QueryOracleVolatilityRequest request,
        io.grpc.stub.StreamObserver<injective.oracle.v1beta1.QueryOuterClass.QueryOracleVolatilityResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getOracleVolatilityMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void oracleProvidersInfo(injective.oracle.v1beta1.QueryOuterClass.QueryOracleProvidersInfoRequest request,
        io.grpc.stub.StreamObserver<injective.oracle.v1beta1.QueryOuterClass.QueryOracleProvidersInfoResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getOracleProvidersInfoMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void oracleProviderPrices(injective.oracle.v1beta1.QueryOuterClass.QueryOracleProviderPricesRequest request,
        io.grpc.stub.StreamObserver<injective.oracle.v1beta1.QueryOuterClass.QueryOracleProviderPricesResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getOracleProviderPricesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void oraclePrice(injective.oracle.v1beta1.QueryOuterClass.QueryOraclePriceRequest request,
        io.grpc.stub.StreamObserver<injective.oracle.v1beta1.QueryOuterClass.QueryOraclePriceResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getOraclePriceMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void pythPrice(injective.oracle.v1beta1.QueryOuterClass.QueryPythPriceRequest request,
        io.grpc.stub.StreamObserver<injective.oracle.v1beta1.QueryOuterClass.QueryPythPriceResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getPythPriceMethod(), getCallOptions()), request, responseObserver);
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
     * Retrieves oracle params
     * </pre>
     */
    public injective.oracle.v1beta1.QueryOuterClass.QueryParamsResponse params(injective.oracle.v1beta1.QueryOuterClass.QueryParamsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getParamsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Retrieves the band relayers
     * </pre>
     */
    public injective.oracle.v1beta1.QueryOuterClass.QueryBandRelayersResponse bandRelayers(injective.oracle.v1beta1.QueryOuterClass.QueryBandRelayersRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getBandRelayersMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Retrieves the state for all band price feeds
     * </pre>
     */
    public injective.oracle.v1beta1.QueryOuterClass.QueryBandPriceStatesResponse bandPriceStates(injective.oracle.v1beta1.QueryOuterClass.QueryBandPriceStatesRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getBandPriceStatesMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Retrieves the state for all band ibc price feeds
     * </pre>
     */
    public injective.oracle.v1beta1.QueryOuterClass.QueryBandIBCPriceStatesResponse bandIBCPriceStates(injective.oracle.v1beta1.QueryOuterClass.QueryBandIBCPriceStatesRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getBandIBCPriceStatesMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Retrieves the state for all price feeds
     * </pre>
     */
    public injective.oracle.v1beta1.QueryOuterClass.QueryPriceFeedPriceStatesResponse priceFeedPriceStates(injective.oracle.v1beta1.QueryOuterClass.QueryPriceFeedPriceStatesRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getPriceFeedPriceStatesMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Retrieves the state for all coinbase price feeds
     * </pre>
     */
    public injective.oracle.v1beta1.QueryOuterClass.QueryCoinbasePriceStatesResponse coinbasePriceStates(injective.oracle.v1beta1.QueryOuterClass.QueryCoinbasePriceStatesRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCoinbasePriceStatesMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Retrieves the state for all pyth price feeds
     * </pre>
     */
    public injective.oracle.v1beta1.QueryOuterClass.QueryPythPriceStatesResponse pythPriceStates(injective.oracle.v1beta1.QueryOuterClass.QueryPythPriceStatesRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getPythPriceStatesMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Retrieves the state for all provider price feeds
     * </pre>
     */
    public injective.oracle.v1beta1.QueryOuterClass.QueryProviderPriceStateResponse providerPriceState(injective.oracle.v1beta1.QueryOuterClass.QueryProviderPriceStateRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getProviderPriceStateMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Retrieves the entire oracle module's state
     * </pre>
     */
    public injective.oracle.v1beta1.QueryOuterClass.QueryModuleStateResponse oracleModuleState(injective.oracle.v1beta1.QueryOuterClass.QueryModuleStateRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getOracleModuleStateMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Retrieves historical price records for a given OracleType and Symbol
     * </pre>
     */
    public injective.oracle.v1beta1.QueryOuterClass.QueryHistoricalPriceRecordsResponse historicalPriceRecords(injective.oracle.v1beta1.QueryOuterClass.QueryHistoricalPriceRecordsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getHistoricalPriceRecordsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Retrieves mixed volatility value for the specified pair of base/quote
     * </pre>
     */
    public injective.oracle.v1beta1.QueryOuterClass.QueryOracleVolatilityResponse oracleVolatility(injective.oracle.v1beta1.QueryOuterClass.QueryOracleVolatilityRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getOracleVolatilityMethod(), getCallOptions(), request);
    }

    /**
     */
    public injective.oracle.v1beta1.QueryOuterClass.QueryOracleProvidersInfoResponse oracleProvidersInfo(injective.oracle.v1beta1.QueryOuterClass.QueryOracleProvidersInfoRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getOracleProvidersInfoMethod(), getCallOptions(), request);
    }

    /**
     */
    public injective.oracle.v1beta1.QueryOuterClass.QueryOracleProviderPricesResponse oracleProviderPrices(injective.oracle.v1beta1.QueryOuterClass.QueryOracleProviderPricesRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getOracleProviderPricesMethod(), getCallOptions(), request);
    }

    /**
     */
    public injective.oracle.v1beta1.QueryOuterClass.QueryOraclePriceResponse oraclePrice(injective.oracle.v1beta1.QueryOuterClass.QueryOraclePriceRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getOraclePriceMethod(), getCallOptions(), request);
    }

    /**
     */
    public injective.oracle.v1beta1.QueryOuterClass.QueryPythPriceResponse pythPrice(injective.oracle.v1beta1.QueryOuterClass.QueryPythPriceRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getPythPriceMethod(), getCallOptions(), request);
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
     * Retrieves oracle params
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<injective.oracle.v1beta1.QueryOuterClass.QueryParamsResponse> params(
        injective.oracle.v1beta1.QueryOuterClass.QueryParamsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getParamsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Retrieves the band relayers
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<injective.oracle.v1beta1.QueryOuterClass.QueryBandRelayersResponse> bandRelayers(
        injective.oracle.v1beta1.QueryOuterClass.QueryBandRelayersRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getBandRelayersMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Retrieves the state for all band price feeds
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<injective.oracle.v1beta1.QueryOuterClass.QueryBandPriceStatesResponse> bandPriceStates(
        injective.oracle.v1beta1.QueryOuterClass.QueryBandPriceStatesRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getBandPriceStatesMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Retrieves the state for all band ibc price feeds
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<injective.oracle.v1beta1.QueryOuterClass.QueryBandIBCPriceStatesResponse> bandIBCPriceStates(
        injective.oracle.v1beta1.QueryOuterClass.QueryBandIBCPriceStatesRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getBandIBCPriceStatesMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Retrieves the state for all price feeds
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<injective.oracle.v1beta1.QueryOuterClass.QueryPriceFeedPriceStatesResponse> priceFeedPriceStates(
        injective.oracle.v1beta1.QueryOuterClass.QueryPriceFeedPriceStatesRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getPriceFeedPriceStatesMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Retrieves the state for all coinbase price feeds
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<injective.oracle.v1beta1.QueryOuterClass.QueryCoinbasePriceStatesResponse> coinbasePriceStates(
        injective.oracle.v1beta1.QueryOuterClass.QueryCoinbasePriceStatesRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCoinbasePriceStatesMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Retrieves the state for all pyth price feeds
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<injective.oracle.v1beta1.QueryOuterClass.QueryPythPriceStatesResponse> pythPriceStates(
        injective.oracle.v1beta1.QueryOuterClass.QueryPythPriceStatesRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getPythPriceStatesMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Retrieves the state for all provider price feeds
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<injective.oracle.v1beta1.QueryOuterClass.QueryProviderPriceStateResponse> providerPriceState(
        injective.oracle.v1beta1.QueryOuterClass.QueryProviderPriceStateRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getProviderPriceStateMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Retrieves the entire oracle module's state
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<injective.oracle.v1beta1.QueryOuterClass.QueryModuleStateResponse> oracleModuleState(
        injective.oracle.v1beta1.QueryOuterClass.QueryModuleStateRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getOracleModuleStateMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Retrieves historical price records for a given OracleType and Symbol
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<injective.oracle.v1beta1.QueryOuterClass.QueryHistoricalPriceRecordsResponse> historicalPriceRecords(
        injective.oracle.v1beta1.QueryOuterClass.QueryHistoricalPriceRecordsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getHistoricalPriceRecordsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Retrieves mixed volatility value for the specified pair of base/quote
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<injective.oracle.v1beta1.QueryOuterClass.QueryOracleVolatilityResponse> oracleVolatility(
        injective.oracle.v1beta1.QueryOuterClass.QueryOracleVolatilityRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getOracleVolatilityMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<injective.oracle.v1beta1.QueryOuterClass.QueryOracleProvidersInfoResponse> oracleProvidersInfo(
        injective.oracle.v1beta1.QueryOuterClass.QueryOracleProvidersInfoRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getOracleProvidersInfoMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<injective.oracle.v1beta1.QueryOuterClass.QueryOracleProviderPricesResponse> oracleProviderPrices(
        injective.oracle.v1beta1.QueryOuterClass.QueryOracleProviderPricesRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getOracleProviderPricesMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<injective.oracle.v1beta1.QueryOuterClass.QueryOraclePriceResponse> oraclePrice(
        injective.oracle.v1beta1.QueryOuterClass.QueryOraclePriceRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getOraclePriceMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<injective.oracle.v1beta1.QueryOuterClass.QueryPythPriceResponse> pythPrice(
        injective.oracle.v1beta1.QueryOuterClass.QueryPythPriceRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getPythPriceMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_PARAMS = 0;
  private static final int METHODID_BAND_RELAYERS = 1;
  private static final int METHODID_BAND_PRICE_STATES = 2;
  private static final int METHODID_BAND_IBCPRICE_STATES = 3;
  private static final int METHODID_PRICE_FEED_PRICE_STATES = 4;
  private static final int METHODID_COINBASE_PRICE_STATES = 5;
  private static final int METHODID_PYTH_PRICE_STATES = 6;
  private static final int METHODID_PROVIDER_PRICE_STATE = 7;
  private static final int METHODID_ORACLE_MODULE_STATE = 8;
  private static final int METHODID_HISTORICAL_PRICE_RECORDS = 9;
  private static final int METHODID_ORACLE_VOLATILITY = 10;
  private static final int METHODID_ORACLE_PROVIDERS_INFO = 11;
  private static final int METHODID_ORACLE_PROVIDER_PRICES = 12;
  private static final int METHODID_ORACLE_PRICE = 13;
  private static final int METHODID_PYTH_PRICE = 14;

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
          serviceImpl.params((injective.oracle.v1beta1.QueryOuterClass.QueryParamsRequest) request,
              (io.grpc.stub.StreamObserver<injective.oracle.v1beta1.QueryOuterClass.QueryParamsResponse>) responseObserver);
          break;
        case METHODID_BAND_RELAYERS:
          serviceImpl.bandRelayers((injective.oracle.v1beta1.QueryOuterClass.QueryBandRelayersRequest) request,
              (io.grpc.stub.StreamObserver<injective.oracle.v1beta1.QueryOuterClass.QueryBandRelayersResponse>) responseObserver);
          break;
        case METHODID_BAND_PRICE_STATES:
          serviceImpl.bandPriceStates((injective.oracle.v1beta1.QueryOuterClass.QueryBandPriceStatesRequest) request,
              (io.grpc.stub.StreamObserver<injective.oracle.v1beta1.QueryOuterClass.QueryBandPriceStatesResponse>) responseObserver);
          break;
        case METHODID_BAND_IBCPRICE_STATES:
          serviceImpl.bandIBCPriceStates((injective.oracle.v1beta1.QueryOuterClass.QueryBandIBCPriceStatesRequest) request,
              (io.grpc.stub.StreamObserver<injective.oracle.v1beta1.QueryOuterClass.QueryBandIBCPriceStatesResponse>) responseObserver);
          break;
        case METHODID_PRICE_FEED_PRICE_STATES:
          serviceImpl.priceFeedPriceStates((injective.oracle.v1beta1.QueryOuterClass.QueryPriceFeedPriceStatesRequest) request,
              (io.grpc.stub.StreamObserver<injective.oracle.v1beta1.QueryOuterClass.QueryPriceFeedPriceStatesResponse>) responseObserver);
          break;
        case METHODID_COINBASE_PRICE_STATES:
          serviceImpl.coinbasePriceStates((injective.oracle.v1beta1.QueryOuterClass.QueryCoinbasePriceStatesRequest) request,
              (io.grpc.stub.StreamObserver<injective.oracle.v1beta1.QueryOuterClass.QueryCoinbasePriceStatesResponse>) responseObserver);
          break;
        case METHODID_PYTH_PRICE_STATES:
          serviceImpl.pythPriceStates((injective.oracle.v1beta1.QueryOuterClass.QueryPythPriceStatesRequest) request,
              (io.grpc.stub.StreamObserver<injective.oracle.v1beta1.QueryOuterClass.QueryPythPriceStatesResponse>) responseObserver);
          break;
        case METHODID_PROVIDER_PRICE_STATE:
          serviceImpl.providerPriceState((injective.oracle.v1beta1.QueryOuterClass.QueryProviderPriceStateRequest) request,
              (io.grpc.stub.StreamObserver<injective.oracle.v1beta1.QueryOuterClass.QueryProviderPriceStateResponse>) responseObserver);
          break;
        case METHODID_ORACLE_MODULE_STATE:
          serviceImpl.oracleModuleState((injective.oracle.v1beta1.QueryOuterClass.QueryModuleStateRequest) request,
              (io.grpc.stub.StreamObserver<injective.oracle.v1beta1.QueryOuterClass.QueryModuleStateResponse>) responseObserver);
          break;
        case METHODID_HISTORICAL_PRICE_RECORDS:
          serviceImpl.historicalPriceRecords((injective.oracle.v1beta1.QueryOuterClass.QueryHistoricalPriceRecordsRequest) request,
              (io.grpc.stub.StreamObserver<injective.oracle.v1beta1.QueryOuterClass.QueryHistoricalPriceRecordsResponse>) responseObserver);
          break;
        case METHODID_ORACLE_VOLATILITY:
          serviceImpl.oracleVolatility((injective.oracle.v1beta1.QueryOuterClass.QueryOracleVolatilityRequest) request,
              (io.grpc.stub.StreamObserver<injective.oracle.v1beta1.QueryOuterClass.QueryOracleVolatilityResponse>) responseObserver);
          break;
        case METHODID_ORACLE_PROVIDERS_INFO:
          serviceImpl.oracleProvidersInfo((injective.oracle.v1beta1.QueryOuterClass.QueryOracleProvidersInfoRequest) request,
              (io.grpc.stub.StreamObserver<injective.oracle.v1beta1.QueryOuterClass.QueryOracleProvidersInfoResponse>) responseObserver);
          break;
        case METHODID_ORACLE_PROVIDER_PRICES:
          serviceImpl.oracleProviderPrices((injective.oracle.v1beta1.QueryOuterClass.QueryOracleProviderPricesRequest) request,
              (io.grpc.stub.StreamObserver<injective.oracle.v1beta1.QueryOuterClass.QueryOracleProviderPricesResponse>) responseObserver);
          break;
        case METHODID_ORACLE_PRICE:
          serviceImpl.oraclePrice((injective.oracle.v1beta1.QueryOuterClass.QueryOraclePriceRequest) request,
              (io.grpc.stub.StreamObserver<injective.oracle.v1beta1.QueryOuterClass.QueryOraclePriceResponse>) responseObserver);
          break;
        case METHODID_PYTH_PRICE:
          serviceImpl.pythPrice((injective.oracle.v1beta1.QueryOuterClass.QueryPythPriceRequest) request,
              (io.grpc.stub.StreamObserver<injective.oracle.v1beta1.QueryOuterClass.QueryPythPriceResponse>) responseObserver);
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
              injective.oracle.v1beta1.QueryOuterClass.QueryParamsRequest,
              injective.oracle.v1beta1.QueryOuterClass.QueryParamsResponse>(
                service, METHODID_PARAMS)))
        .addMethod(
          getBandRelayersMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              injective.oracle.v1beta1.QueryOuterClass.QueryBandRelayersRequest,
              injective.oracle.v1beta1.QueryOuterClass.QueryBandRelayersResponse>(
                service, METHODID_BAND_RELAYERS)))
        .addMethod(
          getBandPriceStatesMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              injective.oracle.v1beta1.QueryOuterClass.QueryBandPriceStatesRequest,
              injective.oracle.v1beta1.QueryOuterClass.QueryBandPriceStatesResponse>(
                service, METHODID_BAND_PRICE_STATES)))
        .addMethod(
          getBandIBCPriceStatesMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              injective.oracle.v1beta1.QueryOuterClass.QueryBandIBCPriceStatesRequest,
              injective.oracle.v1beta1.QueryOuterClass.QueryBandIBCPriceStatesResponse>(
                service, METHODID_BAND_IBCPRICE_STATES)))
        .addMethod(
          getPriceFeedPriceStatesMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              injective.oracle.v1beta1.QueryOuterClass.QueryPriceFeedPriceStatesRequest,
              injective.oracle.v1beta1.QueryOuterClass.QueryPriceFeedPriceStatesResponse>(
                service, METHODID_PRICE_FEED_PRICE_STATES)))
        .addMethod(
          getCoinbasePriceStatesMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              injective.oracle.v1beta1.QueryOuterClass.QueryCoinbasePriceStatesRequest,
              injective.oracle.v1beta1.QueryOuterClass.QueryCoinbasePriceStatesResponse>(
                service, METHODID_COINBASE_PRICE_STATES)))
        .addMethod(
          getPythPriceStatesMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              injective.oracle.v1beta1.QueryOuterClass.QueryPythPriceStatesRequest,
              injective.oracle.v1beta1.QueryOuterClass.QueryPythPriceStatesResponse>(
                service, METHODID_PYTH_PRICE_STATES)))
        .addMethod(
          getProviderPriceStateMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              injective.oracle.v1beta1.QueryOuterClass.QueryProviderPriceStateRequest,
              injective.oracle.v1beta1.QueryOuterClass.QueryProviderPriceStateResponse>(
                service, METHODID_PROVIDER_PRICE_STATE)))
        .addMethod(
          getOracleModuleStateMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              injective.oracle.v1beta1.QueryOuterClass.QueryModuleStateRequest,
              injective.oracle.v1beta1.QueryOuterClass.QueryModuleStateResponse>(
                service, METHODID_ORACLE_MODULE_STATE)))
        .addMethod(
          getHistoricalPriceRecordsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              injective.oracle.v1beta1.QueryOuterClass.QueryHistoricalPriceRecordsRequest,
              injective.oracle.v1beta1.QueryOuterClass.QueryHistoricalPriceRecordsResponse>(
                service, METHODID_HISTORICAL_PRICE_RECORDS)))
        .addMethod(
          getOracleVolatilityMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              injective.oracle.v1beta1.QueryOuterClass.QueryOracleVolatilityRequest,
              injective.oracle.v1beta1.QueryOuterClass.QueryOracleVolatilityResponse>(
                service, METHODID_ORACLE_VOLATILITY)))
        .addMethod(
          getOracleProvidersInfoMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              injective.oracle.v1beta1.QueryOuterClass.QueryOracleProvidersInfoRequest,
              injective.oracle.v1beta1.QueryOuterClass.QueryOracleProvidersInfoResponse>(
                service, METHODID_ORACLE_PROVIDERS_INFO)))
        .addMethod(
          getOracleProviderPricesMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              injective.oracle.v1beta1.QueryOuterClass.QueryOracleProviderPricesRequest,
              injective.oracle.v1beta1.QueryOuterClass.QueryOracleProviderPricesResponse>(
                service, METHODID_ORACLE_PROVIDER_PRICES)))
        .addMethod(
          getOraclePriceMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              injective.oracle.v1beta1.QueryOuterClass.QueryOraclePriceRequest,
              injective.oracle.v1beta1.QueryOuterClass.QueryOraclePriceResponse>(
                service, METHODID_ORACLE_PRICE)))
        .addMethod(
          getPythPriceMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              injective.oracle.v1beta1.QueryOuterClass.QueryPythPriceRequest,
              injective.oracle.v1beta1.QueryOuterClass.QueryPythPriceResponse>(
                service, METHODID_PYTH_PRICE)))
        .build();
  }

  private static abstract class QueryBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    QueryBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return injective.oracle.v1beta1.QueryOuterClass.getDescriptor();
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
              .addMethod(getBandRelayersMethod())
              .addMethod(getBandPriceStatesMethod())
              .addMethod(getBandIBCPriceStatesMethod())
              .addMethod(getPriceFeedPriceStatesMethod())
              .addMethod(getCoinbasePriceStatesMethod())
              .addMethod(getPythPriceStatesMethod())
              .addMethod(getProviderPriceStateMethod())
              .addMethod(getOracleModuleStateMethod())
              .addMethod(getHistoricalPriceRecordsMethod())
              .addMethod(getOracleVolatilityMethod())
              .addMethod(getOracleProvidersInfoMethod())
              .addMethod(getOracleProviderPricesMethod())
              .addMethod(getOraclePriceMethod())
              .addMethod(getPythPriceMethod())
              .build();
        }
      }
    }
    return result;
  }
}
