// Transform from injective/wasmx/v1/proposal.proto
@file:GeneratorVersion(version = "0.3.1")

package injective.wasmx.v1

import google.protobuf.Any
import java.lang.IllegalStateException
import kr.jadekim.protobuf.`annotation`.GeneratorVersion
import kr.jadekim.protobuf.converter.ProtobufConverter
import kr.jadekim.protobuf.converter.parseProtobuf

public expect object ContractRegistrationRequestProposalConverter :
    ProtobufConverter<ContractRegistrationRequestProposal>

public fun ContractRegistrationRequestProposal.toAny(): Any =
    Any(ContractRegistrationRequestProposal.TYPE_URL,
    with(ContractRegistrationRequestProposalConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<ContractRegistrationRequestProposal>):
    ContractRegistrationRequestProposal {
  if (typeUrl != ContractRegistrationRequestProposal.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object BatchContractRegistrationRequestProposalConverter :
    ProtobufConverter<BatchContractRegistrationRequestProposal>

public fun BatchContractRegistrationRequestProposal.toAny(): Any =
    Any(BatchContractRegistrationRequestProposal.TYPE_URL,
    with(BatchContractRegistrationRequestProposalConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<BatchContractRegistrationRequestProposal>):
    BatchContractRegistrationRequestProposal {
  if (typeUrl != BatchContractRegistrationRequestProposal.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object BatchContractDeregistrationProposalConverter :
    ProtobufConverter<BatchContractDeregistrationProposal>

public fun BatchContractDeregistrationProposal.toAny(): Any =
    Any(BatchContractDeregistrationProposal.TYPE_URL,
    with(BatchContractDeregistrationProposalConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<BatchContractDeregistrationProposal>):
    BatchContractDeregistrationProposal {
  if (typeUrl != BatchContractDeregistrationProposal.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object ContractRegistrationRequestConverter :
    ProtobufConverter<ContractRegistrationRequest>

public fun ContractRegistrationRequest.toAny(): Any = Any(ContractRegistrationRequest.TYPE_URL,
    with(ContractRegistrationRequestConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<ContractRegistrationRequest>):
    ContractRegistrationRequest {
  if (typeUrl != ContractRegistrationRequest.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object BatchStoreCodeProposalConverter : ProtobufConverter<BatchStoreCodeProposal>

public fun BatchStoreCodeProposal.toAny(): Any = Any(BatchStoreCodeProposal.TYPE_URL,
    with(BatchStoreCodeProposalConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<BatchStoreCodeProposal>): BatchStoreCodeProposal {
  if (typeUrl != BatchStoreCodeProposal.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}
