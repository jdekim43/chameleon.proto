// Transform from injective/exchange/v1beta1/events.proto
@file:GeneratorVersion(version = "0.3.1")

package injective.exchange.v1beta1

import google.protobuf.Any
import java.lang.IllegalStateException
import kr.jadekim.protobuf.`annotation`.GeneratorVersion
import kr.jadekim.protobuf.converter.ProtobufConverter
import kr.jadekim.protobuf.converter.parseProtobuf

public expect object EventBatchSpotExecutionConverter : ProtobufConverter<EventBatchSpotExecution>

public fun EventBatchSpotExecution.toAny(): Any = Any(EventBatchSpotExecution.TYPE_URL,
    with(EventBatchSpotExecutionConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<EventBatchSpotExecution>):
    EventBatchSpotExecution {
  if (typeUrl != EventBatchSpotExecution.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object EventBatchDerivativeExecutionConverter :
    ProtobufConverter<EventBatchDerivativeExecution>

public fun EventBatchDerivativeExecution.toAny(): Any = Any(EventBatchDerivativeExecution.TYPE_URL,
    with(EventBatchDerivativeExecutionConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<EventBatchDerivativeExecution>):
    EventBatchDerivativeExecution {
  if (typeUrl != EventBatchDerivativeExecution.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object EventLostFundsFromLiquidationConverter :
    ProtobufConverter<EventLostFundsFromLiquidation>

public fun EventLostFundsFromLiquidation.toAny(): Any = Any(EventLostFundsFromLiquidation.TYPE_URL,
    with(EventLostFundsFromLiquidationConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<EventLostFundsFromLiquidation>):
    EventLostFundsFromLiquidation {
  if (typeUrl != EventLostFundsFromLiquidation.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object EventBatchDerivativePositionConverter :
    ProtobufConverter<EventBatchDerivativePosition>

public fun EventBatchDerivativePosition.toAny(): Any = Any(EventBatchDerivativePosition.TYPE_URL,
    with(EventBatchDerivativePositionConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<EventBatchDerivativePosition>):
    EventBatchDerivativePosition {
  if (typeUrl != EventBatchDerivativePosition.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object EventDerivativeMarketPausedConverter :
    ProtobufConverter<EventDerivativeMarketPaused>

public fun EventDerivativeMarketPaused.toAny(): Any = Any(EventDerivativeMarketPaused.TYPE_URL,
    with(EventDerivativeMarketPausedConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<EventDerivativeMarketPaused>):
    EventDerivativeMarketPaused {
  if (typeUrl != EventDerivativeMarketPaused.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object EventMarketBeyondBankruptcyConverter :
    ProtobufConverter<EventMarketBeyondBankruptcy>

public fun EventMarketBeyondBankruptcy.toAny(): Any = Any(EventMarketBeyondBankruptcy.TYPE_URL,
    with(EventMarketBeyondBankruptcyConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<EventMarketBeyondBankruptcy>):
    EventMarketBeyondBankruptcy {
  if (typeUrl != EventMarketBeyondBankruptcy.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object EventAllPositionsHaircutConverter : ProtobufConverter<EventAllPositionsHaircut>

public fun EventAllPositionsHaircut.toAny(): Any = Any(EventAllPositionsHaircut.TYPE_URL,
    with(EventAllPositionsHaircutConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<EventAllPositionsHaircut>):
    EventAllPositionsHaircut {
  if (typeUrl != EventAllPositionsHaircut.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object EventBinaryOptionsMarketUpdateConverter :
    ProtobufConverter<EventBinaryOptionsMarketUpdate>

public fun EventBinaryOptionsMarketUpdate.toAny(): Any =
    Any(EventBinaryOptionsMarketUpdate.TYPE_URL, with(EventBinaryOptionsMarketUpdateConverter) {
    toByteArray() })

public fun Any.parse(converter: ProtobufConverter<EventBinaryOptionsMarketUpdate>):
    EventBinaryOptionsMarketUpdate {
  if (typeUrl != EventBinaryOptionsMarketUpdate.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object EventNewSpotOrdersConverter : ProtobufConverter<EventNewSpotOrders>

public fun EventNewSpotOrders.toAny(): Any = Any(EventNewSpotOrders.TYPE_URL,
    with(EventNewSpotOrdersConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<EventNewSpotOrders>): EventNewSpotOrders {
  if (typeUrl != EventNewSpotOrders.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object EventNewDerivativeOrdersConverter : ProtobufConverter<EventNewDerivativeOrders>

public fun EventNewDerivativeOrders.toAny(): Any = Any(EventNewDerivativeOrders.TYPE_URL,
    with(EventNewDerivativeOrdersConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<EventNewDerivativeOrders>):
    EventNewDerivativeOrders {
  if (typeUrl != EventNewDerivativeOrders.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object EventCancelSpotOrderConverter : ProtobufConverter<EventCancelSpotOrder>

public fun EventCancelSpotOrder.toAny(): Any = Any(EventCancelSpotOrder.TYPE_URL,
    with(EventCancelSpotOrderConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<EventCancelSpotOrder>): EventCancelSpotOrder {
  if (typeUrl != EventCancelSpotOrder.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object EventSpotMarketUpdateConverter : ProtobufConverter<EventSpotMarketUpdate>

public fun EventSpotMarketUpdate.toAny(): Any = Any(EventSpotMarketUpdate.TYPE_URL,
    with(EventSpotMarketUpdateConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<EventSpotMarketUpdate>): EventSpotMarketUpdate {
  if (typeUrl != EventSpotMarketUpdate.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object EventPerpetualMarketUpdateConverter :
    ProtobufConverter<EventPerpetualMarketUpdate>

public fun EventPerpetualMarketUpdate.toAny(): Any = Any(EventPerpetualMarketUpdate.TYPE_URL,
    with(EventPerpetualMarketUpdateConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<EventPerpetualMarketUpdate>):
    EventPerpetualMarketUpdate {
  if (typeUrl != EventPerpetualMarketUpdate.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object EventExpiryFuturesMarketUpdateConverter :
    ProtobufConverter<EventExpiryFuturesMarketUpdate>

public fun EventExpiryFuturesMarketUpdate.toAny(): Any =
    Any(EventExpiryFuturesMarketUpdate.TYPE_URL, with(EventExpiryFuturesMarketUpdateConverter) {
    toByteArray() })

public fun Any.parse(converter: ProtobufConverter<EventExpiryFuturesMarketUpdate>):
    EventExpiryFuturesMarketUpdate {
  if (typeUrl != EventExpiryFuturesMarketUpdate.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object EventPerpetualMarketFundingUpdateConverter :
    ProtobufConverter<EventPerpetualMarketFundingUpdate>

public fun EventPerpetualMarketFundingUpdate.toAny(): Any =
    Any(EventPerpetualMarketFundingUpdate.TYPE_URL, with(EventPerpetualMarketFundingUpdateConverter)
    { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<EventPerpetualMarketFundingUpdate>):
    EventPerpetualMarketFundingUpdate {
  if (typeUrl != EventPerpetualMarketFundingUpdate.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object EventSubaccountDepositConverter : ProtobufConverter<EventSubaccountDeposit>

public fun EventSubaccountDeposit.toAny(): Any = Any(EventSubaccountDeposit.TYPE_URL,
    with(EventSubaccountDepositConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<EventSubaccountDeposit>): EventSubaccountDeposit {
  if (typeUrl != EventSubaccountDeposit.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object EventSubaccountWithdrawConverter : ProtobufConverter<EventSubaccountWithdraw>

public fun EventSubaccountWithdraw.toAny(): Any = Any(EventSubaccountWithdraw.TYPE_URL,
    with(EventSubaccountWithdrawConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<EventSubaccountWithdraw>):
    EventSubaccountWithdraw {
  if (typeUrl != EventSubaccountWithdraw.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object EventSubaccountBalanceTransferConverter :
    ProtobufConverter<EventSubaccountBalanceTransfer>

public fun EventSubaccountBalanceTransfer.toAny(): Any =
    Any(EventSubaccountBalanceTransfer.TYPE_URL, with(EventSubaccountBalanceTransferConverter) {
    toByteArray() })

public fun Any.parse(converter: ProtobufConverter<EventSubaccountBalanceTransfer>):
    EventSubaccountBalanceTransfer {
  if (typeUrl != EventSubaccountBalanceTransfer.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object EventBatchDepositUpdateConverter : ProtobufConverter<EventBatchDepositUpdate>

public fun EventBatchDepositUpdate.toAny(): Any = Any(EventBatchDepositUpdate.TYPE_URL,
    with(EventBatchDepositUpdateConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<EventBatchDepositUpdate>):
    EventBatchDepositUpdate {
  if (typeUrl != EventBatchDepositUpdate.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object DerivativeMarketOrderCancelConverter :
    ProtobufConverter<DerivativeMarketOrderCancel>

public fun DerivativeMarketOrderCancel.toAny(): Any = Any(DerivativeMarketOrderCancel.TYPE_URL,
    with(DerivativeMarketOrderCancelConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<DerivativeMarketOrderCancel>):
    DerivativeMarketOrderCancel {
  if (typeUrl != DerivativeMarketOrderCancel.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object EventCancelDerivativeOrderConverter :
    ProtobufConverter<EventCancelDerivativeOrder>

public fun EventCancelDerivativeOrder.toAny(): Any = Any(EventCancelDerivativeOrder.TYPE_URL,
    with(EventCancelDerivativeOrderConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<EventCancelDerivativeOrder>):
    EventCancelDerivativeOrder {
  if (typeUrl != EventCancelDerivativeOrder.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object EventFeeDiscountScheduleConverter : ProtobufConverter<EventFeeDiscountSchedule>

public fun EventFeeDiscountSchedule.toAny(): Any = Any(EventFeeDiscountSchedule.TYPE_URL,
    with(EventFeeDiscountScheduleConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<EventFeeDiscountSchedule>):
    EventFeeDiscountSchedule {
  if (typeUrl != EventFeeDiscountSchedule.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object EventTradingRewardCampaignUpdateConverter :
    ProtobufConverter<EventTradingRewardCampaignUpdate>

public fun EventTradingRewardCampaignUpdate.toAny(): Any =
    Any(EventTradingRewardCampaignUpdate.TYPE_URL, with(EventTradingRewardCampaignUpdateConverter) {
    toByteArray() })

public fun Any.parse(converter: ProtobufConverter<EventTradingRewardCampaignUpdate>):
    EventTradingRewardCampaignUpdate {
  if (typeUrl != EventTradingRewardCampaignUpdate.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object EventTradingRewardDistributionConverter :
    ProtobufConverter<EventTradingRewardDistribution>

public fun EventTradingRewardDistribution.toAny(): Any =
    Any(EventTradingRewardDistribution.TYPE_URL, with(EventTradingRewardDistributionConverter) {
    toByteArray() })

public fun Any.parse(converter: ProtobufConverter<EventTradingRewardDistribution>):
    EventTradingRewardDistribution {
  if (typeUrl != EventTradingRewardDistribution.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object EventNewConditionalDerivativeOrderConverter :
    ProtobufConverter<EventNewConditionalDerivativeOrder>

public fun EventNewConditionalDerivativeOrder.toAny(): Any =
    Any(EventNewConditionalDerivativeOrder.TYPE_URL,
    with(EventNewConditionalDerivativeOrderConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<EventNewConditionalDerivativeOrder>):
    EventNewConditionalDerivativeOrder {
  if (typeUrl != EventNewConditionalDerivativeOrder.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object EventCancelConditionalDerivativeOrderConverter :
    ProtobufConverter<EventCancelConditionalDerivativeOrder>

public fun EventCancelConditionalDerivativeOrder.toAny(): Any =
    Any(EventCancelConditionalDerivativeOrder.TYPE_URL,
    with(EventCancelConditionalDerivativeOrderConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<EventCancelConditionalDerivativeOrder>):
    EventCancelConditionalDerivativeOrder {
  if (typeUrl != EventCancelConditionalDerivativeOrder.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object EventConditionalDerivativeOrderTriggerConverter :
    ProtobufConverter<EventConditionalDerivativeOrderTrigger>

public fun EventConditionalDerivativeOrderTrigger.toAny(): Any =
    Any(EventConditionalDerivativeOrderTrigger.TYPE_URL,
    with(EventConditionalDerivativeOrderTriggerConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<EventConditionalDerivativeOrderTrigger>):
    EventConditionalDerivativeOrderTrigger {
  if (typeUrl != EventConditionalDerivativeOrderTrigger.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object EventOrderFailConverter : ProtobufConverter<EventOrderFail>

public fun EventOrderFail.toAny(): Any = Any(EventOrderFail.TYPE_URL, with(EventOrderFailConverter)
    { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<EventOrderFail>): EventOrderFail {
  if (typeUrl != EventOrderFail.TYPE_URL) throw IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object EventAtomicMarketOrderFeeMultipliersUpdatedConverter :
    ProtobufConverter<EventAtomicMarketOrderFeeMultipliersUpdated>

public fun EventAtomicMarketOrderFeeMultipliersUpdated.toAny(): Any =
    Any(EventAtomicMarketOrderFeeMultipliersUpdated.TYPE_URL,
    with(EventAtomicMarketOrderFeeMultipliersUpdatedConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<EventAtomicMarketOrderFeeMultipliersUpdated>):
    EventAtomicMarketOrderFeeMultipliersUpdated {
  if (typeUrl != EventAtomicMarketOrderFeeMultipliersUpdated.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object EventOrderbookUpdateConverter : ProtobufConverter<EventOrderbookUpdate>

public fun EventOrderbookUpdate.toAny(): Any = Any(EventOrderbookUpdate.TYPE_URL,
    with(EventOrderbookUpdateConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<EventOrderbookUpdate>): EventOrderbookUpdate {
  if (typeUrl != EventOrderbookUpdate.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object OrderbookUpdateConverter : ProtobufConverter<OrderbookUpdate>

public fun OrderbookUpdate.toAny(): Any = Any(OrderbookUpdate.TYPE_URL,
    with(OrderbookUpdateConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<OrderbookUpdate>): OrderbookUpdate {
  if (typeUrl != OrderbookUpdate.TYPE_URL) throw IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object OrderbookConverter : ProtobufConverter<Orderbook>

public fun Orderbook.toAny(): Any = Any(Orderbook.TYPE_URL, with(OrderbookConverter) { toByteArray()
    })

public fun Any.parse(converter: ProtobufConverter<Orderbook>): Orderbook {
  if (typeUrl != Orderbook.TYPE_URL) throw IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}
