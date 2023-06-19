// Transform from tendermint/p2p/conn.proto
@file:ProtobufSyntax(syntax = "PROTO3")
@file:GeneratorVersion(version = "0.3.1")

package tendermint.p2p

import kotlin.Boolean
import kotlin.ByteArray
import kotlin.Int
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
import tendermint.crypto.PublicKey

@Serializable(with = PacketPing.KotlinxSerializer::class)
@SerialName(value = PacketPing.TYPE_URL)
public class PacketPing() : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/tendermint.p2p.PacketPing"
  }

  public object KotlinxSerializer : KSerializer<PacketPing> {
    private val delegator: KSerializer<PacketPing> = PacketPing.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: PacketPing): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(PacketPingConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): PacketPing {
      if (decoder is ProtobufMapperDecoder) {
        return PacketPingConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = PacketPong.KotlinxSerializer::class)
@SerialName(value = PacketPong.TYPE_URL)
public class PacketPong() : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/tendermint.p2p.PacketPong"
  }

  public object KotlinxSerializer : KSerializer<PacketPong> {
    private val delegator: KSerializer<PacketPong> = PacketPong.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: PacketPong): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(PacketPongConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): PacketPong {
      if (decoder is ProtobufMapperDecoder) {
        return PacketPongConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = PacketMsg.KotlinxSerializer::class)
@SerialName(value = PacketMsg.TYPE_URL)
public data class PacketMsg(
  @ProtobufIndex(index = 1)
  public val channelId: Int,
  @ProtobufIndex(index = 2)
  public val eof: Boolean,
  @ProtobufIndex(index = 3)
  public val `data`: ByteArray,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/tendermint.p2p.PacketMsg"
  }

  public object KotlinxSerializer : KSerializer<PacketMsg> {
    private val delegator: KSerializer<PacketMsg> = PacketMsg.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: PacketMsg): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(PacketMsgConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): PacketMsg {
      if (decoder is ProtobufMapperDecoder) {
        return PacketMsgConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = Packet.KotlinxSerializer::class)
@SerialName(value = Packet.TYPE_URL)
public data class Packet(
  public val sum: SumOneOf,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/tendermint.p2p.Packet"
  }

  @Serializable
  public sealed interface SumOneOf {
    @JvmInline
    public value class PacketPing(
      @ProtobufIndex(index = 1)
      public val `value`: tendermint.p2p.PacketPing,
    ) : SumOneOf

    @JvmInline
    public value class PacketPong(
      @ProtobufIndex(index = 2)
      public val `value`: tendermint.p2p.PacketPong,
    ) : SumOneOf

    @JvmInline
    public value class PacketMsg(
      @ProtobufIndex(index = 3)
      public val `value`: tendermint.p2p.PacketMsg,
    ) : SumOneOf
  }

  public object KotlinxSerializer : KSerializer<Packet> {
    private val delegator: KSerializer<Packet> = Packet.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: Packet): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(PacketConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): Packet {
      if (decoder is ProtobufMapperDecoder) {
        return PacketConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = AuthSigMessage.KotlinxSerializer::class)
@SerialName(value = AuthSigMessage.TYPE_URL)
public data class AuthSigMessage(
  @ProtobufIndex(index = 1)
  public val pubKey: PublicKey,
  @ProtobufIndex(index = 2)
  public val sig: ByteArray,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/tendermint.p2p.AuthSigMessage"
  }

  public object KotlinxSerializer : KSerializer<AuthSigMessage> {
    private val delegator: KSerializer<AuthSigMessage> = AuthSigMessage.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: AuthSigMessage): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(AuthSigMessageConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): AuthSigMessage {
      if (decoder is ProtobufMapperDecoder) {
        return AuthSigMessageConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}
