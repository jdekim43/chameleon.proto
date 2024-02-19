// Transform from injective/oracle/v1beta1/genesis.proto
@file:GeneratorVersion(version = "0.3.1")

package injective.oracle.v1beta1

import google.protobuf.Any
import java.lang.IllegalStateException
import kr.jadekim.protobuf.`annotation`.GeneratorVersion
import kr.jadekim.protobuf.converter.ProtobufConverter
import kr.jadekim.protobuf.converter.parseProtobuf

public expect object GenesisStateConverter : ProtobufConverter<GenesisState>

public fun GenesisState.toAny(): Any = Any(GenesisState.TYPE_URL, with(GenesisStateConverter) {
    toByteArray() })

public fun Any.parse(converter: ProtobufConverter<GenesisState>): GenesisState {
  if (typeUrl != GenesisState.TYPE_URL) throw IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object CalldataRecordConverter : ProtobufConverter<CalldataRecord>

public fun CalldataRecord.toAny(): Any = Any(CalldataRecord.TYPE_URL, with(CalldataRecordConverter)
    { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<CalldataRecord>): CalldataRecord {
  if (typeUrl != CalldataRecord.TYPE_URL) throw IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}
