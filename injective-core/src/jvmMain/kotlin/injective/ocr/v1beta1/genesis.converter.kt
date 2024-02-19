// Transform from injective/ocr/v1beta1/genesis.proto
@file:GeneratorVersion(version = "0.3.1")

package injective.ocr.v1beta1

import kr.jadekim.protobuf.`annotation`.GeneratorVersion
import kr.jadekim.protobuf.converter.ProtobufConverter

public actual object GenesisStateConverter : ProtobufConverter<GenesisState> by
    GenesisStateJvmConverter

public actual object FeedTransmissionConverter : ProtobufConverter<FeedTransmission> by
    FeedTransmissionJvmConverter

public actual object FeedEpochAndRoundConverter : ProtobufConverter<FeedEpochAndRound> by
    FeedEpochAndRoundJvmConverter

public actual object FeedLatestAggregatorRoundIDsConverter :
    ProtobufConverter<FeedLatestAggregatorRoundIDs> by FeedLatestAggregatorRoundIDsJvmConverter

public actual object RewardPoolConverter : ProtobufConverter<RewardPool> by RewardPoolJvmConverter

public actual object FeedCountsConverter : ProtobufConverter<FeedCounts> by FeedCountsJvmConverter

public actual object CountConverter : ProtobufConverter<Count> by CountJvmConverter

public actual object PendingPayeeshipConverter : ProtobufConverter<PendingPayeeship> by
    PendingPayeeshipJvmConverter
