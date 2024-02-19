// Transform from injective/permissions/v1beta1/permissions.proto
@file:GeneratorVersion(version = "0.3.1")

package injective.permissions.v1beta1

import google.protobuf.Any
import java.lang.IllegalStateException
import kr.jadekim.protobuf.`annotation`.GeneratorVersion
import kr.jadekim.protobuf.converter.ProtobufConverter
import kr.jadekim.protobuf.converter.parseProtobuf

public expect object NamespaceConverter : ProtobufConverter<Namespace>

public fun Namespace.toAny(): Any = Any(Namespace.TYPE_URL, with(NamespaceConverter) { toByteArray()
    })

public fun Any.parse(converter: ProtobufConverter<Namespace>): Namespace {
  if (typeUrl != Namespace.TYPE_URL) throw IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object AddressRolesConverter : ProtobufConverter<AddressRoles>

public fun AddressRoles.toAny(): Any = Any(AddressRoles.TYPE_URL, with(AddressRolesConverter) {
    toByteArray() })

public fun Any.parse(converter: ProtobufConverter<AddressRoles>): AddressRoles {
  if (typeUrl != AddressRoles.TYPE_URL) throw IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object RoleConverter : ProtobufConverter<Role>

public fun Role.toAny(): Any = Any(Role.TYPE_URL, with(RoleConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<Role>): Role {
  if (typeUrl != Role.TYPE_URL) throw IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object RoleIDsConverter : ProtobufConverter<RoleIDs>

public fun RoleIDs.toAny(): Any = Any(RoleIDs.TYPE_URL, with(RoleIDsConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<RoleIDs>): RoleIDs {
  if (typeUrl != RoleIDs.TYPE_URL) throw IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object VoucherConverter : ProtobufConverter<Voucher>

public fun Voucher.toAny(): Any = Any(Voucher.TYPE_URL, with(VoucherConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<Voucher>): Voucher {
  if (typeUrl != Voucher.TYPE_URL) throw IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object AddressVoucherConverter : ProtobufConverter<AddressVoucher>

public fun AddressVoucher.toAny(): Any = Any(AddressVoucher.TYPE_URL, with(AddressVoucherConverter)
    { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<AddressVoucher>): AddressVoucher {
  if (typeUrl != AddressVoucher.TYPE_URL) throw IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}
