// Transform from tendermint/store/types.proto
@file:GeneratorVersion(version = "0.3.1")

package tendermint.store

import google.protobuf.Any
import java.lang.IllegalStateException
import kr.jadekim.protobuf.`annotation`.GeneratorVersion
import kr.jadekim.protobuf.converter.ProtobufConverter
import kr.jadekim.protobuf.converter.parseProtobuf

public expect object BlockStoreStateConverter : ProtobufConverter<BlockStoreState>

public fun BlockStoreState.toAny(): Any = Any(BlockStoreState.TYPE_URL,
    with(BlockStoreStateConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<BlockStoreState>): BlockStoreState {
  if (typeUrl != BlockStoreState.TYPE_URL) throw IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}
