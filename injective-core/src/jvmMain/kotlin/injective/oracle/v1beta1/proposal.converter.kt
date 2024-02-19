// Transform from injective/oracle/v1beta1/proposal.proto
@file:GeneratorVersion(version = "0.3.1")

package injective.oracle.v1beta1

import kr.jadekim.protobuf.`annotation`.GeneratorVersion
import kr.jadekim.protobuf.converter.ProtobufConverter

public actual object GrantBandOraclePrivilegeProposalConverter :
    ProtobufConverter<GrantBandOraclePrivilegeProposal> by
    GrantBandOraclePrivilegeProposalJvmConverter

public actual object RevokeBandOraclePrivilegeProposalConverter :
    ProtobufConverter<RevokeBandOraclePrivilegeProposal> by
    RevokeBandOraclePrivilegeProposalJvmConverter

public actual object GrantPriceFeederPrivilegeProposalConverter :
    ProtobufConverter<GrantPriceFeederPrivilegeProposal> by
    GrantPriceFeederPrivilegeProposalJvmConverter

public actual object GrantProviderPrivilegeProposalConverter :
    ProtobufConverter<GrantProviderPrivilegeProposal> by GrantProviderPrivilegeProposalJvmConverter

public actual object RevokeProviderPrivilegeProposalConverter :
    ProtobufConverter<RevokeProviderPrivilegeProposal> by
    RevokeProviderPrivilegeProposalJvmConverter

public actual object RevokePriceFeederPrivilegeProposalConverter :
    ProtobufConverter<RevokePriceFeederPrivilegeProposal> by
    RevokePriceFeederPrivilegeProposalJvmConverter

public actual object AuthorizeBandOracleRequestProposalConverter :
    ProtobufConverter<AuthorizeBandOracleRequestProposal> by
    AuthorizeBandOracleRequestProposalJvmConverter

public actual object UpdateBandOracleRequestProposalConverter :
    ProtobufConverter<UpdateBandOracleRequestProposal> by
    UpdateBandOracleRequestProposalJvmConverter

public actual object EnableBandIBCProposalConverter : ProtobufConverter<EnableBandIBCProposal> by
    EnableBandIBCProposalJvmConverter
