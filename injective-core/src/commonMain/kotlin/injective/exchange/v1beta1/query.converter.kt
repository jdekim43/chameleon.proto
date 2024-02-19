// Transform from injective/exchange/v1beta1/query.proto
@file:GeneratorVersion(version = "0.3.1")

package injective.exchange.v1beta1

import google.protobuf.Any
import java.lang.IllegalStateException
import kr.jadekim.protobuf.`annotation`.GeneratorVersion
import kr.jadekim.protobuf.converter.ProtobufConverter
import kr.jadekim.protobuf.converter.parseProtobuf

public expect object SubaccountConverter : ProtobufConverter<Subaccount>

public fun Subaccount.toAny(): Any = Any(Subaccount.TYPE_URL, with(SubaccountConverter) {
    toByteArray() })

public fun Any.parse(converter: ProtobufConverter<Subaccount>): Subaccount {
  if (typeUrl != Subaccount.TYPE_URL) throw IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object QuerySubaccountOrdersRequestConverter :
    ProtobufConverter<QuerySubaccountOrdersRequest>

public fun QuerySubaccountOrdersRequest.toAny(): Any = Any(QuerySubaccountOrdersRequest.TYPE_URL,
    with(QuerySubaccountOrdersRequestConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<QuerySubaccountOrdersRequest>):
    QuerySubaccountOrdersRequest {
  if (typeUrl != QuerySubaccountOrdersRequest.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object QuerySubaccountOrdersResponseConverter :
    ProtobufConverter<QuerySubaccountOrdersResponse>

public fun QuerySubaccountOrdersResponse.toAny(): Any = Any(QuerySubaccountOrdersResponse.TYPE_URL,
    with(QuerySubaccountOrdersResponseConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<QuerySubaccountOrdersResponse>):
    QuerySubaccountOrdersResponse {
  if (typeUrl != QuerySubaccountOrdersResponse.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object SubaccountOrderbookMetadataWithMarketConverter :
    ProtobufConverter<SubaccountOrderbookMetadataWithMarket>

public fun SubaccountOrderbookMetadataWithMarket.toAny(): Any =
    Any(SubaccountOrderbookMetadataWithMarket.TYPE_URL,
    with(SubaccountOrderbookMetadataWithMarketConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<SubaccountOrderbookMetadataWithMarket>):
    SubaccountOrderbookMetadataWithMarket {
  if (typeUrl != SubaccountOrderbookMetadataWithMarket.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object QueryExchangeParamsRequestConverter :
    ProtobufConverter<QueryExchangeParamsRequest>

public fun QueryExchangeParamsRequest.toAny(): Any = Any(QueryExchangeParamsRequest.TYPE_URL,
    with(QueryExchangeParamsRequestConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<QueryExchangeParamsRequest>):
    QueryExchangeParamsRequest {
  if (typeUrl != QueryExchangeParamsRequest.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object QueryExchangeParamsResponseConverter :
    ProtobufConverter<QueryExchangeParamsResponse>

public fun QueryExchangeParamsResponse.toAny(): Any = Any(QueryExchangeParamsResponse.TYPE_URL,
    with(QueryExchangeParamsResponseConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<QueryExchangeParamsResponse>):
    QueryExchangeParamsResponse {
  if (typeUrl != QueryExchangeParamsResponse.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object QuerySubaccountDepositsRequestConverter :
    ProtobufConverter<QuerySubaccountDepositsRequest>

public fun QuerySubaccountDepositsRequest.toAny(): Any =
    Any(QuerySubaccountDepositsRequest.TYPE_URL, with(QuerySubaccountDepositsRequestConverter) {
    toByteArray() })

public fun Any.parse(converter: ProtobufConverter<QuerySubaccountDepositsRequest>):
    QuerySubaccountDepositsRequest {
  if (typeUrl != QuerySubaccountDepositsRequest.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object QuerySubaccountDepositsResponseConverter :
    ProtobufConverter<QuerySubaccountDepositsResponse>

public fun QuerySubaccountDepositsResponse.toAny(): Any =
    Any(QuerySubaccountDepositsResponse.TYPE_URL, with(QuerySubaccountDepositsResponseConverter) {
    toByteArray() })

public fun Any.parse(converter: ProtobufConverter<QuerySubaccountDepositsResponse>):
    QuerySubaccountDepositsResponse {
  if (typeUrl != QuerySubaccountDepositsResponse.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object QueryExchangeBalancesRequestConverter :
    ProtobufConverter<QueryExchangeBalancesRequest>

public fun QueryExchangeBalancesRequest.toAny(): Any = Any(QueryExchangeBalancesRequest.TYPE_URL,
    with(QueryExchangeBalancesRequestConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<QueryExchangeBalancesRequest>):
    QueryExchangeBalancesRequest {
  if (typeUrl != QueryExchangeBalancesRequest.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object QueryExchangeBalancesResponseConverter :
    ProtobufConverter<QueryExchangeBalancesResponse>

public fun QueryExchangeBalancesResponse.toAny(): Any = Any(QueryExchangeBalancesResponse.TYPE_URL,
    with(QueryExchangeBalancesResponseConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<QueryExchangeBalancesResponse>):
    QueryExchangeBalancesResponse {
  if (typeUrl != QueryExchangeBalancesResponse.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object QueryAggregateVolumeRequestConverter :
    ProtobufConverter<QueryAggregateVolumeRequest>

public fun QueryAggregateVolumeRequest.toAny(): Any = Any(QueryAggregateVolumeRequest.TYPE_URL,
    with(QueryAggregateVolumeRequestConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<QueryAggregateVolumeRequest>):
    QueryAggregateVolumeRequest {
  if (typeUrl != QueryAggregateVolumeRequest.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object QueryAggregateVolumeResponseConverter :
    ProtobufConverter<QueryAggregateVolumeResponse>

public fun QueryAggregateVolumeResponse.toAny(): Any = Any(QueryAggregateVolumeResponse.TYPE_URL,
    with(QueryAggregateVolumeResponseConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<QueryAggregateVolumeResponse>):
    QueryAggregateVolumeResponse {
  if (typeUrl != QueryAggregateVolumeResponse.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object QueryAggregateVolumesRequestConverter :
    ProtobufConverter<QueryAggregateVolumesRequest>

public fun QueryAggregateVolumesRequest.toAny(): Any = Any(QueryAggregateVolumesRequest.TYPE_URL,
    with(QueryAggregateVolumesRequestConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<QueryAggregateVolumesRequest>):
    QueryAggregateVolumesRequest {
  if (typeUrl != QueryAggregateVolumesRequest.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object QueryAggregateVolumesResponseConverter :
    ProtobufConverter<QueryAggregateVolumesResponse>

public fun QueryAggregateVolumesResponse.toAny(): Any = Any(QueryAggregateVolumesResponse.TYPE_URL,
    with(QueryAggregateVolumesResponseConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<QueryAggregateVolumesResponse>):
    QueryAggregateVolumesResponse {
  if (typeUrl != QueryAggregateVolumesResponse.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object QueryAggregateMarketVolumeRequestConverter :
    ProtobufConverter<QueryAggregateMarketVolumeRequest>

public fun QueryAggregateMarketVolumeRequest.toAny(): Any =
    Any(QueryAggregateMarketVolumeRequest.TYPE_URL, with(QueryAggregateMarketVolumeRequestConverter)
    { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<QueryAggregateMarketVolumeRequest>):
    QueryAggregateMarketVolumeRequest {
  if (typeUrl != QueryAggregateMarketVolumeRequest.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object QueryAggregateMarketVolumeResponseConverter :
    ProtobufConverter<QueryAggregateMarketVolumeResponse>

public fun QueryAggregateMarketVolumeResponse.toAny(): Any =
    Any(QueryAggregateMarketVolumeResponse.TYPE_URL,
    with(QueryAggregateMarketVolumeResponseConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<QueryAggregateMarketVolumeResponse>):
    QueryAggregateMarketVolumeResponse {
  if (typeUrl != QueryAggregateMarketVolumeResponse.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object QueryDenomDecimalRequestConverter : ProtobufConverter<QueryDenomDecimalRequest>

public fun QueryDenomDecimalRequest.toAny(): Any = Any(QueryDenomDecimalRequest.TYPE_URL,
    with(QueryDenomDecimalRequestConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<QueryDenomDecimalRequest>):
    QueryDenomDecimalRequest {
  if (typeUrl != QueryDenomDecimalRequest.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object QueryDenomDecimalResponseConverter :
    ProtobufConverter<QueryDenomDecimalResponse>

public fun QueryDenomDecimalResponse.toAny(): Any = Any(QueryDenomDecimalResponse.TYPE_URL,
    with(QueryDenomDecimalResponseConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<QueryDenomDecimalResponse>):
    QueryDenomDecimalResponse {
  if (typeUrl != QueryDenomDecimalResponse.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object QueryDenomDecimalsRequestConverter :
    ProtobufConverter<QueryDenomDecimalsRequest>

public fun QueryDenomDecimalsRequest.toAny(): Any = Any(QueryDenomDecimalsRequest.TYPE_URL,
    with(QueryDenomDecimalsRequestConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<QueryDenomDecimalsRequest>):
    QueryDenomDecimalsRequest {
  if (typeUrl != QueryDenomDecimalsRequest.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object QueryDenomDecimalsResponseConverter :
    ProtobufConverter<QueryDenomDecimalsResponse>

public fun QueryDenomDecimalsResponse.toAny(): Any = Any(QueryDenomDecimalsResponse.TYPE_URL,
    with(QueryDenomDecimalsResponseConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<QueryDenomDecimalsResponse>):
    QueryDenomDecimalsResponse {
  if (typeUrl != QueryDenomDecimalsResponse.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object QueryAggregateMarketVolumesRequestConverter :
    ProtobufConverter<QueryAggregateMarketVolumesRequest>

public fun QueryAggregateMarketVolumesRequest.toAny(): Any =
    Any(QueryAggregateMarketVolumesRequest.TYPE_URL,
    with(QueryAggregateMarketVolumesRequestConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<QueryAggregateMarketVolumesRequest>):
    QueryAggregateMarketVolumesRequest {
  if (typeUrl != QueryAggregateMarketVolumesRequest.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object QueryAggregateMarketVolumesResponseConverter :
    ProtobufConverter<QueryAggregateMarketVolumesResponse>

public fun QueryAggregateMarketVolumesResponse.toAny(): Any =
    Any(QueryAggregateMarketVolumesResponse.TYPE_URL,
    with(QueryAggregateMarketVolumesResponseConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<QueryAggregateMarketVolumesResponse>):
    QueryAggregateMarketVolumesResponse {
  if (typeUrl != QueryAggregateMarketVolumesResponse.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object QuerySubaccountDepositRequestConverter :
    ProtobufConverter<QuerySubaccountDepositRequest>

public fun QuerySubaccountDepositRequest.toAny(): Any = Any(QuerySubaccountDepositRequest.TYPE_URL,
    with(QuerySubaccountDepositRequestConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<QuerySubaccountDepositRequest>):
    QuerySubaccountDepositRequest {
  if (typeUrl != QuerySubaccountDepositRequest.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object QuerySubaccountDepositResponseConverter :
    ProtobufConverter<QuerySubaccountDepositResponse>

public fun QuerySubaccountDepositResponse.toAny(): Any =
    Any(QuerySubaccountDepositResponse.TYPE_URL, with(QuerySubaccountDepositResponseConverter) {
    toByteArray() })

public fun Any.parse(converter: ProtobufConverter<QuerySubaccountDepositResponse>):
    QuerySubaccountDepositResponse {
  if (typeUrl != QuerySubaccountDepositResponse.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object QuerySpotMarketsRequestConverter : ProtobufConverter<QuerySpotMarketsRequest>

public fun QuerySpotMarketsRequest.toAny(): Any = Any(QuerySpotMarketsRequest.TYPE_URL,
    with(QuerySpotMarketsRequestConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<QuerySpotMarketsRequest>):
    QuerySpotMarketsRequest {
  if (typeUrl != QuerySpotMarketsRequest.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object QuerySpotMarketsResponseConverter : ProtobufConverter<QuerySpotMarketsResponse>

public fun QuerySpotMarketsResponse.toAny(): Any = Any(QuerySpotMarketsResponse.TYPE_URL,
    with(QuerySpotMarketsResponseConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<QuerySpotMarketsResponse>):
    QuerySpotMarketsResponse {
  if (typeUrl != QuerySpotMarketsResponse.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object QuerySpotMarketRequestConverter : ProtobufConverter<QuerySpotMarketRequest>

public fun QuerySpotMarketRequest.toAny(): Any = Any(QuerySpotMarketRequest.TYPE_URL,
    with(QuerySpotMarketRequestConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<QuerySpotMarketRequest>): QuerySpotMarketRequest {
  if (typeUrl != QuerySpotMarketRequest.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object QuerySpotMarketResponseConverter : ProtobufConverter<QuerySpotMarketResponse>

public fun QuerySpotMarketResponse.toAny(): Any = Any(QuerySpotMarketResponse.TYPE_URL,
    with(QuerySpotMarketResponseConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<QuerySpotMarketResponse>):
    QuerySpotMarketResponse {
  if (typeUrl != QuerySpotMarketResponse.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object QuerySpotOrderbookRequestConverter :
    ProtobufConverter<QuerySpotOrderbookRequest>

public fun QuerySpotOrderbookRequest.toAny(): Any = Any(QuerySpotOrderbookRequest.TYPE_URL,
    with(QuerySpotOrderbookRequestConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<QuerySpotOrderbookRequest>):
    QuerySpotOrderbookRequest {
  if (typeUrl != QuerySpotOrderbookRequest.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object QuerySpotOrderbookResponseConverter :
    ProtobufConverter<QuerySpotOrderbookResponse>

public fun QuerySpotOrderbookResponse.toAny(): Any = Any(QuerySpotOrderbookResponse.TYPE_URL,
    with(QuerySpotOrderbookResponseConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<QuerySpotOrderbookResponse>):
    QuerySpotOrderbookResponse {
  if (typeUrl != QuerySpotOrderbookResponse.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object FullSpotMarketConverter : ProtobufConverter<FullSpotMarket>

public fun FullSpotMarket.toAny(): Any = Any(FullSpotMarket.TYPE_URL, with(FullSpotMarketConverter)
    { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<FullSpotMarket>): FullSpotMarket {
  if (typeUrl != FullSpotMarket.TYPE_URL) throw IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object QueryFullSpotMarketsRequestConverter :
    ProtobufConverter<QueryFullSpotMarketsRequest>

public fun QueryFullSpotMarketsRequest.toAny(): Any = Any(QueryFullSpotMarketsRequest.TYPE_URL,
    with(QueryFullSpotMarketsRequestConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<QueryFullSpotMarketsRequest>):
    QueryFullSpotMarketsRequest {
  if (typeUrl != QueryFullSpotMarketsRequest.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object QueryFullSpotMarketsResponseConverter :
    ProtobufConverter<QueryFullSpotMarketsResponse>

public fun QueryFullSpotMarketsResponse.toAny(): Any = Any(QueryFullSpotMarketsResponse.TYPE_URL,
    with(QueryFullSpotMarketsResponseConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<QueryFullSpotMarketsResponse>):
    QueryFullSpotMarketsResponse {
  if (typeUrl != QueryFullSpotMarketsResponse.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object QueryFullSpotMarketRequestConverter :
    ProtobufConverter<QueryFullSpotMarketRequest>

public fun QueryFullSpotMarketRequest.toAny(): Any = Any(QueryFullSpotMarketRequest.TYPE_URL,
    with(QueryFullSpotMarketRequestConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<QueryFullSpotMarketRequest>):
    QueryFullSpotMarketRequest {
  if (typeUrl != QueryFullSpotMarketRequest.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object QueryFullSpotMarketResponseConverter :
    ProtobufConverter<QueryFullSpotMarketResponse>

public fun QueryFullSpotMarketResponse.toAny(): Any = Any(QueryFullSpotMarketResponse.TYPE_URL,
    with(QueryFullSpotMarketResponseConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<QueryFullSpotMarketResponse>):
    QueryFullSpotMarketResponse {
  if (typeUrl != QueryFullSpotMarketResponse.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object QuerySpotOrdersByHashesRequestConverter :
    ProtobufConverter<QuerySpotOrdersByHashesRequest>

public fun QuerySpotOrdersByHashesRequest.toAny(): Any =
    Any(QuerySpotOrdersByHashesRequest.TYPE_URL, with(QuerySpotOrdersByHashesRequestConverter) {
    toByteArray() })

public fun Any.parse(converter: ProtobufConverter<QuerySpotOrdersByHashesRequest>):
    QuerySpotOrdersByHashesRequest {
  if (typeUrl != QuerySpotOrdersByHashesRequest.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object QuerySpotOrdersByHashesResponseConverter :
    ProtobufConverter<QuerySpotOrdersByHashesResponse>

public fun QuerySpotOrdersByHashesResponse.toAny(): Any =
    Any(QuerySpotOrdersByHashesResponse.TYPE_URL, with(QuerySpotOrdersByHashesResponseConverter) {
    toByteArray() })

public fun Any.parse(converter: ProtobufConverter<QuerySpotOrdersByHashesResponse>):
    QuerySpotOrdersByHashesResponse {
  if (typeUrl != QuerySpotOrdersByHashesResponse.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object QueryTraderSpotOrdersRequestConverter :
    ProtobufConverter<QueryTraderSpotOrdersRequest>

public fun QueryTraderSpotOrdersRequest.toAny(): Any = Any(QueryTraderSpotOrdersRequest.TYPE_URL,
    with(QueryTraderSpotOrdersRequestConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<QueryTraderSpotOrdersRequest>):
    QueryTraderSpotOrdersRequest {
  if (typeUrl != QueryTraderSpotOrdersRequest.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object QueryAccountAddressSpotOrdersRequestConverter :
    ProtobufConverter<QueryAccountAddressSpotOrdersRequest>

public fun QueryAccountAddressSpotOrdersRequest.toAny(): Any =
    Any(QueryAccountAddressSpotOrdersRequest.TYPE_URL,
    with(QueryAccountAddressSpotOrdersRequestConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<QueryAccountAddressSpotOrdersRequest>):
    QueryAccountAddressSpotOrdersRequest {
  if (typeUrl != QueryAccountAddressSpotOrdersRequest.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object TrimmedSpotLimitOrderConverter : ProtobufConverter<TrimmedSpotLimitOrder>

public fun TrimmedSpotLimitOrder.toAny(): Any = Any(TrimmedSpotLimitOrder.TYPE_URL,
    with(TrimmedSpotLimitOrderConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<TrimmedSpotLimitOrder>): TrimmedSpotLimitOrder {
  if (typeUrl != TrimmedSpotLimitOrder.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object QueryTraderSpotOrdersResponseConverter :
    ProtobufConverter<QueryTraderSpotOrdersResponse>

public fun QueryTraderSpotOrdersResponse.toAny(): Any = Any(QueryTraderSpotOrdersResponse.TYPE_URL,
    with(QueryTraderSpotOrdersResponseConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<QueryTraderSpotOrdersResponse>):
    QueryTraderSpotOrdersResponse {
  if (typeUrl != QueryTraderSpotOrdersResponse.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object QueryAccountAddressSpotOrdersResponseConverter :
    ProtobufConverter<QueryAccountAddressSpotOrdersResponse>

public fun QueryAccountAddressSpotOrdersResponse.toAny(): Any =
    Any(QueryAccountAddressSpotOrdersResponse.TYPE_URL,
    with(QueryAccountAddressSpotOrdersResponseConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<QueryAccountAddressSpotOrdersResponse>):
    QueryAccountAddressSpotOrdersResponse {
  if (typeUrl != QueryAccountAddressSpotOrdersResponse.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object QuerySpotMidPriceAndTOBRequestConverter :
    ProtobufConverter<QuerySpotMidPriceAndTOBRequest>

public fun QuerySpotMidPriceAndTOBRequest.toAny(): Any =
    Any(QuerySpotMidPriceAndTOBRequest.TYPE_URL, with(QuerySpotMidPriceAndTOBRequestConverter) {
    toByteArray() })

public fun Any.parse(converter: ProtobufConverter<QuerySpotMidPriceAndTOBRequest>):
    QuerySpotMidPriceAndTOBRequest {
  if (typeUrl != QuerySpotMidPriceAndTOBRequest.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object QuerySpotMidPriceAndTOBResponseConverter :
    ProtobufConverter<QuerySpotMidPriceAndTOBResponse>

public fun QuerySpotMidPriceAndTOBResponse.toAny(): Any =
    Any(QuerySpotMidPriceAndTOBResponse.TYPE_URL, with(QuerySpotMidPriceAndTOBResponseConverter) {
    toByteArray() })

public fun Any.parse(converter: ProtobufConverter<QuerySpotMidPriceAndTOBResponse>):
    QuerySpotMidPriceAndTOBResponse {
  if (typeUrl != QuerySpotMidPriceAndTOBResponse.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object QueryDerivativeMidPriceAndTOBRequestConverter :
    ProtobufConverter<QueryDerivativeMidPriceAndTOBRequest>

public fun QueryDerivativeMidPriceAndTOBRequest.toAny(): Any =
    Any(QueryDerivativeMidPriceAndTOBRequest.TYPE_URL,
    with(QueryDerivativeMidPriceAndTOBRequestConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<QueryDerivativeMidPriceAndTOBRequest>):
    QueryDerivativeMidPriceAndTOBRequest {
  if (typeUrl != QueryDerivativeMidPriceAndTOBRequest.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object QueryDerivativeMidPriceAndTOBResponseConverter :
    ProtobufConverter<QueryDerivativeMidPriceAndTOBResponse>

public fun QueryDerivativeMidPriceAndTOBResponse.toAny(): Any =
    Any(QueryDerivativeMidPriceAndTOBResponse.TYPE_URL,
    with(QueryDerivativeMidPriceAndTOBResponseConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<QueryDerivativeMidPriceAndTOBResponse>):
    QueryDerivativeMidPriceAndTOBResponse {
  if (typeUrl != QueryDerivativeMidPriceAndTOBResponse.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object QueryDerivativeOrderbookRequestConverter :
    ProtobufConverter<QueryDerivativeOrderbookRequest>

public fun QueryDerivativeOrderbookRequest.toAny(): Any =
    Any(QueryDerivativeOrderbookRequest.TYPE_URL, with(QueryDerivativeOrderbookRequestConverter) {
    toByteArray() })

public fun Any.parse(converter: ProtobufConverter<QueryDerivativeOrderbookRequest>):
    QueryDerivativeOrderbookRequest {
  if (typeUrl != QueryDerivativeOrderbookRequest.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object QueryDerivativeOrderbookResponseConverter :
    ProtobufConverter<QueryDerivativeOrderbookResponse>

public fun QueryDerivativeOrderbookResponse.toAny(): Any =
    Any(QueryDerivativeOrderbookResponse.TYPE_URL, with(QueryDerivativeOrderbookResponseConverter) {
    toByteArray() })

public fun Any.parse(converter: ProtobufConverter<QueryDerivativeOrderbookResponse>):
    QueryDerivativeOrderbookResponse {
  if (typeUrl != QueryDerivativeOrderbookResponse.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object QueryTraderSpotOrdersToCancelUpToAmountRequestConverter :
    ProtobufConverter<QueryTraderSpotOrdersToCancelUpToAmountRequest>

public fun QueryTraderSpotOrdersToCancelUpToAmountRequest.toAny(): Any =
    Any(QueryTraderSpotOrdersToCancelUpToAmountRequest.TYPE_URL,
    with(QueryTraderSpotOrdersToCancelUpToAmountRequestConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<QueryTraderSpotOrdersToCancelUpToAmountRequest>):
    QueryTraderSpotOrdersToCancelUpToAmountRequest {
  if (typeUrl != QueryTraderSpotOrdersToCancelUpToAmountRequest.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object QueryTraderDerivativeOrdersToCancelUpToAmountRequestConverter :
    ProtobufConverter<QueryTraderDerivativeOrdersToCancelUpToAmountRequest>

public fun QueryTraderDerivativeOrdersToCancelUpToAmountRequest.toAny(): Any =
    Any(QueryTraderDerivativeOrdersToCancelUpToAmountRequest.TYPE_URL,
    with(QueryTraderDerivativeOrdersToCancelUpToAmountRequestConverter) { toByteArray() })

public
    fun Any.parse(converter: ProtobufConverter<QueryTraderDerivativeOrdersToCancelUpToAmountRequest>):
    QueryTraderDerivativeOrdersToCancelUpToAmountRequest {
  if (typeUrl != QueryTraderDerivativeOrdersToCancelUpToAmountRequest.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object QueryTraderDerivativeOrdersRequestConverter :
    ProtobufConverter<QueryTraderDerivativeOrdersRequest>

public fun QueryTraderDerivativeOrdersRequest.toAny(): Any =
    Any(QueryTraderDerivativeOrdersRequest.TYPE_URL,
    with(QueryTraderDerivativeOrdersRequestConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<QueryTraderDerivativeOrdersRequest>):
    QueryTraderDerivativeOrdersRequest {
  if (typeUrl != QueryTraderDerivativeOrdersRequest.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object QueryAccountAddressDerivativeOrdersRequestConverter :
    ProtobufConverter<QueryAccountAddressDerivativeOrdersRequest>

public fun QueryAccountAddressDerivativeOrdersRequest.toAny(): Any =
    Any(QueryAccountAddressDerivativeOrdersRequest.TYPE_URL,
    with(QueryAccountAddressDerivativeOrdersRequestConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<QueryAccountAddressDerivativeOrdersRequest>):
    QueryAccountAddressDerivativeOrdersRequest {
  if (typeUrl != QueryAccountAddressDerivativeOrdersRequest.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object TrimmedDerivativeLimitOrderConverter :
    ProtobufConverter<TrimmedDerivativeLimitOrder>

public fun TrimmedDerivativeLimitOrder.toAny(): Any = Any(TrimmedDerivativeLimitOrder.TYPE_URL,
    with(TrimmedDerivativeLimitOrderConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<TrimmedDerivativeLimitOrder>):
    TrimmedDerivativeLimitOrder {
  if (typeUrl != TrimmedDerivativeLimitOrder.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object QueryTraderDerivativeOrdersResponseConverter :
    ProtobufConverter<QueryTraderDerivativeOrdersResponse>

public fun QueryTraderDerivativeOrdersResponse.toAny(): Any =
    Any(QueryTraderDerivativeOrdersResponse.TYPE_URL,
    with(QueryTraderDerivativeOrdersResponseConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<QueryTraderDerivativeOrdersResponse>):
    QueryTraderDerivativeOrdersResponse {
  if (typeUrl != QueryTraderDerivativeOrdersResponse.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object QueryAccountAddressDerivativeOrdersResponseConverter :
    ProtobufConverter<QueryAccountAddressDerivativeOrdersResponse>

public fun QueryAccountAddressDerivativeOrdersResponse.toAny(): Any =
    Any(QueryAccountAddressDerivativeOrdersResponse.TYPE_URL,
    with(QueryAccountAddressDerivativeOrdersResponseConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<QueryAccountAddressDerivativeOrdersResponse>):
    QueryAccountAddressDerivativeOrdersResponse {
  if (typeUrl != QueryAccountAddressDerivativeOrdersResponse.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object QueryDerivativeOrdersByHashesRequestConverter :
    ProtobufConverter<QueryDerivativeOrdersByHashesRequest>

public fun QueryDerivativeOrdersByHashesRequest.toAny(): Any =
    Any(QueryDerivativeOrdersByHashesRequest.TYPE_URL,
    with(QueryDerivativeOrdersByHashesRequestConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<QueryDerivativeOrdersByHashesRequest>):
    QueryDerivativeOrdersByHashesRequest {
  if (typeUrl != QueryDerivativeOrdersByHashesRequest.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object QueryDerivativeOrdersByHashesResponseConverter :
    ProtobufConverter<QueryDerivativeOrdersByHashesResponse>

public fun QueryDerivativeOrdersByHashesResponse.toAny(): Any =
    Any(QueryDerivativeOrdersByHashesResponse.TYPE_URL,
    with(QueryDerivativeOrdersByHashesResponseConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<QueryDerivativeOrdersByHashesResponse>):
    QueryDerivativeOrdersByHashesResponse {
  if (typeUrl != QueryDerivativeOrdersByHashesResponse.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object QueryDerivativeMarketsRequestConverter :
    ProtobufConverter<QueryDerivativeMarketsRequest>

public fun QueryDerivativeMarketsRequest.toAny(): Any = Any(QueryDerivativeMarketsRequest.TYPE_URL,
    with(QueryDerivativeMarketsRequestConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<QueryDerivativeMarketsRequest>):
    QueryDerivativeMarketsRequest {
  if (typeUrl != QueryDerivativeMarketsRequest.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object PriceLevelConverter : ProtobufConverter<PriceLevel>

public fun PriceLevel.toAny(): Any = Any(PriceLevel.TYPE_URL, with(PriceLevelConverter) {
    toByteArray() })

public fun Any.parse(converter: ProtobufConverter<PriceLevel>): PriceLevel {
  if (typeUrl != PriceLevel.TYPE_URL) throw IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object PerpetualMarketStateConverter : ProtobufConverter<PerpetualMarketState>

public fun PerpetualMarketState.toAny(): Any = Any(PerpetualMarketState.TYPE_URL,
    with(PerpetualMarketStateConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<PerpetualMarketState>): PerpetualMarketState {
  if (typeUrl != PerpetualMarketState.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object FullDerivativeMarketConverter : ProtobufConverter<FullDerivativeMarket>

public fun FullDerivativeMarket.toAny(): Any = Any(FullDerivativeMarket.TYPE_URL,
    with(FullDerivativeMarketConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<FullDerivativeMarket>): FullDerivativeMarket {
  if (typeUrl != FullDerivativeMarket.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object QueryDerivativeMarketsResponseConverter :
    ProtobufConverter<QueryDerivativeMarketsResponse>

public fun QueryDerivativeMarketsResponse.toAny(): Any =
    Any(QueryDerivativeMarketsResponse.TYPE_URL, with(QueryDerivativeMarketsResponseConverter) {
    toByteArray() })

public fun Any.parse(converter: ProtobufConverter<QueryDerivativeMarketsResponse>):
    QueryDerivativeMarketsResponse {
  if (typeUrl != QueryDerivativeMarketsResponse.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object QueryDerivativeMarketRequestConverter :
    ProtobufConverter<QueryDerivativeMarketRequest>

public fun QueryDerivativeMarketRequest.toAny(): Any = Any(QueryDerivativeMarketRequest.TYPE_URL,
    with(QueryDerivativeMarketRequestConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<QueryDerivativeMarketRequest>):
    QueryDerivativeMarketRequest {
  if (typeUrl != QueryDerivativeMarketRequest.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object QueryDerivativeMarketResponseConverter :
    ProtobufConverter<QueryDerivativeMarketResponse>

public fun QueryDerivativeMarketResponse.toAny(): Any = Any(QueryDerivativeMarketResponse.TYPE_URL,
    with(QueryDerivativeMarketResponseConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<QueryDerivativeMarketResponse>):
    QueryDerivativeMarketResponse {
  if (typeUrl != QueryDerivativeMarketResponse.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object QueryDerivativeMarketAddressRequestConverter :
    ProtobufConverter<QueryDerivativeMarketAddressRequest>

public fun QueryDerivativeMarketAddressRequest.toAny(): Any =
    Any(QueryDerivativeMarketAddressRequest.TYPE_URL,
    with(QueryDerivativeMarketAddressRequestConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<QueryDerivativeMarketAddressRequest>):
    QueryDerivativeMarketAddressRequest {
  if (typeUrl != QueryDerivativeMarketAddressRequest.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object QueryDerivativeMarketAddressResponseConverter :
    ProtobufConverter<QueryDerivativeMarketAddressResponse>

public fun QueryDerivativeMarketAddressResponse.toAny(): Any =
    Any(QueryDerivativeMarketAddressResponse.TYPE_URL,
    with(QueryDerivativeMarketAddressResponseConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<QueryDerivativeMarketAddressResponse>):
    QueryDerivativeMarketAddressResponse {
  if (typeUrl != QueryDerivativeMarketAddressResponse.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object QuerySubaccountTradeNonceRequestConverter :
    ProtobufConverter<QuerySubaccountTradeNonceRequest>

public fun QuerySubaccountTradeNonceRequest.toAny(): Any =
    Any(QuerySubaccountTradeNonceRequest.TYPE_URL, with(QuerySubaccountTradeNonceRequestConverter) {
    toByteArray() })

public fun Any.parse(converter: ProtobufConverter<QuerySubaccountTradeNonceRequest>):
    QuerySubaccountTradeNonceRequest {
  if (typeUrl != QuerySubaccountTradeNonceRequest.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object QuerySubaccountPositionsRequestConverter :
    ProtobufConverter<QuerySubaccountPositionsRequest>

public fun QuerySubaccountPositionsRequest.toAny(): Any =
    Any(QuerySubaccountPositionsRequest.TYPE_URL, with(QuerySubaccountPositionsRequestConverter) {
    toByteArray() })

public fun Any.parse(converter: ProtobufConverter<QuerySubaccountPositionsRequest>):
    QuerySubaccountPositionsRequest {
  if (typeUrl != QuerySubaccountPositionsRequest.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object QuerySubaccountPositionInMarketRequestConverter :
    ProtobufConverter<QuerySubaccountPositionInMarketRequest>

public fun QuerySubaccountPositionInMarketRequest.toAny(): Any =
    Any(QuerySubaccountPositionInMarketRequest.TYPE_URL,
    with(QuerySubaccountPositionInMarketRequestConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<QuerySubaccountPositionInMarketRequest>):
    QuerySubaccountPositionInMarketRequest {
  if (typeUrl != QuerySubaccountPositionInMarketRequest.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object QuerySubaccountEffectivePositionInMarketRequestConverter :
    ProtobufConverter<QuerySubaccountEffectivePositionInMarketRequest>

public fun QuerySubaccountEffectivePositionInMarketRequest.toAny(): Any =
    Any(QuerySubaccountEffectivePositionInMarketRequest.TYPE_URL,
    with(QuerySubaccountEffectivePositionInMarketRequestConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<QuerySubaccountEffectivePositionInMarketRequest>):
    QuerySubaccountEffectivePositionInMarketRequest {
  if (typeUrl != QuerySubaccountEffectivePositionInMarketRequest.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object QuerySubaccountOrderMetadataRequestConverter :
    ProtobufConverter<QuerySubaccountOrderMetadataRequest>

public fun QuerySubaccountOrderMetadataRequest.toAny(): Any =
    Any(QuerySubaccountOrderMetadataRequest.TYPE_URL,
    with(QuerySubaccountOrderMetadataRequestConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<QuerySubaccountOrderMetadataRequest>):
    QuerySubaccountOrderMetadataRequest {
  if (typeUrl != QuerySubaccountOrderMetadataRequest.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object QuerySubaccountPositionsResponseConverter :
    ProtobufConverter<QuerySubaccountPositionsResponse>

public fun QuerySubaccountPositionsResponse.toAny(): Any =
    Any(QuerySubaccountPositionsResponse.TYPE_URL, with(QuerySubaccountPositionsResponseConverter) {
    toByteArray() })

public fun Any.parse(converter: ProtobufConverter<QuerySubaccountPositionsResponse>):
    QuerySubaccountPositionsResponse {
  if (typeUrl != QuerySubaccountPositionsResponse.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object QuerySubaccountPositionInMarketResponseConverter :
    ProtobufConverter<QuerySubaccountPositionInMarketResponse>

public fun QuerySubaccountPositionInMarketResponse.toAny(): Any =
    Any(QuerySubaccountPositionInMarketResponse.TYPE_URL,
    with(QuerySubaccountPositionInMarketResponseConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<QuerySubaccountPositionInMarketResponse>):
    QuerySubaccountPositionInMarketResponse {
  if (typeUrl != QuerySubaccountPositionInMarketResponse.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object EffectivePositionConverter : ProtobufConverter<EffectivePosition>

public fun EffectivePosition.toAny(): Any = Any(EffectivePosition.TYPE_URL,
    with(EffectivePositionConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<EffectivePosition>): EffectivePosition {
  if (typeUrl != EffectivePosition.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object QuerySubaccountEffectivePositionInMarketResponseConverter :
    ProtobufConverter<QuerySubaccountEffectivePositionInMarketResponse>

public fun QuerySubaccountEffectivePositionInMarketResponse.toAny(): Any =
    Any(QuerySubaccountEffectivePositionInMarketResponse.TYPE_URL,
    with(QuerySubaccountEffectivePositionInMarketResponseConverter) { toByteArray() })

public
    fun Any.parse(converter: ProtobufConverter<QuerySubaccountEffectivePositionInMarketResponse>):
    QuerySubaccountEffectivePositionInMarketResponse {
  if (typeUrl != QuerySubaccountEffectivePositionInMarketResponse.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object QueryPerpetualMarketInfoRequestConverter :
    ProtobufConverter<QueryPerpetualMarketInfoRequest>

public fun QueryPerpetualMarketInfoRequest.toAny(): Any =
    Any(QueryPerpetualMarketInfoRequest.TYPE_URL, with(QueryPerpetualMarketInfoRequestConverter) {
    toByteArray() })

public fun Any.parse(converter: ProtobufConverter<QueryPerpetualMarketInfoRequest>):
    QueryPerpetualMarketInfoRequest {
  if (typeUrl != QueryPerpetualMarketInfoRequest.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object QueryPerpetualMarketInfoResponseConverter :
    ProtobufConverter<QueryPerpetualMarketInfoResponse>

public fun QueryPerpetualMarketInfoResponse.toAny(): Any =
    Any(QueryPerpetualMarketInfoResponse.TYPE_URL, with(QueryPerpetualMarketInfoResponseConverter) {
    toByteArray() })

public fun Any.parse(converter: ProtobufConverter<QueryPerpetualMarketInfoResponse>):
    QueryPerpetualMarketInfoResponse {
  if (typeUrl != QueryPerpetualMarketInfoResponse.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object QueryExpiryFuturesMarketInfoRequestConverter :
    ProtobufConverter<QueryExpiryFuturesMarketInfoRequest>

public fun QueryExpiryFuturesMarketInfoRequest.toAny(): Any =
    Any(QueryExpiryFuturesMarketInfoRequest.TYPE_URL,
    with(QueryExpiryFuturesMarketInfoRequestConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<QueryExpiryFuturesMarketInfoRequest>):
    QueryExpiryFuturesMarketInfoRequest {
  if (typeUrl != QueryExpiryFuturesMarketInfoRequest.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object QueryExpiryFuturesMarketInfoResponseConverter :
    ProtobufConverter<QueryExpiryFuturesMarketInfoResponse>

public fun QueryExpiryFuturesMarketInfoResponse.toAny(): Any =
    Any(QueryExpiryFuturesMarketInfoResponse.TYPE_URL,
    with(QueryExpiryFuturesMarketInfoResponseConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<QueryExpiryFuturesMarketInfoResponse>):
    QueryExpiryFuturesMarketInfoResponse {
  if (typeUrl != QueryExpiryFuturesMarketInfoResponse.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object QueryPerpetualMarketFundingRequestConverter :
    ProtobufConverter<QueryPerpetualMarketFundingRequest>

public fun QueryPerpetualMarketFundingRequest.toAny(): Any =
    Any(QueryPerpetualMarketFundingRequest.TYPE_URL,
    with(QueryPerpetualMarketFundingRequestConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<QueryPerpetualMarketFundingRequest>):
    QueryPerpetualMarketFundingRequest {
  if (typeUrl != QueryPerpetualMarketFundingRequest.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object QueryPerpetualMarketFundingResponseConverter :
    ProtobufConverter<QueryPerpetualMarketFundingResponse>

public fun QueryPerpetualMarketFundingResponse.toAny(): Any =
    Any(QueryPerpetualMarketFundingResponse.TYPE_URL,
    with(QueryPerpetualMarketFundingResponseConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<QueryPerpetualMarketFundingResponse>):
    QueryPerpetualMarketFundingResponse {
  if (typeUrl != QueryPerpetualMarketFundingResponse.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object QuerySubaccountOrderMetadataResponseConverter :
    ProtobufConverter<QuerySubaccountOrderMetadataResponse>

public fun QuerySubaccountOrderMetadataResponse.toAny(): Any =
    Any(QuerySubaccountOrderMetadataResponse.TYPE_URL,
    with(QuerySubaccountOrderMetadataResponseConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<QuerySubaccountOrderMetadataResponse>):
    QuerySubaccountOrderMetadataResponse {
  if (typeUrl != QuerySubaccountOrderMetadataResponse.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object QuerySubaccountTradeNonceResponseConverter :
    ProtobufConverter<QuerySubaccountTradeNonceResponse>

public fun QuerySubaccountTradeNonceResponse.toAny(): Any =
    Any(QuerySubaccountTradeNonceResponse.TYPE_URL, with(QuerySubaccountTradeNonceResponseConverter)
    { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<QuerySubaccountTradeNonceResponse>):
    QuerySubaccountTradeNonceResponse {
  if (typeUrl != QuerySubaccountTradeNonceResponse.TYPE_URL) throw
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

public expect object QueryPositionsRequestConverter : ProtobufConverter<QueryPositionsRequest>

public fun QueryPositionsRequest.toAny(): Any = Any(QueryPositionsRequest.TYPE_URL,
    with(QueryPositionsRequestConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<QueryPositionsRequest>): QueryPositionsRequest {
  if (typeUrl != QueryPositionsRequest.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object QueryPositionsResponseConverter : ProtobufConverter<QueryPositionsResponse>

public fun QueryPositionsResponse.toAny(): Any = Any(QueryPositionsResponse.TYPE_URL,
    with(QueryPositionsResponseConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<QueryPositionsResponse>): QueryPositionsResponse {
  if (typeUrl != QueryPositionsResponse.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object QueryTradeRewardPointsRequestConverter :
    ProtobufConverter<QueryTradeRewardPointsRequest>

public fun QueryTradeRewardPointsRequest.toAny(): Any = Any(QueryTradeRewardPointsRequest.TYPE_URL,
    with(QueryTradeRewardPointsRequestConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<QueryTradeRewardPointsRequest>):
    QueryTradeRewardPointsRequest {
  if (typeUrl != QueryTradeRewardPointsRequest.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object QueryTradeRewardPointsResponseConverter :
    ProtobufConverter<QueryTradeRewardPointsResponse>

public fun QueryTradeRewardPointsResponse.toAny(): Any =
    Any(QueryTradeRewardPointsResponse.TYPE_URL, with(QueryTradeRewardPointsResponseConverter) {
    toByteArray() })

public fun Any.parse(converter: ProtobufConverter<QueryTradeRewardPointsResponse>):
    QueryTradeRewardPointsResponse {
  if (typeUrl != QueryTradeRewardPointsResponse.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object QueryTradeRewardCampaignRequestConverter :
    ProtobufConverter<QueryTradeRewardCampaignRequest>

public fun QueryTradeRewardCampaignRequest.toAny(): Any =
    Any(QueryTradeRewardCampaignRequest.TYPE_URL, with(QueryTradeRewardCampaignRequestConverter) {
    toByteArray() })

public fun Any.parse(converter: ProtobufConverter<QueryTradeRewardCampaignRequest>):
    QueryTradeRewardCampaignRequest {
  if (typeUrl != QueryTradeRewardCampaignRequest.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object QueryTradeRewardCampaignResponseConverter :
    ProtobufConverter<QueryTradeRewardCampaignResponse>

public fun QueryTradeRewardCampaignResponse.toAny(): Any =
    Any(QueryTradeRewardCampaignResponse.TYPE_URL, with(QueryTradeRewardCampaignResponseConverter) {
    toByteArray() })

public fun Any.parse(converter: ProtobufConverter<QueryTradeRewardCampaignResponse>):
    QueryTradeRewardCampaignResponse {
  if (typeUrl != QueryTradeRewardCampaignResponse.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object QueryIsOptedOutOfRewardsRequestConverter :
    ProtobufConverter<QueryIsOptedOutOfRewardsRequest>

public fun QueryIsOptedOutOfRewardsRequest.toAny(): Any =
    Any(QueryIsOptedOutOfRewardsRequest.TYPE_URL, with(QueryIsOptedOutOfRewardsRequestConverter) {
    toByteArray() })

public fun Any.parse(converter: ProtobufConverter<QueryIsOptedOutOfRewardsRequest>):
    QueryIsOptedOutOfRewardsRequest {
  if (typeUrl != QueryIsOptedOutOfRewardsRequest.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object QueryIsOptedOutOfRewardsResponseConverter :
    ProtobufConverter<QueryIsOptedOutOfRewardsResponse>

public fun QueryIsOptedOutOfRewardsResponse.toAny(): Any =
    Any(QueryIsOptedOutOfRewardsResponse.TYPE_URL, with(QueryIsOptedOutOfRewardsResponseConverter) {
    toByteArray() })

public fun Any.parse(converter: ProtobufConverter<QueryIsOptedOutOfRewardsResponse>):
    QueryIsOptedOutOfRewardsResponse {
  if (typeUrl != QueryIsOptedOutOfRewardsResponse.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object QueryOptedOutOfRewardsAccountsRequestConverter :
    ProtobufConverter<QueryOptedOutOfRewardsAccountsRequest>

public fun QueryOptedOutOfRewardsAccountsRequest.toAny(): Any =
    Any(QueryOptedOutOfRewardsAccountsRequest.TYPE_URL,
    with(QueryOptedOutOfRewardsAccountsRequestConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<QueryOptedOutOfRewardsAccountsRequest>):
    QueryOptedOutOfRewardsAccountsRequest {
  if (typeUrl != QueryOptedOutOfRewardsAccountsRequest.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object QueryOptedOutOfRewardsAccountsResponseConverter :
    ProtobufConverter<QueryOptedOutOfRewardsAccountsResponse>

public fun QueryOptedOutOfRewardsAccountsResponse.toAny(): Any =
    Any(QueryOptedOutOfRewardsAccountsResponse.TYPE_URL,
    with(QueryOptedOutOfRewardsAccountsResponseConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<QueryOptedOutOfRewardsAccountsResponse>):
    QueryOptedOutOfRewardsAccountsResponse {
  if (typeUrl != QueryOptedOutOfRewardsAccountsResponse.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object QueryFeeDiscountAccountInfoRequestConverter :
    ProtobufConverter<QueryFeeDiscountAccountInfoRequest>

public fun QueryFeeDiscountAccountInfoRequest.toAny(): Any =
    Any(QueryFeeDiscountAccountInfoRequest.TYPE_URL,
    with(QueryFeeDiscountAccountInfoRequestConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<QueryFeeDiscountAccountInfoRequest>):
    QueryFeeDiscountAccountInfoRequest {
  if (typeUrl != QueryFeeDiscountAccountInfoRequest.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object QueryFeeDiscountAccountInfoResponseConverter :
    ProtobufConverter<QueryFeeDiscountAccountInfoResponse>

public fun QueryFeeDiscountAccountInfoResponse.toAny(): Any =
    Any(QueryFeeDiscountAccountInfoResponse.TYPE_URL,
    with(QueryFeeDiscountAccountInfoResponseConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<QueryFeeDiscountAccountInfoResponse>):
    QueryFeeDiscountAccountInfoResponse {
  if (typeUrl != QueryFeeDiscountAccountInfoResponse.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object QueryFeeDiscountScheduleRequestConverter :
    ProtobufConverter<QueryFeeDiscountScheduleRequest>

public fun QueryFeeDiscountScheduleRequest.toAny(): Any =
    Any(QueryFeeDiscountScheduleRequest.TYPE_URL, with(QueryFeeDiscountScheduleRequestConverter) {
    toByteArray() })

public fun Any.parse(converter: ProtobufConverter<QueryFeeDiscountScheduleRequest>):
    QueryFeeDiscountScheduleRequest {
  if (typeUrl != QueryFeeDiscountScheduleRequest.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object QueryFeeDiscountScheduleResponseConverter :
    ProtobufConverter<QueryFeeDiscountScheduleResponse>

public fun QueryFeeDiscountScheduleResponse.toAny(): Any =
    Any(QueryFeeDiscountScheduleResponse.TYPE_URL, with(QueryFeeDiscountScheduleResponseConverter) {
    toByteArray() })

public fun Any.parse(converter: ProtobufConverter<QueryFeeDiscountScheduleResponse>):
    QueryFeeDiscountScheduleResponse {
  if (typeUrl != QueryFeeDiscountScheduleResponse.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object QueryBalanceMismatchesRequestConverter :
    ProtobufConverter<QueryBalanceMismatchesRequest>

public fun QueryBalanceMismatchesRequest.toAny(): Any = Any(QueryBalanceMismatchesRequest.TYPE_URL,
    with(QueryBalanceMismatchesRequestConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<QueryBalanceMismatchesRequest>):
    QueryBalanceMismatchesRequest {
  if (typeUrl != QueryBalanceMismatchesRequest.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object BalanceMismatchConverter : ProtobufConverter<BalanceMismatch>

public fun BalanceMismatch.toAny(): Any = Any(BalanceMismatch.TYPE_URL,
    with(BalanceMismatchConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<BalanceMismatch>): BalanceMismatch {
  if (typeUrl != BalanceMismatch.TYPE_URL) throw IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object QueryBalanceMismatchesResponseConverter :
    ProtobufConverter<QueryBalanceMismatchesResponse>

public fun QueryBalanceMismatchesResponse.toAny(): Any =
    Any(QueryBalanceMismatchesResponse.TYPE_URL, with(QueryBalanceMismatchesResponseConverter) {
    toByteArray() })

public fun Any.parse(converter: ProtobufConverter<QueryBalanceMismatchesResponse>):
    QueryBalanceMismatchesResponse {
  if (typeUrl != QueryBalanceMismatchesResponse.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object QueryBalanceWithBalanceHoldsRequestConverter :
    ProtobufConverter<QueryBalanceWithBalanceHoldsRequest>

public fun QueryBalanceWithBalanceHoldsRequest.toAny(): Any =
    Any(QueryBalanceWithBalanceHoldsRequest.TYPE_URL,
    with(QueryBalanceWithBalanceHoldsRequestConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<QueryBalanceWithBalanceHoldsRequest>):
    QueryBalanceWithBalanceHoldsRequest {
  if (typeUrl != QueryBalanceWithBalanceHoldsRequest.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object BalanceWithMarginHoldConverter : ProtobufConverter<BalanceWithMarginHold>

public fun BalanceWithMarginHold.toAny(): Any = Any(BalanceWithMarginHold.TYPE_URL,
    with(BalanceWithMarginHoldConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<BalanceWithMarginHold>): BalanceWithMarginHold {
  if (typeUrl != BalanceWithMarginHold.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object QueryBalanceWithBalanceHoldsResponseConverter :
    ProtobufConverter<QueryBalanceWithBalanceHoldsResponse>

public fun QueryBalanceWithBalanceHoldsResponse.toAny(): Any =
    Any(QueryBalanceWithBalanceHoldsResponse.TYPE_URL,
    with(QueryBalanceWithBalanceHoldsResponseConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<QueryBalanceWithBalanceHoldsResponse>):
    QueryBalanceWithBalanceHoldsResponse {
  if (typeUrl != QueryBalanceWithBalanceHoldsResponse.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object QueryFeeDiscountTierStatisticsRequestConverter :
    ProtobufConverter<QueryFeeDiscountTierStatisticsRequest>

public fun QueryFeeDiscountTierStatisticsRequest.toAny(): Any =
    Any(QueryFeeDiscountTierStatisticsRequest.TYPE_URL,
    with(QueryFeeDiscountTierStatisticsRequestConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<QueryFeeDiscountTierStatisticsRequest>):
    QueryFeeDiscountTierStatisticsRequest {
  if (typeUrl != QueryFeeDiscountTierStatisticsRequest.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object TierStatisticConverter : ProtobufConverter<TierStatistic>

public fun TierStatistic.toAny(): Any = Any(TierStatistic.TYPE_URL, with(TierStatisticConverter) {
    toByteArray() })

public fun Any.parse(converter: ProtobufConverter<TierStatistic>): TierStatistic {
  if (typeUrl != TierStatistic.TYPE_URL) throw IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object QueryFeeDiscountTierStatisticsResponseConverter :
    ProtobufConverter<QueryFeeDiscountTierStatisticsResponse>

public fun QueryFeeDiscountTierStatisticsResponse.toAny(): Any =
    Any(QueryFeeDiscountTierStatisticsResponse.TYPE_URL,
    with(QueryFeeDiscountTierStatisticsResponseConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<QueryFeeDiscountTierStatisticsResponse>):
    QueryFeeDiscountTierStatisticsResponse {
  if (typeUrl != QueryFeeDiscountTierStatisticsResponse.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object MitoVaultInfosRequestConverter : ProtobufConverter<MitoVaultInfosRequest>

public fun MitoVaultInfosRequest.toAny(): Any = Any(MitoVaultInfosRequest.TYPE_URL,
    with(MitoVaultInfosRequestConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<MitoVaultInfosRequest>): MitoVaultInfosRequest {
  if (typeUrl != MitoVaultInfosRequest.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object MitoVaultInfosResponseConverter : ProtobufConverter<MitoVaultInfosResponse>

public fun MitoVaultInfosResponse.toAny(): Any = Any(MitoVaultInfosResponse.TYPE_URL,
    with(MitoVaultInfosResponseConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<MitoVaultInfosResponse>): MitoVaultInfosResponse {
  if (typeUrl != MitoVaultInfosResponse.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object QueryMarketIDFromVaultRequestConverter :
    ProtobufConverter<QueryMarketIDFromVaultRequest>

public fun QueryMarketIDFromVaultRequest.toAny(): Any = Any(QueryMarketIDFromVaultRequest.TYPE_URL,
    with(QueryMarketIDFromVaultRequestConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<QueryMarketIDFromVaultRequest>):
    QueryMarketIDFromVaultRequest {
  if (typeUrl != QueryMarketIDFromVaultRequest.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object QueryMarketIDFromVaultResponseConverter :
    ProtobufConverter<QueryMarketIDFromVaultResponse>

public fun QueryMarketIDFromVaultResponse.toAny(): Any =
    Any(QueryMarketIDFromVaultResponse.TYPE_URL, with(QueryMarketIDFromVaultResponseConverter) {
    toByteArray() })

public fun Any.parse(converter: ProtobufConverter<QueryMarketIDFromVaultResponse>):
    QueryMarketIDFromVaultResponse {
  if (typeUrl != QueryMarketIDFromVaultResponse.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object QueryHistoricalTradeRecordsRequestConverter :
    ProtobufConverter<QueryHistoricalTradeRecordsRequest>

public fun QueryHistoricalTradeRecordsRequest.toAny(): Any =
    Any(QueryHistoricalTradeRecordsRequest.TYPE_URL,
    with(QueryHistoricalTradeRecordsRequestConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<QueryHistoricalTradeRecordsRequest>):
    QueryHistoricalTradeRecordsRequest {
  if (typeUrl != QueryHistoricalTradeRecordsRequest.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object QueryHistoricalTradeRecordsResponseConverter :
    ProtobufConverter<QueryHistoricalTradeRecordsResponse>

public fun QueryHistoricalTradeRecordsResponse.toAny(): Any =
    Any(QueryHistoricalTradeRecordsResponse.TYPE_URL,
    with(QueryHistoricalTradeRecordsResponseConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<QueryHistoricalTradeRecordsResponse>):
    QueryHistoricalTradeRecordsResponse {
  if (typeUrl != QueryHistoricalTradeRecordsResponse.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object TradeHistoryOptionsConverter : ProtobufConverter<TradeHistoryOptions>

public fun TradeHistoryOptions.toAny(): Any = Any(TradeHistoryOptions.TYPE_URL,
    with(TradeHistoryOptionsConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<TradeHistoryOptions>): TradeHistoryOptions {
  if (typeUrl != TradeHistoryOptions.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object QueryMarketVolatilityRequestConverter :
    ProtobufConverter<QueryMarketVolatilityRequest>

public fun QueryMarketVolatilityRequest.toAny(): Any = Any(QueryMarketVolatilityRequest.TYPE_URL,
    with(QueryMarketVolatilityRequestConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<QueryMarketVolatilityRequest>):
    QueryMarketVolatilityRequest {
  if (typeUrl != QueryMarketVolatilityRequest.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object QueryMarketVolatilityResponseConverter :
    ProtobufConverter<QueryMarketVolatilityResponse>

public fun QueryMarketVolatilityResponse.toAny(): Any = Any(QueryMarketVolatilityResponse.TYPE_URL,
    with(QueryMarketVolatilityResponseConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<QueryMarketVolatilityResponse>):
    QueryMarketVolatilityResponse {
  if (typeUrl != QueryMarketVolatilityResponse.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object QueryBinaryMarketsRequestConverter :
    ProtobufConverter<QueryBinaryMarketsRequest>

public fun QueryBinaryMarketsRequest.toAny(): Any = Any(QueryBinaryMarketsRequest.TYPE_URL,
    with(QueryBinaryMarketsRequestConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<QueryBinaryMarketsRequest>):
    QueryBinaryMarketsRequest {
  if (typeUrl != QueryBinaryMarketsRequest.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object QueryBinaryMarketsResponseConverter :
    ProtobufConverter<QueryBinaryMarketsResponse>

public fun QueryBinaryMarketsResponse.toAny(): Any = Any(QueryBinaryMarketsResponse.TYPE_URL,
    with(QueryBinaryMarketsResponseConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<QueryBinaryMarketsResponse>):
    QueryBinaryMarketsResponse {
  if (typeUrl != QueryBinaryMarketsResponse.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object QueryTraderDerivativeConditionalOrdersRequestConverter :
    ProtobufConverter<QueryTraderDerivativeConditionalOrdersRequest>

public fun QueryTraderDerivativeConditionalOrdersRequest.toAny(): Any =
    Any(QueryTraderDerivativeConditionalOrdersRequest.TYPE_URL,
    with(QueryTraderDerivativeConditionalOrdersRequestConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<QueryTraderDerivativeConditionalOrdersRequest>):
    QueryTraderDerivativeConditionalOrdersRequest {
  if (typeUrl != QueryTraderDerivativeConditionalOrdersRequest.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object TrimmedDerivativeConditionalOrderConverter :
    ProtobufConverter<TrimmedDerivativeConditionalOrder>

public fun TrimmedDerivativeConditionalOrder.toAny(): Any =
    Any(TrimmedDerivativeConditionalOrder.TYPE_URL, with(TrimmedDerivativeConditionalOrderConverter)
    { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<TrimmedDerivativeConditionalOrder>):
    TrimmedDerivativeConditionalOrder {
  if (typeUrl != TrimmedDerivativeConditionalOrder.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object QueryTraderDerivativeConditionalOrdersResponseConverter :
    ProtobufConverter<QueryTraderDerivativeConditionalOrdersResponse>

public fun QueryTraderDerivativeConditionalOrdersResponse.toAny(): Any =
    Any(QueryTraderDerivativeConditionalOrdersResponse.TYPE_URL,
    with(QueryTraderDerivativeConditionalOrdersResponseConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<QueryTraderDerivativeConditionalOrdersResponse>):
    QueryTraderDerivativeConditionalOrdersResponse {
  if (typeUrl != QueryTraderDerivativeConditionalOrdersResponse.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object QueryMarketAtomicExecutionFeeMultiplierRequestConverter :
    ProtobufConverter<QueryMarketAtomicExecutionFeeMultiplierRequest>

public fun QueryMarketAtomicExecutionFeeMultiplierRequest.toAny(): Any =
    Any(QueryMarketAtomicExecutionFeeMultiplierRequest.TYPE_URL,
    with(QueryMarketAtomicExecutionFeeMultiplierRequestConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<QueryMarketAtomicExecutionFeeMultiplierRequest>):
    QueryMarketAtomicExecutionFeeMultiplierRequest {
  if (typeUrl != QueryMarketAtomicExecutionFeeMultiplierRequest.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object QueryMarketAtomicExecutionFeeMultiplierResponseConverter :
    ProtobufConverter<QueryMarketAtomicExecutionFeeMultiplierResponse>

public fun QueryMarketAtomicExecutionFeeMultiplierResponse.toAny(): Any =
    Any(QueryMarketAtomicExecutionFeeMultiplierResponse.TYPE_URL,
    with(QueryMarketAtomicExecutionFeeMultiplierResponseConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<QueryMarketAtomicExecutionFeeMultiplierResponse>):
    QueryMarketAtomicExecutionFeeMultiplierResponse {
  if (typeUrl != QueryMarketAtomicExecutionFeeMultiplierResponse.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}
