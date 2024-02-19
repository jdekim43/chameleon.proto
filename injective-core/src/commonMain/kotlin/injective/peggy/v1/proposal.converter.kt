// Transform from injective/peggy/v1/proposal.proto
@file:GeneratorVersion(version = "0.3.1")

package injective.peggy.v1

import google.protobuf.Any
import java.lang.IllegalStateException
import kr.jadekim.protobuf.`annotation`.GeneratorVersion
import kr.jadekim.protobuf.converter.ProtobufConverter
import kr.jadekim.protobuf.converter.parseProtobuf

public expect object BlacklistEthereumAddressesProposalConverter :
    ProtobufConverter<BlacklistEthereumAddressesProposal>

public fun BlacklistEthereumAddressesProposal.toAny(): Any =
    Any(BlacklistEthereumAddressesProposal.TYPE_URL,
    with(BlacklistEthereumAddressesProposalConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<BlacklistEthereumAddressesProposal>):
    BlacklistEthereumAddressesProposal {
  if (typeUrl != BlacklistEthereumAddressesProposal.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object RevokeEthereumBlacklistProposalConverter :
    ProtobufConverter<RevokeEthereumBlacklistProposal>

public fun RevokeEthereumBlacklistProposal.toAny(): Any =
    Any(RevokeEthereumBlacklistProposal.TYPE_URL, with(RevokeEthereumBlacklistProposalConverter) {
    toByteArray() })

public fun Any.parse(converter: ProtobufConverter<RevokeEthereumBlacklistProposal>):
    RevokeEthereumBlacklistProposal {
  if (typeUrl != RevokeEthereumBlacklistProposal.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}
