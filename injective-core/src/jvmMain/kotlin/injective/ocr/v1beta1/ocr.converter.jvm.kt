// Transform from injective/ocr/v1beta1/ocr.proto
@file:GeneratorVersion(version = "0.3.1")

package injective.ocr.v1beta1

import com.google.protobuf.ByteString
import com.google.protobuf.Descriptors
import com.google.protobuf.Parser
import cosmos.base.v1beta1.CoinJvmConverter
import google.protobuf.TimestampJvmConverter
import kr.jadekim.protobuf.`annotation`.GeneratorVersion
import kr.jadekim.protobuf.converter.mapper.ProtobufTypeMapper
import kr.jadekim.protobuf.util.asJavaType
import kr.jadekim.protobuf.util.asKotlinType

public object ParamsJvmConverter : ProtobufTypeMapper<Params, Ocr.Params> {
  public override val descriptor: Descriptors.Descriptor = Ocr.Params.getDescriptor()

  public override val parser: Parser<Ocr.Params> = Ocr.Params.parser()

  public override fun convert(obj: Ocr.Params): Params = Params(
  	linkDenom = obj.getLinkDenom(),
  	payoutBlockInterval = obj.getPayoutBlockInterval().asKotlinType,
  	moduleAdmin = obj.getModuleAdmin(),
  )

  public override fun convert(obj: Params): Ocr.Params {
    val builder = Ocr.Params.newBuilder()
    builder.setLinkDenom(obj.linkDenom)
    builder.setPayoutBlockInterval(obj.payoutBlockInterval.asJavaType)
    builder.setModuleAdmin(obj.moduleAdmin)
    return builder.build()
  }
}

public object FeedConfigJvmConverter : ProtobufTypeMapper<FeedConfig, Ocr.FeedConfig> {
  public override val descriptor: Descriptors.Descriptor = Ocr.FeedConfig.getDescriptor()

  public override val parser: Parser<Ocr.FeedConfig> = Ocr.FeedConfig.parser()

  public override fun convert(obj: Ocr.FeedConfig): FeedConfig = FeedConfig(
  	signers = obj.getSignersList().map { it },
  	transmitters = obj.getTransmittersList().map { it },
  	f = obj.getF().asKotlinType,
  	onchainConfig = obj.getOnchainConfig().toByteArray(),
  	offchainConfigVersion = obj.getOffchainConfigVersion().asKotlinType,
  	offchainConfig = obj.getOffchainConfig().toByteArray(),
  	moduleParams = ModuleParamsJvmConverter.convert(obj.getModuleParams()),
  )

  public override fun convert(obj: FeedConfig): Ocr.FeedConfig {
    val builder = Ocr.FeedConfig.newBuilder()
    builder.addAllSigners(obj.signers.map { it })
    builder.addAllTransmitters(obj.transmitters.map { it })
    builder.setF(obj.f.asJavaType)
    builder.setOnchainConfig(ByteString.copyFrom(obj.onchainConfig))
    builder.setOffchainConfigVersion(obj.offchainConfigVersion.asJavaType)
    builder.setOffchainConfig(ByteString.copyFrom(obj.offchainConfig))
    builder.setModuleParams(ModuleParamsJvmConverter.convert(obj.moduleParams))
    return builder.build()
  }
}

public object FeedConfigInfoJvmConverter : ProtobufTypeMapper<FeedConfigInfo, Ocr.FeedConfigInfo> {
  public override val descriptor: Descriptors.Descriptor = Ocr.FeedConfigInfo.getDescriptor()

  public override val parser: Parser<Ocr.FeedConfigInfo> = Ocr.FeedConfigInfo.parser()

  public override fun convert(obj: Ocr.FeedConfigInfo): FeedConfigInfo = FeedConfigInfo(
  	latestConfigDigest = obj.getLatestConfigDigest().toByteArray(),
  	f = obj.getF().asKotlinType,
  	n = obj.getN().asKotlinType,
  	configCount = obj.getConfigCount().asKotlinType,
  	latestConfigBlockNumber = obj.getLatestConfigBlockNumber(),
  )

  public override fun convert(obj: FeedConfigInfo): Ocr.FeedConfigInfo {
    val builder = Ocr.FeedConfigInfo.newBuilder()
    builder.setLatestConfigDigest(ByteString.copyFrom(obj.latestConfigDigest))
    builder.setF(obj.f.asJavaType)
    builder.setN(obj.n.asJavaType)
    builder.setConfigCount(obj.configCount.asJavaType)
    builder.setLatestConfigBlockNumber(obj.latestConfigBlockNumber)
    return builder.build()
  }
}

public object ModuleParamsJvmConverter : ProtobufTypeMapper<ModuleParams, Ocr.ModuleParams> {
  public override val descriptor: Descriptors.Descriptor = Ocr.ModuleParams.getDescriptor()

  public override val parser: Parser<Ocr.ModuleParams> = Ocr.ModuleParams.parser()

  public override fun convert(obj: Ocr.ModuleParams): ModuleParams = ModuleParams(
  	feedId = obj.getFeedId(),
  	minAnswer = obj.getMinAnswer(),
  	maxAnswer = obj.getMaxAnswer(),
  	linkPerObservation = obj.getLinkPerObservation(),
  	linkPerTransmission = obj.getLinkPerTransmission(),
  	linkDenom = obj.getLinkDenom(),
  	uniqueReports = obj.getUniqueReports(),
  	description = obj.getDescription(),
  	feedAdmin = obj.getFeedAdmin(),
  	billingAdmin = obj.getBillingAdmin(),
  )

  public override fun convert(obj: ModuleParams): Ocr.ModuleParams {
    val builder = Ocr.ModuleParams.newBuilder()
    builder.setFeedId(obj.feedId)
    builder.setMinAnswer(obj.minAnswer)
    builder.setMaxAnswer(obj.maxAnswer)
    builder.setLinkPerObservation(obj.linkPerObservation)
    builder.setLinkPerTransmission(obj.linkPerTransmission)
    builder.setLinkDenom(obj.linkDenom)
    builder.setUniqueReports(obj.uniqueReports)
    builder.setDescription(obj.description)
    builder.setFeedAdmin(obj.feedAdmin)
    builder.setBillingAdmin(obj.billingAdmin)
    return builder.build()
  }
}

public object ContractConfigJvmConverter : ProtobufTypeMapper<ContractConfig, Ocr.ContractConfig> {
  public override val descriptor: Descriptors.Descriptor = Ocr.ContractConfig.getDescriptor()

  public override val parser: Parser<Ocr.ContractConfig> = Ocr.ContractConfig.parser()

  public override fun convert(obj: Ocr.ContractConfig): ContractConfig = ContractConfig(
  	configCount = obj.getConfigCount().asKotlinType,
  	signers = obj.getSignersList().map { it },
  	transmitters = obj.getTransmittersList().map { it },
  	f = obj.getF().asKotlinType,
  	onchainConfig = obj.getOnchainConfig().toByteArray(),
  	offchainConfigVersion = obj.getOffchainConfigVersion().asKotlinType,
  	offchainConfig = obj.getOffchainConfig().toByteArray(),
  )

  public override fun convert(obj: ContractConfig): Ocr.ContractConfig {
    val builder = Ocr.ContractConfig.newBuilder()
    builder.setConfigCount(obj.configCount.asJavaType)
    builder.addAllSigners(obj.signers.map { it })
    builder.addAllTransmitters(obj.transmitters.map { it })
    builder.setF(obj.f.asJavaType)
    builder.setOnchainConfig(ByteString.copyFrom(obj.onchainConfig))
    builder.setOffchainConfigVersion(obj.offchainConfigVersion.asJavaType)
    builder.setOffchainConfig(ByteString.copyFrom(obj.offchainConfig))
    return builder.build()
  }
}

public object SetConfigProposalJvmConverter :
    ProtobufTypeMapper<SetConfigProposal, Ocr.SetConfigProposal> {
  public override val descriptor: Descriptors.Descriptor = Ocr.SetConfigProposal.getDescriptor()

  public override val parser: Parser<Ocr.SetConfigProposal> = Ocr.SetConfigProposal.parser()

  public override fun convert(obj: Ocr.SetConfigProposal): SetConfigProposal = SetConfigProposal(
  	title = obj.getTitle(),
  	description = obj.getDescription(),
  	config = FeedConfigJvmConverter.convert(obj.getConfig()),
  )

  public override fun convert(obj: SetConfigProposal): Ocr.SetConfigProposal {
    val builder = Ocr.SetConfigProposal.newBuilder()
    builder.setTitle(obj.title)
    builder.setDescription(obj.description)
    builder.setConfig(FeedConfigJvmConverter.convert(obj.config))
    return builder.build()
  }
}

public object FeedPropertiesJvmConverter : ProtobufTypeMapper<FeedProperties, Ocr.FeedProperties> {
  public override val descriptor: Descriptors.Descriptor = Ocr.FeedProperties.getDescriptor()

  public override val parser: Parser<Ocr.FeedProperties> = Ocr.FeedProperties.parser()

  public override fun convert(obj: Ocr.FeedProperties): FeedProperties = FeedProperties(
  	feedId = obj.getFeedId(),
  	f = obj.getF().asKotlinType,
  	onchainConfig = obj.getOnchainConfig().toByteArray(),
  	offchainConfigVersion = obj.getOffchainConfigVersion().asKotlinType,
  	offchainConfig = obj.getOffchainConfig().toByteArray(),
  	minAnswer = obj.getMinAnswer(),
  	maxAnswer = obj.getMaxAnswer(),
  	linkPerObservation = obj.getLinkPerObservation(),
  	linkPerTransmission = obj.getLinkPerTransmission(),
  	uniqueReports = obj.getUniqueReports(),
  	description = obj.getDescription(),
  )

  public override fun convert(obj: FeedProperties): Ocr.FeedProperties {
    val builder = Ocr.FeedProperties.newBuilder()
    builder.setFeedId(obj.feedId)
    builder.setF(obj.f.asJavaType)
    builder.setOnchainConfig(ByteString.copyFrom(obj.onchainConfig))
    builder.setOffchainConfigVersion(obj.offchainConfigVersion.asJavaType)
    builder.setOffchainConfig(ByteString.copyFrom(obj.offchainConfig))
    builder.setMinAnswer(obj.minAnswer)
    builder.setMaxAnswer(obj.maxAnswer)
    builder.setLinkPerObservation(obj.linkPerObservation)
    builder.setLinkPerTransmission(obj.linkPerTransmission)
    builder.setUniqueReports(obj.uniqueReports)
    builder.setDescription(obj.description)
    return builder.build()
  }
}

public object SetBatchConfigProposalJvmConverter :
    ProtobufTypeMapper<SetBatchConfigProposal, Ocr.SetBatchConfigProposal> {
  public override val descriptor: Descriptors.Descriptor =
      Ocr.SetBatchConfigProposal.getDescriptor()

  public override val parser: Parser<Ocr.SetBatchConfigProposal> =
      Ocr.SetBatchConfigProposal.parser()

  public override fun convert(obj: Ocr.SetBatchConfigProposal): SetBatchConfigProposal =
      SetBatchConfigProposal(
  	title = obj.getTitle(),
  	description = obj.getDescription(),
  	signers = obj.getSignersList().map { it },
  	transmitters = obj.getTransmittersList().map { it },
  	linkDenom = obj.getLinkDenom(),
  	feedProperties = obj.getFeedPropertiesList().map { FeedPropertiesJvmConverter.convert(it) },
  )

  public override fun convert(obj: SetBatchConfigProposal): Ocr.SetBatchConfigProposal {
    val builder = Ocr.SetBatchConfigProposal.newBuilder()
    builder.setTitle(obj.title)
    builder.setDescription(obj.description)
    builder.addAllSigners(obj.signers.map { it })
    builder.addAllTransmitters(obj.transmitters.map { it })
    builder.setLinkDenom(obj.linkDenom)
    builder.addAllFeedProperties(obj.feedProperties.map { FeedPropertiesJvmConverter.convert(it) })
    return builder.build()
  }
}

public object OracleObservationsCountsJvmConverter :
    ProtobufTypeMapper<OracleObservationsCounts, Ocr.OracleObservationsCounts> {
  public override val descriptor: Descriptors.Descriptor =
      Ocr.OracleObservationsCounts.getDescriptor()

  public override val parser: Parser<Ocr.OracleObservationsCounts> =
      Ocr.OracleObservationsCounts.parser()

  public override fun convert(obj: Ocr.OracleObservationsCounts): OracleObservationsCounts =
      OracleObservationsCounts(
  	counts = obj.getCountsList().map { it.asKotlinType },
  )

  public override fun convert(obj: OracleObservationsCounts): Ocr.OracleObservationsCounts {
    val builder = Ocr.OracleObservationsCounts.newBuilder()
    builder.addAllCounts(obj.counts.map { it.asJavaType })
    return builder.build()
  }
}

public object GasReimbursementsJvmConverter :
    ProtobufTypeMapper<GasReimbursements, Ocr.GasReimbursements> {
  public override val descriptor: Descriptors.Descriptor = Ocr.GasReimbursements.getDescriptor()

  public override val parser: Parser<Ocr.GasReimbursements> = Ocr.GasReimbursements.parser()

  public override fun convert(obj: Ocr.GasReimbursements): GasReimbursements = GasReimbursements(
  	reimbursements = obj.getReimbursementsList().map { CoinJvmConverter.convert(it) },
  )

  public override fun convert(obj: GasReimbursements): Ocr.GasReimbursements {
    val builder = Ocr.GasReimbursements.newBuilder()
    builder.addAllReimbursements(obj.reimbursements.map { CoinJvmConverter.convert(it) })
    return builder.build()
  }
}

public object PayeeJvmConverter : ProtobufTypeMapper<Payee, Ocr.Payee> {
  public override val descriptor: Descriptors.Descriptor = Ocr.Payee.getDescriptor()

  public override val parser: Parser<Ocr.Payee> = Ocr.Payee.parser()

  public override fun convert(obj: Ocr.Payee): Payee = Payee(
  	transmitterAddr = obj.getTransmitterAddr(),
  	paymentAddr = obj.getPaymentAddr(),
  )

  public override fun convert(obj: Payee): Ocr.Payee {
    val builder = Ocr.Payee.newBuilder()
    builder.setTransmitterAddr(obj.transmitterAddr)
    builder.setPaymentAddr(obj.paymentAddr)
    return builder.build()
  }
}

public object TransmissionJvmConverter : ProtobufTypeMapper<Transmission, Ocr.Transmission> {
  public override val descriptor: Descriptors.Descriptor = Ocr.Transmission.getDescriptor()

  public override val parser: Parser<Ocr.Transmission> = Ocr.Transmission.parser()

  public override fun convert(obj: Ocr.Transmission): Transmission = Transmission(
  	answer = obj.getAnswer(),
  	observationsTimestamp = obj.getObservationsTimestamp(),
  	transmissionTimestamp = obj.getTransmissionTimestamp(),
  )

  public override fun convert(obj: Transmission): Ocr.Transmission {
    val builder = Ocr.Transmission.newBuilder()
    builder.setAnswer(obj.answer)
    builder.setObservationsTimestamp(obj.observationsTimestamp)
    builder.setTransmissionTimestamp(obj.transmissionTimestamp)
    return builder.build()
  }
}

public object EpochAndRoundJvmConverter : ProtobufTypeMapper<EpochAndRound, Ocr.EpochAndRound> {
  public override val descriptor: Descriptors.Descriptor = Ocr.EpochAndRound.getDescriptor()

  public override val parser: Parser<Ocr.EpochAndRound> = Ocr.EpochAndRound.parser()

  public override fun convert(obj: Ocr.EpochAndRound): EpochAndRound = EpochAndRound(
  	epoch = obj.getEpoch().asKotlinType,
  	round = obj.getRound().asKotlinType,
  )

  public override fun convert(obj: EpochAndRound): Ocr.EpochAndRound {
    val builder = Ocr.EpochAndRound.newBuilder()
    builder.setEpoch(obj.epoch.asJavaType)
    builder.setRound(obj.round.asJavaType)
    return builder.build()
  }
}

public object ReportJvmConverter : ProtobufTypeMapper<Report, Ocr.Report> {
  public override val descriptor: Descriptors.Descriptor = Ocr.Report.getDescriptor()

  public override val parser: Parser<Ocr.Report> = Ocr.Report.parser()

  public override fun convert(obj: Ocr.Report): Report = Report(
  	observationsTimestamp = obj.getObservationsTimestamp(),
  	observers = obj.getObservers().toByteArray(),
  	observations = obj.getObservationsList().map { it },
  )

  public override fun convert(obj: Report): Ocr.Report {
    val builder = Ocr.Report.newBuilder()
    builder.setObservationsTimestamp(obj.observationsTimestamp)
    builder.setObservers(ByteString.copyFrom(obj.observers))
    builder.addAllObservations(obj.observations.map { it })
    return builder.build()
  }
}

public object ReportToSignJvmConverter : ProtobufTypeMapper<ReportToSign, Ocr.ReportToSign> {
  public override val descriptor: Descriptors.Descriptor = Ocr.ReportToSign.getDescriptor()

  public override val parser: Parser<Ocr.ReportToSign> = Ocr.ReportToSign.parser()

  public override fun convert(obj: Ocr.ReportToSign): ReportToSign = ReportToSign(
  	configDigest = obj.getConfigDigest().toByteArray(),
  	epoch = obj.getEpoch().asKotlinType,
  	round = obj.getRound().asKotlinType,
  	extraHash = obj.getExtraHash().toByteArray(),
  	report = obj.getReport().toByteArray(),
  )

  public override fun convert(obj: ReportToSign): Ocr.ReportToSign {
    val builder = Ocr.ReportToSign.newBuilder()
    builder.setConfigDigest(ByteString.copyFrom(obj.configDigest))
    builder.setEpoch(obj.epoch.asJavaType)
    builder.setRound(obj.round.asJavaType)
    builder.setExtraHash(ByteString.copyFrom(obj.extraHash))
    builder.setReport(ByteString.copyFrom(obj.report))
    return builder.build()
  }
}

public object EventOraclePaidJvmConverter : ProtobufTypeMapper<EventOraclePaid, Ocr.EventOraclePaid>
    {
  public override val descriptor: Descriptors.Descriptor = Ocr.EventOraclePaid.getDescriptor()

  public override val parser: Parser<Ocr.EventOraclePaid> = Ocr.EventOraclePaid.parser()

  public override fun convert(obj: Ocr.EventOraclePaid): EventOraclePaid = EventOraclePaid(
  	transmitterAddr = obj.getTransmitterAddr(),
  	payeeAddr = obj.getPayeeAddr(),
  	amount = CoinJvmConverter.convert(obj.getAmount()),
  )

  public override fun convert(obj: EventOraclePaid): Ocr.EventOraclePaid {
    val builder = Ocr.EventOraclePaid.newBuilder()
    builder.setTransmitterAddr(obj.transmitterAddr)
    builder.setPayeeAddr(obj.payeeAddr)
    builder.setAmount(CoinJvmConverter.convert(obj.amount))
    return builder.build()
  }
}

public object EventAnswerUpdatedJvmConverter :
    ProtobufTypeMapper<EventAnswerUpdated, Ocr.EventAnswerUpdated> {
  public override val descriptor: Descriptors.Descriptor = Ocr.EventAnswerUpdated.getDescriptor()

  public override val parser: Parser<Ocr.EventAnswerUpdated> = Ocr.EventAnswerUpdated.parser()

  public override fun convert(obj: Ocr.EventAnswerUpdated): EventAnswerUpdated = EventAnswerUpdated(
  	current = obj.getCurrent(),
  	roundId = obj.getRoundId(),
  	updatedAt = TimestampJvmConverter.convert(obj.getUpdatedAt()),
  )

  public override fun convert(obj: EventAnswerUpdated): Ocr.EventAnswerUpdated {
    val builder = Ocr.EventAnswerUpdated.newBuilder()
    builder.setCurrent(obj.current)
    builder.setRoundId(obj.roundId)
    builder.setUpdatedAt(TimestampJvmConverter.convert(obj.updatedAt))
    return builder.build()
  }
}

public object EventNewRoundJvmConverter : ProtobufTypeMapper<EventNewRound, Ocr.EventNewRound> {
  public override val descriptor: Descriptors.Descriptor = Ocr.EventNewRound.getDescriptor()

  public override val parser: Parser<Ocr.EventNewRound> = Ocr.EventNewRound.parser()

  public override fun convert(obj: Ocr.EventNewRound): EventNewRound = EventNewRound(
  	roundId = obj.getRoundId(),
  	startedBy = obj.getStartedBy(),
  	startedAt = TimestampJvmConverter.convert(obj.getStartedAt()),
  )

  public override fun convert(obj: EventNewRound): Ocr.EventNewRound {
    val builder = Ocr.EventNewRound.newBuilder()
    builder.setRoundId(obj.roundId)
    builder.setStartedBy(obj.startedBy)
    builder.setStartedAt(TimestampJvmConverter.convert(obj.startedAt))
    return builder.build()
  }
}

public object EventTransmittedJvmConverter :
    ProtobufTypeMapper<EventTransmitted, Ocr.EventTransmitted> {
  public override val descriptor: Descriptors.Descriptor = Ocr.EventTransmitted.getDescriptor()

  public override val parser: Parser<Ocr.EventTransmitted> = Ocr.EventTransmitted.parser()

  public override fun convert(obj: Ocr.EventTransmitted): EventTransmitted = EventTransmitted(
  	configDigest = obj.getConfigDigest().toByteArray(),
  	epoch = obj.getEpoch().asKotlinType,
  )

  public override fun convert(obj: EventTransmitted): Ocr.EventTransmitted {
    val builder = Ocr.EventTransmitted.newBuilder()
    builder.setConfigDigest(ByteString.copyFrom(obj.configDigest))
    builder.setEpoch(obj.epoch.asJavaType)
    return builder.build()
  }
}

public object EventNewTransmissionJvmConverter :
    ProtobufTypeMapper<EventNewTransmission, Ocr.EventNewTransmission> {
  public override val descriptor: Descriptors.Descriptor = Ocr.EventNewTransmission.getDescriptor()

  public override val parser: Parser<Ocr.EventNewTransmission> = Ocr.EventNewTransmission.parser()

  public override fun convert(obj: Ocr.EventNewTransmission): EventNewTransmission =
      EventNewTransmission(
  	feedId = obj.getFeedId(),
  	aggregatorRoundId = obj.getAggregatorRoundId().asKotlinType,
  	answer = obj.getAnswer(),
  	transmitter = obj.getTransmitter(),
  	observationsTimestamp = obj.getObservationsTimestamp(),
  	observations = obj.getObservationsList().map { it },
  	observers = obj.getObservers().toByteArray(),
  	configDigest = obj.getConfigDigest().toByteArray(),
  	epochAndRound = EpochAndRoundJvmConverter.convert(obj.getEpochAndRound()),
  )

  public override fun convert(obj: EventNewTransmission): Ocr.EventNewTransmission {
    val builder = Ocr.EventNewTransmission.newBuilder()
    builder.setFeedId(obj.feedId)
    builder.setAggregatorRoundId(obj.aggregatorRoundId.asJavaType)
    builder.setAnswer(obj.answer)
    builder.setTransmitter(obj.transmitter)
    builder.setObservationsTimestamp(obj.observationsTimestamp)
    builder.addAllObservations(obj.observations.map { it })
    builder.setObservers(ByteString.copyFrom(obj.observers))
    builder.setConfigDigest(ByteString.copyFrom(obj.configDigest))
    builder.setEpochAndRound(EpochAndRoundJvmConverter.convert(obj.epochAndRound))
    return builder.build()
  }
}

public object EventConfigSetJvmConverter : ProtobufTypeMapper<EventConfigSet, Ocr.EventConfigSet> {
  public override val descriptor: Descriptors.Descriptor = Ocr.EventConfigSet.getDescriptor()

  public override val parser: Parser<Ocr.EventConfigSet> = Ocr.EventConfigSet.parser()

  public override fun convert(obj: Ocr.EventConfigSet): EventConfigSet = EventConfigSet(
  	configDigest = obj.getConfigDigest().toByteArray(),
  	previousConfigBlockNumber = obj.getPreviousConfigBlockNumber(),
  	config = FeedConfigJvmConverter.convert(obj.getConfig()),
  	configInfo = FeedConfigInfoJvmConverter.convert(obj.getConfigInfo()),
  )

  public override fun convert(obj: EventConfigSet): Ocr.EventConfigSet {
    val builder = Ocr.EventConfigSet.newBuilder()
    builder.setConfigDigest(ByteString.copyFrom(obj.configDigest))
    builder.setPreviousConfigBlockNumber(obj.previousConfigBlockNumber)
    builder.setConfig(FeedConfigJvmConverter.convert(obj.config))
    builder.setConfigInfo(FeedConfigInfoJvmConverter.convert(obj.configInfo))
    return builder.build()
  }
}
