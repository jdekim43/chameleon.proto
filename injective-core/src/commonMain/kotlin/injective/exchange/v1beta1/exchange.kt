// Transform from injective/exchange/v1beta1/exchange.proto
@file:ProtobufSyntax(syntax = "PROTO3")
@file:GeneratorVersion(version = "0.3.1")

package injective.exchange.v1beta1

import cosmos.base.v1beta1.Coin
import injective.oracle.v1beta1.OracleType
import kotlin.Boolean
import kotlin.ByteArray
import kotlin.Int
import kotlin.Long
import kotlin.String
import kotlin.UInt
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

@Serializable
@SerialName(value = "/injective.exchange.v1beta1.AtomicMarketOrderAccessLevel")
public enum class AtomicMarketOrderAccessLevel(
  public val number: Int,
) {
  @ProtobufIndex(index = 0)
  Nobody(0),
  @ProtobufIndex(index = 1)
  BeginBlockerSmartContractsOnly(1),
  @ProtobufIndex(index = 2)
  SmartContractsOnly(2),
  @ProtobufIndex(index = 3)
  Everyone(3),
  ;

  public companion object {
    public fun forNumber(number: Int): AtomicMarketOrderAccessLevel =
        AtomicMarketOrderAccessLevel.values()
    	.first { it.number == number }
  }
}

@Serializable
@SerialName(value = "/injective.exchange.v1beta1.MarketStatus")
public enum class MarketStatus(
  public val number: Int,
) {
  @ProtobufIndex(index = 0)
  Unspecified(0),
  @ProtobufIndex(index = 1)
  Active(1),
  @ProtobufIndex(index = 2)
  Paused(2),
  @ProtobufIndex(index = 3)
  Demolished(3),
  @ProtobufIndex(index = 4)
  Expired(4),
  ;

  public companion object {
    public fun forNumber(number: Int): MarketStatus = MarketStatus.values()
    	.first { it.number == number }
  }
}

@Serializable
@SerialName(value = "/injective.exchange.v1beta1.OrderType")
public enum class OrderType(
  public val number: Int,
) {
  @ProtobufIndex(index = 0)
  UNSPECIFIED(0),
  @ProtobufIndex(index = 1)
  BUY(1),
  @ProtobufIndex(index = 2)
  SELL(2),
  @ProtobufIndex(index = 3)
  STOP_BUY(3),
  @ProtobufIndex(index = 4)
  STOP_SELL(4),
  @ProtobufIndex(index = 5)
  TAKE_BUY(5),
  @ProtobufIndex(index = 6)
  TAKE_SELL(6),
  @ProtobufIndex(index = 7)
  BUY_PO(7),
  @ProtobufIndex(index = 8)
  SELL_PO(8),
  @ProtobufIndex(index = 9)
  BUY_ATOMIC(9),
  @ProtobufIndex(index = 10)
  SELL_ATOMIC(10),
  ;

  public companion object {
    public fun forNumber(number: Int): OrderType = OrderType.values()
    	.first { it.number == number }
  }
}

@Serializable
@SerialName(value = "/injective.exchange.v1beta1.ExecutionType")
public enum class ExecutionType(
  public val number: Int,
) {
  @ProtobufIndex(index = 0)
  UnspecifiedExecutionType(0),
  @ProtobufIndex(index = 1)
  Market(1),
  @ProtobufIndex(index = 2)
  LimitFill(2),
  @ProtobufIndex(index = 3)
  LimitMatchRestingOrder(3),
  @ProtobufIndex(index = 4)
  LimitMatchNewOrder(4),
  @ProtobufIndex(index = 5)
  MarketLiquidation(5),
  @ProtobufIndex(index = 6)
  ExpiryMarketSettlement(6),
  ;

  public companion object {
    public fun forNumber(number: Int): ExecutionType = ExecutionType.values()
    	.first { it.number == number }
  }
}

@Serializable
@SerialName(value = "/injective.exchange.v1beta1.OrderMask")
public enum class OrderMask(
  public val number: Int,
) {
  @ProtobufIndex(index = 0)
  UNUSED(0),
  @ProtobufIndex(index = 1)
  ANY(1),
  @ProtobufIndex(index = 2)
  REGULAR(2),
  @ProtobufIndex(index = 4)
  CONDITIONAL(4),
  @ProtobufIndex(index = 8)
  DIRECTION_BUY_OR_HIGHER(8),
  @ProtobufIndex(index = 16)
  DIRECTION_SELL_OR_LOWER(16),
  @ProtobufIndex(index = 32)
  TYPE_MARKET(32),
  @ProtobufIndex(index = 64)
  TYPE_LIMIT(64),
  ;

  public companion object {
    public fun forNumber(number: Int): OrderMask = OrderMask.values()
    	.first { it.number == number }
  }
}

@Serializable(with = Params.KotlinxSerializer::class)
@SerialName(value = Params.TYPE_URL)
public data class Params(
  @ProtobufIndex(index = 1)
  public val spotMarketInstantListingFee: Coin,
  @ProtobufIndex(index = 2)
  public val derivativeMarketInstantListingFee: Coin,
  @ProtobufIndex(index = 3)
  public val defaultSpotMakerFeeRate: String,
  @ProtobufIndex(index = 4)
  public val defaultSpotTakerFeeRate: String,
  @ProtobufIndex(index = 5)
  public val defaultDerivativeMakerFeeRate: String,
  @ProtobufIndex(index = 6)
  public val defaultDerivativeTakerFeeRate: String,
  @ProtobufIndex(index = 7)
  public val defaultInitialMarginRatio: String,
  @ProtobufIndex(index = 8)
  public val defaultMaintenanceMarginRatio: String,
  @ProtobufIndex(index = 9)
  public val defaultFundingInterval: Long,
  @ProtobufIndex(index = 10)
  public val fundingMultiple: Long,
  @ProtobufIndex(index = 11)
  public val relayerFeeShareRate: String,
  @ProtobufIndex(index = 12)
  public val defaultHourlyFundingRateCap: String,
  @ProtobufIndex(index = 13)
  public val defaultHourlyInterestRate: String,
  @ProtobufIndex(index = 14)
  public val maxDerivativeOrderSideCount: UInt,
  @ProtobufIndex(index = 15)
  public val injRewardStakedRequirementThreshold: String,
  @ProtobufIndex(index = 16)
  public val tradingRewardsVestingDuration: Long,
  @ProtobufIndex(index = 17)
  public val liquidatorRewardShareRate: String,
  @ProtobufIndex(index = 18)
  public val binaryOptionsMarketInstantListingFee: Coin,
  @ProtobufIndex(index = 19)
  public val atomicMarketOrderAccessLevel: AtomicMarketOrderAccessLevel,
  @ProtobufIndex(index = 20)
  public val spotAtomicMarketOrderFeeMultiplier: String,
  @ProtobufIndex(index = 21)
  public val derivativeAtomicMarketOrderFeeMultiplier: String,
  @ProtobufIndex(index = 22)
  public val binaryOptionsAtomicMarketOrderFeeMultiplier: String,
  @ProtobufIndex(index = 23)
  public val minimalProtocolFeeRate: String,
  @ProtobufIndex(index = 24)
  public val isInstantDerivativeMarketLaunchEnabled: Boolean,
  @ProtobufIndex(index = 25)
  public val postOnlyModeHeightThreshold: Long,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/injective.exchange.v1beta1.Params"
  }

  public object KotlinxSerializer : KSerializer<Params> {
    private val delegator: KSerializer<Params> = Params.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: Params): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(ParamsConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): Params {
      if (decoder is ProtobufMapperDecoder) {
        return ParamsConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = MarketFeeMultiplier.KotlinxSerializer::class)
@SerialName(value = MarketFeeMultiplier.TYPE_URL)
public data class MarketFeeMultiplier(
  @ProtobufIndex(index = 1)
  public val marketId: String,
  @ProtobufIndex(index = 2)
  public val feeMultiplier: String,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/injective.exchange.v1beta1.MarketFeeMultiplier"
  }

  public object KotlinxSerializer : KSerializer<MarketFeeMultiplier> {
    private val delegator: KSerializer<MarketFeeMultiplier> = MarketFeeMultiplier.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: MarketFeeMultiplier): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(MarketFeeMultiplierConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): MarketFeeMultiplier {
      if (decoder is ProtobufMapperDecoder) {
        return MarketFeeMultiplierConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = DerivativeMarket.KotlinxSerializer::class)
@SerialName(value = DerivativeMarket.TYPE_URL)
public data class DerivativeMarket(
  @ProtobufIndex(index = 1)
  public val ticker: String,
  @ProtobufIndex(index = 2)
  public val oracleBase: String,
  @ProtobufIndex(index = 3)
  public val oracleQuote: String,
  @ProtobufIndex(index = 4)
  public val oracleType: OracleType,
  @ProtobufIndex(index = 5)
  public val oracleScaleFactor: UInt,
  @ProtobufIndex(index = 6)
  public val quoteDenom: String,
  @ProtobufIndex(index = 7)
  public val marketId: String,
  @ProtobufIndex(index = 8)
  public val initialMarginRatio: String,
  @ProtobufIndex(index = 9)
  public val maintenanceMarginRatio: String,
  @ProtobufIndex(index = 10)
  public val makerFeeRate: String,
  @ProtobufIndex(index = 11)
  public val takerFeeRate: String,
  @ProtobufIndex(index = 12)
  public val relayerFeeShareRate: String,
  @ProtobufIndex(index = 13)
  public val isPerpetual: Boolean,
  @ProtobufIndex(index = 14)
  public val status: MarketStatus,
  @ProtobufIndex(index = 15)
  public val minPriceTickSize: String,
  @ProtobufIndex(index = 16)
  public val minQuantityTickSize: String,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/injective.exchange.v1beta1.DerivativeMarket"
  }

  public object KotlinxSerializer : KSerializer<DerivativeMarket> {
    private val delegator: KSerializer<DerivativeMarket> = DerivativeMarket.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: DerivativeMarket): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(DerivativeMarketConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): DerivativeMarket {
      if (decoder is ProtobufMapperDecoder) {
        return DerivativeMarketConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = BinaryOptionsMarket.KotlinxSerializer::class)
@SerialName(value = BinaryOptionsMarket.TYPE_URL)
public data class BinaryOptionsMarket(
  @ProtobufIndex(index = 1)
  public val ticker: String,
  @ProtobufIndex(index = 2)
  public val oracleSymbol: String,
  @ProtobufIndex(index = 3)
  public val oracleProvider: String,
  @ProtobufIndex(index = 4)
  public val oracleType: OracleType,
  @ProtobufIndex(index = 5)
  public val oracleScaleFactor: UInt,
  @ProtobufIndex(index = 6)
  public val expirationTimestamp: Long,
  @ProtobufIndex(index = 7)
  public val settlementTimestamp: Long,
  @ProtobufIndex(index = 8)
  public val admin: String,
  @ProtobufIndex(index = 9)
  public val quoteDenom: String,
  @ProtobufIndex(index = 10)
  public val marketId: String,
  @ProtobufIndex(index = 11)
  public val makerFeeRate: String,
  @ProtobufIndex(index = 12)
  public val takerFeeRate: String,
  @ProtobufIndex(index = 13)
  public val relayerFeeShareRate: String,
  @ProtobufIndex(index = 14)
  public val status: MarketStatus,
  @ProtobufIndex(index = 15)
  public val minPriceTickSize: String,
  @ProtobufIndex(index = 16)
  public val minQuantityTickSize: String,
  @ProtobufIndex(index = 17)
  public val settlementPrice: String,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/injective.exchange.v1beta1.BinaryOptionsMarket"
  }

  public object KotlinxSerializer : KSerializer<BinaryOptionsMarket> {
    private val delegator: KSerializer<BinaryOptionsMarket> = BinaryOptionsMarket.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: BinaryOptionsMarket): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(BinaryOptionsMarketConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): BinaryOptionsMarket {
      if (decoder is ProtobufMapperDecoder) {
        return BinaryOptionsMarketConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = ExpiryFuturesMarketInfo.KotlinxSerializer::class)
@SerialName(value = ExpiryFuturesMarketInfo.TYPE_URL)
public data class ExpiryFuturesMarketInfo(
  @ProtobufIndex(index = 1)
  public val marketId: String,
  @ProtobufIndex(index = 2)
  public val expirationTimestamp: Long,
  @ProtobufIndex(index = 3)
  public val twapStartTimestamp: Long,
  @ProtobufIndex(index = 4)
  public val expirationTwapStartPriceCumulative: String,
  @ProtobufIndex(index = 5)
  public val settlementPrice: String,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/injective.exchange.v1beta1.ExpiryFuturesMarketInfo"
  }

  public object KotlinxSerializer : KSerializer<ExpiryFuturesMarketInfo> {
    private val delegator: KSerializer<ExpiryFuturesMarketInfo> =
        ExpiryFuturesMarketInfo.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: ExpiryFuturesMarketInfo): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(ExpiryFuturesMarketInfoConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): ExpiryFuturesMarketInfo {
      if (decoder is ProtobufMapperDecoder) {
        return ExpiryFuturesMarketInfoConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = PerpetualMarketInfo.KotlinxSerializer::class)
@SerialName(value = PerpetualMarketInfo.TYPE_URL)
public data class PerpetualMarketInfo(
  @ProtobufIndex(index = 1)
  public val marketId: String,
  @ProtobufIndex(index = 2)
  public val hourlyFundingRateCap: String,
  @ProtobufIndex(index = 3)
  public val hourlyInterestRate: String,
  @ProtobufIndex(index = 4)
  public val nextFundingTimestamp: Long,
  @ProtobufIndex(index = 5)
  public val fundingInterval: Long,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/injective.exchange.v1beta1.PerpetualMarketInfo"
  }

  public object KotlinxSerializer : KSerializer<PerpetualMarketInfo> {
    private val delegator: KSerializer<PerpetualMarketInfo> = PerpetualMarketInfo.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: PerpetualMarketInfo): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(PerpetualMarketInfoConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): PerpetualMarketInfo {
      if (decoder is ProtobufMapperDecoder) {
        return PerpetualMarketInfoConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = PerpetualMarketFunding.KotlinxSerializer::class)
@SerialName(value = PerpetualMarketFunding.TYPE_URL)
public data class PerpetualMarketFunding(
  @ProtobufIndex(index = 1)
  public val cumulativeFunding: String,
  @ProtobufIndex(index = 2)
  public val cumulativePrice: String,
  @ProtobufIndex(index = 3)
  public val lastTimestamp: Long,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/injective.exchange.v1beta1.PerpetualMarketFunding"
  }

  public object KotlinxSerializer : KSerializer<PerpetualMarketFunding> {
    private val delegator: KSerializer<PerpetualMarketFunding> = PerpetualMarketFunding.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: PerpetualMarketFunding): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(PerpetualMarketFundingConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): PerpetualMarketFunding {
      if (decoder is ProtobufMapperDecoder) {
        return PerpetualMarketFundingConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = DerivativeMarketSettlementInfo.KotlinxSerializer::class)
@SerialName(value = DerivativeMarketSettlementInfo.TYPE_URL)
public data class DerivativeMarketSettlementInfo(
  @ProtobufIndex(index = 1)
  public val marketId: String,
  @ProtobufIndex(index = 2)
  public val settlementPrice: String,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/injective.exchange.v1beta1.DerivativeMarketSettlementInfo"
  }

  public object KotlinxSerializer : KSerializer<DerivativeMarketSettlementInfo> {
    private val delegator: KSerializer<DerivativeMarketSettlementInfo> =
        DerivativeMarketSettlementInfo.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: DerivativeMarketSettlementInfo): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(DerivativeMarketSettlementInfoConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): DerivativeMarketSettlementInfo {
      if (decoder is ProtobufMapperDecoder) {
        return DerivativeMarketSettlementInfoConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = NextFundingTimestamp.KotlinxSerializer::class)
@SerialName(value = NextFundingTimestamp.TYPE_URL)
public data class NextFundingTimestamp(
  @ProtobufIndex(index = 1)
  public val nextTimestamp: Long,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/injective.exchange.v1beta1.NextFundingTimestamp"
  }

  public object KotlinxSerializer : KSerializer<NextFundingTimestamp> {
    private val delegator: KSerializer<NextFundingTimestamp> = NextFundingTimestamp.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: NextFundingTimestamp): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(NextFundingTimestampConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): NextFundingTimestamp {
      if (decoder is ProtobufMapperDecoder) {
        return NextFundingTimestampConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = MidPriceAndTOB.KotlinxSerializer::class)
@SerialName(value = MidPriceAndTOB.TYPE_URL)
public data class MidPriceAndTOB(
  @ProtobufIndex(index = 1)
  public val midPrice: String,
  @ProtobufIndex(index = 2)
  public val bestBuyPrice: String,
  @ProtobufIndex(index = 3)
  public val bestSellPrice: String,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/injective.exchange.v1beta1.MidPriceAndTOB"
  }

  public object KotlinxSerializer : KSerializer<MidPriceAndTOB> {
    private val delegator: KSerializer<MidPriceAndTOB> = MidPriceAndTOB.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: MidPriceAndTOB): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(MidPriceAndTOBConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): MidPriceAndTOB {
      if (decoder is ProtobufMapperDecoder) {
        return MidPriceAndTOBConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = SpotMarket.KotlinxSerializer::class)
@SerialName(value = SpotMarket.TYPE_URL)
public data class SpotMarket(
  @ProtobufIndex(index = 1)
  public val ticker: String,
  @ProtobufIndex(index = 2)
  public val baseDenom: String,
  @ProtobufIndex(index = 3)
  public val quoteDenom: String,
  @ProtobufIndex(index = 4)
  public val makerFeeRate: String,
  @ProtobufIndex(index = 5)
  public val takerFeeRate: String,
  @ProtobufIndex(index = 6)
  public val relayerFeeShareRate: String,
  @ProtobufIndex(index = 7)
  public val marketId: String,
  @ProtobufIndex(index = 8)
  public val status: MarketStatus,
  @ProtobufIndex(index = 9)
  public val minPriceTickSize: String,
  @ProtobufIndex(index = 10)
  public val minQuantityTickSize: String,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/injective.exchange.v1beta1.SpotMarket"
  }

  public object KotlinxSerializer : KSerializer<SpotMarket> {
    private val delegator: KSerializer<SpotMarket> = SpotMarket.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: SpotMarket): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(SpotMarketConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): SpotMarket {
      if (decoder is ProtobufMapperDecoder) {
        return SpotMarketConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = Deposit.KotlinxSerializer::class)
@SerialName(value = Deposit.TYPE_URL)
public data class Deposit(
  @ProtobufIndex(index = 1)
  public val availableBalance: String,
  @ProtobufIndex(index = 2)
  public val totalBalance: String,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/injective.exchange.v1beta1.Deposit"
  }

  public object KotlinxSerializer : KSerializer<Deposit> {
    private val delegator: KSerializer<Deposit> = Deposit.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: Deposit): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(DepositConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): Deposit {
      if (decoder is ProtobufMapperDecoder) {
        return DepositConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = SubaccountTradeNonce.KotlinxSerializer::class)
@SerialName(value = SubaccountTradeNonce.TYPE_URL)
public data class SubaccountTradeNonce(
  @ProtobufIndex(index = 1)
  public val nonce: UInt,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/injective.exchange.v1beta1.SubaccountTradeNonce"
  }

  public object KotlinxSerializer : KSerializer<SubaccountTradeNonce> {
    private val delegator: KSerializer<SubaccountTradeNonce> = SubaccountTradeNonce.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: SubaccountTradeNonce): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(SubaccountTradeNonceConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): SubaccountTradeNonce {
      if (decoder is ProtobufMapperDecoder) {
        return SubaccountTradeNonceConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = OrderInfo.KotlinxSerializer::class)
@SerialName(value = OrderInfo.TYPE_URL)
public data class OrderInfo(
  @ProtobufIndex(index = 1)
  public val subaccountId: String,
  @ProtobufIndex(index = 2)
  public val feeRecipient: String,
  @ProtobufIndex(index = 3)
  public val price: String,
  @ProtobufIndex(index = 4)
  public val quantity: String,
  @ProtobufIndex(index = 5)
  public val cid: String,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/injective.exchange.v1beta1.OrderInfo"
  }

  public object KotlinxSerializer : KSerializer<OrderInfo> {
    private val delegator: KSerializer<OrderInfo> = OrderInfo.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: OrderInfo): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(OrderInfoConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): OrderInfo {
      if (decoder is ProtobufMapperDecoder) {
        return OrderInfoConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = SpotOrder.KotlinxSerializer::class)
@SerialName(value = SpotOrder.TYPE_URL)
public data class SpotOrder(
  @ProtobufIndex(index = 1)
  public val marketId: String,
  @ProtobufIndex(index = 2)
  public val orderInfo: OrderInfo,
  @ProtobufIndex(index = 3)
  public val orderType: OrderType,
  @ProtobufIndex(index = 4)
  public val triggerPrice: String,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/injective.exchange.v1beta1.SpotOrder"
  }

  public object KotlinxSerializer : KSerializer<SpotOrder> {
    private val delegator: KSerializer<SpotOrder> = SpotOrder.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: SpotOrder): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(SpotOrderConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): SpotOrder {
      if (decoder is ProtobufMapperDecoder) {
        return SpotOrderConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = SpotLimitOrder.KotlinxSerializer::class)
@SerialName(value = SpotLimitOrder.TYPE_URL)
public data class SpotLimitOrder(
  @ProtobufIndex(index = 1)
  public val orderInfo: OrderInfo,
  @ProtobufIndex(index = 2)
  public val orderType: OrderType,
  @ProtobufIndex(index = 3)
  public val fillable: String,
  @ProtobufIndex(index = 4)
  public val triggerPrice: String,
  @ProtobufIndex(index = 5)
  public val orderHash: ByteArray,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/injective.exchange.v1beta1.SpotLimitOrder"
  }

  public object KotlinxSerializer : KSerializer<SpotLimitOrder> {
    private val delegator: KSerializer<SpotLimitOrder> = SpotLimitOrder.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: SpotLimitOrder): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(SpotLimitOrderConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): SpotLimitOrder {
      if (decoder is ProtobufMapperDecoder) {
        return SpotLimitOrderConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = SpotMarketOrder.KotlinxSerializer::class)
@SerialName(value = SpotMarketOrder.TYPE_URL)
public data class SpotMarketOrder(
  @ProtobufIndex(index = 1)
  public val orderInfo: OrderInfo,
  @ProtobufIndex(index = 2)
  public val balanceHold: String,
  @ProtobufIndex(index = 3)
  public val orderHash: ByteArray,
  @ProtobufIndex(index = 4)
  public val orderType: OrderType,
  @ProtobufIndex(index = 5)
  public val triggerPrice: String,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/injective.exchange.v1beta1.SpotMarketOrder"
  }

  public object KotlinxSerializer : KSerializer<SpotMarketOrder> {
    private val delegator: KSerializer<SpotMarketOrder> = SpotMarketOrder.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: SpotMarketOrder): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(SpotMarketOrderConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): SpotMarketOrder {
      if (decoder is ProtobufMapperDecoder) {
        return SpotMarketOrderConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = DerivativeOrder.KotlinxSerializer::class)
@SerialName(value = DerivativeOrder.TYPE_URL)
public data class DerivativeOrder(
  @ProtobufIndex(index = 1)
  public val marketId: String,
  @ProtobufIndex(index = 2)
  public val orderInfo: OrderInfo,
  @ProtobufIndex(index = 3)
  public val orderType: OrderType,
  @ProtobufIndex(index = 4)
  public val margin: String,
  @ProtobufIndex(index = 5)
  public val triggerPrice: String,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/injective.exchange.v1beta1.DerivativeOrder"
  }

  public object KotlinxSerializer : KSerializer<DerivativeOrder> {
    private val delegator: KSerializer<DerivativeOrder> = DerivativeOrder.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: DerivativeOrder): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(DerivativeOrderConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): DerivativeOrder {
      if (decoder is ProtobufMapperDecoder) {
        return DerivativeOrderConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = SubaccountOrderbookMetadata.KotlinxSerializer::class)
@SerialName(value = SubaccountOrderbookMetadata.TYPE_URL)
public data class SubaccountOrderbookMetadata(
  @ProtobufIndex(index = 1)
  public val vanillaLimitOrderCount: UInt,
  @ProtobufIndex(index = 2)
  public val reduceOnlyLimitOrderCount: UInt,
  @ProtobufIndex(index = 3)
  public val aggregateReduceOnlyQuantity: String,
  @ProtobufIndex(index = 4)
  public val aggregateVanillaQuantity: String,
  @ProtobufIndex(index = 5)
  public val vanillaConditionalOrderCount: UInt,
  @ProtobufIndex(index = 6)
  public val reduceOnlyConditionalOrderCount: UInt,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/injective.exchange.v1beta1.SubaccountOrderbookMetadata"
  }

  public object KotlinxSerializer : KSerializer<SubaccountOrderbookMetadata> {
    private val delegator: KSerializer<SubaccountOrderbookMetadata> =
        SubaccountOrderbookMetadata.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: SubaccountOrderbookMetadata): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(SubaccountOrderbookMetadataConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): SubaccountOrderbookMetadata {
      if (decoder is ProtobufMapperDecoder) {
        return SubaccountOrderbookMetadataConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = SubaccountOrder.KotlinxSerializer::class)
@SerialName(value = SubaccountOrder.TYPE_URL)
public data class SubaccountOrder(
  @ProtobufIndex(index = 1)
  public val price: String,
  @ProtobufIndex(index = 2)
  public val quantity: String,
  @ProtobufIndex(index = 3)
  public val isReduceOnly: Boolean,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/injective.exchange.v1beta1.SubaccountOrder"
  }

  public object KotlinxSerializer : KSerializer<SubaccountOrder> {
    private val delegator: KSerializer<SubaccountOrder> = SubaccountOrder.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: SubaccountOrder): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(SubaccountOrderConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): SubaccountOrder {
      if (decoder is ProtobufMapperDecoder) {
        return SubaccountOrderConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = SubaccountOrderData.KotlinxSerializer::class)
@SerialName(value = SubaccountOrderData.TYPE_URL)
public data class SubaccountOrderData(
  @ProtobufIndex(index = 1)
  public val order: SubaccountOrder,
  @ProtobufIndex(index = 2)
  public val orderHash: ByteArray,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/injective.exchange.v1beta1.SubaccountOrderData"
  }

  public object KotlinxSerializer : KSerializer<SubaccountOrderData> {
    private val delegator: KSerializer<SubaccountOrderData> = SubaccountOrderData.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: SubaccountOrderData): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(SubaccountOrderDataConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): SubaccountOrderData {
      if (decoder is ProtobufMapperDecoder) {
        return SubaccountOrderDataConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = DerivativeLimitOrder.KotlinxSerializer::class)
@SerialName(value = DerivativeLimitOrder.TYPE_URL)
public data class DerivativeLimitOrder(
  @ProtobufIndex(index = 1)
  public val orderInfo: OrderInfo,
  @ProtobufIndex(index = 2)
  public val orderType: OrderType,
  @ProtobufIndex(index = 3)
  public val margin: String,
  @ProtobufIndex(index = 4)
  public val fillable: String,
  @ProtobufIndex(index = 5)
  public val triggerPrice: String,
  @ProtobufIndex(index = 6)
  public val orderHash: ByteArray,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/injective.exchange.v1beta1.DerivativeLimitOrder"
  }

  public object KotlinxSerializer : KSerializer<DerivativeLimitOrder> {
    private val delegator: KSerializer<DerivativeLimitOrder> = DerivativeLimitOrder.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: DerivativeLimitOrder): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(DerivativeLimitOrderConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): DerivativeLimitOrder {
      if (decoder is ProtobufMapperDecoder) {
        return DerivativeLimitOrderConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = DerivativeMarketOrder.KotlinxSerializer::class)
@SerialName(value = DerivativeMarketOrder.TYPE_URL)
public data class DerivativeMarketOrder(
  @ProtobufIndex(index = 1)
  public val orderInfo: OrderInfo,
  @ProtobufIndex(index = 2)
  public val orderType: OrderType,
  @ProtobufIndex(index = 3)
  public val margin: String,
  @ProtobufIndex(index = 4)
  public val marginHold: String,
  @ProtobufIndex(index = 5)
  public val triggerPrice: String,
  @ProtobufIndex(index = 6)
  public val orderHash: ByteArray,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/injective.exchange.v1beta1.DerivativeMarketOrder"
  }

  public object KotlinxSerializer : KSerializer<DerivativeMarketOrder> {
    private val delegator: KSerializer<DerivativeMarketOrder> = DerivativeMarketOrder.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: DerivativeMarketOrder): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(DerivativeMarketOrderConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): DerivativeMarketOrder {
      if (decoder is ProtobufMapperDecoder) {
        return DerivativeMarketOrderConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = Position.KotlinxSerializer::class)
@SerialName(value = Position.TYPE_URL)
public data class Position(
  @ProtobufIndex(index = 1)
  public val isLong: Boolean,
  @ProtobufIndex(index = 2)
  public val quantity: String,
  @ProtobufIndex(index = 3)
  public val entryPrice: String,
  @ProtobufIndex(index = 4)
  public val margin: String,
  @ProtobufIndex(index = 5)
  public val cumulativeFundingEntry: String,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/injective.exchange.v1beta1.Position"
  }

  public object KotlinxSerializer : KSerializer<Position> {
    private val delegator: KSerializer<Position> = Position.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: Position): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(PositionConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): Position {
      if (decoder is ProtobufMapperDecoder) {
        return PositionConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = MarketOrderIndicator.KotlinxSerializer::class)
@SerialName(value = MarketOrderIndicator.TYPE_URL)
public data class MarketOrderIndicator(
  @ProtobufIndex(index = 1)
  public val marketId: String,
  @ProtobufIndex(index = 2)
  public val isBuy: Boolean,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/injective.exchange.v1beta1.MarketOrderIndicator"
  }

  public object KotlinxSerializer : KSerializer<MarketOrderIndicator> {
    private val delegator: KSerializer<MarketOrderIndicator> = MarketOrderIndicator.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: MarketOrderIndicator): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(MarketOrderIndicatorConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): MarketOrderIndicator {
      if (decoder is ProtobufMapperDecoder) {
        return MarketOrderIndicatorConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = TradeLog.KotlinxSerializer::class)
@SerialName(value = TradeLog.TYPE_URL)
public data class TradeLog(
  @ProtobufIndex(index = 1)
  public val quantity: String,
  @ProtobufIndex(index = 2)
  public val price: String,
  @ProtobufIndex(index = 3)
  public val subaccountId: ByteArray,
  @ProtobufIndex(index = 4)
  public val fee: String,
  @ProtobufIndex(index = 5)
  public val orderHash: ByteArray,
  @ProtobufIndex(index = 6)
  public val feeRecipientAddress: ByteArray,
  @ProtobufIndex(index = 7)
  public val cid: String,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/injective.exchange.v1beta1.TradeLog"
  }

  public object KotlinxSerializer : KSerializer<TradeLog> {
    private val delegator: KSerializer<TradeLog> = TradeLog.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: TradeLog): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(TradeLogConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): TradeLog {
      if (decoder is ProtobufMapperDecoder) {
        return TradeLogConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = PositionDelta.KotlinxSerializer::class)
@SerialName(value = PositionDelta.TYPE_URL)
public data class PositionDelta(
  @ProtobufIndex(index = 1)
  public val isLong: Boolean,
  @ProtobufIndex(index = 2)
  public val executionQuantity: String,
  @ProtobufIndex(index = 3)
  public val executionMargin: String,
  @ProtobufIndex(index = 4)
  public val executionPrice: String,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/injective.exchange.v1beta1.PositionDelta"
  }

  public object KotlinxSerializer : KSerializer<PositionDelta> {
    private val delegator: KSerializer<PositionDelta> = PositionDelta.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: PositionDelta): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(PositionDeltaConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): PositionDelta {
      if (decoder is ProtobufMapperDecoder) {
        return PositionDeltaConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = DerivativeTradeLog.KotlinxSerializer::class)
@SerialName(value = DerivativeTradeLog.TYPE_URL)
public data class DerivativeTradeLog(
  @ProtobufIndex(index = 1)
  public val subaccountId: ByteArray,
  @ProtobufIndex(index = 2)
  public val positionDelta: PositionDelta,
  @ProtobufIndex(index = 3)
  public val payout: String,
  @ProtobufIndex(index = 4)
  public val fee: String,
  @ProtobufIndex(index = 5)
  public val orderHash: ByteArray,
  @ProtobufIndex(index = 6)
  public val feeRecipientAddress: ByteArray,
  @ProtobufIndex(index = 7)
  public val cid: String,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/injective.exchange.v1beta1.DerivativeTradeLog"
  }

  public object KotlinxSerializer : KSerializer<DerivativeTradeLog> {
    private val delegator: KSerializer<DerivativeTradeLog> = DerivativeTradeLog.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: DerivativeTradeLog): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(DerivativeTradeLogConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): DerivativeTradeLog {
      if (decoder is ProtobufMapperDecoder) {
        return DerivativeTradeLogConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = SubaccountPosition.KotlinxSerializer::class)
@SerialName(value = SubaccountPosition.TYPE_URL)
public data class SubaccountPosition(
  @ProtobufIndex(index = 1)
  public val position: Position,
  @ProtobufIndex(index = 2)
  public val subaccountId: ByteArray,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/injective.exchange.v1beta1.SubaccountPosition"
  }

  public object KotlinxSerializer : KSerializer<SubaccountPosition> {
    private val delegator: KSerializer<SubaccountPosition> = SubaccountPosition.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: SubaccountPosition): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(SubaccountPositionConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): SubaccountPosition {
      if (decoder is ProtobufMapperDecoder) {
        return SubaccountPositionConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = SubaccountDeposit.KotlinxSerializer::class)
@SerialName(value = SubaccountDeposit.TYPE_URL)
public data class SubaccountDeposit(
  @ProtobufIndex(index = 1)
  public val subaccountId: ByteArray,
  @ProtobufIndex(index = 2)
  public val deposit: Deposit,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/injective.exchange.v1beta1.SubaccountDeposit"
  }

  public object KotlinxSerializer : KSerializer<SubaccountDeposit> {
    private val delegator: KSerializer<SubaccountDeposit> = SubaccountDeposit.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: SubaccountDeposit): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(SubaccountDepositConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): SubaccountDeposit {
      if (decoder is ProtobufMapperDecoder) {
        return SubaccountDepositConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = DepositUpdate.KotlinxSerializer::class)
@SerialName(value = DepositUpdate.TYPE_URL)
public data class DepositUpdate(
  @ProtobufIndex(index = 1)
  public val denom: String,
  @ProtobufIndex(index = 2)
  public val deposits: List<SubaccountDeposit>,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/injective.exchange.v1beta1.DepositUpdate"
  }

  public object KotlinxSerializer : KSerializer<DepositUpdate> {
    private val delegator: KSerializer<DepositUpdate> = DepositUpdate.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: DepositUpdate): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(DepositUpdateConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): DepositUpdate {
      if (decoder is ProtobufMapperDecoder) {
        return DepositUpdateConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = PointsMultiplier.KotlinxSerializer::class)
@SerialName(value = PointsMultiplier.TYPE_URL)
public data class PointsMultiplier(
  @ProtobufIndex(index = 1)
  public val makerPointsMultiplier: String,
  @ProtobufIndex(index = 2)
  public val takerPointsMultiplier: String,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/injective.exchange.v1beta1.PointsMultiplier"
  }

  public object KotlinxSerializer : KSerializer<PointsMultiplier> {
    private val delegator: KSerializer<PointsMultiplier> = PointsMultiplier.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: PointsMultiplier): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(PointsMultiplierConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): PointsMultiplier {
      if (decoder is ProtobufMapperDecoder) {
        return PointsMultiplierConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = TradingRewardCampaignBoostInfo.KotlinxSerializer::class)
@SerialName(value = TradingRewardCampaignBoostInfo.TYPE_URL)
public data class TradingRewardCampaignBoostInfo(
  @ProtobufIndex(index = 1)
  public val boostedSpotMarketIds: List<String>,
  @ProtobufIndex(index = 2)
  public val spotMarketMultipliers: List<PointsMultiplier>,
  @ProtobufIndex(index = 3)
  public val boostedDerivativeMarketIds: List<String>,
  @ProtobufIndex(index = 4)
  public val derivativeMarketMultipliers: List<PointsMultiplier>,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/injective.exchange.v1beta1.TradingRewardCampaignBoostInfo"
  }

  public object KotlinxSerializer : KSerializer<TradingRewardCampaignBoostInfo> {
    private val delegator: KSerializer<TradingRewardCampaignBoostInfo> =
        TradingRewardCampaignBoostInfo.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: TradingRewardCampaignBoostInfo): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(TradingRewardCampaignBoostInfoConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): TradingRewardCampaignBoostInfo {
      if (decoder is ProtobufMapperDecoder) {
        return TradingRewardCampaignBoostInfoConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = CampaignRewardPool.KotlinxSerializer::class)
@SerialName(value = CampaignRewardPool.TYPE_URL)
public data class CampaignRewardPool(
  @ProtobufIndex(index = 1)
  public val startTimestamp: Long,
  @ProtobufIndex(index = 2)
  public val maxCampaignRewards: List<Coin>,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/injective.exchange.v1beta1.CampaignRewardPool"
  }

  public object KotlinxSerializer : KSerializer<CampaignRewardPool> {
    private val delegator: KSerializer<CampaignRewardPool> = CampaignRewardPool.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: CampaignRewardPool): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(CampaignRewardPoolConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): CampaignRewardPool {
      if (decoder is ProtobufMapperDecoder) {
        return CampaignRewardPoolConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = TradingRewardCampaignInfo.KotlinxSerializer::class)
@SerialName(value = TradingRewardCampaignInfo.TYPE_URL)
public data class TradingRewardCampaignInfo(
  @ProtobufIndex(index = 1)
  public val campaignDurationSeconds: Long,
  @ProtobufIndex(index = 2)
  public val quoteDenoms: List<String>,
  @ProtobufIndex(index = 3)
  public val tradingRewardBoostInfo: TradingRewardCampaignBoostInfo,
  @ProtobufIndex(index = 4)
  public val disqualifiedMarketIds: List<String>,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/injective.exchange.v1beta1.TradingRewardCampaignInfo"
  }

  public object KotlinxSerializer : KSerializer<TradingRewardCampaignInfo> {
    private val delegator: KSerializer<TradingRewardCampaignInfo> =
        TradingRewardCampaignInfo.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: TradingRewardCampaignInfo): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(TradingRewardCampaignInfoConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): TradingRewardCampaignInfo {
      if (decoder is ProtobufMapperDecoder) {
        return TradingRewardCampaignInfoConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = FeeDiscountTierInfo.KotlinxSerializer::class)
@SerialName(value = FeeDiscountTierInfo.TYPE_URL)
public data class FeeDiscountTierInfo(
  @ProtobufIndex(index = 1)
  public val makerDiscountRate: String,
  @ProtobufIndex(index = 2)
  public val takerDiscountRate: String,
  @ProtobufIndex(index = 3)
  public val stakedAmount: String,
  @ProtobufIndex(index = 4)
  public val volume: String,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/injective.exchange.v1beta1.FeeDiscountTierInfo"
  }

  public object KotlinxSerializer : KSerializer<FeeDiscountTierInfo> {
    private val delegator: KSerializer<FeeDiscountTierInfo> = FeeDiscountTierInfo.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: FeeDiscountTierInfo): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(FeeDiscountTierInfoConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): FeeDiscountTierInfo {
      if (decoder is ProtobufMapperDecoder) {
        return FeeDiscountTierInfoConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = FeeDiscountSchedule.KotlinxSerializer::class)
@SerialName(value = FeeDiscountSchedule.TYPE_URL)
public data class FeeDiscountSchedule(
  @ProtobufIndex(index = 1)
  public val bucketCount: ULong,
  @ProtobufIndex(index = 2)
  public val bucketDuration: Long,
  @ProtobufIndex(index = 3)
  public val quoteDenoms: List<String>,
  @ProtobufIndex(index = 4)
  public val tierInfos: List<FeeDiscountTierInfo>,
  @ProtobufIndex(index = 5)
  public val disqualifiedMarketIds: List<String>,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/injective.exchange.v1beta1.FeeDiscountSchedule"
  }

  public object KotlinxSerializer : KSerializer<FeeDiscountSchedule> {
    private val delegator: KSerializer<FeeDiscountSchedule> = FeeDiscountSchedule.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: FeeDiscountSchedule): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(FeeDiscountScheduleConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): FeeDiscountSchedule {
      if (decoder is ProtobufMapperDecoder) {
        return FeeDiscountScheduleConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = FeeDiscountTierTTL.KotlinxSerializer::class)
@SerialName(value = FeeDiscountTierTTL.TYPE_URL)
public data class FeeDiscountTierTTL(
  @ProtobufIndex(index = 1)
  public val tier: ULong,
  @ProtobufIndex(index = 2)
  public val ttlTimestamp: Long,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/injective.exchange.v1beta1.FeeDiscountTierTTL"
  }

  public object KotlinxSerializer : KSerializer<FeeDiscountTierTTL> {
    private val delegator: KSerializer<FeeDiscountTierTTL> = FeeDiscountTierTTL.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: FeeDiscountTierTTL): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(FeeDiscountTierTTLConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): FeeDiscountTierTTL {
      if (decoder is ProtobufMapperDecoder) {
        return FeeDiscountTierTTLConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = VolumeRecord.KotlinxSerializer::class)
@SerialName(value = VolumeRecord.TYPE_URL)
public data class VolumeRecord(
  @ProtobufIndex(index = 1)
  public val makerVolume: String,
  @ProtobufIndex(index = 2)
  public val takerVolume: String,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/injective.exchange.v1beta1.VolumeRecord"
  }

  public object KotlinxSerializer : KSerializer<VolumeRecord> {
    private val delegator: KSerializer<VolumeRecord> = VolumeRecord.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: VolumeRecord): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(VolumeRecordConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): VolumeRecord {
      if (decoder is ProtobufMapperDecoder) {
        return VolumeRecordConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = AccountRewards.KotlinxSerializer::class)
@SerialName(value = AccountRewards.TYPE_URL)
public data class AccountRewards(
  @ProtobufIndex(index = 1)
  public val account: String,
  @ProtobufIndex(index = 2)
  public val rewards: List<Coin>,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/injective.exchange.v1beta1.AccountRewards"
  }

  public object KotlinxSerializer : KSerializer<AccountRewards> {
    private val delegator: KSerializer<AccountRewards> = AccountRewards.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: AccountRewards): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(AccountRewardsConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): AccountRewards {
      if (decoder is ProtobufMapperDecoder) {
        return AccountRewardsConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = TradeRecords.KotlinxSerializer::class)
@SerialName(value = TradeRecords.TYPE_URL)
public data class TradeRecords(
  @ProtobufIndex(index = 1)
  public val marketId: String,
  @ProtobufIndex(index = 2)
  public val latestTradeRecords: List<TradeRecord>,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/injective.exchange.v1beta1.TradeRecords"
  }

  public object KotlinxSerializer : KSerializer<TradeRecords> {
    private val delegator: KSerializer<TradeRecords> = TradeRecords.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: TradeRecords): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(TradeRecordsConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): TradeRecords {
      if (decoder is ProtobufMapperDecoder) {
        return TradeRecordsConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = SubaccountIDs.KotlinxSerializer::class)
@SerialName(value = SubaccountIDs.TYPE_URL)
public data class SubaccountIDs(
  @ProtobufIndex(index = 1)
  public val subaccountIds: List<ByteArray>,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/injective.exchange.v1beta1.SubaccountIDs"
  }

  public object KotlinxSerializer : KSerializer<SubaccountIDs> {
    private val delegator: KSerializer<SubaccountIDs> = SubaccountIDs.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: SubaccountIDs): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(SubaccountIDsConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): SubaccountIDs {
      if (decoder is ProtobufMapperDecoder) {
        return SubaccountIDsConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = TradeRecord.KotlinxSerializer::class)
@SerialName(value = TradeRecord.TYPE_URL)
public data class TradeRecord(
  @ProtobufIndex(index = 1)
  public val timestamp: Long,
  @ProtobufIndex(index = 2)
  public val price: String,
  @ProtobufIndex(index = 3)
  public val quantity: String,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/injective.exchange.v1beta1.TradeRecord"
  }

  public object KotlinxSerializer : KSerializer<TradeRecord> {
    private val delegator: KSerializer<TradeRecord> = TradeRecord.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: TradeRecord): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(TradeRecordConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): TradeRecord {
      if (decoder is ProtobufMapperDecoder) {
        return TradeRecordConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = Level.KotlinxSerializer::class)
@SerialName(value = Level.TYPE_URL)
public data class Level(
  @ProtobufIndex(index = 1)
  public val p: String,
  @ProtobufIndex(index = 2)
  public val q: String,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/injective.exchange.v1beta1.Level"
  }

  public object KotlinxSerializer : KSerializer<Level> {
    private val delegator: KSerializer<Level> = Level.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: Level): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(LevelConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): Level {
      if (decoder is ProtobufMapperDecoder) {
        return LevelConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = AggregateSubaccountVolumeRecord.KotlinxSerializer::class)
@SerialName(value = AggregateSubaccountVolumeRecord.TYPE_URL)
public data class AggregateSubaccountVolumeRecord(
  @ProtobufIndex(index = 1)
  public val subaccountId: String,
  @ProtobufIndex(index = 2)
  public val marketVolumes: List<MarketVolume>,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String =
        "/injective.exchange.v1beta1.AggregateSubaccountVolumeRecord"
  }

  public object KotlinxSerializer : KSerializer<AggregateSubaccountVolumeRecord> {
    private val delegator: KSerializer<AggregateSubaccountVolumeRecord> =
        AggregateSubaccountVolumeRecord.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: AggregateSubaccountVolumeRecord):
        Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(AggregateSubaccountVolumeRecordConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): AggregateSubaccountVolumeRecord {
      if (decoder is ProtobufMapperDecoder) {
        return AggregateSubaccountVolumeRecordConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = AggregateAccountVolumeRecord.KotlinxSerializer::class)
@SerialName(value = AggregateAccountVolumeRecord.TYPE_URL)
public data class AggregateAccountVolumeRecord(
  @ProtobufIndex(index = 1)
  public val account: String,
  @ProtobufIndex(index = 2)
  public val marketVolumes: List<MarketVolume>,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/injective.exchange.v1beta1.AggregateAccountVolumeRecord"
  }

  public object KotlinxSerializer : KSerializer<AggregateAccountVolumeRecord> {
    private val delegator: KSerializer<AggregateAccountVolumeRecord> =
        AggregateAccountVolumeRecord.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: AggregateAccountVolumeRecord): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(AggregateAccountVolumeRecordConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): AggregateAccountVolumeRecord {
      if (decoder is ProtobufMapperDecoder) {
        return AggregateAccountVolumeRecordConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = MarketVolume.KotlinxSerializer::class)
@SerialName(value = MarketVolume.TYPE_URL)
public data class MarketVolume(
  @ProtobufIndex(index = 1)
  public val marketId: String,
  @ProtobufIndex(index = 2)
  public val volume: VolumeRecord,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/injective.exchange.v1beta1.MarketVolume"
  }

  public object KotlinxSerializer : KSerializer<MarketVolume> {
    private val delegator: KSerializer<MarketVolume> = MarketVolume.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: MarketVolume): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(MarketVolumeConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): MarketVolume {
      if (decoder is ProtobufMapperDecoder) {
        return MarketVolumeConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = DenomDecimals.KotlinxSerializer::class)
@SerialName(value = DenomDecimals.TYPE_URL)
public data class DenomDecimals(
  @ProtobufIndex(index = 1)
  public val denom: String,
  @ProtobufIndex(index = 2)
  public val decimals: ULong,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/injective.exchange.v1beta1.DenomDecimals"
  }

  public object KotlinxSerializer : KSerializer<DenomDecimals> {
    private val delegator: KSerializer<DenomDecimals> = DenomDecimals.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: DenomDecimals): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(DenomDecimalsConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): DenomDecimals {
      if (decoder is ProtobufMapperDecoder) {
        return DenomDecimalsConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}
