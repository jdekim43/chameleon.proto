// Transform from injective/ocr/v1beta1/ocr.proto
@file:ProtobufSyntax(syntax = "PROTO3")
@file:GeneratorVersion(version = "0.3.1")

package injective.ocr.v1beta1

import cosmos.base.v1beta1.Coin
import google.protobuf.Timestamp
import kotlin.Boolean
import kotlin.ByteArray
import kotlin.Long
import kotlin.String
import kotlin.UInt
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

@Serializable(with = Params.KotlinxSerializer::class)
@SerialName(value = Params.TYPE_URL)
public data class Params(
  @ProtobufIndex(index = 1)
  public val linkDenom: String,
  @ProtobufIndex(index = 2)
  public val payoutBlockInterval: ULong,
  @ProtobufIndex(index = 3)
  public val moduleAdmin: String,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/injective.ocr.v1beta1.Params"
  }

  public object KotlinxSerializer : KSerializer<Params> {
    private val delegator: KSerializer<Params> = Params.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: Params): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(ParamsConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): Params {
      if (decoder is ProtobufMapperDecoder) {
        return ParamsConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = FeedConfig.KotlinxSerializer::class)
@SerialName(value = FeedConfig.TYPE_URL)
public data class FeedConfig(
  @ProtobufIndex(index = 1)
  public val signers: List<String>,
  @ProtobufIndex(index = 2)
  public val transmitters: List<String>,
  @ProtobufIndex(index = 3)
  public val f: UInt,
  @ProtobufIndex(index = 4)
  public val onchainConfig: ByteArray,
  @ProtobufIndex(index = 5)
  public val offchainConfigVersion: ULong,
  @ProtobufIndex(index = 6)
  public val offchainConfig: ByteArray,
  @ProtobufIndex(index = 7)
  public val moduleParams: ModuleParams,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/injective.ocr.v1beta1.FeedConfig"
  }

  public object KotlinxSerializer : KSerializer<FeedConfig> {
    private val delegator: KSerializer<FeedConfig> = FeedConfig.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: FeedConfig): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(FeedConfigConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): FeedConfig {
      if (decoder is ProtobufMapperDecoder) {
        return FeedConfigConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = FeedConfigInfo.KotlinxSerializer::class)
@SerialName(value = FeedConfigInfo.TYPE_URL)
public data class FeedConfigInfo(
  @ProtobufIndex(index = 1)
  public val latestConfigDigest: ByteArray,
  @ProtobufIndex(index = 2)
  public val f: UInt,
  @ProtobufIndex(index = 3)
  public val n: UInt,
  @ProtobufIndex(index = 4)
  public val configCount: ULong,
  @ProtobufIndex(index = 5)
  public val latestConfigBlockNumber: Long,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/injective.ocr.v1beta1.FeedConfigInfo"
  }

  public object KotlinxSerializer : KSerializer<FeedConfigInfo> {
    private val delegator: KSerializer<FeedConfigInfo> = FeedConfigInfo.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: FeedConfigInfo): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(FeedConfigInfoConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): FeedConfigInfo {
      if (decoder is ProtobufMapperDecoder) {
        return FeedConfigInfoConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = ModuleParams.KotlinxSerializer::class)
@SerialName(value = ModuleParams.TYPE_URL)
public data class ModuleParams(
  @ProtobufIndex(index = 1)
  public val feedId: String,
  @ProtobufIndex(index = 2)
  public val minAnswer: String,
  @ProtobufIndex(index = 3)
  public val maxAnswer: String,
  @ProtobufIndex(index = 4)
  public val linkPerObservation: String,
  @ProtobufIndex(index = 5)
  public val linkPerTransmission: String,
  @ProtobufIndex(index = 6)
  public val linkDenom: String,
  @ProtobufIndex(index = 7)
  public val uniqueReports: Boolean,
  @ProtobufIndex(index = 8)
  public val description: String,
  @ProtobufIndex(index = 9)
  public val feedAdmin: String,
  @ProtobufIndex(index = 10)
  public val billingAdmin: String,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/injective.ocr.v1beta1.ModuleParams"
  }

  public object KotlinxSerializer : KSerializer<ModuleParams> {
    private val delegator: KSerializer<ModuleParams> = ModuleParams.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: ModuleParams): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(ModuleParamsConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): ModuleParams {
      if (decoder is ProtobufMapperDecoder) {
        return ModuleParamsConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = ContractConfig.KotlinxSerializer::class)
@SerialName(value = ContractConfig.TYPE_URL)
public data class ContractConfig(
  @ProtobufIndex(index = 1)
  public val configCount: ULong,
  @ProtobufIndex(index = 2)
  public val signers: List<String>,
  @ProtobufIndex(index = 3)
  public val transmitters: List<String>,
  @ProtobufIndex(index = 4)
  public val f: UInt,
  @ProtobufIndex(index = 5)
  public val onchainConfig: ByteArray,
  @ProtobufIndex(index = 6)
  public val offchainConfigVersion: ULong,
  @ProtobufIndex(index = 7)
  public val offchainConfig: ByteArray,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/injective.ocr.v1beta1.ContractConfig"
  }

  public object KotlinxSerializer : KSerializer<ContractConfig> {
    private val delegator: KSerializer<ContractConfig> = ContractConfig.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: ContractConfig): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(ContractConfigConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): ContractConfig {
      if (decoder is ProtobufMapperDecoder) {
        return ContractConfigConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = SetConfigProposal.KotlinxSerializer::class)
@SerialName(value = SetConfigProposal.TYPE_URL)
public data class SetConfigProposal(
  @ProtobufIndex(index = 1)
  public val title: String,
  @ProtobufIndex(index = 2)
  public val description: String,
  @ProtobufIndex(index = 3)
  public val config: FeedConfig,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/injective.ocr.v1beta1.SetConfigProposal"
  }

  public object KotlinxSerializer : KSerializer<SetConfigProposal> {
    private val delegator: KSerializer<SetConfigProposal> = SetConfigProposal.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: SetConfigProposal): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(SetConfigProposalConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): SetConfigProposal {
      if (decoder is ProtobufMapperDecoder) {
        return SetConfigProposalConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = FeedProperties.KotlinxSerializer::class)
@SerialName(value = FeedProperties.TYPE_URL)
public data class FeedProperties(
  @ProtobufIndex(index = 1)
  public val feedId: String,
  @ProtobufIndex(index = 2)
  public val f: UInt,
  @ProtobufIndex(index = 3)
  public val onchainConfig: ByteArray,
  @ProtobufIndex(index = 4)
  public val offchainConfigVersion: ULong,
  @ProtobufIndex(index = 5)
  public val offchainConfig: ByteArray,
  @ProtobufIndex(index = 6)
  public val minAnswer: String,
  @ProtobufIndex(index = 7)
  public val maxAnswer: String,
  @ProtobufIndex(index = 8)
  public val linkPerObservation: String,
  @ProtobufIndex(index = 9)
  public val linkPerTransmission: String,
  @ProtobufIndex(index = 10)
  public val uniqueReports: Boolean,
  @ProtobufIndex(index = 11)
  public val description: String,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/injective.ocr.v1beta1.FeedProperties"
  }

  public object KotlinxSerializer : KSerializer<FeedProperties> {
    private val delegator: KSerializer<FeedProperties> = FeedProperties.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: FeedProperties): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(FeedPropertiesConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): FeedProperties {
      if (decoder is ProtobufMapperDecoder) {
        return FeedPropertiesConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = SetBatchConfigProposal.KotlinxSerializer::class)
@SerialName(value = SetBatchConfigProposal.TYPE_URL)
public data class SetBatchConfigProposal(
  @ProtobufIndex(index = 1)
  public val title: String,
  @ProtobufIndex(index = 2)
  public val description: String,
  @ProtobufIndex(index = 3)
  public val signers: List<String>,
  @ProtobufIndex(index = 4)
  public val transmitters: List<String>,
  @ProtobufIndex(index = 5)
  public val linkDenom: String,
  @ProtobufIndex(index = 6)
  public val feedProperties: List<FeedProperties>,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/injective.ocr.v1beta1.SetBatchConfigProposal"
  }

  public object KotlinxSerializer : KSerializer<SetBatchConfigProposal> {
    private val delegator: KSerializer<SetBatchConfigProposal> = SetBatchConfigProposal.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: SetBatchConfigProposal): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(SetBatchConfigProposalConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): SetBatchConfigProposal {
      if (decoder is ProtobufMapperDecoder) {
        return SetBatchConfigProposalConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = OracleObservationsCounts.KotlinxSerializer::class)
@SerialName(value = OracleObservationsCounts.TYPE_URL)
public data class OracleObservationsCounts(
  @ProtobufIndex(index = 1)
  public val counts: List<UInt>,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/injective.ocr.v1beta1.OracleObservationsCounts"
  }

  public object KotlinxSerializer : KSerializer<OracleObservationsCounts> {
    private val delegator: KSerializer<OracleObservationsCounts> =
        OracleObservationsCounts.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: OracleObservationsCounts): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(OracleObservationsCountsConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): OracleObservationsCounts {
      if (decoder is ProtobufMapperDecoder) {
        return OracleObservationsCountsConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = GasReimbursements.KotlinxSerializer::class)
@SerialName(value = GasReimbursements.TYPE_URL)
public data class GasReimbursements(
  @ProtobufIndex(index = 1)
  public val reimbursements: List<Coin>,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/injective.ocr.v1beta1.GasReimbursements"
  }

  public object KotlinxSerializer : KSerializer<GasReimbursements> {
    private val delegator: KSerializer<GasReimbursements> = GasReimbursements.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: GasReimbursements): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(GasReimbursementsConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): GasReimbursements {
      if (decoder is ProtobufMapperDecoder) {
        return GasReimbursementsConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = Payee.KotlinxSerializer::class)
@SerialName(value = Payee.TYPE_URL)
public data class Payee(
  @ProtobufIndex(index = 1)
  public val transmitterAddr: String,
  @ProtobufIndex(index = 2)
  public val paymentAddr: String,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/injective.ocr.v1beta1.Payee"
  }

  public object KotlinxSerializer : KSerializer<Payee> {
    private val delegator: KSerializer<Payee> = Payee.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: Payee): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(PayeeConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): Payee {
      if (decoder is ProtobufMapperDecoder) {
        return PayeeConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = Transmission.KotlinxSerializer::class)
@SerialName(value = Transmission.TYPE_URL)
public data class Transmission(
  @ProtobufIndex(index = 1)
  public val answer: String,
  @ProtobufIndex(index = 2)
  public val observationsTimestamp: Long,
  @ProtobufIndex(index = 3)
  public val transmissionTimestamp: Long,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/injective.ocr.v1beta1.Transmission"
  }

  public object KotlinxSerializer : KSerializer<Transmission> {
    private val delegator: KSerializer<Transmission> = Transmission.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: Transmission): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(TransmissionConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): Transmission {
      if (decoder is ProtobufMapperDecoder) {
        return TransmissionConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = EpochAndRound.KotlinxSerializer::class)
@SerialName(value = EpochAndRound.TYPE_URL)
public data class EpochAndRound(
  @ProtobufIndex(index = 1)
  public val epoch: ULong,
  @ProtobufIndex(index = 2)
  public val round: ULong,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/injective.ocr.v1beta1.EpochAndRound"
  }

  public object KotlinxSerializer : KSerializer<EpochAndRound> {
    private val delegator: KSerializer<EpochAndRound> = EpochAndRound.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: EpochAndRound): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(EpochAndRoundConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): EpochAndRound {
      if (decoder is ProtobufMapperDecoder) {
        return EpochAndRoundConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = Report.KotlinxSerializer::class)
@SerialName(value = Report.TYPE_URL)
public data class Report(
  @ProtobufIndex(index = 1)
  public val observationsTimestamp: Long,
  @ProtobufIndex(index = 2)
  public val observers: ByteArray,
  @ProtobufIndex(index = 3)
  public val observations: List<String>,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/injective.ocr.v1beta1.Report"
  }

  public object KotlinxSerializer : KSerializer<Report> {
    private val delegator: KSerializer<Report> = Report.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: Report): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(ReportConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): Report {
      if (decoder is ProtobufMapperDecoder) {
        return ReportConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = ReportToSign.KotlinxSerializer::class)
@SerialName(value = ReportToSign.TYPE_URL)
public data class ReportToSign(
  @ProtobufIndex(index = 1)
  public val configDigest: ByteArray,
  @ProtobufIndex(index = 2)
  public val epoch: ULong,
  @ProtobufIndex(index = 3)
  public val round: ULong,
  @ProtobufIndex(index = 4)
  public val extraHash: ByteArray,
  @ProtobufIndex(index = 5)
  public val report: ByteArray,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/injective.ocr.v1beta1.ReportToSign"
  }

  public object KotlinxSerializer : KSerializer<ReportToSign> {
    private val delegator: KSerializer<ReportToSign> = ReportToSign.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: ReportToSign): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(ReportToSignConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): ReportToSign {
      if (decoder is ProtobufMapperDecoder) {
        return ReportToSignConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = EventOraclePaid.KotlinxSerializer::class)
@SerialName(value = EventOraclePaid.TYPE_URL)
public data class EventOraclePaid(
  @ProtobufIndex(index = 1)
  public val transmitterAddr: String,
  @ProtobufIndex(index = 2)
  public val payeeAddr: String,
  @ProtobufIndex(index = 3)
  public val amount: Coin,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/injective.ocr.v1beta1.EventOraclePaid"
  }

  public object KotlinxSerializer : KSerializer<EventOraclePaid> {
    private val delegator: KSerializer<EventOraclePaid> = EventOraclePaid.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: EventOraclePaid): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(EventOraclePaidConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): EventOraclePaid {
      if (decoder is ProtobufMapperDecoder) {
        return EventOraclePaidConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = EventAnswerUpdated.KotlinxSerializer::class)
@SerialName(value = EventAnswerUpdated.TYPE_URL)
public data class EventAnswerUpdated(
  @ProtobufIndex(index = 1)
  public val current: String,
  @ProtobufIndex(index = 2)
  public val roundId: String,
  @ProtobufIndex(index = 3)
  public val updatedAt: Timestamp,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/injective.ocr.v1beta1.EventAnswerUpdated"
  }

  public object KotlinxSerializer : KSerializer<EventAnswerUpdated> {
    private val delegator: KSerializer<EventAnswerUpdated> = EventAnswerUpdated.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: EventAnswerUpdated): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(EventAnswerUpdatedConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): EventAnswerUpdated {
      if (decoder is ProtobufMapperDecoder) {
        return EventAnswerUpdatedConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = EventNewRound.KotlinxSerializer::class)
@SerialName(value = EventNewRound.TYPE_URL)
public data class EventNewRound(
  @ProtobufIndex(index = 1)
  public val roundId: String,
  @ProtobufIndex(index = 2)
  public val startedBy: String,
  @ProtobufIndex(index = 3)
  public val startedAt: Timestamp,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/injective.ocr.v1beta1.EventNewRound"
  }

  public object KotlinxSerializer : KSerializer<EventNewRound> {
    private val delegator: KSerializer<EventNewRound> = EventNewRound.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: EventNewRound): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(EventNewRoundConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): EventNewRound {
      if (decoder is ProtobufMapperDecoder) {
        return EventNewRoundConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = EventTransmitted.KotlinxSerializer::class)
@SerialName(value = EventTransmitted.TYPE_URL)
public data class EventTransmitted(
  @ProtobufIndex(index = 1)
  public val configDigest: ByteArray,
  @ProtobufIndex(index = 2)
  public val epoch: ULong,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/injective.ocr.v1beta1.EventTransmitted"
  }

  public object KotlinxSerializer : KSerializer<EventTransmitted> {
    private val delegator: KSerializer<EventTransmitted> = EventTransmitted.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: EventTransmitted): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(EventTransmittedConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): EventTransmitted {
      if (decoder is ProtobufMapperDecoder) {
        return EventTransmittedConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = EventNewTransmission.KotlinxSerializer::class)
@SerialName(value = EventNewTransmission.TYPE_URL)
public data class EventNewTransmission(
  @ProtobufIndex(index = 1)
  public val feedId: String,
  @ProtobufIndex(index = 2)
  public val aggregatorRoundId: UInt,
  @ProtobufIndex(index = 3)
  public val answer: String,
  @ProtobufIndex(index = 4)
  public val transmitter: String,
  @ProtobufIndex(index = 5)
  public val observationsTimestamp: Long,
  @ProtobufIndex(index = 6)
  public val observations: List<String>,
  @ProtobufIndex(index = 7)
  public val observers: ByteArray,
  @ProtobufIndex(index = 8)
  public val configDigest: ByteArray,
  @ProtobufIndex(index = 9)
  public val epochAndRound: EpochAndRound,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/injective.ocr.v1beta1.EventNewTransmission"
  }

  public object KotlinxSerializer : KSerializer<EventNewTransmission> {
    private val delegator: KSerializer<EventNewTransmission> = EventNewTransmission.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: EventNewTransmission): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(EventNewTransmissionConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): EventNewTransmission {
      if (decoder is ProtobufMapperDecoder) {
        return EventNewTransmissionConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = EventConfigSet.KotlinxSerializer::class)
@SerialName(value = EventConfigSet.TYPE_URL)
public data class EventConfigSet(
  @ProtobufIndex(index = 1)
  public val configDigest: ByteArray,
  @ProtobufIndex(index = 2)
  public val previousConfigBlockNumber: Long,
  @ProtobufIndex(index = 3)
  public val config: FeedConfig,
  @ProtobufIndex(index = 4)
  public val configInfo: FeedConfigInfo,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/injective.ocr.v1beta1.EventConfigSet"
  }

  public object KotlinxSerializer : KSerializer<EventConfigSet> {
    private val delegator: KSerializer<EventConfigSet> = EventConfigSet.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: EventConfigSet): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(EventConfigSetConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): EventConfigSet {
      if (decoder is ProtobufMapperDecoder) {
        return EventConfigSetConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}
