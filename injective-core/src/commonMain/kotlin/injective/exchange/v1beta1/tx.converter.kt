// Transform from injective/exchange/v1beta1/tx.proto
@file:GeneratorVersion(version = "0.3.1")

package injective.exchange.v1beta1

import google.protobuf.Any
import java.lang.IllegalStateException
import kr.jadekim.protobuf.`annotation`.GeneratorVersion
import kr.jadekim.protobuf.converter.ProtobufConverter
import kr.jadekim.protobuf.converter.parseProtobuf

public expect object MsgUpdateParamsConverter : ProtobufConverter<MsgUpdateParams>

public fun MsgUpdateParams.toAny(): Any = Any(MsgUpdateParams.TYPE_URL,
    with(MsgUpdateParamsConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<MsgUpdateParams>): MsgUpdateParams {
  if (typeUrl != MsgUpdateParams.TYPE_URL) throw IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object MsgUpdateParamsResponseConverter : ProtobufConverter<MsgUpdateParamsResponse>

public fun MsgUpdateParamsResponse.toAny(): Any = Any(MsgUpdateParamsResponse.TYPE_URL,
    with(MsgUpdateParamsResponseConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<MsgUpdateParamsResponse>):
    MsgUpdateParamsResponse {
  if (typeUrl != MsgUpdateParamsResponse.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object MsgDepositConverter : ProtobufConverter<MsgDeposit>

public fun MsgDeposit.toAny(): Any = Any(MsgDeposit.TYPE_URL, with(MsgDepositConverter) {
    toByteArray() })

public fun Any.parse(converter: ProtobufConverter<MsgDeposit>): MsgDeposit {
  if (typeUrl != MsgDeposit.TYPE_URL) throw IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object MsgDepositResponseConverter : ProtobufConverter<MsgDepositResponse>

public fun MsgDepositResponse.toAny(): Any = Any(MsgDepositResponse.TYPE_URL,
    with(MsgDepositResponseConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<MsgDepositResponse>): MsgDepositResponse {
  if (typeUrl != MsgDepositResponse.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object MsgWithdrawConverter : ProtobufConverter<MsgWithdraw>

public fun MsgWithdraw.toAny(): Any = Any(MsgWithdraw.TYPE_URL, with(MsgWithdrawConverter) {
    toByteArray() })

public fun Any.parse(converter: ProtobufConverter<MsgWithdraw>): MsgWithdraw {
  if (typeUrl != MsgWithdraw.TYPE_URL) throw IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object MsgWithdrawResponseConverter : ProtobufConverter<MsgWithdrawResponse>

public fun MsgWithdrawResponse.toAny(): Any = Any(MsgWithdrawResponse.TYPE_URL,
    with(MsgWithdrawResponseConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<MsgWithdrawResponse>): MsgWithdrawResponse {
  if (typeUrl != MsgWithdrawResponse.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object MsgCreateSpotLimitOrderConverter : ProtobufConverter<MsgCreateSpotLimitOrder>

public fun MsgCreateSpotLimitOrder.toAny(): Any = Any(MsgCreateSpotLimitOrder.TYPE_URL,
    with(MsgCreateSpotLimitOrderConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<MsgCreateSpotLimitOrder>):
    MsgCreateSpotLimitOrder {
  if (typeUrl != MsgCreateSpotLimitOrder.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object MsgCreateSpotLimitOrderResponseConverter :
    ProtobufConverter<MsgCreateSpotLimitOrderResponse>

public fun MsgCreateSpotLimitOrderResponse.toAny(): Any =
    Any(MsgCreateSpotLimitOrderResponse.TYPE_URL, with(MsgCreateSpotLimitOrderResponseConverter) {
    toByteArray() })

public fun Any.parse(converter: ProtobufConverter<MsgCreateSpotLimitOrderResponse>):
    MsgCreateSpotLimitOrderResponse {
  if (typeUrl != MsgCreateSpotLimitOrderResponse.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object MsgBatchCreateSpotLimitOrdersConverter :
    ProtobufConverter<MsgBatchCreateSpotLimitOrders>

public fun MsgBatchCreateSpotLimitOrders.toAny(): Any = Any(MsgBatchCreateSpotLimitOrders.TYPE_URL,
    with(MsgBatchCreateSpotLimitOrdersConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<MsgBatchCreateSpotLimitOrders>):
    MsgBatchCreateSpotLimitOrders {
  if (typeUrl != MsgBatchCreateSpotLimitOrders.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object MsgBatchCreateSpotLimitOrdersResponseConverter :
    ProtobufConverter<MsgBatchCreateSpotLimitOrdersResponse>

public fun MsgBatchCreateSpotLimitOrdersResponse.toAny(): Any =
    Any(MsgBatchCreateSpotLimitOrdersResponse.TYPE_URL,
    with(MsgBatchCreateSpotLimitOrdersResponseConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<MsgBatchCreateSpotLimitOrdersResponse>):
    MsgBatchCreateSpotLimitOrdersResponse {
  if (typeUrl != MsgBatchCreateSpotLimitOrdersResponse.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object MsgInstantSpotMarketLaunchConverter :
    ProtobufConverter<MsgInstantSpotMarketLaunch>

public fun MsgInstantSpotMarketLaunch.toAny(): Any = Any(MsgInstantSpotMarketLaunch.TYPE_URL,
    with(MsgInstantSpotMarketLaunchConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<MsgInstantSpotMarketLaunch>):
    MsgInstantSpotMarketLaunch {
  if (typeUrl != MsgInstantSpotMarketLaunch.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object MsgInstantSpotMarketLaunchResponseConverter :
    ProtobufConverter<MsgInstantSpotMarketLaunchResponse>

public fun MsgInstantSpotMarketLaunchResponse.toAny(): Any =
    Any(MsgInstantSpotMarketLaunchResponse.TYPE_URL,
    with(MsgInstantSpotMarketLaunchResponseConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<MsgInstantSpotMarketLaunchResponse>):
    MsgInstantSpotMarketLaunchResponse {
  if (typeUrl != MsgInstantSpotMarketLaunchResponse.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object MsgInstantPerpetualMarketLaunchConverter :
    ProtobufConverter<MsgInstantPerpetualMarketLaunch>

public fun MsgInstantPerpetualMarketLaunch.toAny(): Any =
    Any(MsgInstantPerpetualMarketLaunch.TYPE_URL, with(MsgInstantPerpetualMarketLaunchConverter) {
    toByteArray() })

public fun Any.parse(converter: ProtobufConverter<MsgInstantPerpetualMarketLaunch>):
    MsgInstantPerpetualMarketLaunch {
  if (typeUrl != MsgInstantPerpetualMarketLaunch.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object MsgInstantPerpetualMarketLaunchResponseConverter :
    ProtobufConverter<MsgInstantPerpetualMarketLaunchResponse>

public fun MsgInstantPerpetualMarketLaunchResponse.toAny(): Any =
    Any(MsgInstantPerpetualMarketLaunchResponse.TYPE_URL,
    with(MsgInstantPerpetualMarketLaunchResponseConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<MsgInstantPerpetualMarketLaunchResponse>):
    MsgInstantPerpetualMarketLaunchResponse {
  if (typeUrl != MsgInstantPerpetualMarketLaunchResponse.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object MsgInstantBinaryOptionsMarketLaunchConverter :
    ProtobufConverter<MsgInstantBinaryOptionsMarketLaunch>

public fun MsgInstantBinaryOptionsMarketLaunch.toAny(): Any =
    Any(MsgInstantBinaryOptionsMarketLaunch.TYPE_URL,
    with(MsgInstantBinaryOptionsMarketLaunchConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<MsgInstantBinaryOptionsMarketLaunch>):
    MsgInstantBinaryOptionsMarketLaunch {
  if (typeUrl != MsgInstantBinaryOptionsMarketLaunch.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object MsgInstantBinaryOptionsMarketLaunchResponseConverter :
    ProtobufConverter<MsgInstantBinaryOptionsMarketLaunchResponse>

public fun MsgInstantBinaryOptionsMarketLaunchResponse.toAny(): Any =
    Any(MsgInstantBinaryOptionsMarketLaunchResponse.TYPE_URL,
    with(MsgInstantBinaryOptionsMarketLaunchResponseConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<MsgInstantBinaryOptionsMarketLaunchResponse>):
    MsgInstantBinaryOptionsMarketLaunchResponse {
  if (typeUrl != MsgInstantBinaryOptionsMarketLaunchResponse.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object MsgInstantExpiryFuturesMarketLaunchConverter :
    ProtobufConverter<MsgInstantExpiryFuturesMarketLaunch>

public fun MsgInstantExpiryFuturesMarketLaunch.toAny(): Any =
    Any(MsgInstantExpiryFuturesMarketLaunch.TYPE_URL,
    with(MsgInstantExpiryFuturesMarketLaunchConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<MsgInstantExpiryFuturesMarketLaunch>):
    MsgInstantExpiryFuturesMarketLaunch {
  if (typeUrl != MsgInstantExpiryFuturesMarketLaunch.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object MsgInstantExpiryFuturesMarketLaunchResponseConverter :
    ProtobufConverter<MsgInstantExpiryFuturesMarketLaunchResponse>

public fun MsgInstantExpiryFuturesMarketLaunchResponse.toAny(): Any =
    Any(MsgInstantExpiryFuturesMarketLaunchResponse.TYPE_URL,
    with(MsgInstantExpiryFuturesMarketLaunchResponseConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<MsgInstantExpiryFuturesMarketLaunchResponse>):
    MsgInstantExpiryFuturesMarketLaunchResponse {
  if (typeUrl != MsgInstantExpiryFuturesMarketLaunchResponse.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object MsgCreateSpotMarketOrderConverter : ProtobufConverter<MsgCreateSpotMarketOrder>

public fun MsgCreateSpotMarketOrder.toAny(): Any = Any(MsgCreateSpotMarketOrder.TYPE_URL,
    with(MsgCreateSpotMarketOrderConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<MsgCreateSpotMarketOrder>):
    MsgCreateSpotMarketOrder {
  if (typeUrl != MsgCreateSpotMarketOrder.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object MsgCreateSpotMarketOrderResponseConverter :
    ProtobufConverter<MsgCreateSpotMarketOrderResponse>

public fun MsgCreateSpotMarketOrderResponse.toAny(): Any =
    Any(MsgCreateSpotMarketOrderResponse.TYPE_URL, with(MsgCreateSpotMarketOrderResponseConverter) {
    toByteArray() })

public fun Any.parse(converter: ProtobufConverter<MsgCreateSpotMarketOrderResponse>):
    MsgCreateSpotMarketOrderResponse {
  if (typeUrl != MsgCreateSpotMarketOrderResponse.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object SpotMarketOrderResultsConverter : ProtobufConverter<SpotMarketOrderResults>

public fun SpotMarketOrderResults.toAny(): Any = Any(SpotMarketOrderResults.TYPE_URL,
    with(SpotMarketOrderResultsConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<SpotMarketOrderResults>): SpotMarketOrderResults {
  if (typeUrl != SpotMarketOrderResults.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object MsgCreateDerivativeLimitOrderConverter :
    ProtobufConverter<MsgCreateDerivativeLimitOrder>

public fun MsgCreateDerivativeLimitOrder.toAny(): Any = Any(MsgCreateDerivativeLimitOrder.TYPE_URL,
    with(MsgCreateDerivativeLimitOrderConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<MsgCreateDerivativeLimitOrder>):
    MsgCreateDerivativeLimitOrder {
  if (typeUrl != MsgCreateDerivativeLimitOrder.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object MsgCreateDerivativeLimitOrderResponseConverter :
    ProtobufConverter<MsgCreateDerivativeLimitOrderResponse>

public fun MsgCreateDerivativeLimitOrderResponse.toAny(): Any =
    Any(MsgCreateDerivativeLimitOrderResponse.TYPE_URL,
    with(MsgCreateDerivativeLimitOrderResponseConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<MsgCreateDerivativeLimitOrderResponse>):
    MsgCreateDerivativeLimitOrderResponse {
  if (typeUrl != MsgCreateDerivativeLimitOrderResponse.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object MsgCreateBinaryOptionsLimitOrderConverter :
    ProtobufConverter<MsgCreateBinaryOptionsLimitOrder>

public fun MsgCreateBinaryOptionsLimitOrder.toAny(): Any =
    Any(MsgCreateBinaryOptionsLimitOrder.TYPE_URL, with(MsgCreateBinaryOptionsLimitOrderConverter) {
    toByteArray() })

public fun Any.parse(converter: ProtobufConverter<MsgCreateBinaryOptionsLimitOrder>):
    MsgCreateBinaryOptionsLimitOrder {
  if (typeUrl != MsgCreateBinaryOptionsLimitOrder.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object MsgCreateBinaryOptionsLimitOrderResponseConverter :
    ProtobufConverter<MsgCreateBinaryOptionsLimitOrderResponse>

public fun MsgCreateBinaryOptionsLimitOrderResponse.toAny(): Any =
    Any(MsgCreateBinaryOptionsLimitOrderResponse.TYPE_URL,
    with(MsgCreateBinaryOptionsLimitOrderResponseConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<MsgCreateBinaryOptionsLimitOrderResponse>):
    MsgCreateBinaryOptionsLimitOrderResponse {
  if (typeUrl != MsgCreateBinaryOptionsLimitOrderResponse.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object MsgBatchCreateDerivativeLimitOrdersConverter :
    ProtobufConverter<MsgBatchCreateDerivativeLimitOrders>

public fun MsgBatchCreateDerivativeLimitOrders.toAny(): Any =
    Any(MsgBatchCreateDerivativeLimitOrders.TYPE_URL,
    with(MsgBatchCreateDerivativeLimitOrdersConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<MsgBatchCreateDerivativeLimitOrders>):
    MsgBatchCreateDerivativeLimitOrders {
  if (typeUrl != MsgBatchCreateDerivativeLimitOrders.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object MsgBatchCreateDerivativeLimitOrdersResponseConverter :
    ProtobufConverter<MsgBatchCreateDerivativeLimitOrdersResponse>

public fun MsgBatchCreateDerivativeLimitOrdersResponse.toAny(): Any =
    Any(MsgBatchCreateDerivativeLimitOrdersResponse.TYPE_URL,
    with(MsgBatchCreateDerivativeLimitOrdersResponseConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<MsgBatchCreateDerivativeLimitOrdersResponse>):
    MsgBatchCreateDerivativeLimitOrdersResponse {
  if (typeUrl != MsgBatchCreateDerivativeLimitOrdersResponse.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object MsgCancelSpotOrderConverter : ProtobufConverter<MsgCancelSpotOrder>

public fun MsgCancelSpotOrder.toAny(): Any = Any(MsgCancelSpotOrder.TYPE_URL,
    with(MsgCancelSpotOrderConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<MsgCancelSpotOrder>): MsgCancelSpotOrder {
  if (typeUrl != MsgCancelSpotOrder.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object MsgCancelSpotOrderResponseConverter :
    ProtobufConverter<MsgCancelSpotOrderResponse>

public fun MsgCancelSpotOrderResponse.toAny(): Any = Any(MsgCancelSpotOrderResponse.TYPE_URL,
    with(MsgCancelSpotOrderResponseConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<MsgCancelSpotOrderResponse>):
    MsgCancelSpotOrderResponse {
  if (typeUrl != MsgCancelSpotOrderResponse.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object MsgBatchCancelSpotOrdersConverter : ProtobufConverter<MsgBatchCancelSpotOrders>

public fun MsgBatchCancelSpotOrders.toAny(): Any = Any(MsgBatchCancelSpotOrders.TYPE_URL,
    with(MsgBatchCancelSpotOrdersConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<MsgBatchCancelSpotOrders>):
    MsgBatchCancelSpotOrders {
  if (typeUrl != MsgBatchCancelSpotOrders.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object MsgBatchCancelSpotOrdersResponseConverter :
    ProtobufConverter<MsgBatchCancelSpotOrdersResponse>

public fun MsgBatchCancelSpotOrdersResponse.toAny(): Any =
    Any(MsgBatchCancelSpotOrdersResponse.TYPE_URL, with(MsgBatchCancelSpotOrdersResponseConverter) {
    toByteArray() })

public fun Any.parse(converter: ProtobufConverter<MsgBatchCancelSpotOrdersResponse>):
    MsgBatchCancelSpotOrdersResponse {
  if (typeUrl != MsgBatchCancelSpotOrdersResponse.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object MsgBatchCancelBinaryOptionsOrdersConverter :
    ProtobufConverter<MsgBatchCancelBinaryOptionsOrders>

public fun MsgBatchCancelBinaryOptionsOrders.toAny(): Any =
    Any(MsgBatchCancelBinaryOptionsOrders.TYPE_URL, with(MsgBatchCancelBinaryOptionsOrdersConverter)
    { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<MsgBatchCancelBinaryOptionsOrders>):
    MsgBatchCancelBinaryOptionsOrders {
  if (typeUrl != MsgBatchCancelBinaryOptionsOrders.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object MsgBatchCancelBinaryOptionsOrdersResponseConverter :
    ProtobufConverter<MsgBatchCancelBinaryOptionsOrdersResponse>

public fun MsgBatchCancelBinaryOptionsOrdersResponse.toAny(): Any =
    Any(MsgBatchCancelBinaryOptionsOrdersResponse.TYPE_URL,
    with(MsgBatchCancelBinaryOptionsOrdersResponseConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<MsgBatchCancelBinaryOptionsOrdersResponse>):
    MsgBatchCancelBinaryOptionsOrdersResponse {
  if (typeUrl != MsgBatchCancelBinaryOptionsOrdersResponse.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object MsgBatchUpdateOrdersConverter : ProtobufConverter<MsgBatchUpdateOrders>

public fun MsgBatchUpdateOrders.toAny(): Any = Any(MsgBatchUpdateOrders.TYPE_URL,
    with(MsgBatchUpdateOrdersConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<MsgBatchUpdateOrders>): MsgBatchUpdateOrders {
  if (typeUrl != MsgBatchUpdateOrders.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object MsgBatchUpdateOrdersResponseConverter :
    ProtobufConverter<MsgBatchUpdateOrdersResponse>

public fun MsgBatchUpdateOrdersResponse.toAny(): Any = Any(MsgBatchUpdateOrdersResponse.TYPE_URL,
    with(MsgBatchUpdateOrdersResponseConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<MsgBatchUpdateOrdersResponse>):
    MsgBatchUpdateOrdersResponse {
  if (typeUrl != MsgBatchUpdateOrdersResponse.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object MsgCreateDerivativeMarketOrderConverter :
    ProtobufConverter<MsgCreateDerivativeMarketOrder>

public fun MsgCreateDerivativeMarketOrder.toAny(): Any =
    Any(MsgCreateDerivativeMarketOrder.TYPE_URL, with(MsgCreateDerivativeMarketOrderConverter) {
    toByteArray() })

public fun Any.parse(converter: ProtobufConverter<MsgCreateDerivativeMarketOrder>):
    MsgCreateDerivativeMarketOrder {
  if (typeUrl != MsgCreateDerivativeMarketOrder.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object MsgCreateDerivativeMarketOrderResponseConverter :
    ProtobufConverter<MsgCreateDerivativeMarketOrderResponse>

public fun MsgCreateDerivativeMarketOrderResponse.toAny(): Any =
    Any(MsgCreateDerivativeMarketOrderResponse.TYPE_URL,
    with(MsgCreateDerivativeMarketOrderResponseConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<MsgCreateDerivativeMarketOrderResponse>):
    MsgCreateDerivativeMarketOrderResponse {
  if (typeUrl != MsgCreateDerivativeMarketOrderResponse.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object DerivativeMarketOrderResultsConverter :
    ProtobufConverter<DerivativeMarketOrderResults>

public fun DerivativeMarketOrderResults.toAny(): Any = Any(DerivativeMarketOrderResults.TYPE_URL,
    with(DerivativeMarketOrderResultsConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<DerivativeMarketOrderResults>):
    DerivativeMarketOrderResults {
  if (typeUrl != DerivativeMarketOrderResults.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object MsgCreateBinaryOptionsMarketOrderConverter :
    ProtobufConverter<MsgCreateBinaryOptionsMarketOrder>

public fun MsgCreateBinaryOptionsMarketOrder.toAny(): Any =
    Any(MsgCreateBinaryOptionsMarketOrder.TYPE_URL, with(MsgCreateBinaryOptionsMarketOrderConverter)
    { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<MsgCreateBinaryOptionsMarketOrder>):
    MsgCreateBinaryOptionsMarketOrder {
  if (typeUrl != MsgCreateBinaryOptionsMarketOrder.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object MsgCreateBinaryOptionsMarketOrderResponseConverter :
    ProtobufConverter<MsgCreateBinaryOptionsMarketOrderResponse>

public fun MsgCreateBinaryOptionsMarketOrderResponse.toAny(): Any =
    Any(MsgCreateBinaryOptionsMarketOrderResponse.TYPE_URL,
    with(MsgCreateBinaryOptionsMarketOrderResponseConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<MsgCreateBinaryOptionsMarketOrderResponse>):
    MsgCreateBinaryOptionsMarketOrderResponse {
  if (typeUrl != MsgCreateBinaryOptionsMarketOrderResponse.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object MsgCancelDerivativeOrderConverter : ProtobufConverter<MsgCancelDerivativeOrder>

public fun MsgCancelDerivativeOrder.toAny(): Any = Any(MsgCancelDerivativeOrder.TYPE_URL,
    with(MsgCancelDerivativeOrderConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<MsgCancelDerivativeOrder>):
    MsgCancelDerivativeOrder {
  if (typeUrl != MsgCancelDerivativeOrder.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object MsgCancelDerivativeOrderResponseConverter :
    ProtobufConverter<MsgCancelDerivativeOrderResponse>

public fun MsgCancelDerivativeOrderResponse.toAny(): Any =
    Any(MsgCancelDerivativeOrderResponse.TYPE_URL, with(MsgCancelDerivativeOrderResponseConverter) {
    toByteArray() })

public fun Any.parse(converter: ProtobufConverter<MsgCancelDerivativeOrderResponse>):
    MsgCancelDerivativeOrderResponse {
  if (typeUrl != MsgCancelDerivativeOrderResponse.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object MsgCancelBinaryOptionsOrderConverter :
    ProtobufConverter<MsgCancelBinaryOptionsOrder>

public fun MsgCancelBinaryOptionsOrder.toAny(): Any = Any(MsgCancelBinaryOptionsOrder.TYPE_URL,
    with(MsgCancelBinaryOptionsOrderConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<MsgCancelBinaryOptionsOrder>):
    MsgCancelBinaryOptionsOrder {
  if (typeUrl != MsgCancelBinaryOptionsOrder.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object MsgCancelBinaryOptionsOrderResponseConverter :
    ProtobufConverter<MsgCancelBinaryOptionsOrderResponse>

public fun MsgCancelBinaryOptionsOrderResponse.toAny(): Any =
    Any(MsgCancelBinaryOptionsOrderResponse.TYPE_URL,
    with(MsgCancelBinaryOptionsOrderResponseConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<MsgCancelBinaryOptionsOrderResponse>):
    MsgCancelBinaryOptionsOrderResponse {
  if (typeUrl != MsgCancelBinaryOptionsOrderResponse.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object OrderDataConverter : ProtobufConverter<OrderData>

public fun OrderData.toAny(): Any = Any(OrderData.TYPE_URL, with(OrderDataConverter) { toByteArray()
    })

public fun Any.parse(converter: ProtobufConverter<OrderData>): OrderData {
  if (typeUrl != OrderData.TYPE_URL) throw IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object MsgBatchCancelDerivativeOrdersConverter :
    ProtobufConverter<MsgBatchCancelDerivativeOrders>

public fun MsgBatchCancelDerivativeOrders.toAny(): Any =
    Any(MsgBatchCancelDerivativeOrders.TYPE_URL, with(MsgBatchCancelDerivativeOrdersConverter) {
    toByteArray() })

public fun Any.parse(converter: ProtobufConverter<MsgBatchCancelDerivativeOrders>):
    MsgBatchCancelDerivativeOrders {
  if (typeUrl != MsgBatchCancelDerivativeOrders.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object MsgBatchCancelDerivativeOrdersResponseConverter :
    ProtobufConverter<MsgBatchCancelDerivativeOrdersResponse>

public fun MsgBatchCancelDerivativeOrdersResponse.toAny(): Any =
    Any(MsgBatchCancelDerivativeOrdersResponse.TYPE_URL,
    with(MsgBatchCancelDerivativeOrdersResponseConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<MsgBatchCancelDerivativeOrdersResponse>):
    MsgBatchCancelDerivativeOrdersResponse {
  if (typeUrl != MsgBatchCancelDerivativeOrdersResponse.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object MsgSubaccountTransferConverter : ProtobufConverter<MsgSubaccountTransfer>

public fun MsgSubaccountTransfer.toAny(): Any = Any(MsgSubaccountTransfer.TYPE_URL,
    with(MsgSubaccountTransferConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<MsgSubaccountTransfer>): MsgSubaccountTransfer {
  if (typeUrl != MsgSubaccountTransfer.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object MsgSubaccountTransferResponseConverter :
    ProtobufConverter<MsgSubaccountTransferResponse>

public fun MsgSubaccountTransferResponse.toAny(): Any = Any(MsgSubaccountTransferResponse.TYPE_URL,
    with(MsgSubaccountTransferResponseConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<MsgSubaccountTransferResponse>):
    MsgSubaccountTransferResponse {
  if (typeUrl != MsgSubaccountTransferResponse.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object MsgExternalTransferConverter : ProtobufConverter<MsgExternalTransfer>

public fun MsgExternalTransfer.toAny(): Any = Any(MsgExternalTransfer.TYPE_URL,
    with(MsgExternalTransferConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<MsgExternalTransfer>): MsgExternalTransfer {
  if (typeUrl != MsgExternalTransfer.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object MsgExternalTransferResponseConverter :
    ProtobufConverter<MsgExternalTransferResponse>

public fun MsgExternalTransferResponse.toAny(): Any = Any(MsgExternalTransferResponse.TYPE_URL,
    with(MsgExternalTransferResponseConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<MsgExternalTransferResponse>):
    MsgExternalTransferResponse {
  if (typeUrl != MsgExternalTransferResponse.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object MsgLiquidatePositionConverter : ProtobufConverter<MsgLiquidatePosition>

public fun MsgLiquidatePosition.toAny(): Any = Any(MsgLiquidatePosition.TYPE_URL,
    with(MsgLiquidatePositionConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<MsgLiquidatePosition>): MsgLiquidatePosition {
  if (typeUrl != MsgLiquidatePosition.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object MsgLiquidatePositionResponseConverter :
    ProtobufConverter<MsgLiquidatePositionResponse>

public fun MsgLiquidatePositionResponse.toAny(): Any = Any(MsgLiquidatePositionResponse.TYPE_URL,
    with(MsgLiquidatePositionResponseConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<MsgLiquidatePositionResponse>):
    MsgLiquidatePositionResponse {
  if (typeUrl != MsgLiquidatePositionResponse.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object MsgEmergencySettleMarketConverter : ProtobufConverter<MsgEmergencySettleMarket>

public fun MsgEmergencySettleMarket.toAny(): Any = Any(MsgEmergencySettleMarket.TYPE_URL,
    with(MsgEmergencySettleMarketConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<MsgEmergencySettleMarket>):
    MsgEmergencySettleMarket {
  if (typeUrl != MsgEmergencySettleMarket.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object MsgEmergencySettleMarketResponseConverter :
    ProtobufConverter<MsgEmergencySettleMarketResponse>

public fun MsgEmergencySettleMarketResponse.toAny(): Any =
    Any(MsgEmergencySettleMarketResponse.TYPE_URL, with(MsgEmergencySettleMarketResponseConverter) {
    toByteArray() })

public fun Any.parse(converter: ProtobufConverter<MsgEmergencySettleMarketResponse>):
    MsgEmergencySettleMarketResponse {
  if (typeUrl != MsgEmergencySettleMarketResponse.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object MsgIncreasePositionMarginConverter :
    ProtobufConverter<MsgIncreasePositionMargin>

public fun MsgIncreasePositionMargin.toAny(): Any = Any(MsgIncreasePositionMargin.TYPE_URL,
    with(MsgIncreasePositionMarginConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<MsgIncreasePositionMargin>):
    MsgIncreasePositionMargin {
  if (typeUrl != MsgIncreasePositionMargin.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object MsgIncreasePositionMarginResponseConverter :
    ProtobufConverter<MsgIncreasePositionMarginResponse>

public fun MsgIncreasePositionMarginResponse.toAny(): Any =
    Any(MsgIncreasePositionMarginResponse.TYPE_URL, with(MsgIncreasePositionMarginResponseConverter)
    { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<MsgIncreasePositionMarginResponse>):
    MsgIncreasePositionMarginResponse {
  if (typeUrl != MsgIncreasePositionMarginResponse.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object MsgPrivilegedExecuteContractConverter :
    ProtobufConverter<MsgPrivilegedExecuteContract>

public fun MsgPrivilegedExecuteContract.toAny(): Any = Any(MsgPrivilegedExecuteContract.TYPE_URL,
    with(MsgPrivilegedExecuteContractConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<MsgPrivilegedExecuteContract>):
    MsgPrivilegedExecuteContract {
  if (typeUrl != MsgPrivilegedExecuteContract.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object MsgPrivilegedExecuteContractResponseConverter :
    ProtobufConverter<MsgPrivilegedExecuteContractResponse>

public fun MsgPrivilegedExecuteContractResponse.toAny(): Any =
    Any(MsgPrivilegedExecuteContractResponse.TYPE_URL,
    with(MsgPrivilegedExecuteContractResponseConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<MsgPrivilegedExecuteContractResponse>):
    MsgPrivilegedExecuteContractResponse {
  if (typeUrl != MsgPrivilegedExecuteContractResponse.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object MsgRewardsOptOutConverter : ProtobufConverter<MsgRewardsOptOut>

public fun MsgRewardsOptOut.toAny(): Any = Any(MsgRewardsOptOut.TYPE_URL,
    with(MsgRewardsOptOutConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<MsgRewardsOptOut>): MsgRewardsOptOut {
  if (typeUrl != MsgRewardsOptOut.TYPE_URL) throw IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object MsgRewardsOptOutResponseConverter : ProtobufConverter<MsgRewardsOptOutResponse>

public fun MsgRewardsOptOutResponse.toAny(): Any = Any(MsgRewardsOptOutResponse.TYPE_URL,
    with(MsgRewardsOptOutResponseConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<MsgRewardsOptOutResponse>):
    MsgRewardsOptOutResponse {
  if (typeUrl != MsgRewardsOptOutResponse.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object MsgReclaimLockedFundsConverter : ProtobufConverter<MsgReclaimLockedFunds>

public fun MsgReclaimLockedFunds.toAny(): Any = Any(MsgReclaimLockedFunds.TYPE_URL,
    with(MsgReclaimLockedFundsConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<MsgReclaimLockedFunds>): MsgReclaimLockedFunds {
  if (typeUrl != MsgReclaimLockedFunds.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object MsgReclaimLockedFundsResponseConverter :
    ProtobufConverter<MsgReclaimLockedFundsResponse>

public fun MsgReclaimLockedFundsResponse.toAny(): Any = Any(MsgReclaimLockedFundsResponse.TYPE_URL,
    with(MsgReclaimLockedFundsResponseConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<MsgReclaimLockedFundsResponse>):
    MsgReclaimLockedFundsResponse {
  if (typeUrl != MsgReclaimLockedFundsResponse.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object MsgSignDataConverter : ProtobufConverter<MsgSignData>

public fun MsgSignData.toAny(): Any = Any(MsgSignData.TYPE_URL, with(MsgSignDataConverter) {
    toByteArray() })

public fun Any.parse(converter: ProtobufConverter<MsgSignData>): MsgSignData {
  if (typeUrl != MsgSignData.TYPE_URL) throw IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object MsgSignDocConverter : ProtobufConverter<MsgSignDoc>

public fun MsgSignDoc.toAny(): Any = Any(MsgSignDoc.TYPE_URL, with(MsgSignDocConverter) {
    toByteArray() })

public fun Any.parse(converter: ProtobufConverter<MsgSignDoc>): MsgSignDoc {
  if (typeUrl != MsgSignDoc.TYPE_URL) throw IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object MsgAdminUpdateBinaryOptionsMarketConverter :
    ProtobufConverter<MsgAdminUpdateBinaryOptionsMarket>

public fun MsgAdminUpdateBinaryOptionsMarket.toAny(): Any =
    Any(MsgAdminUpdateBinaryOptionsMarket.TYPE_URL, with(MsgAdminUpdateBinaryOptionsMarketConverter)
    { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<MsgAdminUpdateBinaryOptionsMarket>):
    MsgAdminUpdateBinaryOptionsMarket {
  if (typeUrl != MsgAdminUpdateBinaryOptionsMarket.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object MsgAdminUpdateBinaryOptionsMarketResponseConverter :
    ProtobufConverter<MsgAdminUpdateBinaryOptionsMarketResponse>

public fun MsgAdminUpdateBinaryOptionsMarketResponse.toAny(): Any =
    Any(MsgAdminUpdateBinaryOptionsMarketResponse.TYPE_URL,
    with(MsgAdminUpdateBinaryOptionsMarketResponseConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<MsgAdminUpdateBinaryOptionsMarketResponse>):
    MsgAdminUpdateBinaryOptionsMarketResponse {
  if (typeUrl != MsgAdminUpdateBinaryOptionsMarketResponse.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}
