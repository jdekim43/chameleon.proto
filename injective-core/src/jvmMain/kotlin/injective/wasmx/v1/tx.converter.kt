// Transform from injective/wasmx/v1/tx.proto
@file:GeneratorVersion(version = "0.3.1")

package injective.wasmx.v1

import kr.jadekim.protobuf.`annotation`.GeneratorVersion
import kr.jadekim.protobuf.converter.ProtobufConverter

public actual object MsgExecuteContractCompatConverter : ProtobufConverter<MsgExecuteContractCompat>
    by MsgExecuteContractCompatJvmConverter

public actual object MsgExecuteContractCompatResponseConverter :
    ProtobufConverter<MsgExecuteContractCompatResponse> by
    MsgExecuteContractCompatResponseJvmConverter

public actual object MsgUpdateContractConverter : ProtobufConverter<MsgUpdateContract> by
    MsgUpdateContractJvmConverter

public actual object MsgUpdateContractResponseConverter :
    ProtobufConverter<MsgUpdateContractResponse> by MsgUpdateContractResponseJvmConverter

public actual object MsgActivateContractConverter : ProtobufConverter<MsgActivateContract> by
    MsgActivateContractJvmConverter

public actual object MsgActivateContractResponseConverter :
    ProtobufConverter<MsgActivateContractResponse> by MsgActivateContractResponseJvmConverter

public actual object MsgDeactivateContractConverter : ProtobufConverter<MsgDeactivateContract> by
    MsgDeactivateContractJvmConverter

public actual object MsgDeactivateContractResponseConverter :
    ProtobufConverter<MsgDeactivateContractResponse> by MsgDeactivateContractResponseJvmConverter

public actual object MsgUpdateParamsConverter : ProtobufConverter<MsgUpdateParams> by
    MsgUpdateParamsJvmConverter

public actual object MsgUpdateParamsResponseConverter : ProtobufConverter<MsgUpdateParamsResponse>
    by MsgUpdateParamsResponseJvmConverter

public actual object MsgRegisterContractConverter : ProtobufConverter<MsgRegisterContract> by
    MsgRegisterContractJvmConverter

public actual object MsgRegisterContractResponseConverter :
    ProtobufConverter<MsgRegisterContractResponse> by MsgRegisterContractResponseJvmConverter
