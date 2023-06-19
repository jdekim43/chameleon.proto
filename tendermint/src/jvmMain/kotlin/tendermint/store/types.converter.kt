// Transform from tendermint/store/types.proto
@file:GeneratorVersion(version = "0.3.1")

package tendermint.store

import kr.jadekim.protobuf.`annotation`.GeneratorVersion
import kr.jadekim.protobuf.converter.ProtobufConverter

public actual object BlockStoreStateConverter : ProtobufConverter<BlockStoreState> by
    BlockStoreStateJvmConverter
