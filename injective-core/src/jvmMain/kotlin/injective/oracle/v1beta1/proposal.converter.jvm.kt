// Transform from injective/oracle/v1beta1/proposal.proto
@file:GeneratorVersion(version = "0.3.1")

package injective.oracle.v1beta1

import com.google.protobuf.Descriptors
import com.google.protobuf.Parser
import kr.jadekim.protobuf.`annotation`.GeneratorVersion
import kr.jadekim.protobuf.converter.mapper.ProtobufTypeMapper
import kr.jadekim.protobuf.util.asJavaType
import kr.jadekim.protobuf.util.asKotlinType

public object GrantBandOraclePrivilegeProposalJvmConverter :
    ProtobufTypeMapper<GrantBandOraclePrivilegeProposal, Proposal.GrantBandOraclePrivilegeProposal>
    {
  public override val descriptor: Descriptors.Descriptor =
      Proposal.GrantBandOraclePrivilegeProposal.getDescriptor()

  public override val parser: Parser<Proposal.GrantBandOraclePrivilegeProposal> =
      Proposal.GrantBandOraclePrivilegeProposal.parser()

  public override fun convert(obj: Proposal.GrantBandOraclePrivilegeProposal):
      GrantBandOraclePrivilegeProposal = GrantBandOraclePrivilegeProposal(
  	title = obj.getTitle(),
  	description = obj.getDescription(),
  	relayers = obj.getRelayersList().map { it },
  )

  public override fun convert(obj: GrantBandOraclePrivilegeProposal):
      Proposal.GrantBandOraclePrivilegeProposal {
    val builder = Proposal.GrantBandOraclePrivilegeProposal.newBuilder()
    builder.setTitle(obj.title)
    builder.setDescription(obj.description)
    builder.addAllRelayers(obj.relayers.map { it })
    return builder.build()
  }
}

public object RevokeBandOraclePrivilegeProposalJvmConverter :
    ProtobufTypeMapper<RevokeBandOraclePrivilegeProposal, Proposal.RevokeBandOraclePrivilegeProposal>
    {
  public override val descriptor: Descriptors.Descriptor =
      Proposal.RevokeBandOraclePrivilegeProposal.getDescriptor()

  public override val parser: Parser<Proposal.RevokeBandOraclePrivilegeProposal> =
      Proposal.RevokeBandOraclePrivilegeProposal.parser()

  public override fun convert(obj: Proposal.RevokeBandOraclePrivilegeProposal):
      RevokeBandOraclePrivilegeProposal = RevokeBandOraclePrivilegeProposal(
  	title = obj.getTitle(),
  	description = obj.getDescription(),
  	relayers = obj.getRelayersList().map { it },
  )

  public override fun convert(obj: RevokeBandOraclePrivilegeProposal):
      Proposal.RevokeBandOraclePrivilegeProposal {
    val builder = Proposal.RevokeBandOraclePrivilegeProposal.newBuilder()
    builder.setTitle(obj.title)
    builder.setDescription(obj.description)
    builder.addAllRelayers(obj.relayers.map { it })
    return builder.build()
  }
}

public object GrantPriceFeederPrivilegeProposalJvmConverter :
    ProtobufTypeMapper<GrantPriceFeederPrivilegeProposal, Proposal.GrantPriceFeederPrivilegeProposal>
    {
  public override val descriptor: Descriptors.Descriptor =
      Proposal.GrantPriceFeederPrivilegeProposal.getDescriptor()

  public override val parser: Parser<Proposal.GrantPriceFeederPrivilegeProposal> =
      Proposal.GrantPriceFeederPrivilegeProposal.parser()

  public override fun convert(obj: Proposal.GrantPriceFeederPrivilegeProposal):
      GrantPriceFeederPrivilegeProposal = GrantPriceFeederPrivilegeProposal(
  	title = obj.getTitle(),
  	description = obj.getDescription(),
  	base = obj.getBase(),
  	quote = obj.getQuote(),
  	relayers = obj.getRelayersList().map { it },
  )

  public override fun convert(obj: GrantPriceFeederPrivilegeProposal):
      Proposal.GrantPriceFeederPrivilegeProposal {
    val builder = Proposal.GrantPriceFeederPrivilegeProposal.newBuilder()
    builder.setTitle(obj.title)
    builder.setDescription(obj.description)
    builder.setBase(obj.base)
    builder.setQuote(obj.quote)
    builder.addAllRelayers(obj.relayers.map { it })
    return builder.build()
  }
}

public object GrantProviderPrivilegeProposalJvmConverter :
    ProtobufTypeMapper<GrantProviderPrivilegeProposal, Proposal.GrantProviderPrivilegeProposal> {
  public override val descriptor: Descriptors.Descriptor =
      Proposal.GrantProviderPrivilegeProposal.getDescriptor()

  public override val parser: Parser<Proposal.GrantProviderPrivilegeProposal> =
      Proposal.GrantProviderPrivilegeProposal.parser()

  public override fun convert(obj: Proposal.GrantProviderPrivilegeProposal):
      GrantProviderPrivilegeProposal = GrantProviderPrivilegeProposal(
  	title = obj.getTitle(),
  	description = obj.getDescription(),
  	provider = obj.getProvider(),
  	relayers = obj.getRelayersList().map { it },
  )

  public override fun convert(obj: GrantProviderPrivilegeProposal):
      Proposal.GrantProviderPrivilegeProposal {
    val builder = Proposal.GrantProviderPrivilegeProposal.newBuilder()
    builder.setTitle(obj.title)
    builder.setDescription(obj.description)
    builder.setProvider(obj.provider)
    builder.addAllRelayers(obj.relayers.map { it })
    return builder.build()
  }
}

public object RevokeProviderPrivilegeProposalJvmConverter :
    ProtobufTypeMapper<RevokeProviderPrivilegeProposal, Proposal.RevokeProviderPrivilegeProposal> {
  public override val descriptor: Descriptors.Descriptor =
      Proposal.RevokeProviderPrivilegeProposal.getDescriptor()

  public override val parser: Parser<Proposal.RevokeProviderPrivilegeProposal> =
      Proposal.RevokeProviderPrivilegeProposal.parser()

  public override fun convert(obj: Proposal.RevokeProviderPrivilegeProposal):
      RevokeProviderPrivilegeProposal = RevokeProviderPrivilegeProposal(
  	title = obj.getTitle(),
  	description = obj.getDescription(),
  	provider = obj.getProvider(),
  	relayers = obj.getRelayersList().map { it },
  )

  public override fun convert(obj: RevokeProviderPrivilegeProposal):
      Proposal.RevokeProviderPrivilegeProposal {
    val builder = Proposal.RevokeProviderPrivilegeProposal.newBuilder()
    builder.setTitle(obj.title)
    builder.setDescription(obj.description)
    builder.setProvider(obj.provider)
    builder.addAllRelayers(obj.relayers.map { it })
    return builder.build()
  }
}

public object RevokePriceFeederPrivilegeProposalJvmConverter :
    ProtobufTypeMapper<RevokePriceFeederPrivilegeProposal, Proposal.RevokePriceFeederPrivilegeProposal>
    {
  public override val descriptor: Descriptors.Descriptor =
      Proposal.RevokePriceFeederPrivilegeProposal.getDescriptor()

  public override val parser: Parser<Proposal.RevokePriceFeederPrivilegeProposal> =
      Proposal.RevokePriceFeederPrivilegeProposal.parser()

  public override fun convert(obj: Proposal.RevokePriceFeederPrivilegeProposal):
      RevokePriceFeederPrivilegeProposal = RevokePriceFeederPrivilegeProposal(
  	title = obj.getTitle(),
  	description = obj.getDescription(),
  	base = obj.getBase(),
  	quote = obj.getQuote(),
  	relayers = obj.getRelayersList().map { it },
  )

  public override fun convert(obj: RevokePriceFeederPrivilegeProposal):
      Proposal.RevokePriceFeederPrivilegeProposal {
    val builder = Proposal.RevokePriceFeederPrivilegeProposal.newBuilder()
    builder.setTitle(obj.title)
    builder.setDescription(obj.description)
    builder.setBase(obj.base)
    builder.setQuote(obj.quote)
    builder.addAllRelayers(obj.relayers.map { it })
    return builder.build()
  }
}

public object AuthorizeBandOracleRequestProposalJvmConverter :
    ProtobufTypeMapper<AuthorizeBandOracleRequestProposal, Proposal.AuthorizeBandOracleRequestProposal>
    {
  public override val descriptor: Descriptors.Descriptor =
      Proposal.AuthorizeBandOracleRequestProposal.getDescriptor()

  public override val parser: Parser<Proposal.AuthorizeBandOracleRequestProposal> =
      Proposal.AuthorizeBandOracleRequestProposal.parser()

  public override fun convert(obj: Proposal.AuthorizeBandOracleRequestProposal):
      AuthorizeBandOracleRequestProposal = AuthorizeBandOracleRequestProposal(
  	title = obj.getTitle(),
  	description = obj.getDescription(),
  	request = BandOracleRequestJvmConverter.convert(obj.getRequest()),
  )

  public override fun convert(obj: AuthorizeBandOracleRequestProposal):
      Proposal.AuthorizeBandOracleRequestProposal {
    val builder = Proposal.AuthorizeBandOracleRequestProposal.newBuilder()
    builder.setTitle(obj.title)
    builder.setDescription(obj.description)
    builder.setRequest(BandOracleRequestJvmConverter.convert(obj.request))
    return builder.build()
  }
}

public object UpdateBandOracleRequestProposalJvmConverter :
    ProtobufTypeMapper<UpdateBandOracleRequestProposal, Proposal.UpdateBandOracleRequestProposal> {
  public override val descriptor: Descriptors.Descriptor =
      Proposal.UpdateBandOracleRequestProposal.getDescriptor()

  public override val parser: Parser<Proposal.UpdateBandOracleRequestProposal> =
      Proposal.UpdateBandOracleRequestProposal.parser()

  public override fun convert(obj: Proposal.UpdateBandOracleRequestProposal):
      UpdateBandOracleRequestProposal = UpdateBandOracleRequestProposal(
  	title = obj.getTitle(),
  	description = obj.getDescription(),
  	deleteRequestIds = obj.getDeleteRequestIdsList().map { it.asKotlinType },
  	updateOracleRequest = BandOracleRequestJvmConverter.convert(obj.getUpdateOracleRequest()),
  )

  public override fun convert(obj: UpdateBandOracleRequestProposal):
      Proposal.UpdateBandOracleRequestProposal {
    val builder = Proposal.UpdateBandOracleRequestProposal.newBuilder()
    builder.setTitle(obj.title)
    builder.setDescription(obj.description)
    builder.addAllDeleteRequestIds(obj.deleteRequestIds.map { it.asJavaType })
    builder.setUpdateOracleRequest(BandOracleRequestJvmConverter.convert(obj.updateOracleRequest))
    return builder.build()
  }
}

public object EnableBandIBCProposalJvmConverter :
    ProtobufTypeMapper<EnableBandIBCProposal, Proposal.EnableBandIBCProposal> {
  public override val descriptor: Descriptors.Descriptor =
      Proposal.EnableBandIBCProposal.getDescriptor()

  public override val parser: Parser<Proposal.EnableBandIBCProposal> =
      Proposal.EnableBandIBCProposal.parser()

  public override fun convert(obj: Proposal.EnableBandIBCProposal): EnableBandIBCProposal =
      EnableBandIBCProposal(
  	title = obj.getTitle(),
  	description = obj.getDescription(),
  	bandIbcParams = BandIBCParamsJvmConverter.convert(obj.getBandIbcParams()),
  )

  public override fun convert(obj: EnableBandIBCProposal): Proposal.EnableBandIBCProposal {
    val builder = Proposal.EnableBandIBCProposal.newBuilder()
    builder.setTitle(obj.title)
    builder.setDescription(obj.description)
    builder.setBandIbcParams(BandIBCParamsJvmConverter.convert(obj.bandIbcParams))
    return builder.build()
  }
}
