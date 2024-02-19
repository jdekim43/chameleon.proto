// Transform from injective/exchange/v1beta1/query.proto
@file:GeneratorVersion(version = "0.3.1")

package injective.exchange.v1beta1

import kotlin.coroutines.CoroutineContext
import kotlin.coroutines.EmptyCoroutineContext
import kr.jadekim.protobuf.`annotation`.GeneratorVersion
import kr.jadekim.protobuf.grpc.ClientOption
import kr.jadekim.protobuf.grpc.GrpcService

public expect object Query : GrpcService<Query.Interface, Query.Server, Query.Client> {
  public interface Interface {
    public suspend fun queryExchangeParams(request: QueryExchangeParamsRequest):
        QueryExchangeParamsResponse

    public suspend fun subaccountDeposits(request: QuerySubaccountDepositsRequest):
        QuerySubaccountDepositsResponse

    public suspend fun subaccountDeposit(request: QuerySubaccountDepositRequest):
        QuerySubaccountDepositResponse

    public suspend fun exchangeBalances(request: QueryExchangeBalancesRequest):
        QueryExchangeBalancesResponse

    public suspend fun aggregateVolume(request: QueryAggregateVolumeRequest):
        QueryAggregateVolumeResponse

    public suspend fun aggregateVolumes(request: QueryAggregateVolumesRequest):
        QueryAggregateVolumesResponse

    public suspend fun aggregateMarketVolume(request: QueryAggregateMarketVolumeRequest):
        QueryAggregateMarketVolumeResponse

    public suspend fun aggregateMarketVolumes(request: QueryAggregateMarketVolumesRequest):
        QueryAggregateMarketVolumesResponse

    public suspend fun denomDecimal(request: QueryDenomDecimalRequest): QueryDenomDecimalResponse

    public suspend fun denomDecimals(request: QueryDenomDecimalsRequest): QueryDenomDecimalsResponse

    public suspend fun spotMarkets(request: QuerySpotMarketsRequest): QuerySpotMarketsResponse

    public suspend fun spotMarket(request: QuerySpotMarketRequest): QuerySpotMarketResponse

    public suspend fun fullSpotMarkets(request: QueryFullSpotMarketsRequest):
        QueryFullSpotMarketsResponse

    public suspend fun fullSpotMarket(request: QueryFullSpotMarketRequest):
        QueryFullSpotMarketResponse

    public suspend fun spotOrderbook(request: QuerySpotOrderbookRequest): QuerySpotOrderbookResponse

    public suspend fun traderSpotOrders(request: QueryTraderSpotOrdersRequest):
        QueryTraderSpotOrdersResponse

    public suspend fun accountAddressSpotOrders(request: QueryAccountAddressSpotOrdersRequest):
        QueryAccountAddressSpotOrdersResponse

    public suspend fun spotOrdersByHashes(request: QuerySpotOrdersByHashesRequest):
        QuerySpotOrdersByHashesResponse

    public suspend fun subaccountOrders(request: QuerySubaccountOrdersRequest):
        QuerySubaccountOrdersResponse

    public suspend fun traderSpotTransientOrders(request: QueryTraderSpotOrdersRequest):
        QueryTraderSpotOrdersResponse

    public suspend fun spotMidPriceAndTOB(request: QuerySpotMidPriceAndTOBRequest):
        QuerySpotMidPriceAndTOBResponse

    public suspend fun derivativeMidPriceAndTOB(request: QueryDerivativeMidPriceAndTOBRequest):
        QueryDerivativeMidPriceAndTOBResponse

    public suspend fun derivativeOrderbook(request: QueryDerivativeOrderbookRequest):
        QueryDerivativeOrderbookResponse

    public suspend fun traderDerivativeOrders(request: QueryTraderDerivativeOrdersRequest):
        QueryTraderDerivativeOrdersResponse

    public suspend
        fun accountAddressDerivativeOrders(request: QueryAccountAddressDerivativeOrdersRequest):
        QueryAccountAddressDerivativeOrdersResponse

    public suspend fun derivativeOrdersByHashes(request: QueryDerivativeOrdersByHashesRequest):
        QueryDerivativeOrdersByHashesResponse

    public suspend fun traderDerivativeTransientOrders(request: QueryTraderDerivativeOrdersRequest):
        QueryTraderDerivativeOrdersResponse

    public suspend fun derivativeMarkets(request: QueryDerivativeMarketsRequest):
        QueryDerivativeMarketsResponse

    public suspend fun derivativeMarket(request: QueryDerivativeMarketRequest):
        QueryDerivativeMarketResponse

    public suspend fun derivativeMarketAddress(request: QueryDerivativeMarketAddressRequest):
        QueryDerivativeMarketAddressResponse

    public suspend fun subaccountTradeNonce(request: QuerySubaccountTradeNonceRequest):
        QuerySubaccountTradeNonceResponse

    public suspend fun exchangeModuleState(request: QueryModuleStateRequest):
        QueryModuleStateResponse

    public suspend fun positions(request: QueryPositionsRequest): QueryPositionsResponse

    public suspend fun subaccountPositions(request: QuerySubaccountPositionsRequest):
        QuerySubaccountPositionsResponse

    public suspend fun subaccountPositionInMarket(request: QuerySubaccountPositionInMarketRequest):
        QuerySubaccountPositionInMarketResponse

    public suspend
        fun subaccountEffectivePositionInMarket(request: QuerySubaccountEffectivePositionInMarketRequest):
        QuerySubaccountEffectivePositionInMarketResponse

    public suspend fun perpetualMarketInfo(request: QueryPerpetualMarketInfoRequest):
        QueryPerpetualMarketInfoResponse

    public suspend fun expiryFuturesMarketInfo(request: QueryExpiryFuturesMarketInfoRequest):
        QueryExpiryFuturesMarketInfoResponse

    public suspend fun perpetualMarketFunding(request: QueryPerpetualMarketFundingRequest):
        QueryPerpetualMarketFundingResponse

    public suspend fun subaccountOrderMetadata(request: QuerySubaccountOrderMetadataRequest):
        QuerySubaccountOrderMetadataResponse

    public suspend fun tradeRewardPoints(request: QueryTradeRewardPointsRequest):
        QueryTradeRewardPointsResponse

    public suspend fun pendingTradeRewardPoints(request: QueryTradeRewardPointsRequest):
        QueryTradeRewardPointsResponse

    public suspend fun tradeRewardCampaign(request: QueryTradeRewardCampaignRequest):
        QueryTradeRewardCampaignResponse

    public suspend fun feeDiscountAccountInfo(request: QueryFeeDiscountAccountInfoRequest):
        QueryFeeDiscountAccountInfoResponse

    public suspend fun feeDiscountSchedule(request: QueryFeeDiscountScheduleRequest):
        QueryFeeDiscountScheduleResponse

    public suspend fun balanceMismatches(request: QueryBalanceMismatchesRequest):
        QueryBalanceMismatchesResponse

    public suspend fun balanceWithBalanceHolds(request: QueryBalanceWithBalanceHoldsRequest):
        QueryBalanceWithBalanceHoldsResponse

    public suspend fun feeDiscountTierStatistics(request: QueryFeeDiscountTierStatisticsRequest):
        QueryFeeDiscountTierStatisticsResponse

    public suspend fun mitoVaultInfos(request: MitoVaultInfosRequest): MitoVaultInfosResponse

    public suspend fun queryMarketIDFromVault(request: QueryMarketIDFromVaultRequest):
        QueryMarketIDFromVaultResponse

    public suspend fun historicalTradeRecords(request: QueryHistoricalTradeRecordsRequest):
        QueryHistoricalTradeRecordsResponse

    public suspend fun isOptedOutOfRewards(request: QueryIsOptedOutOfRewardsRequest):
        QueryIsOptedOutOfRewardsResponse

    public suspend fun optedOutOfRewardsAccounts(request: QueryOptedOutOfRewardsAccountsRequest):
        QueryOptedOutOfRewardsAccountsResponse

    public suspend fun marketVolatility(request: QueryMarketVolatilityRequest):
        QueryMarketVolatilityResponse

    public suspend fun binaryOptionsMarkets(request: QueryBinaryMarketsRequest):
        QueryBinaryMarketsResponse

    public suspend
        fun traderDerivativeConditionalOrders(request: QueryTraderDerivativeConditionalOrdersRequest):
        QueryTraderDerivativeConditionalOrdersResponse

    public suspend
        fun marketAtomicExecutionFeeMultiplier(request: QueryMarketAtomicExecutionFeeMultiplierRequest):
        QueryMarketAtomicExecutionFeeMultiplierResponse
  }

  public abstract class Server(
    coroutineContext: CoroutineContext = EmptyCoroutineContext,
  ) : Interface

  public open class Client(
    option: ClientOption,
  ) : Interface
}
