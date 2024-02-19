// Transform from injective/exchange/v1beta1/query.proto
@file:GeneratorVersion(version = "0.3.1")

package injective.exchange.v1beta1

import com.google.protobuf.Descriptors
import com.google.protobuf.Parser
import injective.oracle.v1beta1.MetadataStatisticsJvmConverter
import kr.jadekim.protobuf.`annotation`.GeneratorVersion
import kr.jadekim.protobuf.converter.mapper.ProtobufTypeMapper
import kr.jadekim.protobuf.util.asJavaType
import kr.jadekim.protobuf.util.asKotlinType

public object SubaccountJvmConverter : ProtobufTypeMapper<Subaccount, QueryOuterClass.Subaccount> {
  public override val descriptor: Descriptors.Descriptor =
      QueryOuterClass.Subaccount.getDescriptor()

  public override val parser: Parser<QueryOuterClass.Subaccount> =
      QueryOuterClass.Subaccount.parser()

  public override fun convert(obj: QueryOuterClass.Subaccount): Subaccount = Subaccount(
  	trader = obj.getTrader(),
  	subaccountNonce = obj.getSubaccountNonce().asKotlinType,
  )

  public override fun convert(obj: Subaccount): QueryOuterClass.Subaccount {
    val builder = QueryOuterClass.Subaccount.newBuilder()
    builder.setTrader(obj.trader)
    builder.setSubaccountNonce(obj.subaccountNonce.asJavaType)
    return builder.build()
  }
}

public object QuerySubaccountOrdersRequestJvmConverter :
    ProtobufTypeMapper<QuerySubaccountOrdersRequest, QueryOuterClass.QuerySubaccountOrdersRequest> {
  public override val descriptor: Descriptors.Descriptor =
      QueryOuterClass.QuerySubaccountOrdersRequest.getDescriptor()

  public override val parser: Parser<QueryOuterClass.QuerySubaccountOrdersRequest> =
      QueryOuterClass.QuerySubaccountOrdersRequest.parser()

  public override fun convert(obj: QueryOuterClass.QuerySubaccountOrdersRequest):
      QuerySubaccountOrdersRequest = QuerySubaccountOrdersRequest(
  	subaccountId = obj.getSubaccountId(),
  	marketId = obj.getMarketId(),
  )

  public override fun convert(obj: QuerySubaccountOrdersRequest):
      QueryOuterClass.QuerySubaccountOrdersRequest {
    val builder = QueryOuterClass.QuerySubaccountOrdersRequest.newBuilder()
    builder.setSubaccountId(obj.subaccountId)
    builder.setMarketId(obj.marketId)
    return builder.build()
  }
}

public object QuerySubaccountOrdersResponseJvmConverter :
    ProtobufTypeMapper<QuerySubaccountOrdersResponse, QueryOuterClass.QuerySubaccountOrdersResponse>
    {
  public override val descriptor: Descriptors.Descriptor =
      QueryOuterClass.QuerySubaccountOrdersResponse.getDescriptor()

  public override val parser: Parser<QueryOuterClass.QuerySubaccountOrdersResponse> =
      QueryOuterClass.QuerySubaccountOrdersResponse.parser()

  public override fun convert(obj: QueryOuterClass.QuerySubaccountOrdersResponse):
      QuerySubaccountOrdersResponse = QuerySubaccountOrdersResponse(
  	buyOrders = obj.getBuyOrdersList().map { SubaccountOrderDataJvmConverter.convert(it) },
  	sellOrders = obj.getSellOrdersList().map { SubaccountOrderDataJvmConverter.convert(it) },
  )

  public override fun convert(obj: QuerySubaccountOrdersResponse):
      QueryOuterClass.QuerySubaccountOrdersResponse {
    val builder = QueryOuterClass.QuerySubaccountOrdersResponse.newBuilder()
    builder.addAllBuyOrders(obj.buyOrders.map { SubaccountOrderDataJvmConverter.convert(it) })
    builder.addAllSellOrders(obj.sellOrders.map { SubaccountOrderDataJvmConverter.convert(it) })
    return builder.build()
  }
}

public object SubaccountOrderbookMetadataWithMarketJvmConverter :
    ProtobufTypeMapper<SubaccountOrderbookMetadataWithMarket, QueryOuterClass.SubaccountOrderbookMetadataWithMarket>
    {
  public override val descriptor: Descriptors.Descriptor =
      QueryOuterClass.SubaccountOrderbookMetadataWithMarket.getDescriptor()

  public override val parser: Parser<QueryOuterClass.SubaccountOrderbookMetadataWithMarket> =
      QueryOuterClass.SubaccountOrderbookMetadataWithMarket.parser()

  public override fun convert(obj: QueryOuterClass.SubaccountOrderbookMetadataWithMarket):
      SubaccountOrderbookMetadataWithMarket = SubaccountOrderbookMetadataWithMarket(
  	metadata = SubaccountOrderbookMetadataJvmConverter.convert(obj.getMetadata()),
  	marketId = obj.getMarketId(),
  	isBuy = obj.getIsBuy(),
  )

  public override fun convert(obj: SubaccountOrderbookMetadataWithMarket):
      QueryOuterClass.SubaccountOrderbookMetadataWithMarket {
    val builder = QueryOuterClass.SubaccountOrderbookMetadataWithMarket.newBuilder()
    builder.setMetadata(SubaccountOrderbookMetadataJvmConverter.convert(obj.metadata))
    builder.setMarketId(obj.marketId)
    builder.setIsBuy(obj.isBuy)
    return builder.build()
  }
}

public object QueryExchangeParamsRequestJvmConverter :
    ProtobufTypeMapper<QueryExchangeParamsRequest, QueryOuterClass.QueryExchangeParamsRequest> {
  public override val descriptor: Descriptors.Descriptor =
      QueryOuterClass.QueryExchangeParamsRequest.getDescriptor()

  public override val parser: Parser<QueryOuterClass.QueryExchangeParamsRequest> =
      QueryOuterClass.QueryExchangeParamsRequest.parser()

  public override fun convert(obj: QueryOuterClass.QueryExchangeParamsRequest):
      QueryExchangeParamsRequest = QueryExchangeParamsRequest(
  )

  public override fun convert(obj: QueryExchangeParamsRequest):
      QueryOuterClass.QueryExchangeParamsRequest {
    val builder = QueryOuterClass.QueryExchangeParamsRequest.newBuilder()
    return builder.build()
  }
}

public object QueryExchangeParamsResponseJvmConverter :
    ProtobufTypeMapper<QueryExchangeParamsResponse, QueryOuterClass.QueryExchangeParamsResponse> {
  public override val descriptor: Descriptors.Descriptor =
      QueryOuterClass.QueryExchangeParamsResponse.getDescriptor()

  public override val parser: Parser<QueryOuterClass.QueryExchangeParamsResponse> =
      QueryOuterClass.QueryExchangeParamsResponse.parser()

  public override fun convert(obj: QueryOuterClass.QueryExchangeParamsResponse):
      QueryExchangeParamsResponse = QueryExchangeParamsResponse(
  	params = ParamsJvmConverter.convert(obj.getParams()),
  )

  public override fun convert(obj: QueryExchangeParamsResponse):
      QueryOuterClass.QueryExchangeParamsResponse {
    val builder = QueryOuterClass.QueryExchangeParamsResponse.newBuilder()
    builder.setParams(ParamsJvmConverter.convert(obj.params))
    return builder.build()
  }
}

public object QuerySubaccountDepositsRequestJvmConverter :
    ProtobufTypeMapper<QuerySubaccountDepositsRequest, QueryOuterClass.QuerySubaccountDepositsRequest>
    {
  public override val descriptor: Descriptors.Descriptor =
      QueryOuterClass.QuerySubaccountDepositsRequest.getDescriptor()

  public override val parser: Parser<QueryOuterClass.QuerySubaccountDepositsRequest> =
      QueryOuterClass.QuerySubaccountDepositsRequest.parser()

  public override fun convert(obj: QueryOuterClass.QuerySubaccountDepositsRequest):
      QuerySubaccountDepositsRequest = QuerySubaccountDepositsRequest(
  	subaccountId = obj.getSubaccountId(),
  	subaccount = SubaccountJvmConverter.convert(obj.getSubaccount()),
  )

  public override fun convert(obj: QuerySubaccountDepositsRequest):
      QueryOuterClass.QuerySubaccountDepositsRequest {
    val builder = QueryOuterClass.QuerySubaccountDepositsRequest.newBuilder()
    builder.setSubaccountId(obj.subaccountId)
    builder.setSubaccount(SubaccountJvmConverter.convert(obj.subaccount))
    return builder.build()
  }
}

public object QuerySubaccountDepositsResponseJvmConverter :
    ProtobufTypeMapper<QuerySubaccountDepositsResponse, QueryOuterClass.QuerySubaccountDepositsResponse>
    {
  public override val descriptor: Descriptors.Descriptor =
      QueryOuterClass.QuerySubaccountDepositsResponse.getDescriptor()

  public override val parser: Parser<QueryOuterClass.QuerySubaccountDepositsResponse> =
      QueryOuterClass.QuerySubaccountDepositsResponse.parser()

  public override fun convert(obj: QueryOuterClass.QuerySubaccountDepositsResponse):
      QuerySubaccountDepositsResponse = QuerySubaccountDepositsResponse(
  	deposits = obj.getDepositsMap().map { it.key to DepositJvmConverter.convert(it.value) }.toMap(),
  )

  public override fun convert(obj: QuerySubaccountDepositsResponse):
      QueryOuterClass.QuerySubaccountDepositsResponse {
    val builder = QueryOuterClass.QuerySubaccountDepositsResponse.newBuilder()
    builder.putAllDeposits(obj.deposits.map { it.key to DepositJvmConverter.convert(it.value)
        }.toMap())
    return builder.build()
  }
}

public object QueryExchangeBalancesRequestJvmConverter :
    ProtobufTypeMapper<QueryExchangeBalancesRequest, QueryOuterClass.QueryExchangeBalancesRequest> {
  public override val descriptor: Descriptors.Descriptor =
      QueryOuterClass.QueryExchangeBalancesRequest.getDescriptor()

  public override val parser: Parser<QueryOuterClass.QueryExchangeBalancesRequest> =
      QueryOuterClass.QueryExchangeBalancesRequest.parser()

  public override fun convert(obj: QueryOuterClass.QueryExchangeBalancesRequest):
      QueryExchangeBalancesRequest = QueryExchangeBalancesRequest(
  )

  public override fun convert(obj: QueryExchangeBalancesRequest):
      QueryOuterClass.QueryExchangeBalancesRequest {
    val builder = QueryOuterClass.QueryExchangeBalancesRequest.newBuilder()
    return builder.build()
  }
}

public object QueryExchangeBalancesResponseJvmConverter :
    ProtobufTypeMapper<QueryExchangeBalancesResponse, QueryOuterClass.QueryExchangeBalancesResponse>
    {
  public override val descriptor: Descriptors.Descriptor =
      QueryOuterClass.QueryExchangeBalancesResponse.getDescriptor()

  public override val parser: Parser<QueryOuterClass.QueryExchangeBalancesResponse> =
      QueryOuterClass.QueryExchangeBalancesResponse.parser()

  public override fun convert(obj: QueryOuterClass.QueryExchangeBalancesResponse):
      QueryExchangeBalancesResponse = QueryExchangeBalancesResponse(
  	balances = obj.getBalancesList().map { BalanceJvmConverter.convert(it) },
  )

  public override fun convert(obj: QueryExchangeBalancesResponse):
      QueryOuterClass.QueryExchangeBalancesResponse {
    val builder = QueryOuterClass.QueryExchangeBalancesResponse.newBuilder()
    builder.addAllBalances(obj.balances.map { BalanceJvmConverter.convert(it) })
    return builder.build()
  }
}

public object QueryAggregateVolumeRequestJvmConverter :
    ProtobufTypeMapper<QueryAggregateVolumeRequest, QueryOuterClass.QueryAggregateVolumeRequest> {
  public override val descriptor: Descriptors.Descriptor =
      QueryOuterClass.QueryAggregateVolumeRequest.getDescriptor()

  public override val parser: Parser<QueryOuterClass.QueryAggregateVolumeRequest> =
      QueryOuterClass.QueryAggregateVolumeRequest.parser()

  public override fun convert(obj: QueryOuterClass.QueryAggregateVolumeRequest):
      QueryAggregateVolumeRequest = QueryAggregateVolumeRequest(
  	account = obj.getAccount(),
  )

  public override fun convert(obj: QueryAggregateVolumeRequest):
      QueryOuterClass.QueryAggregateVolumeRequest {
    val builder = QueryOuterClass.QueryAggregateVolumeRequest.newBuilder()
    builder.setAccount(obj.account)
    return builder.build()
  }
}

public object QueryAggregateVolumeResponseJvmConverter :
    ProtobufTypeMapper<QueryAggregateVolumeResponse, QueryOuterClass.QueryAggregateVolumeResponse> {
  public override val descriptor: Descriptors.Descriptor =
      QueryOuterClass.QueryAggregateVolumeResponse.getDescriptor()

  public override val parser: Parser<QueryOuterClass.QueryAggregateVolumeResponse> =
      QueryOuterClass.QueryAggregateVolumeResponse.parser()

  public override fun convert(obj: QueryOuterClass.QueryAggregateVolumeResponse):
      QueryAggregateVolumeResponse = QueryAggregateVolumeResponse(
  	aggregateVolumes = obj.getAggregateVolumesList().map { MarketVolumeJvmConverter.convert(it) },
  )

  public override fun convert(obj: QueryAggregateVolumeResponse):
      QueryOuterClass.QueryAggregateVolumeResponse {
    val builder = QueryOuterClass.QueryAggregateVolumeResponse.newBuilder()
    builder.addAllAggregateVolumes(obj.aggregateVolumes.map { MarketVolumeJvmConverter.convert(it)
        })
    return builder.build()
  }
}

public object QueryAggregateVolumesRequestJvmConverter :
    ProtobufTypeMapper<QueryAggregateVolumesRequest, QueryOuterClass.QueryAggregateVolumesRequest> {
  public override val descriptor: Descriptors.Descriptor =
      QueryOuterClass.QueryAggregateVolumesRequest.getDescriptor()

  public override val parser: Parser<QueryOuterClass.QueryAggregateVolumesRequest> =
      QueryOuterClass.QueryAggregateVolumesRequest.parser()

  public override fun convert(obj: QueryOuterClass.QueryAggregateVolumesRequest):
      QueryAggregateVolumesRequest = QueryAggregateVolumesRequest(
  	accounts = obj.getAccountsList().map { it },
  	marketIds = obj.getMarketIdsList().map { it },
  )

  public override fun convert(obj: QueryAggregateVolumesRequest):
      QueryOuterClass.QueryAggregateVolumesRequest {
    val builder = QueryOuterClass.QueryAggregateVolumesRequest.newBuilder()
    builder.addAllAccounts(obj.accounts.map { it })
    builder.addAllMarketIds(obj.marketIds.map { it })
    return builder.build()
  }
}

public object QueryAggregateVolumesResponseJvmConverter :
    ProtobufTypeMapper<QueryAggregateVolumesResponse, QueryOuterClass.QueryAggregateVolumesResponse>
    {
  public override val descriptor: Descriptors.Descriptor =
      QueryOuterClass.QueryAggregateVolumesResponse.getDescriptor()

  public override val parser: Parser<QueryOuterClass.QueryAggregateVolumesResponse> =
      QueryOuterClass.QueryAggregateVolumesResponse.parser()

  public override fun convert(obj: QueryOuterClass.QueryAggregateVolumesResponse):
      QueryAggregateVolumesResponse = QueryAggregateVolumesResponse(
  	aggregateAccountVolumes = obj.getAggregateAccountVolumesList().map {
      AggregateAccountVolumeRecordJvmConverter.convert(it) },
  	aggregateMarketVolumes = obj.getAggregateMarketVolumesList().map {
      MarketVolumeJvmConverter.convert(it) },
  )

  public override fun convert(obj: QueryAggregateVolumesResponse):
      QueryOuterClass.QueryAggregateVolumesResponse {
    val builder = QueryOuterClass.QueryAggregateVolumesResponse.newBuilder()
    builder.addAllAggregateAccountVolumes(obj.aggregateAccountVolumes.map {
        AggregateAccountVolumeRecordJvmConverter.convert(it) })
    builder.addAllAggregateMarketVolumes(obj.aggregateMarketVolumes.map {
        MarketVolumeJvmConverter.convert(it) })
    return builder.build()
  }
}

public object QueryAggregateMarketVolumeRequestJvmConverter :
    ProtobufTypeMapper<QueryAggregateMarketVolumeRequest, QueryOuterClass.QueryAggregateMarketVolumeRequest>
    {
  public override val descriptor: Descriptors.Descriptor =
      QueryOuterClass.QueryAggregateMarketVolumeRequest.getDescriptor()

  public override val parser: Parser<QueryOuterClass.QueryAggregateMarketVolumeRequest> =
      QueryOuterClass.QueryAggregateMarketVolumeRequest.parser()

  public override fun convert(obj: QueryOuterClass.QueryAggregateMarketVolumeRequest):
      QueryAggregateMarketVolumeRequest = QueryAggregateMarketVolumeRequest(
  	marketId = obj.getMarketId(),
  )

  public override fun convert(obj: QueryAggregateMarketVolumeRequest):
      QueryOuterClass.QueryAggregateMarketVolumeRequest {
    val builder = QueryOuterClass.QueryAggregateMarketVolumeRequest.newBuilder()
    builder.setMarketId(obj.marketId)
    return builder.build()
  }
}

public object QueryAggregateMarketVolumeResponseJvmConverter :
    ProtobufTypeMapper<QueryAggregateMarketVolumeResponse, QueryOuterClass.QueryAggregateMarketVolumeResponse>
    {
  public override val descriptor: Descriptors.Descriptor =
      QueryOuterClass.QueryAggregateMarketVolumeResponse.getDescriptor()

  public override val parser: Parser<QueryOuterClass.QueryAggregateMarketVolumeResponse> =
      QueryOuterClass.QueryAggregateMarketVolumeResponse.parser()

  public override fun convert(obj: QueryOuterClass.QueryAggregateMarketVolumeResponse):
      QueryAggregateMarketVolumeResponse = QueryAggregateMarketVolumeResponse(
  	volume = VolumeRecordJvmConverter.convert(obj.getVolume()),
  )

  public override fun convert(obj: QueryAggregateMarketVolumeResponse):
      QueryOuterClass.QueryAggregateMarketVolumeResponse {
    val builder = QueryOuterClass.QueryAggregateMarketVolumeResponse.newBuilder()
    builder.setVolume(VolumeRecordJvmConverter.convert(obj.volume))
    return builder.build()
  }
}

public object QueryDenomDecimalRequestJvmConverter :
    ProtobufTypeMapper<QueryDenomDecimalRequest, QueryOuterClass.QueryDenomDecimalRequest> {
  public override val descriptor: Descriptors.Descriptor =
      QueryOuterClass.QueryDenomDecimalRequest.getDescriptor()

  public override val parser: Parser<QueryOuterClass.QueryDenomDecimalRequest> =
      QueryOuterClass.QueryDenomDecimalRequest.parser()

  public override fun convert(obj: QueryOuterClass.QueryDenomDecimalRequest):
      QueryDenomDecimalRequest = QueryDenomDecimalRequest(
  	denom = obj.getDenom(),
  )

  public override fun convert(obj: QueryDenomDecimalRequest):
      QueryOuterClass.QueryDenomDecimalRequest {
    val builder = QueryOuterClass.QueryDenomDecimalRequest.newBuilder()
    builder.setDenom(obj.denom)
    return builder.build()
  }
}

public object QueryDenomDecimalResponseJvmConverter :
    ProtobufTypeMapper<QueryDenomDecimalResponse, QueryOuterClass.QueryDenomDecimalResponse> {
  public override val descriptor: Descriptors.Descriptor =
      QueryOuterClass.QueryDenomDecimalResponse.getDescriptor()

  public override val parser: Parser<QueryOuterClass.QueryDenomDecimalResponse> =
      QueryOuterClass.QueryDenomDecimalResponse.parser()

  public override fun convert(obj: QueryOuterClass.QueryDenomDecimalResponse):
      QueryDenomDecimalResponse = QueryDenomDecimalResponse(
  	decimal = obj.getDecimal().asKotlinType,
  )

  public override fun convert(obj: QueryDenomDecimalResponse):
      QueryOuterClass.QueryDenomDecimalResponse {
    val builder = QueryOuterClass.QueryDenomDecimalResponse.newBuilder()
    builder.setDecimal(obj.decimal.asJavaType)
    return builder.build()
  }
}

public object QueryDenomDecimalsRequestJvmConverter :
    ProtobufTypeMapper<QueryDenomDecimalsRequest, QueryOuterClass.QueryDenomDecimalsRequest> {
  public override val descriptor: Descriptors.Descriptor =
      QueryOuterClass.QueryDenomDecimalsRequest.getDescriptor()

  public override val parser: Parser<QueryOuterClass.QueryDenomDecimalsRequest> =
      QueryOuterClass.QueryDenomDecimalsRequest.parser()

  public override fun convert(obj: QueryOuterClass.QueryDenomDecimalsRequest):
      QueryDenomDecimalsRequest = QueryDenomDecimalsRequest(
  	denoms = obj.getDenomsList().map { it },
  )

  public override fun convert(obj: QueryDenomDecimalsRequest):
      QueryOuterClass.QueryDenomDecimalsRequest {
    val builder = QueryOuterClass.QueryDenomDecimalsRequest.newBuilder()
    builder.addAllDenoms(obj.denoms.map { it })
    return builder.build()
  }
}

public object QueryDenomDecimalsResponseJvmConverter :
    ProtobufTypeMapper<QueryDenomDecimalsResponse, QueryOuterClass.QueryDenomDecimalsResponse> {
  public override val descriptor: Descriptors.Descriptor =
      QueryOuterClass.QueryDenomDecimalsResponse.getDescriptor()

  public override val parser: Parser<QueryOuterClass.QueryDenomDecimalsResponse> =
      QueryOuterClass.QueryDenomDecimalsResponse.parser()

  public override fun convert(obj: QueryOuterClass.QueryDenomDecimalsResponse):
      QueryDenomDecimalsResponse = QueryDenomDecimalsResponse(
  	denomDecimals = obj.getDenomDecimalsList().map { DenomDecimalsJvmConverter.convert(it) },
  )

  public override fun convert(obj: QueryDenomDecimalsResponse):
      QueryOuterClass.QueryDenomDecimalsResponse {
    val builder = QueryOuterClass.QueryDenomDecimalsResponse.newBuilder()
    builder.addAllDenomDecimals(obj.denomDecimals.map { DenomDecimalsJvmConverter.convert(it) })
    return builder.build()
  }
}

public object QueryAggregateMarketVolumesRequestJvmConverter :
    ProtobufTypeMapper<QueryAggregateMarketVolumesRequest, QueryOuterClass.QueryAggregateMarketVolumesRequest>
    {
  public override val descriptor: Descriptors.Descriptor =
      QueryOuterClass.QueryAggregateMarketVolumesRequest.getDescriptor()

  public override val parser: Parser<QueryOuterClass.QueryAggregateMarketVolumesRequest> =
      QueryOuterClass.QueryAggregateMarketVolumesRequest.parser()

  public override fun convert(obj: QueryOuterClass.QueryAggregateMarketVolumesRequest):
      QueryAggregateMarketVolumesRequest = QueryAggregateMarketVolumesRequest(
  	marketIds = obj.getMarketIdsList().map { it },
  )

  public override fun convert(obj: QueryAggregateMarketVolumesRequest):
      QueryOuterClass.QueryAggregateMarketVolumesRequest {
    val builder = QueryOuterClass.QueryAggregateMarketVolumesRequest.newBuilder()
    builder.addAllMarketIds(obj.marketIds.map { it })
    return builder.build()
  }
}

public object QueryAggregateMarketVolumesResponseJvmConverter :
    ProtobufTypeMapper<QueryAggregateMarketVolumesResponse, QueryOuterClass.QueryAggregateMarketVolumesResponse>
    {
  public override val descriptor: Descriptors.Descriptor =
      QueryOuterClass.QueryAggregateMarketVolumesResponse.getDescriptor()

  public override val parser: Parser<QueryOuterClass.QueryAggregateMarketVolumesResponse> =
      QueryOuterClass.QueryAggregateMarketVolumesResponse.parser()

  public override fun convert(obj: QueryOuterClass.QueryAggregateMarketVolumesResponse):
      QueryAggregateMarketVolumesResponse = QueryAggregateMarketVolumesResponse(
  	volumes = obj.getVolumesList().map { MarketVolumeJvmConverter.convert(it) },
  )

  public override fun convert(obj: QueryAggregateMarketVolumesResponse):
      QueryOuterClass.QueryAggregateMarketVolumesResponse {
    val builder = QueryOuterClass.QueryAggregateMarketVolumesResponse.newBuilder()
    builder.addAllVolumes(obj.volumes.map { MarketVolumeJvmConverter.convert(it) })
    return builder.build()
  }
}

public object QuerySubaccountDepositRequestJvmConverter :
    ProtobufTypeMapper<QuerySubaccountDepositRequest, QueryOuterClass.QuerySubaccountDepositRequest>
    {
  public override val descriptor: Descriptors.Descriptor =
      QueryOuterClass.QuerySubaccountDepositRequest.getDescriptor()

  public override val parser: Parser<QueryOuterClass.QuerySubaccountDepositRequest> =
      QueryOuterClass.QuerySubaccountDepositRequest.parser()

  public override fun convert(obj: QueryOuterClass.QuerySubaccountDepositRequest):
      QuerySubaccountDepositRequest = QuerySubaccountDepositRequest(
  	subaccountId = obj.getSubaccountId(),
  	denom = obj.getDenom(),
  )

  public override fun convert(obj: QuerySubaccountDepositRequest):
      QueryOuterClass.QuerySubaccountDepositRequest {
    val builder = QueryOuterClass.QuerySubaccountDepositRequest.newBuilder()
    builder.setSubaccountId(obj.subaccountId)
    builder.setDenom(obj.denom)
    return builder.build()
  }
}

public object QuerySubaccountDepositResponseJvmConverter :
    ProtobufTypeMapper<QuerySubaccountDepositResponse, QueryOuterClass.QuerySubaccountDepositResponse>
    {
  public override val descriptor: Descriptors.Descriptor =
      QueryOuterClass.QuerySubaccountDepositResponse.getDescriptor()

  public override val parser: Parser<QueryOuterClass.QuerySubaccountDepositResponse> =
      QueryOuterClass.QuerySubaccountDepositResponse.parser()

  public override fun convert(obj: QueryOuterClass.QuerySubaccountDepositResponse):
      QuerySubaccountDepositResponse = QuerySubaccountDepositResponse(
  	deposits = DepositJvmConverter.convert(obj.getDeposits()),
  )

  public override fun convert(obj: QuerySubaccountDepositResponse):
      QueryOuterClass.QuerySubaccountDepositResponse {
    val builder = QueryOuterClass.QuerySubaccountDepositResponse.newBuilder()
    builder.setDeposits(DepositJvmConverter.convert(obj.deposits))
    return builder.build()
  }
}

public object QuerySpotMarketsRequestJvmConverter :
    ProtobufTypeMapper<QuerySpotMarketsRequest, QueryOuterClass.QuerySpotMarketsRequest> {
  public override val descriptor: Descriptors.Descriptor =
      QueryOuterClass.QuerySpotMarketsRequest.getDescriptor()

  public override val parser: Parser<QueryOuterClass.QuerySpotMarketsRequest> =
      QueryOuterClass.QuerySpotMarketsRequest.parser()

  public override fun convert(obj: QueryOuterClass.QuerySpotMarketsRequest): QuerySpotMarketsRequest
      = QuerySpotMarketsRequest(
  	status = obj.getStatus(),
  	marketIds = obj.getMarketIdsList().map { it },
  )

  public override fun convert(obj: QuerySpotMarketsRequest):
      QueryOuterClass.QuerySpotMarketsRequest {
    val builder = QueryOuterClass.QuerySpotMarketsRequest.newBuilder()
    builder.setStatus(obj.status)
    builder.addAllMarketIds(obj.marketIds.map { it })
    return builder.build()
  }
}

public object QuerySpotMarketsResponseJvmConverter :
    ProtobufTypeMapper<QuerySpotMarketsResponse, QueryOuterClass.QuerySpotMarketsResponse> {
  public override val descriptor: Descriptors.Descriptor =
      QueryOuterClass.QuerySpotMarketsResponse.getDescriptor()

  public override val parser: Parser<QueryOuterClass.QuerySpotMarketsResponse> =
      QueryOuterClass.QuerySpotMarketsResponse.parser()

  public override fun convert(obj: QueryOuterClass.QuerySpotMarketsResponse):
      QuerySpotMarketsResponse = QuerySpotMarketsResponse(
  	markets = obj.getMarketsList().map { SpotMarketJvmConverter.convert(it) },
  )

  public override fun convert(obj: QuerySpotMarketsResponse):
      QueryOuterClass.QuerySpotMarketsResponse {
    val builder = QueryOuterClass.QuerySpotMarketsResponse.newBuilder()
    builder.addAllMarkets(obj.markets.map { SpotMarketJvmConverter.convert(it) })
    return builder.build()
  }
}

public object QuerySpotMarketRequestJvmConverter :
    ProtobufTypeMapper<QuerySpotMarketRequest, QueryOuterClass.QuerySpotMarketRequest> {
  public override val descriptor: Descriptors.Descriptor =
      QueryOuterClass.QuerySpotMarketRequest.getDescriptor()

  public override val parser: Parser<QueryOuterClass.QuerySpotMarketRequest> =
      QueryOuterClass.QuerySpotMarketRequest.parser()

  public override fun convert(obj: QueryOuterClass.QuerySpotMarketRequest): QuerySpotMarketRequest =
      QuerySpotMarketRequest(
  	marketId = obj.getMarketId(),
  )

  public override fun convert(obj: QuerySpotMarketRequest): QueryOuterClass.QuerySpotMarketRequest {
    val builder = QueryOuterClass.QuerySpotMarketRequest.newBuilder()
    builder.setMarketId(obj.marketId)
    return builder.build()
  }
}

public object QuerySpotMarketResponseJvmConverter :
    ProtobufTypeMapper<QuerySpotMarketResponse, QueryOuterClass.QuerySpotMarketResponse> {
  public override val descriptor: Descriptors.Descriptor =
      QueryOuterClass.QuerySpotMarketResponse.getDescriptor()

  public override val parser: Parser<QueryOuterClass.QuerySpotMarketResponse> =
      QueryOuterClass.QuerySpotMarketResponse.parser()

  public override fun convert(obj: QueryOuterClass.QuerySpotMarketResponse): QuerySpotMarketResponse
      = QuerySpotMarketResponse(
  	market = SpotMarketJvmConverter.convert(obj.getMarket()),
  )

  public override fun convert(obj: QuerySpotMarketResponse):
      QueryOuterClass.QuerySpotMarketResponse {
    val builder = QueryOuterClass.QuerySpotMarketResponse.newBuilder()
    builder.setMarket(SpotMarketJvmConverter.convert(obj.market))
    return builder.build()
  }
}

public object QuerySpotOrderbookRequestJvmConverter :
    ProtobufTypeMapper<QuerySpotOrderbookRequest, QueryOuterClass.QuerySpotOrderbookRequest> {
  public override val descriptor: Descriptors.Descriptor =
      QueryOuterClass.QuerySpotOrderbookRequest.getDescriptor()

  public override val parser: Parser<QueryOuterClass.QuerySpotOrderbookRequest> =
      QueryOuterClass.QuerySpotOrderbookRequest.parser()

  public override fun convert(obj: QueryOuterClass.QuerySpotOrderbookRequest):
      QuerySpotOrderbookRequest = QuerySpotOrderbookRequest(
  	marketId = obj.getMarketId(),
  	limit = obj.getLimit().asKotlinType,
  	orderSide = OrderSide.forNumber(obj.getOrderSide().number),
  	limitCumulativeNotional = obj.getLimitCumulativeNotional(),
  	limitCumulativeQuantity = obj.getLimitCumulativeQuantity(),
  )

  public override fun convert(obj: QuerySpotOrderbookRequest):
      QueryOuterClass.QuerySpotOrderbookRequest {
    val builder = QueryOuterClass.QuerySpotOrderbookRequest.newBuilder()
    builder.setMarketId(obj.marketId)
    builder.setLimit(obj.limit.asJavaType)
    builder.setOrderSide(QueryOuterClass.OrderSide.forNumber(obj.orderSide.number))
    builder.setLimitCumulativeNotional(obj.limitCumulativeNotional)
    builder.setLimitCumulativeQuantity(obj.limitCumulativeQuantity)
    return builder.build()
  }
}

public object QuerySpotOrderbookResponseJvmConverter :
    ProtobufTypeMapper<QuerySpotOrderbookResponse, QueryOuterClass.QuerySpotOrderbookResponse> {
  public override val descriptor: Descriptors.Descriptor =
      QueryOuterClass.QuerySpotOrderbookResponse.getDescriptor()

  public override val parser: Parser<QueryOuterClass.QuerySpotOrderbookResponse> =
      QueryOuterClass.QuerySpotOrderbookResponse.parser()

  public override fun convert(obj: QueryOuterClass.QuerySpotOrderbookResponse):
      QuerySpotOrderbookResponse = QuerySpotOrderbookResponse(
  	buysPriceLevel = obj.getBuysPriceLevelList().map { LevelJvmConverter.convert(it) },
  	sellsPriceLevel = obj.getSellsPriceLevelList().map { LevelJvmConverter.convert(it) },
  )

  public override fun convert(obj: QuerySpotOrderbookResponse):
      QueryOuterClass.QuerySpotOrderbookResponse {
    val builder = QueryOuterClass.QuerySpotOrderbookResponse.newBuilder()
    builder.addAllBuysPriceLevel(obj.buysPriceLevel.map { LevelJvmConverter.convert(it) })
    builder.addAllSellsPriceLevel(obj.sellsPriceLevel.map { LevelJvmConverter.convert(it) })
    return builder.build()
  }
}

public object FullSpotMarketJvmConverter :
    ProtobufTypeMapper<FullSpotMarket, QueryOuterClass.FullSpotMarket> {
  public override val descriptor: Descriptors.Descriptor =
      QueryOuterClass.FullSpotMarket.getDescriptor()

  public override val parser: Parser<QueryOuterClass.FullSpotMarket> =
      QueryOuterClass.FullSpotMarket.parser()

  public override fun convert(obj: QueryOuterClass.FullSpotMarket): FullSpotMarket = FullSpotMarket(
  	market = SpotMarketJvmConverter.convert(obj.getMarket()),
  	midPriceAndTob = MidPriceAndTOBJvmConverter.convert(obj.getMidPriceAndTob()),
  )

  public override fun convert(obj: FullSpotMarket): QueryOuterClass.FullSpotMarket {
    val builder = QueryOuterClass.FullSpotMarket.newBuilder()
    builder.setMarket(SpotMarketJvmConverter.convert(obj.market))
    builder.setMidPriceAndTob(MidPriceAndTOBJvmConverter.convert(obj.midPriceAndTob))
    return builder.build()
  }
}

public object QueryFullSpotMarketsRequestJvmConverter :
    ProtobufTypeMapper<QueryFullSpotMarketsRequest, QueryOuterClass.QueryFullSpotMarketsRequest> {
  public override val descriptor: Descriptors.Descriptor =
      QueryOuterClass.QueryFullSpotMarketsRequest.getDescriptor()

  public override val parser: Parser<QueryOuterClass.QueryFullSpotMarketsRequest> =
      QueryOuterClass.QueryFullSpotMarketsRequest.parser()

  public override fun convert(obj: QueryOuterClass.QueryFullSpotMarketsRequest):
      QueryFullSpotMarketsRequest = QueryFullSpotMarketsRequest(
  	status = obj.getStatus(),
  	marketIds = obj.getMarketIdsList().map { it },
  	withMidPriceAndTob = obj.getWithMidPriceAndTob(),
  )

  public override fun convert(obj: QueryFullSpotMarketsRequest):
      QueryOuterClass.QueryFullSpotMarketsRequest {
    val builder = QueryOuterClass.QueryFullSpotMarketsRequest.newBuilder()
    builder.setStatus(obj.status)
    builder.addAllMarketIds(obj.marketIds.map { it })
    builder.setWithMidPriceAndTob(obj.withMidPriceAndTob)
    return builder.build()
  }
}

public object QueryFullSpotMarketsResponseJvmConverter :
    ProtobufTypeMapper<QueryFullSpotMarketsResponse, QueryOuterClass.QueryFullSpotMarketsResponse> {
  public override val descriptor: Descriptors.Descriptor =
      QueryOuterClass.QueryFullSpotMarketsResponse.getDescriptor()

  public override val parser: Parser<QueryOuterClass.QueryFullSpotMarketsResponse> =
      QueryOuterClass.QueryFullSpotMarketsResponse.parser()

  public override fun convert(obj: QueryOuterClass.QueryFullSpotMarketsResponse):
      QueryFullSpotMarketsResponse = QueryFullSpotMarketsResponse(
  	markets = obj.getMarketsList().map { FullSpotMarketJvmConverter.convert(it) },
  )

  public override fun convert(obj: QueryFullSpotMarketsResponse):
      QueryOuterClass.QueryFullSpotMarketsResponse {
    val builder = QueryOuterClass.QueryFullSpotMarketsResponse.newBuilder()
    builder.addAllMarkets(obj.markets.map { FullSpotMarketJvmConverter.convert(it) })
    return builder.build()
  }
}

public object QueryFullSpotMarketRequestJvmConverter :
    ProtobufTypeMapper<QueryFullSpotMarketRequest, QueryOuterClass.QueryFullSpotMarketRequest> {
  public override val descriptor: Descriptors.Descriptor =
      QueryOuterClass.QueryFullSpotMarketRequest.getDescriptor()

  public override val parser: Parser<QueryOuterClass.QueryFullSpotMarketRequest> =
      QueryOuterClass.QueryFullSpotMarketRequest.parser()

  public override fun convert(obj: QueryOuterClass.QueryFullSpotMarketRequest):
      QueryFullSpotMarketRequest = QueryFullSpotMarketRequest(
  	marketId = obj.getMarketId(),
  	withMidPriceAndTob = obj.getWithMidPriceAndTob(),
  )

  public override fun convert(obj: QueryFullSpotMarketRequest):
      QueryOuterClass.QueryFullSpotMarketRequest {
    val builder = QueryOuterClass.QueryFullSpotMarketRequest.newBuilder()
    builder.setMarketId(obj.marketId)
    builder.setWithMidPriceAndTob(obj.withMidPriceAndTob)
    return builder.build()
  }
}

public object QueryFullSpotMarketResponseJvmConverter :
    ProtobufTypeMapper<QueryFullSpotMarketResponse, QueryOuterClass.QueryFullSpotMarketResponse> {
  public override val descriptor: Descriptors.Descriptor =
      QueryOuterClass.QueryFullSpotMarketResponse.getDescriptor()

  public override val parser: Parser<QueryOuterClass.QueryFullSpotMarketResponse> =
      QueryOuterClass.QueryFullSpotMarketResponse.parser()

  public override fun convert(obj: QueryOuterClass.QueryFullSpotMarketResponse):
      QueryFullSpotMarketResponse = QueryFullSpotMarketResponse(
  	market = FullSpotMarketJvmConverter.convert(obj.getMarket()),
  )

  public override fun convert(obj: QueryFullSpotMarketResponse):
      QueryOuterClass.QueryFullSpotMarketResponse {
    val builder = QueryOuterClass.QueryFullSpotMarketResponse.newBuilder()
    builder.setMarket(FullSpotMarketJvmConverter.convert(obj.market))
    return builder.build()
  }
}

public object QuerySpotOrdersByHashesRequestJvmConverter :
    ProtobufTypeMapper<QuerySpotOrdersByHashesRequest, QueryOuterClass.QuerySpotOrdersByHashesRequest>
    {
  public override val descriptor: Descriptors.Descriptor =
      QueryOuterClass.QuerySpotOrdersByHashesRequest.getDescriptor()

  public override val parser: Parser<QueryOuterClass.QuerySpotOrdersByHashesRequest> =
      QueryOuterClass.QuerySpotOrdersByHashesRequest.parser()

  public override fun convert(obj: QueryOuterClass.QuerySpotOrdersByHashesRequest):
      QuerySpotOrdersByHashesRequest = QuerySpotOrdersByHashesRequest(
  	marketId = obj.getMarketId(),
  	subaccountId = obj.getSubaccountId(),
  	orderHashes = obj.getOrderHashesList().map { it },
  )

  public override fun convert(obj: QuerySpotOrdersByHashesRequest):
      QueryOuterClass.QuerySpotOrdersByHashesRequest {
    val builder = QueryOuterClass.QuerySpotOrdersByHashesRequest.newBuilder()
    builder.setMarketId(obj.marketId)
    builder.setSubaccountId(obj.subaccountId)
    builder.addAllOrderHashes(obj.orderHashes.map { it })
    return builder.build()
  }
}

public object QuerySpotOrdersByHashesResponseJvmConverter :
    ProtobufTypeMapper<QuerySpotOrdersByHashesResponse, QueryOuterClass.QuerySpotOrdersByHashesResponse>
    {
  public override val descriptor: Descriptors.Descriptor =
      QueryOuterClass.QuerySpotOrdersByHashesResponse.getDescriptor()

  public override val parser: Parser<QueryOuterClass.QuerySpotOrdersByHashesResponse> =
      QueryOuterClass.QuerySpotOrdersByHashesResponse.parser()

  public override fun convert(obj: QueryOuterClass.QuerySpotOrdersByHashesResponse):
      QuerySpotOrdersByHashesResponse = QuerySpotOrdersByHashesResponse(
  	orders = obj.getOrdersList().map { TrimmedSpotLimitOrderJvmConverter.convert(it) },
  )

  public override fun convert(obj: QuerySpotOrdersByHashesResponse):
      QueryOuterClass.QuerySpotOrdersByHashesResponse {
    val builder = QueryOuterClass.QuerySpotOrdersByHashesResponse.newBuilder()
    builder.addAllOrders(obj.orders.map { TrimmedSpotLimitOrderJvmConverter.convert(it) })
    return builder.build()
  }
}

public object QueryTraderSpotOrdersRequestJvmConverter :
    ProtobufTypeMapper<QueryTraderSpotOrdersRequest, QueryOuterClass.QueryTraderSpotOrdersRequest> {
  public override val descriptor: Descriptors.Descriptor =
      QueryOuterClass.QueryTraderSpotOrdersRequest.getDescriptor()

  public override val parser: Parser<QueryOuterClass.QueryTraderSpotOrdersRequest> =
      QueryOuterClass.QueryTraderSpotOrdersRequest.parser()

  public override fun convert(obj: QueryOuterClass.QueryTraderSpotOrdersRequest):
      QueryTraderSpotOrdersRequest = QueryTraderSpotOrdersRequest(
  	marketId = obj.getMarketId(),
  	subaccountId = obj.getSubaccountId(),
  )

  public override fun convert(obj: QueryTraderSpotOrdersRequest):
      QueryOuterClass.QueryTraderSpotOrdersRequest {
    val builder = QueryOuterClass.QueryTraderSpotOrdersRequest.newBuilder()
    builder.setMarketId(obj.marketId)
    builder.setSubaccountId(obj.subaccountId)
    return builder.build()
  }
}

public object QueryAccountAddressSpotOrdersRequestJvmConverter :
    ProtobufTypeMapper<QueryAccountAddressSpotOrdersRequest, QueryOuterClass.QueryAccountAddressSpotOrdersRequest>
    {
  public override val descriptor: Descriptors.Descriptor =
      QueryOuterClass.QueryAccountAddressSpotOrdersRequest.getDescriptor()

  public override val parser: Parser<QueryOuterClass.QueryAccountAddressSpotOrdersRequest> =
      QueryOuterClass.QueryAccountAddressSpotOrdersRequest.parser()

  public override fun convert(obj: QueryOuterClass.QueryAccountAddressSpotOrdersRequest):
      QueryAccountAddressSpotOrdersRequest = QueryAccountAddressSpotOrdersRequest(
  	marketId = obj.getMarketId(),
  	accountAddress = obj.getAccountAddress(),
  )

  public override fun convert(obj: QueryAccountAddressSpotOrdersRequest):
      QueryOuterClass.QueryAccountAddressSpotOrdersRequest {
    val builder = QueryOuterClass.QueryAccountAddressSpotOrdersRequest.newBuilder()
    builder.setMarketId(obj.marketId)
    builder.setAccountAddress(obj.accountAddress)
    return builder.build()
  }
}

public object TrimmedSpotLimitOrderJvmConverter :
    ProtobufTypeMapper<TrimmedSpotLimitOrder, QueryOuterClass.TrimmedSpotLimitOrder> {
  public override val descriptor: Descriptors.Descriptor =
      QueryOuterClass.TrimmedSpotLimitOrder.getDescriptor()

  public override val parser: Parser<QueryOuterClass.TrimmedSpotLimitOrder> =
      QueryOuterClass.TrimmedSpotLimitOrder.parser()

  public override fun convert(obj: QueryOuterClass.TrimmedSpotLimitOrder): TrimmedSpotLimitOrder =
      TrimmedSpotLimitOrder(
  	price = obj.getPrice(),
  	quantity = obj.getQuantity(),
  	fillable = obj.getFillable(),
  	isBuy = obj.getIsBuy(),
  	orderHash = obj.getOrderHash(),
  )

  public override fun convert(obj: TrimmedSpotLimitOrder): QueryOuterClass.TrimmedSpotLimitOrder {
    val builder = QueryOuterClass.TrimmedSpotLimitOrder.newBuilder()
    builder.setPrice(obj.price)
    builder.setQuantity(obj.quantity)
    builder.setFillable(obj.fillable)
    builder.setIsBuy(obj.isBuy)
    builder.setOrderHash(obj.orderHash)
    return builder.build()
  }
}

public object QueryTraderSpotOrdersResponseJvmConverter :
    ProtobufTypeMapper<QueryTraderSpotOrdersResponse, QueryOuterClass.QueryTraderSpotOrdersResponse>
    {
  public override val descriptor: Descriptors.Descriptor =
      QueryOuterClass.QueryTraderSpotOrdersResponse.getDescriptor()

  public override val parser: Parser<QueryOuterClass.QueryTraderSpotOrdersResponse> =
      QueryOuterClass.QueryTraderSpotOrdersResponse.parser()

  public override fun convert(obj: QueryOuterClass.QueryTraderSpotOrdersResponse):
      QueryTraderSpotOrdersResponse = QueryTraderSpotOrdersResponse(
  	orders = obj.getOrdersList().map { TrimmedSpotLimitOrderJvmConverter.convert(it) },
  )

  public override fun convert(obj: QueryTraderSpotOrdersResponse):
      QueryOuterClass.QueryTraderSpotOrdersResponse {
    val builder = QueryOuterClass.QueryTraderSpotOrdersResponse.newBuilder()
    builder.addAllOrders(obj.orders.map { TrimmedSpotLimitOrderJvmConverter.convert(it) })
    return builder.build()
  }
}

public object QueryAccountAddressSpotOrdersResponseJvmConverter :
    ProtobufTypeMapper<QueryAccountAddressSpotOrdersResponse, QueryOuterClass.QueryAccountAddressSpotOrdersResponse>
    {
  public override val descriptor: Descriptors.Descriptor =
      QueryOuterClass.QueryAccountAddressSpotOrdersResponse.getDescriptor()

  public override val parser: Parser<QueryOuterClass.QueryAccountAddressSpotOrdersResponse> =
      QueryOuterClass.QueryAccountAddressSpotOrdersResponse.parser()

  public override fun convert(obj: QueryOuterClass.QueryAccountAddressSpotOrdersResponse):
      QueryAccountAddressSpotOrdersResponse = QueryAccountAddressSpotOrdersResponse(
  	orders = obj.getOrdersList().map { TrimmedSpotLimitOrderJvmConverter.convert(it) },
  )

  public override fun convert(obj: QueryAccountAddressSpotOrdersResponse):
      QueryOuterClass.QueryAccountAddressSpotOrdersResponse {
    val builder = QueryOuterClass.QueryAccountAddressSpotOrdersResponse.newBuilder()
    builder.addAllOrders(obj.orders.map { TrimmedSpotLimitOrderJvmConverter.convert(it) })
    return builder.build()
  }
}

public object QuerySpotMidPriceAndTOBRequestJvmConverter :
    ProtobufTypeMapper<QuerySpotMidPriceAndTOBRequest, QueryOuterClass.QuerySpotMidPriceAndTOBRequest>
    {
  public override val descriptor: Descriptors.Descriptor =
      QueryOuterClass.QuerySpotMidPriceAndTOBRequest.getDescriptor()

  public override val parser: Parser<QueryOuterClass.QuerySpotMidPriceAndTOBRequest> =
      QueryOuterClass.QuerySpotMidPriceAndTOBRequest.parser()

  public override fun convert(obj: QueryOuterClass.QuerySpotMidPriceAndTOBRequest):
      QuerySpotMidPriceAndTOBRequest = QuerySpotMidPriceAndTOBRequest(
  	marketId = obj.getMarketId(),
  )

  public override fun convert(obj: QuerySpotMidPriceAndTOBRequest):
      QueryOuterClass.QuerySpotMidPriceAndTOBRequest {
    val builder = QueryOuterClass.QuerySpotMidPriceAndTOBRequest.newBuilder()
    builder.setMarketId(obj.marketId)
    return builder.build()
  }
}

public object QuerySpotMidPriceAndTOBResponseJvmConverter :
    ProtobufTypeMapper<QuerySpotMidPriceAndTOBResponse, QueryOuterClass.QuerySpotMidPriceAndTOBResponse>
    {
  public override val descriptor: Descriptors.Descriptor =
      QueryOuterClass.QuerySpotMidPriceAndTOBResponse.getDescriptor()

  public override val parser: Parser<QueryOuterClass.QuerySpotMidPriceAndTOBResponse> =
      QueryOuterClass.QuerySpotMidPriceAndTOBResponse.parser()

  public override fun convert(obj: QueryOuterClass.QuerySpotMidPriceAndTOBResponse):
      QuerySpotMidPriceAndTOBResponse = QuerySpotMidPriceAndTOBResponse(
  	midPrice = obj.getMidPrice(),
  	bestBuyPrice = obj.getBestBuyPrice(),
  	bestSellPrice = obj.getBestSellPrice(),
  )

  public override fun convert(obj: QuerySpotMidPriceAndTOBResponse):
      QueryOuterClass.QuerySpotMidPriceAndTOBResponse {
    val builder = QueryOuterClass.QuerySpotMidPriceAndTOBResponse.newBuilder()
    builder.setMidPrice(obj.midPrice)
    builder.setBestBuyPrice(obj.bestBuyPrice)
    builder.setBestSellPrice(obj.bestSellPrice)
    return builder.build()
  }
}

public object QueryDerivativeMidPriceAndTOBRequestJvmConverter :
    ProtobufTypeMapper<QueryDerivativeMidPriceAndTOBRequest, QueryOuterClass.QueryDerivativeMidPriceAndTOBRequest>
    {
  public override val descriptor: Descriptors.Descriptor =
      QueryOuterClass.QueryDerivativeMidPriceAndTOBRequest.getDescriptor()

  public override val parser: Parser<QueryOuterClass.QueryDerivativeMidPriceAndTOBRequest> =
      QueryOuterClass.QueryDerivativeMidPriceAndTOBRequest.parser()

  public override fun convert(obj: QueryOuterClass.QueryDerivativeMidPriceAndTOBRequest):
      QueryDerivativeMidPriceAndTOBRequest = QueryDerivativeMidPriceAndTOBRequest(
  	marketId = obj.getMarketId(),
  )

  public override fun convert(obj: QueryDerivativeMidPriceAndTOBRequest):
      QueryOuterClass.QueryDerivativeMidPriceAndTOBRequest {
    val builder = QueryOuterClass.QueryDerivativeMidPriceAndTOBRequest.newBuilder()
    builder.setMarketId(obj.marketId)
    return builder.build()
  }
}

public object QueryDerivativeMidPriceAndTOBResponseJvmConverter :
    ProtobufTypeMapper<QueryDerivativeMidPriceAndTOBResponse, QueryOuterClass.QueryDerivativeMidPriceAndTOBResponse>
    {
  public override val descriptor: Descriptors.Descriptor =
      QueryOuterClass.QueryDerivativeMidPriceAndTOBResponse.getDescriptor()

  public override val parser: Parser<QueryOuterClass.QueryDerivativeMidPriceAndTOBResponse> =
      QueryOuterClass.QueryDerivativeMidPriceAndTOBResponse.parser()

  public override fun convert(obj: QueryOuterClass.QueryDerivativeMidPriceAndTOBResponse):
      QueryDerivativeMidPriceAndTOBResponse = QueryDerivativeMidPriceAndTOBResponse(
  	midPrice = obj.getMidPrice(),
  	bestBuyPrice = obj.getBestBuyPrice(),
  	bestSellPrice = obj.getBestSellPrice(),
  )

  public override fun convert(obj: QueryDerivativeMidPriceAndTOBResponse):
      QueryOuterClass.QueryDerivativeMidPriceAndTOBResponse {
    val builder = QueryOuterClass.QueryDerivativeMidPriceAndTOBResponse.newBuilder()
    builder.setMidPrice(obj.midPrice)
    builder.setBestBuyPrice(obj.bestBuyPrice)
    builder.setBestSellPrice(obj.bestSellPrice)
    return builder.build()
  }
}

public object QueryDerivativeOrderbookRequestJvmConverter :
    ProtobufTypeMapper<QueryDerivativeOrderbookRequest, QueryOuterClass.QueryDerivativeOrderbookRequest>
    {
  public override val descriptor: Descriptors.Descriptor =
      QueryOuterClass.QueryDerivativeOrderbookRequest.getDescriptor()

  public override val parser: Parser<QueryOuterClass.QueryDerivativeOrderbookRequest> =
      QueryOuterClass.QueryDerivativeOrderbookRequest.parser()

  public override fun convert(obj: QueryOuterClass.QueryDerivativeOrderbookRequest):
      QueryDerivativeOrderbookRequest = QueryDerivativeOrderbookRequest(
  	marketId = obj.getMarketId(),
  	limit = obj.getLimit().asKotlinType,
  	limitCumulativeNotional = obj.getLimitCumulativeNotional(),
  )

  public override fun convert(obj: QueryDerivativeOrderbookRequest):
      QueryOuterClass.QueryDerivativeOrderbookRequest {
    val builder = QueryOuterClass.QueryDerivativeOrderbookRequest.newBuilder()
    builder.setMarketId(obj.marketId)
    builder.setLimit(obj.limit.asJavaType)
    builder.setLimitCumulativeNotional(obj.limitCumulativeNotional)
    return builder.build()
  }
}

public object QueryDerivativeOrderbookResponseJvmConverter :
    ProtobufTypeMapper<QueryDerivativeOrderbookResponse, QueryOuterClass.QueryDerivativeOrderbookResponse>
    {
  public override val descriptor: Descriptors.Descriptor =
      QueryOuterClass.QueryDerivativeOrderbookResponse.getDescriptor()

  public override val parser: Parser<QueryOuterClass.QueryDerivativeOrderbookResponse> =
      QueryOuterClass.QueryDerivativeOrderbookResponse.parser()

  public override fun convert(obj: QueryOuterClass.QueryDerivativeOrderbookResponse):
      QueryDerivativeOrderbookResponse = QueryDerivativeOrderbookResponse(
  	buysPriceLevel = obj.getBuysPriceLevelList().map { LevelJvmConverter.convert(it) },
  	sellsPriceLevel = obj.getSellsPriceLevelList().map { LevelJvmConverter.convert(it) },
  )

  public override fun convert(obj: QueryDerivativeOrderbookResponse):
      QueryOuterClass.QueryDerivativeOrderbookResponse {
    val builder = QueryOuterClass.QueryDerivativeOrderbookResponse.newBuilder()
    builder.addAllBuysPriceLevel(obj.buysPriceLevel.map { LevelJvmConverter.convert(it) })
    builder.addAllSellsPriceLevel(obj.sellsPriceLevel.map { LevelJvmConverter.convert(it) })
    return builder.build()
  }
}

public object QueryTraderSpotOrdersToCancelUpToAmountRequestJvmConverter :
    ProtobufTypeMapper<QueryTraderSpotOrdersToCancelUpToAmountRequest, QueryOuterClass.QueryTraderSpotOrdersToCancelUpToAmountRequest>
    {
  public override val descriptor: Descriptors.Descriptor =
      QueryOuterClass.QueryTraderSpotOrdersToCancelUpToAmountRequest.getDescriptor()

  public override val parser: Parser<QueryOuterClass.QueryTraderSpotOrdersToCancelUpToAmountRequest>
      = QueryOuterClass.QueryTraderSpotOrdersToCancelUpToAmountRequest.parser()

  public override fun convert(obj: QueryOuterClass.QueryTraderSpotOrdersToCancelUpToAmountRequest):
      QueryTraderSpotOrdersToCancelUpToAmountRequest =
      QueryTraderSpotOrdersToCancelUpToAmountRequest(
  	marketId = obj.getMarketId(),
  	subaccountId = obj.getSubaccountId(),
  	baseAmount = obj.getBaseAmount(),
  	quoteAmount = obj.getQuoteAmount(),
  	strategy = CancellationStrategy.forNumber(obj.getStrategy().number),
  	referencePrice = obj.getReferencePrice(),
  )

  public override fun convert(obj: QueryTraderSpotOrdersToCancelUpToAmountRequest):
      QueryOuterClass.QueryTraderSpotOrdersToCancelUpToAmountRequest {
    val builder = QueryOuterClass.QueryTraderSpotOrdersToCancelUpToAmountRequest.newBuilder()
    builder.setMarketId(obj.marketId)
    builder.setSubaccountId(obj.subaccountId)
    builder.setBaseAmount(obj.baseAmount)
    builder.setQuoteAmount(obj.quoteAmount)
    builder.setStrategy(QueryOuterClass.CancellationStrategy.forNumber(obj.strategy.number))
    builder.setReferencePrice(obj.referencePrice)
    return builder.build()
  }
}

public object QueryTraderDerivativeOrdersToCancelUpToAmountRequestJvmConverter :
    ProtobufTypeMapper<QueryTraderDerivativeOrdersToCancelUpToAmountRequest, QueryOuterClass.QueryTraderDerivativeOrdersToCancelUpToAmountRequest>
    {
  public override val descriptor: Descriptors.Descriptor =
      QueryOuterClass.QueryTraderDerivativeOrdersToCancelUpToAmountRequest.getDescriptor()

  public override val parser:
      Parser<QueryOuterClass.QueryTraderDerivativeOrdersToCancelUpToAmountRequest> =
      QueryOuterClass.QueryTraderDerivativeOrdersToCancelUpToAmountRequest.parser()

  public override
      fun convert(obj: QueryOuterClass.QueryTraderDerivativeOrdersToCancelUpToAmountRequest):
      QueryTraderDerivativeOrdersToCancelUpToAmountRequest =
      QueryTraderDerivativeOrdersToCancelUpToAmountRequest(
  	marketId = obj.getMarketId(),
  	subaccountId = obj.getSubaccountId(),
  	quoteAmount = obj.getQuoteAmount(),
  	strategy = CancellationStrategy.forNumber(obj.getStrategy().number),
  	referencePrice = obj.getReferencePrice(),
  )

  public override fun convert(obj: QueryTraderDerivativeOrdersToCancelUpToAmountRequest):
      QueryOuterClass.QueryTraderDerivativeOrdersToCancelUpToAmountRequest {
    val builder = QueryOuterClass.QueryTraderDerivativeOrdersToCancelUpToAmountRequest.newBuilder()
    builder.setMarketId(obj.marketId)
    builder.setSubaccountId(obj.subaccountId)
    builder.setQuoteAmount(obj.quoteAmount)
    builder.setStrategy(QueryOuterClass.CancellationStrategy.forNumber(obj.strategy.number))
    builder.setReferencePrice(obj.referencePrice)
    return builder.build()
  }
}

public object QueryTraderDerivativeOrdersRequestJvmConverter :
    ProtobufTypeMapper<QueryTraderDerivativeOrdersRequest, QueryOuterClass.QueryTraderDerivativeOrdersRequest>
    {
  public override val descriptor: Descriptors.Descriptor =
      QueryOuterClass.QueryTraderDerivativeOrdersRequest.getDescriptor()

  public override val parser: Parser<QueryOuterClass.QueryTraderDerivativeOrdersRequest> =
      QueryOuterClass.QueryTraderDerivativeOrdersRequest.parser()

  public override fun convert(obj: QueryOuterClass.QueryTraderDerivativeOrdersRequest):
      QueryTraderDerivativeOrdersRequest = QueryTraderDerivativeOrdersRequest(
  	marketId = obj.getMarketId(),
  	subaccountId = obj.getSubaccountId(),
  )

  public override fun convert(obj: QueryTraderDerivativeOrdersRequest):
      QueryOuterClass.QueryTraderDerivativeOrdersRequest {
    val builder = QueryOuterClass.QueryTraderDerivativeOrdersRequest.newBuilder()
    builder.setMarketId(obj.marketId)
    builder.setSubaccountId(obj.subaccountId)
    return builder.build()
  }
}

public object QueryAccountAddressDerivativeOrdersRequestJvmConverter :
    ProtobufTypeMapper<QueryAccountAddressDerivativeOrdersRequest, QueryOuterClass.QueryAccountAddressDerivativeOrdersRequest>
    {
  public override val descriptor: Descriptors.Descriptor =
      QueryOuterClass.QueryAccountAddressDerivativeOrdersRequest.getDescriptor()

  public override val parser: Parser<QueryOuterClass.QueryAccountAddressDerivativeOrdersRequest> =
      QueryOuterClass.QueryAccountAddressDerivativeOrdersRequest.parser()

  public override fun convert(obj: QueryOuterClass.QueryAccountAddressDerivativeOrdersRequest):
      QueryAccountAddressDerivativeOrdersRequest = QueryAccountAddressDerivativeOrdersRequest(
  	marketId = obj.getMarketId(),
  	accountAddress = obj.getAccountAddress(),
  )

  public override fun convert(obj: QueryAccountAddressDerivativeOrdersRequest):
      QueryOuterClass.QueryAccountAddressDerivativeOrdersRequest {
    val builder = QueryOuterClass.QueryAccountAddressDerivativeOrdersRequest.newBuilder()
    builder.setMarketId(obj.marketId)
    builder.setAccountAddress(obj.accountAddress)
    return builder.build()
  }
}

public object TrimmedDerivativeLimitOrderJvmConverter :
    ProtobufTypeMapper<TrimmedDerivativeLimitOrder, QueryOuterClass.TrimmedDerivativeLimitOrder> {
  public override val descriptor: Descriptors.Descriptor =
      QueryOuterClass.TrimmedDerivativeLimitOrder.getDescriptor()

  public override val parser: Parser<QueryOuterClass.TrimmedDerivativeLimitOrder> =
      QueryOuterClass.TrimmedDerivativeLimitOrder.parser()

  public override fun convert(obj: QueryOuterClass.TrimmedDerivativeLimitOrder):
      TrimmedDerivativeLimitOrder = TrimmedDerivativeLimitOrder(
  	price = obj.getPrice(),
  	quantity = obj.getQuantity(),
  	margin = obj.getMargin(),
  	fillable = obj.getFillable(),
  	isBuy = obj.getIsBuy(),
  	orderHash = obj.getOrderHash(),
  )

  public override fun convert(obj: TrimmedDerivativeLimitOrder):
      QueryOuterClass.TrimmedDerivativeLimitOrder {
    val builder = QueryOuterClass.TrimmedDerivativeLimitOrder.newBuilder()
    builder.setPrice(obj.price)
    builder.setQuantity(obj.quantity)
    builder.setMargin(obj.margin)
    builder.setFillable(obj.fillable)
    builder.setIsBuy(obj.isBuy)
    builder.setOrderHash(obj.orderHash)
    return builder.build()
  }
}

public object QueryTraderDerivativeOrdersResponseJvmConverter :
    ProtobufTypeMapper<QueryTraderDerivativeOrdersResponse, QueryOuterClass.QueryTraderDerivativeOrdersResponse>
    {
  public override val descriptor: Descriptors.Descriptor =
      QueryOuterClass.QueryTraderDerivativeOrdersResponse.getDescriptor()

  public override val parser: Parser<QueryOuterClass.QueryTraderDerivativeOrdersResponse> =
      QueryOuterClass.QueryTraderDerivativeOrdersResponse.parser()

  public override fun convert(obj: QueryOuterClass.QueryTraderDerivativeOrdersResponse):
      QueryTraderDerivativeOrdersResponse = QueryTraderDerivativeOrdersResponse(
  	orders = obj.getOrdersList().map { TrimmedDerivativeLimitOrderJvmConverter.convert(it) },
  )

  public override fun convert(obj: QueryTraderDerivativeOrdersResponse):
      QueryOuterClass.QueryTraderDerivativeOrdersResponse {
    val builder = QueryOuterClass.QueryTraderDerivativeOrdersResponse.newBuilder()
    builder.addAllOrders(obj.orders.map { TrimmedDerivativeLimitOrderJvmConverter.convert(it) })
    return builder.build()
  }
}

public object QueryAccountAddressDerivativeOrdersResponseJvmConverter :
    ProtobufTypeMapper<QueryAccountAddressDerivativeOrdersResponse, QueryOuterClass.QueryAccountAddressDerivativeOrdersResponse>
    {
  public override val descriptor: Descriptors.Descriptor =
      QueryOuterClass.QueryAccountAddressDerivativeOrdersResponse.getDescriptor()

  public override val parser: Parser<QueryOuterClass.QueryAccountAddressDerivativeOrdersResponse> =
      QueryOuterClass.QueryAccountAddressDerivativeOrdersResponse.parser()

  public override fun convert(obj: QueryOuterClass.QueryAccountAddressDerivativeOrdersResponse):
      QueryAccountAddressDerivativeOrdersResponse = QueryAccountAddressDerivativeOrdersResponse(
  	orders = obj.getOrdersList().map { TrimmedDerivativeLimitOrderJvmConverter.convert(it) },
  )

  public override fun convert(obj: QueryAccountAddressDerivativeOrdersResponse):
      QueryOuterClass.QueryAccountAddressDerivativeOrdersResponse {
    val builder = QueryOuterClass.QueryAccountAddressDerivativeOrdersResponse.newBuilder()
    builder.addAllOrders(obj.orders.map { TrimmedDerivativeLimitOrderJvmConverter.convert(it) })
    return builder.build()
  }
}

public object QueryDerivativeOrdersByHashesRequestJvmConverter :
    ProtobufTypeMapper<QueryDerivativeOrdersByHashesRequest, QueryOuterClass.QueryDerivativeOrdersByHashesRequest>
    {
  public override val descriptor: Descriptors.Descriptor =
      QueryOuterClass.QueryDerivativeOrdersByHashesRequest.getDescriptor()

  public override val parser: Parser<QueryOuterClass.QueryDerivativeOrdersByHashesRequest> =
      QueryOuterClass.QueryDerivativeOrdersByHashesRequest.parser()

  public override fun convert(obj: QueryOuterClass.QueryDerivativeOrdersByHashesRequest):
      QueryDerivativeOrdersByHashesRequest = QueryDerivativeOrdersByHashesRequest(
  	marketId = obj.getMarketId(),
  	subaccountId = obj.getSubaccountId(),
  	orderHashes = obj.getOrderHashesList().map { it },
  )

  public override fun convert(obj: QueryDerivativeOrdersByHashesRequest):
      QueryOuterClass.QueryDerivativeOrdersByHashesRequest {
    val builder = QueryOuterClass.QueryDerivativeOrdersByHashesRequest.newBuilder()
    builder.setMarketId(obj.marketId)
    builder.setSubaccountId(obj.subaccountId)
    builder.addAllOrderHashes(obj.orderHashes.map { it })
    return builder.build()
  }
}

public object QueryDerivativeOrdersByHashesResponseJvmConverter :
    ProtobufTypeMapper<QueryDerivativeOrdersByHashesResponse, QueryOuterClass.QueryDerivativeOrdersByHashesResponse>
    {
  public override val descriptor: Descriptors.Descriptor =
      QueryOuterClass.QueryDerivativeOrdersByHashesResponse.getDescriptor()

  public override val parser: Parser<QueryOuterClass.QueryDerivativeOrdersByHashesResponse> =
      QueryOuterClass.QueryDerivativeOrdersByHashesResponse.parser()

  public override fun convert(obj: QueryOuterClass.QueryDerivativeOrdersByHashesResponse):
      QueryDerivativeOrdersByHashesResponse = QueryDerivativeOrdersByHashesResponse(
  	orders = obj.getOrdersList().map { TrimmedDerivativeLimitOrderJvmConverter.convert(it) },
  )

  public override fun convert(obj: QueryDerivativeOrdersByHashesResponse):
      QueryOuterClass.QueryDerivativeOrdersByHashesResponse {
    val builder = QueryOuterClass.QueryDerivativeOrdersByHashesResponse.newBuilder()
    builder.addAllOrders(obj.orders.map { TrimmedDerivativeLimitOrderJvmConverter.convert(it) })
    return builder.build()
  }
}

public object QueryDerivativeMarketsRequestJvmConverter :
    ProtobufTypeMapper<QueryDerivativeMarketsRequest, QueryOuterClass.QueryDerivativeMarketsRequest>
    {
  public override val descriptor: Descriptors.Descriptor =
      QueryOuterClass.QueryDerivativeMarketsRequest.getDescriptor()

  public override val parser: Parser<QueryOuterClass.QueryDerivativeMarketsRequest> =
      QueryOuterClass.QueryDerivativeMarketsRequest.parser()

  public override fun convert(obj: QueryOuterClass.QueryDerivativeMarketsRequest):
      QueryDerivativeMarketsRequest = QueryDerivativeMarketsRequest(
  	status = obj.getStatus(),
  	marketIds = obj.getMarketIdsList().map { it },
  	withMidPriceAndTob = obj.getWithMidPriceAndTob(),
  )

  public override fun convert(obj: QueryDerivativeMarketsRequest):
      QueryOuterClass.QueryDerivativeMarketsRequest {
    val builder = QueryOuterClass.QueryDerivativeMarketsRequest.newBuilder()
    builder.setStatus(obj.status)
    builder.addAllMarketIds(obj.marketIds.map { it })
    builder.setWithMidPriceAndTob(obj.withMidPriceAndTob)
    return builder.build()
  }
}

public object PriceLevelJvmConverter : ProtobufTypeMapper<PriceLevel, QueryOuterClass.PriceLevel> {
  public override val descriptor: Descriptors.Descriptor =
      QueryOuterClass.PriceLevel.getDescriptor()

  public override val parser: Parser<QueryOuterClass.PriceLevel> =
      QueryOuterClass.PriceLevel.parser()

  public override fun convert(obj: QueryOuterClass.PriceLevel): PriceLevel = PriceLevel(
  	price = obj.getPrice(),
  	quantity = obj.getQuantity(),
  )

  public override fun convert(obj: PriceLevel): QueryOuterClass.PriceLevel {
    val builder = QueryOuterClass.PriceLevel.newBuilder()
    builder.setPrice(obj.price)
    builder.setQuantity(obj.quantity)
    return builder.build()
  }
}

public object PerpetualMarketStateJvmConverter :
    ProtobufTypeMapper<PerpetualMarketState, QueryOuterClass.PerpetualMarketState> {
  public override val descriptor: Descriptors.Descriptor =
      QueryOuterClass.PerpetualMarketState.getDescriptor()

  public override val parser: Parser<QueryOuterClass.PerpetualMarketState> =
      QueryOuterClass.PerpetualMarketState.parser()

  public override fun convert(obj: QueryOuterClass.PerpetualMarketState): PerpetualMarketState =
      PerpetualMarketState(
  	marketInfo = PerpetualMarketInfoJvmConverter.convert(obj.getMarketInfo()),
  	fundingInfo = PerpetualMarketFundingJvmConverter.convert(obj.getFundingInfo()),
  )

  public override fun convert(obj: PerpetualMarketState): QueryOuterClass.PerpetualMarketState {
    val builder = QueryOuterClass.PerpetualMarketState.newBuilder()
    builder.setMarketInfo(PerpetualMarketInfoJvmConverter.convert(obj.marketInfo))
    builder.setFundingInfo(PerpetualMarketFundingJvmConverter.convert(obj.fundingInfo))
    return builder.build()
  }
}

public object FullDerivativeMarketJvmConverter :
    ProtobufTypeMapper<FullDerivativeMarket, QueryOuterClass.FullDerivativeMarket> {
  public override val descriptor: Descriptors.Descriptor =
      QueryOuterClass.FullDerivativeMarket.getDescriptor()

  public override val parser: Parser<QueryOuterClass.FullDerivativeMarket> =
      QueryOuterClass.FullDerivativeMarket.parser()

  public override fun convert(obj: QueryOuterClass.FullDerivativeMarket): FullDerivativeMarket =
      FullDerivativeMarket(
  	market = DerivativeMarketJvmConverter.convert(obj.getMarket()),
  	markPrice = obj.getMarkPrice(),
  	midPriceAndTob = MidPriceAndTOBJvmConverter.convert(obj.getMidPriceAndTob()),
  	info = mapOf(
  2 to {
      FullDerivativeMarket.InfoOneOf.PerpetualInfo(PerpetualMarketStateJvmConverter.convert(obj.getPerpetualInfo()))
      },
  3 to {
      FullDerivativeMarket.InfoOneOf.FuturesInfo(ExpiryFuturesMarketInfoJvmConverter.convert(obj.getFuturesInfo()))
      },
  ).getValue(obj.infoCase.number)(),
  )

  public override fun convert(obj: FullDerivativeMarket): QueryOuterClass.FullDerivativeMarket {
    val builder = QueryOuterClass.FullDerivativeMarket.newBuilder()
    builder.setMarket(DerivativeMarketJvmConverter.convert(obj.market))
    builder.setMarkPrice(obj.markPrice)
    builder.setMidPriceAndTob(MidPriceAndTOBJvmConverter.convert(obj.midPriceAndTob))
    when (obj.info) {
      is FullDerivativeMarket.InfoOneOf.PerpetualInfo ->
          builder.setPerpetualInfo(PerpetualMarketStateJvmConverter.convert(obj.info.value))
      is FullDerivativeMarket.InfoOneOf.FuturesInfo ->
          builder.setFuturesInfo(ExpiryFuturesMarketInfoJvmConverter.convert(obj.info.value))
    }
    return builder.build()
  }
}

public object QueryDerivativeMarketsResponseJvmConverter :
    ProtobufTypeMapper<QueryDerivativeMarketsResponse, QueryOuterClass.QueryDerivativeMarketsResponse>
    {
  public override val descriptor: Descriptors.Descriptor =
      QueryOuterClass.QueryDerivativeMarketsResponse.getDescriptor()

  public override val parser: Parser<QueryOuterClass.QueryDerivativeMarketsResponse> =
      QueryOuterClass.QueryDerivativeMarketsResponse.parser()

  public override fun convert(obj: QueryOuterClass.QueryDerivativeMarketsResponse):
      QueryDerivativeMarketsResponse = QueryDerivativeMarketsResponse(
  	markets = obj.getMarketsList().map { FullDerivativeMarketJvmConverter.convert(it) },
  )

  public override fun convert(obj: QueryDerivativeMarketsResponse):
      QueryOuterClass.QueryDerivativeMarketsResponse {
    val builder = QueryOuterClass.QueryDerivativeMarketsResponse.newBuilder()
    builder.addAllMarkets(obj.markets.map { FullDerivativeMarketJvmConverter.convert(it) })
    return builder.build()
  }
}

public object QueryDerivativeMarketRequestJvmConverter :
    ProtobufTypeMapper<QueryDerivativeMarketRequest, QueryOuterClass.QueryDerivativeMarketRequest> {
  public override val descriptor: Descriptors.Descriptor =
      QueryOuterClass.QueryDerivativeMarketRequest.getDescriptor()

  public override val parser: Parser<QueryOuterClass.QueryDerivativeMarketRequest> =
      QueryOuterClass.QueryDerivativeMarketRequest.parser()

  public override fun convert(obj: QueryOuterClass.QueryDerivativeMarketRequest):
      QueryDerivativeMarketRequest = QueryDerivativeMarketRequest(
  	marketId = obj.getMarketId(),
  )

  public override fun convert(obj: QueryDerivativeMarketRequest):
      QueryOuterClass.QueryDerivativeMarketRequest {
    val builder = QueryOuterClass.QueryDerivativeMarketRequest.newBuilder()
    builder.setMarketId(obj.marketId)
    return builder.build()
  }
}

public object QueryDerivativeMarketResponseJvmConverter :
    ProtobufTypeMapper<QueryDerivativeMarketResponse, QueryOuterClass.QueryDerivativeMarketResponse>
    {
  public override val descriptor: Descriptors.Descriptor =
      QueryOuterClass.QueryDerivativeMarketResponse.getDescriptor()

  public override val parser: Parser<QueryOuterClass.QueryDerivativeMarketResponse> =
      QueryOuterClass.QueryDerivativeMarketResponse.parser()

  public override fun convert(obj: QueryOuterClass.QueryDerivativeMarketResponse):
      QueryDerivativeMarketResponse = QueryDerivativeMarketResponse(
  	market = FullDerivativeMarketJvmConverter.convert(obj.getMarket()),
  )

  public override fun convert(obj: QueryDerivativeMarketResponse):
      QueryOuterClass.QueryDerivativeMarketResponse {
    val builder = QueryOuterClass.QueryDerivativeMarketResponse.newBuilder()
    builder.setMarket(FullDerivativeMarketJvmConverter.convert(obj.market))
    return builder.build()
  }
}

public object QueryDerivativeMarketAddressRequestJvmConverter :
    ProtobufTypeMapper<QueryDerivativeMarketAddressRequest, QueryOuterClass.QueryDerivativeMarketAddressRequest>
    {
  public override val descriptor: Descriptors.Descriptor =
      QueryOuterClass.QueryDerivativeMarketAddressRequest.getDescriptor()

  public override val parser: Parser<QueryOuterClass.QueryDerivativeMarketAddressRequest> =
      QueryOuterClass.QueryDerivativeMarketAddressRequest.parser()

  public override fun convert(obj: QueryOuterClass.QueryDerivativeMarketAddressRequest):
      QueryDerivativeMarketAddressRequest = QueryDerivativeMarketAddressRequest(
  	marketId = obj.getMarketId(),
  )

  public override fun convert(obj: QueryDerivativeMarketAddressRequest):
      QueryOuterClass.QueryDerivativeMarketAddressRequest {
    val builder = QueryOuterClass.QueryDerivativeMarketAddressRequest.newBuilder()
    builder.setMarketId(obj.marketId)
    return builder.build()
  }
}

public object QueryDerivativeMarketAddressResponseJvmConverter :
    ProtobufTypeMapper<QueryDerivativeMarketAddressResponse, QueryOuterClass.QueryDerivativeMarketAddressResponse>
    {
  public override val descriptor: Descriptors.Descriptor =
      QueryOuterClass.QueryDerivativeMarketAddressResponse.getDescriptor()

  public override val parser: Parser<QueryOuterClass.QueryDerivativeMarketAddressResponse> =
      QueryOuterClass.QueryDerivativeMarketAddressResponse.parser()

  public override fun convert(obj: QueryOuterClass.QueryDerivativeMarketAddressResponse):
      QueryDerivativeMarketAddressResponse = QueryDerivativeMarketAddressResponse(
  	address = obj.getAddress(),
  	subaccountId = obj.getSubaccountId(),
  )

  public override fun convert(obj: QueryDerivativeMarketAddressResponse):
      QueryOuterClass.QueryDerivativeMarketAddressResponse {
    val builder = QueryOuterClass.QueryDerivativeMarketAddressResponse.newBuilder()
    builder.setAddress(obj.address)
    builder.setSubaccountId(obj.subaccountId)
    return builder.build()
  }
}

public object QuerySubaccountTradeNonceRequestJvmConverter :
    ProtobufTypeMapper<QuerySubaccountTradeNonceRequest, QueryOuterClass.QuerySubaccountTradeNonceRequest>
    {
  public override val descriptor: Descriptors.Descriptor =
      QueryOuterClass.QuerySubaccountTradeNonceRequest.getDescriptor()

  public override val parser: Parser<QueryOuterClass.QuerySubaccountTradeNonceRequest> =
      QueryOuterClass.QuerySubaccountTradeNonceRequest.parser()

  public override fun convert(obj: QueryOuterClass.QuerySubaccountTradeNonceRequest):
      QuerySubaccountTradeNonceRequest = QuerySubaccountTradeNonceRequest(
  	subaccountId = obj.getSubaccountId(),
  )

  public override fun convert(obj: QuerySubaccountTradeNonceRequest):
      QueryOuterClass.QuerySubaccountTradeNonceRequest {
    val builder = QueryOuterClass.QuerySubaccountTradeNonceRequest.newBuilder()
    builder.setSubaccountId(obj.subaccountId)
    return builder.build()
  }
}

public object QuerySubaccountPositionsRequestJvmConverter :
    ProtobufTypeMapper<QuerySubaccountPositionsRequest, QueryOuterClass.QuerySubaccountPositionsRequest>
    {
  public override val descriptor: Descriptors.Descriptor =
      QueryOuterClass.QuerySubaccountPositionsRequest.getDescriptor()

  public override val parser: Parser<QueryOuterClass.QuerySubaccountPositionsRequest> =
      QueryOuterClass.QuerySubaccountPositionsRequest.parser()

  public override fun convert(obj: QueryOuterClass.QuerySubaccountPositionsRequest):
      QuerySubaccountPositionsRequest = QuerySubaccountPositionsRequest(
  	subaccountId = obj.getSubaccountId(),
  )

  public override fun convert(obj: QuerySubaccountPositionsRequest):
      QueryOuterClass.QuerySubaccountPositionsRequest {
    val builder = QueryOuterClass.QuerySubaccountPositionsRequest.newBuilder()
    builder.setSubaccountId(obj.subaccountId)
    return builder.build()
  }
}

public object QuerySubaccountPositionInMarketRequestJvmConverter :
    ProtobufTypeMapper<QuerySubaccountPositionInMarketRequest, QueryOuterClass.QuerySubaccountPositionInMarketRequest>
    {
  public override val descriptor: Descriptors.Descriptor =
      QueryOuterClass.QuerySubaccountPositionInMarketRequest.getDescriptor()

  public override val parser: Parser<QueryOuterClass.QuerySubaccountPositionInMarketRequest> =
      QueryOuterClass.QuerySubaccountPositionInMarketRequest.parser()

  public override fun convert(obj: QueryOuterClass.QuerySubaccountPositionInMarketRequest):
      QuerySubaccountPositionInMarketRequest = QuerySubaccountPositionInMarketRequest(
  	subaccountId = obj.getSubaccountId(),
  	marketId = obj.getMarketId(),
  )

  public override fun convert(obj: QuerySubaccountPositionInMarketRequest):
      QueryOuterClass.QuerySubaccountPositionInMarketRequest {
    val builder = QueryOuterClass.QuerySubaccountPositionInMarketRequest.newBuilder()
    builder.setSubaccountId(obj.subaccountId)
    builder.setMarketId(obj.marketId)
    return builder.build()
  }
}

public object QuerySubaccountEffectivePositionInMarketRequestJvmConverter :
    ProtobufTypeMapper<QuerySubaccountEffectivePositionInMarketRequest, QueryOuterClass.QuerySubaccountEffectivePositionInMarketRequest>
    {
  public override val descriptor: Descriptors.Descriptor =
      QueryOuterClass.QuerySubaccountEffectivePositionInMarketRequest.getDescriptor()

  public override val parser:
      Parser<QueryOuterClass.QuerySubaccountEffectivePositionInMarketRequest> =
      QueryOuterClass.QuerySubaccountEffectivePositionInMarketRequest.parser()

  public override fun convert(obj: QueryOuterClass.QuerySubaccountEffectivePositionInMarketRequest):
      QuerySubaccountEffectivePositionInMarketRequest =
      QuerySubaccountEffectivePositionInMarketRequest(
  	subaccountId = obj.getSubaccountId(),
  	marketId = obj.getMarketId(),
  )

  public override fun convert(obj: QuerySubaccountEffectivePositionInMarketRequest):
      QueryOuterClass.QuerySubaccountEffectivePositionInMarketRequest {
    val builder = QueryOuterClass.QuerySubaccountEffectivePositionInMarketRequest.newBuilder()
    builder.setSubaccountId(obj.subaccountId)
    builder.setMarketId(obj.marketId)
    return builder.build()
  }
}

public object QuerySubaccountOrderMetadataRequestJvmConverter :
    ProtobufTypeMapper<QuerySubaccountOrderMetadataRequest, QueryOuterClass.QuerySubaccountOrderMetadataRequest>
    {
  public override val descriptor: Descriptors.Descriptor =
      QueryOuterClass.QuerySubaccountOrderMetadataRequest.getDescriptor()

  public override val parser: Parser<QueryOuterClass.QuerySubaccountOrderMetadataRequest> =
      QueryOuterClass.QuerySubaccountOrderMetadataRequest.parser()

  public override fun convert(obj: QueryOuterClass.QuerySubaccountOrderMetadataRequest):
      QuerySubaccountOrderMetadataRequest = QuerySubaccountOrderMetadataRequest(
  	subaccountId = obj.getSubaccountId(),
  )

  public override fun convert(obj: QuerySubaccountOrderMetadataRequest):
      QueryOuterClass.QuerySubaccountOrderMetadataRequest {
    val builder = QueryOuterClass.QuerySubaccountOrderMetadataRequest.newBuilder()
    builder.setSubaccountId(obj.subaccountId)
    return builder.build()
  }
}

public object QuerySubaccountPositionsResponseJvmConverter :
    ProtobufTypeMapper<QuerySubaccountPositionsResponse, QueryOuterClass.QuerySubaccountPositionsResponse>
    {
  public override val descriptor: Descriptors.Descriptor =
      QueryOuterClass.QuerySubaccountPositionsResponse.getDescriptor()

  public override val parser: Parser<QueryOuterClass.QuerySubaccountPositionsResponse> =
      QueryOuterClass.QuerySubaccountPositionsResponse.parser()

  public override fun convert(obj: QueryOuterClass.QuerySubaccountPositionsResponse):
      QuerySubaccountPositionsResponse = QuerySubaccountPositionsResponse(
  	state = obj.getStateList().map { DerivativePositionJvmConverter.convert(it) },
  )

  public override fun convert(obj: QuerySubaccountPositionsResponse):
      QueryOuterClass.QuerySubaccountPositionsResponse {
    val builder = QueryOuterClass.QuerySubaccountPositionsResponse.newBuilder()
    builder.addAllState(obj.state.map { DerivativePositionJvmConverter.convert(it) })
    return builder.build()
  }
}

public object QuerySubaccountPositionInMarketResponseJvmConverter :
    ProtobufTypeMapper<QuerySubaccountPositionInMarketResponse, QueryOuterClass.QuerySubaccountPositionInMarketResponse>
    {
  public override val descriptor: Descriptors.Descriptor =
      QueryOuterClass.QuerySubaccountPositionInMarketResponse.getDescriptor()

  public override val parser: Parser<QueryOuterClass.QuerySubaccountPositionInMarketResponse> =
      QueryOuterClass.QuerySubaccountPositionInMarketResponse.parser()

  public override fun convert(obj: QueryOuterClass.QuerySubaccountPositionInMarketResponse):
      QuerySubaccountPositionInMarketResponse = QuerySubaccountPositionInMarketResponse(
  	state = PositionJvmConverter.convert(obj.getState()),
  )

  public override fun convert(obj: QuerySubaccountPositionInMarketResponse):
      QueryOuterClass.QuerySubaccountPositionInMarketResponse {
    val builder = QueryOuterClass.QuerySubaccountPositionInMarketResponse.newBuilder()
    builder.setState(PositionJvmConverter.convert(obj.state))
    return builder.build()
  }
}

public object EffectivePositionJvmConverter :
    ProtobufTypeMapper<EffectivePosition, QueryOuterClass.EffectivePosition> {
  public override val descriptor: Descriptors.Descriptor =
      QueryOuterClass.EffectivePosition.getDescriptor()

  public override val parser: Parser<QueryOuterClass.EffectivePosition> =
      QueryOuterClass.EffectivePosition.parser()

  public override fun convert(obj: QueryOuterClass.EffectivePosition): EffectivePosition =
      EffectivePosition(
  	isLong = obj.getIsLong(),
  	quantity = obj.getQuantity(),
  	entryPrice = obj.getEntryPrice(),
  	effectiveMargin = obj.getEffectiveMargin(),
  )

  public override fun convert(obj: EffectivePosition): QueryOuterClass.EffectivePosition {
    val builder = QueryOuterClass.EffectivePosition.newBuilder()
    builder.setIsLong(obj.isLong)
    builder.setQuantity(obj.quantity)
    builder.setEntryPrice(obj.entryPrice)
    builder.setEffectiveMargin(obj.effectiveMargin)
    return builder.build()
  }
}

public object QuerySubaccountEffectivePositionInMarketResponseJvmConverter :
    ProtobufTypeMapper<QuerySubaccountEffectivePositionInMarketResponse, QueryOuterClass.QuerySubaccountEffectivePositionInMarketResponse>
    {
  public override val descriptor: Descriptors.Descriptor =
      QueryOuterClass.QuerySubaccountEffectivePositionInMarketResponse.getDescriptor()

  public override val parser:
      Parser<QueryOuterClass.QuerySubaccountEffectivePositionInMarketResponse> =
      QueryOuterClass.QuerySubaccountEffectivePositionInMarketResponse.parser()

  public override
      fun convert(obj: QueryOuterClass.QuerySubaccountEffectivePositionInMarketResponse):
      QuerySubaccountEffectivePositionInMarketResponse =
      QuerySubaccountEffectivePositionInMarketResponse(
  	state = EffectivePositionJvmConverter.convert(obj.getState()),
  )

  public override fun convert(obj: QuerySubaccountEffectivePositionInMarketResponse):
      QueryOuterClass.QuerySubaccountEffectivePositionInMarketResponse {
    val builder = QueryOuterClass.QuerySubaccountEffectivePositionInMarketResponse.newBuilder()
    builder.setState(EffectivePositionJvmConverter.convert(obj.state))
    return builder.build()
  }
}

public object QueryPerpetualMarketInfoRequestJvmConverter :
    ProtobufTypeMapper<QueryPerpetualMarketInfoRequest, QueryOuterClass.QueryPerpetualMarketInfoRequest>
    {
  public override val descriptor: Descriptors.Descriptor =
      QueryOuterClass.QueryPerpetualMarketInfoRequest.getDescriptor()

  public override val parser: Parser<QueryOuterClass.QueryPerpetualMarketInfoRequest> =
      QueryOuterClass.QueryPerpetualMarketInfoRequest.parser()

  public override fun convert(obj: QueryOuterClass.QueryPerpetualMarketInfoRequest):
      QueryPerpetualMarketInfoRequest = QueryPerpetualMarketInfoRequest(
  	marketId = obj.getMarketId(),
  )

  public override fun convert(obj: QueryPerpetualMarketInfoRequest):
      QueryOuterClass.QueryPerpetualMarketInfoRequest {
    val builder = QueryOuterClass.QueryPerpetualMarketInfoRequest.newBuilder()
    builder.setMarketId(obj.marketId)
    return builder.build()
  }
}

public object QueryPerpetualMarketInfoResponseJvmConverter :
    ProtobufTypeMapper<QueryPerpetualMarketInfoResponse, QueryOuterClass.QueryPerpetualMarketInfoResponse>
    {
  public override val descriptor: Descriptors.Descriptor =
      QueryOuterClass.QueryPerpetualMarketInfoResponse.getDescriptor()

  public override val parser: Parser<QueryOuterClass.QueryPerpetualMarketInfoResponse> =
      QueryOuterClass.QueryPerpetualMarketInfoResponse.parser()

  public override fun convert(obj: QueryOuterClass.QueryPerpetualMarketInfoResponse):
      QueryPerpetualMarketInfoResponse = QueryPerpetualMarketInfoResponse(
  	info = PerpetualMarketInfoJvmConverter.convert(obj.getInfo()),
  )

  public override fun convert(obj: QueryPerpetualMarketInfoResponse):
      QueryOuterClass.QueryPerpetualMarketInfoResponse {
    val builder = QueryOuterClass.QueryPerpetualMarketInfoResponse.newBuilder()
    builder.setInfo(PerpetualMarketInfoJvmConverter.convert(obj.info))
    return builder.build()
  }
}

public object QueryExpiryFuturesMarketInfoRequestJvmConverter :
    ProtobufTypeMapper<QueryExpiryFuturesMarketInfoRequest, QueryOuterClass.QueryExpiryFuturesMarketInfoRequest>
    {
  public override val descriptor: Descriptors.Descriptor =
      QueryOuterClass.QueryExpiryFuturesMarketInfoRequest.getDescriptor()

  public override val parser: Parser<QueryOuterClass.QueryExpiryFuturesMarketInfoRequest> =
      QueryOuterClass.QueryExpiryFuturesMarketInfoRequest.parser()

  public override fun convert(obj: QueryOuterClass.QueryExpiryFuturesMarketInfoRequest):
      QueryExpiryFuturesMarketInfoRequest = QueryExpiryFuturesMarketInfoRequest(
  	marketId = obj.getMarketId(),
  )

  public override fun convert(obj: QueryExpiryFuturesMarketInfoRequest):
      QueryOuterClass.QueryExpiryFuturesMarketInfoRequest {
    val builder = QueryOuterClass.QueryExpiryFuturesMarketInfoRequest.newBuilder()
    builder.setMarketId(obj.marketId)
    return builder.build()
  }
}

public object QueryExpiryFuturesMarketInfoResponseJvmConverter :
    ProtobufTypeMapper<QueryExpiryFuturesMarketInfoResponse, QueryOuterClass.QueryExpiryFuturesMarketInfoResponse>
    {
  public override val descriptor: Descriptors.Descriptor =
      QueryOuterClass.QueryExpiryFuturesMarketInfoResponse.getDescriptor()

  public override val parser: Parser<QueryOuterClass.QueryExpiryFuturesMarketInfoResponse> =
      QueryOuterClass.QueryExpiryFuturesMarketInfoResponse.parser()

  public override fun convert(obj: QueryOuterClass.QueryExpiryFuturesMarketInfoResponse):
      QueryExpiryFuturesMarketInfoResponse = QueryExpiryFuturesMarketInfoResponse(
  	info = ExpiryFuturesMarketInfoJvmConverter.convert(obj.getInfo()),
  )

  public override fun convert(obj: QueryExpiryFuturesMarketInfoResponse):
      QueryOuterClass.QueryExpiryFuturesMarketInfoResponse {
    val builder = QueryOuterClass.QueryExpiryFuturesMarketInfoResponse.newBuilder()
    builder.setInfo(ExpiryFuturesMarketInfoJvmConverter.convert(obj.info))
    return builder.build()
  }
}

public object QueryPerpetualMarketFundingRequestJvmConverter :
    ProtobufTypeMapper<QueryPerpetualMarketFundingRequest, QueryOuterClass.QueryPerpetualMarketFundingRequest>
    {
  public override val descriptor: Descriptors.Descriptor =
      QueryOuterClass.QueryPerpetualMarketFundingRequest.getDescriptor()

  public override val parser: Parser<QueryOuterClass.QueryPerpetualMarketFundingRequest> =
      QueryOuterClass.QueryPerpetualMarketFundingRequest.parser()

  public override fun convert(obj: QueryOuterClass.QueryPerpetualMarketFundingRequest):
      QueryPerpetualMarketFundingRequest = QueryPerpetualMarketFundingRequest(
  	marketId = obj.getMarketId(),
  )

  public override fun convert(obj: QueryPerpetualMarketFundingRequest):
      QueryOuterClass.QueryPerpetualMarketFundingRequest {
    val builder = QueryOuterClass.QueryPerpetualMarketFundingRequest.newBuilder()
    builder.setMarketId(obj.marketId)
    return builder.build()
  }
}

public object QueryPerpetualMarketFundingResponseJvmConverter :
    ProtobufTypeMapper<QueryPerpetualMarketFundingResponse, QueryOuterClass.QueryPerpetualMarketFundingResponse>
    {
  public override val descriptor: Descriptors.Descriptor =
      QueryOuterClass.QueryPerpetualMarketFundingResponse.getDescriptor()

  public override val parser: Parser<QueryOuterClass.QueryPerpetualMarketFundingResponse> =
      QueryOuterClass.QueryPerpetualMarketFundingResponse.parser()

  public override fun convert(obj: QueryOuterClass.QueryPerpetualMarketFundingResponse):
      QueryPerpetualMarketFundingResponse = QueryPerpetualMarketFundingResponse(
  	state = PerpetualMarketFundingJvmConverter.convert(obj.getState()),
  )

  public override fun convert(obj: QueryPerpetualMarketFundingResponse):
      QueryOuterClass.QueryPerpetualMarketFundingResponse {
    val builder = QueryOuterClass.QueryPerpetualMarketFundingResponse.newBuilder()
    builder.setState(PerpetualMarketFundingJvmConverter.convert(obj.state))
    return builder.build()
  }
}

public object QuerySubaccountOrderMetadataResponseJvmConverter :
    ProtobufTypeMapper<QuerySubaccountOrderMetadataResponse, QueryOuterClass.QuerySubaccountOrderMetadataResponse>
    {
  public override val descriptor: Descriptors.Descriptor =
      QueryOuterClass.QuerySubaccountOrderMetadataResponse.getDescriptor()

  public override val parser: Parser<QueryOuterClass.QuerySubaccountOrderMetadataResponse> =
      QueryOuterClass.QuerySubaccountOrderMetadataResponse.parser()

  public override fun convert(obj: QueryOuterClass.QuerySubaccountOrderMetadataResponse):
      QuerySubaccountOrderMetadataResponse = QuerySubaccountOrderMetadataResponse(
  	metadata = obj.getMetadataList().map {
      SubaccountOrderbookMetadataWithMarketJvmConverter.convert(it) },
  )

  public override fun convert(obj: QuerySubaccountOrderMetadataResponse):
      QueryOuterClass.QuerySubaccountOrderMetadataResponse {
    val builder = QueryOuterClass.QuerySubaccountOrderMetadataResponse.newBuilder()
    builder.addAllMetadata(obj.metadata.map {
        SubaccountOrderbookMetadataWithMarketJvmConverter.convert(it) })
    return builder.build()
  }
}

public object QuerySubaccountTradeNonceResponseJvmConverter :
    ProtobufTypeMapper<QuerySubaccountTradeNonceResponse, QueryOuterClass.QuerySubaccountTradeNonceResponse>
    {
  public override val descriptor: Descriptors.Descriptor =
      QueryOuterClass.QuerySubaccountTradeNonceResponse.getDescriptor()

  public override val parser: Parser<QueryOuterClass.QuerySubaccountTradeNonceResponse> =
      QueryOuterClass.QuerySubaccountTradeNonceResponse.parser()

  public override fun convert(obj: QueryOuterClass.QuerySubaccountTradeNonceResponse):
      QuerySubaccountTradeNonceResponse = QuerySubaccountTradeNonceResponse(
  	nonce = obj.getNonce().asKotlinType,
  )

  public override fun convert(obj: QuerySubaccountTradeNonceResponse):
      QueryOuterClass.QuerySubaccountTradeNonceResponse {
    val builder = QueryOuterClass.QuerySubaccountTradeNonceResponse.newBuilder()
    builder.setNonce(obj.nonce.asJavaType)
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

public object QueryPositionsRequestJvmConverter :
    ProtobufTypeMapper<QueryPositionsRequest, QueryOuterClass.QueryPositionsRequest> {
  public override val descriptor: Descriptors.Descriptor =
      QueryOuterClass.QueryPositionsRequest.getDescriptor()

  public override val parser: Parser<QueryOuterClass.QueryPositionsRequest> =
      QueryOuterClass.QueryPositionsRequest.parser()

  public override fun convert(obj: QueryOuterClass.QueryPositionsRequest): QueryPositionsRequest =
      QueryPositionsRequest(
  )

  public override fun convert(obj: QueryPositionsRequest): QueryOuterClass.QueryPositionsRequest {
    val builder = QueryOuterClass.QueryPositionsRequest.newBuilder()
    return builder.build()
  }
}

public object QueryPositionsResponseJvmConverter :
    ProtobufTypeMapper<QueryPositionsResponse, QueryOuterClass.QueryPositionsResponse> {
  public override val descriptor: Descriptors.Descriptor =
      QueryOuterClass.QueryPositionsResponse.getDescriptor()

  public override val parser: Parser<QueryOuterClass.QueryPositionsResponse> =
      QueryOuterClass.QueryPositionsResponse.parser()

  public override fun convert(obj: QueryOuterClass.QueryPositionsResponse): QueryPositionsResponse =
      QueryPositionsResponse(
  	state = obj.getStateList().map { DerivativePositionJvmConverter.convert(it) },
  )

  public override fun convert(obj: QueryPositionsResponse): QueryOuterClass.QueryPositionsResponse {
    val builder = QueryOuterClass.QueryPositionsResponse.newBuilder()
    builder.addAllState(obj.state.map { DerivativePositionJvmConverter.convert(it) })
    return builder.build()
  }
}

public object QueryTradeRewardPointsRequestJvmConverter :
    ProtobufTypeMapper<QueryTradeRewardPointsRequest, QueryOuterClass.QueryTradeRewardPointsRequest>
    {
  public override val descriptor: Descriptors.Descriptor =
      QueryOuterClass.QueryTradeRewardPointsRequest.getDescriptor()

  public override val parser: Parser<QueryOuterClass.QueryTradeRewardPointsRequest> =
      QueryOuterClass.QueryTradeRewardPointsRequest.parser()

  public override fun convert(obj: QueryOuterClass.QueryTradeRewardPointsRequest):
      QueryTradeRewardPointsRequest = QueryTradeRewardPointsRequest(
  	accounts = obj.getAccountsList().map { it },
  	pendingPoolTimestamp = obj.getPendingPoolTimestamp(),
  )

  public override fun convert(obj: QueryTradeRewardPointsRequest):
      QueryOuterClass.QueryTradeRewardPointsRequest {
    val builder = QueryOuterClass.QueryTradeRewardPointsRequest.newBuilder()
    builder.addAllAccounts(obj.accounts.map { it })
    builder.setPendingPoolTimestamp(obj.pendingPoolTimestamp)
    return builder.build()
  }
}

public object QueryTradeRewardPointsResponseJvmConverter :
    ProtobufTypeMapper<QueryTradeRewardPointsResponse, QueryOuterClass.QueryTradeRewardPointsResponse>
    {
  public override val descriptor: Descriptors.Descriptor =
      QueryOuterClass.QueryTradeRewardPointsResponse.getDescriptor()

  public override val parser: Parser<QueryOuterClass.QueryTradeRewardPointsResponse> =
      QueryOuterClass.QueryTradeRewardPointsResponse.parser()

  public override fun convert(obj: QueryOuterClass.QueryTradeRewardPointsResponse):
      QueryTradeRewardPointsResponse = QueryTradeRewardPointsResponse(
  	accountTradeRewardPoints = obj.getAccountTradeRewardPointsList().map { it },
  )

  public override fun convert(obj: QueryTradeRewardPointsResponse):
      QueryOuterClass.QueryTradeRewardPointsResponse {
    val builder = QueryOuterClass.QueryTradeRewardPointsResponse.newBuilder()
    builder.addAllAccountTradeRewardPoints(obj.accountTradeRewardPoints.map { it })
    return builder.build()
  }
}

public object QueryTradeRewardCampaignRequestJvmConverter :
    ProtobufTypeMapper<QueryTradeRewardCampaignRequest, QueryOuterClass.QueryTradeRewardCampaignRequest>
    {
  public override val descriptor: Descriptors.Descriptor =
      QueryOuterClass.QueryTradeRewardCampaignRequest.getDescriptor()

  public override val parser: Parser<QueryOuterClass.QueryTradeRewardCampaignRequest> =
      QueryOuterClass.QueryTradeRewardCampaignRequest.parser()

  public override fun convert(obj: QueryOuterClass.QueryTradeRewardCampaignRequest):
      QueryTradeRewardCampaignRequest = QueryTradeRewardCampaignRequest(
  )

  public override fun convert(obj: QueryTradeRewardCampaignRequest):
      QueryOuterClass.QueryTradeRewardCampaignRequest {
    val builder = QueryOuterClass.QueryTradeRewardCampaignRequest.newBuilder()
    return builder.build()
  }
}

public object QueryTradeRewardCampaignResponseJvmConverter :
    ProtobufTypeMapper<QueryTradeRewardCampaignResponse, QueryOuterClass.QueryTradeRewardCampaignResponse>
    {
  public override val descriptor: Descriptors.Descriptor =
      QueryOuterClass.QueryTradeRewardCampaignResponse.getDescriptor()

  public override val parser: Parser<QueryOuterClass.QueryTradeRewardCampaignResponse> =
      QueryOuterClass.QueryTradeRewardCampaignResponse.parser()

  public override fun convert(obj: QueryOuterClass.QueryTradeRewardCampaignResponse):
      QueryTradeRewardCampaignResponse = QueryTradeRewardCampaignResponse(
  	tradingRewardCampaignInfo =
      TradingRewardCampaignInfoJvmConverter.convert(obj.getTradingRewardCampaignInfo()),
  	tradingRewardPoolCampaignSchedule = obj.getTradingRewardPoolCampaignScheduleList().map {
      CampaignRewardPoolJvmConverter.convert(it) },
  	totalTradeRewardPoints = obj.getTotalTradeRewardPoints(),
  	pendingTradingRewardPoolCampaignSchedule =
      obj.getPendingTradingRewardPoolCampaignScheduleList().map {
      CampaignRewardPoolJvmConverter.convert(it) },
  	pendingTotalTradeRewardPoints = obj.getPendingTotalTradeRewardPointsList().map { it },
  )

  public override fun convert(obj: QueryTradeRewardCampaignResponse):
      QueryOuterClass.QueryTradeRewardCampaignResponse {
    val builder = QueryOuterClass.QueryTradeRewardCampaignResponse.newBuilder()
    builder.setTradingRewardCampaignInfo(TradingRewardCampaignInfoJvmConverter.convert(obj.tradingRewardCampaignInfo))
    builder.addAllTradingRewardPoolCampaignSchedule(obj.tradingRewardPoolCampaignSchedule.map {
        CampaignRewardPoolJvmConverter.convert(it) })
    builder.setTotalTradeRewardPoints(obj.totalTradeRewardPoints)
    builder.addAllPendingTradingRewardPoolCampaignSchedule(obj.pendingTradingRewardPoolCampaignSchedule.map
        { CampaignRewardPoolJvmConverter.convert(it) })
    builder.addAllPendingTotalTradeRewardPoints(obj.pendingTotalTradeRewardPoints.map { it })
    return builder.build()
  }
}

public object QueryIsOptedOutOfRewardsRequestJvmConverter :
    ProtobufTypeMapper<QueryIsOptedOutOfRewardsRequest, QueryOuterClass.QueryIsOptedOutOfRewardsRequest>
    {
  public override val descriptor: Descriptors.Descriptor =
      QueryOuterClass.QueryIsOptedOutOfRewardsRequest.getDescriptor()

  public override val parser: Parser<QueryOuterClass.QueryIsOptedOutOfRewardsRequest> =
      QueryOuterClass.QueryIsOptedOutOfRewardsRequest.parser()

  public override fun convert(obj: QueryOuterClass.QueryIsOptedOutOfRewardsRequest):
      QueryIsOptedOutOfRewardsRequest = QueryIsOptedOutOfRewardsRequest(
  	account = obj.getAccount(),
  )

  public override fun convert(obj: QueryIsOptedOutOfRewardsRequest):
      QueryOuterClass.QueryIsOptedOutOfRewardsRequest {
    val builder = QueryOuterClass.QueryIsOptedOutOfRewardsRequest.newBuilder()
    builder.setAccount(obj.account)
    return builder.build()
  }
}

public object QueryIsOptedOutOfRewardsResponseJvmConverter :
    ProtobufTypeMapper<QueryIsOptedOutOfRewardsResponse, QueryOuterClass.QueryIsOptedOutOfRewardsResponse>
    {
  public override val descriptor: Descriptors.Descriptor =
      QueryOuterClass.QueryIsOptedOutOfRewardsResponse.getDescriptor()

  public override val parser: Parser<QueryOuterClass.QueryIsOptedOutOfRewardsResponse> =
      QueryOuterClass.QueryIsOptedOutOfRewardsResponse.parser()

  public override fun convert(obj: QueryOuterClass.QueryIsOptedOutOfRewardsResponse):
      QueryIsOptedOutOfRewardsResponse = QueryIsOptedOutOfRewardsResponse(
  	isOptedOut = obj.getIsOptedOut(),
  )

  public override fun convert(obj: QueryIsOptedOutOfRewardsResponse):
      QueryOuterClass.QueryIsOptedOutOfRewardsResponse {
    val builder = QueryOuterClass.QueryIsOptedOutOfRewardsResponse.newBuilder()
    builder.setIsOptedOut(obj.isOptedOut)
    return builder.build()
  }
}

public object QueryOptedOutOfRewardsAccountsRequestJvmConverter :
    ProtobufTypeMapper<QueryOptedOutOfRewardsAccountsRequest, QueryOuterClass.QueryOptedOutOfRewardsAccountsRequest>
    {
  public override val descriptor: Descriptors.Descriptor =
      QueryOuterClass.QueryOptedOutOfRewardsAccountsRequest.getDescriptor()

  public override val parser: Parser<QueryOuterClass.QueryOptedOutOfRewardsAccountsRequest> =
      QueryOuterClass.QueryOptedOutOfRewardsAccountsRequest.parser()

  public override fun convert(obj: QueryOuterClass.QueryOptedOutOfRewardsAccountsRequest):
      QueryOptedOutOfRewardsAccountsRequest = QueryOptedOutOfRewardsAccountsRequest(
  )

  public override fun convert(obj: QueryOptedOutOfRewardsAccountsRequest):
      QueryOuterClass.QueryOptedOutOfRewardsAccountsRequest {
    val builder = QueryOuterClass.QueryOptedOutOfRewardsAccountsRequest.newBuilder()
    return builder.build()
  }
}

public object QueryOptedOutOfRewardsAccountsResponseJvmConverter :
    ProtobufTypeMapper<QueryOptedOutOfRewardsAccountsResponse, QueryOuterClass.QueryOptedOutOfRewardsAccountsResponse>
    {
  public override val descriptor: Descriptors.Descriptor =
      QueryOuterClass.QueryOptedOutOfRewardsAccountsResponse.getDescriptor()

  public override val parser: Parser<QueryOuterClass.QueryOptedOutOfRewardsAccountsResponse> =
      QueryOuterClass.QueryOptedOutOfRewardsAccountsResponse.parser()

  public override fun convert(obj: QueryOuterClass.QueryOptedOutOfRewardsAccountsResponse):
      QueryOptedOutOfRewardsAccountsResponse = QueryOptedOutOfRewardsAccountsResponse(
  	accounts = obj.getAccountsList().map { it },
  )

  public override fun convert(obj: QueryOptedOutOfRewardsAccountsResponse):
      QueryOuterClass.QueryOptedOutOfRewardsAccountsResponse {
    val builder = QueryOuterClass.QueryOptedOutOfRewardsAccountsResponse.newBuilder()
    builder.addAllAccounts(obj.accounts.map { it })
    return builder.build()
  }
}

public object QueryFeeDiscountAccountInfoRequestJvmConverter :
    ProtobufTypeMapper<QueryFeeDiscountAccountInfoRequest, QueryOuterClass.QueryFeeDiscountAccountInfoRequest>
    {
  public override val descriptor: Descriptors.Descriptor =
      QueryOuterClass.QueryFeeDiscountAccountInfoRequest.getDescriptor()

  public override val parser: Parser<QueryOuterClass.QueryFeeDiscountAccountInfoRequest> =
      QueryOuterClass.QueryFeeDiscountAccountInfoRequest.parser()

  public override fun convert(obj: QueryOuterClass.QueryFeeDiscountAccountInfoRequest):
      QueryFeeDiscountAccountInfoRequest = QueryFeeDiscountAccountInfoRequest(
  	account = obj.getAccount(),
  )

  public override fun convert(obj: QueryFeeDiscountAccountInfoRequest):
      QueryOuterClass.QueryFeeDiscountAccountInfoRequest {
    val builder = QueryOuterClass.QueryFeeDiscountAccountInfoRequest.newBuilder()
    builder.setAccount(obj.account)
    return builder.build()
  }
}

public object QueryFeeDiscountAccountInfoResponseJvmConverter :
    ProtobufTypeMapper<QueryFeeDiscountAccountInfoResponse, QueryOuterClass.QueryFeeDiscountAccountInfoResponse>
    {
  public override val descriptor: Descriptors.Descriptor =
      QueryOuterClass.QueryFeeDiscountAccountInfoResponse.getDescriptor()

  public override val parser: Parser<QueryOuterClass.QueryFeeDiscountAccountInfoResponse> =
      QueryOuterClass.QueryFeeDiscountAccountInfoResponse.parser()

  public override fun convert(obj: QueryOuterClass.QueryFeeDiscountAccountInfoResponse):
      QueryFeeDiscountAccountInfoResponse = QueryFeeDiscountAccountInfoResponse(
  	tierLevel = obj.getTierLevel().asKotlinType,
  	accountInfo = FeeDiscountTierInfoJvmConverter.convert(obj.getAccountInfo()),
  	accountTtl = FeeDiscountTierTTLJvmConverter.convert(obj.getAccountTtl()),
  )

  public override fun convert(obj: QueryFeeDiscountAccountInfoResponse):
      QueryOuterClass.QueryFeeDiscountAccountInfoResponse {
    val builder = QueryOuterClass.QueryFeeDiscountAccountInfoResponse.newBuilder()
    builder.setTierLevel(obj.tierLevel.asJavaType)
    builder.setAccountInfo(FeeDiscountTierInfoJvmConverter.convert(obj.accountInfo))
    builder.setAccountTtl(FeeDiscountTierTTLJvmConverter.convert(obj.accountTtl))
    return builder.build()
  }
}

public object QueryFeeDiscountScheduleRequestJvmConverter :
    ProtobufTypeMapper<QueryFeeDiscountScheduleRequest, QueryOuterClass.QueryFeeDiscountScheduleRequest>
    {
  public override val descriptor: Descriptors.Descriptor =
      QueryOuterClass.QueryFeeDiscountScheduleRequest.getDescriptor()

  public override val parser: Parser<QueryOuterClass.QueryFeeDiscountScheduleRequest> =
      QueryOuterClass.QueryFeeDiscountScheduleRequest.parser()

  public override fun convert(obj: QueryOuterClass.QueryFeeDiscountScheduleRequest):
      QueryFeeDiscountScheduleRequest = QueryFeeDiscountScheduleRequest(
  )

  public override fun convert(obj: QueryFeeDiscountScheduleRequest):
      QueryOuterClass.QueryFeeDiscountScheduleRequest {
    val builder = QueryOuterClass.QueryFeeDiscountScheduleRequest.newBuilder()
    return builder.build()
  }
}

public object QueryFeeDiscountScheduleResponseJvmConverter :
    ProtobufTypeMapper<QueryFeeDiscountScheduleResponse, QueryOuterClass.QueryFeeDiscountScheduleResponse>
    {
  public override val descriptor: Descriptors.Descriptor =
      QueryOuterClass.QueryFeeDiscountScheduleResponse.getDescriptor()

  public override val parser: Parser<QueryOuterClass.QueryFeeDiscountScheduleResponse> =
      QueryOuterClass.QueryFeeDiscountScheduleResponse.parser()

  public override fun convert(obj: QueryOuterClass.QueryFeeDiscountScheduleResponse):
      QueryFeeDiscountScheduleResponse = QueryFeeDiscountScheduleResponse(
  	feeDiscountSchedule = FeeDiscountScheduleJvmConverter.convert(obj.getFeeDiscountSchedule()),
  )

  public override fun convert(obj: QueryFeeDiscountScheduleResponse):
      QueryOuterClass.QueryFeeDiscountScheduleResponse {
    val builder = QueryOuterClass.QueryFeeDiscountScheduleResponse.newBuilder()
    builder.setFeeDiscountSchedule(FeeDiscountScheduleJvmConverter.convert(obj.feeDiscountSchedule))
    return builder.build()
  }
}

public object QueryBalanceMismatchesRequestJvmConverter :
    ProtobufTypeMapper<QueryBalanceMismatchesRequest, QueryOuterClass.QueryBalanceMismatchesRequest>
    {
  public override val descriptor: Descriptors.Descriptor =
      QueryOuterClass.QueryBalanceMismatchesRequest.getDescriptor()

  public override val parser: Parser<QueryOuterClass.QueryBalanceMismatchesRequest> =
      QueryOuterClass.QueryBalanceMismatchesRequest.parser()

  public override fun convert(obj: QueryOuterClass.QueryBalanceMismatchesRequest):
      QueryBalanceMismatchesRequest = QueryBalanceMismatchesRequest(
  	dustFactor = obj.getDustFactor(),
  )

  public override fun convert(obj: QueryBalanceMismatchesRequest):
      QueryOuterClass.QueryBalanceMismatchesRequest {
    val builder = QueryOuterClass.QueryBalanceMismatchesRequest.newBuilder()
    builder.setDustFactor(obj.dustFactor)
    return builder.build()
  }
}

public object BalanceMismatchJvmConverter :
    ProtobufTypeMapper<BalanceMismatch, QueryOuterClass.BalanceMismatch> {
  public override val descriptor: Descriptors.Descriptor =
      QueryOuterClass.BalanceMismatch.getDescriptor()

  public override val parser: Parser<QueryOuterClass.BalanceMismatch> =
      QueryOuterClass.BalanceMismatch.parser()

  public override fun convert(obj: QueryOuterClass.BalanceMismatch): BalanceMismatch =
      BalanceMismatch(
  	subaccountId = obj.getSubaccountId(),
  	denom = obj.getDenom(),
  	available = obj.getAvailable(),
  	total = obj.getTotal(),
  	balanceHold = obj.getBalanceHold(),
  	expectedTotal = obj.getExpectedTotal(),
  	difference = obj.getDifference(),
  )

  public override fun convert(obj: BalanceMismatch): QueryOuterClass.BalanceMismatch {
    val builder = QueryOuterClass.BalanceMismatch.newBuilder()
    builder.setSubaccountId(obj.subaccountId)
    builder.setDenom(obj.denom)
    builder.setAvailable(obj.available)
    builder.setTotal(obj.total)
    builder.setBalanceHold(obj.balanceHold)
    builder.setExpectedTotal(obj.expectedTotal)
    builder.setDifference(obj.difference)
    return builder.build()
  }
}

public object QueryBalanceMismatchesResponseJvmConverter :
    ProtobufTypeMapper<QueryBalanceMismatchesResponse, QueryOuterClass.QueryBalanceMismatchesResponse>
    {
  public override val descriptor: Descriptors.Descriptor =
      QueryOuterClass.QueryBalanceMismatchesResponse.getDescriptor()

  public override val parser: Parser<QueryOuterClass.QueryBalanceMismatchesResponse> =
      QueryOuterClass.QueryBalanceMismatchesResponse.parser()

  public override fun convert(obj: QueryOuterClass.QueryBalanceMismatchesResponse):
      QueryBalanceMismatchesResponse = QueryBalanceMismatchesResponse(
  	balanceMismatches = obj.getBalanceMismatchesList().map { BalanceMismatchJvmConverter.convert(it)
      },
  )

  public override fun convert(obj: QueryBalanceMismatchesResponse):
      QueryOuterClass.QueryBalanceMismatchesResponse {
    val builder = QueryOuterClass.QueryBalanceMismatchesResponse.newBuilder()
    builder.addAllBalanceMismatches(obj.balanceMismatches.map {
        BalanceMismatchJvmConverter.convert(it) })
    return builder.build()
  }
}

public object QueryBalanceWithBalanceHoldsRequestJvmConverter :
    ProtobufTypeMapper<QueryBalanceWithBalanceHoldsRequest, QueryOuterClass.QueryBalanceWithBalanceHoldsRequest>
    {
  public override val descriptor: Descriptors.Descriptor =
      QueryOuterClass.QueryBalanceWithBalanceHoldsRequest.getDescriptor()

  public override val parser: Parser<QueryOuterClass.QueryBalanceWithBalanceHoldsRequest> =
      QueryOuterClass.QueryBalanceWithBalanceHoldsRequest.parser()

  public override fun convert(obj: QueryOuterClass.QueryBalanceWithBalanceHoldsRequest):
      QueryBalanceWithBalanceHoldsRequest = QueryBalanceWithBalanceHoldsRequest(
  )

  public override fun convert(obj: QueryBalanceWithBalanceHoldsRequest):
      QueryOuterClass.QueryBalanceWithBalanceHoldsRequest {
    val builder = QueryOuterClass.QueryBalanceWithBalanceHoldsRequest.newBuilder()
    return builder.build()
  }
}

public object BalanceWithMarginHoldJvmConverter :
    ProtobufTypeMapper<BalanceWithMarginHold, QueryOuterClass.BalanceWithMarginHold> {
  public override val descriptor: Descriptors.Descriptor =
      QueryOuterClass.BalanceWithMarginHold.getDescriptor()

  public override val parser: Parser<QueryOuterClass.BalanceWithMarginHold> =
      QueryOuterClass.BalanceWithMarginHold.parser()

  public override fun convert(obj: QueryOuterClass.BalanceWithMarginHold): BalanceWithMarginHold =
      BalanceWithMarginHold(
  	subaccountId = obj.getSubaccountId(),
  	denom = obj.getDenom(),
  	available = obj.getAvailable(),
  	total = obj.getTotal(),
  	balanceHold = obj.getBalanceHold(),
  )

  public override fun convert(obj: BalanceWithMarginHold): QueryOuterClass.BalanceWithMarginHold {
    val builder = QueryOuterClass.BalanceWithMarginHold.newBuilder()
    builder.setSubaccountId(obj.subaccountId)
    builder.setDenom(obj.denom)
    builder.setAvailable(obj.available)
    builder.setTotal(obj.total)
    builder.setBalanceHold(obj.balanceHold)
    return builder.build()
  }
}

public object QueryBalanceWithBalanceHoldsResponseJvmConverter :
    ProtobufTypeMapper<QueryBalanceWithBalanceHoldsResponse, QueryOuterClass.QueryBalanceWithBalanceHoldsResponse>
    {
  public override val descriptor: Descriptors.Descriptor =
      QueryOuterClass.QueryBalanceWithBalanceHoldsResponse.getDescriptor()

  public override val parser: Parser<QueryOuterClass.QueryBalanceWithBalanceHoldsResponse> =
      QueryOuterClass.QueryBalanceWithBalanceHoldsResponse.parser()

  public override fun convert(obj: QueryOuterClass.QueryBalanceWithBalanceHoldsResponse):
      QueryBalanceWithBalanceHoldsResponse = QueryBalanceWithBalanceHoldsResponse(
  	balanceWithBalanceHolds = obj.getBalanceWithBalanceHoldsList().map {
      BalanceWithMarginHoldJvmConverter.convert(it) },
  )

  public override fun convert(obj: QueryBalanceWithBalanceHoldsResponse):
      QueryOuterClass.QueryBalanceWithBalanceHoldsResponse {
    val builder = QueryOuterClass.QueryBalanceWithBalanceHoldsResponse.newBuilder()
    builder.addAllBalanceWithBalanceHolds(obj.balanceWithBalanceHolds.map {
        BalanceWithMarginHoldJvmConverter.convert(it) })
    return builder.build()
  }
}

public object QueryFeeDiscountTierStatisticsRequestJvmConverter :
    ProtobufTypeMapper<QueryFeeDiscountTierStatisticsRequest, QueryOuterClass.QueryFeeDiscountTierStatisticsRequest>
    {
  public override val descriptor: Descriptors.Descriptor =
      QueryOuterClass.QueryFeeDiscountTierStatisticsRequest.getDescriptor()

  public override val parser: Parser<QueryOuterClass.QueryFeeDiscountTierStatisticsRequest> =
      QueryOuterClass.QueryFeeDiscountTierStatisticsRequest.parser()

  public override fun convert(obj: QueryOuterClass.QueryFeeDiscountTierStatisticsRequest):
      QueryFeeDiscountTierStatisticsRequest = QueryFeeDiscountTierStatisticsRequest(
  )

  public override fun convert(obj: QueryFeeDiscountTierStatisticsRequest):
      QueryOuterClass.QueryFeeDiscountTierStatisticsRequest {
    val builder = QueryOuterClass.QueryFeeDiscountTierStatisticsRequest.newBuilder()
    return builder.build()
  }
}

public object TierStatisticJvmConverter :
    ProtobufTypeMapper<TierStatistic, QueryOuterClass.TierStatistic> {
  public override val descriptor: Descriptors.Descriptor =
      QueryOuterClass.TierStatistic.getDescriptor()

  public override val parser: Parser<QueryOuterClass.TierStatistic> =
      QueryOuterClass.TierStatistic.parser()

  public override fun convert(obj: QueryOuterClass.TierStatistic): TierStatistic = TierStatistic(
  	tier = obj.getTier().asKotlinType,
  	count = obj.getCount().asKotlinType,
  )

  public override fun convert(obj: TierStatistic): QueryOuterClass.TierStatistic {
    val builder = QueryOuterClass.TierStatistic.newBuilder()
    builder.setTier(obj.tier.asJavaType)
    builder.setCount(obj.count.asJavaType)
    return builder.build()
  }
}

public object QueryFeeDiscountTierStatisticsResponseJvmConverter :
    ProtobufTypeMapper<QueryFeeDiscountTierStatisticsResponse, QueryOuterClass.QueryFeeDiscountTierStatisticsResponse>
    {
  public override val descriptor: Descriptors.Descriptor =
      QueryOuterClass.QueryFeeDiscountTierStatisticsResponse.getDescriptor()

  public override val parser: Parser<QueryOuterClass.QueryFeeDiscountTierStatisticsResponse> =
      QueryOuterClass.QueryFeeDiscountTierStatisticsResponse.parser()

  public override fun convert(obj: QueryOuterClass.QueryFeeDiscountTierStatisticsResponse):
      QueryFeeDiscountTierStatisticsResponse = QueryFeeDiscountTierStatisticsResponse(
  	statistics = obj.getStatisticsList().map { TierStatisticJvmConverter.convert(it) },
  )

  public override fun convert(obj: QueryFeeDiscountTierStatisticsResponse):
      QueryOuterClass.QueryFeeDiscountTierStatisticsResponse {
    val builder = QueryOuterClass.QueryFeeDiscountTierStatisticsResponse.newBuilder()
    builder.addAllStatistics(obj.statistics.map { TierStatisticJvmConverter.convert(it) })
    return builder.build()
  }
}

public object MitoVaultInfosRequestJvmConverter :
    ProtobufTypeMapper<MitoVaultInfosRequest, QueryOuterClass.MitoVaultInfosRequest> {
  public override val descriptor: Descriptors.Descriptor =
      QueryOuterClass.MitoVaultInfosRequest.getDescriptor()

  public override val parser: Parser<QueryOuterClass.MitoVaultInfosRequest> =
      QueryOuterClass.MitoVaultInfosRequest.parser()

  public override fun convert(obj: QueryOuterClass.MitoVaultInfosRequest): MitoVaultInfosRequest =
      MitoVaultInfosRequest(
  )

  public override fun convert(obj: MitoVaultInfosRequest): QueryOuterClass.MitoVaultInfosRequest {
    val builder = QueryOuterClass.MitoVaultInfosRequest.newBuilder()
    return builder.build()
  }
}

public object MitoVaultInfosResponseJvmConverter :
    ProtobufTypeMapper<MitoVaultInfosResponse, QueryOuterClass.MitoVaultInfosResponse> {
  public override val descriptor: Descriptors.Descriptor =
      QueryOuterClass.MitoVaultInfosResponse.getDescriptor()

  public override val parser: Parser<QueryOuterClass.MitoVaultInfosResponse> =
      QueryOuterClass.MitoVaultInfosResponse.parser()

  public override fun convert(obj: QueryOuterClass.MitoVaultInfosResponse): MitoVaultInfosResponse =
      MitoVaultInfosResponse(
  	masterAddresses = obj.getMasterAddressesList().map { it },
  	derivativeAddresses = obj.getDerivativeAddressesList().map { it },
  	spotAddresses = obj.getSpotAddressesList().map { it },
  	cw20Addresses = obj.getCw20AddressesList().map { it },
  )

  public override fun convert(obj: MitoVaultInfosResponse): QueryOuterClass.MitoVaultInfosResponse {
    val builder = QueryOuterClass.MitoVaultInfosResponse.newBuilder()
    builder.addAllMasterAddresses(obj.masterAddresses.map { it })
    builder.addAllDerivativeAddresses(obj.derivativeAddresses.map { it })
    builder.addAllSpotAddresses(obj.spotAddresses.map { it })
    builder.addAllCw20Addresses(obj.cw20Addresses.map { it })
    return builder.build()
  }
}

public object QueryMarketIDFromVaultRequestJvmConverter :
    ProtobufTypeMapper<QueryMarketIDFromVaultRequest, QueryOuterClass.QueryMarketIDFromVaultRequest>
    {
  public override val descriptor: Descriptors.Descriptor =
      QueryOuterClass.QueryMarketIDFromVaultRequest.getDescriptor()

  public override val parser: Parser<QueryOuterClass.QueryMarketIDFromVaultRequest> =
      QueryOuterClass.QueryMarketIDFromVaultRequest.parser()

  public override fun convert(obj: QueryOuterClass.QueryMarketIDFromVaultRequest):
      QueryMarketIDFromVaultRequest = QueryMarketIDFromVaultRequest(
  	vaultAddress = obj.getVaultAddress(),
  )

  public override fun convert(obj: QueryMarketIDFromVaultRequest):
      QueryOuterClass.QueryMarketIDFromVaultRequest {
    val builder = QueryOuterClass.QueryMarketIDFromVaultRequest.newBuilder()
    builder.setVaultAddress(obj.vaultAddress)
    return builder.build()
  }
}

public object QueryMarketIDFromVaultResponseJvmConverter :
    ProtobufTypeMapper<QueryMarketIDFromVaultResponse, QueryOuterClass.QueryMarketIDFromVaultResponse>
    {
  public override val descriptor: Descriptors.Descriptor =
      QueryOuterClass.QueryMarketIDFromVaultResponse.getDescriptor()

  public override val parser: Parser<QueryOuterClass.QueryMarketIDFromVaultResponse> =
      QueryOuterClass.QueryMarketIDFromVaultResponse.parser()

  public override fun convert(obj: QueryOuterClass.QueryMarketIDFromVaultResponse):
      QueryMarketIDFromVaultResponse = QueryMarketIDFromVaultResponse(
  	marketId = obj.getMarketId(),
  )

  public override fun convert(obj: QueryMarketIDFromVaultResponse):
      QueryOuterClass.QueryMarketIDFromVaultResponse {
    val builder = QueryOuterClass.QueryMarketIDFromVaultResponse.newBuilder()
    builder.setMarketId(obj.marketId)
    return builder.build()
  }
}

public object QueryHistoricalTradeRecordsRequestJvmConverter :
    ProtobufTypeMapper<QueryHistoricalTradeRecordsRequest, QueryOuterClass.QueryHistoricalTradeRecordsRequest>
    {
  public override val descriptor: Descriptors.Descriptor =
      QueryOuterClass.QueryHistoricalTradeRecordsRequest.getDescriptor()

  public override val parser: Parser<QueryOuterClass.QueryHistoricalTradeRecordsRequest> =
      QueryOuterClass.QueryHistoricalTradeRecordsRequest.parser()

  public override fun convert(obj: QueryOuterClass.QueryHistoricalTradeRecordsRequest):
      QueryHistoricalTradeRecordsRequest = QueryHistoricalTradeRecordsRequest(
  	marketId = obj.getMarketId(),
  )

  public override fun convert(obj: QueryHistoricalTradeRecordsRequest):
      QueryOuterClass.QueryHistoricalTradeRecordsRequest {
    val builder = QueryOuterClass.QueryHistoricalTradeRecordsRequest.newBuilder()
    builder.setMarketId(obj.marketId)
    return builder.build()
  }
}

public object QueryHistoricalTradeRecordsResponseJvmConverter :
    ProtobufTypeMapper<QueryHistoricalTradeRecordsResponse, QueryOuterClass.QueryHistoricalTradeRecordsResponse>
    {
  public override val descriptor: Descriptors.Descriptor =
      QueryOuterClass.QueryHistoricalTradeRecordsResponse.getDescriptor()

  public override val parser: Parser<QueryOuterClass.QueryHistoricalTradeRecordsResponse> =
      QueryOuterClass.QueryHistoricalTradeRecordsResponse.parser()

  public override fun convert(obj: QueryOuterClass.QueryHistoricalTradeRecordsResponse):
      QueryHistoricalTradeRecordsResponse = QueryHistoricalTradeRecordsResponse(
  	tradeRecords = obj.getTradeRecordsList().map { TradeRecordsJvmConverter.convert(it) },
  )

  public override fun convert(obj: QueryHistoricalTradeRecordsResponse):
      QueryOuterClass.QueryHistoricalTradeRecordsResponse {
    val builder = QueryOuterClass.QueryHistoricalTradeRecordsResponse.newBuilder()
    builder.addAllTradeRecords(obj.tradeRecords.map { TradeRecordsJvmConverter.convert(it) })
    return builder.build()
  }
}

public object TradeHistoryOptionsJvmConverter :
    ProtobufTypeMapper<TradeHistoryOptions, QueryOuterClass.TradeHistoryOptions> {
  public override val descriptor: Descriptors.Descriptor =
      QueryOuterClass.TradeHistoryOptions.getDescriptor()

  public override val parser: Parser<QueryOuterClass.TradeHistoryOptions> =
      QueryOuterClass.TradeHistoryOptions.parser()

  public override fun convert(obj: QueryOuterClass.TradeHistoryOptions): TradeHistoryOptions =
      TradeHistoryOptions(
  	tradeGroupingSec = obj.getTradeGroupingSec().asKotlinType,
  	maxAge = obj.getMaxAge().asKotlinType,
  	includeRawHistory = obj.getIncludeRawHistory(),
  	includeMetadata = obj.getIncludeMetadata(),
  )

  public override fun convert(obj: TradeHistoryOptions): QueryOuterClass.TradeHistoryOptions {
    val builder = QueryOuterClass.TradeHistoryOptions.newBuilder()
    builder.setTradeGroupingSec(obj.tradeGroupingSec.asJavaType)
    builder.setMaxAge(obj.maxAge.asJavaType)
    builder.setIncludeRawHistory(obj.includeRawHistory)
    builder.setIncludeMetadata(obj.includeMetadata)
    return builder.build()
  }
}

public object QueryMarketVolatilityRequestJvmConverter :
    ProtobufTypeMapper<QueryMarketVolatilityRequest, QueryOuterClass.QueryMarketVolatilityRequest> {
  public override val descriptor: Descriptors.Descriptor =
      QueryOuterClass.QueryMarketVolatilityRequest.getDescriptor()

  public override val parser: Parser<QueryOuterClass.QueryMarketVolatilityRequest> =
      QueryOuterClass.QueryMarketVolatilityRequest.parser()

  public override fun convert(obj: QueryOuterClass.QueryMarketVolatilityRequest):
      QueryMarketVolatilityRequest = QueryMarketVolatilityRequest(
  	marketId = obj.getMarketId(),
  	tradeHistoryOptions = TradeHistoryOptionsJvmConverter.convert(obj.getTradeHistoryOptions()),
  )

  public override fun convert(obj: QueryMarketVolatilityRequest):
      QueryOuterClass.QueryMarketVolatilityRequest {
    val builder = QueryOuterClass.QueryMarketVolatilityRequest.newBuilder()
    builder.setMarketId(obj.marketId)
    builder.setTradeHistoryOptions(TradeHistoryOptionsJvmConverter.convert(obj.tradeHistoryOptions))
    return builder.build()
  }
}

public object QueryMarketVolatilityResponseJvmConverter :
    ProtobufTypeMapper<QueryMarketVolatilityResponse, QueryOuterClass.QueryMarketVolatilityResponse>
    {
  public override val descriptor: Descriptors.Descriptor =
      QueryOuterClass.QueryMarketVolatilityResponse.getDescriptor()

  public override val parser: Parser<QueryOuterClass.QueryMarketVolatilityResponse> =
      QueryOuterClass.QueryMarketVolatilityResponse.parser()

  public override fun convert(obj: QueryOuterClass.QueryMarketVolatilityResponse):
      QueryMarketVolatilityResponse = QueryMarketVolatilityResponse(
  	volatility = obj.getVolatility(),
  	historyMetadata = MetadataStatisticsJvmConverter.convert(obj.getHistoryMetadata()),
  	rawHistory = obj.getRawHistoryList().map { TradeRecordJvmConverter.convert(it) },
  )

  public override fun convert(obj: QueryMarketVolatilityResponse):
      QueryOuterClass.QueryMarketVolatilityResponse {
    val builder = QueryOuterClass.QueryMarketVolatilityResponse.newBuilder()
    builder.setVolatility(obj.volatility)
    builder.setHistoryMetadata(MetadataStatisticsJvmConverter.convert(obj.historyMetadata))
    builder.addAllRawHistory(obj.rawHistory.map { TradeRecordJvmConverter.convert(it) })
    return builder.build()
  }
}

public object QueryBinaryMarketsRequestJvmConverter :
    ProtobufTypeMapper<QueryBinaryMarketsRequest, QueryOuterClass.QueryBinaryMarketsRequest> {
  public override val descriptor: Descriptors.Descriptor =
      QueryOuterClass.QueryBinaryMarketsRequest.getDescriptor()

  public override val parser: Parser<QueryOuterClass.QueryBinaryMarketsRequest> =
      QueryOuterClass.QueryBinaryMarketsRequest.parser()

  public override fun convert(obj: QueryOuterClass.QueryBinaryMarketsRequest):
      QueryBinaryMarketsRequest = QueryBinaryMarketsRequest(
  	status = obj.getStatus(),
  )

  public override fun convert(obj: QueryBinaryMarketsRequest):
      QueryOuterClass.QueryBinaryMarketsRequest {
    val builder = QueryOuterClass.QueryBinaryMarketsRequest.newBuilder()
    builder.setStatus(obj.status)
    return builder.build()
  }
}

public object QueryBinaryMarketsResponseJvmConverter :
    ProtobufTypeMapper<QueryBinaryMarketsResponse, QueryOuterClass.QueryBinaryMarketsResponse> {
  public override val descriptor: Descriptors.Descriptor =
      QueryOuterClass.QueryBinaryMarketsResponse.getDescriptor()

  public override val parser: Parser<QueryOuterClass.QueryBinaryMarketsResponse> =
      QueryOuterClass.QueryBinaryMarketsResponse.parser()

  public override fun convert(obj: QueryOuterClass.QueryBinaryMarketsResponse):
      QueryBinaryMarketsResponse = QueryBinaryMarketsResponse(
  	markets = obj.getMarketsList().map { BinaryOptionsMarketJvmConverter.convert(it) },
  )

  public override fun convert(obj: QueryBinaryMarketsResponse):
      QueryOuterClass.QueryBinaryMarketsResponse {
    val builder = QueryOuterClass.QueryBinaryMarketsResponse.newBuilder()
    builder.addAllMarkets(obj.markets.map { BinaryOptionsMarketJvmConverter.convert(it) })
    return builder.build()
  }
}

public object QueryTraderDerivativeConditionalOrdersRequestJvmConverter :
    ProtobufTypeMapper<QueryTraderDerivativeConditionalOrdersRequest, QueryOuterClass.QueryTraderDerivativeConditionalOrdersRequest>
    {
  public override val descriptor: Descriptors.Descriptor =
      QueryOuterClass.QueryTraderDerivativeConditionalOrdersRequest.getDescriptor()

  public override val parser: Parser<QueryOuterClass.QueryTraderDerivativeConditionalOrdersRequest>
      = QueryOuterClass.QueryTraderDerivativeConditionalOrdersRequest.parser()

  public override fun convert(obj: QueryOuterClass.QueryTraderDerivativeConditionalOrdersRequest):
      QueryTraderDerivativeConditionalOrdersRequest = QueryTraderDerivativeConditionalOrdersRequest(
  	subaccountId = obj.getSubaccountId(),
  	marketId = obj.getMarketId(),
  )

  public override fun convert(obj: QueryTraderDerivativeConditionalOrdersRequest):
      QueryOuterClass.QueryTraderDerivativeConditionalOrdersRequest {
    val builder = QueryOuterClass.QueryTraderDerivativeConditionalOrdersRequest.newBuilder()
    builder.setSubaccountId(obj.subaccountId)
    builder.setMarketId(obj.marketId)
    return builder.build()
  }
}

public object TrimmedDerivativeConditionalOrderJvmConverter :
    ProtobufTypeMapper<TrimmedDerivativeConditionalOrder, QueryOuterClass.TrimmedDerivativeConditionalOrder>
    {
  public override val descriptor: Descriptors.Descriptor =
      QueryOuterClass.TrimmedDerivativeConditionalOrder.getDescriptor()

  public override val parser: Parser<QueryOuterClass.TrimmedDerivativeConditionalOrder> =
      QueryOuterClass.TrimmedDerivativeConditionalOrder.parser()

  public override fun convert(obj: QueryOuterClass.TrimmedDerivativeConditionalOrder):
      TrimmedDerivativeConditionalOrder = TrimmedDerivativeConditionalOrder(
  	price = obj.getPrice(),
  	quantity = obj.getQuantity(),
  	margin = obj.getMargin(),
  	triggerPrice = obj.getTriggerPrice(),
  	isBuy = obj.getIsBuy(),
  	isLimit = obj.getIsLimit(),
  	orderHash = obj.getOrderHash(),
  )

  public override fun convert(obj: TrimmedDerivativeConditionalOrder):
      QueryOuterClass.TrimmedDerivativeConditionalOrder {
    val builder = QueryOuterClass.TrimmedDerivativeConditionalOrder.newBuilder()
    builder.setPrice(obj.price)
    builder.setQuantity(obj.quantity)
    builder.setMargin(obj.margin)
    builder.setTriggerPrice(obj.triggerPrice)
    builder.setIsBuy(obj.isBuy)
    builder.setIsLimit(obj.isLimit)
    builder.setOrderHash(obj.orderHash)
    return builder.build()
  }
}

public object QueryTraderDerivativeConditionalOrdersResponseJvmConverter :
    ProtobufTypeMapper<QueryTraderDerivativeConditionalOrdersResponse, QueryOuterClass.QueryTraderDerivativeConditionalOrdersResponse>
    {
  public override val descriptor: Descriptors.Descriptor =
      QueryOuterClass.QueryTraderDerivativeConditionalOrdersResponse.getDescriptor()

  public override val parser: Parser<QueryOuterClass.QueryTraderDerivativeConditionalOrdersResponse>
      = QueryOuterClass.QueryTraderDerivativeConditionalOrdersResponse.parser()

  public override fun convert(obj: QueryOuterClass.QueryTraderDerivativeConditionalOrdersResponse):
      QueryTraderDerivativeConditionalOrdersResponse =
      QueryTraderDerivativeConditionalOrdersResponse(
  	orders = obj.getOrdersList().map { TrimmedDerivativeConditionalOrderJvmConverter.convert(it) },
  )

  public override fun convert(obj: QueryTraderDerivativeConditionalOrdersResponse):
      QueryOuterClass.QueryTraderDerivativeConditionalOrdersResponse {
    val builder = QueryOuterClass.QueryTraderDerivativeConditionalOrdersResponse.newBuilder()
    builder.addAllOrders(obj.orders.map { TrimmedDerivativeConditionalOrderJvmConverter.convert(it)
        })
    return builder.build()
  }
}

public object QueryMarketAtomicExecutionFeeMultiplierRequestJvmConverter :
    ProtobufTypeMapper<QueryMarketAtomicExecutionFeeMultiplierRequest, QueryOuterClass.QueryMarketAtomicExecutionFeeMultiplierRequest>
    {
  public override val descriptor: Descriptors.Descriptor =
      QueryOuterClass.QueryMarketAtomicExecutionFeeMultiplierRequest.getDescriptor()

  public override val parser: Parser<QueryOuterClass.QueryMarketAtomicExecutionFeeMultiplierRequest>
      = QueryOuterClass.QueryMarketAtomicExecutionFeeMultiplierRequest.parser()

  public override fun convert(obj: QueryOuterClass.QueryMarketAtomicExecutionFeeMultiplierRequest):
      QueryMarketAtomicExecutionFeeMultiplierRequest =
      QueryMarketAtomicExecutionFeeMultiplierRequest(
  	marketId = obj.getMarketId(),
  )

  public override fun convert(obj: QueryMarketAtomicExecutionFeeMultiplierRequest):
      QueryOuterClass.QueryMarketAtomicExecutionFeeMultiplierRequest {
    val builder = QueryOuterClass.QueryMarketAtomicExecutionFeeMultiplierRequest.newBuilder()
    builder.setMarketId(obj.marketId)
    return builder.build()
  }
}

public object QueryMarketAtomicExecutionFeeMultiplierResponseJvmConverter :
    ProtobufTypeMapper<QueryMarketAtomicExecutionFeeMultiplierResponse, QueryOuterClass.QueryMarketAtomicExecutionFeeMultiplierResponse>
    {
  public override val descriptor: Descriptors.Descriptor =
      QueryOuterClass.QueryMarketAtomicExecutionFeeMultiplierResponse.getDescriptor()

  public override val parser:
      Parser<QueryOuterClass.QueryMarketAtomicExecutionFeeMultiplierResponse> =
      QueryOuterClass.QueryMarketAtomicExecutionFeeMultiplierResponse.parser()

  public override fun convert(obj: QueryOuterClass.QueryMarketAtomicExecutionFeeMultiplierResponse):
      QueryMarketAtomicExecutionFeeMultiplierResponse =
      QueryMarketAtomicExecutionFeeMultiplierResponse(
  	multiplier = obj.getMultiplier(),
  )

  public override fun convert(obj: QueryMarketAtomicExecutionFeeMultiplierResponse):
      QueryOuterClass.QueryMarketAtomicExecutionFeeMultiplierResponse {
    val builder = QueryOuterClass.QueryMarketAtomicExecutionFeeMultiplierResponse.newBuilder()
    builder.setMultiplier(obj.multiplier)
    return builder.build()
  }
}
