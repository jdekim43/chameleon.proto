// Transform from injective/permissions/v1beta1/tx.proto
@file:GeneratorVersion(version = "0.3.1")

package injective.permissions.v1beta1

import com.google.protobuf.Descriptors
import com.google.protobuf.Parser
import kr.jadekim.protobuf.`annotation`.GeneratorVersion
import kr.jadekim.protobuf.converter.mapper.ProtobufTypeMapper

public object MsgUpdateParamsJvmConverter : ProtobufTypeMapper<MsgUpdateParams, Tx.MsgUpdateParams>
    {
  public override val descriptor: Descriptors.Descriptor = Tx.MsgUpdateParams.getDescriptor()

  public override val parser: Parser<Tx.MsgUpdateParams> = Tx.MsgUpdateParams.parser()

  public override fun convert(obj: Tx.MsgUpdateParams): MsgUpdateParams = MsgUpdateParams(
  	authority = obj.getAuthority(),
  	params = ParamsJvmConverter.convert(obj.getParams()),
  )

  public override fun convert(obj: MsgUpdateParams): Tx.MsgUpdateParams {
    val builder = Tx.MsgUpdateParams.newBuilder()
    builder.setAuthority(obj.authority)
    builder.setParams(ParamsJvmConverter.convert(obj.params))
    return builder.build()
  }
}

public object MsgUpdateParamsResponseJvmConverter :
    ProtobufTypeMapper<MsgUpdateParamsResponse, Tx.MsgUpdateParamsResponse> {
  public override val descriptor: Descriptors.Descriptor =
      Tx.MsgUpdateParamsResponse.getDescriptor()

  public override val parser: Parser<Tx.MsgUpdateParamsResponse> =
      Tx.MsgUpdateParamsResponse.parser()

  public override fun convert(obj: Tx.MsgUpdateParamsResponse): MsgUpdateParamsResponse =
      MsgUpdateParamsResponse(
  )

  public override fun convert(obj: MsgUpdateParamsResponse): Tx.MsgUpdateParamsResponse {
    val builder = Tx.MsgUpdateParamsResponse.newBuilder()
    return builder.build()
  }
}

public object MsgCreateNamespaceJvmConverter :
    ProtobufTypeMapper<MsgCreateNamespace, Tx.MsgCreateNamespace> {
  public override val descriptor: Descriptors.Descriptor = Tx.MsgCreateNamespace.getDescriptor()

  public override val parser: Parser<Tx.MsgCreateNamespace> = Tx.MsgCreateNamespace.parser()

  public override fun convert(obj: Tx.MsgCreateNamespace): MsgCreateNamespace = MsgCreateNamespace(
  	sender = obj.getSender(),
  	namespace = NamespaceJvmConverter.convert(obj.getNamespace()),
  )

  public override fun convert(obj: MsgCreateNamespace): Tx.MsgCreateNamespace {
    val builder = Tx.MsgCreateNamespace.newBuilder()
    builder.setSender(obj.sender)
    builder.setNamespace(NamespaceJvmConverter.convert(obj.namespace))
    return builder.build()
  }
}

public object MsgCreateNamespaceResponseJvmConverter :
    ProtobufTypeMapper<MsgCreateNamespaceResponse, Tx.MsgCreateNamespaceResponse> {
  public override val descriptor: Descriptors.Descriptor =
      Tx.MsgCreateNamespaceResponse.getDescriptor()

  public override val parser: Parser<Tx.MsgCreateNamespaceResponse> =
      Tx.MsgCreateNamespaceResponse.parser()

  public override fun convert(obj: Tx.MsgCreateNamespaceResponse): MsgCreateNamespaceResponse =
      MsgCreateNamespaceResponse(
  )

  public override fun convert(obj: MsgCreateNamespaceResponse): Tx.MsgCreateNamespaceResponse {
    val builder = Tx.MsgCreateNamespaceResponse.newBuilder()
    return builder.build()
  }
}

public object MsgDeleteNamespaceJvmConverter :
    ProtobufTypeMapper<MsgDeleteNamespace, Tx.MsgDeleteNamespace> {
  public override val descriptor: Descriptors.Descriptor = Tx.MsgDeleteNamespace.getDescriptor()

  public override val parser: Parser<Tx.MsgDeleteNamespace> = Tx.MsgDeleteNamespace.parser()

  public override fun convert(obj: Tx.MsgDeleteNamespace): MsgDeleteNamespace = MsgDeleteNamespace(
  	sender = obj.getSender(),
  	namespaceDenom = obj.getNamespaceDenom(),
  )

  public override fun convert(obj: MsgDeleteNamespace): Tx.MsgDeleteNamespace {
    val builder = Tx.MsgDeleteNamespace.newBuilder()
    builder.setSender(obj.sender)
    builder.setNamespaceDenom(obj.namespaceDenom)
    return builder.build()
  }
}

public object MsgDeleteNamespaceResponseJvmConverter :
    ProtobufTypeMapper<MsgDeleteNamespaceResponse, Tx.MsgDeleteNamespaceResponse> {
  public override val descriptor: Descriptors.Descriptor =
      Tx.MsgDeleteNamespaceResponse.getDescriptor()

  public override val parser: Parser<Tx.MsgDeleteNamespaceResponse> =
      Tx.MsgDeleteNamespaceResponse.parser()

  public override fun convert(obj: Tx.MsgDeleteNamespaceResponse): MsgDeleteNamespaceResponse =
      MsgDeleteNamespaceResponse(
  )

  public override fun convert(obj: MsgDeleteNamespaceResponse): Tx.MsgDeleteNamespaceResponse {
    val builder = Tx.MsgDeleteNamespaceResponse.newBuilder()
    return builder.build()
  }
}

public object MsgUpdateNamespaceJvmConverter :
    ProtobufTypeMapper<MsgUpdateNamespace, Tx.MsgUpdateNamespace> {
  public override val descriptor: Descriptors.Descriptor = Tx.MsgUpdateNamespace.getDescriptor()

  public override val parser: Parser<Tx.MsgUpdateNamespace> = Tx.MsgUpdateNamespace.parser()

  public override fun convert(obj: Tx.MsgUpdateNamespace): MsgUpdateNamespace = MsgUpdateNamespace(
  	sender = obj.getSender(),
  	namespaceDenom = obj.getNamespaceDenom(),
  	wasmHook = MsgSetWasmHookJvmConverter.convert(obj.getWasmHook()),
  	mintsPaused = MsgSetMintsPausedJvmConverter.convert(obj.getMintsPaused()),
  	sendsPaused = MsgSetSendsPausedJvmConverter.convert(obj.getSendsPaused()),
  	burnsPaused = MsgSetBurnsPausedJvmConverter.convert(obj.getBurnsPaused()),
  )

  public override fun convert(obj: MsgUpdateNamespace): Tx.MsgUpdateNamespace {
    val builder = Tx.MsgUpdateNamespace.newBuilder()
    builder.setSender(obj.sender)
    builder.setNamespaceDenom(obj.namespaceDenom)
    builder.setWasmHook(MsgSetWasmHookJvmConverter.convert(obj.wasmHook))
    builder.setMintsPaused(MsgSetMintsPausedJvmConverter.convert(obj.mintsPaused))
    builder.setSendsPaused(MsgSetSendsPausedJvmConverter.convert(obj.sendsPaused))
    builder.setBurnsPaused(MsgSetBurnsPausedJvmConverter.convert(obj.burnsPaused))
    return builder.build()
  }

  public object MsgSetWasmHookJvmConverter :
      ProtobufTypeMapper<MsgUpdateNamespace.MsgSetWasmHook, Tx.MsgUpdateNamespace.MsgSetWasmHook> {
    public override val descriptor: Descriptors.Descriptor =
        Tx.MsgUpdateNamespace.MsgSetWasmHook.getDescriptor()

    public override val parser: Parser<Tx.MsgUpdateNamespace.MsgSetWasmHook> =
        Tx.MsgUpdateNamespace.MsgSetWasmHook.parser()

    public override fun convert(obj: Tx.MsgUpdateNamespace.MsgSetWasmHook):
        MsgUpdateNamespace.MsgSetWasmHook = MsgUpdateNamespace.MsgSetWasmHook(
    	newValue = obj.getNewValue(),
    )

    public override fun convert(obj: MsgUpdateNamespace.MsgSetWasmHook):
        Tx.MsgUpdateNamespace.MsgSetWasmHook {
      val builder = Tx.MsgUpdateNamespace.MsgSetWasmHook.newBuilder()
      builder.setNewValue(obj.newValue)
      return builder.build()
    }
  }

  public object MsgSetMintsPausedJvmConverter :
      ProtobufTypeMapper<MsgUpdateNamespace.MsgSetMintsPaused, Tx.MsgUpdateNamespace.MsgSetMintsPaused>
      {
    public override val descriptor: Descriptors.Descriptor =
        Tx.MsgUpdateNamespace.MsgSetMintsPaused.getDescriptor()

    public override val parser: Parser<Tx.MsgUpdateNamespace.MsgSetMintsPaused> =
        Tx.MsgUpdateNamespace.MsgSetMintsPaused.parser()

    public override fun convert(obj: Tx.MsgUpdateNamespace.MsgSetMintsPaused):
        MsgUpdateNamespace.MsgSetMintsPaused = MsgUpdateNamespace.MsgSetMintsPaused(
    	newValue = obj.getNewValue(),
    )

    public override fun convert(obj: MsgUpdateNamespace.MsgSetMintsPaused):
        Tx.MsgUpdateNamespace.MsgSetMintsPaused {
      val builder = Tx.MsgUpdateNamespace.MsgSetMintsPaused.newBuilder()
      builder.setNewValue(obj.newValue)
      return builder.build()
    }
  }

  public object MsgSetSendsPausedJvmConverter :
      ProtobufTypeMapper<MsgUpdateNamespace.MsgSetSendsPaused, Tx.MsgUpdateNamespace.MsgSetSendsPaused>
      {
    public override val descriptor: Descriptors.Descriptor =
        Tx.MsgUpdateNamespace.MsgSetSendsPaused.getDescriptor()

    public override val parser: Parser<Tx.MsgUpdateNamespace.MsgSetSendsPaused> =
        Tx.MsgUpdateNamespace.MsgSetSendsPaused.parser()

    public override fun convert(obj: Tx.MsgUpdateNamespace.MsgSetSendsPaused):
        MsgUpdateNamespace.MsgSetSendsPaused = MsgUpdateNamespace.MsgSetSendsPaused(
    	newValue = obj.getNewValue(),
    )

    public override fun convert(obj: MsgUpdateNamespace.MsgSetSendsPaused):
        Tx.MsgUpdateNamespace.MsgSetSendsPaused {
      val builder = Tx.MsgUpdateNamespace.MsgSetSendsPaused.newBuilder()
      builder.setNewValue(obj.newValue)
      return builder.build()
    }
  }

  public object MsgSetBurnsPausedJvmConverter :
      ProtobufTypeMapper<MsgUpdateNamespace.MsgSetBurnsPaused, Tx.MsgUpdateNamespace.MsgSetBurnsPaused>
      {
    public override val descriptor: Descriptors.Descriptor =
        Tx.MsgUpdateNamespace.MsgSetBurnsPaused.getDescriptor()

    public override val parser: Parser<Tx.MsgUpdateNamespace.MsgSetBurnsPaused> =
        Tx.MsgUpdateNamespace.MsgSetBurnsPaused.parser()

    public override fun convert(obj: Tx.MsgUpdateNamespace.MsgSetBurnsPaused):
        MsgUpdateNamespace.MsgSetBurnsPaused = MsgUpdateNamespace.MsgSetBurnsPaused(
    	newValue = obj.getNewValue(),
    )

    public override fun convert(obj: MsgUpdateNamespace.MsgSetBurnsPaused):
        Tx.MsgUpdateNamespace.MsgSetBurnsPaused {
      val builder = Tx.MsgUpdateNamespace.MsgSetBurnsPaused.newBuilder()
      builder.setNewValue(obj.newValue)
      return builder.build()
    }
  }
}

public object MsgUpdateNamespaceResponseJvmConverter :
    ProtobufTypeMapper<MsgUpdateNamespaceResponse, Tx.MsgUpdateNamespaceResponse> {
  public override val descriptor: Descriptors.Descriptor =
      Tx.MsgUpdateNamespaceResponse.getDescriptor()

  public override val parser: Parser<Tx.MsgUpdateNamespaceResponse> =
      Tx.MsgUpdateNamespaceResponse.parser()

  public override fun convert(obj: Tx.MsgUpdateNamespaceResponse): MsgUpdateNamespaceResponse =
      MsgUpdateNamespaceResponse(
  )

  public override fun convert(obj: MsgUpdateNamespaceResponse): Tx.MsgUpdateNamespaceResponse {
    val builder = Tx.MsgUpdateNamespaceResponse.newBuilder()
    return builder.build()
  }
}

public object MsgUpdateNamespaceRolesJvmConverter :
    ProtobufTypeMapper<MsgUpdateNamespaceRoles, Tx.MsgUpdateNamespaceRoles> {
  public override val descriptor: Descriptors.Descriptor =
      Tx.MsgUpdateNamespaceRoles.getDescriptor()

  public override val parser: Parser<Tx.MsgUpdateNamespaceRoles> =
      Tx.MsgUpdateNamespaceRoles.parser()

  public override fun convert(obj: Tx.MsgUpdateNamespaceRoles): MsgUpdateNamespaceRoles =
      MsgUpdateNamespaceRoles(
  	sender = obj.getSender(),
  	namespaceDenom = obj.getNamespaceDenom(),
  	rolePermissions = obj.getRolePermissionsList().map { RoleJvmConverter.convert(it) },
  	addressRoles = obj.getAddressRolesList().map { AddressRolesJvmConverter.convert(it) },
  )

  public override fun convert(obj: MsgUpdateNamespaceRoles): Tx.MsgUpdateNamespaceRoles {
    val builder = Tx.MsgUpdateNamespaceRoles.newBuilder()
    builder.setSender(obj.sender)
    builder.setNamespaceDenom(obj.namespaceDenom)
    builder.addAllRolePermissions(obj.rolePermissions.map { RoleJvmConverter.convert(it) })
    builder.addAllAddressRoles(obj.addressRoles.map { AddressRolesJvmConverter.convert(it) })
    return builder.build()
  }
}

public object MsgUpdateNamespaceRolesResponseJvmConverter :
    ProtobufTypeMapper<MsgUpdateNamespaceRolesResponse, Tx.MsgUpdateNamespaceRolesResponse> {
  public override val descriptor: Descriptors.Descriptor =
      Tx.MsgUpdateNamespaceRolesResponse.getDescriptor()

  public override val parser: Parser<Tx.MsgUpdateNamespaceRolesResponse> =
      Tx.MsgUpdateNamespaceRolesResponse.parser()

  public override fun convert(obj: Tx.MsgUpdateNamespaceRolesResponse):
      MsgUpdateNamespaceRolesResponse = MsgUpdateNamespaceRolesResponse(
  )

  public override fun convert(obj: MsgUpdateNamespaceRolesResponse):
      Tx.MsgUpdateNamespaceRolesResponse {
    val builder = Tx.MsgUpdateNamespaceRolesResponse.newBuilder()
    return builder.build()
  }
}

public object MsgRevokeNamespaceRolesJvmConverter :
    ProtobufTypeMapper<MsgRevokeNamespaceRoles, Tx.MsgRevokeNamespaceRoles> {
  public override val descriptor: Descriptors.Descriptor =
      Tx.MsgRevokeNamespaceRoles.getDescriptor()

  public override val parser: Parser<Tx.MsgRevokeNamespaceRoles> =
      Tx.MsgRevokeNamespaceRoles.parser()

  public override fun convert(obj: Tx.MsgRevokeNamespaceRoles): MsgRevokeNamespaceRoles =
      MsgRevokeNamespaceRoles(
  	sender = obj.getSender(),
  	namespaceDenom = obj.getNamespaceDenom(),
  	addressRolesToRevoke = obj.getAddressRolesToRevokeList().map {
      AddressRolesJvmConverter.convert(it) },
  )

  public override fun convert(obj: MsgRevokeNamespaceRoles): Tx.MsgRevokeNamespaceRoles {
    val builder = Tx.MsgRevokeNamespaceRoles.newBuilder()
    builder.setSender(obj.sender)
    builder.setNamespaceDenom(obj.namespaceDenom)
    builder.addAllAddressRolesToRevoke(obj.addressRolesToRevoke.map {
        AddressRolesJvmConverter.convert(it) })
    return builder.build()
  }
}

public object MsgRevokeNamespaceRolesResponseJvmConverter :
    ProtobufTypeMapper<MsgRevokeNamespaceRolesResponse, Tx.MsgRevokeNamespaceRolesResponse> {
  public override val descriptor: Descriptors.Descriptor =
      Tx.MsgRevokeNamespaceRolesResponse.getDescriptor()

  public override val parser: Parser<Tx.MsgRevokeNamespaceRolesResponse> =
      Tx.MsgRevokeNamespaceRolesResponse.parser()

  public override fun convert(obj: Tx.MsgRevokeNamespaceRolesResponse):
      MsgRevokeNamespaceRolesResponse = MsgRevokeNamespaceRolesResponse(
  )

  public override fun convert(obj: MsgRevokeNamespaceRolesResponse):
      Tx.MsgRevokeNamespaceRolesResponse {
    val builder = Tx.MsgRevokeNamespaceRolesResponse.newBuilder()
    return builder.build()
  }
}

public object MsgClaimVoucherJvmConverter : ProtobufTypeMapper<MsgClaimVoucher, Tx.MsgClaimVoucher>
    {
  public override val descriptor: Descriptors.Descriptor = Tx.MsgClaimVoucher.getDescriptor()

  public override val parser: Parser<Tx.MsgClaimVoucher> = Tx.MsgClaimVoucher.parser()

  public override fun convert(obj: Tx.MsgClaimVoucher): MsgClaimVoucher = MsgClaimVoucher(
  	sender = obj.getSender(),
  	originator = obj.getOriginator(),
  )

  public override fun convert(obj: MsgClaimVoucher): Tx.MsgClaimVoucher {
    val builder = Tx.MsgClaimVoucher.newBuilder()
    builder.setSender(obj.sender)
    builder.setOriginator(obj.originator)
    return builder.build()
  }
}

public object MsgClaimVoucherResponseJvmConverter :
    ProtobufTypeMapper<MsgClaimVoucherResponse, Tx.MsgClaimVoucherResponse> {
  public override val descriptor: Descriptors.Descriptor =
      Tx.MsgClaimVoucherResponse.getDescriptor()

  public override val parser: Parser<Tx.MsgClaimVoucherResponse> =
      Tx.MsgClaimVoucherResponse.parser()

  public override fun convert(obj: Tx.MsgClaimVoucherResponse): MsgClaimVoucherResponse =
      MsgClaimVoucherResponse(
  )

  public override fun convert(obj: MsgClaimVoucherResponse): Tx.MsgClaimVoucherResponse {
    val builder = Tx.MsgClaimVoucherResponse.newBuilder()
    return builder.build()
  }
}
