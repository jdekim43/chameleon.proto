// Transform from injective/permissions/v1beta1/tx.proto
@file:GeneratorVersion(version = "0.3.1")

package injective.permissions.v1beta1

import google.protobuf.Any
import java.lang.IllegalStateException
import kr.jadekim.protobuf.`annotation`.GeneratorVersion
import kr.jadekim.protobuf.converter.ProtobufConverter
import kr.jadekim.protobuf.converter.parseProtobuf

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

public expect object MsgCreateNamespaceConverter : ProtobufConverter<MsgCreateNamespace>

public fun MsgCreateNamespace.toAny(): Any = Any(MsgCreateNamespace.TYPE_URL,
    with(MsgCreateNamespaceConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<MsgCreateNamespace>): MsgCreateNamespace {
  if (typeUrl != MsgCreateNamespace.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object MsgCreateNamespaceResponseConverter :
    ProtobufConverter<MsgCreateNamespaceResponse>

public fun MsgCreateNamespaceResponse.toAny(): Any = Any(MsgCreateNamespaceResponse.TYPE_URL,
    with(MsgCreateNamespaceResponseConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<MsgCreateNamespaceResponse>):
    MsgCreateNamespaceResponse {
  if (typeUrl != MsgCreateNamespaceResponse.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object MsgDeleteNamespaceConverter : ProtobufConverter<MsgDeleteNamespace>

public fun MsgDeleteNamespace.toAny(): Any = Any(MsgDeleteNamespace.TYPE_URL,
    with(MsgDeleteNamespaceConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<MsgDeleteNamespace>): MsgDeleteNamespace {
  if (typeUrl != MsgDeleteNamespace.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object MsgDeleteNamespaceResponseConverter :
    ProtobufConverter<MsgDeleteNamespaceResponse>

public fun MsgDeleteNamespaceResponse.toAny(): Any = Any(MsgDeleteNamespaceResponse.TYPE_URL,
    with(MsgDeleteNamespaceResponseConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<MsgDeleteNamespaceResponse>):
    MsgDeleteNamespaceResponse {
  if (typeUrl != MsgDeleteNamespaceResponse.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object MsgUpdateNamespaceConverter : ProtobufConverter<MsgUpdateNamespace> {
  public object MsgSetWasmHookConverter : ProtobufConverter<MsgUpdateNamespace.MsgSetWasmHook>

  public object MsgSetMintsPausedConverter : ProtobufConverter<MsgUpdateNamespace.MsgSetMintsPaused>

  public object MsgSetSendsPausedConverter : ProtobufConverter<MsgUpdateNamespace.MsgSetSendsPaused>

  public object MsgSetBurnsPausedConverter : ProtobufConverter<MsgUpdateNamespace.MsgSetBurnsPaused>
}

public fun MsgUpdateNamespace.toAny(): Any = Any(MsgUpdateNamespace.TYPE_URL,
    with(MsgUpdateNamespaceConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<MsgUpdateNamespace>): MsgUpdateNamespace {
  if (typeUrl != MsgUpdateNamespace.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object MsgUpdateNamespaceResponseConverter :
    ProtobufConverter<MsgUpdateNamespaceResponse>

public fun MsgUpdateNamespaceResponse.toAny(): Any = Any(MsgUpdateNamespaceResponse.TYPE_URL,
    with(MsgUpdateNamespaceResponseConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<MsgUpdateNamespaceResponse>):
    MsgUpdateNamespaceResponse {
  if (typeUrl != MsgUpdateNamespaceResponse.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object MsgUpdateNamespaceRolesConverter : ProtobufConverter<MsgUpdateNamespaceRoles>

public fun MsgUpdateNamespaceRoles.toAny(): Any = Any(MsgUpdateNamespaceRoles.TYPE_URL,
    with(MsgUpdateNamespaceRolesConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<MsgUpdateNamespaceRoles>):
    MsgUpdateNamespaceRoles {
  if (typeUrl != MsgUpdateNamespaceRoles.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object MsgUpdateNamespaceRolesResponseConverter :
    ProtobufConverter<MsgUpdateNamespaceRolesResponse>

public fun MsgUpdateNamespaceRolesResponse.toAny(): Any =
    Any(MsgUpdateNamespaceRolesResponse.TYPE_URL, with(MsgUpdateNamespaceRolesResponseConverter) {
    toByteArray() })

public fun Any.parse(converter: ProtobufConverter<MsgUpdateNamespaceRolesResponse>):
    MsgUpdateNamespaceRolesResponse {
  if (typeUrl != MsgUpdateNamespaceRolesResponse.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object MsgRevokeNamespaceRolesConverter : ProtobufConverter<MsgRevokeNamespaceRoles>

public fun MsgRevokeNamespaceRoles.toAny(): Any = Any(MsgRevokeNamespaceRoles.TYPE_URL,
    with(MsgRevokeNamespaceRolesConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<MsgRevokeNamespaceRoles>):
    MsgRevokeNamespaceRoles {
  if (typeUrl != MsgRevokeNamespaceRoles.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object MsgRevokeNamespaceRolesResponseConverter :
    ProtobufConverter<MsgRevokeNamespaceRolesResponse>

public fun MsgRevokeNamespaceRolesResponse.toAny(): Any =
    Any(MsgRevokeNamespaceRolesResponse.TYPE_URL, with(MsgRevokeNamespaceRolesResponseConverter) {
    toByteArray() })

public fun Any.parse(converter: ProtobufConverter<MsgRevokeNamespaceRolesResponse>):
    MsgRevokeNamespaceRolesResponse {
  if (typeUrl != MsgRevokeNamespaceRolesResponse.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object MsgClaimVoucherConverter : ProtobufConverter<MsgClaimVoucher>

public fun MsgClaimVoucher.toAny(): Any = Any(MsgClaimVoucher.TYPE_URL,
    with(MsgClaimVoucherConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<MsgClaimVoucher>): MsgClaimVoucher {
  if (typeUrl != MsgClaimVoucher.TYPE_URL) throw IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object MsgClaimVoucherResponseConverter : ProtobufConverter<MsgClaimVoucherResponse>

public fun MsgClaimVoucherResponse.toAny(): Any = Any(MsgClaimVoucherResponse.TYPE_URL,
    with(MsgClaimVoucherResponseConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<MsgClaimVoucherResponse>):
    MsgClaimVoucherResponse {
  if (typeUrl != MsgClaimVoucherResponse.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}
