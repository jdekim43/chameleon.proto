// Transform from injective/oracle/v1beta1/oracle.proto
@file:ProtobufSyntax(syntax = "PROTO3")
@file:GeneratorVersion(version = "0.3.1")

package injective.oracle.v1beta1

import cosmos.base.v1beta1.Coin
import kotlin.Boolean
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
@SerialName(value = "/injective.oracle.v1beta1.OracleType")
public enum class OracleType(
  public val number: Int,
) {
  @ProtobufIndex(index = 0)
  Unspecified(0),
  @ProtobufIndex(index = 1)
  Band(1),
  @ProtobufIndex(index = 2)
  PriceFeed(2),
  @ProtobufIndex(index = 3)
  Coinbase(3),
  @ProtobufIndex(index = 4)
  Chainlink(4),
  @ProtobufIndex(index = 5)
  Razor(5),
  @ProtobufIndex(index = 6)
  Dia(6),
  @ProtobufIndex(index = 7)
  API3(7),
  @ProtobufIndex(index = 8)
  Uma(8),
  @ProtobufIndex(index = 9)
  Pyth(9),
  @ProtobufIndex(index = 10)
  BandIBC(10),
  @ProtobufIndex(index = 11)
  Provider(11),
  ;

  public companion object {
    public fun forNumber(number: Int): OracleType = OracleType.values()
    	.first { it.number == number }
  }
}

@Serializable(with = Params.KotlinxSerializer::class)
@SerialName(value = Params.TYPE_URL)
public data class Params(
  @ProtobufIndex(index = 1)
  public val pythContract: String,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/injective.oracle.v1beta1.Params"
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

@Serializable(with = OracleInfo.KotlinxSerializer::class)
@SerialName(value = OracleInfo.TYPE_URL)
public data class OracleInfo(
  @ProtobufIndex(index = 1)
  public val symbol: String,
  @ProtobufIndex(index = 2)
  public val oracleType: OracleType,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/injective.oracle.v1beta1.OracleInfo"
  }

  public object KotlinxSerializer : KSerializer<OracleInfo> {
    private val delegator: KSerializer<OracleInfo> = OracleInfo.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: OracleInfo): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(OracleInfoConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): OracleInfo {
      if (decoder is ProtobufMapperDecoder) {
        return OracleInfoConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = ChainlinkPriceState.KotlinxSerializer::class)
@SerialName(value = ChainlinkPriceState.TYPE_URL)
public data class ChainlinkPriceState(
  @ProtobufIndex(index = 1)
  public val feedId: String,
  @ProtobufIndex(index = 2)
  public val answer: String,
  @ProtobufIndex(index = 3)
  public val timestamp: ULong,
  @ProtobufIndex(index = 4)
  public val priceState: PriceState,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/injective.oracle.v1beta1.ChainlinkPriceState"
  }

  public object KotlinxSerializer : KSerializer<ChainlinkPriceState> {
    private val delegator: KSerializer<ChainlinkPriceState> = ChainlinkPriceState.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: ChainlinkPriceState): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(ChainlinkPriceStateConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): ChainlinkPriceState {
      if (decoder is ProtobufMapperDecoder) {
        return ChainlinkPriceStateConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = BandPriceState.KotlinxSerializer::class)
@SerialName(value = BandPriceState.TYPE_URL)
public data class BandPriceState(
  @ProtobufIndex(index = 1)
  public val symbol: String,
  @ProtobufIndex(index = 2)
  public val rate: String,
  @ProtobufIndex(index = 3)
  public val resolveTime: ULong,
  @ProtobufIndex(index = 4)
  public val requestID: ULong,
  @ProtobufIndex(index = 5)
  public val priceState: PriceState,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/injective.oracle.v1beta1.BandPriceState"
  }

  public object KotlinxSerializer : KSerializer<BandPriceState> {
    private val delegator: KSerializer<BandPriceState> = BandPriceState.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: BandPriceState): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(BandPriceStateConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): BandPriceState {
      if (decoder is ProtobufMapperDecoder) {
        return BandPriceStateConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = PriceFeedState.KotlinxSerializer::class)
@SerialName(value = PriceFeedState.TYPE_URL)
public data class PriceFeedState(
  @ProtobufIndex(index = 1)
  public val base: String,
  @ProtobufIndex(index = 2)
  public val quote: String,
  @ProtobufIndex(index = 3)
  public val priceState: PriceState,
  @ProtobufIndex(index = 4)
  public val relayers: List<String>,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/injective.oracle.v1beta1.PriceFeedState"
  }

  public object KotlinxSerializer : KSerializer<PriceFeedState> {
    private val delegator: KSerializer<PriceFeedState> = PriceFeedState.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: PriceFeedState): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(PriceFeedStateConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): PriceFeedState {
      if (decoder is ProtobufMapperDecoder) {
        return PriceFeedStateConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = ProviderInfo.KotlinxSerializer::class)
@SerialName(value = ProviderInfo.TYPE_URL)
public data class ProviderInfo(
  @ProtobufIndex(index = 1)
  public val provider: String,
  @ProtobufIndex(index = 2)
  public val relayers: List<String>,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/injective.oracle.v1beta1.ProviderInfo"
  }

  public object KotlinxSerializer : KSerializer<ProviderInfo> {
    private val delegator: KSerializer<ProviderInfo> = ProviderInfo.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: ProviderInfo): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(ProviderInfoConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): ProviderInfo {
      if (decoder is ProtobufMapperDecoder) {
        return ProviderInfoConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = ProviderState.KotlinxSerializer::class)
@SerialName(value = ProviderState.TYPE_URL)
public data class ProviderState(
  @ProtobufIndex(index = 1)
  public val providerInfo: ProviderInfo,
  @ProtobufIndex(index = 2)
  public val providerPriceStates: List<ProviderPriceState>,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/injective.oracle.v1beta1.ProviderState"
  }

  public object KotlinxSerializer : KSerializer<ProviderState> {
    private val delegator: KSerializer<ProviderState> = ProviderState.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: ProviderState): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(ProviderStateConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): ProviderState {
      if (decoder is ProtobufMapperDecoder) {
        return ProviderStateConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = ProviderPriceState.KotlinxSerializer::class)
@SerialName(value = ProviderPriceState.TYPE_URL)
public data class ProviderPriceState(
  @ProtobufIndex(index = 1)
  public val symbol: String,
  @ProtobufIndex(index = 2)
  public val state: PriceState,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/injective.oracle.v1beta1.ProviderPriceState"
  }

  public object KotlinxSerializer : KSerializer<ProviderPriceState> {
    private val delegator: KSerializer<ProviderPriceState> = ProviderPriceState.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: ProviderPriceState): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(ProviderPriceStateConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): ProviderPriceState {
      if (decoder is ProtobufMapperDecoder) {
        return ProviderPriceStateConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = PriceFeedInfo.KotlinxSerializer::class)
@SerialName(value = PriceFeedInfo.TYPE_URL)
public data class PriceFeedInfo(
  @ProtobufIndex(index = 1)
  public val base: String,
  @ProtobufIndex(index = 2)
  public val quote: String,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/injective.oracle.v1beta1.PriceFeedInfo"
  }

  public object KotlinxSerializer : KSerializer<PriceFeedInfo> {
    private val delegator: KSerializer<PriceFeedInfo> = PriceFeedInfo.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: PriceFeedInfo): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(PriceFeedInfoConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): PriceFeedInfo {
      if (decoder is ProtobufMapperDecoder) {
        return PriceFeedInfoConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = PriceFeedPrice.KotlinxSerializer::class)
@SerialName(value = PriceFeedPrice.TYPE_URL)
public data class PriceFeedPrice(
  @ProtobufIndex(index = 1)
  public val price: String,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/injective.oracle.v1beta1.PriceFeedPrice"
  }

  public object KotlinxSerializer : KSerializer<PriceFeedPrice> {
    private val delegator: KSerializer<PriceFeedPrice> = PriceFeedPrice.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: PriceFeedPrice): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(PriceFeedPriceConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): PriceFeedPrice {
      if (decoder is ProtobufMapperDecoder) {
        return PriceFeedPriceConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = CoinbasePriceState.KotlinxSerializer::class)
@SerialName(value = CoinbasePriceState.TYPE_URL)
public data class CoinbasePriceState(
  @ProtobufIndex(index = 1)
  public val kind: String,
  @ProtobufIndex(index = 2)
  public val timestamp: ULong,
  @ProtobufIndex(index = 3)
  public val key: String,
  @ProtobufIndex(index = 4)
  public val `value`: ULong,
  @ProtobufIndex(index = 5)
  public val priceState: PriceState,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/injective.oracle.v1beta1.CoinbasePriceState"
  }

  public object KotlinxSerializer : KSerializer<CoinbasePriceState> {
    private val delegator: KSerializer<CoinbasePriceState> = CoinbasePriceState.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: CoinbasePriceState): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(CoinbasePriceStateConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): CoinbasePriceState {
      if (decoder is ProtobufMapperDecoder) {
        return CoinbasePriceStateConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = PriceState.KotlinxSerializer::class)
@SerialName(value = PriceState.TYPE_URL)
public data class PriceState(
  @ProtobufIndex(index = 1)
  public val price: String,
  @ProtobufIndex(index = 2)
  public val cumulativePrice: String,
  @ProtobufIndex(index = 3)
  public val timestamp: Long,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/injective.oracle.v1beta1.PriceState"
  }

  public object KotlinxSerializer : KSerializer<PriceState> {
    private val delegator: KSerializer<PriceState> = PriceState.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: PriceState): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(PriceStateConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): PriceState {
      if (decoder is ProtobufMapperDecoder) {
        return PriceStateConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = PythPriceState.KotlinxSerializer::class)
@SerialName(value = PythPriceState.TYPE_URL)
public data class PythPriceState(
  @ProtobufIndex(index = 1)
  public val priceId: String,
  @ProtobufIndex(index = 2)
  public val emaPrice: String,
  @ProtobufIndex(index = 3)
  public val emaConf: String,
  @ProtobufIndex(index = 4)
  public val conf: String,
  @ProtobufIndex(index = 5)
  public val publishTime: ULong,
  @ProtobufIndex(index = 6)
  public val priceState: PriceState,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/injective.oracle.v1beta1.PythPriceState"
  }

  public object KotlinxSerializer : KSerializer<PythPriceState> {
    private val delegator: KSerializer<PythPriceState> = PythPriceState.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: PythPriceState): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(PythPriceStateConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): PythPriceState {
      if (decoder is ProtobufMapperDecoder) {
        return PythPriceStateConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = BandOracleRequest.KotlinxSerializer::class)
@SerialName(value = BandOracleRequest.TYPE_URL)
public data class BandOracleRequest(
  @ProtobufIndex(index = 1)
  public val requestId: ULong,
  @ProtobufIndex(index = 2)
  public val oracleScriptId: Long,
  @ProtobufIndex(index = 3)
  public val symbols: List<String>,
  @ProtobufIndex(index = 4)
  public val askCount: ULong,
  @ProtobufIndex(index = 5)
  public val minCount: ULong,
  @ProtobufIndex(index = 6)
  public val feeLimit: List<Coin>,
  @ProtobufIndex(index = 7)
  public val prepareGas: ULong,
  @ProtobufIndex(index = 8)
  public val executeGas: ULong,
  @ProtobufIndex(index = 9)
  public val minSourceCount: ULong,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/injective.oracle.v1beta1.BandOracleRequest"
  }

  public object KotlinxSerializer : KSerializer<BandOracleRequest> {
    private val delegator: KSerializer<BandOracleRequest> = BandOracleRequest.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: BandOracleRequest): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(BandOracleRequestConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): BandOracleRequest {
      if (decoder is ProtobufMapperDecoder) {
        return BandOracleRequestConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = BandIBCParams.KotlinxSerializer::class)
@SerialName(value = BandIBCParams.TYPE_URL)
public data class BandIBCParams(
  @ProtobufIndex(index = 1)
  public val bandIbcEnabled: Boolean,
  @ProtobufIndex(index = 2)
  public val ibcRequestInterval: Long,
  @ProtobufIndex(index = 3)
  public val ibcSourceChannel: String,
  @ProtobufIndex(index = 4)
  public val ibcVersion: String,
  @ProtobufIndex(index = 5)
  public val ibcPortId: String,
  @ProtobufIndex(index = 6)
  public val legacyOracleIds: List<Long>,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/injective.oracle.v1beta1.BandIBCParams"
  }

  public object KotlinxSerializer : KSerializer<BandIBCParams> {
    private val delegator: KSerializer<BandIBCParams> = BandIBCParams.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: BandIBCParams): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(BandIBCParamsConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): BandIBCParams {
      if (decoder is ProtobufMapperDecoder) {
        return BandIBCParamsConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = SymbolPriceTimestamp.KotlinxSerializer::class)
@SerialName(value = SymbolPriceTimestamp.TYPE_URL)
public data class SymbolPriceTimestamp(
  @ProtobufIndex(index = 1)
  public val oracle: OracleType,
  @ProtobufIndex(index = 2)
  public val symbolId: String,
  @ProtobufIndex(index = 3)
  public val timestamp: Long,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/injective.oracle.v1beta1.SymbolPriceTimestamp"
  }

  public object KotlinxSerializer : KSerializer<SymbolPriceTimestamp> {
    private val delegator: KSerializer<SymbolPriceTimestamp> = SymbolPriceTimestamp.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: SymbolPriceTimestamp): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(SymbolPriceTimestampConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): SymbolPriceTimestamp {
      if (decoder is ProtobufMapperDecoder) {
        return SymbolPriceTimestampConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = LastPriceTimestamps.KotlinxSerializer::class)
@SerialName(value = LastPriceTimestamps.TYPE_URL)
public data class LastPriceTimestamps(
  @ProtobufIndex(index = 1)
  public val lastPriceTimestamps: List<SymbolPriceTimestamp>,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/injective.oracle.v1beta1.LastPriceTimestamps"
  }

  public object KotlinxSerializer : KSerializer<LastPriceTimestamps> {
    private val delegator: KSerializer<LastPriceTimestamps> = LastPriceTimestamps.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: LastPriceTimestamps): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(LastPriceTimestampsConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): LastPriceTimestamps {
      if (decoder is ProtobufMapperDecoder) {
        return LastPriceTimestampsConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = PriceRecords.KotlinxSerializer::class)
@SerialName(value = PriceRecords.TYPE_URL)
public data class PriceRecords(
  @ProtobufIndex(index = 1)
  public val oracle: OracleType,
  @ProtobufIndex(index = 2)
  public val symbolId: String,
  @ProtobufIndex(index = 3)
  public val latestPriceRecords: List<PriceRecord>,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/injective.oracle.v1beta1.PriceRecords"
  }

  public object KotlinxSerializer : KSerializer<PriceRecords> {
    private val delegator: KSerializer<PriceRecords> = PriceRecords.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: PriceRecords): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(PriceRecordsConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): PriceRecords {
      if (decoder is ProtobufMapperDecoder) {
        return PriceRecordsConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = PriceRecord.KotlinxSerializer::class)
@SerialName(value = PriceRecord.TYPE_URL)
public data class PriceRecord(
  @ProtobufIndex(index = 1)
  public val timestamp: Long,
  @ProtobufIndex(index = 2)
  public val price: String,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/injective.oracle.v1beta1.PriceRecord"
  }

  public object KotlinxSerializer : KSerializer<PriceRecord> {
    private val delegator: KSerializer<PriceRecord> = PriceRecord.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: PriceRecord): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(PriceRecordConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): PriceRecord {
      if (decoder is ProtobufMapperDecoder) {
        return PriceRecordConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = MetadataStatistics.KotlinxSerializer::class)
@SerialName(value = MetadataStatistics.TYPE_URL)
public data class MetadataStatistics(
  @ProtobufIndex(index = 1)
  public val groupCount: UInt,
  @ProtobufIndex(index = 2)
  public val recordsSampleSize: UInt,
  @ProtobufIndex(index = 3)
  public val mean: String,
  @ProtobufIndex(index = 4)
  public val twap: String,
  @ProtobufIndex(index = 5)
  public val firstTimestamp: Long,
  @ProtobufIndex(index = 6)
  public val lastTimestamp: Long,
  @ProtobufIndex(index = 7)
  public val minPrice: String,
  @ProtobufIndex(index = 8)
  public val maxPrice: String,
  @ProtobufIndex(index = 9)
  public val medianPrice: String,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/injective.oracle.v1beta1.MetadataStatistics"
  }

  public object KotlinxSerializer : KSerializer<MetadataStatistics> {
    private val delegator: KSerializer<MetadataStatistics> = MetadataStatistics.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: MetadataStatistics): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(MetadataStatisticsConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): MetadataStatistics {
      if (decoder is ProtobufMapperDecoder) {
        return MetadataStatisticsConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = PriceAttestation.KotlinxSerializer::class)
@SerialName(value = PriceAttestation.TYPE_URL)
public data class PriceAttestation(
  @ProtobufIndex(index = 1)
  public val priceId: String,
  @ProtobufIndex(index = 2)
  public val price: Long,
  @ProtobufIndex(index = 3)
  public val conf: ULong,
  @ProtobufIndex(index = 4)
  public val expo: Int,
  @ProtobufIndex(index = 5)
  public val emaPrice: Long,
  @ProtobufIndex(index = 6)
  public val emaConf: ULong,
  @ProtobufIndex(index = 7)
  public val emaExpo: Int,
  @ProtobufIndex(index = 8)
  public val publishTime: Long,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/injective.oracle.v1beta1.PriceAttestation"
  }

  public object KotlinxSerializer : KSerializer<PriceAttestation> {
    private val delegator: KSerializer<PriceAttestation> = PriceAttestation.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: PriceAttestation): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(PriceAttestationConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): PriceAttestation {
      if (decoder is ProtobufMapperDecoder) {
        return PriceAttestationConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}
