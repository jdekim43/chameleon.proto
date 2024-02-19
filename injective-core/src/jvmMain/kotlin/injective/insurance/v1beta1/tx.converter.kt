// Transform from injective/insurance/v1beta1/tx.proto
@file:GeneratorVersion(version = "0.3.1")

package injective.insurance.v1beta1

import kr.jadekim.protobuf.`annotation`.GeneratorVersion
import kr.jadekim.protobuf.converter.ProtobufConverter

public actual object MsgCreateInsuranceFundConverter : ProtobufConverter<MsgCreateInsuranceFund> by
    MsgCreateInsuranceFundJvmConverter

public actual object MsgCreateInsuranceFundResponseConverter :
    ProtobufConverter<MsgCreateInsuranceFundResponse> by MsgCreateInsuranceFundResponseJvmConverter

public actual object MsgUnderwriteConverter : ProtobufConverter<MsgUnderwrite> by
    MsgUnderwriteJvmConverter

public actual object MsgUnderwriteResponseConverter : ProtobufConverter<MsgUnderwriteResponse> by
    MsgUnderwriteResponseJvmConverter

public actual object MsgRequestRedemptionConverter : ProtobufConverter<MsgRequestRedemption> by
    MsgRequestRedemptionJvmConverter

public actual object MsgRequestRedemptionResponseConverter :
    ProtobufConverter<MsgRequestRedemptionResponse> by MsgRequestRedemptionResponseJvmConverter

public actual object MsgUpdateParamsConverter : ProtobufConverter<MsgUpdateParams> by
    MsgUpdateParamsJvmConverter

public actual object MsgUpdateParamsResponseConverter : ProtobufConverter<MsgUpdateParamsResponse>
    by MsgUpdateParamsResponseJvmConverter
