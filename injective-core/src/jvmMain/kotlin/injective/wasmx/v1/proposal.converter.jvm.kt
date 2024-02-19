// Transform from injective/wasmx/v1/proposal.proto
@file:GeneratorVersion(version = "0.3.1")

package injective.wasmx.v1

import com.google.protobuf.Descriptors
import com.google.protobuf.Parser
import cosmwasm.wasm.v1.StoreCodeProposalJvmConverter
import kr.jadekim.protobuf.`annotation`.GeneratorVersion
import kr.jadekim.protobuf.converter.mapper.ProtobufTypeMapper
import kr.jadekim.protobuf.util.asJavaType
import kr.jadekim.protobuf.util.asKotlinType

public object ContractRegistrationRequestProposalJvmConverter :
    ProtobufTypeMapper<ContractRegistrationRequestProposal, Proposal.ContractRegistrationRequestProposal>
    {
  public override val descriptor: Descriptors.Descriptor =
      Proposal.ContractRegistrationRequestProposal.getDescriptor()

  public override val parser: Parser<Proposal.ContractRegistrationRequestProposal> =
      Proposal.ContractRegistrationRequestProposal.parser()

  public override fun convert(obj: Proposal.ContractRegistrationRequestProposal):
      ContractRegistrationRequestProposal = ContractRegistrationRequestProposal(
  	title = obj.getTitle(),
  	description = obj.getDescription(),
  	contractRegistrationRequest =
      ContractRegistrationRequestJvmConverter.convert(obj.getContractRegistrationRequest()),
  )

  public override fun convert(obj: ContractRegistrationRequestProposal):
      Proposal.ContractRegistrationRequestProposal {
    val builder = Proposal.ContractRegistrationRequestProposal.newBuilder()
    builder.setTitle(obj.title)
    builder.setDescription(obj.description)
    builder.setContractRegistrationRequest(ContractRegistrationRequestJvmConverter.convert(obj.contractRegistrationRequest))
    return builder.build()
  }
}

public object BatchContractRegistrationRequestProposalJvmConverter :
    ProtobufTypeMapper<BatchContractRegistrationRequestProposal, Proposal.BatchContractRegistrationRequestProposal>
    {
  public override val descriptor: Descriptors.Descriptor =
      Proposal.BatchContractRegistrationRequestProposal.getDescriptor()

  public override val parser: Parser<Proposal.BatchContractRegistrationRequestProposal> =
      Proposal.BatchContractRegistrationRequestProposal.parser()

  public override fun convert(obj: Proposal.BatchContractRegistrationRequestProposal):
      BatchContractRegistrationRequestProposal = BatchContractRegistrationRequestProposal(
  	title = obj.getTitle(),
  	description = obj.getDescription(),
  	contractRegistrationRequests = obj.getContractRegistrationRequestsList().map {
      ContractRegistrationRequestJvmConverter.convert(it) },
  )

  public override fun convert(obj: BatchContractRegistrationRequestProposal):
      Proposal.BatchContractRegistrationRequestProposal {
    val builder = Proposal.BatchContractRegistrationRequestProposal.newBuilder()
    builder.setTitle(obj.title)
    builder.setDescription(obj.description)
    builder.addAllContractRegistrationRequests(obj.contractRegistrationRequests.map {
        ContractRegistrationRequestJvmConverter.convert(it) })
    return builder.build()
  }
}

public object BatchContractDeregistrationProposalJvmConverter :
    ProtobufTypeMapper<BatchContractDeregistrationProposal, Proposal.BatchContractDeregistrationProposal>
    {
  public override val descriptor: Descriptors.Descriptor =
      Proposal.BatchContractDeregistrationProposal.getDescriptor()

  public override val parser: Parser<Proposal.BatchContractDeregistrationProposal> =
      Proposal.BatchContractDeregistrationProposal.parser()

  public override fun convert(obj: Proposal.BatchContractDeregistrationProposal):
      BatchContractDeregistrationProposal = BatchContractDeregistrationProposal(
  	title = obj.getTitle(),
  	description = obj.getDescription(),
  	contracts = obj.getContractsList().map { it },
  )

  public override fun convert(obj: BatchContractDeregistrationProposal):
      Proposal.BatchContractDeregistrationProposal {
    val builder = Proposal.BatchContractDeregistrationProposal.newBuilder()
    builder.setTitle(obj.title)
    builder.setDescription(obj.description)
    builder.addAllContracts(obj.contracts.map { it })
    return builder.build()
  }
}

public object ContractRegistrationRequestJvmConverter :
    ProtobufTypeMapper<ContractRegistrationRequest, Proposal.ContractRegistrationRequest> {
  public override val descriptor: Descriptors.Descriptor =
      Proposal.ContractRegistrationRequest.getDescriptor()

  public override val parser: Parser<Proposal.ContractRegistrationRequest> =
      Proposal.ContractRegistrationRequest.parser()

  public override fun convert(obj: Proposal.ContractRegistrationRequest):
      ContractRegistrationRequest = ContractRegistrationRequest(
  	contractAddress = obj.getContractAddress(),
  	gasLimit = obj.getGasLimit().asKotlinType,
  	gasPrice = obj.getGasPrice().asKotlinType,
  	shouldPinContract = obj.getShouldPinContract(),
  	isMigrationAllowed = obj.getIsMigrationAllowed(),
  	codeId = obj.getCodeId().asKotlinType,
  	adminAddress = obj.getAdminAddress(),
  	granterAddress = obj.getGranterAddress(),
  	fundingMode = FundingMode.forNumber(obj.getFundingMode().number),
  )

  public override fun convert(obj: ContractRegistrationRequest):
      Proposal.ContractRegistrationRequest {
    val builder = Proposal.ContractRegistrationRequest.newBuilder()
    builder.setContractAddress(obj.contractAddress)
    builder.setGasLimit(obj.gasLimit.asJavaType)
    builder.setGasPrice(obj.gasPrice.asJavaType)
    builder.setShouldPinContract(obj.shouldPinContract)
    builder.setIsMigrationAllowed(obj.isMigrationAllowed)
    builder.setCodeId(obj.codeId.asJavaType)
    builder.setAdminAddress(obj.adminAddress)
    builder.setGranterAddress(obj.granterAddress)
    builder.setFundingMode(Proposal.FundingMode.forNumber(obj.fundingMode.number))
    return builder.build()
  }
}

public object BatchStoreCodeProposalJvmConverter :
    ProtobufTypeMapper<BatchStoreCodeProposal, Proposal.BatchStoreCodeProposal> {
  public override val descriptor: Descriptors.Descriptor =
      Proposal.BatchStoreCodeProposal.getDescriptor()

  public override val parser: Parser<Proposal.BatchStoreCodeProposal> =
      Proposal.BatchStoreCodeProposal.parser()

  public override fun convert(obj: Proposal.BatchStoreCodeProposal): BatchStoreCodeProposal =
      BatchStoreCodeProposal(
  	title = obj.getTitle(),
  	description = obj.getDescription(),
  	proposals = obj.getProposalsList().map { StoreCodeProposalJvmConverter.convert(it) },
  )

  public override fun convert(obj: BatchStoreCodeProposal): Proposal.BatchStoreCodeProposal {
    val builder = Proposal.BatchStoreCodeProposal.newBuilder()
    builder.setTitle(obj.title)
    builder.setDescription(obj.description)
    builder.addAllProposals(obj.proposals.map { StoreCodeProposalJvmConverter.convert(it) })
    return builder.build()
  }
}
