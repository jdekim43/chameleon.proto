// Transform from injective/oracle/v1beta1/proposal.proto
@file:GeneratorVersion(version = "0.3.1")

package injective.oracle.v1beta1

import google.protobuf.Any
import java.lang.IllegalStateException
import kr.jadekim.protobuf.`annotation`.GeneratorVersion
import kr.jadekim.protobuf.converter.ProtobufConverter
import kr.jadekim.protobuf.converter.parseProtobuf

public expect object GrantBandOraclePrivilegeProposalConverter :
    ProtobufConverter<GrantBandOraclePrivilegeProposal>

public fun GrantBandOraclePrivilegeProposal.toAny(): Any =
    Any(GrantBandOraclePrivilegeProposal.TYPE_URL, with(GrantBandOraclePrivilegeProposalConverter) {
    toByteArray() })

public fun Any.parse(converter: ProtobufConverter<GrantBandOraclePrivilegeProposal>):
    GrantBandOraclePrivilegeProposal {
  if (typeUrl != GrantBandOraclePrivilegeProposal.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object RevokeBandOraclePrivilegeProposalConverter :
    ProtobufConverter<RevokeBandOraclePrivilegeProposal>

public fun RevokeBandOraclePrivilegeProposal.toAny(): Any =
    Any(RevokeBandOraclePrivilegeProposal.TYPE_URL, with(RevokeBandOraclePrivilegeProposalConverter)
    { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<RevokeBandOraclePrivilegeProposal>):
    RevokeBandOraclePrivilegeProposal {
  if (typeUrl != RevokeBandOraclePrivilegeProposal.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object GrantPriceFeederPrivilegeProposalConverter :
    ProtobufConverter<GrantPriceFeederPrivilegeProposal>

public fun GrantPriceFeederPrivilegeProposal.toAny(): Any =
    Any(GrantPriceFeederPrivilegeProposal.TYPE_URL, with(GrantPriceFeederPrivilegeProposalConverter)
    { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<GrantPriceFeederPrivilegeProposal>):
    GrantPriceFeederPrivilegeProposal {
  if (typeUrl != GrantPriceFeederPrivilegeProposal.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object GrantProviderPrivilegeProposalConverter :
    ProtobufConverter<GrantProviderPrivilegeProposal>

public fun GrantProviderPrivilegeProposal.toAny(): Any =
    Any(GrantProviderPrivilegeProposal.TYPE_URL, with(GrantProviderPrivilegeProposalConverter) {
    toByteArray() })

public fun Any.parse(converter: ProtobufConverter<GrantProviderPrivilegeProposal>):
    GrantProviderPrivilegeProposal {
  if (typeUrl != GrantProviderPrivilegeProposal.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object RevokeProviderPrivilegeProposalConverter :
    ProtobufConverter<RevokeProviderPrivilegeProposal>

public fun RevokeProviderPrivilegeProposal.toAny(): Any =
    Any(RevokeProviderPrivilegeProposal.TYPE_URL, with(RevokeProviderPrivilegeProposalConverter) {
    toByteArray() })

public fun Any.parse(converter: ProtobufConverter<RevokeProviderPrivilegeProposal>):
    RevokeProviderPrivilegeProposal {
  if (typeUrl != RevokeProviderPrivilegeProposal.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object RevokePriceFeederPrivilegeProposalConverter :
    ProtobufConverter<RevokePriceFeederPrivilegeProposal>

public fun RevokePriceFeederPrivilegeProposal.toAny(): Any =
    Any(RevokePriceFeederPrivilegeProposal.TYPE_URL,
    with(RevokePriceFeederPrivilegeProposalConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<RevokePriceFeederPrivilegeProposal>):
    RevokePriceFeederPrivilegeProposal {
  if (typeUrl != RevokePriceFeederPrivilegeProposal.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object AuthorizeBandOracleRequestProposalConverter :
    ProtobufConverter<AuthorizeBandOracleRequestProposal>

public fun AuthorizeBandOracleRequestProposal.toAny(): Any =
    Any(AuthorizeBandOracleRequestProposal.TYPE_URL,
    with(AuthorizeBandOracleRequestProposalConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<AuthorizeBandOracleRequestProposal>):
    AuthorizeBandOracleRequestProposal {
  if (typeUrl != AuthorizeBandOracleRequestProposal.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object UpdateBandOracleRequestProposalConverter :
    ProtobufConverter<UpdateBandOracleRequestProposal>

public fun UpdateBandOracleRequestProposal.toAny(): Any =
    Any(UpdateBandOracleRequestProposal.TYPE_URL, with(UpdateBandOracleRequestProposalConverter) {
    toByteArray() })

public fun Any.parse(converter: ProtobufConverter<UpdateBandOracleRequestProposal>):
    UpdateBandOracleRequestProposal {
  if (typeUrl != UpdateBandOracleRequestProposal.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object EnableBandIBCProposalConverter : ProtobufConverter<EnableBandIBCProposal>

public fun EnableBandIBCProposal.toAny(): Any = Any(EnableBandIBCProposal.TYPE_URL,
    with(EnableBandIBCProposalConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<EnableBandIBCProposal>): EnableBandIBCProposal {
  if (typeUrl != EnableBandIBCProposal.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}
