// Transform from injective/ocr/v1beta1/query.proto
@file:ProtobufSyntax(syntax = "PROTO3")
@file:GeneratorVersion(version = "0.3.1")

package injective.ocr.v1beta1

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

  private val feedConfigDescriptor:
      MethodDescriptor<QueryOuterClass.QueryFeedConfigRequest, QueryOuterClass.QueryFeedConfigResponse>
      = QueryGrpc.getFeedConfigMethod()!!

  private val feedConfigInfoDescriptor:
      MethodDescriptor<QueryOuterClass.QueryFeedConfigInfoRequest, QueryOuterClass.QueryFeedConfigInfoResponse>
      = QueryGrpc.getFeedConfigInfoMethod()!!

  private val latestRoundDescriptor:
      MethodDescriptor<QueryOuterClass.QueryLatestRoundRequest, QueryOuterClass.QueryLatestRoundResponse>
      = QueryGrpc.getLatestRoundMethod()!!

  private val latestTransmissionDetailsDescriptor:
      MethodDescriptor<QueryOuterClass.QueryLatestTransmissionDetailsRequest, QueryOuterClass.QueryLatestTransmissionDetailsResponse>
      = QueryGrpc.getLatestTransmissionDetailsMethod()!!

  private val owedAmountDescriptor:
      MethodDescriptor<QueryOuterClass.QueryOwedAmountRequest, QueryOuterClass.QueryOwedAmountResponse>
      = QueryGrpc.getOwedAmountMethod()!!

  private val ocrModuleStateDescriptor:
      MethodDescriptor<QueryOuterClass.QueryModuleStateRequest, QueryOuterClass.QueryModuleStateResponse>
      = QueryGrpc.getOcrModuleStateMethod()!!

  public abstract class Server(
    coroutineContext: CoroutineContext = EmptyCoroutineContext,
  ) : AbstractCoroutineServerImpl(context = coroutineContext), Query.Interface {
    public open override suspend fun params(request: QueryParamsRequest): QueryParamsResponse =
        throw
        StatusException(Status.UNIMPLEMENTED.withDescription("Method injective.ocr.v1beta1.Query.Params is unimplemented"))

    public open override suspend fun feedConfig(request: QueryFeedConfigRequest):
        QueryFeedConfigResponse = throw
        StatusException(Status.UNIMPLEMENTED.withDescription("Method injective.ocr.v1beta1.Query.FeedConfig is unimplemented"))

    public open override suspend fun feedConfigInfo(request: QueryFeedConfigInfoRequest):
        QueryFeedConfigInfoResponse = throw
        StatusException(Status.UNIMPLEMENTED.withDescription("Method injective.ocr.v1beta1.Query.FeedConfigInfo is unimplemented"))

    public open override suspend fun latestRound(request: QueryLatestRoundRequest):
        QueryLatestRoundResponse = throw
        StatusException(Status.UNIMPLEMENTED.withDescription("Method injective.ocr.v1beta1.Query.LatestRound is unimplemented"))

    public open override suspend
        fun latestTransmissionDetails(request: QueryLatestTransmissionDetailsRequest):
        QueryLatestTransmissionDetailsResponse = throw
        StatusException(Status.UNIMPLEMENTED.withDescription("Method injective.ocr.v1beta1.Query.LatestTransmissionDetails is unimplemented"))

    public open override suspend fun owedAmount(request: QueryOwedAmountRequest):
        QueryOwedAmountResponse = throw
        StatusException(Status.UNIMPLEMENTED.withDescription("Method injective.ocr.v1beta1.Query.OwedAmount is unimplemented"))

    public open override suspend fun ocrModuleState(request: QueryModuleStateRequest):
        QueryModuleStateResponse = throw
        StatusException(Status.UNIMPLEMENTED.withDescription("Method injective.ocr.v1beta1.Query.OcrModuleState is unimplemented"))

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
    				descriptor = feedConfigDescriptor,
    				implementation = {
        QueryFeedConfigResponseJvmConverter.convert(feedConfig(QueryFeedConfigRequestJvmConverter.convert(it)))
        },
    			)
    		)
    		.addMethod(
    			ServerCalls.unaryServerMethodDefinition(
    				context = this.context,
    				descriptor = feedConfigInfoDescriptor,
    				implementation = {
        QueryFeedConfigInfoResponseJvmConverter.convert(feedConfigInfo(QueryFeedConfigInfoRequestJvmConverter.convert(it)))
        },
    			)
    		)
    		.addMethod(
    			ServerCalls.unaryServerMethodDefinition(
    				context = this.context,
    				descriptor = latestRoundDescriptor,
    				implementation = {
        QueryLatestRoundResponseJvmConverter.convert(latestRound(QueryLatestRoundRequestJvmConverter.convert(it)))
        },
    			)
    		)
    		.addMethod(
    			ServerCalls.unaryServerMethodDefinition(
    				context = this.context,
    				descriptor = latestTransmissionDetailsDescriptor,
    				implementation = {
        QueryLatestTransmissionDetailsResponseJvmConverter.convert(latestTransmissionDetails(QueryLatestTransmissionDetailsRequestJvmConverter.convert(it)))
        },
    			)
    		)
    		.addMethod(
    			ServerCalls.unaryServerMethodDefinition(
    				context = this.context,
    				descriptor = owedAmountDescriptor,
    				implementation = {
        QueryOwedAmountResponseJvmConverter.convert(owedAmount(QueryOwedAmountRequestJvmConverter.convert(it)))
        },
    			)
    		)
    		.addMethod(
    			ServerCalls.unaryServerMethodDefinition(
    				context = this.context,
    				descriptor = ocrModuleStateDescriptor,
    				implementation = {
        QueryModuleStateResponseJvmConverter.convert(ocrModuleState(QueryModuleStateRequestJvmConverter.convert(it)))
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

    public override suspend fun feedConfig(request: QueryFeedConfigRequest): QueryFeedConfigResponse
        = feedConfig(request, Metadata())

    public suspend fun feedConfig(request: QueryFeedConfigRequest, metadata: Metadata):
        QueryFeedConfigResponse = QueryFeedConfigResponseJvmConverter.convert(
    		ClientCalls.unaryRpc(
    			option.channel, feedConfigDescriptor,
    			QueryFeedConfigRequestJvmConverter.convert(request),
    			option.callOptions, metadata,
    		),
    	)

    public override suspend fun feedConfigInfo(request: QueryFeedConfigInfoRequest):
        QueryFeedConfigInfoResponse = feedConfigInfo(request, Metadata())

    public suspend fun feedConfigInfo(request: QueryFeedConfigInfoRequest, metadata: Metadata):
        QueryFeedConfigInfoResponse = QueryFeedConfigInfoResponseJvmConverter.convert(
    		ClientCalls.unaryRpc(
    			option.channel, feedConfigInfoDescriptor,
    			QueryFeedConfigInfoRequestJvmConverter.convert(request),
    			option.callOptions, metadata,
    		),
    	)

    public override suspend fun latestRound(request: QueryLatestRoundRequest):
        QueryLatestRoundResponse = latestRound(request, Metadata())

    public suspend fun latestRound(request: QueryLatestRoundRequest, metadata: Metadata):
        QueryLatestRoundResponse = QueryLatestRoundResponseJvmConverter.convert(
    		ClientCalls.unaryRpc(
    			option.channel, latestRoundDescriptor,
    			QueryLatestRoundRequestJvmConverter.convert(request),
    			option.callOptions, metadata,
    		),
    	)

    public override suspend
        fun latestTransmissionDetails(request: QueryLatestTransmissionDetailsRequest):
        QueryLatestTransmissionDetailsResponse = latestTransmissionDetails(request, Metadata())

    public suspend fun latestTransmissionDetails(request: QueryLatestTransmissionDetailsRequest,
        metadata: Metadata): QueryLatestTransmissionDetailsResponse =
        QueryLatestTransmissionDetailsResponseJvmConverter.convert(
    		ClientCalls.unaryRpc(
    			option.channel, latestTransmissionDetailsDescriptor,
    			QueryLatestTransmissionDetailsRequestJvmConverter.convert(request),
    			option.callOptions, metadata,
    		),
    	)

    public override suspend fun owedAmount(request: QueryOwedAmountRequest): QueryOwedAmountResponse
        = owedAmount(request, Metadata())

    public suspend fun owedAmount(request: QueryOwedAmountRequest, metadata: Metadata):
        QueryOwedAmountResponse = QueryOwedAmountResponseJvmConverter.convert(
    		ClientCalls.unaryRpc(
    			option.channel, owedAmountDescriptor,
    			QueryOwedAmountRequestJvmConverter.convert(request),
    			option.callOptions, metadata,
    		),
    	)

    public override suspend fun ocrModuleState(request: QueryModuleStateRequest):
        QueryModuleStateResponse = ocrModuleState(request, Metadata())

    public suspend fun ocrModuleState(request: QueryModuleStateRequest, metadata: Metadata):
        QueryModuleStateResponse = QueryModuleStateResponseJvmConverter.convert(
    		ClientCalls.unaryRpc(
    			option.channel, ocrModuleStateDescriptor,
    			QueryModuleStateRequestJvmConverter.convert(request),
    			option.callOptions, metadata,
    		),
    	)
  }
}
