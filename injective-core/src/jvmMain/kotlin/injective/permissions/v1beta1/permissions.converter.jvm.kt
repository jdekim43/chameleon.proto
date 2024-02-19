// Transform from injective/permissions/v1beta1/permissions.proto
@file:GeneratorVersion(version = "0.3.1")

package injective.permissions.v1beta1

import com.google.protobuf.Descriptors
import com.google.protobuf.Parser
import cosmos.base.v1beta1.CoinJvmConverter
import kr.jadekim.protobuf.`annotation`.GeneratorVersion
import kr.jadekim.protobuf.converter.mapper.ProtobufTypeMapper
import kr.jadekim.protobuf.util.asJavaType
import kr.jadekim.protobuf.util.asKotlinType

public object NamespaceJvmConverter : ProtobufTypeMapper<Namespace, Permissions.Namespace> {
  public override val descriptor: Descriptors.Descriptor = Permissions.Namespace.getDescriptor()

  public override val parser: Parser<Permissions.Namespace> = Permissions.Namespace.parser()

  public override fun convert(obj: Permissions.Namespace): Namespace = Namespace(
  	denom = obj.getDenom(),
  	wasmHook = obj.getWasmHook(),
  	mintsPaused = obj.getMintsPaused(),
  	sendsPaused = obj.getSendsPaused(),
  	burnsPaused = obj.getBurnsPaused(),
  	rolePermissions = obj.getRolePermissionsList().map { RoleJvmConverter.convert(it) },
  	addressRoles = obj.getAddressRolesList().map { AddressRolesJvmConverter.convert(it) },
  )

  public override fun convert(obj: Namespace): Permissions.Namespace {
    val builder = Permissions.Namespace.newBuilder()
    builder.setDenom(obj.denom)
    builder.setWasmHook(obj.wasmHook)
    builder.setMintsPaused(obj.mintsPaused)
    builder.setSendsPaused(obj.sendsPaused)
    builder.setBurnsPaused(obj.burnsPaused)
    builder.addAllRolePermissions(obj.rolePermissions.map { RoleJvmConverter.convert(it) })
    builder.addAllAddressRoles(obj.addressRoles.map { AddressRolesJvmConverter.convert(it) })
    return builder.build()
  }
}

public object AddressRolesJvmConverter : ProtobufTypeMapper<AddressRoles, Permissions.AddressRoles>
    {
  public override val descriptor: Descriptors.Descriptor = Permissions.AddressRoles.getDescriptor()

  public override val parser: Parser<Permissions.AddressRoles> = Permissions.AddressRoles.parser()

  public override fun convert(obj: Permissions.AddressRoles): AddressRoles = AddressRoles(
  	address = obj.getAddress(),
  	roles = obj.getRolesList().map { it },
  )

  public override fun convert(obj: AddressRoles): Permissions.AddressRoles {
    val builder = Permissions.AddressRoles.newBuilder()
    builder.setAddress(obj.address)
    builder.addAllRoles(obj.roles.map { it })
    return builder.build()
  }
}

public object RoleJvmConverter : ProtobufTypeMapper<Role, Permissions.Role> {
  public override val descriptor: Descriptors.Descriptor = Permissions.Role.getDescriptor()

  public override val parser: Parser<Permissions.Role> = Permissions.Role.parser()

  public override fun convert(obj: Permissions.Role): Role = Role(
  	role = obj.getRole(),
  	permissions = obj.getPermissions().asKotlinType,
  )

  public override fun convert(obj: Role): Permissions.Role {
    val builder = Permissions.Role.newBuilder()
    builder.setRole(obj.role)
    builder.setPermissions(obj.permissions.asJavaType)
    return builder.build()
  }
}

public object RoleIDsJvmConverter : ProtobufTypeMapper<RoleIDs, Permissions.RoleIDs> {
  public override val descriptor: Descriptors.Descriptor = Permissions.RoleIDs.getDescriptor()

  public override val parser: Parser<Permissions.RoleIDs> = Permissions.RoleIDs.parser()

  public override fun convert(obj: Permissions.RoleIDs): RoleIDs = RoleIDs(
  	roleIds = obj.getRoleIdsList().map { it.asKotlinType },
  )

  public override fun convert(obj: RoleIDs): Permissions.RoleIDs {
    val builder = Permissions.RoleIDs.newBuilder()
    builder.addAllRoleIds(obj.roleIds.map { it.asJavaType })
    return builder.build()
  }
}

public object VoucherJvmConverter : ProtobufTypeMapper<Voucher, Permissions.Voucher> {
  public override val descriptor: Descriptors.Descriptor = Permissions.Voucher.getDescriptor()

  public override val parser: Parser<Permissions.Voucher> = Permissions.Voucher.parser()

  public override fun convert(obj: Permissions.Voucher): Voucher = Voucher(
  	coins = obj.getCoinsList().map { CoinJvmConverter.convert(it) },
  )

  public override fun convert(obj: Voucher): Permissions.Voucher {
    val builder = Permissions.Voucher.newBuilder()
    builder.addAllCoins(obj.coins.map { CoinJvmConverter.convert(it) })
    return builder.build()
  }
}

public object AddressVoucherJvmConverter :
    ProtobufTypeMapper<AddressVoucher, Permissions.AddressVoucher> {
  public override val descriptor: Descriptors.Descriptor =
      Permissions.AddressVoucher.getDescriptor()

  public override val parser: Parser<Permissions.AddressVoucher> =
      Permissions.AddressVoucher.parser()

  public override fun convert(obj: Permissions.AddressVoucher): AddressVoucher = AddressVoucher(
  	address = obj.getAddress(),
  	voucher = VoucherJvmConverter.convert(obj.getVoucher()),
  )

  public override fun convert(obj: AddressVoucher): Permissions.AddressVoucher {
    val builder = Permissions.AddressVoucher.newBuilder()
    builder.setAddress(obj.address)
    builder.setVoucher(VoucherJvmConverter.convert(obj.voucher))
    return builder.build()
  }
}
