// Transform from injective/ocr/v1beta1/tx.proto
@file:GeneratorVersion(version = "0.3.1")

package injective.ocr.v1beta1

import google.protobuf.Any
import java.lang.IllegalStateException
import kr.jadekim.protobuf.`annotation`.GeneratorVersion
import kr.jadekim.protobuf.converter.ProtobufConverter
import kr.jadekim.protobuf.converter.parseProtobuf

public expect object MsgCreateFeedConverter : ProtobufConverter<MsgCreateFeed>

public fun MsgCreateFeed.toAny(): Any = Any(MsgCreateFeed.TYPE_URL, with(MsgCreateFeedConverter) {
    toByteArray() })

public fun Any.parse(converter: ProtobufConverter<MsgCreateFeed>): MsgCreateFeed {
  if (typeUrl != MsgCreateFeed.TYPE_URL) throw IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object MsgCreateFeedResponseConverter : ProtobufConverter<MsgCreateFeedResponse>

public fun MsgCreateFeedResponse.toAny(): Any = Any(MsgCreateFeedResponse.TYPE_URL,
    with(MsgCreateFeedResponseConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<MsgCreateFeedResponse>): MsgCreateFeedResponse {
  if (typeUrl != MsgCreateFeedResponse.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object MsgUpdateFeedConverter : ProtobufConverter<MsgUpdateFeed>

public fun MsgUpdateFeed.toAny(): Any = Any(MsgUpdateFeed.TYPE_URL, with(MsgUpdateFeedConverter) {
    toByteArray() })

public fun Any.parse(converter: ProtobufConverter<MsgUpdateFeed>): MsgUpdateFeed {
  if (typeUrl != MsgUpdateFeed.TYPE_URL) throw IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object MsgUpdateFeedResponseConverter : ProtobufConverter<MsgUpdateFeedResponse>

public fun MsgUpdateFeedResponse.toAny(): Any = Any(MsgUpdateFeedResponse.TYPE_URL,
    with(MsgUpdateFeedResponseConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<MsgUpdateFeedResponse>): MsgUpdateFeedResponse {
  if (typeUrl != MsgUpdateFeedResponse.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object MsgTransmitConverter : ProtobufConverter<MsgTransmit>

public fun MsgTransmit.toAny(): Any = Any(MsgTransmit.TYPE_URL, with(MsgTransmitConverter) {
    toByteArray() })

public fun Any.parse(converter: ProtobufConverter<MsgTransmit>): MsgTransmit {
  if (typeUrl != MsgTransmit.TYPE_URL) throw IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object MsgTransmitResponseConverter : ProtobufConverter<MsgTransmitResponse>

public fun MsgTransmitResponse.toAny(): Any = Any(MsgTransmitResponse.TYPE_URL,
    with(MsgTransmitResponseConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<MsgTransmitResponse>): MsgTransmitResponse {
  if (typeUrl != MsgTransmitResponse.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object MsgFundFeedRewardPoolConverter : ProtobufConverter<MsgFundFeedRewardPool>

public fun MsgFundFeedRewardPool.toAny(): Any = Any(MsgFundFeedRewardPool.TYPE_URL,
    with(MsgFundFeedRewardPoolConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<MsgFundFeedRewardPool>): MsgFundFeedRewardPool {
  if (typeUrl != MsgFundFeedRewardPool.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object MsgFundFeedRewardPoolResponseConverter :
    ProtobufConverter<MsgFundFeedRewardPoolResponse>

public fun MsgFundFeedRewardPoolResponse.toAny(): Any = Any(MsgFundFeedRewardPoolResponse.TYPE_URL,
    with(MsgFundFeedRewardPoolResponseConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<MsgFundFeedRewardPoolResponse>):
    MsgFundFeedRewardPoolResponse {
  if (typeUrl != MsgFundFeedRewardPoolResponse.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object MsgWithdrawFeedRewardPoolConverter :
    ProtobufConverter<MsgWithdrawFeedRewardPool>

public fun MsgWithdrawFeedRewardPool.toAny(): Any = Any(MsgWithdrawFeedRewardPool.TYPE_URL,
    with(MsgWithdrawFeedRewardPoolConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<MsgWithdrawFeedRewardPool>):
    MsgWithdrawFeedRewardPool {
  if (typeUrl != MsgWithdrawFeedRewardPool.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object MsgWithdrawFeedRewardPoolResponseConverter :
    ProtobufConverter<MsgWithdrawFeedRewardPoolResponse>

public fun MsgWithdrawFeedRewardPoolResponse.toAny(): Any =
    Any(MsgWithdrawFeedRewardPoolResponse.TYPE_URL, with(MsgWithdrawFeedRewardPoolResponseConverter)
    { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<MsgWithdrawFeedRewardPoolResponse>):
    MsgWithdrawFeedRewardPoolResponse {
  if (typeUrl != MsgWithdrawFeedRewardPoolResponse.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object MsgSetPayeesConverter : ProtobufConverter<MsgSetPayees>

public fun MsgSetPayees.toAny(): Any = Any(MsgSetPayees.TYPE_URL, with(MsgSetPayeesConverter) {
    toByteArray() })

public fun Any.parse(converter: ProtobufConverter<MsgSetPayees>): MsgSetPayees {
  if (typeUrl != MsgSetPayees.TYPE_URL) throw IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object MsgSetPayeesResponseConverter : ProtobufConverter<MsgSetPayeesResponse>

public fun MsgSetPayeesResponse.toAny(): Any = Any(MsgSetPayeesResponse.TYPE_URL,
    with(MsgSetPayeesResponseConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<MsgSetPayeesResponse>): MsgSetPayeesResponse {
  if (typeUrl != MsgSetPayeesResponse.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object MsgTransferPayeeshipConverter : ProtobufConverter<MsgTransferPayeeship>

public fun MsgTransferPayeeship.toAny(): Any = Any(MsgTransferPayeeship.TYPE_URL,
    with(MsgTransferPayeeshipConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<MsgTransferPayeeship>): MsgTransferPayeeship {
  if (typeUrl != MsgTransferPayeeship.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object MsgTransferPayeeshipResponseConverter :
    ProtobufConverter<MsgTransferPayeeshipResponse>

public fun MsgTransferPayeeshipResponse.toAny(): Any = Any(MsgTransferPayeeshipResponse.TYPE_URL,
    with(MsgTransferPayeeshipResponseConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<MsgTransferPayeeshipResponse>):
    MsgTransferPayeeshipResponse {
  if (typeUrl != MsgTransferPayeeshipResponse.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object MsgAcceptPayeeshipConverter : ProtobufConverter<MsgAcceptPayeeship>

public fun MsgAcceptPayeeship.toAny(): Any = Any(MsgAcceptPayeeship.TYPE_URL,
    with(MsgAcceptPayeeshipConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<MsgAcceptPayeeship>): MsgAcceptPayeeship {
  if (typeUrl != MsgAcceptPayeeship.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object MsgAcceptPayeeshipResponseConverter :
    ProtobufConverter<MsgAcceptPayeeshipResponse>

public fun MsgAcceptPayeeshipResponse.toAny(): Any = Any(MsgAcceptPayeeshipResponse.TYPE_URL,
    with(MsgAcceptPayeeshipResponseConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<MsgAcceptPayeeshipResponse>):
    MsgAcceptPayeeshipResponse {
  if (typeUrl != MsgAcceptPayeeshipResponse.TYPE_URL) throw
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
