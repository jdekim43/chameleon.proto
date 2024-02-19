// Transform from injective/wasmx/v1/query.proto
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

public object QueryJvm {
  private val descriptor: ServiceDescriptor = QueryGrpc.getServiceDescriptor()!!

  private val wasmxParamsDescriptor:
      MethodDescriptor<QueryOuterClass.QueryWasmxParamsRequest, QueryOuterClass.QueryWasmxParamsResponse>
      = QueryGrpc.getWasmxParamsMethod()!!

  private val contractRegistrationInfoDescriptor:
      MethodDescriptor<QueryOuterClass.QueryContractRegistrationInfoRequest, QueryOuterClass.QueryContractRegistrationInfoResponse>
      = QueryGrpc.getContractRegistrationInfoMethod()!!

  private val wasmxModuleStateDescriptor:
      MethodDescriptor<QueryOuterClass.QueryModuleStateRequest, QueryOuterClass.QueryModuleStateResponse>
      = QueryGrpc.getWasmxModuleStateMethod()!!

  public abstract class Server(
    coroutineContext: CoroutineContext = EmptyCoroutineContext,
  ) : AbstractCoroutineServerImpl(context = coroutineContext), Query.Interface {
    public open override suspend fun wasmxParams(request: QueryWasmxParamsRequest):
        QueryWasmxParamsResponse = throw
        StatusException(Status.UNIMPLEMENTED.withDescription("Method injective.wasmx.v1.Query.WasmxParams is unimplemented"))

    public open override suspend
        fun contractRegistrationInfo(request: QueryContractRegistrationInfoRequest):
        QueryContractRegistrationInfoResponse = throw
        StatusException(Status.UNIMPLEMENTED.withDescription("Method injective.wasmx.v1.Query.ContractRegistrationInfo is unimplemented"))

    public open override suspend fun wasmxModuleState(request: QueryModuleStateRequest):
        QueryModuleStateResponse = throw
        StatusException(Status.UNIMPLEMENTED.withDescription("Method injective.wasmx.v1.Query.WasmxModuleState is unimplemented"))

    public override fun bindService(): ServerServiceDefinition =
        ServerServiceDefinition.builder(descriptor)
    		.addMethod(
    			ServerCalls.unaryServerMethodDefinition(
    				context = this.context,
    				descriptor = wasmxParamsDescriptor,
    				implementation = {
        QueryWasmxParamsResponseJvmConverter.convert(wasmxParams(QueryWasmxParamsRequestJvmConverter.convert(it)))
        },
    			)
    		)
    		.addMethod(
    			ServerCalls.unaryServerMethodDefinition(
    				context = this.context,
    				descriptor = contractRegistrationInfoDescriptor,
    				implementation = {
        QueryContractRegistrationInfoResponseJvmConverter.convert(contractRegistrationInfo(QueryContractRegistrationInfoRequestJvmConverter.convert(it)))
        },
    			)
    		)
    		.addMethod(
    			ServerCalls.unaryServerMethodDefinition(
    				context = this.context,
    				descriptor = wasmxModuleStateDescriptor,
    				implementation = {
        QueryModuleStateResponseJvmConverter.convert(wasmxModuleState(QueryModuleStateRequestJvmConverter.convert(it)))
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

    public override suspend fun wasmxParams(request: QueryWasmxParamsRequest):
        QueryWasmxParamsResponse = wasmxParams(request, Metadata())

    public suspend fun wasmxParams(request: QueryWasmxParamsRequest, metadata: Metadata):
        QueryWasmxParamsResponse = QueryWasmxParamsResponseJvmConverter.convert(
    		ClientCalls.unaryRpc(
    			option.channel, wasmxParamsDescriptor,
    			QueryWasmxParamsRequestJvmConverter.convert(request),
    			option.callOptions, metadata,
    		),
    	)

    public override suspend
        fun contractRegistrationInfo(request: QueryContractRegistrationInfoRequest):
        QueryContractRegistrationInfoResponse = contractRegistrationInfo(request, Metadata())

    public suspend fun contractRegistrationInfo(request: QueryContractRegistrationInfoRequest,
        metadata: Metadata): QueryContractRegistrationInfoResponse =
        QueryContractRegistrationInfoResponseJvmConverter.convert(
    		ClientCalls.unaryRpc(
    			option.channel, contractRegistrationInfoDescriptor,
    			QueryContractRegistrationInfoRequestJvmConverter.convert(request),
    			option.callOptions, metadata,
    		),
    	)

    public override suspend fun wasmxModuleState(request: QueryModuleStateRequest):
        QueryModuleStateResponse = wasmxModuleState(request, Metadata())

    public suspend fun wasmxModuleState(request: QueryModuleStateRequest, metadata: Metadata):
        QueryModuleStateResponse = QueryModuleStateResponseJvmConverter.convert(
    		ClientCalls.unaryRpc(
    			option.channel, wasmxModuleStateDescriptor,
    			QueryModuleStateRequestJvmConverter.convert(request),
    			option.callOptions, metadata,
    		),
    	)
  }
}
