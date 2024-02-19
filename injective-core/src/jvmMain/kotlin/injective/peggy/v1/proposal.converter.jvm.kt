// Transform from injective/peggy/v1/proposal.proto
@file:GeneratorVersion(version = "0.3.1")

package injective.peggy.v1

import com.google.protobuf.Descriptors
import com.google.protobuf.Parser
import kr.jadekim.protobuf.`annotation`.GeneratorVersion
import kr.jadekim.protobuf.converter.mapper.ProtobufTypeMapper

public object BlacklistEthereumAddressesProposalJvmConverter :
    ProtobufTypeMapper<BlacklistEthereumAddressesProposal, Proposal.BlacklistEthereumAddressesProposal>
    {
  public override val descriptor: Descriptors.Descriptor =
      Proposal.BlacklistEthereumAddressesProposal.getDescriptor()

  public override val parser: Parser<Proposal.BlacklistEthereumAddressesProposal> =
      Proposal.BlacklistEthereumAddressesProposal.parser()

  public override fun convert(obj: Proposal.BlacklistEthereumAddressesProposal):
      BlacklistEthereumAddressesProposal = BlacklistEthereumAddressesProposal(
  	title = obj.getTitle(),
  	description = obj.getDescription(),
  	blacklistAddresses = obj.getBlacklistAddressesList().map { it },
  )

  public override fun convert(obj: BlacklistEthereumAddressesProposal):
      Proposal.BlacklistEthereumAddressesProposal {
    val builder = Proposal.BlacklistEthereumAddressesProposal.newBuilder()
    builder.setTitle(obj.title)
    builder.setDescription(obj.description)
    builder.addAllBlacklistAddresses(obj.blacklistAddresses.map { it })
    return builder.build()
  }
}

public object RevokeEthereumBlacklistProposalJvmConverter :
    ProtobufTypeMapper<RevokeEthereumBlacklistProposal, Proposal.RevokeEthereumBlacklistProposal> {
  public override val descriptor: Descriptors.Descriptor =
      Proposal.RevokeEthereumBlacklistProposal.getDescriptor()

  public override val parser: Parser<Proposal.RevokeEthereumBlacklistProposal> =
      Proposal.RevokeEthereumBlacklistProposal.parser()

  public override fun convert(obj: Proposal.RevokeEthereumBlacklistProposal):
      RevokeEthereumBlacklistProposal = RevokeEthereumBlacklistProposal(
  	title = obj.getTitle(),
  	description = obj.getDescription(),
  	blacklistAddresses = obj.getBlacklistAddressesList().map { it },
  )

  public override fun convert(obj: RevokeEthereumBlacklistProposal):
      Proposal.RevokeEthereumBlacklistProposal {
    val builder = Proposal.RevokeEthereumBlacklistProposal.newBuilder()
    builder.setTitle(obj.title)
    builder.setDescription(obj.description)
    builder.addAllBlacklistAddresses(obj.blacklistAddresses.map { it })
    return builder.build()
  }
}
