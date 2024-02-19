// Transform from injective/exchange/v1beta1/tx.proto
@file:GeneratorVersion(version = "0.3.1")

package injective.exchange.v1beta1

import kr.jadekim.protobuf.`annotation`.GeneratorVersion
import kr.jadekim.protobuf.converter.ProtobufConverter

public actual object MsgUpdateParamsConverter : ProtobufConverter<MsgUpdateParams> by
    MsgUpdateParamsJvmConverter

public actual object MsgUpdateParamsResponseConverter : ProtobufConverter<MsgUpdateParamsResponse>
    by MsgUpdateParamsResponseJvmConverter

public actual object MsgDepositConverter : ProtobufConverter<MsgDeposit> by MsgDepositJvmConverter

public actual object MsgDepositResponseConverter : ProtobufConverter<MsgDepositResponse> by
    MsgDepositResponseJvmConverter

public actual object MsgWithdrawConverter : ProtobufConverter<MsgWithdraw> by
    MsgWithdrawJvmConverter

public actual object MsgWithdrawResponseConverter : ProtobufConverter<MsgWithdrawResponse> by
    MsgWithdrawResponseJvmConverter

public actual object MsgCreateSpotLimitOrderConverter : ProtobufConverter<MsgCreateSpotLimitOrder>
    by MsgCreateSpotLimitOrderJvmConverter

public actual object MsgCreateSpotLimitOrderResponseConverter :
    ProtobufConverter<MsgCreateSpotLimitOrderResponse> by
    MsgCreateSpotLimitOrderResponseJvmConverter

public actual object MsgBatchCreateSpotLimitOrdersConverter :
    ProtobufConverter<MsgBatchCreateSpotLimitOrders> by MsgBatchCreateSpotLimitOrdersJvmConverter

public actual object MsgBatchCreateSpotLimitOrdersResponseConverter :
    ProtobufConverter<MsgBatchCreateSpotLimitOrdersResponse> by
    MsgBatchCreateSpotLimitOrdersResponseJvmConverter

public actual object MsgInstantSpotMarketLaunchConverter :
    ProtobufConverter<MsgInstantSpotMarketLaunch> by MsgInstantSpotMarketLaunchJvmConverter

public actual object MsgInstantSpotMarketLaunchResponseConverter :
    ProtobufConverter<MsgInstantSpotMarketLaunchResponse> by
    MsgInstantSpotMarketLaunchResponseJvmConverter

public actual object MsgInstantPerpetualMarketLaunchConverter :
    ProtobufConverter<MsgInstantPerpetualMarketLaunch> by
    MsgInstantPerpetualMarketLaunchJvmConverter

public actual object MsgInstantPerpetualMarketLaunchResponseConverter :
    ProtobufConverter<MsgInstantPerpetualMarketLaunchResponse> by
    MsgInstantPerpetualMarketLaunchResponseJvmConverter

public actual object MsgInstantBinaryOptionsMarketLaunchConverter :
    ProtobufConverter<MsgInstantBinaryOptionsMarketLaunch> by
    MsgInstantBinaryOptionsMarketLaunchJvmConverter

public actual object MsgInstantBinaryOptionsMarketLaunchResponseConverter :
    ProtobufConverter<MsgInstantBinaryOptionsMarketLaunchResponse> by
    MsgInstantBinaryOptionsMarketLaunchResponseJvmConverter

public actual object MsgInstantExpiryFuturesMarketLaunchConverter :
    ProtobufConverter<MsgInstantExpiryFuturesMarketLaunch> by
    MsgInstantExpiryFuturesMarketLaunchJvmConverter

public actual object MsgInstantExpiryFuturesMarketLaunchResponseConverter :
    ProtobufConverter<MsgInstantExpiryFuturesMarketLaunchResponse> by
    MsgInstantExpiryFuturesMarketLaunchResponseJvmConverter

public actual object MsgCreateSpotMarketOrderConverter : ProtobufConverter<MsgCreateSpotMarketOrder>
    by MsgCreateSpotMarketOrderJvmConverter

public actual object MsgCreateSpotMarketOrderResponseConverter :
    ProtobufConverter<MsgCreateSpotMarketOrderResponse> by
    MsgCreateSpotMarketOrderResponseJvmConverter

public actual object SpotMarketOrderResultsConverter : ProtobufConverter<SpotMarketOrderResults> by
    SpotMarketOrderResultsJvmConverter

public actual object MsgCreateDerivativeLimitOrderConverter :
    ProtobufConverter<MsgCreateDerivativeLimitOrder> by MsgCreateDerivativeLimitOrderJvmConverter

public actual object MsgCreateDerivativeLimitOrderResponseConverter :
    ProtobufConverter<MsgCreateDerivativeLimitOrderResponse> by
    MsgCreateDerivativeLimitOrderResponseJvmConverter

public actual object MsgCreateBinaryOptionsLimitOrderConverter :
    ProtobufConverter<MsgCreateBinaryOptionsLimitOrder> by
    MsgCreateBinaryOptionsLimitOrderJvmConverter

public actual object MsgCreateBinaryOptionsLimitOrderResponseConverter :
    ProtobufConverter<MsgCreateBinaryOptionsLimitOrderResponse> by
    MsgCreateBinaryOptionsLimitOrderResponseJvmConverter

public actual object MsgBatchCreateDerivativeLimitOrdersConverter :
    ProtobufConverter<MsgBatchCreateDerivativeLimitOrders> by
    MsgBatchCreateDerivativeLimitOrdersJvmConverter

public actual object MsgBatchCreateDerivativeLimitOrdersResponseConverter :
    ProtobufConverter<MsgBatchCreateDerivativeLimitOrdersResponse> by
    MsgBatchCreateDerivativeLimitOrdersResponseJvmConverter

public actual object MsgCancelSpotOrderConverter : ProtobufConverter<MsgCancelSpotOrder> by
    MsgCancelSpotOrderJvmConverter

public actual object MsgCancelSpotOrderResponseConverter :
    ProtobufConverter<MsgCancelSpotOrderResponse> by MsgCancelSpotOrderResponseJvmConverter

public actual object MsgBatchCancelSpotOrdersConverter : ProtobufConverter<MsgBatchCancelSpotOrders>
    by MsgBatchCancelSpotOrdersJvmConverter

public actual object MsgBatchCancelSpotOrdersResponseConverter :
    ProtobufConverter<MsgBatchCancelSpotOrdersResponse> by
    MsgBatchCancelSpotOrdersResponseJvmConverter

public actual object MsgBatchCancelBinaryOptionsOrdersConverter :
    ProtobufConverter<MsgBatchCancelBinaryOptionsOrders> by
    MsgBatchCancelBinaryOptionsOrdersJvmConverter

public actual object MsgBatchCancelBinaryOptionsOrdersResponseConverter :
    ProtobufConverter<MsgBatchCancelBinaryOptionsOrdersResponse> by
    MsgBatchCancelBinaryOptionsOrdersResponseJvmConverter

public actual object MsgBatchUpdateOrdersConverter : ProtobufConverter<MsgBatchUpdateOrders> by
    MsgBatchUpdateOrdersJvmConverter

public actual object MsgBatchUpdateOrdersResponseConverter :
    ProtobufConverter<MsgBatchUpdateOrdersResponse> by MsgBatchUpdateOrdersResponseJvmConverter

public actual object MsgCreateDerivativeMarketOrderConverter :
    ProtobufConverter<MsgCreateDerivativeMarketOrder> by MsgCreateDerivativeMarketOrderJvmConverter

public actual object MsgCreateDerivativeMarketOrderResponseConverter :
    ProtobufConverter<MsgCreateDerivativeMarketOrderResponse> by
    MsgCreateDerivativeMarketOrderResponseJvmConverter

public actual object DerivativeMarketOrderResultsConverter :
    ProtobufConverter<DerivativeMarketOrderResults> by DerivativeMarketOrderResultsJvmConverter

public actual object MsgCreateBinaryOptionsMarketOrderConverter :
    ProtobufConverter<MsgCreateBinaryOptionsMarketOrder> by
    MsgCreateBinaryOptionsMarketOrderJvmConverter

public actual object MsgCreateBinaryOptionsMarketOrderResponseConverter :
    ProtobufConverter<MsgCreateBinaryOptionsMarketOrderResponse> by
    MsgCreateBinaryOptionsMarketOrderResponseJvmConverter

public actual object MsgCancelDerivativeOrderConverter : ProtobufConverter<MsgCancelDerivativeOrder>
    by MsgCancelDerivativeOrderJvmConverter

public actual object MsgCancelDerivativeOrderResponseConverter :
    ProtobufConverter<MsgCancelDerivativeOrderResponse> by
    MsgCancelDerivativeOrderResponseJvmConverter

public actual object MsgCancelBinaryOptionsOrderConverter :
    ProtobufConverter<MsgCancelBinaryOptionsOrder> by MsgCancelBinaryOptionsOrderJvmConverter

public actual object MsgCancelBinaryOptionsOrderResponseConverter :
    ProtobufConverter<MsgCancelBinaryOptionsOrderResponse> by
    MsgCancelBinaryOptionsOrderResponseJvmConverter

public actual object OrderDataConverter : ProtobufConverter<OrderData> by OrderDataJvmConverter

public actual object MsgBatchCancelDerivativeOrdersConverter :
    ProtobufConverter<MsgBatchCancelDerivativeOrders> by MsgBatchCancelDerivativeOrdersJvmConverter

public actual object MsgBatchCancelDerivativeOrdersResponseConverter :
    ProtobufConverter<MsgBatchCancelDerivativeOrdersResponse> by
    MsgBatchCancelDerivativeOrdersResponseJvmConverter

public actual object MsgSubaccountTransferConverter : ProtobufConverter<MsgSubaccountTransfer> by
    MsgSubaccountTransferJvmConverter

public actual object MsgSubaccountTransferResponseConverter :
    ProtobufConverter<MsgSubaccountTransferResponse> by MsgSubaccountTransferResponseJvmConverter

public actual object MsgExternalTransferConverter : ProtobufConverter<MsgExternalTransfer> by
    MsgExternalTransferJvmConverter

public actual object MsgExternalTransferResponseConverter :
    ProtobufConverter<MsgExternalTransferResponse> by MsgExternalTransferResponseJvmConverter

public actual object MsgLiquidatePositionConverter : ProtobufConverter<MsgLiquidatePosition> by
    MsgLiquidatePositionJvmConverter

public actual object MsgLiquidatePositionResponseConverter :
    ProtobufConverter<MsgLiquidatePositionResponse> by MsgLiquidatePositionResponseJvmConverter

public actual object MsgEmergencySettleMarketConverter : ProtobufConverter<MsgEmergencySettleMarket>
    by MsgEmergencySettleMarketJvmConverter

public actual object MsgEmergencySettleMarketResponseConverter :
    ProtobufConverter<MsgEmergencySettleMarketResponse> by
    MsgEmergencySettleMarketResponseJvmConverter

public actual object MsgIncreasePositionMarginConverter :
    ProtobufConverter<MsgIncreasePositionMargin> by MsgIncreasePositionMarginJvmConverter

public actual object MsgIncreasePositionMarginResponseConverter :
    ProtobufConverter<MsgIncreasePositionMarginResponse> by
    MsgIncreasePositionMarginResponseJvmConverter

public actual object MsgPrivilegedExecuteContractConverter :
    ProtobufConverter<MsgPrivilegedExecuteContract> by MsgPrivilegedExecuteContractJvmConverter

public actual object MsgPrivilegedExecuteContractResponseConverter :
    ProtobufConverter<MsgPrivilegedExecuteContractResponse> by
    MsgPrivilegedExecuteContractResponseJvmConverter

public actual object MsgRewardsOptOutConverter : ProtobufConverter<MsgRewardsOptOut> by
    MsgRewardsOptOutJvmConverter

public actual object MsgRewardsOptOutResponseConverter : ProtobufConverter<MsgRewardsOptOutResponse>
    by MsgRewardsOptOutResponseJvmConverter

public actual object MsgReclaimLockedFundsConverter : ProtobufConverter<MsgReclaimLockedFunds> by
    MsgReclaimLockedFundsJvmConverter

public actual object MsgReclaimLockedFundsResponseConverter :
    ProtobufConverter<MsgReclaimLockedFundsResponse> by MsgReclaimLockedFundsResponseJvmConverter

public actual object MsgSignDataConverter : ProtobufConverter<MsgSignData> by
    MsgSignDataJvmConverter

public actual object MsgSignDocConverter : ProtobufConverter<MsgSignDoc> by MsgSignDocJvmConverter

public actual object MsgAdminUpdateBinaryOptionsMarketConverter :
    ProtobufConverter<MsgAdminUpdateBinaryOptionsMarket> by
    MsgAdminUpdateBinaryOptionsMarketJvmConverter

public actual object MsgAdminUpdateBinaryOptionsMarketResponseConverter :
    ProtobufConverter<MsgAdminUpdateBinaryOptionsMarketResponse> by
    MsgAdminUpdateBinaryOptionsMarketResponseJvmConverter
