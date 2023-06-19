// Transform from tendermint/consensus/types.proto
@file:ProtobufSyntax(syntax = "PROTO3")
@file:GeneratorVersion(version = "0.3.1")

package tendermint.consensus

import kotlin.Boolean
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
import tendermint.libs.bits.BitArray
import tendermint.types.BlockID
import tendermint.types.Part
import tendermint.types.PartSetHeader
import tendermint.types.SignedMsgType

@Serializable(with = NewRoundStep.KotlinxSerializer::class)
@SerialName(value = NewRoundStep.TYPE_URL)
public data class NewRoundStep(
  @ProtobufIndex(index = 1)
  public val height: Long,
  @ProtobufIndex(index = 2)
  public val round: Int,
  @ProtobufIndex(index = 3)
  public val step: UInt,
  @ProtobufIndex(index = 4)
  public val secondsSinceStartTime: Long,
  @ProtobufIndex(index = 5)
  public val lastCommitRound: Int,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/tendermint.consensus.NewRoundStep"
  }

  public object KotlinxSerializer : KSerializer<NewRoundStep> {
    private val delegator: KSerializer<NewRoundStep> = NewRoundStep.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: NewRoundStep): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(NewRoundStepConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): NewRoundStep {
      if (decoder is ProtobufMapperDecoder) {
        return NewRoundStepConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = NewValidBlock.KotlinxSerializer::class)
@SerialName(value = NewValidBlock.TYPE_URL)
public data class NewValidBlock(
  @ProtobufIndex(index = 1)
  public val height: Long,
  @ProtobufIndex(index = 2)
  public val round: Int,
  @ProtobufIndex(index = 3)
  public val blockPartSetHeader: PartSetHeader,
  @ProtobufIndex(index = 4)
  public val blockParts: BitArray,
  @ProtobufIndex(index = 5)
  public val isCommit: Boolean,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/tendermint.consensus.NewValidBlock"
  }

  public object KotlinxSerializer : KSerializer<NewValidBlock> {
    private val delegator: KSerializer<NewValidBlock> = NewValidBlock.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: NewValidBlock): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(NewValidBlockConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): NewValidBlock {
      if (decoder is ProtobufMapperDecoder) {
        return NewValidBlockConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = Proposal.KotlinxSerializer::class)
@SerialName(value = Proposal.TYPE_URL)
public data class Proposal(
  @ProtobufIndex(index = 1)
  public val proposal: tendermint.types.Proposal,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/tendermint.consensus.Proposal"
  }

  public object KotlinxSerializer : KSerializer<Proposal> {
    private val delegator: KSerializer<Proposal> = Proposal.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: Proposal): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(ProposalConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): Proposal {
      if (decoder is ProtobufMapperDecoder) {
        return ProposalConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = ProposalPOL.KotlinxSerializer::class)
@SerialName(value = ProposalPOL.TYPE_URL)
public data class ProposalPOL(
  @ProtobufIndex(index = 1)
  public val height: Long,
  @ProtobufIndex(index = 2)
  public val proposalPolRound: Int,
  @ProtobufIndex(index = 3)
  public val proposalPol: BitArray,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/tendermint.consensus.ProposalPOL"
  }

  public object KotlinxSerializer : KSerializer<ProposalPOL> {
    private val delegator: KSerializer<ProposalPOL> = ProposalPOL.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: ProposalPOL): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(ProposalPOLConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): ProposalPOL {
      if (decoder is ProtobufMapperDecoder) {
        return ProposalPOLConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = BlockPart.KotlinxSerializer::class)
@SerialName(value = BlockPart.TYPE_URL)
public data class BlockPart(
  @ProtobufIndex(index = 1)
  public val height: Long,
  @ProtobufIndex(index = 2)
  public val round: Int,
  @ProtobufIndex(index = 3)
  public val part: Part,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/tendermint.consensus.BlockPart"
  }

  public object KotlinxSerializer : KSerializer<BlockPart> {
    private val delegator: KSerializer<BlockPart> = BlockPart.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: BlockPart): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(BlockPartConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): BlockPart {
      if (decoder is ProtobufMapperDecoder) {
        return BlockPartConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = Vote.KotlinxSerializer::class)
@SerialName(value = Vote.TYPE_URL)
public data class Vote(
  @ProtobufIndex(index = 1)
  public val vote: tendermint.types.Vote,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/tendermint.consensus.Vote"
  }

  public object KotlinxSerializer : KSerializer<Vote> {
    private val delegator: KSerializer<Vote> = Vote.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: Vote): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(VoteConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): Vote {
      if (decoder is ProtobufMapperDecoder) {
        return VoteConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = HasVote.KotlinxSerializer::class)
@SerialName(value = HasVote.TYPE_URL)
public data class HasVote(
  @ProtobufIndex(index = 1)
  public val height: Long,
  @ProtobufIndex(index = 2)
  public val round: Int,
  @ProtobufIndex(index = 3)
  public val type: SignedMsgType,
  @ProtobufIndex(index = 4)
  public val index: Int,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/tendermint.consensus.HasVote"
  }

  public object KotlinxSerializer : KSerializer<HasVote> {
    private val delegator: KSerializer<HasVote> = HasVote.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: HasVote): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(HasVoteConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): HasVote {
      if (decoder is ProtobufMapperDecoder) {
        return HasVoteConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = VoteSetMaj23.KotlinxSerializer::class)
@SerialName(value = VoteSetMaj23.TYPE_URL)
public data class VoteSetMaj23(
  @ProtobufIndex(index = 1)
  public val height: Long,
  @ProtobufIndex(index = 2)
  public val round: Int,
  @ProtobufIndex(index = 3)
  public val type: SignedMsgType,
  @ProtobufIndex(index = 4)
  public val blockId: BlockID,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/tendermint.consensus.VoteSetMaj23"
  }

  public object KotlinxSerializer : KSerializer<VoteSetMaj23> {
    private val delegator: KSerializer<VoteSetMaj23> = VoteSetMaj23.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: VoteSetMaj23): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(VoteSetMaj23Converter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): VoteSetMaj23 {
      if (decoder is ProtobufMapperDecoder) {
        return VoteSetMaj23Converter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = VoteSetBits.KotlinxSerializer::class)
@SerialName(value = VoteSetBits.TYPE_URL)
public data class VoteSetBits(
  @ProtobufIndex(index = 1)
  public val height: Long,
  @ProtobufIndex(index = 2)
  public val round: Int,
  @ProtobufIndex(index = 3)
  public val type: SignedMsgType,
  @ProtobufIndex(index = 4)
  public val blockId: BlockID,
  @ProtobufIndex(index = 5)
  public val votes: BitArray,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/tendermint.consensus.VoteSetBits"
  }

  public object KotlinxSerializer : KSerializer<VoteSetBits> {
    private val delegator: KSerializer<VoteSetBits> = VoteSetBits.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: VoteSetBits): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(VoteSetBitsConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): VoteSetBits {
      if (decoder is ProtobufMapperDecoder) {
        return VoteSetBitsConverter.deserialize(decoder.decodeByteArray())
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
    public const val TYPE_URL: String = "/tendermint.consensus.Message"
  }

  @Serializable
  public sealed interface SumOneOf {
    @JvmInline
    public value class NewRoundStep(
      @ProtobufIndex(index = 1)
      public val `value`: tendermint.consensus.NewRoundStep,
    ) : SumOneOf

    @JvmInline
    public value class NewValidBlock(
      @ProtobufIndex(index = 2)
      public val `value`: tendermint.consensus.NewValidBlock,
    ) : SumOneOf

    @JvmInline
    public value class Proposal(
      @ProtobufIndex(index = 3)
      public val `value`: tendermint.consensus.Proposal,
    ) : SumOneOf

    @JvmInline
    public value class ProposalPol(
      @ProtobufIndex(index = 4)
      public val `value`: ProposalPOL,
    ) : SumOneOf

    @JvmInline
    public value class BlockPart(
      @ProtobufIndex(index = 5)
      public val `value`: tendermint.consensus.BlockPart,
    ) : SumOneOf

    @JvmInline
    public value class Vote(
      @ProtobufIndex(index = 6)
      public val `value`: tendermint.consensus.Vote,
    ) : SumOneOf

    @JvmInline
    public value class HasVote(
      @ProtobufIndex(index = 7)
      public val `value`: tendermint.consensus.HasVote,
    ) : SumOneOf

    @JvmInline
    public value class VoteSetMaj23(
      @ProtobufIndex(index = 8)
      public val `value`: tendermint.consensus.VoteSetMaj23,
    ) : SumOneOf

    @JvmInline
    public value class VoteSetBits(
      @ProtobufIndex(index = 9)
      public val `value`: tendermint.consensus.VoteSetBits,
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
