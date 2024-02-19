// Transform from injective/exchange/v1beta1/tx.proto
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

public object MsgUpdateParamsJvmConverter : ProtobufTypeMapper<MsgUpdateParams, Tx.MsgUpdateParams>
    {
  public override val descriptor: Descriptors.Descriptor = Tx.MsgUpdateParams.getDescriptor()

  public override val parser: Parser<Tx.MsgUpdateParams> = Tx.MsgUpdateParams.parser()

  public override fun convert(obj: Tx.MsgUpdateParams): MsgUpdateParams = MsgUpdateParams(
  	authority = obj.getAuthority(),
  	params = ParamsJvmConverter.convert(obj.getParams()),
  )

  public override fun convert(obj: MsgUpdateParams): Tx.MsgUpdateParams {
    val builder = Tx.MsgUpdateParams.newBuilder()
    builder.setAuthority(obj.authority)
    builder.setParams(ParamsJvmConverter.convert(obj.params))
    return builder.build()
  }
}

public object MsgUpdateParamsResponseJvmConverter :
    ProtobufTypeMapper<MsgUpdateParamsResponse, Tx.MsgUpdateParamsResponse> {
  public override val descriptor: Descriptors.Descriptor =
      Tx.MsgUpdateParamsResponse.getDescriptor()

  public override val parser: Parser<Tx.MsgUpdateParamsResponse> =
      Tx.MsgUpdateParamsResponse.parser()

  public override fun convert(obj: Tx.MsgUpdateParamsResponse): MsgUpdateParamsResponse =
      MsgUpdateParamsResponse(
  )

  public override fun convert(obj: MsgUpdateParamsResponse): Tx.MsgUpdateParamsResponse {
    val builder = Tx.MsgUpdateParamsResponse.newBuilder()
    return builder.build()
  }
}

public object MsgDepositJvmConverter : ProtobufTypeMapper<MsgDeposit, Tx.MsgDeposit> {
  public override val descriptor: Descriptors.Descriptor = Tx.MsgDeposit.getDescriptor()

  public override val parser: Parser<Tx.MsgDeposit> = Tx.MsgDeposit.parser()

  public override fun convert(obj: Tx.MsgDeposit): MsgDeposit = MsgDeposit(
  	sender = obj.getSender(),
  	subaccountId = obj.getSubaccountId(),
  	amount = CoinJvmConverter.convert(obj.getAmount()),
  )

  public override fun convert(obj: MsgDeposit): Tx.MsgDeposit {
    val builder = Tx.MsgDeposit.newBuilder()
    builder.setSender(obj.sender)
    builder.setSubaccountId(obj.subaccountId)
    builder.setAmount(CoinJvmConverter.convert(obj.amount))
    return builder.build()
  }
}

public object MsgDepositResponseJvmConverter :
    ProtobufTypeMapper<MsgDepositResponse, Tx.MsgDepositResponse> {
  public override val descriptor: Descriptors.Descriptor = Tx.MsgDepositResponse.getDescriptor()

  public override val parser: Parser<Tx.MsgDepositResponse> = Tx.MsgDepositResponse.parser()

  public override fun convert(obj: Tx.MsgDepositResponse): MsgDepositResponse = MsgDepositResponse(
  )

  public override fun convert(obj: MsgDepositResponse): Tx.MsgDepositResponse {
    val builder = Tx.MsgDepositResponse.newBuilder()
    return builder.build()
  }
}

public object MsgWithdrawJvmConverter : ProtobufTypeMapper<MsgWithdraw, Tx.MsgWithdraw> {
  public override val descriptor: Descriptors.Descriptor = Tx.MsgWithdraw.getDescriptor()

  public override val parser: Parser<Tx.MsgWithdraw> = Tx.MsgWithdraw.parser()

  public override fun convert(obj: Tx.MsgWithdraw): MsgWithdraw = MsgWithdraw(
  	sender = obj.getSender(),
  	subaccountId = obj.getSubaccountId(),
  	amount = CoinJvmConverter.convert(obj.getAmount()),
  )

  public override fun convert(obj: MsgWithdraw): Tx.MsgWithdraw {
    val builder = Tx.MsgWithdraw.newBuilder()
    builder.setSender(obj.sender)
    builder.setSubaccountId(obj.subaccountId)
    builder.setAmount(CoinJvmConverter.convert(obj.amount))
    return builder.build()
  }
}

public object MsgWithdrawResponseJvmConverter :
    ProtobufTypeMapper<MsgWithdrawResponse, Tx.MsgWithdrawResponse> {
  public override val descriptor: Descriptors.Descriptor = Tx.MsgWithdrawResponse.getDescriptor()

  public override val parser: Parser<Tx.MsgWithdrawResponse> = Tx.MsgWithdrawResponse.parser()

  public override fun convert(obj: Tx.MsgWithdrawResponse): MsgWithdrawResponse =
      MsgWithdrawResponse(
  )

  public override fun convert(obj: MsgWithdrawResponse): Tx.MsgWithdrawResponse {
    val builder = Tx.MsgWithdrawResponse.newBuilder()
    return builder.build()
  }
}

public object MsgCreateSpotLimitOrderJvmConverter :
    ProtobufTypeMapper<MsgCreateSpotLimitOrder, Tx.MsgCreateSpotLimitOrder> {
  public override val descriptor: Descriptors.Descriptor =
      Tx.MsgCreateSpotLimitOrder.getDescriptor()

  public override val parser: Parser<Tx.MsgCreateSpotLimitOrder> =
      Tx.MsgCreateSpotLimitOrder.parser()

  public override fun convert(obj: Tx.MsgCreateSpotLimitOrder): MsgCreateSpotLimitOrder =
      MsgCreateSpotLimitOrder(
  	sender = obj.getSender(),
  	order = SpotOrderJvmConverter.convert(obj.getOrder()),
  )

  public override fun convert(obj: MsgCreateSpotLimitOrder): Tx.MsgCreateSpotLimitOrder {
    val builder = Tx.MsgCreateSpotLimitOrder.newBuilder()
    builder.setSender(obj.sender)
    builder.setOrder(SpotOrderJvmConverter.convert(obj.order))
    return builder.build()
  }
}

public object MsgCreateSpotLimitOrderResponseJvmConverter :
    ProtobufTypeMapper<MsgCreateSpotLimitOrderResponse, Tx.MsgCreateSpotLimitOrderResponse> {
  public override val descriptor: Descriptors.Descriptor =
      Tx.MsgCreateSpotLimitOrderResponse.getDescriptor()

  public override val parser: Parser<Tx.MsgCreateSpotLimitOrderResponse> =
      Tx.MsgCreateSpotLimitOrderResponse.parser()

  public override fun convert(obj: Tx.MsgCreateSpotLimitOrderResponse):
      MsgCreateSpotLimitOrderResponse = MsgCreateSpotLimitOrderResponse(
  	orderHash = obj.getOrderHash(),
  )

  public override fun convert(obj: MsgCreateSpotLimitOrderResponse):
      Tx.MsgCreateSpotLimitOrderResponse {
    val builder = Tx.MsgCreateSpotLimitOrderResponse.newBuilder()
    builder.setOrderHash(obj.orderHash)
    return builder.build()
  }
}

public object MsgBatchCreateSpotLimitOrdersJvmConverter :
    ProtobufTypeMapper<MsgBatchCreateSpotLimitOrders, Tx.MsgBatchCreateSpotLimitOrders> {
  public override val descriptor: Descriptors.Descriptor =
      Tx.MsgBatchCreateSpotLimitOrders.getDescriptor()

  public override val parser: Parser<Tx.MsgBatchCreateSpotLimitOrders> =
      Tx.MsgBatchCreateSpotLimitOrders.parser()

  public override fun convert(obj: Tx.MsgBatchCreateSpotLimitOrders): MsgBatchCreateSpotLimitOrders
      = MsgBatchCreateSpotLimitOrders(
  	sender = obj.getSender(),
  	orders = obj.getOrdersList().map { SpotOrderJvmConverter.convert(it) },
  )

  public override fun convert(obj: MsgBatchCreateSpotLimitOrders):
      Tx.MsgBatchCreateSpotLimitOrders {
    val builder = Tx.MsgBatchCreateSpotLimitOrders.newBuilder()
    builder.setSender(obj.sender)
    builder.addAllOrders(obj.orders.map { SpotOrderJvmConverter.convert(it) })
    return builder.build()
  }
}

public object MsgBatchCreateSpotLimitOrdersResponseJvmConverter :
    ProtobufTypeMapper<MsgBatchCreateSpotLimitOrdersResponse, Tx.MsgBatchCreateSpotLimitOrdersResponse>
    {
  public override val descriptor: Descriptors.Descriptor =
      Tx.MsgBatchCreateSpotLimitOrdersResponse.getDescriptor()

  public override val parser: Parser<Tx.MsgBatchCreateSpotLimitOrdersResponse> =
      Tx.MsgBatchCreateSpotLimitOrdersResponse.parser()

  public override fun convert(obj: Tx.MsgBatchCreateSpotLimitOrdersResponse):
      MsgBatchCreateSpotLimitOrdersResponse = MsgBatchCreateSpotLimitOrdersResponse(
  	orderHashes = obj.getOrderHashesList().map { it },
  )

  public override fun convert(obj: MsgBatchCreateSpotLimitOrdersResponse):
      Tx.MsgBatchCreateSpotLimitOrdersResponse {
    val builder = Tx.MsgBatchCreateSpotLimitOrdersResponse.newBuilder()
    builder.addAllOrderHashes(obj.orderHashes.map { it })
    return builder.build()
  }
}

public object MsgInstantSpotMarketLaunchJvmConverter :
    ProtobufTypeMapper<MsgInstantSpotMarketLaunch, Tx.MsgInstantSpotMarketLaunch> {
  public override val descriptor: Descriptors.Descriptor =
      Tx.MsgInstantSpotMarketLaunch.getDescriptor()

  public override val parser: Parser<Tx.MsgInstantSpotMarketLaunch> =
      Tx.MsgInstantSpotMarketLaunch.parser()

  public override fun convert(obj: Tx.MsgInstantSpotMarketLaunch): MsgInstantSpotMarketLaunch =
      MsgInstantSpotMarketLaunch(
  	sender = obj.getSender(),
  	ticker = obj.getTicker(),
  	baseDenom = obj.getBaseDenom(),
  	quoteDenom = obj.getQuoteDenom(),
  	minPriceTickSize = obj.getMinPriceTickSize(),
  	minQuantityTickSize = obj.getMinQuantityTickSize(),
  )

  public override fun convert(obj: MsgInstantSpotMarketLaunch): Tx.MsgInstantSpotMarketLaunch {
    val builder = Tx.MsgInstantSpotMarketLaunch.newBuilder()
    builder.setSender(obj.sender)
    builder.setTicker(obj.ticker)
    builder.setBaseDenom(obj.baseDenom)
    builder.setQuoteDenom(obj.quoteDenom)
    builder.setMinPriceTickSize(obj.minPriceTickSize)
    builder.setMinQuantityTickSize(obj.minQuantityTickSize)
    return builder.build()
  }
}

public object MsgInstantSpotMarketLaunchResponseJvmConverter :
    ProtobufTypeMapper<MsgInstantSpotMarketLaunchResponse, Tx.MsgInstantSpotMarketLaunchResponse> {
  public override val descriptor: Descriptors.Descriptor =
      Tx.MsgInstantSpotMarketLaunchResponse.getDescriptor()

  public override val parser: Parser<Tx.MsgInstantSpotMarketLaunchResponse> =
      Tx.MsgInstantSpotMarketLaunchResponse.parser()

  public override fun convert(obj: Tx.MsgInstantSpotMarketLaunchResponse):
      MsgInstantSpotMarketLaunchResponse = MsgInstantSpotMarketLaunchResponse(
  )

  public override fun convert(obj: MsgInstantSpotMarketLaunchResponse):
      Tx.MsgInstantSpotMarketLaunchResponse {
    val builder = Tx.MsgInstantSpotMarketLaunchResponse.newBuilder()
    return builder.build()
  }
}

public object MsgInstantPerpetualMarketLaunchJvmConverter :
    ProtobufTypeMapper<MsgInstantPerpetualMarketLaunch, Tx.MsgInstantPerpetualMarketLaunch> {
  public override val descriptor: Descriptors.Descriptor =
      Tx.MsgInstantPerpetualMarketLaunch.getDescriptor()

  public override val parser: Parser<Tx.MsgInstantPerpetualMarketLaunch> =
      Tx.MsgInstantPerpetualMarketLaunch.parser()

  public override fun convert(obj: Tx.MsgInstantPerpetualMarketLaunch):
      MsgInstantPerpetualMarketLaunch = MsgInstantPerpetualMarketLaunch(
  	sender = obj.getSender(),
  	ticker = obj.getTicker(),
  	quoteDenom = obj.getQuoteDenom(),
  	oracleBase = obj.getOracleBase(),
  	oracleQuote = obj.getOracleQuote(),
  	oracleScaleFactor = obj.getOracleScaleFactor().asKotlinType,
  	oracleType = OracleType.forNumber(obj.getOracleType().number),
  	makerFeeRate = obj.getMakerFeeRate(),
  	takerFeeRate = obj.getTakerFeeRate(),
  	initialMarginRatio = obj.getInitialMarginRatio(),
  	maintenanceMarginRatio = obj.getMaintenanceMarginRatio(),
  	minPriceTickSize = obj.getMinPriceTickSize(),
  	minQuantityTickSize = obj.getMinQuantityTickSize(),
  )

  public override fun convert(obj: MsgInstantPerpetualMarketLaunch):
      Tx.MsgInstantPerpetualMarketLaunch {
    val builder = Tx.MsgInstantPerpetualMarketLaunch.newBuilder()
    builder.setSender(obj.sender)
    builder.setTicker(obj.ticker)
    builder.setQuoteDenom(obj.quoteDenom)
    builder.setOracleBase(obj.oracleBase)
    builder.setOracleQuote(obj.oracleQuote)
    builder.setOracleScaleFactor(obj.oracleScaleFactor.asJavaType)
    builder.setOracleType(Oracle.OracleType.forNumber(obj.oracleType.number))
    builder.setMakerFeeRate(obj.makerFeeRate)
    builder.setTakerFeeRate(obj.takerFeeRate)
    builder.setInitialMarginRatio(obj.initialMarginRatio)
    builder.setMaintenanceMarginRatio(obj.maintenanceMarginRatio)
    builder.setMinPriceTickSize(obj.minPriceTickSize)
    builder.setMinQuantityTickSize(obj.minQuantityTickSize)
    return builder.build()
  }
}

public object MsgInstantPerpetualMarketLaunchResponseJvmConverter :
    ProtobufTypeMapper<MsgInstantPerpetualMarketLaunchResponse, Tx.MsgInstantPerpetualMarketLaunchResponse>
    {
  public override val descriptor: Descriptors.Descriptor =
      Tx.MsgInstantPerpetualMarketLaunchResponse.getDescriptor()

  public override val parser: Parser<Tx.MsgInstantPerpetualMarketLaunchResponse> =
      Tx.MsgInstantPerpetualMarketLaunchResponse.parser()

  public override fun convert(obj: Tx.MsgInstantPerpetualMarketLaunchResponse):
      MsgInstantPerpetualMarketLaunchResponse = MsgInstantPerpetualMarketLaunchResponse(
  )

  public override fun convert(obj: MsgInstantPerpetualMarketLaunchResponse):
      Tx.MsgInstantPerpetualMarketLaunchResponse {
    val builder = Tx.MsgInstantPerpetualMarketLaunchResponse.newBuilder()
    return builder.build()
  }
}

public object MsgInstantBinaryOptionsMarketLaunchJvmConverter :
    ProtobufTypeMapper<MsgInstantBinaryOptionsMarketLaunch, Tx.MsgInstantBinaryOptionsMarketLaunch>
    {
  public override val descriptor: Descriptors.Descriptor =
      Tx.MsgInstantBinaryOptionsMarketLaunch.getDescriptor()

  public override val parser: Parser<Tx.MsgInstantBinaryOptionsMarketLaunch> =
      Tx.MsgInstantBinaryOptionsMarketLaunch.parser()

  public override fun convert(obj: Tx.MsgInstantBinaryOptionsMarketLaunch):
      MsgInstantBinaryOptionsMarketLaunch = MsgInstantBinaryOptionsMarketLaunch(
  	sender = obj.getSender(),
  	ticker = obj.getTicker(),
  	oracleSymbol = obj.getOracleSymbol(),
  	oracleProvider = obj.getOracleProvider(),
  	oracleType = OracleType.forNumber(obj.getOracleType().number),
  	oracleScaleFactor = obj.getOracleScaleFactor().asKotlinType,
  	makerFeeRate = obj.getMakerFeeRate(),
  	takerFeeRate = obj.getTakerFeeRate(),
  	expirationTimestamp = obj.getExpirationTimestamp(),
  	settlementTimestamp = obj.getSettlementTimestamp(),
  	admin = obj.getAdmin(),
  	quoteDenom = obj.getQuoteDenom(),
  	minPriceTickSize = obj.getMinPriceTickSize(),
  	minQuantityTickSize = obj.getMinQuantityTickSize(),
  )

  public override fun convert(obj: MsgInstantBinaryOptionsMarketLaunch):
      Tx.MsgInstantBinaryOptionsMarketLaunch {
    val builder = Tx.MsgInstantBinaryOptionsMarketLaunch.newBuilder()
    builder.setSender(obj.sender)
    builder.setTicker(obj.ticker)
    builder.setOracleSymbol(obj.oracleSymbol)
    builder.setOracleProvider(obj.oracleProvider)
    builder.setOracleType(Oracle.OracleType.forNumber(obj.oracleType.number))
    builder.setOracleScaleFactor(obj.oracleScaleFactor.asJavaType)
    builder.setMakerFeeRate(obj.makerFeeRate)
    builder.setTakerFeeRate(obj.takerFeeRate)
    builder.setExpirationTimestamp(obj.expirationTimestamp)
    builder.setSettlementTimestamp(obj.settlementTimestamp)
    builder.setAdmin(obj.admin)
    builder.setQuoteDenom(obj.quoteDenom)
    builder.setMinPriceTickSize(obj.minPriceTickSize)
    builder.setMinQuantityTickSize(obj.minQuantityTickSize)
    return builder.build()
  }
}

public object MsgInstantBinaryOptionsMarketLaunchResponseJvmConverter :
    ProtobufTypeMapper<MsgInstantBinaryOptionsMarketLaunchResponse, Tx.MsgInstantBinaryOptionsMarketLaunchResponse>
    {
  public override val descriptor: Descriptors.Descriptor =
      Tx.MsgInstantBinaryOptionsMarketLaunchResponse.getDescriptor()

  public override val parser: Parser<Tx.MsgInstantBinaryOptionsMarketLaunchResponse> =
      Tx.MsgInstantBinaryOptionsMarketLaunchResponse.parser()

  public override fun convert(obj: Tx.MsgInstantBinaryOptionsMarketLaunchResponse):
      MsgInstantBinaryOptionsMarketLaunchResponse = MsgInstantBinaryOptionsMarketLaunchResponse(
  )

  public override fun convert(obj: MsgInstantBinaryOptionsMarketLaunchResponse):
      Tx.MsgInstantBinaryOptionsMarketLaunchResponse {
    val builder = Tx.MsgInstantBinaryOptionsMarketLaunchResponse.newBuilder()
    return builder.build()
  }
}

public object MsgInstantExpiryFuturesMarketLaunchJvmConverter :
    ProtobufTypeMapper<MsgInstantExpiryFuturesMarketLaunch, Tx.MsgInstantExpiryFuturesMarketLaunch>
    {
  public override val descriptor: Descriptors.Descriptor =
      Tx.MsgInstantExpiryFuturesMarketLaunch.getDescriptor()

  public override val parser: Parser<Tx.MsgInstantExpiryFuturesMarketLaunch> =
      Tx.MsgInstantExpiryFuturesMarketLaunch.parser()

  public override fun convert(obj: Tx.MsgInstantExpiryFuturesMarketLaunch):
      MsgInstantExpiryFuturesMarketLaunch = MsgInstantExpiryFuturesMarketLaunch(
  	sender = obj.getSender(),
  	ticker = obj.getTicker(),
  	quoteDenom = obj.getQuoteDenom(),
  	oracleBase = obj.getOracleBase(),
  	oracleQuote = obj.getOracleQuote(),
  	oracleType = OracleType.forNumber(obj.getOracleType().number),
  	oracleScaleFactor = obj.getOracleScaleFactor().asKotlinType,
  	expiry = obj.getExpiry(),
  	makerFeeRate = obj.getMakerFeeRate(),
  	takerFeeRate = obj.getTakerFeeRate(),
  	initialMarginRatio = obj.getInitialMarginRatio(),
  	maintenanceMarginRatio = obj.getMaintenanceMarginRatio(),
  	minPriceTickSize = obj.getMinPriceTickSize(),
  	minQuantityTickSize = obj.getMinQuantityTickSize(),
  )

  public override fun convert(obj: MsgInstantExpiryFuturesMarketLaunch):
      Tx.MsgInstantExpiryFuturesMarketLaunch {
    val builder = Tx.MsgInstantExpiryFuturesMarketLaunch.newBuilder()
    builder.setSender(obj.sender)
    builder.setTicker(obj.ticker)
    builder.setQuoteDenom(obj.quoteDenom)
    builder.setOracleBase(obj.oracleBase)
    builder.setOracleQuote(obj.oracleQuote)
    builder.setOracleType(Oracle.OracleType.forNumber(obj.oracleType.number))
    builder.setOracleScaleFactor(obj.oracleScaleFactor.asJavaType)
    builder.setExpiry(obj.expiry)
    builder.setMakerFeeRate(obj.makerFeeRate)
    builder.setTakerFeeRate(obj.takerFeeRate)
    builder.setInitialMarginRatio(obj.initialMarginRatio)
    builder.setMaintenanceMarginRatio(obj.maintenanceMarginRatio)
    builder.setMinPriceTickSize(obj.minPriceTickSize)
    builder.setMinQuantityTickSize(obj.minQuantityTickSize)
    return builder.build()
  }
}

public object MsgInstantExpiryFuturesMarketLaunchResponseJvmConverter :
    ProtobufTypeMapper<MsgInstantExpiryFuturesMarketLaunchResponse, Tx.MsgInstantExpiryFuturesMarketLaunchResponse>
    {
  public override val descriptor: Descriptors.Descriptor =
      Tx.MsgInstantExpiryFuturesMarketLaunchResponse.getDescriptor()

  public override val parser: Parser<Tx.MsgInstantExpiryFuturesMarketLaunchResponse> =
      Tx.MsgInstantExpiryFuturesMarketLaunchResponse.parser()

  public override fun convert(obj: Tx.MsgInstantExpiryFuturesMarketLaunchResponse):
      MsgInstantExpiryFuturesMarketLaunchResponse = MsgInstantExpiryFuturesMarketLaunchResponse(
  )

  public override fun convert(obj: MsgInstantExpiryFuturesMarketLaunchResponse):
      Tx.MsgInstantExpiryFuturesMarketLaunchResponse {
    val builder = Tx.MsgInstantExpiryFuturesMarketLaunchResponse.newBuilder()
    return builder.build()
  }
}

public object MsgCreateSpotMarketOrderJvmConverter :
    ProtobufTypeMapper<MsgCreateSpotMarketOrder, Tx.MsgCreateSpotMarketOrder> {
  public override val descriptor: Descriptors.Descriptor =
      Tx.MsgCreateSpotMarketOrder.getDescriptor()

  public override val parser: Parser<Tx.MsgCreateSpotMarketOrder> =
      Tx.MsgCreateSpotMarketOrder.parser()

  public override fun convert(obj: Tx.MsgCreateSpotMarketOrder): MsgCreateSpotMarketOrder =
      MsgCreateSpotMarketOrder(
  	sender = obj.getSender(),
  	order = SpotOrderJvmConverter.convert(obj.getOrder()),
  )

  public override fun convert(obj: MsgCreateSpotMarketOrder): Tx.MsgCreateSpotMarketOrder {
    val builder = Tx.MsgCreateSpotMarketOrder.newBuilder()
    builder.setSender(obj.sender)
    builder.setOrder(SpotOrderJvmConverter.convert(obj.order))
    return builder.build()
  }
}

public object MsgCreateSpotMarketOrderResponseJvmConverter :
    ProtobufTypeMapper<MsgCreateSpotMarketOrderResponse, Tx.MsgCreateSpotMarketOrderResponse> {
  public override val descriptor: Descriptors.Descriptor =
      Tx.MsgCreateSpotMarketOrderResponse.getDescriptor()

  public override val parser: Parser<Tx.MsgCreateSpotMarketOrderResponse> =
      Tx.MsgCreateSpotMarketOrderResponse.parser()

  public override fun convert(obj: Tx.MsgCreateSpotMarketOrderResponse):
      MsgCreateSpotMarketOrderResponse = MsgCreateSpotMarketOrderResponse(
  	orderHash = obj.getOrderHash(),
  	results = SpotMarketOrderResultsJvmConverter.convert(obj.getResults()),
  )

  public override fun convert(obj: MsgCreateSpotMarketOrderResponse):
      Tx.MsgCreateSpotMarketOrderResponse {
    val builder = Tx.MsgCreateSpotMarketOrderResponse.newBuilder()
    builder.setOrderHash(obj.orderHash)
    builder.setResults(SpotMarketOrderResultsJvmConverter.convert(obj.results))
    return builder.build()
  }
}

public object SpotMarketOrderResultsJvmConverter :
    ProtobufTypeMapper<SpotMarketOrderResults, Tx.SpotMarketOrderResults> {
  public override val descriptor: Descriptors.Descriptor = Tx.SpotMarketOrderResults.getDescriptor()

  public override val parser: Parser<Tx.SpotMarketOrderResults> = Tx.SpotMarketOrderResults.parser()

  public override fun convert(obj: Tx.SpotMarketOrderResults): SpotMarketOrderResults =
      SpotMarketOrderResults(
  	quantity = obj.getQuantity(),
  	price = obj.getPrice(),
  	fee = obj.getFee(),
  )

  public override fun convert(obj: SpotMarketOrderResults): Tx.SpotMarketOrderResults {
    val builder = Tx.SpotMarketOrderResults.newBuilder()
    builder.setQuantity(obj.quantity)
    builder.setPrice(obj.price)
    builder.setFee(obj.fee)
    return builder.build()
  }
}

public object MsgCreateDerivativeLimitOrderJvmConverter :
    ProtobufTypeMapper<MsgCreateDerivativeLimitOrder, Tx.MsgCreateDerivativeLimitOrder> {
  public override val descriptor: Descriptors.Descriptor =
      Tx.MsgCreateDerivativeLimitOrder.getDescriptor()

  public override val parser: Parser<Tx.MsgCreateDerivativeLimitOrder> =
      Tx.MsgCreateDerivativeLimitOrder.parser()

  public override fun convert(obj: Tx.MsgCreateDerivativeLimitOrder): MsgCreateDerivativeLimitOrder
      = MsgCreateDerivativeLimitOrder(
  	sender = obj.getSender(),
  	order = DerivativeOrderJvmConverter.convert(obj.getOrder()),
  )

  public override fun convert(obj: MsgCreateDerivativeLimitOrder):
      Tx.MsgCreateDerivativeLimitOrder {
    val builder = Tx.MsgCreateDerivativeLimitOrder.newBuilder()
    builder.setSender(obj.sender)
    builder.setOrder(DerivativeOrderJvmConverter.convert(obj.order))
    return builder.build()
  }
}

public object MsgCreateDerivativeLimitOrderResponseJvmConverter :
    ProtobufTypeMapper<MsgCreateDerivativeLimitOrderResponse, Tx.MsgCreateDerivativeLimitOrderResponse>
    {
  public override val descriptor: Descriptors.Descriptor =
      Tx.MsgCreateDerivativeLimitOrderResponse.getDescriptor()

  public override val parser: Parser<Tx.MsgCreateDerivativeLimitOrderResponse> =
      Tx.MsgCreateDerivativeLimitOrderResponse.parser()

  public override fun convert(obj: Tx.MsgCreateDerivativeLimitOrderResponse):
      MsgCreateDerivativeLimitOrderResponse = MsgCreateDerivativeLimitOrderResponse(
  	orderHash = obj.getOrderHash(),
  )

  public override fun convert(obj: MsgCreateDerivativeLimitOrderResponse):
      Tx.MsgCreateDerivativeLimitOrderResponse {
    val builder = Tx.MsgCreateDerivativeLimitOrderResponse.newBuilder()
    builder.setOrderHash(obj.orderHash)
    return builder.build()
  }
}

public object MsgCreateBinaryOptionsLimitOrderJvmConverter :
    ProtobufTypeMapper<MsgCreateBinaryOptionsLimitOrder, Tx.MsgCreateBinaryOptionsLimitOrder> {
  public override val descriptor: Descriptors.Descriptor =
      Tx.MsgCreateBinaryOptionsLimitOrder.getDescriptor()

  public override val parser: Parser<Tx.MsgCreateBinaryOptionsLimitOrder> =
      Tx.MsgCreateBinaryOptionsLimitOrder.parser()

  public override fun convert(obj: Tx.MsgCreateBinaryOptionsLimitOrder):
      MsgCreateBinaryOptionsLimitOrder = MsgCreateBinaryOptionsLimitOrder(
  	sender = obj.getSender(),
  	order = DerivativeOrderJvmConverter.convert(obj.getOrder()),
  )

  public override fun convert(obj: MsgCreateBinaryOptionsLimitOrder):
      Tx.MsgCreateBinaryOptionsLimitOrder {
    val builder = Tx.MsgCreateBinaryOptionsLimitOrder.newBuilder()
    builder.setSender(obj.sender)
    builder.setOrder(DerivativeOrderJvmConverter.convert(obj.order))
    return builder.build()
  }
}

public object MsgCreateBinaryOptionsLimitOrderResponseJvmConverter :
    ProtobufTypeMapper<MsgCreateBinaryOptionsLimitOrderResponse, Tx.MsgCreateBinaryOptionsLimitOrderResponse>
    {
  public override val descriptor: Descriptors.Descriptor =
      Tx.MsgCreateBinaryOptionsLimitOrderResponse.getDescriptor()

  public override val parser: Parser<Tx.MsgCreateBinaryOptionsLimitOrderResponse> =
      Tx.MsgCreateBinaryOptionsLimitOrderResponse.parser()

  public override fun convert(obj: Tx.MsgCreateBinaryOptionsLimitOrderResponse):
      MsgCreateBinaryOptionsLimitOrderResponse = MsgCreateBinaryOptionsLimitOrderResponse(
  	orderHash = obj.getOrderHash(),
  )

  public override fun convert(obj: MsgCreateBinaryOptionsLimitOrderResponse):
      Tx.MsgCreateBinaryOptionsLimitOrderResponse {
    val builder = Tx.MsgCreateBinaryOptionsLimitOrderResponse.newBuilder()
    builder.setOrderHash(obj.orderHash)
    return builder.build()
  }
}

public object MsgBatchCreateDerivativeLimitOrdersJvmConverter :
    ProtobufTypeMapper<MsgBatchCreateDerivativeLimitOrders, Tx.MsgBatchCreateDerivativeLimitOrders>
    {
  public override val descriptor: Descriptors.Descriptor =
      Tx.MsgBatchCreateDerivativeLimitOrders.getDescriptor()

  public override val parser: Parser<Tx.MsgBatchCreateDerivativeLimitOrders> =
      Tx.MsgBatchCreateDerivativeLimitOrders.parser()

  public override fun convert(obj: Tx.MsgBatchCreateDerivativeLimitOrders):
      MsgBatchCreateDerivativeLimitOrders = MsgBatchCreateDerivativeLimitOrders(
  	sender = obj.getSender(),
  	orders = obj.getOrdersList().map { DerivativeOrderJvmConverter.convert(it) },
  )

  public override fun convert(obj: MsgBatchCreateDerivativeLimitOrders):
      Tx.MsgBatchCreateDerivativeLimitOrders {
    val builder = Tx.MsgBatchCreateDerivativeLimitOrders.newBuilder()
    builder.setSender(obj.sender)
    builder.addAllOrders(obj.orders.map { DerivativeOrderJvmConverter.convert(it) })
    return builder.build()
  }
}

public object MsgBatchCreateDerivativeLimitOrdersResponseJvmConverter :
    ProtobufTypeMapper<MsgBatchCreateDerivativeLimitOrdersResponse, Tx.MsgBatchCreateDerivativeLimitOrdersResponse>
    {
  public override val descriptor: Descriptors.Descriptor =
      Tx.MsgBatchCreateDerivativeLimitOrdersResponse.getDescriptor()

  public override val parser: Parser<Tx.MsgBatchCreateDerivativeLimitOrdersResponse> =
      Tx.MsgBatchCreateDerivativeLimitOrdersResponse.parser()

  public override fun convert(obj: Tx.MsgBatchCreateDerivativeLimitOrdersResponse):
      MsgBatchCreateDerivativeLimitOrdersResponse = MsgBatchCreateDerivativeLimitOrdersResponse(
  	orderHashes = obj.getOrderHashesList().map { it },
  )

  public override fun convert(obj: MsgBatchCreateDerivativeLimitOrdersResponse):
      Tx.MsgBatchCreateDerivativeLimitOrdersResponse {
    val builder = Tx.MsgBatchCreateDerivativeLimitOrdersResponse.newBuilder()
    builder.addAllOrderHashes(obj.orderHashes.map { it })
    return builder.build()
  }
}

public object MsgCancelSpotOrderJvmConverter :
    ProtobufTypeMapper<MsgCancelSpotOrder, Tx.MsgCancelSpotOrder> {
  public override val descriptor: Descriptors.Descriptor = Tx.MsgCancelSpotOrder.getDescriptor()

  public override val parser: Parser<Tx.MsgCancelSpotOrder> = Tx.MsgCancelSpotOrder.parser()

  public override fun convert(obj: Tx.MsgCancelSpotOrder): MsgCancelSpotOrder = MsgCancelSpotOrder(
  	sender = obj.getSender(),
  	marketId = obj.getMarketId(),
  	subaccountId = obj.getSubaccountId(),
  	orderHash = obj.getOrderHash(),
  	cid = obj.getCid(),
  )

  public override fun convert(obj: MsgCancelSpotOrder): Tx.MsgCancelSpotOrder {
    val builder = Tx.MsgCancelSpotOrder.newBuilder()
    builder.setSender(obj.sender)
    builder.setMarketId(obj.marketId)
    builder.setSubaccountId(obj.subaccountId)
    builder.setOrderHash(obj.orderHash)
    builder.setCid(obj.cid)
    return builder.build()
  }
}

public object MsgCancelSpotOrderResponseJvmConverter :
    ProtobufTypeMapper<MsgCancelSpotOrderResponse, Tx.MsgCancelSpotOrderResponse> {
  public override val descriptor: Descriptors.Descriptor =
      Tx.MsgCancelSpotOrderResponse.getDescriptor()

  public override val parser: Parser<Tx.MsgCancelSpotOrderResponse> =
      Tx.MsgCancelSpotOrderResponse.parser()

  public override fun convert(obj: Tx.MsgCancelSpotOrderResponse): MsgCancelSpotOrderResponse =
      MsgCancelSpotOrderResponse(
  )

  public override fun convert(obj: MsgCancelSpotOrderResponse): Tx.MsgCancelSpotOrderResponse {
    val builder = Tx.MsgCancelSpotOrderResponse.newBuilder()
    return builder.build()
  }
}

public object MsgBatchCancelSpotOrdersJvmConverter :
    ProtobufTypeMapper<MsgBatchCancelSpotOrders, Tx.MsgBatchCancelSpotOrders> {
  public override val descriptor: Descriptors.Descriptor =
      Tx.MsgBatchCancelSpotOrders.getDescriptor()

  public override val parser: Parser<Tx.MsgBatchCancelSpotOrders> =
      Tx.MsgBatchCancelSpotOrders.parser()

  public override fun convert(obj: Tx.MsgBatchCancelSpotOrders): MsgBatchCancelSpotOrders =
      MsgBatchCancelSpotOrders(
  	sender = obj.getSender(),
  	`data` = obj.getDataList().map { OrderDataJvmConverter.convert(it) },
  )

  public override fun convert(obj: MsgBatchCancelSpotOrders): Tx.MsgBatchCancelSpotOrders {
    val builder = Tx.MsgBatchCancelSpotOrders.newBuilder()
    builder.setSender(obj.sender)
    builder.addAllData(obj.`data`.map { OrderDataJvmConverter.convert(it) })
    return builder.build()
  }
}

public object MsgBatchCancelSpotOrdersResponseJvmConverter :
    ProtobufTypeMapper<MsgBatchCancelSpotOrdersResponse, Tx.MsgBatchCancelSpotOrdersResponse> {
  public override val descriptor: Descriptors.Descriptor =
      Tx.MsgBatchCancelSpotOrdersResponse.getDescriptor()

  public override val parser: Parser<Tx.MsgBatchCancelSpotOrdersResponse> =
      Tx.MsgBatchCancelSpotOrdersResponse.parser()

  public override fun convert(obj: Tx.MsgBatchCancelSpotOrdersResponse):
      MsgBatchCancelSpotOrdersResponse = MsgBatchCancelSpotOrdersResponse(
  	success = obj.getSuccessList().map { it },
  )

  public override fun convert(obj: MsgBatchCancelSpotOrdersResponse):
      Tx.MsgBatchCancelSpotOrdersResponse {
    val builder = Tx.MsgBatchCancelSpotOrdersResponse.newBuilder()
    builder.addAllSuccess(obj.success.map { it })
    return builder.build()
  }
}

public object MsgBatchCancelBinaryOptionsOrdersJvmConverter :
    ProtobufTypeMapper<MsgBatchCancelBinaryOptionsOrders, Tx.MsgBatchCancelBinaryOptionsOrders> {
  public override val descriptor: Descriptors.Descriptor =
      Tx.MsgBatchCancelBinaryOptionsOrders.getDescriptor()

  public override val parser: Parser<Tx.MsgBatchCancelBinaryOptionsOrders> =
      Tx.MsgBatchCancelBinaryOptionsOrders.parser()

  public override fun convert(obj: Tx.MsgBatchCancelBinaryOptionsOrders):
      MsgBatchCancelBinaryOptionsOrders = MsgBatchCancelBinaryOptionsOrders(
  	sender = obj.getSender(),
  	`data` = obj.getDataList().map { OrderDataJvmConverter.convert(it) },
  )

  public override fun convert(obj: MsgBatchCancelBinaryOptionsOrders):
      Tx.MsgBatchCancelBinaryOptionsOrders {
    val builder = Tx.MsgBatchCancelBinaryOptionsOrders.newBuilder()
    builder.setSender(obj.sender)
    builder.addAllData(obj.`data`.map { OrderDataJvmConverter.convert(it) })
    return builder.build()
  }
}

public object MsgBatchCancelBinaryOptionsOrdersResponseJvmConverter :
    ProtobufTypeMapper<MsgBatchCancelBinaryOptionsOrdersResponse, Tx.MsgBatchCancelBinaryOptionsOrdersResponse>
    {
  public override val descriptor: Descriptors.Descriptor =
      Tx.MsgBatchCancelBinaryOptionsOrdersResponse.getDescriptor()

  public override val parser: Parser<Tx.MsgBatchCancelBinaryOptionsOrdersResponse> =
      Tx.MsgBatchCancelBinaryOptionsOrdersResponse.parser()

  public override fun convert(obj: Tx.MsgBatchCancelBinaryOptionsOrdersResponse):
      MsgBatchCancelBinaryOptionsOrdersResponse = MsgBatchCancelBinaryOptionsOrdersResponse(
  	success = obj.getSuccessList().map { it },
  )

  public override fun convert(obj: MsgBatchCancelBinaryOptionsOrdersResponse):
      Tx.MsgBatchCancelBinaryOptionsOrdersResponse {
    val builder = Tx.MsgBatchCancelBinaryOptionsOrdersResponse.newBuilder()
    builder.addAllSuccess(obj.success.map { it })
    return builder.build()
  }
}

public object MsgBatchUpdateOrdersJvmConverter :
    ProtobufTypeMapper<MsgBatchUpdateOrders, Tx.MsgBatchUpdateOrders> {
  public override val descriptor: Descriptors.Descriptor = Tx.MsgBatchUpdateOrders.getDescriptor()

  public override val parser: Parser<Tx.MsgBatchUpdateOrders> = Tx.MsgBatchUpdateOrders.parser()

  public override fun convert(obj: Tx.MsgBatchUpdateOrders): MsgBatchUpdateOrders =
      MsgBatchUpdateOrders(
  	sender = obj.getSender(),
  	subaccountId = obj.getSubaccountId(),
  	spotMarketIdsToCancelAll = obj.getSpotMarketIdsToCancelAllList().map { it },
  	derivativeMarketIdsToCancelAll = obj.getDerivativeMarketIdsToCancelAllList().map { it },
  	spotOrdersToCancel = obj.getSpotOrdersToCancelList().map { OrderDataJvmConverter.convert(it) },
  	derivativeOrdersToCancel = obj.getDerivativeOrdersToCancelList().map {
      OrderDataJvmConverter.convert(it) },
  	spotOrdersToCreate = obj.getSpotOrdersToCreateList().map { SpotOrderJvmConverter.convert(it) },
  	derivativeOrdersToCreate = obj.getDerivativeOrdersToCreateList().map {
      DerivativeOrderJvmConverter.convert(it) },
  	binaryOptionsOrdersToCancel = obj.getBinaryOptionsOrdersToCancelList().map {
      OrderDataJvmConverter.convert(it) },
  	binaryOptionsMarketIdsToCancelAll = obj.getBinaryOptionsMarketIdsToCancelAllList().map { it },
  	binaryOptionsOrdersToCreate = obj.getBinaryOptionsOrdersToCreateList().map {
      DerivativeOrderJvmConverter.convert(it) },
  )

  public override fun convert(obj: MsgBatchUpdateOrders): Tx.MsgBatchUpdateOrders {
    val builder = Tx.MsgBatchUpdateOrders.newBuilder()
    builder.setSender(obj.sender)
    builder.setSubaccountId(obj.subaccountId)
    builder.addAllSpotMarketIdsToCancelAll(obj.spotMarketIdsToCancelAll.map { it })
    builder.addAllDerivativeMarketIdsToCancelAll(obj.derivativeMarketIdsToCancelAll.map { it })
    builder.addAllSpotOrdersToCancel(obj.spotOrdersToCancel.map { OrderDataJvmConverter.convert(it)
        })
    builder.addAllDerivativeOrdersToCancel(obj.derivativeOrdersToCancel.map {
        OrderDataJvmConverter.convert(it) })
    builder.addAllSpotOrdersToCreate(obj.spotOrdersToCreate.map { SpotOrderJvmConverter.convert(it)
        })
    builder.addAllDerivativeOrdersToCreate(obj.derivativeOrdersToCreate.map {
        DerivativeOrderJvmConverter.convert(it) })
    builder.addAllBinaryOptionsOrdersToCancel(obj.binaryOptionsOrdersToCancel.map {
        OrderDataJvmConverter.convert(it) })
    builder.addAllBinaryOptionsMarketIdsToCancelAll(obj.binaryOptionsMarketIdsToCancelAll.map { it
        })
    builder.addAllBinaryOptionsOrdersToCreate(obj.binaryOptionsOrdersToCreate.map {
        DerivativeOrderJvmConverter.convert(it) })
    return builder.build()
  }
}

public object MsgBatchUpdateOrdersResponseJvmConverter :
    ProtobufTypeMapper<MsgBatchUpdateOrdersResponse, Tx.MsgBatchUpdateOrdersResponse> {
  public override val descriptor: Descriptors.Descriptor =
      Tx.MsgBatchUpdateOrdersResponse.getDescriptor()

  public override val parser: Parser<Tx.MsgBatchUpdateOrdersResponse> =
      Tx.MsgBatchUpdateOrdersResponse.parser()

  public override fun convert(obj: Tx.MsgBatchUpdateOrdersResponse): MsgBatchUpdateOrdersResponse =
      MsgBatchUpdateOrdersResponse(
  	spotCancelSuccess = obj.getSpotCancelSuccessList().map { it },
  	derivativeCancelSuccess = obj.getDerivativeCancelSuccessList().map { it },
  	spotOrderHashes = obj.getSpotOrderHashesList().map { it },
  	derivativeOrderHashes = obj.getDerivativeOrderHashesList().map { it },
  	binaryOptionsCancelSuccess = obj.getBinaryOptionsCancelSuccessList().map { it },
  	binaryOptionsOrderHashes = obj.getBinaryOptionsOrderHashesList().map { it },
  )

  public override fun convert(obj: MsgBatchUpdateOrdersResponse): Tx.MsgBatchUpdateOrdersResponse {
    val builder = Tx.MsgBatchUpdateOrdersResponse.newBuilder()
    builder.addAllSpotCancelSuccess(obj.spotCancelSuccess.map { it })
    builder.addAllDerivativeCancelSuccess(obj.derivativeCancelSuccess.map { it })
    builder.addAllSpotOrderHashes(obj.spotOrderHashes.map { it })
    builder.addAllDerivativeOrderHashes(obj.derivativeOrderHashes.map { it })
    builder.addAllBinaryOptionsCancelSuccess(obj.binaryOptionsCancelSuccess.map { it })
    builder.addAllBinaryOptionsOrderHashes(obj.binaryOptionsOrderHashes.map { it })
    return builder.build()
  }
}

public object MsgCreateDerivativeMarketOrderJvmConverter :
    ProtobufTypeMapper<MsgCreateDerivativeMarketOrder, Tx.MsgCreateDerivativeMarketOrder> {
  public override val descriptor: Descriptors.Descriptor =
      Tx.MsgCreateDerivativeMarketOrder.getDescriptor()

  public override val parser: Parser<Tx.MsgCreateDerivativeMarketOrder> =
      Tx.MsgCreateDerivativeMarketOrder.parser()

  public override fun convert(obj: Tx.MsgCreateDerivativeMarketOrder):
      MsgCreateDerivativeMarketOrder = MsgCreateDerivativeMarketOrder(
  	sender = obj.getSender(),
  	order = DerivativeOrderJvmConverter.convert(obj.getOrder()),
  )

  public override fun convert(obj: MsgCreateDerivativeMarketOrder):
      Tx.MsgCreateDerivativeMarketOrder {
    val builder = Tx.MsgCreateDerivativeMarketOrder.newBuilder()
    builder.setSender(obj.sender)
    builder.setOrder(DerivativeOrderJvmConverter.convert(obj.order))
    return builder.build()
  }
}

public object MsgCreateDerivativeMarketOrderResponseJvmConverter :
    ProtobufTypeMapper<MsgCreateDerivativeMarketOrderResponse, Tx.MsgCreateDerivativeMarketOrderResponse>
    {
  public override val descriptor: Descriptors.Descriptor =
      Tx.MsgCreateDerivativeMarketOrderResponse.getDescriptor()

  public override val parser: Parser<Tx.MsgCreateDerivativeMarketOrderResponse> =
      Tx.MsgCreateDerivativeMarketOrderResponse.parser()

  public override fun convert(obj: Tx.MsgCreateDerivativeMarketOrderResponse):
      MsgCreateDerivativeMarketOrderResponse = MsgCreateDerivativeMarketOrderResponse(
  	orderHash = obj.getOrderHash(),
  	results = DerivativeMarketOrderResultsJvmConverter.convert(obj.getResults()),
  )

  public override fun convert(obj: MsgCreateDerivativeMarketOrderResponse):
      Tx.MsgCreateDerivativeMarketOrderResponse {
    val builder = Tx.MsgCreateDerivativeMarketOrderResponse.newBuilder()
    builder.setOrderHash(obj.orderHash)
    builder.setResults(DerivativeMarketOrderResultsJvmConverter.convert(obj.results))
    return builder.build()
  }
}

public object DerivativeMarketOrderResultsJvmConverter :
    ProtobufTypeMapper<DerivativeMarketOrderResults, Tx.DerivativeMarketOrderResults> {
  public override val descriptor: Descriptors.Descriptor =
      Tx.DerivativeMarketOrderResults.getDescriptor()

  public override val parser: Parser<Tx.DerivativeMarketOrderResults> =
      Tx.DerivativeMarketOrderResults.parser()

  public override fun convert(obj: Tx.DerivativeMarketOrderResults): DerivativeMarketOrderResults =
      DerivativeMarketOrderResults(
  	quantity = obj.getQuantity(),
  	price = obj.getPrice(),
  	fee = obj.getFee(),
  	positionDelta = PositionDeltaJvmConverter.convert(obj.getPositionDelta()),
  	payout = obj.getPayout(),
  )

  public override fun convert(obj: DerivativeMarketOrderResults): Tx.DerivativeMarketOrderResults {
    val builder = Tx.DerivativeMarketOrderResults.newBuilder()
    builder.setQuantity(obj.quantity)
    builder.setPrice(obj.price)
    builder.setFee(obj.fee)
    builder.setPositionDelta(PositionDeltaJvmConverter.convert(obj.positionDelta))
    builder.setPayout(obj.payout)
    return builder.build()
  }
}

public object MsgCreateBinaryOptionsMarketOrderJvmConverter :
    ProtobufTypeMapper<MsgCreateBinaryOptionsMarketOrder, Tx.MsgCreateBinaryOptionsMarketOrder> {
  public override val descriptor: Descriptors.Descriptor =
      Tx.MsgCreateBinaryOptionsMarketOrder.getDescriptor()

  public override val parser: Parser<Tx.MsgCreateBinaryOptionsMarketOrder> =
      Tx.MsgCreateBinaryOptionsMarketOrder.parser()

  public override fun convert(obj: Tx.MsgCreateBinaryOptionsMarketOrder):
      MsgCreateBinaryOptionsMarketOrder = MsgCreateBinaryOptionsMarketOrder(
  	sender = obj.getSender(),
  	order = DerivativeOrderJvmConverter.convert(obj.getOrder()),
  )

  public override fun convert(obj: MsgCreateBinaryOptionsMarketOrder):
      Tx.MsgCreateBinaryOptionsMarketOrder {
    val builder = Tx.MsgCreateBinaryOptionsMarketOrder.newBuilder()
    builder.setSender(obj.sender)
    builder.setOrder(DerivativeOrderJvmConverter.convert(obj.order))
    return builder.build()
  }
}

public object MsgCreateBinaryOptionsMarketOrderResponseJvmConverter :
    ProtobufTypeMapper<MsgCreateBinaryOptionsMarketOrderResponse, Tx.MsgCreateBinaryOptionsMarketOrderResponse>
    {
  public override val descriptor: Descriptors.Descriptor =
      Tx.MsgCreateBinaryOptionsMarketOrderResponse.getDescriptor()

  public override val parser: Parser<Tx.MsgCreateBinaryOptionsMarketOrderResponse> =
      Tx.MsgCreateBinaryOptionsMarketOrderResponse.parser()

  public override fun convert(obj: Tx.MsgCreateBinaryOptionsMarketOrderResponse):
      MsgCreateBinaryOptionsMarketOrderResponse = MsgCreateBinaryOptionsMarketOrderResponse(
  	orderHash = obj.getOrderHash(),
  	results = DerivativeMarketOrderResultsJvmConverter.convert(obj.getResults()),
  )

  public override fun convert(obj: MsgCreateBinaryOptionsMarketOrderResponse):
      Tx.MsgCreateBinaryOptionsMarketOrderResponse {
    val builder = Tx.MsgCreateBinaryOptionsMarketOrderResponse.newBuilder()
    builder.setOrderHash(obj.orderHash)
    builder.setResults(DerivativeMarketOrderResultsJvmConverter.convert(obj.results))
    return builder.build()
  }
}

public object MsgCancelDerivativeOrderJvmConverter :
    ProtobufTypeMapper<MsgCancelDerivativeOrder, Tx.MsgCancelDerivativeOrder> {
  public override val descriptor: Descriptors.Descriptor =
      Tx.MsgCancelDerivativeOrder.getDescriptor()

  public override val parser: Parser<Tx.MsgCancelDerivativeOrder> =
      Tx.MsgCancelDerivativeOrder.parser()

  public override fun convert(obj: Tx.MsgCancelDerivativeOrder): MsgCancelDerivativeOrder =
      MsgCancelDerivativeOrder(
  	sender = obj.getSender(),
  	marketId = obj.getMarketId(),
  	subaccountId = obj.getSubaccountId(),
  	orderHash = obj.getOrderHash(),
  	orderMask = obj.getOrderMask(),
  	cid = obj.getCid(),
  )

  public override fun convert(obj: MsgCancelDerivativeOrder): Tx.MsgCancelDerivativeOrder {
    val builder = Tx.MsgCancelDerivativeOrder.newBuilder()
    builder.setSender(obj.sender)
    builder.setMarketId(obj.marketId)
    builder.setSubaccountId(obj.subaccountId)
    builder.setOrderHash(obj.orderHash)
    builder.setOrderMask(obj.orderMask)
    builder.setCid(obj.cid)
    return builder.build()
  }
}

public object MsgCancelDerivativeOrderResponseJvmConverter :
    ProtobufTypeMapper<MsgCancelDerivativeOrderResponse, Tx.MsgCancelDerivativeOrderResponse> {
  public override val descriptor: Descriptors.Descriptor =
      Tx.MsgCancelDerivativeOrderResponse.getDescriptor()

  public override val parser: Parser<Tx.MsgCancelDerivativeOrderResponse> =
      Tx.MsgCancelDerivativeOrderResponse.parser()

  public override fun convert(obj: Tx.MsgCancelDerivativeOrderResponse):
      MsgCancelDerivativeOrderResponse = MsgCancelDerivativeOrderResponse(
  )

  public override fun convert(obj: MsgCancelDerivativeOrderResponse):
      Tx.MsgCancelDerivativeOrderResponse {
    val builder = Tx.MsgCancelDerivativeOrderResponse.newBuilder()
    return builder.build()
  }
}

public object MsgCancelBinaryOptionsOrderJvmConverter :
    ProtobufTypeMapper<MsgCancelBinaryOptionsOrder, Tx.MsgCancelBinaryOptionsOrder> {
  public override val descriptor: Descriptors.Descriptor =
      Tx.MsgCancelBinaryOptionsOrder.getDescriptor()

  public override val parser: Parser<Tx.MsgCancelBinaryOptionsOrder> =
      Tx.MsgCancelBinaryOptionsOrder.parser()

  public override fun convert(obj: Tx.MsgCancelBinaryOptionsOrder): MsgCancelBinaryOptionsOrder =
      MsgCancelBinaryOptionsOrder(
  	sender = obj.getSender(),
  	marketId = obj.getMarketId(),
  	subaccountId = obj.getSubaccountId(),
  	orderHash = obj.getOrderHash(),
  	orderMask = obj.getOrderMask(),
  	cid = obj.getCid(),
  )

  public override fun convert(obj: MsgCancelBinaryOptionsOrder): Tx.MsgCancelBinaryOptionsOrder {
    val builder = Tx.MsgCancelBinaryOptionsOrder.newBuilder()
    builder.setSender(obj.sender)
    builder.setMarketId(obj.marketId)
    builder.setSubaccountId(obj.subaccountId)
    builder.setOrderHash(obj.orderHash)
    builder.setOrderMask(obj.orderMask)
    builder.setCid(obj.cid)
    return builder.build()
  }
}

public object MsgCancelBinaryOptionsOrderResponseJvmConverter :
    ProtobufTypeMapper<MsgCancelBinaryOptionsOrderResponse, Tx.MsgCancelBinaryOptionsOrderResponse>
    {
  public override val descriptor: Descriptors.Descriptor =
      Tx.MsgCancelBinaryOptionsOrderResponse.getDescriptor()

  public override val parser: Parser<Tx.MsgCancelBinaryOptionsOrderResponse> =
      Tx.MsgCancelBinaryOptionsOrderResponse.parser()

  public override fun convert(obj: Tx.MsgCancelBinaryOptionsOrderResponse):
      MsgCancelBinaryOptionsOrderResponse = MsgCancelBinaryOptionsOrderResponse(
  )

  public override fun convert(obj: MsgCancelBinaryOptionsOrderResponse):
      Tx.MsgCancelBinaryOptionsOrderResponse {
    val builder = Tx.MsgCancelBinaryOptionsOrderResponse.newBuilder()
    return builder.build()
  }
}

public object OrderDataJvmConverter : ProtobufTypeMapper<OrderData, Tx.OrderData> {
  public override val descriptor: Descriptors.Descriptor = Tx.OrderData.getDescriptor()

  public override val parser: Parser<Tx.OrderData> = Tx.OrderData.parser()

  public override fun convert(obj: Tx.OrderData): OrderData = OrderData(
  	marketId = obj.getMarketId(),
  	subaccountId = obj.getSubaccountId(),
  	orderHash = obj.getOrderHash(),
  	orderMask = obj.getOrderMask(),
  	cid = obj.getCid(),
  )

  public override fun convert(obj: OrderData): Tx.OrderData {
    val builder = Tx.OrderData.newBuilder()
    builder.setMarketId(obj.marketId)
    builder.setSubaccountId(obj.subaccountId)
    builder.setOrderHash(obj.orderHash)
    builder.setOrderMask(obj.orderMask)
    builder.setCid(obj.cid)
    return builder.build()
  }
}

public object MsgBatchCancelDerivativeOrdersJvmConverter :
    ProtobufTypeMapper<MsgBatchCancelDerivativeOrders, Tx.MsgBatchCancelDerivativeOrders> {
  public override val descriptor: Descriptors.Descriptor =
      Tx.MsgBatchCancelDerivativeOrders.getDescriptor()

  public override val parser: Parser<Tx.MsgBatchCancelDerivativeOrders> =
      Tx.MsgBatchCancelDerivativeOrders.parser()

  public override fun convert(obj: Tx.MsgBatchCancelDerivativeOrders):
      MsgBatchCancelDerivativeOrders = MsgBatchCancelDerivativeOrders(
  	sender = obj.getSender(),
  	`data` = obj.getDataList().map { OrderDataJvmConverter.convert(it) },
  )

  public override fun convert(obj: MsgBatchCancelDerivativeOrders):
      Tx.MsgBatchCancelDerivativeOrders {
    val builder = Tx.MsgBatchCancelDerivativeOrders.newBuilder()
    builder.setSender(obj.sender)
    builder.addAllData(obj.`data`.map { OrderDataJvmConverter.convert(it) })
    return builder.build()
  }
}

public object MsgBatchCancelDerivativeOrdersResponseJvmConverter :
    ProtobufTypeMapper<MsgBatchCancelDerivativeOrdersResponse, Tx.MsgBatchCancelDerivativeOrdersResponse>
    {
  public override val descriptor: Descriptors.Descriptor =
      Tx.MsgBatchCancelDerivativeOrdersResponse.getDescriptor()

  public override val parser: Parser<Tx.MsgBatchCancelDerivativeOrdersResponse> =
      Tx.MsgBatchCancelDerivativeOrdersResponse.parser()

  public override fun convert(obj: Tx.MsgBatchCancelDerivativeOrdersResponse):
      MsgBatchCancelDerivativeOrdersResponse = MsgBatchCancelDerivativeOrdersResponse(
  	success = obj.getSuccessList().map { it },
  )

  public override fun convert(obj: MsgBatchCancelDerivativeOrdersResponse):
      Tx.MsgBatchCancelDerivativeOrdersResponse {
    val builder = Tx.MsgBatchCancelDerivativeOrdersResponse.newBuilder()
    builder.addAllSuccess(obj.success.map { it })
    return builder.build()
  }
}

public object MsgSubaccountTransferJvmConverter :
    ProtobufTypeMapper<MsgSubaccountTransfer, Tx.MsgSubaccountTransfer> {
  public override val descriptor: Descriptors.Descriptor = Tx.MsgSubaccountTransfer.getDescriptor()

  public override val parser: Parser<Tx.MsgSubaccountTransfer> = Tx.MsgSubaccountTransfer.parser()

  public override fun convert(obj: Tx.MsgSubaccountTransfer): MsgSubaccountTransfer =
      MsgSubaccountTransfer(
  	sender = obj.getSender(),
  	sourceSubaccountId = obj.getSourceSubaccountId(),
  	destinationSubaccountId = obj.getDestinationSubaccountId(),
  	amount = CoinJvmConverter.convert(obj.getAmount()),
  )

  public override fun convert(obj: MsgSubaccountTransfer): Tx.MsgSubaccountTransfer {
    val builder = Tx.MsgSubaccountTransfer.newBuilder()
    builder.setSender(obj.sender)
    builder.setSourceSubaccountId(obj.sourceSubaccountId)
    builder.setDestinationSubaccountId(obj.destinationSubaccountId)
    builder.setAmount(CoinJvmConverter.convert(obj.amount))
    return builder.build()
  }
}

public object MsgSubaccountTransferResponseJvmConverter :
    ProtobufTypeMapper<MsgSubaccountTransferResponse, Tx.MsgSubaccountTransferResponse> {
  public override val descriptor: Descriptors.Descriptor =
      Tx.MsgSubaccountTransferResponse.getDescriptor()

  public override val parser: Parser<Tx.MsgSubaccountTransferResponse> =
      Tx.MsgSubaccountTransferResponse.parser()

  public override fun convert(obj: Tx.MsgSubaccountTransferResponse): MsgSubaccountTransferResponse
      = MsgSubaccountTransferResponse(
  )

  public override fun convert(obj: MsgSubaccountTransferResponse):
      Tx.MsgSubaccountTransferResponse {
    val builder = Tx.MsgSubaccountTransferResponse.newBuilder()
    return builder.build()
  }
}

public object MsgExternalTransferJvmConverter :
    ProtobufTypeMapper<MsgExternalTransfer, Tx.MsgExternalTransfer> {
  public override val descriptor: Descriptors.Descriptor = Tx.MsgExternalTransfer.getDescriptor()

  public override val parser: Parser<Tx.MsgExternalTransfer> = Tx.MsgExternalTransfer.parser()

  public override fun convert(obj: Tx.MsgExternalTransfer): MsgExternalTransfer =
      MsgExternalTransfer(
  	sender = obj.getSender(),
  	sourceSubaccountId = obj.getSourceSubaccountId(),
  	destinationSubaccountId = obj.getDestinationSubaccountId(),
  	amount = CoinJvmConverter.convert(obj.getAmount()),
  )

  public override fun convert(obj: MsgExternalTransfer): Tx.MsgExternalTransfer {
    val builder = Tx.MsgExternalTransfer.newBuilder()
    builder.setSender(obj.sender)
    builder.setSourceSubaccountId(obj.sourceSubaccountId)
    builder.setDestinationSubaccountId(obj.destinationSubaccountId)
    builder.setAmount(CoinJvmConverter.convert(obj.amount))
    return builder.build()
  }
}

public object MsgExternalTransferResponseJvmConverter :
    ProtobufTypeMapper<MsgExternalTransferResponse, Tx.MsgExternalTransferResponse> {
  public override val descriptor: Descriptors.Descriptor =
      Tx.MsgExternalTransferResponse.getDescriptor()

  public override val parser: Parser<Tx.MsgExternalTransferResponse> =
      Tx.MsgExternalTransferResponse.parser()

  public override fun convert(obj: Tx.MsgExternalTransferResponse): MsgExternalTransferResponse =
      MsgExternalTransferResponse(
  )

  public override fun convert(obj: MsgExternalTransferResponse): Tx.MsgExternalTransferResponse {
    val builder = Tx.MsgExternalTransferResponse.newBuilder()
    return builder.build()
  }
}

public object MsgLiquidatePositionJvmConverter :
    ProtobufTypeMapper<MsgLiquidatePosition, Tx.MsgLiquidatePosition> {
  public override val descriptor: Descriptors.Descriptor = Tx.MsgLiquidatePosition.getDescriptor()

  public override val parser: Parser<Tx.MsgLiquidatePosition> = Tx.MsgLiquidatePosition.parser()

  public override fun convert(obj: Tx.MsgLiquidatePosition): MsgLiquidatePosition =
      MsgLiquidatePosition(
  	sender = obj.getSender(),
  	subaccountId = obj.getSubaccountId(),
  	marketId = obj.getMarketId(),
  	order = DerivativeOrderJvmConverter.convert(obj.getOrder()),
  )

  public override fun convert(obj: MsgLiquidatePosition): Tx.MsgLiquidatePosition {
    val builder = Tx.MsgLiquidatePosition.newBuilder()
    builder.setSender(obj.sender)
    builder.setSubaccountId(obj.subaccountId)
    builder.setMarketId(obj.marketId)
    builder.setOrder(DerivativeOrderJvmConverter.convert(obj.order))
    return builder.build()
  }
}

public object MsgLiquidatePositionResponseJvmConverter :
    ProtobufTypeMapper<MsgLiquidatePositionResponse, Tx.MsgLiquidatePositionResponse> {
  public override val descriptor: Descriptors.Descriptor =
      Tx.MsgLiquidatePositionResponse.getDescriptor()

  public override val parser: Parser<Tx.MsgLiquidatePositionResponse> =
      Tx.MsgLiquidatePositionResponse.parser()

  public override fun convert(obj: Tx.MsgLiquidatePositionResponse): MsgLiquidatePositionResponse =
      MsgLiquidatePositionResponse(
  )

  public override fun convert(obj: MsgLiquidatePositionResponse): Tx.MsgLiquidatePositionResponse {
    val builder = Tx.MsgLiquidatePositionResponse.newBuilder()
    return builder.build()
  }
}

public object MsgEmergencySettleMarketJvmConverter :
    ProtobufTypeMapper<MsgEmergencySettleMarket, Tx.MsgEmergencySettleMarket> {
  public override val descriptor: Descriptors.Descriptor =
      Tx.MsgEmergencySettleMarket.getDescriptor()

  public override val parser: Parser<Tx.MsgEmergencySettleMarket> =
      Tx.MsgEmergencySettleMarket.parser()

  public override fun convert(obj: Tx.MsgEmergencySettleMarket): MsgEmergencySettleMarket =
      MsgEmergencySettleMarket(
  	sender = obj.getSender(),
  	subaccountId = obj.getSubaccountId(),
  	marketId = obj.getMarketId(),
  )

  public override fun convert(obj: MsgEmergencySettleMarket): Tx.MsgEmergencySettleMarket {
    val builder = Tx.MsgEmergencySettleMarket.newBuilder()
    builder.setSender(obj.sender)
    builder.setSubaccountId(obj.subaccountId)
    builder.setMarketId(obj.marketId)
    return builder.build()
  }
}

public object MsgEmergencySettleMarketResponseJvmConverter :
    ProtobufTypeMapper<MsgEmergencySettleMarketResponse, Tx.MsgEmergencySettleMarketResponse> {
  public override val descriptor: Descriptors.Descriptor =
      Tx.MsgEmergencySettleMarketResponse.getDescriptor()

  public override val parser: Parser<Tx.MsgEmergencySettleMarketResponse> =
      Tx.MsgEmergencySettleMarketResponse.parser()

  public override fun convert(obj: Tx.MsgEmergencySettleMarketResponse):
      MsgEmergencySettleMarketResponse = MsgEmergencySettleMarketResponse(
  )

  public override fun convert(obj: MsgEmergencySettleMarketResponse):
      Tx.MsgEmergencySettleMarketResponse {
    val builder = Tx.MsgEmergencySettleMarketResponse.newBuilder()
    return builder.build()
  }
}

public object MsgIncreasePositionMarginJvmConverter :
    ProtobufTypeMapper<MsgIncreasePositionMargin, Tx.MsgIncreasePositionMargin> {
  public override val descriptor: Descriptors.Descriptor =
      Tx.MsgIncreasePositionMargin.getDescriptor()

  public override val parser: Parser<Tx.MsgIncreasePositionMargin> =
      Tx.MsgIncreasePositionMargin.parser()

  public override fun convert(obj: Tx.MsgIncreasePositionMargin): MsgIncreasePositionMargin =
      MsgIncreasePositionMargin(
  	sender = obj.getSender(),
  	sourceSubaccountId = obj.getSourceSubaccountId(),
  	destinationSubaccountId = obj.getDestinationSubaccountId(),
  	marketId = obj.getMarketId(),
  	amount = obj.getAmount(),
  )

  public override fun convert(obj: MsgIncreasePositionMargin): Tx.MsgIncreasePositionMargin {
    val builder = Tx.MsgIncreasePositionMargin.newBuilder()
    builder.setSender(obj.sender)
    builder.setSourceSubaccountId(obj.sourceSubaccountId)
    builder.setDestinationSubaccountId(obj.destinationSubaccountId)
    builder.setMarketId(obj.marketId)
    builder.setAmount(obj.amount)
    return builder.build()
  }
}

public object MsgIncreasePositionMarginResponseJvmConverter :
    ProtobufTypeMapper<MsgIncreasePositionMarginResponse, Tx.MsgIncreasePositionMarginResponse> {
  public override val descriptor: Descriptors.Descriptor =
      Tx.MsgIncreasePositionMarginResponse.getDescriptor()

  public override val parser: Parser<Tx.MsgIncreasePositionMarginResponse> =
      Tx.MsgIncreasePositionMarginResponse.parser()

  public override fun convert(obj: Tx.MsgIncreasePositionMarginResponse):
      MsgIncreasePositionMarginResponse = MsgIncreasePositionMarginResponse(
  )

  public override fun convert(obj: MsgIncreasePositionMarginResponse):
      Tx.MsgIncreasePositionMarginResponse {
    val builder = Tx.MsgIncreasePositionMarginResponse.newBuilder()
    return builder.build()
  }
}

public object MsgPrivilegedExecuteContractJvmConverter :
    ProtobufTypeMapper<MsgPrivilegedExecuteContract, Tx.MsgPrivilegedExecuteContract> {
  public override val descriptor: Descriptors.Descriptor =
      Tx.MsgPrivilegedExecuteContract.getDescriptor()

  public override val parser: Parser<Tx.MsgPrivilegedExecuteContract> =
      Tx.MsgPrivilegedExecuteContract.parser()

  public override fun convert(obj: Tx.MsgPrivilegedExecuteContract): MsgPrivilegedExecuteContract =
      MsgPrivilegedExecuteContract(
  	sender = obj.getSender(),
  	funds = obj.getFunds(),
  	contractAddress = obj.getContractAddress(),
  	`data` = obj.getData(),
  )

  public override fun convert(obj: MsgPrivilegedExecuteContract): Tx.MsgPrivilegedExecuteContract {
    val builder = Tx.MsgPrivilegedExecuteContract.newBuilder()
    builder.setSender(obj.sender)
    builder.setFunds(obj.funds)
    builder.setContractAddress(obj.contractAddress)
    builder.setData(obj.`data`)
    return builder.build()
  }
}

public object MsgPrivilegedExecuteContractResponseJvmConverter :
    ProtobufTypeMapper<MsgPrivilegedExecuteContractResponse, Tx.MsgPrivilegedExecuteContractResponse>
    {
  public override val descriptor: Descriptors.Descriptor =
      Tx.MsgPrivilegedExecuteContractResponse.getDescriptor()

  public override val parser: Parser<Tx.MsgPrivilegedExecuteContractResponse> =
      Tx.MsgPrivilegedExecuteContractResponse.parser()

  public override fun convert(obj: Tx.MsgPrivilegedExecuteContractResponse):
      MsgPrivilegedExecuteContractResponse = MsgPrivilegedExecuteContractResponse(
  	fundsDiff = obj.getFundsDiffList().map { CoinJvmConverter.convert(it) },
  )

  public override fun convert(obj: MsgPrivilegedExecuteContractResponse):
      Tx.MsgPrivilegedExecuteContractResponse {
    val builder = Tx.MsgPrivilegedExecuteContractResponse.newBuilder()
    builder.addAllFundsDiff(obj.fundsDiff.map { CoinJvmConverter.convert(it) })
    return builder.build()
  }
}

public object MsgRewardsOptOutJvmConverter :
    ProtobufTypeMapper<MsgRewardsOptOut, Tx.MsgRewardsOptOut> {
  public override val descriptor: Descriptors.Descriptor = Tx.MsgRewardsOptOut.getDescriptor()

  public override val parser: Parser<Tx.MsgRewardsOptOut> = Tx.MsgRewardsOptOut.parser()

  public override fun convert(obj: Tx.MsgRewardsOptOut): MsgRewardsOptOut = MsgRewardsOptOut(
  	sender = obj.getSender(),
  )

  public override fun convert(obj: MsgRewardsOptOut): Tx.MsgRewardsOptOut {
    val builder = Tx.MsgRewardsOptOut.newBuilder()
    builder.setSender(obj.sender)
    return builder.build()
  }
}

public object MsgRewardsOptOutResponseJvmConverter :
    ProtobufTypeMapper<MsgRewardsOptOutResponse, Tx.MsgRewardsOptOutResponse> {
  public override val descriptor: Descriptors.Descriptor =
      Tx.MsgRewardsOptOutResponse.getDescriptor()

  public override val parser: Parser<Tx.MsgRewardsOptOutResponse> =
      Tx.MsgRewardsOptOutResponse.parser()

  public override fun convert(obj: Tx.MsgRewardsOptOutResponse): MsgRewardsOptOutResponse =
      MsgRewardsOptOutResponse(
  )

  public override fun convert(obj: MsgRewardsOptOutResponse): Tx.MsgRewardsOptOutResponse {
    val builder = Tx.MsgRewardsOptOutResponse.newBuilder()
    return builder.build()
  }
}

public object MsgReclaimLockedFundsJvmConverter :
    ProtobufTypeMapper<MsgReclaimLockedFunds, Tx.MsgReclaimLockedFunds> {
  public override val descriptor: Descriptors.Descriptor = Tx.MsgReclaimLockedFunds.getDescriptor()

  public override val parser: Parser<Tx.MsgReclaimLockedFunds> = Tx.MsgReclaimLockedFunds.parser()

  public override fun convert(obj: Tx.MsgReclaimLockedFunds): MsgReclaimLockedFunds =
      MsgReclaimLockedFunds(
  	sender = obj.getSender(),
  	lockedAccountPubKey = obj.getLockedAccountPubKey().toByteArray(),
  	signature = obj.getSignature().toByteArray(),
  )

  public override fun convert(obj: MsgReclaimLockedFunds): Tx.MsgReclaimLockedFunds {
    val builder = Tx.MsgReclaimLockedFunds.newBuilder()
    builder.setSender(obj.sender)
    builder.setLockedAccountPubKey(ByteString.copyFrom(obj.lockedAccountPubKey))
    builder.setSignature(ByteString.copyFrom(obj.signature))
    return builder.build()
  }
}

public object MsgReclaimLockedFundsResponseJvmConverter :
    ProtobufTypeMapper<MsgReclaimLockedFundsResponse, Tx.MsgReclaimLockedFundsResponse> {
  public override val descriptor: Descriptors.Descriptor =
      Tx.MsgReclaimLockedFundsResponse.getDescriptor()

  public override val parser: Parser<Tx.MsgReclaimLockedFundsResponse> =
      Tx.MsgReclaimLockedFundsResponse.parser()

  public override fun convert(obj: Tx.MsgReclaimLockedFundsResponse): MsgReclaimLockedFundsResponse
      = MsgReclaimLockedFundsResponse(
  )

  public override fun convert(obj: MsgReclaimLockedFundsResponse):
      Tx.MsgReclaimLockedFundsResponse {
    val builder = Tx.MsgReclaimLockedFundsResponse.newBuilder()
    return builder.build()
  }
}

public object MsgSignDataJvmConverter : ProtobufTypeMapper<MsgSignData, Tx.MsgSignData> {
  public override val descriptor: Descriptors.Descriptor = Tx.MsgSignData.getDescriptor()

  public override val parser: Parser<Tx.MsgSignData> = Tx.MsgSignData.parser()

  public override fun convert(obj: Tx.MsgSignData): MsgSignData = MsgSignData(
  	signer = obj.getSigner().toByteArray(),
  	`data` = obj.getData().toByteArray(),
  )

  public override fun convert(obj: MsgSignData): Tx.MsgSignData {
    val builder = Tx.MsgSignData.newBuilder()
    builder.setSigner(ByteString.copyFrom(obj.signer))
    builder.setData(ByteString.copyFrom(obj.`data`))
    return builder.build()
  }
}

public object MsgSignDocJvmConverter : ProtobufTypeMapper<MsgSignDoc, Tx.MsgSignDoc> {
  public override val descriptor: Descriptors.Descriptor = Tx.MsgSignDoc.getDescriptor()

  public override val parser: Parser<Tx.MsgSignDoc> = Tx.MsgSignDoc.parser()

  public override fun convert(obj: Tx.MsgSignDoc): MsgSignDoc = MsgSignDoc(
  	signType = obj.getSignType(),
  	`value` = MsgSignDataJvmConverter.convert(obj.getValue()),
  )

  public override fun convert(obj: MsgSignDoc): Tx.MsgSignDoc {
    val builder = Tx.MsgSignDoc.newBuilder()
    builder.setSignType(obj.signType)
    builder.setValue(MsgSignDataJvmConverter.convert(obj.`value`))
    return builder.build()
  }
}

public object MsgAdminUpdateBinaryOptionsMarketJvmConverter :
    ProtobufTypeMapper<MsgAdminUpdateBinaryOptionsMarket, Tx.MsgAdminUpdateBinaryOptionsMarket> {
  public override val descriptor: Descriptors.Descriptor =
      Tx.MsgAdminUpdateBinaryOptionsMarket.getDescriptor()

  public override val parser: Parser<Tx.MsgAdminUpdateBinaryOptionsMarket> =
      Tx.MsgAdminUpdateBinaryOptionsMarket.parser()

  public override fun convert(obj: Tx.MsgAdminUpdateBinaryOptionsMarket):
      MsgAdminUpdateBinaryOptionsMarket = MsgAdminUpdateBinaryOptionsMarket(
  	sender = obj.getSender(),
  	marketId = obj.getMarketId(),
  	settlementPrice = obj.getSettlementPrice(),
  	expirationTimestamp = obj.getExpirationTimestamp(),
  	settlementTimestamp = obj.getSettlementTimestamp(),
  	status = MarketStatus.forNumber(obj.getStatus().number),
  )

  public override fun convert(obj: MsgAdminUpdateBinaryOptionsMarket):
      Tx.MsgAdminUpdateBinaryOptionsMarket {
    val builder = Tx.MsgAdminUpdateBinaryOptionsMarket.newBuilder()
    builder.setSender(obj.sender)
    builder.setMarketId(obj.marketId)
    builder.setSettlementPrice(obj.settlementPrice)
    builder.setExpirationTimestamp(obj.expirationTimestamp)
    builder.setSettlementTimestamp(obj.settlementTimestamp)
    builder.setStatus(Exchange.MarketStatus.forNumber(obj.status.number))
    return builder.build()
  }
}

public object MsgAdminUpdateBinaryOptionsMarketResponseJvmConverter :
    ProtobufTypeMapper<MsgAdminUpdateBinaryOptionsMarketResponse, Tx.MsgAdminUpdateBinaryOptionsMarketResponse>
    {
  public override val descriptor: Descriptors.Descriptor =
      Tx.MsgAdminUpdateBinaryOptionsMarketResponse.getDescriptor()

  public override val parser: Parser<Tx.MsgAdminUpdateBinaryOptionsMarketResponse> =
      Tx.MsgAdminUpdateBinaryOptionsMarketResponse.parser()

  public override fun convert(obj: Tx.MsgAdminUpdateBinaryOptionsMarketResponse):
      MsgAdminUpdateBinaryOptionsMarketResponse = MsgAdminUpdateBinaryOptionsMarketResponse(
  )

  public override fun convert(obj: MsgAdminUpdateBinaryOptionsMarketResponse):
      Tx.MsgAdminUpdateBinaryOptionsMarketResponse {
    val builder = Tx.MsgAdminUpdateBinaryOptionsMarketResponse.newBuilder()
    return builder.build()
  }
}
