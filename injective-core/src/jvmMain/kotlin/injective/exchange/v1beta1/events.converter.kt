// Transform from injective/exchange/v1beta1/events.proto
@file:GeneratorVersion(version = "0.3.1")

package injective.exchange.v1beta1

import kr.jadekim.protobuf.`annotation`.GeneratorVersion
import kr.jadekim.protobuf.converter.ProtobufConverter

public actual object EventBatchSpotExecutionConverter : ProtobufConverter<EventBatchSpotExecution>
    by EventBatchSpotExecutionJvmConverter

public actual object EventBatchDerivativeExecutionConverter :
    ProtobufConverter<EventBatchDerivativeExecution> by EventBatchDerivativeExecutionJvmConverter

public actual object EventLostFundsFromLiquidationConverter :
    ProtobufConverter<EventLostFundsFromLiquidation> by EventLostFundsFromLiquidationJvmConverter

public actual object EventBatchDerivativePositionConverter :
    ProtobufConverter<EventBatchDerivativePosition> by EventBatchDerivativePositionJvmConverter

public actual object EventDerivativeMarketPausedConverter :
    ProtobufConverter<EventDerivativeMarketPaused> by EventDerivativeMarketPausedJvmConverter

public actual object EventMarketBeyondBankruptcyConverter :
    ProtobufConverter<EventMarketBeyondBankruptcy> by EventMarketBeyondBankruptcyJvmConverter

public actual object EventAllPositionsHaircutConverter : ProtobufConverter<EventAllPositionsHaircut>
    by EventAllPositionsHaircutJvmConverter

public actual object EventBinaryOptionsMarketUpdateConverter :
    ProtobufConverter<EventBinaryOptionsMarketUpdate> by EventBinaryOptionsMarketUpdateJvmConverter

public actual object EventNewSpotOrdersConverter : ProtobufConverter<EventNewSpotOrders> by
    EventNewSpotOrdersJvmConverter

public actual object EventNewDerivativeOrdersConverter : ProtobufConverter<EventNewDerivativeOrders>
    by EventNewDerivativeOrdersJvmConverter

public actual object EventCancelSpotOrderConverter : ProtobufConverter<EventCancelSpotOrder> by
    EventCancelSpotOrderJvmConverter

public actual object EventSpotMarketUpdateConverter : ProtobufConverter<EventSpotMarketUpdate> by
    EventSpotMarketUpdateJvmConverter

public actual object EventPerpetualMarketUpdateConverter :
    ProtobufConverter<EventPerpetualMarketUpdate> by EventPerpetualMarketUpdateJvmConverter

public actual object EventExpiryFuturesMarketUpdateConverter :
    ProtobufConverter<EventExpiryFuturesMarketUpdate> by EventExpiryFuturesMarketUpdateJvmConverter

public actual object EventPerpetualMarketFundingUpdateConverter :
    ProtobufConverter<EventPerpetualMarketFundingUpdate> by
    EventPerpetualMarketFundingUpdateJvmConverter

public actual object EventSubaccountDepositConverter : ProtobufConverter<EventSubaccountDeposit> by
    EventSubaccountDepositJvmConverter

public actual object EventSubaccountWithdrawConverter : ProtobufConverter<EventSubaccountWithdraw>
    by EventSubaccountWithdrawJvmConverter

public actual object EventSubaccountBalanceTransferConverter :
    ProtobufConverter<EventSubaccountBalanceTransfer> by EventSubaccountBalanceTransferJvmConverter

public actual object EventBatchDepositUpdateConverter : ProtobufConverter<EventBatchDepositUpdate>
    by EventBatchDepositUpdateJvmConverter

public actual object DerivativeMarketOrderCancelConverter :
    ProtobufConverter<DerivativeMarketOrderCancel> by DerivativeMarketOrderCancelJvmConverter

public actual object EventCancelDerivativeOrderConverter :
    ProtobufConverter<EventCancelDerivativeOrder> by EventCancelDerivativeOrderJvmConverter

public actual object EventFeeDiscountScheduleConverter : ProtobufConverter<EventFeeDiscountSchedule>
    by EventFeeDiscountScheduleJvmConverter

public actual object EventTradingRewardCampaignUpdateConverter :
    ProtobufConverter<EventTradingRewardCampaignUpdate> by
    EventTradingRewardCampaignUpdateJvmConverter

public actual object EventTradingRewardDistributionConverter :
    ProtobufConverter<EventTradingRewardDistribution> by EventTradingRewardDistributionJvmConverter

public actual object EventNewConditionalDerivativeOrderConverter :
    ProtobufConverter<EventNewConditionalDerivativeOrder> by
    EventNewConditionalDerivativeOrderJvmConverter

public actual object EventCancelConditionalDerivativeOrderConverter :
    ProtobufConverter<EventCancelConditionalDerivativeOrder> by
    EventCancelConditionalDerivativeOrderJvmConverter

public actual object EventConditionalDerivativeOrderTriggerConverter :
    ProtobufConverter<EventConditionalDerivativeOrderTrigger> by
    EventConditionalDerivativeOrderTriggerJvmConverter

public actual object EventOrderFailConverter : ProtobufConverter<EventOrderFail> by
    EventOrderFailJvmConverter

public actual object EventAtomicMarketOrderFeeMultipliersUpdatedConverter :
    ProtobufConverter<EventAtomicMarketOrderFeeMultipliersUpdated> by
    EventAtomicMarketOrderFeeMultipliersUpdatedJvmConverter

public actual object EventOrderbookUpdateConverter : ProtobufConverter<EventOrderbookUpdate> by
    EventOrderbookUpdateJvmConverter

public actual object OrderbookUpdateConverter : ProtobufConverter<OrderbookUpdate> by
    OrderbookUpdateJvmConverter

public actual object OrderbookConverter : ProtobufConverter<Orderbook> by OrderbookJvmConverter
