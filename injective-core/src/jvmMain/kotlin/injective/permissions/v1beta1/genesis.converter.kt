// Transform from injective/permissions/v1beta1/genesis.proto
@file:GeneratorVersion(version = "0.3.1")

package injective.permissions.v1beta1

import kr.jadekim.protobuf.`annotation`.GeneratorVersion
import kr.jadekim.protobuf.converter.ProtobufConverter

public actual object GenesisStateConverter : ProtobufConverter<GenesisState> by
    GenesisStateJvmConverter
