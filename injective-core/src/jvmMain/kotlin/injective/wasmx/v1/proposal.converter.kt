// Transform from injective/wasmx/v1/proposal.proto
@file:GeneratorVersion(version = "0.3.1")

package injective.wasmx.v1

import kr.jadekim.protobuf.`annotation`.GeneratorVersion
import kr.jadekim.protobuf.converter.ProtobufConverter

public actual object ContractRegistrationRequestProposalConverter :
    ProtobufConverter<ContractRegistrationRequestProposal> by
    ContractRegistrationRequestProposalJvmConverter

public actual object BatchContractRegistrationRequestProposalConverter :
    ProtobufConverter<BatchContractRegistrationRequestProposal> by
    BatchContractRegistrationRequestProposalJvmConverter

public actual object BatchContractDeregistrationProposalConverter :
    ProtobufConverter<BatchContractDeregistrationProposal> by
    BatchContractDeregistrationProposalJvmConverter

public actual object ContractRegistrationRequestConverter :
    ProtobufConverter<ContractRegistrationRequest> by ContractRegistrationRequestJvmConverter

public actual object BatchStoreCodeProposalConverter : ProtobufConverter<BatchStoreCodeProposal> by
    BatchStoreCodeProposalJvmConverter
