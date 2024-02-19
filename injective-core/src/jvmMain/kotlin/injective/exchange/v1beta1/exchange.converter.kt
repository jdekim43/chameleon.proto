// Transform from injective/exchange/v1beta1/exchange.proto
@file:GeneratorVersion(version = "0.3.1")

package injective.exchange.v1beta1

import kr.jadekim.protobuf.`annotation`.GeneratorVersion
import kr.jadekim.protobuf.converter.ProtobufConverter

public actual object ParamsConverter : ProtobufConverter<Params> by ParamsJvmConverter

public actual object MarketFeeMultiplierConverter : ProtobufConverter<MarketFeeMultiplier> by
    MarketFeeMultiplierJvmConverter

public actual object DerivativeMarketConverter : ProtobufConverter<DerivativeMarket> by
    DerivativeMarketJvmConverter

public actual object BinaryOptionsMarketConverter : ProtobufConverter<BinaryOptionsMarket> by
    BinaryOptionsMarketJvmConverter

public actual object ExpiryFuturesMarketInfoConverter : ProtobufConverter<ExpiryFuturesMarketInfo>
    by ExpiryFuturesMarketInfoJvmConverter

public actual object PerpetualMarketInfoConverter : ProtobufConverter<PerpetualMarketInfo> by
    PerpetualMarketInfoJvmConverter

public actual object PerpetualMarketFundingConverter : ProtobufConverter<PerpetualMarketFunding> by
    PerpetualMarketFundingJvmConverter

public actual object DerivativeMarketSettlementInfoConverter :
    ProtobufConverter<DerivativeMarketSettlementInfo> by DerivativeMarketSettlementInfoJvmConverter

public actual object NextFundingTimestampConverter : ProtobufConverter<NextFundingTimestamp> by
    NextFundingTimestampJvmConverter

public actual object MidPriceAndTOBConverter : ProtobufConverter<MidPriceAndTOB> by
    MidPriceAndTOBJvmConverter

public actual object SpotMarketConverter : ProtobufConverter<SpotMarket> by SpotMarketJvmConverter

public actual object DepositConverter : ProtobufConverter<Deposit> by DepositJvmConverter

public actual object SubaccountTradeNonceConverter : ProtobufConverter<SubaccountTradeNonce> by
    SubaccountTradeNonceJvmConverter

public actual object OrderInfoConverter : ProtobufConverter<OrderInfo> by OrderInfoJvmConverter

public actual object SpotOrderConverter : ProtobufConverter<SpotOrder> by SpotOrderJvmConverter

public actual object SpotLimitOrderConverter : ProtobufConverter<SpotLimitOrder> by
    SpotLimitOrderJvmConverter

public actual object SpotMarketOrderConverter : ProtobufConverter<SpotMarketOrder> by
    SpotMarketOrderJvmConverter

public actual object DerivativeOrderConverter : ProtobufConverter<DerivativeOrder> by
    DerivativeOrderJvmConverter

public actual object SubaccountOrderbookMetadataConverter :
    ProtobufConverter<SubaccountOrderbookMetadata> by SubaccountOrderbookMetadataJvmConverter

public actual object SubaccountOrderConverter : ProtobufConverter<SubaccountOrder> by
    SubaccountOrderJvmConverter

public actual object SubaccountOrderDataConverter : ProtobufConverter<SubaccountOrderData> by
    SubaccountOrderDataJvmConverter

public actual object DerivativeLimitOrderConverter : ProtobufConverter<DerivativeLimitOrder> by
    DerivativeLimitOrderJvmConverter

public actual object DerivativeMarketOrderConverter : ProtobufConverter<DerivativeMarketOrder> by
    DerivativeMarketOrderJvmConverter

public actual object PositionConverter : ProtobufConverter<Position> by PositionJvmConverter

public actual object MarketOrderIndicatorConverter : ProtobufConverter<MarketOrderIndicator> by
    MarketOrderIndicatorJvmConverter

public actual object TradeLogConverter : ProtobufConverter<TradeLog> by TradeLogJvmConverter

public actual object PositionDeltaConverter : ProtobufConverter<PositionDelta> by
    PositionDeltaJvmConverter

public actual object DerivativeTradeLogConverter : ProtobufConverter<DerivativeTradeLog> by
    DerivativeTradeLogJvmConverter

public actual object SubaccountPositionConverter : ProtobufConverter<SubaccountPosition> by
    SubaccountPositionJvmConverter

public actual object SubaccountDepositConverter : ProtobufConverter<SubaccountDeposit> by
    SubaccountDepositJvmConverter

public actual object DepositUpdateConverter : ProtobufConverter<DepositUpdate> by
    DepositUpdateJvmConverter

public actual object PointsMultiplierConverter : ProtobufConverter<PointsMultiplier> by
    PointsMultiplierJvmConverter

public actual object TradingRewardCampaignBoostInfoConverter :
    ProtobufConverter<TradingRewardCampaignBoostInfo> by TradingRewardCampaignBoostInfoJvmConverter

public actual object CampaignRewardPoolConverter : ProtobufConverter<CampaignRewardPool> by
    CampaignRewardPoolJvmConverter

public actual object TradingRewardCampaignInfoConverter :
    ProtobufConverter<TradingRewardCampaignInfo> by TradingRewardCampaignInfoJvmConverter

public actual object FeeDiscountTierInfoConverter : ProtobufConverter<FeeDiscountTierInfo> by
    FeeDiscountTierInfoJvmConverter

public actual object FeeDiscountScheduleConverter : ProtobufConverter<FeeDiscountSchedule> by
    FeeDiscountScheduleJvmConverter

public actual object FeeDiscountTierTTLConverter : ProtobufConverter<FeeDiscountTierTTL> by
    FeeDiscountTierTTLJvmConverter

public actual object VolumeRecordConverter : ProtobufConverter<VolumeRecord> by
    VolumeRecordJvmConverter

public actual object AccountRewardsConverter : ProtobufConverter<AccountRewards> by
    AccountRewardsJvmConverter

public actual object TradeRecordsConverter : ProtobufConverter<TradeRecords> by
    TradeRecordsJvmConverter

public actual object SubaccountIDsConverter : ProtobufConverter<SubaccountIDs> by
    SubaccountIDsJvmConverter

public actual object TradeRecordConverter : ProtobufConverter<TradeRecord> by
    TradeRecordJvmConverter

public actual object LevelConverter : ProtobufConverter<Level> by LevelJvmConverter

public actual object AggregateSubaccountVolumeRecordConverter :
    ProtobufConverter<AggregateSubaccountVolumeRecord> by
    AggregateSubaccountVolumeRecordJvmConverter

public actual object AggregateAccountVolumeRecordConverter :
    ProtobufConverter<AggregateAccountVolumeRecord> by AggregateAccountVolumeRecordJvmConverter

public actual object MarketVolumeConverter : ProtobufConverter<MarketVolume> by
    MarketVolumeJvmConverter

public actual object DenomDecimalsConverter : ProtobufConverter<DenomDecimals> by
    DenomDecimalsJvmConverter
