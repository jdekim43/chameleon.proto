// Transform from injective/wasmx/v1/genesis.proto
@file:GeneratorVersion(version = "0.3.1")

package injective.wasmx.v1

import google.protobuf.Any
import java.lang.IllegalStateException
import kr.jadekim.protobuf.`annotation`.GeneratorVersion
import kr.jadekim.protobuf.converter.ProtobufConverter
import kr.jadekim.protobuf.converter.parseProtobuf

public expect object RegisteredContractWithAddressConverter :
    ProtobufConverter<RegisteredContractWithAddress>

public fun RegisteredContractWithAddress.toAny(): Any = Any(RegisteredContractWithAddress.TYPE_URL,
    with(RegisteredContractWithAddressConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<RegisteredContractWithAddress>):
    RegisteredContractWithAddress {
  if (typeUrl != RegisteredContractWithAddress.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object GenesisStateConverter : ProtobufConverter<GenesisState>

public fun GenesisState.toAny(): Any = Any(GenesisState.TYPE_URL, with(GenesisStateConverter) {
    toByteArray() })

public fun Any.parse(converter: ProtobufConverter<GenesisState>): GenesisState {
  if (typeUrl != GenesisState.TYPE_URL) throw IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}
