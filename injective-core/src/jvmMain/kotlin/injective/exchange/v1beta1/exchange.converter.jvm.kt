// Transform from injective/exchange/v1beta1/exchange.proto
@file:GeneratorVersion(version = "0.3.1")

package injective.exchange.v1beta1

import com.google.protobuf.ByteString
import com.google.protobuf.Descriptors
import com.google.protobuf.Parser
import cosmos.base.v1beta1.CoinJvmConverter
import injective.oracle.v1beta1.Oracle
import injective.oracle.v1beta1.OracleType
import kr.jadekim.protobuf.`annotation`.GeneratorVersion
import kr.jadekim.protobuf.converter.mapper.ProtobufTypeMapper
import kr.jadekim.protobuf.util.asJavaType
import kr.jadekim.protobuf.util.asKotlinType

public object ParamsJvmConverter : ProtobufTypeMapper<Params, Exchange.Params> {
  public override val descriptor: Descriptors.Descriptor = Exchange.Params.getDescriptor()

  public override val parser: Parser<Exchange.Params> = Exchange.Params.parser()

  public override fun convert(obj: Exchange.Params): Params = Params(
  	spotMarketInstantListingFee = CoinJvmConverter.convert(obj.getSpotMarketInstantListingFee()),
  	derivativeMarketInstantListingFee =
      CoinJvmConverter.convert(obj.getDerivativeMarketInstantListingFee()),
  	defaultSpotMakerFeeRate = obj.getDefaultSpotMakerFeeRate(),
  	defaultSpotTakerFeeRate = obj.getDefaultSpotTakerFeeRate(),
  	defaultDerivativeMakerFeeRate = obj.getDefaultDerivativeMakerFeeRate(),
  	defaultDerivativeTakerFeeRate = obj.getDefaultDerivativeTakerFeeRate(),
  	defaultInitialMarginRatio = obj.getDefaultInitialMarginRatio(),
  	defaultMaintenanceMarginRatio = obj.getDefaultMaintenanceMarginRatio(),
  	defaultFundingInterval = obj.getDefaultFundingInterval(),
  	fundingMultiple = obj.getFundingMultiple(),
  	relayerFeeShareRate = obj.getRelayerFeeShareRate(),
  	defaultHourlyFundingRateCap = obj.getDefaultHourlyFundingRateCap(),
  	defaultHourlyInterestRate = obj.getDefaultHourlyInterestRate(),
  	maxDerivativeOrderSideCount = obj.getMaxDerivativeOrderSideCount().asKotlinType,
  	injRewardStakedRequirementThreshold = obj.getInjRewardStakedRequirementThreshold(),
  	tradingRewardsVestingDuration = obj.getTradingRewardsVestingDuration(),
  	liquidatorRewardShareRate = obj.getLiquidatorRewardShareRate(),
  	binaryOptionsMarketInstantListingFee =
      CoinJvmConverter.convert(obj.getBinaryOptionsMarketInstantListingFee()),
  	atomicMarketOrderAccessLevel =
      AtomicMarketOrderAccessLevel.forNumber(obj.getAtomicMarketOrderAccessLevel().number),
  	spotAtomicMarketOrderFeeMultiplier = obj.getSpotAtomicMarketOrderFeeMultiplier(),
  	derivativeAtomicMarketOrderFeeMultiplier = obj.getDerivativeAtomicMarketOrderFeeMultiplier(),
  	binaryOptionsAtomicMarketOrderFeeMultiplier =
      obj.getBinaryOptionsAtomicMarketOrderFeeMultiplier(),
  	minimalProtocolFeeRate = obj.getMinimalProtocolFeeRate(),
  	isInstantDerivativeMarketLaunchEnabled = obj.getIsInstantDerivativeMarketLaunchEnabled(),
  	postOnlyModeHeightThreshold = obj.getPostOnlyModeHeightThreshold(),
  )

  public override fun convert(obj: Params): Exchange.Params {
    val builder = Exchange.Params.newBuilder()
    builder.setSpotMarketInstantListingFee(CoinJvmConverter.convert(obj.spotMarketInstantListingFee))
    builder.setDerivativeMarketInstantListingFee(CoinJvmConverter.convert(obj.derivativeMarketInstantListingFee))
    builder.setDefaultSpotMakerFeeRate(obj.defaultSpotMakerFeeRate)
    builder.setDefaultSpotTakerFeeRate(obj.defaultSpotTakerFeeRate)
    builder.setDefaultDerivativeMakerFeeRate(obj.defaultDerivativeMakerFeeRate)
    builder.setDefaultDerivativeTakerFeeRate(obj.defaultDerivativeTakerFeeRate)
    builder.setDefaultInitialMarginRatio(obj.defaultInitialMarginRatio)
    builder.setDefaultMaintenanceMarginRatio(obj.defaultMaintenanceMarginRatio)
    builder.setDefaultFundingInterval(obj.defaultFundingInterval)
    builder.setFundingMultiple(obj.fundingMultiple)
    builder.setRelayerFeeShareRate(obj.relayerFeeShareRate)
    builder.setDefaultHourlyFundingRateCap(obj.defaultHourlyFundingRateCap)
    builder.setDefaultHourlyInterestRate(obj.defaultHourlyInterestRate)
    builder.setMaxDerivativeOrderSideCount(obj.maxDerivativeOrderSideCount.asJavaType)
    builder.setInjRewardStakedRequirementThreshold(obj.injRewardStakedRequirementThreshold)
    builder.setTradingRewardsVestingDuration(obj.tradingRewardsVestingDuration)
    builder.setLiquidatorRewardShareRate(obj.liquidatorRewardShareRate)
    builder.setBinaryOptionsMarketInstantListingFee(CoinJvmConverter.convert(obj.binaryOptionsMarketInstantListingFee))
    builder.setAtomicMarketOrderAccessLevel(Exchange.AtomicMarketOrderAccessLevel.forNumber(obj.atomicMarketOrderAccessLevel.number))
    builder.setSpotAtomicMarketOrderFeeMultiplier(obj.spotAtomicMarketOrderFeeMultiplier)
    builder.setDerivativeAtomicMarketOrderFeeMultiplier(obj.derivativeAtomicMarketOrderFeeMultiplier)
    builder.setBinaryOptionsAtomicMarketOrderFeeMultiplier(obj.binaryOptionsAtomicMarketOrderFeeMultiplier)
    builder.setMinimalProtocolFeeRate(obj.minimalProtocolFeeRate)
    builder.setIsInstantDerivativeMarketLaunchEnabled(obj.isInstantDerivativeMarketLaunchEnabled)
    builder.setPostOnlyModeHeightThreshold(obj.postOnlyModeHeightThreshold)
    return builder.build()
  }
}

public object MarketFeeMultiplierJvmConverter :
    ProtobufTypeMapper<MarketFeeMultiplier, Exchange.MarketFeeMultiplier> {
  public override val descriptor: Descriptors.Descriptor =
      Exchange.MarketFeeMultiplier.getDescriptor()

  public override val parser: Parser<Exchange.MarketFeeMultiplier> =
      Exchange.MarketFeeMultiplier.parser()

  public override fun convert(obj: Exchange.MarketFeeMultiplier): MarketFeeMultiplier =
      MarketFeeMultiplier(
  	marketId = obj.getMarketId(),
  	feeMultiplier = obj.getFeeMultiplier(),
  )

  public override fun convert(obj: MarketFeeMultiplier): Exchange.MarketFeeMultiplier {
    val builder = Exchange.MarketFeeMultiplier.newBuilder()
    builder.setMarketId(obj.marketId)
    builder.setFeeMultiplier(obj.feeMultiplier)
    return builder.build()
  }
}

public object DerivativeMarketJvmConverter :
    ProtobufTypeMapper<DerivativeMarket, Exchange.DerivativeMarket> {
  public override val descriptor: Descriptors.Descriptor = Exchange.DerivativeMarket.getDescriptor()

  public override val parser: Parser<Exchange.DerivativeMarket> = Exchange.DerivativeMarket.parser()

  public override fun convert(obj: Exchange.DerivativeMarket): DerivativeMarket = DerivativeMarket(
  	ticker = obj.getTicker(),
  	oracleBase = obj.getOracleBase(),
  	oracleQuote = obj.getOracleQuote(),
  	oracleType = OracleType.forNumber(obj.getOracleType().number),
  	oracleScaleFactor = obj.getOracleScaleFactor().asKotlinType,
  	quoteDenom = obj.getQuoteDenom(),
  	marketId = obj.getMarketId(),
  	initialMarginRatio = obj.getInitialMarginRatio(),
  	maintenanceMarginRatio = obj.getMaintenanceMarginRatio(),
  	makerFeeRate = obj.getMakerFeeRate(),
  	takerFeeRate = obj.getTakerFeeRate(),
  	relayerFeeShareRate = obj.getRelayerFeeShareRate(),
  	isPerpetual = obj.getIsPerpetual(),
  	status = MarketStatus.forNumber(obj.getStatus().number),
  	minPriceTickSize = obj.getMinPriceTickSize(),
  	minQuantityTickSize = obj.getMinQuantityTickSize(),
  )

  public override fun convert(obj: DerivativeMarket): Exchange.DerivativeMarket {
    val builder = Exchange.DerivativeMarket.newBuilder()
    builder.setTicker(obj.ticker)
    builder.setOracleBase(obj.oracleBase)
    builder.setOracleQuote(obj.oracleQuote)
    builder.setOracleType(Oracle.OracleType.forNumber(obj.oracleType.number))
    builder.setOracleScaleFactor(obj.oracleScaleFactor.asJavaType)
    builder.setQuoteDenom(obj.quoteDenom)
    builder.setMarketId(obj.marketId)
    builder.setInitialMarginRatio(obj.initialMarginRatio)
    builder.setMaintenanceMarginRatio(obj.maintenanceMarginRatio)
    builder.setMakerFeeRate(obj.makerFeeRate)
    builder.setTakerFeeRate(obj.takerFeeRate)
    builder.setRelayerFeeShareRate(obj.relayerFeeShareRate)
    builder.setIsPerpetual(obj.isPerpetual)
    builder.setStatus(Exchange.MarketStatus.forNumber(obj.status.number))
    builder.setMinPriceTickSize(obj.minPriceTickSize)
    builder.setMinQuantityTickSize(obj.minQuantityTickSize)
    return builder.build()
  }
}

public object BinaryOptionsMarketJvmConverter :
    ProtobufTypeMapper<BinaryOptionsMarket, Exchange.BinaryOptionsMarket> {
  public override val descriptor: Descriptors.Descriptor =
      Exchange.BinaryOptionsMarket.getDescriptor()

  public override val parser: Parser<Exchange.BinaryOptionsMarket> =
      Exchange.BinaryOptionsMarket.parser()

  public override fun convert(obj: Exchange.BinaryOptionsMarket): BinaryOptionsMarket =
      BinaryOptionsMarket(
  	ticker = obj.getTicker(),
  	oracleSymbol = obj.getOracleSymbol(),
  	oracleProvider = obj.getOracleProvider(),
  	oracleType = OracleType.forNumber(obj.getOracleType().number),
  	oracleScaleFactor = obj.getOracleScaleFactor().asKotlinType,
  	expirationTimestamp = obj.getExpirationTimestamp(),
  	settlementTimestamp = obj.getSettlementTimestamp(),
  	admin = obj.getAdmin(),
  	quoteDenom = obj.getQuoteDenom(),
  	marketId = obj.getMarketId(),
  	makerFeeRate = obj.getMakerFeeRate(),
  	takerFeeRate = obj.getTakerFeeRate(),
  	relayerFeeShareRate = obj.getRelayerFeeShareRate(),
  	status = MarketStatus.forNumber(obj.getStatus().number),
  	minPriceTickSize = obj.getMinPriceTickSize(),
  	minQuantityTickSize = obj.getMinQuantityTickSize(),
  	settlementPrice = obj.getSettlementPrice(),
  )

  public override fun convert(obj: BinaryOptionsMarket): Exchange.BinaryOptionsMarket {
    val builder = Exchange.BinaryOptionsMarket.newBuilder()
    builder.setTicker(obj.ticker)
    builder.setOracleSymbol(obj.oracleSymbol)
    builder.setOracleProvider(obj.oracleProvider)
    builder.setOracleType(Oracle.OracleType.forNumber(obj.oracleType.number))
    builder.setOracleScaleFactor(obj.oracleScaleFactor.asJavaType)
    builder.setExpirationTimestamp(obj.expirationTimestamp)
    builder.setSettlementTimestamp(obj.settlementTimestamp)
    builder.setAdmin(obj.admin)
    builder.setQuoteDenom(obj.quoteDenom)
    builder.setMarketId(obj.marketId)
    builder.setMakerFeeRate(obj.makerFeeRate)
    builder.setTakerFeeRate(obj.takerFeeRate)
    builder.setRelayerFeeShareRate(obj.relayerFeeShareRate)
    builder.setStatus(Exchange.MarketStatus.forNumber(obj.status.number))
    builder.setMinPriceTickSize(obj.minPriceTickSize)
    builder.setMinQuantityTickSize(obj.minQuantityTickSize)
    builder.setSettlementPrice(obj.settlementPrice)
    return builder.build()
  }
}

public object ExpiryFuturesMarketInfoJvmConverter :
    ProtobufTypeMapper<ExpiryFuturesMarketInfo, Exchange.ExpiryFuturesMarketInfo> {
  public override val descriptor: Descriptors.Descriptor =
      Exchange.ExpiryFuturesMarketInfo.getDescriptor()

  public override val parser: Parser<Exchange.ExpiryFuturesMarketInfo> =
      Exchange.ExpiryFuturesMarketInfo.parser()

  public override fun convert(obj: Exchange.ExpiryFuturesMarketInfo): ExpiryFuturesMarketInfo =
      ExpiryFuturesMarketInfo(
  	marketId = obj.getMarketId(),
  	expirationTimestamp = obj.getExpirationTimestamp(),
  	twapStartTimestamp = obj.getTwapStartTimestamp(),
  	expirationTwapStartPriceCumulative = obj.getExpirationTwapStartPriceCumulative(),
  	settlementPrice = obj.getSettlementPrice(),
  )

  public override fun convert(obj: ExpiryFuturesMarketInfo): Exchange.ExpiryFuturesMarketInfo {
    val builder = Exchange.ExpiryFuturesMarketInfo.newBuilder()
    builder.setMarketId(obj.marketId)
    builder.setExpirationTimestamp(obj.expirationTimestamp)
    builder.setTwapStartTimestamp(obj.twapStartTimestamp)
    builder.setExpirationTwapStartPriceCumulative(obj.expirationTwapStartPriceCumulative)
    builder.setSettlementPrice(obj.settlementPrice)
    return builder.build()
  }
}

public object PerpetualMarketInfoJvmConverter :
    ProtobufTypeMapper<PerpetualMarketInfo, Exchange.PerpetualMarketInfo> {
  public override val descriptor: Descriptors.Descriptor =
      Exchange.PerpetualMarketInfo.getDescriptor()

  public override val parser: Parser<Exchange.PerpetualMarketInfo> =
      Exchange.PerpetualMarketInfo.parser()

  public override fun convert(obj: Exchange.PerpetualMarketInfo): PerpetualMarketInfo =
      PerpetualMarketInfo(
  	marketId = obj.getMarketId(),
  	hourlyFundingRateCap = obj.getHourlyFundingRateCap(),
  	hourlyInterestRate = obj.getHourlyInterestRate(),
  	nextFundingTimestamp = obj.getNextFundingTimestamp(),
  	fundingInterval = obj.getFundingInterval(),
  )

  public override fun convert(obj: PerpetualMarketInfo): Exchange.PerpetualMarketInfo {
    val builder = Exchange.PerpetualMarketInfo.newBuilder()
    builder.setMarketId(obj.marketId)
    builder.setHourlyFundingRateCap(obj.hourlyFundingRateCap)
    builder.setHourlyInterestRate(obj.hourlyInterestRate)
    builder.setNextFundingTimestamp(obj.nextFundingTimestamp)
    builder.setFundingInterval(obj.fundingInterval)
    return builder.build()
  }
}

public object PerpetualMarketFundingJvmConverter :
    ProtobufTypeMapper<PerpetualMarketFunding, Exchange.PerpetualMarketFunding> {
  public override val descriptor: Descriptors.Descriptor =
      Exchange.PerpetualMarketFunding.getDescriptor()

  public override val parser: Parser<Exchange.PerpetualMarketFunding> =
      Exchange.PerpetualMarketFunding.parser()

  public override fun convert(obj: Exchange.PerpetualMarketFunding): PerpetualMarketFunding =
      PerpetualMarketFunding(
  	cumulativeFunding = obj.getCumulativeFunding(),
  	cumulativePrice = obj.getCumulativePrice(),
  	lastTimestamp = obj.getLastTimestamp(),
  )

  public override fun convert(obj: PerpetualMarketFunding): Exchange.PerpetualMarketFunding {
    val builder = Exchange.PerpetualMarketFunding.newBuilder()
    builder.setCumulativeFunding(obj.cumulativeFunding)
    builder.setCumulativePrice(obj.cumulativePrice)
    builder.setLastTimestamp(obj.lastTimestamp)
    return builder.build()
  }
}

public object DerivativeMarketSettlementInfoJvmConverter :
    ProtobufTypeMapper<DerivativeMarketSettlementInfo, Exchange.DerivativeMarketSettlementInfo> {
  public override val descriptor: Descriptors.Descriptor =
      Exchange.DerivativeMarketSettlementInfo.getDescriptor()

  public override val parser: Parser<Exchange.DerivativeMarketSettlementInfo> =
      Exchange.DerivativeMarketSettlementInfo.parser()

  public override fun convert(obj: Exchange.DerivativeMarketSettlementInfo):
      DerivativeMarketSettlementInfo = DerivativeMarketSettlementInfo(
  	marketId = obj.getMarketId(),
  	settlementPrice = obj.getSettlementPrice(),
  )

  public override fun convert(obj: DerivativeMarketSettlementInfo):
      Exchange.DerivativeMarketSettlementInfo {
    val builder = Exchange.DerivativeMarketSettlementInfo.newBuilder()
    builder.setMarketId(obj.marketId)
    builder.setSettlementPrice(obj.settlementPrice)
    return builder.build()
  }
}

public object NextFundingTimestampJvmConverter :
    ProtobufTypeMapper<NextFundingTimestamp, Exchange.NextFundingTimestamp> {
  public override val descriptor: Descriptors.Descriptor =
      Exchange.NextFundingTimestamp.getDescriptor()

  public override val parser: Parser<Exchange.NextFundingTimestamp> =
      Exchange.NextFundingTimestamp.parser()

  public override fun convert(obj: Exchange.NextFundingTimestamp): NextFundingTimestamp =
      NextFundingTimestamp(
  	nextTimestamp = obj.getNextTimestamp(),
  )

  public override fun convert(obj: NextFundingTimestamp): Exchange.NextFundingTimestamp {
    val builder = Exchange.NextFundingTimestamp.newBuilder()
    builder.setNextTimestamp(obj.nextTimestamp)
    return builder.build()
  }
}

public object MidPriceAndTOBJvmConverter :
    ProtobufTypeMapper<MidPriceAndTOB, Exchange.MidPriceAndTOB> {
  public override val descriptor: Descriptors.Descriptor = Exchange.MidPriceAndTOB.getDescriptor()

  public override val parser: Parser<Exchange.MidPriceAndTOB> = Exchange.MidPriceAndTOB.parser()

  public override fun convert(obj: Exchange.MidPriceAndTOB): MidPriceAndTOB = MidPriceAndTOB(
  	midPrice = obj.getMidPrice(),
  	bestBuyPrice = obj.getBestBuyPrice(),
  	bestSellPrice = obj.getBestSellPrice(),
  )

  public override fun convert(obj: MidPriceAndTOB): Exchange.MidPriceAndTOB {
    val builder = Exchange.MidPriceAndTOB.newBuilder()
    builder.setMidPrice(obj.midPrice)
    builder.setBestBuyPrice(obj.bestBuyPrice)
    builder.setBestSellPrice(obj.bestSellPrice)
    return builder.build()
  }
}

public object SpotMarketJvmConverter : ProtobufTypeMapper<SpotMarket, Exchange.SpotMarket> {
  public override val descriptor: Descriptors.Descriptor = Exchange.SpotMarket.getDescriptor()

  public override val parser: Parser<Exchange.SpotMarket> = Exchange.SpotMarket.parser()

  public override fun convert(obj: Exchange.SpotMarket): SpotMarket = SpotMarket(
  	ticker = obj.getTicker(),
  	baseDenom = obj.getBaseDenom(),
  	quoteDenom = obj.getQuoteDenom(),
  	makerFeeRate = obj.getMakerFeeRate(),
  	takerFeeRate = obj.getTakerFeeRate(),
  	relayerFeeShareRate = obj.getRelayerFeeShareRate(),
  	marketId = obj.getMarketId(),
  	status = MarketStatus.forNumber(obj.getStatus().number),
  	minPriceTickSize = obj.getMinPriceTickSize(),
  	minQuantityTickSize = obj.getMinQuantityTickSize(),
  )

  public override fun convert(obj: SpotMarket): Exchange.SpotMarket {
    val builder = Exchange.SpotMarket.newBuilder()
    builder.setTicker(obj.ticker)
    builder.setBaseDenom(obj.baseDenom)
    builder.setQuoteDenom(obj.quoteDenom)
    builder.setMakerFeeRate(obj.makerFeeRate)
    builder.setTakerFeeRate(obj.takerFeeRate)
    builder.setRelayerFeeShareRate(obj.relayerFeeShareRate)
    builder.setMarketId(obj.marketId)
    builder.setStatus(Exchange.MarketStatus.forNumber(obj.status.number))
    builder.setMinPriceTickSize(obj.minPriceTickSize)
    builder.setMinQuantityTickSize(obj.minQuantityTickSize)
    return builder.build()
  }
}

public object DepositJvmConverter : ProtobufTypeMapper<Deposit, Exchange.Deposit> {
  public override val descriptor: Descriptors.Descriptor = Exchange.Deposit.getDescriptor()

  public override val parser: Parser<Exchange.Deposit> = Exchange.Deposit.parser()

  public override fun convert(obj: Exchange.Deposit): Deposit = Deposit(
  	availableBalance = obj.getAvailableBalance(),
  	totalBalance = obj.getTotalBalance(),
  )

  public override fun convert(obj: Deposit): Exchange.Deposit {
    val builder = Exchange.Deposit.newBuilder()
    builder.setAvailableBalance(obj.availableBalance)
    builder.setTotalBalance(obj.totalBalance)
    return builder.build()
  }
}

public object SubaccountTradeNonceJvmConverter :
    ProtobufTypeMapper<SubaccountTradeNonce, Exchange.SubaccountTradeNonce> {
  public override val descriptor: Descriptors.Descriptor =
      Exchange.SubaccountTradeNonce.getDescriptor()

  public override val parser: Parser<Exchange.SubaccountTradeNonce> =
      Exchange.SubaccountTradeNonce.parser()

  public override fun convert(obj: Exchange.SubaccountTradeNonce): SubaccountTradeNonce =
      SubaccountTradeNonce(
  	nonce = obj.getNonce().asKotlinType,
  )

  public override fun convert(obj: SubaccountTradeNonce): Exchange.SubaccountTradeNonce {
    val builder = Exchange.SubaccountTradeNonce.newBuilder()
    builder.setNonce(obj.nonce.asJavaType)
    return builder.build()
  }
}

public object OrderInfoJvmConverter : ProtobufTypeMapper<OrderInfo, Exchange.OrderInfo> {
  public override val descriptor: Descriptors.Descriptor = Exchange.OrderInfo.getDescriptor()

  public override val parser: Parser<Exchange.OrderInfo> = Exchange.OrderInfo.parser()

  public override fun convert(obj: Exchange.OrderInfo): OrderInfo = OrderInfo(
  	subaccountId = obj.getSubaccountId(),
  	feeRecipient = obj.getFeeRecipient(),
  	price = obj.getPrice(),
  	quantity = obj.getQuantity(),
  	cid = obj.getCid(),
  )

  public override fun convert(obj: OrderInfo): Exchange.OrderInfo {
    val builder = Exchange.OrderInfo.newBuilder()
    builder.setSubaccountId(obj.subaccountId)
    builder.setFeeRecipient(obj.feeRecipient)
    builder.setPrice(obj.price)
    builder.setQuantity(obj.quantity)
    builder.setCid(obj.cid)
    return builder.build()
  }
}

public object SpotOrderJvmConverter : ProtobufTypeMapper<SpotOrder, Exchange.SpotOrder> {
  public override val descriptor: Descriptors.Descriptor = Exchange.SpotOrder.getDescriptor()

  public override val parser: Parser<Exchange.SpotOrder> = Exchange.SpotOrder.parser()

  public override fun convert(obj: Exchange.SpotOrder): SpotOrder = SpotOrder(
  	marketId = obj.getMarketId(),
  	orderInfo = OrderInfoJvmConverter.convert(obj.getOrderInfo()),
  	orderType = OrderType.forNumber(obj.getOrderType().number),
  	triggerPrice = obj.getTriggerPrice(),
  )

  public override fun convert(obj: SpotOrder): Exchange.SpotOrder {
    val builder = Exchange.SpotOrder.newBuilder()
    builder.setMarketId(obj.marketId)
    builder.setOrderInfo(OrderInfoJvmConverter.convert(obj.orderInfo))
    builder.setOrderType(Exchange.OrderType.forNumber(obj.orderType.number))
    builder.setTriggerPrice(obj.triggerPrice)
    return builder.build()
  }
}

public object SpotLimitOrderJvmConverter :
    ProtobufTypeMapper<SpotLimitOrder, Exchange.SpotLimitOrder> {
  public override val descriptor: Descriptors.Descriptor = Exchange.SpotLimitOrder.getDescriptor()

  public override val parser: Parser<Exchange.SpotLimitOrder> = Exchange.SpotLimitOrder.parser()

  public override fun convert(obj: Exchange.SpotLimitOrder): SpotLimitOrder = SpotLimitOrder(
  	orderInfo = OrderInfoJvmConverter.convert(obj.getOrderInfo()),
  	orderType = OrderType.forNumber(obj.getOrderType().number),
  	fillable = obj.getFillable(),
  	triggerPrice = obj.getTriggerPrice(),
  	orderHash = obj.getOrderHash().toByteArray(),
  )

  public override fun convert(obj: SpotLimitOrder): Exchange.SpotLimitOrder {
    val builder = Exchange.SpotLimitOrder.newBuilder()
    builder.setOrderInfo(OrderInfoJvmConverter.convert(obj.orderInfo))
    builder.setOrderType(Exchange.OrderType.forNumber(obj.orderType.number))
    builder.setFillable(obj.fillable)
    builder.setTriggerPrice(obj.triggerPrice)
    builder.setOrderHash(ByteString.copyFrom(obj.orderHash))
    return builder.build()
  }
}

public object SpotMarketOrderJvmConverter :
    ProtobufTypeMapper<SpotMarketOrder, Exchange.SpotMarketOrder> {
  public override val descriptor: Descriptors.Descriptor = Exchange.SpotMarketOrder.getDescriptor()

  public override val parser: Parser<Exchange.SpotMarketOrder> = Exchange.SpotMarketOrder.parser()

  public override fun convert(obj: Exchange.SpotMarketOrder): SpotMarketOrder = SpotMarketOrder(
  	orderInfo = OrderInfoJvmConverter.convert(obj.getOrderInfo()),
  	balanceHold = obj.getBalanceHold(),
  	orderHash = obj.getOrderHash().toByteArray(),
  	orderType = OrderType.forNumber(obj.getOrderType().number),
  	triggerPrice = obj.getTriggerPrice(),
  )

  public override fun convert(obj: SpotMarketOrder): Exchange.SpotMarketOrder {
    val builder = Exchange.SpotMarketOrder.newBuilder()
    builder.setOrderInfo(OrderInfoJvmConverter.convert(obj.orderInfo))
    builder.setBalanceHold(obj.balanceHold)
    builder.setOrderHash(ByteString.copyFrom(obj.orderHash))
    builder.setOrderType(Exchange.OrderType.forNumber(obj.orderType.number))
    builder.setTriggerPrice(obj.triggerPrice)
    return builder.build()
  }
}

public object DerivativeOrderJvmConverter :
    ProtobufTypeMapper<DerivativeOrder, Exchange.DerivativeOrder> {
  public override val descriptor: Descriptors.Descriptor = Exchange.DerivativeOrder.getDescriptor()

  public override val parser: Parser<Exchange.DerivativeOrder> = Exchange.DerivativeOrder.parser()

  public override fun convert(obj: Exchange.DerivativeOrder): DerivativeOrder = DerivativeOrder(
  	marketId = obj.getMarketId(),
  	orderInfo = OrderInfoJvmConverter.convert(obj.getOrderInfo()),
  	orderType = OrderType.forNumber(obj.getOrderType().number),
  	margin = obj.getMargin(),
  	triggerPrice = obj.getTriggerPrice(),
  )

  public override fun convert(obj: DerivativeOrder): Exchange.DerivativeOrder {
    val builder = Exchange.DerivativeOrder.newBuilder()
    builder.setMarketId(obj.marketId)
    builder.setOrderInfo(OrderInfoJvmConverter.convert(obj.orderInfo))
    builder.setOrderType(Exchange.OrderType.forNumber(obj.orderType.number))
    builder.setMargin(obj.margin)
    builder.setTriggerPrice(obj.triggerPrice)
    return builder.build()
  }
}

public object SubaccountOrderbookMetadataJvmConverter :
    ProtobufTypeMapper<SubaccountOrderbookMetadata, Exchange.SubaccountOrderbookMetadata> {
  public override val descriptor: Descriptors.Descriptor =
      Exchange.SubaccountOrderbookMetadata.getDescriptor()

  public override val parser: Parser<Exchange.SubaccountOrderbookMetadata> =
      Exchange.SubaccountOrderbookMetadata.parser()

  public override fun convert(obj: Exchange.SubaccountOrderbookMetadata):
      SubaccountOrderbookMetadata = SubaccountOrderbookMetadata(
  	vanillaLimitOrderCount = obj.getVanillaLimitOrderCount().asKotlinType,
  	reduceOnlyLimitOrderCount = obj.getReduceOnlyLimitOrderCount().asKotlinType,
  	aggregateReduceOnlyQuantity = obj.getAggregateReduceOnlyQuantity(),
  	aggregateVanillaQuantity = obj.getAggregateVanillaQuantity(),
  	vanillaConditionalOrderCount = obj.getVanillaConditionalOrderCount().asKotlinType,
  	reduceOnlyConditionalOrderCount = obj.getReduceOnlyConditionalOrderCount().asKotlinType,
  )

  public override fun convert(obj: SubaccountOrderbookMetadata):
      Exchange.SubaccountOrderbookMetadata {
    val builder = Exchange.SubaccountOrderbookMetadata.newBuilder()
    builder.setVanillaLimitOrderCount(obj.vanillaLimitOrderCount.asJavaType)
    builder.setReduceOnlyLimitOrderCount(obj.reduceOnlyLimitOrderCount.asJavaType)
    builder.setAggregateReduceOnlyQuantity(obj.aggregateReduceOnlyQuantity)
    builder.setAggregateVanillaQuantity(obj.aggregateVanillaQuantity)
    builder.setVanillaConditionalOrderCount(obj.vanillaConditionalOrderCount.asJavaType)
    builder.setReduceOnlyConditionalOrderCount(obj.reduceOnlyConditionalOrderCount.asJavaType)
    return builder.build()
  }
}

public object SubaccountOrderJvmConverter :
    ProtobufTypeMapper<SubaccountOrder, Exchange.SubaccountOrder> {
  public override val descriptor: Descriptors.Descriptor = Exchange.SubaccountOrder.getDescriptor()

  public override val parser: Parser<Exchange.SubaccountOrder> = Exchange.SubaccountOrder.parser()

  public override fun convert(obj: Exchange.SubaccountOrder): SubaccountOrder = SubaccountOrder(
  	price = obj.getPrice(),
  	quantity = obj.getQuantity(),
  	isReduceOnly = obj.getIsReduceOnly(),
  )

  public override fun convert(obj: SubaccountOrder): Exchange.SubaccountOrder {
    val builder = Exchange.SubaccountOrder.newBuilder()
    builder.setPrice(obj.price)
    builder.setQuantity(obj.quantity)
    builder.setIsReduceOnly(obj.isReduceOnly)
    return builder.build()
  }
}

public object SubaccountOrderDataJvmConverter :
    ProtobufTypeMapper<SubaccountOrderData, Exchange.SubaccountOrderData> {
  public override val descriptor: Descriptors.Descriptor =
      Exchange.SubaccountOrderData.getDescriptor()

  public override val parser: Parser<Exchange.SubaccountOrderData> =
      Exchange.SubaccountOrderData.parser()

  public override fun convert(obj: Exchange.SubaccountOrderData): SubaccountOrderData =
      SubaccountOrderData(
  	order = SubaccountOrderJvmConverter.convert(obj.getOrder()),
  	orderHash = obj.getOrderHash().toByteArray(),
  )

  public override fun convert(obj: SubaccountOrderData): Exchange.SubaccountOrderData {
    val builder = Exchange.SubaccountOrderData.newBuilder()
    builder.setOrder(SubaccountOrderJvmConverter.convert(obj.order))
    builder.setOrderHash(ByteString.copyFrom(obj.orderHash))
    return builder.build()
  }
}

public object DerivativeLimitOrderJvmConverter :
    ProtobufTypeMapper<DerivativeLimitOrder, Exchange.DerivativeLimitOrder> {
  public override val descriptor: Descriptors.Descriptor =
      Exchange.DerivativeLimitOrder.getDescriptor()

  public override val parser: Parser<Exchange.DerivativeLimitOrder> =
      Exchange.DerivativeLimitOrder.parser()

  public override fun convert(obj: Exchange.DerivativeLimitOrder): DerivativeLimitOrder =
      DerivativeLimitOrder(
  	orderInfo = OrderInfoJvmConverter.convert(obj.getOrderInfo()),
  	orderType = OrderType.forNumber(obj.getOrderType().number),
  	margin = obj.getMargin(),
  	fillable = obj.getFillable(),
  	triggerPrice = obj.getTriggerPrice(),
  	orderHash = obj.getOrderHash().toByteArray(),
  )

  public override fun convert(obj: DerivativeLimitOrder): Exchange.DerivativeLimitOrder {
    val builder = Exchange.DerivativeLimitOrder.newBuilder()
    builder.setOrderInfo(OrderInfoJvmConverter.convert(obj.orderInfo))
    builder.setOrderType(Exchange.OrderType.forNumber(obj.orderType.number))
    builder.setMargin(obj.margin)
    builder.setFillable(obj.fillable)
    builder.setTriggerPrice(obj.triggerPrice)
    builder.setOrderHash(ByteString.copyFrom(obj.orderHash))
    return builder.build()
  }
}

public object DerivativeMarketOrderJvmConverter :
    ProtobufTypeMapper<DerivativeMarketOrder, Exchange.DerivativeMarketOrder> {
  public override val descriptor: Descriptors.Descriptor =
      Exchange.DerivativeMarketOrder.getDescriptor()

  public override val parser: Parser<Exchange.DerivativeMarketOrder> =
      Exchange.DerivativeMarketOrder.parser()

  public override fun convert(obj: Exchange.DerivativeMarketOrder): DerivativeMarketOrder =
      DerivativeMarketOrder(
  	orderInfo = OrderInfoJvmConverter.convert(obj.getOrderInfo()),
  	orderType = OrderType.forNumber(obj.getOrderType().number),
  	margin = obj.getMargin(),
  	marginHold = obj.getMarginHold(),
  	triggerPrice = obj.getTriggerPrice(),
  	orderHash = obj.getOrderHash().toByteArray(),
  )

  public override fun convert(obj: DerivativeMarketOrder): Exchange.DerivativeMarketOrder {
    val builder = Exchange.DerivativeMarketOrder.newBuilder()
    builder.setOrderInfo(OrderInfoJvmConverter.convert(obj.orderInfo))
    builder.setOrderType(Exchange.OrderType.forNumber(obj.orderType.number))
    builder.setMargin(obj.margin)
    builder.setMarginHold(obj.marginHold)
    builder.setTriggerPrice(obj.triggerPrice)
    builder.setOrderHash(ByteString.copyFrom(obj.orderHash))
    return builder.build()
  }
}

public object PositionJvmConverter : ProtobufTypeMapper<Position, Exchange.Position> {
  public override val descriptor: Descriptors.Descriptor = Exchange.Position.getDescriptor()

  public override val parser: Parser<Exchange.Position> = Exchange.Position.parser()

  public override fun convert(obj: Exchange.Position): Position = Position(
  	isLong = obj.getIsLong(),
  	quantity = obj.getQuantity(),
  	entryPrice = obj.getEntryPrice(),
  	margin = obj.getMargin(),
  	cumulativeFundingEntry = obj.getCumulativeFundingEntry(),
  )

  public override fun convert(obj: Position): Exchange.Position {
    val builder = Exchange.Position.newBuilder()
    builder.setIsLong(obj.isLong)
    builder.setQuantity(obj.quantity)
    builder.setEntryPrice(obj.entryPrice)
    builder.setMargin(obj.margin)
    builder.setCumulativeFundingEntry(obj.cumulativeFundingEntry)
    return builder.build()
  }
}

public object MarketOrderIndicatorJvmConverter :
    ProtobufTypeMapper<MarketOrderIndicator, Exchange.MarketOrderIndicator> {
  public override val descriptor: Descriptors.Descriptor =
      Exchange.MarketOrderIndicator.getDescriptor()

  public override val parser: Parser<Exchange.MarketOrderIndicator> =
      Exchange.MarketOrderIndicator.parser()

  public override fun convert(obj: Exchange.MarketOrderIndicator): MarketOrderIndicator =
      MarketOrderIndicator(
  	marketId = obj.getMarketId(),
  	isBuy = obj.getIsBuy(),
  )

  public override fun convert(obj: MarketOrderIndicator): Exchange.MarketOrderIndicator {
    val builder = Exchange.MarketOrderIndicator.newBuilder()
    builder.setMarketId(obj.marketId)
    builder.setIsBuy(obj.isBuy)
    return builder.build()
  }
}

public object TradeLogJvmConverter : ProtobufTypeMapper<TradeLog, Exchange.TradeLog> {
  public override val descriptor: Descriptors.Descriptor = Exchange.TradeLog.getDescriptor()

  public override val parser: Parser<Exchange.TradeLog> = Exchange.TradeLog.parser()

  public override fun convert(obj: Exchange.TradeLog): TradeLog = TradeLog(
  	quantity = obj.getQuantity(),
  	price = obj.getPrice(),
  	subaccountId = obj.getSubaccountId().toByteArray(),
  	fee = obj.getFee(),
  	orderHash = obj.getOrderHash().toByteArray(),
  	feeRecipientAddress = obj.getFeeRecipientAddress().toByteArray(),
  	cid = obj.getCid(),
  )

  public override fun convert(obj: TradeLog): Exchange.TradeLog {
    val builder = Exchange.TradeLog.newBuilder()
    builder.setQuantity(obj.quantity)
    builder.setPrice(obj.price)
    builder.setSubaccountId(ByteString.copyFrom(obj.subaccountId))
    builder.setFee(obj.fee)
    builder.setOrderHash(ByteString.copyFrom(obj.orderHash))
    builder.setFeeRecipientAddress(ByteString.copyFrom(obj.feeRecipientAddress))
    builder.setCid(obj.cid)
    return builder.build()
  }
}

public object PositionDeltaJvmConverter : ProtobufTypeMapper<PositionDelta, Exchange.PositionDelta>
    {
  public override val descriptor: Descriptors.Descriptor = Exchange.PositionDelta.getDescriptor()

  public override val parser: Parser<Exchange.PositionDelta> = Exchange.PositionDelta.parser()

  public override fun convert(obj: Exchange.PositionDelta): PositionDelta = PositionDelta(
  	isLong = obj.getIsLong(),
  	executionQuantity = obj.getExecutionQuantity(),
  	executionMargin = obj.getExecutionMargin(),
  	executionPrice = obj.getExecutionPrice(),
  )

  public override fun convert(obj: PositionDelta): Exchange.PositionDelta {
    val builder = Exchange.PositionDelta.newBuilder()
    builder.setIsLong(obj.isLong)
    builder.setExecutionQuantity(obj.executionQuantity)
    builder.setExecutionMargin(obj.executionMargin)
    builder.setExecutionPrice(obj.executionPrice)
    return builder.build()
  }
}

public object DerivativeTradeLogJvmConverter :
    ProtobufTypeMapper<DerivativeTradeLog, Exchange.DerivativeTradeLog> {
  public override val descriptor: Descriptors.Descriptor =
      Exchange.DerivativeTradeLog.getDescriptor()

  public override val parser: Parser<Exchange.DerivativeTradeLog> =
      Exchange.DerivativeTradeLog.parser()

  public override fun convert(obj: Exchange.DerivativeTradeLog): DerivativeTradeLog =
      DerivativeTradeLog(
  	subaccountId = obj.getSubaccountId().toByteArray(),
  	positionDelta = PositionDeltaJvmConverter.convert(obj.getPositionDelta()),
  	payout = obj.getPayout(),
  	fee = obj.getFee(),
  	orderHash = obj.getOrderHash().toByteArray(),
  	feeRecipientAddress = obj.getFeeRecipientAddress().toByteArray(),
  	cid = obj.getCid(),
  )

  public override fun convert(obj: DerivativeTradeLog): Exchange.DerivativeTradeLog {
    val builder = Exchange.DerivativeTradeLog.newBuilder()
    builder.setSubaccountId(ByteString.copyFrom(obj.subaccountId))
    builder.setPositionDelta(PositionDeltaJvmConverter.convert(obj.positionDelta))
    builder.setPayout(obj.payout)
    builder.setFee(obj.fee)
    builder.setOrderHash(ByteString.copyFrom(obj.orderHash))
    builder.setFeeRecipientAddress(ByteString.copyFrom(obj.feeRecipientAddress))
    builder.setCid(obj.cid)
    return builder.build()
  }
}

public object SubaccountPositionJvmConverter :
    ProtobufTypeMapper<SubaccountPosition, Exchange.SubaccountPosition> {
  public override val descriptor: Descriptors.Descriptor =
      Exchange.SubaccountPosition.getDescriptor()

  public override val parser: Parser<Exchange.SubaccountPosition> =
      Exchange.SubaccountPosition.parser()

  public override fun convert(obj: Exchange.SubaccountPosition): SubaccountPosition =
      SubaccountPosition(
  	position = PositionJvmConverter.convert(obj.getPosition()),
  	subaccountId = obj.getSubaccountId().toByteArray(),
  )

  public override fun convert(obj: SubaccountPosition): Exchange.SubaccountPosition {
    val builder = Exchange.SubaccountPosition.newBuilder()
    builder.setPosition(PositionJvmConverter.convert(obj.position))
    builder.setSubaccountId(ByteString.copyFrom(obj.subaccountId))
    return builder.build()
  }
}

public object SubaccountDepositJvmConverter :
    ProtobufTypeMapper<SubaccountDeposit, Exchange.SubaccountDeposit> {
  public override val descriptor: Descriptors.Descriptor =
      Exchange.SubaccountDeposit.getDescriptor()

  public override val parser: Parser<Exchange.SubaccountDeposit> =
      Exchange.SubaccountDeposit.parser()

  public override fun convert(obj: Exchange.SubaccountDeposit): SubaccountDeposit =
      SubaccountDeposit(
  	subaccountId = obj.getSubaccountId().toByteArray(),
  	deposit = DepositJvmConverter.convert(obj.getDeposit()),
  )

  public override fun convert(obj: SubaccountDeposit): Exchange.SubaccountDeposit {
    val builder = Exchange.SubaccountDeposit.newBuilder()
    builder.setSubaccountId(ByteString.copyFrom(obj.subaccountId))
    builder.setDeposit(DepositJvmConverter.convert(obj.deposit))
    return builder.build()
  }
}

public object DepositUpdateJvmConverter : ProtobufTypeMapper<DepositUpdate, Exchange.DepositUpdate>
    {
  public override val descriptor: Descriptors.Descriptor = Exchange.DepositUpdate.getDescriptor()

  public override val parser: Parser<Exchange.DepositUpdate> = Exchange.DepositUpdate.parser()

  public override fun convert(obj: Exchange.DepositUpdate): DepositUpdate = DepositUpdate(
  	denom = obj.getDenom(),
  	deposits = obj.getDepositsList().map { SubaccountDepositJvmConverter.convert(it) },
  )

  public override fun convert(obj: DepositUpdate): Exchange.DepositUpdate {
    val builder = Exchange.DepositUpdate.newBuilder()
    builder.setDenom(obj.denom)
    builder.addAllDeposits(obj.deposits.map { SubaccountDepositJvmConverter.convert(it) })
    return builder.build()
  }
}

public object PointsMultiplierJvmConverter :
    ProtobufTypeMapper<PointsMultiplier, Exchange.PointsMultiplier> {
  public override val descriptor: Descriptors.Descriptor = Exchange.PointsMultiplier.getDescriptor()

  public override val parser: Parser<Exchange.PointsMultiplier> = Exchange.PointsMultiplier.parser()

  public override fun convert(obj: Exchange.PointsMultiplier): PointsMultiplier = PointsMultiplier(
  	makerPointsMultiplier = obj.getMakerPointsMultiplier(),
  	takerPointsMultiplier = obj.getTakerPointsMultiplier(),
  )

  public override fun convert(obj: PointsMultiplier): Exchange.PointsMultiplier {
    val builder = Exchange.PointsMultiplier.newBuilder()
    builder.setMakerPointsMultiplier(obj.makerPointsMultiplier)
    builder.setTakerPointsMultiplier(obj.takerPointsMultiplier)
    return builder.build()
  }
}

public object TradingRewardCampaignBoostInfoJvmConverter :
    ProtobufTypeMapper<TradingRewardCampaignBoostInfo, Exchange.TradingRewardCampaignBoostInfo> {
  public override val descriptor: Descriptors.Descriptor =
      Exchange.TradingRewardCampaignBoostInfo.getDescriptor()

  public override val parser: Parser<Exchange.TradingRewardCampaignBoostInfo> =
      Exchange.TradingRewardCampaignBoostInfo.parser()

  public override fun convert(obj: Exchange.TradingRewardCampaignBoostInfo):
      TradingRewardCampaignBoostInfo = TradingRewardCampaignBoostInfo(
  	boostedSpotMarketIds = obj.getBoostedSpotMarketIdsList().map { it },
  	spotMarketMultipliers = obj.getSpotMarketMultipliersList().map {
      PointsMultiplierJvmConverter.convert(it) },
  	boostedDerivativeMarketIds = obj.getBoostedDerivativeMarketIdsList().map { it },
  	derivativeMarketMultipliers = obj.getDerivativeMarketMultipliersList().map {
      PointsMultiplierJvmConverter.convert(it) },
  )

  public override fun convert(obj: TradingRewardCampaignBoostInfo):
      Exchange.TradingRewardCampaignBoostInfo {
    val builder = Exchange.TradingRewardCampaignBoostInfo.newBuilder()
    builder.addAllBoostedSpotMarketIds(obj.boostedSpotMarketIds.map { it })
    builder.addAllSpotMarketMultipliers(obj.spotMarketMultipliers.map {
        PointsMultiplierJvmConverter.convert(it) })
    builder.addAllBoostedDerivativeMarketIds(obj.boostedDerivativeMarketIds.map { it })
    builder.addAllDerivativeMarketMultipliers(obj.derivativeMarketMultipliers.map {
        PointsMultiplierJvmConverter.convert(it) })
    return builder.build()
  }
}

public object CampaignRewardPoolJvmConverter :
    ProtobufTypeMapper<CampaignRewardPool, Exchange.CampaignRewardPool> {
  public override val descriptor: Descriptors.Descriptor =
      Exchange.CampaignRewardPool.getDescriptor()

  public override val parser: Parser<Exchange.CampaignRewardPool> =
      Exchange.CampaignRewardPool.parser()

  public override fun convert(obj: Exchange.CampaignRewardPool): CampaignRewardPool =
      CampaignRewardPool(
  	startTimestamp = obj.getStartTimestamp(),
  	maxCampaignRewards = obj.getMaxCampaignRewardsList().map { CoinJvmConverter.convert(it) },
  )

  public override fun convert(obj: CampaignRewardPool): Exchange.CampaignRewardPool {
    val builder = Exchange.CampaignRewardPool.newBuilder()
    builder.setStartTimestamp(obj.startTimestamp)
    builder.addAllMaxCampaignRewards(obj.maxCampaignRewards.map { CoinJvmConverter.convert(it) })
    return builder.build()
  }
}

public object TradingRewardCampaignInfoJvmConverter :
    ProtobufTypeMapper<TradingRewardCampaignInfo, Exchange.TradingRewardCampaignInfo> {
  public override val descriptor: Descriptors.Descriptor =
      Exchange.TradingRewardCampaignInfo.getDescriptor()

  public override val parser: Parser<Exchange.TradingRewardCampaignInfo> =
      Exchange.TradingRewardCampaignInfo.parser()

  public override fun convert(obj: Exchange.TradingRewardCampaignInfo): TradingRewardCampaignInfo =
      TradingRewardCampaignInfo(
  	campaignDurationSeconds = obj.getCampaignDurationSeconds(),
  	quoteDenoms = obj.getQuoteDenomsList().map { it },
  	tradingRewardBoostInfo =
      TradingRewardCampaignBoostInfoJvmConverter.convert(obj.getTradingRewardBoostInfo()),
  	disqualifiedMarketIds = obj.getDisqualifiedMarketIdsList().map { it },
  )

  public override fun convert(obj: TradingRewardCampaignInfo): Exchange.TradingRewardCampaignInfo {
    val builder = Exchange.TradingRewardCampaignInfo.newBuilder()
    builder.setCampaignDurationSeconds(obj.campaignDurationSeconds)
    builder.addAllQuoteDenoms(obj.quoteDenoms.map { it })
    builder.setTradingRewardBoostInfo(TradingRewardCampaignBoostInfoJvmConverter.convert(obj.tradingRewardBoostInfo))
    builder.addAllDisqualifiedMarketIds(obj.disqualifiedMarketIds.map { it })
    return builder.build()
  }
}

public object FeeDiscountTierInfoJvmConverter :
    ProtobufTypeMapper<FeeDiscountTierInfo, Exchange.FeeDiscountTierInfo> {
  public override val descriptor: Descriptors.Descriptor =
      Exchange.FeeDiscountTierInfo.getDescriptor()

  public override val parser: Parser<Exchange.FeeDiscountTierInfo> =
      Exchange.FeeDiscountTierInfo.parser()

  public override fun convert(obj: Exchange.FeeDiscountTierInfo): FeeDiscountTierInfo =
      FeeDiscountTierInfo(
  	makerDiscountRate = obj.getMakerDiscountRate(),
  	takerDiscountRate = obj.getTakerDiscountRate(),
  	stakedAmount = obj.getStakedAmount(),
  	volume = obj.getVolume(),
  )

  public override fun convert(obj: FeeDiscountTierInfo): Exchange.FeeDiscountTierInfo {
    val builder = Exchange.FeeDiscountTierInfo.newBuilder()
    builder.setMakerDiscountRate(obj.makerDiscountRate)
    builder.setTakerDiscountRate(obj.takerDiscountRate)
    builder.setStakedAmount(obj.stakedAmount)
    builder.setVolume(obj.volume)
    return builder.build()
  }
}

public object FeeDiscountScheduleJvmConverter :
    ProtobufTypeMapper<FeeDiscountSchedule, Exchange.FeeDiscountSchedule> {
  public override val descriptor: Descriptors.Descriptor =
      Exchange.FeeDiscountSchedule.getDescriptor()

  public override val parser: Parser<Exchange.FeeDiscountSchedule> =
      Exchange.FeeDiscountSchedule.parser()

  public override fun convert(obj: Exchange.FeeDiscountSchedule): FeeDiscountSchedule =
      FeeDiscountSchedule(
  	bucketCount = obj.getBucketCount().asKotlinType,
  	bucketDuration = obj.getBucketDuration(),
  	quoteDenoms = obj.getQuoteDenomsList().map { it },
  	tierInfos = obj.getTierInfosList().map { FeeDiscountTierInfoJvmConverter.convert(it) },
  	disqualifiedMarketIds = obj.getDisqualifiedMarketIdsList().map { it },
  )

  public override fun convert(obj: FeeDiscountSchedule): Exchange.FeeDiscountSchedule {
    val builder = Exchange.FeeDiscountSchedule.newBuilder()
    builder.setBucketCount(obj.bucketCount.asJavaType)
    builder.setBucketDuration(obj.bucketDuration)
    builder.addAllQuoteDenoms(obj.quoteDenoms.map { it })
    builder.addAllTierInfos(obj.tierInfos.map { FeeDiscountTierInfoJvmConverter.convert(it) })
    builder.addAllDisqualifiedMarketIds(obj.disqualifiedMarketIds.map { it })
    return builder.build()
  }
}

public object FeeDiscountTierTTLJvmConverter :
    ProtobufTypeMapper<FeeDiscountTierTTL, Exchange.FeeDiscountTierTTL> {
  public override val descriptor: Descriptors.Descriptor =
      Exchange.FeeDiscountTierTTL.getDescriptor()

  public override val parser: Parser<Exchange.FeeDiscountTierTTL> =
      Exchange.FeeDiscountTierTTL.parser()

  public override fun convert(obj: Exchange.FeeDiscountTierTTL): FeeDiscountTierTTL =
      FeeDiscountTierTTL(
  	tier = obj.getTier().asKotlinType,
  	ttlTimestamp = obj.getTtlTimestamp(),
  )

  public override fun convert(obj: FeeDiscountTierTTL): Exchange.FeeDiscountTierTTL {
    val builder = Exchange.FeeDiscountTierTTL.newBuilder()
    builder.setTier(obj.tier.asJavaType)
    builder.setTtlTimestamp(obj.ttlTimestamp)
    return builder.build()
  }
}

public object VolumeRecordJvmConverter : ProtobufTypeMapper<VolumeRecord, Exchange.VolumeRecord> {
  public override val descriptor: Descriptors.Descriptor = Exchange.VolumeRecord.getDescriptor()

  public override val parser: Parser<Exchange.VolumeRecord> = Exchange.VolumeRecord.parser()

  public override fun convert(obj: Exchange.VolumeRecord): VolumeRecord = VolumeRecord(
  	makerVolume = obj.getMakerVolume(),
  	takerVolume = obj.getTakerVolume(),
  )

  public override fun convert(obj: VolumeRecord): Exchange.VolumeRecord {
    val builder = Exchange.VolumeRecord.newBuilder()
    builder.setMakerVolume(obj.makerVolume)
    builder.setTakerVolume(obj.takerVolume)
    return builder.build()
  }
}

public object AccountRewardsJvmConverter :
    ProtobufTypeMapper<AccountRewards, Exchange.AccountRewards> {
  public override val descriptor: Descriptors.Descriptor = Exchange.AccountRewards.getDescriptor()

  public override val parser: Parser<Exchange.AccountRewards> = Exchange.AccountRewards.parser()

  public override fun convert(obj: Exchange.AccountRewards): AccountRewards = AccountRewards(
  	account = obj.getAccount(),
  	rewards = obj.getRewardsList().map { CoinJvmConverter.convert(it) },
  )

  public override fun convert(obj: AccountRewards): Exchange.AccountRewards {
    val builder = Exchange.AccountRewards.newBuilder()
    builder.setAccount(obj.account)
    builder.addAllRewards(obj.rewards.map { CoinJvmConverter.convert(it) })
    return builder.build()
  }
}

public object TradeRecordsJvmConverter : ProtobufTypeMapper<TradeRecords, Exchange.TradeRecords> {
  public override val descriptor: Descriptors.Descriptor = Exchange.TradeRecords.getDescriptor()

  public override val parser: Parser<Exchange.TradeRecords> = Exchange.TradeRecords.parser()

  public override fun convert(obj: Exchange.TradeRecords): TradeRecords = TradeRecords(
  	marketId = obj.getMarketId(),
  	latestTradeRecords = obj.getLatestTradeRecordsList().map { TradeRecordJvmConverter.convert(it) },
  )

  public override fun convert(obj: TradeRecords): Exchange.TradeRecords {
    val builder = Exchange.TradeRecords.newBuilder()
    builder.setMarketId(obj.marketId)
    builder.addAllLatestTradeRecords(obj.latestTradeRecords.map {
        TradeRecordJvmConverter.convert(it) })
    return builder.build()
  }
}

public object SubaccountIDsJvmConverter : ProtobufTypeMapper<SubaccountIDs, Exchange.SubaccountIDs>
    {
  public override val descriptor: Descriptors.Descriptor = Exchange.SubaccountIDs.getDescriptor()

  public override val parser: Parser<Exchange.SubaccountIDs> = Exchange.SubaccountIDs.parser()

  public override fun convert(obj: Exchange.SubaccountIDs): SubaccountIDs = SubaccountIDs(
  	subaccountIds = obj.getSubaccountIdsList().map { it.toByteArray() },
  )

  public override fun convert(obj: SubaccountIDs): Exchange.SubaccountIDs {
    val builder = Exchange.SubaccountIDs.newBuilder()
    builder.addAllSubaccountIds(obj.subaccountIds.map { ByteString.copyFrom(it) })
    return builder.build()
  }
}

public object TradeRecordJvmConverter : ProtobufTypeMapper<TradeRecord, Exchange.TradeRecord> {
  public override val descriptor: Descriptors.Descriptor = Exchange.TradeRecord.getDescriptor()

  public override val parser: Parser<Exchange.TradeRecord> = Exchange.TradeRecord.parser()

  public override fun convert(obj: Exchange.TradeRecord): TradeRecord = TradeRecord(
  	timestamp = obj.getTimestamp(),
  	price = obj.getPrice(),
  	quantity = obj.getQuantity(),
  )

  public override fun convert(obj: TradeRecord): Exchange.TradeRecord {
    val builder = Exchange.TradeRecord.newBuilder()
    builder.setTimestamp(obj.timestamp)
    builder.setPrice(obj.price)
    builder.setQuantity(obj.quantity)
    return builder.build()
  }
}

public object LevelJvmConverter : ProtobufTypeMapper<Level, Exchange.Level> {
  public override val descriptor: Descriptors.Descriptor = Exchange.Level.getDescriptor()

  public override val parser: Parser<Exchange.Level> = Exchange.Level.parser()

  public override fun convert(obj: Exchange.Level): Level = Level(
  	p = obj.getP(),
  	q = obj.getQ(),
  )

  public override fun convert(obj: Level): Exchange.Level {
    val builder = Exchange.Level.newBuilder()
    builder.setP(obj.p)
    builder.setQ(obj.q)
    return builder.build()
  }
}

public object AggregateSubaccountVolumeRecordJvmConverter :
    ProtobufTypeMapper<AggregateSubaccountVolumeRecord, Exchange.AggregateSubaccountVolumeRecord> {
  public override val descriptor: Descriptors.Descriptor =
      Exchange.AggregateSubaccountVolumeRecord.getDescriptor()

  public override val parser: Parser<Exchange.AggregateSubaccountVolumeRecord> =
      Exchange.AggregateSubaccountVolumeRecord.parser()

  public override fun convert(obj: Exchange.AggregateSubaccountVolumeRecord):
      AggregateSubaccountVolumeRecord = AggregateSubaccountVolumeRecord(
  	subaccountId = obj.getSubaccountId(),
  	marketVolumes = obj.getMarketVolumesList().map { MarketVolumeJvmConverter.convert(it) },
  )

  public override fun convert(obj: AggregateSubaccountVolumeRecord):
      Exchange.AggregateSubaccountVolumeRecord {
    val builder = Exchange.AggregateSubaccountVolumeRecord.newBuilder()
    builder.setSubaccountId(obj.subaccountId)
    builder.addAllMarketVolumes(obj.marketVolumes.map { MarketVolumeJvmConverter.convert(it) })
    return builder.build()
  }
}

public object AggregateAccountVolumeRecordJvmConverter :
    ProtobufTypeMapper<AggregateAccountVolumeRecord, Exchange.AggregateAccountVolumeRecord> {
  public override val descriptor: Descriptors.Descriptor =
      Exchange.AggregateAccountVolumeRecord.getDescriptor()

  public override val parser: Parser<Exchange.AggregateAccountVolumeRecord> =
      Exchange.AggregateAccountVolumeRecord.parser()

  public override fun convert(obj: Exchange.AggregateAccountVolumeRecord):
      AggregateAccountVolumeRecord = AggregateAccountVolumeRecord(
  	account = obj.getAccount(),
  	marketVolumes = obj.getMarketVolumesList().map { MarketVolumeJvmConverter.convert(it) },
  )

  public override fun convert(obj: AggregateAccountVolumeRecord):
      Exchange.AggregateAccountVolumeRecord {
    val builder = Exchange.AggregateAccountVolumeRecord.newBuilder()
    builder.setAccount(obj.account)
    builder.addAllMarketVolumes(obj.marketVolumes.map { MarketVolumeJvmConverter.convert(it) })
    return builder.build()
  }
}

public object MarketVolumeJvmConverter : ProtobufTypeMapper<MarketVolume, Exchange.MarketVolume> {
  public override val descriptor: Descriptors.Descriptor = Exchange.MarketVolume.getDescriptor()

  public override val parser: Parser<Exchange.MarketVolume> = Exchange.MarketVolume.parser()

  public override fun convert(obj: Exchange.MarketVolume): MarketVolume = MarketVolume(
  	marketId = obj.getMarketId(),
  	volume = VolumeRecordJvmConverter.convert(obj.getVolume()),
  )

  public override fun convert(obj: MarketVolume): Exchange.MarketVolume {
    val builder = Exchange.MarketVolume.newBuilder()
    builder.setMarketId(obj.marketId)
    builder.setVolume(VolumeRecordJvmConverter.convert(obj.volume))
    return builder.build()
  }
}

public object DenomDecimalsJvmConverter : ProtobufTypeMapper<DenomDecimals, Exchange.DenomDecimals>
    {
  public override val descriptor: Descriptors.Descriptor = Exchange.DenomDecimals.getDescriptor()

  public override val parser: Parser<Exchange.DenomDecimals> = Exchange.DenomDecimals.parser()

  public override fun convert(obj: Exchange.DenomDecimals): DenomDecimals = DenomDecimals(
  	denom = obj.getDenom(),
  	decimals = obj.getDecimals().asKotlinType,
  )

  public override fun convert(obj: DenomDecimals): Exchange.DenomDecimals {
    val builder = Exchange.DenomDecimals.newBuilder()
    builder.setDenom(obj.denom)
    builder.setDecimals(obj.decimals.asJavaType)
    return builder.build()
  }
}
