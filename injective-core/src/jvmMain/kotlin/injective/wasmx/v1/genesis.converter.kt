// Transform from injective/wasmx/v1/genesis.proto
@file:GeneratorVersion(version = "0.3.1")

package injective.wasmx.v1

import kr.jadekim.protobuf.`annotation`.GeneratorVersion
import kr.jadekim.protobuf.converter.ProtobufConverter

public actual object RegisteredContractWithAddressConverter :
    ProtobufConverter<RegisteredContractWithAddress> by RegisteredContractWithAddressJvmConverter

public actual object GenesisStateConverter : ProtobufConverter<GenesisState> by
    GenesisStateJvmConverter
