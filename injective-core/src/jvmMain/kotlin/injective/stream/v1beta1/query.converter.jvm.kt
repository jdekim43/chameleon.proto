// Transform from injective/stream/v1beta1/query.proto
@file:GeneratorVersion(version = "0.3.1")

package injective.stream.v1beta1

import com.google.protobuf.ByteString
import com.google.protobuf.Descriptors
import com.google.protobuf.Parser
import cosmos.base.v1beta1.CoinJvmConverter
import injective.exchange.v1beta1.DepositJvmConverter
import injective.exchange.v1beta1.DerivativeLimitOrderJvmConverter
import injective.exchange.v1beta1.LevelJvmConverter
import injective.exchange.v1beta1.PositionDeltaJvmConverter
import injective.exchange.v1beta1.SpotLimitOrderJvmConverter
import kr.jadekim.protobuf.`annotation`.GeneratorVersion
import kr.jadekim.protobuf.converter.mapper.ProtobufTypeMapper
import kr.jadekim.protobuf.util.asJavaType
import kr.jadekim.protobuf.util.asKotlinType

public object StreamRequestJvmConverter : ProtobufTypeMapper<StreamRequest, Query.StreamRequest> {
  public override val descriptor: Descriptors.Descriptor = Query.StreamRequest.getDescriptor()

  public override val parser: Parser<Query.StreamRequest> = Query.StreamRequest.parser()

  public override fun convert(obj: Query.StreamRequest): StreamRequest = StreamRequest(
  	bankBalancesFilter = BankBalancesFilterJvmConverter.convert(obj.getBankBalancesFilter()),
  	subaccountDepositsFilter =
      SubaccountDepositsFilterJvmConverter.convert(obj.getSubaccountDepositsFilter()),
  	spotTradesFilter = TradesFilterJvmConverter.convert(obj.getSpotTradesFilter()),
  	derivativeTradesFilter = TradesFilterJvmConverter.convert(obj.getDerivativeTradesFilter()),
  	spotOrdersFilter = OrdersFilterJvmConverter.convert(obj.getSpotOrdersFilter()),
  	derivativeOrdersFilter = OrdersFilterJvmConverter.convert(obj.getDerivativeOrdersFilter()),
  	spotOrderbooksFilter = OrderbookFilterJvmConverter.convert(obj.getSpotOrderbooksFilter()),
  	derivativeOrderbooksFilter =
      OrderbookFilterJvmConverter.convert(obj.getDerivativeOrderbooksFilter()),
  	positionsFilter = PositionsFilterJvmConverter.convert(obj.getPositionsFilter()),
  	oraclePriceFilter = OraclePriceFilterJvmConverter.convert(obj.getOraclePriceFilter()),
  )

  public override fun convert(obj: StreamRequest): Query.StreamRequest {
    val builder = Query.StreamRequest.newBuilder()
    builder.setBankBalancesFilter(BankBalancesFilterJvmConverter.convert(obj.bankBalancesFilter))
    builder.setSubaccountDepositsFilter(SubaccountDepositsFilterJvmConverter.convert(obj.subaccountDepositsFilter))
    builder.setSpotTradesFilter(TradesFilterJvmConverter.convert(obj.spotTradesFilter))
    builder.setDerivativeTradesFilter(TradesFilterJvmConverter.convert(obj.derivativeTradesFilter))
    builder.setSpotOrdersFilter(OrdersFilterJvmConverter.convert(obj.spotOrdersFilter))
    builder.setDerivativeOrdersFilter(OrdersFilterJvmConverter.convert(obj.derivativeOrdersFilter))
    builder.setSpotOrderbooksFilter(OrderbookFilterJvmConverter.convert(obj.spotOrderbooksFilter))
    builder.setDerivativeOrderbooksFilter(OrderbookFilterJvmConverter.convert(obj.derivativeOrderbooksFilter))
    builder.setPositionsFilter(PositionsFilterJvmConverter.convert(obj.positionsFilter))
    builder.setOraclePriceFilter(OraclePriceFilterJvmConverter.convert(obj.oraclePriceFilter))
    return builder.build()
  }
}

public object StreamResponseJvmConverter : ProtobufTypeMapper<StreamResponse, Query.StreamResponse>
    {
  public override val descriptor: Descriptors.Descriptor = Query.StreamResponse.getDescriptor()

  public override val parser: Parser<Query.StreamResponse> = Query.StreamResponse.parser()

  public override fun convert(obj: Query.StreamResponse): StreamResponse = StreamResponse(
  	blockHeight = obj.getBlockHeight().asKotlinType,
  	blockTime = obj.getBlockTime(),
  	bankBalances = obj.getBankBalancesList().map { BankBalanceJvmConverter.convert(it) },
  	subaccountDeposits = obj.getSubaccountDepositsList().map {
      SubaccountDepositsJvmConverter.convert(it) },
  	spotTrades = obj.getSpotTradesList().map { SpotTradeJvmConverter.convert(it) },
  	derivativeTrades = obj.getDerivativeTradesList().map { DerivativeTradeJvmConverter.convert(it) },
  	spotOrders = obj.getSpotOrdersList().map { SpotOrderUpdateJvmConverter.convert(it) },
  	derivativeOrders = obj.getDerivativeOrdersList().map {
      DerivativeOrderUpdateJvmConverter.convert(it) },
  	spotOrderbookUpdates = obj.getSpotOrderbookUpdatesList().map {
      OrderbookUpdateJvmConverter.convert(it) },
  	derivativeOrderbookUpdates = obj.getDerivativeOrderbookUpdatesList().map {
      OrderbookUpdateJvmConverter.convert(it) },
  	positions = obj.getPositionsList().map { PositionJvmConverter.convert(it) },
  	oraclePrices = obj.getOraclePricesList().map { OraclePriceJvmConverter.convert(it) },
  )

  public override fun convert(obj: StreamResponse): Query.StreamResponse {
    val builder = Query.StreamResponse.newBuilder()
    builder.setBlockHeight(obj.blockHeight.asJavaType)
    builder.setBlockTime(obj.blockTime)
    builder.addAllBankBalances(obj.bankBalances.map { BankBalanceJvmConverter.convert(it) })
    builder.addAllSubaccountDeposits(obj.subaccountDeposits.map {
        SubaccountDepositsJvmConverter.convert(it) })
    builder.addAllSpotTrades(obj.spotTrades.map { SpotTradeJvmConverter.convert(it) })
    builder.addAllDerivativeTrades(obj.derivativeTrades.map {
        DerivativeTradeJvmConverter.convert(it) })
    builder.addAllSpotOrders(obj.spotOrders.map { SpotOrderUpdateJvmConverter.convert(it) })
    builder.addAllDerivativeOrders(obj.derivativeOrders.map {
        DerivativeOrderUpdateJvmConverter.convert(it) })
    builder.addAllSpotOrderbookUpdates(obj.spotOrderbookUpdates.map {
        OrderbookUpdateJvmConverter.convert(it) })
    builder.addAllDerivativeOrderbookUpdates(obj.derivativeOrderbookUpdates.map {
        OrderbookUpdateJvmConverter.convert(it) })
    builder.addAllPositions(obj.positions.map { PositionJvmConverter.convert(it) })
    builder.addAllOraclePrices(obj.oraclePrices.map { OraclePriceJvmConverter.convert(it) })
    return builder.build()
  }
}

public object OrderbookUpdateJvmConverter :
    ProtobufTypeMapper<OrderbookUpdate, Query.OrderbookUpdate> {
  public override val descriptor: Descriptors.Descriptor = Query.OrderbookUpdate.getDescriptor()

  public override val parser: Parser<Query.OrderbookUpdate> = Query.OrderbookUpdate.parser()

  public override fun convert(obj: Query.OrderbookUpdate): OrderbookUpdate = OrderbookUpdate(
  	seq = obj.getSeq().asKotlinType,
  	orderbook = OrderbookJvmConverter.convert(obj.getOrderbook()),
  )

  public override fun convert(obj: OrderbookUpdate): Query.OrderbookUpdate {
    val builder = Query.OrderbookUpdate.newBuilder()
    builder.setSeq(obj.seq.asJavaType)
    builder.setOrderbook(OrderbookJvmConverter.convert(obj.orderbook))
    return builder.build()
  }
}

public object OrderbookJvmConverter : ProtobufTypeMapper<Orderbook, Query.Orderbook> {
  public override val descriptor: Descriptors.Descriptor = Query.Orderbook.getDescriptor()

  public override val parser: Parser<Query.Orderbook> = Query.Orderbook.parser()

  public override fun convert(obj: Query.Orderbook): Orderbook = Orderbook(
  	marketId = obj.getMarketId(),
  	buyLevels = obj.getBuyLevelsList().map { LevelJvmConverter.convert(it) },
  	sellLevels = obj.getSellLevelsList().map { LevelJvmConverter.convert(it) },
  )

  public override fun convert(obj: Orderbook): Query.Orderbook {
    val builder = Query.Orderbook.newBuilder()
    builder.setMarketId(obj.marketId)
    builder.addAllBuyLevels(obj.buyLevels.map { LevelJvmConverter.convert(it) })
    builder.addAllSellLevels(obj.sellLevels.map { LevelJvmConverter.convert(it) })
    return builder.build()
  }
}

public object BankBalanceJvmConverter : ProtobufTypeMapper<BankBalance, Query.BankBalance> {
  public override val descriptor: Descriptors.Descriptor = Query.BankBalance.getDescriptor()

  public override val parser: Parser<Query.BankBalance> = Query.BankBalance.parser()

  public override fun convert(obj: Query.BankBalance): BankBalance = BankBalance(
  	account = obj.getAccount(),
  	balances = obj.getBalancesList().map { CoinJvmConverter.convert(it) },
  )

  public override fun convert(obj: BankBalance): Query.BankBalance {
    val builder = Query.BankBalance.newBuilder()
    builder.setAccount(obj.account)
    builder.addAllBalances(obj.balances.map { CoinJvmConverter.convert(it) })
    return builder.build()
  }
}

public object SubaccountDepositsJvmConverter :
    ProtobufTypeMapper<SubaccountDeposits, Query.SubaccountDeposits> {
  public override val descriptor: Descriptors.Descriptor = Query.SubaccountDeposits.getDescriptor()

  public override val parser: Parser<Query.SubaccountDeposits> = Query.SubaccountDeposits.parser()

  public override fun convert(obj: Query.SubaccountDeposits): SubaccountDeposits =
      SubaccountDeposits(
  	subaccountId = obj.getSubaccountId(),
  	deposits = obj.getDepositsList().map { SubaccountDepositJvmConverter.convert(it) },
  )

  public override fun convert(obj: SubaccountDeposits): Query.SubaccountDeposits {
    val builder = Query.SubaccountDeposits.newBuilder()
    builder.setSubaccountId(obj.subaccountId)
    builder.addAllDeposits(obj.deposits.map { SubaccountDepositJvmConverter.convert(it) })
    return builder.build()
  }
}

public object SubaccountDepositJvmConverter :
    ProtobufTypeMapper<SubaccountDeposit, Query.SubaccountDeposit> {
  public override val descriptor: Descriptors.Descriptor = Query.SubaccountDeposit.getDescriptor()

  public override val parser: Parser<Query.SubaccountDeposit> = Query.SubaccountDeposit.parser()

  public override fun convert(obj: Query.SubaccountDeposit): SubaccountDeposit = SubaccountDeposit(
  	denom = obj.getDenom(),
  	deposit = DepositJvmConverter.convert(obj.getDeposit()),
  )

  public override fun convert(obj: SubaccountDeposit): Query.SubaccountDeposit {
    val builder = Query.SubaccountDeposit.newBuilder()
    builder.setDenom(obj.denom)
    builder.setDeposit(DepositJvmConverter.convert(obj.deposit))
    return builder.build()
  }
}

public object SpotOrderUpdateJvmConverter :
    ProtobufTypeMapper<SpotOrderUpdate, Query.SpotOrderUpdate> {
  public override val descriptor: Descriptors.Descriptor = Query.SpotOrderUpdate.getDescriptor()

  public override val parser: Parser<Query.SpotOrderUpdate> = Query.SpotOrderUpdate.parser()

  public override fun convert(obj: Query.SpotOrderUpdate): SpotOrderUpdate = SpotOrderUpdate(
  	status = OrderUpdateStatus.forNumber(obj.getStatus().number),
  	orderHash = obj.getOrderHash().toByteArray(),
  	cid = obj.getCid(),
  	order = SpotOrderJvmConverter.convert(obj.getOrder()),
  )

  public override fun convert(obj: SpotOrderUpdate): Query.SpotOrderUpdate {
    val builder = Query.SpotOrderUpdate.newBuilder()
    builder.setStatus(Query.OrderUpdateStatus.forNumber(obj.status.number))
    builder.setOrderHash(ByteString.copyFrom(obj.orderHash))
    builder.setCid(obj.cid)
    builder.setOrder(SpotOrderJvmConverter.convert(obj.order))
    return builder.build()
  }
}

public object SpotOrderJvmConverter : ProtobufTypeMapper<SpotOrder, Query.SpotOrder> {
  public override val descriptor: Descriptors.Descriptor = Query.SpotOrder.getDescriptor()

  public override val parser: Parser<Query.SpotOrder> = Query.SpotOrder.parser()

  public override fun convert(obj: Query.SpotOrder): SpotOrder = SpotOrder(
  	marketId = obj.getMarketId(),
  	order = SpotLimitOrderJvmConverter.convert(obj.getOrder()),
  )

  public override fun convert(obj: SpotOrder): Query.SpotOrder {
    val builder = Query.SpotOrder.newBuilder()
    builder.setMarketId(obj.marketId)
    builder.setOrder(SpotLimitOrderJvmConverter.convert(obj.order))
    return builder.build()
  }
}

public object DerivativeOrderUpdateJvmConverter :
    ProtobufTypeMapper<DerivativeOrderUpdate, Query.DerivativeOrderUpdate> {
  public override val descriptor: Descriptors.Descriptor =
      Query.DerivativeOrderUpdate.getDescriptor()

  public override val parser: Parser<Query.DerivativeOrderUpdate> =
      Query.DerivativeOrderUpdate.parser()

  public override fun convert(obj: Query.DerivativeOrderUpdate): DerivativeOrderUpdate =
      DerivativeOrderUpdate(
  	status = OrderUpdateStatus.forNumber(obj.getStatus().number),
  	orderHash = obj.getOrderHash().toByteArray(),
  	cid = obj.getCid(),
  	order = DerivativeOrderJvmConverter.convert(obj.getOrder()),
  )

  public override fun convert(obj: DerivativeOrderUpdate): Query.DerivativeOrderUpdate {
    val builder = Query.DerivativeOrderUpdate.newBuilder()
    builder.setStatus(Query.OrderUpdateStatus.forNumber(obj.status.number))
    builder.setOrderHash(ByteString.copyFrom(obj.orderHash))
    builder.setCid(obj.cid)
    builder.setOrder(DerivativeOrderJvmConverter.convert(obj.order))
    return builder.build()
  }
}

public object DerivativeOrderJvmConverter :
    ProtobufTypeMapper<DerivativeOrder, Query.DerivativeOrder> {
  public override val descriptor: Descriptors.Descriptor = Query.DerivativeOrder.getDescriptor()

  public override val parser: Parser<Query.DerivativeOrder> = Query.DerivativeOrder.parser()

  public override fun convert(obj: Query.DerivativeOrder): DerivativeOrder = DerivativeOrder(
  	marketId = obj.getMarketId(),
  	order = DerivativeLimitOrderJvmConverter.convert(obj.getOrder()),
  	isMarket = obj.getIsMarket(),
  )

  public override fun convert(obj: DerivativeOrder): Query.DerivativeOrder {
    val builder = Query.DerivativeOrder.newBuilder()
    builder.setMarketId(obj.marketId)
    builder.setOrder(DerivativeLimitOrderJvmConverter.convert(obj.order))
    builder.setIsMarket(obj.isMarket)
    return builder.build()
  }
}

public object PositionJvmConverter : ProtobufTypeMapper<Position, Query.Position> {
  public override val descriptor: Descriptors.Descriptor = Query.Position.getDescriptor()

  public override val parser: Parser<Query.Position> = Query.Position.parser()

  public override fun convert(obj: Query.Position): Position = Position(
  	marketId = obj.getMarketId(),
  	subaccountId = obj.getSubaccountId(),
  	isLong = obj.getIsLong(),
  	quantity = obj.getQuantity(),
  	entryPrice = obj.getEntryPrice(),
  	margin = obj.getMargin(),
  	cumulativeFundingEntry = obj.getCumulativeFundingEntry(),
  )

  public override fun convert(obj: Position): Query.Position {
    val builder = Query.Position.newBuilder()
    builder.setMarketId(obj.marketId)
    builder.setSubaccountId(obj.subaccountId)
    builder.setIsLong(obj.isLong)
    builder.setQuantity(obj.quantity)
    builder.setEntryPrice(obj.entryPrice)
    builder.setMargin(obj.margin)
    builder.setCumulativeFundingEntry(obj.cumulativeFundingEntry)
    return builder.build()
  }
}

public object OraclePriceJvmConverter : ProtobufTypeMapper<OraclePrice, Query.OraclePrice> {
  public override val descriptor: Descriptors.Descriptor = Query.OraclePrice.getDescriptor()

  public override val parser: Parser<Query.OraclePrice> = Query.OraclePrice.parser()

  public override fun convert(obj: Query.OraclePrice): OraclePrice = OraclePrice(
  	symbol = obj.getSymbol(),
  	price = obj.getPrice(),
  	type = obj.getType(),
  )

  public override fun convert(obj: OraclePrice): Query.OraclePrice {
    val builder = Query.OraclePrice.newBuilder()
    builder.setSymbol(obj.symbol)
    builder.setPrice(obj.price)
    builder.setType(obj.type)
    return builder.build()
  }
}

public object SpotTradeJvmConverter : ProtobufTypeMapper<SpotTrade, Query.SpotTrade> {
  public override val descriptor: Descriptors.Descriptor = Query.SpotTrade.getDescriptor()

  public override val parser: Parser<Query.SpotTrade> = Query.SpotTrade.parser()

  public override fun convert(obj: Query.SpotTrade): SpotTrade = SpotTrade(
  	marketId = obj.getMarketId(),
  	isBuy = obj.getIsBuy(),
  	executionType = obj.getExecutionType(),
  	quantity = obj.getQuantity(),
  	price = obj.getPrice(),
  	subaccountId = obj.getSubaccountId(),
  	fee = obj.getFee(),
  	orderHash = obj.getOrderHash().toByteArray(),
  	feeRecipientAddress = obj.getFeeRecipientAddress(),
  	cid = obj.getCid(),
  	tradeId = obj.getTradeId(),
  )

  public override fun convert(obj: SpotTrade): Query.SpotTrade {
    val builder = Query.SpotTrade.newBuilder()
    builder.setMarketId(obj.marketId)
    builder.setIsBuy(obj.isBuy)
    builder.setExecutionType(obj.executionType)
    builder.setQuantity(obj.quantity)
    builder.setPrice(obj.price)
    builder.setSubaccountId(obj.subaccountId)
    builder.setFee(obj.fee)
    builder.setOrderHash(ByteString.copyFrom(obj.orderHash))
    builder.setFeeRecipientAddress(obj.feeRecipientAddress)
    builder.setCid(obj.cid)
    builder.setTradeId(obj.tradeId)
    return builder.build()
  }
}

public object DerivativeTradeJvmConverter :
    ProtobufTypeMapper<DerivativeTrade, Query.DerivativeTrade> {
  public override val descriptor: Descriptors.Descriptor = Query.DerivativeTrade.getDescriptor()

  public override val parser: Parser<Query.DerivativeTrade> = Query.DerivativeTrade.parser()

  public override fun convert(obj: Query.DerivativeTrade): DerivativeTrade = DerivativeTrade(
  	marketId = obj.getMarketId(),
  	isBuy = obj.getIsBuy(),
  	executionType = obj.getExecutionType(),
  	subaccountId = obj.getSubaccountId(),
  	positionDelta = PositionDeltaJvmConverter.convert(obj.getPositionDelta()),
  	payout = obj.getPayout(),
  	fee = obj.getFee(),
  	orderHash = obj.getOrderHash(),
  	feeRecipientAddress = obj.getFeeRecipientAddress(),
  	cid = obj.getCid(),
  	tradeId = obj.getTradeId(),
  )

  public override fun convert(obj: DerivativeTrade): Query.DerivativeTrade {
    val builder = Query.DerivativeTrade.newBuilder()
    builder.setMarketId(obj.marketId)
    builder.setIsBuy(obj.isBuy)
    builder.setExecutionType(obj.executionType)
    builder.setSubaccountId(obj.subaccountId)
    builder.setPositionDelta(PositionDeltaJvmConverter.convert(obj.positionDelta))
    builder.setPayout(obj.payout)
    builder.setFee(obj.fee)
    builder.setOrderHash(obj.orderHash)
    builder.setFeeRecipientAddress(obj.feeRecipientAddress)
    builder.setCid(obj.cid)
    builder.setTradeId(obj.tradeId)
    return builder.build()
  }
}

public object TradesFilterJvmConverter : ProtobufTypeMapper<TradesFilter, Query.TradesFilter> {
  public override val descriptor: Descriptors.Descriptor = Query.TradesFilter.getDescriptor()

  public override val parser: Parser<Query.TradesFilter> = Query.TradesFilter.parser()

  public override fun convert(obj: Query.TradesFilter): TradesFilter = TradesFilter(
  	subaccountIds = obj.getSubaccountIdsList().map { it },
  	marketIds = obj.getMarketIdsList().map { it },
  )

  public override fun convert(obj: TradesFilter): Query.TradesFilter {
    val builder = Query.TradesFilter.newBuilder()
    builder.addAllSubaccountIds(obj.subaccountIds.map { it })
    builder.addAllMarketIds(obj.marketIds.map { it })
    return builder.build()
  }
}

public object PositionsFilterJvmConverter :
    ProtobufTypeMapper<PositionsFilter, Query.PositionsFilter> {
  public override val descriptor: Descriptors.Descriptor = Query.PositionsFilter.getDescriptor()

  public override val parser: Parser<Query.PositionsFilter> = Query.PositionsFilter.parser()

  public override fun convert(obj: Query.PositionsFilter): PositionsFilter = PositionsFilter(
  	subaccountIds = obj.getSubaccountIdsList().map { it },
  	marketIds = obj.getMarketIdsList().map { it },
  )

  public override fun convert(obj: PositionsFilter): Query.PositionsFilter {
    val builder = Query.PositionsFilter.newBuilder()
    builder.addAllSubaccountIds(obj.subaccountIds.map { it })
    builder.addAllMarketIds(obj.marketIds.map { it })
    return builder.build()
  }
}

public object OrdersFilterJvmConverter : ProtobufTypeMapper<OrdersFilter, Query.OrdersFilter> {
  public override val descriptor: Descriptors.Descriptor = Query.OrdersFilter.getDescriptor()

  public override val parser: Parser<Query.OrdersFilter> = Query.OrdersFilter.parser()

  public override fun convert(obj: Query.OrdersFilter): OrdersFilter = OrdersFilter(
  	subaccountIds = obj.getSubaccountIdsList().map { it },
  	marketIds = obj.getMarketIdsList().map { it },
  )

  public override fun convert(obj: OrdersFilter): Query.OrdersFilter {
    val builder = Query.OrdersFilter.newBuilder()
    builder.addAllSubaccountIds(obj.subaccountIds.map { it })
    builder.addAllMarketIds(obj.marketIds.map { it })
    return builder.build()
  }
}

public object OrderbookFilterJvmConverter :
    ProtobufTypeMapper<OrderbookFilter, Query.OrderbookFilter> {
  public override val descriptor: Descriptors.Descriptor = Query.OrderbookFilter.getDescriptor()

  public override val parser: Parser<Query.OrderbookFilter> = Query.OrderbookFilter.parser()

  public override fun convert(obj: Query.OrderbookFilter): OrderbookFilter = OrderbookFilter(
  	marketIds = obj.getMarketIdsList().map { it },
  )

  public override fun convert(obj: OrderbookFilter): Query.OrderbookFilter {
    val builder = Query.OrderbookFilter.newBuilder()
    builder.addAllMarketIds(obj.marketIds.map { it })
    return builder.build()
  }
}

public object BankBalancesFilterJvmConverter :
    ProtobufTypeMapper<BankBalancesFilter, Query.BankBalancesFilter> {
  public override val descriptor: Descriptors.Descriptor = Query.BankBalancesFilter.getDescriptor()

  public override val parser: Parser<Query.BankBalancesFilter> = Query.BankBalancesFilter.parser()

  public override fun convert(obj: Query.BankBalancesFilter): BankBalancesFilter =
      BankBalancesFilter(
  	accounts = obj.getAccountsList().map { it },
  )

  public override fun convert(obj: BankBalancesFilter): Query.BankBalancesFilter {
    val builder = Query.BankBalancesFilter.newBuilder()
    builder.addAllAccounts(obj.accounts.map { it })
    return builder.build()
  }
}

public object SubaccountDepositsFilterJvmConverter :
    ProtobufTypeMapper<SubaccountDepositsFilter, Query.SubaccountDepositsFilter> {
  public override val descriptor: Descriptors.Descriptor =
      Query.SubaccountDepositsFilter.getDescriptor()

  public override val parser: Parser<Query.SubaccountDepositsFilter> =
      Query.SubaccountDepositsFilter.parser()

  public override fun convert(obj: Query.SubaccountDepositsFilter): SubaccountDepositsFilter =
      SubaccountDepositsFilter(
  	subaccountIds = obj.getSubaccountIdsList().map { it },
  )

  public override fun convert(obj: SubaccountDepositsFilter): Query.SubaccountDepositsFilter {
    val builder = Query.SubaccountDepositsFilter.newBuilder()
    builder.addAllSubaccountIds(obj.subaccountIds.map { it })
    return builder.build()
  }
}

public object OraclePriceFilterJvmConverter :
    ProtobufTypeMapper<OraclePriceFilter, Query.OraclePriceFilter> {
  public override val descriptor: Descriptors.Descriptor = Query.OraclePriceFilter.getDescriptor()

  public override val parser: Parser<Query.OraclePriceFilter> = Query.OraclePriceFilter.parser()

  public override fun convert(obj: Query.OraclePriceFilter): OraclePriceFilter = OraclePriceFilter(
  	symbol = obj.getSymbolList().map { it },
  )

  public override fun convert(obj: OraclePriceFilter): Query.OraclePriceFilter {
    val builder = Query.OraclePriceFilter.newBuilder()
    builder.addAllSymbol(obj.symbol.map { it })
    return builder.build()
  }
}
