// Transform from injective/exchange/v1beta1/events.proto
@file:GeneratorVersion(version = "0.3.1")

package injective.exchange.v1beta1

import com.google.protobuf.ByteString
import com.google.protobuf.Descriptors
import com.google.protobuf.Parser
import cosmos.base.v1beta1.CoinJvmConverter
import kr.jadekim.protobuf.`annotation`.GeneratorVersion
import kr.jadekim.protobuf.converter.mapper.ProtobufTypeMapper
import kr.jadekim.protobuf.util.asJavaType
import kr.jadekim.protobuf.util.asKotlinType

public object EventBatchSpotExecutionJvmConverter :
    ProtobufTypeMapper<EventBatchSpotExecution, Events.EventBatchSpotExecution> {
  public override val descriptor: Descriptors.Descriptor =
      Events.EventBatchSpotExecution.getDescriptor()

  public override val parser: Parser<Events.EventBatchSpotExecution> =
      Events.EventBatchSpotExecution.parser()

  public override fun convert(obj: Events.EventBatchSpotExecution): EventBatchSpotExecution =
      EventBatchSpotExecution(
  	marketId = obj.getMarketId(),
  	isBuy = obj.getIsBuy(),
  	executionType = ExecutionType.forNumber(obj.getExecutionType().number),
  	trades = obj.getTradesList().map { TradeLogJvmConverter.convert(it) },
  )

  public override fun convert(obj: EventBatchSpotExecution): Events.EventBatchSpotExecution {
    val builder = Events.EventBatchSpotExecution.newBuilder()
    builder.setMarketId(obj.marketId)
    builder.setIsBuy(obj.isBuy)
    builder.setExecutionType(Exchange.ExecutionType.forNumber(obj.executionType.number))
    builder.addAllTrades(obj.trades.map { TradeLogJvmConverter.convert(it) })
    return builder.build()
  }
}

public object EventBatchDerivativeExecutionJvmConverter :
    ProtobufTypeMapper<EventBatchDerivativeExecution, Events.EventBatchDerivativeExecution> {
  public override val descriptor: Descriptors.Descriptor =
      Events.EventBatchDerivativeExecution.getDescriptor()

  public override val parser: Parser<Events.EventBatchDerivativeExecution> =
      Events.EventBatchDerivativeExecution.parser()

  public override fun convert(obj: Events.EventBatchDerivativeExecution):
      EventBatchDerivativeExecution = EventBatchDerivativeExecution(
  	marketId = obj.getMarketId(),
  	isBuy = obj.getIsBuy(),
  	isLiquidation = obj.getIsLiquidation(),
  	cumulativeFunding = obj.getCumulativeFunding(),
  	executionType = ExecutionType.forNumber(obj.getExecutionType().number),
  	trades = obj.getTradesList().map { DerivativeTradeLogJvmConverter.convert(it) },
  )

  public override fun convert(obj: EventBatchDerivativeExecution):
      Events.EventBatchDerivativeExecution {
    val builder = Events.EventBatchDerivativeExecution.newBuilder()
    builder.setMarketId(obj.marketId)
    builder.setIsBuy(obj.isBuy)
    builder.setIsLiquidation(obj.isLiquidation)
    builder.setCumulativeFunding(obj.cumulativeFunding)
    builder.setExecutionType(Exchange.ExecutionType.forNumber(obj.executionType.number))
    builder.addAllTrades(obj.trades.map { DerivativeTradeLogJvmConverter.convert(it) })
    return builder.build()
  }
}

public object EventLostFundsFromLiquidationJvmConverter :
    ProtobufTypeMapper<EventLostFundsFromLiquidation, Events.EventLostFundsFromLiquidation> {
  public override val descriptor: Descriptors.Descriptor =
      Events.EventLostFundsFromLiquidation.getDescriptor()

  public override val parser: Parser<Events.EventLostFundsFromLiquidation> =
      Events.EventLostFundsFromLiquidation.parser()

  public override fun convert(obj: Events.EventLostFundsFromLiquidation):
      EventLostFundsFromLiquidation = EventLostFundsFromLiquidation(
  	marketId = obj.getMarketId(),
  	subaccountId = obj.getSubaccountId().toByteArray(),
  	lostFundsFromAvailableDuringPayout = obj.getLostFundsFromAvailableDuringPayout(),
  	lostFundsFromOrderCancels = obj.getLostFundsFromOrderCancels(),
  )

  public override fun convert(obj: EventLostFundsFromLiquidation):
      Events.EventLostFundsFromLiquidation {
    val builder = Events.EventLostFundsFromLiquidation.newBuilder()
    builder.setMarketId(obj.marketId)
    builder.setSubaccountId(ByteString.copyFrom(obj.subaccountId))
    builder.setLostFundsFromAvailableDuringPayout(obj.lostFundsFromAvailableDuringPayout)
    builder.setLostFundsFromOrderCancels(obj.lostFundsFromOrderCancels)
    return builder.build()
  }
}

public object EventBatchDerivativePositionJvmConverter :
    ProtobufTypeMapper<EventBatchDerivativePosition, Events.EventBatchDerivativePosition> {
  public override val descriptor: Descriptors.Descriptor =
      Events.EventBatchDerivativePosition.getDescriptor()

  public override val parser: Parser<Events.EventBatchDerivativePosition> =
      Events.EventBatchDerivativePosition.parser()

  public override fun convert(obj: Events.EventBatchDerivativePosition):
      EventBatchDerivativePosition = EventBatchDerivativePosition(
  	marketId = obj.getMarketId(),
  	positions = obj.getPositionsList().map { SubaccountPositionJvmConverter.convert(it) },
  )

  public override fun convert(obj: EventBatchDerivativePosition):
      Events.EventBatchDerivativePosition {
    val builder = Events.EventBatchDerivativePosition.newBuilder()
    builder.setMarketId(obj.marketId)
    builder.addAllPositions(obj.positions.map { SubaccountPositionJvmConverter.convert(it) })
    return builder.build()
  }
}

public object EventDerivativeMarketPausedJvmConverter :
    ProtobufTypeMapper<EventDerivativeMarketPaused, Events.EventDerivativeMarketPaused> {
  public override val descriptor: Descriptors.Descriptor =
      Events.EventDerivativeMarketPaused.getDescriptor()

  public override val parser: Parser<Events.EventDerivativeMarketPaused> =
      Events.EventDerivativeMarketPaused.parser()

  public override fun convert(obj: Events.EventDerivativeMarketPaused): EventDerivativeMarketPaused
      = EventDerivativeMarketPaused(
  	marketId = obj.getMarketId(),
  	settlePrice = obj.getSettlePrice(),
  	totalMissingFunds = obj.getTotalMissingFunds(),
  	missingFundsRate = obj.getMissingFundsRate(),
  )

  public override fun convert(obj: EventDerivativeMarketPaused):
      Events.EventDerivativeMarketPaused {
    val builder = Events.EventDerivativeMarketPaused.newBuilder()
    builder.setMarketId(obj.marketId)
    builder.setSettlePrice(obj.settlePrice)
    builder.setTotalMissingFunds(obj.totalMissingFunds)
    builder.setMissingFundsRate(obj.missingFundsRate)
    return builder.build()
  }
}

public object EventMarketBeyondBankruptcyJvmConverter :
    ProtobufTypeMapper<EventMarketBeyondBankruptcy, Events.EventMarketBeyondBankruptcy> {
  public override val descriptor: Descriptors.Descriptor =
      Events.EventMarketBeyondBankruptcy.getDescriptor()

  public override val parser: Parser<Events.EventMarketBeyondBankruptcy> =
      Events.EventMarketBeyondBankruptcy.parser()

  public override fun convert(obj: Events.EventMarketBeyondBankruptcy): EventMarketBeyondBankruptcy
      = EventMarketBeyondBankruptcy(
  	marketId = obj.getMarketId(),
  	settlePrice = obj.getSettlePrice(),
  	missingMarketFunds = obj.getMissingMarketFunds(),
  )

  public override fun convert(obj: EventMarketBeyondBankruptcy):
      Events.EventMarketBeyondBankruptcy {
    val builder = Events.EventMarketBeyondBankruptcy.newBuilder()
    builder.setMarketId(obj.marketId)
    builder.setSettlePrice(obj.settlePrice)
    builder.setMissingMarketFunds(obj.missingMarketFunds)
    return builder.build()
  }
}

public object EventAllPositionsHaircutJvmConverter :
    ProtobufTypeMapper<EventAllPositionsHaircut, Events.EventAllPositionsHaircut> {
  public override val descriptor: Descriptors.Descriptor =
      Events.EventAllPositionsHaircut.getDescriptor()

  public override val parser: Parser<Events.EventAllPositionsHaircut> =
      Events.EventAllPositionsHaircut.parser()

  public override fun convert(obj: Events.EventAllPositionsHaircut): EventAllPositionsHaircut =
      EventAllPositionsHaircut(
  	marketId = obj.getMarketId(),
  	settlePrice = obj.getSettlePrice(),
  	missingFundsRate = obj.getMissingFundsRate(),
  )

  public override fun convert(obj: EventAllPositionsHaircut): Events.EventAllPositionsHaircut {
    val builder = Events.EventAllPositionsHaircut.newBuilder()
    builder.setMarketId(obj.marketId)
    builder.setSettlePrice(obj.settlePrice)
    builder.setMissingFundsRate(obj.missingFundsRate)
    return builder.build()
  }
}

public object EventBinaryOptionsMarketUpdateJvmConverter :
    ProtobufTypeMapper<EventBinaryOptionsMarketUpdate, Events.EventBinaryOptionsMarketUpdate> {
  public override val descriptor: Descriptors.Descriptor =
      Events.EventBinaryOptionsMarketUpdate.getDescriptor()

  public override val parser: Parser<Events.EventBinaryOptionsMarketUpdate> =
      Events.EventBinaryOptionsMarketUpdate.parser()

  public override fun convert(obj: Events.EventBinaryOptionsMarketUpdate):
      EventBinaryOptionsMarketUpdate = EventBinaryOptionsMarketUpdate(
  	market = BinaryOptionsMarketJvmConverter.convert(obj.getMarket()),
  )

  public override fun convert(obj: EventBinaryOptionsMarketUpdate):
      Events.EventBinaryOptionsMarketUpdate {
    val builder = Events.EventBinaryOptionsMarketUpdate.newBuilder()
    builder.setMarket(BinaryOptionsMarketJvmConverter.convert(obj.market))
    return builder.build()
  }
}

public object EventNewSpotOrdersJvmConverter :
    ProtobufTypeMapper<EventNewSpotOrders, Events.EventNewSpotOrders> {
  public override val descriptor: Descriptors.Descriptor = Events.EventNewSpotOrders.getDescriptor()

  public override val parser: Parser<Events.EventNewSpotOrders> = Events.EventNewSpotOrders.parser()

  public override fun convert(obj: Events.EventNewSpotOrders): EventNewSpotOrders =
      EventNewSpotOrders(
  	marketId = obj.getMarketId(),
  	buyOrders = obj.getBuyOrdersList().map { SpotLimitOrderJvmConverter.convert(it) },
  	sellOrders = obj.getSellOrdersList().map { SpotLimitOrderJvmConverter.convert(it) },
  )

  public override fun convert(obj: EventNewSpotOrders): Events.EventNewSpotOrders {
    val builder = Events.EventNewSpotOrders.newBuilder()
    builder.setMarketId(obj.marketId)
    builder.addAllBuyOrders(obj.buyOrders.map { SpotLimitOrderJvmConverter.convert(it) })
    builder.addAllSellOrders(obj.sellOrders.map { SpotLimitOrderJvmConverter.convert(it) })
    return builder.build()
  }
}

public object EventNewDerivativeOrdersJvmConverter :
    ProtobufTypeMapper<EventNewDerivativeOrders, Events.EventNewDerivativeOrders> {
  public override val descriptor: Descriptors.Descriptor =
      Events.EventNewDerivativeOrders.getDescriptor()

  public override val parser: Parser<Events.EventNewDerivativeOrders> =
      Events.EventNewDerivativeOrders.parser()

  public override fun convert(obj: Events.EventNewDerivativeOrders): EventNewDerivativeOrders =
      EventNewDerivativeOrders(
  	marketId = obj.getMarketId(),
  	buyOrders = obj.getBuyOrdersList().map { DerivativeLimitOrderJvmConverter.convert(it) },
  	sellOrders = obj.getSellOrdersList().map { DerivativeLimitOrderJvmConverter.convert(it) },
  )

  public override fun convert(obj: EventNewDerivativeOrders): Events.EventNewDerivativeOrders {
    val builder = Events.EventNewDerivativeOrders.newBuilder()
    builder.setMarketId(obj.marketId)
    builder.addAllBuyOrders(obj.buyOrders.map { DerivativeLimitOrderJvmConverter.convert(it) })
    builder.addAllSellOrders(obj.sellOrders.map { DerivativeLimitOrderJvmConverter.convert(it) })
    return builder.build()
  }
}

public object EventCancelSpotOrderJvmConverter :
    ProtobufTypeMapper<EventCancelSpotOrder, Events.EventCancelSpotOrder> {
  public override val descriptor: Descriptors.Descriptor =
      Events.EventCancelSpotOrder.getDescriptor()

  public override val parser: Parser<Events.EventCancelSpotOrder> =
      Events.EventCancelSpotOrder.parser()

  public override fun convert(obj: Events.EventCancelSpotOrder): EventCancelSpotOrder =
      EventCancelSpotOrder(
  	marketId = obj.getMarketId(),
  	order = SpotLimitOrderJvmConverter.convert(obj.getOrder()),
  )

  public override fun convert(obj: EventCancelSpotOrder): Events.EventCancelSpotOrder {
    val builder = Events.EventCancelSpotOrder.newBuilder()
    builder.setMarketId(obj.marketId)
    builder.setOrder(SpotLimitOrderJvmConverter.convert(obj.order))
    return builder.build()
  }
}

public object EventSpotMarketUpdateJvmConverter :
    ProtobufTypeMapper<EventSpotMarketUpdate, Events.EventSpotMarketUpdate> {
  public override val descriptor: Descriptors.Descriptor =
      Events.EventSpotMarketUpdate.getDescriptor()

  public override val parser: Parser<Events.EventSpotMarketUpdate> =
      Events.EventSpotMarketUpdate.parser()

  public override fun convert(obj: Events.EventSpotMarketUpdate): EventSpotMarketUpdate =
      EventSpotMarketUpdate(
  	market = SpotMarketJvmConverter.convert(obj.getMarket()),
  )

  public override fun convert(obj: EventSpotMarketUpdate): Events.EventSpotMarketUpdate {
    val builder = Events.EventSpotMarketUpdate.newBuilder()
    builder.setMarket(SpotMarketJvmConverter.convert(obj.market))
    return builder.build()
  }
}

public object EventPerpetualMarketUpdateJvmConverter :
    ProtobufTypeMapper<EventPerpetualMarketUpdate, Events.EventPerpetualMarketUpdate> {
  public override val descriptor: Descriptors.Descriptor =
      Events.EventPerpetualMarketUpdate.getDescriptor()

  public override val parser: Parser<Events.EventPerpetualMarketUpdate> =
      Events.EventPerpetualMarketUpdate.parser()

  public override fun convert(obj: Events.EventPerpetualMarketUpdate): EventPerpetualMarketUpdate =
      EventPerpetualMarketUpdate(
  	market = DerivativeMarketJvmConverter.convert(obj.getMarket()),
  	perpetualMarketInfo = PerpetualMarketInfoJvmConverter.convert(obj.getPerpetualMarketInfo()),
  	funding = PerpetualMarketFundingJvmConverter.convert(obj.getFunding()),
  )

  public override fun convert(obj: EventPerpetualMarketUpdate): Events.EventPerpetualMarketUpdate {
    val builder = Events.EventPerpetualMarketUpdate.newBuilder()
    builder.setMarket(DerivativeMarketJvmConverter.convert(obj.market))
    builder.setPerpetualMarketInfo(PerpetualMarketInfoJvmConverter.convert(obj.perpetualMarketInfo))
    builder.setFunding(PerpetualMarketFundingJvmConverter.convert(obj.funding))
    return builder.build()
  }
}

public object EventExpiryFuturesMarketUpdateJvmConverter :
    ProtobufTypeMapper<EventExpiryFuturesMarketUpdate, Events.EventExpiryFuturesMarketUpdate> {
  public override val descriptor: Descriptors.Descriptor =
      Events.EventExpiryFuturesMarketUpdate.getDescriptor()

  public override val parser: Parser<Events.EventExpiryFuturesMarketUpdate> =
      Events.EventExpiryFuturesMarketUpdate.parser()

  public override fun convert(obj: Events.EventExpiryFuturesMarketUpdate):
      EventExpiryFuturesMarketUpdate = EventExpiryFuturesMarketUpdate(
  	market = DerivativeMarketJvmConverter.convert(obj.getMarket()),
  	expiryFuturesMarketInfo =
      ExpiryFuturesMarketInfoJvmConverter.convert(obj.getExpiryFuturesMarketInfo()),
  )

  public override fun convert(obj: EventExpiryFuturesMarketUpdate):
      Events.EventExpiryFuturesMarketUpdate {
    val builder = Events.EventExpiryFuturesMarketUpdate.newBuilder()
    builder.setMarket(DerivativeMarketJvmConverter.convert(obj.market))
    builder.setExpiryFuturesMarketInfo(ExpiryFuturesMarketInfoJvmConverter.convert(obj.expiryFuturesMarketInfo))
    return builder.build()
  }
}

public object EventPerpetualMarketFundingUpdateJvmConverter :
    ProtobufTypeMapper<EventPerpetualMarketFundingUpdate, Events.EventPerpetualMarketFundingUpdate>
    {
  public override val descriptor: Descriptors.Descriptor =
      Events.EventPerpetualMarketFundingUpdate.getDescriptor()

  public override val parser: Parser<Events.EventPerpetualMarketFundingUpdate> =
      Events.EventPerpetualMarketFundingUpdate.parser()

  public override fun convert(obj: Events.EventPerpetualMarketFundingUpdate):
      EventPerpetualMarketFundingUpdate = EventPerpetualMarketFundingUpdate(
  	marketId = obj.getMarketId(),
  	funding = PerpetualMarketFundingJvmConverter.convert(obj.getFunding()),
  	isHourlyFunding = obj.getIsHourlyFunding(),
  	fundingRate = obj.getFundingRate(),
  	markPrice = obj.getMarkPrice(),
  )

  public override fun convert(obj: EventPerpetualMarketFundingUpdate):
      Events.EventPerpetualMarketFundingUpdate {
    val builder = Events.EventPerpetualMarketFundingUpdate.newBuilder()
    builder.setMarketId(obj.marketId)
    builder.setFunding(PerpetualMarketFundingJvmConverter.convert(obj.funding))
    builder.setIsHourlyFunding(obj.isHourlyFunding)
    builder.setFundingRate(obj.fundingRate)
    builder.setMarkPrice(obj.markPrice)
    return builder.build()
  }
}

public object EventSubaccountDepositJvmConverter :
    ProtobufTypeMapper<EventSubaccountDeposit, Events.EventSubaccountDeposit> {
  public override val descriptor: Descriptors.Descriptor =
      Events.EventSubaccountDeposit.getDescriptor()

  public override val parser: Parser<Events.EventSubaccountDeposit> =
      Events.EventSubaccountDeposit.parser()

  public override fun convert(obj: Events.EventSubaccountDeposit): EventSubaccountDeposit =
      EventSubaccountDeposit(
  	srcAddress = obj.getSrcAddress(),
  	subaccountId = obj.getSubaccountId().toByteArray(),
  	amount = CoinJvmConverter.convert(obj.getAmount()),
  )

  public override fun convert(obj: EventSubaccountDeposit): Events.EventSubaccountDeposit {
    val builder = Events.EventSubaccountDeposit.newBuilder()
    builder.setSrcAddress(obj.srcAddress)
    builder.setSubaccountId(ByteString.copyFrom(obj.subaccountId))
    builder.setAmount(CoinJvmConverter.convert(obj.amount))
    return builder.build()
  }
}

public object EventSubaccountWithdrawJvmConverter :
    ProtobufTypeMapper<EventSubaccountWithdraw, Events.EventSubaccountWithdraw> {
  public override val descriptor: Descriptors.Descriptor =
      Events.EventSubaccountWithdraw.getDescriptor()

  public override val parser: Parser<Events.EventSubaccountWithdraw> =
      Events.EventSubaccountWithdraw.parser()

  public override fun convert(obj: Events.EventSubaccountWithdraw): EventSubaccountWithdraw =
      EventSubaccountWithdraw(
  	subaccountId = obj.getSubaccountId().toByteArray(),
  	dstAddress = obj.getDstAddress(),
  	amount = CoinJvmConverter.convert(obj.getAmount()),
  )

  public override fun convert(obj: EventSubaccountWithdraw): Events.EventSubaccountWithdraw {
    val builder = Events.EventSubaccountWithdraw.newBuilder()
    builder.setSubaccountId(ByteString.copyFrom(obj.subaccountId))
    builder.setDstAddress(obj.dstAddress)
    builder.setAmount(CoinJvmConverter.convert(obj.amount))
    return builder.build()
  }
}

public object EventSubaccountBalanceTransferJvmConverter :
    ProtobufTypeMapper<EventSubaccountBalanceTransfer, Events.EventSubaccountBalanceTransfer> {
  public override val descriptor: Descriptors.Descriptor =
      Events.EventSubaccountBalanceTransfer.getDescriptor()

  public override val parser: Parser<Events.EventSubaccountBalanceTransfer> =
      Events.EventSubaccountBalanceTransfer.parser()

  public override fun convert(obj: Events.EventSubaccountBalanceTransfer):
      EventSubaccountBalanceTransfer = EventSubaccountBalanceTransfer(
  	srcSubaccountId = obj.getSrcSubaccountId(),
  	dstSubaccountId = obj.getDstSubaccountId(),
  	amount = CoinJvmConverter.convert(obj.getAmount()),
  )

  public override fun convert(obj: EventSubaccountBalanceTransfer):
      Events.EventSubaccountBalanceTransfer {
    val builder = Events.EventSubaccountBalanceTransfer.newBuilder()
    builder.setSrcSubaccountId(obj.srcSubaccountId)
    builder.setDstSubaccountId(obj.dstSubaccountId)
    builder.setAmount(CoinJvmConverter.convert(obj.amount))
    return builder.build()
  }
}

public object EventBatchDepositUpdateJvmConverter :
    ProtobufTypeMapper<EventBatchDepositUpdate, Events.EventBatchDepositUpdate> {
  public override val descriptor: Descriptors.Descriptor =
      Events.EventBatchDepositUpdate.getDescriptor()

  public override val parser: Parser<Events.EventBatchDepositUpdate> =
      Events.EventBatchDepositUpdate.parser()

  public override fun convert(obj: Events.EventBatchDepositUpdate): EventBatchDepositUpdate =
      EventBatchDepositUpdate(
  	depositUpdates = obj.getDepositUpdatesList().map { DepositUpdateJvmConverter.convert(it) },
  )

  public override fun convert(obj: EventBatchDepositUpdate): Events.EventBatchDepositUpdate {
    val builder = Events.EventBatchDepositUpdate.newBuilder()
    builder.addAllDepositUpdates(obj.depositUpdates.map { DepositUpdateJvmConverter.convert(it) })
    return builder.build()
  }
}

public object DerivativeMarketOrderCancelJvmConverter :
    ProtobufTypeMapper<DerivativeMarketOrderCancel, Events.DerivativeMarketOrderCancel> {
  public override val descriptor: Descriptors.Descriptor =
      Events.DerivativeMarketOrderCancel.getDescriptor()

  public override val parser: Parser<Events.DerivativeMarketOrderCancel> =
      Events.DerivativeMarketOrderCancel.parser()

  public override fun convert(obj: Events.DerivativeMarketOrderCancel): DerivativeMarketOrderCancel
      = DerivativeMarketOrderCancel(
  	marketOrder = DerivativeMarketOrderJvmConverter.convert(obj.getMarketOrder()),
  	cancelQuantity = obj.getCancelQuantity(),
  )

  public override fun convert(obj: DerivativeMarketOrderCancel):
      Events.DerivativeMarketOrderCancel {
    val builder = Events.DerivativeMarketOrderCancel.newBuilder()
    builder.setMarketOrder(DerivativeMarketOrderJvmConverter.convert(obj.marketOrder))
    builder.setCancelQuantity(obj.cancelQuantity)
    return builder.build()
  }
}

public object EventCancelDerivativeOrderJvmConverter :
    ProtobufTypeMapper<EventCancelDerivativeOrder, Events.EventCancelDerivativeOrder> {
  public override val descriptor: Descriptors.Descriptor =
      Events.EventCancelDerivativeOrder.getDescriptor()

  public override val parser: Parser<Events.EventCancelDerivativeOrder> =
      Events.EventCancelDerivativeOrder.parser()

  public override fun convert(obj: Events.EventCancelDerivativeOrder): EventCancelDerivativeOrder =
      EventCancelDerivativeOrder(
  	marketId = obj.getMarketId(),
  	isLimitCancel = obj.getIsLimitCancel(),
  	limitOrder = DerivativeLimitOrderJvmConverter.convert(obj.getLimitOrder()),
  	marketOrderCancel = DerivativeMarketOrderCancelJvmConverter.convert(obj.getMarketOrderCancel()),
  )

  public override fun convert(obj: EventCancelDerivativeOrder): Events.EventCancelDerivativeOrder {
    val builder = Events.EventCancelDerivativeOrder.newBuilder()
    builder.setMarketId(obj.marketId)
    builder.setIsLimitCancel(obj.isLimitCancel)
    builder.setLimitOrder(DerivativeLimitOrderJvmConverter.convert(obj.limitOrder))
    builder.setMarketOrderCancel(DerivativeMarketOrderCancelJvmConverter.convert(obj.marketOrderCancel))
    return builder.build()
  }
}

public object EventFeeDiscountScheduleJvmConverter :
    ProtobufTypeMapper<EventFeeDiscountSchedule, Events.EventFeeDiscountSchedule> {
  public override val descriptor: Descriptors.Descriptor =
      Events.EventFeeDiscountSchedule.getDescriptor()

  public override val parser: Parser<Events.EventFeeDiscountSchedule> =
      Events.EventFeeDiscountSchedule.parser()

  public override fun convert(obj: Events.EventFeeDiscountSchedule): EventFeeDiscountSchedule =
      EventFeeDiscountSchedule(
  	schedule = FeeDiscountScheduleJvmConverter.convert(obj.getSchedule()),
  )

  public override fun convert(obj: EventFeeDiscountSchedule): Events.EventFeeDiscountSchedule {
    val builder = Events.EventFeeDiscountSchedule.newBuilder()
    builder.setSchedule(FeeDiscountScheduleJvmConverter.convert(obj.schedule))
    return builder.build()
  }
}

public object EventTradingRewardCampaignUpdateJvmConverter :
    ProtobufTypeMapper<EventTradingRewardCampaignUpdate, Events.EventTradingRewardCampaignUpdate> {
  public override val descriptor: Descriptors.Descriptor =
      Events.EventTradingRewardCampaignUpdate.getDescriptor()

  public override val parser: Parser<Events.EventTradingRewardCampaignUpdate> =
      Events.EventTradingRewardCampaignUpdate.parser()

  public override fun convert(obj: Events.EventTradingRewardCampaignUpdate):
      EventTradingRewardCampaignUpdate = EventTradingRewardCampaignUpdate(
  	campaignInfo = TradingRewardCampaignInfoJvmConverter.convert(obj.getCampaignInfo()),
  	campaignRewardPools = obj.getCampaignRewardPoolsList().map {
      CampaignRewardPoolJvmConverter.convert(it) },
  )

  public override fun convert(obj: EventTradingRewardCampaignUpdate):
      Events.EventTradingRewardCampaignUpdate {
    val builder = Events.EventTradingRewardCampaignUpdate.newBuilder()
    builder.setCampaignInfo(TradingRewardCampaignInfoJvmConverter.convert(obj.campaignInfo))
    builder.addAllCampaignRewardPools(obj.campaignRewardPools.map {
        CampaignRewardPoolJvmConverter.convert(it) })
    return builder.build()
  }
}

public object EventTradingRewardDistributionJvmConverter :
    ProtobufTypeMapper<EventTradingRewardDistribution, Events.EventTradingRewardDistribution> {
  public override val descriptor: Descriptors.Descriptor =
      Events.EventTradingRewardDistribution.getDescriptor()

  public override val parser: Parser<Events.EventTradingRewardDistribution> =
      Events.EventTradingRewardDistribution.parser()

  public override fun convert(obj: Events.EventTradingRewardDistribution):
      EventTradingRewardDistribution = EventTradingRewardDistribution(
  	accountRewards = obj.getAccountRewardsList().map { AccountRewardsJvmConverter.convert(it) },
  )

  public override fun convert(obj: EventTradingRewardDistribution):
      Events.EventTradingRewardDistribution {
    val builder = Events.EventTradingRewardDistribution.newBuilder()
    builder.addAllAccountRewards(obj.accountRewards.map { AccountRewardsJvmConverter.convert(it) })
    return builder.build()
  }
}

public object EventNewConditionalDerivativeOrderJvmConverter :
    ProtobufTypeMapper<EventNewConditionalDerivativeOrder, Events.EventNewConditionalDerivativeOrder>
    {
  public override val descriptor: Descriptors.Descriptor =
      Events.EventNewConditionalDerivativeOrder.getDescriptor()

  public override val parser: Parser<Events.EventNewConditionalDerivativeOrder> =
      Events.EventNewConditionalDerivativeOrder.parser()

  public override fun convert(obj: Events.EventNewConditionalDerivativeOrder):
      EventNewConditionalDerivativeOrder = EventNewConditionalDerivativeOrder(
  	marketId = obj.getMarketId(),
  	order = DerivativeOrderJvmConverter.convert(obj.getOrder()),
  	hash = obj.getHash().toByteArray(),
  	isMarket = obj.getIsMarket(),
  )

  public override fun convert(obj: EventNewConditionalDerivativeOrder):
      Events.EventNewConditionalDerivativeOrder {
    val builder = Events.EventNewConditionalDerivativeOrder.newBuilder()
    builder.setMarketId(obj.marketId)
    builder.setOrder(DerivativeOrderJvmConverter.convert(obj.order))
    builder.setHash(ByteString.copyFrom(obj.hash))
    builder.setIsMarket(obj.isMarket)
    return builder.build()
  }
}

public object EventCancelConditionalDerivativeOrderJvmConverter :
    ProtobufTypeMapper<EventCancelConditionalDerivativeOrder, Events.EventCancelConditionalDerivativeOrder>
    {
  public override val descriptor: Descriptors.Descriptor =
      Events.EventCancelConditionalDerivativeOrder.getDescriptor()

  public override val parser: Parser<Events.EventCancelConditionalDerivativeOrder> =
      Events.EventCancelConditionalDerivativeOrder.parser()

  public override fun convert(obj: Events.EventCancelConditionalDerivativeOrder):
      EventCancelConditionalDerivativeOrder = EventCancelConditionalDerivativeOrder(
  	marketId = obj.getMarketId(),
  	isLimitCancel = obj.getIsLimitCancel(),
  	limitOrder = DerivativeLimitOrderJvmConverter.convert(obj.getLimitOrder()),
  	marketOrder = DerivativeMarketOrderJvmConverter.convert(obj.getMarketOrder()),
  )

  public override fun convert(obj: EventCancelConditionalDerivativeOrder):
      Events.EventCancelConditionalDerivativeOrder {
    val builder = Events.EventCancelConditionalDerivativeOrder.newBuilder()
    builder.setMarketId(obj.marketId)
    builder.setIsLimitCancel(obj.isLimitCancel)
    builder.setLimitOrder(DerivativeLimitOrderJvmConverter.convert(obj.limitOrder))
    builder.setMarketOrder(DerivativeMarketOrderJvmConverter.convert(obj.marketOrder))
    return builder.build()
  }
}

public object EventConditionalDerivativeOrderTriggerJvmConverter :
    ProtobufTypeMapper<EventConditionalDerivativeOrderTrigger, Events.EventConditionalDerivativeOrderTrigger>
    {
  public override val descriptor: Descriptors.Descriptor =
      Events.EventConditionalDerivativeOrderTrigger.getDescriptor()

  public override val parser: Parser<Events.EventConditionalDerivativeOrderTrigger> =
      Events.EventConditionalDerivativeOrderTrigger.parser()

  public override fun convert(obj: Events.EventConditionalDerivativeOrderTrigger):
      EventConditionalDerivativeOrderTrigger = EventConditionalDerivativeOrderTrigger(
  	marketId = obj.getMarketId().toByteArray(),
  	isLimitTrigger = obj.getIsLimitTrigger(),
  	triggeredOrderHash = obj.getTriggeredOrderHash().toByteArray(),
  	placedOrderHash = obj.getPlacedOrderHash().toByteArray(),
  )

  public override fun convert(obj: EventConditionalDerivativeOrderTrigger):
      Events.EventConditionalDerivativeOrderTrigger {
    val builder = Events.EventConditionalDerivativeOrderTrigger.newBuilder()
    builder.setMarketId(ByteString.copyFrom(obj.marketId))
    builder.setIsLimitTrigger(obj.isLimitTrigger)
    builder.setTriggeredOrderHash(ByteString.copyFrom(obj.triggeredOrderHash))
    builder.setPlacedOrderHash(ByteString.copyFrom(obj.placedOrderHash))
    return builder.build()
  }
}

public object EventOrderFailJvmConverter : ProtobufTypeMapper<EventOrderFail, Events.EventOrderFail>
    {
  public override val descriptor: Descriptors.Descriptor = Events.EventOrderFail.getDescriptor()

  public override val parser: Parser<Events.EventOrderFail> = Events.EventOrderFail.parser()

  public override fun convert(obj: Events.EventOrderFail): EventOrderFail = EventOrderFail(
  	account = obj.getAccount().toByteArray(),
  	hashes = obj.getHashesList().map { it.toByteArray() },
  	flags = obj.getFlagsList().map { it.asKotlinType },
  )

  public override fun convert(obj: EventOrderFail): Events.EventOrderFail {
    val builder = Events.EventOrderFail.newBuilder()
    builder.setAccount(ByteString.copyFrom(obj.account))
    builder.addAllHashes(obj.hashes.map { ByteString.copyFrom(it) })
    builder.addAllFlags(obj.flags.map { it.asJavaType })
    return builder.build()
  }
}

public object EventAtomicMarketOrderFeeMultipliersUpdatedJvmConverter :
    ProtobufTypeMapper<EventAtomicMarketOrderFeeMultipliersUpdated, Events.EventAtomicMarketOrderFeeMultipliersUpdated>
    {
  public override val descriptor: Descriptors.Descriptor =
      Events.EventAtomicMarketOrderFeeMultipliersUpdated.getDescriptor()

  public override val parser: Parser<Events.EventAtomicMarketOrderFeeMultipliersUpdated> =
      Events.EventAtomicMarketOrderFeeMultipliersUpdated.parser()

  public override fun convert(obj: Events.EventAtomicMarketOrderFeeMultipliersUpdated):
      EventAtomicMarketOrderFeeMultipliersUpdated = EventAtomicMarketOrderFeeMultipliersUpdated(
  	marketFeeMultipliers = obj.getMarketFeeMultipliersList().map {
      MarketFeeMultiplierJvmConverter.convert(it) },
  )

  public override fun convert(obj: EventAtomicMarketOrderFeeMultipliersUpdated):
      Events.EventAtomicMarketOrderFeeMultipliersUpdated {
    val builder = Events.EventAtomicMarketOrderFeeMultipliersUpdated.newBuilder()
    builder.addAllMarketFeeMultipliers(obj.marketFeeMultipliers.map {
        MarketFeeMultiplierJvmConverter.convert(it) })
    return builder.build()
  }
}

public object EventOrderbookUpdateJvmConverter :
    ProtobufTypeMapper<EventOrderbookUpdate, Events.EventOrderbookUpdate> {
  public override val descriptor: Descriptors.Descriptor =
      Events.EventOrderbookUpdate.getDescriptor()

  public override val parser: Parser<Events.EventOrderbookUpdate> =
      Events.EventOrderbookUpdate.parser()

  public override fun convert(obj: Events.EventOrderbookUpdate): EventOrderbookUpdate =
      EventOrderbookUpdate(
  	spotUpdates = obj.getSpotUpdatesList().map { OrderbookUpdateJvmConverter.convert(it) },
  	derivativeUpdates = obj.getDerivativeUpdatesList().map { OrderbookUpdateJvmConverter.convert(it)
      },
  )

  public override fun convert(obj: EventOrderbookUpdate): Events.EventOrderbookUpdate {
    val builder = Events.EventOrderbookUpdate.newBuilder()
    builder.addAllSpotUpdates(obj.spotUpdates.map { OrderbookUpdateJvmConverter.convert(it) })
    builder.addAllDerivativeUpdates(obj.derivativeUpdates.map {
        OrderbookUpdateJvmConverter.convert(it) })
    return builder.build()
  }
}

public object OrderbookUpdateJvmConverter :
    ProtobufTypeMapper<OrderbookUpdate, Events.OrderbookUpdate> {
  public override val descriptor: Descriptors.Descriptor = Events.OrderbookUpdate.getDescriptor()

  public override val parser: Parser<Events.OrderbookUpdate> = Events.OrderbookUpdate.parser()

  public override fun convert(obj: Events.OrderbookUpdate): OrderbookUpdate = OrderbookUpdate(
  	seq = obj.getSeq().asKotlinType,
  	orderbook = OrderbookJvmConverter.convert(obj.getOrderbook()),
  )

  public override fun convert(obj: OrderbookUpdate): Events.OrderbookUpdate {
    val builder = Events.OrderbookUpdate.newBuilder()
    builder.setSeq(obj.seq.asJavaType)
    builder.setOrderbook(OrderbookJvmConverter.convert(obj.orderbook))
    return builder.build()
  }
}

public object OrderbookJvmConverter : ProtobufTypeMapper<Orderbook, Events.Orderbook> {
  public override val descriptor: Descriptors.Descriptor = Events.Orderbook.getDescriptor()

  public override val parser: Parser<Events.Orderbook> = Events.Orderbook.parser()

  public override fun convert(obj: Events.Orderbook): Orderbook = Orderbook(
  	marketId = obj.getMarketId().toByteArray(),
  	buyLevels = obj.getBuyLevelsList().map { LevelJvmConverter.convert(it) },
  	sellLevels = obj.getSellLevelsList().map { LevelJvmConverter.convert(it) },
  )

  public override fun convert(obj: Orderbook): Events.Orderbook {
    val builder = Events.Orderbook.newBuilder()
    builder.setMarketId(ByteString.copyFrom(obj.marketId))
    builder.addAllBuyLevels(obj.buyLevels.map { LevelJvmConverter.convert(it) })
    builder.addAllSellLevels(obj.sellLevels.map { LevelJvmConverter.convert(it) })
    return builder.build()
  }
}
