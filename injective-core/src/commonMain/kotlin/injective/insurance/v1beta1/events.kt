// Transform from injective/insurance/v1beta1/events.proto
@file:ProtobufSyntax(syntax = "PROTO3")
@file:GeneratorVersion(version = "0.3.1")

package injective.insurance.v1beta1

import cosmos.base.v1beta1.Coin
import kotlin.String
import kotlin.Unit
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

@Serializable(with = EventInsuranceFundUpdate.KotlinxSerializer::class)
@SerialName(value = EventInsuranceFundUpdate.TYPE_URL)
public data class EventInsuranceFundUpdate(
  @ProtobufIndex(index = 1)
  public val fund: InsuranceFund,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/injective.insurance.v1beta1.EventInsuranceFundUpdate"
  }

  public object KotlinxSerializer : KSerializer<EventInsuranceFundUpdate> {
    private val delegator: KSerializer<EventInsuranceFundUpdate> =
        EventInsuranceFundUpdate.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: EventInsuranceFundUpdate): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(EventInsuranceFundUpdateConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): EventInsuranceFundUpdate {
      if (decoder is ProtobufMapperDecoder) {
        return EventInsuranceFundUpdateConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = EventRequestRedemption.KotlinxSerializer::class)
@SerialName(value = EventRequestRedemption.TYPE_URL)
public data class EventRequestRedemption(
  @ProtobufIndex(index = 1)
  public val schedule: RedemptionSchedule,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/injective.insurance.v1beta1.EventRequestRedemption"
  }

  public object KotlinxSerializer : KSerializer<EventRequestRedemption> {
    private val delegator: KSerializer<EventRequestRedemption> = EventRequestRedemption.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: EventRequestRedemption): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(EventRequestRedemptionConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): EventRequestRedemption {
      if (decoder is ProtobufMapperDecoder) {
        return EventRequestRedemptionConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = EventWithdrawRedemption.KotlinxSerializer::class)
@SerialName(value = EventWithdrawRedemption.TYPE_URL)
public data class EventWithdrawRedemption(
  @ProtobufIndex(index = 1)
  public val schedule: RedemptionSchedule,
  @ProtobufIndex(index = 2)
  public val redeemCoin: Coin,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/injective.insurance.v1beta1.EventWithdrawRedemption"
  }

  public object KotlinxSerializer : KSerializer<EventWithdrawRedemption> {
    private val delegator: KSerializer<EventWithdrawRedemption> =
        EventWithdrawRedemption.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: EventWithdrawRedemption): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(EventWithdrawRedemptionConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): EventWithdrawRedemption {
      if (decoder is ProtobufMapperDecoder) {
        return EventWithdrawRedemptionConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = EventUnderwrite.KotlinxSerializer::class)
@SerialName(value = EventUnderwrite.TYPE_URL)
public data class EventUnderwrite(
  @ProtobufIndex(index = 1)
  public val underwriter: String,
  @ProtobufIndex(index = 2)
  public val marketId: String,
  @ProtobufIndex(index = 3)
  public val deposit: Coin,
  @ProtobufIndex(index = 4)
  public val shares: Coin,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/injective.insurance.v1beta1.EventUnderwrite"
  }

  public object KotlinxSerializer : KSerializer<EventUnderwrite> {
    private val delegator: KSerializer<EventUnderwrite> = EventUnderwrite.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: EventUnderwrite): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(EventUnderwriteConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): EventUnderwrite {
      if (decoder is ProtobufMapperDecoder) {
        return EventUnderwriteConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = EventInsuranceWithdraw.KotlinxSerializer::class)
@SerialName(value = EventInsuranceWithdraw.TYPE_URL)
public data class EventInsuranceWithdraw(
  @ProtobufIndex(index = 1)
  public val marketId: String,
  @ProtobufIndex(index = 2)
  public val marketTicker: String,
  @ProtobufIndex(index = 3)
  public val withdrawal: Coin,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/injective.insurance.v1beta1.EventInsuranceWithdraw"
  }

  public object KotlinxSerializer : KSerializer<EventInsuranceWithdraw> {
    private val delegator: KSerializer<EventInsuranceWithdraw> = EventInsuranceWithdraw.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: EventInsuranceWithdraw): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(EventInsuranceWithdrawConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): EventInsuranceWithdraw {
      if (decoder is ProtobufMapperDecoder) {
        return EventInsuranceWithdrawConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}
