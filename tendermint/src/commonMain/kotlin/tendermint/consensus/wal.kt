// Transform from tendermint/consensus/wal.proto
@file:ProtobufSyntax(syntax = "PROTO3")
@file:GeneratorVersion(version = "0.3.1")

package tendermint.consensus

import google.protobuf.Duration
import google.protobuf.Timestamp
import kotlin.Int
import kotlin.Long
import kotlin.String
import kotlin.UInt
import kotlin.Unit
import kotlin.jvm.JvmInline
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

@Serializable(with = MsgInfo.KotlinxSerializer::class)
@SerialName(value = MsgInfo.TYPE_URL)
public data class MsgInfo(
  @ProtobufIndex(index = 1)
  public val msg: Message,
  @ProtobufIndex(index = 2)
  public val peerId: String,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/tendermint.consensus.MsgInfo"
  }

  public object KotlinxSerializer : KSerializer<MsgInfo> {
    private val delegator: KSerializer<MsgInfo> = MsgInfo.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: MsgInfo): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(MsgInfoConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): MsgInfo {
      if (decoder is ProtobufMapperDecoder) {
        return MsgInfoConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = TimeoutInfo.KotlinxSerializer::class)
@SerialName(value = TimeoutInfo.TYPE_URL)
public data class TimeoutInfo(
  @ProtobufIndex(index = 1)
  public val duration: Duration,
  @ProtobufIndex(index = 2)
  public val height: Long,
  @ProtobufIndex(index = 3)
  public val round: Int,
  @ProtobufIndex(index = 4)
  public val step: UInt,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/tendermint.consensus.TimeoutInfo"
  }

  public object KotlinxSerializer : KSerializer<TimeoutInfo> {
    private val delegator: KSerializer<TimeoutInfo> = TimeoutInfo.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: TimeoutInfo): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(TimeoutInfoConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): TimeoutInfo {
      if (decoder is ProtobufMapperDecoder) {
        return TimeoutInfoConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = EndHeight.KotlinxSerializer::class)
@SerialName(value = EndHeight.TYPE_URL)
public data class EndHeight(
  @ProtobufIndex(index = 1)
  public val height: Long,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/tendermint.consensus.EndHeight"
  }

  public object KotlinxSerializer : KSerializer<EndHeight> {
    private val delegator: KSerializer<EndHeight> = EndHeight.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: EndHeight): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(EndHeightConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): EndHeight {
      if (decoder is ProtobufMapperDecoder) {
        return EndHeightConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = WALMessage.KotlinxSerializer::class)
@SerialName(value = WALMessage.TYPE_URL)
public data class WALMessage(
  public val sum: SumOneOf,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/tendermint.consensus.WALMessage"
  }

  @Serializable
  public sealed interface SumOneOf {
    @JvmInline
    public value class EventDataRoundState(
      @ProtobufIndex(index = 1)
      public val `value`: tendermint.types.EventDataRoundState,
    ) : SumOneOf

    @JvmInline
    public value class MsgInfo(
      @ProtobufIndex(index = 2)
      public val `value`: tendermint.consensus.MsgInfo,
    ) : SumOneOf

    @JvmInline
    public value class TimeoutInfo(
      @ProtobufIndex(index = 3)
      public val `value`: tendermint.consensus.TimeoutInfo,
    ) : SumOneOf

    @JvmInline
    public value class EndHeight(
      @ProtobufIndex(index = 4)
      public val `value`: tendermint.consensus.EndHeight,
    ) : SumOneOf
  }

  public object KotlinxSerializer : KSerializer<WALMessage> {
    private val delegator: KSerializer<WALMessage> = WALMessage.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: WALMessage): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(WALMessageConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): WALMessage {
      if (decoder is ProtobufMapperDecoder) {
        return WALMessageConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = TimedWALMessage.KotlinxSerializer::class)
@SerialName(value = TimedWALMessage.TYPE_URL)
public data class TimedWALMessage(
  @ProtobufIndex(index = 1)
  public val time: Timestamp,
  @ProtobufIndex(index = 2)
  public val msg: WALMessage,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/tendermint.consensus.TimedWALMessage"
  }

  public object KotlinxSerializer : KSerializer<TimedWALMessage> {
    private val delegator: KSerializer<TimedWALMessage> = TimedWALMessage.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: TimedWALMessage): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(TimedWALMessageConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): TimedWALMessage {
      if (decoder is ProtobufMapperDecoder) {
        return TimedWALMessageConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}
