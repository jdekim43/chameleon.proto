// Transform from injective/wasmx/v1/wasmx.proto
@file:GeneratorVersion(version = "0.3.1")

package injective.wasmx.v1

import com.google.protobuf.Descriptors
import com.google.protobuf.Parser
import kr.jadekim.protobuf.`annotation`.GeneratorVersion
import kr.jadekim.protobuf.converter.mapper.ProtobufTypeMapper
import kr.jadekim.protobuf.util.asJavaType
import kr.jadekim.protobuf.util.asKotlinType

public object ParamsJvmConverter : ProtobufTypeMapper<Params, Wasmx.Params> {
  public override val descriptor: Descriptors.Descriptor = Wasmx.Params.getDescriptor()

  public override val parser: Parser<Wasmx.Params> = Wasmx.Params.parser()

  public override fun convert(obj: Wasmx.Params): Params = Params(
  	isExecutionEnabled = obj.getIsExecutionEnabled(),
  	maxBeginBlockTotalGas = obj.getMaxBeginBlockTotalGas().asKotlinType,
  	maxContractGasLimit = obj.getMaxContractGasLimit().asKotlinType,
  	minGasPrice = obj.getMinGasPrice().asKotlinType,
  )

  public override fun convert(obj: Params): Wasmx.Params {
    val builder = Wasmx.Params.newBuilder()
    builder.setIsExecutionEnabled(obj.isExecutionEnabled)
    builder.setMaxBeginBlockTotalGas(obj.maxBeginBlockTotalGas.asJavaType)
    builder.setMaxContractGasLimit(obj.maxContractGasLimit.asJavaType)
    builder.setMinGasPrice(obj.minGasPrice.asJavaType)
    return builder.build()
  }
}

public object RegisteredContractJvmConverter :
    ProtobufTypeMapper<RegisteredContract, Wasmx.RegisteredContract> {
  public override val descriptor: Descriptors.Descriptor = Wasmx.RegisteredContract.getDescriptor()

  public override val parser: Parser<Wasmx.RegisteredContract> = Wasmx.RegisteredContract.parser()

  public override fun convert(obj: Wasmx.RegisteredContract): RegisteredContract =
      RegisteredContract(
  	gasLimit = obj.getGasLimit().asKotlinType,
  	gasPrice = obj.getGasPrice().asKotlinType,
  	isExecutable = obj.getIsExecutable(),
  	codeId = obj.getCodeId().asKotlinType,
  	adminAddress = obj.getAdminAddress(),
  	granterAddress = obj.getGranterAddress(),
  	fundMode = FundingMode.forNumber(obj.getFundMode().number),
  )

  public override fun convert(obj: RegisteredContract): Wasmx.RegisteredContract {
    val builder = Wasmx.RegisteredContract.newBuilder()
    builder.setGasLimit(obj.gasLimit.asJavaType)
    builder.setGasPrice(obj.gasPrice.asJavaType)
    builder.setIsExecutable(obj.isExecutable)
    builder.setCodeId(obj.codeId.asJavaType)
    builder.setAdminAddress(obj.adminAddress)
    builder.setGranterAddress(obj.granterAddress)
    builder.setFundMode(Proposal.FundingMode.forNumber(obj.fundMode.number))
    return builder.build()
  }
}
