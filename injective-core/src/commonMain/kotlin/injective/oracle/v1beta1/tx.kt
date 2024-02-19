// Transform from injective/oracle/v1beta1/tx.proto
@file:ProtobufSyntax(syntax = "PROTO3")
@file:GeneratorVersion(version = "0.3.1")

package injective.oracle.v1beta1

import kotlin.ByteArray
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

@Serializable(with = MsgRelayProviderPrices.KotlinxSerializer::class)
@SerialName(value = MsgRelayProviderPrices.TYPE_URL)
public data class MsgRelayProviderPrices(
  @ProtobufIndex(index = 1)
  public val sender: String,
  @ProtobufIndex(index = 2)
  public val provider: String,
  @ProtobufIndex(index = 3)
  public val symbols: List<String>,
  @ProtobufIndex(index = 4)
  public val prices: List<String>,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/injective.oracle.v1beta1.MsgRelayProviderPrices"
  }

  public object KotlinxSerializer : KSerializer<MsgRelayProviderPrices> {
    private val delegator: KSerializer<MsgRelayProviderPrices> = MsgRelayProviderPrices.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: MsgRelayProviderPrices): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(MsgRelayProviderPricesConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): MsgRelayProviderPrices {
      if (decoder is ProtobufMapperDecoder) {
        return MsgRelayProviderPricesConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = MsgRelayProviderPricesResponse.KotlinxSerializer::class)
@SerialName(value = MsgRelayProviderPricesResponse.TYPE_URL)
public class MsgRelayProviderPricesResponse() : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/injective.oracle.v1beta1.MsgRelayProviderPricesResponse"
  }

  public object KotlinxSerializer : KSerializer<MsgRelayProviderPricesResponse> {
    private val delegator: KSerializer<MsgRelayProviderPricesResponse> =
        MsgRelayProviderPricesResponse.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: MsgRelayProviderPricesResponse): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(MsgRelayProviderPricesResponseConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): MsgRelayProviderPricesResponse {
      if (decoder is ProtobufMapperDecoder) {
        return MsgRelayProviderPricesResponseConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = MsgRelayPriceFeedPrice.KotlinxSerializer::class)
@SerialName(value = MsgRelayPriceFeedPrice.TYPE_URL)
public data class MsgRelayPriceFeedPrice(
  @ProtobufIndex(index = 1)
  public val sender: String,
  @ProtobufIndex(index = 2)
  public val base: List<String>,
  @ProtobufIndex(index = 3)
  public val quote: List<String>,
  @ProtobufIndex(index = 4)
  public val price: List<String>,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/injective.oracle.v1beta1.MsgRelayPriceFeedPrice"
  }

  public object KotlinxSerializer : KSerializer<MsgRelayPriceFeedPrice> {
    private val delegator: KSerializer<MsgRelayPriceFeedPrice> = MsgRelayPriceFeedPrice.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: MsgRelayPriceFeedPrice): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(MsgRelayPriceFeedPriceConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): MsgRelayPriceFeedPrice {
      if (decoder is ProtobufMapperDecoder) {
        return MsgRelayPriceFeedPriceConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = MsgRelayPriceFeedPriceResponse.KotlinxSerializer::class)
@SerialName(value = MsgRelayPriceFeedPriceResponse.TYPE_URL)
public class MsgRelayPriceFeedPriceResponse() : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/injective.oracle.v1beta1.MsgRelayPriceFeedPriceResponse"
  }

  public object KotlinxSerializer : KSerializer<MsgRelayPriceFeedPriceResponse> {
    private val delegator: KSerializer<MsgRelayPriceFeedPriceResponse> =
        MsgRelayPriceFeedPriceResponse.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: MsgRelayPriceFeedPriceResponse): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(MsgRelayPriceFeedPriceResponseConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): MsgRelayPriceFeedPriceResponse {
      if (decoder is ProtobufMapperDecoder) {
        return MsgRelayPriceFeedPriceResponseConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = MsgRelayBandRates.KotlinxSerializer::class)
@SerialName(value = MsgRelayBandRates.TYPE_URL)
public data class MsgRelayBandRates(
  @ProtobufIndex(index = 1)
  public val relayer: String,
  @ProtobufIndex(index = 2)
  public val symbols: List<String>,
  @ProtobufIndex(index = 3)
  public val rates: List<ULong>,
  @ProtobufIndex(index = 4)
  public val resolveTimes: List<ULong>,
  @ProtobufIndex(index = 5)
  public val requestIDs: List<ULong>,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/injective.oracle.v1beta1.MsgRelayBandRates"
  }

  public object KotlinxSerializer : KSerializer<MsgRelayBandRates> {
    private val delegator: KSerializer<MsgRelayBandRates> = MsgRelayBandRates.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: MsgRelayBandRates): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(MsgRelayBandRatesConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): MsgRelayBandRates {
      if (decoder is ProtobufMapperDecoder) {
        return MsgRelayBandRatesConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = MsgRelayBandRatesResponse.KotlinxSerializer::class)
@SerialName(value = MsgRelayBandRatesResponse.TYPE_URL)
public class MsgRelayBandRatesResponse() : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/injective.oracle.v1beta1.MsgRelayBandRatesResponse"
  }

  public object KotlinxSerializer : KSerializer<MsgRelayBandRatesResponse> {
    private val delegator: KSerializer<MsgRelayBandRatesResponse> =
        MsgRelayBandRatesResponse.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: MsgRelayBandRatesResponse): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(MsgRelayBandRatesResponseConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): MsgRelayBandRatesResponse {
      if (decoder is ProtobufMapperDecoder) {
        return MsgRelayBandRatesResponseConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = MsgRelayCoinbaseMessages.KotlinxSerializer::class)
@SerialName(value = MsgRelayCoinbaseMessages.TYPE_URL)
public data class MsgRelayCoinbaseMessages(
  @ProtobufIndex(index = 1)
  public val sender: String,
  @ProtobufIndex(index = 2)
  public val messages: List<ByteArray>,
  @ProtobufIndex(index = 3)
  public val signatures: List<ByteArray>,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/injective.oracle.v1beta1.MsgRelayCoinbaseMessages"
  }

  public object KotlinxSerializer : KSerializer<MsgRelayCoinbaseMessages> {
    private val delegator: KSerializer<MsgRelayCoinbaseMessages> =
        MsgRelayCoinbaseMessages.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: MsgRelayCoinbaseMessages): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(MsgRelayCoinbaseMessagesConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): MsgRelayCoinbaseMessages {
      if (decoder is ProtobufMapperDecoder) {
        return MsgRelayCoinbaseMessagesConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = MsgRelayCoinbaseMessagesResponse.KotlinxSerializer::class)
@SerialName(value = MsgRelayCoinbaseMessagesResponse.TYPE_URL)
public class MsgRelayCoinbaseMessagesResponse() : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/injective.oracle.v1beta1.MsgRelayCoinbaseMessagesResponse"
  }

  public object KotlinxSerializer : KSerializer<MsgRelayCoinbaseMessagesResponse> {
    private val delegator: KSerializer<MsgRelayCoinbaseMessagesResponse> =
        MsgRelayCoinbaseMessagesResponse.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: MsgRelayCoinbaseMessagesResponse):
        Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(MsgRelayCoinbaseMessagesResponseConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): MsgRelayCoinbaseMessagesResponse {
      if (decoder is ProtobufMapperDecoder) {
        return MsgRelayCoinbaseMessagesResponseConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = MsgRequestBandIBCRates.KotlinxSerializer::class)
@SerialName(value = MsgRequestBandIBCRates.TYPE_URL)
public data class MsgRequestBandIBCRates(
  @ProtobufIndex(index = 1)
  public val sender: String,
  @ProtobufIndex(index = 2)
  public val requestId: ULong,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/injective.oracle.v1beta1.MsgRequestBandIBCRates"
  }

  public object KotlinxSerializer : KSerializer<MsgRequestBandIBCRates> {
    private val delegator: KSerializer<MsgRequestBandIBCRates> = MsgRequestBandIBCRates.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: MsgRequestBandIBCRates): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(MsgRequestBandIBCRatesConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): MsgRequestBandIBCRates {
      if (decoder is ProtobufMapperDecoder) {
        return MsgRequestBandIBCRatesConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = MsgRequestBandIBCRatesResponse.KotlinxSerializer::class)
@SerialName(value = MsgRequestBandIBCRatesResponse.TYPE_URL)
public class MsgRequestBandIBCRatesResponse() : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/injective.oracle.v1beta1.MsgRequestBandIBCRatesResponse"
  }

  public object KotlinxSerializer : KSerializer<MsgRequestBandIBCRatesResponse> {
    private val delegator: KSerializer<MsgRequestBandIBCRatesResponse> =
        MsgRequestBandIBCRatesResponse.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: MsgRequestBandIBCRatesResponse): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(MsgRequestBandIBCRatesResponseConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): MsgRequestBandIBCRatesResponse {
      if (decoder is ProtobufMapperDecoder) {
        return MsgRequestBandIBCRatesResponseConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = MsgRelayPythPrices.KotlinxSerializer::class)
@SerialName(value = MsgRelayPythPrices.TYPE_URL)
public data class MsgRelayPythPrices(
  @ProtobufIndex(index = 1)
  public val sender: String,
  @ProtobufIndex(index = 2)
  public val priceAttestations: List<PriceAttestation>,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/injective.oracle.v1beta1.MsgRelayPythPrices"
  }

  public object KotlinxSerializer : KSerializer<MsgRelayPythPrices> {
    private val delegator: KSerializer<MsgRelayPythPrices> = MsgRelayPythPrices.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: MsgRelayPythPrices): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(MsgRelayPythPricesConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): MsgRelayPythPrices {
      if (decoder is ProtobufMapperDecoder) {
        return MsgRelayPythPricesConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = MsgRelayPythPricesResponse.KotlinxSerializer::class)
@SerialName(value = MsgRelayPythPricesResponse.TYPE_URL)
public class MsgRelayPythPricesResponse() : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/injective.oracle.v1beta1.MsgRelayPythPricesResponse"
  }

  public object KotlinxSerializer : KSerializer<MsgRelayPythPricesResponse> {
    private val delegator: KSerializer<MsgRelayPythPricesResponse> =
        MsgRelayPythPricesResponse.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: MsgRelayPythPricesResponse): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(MsgRelayPythPricesResponseConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): MsgRelayPythPricesResponse {
      if (decoder is ProtobufMapperDecoder) {
        return MsgRelayPythPricesResponseConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = MsgUpdateParams.KotlinxSerializer::class)
@SerialName(value = MsgUpdateParams.TYPE_URL)
public data class MsgUpdateParams(
  @ProtobufIndex(index = 1)
  public val authority: String,
  @ProtobufIndex(index = 2)
  public val params: Params,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/injective.oracle.v1beta1.MsgUpdateParams"
  }

  public object KotlinxSerializer : KSerializer<MsgUpdateParams> {
    private val delegator: KSerializer<MsgUpdateParams> = MsgUpdateParams.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: MsgUpdateParams): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(MsgUpdateParamsConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): MsgUpdateParams {
      if (decoder is ProtobufMapperDecoder) {
        return MsgUpdateParamsConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = MsgUpdateParamsResponse.KotlinxSerializer::class)
@SerialName(value = MsgUpdateParamsResponse.TYPE_URL)
public class MsgUpdateParamsResponse() : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/injective.oracle.v1beta1.MsgUpdateParamsResponse"
  }

  public object KotlinxSerializer : KSerializer<MsgUpdateParamsResponse> {
    private val delegator: KSerializer<MsgUpdateParamsResponse> =
        MsgUpdateParamsResponse.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: MsgUpdateParamsResponse): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(MsgUpdateParamsResponseConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): MsgUpdateParamsResponse {
      if (decoder is ProtobufMapperDecoder) {
        return MsgUpdateParamsResponseConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}
