// Transform from tendermint/consensus/types.proto
@file:GeneratorVersion(version = "0.3.1")

package tendermint.consensus

import com.google.protobuf.Descriptors
import com.google.protobuf.Parser
import kr.jadekim.protobuf.`annotation`.GeneratorVersion
import kr.jadekim.protobuf.converter.mapper.ProtobufTypeMapper
import kr.jadekim.protobuf.util.asJavaType
import kr.jadekim.protobuf.util.asKotlinType
import tendermint.libs.bits.BitArrayJvmConverter
import tendermint.types.BlockIDJvmConverter
import tendermint.types.PartJvmConverter
import tendermint.types.PartSetHeaderJvmConverter
import tendermint.types.SignedMsgType

public object NewRoundStepJvmConverter : ProtobufTypeMapper<NewRoundStep, Types.NewRoundStep> {
  public override val descriptor: Descriptors.Descriptor = Types.NewRoundStep.getDescriptor()

  public override val parser: Parser<Types.NewRoundStep> = Types.NewRoundStep.parser()

  public override fun convert(obj: Types.NewRoundStep): NewRoundStep = NewRoundStep(
  	height = obj.getHeight(),
  	round = obj.getRound(),
  	step = obj.getStep().asKotlinType,
  	secondsSinceStartTime = obj.getSecondsSinceStartTime(),
  	lastCommitRound = obj.getLastCommitRound(),
  )

  public override fun convert(obj: NewRoundStep): Types.NewRoundStep {
    val builder = Types.NewRoundStep.newBuilder()
    builder.setHeight(obj.height)
    builder.setRound(obj.round)
    builder.setStep(obj.step.asJavaType)
    builder.setSecondsSinceStartTime(obj.secondsSinceStartTime)
    builder.setLastCommitRound(obj.lastCommitRound)
    return builder.build()
  }
}

public object NewValidBlockJvmConverter : ProtobufTypeMapper<NewValidBlock, Types.NewValidBlock> {
  public override val descriptor: Descriptors.Descriptor = Types.NewValidBlock.getDescriptor()

  public override val parser: Parser<Types.NewValidBlock> = Types.NewValidBlock.parser()

  public override fun convert(obj: Types.NewValidBlock): NewValidBlock = NewValidBlock(
  	height = obj.getHeight(),
  	round = obj.getRound(),
  	blockPartSetHeader = PartSetHeaderJvmConverter.convert(obj.getBlockPartSetHeader()),
  	blockParts = BitArrayJvmConverter.convert(obj.getBlockParts()),
  	isCommit = obj.getIsCommit(),
  )

  public override fun convert(obj: NewValidBlock): Types.NewValidBlock {
    val builder = Types.NewValidBlock.newBuilder()
    builder.setHeight(obj.height)
    builder.setRound(obj.round)
    builder.setBlockPartSetHeader(PartSetHeaderJvmConverter.convert(obj.blockPartSetHeader))
    builder.setBlockParts(BitArrayJvmConverter.convert(obj.blockParts))
    builder.setIsCommit(obj.isCommit)
    return builder.build()
  }
}

public object ProposalJvmConverter : ProtobufTypeMapper<Proposal, Types.Proposal> {
  public override val descriptor: Descriptors.Descriptor = Types.Proposal.getDescriptor()

  public override val parser: Parser<Types.Proposal> = Types.Proposal.parser()

  public override fun convert(obj: Types.Proposal): Proposal = Proposal(
  	proposal = tendermint.types.ProposalJvmConverter.convert(obj.getProposal()),
  )

  public override fun convert(obj: Proposal): Types.Proposal {
    val builder = Types.Proposal.newBuilder()
    builder.setProposal(tendermint.types.ProposalJvmConverter.convert(obj.proposal))
    return builder.build()
  }
}

public object ProposalPOLJvmConverter : ProtobufTypeMapper<ProposalPOL, Types.ProposalPOL> {
  public override val descriptor: Descriptors.Descriptor = Types.ProposalPOL.getDescriptor()

  public override val parser: Parser<Types.ProposalPOL> = Types.ProposalPOL.parser()

  public override fun convert(obj: Types.ProposalPOL): ProposalPOL = ProposalPOL(
  	height = obj.getHeight(),
  	proposalPolRound = obj.getProposalPolRound(),
  	proposalPol = BitArrayJvmConverter.convert(obj.getProposalPol()),
  )

  public override fun convert(obj: ProposalPOL): Types.ProposalPOL {
    val builder = Types.ProposalPOL.newBuilder()
    builder.setHeight(obj.height)
    builder.setProposalPolRound(obj.proposalPolRound)
    builder.setProposalPol(BitArrayJvmConverter.convert(obj.proposalPol))
    return builder.build()
  }
}

public object BlockPartJvmConverter : ProtobufTypeMapper<BlockPart, Types.BlockPart> {
  public override val descriptor: Descriptors.Descriptor = Types.BlockPart.getDescriptor()

  public override val parser: Parser<Types.BlockPart> = Types.BlockPart.parser()

  public override fun convert(obj: Types.BlockPart): BlockPart = BlockPart(
  	height = obj.getHeight(),
  	round = obj.getRound(),
  	part = PartJvmConverter.convert(obj.getPart()),
  )

  public override fun convert(obj: BlockPart): Types.BlockPart {
    val builder = Types.BlockPart.newBuilder()
    builder.setHeight(obj.height)
    builder.setRound(obj.round)
    builder.setPart(PartJvmConverter.convert(obj.part))
    return builder.build()
  }
}

public object VoteJvmConverter : ProtobufTypeMapper<Vote, Types.Vote> {
  public override val descriptor: Descriptors.Descriptor = Types.Vote.getDescriptor()

  public override val parser: Parser<Types.Vote> = Types.Vote.parser()

  public override fun convert(obj: Types.Vote): Vote = Vote(
  	vote = tendermint.types.VoteJvmConverter.convert(obj.getVote()),
  )

  public override fun convert(obj: Vote): Types.Vote {
    val builder = Types.Vote.newBuilder()
    builder.setVote(tendermint.types.VoteJvmConverter.convert(obj.vote))
    return builder.build()
  }
}

public object HasVoteJvmConverter : ProtobufTypeMapper<HasVote, Types.HasVote> {
  public override val descriptor: Descriptors.Descriptor = Types.HasVote.getDescriptor()

  public override val parser: Parser<Types.HasVote> = Types.HasVote.parser()

  public override fun convert(obj: Types.HasVote): HasVote = HasVote(
  	height = obj.getHeight(),
  	round = obj.getRound(),
  	type = SignedMsgType.forNumber(obj.getType().number),
  	index = obj.getIndex(),
  )

  public override fun convert(obj: HasVote): Types.HasVote {
    val builder = Types.HasVote.newBuilder()
    builder.setHeight(obj.height)
    builder.setRound(obj.round)
    builder.setType(tendermint.types.Types.SignedMsgType.forNumber(obj.type.number))
    builder.setIndex(obj.index)
    return builder.build()
  }
}

public object VoteSetMaj23JvmConverter : ProtobufTypeMapper<VoteSetMaj23, Types.VoteSetMaj23> {
  public override val descriptor: Descriptors.Descriptor = Types.VoteSetMaj23.getDescriptor()

  public override val parser: Parser<Types.VoteSetMaj23> = Types.VoteSetMaj23.parser()

  public override fun convert(obj: Types.VoteSetMaj23): VoteSetMaj23 = VoteSetMaj23(
  	height = obj.getHeight(),
  	round = obj.getRound(),
  	type = SignedMsgType.forNumber(obj.getType().number),
  	blockId = BlockIDJvmConverter.convert(obj.getBlockId()),
  )

  public override fun convert(obj: VoteSetMaj23): Types.VoteSetMaj23 {
    val builder = Types.VoteSetMaj23.newBuilder()
    builder.setHeight(obj.height)
    builder.setRound(obj.round)
    builder.setType(tendermint.types.Types.SignedMsgType.forNumber(obj.type.number))
    builder.setBlockId(BlockIDJvmConverter.convert(obj.blockId))
    return builder.build()
  }
}

public object VoteSetBitsJvmConverter : ProtobufTypeMapper<VoteSetBits, Types.VoteSetBits> {
  public override val descriptor: Descriptors.Descriptor = Types.VoteSetBits.getDescriptor()

  public override val parser: Parser<Types.VoteSetBits> = Types.VoteSetBits.parser()

  public override fun convert(obj: Types.VoteSetBits): VoteSetBits = VoteSetBits(
  	height = obj.getHeight(),
  	round = obj.getRound(),
  	type = SignedMsgType.forNumber(obj.getType().number),
  	blockId = BlockIDJvmConverter.convert(obj.getBlockId()),
  	votes = BitArrayJvmConverter.convert(obj.getVotes()),
  )

  public override fun convert(obj: VoteSetBits): Types.VoteSetBits {
    val builder = Types.VoteSetBits.newBuilder()
    builder.setHeight(obj.height)
    builder.setRound(obj.round)
    builder.setType(tendermint.types.Types.SignedMsgType.forNumber(obj.type.number))
    builder.setBlockId(BlockIDJvmConverter.convert(obj.blockId))
    builder.setVotes(BitArrayJvmConverter.convert(obj.votes))
    return builder.build()
  }
}

public object MessageJvmConverter : ProtobufTypeMapper<Message, Types.Message> {
  public override val descriptor: Descriptors.Descriptor = Types.Message.getDescriptor()

  public override val parser: Parser<Types.Message> = Types.Message.parser()

  public override fun convert(obj: Types.Message): Message = Message(
  	sum = mapOf(
  1 to { Message.SumOneOf.NewRoundStep(NewRoundStepJvmConverter.convert(obj.getNewRoundStep())) },
  2 to { Message.SumOneOf.NewValidBlock(NewValidBlockJvmConverter.convert(obj.getNewValidBlock()))
      },
  3 to { Message.SumOneOf.Proposal(ProposalJvmConverter.convert(obj.getProposal())) },
  4 to { Message.SumOneOf.ProposalPol(ProposalPOLJvmConverter.convert(obj.getProposalPol())) },
  5 to { Message.SumOneOf.BlockPart(BlockPartJvmConverter.convert(obj.getBlockPart())) },
  6 to { Message.SumOneOf.Vote(VoteJvmConverter.convert(obj.getVote())) },
  7 to { Message.SumOneOf.HasVote(HasVoteJvmConverter.convert(obj.getHasVote())) },
  8 to { Message.SumOneOf.VoteSetMaj23(VoteSetMaj23JvmConverter.convert(obj.getVoteSetMaj23())) },
  9 to { Message.SumOneOf.VoteSetBits(VoteSetBitsJvmConverter.convert(obj.getVoteSetBits())) },
  ).getValue(obj.sumCase.number)(),
  )

  public override fun convert(obj: Message): Types.Message {
    val builder = Types.Message.newBuilder()
    when (obj.sum) {
      is Message.SumOneOf.NewRoundStep ->
          builder.setNewRoundStep(NewRoundStepJvmConverter.convert(obj.sum.value))
      is Message.SumOneOf.NewValidBlock ->
          builder.setNewValidBlock(NewValidBlockJvmConverter.convert(obj.sum.value))
      is Message.SumOneOf.Proposal ->
          builder.setProposal(ProposalJvmConverter.convert(obj.sum.value))
      is Message.SumOneOf.ProposalPol ->
          builder.setProposalPol(ProposalPOLJvmConverter.convert(obj.sum.value))
      is Message.SumOneOf.BlockPart ->
          builder.setBlockPart(BlockPartJvmConverter.convert(obj.sum.value))
      is Message.SumOneOf.Vote -> builder.setVote(VoteJvmConverter.convert(obj.sum.value))
      is Message.SumOneOf.HasVote -> builder.setHasVote(HasVoteJvmConverter.convert(obj.sum.value))
      is Message.SumOneOf.VoteSetMaj23 ->
          builder.setVoteSetMaj23(VoteSetMaj23JvmConverter.convert(obj.sum.value))
      is Message.SumOneOf.VoteSetBits ->
          builder.setVoteSetBits(VoteSetBitsJvmConverter.convert(obj.sum.value))
    }
    return builder.build()
  }
}
