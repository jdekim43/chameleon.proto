// Transform from injective/exchange/v1beta1/tx.proto
@file:GeneratorVersion(version = "0.3.1")

package injective.exchange.v1beta1

import kotlin.coroutines.CoroutineContext
import kotlin.coroutines.EmptyCoroutineContext
import kr.jadekim.protobuf.`annotation`.GeneratorVersion
import kr.jadekim.protobuf.grpc.ClientOption
import kr.jadekim.protobuf.grpc.GrpcService

public expect object Msg : GrpcService<Msg.Interface, Msg.Server, Msg.Client> {
  public interface Interface {
    public suspend fun deposit(request: MsgDeposit): MsgDepositResponse

    public suspend fun withdraw(request: MsgWithdraw): MsgWithdrawResponse

    public suspend fun instantSpotMarketLaunch(request: MsgInstantSpotMarketLaunch):
        MsgInstantSpotMarketLaunchResponse

    public suspend fun instantPerpetualMarketLaunch(request: MsgInstantPerpetualMarketLaunch):
        MsgInstantPerpetualMarketLaunchResponse

    public suspend
        fun instantExpiryFuturesMarketLaunch(request: MsgInstantExpiryFuturesMarketLaunch):
        MsgInstantExpiryFuturesMarketLaunchResponse

    public suspend fun createSpotLimitOrder(request: MsgCreateSpotLimitOrder):
        MsgCreateSpotLimitOrderResponse

    public suspend fun batchCreateSpotLimitOrders(request: MsgBatchCreateSpotLimitOrders):
        MsgBatchCreateSpotLimitOrdersResponse

    public suspend fun createSpotMarketOrder(request: MsgCreateSpotMarketOrder):
        MsgCreateSpotMarketOrderResponse

    public suspend fun cancelSpotOrder(request: MsgCancelSpotOrder): MsgCancelSpotOrderResponse

    public suspend fun batchCancelSpotOrders(request: MsgBatchCancelSpotOrders):
        MsgBatchCancelSpotOrdersResponse

    public suspend fun batchUpdateOrders(request: MsgBatchUpdateOrders):
        MsgBatchUpdateOrdersResponse

    public suspend fun privilegedExecuteContract(request: MsgPrivilegedExecuteContract):
        MsgPrivilegedExecuteContractResponse

    public suspend fun createDerivativeLimitOrder(request: MsgCreateDerivativeLimitOrder):
        MsgCreateDerivativeLimitOrderResponse

    public suspend
        fun batchCreateDerivativeLimitOrders(request: MsgBatchCreateDerivativeLimitOrders):
        MsgBatchCreateDerivativeLimitOrdersResponse

    public suspend fun createDerivativeMarketOrder(request: MsgCreateDerivativeMarketOrder):
        MsgCreateDerivativeMarketOrderResponse

    public suspend fun cancelDerivativeOrder(request: MsgCancelDerivativeOrder):
        MsgCancelDerivativeOrderResponse

    public suspend fun batchCancelDerivativeOrders(request: MsgBatchCancelDerivativeOrders):
        MsgBatchCancelDerivativeOrdersResponse

    public suspend
        fun instantBinaryOptionsMarketLaunch(request: MsgInstantBinaryOptionsMarketLaunch):
        MsgInstantBinaryOptionsMarketLaunchResponse

    public suspend fun createBinaryOptionsLimitOrder(request: MsgCreateBinaryOptionsLimitOrder):
        MsgCreateBinaryOptionsLimitOrderResponse

    public suspend fun createBinaryOptionsMarketOrder(request: MsgCreateBinaryOptionsMarketOrder):
        MsgCreateBinaryOptionsMarketOrderResponse

    public suspend fun cancelBinaryOptionsOrder(request: MsgCancelBinaryOptionsOrder):
        MsgCancelBinaryOptionsOrderResponse

    public suspend fun batchCancelBinaryOptionsOrders(request: MsgBatchCancelBinaryOptionsOrders):
        MsgBatchCancelBinaryOptionsOrdersResponse

    public suspend fun subaccountTransfer(request: MsgSubaccountTransfer):
        MsgSubaccountTransferResponse

    public suspend fun externalTransfer(request: MsgExternalTransfer): MsgExternalTransferResponse

    public suspend fun liquidatePosition(request: MsgLiquidatePosition):
        MsgLiquidatePositionResponse

    public suspend fun emergencySettleMarket(request: MsgEmergencySettleMarket):
        MsgEmergencySettleMarketResponse

    public suspend fun increasePositionMargin(request: MsgIncreasePositionMargin):
        MsgIncreasePositionMarginResponse

    public suspend fun rewardsOptOut(request: MsgRewardsOptOut): MsgRewardsOptOutResponse

    public suspend fun adminUpdateBinaryOptionsMarket(request: MsgAdminUpdateBinaryOptionsMarket):
        MsgAdminUpdateBinaryOptionsMarketResponse

    public suspend fun reclaimLockedFunds(request: MsgReclaimLockedFunds):
        MsgReclaimLockedFundsResponse

    public suspend fun updateParams(request: MsgUpdateParams): MsgUpdateParamsResponse
  }

  public abstract class Server(
    coroutineContext: CoroutineContext = EmptyCoroutineContext,
  ) : Interface

  public open class Client(
    option: ClientOption,
  ) : Interface
}
