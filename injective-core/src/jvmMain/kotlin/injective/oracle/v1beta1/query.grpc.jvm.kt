// Transform from injective/oracle/v1beta1/query.proto
@file:ProtobufSyntax(syntax = "PROTO3")
@file:GeneratorVersion(version = "0.3.1")

package injective.oracle.v1beta1

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

  private val bandRelayersDescriptor:
      MethodDescriptor<QueryOuterClass.QueryBandRelayersRequest, QueryOuterClass.QueryBandRelayersResponse>
      = QueryGrpc.getBandRelayersMethod()!!

  private val bandPriceStatesDescriptor:
      MethodDescriptor<QueryOuterClass.QueryBandPriceStatesRequest, QueryOuterClass.QueryBandPriceStatesResponse>
      = QueryGrpc.getBandPriceStatesMethod()!!

  private val bandIBCPriceStatesDescriptor:
      MethodDescriptor<QueryOuterClass.QueryBandIBCPriceStatesRequest, QueryOuterClass.QueryBandIBCPriceStatesResponse>
      = QueryGrpc.getBandIBCPriceStatesMethod()!!

  private val priceFeedPriceStatesDescriptor:
      MethodDescriptor<QueryOuterClass.QueryPriceFeedPriceStatesRequest, QueryOuterClass.QueryPriceFeedPriceStatesResponse>
      = QueryGrpc.getPriceFeedPriceStatesMethod()!!

  private val coinbasePriceStatesDescriptor:
      MethodDescriptor<QueryOuterClass.QueryCoinbasePriceStatesRequest, QueryOuterClass.QueryCoinbasePriceStatesResponse>
      = QueryGrpc.getCoinbasePriceStatesMethod()!!

  private val pythPriceStatesDescriptor:
      MethodDescriptor<QueryOuterClass.QueryPythPriceStatesRequest, QueryOuterClass.QueryPythPriceStatesResponse>
      = QueryGrpc.getPythPriceStatesMethod()!!

  private val providerPriceStateDescriptor:
      MethodDescriptor<QueryOuterClass.QueryProviderPriceStateRequest, QueryOuterClass.QueryProviderPriceStateResponse>
      = QueryGrpc.getProviderPriceStateMethod()!!

  private val oracleModuleStateDescriptor:
      MethodDescriptor<QueryOuterClass.QueryModuleStateRequest, QueryOuterClass.QueryModuleStateResponse>
      = QueryGrpc.getOracleModuleStateMethod()!!

  private val historicalPriceRecordsDescriptor:
      MethodDescriptor<QueryOuterClass.QueryHistoricalPriceRecordsRequest, QueryOuterClass.QueryHistoricalPriceRecordsResponse>
      = QueryGrpc.getHistoricalPriceRecordsMethod()!!

  private val oracleVolatilityDescriptor:
      MethodDescriptor<QueryOuterClass.QueryOracleVolatilityRequest, QueryOuterClass.QueryOracleVolatilityResponse>
      = QueryGrpc.getOracleVolatilityMethod()!!

  private val oracleProvidersInfoDescriptor:
      MethodDescriptor<QueryOuterClass.QueryOracleProvidersInfoRequest, QueryOuterClass.QueryOracleProvidersInfoResponse>
      = QueryGrpc.getOracleProvidersInfoMethod()!!

  private val oracleProviderPricesDescriptor:
      MethodDescriptor<QueryOuterClass.QueryOracleProviderPricesRequest, QueryOuterClass.QueryOracleProviderPricesResponse>
      = QueryGrpc.getOracleProviderPricesMethod()!!

  private val oraclePriceDescriptor:
      MethodDescriptor<QueryOuterClass.QueryOraclePriceRequest, QueryOuterClass.QueryOraclePriceResponse>
      = QueryGrpc.getOraclePriceMethod()!!

  private val pythPriceDescriptor:
      MethodDescriptor<QueryOuterClass.QueryPythPriceRequest, QueryOuterClass.QueryPythPriceResponse>
      = QueryGrpc.getPythPriceMethod()!!

  public abstract class Server(
    coroutineContext: CoroutineContext = EmptyCoroutineContext,
  ) : AbstractCoroutineServerImpl(context = coroutineContext), Query.Interface {
    public open override suspend fun params(request: QueryParamsRequest): QueryParamsResponse =
        throw
        StatusException(Status.UNIMPLEMENTED.withDescription("Method injective.oracle.v1beta1.Query.Params is unimplemented"))

    public open override suspend fun bandRelayers(request: QueryBandRelayersRequest):
        QueryBandRelayersResponse = throw
        StatusException(Status.UNIMPLEMENTED.withDescription("Method injective.oracle.v1beta1.Query.BandRelayers is unimplemented"))

    public open override suspend fun bandPriceStates(request: QueryBandPriceStatesRequest):
        QueryBandPriceStatesResponse = throw
        StatusException(Status.UNIMPLEMENTED.withDescription("Method injective.oracle.v1beta1.Query.BandPriceStates is unimplemented"))

    public open override suspend fun bandIBCPriceStates(request: QueryBandIBCPriceStatesRequest):
        QueryBandIBCPriceStatesResponse = throw
        StatusException(Status.UNIMPLEMENTED.withDescription("Method injective.oracle.v1beta1.Query.BandIBCPriceStates is unimplemented"))

    public open override suspend
        fun priceFeedPriceStates(request: QueryPriceFeedPriceStatesRequest):
        QueryPriceFeedPriceStatesResponse = throw
        StatusException(Status.UNIMPLEMENTED.withDescription("Method injective.oracle.v1beta1.Query.PriceFeedPriceStates is unimplemented"))

    public open override suspend fun coinbasePriceStates(request: QueryCoinbasePriceStatesRequest):
        QueryCoinbasePriceStatesResponse = throw
        StatusException(Status.UNIMPLEMENTED.withDescription("Method injective.oracle.v1beta1.Query.CoinbasePriceStates is unimplemented"))

    public open override suspend fun pythPriceStates(request: QueryPythPriceStatesRequest):
        QueryPythPriceStatesResponse = throw
        StatusException(Status.UNIMPLEMENTED.withDescription("Method injective.oracle.v1beta1.Query.PythPriceStates is unimplemented"))

    public open override suspend fun providerPriceState(request: QueryProviderPriceStateRequest):
        QueryProviderPriceStateResponse = throw
        StatusException(Status.UNIMPLEMENTED.withDescription("Method injective.oracle.v1beta1.Query.ProviderPriceState is unimplemented"))

    public open override suspend fun oracleModuleState(request: QueryModuleStateRequest):
        QueryModuleStateResponse = throw
        StatusException(Status.UNIMPLEMENTED.withDescription("Method injective.oracle.v1beta1.Query.OracleModuleState is unimplemented"))

    public open override suspend
        fun historicalPriceRecords(request: QueryHistoricalPriceRecordsRequest):
        QueryHistoricalPriceRecordsResponse = throw
        StatusException(Status.UNIMPLEMENTED.withDescription("Method injective.oracle.v1beta1.Query.HistoricalPriceRecords is unimplemented"))

    public open override suspend fun oracleVolatility(request: QueryOracleVolatilityRequest):
        QueryOracleVolatilityResponse = throw
        StatusException(Status.UNIMPLEMENTED.withDescription("Method injective.oracle.v1beta1.Query.OracleVolatility is unimplemented"))

    public open override suspend fun oracleProvidersInfo(request: QueryOracleProvidersInfoRequest):
        QueryOracleProvidersInfoResponse = throw
        StatusException(Status.UNIMPLEMENTED.withDescription("Method injective.oracle.v1beta1.Query.OracleProvidersInfo is unimplemented"))

    public open override suspend
        fun oracleProviderPrices(request: QueryOracleProviderPricesRequest):
        QueryOracleProviderPricesResponse = throw
        StatusException(Status.UNIMPLEMENTED.withDescription("Method injective.oracle.v1beta1.Query.OracleProviderPrices is unimplemented"))

    public open override suspend fun oraclePrice(request: QueryOraclePriceRequest):
        QueryOraclePriceResponse = throw
        StatusException(Status.UNIMPLEMENTED.withDescription("Method injective.oracle.v1beta1.Query.OraclePrice is unimplemented"))

    public open override suspend fun pythPrice(request: QueryPythPriceRequest):
        QueryPythPriceResponse = throw
        StatusException(Status.UNIMPLEMENTED.withDescription("Method injective.oracle.v1beta1.Query.PythPrice is unimplemented"))

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
    				descriptor = bandRelayersDescriptor,
    				implementation = {
        QueryBandRelayersResponseJvmConverter.convert(bandRelayers(QueryBandRelayersRequestJvmConverter.convert(it)))
        },
    			)
    		)
    		.addMethod(
    			ServerCalls.unaryServerMethodDefinition(
    				context = this.context,
    				descriptor = bandPriceStatesDescriptor,
    				implementation = {
        QueryBandPriceStatesResponseJvmConverter.convert(bandPriceStates(QueryBandPriceStatesRequestJvmConverter.convert(it)))
        },
    			)
    		)
    		.addMethod(
    			ServerCalls.unaryServerMethodDefinition(
    				context = this.context,
    				descriptor = bandIBCPriceStatesDescriptor,
    				implementation = {
        QueryBandIBCPriceStatesResponseJvmConverter.convert(bandIBCPriceStates(QueryBandIBCPriceStatesRequestJvmConverter.convert(it)))
        },
    			)
    		)
    		.addMethod(
    			ServerCalls.unaryServerMethodDefinition(
    				context = this.context,
    				descriptor = priceFeedPriceStatesDescriptor,
    				implementation = {
        QueryPriceFeedPriceStatesResponseJvmConverter.convert(priceFeedPriceStates(QueryPriceFeedPriceStatesRequestJvmConverter.convert(it)))
        },
    			)
    		)
    		.addMethod(
    			ServerCalls.unaryServerMethodDefinition(
    				context = this.context,
    				descriptor = coinbasePriceStatesDescriptor,
    				implementation = {
        QueryCoinbasePriceStatesResponseJvmConverter.convert(coinbasePriceStates(QueryCoinbasePriceStatesRequestJvmConverter.convert(it)))
        },
    			)
    		)
    		.addMethod(
    			ServerCalls.unaryServerMethodDefinition(
    				context = this.context,
    				descriptor = pythPriceStatesDescriptor,
    				implementation = {
        QueryPythPriceStatesResponseJvmConverter.convert(pythPriceStates(QueryPythPriceStatesRequestJvmConverter.convert(it)))
        },
    			)
    		)
    		.addMethod(
    			ServerCalls.unaryServerMethodDefinition(
    				context = this.context,
    				descriptor = providerPriceStateDescriptor,
    				implementation = {
        QueryProviderPriceStateResponseJvmConverter.convert(providerPriceState(QueryProviderPriceStateRequestJvmConverter.convert(it)))
        },
    			)
    		)
    		.addMethod(
    			ServerCalls.unaryServerMethodDefinition(
    				context = this.context,
    				descriptor = oracleModuleStateDescriptor,
    				implementation = {
        QueryModuleStateResponseJvmConverter.convert(oracleModuleState(QueryModuleStateRequestJvmConverter.convert(it)))
        },
    			)
    		)
    		.addMethod(
    			ServerCalls.unaryServerMethodDefinition(
    				context = this.context,
    				descriptor = historicalPriceRecordsDescriptor,
    				implementation = {
        QueryHistoricalPriceRecordsResponseJvmConverter.convert(historicalPriceRecords(QueryHistoricalPriceRecordsRequestJvmConverter.convert(it)))
        },
    			)
    		)
    		.addMethod(
    			ServerCalls.unaryServerMethodDefinition(
    				context = this.context,
    				descriptor = oracleVolatilityDescriptor,
    				implementation = {
        QueryOracleVolatilityResponseJvmConverter.convert(oracleVolatility(QueryOracleVolatilityRequestJvmConverter.convert(it)))
        },
    			)
    		)
    		.addMethod(
    			ServerCalls.unaryServerMethodDefinition(
    				context = this.context,
    				descriptor = oracleProvidersInfoDescriptor,
    				implementation = {
        QueryOracleProvidersInfoResponseJvmConverter.convert(oracleProvidersInfo(QueryOracleProvidersInfoRequestJvmConverter.convert(it)))
        },
    			)
    		)
    		.addMethod(
    			ServerCalls.unaryServerMethodDefinition(
    				context = this.context,
    				descriptor = oracleProviderPricesDescriptor,
    				implementation = {
        QueryOracleProviderPricesResponseJvmConverter.convert(oracleProviderPrices(QueryOracleProviderPricesRequestJvmConverter.convert(it)))
        },
    			)
    		)
    		.addMethod(
    			ServerCalls.unaryServerMethodDefinition(
    				context = this.context,
    				descriptor = oraclePriceDescriptor,
    				implementation = {
        QueryOraclePriceResponseJvmConverter.convert(oraclePrice(QueryOraclePriceRequestJvmConverter.convert(it)))
        },
    			)
    		)
    		.addMethod(
    			ServerCalls.unaryServerMethodDefinition(
    				context = this.context,
    				descriptor = pythPriceDescriptor,
    				implementation = {
        QueryPythPriceResponseJvmConverter.convert(pythPrice(QueryPythPriceRequestJvmConverter.convert(it)))
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

    public override suspend fun bandRelayers(request: QueryBandRelayersRequest):
        QueryBandRelayersResponse = bandRelayers(request, Metadata())

    public suspend fun bandRelayers(request: QueryBandRelayersRequest, metadata: Metadata):
        QueryBandRelayersResponse = QueryBandRelayersResponseJvmConverter.convert(
    		ClientCalls.unaryRpc(
    			option.channel, bandRelayersDescriptor,
    			QueryBandRelayersRequestJvmConverter.convert(request),
    			option.callOptions, metadata,
    		),
    	)

    public override suspend fun bandPriceStates(request: QueryBandPriceStatesRequest):
        QueryBandPriceStatesResponse = bandPriceStates(request, Metadata())

    public suspend fun bandPriceStates(request: QueryBandPriceStatesRequest, metadata: Metadata):
        QueryBandPriceStatesResponse = QueryBandPriceStatesResponseJvmConverter.convert(
    		ClientCalls.unaryRpc(
    			option.channel, bandPriceStatesDescriptor,
    			QueryBandPriceStatesRequestJvmConverter.convert(request),
    			option.callOptions, metadata,
    		),
    	)

    public override suspend fun bandIBCPriceStates(request: QueryBandIBCPriceStatesRequest):
        QueryBandIBCPriceStatesResponse = bandIBCPriceStates(request, Metadata())

    public suspend fun bandIBCPriceStates(request: QueryBandIBCPriceStatesRequest,
        metadata: Metadata): QueryBandIBCPriceStatesResponse =
        QueryBandIBCPriceStatesResponseJvmConverter.convert(
    		ClientCalls.unaryRpc(
    			option.channel, bandIBCPriceStatesDescriptor,
    			QueryBandIBCPriceStatesRequestJvmConverter.convert(request),
    			option.callOptions, metadata,
    		),
    	)

    public override suspend fun priceFeedPriceStates(request: QueryPriceFeedPriceStatesRequest):
        QueryPriceFeedPriceStatesResponse = priceFeedPriceStates(request, Metadata())

    public suspend fun priceFeedPriceStates(request: QueryPriceFeedPriceStatesRequest,
        metadata: Metadata): QueryPriceFeedPriceStatesResponse =
        QueryPriceFeedPriceStatesResponseJvmConverter.convert(
    		ClientCalls.unaryRpc(
    			option.channel, priceFeedPriceStatesDescriptor,
    			QueryPriceFeedPriceStatesRequestJvmConverter.convert(request),
    			option.callOptions, metadata,
    		),
    	)

    public override suspend fun coinbasePriceStates(request: QueryCoinbasePriceStatesRequest):
        QueryCoinbasePriceStatesResponse = coinbasePriceStates(request, Metadata())

    public suspend fun coinbasePriceStates(request: QueryCoinbasePriceStatesRequest,
        metadata: Metadata): QueryCoinbasePriceStatesResponse =
        QueryCoinbasePriceStatesResponseJvmConverter.convert(
    		ClientCalls.unaryRpc(
    			option.channel, coinbasePriceStatesDescriptor,
    			QueryCoinbasePriceStatesRequestJvmConverter.convert(request),
    			option.callOptions, metadata,
    		),
    	)

    public override suspend fun pythPriceStates(request: QueryPythPriceStatesRequest):
        QueryPythPriceStatesResponse = pythPriceStates(request, Metadata())

    public suspend fun pythPriceStates(request: QueryPythPriceStatesRequest, metadata: Metadata):
        QueryPythPriceStatesResponse = QueryPythPriceStatesResponseJvmConverter.convert(
    		ClientCalls.unaryRpc(
    			option.channel, pythPriceStatesDescriptor,
    			QueryPythPriceStatesRequestJvmConverter.convert(request),
    			option.callOptions, metadata,
    		),
    	)

    public override suspend fun providerPriceState(request: QueryProviderPriceStateRequest):
        QueryProviderPriceStateResponse = providerPriceState(request, Metadata())

    public suspend fun providerPriceState(request: QueryProviderPriceStateRequest,
        metadata: Metadata): QueryProviderPriceStateResponse =
        QueryProviderPriceStateResponseJvmConverter.convert(
    		ClientCalls.unaryRpc(
    			option.channel, providerPriceStateDescriptor,
    			QueryProviderPriceStateRequestJvmConverter.convert(request),
    			option.callOptions, metadata,
    		),
    	)

    public override suspend fun oracleModuleState(request: QueryModuleStateRequest):
        QueryModuleStateResponse = oracleModuleState(request, Metadata())

    public suspend fun oracleModuleState(request: QueryModuleStateRequest, metadata: Metadata):
        QueryModuleStateResponse = QueryModuleStateResponseJvmConverter.convert(
    		ClientCalls.unaryRpc(
    			option.channel, oracleModuleStateDescriptor,
    			QueryModuleStateRequestJvmConverter.convert(request),
    			option.callOptions, metadata,
    		),
    	)

    public override suspend fun historicalPriceRecords(request: QueryHistoricalPriceRecordsRequest):
        QueryHistoricalPriceRecordsResponse = historicalPriceRecords(request, Metadata())

    public suspend fun historicalPriceRecords(request: QueryHistoricalPriceRecordsRequest,
        metadata: Metadata): QueryHistoricalPriceRecordsResponse =
        QueryHistoricalPriceRecordsResponseJvmConverter.convert(
    		ClientCalls.unaryRpc(
    			option.channel, historicalPriceRecordsDescriptor,
    			QueryHistoricalPriceRecordsRequestJvmConverter.convert(request),
    			option.callOptions, metadata,
    		),
    	)

    public override suspend fun oracleVolatility(request: QueryOracleVolatilityRequest):
        QueryOracleVolatilityResponse = oracleVolatility(request, Metadata())

    public suspend fun oracleVolatility(request: QueryOracleVolatilityRequest, metadata: Metadata):
        QueryOracleVolatilityResponse = QueryOracleVolatilityResponseJvmConverter.convert(
    		ClientCalls.unaryRpc(
    			option.channel, oracleVolatilityDescriptor,
    			QueryOracleVolatilityRequestJvmConverter.convert(request),
    			option.callOptions, metadata,
    		),
    	)

    public override suspend fun oracleProvidersInfo(request: QueryOracleProvidersInfoRequest):
        QueryOracleProvidersInfoResponse = oracleProvidersInfo(request, Metadata())

    public suspend fun oracleProvidersInfo(request: QueryOracleProvidersInfoRequest,
        metadata: Metadata): QueryOracleProvidersInfoResponse =
        QueryOracleProvidersInfoResponseJvmConverter.convert(
    		ClientCalls.unaryRpc(
    			option.channel, oracleProvidersInfoDescriptor,
    			QueryOracleProvidersInfoRequestJvmConverter.convert(request),
    			option.callOptions, metadata,
    		),
    	)

    public override suspend fun oracleProviderPrices(request: QueryOracleProviderPricesRequest):
        QueryOracleProviderPricesResponse = oracleProviderPrices(request, Metadata())

    public suspend fun oracleProviderPrices(request: QueryOracleProviderPricesRequest,
        metadata: Metadata): QueryOracleProviderPricesResponse =
        QueryOracleProviderPricesResponseJvmConverter.convert(
    		ClientCalls.unaryRpc(
    			option.channel, oracleProviderPricesDescriptor,
    			QueryOracleProviderPricesRequestJvmConverter.convert(request),
    			option.callOptions, metadata,
    		),
    	)

    public override suspend fun oraclePrice(request: QueryOraclePriceRequest):
        QueryOraclePriceResponse = oraclePrice(request, Metadata())

    public suspend fun oraclePrice(request: QueryOraclePriceRequest, metadata: Metadata):
        QueryOraclePriceResponse = QueryOraclePriceResponseJvmConverter.convert(
    		ClientCalls.unaryRpc(
    			option.channel, oraclePriceDescriptor,
    			QueryOraclePriceRequestJvmConverter.convert(request),
    			option.callOptions, metadata,
    		),
    	)

    public override suspend fun pythPrice(request: QueryPythPriceRequest): QueryPythPriceResponse =
        pythPrice(request, Metadata())

    public suspend fun pythPrice(request: QueryPythPriceRequest, metadata: Metadata):
        QueryPythPriceResponse = QueryPythPriceResponseJvmConverter.convert(
    		ClientCalls.unaryRpc(
    			option.channel, pythPriceDescriptor,
    			QueryPythPriceRequestJvmConverter.convert(request),
    			option.callOptions, metadata,
    		),
    	)
  }
}
