// Transform from injective/wasmx/v1/events.proto
@file:ProtobufSyntax(syntax = "PROTO3")
@file:GeneratorVersion(version = "0.3.1")

package injective.wasmx.v1

import kotlin.Boolean
import kotlin.ByteArray
import kotlin.String
import kotlin.ULong
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

@Serializable(with = EventContractExecution.KotlinxSerializer::class)
@SerialName(value = EventContractExecution.TYPE_URL)
public data class EventContractExecution(
  @ProtobufIndex(index = 1)
  public val contractAddress: String,
  @ProtobufIndex(index = 2)
  public val response: ByteArray,
  @ProtobufIndex(index = 3)
  public val otherError: String,
  @ProtobufIndex(index = 4)
  public val executionError: String,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/injective.wasmx.v1.EventContractExecution"
  }

  public object KotlinxSerializer : KSerializer<EventContractExecution> {
    private val delegator: KSerializer<EventContractExecution> = EventContractExecution.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: EventContractExecution): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(EventContractExecutionConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): EventContractExecution {
      if (decoder is ProtobufMapperDecoder) {
        return EventContractExecutionConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = EventContractRegistered.KotlinxSerializer::class)
@SerialName(value = EventContractRegistered.TYPE_URL)
public data class EventContractRegistered(
  @ProtobufIndex(index = 1)
  public val contractAddress: String,
  @ProtobufIndex(index = 3)
  public val gasPrice: ULong,
  @ProtobufIndex(index = 4)
  public val shouldPinContract: Boolean,
  @ProtobufIndex(index = 5)
  public val isMigrationAllowed: Boolean,
  @ProtobufIndex(index = 6)
  public val codeId: ULong,
  @ProtobufIndex(index = 7)
  public val adminAddress: String,
  @ProtobufIndex(index = 8)
  public val granterAddress: String,
  @ProtobufIndex(index = 9)
  public val fundingMode: FundingMode,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/injective.wasmx.v1.EventContractRegistered"
  }

  public object KotlinxSerializer : KSerializer<EventContractRegistered> {
    private val delegator: KSerializer<EventContractRegistered> =
        EventContractRegistered.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: EventContractRegistered): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(EventContractRegisteredConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): EventContractRegistered {
      if (decoder is ProtobufMapperDecoder) {
        return EventContractRegisteredConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = EventContractDeregistered.KotlinxSerializer::class)
@SerialName(value = EventContractDeregistered.TYPE_URL)
public data class EventContractDeregistered(
  @ProtobufIndex(index = 1)
  public val contractAddress: String,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/injective.wasmx.v1.EventContractDeregistered"
  }

  public object KotlinxSerializer : KSerializer<EventContractDeregistered> {
    private val delegator: KSerializer<EventContractDeregistered> =
        EventContractDeregistered.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: EventContractDeregistered): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(EventContractDeregisteredConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): EventContractDeregistered {
      if (decoder is ProtobufMapperDecoder) {
        return EventContractDeregisteredConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}
