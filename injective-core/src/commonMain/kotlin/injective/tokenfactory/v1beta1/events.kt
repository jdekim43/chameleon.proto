// Transform from injective/tokenfactory/v1beta1/events.proto
@file:ProtobufSyntax(syntax = "PROTO3")
@file:GeneratorVersion(version = "0.3.1")

package injective.tokenfactory.v1beta1

import cosmos.bank.v1beta1.Metadata
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

@Serializable(with = EventCreateTFDenom.KotlinxSerializer::class)
@SerialName(value = EventCreateTFDenom.TYPE_URL)
public data class EventCreateTFDenom(
  @ProtobufIndex(index = 1)
  public val account: String,
  @ProtobufIndex(index = 2)
  public val denom: String,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/injective.tokenfactory.v1beta1.EventCreateTFDenom"
  }

  public object KotlinxSerializer : KSerializer<EventCreateTFDenom> {
    private val delegator: KSerializer<EventCreateTFDenom> = EventCreateTFDenom.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: EventCreateTFDenom): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(EventCreateTFDenomConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): EventCreateTFDenom {
      if (decoder is ProtobufMapperDecoder) {
        return EventCreateTFDenomConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = EventMintTFDenom.KotlinxSerializer::class)
@SerialName(value = EventMintTFDenom.TYPE_URL)
public data class EventMintTFDenom(
  @ProtobufIndex(index = 1)
  public val recipientAddress: String,
  @ProtobufIndex(index = 2)
  public val amount: Coin,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/injective.tokenfactory.v1beta1.EventMintTFDenom"
  }

  public object KotlinxSerializer : KSerializer<EventMintTFDenom> {
    private val delegator: KSerializer<EventMintTFDenom> = EventMintTFDenom.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: EventMintTFDenom): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(EventMintTFDenomConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): EventMintTFDenom {
      if (decoder is ProtobufMapperDecoder) {
        return EventMintTFDenomConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = EventBurnDenom.KotlinxSerializer::class)
@SerialName(value = EventBurnDenom.TYPE_URL)
public data class EventBurnDenom(
  @ProtobufIndex(index = 1)
  public val burnerAddress: String,
  @ProtobufIndex(index = 2)
  public val amount: Coin,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/injective.tokenfactory.v1beta1.EventBurnDenom"
  }

  public object KotlinxSerializer : KSerializer<EventBurnDenom> {
    private val delegator: KSerializer<EventBurnDenom> = EventBurnDenom.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: EventBurnDenom): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(EventBurnDenomConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): EventBurnDenom {
      if (decoder is ProtobufMapperDecoder) {
        return EventBurnDenomConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = EventChangeTFAdmin.KotlinxSerializer::class)
@SerialName(value = EventChangeTFAdmin.TYPE_URL)
public data class EventChangeTFAdmin(
  @ProtobufIndex(index = 1)
  public val denom: String,
  @ProtobufIndex(index = 2)
  public val newAdminAddress: String,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/injective.tokenfactory.v1beta1.EventChangeTFAdmin"
  }

  public object KotlinxSerializer : KSerializer<EventChangeTFAdmin> {
    private val delegator: KSerializer<EventChangeTFAdmin> = EventChangeTFAdmin.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: EventChangeTFAdmin): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(EventChangeTFAdminConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): EventChangeTFAdmin {
      if (decoder is ProtobufMapperDecoder) {
        return EventChangeTFAdminConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = EventSetTFDenomMetadata.KotlinxSerializer::class)
@SerialName(value = EventSetTFDenomMetadata.TYPE_URL)
public data class EventSetTFDenomMetadata(
  @ProtobufIndex(index = 1)
  public val denom: String,
  @ProtobufIndex(index = 2)
  public val metadata: Metadata,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/injective.tokenfactory.v1beta1.EventSetTFDenomMetadata"
  }

  public object KotlinxSerializer : KSerializer<EventSetTFDenomMetadata> {
    private val delegator: KSerializer<EventSetTFDenomMetadata> =
        EventSetTFDenomMetadata.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: EventSetTFDenomMetadata): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(EventSetTFDenomMetadataConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): EventSetTFDenomMetadata {
      if (decoder is ProtobufMapperDecoder) {
        return EventSetTFDenomMetadataConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}
