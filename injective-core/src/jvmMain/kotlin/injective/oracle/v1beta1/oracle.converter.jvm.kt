// Transform from injective/oracle/v1beta1/oracle.proto
@file:GeneratorVersion(version = "0.3.1")

package injective.oracle.v1beta1

import com.google.protobuf.Descriptors
import com.google.protobuf.Parser
import cosmos.base.v1beta1.CoinJvmConverter
import kr.jadekim.protobuf.`annotation`.GeneratorVersion
import kr.jadekim.protobuf.converter.mapper.ProtobufTypeMapper
import kr.jadekim.protobuf.util.asJavaType
import kr.jadekim.protobuf.util.asKotlinType

public object ParamsJvmConverter : ProtobufTypeMapper<Params, Oracle.Params> {
  public override val descriptor: Descriptors.Descriptor = Oracle.Params.getDescriptor()

  public override val parser: Parser<Oracle.Params> = Oracle.Params.parser()

  public override fun convert(obj: Oracle.Params): Params = Params(
  	pythContract = obj.getPythContract(),
  )

  public override fun convert(obj: Params): Oracle.Params {
    val builder = Oracle.Params.newBuilder()
    builder.setPythContract(obj.pythContract)
    return builder.build()
  }
}

public object OracleInfoJvmConverter : ProtobufTypeMapper<OracleInfo, Oracle.OracleInfo> {
  public override val descriptor: Descriptors.Descriptor = Oracle.OracleInfo.getDescriptor()

  public override val parser: Parser<Oracle.OracleInfo> = Oracle.OracleInfo.parser()

  public override fun convert(obj: Oracle.OracleInfo): OracleInfo = OracleInfo(
  	symbol = obj.getSymbol(),
  	oracleType = OracleType.forNumber(obj.getOracleType().number),
  )

  public override fun convert(obj: OracleInfo): Oracle.OracleInfo {
    val builder = Oracle.OracleInfo.newBuilder()
    builder.setSymbol(obj.symbol)
    builder.setOracleType(Oracle.OracleType.forNumber(obj.oracleType.number))
    return builder.build()
  }
}

public object ChainlinkPriceStateJvmConverter :
    ProtobufTypeMapper<ChainlinkPriceState, Oracle.ChainlinkPriceState> {
  public override val descriptor: Descriptors.Descriptor =
      Oracle.ChainlinkPriceState.getDescriptor()

  public override val parser: Parser<Oracle.ChainlinkPriceState> =
      Oracle.ChainlinkPriceState.parser()

  public override fun convert(obj: Oracle.ChainlinkPriceState): ChainlinkPriceState =
      ChainlinkPriceState(
  	feedId = obj.getFeedId(),
  	answer = obj.getAnswer(),
  	timestamp = obj.getTimestamp().asKotlinType,
  	priceState = PriceStateJvmConverter.convert(obj.getPriceState()),
  )

  public override fun convert(obj: ChainlinkPriceState): Oracle.ChainlinkPriceState {
    val builder = Oracle.ChainlinkPriceState.newBuilder()
    builder.setFeedId(obj.feedId)
    builder.setAnswer(obj.answer)
    builder.setTimestamp(obj.timestamp.asJavaType)
    builder.setPriceState(PriceStateJvmConverter.convert(obj.priceState))
    return builder.build()
  }
}

public object BandPriceStateJvmConverter : ProtobufTypeMapper<BandPriceState, Oracle.BandPriceState>
    {
  public override val descriptor: Descriptors.Descriptor = Oracle.BandPriceState.getDescriptor()

  public override val parser: Parser<Oracle.BandPriceState> = Oracle.BandPriceState.parser()

  public override fun convert(obj: Oracle.BandPriceState): BandPriceState = BandPriceState(
  	symbol = obj.getSymbol(),
  	rate = obj.getRate(),
  	resolveTime = obj.getResolveTime().asKotlinType,
  	requestID = obj.getRequestID().asKotlinType,
  	priceState = PriceStateJvmConverter.convert(obj.getPriceState()),
  )

  public override fun convert(obj: BandPriceState): Oracle.BandPriceState {
    val builder = Oracle.BandPriceState.newBuilder()
    builder.setSymbol(obj.symbol)
    builder.setRate(obj.rate)
    builder.setResolveTime(obj.resolveTime.asJavaType)
    builder.setRequestID(obj.requestID.asJavaType)
    builder.setPriceState(PriceStateJvmConverter.convert(obj.priceState))
    return builder.build()
  }
}

public object PriceFeedStateJvmConverter : ProtobufTypeMapper<PriceFeedState, Oracle.PriceFeedState>
    {
  public override val descriptor: Descriptors.Descriptor = Oracle.PriceFeedState.getDescriptor()

  public override val parser: Parser<Oracle.PriceFeedState> = Oracle.PriceFeedState.parser()

  public override fun convert(obj: Oracle.PriceFeedState): PriceFeedState = PriceFeedState(
  	base = obj.getBase(),
  	quote = obj.getQuote(),
  	priceState = PriceStateJvmConverter.convert(obj.getPriceState()),
  	relayers = obj.getRelayersList().map { it },
  )

  public override fun convert(obj: PriceFeedState): Oracle.PriceFeedState {
    val builder = Oracle.PriceFeedState.newBuilder()
    builder.setBase(obj.base)
    builder.setQuote(obj.quote)
    builder.setPriceState(PriceStateJvmConverter.convert(obj.priceState))
    builder.addAllRelayers(obj.relayers.map { it })
    return builder.build()
  }
}

public object ProviderInfoJvmConverter : ProtobufTypeMapper<ProviderInfo, Oracle.ProviderInfo> {
  public override val descriptor: Descriptors.Descriptor = Oracle.ProviderInfo.getDescriptor()

  public override val parser: Parser<Oracle.ProviderInfo> = Oracle.ProviderInfo.parser()

  public override fun convert(obj: Oracle.ProviderInfo): ProviderInfo = ProviderInfo(
  	provider = obj.getProvider(),
  	relayers = obj.getRelayersList().map { it },
  )

  public override fun convert(obj: ProviderInfo): Oracle.ProviderInfo {
    val builder = Oracle.ProviderInfo.newBuilder()
    builder.setProvider(obj.provider)
    builder.addAllRelayers(obj.relayers.map { it })
    return builder.build()
  }
}

public object ProviderStateJvmConverter : ProtobufTypeMapper<ProviderState, Oracle.ProviderState> {
  public override val descriptor: Descriptors.Descriptor = Oracle.ProviderState.getDescriptor()

  public override val parser: Parser<Oracle.ProviderState> = Oracle.ProviderState.parser()

  public override fun convert(obj: Oracle.ProviderState): ProviderState = ProviderState(
  	providerInfo = ProviderInfoJvmConverter.convert(obj.getProviderInfo()),
  	providerPriceStates = obj.getProviderPriceStatesList().map {
      ProviderPriceStateJvmConverter.convert(it) },
  )

  public override fun convert(obj: ProviderState): Oracle.ProviderState {
    val builder = Oracle.ProviderState.newBuilder()
    builder.setProviderInfo(ProviderInfoJvmConverter.convert(obj.providerInfo))
    builder.addAllProviderPriceStates(obj.providerPriceStates.map {
        ProviderPriceStateJvmConverter.convert(it) })
    return builder.build()
  }
}

public object ProviderPriceStateJvmConverter :
    ProtobufTypeMapper<ProviderPriceState, Oracle.ProviderPriceState> {
  public override val descriptor: Descriptors.Descriptor = Oracle.ProviderPriceState.getDescriptor()

  public override val parser: Parser<Oracle.ProviderPriceState> = Oracle.ProviderPriceState.parser()

  public override fun convert(obj: Oracle.ProviderPriceState): ProviderPriceState =
      ProviderPriceState(
  	symbol = obj.getSymbol(),
  	state = PriceStateJvmConverter.convert(obj.getState()),
  )

  public override fun convert(obj: ProviderPriceState): Oracle.ProviderPriceState {
    val builder = Oracle.ProviderPriceState.newBuilder()
    builder.setSymbol(obj.symbol)
    builder.setState(PriceStateJvmConverter.convert(obj.state))
    return builder.build()
  }
}

public object PriceFeedInfoJvmConverter : ProtobufTypeMapper<PriceFeedInfo, Oracle.PriceFeedInfo> {
  public override val descriptor: Descriptors.Descriptor = Oracle.PriceFeedInfo.getDescriptor()

  public override val parser: Parser<Oracle.PriceFeedInfo> = Oracle.PriceFeedInfo.parser()

  public override fun convert(obj: Oracle.PriceFeedInfo): PriceFeedInfo = PriceFeedInfo(
  	base = obj.getBase(),
  	quote = obj.getQuote(),
  )

  public override fun convert(obj: PriceFeedInfo): Oracle.PriceFeedInfo {
    val builder = Oracle.PriceFeedInfo.newBuilder()
    builder.setBase(obj.base)
    builder.setQuote(obj.quote)
    return builder.build()
  }
}

public object PriceFeedPriceJvmConverter : ProtobufTypeMapper<PriceFeedPrice, Oracle.PriceFeedPrice>
    {
  public override val descriptor: Descriptors.Descriptor = Oracle.PriceFeedPrice.getDescriptor()

  public override val parser: Parser<Oracle.PriceFeedPrice> = Oracle.PriceFeedPrice.parser()

  public override fun convert(obj: Oracle.PriceFeedPrice): PriceFeedPrice = PriceFeedPrice(
  	price = obj.getPrice(),
  )

  public override fun convert(obj: PriceFeedPrice): Oracle.PriceFeedPrice {
    val builder = Oracle.PriceFeedPrice.newBuilder()
    builder.setPrice(obj.price)
    return builder.build()
  }
}

public object CoinbasePriceStateJvmConverter :
    ProtobufTypeMapper<CoinbasePriceState, Oracle.CoinbasePriceState> {
  public override val descriptor: Descriptors.Descriptor = Oracle.CoinbasePriceState.getDescriptor()

  public override val parser: Parser<Oracle.CoinbasePriceState> = Oracle.CoinbasePriceState.parser()

  public override fun convert(obj: Oracle.CoinbasePriceState): CoinbasePriceState =
      CoinbasePriceState(
  	kind = obj.getKind(),
  	timestamp = obj.getTimestamp().asKotlinType,
  	key = obj.getKey(),
  	`value` = obj.getValue().asKotlinType,
  	priceState = PriceStateJvmConverter.convert(obj.getPriceState()),
  )

  public override fun convert(obj: CoinbasePriceState): Oracle.CoinbasePriceState {
    val builder = Oracle.CoinbasePriceState.newBuilder()
    builder.setKind(obj.kind)
    builder.setTimestamp(obj.timestamp.asJavaType)
    builder.setKey(obj.key)
    builder.setValue(obj.`value`.asJavaType)
    builder.setPriceState(PriceStateJvmConverter.convert(obj.priceState))
    return builder.build()
  }
}

public object PriceStateJvmConverter : ProtobufTypeMapper<PriceState, Oracle.PriceState> {
  public override val descriptor: Descriptors.Descriptor = Oracle.PriceState.getDescriptor()

  public override val parser: Parser<Oracle.PriceState> = Oracle.PriceState.parser()

  public override fun convert(obj: Oracle.PriceState): PriceState = PriceState(
  	price = obj.getPrice(),
  	cumulativePrice = obj.getCumulativePrice(),
  	timestamp = obj.getTimestamp(),
  )

  public override fun convert(obj: PriceState): Oracle.PriceState {
    val builder = Oracle.PriceState.newBuilder()
    builder.setPrice(obj.price)
    builder.setCumulativePrice(obj.cumulativePrice)
    builder.setTimestamp(obj.timestamp)
    return builder.build()
  }
}

public object PythPriceStateJvmConverter : ProtobufTypeMapper<PythPriceState, Oracle.PythPriceState>
    {
  public override val descriptor: Descriptors.Descriptor = Oracle.PythPriceState.getDescriptor()

  public override val parser: Parser<Oracle.PythPriceState> = Oracle.PythPriceState.parser()

  public override fun convert(obj: Oracle.PythPriceState): PythPriceState = PythPriceState(
  	priceId = obj.getPriceId(),
  	emaPrice = obj.getEmaPrice(),
  	emaConf = obj.getEmaConf(),
  	conf = obj.getConf(),
  	publishTime = obj.getPublishTime().asKotlinType,
  	priceState = PriceStateJvmConverter.convert(obj.getPriceState()),
  )

  public override fun convert(obj: PythPriceState): Oracle.PythPriceState {
    val builder = Oracle.PythPriceState.newBuilder()
    builder.setPriceId(obj.priceId)
    builder.setEmaPrice(obj.emaPrice)
    builder.setEmaConf(obj.emaConf)
    builder.setConf(obj.conf)
    builder.setPublishTime(obj.publishTime.asJavaType)
    builder.setPriceState(PriceStateJvmConverter.convert(obj.priceState))
    return builder.build()
  }
}

public object BandOracleRequestJvmConverter :
    ProtobufTypeMapper<BandOracleRequest, Oracle.BandOracleRequest> {
  public override val descriptor: Descriptors.Descriptor = Oracle.BandOracleRequest.getDescriptor()

  public override val parser: Parser<Oracle.BandOracleRequest> = Oracle.BandOracleRequest.parser()

  public override fun convert(obj: Oracle.BandOracleRequest): BandOracleRequest = BandOracleRequest(
  	requestId = obj.getRequestId().asKotlinType,
  	oracleScriptId = obj.getOracleScriptId(),
  	symbols = obj.getSymbolsList().map { it },
  	askCount = obj.getAskCount().asKotlinType,
  	minCount = obj.getMinCount().asKotlinType,
  	feeLimit = obj.getFeeLimitList().map { CoinJvmConverter.convert(it) },
  	prepareGas = obj.getPrepareGas().asKotlinType,
  	executeGas = obj.getExecuteGas().asKotlinType,
  	minSourceCount = obj.getMinSourceCount().asKotlinType,
  )

  public override fun convert(obj: BandOracleRequest): Oracle.BandOracleRequest {
    val builder = Oracle.BandOracleRequest.newBuilder()
    builder.setRequestId(obj.requestId.asJavaType)
    builder.setOracleScriptId(obj.oracleScriptId)
    builder.addAllSymbols(obj.symbols.map { it })
    builder.setAskCount(obj.askCount.asJavaType)
    builder.setMinCount(obj.minCount.asJavaType)
    builder.addAllFeeLimit(obj.feeLimit.map { CoinJvmConverter.convert(it) })
    builder.setPrepareGas(obj.prepareGas.asJavaType)
    builder.setExecuteGas(obj.executeGas.asJavaType)
    builder.setMinSourceCount(obj.minSourceCount.asJavaType)
    return builder.build()
  }
}

public object BandIBCParamsJvmConverter : ProtobufTypeMapper<BandIBCParams, Oracle.BandIBCParams> {
  public override val descriptor: Descriptors.Descriptor = Oracle.BandIBCParams.getDescriptor()

  public override val parser: Parser<Oracle.BandIBCParams> = Oracle.BandIBCParams.parser()

  public override fun convert(obj: Oracle.BandIBCParams): BandIBCParams = BandIBCParams(
  	bandIbcEnabled = obj.getBandIbcEnabled(),
  	ibcRequestInterval = obj.getIbcRequestInterval(),
  	ibcSourceChannel = obj.getIbcSourceChannel(),
  	ibcVersion = obj.getIbcVersion(),
  	ibcPortId = obj.getIbcPortId(),
  	legacyOracleIds = obj.getLegacyOracleIdsList().map { it },
  )

  public override fun convert(obj: BandIBCParams): Oracle.BandIBCParams {
    val builder = Oracle.BandIBCParams.newBuilder()
    builder.setBandIbcEnabled(obj.bandIbcEnabled)
    builder.setIbcRequestInterval(obj.ibcRequestInterval)
    builder.setIbcSourceChannel(obj.ibcSourceChannel)
    builder.setIbcVersion(obj.ibcVersion)
    builder.setIbcPortId(obj.ibcPortId)
    builder.addAllLegacyOracleIds(obj.legacyOracleIds.map { it })
    return builder.build()
  }
}

public object SymbolPriceTimestampJvmConverter :
    ProtobufTypeMapper<SymbolPriceTimestamp, Oracle.SymbolPriceTimestamp> {
  public override val descriptor: Descriptors.Descriptor =
      Oracle.SymbolPriceTimestamp.getDescriptor()

  public override val parser: Parser<Oracle.SymbolPriceTimestamp> =
      Oracle.SymbolPriceTimestamp.parser()

  public override fun convert(obj: Oracle.SymbolPriceTimestamp): SymbolPriceTimestamp =
      SymbolPriceTimestamp(
  	oracle = OracleType.forNumber(obj.getOracle().number),
  	symbolId = obj.getSymbolId(),
  	timestamp = obj.getTimestamp(),
  )

  public override fun convert(obj: SymbolPriceTimestamp): Oracle.SymbolPriceTimestamp {
    val builder = Oracle.SymbolPriceTimestamp.newBuilder()
    builder.setOracle(Oracle.OracleType.forNumber(obj.oracle.number))
    builder.setSymbolId(obj.symbolId)
    builder.setTimestamp(obj.timestamp)
    return builder.build()
  }
}

public object LastPriceTimestampsJvmConverter :
    ProtobufTypeMapper<LastPriceTimestamps, Oracle.LastPriceTimestamps> {
  public override val descriptor: Descriptors.Descriptor =
      Oracle.LastPriceTimestamps.getDescriptor()

  public override val parser: Parser<Oracle.LastPriceTimestamps> =
      Oracle.LastPriceTimestamps.parser()

  public override fun convert(obj: Oracle.LastPriceTimestamps): LastPriceTimestamps =
      LastPriceTimestamps(
  	lastPriceTimestamps = obj.getLastPriceTimestampsList().map {
      SymbolPriceTimestampJvmConverter.convert(it) },
  )

  public override fun convert(obj: LastPriceTimestamps): Oracle.LastPriceTimestamps {
    val builder = Oracle.LastPriceTimestamps.newBuilder()
    builder.addAllLastPriceTimestamps(obj.lastPriceTimestamps.map {
        SymbolPriceTimestampJvmConverter.convert(it) })
    return builder.build()
  }
}

public object PriceRecordsJvmConverter : ProtobufTypeMapper<PriceRecords, Oracle.PriceRecords> {
  public override val descriptor: Descriptors.Descriptor = Oracle.PriceRecords.getDescriptor()

  public override val parser: Parser<Oracle.PriceRecords> = Oracle.PriceRecords.parser()

  public override fun convert(obj: Oracle.PriceRecords): PriceRecords = PriceRecords(
  	oracle = OracleType.forNumber(obj.getOracle().number),
  	symbolId = obj.getSymbolId(),
  	latestPriceRecords = obj.getLatestPriceRecordsList().map { PriceRecordJvmConverter.convert(it) },
  )

  public override fun convert(obj: PriceRecords): Oracle.PriceRecords {
    val builder = Oracle.PriceRecords.newBuilder()
    builder.setOracle(Oracle.OracleType.forNumber(obj.oracle.number))
    builder.setSymbolId(obj.symbolId)
    builder.addAllLatestPriceRecords(obj.latestPriceRecords.map {
        PriceRecordJvmConverter.convert(it) })
    return builder.build()
  }
}

public object PriceRecordJvmConverter : ProtobufTypeMapper<PriceRecord, Oracle.PriceRecord> {
  public override val descriptor: Descriptors.Descriptor = Oracle.PriceRecord.getDescriptor()

  public override val parser: Parser<Oracle.PriceRecord> = Oracle.PriceRecord.parser()

  public override fun convert(obj: Oracle.PriceRecord): PriceRecord = PriceRecord(
  	timestamp = obj.getTimestamp(),
  	price = obj.getPrice(),
  )

  public override fun convert(obj: PriceRecord): Oracle.PriceRecord {
    val builder = Oracle.PriceRecord.newBuilder()
    builder.setTimestamp(obj.timestamp)
    builder.setPrice(obj.price)
    return builder.build()
  }
}

public object MetadataStatisticsJvmConverter :
    ProtobufTypeMapper<MetadataStatistics, Oracle.MetadataStatistics> {
  public override val descriptor: Descriptors.Descriptor = Oracle.MetadataStatistics.getDescriptor()

  public override val parser: Parser<Oracle.MetadataStatistics> = Oracle.MetadataStatistics.parser()

  public override fun convert(obj: Oracle.MetadataStatistics): MetadataStatistics =
      MetadataStatistics(
  	groupCount = obj.getGroupCount().asKotlinType,
  	recordsSampleSize = obj.getRecordsSampleSize().asKotlinType,
  	mean = obj.getMean(),
  	twap = obj.getTwap(),
  	firstTimestamp = obj.getFirstTimestamp(),
  	lastTimestamp = obj.getLastTimestamp(),
  	minPrice = obj.getMinPrice(),
  	maxPrice = obj.getMaxPrice(),
  	medianPrice = obj.getMedianPrice(),
  )

  public override fun convert(obj: MetadataStatistics): Oracle.MetadataStatistics {
    val builder = Oracle.MetadataStatistics.newBuilder()
    builder.setGroupCount(obj.groupCount.asJavaType)
    builder.setRecordsSampleSize(obj.recordsSampleSize.asJavaType)
    builder.setMean(obj.mean)
    builder.setTwap(obj.twap)
    builder.setFirstTimestamp(obj.firstTimestamp)
    builder.setLastTimestamp(obj.lastTimestamp)
    builder.setMinPrice(obj.minPrice)
    builder.setMaxPrice(obj.maxPrice)
    builder.setMedianPrice(obj.medianPrice)
    return builder.build()
  }
}

public object PriceAttestationJvmConverter :
    ProtobufTypeMapper<PriceAttestation, Oracle.PriceAttestation> {
  public override val descriptor: Descriptors.Descriptor = Oracle.PriceAttestation.getDescriptor()

  public override val parser: Parser<Oracle.PriceAttestation> = Oracle.PriceAttestation.parser()

  public override fun convert(obj: Oracle.PriceAttestation): PriceAttestation = PriceAttestation(
  	priceId = obj.getPriceId(),
  	price = obj.getPrice(),
  	conf = obj.getConf().asKotlinType,
  	expo = obj.getExpo(),
  	emaPrice = obj.getEmaPrice(),
  	emaConf = obj.getEmaConf().asKotlinType,
  	emaExpo = obj.getEmaExpo(),
  	publishTime = obj.getPublishTime(),
  )

  public override fun convert(obj: PriceAttestation): Oracle.PriceAttestation {
    val builder = Oracle.PriceAttestation.newBuilder()
    builder.setPriceId(obj.priceId)
    builder.setPrice(obj.price)
    builder.setConf(obj.conf.asJavaType)
    builder.setExpo(obj.expo)
    builder.setEmaPrice(obj.emaPrice)
    builder.setEmaConf(obj.emaConf.asJavaType)
    builder.setEmaExpo(obj.emaExpo)
    builder.setPublishTime(obj.publishTime)
    return builder.build()
  }
}
