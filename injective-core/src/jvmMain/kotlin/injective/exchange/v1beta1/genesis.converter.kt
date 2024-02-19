// Transform from injective/exchange/v1beta1/genesis.proto
@file:GeneratorVersion(version = "0.3.1")

package injective.exchange.v1beta1

import kr.jadekim.protobuf.`annotation`.GeneratorVersion
import kr.jadekim.protobuf.converter.ProtobufConverter

public actual object GenesisStateConverter : ProtobufConverter<GenesisState> by
    GenesisStateJvmConverter

public actual object OrderbookSequenceConverter : ProtobufConverter<OrderbookSequence> by
    OrderbookSequenceJvmConverter

public actual object FeeDiscountAccountTierTTLConverter :
    ProtobufConverter<FeeDiscountAccountTierTTL> by FeeDiscountAccountTierTTLJvmConverter

public actual object FeeDiscountBucketVolumeAccountsConverter :
    ProtobufConverter<FeeDiscountBucketVolumeAccounts> by
    FeeDiscountBucketVolumeAccountsJvmConverter

public actual object AccountVolumeConverter : ProtobufConverter<AccountVolume> by
    AccountVolumeJvmConverter

public actual object TradingRewardCampaignAccountPointsConverter :
    ProtobufConverter<TradingRewardCampaignAccountPoints> by
    TradingRewardCampaignAccountPointsJvmConverter

public actual object TradingRewardCampaignAccountPendingPointsConverter :
    ProtobufConverter<TradingRewardCampaignAccountPendingPoints> by
    TradingRewardCampaignAccountPendingPointsJvmConverter

public actual object SpotOrderBookConverter : ProtobufConverter<SpotOrderBook> by
    SpotOrderBookJvmConverter

public actual object DerivativeOrderBookConverter : ProtobufConverter<DerivativeOrderBook> by
    DerivativeOrderBookJvmConverter

public actual object ConditionalDerivativeOrderBookConverter :
    ProtobufConverter<ConditionalDerivativeOrderBook> by ConditionalDerivativeOrderBookJvmConverter

public actual object BalanceConverter : ProtobufConverter<Balance> by BalanceJvmConverter

public actual object DerivativePositionConverter : ProtobufConverter<DerivativePosition> by
    DerivativePositionJvmConverter

public actual object SubaccountNonceConverter : ProtobufConverter<SubaccountNonce> by
    SubaccountNonceJvmConverter

public actual object ExpiryFuturesMarketInfoStateConverter :
    ProtobufConverter<ExpiryFuturesMarketInfoState> by ExpiryFuturesMarketInfoStateJvmConverter

public actual object PerpetualMarketFundingStateConverter :
    ProtobufConverter<PerpetualMarketFundingState> by PerpetualMarketFundingStateJvmConverter
