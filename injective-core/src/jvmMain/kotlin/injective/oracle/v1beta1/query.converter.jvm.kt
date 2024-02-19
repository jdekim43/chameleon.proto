// Transform from injective/oracle/v1beta1/query.proto
@file:GeneratorVersion(version = "0.3.1")

package injective.oracle.v1beta1

import com.google.protobuf.Descriptors
import com.google.protobuf.Parser
import kr.jadekim.protobuf.`annotation`.GeneratorVersion
import kr.jadekim.protobuf.converter.mapper.ProtobufTypeMapper
import kr.jadekim.protobuf.util.asJavaType
import kr.jadekim.protobuf.util.asKotlinType

public object QueryPythPriceRequestJvmConverter :
    ProtobufTypeMapper<QueryPythPriceRequest, QueryOuterClass.QueryPythPriceRequest> {
  public override val descriptor: Descriptors.Descriptor =
      QueryOuterClass.QueryPythPriceRequest.getDescriptor()

  public override val parser: Parser<QueryOuterClass.QueryPythPriceRequest> =
      QueryOuterClass.QueryPythPriceRequest.parser()

  public override fun convert(obj: QueryOuterClass.QueryPythPriceRequest): QueryPythPriceRequest =
      QueryPythPriceRequest(
  	priceId = obj.getPriceId(),
  )

  public override fun convert(obj: QueryPythPriceRequest): QueryOuterClass.QueryPythPriceRequest {
    val builder = QueryOuterClass.QueryPythPriceRequest.newBuilder()
    builder.setPriceId(obj.priceId)
    return builder.build()
  }
}

public object QueryPythPriceResponseJvmConverter :
    ProtobufTypeMapper<QueryPythPriceResponse, QueryOuterClass.QueryPythPriceResponse> {
  public override val descriptor: Descriptors.Descriptor =
      QueryOuterClass.QueryPythPriceResponse.getDescriptor()

  public override val parser: Parser<QueryOuterClass.QueryPythPriceResponse> =
      QueryOuterClass.QueryPythPriceResponse.parser()

  public override fun convert(obj: QueryOuterClass.QueryPythPriceResponse): QueryPythPriceResponse =
      QueryPythPriceResponse(
  	priceState = PythPriceStateJvmConverter.convert(obj.getPriceState()),
  )

  public override fun convert(obj: QueryPythPriceResponse): QueryOuterClass.QueryPythPriceResponse {
    val builder = QueryOuterClass.QueryPythPriceResponse.newBuilder()
    builder.setPriceState(PythPriceStateJvmConverter.convert(obj.priceState))
    return builder.build()
  }
}

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

public object QueryBandRelayersRequestJvmConverter :
    ProtobufTypeMapper<QueryBandRelayersRequest, QueryOuterClass.QueryBandRelayersRequest> {
  public override val descriptor: Descriptors.Descriptor =
      QueryOuterClass.QueryBandRelayersRequest.getDescriptor()

  public override val parser: Parser<QueryOuterClass.QueryBandRelayersRequest> =
      QueryOuterClass.QueryBandRelayersRequest.parser()

  public override fun convert(obj: QueryOuterClass.QueryBandRelayersRequest):
      QueryBandRelayersRequest = QueryBandRelayersRequest(
  )

  public override fun convert(obj: QueryBandRelayersRequest):
      QueryOuterClass.QueryBandRelayersRequest {
    val builder = QueryOuterClass.QueryBandRelayersRequest.newBuilder()
    return builder.build()
  }
}

public object QueryBandRelayersResponseJvmConverter :
    ProtobufTypeMapper<QueryBandRelayersResponse, QueryOuterClass.QueryBandRelayersResponse> {
  public override val descriptor: Descriptors.Descriptor =
      QueryOuterClass.QueryBandRelayersResponse.getDescriptor()

  public override val parser: Parser<QueryOuterClass.QueryBandRelayersResponse> =
      QueryOuterClass.QueryBandRelayersResponse.parser()

  public override fun convert(obj: QueryOuterClass.QueryBandRelayersResponse):
      QueryBandRelayersResponse = QueryBandRelayersResponse(
  	relayers = obj.getRelayersList().map { it },
  )

  public override fun convert(obj: QueryBandRelayersResponse):
      QueryOuterClass.QueryBandRelayersResponse {
    val builder = QueryOuterClass.QueryBandRelayersResponse.newBuilder()
    builder.addAllRelayers(obj.relayers.map { it })
    return builder.build()
  }
}

public object QueryBandPriceStatesRequestJvmConverter :
    ProtobufTypeMapper<QueryBandPriceStatesRequest, QueryOuterClass.QueryBandPriceStatesRequest> {
  public override val descriptor: Descriptors.Descriptor =
      QueryOuterClass.QueryBandPriceStatesRequest.getDescriptor()

  public override val parser: Parser<QueryOuterClass.QueryBandPriceStatesRequest> =
      QueryOuterClass.QueryBandPriceStatesRequest.parser()

  public override fun convert(obj: QueryOuterClass.QueryBandPriceStatesRequest):
      QueryBandPriceStatesRequest = QueryBandPriceStatesRequest(
  )

  public override fun convert(obj: QueryBandPriceStatesRequest):
      QueryOuterClass.QueryBandPriceStatesRequest {
    val builder = QueryOuterClass.QueryBandPriceStatesRequest.newBuilder()
    return builder.build()
  }
}

public object QueryBandPriceStatesResponseJvmConverter :
    ProtobufTypeMapper<QueryBandPriceStatesResponse, QueryOuterClass.QueryBandPriceStatesResponse> {
  public override val descriptor: Descriptors.Descriptor =
      QueryOuterClass.QueryBandPriceStatesResponse.getDescriptor()

  public override val parser: Parser<QueryOuterClass.QueryBandPriceStatesResponse> =
      QueryOuterClass.QueryBandPriceStatesResponse.parser()

  public override fun convert(obj: QueryOuterClass.QueryBandPriceStatesResponse):
      QueryBandPriceStatesResponse = QueryBandPriceStatesResponse(
  	priceStates = obj.getPriceStatesList().map { BandPriceStateJvmConverter.convert(it) },
  )

  public override fun convert(obj: QueryBandPriceStatesResponse):
      QueryOuterClass.QueryBandPriceStatesResponse {
    val builder = QueryOuterClass.QueryBandPriceStatesResponse.newBuilder()
    builder.addAllPriceStates(obj.priceStates.map { BandPriceStateJvmConverter.convert(it) })
    return builder.build()
  }
}

public object QueryBandIBCPriceStatesRequestJvmConverter :
    ProtobufTypeMapper<QueryBandIBCPriceStatesRequest, QueryOuterClass.QueryBandIBCPriceStatesRequest>
    {
  public override val descriptor: Descriptors.Descriptor =
      QueryOuterClass.QueryBandIBCPriceStatesRequest.getDescriptor()

  public override val parser: Parser<QueryOuterClass.QueryBandIBCPriceStatesRequest> =
      QueryOuterClass.QueryBandIBCPriceStatesRequest.parser()

  public override fun convert(obj: QueryOuterClass.QueryBandIBCPriceStatesRequest):
      QueryBandIBCPriceStatesRequest = QueryBandIBCPriceStatesRequest(
  )

  public override fun convert(obj: QueryBandIBCPriceStatesRequest):
      QueryOuterClass.QueryBandIBCPriceStatesRequest {
    val builder = QueryOuterClass.QueryBandIBCPriceStatesRequest.newBuilder()
    return builder.build()
  }
}

public object QueryBandIBCPriceStatesResponseJvmConverter :
    ProtobufTypeMapper<QueryBandIBCPriceStatesResponse, QueryOuterClass.QueryBandIBCPriceStatesResponse>
    {
  public override val descriptor: Descriptors.Descriptor =
      QueryOuterClass.QueryBandIBCPriceStatesResponse.getDescriptor()

  public override val parser: Parser<QueryOuterClass.QueryBandIBCPriceStatesResponse> =
      QueryOuterClass.QueryBandIBCPriceStatesResponse.parser()

  public override fun convert(obj: QueryOuterClass.QueryBandIBCPriceStatesResponse):
      QueryBandIBCPriceStatesResponse = QueryBandIBCPriceStatesResponse(
  	priceStates = obj.getPriceStatesList().map { BandPriceStateJvmConverter.convert(it) },
  )

  public override fun convert(obj: QueryBandIBCPriceStatesResponse):
      QueryOuterClass.QueryBandIBCPriceStatesResponse {
    val builder = QueryOuterClass.QueryBandIBCPriceStatesResponse.newBuilder()
    builder.addAllPriceStates(obj.priceStates.map { BandPriceStateJvmConverter.convert(it) })
    return builder.build()
  }
}

public object QueryPriceFeedPriceStatesRequestJvmConverter :
    ProtobufTypeMapper<QueryPriceFeedPriceStatesRequest, QueryOuterClass.QueryPriceFeedPriceStatesRequest>
    {
  public override val descriptor: Descriptors.Descriptor =
      QueryOuterClass.QueryPriceFeedPriceStatesRequest.getDescriptor()

  public override val parser: Parser<QueryOuterClass.QueryPriceFeedPriceStatesRequest> =
      QueryOuterClass.QueryPriceFeedPriceStatesRequest.parser()

  public override fun convert(obj: QueryOuterClass.QueryPriceFeedPriceStatesRequest):
      QueryPriceFeedPriceStatesRequest = QueryPriceFeedPriceStatesRequest(
  )

  public override fun convert(obj: QueryPriceFeedPriceStatesRequest):
      QueryOuterClass.QueryPriceFeedPriceStatesRequest {
    val builder = QueryOuterClass.QueryPriceFeedPriceStatesRequest.newBuilder()
    return builder.build()
  }
}

public object QueryPriceFeedPriceStatesResponseJvmConverter :
    ProtobufTypeMapper<QueryPriceFeedPriceStatesResponse, QueryOuterClass.QueryPriceFeedPriceStatesResponse>
    {
  public override val descriptor: Descriptors.Descriptor =
      QueryOuterClass.QueryPriceFeedPriceStatesResponse.getDescriptor()

  public override val parser: Parser<QueryOuterClass.QueryPriceFeedPriceStatesResponse> =
      QueryOuterClass.QueryPriceFeedPriceStatesResponse.parser()

  public override fun convert(obj: QueryOuterClass.QueryPriceFeedPriceStatesResponse):
      QueryPriceFeedPriceStatesResponse = QueryPriceFeedPriceStatesResponse(
  	priceStates = obj.getPriceStatesList().map { PriceFeedStateJvmConverter.convert(it) },
  )

  public override fun convert(obj: QueryPriceFeedPriceStatesResponse):
      QueryOuterClass.QueryPriceFeedPriceStatesResponse {
    val builder = QueryOuterClass.QueryPriceFeedPriceStatesResponse.newBuilder()
    builder.addAllPriceStates(obj.priceStates.map { PriceFeedStateJvmConverter.convert(it) })
    return builder.build()
  }
}

public object QueryCoinbasePriceStatesRequestJvmConverter :
    ProtobufTypeMapper<QueryCoinbasePriceStatesRequest, QueryOuterClass.QueryCoinbasePriceStatesRequest>
    {
  public override val descriptor: Descriptors.Descriptor =
      QueryOuterClass.QueryCoinbasePriceStatesRequest.getDescriptor()

  public override val parser: Parser<QueryOuterClass.QueryCoinbasePriceStatesRequest> =
      QueryOuterClass.QueryCoinbasePriceStatesRequest.parser()

  public override fun convert(obj: QueryOuterClass.QueryCoinbasePriceStatesRequest):
      QueryCoinbasePriceStatesRequest = QueryCoinbasePriceStatesRequest(
  )

  public override fun convert(obj: QueryCoinbasePriceStatesRequest):
      QueryOuterClass.QueryCoinbasePriceStatesRequest {
    val builder = QueryOuterClass.QueryCoinbasePriceStatesRequest.newBuilder()
    return builder.build()
  }
}

public object QueryCoinbasePriceStatesResponseJvmConverter :
    ProtobufTypeMapper<QueryCoinbasePriceStatesResponse, QueryOuterClass.QueryCoinbasePriceStatesResponse>
    {
  public override val descriptor: Descriptors.Descriptor =
      QueryOuterClass.QueryCoinbasePriceStatesResponse.getDescriptor()

  public override val parser: Parser<QueryOuterClass.QueryCoinbasePriceStatesResponse> =
      QueryOuterClass.QueryCoinbasePriceStatesResponse.parser()

  public override fun convert(obj: QueryOuterClass.QueryCoinbasePriceStatesResponse):
      QueryCoinbasePriceStatesResponse = QueryCoinbasePriceStatesResponse(
  	priceStates = obj.getPriceStatesList().map { CoinbasePriceStateJvmConverter.convert(it) },
  )

  public override fun convert(obj: QueryCoinbasePriceStatesResponse):
      QueryOuterClass.QueryCoinbasePriceStatesResponse {
    val builder = QueryOuterClass.QueryCoinbasePriceStatesResponse.newBuilder()
    builder.addAllPriceStates(obj.priceStates.map { CoinbasePriceStateJvmConverter.convert(it) })
    return builder.build()
  }
}

public object QueryPythPriceStatesRequestJvmConverter :
    ProtobufTypeMapper<QueryPythPriceStatesRequest, QueryOuterClass.QueryPythPriceStatesRequest> {
  public override val descriptor: Descriptors.Descriptor =
      QueryOuterClass.QueryPythPriceStatesRequest.getDescriptor()

  public override val parser: Parser<QueryOuterClass.QueryPythPriceStatesRequest> =
      QueryOuterClass.QueryPythPriceStatesRequest.parser()

  public override fun convert(obj: QueryOuterClass.QueryPythPriceStatesRequest):
      QueryPythPriceStatesRequest = QueryPythPriceStatesRequest(
  )

  public override fun convert(obj: QueryPythPriceStatesRequest):
      QueryOuterClass.QueryPythPriceStatesRequest {
    val builder = QueryOuterClass.QueryPythPriceStatesRequest.newBuilder()
    return builder.build()
  }
}

public object QueryPythPriceStatesResponseJvmConverter :
    ProtobufTypeMapper<QueryPythPriceStatesResponse, QueryOuterClass.QueryPythPriceStatesResponse> {
  public override val descriptor: Descriptors.Descriptor =
      QueryOuterClass.QueryPythPriceStatesResponse.getDescriptor()

  public override val parser: Parser<QueryOuterClass.QueryPythPriceStatesResponse> =
      QueryOuterClass.QueryPythPriceStatesResponse.parser()

  public override fun convert(obj: QueryOuterClass.QueryPythPriceStatesResponse):
      QueryPythPriceStatesResponse = QueryPythPriceStatesResponse(
  	priceStates = obj.getPriceStatesList().map { PythPriceStateJvmConverter.convert(it) },
  )

  public override fun convert(obj: QueryPythPriceStatesResponse):
      QueryOuterClass.QueryPythPriceStatesResponse {
    val builder = QueryOuterClass.QueryPythPriceStatesResponse.newBuilder()
    builder.addAllPriceStates(obj.priceStates.map { PythPriceStateJvmConverter.convert(it) })
    return builder.build()
  }
}

public object QueryProviderPriceStateRequestJvmConverter :
    ProtobufTypeMapper<QueryProviderPriceStateRequest, QueryOuterClass.QueryProviderPriceStateRequest>
    {
  public override val descriptor: Descriptors.Descriptor =
      QueryOuterClass.QueryProviderPriceStateRequest.getDescriptor()

  public override val parser: Parser<QueryOuterClass.QueryProviderPriceStateRequest> =
      QueryOuterClass.QueryProviderPriceStateRequest.parser()

  public override fun convert(obj: QueryOuterClass.QueryProviderPriceStateRequest):
      QueryProviderPriceStateRequest = QueryProviderPriceStateRequest(
  	provider = obj.getProvider(),
  	symbol = obj.getSymbol(),
  )

  public override fun convert(obj: QueryProviderPriceStateRequest):
      QueryOuterClass.QueryProviderPriceStateRequest {
    val builder = QueryOuterClass.QueryProviderPriceStateRequest.newBuilder()
    builder.setProvider(obj.provider)
    builder.setSymbol(obj.symbol)
    return builder.build()
  }
}

public object QueryProviderPriceStateResponseJvmConverter :
    ProtobufTypeMapper<QueryProviderPriceStateResponse, QueryOuterClass.QueryProviderPriceStateResponse>
    {
  public override val descriptor: Descriptors.Descriptor =
      QueryOuterClass.QueryProviderPriceStateResponse.getDescriptor()

  public override val parser: Parser<QueryOuterClass.QueryProviderPriceStateResponse> =
      QueryOuterClass.QueryProviderPriceStateResponse.parser()

  public override fun convert(obj: QueryOuterClass.QueryProviderPriceStateResponse):
      QueryProviderPriceStateResponse = QueryProviderPriceStateResponse(
  	priceState = PriceStateJvmConverter.convert(obj.getPriceState()),
  )

  public override fun convert(obj: QueryProviderPriceStateResponse):
      QueryOuterClass.QueryProviderPriceStateResponse {
    val builder = QueryOuterClass.QueryProviderPriceStateResponse.newBuilder()
    builder.setPriceState(PriceStateJvmConverter.convert(obj.priceState))
    return builder.build()
  }
}

public object QueryModuleStateRequestJvmConverter :
    ProtobufTypeMapper<QueryModuleStateRequest, QueryOuterClass.QueryModuleStateRequest> {
  public override val descriptor: Descriptors.Descriptor =
      QueryOuterClass.QueryModuleStateRequest.getDescriptor()

  public override val parser: Parser<QueryOuterClass.QueryModuleStateRequest> =
      QueryOuterClass.QueryModuleStateRequest.parser()

  public override fun convert(obj: QueryOuterClass.QueryModuleStateRequest): QueryModuleStateRequest
      = QueryModuleStateRequest(
  )

  public override fun convert(obj: QueryModuleStateRequest):
      QueryOuterClass.QueryModuleStateRequest {
    val builder = QueryOuterClass.QueryModuleStateRequest.newBuilder()
    return builder.build()
  }
}

public object QueryModuleStateResponseJvmConverter :
    ProtobufTypeMapper<QueryModuleStateResponse, QueryOuterClass.QueryModuleStateResponse> {
  public override val descriptor: Descriptors.Descriptor =
      QueryOuterClass.QueryModuleStateResponse.getDescriptor()

  public override val parser: Parser<QueryOuterClass.QueryModuleStateResponse> =
      QueryOuterClass.QueryModuleStateResponse.parser()

  public override fun convert(obj: QueryOuterClass.QueryModuleStateResponse):
      QueryModuleStateResponse = QueryModuleStateResponse(
  	state = GenesisStateJvmConverter.convert(obj.getState()),
  )

  public override fun convert(obj: QueryModuleStateResponse):
      QueryOuterClass.QueryModuleStateResponse {
    val builder = QueryOuterClass.QueryModuleStateResponse.newBuilder()
    builder.setState(GenesisStateJvmConverter.convert(obj.state))
    return builder.build()
  }
}

public object QueryHistoricalPriceRecordsRequestJvmConverter :
    ProtobufTypeMapper<QueryHistoricalPriceRecordsRequest, QueryOuterClass.QueryHistoricalPriceRecordsRequest>
    {
  public override val descriptor: Descriptors.Descriptor =
      QueryOuterClass.QueryHistoricalPriceRecordsRequest.getDescriptor()

  public override val parser: Parser<QueryOuterClass.QueryHistoricalPriceRecordsRequest> =
      QueryOuterClass.QueryHistoricalPriceRecordsRequest.parser()

  public override fun convert(obj: QueryOuterClass.QueryHistoricalPriceRecordsRequest):
      QueryHistoricalPriceRecordsRequest = QueryHistoricalPriceRecordsRequest(
  	oracle = OracleType.forNumber(obj.getOracle().number),
  	symbolId = obj.getSymbolId(),
  )

  public override fun convert(obj: QueryHistoricalPriceRecordsRequest):
      QueryOuterClass.QueryHistoricalPriceRecordsRequest {
    val builder = QueryOuterClass.QueryHistoricalPriceRecordsRequest.newBuilder()
    builder.setOracle(Oracle.OracleType.forNumber(obj.oracle.number))
    builder.setSymbolId(obj.symbolId)
    return builder.build()
  }
}

public object QueryHistoricalPriceRecordsResponseJvmConverter :
    ProtobufTypeMapper<QueryHistoricalPriceRecordsResponse, QueryOuterClass.QueryHistoricalPriceRecordsResponse>
    {
  public override val descriptor: Descriptors.Descriptor =
      QueryOuterClass.QueryHistoricalPriceRecordsResponse.getDescriptor()

  public override val parser: Parser<QueryOuterClass.QueryHistoricalPriceRecordsResponse> =
      QueryOuterClass.QueryHistoricalPriceRecordsResponse.parser()

  public override fun convert(obj: QueryOuterClass.QueryHistoricalPriceRecordsResponse):
      QueryHistoricalPriceRecordsResponse = QueryHistoricalPriceRecordsResponse(
  	priceRecords = obj.getPriceRecordsList().map { PriceRecordsJvmConverter.convert(it) },
  )

  public override fun convert(obj: QueryHistoricalPriceRecordsResponse):
      QueryOuterClass.QueryHistoricalPriceRecordsResponse {
    val builder = QueryOuterClass.QueryHistoricalPriceRecordsResponse.newBuilder()
    builder.addAllPriceRecords(obj.priceRecords.map { PriceRecordsJvmConverter.convert(it) })
    return builder.build()
  }
}

public object OracleHistoryOptionsJvmConverter :
    ProtobufTypeMapper<OracleHistoryOptions, QueryOuterClass.OracleHistoryOptions> {
  public override val descriptor: Descriptors.Descriptor =
      QueryOuterClass.OracleHistoryOptions.getDescriptor()

  public override val parser: Parser<QueryOuterClass.OracleHistoryOptions> =
      QueryOuterClass.OracleHistoryOptions.parser()

  public override fun convert(obj: QueryOuterClass.OracleHistoryOptions): OracleHistoryOptions =
      OracleHistoryOptions(
  	maxAge = obj.getMaxAge().asKotlinType,
  	includeRawHistory = obj.getIncludeRawHistory(),
  	includeMetadata = obj.getIncludeMetadata(),
  )

  public override fun convert(obj: OracleHistoryOptions): QueryOuterClass.OracleHistoryOptions {
    val builder = QueryOuterClass.OracleHistoryOptions.newBuilder()
    builder.setMaxAge(obj.maxAge.asJavaType)
    builder.setIncludeRawHistory(obj.includeRawHistory)
    builder.setIncludeMetadata(obj.includeMetadata)
    return builder.build()
  }
}

public object QueryOracleVolatilityRequestJvmConverter :
    ProtobufTypeMapper<QueryOracleVolatilityRequest, QueryOuterClass.QueryOracleVolatilityRequest> {
  public override val descriptor: Descriptors.Descriptor =
      QueryOuterClass.QueryOracleVolatilityRequest.getDescriptor()

  public override val parser: Parser<QueryOuterClass.QueryOracleVolatilityRequest> =
      QueryOuterClass.QueryOracleVolatilityRequest.parser()

  public override fun convert(obj: QueryOuterClass.QueryOracleVolatilityRequest):
      QueryOracleVolatilityRequest = QueryOracleVolatilityRequest(
  	baseInfo = OracleInfoJvmConverter.convert(obj.getBaseInfo()),
  	quoteInfo = OracleInfoJvmConverter.convert(obj.getQuoteInfo()),
  	oracleHistoryOptions = OracleHistoryOptionsJvmConverter.convert(obj.getOracleHistoryOptions()),
  )

  public override fun convert(obj: QueryOracleVolatilityRequest):
      QueryOuterClass.QueryOracleVolatilityRequest {
    val builder = QueryOuterClass.QueryOracleVolatilityRequest.newBuilder()
    builder.setBaseInfo(OracleInfoJvmConverter.convert(obj.baseInfo))
    builder.setQuoteInfo(OracleInfoJvmConverter.convert(obj.quoteInfo))
    builder.setOracleHistoryOptions(OracleHistoryOptionsJvmConverter.convert(obj.oracleHistoryOptions))
    return builder.build()
  }
}

public object QueryOracleVolatilityResponseJvmConverter :
    ProtobufTypeMapper<QueryOracleVolatilityResponse, QueryOuterClass.QueryOracleVolatilityResponse>
    {
  public override val descriptor: Descriptors.Descriptor =
      QueryOuterClass.QueryOracleVolatilityResponse.getDescriptor()

  public override val parser: Parser<QueryOuterClass.QueryOracleVolatilityResponse> =
      QueryOuterClass.QueryOracleVolatilityResponse.parser()

  public override fun convert(obj: QueryOuterClass.QueryOracleVolatilityResponse):
      QueryOracleVolatilityResponse = QueryOracleVolatilityResponse(
  	volatility = obj.getVolatility(),
  	historyMetadata = MetadataStatisticsJvmConverter.convert(obj.getHistoryMetadata()),
  	rawHistory = obj.getRawHistoryList().map { PriceRecordJvmConverter.convert(it) },
  )

  public override fun convert(obj: QueryOracleVolatilityResponse):
      QueryOuterClass.QueryOracleVolatilityResponse {
    val builder = QueryOuterClass.QueryOracleVolatilityResponse.newBuilder()
    builder.setVolatility(obj.volatility)
    builder.setHistoryMetadata(MetadataStatisticsJvmConverter.convert(obj.historyMetadata))
    builder.addAllRawHistory(obj.rawHistory.map { PriceRecordJvmConverter.convert(it) })
    return builder.build()
  }
}

public object QueryOracleProvidersInfoRequestJvmConverter :
    ProtobufTypeMapper<QueryOracleProvidersInfoRequest, QueryOuterClass.QueryOracleProvidersInfoRequest>
    {
  public override val descriptor: Descriptors.Descriptor =
      QueryOuterClass.QueryOracleProvidersInfoRequest.getDescriptor()

  public override val parser: Parser<QueryOuterClass.QueryOracleProvidersInfoRequest> =
      QueryOuterClass.QueryOracleProvidersInfoRequest.parser()

  public override fun convert(obj: QueryOuterClass.QueryOracleProvidersInfoRequest):
      QueryOracleProvidersInfoRequest = QueryOracleProvidersInfoRequest(
  )

  public override fun convert(obj: QueryOracleProvidersInfoRequest):
      QueryOuterClass.QueryOracleProvidersInfoRequest {
    val builder = QueryOuterClass.QueryOracleProvidersInfoRequest.newBuilder()
    return builder.build()
  }
}

public object QueryOracleProvidersInfoResponseJvmConverter :
    ProtobufTypeMapper<QueryOracleProvidersInfoResponse, QueryOuterClass.QueryOracleProvidersInfoResponse>
    {
  public override val descriptor: Descriptors.Descriptor =
      QueryOuterClass.QueryOracleProvidersInfoResponse.getDescriptor()

  public override val parser: Parser<QueryOuterClass.QueryOracleProvidersInfoResponse> =
      QueryOuterClass.QueryOracleProvidersInfoResponse.parser()

  public override fun convert(obj: QueryOuterClass.QueryOracleProvidersInfoResponse):
      QueryOracleProvidersInfoResponse = QueryOracleProvidersInfoResponse(
  	providers = obj.getProvidersList().map { ProviderInfoJvmConverter.convert(it) },
  )

  public override fun convert(obj: QueryOracleProvidersInfoResponse):
      QueryOuterClass.QueryOracleProvidersInfoResponse {
    val builder = QueryOuterClass.QueryOracleProvidersInfoResponse.newBuilder()
    builder.addAllProviders(obj.providers.map { ProviderInfoJvmConverter.convert(it) })
    return builder.build()
  }
}

public object QueryOracleProviderPricesRequestJvmConverter :
    ProtobufTypeMapper<QueryOracleProviderPricesRequest, QueryOuterClass.QueryOracleProviderPricesRequest>
    {
  public override val descriptor: Descriptors.Descriptor =
      QueryOuterClass.QueryOracleProviderPricesRequest.getDescriptor()

  public override val parser: Parser<QueryOuterClass.QueryOracleProviderPricesRequest> =
      QueryOuterClass.QueryOracleProviderPricesRequest.parser()

  public override fun convert(obj: QueryOuterClass.QueryOracleProviderPricesRequest):
      QueryOracleProviderPricesRequest = QueryOracleProviderPricesRequest(
  	provider = obj.getProvider(),
  )

  public override fun convert(obj: QueryOracleProviderPricesRequest):
      QueryOuterClass.QueryOracleProviderPricesRequest {
    val builder = QueryOuterClass.QueryOracleProviderPricesRequest.newBuilder()
    builder.setProvider(obj.provider)
    return builder.build()
  }
}

public object QueryOracleProviderPricesResponseJvmConverter :
    ProtobufTypeMapper<QueryOracleProviderPricesResponse, QueryOuterClass.QueryOracleProviderPricesResponse>
    {
  public override val descriptor: Descriptors.Descriptor =
      QueryOuterClass.QueryOracleProviderPricesResponse.getDescriptor()

  public override val parser: Parser<QueryOuterClass.QueryOracleProviderPricesResponse> =
      QueryOuterClass.QueryOracleProviderPricesResponse.parser()

  public override fun convert(obj: QueryOuterClass.QueryOracleProviderPricesResponse):
      QueryOracleProviderPricesResponse = QueryOracleProviderPricesResponse(
  	providerState = obj.getProviderStateList().map { ProviderStateJvmConverter.convert(it) },
  )

  public override fun convert(obj: QueryOracleProviderPricesResponse):
      QueryOuterClass.QueryOracleProviderPricesResponse {
    val builder = QueryOuterClass.QueryOracleProviderPricesResponse.newBuilder()
    builder.addAllProviderState(obj.providerState.map { ProviderStateJvmConverter.convert(it) })
    return builder.build()
  }
}

public object QueryOraclePriceRequestJvmConverter :
    ProtobufTypeMapper<QueryOraclePriceRequest, QueryOuterClass.QueryOraclePriceRequest> {
  public override val descriptor: Descriptors.Descriptor =
      QueryOuterClass.QueryOraclePriceRequest.getDescriptor()

  public override val parser: Parser<QueryOuterClass.QueryOraclePriceRequest> =
      QueryOuterClass.QueryOraclePriceRequest.parser()

  public override fun convert(obj: QueryOuterClass.QueryOraclePriceRequest): QueryOraclePriceRequest
      = QueryOraclePriceRequest(
  	oracleType = OracleType.forNumber(obj.getOracleType().number),
  	base = obj.getBase(),
  	quote = obj.getQuote(),
  )

  public override fun convert(obj: QueryOraclePriceRequest):
      QueryOuterClass.QueryOraclePriceRequest {
    val builder = QueryOuterClass.QueryOraclePriceRequest.newBuilder()
    builder.setOracleType(Oracle.OracleType.forNumber(obj.oracleType.number))
    builder.setBase(obj.base)
    builder.setQuote(obj.quote)
    return builder.build()
  }
}

public object PricePairStateJvmConverter :
    ProtobufTypeMapper<PricePairState, QueryOuterClass.PricePairState> {
  public override val descriptor: Descriptors.Descriptor =
      QueryOuterClass.PricePairState.getDescriptor()

  public override val parser: Parser<QueryOuterClass.PricePairState> =
      QueryOuterClass.PricePairState.parser()

  public override fun convert(obj: QueryOuterClass.PricePairState): PricePairState = PricePairState(
  	pairPrice = obj.getPairPrice(),
  	basePrice = obj.getBasePrice(),
  	quotePrice = obj.getQuotePrice(),
  	baseCumulativePrice = obj.getBaseCumulativePrice(),
  	quoteCumulativePrice = obj.getQuoteCumulativePrice(),
  	baseTimestamp = obj.getBaseTimestamp(),
  	quoteTimestamp = obj.getQuoteTimestamp(),
  )

  public override fun convert(obj: PricePairState): QueryOuterClass.PricePairState {
    val builder = QueryOuterClass.PricePairState.newBuilder()
    builder.setPairPrice(obj.pairPrice)
    builder.setBasePrice(obj.basePrice)
    builder.setQuotePrice(obj.quotePrice)
    builder.setBaseCumulativePrice(obj.baseCumulativePrice)
    builder.setQuoteCumulativePrice(obj.quoteCumulativePrice)
    builder.setBaseTimestamp(obj.baseTimestamp)
    builder.setQuoteTimestamp(obj.quoteTimestamp)
    return builder.build()
  }
}

public object QueryOraclePriceResponseJvmConverter :
    ProtobufTypeMapper<QueryOraclePriceResponse, QueryOuterClass.QueryOraclePriceResponse> {
  public override val descriptor: Descriptors.Descriptor =
      QueryOuterClass.QueryOraclePriceResponse.getDescriptor()

  public override val parser: Parser<QueryOuterClass.QueryOraclePriceResponse> =
      QueryOuterClass.QueryOraclePriceResponse.parser()

  public override fun convert(obj: QueryOuterClass.QueryOraclePriceResponse):
      QueryOraclePriceResponse = QueryOraclePriceResponse(
  	pricePairState = PricePairStateJvmConverter.convert(obj.getPricePairState()),
  )

  public override fun convert(obj: QueryOraclePriceResponse):
      QueryOuterClass.QueryOraclePriceResponse {
    val builder = QueryOuterClass.QueryOraclePriceResponse.newBuilder()
    builder.setPricePairState(PricePairStateJvmConverter.convert(obj.pricePairState))
    return builder.build()
  }
}
