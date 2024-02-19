// Transform from injective/exchange/v1beta1/query.proto
@file:ProtobufSyntax(syntax = "PROTO3")
@file:GeneratorVersion(version = "0.3.1")

package injective.exchange.v1beta1

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

  private val queryExchangeParamsDescriptor:
      MethodDescriptor<QueryOuterClass.QueryExchangeParamsRequest, QueryOuterClass.QueryExchangeParamsResponse>
      = QueryGrpc.getQueryExchangeParamsMethod()!!

  private val subaccountDepositsDescriptor:
      MethodDescriptor<QueryOuterClass.QuerySubaccountDepositsRequest, QueryOuterClass.QuerySubaccountDepositsResponse>
      = QueryGrpc.getSubaccountDepositsMethod()!!

  private val subaccountDepositDescriptor:
      MethodDescriptor<QueryOuterClass.QuerySubaccountDepositRequest, QueryOuterClass.QuerySubaccountDepositResponse>
      = QueryGrpc.getSubaccountDepositMethod()!!

  private val exchangeBalancesDescriptor:
      MethodDescriptor<QueryOuterClass.QueryExchangeBalancesRequest, QueryOuterClass.QueryExchangeBalancesResponse>
      = QueryGrpc.getExchangeBalancesMethod()!!

  private val aggregateVolumeDescriptor:
      MethodDescriptor<QueryOuterClass.QueryAggregateVolumeRequest, QueryOuterClass.QueryAggregateVolumeResponse>
      = QueryGrpc.getAggregateVolumeMethod()!!

  private val aggregateVolumesDescriptor:
      MethodDescriptor<QueryOuterClass.QueryAggregateVolumesRequest, QueryOuterClass.QueryAggregateVolumesResponse>
      = QueryGrpc.getAggregateVolumesMethod()!!

  private val aggregateMarketVolumeDescriptor:
      MethodDescriptor<QueryOuterClass.QueryAggregateMarketVolumeRequest, QueryOuterClass.QueryAggregateMarketVolumeResponse>
      = QueryGrpc.getAggregateMarketVolumeMethod()!!

  private val aggregateMarketVolumesDescriptor:
      MethodDescriptor<QueryOuterClass.QueryAggregateMarketVolumesRequest, QueryOuterClass.QueryAggregateMarketVolumesResponse>
      = QueryGrpc.getAggregateMarketVolumesMethod()!!

  private val denomDecimalDescriptor:
      MethodDescriptor<QueryOuterClass.QueryDenomDecimalRequest, QueryOuterClass.QueryDenomDecimalResponse>
      = QueryGrpc.getDenomDecimalMethod()!!

  private val denomDecimalsDescriptor:
      MethodDescriptor<QueryOuterClass.QueryDenomDecimalsRequest, QueryOuterClass.QueryDenomDecimalsResponse>
      = QueryGrpc.getDenomDecimalsMethod()!!

  private val spotMarketsDescriptor:
      MethodDescriptor<QueryOuterClass.QuerySpotMarketsRequest, QueryOuterClass.QuerySpotMarketsResponse>
      = QueryGrpc.getSpotMarketsMethod()!!

  private val spotMarketDescriptor:
      MethodDescriptor<QueryOuterClass.QuerySpotMarketRequest, QueryOuterClass.QuerySpotMarketResponse>
      = QueryGrpc.getSpotMarketMethod()!!

  private val fullSpotMarketsDescriptor:
      MethodDescriptor<QueryOuterClass.QueryFullSpotMarketsRequest, QueryOuterClass.QueryFullSpotMarketsResponse>
      = QueryGrpc.getFullSpotMarketsMethod()!!

  private val fullSpotMarketDescriptor:
      MethodDescriptor<QueryOuterClass.QueryFullSpotMarketRequest, QueryOuterClass.QueryFullSpotMarketResponse>
      = QueryGrpc.getFullSpotMarketMethod()!!

  private val spotOrderbookDescriptor:
      MethodDescriptor<QueryOuterClass.QuerySpotOrderbookRequest, QueryOuterClass.QuerySpotOrderbookResponse>
      = QueryGrpc.getSpotOrderbookMethod()!!

  private val traderSpotOrdersDescriptor:
      MethodDescriptor<QueryOuterClass.QueryTraderSpotOrdersRequest, QueryOuterClass.QueryTraderSpotOrdersResponse>
      = QueryGrpc.getTraderSpotOrdersMethod()!!

  private val accountAddressSpotOrdersDescriptor:
      MethodDescriptor<QueryOuterClass.QueryAccountAddressSpotOrdersRequest, QueryOuterClass.QueryAccountAddressSpotOrdersResponse>
      = QueryGrpc.getAccountAddressSpotOrdersMethod()!!

  private val spotOrdersByHashesDescriptor:
      MethodDescriptor<QueryOuterClass.QuerySpotOrdersByHashesRequest, QueryOuterClass.QuerySpotOrdersByHashesResponse>
      = QueryGrpc.getSpotOrdersByHashesMethod()!!

  private val subaccountOrdersDescriptor:
      MethodDescriptor<QueryOuterClass.QuerySubaccountOrdersRequest, QueryOuterClass.QuerySubaccountOrdersResponse>
      = QueryGrpc.getSubaccountOrdersMethod()!!

  private val traderSpotTransientOrdersDescriptor:
      MethodDescriptor<QueryOuterClass.QueryTraderSpotOrdersRequest, QueryOuterClass.QueryTraderSpotOrdersResponse>
      = QueryGrpc.getTraderSpotTransientOrdersMethod()!!

  private val spotMidPriceAndTOBDescriptor:
      MethodDescriptor<QueryOuterClass.QuerySpotMidPriceAndTOBRequest, QueryOuterClass.QuerySpotMidPriceAndTOBResponse>
      = QueryGrpc.getSpotMidPriceAndTOBMethod()!!

  private val derivativeMidPriceAndTOBDescriptor:
      MethodDescriptor<QueryOuterClass.QueryDerivativeMidPriceAndTOBRequest, QueryOuterClass.QueryDerivativeMidPriceAndTOBResponse>
      = QueryGrpc.getDerivativeMidPriceAndTOBMethod()!!

  private val derivativeOrderbookDescriptor:
      MethodDescriptor<QueryOuterClass.QueryDerivativeOrderbookRequest, QueryOuterClass.QueryDerivativeOrderbookResponse>
      = QueryGrpc.getDerivativeOrderbookMethod()!!

  private val traderDerivativeOrdersDescriptor:
      MethodDescriptor<QueryOuterClass.QueryTraderDerivativeOrdersRequest, QueryOuterClass.QueryTraderDerivativeOrdersResponse>
      = QueryGrpc.getTraderDerivativeOrdersMethod()!!

  private val accountAddressDerivativeOrdersDescriptor:
      MethodDescriptor<QueryOuterClass.QueryAccountAddressDerivativeOrdersRequest, QueryOuterClass.QueryAccountAddressDerivativeOrdersResponse>
      = QueryGrpc.getAccountAddressDerivativeOrdersMethod()!!

  private val derivativeOrdersByHashesDescriptor:
      MethodDescriptor<QueryOuterClass.QueryDerivativeOrdersByHashesRequest, QueryOuterClass.QueryDerivativeOrdersByHashesResponse>
      = QueryGrpc.getDerivativeOrdersByHashesMethod()!!

  private val traderDerivativeTransientOrdersDescriptor:
      MethodDescriptor<QueryOuterClass.QueryTraderDerivativeOrdersRequest, QueryOuterClass.QueryTraderDerivativeOrdersResponse>
      = QueryGrpc.getTraderDerivativeTransientOrdersMethod()!!

  private val derivativeMarketsDescriptor:
      MethodDescriptor<QueryOuterClass.QueryDerivativeMarketsRequest, QueryOuterClass.QueryDerivativeMarketsResponse>
      = QueryGrpc.getDerivativeMarketsMethod()!!

  private val derivativeMarketDescriptor:
      MethodDescriptor<QueryOuterClass.QueryDerivativeMarketRequest, QueryOuterClass.QueryDerivativeMarketResponse>
      = QueryGrpc.getDerivativeMarketMethod()!!

  private val derivativeMarketAddressDescriptor:
      MethodDescriptor<QueryOuterClass.QueryDerivativeMarketAddressRequest, QueryOuterClass.QueryDerivativeMarketAddressResponse>
      = QueryGrpc.getDerivativeMarketAddressMethod()!!

  private val subaccountTradeNonceDescriptor:
      MethodDescriptor<QueryOuterClass.QuerySubaccountTradeNonceRequest, QueryOuterClass.QuerySubaccountTradeNonceResponse>
      = QueryGrpc.getSubaccountTradeNonceMethod()!!

  private val exchangeModuleStateDescriptor:
      MethodDescriptor<QueryOuterClass.QueryModuleStateRequest, QueryOuterClass.QueryModuleStateResponse>
      = QueryGrpc.getExchangeModuleStateMethod()!!

  private val positionsDescriptor:
      MethodDescriptor<QueryOuterClass.QueryPositionsRequest, QueryOuterClass.QueryPositionsResponse>
      = QueryGrpc.getPositionsMethod()!!

  private val subaccountPositionsDescriptor:
      MethodDescriptor<QueryOuterClass.QuerySubaccountPositionsRequest, QueryOuterClass.QuerySubaccountPositionsResponse>
      = QueryGrpc.getSubaccountPositionsMethod()!!

  private val subaccountPositionInMarketDescriptor:
      MethodDescriptor<QueryOuterClass.QuerySubaccountPositionInMarketRequest, QueryOuterClass.QuerySubaccountPositionInMarketResponse>
      = QueryGrpc.getSubaccountPositionInMarketMethod()!!

  private val subaccountEffectivePositionInMarketDescriptor:
      MethodDescriptor<QueryOuterClass.QuerySubaccountEffectivePositionInMarketRequest, QueryOuterClass.QuerySubaccountEffectivePositionInMarketResponse>
      = QueryGrpc.getSubaccountEffectivePositionInMarketMethod()!!

  private val perpetualMarketInfoDescriptor:
      MethodDescriptor<QueryOuterClass.QueryPerpetualMarketInfoRequest, QueryOuterClass.QueryPerpetualMarketInfoResponse>
      = QueryGrpc.getPerpetualMarketInfoMethod()!!

  private val expiryFuturesMarketInfoDescriptor:
      MethodDescriptor<QueryOuterClass.QueryExpiryFuturesMarketInfoRequest, QueryOuterClass.QueryExpiryFuturesMarketInfoResponse>
      = QueryGrpc.getExpiryFuturesMarketInfoMethod()!!

  private val perpetualMarketFundingDescriptor:
      MethodDescriptor<QueryOuterClass.QueryPerpetualMarketFundingRequest, QueryOuterClass.QueryPerpetualMarketFundingResponse>
      = QueryGrpc.getPerpetualMarketFundingMethod()!!

  private val subaccountOrderMetadataDescriptor:
      MethodDescriptor<QueryOuterClass.QuerySubaccountOrderMetadataRequest, QueryOuterClass.QuerySubaccountOrderMetadataResponse>
      = QueryGrpc.getSubaccountOrderMetadataMethod()!!

  private val tradeRewardPointsDescriptor:
      MethodDescriptor<QueryOuterClass.QueryTradeRewardPointsRequest, QueryOuterClass.QueryTradeRewardPointsResponse>
      = QueryGrpc.getTradeRewardPointsMethod()!!

  private val pendingTradeRewardPointsDescriptor:
      MethodDescriptor<QueryOuterClass.QueryTradeRewardPointsRequest, QueryOuterClass.QueryTradeRewardPointsResponse>
      = QueryGrpc.getPendingTradeRewardPointsMethod()!!

  private val tradeRewardCampaignDescriptor:
      MethodDescriptor<QueryOuterClass.QueryTradeRewardCampaignRequest, QueryOuterClass.QueryTradeRewardCampaignResponse>
      = QueryGrpc.getTradeRewardCampaignMethod()!!

  private val feeDiscountAccountInfoDescriptor:
      MethodDescriptor<QueryOuterClass.QueryFeeDiscountAccountInfoRequest, QueryOuterClass.QueryFeeDiscountAccountInfoResponse>
      = QueryGrpc.getFeeDiscountAccountInfoMethod()!!

  private val feeDiscountScheduleDescriptor:
      MethodDescriptor<QueryOuterClass.QueryFeeDiscountScheduleRequest, QueryOuterClass.QueryFeeDiscountScheduleResponse>
      = QueryGrpc.getFeeDiscountScheduleMethod()!!

  private val balanceMismatchesDescriptor:
      MethodDescriptor<QueryOuterClass.QueryBalanceMismatchesRequest, QueryOuterClass.QueryBalanceMismatchesResponse>
      = QueryGrpc.getBalanceMismatchesMethod()!!

  private val balanceWithBalanceHoldsDescriptor:
      MethodDescriptor<QueryOuterClass.QueryBalanceWithBalanceHoldsRequest, QueryOuterClass.QueryBalanceWithBalanceHoldsResponse>
      = QueryGrpc.getBalanceWithBalanceHoldsMethod()!!

  private val feeDiscountTierStatisticsDescriptor:
      MethodDescriptor<QueryOuterClass.QueryFeeDiscountTierStatisticsRequest, QueryOuterClass.QueryFeeDiscountTierStatisticsResponse>
      = QueryGrpc.getFeeDiscountTierStatisticsMethod()!!

  private val mitoVaultInfosDescriptor:
      MethodDescriptor<QueryOuterClass.MitoVaultInfosRequest, QueryOuterClass.MitoVaultInfosResponse>
      = QueryGrpc.getMitoVaultInfosMethod()!!

  private val queryMarketIDFromVaultDescriptor:
      MethodDescriptor<QueryOuterClass.QueryMarketIDFromVaultRequest, QueryOuterClass.QueryMarketIDFromVaultResponse>
      = QueryGrpc.getQueryMarketIDFromVaultMethod()!!

  private val historicalTradeRecordsDescriptor:
      MethodDescriptor<QueryOuterClass.QueryHistoricalTradeRecordsRequest, QueryOuterClass.QueryHistoricalTradeRecordsResponse>
      = QueryGrpc.getHistoricalTradeRecordsMethod()!!

  private val isOptedOutOfRewardsDescriptor:
      MethodDescriptor<QueryOuterClass.QueryIsOptedOutOfRewardsRequest, QueryOuterClass.QueryIsOptedOutOfRewardsResponse>
      = QueryGrpc.getIsOptedOutOfRewardsMethod()!!

  private val optedOutOfRewardsAccountsDescriptor:
      MethodDescriptor<QueryOuterClass.QueryOptedOutOfRewardsAccountsRequest, QueryOuterClass.QueryOptedOutOfRewardsAccountsResponse>
      = QueryGrpc.getOptedOutOfRewardsAccountsMethod()!!

  private val marketVolatilityDescriptor:
      MethodDescriptor<QueryOuterClass.QueryMarketVolatilityRequest, QueryOuterClass.QueryMarketVolatilityResponse>
      = QueryGrpc.getMarketVolatilityMethod()!!

  private val binaryOptionsMarketsDescriptor:
      MethodDescriptor<QueryOuterClass.QueryBinaryMarketsRequest, QueryOuterClass.QueryBinaryMarketsResponse>
      = QueryGrpc.getBinaryOptionsMarketsMethod()!!

  private val traderDerivativeConditionalOrdersDescriptor:
      MethodDescriptor<QueryOuterClass.QueryTraderDerivativeConditionalOrdersRequest, QueryOuterClass.QueryTraderDerivativeConditionalOrdersResponse>
      = QueryGrpc.getTraderDerivativeConditionalOrdersMethod()!!

  private val marketAtomicExecutionFeeMultiplierDescriptor:
      MethodDescriptor<QueryOuterClass.QueryMarketAtomicExecutionFeeMultiplierRequest, QueryOuterClass.QueryMarketAtomicExecutionFeeMultiplierResponse>
      = QueryGrpc.getMarketAtomicExecutionFeeMultiplierMethod()!!

  public abstract class Server(
    coroutineContext: CoroutineContext = EmptyCoroutineContext,
  ) : AbstractCoroutineServerImpl(context = coroutineContext), Query.Interface {
    public open override suspend fun queryExchangeParams(request: QueryExchangeParamsRequest):
        QueryExchangeParamsResponse = throw
        StatusException(Status.UNIMPLEMENTED.withDescription("Method injective.exchange.v1beta1.Query.QueryExchangeParams is unimplemented"))

    public open override suspend fun subaccountDeposits(request: QuerySubaccountDepositsRequest):
        QuerySubaccountDepositsResponse = throw
        StatusException(Status.UNIMPLEMENTED.withDescription("Method injective.exchange.v1beta1.Query.SubaccountDeposits is unimplemented"))

    public open override suspend fun subaccountDeposit(request: QuerySubaccountDepositRequest):
        QuerySubaccountDepositResponse = throw
        StatusException(Status.UNIMPLEMENTED.withDescription("Method injective.exchange.v1beta1.Query.SubaccountDeposit is unimplemented"))

    public open override suspend fun exchangeBalances(request: QueryExchangeBalancesRequest):
        QueryExchangeBalancesResponse = throw
        StatusException(Status.UNIMPLEMENTED.withDescription("Method injective.exchange.v1beta1.Query.ExchangeBalances is unimplemented"))

    public open override suspend fun aggregateVolume(request: QueryAggregateVolumeRequest):
        QueryAggregateVolumeResponse = throw
        StatusException(Status.UNIMPLEMENTED.withDescription("Method injective.exchange.v1beta1.Query.AggregateVolume is unimplemented"))

    public open override suspend fun aggregateVolumes(request: QueryAggregateVolumesRequest):
        QueryAggregateVolumesResponse = throw
        StatusException(Status.UNIMPLEMENTED.withDescription("Method injective.exchange.v1beta1.Query.AggregateVolumes is unimplemented"))

    public open override suspend
        fun aggregateMarketVolume(request: QueryAggregateMarketVolumeRequest):
        QueryAggregateMarketVolumeResponse = throw
        StatusException(Status.UNIMPLEMENTED.withDescription("Method injective.exchange.v1beta1.Query.AggregateMarketVolume is unimplemented"))

    public open override suspend
        fun aggregateMarketVolumes(request: QueryAggregateMarketVolumesRequest):
        QueryAggregateMarketVolumesResponse = throw
        StatusException(Status.UNIMPLEMENTED.withDescription("Method injective.exchange.v1beta1.Query.AggregateMarketVolumes is unimplemented"))

    public open override suspend fun denomDecimal(request: QueryDenomDecimalRequest):
        QueryDenomDecimalResponse = throw
        StatusException(Status.UNIMPLEMENTED.withDescription("Method injective.exchange.v1beta1.Query.DenomDecimal is unimplemented"))

    public open override suspend fun denomDecimals(request: QueryDenomDecimalsRequest):
        QueryDenomDecimalsResponse = throw
        StatusException(Status.UNIMPLEMENTED.withDescription("Method injective.exchange.v1beta1.Query.DenomDecimals is unimplemented"))

    public open override suspend fun spotMarkets(request: QuerySpotMarketsRequest):
        QuerySpotMarketsResponse = throw
        StatusException(Status.UNIMPLEMENTED.withDescription("Method injective.exchange.v1beta1.Query.SpotMarkets is unimplemented"))

    public open override suspend fun spotMarket(request: QuerySpotMarketRequest):
        QuerySpotMarketResponse = throw
        StatusException(Status.UNIMPLEMENTED.withDescription("Method injective.exchange.v1beta1.Query.SpotMarket is unimplemented"))

    public open override suspend fun fullSpotMarkets(request: QueryFullSpotMarketsRequest):
        QueryFullSpotMarketsResponse = throw
        StatusException(Status.UNIMPLEMENTED.withDescription("Method injective.exchange.v1beta1.Query.FullSpotMarkets is unimplemented"))

    public open override suspend fun fullSpotMarket(request: QueryFullSpotMarketRequest):
        QueryFullSpotMarketResponse = throw
        StatusException(Status.UNIMPLEMENTED.withDescription("Method injective.exchange.v1beta1.Query.FullSpotMarket is unimplemented"))

    public open override suspend fun spotOrderbook(request: QuerySpotOrderbookRequest):
        QuerySpotOrderbookResponse = throw
        StatusException(Status.UNIMPLEMENTED.withDescription("Method injective.exchange.v1beta1.Query.SpotOrderbook is unimplemented"))

    public open override suspend fun traderSpotOrders(request: QueryTraderSpotOrdersRequest):
        QueryTraderSpotOrdersResponse = throw
        StatusException(Status.UNIMPLEMENTED.withDescription("Method injective.exchange.v1beta1.Query.TraderSpotOrders is unimplemented"))

    public open override suspend
        fun accountAddressSpotOrders(request: QueryAccountAddressSpotOrdersRequest):
        QueryAccountAddressSpotOrdersResponse = throw
        StatusException(Status.UNIMPLEMENTED.withDescription("Method injective.exchange.v1beta1.Query.AccountAddressSpotOrders is unimplemented"))

    public open override suspend fun spotOrdersByHashes(request: QuerySpotOrdersByHashesRequest):
        QuerySpotOrdersByHashesResponse = throw
        StatusException(Status.UNIMPLEMENTED.withDescription("Method injective.exchange.v1beta1.Query.SpotOrdersByHashes is unimplemented"))

    public open override suspend fun subaccountOrders(request: QuerySubaccountOrdersRequest):
        QuerySubaccountOrdersResponse = throw
        StatusException(Status.UNIMPLEMENTED.withDescription("Method injective.exchange.v1beta1.Query.SubaccountOrders is unimplemented"))

    public open override suspend
        fun traderSpotTransientOrders(request: QueryTraderSpotOrdersRequest):
        QueryTraderSpotOrdersResponse = throw
        StatusException(Status.UNIMPLEMENTED.withDescription("Method injective.exchange.v1beta1.Query.TraderSpotTransientOrders is unimplemented"))

    public open override suspend fun spotMidPriceAndTOB(request: QuerySpotMidPriceAndTOBRequest):
        QuerySpotMidPriceAndTOBResponse = throw
        StatusException(Status.UNIMPLEMENTED.withDescription("Method injective.exchange.v1beta1.Query.SpotMidPriceAndTOB is unimplemented"))

    public open override suspend
        fun derivativeMidPriceAndTOB(request: QueryDerivativeMidPriceAndTOBRequest):
        QueryDerivativeMidPriceAndTOBResponse = throw
        StatusException(Status.UNIMPLEMENTED.withDescription("Method injective.exchange.v1beta1.Query.DerivativeMidPriceAndTOB is unimplemented"))

    public open override suspend fun derivativeOrderbook(request: QueryDerivativeOrderbookRequest):
        QueryDerivativeOrderbookResponse = throw
        StatusException(Status.UNIMPLEMENTED.withDescription("Method injective.exchange.v1beta1.Query.DerivativeOrderbook is unimplemented"))

    public open override suspend
        fun traderDerivativeOrders(request: QueryTraderDerivativeOrdersRequest):
        QueryTraderDerivativeOrdersResponse = throw
        StatusException(Status.UNIMPLEMENTED.withDescription("Method injective.exchange.v1beta1.Query.TraderDerivativeOrders is unimplemented"))

    public open override suspend
        fun accountAddressDerivativeOrders(request: QueryAccountAddressDerivativeOrdersRequest):
        QueryAccountAddressDerivativeOrdersResponse = throw
        StatusException(Status.UNIMPLEMENTED.withDescription("Method injective.exchange.v1beta1.Query.AccountAddressDerivativeOrders is unimplemented"))

    public open override suspend
        fun derivativeOrdersByHashes(request: QueryDerivativeOrdersByHashesRequest):
        QueryDerivativeOrdersByHashesResponse = throw
        StatusException(Status.UNIMPLEMENTED.withDescription("Method injective.exchange.v1beta1.Query.DerivativeOrdersByHashes is unimplemented"))

    public open override suspend
        fun traderDerivativeTransientOrders(request: QueryTraderDerivativeOrdersRequest):
        QueryTraderDerivativeOrdersResponse = throw
        StatusException(Status.UNIMPLEMENTED.withDescription("Method injective.exchange.v1beta1.Query.TraderDerivativeTransientOrders is unimplemented"))

    public open override suspend fun derivativeMarkets(request: QueryDerivativeMarketsRequest):
        QueryDerivativeMarketsResponse = throw
        StatusException(Status.UNIMPLEMENTED.withDescription("Method injective.exchange.v1beta1.Query.DerivativeMarkets is unimplemented"))

    public open override suspend fun derivativeMarket(request: QueryDerivativeMarketRequest):
        QueryDerivativeMarketResponse = throw
        StatusException(Status.UNIMPLEMENTED.withDescription("Method injective.exchange.v1beta1.Query.DerivativeMarket is unimplemented"))

    public open override suspend
        fun derivativeMarketAddress(request: QueryDerivativeMarketAddressRequest):
        QueryDerivativeMarketAddressResponse = throw
        StatusException(Status.UNIMPLEMENTED.withDescription("Method injective.exchange.v1beta1.Query.DerivativeMarketAddress is unimplemented"))

    public open override suspend
        fun subaccountTradeNonce(request: QuerySubaccountTradeNonceRequest):
        QuerySubaccountTradeNonceResponse = throw
        StatusException(Status.UNIMPLEMENTED.withDescription("Method injective.exchange.v1beta1.Query.SubaccountTradeNonce is unimplemented"))

    public open override suspend fun exchangeModuleState(request: QueryModuleStateRequest):
        QueryModuleStateResponse = throw
        StatusException(Status.UNIMPLEMENTED.withDescription("Method injective.exchange.v1beta1.Query.ExchangeModuleState is unimplemented"))

    public open override suspend fun positions(request: QueryPositionsRequest):
        QueryPositionsResponse = throw
        StatusException(Status.UNIMPLEMENTED.withDescription("Method injective.exchange.v1beta1.Query.Positions is unimplemented"))

    public open override suspend fun subaccountPositions(request: QuerySubaccountPositionsRequest):
        QuerySubaccountPositionsResponse = throw
        StatusException(Status.UNIMPLEMENTED.withDescription("Method injective.exchange.v1beta1.Query.SubaccountPositions is unimplemented"))

    public open override suspend
        fun subaccountPositionInMarket(request: QuerySubaccountPositionInMarketRequest):
        QuerySubaccountPositionInMarketResponse = throw
        StatusException(Status.UNIMPLEMENTED.withDescription("Method injective.exchange.v1beta1.Query.SubaccountPositionInMarket is unimplemented"))

    public open override suspend
        fun subaccountEffectivePositionInMarket(request: QuerySubaccountEffectivePositionInMarketRequest):
        QuerySubaccountEffectivePositionInMarketResponse = throw
        StatusException(Status.UNIMPLEMENTED.withDescription("Method injective.exchange.v1beta1.Query.SubaccountEffectivePositionInMarket is unimplemented"))

    public open override suspend fun perpetualMarketInfo(request: QueryPerpetualMarketInfoRequest):
        QueryPerpetualMarketInfoResponse = throw
        StatusException(Status.UNIMPLEMENTED.withDescription("Method injective.exchange.v1beta1.Query.PerpetualMarketInfo is unimplemented"))

    public open override suspend
        fun expiryFuturesMarketInfo(request: QueryExpiryFuturesMarketInfoRequest):
        QueryExpiryFuturesMarketInfoResponse = throw
        StatusException(Status.UNIMPLEMENTED.withDescription("Method injective.exchange.v1beta1.Query.ExpiryFuturesMarketInfo is unimplemented"))

    public open override suspend
        fun perpetualMarketFunding(request: QueryPerpetualMarketFundingRequest):
        QueryPerpetualMarketFundingResponse = throw
        StatusException(Status.UNIMPLEMENTED.withDescription("Method injective.exchange.v1beta1.Query.PerpetualMarketFunding is unimplemented"))

    public open override suspend
        fun subaccountOrderMetadata(request: QuerySubaccountOrderMetadataRequest):
        QuerySubaccountOrderMetadataResponse = throw
        StatusException(Status.UNIMPLEMENTED.withDescription("Method injective.exchange.v1beta1.Query.SubaccountOrderMetadata is unimplemented"))

    public open override suspend fun tradeRewardPoints(request: QueryTradeRewardPointsRequest):
        QueryTradeRewardPointsResponse = throw
        StatusException(Status.UNIMPLEMENTED.withDescription("Method injective.exchange.v1beta1.Query.TradeRewardPoints is unimplemented"))

    public open override suspend
        fun pendingTradeRewardPoints(request: QueryTradeRewardPointsRequest):
        QueryTradeRewardPointsResponse = throw
        StatusException(Status.UNIMPLEMENTED.withDescription("Method injective.exchange.v1beta1.Query.PendingTradeRewardPoints is unimplemented"))

    public open override suspend fun tradeRewardCampaign(request: QueryTradeRewardCampaignRequest):
        QueryTradeRewardCampaignResponse = throw
        StatusException(Status.UNIMPLEMENTED.withDescription("Method injective.exchange.v1beta1.Query.TradeRewardCampaign is unimplemented"))

    public open override suspend
        fun feeDiscountAccountInfo(request: QueryFeeDiscountAccountInfoRequest):
        QueryFeeDiscountAccountInfoResponse = throw
        StatusException(Status.UNIMPLEMENTED.withDescription("Method injective.exchange.v1beta1.Query.FeeDiscountAccountInfo is unimplemented"))

    public open override suspend fun feeDiscountSchedule(request: QueryFeeDiscountScheduleRequest):
        QueryFeeDiscountScheduleResponse = throw
        StatusException(Status.UNIMPLEMENTED.withDescription("Method injective.exchange.v1beta1.Query.FeeDiscountSchedule is unimplemented"))

    public open override suspend fun balanceMismatches(request: QueryBalanceMismatchesRequest):
        QueryBalanceMismatchesResponse = throw
        StatusException(Status.UNIMPLEMENTED.withDescription("Method injective.exchange.v1beta1.Query.BalanceMismatches is unimplemented"))

    public open override suspend
        fun balanceWithBalanceHolds(request: QueryBalanceWithBalanceHoldsRequest):
        QueryBalanceWithBalanceHoldsResponse = throw
        StatusException(Status.UNIMPLEMENTED.withDescription("Method injective.exchange.v1beta1.Query.BalanceWithBalanceHolds is unimplemented"))

    public open override suspend
        fun feeDiscountTierStatistics(request: QueryFeeDiscountTierStatisticsRequest):
        QueryFeeDiscountTierStatisticsResponse = throw
        StatusException(Status.UNIMPLEMENTED.withDescription("Method injective.exchange.v1beta1.Query.FeeDiscountTierStatistics is unimplemented"))

    public open override suspend fun mitoVaultInfos(request: MitoVaultInfosRequest):
        MitoVaultInfosResponse = throw
        StatusException(Status.UNIMPLEMENTED.withDescription("Method injective.exchange.v1beta1.Query.MitoVaultInfos is unimplemented"))

    public open override suspend fun queryMarketIDFromVault(request: QueryMarketIDFromVaultRequest):
        QueryMarketIDFromVaultResponse = throw
        StatusException(Status.UNIMPLEMENTED.withDescription("Method injective.exchange.v1beta1.Query.QueryMarketIDFromVault is unimplemented"))

    public open override suspend
        fun historicalTradeRecords(request: QueryHistoricalTradeRecordsRequest):
        QueryHistoricalTradeRecordsResponse = throw
        StatusException(Status.UNIMPLEMENTED.withDescription("Method injective.exchange.v1beta1.Query.HistoricalTradeRecords is unimplemented"))

    public open override suspend fun isOptedOutOfRewards(request: QueryIsOptedOutOfRewardsRequest):
        QueryIsOptedOutOfRewardsResponse = throw
        StatusException(Status.UNIMPLEMENTED.withDescription("Method injective.exchange.v1beta1.Query.IsOptedOutOfRewards is unimplemented"))

    public open override suspend
        fun optedOutOfRewardsAccounts(request: QueryOptedOutOfRewardsAccountsRequest):
        QueryOptedOutOfRewardsAccountsResponse = throw
        StatusException(Status.UNIMPLEMENTED.withDescription("Method injective.exchange.v1beta1.Query.OptedOutOfRewardsAccounts is unimplemented"))

    public open override suspend fun marketVolatility(request: QueryMarketVolatilityRequest):
        QueryMarketVolatilityResponse = throw
        StatusException(Status.UNIMPLEMENTED.withDescription("Method injective.exchange.v1beta1.Query.MarketVolatility is unimplemented"))

    public open override suspend fun binaryOptionsMarkets(request: QueryBinaryMarketsRequest):
        QueryBinaryMarketsResponse = throw
        StatusException(Status.UNIMPLEMENTED.withDescription("Method injective.exchange.v1beta1.Query.BinaryOptionsMarkets is unimplemented"))

    public open override suspend
        fun traderDerivativeConditionalOrders(request: QueryTraderDerivativeConditionalOrdersRequest):
        QueryTraderDerivativeConditionalOrdersResponse = throw
        StatusException(Status.UNIMPLEMENTED.withDescription("Method injective.exchange.v1beta1.Query.TraderDerivativeConditionalOrders is unimplemented"))

    public open override suspend
        fun marketAtomicExecutionFeeMultiplier(request: QueryMarketAtomicExecutionFeeMultiplierRequest):
        QueryMarketAtomicExecutionFeeMultiplierResponse = throw
        StatusException(Status.UNIMPLEMENTED.withDescription("Method injective.exchange.v1beta1.Query.MarketAtomicExecutionFeeMultiplier is unimplemented"))

    public override fun bindService(): ServerServiceDefinition =
        ServerServiceDefinition.builder(descriptor)
    		.addMethod(
    			ServerCalls.unaryServerMethodDefinition(
    				context = this.context,
    				descriptor = queryExchangeParamsDescriptor,
    				implementation = {
        QueryExchangeParamsResponseJvmConverter.convert(queryExchangeParams(QueryExchangeParamsRequestJvmConverter.convert(it)))
        },
    			)
    		)
    		.addMethod(
    			ServerCalls.unaryServerMethodDefinition(
    				context = this.context,
    				descriptor = subaccountDepositsDescriptor,
    				implementation = {
        QuerySubaccountDepositsResponseJvmConverter.convert(subaccountDeposits(QuerySubaccountDepositsRequestJvmConverter.convert(it)))
        },
    			)
    		)
    		.addMethod(
    			ServerCalls.unaryServerMethodDefinition(
    				context = this.context,
    				descriptor = subaccountDepositDescriptor,
    				implementation = {
        QuerySubaccountDepositResponseJvmConverter.convert(subaccountDeposit(QuerySubaccountDepositRequestJvmConverter.convert(it)))
        },
    			)
    		)
    		.addMethod(
    			ServerCalls.unaryServerMethodDefinition(
    				context = this.context,
    				descriptor = exchangeBalancesDescriptor,
    				implementation = {
        QueryExchangeBalancesResponseJvmConverter.convert(exchangeBalances(QueryExchangeBalancesRequestJvmConverter.convert(it)))
        },
    			)
    		)
    		.addMethod(
    			ServerCalls.unaryServerMethodDefinition(
    				context = this.context,
    				descriptor = aggregateVolumeDescriptor,
    				implementation = {
        QueryAggregateVolumeResponseJvmConverter.convert(aggregateVolume(QueryAggregateVolumeRequestJvmConverter.convert(it)))
        },
    			)
    		)
    		.addMethod(
    			ServerCalls.unaryServerMethodDefinition(
    				context = this.context,
    				descriptor = aggregateVolumesDescriptor,
    				implementation = {
        QueryAggregateVolumesResponseJvmConverter.convert(aggregateVolumes(QueryAggregateVolumesRequestJvmConverter.convert(it)))
        },
    			)
    		)
    		.addMethod(
    			ServerCalls.unaryServerMethodDefinition(
    				context = this.context,
    				descriptor = aggregateMarketVolumeDescriptor,
    				implementation = {
        QueryAggregateMarketVolumeResponseJvmConverter.convert(aggregateMarketVolume(QueryAggregateMarketVolumeRequestJvmConverter.convert(it)))
        },
    			)
    		)
    		.addMethod(
    			ServerCalls.unaryServerMethodDefinition(
    				context = this.context,
    				descriptor = aggregateMarketVolumesDescriptor,
    				implementation = {
        QueryAggregateMarketVolumesResponseJvmConverter.convert(aggregateMarketVolumes(QueryAggregateMarketVolumesRequestJvmConverter.convert(it)))
        },
    			)
    		)
    		.addMethod(
    			ServerCalls.unaryServerMethodDefinition(
    				context = this.context,
    				descriptor = denomDecimalDescriptor,
    				implementation = {
        QueryDenomDecimalResponseJvmConverter.convert(denomDecimal(QueryDenomDecimalRequestJvmConverter.convert(it)))
        },
    			)
    		)
    		.addMethod(
    			ServerCalls.unaryServerMethodDefinition(
    				context = this.context,
    				descriptor = denomDecimalsDescriptor,
    				implementation = {
        QueryDenomDecimalsResponseJvmConverter.convert(denomDecimals(QueryDenomDecimalsRequestJvmConverter.convert(it)))
        },
    			)
    		)
    		.addMethod(
    			ServerCalls.unaryServerMethodDefinition(
    				context = this.context,
    				descriptor = spotMarketsDescriptor,
    				implementation = {
        QuerySpotMarketsResponseJvmConverter.convert(spotMarkets(QuerySpotMarketsRequestJvmConverter.convert(it)))
        },
    			)
    		)
    		.addMethod(
    			ServerCalls.unaryServerMethodDefinition(
    				context = this.context,
    				descriptor = spotMarketDescriptor,
    				implementation = {
        QuerySpotMarketResponseJvmConverter.convert(spotMarket(QuerySpotMarketRequestJvmConverter.convert(it)))
        },
    			)
    		)
    		.addMethod(
    			ServerCalls.unaryServerMethodDefinition(
    				context = this.context,
    				descriptor = fullSpotMarketsDescriptor,
    				implementation = {
        QueryFullSpotMarketsResponseJvmConverter.convert(fullSpotMarkets(QueryFullSpotMarketsRequestJvmConverter.convert(it)))
        },
    			)
    		)
    		.addMethod(
    			ServerCalls.unaryServerMethodDefinition(
    				context = this.context,
    				descriptor = fullSpotMarketDescriptor,
    				implementation = {
        QueryFullSpotMarketResponseJvmConverter.convert(fullSpotMarket(QueryFullSpotMarketRequestJvmConverter.convert(it)))
        },
    			)
    		)
    		.addMethod(
    			ServerCalls.unaryServerMethodDefinition(
    				context = this.context,
    				descriptor = spotOrderbookDescriptor,
    				implementation = {
        QuerySpotOrderbookResponseJvmConverter.convert(spotOrderbook(QuerySpotOrderbookRequestJvmConverter.convert(it)))
        },
    			)
    		)
    		.addMethod(
    			ServerCalls.unaryServerMethodDefinition(
    				context = this.context,
    				descriptor = traderSpotOrdersDescriptor,
    				implementation = {
        QueryTraderSpotOrdersResponseJvmConverter.convert(traderSpotOrders(QueryTraderSpotOrdersRequestJvmConverter.convert(it)))
        },
    			)
    		)
    		.addMethod(
    			ServerCalls.unaryServerMethodDefinition(
    				context = this.context,
    				descriptor = accountAddressSpotOrdersDescriptor,
    				implementation = {
        QueryAccountAddressSpotOrdersResponseJvmConverter.convert(accountAddressSpotOrders(QueryAccountAddressSpotOrdersRequestJvmConverter.convert(it)))
        },
    			)
    		)
    		.addMethod(
    			ServerCalls.unaryServerMethodDefinition(
    				context = this.context,
    				descriptor = spotOrdersByHashesDescriptor,
    				implementation = {
        QuerySpotOrdersByHashesResponseJvmConverter.convert(spotOrdersByHashes(QuerySpotOrdersByHashesRequestJvmConverter.convert(it)))
        },
    			)
    		)
    		.addMethod(
    			ServerCalls.unaryServerMethodDefinition(
    				context = this.context,
    				descriptor = subaccountOrdersDescriptor,
    				implementation = {
        QuerySubaccountOrdersResponseJvmConverter.convert(subaccountOrders(QuerySubaccountOrdersRequestJvmConverter.convert(it)))
        },
    			)
    		)
    		.addMethod(
    			ServerCalls.unaryServerMethodDefinition(
    				context = this.context,
    				descriptor = traderSpotTransientOrdersDescriptor,
    				implementation = {
        QueryTraderSpotOrdersResponseJvmConverter.convert(traderSpotTransientOrders(QueryTraderSpotOrdersRequestJvmConverter.convert(it)))
        },
    			)
    		)
    		.addMethod(
    			ServerCalls.unaryServerMethodDefinition(
    				context = this.context,
    				descriptor = spotMidPriceAndTOBDescriptor,
    				implementation = {
        QuerySpotMidPriceAndTOBResponseJvmConverter.convert(spotMidPriceAndTOB(QuerySpotMidPriceAndTOBRequestJvmConverter.convert(it)))
        },
    			)
    		)
    		.addMethod(
    			ServerCalls.unaryServerMethodDefinition(
    				context = this.context,
    				descriptor = derivativeMidPriceAndTOBDescriptor,
    				implementation = {
        QueryDerivativeMidPriceAndTOBResponseJvmConverter.convert(derivativeMidPriceAndTOB(QueryDerivativeMidPriceAndTOBRequestJvmConverter.convert(it)))
        },
    			)
    		)
    		.addMethod(
    			ServerCalls.unaryServerMethodDefinition(
    				context = this.context,
    				descriptor = derivativeOrderbookDescriptor,
    				implementation = {
        QueryDerivativeOrderbookResponseJvmConverter.convert(derivativeOrderbook(QueryDerivativeOrderbookRequestJvmConverter.convert(it)))
        },
    			)
    		)
    		.addMethod(
    			ServerCalls.unaryServerMethodDefinition(
    				context = this.context,
    				descriptor = traderDerivativeOrdersDescriptor,
    				implementation = {
        QueryTraderDerivativeOrdersResponseJvmConverter.convert(traderDerivativeOrders(QueryTraderDerivativeOrdersRequestJvmConverter.convert(it)))
        },
    			)
    		)
    		.addMethod(
    			ServerCalls.unaryServerMethodDefinition(
    				context = this.context,
    				descriptor = accountAddressDerivativeOrdersDescriptor,
    				implementation = {
        QueryAccountAddressDerivativeOrdersResponseJvmConverter.convert(accountAddressDerivativeOrders(QueryAccountAddressDerivativeOrdersRequestJvmConverter.convert(it)))
        },
    			)
    		)
    		.addMethod(
    			ServerCalls.unaryServerMethodDefinition(
    				context = this.context,
    				descriptor = derivativeOrdersByHashesDescriptor,
    				implementation = {
        QueryDerivativeOrdersByHashesResponseJvmConverter.convert(derivativeOrdersByHashes(QueryDerivativeOrdersByHashesRequestJvmConverter.convert(it)))
        },
    			)
    		)
    		.addMethod(
    			ServerCalls.unaryServerMethodDefinition(
    				context = this.context,
    				descriptor = traderDerivativeTransientOrdersDescriptor,
    				implementation = {
        QueryTraderDerivativeOrdersResponseJvmConverter.convert(traderDerivativeTransientOrders(QueryTraderDerivativeOrdersRequestJvmConverter.convert(it)))
        },
    			)
    		)
    		.addMethod(
    			ServerCalls.unaryServerMethodDefinition(
    				context = this.context,
    				descriptor = derivativeMarketsDescriptor,
    				implementation = {
        QueryDerivativeMarketsResponseJvmConverter.convert(derivativeMarkets(QueryDerivativeMarketsRequestJvmConverter.convert(it)))
        },
    			)
    		)
    		.addMethod(
    			ServerCalls.unaryServerMethodDefinition(
    				context = this.context,
    				descriptor = derivativeMarketDescriptor,
    				implementation = {
        QueryDerivativeMarketResponseJvmConverter.convert(derivativeMarket(QueryDerivativeMarketRequestJvmConverter.convert(it)))
        },
    			)
    		)
    		.addMethod(
    			ServerCalls.unaryServerMethodDefinition(
    				context = this.context,
    				descriptor = derivativeMarketAddressDescriptor,
    				implementation = {
        QueryDerivativeMarketAddressResponseJvmConverter.convert(derivativeMarketAddress(QueryDerivativeMarketAddressRequestJvmConverter.convert(it)))
        },
    			)
    		)
    		.addMethod(
    			ServerCalls.unaryServerMethodDefinition(
    				context = this.context,
    				descriptor = subaccountTradeNonceDescriptor,
    				implementation = {
        QuerySubaccountTradeNonceResponseJvmConverter.convert(subaccountTradeNonce(QuerySubaccountTradeNonceRequestJvmConverter.convert(it)))
        },
    			)
    		)
    		.addMethod(
    			ServerCalls.unaryServerMethodDefinition(
    				context = this.context,
    				descriptor = exchangeModuleStateDescriptor,
    				implementation = {
        QueryModuleStateResponseJvmConverter.convert(exchangeModuleState(QueryModuleStateRequestJvmConverter.convert(it)))
        },
    			)
    		)
    		.addMethod(
    			ServerCalls.unaryServerMethodDefinition(
    				context = this.context,
    				descriptor = positionsDescriptor,
    				implementation = {
        QueryPositionsResponseJvmConverter.convert(positions(QueryPositionsRequestJvmConverter.convert(it)))
        },
    			)
    		)
    		.addMethod(
    			ServerCalls.unaryServerMethodDefinition(
    				context = this.context,
    				descriptor = subaccountPositionsDescriptor,
    				implementation = {
        QuerySubaccountPositionsResponseJvmConverter.convert(subaccountPositions(QuerySubaccountPositionsRequestJvmConverter.convert(it)))
        },
    			)
    		)
    		.addMethod(
    			ServerCalls.unaryServerMethodDefinition(
    				context = this.context,
    				descriptor = subaccountPositionInMarketDescriptor,
    				implementation = {
        QuerySubaccountPositionInMarketResponseJvmConverter.convert(subaccountPositionInMarket(QuerySubaccountPositionInMarketRequestJvmConverter.convert(it)))
        },
    			)
    		)
    		.addMethod(
    			ServerCalls.unaryServerMethodDefinition(
    				context = this.context,
    				descriptor = subaccountEffectivePositionInMarketDescriptor,
    				implementation = {
        QuerySubaccountEffectivePositionInMarketResponseJvmConverter.convert(subaccountEffectivePositionInMarket(QuerySubaccountEffectivePositionInMarketRequestJvmConverter.convert(it)))
        },
    			)
    		)
    		.addMethod(
    			ServerCalls.unaryServerMethodDefinition(
    				context = this.context,
    				descriptor = perpetualMarketInfoDescriptor,
    				implementation = {
        QueryPerpetualMarketInfoResponseJvmConverter.convert(perpetualMarketInfo(QueryPerpetualMarketInfoRequestJvmConverter.convert(it)))
        },
    			)
    		)
    		.addMethod(
    			ServerCalls.unaryServerMethodDefinition(
    				context = this.context,
    				descriptor = expiryFuturesMarketInfoDescriptor,
    				implementation = {
        QueryExpiryFuturesMarketInfoResponseJvmConverter.convert(expiryFuturesMarketInfo(QueryExpiryFuturesMarketInfoRequestJvmConverter.convert(it)))
        },
    			)
    		)
    		.addMethod(
    			ServerCalls.unaryServerMethodDefinition(
    				context = this.context,
    				descriptor = perpetualMarketFundingDescriptor,
    				implementation = {
        QueryPerpetualMarketFundingResponseJvmConverter.convert(perpetualMarketFunding(QueryPerpetualMarketFundingRequestJvmConverter.convert(it)))
        },
    			)
    		)
    		.addMethod(
    			ServerCalls.unaryServerMethodDefinition(
    				context = this.context,
    				descriptor = subaccountOrderMetadataDescriptor,
    				implementation = {
        QuerySubaccountOrderMetadataResponseJvmConverter.convert(subaccountOrderMetadata(QuerySubaccountOrderMetadataRequestJvmConverter.convert(it)))
        },
    			)
    		)
    		.addMethod(
    			ServerCalls.unaryServerMethodDefinition(
    				context = this.context,
    				descriptor = tradeRewardPointsDescriptor,
    				implementation = {
        QueryTradeRewardPointsResponseJvmConverter.convert(tradeRewardPoints(QueryTradeRewardPointsRequestJvmConverter.convert(it)))
        },
    			)
    		)
    		.addMethod(
    			ServerCalls.unaryServerMethodDefinition(
    				context = this.context,
    				descriptor = pendingTradeRewardPointsDescriptor,
    				implementation = {
        QueryTradeRewardPointsResponseJvmConverter.convert(pendingTradeRewardPoints(QueryTradeRewardPointsRequestJvmConverter.convert(it)))
        },
    			)
    		)
    		.addMethod(
    			ServerCalls.unaryServerMethodDefinition(
    				context = this.context,
    				descriptor = tradeRewardCampaignDescriptor,
    				implementation = {
        QueryTradeRewardCampaignResponseJvmConverter.convert(tradeRewardCampaign(QueryTradeRewardCampaignRequestJvmConverter.convert(it)))
        },
    			)
    		)
    		.addMethod(
    			ServerCalls.unaryServerMethodDefinition(
    				context = this.context,
    				descriptor = feeDiscountAccountInfoDescriptor,
    				implementation = {
        QueryFeeDiscountAccountInfoResponseJvmConverter.convert(feeDiscountAccountInfo(QueryFeeDiscountAccountInfoRequestJvmConverter.convert(it)))
        },
    			)
    		)
    		.addMethod(
    			ServerCalls.unaryServerMethodDefinition(
    				context = this.context,
    				descriptor = feeDiscountScheduleDescriptor,
    				implementation = {
        QueryFeeDiscountScheduleResponseJvmConverter.convert(feeDiscountSchedule(QueryFeeDiscountScheduleRequestJvmConverter.convert(it)))
        },
    			)
    		)
    		.addMethod(
    			ServerCalls.unaryServerMethodDefinition(
    				context = this.context,
    				descriptor = balanceMismatchesDescriptor,
    				implementation = {
        QueryBalanceMismatchesResponseJvmConverter.convert(balanceMismatches(QueryBalanceMismatchesRequestJvmConverter.convert(it)))
        },
    			)
    		)
    		.addMethod(
    			ServerCalls.unaryServerMethodDefinition(
    				context = this.context,
    				descriptor = balanceWithBalanceHoldsDescriptor,
    				implementation = {
        QueryBalanceWithBalanceHoldsResponseJvmConverter.convert(balanceWithBalanceHolds(QueryBalanceWithBalanceHoldsRequestJvmConverter.convert(it)))
        },
    			)
    		)
    		.addMethod(
    			ServerCalls.unaryServerMethodDefinition(
    				context = this.context,
    				descriptor = feeDiscountTierStatisticsDescriptor,
    				implementation = {
        QueryFeeDiscountTierStatisticsResponseJvmConverter.convert(feeDiscountTierStatistics(QueryFeeDiscountTierStatisticsRequestJvmConverter.convert(it)))
        },
    			)
    		)
    		.addMethod(
    			ServerCalls.unaryServerMethodDefinition(
    				context = this.context,
    				descriptor = mitoVaultInfosDescriptor,
    				implementation = {
        MitoVaultInfosResponseJvmConverter.convert(mitoVaultInfos(MitoVaultInfosRequestJvmConverter.convert(it)))
        },
    			)
    		)
    		.addMethod(
    			ServerCalls.unaryServerMethodDefinition(
    				context = this.context,
    				descriptor = queryMarketIDFromVaultDescriptor,
    				implementation = {
        QueryMarketIDFromVaultResponseJvmConverter.convert(queryMarketIDFromVault(QueryMarketIDFromVaultRequestJvmConverter.convert(it)))
        },
    			)
    		)
    		.addMethod(
    			ServerCalls.unaryServerMethodDefinition(
    				context = this.context,
    				descriptor = historicalTradeRecordsDescriptor,
    				implementation = {
        QueryHistoricalTradeRecordsResponseJvmConverter.convert(historicalTradeRecords(QueryHistoricalTradeRecordsRequestJvmConverter.convert(it)))
        },
    			)
    		)
    		.addMethod(
    			ServerCalls.unaryServerMethodDefinition(
    				context = this.context,
    				descriptor = isOptedOutOfRewardsDescriptor,
    				implementation = {
        QueryIsOptedOutOfRewardsResponseJvmConverter.convert(isOptedOutOfRewards(QueryIsOptedOutOfRewardsRequestJvmConverter.convert(it)))
        },
    			)
    		)
    		.addMethod(
    			ServerCalls.unaryServerMethodDefinition(
    				context = this.context,
    				descriptor = optedOutOfRewardsAccountsDescriptor,
    				implementation = {
        QueryOptedOutOfRewardsAccountsResponseJvmConverter.convert(optedOutOfRewardsAccounts(QueryOptedOutOfRewardsAccountsRequestJvmConverter.convert(it)))
        },
    			)
    		)
    		.addMethod(
    			ServerCalls.unaryServerMethodDefinition(
    				context = this.context,
    				descriptor = marketVolatilityDescriptor,
    				implementation = {
        QueryMarketVolatilityResponseJvmConverter.convert(marketVolatility(QueryMarketVolatilityRequestJvmConverter.convert(it)))
        },
    			)
    		)
    		.addMethod(
    			ServerCalls.unaryServerMethodDefinition(
    				context = this.context,
    				descriptor = binaryOptionsMarketsDescriptor,
    				implementation = {
        QueryBinaryMarketsResponseJvmConverter.convert(binaryOptionsMarkets(QueryBinaryMarketsRequestJvmConverter.convert(it)))
        },
    			)
    		)
    		.addMethod(
    			ServerCalls.unaryServerMethodDefinition(
    				context = this.context,
    				descriptor = traderDerivativeConditionalOrdersDescriptor,
    				implementation = {
        QueryTraderDerivativeConditionalOrdersResponseJvmConverter.convert(traderDerivativeConditionalOrders(QueryTraderDerivativeConditionalOrdersRequestJvmConverter.convert(it)))
        },
    			)
    		)
    		.addMethod(
    			ServerCalls.unaryServerMethodDefinition(
    				context = this.context,
    				descriptor = marketAtomicExecutionFeeMultiplierDescriptor,
    				implementation = {
        QueryMarketAtomicExecutionFeeMultiplierResponseJvmConverter.convert(marketAtomicExecutionFeeMultiplier(QueryMarketAtomicExecutionFeeMultiplierRequestJvmConverter.convert(it)))
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

    public override suspend fun queryExchangeParams(request: QueryExchangeParamsRequest):
        QueryExchangeParamsResponse = queryExchangeParams(request, Metadata())

    public suspend fun queryExchangeParams(request: QueryExchangeParamsRequest, metadata: Metadata):
        QueryExchangeParamsResponse = QueryExchangeParamsResponseJvmConverter.convert(
    		ClientCalls.unaryRpc(
    			option.channel, queryExchangeParamsDescriptor,
    			QueryExchangeParamsRequestJvmConverter.convert(request),
    			option.callOptions, metadata,
    		),
    	)

    public override suspend fun subaccountDeposits(request: QuerySubaccountDepositsRequest):
        QuerySubaccountDepositsResponse = subaccountDeposits(request, Metadata())

    public suspend fun subaccountDeposits(request: QuerySubaccountDepositsRequest,
        metadata: Metadata): QuerySubaccountDepositsResponse =
        QuerySubaccountDepositsResponseJvmConverter.convert(
    		ClientCalls.unaryRpc(
    			option.channel, subaccountDepositsDescriptor,
    			QuerySubaccountDepositsRequestJvmConverter.convert(request),
    			option.callOptions, metadata,
    		),
    	)

    public override suspend fun subaccountDeposit(request: QuerySubaccountDepositRequest):
        QuerySubaccountDepositResponse = subaccountDeposit(request, Metadata())

    public suspend fun subaccountDeposit(request: QuerySubaccountDepositRequest,
        metadata: Metadata): QuerySubaccountDepositResponse =
        QuerySubaccountDepositResponseJvmConverter.convert(
    		ClientCalls.unaryRpc(
    			option.channel, subaccountDepositDescriptor,
    			QuerySubaccountDepositRequestJvmConverter.convert(request),
    			option.callOptions, metadata,
    		),
    	)

    public override suspend fun exchangeBalances(request: QueryExchangeBalancesRequest):
        QueryExchangeBalancesResponse = exchangeBalances(request, Metadata())

    public suspend fun exchangeBalances(request: QueryExchangeBalancesRequest, metadata: Metadata):
        QueryExchangeBalancesResponse = QueryExchangeBalancesResponseJvmConverter.convert(
    		ClientCalls.unaryRpc(
    			option.channel, exchangeBalancesDescriptor,
    			QueryExchangeBalancesRequestJvmConverter.convert(request),
    			option.callOptions, metadata,
    		),
    	)

    public override suspend fun aggregateVolume(request: QueryAggregateVolumeRequest):
        QueryAggregateVolumeResponse = aggregateVolume(request, Metadata())

    public suspend fun aggregateVolume(request: QueryAggregateVolumeRequest, metadata: Metadata):
        QueryAggregateVolumeResponse = QueryAggregateVolumeResponseJvmConverter.convert(
    		ClientCalls.unaryRpc(
    			option.channel, aggregateVolumeDescriptor,
    			QueryAggregateVolumeRequestJvmConverter.convert(request),
    			option.callOptions, metadata,
    		),
    	)

    public override suspend fun aggregateVolumes(request: QueryAggregateVolumesRequest):
        QueryAggregateVolumesResponse = aggregateVolumes(request, Metadata())

    public suspend fun aggregateVolumes(request: QueryAggregateVolumesRequest, metadata: Metadata):
        QueryAggregateVolumesResponse = QueryAggregateVolumesResponseJvmConverter.convert(
    		ClientCalls.unaryRpc(
    			option.channel, aggregateVolumesDescriptor,
    			QueryAggregateVolumesRequestJvmConverter.convert(request),
    			option.callOptions, metadata,
    		),
    	)

    public override suspend fun aggregateMarketVolume(request: QueryAggregateMarketVolumeRequest):
        QueryAggregateMarketVolumeResponse = aggregateMarketVolume(request, Metadata())

    public suspend fun aggregateMarketVolume(request: QueryAggregateMarketVolumeRequest,
        metadata: Metadata): QueryAggregateMarketVolumeResponse =
        QueryAggregateMarketVolumeResponseJvmConverter.convert(
    		ClientCalls.unaryRpc(
    			option.channel, aggregateMarketVolumeDescriptor,
    			QueryAggregateMarketVolumeRequestJvmConverter.convert(request),
    			option.callOptions, metadata,
    		),
    	)

    public override suspend fun aggregateMarketVolumes(request: QueryAggregateMarketVolumesRequest):
        QueryAggregateMarketVolumesResponse = aggregateMarketVolumes(request, Metadata())

    public suspend fun aggregateMarketVolumes(request: QueryAggregateMarketVolumesRequest,
        metadata: Metadata): QueryAggregateMarketVolumesResponse =
        QueryAggregateMarketVolumesResponseJvmConverter.convert(
    		ClientCalls.unaryRpc(
    			option.channel, aggregateMarketVolumesDescriptor,
    			QueryAggregateMarketVolumesRequestJvmConverter.convert(request),
    			option.callOptions, metadata,
    		),
    	)

    public override suspend fun denomDecimal(request: QueryDenomDecimalRequest):
        QueryDenomDecimalResponse = denomDecimal(request, Metadata())

    public suspend fun denomDecimal(request: QueryDenomDecimalRequest, metadata: Metadata):
        QueryDenomDecimalResponse = QueryDenomDecimalResponseJvmConverter.convert(
    		ClientCalls.unaryRpc(
    			option.channel, denomDecimalDescriptor,
    			QueryDenomDecimalRequestJvmConverter.convert(request),
    			option.callOptions, metadata,
    		),
    	)

    public override suspend fun denomDecimals(request: QueryDenomDecimalsRequest):
        QueryDenomDecimalsResponse = denomDecimals(request, Metadata())

    public suspend fun denomDecimals(request: QueryDenomDecimalsRequest, metadata: Metadata):
        QueryDenomDecimalsResponse = QueryDenomDecimalsResponseJvmConverter.convert(
    		ClientCalls.unaryRpc(
    			option.channel, denomDecimalsDescriptor,
    			QueryDenomDecimalsRequestJvmConverter.convert(request),
    			option.callOptions, metadata,
    		),
    	)

    public override suspend fun spotMarkets(request: QuerySpotMarketsRequest):
        QuerySpotMarketsResponse = spotMarkets(request, Metadata())

    public suspend fun spotMarkets(request: QuerySpotMarketsRequest, metadata: Metadata):
        QuerySpotMarketsResponse = QuerySpotMarketsResponseJvmConverter.convert(
    		ClientCalls.unaryRpc(
    			option.channel, spotMarketsDescriptor,
    			QuerySpotMarketsRequestJvmConverter.convert(request),
    			option.callOptions, metadata,
    		),
    	)

    public override suspend fun spotMarket(request: QuerySpotMarketRequest): QuerySpotMarketResponse
        = spotMarket(request, Metadata())

    public suspend fun spotMarket(request: QuerySpotMarketRequest, metadata: Metadata):
        QuerySpotMarketResponse = QuerySpotMarketResponseJvmConverter.convert(
    		ClientCalls.unaryRpc(
    			option.channel, spotMarketDescriptor,
    			QuerySpotMarketRequestJvmConverter.convert(request),
    			option.callOptions, metadata,
    		),
    	)

    public override suspend fun fullSpotMarkets(request: QueryFullSpotMarketsRequest):
        QueryFullSpotMarketsResponse = fullSpotMarkets(request, Metadata())

    public suspend fun fullSpotMarkets(request: QueryFullSpotMarketsRequest, metadata: Metadata):
        QueryFullSpotMarketsResponse = QueryFullSpotMarketsResponseJvmConverter.convert(
    		ClientCalls.unaryRpc(
    			option.channel, fullSpotMarketsDescriptor,
    			QueryFullSpotMarketsRequestJvmConverter.convert(request),
    			option.callOptions, metadata,
    		),
    	)

    public override suspend fun fullSpotMarket(request: QueryFullSpotMarketRequest):
        QueryFullSpotMarketResponse = fullSpotMarket(request, Metadata())

    public suspend fun fullSpotMarket(request: QueryFullSpotMarketRequest, metadata: Metadata):
        QueryFullSpotMarketResponse = QueryFullSpotMarketResponseJvmConverter.convert(
    		ClientCalls.unaryRpc(
    			option.channel, fullSpotMarketDescriptor,
    			QueryFullSpotMarketRequestJvmConverter.convert(request),
    			option.callOptions, metadata,
    		),
    	)

    public override suspend fun spotOrderbook(request: QuerySpotOrderbookRequest):
        QuerySpotOrderbookResponse = spotOrderbook(request, Metadata())

    public suspend fun spotOrderbook(request: QuerySpotOrderbookRequest, metadata: Metadata):
        QuerySpotOrderbookResponse = QuerySpotOrderbookResponseJvmConverter.convert(
    		ClientCalls.unaryRpc(
    			option.channel, spotOrderbookDescriptor,
    			QuerySpotOrderbookRequestJvmConverter.convert(request),
    			option.callOptions, metadata,
    		),
    	)

    public override suspend fun traderSpotOrders(request: QueryTraderSpotOrdersRequest):
        QueryTraderSpotOrdersResponse = traderSpotOrders(request, Metadata())

    public suspend fun traderSpotOrders(request: QueryTraderSpotOrdersRequest, metadata: Metadata):
        QueryTraderSpotOrdersResponse = QueryTraderSpotOrdersResponseJvmConverter.convert(
    		ClientCalls.unaryRpc(
    			option.channel, traderSpotOrdersDescriptor,
    			QueryTraderSpotOrdersRequestJvmConverter.convert(request),
    			option.callOptions, metadata,
    		),
    	)

    public override suspend
        fun accountAddressSpotOrders(request: QueryAccountAddressSpotOrdersRequest):
        QueryAccountAddressSpotOrdersResponse = accountAddressSpotOrders(request, Metadata())

    public suspend fun accountAddressSpotOrders(request: QueryAccountAddressSpotOrdersRequest,
        metadata: Metadata): QueryAccountAddressSpotOrdersResponse =
        QueryAccountAddressSpotOrdersResponseJvmConverter.convert(
    		ClientCalls.unaryRpc(
    			option.channel, accountAddressSpotOrdersDescriptor,
    			QueryAccountAddressSpotOrdersRequestJvmConverter.convert(request),
    			option.callOptions, metadata,
    		),
    	)

    public override suspend fun spotOrdersByHashes(request: QuerySpotOrdersByHashesRequest):
        QuerySpotOrdersByHashesResponse = spotOrdersByHashes(request, Metadata())

    public suspend fun spotOrdersByHashes(request: QuerySpotOrdersByHashesRequest,
        metadata: Metadata): QuerySpotOrdersByHashesResponse =
        QuerySpotOrdersByHashesResponseJvmConverter.convert(
    		ClientCalls.unaryRpc(
    			option.channel, spotOrdersByHashesDescriptor,
    			QuerySpotOrdersByHashesRequestJvmConverter.convert(request),
    			option.callOptions, metadata,
    		),
    	)

    public override suspend fun subaccountOrders(request: QuerySubaccountOrdersRequest):
        QuerySubaccountOrdersResponse = subaccountOrders(request, Metadata())

    public suspend fun subaccountOrders(request: QuerySubaccountOrdersRequest, metadata: Metadata):
        QuerySubaccountOrdersResponse = QuerySubaccountOrdersResponseJvmConverter.convert(
    		ClientCalls.unaryRpc(
    			option.channel, subaccountOrdersDescriptor,
    			QuerySubaccountOrdersRequestJvmConverter.convert(request),
    			option.callOptions, metadata,
    		),
    	)

    public override suspend fun traderSpotTransientOrders(request: QueryTraderSpotOrdersRequest):
        QueryTraderSpotOrdersResponse = traderSpotTransientOrders(request, Metadata())

    public suspend fun traderSpotTransientOrders(request: QueryTraderSpotOrdersRequest,
        metadata: Metadata): QueryTraderSpotOrdersResponse =
        QueryTraderSpotOrdersResponseJvmConverter.convert(
    		ClientCalls.unaryRpc(
    			option.channel, traderSpotTransientOrdersDescriptor,
    			QueryTraderSpotOrdersRequestJvmConverter.convert(request),
    			option.callOptions, metadata,
    		),
    	)

    public override suspend fun spotMidPriceAndTOB(request: QuerySpotMidPriceAndTOBRequest):
        QuerySpotMidPriceAndTOBResponse = spotMidPriceAndTOB(request, Metadata())

    public suspend fun spotMidPriceAndTOB(request: QuerySpotMidPriceAndTOBRequest,
        metadata: Metadata): QuerySpotMidPriceAndTOBResponse =
        QuerySpotMidPriceAndTOBResponseJvmConverter.convert(
    		ClientCalls.unaryRpc(
    			option.channel, spotMidPriceAndTOBDescriptor,
    			QuerySpotMidPriceAndTOBRequestJvmConverter.convert(request),
    			option.callOptions, metadata,
    		),
    	)

    public override suspend
        fun derivativeMidPriceAndTOB(request: QueryDerivativeMidPriceAndTOBRequest):
        QueryDerivativeMidPriceAndTOBResponse = derivativeMidPriceAndTOB(request, Metadata())

    public suspend fun derivativeMidPriceAndTOB(request: QueryDerivativeMidPriceAndTOBRequest,
        metadata: Metadata): QueryDerivativeMidPriceAndTOBResponse =
        QueryDerivativeMidPriceAndTOBResponseJvmConverter.convert(
    		ClientCalls.unaryRpc(
    			option.channel, derivativeMidPriceAndTOBDescriptor,
    			QueryDerivativeMidPriceAndTOBRequestJvmConverter.convert(request),
    			option.callOptions, metadata,
    		),
    	)

    public override suspend fun derivativeOrderbook(request: QueryDerivativeOrderbookRequest):
        QueryDerivativeOrderbookResponse = derivativeOrderbook(request, Metadata())

    public suspend fun derivativeOrderbook(request: QueryDerivativeOrderbookRequest,
        metadata: Metadata): QueryDerivativeOrderbookResponse =
        QueryDerivativeOrderbookResponseJvmConverter.convert(
    		ClientCalls.unaryRpc(
    			option.channel, derivativeOrderbookDescriptor,
    			QueryDerivativeOrderbookRequestJvmConverter.convert(request),
    			option.callOptions, metadata,
    		),
    	)

    public override suspend fun traderDerivativeOrders(request: QueryTraderDerivativeOrdersRequest):
        QueryTraderDerivativeOrdersResponse = traderDerivativeOrders(request, Metadata())

    public suspend fun traderDerivativeOrders(request: QueryTraderDerivativeOrdersRequest,
        metadata: Metadata): QueryTraderDerivativeOrdersResponse =
        QueryTraderDerivativeOrdersResponseJvmConverter.convert(
    		ClientCalls.unaryRpc(
    			option.channel, traderDerivativeOrdersDescriptor,
    			QueryTraderDerivativeOrdersRequestJvmConverter.convert(request),
    			option.callOptions, metadata,
    		),
    	)

    public override suspend
        fun accountAddressDerivativeOrders(request: QueryAccountAddressDerivativeOrdersRequest):
        QueryAccountAddressDerivativeOrdersResponse = accountAddressDerivativeOrders(request,
        Metadata())

    public suspend
        fun accountAddressDerivativeOrders(request: QueryAccountAddressDerivativeOrdersRequest,
        metadata: Metadata): QueryAccountAddressDerivativeOrdersResponse =
        QueryAccountAddressDerivativeOrdersResponseJvmConverter.convert(
    		ClientCalls.unaryRpc(
    			option.channel, accountAddressDerivativeOrdersDescriptor,
    			QueryAccountAddressDerivativeOrdersRequestJvmConverter.convert(request),
    			option.callOptions, metadata,
    		),
    	)

    public override suspend
        fun derivativeOrdersByHashes(request: QueryDerivativeOrdersByHashesRequest):
        QueryDerivativeOrdersByHashesResponse = derivativeOrdersByHashes(request, Metadata())

    public suspend fun derivativeOrdersByHashes(request: QueryDerivativeOrdersByHashesRequest,
        metadata: Metadata): QueryDerivativeOrdersByHashesResponse =
        QueryDerivativeOrdersByHashesResponseJvmConverter.convert(
    		ClientCalls.unaryRpc(
    			option.channel, derivativeOrdersByHashesDescriptor,
    			QueryDerivativeOrdersByHashesRequestJvmConverter.convert(request),
    			option.callOptions, metadata,
    		),
    	)

    public override suspend
        fun traderDerivativeTransientOrders(request: QueryTraderDerivativeOrdersRequest):
        QueryTraderDerivativeOrdersResponse = traderDerivativeTransientOrders(request, Metadata())

    public suspend fun traderDerivativeTransientOrders(request: QueryTraderDerivativeOrdersRequest,
        metadata: Metadata): QueryTraderDerivativeOrdersResponse =
        QueryTraderDerivativeOrdersResponseJvmConverter.convert(
    		ClientCalls.unaryRpc(
    			option.channel, traderDerivativeTransientOrdersDescriptor,
    			QueryTraderDerivativeOrdersRequestJvmConverter.convert(request),
    			option.callOptions, metadata,
    		),
    	)

    public override suspend fun derivativeMarkets(request: QueryDerivativeMarketsRequest):
        QueryDerivativeMarketsResponse = derivativeMarkets(request, Metadata())

    public suspend fun derivativeMarkets(request: QueryDerivativeMarketsRequest,
        metadata: Metadata): QueryDerivativeMarketsResponse =
        QueryDerivativeMarketsResponseJvmConverter.convert(
    		ClientCalls.unaryRpc(
    			option.channel, derivativeMarketsDescriptor,
    			QueryDerivativeMarketsRequestJvmConverter.convert(request),
    			option.callOptions, metadata,
    		),
    	)

    public override suspend fun derivativeMarket(request: QueryDerivativeMarketRequest):
        QueryDerivativeMarketResponse = derivativeMarket(request, Metadata())

    public suspend fun derivativeMarket(request: QueryDerivativeMarketRequest, metadata: Metadata):
        QueryDerivativeMarketResponse = QueryDerivativeMarketResponseJvmConverter.convert(
    		ClientCalls.unaryRpc(
    			option.channel, derivativeMarketDescriptor,
    			QueryDerivativeMarketRequestJvmConverter.convert(request),
    			option.callOptions, metadata,
    		),
    	)

    public override suspend
        fun derivativeMarketAddress(request: QueryDerivativeMarketAddressRequest):
        QueryDerivativeMarketAddressResponse = derivativeMarketAddress(request, Metadata())

    public suspend fun derivativeMarketAddress(request: QueryDerivativeMarketAddressRequest,
        metadata: Metadata): QueryDerivativeMarketAddressResponse =
        QueryDerivativeMarketAddressResponseJvmConverter.convert(
    		ClientCalls.unaryRpc(
    			option.channel, derivativeMarketAddressDescriptor,
    			QueryDerivativeMarketAddressRequestJvmConverter.convert(request),
    			option.callOptions, metadata,
    		),
    	)

    public override suspend fun subaccountTradeNonce(request: QuerySubaccountTradeNonceRequest):
        QuerySubaccountTradeNonceResponse = subaccountTradeNonce(request, Metadata())

    public suspend fun subaccountTradeNonce(request: QuerySubaccountTradeNonceRequest,
        metadata: Metadata): QuerySubaccountTradeNonceResponse =
        QuerySubaccountTradeNonceResponseJvmConverter.convert(
    		ClientCalls.unaryRpc(
    			option.channel, subaccountTradeNonceDescriptor,
    			QuerySubaccountTradeNonceRequestJvmConverter.convert(request),
    			option.callOptions, metadata,
    		),
    	)

    public override suspend fun exchangeModuleState(request: QueryModuleStateRequest):
        QueryModuleStateResponse = exchangeModuleState(request, Metadata())

    public suspend fun exchangeModuleState(request: QueryModuleStateRequest, metadata: Metadata):
        QueryModuleStateResponse = QueryModuleStateResponseJvmConverter.convert(
    		ClientCalls.unaryRpc(
    			option.channel, exchangeModuleStateDescriptor,
    			QueryModuleStateRequestJvmConverter.convert(request),
    			option.callOptions, metadata,
    		),
    	)

    public override suspend fun positions(request: QueryPositionsRequest): QueryPositionsResponse =
        positions(request, Metadata())

    public suspend fun positions(request: QueryPositionsRequest, metadata: Metadata):
        QueryPositionsResponse = QueryPositionsResponseJvmConverter.convert(
    		ClientCalls.unaryRpc(
    			option.channel, positionsDescriptor,
    			QueryPositionsRequestJvmConverter.convert(request),
    			option.callOptions, metadata,
    		),
    	)

    public override suspend fun subaccountPositions(request: QuerySubaccountPositionsRequest):
        QuerySubaccountPositionsResponse = subaccountPositions(request, Metadata())

    public suspend fun subaccountPositions(request: QuerySubaccountPositionsRequest,
        metadata: Metadata): QuerySubaccountPositionsResponse =
        QuerySubaccountPositionsResponseJvmConverter.convert(
    		ClientCalls.unaryRpc(
    			option.channel, subaccountPositionsDescriptor,
    			QuerySubaccountPositionsRequestJvmConverter.convert(request),
    			option.callOptions, metadata,
    		),
    	)

    public override suspend
        fun subaccountPositionInMarket(request: QuerySubaccountPositionInMarketRequest):
        QuerySubaccountPositionInMarketResponse = subaccountPositionInMarket(request, Metadata())

    public suspend fun subaccountPositionInMarket(request: QuerySubaccountPositionInMarketRequest,
        metadata: Metadata): QuerySubaccountPositionInMarketResponse =
        QuerySubaccountPositionInMarketResponseJvmConverter.convert(
    		ClientCalls.unaryRpc(
    			option.channel, subaccountPositionInMarketDescriptor,
    			QuerySubaccountPositionInMarketRequestJvmConverter.convert(request),
    			option.callOptions, metadata,
    		),
    	)

    public override suspend
        fun subaccountEffectivePositionInMarket(request: QuerySubaccountEffectivePositionInMarketRequest):
        QuerySubaccountEffectivePositionInMarketResponse =
        subaccountEffectivePositionInMarket(request, Metadata())

    public suspend
        fun subaccountEffectivePositionInMarket(request: QuerySubaccountEffectivePositionInMarketRequest,
        metadata: Metadata): QuerySubaccountEffectivePositionInMarketResponse =
        QuerySubaccountEffectivePositionInMarketResponseJvmConverter.convert(
    		ClientCalls.unaryRpc(
    			option.channel, subaccountEffectivePositionInMarketDescriptor,
    			QuerySubaccountEffectivePositionInMarketRequestJvmConverter.convert(request),
    			option.callOptions, metadata,
    		),
    	)

    public override suspend fun perpetualMarketInfo(request: QueryPerpetualMarketInfoRequest):
        QueryPerpetualMarketInfoResponse = perpetualMarketInfo(request, Metadata())

    public suspend fun perpetualMarketInfo(request: QueryPerpetualMarketInfoRequest,
        metadata: Metadata): QueryPerpetualMarketInfoResponse =
        QueryPerpetualMarketInfoResponseJvmConverter.convert(
    		ClientCalls.unaryRpc(
    			option.channel, perpetualMarketInfoDescriptor,
    			QueryPerpetualMarketInfoRequestJvmConverter.convert(request),
    			option.callOptions, metadata,
    		),
    	)

    public override suspend
        fun expiryFuturesMarketInfo(request: QueryExpiryFuturesMarketInfoRequest):
        QueryExpiryFuturesMarketInfoResponse = expiryFuturesMarketInfo(request, Metadata())

    public suspend fun expiryFuturesMarketInfo(request: QueryExpiryFuturesMarketInfoRequest,
        metadata: Metadata): QueryExpiryFuturesMarketInfoResponse =
        QueryExpiryFuturesMarketInfoResponseJvmConverter.convert(
    		ClientCalls.unaryRpc(
    			option.channel, expiryFuturesMarketInfoDescriptor,
    			QueryExpiryFuturesMarketInfoRequestJvmConverter.convert(request),
    			option.callOptions, metadata,
    		),
    	)

    public override suspend fun perpetualMarketFunding(request: QueryPerpetualMarketFundingRequest):
        QueryPerpetualMarketFundingResponse = perpetualMarketFunding(request, Metadata())

    public suspend fun perpetualMarketFunding(request: QueryPerpetualMarketFundingRequest,
        metadata: Metadata): QueryPerpetualMarketFundingResponse =
        QueryPerpetualMarketFundingResponseJvmConverter.convert(
    		ClientCalls.unaryRpc(
    			option.channel, perpetualMarketFundingDescriptor,
    			QueryPerpetualMarketFundingRequestJvmConverter.convert(request),
    			option.callOptions, metadata,
    		),
    	)

    public override suspend
        fun subaccountOrderMetadata(request: QuerySubaccountOrderMetadataRequest):
        QuerySubaccountOrderMetadataResponse = subaccountOrderMetadata(request, Metadata())

    public suspend fun subaccountOrderMetadata(request: QuerySubaccountOrderMetadataRequest,
        metadata: Metadata): QuerySubaccountOrderMetadataResponse =
        QuerySubaccountOrderMetadataResponseJvmConverter.convert(
    		ClientCalls.unaryRpc(
    			option.channel, subaccountOrderMetadataDescriptor,
    			QuerySubaccountOrderMetadataRequestJvmConverter.convert(request),
    			option.callOptions, metadata,
    		),
    	)

    public override suspend fun tradeRewardPoints(request: QueryTradeRewardPointsRequest):
        QueryTradeRewardPointsResponse = tradeRewardPoints(request, Metadata())

    public suspend fun tradeRewardPoints(request: QueryTradeRewardPointsRequest,
        metadata: Metadata): QueryTradeRewardPointsResponse =
        QueryTradeRewardPointsResponseJvmConverter.convert(
    		ClientCalls.unaryRpc(
    			option.channel, tradeRewardPointsDescriptor,
    			QueryTradeRewardPointsRequestJvmConverter.convert(request),
    			option.callOptions, metadata,
    		),
    	)

    public override suspend fun pendingTradeRewardPoints(request: QueryTradeRewardPointsRequest):
        QueryTradeRewardPointsResponse = pendingTradeRewardPoints(request, Metadata())

    public suspend fun pendingTradeRewardPoints(request: QueryTradeRewardPointsRequest,
        metadata: Metadata): QueryTradeRewardPointsResponse =
        QueryTradeRewardPointsResponseJvmConverter.convert(
    		ClientCalls.unaryRpc(
    			option.channel, pendingTradeRewardPointsDescriptor,
    			QueryTradeRewardPointsRequestJvmConverter.convert(request),
    			option.callOptions, metadata,
    		),
    	)

    public override suspend fun tradeRewardCampaign(request: QueryTradeRewardCampaignRequest):
        QueryTradeRewardCampaignResponse = tradeRewardCampaign(request, Metadata())

    public suspend fun tradeRewardCampaign(request: QueryTradeRewardCampaignRequest,
        metadata: Metadata): QueryTradeRewardCampaignResponse =
        QueryTradeRewardCampaignResponseJvmConverter.convert(
    		ClientCalls.unaryRpc(
    			option.channel, tradeRewardCampaignDescriptor,
    			QueryTradeRewardCampaignRequestJvmConverter.convert(request),
    			option.callOptions, metadata,
    		),
    	)

    public override suspend fun feeDiscountAccountInfo(request: QueryFeeDiscountAccountInfoRequest):
        QueryFeeDiscountAccountInfoResponse = feeDiscountAccountInfo(request, Metadata())

    public suspend fun feeDiscountAccountInfo(request: QueryFeeDiscountAccountInfoRequest,
        metadata: Metadata): QueryFeeDiscountAccountInfoResponse =
        QueryFeeDiscountAccountInfoResponseJvmConverter.convert(
    		ClientCalls.unaryRpc(
    			option.channel, feeDiscountAccountInfoDescriptor,
    			QueryFeeDiscountAccountInfoRequestJvmConverter.convert(request),
    			option.callOptions, metadata,
    		),
    	)

    public override suspend fun feeDiscountSchedule(request: QueryFeeDiscountScheduleRequest):
        QueryFeeDiscountScheduleResponse = feeDiscountSchedule(request, Metadata())

    public suspend fun feeDiscountSchedule(request: QueryFeeDiscountScheduleRequest,
        metadata: Metadata): QueryFeeDiscountScheduleResponse =
        QueryFeeDiscountScheduleResponseJvmConverter.convert(
    		ClientCalls.unaryRpc(
    			option.channel, feeDiscountScheduleDescriptor,
    			QueryFeeDiscountScheduleRequestJvmConverter.convert(request),
    			option.callOptions, metadata,
    		),
    	)

    public override suspend fun balanceMismatches(request: QueryBalanceMismatchesRequest):
        QueryBalanceMismatchesResponse = balanceMismatches(request, Metadata())

    public suspend fun balanceMismatches(request: QueryBalanceMismatchesRequest,
        metadata: Metadata): QueryBalanceMismatchesResponse =
        QueryBalanceMismatchesResponseJvmConverter.convert(
    		ClientCalls.unaryRpc(
    			option.channel, balanceMismatchesDescriptor,
    			QueryBalanceMismatchesRequestJvmConverter.convert(request),
    			option.callOptions, metadata,
    		),
    	)

    public override suspend
        fun balanceWithBalanceHolds(request: QueryBalanceWithBalanceHoldsRequest):
        QueryBalanceWithBalanceHoldsResponse = balanceWithBalanceHolds(request, Metadata())

    public suspend fun balanceWithBalanceHolds(request: QueryBalanceWithBalanceHoldsRequest,
        metadata: Metadata): QueryBalanceWithBalanceHoldsResponse =
        QueryBalanceWithBalanceHoldsResponseJvmConverter.convert(
    		ClientCalls.unaryRpc(
    			option.channel, balanceWithBalanceHoldsDescriptor,
    			QueryBalanceWithBalanceHoldsRequestJvmConverter.convert(request),
    			option.callOptions, metadata,
    		),
    	)

    public override suspend
        fun feeDiscountTierStatistics(request: QueryFeeDiscountTierStatisticsRequest):
        QueryFeeDiscountTierStatisticsResponse = feeDiscountTierStatistics(request, Metadata())

    public suspend fun feeDiscountTierStatistics(request: QueryFeeDiscountTierStatisticsRequest,
        metadata: Metadata): QueryFeeDiscountTierStatisticsResponse =
        QueryFeeDiscountTierStatisticsResponseJvmConverter.convert(
    		ClientCalls.unaryRpc(
    			option.channel, feeDiscountTierStatisticsDescriptor,
    			QueryFeeDiscountTierStatisticsRequestJvmConverter.convert(request),
    			option.callOptions, metadata,
    		),
    	)

    public override suspend fun mitoVaultInfos(request: MitoVaultInfosRequest):
        MitoVaultInfosResponse = mitoVaultInfos(request, Metadata())

    public suspend fun mitoVaultInfos(request: MitoVaultInfosRequest, metadata: Metadata):
        MitoVaultInfosResponse = MitoVaultInfosResponseJvmConverter.convert(
    		ClientCalls.unaryRpc(
    			option.channel, mitoVaultInfosDescriptor,
    			MitoVaultInfosRequestJvmConverter.convert(request),
    			option.callOptions, metadata,
    		),
    	)

    public override suspend fun queryMarketIDFromVault(request: QueryMarketIDFromVaultRequest):
        QueryMarketIDFromVaultResponse = queryMarketIDFromVault(request, Metadata())

    public suspend fun queryMarketIDFromVault(request: QueryMarketIDFromVaultRequest,
        metadata: Metadata): QueryMarketIDFromVaultResponse =
        QueryMarketIDFromVaultResponseJvmConverter.convert(
    		ClientCalls.unaryRpc(
    			option.channel, queryMarketIDFromVaultDescriptor,
    			QueryMarketIDFromVaultRequestJvmConverter.convert(request),
    			option.callOptions, metadata,
    		),
    	)

    public override suspend fun historicalTradeRecords(request: QueryHistoricalTradeRecordsRequest):
        QueryHistoricalTradeRecordsResponse = historicalTradeRecords(request, Metadata())

    public suspend fun historicalTradeRecords(request: QueryHistoricalTradeRecordsRequest,
        metadata: Metadata): QueryHistoricalTradeRecordsResponse =
        QueryHistoricalTradeRecordsResponseJvmConverter.convert(
    		ClientCalls.unaryRpc(
    			option.channel, historicalTradeRecordsDescriptor,
    			QueryHistoricalTradeRecordsRequestJvmConverter.convert(request),
    			option.callOptions, metadata,
    		),
    	)

    public override suspend fun isOptedOutOfRewards(request: QueryIsOptedOutOfRewardsRequest):
        QueryIsOptedOutOfRewardsResponse = isOptedOutOfRewards(request, Metadata())

    public suspend fun isOptedOutOfRewards(request: QueryIsOptedOutOfRewardsRequest,
        metadata: Metadata): QueryIsOptedOutOfRewardsResponse =
        QueryIsOptedOutOfRewardsResponseJvmConverter.convert(
    		ClientCalls.unaryRpc(
    			option.channel, isOptedOutOfRewardsDescriptor,
    			QueryIsOptedOutOfRewardsRequestJvmConverter.convert(request),
    			option.callOptions, metadata,
    		),
    	)

    public override suspend
        fun optedOutOfRewardsAccounts(request: QueryOptedOutOfRewardsAccountsRequest):
        QueryOptedOutOfRewardsAccountsResponse = optedOutOfRewardsAccounts(request, Metadata())

    public suspend fun optedOutOfRewardsAccounts(request: QueryOptedOutOfRewardsAccountsRequest,
        metadata: Metadata): QueryOptedOutOfRewardsAccountsResponse =
        QueryOptedOutOfRewardsAccountsResponseJvmConverter.convert(
    		ClientCalls.unaryRpc(
    			option.channel, optedOutOfRewardsAccountsDescriptor,
    			QueryOptedOutOfRewardsAccountsRequestJvmConverter.convert(request),
    			option.callOptions, metadata,
    		),
    	)

    public override suspend fun marketVolatility(request: QueryMarketVolatilityRequest):
        QueryMarketVolatilityResponse = marketVolatility(request, Metadata())

    public suspend fun marketVolatility(request: QueryMarketVolatilityRequest, metadata: Metadata):
        QueryMarketVolatilityResponse = QueryMarketVolatilityResponseJvmConverter.convert(
    		ClientCalls.unaryRpc(
    			option.channel, marketVolatilityDescriptor,
    			QueryMarketVolatilityRequestJvmConverter.convert(request),
    			option.callOptions, metadata,
    		),
    	)

    public override suspend fun binaryOptionsMarkets(request: QueryBinaryMarketsRequest):
        QueryBinaryMarketsResponse = binaryOptionsMarkets(request, Metadata())

    public suspend fun binaryOptionsMarkets(request: QueryBinaryMarketsRequest, metadata: Metadata):
        QueryBinaryMarketsResponse = QueryBinaryMarketsResponseJvmConverter.convert(
    		ClientCalls.unaryRpc(
    			option.channel, binaryOptionsMarketsDescriptor,
    			QueryBinaryMarketsRequestJvmConverter.convert(request),
    			option.callOptions, metadata,
    		),
    	)

    public override suspend
        fun traderDerivativeConditionalOrders(request: QueryTraderDerivativeConditionalOrdersRequest):
        QueryTraderDerivativeConditionalOrdersResponse = traderDerivativeConditionalOrders(request,
        Metadata())

    public suspend
        fun traderDerivativeConditionalOrders(request: QueryTraderDerivativeConditionalOrdersRequest,
        metadata: Metadata): QueryTraderDerivativeConditionalOrdersResponse =
        QueryTraderDerivativeConditionalOrdersResponseJvmConverter.convert(
    		ClientCalls.unaryRpc(
    			option.channel, traderDerivativeConditionalOrdersDescriptor,
    			QueryTraderDerivativeConditionalOrdersRequestJvmConverter.convert(request),
    			option.callOptions, metadata,
    		),
    	)

    public override suspend
        fun marketAtomicExecutionFeeMultiplier(request: QueryMarketAtomicExecutionFeeMultiplierRequest):
        QueryMarketAtomicExecutionFeeMultiplierResponse =
        marketAtomicExecutionFeeMultiplier(request, Metadata())

    public suspend
        fun marketAtomicExecutionFeeMultiplier(request: QueryMarketAtomicExecutionFeeMultiplierRequest,
        metadata: Metadata): QueryMarketAtomicExecutionFeeMultiplierResponse =
        QueryMarketAtomicExecutionFeeMultiplierResponseJvmConverter.convert(
    		ClientCalls.unaryRpc(
    			option.channel, marketAtomicExecutionFeeMultiplierDescriptor,
    			QueryMarketAtomicExecutionFeeMultiplierRequestJvmConverter.convert(request),
    			option.callOptions, metadata,
    		),
    	)
  }
}
