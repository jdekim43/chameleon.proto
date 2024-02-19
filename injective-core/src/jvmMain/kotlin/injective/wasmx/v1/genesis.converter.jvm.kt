// Transform from injective/wasmx/v1/genesis.proto
@file:GeneratorVersion(version = "0.3.1")

package injective.wasmx.v1

import com.google.protobuf.Descriptors
import com.google.protobuf.Parser
import kr.jadekim.protobuf.`annotation`.GeneratorVersion
import kr.jadekim.protobuf.converter.mapper.ProtobufTypeMapper

public object RegisteredContractWithAddressJvmConverter :
    ProtobufTypeMapper<RegisteredContractWithAddress, Genesis.RegisteredContractWithAddress> {
  public override val descriptor: Descriptors.Descriptor =
      Genesis.RegisteredContractWithAddress.getDescriptor()

  public override val parser: Parser<Genesis.RegisteredContractWithAddress> =
      Genesis.RegisteredContractWithAddress.parser()

  public override fun convert(obj: Genesis.RegisteredContractWithAddress):
      RegisteredContractWithAddress = RegisteredContractWithAddress(
  	address = obj.getAddress(),
  	registeredContract = RegisteredContractJvmConverter.convert(obj.getRegisteredContract()),
  )

  public override fun convert(obj: RegisteredContractWithAddress):
      Genesis.RegisteredContractWithAddress {
    val builder = Genesis.RegisteredContractWithAddress.newBuilder()
    builder.setAddress(obj.address)
    builder.setRegisteredContract(RegisteredContractJvmConverter.convert(obj.registeredContract))
    return builder.build()
  }
}

public object GenesisStateJvmConverter : ProtobufTypeMapper<GenesisState, Genesis.GenesisState> {
  public override val descriptor: Descriptors.Descriptor = Genesis.GenesisState.getDescriptor()

  public override val parser: Parser<Genesis.GenesisState> = Genesis.GenesisState.parser()

  public override fun convert(obj: Genesis.GenesisState): GenesisState = GenesisState(
  	params = ParamsJvmConverter.convert(obj.getParams()),
  	registeredContracts = obj.getRegisteredContractsList().map {
      RegisteredContractWithAddressJvmConverter.convert(it) },
  )

  public override fun convert(obj: GenesisState): Genesis.GenesisState {
    val builder = Genesis.GenesisState.newBuilder()
    builder.setParams(ParamsJvmConverter.convert(obj.params))
    builder.addAllRegisteredContracts(obj.registeredContracts.map {
        RegisteredContractWithAddressJvmConverter.convert(it) })
    return builder.build()
  }
}
