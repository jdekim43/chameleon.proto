// Transform from tendermint/p2p/pex.proto
@file:ProtobufSyntax(syntax = "PROTO3")
@file:GeneratorVersion(version = "0.3.1")

package tendermint.p2p

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

@Serializable(with = PexRequest.KotlinxSerializer::class)
@SerialName(value = PexRequest.TYPE_URL)
public class PexRequest() : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/tendermint.p2p.PexRequest"
  }

  public object KotlinxSerializer : KSerializer<PexRequest> {
    private val delegator: KSerializer<PexRequest> = PexRequest.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: PexRequest): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(PexRequestConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): PexRequest {
      if (decoder is ProtobufMapperDecoder) {
        return PexRequestConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = PexAddrs.KotlinxSerializer::class)
@SerialName(value = PexAddrs.TYPE_URL)
public data class PexAddrs(
  @ProtobufIndex(index = 1)
  public val addrs: List<NetAddress>,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/tendermint.p2p.PexAddrs"
  }

  public object KotlinxSerializer : KSerializer<PexAddrs> {
    private val delegator: KSerializer<PexAddrs> = PexAddrs.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: PexAddrs): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(PexAddrsConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): PexAddrs {
      if (decoder is ProtobufMapperDecoder) {
        return PexAddrsConverter.deserialize(decoder.decodeByteArray())
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
    public const val TYPE_URL: String = "/tendermint.p2p.Message"
  }

  @Serializable
  public sealed interface SumOneOf {
    @JvmInline
    public value class PexRequest(
      @ProtobufIndex(index = 1)
      public val `value`: tendermint.p2p.PexRequest,
    ) : SumOneOf

    @JvmInline
    public value class PexAddrs(
      @ProtobufIndex(index = 2)
      public val `value`: tendermint.p2p.PexAddrs,
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
