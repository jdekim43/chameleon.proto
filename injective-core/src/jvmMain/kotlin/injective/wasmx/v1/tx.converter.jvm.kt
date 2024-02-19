// Transform from injective/wasmx/v1/tx.proto
@file:GeneratorVersion(version = "0.3.1")

package injective.wasmx.v1

import com.google.protobuf.ByteString
import com.google.protobuf.Descriptors
import com.google.protobuf.Parser
import kr.jadekim.protobuf.`annotation`.GeneratorVersion
import kr.jadekim.protobuf.converter.mapper.ProtobufTypeMapper
import kr.jadekim.protobuf.util.asJavaType
import kr.jadekim.protobuf.util.asKotlinType

public object MsgExecuteContractCompatJvmConverter :
    ProtobufTypeMapper<MsgExecuteContractCompat, Tx.MsgExecuteContractCompat> {
  public override val descriptor: Descriptors.Descriptor =
      Tx.MsgExecuteContractCompat.getDescriptor()

  public override val parser: Parser<Tx.MsgExecuteContractCompat> =
      Tx.MsgExecuteContractCompat.parser()

  public override fun convert(obj: Tx.MsgExecuteContractCompat): MsgExecuteContractCompat =
      MsgExecuteContractCompat(
  	sender = obj.getSender(),
  	contract = obj.getContract(),
  	msg = obj.getMsg(),
  	funds = obj.getFunds(),
  )

  public override fun convert(obj: MsgExecuteContractCompat): Tx.MsgExecuteContractCompat {
    val builder = Tx.MsgExecuteContractCompat.newBuilder()
    builder.setSender(obj.sender)
    builder.setContract(obj.contract)
    builder.setMsg(obj.msg)
    builder.setFunds(obj.funds)
    return builder.build()
  }
}

public object MsgExecuteContractCompatResponseJvmConverter :
    ProtobufTypeMapper<MsgExecuteContractCompatResponse, Tx.MsgExecuteContractCompatResponse> {
  public override val descriptor: Descriptors.Descriptor =
      Tx.MsgExecuteContractCompatResponse.getDescriptor()

  public override val parser: Parser<Tx.MsgExecuteContractCompatResponse> =
      Tx.MsgExecuteContractCompatResponse.parser()

  public override fun convert(obj: Tx.MsgExecuteContractCompatResponse):
      MsgExecuteContractCompatResponse = MsgExecuteContractCompatResponse(
  	`data` = obj.getData().toByteArray(),
  )

  public override fun convert(obj: MsgExecuteContractCompatResponse):
      Tx.MsgExecuteContractCompatResponse {
    val builder = Tx.MsgExecuteContractCompatResponse.newBuilder()
    builder.setData(ByteString.copyFrom(obj.`data`))
    return builder.build()
  }
}

public object MsgUpdateContractJvmConverter :
    ProtobufTypeMapper<MsgUpdateContract, Tx.MsgUpdateContract> {
  public override val descriptor: Descriptors.Descriptor = Tx.MsgUpdateContract.getDescriptor()

  public override val parser: Parser<Tx.MsgUpdateContract> = Tx.MsgUpdateContract.parser()

  public override fun convert(obj: Tx.MsgUpdateContract): MsgUpdateContract = MsgUpdateContract(
  	sender = obj.getSender(),
  	contractAddress = obj.getContractAddress(),
  	gasLimit = obj.getGasLimit().asKotlinType,
  	gasPrice = obj.getGasPrice().asKotlinType,
  	adminAddress = obj.getAdminAddress(),
  )

  public override fun convert(obj: MsgUpdateContract): Tx.MsgUpdateContract {
    val builder = Tx.MsgUpdateContract.newBuilder()
    builder.setSender(obj.sender)
    builder.setContractAddress(obj.contractAddress)
    builder.setGasLimit(obj.gasLimit.asJavaType)
    builder.setGasPrice(obj.gasPrice.asJavaType)
    builder.setAdminAddress(obj.adminAddress)
    return builder.build()
  }
}

public object MsgUpdateContractResponseJvmConverter :
    ProtobufTypeMapper<MsgUpdateContractResponse, Tx.MsgUpdateContractResponse> {
  public override val descriptor: Descriptors.Descriptor =
      Tx.MsgUpdateContractResponse.getDescriptor()

  public override val parser: Parser<Tx.MsgUpdateContractResponse> =
      Tx.MsgUpdateContractResponse.parser()

  public override fun convert(obj: Tx.MsgUpdateContractResponse): MsgUpdateContractResponse =
      MsgUpdateContractResponse(
  )

  public override fun convert(obj: MsgUpdateContractResponse): Tx.MsgUpdateContractResponse {
    val builder = Tx.MsgUpdateContractResponse.newBuilder()
    return builder.build()
  }
}

public object MsgActivateContractJvmConverter :
    ProtobufTypeMapper<MsgActivateContract, Tx.MsgActivateContract> {
  public override val descriptor: Descriptors.Descriptor = Tx.MsgActivateContract.getDescriptor()

  public override val parser: Parser<Tx.MsgActivateContract> = Tx.MsgActivateContract.parser()

  public override fun convert(obj: Tx.MsgActivateContract): MsgActivateContract =
      MsgActivateContract(
  	sender = obj.getSender(),
  	contractAddress = obj.getContractAddress(),
  )

  public override fun convert(obj: MsgActivateContract): Tx.MsgActivateContract {
    val builder = Tx.MsgActivateContract.newBuilder()
    builder.setSender(obj.sender)
    builder.setContractAddress(obj.contractAddress)
    return builder.build()
  }
}

public object MsgActivateContractResponseJvmConverter :
    ProtobufTypeMapper<MsgActivateContractResponse, Tx.MsgActivateContractResponse> {
  public override val descriptor: Descriptors.Descriptor =
      Tx.MsgActivateContractResponse.getDescriptor()

  public override val parser: Parser<Tx.MsgActivateContractResponse> =
      Tx.MsgActivateContractResponse.parser()

  public override fun convert(obj: Tx.MsgActivateContractResponse): MsgActivateContractResponse =
      MsgActivateContractResponse(
  )

  public override fun convert(obj: MsgActivateContractResponse): Tx.MsgActivateContractResponse {
    val builder = Tx.MsgActivateContractResponse.newBuilder()
    return builder.build()
  }
}

public object MsgDeactivateContractJvmConverter :
    ProtobufTypeMapper<MsgDeactivateContract, Tx.MsgDeactivateContract> {
  public override val descriptor: Descriptors.Descriptor = Tx.MsgDeactivateContract.getDescriptor()

  public override val parser: Parser<Tx.MsgDeactivateContract> = Tx.MsgDeactivateContract.parser()

  public override fun convert(obj: Tx.MsgDeactivateContract): MsgDeactivateContract =
      MsgDeactivateContract(
  	sender = obj.getSender(),
  	contractAddress = obj.getContractAddress(),
  )

  public override fun convert(obj: MsgDeactivateContract): Tx.MsgDeactivateContract {
    val builder = Tx.MsgDeactivateContract.newBuilder()
    builder.setSender(obj.sender)
    builder.setContractAddress(obj.contractAddress)
    return builder.build()
  }
}

public object MsgDeactivateContractResponseJvmConverter :
    ProtobufTypeMapper<MsgDeactivateContractResponse, Tx.MsgDeactivateContractResponse> {
  public override val descriptor: Descriptors.Descriptor =
      Tx.MsgDeactivateContractResponse.getDescriptor()

  public override val parser: Parser<Tx.MsgDeactivateContractResponse> =
      Tx.MsgDeactivateContractResponse.parser()

  public override fun convert(obj: Tx.MsgDeactivateContractResponse): MsgDeactivateContractResponse
      = MsgDeactivateContractResponse(
  )

  public override fun convert(obj: MsgDeactivateContractResponse):
      Tx.MsgDeactivateContractResponse {
    val builder = Tx.MsgDeactivateContractResponse.newBuilder()
    return builder.build()
  }
}

public object MsgUpdateParamsJvmConverter : ProtobufTypeMapper<MsgUpdateParams, Tx.MsgUpdateParams>
    {
  public override val descriptor: Descriptors.Descriptor = Tx.MsgUpdateParams.getDescriptor()

  public override val parser: Parser<Tx.MsgUpdateParams> = Tx.MsgUpdateParams.parser()

  public override fun convert(obj: Tx.MsgUpdateParams): MsgUpdateParams = MsgUpdateParams(
  	authority = obj.getAuthority(),
  	params = ParamsJvmConverter.convert(obj.getParams()),
  )

  public override fun convert(obj: MsgUpdateParams): Tx.MsgUpdateParams {
    val builder = Tx.MsgUpdateParams.newBuilder()
    builder.setAuthority(obj.authority)
    builder.setParams(ParamsJvmConverter.convert(obj.params))
    return builder.build()
  }
}

public object MsgUpdateParamsResponseJvmConverter :
    ProtobufTypeMapper<MsgUpdateParamsResponse, Tx.MsgUpdateParamsResponse> {
  public override val descriptor: Descriptors.Descriptor =
      Tx.MsgUpdateParamsResponse.getDescriptor()

  public override val parser: Parser<Tx.MsgUpdateParamsResponse> =
      Tx.MsgUpdateParamsResponse.parser()

  public override fun convert(obj: Tx.MsgUpdateParamsResponse): MsgUpdateParamsResponse =
      MsgUpdateParamsResponse(
  )

  public override fun convert(obj: MsgUpdateParamsResponse): Tx.MsgUpdateParamsResponse {
    val builder = Tx.MsgUpdateParamsResponse.newBuilder()
    return builder.build()
  }
}

public object MsgRegisterContractJvmConverter :
    ProtobufTypeMapper<MsgRegisterContract, Tx.MsgRegisterContract> {
  public override val descriptor: Descriptors.Descriptor = Tx.MsgRegisterContract.getDescriptor()

  public override val parser: Parser<Tx.MsgRegisterContract> = Tx.MsgRegisterContract.parser()

  public override fun convert(obj: Tx.MsgRegisterContract): MsgRegisterContract =
      MsgRegisterContract(
  	sender = obj.getSender(),
  	contractRegistrationRequest =
      ContractRegistrationRequestJvmConverter.convert(obj.getContractRegistrationRequest()),
  )

  public override fun convert(obj: MsgRegisterContract): Tx.MsgRegisterContract {
    val builder = Tx.MsgRegisterContract.newBuilder()
    builder.setSender(obj.sender)
    builder.setContractRegistrationRequest(ContractRegistrationRequestJvmConverter.convert(obj.contractRegistrationRequest))
    return builder.build()
  }
}

public object MsgRegisterContractResponseJvmConverter :
    ProtobufTypeMapper<MsgRegisterContractResponse, Tx.MsgRegisterContractResponse> {
  public override val descriptor: Descriptors.Descriptor =
      Tx.MsgRegisterContractResponse.getDescriptor()

  public override val parser: Parser<Tx.MsgRegisterContractResponse> =
      Tx.MsgRegisterContractResponse.parser()

  public override fun convert(obj: Tx.MsgRegisterContractResponse): MsgRegisterContractResponse =
      MsgRegisterContractResponse(
  )

  public override fun convert(obj: MsgRegisterContractResponse): Tx.MsgRegisterContractResponse {
    val builder = Tx.MsgRegisterContractResponse.newBuilder()
    return builder.build()
  }
}
