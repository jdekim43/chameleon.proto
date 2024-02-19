// Transform from injective/oracle/v1beta1/query.proto
@file:GeneratorVersion(version = "0.3.1")

package injective.oracle.v1beta1

import google.protobuf.Any
import java.lang.IllegalStateException
import kr.jadekim.protobuf.`annotation`.GeneratorVersion
import kr.jadekim.protobuf.converter.ProtobufConverter
import kr.jadekim.protobuf.converter.parseProtobuf

public expect object QueryPythPriceRequestConverter : ProtobufConverter<QueryPythPriceRequest>

public fun QueryPythPriceRequest.toAny(): Any = Any(QueryPythPriceRequest.TYPE_URL,
    with(QueryPythPriceRequestConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<QueryPythPriceRequest>): QueryPythPriceRequest {
  if (typeUrl != QueryPythPriceRequest.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object QueryPythPriceResponseConverter : ProtobufConverter<QueryPythPriceResponse>

public fun QueryPythPriceResponse.toAny(): Any = Any(QueryPythPriceResponse.TYPE_URL,
    with(QueryPythPriceResponseConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<QueryPythPriceResponse>): QueryPythPriceResponse {
  if (typeUrl != QueryPythPriceResponse.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object QueryParamsRequestConverter : ProtobufConverter<QueryParamsRequest>

public fun QueryParamsRequest.toAny(): Any = Any(QueryParamsRequest.TYPE_URL,
    with(QueryParamsRequestConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<QueryParamsRequest>): QueryParamsRequest {
  if (typeUrl != QueryParamsRequest.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object QueryParamsResponseConverter : ProtobufConverter<QueryParamsResponse>

public fun QueryParamsResponse.toAny(): Any = Any(QueryParamsResponse.TYPE_URL,
    with(QueryParamsResponseConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<QueryParamsResponse>): QueryParamsResponse {
  if (typeUrl != QueryParamsResponse.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object QueryBandRelayersRequestConverter : ProtobufConverter<QueryBandRelayersRequest>

public fun QueryBandRelayersRequest.toAny(): Any = Any(QueryBandRelayersRequest.TYPE_URL,
    with(QueryBandRelayersRequestConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<QueryBandRelayersRequest>):
    QueryBandRelayersRequest {
  if (typeUrl != QueryBandRelayersRequest.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object QueryBandRelayersResponseConverter :
    ProtobufConverter<QueryBandRelayersResponse>

public fun QueryBandRelayersResponse.toAny(): Any = Any(QueryBandRelayersResponse.TYPE_URL,
    with(QueryBandRelayersResponseConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<QueryBandRelayersResponse>):
    QueryBandRelayersResponse {
  if (typeUrl != QueryBandRelayersResponse.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object QueryBandPriceStatesRequestConverter :
    ProtobufConverter<QueryBandPriceStatesRequest>

public fun QueryBandPriceStatesRequest.toAny(): Any = Any(QueryBandPriceStatesRequest.TYPE_URL,
    with(QueryBandPriceStatesRequestConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<QueryBandPriceStatesRequest>):
    QueryBandPriceStatesRequest {
  if (typeUrl != QueryBandPriceStatesRequest.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object QueryBandPriceStatesResponseConverter :
    ProtobufConverter<QueryBandPriceStatesResponse>

public fun QueryBandPriceStatesResponse.toAny(): Any = Any(QueryBandPriceStatesResponse.TYPE_URL,
    with(QueryBandPriceStatesResponseConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<QueryBandPriceStatesResponse>):
    QueryBandPriceStatesResponse {
  if (typeUrl != QueryBandPriceStatesResponse.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object QueryBandIBCPriceStatesRequestConverter :
    ProtobufConverter<QueryBandIBCPriceStatesRequest>

public fun QueryBandIBCPriceStatesRequest.toAny(): Any =
    Any(QueryBandIBCPriceStatesRequest.TYPE_URL, with(QueryBandIBCPriceStatesRequestConverter) {
    toByteArray() })

public fun Any.parse(converter: ProtobufConverter<QueryBandIBCPriceStatesRequest>):
    QueryBandIBCPriceStatesRequest {
  if (typeUrl != QueryBandIBCPriceStatesRequest.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object QueryBandIBCPriceStatesResponseConverter :
    ProtobufConverter<QueryBandIBCPriceStatesResponse>

public fun QueryBandIBCPriceStatesResponse.toAny(): Any =
    Any(QueryBandIBCPriceStatesResponse.TYPE_URL, with(QueryBandIBCPriceStatesResponseConverter) {
    toByteArray() })

public fun Any.parse(converter: ProtobufConverter<QueryBandIBCPriceStatesResponse>):
    QueryBandIBCPriceStatesResponse {
  if (typeUrl != QueryBandIBCPriceStatesResponse.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object QueryPriceFeedPriceStatesRequestConverter :
    ProtobufConverter<QueryPriceFeedPriceStatesRequest>

public fun QueryPriceFeedPriceStatesRequest.toAny(): Any =
    Any(QueryPriceFeedPriceStatesRequest.TYPE_URL, with(QueryPriceFeedPriceStatesRequestConverter) {
    toByteArray() })

public fun Any.parse(converter: ProtobufConverter<QueryPriceFeedPriceStatesRequest>):
    QueryPriceFeedPriceStatesRequest {
  if (typeUrl != QueryPriceFeedPriceStatesRequest.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object QueryPriceFeedPriceStatesResponseConverter :
    ProtobufConverter<QueryPriceFeedPriceStatesResponse>

public fun QueryPriceFeedPriceStatesResponse.toAny(): Any =
    Any(QueryPriceFeedPriceStatesResponse.TYPE_URL, with(QueryPriceFeedPriceStatesResponseConverter)
    { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<QueryPriceFeedPriceStatesResponse>):
    QueryPriceFeedPriceStatesResponse {
  if (typeUrl != QueryPriceFeedPriceStatesResponse.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object QueryCoinbasePriceStatesRequestConverter :
    ProtobufConverter<QueryCoinbasePriceStatesRequest>

public fun QueryCoinbasePriceStatesRequest.toAny(): Any =
    Any(QueryCoinbasePriceStatesRequest.TYPE_URL, with(QueryCoinbasePriceStatesRequestConverter) {
    toByteArray() })

public fun Any.parse(converter: ProtobufConverter<QueryCoinbasePriceStatesRequest>):
    QueryCoinbasePriceStatesRequest {
  if (typeUrl != QueryCoinbasePriceStatesRequest.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object QueryCoinbasePriceStatesResponseConverter :
    ProtobufConverter<QueryCoinbasePriceStatesResponse>

public fun QueryCoinbasePriceStatesResponse.toAny(): Any =
    Any(QueryCoinbasePriceStatesResponse.TYPE_URL, with(QueryCoinbasePriceStatesResponseConverter) {
    toByteArray() })

public fun Any.parse(converter: ProtobufConverter<QueryCoinbasePriceStatesResponse>):
    QueryCoinbasePriceStatesResponse {
  if (typeUrl != QueryCoinbasePriceStatesResponse.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object QueryPythPriceStatesRequestConverter :
    ProtobufConverter<QueryPythPriceStatesRequest>

public fun QueryPythPriceStatesRequest.toAny(): Any = Any(QueryPythPriceStatesRequest.TYPE_URL,
    with(QueryPythPriceStatesRequestConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<QueryPythPriceStatesRequest>):
    QueryPythPriceStatesRequest {
  if (typeUrl != QueryPythPriceStatesRequest.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object QueryPythPriceStatesResponseConverter :
    ProtobufConverter<QueryPythPriceStatesResponse>

public fun QueryPythPriceStatesResponse.toAny(): Any = Any(QueryPythPriceStatesResponse.TYPE_URL,
    with(QueryPythPriceStatesResponseConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<QueryPythPriceStatesResponse>):
    QueryPythPriceStatesResponse {
  if (typeUrl != QueryPythPriceStatesResponse.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object QueryProviderPriceStateRequestConverter :
    ProtobufConverter<QueryProviderPriceStateRequest>

public fun QueryProviderPriceStateRequest.toAny(): Any =
    Any(QueryProviderPriceStateRequest.TYPE_URL, with(QueryProviderPriceStateRequestConverter) {
    toByteArray() })

public fun Any.parse(converter: ProtobufConverter<QueryProviderPriceStateRequest>):
    QueryProviderPriceStateRequest {
  if (typeUrl != QueryProviderPriceStateRequest.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object QueryProviderPriceStateResponseConverter :
    ProtobufConverter<QueryProviderPriceStateResponse>

public fun QueryProviderPriceStateResponse.toAny(): Any =
    Any(QueryProviderPriceStateResponse.TYPE_URL, with(QueryProviderPriceStateResponseConverter) {
    toByteArray() })

public fun Any.parse(converter: ProtobufConverter<QueryProviderPriceStateResponse>):
    QueryProviderPriceStateResponse {
  if (typeUrl != QueryProviderPriceStateResponse.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object QueryModuleStateRequestConverter : ProtobufConverter<QueryModuleStateRequest>

public fun QueryModuleStateRequest.toAny(): Any = Any(QueryModuleStateRequest.TYPE_URL,
    with(QueryModuleStateRequestConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<QueryModuleStateRequest>):
    QueryModuleStateRequest {
  if (typeUrl != QueryModuleStateRequest.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object QueryModuleStateResponseConverter : ProtobufConverter<QueryModuleStateResponse>

public fun QueryModuleStateResponse.toAny(): Any = Any(QueryModuleStateResponse.TYPE_URL,
    with(QueryModuleStateResponseConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<QueryModuleStateResponse>):
    QueryModuleStateResponse {
  if (typeUrl != QueryModuleStateResponse.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object QueryHistoricalPriceRecordsRequestConverter :
    ProtobufConverter<QueryHistoricalPriceRecordsRequest>

public fun QueryHistoricalPriceRecordsRequest.toAny(): Any =
    Any(QueryHistoricalPriceRecordsRequest.TYPE_URL,
    with(QueryHistoricalPriceRecordsRequestConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<QueryHistoricalPriceRecordsRequest>):
    QueryHistoricalPriceRecordsRequest {
  if (typeUrl != QueryHistoricalPriceRecordsRequest.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object QueryHistoricalPriceRecordsResponseConverter :
    ProtobufConverter<QueryHistoricalPriceRecordsResponse>

public fun QueryHistoricalPriceRecordsResponse.toAny(): Any =
    Any(QueryHistoricalPriceRecordsResponse.TYPE_URL,
    with(QueryHistoricalPriceRecordsResponseConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<QueryHistoricalPriceRecordsResponse>):
    QueryHistoricalPriceRecordsResponse {
  if (typeUrl != QueryHistoricalPriceRecordsResponse.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object OracleHistoryOptionsConverter : ProtobufConverter<OracleHistoryOptions>

public fun OracleHistoryOptions.toAny(): Any = Any(OracleHistoryOptions.TYPE_URL,
    with(OracleHistoryOptionsConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<OracleHistoryOptions>): OracleHistoryOptions {
  if (typeUrl != OracleHistoryOptions.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object QueryOracleVolatilityRequestConverter :
    ProtobufConverter<QueryOracleVolatilityRequest>

public fun QueryOracleVolatilityRequest.toAny(): Any = Any(QueryOracleVolatilityRequest.TYPE_URL,
    with(QueryOracleVolatilityRequestConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<QueryOracleVolatilityRequest>):
    QueryOracleVolatilityRequest {
  if (typeUrl != QueryOracleVolatilityRequest.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object QueryOracleVolatilityResponseConverter :
    ProtobufConverter<QueryOracleVolatilityResponse>

public fun QueryOracleVolatilityResponse.toAny(): Any = Any(QueryOracleVolatilityResponse.TYPE_URL,
    with(QueryOracleVolatilityResponseConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<QueryOracleVolatilityResponse>):
    QueryOracleVolatilityResponse {
  if (typeUrl != QueryOracleVolatilityResponse.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object QueryOracleProvidersInfoRequestConverter :
    ProtobufConverter<QueryOracleProvidersInfoRequest>

public fun QueryOracleProvidersInfoRequest.toAny(): Any =
    Any(QueryOracleProvidersInfoRequest.TYPE_URL, with(QueryOracleProvidersInfoRequestConverter) {
    toByteArray() })

public fun Any.parse(converter: ProtobufConverter<QueryOracleProvidersInfoRequest>):
    QueryOracleProvidersInfoRequest {
  if (typeUrl != QueryOracleProvidersInfoRequest.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object QueryOracleProvidersInfoResponseConverter :
    ProtobufConverter<QueryOracleProvidersInfoResponse>

public fun QueryOracleProvidersInfoResponse.toAny(): Any =
    Any(QueryOracleProvidersInfoResponse.TYPE_URL, with(QueryOracleProvidersInfoResponseConverter) {
    toByteArray() })

public fun Any.parse(converter: ProtobufConverter<QueryOracleProvidersInfoResponse>):
    QueryOracleProvidersInfoResponse {
  if (typeUrl != QueryOracleProvidersInfoResponse.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object QueryOracleProviderPricesRequestConverter :
    ProtobufConverter<QueryOracleProviderPricesRequest>

public fun QueryOracleProviderPricesRequest.toAny(): Any =
    Any(QueryOracleProviderPricesRequest.TYPE_URL, with(QueryOracleProviderPricesRequestConverter) {
    toByteArray() })

public fun Any.parse(converter: ProtobufConverter<QueryOracleProviderPricesRequest>):
    QueryOracleProviderPricesRequest {
  if (typeUrl != QueryOracleProviderPricesRequest.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object QueryOracleProviderPricesResponseConverter :
    ProtobufConverter<QueryOracleProviderPricesResponse>

public fun QueryOracleProviderPricesResponse.toAny(): Any =
    Any(QueryOracleProviderPricesResponse.TYPE_URL, with(QueryOracleProviderPricesResponseConverter)
    { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<QueryOracleProviderPricesResponse>):
    QueryOracleProviderPricesResponse {
  if (typeUrl != QueryOracleProviderPricesResponse.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object QueryOraclePriceRequestConverter : ProtobufConverter<QueryOraclePriceRequest>

public fun QueryOraclePriceRequest.toAny(): Any = Any(QueryOraclePriceRequest.TYPE_URL,
    with(QueryOraclePriceRequestConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<QueryOraclePriceRequest>):
    QueryOraclePriceRequest {
  if (typeUrl != QueryOraclePriceRequest.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object PricePairStateConverter : ProtobufConverter<PricePairState>

public fun PricePairState.toAny(): Any = Any(PricePairState.TYPE_URL, with(PricePairStateConverter)
    { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<PricePairState>): PricePairState {
  if (typeUrl != PricePairState.TYPE_URL) throw IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object QueryOraclePriceResponseConverter : ProtobufConverter<QueryOraclePriceResponse>

public fun QueryOraclePriceResponse.toAny(): Any = Any(QueryOraclePriceResponse.TYPE_URL,
    with(QueryOraclePriceResponseConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<QueryOraclePriceResponse>):
    QueryOraclePriceResponse {
  if (typeUrl != QueryOraclePriceResponse.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}
