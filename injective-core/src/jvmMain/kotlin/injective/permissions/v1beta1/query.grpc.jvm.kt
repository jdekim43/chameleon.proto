// Transform from injective/permissions/v1beta1/query.proto
@file:ProtobufSyntax(syntax = "PROTO3")
@file:GeneratorVersion(version = "0.3.1")

package injective.permissions.v1beta1

import io.grpc.CallOptions
import io.grpc.Channel
import io.grpc.Metadata
import io.grpc.MethodDescriptor
import io.grpc.ServerServiceDefinition
import io.grpc.ServiceDescriptor
import io.grpc.Status
import io.grpc.StatusException
import io.grpc.kotlin.AbstractCoroutineServerImpl
import io.grpc.kotlin.AbstractCoroutineStub
import io.grpc.kotlin.ClientCalls
import io.grpc.kotlin.ServerCalls
import kotlin.coroutines.CoroutineContext
import kotlin.coroutines.EmptyCoroutineContext
import kr.jadekim.protobuf.`annotation`.GeneratorVersion
import kr.jadekim.protobuf.`annotation`.ProtobufSyntax
import kr.jadekim.protobuf.grpc.ClientOption

public object QueryJvm {
  private val descriptor: ServiceDescriptor = QueryGrpc.getServiceDescriptor()!!

  private val paramsDescriptor:
      MethodDescriptor<QueryOuterClass.QueryParamsRequest, QueryOuterClass.QueryParamsResponse> =
      QueryGrpc.getParamsMethod()!!

  private val allNamespacesDescriptor:
      MethodDescriptor<QueryOuterClass.QueryAllNamespacesRequest, QueryOuterClass.QueryAllNamespacesResponse>
      = QueryGrpc.getAllNamespacesMethod()!!

  private val namespaceByDenomDescriptor:
      MethodDescriptor<QueryOuterClass.QueryNamespaceByDenomRequest, QueryOuterClass.QueryNamespaceByDenomResponse>
      = QueryGrpc.getNamespaceByDenomMethod()!!

  private val addressRolesDescriptor:
      MethodDescriptor<QueryOuterClass.QueryAddressRolesRequest, QueryOuterClass.QueryAddressRolesResponse>
      = QueryGrpc.getAddressRolesMethod()!!

  private val addressesByRoleDescriptor:
      MethodDescriptor<QueryOuterClass.QueryAddressesByRoleRequest, QueryOuterClass.QueryAddressesByRoleResponse>
      = QueryGrpc.getAddressesByRoleMethod()!!

  private val vouchersForAddressDescriptor:
      MethodDescriptor<QueryOuterClass.QueryVouchersForAddressRequest, QueryOuterClass.QueryVouchersForAddressResponse>
      = QueryGrpc.getVouchersForAddressMethod()!!

  public abstract class Server(
    coroutineContext: CoroutineContext = EmptyCoroutineContext,
  ) : AbstractCoroutineServerImpl(context = coroutineContext), Query.Interface {
    public open override suspend fun params(request: QueryParamsRequest): QueryParamsResponse =
        throw
        StatusException(Status.UNIMPLEMENTED.withDescription("Method injective.permissions.v1beta1.Query.Params is unimplemented"))

    public open override suspend fun allNamespaces(request: QueryAllNamespacesRequest):
        QueryAllNamespacesResponse = throw
        StatusException(Status.UNIMPLEMENTED.withDescription("Method injective.permissions.v1beta1.Query.AllNamespaces is unimplemented"))

    public open override suspend fun namespaceByDenom(request: QueryNamespaceByDenomRequest):
        QueryNamespaceByDenomResponse = throw
        StatusException(Status.UNIMPLEMENTED.withDescription("Method injective.permissions.v1beta1.Query.NamespaceByDenom is unimplemented"))

    public open override suspend fun addressRoles(request: QueryAddressRolesRequest):
        QueryAddressRolesResponse = throw
        StatusException(Status.UNIMPLEMENTED.withDescription("Method injective.permissions.v1beta1.Query.AddressRoles is unimplemented"))

    public open override suspend fun addressesByRole(request: QueryAddressesByRoleRequest):
        QueryAddressesByRoleResponse = throw
        StatusException(Status.UNIMPLEMENTED.withDescription("Method injective.permissions.v1beta1.Query.AddressesByRole is unimplemented"))

    public open override suspend fun vouchersForAddress(request: QueryVouchersForAddressRequest):
        QueryVouchersForAddressResponse = throw
        StatusException(Status.UNIMPLEMENTED.withDescription("Method injective.permissions.v1beta1.Query.VouchersForAddress is unimplemented"))

    public override fun bindService(): ServerServiceDefinition =
        ServerServiceDefinition.builder(descriptor)
    		.addMethod(
    			ServerCalls.unaryServerMethodDefinition(
    				context = this.context,
    				descriptor = paramsDescriptor,
    				implementation = {
        QueryParamsResponseJvmConverter.convert(params(QueryParamsRequestJvmConverter.convert(it)))
        },
    			)
    		)
    		.addMethod(
    			ServerCalls.unaryServerMethodDefinition(
    				context = this.context,
    				descriptor = allNamespacesDescriptor,
    				implementation = {
        QueryAllNamespacesResponseJvmConverter.convert(allNamespaces(QueryAllNamespacesRequestJvmConverter.convert(it)))
        },
    			)
    		)
    		.addMethod(
    			ServerCalls.unaryServerMethodDefinition(
    				context = this.context,
    				descriptor = namespaceByDenomDescriptor,
    				implementation = {
        QueryNamespaceByDenomResponseJvmConverter.convert(namespaceByDenom(QueryNamespaceByDenomRequestJvmConverter.convert(it)))
        },
    			)
    		)
    		.addMethod(
    			ServerCalls.unaryServerMethodDefinition(
    				context = this.context,
    				descriptor = addressRolesDescriptor,
    				implementation = {
        QueryAddressRolesResponseJvmConverter.convert(addressRoles(QueryAddressRolesRequestJvmConverter.convert(it)))
        },
    			)
    		)
    		.addMethod(
    			ServerCalls.unaryServerMethodDefinition(
    				context = this.context,
    				descriptor = addressesByRoleDescriptor,
    				implementation = {
        QueryAddressesByRoleResponseJvmConverter.convert(addressesByRole(QueryAddressesByRoleRequestJvmConverter.convert(it)))
        },
    			)
    		)
    		.addMethod(
    			ServerCalls.unaryServerMethodDefinition(
    				context = this.context,
    				descriptor = vouchersForAddressDescriptor,
    				implementation = {
        QueryVouchersForAddressResponseJvmConverter.convert(vouchersForAddress(QueryVouchersForAddressRequestJvmConverter.convert(it)))
        },
    			)
    		)
    		.build()
  }

  public open class Client(
    private val option: ClientOption,
  ) : AbstractCoroutineStub<Query.Client>(channel = option.channel, callOptions =
      option.callOptions), Query.Interface {
    public override fun build(channel: Channel, callOptions: CallOptions): Query.Client =
        Query.Client(ClientOption(channel, callOptions))

    public override suspend fun params(request: QueryParamsRequest): QueryParamsResponse =
        params(request, Metadata())

    public suspend fun params(request: QueryParamsRequest, metadata: Metadata): QueryParamsResponse
        = QueryParamsResponseJvmConverter.convert(
    		ClientCalls.unaryRpc(
    			option.channel, paramsDescriptor,
    			QueryParamsRequestJvmConverter.convert(request),
    			option.callOptions, metadata,
    		),
    	)

    public override suspend fun allNamespaces(request: QueryAllNamespacesRequest):
        QueryAllNamespacesResponse = allNamespaces(request, Metadata())

    public suspend fun allNamespaces(request: QueryAllNamespacesRequest, metadata: Metadata):
        QueryAllNamespacesResponse = QueryAllNamespacesResponseJvmConverter.convert(
    		ClientCalls.unaryRpc(
    			option.channel, allNamespacesDescriptor,
    			QueryAllNamespacesRequestJvmConverter.convert(request),
    			option.callOptions, metadata,
    		),
    	)

    public override suspend fun namespaceByDenom(request: QueryNamespaceByDenomRequest):
        QueryNamespaceByDenomResponse = namespaceByDenom(request, Metadata())

    public suspend fun namespaceByDenom(request: QueryNamespaceByDenomRequest, metadata: Metadata):
        QueryNamespaceByDenomResponse = QueryNamespaceByDenomResponseJvmConverter.convert(
    		ClientCalls.unaryRpc(
    			option.channel, namespaceByDenomDescriptor,
    			QueryNamespaceByDenomRequestJvmConverter.convert(request),
    			option.callOptions, metadata,
    		),
    	)

    public override suspend fun addressRoles(request: QueryAddressRolesRequest):
        QueryAddressRolesResponse = addressRoles(request, Metadata())

    public suspend fun addressRoles(request: QueryAddressRolesRequest, metadata: Metadata):
        QueryAddressRolesResponse = QueryAddressRolesResponseJvmConverter.convert(
    		ClientCalls.unaryRpc(
    			option.channel, addressRolesDescriptor,
    			QueryAddressRolesRequestJvmConverter.convert(request),
    			option.callOptions, metadata,
    		),
    	)

    public override suspend fun addressesByRole(request: QueryAddressesByRoleRequest):
        QueryAddressesByRoleResponse = addressesByRole(request, Metadata())

    public suspend fun addressesByRole(request: QueryAddressesByRoleRequest, metadata: Metadata):
        QueryAddressesByRoleResponse = QueryAddressesByRoleResponseJvmConverter.convert(
    		ClientCalls.unaryRpc(
    			option.channel, addressesByRoleDescriptor,
    			QueryAddressesByRoleRequestJvmConverter.convert(request),
    			option.callOptions, metadata,
    		),
    	)

    public override suspend fun vouchersForAddress(request: QueryVouchersForAddressRequest):
        QueryVouchersForAddressResponse = vouchersForAddress(request, Metadata())

    public suspend fun vouchersForAddress(request: QueryVouchersForAddressRequest,
        metadata: Metadata): QueryVouchersForAddressResponse =
        QueryVouchersForAddressResponseJvmConverter.convert(
    		ClientCalls.unaryRpc(
    			option.channel, vouchersForAddressDescriptor,
    			QueryVouchersForAddressRequestJvmConverter.convert(request),
    			option.callOptions, metadata,
    		),
    	)
  }
}
