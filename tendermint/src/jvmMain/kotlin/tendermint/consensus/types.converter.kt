// Transform from tendermint/consensus/types.proto
@file:GeneratorVersion(version = "0.3.1")

package tendermint.consensus

import kr.jadekim.protobuf.`annotation`.GeneratorVersion
import kr.jadekim.protobuf.converter.ProtobufConverter

public actual object NewRoundStepConverter : ProtobufConverter<NewRoundStep> by
    NewRoundStepJvmConverter

public actual object NewValidBlockConverter : ProtobufConverter<NewValidBlock> by
    NewValidBlockJvmConverter

public actual object ProposalConverter : ProtobufConverter<Proposal> by ProposalJvmConverter

public actual object ProposalPOLConverter : ProtobufConverter<ProposalPOL> by
    ProposalPOLJvmConverter

public actual object BlockPartConverter : ProtobufConverter<BlockPart> by BlockPartJvmConverter

public actual object VoteConverter : ProtobufConverter<Vote> by VoteJvmConverter

public actual object HasVoteConverter : ProtobufConverter<HasVote> by HasVoteJvmConverter

public actual object VoteSetMaj23Converter : ProtobufConverter<VoteSetMaj23> by
    VoteSetMaj23JvmConverter

public actual object VoteSetBitsConverter : ProtobufConverter<VoteSetBits> by
    VoteSetBitsJvmConverter

public actual object MessageConverter : ProtobufConverter<Message> by MessageJvmConverter
