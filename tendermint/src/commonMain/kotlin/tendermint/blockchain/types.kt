// Transform from tendermint/blockchain/types.proto
@file:ProtobufSyntax(syntax = "PROTO3")
@file:GeneratorVersion(version = "0.3.1")

package tendermint.blockchain

import kotlin.Long
import kotlin.String
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
import tendermint.types.Block

@Serializable(with = BlockRequest.KotlinxSerializer::class)
@SerialName(value = BlockRequest.TYPE_URL)
public data class BlockRequest(
  @ProtobufIndex(index = 1)
  public val height: Long,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/tendermint.blockchain.BlockRequest"
  }

  public object KotlinxSerializer : KSerializer<BlockRequest> {
    private val delegator: KSerializer<BlockRequest> = BlockRequest.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: BlockRequest): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(BlockRequestConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): BlockRequest {
      if (decoder is ProtobufMapperDecoder) {
        return BlockRequestConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = NoBlockResponse.KotlinxSerializer::class)
@SerialName(value = NoBlockResponse.TYPE_URL)
public data class NoBlockResponse(
  @ProtobufIndex(index = 1)
  public val height: Long,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/tendermint.blockchain.NoBlockResponse"
  }

  public object KotlinxSerializer : KSerializer<NoBlockResponse> {
    private val delegator: KSerializer<NoBlockResponse> = NoBlockResponse.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: NoBlockResponse): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(NoBlockResponseConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): NoBlockResponse {
      if (decoder is ProtobufMapperDecoder) {
        return NoBlockResponseConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = BlockResponse.KotlinxSerializer::class)
@SerialName(value = BlockResponse.TYPE_URL)
public data class BlockResponse(
  @ProtobufIndex(index = 1)
  public val block: Block,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/tendermint.blockchain.BlockResponse"
  }

  public object KotlinxSerializer : KSerializer<BlockResponse> {
    private val delegator: KSerializer<BlockResponse> = BlockResponse.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: BlockResponse): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(BlockResponseConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): BlockResponse {
      if (decoder is ProtobufMapperDecoder) {
        return BlockResponseConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = StatusRequest.KotlinxSerializer::class)
@SerialName(value = StatusRequest.TYPE_URL)
public class StatusRequest() : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/tendermint.blockchain.StatusRequest"
  }

  public object KotlinxSerializer : KSerializer<StatusRequest> {
    private val delegator: KSerializer<StatusRequest> = StatusRequest.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: StatusRequest): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(StatusRequestConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): StatusRequest {
      if (decoder is ProtobufMapperDecoder) {
        return StatusRequestConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = StatusResponse.KotlinxSerializer::class)
@SerialName(value = StatusResponse.TYPE_URL)
public data class StatusResponse(
  @ProtobufIndex(index = 1)
  public val height: Long,
  @ProtobufIndex(index = 2)
  public val base: Long,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/tendermint.blockchain.StatusResponse"
  }

  public object KotlinxSerializer : KSerializer<StatusResponse> {
    private val delegator: KSerializer<StatusResponse> = StatusResponse.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: StatusResponse): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(StatusResponseConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): StatusResponse {
      if (decoder is ProtobufMapperDecoder) {
        return StatusResponseConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = Message.KotlinxSerializer::class)
@SerialName(value = Message.TYPE_URL)
public data class Message(
  public val sum: SumOneOf,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/tendermint.blockchain.Message"
  }

  @Serializable
  public sealed interface SumOneOf {
    @JvmInline
    public value class BlockRequest(
      @ProtobufIndex(index = 1)
      public val `value`: tendermint.blockchain.BlockRequest,
    ) : SumOneOf

    @JvmInline
    public value class NoBlockResponse(
      @ProtobufIndex(index = 2)
      public val `value`: tendermint.blockchain.NoBlockResponse,
    ) : SumOneOf

    @JvmInline
    public value class BlockResponse(
      @ProtobufIndex(index = 3)
      public val `value`: tendermint.blockchain.BlockResponse,
    ) : SumOneOf

    @JvmInline
    public value class StatusRequest(
      @ProtobufIndex(index = 4)
      public val `value`: tendermint.blockchain.StatusRequest,
    ) : SumOneOf

    @JvmInline
    public value class StatusResponse(
      @ProtobufIndex(index = 5)
      public val `value`: tendermint.blockchain.StatusResponse,
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
