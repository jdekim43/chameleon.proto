// Transform from injective/auction/v1beta1/tx.proto
@file:GeneratorVersion(version = "0.3.1")

package injective.auction.v1beta1

import kr.jadekim.protobuf.`annotation`.GeneratorVersion
import kr.jadekim.protobuf.converter.ProtobufConverter

public actual object MsgBidConverter : ProtobufConverter<MsgBid> by MsgBidJvmConverter

public actual object MsgBidResponseConverter : ProtobufConverter<MsgBidResponse> by
    MsgBidResponseJvmConverter

public actual object MsgUpdateParamsConverter : ProtobufConverter<MsgUpdateParams> by
    MsgUpdateParamsJvmConverter

public actual object MsgUpdateParamsResponseConverter : ProtobufConverter<MsgUpdateParamsResponse>
    by MsgUpdateParamsResponseJvmConverter
