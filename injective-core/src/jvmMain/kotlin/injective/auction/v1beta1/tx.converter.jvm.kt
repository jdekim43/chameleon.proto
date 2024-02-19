// Transform from injective/auction/v1beta1/tx.proto
@file:GeneratorVersion(version = "0.3.1")

package injective.auction.v1beta1

import com.google.protobuf.Descriptors
import com.google.protobuf.Parser
import cosmos.base.v1beta1.CoinJvmConverter
import kr.jadekim.protobuf.`annotation`.GeneratorVersion
import kr.jadekim.protobuf.converter.mapper.ProtobufTypeMapper
import kr.jadekim.protobuf.util.asJavaType
import kr.jadekim.protobuf.util.asKotlinType

public object MsgBidJvmConverter : ProtobufTypeMapper<MsgBid, Tx.MsgBid> {
  public override val descriptor: Descriptors.Descriptor = Tx.MsgBid.getDescriptor()

  public override val parser: Parser<Tx.MsgBid> = Tx.MsgBid.parser()

  public override fun convert(obj: Tx.MsgBid): MsgBid = MsgBid(
  	sender = obj.getSender(),
  	bidAmount = CoinJvmConverter.convert(obj.getBidAmount()),
  	round = obj.getRound().asKotlinType,
  )

  public override fun convert(obj: MsgBid): Tx.MsgBid {
    val builder = Tx.MsgBid.newBuilder()
    builder.setSender(obj.sender)
    builder.setBidAmount(CoinJvmConverter.convert(obj.bidAmount))
    builder.setRound(obj.round.asJavaType)
    return builder.build()
  }
}

public object MsgBidResponseJvmConverter : ProtobufTypeMapper<MsgBidResponse, Tx.MsgBidResponse> {
  public override val descriptor: Descriptors.Descriptor = Tx.MsgBidResponse.getDescriptor()

  public override val parser: Parser<Tx.MsgBidResponse> = Tx.MsgBidResponse.parser()

  public override fun convert(obj: Tx.MsgBidResponse): MsgBidResponse = MsgBidResponse(
  )

  public override fun convert(obj: MsgBidResponse): Tx.MsgBidResponse {
    val builder = Tx.MsgBidResponse.newBuilder()
    return builder.build()
  }
}

public object MsgUpdateParamsJvmConverter : ProtobufTypeMapper<MsgUpdateParams, Tx.MsgUpdateParams>
    {
  public override val descriptor: Descriptors.Descriptor = Tx.MsgUpdateParams.getDescriptor()

  public override val parser: Parser<Tx.MsgUpdateParams> = Tx.MsgUpdateParams.parser()

  public override fun convert(obj: Tx.MsgUpdateParams): MsgUpdateParams = MsgUpdateParams(
  	authority = obj.getAuthority(),
  	params = ParamsJvmConverter.convert(obj.getParams()),
  )

  public override fun convert(obj: MsgUpdateParams): Tx.MsgUpdateParams {
    val builder = Tx.MsgUpdateParams.newBuilder()
    builder.setAuthority(obj.authority)
    builder.setParams(ParamsJvmConverter.convert(obj.params))
    return builder.build()
  }
}

public object MsgUpdateParamsResponseJvmConverter :
    ProtobufTypeMapper<MsgUpdateParamsResponse, Tx.MsgUpdateParamsResponse> {
  public override val descriptor: Descriptors.Descriptor =
      Tx.MsgUpdateParamsResponse.getDescriptor()

  public override val parser: Parser<Tx.MsgUpdateParamsResponse> =
      Tx.MsgUpdateParamsResponse.parser()

  public override fun convert(obj: Tx.MsgUpdateParamsResponse): MsgUpdateParamsResponse =
      MsgUpdateParamsResponse(
  )

  public override fun convert(obj: MsgUpdateParamsResponse): Tx.MsgUpdateParamsResponse {
    val builder = Tx.MsgUpdateParamsResponse.newBuilder()
    return builder.build()
  }
}
