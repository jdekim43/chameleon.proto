// Transform from injective/exchange/v1beta1/proposal.proto
@file:GeneratorVersion(version = "0.3.1")

package injective.exchange.v1beta1

import kr.jadekim.protobuf.`annotation`.GeneratorVersion
import kr.jadekim.protobuf.converter.ProtobufConverter

public actual object SpotMarketParamUpdateProposalConverter :
    ProtobufConverter<SpotMarketParamUpdateProposal> by SpotMarketParamUpdateProposalJvmConverter

public actual object ExchangeEnableProposalConverter : ProtobufConverter<ExchangeEnableProposal> by
    ExchangeEnableProposalJvmConverter

public actual object BatchExchangeModificationProposalConverter :
    ProtobufConverter<BatchExchangeModificationProposal> by
    BatchExchangeModificationProposalJvmConverter

public actual object SpotMarketLaunchProposalConverter : ProtobufConverter<SpotMarketLaunchProposal>
    by SpotMarketLaunchProposalJvmConverter

public actual object PerpetualMarketLaunchProposalConverter :
    ProtobufConverter<PerpetualMarketLaunchProposal> by PerpetualMarketLaunchProposalJvmConverter

public actual object BinaryOptionsMarketLaunchProposalConverter :
    ProtobufConverter<BinaryOptionsMarketLaunchProposal> by
    BinaryOptionsMarketLaunchProposalJvmConverter

public actual object ExpiryFuturesMarketLaunchProposalConverter :
    ProtobufConverter<ExpiryFuturesMarketLaunchProposal> by
    ExpiryFuturesMarketLaunchProposalJvmConverter

public actual object DerivativeMarketParamUpdateProposalConverter :
    ProtobufConverter<DerivativeMarketParamUpdateProposal> by
    DerivativeMarketParamUpdateProposalJvmConverter

public actual object MarketForcedSettlementProposalConverter :
    ProtobufConverter<MarketForcedSettlementProposal> by MarketForcedSettlementProposalJvmConverter

public actual object UpdateDenomDecimalsProposalConverter :
    ProtobufConverter<UpdateDenomDecimalsProposal> by UpdateDenomDecimalsProposalJvmConverter

public actual object BinaryOptionsMarketParamUpdateProposalConverter :
    ProtobufConverter<BinaryOptionsMarketParamUpdateProposal> by
    BinaryOptionsMarketParamUpdateProposalJvmConverter

public actual object ProviderOracleParamsConverter : ProtobufConverter<ProviderOracleParams> by
    ProviderOracleParamsJvmConverter

public actual object OracleParamsConverter : ProtobufConverter<OracleParams> by
    OracleParamsJvmConverter

public actual object TradingRewardCampaignLaunchProposalConverter :
    ProtobufConverter<TradingRewardCampaignLaunchProposal> by
    TradingRewardCampaignLaunchProposalJvmConverter

public actual object TradingRewardCampaignUpdateProposalConverter :
    ProtobufConverter<TradingRewardCampaignUpdateProposal> by
    TradingRewardCampaignUpdateProposalJvmConverter

public actual object RewardPointUpdateConverter : ProtobufConverter<RewardPointUpdate> by
    RewardPointUpdateJvmConverter

public actual object TradingRewardPendingPointsUpdateProposalConverter :
    ProtobufConverter<TradingRewardPendingPointsUpdateProposal> by
    TradingRewardPendingPointsUpdateProposalJvmConverter

public actual object FeeDiscountProposalConverter : ProtobufConverter<FeeDiscountProposal> by
    FeeDiscountProposalJvmConverter

public actual object BatchCommunityPoolSpendProposalConverter :
    ProtobufConverter<BatchCommunityPoolSpendProposal> by
    BatchCommunityPoolSpendProposalJvmConverter

public actual object AtomicMarketOrderFeeMultiplierScheduleProposalConverter :
    ProtobufConverter<AtomicMarketOrderFeeMultiplierScheduleProposal> by
    AtomicMarketOrderFeeMultiplierScheduleProposalJvmConverter
