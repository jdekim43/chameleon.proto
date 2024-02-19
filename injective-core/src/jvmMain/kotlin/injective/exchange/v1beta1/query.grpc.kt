// Transform from injective/exchange/v1beta1/query.proto
@file:GeneratorVersion(version = "0.3.1")

package injective.exchange.v1beta1

import kotlin.coroutines.CoroutineContext
import kr.jadekim.protobuf.`annotation`.GeneratorVersion
import kr.jadekim.protobuf.grpc.ClientOption
import kr.jadekim.protobuf.grpc.GrpcService

public actual object Query : GrpcService<Query.Interface, Query.Server, Query.Client> {
  public override fun createClient(option: ClientOption): Client = Client(option)

  public actual interface Interface {
    public actual suspend fun queryExchangeParams(request: QueryExchangeParamsRequest):
        QueryExchangeParamsResponse

    public actual suspend fun subaccountDeposits(request: QuerySubaccountDepositsRequest):
        QuerySubaccountDepositsResponse

    public actual suspend fun subaccountDeposit(request: QuerySubaccountDepositRequest):
        QuerySubaccountDepositResponse

    public actual suspend fun exchangeBalances(request: QueryExchangeBalancesRequest):
        QueryExchangeBalancesResponse

    public actual suspend fun aggregateVolume(request: QueryAggregateVolumeRequest):
        QueryAggregateVolumeResponse

    public actual suspend fun aggregateVolumes(request: QueryAggregateVolumesRequest):
        QueryAggregateVolumesResponse

    public actual suspend fun aggregateMarketVolume(request: QueryAggregateMarketVolumeRequest):
        QueryAggregateMarketVolumeResponse

    public actual suspend fun aggregateMarketVolumes(request: QueryAggregateMarketVolumesRequest):
        QueryAggregateMarketVolumesResponse

    public actual suspend fun denomDecimal(request: QueryDenomDecimalRequest):
        QueryDenomDecimalResponse

    public actual suspend fun denomDecimals(request: QueryDenomDecimalsRequest):
        QueryDenomDecimalsResponse

    public actual suspend fun spotMarkets(request: QuerySpotMarketsRequest):
        QuerySpotMarketsResponse

    public actual suspend fun spotMarket(request: QuerySpotMarketRequest): QuerySpotMarketResponse

    public actual suspend fun fullSpotMarkets(request: QueryFullSpotMarketsRequest):
        QueryFullSpotMarketsResponse

    public actual suspend fun fullSpotMarket(request: QueryFullSpotMarketRequest):
        QueryFullSpotMarketResponse

    public actual suspend fun spotOrderbook(request: QuerySpotOrderbookRequest):
        QuerySpotOrderbookResponse

    public actual suspend fun traderSpotOrders(request: QueryTraderSpotOrdersRequest):
        QueryTraderSpotOrdersResponse

    public actual suspend
        fun accountAddressSpotOrders(request: QueryAccountAddressSpotOrdersRequest):
        QueryAccountAddressSpotOrdersResponse

    public actual suspend fun spotOrdersByHashes(request: QuerySpotOrdersByHashesRequest):
        QuerySpotOrdersByHashesResponse

    public actual suspend fun subaccountOrders(request: QuerySubaccountOrdersRequest):
        QuerySubaccountOrdersResponse

    public actual suspend fun traderSpotTransientOrders(request: QueryTraderSpotOrdersRequest):
        QueryTraderSpotOrdersResponse

    public actual suspend fun spotMidPriceAndTOB(request: QuerySpotMidPriceAndTOBRequest):
        QuerySpotMidPriceAndTOBResponse

    public actual suspend
        fun derivativeMidPriceAndTOB(request: QueryDerivativeMidPriceAndTOBRequest):
        QueryDerivativeMidPriceAndTOBResponse

    public actual suspend fun derivativeOrderbook(request: QueryDerivativeOrderbookRequest):
        QueryDerivativeOrderbookResponse

    public actual suspend fun traderDerivativeOrders(request: QueryTraderDerivativeOrdersRequest):
        QueryTraderDerivativeOrdersResponse

    public actual suspend
        fun accountAddressDerivativeOrders(request: QueryAccountAddressDerivativeOrdersRequest):
        QueryAccountAddressDerivativeOrdersResponse

    public actual suspend
        fun derivativeOrdersByHashes(request: QueryDerivativeOrdersByHashesRequest):
        QueryDerivativeOrdersByHashesResponse

    public actual suspend
        fun traderDerivativeTransientOrders(request: QueryTraderDerivativeOrdersRequest):
        QueryTraderDerivativeOrdersResponse

    public actual suspend fun derivativeMarkets(request: QueryDerivativeMarketsRequest):
        QueryDerivativeMarketsResponse

    public actual suspend fun derivativeMarket(request: QueryDerivativeMarketRequest):
        QueryDerivativeMarketResponse

    public actual suspend fun derivativeMarketAddress(request: QueryDerivativeMarketAddressRequest):
        QueryDerivativeMarketAddressResponse

    public actual suspend fun subaccountTradeNonce(request: QuerySubaccountTradeNonceRequest):
        QuerySubaccountTradeNonceResponse

    public actual suspend fun exchangeModuleState(request: QueryModuleStateRequest):
        QueryModuleStateResponse

    public actual suspend fun positions(request: QueryPositionsRequest): QueryPositionsResponse

    public actual suspend fun subaccountPositions(request: QuerySubaccountPositionsRequest):
        QuerySubaccountPositionsResponse

    public actual suspend
        fun subaccountPositionInMarket(request: QuerySubaccountPositionInMarketRequest):
        QuerySubaccountPositionInMarketResponse

    public actual suspend
        fun subaccountEffectivePositionInMarket(request: QuerySubaccountEffectivePositionInMarketRequest):
        QuerySubaccountEffectivePositionInMarketResponse

    public actual suspend fun perpetualMarketInfo(request: QueryPerpetualMarketInfoRequest):
        QueryPerpetualMarketInfoResponse

    public actual suspend fun expiryFuturesMarketInfo(request: QueryExpiryFuturesMarketInfoRequest):
        QueryExpiryFuturesMarketInfoResponse

    public actual suspend fun perpetualMarketFunding(request: QueryPerpetualMarketFundingRequest):
        QueryPerpetualMarketFundingResponse

    public actual suspend fun subaccountOrderMetadata(request: QuerySubaccountOrderMetadataRequest):
        QuerySubaccountOrderMetadataResponse

    public actual suspend fun tradeRewardPoints(request: QueryTradeRewardPointsRequest):
        QueryTradeRewardPointsResponse

    public actual suspend fun pendingTradeRewardPoints(request: QueryTradeRewardPointsRequest):
        QueryTradeRewardPointsResponse

    public actual suspend fun tradeRewardCampaign(request: QueryTradeRewardCampaignRequest):
        QueryTradeRewardCampaignResponse

    public actual suspend fun feeDiscountAccountInfo(request: QueryFeeDiscountAccountInfoRequest):
        QueryFeeDiscountAccountInfoResponse

    public actual suspend fun feeDiscountSchedule(request: QueryFeeDiscountScheduleRequest):
        QueryFeeDiscountScheduleResponse

    public actual suspend fun balanceMismatches(request: QueryBalanceMismatchesRequest):
        QueryBalanceMismatchesResponse

    public actual suspend fun balanceWithBalanceHolds(request: QueryBalanceWithBalanceHoldsRequest):
        QueryBalanceWithBalanceHoldsResponse

    public actual suspend
        fun feeDiscountTierStatistics(request: QueryFeeDiscountTierStatisticsRequest):
        QueryFeeDiscountTierStatisticsResponse

    public actual suspend fun mitoVaultInfos(request: MitoVaultInfosRequest): MitoVaultInfosResponse

    public actual suspend fun queryMarketIDFromVault(request: QueryMarketIDFromVaultRequest):
        QueryMarketIDFromVaultResponse

    public actual suspend fun historicalTradeRecords(request: QueryHistoricalTradeRecordsRequest):
        QueryHistoricalTradeRecordsResponse

    public actual suspend fun isOptedOutOfRewards(request: QueryIsOptedOutOfRewardsRequest):
        QueryIsOptedOutOfRewardsResponse

    public actual suspend
        fun optedOutOfRewardsAccounts(request: QueryOptedOutOfRewardsAccountsRequest):
        QueryOptedOutOfRewardsAccountsResponse

    public actual suspend fun marketVolatility(request: QueryMarketVolatilityRequest):
        QueryMarketVolatilityResponse

    public actual suspend fun binaryOptionsMarkets(request: QueryBinaryMarketsRequest):
        QueryBinaryMarketsResponse

    public actual suspend
        fun traderDerivativeConditionalOrders(request: QueryTraderDerivativeConditionalOrdersRequest):
        QueryTraderDerivativeConditionalOrdersResponse

    public actual suspend
        fun marketAtomicExecutionFeeMultiplier(request: QueryMarketAtomicExecutionFeeMultiplierRequest):
        QueryMarketAtomicExecutionFeeMultiplierResponse
  }

  public actual abstract class Server actual constructor(
    coroutineContext: CoroutineContext,
  ) : QueryJvm.Server(coroutineContext), Interface

  public actual open class Client actual constructor(
    option: ClientOption,
  ) : QueryJvm.Client(option), Interface
}
