// Transform from injective/permissions/v1beta1/query.proto
@file:GeneratorVersion(version = "0.3.1")

package injective.permissions.v1beta1

import kr.jadekim.protobuf.`annotation`.GeneratorVersion
import kr.jadekim.protobuf.converter.ProtobufConverter

public actual object QueryParamsRequestConverter : ProtobufConverter<QueryParamsRequest> by
    QueryParamsRequestJvmConverter

public actual object QueryParamsResponseConverter : ProtobufConverter<QueryParamsResponse> by
    QueryParamsResponseJvmConverter

public actual object QueryAllNamespacesRequestConverter :
    ProtobufConverter<QueryAllNamespacesRequest> by QueryAllNamespacesRequestJvmConverter

public actual object QueryAllNamespacesResponseConverter :
    ProtobufConverter<QueryAllNamespacesResponse> by QueryAllNamespacesResponseJvmConverter

public actual object QueryNamespaceByDenomRequestConverter :
    ProtobufConverter<QueryNamespaceByDenomRequest> by QueryNamespaceByDenomRequestJvmConverter

public actual object QueryNamespaceByDenomResponseConverter :
    ProtobufConverter<QueryNamespaceByDenomResponse> by QueryNamespaceByDenomResponseJvmConverter

public actual object QueryAddressesByRoleRequestConverter :
    ProtobufConverter<QueryAddressesByRoleRequest> by QueryAddressesByRoleRequestJvmConverter

public actual object QueryAddressesByRoleResponseConverter :
    ProtobufConverter<QueryAddressesByRoleResponse> by QueryAddressesByRoleResponseJvmConverter

public actual object QueryAddressRolesRequestConverter : ProtobufConverter<QueryAddressRolesRequest>
    by QueryAddressRolesRequestJvmConverter

public actual object QueryAddressRolesResponseConverter :
    ProtobufConverter<QueryAddressRolesResponse> by QueryAddressRolesResponseJvmConverter

public actual object QueryVouchersForAddressRequestConverter :
    ProtobufConverter<QueryVouchersForAddressRequest> by QueryVouchersForAddressRequestJvmConverter

public actual object QueryVouchersForAddressResponseConverter :
    ProtobufConverter<QueryVouchersForAddressResponse> by
    QueryVouchersForAddressResponseJvmConverter
