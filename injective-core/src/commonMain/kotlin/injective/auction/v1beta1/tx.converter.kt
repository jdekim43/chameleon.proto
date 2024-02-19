// Transform from injective/auction/v1beta1/tx.proto
@file:GeneratorVersion(version = "0.3.1")

package injective.auction.v1beta1

import google.protobuf.Any
import java.lang.IllegalStateException
import kr.jadekim.protobuf.`annotation`.GeneratorVersion
import kr.jadekim.protobuf.converter.ProtobufConverter
import kr.jadekim.protobuf.converter.parseProtobuf

public expect object MsgBidConverter : ProtobufConverter<MsgBid>

public fun MsgBid.toAny(): Any = Any(MsgBid.TYPE_URL, with(MsgBidConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<MsgBid>): MsgBid {
  if (typeUrl != MsgBid.TYPE_URL) throw IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object MsgBidResponseConverter : ProtobufConverter<MsgBidResponse>

public fun MsgBidResponse.toAny(): Any = Any(MsgBidResponse.TYPE_URL, with(MsgBidResponseConverter)
    { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<MsgBidResponse>): MsgBidResponse {
  if (typeUrl != MsgBidResponse.TYPE_URL) throw IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object MsgUpdateParamsConverter : ProtobufConverter<MsgUpdateParams>

public fun MsgUpdateParams.toAny(): Any = Any(MsgUpdateParams.TYPE_URL,
    with(MsgUpdateParamsConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<MsgUpdateParams>): MsgUpdateParams {
  if (typeUrl != MsgUpdateParams.TYPE_URL) throw IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object MsgUpdateParamsResponseConverter : ProtobufConverter<MsgUpdateParamsResponse>

public fun MsgUpdateParamsResponse.toAny(): Any = Any(MsgUpdateParamsResponse.TYPE_URL,
    with(MsgUpdateParamsResponseConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<MsgUpdateParamsResponse>):
    MsgUpdateParamsResponse {
  if (typeUrl != MsgUpdateParamsResponse.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}
