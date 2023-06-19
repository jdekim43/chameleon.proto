// Transform from tendermint/types/canonical.proto
@file:GeneratorVersion(version = "0.3.1")

package tendermint.types

import kr.jadekim.protobuf.`annotation`.GeneratorVersion
import kr.jadekim.protobuf.converter.ProtobufConverter

public actual object CanonicalBlockIDConverter : ProtobufConverter<CanonicalBlockID> by
    CanonicalBlockIDJvmConverter

public actual object CanonicalPartSetHeaderConverter : ProtobufConverter<CanonicalPartSetHeader> by
    CanonicalPartSetHeaderJvmConverter

public actual object CanonicalProposalConverter : ProtobufConverter<CanonicalProposal> by
    CanonicalProposalJvmConverter

public actual object CanonicalVoteConverter : ProtobufConverter<CanonicalVote> by
    CanonicalVoteJvmConverter
