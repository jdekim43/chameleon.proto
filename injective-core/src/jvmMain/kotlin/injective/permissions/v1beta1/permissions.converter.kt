// Transform from injective/permissions/v1beta1/permissions.proto
@file:GeneratorVersion(version = "0.3.1")

package injective.permissions.v1beta1

import kr.jadekim.protobuf.`annotation`.GeneratorVersion
import kr.jadekim.protobuf.converter.ProtobufConverter

public actual object NamespaceConverter : ProtobufConverter<Namespace> by NamespaceJvmConverter

public actual object AddressRolesConverter : ProtobufConverter<AddressRoles> by
    AddressRolesJvmConverter

public actual object RoleConverter : ProtobufConverter<Role> by RoleJvmConverter

public actual object RoleIDsConverter : ProtobufConverter<RoleIDs> by RoleIDsJvmConverter

public actual object VoucherConverter : ProtobufConverter<Voucher> by VoucherJvmConverter

public actual object AddressVoucherConverter : ProtobufConverter<AddressVoucher> by
    AddressVoucherJvmConverter
