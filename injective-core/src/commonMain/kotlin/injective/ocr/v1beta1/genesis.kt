// Transform from injective/ocr/v1beta1/genesis.proto
@file:ProtobufSyntax(syntax = "PROTO3")
@file:GeneratorVersion(version = "0.3.1")

package injective.ocr.v1beta1

import cosmos.base.v1beta1.Coin
import kotlin.String
import kotlin.ULong
import kotlin.Unit
import kotlin.collections.List
import kotlinx.serialization.KSerializer
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import kr.jadekim.protobuf.`annotation`.GeneratorVersion
import kr.jadekim.protobuf.`annotation`.ProtobufIndex
import kr.jadekim.protobuf.`annotation`.ProtobufSyntax
import kr.jadekim.protobuf.kotlinx.ProtobufConverterEncoder
import kr.jadekim.protobuf.kotlinx.ProtobufMapperDecoder
import kr.jadekim.protobuf.type.ProtobufMessage

@Serializable(with = GenesisState.KotlinxSerializer::class)
@SerialName(value = GenesisState.TYPE_URL)
public data class GenesisState(
  @ProtobufIndex(index = 1)
  public val params: Params,
  @ProtobufIndex(index = 2)
  public val feedConfigs: List<FeedConfig>,
  @ProtobufIndex(index = 3)
  public val latestEpochAndRounds: List<FeedEpochAndRound>,
  @ProtobufIndex(index = 4)
  public val feedTransmissions: List<FeedTransmission>,
  @ProtobufIndex(index = 5)
  public val latestAggregatorRoundIds: List<FeedLatestAggregatorRoundIDs>,
  @ProtobufIndex(index = 6)
  public val rewardPools: List<RewardPool>,
  @ProtobufIndex(index = 7)
  public val feedObservationCounts: List<FeedCounts>,
  @ProtobufIndex(index = 8)
  public val feedTransmissionCounts: List<FeedCounts>,
  @ProtobufIndex(index = 9)
  public val pendingPayeeships: List<PendingPayeeship>,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/injective.ocr.v1beta1.GenesisState"
  }

  public object KotlinxSerializer : KSerializer<GenesisState> {
    private val delegator: KSerializer<GenesisState> = GenesisState.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: GenesisState): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(GenesisStateConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): GenesisState {
      if (decoder is ProtobufMapperDecoder) {
        return GenesisStateConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = FeedTransmission.KotlinxSerializer::class)
@SerialName(value = FeedTransmission.TYPE_URL)
public data class FeedTransmission(
  @ProtobufIndex(index = 1)
  public val feedId: String,
  @ProtobufIndex(index = 2)
  public val transmission: Transmission,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/injective.ocr.v1beta1.FeedTransmission"
  }

  public object KotlinxSerializer : KSerializer<FeedTransmission> {
    private val delegator: KSerializer<FeedTransmission> = FeedTransmission.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: FeedTransmission): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(FeedTransmissionConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): FeedTransmission {
      if (decoder is ProtobufMapperDecoder) {
        return FeedTransmissionConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = FeedEpochAndRound.KotlinxSerializer::class)
@SerialName(value = FeedEpochAndRound.TYPE_URL)
public data class FeedEpochAndRound(
  @ProtobufIndex(index = 1)
  public val feedId: String,
  @ProtobufIndex(index = 2)
  public val epochAndRound: EpochAndRound,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/injective.ocr.v1beta1.FeedEpochAndRound"
  }

  public object KotlinxSerializer : KSerializer<FeedEpochAndRound> {
    private val delegator: KSerializer<FeedEpochAndRound> = FeedEpochAndRound.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: FeedEpochAndRound): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(FeedEpochAndRoundConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): FeedEpochAndRound {
      if (decoder is ProtobufMapperDecoder) {
        return FeedEpochAndRoundConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = FeedLatestAggregatorRoundIDs.KotlinxSerializer::class)
@SerialName(value = FeedLatestAggregatorRoundIDs.TYPE_URL)
public data class FeedLatestAggregatorRoundIDs(
  @ProtobufIndex(index = 1)
  public val feedId: String,
  @ProtobufIndex(index = 2)
  public val aggregatorRoundId: ULong,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/injective.ocr.v1beta1.FeedLatestAggregatorRoundIDs"
  }

  public object KotlinxSerializer : KSerializer<FeedLatestAggregatorRoundIDs> {
    private val delegator: KSerializer<FeedLatestAggregatorRoundIDs> =
        FeedLatestAggregatorRoundIDs.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: FeedLatestAggregatorRoundIDs): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(FeedLatestAggregatorRoundIDsConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): FeedLatestAggregatorRoundIDs {
      if (decoder is ProtobufMapperDecoder) {
        return FeedLatestAggregatorRoundIDsConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = RewardPool.KotlinxSerializer::class)
@SerialName(value = RewardPool.TYPE_URL)
public data class RewardPool(
  @ProtobufIndex(index = 1)
  public val feedId: String,
  @ProtobufIndex(index = 2)
  public val amount: Coin,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/injective.ocr.v1beta1.RewardPool"
  }

  public object KotlinxSerializer : KSerializer<RewardPool> {
    private val delegator: KSerializer<RewardPool> = RewardPool.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: RewardPool): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(RewardPoolConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): RewardPool {
      if (decoder is ProtobufMapperDecoder) {
        return RewardPoolConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = FeedCounts.KotlinxSerializer::class)
@SerialName(value = FeedCounts.TYPE_URL)
public data class FeedCounts(
  @ProtobufIndex(index = 1)
  public val feedId: String,
  @ProtobufIndex(index = 2)
  public val counts: List<Count>,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/injective.ocr.v1beta1.FeedCounts"
  }

  public object KotlinxSerializer : KSerializer<FeedCounts> {
    private val delegator: KSerializer<FeedCounts> = FeedCounts.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: FeedCounts): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(FeedCountsConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): FeedCounts {
      if (decoder is ProtobufMapperDecoder) {
        return FeedCountsConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = Count.KotlinxSerializer::class)
@SerialName(value = Count.TYPE_URL)
public data class Count(
  @ProtobufIndex(index = 1)
  public val address: String,
  @ProtobufIndex(index = 2)
  public val count: ULong,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/injective.ocr.v1beta1.Count"
  }

  public object KotlinxSerializer : KSerializer<Count> {
    private val delegator: KSerializer<Count> = Count.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: Count): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(CountConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): Count {
      if (decoder is ProtobufMapperDecoder) {
        return CountConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = PendingPayeeship.KotlinxSerializer::class)
@SerialName(value = PendingPayeeship.TYPE_URL)
public data class PendingPayeeship(
  @ProtobufIndex(index = 1)
  public val feedId: String,
  @ProtobufIndex(index = 2)
  public val transmitter: String,
  @ProtobufIndex(index = 3)
  public val proposedPayee: String,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/injective.ocr.v1beta1.PendingPayeeship"
  }

  public object KotlinxSerializer : KSerializer<PendingPayeeship> {
    private val delegator: KSerializer<PendingPayeeship> = PendingPayeeship.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: PendingPayeeship): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(PendingPayeeshipConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): PendingPayeeship {
      if (decoder is ProtobufMapperDecoder) {
        return PendingPayeeshipConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}
