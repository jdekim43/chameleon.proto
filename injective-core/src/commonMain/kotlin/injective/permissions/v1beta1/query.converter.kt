// Transform from injective/permissions/v1beta1/query.proto
@file:GeneratorVersion(version = "0.3.1")

package injective.permissions.v1beta1

import google.protobuf.Any
import java.lang.IllegalStateException
import kr.jadekim.protobuf.`annotation`.GeneratorVersion
import kr.jadekim.protobuf.converter.ProtobufConverter
import kr.jadekim.protobuf.converter.parseProtobuf

public expect object QueryParamsRequestConverter : ProtobufConverter<QueryParamsRequest>

public fun QueryParamsRequest.toAny(): Any = Any(QueryParamsRequest.TYPE_URL,
    with(QueryParamsRequestConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<QueryParamsRequest>): QueryParamsRequest {
  if (typeUrl != QueryParamsRequest.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object QueryParamsResponseConverter : ProtobufConverter<QueryParamsResponse>

public fun QueryParamsResponse.toAny(): Any = Any(QueryParamsResponse.TYPE_URL,
    with(QueryParamsResponseConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<QueryParamsResponse>): QueryParamsResponse {
  if (typeUrl != QueryParamsResponse.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object QueryAllNamespacesRequestConverter :
    ProtobufConverter<QueryAllNamespacesRequest>

public fun QueryAllNamespacesRequest.toAny(): Any = Any(QueryAllNamespacesRequest.TYPE_URL,
    with(QueryAllNamespacesRequestConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<QueryAllNamespacesRequest>):
    QueryAllNamespacesRequest {
  if (typeUrl != QueryAllNamespacesRequest.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object QueryAllNamespacesResponseConverter :
    ProtobufConverter<QueryAllNamespacesResponse>

public fun QueryAllNamespacesResponse.toAny(): Any = Any(QueryAllNamespacesResponse.TYPE_URL,
    with(QueryAllNamespacesResponseConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<QueryAllNamespacesResponse>):
    QueryAllNamespacesResponse {
  if (typeUrl != QueryAllNamespacesResponse.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object QueryNamespaceByDenomRequestConverter :
    ProtobufConverter<QueryNamespaceByDenomRequest>

public fun QueryNamespaceByDenomRequest.toAny(): Any = Any(QueryNamespaceByDenomRequest.TYPE_URL,
    with(QueryNamespaceByDenomRequestConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<QueryNamespaceByDenomRequest>):
    QueryNamespaceByDenomRequest {
  if (typeUrl != QueryNamespaceByDenomRequest.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object QueryNamespaceByDenomResponseConverter :
    ProtobufConverter<QueryNamespaceByDenomResponse>

public fun QueryNamespaceByDenomResponse.toAny(): Any = Any(QueryNamespaceByDenomResponse.TYPE_URL,
    with(QueryNamespaceByDenomResponseConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<QueryNamespaceByDenomResponse>):
    QueryNamespaceByDenomResponse {
  if (typeUrl != QueryNamespaceByDenomResponse.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object QueryAddressesByRoleRequestConverter :
    ProtobufConverter<QueryAddressesByRoleRequest>

public fun QueryAddressesByRoleRequest.toAny(): Any = Any(QueryAddressesByRoleRequest.TYPE_URL,
    with(QueryAddressesByRoleRequestConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<QueryAddressesByRoleRequest>):
    QueryAddressesByRoleRequest {
  if (typeUrl != QueryAddressesByRoleRequest.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object QueryAddressesByRoleResponseConverter :
    ProtobufConverter<QueryAddressesByRoleResponse>

public fun QueryAddressesByRoleResponse.toAny(): Any = Any(QueryAddressesByRoleResponse.TYPE_URL,
    with(QueryAddressesByRoleResponseConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<QueryAddressesByRoleResponse>):
    QueryAddressesByRoleResponse {
  if (typeUrl != QueryAddressesByRoleResponse.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object QueryAddressRolesRequestConverter : ProtobufConverter<QueryAddressRolesRequest>

public fun QueryAddressRolesRequest.toAny(): Any = Any(QueryAddressRolesRequest.TYPE_URL,
    with(QueryAddressRolesRequestConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<QueryAddressRolesRequest>):
    QueryAddressRolesRequest {
  if (typeUrl != QueryAddressRolesRequest.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object QueryAddressRolesResponseConverter :
    ProtobufConverter<QueryAddressRolesResponse>

public fun QueryAddressRolesResponse.toAny(): Any = Any(QueryAddressRolesResponse.TYPE_URL,
    with(QueryAddressRolesResponseConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<QueryAddressRolesResponse>):
    QueryAddressRolesResponse {
  if (typeUrl != QueryAddressRolesResponse.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object QueryVouchersForAddressRequestConverter :
    ProtobufConverter<QueryVouchersForAddressRequest>

public fun QueryVouchersForAddressRequest.toAny(): Any =
    Any(QueryVouchersForAddressRequest.TYPE_URL, with(QueryVouchersForAddressRequestConverter) {
    toByteArray() })

public fun Any.parse(converter: ProtobufConverter<QueryVouchersForAddressRequest>):
    QueryVouchersForAddressRequest {
  if (typeUrl != QueryVouchersForAddressRequest.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object QueryVouchersForAddressResponseConverter :
    ProtobufConverter<QueryVouchersForAddressResponse>

public fun QueryVouchersForAddressResponse.toAny(): Any =
    Any(QueryVouchersForAddressResponse.TYPE_URL, with(QueryVouchersForAddressResponseConverter) {
    toByteArray() })

public fun Any.parse(converter: ProtobufConverter<QueryVouchersForAddressResponse>):
    QueryVouchersForAddressResponse {
  if (typeUrl != QueryVouchersForAddressResponse.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}
