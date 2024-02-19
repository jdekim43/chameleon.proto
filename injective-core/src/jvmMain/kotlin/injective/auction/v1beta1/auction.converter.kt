// Transform from injective/auction/v1beta1/auction.proto
@file:GeneratorVersion(version = "0.3.1")

package injective.auction.v1beta1

import kr.jadekim.protobuf.`annotation`.GeneratorVersion
import kr.jadekim.protobuf.converter.ProtobufConverter

public actual object ParamsConverter : ProtobufConverter<Params> by ParamsJvmConverter

public actual object BidConverter : ProtobufConverter<Bid> by BidJvmConverter

public actual object EventBidConverter : ProtobufConverter<EventBid> by EventBidJvmConverter

public actual object EventAuctionResultConverter : ProtobufConverter<EventAuctionResult> by
    EventAuctionResultJvmConverter

public actual object EventAuctionStartConverter : ProtobufConverter<EventAuctionStart> by
    EventAuctionStartJvmConverter
