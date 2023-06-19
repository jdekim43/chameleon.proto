// Transform from tendermint/consensus/types.proto
@file:GeneratorVersion(version = "0.3.1")

package tendermint.consensus

import google.protobuf.Any
import java.lang.IllegalStateException
import kr.jadekim.protobuf.`annotation`.GeneratorVersion
import kr.jadekim.protobuf.converter.ProtobufConverter
import kr.jadekim.protobuf.converter.parseProtobuf

public expect object NewRoundStepConverter : ProtobufConverter<NewRoundStep>

public fun NewRoundStep.toAny(): Any = Any(NewRoundStep.TYPE_URL, with(NewRoundStepConverter) {
    toByteArray() })

public fun Any.parse(converter: ProtobufConverter<NewRoundStep>): NewRoundStep {
  if (typeUrl != NewRoundStep.TYPE_URL) throw IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object NewValidBlockConverter : ProtobufConverter<NewValidBlock>

public fun NewValidBlock.toAny(): Any = Any(NewValidBlock.TYPE_URL, with(NewValidBlockConverter) {
    toByteArray() })

public fun Any.parse(converter: ProtobufConverter<NewValidBlock>): NewValidBlock {
  if (typeUrl != NewValidBlock.TYPE_URL) throw IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object ProposalConverter : ProtobufConverter<Proposal>

public fun Proposal.toAny(): Any = Any(Proposal.TYPE_URL, with(ProposalConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<Proposal>): Proposal {
  if (typeUrl != Proposal.TYPE_URL) throw IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object ProposalPOLConverter : ProtobufConverter<ProposalPOL>

public fun ProposalPOL.toAny(): Any = Any(ProposalPOL.TYPE_URL, with(ProposalPOLConverter) {
    toByteArray() })

public fun Any.parse(converter: ProtobufConverter<ProposalPOL>): ProposalPOL {
  if (typeUrl != ProposalPOL.TYPE_URL) throw IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object BlockPartConverter : ProtobufConverter<BlockPart>

public fun BlockPart.toAny(): Any = Any(BlockPart.TYPE_URL, with(BlockPartConverter) { toByteArray()
    })

public fun Any.parse(converter: ProtobufConverter<BlockPart>): BlockPart {
  if (typeUrl != BlockPart.TYPE_URL) throw IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object VoteConverter : ProtobufConverter<Vote>

public fun Vote.toAny(): Any = Any(Vote.TYPE_URL, with(VoteConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<Vote>): Vote {
  if (typeUrl != Vote.TYPE_URL) throw IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object HasVoteConverter : ProtobufConverter<HasVote>

public fun HasVote.toAny(): Any = Any(HasVote.TYPE_URL, with(HasVoteConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<HasVote>): HasVote {
  if (typeUrl != HasVote.TYPE_URL) throw IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object VoteSetMaj23Converter : ProtobufConverter<VoteSetMaj23>

public fun VoteSetMaj23.toAny(): Any = Any(VoteSetMaj23.TYPE_URL, with(VoteSetMaj23Converter) {
    toByteArray() })

public fun Any.parse(converter: ProtobufConverter<VoteSetMaj23>): VoteSetMaj23 {
  if (typeUrl != VoteSetMaj23.TYPE_URL) throw IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object VoteSetBitsConverter : ProtobufConverter<VoteSetBits>

public fun VoteSetBits.toAny(): Any = Any(VoteSetBits.TYPE_URL, with(VoteSetBitsConverter) {
    toByteArray() })

public fun Any.parse(converter: ProtobufConverter<VoteSetBits>): VoteSetBits {
  if (typeUrl != VoteSetBits.TYPE_URL) throw IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object MessageConverter : ProtobufConverter<Message>

public fun Message.toAny(): Any = Any(Message.TYPE_URL, with(MessageConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<Message>): Message {
  if (typeUrl != Message.TYPE_URL) throw IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}
