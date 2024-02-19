// Transform from injective/wasmx/v1/wasmx.proto
@file:GeneratorVersion(version = "0.3.1")

package injective.wasmx.v1

import google.protobuf.Any
import java.lang.IllegalStateException
import kr.jadekim.protobuf.`annotation`.GeneratorVersion
import kr.jadekim.protobuf.converter.ProtobufConverter
import kr.jadekim.protobuf.converter.parseProtobuf

public expect object ParamsConverter : ProtobufConverter<Params>

public fun Params.toAny(): Any = Any(Params.TYPE_URL, with(ParamsConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<Params>): Params {
  if (typeUrl != Params.TYPE_URL) throw IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object RegisteredContractConverter : ProtobufConverter<RegisteredContract>

public fun RegisteredContract.toAny(): Any = Any(RegisteredContract.TYPE_URL,
    with(RegisteredContractConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<RegisteredContract>): RegisteredContract {
  if (typeUrl != RegisteredContract.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}