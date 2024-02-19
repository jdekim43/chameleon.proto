// Transform from injective/wasmx/v1/tx.proto
@file:GeneratorVersion(version = "0.3.1")

package injective.wasmx.v1

import google.protobuf.Any
import java.lang.IllegalStateException
import kr.jadekim.protobuf.`annotation`.GeneratorVersion
import kr.jadekim.protobuf.converter.ProtobufConverter
import kr.jadekim.protobuf.converter.parseProtobuf

public expect object MsgExecuteContractCompatConverter : ProtobufConverter<MsgExecuteContractCompat>

public fun MsgExecuteContractCompat.toAny(): Any = Any(MsgExecuteContractCompat.TYPE_URL,
    with(MsgExecuteContractCompatConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<MsgExecuteContractCompat>):
    MsgExecuteContractCompat {
  if (typeUrl != MsgExecuteContractCompat.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object MsgExecuteContractCompatResponseConverter :
    ProtobufConverter<MsgExecuteContractCompatResponse>

public fun MsgExecuteContractCompatResponse.toAny(): Any =
    Any(MsgExecuteContractCompatResponse.TYPE_URL, with(MsgExecuteContractCompatResponseConverter) {
    toByteArray() })

public fun Any.parse(converter: ProtobufConverter<MsgExecuteContractCompatResponse>):
    MsgExecuteContractCompatResponse {
  if (typeUrl != MsgExecuteContractCompatResponse.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object MsgUpdateContractConverter : ProtobufConverter<MsgUpdateContract>

public fun MsgUpdateContract.toAny(): Any = Any(MsgUpdateContract.TYPE_URL,
    with(MsgUpdateContractConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<MsgUpdateContract>): MsgUpdateContract {
  if (typeUrl != MsgUpdateContract.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object MsgUpdateContractResponseConverter :
    ProtobufConverter<MsgUpdateContractResponse>

public fun MsgUpdateContractResponse.toAny(): Any = Any(MsgUpdateContractResponse.TYPE_URL,
    with(MsgUpdateContractResponseConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<MsgUpdateContractResponse>):
    MsgUpdateContractResponse {
  if (typeUrl != MsgUpdateContractResponse.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object MsgActivateContractConverter : ProtobufConverter<MsgActivateContract>

public fun MsgActivateContract.toAny(): Any = Any(MsgActivateContract.TYPE_URL,
    with(MsgActivateContractConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<MsgActivateContract>): MsgActivateContract {
  if (typeUrl != MsgActivateContract.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object MsgActivateContractResponseConverter :
    ProtobufConverter<MsgActivateContractResponse>

public fun MsgActivateContractResponse.toAny(): Any = Any(MsgActivateContractResponse.TYPE_URL,
    with(MsgActivateContractResponseConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<MsgActivateContractResponse>):
    MsgActivateContractResponse {
  if (typeUrl != MsgActivateContractResponse.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object MsgDeactivateContractConverter : ProtobufConverter<MsgDeactivateContract>

public fun MsgDeactivateContract.toAny(): Any = Any(MsgDeactivateContract.TYPE_URL,
    with(MsgDeactivateContractConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<MsgDeactivateContract>): MsgDeactivateContract {
  if (typeUrl != MsgDeactivateContract.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object MsgDeactivateContractResponseConverter :
    ProtobufConverter<MsgDeactivateContractResponse>

public fun MsgDeactivateContractResponse.toAny(): Any = Any(MsgDeactivateContractResponse.TYPE_URL,
    with(MsgDeactivateContractResponseConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<MsgDeactivateContractResponse>):
    MsgDeactivateContractResponse {
  if (typeUrl != MsgDeactivateContractResponse.TYPE_URL) throw
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

public expect object MsgRegisterContractConverter : ProtobufConverter<MsgRegisterContract>

public fun MsgRegisterContract.toAny(): Any = Any(MsgRegisterContract.TYPE_URL,
    with(MsgRegisterContractConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<MsgRegisterContract>): MsgRegisterContract {
  if (typeUrl != MsgRegisterContract.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object MsgRegisterContractResponseConverter :
    ProtobufConverter<MsgRegisterContractResponse>

public fun MsgRegisterContractResponse.toAny(): Any = Any(MsgRegisterContractResponse.TYPE_URL,
    with(MsgRegisterContractResponseConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<MsgRegisterContractResponse>):
    MsgRegisterContractResponse {
  if (typeUrl != MsgRegisterContractResponse.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}
