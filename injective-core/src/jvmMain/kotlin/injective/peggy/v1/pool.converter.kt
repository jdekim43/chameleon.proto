// Transform from injective/peggy/v1/pool.proto
@file:GeneratorVersion(version = "0.3.1")

package injective.peggy.v1

import kr.jadekim.protobuf.`annotation`.GeneratorVersion
import kr.jadekim.protobuf.converter.ProtobufConverter

public actual object IDSetConverter : ProtobufConverter<IDSet> by IDSetJvmConverter

public actual object BatchFeesConverter : ProtobufConverter<BatchFees> by BatchFeesJvmConverter
