// Transform from injective/exchange/v1beta1/tx.proto
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

public object MsgJvm {
  private val descriptor: ServiceDescriptor = MsgGrpc.getServiceDescriptor()!!

  private val depositDescriptor: MethodDescriptor<Tx.MsgDeposit, Tx.MsgDepositResponse> =
      MsgGrpc.getDepositMethod()!!

  private val withdrawDescriptor: MethodDescriptor<Tx.MsgWithdraw, Tx.MsgWithdrawResponse> =
      MsgGrpc.getWithdrawMethod()!!

  private val instantSpotMarketLaunchDescriptor:
      MethodDescriptor<Tx.MsgInstantSpotMarketLaunch, Tx.MsgInstantSpotMarketLaunchResponse> =
      MsgGrpc.getInstantSpotMarketLaunchMethod()!!

  private val instantPerpetualMarketLaunchDescriptor:
      MethodDescriptor<Tx.MsgInstantPerpetualMarketLaunch, Tx.MsgInstantPerpetualMarketLaunchResponse>
      = MsgGrpc.getInstantPerpetualMarketLaunchMethod()!!

  private val instantExpiryFuturesMarketLaunchDescriptor:
      MethodDescriptor<Tx.MsgInstantExpiryFuturesMarketLaunch, Tx.MsgInstantExpiryFuturesMarketLaunchResponse>
      = MsgGrpc.getInstantExpiryFuturesMarketLaunchMethod()!!

  private val createSpotLimitOrderDescriptor:
      MethodDescriptor<Tx.MsgCreateSpotLimitOrder, Tx.MsgCreateSpotLimitOrderResponse> =
      MsgGrpc.getCreateSpotLimitOrderMethod()!!

  private val batchCreateSpotLimitOrdersDescriptor:
      MethodDescriptor<Tx.MsgBatchCreateSpotLimitOrders, Tx.MsgBatchCreateSpotLimitOrdersResponse> =
      MsgGrpc.getBatchCreateSpotLimitOrdersMethod()!!

  private val createSpotMarketOrderDescriptor:
      MethodDescriptor<Tx.MsgCreateSpotMarketOrder, Tx.MsgCreateSpotMarketOrderResponse> =
      MsgGrpc.getCreateSpotMarketOrderMethod()!!

  private val cancelSpotOrderDescriptor:
      MethodDescriptor<Tx.MsgCancelSpotOrder, Tx.MsgCancelSpotOrderResponse> =
      MsgGrpc.getCancelSpotOrderMethod()!!

  private val batchCancelSpotOrdersDescriptor:
      MethodDescriptor<Tx.MsgBatchCancelSpotOrders, Tx.MsgBatchCancelSpotOrdersResponse> =
      MsgGrpc.getBatchCancelSpotOrdersMethod()!!

  private val batchUpdateOrdersDescriptor:
      MethodDescriptor<Tx.MsgBatchUpdateOrders, Tx.MsgBatchUpdateOrdersResponse> =
      MsgGrpc.getBatchUpdateOrdersMethod()!!

  private val privilegedExecuteContractDescriptor:
      MethodDescriptor<Tx.MsgPrivilegedExecuteContract, Tx.MsgPrivilegedExecuteContractResponse> =
      MsgGrpc.getPrivilegedExecuteContractMethod()!!

  private val createDerivativeLimitOrderDescriptor:
      MethodDescriptor<Tx.MsgCreateDerivativeLimitOrder, Tx.MsgCreateDerivativeLimitOrderResponse> =
      MsgGrpc.getCreateDerivativeLimitOrderMethod()!!

  private val batchCreateDerivativeLimitOrdersDescriptor:
      MethodDescriptor<Tx.MsgBatchCreateDerivativeLimitOrders, Tx.MsgBatchCreateDerivativeLimitOrdersResponse>
      = MsgGrpc.getBatchCreateDerivativeLimitOrdersMethod()!!

  private val createDerivativeMarketOrderDescriptor:
      MethodDescriptor<Tx.MsgCreateDerivativeMarketOrder, Tx.MsgCreateDerivativeMarketOrderResponse>
      = MsgGrpc.getCreateDerivativeMarketOrderMethod()!!

  private val cancelDerivativeOrderDescriptor:
      MethodDescriptor<Tx.MsgCancelDerivativeOrder, Tx.MsgCancelDerivativeOrderResponse> =
      MsgGrpc.getCancelDerivativeOrderMethod()!!

  private val batchCancelDerivativeOrdersDescriptor:
      MethodDescriptor<Tx.MsgBatchCancelDerivativeOrders, Tx.MsgBatchCancelDerivativeOrdersResponse>
      = MsgGrpc.getBatchCancelDerivativeOrdersMethod()!!

  private val instantBinaryOptionsMarketLaunchDescriptor:
      MethodDescriptor<Tx.MsgInstantBinaryOptionsMarketLaunch, Tx.MsgInstantBinaryOptionsMarketLaunchResponse>
      = MsgGrpc.getInstantBinaryOptionsMarketLaunchMethod()!!

  private val createBinaryOptionsLimitOrderDescriptor:
      MethodDescriptor<Tx.MsgCreateBinaryOptionsLimitOrder, Tx.MsgCreateBinaryOptionsLimitOrderResponse>
      = MsgGrpc.getCreateBinaryOptionsLimitOrderMethod()!!

  private val createBinaryOptionsMarketOrderDescriptor:
      MethodDescriptor<Tx.MsgCreateBinaryOptionsMarketOrder, Tx.MsgCreateBinaryOptionsMarketOrderResponse>
      = MsgGrpc.getCreateBinaryOptionsMarketOrderMethod()!!

  private val cancelBinaryOptionsOrderDescriptor:
      MethodDescriptor<Tx.MsgCancelBinaryOptionsOrder, Tx.MsgCancelBinaryOptionsOrderResponse> =
      MsgGrpc.getCancelBinaryOptionsOrderMethod()!!

  private val batchCancelBinaryOptionsOrdersDescriptor:
      MethodDescriptor<Tx.MsgBatchCancelBinaryOptionsOrders, Tx.MsgBatchCancelBinaryOptionsOrdersResponse>
      = MsgGrpc.getBatchCancelBinaryOptionsOrdersMethod()!!

  private val subaccountTransferDescriptor:
      MethodDescriptor<Tx.MsgSubaccountTransfer, Tx.MsgSubaccountTransferResponse> =
      MsgGrpc.getSubaccountTransferMethod()!!

  private val externalTransferDescriptor:
      MethodDescriptor<Tx.MsgExternalTransfer, Tx.MsgExternalTransferResponse> =
      MsgGrpc.getExternalTransferMethod()!!

  private val liquidatePositionDescriptor:
      MethodDescriptor<Tx.MsgLiquidatePosition, Tx.MsgLiquidatePositionResponse> =
      MsgGrpc.getLiquidatePositionMethod()!!

  private val emergencySettleMarketDescriptor:
      MethodDescriptor<Tx.MsgEmergencySettleMarket, Tx.MsgEmergencySettleMarketResponse> =
      MsgGrpc.getEmergencySettleMarketMethod()!!

  private val increasePositionMarginDescriptor:
      MethodDescriptor<Tx.MsgIncreasePositionMargin, Tx.MsgIncreasePositionMarginResponse> =
      MsgGrpc.getIncreasePositionMarginMethod()!!

  private val rewardsOptOutDescriptor:
      MethodDescriptor<Tx.MsgRewardsOptOut, Tx.MsgRewardsOptOutResponse> =
      MsgGrpc.getRewardsOptOutMethod()!!

  private val adminUpdateBinaryOptionsMarketDescriptor:
      MethodDescriptor<Tx.MsgAdminUpdateBinaryOptionsMarket, Tx.MsgAdminUpdateBinaryOptionsMarketResponse>
      = MsgGrpc.getAdminUpdateBinaryOptionsMarketMethod()!!

  private val reclaimLockedFundsDescriptor:
      MethodDescriptor<Tx.MsgReclaimLockedFunds, Tx.MsgReclaimLockedFundsResponse> =
      MsgGrpc.getReclaimLockedFundsMethod()!!

  private val updateParamsDescriptor:
      MethodDescriptor<Tx.MsgUpdateParams, Tx.MsgUpdateParamsResponse> =
      MsgGrpc.getUpdateParamsMethod()!!

  public abstract class Server(
    coroutineContext: CoroutineContext = EmptyCoroutineContext,
  ) : AbstractCoroutineServerImpl(context = coroutineContext), Msg.Interface {
    public open override suspend fun deposit(request: MsgDeposit): MsgDepositResponse = throw
        StatusException(Status.UNIMPLEMENTED.withDescription("Method injective.exchange.v1beta1.Msg.Deposit is unimplemented"))

    public open override suspend fun withdraw(request: MsgWithdraw): MsgWithdrawResponse = throw
        StatusException(Status.UNIMPLEMENTED.withDescription("Method injective.exchange.v1beta1.Msg.Withdraw is unimplemented"))

    public open override suspend fun instantSpotMarketLaunch(request: MsgInstantSpotMarketLaunch):
        MsgInstantSpotMarketLaunchResponse = throw
        StatusException(Status.UNIMPLEMENTED.withDescription("Method injective.exchange.v1beta1.Msg.InstantSpotMarketLaunch is unimplemented"))

    public open override suspend
        fun instantPerpetualMarketLaunch(request: MsgInstantPerpetualMarketLaunch):
        MsgInstantPerpetualMarketLaunchResponse = throw
        StatusException(Status.UNIMPLEMENTED.withDescription("Method injective.exchange.v1beta1.Msg.InstantPerpetualMarketLaunch is unimplemented"))

    public open override suspend
        fun instantExpiryFuturesMarketLaunch(request: MsgInstantExpiryFuturesMarketLaunch):
        MsgInstantExpiryFuturesMarketLaunchResponse = throw
        StatusException(Status.UNIMPLEMENTED.withDescription("Method injective.exchange.v1beta1.Msg.InstantExpiryFuturesMarketLaunch is unimplemented"))

    public open override suspend fun createSpotLimitOrder(request: MsgCreateSpotLimitOrder):
        MsgCreateSpotLimitOrderResponse = throw
        StatusException(Status.UNIMPLEMENTED.withDescription("Method injective.exchange.v1beta1.Msg.CreateSpotLimitOrder is unimplemented"))

    public open override suspend
        fun batchCreateSpotLimitOrders(request: MsgBatchCreateSpotLimitOrders):
        MsgBatchCreateSpotLimitOrdersResponse = throw
        StatusException(Status.UNIMPLEMENTED.withDescription("Method injective.exchange.v1beta1.Msg.BatchCreateSpotLimitOrders is unimplemented"))

    public open override suspend fun createSpotMarketOrder(request: MsgCreateSpotMarketOrder):
        MsgCreateSpotMarketOrderResponse = throw
        StatusException(Status.UNIMPLEMENTED.withDescription("Method injective.exchange.v1beta1.Msg.CreateSpotMarketOrder is unimplemented"))

    public open override suspend fun cancelSpotOrder(request: MsgCancelSpotOrder):
        MsgCancelSpotOrderResponse = throw
        StatusException(Status.UNIMPLEMENTED.withDescription("Method injective.exchange.v1beta1.Msg.CancelSpotOrder is unimplemented"))

    public open override suspend fun batchCancelSpotOrders(request: MsgBatchCancelSpotOrders):
        MsgBatchCancelSpotOrdersResponse = throw
        StatusException(Status.UNIMPLEMENTED.withDescription("Method injective.exchange.v1beta1.Msg.BatchCancelSpotOrders is unimplemented"))

    public open override suspend fun batchUpdateOrders(request: MsgBatchUpdateOrders):
        MsgBatchUpdateOrdersResponse = throw
        StatusException(Status.UNIMPLEMENTED.withDescription("Method injective.exchange.v1beta1.Msg.BatchUpdateOrders is unimplemented"))

    public open override suspend
        fun privilegedExecuteContract(request: MsgPrivilegedExecuteContract):
        MsgPrivilegedExecuteContractResponse = throw
        StatusException(Status.UNIMPLEMENTED.withDescription("Method injective.exchange.v1beta1.Msg.PrivilegedExecuteContract is unimplemented"))

    public open override suspend
        fun createDerivativeLimitOrder(request: MsgCreateDerivativeLimitOrder):
        MsgCreateDerivativeLimitOrderResponse = throw
        StatusException(Status.UNIMPLEMENTED.withDescription("Method injective.exchange.v1beta1.Msg.CreateDerivativeLimitOrder is unimplemented"))

    public open override suspend
        fun batchCreateDerivativeLimitOrders(request: MsgBatchCreateDerivativeLimitOrders):
        MsgBatchCreateDerivativeLimitOrdersResponse = throw
        StatusException(Status.UNIMPLEMENTED.withDescription("Method injective.exchange.v1beta1.Msg.BatchCreateDerivativeLimitOrders is unimplemented"))

    public open override suspend
        fun createDerivativeMarketOrder(request: MsgCreateDerivativeMarketOrder):
        MsgCreateDerivativeMarketOrderResponse = throw
        StatusException(Status.UNIMPLEMENTED.withDescription("Method injective.exchange.v1beta1.Msg.CreateDerivativeMarketOrder is unimplemented"))

    public open override suspend fun cancelDerivativeOrder(request: MsgCancelDerivativeOrder):
        MsgCancelDerivativeOrderResponse = throw
        StatusException(Status.UNIMPLEMENTED.withDescription("Method injective.exchange.v1beta1.Msg.CancelDerivativeOrder is unimplemented"))

    public open override suspend
        fun batchCancelDerivativeOrders(request: MsgBatchCancelDerivativeOrders):
        MsgBatchCancelDerivativeOrdersResponse = throw
        StatusException(Status.UNIMPLEMENTED.withDescription("Method injective.exchange.v1beta1.Msg.BatchCancelDerivativeOrders is unimplemented"))

    public open override suspend
        fun instantBinaryOptionsMarketLaunch(request: MsgInstantBinaryOptionsMarketLaunch):
        MsgInstantBinaryOptionsMarketLaunchResponse = throw
        StatusException(Status.UNIMPLEMENTED.withDescription("Method injective.exchange.v1beta1.Msg.InstantBinaryOptionsMarketLaunch is unimplemented"))

    public open override suspend
        fun createBinaryOptionsLimitOrder(request: MsgCreateBinaryOptionsLimitOrder):
        MsgCreateBinaryOptionsLimitOrderResponse = throw
        StatusException(Status.UNIMPLEMENTED.withDescription("Method injective.exchange.v1beta1.Msg.CreateBinaryOptionsLimitOrder is unimplemented"))

    public open override suspend
        fun createBinaryOptionsMarketOrder(request: MsgCreateBinaryOptionsMarketOrder):
        MsgCreateBinaryOptionsMarketOrderResponse = throw
        StatusException(Status.UNIMPLEMENTED.withDescription("Method injective.exchange.v1beta1.Msg.CreateBinaryOptionsMarketOrder is unimplemented"))

    public open override suspend fun cancelBinaryOptionsOrder(request: MsgCancelBinaryOptionsOrder):
        MsgCancelBinaryOptionsOrderResponse = throw
        StatusException(Status.UNIMPLEMENTED.withDescription("Method injective.exchange.v1beta1.Msg.CancelBinaryOptionsOrder is unimplemented"))

    public open override suspend
        fun batchCancelBinaryOptionsOrders(request: MsgBatchCancelBinaryOptionsOrders):
        MsgBatchCancelBinaryOptionsOrdersResponse = throw
        StatusException(Status.UNIMPLEMENTED.withDescription("Method injective.exchange.v1beta1.Msg.BatchCancelBinaryOptionsOrders is unimplemented"))

    public open override suspend fun subaccountTransfer(request: MsgSubaccountTransfer):
        MsgSubaccountTransferResponse = throw
        StatusException(Status.UNIMPLEMENTED.withDescription("Method injective.exchange.v1beta1.Msg.SubaccountTransfer is unimplemented"))

    public open override suspend fun externalTransfer(request: MsgExternalTransfer):
        MsgExternalTransferResponse = throw
        StatusException(Status.UNIMPLEMENTED.withDescription("Method injective.exchange.v1beta1.Msg.ExternalTransfer is unimplemented"))

    public open override suspend fun liquidatePosition(request: MsgLiquidatePosition):
        MsgLiquidatePositionResponse = throw
        StatusException(Status.UNIMPLEMENTED.withDescription("Method injective.exchange.v1beta1.Msg.LiquidatePosition is unimplemented"))

    public open override suspend fun emergencySettleMarket(request: MsgEmergencySettleMarket):
        MsgEmergencySettleMarketResponse = throw
        StatusException(Status.UNIMPLEMENTED.withDescription("Method injective.exchange.v1beta1.Msg.EmergencySettleMarket is unimplemented"))

    public open override suspend fun increasePositionMargin(request: MsgIncreasePositionMargin):
        MsgIncreasePositionMarginResponse = throw
        StatusException(Status.UNIMPLEMENTED.withDescription("Method injective.exchange.v1beta1.Msg.IncreasePositionMargin is unimplemented"))

    public open override suspend fun rewardsOptOut(request: MsgRewardsOptOut):
        MsgRewardsOptOutResponse = throw
        StatusException(Status.UNIMPLEMENTED.withDescription("Method injective.exchange.v1beta1.Msg.RewardsOptOut is unimplemented"))

    public open override suspend
        fun adminUpdateBinaryOptionsMarket(request: MsgAdminUpdateBinaryOptionsMarket):
        MsgAdminUpdateBinaryOptionsMarketResponse = throw
        StatusException(Status.UNIMPLEMENTED.withDescription("Method injective.exchange.v1beta1.Msg.AdminUpdateBinaryOptionsMarket is unimplemented"))

    public open override suspend fun reclaimLockedFunds(request: MsgReclaimLockedFunds):
        MsgReclaimLockedFundsResponse = throw
        StatusException(Status.UNIMPLEMENTED.withDescription("Method injective.exchange.v1beta1.Msg.ReclaimLockedFunds is unimplemented"))

    public open override suspend fun updateParams(request: MsgUpdateParams): MsgUpdateParamsResponse
        = throw
        StatusException(Status.UNIMPLEMENTED.withDescription("Method injective.exchange.v1beta1.Msg.UpdateParams is unimplemented"))

    public override fun bindService(): ServerServiceDefinition =
        ServerServiceDefinition.builder(descriptor)
    		.addMethod(
    			ServerCalls.unaryServerMethodDefinition(
    				context = this.context,
    				descriptor = depositDescriptor,
    				implementation = {
        MsgDepositResponseJvmConverter.convert(deposit(MsgDepositJvmConverter.convert(it))) },
    			)
    		)
    		.addMethod(
    			ServerCalls.unaryServerMethodDefinition(
    				context = this.context,
    				descriptor = withdrawDescriptor,
    				implementation = {
        MsgWithdrawResponseJvmConverter.convert(withdraw(MsgWithdrawJvmConverter.convert(it))) },
    			)
    		)
    		.addMethod(
    			ServerCalls.unaryServerMethodDefinition(
    				context = this.context,
    				descriptor = instantSpotMarketLaunchDescriptor,
    				implementation = {
        MsgInstantSpotMarketLaunchResponseJvmConverter.convert(instantSpotMarketLaunch(MsgInstantSpotMarketLaunchJvmConverter.convert(it)))
        },
    			)
    		)
    		.addMethod(
    			ServerCalls.unaryServerMethodDefinition(
    				context = this.context,
    				descriptor = instantPerpetualMarketLaunchDescriptor,
    				implementation = {
        MsgInstantPerpetualMarketLaunchResponseJvmConverter.convert(instantPerpetualMarketLaunch(MsgInstantPerpetualMarketLaunchJvmConverter.convert(it)))
        },
    			)
    		)
    		.addMethod(
    			ServerCalls.unaryServerMethodDefinition(
    				context = this.context,
    				descriptor = instantExpiryFuturesMarketLaunchDescriptor,
    				implementation = {
        MsgInstantExpiryFuturesMarketLaunchResponseJvmConverter.convert(instantExpiryFuturesMarketLaunch(MsgInstantExpiryFuturesMarketLaunchJvmConverter.convert(it)))
        },
    			)
    		)
    		.addMethod(
    			ServerCalls.unaryServerMethodDefinition(
    				context = this.context,
    				descriptor = createSpotLimitOrderDescriptor,
    				implementation = {
        MsgCreateSpotLimitOrderResponseJvmConverter.convert(createSpotLimitOrder(MsgCreateSpotLimitOrderJvmConverter.convert(it)))
        },
    			)
    		)
    		.addMethod(
    			ServerCalls.unaryServerMethodDefinition(
    				context = this.context,
    				descriptor = batchCreateSpotLimitOrdersDescriptor,
    				implementation = {
        MsgBatchCreateSpotLimitOrdersResponseJvmConverter.convert(batchCreateSpotLimitOrders(MsgBatchCreateSpotLimitOrdersJvmConverter.convert(it)))
        },
    			)
    		)
    		.addMethod(
    			ServerCalls.unaryServerMethodDefinition(
    				context = this.context,
    				descriptor = createSpotMarketOrderDescriptor,
    				implementation = {
        MsgCreateSpotMarketOrderResponseJvmConverter.convert(createSpotMarketOrder(MsgCreateSpotMarketOrderJvmConverter.convert(it)))
        },
    			)
    		)
    		.addMethod(
    			ServerCalls.unaryServerMethodDefinition(
    				context = this.context,
    				descriptor = cancelSpotOrderDescriptor,
    				implementation = {
        MsgCancelSpotOrderResponseJvmConverter.convert(cancelSpotOrder(MsgCancelSpotOrderJvmConverter.convert(it)))
        },
    			)
    		)
    		.addMethod(
    			ServerCalls.unaryServerMethodDefinition(
    				context = this.context,
    				descriptor = batchCancelSpotOrdersDescriptor,
    				implementation = {
        MsgBatchCancelSpotOrdersResponseJvmConverter.convert(batchCancelSpotOrders(MsgBatchCancelSpotOrdersJvmConverter.convert(it)))
        },
    			)
    		)
    		.addMethod(
    			ServerCalls.unaryServerMethodDefinition(
    				context = this.context,
    				descriptor = batchUpdateOrdersDescriptor,
    				implementation = {
        MsgBatchUpdateOrdersResponseJvmConverter.convert(batchUpdateOrders(MsgBatchUpdateOrdersJvmConverter.convert(it)))
        },
    			)
    		)
    		.addMethod(
    			ServerCalls.unaryServerMethodDefinition(
    				context = this.context,
    				descriptor = privilegedExecuteContractDescriptor,
    				implementation = {
        MsgPrivilegedExecuteContractResponseJvmConverter.convert(privilegedExecuteContract(MsgPrivilegedExecuteContractJvmConverter.convert(it)))
        },
    			)
    		)
    		.addMethod(
    			ServerCalls.unaryServerMethodDefinition(
    				context = this.context,
    				descriptor = createDerivativeLimitOrderDescriptor,
    				implementation = {
        MsgCreateDerivativeLimitOrderResponseJvmConverter.convert(createDerivativeLimitOrder(MsgCreateDerivativeLimitOrderJvmConverter.convert(it)))
        },
    			)
    		)
    		.addMethod(
    			ServerCalls.unaryServerMethodDefinition(
    				context = this.context,
    				descriptor = batchCreateDerivativeLimitOrdersDescriptor,
    				implementation = {
        MsgBatchCreateDerivativeLimitOrdersResponseJvmConverter.convert(batchCreateDerivativeLimitOrders(MsgBatchCreateDerivativeLimitOrdersJvmConverter.convert(it)))
        },
    			)
    		)
    		.addMethod(
    			ServerCalls.unaryServerMethodDefinition(
    				context = this.context,
    				descriptor = createDerivativeMarketOrderDescriptor,
    				implementation = {
        MsgCreateDerivativeMarketOrderResponseJvmConverter.convert(createDerivativeMarketOrder(MsgCreateDerivativeMarketOrderJvmConverter.convert(it)))
        },
    			)
    		)
    		.addMethod(
    			ServerCalls.unaryServerMethodDefinition(
    				context = this.context,
    				descriptor = cancelDerivativeOrderDescriptor,
    				implementation = {
        MsgCancelDerivativeOrderResponseJvmConverter.convert(cancelDerivativeOrder(MsgCancelDerivativeOrderJvmConverter.convert(it)))
        },
    			)
    		)
    		.addMethod(
    			ServerCalls.unaryServerMethodDefinition(
    				context = this.context,
    				descriptor = batchCancelDerivativeOrdersDescriptor,
    				implementation = {
        MsgBatchCancelDerivativeOrdersResponseJvmConverter.convert(batchCancelDerivativeOrders(MsgBatchCancelDerivativeOrdersJvmConverter.convert(it)))
        },
    			)
    		)
    		.addMethod(
    			ServerCalls.unaryServerMethodDefinition(
    				context = this.context,
    				descriptor = instantBinaryOptionsMarketLaunchDescriptor,
    				implementation = {
        MsgInstantBinaryOptionsMarketLaunchResponseJvmConverter.convert(instantBinaryOptionsMarketLaunch(MsgInstantBinaryOptionsMarketLaunchJvmConverter.convert(it)))
        },
    			)
    		)
    		.addMethod(
    			ServerCalls.unaryServerMethodDefinition(
    				context = this.context,
    				descriptor = createBinaryOptionsLimitOrderDescriptor,
    				implementation = {
        MsgCreateBinaryOptionsLimitOrderResponseJvmConverter.convert(createBinaryOptionsLimitOrder(MsgCreateBinaryOptionsLimitOrderJvmConverter.convert(it)))
        },
    			)
    		)
    		.addMethod(
    			ServerCalls.unaryServerMethodDefinition(
    				context = this.context,
    				descriptor = createBinaryOptionsMarketOrderDescriptor,
    				implementation = {
        MsgCreateBinaryOptionsMarketOrderResponseJvmConverter.convert(createBinaryOptionsMarketOrder(MsgCreateBinaryOptionsMarketOrderJvmConverter.convert(it)))
        },
    			)
    		)
    		.addMethod(
    			ServerCalls.unaryServerMethodDefinition(
    				context = this.context,
    				descriptor = cancelBinaryOptionsOrderDescriptor,
    				implementation = {
        MsgCancelBinaryOptionsOrderResponseJvmConverter.convert(cancelBinaryOptionsOrder(MsgCancelBinaryOptionsOrderJvmConverter.convert(it)))
        },
    			)
    		)
    		.addMethod(
    			ServerCalls.unaryServerMethodDefinition(
    				context = this.context,
    				descriptor = batchCancelBinaryOptionsOrdersDescriptor,
    				implementation = {
        MsgBatchCancelBinaryOptionsOrdersResponseJvmConverter.convert(batchCancelBinaryOptionsOrders(MsgBatchCancelBinaryOptionsOrdersJvmConverter.convert(it)))
        },
    			)
    		)
    		.addMethod(
    			ServerCalls.unaryServerMethodDefinition(
    				context = this.context,
    				descriptor = subaccountTransferDescriptor,
    				implementation = {
        MsgSubaccountTransferResponseJvmConverter.convert(subaccountTransfer(MsgSubaccountTransferJvmConverter.convert(it)))
        },
    			)
    		)
    		.addMethod(
    			ServerCalls.unaryServerMethodDefinition(
    				context = this.context,
    				descriptor = externalTransferDescriptor,
    				implementation = {
        MsgExternalTransferResponseJvmConverter.convert(externalTransfer(MsgExternalTransferJvmConverter.convert(it)))
        },
    			)
    		)
    		.addMethod(
    			ServerCalls.unaryServerMethodDefinition(
    				context = this.context,
    				descriptor = liquidatePositionDescriptor,
    				implementation = {
        MsgLiquidatePositionResponseJvmConverter.convert(liquidatePosition(MsgLiquidatePositionJvmConverter.convert(it)))
        },
    			)
    		)
    		.addMethod(
    			ServerCalls.unaryServerMethodDefinition(
    				context = this.context,
    				descriptor = emergencySettleMarketDescriptor,
    				implementation = {
        MsgEmergencySettleMarketResponseJvmConverter.convert(emergencySettleMarket(MsgEmergencySettleMarketJvmConverter.convert(it)))
        },
    			)
    		)
    		.addMethod(
    			ServerCalls.unaryServerMethodDefinition(
    				context = this.context,
    				descriptor = increasePositionMarginDescriptor,
    				implementation = {
        MsgIncreasePositionMarginResponseJvmConverter.convert(increasePositionMargin(MsgIncreasePositionMarginJvmConverter.convert(it)))
        },
    			)
    		)
    		.addMethod(
    			ServerCalls.unaryServerMethodDefinition(
    				context = this.context,
    				descriptor = rewardsOptOutDescriptor,
    				implementation = {
        MsgRewardsOptOutResponseJvmConverter.convert(rewardsOptOut(MsgRewardsOptOutJvmConverter.convert(it)))
        },
    			)
    		)
    		.addMethod(
    			ServerCalls.unaryServerMethodDefinition(
    				context = this.context,
    				descriptor = adminUpdateBinaryOptionsMarketDescriptor,
    				implementation = {
        MsgAdminUpdateBinaryOptionsMarketResponseJvmConverter.convert(adminUpdateBinaryOptionsMarket(MsgAdminUpdateBinaryOptionsMarketJvmConverter.convert(it)))
        },
    			)
    		)
    		.addMethod(
    			ServerCalls.unaryServerMethodDefinition(
    				context = this.context,
    				descriptor = reclaimLockedFundsDescriptor,
    				implementation = {
        MsgReclaimLockedFundsResponseJvmConverter.convert(reclaimLockedFunds(MsgReclaimLockedFundsJvmConverter.convert(it)))
        },
    			)
    		)
    		.addMethod(
    			ServerCalls.unaryServerMethodDefinition(
    				context = this.context,
    				descriptor = updateParamsDescriptor,
    				implementation = {
        MsgUpdateParamsResponseJvmConverter.convert(updateParams(MsgUpdateParamsJvmConverter.convert(it)))
        },
    			)
    		)
    		.build()
  }

  public open class Client(
    private val option: ClientOption,
  ) : AbstractCoroutineStub<Msg.Client>(channel = option.channel, callOptions = option.callOptions),
      Msg.Interface {
    public override fun build(channel: Channel, callOptions: CallOptions): Msg.Client =
        Msg.Client(ClientOption(channel, callOptions))

    public override suspend fun deposit(request: MsgDeposit): MsgDepositResponse = deposit(request,
        Metadata())

    public suspend fun deposit(request: MsgDeposit, metadata: Metadata): MsgDepositResponse =
        MsgDepositResponseJvmConverter.convert(
    		ClientCalls.unaryRpc(
    			option.channel, depositDescriptor,
    			MsgDepositJvmConverter.convert(request),
    			option.callOptions, metadata,
    		),
    	)

    public override suspend fun withdraw(request: MsgWithdraw): MsgWithdrawResponse =
        withdraw(request, Metadata())

    public suspend fun withdraw(request: MsgWithdraw, metadata: Metadata): MsgWithdrawResponse =
        MsgWithdrawResponseJvmConverter.convert(
    		ClientCalls.unaryRpc(
    			option.channel, withdrawDescriptor,
    			MsgWithdrawJvmConverter.convert(request),
    			option.callOptions, metadata,
    		),
    	)

    public override suspend fun instantSpotMarketLaunch(request: MsgInstantSpotMarketLaunch):
        MsgInstantSpotMarketLaunchResponse = instantSpotMarketLaunch(request, Metadata())

    public suspend fun instantSpotMarketLaunch(request: MsgInstantSpotMarketLaunch,
        metadata: Metadata): MsgInstantSpotMarketLaunchResponse =
        MsgInstantSpotMarketLaunchResponseJvmConverter.convert(
    		ClientCalls.unaryRpc(
    			option.channel, instantSpotMarketLaunchDescriptor,
    			MsgInstantSpotMarketLaunchJvmConverter.convert(request),
    			option.callOptions, metadata,
    		),
    	)

    public override suspend
        fun instantPerpetualMarketLaunch(request: MsgInstantPerpetualMarketLaunch):
        MsgInstantPerpetualMarketLaunchResponse = instantPerpetualMarketLaunch(request, Metadata())

    public suspend fun instantPerpetualMarketLaunch(request: MsgInstantPerpetualMarketLaunch,
        metadata: Metadata): MsgInstantPerpetualMarketLaunchResponse =
        MsgInstantPerpetualMarketLaunchResponseJvmConverter.convert(
    		ClientCalls.unaryRpc(
    			option.channel, instantPerpetualMarketLaunchDescriptor,
    			MsgInstantPerpetualMarketLaunchJvmConverter.convert(request),
    			option.callOptions, metadata,
    		),
    	)

    public override suspend
        fun instantExpiryFuturesMarketLaunch(request: MsgInstantExpiryFuturesMarketLaunch):
        MsgInstantExpiryFuturesMarketLaunchResponse = instantExpiryFuturesMarketLaunch(request,
        Metadata())

    public suspend
        fun instantExpiryFuturesMarketLaunch(request: MsgInstantExpiryFuturesMarketLaunch,
        metadata: Metadata): MsgInstantExpiryFuturesMarketLaunchResponse =
        MsgInstantExpiryFuturesMarketLaunchResponseJvmConverter.convert(
    		ClientCalls.unaryRpc(
    			option.channel, instantExpiryFuturesMarketLaunchDescriptor,
    			MsgInstantExpiryFuturesMarketLaunchJvmConverter.convert(request),
    			option.callOptions, metadata,
    		),
    	)

    public override suspend fun createSpotLimitOrder(request: MsgCreateSpotLimitOrder):
        MsgCreateSpotLimitOrderResponse = createSpotLimitOrder(request, Metadata())

    public suspend fun createSpotLimitOrder(request: MsgCreateSpotLimitOrder, metadata: Metadata):
        MsgCreateSpotLimitOrderResponse = MsgCreateSpotLimitOrderResponseJvmConverter.convert(
    		ClientCalls.unaryRpc(
    			option.channel, createSpotLimitOrderDescriptor,
    			MsgCreateSpotLimitOrderJvmConverter.convert(request),
    			option.callOptions, metadata,
    		),
    	)

    public override suspend fun batchCreateSpotLimitOrders(request: MsgBatchCreateSpotLimitOrders):
        MsgBatchCreateSpotLimitOrdersResponse = batchCreateSpotLimitOrders(request, Metadata())

    public suspend fun batchCreateSpotLimitOrders(request: MsgBatchCreateSpotLimitOrders,
        metadata: Metadata): MsgBatchCreateSpotLimitOrdersResponse =
        MsgBatchCreateSpotLimitOrdersResponseJvmConverter.convert(
    		ClientCalls.unaryRpc(
    			option.channel, batchCreateSpotLimitOrdersDescriptor,
    			MsgBatchCreateSpotLimitOrdersJvmConverter.convert(request),
    			option.callOptions, metadata,
    		),
    	)

    public override suspend fun createSpotMarketOrder(request: MsgCreateSpotMarketOrder):
        MsgCreateSpotMarketOrderResponse = createSpotMarketOrder(request, Metadata())

    public suspend fun createSpotMarketOrder(request: MsgCreateSpotMarketOrder, metadata: Metadata):
        MsgCreateSpotMarketOrderResponse = MsgCreateSpotMarketOrderResponseJvmConverter.convert(
    		ClientCalls.unaryRpc(
    			option.channel, createSpotMarketOrderDescriptor,
    			MsgCreateSpotMarketOrderJvmConverter.convert(request),
    			option.callOptions, metadata,
    		),
    	)

    public override suspend fun cancelSpotOrder(request: MsgCancelSpotOrder):
        MsgCancelSpotOrderResponse = cancelSpotOrder(request, Metadata())

    public suspend fun cancelSpotOrder(request: MsgCancelSpotOrder, metadata: Metadata):
        MsgCancelSpotOrderResponse = MsgCancelSpotOrderResponseJvmConverter.convert(
    		ClientCalls.unaryRpc(
    			option.channel, cancelSpotOrderDescriptor,
    			MsgCancelSpotOrderJvmConverter.convert(request),
    			option.callOptions, metadata,
    		),
    	)

    public override suspend fun batchCancelSpotOrders(request: MsgBatchCancelSpotOrders):
        MsgBatchCancelSpotOrdersResponse = batchCancelSpotOrders(request, Metadata())

    public suspend fun batchCancelSpotOrders(request: MsgBatchCancelSpotOrders, metadata: Metadata):
        MsgBatchCancelSpotOrdersResponse = MsgBatchCancelSpotOrdersResponseJvmConverter.convert(
    		ClientCalls.unaryRpc(
    			option.channel, batchCancelSpotOrdersDescriptor,
    			MsgBatchCancelSpotOrdersJvmConverter.convert(request),
    			option.callOptions, metadata,
    		),
    	)

    public override suspend fun batchUpdateOrders(request: MsgBatchUpdateOrders):
        MsgBatchUpdateOrdersResponse = batchUpdateOrders(request, Metadata())

    public suspend fun batchUpdateOrders(request: MsgBatchUpdateOrders, metadata: Metadata):
        MsgBatchUpdateOrdersResponse = MsgBatchUpdateOrdersResponseJvmConverter.convert(
    		ClientCalls.unaryRpc(
    			option.channel, batchUpdateOrdersDescriptor,
    			MsgBatchUpdateOrdersJvmConverter.convert(request),
    			option.callOptions, metadata,
    		),
    	)

    public override suspend fun privilegedExecuteContract(request: MsgPrivilegedExecuteContract):
        MsgPrivilegedExecuteContractResponse = privilegedExecuteContract(request, Metadata())

    public suspend fun privilegedExecuteContract(request: MsgPrivilegedExecuteContract,
        metadata: Metadata): MsgPrivilegedExecuteContractResponse =
        MsgPrivilegedExecuteContractResponseJvmConverter.convert(
    		ClientCalls.unaryRpc(
    			option.channel, privilegedExecuteContractDescriptor,
    			MsgPrivilegedExecuteContractJvmConverter.convert(request),
    			option.callOptions, metadata,
    		),
    	)

    public override suspend fun createDerivativeLimitOrder(request: MsgCreateDerivativeLimitOrder):
        MsgCreateDerivativeLimitOrderResponse = createDerivativeLimitOrder(request, Metadata())

    public suspend fun createDerivativeLimitOrder(request: MsgCreateDerivativeLimitOrder,
        metadata: Metadata): MsgCreateDerivativeLimitOrderResponse =
        MsgCreateDerivativeLimitOrderResponseJvmConverter.convert(
    		ClientCalls.unaryRpc(
    			option.channel, createDerivativeLimitOrderDescriptor,
    			MsgCreateDerivativeLimitOrderJvmConverter.convert(request),
    			option.callOptions, metadata,
    		),
    	)

    public override suspend
        fun batchCreateDerivativeLimitOrders(request: MsgBatchCreateDerivativeLimitOrders):
        MsgBatchCreateDerivativeLimitOrdersResponse = batchCreateDerivativeLimitOrders(request,
        Metadata())

    public suspend
        fun batchCreateDerivativeLimitOrders(request: MsgBatchCreateDerivativeLimitOrders,
        metadata: Metadata): MsgBatchCreateDerivativeLimitOrdersResponse =
        MsgBatchCreateDerivativeLimitOrdersResponseJvmConverter.convert(
    		ClientCalls.unaryRpc(
    			option.channel, batchCreateDerivativeLimitOrdersDescriptor,
    			MsgBatchCreateDerivativeLimitOrdersJvmConverter.convert(request),
    			option.callOptions, metadata,
    		),
    	)

    public override suspend
        fun createDerivativeMarketOrder(request: MsgCreateDerivativeMarketOrder):
        MsgCreateDerivativeMarketOrderResponse = createDerivativeMarketOrder(request, Metadata())

    public suspend fun createDerivativeMarketOrder(request: MsgCreateDerivativeMarketOrder,
        metadata: Metadata): MsgCreateDerivativeMarketOrderResponse =
        MsgCreateDerivativeMarketOrderResponseJvmConverter.convert(
    		ClientCalls.unaryRpc(
    			option.channel, createDerivativeMarketOrderDescriptor,
    			MsgCreateDerivativeMarketOrderJvmConverter.convert(request),
    			option.callOptions, metadata,
    		),
    	)

    public override suspend fun cancelDerivativeOrder(request: MsgCancelDerivativeOrder):
        MsgCancelDerivativeOrderResponse = cancelDerivativeOrder(request, Metadata())

    public suspend fun cancelDerivativeOrder(request: MsgCancelDerivativeOrder, metadata: Metadata):
        MsgCancelDerivativeOrderResponse = MsgCancelDerivativeOrderResponseJvmConverter.convert(
    		ClientCalls.unaryRpc(
    			option.channel, cancelDerivativeOrderDescriptor,
    			MsgCancelDerivativeOrderJvmConverter.convert(request),
    			option.callOptions, metadata,
    		),
    	)

    public override suspend
        fun batchCancelDerivativeOrders(request: MsgBatchCancelDerivativeOrders):
        MsgBatchCancelDerivativeOrdersResponse = batchCancelDerivativeOrders(request, Metadata())

    public suspend fun batchCancelDerivativeOrders(request: MsgBatchCancelDerivativeOrders,
        metadata: Metadata): MsgBatchCancelDerivativeOrdersResponse =
        MsgBatchCancelDerivativeOrdersResponseJvmConverter.convert(
    		ClientCalls.unaryRpc(
    			option.channel, batchCancelDerivativeOrdersDescriptor,
    			MsgBatchCancelDerivativeOrdersJvmConverter.convert(request),
    			option.callOptions, metadata,
    		),
    	)

    public override suspend
        fun instantBinaryOptionsMarketLaunch(request: MsgInstantBinaryOptionsMarketLaunch):
        MsgInstantBinaryOptionsMarketLaunchResponse = instantBinaryOptionsMarketLaunch(request,
        Metadata())

    public suspend
        fun instantBinaryOptionsMarketLaunch(request: MsgInstantBinaryOptionsMarketLaunch,
        metadata: Metadata): MsgInstantBinaryOptionsMarketLaunchResponse =
        MsgInstantBinaryOptionsMarketLaunchResponseJvmConverter.convert(
    		ClientCalls.unaryRpc(
    			option.channel, instantBinaryOptionsMarketLaunchDescriptor,
    			MsgInstantBinaryOptionsMarketLaunchJvmConverter.convert(request),
    			option.callOptions, metadata,
    		),
    	)

    public override suspend
        fun createBinaryOptionsLimitOrder(request: MsgCreateBinaryOptionsLimitOrder):
        MsgCreateBinaryOptionsLimitOrderResponse = createBinaryOptionsLimitOrder(request,
        Metadata())

    public suspend fun createBinaryOptionsLimitOrder(request: MsgCreateBinaryOptionsLimitOrder,
        metadata: Metadata): MsgCreateBinaryOptionsLimitOrderResponse =
        MsgCreateBinaryOptionsLimitOrderResponseJvmConverter.convert(
    		ClientCalls.unaryRpc(
    			option.channel, createBinaryOptionsLimitOrderDescriptor,
    			MsgCreateBinaryOptionsLimitOrderJvmConverter.convert(request),
    			option.callOptions, metadata,
    		),
    	)

    public override suspend
        fun createBinaryOptionsMarketOrder(request: MsgCreateBinaryOptionsMarketOrder):
        MsgCreateBinaryOptionsMarketOrderResponse = createBinaryOptionsMarketOrder(request,
        Metadata())

    public suspend fun createBinaryOptionsMarketOrder(request: MsgCreateBinaryOptionsMarketOrder,
        metadata: Metadata): MsgCreateBinaryOptionsMarketOrderResponse =
        MsgCreateBinaryOptionsMarketOrderResponseJvmConverter.convert(
    		ClientCalls.unaryRpc(
    			option.channel, createBinaryOptionsMarketOrderDescriptor,
    			MsgCreateBinaryOptionsMarketOrderJvmConverter.convert(request),
    			option.callOptions, metadata,
    		),
    	)

    public override suspend fun cancelBinaryOptionsOrder(request: MsgCancelBinaryOptionsOrder):
        MsgCancelBinaryOptionsOrderResponse = cancelBinaryOptionsOrder(request, Metadata())

    public suspend fun cancelBinaryOptionsOrder(request: MsgCancelBinaryOptionsOrder,
        metadata: Metadata): MsgCancelBinaryOptionsOrderResponse =
        MsgCancelBinaryOptionsOrderResponseJvmConverter.convert(
    		ClientCalls.unaryRpc(
    			option.channel, cancelBinaryOptionsOrderDescriptor,
    			MsgCancelBinaryOptionsOrderJvmConverter.convert(request),
    			option.callOptions, metadata,
    		),
    	)

    public override suspend
        fun batchCancelBinaryOptionsOrders(request: MsgBatchCancelBinaryOptionsOrders):
        MsgBatchCancelBinaryOptionsOrdersResponse = batchCancelBinaryOptionsOrders(request,
        Metadata())

    public suspend fun batchCancelBinaryOptionsOrders(request: MsgBatchCancelBinaryOptionsOrders,
        metadata: Metadata): MsgBatchCancelBinaryOptionsOrdersResponse =
        MsgBatchCancelBinaryOptionsOrdersResponseJvmConverter.convert(
    		ClientCalls.unaryRpc(
    			option.channel, batchCancelBinaryOptionsOrdersDescriptor,
    			MsgBatchCancelBinaryOptionsOrdersJvmConverter.convert(request),
    			option.callOptions, metadata,
    		),
    	)

    public override suspend fun subaccountTransfer(request: MsgSubaccountTransfer):
        MsgSubaccountTransferResponse = subaccountTransfer(request, Metadata())

    public suspend fun subaccountTransfer(request: MsgSubaccountTransfer, metadata: Metadata):
        MsgSubaccountTransferResponse = MsgSubaccountTransferResponseJvmConverter.convert(
    		ClientCalls.unaryRpc(
    			option.channel, subaccountTransferDescriptor,
    			MsgSubaccountTransferJvmConverter.convert(request),
    			option.callOptions, metadata,
    		),
    	)

    public override suspend fun externalTransfer(request: MsgExternalTransfer):
        MsgExternalTransferResponse = externalTransfer(request, Metadata())

    public suspend fun externalTransfer(request: MsgExternalTransfer, metadata: Metadata):
        MsgExternalTransferResponse = MsgExternalTransferResponseJvmConverter.convert(
    		ClientCalls.unaryRpc(
    			option.channel, externalTransferDescriptor,
    			MsgExternalTransferJvmConverter.convert(request),
    			option.callOptions, metadata,
    		),
    	)

    public override suspend fun liquidatePosition(request: MsgLiquidatePosition):
        MsgLiquidatePositionResponse = liquidatePosition(request, Metadata())

    public suspend fun liquidatePosition(request: MsgLiquidatePosition, metadata: Metadata):
        MsgLiquidatePositionResponse = MsgLiquidatePositionResponseJvmConverter.convert(
    		ClientCalls.unaryRpc(
    			option.channel, liquidatePositionDescriptor,
    			MsgLiquidatePositionJvmConverter.convert(request),
    			option.callOptions, metadata,
    		),
    	)

    public override suspend fun emergencySettleMarket(request: MsgEmergencySettleMarket):
        MsgEmergencySettleMarketResponse = emergencySettleMarket(request, Metadata())

    public suspend fun emergencySettleMarket(request: MsgEmergencySettleMarket, metadata: Metadata):
        MsgEmergencySettleMarketResponse = MsgEmergencySettleMarketResponseJvmConverter.convert(
    		ClientCalls.unaryRpc(
    			option.channel, emergencySettleMarketDescriptor,
    			MsgEmergencySettleMarketJvmConverter.convert(request),
    			option.callOptions, metadata,
    		),
    	)

    public override suspend fun increasePositionMargin(request: MsgIncreasePositionMargin):
        MsgIncreasePositionMarginResponse = increasePositionMargin(request, Metadata())

    public suspend fun increasePositionMargin(request: MsgIncreasePositionMargin,
        metadata: Metadata): MsgIncreasePositionMarginResponse =
        MsgIncreasePositionMarginResponseJvmConverter.convert(
    		ClientCalls.unaryRpc(
    			option.channel, increasePositionMarginDescriptor,
    			MsgIncreasePositionMarginJvmConverter.convert(request),
    			option.callOptions, metadata,
    		),
    	)

    public override suspend fun rewardsOptOut(request: MsgRewardsOptOut): MsgRewardsOptOutResponse =
        rewardsOptOut(request, Metadata())

    public suspend fun rewardsOptOut(request: MsgRewardsOptOut, metadata: Metadata):
        MsgRewardsOptOutResponse = MsgRewardsOptOutResponseJvmConverter.convert(
    		ClientCalls.unaryRpc(
    			option.channel, rewardsOptOutDescriptor,
    			MsgRewardsOptOutJvmConverter.convert(request),
    			option.callOptions, metadata,
    		),
    	)

    public override suspend
        fun adminUpdateBinaryOptionsMarket(request: MsgAdminUpdateBinaryOptionsMarket):
        MsgAdminUpdateBinaryOptionsMarketResponse = adminUpdateBinaryOptionsMarket(request,
        Metadata())

    public suspend fun adminUpdateBinaryOptionsMarket(request: MsgAdminUpdateBinaryOptionsMarket,
        metadata: Metadata): MsgAdminUpdateBinaryOptionsMarketResponse =
        MsgAdminUpdateBinaryOptionsMarketResponseJvmConverter.convert(
    		ClientCalls.unaryRpc(
    			option.channel, adminUpdateBinaryOptionsMarketDescriptor,
    			MsgAdminUpdateBinaryOptionsMarketJvmConverter.convert(request),
    			option.callOptions, metadata,
    		),
    	)

    public override suspend fun reclaimLockedFunds(request: MsgReclaimLockedFunds):
        MsgReclaimLockedFundsResponse = reclaimLockedFunds(request, Metadata())

    public suspend fun reclaimLockedFunds(request: MsgReclaimLockedFunds, metadata: Metadata):
        MsgReclaimLockedFundsResponse = MsgReclaimLockedFundsResponseJvmConverter.convert(
    		ClientCalls.unaryRpc(
    			option.channel, reclaimLockedFundsDescriptor,
    			MsgReclaimLockedFundsJvmConverter.convert(request),
    			option.callOptions, metadata,
    		),
    	)

    public override suspend fun updateParams(request: MsgUpdateParams): MsgUpdateParamsResponse =
        updateParams(request, Metadata())

    public suspend fun updateParams(request: MsgUpdateParams, metadata: Metadata):
        MsgUpdateParamsResponse = MsgUpdateParamsResponseJvmConverter.convert(
    		ClientCalls.unaryRpc(
    			option.channel, updateParamsDescriptor,
    			MsgUpdateParamsJvmConverter.convert(request),
    			option.callOptions, metadata,
    		),
    	)
  }
}
