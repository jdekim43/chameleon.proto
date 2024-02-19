// Transform from injective/permissions/v1beta1/tx.proto
@file:GeneratorVersion(version = "0.3.1")

package injective.permissions.v1beta1

import kr.jadekim.protobuf.`annotation`.GeneratorVersion
import kr.jadekim.protobuf.converter.ProtobufConverter

public actual object MsgUpdateParamsConverter : ProtobufConverter<MsgUpdateParams> by
    MsgUpdateParamsJvmConverter

public actual object MsgUpdateParamsResponseConverter : ProtobufConverter<MsgUpdateParamsResponse>
    by MsgUpdateParamsResponseJvmConverter

public actual object MsgCreateNamespaceConverter : ProtobufConverter<MsgCreateNamespace> by
    MsgCreateNamespaceJvmConverter

public actual object MsgCreateNamespaceResponseConverter :
    ProtobufConverter<MsgCreateNamespaceResponse> by MsgCreateNamespaceResponseJvmConverter

public actual object MsgDeleteNamespaceConverter : ProtobufConverter<MsgDeleteNamespace> by
    MsgDeleteNamespaceJvmConverter

public actual object MsgDeleteNamespaceResponseConverter :
    ProtobufConverter<MsgDeleteNamespaceResponse> by MsgDeleteNamespaceResponseJvmConverter

public actual object MsgUpdateNamespaceConverter : ProtobufConverter<MsgUpdateNamespace> by
    MsgUpdateNamespaceJvmConverter {
  public actual object MsgSetWasmHookConverter :
      ProtobufConverter<MsgUpdateNamespace.MsgSetWasmHook> by
      MsgUpdateNamespaceJvmConverter.MsgSetWasmHookJvmConverter

  public actual object MsgSetMintsPausedConverter :
      ProtobufConverter<MsgUpdateNamespace.MsgSetMintsPaused> by
      MsgUpdateNamespaceJvmConverter.MsgSetMintsPausedJvmConverter

  public actual object MsgSetSendsPausedConverter :
      ProtobufConverter<MsgUpdateNamespace.MsgSetSendsPaused> by
      MsgUpdateNamespaceJvmConverter.MsgSetSendsPausedJvmConverter

  public actual object MsgSetBurnsPausedConverter :
      ProtobufConverter<MsgUpdateNamespace.MsgSetBurnsPaused> by
      MsgUpdateNamespaceJvmConverter.MsgSetBurnsPausedJvmConverter
}

public actual object MsgUpdateNamespaceResponseConverter :
    ProtobufConverter<MsgUpdateNamespaceResponse> by MsgUpdateNamespaceResponseJvmConverter

public actual object MsgUpdateNamespaceRolesConverter : ProtobufConverter<MsgUpdateNamespaceRoles>
    by MsgUpdateNamespaceRolesJvmConverter

public actual object MsgUpdateNamespaceRolesResponseConverter :
    ProtobufConverter<MsgUpdateNamespaceRolesResponse> by
    MsgUpdateNamespaceRolesResponseJvmConverter

public actual object MsgRevokeNamespaceRolesConverter : ProtobufConverter<MsgRevokeNamespaceRoles>
    by MsgRevokeNamespaceRolesJvmConverter

public actual object MsgRevokeNamespaceRolesResponseConverter :
    ProtobufConverter<MsgRevokeNamespaceRolesResponse> by
    MsgRevokeNamespaceRolesResponseJvmConverter

public actual object MsgClaimVoucherConverter : ProtobufConverter<MsgClaimVoucher> by
    MsgClaimVoucherJvmConverter

public actual object MsgClaimVoucherResponseConverter : ProtobufConverter<MsgClaimVoucherResponse>
    by MsgClaimVoucherResponseJvmConverter
