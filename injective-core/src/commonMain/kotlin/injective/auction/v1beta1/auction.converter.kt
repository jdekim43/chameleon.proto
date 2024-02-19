// Transform from injective/auction/v1beta1/auction.proto
@file:GeneratorVersion(version = "0.3.1")

package injective.auction.v1beta1

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

public expect object BidConverter : ProtobufConverter<Bid>

public fun Bid.toAny(): Any = Any(Bid.TYPE_URL, with(BidConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<Bid>): Bid {
  if (typeUrl != Bid.TYPE_URL) throw IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object EventBidConverter : ProtobufConverter<EventBid>

public fun EventBid.toAny(): Any = Any(EventBid.TYPE_URL, with(EventBidConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<EventBid>): EventBid {
  if (typeUrl != EventBid.TYPE_URL) throw IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object EventAuctionResultConverter : ProtobufConverter<EventAuctionResult>

public fun EventAuctionResult.toAny(): Any = Any(EventAuctionResult.TYPE_URL,
    with(EventAuctionResultConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<EventAuctionResult>): EventAuctionResult {
  if (typeUrl != EventAuctionResult.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object EventAuctionStartConverter : ProtobufConverter<EventAuctionStart>

public fun EventAuctionStart.toAny(): Any = Any(EventAuctionStart.TYPE_URL,
    with(EventAuctionStartConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<EventAuctionStart>): EventAuctionStart {
  if (typeUrl != EventAuctionStart.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}
