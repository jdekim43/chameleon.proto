// Transform from injective/exchange/v1beta1/genesis.proto
@file:GeneratorVersion(version = "0.3.1")

package injective.exchange.v1beta1

import com.google.protobuf.Descriptors
import com.google.protobuf.Parser
import kr.jadekim.protobuf.`annotation`.GeneratorVersion
import kr.jadekim.protobuf.converter.mapper.ProtobufTypeMapper
import kr.jadekim.protobuf.util.asJavaType
import kr.jadekim.protobuf.util.asKotlinType

public object GenesisStateJvmConverter : ProtobufTypeMapper<GenesisState, Genesis.GenesisState> {
  public override val descriptor: Descriptors.Descriptor = Genesis.GenesisState.getDescriptor()

  public override val parser: Parser<Genesis.GenesisState> = Genesis.GenesisState.parser()

  public override fun convert(obj: Genesis.GenesisState): GenesisState = GenesisState(
  	params = ParamsJvmConverter.convert(obj.getParams()),
  	spotMarkets = obj.getSpotMarketsList().map { SpotMarketJvmConverter.convert(it) },
  	derivativeMarkets = obj.getDerivativeMarketsList().map { DerivativeMarketJvmConverter.convert(it)
      },
  	spotOrderbook = obj.getSpotOrderbookList().map { SpotOrderBookJvmConverter.convert(it) },
  	derivativeOrderbook = obj.getDerivativeOrderbookList().map {
      DerivativeOrderBookJvmConverter.convert(it) },
  	balances = obj.getBalancesList().map { BalanceJvmConverter.convert(it) },
  	positions = obj.getPositionsList().map { DerivativePositionJvmConverter.convert(it) },
  	subaccountTradeNonces = obj.getSubaccountTradeNoncesList().map {
      SubaccountNonceJvmConverter.convert(it) },
  	expiryFuturesMarketInfoState = obj.getExpiryFuturesMarketInfoStateList().map {
      ExpiryFuturesMarketInfoStateJvmConverter.convert(it) },
  	perpetualMarketInfo = obj.getPerpetualMarketInfoList().map {
      PerpetualMarketInfoJvmConverter.convert(it) },
  	perpetualMarketFundingState = obj.getPerpetualMarketFundingStateList().map {
      PerpetualMarketFundingStateJvmConverter.convert(it) },
  	derivativeMarketSettlementScheduled = obj.getDerivativeMarketSettlementScheduledList().map {
      DerivativeMarketSettlementInfoJvmConverter.convert(it) },
  	isSpotExchangeEnabled = obj.getIsSpotExchangeEnabled(),
  	isDerivativesExchangeEnabled = obj.getIsDerivativesExchangeEnabled(),
  	tradingRewardCampaignInfo =
      TradingRewardCampaignInfoJvmConverter.convert(obj.getTradingRewardCampaignInfo()),
  	tradingRewardPoolCampaignSchedule = obj.getTradingRewardPoolCampaignScheduleList().map {
      CampaignRewardPoolJvmConverter.convert(it) },
  	tradingRewardCampaignAccountPoints = obj.getTradingRewardCampaignAccountPointsList().map {
      TradingRewardCampaignAccountPointsJvmConverter.convert(it) },
  	feeDiscountSchedule = FeeDiscountScheduleJvmConverter.convert(obj.getFeeDiscountSchedule()),
  	feeDiscountAccountTierTtl = obj.getFeeDiscountAccountTierTtlList().map {
      FeeDiscountAccountTierTTLJvmConverter.convert(it) },
  	feeDiscountBucketVolumeAccounts = obj.getFeeDiscountBucketVolumeAccountsList().map {
      FeeDiscountBucketVolumeAccountsJvmConverter.convert(it) },
  	isFirstFeeCycleFinished = obj.getIsFirstFeeCycleFinished(),
  	pendingTradingRewardPoolCampaignSchedule =
      obj.getPendingTradingRewardPoolCampaignScheduleList().map {
      CampaignRewardPoolJvmConverter.convert(it) },
  	pendingTradingRewardCampaignAccountPoints =
      obj.getPendingTradingRewardCampaignAccountPointsList().map {
      TradingRewardCampaignAccountPendingPointsJvmConverter.convert(it) },
  	rewardsOptOutAddresses = obj.getRewardsOptOutAddressesList().map { it },
  	historicalTradeRecords = obj.getHistoricalTradeRecordsList().map {
      TradeRecordsJvmConverter.convert(it) },
  	binaryOptionsMarkets = obj.getBinaryOptionsMarketsList().map {
      BinaryOptionsMarketJvmConverter.convert(it) },
  	binaryOptionsMarketIdsScheduledForSettlement =
      obj.getBinaryOptionsMarketIdsScheduledForSettlementList().map { it },
  	spotMarketIdsScheduledToForceClose = obj.getSpotMarketIdsScheduledToForceCloseList().map { it },
  	denomDecimals = obj.getDenomDecimalsList().map { DenomDecimalsJvmConverter.convert(it) },
  	conditionalDerivativeOrderbooks = obj.getConditionalDerivativeOrderbooksList().map {
      ConditionalDerivativeOrderBookJvmConverter.convert(it) },
  	marketFeeMultipliers = obj.getMarketFeeMultipliersList().map {
      MarketFeeMultiplierJvmConverter.convert(it) },
  	orderbookSequences = obj.getOrderbookSequencesList().map {
      OrderbookSequenceJvmConverter.convert(it) },
  	subaccountVolumes = obj.getSubaccountVolumesList().map {
      AggregateSubaccountVolumeRecordJvmConverter.convert(it) },
  	marketVolumes = obj.getMarketVolumesList().map { MarketVolumeJvmConverter.convert(it) },
  )

  public override fun convert(obj: GenesisState): Genesis.GenesisState {
    val builder = Genesis.GenesisState.newBuilder()
    builder.setParams(ParamsJvmConverter.convert(obj.params))
    builder.addAllSpotMarkets(obj.spotMarkets.map { SpotMarketJvmConverter.convert(it) })
    builder.addAllDerivativeMarkets(obj.derivativeMarkets.map {
        DerivativeMarketJvmConverter.convert(it) })
    builder.addAllSpotOrderbook(obj.spotOrderbook.map { SpotOrderBookJvmConverter.convert(it) })
    builder.addAllDerivativeOrderbook(obj.derivativeOrderbook.map {
        DerivativeOrderBookJvmConverter.convert(it) })
    builder.addAllBalances(obj.balances.map { BalanceJvmConverter.convert(it) })
    builder.addAllPositions(obj.positions.map { DerivativePositionJvmConverter.convert(it) })
    builder.addAllSubaccountTradeNonces(obj.subaccountTradeNonces.map {
        SubaccountNonceJvmConverter.convert(it) })
    builder.addAllExpiryFuturesMarketInfoState(obj.expiryFuturesMarketInfoState.map {
        ExpiryFuturesMarketInfoStateJvmConverter.convert(it) })
    builder.addAllPerpetualMarketInfo(obj.perpetualMarketInfo.map {
        PerpetualMarketInfoJvmConverter.convert(it) })
    builder.addAllPerpetualMarketFundingState(obj.perpetualMarketFundingState.map {
        PerpetualMarketFundingStateJvmConverter.convert(it) })
    builder.addAllDerivativeMarketSettlementScheduled(obj.derivativeMarketSettlementScheduled.map {
        DerivativeMarketSettlementInfoJvmConverter.convert(it) })
    builder.setIsSpotExchangeEnabled(obj.isSpotExchangeEnabled)
    builder.setIsDerivativesExchangeEnabled(obj.isDerivativesExchangeEnabled)
    builder.setTradingRewardCampaignInfo(TradingRewardCampaignInfoJvmConverter.convert(obj.tradingRewardCampaignInfo))
    builder.addAllTradingRewardPoolCampaignSchedule(obj.tradingRewardPoolCampaignSchedule.map {
        CampaignRewardPoolJvmConverter.convert(it) })
    builder.addAllTradingRewardCampaignAccountPoints(obj.tradingRewardCampaignAccountPoints.map {
        TradingRewardCampaignAccountPointsJvmConverter.convert(it) })
    builder.setFeeDiscountSchedule(FeeDiscountScheduleJvmConverter.convert(obj.feeDiscountSchedule))
    builder.addAllFeeDiscountAccountTierTtl(obj.feeDiscountAccountTierTtl.map {
        FeeDiscountAccountTierTTLJvmConverter.convert(it) })
    builder.addAllFeeDiscountBucketVolumeAccounts(obj.feeDiscountBucketVolumeAccounts.map {
        FeeDiscountBucketVolumeAccountsJvmConverter.convert(it) })
    builder.setIsFirstFeeCycleFinished(obj.isFirstFeeCycleFinished)
    builder.addAllPendingTradingRewardPoolCampaignSchedule(obj.pendingTradingRewardPoolCampaignSchedule.map
        { CampaignRewardPoolJvmConverter.convert(it) })
    builder.addAllPendingTradingRewardCampaignAccountPoints(obj.pendingTradingRewardCampaignAccountPoints.map
        { TradingRewardCampaignAccountPendingPointsJvmConverter.convert(it) })
    builder.addAllRewardsOptOutAddresses(obj.rewardsOptOutAddresses.map { it })
    builder.addAllHistoricalTradeRecords(obj.historicalTradeRecords.map {
        TradeRecordsJvmConverter.convert(it) })
    builder.addAllBinaryOptionsMarkets(obj.binaryOptionsMarkets.map {
        BinaryOptionsMarketJvmConverter.convert(it) })
    builder.addAllBinaryOptionsMarketIdsScheduledForSettlement(obj.binaryOptionsMarketIdsScheduledForSettlement.map
        { it })
    builder.addAllSpotMarketIdsScheduledToForceClose(obj.spotMarketIdsScheduledToForceClose.map { it
        })
    builder.addAllDenomDecimals(obj.denomDecimals.map { DenomDecimalsJvmConverter.convert(it) })
    builder.addAllConditionalDerivativeOrderbooks(obj.conditionalDerivativeOrderbooks.map {
        ConditionalDerivativeOrderBookJvmConverter.convert(it) })
    builder.addAllMarketFeeMultipliers(obj.marketFeeMultipliers.map {
        MarketFeeMultiplierJvmConverter.convert(it) })
    builder.addAllOrderbookSequences(obj.orderbookSequences.map {
        OrderbookSequenceJvmConverter.convert(it) })
    builder.addAllSubaccountVolumes(obj.subaccountVolumes.map {
        AggregateSubaccountVolumeRecordJvmConverter.convert(it) })
    builder.addAllMarketVolumes(obj.marketVolumes.map { MarketVolumeJvmConverter.convert(it) })
    return builder.build()
  }
}

public object OrderbookSequenceJvmConverter :
    ProtobufTypeMapper<OrderbookSequence, Genesis.OrderbookSequence> {
  public override val descriptor: Descriptors.Descriptor = Genesis.OrderbookSequence.getDescriptor()

  public override val parser: Parser<Genesis.OrderbookSequence> = Genesis.OrderbookSequence.parser()

  public override fun convert(obj: Genesis.OrderbookSequence): OrderbookSequence =
      OrderbookSequence(
  	sequence = obj.getSequence().asKotlinType,
  	marketId = obj.getMarketId(),
  )

  public override fun convert(obj: OrderbookSequence): Genesis.OrderbookSequence {
    val builder = Genesis.OrderbookSequence.newBuilder()
    builder.setSequence(obj.sequence.asJavaType)
    builder.setMarketId(obj.marketId)
    return builder.build()
  }
}

public object FeeDiscountAccountTierTTLJvmConverter :
    ProtobufTypeMapper<FeeDiscountAccountTierTTL, Genesis.FeeDiscountAccountTierTTL> {
  public override val descriptor: Descriptors.Descriptor =
      Genesis.FeeDiscountAccountTierTTL.getDescriptor()

  public override val parser: Parser<Genesis.FeeDiscountAccountTierTTL> =
      Genesis.FeeDiscountAccountTierTTL.parser()

  public override fun convert(obj: Genesis.FeeDiscountAccountTierTTL): FeeDiscountAccountTierTTL =
      FeeDiscountAccountTierTTL(
  	account = obj.getAccount(),
  	tierTtl = FeeDiscountTierTTLJvmConverter.convert(obj.getTierTtl()),
  )

  public override fun convert(obj: FeeDiscountAccountTierTTL): Genesis.FeeDiscountAccountTierTTL {
    val builder = Genesis.FeeDiscountAccountTierTTL.newBuilder()
    builder.setAccount(obj.account)
    builder.setTierTtl(FeeDiscountTierTTLJvmConverter.convert(obj.tierTtl))
    return builder.build()
  }
}

public object FeeDiscountBucketVolumeAccountsJvmConverter :
    ProtobufTypeMapper<FeeDiscountBucketVolumeAccounts, Genesis.FeeDiscountBucketVolumeAccounts> {
  public override val descriptor: Descriptors.Descriptor =
      Genesis.FeeDiscountBucketVolumeAccounts.getDescriptor()

  public override val parser: Parser<Genesis.FeeDiscountBucketVolumeAccounts> =
      Genesis.FeeDiscountBucketVolumeAccounts.parser()

  public override fun convert(obj: Genesis.FeeDiscountBucketVolumeAccounts):
      FeeDiscountBucketVolumeAccounts = FeeDiscountBucketVolumeAccounts(
  	bucketStartTimestamp = obj.getBucketStartTimestamp(),
  	accountVolume = obj.getAccountVolumeList().map { AccountVolumeJvmConverter.convert(it) },
  )

  public override fun convert(obj: FeeDiscountBucketVolumeAccounts):
      Genesis.FeeDiscountBucketVolumeAccounts {
    val builder = Genesis.FeeDiscountBucketVolumeAccounts.newBuilder()
    builder.setBucketStartTimestamp(obj.bucketStartTimestamp)
    builder.addAllAccountVolume(obj.accountVolume.map { AccountVolumeJvmConverter.convert(it) })
    return builder.build()
  }
}

public object AccountVolumeJvmConverter : ProtobufTypeMapper<AccountVolume, Genesis.AccountVolume> {
  public override val descriptor: Descriptors.Descriptor = Genesis.AccountVolume.getDescriptor()

  public override val parser: Parser<Genesis.AccountVolume> = Genesis.AccountVolume.parser()

  public override fun convert(obj: Genesis.AccountVolume): AccountVolume = AccountVolume(
  	account = obj.getAccount(),
  	volume = obj.getVolume(),
  )

  public override fun convert(obj: AccountVolume): Genesis.AccountVolume {
    val builder = Genesis.AccountVolume.newBuilder()
    builder.setAccount(obj.account)
    builder.setVolume(obj.volume)
    return builder.build()
  }
}

public object TradingRewardCampaignAccountPointsJvmConverter :
    ProtobufTypeMapper<TradingRewardCampaignAccountPoints, Genesis.TradingRewardCampaignAccountPoints>
    {
  public override val descriptor: Descriptors.Descriptor =
      Genesis.TradingRewardCampaignAccountPoints.getDescriptor()

  public override val parser: Parser<Genesis.TradingRewardCampaignAccountPoints> =
      Genesis.TradingRewardCampaignAccountPoints.parser()

  public override fun convert(obj: Genesis.TradingRewardCampaignAccountPoints):
      TradingRewardCampaignAccountPoints = TradingRewardCampaignAccountPoints(
  	account = obj.getAccount(),
  	points = obj.getPoints(),
  )

  public override fun convert(obj: TradingRewardCampaignAccountPoints):
      Genesis.TradingRewardCampaignAccountPoints {
    val builder = Genesis.TradingRewardCampaignAccountPoints.newBuilder()
    builder.setAccount(obj.account)
    builder.setPoints(obj.points)
    return builder.build()
  }
}

public object TradingRewardCampaignAccountPendingPointsJvmConverter :
    ProtobufTypeMapper<TradingRewardCampaignAccountPendingPoints, Genesis.TradingRewardCampaignAccountPendingPoints>
    {
  public override val descriptor: Descriptors.Descriptor =
      Genesis.TradingRewardCampaignAccountPendingPoints.getDescriptor()

  public override val parser: Parser<Genesis.TradingRewardCampaignAccountPendingPoints> =
      Genesis.TradingRewardCampaignAccountPendingPoints.parser()

  public override fun convert(obj: Genesis.TradingRewardCampaignAccountPendingPoints):
      TradingRewardCampaignAccountPendingPoints = TradingRewardCampaignAccountPendingPoints(
  	rewardPoolStartTimestamp = obj.getRewardPoolStartTimestamp(),
  	accountPoints = obj.getAccountPointsList().map {
      TradingRewardCampaignAccountPointsJvmConverter.convert(it) },
  )

  public override fun convert(obj: TradingRewardCampaignAccountPendingPoints):
      Genesis.TradingRewardCampaignAccountPendingPoints {
    val builder = Genesis.TradingRewardCampaignAccountPendingPoints.newBuilder()
    builder.setRewardPoolStartTimestamp(obj.rewardPoolStartTimestamp)
    builder.addAllAccountPoints(obj.accountPoints.map {
        TradingRewardCampaignAccountPointsJvmConverter.convert(it) })
    return builder.build()
  }
}

public object SpotOrderBookJvmConverter : ProtobufTypeMapper<SpotOrderBook, Genesis.SpotOrderBook> {
  public override val descriptor: Descriptors.Descriptor = Genesis.SpotOrderBook.getDescriptor()

  public override val parser: Parser<Genesis.SpotOrderBook> = Genesis.SpotOrderBook.parser()

  public override fun convert(obj: Genesis.SpotOrderBook): SpotOrderBook = SpotOrderBook(
  	marketId = obj.getMarketId(),
  	isBuySide = obj.getIsBuySide(),
  	orders = obj.getOrdersList().map { SpotLimitOrderJvmConverter.convert(it) },
  )

  public override fun convert(obj: SpotOrderBook): Genesis.SpotOrderBook {
    val builder = Genesis.SpotOrderBook.newBuilder()
    builder.setMarketId(obj.marketId)
    builder.setIsBuySide(obj.isBuySide)
    builder.addAllOrders(obj.orders.map { SpotLimitOrderJvmConverter.convert(it) })
    return builder.build()
  }
}

public object DerivativeOrderBookJvmConverter :
    ProtobufTypeMapper<DerivativeOrderBook, Genesis.DerivativeOrderBook> {
  public override val descriptor: Descriptors.Descriptor =
      Genesis.DerivativeOrderBook.getDescriptor()

  public override val parser: Parser<Genesis.DerivativeOrderBook> =
      Genesis.DerivativeOrderBook.parser()

  public override fun convert(obj: Genesis.DerivativeOrderBook): DerivativeOrderBook =
      DerivativeOrderBook(
  	marketId = obj.getMarketId(),
  	isBuySide = obj.getIsBuySide(),
  	orders = obj.getOrdersList().map { DerivativeLimitOrderJvmConverter.convert(it) },
  )

  public override fun convert(obj: DerivativeOrderBook): Genesis.DerivativeOrderBook {
    val builder = Genesis.DerivativeOrderBook.newBuilder()
    builder.setMarketId(obj.marketId)
    builder.setIsBuySide(obj.isBuySide)
    builder.addAllOrders(obj.orders.map { DerivativeLimitOrderJvmConverter.convert(it) })
    return builder.build()
  }
}

public object ConditionalDerivativeOrderBookJvmConverter :
    ProtobufTypeMapper<ConditionalDerivativeOrderBook, Genesis.ConditionalDerivativeOrderBook> {
  public override val descriptor: Descriptors.Descriptor =
      Genesis.ConditionalDerivativeOrderBook.getDescriptor()

  public override val parser: Parser<Genesis.ConditionalDerivativeOrderBook> =
      Genesis.ConditionalDerivativeOrderBook.parser()

  public override fun convert(obj: Genesis.ConditionalDerivativeOrderBook):
      ConditionalDerivativeOrderBook = ConditionalDerivativeOrderBook(
  	marketId = obj.getMarketId(),
  	limitBuyOrders = obj.getLimitBuyOrdersList().map { DerivativeLimitOrderJvmConverter.convert(it)
      },
  	marketBuyOrders = obj.getMarketBuyOrdersList().map {
      DerivativeMarketOrderJvmConverter.convert(it) },
  	limitSellOrders = obj.getLimitSellOrdersList().map { DerivativeLimitOrderJvmConverter.convert(it)
      },
  	marketSellOrders = obj.getMarketSellOrdersList().map {
      DerivativeMarketOrderJvmConverter.convert(it) },
  )

  public override fun convert(obj: ConditionalDerivativeOrderBook):
      Genesis.ConditionalDerivativeOrderBook {
    val builder = Genesis.ConditionalDerivativeOrderBook.newBuilder()
    builder.setMarketId(obj.marketId)
    builder.addAllLimitBuyOrders(obj.limitBuyOrders.map {
        DerivativeLimitOrderJvmConverter.convert(it) })
    builder.addAllMarketBuyOrders(obj.marketBuyOrders.map {
        DerivativeMarketOrderJvmConverter.convert(it) })
    builder.addAllLimitSellOrders(obj.limitSellOrders.map {
        DerivativeLimitOrderJvmConverter.convert(it) })
    builder.addAllMarketSellOrders(obj.marketSellOrders.map {
        DerivativeMarketOrderJvmConverter.convert(it) })
    return builder.build()
  }
}

public object BalanceJvmConverter : ProtobufTypeMapper<Balance, Genesis.Balance> {
  public override val descriptor: Descriptors.Descriptor = Genesis.Balance.getDescriptor()

  public override val parser: Parser<Genesis.Balance> = Genesis.Balance.parser()

  public override fun convert(obj: Genesis.Balance): Balance = Balance(
  	subaccountId = obj.getSubaccountId(),
  	denom = obj.getDenom(),
  	deposits = DepositJvmConverter.convert(obj.getDeposits()),
  )

  public override fun convert(obj: Balance): Genesis.Balance {
    val builder = Genesis.Balance.newBuilder()
    builder.setSubaccountId(obj.subaccountId)
    builder.setDenom(obj.denom)
    builder.setDeposits(DepositJvmConverter.convert(obj.deposits))
    return builder.build()
  }
}

public object DerivativePositionJvmConverter :
    ProtobufTypeMapper<DerivativePosition, Genesis.DerivativePosition> {
  public override val descriptor: Descriptors.Descriptor =
      Genesis.DerivativePosition.getDescriptor()

  public override val parser: Parser<Genesis.DerivativePosition> =
      Genesis.DerivativePosition.parser()

  public override fun convert(obj: Genesis.DerivativePosition): DerivativePosition =
      DerivativePosition(
  	subaccountId = obj.getSubaccountId(),
  	marketId = obj.getMarketId(),
  	position = PositionJvmConverter.convert(obj.getPosition()),
  )

  public override fun convert(obj: DerivativePosition): Genesis.DerivativePosition {
    val builder = Genesis.DerivativePosition.newBuilder()
    builder.setSubaccountId(obj.subaccountId)
    builder.setMarketId(obj.marketId)
    builder.setPosition(PositionJvmConverter.convert(obj.position))
    return builder.build()
  }
}

public object SubaccountNonceJvmConverter :
    ProtobufTypeMapper<SubaccountNonce, Genesis.SubaccountNonce> {
  public override val descriptor: Descriptors.Descriptor = Genesis.SubaccountNonce.getDescriptor()

  public override val parser: Parser<Genesis.SubaccountNonce> = Genesis.SubaccountNonce.parser()

  public override fun convert(obj: Genesis.SubaccountNonce): SubaccountNonce = SubaccountNonce(
  	subaccountId = obj.getSubaccountId(),
  	subaccountTradeNonce = SubaccountTradeNonceJvmConverter.convert(obj.getSubaccountTradeNonce()),
  )

  public override fun convert(obj: SubaccountNonce): Genesis.SubaccountNonce {
    val builder = Genesis.SubaccountNonce.newBuilder()
    builder.setSubaccountId(obj.subaccountId)
    builder.setSubaccountTradeNonce(SubaccountTradeNonceJvmConverter.convert(obj.subaccountTradeNonce))
    return builder.build()
  }
}

public object ExpiryFuturesMarketInfoStateJvmConverter :
    ProtobufTypeMapper<ExpiryFuturesMarketInfoState, Genesis.ExpiryFuturesMarketInfoState> {
  public override val descriptor: Descriptors.Descriptor =
      Genesis.ExpiryFuturesMarketInfoState.getDescriptor()

  public override val parser: Parser<Genesis.ExpiryFuturesMarketInfoState> =
      Genesis.ExpiryFuturesMarketInfoState.parser()

  public override fun convert(obj: Genesis.ExpiryFuturesMarketInfoState):
      ExpiryFuturesMarketInfoState = ExpiryFuturesMarketInfoState(
  	marketId = obj.getMarketId(),
  	marketInfo = ExpiryFuturesMarketInfoJvmConverter.convert(obj.getMarketInfo()),
  )

  public override fun convert(obj: ExpiryFuturesMarketInfoState):
      Genesis.ExpiryFuturesMarketInfoState {
    val builder = Genesis.ExpiryFuturesMarketInfoState.newBuilder()
    builder.setMarketId(obj.marketId)
    builder.setMarketInfo(ExpiryFuturesMarketInfoJvmConverter.convert(obj.marketInfo))
    return builder.build()
  }
}

public object PerpetualMarketFundingStateJvmConverter :
    ProtobufTypeMapper<PerpetualMarketFundingState, Genesis.PerpetualMarketFundingState> {
  public override val descriptor: Descriptors.Descriptor =
      Genesis.PerpetualMarketFundingState.getDescriptor()

  public override val parser: Parser<Genesis.PerpetualMarketFundingState> =
      Genesis.PerpetualMarketFundingState.parser()

  public override fun convert(obj: Genesis.PerpetualMarketFundingState): PerpetualMarketFundingState
      = PerpetualMarketFundingState(
  	marketId = obj.getMarketId(),
  	funding = PerpetualMarketFundingJvmConverter.convert(obj.getFunding()),
  )

  public override fun convert(obj: PerpetualMarketFundingState):
      Genesis.PerpetualMarketFundingState {
    val builder = Genesis.PerpetualMarketFundingState.newBuilder()
    builder.setMarketId(obj.marketId)
    builder.setFunding(PerpetualMarketFundingJvmConverter.convert(obj.funding))
    return builder.build()
  }
}
