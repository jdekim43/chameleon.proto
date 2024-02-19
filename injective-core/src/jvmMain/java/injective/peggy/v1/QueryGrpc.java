package injective.peggy.v1;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * Query defines the gRPC querier service
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.54.0)",
    comments = "Source: injective/peggy/v1/query.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class QueryGrpc {

  private QueryGrpc() {}

  public static final String SERVICE_NAME = "injective.peggy.v1.Query";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<injective.peggy.v1.QueryOuterClass.QueryParamsRequest,
      injective.peggy.v1.QueryOuterClass.QueryParamsResponse> getParamsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Params",
      requestType = injective.peggy.v1.QueryOuterClass.QueryParamsRequest.class,
      responseType = injective.peggy.v1.QueryOuterClass.QueryParamsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<injective.peggy.v1.QueryOuterClass.QueryParamsRequest,
      injective.peggy.v1.QueryOuterClass.QueryParamsResponse> getParamsMethod() {
    io.grpc.MethodDescriptor<injective.peggy.v1.QueryOuterClass.QueryParamsRequest, injective.peggy.v1.QueryOuterClass.QueryParamsResponse> getParamsMethod;
    if ((getParamsMethod = QueryGrpc.getParamsMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getParamsMethod = QueryGrpc.getParamsMethod) == null) {
          QueryGrpc.getParamsMethod = getParamsMethod =
              io.grpc.MethodDescriptor.<injective.peggy.v1.QueryOuterClass.QueryParamsRequest, injective.peggy.v1.QueryOuterClass.QueryParamsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Params"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  injective.peggy.v1.QueryOuterClass.QueryParamsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  injective.peggy.v1.QueryOuterClass.QueryParamsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("Params"))
              .build();
        }
      }
    }
    return getParamsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<injective.peggy.v1.QueryOuterClass.QueryCurrentValsetRequest,
      injective.peggy.v1.QueryOuterClass.QueryCurrentValsetResponse> getCurrentValsetMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CurrentValset",
      requestType = injective.peggy.v1.QueryOuterClass.QueryCurrentValsetRequest.class,
      responseType = injective.peggy.v1.QueryOuterClass.QueryCurrentValsetResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<injective.peggy.v1.QueryOuterClass.QueryCurrentValsetRequest,
      injective.peggy.v1.QueryOuterClass.QueryCurrentValsetResponse> getCurrentValsetMethod() {
    io.grpc.MethodDescriptor<injective.peggy.v1.QueryOuterClass.QueryCurrentValsetRequest, injective.peggy.v1.QueryOuterClass.QueryCurrentValsetResponse> getCurrentValsetMethod;
    if ((getCurrentValsetMethod = QueryGrpc.getCurrentValsetMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getCurrentValsetMethod = QueryGrpc.getCurrentValsetMethod) == null) {
          QueryGrpc.getCurrentValsetMethod = getCurrentValsetMethod =
              io.grpc.MethodDescriptor.<injective.peggy.v1.QueryOuterClass.QueryCurrentValsetRequest, injective.peggy.v1.QueryOuterClass.QueryCurrentValsetResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CurrentValset"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  injective.peggy.v1.QueryOuterClass.QueryCurrentValsetRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  injective.peggy.v1.QueryOuterClass.QueryCurrentValsetResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("CurrentValset"))
              .build();
        }
      }
    }
    return getCurrentValsetMethod;
  }

  private static volatile io.grpc.MethodDescriptor<injective.peggy.v1.QueryOuterClass.QueryValsetRequestRequest,
      injective.peggy.v1.QueryOuterClass.QueryValsetRequestResponse> getValsetRequestMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ValsetRequest",
      requestType = injective.peggy.v1.QueryOuterClass.QueryValsetRequestRequest.class,
      responseType = injective.peggy.v1.QueryOuterClass.QueryValsetRequestResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<injective.peggy.v1.QueryOuterClass.QueryValsetRequestRequest,
      injective.peggy.v1.QueryOuterClass.QueryValsetRequestResponse> getValsetRequestMethod() {
    io.grpc.MethodDescriptor<injective.peggy.v1.QueryOuterClass.QueryValsetRequestRequest, injective.peggy.v1.QueryOuterClass.QueryValsetRequestResponse> getValsetRequestMethod;
    if ((getValsetRequestMethod = QueryGrpc.getValsetRequestMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getValsetRequestMethod = QueryGrpc.getValsetRequestMethod) == null) {
          QueryGrpc.getValsetRequestMethod = getValsetRequestMethod =
              io.grpc.MethodDescriptor.<injective.peggy.v1.QueryOuterClass.QueryValsetRequestRequest, injective.peggy.v1.QueryOuterClass.QueryValsetRequestResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ValsetRequest"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  injective.peggy.v1.QueryOuterClass.QueryValsetRequestRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  injective.peggy.v1.QueryOuterClass.QueryValsetRequestResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("ValsetRequest"))
              .build();
        }
      }
    }
    return getValsetRequestMethod;
  }

  private static volatile io.grpc.MethodDescriptor<injective.peggy.v1.QueryOuterClass.QueryValsetConfirmRequest,
      injective.peggy.v1.QueryOuterClass.QueryValsetConfirmResponse> getValsetConfirmMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ValsetConfirm",
      requestType = injective.peggy.v1.QueryOuterClass.QueryValsetConfirmRequest.class,
      responseType = injective.peggy.v1.QueryOuterClass.QueryValsetConfirmResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<injective.peggy.v1.QueryOuterClass.QueryValsetConfirmRequest,
      injective.peggy.v1.QueryOuterClass.QueryValsetConfirmResponse> getValsetConfirmMethod() {
    io.grpc.MethodDescriptor<injective.peggy.v1.QueryOuterClass.QueryValsetConfirmRequest, injective.peggy.v1.QueryOuterClass.QueryValsetConfirmResponse> getValsetConfirmMethod;
    if ((getValsetConfirmMethod = QueryGrpc.getValsetConfirmMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getValsetConfirmMethod = QueryGrpc.getValsetConfirmMethod) == null) {
          QueryGrpc.getValsetConfirmMethod = getValsetConfirmMethod =
              io.grpc.MethodDescriptor.<injective.peggy.v1.QueryOuterClass.QueryValsetConfirmRequest, injective.peggy.v1.QueryOuterClass.QueryValsetConfirmResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ValsetConfirm"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  injective.peggy.v1.QueryOuterClass.QueryValsetConfirmRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  injective.peggy.v1.QueryOuterClass.QueryValsetConfirmResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("ValsetConfirm"))
              .build();
        }
      }
    }
    return getValsetConfirmMethod;
  }

  private static volatile io.grpc.MethodDescriptor<injective.peggy.v1.QueryOuterClass.QueryValsetConfirmsByNonceRequest,
      injective.peggy.v1.QueryOuterClass.QueryValsetConfirmsByNonceResponse> getValsetConfirmsByNonceMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ValsetConfirmsByNonce",
      requestType = injective.peggy.v1.QueryOuterClass.QueryValsetConfirmsByNonceRequest.class,
      responseType = injective.peggy.v1.QueryOuterClass.QueryValsetConfirmsByNonceResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<injective.peggy.v1.QueryOuterClass.QueryValsetConfirmsByNonceRequest,
      injective.peggy.v1.QueryOuterClass.QueryValsetConfirmsByNonceResponse> getValsetConfirmsByNonceMethod() {
    io.grpc.MethodDescriptor<injective.peggy.v1.QueryOuterClass.QueryValsetConfirmsByNonceRequest, injective.peggy.v1.QueryOuterClass.QueryValsetConfirmsByNonceResponse> getValsetConfirmsByNonceMethod;
    if ((getValsetConfirmsByNonceMethod = QueryGrpc.getValsetConfirmsByNonceMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getValsetConfirmsByNonceMethod = QueryGrpc.getValsetConfirmsByNonceMethod) == null) {
          QueryGrpc.getValsetConfirmsByNonceMethod = getValsetConfirmsByNonceMethod =
              io.grpc.MethodDescriptor.<injective.peggy.v1.QueryOuterClass.QueryValsetConfirmsByNonceRequest, injective.peggy.v1.QueryOuterClass.QueryValsetConfirmsByNonceResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ValsetConfirmsByNonce"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  injective.peggy.v1.QueryOuterClass.QueryValsetConfirmsByNonceRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  injective.peggy.v1.QueryOuterClass.QueryValsetConfirmsByNonceResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("ValsetConfirmsByNonce"))
              .build();
        }
      }
    }
    return getValsetConfirmsByNonceMethod;
  }

  private static volatile io.grpc.MethodDescriptor<injective.peggy.v1.QueryOuterClass.QueryLastValsetRequestsRequest,
      injective.peggy.v1.QueryOuterClass.QueryLastValsetRequestsResponse> getLastValsetRequestsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "LastValsetRequests",
      requestType = injective.peggy.v1.QueryOuterClass.QueryLastValsetRequestsRequest.class,
      responseType = injective.peggy.v1.QueryOuterClass.QueryLastValsetRequestsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<injective.peggy.v1.QueryOuterClass.QueryLastValsetRequestsRequest,
      injective.peggy.v1.QueryOuterClass.QueryLastValsetRequestsResponse> getLastValsetRequestsMethod() {
    io.grpc.MethodDescriptor<injective.peggy.v1.QueryOuterClass.QueryLastValsetRequestsRequest, injective.peggy.v1.QueryOuterClass.QueryLastValsetRequestsResponse> getLastValsetRequestsMethod;
    if ((getLastValsetRequestsMethod = QueryGrpc.getLastValsetRequestsMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getLastValsetRequestsMethod = QueryGrpc.getLastValsetRequestsMethod) == null) {
          QueryGrpc.getLastValsetRequestsMethod = getLastValsetRequestsMethod =
              io.grpc.MethodDescriptor.<injective.peggy.v1.QueryOuterClass.QueryLastValsetRequestsRequest, injective.peggy.v1.QueryOuterClass.QueryLastValsetRequestsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "LastValsetRequests"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  injective.peggy.v1.QueryOuterClass.QueryLastValsetRequestsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  injective.peggy.v1.QueryOuterClass.QueryLastValsetRequestsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("LastValsetRequests"))
              .build();
        }
      }
    }
    return getLastValsetRequestsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<injective.peggy.v1.QueryOuterClass.QueryLastPendingValsetRequestByAddrRequest,
      injective.peggy.v1.QueryOuterClass.QueryLastPendingValsetRequestByAddrResponse> getLastPendingValsetRequestByAddrMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "LastPendingValsetRequestByAddr",
      requestType = injective.peggy.v1.QueryOuterClass.QueryLastPendingValsetRequestByAddrRequest.class,
      responseType = injective.peggy.v1.QueryOuterClass.QueryLastPendingValsetRequestByAddrResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<injective.peggy.v1.QueryOuterClass.QueryLastPendingValsetRequestByAddrRequest,
      injective.peggy.v1.QueryOuterClass.QueryLastPendingValsetRequestByAddrResponse> getLastPendingValsetRequestByAddrMethod() {
    io.grpc.MethodDescriptor<injective.peggy.v1.QueryOuterClass.QueryLastPendingValsetRequestByAddrRequest, injective.peggy.v1.QueryOuterClass.QueryLastPendingValsetRequestByAddrResponse> getLastPendingValsetRequestByAddrMethod;
    if ((getLastPendingValsetRequestByAddrMethod = QueryGrpc.getLastPendingValsetRequestByAddrMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getLastPendingValsetRequestByAddrMethod = QueryGrpc.getLastPendingValsetRequestByAddrMethod) == null) {
          QueryGrpc.getLastPendingValsetRequestByAddrMethod = getLastPendingValsetRequestByAddrMethod =
              io.grpc.MethodDescriptor.<injective.peggy.v1.QueryOuterClass.QueryLastPendingValsetRequestByAddrRequest, injective.peggy.v1.QueryOuterClass.QueryLastPendingValsetRequestByAddrResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "LastPendingValsetRequestByAddr"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  injective.peggy.v1.QueryOuterClass.QueryLastPendingValsetRequestByAddrRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  injective.peggy.v1.QueryOuterClass.QueryLastPendingValsetRequestByAddrResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("LastPendingValsetRequestByAddr"))
              .build();
        }
      }
    }
    return getLastPendingValsetRequestByAddrMethod;
  }

  private static volatile io.grpc.MethodDescriptor<injective.peggy.v1.QueryOuterClass.QueryLastEventByAddrRequest,
      injective.peggy.v1.QueryOuterClass.QueryLastEventByAddrResponse> getLastEventByAddrMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "LastEventByAddr",
      requestType = injective.peggy.v1.QueryOuterClass.QueryLastEventByAddrRequest.class,
      responseType = injective.peggy.v1.QueryOuterClass.QueryLastEventByAddrResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<injective.peggy.v1.QueryOuterClass.QueryLastEventByAddrRequest,
      injective.peggy.v1.QueryOuterClass.QueryLastEventByAddrResponse> getLastEventByAddrMethod() {
    io.grpc.MethodDescriptor<injective.peggy.v1.QueryOuterClass.QueryLastEventByAddrRequest, injective.peggy.v1.QueryOuterClass.QueryLastEventByAddrResponse> getLastEventByAddrMethod;
    if ((getLastEventByAddrMethod = QueryGrpc.getLastEventByAddrMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getLastEventByAddrMethod = QueryGrpc.getLastEventByAddrMethod) == null) {
          QueryGrpc.getLastEventByAddrMethod = getLastEventByAddrMethod =
              io.grpc.MethodDescriptor.<injective.peggy.v1.QueryOuterClass.QueryLastEventByAddrRequest, injective.peggy.v1.QueryOuterClass.QueryLastEventByAddrResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "LastEventByAddr"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  injective.peggy.v1.QueryOuterClass.QueryLastEventByAddrRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  injective.peggy.v1.QueryOuterClass.QueryLastEventByAddrResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("LastEventByAddr"))
              .build();
        }
      }
    }
    return getLastEventByAddrMethod;
  }

  private static volatile io.grpc.MethodDescriptor<injective.peggy.v1.QueryOuterClass.QueryPendingSendToEth,
      injective.peggy.v1.QueryOuterClass.QueryPendingSendToEthResponse> getGetPendingSendToEthMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetPendingSendToEth",
      requestType = injective.peggy.v1.QueryOuterClass.QueryPendingSendToEth.class,
      responseType = injective.peggy.v1.QueryOuterClass.QueryPendingSendToEthResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<injective.peggy.v1.QueryOuterClass.QueryPendingSendToEth,
      injective.peggy.v1.QueryOuterClass.QueryPendingSendToEthResponse> getGetPendingSendToEthMethod() {
    io.grpc.MethodDescriptor<injective.peggy.v1.QueryOuterClass.QueryPendingSendToEth, injective.peggy.v1.QueryOuterClass.QueryPendingSendToEthResponse> getGetPendingSendToEthMethod;
    if ((getGetPendingSendToEthMethod = QueryGrpc.getGetPendingSendToEthMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getGetPendingSendToEthMethod = QueryGrpc.getGetPendingSendToEthMethod) == null) {
          QueryGrpc.getGetPendingSendToEthMethod = getGetPendingSendToEthMethod =
              io.grpc.MethodDescriptor.<injective.peggy.v1.QueryOuterClass.QueryPendingSendToEth, injective.peggy.v1.QueryOuterClass.QueryPendingSendToEthResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetPendingSendToEth"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  injective.peggy.v1.QueryOuterClass.QueryPendingSendToEth.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  injective.peggy.v1.QueryOuterClass.QueryPendingSendToEthResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("GetPendingSendToEth"))
              .build();
        }
      }
    }
    return getGetPendingSendToEthMethod;
  }

  private static volatile io.grpc.MethodDescriptor<injective.peggy.v1.QueryOuterClass.QueryBatchFeeRequest,
      injective.peggy.v1.QueryOuterClass.QueryBatchFeeResponse> getBatchFeesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "BatchFees",
      requestType = injective.peggy.v1.QueryOuterClass.QueryBatchFeeRequest.class,
      responseType = injective.peggy.v1.QueryOuterClass.QueryBatchFeeResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<injective.peggy.v1.QueryOuterClass.QueryBatchFeeRequest,
      injective.peggy.v1.QueryOuterClass.QueryBatchFeeResponse> getBatchFeesMethod() {
    io.grpc.MethodDescriptor<injective.peggy.v1.QueryOuterClass.QueryBatchFeeRequest, injective.peggy.v1.QueryOuterClass.QueryBatchFeeResponse> getBatchFeesMethod;
    if ((getBatchFeesMethod = QueryGrpc.getBatchFeesMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getBatchFeesMethod = QueryGrpc.getBatchFeesMethod) == null) {
          QueryGrpc.getBatchFeesMethod = getBatchFeesMethod =
              io.grpc.MethodDescriptor.<injective.peggy.v1.QueryOuterClass.QueryBatchFeeRequest, injective.peggy.v1.QueryOuterClass.QueryBatchFeeResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "BatchFees"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  injective.peggy.v1.QueryOuterClass.QueryBatchFeeRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  injective.peggy.v1.QueryOuterClass.QueryBatchFeeResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("BatchFees"))
              .build();
        }
      }
    }
    return getBatchFeesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<injective.peggy.v1.QueryOuterClass.QueryOutgoingTxBatchesRequest,
      injective.peggy.v1.QueryOuterClass.QueryOutgoingTxBatchesResponse> getOutgoingTxBatchesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "OutgoingTxBatches",
      requestType = injective.peggy.v1.QueryOuterClass.QueryOutgoingTxBatchesRequest.class,
      responseType = injective.peggy.v1.QueryOuterClass.QueryOutgoingTxBatchesResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<injective.peggy.v1.QueryOuterClass.QueryOutgoingTxBatchesRequest,
      injective.peggy.v1.QueryOuterClass.QueryOutgoingTxBatchesResponse> getOutgoingTxBatchesMethod() {
    io.grpc.MethodDescriptor<injective.peggy.v1.QueryOuterClass.QueryOutgoingTxBatchesRequest, injective.peggy.v1.QueryOuterClass.QueryOutgoingTxBatchesResponse> getOutgoingTxBatchesMethod;
    if ((getOutgoingTxBatchesMethod = QueryGrpc.getOutgoingTxBatchesMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getOutgoingTxBatchesMethod = QueryGrpc.getOutgoingTxBatchesMethod) == null) {
          QueryGrpc.getOutgoingTxBatchesMethod = getOutgoingTxBatchesMethod =
              io.grpc.MethodDescriptor.<injective.peggy.v1.QueryOuterClass.QueryOutgoingTxBatchesRequest, injective.peggy.v1.QueryOuterClass.QueryOutgoingTxBatchesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "OutgoingTxBatches"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  injective.peggy.v1.QueryOuterClass.QueryOutgoingTxBatchesRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  injective.peggy.v1.QueryOuterClass.QueryOutgoingTxBatchesResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("OutgoingTxBatches"))
              .build();
        }
      }
    }
    return getOutgoingTxBatchesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<injective.peggy.v1.QueryOuterClass.QueryLastPendingBatchRequestByAddrRequest,
      injective.peggy.v1.QueryOuterClass.QueryLastPendingBatchRequestByAddrResponse> getLastPendingBatchRequestByAddrMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "LastPendingBatchRequestByAddr",
      requestType = injective.peggy.v1.QueryOuterClass.QueryLastPendingBatchRequestByAddrRequest.class,
      responseType = injective.peggy.v1.QueryOuterClass.QueryLastPendingBatchRequestByAddrResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<injective.peggy.v1.QueryOuterClass.QueryLastPendingBatchRequestByAddrRequest,
      injective.peggy.v1.QueryOuterClass.QueryLastPendingBatchRequestByAddrResponse> getLastPendingBatchRequestByAddrMethod() {
    io.grpc.MethodDescriptor<injective.peggy.v1.QueryOuterClass.QueryLastPendingBatchRequestByAddrRequest, injective.peggy.v1.QueryOuterClass.QueryLastPendingBatchRequestByAddrResponse> getLastPendingBatchRequestByAddrMethod;
    if ((getLastPendingBatchRequestByAddrMethod = QueryGrpc.getLastPendingBatchRequestByAddrMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getLastPendingBatchRequestByAddrMethod = QueryGrpc.getLastPendingBatchRequestByAddrMethod) == null) {
          QueryGrpc.getLastPendingBatchRequestByAddrMethod = getLastPendingBatchRequestByAddrMethod =
              io.grpc.MethodDescriptor.<injective.peggy.v1.QueryOuterClass.QueryLastPendingBatchRequestByAddrRequest, injective.peggy.v1.QueryOuterClass.QueryLastPendingBatchRequestByAddrResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "LastPendingBatchRequestByAddr"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  injective.peggy.v1.QueryOuterClass.QueryLastPendingBatchRequestByAddrRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  injective.peggy.v1.QueryOuterClass.QueryLastPendingBatchRequestByAddrResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("LastPendingBatchRequestByAddr"))
              .build();
        }
      }
    }
    return getLastPendingBatchRequestByAddrMethod;
  }

  private static volatile io.grpc.MethodDescriptor<injective.peggy.v1.QueryOuterClass.QueryBatchRequestByNonceRequest,
      injective.peggy.v1.QueryOuterClass.QueryBatchRequestByNonceResponse> getBatchRequestByNonceMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "BatchRequestByNonce",
      requestType = injective.peggy.v1.QueryOuterClass.QueryBatchRequestByNonceRequest.class,
      responseType = injective.peggy.v1.QueryOuterClass.QueryBatchRequestByNonceResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<injective.peggy.v1.QueryOuterClass.QueryBatchRequestByNonceRequest,
      injective.peggy.v1.QueryOuterClass.QueryBatchRequestByNonceResponse> getBatchRequestByNonceMethod() {
    io.grpc.MethodDescriptor<injective.peggy.v1.QueryOuterClass.QueryBatchRequestByNonceRequest, injective.peggy.v1.QueryOuterClass.QueryBatchRequestByNonceResponse> getBatchRequestByNonceMethod;
    if ((getBatchRequestByNonceMethod = QueryGrpc.getBatchRequestByNonceMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getBatchRequestByNonceMethod = QueryGrpc.getBatchRequestByNonceMethod) == null) {
          QueryGrpc.getBatchRequestByNonceMethod = getBatchRequestByNonceMethod =
              io.grpc.MethodDescriptor.<injective.peggy.v1.QueryOuterClass.QueryBatchRequestByNonceRequest, injective.peggy.v1.QueryOuterClass.QueryBatchRequestByNonceResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "BatchRequestByNonce"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  injective.peggy.v1.QueryOuterClass.QueryBatchRequestByNonceRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  injective.peggy.v1.QueryOuterClass.QueryBatchRequestByNonceResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("BatchRequestByNonce"))
              .build();
        }
      }
    }
    return getBatchRequestByNonceMethod;
  }

  private static volatile io.grpc.MethodDescriptor<injective.peggy.v1.QueryOuterClass.QueryBatchConfirmsRequest,
      injective.peggy.v1.QueryOuterClass.QueryBatchConfirmsResponse> getBatchConfirmsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "BatchConfirms",
      requestType = injective.peggy.v1.QueryOuterClass.QueryBatchConfirmsRequest.class,
      responseType = injective.peggy.v1.QueryOuterClass.QueryBatchConfirmsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<injective.peggy.v1.QueryOuterClass.QueryBatchConfirmsRequest,
      injective.peggy.v1.QueryOuterClass.QueryBatchConfirmsResponse> getBatchConfirmsMethod() {
    io.grpc.MethodDescriptor<injective.peggy.v1.QueryOuterClass.QueryBatchConfirmsRequest, injective.peggy.v1.QueryOuterClass.QueryBatchConfirmsResponse> getBatchConfirmsMethod;
    if ((getBatchConfirmsMethod = QueryGrpc.getBatchConfirmsMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getBatchConfirmsMethod = QueryGrpc.getBatchConfirmsMethod) == null) {
          QueryGrpc.getBatchConfirmsMethod = getBatchConfirmsMethod =
              io.grpc.MethodDescriptor.<injective.peggy.v1.QueryOuterClass.QueryBatchConfirmsRequest, injective.peggy.v1.QueryOuterClass.QueryBatchConfirmsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "BatchConfirms"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  injective.peggy.v1.QueryOuterClass.QueryBatchConfirmsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  injective.peggy.v1.QueryOuterClass.QueryBatchConfirmsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("BatchConfirms"))
              .build();
        }
      }
    }
    return getBatchConfirmsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<injective.peggy.v1.QueryOuterClass.QueryERC20ToDenomRequest,
      injective.peggy.v1.QueryOuterClass.QueryERC20ToDenomResponse> getERC20ToDenomMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ERC20ToDenom",
      requestType = injective.peggy.v1.QueryOuterClass.QueryERC20ToDenomRequest.class,
      responseType = injective.peggy.v1.QueryOuterClass.QueryERC20ToDenomResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<injective.peggy.v1.QueryOuterClass.QueryERC20ToDenomRequest,
      injective.peggy.v1.QueryOuterClass.QueryERC20ToDenomResponse> getERC20ToDenomMethod() {
    io.grpc.MethodDescriptor<injective.peggy.v1.QueryOuterClass.QueryERC20ToDenomRequest, injective.peggy.v1.QueryOuterClass.QueryERC20ToDenomResponse> getERC20ToDenomMethod;
    if ((getERC20ToDenomMethod = QueryGrpc.getERC20ToDenomMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getERC20ToDenomMethod = QueryGrpc.getERC20ToDenomMethod) == null) {
          QueryGrpc.getERC20ToDenomMethod = getERC20ToDenomMethod =
              io.grpc.MethodDescriptor.<injective.peggy.v1.QueryOuterClass.QueryERC20ToDenomRequest, injective.peggy.v1.QueryOuterClass.QueryERC20ToDenomResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ERC20ToDenom"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  injective.peggy.v1.QueryOuterClass.QueryERC20ToDenomRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  injective.peggy.v1.QueryOuterClass.QueryERC20ToDenomResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("ERC20ToDenom"))
              .build();
        }
      }
    }
    return getERC20ToDenomMethod;
  }

  private static volatile io.grpc.MethodDescriptor<injective.peggy.v1.QueryOuterClass.QueryDenomToERC20Request,
      injective.peggy.v1.QueryOuterClass.QueryDenomToERC20Response> getDenomToERC20Method;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DenomToERC20",
      requestType = injective.peggy.v1.QueryOuterClass.QueryDenomToERC20Request.class,
      responseType = injective.peggy.v1.QueryOuterClass.QueryDenomToERC20Response.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<injective.peggy.v1.QueryOuterClass.QueryDenomToERC20Request,
      injective.peggy.v1.QueryOuterClass.QueryDenomToERC20Response> getDenomToERC20Method() {
    io.grpc.MethodDescriptor<injective.peggy.v1.QueryOuterClass.QueryDenomToERC20Request, injective.peggy.v1.QueryOuterClass.QueryDenomToERC20Response> getDenomToERC20Method;
    if ((getDenomToERC20Method = QueryGrpc.getDenomToERC20Method) == null) {
      synchronized (QueryGrpc.class) {
        if ((getDenomToERC20Method = QueryGrpc.getDenomToERC20Method) == null) {
          QueryGrpc.getDenomToERC20Method = getDenomToERC20Method =
              io.grpc.MethodDescriptor.<injective.peggy.v1.QueryOuterClass.QueryDenomToERC20Request, injective.peggy.v1.QueryOuterClass.QueryDenomToERC20Response>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DenomToERC20"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  injective.peggy.v1.QueryOuterClass.QueryDenomToERC20Request.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  injective.peggy.v1.QueryOuterClass.QueryDenomToERC20Response.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("DenomToERC20"))
              .build();
        }
      }
    }
    return getDenomToERC20Method;
  }

  private static volatile io.grpc.MethodDescriptor<injective.peggy.v1.QueryOuterClass.QueryDelegateKeysByValidatorAddress,
      injective.peggy.v1.QueryOuterClass.QueryDelegateKeysByValidatorAddressResponse> getGetDelegateKeyByValidatorMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetDelegateKeyByValidator",
      requestType = injective.peggy.v1.QueryOuterClass.QueryDelegateKeysByValidatorAddress.class,
      responseType = injective.peggy.v1.QueryOuterClass.QueryDelegateKeysByValidatorAddressResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<injective.peggy.v1.QueryOuterClass.QueryDelegateKeysByValidatorAddress,
      injective.peggy.v1.QueryOuterClass.QueryDelegateKeysByValidatorAddressResponse> getGetDelegateKeyByValidatorMethod() {
    io.grpc.MethodDescriptor<injective.peggy.v1.QueryOuterClass.QueryDelegateKeysByValidatorAddress, injective.peggy.v1.QueryOuterClass.QueryDelegateKeysByValidatorAddressResponse> getGetDelegateKeyByValidatorMethod;
    if ((getGetDelegateKeyByValidatorMethod = QueryGrpc.getGetDelegateKeyByValidatorMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getGetDelegateKeyByValidatorMethod = QueryGrpc.getGetDelegateKeyByValidatorMethod) == null) {
          QueryGrpc.getGetDelegateKeyByValidatorMethod = getGetDelegateKeyByValidatorMethod =
              io.grpc.MethodDescriptor.<injective.peggy.v1.QueryOuterClass.QueryDelegateKeysByValidatorAddress, injective.peggy.v1.QueryOuterClass.QueryDelegateKeysByValidatorAddressResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetDelegateKeyByValidator"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  injective.peggy.v1.QueryOuterClass.QueryDelegateKeysByValidatorAddress.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  injective.peggy.v1.QueryOuterClass.QueryDelegateKeysByValidatorAddressResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("GetDelegateKeyByValidator"))
              .build();
        }
      }
    }
    return getGetDelegateKeyByValidatorMethod;
  }

  private static volatile io.grpc.MethodDescriptor<injective.peggy.v1.QueryOuterClass.QueryDelegateKeysByEthAddress,
      injective.peggy.v1.QueryOuterClass.QueryDelegateKeysByEthAddressResponse> getGetDelegateKeyByEthMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetDelegateKeyByEth",
      requestType = injective.peggy.v1.QueryOuterClass.QueryDelegateKeysByEthAddress.class,
      responseType = injective.peggy.v1.QueryOuterClass.QueryDelegateKeysByEthAddressResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<injective.peggy.v1.QueryOuterClass.QueryDelegateKeysByEthAddress,
      injective.peggy.v1.QueryOuterClass.QueryDelegateKeysByEthAddressResponse> getGetDelegateKeyByEthMethod() {
    io.grpc.MethodDescriptor<injective.peggy.v1.QueryOuterClass.QueryDelegateKeysByEthAddress, injective.peggy.v1.QueryOuterClass.QueryDelegateKeysByEthAddressResponse> getGetDelegateKeyByEthMethod;
    if ((getGetDelegateKeyByEthMethod = QueryGrpc.getGetDelegateKeyByEthMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getGetDelegateKeyByEthMethod = QueryGrpc.getGetDelegateKeyByEthMethod) == null) {
          QueryGrpc.getGetDelegateKeyByEthMethod = getGetDelegateKeyByEthMethod =
              io.grpc.MethodDescriptor.<injective.peggy.v1.QueryOuterClass.QueryDelegateKeysByEthAddress, injective.peggy.v1.QueryOuterClass.QueryDelegateKeysByEthAddressResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetDelegateKeyByEth"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  injective.peggy.v1.QueryOuterClass.QueryDelegateKeysByEthAddress.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  injective.peggy.v1.QueryOuterClass.QueryDelegateKeysByEthAddressResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("GetDelegateKeyByEth"))
              .build();
        }
      }
    }
    return getGetDelegateKeyByEthMethod;
  }

  private static volatile io.grpc.MethodDescriptor<injective.peggy.v1.QueryOuterClass.QueryDelegateKeysByOrchestratorAddress,
      injective.peggy.v1.QueryOuterClass.QueryDelegateKeysByOrchestratorAddressResponse> getGetDelegateKeyByOrchestratorMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetDelegateKeyByOrchestrator",
      requestType = injective.peggy.v1.QueryOuterClass.QueryDelegateKeysByOrchestratorAddress.class,
      responseType = injective.peggy.v1.QueryOuterClass.QueryDelegateKeysByOrchestratorAddressResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<injective.peggy.v1.QueryOuterClass.QueryDelegateKeysByOrchestratorAddress,
      injective.peggy.v1.QueryOuterClass.QueryDelegateKeysByOrchestratorAddressResponse> getGetDelegateKeyByOrchestratorMethod() {
    io.grpc.MethodDescriptor<injective.peggy.v1.QueryOuterClass.QueryDelegateKeysByOrchestratorAddress, injective.peggy.v1.QueryOuterClass.QueryDelegateKeysByOrchestratorAddressResponse> getGetDelegateKeyByOrchestratorMethod;
    if ((getGetDelegateKeyByOrchestratorMethod = QueryGrpc.getGetDelegateKeyByOrchestratorMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getGetDelegateKeyByOrchestratorMethod = QueryGrpc.getGetDelegateKeyByOrchestratorMethod) == null) {
          QueryGrpc.getGetDelegateKeyByOrchestratorMethod = getGetDelegateKeyByOrchestratorMethod =
              io.grpc.MethodDescriptor.<injective.peggy.v1.QueryOuterClass.QueryDelegateKeysByOrchestratorAddress, injective.peggy.v1.QueryOuterClass.QueryDelegateKeysByOrchestratorAddressResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetDelegateKeyByOrchestrator"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  injective.peggy.v1.QueryOuterClass.QueryDelegateKeysByOrchestratorAddress.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  injective.peggy.v1.QueryOuterClass.QueryDelegateKeysByOrchestratorAddressResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("GetDelegateKeyByOrchestrator"))
              .build();
        }
      }
    }
    return getGetDelegateKeyByOrchestratorMethod;
  }

  private static volatile io.grpc.MethodDescriptor<injective.peggy.v1.QueryOuterClass.QueryModuleStateRequest,
      injective.peggy.v1.QueryOuterClass.QueryModuleStateResponse> getPeggyModuleStateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "PeggyModuleState",
      requestType = injective.peggy.v1.QueryOuterClass.QueryModuleStateRequest.class,
      responseType = injective.peggy.v1.QueryOuterClass.QueryModuleStateResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<injective.peggy.v1.QueryOuterClass.QueryModuleStateRequest,
      injective.peggy.v1.QueryOuterClass.QueryModuleStateResponse> getPeggyModuleStateMethod() {
    io.grpc.MethodDescriptor<injective.peggy.v1.QueryOuterClass.QueryModuleStateRequest, injective.peggy.v1.QueryOuterClass.QueryModuleStateResponse> getPeggyModuleStateMethod;
    if ((getPeggyModuleStateMethod = QueryGrpc.getPeggyModuleStateMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getPeggyModuleStateMethod = QueryGrpc.getPeggyModuleStateMethod) == null) {
          QueryGrpc.getPeggyModuleStateMethod = getPeggyModuleStateMethod =
              io.grpc.MethodDescriptor.<injective.peggy.v1.QueryOuterClass.QueryModuleStateRequest, injective.peggy.v1.QueryOuterClass.QueryModuleStateResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "PeggyModuleState"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  injective.peggy.v1.QueryOuterClass.QueryModuleStateRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  injective.peggy.v1.QueryOuterClass.QueryModuleStateResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("PeggyModuleState"))
              .build();
        }
      }
    }
    return getPeggyModuleStateMethod;
  }

  private static volatile io.grpc.MethodDescriptor<injective.peggy.v1.QueryOuterClass.MissingNoncesRequest,
      injective.peggy.v1.QueryOuterClass.MissingNoncesResponse> getMissingPeggoNoncesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "MissingPeggoNonces",
      requestType = injective.peggy.v1.QueryOuterClass.MissingNoncesRequest.class,
      responseType = injective.peggy.v1.QueryOuterClass.MissingNoncesResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<injective.peggy.v1.QueryOuterClass.MissingNoncesRequest,
      injective.peggy.v1.QueryOuterClass.MissingNoncesResponse> getMissingPeggoNoncesMethod() {
    io.grpc.MethodDescriptor<injective.peggy.v1.QueryOuterClass.MissingNoncesRequest, injective.peggy.v1.QueryOuterClass.MissingNoncesResponse> getMissingPeggoNoncesMethod;
    if ((getMissingPeggoNoncesMethod = QueryGrpc.getMissingPeggoNoncesMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getMissingPeggoNoncesMethod = QueryGrpc.getMissingPeggoNoncesMethod) == null) {
          QueryGrpc.getMissingPeggoNoncesMethod = getMissingPeggoNoncesMethod =
              io.grpc.MethodDescriptor.<injective.peggy.v1.QueryOuterClass.MissingNoncesRequest, injective.peggy.v1.QueryOuterClass.MissingNoncesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "MissingPeggoNonces"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  injective.peggy.v1.QueryOuterClass.MissingNoncesRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  injective.peggy.v1.QueryOuterClass.MissingNoncesResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("MissingPeggoNonces"))
              .build();
        }
      }
    }
    return getMissingPeggoNoncesMethod;
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
   * Query defines the gRPC querier service
   * </pre>
   */
  public interface AsyncService {

    /**
     * <pre>
     * Deployments queries deployments
     * </pre>
     */
    default void params(injective.peggy.v1.QueryOuterClass.QueryParamsRequest request,
        io.grpc.stub.StreamObserver<injective.peggy.v1.QueryOuterClass.QueryParamsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getParamsMethod(), responseObserver);
    }

    /**
     * <pre>
     * valset
     * </pre>
     */
    default void currentValset(injective.peggy.v1.QueryOuterClass.QueryCurrentValsetRequest request,
        io.grpc.stub.StreamObserver<injective.peggy.v1.QueryOuterClass.QueryCurrentValsetResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCurrentValsetMethod(), responseObserver);
    }

    /**
     */
    default void valsetRequest(injective.peggy.v1.QueryOuterClass.QueryValsetRequestRequest request,
        io.grpc.stub.StreamObserver<injective.peggy.v1.QueryOuterClass.QueryValsetRequestResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getValsetRequestMethod(), responseObserver);
    }

    /**
     */
    default void valsetConfirm(injective.peggy.v1.QueryOuterClass.QueryValsetConfirmRequest request,
        io.grpc.stub.StreamObserver<injective.peggy.v1.QueryOuterClass.QueryValsetConfirmResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getValsetConfirmMethod(), responseObserver);
    }

    /**
     */
    default void valsetConfirmsByNonce(injective.peggy.v1.QueryOuterClass.QueryValsetConfirmsByNonceRequest request,
        io.grpc.stub.StreamObserver<injective.peggy.v1.QueryOuterClass.QueryValsetConfirmsByNonceResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getValsetConfirmsByNonceMethod(), responseObserver);
    }

    /**
     */
    default void lastValsetRequests(injective.peggy.v1.QueryOuterClass.QueryLastValsetRequestsRequest request,
        io.grpc.stub.StreamObserver<injective.peggy.v1.QueryOuterClass.QueryLastValsetRequestsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getLastValsetRequestsMethod(), responseObserver);
    }

    /**
     */
    default void lastPendingValsetRequestByAddr(injective.peggy.v1.QueryOuterClass.QueryLastPendingValsetRequestByAddrRequest request,
        io.grpc.stub.StreamObserver<injective.peggy.v1.QueryOuterClass.QueryLastPendingValsetRequestByAddrResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getLastPendingValsetRequestByAddrMethod(), responseObserver);
    }

    /**
     * <pre>
     * claim
     * </pre>
     */
    default void lastEventByAddr(injective.peggy.v1.QueryOuterClass.QueryLastEventByAddrRequest request,
        io.grpc.stub.StreamObserver<injective.peggy.v1.QueryOuterClass.QueryLastEventByAddrResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getLastEventByAddrMethod(), responseObserver);
    }

    /**
     * <pre>
     * batch
     * </pre>
     */
    default void getPendingSendToEth(injective.peggy.v1.QueryOuterClass.QueryPendingSendToEth request,
        io.grpc.stub.StreamObserver<injective.peggy.v1.QueryOuterClass.QueryPendingSendToEthResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetPendingSendToEthMethod(), responseObserver);
    }

    /**
     */
    default void batchFees(injective.peggy.v1.QueryOuterClass.QueryBatchFeeRequest request,
        io.grpc.stub.StreamObserver<injective.peggy.v1.QueryOuterClass.QueryBatchFeeResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getBatchFeesMethod(), responseObserver);
    }

    /**
     */
    default void outgoingTxBatches(injective.peggy.v1.QueryOuterClass.QueryOutgoingTxBatchesRequest request,
        io.grpc.stub.StreamObserver<injective.peggy.v1.QueryOuterClass.QueryOutgoingTxBatchesResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getOutgoingTxBatchesMethod(), responseObserver);
    }

    /**
     */
    default void lastPendingBatchRequestByAddr(injective.peggy.v1.QueryOuterClass.QueryLastPendingBatchRequestByAddrRequest request,
        io.grpc.stub.StreamObserver<injective.peggy.v1.QueryOuterClass.QueryLastPendingBatchRequestByAddrResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getLastPendingBatchRequestByAddrMethod(), responseObserver);
    }

    /**
     */
    default void batchRequestByNonce(injective.peggy.v1.QueryOuterClass.QueryBatchRequestByNonceRequest request,
        io.grpc.stub.StreamObserver<injective.peggy.v1.QueryOuterClass.QueryBatchRequestByNonceResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getBatchRequestByNonceMethod(), responseObserver);
    }

    /**
     */
    default void batchConfirms(injective.peggy.v1.QueryOuterClass.QueryBatchConfirmsRequest request,
        io.grpc.stub.StreamObserver<injective.peggy.v1.QueryOuterClass.QueryBatchConfirmsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getBatchConfirmsMethod(), responseObserver);
    }

    /**
     */
    default void eRC20ToDenom(injective.peggy.v1.QueryOuterClass.QueryERC20ToDenomRequest request,
        io.grpc.stub.StreamObserver<injective.peggy.v1.QueryOuterClass.QueryERC20ToDenomResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getERC20ToDenomMethod(), responseObserver);
    }

    /**
     */
    default void denomToERC20(injective.peggy.v1.QueryOuterClass.QueryDenomToERC20Request request,
        io.grpc.stub.StreamObserver<injective.peggy.v1.QueryOuterClass.QueryDenomToERC20Response> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDenomToERC20Method(), responseObserver);
    }

    /**
     */
    default void getDelegateKeyByValidator(injective.peggy.v1.QueryOuterClass.QueryDelegateKeysByValidatorAddress request,
        io.grpc.stub.StreamObserver<injective.peggy.v1.QueryOuterClass.QueryDelegateKeysByValidatorAddressResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetDelegateKeyByValidatorMethod(), responseObserver);
    }

    /**
     */
    default void getDelegateKeyByEth(injective.peggy.v1.QueryOuterClass.QueryDelegateKeysByEthAddress request,
        io.grpc.stub.StreamObserver<injective.peggy.v1.QueryOuterClass.QueryDelegateKeysByEthAddressResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetDelegateKeyByEthMethod(), responseObserver);
    }

    /**
     */
    default void getDelegateKeyByOrchestrator(injective.peggy.v1.QueryOuterClass.QueryDelegateKeysByOrchestratorAddress request,
        io.grpc.stub.StreamObserver<injective.peggy.v1.QueryOuterClass.QueryDelegateKeysByOrchestratorAddressResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetDelegateKeyByOrchestratorMethod(), responseObserver);
    }

    /**
     * <pre>
     * Retrieves the entire peggy module's state
     * </pre>
     */
    default void peggyModuleState(injective.peggy.v1.QueryOuterClass.QueryModuleStateRequest request,
        io.grpc.stub.StreamObserver<injective.peggy.v1.QueryOuterClass.QueryModuleStateResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getPeggyModuleStateMethod(), responseObserver);
    }

    /**
     */
    default void missingPeggoNonces(injective.peggy.v1.QueryOuterClass.MissingNoncesRequest request,
        io.grpc.stub.StreamObserver<injective.peggy.v1.QueryOuterClass.MissingNoncesResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getMissingPeggoNoncesMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service Query.
   * <pre>
   * Query defines the gRPC querier service
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
   * Query defines the gRPC querier service
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
     * Deployments queries deployments
     * </pre>
     */
    public void params(injective.peggy.v1.QueryOuterClass.QueryParamsRequest request,
        io.grpc.stub.StreamObserver<injective.peggy.v1.QueryOuterClass.QueryParamsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getParamsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * valset
     * </pre>
     */
    public void currentValset(injective.peggy.v1.QueryOuterClass.QueryCurrentValsetRequest request,
        io.grpc.stub.StreamObserver<injective.peggy.v1.QueryOuterClass.QueryCurrentValsetResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCurrentValsetMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void valsetRequest(injective.peggy.v1.QueryOuterClass.QueryValsetRequestRequest request,
        io.grpc.stub.StreamObserver<injective.peggy.v1.QueryOuterClass.QueryValsetRequestResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getValsetRequestMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void valsetConfirm(injective.peggy.v1.QueryOuterClass.QueryValsetConfirmRequest request,
        io.grpc.stub.StreamObserver<injective.peggy.v1.QueryOuterClass.QueryValsetConfirmResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getValsetConfirmMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void valsetConfirmsByNonce(injective.peggy.v1.QueryOuterClass.QueryValsetConfirmsByNonceRequest request,
        io.grpc.stub.StreamObserver<injective.peggy.v1.QueryOuterClass.QueryValsetConfirmsByNonceResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getValsetConfirmsByNonceMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void lastValsetRequests(injective.peggy.v1.QueryOuterClass.QueryLastValsetRequestsRequest request,
        io.grpc.stub.StreamObserver<injective.peggy.v1.QueryOuterClass.QueryLastValsetRequestsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getLastValsetRequestsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void lastPendingValsetRequestByAddr(injective.peggy.v1.QueryOuterClass.QueryLastPendingValsetRequestByAddrRequest request,
        io.grpc.stub.StreamObserver<injective.peggy.v1.QueryOuterClass.QueryLastPendingValsetRequestByAddrResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getLastPendingValsetRequestByAddrMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * claim
     * </pre>
     */
    public void lastEventByAddr(injective.peggy.v1.QueryOuterClass.QueryLastEventByAddrRequest request,
        io.grpc.stub.StreamObserver<injective.peggy.v1.QueryOuterClass.QueryLastEventByAddrResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getLastEventByAddrMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * batch
     * </pre>
     */
    public void getPendingSendToEth(injective.peggy.v1.QueryOuterClass.QueryPendingSendToEth request,
        io.grpc.stub.StreamObserver<injective.peggy.v1.QueryOuterClass.QueryPendingSendToEthResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetPendingSendToEthMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void batchFees(injective.peggy.v1.QueryOuterClass.QueryBatchFeeRequest request,
        io.grpc.stub.StreamObserver<injective.peggy.v1.QueryOuterClass.QueryBatchFeeResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getBatchFeesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void outgoingTxBatches(injective.peggy.v1.QueryOuterClass.QueryOutgoingTxBatchesRequest request,
        io.grpc.stub.StreamObserver<injective.peggy.v1.QueryOuterClass.QueryOutgoingTxBatchesResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getOutgoingTxBatchesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void lastPendingBatchRequestByAddr(injective.peggy.v1.QueryOuterClass.QueryLastPendingBatchRequestByAddrRequest request,
        io.grpc.stub.StreamObserver<injective.peggy.v1.QueryOuterClass.QueryLastPendingBatchRequestByAddrResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getLastPendingBatchRequestByAddrMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void batchRequestByNonce(injective.peggy.v1.QueryOuterClass.QueryBatchRequestByNonceRequest request,
        io.grpc.stub.StreamObserver<injective.peggy.v1.QueryOuterClass.QueryBatchRequestByNonceResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getBatchRequestByNonceMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void batchConfirms(injective.peggy.v1.QueryOuterClass.QueryBatchConfirmsRequest request,
        io.grpc.stub.StreamObserver<injective.peggy.v1.QueryOuterClass.QueryBatchConfirmsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getBatchConfirmsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void eRC20ToDenom(injective.peggy.v1.QueryOuterClass.QueryERC20ToDenomRequest request,
        io.grpc.stub.StreamObserver<injective.peggy.v1.QueryOuterClass.QueryERC20ToDenomResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getERC20ToDenomMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void denomToERC20(injective.peggy.v1.QueryOuterClass.QueryDenomToERC20Request request,
        io.grpc.stub.StreamObserver<injective.peggy.v1.QueryOuterClass.QueryDenomToERC20Response> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDenomToERC20Method(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getDelegateKeyByValidator(injective.peggy.v1.QueryOuterClass.QueryDelegateKeysByValidatorAddress request,
        io.grpc.stub.StreamObserver<injective.peggy.v1.QueryOuterClass.QueryDelegateKeysByValidatorAddressResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetDelegateKeyByValidatorMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getDelegateKeyByEth(injective.peggy.v1.QueryOuterClass.QueryDelegateKeysByEthAddress request,
        io.grpc.stub.StreamObserver<injective.peggy.v1.QueryOuterClass.QueryDelegateKeysByEthAddressResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetDelegateKeyByEthMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getDelegateKeyByOrchestrator(injective.peggy.v1.QueryOuterClass.QueryDelegateKeysByOrchestratorAddress request,
        io.grpc.stub.StreamObserver<injective.peggy.v1.QueryOuterClass.QueryDelegateKeysByOrchestratorAddressResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetDelegateKeyByOrchestratorMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Retrieves the entire peggy module's state
     * </pre>
     */
    public void peggyModuleState(injective.peggy.v1.QueryOuterClass.QueryModuleStateRequest request,
        io.grpc.stub.StreamObserver<injective.peggy.v1.QueryOuterClass.QueryModuleStateResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getPeggyModuleStateMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void missingPeggoNonces(injective.peggy.v1.QueryOuterClass.MissingNoncesRequest request,
        io.grpc.stub.StreamObserver<injective.peggy.v1.QueryOuterClass.MissingNoncesResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getMissingPeggoNoncesMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service Query.
   * <pre>
   * Query defines the gRPC querier service
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
     * Deployments queries deployments
     * </pre>
     */
    public injective.peggy.v1.QueryOuterClass.QueryParamsResponse params(injective.peggy.v1.QueryOuterClass.QueryParamsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getParamsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * valset
     * </pre>
     */
    public injective.peggy.v1.QueryOuterClass.QueryCurrentValsetResponse currentValset(injective.peggy.v1.QueryOuterClass.QueryCurrentValsetRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCurrentValsetMethod(), getCallOptions(), request);
    }

    /**
     */
    public injective.peggy.v1.QueryOuterClass.QueryValsetRequestResponse valsetRequest(injective.peggy.v1.QueryOuterClass.QueryValsetRequestRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getValsetRequestMethod(), getCallOptions(), request);
    }

    /**
     */
    public injective.peggy.v1.QueryOuterClass.QueryValsetConfirmResponse valsetConfirm(injective.peggy.v1.QueryOuterClass.QueryValsetConfirmRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getValsetConfirmMethod(), getCallOptions(), request);
    }

    /**
     */
    public injective.peggy.v1.QueryOuterClass.QueryValsetConfirmsByNonceResponse valsetConfirmsByNonce(injective.peggy.v1.QueryOuterClass.QueryValsetConfirmsByNonceRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getValsetConfirmsByNonceMethod(), getCallOptions(), request);
    }

    /**
     */
    public injective.peggy.v1.QueryOuterClass.QueryLastValsetRequestsResponse lastValsetRequests(injective.peggy.v1.QueryOuterClass.QueryLastValsetRequestsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getLastValsetRequestsMethod(), getCallOptions(), request);
    }

    /**
     */
    public injective.peggy.v1.QueryOuterClass.QueryLastPendingValsetRequestByAddrResponse lastPendingValsetRequestByAddr(injective.peggy.v1.QueryOuterClass.QueryLastPendingValsetRequestByAddrRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getLastPendingValsetRequestByAddrMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * claim
     * </pre>
     */
    public injective.peggy.v1.QueryOuterClass.QueryLastEventByAddrResponse lastEventByAddr(injective.peggy.v1.QueryOuterClass.QueryLastEventByAddrRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getLastEventByAddrMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * batch
     * </pre>
     */
    public injective.peggy.v1.QueryOuterClass.QueryPendingSendToEthResponse getPendingSendToEth(injective.peggy.v1.QueryOuterClass.QueryPendingSendToEth request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetPendingSendToEthMethod(), getCallOptions(), request);
    }

    /**
     */
    public injective.peggy.v1.QueryOuterClass.QueryBatchFeeResponse batchFees(injective.peggy.v1.QueryOuterClass.QueryBatchFeeRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getBatchFeesMethod(), getCallOptions(), request);
    }

    /**
     */
    public injective.peggy.v1.QueryOuterClass.QueryOutgoingTxBatchesResponse outgoingTxBatches(injective.peggy.v1.QueryOuterClass.QueryOutgoingTxBatchesRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getOutgoingTxBatchesMethod(), getCallOptions(), request);
    }

    /**
     */
    public injective.peggy.v1.QueryOuterClass.QueryLastPendingBatchRequestByAddrResponse lastPendingBatchRequestByAddr(injective.peggy.v1.QueryOuterClass.QueryLastPendingBatchRequestByAddrRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getLastPendingBatchRequestByAddrMethod(), getCallOptions(), request);
    }

    /**
     */
    public injective.peggy.v1.QueryOuterClass.QueryBatchRequestByNonceResponse batchRequestByNonce(injective.peggy.v1.QueryOuterClass.QueryBatchRequestByNonceRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getBatchRequestByNonceMethod(), getCallOptions(), request);
    }

    /**
     */
    public injective.peggy.v1.QueryOuterClass.QueryBatchConfirmsResponse batchConfirms(injective.peggy.v1.QueryOuterClass.QueryBatchConfirmsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getBatchConfirmsMethod(), getCallOptions(), request);
    }

    /**
     */
    public injective.peggy.v1.QueryOuterClass.QueryERC20ToDenomResponse eRC20ToDenom(injective.peggy.v1.QueryOuterClass.QueryERC20ToDenomRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getERC20ToDenomMethod(), getCallOptions(), request);
    }

    /**
     */
    public injective.peggy.v1.QueryOuterClass.QueryDenomToERC20Response denomToERC20(injective.peggy.v1.QueryOuterClass.QueryDenomToERC20Request request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDenomToERC20Method(), getCallOptions(), request);
    }

    /**
     */
    public injective.peggy.v1.QueryOuterClass.QueryDelegateKeysByValidatorAddressResponse getDelegateKeyByValidator(injective.peggy.v1.QueryOuterClass.QueryDelegateKeysByValidatorAddress request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetDelegateKeyByValidatorMethod(), getCallOptions(), request);
    }

    /**
     */
    public injective.peggy.v1.QueryOuterClass.QueryDelegateKeysByEthAddressResponse getDelegateKeyByEth(injective.peggy.v1.QueryOuterClass.QueryDelegateKeysByEthAddress request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetDelegateKeyByEthMethod(), getCallOptions(), request);
    }

    /**
     */
    public injective.peggy.v1.QueryOuterClass.QueryDelegateKeysByOrchestratorAddressResponse getDelegateKeyByOrchestrator(injective.peggy.v1.QueryOuterClass.QueryDelegateKeysByOrchestratorAddress request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetDelegateKeyByOrchestratorMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Retrieves the entire peggy module's state
     * </pre>
     */
    public injective.peggy.v1.QueryOuterClass.QueryModuleStateResponse peggyModuleState(injective.peggy.v1.QueryOuterClass.QueryModuleStateRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getPeggyModuleStateMethod(), getCallOptions(), request);
    }

    /**
     */
    public injective.peggy.v1.QueryOuterClass.MissingNoncesResponse missingPeggoNonces(injective.peggy.v1.QueryOuterClass.MissingNoncesRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getMissingPeggoNoncesMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service Query.
   * <pre>
   * Query defines the gRPC querier service
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
     * Deployments queries deployments
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<injective.peggy.v1.QueryOuterClass.QueryParamsResponse> params(
        injective.peggy.v1.QueryOuterClass.QueryParamsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getParamsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * valset
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<injective.peggy.v1.QueryOuterClass.QueryCurrentValsetResponse> currentValset(
        injective.peggy.v1.QueryOuterClass.QueryCurrentValsetRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCurrentValsetMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<injective.peggy.v1.QueryOuterClass.QueryValsetRequestResponse> valsetRequest(
        injective.peggy.v1.QueryOuterClass.QueryValsetRequestRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getValsetRequestMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<injective.peggy.v1.QueryOuterClass.QueryValsetConfirmResponse> valsetConfirm(
        injective.peggy.v1.QueryOuterClass.QueryValsetConfirmRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getValsetConfirmMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<injective.peggy.v1.QueryOuterClass.QueryValsetConfirmsByNonceResponse> valsetConfirmsByNonce(
        injective.peggy.v1.QueryOuterClass.QueryValsetConfirmsByNonceRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getValsetConfirmsByNonceMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<injective.peggy.v1.QueryOuterClass.QueryLastValsetRequestsResponse> lastValsetRequests(
        injective.peggy.v1.QueryOuterClass.QueryLastValsetRequestsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getLastValsetRequestsMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<injective.peggy.v1.QueryOuterClass.QueryLastPendingValsetRequestByAddrResponse> lastPendingValsetRequestByAddr(
        injective.peggy.v1.QueryOuterClass.QueryLastPendingValsetRequestByAddrRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getLastPendingValsetRequestByAddrMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * claim
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<injective.peggy.v1.QueryOuterClass.QueryLastEventByAddrResponse> lastEventByAddr(
        injective.peggy.v1.QueryOuterClass.QueryLastEventByAddrRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getLastEventByAddrMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * batch
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<injective.peggy.v1.QueryOuterClass.QueryPendingSendToEthResponse> getPendingSendToEth(
        injective.peggy.v1.QueryOuterClass.QueryPendingSendToEth request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetPendingSendToEthMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<injective.peggy.v1.QueryOuterClass.QueryBatchFeeResponse> batchFees(
        injective.peggy.v1.QueryOuterClass.QueryBatchFeeRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getBatchFeesMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<injective.peggy.v1.QueryOuterClass.QueryOutgoingTxBatchesResponse> outgoingTxBatches(
        injective.peggy.v1.QueryOuterClass.QueryOutgoingTxBatchesRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getOutgoingTxBatchesMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<injective.peggy.v1.QueryOuterClass.QueryLastPendingBatchRequestByAddrResponse> lastPendingBatchRequestByAddr(
        injective.peggy.v1.QueryOuterClass.QueryLastPendingBatchRequestByAddrRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getLastPendingBatchRequestByAddrMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<injective.peggy.v1.QueryOuterClass.QueryBatchRequestByNonceResponse> batchRequestByNonce(
        injective.peggy.v1.QueryOuterClass.QueryBatchRequestByNonceRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getBatchRequestByNonceMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<injective.peggy.v1.QueryOuterClass.QueryBatchConfirmsResponse> batchConfirms(
        injective.peggy.v1.QueryOuterClass.QueryBatchConfirmsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getBatchConfirmsMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<injective.peggy.v1.QueryOuterClass.QueryERC20ToDenomResponse> eRC20ToDenom(
        injective.peggy.v1.QueryOuterClass.QueryERC20ToDenomRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getERC20ToDenomMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<injective.peggy.v1.QueryOuterClass.QueryDenomToERC20Response> denomToERC20(
        injective.peggy.v1.QueryOuterClass.QueryDenomToERC20Request request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDenomToERC20Method(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<injective.peggy.v1.QueryOuterClass.QueryDelegateKeysByValidatorAddressResponse> getDelegateKeyByValidator(
        injective.peggy.v1.QueryOuterClass.QueryDelegateKeysByValidatorAddress request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetDelegateKeyByValidatorMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<injective.peggy.v1.QueryOuterClass.QueryDelegateKeysByEthAddressResponse> getDelegateKeyByEth(
        injective.peggy.v1.QueryOuterClass.QueryDelegateKeysByEthAddress request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetDelegateKeyByEthMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<injective.peggy.v1.QueryOuterClass.QueryDelegateKeysByOrchestratorAddressResponse> getDelegateKeyByOrchestrator(
        injective.peggy.v1.QueryOuterClass.QueryDelegateKeysByOrchestratorAddress request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetDelegateKeyByOrchestratorMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Retrieves the entire peggy module's state
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<injective.peggy.v1.QueryOuterClass.QueryModuleStateResponse> peggyModuleState(
        injective.peggy.v1.QueryOuterClass.QueryModuleStateRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getPeggyModuleStateMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<injective.peggy.v1.QueryOuterClass.MissingNoncesResponse> missingPeggoNonces(
        injective.peggy.v1.QueryOuterClass.MissingNoncesRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getMissingPeggoNoncesMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_PARAMS = 0;
  private static final int METHODID_CURRENT_VALSET = 1;
  private static final int METHODID_VALSET_REQUEST = 2;
  private static final int METHODID_VALSET_CONFIRM = 3;
  private static final int METHODID_VALSET_CONFIRMS_BY_NONCE = 4;
  private static final int METHODID_LAST_VALSET_REQUESTS = 5;
  private static final int METHODID_LAST_PENDING_VALSET_REQUEST_BY_ADDR = 6;
  private static final int METHODID_LAST_EVENT_BY_ADDR = 7;
  private static final int METHODID_GET_PENDING_SEND_TO_ETH = 8;
  private static final int METHODID_BATCH_FEES = 9;
  private static final int METHODID_OUTGOING_TX_BATCHES = 10;
  private static final int METHODID_LAST_PENDING_BATCH_REQUEST_BY_ADDR = 11;
  private static final int METHODID_BATCH_REQUEST_BY_NONCE = 12;
  private static final int METHODID_BATCH_CONFIRMS = 13;
  private static final int METHODID_ERC20TO_DENOM = 14;
  private static final int METHODID_DENOM_TO_ERC20 = 15;
  private static final int METHODID_GET_DELEGATE_KEY_BY_VALIDATOR = 16;
  private static final int METHODID_GET_DELEGATE_KEY_BY_ETH = 17;
  private static final int METHODID_GET_DELEGATE_KEY_BY_ORCHESTRATOR = 18;
  private static final int METHODID_PEGGY_MODULE_STATE = 19;
  private static final int METHODID_MISSING_PEGGO_NONCES = 20;

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
          serviceImpl.params((injective.peggy.v1.QueryOuterClass.QueryParamsRequest) request,
              (io.grpc.stub.StreamObserver<injective.peggy.v1.QueryOuterClass.QueryParamsResponse>) responseObserver);
          break;
        case METHODID_CURRENT_VALSET:
          serviceImpl.currentValset((injective.peggy.v1.QueryOuterClass.QueryCurrentValsetRequest) request,
              (io.grpc.stub.StreamObserver<injective.peggy.v1.QueryOuterClass.QueryCurrentValsetResponse>) responseObserver);
          break;
        case METHODID_VALSET_REQUEST:
          serviceImpl.valsetRequest((injective.peggy.v1.QueryOuterClass.QueryValsetRequestRequest) request,
              (io.grpc.stub.StreamObserver<injective.peggy.v1.QueryOuterClass.QueryValsetRequestResponse>) responseObserver);
          break;
        case METHODID_VALSET_CONFIRM:
          serviceImpl.valsetConfirm((injective.peggy.v1.QueryOuterClass.QueryValsetConfirmRequest) request,
              (io.grpc.stub.StreamObserver<injective.peggy.v1.QueryOuterClass.QueryValsetConfirmResponse>) responseObserver);
          break;
        case METHODID_VALSET_CONFIRMS_BY_NONCE:
          serviceImpl.valsetConfirmsByNonce((injective.peggy.v1.QueryOuterClass.QueryValsetConfirmsByNonceRequest) request,
              (io.grpc.stub.StreamObserver<injective.peggy.v1.QueryOuterClass.QueryValsetConfirmsByNonceResponse>) responseObserver);
          break;
        case METHODID_LAST_VALSET_REQUESTS:
          serviceImpl.lastValsetRequests((injective.peggy.v1.QueryOuterClass.QueryLastValsetRequestsRequest) request,
              (io.grpc.stub.StreamObserver<injective.peggy.v1.QueryOuterClass.QueryLastValsetRequestsResponse>) responseObserver);
          break;
        case METHODID_LAST_PENDING_VALSET_REQUEST_BY_ADDR:
          serviceImpl.lastPendingValsetRequestByAddr((injective.peggy.v1.QueryOuterClass.QueryLastPendingValsetRequestByAddrRequest) request,
              (io.grpc.stub.StreamObserver<injective.peggy.v1.QueryOuterClass.QueryLastPendingValsetRequestByAddrResponse>) responseObserver);
          break;
        case METHODID_LAST_EVENT_BY_ADDR:
          serviceImpl.lastEventByAddr((injective.peggy.v1.QueryOuterClass.QueryLastEventByAddrRequest) request,
              (io.grpc.stub.StreamObserver<injective.peggy.v1.QueryOuterClass.QueryLastEventByAddrResponse>) responseObserver);
          break;
        case METHODID_GET_PENDING_SEND_TO_ETH:
          serviceImpl.getPendingSendToEth((injective.peggy.v1.QueryOuterClass.QueryPendingSendToEth) request,
              (io.grpc.stub.StreamObserver<injective.peggy.v1.QueryOuterClass.QueryPendingSendToEthResponse>) responseObserver);
          break;
        case METHODID_BATCH_FEES:
          serviceImpl.batchFees((injective.peggy.v1.QueryOuterClass.QueryBatchFeeRequest) request,
              (io.grpc.stub.StreamObserver<injective.peggy.v1.QueryOuterClass.QueryBatchFeeResponse>) responseObserver);
          break;
        case METHODID_OUTGOING_TX_BATCHES:
          serviceImpl.outgoingTxBatches((injective.peggy.v1.QueryOuterClass.QueryOutgoingTxBatchesRequest) request,
              (io.grpc.stub.StreamObserver<injective.peggy.v1.QueryOuterClass.QueryOutgoingTxBatchesResponse>) responseObserver);
          break;
        case METHODID_LAST_PENDING_BATCH_REQUEST_BY_ADDR:
          serviceImpl.lastPendingBatchRequestByAddr((injective.peggy.v1.QueryOuterClass.QueryLastPendingBatchRequestByAddrRequest) request,
              (io.grpc.stub.StreamObserver<injective.peggy.v1.QueryOuterClass.QueryLastPendingBatchRequestByAddrResponse>) responseObserver);
          break;
        case METHODID_BATCH_REQUEST_BY_NONCE:
          serviceImpl.batchRequestByNonce((injective.peggy.v1.QueryOuterClass.QueryBatchRequestByNonceRequest) request,
              (io.grpc.stub.StreamObserver<injective.peggy.v1.QueryOuterClass.QueryBatchRequestByNonceResponse>) responseObserver);
          break;
        case METHODID_BATCH_CONFIRMS:
          serviceImpl.batchConfirms((injective.peggy.v1.QueryOuterClass.QueryBatchConfirmsRequest) request,
              (io.grpc.stub.StreamObserver<injective.peggy.v1.QueryOuterClass.QueryBatchConfirmsResponse>) responseObserver);
          break;
        case METHODID_ERC20TO_DENOM:
          serviceImpl.eRC20ToDenom((injective.peggy.v1.QueryOuterClass.QueryERC20ToDenomRequest) request,
              (io.grpc.stub.StreamObserver<injective.peggy.v1.QueryOuterClass.QueryERC20ToDenomResponse>) responseObserver);
          break;
        case METHODID_DENOM_TO_ERC20:
          serviceImpl.denomToERC20((injective.peggy.v1.QueryOuterClass.QueryDenomToERC20Request) request,
              (io.grpc.stub.StreamObserver<injective.peggy.v1.QueryOuterClass.QueryDenomToERC20Response>) responseObserver);
          break;
        case METHODID_GET_DELEGATE_KEY_BY_VALIDATOR:
          serviceImpl.getDelegateKeyByValidator((injective.peggy.v1.QueryOuterClass.QueryDelegateKeysByValidatorAddress) request,
              (io.grpc.stub.StreamObserver<injective.peggy.v1.QueryOuterClass.QueryDelegateKeysByValidatorAddressResponse>) responseObserver);
          break;
        case METHODID_GET_DELEGATE_KEY_BY_ETH:
          serviceImpl.getDelegateKeyByEth((injective.peggy.v1.QueryOuterClass.QueryDelegateKeysByEthAddress) request,
              (io.grpc.stub.StreamObserver<injective.peggy.v1.QueryOuterClass.QueryDelegateKeysByEthAddressResponse>) responseObserver);
          break;
        case METHODID_GET_DELEGATE_KEY_BY_ORCHESTRATOR:
          serviceImpl.getDelegateKeyByOrchestrator((injective.peggy.v1.QueryOuterClass.QueryDelegateKeysByOrchestratorAddress) request,
              (io.grpc.stub.StreamObserver<injective.peggy.v1.QueryOuterClass.QueryDelegateKeysByOrchestratorAddressResponse>) responseObserver);
          break;
        case METHODID_PEGGY_MODULE_STATE:
          serviceImpl.peggyModuleState((injective.peggy.v1.QueryOuterClass.QueryModuleStateRequest) request,
              (io.grpc.stub.StreamObserver<injective.peggy.v1.QueryOuterClass.QueryModuleStateResponse>) responseObserver);
          break;
        case METHODID_MISSING_PEGGO_NONCES:
          serviceImpl.missingPeggoNonces((injective.peggy.v1.QueryOuterClass.MissingNoncesRequest) request,
              (io.grpc.stub.StreamObserver<injective.peggy.v1.QueryOuterClass.MissingNoncesResponse>) responseObserver);
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
              injective.peggy.v1.QueryOuterClass.QueryParamsRequest,
              injective.peggy.v1.QueryOuterClass.QueryParamsResponse>(
                service, METHODID_PARAMS)))
        .addMethod(
          getCurrentValsetMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              injective.peggy.v1.QueryOuterClass.QueryCurrentValsetRequest,
              injective.peggy.v1.QueryOuterClass.QueryCurrentValsetResponse>(
                service, METHODID_CURRENT_VALSET)))
        .addMethod(
          getValsetRequestMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              injective.peggy.v1.QueryOuterClass.QueryValsetRequestRequest,
              injective.peggy.v1.QueryOuterClass.QueryValsetRequestResponse>(
                service, METHODID_VALSET_REQUEST)))
        .addMethod(
          getValsetConfirmMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              injective.peggy.v1.QueryOuterClass.QueryValsetConfirmRequest,
              injective.peggy.v1.QueryOuterClass.QueryValsetConfirmResponse>(
                service, METHODID_VALSET_CONFIRM)))
        .addMethod(
          getValsetConfirmsByNonceMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              injective.peggy.v1.QueryOuterClass.QueryValsetConfirmsByNonceRequest,
              injective.peggy.v1.QueryOuterClass.QueryValsetConfirmsByNonceResponse>(
                service, METHODID_VALSET_CONFIRMS_BY_NONCE)))
        .addMethod(
          getLastValsetRequestsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              injective.peggy.v1.QueryOuterClass.QueryLastValsetRequestsRequest,
              injective.peggy.v1.QueryOuterClass.QueryLastValsetRequestsResponse>(
                service, METHODID_LAST_VALSET_REQUESTS)))
        .addMethod(
          getLastPendingValsetRequestByAddrMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              injective.peggy.v1.QueryOuterClass.QueryLastPendingValsetRequestByAddrRequest,
              injective.peggy.v1.QueryOuterClass.QueryLastPendingValsetRequestByAddrResponse>(
                service, METHODID_LAST_PENDING_VALSET_REQUEST_BY_ADDR)))
        .addMethod(
          getLastEventByAddrMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              injective.peggy.v1.QueryOuterClass.QueryLastEventByAddrRequest,
              injective.peggy.v1.QueryOuterClass.QueryLastEventByAddrResponse>(
                service, METHODID_LAST_EVENT_BY_ADDR)))
        .addMethod(
          getGetPendingSendToEthMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              injective.peggy.v1.QueryOuterClass.QueryPendingSendToEth,
              injective.peggy.v1.QueryOuterClass.QueryPendingSendToEthResponse>(
                service, METHODID_GET_PENDING_SEND_TO_ETH)))
        .addMethod(
          getBatchFeesMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              injective.peggy.v1.QueryOuterClass.QueryBatchFeeRequest,
              injective.peggy.v1.QueryOuterClass.QueryBatchFeeResponse>(
                service, METHODID_BATCH_FEES)))
        .addMethod(
          getOutgoingTxBatchesMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              injective.peggy.v1.QueryOuterClass.QueryOutgoingTxBatchesRequest,
              injective.peggy.v1.QueryOuterClass.QueryOutgoingTxBatchesResponse>(
                service, METHODID_OUTGOING_TX_BATCHES)))
        .addMethod(
          getLastPendingBatchRequestByAddrMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              injective.peggy.v1.QueryOuterClass.QueryLastPendingBatchRequestByAddrRequest,
              injective.peggy.v1.QueryOuterClass.QueryLastPendingBatchRequestByAddrResponse>(
                service, METHODID_LAST_PENDING_BATCH_REQUEST_BY_ADDR)))
        .addMethod(
          getBatchRequestByNonceMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              injective.peggy.v1.QueryOuterClass.QueryBatchRequestByNonceRequest,
              injective.peggy.v1.QueryOuterClass.QueryBatchRequestByNonceResponse>(
                service, METHODID_BATCH_REQUEST_BY_NONCE)))
        .addMethod(
          getBatchConfirmsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              injective.peggy.v1.QueryOuterClass.QueryBatchConfirmsRequest,
              injective.peggy.v1.QueryOuterClass.QueryBatchConfirmsResponse>(
                service, METHODID_BATCH_CONFIRMS)))
        .addMethod(
          getERC20ToDenomMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              injective.peggy.v1.QueryOuterClass.QueryERC20ToDenomRequest,
              injective.peggy.v1.QueryOuterClass.QueryERC20ToDenomResponse>(
                service, METHODID_ERC20TO_DENOM)))
        .addMethod(
          getDenomToERC20Method(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              injective.peggy.v1.QueryOuterClass.QueryDenomToERC20Request,
              injective.peggy.v1.QueryOuterClass.QueryDenomToERC20Response>(
                service, METHODID_DENOM_TO_ERC20)))
        .addMethod(
          getGetDelegateKeyByValidatorMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              injective.peggy.v1.QueryOuterClass.QueryDelegateKeysByValidatorAddress,
              injective.peggy.v1.QueryOuterClass.QueryDelegateKeysByValidatorAddressResponse>(
                service, METHODID_GET_DELEGATE_KEY_BY_VALIDATOR)))
        .addMethod(
          getGetDelegateKeyByEthMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              injective.peggy.v1.QueryOuterClass.QueryDelegateKeysByEthAddress,
              injective.peggy.v1.QueryOuterClass.QueryDelegateKeysByEthAddressResponse>(
                service, METHODID_GET_DELEGATE_KEY_BY_ETH)))
        .addMethod(
          getGetDelegateKeyByOrchestratorMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              injective.peggy.v1.QueryOuterClass.QueryDelegateKeysByOrchestratorAddress,
              injective.peggy.v1.QueryOuterClass.QueryDelegateKeysByOrchestratorAddressResponse>(
                service, METHODID_GET_DELEGATE_KEY_BY_ORCHESTRATOR)))
        .addMethod(
          getPeggyModuleStateMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              injective.peggy.v1.QueryOuterClass.QueryModuleStateRequest,
              injective.peggy.v1.QueryOuterClass.QueryModuleStateResponse>(
                service, METHODID_PEGGY_MODULE_STATE)))
        .addMethod(
          getMissingPeggoNoncesMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              injective.peggy.v1.QueryOuterClass.MissingNoncesRequest,
              injective.peggy.v1.QueryOuterClass.MissingNoncesResponse>(
                service, METHODID_MISSING_PEGGO_NONCES)))
        .build();
  }

  private static abstract class QueryBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    QueryBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return injective.peggy.v1.QueryOuterClass.getDescriptor();
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
              .addMethod(getCurrentValsetMethod())
              .addMethod(getValsetRequestMethod())
              .addMethod(getValsetConfirmMethod())
              .addMethod(getValsetConfirmsByNonceMethod())
              .addMethod(getLastValsetRequestsMethod())
              .addMethod(getLastPendingValsetRequestByAddrMethod())
              .addMethod(getLastEventByAddrMethod())
              .addMethod(getGetPendingSendToEthMethod())
              .addMethod(getBatchFeesMethod())
              .addMethod(getOutgoingTxBatchesMethod())
              .addMethod(getLastPendingBatchRequestByAddrMethod())
              .addMethod(getBatchRequestByNonceMethod())
              .addMethod(getBatchConfirmsMethod())
              .addMethod(getERC20ToDenomMethod())
              .addMethod(getDenomToERC20Method())
              .addMethod(getGetDelegateKeyByValidatorMethod())
              .addMethod(getGetDelegateKeyByEthMethod())
              .addMethod(getGetDelegateKeyByOrchestratorMethod())
              .addMethod(getPeggyModuleStateMethod())
              .addMethod(getMissingPeggoNoncesMethod())
              .build();
        }
      }
    }
    return result;
  }
}
