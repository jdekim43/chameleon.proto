// Transform from injective/auction/v1beta1/genesis.proto
@file:GeneratorVersion(version = "0.3.1")

package injective.auction.v1beta1

import com.google.protobuf.Descriptors
import com.google.protobuf.Parser
import kr.jadekim.protobuf.`annotation`.GeneratorVersion
import kr.jadekim.protobuf.converter.mapper.ProtobufTypeMapper
import kr.jadekim.protobuf.util.asJavaType
import kr.jadekim.protobuf.util.asKotlinType

public object GenesisStateJvmConverter : ProtobufTypeMapper<GenesisState, Genesis.GenesisState> {
  public override val descriptor: Descriptors.Descriptor = Genesis.GenesisState.getDescriptor()

  public override val parser: Parser<Genesis.GenesisState> = Genesis.GenesisState.parser()

  public override fun convert(obj: Genesis.GenesisState): GenesisState = GenesisState(
  	params = ParamsJvmConverter.convert(obj.getParams()),
  	auctionRound = obj.getAuctionRound().asKotlinType,
  	highestBid = BidJvmConverter.convert(obj.getHighestBid()),
  	auctionEndingTimestamp = obj.getAuctionEndingTimestamp(),
  )

  public override fun convert(obj: GenesisState): Genesis.GenesisState {
    val builder = Genesis.GenesisState.newBuilder()
    builder.setParams(ParamsJvmConverter.convert(obj.params))
    builder.setAuctionRound(obj.auctionRound.asJavaType)
    builder.setHighestBid(BidJvmConverter.convert(obj.highestBid))
    builder.setAuctionEndingTimestamp(obj.auctionEndingTimestamp)
    return builder.build()
  }
}
