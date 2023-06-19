// Transform from tendermint/mempool/types.proto
@file:ProtobufSyntax(syntax = "PROTO3")
@file:GeneratorVersion(version = "0.3.1")

package tendermint.mempool

import kotlin.ByteArray
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
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

@Serializable(with = Txs.KotlinxSerializer::class)
@SerialName(value = Txs.TYPE_URL)
public data class Txs(
  @ProtobufIndex(index = 1)
  public val txs: List<ByteArray>,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/tendermint.mempool.Txs"
  }

  public object KotlinxSerializer : KSerializer<Txs> {
    private val delegator: KSerializer<Txs> = Txs.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: Txs): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(TxsConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): Txs {
      if (decoder is ProtobufMapperDecoder) {
        return TxsConverter.deserialize(decoder.decodeByteArray())
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
    public const val TYPE_URL: String = "/tendermint.mempool.Message"
  }

  @Serializable
  public sealed interface SumOneOf {
    @JvmInline
    public value class Txs(
      @ProtobufIndex(index = 1)
      public val `value`: tendermint.mempool.Txs,
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
