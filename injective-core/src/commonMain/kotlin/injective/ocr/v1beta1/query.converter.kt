// Transform from injective/ocr/v1beta1/query.proto
@file:GeneratorVersion(version = "0.3.1")

package injective.ocr.v1beta1

import google.protobuf.Any
import java.lang.IllegalStateException
import kr.jadekim.protobuf.`annotation`.GeneratorVersion
import kr.jadekim.protobuf.converter.ProtobufConverter
import kr.jadekim.protobuf.converter.parseProtobuf

public expect object QueryParamsRequestConverter : ProtobufConverter<QueryParamsRequest>

public fun QueryParamsRequest.toAny(): Any = Any(QueryParamsRequest.TYPE_URL,
    with(QueryParamsRequestConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<QueryParamsRequest>): QueryParamsRequest {
  if (typeUrl != QueryParamsRequest.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object QueryParamsResponseConverter : ProtobufConverter<QueryParamsResponse>

public fun QueryParamsResponse.toAny(): Any = Any(QueryParamsResponse.TYPE_URL,
    with(QueryParamsResponseConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<QueryParamsResponse>): QueryParamsResponse {
  if (typeUrl != QueryParamsResponse.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object QueryFeedConfigRequestConverter : ProtobufConverter<QueryFeedConfigRequest>

public fun QueryFeedConfigRequest.toAny(): Any = Any(QueryFeedConfigRequest.TYPE_URL,
    with(QueryFeedConfigRequestConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<QueryFeedConfigRequest>): QueryFeedConfigRequest {
  if (typeUrl != QueryFeedConfigRequest.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object QueryFeedConfigResponseConverter : ProtobufConverter<QueryFeedConfigResponse>

public fun QueryFeedConfigResponse.toAny(): Any = Any(QueryFeedConfigResponse.TYPE_URL,
    with(QueryFeedConfigResponseConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<QueryFeedConfigResponse>):
    QueryFeedConfigResponse {
  if (typeUrl != QueryFeedConfigResponse.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object QueryFeedConfigInfoRequestConverter :
    ProtobufConverter<QueryFeedConfigInfoRequest>

public fun QueryFeedConfigInfoRequest.toAny(): Any = Any(QueryFeedConfigInfoRequest.TYPE_URL,
    with(QueryFeedConfigInfoRequestConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<QueryFeedConfigInfoRequest>):
    QueryFeedConfigInfoRequest {
  if (typeUrl != QueryFeedConfigInfoRequest.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object QueryFeedConfigInfoResponseConverter :
    ProtobufConverter<QueryFeedConfigInfoResponse>

public fun QueryFeedConfigInfoResponse.toAny(): Any = Any(QueryFeedConfigInfoResponse.TYPE_URL,
    with(QueryFeedConfigInfoResponseConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<QueryFeedConfigInfoResponse>):
    QueryFeedConfigInfoResponse {
  if (typeUrl != QueryFeedConfigInfoResponse.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object QueryLatestRoundRequestConverter : ProtobufConverter<QueryLatestRoundRequest>

public fun QueryLatestRoundRequest.toAny(): Any = Any(QueryLatestRoundRequest.TYPE_URL,
    with(QueryLatestRoundRequestConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<QueryLatestRoundRequest>):
    QueryLatestRoundRequest {
  if (typeUrl != QueryLatestRoundRequest.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object QueryLatestRoundResponseConverter : ProtobufConverter<QueryLatestRoundResponse>

public fun QueryLatestRoundResponse.toAny(): Any = Any(QueryLatestRoundResponse.TYPE_URL,
    with(QueryLatestRoundResponseConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<QueryLatestRoundResponse>):
    QueryLatestRoundResponse {
  if (typeUrl != QueryLatestRoundResponse.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object QueryLatestTransmissionDetailsRequestConverter :
    ProtobufConverter<QueryLatestTransmissionDetailsRequest>

public fun QueryLatestTransmissionDetailsRequest.toAny(): Any =
    Any(QueryLatestTransmissionDetailsRequest.TYPE_URL,
    with(QueryLatestTransmissionDetailsRequestConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<QueryLatestTransmissionDetailsRequest>):
    QueryLatestTransmissionDetailsRequest {
  if (typeUrl != QueryLatestTransmissionDetailsRequest.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object QueryLatestTransmissionDetailsResponseConverter :
    ProtobufConverter<QueryLatestTransmissionDetailsResponse>

public fun QueryLatestTransmissionDetailsResponse.toAny(): Any =
    Any(QueryLatestTransmissionDetailsResponse.TYPE_URL,
    with(QueryLatestTransmissionDetailsResponseConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<QueryLatestTransmissionDetailsResponse>):
    QueryLatestTransmissionDetailsResponse {
  if (typeUrl != QueryLatestTransmissionDetailsResponse.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object QueryOwedAmountRequestConverter : ProtobufConverter<QueryOwedAmountRequest>

public fun QueryOwedAmountRequest.toAny(): Any = Any(QueryOwedAmountRequest.TYPE_URL,
    with(QueryOwedAmountRequestConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<QueryOwedAmountRequest>): QueryOwedAmountRequest {
  if (typeUrl != QueryOwedAmountRequest.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object QueryOwedAmountResponseConverter : ProtobufConverter<QueryOwedAmountResponse>

public fun QueryOwedAmountResponse.toAny(): Any = Any(QueryOwedAmountResponse.TYPE_URL,
    with(QueryOwedAmountResponseConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<QueryOwedAmountResponse>):
    QueryOwedAmountResponse {
  if (typeUrl != QueryOwedAmountResponse.TYPE_URL) throw
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
