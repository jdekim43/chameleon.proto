// Transform from injective/exchange/v1beta1/query.proto
@file:GeneratorVersion(version = "0.3.1")

package injective.exchange.v1beta1

import kr.jadekim.protobuf.`annotation`.GeneratorVersion
import kr.jadekim.protobuf.converter.ProtobufConverter

public actual object SubaccountConverter : ProtobufConverter<Subaccount> by SubaccountJvmConverter

public actual object QuerySubaccountOrdersRequestConverter :
    ProtobufConverter<QuerySubaccountOrdersRequest> by QuerySubaccountOrdersRequestJvmConverter

public actual object QuerySubaccountOrdersResponseConverter :
    ProtobufConverter<QuerySubaccountOrdersResponse> by QuerySubaccountOrdersResponseJvmConverter

public actual object SubaccountOrderbookMetadataWithMarketConverter :
    ProtobufConverter<SubaccountOrderbookMetadataWithMarket> by
    SubaccountOrderbookMetadataWithMarketJvmConverter

public actual object QueryExchangeParamsRequestConverter :
    ProtobufConverter<QueryExchangeParamsRequest> by QueryExchangeParamsRequestJvmConverter

public actual object QueryExchangeParamsResponseConverter :
    ProtobufConverter<QueryExchangeParamsResponse> by QueryExchangeParamsResponseJvmConverter

public actual object QuerySubaccountDepositsRequestConverter :
    ProtobufConverter<QuerySubaccountDepositsRequest> by QuerySubaccountDepositsRequestJvmConverter

public actual object QuerySubaccountDepositsResponseConverter :
    ProtobufConverter<QuerySubaccountDepositsResponse> by
    QuerySubaccountDepositsResponseJvmConverter

public actual object QueryExchangeBalancesRequestConverter :
    ProtobufConverter<QueryExchangeBalancesRequest> by QueryExchangeBalancesRequestJvmConverter

public actual object QueryExchangeBalancesResponseConverter :
    ProtobufConverter<QueryExchangeBalancesResponse> by QueryExchangeBalancesResponseJvmConverter

public actual object QueryAggregateVolumeRequestConverter :
    ProtobufConverter<QueryAggregateVolumeRequest> by QueryAggregateVolumeRequestJvmConverter

public actual object QueryAggregateVolumeResponseConverter :
    ProtobufConverter<QueryAggregateVolumeResponse> by QueryAggregateVolumeResponseJvmConverter

public actual object QueryAggregateVolumesRequestConverter :
    ProtobufConverter<QueryAggregateVolumesRequest> by QueryAggregateVolumesRequestJvmConverter

public actual object QueryAggregateVolumesResponseConverter :
    ProtobufConverter<QueryAggregateVolumesResponse> by QueryAggregateVolumesResponseJvmConverter

public actual object QueryAggregateMarketVolumeRequestConverter :
    ProtobufConverter<QueryAggregateMarketVolumeRequest> by
    QueryAggregateMarketVolumeRequestJvmConverter

public actual object QueryAggregateMarketVolumeResponseConverter :
    ProtobufConverter<QueryAggregateMarketVolumeResponse> by
    QueryAggregateMarketVolumeResponseJvmConverter

public actual object QueryDenomDecimalRequestConverter : ProtobufConverter<QueryDenomDecimalRequest>
    by QueryDenomDecimalRequestJvmConverter

public actual object QueryDenomDecimalResponseConverter :
    ProtobufConverter<QueryDenomDecimalResponse> by QueryDenomDecimalResponseJvmConverter

public actual object QueryDenomDecimalsRequestConverter :
    ProtobufConverter<QueryDenomDecimalsRequest> by QueryDenomDecimalsRequestJvmConverter

public actual object QueryDenomDecimalsResponseConverter :
    ProtobufConverter<QueryDenomDecimalsResponse> by QueryDenomDecimalsResponseJvmConverter

public actual object QueryAggregateMarketVolumesRequestConverter :
    ProtobufConverter<QueryAggregateMarketVolumesRequest> by
    QueryAggregateMarketVolumesRequestJvmConverter

public actual object QueryAggregateMarketVolumesResponseConverter :
    ProtobufConverter<QueryAggregateMarketVolumesResponse> by
    QueryAggregateMarketVolumesResponseJvmConverter

public actual object QuerySubaccountDepositRequestConverter :
    ProtobufConverter<QuerySubaccountDepositRequest> by QuerySubaccountDepositRequestJvmConverter

public actual object QuerySubaccountDepositResponseConverter :
    ProtobufConverter<QuerySubaccountDepositResponse> by QuerySubaccountDepositResponseJvmConverter

public actual object QuerySpotMarketsRequestConverter : ProtobufConverter<QuerySpotMarketsRequest>
    by QuerySpotMarketsRequestJvmConverter

public actual object QuerySpotMarketsResponseConverter : ProtobufConverter<QuerySpotMarketsResponse>
    by QuerySpotMarketsResponseJvmConverter

public actual object QuerySpotMarketRequestConverter : ProtobufConverter<QuerySpotMarketRequest> by
    QuerySpotMarketRequestJvmConverter

public actual object QuerySpotMarketResponseConverter : ProtobufConverter<QuerySpotMarketResponse>
    by QuerySpotMarketResponseJvmConverter

public actual object QuerySpotOrderbookRequestConverter :
    ProtobufConverter<QuerySpotOrderbookRequest> by QuerySpotOrderbookRequestJvmConverter

public actual object QuerySpotOrderbookResponseConverter :
    ProtobufConverter<QuerySpotOrderbookResponse> by QuerySpotOrderbookResponseJvmConverter

public actual object FullSpotMarketConverter : ProtobufConverter<FullSpotMarket> by
    FullSpotMarketJvmConverter

public actual object QueryFullSpotMarketsRequestConverter :
    ProtobufConverter<QueryFullSpotMarketsRequest> by QueryFullSpotMarketsRequestJvmConverter

public actual object QueryFullSpotMarketsResponseConverter :
    ProtobufConverter<QueryFullSpotMarketsResponse> by QueryFullSpotMarketsResponseJvmConverter

public actual object QueryFullSpotMarketRequestConverter :
    ProtobufConverter<QueryFullSpotMarketRequest> by QueryFullSpotMarketRequestJvmConverter

public actual object QueryFullSpotMarketResponseConverter :
    ProtobufConverter<QueryFullSpotMarketResponse> by QueryFullSpotMarketResponseJvmConverter

public actual object QuerySpotOrdersByHashesRequestConverter :
    ProtobufConverter<QuerySpotOrdersByHashesRequest> by QuerySpotOrdersByHashesRequestJvmConverter

public actual object QuerySpotOrdersByHashesResponseConverter :
    ProtobufConverter<QuerySpotOrdersByHashesResponse> by
    QuerySpotOrdersByHashesResponseJvmConverter

public actual object QueryTraderSpotOrdersRequestConverter :
    ProtobufConverter<QueryTraderSpotOrdersRequest> by QueryTraderSpotOrdersRequestJvmConverter

public actual object QueryAccountAddressSpotOrdersRequestConverter :
    ProtobufConverter<QueryAccountAddressSpotOrdersRequest> by
    QueryAccountAddressSpotOrdersRequestJvmConverter

public actual object TrimmedSpotLimitOrderConverter : ProtobufConverter<TrimmedSpotLimitOrder> by
    TrimmedSpotLimitOrderJvmConverter

public actual object QueryTraderSpotOrdersResponseConverter :
    ProtobufConverter<QueryTraderSpotOrdersResponse> by QueryTraderSpotOrdersResponseJvmConverter

public actual object QueryAccountAddressSpotOrdersResponseConverter :
    ProtobufConverter<QueryAccountAddressSpotOrdersResponse> by
    QueryAccountAddressSpotOrdersResponseJvmConverter

public actual object QuerySpotMidPriceAndTOBRequestConverter :
    ProtobufConverter<QuerySpotMidPriceAndTOBRequest> by QuerySpotMidPriceAndTOBRequestJvmConverter

public actual object QuerySpotMidPriceAndTOBResponseConverter :
    ProtobufConverter<QuerySpotMidPriceAndTOBResponse> by
    QuerySpotMidPriceAndTOBResponseJvmConverter

public actual object QueryDerivativeMidPriceAndTOBRequestConverter :
    ProtobufConverter<QueryDerivativeMidPriceAndTOBRequest> by
    QueryDerivativeMidPriceAndTOBRequestJvmConverter

public actual object QueryDerivativeMidPriceAndTOBResponseConverter :
    ProtobufConverter<QueryDerivativeMidPriceAndTOBResponse> by
    QueryDerivativeMidPriceAndTOBResponseJvmConverter

public actual object QueryDerivativeOrderbookRequestConverter :
    ProtobufConverter<QueryDerivativeOrderbookRequest> by
    QueryDerivativeOrderbookRequestJvmConverter

public actual object QueryDerivativeOrderbookResponseConverter :
    ProtobufConverter<QueryDerivativeOrderbookResponse> by
    QueryDerivativeOrderbookResponseJvmConverter

public actual object QueryTraderSpotOrdersToCancelUpToAmountRequestConverter :
    ProtobufConverter<QueryTraderSpotOrdersToCancelUpToAmountRequest> by
    QueryTraderSpotOrdersToCancelUpToAmountRequestJvmConverter

public actual object QueryTraderDerivativeOrdersToCancelUpToAmountRequestConverter :
    ProtobufConverter<QueryTraderDerivativeOrdersToCancelUpToAmountRequest> by
    QueryTraderDerivativeOrdersToCancelUpToAmountRequestJvmConverter

public actual object QueryTraderDerivativeOrdersRequestConverter :
    ProtobufConverter<QueryTraderDerivativeOrdersRequest> by
    QueryTraderDerivativeOrdersRequestJvmConverter

public actual object QueryAccountAddressDerivativeOrdersRequestConverter :
    ProtobufConverter<QueryAccountAddressDerivativeOrdersRequest> by
    QueryAccountAddressDerivativeOrdersRequestJvmConverter

public actual object TrimmedDerivativeLimitOrderConverter :
    ProtobufConverter<TrimmedDerivativeLimitOrder> by TrimmedDerivativeLimitOrderJvmConverter

public actual object QueryTraderDerivativeOrdersResponseConverter :
    ProtobufConverter<QueryTraderDerivativeOrdersResponse> by
    QueryTraderDerivativeOrdersResponseJvmConverter

public actual object QueryAccountAddressDerivativeOrdersResponseConverter :
    ProtobufConverter<QueryAccountAddressDerivativeOrdersResponse> by
    QueryAccountAddressDerivativeOrdersResponseJvmConverter

public actual object QueryDerivativeOrdersByHashesRequestConverter :
    ProtobufConverter<QueryDerivativeOrdersByHashesRequest> by
    QueryDerivativeOrdersByHashesRequestJvmConverter

public actual object QueryDerivativeOrdersByHashesResponseConverter :
    ProtobufConverter<QueryDerivativeOrdersByHashesResponse> by
    QueryDerivativeOrdersByHashesResponseJvmConverter

public actual object QueryDerivativeMarketsRequestConverter :
    ProtobufConverter<QueryDerivativeMarketsRequest> by QueryDerivativeMarketsRequestJvmConverter

public actual object PriceLevelConverter : ProtobufConverter<PriceLevel> by PriceLevelJvmConverter

public actual object PerpetualMarketStateConverter : ProtobufConverter<PerpetualMarketState> by
    PerpetualMarketStateJvmConverter

public actual object FullDerivativeMarketConverter : ProtobufConverter<FullDerivativeMarket> by
    FullDerivativeMarketJvmConverter

public actual object QueryDerivativeMarketsResponseConverter :
    ProtobufConverter<QueryDerivativeMarketsResponse> by QueryDerivativeMarketsResponseJvmConverter

public actual object QueryDerivativeMarketRequestConverter :
    ProtobufConverter<QueryDerivativeMarketRequest> by QueryDerivativeMarketRequestJvmConverter

public actual object QueryDerivativeMarketResponseConverter :
    ProtobufConverter<QueryDerivativeMarketResponse> by QueryDerivativeMarketResponseJvmConverter

public actual object QueryDerivativeMarketAddressRequestConverter :
    ProtobufConverter<QueryDerivativeMarketAddressRequest> by
    QueryDerivativeMarketAddressRequestJvmConverter

public actual object QueryDerivativeMarketAddressResponseConverter :
    ProtobufConverter<QueryDerivativeMarketAddressResponse> by
    QueryDerivativeMarketAddressResponseJvmConverter

public actual object QuerySubaccountTradeNonceRequestConverter :
    ProtobufConverter<QuerySubaccountTradeNonceRequest> by
    QuerySubaccountTradeNonceRequestJvmConverter

public actual object QuerySubaccountPositionsRequestConverter :
    ProtobufConverter<QuerySubaccountPositionsRequest> by
    QuerySubaccountPositionsRequestJvmConverter

public actual object QuerySubaccountPositionInMarketRequestConverter :
    ProtobufConverter<QuerySubaccountPositionInMarketRequest> by
    QuerySubaccountPositionInMarketRequestJvmConverter

public actual object QuerySubaccountEffectivePositionInMarketRequestConverter :
    ProtobufConverter<QuerySubaccountEffectivePositionInMarketRequest> by
    QuerySubaccountEffectivePositionInMarketRequestJvmConverter

public actual object QuerySubaccountOrderMetadataRequestConverter :
    ProtobufConverter<QuerySubaccountOrderMetadataRequest> by
    QuerySubaccountOrderMetadataRequestJvmConverter

public actual object QuerySubaccountPositionsResponseConverter :
    ProtobufConverter<QuerySubaccountPositionsResponse> by
    QuerySubaccountPositionsResponseJvmConverter

public actual object QuerySubaccountPositionInMarketResponseConverter :
    ProtobufConverter<QuerySubaccountPositionInMarketResponse> by
    QuerySubaccountPositionInMarketResponseJvmConverter

public actual object EffectivePositionConverter : ProtobufConverter<EffectivePosition> by
    EffectivePositionJvmConverter

public actual object QuerySubaccountEffectivePositionInMarketResponseConverter :
    ProtobufConverter<QuerySubaccountEffectivePositionInMarketResponse> by
    QuerySubaccountEffectivePositionInMarketResponseJvmConverter

public actual object QueryPerpetualMarketInfoRequestConverter :
    ProtobufConverter<QueryPerpetualMarketInfoRequest> by
    QueryPerpetualMarketInfoRequestJvmConverter

public actual object QueryPerpetualMarketInfoResponseConverter :
    ProtobufConverter<QueryPerpetualMarketInfoResponse> by
    QueryPerpetualMarketInfoResponseJvmConverter

public actual object QueryExpiryFuturesMarketInfoRequestConverter :
    ProtobufConverter<QueryExpiryFuturesMarketInfoRequest> by
    QueryExpiryFuturesMarketInfoRequestJvmConverter

public actual object QueryExpiryFuturesMarketInfoResponseConverter :
    ProtobufConverter<QueryExpiryFuturesMarketInfoResponse> by
    QueryExpiryFuturesMarketInfoResponseJvmConverter

public actual object QueryPerpetualMarketFundingRequestConverter :
    ProtobufConverter<QueryPerpetualMarketFundingRequest> by
    QueryPerpetualMarketFundingRequestJvmConverter

public actual object QueryPerpetualMarketFundingResponseConverter :
    ProtobufConverter<QueryPerpetualMarketFundingResponse> by
    QueryPerpetualMarketFundingResponseJvmConverter

public actual object QuerySubaccountOrderMetadataResponseConverter :
    ProtobufConverter<QuerySubaccountOrderMetadataResponse> by
    QuerySubaccountOrderMetadataResponseJvmConverter

public actual object QuerySubaccountTradeNonceResponseConverter :
    ProtobufConverter<QuerySubaccountTradeNonceResponse> by
    QuerySubaccountTradeNonceResponseJvmConverter

public actual object QueryModuleStateRequestConverter : ProtobufConverter<QueryModuleStateRequest>
    by QueryModuleStateRequestJvmConverter

public actual object QueryModuleStateResponseConverter : ProtobufConverter<QueryModuleStateResponse>
    by QueryModuleStateResponseJvmConverter

public actual object QueryPositionsRequestConverter : ProtobufConverter<QueryPositionsRequest> by
    QueryPositionsRequestJvmConverter

public actual object QueryPositionsResponseConverter : ProtobufConverter<QueryPositionsResponse> by
    QueryPositionsResponseJvmConverter

public actual object QueryTradeRewardPointsRequestConverter :
    ProtobufConverter<QueryTradeRewardPointsRequest> by QueryTradeRewardPointsRequestJvmConverter

public actual object QueryTradeRewardPointsResponseConverter :
    ProtobufConverter<QueryTradeRewardPointsResponse> by QueryTradeRewardPointsResponseJvmConverter

public actual object QueryTradeRewardCampaignRequestConverter :
    ProtobufConverter<QueryTradeRewardCampaignRequest> by
    QueryTradeRewardCampaignRequestJvmConverter

public actual object QueryTradeRewardCampaignResponseConverter :
    ProtobufConverter<QueryTradeRewardCampaignResponse> by
    QueryTradeRewardCampaignResponseJvmConverter

public actual object QueryIsOptedOutOfRewardsRequestConverter :
    ProtobufConverter<QueryIsOptedOutOfRewardsRequest> by
    QueryIsOptedOutOfRewardsRequestJvmConverter

public actual object QueryIsOptedOutOfRewardsResponseConverter :
    ProtobufConverter<QueryIsOptedOutOfRewardsResponse> by
    QueryIsOptedOutOfRewardsResponseJvmConverter

public actual object QueryOptedOutOfRewardsAccountsRequestConverter :
    ProtobufConverter<QueryOptedOutOfRewardsAccountsRequest> by
    QueryOptedOutOfRewardsAccountsRequestJvmConverter

public actual object QueryOptedOutOfRewardsAccountsResponseConverter :
    ProtobufConverter<QueryOptedOutOfRewardsAccountsResponse> by
    QueryOptedOutOfRewardsAccountsResponseJvmConverter

public actual object QueryFeeDiscountAccountInfoRequestConverter :
    ProtobufConverter<QueryFeeDiscountAccountInfoRequest> by
    QueryFeeDiscountAccountInfoRequestJvmConverter

public actual object QueryFeeDiscountAccountInfoResponseConverter :
    ProtobufConverter<QueryFeeDiscountAccountInfoResponse> by
    QueryFeeDiscountAccountInfoResponseJvmConverter

public actual object QueryFeeDiscountScheduleRequestConverter :
    ProtobufConverter<QueryFeeDiscountScheduleRequest> by
    QueryFeeDiscountScheduleRequestJvmConverter

public actual object QueryFeeDiscountScheduleResponseConverter :
    ProtobufConverter<QueryFeeDiscountScheduleResponse> by
    QueryFeeDiscountScheduleResponseJvmConverter

public actual object QueryBalanceMismatchesRequestConverter :
    ProtobufConverter<QueryBalanceMismatchesRequest> by QueryBalanceMismatchesRequestJvmConverter

public actual object BalanceMismatchConverter : ProtobufConverter<BalanceMismatch> by
    BalanceMismatchJvmConverter

public actual object QueryBalanceMismatchesResponseConverter :
    ProtobufConverter<QueryBalanceMismatchesResponse> by QueryBalanceMismatchesResponseJvmConverter

public actual object QueryBalanceWithBalanceHoldsRequestConverter :
    ProtobufConverter<QueryBalanceWithBalanceHoldsRequest> by
    QueryBalanceWithBalanceHoldsRequestJvmConverter

public actual object BalanceWithMarginHoldConverter : ProtobufConverter<BalanceWithMarginHold> by
    BalanceWithMarginHoldJvmConverter

public actual object QueryBalanceWithBalanceHoldsResponseConverter :
    ProtobufConverter<QueryBalanceWithBalanceHoldsResponse> by
    QueryBalanceWithBalanceHoldsResponseJvmConverter

public actual object QueryFeeDiscountTierStatisticsRequestConverter :
    ProtobufConverter<QueryFeeDiscountTierStatisticsRequest> by
    QueryFeeDiscountTierStatisticsRequestJvmConverter

public actual object TierStatisticConverter : ProtobufConverter<TierStatistic> by
    TierStatisticJvmConverter

public actual object QueryFeeDiscountTierStatisticsResponseConverter :
    ProtobufConverter<QueryFeeDiscountTierStatisticsResponse> by
    QueryFeeDiscountTierStatisticsResponseJvmConverter

public actual object MitoVaultInfosRequestConverter : ProtobufConverter<MitoVaultInfosRequest> by
    MitoVaultInfosRequestJvmConverter

public actual object MitoVaultInfosResponseConverter : ProtobufConverter<MitoVaultInfosResponse> by
    MitoVaultInfosResponseJvmConverter

public actual object QueryMarketIDFromVaultRequestConverter :
    ProtobufConverter<QueryMarketIDFromVaultRequest> by QueryMarketIDFromVaultRequestJvmConverter

public actual object QueryMarketIDFromVaultResponseConverter :
    ProtobufConverter<QueryMarketIDFromVaultResponse> by QueryMarketIDFromVaultResponseJvmConverter

public actual object QueryHistoricalTradeRecordsRequestConverter :
    ProtobufConverter<QueryHistoricalTradeRecordsRequest> by
    QueryHistoricalTradeRecordsRequestJvmConverter

public actual object QueryHistoricalTradeRecordsResponseConverter :
    ProtobufConverter<QueryHistoricalTradeRecordsResponse> by
    QueryHistoricalTradeRecordsResponseJvmConverter

public actual object TradeHistoryOptionsConverter : ProtobufConverter<TradeHistoryOptions> by
    TradeHistoryOptionsJvmConverter

public actual object QueryMarketVolatilityRequestConverter :
    ProtobufConverter<QueryMarketVolatilityRequest> by QueryMarketVolatilityRequestJvmConverter

public actual object QueryMarketVolatilityResponseConverter :
    ProtobufConverter<QueryMarketVolatilityResponse> by QueryMarketVolatilityResponseJvmConverter

public actual object QueryBinaryMarketsRequestConverter :
    ProtobufConverter<QueryBinaryMarketsRequest> by QueryBinaryMarketsRequestJvmConverter

public actual object QueryBinaryMarketsResponseConverter :
    ProtobufConverter<QueryBinaryMarketsResponse> by QueryBinaryMarketsResponseJvmConverter

public actual object QueryTraderDerivativeConditionalOrdersRequestConverter :
    ProtobufConverter<QueryTraderDerivativeConditionalOrdersRequest> by
    QueryTraderDerivativeConditionalOrdersRequestJvmConverter

public actual object TrimmedDerivativeConditionalOrderConverter :
    ProtobufConverter<TrimmedDerivativeConditionalOrder> by
    TrimmedDerivativeConditionalOrderJvmConverter

public actual object QueryTraderDerivativeConditionalOrdersResponseConverter :
    ProtobufConverter<QueryTraderDerivativeConditionalOrdersResponse> by
    QueryTraderDerivativeConditionalOrdersResponseJvmConverter

public actual object QueryMarketAtomicExecutionFeeMultiplierRequestConverter :
    ProtobufConverter<QueryMarketAtomicExecutionFeeMultiplierRequest> by
    QueryMarketAtomicExecutionFeeMultiplierRequestJvmConverter

public actual object QueryMarketAtomicExecutionFeeMultiplierResponseConverter :
    ProtobufConverter<QueryMarketAtomicExecutionFeeMultiplierResponse> by
    QueryMarketAtomicExecutionFeeMultiplierResponseJvmConverter
