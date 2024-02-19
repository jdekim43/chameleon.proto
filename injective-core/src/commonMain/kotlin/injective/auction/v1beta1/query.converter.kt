// Transform from injective/auction/v1beta1/query.proto
@file:GeneratorVersion(version = "0.3.1")

package injective.auction.v1beta1

import google.protobuf.Any
import java.lang.IllegalStateException
import kr.jadekim.protobuf.`annotation`.GeneratorVersion
import kr.jadekim.protobuf.converter.ProtobufConverter
import kr.jadekim.protobuf.converter.parseProtobuf

public expect object QueryAuctionParamsRequestConverter :
    ProtobufConverter<QueryAuctionParamsRequest>

public fun QueryAuctionParamsRequest.toAny(): Any = Any(QueryAuctionParamsRequest.TYPE_URL,
    with(QueryAuctionParamsRequestConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<QueryAuctionParamsRequest>):
    QueryAuctionParamsRequest {
  if (typeUrl != QueryAuctionParamsRequest.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object QueryAuctionParamsResponseConverter :
    ProtobufConverter<QueryAuctionParamsResponse>

public fun QueryAuctionParamsResponse.toAny(): Any = Any(QueryAuctionParamsResponse.TYPE_URL,
    with(QueryAuctionParamsResponseConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<QueryAuctionParamsResponse>):
    QueryAuctionParamsResponse {
  if (typeUrl != QueryAuctionParamsResponse.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object QueryCurrentAuctionBasketRequestConverter :
    ProtobufConverter<QueryCurrentAuctionBasketRequest>

public fun QueryCurrentAuctionBasketRequest.toAny(): Any =
    Any(QueryCurrentAuctionBasketRequest.TYPE_URL, with(QueryCurrentAuctionBasketRequestConverter) {
    toByteArray() })

public fun Any.parse(converter: ProtobufConverter<QueryCurrentAuctionBasketRequest>):
    QueryCurrentAuctionBasketRequest {
  if (typeUrl != QueryCurrentAuctionBasketRequest.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object QueryCurrentAuctionBasketResponseConverter :
    ProtobufConverter<QueryCurrentAuctionBasketResponse>

public fun QueryCurrentAuctionBasketResponse.toAny(): Any =
    Any(QueryCurrentAuctionBasketResponse.TYPE_URL, with(QueryCurrentAuctionBasketResponseConverter)
    { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<QueryCurrentAuctionBasketResponse>):
    QueryCurrentAuctionBasketResponse {
  if (typeUrl != QueryCurrentAuctionBasketResponse.TYPE_URL) throw
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
