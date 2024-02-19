// Transform from injective/ocr/v1beta1/genesis.proto
@file:GeneratorVersion(version = "0.3.1")

package injective.ocr.v1beta1

import google.protobuf.Any
import java.lang.IllegalStateException
import kr.jadekim.protobuf.`annotation`.GeneratorVersion
import kr.jadekim.protobuf.converter.ProtobufConverter
import kr.jadekim.protobuf.converter.parseProtobuf

public expect object GenesisStateConverter : ProtobufConverter<GenesisState>

public fun GenesisState.toAny(): Any = Any(GenesisState.TYPE_URL, with(GenesisStateConverter) {
    toByteArray() })

public fun Any.parse(converter: ProtobufConverter<GenesisState>): GenesisState {
  if (typeUrl != GenesisState.TYPE_URL) throw IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object FeedTransmissionConverter : ProtobufConverter<FeedTransmission>

public fun FeedTransmission.toAny(): Any = Any(FeedTransmission.TYPE_URL,
    with(FeedTransmissionConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<FeedTransmission>): FeedTransmission {
  if (typeUrl != FeedTransmission.TYPE_URL) throw IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object FeedEpochAndRoundConverter : ProtobufConverter<FeedEpochAndRound>

public fun FeedEpochAndRound.toAny(): Any = Any(FeedEpochAndRound.TYPE_URL,
    with(FeedEpochAndRoundConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<FeedEpochAndRound>): FeedEpochAndRound {
  if (typeUrl != FeedEpochAndRound.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object FeedLatestAggregatorRoundIDsConverter :
    ProtobufConverter<FeedLatestAggregatorRoundIDs>

public fun FeedLatestAggregatorRoundIDs.toAny(): Any = Any(FeedLatestAggregatorRoundIDs.TYPE_URL,
    with(FeedLatestAggregatorRoundIDsConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<FeedLatestAggregatorRoundIDs>):
    FeedLatestAggregatorRoundIDs {
  if (typeUrl != FeedLatestAggregatorRoundIDs.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object RewardPoolConverter : ProtobufConverter<RewardPool>

public fun RewardPool.toAny(): Any = Any(RewardPool.TYPE_URL, with(RewardPoolConverter) {
    toByteArray() })

public fun Any.parse(converter: ProtobufConverter<RewardPool>): RewardPool {
  if (typeUrl != RewardPool.TYPE_URL) throw IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object FeedCountsConverter : ProtobufConverter<FeedCounts>

public fun FeedCounts.toAny(): Any = Any(FeedCounts.TYPE_URL, with(FeedCountsConverter) {
    toByteArray() })

public fun Any.parse(converter: ProtobufConverter<FeedCounts>): FeedCounts {
  if (typeUrl != FeedCounts.TYPE_URL) throw IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object CountConverter : ProtobufConverter<Count>

public fun Count.toAny(): Any = Any(Count.TYPE_URL, with(CountConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<Count>): Count {
  if (typeUrl != Count.TYPE_URL) throw IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object PendingPayeeshipConverter : ProtobufConverter<PendingPayeeship>

public fun PendingPayeeship.toAny(): Any = Any(PendingPayeeship.TYPE_URL,
    with(PendingPayeeshipConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<PendingPayeeship>): PendingPayeeship {
  if (typeUrl != PendingPayeeship.TYPE_URL) throw IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}
