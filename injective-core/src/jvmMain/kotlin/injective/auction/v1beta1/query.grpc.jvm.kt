// Transform from injective/auction/v1beta1/query.proto
@file:ProtobufSyntax(syntax = "PROTO3")
@file:GeneratorVersion(version = "0.3.1")

package injective.auction.v1beta1

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

  private val auctionParamsDescriptor:
      MethodDescriptor<QueryOuterClass.QueryAuctionParamsRequest, QueryOuterClass.QueryAuctionParamsResponse>
      = QueryGrpc.getAuctionParamsMethod()!!

  private val currentAuctionBasketDescriptor:
      MethodDescriptor<QueryOuterClass.QueryCurrentAuctionBasketRequest, QueryOuterClass.QueryCurrentAuctionBasketResponse>
      = QueryGrpc.getCurrentAuctionBasketMethod()!!

  private val auctionModuleStateDescriptor:
      MethodDescriptor<QueryOuterClass.QueryModuleStateRequest, QueryOuterClass.QueryModuleStateResponse>
      = QueryGrpc.getAuctionModuleStateMethod()!!

  public abstract class Server(
    coroutineContext: CoroutineContext = EmptyCoroutineContext,
  ) : AbstractCoroutineServerImpl(context = coroutineContext), Query.Interface {
    public open override suspend fun auctionParams(request: QueryAuctionParamsRequest):
        QueryAuctionParamsResponse = throw
        StatusException(Status.UNIMPLEMENTED.withDescription("Method injective.auction.v1beta1.Query.AuctionParams is unimplemented"))

    public open override suspend
        fun currentAuctionBasket(request: QueryCurrentAuctionBasketRequest):
        QueryCurrentAuctionBasketResponse = throw
        StatusException(Status.UNIMPLEMENTED.withDescription("Method injective.auction.v1beta1.Query.CurrentAuctionBasket is unimplemented"))

    public open override suspend fun auctionModuleState(request: QueryModuleStateRequest):
        QueryModuleStateResponse = throw
        StatusException(Status.UNIMPLEMENTED.withDescription("Method injective.auction.v1beta1.Query.AuctionModuleState is unimplemented"))

    public override fun bindService(): ServerServiceDefinition =
        ServerServiceDefinition.builder(descriptor)
    		.addMethod(
    			ServerCalls.unaryServerMethodDefinition(
    				context = this.context,
    				descriptor = auctionParamsDescriptor,
    				implementation = {
        QueryAuctionParamsResponseJvmConverter.convert(auctionParams(QueryAuctionParamsRequestJvmConverter.convert(it)))
        },
    			)
    		)
    		.addMethod(
    			ServerCalls.unaryServerMethodDefinition(
    				context = this.context,
    				descriptor = currentAuctionBasketDescriptor,
    				implementation = {
        QueryCurrentAuctionBasketResponseJvmConverter.convert(currentAuctionBasket(QueryCurrentAuctionBasketRequestJvmConverter.convert(it)))
        },
    			)
    		)
    		.addMethod(
    			ServerCalls.unaryServerMethodDefinition(
    				context = this.context,
    				descriptor = auctionModuleStateDescriptor,
    				implementation = {
        QueryModuleStateResponseJvmConverter.convert(auctionModuleState(QueryModuleStateRequestJvmConverter.convert(it)))
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

    public override suspend fun auctionParams(request: QueryAuctionParamsRequest):
        QueryAuctionParamsResponse = auctionParams(request, Metadata())

    public suspend fun auctionParams(request: QueryAuctionParamsRequest, metadata: Metadata):
        QueryAuctionParamsResponse = QueryAuctionParamsResponseJvmConverter.convert(
    		ClientCalls.unaryRpc(
    			option.channel, auctionParamsDescriptor,
    			QueryAuctionParamsRequestJvmConverter.convert(request),
    			option.callOptions, metadata,
    		),
    	)

    public override suspend fun currentAuctionBasket(request: QueryCurrentAuctionBasketRequest):
        QueryCurrentAuctionBasketResponse = currentAuctionBasket(request, Metadata())

    public suspend fun currentAuctionBasket(request: QueryCurrentAuctionBasketRequest,
        metadata: Metadata): QueryCurrentAuctionBasketResponse =
        QueryCurrentAuctionBasketResponseJvmConverter.convert(
    		ClientCalls.unaryRpc(
    			option.channel, currentAuctionBasketDescriptor,
    			QueryCurrentAuctionBasketRequestJvmConverter.convert(request),
    			option.callOptions, metadata,
    		),
    	)

    public override suspend fun auctionModuleState(request: QueryModuleStateRequest):
        QueryModuleStateResponse = auctionModuleState(request, Metadata())

    public suspend fun auctionModuleState(request: QueryModuleStateRequest, metadata: Metadata):
        QueryModuleStateResponse = QueryModuleStateResponseJvmConverter.convert(
    		ClientCalls.unaryRpc(
    			option.channel, auctionModuleStateDescriptor,
    			QueryModuleStateRequestJvmConverter.convert(request),
    			option.callOptions, metadata,
    		),
    	)
  }
}
