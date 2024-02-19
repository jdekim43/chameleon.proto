// Transform from injective/ocr/v1beta1/genesis.proto
@file:GeneratorVersion(version = "0.3.1")

package injective.ocr.v1beta1

import com.google.protobuf.Descriptors
import com.google.protobuf.Parser
import cosmos.base.v1beta1.CoinJvmConverter
import kr.jadekim.protobuf.`annotation`.GeneratorVersion
import kr.jadekim.protobuf.converter.mapper.ProtobufTypeMapper
import kr.jadekim.protobuf.util.asJavaType
import kr.jadekim.protobuf.util.asKotlinType

public object GenesisStateJvmConverter : ProtobufTypeMapper<GenesisState, Genesis.GenesisState> {
  public override val descriptor: Descriptors.Descriptor = Genesis.GenesisState.getDescriptor()

  public override val parser: Parser<Genesis.GenesisState> = Genesis.GenesisState.parser()

  public override fun convert(obj: Genesis.GenesisState): GenesisState = GenesisState(
  	params = ParamsJvmConverter.convert(obj.getParams()),
  	feedConfigs = obj.getFeedConfigsList().map { FeedConfigJvmConverter.convert(it) },
  	latestEpochAndRounds = obj.getLatestEpochAndRoundsList().map {
      FeedEpochAndRoundJvmConverter.convert(it) },
  	feedTransmissions = obj.getFeedTransmissionsList().map { FeedTransmissionJvmConverter.convert(it)
      },
  	latestAggregatorRoundIds = obj.getLatestAggregatorRoundIdsList().map {
      FeedLatestAggregatorRoundIDsJvmConverter.convert(it) },
  	rewardPools = obj.getRewardPoolsList().map { RewardPoolJvmConverter.convert(it) },
  	feedObservationCounts = obj.getFeedObservationCountsList().map {
      FeedCountsJvmConverter.convert(it) },
  	feedTransmissionCounts = obj.getFeedTransmissionCountsList().map {
      FeedCountsJvmConverter.convert(it) },
  	pendingPayeeships = obj.getPendingPayeeshipsList().map { PendingPayeeshipJvmConverter.convert(it)
      },
  )

  public override fun convert(obj: GenesisState): Genesis.GenesisState {
    val builder = Genesis.GenesisState.newBuilder()
    builder.setParams(ParamsJvmConverter.convert(obj.params))
    builder.addAllFeedConfigs(obj.feedConfigs.map { FeedConfigJvmConverter.convert(it) })
    builder.addAllLatestEpochAndRounds(obj.latestEpochAndRounds.map {
        FeedEpochAndRoundJvmConverter.convert(it) })
    builder.addAllFeedTransmissions(obj.feedTransmissions.map {
        FeedTransmissionJvmConverter.convert(it) })
    builder.addAllLatestAggregatorRoundIds(obj.latestAggregatorRoundIds.map {
        FeedLatestAggregatorRoundIDsJvmConverter.convert(it) })
    builder.addAllRewardPools(obj.rewardPools.map { RewardPoolJvmConverter.convert(it) })
    builder.addAllFeedObservationCounts(obj.feedObservationCounts.map {
        FeedCountsJvmConverter.convert(it) })
    builder.addAllFeedTransmissionCounts(obj.feedTransmissionCounts.map {
        FeedCountsJvmConverter.convert(it) })
    builder.addAllPendingPayeeships(obj.pendingPayeeships.map {
        PendingPayeeshipJvmConverter.convert(it) })
    return builder.build()
  }
}

public object FeedTransmissionJvmConverter :
    ProtobufTypeMapper<FeedTransmission, Genesis.FeedTransmission> {
  public override val descriptor: Descriptors.Descriptor = Genesis.FeedTransmission.getDescriptor()

  public override val parser: Parser<Genesis.FeedTransmission> = Genesis.FeedTransmission.parser()

  public override fun convert(obj: Genesis.FeedTransmission): FeedTransmission = FeedTransmission(
  	feedId = obj.getFeedId(),
  	transmission = TransmissionJvmConverter.convert(obj.getTransmission()),
  )

  public override fun convert(obj: FeedTransmission): Genesis.FeedTransmission {
    val builder = Genesis.FeedTransmission.newBuilder()
    builder.setFeedId(obj.feedId)
    builder.setTransmission(TransmissionJvmConverter.convert(obj.transmission))
    return builder.build()
  }
}

public object FeedEpochAndRoundJvmConverter :
    ProtobufTypeMapper<FeedEpochAndRound, Genesis.FeedEpochAndRound> {
  public override val descriptor: Descriptors.Descriptor = Genesis.FeedEpochAndRound.getDescriptor()

  public override val parser: Parser<Genesis.FeedEpochAndRound> = Genesis.FeedEpochAndRound.parser()

  public override fun convert(obj: Genesis.FeedEpochAndRound): FeedEpochAndRound =
      FeedEpochAndRound(
  	feedId = obj.getFeedId(),
  	epochAndRound = EpochAndRoundJvmConverter.convert(obj.getEpochAndRound()),
  )

  public override fun convert(obj: FeedEpochAndRound): Genesis.FeedEpochAndRound {
    val builder = Genesis.FeedEpochAndRound.newBuilder()
    builder.setFeedId(obj.feedId)
    builder.setEpochAndRound(EpochAndRoundJvmConverter.convert(obj.epochAndRound))
    return builder.build()
  }
}

public object FeedLatestAggregatorRoundIDsJvmConverter :
    ProtobufTypeMapper<FeedLatestAggregatorRoundIDs, Genesis.FeedLatestAggregatorRoundIDs> {
  public override val descriptor: Descriptors.Descriptor =
      Genesis.FeedLatestAggregatorRoundIDs.getDescriptor()

  public override val parser: Parser<Genesis.FeedLatestAggregatorRoundIDs> =
      Genesis.FeedLatestAggregatorRoundIDs.parser()

  public override fun convert(obj: Genesis.FeedLatestAggregatorRoundIDs):
      FeedLatestAggregatorRoundIDs = FeedLatestAggregatorRoundIDs(
  	feedId = obj.getFeedId(),
  	aggregatorRoundId = obj.getAggregatorRoundId().asKotlinType,
  )

  public override fun convert(obj: FeedLatestAggregatorRoundIDs):
      Genesis.FeedLatestAggregatorRoundIDs {
    val builder = Genesis.FeedLatestAggregatorRoundIDs.newBuilder()
    builder.setFeedId(obj.feedId)
    builder.setAggregatorRoundId(obj.aggregatorRoundId.asJavaType)
    return builder.build()
  }
}

public object RewardPoolJvmConverter : ProtobufTypeMapper<RewardPool, Genesis.RewardPool> {
  public override val descriptor: Descriptors.Descriptor = Genesis.RewardPool.getDescriptor()

  public override val parser: Parser<Genesis.RewardPool> = Genesis.RewardPool.parser()

  public override fun convert(obj: Genesis.RewardPool): RewardPool = RewardPool(
  	feedId = obj.getFeedId(),
  	amount = CoinJvmConverter.convert(obj.getAmount()),
  )

  public override fun convert(obj: RewardPool): Genesis.RewardPool {
    val builder = Genesis.RewardPool.newBuilder()
    builder.setFeedId(obj.feedId)
    builder.setAmount(CoinJvmConverter.convert(obj.amount))
    return builder.build()
  }
}

public object FeedCountsJvmConverter : ProtobufTypeMapper<FeedCounts, Genesis.FeedCounts> {
  public override val descriptor: Descriptors.Descriptor = Genesis.FeedCounts.getDescriptor()

  public override val parser: Parser<Genesis.FeedCounts> = Genesis.FeedCounts.parser()

  public override fun convert(obj: Genesis.FeedCounts): FeedCounts = FeedCounts(
  	feedId = obj.getFeedId(),
  	counts = obj.getCountsList().map { CountJvmConverter.convert(it) },
  )

  public override fun convert(obj: FeedCounts): Genesis.FeedCounts {
    val builder = Genesis.FeedCounts.newBuilder()
    builder.setFeedId(obj.feedId)
    builder.addAllCounts(obj.counts.map { CountJvmConverter.convert(it) })
    return builder.build()
  }
}

public object CountJvmConverter : ProtobufTypeMapper<Count, Genesis.Count> {
  public override val descriptor: Descriptors.Descriptor = Genesis.Count.getDescriptor()

  public override val parser: Parser<Genesis.Count> = Genesis.Count.parser()

  public override fun convert(obj: Genesis.Count): Count = Count(
  	address = obj.getAddress(),
  	count = obj.getCount().asKotlinType,
  )

  public override fun convert(obj: Count): Genesis.Count {
    val builder = Genesis.Count.newBuilder()
    builder.setAddress(obj.address)
    builder.setCount(obj.count.asJavaType)
    return builder.build()
  }
}

public object PendingPayeeshipJvmConverter :
    ProtobufTypeMapper<PendingPayeeship, Genesis.PendingPayeeship> {
  public override val descriptor: Descriptors.Descriptor = Genesis.PendingPayeeship.getDescriptor()

  public override val parser: Parser<Genesis.PendingPayeeship> = Genesis.PendingPayeeship.parser()

  public override fun convert(obj: Genesis.PendingPayeeship): PendingPayeeship = PendingPayeeship(
  	feedId = obj.getFeedId(),
  	transmitter = obj.getTransmitter(),
  	proposedPayee = obj.getProposedPayee(),
  )

  public override fun convert(obj: PendingPayeeship): Genesis.PendingPayeeship {
    val builder = Genesis.PendingPayeeship.newBuilder()
    builder.setFeedId(obj.feedId)
    builder.setTransmitter(obj.transmitter)
    builder.setProposedPayee(obj.proposedPayee)
    return builder.build()
  }
}
