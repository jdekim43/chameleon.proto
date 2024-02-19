// Transform from injective/exchange/v1beta1/proposal.proto
@file:GeneratorVersion(version = "0.3.1")

package injective.exchange.v1beta1

import google.protobuf.Any
import java.lang.IllegalStateException
import kr.jadekim.protobuf.`annotation`.GeneratorVersion
import kr.jadekim.protobuf.converter.ProtobufConverter
import kr.jadekim.protobuf.converter.parseProtobuf

public expect object SpotMarketParamUpdateProposalConverter :
    ProtobufConverter<SpotMarketParamUpdateProposal>

public fun SpotMarketParamUpdateProposal.toAny(): Any = Any(SpotMarketParamUpdateProposal.TYPE_URL,
    with(SpotMarketParamUpdateProposalConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<SpotMarketParamUpdateProposal>):
    SpotMarketParamUpdateProposal {
  if (typeUrl != SpotMarketParamUpdateProposal.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object ExchangeEnableProposalConverter : ProtobufConverter<ExchangeEnableProposal>

public fun ExchangeEnableProposal.toAny(): Any = Any(ExchangeEnableProposal.TYPE_URL,
    with(ExchangeEnableProposalConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<ExchangeEnableProposal>): ExchangeEnableProposal {
  if (typeUrl != ExchangeEnableProposal.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object BatchExchangeModificationProposalConverter :
    ProtobufConverter<BatchExchangeModificationProposal>

public fun BatchExchangeModificationProposal.toAny(): Any =
    Any(BatchExchangeModificationProposal.TYPE_URL, with(BatchExchangeModificationProposalConverter)
    { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<BatchExchangeModificationProposal>):
    BatchExchangeModificationProposal {
  if (typeUrl != BatchExchangeModificationProposal.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object SpotMarketLaunchProposalConverter : ProtobufConverter<SpotMarketLaunchProposal>

public fun SpotMarketLaunchProposal.toAny(): Any = Any(SpotMarketLaunchProposal.TYPE_URL,
    with(SpotMarketLaunchProposalConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<SpotMarketLaunchProposal>):
    SpotMarketLaunchProposal {
  if (typeUrl != SpotMarketLaunchProposal.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object PerpetualMarketLaunchProposalConverter :
    ProtobufConverter<PerpetualMarketLaunchProposal>

public fun PerpetualMarketLaunchProposal.toAny(): Any = Any(PerpetualMarketLaunchProposal.TYPE_URL,
    with(PerpetualMarketLaunchProposalConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<PerpetualMarketLaunchProposal>):
    PerpetualMarketLaunchProposal {
  if (typeUrl != PerpetualMarketLaunchProposal.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object BinaryOptionsMarketLaunchProposalConverter :
    ProtobufConverter<BinaryOptionsMarketLaunchProposal>

public fun BinaryOptionsMarketLaunchProposal.toAny(): Any =
    Any(BinaryOptionsMarketLaunchProposal.TYPE_URL, with(BinaryOptionsMarketLaunchProposalConverter)
    { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<BinaryOptionsMarketLaunchProposal>):
    BinaryOptionsMarketLaunchProposal {
  if (typeUrl != BinaryOptionsMarketLaunchProposal.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object ExpiryFuturesMarketLaunchProposalConverter :
    ProtobufConverter<ExpiryFuturesMarketLaunchProposal>

public fun ExpiryFuturesMarketLaunchProposal.toAny(): Any =
    Any(ExpiryFuturesMarketLaunchProposal.TYPE_URL, with(ExpiryFuturesMarketLaunchProposalConverter)
    { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<ExpiryFuturesMarketLaunchProposal>):
    ExpiryFuturesMarketLaunchProposal {
  if (typeUrl != ExpiryFuturesMarketLaunchProposal.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object DerivativeMarketParamUpdateProposalConverter :
    ProtobufConverter<DerivativeMarketParamUpdateProposal>

public fun DerivativeMarketParamUpdateProposal.toAny(): Any =
    Any(DerivativeMarketParamUpdateProposal.TYPE_URL,
    with(DerivativeMarketParamUpdateProposalConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<DerivativeMarketParamUpdateProposal>):
    DerivativeMarketParamUpdateProposal {
  if (typeUrl != DerivativeMarketParamUpdateProposal.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object MarketForcedSettlementProposalConverter :
    ProtobufConverter<MarketForcedSettlementProposal>

public fun MarketForcedSettlementProposal.toAny(): Any =
    Any(MarketForcedSettlementProposal.TYPE_URL, with(MarketForcedSettlementProposalConverter) {
    toByteArray() })

public fun Any.parse(converter: ProtobufConverter<MarketForcedSettlementProposal>):
    MarketForcedSettlementProposal {
  if (typeUrl != MarketForcedSettlementProposal.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object UpdateDenomDecimalsProposalConverter :
    ProtobufConverter<UpdateDenomDecimalsProposal>

public fun UpdateDenomDecimalsProposal.toAny(): Any = Any(UpdateDenomDecimalsProposal.TYPE_URL,
    with(UpdateDenomDecimalsProposalConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<UpdateDenomDecimalsProposal>):
    UpdateDenomDecimalsProposal {
  if (typeUrl != UpdateDenomDecimalsProposal.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object BinaryOptionsMarketParamUpdateProposalConverter :
    ProtobufConverter<BinaryOptionsMarketParamUpdateProposal>

public fun BinaryOptionsMarketParamUpdateProposal.toAny(): Any =
    Any(BinaryOptionsMarketParamUpdateProposal.TYPE_URL,
    with(BinaryOptionsMarketParamUpdateProposalConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<BinaryOptionsMarketParamUpdateProposal>):
    BinaryOptionsMarketParamUpdateProposal {
  if (typeUrl != BinaryOptionsMarketParamUpdateProposal.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object ProviderOracleParamsConverter : ProtobufConverter<ProviderOracleParams>

public fun ProviderOracleParams.toAny(): Any = Any(ProviderOracleParams.TYPE_URL,
    with(ProviderOracleParamsConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<ProviderOracleParams>): ProviderOracleParams {
  if (typeUrl != ProviderOracleParams.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object OracleParamsConverter : ProtobufConverter<OracleParams>

public fun OracleParams.toAny(): Any = Any(OracleParams.TYPE_URL, with(OracleParamsConverter) {
    toByteArray() })

public fun Any.parse(converter: ProtobufConverter<OracleParams>): OracleParams {
  if (typeUrl != OracleParams.TYPE_URL) throw IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object TradingRewardCampaignLaunchProposalConverter :
    ProtobufConverter<TradingRewardCampaignLaunchProposal>

public fun TradingRewardCampaignLaunchProposal.toAny(): Any =
    Any(TradingRewardCampaignLaunchProposal.TYPE_URL,
    with(TradingRewardCampaignLaunchProposalConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<TradingRewardCampaignLaunchProposal>):
    TradingRewardCampaignLaunchProposal {
  if (typeUrl != TradingRewardCampaignLaunchProposal.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object TradingRewardCampaignUpdateProposalConverter :
    ProtobufConverter<TradingRewardCampaignUpdateProposal>

public fun TradingRewardCampaignUpdateProposal.toAny(): Any =
    Any(TradingRewardCampaignUpdateProposal.TYPE_URL,
    with(TradingRewardCampaignUpdateProposalConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<TradingRewardCampaignUpdateProposal>):
    TradingRewardCampaignUpdateProposal {
  if (typeUrl != TradingRewardCampaignUpdateProposal.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object RewardPointUpdateConverter : ProtobufConverter<RewardPointUpdate>

public fun RewardPointUpdate.toAny(): Any = Any(RewardPointUpdate.TYPE_URL,
    with(RewardPointUpdateConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<RewardPointUpdate>): RewardPointUpdate {
  if (typeUrl != RewardPointUpdate.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object TradingRewardPendingPointsUpdateProposalConverter :
    ProtobufConverter<TradingRewardPendingPointsUpdateProposal>

public fun TradingRewardPendingPointsUpdateProposal.toAny(): Any =
    Any(TradingRewardPendingPointsUpdateProposal.TYPE_URL,
    with(TradingRewardPendingPointsUpdateProposalConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<TradingRewardPendingPointsUpdateProposal>):
    TradingRewardPendingPointsUpdateProposal {
  if (typeUrl != TradingRewardPendingPointsUpdateProposal.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object FeeDiscountProposalConverter : ProtobufConverter<FeeDiscountProposal>

public fun FeeDiscountProposal.toAny(): Any = Any(FeeDiscountProposal.TYPE_URL,
    with(FeeDiscountProposalConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<FeeDiscountProposal>): FeeDiscountProposal {
  if (typeUrl != FeeDiscountProposal.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object BatchCommunityPoolSpendProposalConverter :
    ProtobufConverter<BatchCommunityPoolSpendProposal>

public fun BatchCommunityPoolSpendProposal.toAny(): Any =
    Any(BatchCommunityPoolSpendProposal.TYPE_URL, with(BatchCommunityPoolSpendProposalConverter) {
    toByteArray() })

public fun Any.parse(converter: ProtobufConverter<BatchCommunityPoolSpendProposal>):
    BatchCommunityPoolSpendProposal {
  if (typeUrl != BatchCommunityPoolSpendProposal.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object AtomicMarketOrderFeeMultiplierScheduleProposalConverter :
    ProtobufConverter<AtomicMarketOrderFeeMultiplierScheduleProposal>

public fun AtomicMarketOrderFeeMultiplierScheduleProposal.toAny(): Any =
    Any(AtomicMarketOrderFeeMultiplierScheduleProposal.TYPE_URL,
    with(AtomicMarketOrderFeeMultiplierScheduleProposalConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<AtomicMarketOrderFeeMultiplierScheduleProposal>):
    AtomicMarketOrderFeeMultiplierScheduleProposal {
  if (typeUrl != AtomicMarketOrderFeeMultiplierScheduleProposal.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}
