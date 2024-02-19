// Transform from injective/ocr/v1beta1/tx.proto
@file:GeneratorVersion(version = "0.3.1")

package injective.ocr.v1beta1

import kr.jadekim.protobuf.`annotation`.GeneratorVersion
import kr.jadekim.protobuf.converter.ProtobufConverter

public actual object MsgCreateFeedConverter : ProtobufConverter<MsgCreateFeed> by
    MsgCreateFeedJvmConverter

public actual object MsgCreateFeedResponseConverter : ProtobufConverter<MsgCreateFeedResponse> by
    MsgCreateFeedResponseJvmConverter

public actual object MsgUpdateFeedConverter : ProtobufConverter<MsgUpdateFeed> by
    MsgUpdateFeedJvmConverter

public actual object MsgUpdateFeedResponseConverter : ProtobufConverter<MsgUpdateFeedResponse> by
    MsgUpdateFeedResponseJvmConverter

public actual object MsgTransmitConverter : ProtobufConverter<MsgTransmit> by
    MsgTransmitJvmConverter

public actual object MsgTransmitResponseConverter : ProtobufConverter<MsgTransmitResponse> by
    MsgTransmitResponseJvmConverter

public actual object MsgFundFeedRewardPoolConverter : ProtobufConverter<MsgFundFeedRewardPool> by
    MsgFundFeedRewardPoolJvmConverter

public actual object MsgFundFeedRewardPoolResponseConverter :
    ProtobufConverter<MsgFundFeedRewardPoolResponse> by MsgFundFeedRewardPoolResponseJvmConverter

public actual object MsgWithdrawFeedRewardPoolConverter :
    ProtobufConverter<MsgWithdrawFeedRewardPool> by MsgWithdrawFeedRewardPoolJvmConverter

public actual object MsgWithdrawFeedRewardPoolResponseConverter :
    ProtobufConverter<MsgWithdrawFeedRewardPoolResponse> by
    MsgWithdrawFeedRewardPoolResponseJvmConverter

public actual object MsgSetPayeesConverter : ProtobufConverter<MsgSetPayees> by
    MsgSetPayeesJvmConverter

public actual object MsgSetPayeesResponseConverter : ProtobufConverter<MsgSetPayeesResponse> by
    MsgSetPayeesResponseJvmConverter

public actual object MsgTransferPayeeshipConverter : ProtobufConverter<MsgTransferPayeeship> by
    MsgTransferPayeeshipJvmConverter

public actual object MsgTransferPayeeshipResponseConverter :
    ProtobufConverter<MsgTransferPayeeshipResponse> by MsgTransferPayeeshipResponseJvmConverter

public actual object MsgAcceptPayeeshipConverter : ProtobufConverter<MsgAcceptPayeeship> by
    MsgAcceptPayeeshipJvmConverter

public actual object MsgAcceptPayeeshipResponseConverter :
    ProtobufConverter<MsgAcceptPayeeshipResponse> by MsgAcceptPayeeshipResponseJvmConverter

public actual object MsgUpdateParamsConverter : ProtobufConverter<MsgUpdateParams> by
    MsgUpdateParamsJvmConverter

public actual object MsgUpdateParamsResponseConverter : ProtobufConverter<MsgUpdateParamsResponse>
    by MsgUpdateParamsResponseJvmConverter
