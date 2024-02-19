// Transform from injective/auction/v1beta1/auction.proto
@file:GeneratorVersion(version = "0.3.1")

package injective.auction.v1beta1

import com.google.protobuf.Descriptors
import com.google.protobuf.Parser
import cosmos.base.v1beta1.CoinJvmConverter
import kr.jadekim.protobuf.`annotation`.GeneratorVersion
import kr.jadekim.protobuf.converter.mapper.ProtobufTypeMapper
import kr.jadekim.protobuf.util.asJavaType
import kr.jadekim.protobuf.util.asKotlinType

public object ParamsJvmConverter : ProtobufTypeMapper<Params, Auction.Params> {
  public override val descriptor: Descriptors.Descriptor = Auction.Params.getDescriptor()

  public override val parser: Parser<Auction.Params> = Auction.Params.parser()

  public override fun convert(obj: Auction.Params): Params = Params(
  	auctionPeriod = obj.getAuctionPeriod(),
  	minNextBidIncrementRate = obj.getMinNextBidIncrementRate(),
  )

  public override fun convert(obj: Params): Auction.Params {
    val builder = Auction.Params.newBuilder()
    builder.setAuctionPeriod(obj.auctionPeriod)
    builder.setMinNextBidIncrementRate(obj.minNextBidIncrementRate)
    return builder.build()
  }
}

public object BidJvmConverter : ProtobufTypeMapper<Bid, Auction.Bid> {
  public override val descriptor: Descriptors.Descriptor = Auction.Bid.getDescriptor()

  public override val parser: Parser<Auction.Bid> = Auction.Bid.parser()

  public override fun convert(obj: Auction.Bid): Bid = Bid(
  	bidder = obj.getBidder(),
  	amount = obj.getAmount(),
  )

  public override fun convert(obj: Bid): Auction.Bid {
    val builder = Auction.Bid.newBuilder()
    builder.setBidder(obj.bidder)
    builder.setAmount(obj.amount)
    return builder.build()
  }
}

public object EventBidJvmConverter : ProtobufTypeMapper<EventBid, Auction.EventBid> {
  public override val descriptor: Descriptors.Descriptor = Auction.EventBid.getDescriptor()

  public override val parser: Parser<Auction.EventBid> = Auction.EventBid.parser()

  public override fun convert(obj: Auction.EventBid): EventBid = EventBid(
  	bidder = obj.getBidder(),
  	amount = obj.getAmount(),
  	round = obj.getRound().asKotlinType,
  )

  public override fun convert(obj: EventBid): Auction.EventBid {
    val builder = Auction.EventBid.newBuilder()
    builder.setBidder(obj.bidder)
    builder.setAmount(obj.amount)
    builder.setRound(obj.round.asJavaType)
    return builder.build()
  }
}

public object EventAuctionResultJvmConverter :
    ProtobufTypeMapper<EventAuctionResult, Auction.EventAuctionResult> {
  public override val descriptor: Descriptors.Descriptor =
      Auction.EventAuctionResult.getDescriptor()

  public override val parser: Parser<Auction.EventAuctionResult> =
      Auction.EventAuctionResult.parser()

  public override fun convert(obj: Auction.EventAuctionResult): EventAuctionResult =
      EventAuctionResult(
  	winner = obj.getWinner(),
  	amount = obj.getAmount(),
  	round = obj.getRound().asKotlinType,
  )

  public override fun convert(obj: EventAuctionResult): Auction.EventAuctionResult {
    val builder = Auction.EventAuctionResult.newBuilder()
    builder.setWinner(obj.winner)
    builder.setAmount(obj.amount)
    builder.setRound(obj.round.asJavaType)
    return builder.build()
  }
}

public object EventAuctionStartJvmConverter :
    ProtobufTypeMapper<EventAuctionStart, Auction.EventAuctionStart> {
  public override val descriptor: Descriptors.Descriptor = Auction.EventAuctionStart.getDescriptor()

  public override val parser: Parser<Auction.EventAuctionStart> = Auction.EventAuctionStart.parser()

  public override fun convert(obj: Auction.EventAuctionStart): EventAuctionStart =
      EventAuctionStart(
  	round = obj.getRound().asKotlinType,
  	endingTimestamp = obj.getEndingTimestamp(),
  	newBasket = obj.getNewBasketList().map { CoinJvmConverter.convert(it) },
  )

  public override fun convert(obj: EventAuctionStart): Auction.EventAuctionStart {
    val builder = Auction.EventAuctionStart.newBuilder()
    builder.setRound(obj.round.asJavaType)
    builder.setEndingTimestamp(obj.endingTimestamp)
    builder.addAllNewBasket(obj.newBasket.map { CoinJvmConverter.convert(it) })
    return builder.build()
  }
}
