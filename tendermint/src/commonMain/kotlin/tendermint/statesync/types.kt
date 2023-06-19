// Transform from tendermint/statesync/types.proto
@file:ProtobufSyntax(syntax = "PROTO3")
@file:GeneratorVersion(version = "0.3.1")

package tendermint.statesync

import kotlin.Boolean
import kotlin.ByteArray
import kotlin.String
import kotlin.UInt
import kotlin.ULong
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

@Serializable(with = Message.KotlinxSerializer::class)
@SerialName(value = Message.TYPE_URL)
public data class Message(
  public val sum: SumOneOf,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/tendermint.statesync.Message"
  }

  @Serializable
  public sealed interface SumOneOf {
    @JvmInline
    public value class SnapshotsRequest(
      @ProtobufIndex(index = 1)
      public val `value`: tendermint.statesync.SnapshotsRequest,
    ) : SumOneOf

    @JvmInline
    public value class SnapshotsResponse(
      @ProtobufIndex(index = 2)
      public val `value`: tendermint.statesync.SnapshotsResponse,
    ) : SumOneOf

    @JvmInline
    public value class ChunkRequest(
      @ProtobufIndex(index = 3)
      public val `value`: tendermint.statesync.ChunkRequest,
    ) : SumOneOf

    @JvmInline
    public value class ChunkResponse(
      @ProtobufIndex(index = 4)
      public val `value`: tendermint.statesync.ChunkResponse,
    ) : SumOneOf
  }

  public object KotlinxSerializer : KSerializer<Message> {
    private val delegator: KSerializer<Message> = Message.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: Message): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(MessageConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): Message {
      if (decoder is ProtobufMapperDecoder) {
        return MessageConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = SnapshotsRequest.KotlinxSerializer::class)
@SerialName(value = SnapshotsRequest.TYPE_URL)
public class SnapshotsRequest() : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/tendermint.statesync.SnapshotsRequest"
  }

  public object KotlinxSerializer : KSerializer<SnapshotsRequest> {
    private val delegator: KSerializer<SnapshotsRequest> = SnapshotsRequest.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: SnapshotsRequest): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(SnapshotsRequestConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): SnapshotsRequest {
      if (decoder is ProtobufMapperDecoder) {
        return SnapshotsRequestConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = SnapshotsResponse.KotlinxSerializer::class)
@SerialName(value = SnapshotsResponse.TYPE_URL)
public data class SnapshotsResponse(
  @ProtobufIndex(index = 1)
  public val height: ULong,
  @ProtobufIndex(index = 2)
  public val format: UInt,
  @ProtobufIndex(index = 3)
  public val chunks: UInt,
  @ProtobufIndex(index = 4)
  public val hash: ByteArray,
  @ProtobufIndex(index = 5)
  public val metadata: ByteArray,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/tendermint.statesync.SnapshotsResponse"
  }

  public object KotlinxSerializer : KSerializer<SnapshotsResponse> {
    private val delegator: KSerializer<SnapshotsResponse> = SnapshotsResponse.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: SnapshotsResponse): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(SnapshotsResponseConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): SnapshotsResponse {
      if (decoder is ProtobufMapperDecoder) {
        return SnapshotsResponseConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = ChunkRequest.KotlinxSerializer::class)
@SerialName(value = ChunkRequest.TYPE_URL)
public data class ChunkRequest(
  @ProtobufIndex(index = 1)
  public val height: ULong,
  @ProtobufIndex(index = 2)
  public val format: UInt,
  @ProtobufIndex(index = 3)
  public val index: UInt,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/tendermint.statesync.ChunkRequest"
  }

  public object KotlinxSerializer : KSerializer<ChunkRequest> {
    private val delegator: KSerializer<ChunkRequest> = ChunkRequest.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: ChunkRequest): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(ChunkRequestConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): ChunkRequest {
      if (decoder is ProtobufMapperDecoder) {
        return ChunkRequestConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = ChunkResponse.KotlinxSerializer::class)
@SerialName(value = ChunkResponse.TYPE_URL)
public data class ChunkResponse(
  @ProtobufIndex(index = 1)
  public val height: ULong,
  @ProtobufIndex(index = 2)
  public val format: UInt,
  @ProtobufIndex(index = 3)
  public val index: UInt,
  @ProtobufIndex(index = 4)
  public val chunk: ByteArray,
  @ProtobufIndex(index = 5)
  public val missing: Boolean,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/tendermint.statesync.ChunkResponse"
  }

  public object KotlinxSerializer : KSerializer<ChunkResponse> {
    private val delegator: KSerializer<ChunkResponse> = ChunkResponse.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: ChunkResponse): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(ChunkResponseConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): ChunkResponse {
      if (decoder is ProtobufMapperDecoder) {
        return ChunkResponseConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}
