// Transform from injective/wasmx/v1/events.proto
@file:GeneratorVersion(version = "0.3.1")

package injective.wasmx.v1

import com.google.protobuf.ByteString
import com.google.protobuf.Descriptors
import com.google.protobuf.Parser
import kr.jadekim.protobuf.`annotation`.GeneratorVersion
import kr.jadekim.protobuf.converter.mapper.ProtobufTypeMapper
import kr.jadekim.protobuf.util.asJavaType
import kr.jadekim.protobuf.util.asKotlinType

public object EventContractExecutionJvmConverter :
    ProtobufTypeMapper<EventContractExecution, Events.EventContractExecution> {
  public override val descriptor: Descriptors.Descriptor =
      Events.EventContractExecution.getDescriptor()

  public override val parser: Parser<Events.EventContractExecution> =
      Events.EventContractExecution.parser()

  public override fun convert(obj: Events.EventContractExecution): EventContractExecution =
      EventContractExecution(
  	contractAddress = obj.getContractAddress(),
  	response = obj.getResponse().toByteArray(),
  	otherError = obj.getOtherError(),
  	executionError = obj.getExecutionError(),
  )

  public override fun convert(obj: EventContractExecution): Events.EventContractExecution {
    val builder = Events.EventContractExecution.newBuilder()
    builder.setContractAddress(obj.contractAddress)
    builder.setResponse(ByteString.copyFrom(obj.response))
    builder.setOtherError(obj.otherError)
    builder.setExecutionError(obj.executionError)
    return builder.build()
  }
}

public object EventContractRegisteredJvmConverter :
    ProtobufTypeMapper<EventContractRegistered, Events.EventContractRegistered> {
  public override val descriptor: Descriptors.Descriptor =
      Events.EventContractRegistered.getDescriptor()

  public override val parser: Parser<Events.EventContractRegistered> =
      Events.EventContractRegistered.parser()

  public override fun convert(obj: Events.EventContractRegistered): EventContractRegistered =
      EventContractRegistered(
  	contractAddress = obj.getContractAddress(),
  	gasPrice = obj.getGasPrice().asKotlinType,
  	shouldPinContract = obj.getShouldPinContract(),
  	isMigrationAllowed = obj.getIsMigrationAllowed(),
  	codeId = obj.getCodeId().asKotlinType,
  	adminAddress = obj.getAdminAddress(),
  	granterAddress = obj.getGranterAddress(),
  	fundingMode = FundingMode.forNumber(obj.getFundingMode().number),
  )

  public override fun convert(obj: EventContractRegistered): Events.EventContractRegistered {
    val builder = Events.EventContractRegistered.newBuilder()
    builder.setContractAddress(obj.contractAddress)
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

public object EventContractDeregisteredJvmConverter :
    ProtobufTypeMapper<EventContractDeregistered, Events.EventContractDeregistered> {
  public override val descriptor: Descriptors.Descriptor =
      Events.EventContractDeregistered.getDescriptor()

  public override val parser: Parser<Events.EventContractDeregistered> =
      Events.EventContractDeregistered.parser()

  public override fun convert(obj: Events.EventContractDeregistered): EventContractDeregistered =
      EventContractDeregistered(
  	contractAddress = obj.getContractAddress(),
  )

  public override fun convert(obj: EventContractDeregistered): Events.EventContractDeregistered {
    val builder = Events.EventContractDeregistered.newBuilder()
    builder.setContractAddress(obj.contractAddress)
    return builder.build()
  }
}
