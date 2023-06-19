// Transform from tendermint/types/canonical.proto
@file:ProtobufSyntax(syntax = "PROTO3")
@file:GeneratorVersion(version = "0.3.1")

package tendermint.types

import google.protobuf.Timestamp
import kotlin.ByteArray
import kotlin.Long
import kotlin.String
import kotlin.UInt
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

@Serializable(with = CanonicalBlockID.KotlinxSerializer::class)
@SerialName(value = CanonicalBlockID.TYPE_URL)
public data class CanonicalBlockID(
  @ProtobufIndex(index = 1)
  public val hash: ByteArray,
  @ProtobufIndex(index = 2)
  public val partSetHeader: CanonicalPartSetHeader,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/tendermint.types.CanonicalBlockID"
  }

  public object KotlinxSerializer : KSerializer<CanonicalBlockID> {
    private val delegator: KSerializer<CanonicalBlockID> = CanonicalBlockID.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: CanonicalBlockID): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(CanonicalBlockIDConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): CanonicalBlockID {
      if (decoder is ProtobufMapperDecoder) {
        return CanonicalBlockIDConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = CanonicalPartSetHeader.KotlinxSerializer::class)
@SerialName(value = CanonicalPartSetHeader.TYPE_URL)
public data class CanonicalPartSetHeader(
  @ProtobufIndex(index = 1)
  public val total: UInt,
  @ProtobufIndex(index = 2)
  public val hash: ByteArray,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/tendermint.types.CanonicalPartSetHeader"
  }

  public object KotlinxSerializer : KSerializer<CanonicalPartSetHeader> {
    private val delegator: KSerializer<CanonicalPartSetHeader> = CanonicalPartSetHeader.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: CanonicalPartSetHeader): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(CanonicalPartSetHeaderConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): CanonicalPartSetHeader {
      if (decoder is ProtobufMapperDecoder) {
        return CanonicalPartSetHeaderConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = CanonicalProposal.KotlinxSerializer::class)
@SerialName(value = CanonicalProposal.TYPE_URL)
public data class CanonicalProposal(
  @ProtobufIndex(index = 1)
  public val type: SignedMsgType,
  @ProtobufIndex(index = 2)
  public val height: Long,
  @ProtobufIndex(index = 3)
  public val round: Long,
  @ProtobufIndex(index = 4)
  public val polRound: Long,
  @ProtobufIndex(index = 5)
  public val blockId: CanonicalBlockID,
  @ProtobufIndex(index = 6)
  public val timestamp: Timestamp,
  @ProtobufIndex(index = 7)
  public val chainId: String,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/tendermint.types.CanonicalProposal"
  }

  public object KotlinxSerializer : KSerializer<CanonicalProposal> {
    private val delegator: KSerializer<CanonicalProposal> = CanonicalProposal.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: CanonicalProposal): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(CanonicalProposalConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): CanonicalProposal {
      if (decoder is ProtobufMapperDecoder) {
        return CanonicalProposalConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = CanonicalVote.KotlinxSerializer::class)
@SerialName(value = CanonicalVote.TYPE_URL)
public data class CanonicalVote(
  @ProtobufIndex(index = 1)
  public val type: SignedMsgType,
  @ProtobufIndex(index = 2)
  public val height: Long,
  @ProtobufIndex(index = 3)
  public val round: Long,
  @ProtobufIndex(index = 4)
  public val blockId: CanonicalBlockID,
  @ProtobufIndex(index = 5)
  public val timestamp: Timestamp,
  @ProtobufIndex(index = 6)
  public val chainId: String,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/tendermint.types.CanonicalVote"
  }

  public object KotlinxSerializer : KSerializer<CanonicalVote> {
    private val delegator: KSerializer<CanonicalVote> = CanonicalVote.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: CanonicalVote): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(CanonicalVoteConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): CanonicalVote {
      if (decoder is ProtobufMapperDecoder) {
        return CanonicalVoteConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}
