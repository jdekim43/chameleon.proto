// Transform from injective/permissions/v1beta1/tx.proto
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

public object MsgJvm {
  private val descriptor: ServiceDescriptor = MsgGrpc.getServiceDescriptor()!!

  private val updateParamsDescriptor:
      MethodDescriptor<Tx.MsgUpdateParams, Tx.MsgUpdateParamsResponse> =
      MsgGrpc.getUpdateParamsMethod()!!

  private val createNamespaceDescriptor:
      MethodDescriptor<Tx.MsgCreateNamespace, Tx.MsgCreateNamespaceResponse> =
      MsgGrpc.getCreateNamespaceMethod()!!

  private val deleteNamespaceDescriptor:
      MethodDescriptor<Tx.MsgDeleteNamespace, Tx.MsgDeleteNamespaceResponse> =
      MsgGrpc.getDeleteNamespaceMethod()!!

  private val updateNamespaceDescriptor:
      MethodDescriptor<Tx.MsgUpdateNamespace, Tx.MsgUpdateNamespaceResponse> =
      MsgGrpc.getUpdateNamespaceMethod()!!

  private val updateNamespaceRolesDescriptor:
      MethodDescriptor<Tx.MsgUpdateNamespaceRoles, Tx.MsgUpdateNamespaceRolesResponse> =
      MsgGrpc.getUpdateNamespaceRolesMethod()!!

  private val revokeNamespaceRolesDescriptor:
      MethodDescriptor<Tx.MsgRevokeNamespaceRoles, Tx.MsgRevokeNamespaceRolesResponse> =
      MsgGrpc.getRevokeNamespaceRolesMethod()!!

  private val claimVoucherDescriptor:
      MethodDescriptor<Tx.MsgClaimVoucher, Tx.MsgClaimVoucherResponse> =
      MsgGrpc.getClaimVoucherMethod()!!

  public abstract class Server(
    coroutineContext: CoroutineContext = EmptyCoroutineContext,
  ) : AbstractCoroutineServerImpl(context = coroutineContext), Msg.Interface {
    public open override suspend fun updateParams(request: MsgUpdateParams): MsgUpdateParamsResponse
        = throw
        StatusException(Status.UNIMPLEMENTED.withDescription("Method injective.permissions.v1beta1.Msg.UpdateParams is unimplemented"))

    public open override suspend fun createNamespace(request: MsgCreateNamespace):
        MsgCreateNamespaceResponse = throw
        StatusException(Status.UNIMPLEMENTED.withDescription("Method injective.permissions.v1beta1.Msg.CreateNamespace is unimplemented"))

    public open override suspend fun deleteNamespace(request: MsgDeleteNamespace):
        MsgDeleteNamespaceResponse = throw
        StatusException(Status.UNIMPLEMENTED.withDescription("Method injective.permissions.v1beta1.Msg.DeleteNamespace is unimplemented"))

    public open override suspend fun updateNamespace(request: MsgUpdateNamespace):
        MsgUpdateNamespaceResponse = throw
        StatusException(Status.UNIMPLEMENTED.withDescription("Method injective.permissions.v1beta1.Msg.UpdateNamespace is unimplemented"))

    public open override suspend fun updateNamespaceRoles(request: MsgUpdateNamespaceRoles):
        MsgUpdateNamespaceRolesResponse = throw
        StatusException(Status.UNIMPLEMENTED.withDescription("Method injective.permissions.v1beta1.Msg.UpdateNamespaceRoles is unimplemented"))

    public open override suspend fun revokeNamespaceRoles(request: MsgRevokeNamespaceRoles):
        MsgRevokeNamespaceRolesResponse = throw
        StatusException(Status.UNIMPLEMENTED.withDescription("Method injective.permissions.v1beta1.Msg.RevokeNamespaceRoles is unimplemented"))

    public open override suspend fun claimVoucher(request: MsgClaimVoucher): MsgClaimVoucherResponse
        = throw
        StatusException(Status.UNIMPLEMENTED.withDescription("Method injective.permissions.v1beta1.Msg.ClaimVoucher is unimplemented"))

    public override fun bindService(): ServerServiceDefinition =
        ServerServiceDefinition.builder(descriptor)
    		.addMethod(
    			ServerCalls.unaryServerMethodDefinition(
    				context = this.context,
    				descriptor = updateParamsDescriptor,
    				implementation = {
        MsgUpdateParamsResponseJvmConverter.convert(updateParams(MsgUpdateParamsJvmConverter.convert(it)))
        },
    			)
    		)
    		.addMethod(
    			ServerCalls.unaryServerMethodDefinition(
    				context = this.context,
    				descriptor = createNamespaceDescriptor,
    				implementation = {
        MsgCreateNamespaceResponseJvmConverter.convert(createNamespace(MsgCreateNamespaceJvmConverter.convert(it)))
        },
    			)
    		)
    		.addMethod(
    			ServerCalls.unaryServerMethodDefinition(
    				context = this.context,
    				descriptor = deleteNamespaceDescriptor,
    				implementation = {
        MsgDeleteNamespaceResponseJvmConverter.convert(deleteNamespace(MsgDeleteNamespaceJvmConverter.convert(it)))
        },
    			)
    		)
    		.addMethod(
    			ServerCalls.unaryServerMethodDefinition(
    				context = this.context,
    				descriptor = updateNamespaceDescriptor,
    				implementation = {
        MsgUpdateNamespaceResponseJvmConverter.convert(updateNamespace(MsgUpdateNamespaceJvmConverter.convert(it)))
        },
    			)
    		)
    		.addMethod(
    			ServerCalls.unaryServerMethodDefinition(
    				context = this.context,
    				descriptor = updateNamespaceRolesDescriptor,
    				implementation = {
        MsgUpdateNamespaceRolesResponseJvmConverter.convert(updateNamespaceRoles(MsgUpdateNamespaceRolesJvmConverter.convert(it)))
        },
    			)
    		)
    		.addMethod(
    			ServerCalls.unaryServerMethodDefinition(
    				context = this.context,
    				descriptor = revokeNamespaceRolesDescriptor,
    				implementation = {
        MsgRevokeNamespaceRolesResponseJvmConverter.convert(revokeNamespaceRoles(MsgRevokeNamespaceRolesJvmConverter.convert(it)))
        },
    			)
    		)
    		.addMethod(
    			ServerCalls.unaryServerMethodDefinition(
    				context = this.context,
    				descriptor = claimVoucherDescriptor,
    				implementation = {
        MsgClaimVoucherResponseJvmConverter.convert(claimVoucher(MsgClaimVoucherJvmConverter.convert(it)))
        },
    			)
    		)
    		.build()
  }

  public open class Client(
    private val option: ClientOption,
  ) : AbstractCoroutineStub<Msg.Client>(channel = option.channel, callOptions = option.callOptions),
      Msg.Interface {
    public override fun build(channel: Channel, callOptions: CallOptions): Msg.Client =
        Msg.Client(ClientOption(channel, callOptions))

    public override suspend fun updateParams(request: MsgUpdateParams): MsgUpdateParamsResponse =
        updateParams(request, Metadata())

    public suspend fun updateParams(request: MsgUpdateParams, metadata: Metadata):
        MsgUpdateParamsResponse = MsgUpdateParamsResponseJvmConverter.convert(
    		ClientCalls.unaryRpc(
    			option.channel, updateParamsDescriptor,
    			MsgUpdateParamsJvmConverter.convert(request),
    			option.callOptions, metadata,
    		),
    	)

    public override suspend fun createNamespace(request: MsgCreateNamespace):
        MsgCreateNamespaceResponse = createNamespace(request, Metadata())

    public suspend fun createNamespace(request: MsgCreateNamespace, metadata: Metadata):
        MsgCreateNamespaceResponse = MsgCreateNamespaceResponseJvmConverter.convert(
    		ClientCalls.unaryRpc(
    			option.channel, createNamespaceDescriptor,
    			MsgCreateNamespaceJvmConverter.convert(request),
    			option.callOptions, metadata,
    		),
    	)

    public override suspend fun deleteNamespace(request: MsgDeleteNamespace):
        MsgDeleteNamespaceResponse = deleteNamespace(request, Metadata())

    public suspend fun deleteNamespace(request: MsgDeleteNamespace, metadata: Metadata):
        MsgDeleteNamespaceResponse = MsgDeleteNamespaceResponseJvmConverter.convert(
    		ClientCalls.unaryRpc(
    			option.channel, deleteNamespaceDescriptor,
    			MsgDeleteNamespaceJvmConverter.convert(request),
    			option.callOptions, metadata,
    		),
    	)

    public override suspend fun updateNamespace(request: MsgUpdateNamespace):
        MsgUpdateNamespaceResponse = updateNamespace(request, Metadata())

    public suspend fun updateNamespace(request: MsgUpdateNamespace, metadata: Metadata):
        MsgUpdateNamespaceResponse = MsgUpdateNamespaceResponseJvmConverter.convert(
    		ClientCalls.unaryRpc(
    			option.channel, updateNamespaceDescriptor,
    			MsgUpdateNamespaceJvmConverter.convert(request),
    			option.callOptions, metadata,
    		),
    	)

    public override suspend fun updateNamespaceRoles(request: MsgUpdateNamespaceRoles):
        MsgUpdateNamespaceRolesResponse = updateNamespaceRoles(request, Metadata())

    public suspend fun updateNamespaceRoles(request: MsgUpdateNamespaceRoles, metadata: Metadata):
        MsgUpdateNamespaceRolesResponse = MsgUpdateNamespaceRolesResponseJvmConverter.convert(
    		ClientCalls.unaryRpc(
    			option.channel, updateNamespaceRolesDescriptor,
    			MsgUpdateNamespaceRolesJvmConverter.convert(request),
    			option.callOptions, metadata,
    		),
    	)

    public override suspend fun revokeNamespaceRoles(request: MsgRevokeNamespaceRoles):
        MsgRevokeNamespaceRolesResponse = revokeNamespaceRoles(request, Metadata())

    public suspend fun revokeNamespaceRoles(request: MsgRevokeNamespaceRoles, metadata: Metadata):
        MsgRevokeNamespaceRolesResponse = MsgRevokeNamespaceRolesResponseJvmConverter.convert(
    		ClientCalls.unaryRpc(
    			option.channel, revokeNamespaceRolesDescriptor,
    			MsgRevokeNamespaceRolesJvmConverter.convert(request),
    			option.callOptions, metadata,
    		),
    	)

    public override suspend fun claimVoucher(request: MsgClaimVoucher): MsgClaimVoucherResponse =
        claimVoucher(request, Metadata())

    public suspend fun claimVoucher(request: MsgClaimVoucher, metadata: Metadata):
        MsgClaimVoucherResponse = MsgClaimVoucherResponseJvmConverter.convert(
    		ClientCalls.unaryRpc(
    			option.channel, claimVoucherDescriptor,
    			MsgClaimVoucherJvmConverter.convert(request),
    			option.callOptions, metadata,
    		),
    	)
  }
}
