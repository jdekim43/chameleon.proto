// Transform from injective/exchange/v1beta1/tx.proto
@file:GeneratorVersion(version = "0.3.1")

package injective.exchange.v1beta1

import kotlin.coroutines.CoroutineContext
import kr.jadekim.protobuf.`annotation`.GeneratorVersion
import kr.jadekim.protobuf.grpc.ClientOption
import kr.jadekim.protobuf.grpc.GrpcService

public actual object Msg : GrpcService<Msg.Interface, Msg.Server, Msg.Client> {
  public override fun createClient(option: ClientOption): Client = Client(option)

  public actual interface Interface {
    public actual suspend fun deposit(request: MsgDeposit): MsgDepositResponse

    public actual suspend fun withdraw(request: MsgWithdraw): MsgWithdrawResponse

    public actual suspend fun instantSpotMarketLaunch(request: MsgInstantSpotMarketLaunch):
        MsgInstantSpotMarketLaunchResponse

    public actual suspend
        fun instantPerpetualMarketLaunch(request: MsgInstantPerpetualMarketLaunch):
        MsgInstantPerpetualMarketLaunchResponse

    public actual suspend
        fun instantExpiryFuturesMarketLaunch(request: MsgInstantExpiryFuturesMarketLaunch):
        MsgInstantExpiryFuturesMarketLaunchResponse

    public actual suspend fun createSpotLimitOrder(request: MsgCreateSpotLimitOrder):
        MsgCreateSpotLimitOrderResponse

    public actual suspend fun batchCreateSpotLimitOrders(request: MsgBatchCreateSpotLimitOrders):
        MsgBatchCreateSpotLimitOrdersResponse

    public actual suspend fun createSpotMarketOrder(request: MsgCreateSpotMarketOrder):
        MsgCreateSpotMarketOrderResponse

    public actual suspend fun cancelSpotOrder(request: MsgCancelSpotOrder):
        MsgCancelSpotOrderResponse

    public actual suspend fun batchCancelSpotOrders(request: MsgBatchCancelSpotOrders):
        MsgBatchCancelSpotOrdersResponse

    public actual suspend fun batchUpdateOrders(request: MsgBatchUpdateOrders):
        MsgBatchUpdateOrdersResponse

    public actual suspend fun privilegedExecuteContract(request: MsgPrivilegedExecuteContract):
        MsgPrivilegedExecuteContractResponse

    public actual suspend fun createDerivativeLimitOrder(request: MsgCreateDerivativeLimitOrder):
        MsgCreateDerivativeLimitOrderResponse

    public actual suspend
        fun batchCreateDerivativeLimitOrders(request: MsgBatchCreateDerivativeLimitOrders):
        MsgBatchCreateDerivativeLimitOrdersResponse

    public actual suspend fun createDerivativeMarketOrder(request: MsgCreateDerivativeMarketOrder):
        MsgCreateDerivativeMarketOrderResponse

    public actual suspend fun cancelDerivativeOrder(request: MsgCancelDerivativeOrder):
        MsgCancelDerivativeOrderResponse

    public actual suspend fun batchCancelDerivativeOrders(request: MsgBatchCancelDerivativeOrders):
        MsgBatchCancelDerivativeOrdersResponse

    public actual suspend
        fun instantBinaryOptionsMarketLaunch(request: MsgInstantBinaryOptionsMarketLaunch):
        MsgInstantBinaryOptionsMarketLaunchResponse

    public actual suspend
        fun createBinaryOptionsLimitOrder(request: MsgCreateBinaryOptionsLimitOrder):
        MsgCreateBinaryOptionsLimitOrderResponse

    public actual suspend
        fun createBinaryOptionsMarketOrder(request: MsgCreateBinaryOptionsMarketOrder):
        MsgCreateBinaryOptionsMarketOrderResponse

    public actual suspend fun cancelBinaryOptionsOrder(request: MsgCancelBinaryOptionsOrder):
        MsgCancelBinaryOptionsOrderResponse

    public actual suspend
        fun batchCancelBinaryOptionsOrders(request: MsgBatchCancelBinaryOptionsOrders):
        MsgBatchCancelBinaryOptionsOrdersResponse

    public actual suspend fun subaccountTransfer(request: MsgSubaccountTransfer):
        MsgSubaccountTransferResponse

    public actual suspend fun externalTransfer(request: MsgExternalTransfer):
        MsgExternalTransferResponse

    public actual suspend fun liquidatePosition(request: MsgLiquidatePosition):
        MsgLiquidatePositionResponse

    public actual suspend fun emergencySettleMarket(request: MsgEmergencySettleMarket):
        MsgEmergencySettleMarketResponse

    public actual suspend fun increasePositionMargin(request: MsgIncreasePositionMargin):
        MsgIncreasePositionMarginResponse

    public actual suspend fun rewardsOptOut(request: MsgRewardsOptOut): MsgRewardsOptOutResponse

    public actual suspend
        fun adminUpdateBinaryOptionsMarket(request: MsgAdminUpdateBinaryOptionsMarket):
        MsgAdminUpdateBinaryOptionsMarketResponse

    public actual suspend fun reclaimLockedFunds(request: MsgReclaimLockedFunds):
        MsgReclaimLockedFundsResponse

    public actual suspend fun updateParams(request: MsgUpdateParams): MsgUpdateParamsResponse
  }

  public actual abstract class Server actual constructor(
    coroutineContext: CoroutineContext,
  ) : MsgJvm.Server(coroutineContext), Interface

  public actual open class Client actual constructor(
    option: ClientOption,
  ) : MsgJvm.Client(option), Interface
}
