// Transform from injective/wasmx/v1/query.proto
@file:GeneratorVersion(version = "0.3.1")

package injective.wasmx.v1

import google.protobuf.Any
import java.lang.IllegalStateException
import kr.jadekim.protobuf.`annotation`.GeneratorVersion
import kr.jadekim.protobuf.converter.ProtobufConverter
import kr.jadekim.protobuf.converter.parseProtobuf

public expect object QueryWasmxParamsRequestConverter : ProtobufConverter<QueryWasmxParamsRequest>

public fun QueryWasmxParamsRequest.toAny(): Any = Any(QueryWasmxParamsRequest.TYPE_URL,
    with(QueryWasmxParamsRequestConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<QueryWasmxParamsRequest>):
    QueryWasmxParamsRequest {
  if (typeUrl != QueryWasmxParamsRequest.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object QueryWasmxParamsResponseConverter : ProtobufConverter<QueryWasmxParamsResponse>

public fun QueryWasmxParamsResponse.toAny(): Any = Any(QueryWasmxParamsResponse.TYPE_URL,
    with(QueryWasmxParamsResponseConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<QueryWasmxParamsResponse>):
    QueryWasmxParamsResponse {
  if (typeUrl != QueryWasmxParamsResponse.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object QueryModuleStateRequestConverter : ProtobufConverter<QueryModuleStateRequest>

public fun QueryModuleStateRequest.toAny(): Any = Any(QueryModuleStateRequest.TYPE_URL,
    with(QueryModuleStateRequestConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<QueryModuleStateRequest>):
    QueryModuleStateRequest {
  if (typeUrl != QueryModuleStateRequest.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object QueryModuleStateResponseConverter : ProtobufConverter<QueryModuleStateResponse>

public fun QueryModuleStateResponse.toAny(): Any = Any(QueryModuleStateResponse.TYPE_URL,
    with(QueryModuleStateResponseConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<QueryModuleStateResponse>):
    QueryModuleStateResponse {
  if (typeUrl != QueryModuleStateResponse.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object QueryContractRegistrationInfoRequestConverter :
    ProtobufConverter<QueryContractRegistrationInfoRequest>

public fun QueryContractRegistrationInfoRequest.toAny(): Any =
    Any(QueryContractRegistrationInfoRequest.TYPE_URL,
    with(QueryContractRegistrationInfoRequestConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<QueryContractRegistrationInfoRequest>):
    QueryContractRegistrationInfoRequest {
  if (typeUrl != QueryContractRegistrationInfoRequest.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object QueryContractRegistrationInfoResponseConverter :
    ProtobufConverter<QueryContractRegistrationInfoResponse>

public fun QueryContractRegistrationInfoResponse.toAny(): Any =
    Any(QueryContractRegistrationInfoResponse.TYPE_URL,
    with(QueryContractRegistrationInfoResponseConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<QueryContractRegistrationInfoResponse>):
    QueryContractRegistrationInfoResponse {
  if (typeUrl != QueryContractRegistrationInfoResponse.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}
