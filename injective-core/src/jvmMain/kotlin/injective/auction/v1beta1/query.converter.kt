// Transform from injective/auction/v1beta1/query.proto
@file:GeneratorVersion(version = "0.3.1")

package injective.auction.v1beta1

import kr.jadekim.protobuf.`annotation`.GeneratorVersion
import kr.jadekim.protobuf.converter.ProtobufConverter

public actual object QueryAuctionParamsRequestConverter :
    ProtobufConverter<QueryAuctionParamsRequest> by QueryAuctionParamsRequestJvmConverter

public actual object QueryAuctionParamsResponseConverter :
    ProtobufConverter<QueryAuctionParamsResponse> by QueryAuctionParamsResponseJvmConverter

public actual object QueryCurrentAuctionBasketRequestConverter :
    ProtobufConverter<QueryCurrentAuctionBasketRequest> by
    QueryCurrentAuctionBasketRequestJvmConverter

public actual object QueryCurrentAuctionBasketResponseConverter :
    ProtobufConverter<QueryCurrentAuctionBasketResponse> by
    QueryCurrentAuctionBasketResponseJvmConverter

public actual object QueryModuleStateRequestConverter : ProtobufConverter<QueryModuleStateRequest>
    by QueryModuleStateRequestJvmConverter

public actual object QueryModuleStateResponseConverter : ProtobufConverter<QueryModuleStateResponse>
    by QueryModuleStateResponseJvmConverter
