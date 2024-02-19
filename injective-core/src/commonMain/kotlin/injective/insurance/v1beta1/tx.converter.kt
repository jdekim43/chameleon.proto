// Transform from injective/insurance/v1beta1/tx.proto
@file:GeneratorVersion(version = "0.3.1")

package injective.insurance.v1beta1

import google.protobuf.Any
import java.lang.IllegalStateException
import kr.jadekim.protobuf.`annotation`.GeneratorVersion
import kr.jadekim.protobuf.converter.ProtobufConverter
import kr.jadekim.protobuf.converter.parseProtobuf

public expect object MsgCreateInsuranceFundConverter : ProtobufConverter<MsgCreateInsuranceFund>

public fun MsgCreateInsuranceFund.toAny(): Any = Any(MsgCreateInsuranceFund.TYPE_URL,
    with(MsgCreateInsuranceFundConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<MsgCreateInsuranceFund>): MsgCreateInsuranceFund {
  if (typeUrl != MsgCreateInsuranceFund.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object MsgCreateInsuranceFundResponseConverter :
    ProtobufConverter<MsgCreateInsuranceFundResponse>

public fun MsgCreateInsuranceFundResponse.toAny(): Any =
    Any(MsgCreateInsuranceFundResponse.TYPE_URL, with(MsgCreateInsuranceFundResponseConverter) {
    toByteArray() })

public fun Any.parse(converter: ProtobufConverter<MsgCreateInsuranceFundResponse>):
    MsgCreateInsuranceFundResponse {
  if (typeUrl != MsgCreateInsuranceFundResponse.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object MsgUnderwriteConverter : ProtobufConverter<MsgUnderwrite>

public fun MsgUnderwrite.toAny(): Any = Any(MsgUnderwrite.TYPE_URL, with(MsgUnderwriteConverter) {
    toByteArray() })

public fun Any.parse(converter: ProtobufConverter<MsgUnderwrite>): MsgUnderwrite {
  if (typeUrl != MsgUnderwrite.TYPE_URL) throw IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object MsgUnderwriteResponseConverter : ProtobufConverter<MsgUnderwriteResponse>

public fun MsgUnderwriteResponse.toAny(): Any = Any(MsgUnderwriteResponse.TYPE_URL,
    with(MsgUnderwriteResponseConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<MsgUnderwriteResponse>): MsgUnderwriteResponse {
  if (typeUrl != MsgUnderwriteResponse.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object MsgRequestRedemptionConverter : ProtobufConverter<MsgRequestRedemption>

public fun MsgRequestRedemption.toAny(): Any = Any(MsgRequestRedemption.TYPE_URL,
    with(MsgRequestRedemptionConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<MsgRequestRedemption>): MsgRequestRedemption {
  if (typeUrl != MsgRequestRedemption.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object MsgRequestRedemptionResponseConverter :
    ProtobufConverter<MsgRequestRedemptionResponse>

public fun MsgRequestRedemptionResponse.toAny(): Any = Any(MsgRequestRedemptionResponse.TYPE_URL,
    with(MsgRequestRedemptionResponseConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<MsgRequestRedemptionResponse>):
    MsgRequestRedemptionResponse {
  if (typeUrl != MsgRequestRedemptionResponse.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
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
