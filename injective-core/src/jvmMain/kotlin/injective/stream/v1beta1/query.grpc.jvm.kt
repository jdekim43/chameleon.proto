// Transform from injective/stream/v1beta1/query.proto
@file:ProtobufSyntax(syntax = "PROTO3")
@file:GeneratorVersion(version = "0.3.1")

package injective.stream.v1beta1

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

public object StreamJvm {
  private val descriptor: ServiceDescriptor = StreamGrpc.getServiceDescriptor()!!

  private val streamDescriptor: MethodDescriptor<Query.StreamRequest, Query.StreamResponse> =
      StreamGrpc.getStreamMethod()!!

  public abstract class Server(
    coroutineContext: CoroutineContext = EmptyCoroutineContext,
  ) : AbstractCoroutineServerImpl(context = coroutineContext), Stream.Interface {
    public open override suspend fun stream(request: StreamRequest): StreamResponse = throw
        StatusException(Status.UNIMPLEMENTED.withDescription("Method injective.stream.v1beta1.Stream.Stream is unimplemented"))

    public override fun bindService(): ServerServiceDefinition =
        ServerServiceDefinition.builder(descriptor)
    		.addMethod(
    			ServerCalls.unaryServerMethodDefinition(
    				context = this.context,
    				descriptor = streamDescriptor,
    				implementation = {
        StreamResponseJvmConverter.convert(stream(StreamRequestJvmConverter.convert(it))) },
    			)
    		)
    		.build()
  }

  public open class Client(
    private val option: ClientOption,
  ) : AbstractCoroutineStub<Stream.Client>(channel = option.channel, callOptions =
      option.callOptions), Stream.Interface {
    public override fun build(channel: Channel, callOptions: CallOptions): Stream.Client =
        Stream.Client(ClientOption(channel, callOptions))

    public override suspend fun stream(request: StreamRequest): StreamResponse = stream(request,
        Metadata())

    public suspend fun stream(request: StreamRequest, metadata: Metadata): StreamResponse =
        StreamResponseJvmConverter.convert(
    		ClientCalls.unaryRpc(
    			option.channel, streamDescriptor,
    			StreamRequestJvmConverter.convert(request),
    			option.callOptions, metadata,
    		),
    	)
  }
}
