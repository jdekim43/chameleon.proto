// Transform from injective/oracle/v1beta1/events.proto
@file:ProtobufSyntax(syntax = "PROTO3")
@file:GeneratorVersion(version = "0.3.1")

package injective.oracle.v1beta1

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

@Serializable(with = SetChainlinkPriceEvent.KotlinxSerializer::class)
@SerialName(value = SetChainlinkPriceEvent.TYPE_URL)
public data class SetChainlinkPriceEvent(
  @ProtobufIndex(index = 1)
  public val feedId: String,
  @ProtobufIndex(index = 2)
  public val answer: String,
  @ProtobufIndex(index = 3)
  public val timestamp: ULong,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/injective.oracle.v1beta1.SetChainlinkPriceEvent"
  }

  public object KotlinxSerializer : KSerializer<SetChainlinkPriceEvent> {
    private val delegator: KSerializer<SetChainlinkPriceEvent> = SetChainlinkPriceEvent.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: SetChainlinkPriceEvent): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(SetChainlinkPriceEventConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): SetChainlinkPriceEvent {
      if (decoder is ProtobufMapperDecoder) {
        return SetChainlinkPriceEventConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = SetBandPriceEvent.KotlinxSerializer::class)
@SerialName(value = SetBandPriceEvent.TYPE_URL)
public data class SetBandPriceEvent(
  @ProtobufIndex(index = 1)
  public val relayer: String,
  @ProtobufIndex(index = 2)
  public val symbol: String,
  @ProtobufIndex(index = 3)
  public val price: String,
  @ProtobufIndex(index = 4)
  public val resolveTime: ULong,
  @ProtobufIndex(index = 5)
  public val requestId: ULong,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/injective.oracle.v1beta1.SetBandPriceEvent"
  }

  public object KotlinxSerializer : KSerializer<SetBandPriceEvent> {
    private val delegator: KSerializer<SetBandPriceEvent> = SetBandPriceEvent.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: SetBandPriceEvent): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(SetBandPriceEventConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): SetBandPriceEvent {
      if (decoder is ProtobufMapperDecoder) {
        return SetBandPriceEventConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = SetBandIBCPriceEvent.KotlinxSerializer::class)
@SerialName(value = SetBandIBCPriceEvent.TYPE_URL)
public data class SetBandIBCPriceEvent(
  @ProtobufIndex(index = 1)
  public val relayer: String,
  @ProtobufIndex(index = 2)
  public val symbols: List<String>,
  @ProtobufIndex(index = 3)
  public val prices: List<String>,
  @ProtobufIndex(index = 4)
  public val resolveTime: ULong,
  @ProtobufIndex(index = 5)
  public val requestId: ULong,
  @ProtobufIndex(index = 6)
  public val clientId: Long,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/injective.oracle.v1beta1.SetBandIBCPriceEvent"
  }

  public object KotlinxSerializer : KSerializer<SetBandIBCPriceEvent> {
    private val delegator: KSerializer<SetBandIBCPriceEvent> = SetBandIBCPriceEvent.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: SetBandIBCPriceEvent): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(SetBandIBCPriceEventConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): SetBandIBCPriceEvent {
      if (decoder is ProtobufMapperDecoder) {
        return SetBandIBCPriceEventConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = EventBandIBCAckSuccess.KotlinxSerializer::class)
@SerialName(value = EventBandIBCAckSuccess.TYPE_URL)
public data class EventBandIBCAckSuccess(
  @ProtobufIndex(index = 1)
  public val ackResult: String,
  @ProtobufIndex(index = 2)
  public val clientId: Long,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/injective.oracle.v1beta1.EventBandIBCAckSuccess"
  }

  public object KotlinxSerializer : KSerializer<EventBandIBCAckSuccess> {
    private val delegator: KSerializer<EventBandIBCAckSuccess> = EventBandIBCAckSuccess.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: EventBandIBCAckSuccess): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(EventBandIBCAckSuccessConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): EventBandIBCAckSuccess {
      if (decoder is ProtobufMapperDecoder) {
        return EventBandIBCAckSuccessConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = EventBandIBCAckError.KotlinxSerializer::class)
@SerialName(value = EventBandIBCAckError.TYPE_URL)
public data class EventBandIBCAckError(
  @ProtobufIndex(index = 1)
  public val ackError: String,
  @ProtobufIndex(index = 2)
  public val clientId: Long,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/injective.oracle.v1beta1.EventBandIBCAckError"
  }

  public object KotlinxSerializer : KSerializer<EventBandIBCAckError> {
    private val delegator: KSerializer<EventBandIBCAckError> = EventBandIBCAckError.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: EventBandIBCAckError): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(EventBandIBCAckErrorConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): EventBandIBCAckError {
      if (decoder is ProtobufMapperDecoder) {
        return EventBandIBCAckErrorConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = EventBandIBCResponseTimeout.KotlinxSerializer::class)
@SerialName(value = EventBandIBCResponseTimeout.TYPE_URL)
public data class EventBandIBCResponseTimeout(
  @ProtobufIndex(index = 1)
  public val clientId: Long,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/injective.oracle.v1beta1.EventBandIBCResponseTimeout"
  }

  public object KotlinxSerializer : KSerializer<EventBandIBCResponseTimeout> {
    private val delegator: KSerializer<EventBandIBCResponseTimeout> =
        EventBandIBCResponseTimeout.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: EventBandIBCResponseTimeout): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(EventBandIBCResponseTimeoutConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): EventBandIBCResponseTimeout {
      if (decoder is ProtobufMapperDecoder) {
        return EventBandIBCResponseTimeoutConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = SetPriceFeedPriceEvent.KotlinxSerializer::class)
@SerialName(value = SetPriceFeedPriceEvent.TYPE_URL)
public data class SetPriceFeedPriceEvent(
  @ProtobufIndex(index = 1)
  public val relayer: String,
  @ProtobufIndex(index = 2)
  public val base: String,
  @ProtobufIndex(index = 3)
  public val quote: String,
  @ProtobufIndex(index = 4)
  public val price: String,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/injective.oracle.v1beta1.SetPriceFeedPriceEvent"
  }

  public object KotlinxSerializer : KSerializer<SetPriceFeedPriceEvent> {
    private val delegator: KSerializer<SetPriceFeedPriceEvent> = SetPriceFeedPriceEvent.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: SetPriceFeedPriceEvent): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(SetPriceFeedPriceEventConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): SetPriceFeedPriceEvent {
      if (decoder is ProtobufMapperDecoder) {
        return SetPriceFeedPriceEventConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = SetProviderPriceEvent.KotlinxSerializer::class)
@SerialName(value = SetProviderPriceEvent.TYPE_URL)
public data class SetProviderPriceEvent(
  @ProtobufIndex(index = 1)
  public val provider: String,
  @ProtobufIndex(index = 2)
  public val relayer: String,
  @ProtobufIndex(index = 3)
  public val symbol: String,
  @ProtobufIndex(index = 4)
  public val price: String,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/injective.oracle.v1beta1.SetProviderPriceEvent"
  }

  public object KotlinxSerializer : KSerializer<SetProviderPriceEvent> {
    private val delegator: KSerializer<SetProviderPriceEvent> = SetProviderPriceEvent.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: SetProviderPriceEvent): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(SetProviderPriceEventConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): SetProviderPriceEvent {
      if (decoder is ProtobufMapperDecoder) {
        return SetProviderPriceEventConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = SetCoinbasePriceEvent.KotlinxSerializer::class)
@SerialName(value = SetCoinbasePriceEvent.TYPE_URL)
public data class SetCoinbasePriceEvent(
  @ProtobufIndex(index = 1)
  public val symbol: String,
  @ProtobufIndex(index = 2)
  public val price: String,
  @ProtobufIndex(index = 3)
  public val timestamp: ULong,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/injective.oracle.v1beta1.SetCoinbasePriceEvent"
  }

  public object KotlinxSerializer : KSerializer<SetCoinbasePriceEvent> {
    private val delegator: KSerializer<SetCoinbasePriceEvent> = SetCoinbasePriceEvent.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: SetCoinbasePriceEvent): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(SetCoinbasePriceEventConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): SetCoinbasePriceEvent {
      if (decoder is ProtobufMapperDecoder) {
        return SetCoinbasePriceEventConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = EventSetPythPrices.KotlinxSerializer::class)
@SerialName(value = EventSetPythPrices.TYPE_URL)
public data class EventSetPythPrices(
  @ProtobufIndex(index = 1)
  public val prices: List<PythPriceState>,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/injective.oracle.v1beta1.EventSetPythPrices"
  }

  public object KotlinxSerializer : KSerializer<EventSetPythPrices> {
    private val delegator: KSerializer<EventSetPythPrices> = EventSetPythPrices.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: EventSetPythPrices): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(EventSetPythPricesConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): EventSetPythPrices {
      if (decoder is ProtobufMapperDecoder) {
        return EventSetPythPricesConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}
