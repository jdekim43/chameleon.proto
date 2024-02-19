// Transform from injective/wasmx/v1/tx.proto
@file:ProtobufSyntax(syntax = "PROTO3")
@file:GeneratorVersion(version = "0.3.1")

package injective.wasmx.v1

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

  private val updateRegistryContractParamsDescriptor:
      MethodDescriptor<Tx.MsgUpdateContract, Tx.MsgUpdateContractResponse> =
      MsgGrpc.getUpdateRegistryContractParamsMethod()!!

  private val activateRegistryContractDescriptor:
      MethodDescriptor<Tx.MsgActivateContract, Tx.MsgActivateContractResponse> =
      MsgGrpc.getActivateRegistryContractMethod()!!

  private val deactivateRegistryContractDescriptor:
      MethodDescriptor<Tx.MsgDeactivateContract, Tx.MsgDeactivateContractResponse> =
      MsgGrpc.getDeactivateRegistryContractMethod()!!

  private val executeContractCompatDescriptor:
      MethodDescriptor<Tx.MsgExecuteContractCompat, Tx.MsgExecuteContractCompatResponse> =
      MsgGrpc.getExecuteContractCompatMethod()!!

  private val updateParamsDescriptor:
      MethodDescriptor<Tx.MsgUpdateParams, Tx.MsgUpdateParamsResponse> =
      MsgGrpc.getUpdateParamsMethod()!!

  private val registerContractDescriptor:
      MethodDescriptor<Tx.MsgRegisterContract, Tx.MsgRegisterContractResponse> =
      MsgGrpc.getRegisterContractMethod()!!

  public abstract class Server(
    coroutineContext: CoroutineContext = EmptyCoroutineContext,
  ) : AbstractCoroutineServerImpl(context = coroutineContext), Msg.Interface {
    public open override suspend fun updateRegistryContractParams(request: MsgUpdateContract):
        MsgUpdateContractResponse = throw
        StatusException(Status.UNIMPLEMENTED.withDescription("Method injective.wasmx.v1.Msg.UpdateRegistryContractParams is unimplemented"))

    public open override suspend fun activateRegistryContract(request: MsgActivateContract):
        MsgActivateContractResponse = throw
        StatusException(Status.UNIMPLEMENTED.withDescription("Method injective.wasmx.v1.Msg.ActivateRegistryContract is unimplemented"))

    public open override suspend fun deactivateRegistryContract(request: MsgDeactivateContract):
        MsgDeactivateContractResponse = throw
        StatusException(Status.UNIMPLEMENTED.withDescription("Method injective.wasmx.v1.Msg.DeactivateRegistryContract is unimplemented"))

    public open override suspend fun executeContractCompat(request: MsgExecuteContractCompat):
        MsgExecuteContractCompatResponse = throw
        StatusException(Status.UNIMPLEMENTED.withDescription("Method injective.wasmx.v1.Msg.ExecuteContractCompat is unimplemented"))

    public open override suspend fun updateParams(request: MsgUpdateParams): MsgUpdateParamsResponse
        = throw
        StatusException(Status.UNIMPLEMENTED.withDescription("Method injective.wasmx.v1.Msg.UpdateParams is unimplemented"))

    public open override suspend fun registerContract(request: MsgRegisterContract):
        MsgRegisterContractResponse = throw
        StatusException(Status.UNIMPLEMENTED.withDescription("Method injective.wasmx.v1.Msg.RegisterContract is unimplemented"))

    public override fun bindService(): ServerServiceDefinition =
        ServerServiceDefinition.builder(descriptor)
    		.addMethod(
    			ServerCalls.unaryServerMethodDefinition(
    				context = this.context,
    				descriptor = updateRegistryContractParamsDescriptor,
    				implementation = {
        MsgUpdateContractResponseJvmConverter.convert(updateRegistryContractParams(MsgUpdateContractJvmConverter.convert(it)))
        },
    			)
    		)
    		.addMethod(
    			ServerCalls.unaryServerMethodDefinition(
    				context = this.context,
    				descriptor = activateRegistryContractDescriptor,
    				implementation = {
        MsgActivateContractResponseJvmConverter.convert(activateRegistryContract(MsgActivateContractJvmConverter.convert(it)))
        },
    			)
    		)
    		.addMethod(
    			ServerCalls.unaryServerMethodDefinition(
    				context = this.context,
    				descriptor = deactivateRegistryContractDescriptor,
    				implementation = {
        MsgDeactivateContractResponseJvmConverter.convert(deactivateRegistryContract(MsgDeactivateContractJvmConverter.convert(it)))
        },
    			)
    		)
    		.addMethod(
    			ServerCalls.unaryServerMethodDefinition(
    				context = this.context,
    				descriptor = executeContractCompatDescriptor,
    				implementation = {
        MsgExecuteContractCompatResponseJvmConverter.convert(executeContractCompat(MsgExecuteContractCompatJvmConverter.convert(it)))
        },
    			)
    		)
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
    				descriptor = registerContractDescriptor,
    				implementation = {
        MsgRegisterContractResponseJvmConverter.convert(registerContract(MsgRegisterContractJvmConverter.convert(it)))
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

    public override suspend fun updateRegistryContractParams(request: MsgUpdateContract):
        MsgUpdateContractResponse = updateRegistryContractParams(request, Metadata())

    public suspend fun updateRegistryContractParams(request: MsgUpdateContract, metadata: Metadata):
        MsgUpdateContractResponse = MsgUpdateContractResponseJvmConverter.convert(
    		ClientCalls.unaryRpc(
    			option.channel, updateRegistryContractParamsDescriptor,
    			MsgUpdateContractJvmConverter.convert(request),
    			option.callOptions, metadata,
    		),
    	)

    public override suspend fun activateRegistryContract(request: MsgActivateContract):
        MsgActivateContractResponse = activateRegistryContract(request, Metadata())

    public suspend fun activateRegistryContract(request: MsgActivateContract, metadata: Metadata):
        MsgActivateContractResponse = MsgActivateContractResponseJvmConverter.convert(
    		ClientCalls.unaryRpc(
    			option.channel, activateRegistryContractDescriptor,
    			MsgActivateContractJvmConverter.convert(request),
    			option.callOptions, metadata,
    		),
    	)

    public override suspend fun deactivateRegistryContract(request: MsgDeactivateContract):
        MsgDeactivateContractResponse = deactivateRegistryContract(request, Metadata())

    public suspend fun deactivateRegistryContract(request: MsgDeactivateContract,
        metadata: Metadata): MsgDeactivateContractResponse =
        MsgDeactivateContractResponseJvmConverter.convert(
    		ClientCalls.unaryRpc(
    			option.channel, deactivateRegistryContractDescriptor,
    			MsgDeactivateContractJvmConverter.convert(request),
    			option.callOptions, metadata,
    		),
    	)

    public override suspend fun executeContractCompat(request: MsgExecuteContractCompat):
        MsgExecuteContractCompatResponse = executeContractCompat(request, Metadata())

    public suspend fun executeContractCompat(request: MsgExecuteContractCompat, metadata: Metadata):
        MsgExecuteContractCompatResponse = MsgExecuteContractCompatResponseJvmConverter.convert(
    		ClientCalls.unaryRpc(
    			option.channel, executeContractCompatDescriptor,
    			MsgExecuteContractCompatJvmConverter.convert(request),
    			option.callOptions, metadata,
    		),
    	)

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

    public override suspend fun registerContract(request: MsgRegisterContract):
        MsgRegisterContractResponse = registerContract(request, Metadata())

    public suspend fun registerContract(request: MsgRegisterContract, metadata: Metadata):
        MsgRegisterContractResponse = MsgRegisterContractResponseJvmConverter.convert(
    		ClientCalls.unaryRpc(
    			option.channel, registerContractDescriptor,
    			MsgRegisterContractJvmConverter.convert(request),
    			option.callOptions, metadata,
    		),
    	)
  }
}
