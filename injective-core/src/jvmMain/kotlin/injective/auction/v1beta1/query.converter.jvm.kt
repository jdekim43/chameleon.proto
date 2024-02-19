// Transform from injective/auction/v1beta1/query.proto
@file:GeneratorVersion(version = "0.3.1")

package injective.auction.v1beta1

import com.google.protobuf.Descriptors
import com.google.protobuf.Parser
import cosmos.base.v1beta1.CoinJvmConverter
import kr.jadekim.protobuf.`annotation`.GeneratorVersion
import kr.jadekim.protobuf.converter.mapper.ProtobufTypeMapper
import kr.jadekim.protobuf.util.asJavaType
import kr.jadekim.protobuf.util.asKotlinType

public object QueryAuctionParamsRequestJvmConverter :
    ProtobufTypeMapper<QueryAuctionParamsRequest, QueryOuterClass.QueryAuctionParamsRequest> {
  public override val descriptor: Descriptors.Descriptor =
      QueryOuterClass.QueryAuctionParamsRequest.getDescriptor()

  public override val parser: Parser<QueryOuterClass.QueryAuctionParamsRequest> =
      QueryOuterClass.QueryAuctionParamsRequest.parser()

  public override fun convert(obj: QueryOuterClass.QueryAuctionParamsRequest):
      QueryAuctionParamsRequest = QueryAuctionParamsRequest(
  )

  public override fun convert(obj: QueryAuctionParamsRequest):
      QueryOuterClass.QueryAuctionParamsRequest {
    val builder = QueryOuterClass.QueryAuctionParamsRequest.newBuilder()
    return builder.build()
  }
}

public object QueryAuctionParamsResponseJvmConverter :
    ProtobufTypeMapper<QueryAuctionParamsResponse, QueryOuterClass.QueryAuctionParamsResponse> {
  public override val descriptor: Descriptors.Descriptor =
      QueryOuterClass.QueryAuctionParamsResponse.getDescriptor()

  public override val parser: Parser<QueryOuterClass.QueryAuctionParamsResponse> =
      QueryOuterClass.QueryAuctionParamsResponse.parser()

  public override fun convert(obj: QueryOuterClass.QueryAuctionParamsResponse):
      QueryAuctionParamsResponse = QueryAuctionParamsResponse(
  	params = ParamsJvmConverter.convert(obj.getParams()),
  )

  public override fun convert(obj: QueryAuctionParamsResponse):
      QueryOuterClass.QueryAuctionParamsResponse {
    val builder = QueryOuterClass.QueryAuctionParamsResponse.newBuilder()
    builder.setParams(ParamsJvmConverter.convert(obj.params))
    return builder.build()
  }
}

public object QueryCurrentAuctionBasketRequestJvmConverter :
    ProtobufTypeMapper<QueryCurrentAuctionBasketRequest, QueryOuterClass.QueryCurrentAuctionBasketRequest>
    {
  public override val descriptor: Descriptors.Descriptor =
      QueryOuterClass.QueryCurrentAuctionBasketRequest.getDescriptor()

  public override val parser: Parser<QueryOuterClass.QueryCurrentAuctionBasketRequest> =
      QueryOuterClass.QueryCurrentAuctionBasketRequest.parser()

  public override fun convert(obj: QueryOuterClass.QueryCurrentAuctionBasketRequest):
      QueryCurrentAuctionBasketRequest = QueryCurrentAuctionBasketRequest(
  )

  public override fun convert(obj: QueryCurrentAuctionBasketRequest):
      QueryOuterClass.QueryCurrentAuctionBasketRequest {
    val builder = QueryOuterClass.QueryCurrentAuctionBasketRequest.newBuilder()
    return builder.build()
  }
}

public object QueryCurrentAuctionBasketResponseJvmConverter :
    ProtobufTypeMapper<QueryCurrentAuctionBasketResponse, QueryOuterClass.QueryCurrentAuctionBasketResponse>
    {
  public override val descriptor: Descriptors.Descriptor =
      QueryOuterClass.QueryCurrentAuctionBasketResponse.getDescriptor()

  public override val parser: Parser<QueryOuterClass.QueryCurrentAuctionBasketResponse> =
      QueryOuterClass.QueryCurrentAuctionBasketResponse.parser()

  public override fun convert(obj: QueryOuterClass.QueryCurrentAuctionBasketResponse):
      QueryCurrentAuctionBasketResponse = QueryCurrentAuctionBasketResponse(
  	amount = obj.getAmountList().map { CoinJvmConverter.convert(it) },
  	auctionRound = obj.getAuctionRound().asKotlinType,
  	auctionClosingTime = obj.getAuctionClosingTime(),
  	highestBidder = obj.getHighestBidder(),
  	highestBidAmount = obj.getHighestBidAmount(),
  )

  public override fun convert(obj: QueryCurrentAuctionBasketResponse):
      QueryOuterClass.QueryCurrentAuctionBasketResponse {
    val builder = QueryOuterClass.QueryCurrentAuctionBasketResponse.newBuilder()
    builder.addAllAmount(obj.amount.map { CoinJvmConverter.convert(it) })
    builder.setAuctionRound(obj.auctionRound.asJavaType)
    builder.setAuctionClosingTime(obj.auctionClosingTime)
    builder.setHighestBidder(obj.highestBidder)
    builder.setHighestBidAmount(obj.highestBidAmount)
    return builder.build()
  }
}

public object QueryModuleStateRequestJvmConverter :
    ProtobufTypeMapper<QueryModuleStateRequest, QueryOuterClass.QueryModuleStateRequest> {
  public override val descriptor: Descriptors.Descriptor =
      QueryOuterClass.QueryModuleStateRequest.getDescriptor()

  public override val parser: Parser<QueryOuterClass.QueryModuleStateRequest> =
      QueryOuterClass.QueryModuleStateRequest.parser()

  public override fun convert(obj: QueryOuterClass.QueryModuleStateRequest): QueryModuleStateRequest
      = QueryModuleStateRequest(
  )

  public override fun convert(obj: QueryModuleStateRequest):
      QueryOuterClass.QueryModuleStateRequest {
    val builder = QueryOuterClass.QueryModuleStateRequest.newBuilder()
    return builder.build()
  }
}

public object QueryModuleStateResponseJvmConverter :
    ProtobufTypeMapper<QueryModuleStateResponse, QueryOuterClass.QueryModuleStateResponse> {
  public override val descriptor: Descriptors.Descriptor =
      QueryOuterClass.QueryModuleStateResponse.getDescriptor()

  public override val parser: Parser<QueryOuterClass.QueryModuleStateResponse> =
      QueryOuterClass.QueryModuleStateResponse.parser()

  public override fun convert(obj: QueryOuterClass.QueryModuleStateResponse):
      QueryModuleStateResponse = QueryModuleStateResponse(
  	state = GenesisStateJvmConverter.convert(obj.getState()),
  )

  public override fun convert(obj: QueryModuleStateResponse):
      QueryOuterClass.QueryModuleStateResponse {
    val builder = QueryOuterClass.QueryModuleStateResponse.newBuilder()
    builder.setState(GenesisStateJvmConverter.convert(obj.state))
    return builder.build()
  }
}
