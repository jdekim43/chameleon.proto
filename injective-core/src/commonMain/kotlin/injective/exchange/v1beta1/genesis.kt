// Transform from injective/exchange/v1beta1/genesis.proto
@file:ProtobufSyntax(syntax = "PROTO3")
@file:GeneratorVersion(version = "0.3.1")

package injective.exchange.v1beta1

import kotlin.Boolean
import kotlin.Long
import kotlin.String
import kotlin.ULong
import kotlin.Unit
import kotlin.collections.List
import kotlinx.serialization.KSerializer
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import kr.jadekim.protobuf.`annotation`.GeneratorVersion
import kr.jadekim.protobuf.`annotation`.ProtobufIndex
import kr.jadekim.protobuf.`annotation`.ProtobufSyntax
import kr.jadekim.protobuf.kotlinx.ProtobufConverterEncoder
import kr.jadekim.protobuf.kotlinx.ProtobufMapperDecoder
import kr.jadekim.protobuf.type.ProtobufMessage

@Serializable(with = GenesisState.KotlinxSerializer::class)
@SerialName(value = GenesisState.TYPE_URL)
public data class GenesisState(
  @ProtobufIndex(index = 1)
  public val params: Params,
  @ProtobufIndex(index = 2)
  public val spotMarkets: List<SpotMarket>,
  @ProtobufIndex(index = 3)
  public val derivativeMarkets: List<DerivativeMarket>,
  @ProtobufIndex(index = 4)
  public val spotOrderbook: List<SpotOrderBook>,
  @ProtobufIndex(index = 5)
  public val derivativeOrderbook: List<DerivativeOrderBook>,
  @ProtobufIndex(index = 6)
  public val balances: List<Balance>,
  @ProtobufIndex(index = 7)
  public val positions: List<DerivativePosition>,
  @ProtobufIndex(index = 8)
  public val subaccountTradeNonces: List<SubaccountNonce>,
  @ProtobufIndex(index = 9)
  public val expiryFuturesMarketInfoState: List<ExpiryFuturesMarketInfoState>,
  @ProtobufIndex(index = 10)
  public val perpetualMarketInfo: List<PerpetualMarketInfo>,
  @ProtobufIndex(index = 11)
  public val perpetualMarketFundingState: List<PerpetualMarketFundingState>,
  @ProtobufIndex(index = 12)
  public val derivativeMarketSettlementScheduled: List<DerivativeMarketSettlementInfo>,
  @ProtobufIndex(index = 13)
  public val isSpotExchangeEnabled: Boolean,
  @ProtobufIndex(index = 14)
  public val isDerivativesExchangeEnabled: Boolean,
  @ProtobufIndex(index = 15)
  public val tradingRewardCampaignInfo: TradingRewardCampaignInfo,
  @ProtobufIndex(index = 16)
  public val tradingRewardPoolCampaignSchedule: List<CampaignRewardPool>,
  @ProtobufIndex(index = 17)
  public val tradingRewardCampaignAccountPoints: List<TradingRewardCampaignAccountPoints>,
  @ProtobufIndex(index = 18)
  public val feeDiscountSchedule: FeeDiscountSchedule,
  @ProtobufIndex(index = 19)
  public val feeDiscountAccountTierTtl: List<FeeDiscountAccountTierTTL>,
  @ProtobufIndex(index = 20)
  public val feeDiscountBucketVolumeAccounts: List<FeeDiscountBucketVolumeAccounts>,
  @ProtobufIndex(index = 21)
  public val isFirstFeeCycleFinished: Boolean,
  @ProtobufIndex(index = 22)
  public val pendingTradingRewardPoolCampaignSchedule: List<CampaignRewardPool>,
  @ProtobufIndex(index = 23)
  public val pendingTradingRewardCampaignAccountPoints:
      List<TradingRewardCampaignAccountPendingPoints>,
  @ProtobufIndex(index = 24)
  public val rewardsOptOutAddresses: List<String>,
  @ProtobufIndex(index = 25)
  public val historicalTradeRecords: List<TradeRecords>,
  @ProtobufIndex(index = 26)
  public val binaryOptionsMarkets: List<BinaryOptionsMarket>,
  @ProtobufIndex(index = 27)
  public val binaryOptionsMarketIdsScheduledForSettlement: List<String>,
  @ProtobufIndex(index = 28)
  public val spotMarketIdsScheduledToForceClose: List<String>,
  @ProtobufIndex(index = 29)
  public val denomDecimals: List<DenomDecimals>,
  @ProtobufIndex(index = 30)
  public val conditionalDerivativeOrderbooks: List<ConditionalDerivativeOrderBook>,
  @ProtobufIndex(index = 31)
  public val marketFeeMultipliers: List<MarketFeeMultiplier>,
  @ProtobufIndex(index = 32)
  public val orderbookSequences: List<OrderbookSequence>,
  @ProtobufIndex(index = 33)
  public val subaccountVolumes: List<AggregateSubaccountVolumeRecord>,
  @ProtobufIndex(index = 34)
  public val marketVolumes: List<MarketVolume>,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/injective.exchange.v1beta1.GenesisState"
  }

  public object KotlinxSerializer : KSerializer<GenesisState> {
    private val delegator: KSerializer<GenesisState> = GenesisState.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: GenesisState): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(GenesisStateConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): GenesisState {
      if (decoder is ProtobufMapperDecoder) {
        return GenesisStateConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = OrderbookSequence.KotlinxSerializer::class)
@SerialName(value = OrderbookSequence.TYPE_URL)
public data class OrderbookSequence(
  @ProtobufIndex(index = 1)
  public val sequence: ULong,
  @ProtobufIndex(index = 2)
  public val marketId: String,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/injective.exchange.v1beta1.OrderbookSequence"
  }

  public object KotlinxSerializer : KSerializer<OrderbookSequence> {
    private val delegator: KSerializer<OrderbookSequence> = OrderbookSequence.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: OrderbookSequence): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(OrderbookSequenceConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): OrderbookSequence {
      if (decoder is ProtobufMapperDecoder) {
        return OrderbookSequenceConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = FeeDiscountAccountTierTTL.KotlinxSerializer::class)
@SerialName(value = FeeDiscountAccountTierTTL.TYPE_URL)
public data class FeeDiscountAccountTierTTL(
  @ProtobufIndex(index = 1)
  public val account: String,
  @ProtobufIndex(index = 2)
  public val tierTtl: FeeDiscountTierTTL,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/injective.exchange.v1beta1.FeeDiscountAccountTierTTL"
  }

  public object KotlinxSerializer : KSerializer<FeeDiscountAccountTierTTL> {
    private val delegator: KSerializer<FeeDiscountAccountTierTTL> =
        FeeDiscountAccountTierTTL.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: FeeDiscountAccountTierTTL): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(FeeDiscountAccountTierTTLConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): FeeDiscountAccountTierTTL {
      if (decoder is ProtobufMapperDecoder) {
        return FeeDiscountAccountTierTTLConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = FeeDiscountBucketVolumeAccounts.KotlinxSerializer::class)
@SerialName(value = FeeDiscountBucketVolumeAccounts.TYPE_URL)
public data class FeeDiscountBucketVolumeAccounts(
  @ProtobufIndex(index = 1)
  public val bucketStartTimestamp: Long,
  @ProtobufIndex(index = 2)
  public val accountVolume: List<AccountVolume>,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String =
        "/injective.exchange.v1beta1.FeeDiscountBucketVolumeAccounts"
  }

  public object KotlinxSerializer : KSerializer<FeeDiscountBucketVolumeAccounts> {
    private val delegator: KSerializer<FeeDiscountBucketVolumeAccounts> =
        FeeDiscountBucketVolumeAccounts.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: FeeDiscountBucketVolumeAccounts):
        Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(FeeDiscountBucketVolumeAccountsConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): FeeDiscountBucketVolumeAccounts {
      if (decoder is ProtobufMapperDecoder) {
        return FeeDiscountBucketVolumeAccountsConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = AccountVolume.KotlinxSerializer::class)
@SerialName(value = AccountVolume.TYPE_URL)
public data class AccountVolume(
  @ProtobufIndex(index = 1)
  public val account: String,
  @ProtobufIndex(index = 2)
  public val volume: String,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/injective.exchange.v1beta1.AccountVolume"
  }

  public object KotlinxSerializer : KSerializer<AccountVolume> {
    private val delegator: KSerializer<AccountVolume> = AccountVolume.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: AccountVolume): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(AccountVolumeConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): AccountVolume {
      if (decoder is ProtobufMapperDecoder) {
        return AccountVolumeConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = TradingRewardCampaignAccountPoints.KotlinxSerializer::class)
@SerialName(value = TradingRewardCampaignAccountPoints.TYPE_URL)
public data class TradingRewardCampaignAccountPoints(
  @ProtobufIndex(index = 1)
  public val account: String,
  @ProtobufIndex(index = 2)
  public val points: String,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String =
        "/injective.exchange.v1beta1.TradingRewardCampaignAccountPoints"
  }

  public object KotlinxSerializer : KSerializer<TradingRewardCampaignAccountPoints> {
    private val delegator: KSerializer<TradingRewardCampaignAccountPoints> =
        TradingRewardCampaignAccountPoints.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: TradingRewardCampaignAccountPoints):
        Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(TradingRewardCampaignAccountPointsConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): TradingRewardCampaignAccountPoints {
      if (decoder is ProtobufMapperDecoder) {
        return TradingRewardCampaignAccountPointsConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = TradingRewardCampaignAccountPendingPoints.KotlinxSerializer::class)
@SerialName(value = TradingRewardCampaignAccountPendingPoints.TYPE_URL)
public data class TradingRewardCampaignAccountPendingPoints(
  @ProtobufIndex(index = 1)
  public val rewardPoolStartTimestamp: Long,
  @ProtobufIndex(index = 2)
  public val accountPoints: List<TradingRewardCampaignAccountPoints>,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String =
        "/injective.exchange.v1beta1.TradingRewardCampaignAccountPendingPoints"
  }

  public object KotlinxSerializer : KSerializer<TradingRewardCampaignAccountPendingPoints> {
    private val delegator: KSerializer<TradingRewardCampaignAccountPendingPoints> =
        TradingRewardCampaignAccountPendingPoints.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder,
        `value`: TradingRewardCampaignAccountPendingPoints): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(TradingRewardCampaignAccountPendingPointsConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): TradingRewardCampaignAccountPendingPoints {
      if (decoder is ProtobufMapperDecoder) {
        return TradingRewardCampaignAccountPendingPointsConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = SpotOrderBook.KotlinxSerializer::class)
@SerialName(value = SpotOrderBook.TYPE_URL)
public data class SpotOrderBook(
  @ProtobufIndex(index = 1)
  public val marketId: String,
  @ProtobufIndex(index = 2)
  public val isBuySide: Boolean,
  @ProtobufIndex(index = 3)
  public val orders: List<SpotLimitOrder>,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/injective.exchange.v1beta1.SpotOrderBook"
  }

  public object KotlinxSerializer : KSerializer<SpotOrderBook> {
    private val delegator: KSerializer<SpotOrderBook> = SpotOrderBook.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: SpotOrderBook): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(SpotOrderBookConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): SpotOrderBook {
      if (decoder is ProtobufMapperDecoder) {
        return SpotOrderBookConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = DerivativeOrderBook.KotlinxSerializer::class)
@SerialName(value = DerivativeOrderBook.TYPE_URL)
public data class DerivativeOrderBook(
  @ProtobufIndex(index = 1)
  public val marketId: String,
  @ProtobufIndex(index = 2)
  public val isBuySide: Boolean,
  @ProtobufIndex(index = 3)
  public val orders: List<DerivativeLimitOrder>,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/injective.exchange.v1beta1.DerivativeOrderBook"
  }

  public object KotlinxSerializer : KSerializer<DerivativeOrderBook> {
    private val delegator: KSerializer<DerivativeOrderBook> = DerivativeOrderBook.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: DerivativeOrderBook): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(DerivativeOrderBookConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): DerivativeOrderBook {
      if (decoder is ProtobufMapperDecoder) {
        return DerivativeOrderBookConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = ConditionalDerivativeOrderBook.KotlinxSerializer::class)
@SerialName(value = ConditionalDerivativeOrderBook.TYPE_URL)
public data class ConditionalDerivativeOrderBook(
  @ProtobufIndex(index = 1)
  public val marketId: String,
  @ProtobufIndex(index = 2)
  public val limitBuyOrders: List<DerivativeLimitOrder>,
  @ProtobufIndex(index = 3)
  public val marketBuyOrders: List<DerivativeMarketOrder>,
  @ProtobufIndex(index = 4)
  public val limitSellOrders: List<DerivativeLimitOrder>,
  @ProtobufIndex(index = 5)
  public val marketSellOrders: List<DerivativeMarketOrder>,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/injective.exchange.v1beta1.ConditionalDerivativeOrderBook"
  }

  public object KotlinxSerializer : KSerializer<ConditionalDerivativeOrderBook> {
    private val delegator: KSerializer<ConditionalDerivativeOrderBook> =
        ConditionalDerivativeOrderBook.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: ConditionalDerivativeOrderBook): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(ConditionalDerivativeOrderBookConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): ConditionalDerivativeOrderBook {
      if (decoder is ProtobufMapperDecoder) {
        return ConditionalDerivativeOrderBookConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = Balance.KotlinxSerializer::class)
@SerialName(value = Balance.TYPE_URL)
public data class Balance(
  @ProtobufIndex(index = 1)
  public val subaccountId: String,
  @ProtobufIndex(index = 2)
  public val denom: String,
  @ProtobufIndex(index = 3)
  public val deposits: Deposit,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/injective.exchange.v1beta1.Balance"
  }

  public object KotlinxSerializer : KSerializer<Balance> {
    private val delegator: KSerializer<Balance> = Balance.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: Balance): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(BalanceConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): Balance {
      if (decoder is ProtobufMapperDecoder) {
        return BalanceConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = DerivativePosition.KotlinxSerializer::class)
@SerialName(value = DerivativePosition.TYPE_URL)
public data class DerivativePosition(
  @ProtobufIndex(index = 1)
  public val subaccountId: String,
  @ProtobufIndex(index = 2)
  public val marketId: String,
  @ProtobufIndex(index = 3)
  public val position: Position,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/injective.exchange.v1beta1.DerivativePosition"
  }

  public object KotlinxSerializer : KSerializer<DerivativePosition> {
    private val delegator: KSerializer<DerivativePosition> = DerivativePosition.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: DerivativePosition): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(DerivativePositionConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): DerivativePosition {
      if (decoder is ProtobufMapperDecoder) {
        return DerivativePositionConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = SubaccountNonce.KotlinxSerializer::class)
@SerialName(value = SubaccountNonce.TYPE_URL)
public data class SubaccountNonce(
  @ProtobufIndex(index = 1)
  public val subaccountId: String,
  @ProtobufIndex(index = 2)
  public val subaccountTradeNonce: SubaccountTradeNonce,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/injective.exchange.v1beta1.SubaccountNonce"
  }

  public object KotlinxSerializer : KSerializer<SubaccountNonce> {
    private val delegator: KSerializer<SubaccountNonce> = SubaccountNonce.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: SubaccountNonce): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(SubaccountNonceConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): SubaccountNonce {
      if (decoder is ProtobufMapperDecoder) {
        return SubaccountNonceConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = ExpiryFuturesMarketInfoState.KotlinxSerializer::class)
@SerialName(value = ExpiryFuturesMarketInfoState.TYPE_URL)
public data class ExpiryFuturesMarketInfoState(
  @ProtobufIndex(index = 1)
  public val marketId: String,
  @ProtobufIndex(index = 2)
  public val marketInfo: ExpiryFuturesMarketInfo,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/injective.exchange.v1beta1.ExpiryFuturesMarketInfoState"
  }

  public object KotlinxSerializer : KSerializer<ExpiryFuturesMarketInfoState> {
    private val delegator: KSerializer<ExpiryFuturesMarketInfoState> =
        ExpiryFuturesMarketInfoState.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: ExpiryFuturesMarketInfoState): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(ExpiryFuturesMarketInfoStateConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): ExpiryFuturesMarketInfoState {
      if (decoder is ProtobufMapperDecoder) {
        return ExpiryFuturesMarketInfoStateConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = PerpetualMarketFundingState.KotlinxSerializer::class)
@SerialName(value = PerpetualMarketFundingState.TYPE_URL)
public data class PerpetualMarketFundingState(
  @ProtobufIndex(index = 1)
  public val marketId: String,
  @ProtobufIndex(index = 2)
  public val funding: PerpetualMarketFunding,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/injective.exchange.v1beta1.PerpetualMarketFundingState"
  }

  public object KotlinxSerializer : KSerializer<PerpetualMarketFundingState> {
    private val delegator: KSerializer<PerpetualMarketFundingState> =
        PerpetualMarketFundingState.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: PerpetualMarketFundingState): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(PerpetualMarketFundingStateConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): PerpetualMarketFundingState {
      if (decoder is ProtobufMapperDecoder) {
        return PerpetualMarketFundingStateConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}
