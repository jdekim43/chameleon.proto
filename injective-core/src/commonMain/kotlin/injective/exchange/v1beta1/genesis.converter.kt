// Transform from injective/exchange/v1beta1/genesis.proto
@file:GeneratorVersion(version = "0.3.1")

package injective.exchange.v1beta1

import google.protobuf.Any
import java.lang.IllegalStateException
import kr.jadekim.protobuf.`annotation`.GeneratorVersion
import kr.jadekim.protobuf.converter.ProtobufConverter
import kr.jadekim.protobuf.converter.parseProtobuf

public expect object GenesisStateConverter : ProtobufConverter<GenesisState>

public fun GenesisState.toAny(): Any = Any(GenesisState.TYPE_URL, with(GenesisStateConverter) {
    toByteArray() })

public fun Any.parse(converter: ProtobufConverter<GenesisState>): GenesisState {
  if (typeUrl != GenesisState.TYPE_URL) throw IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object OrderbookSequenceConverter : ProtobufConverter<OrderbookSequence>

public fun OrderbookSequence.toAny(): Any = Any(OrderbookSequence.TYPE_URL,
    with(OrderbookSequenceConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<OrderbookSequence>): OrderbookSequence {
  if (typeUrl != OrderbookSequence.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object FeeDiscountAccountTierTTLConverter :
    ProtobufConverter<FeeDiscountAccountTierTTL>

public fun FeeDiscountAccountTierTTL.toAny(): Any = Any(FeeDiscountAccountTierTTL.TYPE_URL,
    with(FeeDiscountAccountTierTTLConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<FeeDiscountAccountTierTTL>):
    FeeDiscountAccountTierTTL {
  if (typeUrl != FeeDiscountAccountTierTTL.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object FeeDiscountBucketVolumeAccountsConverter :
    ProtobufConverter<FeeDiscountBucketVolumeAccounts>

public fun FeeDiscountBucketVolumeAccounts.toAny(): Any =
    Any(FeeDiscountBucketVolumeAccounts.TYPE_URL, with(FeeDiscountBucketVolumeAccountsConverter) {
    toByteArray() })

public fun Any.parse(converter: ProtobufConverter<FeeDiscountBucketVolumeAccounts>):
    FeeDiscountBucketVolumeAccounts {
  if (typeUrl != FeeDiscountBucketVolumeAccounts.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object AccountVolumeConverter : ProtobufConverter<AccountVolume>

public fun AccountVolume.toAny(): Any = Any(AccountVolume.TYPE_URL, with(AccountVolumeConverter) {
    toByteArray() })

public fun Any.parse(converter: ProtobufConverter<AccountVolume>): AccountVolume {
  if (typeUrl != AccountVolume.TYPE_URL) throw IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object TradingRewardCampaignAccountPointsConverter :
    ProtobufConverter<TradingRewardCampaignAccountPoints>

public fun TradingRewardCampaignAccountPoints.toAny(): Any =
    Any(TradingRewardCampaignAccountPoints.TYPE_URL,
    with(TradingRewardCampaignAccountPointsConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<TradingRewardCampaignAccountPoints>):
    TradingRewardCampaignAccountPoints {
  if (typeUrl != TradingRewardCampaignAccountPoints.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object TradingRewardCampaignAccountPendingPointsConverter :
    ProtobufConverter<TradingRewardCampaignAccountPendingPoints>

public fun TradingRewardCampaignAccountPendingPoints.toAny(): Any =
    Any(TradingRewardCampaignAccountPendingPoints.TYPE_URL,
    with(TradingRewardCampaignAccountPendingPointsConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<TradingRewardCampaignAccountPendingPoints>):
    TradingRewardCampaignAccountPendingPoints {
  if (typeUrl != TradingRewardCampaignAccountPendingPoints.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object SpotOrderBookConverter : ProtobufConverter<SpotOrderBook>

public fun SpotOrderBook.toAny(): Any = Any(SpotOrderBook.TYPE_URL, with(SpotOrderBookConverter) {
    toByteArray() })

public fun Any.parse(converter: ProtobufConverter<SpotOrderBook>): SpotOrderBook {
  if (typeUrl != SpotOrderBook.TYPE_URL) throw IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object DerivativeOrderBookConverter : ProtobufConverter<DerivativeOrderBook>

public fun DerivativeOrderBook.toAny(): Any = Any(DerivativeOrderBook.TYPE_URL,
    with(DerivativeOrderBookConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<DerivativeOrderBook>): DerivativeOrderBook {
  if (typeUrl != DerivativeOrderBook.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object ConditionalDerivativeOrderBookConverter :
    ProtobufConverter<ConditionalDerivativeOrderBook>

public fun ConditionalDerivativeOrderBook.toAny(): Any =
    Any(ConditionalDerivativeOrderBook.TYPE_URL, with(ConditionalDerivativeOrderBookConverter) {
    toByteArray() })

public fun Any.parse(converter: ProtobufConverter<ConditionalDerivativeOrderBook>):
    ConditionalDerivativeOrderBook {
  if (typeUrl != ConditionalDerivativeOrderBook.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object BalanceConverter : ProtobufConverter<Balance>

public fun Balance.toAny(): Any = Any(Balance.TYPE_URL, with(BalanceConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<Balance>): Balance {
  if (typeUrl != Balance.TYPE_URL) throw IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object DerivativePositionConverter : ProtobufConverter<DerivativePosition>

public fun DerivativePosition.toAny(): Any = Any(DerivativePosition.TYPE_URL,
    with(DerivativePositionConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<DerivativePosition>): DerivativePosition {
  if (typeUrl != DerivativePosition.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object SubaccountNonceConverter : ProtobufConverter<SubaccountNonce>

public fun SubaccountNonce.toAny(): Any = Any(SubaccountNonce.TYPE_URL,
    with(SubaccountNonceConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<SubaccountNonce>): SubaccountNonce {
  if (typeUrl != SubaccountNonce.TYPE_URL) throw IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object ExpiryFuturesMarketInfoStateConverter :
    ProtobufConverter<ExpiryFuturesMarketInfoState>

public fun ExpiryFuturesMarketInfoState.toAny(): Any = Any(ExpiryFuturesMarketInfoState.TYPE_URL,
    with(ExpiryFuturesMarketInfoStateConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<ExpiryFuturesMarketInfoState>):
    ExpiryFuturesMarketInfoState {
  if (typeUrl != ExpiryFuturesMarketInfoState.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object PerpetualMarketFundingStateConverter :
    ProtobufConverter<PerpetualMarketFundingState>

public fun PerpetualMarketFundingState.toAny(): Any = Any(PerpetualMarketFundingState.TYPE_URL,
    with(PerpetualMarketFundingStateConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<PerpetualMarketFundingState>):
    PerpetualMarketFundingState {
  if (typeUrl != PerpetualMarketFundingState.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}
