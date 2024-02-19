// Transform from injective/ocr/v1beta1/tx.proto
@file:ProtobufSyntax(syntax = "PROTO3")
@file:GeneratorVersion(version = "0.3.1")

package injective.ocr.v1beta1

import cosmos.base.v1beta1.Coin
import kotlin.ByteArray
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

@Serializable(with = MsgCreateFeed.KotlinxSerializer::class)
@SerialName(value = MsgCreateFeed.TYPE_URL)
public data class MsgCreateFeed(
  @ProtobufIndex(index = 1)
  public val sender: String,
  @ProtobufIndex(index = 2)
  public val config: FeedConfig,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/injective.ocr.v1beta1.MsgCreateFeed"
  }

  public object KotlinxSerializer : KSerializer<MsgCreateFeed> {
    private val delegator: KSerializer<MsgCreateFeed> = MsgCreateFeed.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: MsgCreateFeed): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(MsgCreateFeedConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): MsgCreateFeed {
      if (decoder is ProtobufMapperDecoder) {
        return MsgCreateFeedConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = MsgCreateFeedResponse.KotlinxSerializer::class)
@SerialName(value = MsgCreateFeedResponse.TYPE_URL)
public class MsgCreateFeedResponse() : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/injective.ocr.v1beta1.MsgCreateFeedResponse"
  }

  public object KotlinxSerializer : KSerializer<MsgCreateFeedResponse> {
    private val delegator: KSerializer<MsgCreateFeedResponse> = MsgCreateFeedResponse.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: MsgCreateFeedResponse): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(MsgCreateFeedResponseConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): MsgCreateFeedResponse {
      if (decoder is ProtobufMapperDecoder) {
        return MsgCreateFeedResponseConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = MsgUpdateFeed.KotlinxSerializer::class)
@SerialName(value = MsgUpdateFeed.TYPE_URL)
public data class MsgUpdateFeed(
  @ProtobufIndex(index = 1)
  public val sender: String,
  @ProtobufIndex(index = 2)
  public val feedId: String,
  @ProtobufIndex(index = 3)
  public val signers: List<String>,
  @ProtobufIndex(index = 4)
  public val transmitters: List<String>,
  @ProtobufIndex(index = 5)
  public val linkPerObservation: String,
  @ProtobufIndex(index = 6)
  public val linkPerTransmission: String,
  @ProtobufIndex(index = 7)
  public val linkDenom: String,
  @ProtobufIndex(index = 8)
  public val feedAdmin: String,
  @ProtobufIndex(index = 9)
  public val billingAdmin: String,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/injective.ocr.v1beta1.MsgUpdateFeed"
  }

  public object KotlinxSerializer : KSerializer<MsgUpdateFeed> {
    private val delegator: KSerializer<MsgUpdateFeed> = MsgUpdateFeed.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: MsgUpdateFeed): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(MsgUpdateFeedConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): MsgUpdateFeed {
      if (decoder is ProtobufMapperDecoder) {
        return MsgUpdateFeedConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = MsgUpdateFeedResponse.KotlinxSerializer::class)
@SerialName(value = MsgUpdateFeedResponse.TYPE_URL)
public class MsgUpdateFeedResponse() : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/injective.ocr.v1beta1.MsgUpdateFeedResponse"
  }

  public object KotlinxSerializer : KSerializer<MsgUpdateFeedResponse> {
    private val delegator: KSerializer<MsgUpdateFeedResponse> = MsgUpdateFeedResponse.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: MsgUpdateFeedResponse): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(MsgUpdateFeedResponseConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): MsgUpdateFeedResponse {
      if (decoder is ProtobufMapperDecoder) {
        return MsgUpdateFeedResponseConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = MsgTransmit.KotlinxSerializer::class)
@SerialName(value = MsgTransmit.TYPE_URL)
public data class MsgTransmit(
  @ProtobufIndex(index = 1)
  public val transmitter: String,
  @ProtobufIndex(index = 2)
  public val configDigest: ByteArray,
  @ProtobufIndex(index = 3)
  public val feedId: String,
  @ProtobufIndex(index = 4)
  public val epoch: ULong,
  @ProtobufIndex(index = 5)
  public val round: ULong,
  @ProtobufIndex(index = 6)
  public val extraHash: ByteArray,
  @ProtobufIndex(index = 7)
  public val report: Report,
  @ProtobufIndex(index = 8)
  public val signatures: List<ByteArray>,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/injective.ocr.v1beta1.MsgTransmit"
  }

  public object KotlinxSerializer : KSerializer<MsgTransmit> {
    private val delegator: KSerializer<MsgTransmit> = MsgTransmit.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: MsgTransmit): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(MsgTransmitConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): MsgTransmit {
      if (decoder is ProtobufMapperDecoder) {
        return MsgTransmitConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = MsgTransmitResponse.KotlinxSerializer::class)
@SerialName(value = MsgTransmitResponse.TYPE_URL)
public class MsgTransmitResponse() : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/injective.ocr.v1beta1.MsgTransmitResponse"
  }

  public object KotlinxSerializer : KSerializer<MsgTransmitResponse> {
    private val delegator: KSerializer<MsgTransmitResponse> = MsgTransmitResponse.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: MsgTransmitResponse): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(MsgTransmitResponseConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): MsgTransmitResponse {
      if (decoder is ProtobufMapperDecoder) {
        return MsgTransmitResponseConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = MsgFundFeedRewardPool.KotlinxSerializer::class)
@SerialName(value = MsgFundFeedRewardPool.TYPE_URL)
public data class MsgFundFeedRewardPool(
  @ProtobufIndex(index = 1)
  public val sender: String,
  @ProtobufIndex(index = 2)
  public val feedId: String,
  @ProtobufIndex(index = 3)
  public val amount: Coin,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/injective.ocr.v1beta1.MsgFundFeedRewardPool"
  }

  public object KotlinxSerializer : KSerializer<MsgFundFeedRewardPool> {
    private val delegator: KSerializer<MsgFundFeedRewardPool> = MsgFundFeedRewardPool.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: MsgFundFeedRewardPool): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(MsgFundFeedRewardPoolConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): MsgFundFeedRewardPool {
      if (decoder is ProtobufMapperDecoder) {
        return MsgFundFeedRewardPoolConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = MsgFundFeedRewardPoolResponse.KotlinxSerializer::class)
@SerialName(value = MsgFundFeedRewardPoolResponse.TYPE_URL)
public class MsgFundFeedRewardPoolResponse() : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/injective.ocr.v1beta1.MsgFundFeedRewardPoolResponse"
  }

  public object KotlinxSerializer : KSerializer<MsgFundFeedRewardPoolResponse> {
    private val delegator: KSerializer<MsgFundFeedRewardPoolResponse> =
        MsgFundFeedRewardPoolResponse.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: MsgFundFeedRewardPoolResponse): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(MsgFundFeedRewardPoolResponseConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): MsgFundFeedRewardPoolResponse {
      if (decoder is ProtobufMapperDecoder) {
        return MsgFundFeedRewardPoolResponseConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = MsgWithdrawFeedRewardPool.KotlinxSerializer::class)
@SerialName(value = MsgWithdrawFeedRewardPool.TYPE_URL)
public data class MsgWithdrawFeedRewardPool(
  @ProtobufIndex(index = 1)
  public val sender: String,
  @ProtobufIndex(index = 2)
  public val feedId: String,
  @ProtobufIndex(index = 3)
  public val amount: Coin,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/injective.ocr.v1beta1.MsgWithdrawFeedRewardPool"
  }

  public object KotlinxSerializer : KSerializer<MsgWithdrawFeedRewardPool> {
    private val delegator: KSerializer<MsgWithdrawFeedRewardPool> =
        MsgWithdrawFeedRewardPool.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: MsgWithdrawFeedRewardPool): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(MsgWithdrawFeedRewardPoolConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): MsgWithdrawFeedRewardPool {
      if (decoder is ProtobufMapperDecoder) {
        return MsgWithdrawFeedRewardPoolConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = MsgWithdrawFeedRewardPoolResponse.KotlinxSerializer::class)
@SerialName(value = MsgWithdrawFeedRewardPoolResponse.TYPE_URL)
public class MsgWithdrawFeedRewardPoolResponse() : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/injective.ocr.v1beta1.MsgWithdrawFeedRewardPoolResponse"
  }

  public object KotlinxSerializer : KSerializer<MsgWithdrawFeedRewardPoolResponse> {
    private val delegator: KSerializer<MsgWithdrawFeedRewardPoolResponse> =
        MsgWithdrawFeedRewardPoolResponse.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: MsgWithdrawFeedRewardPoolResponse):
        Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(MsgWithdrawFeedRewardPoolResponseConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): MsgWithdrawFeedRewardPoolResponse {
      if (decoder is ProtobufMapperDecoder) {
        return MsgWithdrawFeedRewardPoolResponseConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = MsgSetPayees.KotlinxSerializer::class)
@SerialName(value = MsgSetPayees.TYPE_URL)
public data class MsgSetPayees(
  @ProtobufIndex(index = 1)
  public val sender: String,
  @ProtobufIndex(index = 2)
  public val feedId: String,
  @ProtobufIndex(index = 3)
  public val transmitters: List<String>,
  @ProtobufIndex(index = 4)
  public val payees: List<String>,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/injective.ocr.v1beta1.MsgSetPayees"
  }

  public object KotlinxSerializer : KSerializer<MsgSetPayees> {
    private val delegator: KSerializer<MsgSetPayees> = MsgSetPayees.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: MsgSetPayees): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(MsgSetPayeesConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): MsgSetPayees {
      if (decoder is ProtobufMapperDecoder) {
        return MsgSetPayeesConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = MsgSetPayeesResponse.KotlinxSerializer::class)
@SerialName(value = MsgSetPayeesResponse.TYPE_URL)
public class MsgSetPayeesResponse() : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/injective.ocr.v1beta1.MsgSetPayeesResponse"
  }

  public object KotlinxSerializer : KSerializer<MsgSetPayeesResponse> {
    private val delegator: KSerializer<MsgSetPayeesResponse> = MsgSetPayeesResponse.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: MsgSetPayeesResponse): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(MsgSetPayeesResponseConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): MsgSetPayeesResponse {
      if (decoder is ProtobufMapperDecoder) {
        return MsgSetPayeesResponseConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = MsgTransferPayeeship.KotlinxSerializer::class)
@SerialName(value = MsgTransferPayeeship.TYPE_URL)
public data class MsgTransferPayeeship(
  @ProtobufIndex(index = 1)
  public val sender: String,
  @ProtobufIndex(index = 2)
  public val transmitter: String,
  @ProtobufIndex(index = 3)
  public val feedId: String,
  @ProtobufIndex(index = 4)
  public val proposed: String,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/injective.ocr.v1beta1.MsgTransferPayeeship"
  }

  public object KotlinxSerializer : KSerializer<MsgTransferPayeeship> {
    private val delegator: KSerializer<MsgTransferPayeeship> = MsgTransferPayeeship.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: MsgTransferPayeeship): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(MsgTransferPayeeshipConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): MsgTransferPayeeship {
      if (decoder is ProtobufMapperDecoder) {
        return MsgTransferPayeeshipConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = MsgTransferPayeeshipResponse.KotlinxSerializer::class)
@SerialName(value = MsgTransferPayeeshipResponse.TYPE_URL)
public class MsgTransferPayeeshipResponse() : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/injective.ocr.v1beta1.MsgTransferPayeeshipResponse"
  }

  public object KotlinxSerializer : KSerializer<MsgTransferPayeeshipResponse> {
    private val delegator: KSerializer<MsgTransferPayeeshipResponse> =
        MsgTransferPayeeshipResponse.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: MsgTransferPayeeshipResponse): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(MsgTransferPayeeshipResponseConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): MsgTransferPayeeshipResponse {
      if (decoder is ProtobufMapperDecoder) {
        return MsgTransferPayeeshipResponseConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = MsgAcceptPayeeship.KotlinxSerializer::class)
@SerialName(value = MsgAcceptPayeeship.TYPE_URL)
public data class MsgAcceptPayeeship(
  @ProtobufIndex(index = 1)
  public val payee: String,
  @ProtobufIndex(index = 2)
  public val transmitter: String,
  @ProtobufIndex(index = 3)
  public val feedId: String,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/injective.ocr.v1beta1.MsgAcceptPayeeship"
  }

  public object KotlinxSerializer : KSerializer<MsgAcceptPayeeship> {
    private val delegator: KSerializer<MsgAcceptPayeeship> = MsgAcceptPayeeship.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: MsgAcceptPayeeship): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(MsgAcceptPayeeshipConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): MsgAcceptPayeeship {
      if (decoder is ProtobufMapperDecoder) {
        return MsgAcceptPayeeshipConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = MsgAcceptPayeeshipResponse.KotlinxSerializer::class)
@SerialName(value = MsgAcceptPayeeshipResponse.TYPE_URL)
public class MsgAcceptPayeeshipResponse() : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/injective.ocr.v1beta1.MsgAcceptPayeeshipResponse"
  }

  public object KotlinxSerializer : KSerializer<MsgAcceptPayeeshipResponse> {
    private val delegator: KSerializer<MsgAcceptPayeeshipResponse> =
        MsgAcceptPayeeshipResponse.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: MsgAcceptPayeeshipResponse): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(MsgAcceptPayeeshipResponseConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): MsgAcceptPayeeshipResponse {
      if (decoder is ProtobufMapperDecoder) {
        return MsgAcceptPayeeshipResponseConverter.deserialize(decoder.decodeByteArray())
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
    public const val TYPE_URL: String = "/injective.ocr.v1beta1.MsgUpdateParams"
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
    public const val TYPE_URL: String = "/injective.ocr.v1beta1.MsgUpdateParamsResponse"
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
