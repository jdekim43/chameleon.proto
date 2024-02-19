package injective.exchange.v1beta1;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * Msg defines the exchange Msg service.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.54.0)",
    comments = "Source: injective/exchange/v1beta1/tx.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class MsgGrpc {

  private MsgGrpc() {}

  public static final String SERVICE_NAME = "injective.exchange.v1beta1.Msg";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<injective.exchange.v1beta1.Tx.MsgDeposit,
      injective.exchange.v1beta1.Tx.MsgDepositResponse> getDepositMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Deposit",
      requestType = injective.exchange.v1beta1.Tx.MsgDeposit.class,
      responseType = injective.exchange.v1beta1.Tx.MsgDepositResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<injective.exchange.v1beta1.Tx.MsgDeposit,
      injective.exchange.v1beta1.Tx.MsgDepositResponse> getDepositMethod() {
    io.grpc.MethodDescriptor<injective.exchange.v1beta1.Tx.MsgDeposit, injective.exchange.v1beta1.Tx.MsgDepositResponse> getDepositMethod;
    if ((getDepositMethod = MsgGrpc.getDepositMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getDepositMethod = MsgGrpc.getDepositMethod) == null) {
          MsgGrpc.getDepositMethod = getDepositMethod =
              io.grpc.MethodDescriptor.<injective.exchange.v1beta1.Tx.MsgDeposit, injective.exchange.v1beta1.Tx.MsgDepositResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Deposit"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  injective.exchange.v1beta1.Tx.MsgDeposit.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  injective.exchange.v1beta1.Tx.MsgDepositResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("Deposit"))
              .build();
        }
      }
    }
    return getDepositMethod;
  }

  private static volatile io.grpc.MethodDescriptor<injective.exchange.v1beta1.Tx.MsgWithdraw,
      injective.exchange.v1beta1.Tx.MsgWithdrawResponse> getWithdrawMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Withdraw",
      requestType = injective.exchange.v1beta1.Tx.MsgWithdraw.class,
      responseType = injective.exchange.v1beta1.Tx.MsgWithdrawResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<injective.exchange.v1beta1.Tx.MsgWithdraw,
      injective.exchange.v1beta1.Tx.MsgWithdrawResponse> getWithdrawMethod() {
    io.grpc.MethodDescriptor<injective.exchange.v1beta1.Tx.MsgWithdraw, injective.exchange.v1beta1.Tx.MsgWithdrawResponse> getWithdrawMethod;
    if ((getWithdrawMethod = MsgGrpc.getWithdrawMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getWithdrawMethod = MsgGrpc.getWithdrawMethod) == null) {
          MsgGrpc.getWithdrawMethod = getWithdrawMethod =
              io.grpc.MethodDescriptor.<injective.exchange.v1beta1.Tx.MsgWithdraw, injective.exchange.v1beta1.Tx.MsgWithdrawResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Withdraw"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  injective.exchange.v1beta1.Tx.MsgWithdraw.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  injective.exchange.v1beta1.Tx.MsgWithdrawResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("Withdraw"))
              .build();
        }
      }
    }
    return getWithdrawMethod;
  }

  private static volatile io.grpc.MethodDescriptor<injective.exchange.v1beta1.Tx.MsgInstantSpotMarketLaunch,
      injective.exchange.v1beta1.Tx.MsgInstantSpotMarketLaunchResponse> getInstantSpotMarketLaunchMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "InstantSpotMarketLaunch",
      requestType = injective.exchange.v1beta1.Tx.MsgInstantSpotMarketLaunch.class,
      responseType = injective.exchange.v1beta1.Tx.MsgInstantSpotMarketLaunchResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<injective.exchange.v1beta1.Tx.MsgInstantSpotMarketLaunch,
      injective.exchange.v1beta1.Tx.MsgInstantSpotMarketLaunchResponse> getInstantSpotMarketLaunchMethod() {
    io.grpc.MethodDescriptor<injective.exchange.v1beta1.Tx.MsgInstantSpotMarketLaunch, injective.exchange.v1beta1.Tx.MsgInstantSpotMarketLaunchResponse> getInstantSpotMarketLaunchMethod;
    if ((getInstantSpotMarketLaunchMethod = MsgGrpc.getInstantSpotMarketLaunchMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getInstantSpotMarketLaunchMethod = MsgGrpc.getInstantSpotMarketLaunchMethod) == null) {
          MsgGrpc.getInstantSpotMarketLaunchMethod = getInstantSpotMarketLaunchMethod =
              io.grpc.MethodDescriptor.<injective.exchange.v1beta1.Tx.MsgInstantSpotMarketLaunch, injective.exchange.v1beta1.Tx.MsgInstantSpotMarketLaunchResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "InstantSpotMarketLaunch"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  injective.exchange.v1beta1.Tx.MsgInstantSpotMarketLaunch.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  injective.exchange.v1beta1.Tx.MsgInstantSpotMarketLaunchResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("InstantSpotMarketLaunch"))
              .build();
        }
      }
    }
    return getInstantSpotMarketLaunchMethod;
  }

  private static volatile io.grpc.MethodDescriptor<injective.exchange.v1beta1.Tx.MsgInstantPerpetualMarketLaunch,
      injective.exchange.v1beta1.Tx.MsgInstantPerpetualMarketLaunchResponse> getInstantPerpetualMarketLaunchMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "InstantPerpetualMarketLaunch",
      requestType = injective.exchange.v1beta1.Tx.MsgInstantPerpetualMarketLaunch.class,
      responseType = injective.exchange.v1beta1.Tx.MsgInstantPerpetualMarketLaunchResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<injective.exchange.v1beta1.Tx.MsgInstantPerpetualMarketLaunch,
      injective.exchange.v1beta1.Tx.MsgInstantPerpetualMarketLaunchResponse> getInstantPerpetualMarketLaunchMethod() {
    io.grpc.MethodDescriptor<injective.exchange.v1beta1.Tx.MsgInstantPerpetualMarketLaunch, injective.exchange.v1beta1.Tx.MsgInstantPerpetualMarketLaunchResponse> getInstantPerpetualMarketLaunchMethod;
    if ((getInstantPerpetualMarketLaunchMethod = MsgGrpc.getInstantPerpetualMarketLaunchMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getInstantPerpetualMarketLaunchMethod = MsgGrpc.getInstantPerpetualMarketLaunchMethod) == null) {
          MsgGrpc.getInstantPerpetualMarketLaunchMethod = getInstantPerpetualMarketLaunchMethod =
              io.grpc.MethodDescriptor.<injective.exchange.v1beta1.Tx.MsgInstantPerpetualMarketLaunch, injective.exchange.v1beta1.Tx.MsgInstantPerpetualMarketLaunchResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "InstantPerpetualMarketLaunch"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  injective.exchange.v1beta1.Tx.MsgInstantPerpetualMarketLaunch.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  injective.exchange.v1beta1.Tx.MsgInstantPerpetualMarketLaunchResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("InstantPerpetualMarketLaunch"))
              .build();
        }
      }
    }
    return getInstantPerpetualMarketLaunchMethod;
  }

  private static volatile io.grpc.MethodDescriptor<injective.exchange.v1beta1.Tx.MsgInstantExpiryFuturesMarketLaunch,
      injective.exchange.v1beta1.Tx.MsgInstantExpiryFuturesMarketLaunchResponse> getInstantExpiryFuturesMarketLaunchMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "InstantExpiryFuturesMarketLaunch",
      requestType = injective.exchange.v1beta1.Tx.MsgInstantExpiryFuturesMarketLaunch.class,
      responseType = injective.exchange.v1beta1.Tx.MsgInstantExpiryFuturesMarketLaunchResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<injective.exchange.v1beta1.Tx.MsgInstantExpiryFuturesMarketLaunch,
      injective.exchange.v1beta1.Tx.MsgInstantExpiryFuturesMarketLaunchResponse> getInstantExpiryFuturesMarketLaunchMethod() {
    io.grpc.MethodDescriptor<injective.exchange.v1beta1.Tx.MsgInstantExpiryFuturesMarketLaunch, injective.exchange.v1beta1.Tx.MsgInstantExpiryFuturesMarketLaunchResponse> getInstantExpiryFuturesMarketLaunchMethod;
    if ((getInstantExpiryFuturesMarketLaunchMethod = MsgGrpc.getInstantExpiryFuturesMarketLaunchMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getInstantExpiryFuturesMarketLaunchMethod = MsgGrpc.getInstantExpiryFuturesMarketLaunchMethod) == null) {
          MsgGrpc.getInstantExpiryFuturesMarketLaunchMethod = getInstantExpiryFuturesMarketLaunchMethod =
              io.grpc.MethodDescriptor.<injective.exchange.v1beta1.Tx.MsgInstantExpiryFuturesMarketLaunch, injective.exchange.v1beta1.Tx.MsgInstantExpiryFuturesMarketLaunchResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "InstantExpiryFuturesMarketLaunch"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  injective.exchange.v1beta1.Tx.MsgInstantExpiryFuturesMarketLaunch.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  injective.exchange.v1beta1.Tx.MsgInstantExpiryFuturesMarketLaunchResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("InstantExpiryFuturesMarketLaunch"))
              .build();
        }
      }
    }
    return getInstantExpiryFuturesMarketLaunchMethod;
  }

  private static volatile io.grpc.MethodDescriptor<injective.exchange.v1beta1.Tx.MsgCreateSpotLimitOrder,
      injective.exchange.v1beta1.Tx.MsgCreateSpotLimitOrderResponse> getCreateSpotLimitOrderMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateSpotLimitOrder",
      requestType = injective.exchange.v1beta1.Tx.MsgCreateSpotLimitOrder.class,
      responseType = injective.exchange.v1beta1.Tx.MsgCreateSpotLimitOrderResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<injective.exchange.v1beta1.Tx.MsgCreateSpotLimitOrder,
      injective.exchange.v1beta1.Tx.MsgCreateSpotLimitOrderResponse> getCreateSpotLimitOrderMethod() {
    io.grpc.MethodDescriptor<injective.exchange.v1beta1.Tx.MsgCreateSpotLimitOrder, injective.exchange.v1beta1.Tx.MsgCreateSpotLimitOrderResponse> getCreateSpotLimitOrderMethod;
    if ((getCreateSpotLimitOrderMethod = MsgGrpc.getCreateSpotLimitOrderMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getCreateSpotLimitOrderMethod = MsgGrpc.getCreateSpotLimitOrderMethod) == null) {
          MsgGrpc.getCreateSpotLimitOrderMethod = getCreateSpotLimitOrderMethod =
              io.grpc.MethodDescriptor.<injective.exchange.v1beta1.Tx.MsgCreateSpotLimitOrder, injective.exchange.v1beta1.Tx.MsgCreateSpotLimitOrderResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateSpotLimitOrder"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  injective.exchange.v1beta1.Tx.MsgCreateSpotLimitOrder.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  injective.exchange.v1beta1.Tx.MsgCreateSpotLimitOrderResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("CreateSpotLimitOrder"))
              .build();
        }
      }
    }
    return getCreateSpotLimitOrderMethod;
  }

  private static volatile io.grpc.MethodDescriptor<injective.exchange.v1beta1.Tx.MsgBatchCreateSpotLimitOrders,
      injective.exchange.v1beta1.Tx.MsgBatchCreateSpotLimitOrdersResponse> getBatchCreateSpotLimitOrdersMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "BatchCreateSpotLimitOrders",
      requestType = injective.exchange.v1beta1.Tx.MsgBatchCreateSpotLimitOrders.class,
      responseType = injective.exchange.v1beta1.Tx.MsgBatchCreateSpotLimitOrdersResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<injective.exchange.v1beta1.Tx.MsgBatchCreateSpotLimitOrders,
      injective.exchange.v1beta1.Tx.MsgBatchCreateSpotLimitOrdersResponse> getBatchCreateSpotLimitOrdersMethod() {
    io.grpc.MethodDescriptor<injective.exchange.v1beta1.Tx.MsgBatchCreateSpotLimitOrders, injective.exchange.v1beta1.Tx.MsgBatchCreateSpotLimitOrdersResponse> getBatchCreateSpotLimitOrdersMethod;
    if ((getBatchCreateSpotLimitOrdersMethod = MsgGrpc.getBatchCreateSpotLimitOrdersMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getBatchCreateSpotLimitOrdersMethod = MsgGrpc.getBatchCreateSpotLimitOrdersMethod) == null) {
          MsgGrpc.getBatchCreateSpotLimitOrdersMethod = getBatchCreateSpotLimitOrdersMethod =
              io.grpc.MethodDescriptor.<injective.exchange.v1beta1.Tx.MsgBatchCreateSpotLimitOrders, injective.exchange.v1beta1.Tx.MsgBatchCreateSpotLimitOrdersResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "BatchCreateSpotLimitOrders"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  injective.exchange.v1beta1.Tx.MsgBatchCreateSpotLimitOrders.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  injective.exchange.v1beta1.Tx.MsgBatchCreateSpotLimitOrdersResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("BatchCreateSpotLimitOrders"))
              .build();
        }
      }
    }
    return getBatchCreateSpotLimitOrdersMethod;
  }

  private static volatile io.grpc.MethodDescriptor<injective.exchange.v1beta1.Tx.MsgCreateSpotMarketOrder,
      injective.exchange.v1beta1.Tx.MsgCreateSpotMarketOrderResponse> getCreateSpotMarketOrderMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateSpotMarketOrder",
      requestType = injective.exchange.v1beta1.Tx.MsgCreateSpotMarketOrder.class,
      responseType = injective.exchange.v1beta1.Tx.MsgCreateSpotMarketOrderResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<injective.exchange.v1beta1.Tx.MsgCreateSpotMarketOrder,
      injective.exchange.v1beta1.Tx.MsgCreateSpotMarketOrderResponse> getCreateSpotMarketOrderMethod() {
    io.grpc.MethodDescriptor<injective.exchange.v1beta1.Tx.MsgCreateSpotMarketOrder, injective.exchange.v1beta1.Tx.MsgCreateSpotMarketOrderResponse> getCreateSpotMarketOrderMethod;
    if ((getCreateSpotMarketOrderMethod = MsgGrpc.getCreateSpotMarketOrderMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getCreateSpotMarketOrderMethod = MsgGrpc.getCreateSpotMarketOrderMethod) == null) {
          MsgGrpc.getCreateSpotMarketOrderMethod = getCreateSpotMarketOrderMethod =
              io.grpc.MethodDescriptor.<injective.exchange.v1beta1.Tx.MsgCreateSpotMarketOrder, injective.exchange.v1beta1.Tx.MsgCreateSpotMarketOrderResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateSpotMarketOrder"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  injective.exchange.v1beta1.Tx.MsgCreateSpotMarketOrder.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  injective.exchange.v1beta1.Tx.MsgCreateSpotMarketOrderResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("CreateSpotMarketOrder"))
              .build();
        }
      }
    }
    return getCreateSpotMarketOrderMethod;
  }

  private static volatile io.grpc.MethodDescriptor<injective.exchange.v1beta1.Tx.MsgCancelSpotOrder,
      injective.exchange.v1beta1.Tx.MsgCancelSpotOrderResponse> getCancelSpotOrderMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CancelSpotOrder",
      requestType = injective.exchange.v1beta1.Tx.MsgCancelSpotOrder.class,
      responseType = injective.exchange.v1beta1.Tx.MsgCancelSpotOrderResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<injective.exchange.v1beta1.Tx.MsgCancelSpotOrder,
      injective.exchange.v1beta1.Tx.MsgCancelSpotOrderResponse> getCancelSpotOrderMethod() {
    io.grpc.MethodDescriptor<injective.exchange.v1beta1.Tx.MsgCancelSpotOrder, injective.exchange.v1beta1.Tx.MsgCancelSpotOrderResponse> getCancelSpotOrderMethod;
    if ((getCancelSpotOrderMethod = MsgGrpc.getCancelSpotOrderMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getCancelSpotOrderMethod = MsgGrpc.getCancelSpotOrderMethod) == null) {
          MsgGrpc.getCancelSpotOrderMethod = getCancelSpotOrderMethod =
              io.grpc.MethodDescriptor.<injective.exchange.v1beta1.Tx.MsgCancelSpotOrder, injective.exchange.v1beta1.Tx.MsgCancelSpotOrderResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CancelSpotOrder"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  injective.exchange.v1beta1.Tx.MsgCancelSpotOrder.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  injective.exchange.v1beta1.Tx.MsgCancelSpotOrderResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("CancelSpotOrder"))
              .build();
        }
      }
    }
    return getCancelSpotOrderMethod;
  }

  private static volatile io.grpc.MethodDescriptor<injective.exchange.v1beta1.Tx.MsgBatchCancelSpotOrders,
      injective.exchange.v1beta1.Tx.MsgBatchCancelSpotOrdersResponse> getBatchCancelSpotOrdersMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "BatchCancelSpotOrders",
      requestType = injective.exchange.v1beta1.Tx.MsgBatchCancelSpotOrders.class,
      responseType = injective.exchange.v1beta1.Tx.MsgBatchCancelSpotOrdersResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<injective.exchange.v1beta1.Tx.MsgBatchCancelSpotOrders,
      injective.exchange.v1beta1.Tx.MsgBatchCancelSpotOrdersResponse> getBatchCancelSpotOrdersMethod() {
    io.grpc.MethodDescriptor<injective.exchange.v1beta1.Tx.MsgBatchCancelSpotOrders, injective.exchange.v1beta1.Tx.MsgBatchCancelSpotOrdersResponse> getBatchCancelSpotOrdersMethod;
    if ((getBatchCancelSpotOrdersMethod = MsgGrpc.getBatchCancelSpotOrdersMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getBatchCancelSpotOrdersMethod = MsgGrpc.getBatchCancelSpotOrdersMethod) == null) {
          MsgGrpc.getBatchCancelSpotOrdersMethod = getBatchCancelSpotOrdersMethod =
              io.grpc.MethodDescriptor.<injective.exchange.v1beta1.Tx.MsgBatchCancelSpotOrders, injective.exchange.v1beta1.Tx.MsgBatchCancelSpotOrdersResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "BatchCancelSpotOrders"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  injective.exchange.v1beta1.Tx.MsgBatchCancelSpotOrders.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  injective.exchange.v1beta1.Tx.MsgBatchCancelSpotOrdersResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("BatchCancelSpotOrders"))
              .build();
        }
      }
    }
    return getBatchCancelSpotOrdersMethod;
  }

  private static volatile io.grpc.MethodDescriptor<injective.exchange.v1beta1.Tx.MsgBatchUpdateOrders,
      injective.exchange.v1beta1.Tx.MsgBatchUpdateOrdersResponse> getBatchUpdateOrdersMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "BatchUpdateOrders",
      requestType = injective.exchange.v1beta1.Tx.MsgBatchUpdateOrders.class,
      responseType = injective.exchange.v1beta1.Tx.MsgBatchUpdateOrdersResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<injective.exchange.v1beta1.Tx.MsgBatchUpdateOrders,
      injective.exchange.v1beta1.Tx.MsgBatchUpdateOrdersResponse> getBatchUpdateOrdersMethod() {
    io.grpc.MethodDescriptor<injective.exchange.v1beta1.Tx.MsgBatchUpdateOrders, injective.exchange.v1beta1.Tx.MsgBatchUpdateOrdersResponse> getBatchUpdateOrdersMethod;
    if ((getBatchUpdateOrdersMethod = MsgGrpc.getBatchUpdateOrdersMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getBatchUpdateOrdersMethod = MsgGrpc.getBatchUpdateOrdersMethod) == null) {
          MsgGrpc.getBatchUpdateOrdersMethod = getBatchUpdateOrdersMethod =
              io.grpc.MethodDescriptor.<injective.exchange.v1beta1.Tx.MsgBatchUpdateOrders, injective.exchange.v1beta1.Tx.MsgBatchUpdateOrdersResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "BatchUpdateOrders"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  injective.exchange.v1beta1.Tx.MsgBatchUpdateOrders.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  injective.exchange.v1beta1.Tx.MsgBatchUpdateOrdersResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("BatchUpdateOrders"))
              .build();
        }
      }
    }
    return getBatchUpdateOrdersMethod;
  }

  private static volatile io.grpc.MethodDescriptor<injective.exchange.v1beta1.Tx.MsgPrivilegedExecuteContract,
      injective.exchange.v1beta1.Tx.MsgPrivilegedExecuteContractResponse> getPrivilegedExecuteContractMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "PrivilegedExecuteContract",
      requestType = injective.exchange.v1beta1.Tx.MsgPrivilegedExecuteContract.class,
      responseType = injective.exchange.v1beta1.Tx.MsgPrivilegedExecuteContractResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<injective.exchange.v1beta1.Tx.MsgPrivilegedExecuteContract,
      injective.exchange.v1beta1.Tx.MsgPrivilegedExecuteContractResponse> getPrivilegedExecuteContractMethod() {
    io.grpc.MethodDescriptor<injective.exchange.v1beta1.Tx.MsgPrivilegedExecuteContract, injective.exchange.v1beta1.Tx.MsgPrivilegedExecuteContractResponse> getPrivilegedExecuteContractMethod;
    if ((getPrivilegedExecuteContractMethod = MsgGrpc.getPrivilegedExecuteContractMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getPrivilegedExecuteContractMethod = MsgGrpc.getPrivilegedExecuteContractMethod) == null) {
          MsgGrpc.getPrivilegedExecuteContractMethod = getPrivilegedExecuteContractMethod =
              io.grpc.MethodDescriptor.<injective.exchange.v1beta1.Tx.MsgPrivilegedExecuteContract, injective.exchange.v1beta1.Tx.MsgPrivilegedExecuteContractResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "PrivilegedExecuteContract"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  injective.exchange.v1beta1.Tx.MsgPrivilegedExecuteContract.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  injective.exchange.v1beta1.Tx.MsgPrivilegedExecuteContractResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("PrivilegedExecuteContract"))
              .build();
        }
      }
    }
    return getPrivilegedExecuteContractMethod;
  }

  private static volatile io.grpc.MethodDescriptor<injective.exchange.v1beta1.Tx.MsgCreateDerivativeLimitOrder,
      injective.exchange.v1beta1.Tx.MsgCreateDerivativeLimitOrderResponse> getCreateDerivativeLimitOrderMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateDerivativeLimitOrder",
      requestType = injective.exchange.v1beta1.Tx.MsgCreateDerivativeLimitOrder.class,
      responseType = injective.exchange.v1beta1.Tx.MsgCreateDerivativeLimitOrderResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<injective.exchange.v1beta1.Tx.MsgCreateDerivativeLimitOrder,
      injective.exchange.v1beta1.Tx.MsgCreateDerivativeLimitOrderResponse> getCreateDerivativeLimitOrderMethod() {
    io.grpc.MethodDescriptor<injective.exchange.v1beta1.Tx.MsgCreateDerivativeLimitOrder, injective.exchange.v1beta1.Tx.MsgCreateDerivativeLimitOrderResponse> getCreateDerivativeLimitOrderMethod;
    if ((getCreateDerivativeLimitOrderMethod = MsgGrpc.getCreateDerivativeLimitOrderMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getCreateDerivativeLimitOrderMethod = MsgGrpc.getCreateDerivativeLimitOrderMethod) == null) {
          MsgGrpc.getCreateDerivativeLimitOrderMethod = getCreateDerivativeLimitOrderMethod =
              io.grpc.MethodDescriptor.<injective.exchange.v1beta1.Tx.MsgCreateDerivativeLimitOrder, injective.exchange.v1beta1.Tx.MsgCreateDerivativeLimitOrderResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateDerivativeLimitOrder"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  injective.exchange.v1beta1.Tx.MsgCreateDerivativeLimitOrder.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  injective.exchange.v1beta1.Tx.MsgCreateDerivativeLimitOrderResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("CreateDerivativeLimitOrder"))
              .build();
        }
      }
    }
    return getCreateDerivativeLimitOrderMethod;
  }

  private static volatile io.grpc.MethodDescriptor<injective.exchange.v1beta1.Tx.MsgBatchCreateDerivativeLimitOrders,
      injective.exchange.v1beta1.Tx.MsgBatchCreateDerivativeLimitOrdersResponse> getBatchCreateDerivativeLimitOrdersMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "BatchCreateDerivativeLimitOrders",
      requestType = injective.exchange.v1beta1.Tx.MsgBatchCreateDerivativeLimitOrders.class,
      responseType = injective.exchange.v1beta1.Tx.MsgBatchCreateDerivativeLimitOrdersResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<injective.exchange.v1beta1.Tx.MsgBatchCreateDerivativeLimitOrders,
      injective.exchange.v1beta1.Tx.MsgBatchCreateDerivativeLimitOrdersResponse> getBatchCreateDerivativeLimitOrdersMethod() {
    io.grpc.MethodDescriptor<injective.exchange.v1beta1.Tx.MsgBatchCreateDerivativeLimitOrders, injective.exchange.v1beta1.Tx.MsgBatchCreateDerivativeLimitOrdersResponse> getBatchCreateDerivativeLimitOrdersMethod;
    if ((getBatchCreateDerivativeLimitOrdersMethod = MsgGrpc.getBatchCreateDerivativeLimitOrdersMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getBatchCreateDerivativeLimitOrdersMethod = MsgGrpc.getBatchCreateDerivativeLimitOrdersMethod) == null) {
          MsgGrpc.getBatchCreateDerivativeLimitOrdersMethod = getBatchCreateDerivativeLimitOrdersMethod =
              io.grpc.MethodDescriptor.<injective.exchange.v1beta1.Tx.MsgBatchCreateDerivativeLimitOrders, injective.exchange.v1beta1.Tx.MsgBatchCreateDerivativeLimitOrdersResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "BatchCreateDerivativeLimitOrders"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  injective.exchange.v1beta1.Tx.MsgBatchCreateDerivativeLimitOrders.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  injective.exchange.v1beta1.Tx.MsgBatchCreateDerivativeLimitOrdersResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("BatchCreateDerivativeLimitOrders"))
              .build();
        }
      }
    }
    return getBatchCreateDerivativeLimitOrdersMethod;
  }

  private static volatile io.grpc.MethodDescriptor<injective.exchange.v1beta1.Tx.MsgCreateDerivativeMarketOrder,
      injective.exchange.v1beta1.Tx.MsgCreateDerivativeMarketOrderResponse> getCreateDerivativeMarketOrderMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateDerivativeMarketOrder",
      requestType = injective.exchange.v1beta1.Tx.MsgCreateDerivativeMarketOrder.class,
      responseType = injective.exchange.v1beta1.Tx.MsgCreateDerivativeMarketOrderResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<injective.exchange.v1beta1.Tx.MsgCreateDerivativeMarketOrder,
      injective.exchange.v1beta1.Tx.MsgCreateDerivativeMarketOrderResponse> getCreateDerivativeMarketOrderMethod() {
    io.grpc.MethodDescriptor<injective.exchange.v1beta1.Tx.MsgCreateDerivativeMarketOrder, injective.exchange.v1beta1.Tx.MsgCreateDerivativeMarketOrderResponse> getCreateDerivativeMarketOrderMethod;
    if ((getCreateDerivativeMarketOrderMethod = MsgGrpc.getCreateDerivativeMarketOrderMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getCreateDerivativeMarketOrderMethod = MsgGrpc.getCreateDerivativeMarketOrderMethod) == null) {
          MsgGrpc.getCreateDerivativeMarketOrderMethod = getCreateDerivativeMarketOrderMethod =
              io.grpc.MethodDescriptor.<injective.exchange.v1beta1.Tx.MsgCreateDerivativeMarketOrder, injective.exchange.v1beta1.Tx.MsgCreateDerivativeMarketOrderResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateDerivativeMarketOrder"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  injective.exchange.v1beta1.Tx.MsgCreateDerivativeMarketOrder.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  injective.exchange.v1beta1.Tx.MsgCreateDerivativeMarketOrderResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("CreateDerivativeMarketOrder"))
              .build();
        }
      }
    }
    return getCreateDerivativeMarketOrderMethod;
  }

  private static volatile io.grpc.MethodDescriptor<injective.exchange.v1beta1.Tx.MsgCancelDerivativeOrder,
      injective.exchange.v1beta1.Tx.MsgCancelDerivativeOrderResponse> getCancelDerivativeOrderMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CancelDerivativeOrder",
      requestType = injective.exchange.v1beta1.Tx.MsgCancelDerivativeOrder.class,
      responseType = injective.exchange.v1beta1.Tx.MsgCancelDerivativeOrderResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<injective.exchange.v1beta1.Tx.MsgCancelDerivativeOrder,
      injective.exchange.v1beta1.Tx.MsgCancelDerivativeOrderResponse> getCancelDerivativeOrderMethod() {
    io.grpc.MethodDescriptor<injective.exchange.v1beta1.Tx.MsgCancelDerivativeOrder, injective.exchange.v1beta1.Tx.MsgCancelDerivativeOrderResponse> getCancelDerivativeOrderMethod;
    if ((getCancelDerivativeOrderMethod = MsgGrpc.getCancelDerivativeOrderMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getCancelDerivativeOrderMethod = MsgGrpc.getCancelDerivativeOrderMethod) == null) {
          MsgGrpc.getCancelDerivativeOrderMethod = getCancelDerivativeOrderMethod =
              io.grpc.MethodDescriptor.<injective.exchange.v1beta1.Tx.MsgCancelDerivativeOrder, injective.exchange.v1beta1.Tx.MsgCancelDerivativeOrderResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CancelDerivativeOrder"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  injective.exchange.v1beta1.Tx.MsgCancelDerivativeOrder.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  injective.exchange.v1beta1.Tx.MsgCancelDerivativeOrderResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("CancelDerivativeOrder"))
              .build();
        }
      }
    }
    return getCancelDerivativeOrderMethod;
  }

  private static volatile io.grpc.MethodDescriptor<injective.exchange.v1beta1.Tx.MsgBatchCancelDerivativeOrders,
      injective.exchange.v1beta1.Tx.MsgBatchCancelDerivativeOrdersResponse> getBatchCancelDerivativeOrdersMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "BatchCancelDerivativeOrders",
      requestType = injective.exchange.v1beta1.Tx.MsgBatchCancelDerivativeOrders.class,
      responseType = injective.exchange.v1beta1.Tx.MsgBatchCancelDerivativeOrdersResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<injective.exchange.v1beta1.Tx.MsgBatchCancelDerivativeOrders,
      injective.exchange.v1beta1.Tx.MsgBatchCancelDerivativeOrdersResponse> getBatchCancelDerivativeOrdersMethod() {
    io.grpc.MethodDescriptor<injective.exchange.v1beta1.Tx.MsgBatchCancelDerivativeOrders, injective.exchange.v1beta1.Tx.MsgBatchCancelDerivativeOrdersResponse> getBatchCancelDerivativeOrdersMethod;
    if ((getBatchCancelDerivativeOrdersMethod = MsgGrpc.getBatchCancelDerivativeOrdersMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getBatchCancelDerivativeOrdersMethod = MsgGrpc.getBatchCancelDerivativeOrdersMethod) == null) {
          MsgGrpc.getBatchCancelDerivativeOrdersMethod = getBatchCancelDerivativeOrdersMethod =
              io.grpc.MethodDescriptor.<injective.exchange.v1beta1.Tx.MsgBatchCancelDerivativeOrders, injective.exchange.v1beta1.Tx.MsgBatchCancelDerivativeOrdersResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "BatchCancelDerivativeOrders"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  injective.exchange.v1beta1.Tx.MsgBatchCancelDerivativeOrders.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  injective.exchange.v1beta1.Tx.MsgBatchCancelDerivativeOrdersResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("BatchCancelDerivativeOrders"))
              .build();
        }
      }
    }
    return getBatchCancelDerivativeOrdersMethod;
  }

  private static volatile io.grpc.MethodDescriptor<injective.exchange.v1beta1.Tx.MsgInstantBinaryOptionsMarketLaunch,
      injective.exchange.v1beta1.Tx.MsgInstantBinaryOptionsMarketLaunchResponse> getInstantBinaryOptionsMarketLaunchMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "InstantBinaryOptionsMarketLaunch",
      requestType = injective.exchange.v1beta1.Tx.MsgInstantBinaryOptionsMarketLaunch.class,
      responseType = injective.exchange.v1beta1.Tx.MsgInstantBinaryOptionsMarketLaunchResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<injective.exchange.v1beta1.Tx.MsgInstantBinaryOptionsMarketLaunch,
      injective.exchange.v1beta1.Tx.MsgInstantBinaryOptionsMarketLaunchResponse> getInstantBinaryOptionsMarketLaunchMethod() {
    io.grpc.MethodDescriptor<injective.exchange.v1beta1.Tx.MsgInstantBinaryOptionsMarketLaunch, injective.exchange.v1beta1.Tx.MsgInstantBinaryOptionsMarketLaunchResponse> getInstantBinaryOptionsMarketLaunchMethod;
    if ((getInstantBinaryOptionsMarketLaunchMethod = MsgGrpc.getInstantBinaryOptionsMarketLaunchMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getInstantBinaryOptionsMarketLaunchMethod = MsgGrpc.getInstantBinaryOptionsMarketLaunchMethod) == null) {
          MsgGrpc.getInstantBinaryOptionsMarketLaunchMethod = getInstantBinaryOptionsMarketLaunchMethod =
              io.grpc.MethodDescriptor.<injective.exchange.v1beta1.Tx.MsgInstantBinaryOptionsMarketLaunch, injective.exchange.v1beta1.Tx.MsgInstantBinaryOptionsMarketLaunchResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "InstantBinaryOptionsMarketLaunch"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  injective.exchange.v1beta1.Tx.MsgInstantBinaryOptionsMarketLaunch.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  injective.exchange.v1beta1.Tx.MsgInstantBinaryOptionsMarketLaunchResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("InstantBinaryOptionsMarketLaunch"))
              .build();
        }
      }
    }
    return getInstantBinaryOptionsMarketLaunchMethod;
  }

  private static volatile io.grpc.MethodDescriptor<injective.exchange.v1beta1.Tx.MsgCreateBinaryOptionsLimitOrder,
      injective.exchange.v1beta1.Tx.MsgCreateBinaryOptionsLimitOrderResponse> getCreateBinaryOptionsLimitOrderMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateBinaryOptionsLimitOrder",
      requestType = injective.exchange.v1beta1.Tx.MsgCreateBinaryOptionsLimitOrder.class,
      responseType = injective.exchange.v1beta1.Tx.MsgCreateBinaryOptionsLimitOrderResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<injective.exchange.v1beta1.Tx.MsgCreateBinaryOptionsLimitOrder,
      injective.exchange.v1beta1.Tx.MsgCreateBinaryOptionsLimitOrderResponse> getCreateBinaryOptionsLimitOrderMethod() {
    io.grpc.MethodDescriptor<injective.exchange.v1beta1.Tx.MsgCreateBinaryOptionsLimitOrder, injective.exchange.v1beta1.Tx.MsgCreateBinaryOptionsLimitOrderResponse> getCreateBinaryOptionsLimitOrderMethod;
    if ((getCreateBinaryOptionsLimitOrderMethod = MsgGrpc.getCreateBinaryOptionsLimitOrderMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getCreateBinaryOptionsLimitOrderMethod = MsgGrpc.getCreateBinaryOptionsLimitOrderMethod) == null) {
          MsgGrpc.getCreateBinaryOptionsLimitOrderMethod = getCreateBinaryOptionsLimitOrderMethod =
              io.grpc.MethodDescriptor.<injective.exchange.v1beta1.Tx.MsgCreateBinaryOptionsLimitOrder, injective.exchange.v1beta1.Tx.MsgCreateBinaryOptionsLimitOrderResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateBinaryOptionsLimitOrder"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  injective.exchange.v1beta1.Tx.MsgCreateBinaryOptionsLimitOrder.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  injective.exchange.v1beta1.Tx.MsgCreateBinaryOptionsLimitOrderResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("CreateBinaryOptionsLimitOrder"))
              .build();
        }
      }
    }
    return getCreateBinaryOptionsLimitOrderMethod;
  }

  private static volatile io.grpc.MethodDescriptor<injective.exchange.v1beta1.Tx.MsgCreateBinaryOptionsMarketOrder,
      injective.exchange.v1beta1.Tx.MsgCreateBinaryOptionsMarketOrderResponse> getCreateBinaryOptionsMarketOrderMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateBinaryOptionsMarketOrder",
      requestType = injective.exchange.v1beta1.Tx.MsgCreateBinaryOptionsMarketOrder.class,
      responseType = injective.exchange.v1beta1.Tx.MsgCreateBinaryOptionsMarketOrderResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<injective.exchange.v1beta1.Tx.MsgCreateBinaryOptionsMarketOrder,
      injective.exchange.v1beta1.Tx.MsgCreateBinaryOptionsMarketOrderResponse> getCreateBinaryOptionsMarketOrderMethod() {
    io.grpc.MethodDescriptor<injective.exchange.v1beta1.Tx.MsgCreateBinaryOptionsMarketOrder, injective.exchange.v1beta1.Tx.MsgCreateBinaryOptionsMarketOrderResponse> getCreateBinaryOptionsMarketOrderMethod;
    if ((getCreateBinaryOptionsMarketOrderMethod = MsgGrpc.getCreateBinaryOptionsMarketOrderMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getCreateBinaryOptionsMarketOrderMethod = MsgGrpc.getCreateBinaryOptionsMarketOrderMethod) == null) {
          MsgGrpc.getCreateBinaryOptionsMarketOrderMethod = getCreateBinaryOptionsMarketOrderMethod =
              io.grpc.MethodDescriptor.<injective.exchange.v1beta1.Tx.MsgCreateBinaryOptionsMarketOrder, injective.exchange.v1beta1.Tx.MsgCreateBinaryOptionsMarketOrderResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateBinaryOptionsMarketOrder"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  injective.exchange.v1beta1.Tx.MsgCreateBinaryOptionsMarketOrder.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  injective.exchange.v1beta1.Tx.MsgCreateBinaryOptionsMarketOrderResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("CreateBinaryOptionsMarketOrder"))
              .build();
        }
      }
    }
    return getCreateBinaryOptionsMarketOrderMethod;
  }

  private static volatile io.grpc.MethodDescriptor<injective.exchange.v1beta1.Tx.MsgCancelBinaryOptionsOrder,
      injective.exchange.v1beta1.Tx.MsgCancelBinaryOptionsOrderResponse> getCancelBinaryOptionsOrderMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CancelBinaryOptionsOrder",
      requestType = injective.exchange.v1beta1.Tx.MsgCancelBinaryOptionsOrder.class,
      responseType = injective.exchange.v1beta1.Tx.MsgCancelBinaryOptionsOrderResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<injective.exchange.v1beta1.Tx.MsgCancelBinaryOptionsOrder,
      injective.exchange.v1beta1.Tx.MsgCancelBinaryOptionsOrderResponse> getCancelBinaryOptionsOrderMethod() {
    io.grpc.MethodDescriptor<injective.exchange.v1beta1.Tx.MsgCancelBinaryOptionsOrder, injective.exchange.v1beta1.Tx.MsgCancelBinaryOptionsOrderResponse> getCancelBinaryOptionsOrderMethod;
    if ((getCancelBinaryOptionsOrderMethod = MsgGrpc.getCancelBinaryOptionsOrderMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getCancelBinaryOptionsOrderMethod = MsgGrpc.getCancelBinaryOptionsOrderMethod) == null) {
          MsgGrpc.getCancelBinaryOptionsOrderMethod = getCancelBinaryOptionsOrderMethod =
              io.grpc.MethodDescriptor.<injective.exchange.v1beta1.Tx.MsgCancelBinaryOptionsOrder, injective.exchange.v1beta1.Tx.MsgCancelBinaryOptionsOrderResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CancelBinaryOptionsOrder"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  injective.exchange.v1beta1.Tx.MsgCancelBinaryOptionsOrder.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  injective.exchange.v1beta1.Tx.MsgCancelBinaryOptionsOrderResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("CancelBinaryOptionsOrder"))
              .build();
        }
      }
    }
    return getCancelBinaryOptionsOrderMethod;
  }

  private static volatile io.grpc.MethodDescriptor<injective.exchange.v1beta1.Tx.MsgBatchCancelBinaryOptionsOrders,
      injective.exchange.v1beta1.Tx.MsgBatchCancelBinaryOptionsOrdersResponse> getBatchCancelBinaryOptionsOrdersMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "BatchCancelBinaryOptionsOrders",
      requestType = injective.exchange.v1beta1.Tx.MsgBatchCancelBinaryOptionsOrders.class,
      responseType = injective.exchange.v1beta1.Tx.MsgBatchCancelBinaryOptionsOrdersResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<injective.exchange.v1beta1.Tx.MsgBatchCancelBinaryOptionsOrders,
      injective.exchange.v1beta1.Tx.MsgBatchCancelBinaryOptionsOrdersResponse> getBatchCancelBinaryOptionsOrdersMethod() {
    io.grpc.MethodDescriptor<injective.exchange.v1beta1.Tx.MsgBatchCancelBinaryOptionsOrders, injective.exchange.v1beta1.Tx.MsgBatchCancelBinaryOptionsOrdersResponse> getBatchCancelBinaryOptionsOrdersMethod;
    if ((getBatchCancelBinaryOptionsOrdersMethod = MsgGrpc.getBatchCancelBinaryOptionsOrdersMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getBatchCancelBinaryOptionsOrdersMethod = MsgGrpc.getBatchCancelBinaryOptionsOrdersMethod) == null) {
          MsgGrpc.getBatchCancelBinaryOptionsOrdersMethod = getBatchCancelBinaryOptionsOrdersMethod =
              io.grpc.MethodDescriptor.<injective.exchange.v1beta1.Tx.MsgBatchCancelBinaryOptionsOrders, injective.exchange.v1beta1.Tx.MsgBatchCancelBinaryOptionsOrdersResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "BatchCancelBinaryOptionsOrders"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  injective.exchange.v1beta1.Tx.MsgBatchCancelBinaryOptionsOrders.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  injective.exchange.v1beta1.Tx.MsgBatchCancelBinaryOptionsOrdersResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("BatchCancelBinaryOptionsOrders"))
              .build();
        }
      }
    }
    return getBatchCancelBinaryOptionsOrdersMethod;
  }

  private static volatile io.grpc.MethodDescriptor<injective.exchange.v1beta1.Tx.MsgSubaccountTransfer,
      injective.exchange.v1beta1.Tx.MsgSubaccountTransferResponse> getSubaccountTransferMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SubaccountTransfer",
      requestType = injective.exchange.v1beta1.Tx.MsgSubaccountTransfer.class,
      responseType = injective.exchange.v1beta1.Tx.MsgSubaccountTransferResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<injective.exchange.v1beta1.Tx.MsgSubaccountTransfer,
      injective.exchange.v1beta1.Tx.MsgSubaccountTransferResponse> getSubaccountTransferMethod() {
    io.grpc.MethodDescriptor<injective.exchange.v1beta1.Tx.MsgSubaccountTransfer, injective.exchange.v1beta1.Tx.MsgSubaccountTransferResponse> getSubaccountTransferMethod;
    if ((getSubaccountTransferMethod = MsgGrpc.getSubaccountTransferMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getSubaccountTransferMethod = MsgGrpc.getSubaccountTransferMethod) == null) {
          MsgGrpc.getSubaccountTransferMethod = getSubaccountTransferMethod =
              io.grpc.MethodDescriptor.<injective.exchange.v1beta1.Tx.MsgSubaccountTransfer, injective.exchange.v1beta1.Tx.MsgSubaccountTransferResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SubaccountTransfer"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  injective.exchange.v1beta1.Tx.MsgSubaccountTransfer.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  injective.exchange.v1beta1.Tx.MsgSubaccountTransferResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("SubaccountTransfer"))
              .build();
        }
      }
    }
    return getSubaccountTransferMethod;
  }

  private static volatile io.grpc.MethodDescriptor<injective.exchange.v1beta1.Tx.MsgExternalTransfer,
      injective.exchange.v1beta1.Tx.MsgExternalTransferResponse> getExternalTransferMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ExternalTransfer",
      requestType = injective.exchange.v1beta1.Tx.MsgExternalTransfer.class,
      responseType = injective.exchange.v1beta1.Tx.MsgExternalTransferResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<injective.exchange.v1beta1.Tx.MsgExternalTransfer,
      injective.exchange.v1beta1.Tx.MsgExternalTransferResponse> getExternalTransferMethod() {
    io.grpc.MethodDescriptor<injective.exchange.v1beta1.Tx.MsgExternalTransfer, injective.exchange.v1beta1.Tx.MsgExternalTransferResponse> getExternalTransferMethod;
    if ((getExternalTransferMethod = MsgGrpc.getExternalTransferMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getExternalTransferMethod = MsgGrpc.getExternalTransferMethod) == null) {
          MsgGrpc.getExternalTransferMethod = getExternalTransferMethod =
              io.grpc.MethodDescriptor.<injective.exchange.v1beta1.Tx.MsgExternalTransfer, injective.exchange.v1beta1.Tx.MsgExternalTransferResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ExternalTransfer"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  injective.exchange.v1beta1.Tx.MsgExternalTransfer.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  injective.exchange.v1beta1.Tx.MsgExternalTransferResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("ExternalTransfer"))
              .build();
        }
      }
    }
    return getExternalTransferMethod;
  }

  private static volatile io.grpc.MethodDescriptor<injective.exchange.v1beta1.Tx.MsgLiquidatePosition,
      injective.exchange.v1beta1.Tx.MsgLiquidatePositionResponse> getLiquidatePositionMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "LiquidatePosition",
      requestType = injective.exchange.v1beta1.Tx.MsgLiquidatePosition.class,
      responseType = injective.exchange.v1beta1.Tx.MsgLiquidatePositionResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<injective.exchange.v1beta1.Tx.MsgLiquidatePosition,
      injective.exchange.v1beta1.Tx.MsgLiquidatePositionResponse> getLiquidatePositionMethod() {
    io.grpc.MethodDescriptor<injective.exchange.v1beta1.Tx.MsgLiquidatePosition, injective.exchange.v1beta1.Tx.MsgLiquidatePositionResponse> getLiquidatePositionMethod;
    if ((getLiquidatePositionMethod = MsgGrpc.getLiquidatePositionMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getLiquidatePositionMethod = MsgGrpc.getLiquidatePositionMethod) == null) {
          MsgGrpc.getLiquidatePositionMethod = getLiquidatePositionMethod =
              io.grpc.MethodDescriptor.<injective.exchange.v1beta1.Tx.MsgLiquidatePosition, injective.exchange.v1beta1.Tx.MsgLiquidatePositionResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "LiquidatePosition"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  injective.exchange.v1beta1.Tx.MsgLiquidatePosition.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  injective.exchange.v1beta1.Tx.MsgLiquidatePositionResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("LiquidatePosition"))
              .build();
        }
      }
    }
    return getLiquidatePositionMethod;
  }

  private static volatile io.grpc.MethodDescriptor<injective.exchange.v1beta1.Tx.MsgEmergencySettleMarket,
      injective.exchange.v1beta1.Tx.MsgEmergencySettleMarketResponse> getEmergencySettleMarketMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "EmergencySettleMarket",
      requestType = injective.exchange.v1beta1.Tx.MsgEmergencySettleMarket.class,
      responseType = injective.exchange.v1beta1.Tx.MsgEmergencySettleMarketResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<injective.exchange.v1beta1.Tx.MsgEmergencySettleMarket,
      injective.exchange.v1beta1.Tx.MsgEmergencySettleMarketResponse> getEmergencySettleMarketMethod() {
    io.grpc.MethodDescriptor<injective.exchange.v1beta1.Tx.MsgEmergencySettleMarket, injective.exchange.v1beta1.Tx.MsgEmergencySettleMarketResponse> getEmergencySettleMarketMethod;
    if ((getEmergencySettleMarketMethod = MsgGrpc.getEmergencySettleMarketMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getEmergencySettleMarketMethod = MsgGrpc.getEmergencySettleMarketMethod) == null) {
          MsgGrpc.getEmergencySettleMarketMethod = getEmergencySettleMarketMethod =
              io.grpc.MethodDescriptor.<injective.exchange.v1beta1.Tx.MsgEmergencySettleMarket, injective.exchange.v1beta1.Tx.MsgEmergencySettleMarketResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "EmergencySettleMarket"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  injective.exchange.v1beta1.Tx.MsgEmergencySettleMarket.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  injective.exchange.v1beta1.Tx.MsgEmergencySettleMarketResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("EmergencySettleMarket"))
              .build();
        }
      }
    }
    return getEmergencySettleMarketMethod;
  }

  private static volatile io.grpc.MethodDescriptor<injective.exchange.v1beta1.Tx.MsgIncreasePositionMargin,
      injective.exchange.v1beta1.Tx.MsgIncreasePositionMarginResponse> getIncreasePositionMarginMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "IncreasePositionMargin",
      requestType = injective.exchange.v1beta1.Tx.MsgIncreasePositionMargin.class,
      responseType = injective.exchange.v1beta1.Tx.MsgIncreasePositionMarginResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<injective.exchange.v1beta1.Tx.MsgIncreasePositionMargin,
      injective.exchange.v1beta1.Tx.MsgIncreasePositionMarginResponse> getIncreasePositionMarginMethod() {
    io.grpc.MethodDescriptor<injective.exchange.v1beta1.Tx.MsgIncreasePositionMargin, injective.exchange.v1beta1.Tx.MsgIncreasePositionMarginResponse> getIncreasePositionMarginMethod;
    if ((getIncreasePositionMarginMethod = MsgGrpc.getIncreasePositionMarginMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getIncreasePositionMarginMethod = MsgGrpc.getIncreasePositionMarginMethod) == null) {
          MsgGrpc.getIncreasePositionMarginMethod = getIncreasePositionMarginMethod =
              io.grpc.MethodDescriptor.<injective.exchange.v1beta1.Tx.MsgIncreasePositionMargin, injective.exchange.v1beta1.Tx.MsgIncreasePositionMarginResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "IncreasePositionMargin"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  injective.exchange.v1beta1.Tx.MsgIncreasePositionMargin.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  injective.exchange.v1beta1.Tx.MsgIncreasePositionMarginResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("IncreasePositionMargin"))
              .build();
        }
      }
    }
    return getIncreasePositionMarginMethod;
  }

  private static volatile io.grpc.MethodDescriptor<injective.exchange.v1beta1.Tx.MsgRewardsOptOut,
      injective.exchange.v1beta1.Tx.MsgRewardsOptOutResponse> getRewardsOptOutMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "RewardsOptOut",
      requestType = injective.exchange.v1beta1.Tx.MsgRewardsOptOut.class,
      responseType = injective.exchange.v1beta1.Tx.MsgRewardsOptOutResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<injective.exchange.v1beta1.Tx.MsgRewardsOptOut,
      injective.exchange.v1beta1.Tx.MsgRewardsOptOutResponse> getRewardsOptOutMethod() {
    io.grpc.MethodDescriptor<injective.exchange.v1beta1.Tx.MsgRewardsOptOut, injective.exchange.v1beta1.Tx.MsgRewardsOptOutResponse> getRewardsOptOutMethod;
    if ((getRewardsOptOutMethod = MsgGrpc.getRewardsOptOutMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getRewardsOptOutMethod = MsgGrpc.getRewardsOptOutMethod) == null) {
          MsgGrpc.getRewardsOptOutMethod = getRewardsOptOutMethod =
              io.grpc.MethodDescriptor.<injective.exchange.v1beta1.Tx.MsgRewardsOptOut, injective.exchange.v1beta1.Tx.MsgRewardsOptOutResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "RewardsOptOut"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  injective.exchange.v1beta1.Tx.MsgRewardsOptOut.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  injective.exchange.v1beta1.Tx.MsgRewardsOptOutResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("RewardsOptOut"))
              .build();
        }
      }
    }
    return getRewardsOptOutMethod;
  }

  private static volatile io.grpc.MethodDescriptor<injective.exchange.v1beta1.Tx.MsgAdminUpdateBinaryOptionsMarket,
      injective.exchange.v1beta1.Tx.MsgAdminUpdateBinaryOptionsMarketResponse> getAdminUpdateBinaryOptionsMarketMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "AdminUpdateBinaryOptionsMarket",
      requestType = injective.exchange.v1beta1.Tx.MsgAdminUpdateBinaryOptionsMarket.class,
      responseType = injective.exchange.v1beta1.Tx.MsgAdminUpdateBinaryOptionsMarketResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<injective.exchange.v1beta1.Tx.MsgAdminUpdateBinaryOptionsMarket,
      injective.exchange.v1beta1.Tx.MsgAdminUpdateBinaryOptionsMarketResponse> getAdminUpdateBinaryOptionsMarketMethod() {
    io.grpc.MethodDescriptor<injective.exchange.v1beta1.Tx.MsgAdminUpdateBinaryOptionsMarket, injective.exchange.v1beta1.Tx.MsgAdminUpdateBinaryOptionsMarketResponse> getAdminUpdateBinaryOptionsMarketMethod;
    if ((getAdminUpdateBinaryOptionsMarketMethod = MsgGrpc.getAdminUpdateBinaryOptionsMarketMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getAdminUpdateBinaryOptionsMarketMethod = MsgGrpc.getAdminUpdateBinaryOptionsMarketMethod) == null) {
          MsgGrpc.getAdminUpdateBinaryOptionsMarketMethod = getAdminUpdateBinaryOptionsMarketMethod =
              io.grpc.MethodDescriptor.<injective.exchange.v1beta1.Tx.MsgAdminUpdateBinaryOptionsMarket, injective.exchange.v1beta1.Tx.MsgAdminUpdateBinaryOptionsMarketResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "AdminUpdateBinaryOptionsMarket"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  injective.exchange.v1beta1.Tx.MsgAdminUpdateBinaryOptionsMarket.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  injective.exchange.v1beta1.Tx.MsgAdminUpdateBinaryOptionsMarketResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("AdminUpdateBinaryOptionsMarket"))
              .build();
        }
      }
    }
    return getAdminUpdateBinaryOptionsMarketMethod;
  }

  private static volatile io.grpc.MethodDescriptor<injective.exchange.v1beta1.Tx.MsgReclaimLockedFunds,
      injective.exchange.v1beta1.Tx.MsgReclaimLockedFundsResponse> getReclaimLockedFundsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ReclaimLockedFunds",
      requestType = injective.exchange.v1beta1.Tx.MsgReclaimLockedFunds.class,
      responseType = injective.exchange.v1beta1.Tx.MsgReclaimLockedFundsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<injective.exchange.v1beta1.Tx.MsgReclaimLockedFunds,
      injective.exchange.v1beta1.Tx.MsgReclaimLockedFundsResponse> getReclaimLockedFundsMethod() {
    io.grpc.MethodDescriptor<injective.exchange.v1beta1.Tx.MsgReclaimLockedFunds, injective.exchange.v1beta1.Tx.MsgReclaimLockedFundsResponse> getReclaimLockedFundsMethod;
    if ((getReclaimLockedFundsMethod = MsgGrpc.getReclaimLockedFundsMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getReclaimLockedFundsMethod = MsgGrpc.getReclaimLockedFundsMethod) == null) {
          MsgGrpc.getReclaimLockedFundsMethod = getReclaimLockedFundsMethod =
              io.grpc.MethodDescriptor.<injective.exchange.v1beta1.Tx.MsgReclaimLockedFunds, injective.exchange.v1beta1.Tx.MsgReclaimLockedFundsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ReclaimLockedFunds"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  injective.exchange.v1beta1.Tx.MsgReclaimLockedFunds.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  injective.exchange.v1beta1.Tx.MsgReclaimLockedFundsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("ReclaimLockedFunds"))
              .build();
        }
      }
    }
    return getReclaimLockedFundsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<injective.exchange.v1beta1.Tx.MsgUpdateParams,
      injective.exchange.v1beta1.Tx.MsgUpdateParamsResponse> getUpdateParamsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateParams",
      requestType = injective.exchange.v1beta1.Tx.MsgUpdateParams.class,
      responseType = injective.exchange.v1beta1.Tx.MsgUpdateParamsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<injective.exchange.v1beta1.Tx.MsgUpdateParams,
      injective.exchange.v1beta1.Tx.MsgUpdateParamsResponse> getUpdateParamsMethod() {
    io.grpc.MethodDescriptor<injective.exchange.v1beta1.Tx.MsgUpdateParams, injective.exchange.v1beta1.Tx.MsgUpdateParamsResponse> getUpdateParamsMethod;
    if ((getUpdateParamsMethod = MsgGrpc.getUpdateParamsMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getUpdateParamsMethod = MsgGrpc.getUpdateParamsMethod) == null) {
          MsgGrpc.getUpdateParamsMethod = getUpdateParamsMethod =
              io.grpc.MethodDescriptor.<injective.exchange.v1beta1.Tx.MsgUpdateParams, injective.exchange.v1beta1.Tx.MsgUpdateParamsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateParams"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  injective.exchange.v1beta1.Tx.MsgUpdateParams.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  injective.exchange.v1beta1.Tx.MsgUpdateParamsResponse.getDefaultInstance()))
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
   * Msg defines the exchange Msg service.
   * </pre>
   */
  public interface AsyncService {

    /**
     * <pre>
     * Deposit defines a method for transferring coins from the sender's bank
     * balance into the subaccount's exchange deposits
     * </pre>
     */
    default void deposit(injective.exchange.v1beta1.Tx.MsgDeposit request,
        io.grpc.stub.StreamObserver<injective.exchange.v1beta1.Tx.MsgDepositResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDepositMethod(), responseObserver);
    }

    /**
     * <pre>
     * Withdraw defines a method for withdrawing coins from a subaccount's
     * deposits to the user's bank balance
     * </pre>
     */
    default void withdraw(injective.exchange.v1beta1.Tx.MsgWithdraw request,
        io.grpc.stub.StreamObserver<injective.exchange.v1beta1.Tx.MsgWithdrawResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getWithdrawMethod(), responseObserver);
    }

    /**
     * <pre>
     * InstantSpotMarketLaunch defines method for creating a spot market by paying
     * listing fee without governance
     * </pre>
     */
    default void instantSpotMarketLaunch(injective.exchange.v1beta1.Tx.MsgInstantSpotMarketLaunch request,
        io.grpc.stub.StreamObserver<injective.exchange.v1beta1.Tx.MsgInstantSpotMarketLaunchResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getInstantSpotMarketLaunchMethod(), responseObserver);
    }

    /**
     * <pre>
     * InstantPerpetualMarketLaunch defines a method for creating a new perpetual
     * futures market by paying listing fee without governance
     * </pre>
     */
    default void instantPerpetualMarketLaunch(injective.exchange.v1beta1.Tx.MsgInstantPerpetualMarketLaunch request,
        io.grpc.stub.StreamObserver<injective.exchange.v1beta1.Tx.MsgInstantPerpetualMarketLaunchResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getInstantPerpetualMarketLaunchMethod(), responseObserver);
    }

    /**
     * <pre>
     * InstantExpiryFuturesMarketLaunch defines a method for creating a new expiry
     * futures market by paying listing fee without governance
     * </pre>
     */
    default void instantExpiryFuturesMarketLaunch(injective.exchange.v1beta1.Tx.MsgInstantExpiryFuturesMarketLaunch request,
        io.grpc.stub.StreamObserver<injective.exchange.v1beta1.Tx.MsgInstantExpiryFuturesMarketLaunchResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getInstantExpiryFuturesMarketLaunchMethod(), responseObserver);
    }

    /**
     * <pre>
     * CreateSpotLimitOrder defines a method for creating a new spot limit order.
     * </pre>
     */
    default void createSpotLimitOrder(injective.exchange.v1beta1.Tx.MsgCreateSpotLimitOrder request,
        io.grpc.stub.StreamObserver<injective.exchange.v1beta1.Tx.MsgCreateSpotLimitOrderResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateSpotLimitOrderMethod(), responseObserver);
    }

    /**
     * <pre>
     * BatchCreateSpotLimitOrder defines a method for creating a new batch of spot
     * limit orders.
     * </pre>
     */
    default void batchCreateSpotLimitOrders(injective.exchange.v1beta1.Tx.MsgBatchCreateSpotLimitOrders request,
        io.grpc.stub.StreamObserver<injective.exchange.v1beta1.Tx.MsgBatchCreateSpotLimitOrdersResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getBatchCreateSpotLimitOrdersMethod(), responseObserver);
    }

    /**
     * <pre>
     * CreateSpotMarketOrder defines a method for creating a new spot market
     * order.
     * </pre>
     */
    default void createSpotMarketOrder(injective.exchange.v1beta1.Tx.MsgCreateSpotMarketOrder request,
        io.grpc.stub.StreamObserver<injective.exchange.v1beta1.Tx.MsgCreateSpotMarketOrderResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateSpotMarketOrderMethod(), responseObserver);
    }

    /**
     * <pre>
     * MsgCancelSpotOrder defines a method for cancelling a spot order.
     * </pre>
     */
    default void cancelSpotOrder(injective.exchange.v1beta1.Tx.MsgCancelSpotOrder request,
        io.grpc.stub.StreamObserver<injective.exchange.v1beta1.Tx.MsgCancelSpotOrderResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCancelSpotOrderMethod(), responseObserver);
    }

    /**
     * <pre>
     * BatchCancelSpotOrders defines a method for cancelling a batch of spot
     * orders in a given market.
     * </pre>
     */
    default void batchCancelSpotOrders(injective.exchange.v1beta1.Tx.MsgBatchCancelSpotOrders request,
        io.grpc.stub.StreamObserver<injective.exchange.v1beta1.Tx.MsgBatchCancelSpotOrdersResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getBatchCancelSpotOrdersMethod(), responseObserver);
    }

    /**
     * <pre>
     * BatchUpdateOrders defines a method for updating a batch of orders.
     * </pre>
     */
    default void batchUpdateOrders(injective.exchange.v1beta1.Tx.MsgBatchUpdateOrders request,
        io.grpc.stub.StreamObserver<injective.exchange.v1beta1.Tx.MsgBatchUpdateOrdersResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getBatchUpdateOrdersMethod(), responseObserver);
    }

    /**
     * <pre>
     * PrivilegedExecuteContract defines a method for executing a Cosmwasm
     * contract from the exchange module with privileged capabilities.
     * </pre>
     */
    default void privilegedExecuteContract(injective.exchange.v1beta1.Tx.MsgPrivilegedExecuteContract request,
        io.grpc.stub.StreamObserver<injective.exchange.v1beta1.Tx.MsgPrivilegedExecuteContractResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getPrivilegedExecuteContractMethod(), responseObserver);
    }

    /**
     * <pre>
     * CreateDerivativeLimitOrder defines a method for creating a new derivative
     * limit order.
     * </pre>
     */
    default void createDerivativeLimitOrder(injective.exchange.v1beta1.Tx.MsgCreateDerivativeLimitOrder request,
        io.grpc.stub.StreamObserver<injective.exchange.v1beta1.Tx.MsgCreateDerivativeLimitOrderResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateDerivativeLimitOrderMethod(), responseObserver);
    }

    /**
     * <pre>
     * BatchCreateDerivativeLimitOrders defines a method for creating a new batch
     * of derivative limit orders.
     * </pre>
     */
    default void batchCreateDerivativeLimitOrders(injective.exchange.v1beta1.Tx.MsgBatchCreateDerivativeLimitOrders request,
        io.grpc.stub.StreamObserver<injective.exchange.v1beta1.Tx.MsgBatchCreateDerivativeLimitOrdersResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getBatchCreateDerivativeLimitOrdersMethod(), responseObserver);
    }

    /**
     * <pre>
     * MsgCreateDerivativeLimitOrder defines a method for creating a new
     * derivative market order.
     * </pre>
     */
    default void createDerivativeMarketOrder(injective.exchange.v1beta1.Tx.MsgCreateDerivativeMarketOrder request,
        io.grpc.stub.StreamObserver<injective.exchange.v1beta1.Tx.MsgCreateDerivativeMarketOrderResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateDerivativeMarketOrderMethod(), responseObserver);
    }

    /**
     * <pre>
     * MsgCancelDerivativeOrder defines a method for cancelling a derivative
     * order.
     * </pre>
     */
    default void cancelDerivativeOrder(injective.exchange.v1beta1.Tx.MsgCancelDerivativeOrder request,
        io.grpc.stub.StreamObserver<injective.exchange.v1beta1.Tx.MsgCancelDerivativeOrderResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCancelDerivativeOrderMethod(), responseObserver);
    }

    /**
     * <pre>
     * MsgBatchCancelDerivativeOrders defines a method for cancelling a batch of
     * derivative limit orders.
     * </pre>
     */
    default void batchCancelDerivativeOrders(injective.exchange.v1beta1.Tx.MsgBatchCancelDerivativeOrders request,
        io.grpc.stub.StreamObserver<injective.exchange.v1beta1.Tx.MsgBatchCancelDerivativeOrdersResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getBatchCancelDerivativeOrdersMethod(), responseObserver);
    }

    /**
     * <pre>
     * InstantBinaryOptionsMarketLaunch defines method for creating a binary
     * options market by paying listing fee without governance
     * </pre>
     */
    default void instantBinaryOptionsMarketLaunch(injective.exchange.v1beta1.Tx.MsgInstantBinaryOptionsMarketLaunch request,
        io.grpc.stub.StreamObserver<injective.exchange.v1beta1.Tx.MsgInstantBinaryOptionsMarketLaunchResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getInstantBinaryOptionsMarketLaunchMethod(), responseObserver);
    }

    /**
     * <pre>
     * CreateBinaryOptionsLimitOrder defines a method for creating a new binary
     * options limit order.
     * </pre>
     */
    default void createBinaryOptionsLimitOrder(injective.exchange.v1beta1.Tx.MsgCreateBinaryOptionsLimitOrder request,
        io.grpc.stub.StreamObserver<injective.exchange.v1beta1.Tx.MsgCreateBinaryOptionsLimitOrderResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateBinaryOptionsLimitOrderMethod(), responseObserver);
    }

    /**
     * <pre>
     * CreateBinaryOptionsMarketOrder defines a method for creating a new binary
     * options market order.
     * </pre>
     */
    default void createBinaryOptionsMarketOrder(injective.exchange.v1beta1.Tx.MsgCreateBinaryOptionsMarketOrder request,
        io.grpc.stub.StreamObserver<injective.exchange.v1beta1.Tx.MsgCreateBinaryOptionsMarketOrderResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateBinaryOptionsMarketOrderMethod(), responseObserver);
    }

    /**
     * <pre>
     * MsgCancelBinaryOptionsOrder defines a method for cancelling a binary
     * options order.
     * </pre>
     */
    default void cancelBinaryOptionsOrder(injective.exchange.v1beta1.Tx.MsgCancelBinaryOptionsOrder request,
        io.grpc.stub.StreamObserver<injective.exchange.v1beta1.Tx.MsgCancelBinaryOptionsOrderResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCancelBinaryOptionsOrderMethod(), responseObserver);
    }

    /**
     * <pre>
     * BatchCancelBinaryOptionsOrders defines a method for cancelling a batch of
     * binary options limit orders.
     * </pre>
     */
    default void batchCancelBinaryOptionsOrders(injective.exchange.v1beta1.Tx.MsgBatchCancelBinaryOptionsOrders request,
        io.grpc.stub.StreamObserver<injective.exchange.v1beta1.Tx.MsgBatchCancelBinaryOptionsOrdersResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getBatchCancelBinaryOptionsOrdersMethod(), responseObserver);
    }

    /**
     * <pre>
     * SubaccountTransfer defines a method for transfer between subaccounts
     * </pre>
     */
    default void subaccountTransfer(injective.exchange.v1beta1.Tx.MsgSubaccountTransfer request,
        io.grpc.stub.StreamObserver<injective.exchange.v1beta1.Tx.MsgSubaccountTransferResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSubaccountTransferMethod(), responseObserver);
    }

    /**
     * <pre>
     * ExternalTransfer defines a method for transfer between external accounts
     * </pre>
     */
    default void externalTransfer(injective.exchange.v1beta1.Tx.MsgExternalTransfer request,
        io.grpc.stub.StreamObserver<injective.exchange.v1beta1.Tx.MsgExternalTransferResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getExternalTransferMethod(), responseObserver);
    }

    /**
     * <pre>
     * LiquidatePosition defines a method for liquidating a position
     * </pre>
     */
    default void liquidatePosition(injective.exchange.v1beta1.Tx.MsgLiquidatePosition request,
        io.grpc.stub.StreamObserver<injective.exchange.v1beta1.Tx.MsgLiquidatePositionResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getLiquidatePositionMethod(), responseObserver);
    }

    /**
     * <pre>
     * EmergencySettleMarket defines a method for emergency settling a market
     * </pre>
     */
    default void emergencySettleMarket(injective.exchange.v1beta1.Tx.MsgEmergencySettleMarket request,
        io.grpc.stub.StreamObserver<injective.exchange.v1beta1.Tx.MsgEmergencySettleMarketResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getEmergencySettleMarketMethod(), responseObserver);
    }

    /**
     * <pre>
     * IncreasePositionMargin defines a method for increasing margin of a position
     * </pre>
     */
    default void increasePositionMargin(injective.exchange.v1beta1.Tx.MsgIncreasePositionMargin request,
        io.grpc.stub.StreamObserver<injective.exchange.v1beta1.Tx.MsgIncreasePositionMarginResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getIncreasePositionMarginMethod(), responseObserver);
    }

    /**
     * <pre>
     * RewardsOptOut defines a method for opting out of rewards
     * </pre>
     */
    default void rewardsOptOut(injective.exchange.v1beta1.Tx.MsgRewardsOptOut request,
        io.grpc.stub.StreamObserver<injective.exchange.v1beta1.Tx.MsgRewardsOptOutResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getRewardsOptOutMethod(), responseObserver);
    }

    /**
     * <pre>
     * AdminUpdateBinaryOptionsMarket defines method for updating a binary options
     * market by admin
     * </pre>
     */
    default void adminUpdateBinaryOptionsMarket(injective.exchange.v1beta1.Tx.MsgAdminUpdateBinaryOptionsMarket request,
        io.grpc.stub.StreamObserver<injective.exchange.v1beta1.Tx.MsgAdminUpdateBinaryOptionsMarketResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getAdminUpdateBinaryOptionsMarketMethod(), responseObserver);
    }

    /**
     */
    default void reclaimLockedFunds(injective.exchange.v1beta1.Tx.MsgReclaimLockedFunds request,
        io.grpc.stub.StreamObserver<injective.exchange.v1beta1.Tx.MsgReclaimLockedFundsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getReclaimLockedFundsMethod(), responseObserver);
    }

    /**
     */
    default void updateParams(injective.exchange.v1beta1.Tx.MsgUpdateParams request,
        io.grpc.stub.StreamObserver<injective.exchange.v1beta1.Tx.MsgUpdateParamsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateParamsMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service Msg.
   * <pre>
   * Msg defines the exchange Msg service.
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
   * Msg defines the exchange Msg service.
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
     * Deposit defines a method for transferring coins from the sender's bank
     * balance into the subaccount's exchange deposits
     * </pre>
     */
    public void deposit(injective.exchange.v1beta1.Tx.MsgDeposit request,
        io.grpc.stub.StreamObserver<injective.exchange.v1beta1.Tx.MsgDepositResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDepositMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Withdraw defines a method for withdrawing coins from a subaccount's
     * deposits to the user's bank balance
     * </pre>
     */
    public void withdraw(injective.exchange.v1beta1.Tx.MsgWithdraw request,
        io.grpc.stub.StreamObserver<injective.exchange.v1beta1.Tx.MsgWithdrawResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getWithdrawMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * InstantSpotMarketLaunch defines method for creating a spot market by paying
     * listing fee without governance
     * </pre>
     */
    public void instantSpotMarketLaunch(injective.exchange.v1beta1.Tx.MsgInstantSpotMarketLaunch request,
        io.grpc.stub.StreamObserver<injective.exchange.v1beta1.Tx.MsgInstantSpotMarketLaunchResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getInstantSpotMarketLaunchMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * InstantPerpetualMarketLaunch defines a method for creating a new perpetual
     * futures market by paying listing fee without governance
     * </pre>
     */
    public void instantPerpetualMarketLaunch(injective.exchange.v1beta1.Tx.MsgInstantPerpetualMarketLaunch request,
        io.grpc.stub.StreamObserver<injective.exchange.v1beta1.Tx.MsgInstantPerpetualMarketLaunchResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getInstantPerpetualMarketLaunchMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * InstantExpiryFuturesMarketLaunch defines a method for creating a new expiry
     * futures market by paying listing fee without governance
     * </pre>
     */
    public void instantExpiryFuturesMarketLaunch(injective.exchange.v1beta1.Tx.MsgInstantExpiryFuturesMarketLaunch request,
        io.grpc.stub.StreamObserver<injective.exchange.v1beta1.Tx.MsgInstantExpiryFuturesMarketLaunchResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getInstantExpiryFuturesMarketLaunchMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * CreateSpotLimitOrder defines a method for creating a new spot limit order.
     * </pre>
     */
    public void createSpotLimitOrder(injective.exchange.v1beta1.Tx.MsgCreateSpotLimitOrder request,
        io.grpc.stub.StreamObserver<injective.exchange.v1beta1.Tx.MsgCreateSpotLimitOrderResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateSpotLimitOrderMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * BatchCreateSpotLimitOrder defines a method for creating a new batch of spot
     * limit orders.
     * </pre>
     */
    public void batchCreateSpotLimitOrders(injective.exchange.v1beta1.Tx.MsgBatchCreateSpotLimitOrders request,
        io.grpc.stub.StreamObserver<injective.exchange.v1beta1.Tx.MsgBatchCreateSpotLimitOrdersResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getBatchCreateSpotLimitOrdersMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * CreateSpotMarketOrder defines a method for creating a new spot market
     * order.
     * </pre>
     */
    public void createSpotMarketOrder(injective.exchange.v1beta1.Tx.MsgCreateSpotMarketOrder request,
        io.grpc.stub.StreamObserver<injective.exchange.v1beta1.Tx.MsgCreateSpotMarketOrderResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateSpotMarketOrderMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * MsgCancelSpotOrder defines a method for cancelling a spot order.
     * </pre>
     */
    public void cancelSpotOrder(injective.exchange.v1beta1.Tx.MsgCancelSpotOrder request,
        io.grpc.stub.StreamObserver<injective.exchange.v1beta1.Tx.MsgCancelSpotOrderResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCancelSpotOrderMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * BatchCancelSpotOrders defines a method for cancelling a batch of spot
     * orders in a given market.
     * </pre>
     */
    public void batchCancelSpotOrders(injective.exchange.v1beta1.Tx.MsgBatchCancelSpotOrders request,
        io.grpc.stub.StreamObserver<injective.exchange.v1beta1.Tx.MsgBatchCancelSpotOrdersResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getBatchCancelSpotOrdersMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * BatchUpdateOrders defines a method for updating a batch of orders.
     * </pre>
     */
    public void batchUpdateOrders(injective.exchange.v1beta1.Tx.MsgBatchUpdateOrders request,
        io.grpc.stub.StreamObserver<injective.exchange.v1beta1.Tx.MsgBatchUpdateOrdersResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getBatchUpdateOrdersMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * PrivilegedExecuteContract defines a method for executing a Cosmwasm
     * contract from the exchange module with privileged capabilities.
     * </pre>
     */
    public void privilegedExecuteContract(injective.exchange.v1beta1.Tx.MsgPrivilegedExecuteContract request,
        io.grpc.stub.StreamObserver<injective.exchange.v1beta1.Tx.MsgPrivilegedExecuteContractResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getPrivilegedExecuteContractMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * CreateDerivativeLimitOrder defines a method for creating a new derivative
     * limit order.
     * </pre>
     */
    public void createDerivativeLimitOrder(injective.exchange.v1beta1.Tx.MsgCreateDerivativeLimitOrder request,
        io.grpc.stub.StreamObserver<injective.exchange.v1beta1.Tx.MsgCreateDerivativeLimitOrderResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateDerivativeLimitOrderMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * BatchCreateDerivativeLimitOrders defines a method for creating a new batch
     * of derivative limit orders.
     * </pre>
     */
    public void batchCreateDerivativeLimitOrders(injective.exchange.v1beta1.Tx.MsgBatchCreateDerivativeLimitOrders request,
        io.grpc.stub.StreamObserver<injective.exchange.v1beta1.Tx.MsgBatchCreateDerivativeLimitOrdersResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getBatchCreateDerivativeLimitOrdersMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * MsgCreateDerivativeLimitOrder defines a method for creating a new
     * derivative market order.
     * </pre>
     */
    public void createDerivativeMarketOrder(injective.exchange.v1beta1.Tx.MsgCreateDerivativeMarketOrder request,
        io.grpc.stub.StreamObserver<injective.exchange.v1beta1.Tx.MsgCreateDerivativeMarketOrderResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateDerivativeMarketOrderMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * MsgCancelDerivativeOrder defines a method for cancelling a derivative
     * order.
     * </pre>
     */
    public void cancelDerivativeOrder(injective.exchange.v1beta1.Tx.MsgCancelDerivativeOrder request,
        io.grpc.stub.StreamObserver<injective.exchange.v1beta1.Tx.MsgCancelDerivativeOrderResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCancelDerivativeOrderMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * MsgBatchCancelDerivativeOrders defines a method for cancelling a batch of
     * derivative limit orders.
     * </pre>
     */
    public void batchCancelDerivativeOrders(injective.exchange.v1beta1.Tx.MsgBatchCancelDerivativeOrders request,
        io.grpc.stub.StreamObserver<injective.exchange.v1beta1.Tx.MsgBatchCancelDerivativeOrdersResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getBatchCancelDerivativeOrdersMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * InstantBinaryOptionsMarketLaunch defines method for creating a binary
     * options market by paying listing fee without governance
     * </pre>
     */
    public void instantBinaryOptionsMarketLaunch(injective.exchange.v1beta1.Tx.MsgInstantBinaryOptionsMarketLaunch request,
        io.grpc.stub.StreamObserver<injective.exchange.v1beta1.Tx.MsgInstantBinaryOptionsMarketLaunchResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getInstantBinaryOptionsMarketLaunchMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * CreateBinaryOptionsLimitOrder defines a method for creating a new binary
     * options limit order.
     * </pre>
     */
    public void createBinaryOptionsLimitOrder(injective.exchange.v1beta1.Tx.MsgCreateBinaryOptionsLimitOrder request,
        io.grpc.stub.StreamObserver<injective.exchange.v1beta1.Tx.MsgCreateBinaryOptionsLimitOrderResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateBinaryOptionsLimitOrderMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * CreateBinaryOptionsMarketOrder defines a method for creating a new binary
     * options market order.
     * </pre>
     */
    public void createBinaryOptionsMarketOrder(injective.exchange.v1beta1.Tx.MsgCreateBinaryOptionsMarketOrder request,
        io.grpc.stub.StreamObserver<injective.exchange.v1beta1.Tx.MsgCreateBinaryOptionsMarketOrderResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateBinaryOptionsMarketOrderMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * MsgCancelBinaryOptionsOrder defines a method for cancelling a binary
     * options order.
     * </pre>
     */
    public void cancelBinaryOptionsOrder(injective.exchange.v1beta1.Tx.MsgCancelBinaryOptionsOrder request,
        io.grpc.stub.StreamObserver<injective.exchange.v1beta1.Tx.MsgCancelBinaryOptionsOrderResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCancelBinaryOptionsOrderMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * BatchCancelBinaryOptionsOrders defines a method for cancelling a batch of
     * binary options limit orders.
     * </pre>
     */
    public void batchCancelBinaryOptionsOrders(injective.exchange.v1beta1.Tx.MsgBatchCancelBinaryOptionsOrders request,
        io.grpc.stub.StreamObserver<injective.exchange.v1beta1.Tx.MsgBatchCancelBinaryOptionsOrdersResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getBatchCancelBinaryOptionsOrdersMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * SubaccountTransfer defines a method for transfer between subaccounts
     * </pre>
     */
    public void subaccountTransfer(injective.exchange.v1beta1.Tx.MsgSubaccountTransfer request,
        io.grpc.stub.StreamObserver<injective.exchange.v1beta1.Tx.MsgSubaccountTransferResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSubaccountTransferMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * ExternalTransfer defines a method for transfer between external accounts
     * </pre>
     */
    public void externalTransfer(injective.exchange.v1beta1.Tx.MsgExternalTransfer request,
        io.grpc.stub.StreamObserver<injective.exchange.v1beta1.Tx.MsgExternalTransferResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getExternalTransferMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * LiquidatePosition defines a method for liquidating a position
     * </pre>
     */
    public void liquidatePosition(injective.exchange.v1beta1.Tx.MsgLiquidatePosition request,
        io.grpc.stub.StreamObserver<injective.exchange.v1beta1.Tx.MsgLiquidatePositionResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getLiquidatePositionMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * EmergencySettleMarket defines a method for emergency settling a market
     * </pre>
     */
    public void emergencySettleMarket(injective.exchange.v1beta1.Tx.MsgEmergencySettleMarket request,
        io.grpc.stub.StreamObserver<injective.exchange.v1beta1.Tx.MsgEmergencySettleMarketResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getEmergencySettleMarketMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * IncreasePositionMargin defines a method for increasing margin of a position
     * </pre>
     */
    public void increasePositionMargin(injective.exchange.v1beta1.Tx.MsgIncreasePositionMargin request,
        io.grpc.stub.StreamObserver<injective.exchange.v1beta1.Tx.MsgIncreasePositionMarginResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getIncreasePositionMarginMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * RewardsOptOut defines a method for opting out of rewards
     * </pre>
     */
    public void rewardsOptOut(injective.exchange.v1beta1.Tx.MsgRewardsOptOut request,
        io.grpc.stub.StreamObserver<injective.exchange.v1beta1.Tx.MsgRewardsOptOutResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getRewardsOptOutMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * AdminUpdateBinaryOptionsMarket defines method for updating a binary options
     * market by admin
     * </pre>
     */
    public void adminUpdateBinaryOptionsMarket(injective.exchange.v1beta1.Tx.MsgAdminUpdateBinaryOptionsMarket request,
        io.grpc.stub.StreamObserver<injective.exchange.v1beta1.Tx.MsgAdminUpdateBinaryOptionsMarketResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getAdminUpdateBinaryOptionsMarketMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void reclaimLockedFunds(injective.exchange.v1beta1.Tx.MsgReclaimLockedFunds request,
        io.grpc.stub.StreamObserver<injective.exchange.v1beta1.Tx.MsgReclaimLockedFundsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getReclaimLockedFundsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void updateParams(injective.exchange.v1beta1.Tx.MsgUpdateParams request,
        io.grpc.stub.StreamObserver<injective.exchange.v1beta1.Tx.MsgUpdateParamsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateParamsMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service Msg.
   * <pre>
   * Msg defines the exchange Msg service.
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
     * Deposit defines a method for transferring coins from the sender's bank
     * balance into the subaccount's exchange deposits
     * </pre>
     */
    public injective.exchange.v1beta1.Tx.MsgDepositResponse deposit(injective.exchange.v1beta1.Tx.MsgDeposit request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDepositMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Withdraw defines a method for withdrawing coins from a subaccount's
     * deposits to the user's bank balance
     * </pre>
     */
    public injective.exchange.v1beta1.Tx.MsgWithdrawResponse withdraw(injective.exchange.v1beta1.Tx.MsgWithdraw request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getWithdrawMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * InstantSpotMarketLaunch defines method for creating a spot market by paying
     * listing fee without governance
     * </pre>
     */
    public injective.exchange.v1beta1.Tx.MsgInstantSpotMarketLaunchResponse instantSpotMarketLaunch(injective.exchange.v1beta1.Tx.MsgInstantSpotMarketLaunch request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getInstantSpotMarketLaunchMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * InstantPerpetualMarketLaunch defines a method for creating a new perpetual
     * futures market by paying listing fee without governance
     * </pre>
     */
    public injective.exchange.v1beta1.Tx.MsgInstantPerpetualMarketLaunchResponse instantPerpetualMarketLaunch(injective.exchange.v1beta1.Tx.MsgInstantPerpetualMarketLaunch request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getInstantPerpetualMarketLaunchMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * InstantExpiryFuturesMarketLaunch defines a method for creating a new expiry
     * futures market by paying listing fee without governance
     * </pre>
     */
    public injective.exchange.v1beta1.Tx.MsgInstantExpiryFuturesMarketLaunchResponse instantExpiryFuturesMarketLaunch(injective.exchange.v1beta1.Tx.MsgInstantExpiryFuturesMarketLaunch request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getInstantExpiryFuturesMarketLaunchMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * CreateSpotLimitOrder defines a method for creating a new spot limit order.
     * </pre>
     */
    public injective.exchange.v1beta1.Tx.MsgCreateSpotLimitOrderResponse createSpotLimitOrder(injective.exchange.v1beta1.Tx.MsgCreateSpotLimitOrder request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateSpotLimitOrderMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * BatchCreateSpotLimitOrder defines a method for creating a new batch of spot
     * limit orders.
     * </pre>
     */
    public injective.exchange.v1beta1.Tx.MsgBatchCreateSpotLimitOrdersResponse batchCreateSpotLimitOrders(injective.exchange.v1beta1.Tx.MsgBatchCreateSpotLimitOrders request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getBatchCreateSpotLimitOrdersMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * CreateSpotMarketOrder defines a method for creating a new spot market
     * order.
     * </pre>
     */
    public injective.exchange.v1beta1.Tx.MsgCreateSpotMarketOrderResponse createSpotMarketOrder(injective.exchange.v1beta1.Tx.MsgCreateSpotMarketOrder request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateSpotMarketOrderMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * MsgCancelSpotOrder defines a method for cancelling a spot order.
     * </pre>
     */
    public injective.exchange.v1beta1.Tx.MsgCancelSpotOrderResponse cancelSpotOrder(injective.exchange.v1beta1.Tx.MsgCancelSpotOrder request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCancelSpotOrderMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * BatchCancelSpotOrders defines a method for cancelling a batch of spot
     * orders in a given market.
     * </pre>
     */
    public injective.exchange.v1beta1.Tx.MsgBatchCancelSpotOrdersResponse batchCancelSpotOrders(injective.exchange.v1beta1.Tx.MsgBatchCancelSpotOrders request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getBatchCancelSpotOrdersMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * BatchUpdateOrders defines a method for updating a batch of orders.
     * </pre>
     */
    public injective.exchange.v1beta1.Tx.MsgBatchUpdateOrdersResponse batchUpdateOrders(injective.exchange.v1beta1.Tx.MsgBatchUpdateOrders request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getBatchUpdateOrdersMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * PrivilegedExecuteContract defines a method for executing a Cosmwasm
     * contract from the exchange module with privileged capabilities.
     * </pre>
     */
    public injective.exchange.v1beta1.Tx.MsgPrivilegedExecuteContractResponse privilegedExecuteContract(injective.exchange.v1beta1.Tx.MsgPrivilegedExecuteContract request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getPrivilegedExecuteContractMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * CreateDerivativeLimitOrder defines a method for creating a new derivative
     * limit order.
     * </pre>
     */
    public injective.exchange.v1beta1.Tx.MsgCreateDerivativeLimitOrderResponse createDerivativeLimitOrder(injective.exchange.v1beta1.Tx.MsgCreateDerivativeLimitOrder request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateDerivativeLimitOrderMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * BatchCreateDerivativeLimitOrders defines a method for creating a new batch
     * of derivative limit orders.
     * </pre>
     */
    public injective.exchange.v1beta1.Tx.MsgBatchCreateDerivativeLimitOrdersResponse batchCreateDerivativeLimitOrders(injective.exchange.v1beta1.Tx.MsgBatchCreateDerivativeLimitOrders request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getBatchCreateDerivativeLimitOrdersMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * MsgCreateDerivativeLimitOrder defines a method for creating a new
     * derivative market order.
     * </pre>
     */
    public injective.exchange.v1beta1.Tx.MsgCreateDerivativeMarketOrderResponse createDerivativeMarketOrder(injective.exchange.v1beta1.Tx.MsgCreateDerivativeMarketOrder request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateDerivativeMarketOrderMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * MsgCancelDerivativeOrder defines a method for cancelling a derivative
     * order.
     * </pre>
     */
    public injective.exchange.v1beta1.Tx.MsgCancelDerivativeOrderResponse cancelDerivativeOrder(injective.exchange.v1beta1.Tx.MsgCancelDerivativeOrder request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCancelDerivativeOrderMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * MsgBatchCancelDerivativeOrders defines a method for cancelling a batch of
     * derivative limit orders.
     * </pre>
     */
    public injective.exchange.v1beta1.Tx.MsgBatchCancelDerivativeOrdersResponse batchCancelDerivativeOrders(injective.exchange.v1beta1.Tx.MsgBatchCancelDerivativeOrders request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getBatchCancelDerivativeOrdersMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * InstantBinaryOptionsMarketLaunch defines method for creating a binary
     * options market by paying listing fee without governance
     * </pre>
     */
    public injective.exchange.v1beta1.Tx.MsgInstantBinaryOptionsMarketLaunchResponse instantBinaryOptionsMarketLaunch(injective.exchange.v1beta1.Tx.MsgInstantBinaryOptionsMarketLaunch request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getInstantBinaryOptionsMarketLaunchMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * CreateBinaryOptionsLimitOrder defines a method for creating a new binary
     * options limit order.
     * </pre>
     */
    public injective.exchange.v1beta1.Tx.MsgCreateBinaryOptionsLimitOrderResponse createBinaryOptionsLimitOrder(injective.exchange.v1beta1.Tx.MsgCreateBinaryOptionsLimitOrder request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateBinaryOptionsLimitOrderMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * CreateBinaryOptionsMarketOrder defines a method for creating a new binary
     * options market order.
     * </pre>
     */
    public injective.exchange.v1beta1.Tx.MsgCreateBinaryOptionsMarketOrderResponse createBinaryOptionsMarketOrder(injective.exchange.v1beta1.Tx.MsgCreateBinaryOptionsMarketOrder request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateBinaryOptionsMarketOrderMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * MsgCancelBinaryOptionsOrder defines a method for cancelling a binary
     * options order.
     * </pre>
     */
    public injective.exchange.v1beta1.Tx.MsgCancelBinaryOptionsOrderResponse cancelBinaryOptionsOrder(injective.exchange.v1beta1.Tx.MsgCancelBinaryOptionsOrder request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCancelBinaryOptionsOrderMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * BatchCancelBinaryOptionsOrders defines a method for cancelling a batch of
     * binary options limit orders.
     * </pre>
     */
    public injective.exchange.v1beta1.Tx.MsgBatchCancelBinaryOptionsOrdersResponse batchCancelBinaryOptionsOrders(injective.exchange.v1beta1.Tx.MsgBatchCancelBinaryOptionsOrders request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getBatchCancelBinaryOptionsOrdersMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * SubaccountTransfer defines a method for transfer between subaccounts
     * </pre>
     */
    public injective.exchange.v1beta1.Tx.MsgSubaccountTransferResponse subaccountTransfer(injective.exchange.v1beta1.Tx.MsgSubaccountTransfer request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSubaccountTransferMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * ExternalTransfer defines a method for transfer between external accounts
     * </pre>
     */
    public injective.exchange.v1beta1.Tx.MsgExternalTransferResponse externalTransfer(injective.exchange.v1beta1.Tx.MsgExternalTransfer request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getExternalTransferMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * LiquidatePosition defines a method for liquidating a position
     * </pre>
     */
    public injective.exchange.v1beta1.Tx.MsgLiquidatePositionResponse liquidatePosition(injective.exchange.v1beta1.Tx.MsgLiquidatePosition request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getLiquidatePositionMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * EmergencySettleMarket defines a method for emergency settling a market
     * </pre>
     */
    public injective.exchange.v1beta1.Tx.MsgEmergencySettleMarketResponse emergencySettleMarket(injective.exchange.v1beta1.Tx.MsgEmergencySettleMarket request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getEmergencySettleMarketMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * IncreasePositionMargin defines a method for increasing margin of a position
     * </pre>
     */
    public injective.exchange.v1beta1.Tx.MsgIncreasePositionMarginResponse increasePositionMargin(injective.exchange.v1beta1.Tx.MsgIncreasePositionMargin request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getIncreasePositionMarginMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * RewardsOptOut defines a method for opting out of rewards
     * </pre>
     */
    public injective.exchange.v1beta1.Tx.MsgRewardsOptOutResponse rewardsOptOut(injective.exchange.v1beta1.Tx.MsgRewardsOptOut request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getRewardsOptOutMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * AdminUpdateBinaryOptionsMarket defines method for updating a binary options
     * market by admin
     * </pre>
     */
    public injective.exchange.v1beta1.Tx.MsgAdminUpdateBinaryOptionsMarketResponse adminUpdateBinaryOptionsMarket(injective.exchange.v1beta1.Tx.MsgAdminUpdateBinaryOptionsMarket request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getAdminUpdateBinaryOptionsMarketMethod(), getCallOptions(), request);
    }

    /**
     */
    public injective.exchange.v1beta1.Tx.MsgReclaimLockedFundsResponse reclaimLockedFunds(injective.exchange.v1beta1.Tx.MsgReclaimLockedFunds request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getReclaimLockedFundsMethod(), getCallOptions(), request);
    }

    /**
     */
    public injective.exchange.v1beta1.Tx.MsgUpdateParamsResponse updateParams(injective.exchange.v1beta1.Tx.MsgUpdateParams request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateParamsMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service Msg.
   * <pre>
   * Msg defines the exchange Msg service.
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
     * Deposit defines a method for transferring coins from the sender's bank
     * balance into the subaccount's exchange deposits
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<injective.exchange.v1beta1.Tx.MsgDepositResponse> deposit(
        injective.exchange.v1beta1.Tx.MsgDeposit request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDepositMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Withdraw defines a method for withdrawing coins from a subaccount's
     * deposits to the user's bank balance
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<injective.exchange.v1beta1.Tx.MsgWithdrawResponse> withdraw(
        injective.exchange.v1beta1.Tx.MsgWithdraw request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getWithdrawMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * InstantSpotMarketLaunch defines method for creating a spot market by paying
     * listing fee without governance
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<injective.exchange.v1beta1.Tx.MsgInstantSpotMarketLaunchResponse> instantSpotMarketLaunch(
        injective.exchange.v1beta1.Tx.MsgInstantSpotMarketLaunch request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getInstantSpotMarketLaunchMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * InstantPerpetualMarketLaunch defines a method for creating a new perpetual
     * futures market by paying listing fee without governance
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<injective.exchange.v1beta1.Tx.MsgInstantPerpetualMarketLaunchResponse> instantPerpetualMarketLaunch(
        injective.exchange.v1beta1.Tx.MsgInstantPerpetualMarketLaunch request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getInstantPerpetualMarketLaunchMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * InstantExpiryFuturesMarketLaunch defines a method for creating a new expiry
     * futures market by paying listing fee without governance
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<injective.exchange.v1beta1.Tx.MsgInstantExpiryFuturesMarketLaunchResponse> instantExpiryFuturesMarketLaunch(
        injective.exchange.v1beta1.Tx.MsgInstantExpiryFuturesMarketLaunch request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getInstantExpiryFuturesMarketLaunchMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * CreateSpotLimitOrder defines a method for creating a new spot limit order.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<injective.exchange.v1beta1.Tx.MsgCreateSpotLimitOrderResponse> createSpotLimitOrder(
        injective.exchange.v1beta1.Tx.MsgCreateSpotLimitOrder request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateSpotLimitOrderMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * BatchCreateSpotLimitOrder defines a method for creating a new batch of spot
     * limit orders.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<injective.exchange.v1beta1.Tx.MsgBatchCreateSpotLimitOrdersResponse> batchCreateSpotLimitOrders(
        injective.exchange.v1beta1.Tx.MsgBatchCreateSpotLimitOrders request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getBatchCreateSpotLimitOrdersMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * CreateSpotMarketOrder defines a method for creating a new spot market
     * order.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<injective.exchange.v1beta1.Tx.MsgCreateSpotMarketOrderResponse> createSpotMarketOrder(
        injective.exchange.v1beta1.Tx.MsgCreateSpotMarketOrder request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateSpotMarketOrderMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * MsgCancelSpotOrder defines a method for cancelling a spot order.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<injective.exchange.v1beta1.Tx.MsgCancelSpotOrderResponse> cancelSpotOrder(
        injective.exchange.v1beta1.Tx.MsgCancelSpotOrder request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCancelSpotOrderMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * BatchCancelSpotOrders defines a method for cancelling a batch of spot
     * orders in a given market.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<injective.exchange.v1beta1.Tx.MsgBatchCancelSpotOrdersResponse> batchCancelSpotOrders(
        injective.exchange.v1beta1.Tx.MsgBatchCancelSpotOrders request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getBatchCancelSpotOrdersMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * BatchUpdateOrders defines a method for updating a batch of orders.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<injective.exchange.v1beta1.Tx.MsgBatchUpdateOrdersResponse> batchUpdateOrders(
        injective.exchange.v1beta1.Tx.MsgBatchUpdateOrders request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getBatchUpdateOrdersMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * PrivilegedExecuteContract defines a method for executing a Cosmwasm
     * contract from the exchange module with privileged capabilities.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<injective.exchange.v1beta1.Tx.MsgPrivilegedExecuteContractResponse> privilegedExecuteContract(
        injective.exchange.v1beta1.Tx.MsgPrivilegedExecuteContract request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getPrivilegedExecuteContractMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * CreateDerivativeLimitOrder defines a method for creating a new derivative
     * limit order.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<injective.exchange.v1beta1.Tx.MsgCreateDerivativeLimitOrderResponse> createDerivativeLimitOrder(
        injective.exchange.v1beta1.Tx.MsgCreateDerivativeLimitOrder request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateDerivativeLimitOrderMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * BatchCreateDerivativeLimitOrders defines a method for creating a new batch
     * of derivative limit orders.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<injective.exchange.v1beta1.Tx.MsgBatchCreateDerivativeLimitOrdersResponse> batchCreateDerivativeLimitOrders(
        injective.exchange.v1beta1.Tx.MsgBatchCreateDerivativeLimitOrders request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getBatchCreateDerivativeLimitOrdersMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * MsgCreateDerivativeLimitOrder defines a method for creating a new
     * derivative market order.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<injective.exchange.v1beta1.Tx.MsgCreateDerivativeMarketOrderResponse> createDerivativeMarketOrder(
        injective.exchange.v1beta1.Tx.MsgCreateDerivativeMarketOrder request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateDerivativeMarketOrderMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * MsgCancelDerivativeOrder defines a method for cancelling a derivative
     * order.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<injective.exchange.v1beta1.Tx.MsgCancelDerivativeOrderResponse> cancelDerivativeOrder(
        injective.exchange.v1beta1.Tx.MsgCancelDerivativeOrder request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCancelDerivativeOrderMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * MsgBatchCancelDerivativeOrders defines a method for cancelling a batch of
     * derivative limit orders.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<injective.exchange.v1beta1.Tx.MsgBatchCancelDerivativeOrdersResponse> batchCancelDerivativeOrders(
        injective.exchange.v1beta1.Tx.MsgBatchCancelDerivativeOrders request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getBatchCancelDerivativeOrdersMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * InstantBinaryOptionsMarketLaunch defines method for creating a binary
     * options market by paying listing fee without governance
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<injective.exchange.v1beta1.Tx.MsgInstantBinaryOptionsMarketLaunchResponse> instantBinaryOptionsMarketLaunch(
        injective.exchange.v1beta1.Tx.MsgInstantBinaryOptionsMarketLaunch request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getInstantBinaryOptionsMarketLaunchMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * CreateBinaryOptionsLimitOrder defines a method for creating a new binary
     * options limit order.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<injective.exchange.v1beta1.Tx.MsgCreateBinaryOptionsLimitOrderResponse> createBinaryOptionsLimitOrder(
        injective.exchange.v1beta1.Tx.MsgCreateBinaryOptionsLimitOrder request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateBinaryOptionsLimitOrderMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * CreateBinaryOptionsMarketOrder defines a method for creating a new binary
     * options market order.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<injective.exchange.v1beta1.Tx.MsgCreateBinaryOptionsMarketOrderResponse> createBinaryOptionsMarketOrder(
        injective.exchange.v1beta1.Tx.MsgCreateBinaryOptionsMarketOrder request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateBinaryOptionsMarketOrderMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * MsgCancelBinaryOptionsOrder defines a method for cancelling a binary
     * options order.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<injective.exchange.v1beta1.Tx.MsgCancelBinaryOptionsOrderResponse> cancelBinaryOptionsOrder(
        injective.exchange.v1beta1.Tx.MsgCancelBinaryOptionsOrder request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCancelBinaryOptionsOrderMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * BatchCancelBinaryOptionsOrders defines a method for cancelling a batch of
     * binary options limit orders.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<injective.exchange.v1beta1.Tx.MsgBatchCancelBinaryOptionsOrdersResponse> batchCancelBinaryOptionsOrders(
        injective.exchange.v1beta1.Tx.MsgBatchCancelBinaryOptionsOrders request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getBatchCancelBinaryOptionsOrdersMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * SubaccountTransfer defines a method for transfer between subaccounts
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<injective.exchange.v1beta1.Tx.MsgSubaccountTransferResponse> subaccountTransfer(
        injective.exchange.v1beta1.Tx.MsgSubaccountTransfer request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSubaccountTransferMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * ExternalTransfer defines a method for transfer between external accounts
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<injective.exchange.v1beta1.Tx.MsgExternalTransferResponse> externalTransfer(
        injective.exchange.v1beta1.Tx.MsgExternalTransfer request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getExternalTransferMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * LiquidatePosition defines a method for liquidating a position
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<injective.exchange.v1beta1.Tx.MsgLiquidatePositionResponse> liquidatePosition(
        injective.exchange.v1beta1.Tx.MsgLiquidatePosition request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getLiquidatePositionMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * EmergencySettleMarket defines a method for emergency settling a market
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<injective.exchange.v1beta1.Tx.MsgEmergencySettleMarketResponse> emergencySettleMarket(
        injective.exchange.v1beta1.Tx.MsgEmergencySettleMarket request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getEmergencySettleMarketMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * IncreasePositionMargin defines a method for increasing margin of a position
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<injective.exchange.v1beta1.Tx.MsgIncreasePositionMarginResponse> increasePositionMargin(
        injective.exchange.v1beta1.Tx.MsgIncreasePositionMargin request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getIncreasePositionMarginMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * RewardsOptOut defines a method for opting out of rewards
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<injective.exchange.v1beta1.Tx.MsgRewardsOptOutResponse> rewardsOptOut(
        injective.exchange.v1beta1.Tx.MsgRewardsOptOut request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getRewardsOptOutMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * AdminUpdateBinaryOptionsMarket defines method for updating a binary options
     * market by admin
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<injective.exchange.v1beta1.Tx.MsgAdminUpdateBinaryOptionsMarketResponse> adminUpdateBinaryOptionsMarket(
        injective.exchange.v1beta1.Tx.MsgAdminUpdateBinaryOptionsMarket request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getAdminUpdateBinaryOptionsMarketMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<injective.exchange.v1beta1.Tx.MsgReclaimLockedFundsResponse> reclaimLockedFunds(
        injective.exchange.v1beta1.Tx.MsgReclaimLockedFunds request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getReclaimLockedFundsMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<injective.exchange.v1beta1.Tx.MsgUpdateParamsResponse> updateParams(
        injective.exchange.v1beta1.Tx.MsgUpdateParams request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateParamsMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_DEPOSIT = 0;
  private static final int METHODID_WITHDRAW = 1;
  private static final int METHODID_INSTANT_SPOT_MARKET_LAUNCH = 2;
  private static final int METHODID_INSTANT_PERPETUAL_MARKET_LAUNCH = 3;
  private static final int METHODID_INSTANT_EXPIRY_FUTURES_MARKET_LAUNCH = 4;
  private static final int METHODID_CREATE_SPOT_LIMIT_ORDER = 5;
  private static final int METHODID_BATCH_CREATE_SPOT_LIMIT_ORDERS = 6;
  private static final int METHODID_CREATE_SPOT_MARKET_ORDER = 7;
  private static final int METHODID_CANCEL_SPOT_ORDER = 8;
  private static final int METHODID_BATCH_CANCEL_SPOT_ORDERS = 9;
  private static final int METHODID_BATCH_UPDATE_ORDERS = 10;
  private static final int METHODID_PRIVILEGED_EXECUTE_CONTRACT = 11;
  private static final int METHODID_CREATE_DERIVATIVE_LIMIT_ORDER = 12;
  private static final int METHODID_BATCH_CREATE_DERIVATIVE_LIMIT_ORDERS = 13;
  private static final int METHODID_CREATE_DERIVATIVE_MARKET_ORDER = 14;
  private static final int METHODID_CANCEL_DERIVATIVE_ORDER = 15;
  private static final int METHODID_BATCH_CANCEL_DERIVATIVE_ORDERS = 16;
  private static final int METHODID_INSTANT_BINARY_OPTIONS_MARKET_LAUNCH = 17;
  private static final int METHODID_CREATE_BINARY_OPTIONS_LIMIT_ORDER = 18;
  private static final int METHODID_CREATE_BINARY_OPTIONS_MARKET_ORDER = 19;
  private static final int METHODID_CANCEL_BINARY_OPTIONS_ORDER = 20;
  private static final int METHODID_BATCH_CANCEL_BINARY_OPTIONS_ORDERS = 21;
  private static final int METHODID_SUBACCOUNT_TRANSFER = 22;
  private static final int METHODID_EXTERNAL_TRANSFER = 23;
  private static final int METHODID_LIQUIDATE_POSITION = 24;
  private static final int METHODID_EMERGENCY_SETTLE_MARKET = 25;
  private static final int METHODID_INCREASE_POSITION_MARGIN = 26;
  private static final int METHODID_REWARDS_OPT_OUT = 27;
  private static final int METHODID_ADMIN_UPDATE_BINARY_OPTIONS_MARKET = 28;
  private static final int METHODID_RECLAIM_LOCKED_FUNDS = 29;
  private static final int METHODID_UPDATE_PARAMS = 30;

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
        case METHODID_DEPOSIT:
          serviceImpl.deposit((injective.exchange.v1beta1.Tx.MsgDeposit) request,
              (io.grpc.stub.StreamObserver<injective.exchange.v1beta1.Tx.MsgDepositResponse>) responseObserver);
          break;
        case METHODID_WITHDRAW:
          serviceImpl.withdraw((injective.exchange.v1beta1.Tx.MsgWithdraw) request,
              (io.grpc.stub.StreamObserver<injective.exchange.v1beta1.Tx.MsgWithdrawResponse>) responseObserver);
          break;
        case METHODID_INSTANT_SPOT_MARKET_LAUNCH:
          serviceImpl.instantSpotMarketLaunch((injective.exchange.v1beta1.Tx.MsgInstantSpotMarketLaunch) request,
              (io.grpc.stub.StreamObserver<injective.exchange.v1beta1.Tx.MsgInstantSpotMarketLaunchResponse>) responseObserver);
          break;
        case METHODID_INSTANT_PERPETUAL_MARKET_LAUNCH:
          serviceImpl.instantPerpetualMarketLaunch((injective.exchange.v1beta1.Tx.MsgInstantPerpetualMarketLaunch) request,
              (io.grpc.stub.StreamObserver<injective.exchange.v1beta1.Tx.MsgInstantPerpetualMarketLaunchResponse>) responseObserver);
          break;
        case METHODID_INSTANT_EXPIRY_FUTURES_MARKET_LAUNCH:
          serviceImpl.instantExpiryFuturesMarketLaunch((injective.exchange.v1beta1.Tx.MsgInstantExpiryFuturesMarketLaunch) request,
              (io.grpc.stub.StreamObserver<injective.exchange.v1beta1.Tx.MsgInstantExpiryFuturesMarketLaunchResponse>) responseObserver);
          break;
        case METHODID_CREATE_SPOT_LIMIT_ORDER:
          serviceImpl.createSpotLimitOrder((injective.exchange.v1beta1.Tx.MsgCreateSpotLimitOrder) request,
              (io.grpc.stub.StreamObserver<injective.exchange.v1beta1.Tx.MsgCreateSpotLimitOrderResponse>) responseObserver);
          break;
        case METHODID_BATCH_CREATE_SPOT_LIMIT_ORDERS:
          serviceImpl.batchCreateSpotLimitOrders((injective.exchange.v1beta1.Tx.MsgBatchCreateSpotLimitOrders) request,
              (io.grpc.stub.StreamObserver<injective.exchange.v1beta1.Tx.MsgBatchCreateSpotLimitOrdersResponse>) responseObserver);
          break;
        case METHODID_CREATE_SPOT_MARKET_ORDER:
          serviceImpl.createSpotMarketOrder((injective.exchange.v1beta1.Tx.MsgCreateSpotMarketOrder) request,
              (io.grpc.stub.StreamObserver<injective.exchange.v1beta1.Tx.MsgCreateSpotMarketOrderResponse>) responseObserver);
          break;
        case METHODID_CANCEL_SPOT_ORDER:
          serviceImpl.cancelSpotOrder((injective.exchange.v1beta1.Tx.MsgCancelSpotOrder) request,
              (io.grpc.stub.StreamObserver<injective.exchange.v1beta1.Tx.MsgCancelSpotOrderResponse>) responseObserver);
          break;
        case METHODID_BATCH_CANCEL_SPOT_ORDERS:
          serviceImpl.batchCancelSpotOrders((injective.exchange.v1beta1.Tx.MsgBatchCancelSpotOrders) request,
              (io.grpc.stub.StreamObserver<injective.exchange.v1beta1.Tx.MsgBatchCancelSpotOrdersResponse>) responseObserver);
          break;
        case METHODID_BATCH_UPDATE_ORDERS:
          serviceImpl.batchUpdateOrders((injective.exchange.v1beta1.Tx.MsgBatchUpdateOrders) request,
              (io.grpc.stub.StreamObserver<injective.exchange.v1beta1.Tx.MsgBatchUpdateOrdersResponse>) responseObserver);
          break;
        case METHODID_PRIVILEGED_EXECUTE_CONTRACT:
          serviceImpl.privilegedExecuteContract((injective.exchange.v1beta1.Tx.MsgPrivilegedExecuteContract) request,
              (io.grpc.stub.StreamObserver<injective.exchange.v1beta1.Tx.MsgPrivilegedExecuteContractResponse>) responseObserver);
          break;
        case METHODID_CREATE_DERIVATIVE_LIMIT_ORDER:
          serviceImpl.createDerivativeLimitOrder((injective.exchange.v1beta1.Tx.MsgCreateDerivativeLimitOrder) request,
              (io.grpc.stub.StreamObserver<injective.exchange.v1beta1.Tx.MsgCreateDerivativeLimitOrderResponse>) responseObserver);
          break;
        case METHODID_BATCH_CREATE_DERIVATIVE_LIMIT_ORDERS:
          serviceImpl.batchCreateDerivativeLimitOrders((injective.exchange.v1beta1.Tx.MsgBatchCreateDerivativeLimitOrders) request,
              (io.grpc.stub.StreamObserver<injective.exchange.v1beta1.Tx.MsgBatchCreateDerivativeLimitOrdersResponse>) responseObserver);
          break;
        case METHODID_CREATE_DERIVATIVE_MARKET_ORDER:
          serviceImpl.createDerivativeMarketOrder((injective.exchange.v1beta1.Tx.MsgCreateDerivativeMarketOrder) request,
              (io.grpc.stub.StreamObserver<injective.exchange.v1beta1.Tx.MsgCreateDerivativeMarketOrderResponse>) responseObserver);
          break;
        case METHODID_CANCEL_DERIVATIVE_ORDER:
          serviceImpl.cancelDerivativeOrder((injective.exchange.v1beta1.Tx.MsgCancelDerivativeOrder) request,
              (io.grpc.stub.StreamObserver<injective.exchange.v1beta1.Tx.MsgCancelDerivativeOrderResponse>) responseObserver);
          break;
        case METHODID_BATCH_CANCEL_DERIVATIVE_ORDERS:
          serviceImpl.batchCancelDerivativeOrders((injective.exchange.v1beta1.Tx.MsgBatchCancelDerivativeOrders) request,
              (io.grpc.stub.StreamObserver<injective.exchange.v1beta1.Tx.MsgBatchCancelDerivativeOrdersResponse>) responseObserver);
          break;
        case METHODID_INSTANT_BINARY_OPTIONS_MARKET_LAUNCH:
          serviceImpl.instantBinaryOptionsMarketLaunch((injective.exchange.v1beta1.Tx.MsgInstantBinaryOptionsMarketLaunch) request,
              (io.grpc.stub.StreamObserver<injective.exchange.v1beta1.Tx.MsgInstantBinaryOptionsMarketLaunchResponse>) responseObserver);
          break;
        case METHODID_CREATE_BINARY_OPTIONS_LIMIT_ORDER:
          serviceImpl.createBinaryOptionsLimitOrder((injective.exchange.v1beta1.Tx.MsgCreateBinaryOptionsLimitOrder) request,
              (io.grpc.stub.StreamObserver<injective.exchange.v1beta1.Tx.MsgCreateBinaryOptionsLimitOrderResponse>) responseObserver);
          break;
        case METHODID_CREATE_BINARY_OPTIONS_MARKET_ORDER:
          serviceImpl.createBinaryOptionsMarketOrder((injective.exchange.v1beta1.Tx.MsgCreateBinaryOptionsMarketOrder) request,
              (io.grpc.stub.StreamObserver<injective.exchange.v1beta1.Tx.MsgCreateBinaryOptionsMarketOrderResponse>) responseObserver);
          break;
        case METHODID_CANCEL_BINARY_OPTIONS_ORDER:
          serviceImpl.cancelBinaryOptionsOrder((injective.exchange.v1beta1.Tx.MsgCancelBinaryOptionsOrder) request,
              (io.grpc.stub.StreamObserver<injective.exchange.v1beta1.Tx.MsgCancelBinaryOptionsOrderResponse>) responseObserver);
          break;
        case METHODID_BATCH_CANCEL_BINARY_OPTIONS_ORDERS:
          serviceImpl.batchCancelBinaryOptionsOrders((injective.exchange.v1beta1.Tx.MsgBatchCancelBinaryOptionsOrders) request,
              (io.grpc.stub.StreamObserver<injective.exchange.v1beta1.Tx.MsgBatchCancelBinaryOptionsOrdersResponse>) responseObserver);
          break;
        case METHODID_SUBACCOUNT_TRANSFER:
          serviceImpl.subaccountTransfer((injective.exchange.v1beta1.Tx.MsgSubaccountTransfer) request,
              (io.grpc.stub.StreamObserver<injective.exchange.v1beta1.Tx.MsgSubaccountTransferResponse>) responseObserver);
          break;
        case METHODID_EXTERNAL_TRANSFER:
          serviceImpl.externalTransfer((injective.exchange.v1beta1.Tx.MsgExternalTransfer) request,
              (io.grpc.stub.StreamObserver<injective.exchange.v1beta1.Tx.MsgExternalTransferResponse>) responseObserver);
          break;
        case METHODID_LIQUIDATE_POSITION:
          serviceImpl.liquidatePosition((injective.exchange.v1beta1.Tx.MsgLiquidatePosition) request,
              (io.grpc.stub.StreamObserver<injective.exchange.v1beta1.Tx.MsgLiquidatePositionResponse>) responseObserver);
          break;
        case METHODID_EMERGENCY_SETTLE_MARKET:
          serviceImpl.emergencySettleMarket((injective.exchange.v1beta1.Tx.MsgEmergencySettleMarket) request,
              (io.grpc.stub.StreamObserver<injective.exchange.v1beta1.Tx.MsgEmergencySettleMarketResponse>) responseObserver);
          break;
        case METHODID_INCREASE_POSITION_MARGIN:
          serviceImpl.increasePositionMargin((injective.exchange.v1beta1.Tx.MsgIncreasePositionMargin) request,
              (io.grpc.stub.StreamObserver<injective.exchange.v1beta1.Tx.MsgIncreasePositionMarginResponse>) responseObserver);
          break;
        case METHODID_REWARDS_OPT_OUT:
          serviceImpl.rewardsOptOut((injective.exchange.v1beta1.Tx.MsgRewardsOptOut) request,
              (io.grpc.stub.StreamObserver<injective.exchange.v1beta1.Tx.MsgRewardsOptOutResponse>) responseObserver);
          break;
        case METHODID_ADMIN_UPDATE_BINARY_OPTIONS_MARKET:
          serviceImpl.adminUpdateBinaryOptionsMarket((injective.exchange.v1beta1.Tx.MsgAdminUpdateBinaryOptionsMarket) request,
              (io.grpc.stub.StreamObserver<injective.exchange.v1beta1.Tx.MsgAdminUpdateBinaryOptionsMarketResponse>) responseObserver);
          break;
        case METHODID_RECLAIM_LOCKED_FUNDS:
          serviceImpl.reclaimLockedFunds((injective.exchange.v1beta1.Tx.MsgReclaimLockedFunds) request,
              (io.grpc.stub.StreamObserver<injective.exchange.v1beta1.Tx.MsgReclaimLockedFundsResponse>) responseObserver);
          break;
        case METHODID_UPDATE_PARAMS:
          serviceImpl.updateParams((injective.exchange.v1beta1.Tx.MsgUpdateParams) request,
              (io.grpc.stub.StreamObserver<injective.exchange.v1beta1.Tx.MsgUpdateParamsResponse>) responseObserver);
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
          getDepositMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              injective.exchange.v1beta1.Tx.MsgDeposit,
              injective.exchange.v1beta1.Tx.MsgDepositResponse>(
                service, METHODID_DEPOSIT)))
        .addMethod(
          getWithdrawMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              injective.exchange.v1beta1.Tx.MsgWithdraw,
              injective.exchange.v1beta1.Tx.MsgWithdrawResponse>(
                service, METHODID_WITHDRAW)))
        .addMethod(
          getInstantSpotMarketLaunchMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              injective.exchange.v1beta1.Tx.MsgInstantSpotMarketLaunch,
              injective.exchange.v1beta1.Tx.MsgInstantSpotMarketLaunchResponse>(
                service, METHODID_INSTANT_SPOT_MARKET_LAUNCH)))
        .addMethod(
          getInstantPerpetualMarketLaunchMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              injective.exchange.v1beta1.Tx.MsgInstantPerpetualMarketLaunch,
              injective.exchange.v1beta1.Tx.MsgInstantPerpetualMarketLaunchResponse>(
                service, METHODID_INSTANT_PERPETUAL_MARKET_LAUNCH)))
        .addMethod(
          getInstantExpiryFuturesMarketLaunchMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              injective.exchange.v1beta1.Tx.MsgInstantExpiryFuturesMarketLaunch,
              injective.exchange.v1beta1.Tx.MsgInstantExpiryFuturesMarketLaunchResponse>(
                service, METHODID_INSTANT_EXPIRY_FUTURES_MARKET_LAUNCH)))
        .addMethod(
          getCreateSpotLimitOrderMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              injective.exchange.v1beta1.Tx.MsgCreateSpotLimitOrder,
              injective.exchange.v1beta1.Tx.MsgCreateSpotLimitOrderResponse>(
                service, METHODID_CREATE_SPOT_LIMIT_ORDER)))
        .addMethod(
          getBatchCreateSpotLimitOrdersMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              injective.exchange.v1beta1.Tx.MsgBatchCreateSpotLimitOrders,
              injective.exchange.v1beta1.Tx.MsgBatchCreateSpotLimitOrdersResponse>(
                service, METHODID_BATCH_CREATE_SPOT_LIMIT_ORDERS)))
        .addMethod(
          getCreateSpotMarketOrderMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              injective.exchange.v1beta1.Tx.MsgCreateSpotMarketOrder,
              injective.exchange.v1beta1.Tx.MsgCreateSpotMarketOrderResponse>(
                service, METHODID_CREATE_SPOT_MARKET_ORDER)))
        .addMethod(
          getCancelSpotOrderMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              injective.exchange.v1beta1.Tx.MsgCancelSpotOrder,
              injective.exchange.v1beta1.Tx.MsgCancelSpotOrderResponse>(
                service, METHODID_CANCEL_SPOT_ORDER)))
        .addMethod(
          getBatchCancelSpotOrdersMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              injective.exchange.v1beta1.Tx.MsgBatchCancelSpotOrders,
              injective.exchange.v1beta1.Tx.MsgBatchCancelSpotOrdersResponse>(
                service, METHODID_BATCH_CANCEL_SPOT_ORDERS)))
        .addMethod(
          getBatchUpdateOrdersMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              injective.exchange.v1beta1.Tx.MsgBatchUpdateOrders,
              injective.exchange.v1beta1.Tx.MsgBatchUpdateOrdersResponse>(
                service, METHODID_BATCH_UPDATE_ORDERS)))
        .addMethod(
          getPrivilegedExecuteContractMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              injective.exchange.v1beta1.Tx.MsgPrivilegedExecuteContract,
              injective.exchange.v1beta1.Tx.MsgPrivilegedExecuteContractResponse>(
                service, METHODID_PRIVILEGED_EXECUTE_CONTRACT)))
        .addMethod(
          getCreateDerivativeLimitOrderMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              injective.exchange.v1beta1.Tx.MsgCreateDerivativeLimitOrder,
              injective.exchange.v1beta1.Tx.MsgCreateDerivativeLimitOrderResponse>(
                service, METHODID_CREATE_DERIVATIVE_LIMIT_ORDER)))
        .addMethod(
          getBatchCreateDerivativeLimitOrdersMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              injective.exchange.v1beta1.Tx.MsgBatchCreateDerivativeLimitOrders,
              injective.exchange.v1beta1.Tx.MsgBatchCreateDerivativeLimitOrdersResponse>(
                service, METHODID_BATCH_CREATE_DERIVATIVE_LIMIT_ORDERS)))
        .addMethod(
          getCreateDerivativeMarketOrderMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              injective.exchange.v1beta1.Tx.MsgCreateDerivativeMarketOrder,
              injective.exchange.v1beta1.Tx.MsgCreateDerivativeMarketOrderResponse>(
                service, METHODID_CREATE_DERIVATIVE_MARKET_ORDER)))
        .addMethod(
          getCancelDerivativeOrderMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              injective.exchange.v1beta1.Tx.MsgCancelDerivativeOrder,
              injective.exchange.v1beta1.Tx.MsgCancelDerivativeOrderResponse>(
                service, METHODID_CANCEL_DERIVATIVE_ORDER)))
        .addMethod(
          getBatchCancelDerivativeOrdersMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              injective.exchange.v1beta1.Tx.MsgBatchCancelDerivativeOrders,
              injective.exchange.v1beta1.Tx.MsgBatchCancelDerivativeOrdersResponse>(
                service, METHODID_BATCH_CANCEL_DERIVATIVE_ORDERS)))
        .addMethod(
          getInstantBinaryOptionsMarketLaunchMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              injective.exchange.v1beta1.Tx.MsgInstantBinaryOptionsMarketLaunch,
              injective.exchange.v1beta1.Tx.MsgInstantBinaryOptionsMarketLaunchResponse>(
                service, METHODID_INSTANT_BINARY_OPTIONS_MARKET_LAUNCH)))
        .addMethod(
          getCreateBinaryOptionsLimitOrderMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              injective.exchange.v1beta1.Tx.MsgCreateBinaryOptionsLimitOrder,
              injective.exchange.v1beta1.Tx.MsgCreateBinaryOptionsLimitOrderResponse>(
                service, METHODID_CREATE_BINARY_OPTIONS_LIMIT_ORDER)))
        .addMethod(
          getCreateBinaryOptionsMarketOrderMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              injective.exchange.v1beta1.Tx.MsgCreateBinaryOptionsMarketOrder,
              injective.exchange.v1beta1.Tx.MsgCreateBinaryOptionsMarketOrderResponse>(
                service, METHODID_CREATE_BINARY_OPTIONS_MARKET_ORDER)))
        .addMethod(
          getCancelBinaryOptionsOrderMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              injective.exchange.v1beta1.Tx.MsgCancelBinaryOptionsOrder,
              injective.exchange.v1beta1.Tx.MsgCancelBinaryOptionsOrderResponse>(
                service, METHODID_CANCEL_BINARY_OPTIONS_ORDER)))
        .addMethod(
          getBatchCancelBinaryOptionsOrdersMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              injective.exchange.v1beta1.Tx.MsgBatchCancelBinaryOptionsOrders,
              injective.exchange.v1beta1.Tx.MsgBatchCancelBinaryOptionsOrdersResponse>(
                service, METHODID_BATCH_CANCEL_BINARY_OPTIONS_ORDERS)))
        .addMethod(
          getSubaccountTransferMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              injective.exchange.v1beta1.Tx.MsgSubaccountTransfer,
              injective.exchange.v1beta1.Tx.MsgSubaccountTransferResponse>(
                service, METHODID_SUBACCOUNT_TRANSFER)))
        .addMethod(
          getExternalTransferMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              injective.exchange.v1beta1.Tx.MsgExternalTransfer,
              injective.exchange.v1beta1.Tx.MsgExternalTransferResponse>(
                service, METHODID_EXTERNAL_TRANSFER)))
        .addMethod(
          getLiquidatePositionMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              injective.exchange.v1beta1.Tx.MsgLiquidatePosition,
              injective.exchange.v1beta1.Tx.MsgLiquidatePositionResponse>(
                service, METHODID_LIQUIDATE_POSITION)))
        .addMethod(
          getEmergencySettleMarketMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              injective.exchange.v1beta1.Tx.MsgEmergencySettleMarket,
              injective.exchange.v1beta1.Tx.MsgEmergencySettleMarketResponse>(
                service, METHODID_EMERGENCY_SETTLE_MARKET)))
        .addMethod(
          getIncreasePositionMarginMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              injective.exchange.v1beta1.Tx.MsgIncreasePositionMargin,
              injective.exchange.v1beta1.Tx.MsgIncreasePositionMarginResponse>(
                service, METHODID_INCREASE_POSITION_MARGIN)))
        .addMethod(
          getRewardsOptOutMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              injective.exchange.v1beta1.Tx.MsgRewardsOptOut,
              injective.exchange.v1beta1.Tx.MsgRewardsOptOutResponse>(
                service, METHODID_REWARDS_OPT_OUT)))
        .addMethod(
          getAdminUpdateBinaryOptionsMarketMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              injective.exchange.v1beta1.Tx.MsgAdminUpdateBinaryOptionsMarket,
              injective.exchange.v1beta1.Tx.MsgAdminUpdateBinaryOptionsMarketResponse>(
                service, METHODID_ADMIN_UPDATE_BINARY_OPTIONS_MARKET)))
        .addMethod(
          getReclaimLockedFundsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              injective.exchange.v1beta1.Tx.MsgReclaimLockedFunds,
              injective.exchange.v1beta1.Tx.MsgReclaimLockedFundsResponse>(
                service, METHODID_RECLAIM_LOCKED_FUNDS)))
        .addMethod(
          getUpdateParamsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              injective.exchange.v1beta1.Tx.MsgUpdateParams,
              injective.exchange.v1beta1.Tx.MsgUpdateParamsResponse>(
                service, METHODID_UPDATE_PARAMS)))
        .build();
  }

  private static abstract class MsgBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    MsgBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return injective.exchange.v1beta1.Tx.getDescriptor();
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
              .addMethod(getDepositMethod())
              .addMethod(getWithdrawMethod())
              .addMethod(getInstantSpotMarketLaunchMethod())
              .addMethod(getInstantPerpetualMarketLaunchMethod())
              .addMethod(getInstantExpiryFuturesMarketLaunchMethod())
              .addMethod(getCreateSpotLimitOrderMethod())
              .addMethod(getBatchCreateSpotLimitOrdersMethod())
              .addMethod(getCreateSpotMarketOrderMethod())
              .addMethod(getCancelSpotOrderMethod())
              .addMethod(getBatchCancelSpotOrdersMethod())
              .addMethod(getBatchUpdateOrdersMethod())
              .addMethod(getPrivilegedExecuteContractMethod())
              .addMethod(getCreateDerivativeLimitOrderMethod())
              .addMethod(getBatchCreateDerivativeLimitOrdersMethod())
              .addMethod(getCreateDerivativeMarketOrderMethod())
              .addMethod(getCancelDerivativeOrderMethod())
              .addMethod(getBatchCancelDerivativeOrdersMethod())
              .addMethod(getInstantBinaryOptionsMarketLaunchMethod())
              .addMethod(getCreateBinaryOptionsLimitOrderMethod())
              .addMethod(getCreateBinaryOptionsMarketOrderMethod())
              .addMethod(getCancelBinaryOptionsOrderMethod())
              .addMethod(getBatchCancelBinaryOptionsOrdersMethod())
              .addMethod(getSubaccountTransferMethod())
              .addMethod(getExternalTransferMethod())
              .addMethod(getLiquidatePositionMethod())
              .addMethod(getEmergencySettleMarketMethod())
              .addMethod(getIncreasePositionMarginMethod())
              .addMethod(getRewardsOptOutMethod())
              .addMethod(getAdminUpdateBinaryOptionsMarketMethod())
              .addMethod(getReclaimLockedFundsMethod())
              .addMethod(getUpdateParamsMethod())
              .build();
        }
      }
    }
    return result;
  }
}
