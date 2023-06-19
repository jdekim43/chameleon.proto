// Transform from tendermint/rpc/grpc/types.proto
@file:ProtobufSyntax(syntax = "PROTO3")
@file:GeneratorVersion(version = "0.3.1")

package tendermint.rpc.grpc

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

public object BroadcastAPIJvm {
  private val descriptor: ServiceDescriptor = BroadcastAPIGrpc.getServiceDescriptor()!!

  private val pingDescriptor: MethodDescriptor<Types.RequestPing, Types.ResponsePing> =
      BroadcastAPIGrpc.getPingMethod()!!

  private val broadcastTxDescriptor:
      MethodDescriptor<Types.RequestBroadcastTx, Types.ResponseBroadcastTx> =
      BroadcastAPIGrpc.getBroadcastTxMethod()!!

  public abstract class Server(
    coroutineContext: CoroutineContext = EmptyCoroutineContext,
  ) : AbstractCoroutineServerImpl(context = coroutineContext), BroadcastAPI.Interface {
    public open override suspend fun ping(request: RequestPing): ResponsePing = throw
        StatusException(Status.UNIMPLEMENTED.withDescription("Method tendermint.rpc.grpc.BroadcastAPI.Ping is unimplemented"))

    public open override suspend fun broadcastTx(request: RequestBroadcastTx): ResponseBroadcastTx =
        throw
        StatusException(Status.UNIMPLEMENTED.withDescription("Method tendermint.rpc.grpc.BroadcastAPI.BroadcastTx is unimplemented"))

    public override fun bindService(): ServerServiceDefinition =
        ServerServiceDefinition.builder(descriptor)
    		.addMethod(
    			ServerCalls.unaryServerMethodDefinition(
    				context = this.context,
    				descriptor = pingDescriptor,
    				implementation = {
        ResponsePingJvmConverter.convert(ping(RequestPingJvmConverter.convert(it))) },
    			)
    		)
    		.addMethod(
    			ServerCalls.unaryServerMethodDefinition(
    				context = this.context,
    				descriptor = broadcastTxDescriptor,
    				implementation = {
        ResponseBroadcastTxJvmConverter.convert(broadcastTx(RequestBroadcastTxJvmConverter.convert(it)))
        },
    			)
    		)
    		.build()
  }

  public open class Client(
    private val option: ClientOption,
  ) : AbstractCoroutineStub<BroadcastAPI.Client>(channel = option.channel, callOptions =
      option.callOptions), BroadcastAPI.Interface {
    public override fun build(channel: Channel, callOptions: CallOptions): BroadcastAPI.Client =
        BroadcastAPI.Client(ClientOption(channel, callOptions))

    public override suspend fun ping(request: RequestPing): ResponsePing = ping(request, Metadata())

    public suspend fun ping(request: RequestPing, metadata: Metadata): ResponsePing =
        ResponsePingJvmConverter.convert(
    		ClientCalls.unaryRpc(
    			option.channel, pingDescriptor,
    			RequestPingJvmConverter.convert(request),
    			option.callOptions, metadata,
    		),
    	)

    public override suspend fun broadcastTx(request: RequestBroadcastTx): ResponseBroadcastTx =
        broadcastTx(request, Metadata())

    public suspend fun broadcastTx(request: RequestBroadcastTx, metadata: Metadata):
        ResponseBroadcastTx = ResponseBroadcastTxJvmConverter.convert(
    		ClientCalls.unaryRpc(
    			option.channel, broadcastTxDescriptor,
    			RequestBroadcastTxJvmConverter.convert(request),
    			option.callOptions, metadata,
    		),
    	)
  }
}
