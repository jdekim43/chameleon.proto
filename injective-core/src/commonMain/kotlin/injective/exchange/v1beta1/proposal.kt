// Transform from injective/exchange/v1beta1/proposal.proto
@file:ProtobufSyntax(syntax = "PROTO3")
@file:GeneratorVersion(version = "0.3.1")

package injective.exchange.v1beta1

import cosmos.distribution.v1beta1.CommunityPoolSpendProposal
import injective.oracle.v1beta1.OracleType
import kotlin.Int
import kotlin.Long
import kotlin.String
import kotlin.UInt
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
@SerialName(value = "/injective.exchange.v1beta1.ExchangeType")
public enum class ExchangeType(
  public val number: Int,
) {
  @ProtobufIndex(index = 0)
  EXCHANGE_UNSPECIFIED(0),
  @ProtobufIndex(index = 1)
  SPOT(1),
  @ProtobufIndex(index = 2)
  DERIVATIVES(2),
  ;

  public companion object {
    public fun forNumber(number: Int): ExchangeType = ExchangeType.values()
    	.first { it.number == number }
  }
}

@Serializable(with = SpotMarketParamUpdateProposal.KotlinxSerializer::class)
@SerialName(value = SpotMarketParamUpdateProposal.TYPE_URL)
public data class SpotMarketParamUpdateProposal(
  @ProtobufIndex(index = 1)
  public val title: String,
  @ProtobufIndex(index = 2)
  public val description: String,
  @ProtobufIndex(index = 3)
  public val marketId: String,
  @ProtobufIndex(index = 4)
  public val makerFeeRate: String,
  @ProtobufIndex(index = 5)
  public val takerFeeRate: String,
  @ProtobufIndex(index = 6)
  public val relayerFeeShareRate: String,
  @ProtobufIndex(index = 7)
  public val minPriceTickSize: String,
  @ProtobufIndex(index = 8)
  public val minQuantityTickSize: String,
  @ProtobufIndex(index = 9)
  public val status: MarketStatus,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/injective.exchange.v1beta1.SpotMarketParamUpdateProposal"
  }

  public object KotlinxSerializer : KSerializer<SpotMarketParamUpdateProposal> {
    private val delegator: KSerializer<SpotMarketParamUpdateProposal> =
        SpotMarketParamUpdateProposal.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: SpotMarketParamUpdateProposal): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(SpotMarketParamUpdateProposalConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): SpotMarketParamUpdateProposal {
      if (decoder is ProtobufMapperDecoder) {
        return SpotMarketParamUpdateProposalConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = ExchangeEnableProposal.KotlinxSerializer::class)
@SerialName(value = ExchangeEnableProposal.TYPE_URL)
public data class ExchangeEnableProposal(
  @ProtobufIndex(index = 1)
  public val title: String,
  @ProtobufIndex(index = 2)
  public val description: String,
  @ProtobufIndex(index = 3)
  public val exchangeType: ExchangeType,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/injective.exchange.v1beta1.ExchangeEnableProposal"
  }

  public object KotlinxSerializer : KSerializer<ExchangeEnableProposal> {
    private val delegator: KSerializer<ExchangeEnableProposal> = ExchangeEnableProposal.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: ExchangeEnableProposal): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(ExchangeEnableProposalConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): ExchangeEnableProposal {
      if (decoder is ProtobufMapperDecoder) {
        return ExchangeEnableProposalConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = BatchExchangeModificationProposal.KotlinxSerializer::class)
@SerialName(value = BatchExchangeModificationProposal.TYPE_URL)
public data class BatchExchangeModificationProposal(
  @ProtobufIndex(index = 1)
  public val title: String,
  @ProtobufIndex(index = 2)
  public val description: String,
  @ProtobufIndex(index = 3)
  public val spotMarketParamUpdateProposals: List<SpotMarketParamUpdateProposal>,
  @ProtobufIndex(index = 4)
  public val derivativeMarketParamUpdateProposals: List<DerivativeMarketParamUpdateProposal>,
  @ProtobufIndex(index = 5)
  public val spotMarketLaunchProposals: List<SpotMarketLaunchProposal>,
  @ProtobufIndex(index = 6)
  public val perpetualMarketLaunchProposals: List<PerpetualMarketLaunchProposal>,
  @ProtobufIndex(index = 7)
  public val expiryFuturesMarketLaunchProposals: List<ExpiryFuturesMarketLaunchProposal>,
  @ProtobufIndex(index = 8)
  public val tradingRewardCampaignUpdateProposal: TradingRewardCampaignUpdateProposal,
  @ProtobufIndex(index = 9)
  public val binaryOptionsMarketLaunchProposals: List<BinaryOptionsMarketLaunchProposal>,
  @ProtobufIndex(index = 10)
  public val binaryOptionsParamUpdateProposals: List<BinaryOptionsMarketParamUpdateProposal>,
  @ProtobufIndex(index = 11)
  public val denomDecimalsUpdateProposal: UpdateDenomDecimalsProposal,
  @ProtobufIndex(index = 12)
  public val feeDiscountProposal: FeeDiscountProposal,
  @ProtobufIndex(index = 13)
  public val marketForcedSettlementProposals: List<MarketForcedSettlementProposal>,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String =
        "/injective.exchange.v1beta1.BatchExchangeModificationProposal"
  }

  public object KotlinxSerializer : KSerializer<BatchExchangeModificationProposal> {
    private val delegator: KSerializer<BatchExchangeModificationProposal> =
        BatchExchangeModificationProposal.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: BatchExchangeModificationProposal):
        Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(BatchExchangeModificationProposalConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): BatchExchangeModificationProposal {
      if (decoder is ProtobufMapperDecoder) {
        return BatchExchangeModificationProposalConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = SpotMarketLaunchProposal.KotlinxSerializer::class)
@SerialName(value = SpotMarketLaunchProposal.TYPE_URL)
public data class SpotMarketLaunchProposal(
  @ProtobufIndex(index = 1)
  public val title: String,
  @ProtobufIndex(index = 2)
  public val description: String,
  @ProtobufIndex(index = 3)
  public val ticker: String,
  @ProtobufIndex(index = 4)
  public val baseDenom: String,
  @ProtobufIndex(index = 5)
  public val quoteDenom: String,
  @ProtobufIndex(index = 6)
  public val minPriceTickSize: String,
  @ProtobufIndex(index = 7)
  public val minQuantityTickSize: String,
  @ProtobufIndex(index = 8)
  public val makerFeeRate: String,
  @ProtobufIndex(index = 9)
  public val takerFeeRate: String,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/injective.exchange.v1beta1.SpotMarketLaunchProposal"
  }

  public object KotlinxSerializer : KSerializer<SpotMarketLaunchProposal> {
    private val delegator: KSerializer<SpotMarketLaunchProposal> =
        SpotMarketLaunchProposal.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: SpotMarketLaunchProposal): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(SpotMarketLaunchProposalConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): SpotMarketLaunchProposal {
      if (decoder is ProtobufMapperDecoder) {
        return SpotMarketLaunchProposalConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = PerpetualMarketLaunchProposal.KotlinxSerializer::class)
@SerialName(value = PerpetualMarketLaunchProposal.TYPE_URL)
public data class PerpetualMarketLaunchProposal(
  @ProtobufIndex(index = 1)
  public val title: String,
  @ProtobufIndex(index = 2)
  public val description: String,
  @ProtobufIndex(index = 3)
  public val ticker: String,
  @ProtobufIndex(index = 4)
  public val quoteDenom: String,
  @ProtobufIndex(index = 5)
  public val oracleBase: String,
  @ProtobufIndex(index = 6)
  public val oracleQuote: String,
  @ProtobufIndex(index = 7)
  public val oracleScaleFactor: UInt,
  @ProtobufIndex(index = 8)
  public val oracleType: OracleType,
  @ProtobufIndex(index = 9)
  public val initialMarginRatio: String,
  @ProtobufIndex(index = 10)
  public val maintenanceMarginRatio: String,
  @ProtobufIndex(index = 11)
  public val makerFeeRate: String,
  @ProtobufIndex(index = 12)
  public val takerFeeRate: String,
  @ProtobufIndex(index = 13)
  public val minPriceTickSize: String,
  @ProtobufIndex(index = 14)
  public val minQuantityTickSize: String,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/injective.exchange.v1beta1.PerpetualMarketLaunchProposal"
  }

  public object KotlinxSerializer : KSerializer<PerpetualMarketLaunchProposal> {
    private val delegator: KSerializer<PerpetualMarketLaunchProposal> =
        PerpetualMarketLaunchProposal.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: PerpetualMarketLaunchProposal): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(PerpetualMarketLaunchProposalConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): PerpetualMarketLaunchProposal {
      if (decoder is ProtobufMapperDecoder) {
        return PerpetualMarketLaunchProposalConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = BinaryOptionsMarketLaunchProposal.KotlinxSerializer::class)
@SerialName(value = BinaryOptionsMarketLaunchProposal.TYPE_URL)
public data class BinaryOptionsMarketLaunchProposal(
  @ProtobufIndex(index = 1)
  public val title: String,
  @ProtobufIndex(index = 2)
  public val description: String,
  @ProtobufIndex(index = 3)
  public val ticker: String,
  @ProtobufIndex(index = 4)
  public val oracleSymbol: String,
  @ProtobufIndex(index = 5)
  public val oracleProvider: String,
  @ProtobufIndex(index = 6)
  public val oracleType: OracleType,
  @ProtobufIndex(index = 7)
  public val oracleScaleFactor: UInt,
  @ProtobufIndex(index = 8)
  public val expirationTimestamp: Long,
  @ProtobufIndex(index = 9)
  public val settlementTimestamp: Long,
  @ProtobufIndex(index = 10)
  public val admin: String,
  @ProtobufIndex(index = 11)
  public val quoteDenom: String,
  @ProtobufIndex(index = 12)
  public val makerFeeRate: String,
  @ProtobufIndex(index = 13)
  public val takerFeeRate: String,
  @ProtobufIndex(index = 14)
  public val minPriceTickSize: String,
  @ProtobufIndex(index = 15)
  public val minQuantityTickSize: String,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String =
        "/injective.exchange.v1beta1.BinaryOptionsMarketLaunchProposal"
  }

  public object KotlinxSerializer : KSerializer<BinaryOptionsMarketLaunchProposal> {
    private val delegator: KSerializer<BinaryOptionsMarketLaunchProposal> =
        BinaryOptionsMarketLaunchProposal.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: BinaryOptionsMarketLaunchProposal):
        Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(BinaryOptionsMarketLaunchProposalConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): BinaryOptionsMarketLaunchProposal {
      if (decoder is ProtobufMapperDecoder) {
        return BinaryOptionsMarketLaunchProposalConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = ExpiryFuturesMarketLaunchProposal.KotlinxSerializer::class)
@SerialName(value = ExpiryFuturesMarketLaunchProposal.TYPE_URL)
public data class ExpiryFuturesMarketLaunchProposal(
  @ProtobufIndex(index = 1)
  public val title: String,
  @ProtobufIndex(index = 2)
  public val description: String,
  @ProtobufIndex(index = 3)
  public val ticker: String,
  @ProtobufIndex(index = 4)
  public val quoteDenom: String,
  @ProtobufIndex(index = 5)
  public val oracleBase: String,
  @ProtobufIndex(index = 6)
  public val oracleQuote: String,
  @ProtobufIndex(index = 7)
  public val oracleScaleFactor: UInt,
  @ProtobufIndex(index = 8)
  public val oracleType: OracleType,
  @ProtobufIndex(index = 9)
  public val expiry: Long,
  @ProtobufIndex(index = 10)
  public val initialMarginRatio: String,
  @ProtobufIndex(index = 11)
  public val maintenanceMarginRatio: String,
  @ProtobufIndex(index = 12)
  public val makerFeeRate: String,
  @ProtobufIndex(index = 13)
  public val takerFeeRate: String,
  @ProtobufIndex(index = 14)
  public val minPriceTickSize: String,
  @ProtobufIndex(index = 15)
  public val minQuantityTickSize: String,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String =
        "/injective.exchange.v1beta1.ExpiryFuturesMarketLaunchProposal"
  }

  public object KotlinxSerializer : KSerializer<ExpiryFuturesMarketLaunchProposal> {
    private val delegator: KSerializer<ExpiryFuturesMarketLaunchProposal> =
        ExpiryFuturesMarketLaunchProposal.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: ExpiryFuturesMarketLaunchProposal):
        Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(ExpiryFuturesMarketLaunchProposalConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): ExpiryFuturesMarketLaunchProposal {
      if (decoder is ProtobufMapperDecoder) {
        return ExpiryFuturesMarketLaunchProposalConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = DerivativeMarketParamUpdateProposal.KotlinxSerializer::class)
@SerialName(value = DerivativeMarketParamUpdateProposal.TYPE_URL)
public data class DerivativeMarketParamUpdateProposal(
  @ProtobufIndex(index = 1)
  public val title: String,
  @ProtobufIndex(index = 2)
  public val description: String,
  @ProtobufIndex(index = 3)
  public val marketId: String,
  @ProtobufIndex(index = 4)
  public val initialMarginRatio: String,
  @ProtobufIndex(index = 5)
  public val maintenanceMarginRatio: String,
  @ProtobufIndex(index = 6)
  public val makerFeeRate: String,
  @ProtobufIndex(index = 7)
  public val takerFeeRate: String,
  @ProtobufIndex(index = 8)
  public val relayerFeeShareRate: String,
  @ProtobufIndex(index = 9)
  public val minPriceTickSize: String,
  @ProtobufIndex(index = 10)
  public val minQuantityTickSize: String,
  @ProtobufIndex(index = 11)
  public val hourlyInterestRate: String,
  @ProtobufIndex(index = 12)
  public val hourlyFundingRateCap: String,
  @ProtobufIndex(index = 13)
  public val status: MarketStatus,
  @ProtobufIndex(index = 14)
  public val oracleParams: OracleParams,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String =
        "/injective.exchange.v1beta1.DerivativeMarketParamUpdateProposal"
  }

  public object KotlinxSerializer : KSerializer<DerivativeMarketParamUpdateProposal> {
    private val delegator: KSerializer<DerivativeMarketParamUpdateProposal> =
        DerivativeMarketParamUpdateProposal.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: DerivativeMarketParamUpdateProposal):
        Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(DerivativeMarketParamUpdateProposalConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): DerivativeMarketParamUpdateProposal {
      if (decoder is ProtobufMapperDecoder) {
        return DerivativeMarketParamUpdateProposalConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = MarketForcedSettlementProposal.KotlinxSerializer::class)
@SerialName(value = MarketForcedSettlementProposal.TYPE_URL)
public data class MarketForcedSettlementProposal(
  @ProtobufIndex(index = 1)
  public val title: String,
  @ProtobufIndex(index = 2)
  public val description: String,
  @ProtobufIndex(index = 3)
  public val marketId: String,
  @ProtobufIndex(index = 4)
  public val settlementPrice: String,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/injective.exchange.v1beta1.MarketForcedSettlementProposal"
  }

  public object KotlinxSerializer : KSerializer<MarketForcedSettlementProposal> {
    private val delegator: KSerializer<MarketForcedSettlementProposal> =
        MarketForcedSettlementProposal.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: MarketForcedSettlementProposal): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(MarketForcedSettlementProposalConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): MarketForcedSettlementProposal {
      if (decoder is ProtobufMapperDecoder) {
        return MarketForcedSettlementProposalConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = UpdateDenomDecimalsProposal.KotlinxSerializer::class)
@SerialName(value = UpdateDenomDecimalsProposal.TYPE_URL)
public data class UpdateDenomDecimalsProposal(
  @ProtobufIndex(index = 1)
  public val title: String,
  @ProtobufIndex(index = 2)
  public val description: String,
  @ProtobufIndex(index = 3)
  public val denomDecimals: List<DenomDecimals>,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/injective.exchange.v1beta1.UpdateDenomDecimalsProposal"
  }

  public object KotlinxSerializer : KSerializer<UpdateDenomDecimalsProposal> {
    private val delegator: KSerializer<UpdateDenomDecimalsProposal> =
        UpdateDenomDecimalsProposal.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: UpdateDenomDecimalsProposal): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(UpdateDenomDecimalsProposalConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): UpdateDenomDecimalsProposal {
      if (decoder is ProtobufMapperDecoder) {
        return UpdateDenomDecimalsProposalConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = BinaryOptionsMarketParamUpdateProposal.KotlinxSerializer::class)
@SerialName(value = BinaryOptionsMarketParamUpdateProposal.TYPE_URL)
public data class BinaryOptionsMarketParamUpdateProposal(
  @ProtobufIndex(index = 1)
  public val title: String,
  @ProtobufIndex(index = 2)
  public val description: String,
  @ProtobufIndex(index = 3)
  public val marketId: String,
  @ProtobufIndex(index = 4)
  public val makerFeeRate: String,
  @ProtobufIndex(index = 5)
  public val takerFeeRate: String,
  @ProtobufIndex(index = 6)
  public val relayerFeeShareRate: String,
  @ProtobufIndex(index = 7)
  public val minPriceTickSize: String,
  @ProtobufIndex(index = 8)
  public val minQuantityTickSize: String,
  @ProtobufIndex(index = 9)
  public val expirationTimestamp: Long,
  @ProtobufIndex(index = 10)
  public val settlementTimestamp: Long,
  @ProtobufIndex(index = 11)
  public val settlementPrice: String,
  @ProtobufIndex(index = 12)
  public val admin: String,
  @ProtobufIndex(index = 13)
  public val status: MarketStatus,
  @ProtobufIndex(index = 14)
  public val oracleParams: ProviderOracleParams,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String =
        "/injective.exchange.v1beta1.BinaryOptionsMarketParamUpdateProposal"
  }

  public object KotlinxSerializer : KSerializer<BinaryOptionsMarketParamUpdateProposal> {
    private val delegator: KSerializer<BinaryOptionsMarketParamUpdateProposal> =
        BinaryOptionsMarketParamUpdateProposal.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder,
        `value`: BinaryOptionsMarketParamUpdateProposal): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(BinaryOptionsMarketParamUpdateProposalConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): BinaryOptionsMarketParamUpdateProposal {
      if (decoder is ProtobufMapperDecoder) {
        return BinaryOptionsMarketParamUpdateProposalConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = ProviderOracleParams.KotlinxSerializer::class)
@SerialName(value = ProviderOracleParams.TYPE_URL)
public data class ProviderOracleParams(
  @ProtobufIndex(index = 1)
  public val symbol: String,
  @ProtobufIndex(index = 2)
  public val provider: String,
  @ProtobufIndex(index = 3)
  public val oracleScaleFactor: UInt,
  @ProtobufIndex(index = 4)
  public val oracleType: OracleType,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/injective.exchange.v1beta1.ProviderOracleParams"
  }

  public object KotlinxSerializer : KSerializer<ProviderOracleParams> {
    private val delegator: KSerializer<ProviderOracleParams> = ProviderOracleParams.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: ProviderOracleParams): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(ProviderOracleParamsConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): ProviderOracleParams {
      if (decoder is ProtobufMapperDecoder) {
        return ProviderOracleParamsConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = OracleParams.KotlinxSerializer::class)
@SerialName(value = OracleParams.TYPE_URL)
public data class OracleParams(
  @ProtobufIndex(index = 1)
  public val oracleBase: String,
  @ProtobufIndex(index = 2)
  public val oracleQuote: String,
  @ProtobufIndex(index = 3)
  public val oracleScaleFactor: UInt,
  @ProtobufIndex(index = 4)
  public val oracleType: OracleType,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/injective.exchange.v1beta1.OracleParams"
  }

  public object KotlinxSerializer : KSerializer<OracleParams> {
    private val delegator: KSerializer<OracleParams> = OracleParams.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: OracleParams): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(OracleParamsConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): OracleParams {
      if (decoder is ProtobufMapperDecoder) {
        return OracleParamsConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = TradingRewardCampaignLaunchProposal.KotlinxSerializer::class)
@SerialName(value = TradingRewardCampaignLaunchProposal.TYPE_URL)
public data class TradingRewardCampaignLaunchProposal(
  @ProtobufIndex(index = 1)
  public val title: String,
  @ProtobufIndex(index = 2)
  public val description: String,
  @ProtobufIndex(index = 3)
  public val campaignInfo: TradingRewardCampaignInfo,
  @ProtobufIndex(index = 4)
  public val campaignRewardPools: List<CampaignRewardPool>,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String =
        "/injective.exchange.v1beta1.TradingRewardCampaignLaunchProposal"
  }

  public object KotlinxSerializer : KSerializer<TradingRewardCampaignLaunchProposal> {
    private val delegator: KSerializer<TradingRewardCampaignLaunchProposal> =
        TradingRewardCampaignLaunchProposal.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: TradingRewardCampaignLaunchProposal):
        Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(TradingRewardCampaignLaunchProposalConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): TradingRewardCampaignLaunchProposal {
      if (decoder is ProtobufMapperDecoder) {
        return TradingRewardCampaignLaunchProposalConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = TradingRewardCampaignUpdateProposal.KotlinxSerializer::class)
@SerialName(value = TradingRewardCampaignUpdateProposal.TYPE_URL)
public data class TradingRewardCampaignUpdateProposal(
  @ProtobufIndex(index = 1)
  public val title: String,
  @ProtobufIndex(index = 2)
  public val description: String,
  @ProtobufIndex(index = 3)
  public val campaignInfo: TradingRewardCampaignInfo,
  @ProtobufIndex(index = 4)
  public val campaignRewardPoolsAdditions: List<CampaignRewardPool>,
  @ProtobufIndex(index = 5)
  public val campaignRewardPoolsUpdates: List<CampaignRewardPool>,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String =
        "/injective.exchange.v1beta1.TradingRewardCampaignUpdateProposal"
  }

  public object KotlinxSerializer : KSerializer<TradingRewardCampaignUpdateProposal> {
    private val delegator: KSerializer<TradingRewardCampaignUpdateProposal> =
        TradingRewardCampaignUpdateProposal.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: TradingRewardCampaignUpdateProposal):
        Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(TradingRewardCampaignUpdateProposalConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): TradingRewardCampaignUpdateProposal {
      if (decoder is ProtobufMapperDecoder) {
        return TradingRewardCampaignUpdateProposalConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = RewardPointUpdate.KotlinxSerializer::class)
@SerialName(value = RewardPointUpdate.TYPE_URL)
public data class RewardPointUpdate(
  @ProtobufIndex(index = 1)
  public val accountAddress: String,
  @ProtobufIndex(index = 12)
  public val newPoints: String,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/injective.exchange.v1beta1.RewardPointUpdate"
  }

  public object KotlinxSerializer : KSerializer<RewardPointUpdate> {
    private val delegator: KSerializer<RewardPointUpdate> = RewardPointUpdate.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: RewardPointUpdate): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(RewardPointUpdateConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): RewardPointUpdate {
      if (decoder is ProtobufMapperDecoder) {
        return RewardPointUpdateConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = TradingRewardPendingPointsUpdateProposal.KotlinxSerializer::class)
@SerialName(value = TradingRewardPendingPointsUpdateProposal.TYPE_URL)
public data class TradingRewardPendingPointsUpdateProposal(
  @ProtobufIndex(index = 1)
  public val title: String,
  @ProtobufIndex(index = 2)
  public val description: String,
  @ProtobufIndex(index = 3)
  public val pendingPoolTimestamp: Long,
  @ProtobufIndex(index = 4)
  public val rewardPointUpdates: List<RewardPointUpdate>,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String =
        "/injective.exchange.v1beta1.TradingRewardPendingPointsUpdateProposal"
  }

  public object KotlinxSerializer : KSerializer<TradingRewardPendingPointsUpdateProposal> {
    private val delegator: KSerializer<TradingRewardPendingPointsUpdateProposal> =
        TradingRewardPendingPointsUpdateProposal.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder,
        `value`: TradingRewardPendingPointsUpdateProposal): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(TradingRewardPendingPointsUpdateProposalConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): TradingRewardPendingPointsUpdateProposal {
      if (decoder is ProtobufMapperDecoder) {
        return TradingRewardPendingPointsUpdateProposalConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = FeeDiscountProposal.KotlinxSerializer::class)
@SerialName(value = FeeDiscountProposal.TYPE_URL)
public data class FeeDiscountProposal(
  @ProtobufIndex(index = 1)
  public val title: String,
  @ProtobufIndex(index = 2)
  public val description: String,
  @ProtobufIndex(index = 3)
  public val schedule: FeeDiscountSchedule,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/injective.exchange.v1beta1.FeeDiscountProposal"
  }

  public object KotlinxSerializer : KSerializer<FeeDiscountProposal> {
    private val delegator: KSerializer<FeeDiscountProposal> = FeeDiscountProposal.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: FeeDiscountProposal): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(FeeDiscountProposalConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): FeeDiscountProposal {
      if (decoder is ProtobufMapperDecoder) {
        return FeeDiscountProposalConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = BatchCommunityPoolSpendProposal.KotlinxSerializer::class)
@SerialName(value = BatchCommunityPoolSpendProposal.TYPE_URL)
public data class BatchCommunityPoolSpendProposal(
  @ProtobufIndex(index = 1)
  public val title: String,
  @ProtobufIndex(index = 2)
  public val description: String,
  @ProtobufIndex(index = 3)
  public val proposals: List<CommunityPoolSpendProposal>,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String =
        "/injective.exchange.v1beta1.BatchCommunityPoolSpendProposal"
  }

  public object KotlinxSerializer : KSerializer<BatchCommunityPoolSpendProposal> {
    private val delegator: KSerializer<BatchCommunityPoolSpendProposal> =
        BatchCommunityPoolSpendProposal.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: BatchCommunityPoolSpendProposal):
        Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(BatchCommunityPoolSpendProposalConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): BatchCommunityPoolSpendProposal {
      if (decoder is ProtobufMapperDecoder) {
        return BatchCommunityPoolSpendProposalConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = AtomicMarketOrderFeeMultiplierScheduleProposal.KotlinxSerializer::class)
@SerialName(value = AtomicMarketOrderFeeMultiplierScheduleProposal.TYPE_URL)
public data class AtomicMarketOrderFeeMultiplierScheduleProposal(
  @ProtobufIndex(index = 1)
  public val title: String,
  @ProtobufIndex(index = 2)
  public val description: String,
  @ProtobufIndex(index = 3)
  public val marketFeeMultipliers: List<MarketFeeMultiplier>,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String =
        "/injective.exchange.v1beta1.AtomicMarketOrderFeeMultiplierScheduleProposal"
  }

  public object KotlinxSerializer : KSerializer<AtomicMarketOrderFeeMultiplierScheduleProposal> {
    private val delegator: KSerializer<AtomicMarketOrderFeeMultiplierScheduleProposal> =
        AtomicMarketOrderFeeMultiplierScheduleProposal.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder,
        `value`: AtomicMarketOrderFeeMultiplierScheduleProposal): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(AtomicMarketOrderFeeMultiplierScheduleProposalConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder):
        AtomicMarketOrderFeeMultiplierScheduleProposal {
      if (decoder is ProtobufMapperDecoder) {
        return AtomicMarketOrderFeeMultiplierScheduleProposalConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}
