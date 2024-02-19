// Transform from injective/exchange/v1beta1/exchange.proto
@file:GeneratorVersion(version = "0.3.1")

package injective.exchange.v1beta1

import google.protobuf.Any
import java.lang.IllegalStateException
import kr.jadekim.protobuf.`annotation`.GeneratorVersion
import kr.jadekim.protobuf.converter.ProtobufConverter
import kr.jadekim.protobuf.converter.parseProtobuf

public expect object ParamsConverter : ProtobufConverter<Params>

public fun Params.toAny(): Any = Any(Params.TYPE_URL, with(ParamsConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<Params>): Params {
  if (typeUrl != Params.TYPE_URL) throw IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object MarketFeeMultiplierConverter : ProtobufConverter<MarketFeeMultiplier>

public fun MarketFeeMultiplier.toAny(): Any = Any(MarketFeeMultiplier.TYPE_URL,
    with(MarketFeeMultiplierConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<MarketFeeMultiplier>): MarketFeeMultiplier {
  if (typeUrl != MarketFeeMultiplier.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object DerivativeMarketConverter : ProtobufConverter<DerivativeMarket>

public fun DerivativeMarket.toAny(): Any = Any(DerivativeMarket.TYPE_URL,
    with(DerivativeMarketConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<DerivativeMarket>): DerivativeMarket {
  if (typeUrl != DerivativeMarket.TYPE_URL) throw IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object BinaryOptionsMarketConverter : ProtobufConverter<BinaryOptionsMarket>

public fun BinaryOptionsMarket.toAny(): Any = Any(BinaryOptionsMarket.TYPE_URL,
    with(BinaryOptionsMarketConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<BinaryOptionsMarket>): BinaryOptionsMarket {
  if (typeUrl != BinaryOptionsMarket.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object ExpiryFuturesMarketInfoConverter : ProtobufConverter<ExpiryFuturesMarketInfo>

public fun ExpiryFuturesMarketInfo.toAny(): Any = Any(ExpiryFuturesMarketInfo.TYPE_URL,
    with(ExpiryFuturesMarketInfoConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<ExpiryFuturesMarketInfo>):
    ExpiryFuturesMarketInfo {
  if (typeUrl != ExpiryFuturesMarketInfo.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object PerpetualMarketInfoConverter : ProtobufConverter<PerpetualMarketInfo>

public fun PerpetualMarketInfo.toAny(): Any = Any(PerpetualMarketInfo.TYPE_URL,
    with(PerpetualMarketInfoConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<PerpetualMarketInfo>): PerpetualMarketInfo {
  if (typeUrl != PerpetualMarketInfo.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object PerpetualMarketFundingConverter : ProtobufConverter<PerpetualMarketFunding>

public fun PerpetualMarketFunding.toAny(): Any = Any(PerpetualMarketFunding.TYPE_URL,
    with(PerpetualMarketFundingConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<PerpetualMarketFunding>): PerpetualMarketFunding {
  if (typeUrl != PerpetualMarketFunding.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object DerivativeMarketSettlementInfoConverter :
    ProtobufConverter<DerivativeMarketSettlementInfo>

public fun DerivativeMarketSettlementInfo.toAny(): Any =
    Any(DerivativeMarketSettlementInfo.TYPE_URL, with(DerivativeMarketSettlementInfoConverter) {
    toByteArray() })

public fun Any.parse(converter: ProtobufConverter<DerivativeMarketSettlementInfo>):
    DerivativeMarketSettlementInfo {
  if (typeUrl != DerivativeMarketSettlementInfo.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object NextFundingTimestampConverter : ProtobufConverter<NextFundingTimestamp>

public fun NextFundingTimestamp.toAny(): Any = Any(NextFundingTimestamp.TYPE_URL,
    with(NextFundingTimestampConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<NextFundingTimestamp>): NextFundingTimestamp {
  if (typeUrl != NextFundingTimestamp.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object MidPriceAndTOBConverter : ProtobufConverter<MidPriceAndTOB>

public fun MidPriceAndTOB.toAny(): Any = Any(MidPriceAndTOB.TYPE_URL, with(MidPriceAndTOBConverter)
    { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<MidPriceAndTOB>): MidPriceAndTOB {
  if (typeUrl != MidPriceAndTOB.TYPE_URL) throw IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object SpotMarketConverter : ProtobufConverter<SpotMarket>

public fun SpotMarket.toAny(): Any = Any(SpotMarket.TYPE_URL, with(SpotMarketConverter) {
    toByteArray() })

public fun Any.parse(converter: ProtobufConverter<SpotMarket>): SpotMarket {
  if (typeUrl != SpotMarket.TYPE_URL) throw IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object DepositConverter : ProtobufConverter<Deposit>

public fun Deposit.toAny(): Any = Any(Deposit.TYPE_URL, with(DepositConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<Deposit>): Deposit {
  if (typeUrl != Deposit.TYPE_URL) throw IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object SubaccountTradeNonceConverter : ProtobufConverter<SubaccountTradeNonce>

public fun SubaccountTradeNonce.toAny(): Any = Any(SubaccountTradeNonce.TYPE_URL,
    with(SubaccountTradeNonceConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<SubaccountTradeNonce>): SubaccountTradeNonce {
  if (typeUrl != SubaccountTradeNonce.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object OrderInfoConverter : ProtobufConverter<OrderInfo>

public fun OrderInfo.toAny(): Any = Any(OrderInfo.TYPE_URL, with(OrderInfoConverter) { toByteArray()
    })

public fun Any.parse(converter: ProtobufConverter<OrderInfo>): OrderInfo {
  if (typeUrl != OrderInfo.TYPE_URL) throw IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object SpotOrderConverter : ProtobufConverter<SpotOrder>

public fun SpotOrder.toAny(): Any = Any(SpotOrder.TYPE_URL, with(SpotOrderConverter) { toByteArray()
    })

public fun Any.parse(converter: ProtobufConverter<SpotOrder>): SpotOrder {
  if (typeUrl != SpotOrder.TYPE_URL) throw IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object SpotLimitOrderConverter : ProtobufConverter<SpotLimitOrder>

public fun SpotLimitOrder.toAny(): Any = Any(SpotLimitOrder.TYPE_URL, with(SpotLimitOrderConverter)
    { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<SpotLimitOrder>): SpotLimitOrder {
  if (typeUrl != SpotLimitOrder.TYPE_URL) throw IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object SpotMarketOrderConverter : ProtobufConverter<SpotMarketOrder>

public fun SpotMarketOrder.toAny(): Any = Any(SpotMarketOrder.TYPE_URL,
    with(SpotMarketOrderConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<SpotMarketOrder>): SpotMarketOrder {
  if (typeUrl != SpotMarketOrder.TYPE_URL) throw IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object DerivativeOrderConverter : ProtobufConverter<DerivativeOrder>

public fun DerivativeOrder.toAny(): Any = Any(DerivativeOrder.TYPE_URL,
    with(DerivativeOrderConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<DerivativeOrder>): DerivativeOrder {
  if (typeUrl != DerivativeOrder.TYPE_URL) throw IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object SubaccountOrderbookMetadataConverter :
    ProtobufConverter<SubaccountOrderbookMetadata>

public fun SubaccountOrderbookMetadata.toAny(): Any = Any(SubaccountOrderbookMetadata.TYPE_URL,
    with(SubaccountOrderbookMetadataConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<SubaccountOrderbookMetadata>):
    SubaccountOrderbookMetadata {
  if (typeUrl != SubaccountOrderbookMetadata.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object SubaccountOrderConverter : ProtobufConverter<SubaccountOrder>

public fun SubaccountOrder.toAny(): Any = Any(SubaccountOrder.TYPE_URL,
    with(SubaccountOrderConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<SubaccountOrder>): SubaccountOrder {
  if (typeUrl != SubaccountOrder.TYPE_URL) throw IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object SubaccountOrderDataConverter : ProtobufConverter<SubaccountOrderData>

public fun SubaccountOrderData.toAny(): Any = Any(SubaccountOrderData.TYPE_URL,
    with(SubaccountOrderDataConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<SubaccountOrderData>): SubaccountOrderData {
  if (typeUrl != SubaccountOrderData.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object DerivativeLimitOrderConverter : ProtobufConverter<DerivativeLimitOrder>

public fun DerivativeLimitOrder.toAny(): Any = Any(DerivativeLimitOrder.TYPE_URL,
    with(DerivativeLimitOrderConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<DerivativeLimitOrder>): DerivativeLimitOrder {
  if (typeUrl != DerivativeLimitOrder.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object DerivativeMarketOrderConverter : ProtobufConverter<DerivativeMarketOrder>

public fun DerivativeMarketOrder.toAny(): Any = Any(DerivativeMarketOrder.TYPE_URL,
    with(DerivativeMarketOrderConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<DerivativeMarketOrder>): DerivativeMarketOrder {
  if (typeUrl != DerivativeMarketOrder.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object PositionConverter : ProtobufConverter<Position>

public fun Position.toAny(): Any = Any(Position.TYPE_URL, with(PositionConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<Position>): Position {
  if (typeUrl != Position.TYPE_URL) throw IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object MarketOrderIndicatorConverter : ProtobufConverter<MarketOrderIndicator>

public fun MarketOrderIndicator.toAny(): Any = Any(MarketOrderIndicator.TYPE_URL,
    with(MarketOrderIndicatorConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<MarketOrderIndicator>): MarketOrderIndicator {
  if (typeUrl != MarketOrderIndicator.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object TradeLogConverter : ProtobufConverter<TradeLog>

public fun TradeLog.toAny(): Any = Any(TradeLog.TYPE_URL, with(TradeLogConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<TradeLog>): TradeLog {
  if (typeUrl != TradeLog.TYPE_URL) throw IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object PositionDeltaConverter : ProtobufConverter<PositionDelta>

public fun PositionDelta.toAny(): Any = Any(PositionDelta.TYPE_URL, with(PositionDeltaConverter) {
    toByteArray() })

public fun Any.parse(converter: ProtobufConverter<PositionDelta>): PositionDelta {
  if (typeUrl != PositionDelta.TYPE_URL) throw IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object DerivativeTradeLogConverter : ProtobufConverter<DerivativeTradeLog>

public fun DerivativeTradeLog.toAny(): Any = Any(DerivativeTradeLog.TYPE_URL,
    with(DerivativeTradeLogConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<DerivativeTradeLog>): DerivativeTradeLog {
  if (typeUrl != DerivativeTradeLog.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object SubaccountPositionConverter : ProtobufConverter<SubaccountPosition>

public fun SubaccountPosition.toAny(): Any = Any(SubaccountPosition.TYPE_URL,
    with(SubaccountPositionConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<SubaccountPosition>): SubaccountPosition {
  if (typeUrl != SubaccountPosition.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object SubaccountDepositConverter : ProtobufConverter<SubaccountDeposit>

public fun SubaccountDeposit.toAny(): Any = Any(SubaccountDeposit.TYPE_URL,
    with(SubaccountDepositConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<SubaccountDeposit>): SubaccountDeposit {
  if (typeUrl != SubaccountDeposit.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object DepositUpdateConverter : ProtobufConverter<DepositUpdate>

public fun DepositUpdate.toAny(): Any = Any(DepositUpdate.TYPE_URL, with(DepositUpdateConverter) {
    toByteArray() })

public fun Any.parse(converter: ProtobufConverter<DepositUpdate>): DepositUpdate {
  if (typeUrl != DepositUpdate.TYPE_URL) throw IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object PointsMultiplierConverter : ProtobufConverter<PointsMultiplier>

public fun PointsMultiplier.toAny(): Any = Any(PointsMultiplier.TYPE_URL,
    with(PointsMultiplierConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<PointsMultiplier>): PointsMultiplier {
  if (typeUrl != PointsMultiplier.TYPE_URL) throw IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object TradingRewardCampaignBoostInfoConverter :
    ProtobufConverter<TradingRewardCampaignBoostInfo>

public fun TradingRewardCampaignBoostInfo.toAny(): Any =
    Any(TradingRewardCampaignBoostInfo.TYPE_URL, with(TradingRewardCampaignBoostInfoConverter) {
    toByteArray() })

public fun Any.parse(converter: ProtobufConverter<TradingRewardCampaignBoostInfo>):
    TradingRewardCampaignBoostInfo {
  if (typeUrl != TradingRewardCampaignBoostInfo.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object CampaignRewardPoolConverter : ProtobufConverter<CampaignRewardPool>

public fun CampaignRewardPool.toAny(): Any = Any(CampaignRewardPool.TYPE_URL,
    with(CampaignRewardPoolConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<CampaignRewardPool>): CampaignRewardPool {
  if (typeUrl != CampaignRewardPool.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object TradingRewardCampaignInfoConverter :
    ProtobufConverter<TradingRewardCampaignInfo>

public fun TradingRewardCampaignInfo.toAny(): Any = Any(TradingRewardCampaignInfo.TYPE_URL,
    with(TradingRewardCampaignInfoConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<TradingRewardCampaignInfo>):
    TradingRewardCampaignInfo {
  if (typeUrl != TradingRewardCampaignInfo.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object FeeDiscountTierInfoConverter : ProtobufConverter<FeeDiscountTierInfo>

public fun FeeDiscountTierInfo.toAny(): Any = Any(FeeDiscountTierInfo.TYPE_URL,
    with(FeeDiscountTierInfoConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<FeeDiscountTierInfo>): FeeDiscountTierInfo {
  if (typeUrl != FeeDiscountTierInfo.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object FeeDiscountScheduleConverter : ProtobufConverter<FeeDiscountSchedule>

public fun FeeDiscountSchedule.toAny(): Any = Any(FeeDiscountSchedule.TYPE_URL,
    with(FeeDiscountScheduleConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<FeeDiscountSchedule>): FeeDiscountSchedule {
  if (typeUrl != FeeDiscountSchedule.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object FeeDiscountTierTTLConverter : ProtobufConverter<FeeDiscountTierTTL>

public fun FeeDiscountTierTTL.toAny(): Any = Any(FeeDiscountTierTTL.TYPE_URL,
    with(FeeDiscountTierTTLConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<FeeDiscountTierTTL>): FeeDiscountTierTTL {
  if (typeUrl != FeeDiscountTierTTL.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object VolumeRecordConverter : ProtobufConverter<VolumeRecord>

public fun VolumeRecord.toAny(): Any = Any(VolumeRecord.TYPE_URL, with(VolumeRecordConverter) {
    toByteArray() })

public fun Any.parse(converter: ProtobufConverter<VolumeRecord>): VolumeRecord {
  if (typeUrl != VolumeRecord.TYPE_URL) throw IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object AccountRewardsConverter : ProtobufConverter<AccountRewards>

public fun AccountRewards.toAny(): Any = Any(AccountRewards.TYPE_URL, with(AccountRewardsConverter)
    { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<AccountRewards>): AccountRewards {
  if (typeUrl != AccountRewards.TYPE_URL) throw IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object TradeRecordsConverter : ProtobufConverter<TradeRecords>

public fun TradeRecords.toAny(): Any = Any(TradeRecords.TYPE_URL, with(TradeRecordsConverter) {
    toByteArray() })

public fun Any.parse(converter: ProtobufConverter<TradeRecords>): TradeRecords {
  if (typeUrl != TradeRecords.TYPE_URL) throw IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object SubaccountIDsConverter : ProtobufConverter<SubaccountIDs>

public fun SubaccountIDs.toAny(): Any = Any(SubaccountIDs.TYPE_URL, with(SubaccountIDsConverter) {
    toByteArray() })

public fun Any.parse(converter: ProtobufConverter<SubaccountIDs>): SubaccountIDs {
  if (typeUrl != SubaccountIDs.TYPE_URL) throw IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object TradeRecordConverter : ProtobufConverter<TradeRecord>

public fun TradeRecord.toAny(): Any = Any(TradeRecord.TYPE_URL, with(TradeRecordConverter) {
    toByteArray() })

public fun Any.parse(converter: ProtobufConverter<TradeRecord>): TradeRecord {
  if (typeUrl != TradeRecord.TYPE_URL) throw IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object LevelConverter : ProtobufConverter<Level>

public fun Level.toAny(): Any = Any(Level.TYPE_URL, with(LevelConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<Level>): Level {
  if (typeUrl != Level.TYPE_URL) throw IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object AggregateSubaccountVolumeRecordConverter :
    ProtobufConverter<AggregateSubaccountVolumeRecord>

public fun AggregateSubaccountVolumeRecord.toAny(): Any =
    Any(AggregateSubaccountVolumeRecord.TYPE_URL, with(AggregateSubaccountVolumeRecordConverter) {
    toByteArray() })

public fun Any.parse(converter: ProtobufConverter<AggregateSubaccountVolumeRecord>):
    AggregateSubaccountVolumeRecord {
  if (typeUrl != AggregateSubaccountVolumeRecord.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object AggregateAccountVolumeRecordConverter :
    ProtobufConverter<AggregateAccountVolumeRecord>

public fun AggregateAccountVolumeRecord.toAny(): Any = Any(AggregateAccountVolumeRecord.TYPE_URL,
    with(AggregateAccountVolumeRecordConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<AggregateAccountVolumeRecord>):
    AggregateAccountVolumeRecord {
  if (typeUrl != AggregateAccountVolumeRecord.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object MarketVolumeConverter : ProtobufConverter<MarketVolume>

public fun MarketVolume.toAny(): Any = Any(MarketVolume.TYPE_URL, with(MarketVolumeConverter) {
    toByteArray() })

public fun Any.parse(converter: ProtobufConverter<MarketVolume>): MarketVolume {
  if (typeUrl != MarketVolume.TYPE_URL) throw IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object DenomDecimalsConverter : ProtobufConverter<DenomDecimals>

public fun DenomDecimals.toAny(): Any = Any(DenomDecimals.TYPE_URL, with(DenomDecimalsConverter) {
    toByteArray() })

public fun Any.parse(converter: ProtobufConverter<DenomDecimals>): DenomDecimals {
  if (typeUrl != DenomDecimals.TYPE_URL) throw IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}
