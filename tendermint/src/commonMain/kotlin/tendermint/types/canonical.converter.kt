// Transform from tendermint/types/canonical.proto
@file:GeneratorVersion(version = "0.3.1")

package tendermint.types

import google.protobuf.Any
import java.lang.IllegalStateException
import kr.jadekim.protobuf.`annotation`.GeneratorVersion
import kr.jadekim.protobuf.converter.ProtobufConverter
import kr.jadekim.protobuf.converter.parseProtobuf

public expect object CanonicalBlockIDConverter : ProtobufConverter<CanonicalBlockID>

public fun CanonicalBlockID.toAny(): Any = Any(CanonicalBlockID.TYPE_URL,
    with(CanonicalBlockIDConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<CanonicalBlockID>): CanonicalBlockID {
  if (typeUrl != CanonicalBlockID.TYPE_URL) throw IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object CanonicalPartSetHeaderConverter : ProtobufConverter<CanonicalPartSetHeader>

public fun CanonicalPartSetHeader.toAny(): Any = Any(CanonicalPartSetHeader.TYPE_URL,
    with(CanonicalPartSetHeaderConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<CanonicalPartSetHeader>): CanonicalPartSetHeader {
  if (typeUrl != CanonicalPartSetHeader.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object CanonicalProposalConverter : ProtobufConverter<CanonicalProposal>

public fun CanonicalProposal.toAny(): Any = Any(CanonicalProposal.TYPE_URL,
    with(CanonicalProposalConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<CanonicalProposal>): CanonicalProposal {
  if (typeUrl != CanonicalProposal.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object CanonicalVoteConverter : ProtobufConverter<CanonicalVote>

public fun CanonicalVote.toAny(): Any = Any(CanonicalVote.TYPE_URL, with(CanonicalVoteConverter) {
    toByteArray() })

public fun Any.parse(converter: ProtobufConverter<CanonicalVote>): CanonicalVote {
  if (typeUrl != CanonicalVote.TYPE_URL) throw IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}
