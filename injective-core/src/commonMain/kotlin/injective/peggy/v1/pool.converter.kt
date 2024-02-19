// Transform from injective/peggy/v1/pool.proto
@file:GeneratorVersion(version = "0.3.1")

package injective.peggy.v1

import google.protobuf.Any
import java.lang.IllegalStateException
import kr.jadekim.protobuf.`annotation`.GeneratorVersion
import kr.jadekim.protobuf.converter.ProtobufConverter
import kr.jadekim.protobuf.converter.parseProtobuf

public expect object IDSetConverter : ProtobufConverter<IDSet>

public fun IDSet.toAny(): Any = Any(IDSet.TYPE_URL, with(IDSetConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<IDSet>): IDSet {
  if (typeUrl != IDSet.TYPE_URL) throw IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object BatchFeesConverter : ProtobufConverter<BatchFees>

public fun BatchFees.toAny(): Any = Any(BatchFees.TYPE_URL, with(BatchFeesConverter) { toByteArray()
    })

public fun Any.parse(converter: ProtobufConverter<BatchFees>): BatchFees {
  if (typeUrl != BatchFees.TYPE_URL) throw IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}
