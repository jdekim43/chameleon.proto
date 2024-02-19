// Transform from injective/insurance/v1beta1/query.proto
@file:GeneratorVersion(version = "0.3.1")

package injective.insurance.v1beta1

import google.protobuf.Any
import java.lang.IllegalStateException
import kr.jadekim.protobuf.`annotation`.GeneratorVersion
import kr.jadekim.protobuf.converter.ProtobufConverter
import kr.jadekim.protobuf.converter.parseProtobuf

public expect object QueryInsuranceParamsRequestConverter :
    ProtobufConverter<QueryInsuranceParamsRequest>

public fun QueryInsuranceParamsRequest.toAny(): Any = Any(QueryInsuranceParamsRequest.TYPE_URL,
    with(QueryInsuranceParamsRequestConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<QueryInsuranceParamsRequest>):
    QueryInsuranceParamsRequest {
  if (typeUrl != QueryInsuranceParamsRequest.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object QueryInsuranceParamsResponseConverter :
    ProtobufConverter<QueryInsuranceParamsResponse>

public fun QueryInsuranceParamsResponse.toAny(): Any = Any(QueryInsuranceParamsResponse.TYPE_URL,
    with(QueryInsuranceParamsResponseConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<QueryInsuranceParamsResponse>):
    QueryInsuranceParamsResponse {
  if (typeUrl != QueryInsuranceParamsResponse.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object QueryInsuranceFundRequestConverter :
    ProtobufConverter<QueryInsuranceFundRequest>

public fun QueryInsuranceFundRequest.toAny(): Any = Any(QueryInsuranceFundRequest.TYPE_URL,
    with(QueryInsuranceFundRequestConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<QueryInsuranceFundRequest>):
    QueryInsuranceFundRequest {
  if (typeUrl != QueryInsuranceFundRequest.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object QueryInsuranceFundResponseConverter :
    ProtobufConverter<QueryInsuranceFundResponse>

public fun QueryInsuranceFundResponse.toAny(): Any = Any(QueryInsuranceFundResponse.TYPE_URL,
    with(QueryInsuranceFundResponseConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<QueryInsuranceFundResponse>):
    QueryInsuranceFundResponse {
  if (typeUrl != QueryInsuranceFundResponse.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object QueryInsuranceFundsRequestConverter :
    ProtobufConverter<QueryInsuranceFundsRequest>

public fun QueryInsuranceFundsRequest.toAny(): Any = Any(QueryInsuranceFundsRequest.TYPE_URL,
    with(QueryInsuranceFundsRequestConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<QueryInsuranceFundsRequest>):
    QueryInsuranceFundsRequest {
  if (typeUrl != QueryInsuranceFundsRequest.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object QueryInsuranceFundsResponseConverter :
    ProtobufConverter<QueryInsuranceFundsResponse>

public fun QueryInsuranceFundsResponse.toAny(): Any = Any(QueryInsuranceFundsResponse.TYPE_URL,
    with(QueryInsuranceFundsResponseConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<QueryInsuranceFundsResponse>):
    QueryInsuranceFundsResponse {
  if (typeUrl != QueryInsuranceFundsResponse.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object QueryEstimatedRedemptionsRequestConverter :
    ProtobufConverter<QueryEstimatedRedemptionsRequest>

public fun QueryEstimatedRedemptionsRequest.toAny(): Any =
    Any(QueryEstimatedRedemptionsRequest.TYPE_URL, with(QueryEstimatedRedemptionsRequestConverter) {
    toByteArray() })

public fun Any.parse(converter: ProtobufConverter<QueryEstimatedRedemptionsRequest>):
    QueryEstimatedRedemptionsRequest {
  if (typeUrl != QueryEstimatedRedemptionsRequest.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object QueryEstimatedRedemptionsResponseConverter :
    ProtobufConverter<QueryEstimatedRedemptionsResponse>

public fun QueryEstimatedRedemptionsResponse.toAny(): Any =
    Any(QueryEstimatedRedemptionsResponse.TYPE_URL, with(QueryEstimatedRedemptionsResponseConverter)
    { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<QueryEstimatedRedemptionsResponse>):
    QueryEstimatedRedemptionsResponse {
  if (typeUrl != QueryEstimatedRedemptionsResponse.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object QueryPendingRedemptionsRequestConverter :
    ProtobufConverter<QueryPendingRedemptionsRequest>

public fun QueryPendingRedemptionsRequest.toAny(): Any =
    Any(QueryPendingRedemptionsRequest.TYPE_URL, with(QueryPendingRedemptionsRequestConverter) {
    toByteArray() })

public fun Any.parse(converter: ProtobufConverter<QueryPendingRedemptionsRequest>):
    QueryPendingRedemptionsRequest {
  if (typeUrl != QueryPendingRedemptionsRequest.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object QueryPendingRedemptionsResponseConverter :
    ProtobufConverter<QueryPendingRedemptionsResponse>

public fun QueryPendingRedemptionsResponse.toAny(): Any =
    Any(QueryPendingRedemptionsResponse.TYPE_URL, with(QueryPendingRedemptionsResponseConverter) {
    toByteArray() })

public fun Any.parse(converter: ProtobufConverter<QueryPendingRedemptionsResponse>):
    QueryPendingRedemptionsResponse {
  if (typeUrl != QueryPendingRedemptionsResponse.TYPE_URL) throw
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
