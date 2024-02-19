// Transform from injective/exchange/v1beta1/proposal.proto
@file:GeneratorVersion(version = "0.3.1")

package injective.exchange.v1beta1

import com.google.protobuf.Descriptors
import com.google.protobuf.Parser
import cosmos.distribution.v1beta1.CommunityPoolSpendProposalJvmConverter
import injective.oracle.v1beta1.Oracle
import injective.oracle.v1beta1.OracleType
import kr.jadekim.protobuf.`annotation`.GeneratorVersion
import kr.jadekim.protobuf.converter.mapper.ProtobufTypeMapper
import kr.jadekim.protobuf.util.asJavaType
import kr.jadekim.protobuf.util.asKotlinType

public object SpotMarketParamUpdateProposalJvmConverter :
    ProtobufTypeMapper<SpotMarketParamUpdateProposal, Proposal.SpotMarketParamUpdateProposal> {
  public override val descriptor: Descriptors.Descriptor =
      Proposal.SpotMarketParamUpdateProposal.getDescriptor()

  public override val parser: Parser<Proposal.SpotMarketParamUpdateProposal> =
      Proposal.SpotMarketParamUpdateProposal.parser()

  public override fun convert(obj: Proposal.SpotMarketParamUpdateProposal):
      SpotMarketParamUpdateProposal = SpotMarketParamUpdateProposal(
  	title = obj.getTitle(),
  	description = obj.getDescription(),
  	marketId = obj.getMarketId(),
  	makerFeeRate = obj.getMakerFeeRate(),
  	takerFeeRate = obj.getTakerFeeRate(),
  	relayerFeeShareRate = obj.getRelayerFeeShareRate(),
  	minPriceTickSize = obj.getMinPriceTickSize(),
  	minQuantityTickSize = obj.getMinQuantityTickSize(),
  	status = MarketStatus.forNumber(obj.getStatus().number),
  )

  public override fun convert(obj: SpotMarketParamUpdateProposal):
      Proposal.SpotMarketParamUpdateProposal {
    val builder = Proposal.SpotMarketParamUpdateProposal.newBuilder()
    builder.setTitle(obj.title)
    builder.setDescription(obj.description)
    builder.setMarketId(obj.marketId)
    builder.setMakerFeeRate(obj.makerFeeRate)
    builder.setTakerFeeRate(obj.takerFeeRate)
    builder.setRelayerFeeShareRate(obj.relayerFeeShareRate)
    builder.setMinPriceTickSize(obj.minPriceTickSize)
    builder.setMinQuantityTickSize(obj.minQuantityTickSize)
    builder.setStatus(Exchange.MarketStatus.forNumber(obj.status.number))
    return builder.build()
  }
}

public object ExchangeEnableProposalJvmConverter :
    ProtobufTypeMapper<ExchangeEnableProposal, Proposal.ExchangeEnableProposal> {
  public override val descriptor: Descriptors.Descriptor =
      Proposal.ExchangeEnableProposal.getDescriptor()

  public override val parser: Parser<Proposal.ExchangeEnableProposal> =
      Proposal.ExchangeEnableProposal.parser()

  public override fun convert(obj: Proposal.ExchangeEnableProposal): ExchangeEnableProposal =
      ExchangeEnableProposal(
  	title = obj.getTitle(),
  	description = obj.getDescription(),
  	exchangeType = ExchangeType.forNumber(obj.getExchangeType().number),
  )

  public override fun convert(obj: ExchangeEnableProposal): Proposal.ExchangeEnableProposal {
    val builder = Proposal.ExchangeEnableProposal.newBuilder()
    builder.setTitle(obj.title)
    builder.setDescription(obj.description)
    builder.setExchangeType(Proposal.ExchangeType.forNumber(obj.exchangeType.number))
    return builder.build()
  }
}

public object BatchExchangeModificationProposalJvmConverter :
    ProtobufTypeMapper<BatchExchangeModificationProposal, Proposal.BatchExchangeModificationProposal>
    {
  public override val descriptor: Descriptors.Descriptor =
      Proposal.BatchExchangeModificationProposal.getDescriptor()

  public override val parser: Parser<Proposal.BatchExchangeModificationProposal> =
      Proposal.BatchExchangeModificationProposal.parser()

  public override fun convert(obj: Proposal.BatchExchangeModificationProposal):
      BatchExchangeModificationProposal = BatchExchangeModificationProposal(
  	title = obj.getTitle(),
  	description = obj.getDescription(),
  	spotMarketParamUpdateProposals = obj.getSpotMarketParamUpdateProposalsList().map {
      SpotMarketParamUpdateProposalJvmConverter.convert(it) },
  	derivativeMarketParamUpdateProposals = obj.getDerivativeMarketParamUpdateProposalsList().map {
      DerivativeMarketParamUpdateProposalJvmConverter.convert(it) },
  	spotMarketLaunchProposals = obj.getSpotMarketLaunchProposalsList().map {
      SpotMarketLaunchProposalJvmConverter.convert(it) },
  	perpetualMarketLaunchProposals = obj.getPerpetualMarketLaunchProposalsList().map {
      PerpetualMarketLaunchProposalJvmConverter.convert(it) },
  	expiryFuturesMarketLaunchProposals = obj.getExpiryFuturesMarketLaunchProposalsList().map {
      ExpiryFuturesMarketLaunchProposalJvmConverter.convert(it) },
  	tradingRewardCampaignUpdateProposal =
      TradingRewardCampaignUpdateProposalJvmConverter.convert(obj.getTradingRewardCampaignUpdateProposal()),
  	binaryOptionsMarketLaunchProposals = obj.getBinaryOptionsMarketLaunchProposalsList().map {
      BinaryOptionsMarketLaunchProposalJvmConverter.convert(it) },
  	binaryOptionsParamUpdateProposals = obj.getBinaryOptionsParamUpdateProposalsList().map {
      BinaryOptionsMarketParamUpdateProposalJvmConverter.convert(it) },
  	denomDecimalsUpdateProposal =
      UpdateDenomDecimalsProposalJvmConverter.convert(obj.getDenomDecimalsUpdateProposal()),
  	feeDiscountProposal = FeeDiscountProposalJvmConverter.convert(obj.getFeeDiscountProposal()),
  	marketForcedSettlementProposals = obj.getMarketForcedSettlementProposalsList().map {
      MarketForcedSettlementProposalJvmConverter.convert(it) },
  )

  public override fun convert(obj: BatchExchangeModificationProposal):
      Proposal.BatchExchangeModificationProposal {
    val builder = Proposal.BatchExchangeModificationProposal.newBuilder()
    builder.setTitle(obj.title)
    builder.setDescription(obj.description)
    builder.addAllSpotMarketParamUpdateProposals(obj.spotMarketParamUpdateProposals.map {
        SpotMarketParamUpdateProposalJvmConverter.convert(it) })
    builder.addAllDerivativeMarketParamUpdateProposals(obj.derivativeMarketParamUpdateProposals.map
        { DerivativeMarketParamUpdateProposalJvmConverter.convert(it) })
    builder.addAllSpotMarketLaunchProposals(obj.spotMarketLaunchProposals.map {
        SpotMarketLaunchProposalJvmConverter.convert(it) })
    builder.addAllPerpetualMarketLaunchProposals(obj.perpetualMarketLaunchProposals.map {
        PerpetualMarketLaunchProposalJvmConverter.convert(it) })
    builder.addAllExpiryFuturesMarketLaunchProposals(obj.expiryFuturesMarketLaunchProposals.map {
        ExpiryFuturesMarketLaunchProposalJvmConverter.convert(it) })
    builder.setTradingRewardCampaignUpdateProposal(TradingRewardCampaignUpdateProposalJvmConverter.convert(obj.tradingRewardCampaignUpdateProposal))
    builder.addAllBinaryOptionsMarketLaunchProposals(obj.binaryOptionsMarketLaunchProposals.map {
        BinaryOptionsMarketLaunchProposalJvmConverter.convert(it) })
    builder.addAllBinaryOptionsParamUpdateProposals(obj.binaryOptionsParamUpdateProposals.map {
        BinaryOptionsMarketParamUpdateProposalJvmConverter.convert(it) })
    builder.setDenomDecimalsUpdateProposal(UpdateDenomDecimalsProposalJvmConverter.convert(obj.denomDecimalsUpdateProposal))
    builder.setFeeDiscountProposal(FeeDiscountProposalJvmConverter.convert(obj.feeDiscountProposal))
    builder.addAllMarketForcedSettlementProposals(obj.marketForcedSettlementProposals.map {
        MarketForcedSettlementProposalJvmConverter.convert(it) })
    return builder.build()
  }
}

public object SpotMarketLaunchProposalJvmConverter :
    ProtobufTypeMapper<SpotMarketLaunchProposal, Proposal.SpotMarketLaunchProposal> {
  public override val descriptor: Descriptors.Descriptor =
      Proposal.SpotMarketLaunchProposal.getDescriptor()

  public override val parser: Parser<Proposal.SpotMarketLaunchProposal> =
      Proposal.SpotMarketLaunchProposal.parser()

  public override fun convert(obj: Proposal.SpotMarketLaunchProposal): SpotMarketLaunchProposal =
      SpotMarketLaunchProposal(
  	title = obj.getTitle(),
  	description = obj.getDescription(),
  	ticker = obj.getTicker(),
  	baseDenom = obj.getBaseDenom(),
  	quoteDenom = obj.getQuoteDenom(),
  	minPriceTickSize = obj.getMinPriceTickSize(),
  	minQuantityTickSize = obj.getMinQuantityTickSize(),
  	makerFeeRate = obj.getMakerFeeRate(),
  	takerFeeRate = obj.getTakerFeeRate(),
  )

  public override fun convert(obj: SpotMarketLaunchProposal): Proposal.SpotMarketLaunchProposal {
    val builder = Proposal.SpotMarketLaunchProposal.newBuilder()
    builder.setTitle(obj.title)
    builder.setDescription(obj.description)
    builder.setTicker(obj.ticker)
    builder.setBaseDenom(obj.baseDenom)
    builder.setQuoteDenom(obj.quoteDenom)
    builder.setMinPriceTickSize(obj.minPriceTickSize)
    builder.setMinQuantityTickSize(obj.minQuantityTickSize)
    builder.setMakerFeeRate(obj.makerFeeRate)
    builder.setTakerFeeRate(obj.takerFeeRate)
    return builder.build()
  }
}

public object PerpetualMarketLaunchProposalJvmConverter :
    ProtobufTypeMapper<PerpetualMarketLaunchProposal, Proposal.PerpetualMarketLaunchProposal> {
  public override val descriptor: Descriptors.Descriptor =
      Proposal.PerpetualMarketLaunchProposal.getDescriptor()

  public override val parser: Parser<Proposal.PerpetualMarketLaunchProposal> =
      Proposal.PerpetualMarketLaunchProposal.parser()

  public override fun convert(obj: Proposal.PerpetualMarketLaunchProposal):
      PerpetualMarketLaunchProposal = PerpetualMarketLaunchProposal(
  	title = obj.getTitle(),
  	description = obj.getDescription(),
  	ticker = obj.getTicker(),
  	quoteDenom = obj.getQuoteDenom(),
  	oracleBase = obj.getOracleBase(),
  	oracleQuote = obj.getOracleQuote(),
  	oracleScaleFactor = obj.getOracleScaleFactor().asKotlinType,
  	oracleType = OracleType.forNumber(obj.getOracleType().number),
  	initialMarginRatio = obj.getInitialMarginRatio(),
  	maintenanceMarginRatio = obj.getMaintenanceMarginRatio(),
  	makerFeeRate = obj.getMakerFeeRate(),
  	takerFeeRate = obj.getTakerFeeRate(),
  	minPriceTickSize = obj.getMinPriceTickSize(),
  	minQuantityTickSize = obj.getMinQuantityTickSize(),
  )

  public override fun convert(obj: PerpetualMarketLaunchProposal):
      Proposal.PerpetualMarketLaunchProposal {
    val builder = Proposal.PerpetualMarketLaunchProposal.newBuilder()
    builder.setTitle(obj.title)
    builder.setDescription(obj.description)
    builder.setTicker(obj.ticker)
    builder.setQuoteDenom(obj.quoteDenom)
    builder.setOracleBase(obj.oracleBase)
    builder.setOracleQuote(obj.oracleQuote)
    builder.setOracleScaleFactor(obj.oracleScaleFactor.asJavaType)
    builder.setOracleType(Oracle.OracleType.forNumber(obj.oracleType.number))
    builder.setInitialMarginRatio(obj.initialMarginRatio)
    builder.setMaintenanceMarginRatio(obj.maintenanceMarginRatio)
    builder.setMakerFeeRate(obj.makerFeeRate)
    builder.setTakerFeeRate(obj.takerFeeRate)
    builder.setMinPriceTickSize(obj.minPriceTickSize)
    builder.setMinQuantityTickSize(obj.minQuantityTickSize)
    return builder.build()
  }
}

public object BinaryOptionsMarketLaunchProposalJvmConverter :
    ProtobufTypeMapper<BinaryOptionsMarketLaunchProposal, Proposal.BinaryOptionsMarketLaunchProposal>
    {
  public override val descriptor: Descriptors.Descriptor =
      Proposal.BinaryOptionsMarketLaunchProposal.getDescriptor()

  public override val parser: Parser<Proposal.BinaryOptionsMarketLaunchProposal> =
      Proposal.BinaryOptionsMarketLaunchProposal.parser()

  public override fun convert(obj: Proposal.BinaryOptionsMarketLaunchProposal):
      BinaryOptionsMarketLaunchProposal = BinaryOptionsMarketLaunchProposal(
  	title = obj.getTitle(),
  	description = obj.getDescription(),
  	ticker = obj.getTicker(),
  	oracleSymbol = obj.getOracleSymbol(),
  	oracleProvider = obj.getOracleProvider(),
  	oracleType = OracleType.forNumber(obj.getOracleType().number),
  	oracleScaleFactor = obj.getOracleScaleFactor().asKotlinType,
  	expirationTimestamp = obj.getExpirationTimestamp(),
  	settlementTimestamp = obj.getSettlementTimestamp(),
  	admin = obj.getAdmin(),
  	quoteDenom = obj.getQuoteDenom(),
  	makerFeeRate = obj.getMakerFeeRate(),
  	takerFeeRate = obj.getTakerFeeRate(),
  	minPriceTickSize = obj.getMinPriceTickSize(),
  	minQuantityTickSize = obj.getMinQuantityTickSize(),
  )

  public override fun convert(obj: BinaryOptionsMarketLaunchProposal):
      Proposal.BinaryOptionsMarketLaunchProposal {
    val builder = Proposal.BinaryOptionsMarketLaunchProposal.newBuilder()
    builder.setTitle(obj.title)
    builder.setDescription(obj.description)
    builder.setTicker(obj.ticker)
    builder.setOracleSymbol(obj.oracleSymbol)
    builder.setOracleProvider(obj.oracleProvider)
    builder.setOracleType(Oracle.OracleType.forNumber(obj.oracleType.number))
    builder.setOracleScaleFactor(obj.oracleScaleFactor.asJavaType)
    builder.setExpirationTimestamp(obj.expirationTimestamp)
    builder.setSettlementTimestamp(obj.settlementTimestamp)
    builder.setAdmin(obj.admin)
    builder.setQuoteDenom(obj.quoteDenom)
    builder.setMakerFeeRate(obj.makerFeeRate)
    builder.setTakerFeeRate(obj.takerFeeRate)
    builder.setMinPriceTickSize(obj.minPriceTickSize)
    builder.setMinQuantityTickSize(obj.minQuantityTickSize)
    return builder.build()
  }
}

public object ExpiryFuturesMarketLaunchProposalJvmConverter :
    ProtobufTypeMapper<ExpiryFuturesMarketLaunchProposal, Proposal.ExpiryFuturesMarketLaunchProposal>
    {
  public override val descriptor: Descriptors.Descriptor =
      Proposal.ExpiryFuturesMarketLaunchProposal.getDescriptor()

  public override val parser: Parser<Proposal.ExpiryFuturesMarketLaunchProposal> =
      Proposal.ExpiryFuturesMarketLaunchProposal.parser()

  public override fun convert(obj: Proposal.ExpiryFuturesMarketLaunchProposal):
      ExpiryFuturesMarketLaunchProposal = ExpiryFuturesMarketLaunchProposal(
  	title = obj.getTitle(),
  	description = obj.getDescription(),
  	ticker = obj.getTicker(),
  	quoteDenom = obj.getQuoteDenom(),
  	oracleBase = obj.getOracleBase(),
  	oracleQuote = obj.getOracleQuote(),
  	oracleScaleFactor = obj.getOracleScaleFactor().asKotlinType,
  	oracleType = OracleType.forNumber(obj.getOracleType().number),
  	expiry = obj.getExpiry(),
  	initialMarginRatio = obj.getInitialMarginRatio(),
  	maintenanceMarginRatio = obj.getMaintenanceMarginRatio(),
  	makerFeeRate = obj.getMakerFeeRate(),
  	takerFeeRate = obj.getTakerFeeRate(),
  	minPriceTickSize = obj.getMinPriceTickSize(),
  	minQuantityTickSize = obj.getMinQuantityTickSize(),
  )

  public override fun convert(obj: ExpiryFuturesMarketLaunchProposal):
      Proposal.ExpiryFuturesMarketLaunchProposal {
    val builder = Proposal.ExpiryFuturesMarketLaunchProposal.newBuilder()
    builder.setTitle(obj.title)
    builder.setDescription(obj.description)
    builder.setTicker(obj.ticker)
    builder.setQuoteDenom(obj.quoteDenom)
    builder.setOracleBase(obj.oracleBase)
    builder.setOracleQuote(obj.oracleQuote)
    builder.setOracleScaleFactor(obj.oracleScaleFactor.asJavaType)
    builder.setOracleType(Oracle.OracleType.forNumber(obj.oracleType.number))
    builder.setExpiry(obj.expiry)
    builder.setInitialMarginRatio(obj.initialMarginRatio)
    builder.setMaintenanceMarginRatio(obj.maintenanceMarginRatio)
    builder.setMakerFeeRate(obj.makerFeeRate)
    builder.setTakerFeeRate(obj.takerFeeRate)
    builder.setMinPriceTickSize(obj.minPriceTickSize)
    builder.setMinQuantityTickSize(obj.minQuantityTickSize)
    return builder.build()
  }
}

public object DerivativeMarketParamUpdateProposalJvmConverter :
    ProtobufTypeMapper<DerivativeMarketParamUpdateProposal, Proposal.DerivativeMarketParamUpdateProposal>
    {
  public override val descriptor: Descriptors.Descriptor =
      Proposal.DerivativeMarketParamUpdateProposal.getDescriptor()

  public override val parser: Parser<Proposal.DerivativeMarketParamUpdateProposal> =
      Proposal.DerivativeMarketParamUpdateProposal.parser()

  public override fun convert(obj: Proposal.DerivativeMarketParamUpdateProposal):
      DerivativeMarketParamUpdateProposal = DerivativeMarketParamUpdateProposal(
  	title = obj.getTitle(),
  	description = obj.getDescription(),
  	marketId = obj.getMarketId(),
  	initialMarginRatio = obj.getInitialMarginRatio(),
  	maintenanceMarginRatio = obj.getMaintenanceMarginRatio(),
  	makerFeeRate = obj.getMakerFeeRate(),
  	takerFeeRate = obj.getTakerFeeRate(),
  	relayerFeeShareRate = obj.getRelayerFeeShareRate(),
  	minPriceTickSize = obj.getMinPriceTickSize(),
  	minQuantityTickSize = obj.getMinQuantityTickSize(),
  	hourlyInterestRate = obj.getHourlyInterestRate(),
  	hourlyFundingRateCap = obj.getHourlyFundingRateCap(),
  	status = MarketStatus.forNumber(obj.getStatus().number),
  	oracleParams = OracleParamsJvmConverter.convert(obj.getOracleParams()),
  )

  public override fun convert(obj: DerivativeMarketParamUpdateProposal):
      Proposal.DerivativeMarketParamUpdateProposal {
    val builder = Proposal.DerivativeMarketParamUpdateProposal.newBuilder()
    builder.setTitle(obj.title)
    builder.setDescription(obj.description)
    builder.setMarketId(obj.marketId)
    builder.setInitialMarginRatio(obj.initialMarginRatio)
    builder.setMaintenanceMarginRatio(obj.maintenanceMarginRatio)
    builder.setMakerFeeRate(obj.makerFeeRate)
    builder.setTakerFeeRate(obj.takerFeeRate)
    builder.setRelayerFeeShareRate(obj.relayerFeeShareRate)
    builder.setMinPriceTickSize(obj.minPriceTickSize)
    builder.setMinQuantityTickSize(obj.minQuantityTickSize)
    builder.setHourlyInterestRate(obj.hourlyInterestRate)
    builder.setHourlyFundingRateCap(obj.hourlyFundingRateCap)
    builder.setStatus(Exchange.MarketStatus.forNumber(obj.status.number))
    builder.setOracleParams(OracleParamsJvmConverter.convert(obj.oracleParams))
    return builder.build()
  }
}

public object MarketForcedSettlementProposalJvmConverter :
    ProtobufTypeMapper<MarketForcedSettlementProposal, Proposal.MarketForcedSettlementProposal> {
  public override val descriptor: Descriptors.Descriptor =
      Proposal.MarketForcedSettlementProposal.getDescriptor()

  public override val parser: Parser<Proposal.MarketForcedSettlementProposal> =
      Proposal.MarketForcedSettlementProposal.parser()

  public override fun convert(obj: Proposal.MarketForcedSettlementProposal):
      MarketForcedSettlementProposal = MarketForcedSettlementProposal(
  	title = obj.getTitle(),
  	description = obj.getDescription(),
  	marketId = obj.getMarketId(),
  	settlementPrice = obj.getSettlementPrice(),
  )

  public override fun convert(obj: MarketForcedSettlementProposal):
      Proposal.MarketForcedSettlementProposal {
    val builder = Proposal.MarketForcedSettlementProposal.newBuilder()
    builder.setTitle(obj.title)
    builder.setDescription(obj.description)
    builder.setMarketId(obj.marketId)
    builder.setSettlementPrice(obj.settlementPrice)
    return builder.build()
  }
}

public object UpdateDenomDecimalsProposalJvmConverter :
    ProtobufTypeMapper<UpdateDenomDecimalsProposal, Proposal.UpdateDenomDecimalsProposal> {
  public override val descriptor: Descriptors.Descriptor =
      Proposal.UpdateDenomDecimalsProposal.getDescriptor()

  public override val parser: Parser<Proposal.UpdateDenomDecimalsProposal> =
      Proposal.UpdateDenomDecimalsProposal.parser()

  public override fun convert(obj: Proposal.UpdateDenomDecimalsProposal):
      UpdateDenomDecimalsProposal = UpdateDenomDecimalsProposal(
  	title = obj.getTitle(),
  	description = obj.getDescription(),
  	denomDecimals = obj.getDenomDecimalsList().map { DenomDecimalsJvmConverter.convert(it) },
  )

  public override fun convert(obj: UpdateDenomDecimalsProposal):
      Proposal.UpdateDenomDecimalsProposal {
    val builder = Proposal.UpdateDenomDecimalsProposal.newBuilder()
    builder.setTitle(obj.title)
    builder.setDescription(obj.description)
    builder.addAllDenomDecimals(obj.denomDecimals.map { DenomDecimalsJvmConverter.convert(it) })
    return builder.build()
  }
}

public object BinaryOptionsMarketParamUpdateProposalJvmConverter :
    ProtobufTypeMapper<BinaryOptionsMarketParamUpdateProposal, Proposal.BinaryOptionsMarketParamUpdateProposal>
    {
  public override val descriptor: Descriptors.Descriptor =
      Proposal.BinaryOptionsMarketParamUpdateProposal.getDescriptor()

  public override val parser: Parser<Proposal.BinaryOptionsMarketParamUpdateProposal> =
      Proposal.BinaryOptionsMarketParamUpdateProposal.parser()

  public override fun convert(obj: Proposal.BinaryOptionsMarketParamUpdateProposal):
      BinaryOptionsMarketParamUpdateProposal = BinaryOptionsMarketParamUpdateProposal(
  	title = obj.getTitle(),
  	description = obj.getDescription(),
  	marketId = obj.getMarketId(),
  	makerFeeRate = obj.getMakerFeeRate(),
  	takerFeeRate = obj.getTakerFeeRate(),
  	relayerFeeShareRate = obj.getRelayerFeeShareRate(),
  	minPriceTickSize = obj.getMinPriceTickSize(),
  	minQuantityTickSize = obj.getMinQuantityTickSize(),
  	expirationTimestamp = obj.getExpirationTimestamp(),
  	settlementTimestamp = obj.getSettlementTimestamp(),
  	settlementPrice = obj.getSettlementPrice(),
  	admin = obj.getAdmin(),
  	status = MarketStatus.forNumber(obj.getStatus().number),
  	oracleParams = ProviderOracleParamsJvmConverter.convert(obj.getOracleParams()),
  )

  public override fun convert(obj: BinaryOptionsMarketParamUpdateProposal):
      Proposal.BinaryOptionsMarketParamUpdateProposal {
    val builder = Proposal.BinaryOptionsMarketParamUpdateProposal.newBuilder()
    builder.setTitle(obj.title)
    builder.setDescription(obj.description)
    builder.setMarketId(obj.marketId)
    builder.setMakerFeeRate(obj.makerFeeRate)
    builder.setTakerFeeRate(obj.takerFeeRate)
    builder.setRelayerFeeShareRate(obj.relayerFeeShareRate)
    builder.setMinPriceTickSize(obj.minPriceTickSize)
    builder.setMinQuantityTickSize(obj.minQuantityTickSize)
    builder.setExpirationTimestamp(obj.expirationTimestamp)
    builder.setSettlementTimestamp(obj.settlementTimestamp)
    builder.setSettlementPrice(obj.settlementPrice)
    builder.setAdmin(obj.admin)
    builder.setStatus(Exchange.MarketStatus.forNumber(obj.status.number))
    builder.setOracleParams(ProviderOracleParamsJvmConverter.convert(obj.oracleParams))
    return builder.build()
  }
}

public object ProviderOracleParamsJvmConverter :
    ProtobufTypeMapper<ProviderOracleParams, Proposal.ProviderOracleParams> {
  public override val descriptor: Descriptors.Descriptor =
      Proposal.ProviderOracleParams.getDescriptor()

  public override val parser: Parser<Proposal.ProviderOracleParams> =
      Proposal.ProviderOracleParams.parser()

  public override fun convert(obj: Proposal.ProviderOracleParams): ProviderOracleParams =
      ProviderOracleParams(
  	symbol = obj.getSymbol(),
  	provider = obj.getProvider(),
  	oracleScaleFactor = obj.getOracleScaleFactor().asKotlinType,
  	oracleType = OracleType.forNumber(obj.getOracleType().number),
  )

  public override fun convert(obj: ProviderOracleParams): Proposal.ProviderOracleParams {
    val builder = Proposal.ProviderOracleParams.newBuilder()
    builder.setSymbol(obj.symbol)
    builder.setProvider(obj.provider)
    builder.setOracleScaleFactor(obj.oracleScaleFactor.asJavaType)
    builder.setOracleType(Oracle.OracleType.forNumber(obj.oracleType.number))
    return builder.build()
  }
}

public object OracleParamsJvmConverter : ProtobufTypeMapper<OracleParams, Proposal.OracleParams> {
  public override val descriptor: Descriptors.Descriptor = Proposal.OracleParams.getDescriptor()

  public override val parser: Parser<Proposal.OracleParams> = Proposal.OracleParams.parser()

  public override fun convert(obj: Proposal.OracleParams): OracleParams = OracleParams(
  	oracleBase = obj.getOracleBase(),
  	oracleQuote = obj.getOracleQuote(),
  	oracleScaleFactor = obj.getOracleScaleFactor().asKotlinType,
  	oracleType = OracleType.forNumber(obj.getOracleType().number),
  )

  public override fun convert(obj: OracleParams): Proposal.OracleParams {
    val builder = Proposal.OracleParams.newBuilder()
    builder.setOracleBase(obj.oracleBase)
    builder.setOracleQuote(obj.oracleQuote)
    builder.setOracleScaleFactor(obj.oracleScaleFactor.asJavaType)
    builder.setOracleType(Oracle.OracleType.forNumber(obj.oracleType.number))
    return builder.build()
  }
}

public object TradingRewardCampaignLaunchProposalJvmConverter :
    ProtobufTypeMapper<TradingRewardCampaignLaunchProposal, Proposal.TradingRewardCampaignLaunchProposal>
    {
  public override val descriptor: Descriptors.Descriptor =
      Proposal.TradingRewardCampaignLaunchProposal.getDescriptor()

  public override val parser: Parser<Proposal.TradingRewardCampaignLaunchProposal> =
      Proposal.TradingRewardCampaignLaunchProposal.parser()

  public override fun convert(obj: Proposal.TradingRewardCampaignLaunchProposal):
      TradingRewardCampaignLaunchProposal = TradingRewardCampaignLaunchProposal(
  	title = obj.getTitle(),
  	description = obj.getDescription(),
  	campaignInfo = TradingRewardCampaignInfoJvmConverter.convert(obj.getCampaignInfo()),
  	campaignRewardPools = obj.getCampaignRewardPoolsList().map {
      CampaignRewardPoolJvmConverter.convert(it) },
  )

  public override fun convert(obj: TradingRewardCampaignLaunchProposal):
      Proposal.TradingRewardCampaignLaunchProposal {
    val builder = Proposal.TradingRewardCampaignLaunchProposal.newBuilder()
    builder.setTitle(obj.title)
    builder.setDescription(obj.description)
    builder.setCampaignInfo(TradingRewardCampaignInfoJvmConverter.convert(obj.campaignInfo))
    builder.addAllCampaignRewardPools(obj.campaignRewardPools.map {
        CampaignRewardPoolJvmConverter.convert(it) })
    return builder.build()
  }
}

public object TradingRewardCampaignUpdateProposalJvmConverter :
    ProtobufTypeMapper<TradingRewardCampaignUpdateProposal, Proposal.TradingRewardCampaignUpdateProposal>
    {
  public override val descriptor: Descriptors.Descriptor =
      Proposal.TradingRewardCampaignUpdateProposal.getDescriptor()

  public override val parser: Parser<Proposal.TradingRewardCampaignUpdateProposal> =
      Proposal.TradingRewardCampaignUpdateProposal.parser()

  public override fun convert(obj: Proposal.TradingRewardCampaignUpdateProposal):
      TradingRewardCampaignUpdateProposal = TradingRewardCampaignUpdateProposal(
  	title = obj.getTitle(),
  	description = obj.getDescription(),
  	campaignInfo = TradingRewardCampaignInfoJvmConverter.convert(obj.getCampaignInfo()),
  	campaignRewardPoolsAdditions = obj.getCampaignRewardPoolsAdditionsList().map {
      CampaignRewardPoolJvmConverter.convert(it) },
  	campaignRewardPoolsUpdates = obj.getCampaignRewardPoolsUpdatesList().map {
      CampaignRewardPoolJvmConverter.convert(it) },
  )

  public override fun convert(obj: TradingRewardCampaignUpdateProposal):
      Proposal.TradingRewardCampaignUpdateProposal {
    val builder = Proposal.TradingRewardCampaignUpdateProposal.newBuilder()
    builder.setTitle(obj.title)
    builder.setDescription(obj.description)
    builder.setCampaignInfo(TradingRewardCampaignInfoJvmConverter.convert(obj.campaignInfo))
    builder.addAllCampaignRewardPoolsAdditions(obj.campaignRewardPoolsAdditions.map {
        CampaignRewardPoolJvmConverter.convert(it) })
    builder.addAllCampaignRewardPoolsUpdates(obj.campaignRewardPoolsUpdates.map {
        CampaignRewardPoolJvmConverter.convert(it) })
    return builder.build()
  }
}

public object RewardPointUpdateJvmConverter :
    ProtobufTypeMapper<RewardPointUpdate, Proposal.RewardPointUpdate> {
  public override val descriptor: Descriptors.Descriptor =
      Proposal.RewardPointUpdate.getDescriptor()

  public override val parser: Parser<Proposal.RewardPointUpdate> =
      Proposal.RewardPointUpdate.parser()

  public override fun convert(obj: Proposal.RewardPointUpdate): RewardPointUpdate =
      RewardPointUpdate(
  	accountAddress = obj.getAccountAddress(),
  	newPoints = obj.getNewPoints(),
  )

  public override fun convert(obj: RewardPointUpdate): Proposal.RewardPointUpdate {
    val builder = Proposal.RewardPointUpdate.newBuilder()
    builder.setAccountAddress(obj.accountAddress)
    builder.setNewPoints(obj.newPoints)
    return builder.build()
  }
}

public object TradingRewardPendingPointsUpdateProposalJvmConverter :
    ProtobufTypeMapper<TradingRewardPendingPointsUpdateProposal, Proposal.TradingRewardPendingPointsUpdateProposal>
    {
  public override val descriptor: Descriptors.Descriptor =
      Proposal.TradingRewardPendingPointsUpdateProposal.getDescriptor()

  public override val parser: Parser<Proposal.TradingRewardPendingPointsUpdateProposal> =
      Proposal.TradingRewardPendingPointsUpdateProposal.parser()

  public override fun convert(obj: Proposal.TradingRewardPendingPointsUpdateProposal):
      TradingRewardPendingPointsUpdateProposal = TradingRewardPendingPointsUpdateProposal(
  	title = obj.getTitle(),
  	description = obj.getDescription(),
  	pendingPoolTimestamp = obj.getPendingPoolTimestamp(),
  	rewardPointUpdates = obj.getRewardPointUpdatesList().map {
      RewardPointUpdateJvmConverter.convert(it) },
  )

  public override fun convert(obj: TradingRewardPendingPointsUpdateProposal):
      Proposal.TradingRewardPendingPointsUpdateProposal {
    val builder = Proposal.TradingRewardPendingPointsUpdateProposal.newBuilder()
    builder.setTitle(obj.title)
    builder.setDescription(obj.description)
    builder.setPendingPoolTimestamp(obj.pendingPoolTimestamp)
    builder.addAllRewardPointUpdates(obj.rewardPointUpdates.map {
        RewardPointUpdateJvmConverter.convert(it) })
    return builder.build()
  }
}

public object FeeDiscountProposalJvmConverter :
    ProtobufTypeMapper<FeeDiscountProposal, Proposal.FeeDiscountProposal> {
  public override val descriptor: Descriptors.Descriptor =
      Proposal.FeeDiscountProposal.getDescriptor()

  public override val parser: Parser<Proposal.FeeDiscountProposal> =
      Proposal.FeeDiscountProposal.parser()

  public override fun convert(obj: Proposal.FeeDiscountProposal): FeeDiscountProposal =
      FeeDiscountProposal(
  	title = obj.getTitle(),
  	description = obj.getDescription(),
  	schedule = FeeDiscountScheduleJvmConverter.convert(obj.getSchedule()),
  )

  public override fun convert(obj: FeeDiscountProposal): Proposal.FeeDiscountProposal {
    val builder = Proposal.FeeDiscountProposal.newBuilder()
    builder.setTitle(obj.title)
    builder.setDescription(obj.description)
    builder.setSchedule(FeeDiscountScheduleJvmConverter.convert(obj.schedule))
    return builder.build()
  }
}

public object BatchCommunityPoolSpendProposalJvmConverter :
    ProtobufTypeMapper<BatchCommunityPoolSpendProposal, Proposal.BatchCommunityPoolSpendProposal> {
  public override val descriptor: Descriptors.Descriptor =
      Proposal.BatchCommunityPoolSpendProposal.getDescriptor()

  public override val parser: Parser<Proposal.BatchCommunityPoolSpendProposal> =
      Proposal.BatchCommunityPoolSpendProposal.parser()

  public override fun convert(obj: Proposal.BatchCommunityPoolSpendProposal):
      BatchCommunityPoolSpendProposal = BatchCommunityPoolSpendProposal(
  	title = obj.getTitle(),
  	description = obj.getDescription(),
  	proposals = obj.getProposalsList().map { CommunityPoolSpendProposalJvmConverter.convert(it) },
  )

  public override fun convert(obj: BatchCommunityPoolSpendProposal):
      Proposal.BatchCommunityPoolSpendProposal {
    val builder = Proposal.BatchCommunityPoolSpendProposal.newBuilder()
    builder.setTitle(obj.title)
    builder.setDescription(obj.description)
    builder.addAllProposals(obj.proposals.map { CommunityPoolSpendProposalJvmConverter.convert(it)
        })
    return builder.build()
  }
}

public object AtomicMarketOrderFeeMultiplierScheduleProposalJvmConverter :
    ProtobufTypeMapper<AtomicMarketOrderFeeMultiplierScheduleProposal, Proposal.AtomicMarketOrderFeeMultiplierScheduleProposal>
    {
  public override val descriptor: Descriptors.Descriptor =
      Proposal.AtomicMarketOrderFeeMultiplierScheduleProposal.getDescriptor()

  public override val parser: Parser<Proposal.AtomicMarketOrderFeeMultiplierScheduleProposal> =
      Proposal.AtomicMarketOrderFeeMultiplierScheduleProposal.parser()

  public override fun convert(obj: Proposal.AtomicMarketOrderFeeMultiplierScheduleProposal):
      AtomicMarketOrderFeeMultiplierScheduleProposal =
      AtomicMarketOrderFeeMultiplierScheduleProposal(
  	title = obj.getTitle(),
  	description = obj.getDescription(),
  	marketFeeMultipliers = obj.getMarketFeeMultipliersList().map {
      MarketFeeMultiplierJvmConverter.convert(it) },
  )

  public override fun convert(obj: AtomicMarketOrderFeeMultiplierScheduleProposal):
      Proposal.AtomicMarketOrderFeeMultiplierScheduleProposal {
    val builder = Proposal.AtomicMarketOrderFeeMultiplierScheduleProposal.newBuilder()
    builder.setTitle(obj.title)
    builder.setDescription(obj.description)
    builder.addAllMarketFeeMultipliers(obj.marketFeeMultipliers.map {
        MarketFeeMultiplierJvmConverter.convert(it) })
    return builder.build()
  }
}
