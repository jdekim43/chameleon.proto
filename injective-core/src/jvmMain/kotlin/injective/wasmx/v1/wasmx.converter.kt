// Transform from injective/wasmx/v1/wasmx.proto
@file:GeneratorVersion(version = "0.3.1")

package injective.wasmx.v1

import kr.jadekim.protobuf.`annotation`.GeneratorVersion
import kr.jadekim.protobuf.converter.ProtobufConverter

public actual object ParamsConverter : ProtobufConverter<Params> by ParamsJvmConverter

public actual object RegisteredContractConverter : ProtobufConverter<RegisteredContract> by
    RegisteredContractJvmConverter
