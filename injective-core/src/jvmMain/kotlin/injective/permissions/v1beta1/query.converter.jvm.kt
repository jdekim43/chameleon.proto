// Transform from injective/permissions/v1beta1/query.proto
@file:GeneratorVersion(version = "0.3.1")

package injective.permissions.v1beta1

import com.google.protobuf.Descriptors
import com.google.protobuf.Parser
import kr.jadekim.protobuf.`annotation`.GeneratorVersion
import kr.jadekim.protobuf.converter.mapper.ProtobufTypeMapper

public object QueryParamsRequestJvmConverter :
    ProtobufTypeMapper<QueryParamsRequest, QueryOuterClass.QueryParamsRequest> {
  public override val descriptor: Descriptors.Descriptor =
      QueryOuterClass.QueryParamsRequest.getDescriptor()

  public override val parser: Parser<QueryOuterClass.QueryParamsRequest> =
      QueryOuterClass.QueryParamsRequest.parser()

  public override fun convert(obj: QueryOuterClass.QueryParamsRequest): QueryParamsRequest =
      QueryParamsRequest(
  )

  public override fun convert(obj: QueryParamsRequest): QueryOuterClass.QueryParamsRequest {
    val builder = QueryOuterClass.QueryParamsRequest.newBuilder()
    return builder.build()
  }
}

public object QueryParamsResponseJvmConverter :
    ProtobufTypeMapper<QueryParamsResponse, QueryOuterClass.QueryParamsResponse> {
  public override val descriptor: Descriptors.Descriptor =
      QueryOuterClass.QueryParamsResponse.getDescriptor()

  public override val parser: Parser<QueryOuterClass.QueryParamsResponse> =
      QueryOuterClass.QueryParamsResponse.parser()

  public override fun convert(obj: QueryOuterClass.QueryParamsResponse): QueryParamsResponse =
      QueryParamsResponse(
  	params = ParamsJvmConverter.convert(obj.getParams()),
  )

  public override fun convert(obj: QueryParamsResponse): QueryOuterClass.QueryParamsResponse {
    val builder = QueryOuterClass.QueryParamsResponse.newBuilder()
    builder.setParams(ParamsJvmConverter.convert(obj.params))
    return builder.build()
  }
}

public object QueryAllNamespacesRequestJvmConverter :
    ProtobufTypeMapper<QueryAllNamespacesRequest, QueryOuterClass.QueryAllNamespacesRequest> {
  public override val descriptor: Descriptors.Descriptor =
      QueryOuterClass.QueryAllNamespacesRequest.getDescriptor()

  public override val parser: Parser<QueryOuterClass.QueryAllNamespacesRequest> =
      QueryOuterClass.QueryAllNamespacesRequest.parser()

  public override fun convert(obj: QueryOuterClass.QueryAllNamespacesRequest):
      QueryAllNamespacesRequest = QueryAllNamespacesRequest(
  )

  public override fun convert(obj: QueryAllNamespacesRequest):
      QueryOuterClass.QueryAllNamespacesRequest {
    val builder = QueryOuterClass.QueryAllNamespacesRequest.newBuilder()
    return builder.build()
  }
}

public object QueryAllNamespacesResponseJvmConverter :
    ProtobufTypeMapper<QueryAllNamespacesResponse, QueryOuterClass.QueryAllNamespacesResponse> {
  public override val descriptor: Descriptors.Descriptor =
      QueryOuterClass.QueryAllNamespacesResponse.getDescriptor()

  public override val parser: Parser<QueryOuterClass.QueryAllNamespacesResponse> =
      QueryOuterClass.QueryAllNamespacesResponse.parser()

  public override fun convert(obj: QueryOuterClass.QueryAllNamespacesResponse):
      QueryAllNamespacesResponse = QueryAllNamespacesResponse(
  	namespaces = obj.getNamespacesList().map { NamespaceJvmConverter.convert(it) },
  )

  public override fun convert(obj: QueryAllNamespacesResponse):
      QueryOuterClass.QueryAllNamespacesResponse {
    val builder = QueryOuterClass.QueryAllNamespacesResponse.newBuilder()
    builder.addAllNamespaces(obj.namespaces.map { NamespaceJvmConverter.convert(it) })
    return builder.build()
  }
}

public object QueryNamespaceByDenomRequestJvmConverter :
    ProtobufTypeMapper<QueryNamespaceByDenomRequest, QueryOuterClass.QueryNamespaceByDenomRequest> {
  public override val descriptor: Descriptors.Descriptor =
      QueryOuterClass.QueryNamespaceByDenomRequest.getDescriptor()

  public override val parser: Parser<QueryOuterClass.QueryNamespaceByDenomRequest> =
      QueryOuterClass.QueryNamespaceByDenomRequest.parser()

  public override fun convert(obj: QueryOuterClass.QueryNamespaceByDenomRequest):
      QueryNamespaceByDenomRequest = QueryNamespaceByDenomRequest(
  	denom = obj.getDenom(),
  	includeRoles = obj.getIncludeRoles(),
  )

  public override fun convert(obj: QueryNamespaceByDenomRequest):
      QueryOuterClass.QueryNamespaceByDenomRequest {
    val builder = QueryOuterClass.QueryNamespaceByDenomRequest.newBuilder()
    builder.setDenom(obj.denom)
    builder.setIncludeRoles(obj.includeRoles)
    return builder.build()
  }
}

public object QueryNamespaceByDenomResponseJvmConverter :
    ProtobufTypeMapper<QueryNamespaceByDenomResponse, QueryOuterClass.QueryNamespaceByDenomResponse>
    {
  public override val descriptor: Descriptors.Descriptor =
      QueryOuterClass.QueryNamespaceByDenomResponse.getDescriptor()

  public override val parser: Parser<QueryOuterClass.QueryNamespaceByDenomResponse> =
      QueryOuterClass.QueryNamespaceByDenomResponse.parser()

  public override fun convert(obj: QueryOuterClass.QueryNamespaceByDenomResponse):
      QueryNamespaceByDenomResponse = QueryNamespaceByDenomResponse(
  	namespace = NamespaceJvmConverter.convert(obj.getNamespace()),
  )

  public override fun convert(obj: QueryNamespaceByDenomResponse):
      QueryOuterClass.QueryNamespaceByDenomResponse {
    val builder = QueryOuterClass.QueryNamespaceByDenomResponse.newBuilder()
    builder.setNamespace(NamespaceJvmConverter.convert(obj.namespace))
    return builder.build()
  }
}

public object QueryAddressesByRoleRequestJvmConverter :
    ProtobufTypeMapper<QueryAddressesByRoleRequest, QueryOuterClass.QueryAddressesByRoleRequest> {
  public override val descriptor: Descriptors.Descriptor =
      QueryOuterClass.QueryAddressesByRoleRequest.getDescriptor()

  public override val parser: Parser<QueryOuterClass.QueryAddressesByRoleRequest> =
      QueryOuterClass.QueryAddressesByRoleRequest.parser()

  public override fun convert(obj: QueryOuterClass.QueryAddressesByRoleRequest):
      QueryAddressesByRoleRequest = QueryAddressesByRoleRequest(
  	denom = obj.getDenom(),
  	role = obj.getRole(),
  )

  public override fun convert(obj: QueryAddressesByRoleRequest):
      QueryOuterClass.QueryAddressesByRoleRequest {
    val builder = QueryOuterClass.QueryAddressesByRoleRequest.newBuilder()
    builder.setDenom(obj.denom)
    builder.setRole(obj.role)
    return builder.build()
  }
}

public object QueryAddressesByRoleResponseJvmConverter :
    ProtobufTypeMapper<QueryAddressesByRoleResponse, QueryOuterClass.QueryAddressesByRoleResponse> {
  public override val descriptor: Descriptors.Descriptor =
      QueryOuterClass.QueryAddressesByRoleResponse.getDescriptor()

  public override val parser: Parser<QueryOuterClass.QueryAddressesByRoleResponse> =
      QueryOuterClass.QueryAddressesByRoleResponse.parser()

  public override fun convert(obj: QueryOuterClass.QueryAddressesByRoleResponse):
      QueryAddressesByRoleResponse = QueryAddressesByRoleResponse(
  	addresses = obj.getAddressesList().map { it },
  )

  public override fun convert(obj: QueryAddressesByRoleResponse):
      QueryOuterClass.QueryAddressesByRoleResponse {
    val builder = QueryOuterClass.QueryAddressesByRoleResponse.newBuilder()
    builder.addAllAddresses(obj.addresses.map { it })
    return builder.build()
  }
}

public object QueryAddressRolesRequestJvmConverter :
    ProtobufTypeMapper<QueryAddressRolesRequest, QueryOuterClass.QueryAddressRolesRequest> {
  public override val descriptor: Descriptors.Descriptor =
      QueryOuterClass.QueryAddressRolesRequest.getDescriptor()

  public override val parser: Parser<QueryOuterClass.QueryAddressRolesRequest> =
      QueryOuterClass.QueryAddressRolesRequest.parser()

  public override fun convert(obj: QueryOuterClass.QueryAddressRolesRequest):
      QueryAddressRolesRequest = QueryAddressRolesRequest(
  	denom = obj.getDenom(),
  	address = obj.getAddress(),
  )

  public override fun convert(obj: QueryAddressRolesRequest):
      QueryOuterClass.QueryAddressRolesRequest {
    val builder = QueryOuterClass.QueryAddressRolesRequest.newBuilder()
    builder.setDenom(obj.denom)
    builder.setAddress(obj.address)
    return builder.build()
  }
}

public object QueryAddressRolesResponseJvmConverter :
    ProtobufTypeMapper<QueryAddressRolesResponse, QueryOuterClass.QueryAddressRolesResponse> {
  public override val descriptor: Descriptors.Descriptor =
      QueryOuterClass.QueryAddressRolesResponse.getDescriptor()

  public override val parser: Parser<QueryOuterClass.QueryAddressRolesResponse> =
      QueryOuterClass.QueryAddressRolesResponse.parser()

  public override fun convert(obj: QueryOuterClass.QueryAddressRolesResponse):
      QueryAddressRolesResponse = QueryAddressRolesResponse(
  	roles = obj.getRolesList().map { it },
  )

  public override fun convert(obj: QueryAddressRolesResponse):
      QueryOuterClass.QueryAddressRolesResponse {
    val builder = QueryOuterClass.QueryAddressRolesResponse.newBuilder()
    builder.addAllRoles(obj.roles.map { it })
    return builder.build()
  }
}

public object QueryVouchersForAddressRequestJvmConverter :
    ProtobufTypeMapper<QueryVouchersForAddressRequest, QueryOuterClass.QueryVouchersForAddressRequest>
    {
  public override val descriptor: Descriptors.Descriptor =
      QueryOuterClass.QueryVouchersForAddressRequest.getDescriptor()

  public override val parser: Parser<QueryOuterClass.QueryVouchersForAddressRequest> =
      QueryOuterClass.QueryVouchersForAddressRequest.parser()

  public override fun convert(obj: QueryOuterClass.QueryVouchersForAddressRequest):
      QueryVouchersForAddressRequest = QueryVouchersForAddressRequest(
  	address = obj.getAddress(),
  )

  public override fun convert(obj: QueryVouchersForAddressRequest):
      QueryOuterClass.QueryVouchersForAddressRequest {
    val builder = QueryOuterClass.QueryVouchersForAddressRequest.newBuilder()
    builder.setAddress(obj.address)
    return builder.build()
  }
}

public object QueryVouchersForAddressResponseJvmConverter :
    ProtobufTypeMapper<QueryVouchersForAddressResponse, QueryOuterClass.QueryVouchersForAddressResponse>
    {
  public override val descriptor: Descriptors.Descriptor =
      QueryOuterClass.QueryVouchersForAddressResponse.getDescriptor()

  public override val parser: Parser<QueryOuterClass.QueryVouchersForAddressResponse> =
      QueryOuterClass.QueryVouchersForAddressResponse.parser()

  public override fun convert(obj: QueryOuterClass.QueryVouchersForAddressResponse):
      QueryVouchersForAddressResponse = QueryVouchersForAddressResponse(
  	vouchers = obj.getVouchersList().map { AddressVoucherJvmConverter.convert(it) },
  )

  public override fun convert(obj: QueryVouchersForAddressResponse):
      QueryOuterClass.QueryVouchersForAddressResponse {
    val builder = QueryOuterClass.QueryVouchersForAddressResponse.newBuilder()
    builder.addAllVouchers(obj.vouchers.map { AddressVoucherJvmConverter.convert(it) })
    return builder.build()
  }
}
