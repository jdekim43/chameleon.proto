// Transform from injective/insurance/v1beta1/tx.proto
@file:ProtobufSyntax(syntax = "PROTO3")
@file:GeneratorVersion(version = "0.3.1")

package injective.insurance.v1beta1

import cosmos.base.v1beta1.Coin
import injective.oracle.v1beta1.OracleType
import kotlin.Long
import kotlin.String
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

@Serializable(with = MsgCreateInsuranceFund.KotlinxSerializer::class)
@SerialName(value = MsgCreateInsuranceFund.TYPE_URL)
public data class MsgCreateInsuranceFund(
  @ProtobufIndex(index = 1)
  public val sender: String,
  @ProtobufIndex(index = 2)
  public val ticker: String,
  @ProtobufIndex(index = 3)
  public val quoteDenom: String,
  @ProtobufIndex(index = 4)
  public val oracleBase: String,
  @ProtobufIndex(index = 5)
  public val oracleQuote: String,
  @ProtobufIndex(index = 6)
  public val oracleType: OracleType,
  @ProtobufIndex(index = 7)
  public val expiry: Long,
  @ProtobufIndex(index = 8)
  public val initialDeposit: Coin,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/injective.insurance.v1beta1.MsgCreateInsuranceFund"
  }

  public object KotlinxSerializer : KSerializer<MsgCreateInsuranceFund> {
    private val delegator: KSerializer<MsgCreateInsuranceFund> = MsgCreateInsuranceFund.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: MsgCreateInsuranceFund): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(MsgCreateInsuranceFundConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): MsgCreateInsuranceFund {
      if (decoder is ProtobufMapperDecoder) {
        return MsgCreateInsuranceFundConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = MsgCreateInsuranceFundResponse.KotlinxSerializer::class)
@SerialName(value = MsgCreateInsuranceFundResponse.TYPE_URL)
public class MsgCreateInsuranceFundResponse() : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String =
        "/injective.insurance.v1beta1.MsgCreateInsuranceFundResponse"
  }

  public object KotlinxSerializer : KSerializer<MsgCreateInsuranceFundResponse> {
    private val delegator: KSerializer<MsgCreateInsuranceFundResponse> =
        MsgCreateInsuranceFundResponse.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: MsgCreateInsuranceFundResponse): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(MsgCreateInsuranceFundResponseConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): MsgCreateInsuranceFundResponse {
      if (decoder is ProtobufMapperDecoder) {
        return MsgCreateInsuranceFundResponseConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = MsgUnderwrite.KotlinxSerializer::class)
@SerialName(value = MsgUnderwrite.TYPE_URL)
public data class MsgUnderwrite(
  @ProtobufIndex(index = 1)
  public val sender: String,
  @ProtobufIndex(index = 2)
  public val marketId: String,
  @ProtobufIndex(index = 3)
  public val deposit: Coin,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/injective.insurance.v1beta1.MsgUnderwrite"
  }

  public object KotlinxSerializer : KSerializer<MsgUnderwrite> {
    private val delegator: KSerializer<MsgUnderwrite> = MsgUnderwrite.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: MsgUnderwrite): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(MsgUnderwriteConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): MsgUnderwrite {
      if (decoder is ProtobufMapperDecoder) {
        return MsgUnderwriteConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = MsgUnderwriteResponse.KotlinxSerializer::class)
@SerialName(value = MsgUnderwriteResponse.TYPE_URL)
public class MsgUnderwriteResponse() : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/injective.insurance.v1beta1.MsgUnderwriteResponse"
  }

  public object KotlinxSerializer : KSerializer<MsgUnderwriteResponse> {
    private val delegator: KSerializer<MsgUnderwriteResponse> = MsgUnderwriteResponse.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: MsgUnderwriteResponse): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(MsgUnderwriteResponseConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): MsgUnderwriteResponse {
      if (decoder is ProtobufMapperDecoder) {
        return MsgUnderwriteResponseConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = MsgRequestRedemption.KotlinxSerializer::class)
@SerialName(value = MsgRequestRedemption.TYPE_URL)
public data class MsgRequestRedemption(
  @ProtobufIndex(index = 1)
  public val sender: String,
  @ProtobufIndex(index = 2)
  public val marketId: String,
  @ProtobufIndex(index = 3)
  public val amount: Coin,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/injective.insurance.v1beta1.MsgRequestRedemption"
  }

  public object KotlinxSerializer : KSerializer<MsgRequestRedemption> {
    private val delegator: KSerializer<MsgRequestRedemption> = MsgRequestRedemption.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: MsgRequestRedemption): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(MsgRequestRedemptionConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): MsgRequestRedemption {
      if (decoder is ProtobufMapperDecoder) {
        return MsgRequestRedemptionConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = MsgRequestRedemptionResponse.KotlinxSerializer::class)
@SerialName(value = MsgRequestRedemptionResponse.TYPE_URL)
public class MsgRequestRedemptionResponse() : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/injective.insurance.v1beta1.MsgRequestRedemptionResponse"
  }

  public object KotlinxSerializer : KSerializer<MsgRequestRedemptionResponse> {
    private val delegator: KSerializer<MsgRequestRedemptionResponse> =
        MsgRequestRedemptionResponse.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: MsgRequestRedemptionResponse): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(MsgRequestRedemptionResponseConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): MsgRequestRedemptionResponse {
      if (decoder is ProtobufMapperDecoder) {
        return MsgRequestRedemptionResponseConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = MsgUpdateParams.KotlinxSerializer::class)
@SerialName(value = MsgUpdateParams.TYPE_URL)
public data class MsgUpdateParams(
  @ProtobufIndex(index = 1)
  public val authority: String,
  @ProtobufIndex(index = 2)
  public val params: Params,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/injective.insurance.v1beta1.MsgUpdateParams"
  }

  public object KotlinxSerializer : KSerializer<MsgUpdateParams> {
    private val delegator: KSerializer<MsgUpdateParams> = MsgUpdateParams.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: MsgUpdateParams): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(MsgUpdateParamsConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): MsgUpdateParams {
      if (decoder is ProtobufMapperDecoder) {
        return MsgUpdateParamsConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = MsgUpdateParamsResponse.KotlinxSerializer::class)
@SerialName(value = MsgUpdateParamsResponse.TYPE_URL)
public class MsgUpdateParamsResponse() : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/injective.insurance.v1beta1.MsgUpdateParamsResponse"
  }

  public object KotlinxSerializer : KSerializer<MsgUpdateParamsResponse> {
    private val delegator: KSerializer<MsgUpdateParamsResponse> =
        MsgUpdateParamsResponse.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: MsgUpdateParamsResponse): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(MsgUpdateParamsResponseConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): MsgUpdateParamsResponse {
      if (decoder is ProtobufMapperDecoder) {
        return MsgUpdateParamsResponseConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}
