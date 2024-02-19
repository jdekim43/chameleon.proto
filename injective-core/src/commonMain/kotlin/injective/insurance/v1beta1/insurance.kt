// Transform from injective/insurance/v1beta1/insurance.proto
@file:ProtobufSyntax(syntax = "PROTO3")
@file:GeneratorVersion(version = "0.3.1")

package injective.insurance.v1beta1

import cosmos.base.v1beta1.Coin
import google.protobuf.Duration
import google.protobuf.Timestamp
import injective.oracle.v1beta1.OracleType
import kotlin.Long
import kotlin.String
import kotlin.ULong
import kotlin.Unit
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
  public val defaultRedemptionNoticePeriodDuration: Duration,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/injective.insurance.v1beta1.Params"
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

@Serializable(with = InsuranceFund.KotlinxSerializer::class)
@SerialName(value = InsuranceFund.TYPE_URL)
public data class InsuranceFund(
  @ProtobufIndex(index = 1)
  public val depositDenom: String,
  @ProtobufIndex(index = 2)
  public val insurancePoolTokenDenom: String,
  @ProtobufIndex(index = 3)
  public val redemptionNoticePeriodDuration: Duration,
  @ProtobufIndex(index = 4)
  public val balance: String,
  @ProtobufIndex(index = 5)
  public val totalShare: String,
  @ProtobufIndex(index = 6)
  public val marketId: String,
  @ProtobufIndex(index = 7)
  public val marketTicker: String,
  @ProtobufIndex(index = 8)
  public val oracleBase: String,
  @ProtobufIndex(index = 9)
  public val oracleQuote: String,
  @ProtobufIndex(index = 10)
  public val oracleType: OracleType,
  @ProtobufIndex(index = 11)
  public val expiry: Long,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/injective.insurance.v1beta1.InsuranceFund"
  }

  public object KotlinxSerializer : KSerializer<InsuranceFund> {
    private val delegator: KSerializer<InsuranceFund> = InsuranceFund.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: InsuranceFund): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(InsuranceFundConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): InsuranceFund {
      if (decoder is ProtobufMapperDecoder) {
        return InsuranceFundConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = RedemptionSchedule.KotlinxSerializer::class)
@SerialName(value = RedemptionSchedule.TYPE_URL)
public data class RedemptionSchedule(
  @ProtobufIndex(index = 1)
  public val id: ULong,
  @ProtobufIndex(index = 2)
  public val marketId: String,
  @ProtobufIndex(index = 3)
  public val redeemer: String,
  @ProtobufIndex(index = 4)
  public val claimableRedemptionTime: Timestamp,
  @ProtobufIndex(index = 5)
  public val redemptionAmount: Coin,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/injective.insurance.v1beta1.RedemptionSchedule"
  }

  public object KotlinxSerializer : KSerializer<RedemptionSchedule> {
    private val delegator: KSerializer<RedemptionSchedule> = RedemptionSchedule.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: RedemptionSchedule): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(RedemptionScheduleConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): RedemptionSchedule {
      if (decoder is ProtobufMapperDecoder) {
        return RedemptionScheduleConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}
