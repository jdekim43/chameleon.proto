// Transform from injective/exchange/v1beta1/tx.proto
@file:ProtobufSyntax(syntax = "PROTO3")
@file:GeneratorVersion(version = "0.3.1")

package injective.exchange.v1beta1

import cosmos.base.v1beta1.Coin
import injective.oracle.v1beta1.OracleType
import kotlin.Boolean
import kotlin.ByteArray
import kotlin.Int
import kotlin.Long
import kotlin.String
import kotlin.UInt
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

@Serializable(with = MsgUpdateParams.KotlinxSerializer::class)
@SerialName(value = MsgUpdateParams.TYPE_URL)
public data class MsgUpdateParams(
  @ProtobufIndex(index = 1)
  public val authority: String,
  @ProtobufIndex(index = 2)
  public val params: Params,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/injective.exchange.v1beta1.MsgUpdateParams"
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
    public const val TYPE_URL: String = "/injective.exchange.v1beta1.MsgUpdateParamsResponse"
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

@Serializable(with = MsgDeposit.KotlinxSerializer::class)
@SerialName(value = MsgDeposit.TYPE_URL)
public data class MsgDeposit(
  @ProtobufIndex(index = 1)
  public val sender: String,
  @ProtobufIndex(index = 2)
  public val subaccountId: String,
  @ProtobufIndex(index = 3)
  public val amount: Coin,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/injective.exchange.v1beta1.MsgDeposit"
  }

  public object KotlinxSerializer : KSerializer<MsgDeposit> {
    private val delegator: KSerializer<MsgDeposit> = MsgDeposit.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: MsgDeposit): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(MsgDepositConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): MsgDeposit {
      if (decoder is ProtobufMapperDecoder) {
        return MsgDepositConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = MsgDepositResponse.KotlinxSerializer::class)
@SerialName(value = MsgDepositResponse.TYPE_URL)
public class MsgDepositResponse() : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/injective.exchange.v1beta1.MsgDepositResponse"
  }

  public object KotlinxSerializer : KSerializer<MsgDepositResponse> {
    private val delegator: KSerializer<MsgDepositResponse> = MsgDepositResponse.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: MsgDepositResponse): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(MsgDepositResponseConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): MsgDepositResponse {
      if (decoder is ProtobufMapperDecoder) {
        return MsgDepositResponseConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = MsgWithdraw.KotlinxSerializer::class)
@SerialName(value = MsgWithdraw.TYPE_URL)
public data class MsgWithdraw(
  @ProtobufIndex(index = 1)
  public val sender: String,
  @ProtobufIndex(index = 2)
  public val subaccountId: String,
  @ProtobufIndex(index = 3)
  public val amount: Coin,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/injective.exchange.v1beta1.MsgWithdraw"
  }

  public object KotlinxSerializer : KSerializer<MsgWithdraw> {
    private val delegator: KSerializer<MsgWithdraw> = MsgWithdraw.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: MsgWithdraw): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(MsgWithdrawConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): MsgWithdraw {
      if (decoder is ProtobufMapperDecoder) {
        return MsgWithdrawConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = MsgWithdrawResponse.KotlinxSerializer::class)
@SerialName(value = MsgWithdrawResponse.TYPE_URL)
public class MsgWithdrawResponse() : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/injective.exchange.v1beta1.MsgWithdrawResponse"
  }

  public object KotlinxSerializer : KSerializer<MsgWithdrawResponse> {
    private val delegator: KSerializer<MsgWithdrawResponse> = MsgWithdrawResponse.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: MsgWithdrawResponse): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(MsgWithdrawResponseConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): MsgWithdrawResponse {
      if (decoder is ProtobufMapperDecoder) {
        return MsgWithdrawResponseConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = MsgCreateSpotLimitOrder.KotlinxSerializer::class)
@SerialName(value = MsgCreateSpotLimitOrder.TYPE_URL)
public data class MsgCreateSpotLimitOrder(
  @ProtobufIndex(index = 1)
  public val sender: String,
  @ProtobufIndex(index = 2)
  public val order: SpotOrder,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/injective.exchange.v1beta1.MsgCreateSpotLimitOrder"
  }

  public object KotlinxSerializer : KSerializer<MsgCreateSpotLimitOrder> {
    private val delegator: KSerializer<MsgCreateSpotLimitOrder> =
        MsgCreateSpotLimitOrder.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: MsgCreateSpotLimitOrder): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(MsgCreateSpotLimitOrderConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): MsgCreateSpotLimitOrder {
      if (decoder is ProtobufMapperDecoder) {
        return MsgCreateSpotLimitOrderConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = MsgCreateSpotLimitOrderResponse.KotlinxSerializer::class)
@SerialName(value = MsgCreateSpotLimitOrderResponse.TYPE_URL)
public data class MsgCreateSpotLimitOrderResponse(
  @ProtobufIndex(index = 1)
  public val orderHash: String,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String =
        "/injective.exchange.v1beta1.MsgCreateSpotLimitOrderResponse"
  }

  public object KotlinxSerializer : KSerializer<MsgCreateSpotLimitOrderResponse> {
    private val delegator: KSerializer<MsgCreateSpotLimitOrderResponse> =
        MsgCreateSpotLimitOrderResponse.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: MsgCreateSpotLimitOrderResponse):
        Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(MsgCreateSpotLimitOrderResponseConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): MsgCreateSpotLimitOrderResponse {
      if (decoder is ProtobufMapperDecoder) {
        return MsgCreateSpotLimitOrderResponseConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = MsgBatchCreateSpotLimitOrders.KotlinxSerializer::class)
@SerialName(value = MsgBatchCreateSpotLimitOrders.TYPE_URL)
public data class MsgBatchCreateSpotLimitOrders(
  @ProtobufIndex(index = 1)
  public val sender: String,
  @ProtobufIndex(index = 2)
  public val orders: List<SpotOrder>,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/injective.exchange.v1beta1.MsgBatchCreateSpotLimitOrders"
  }

  public object KotlinxSerializer : KSerializer<MsgBatchCreateSpotLimitOrders> {
    private val delegator: KSerializer<MsgBatchCreateSpotLimitOrders> =
        MsgBatchCreateSpotLimitOrders.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: MsgBatchCreateSpotLimitOrders): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(MsgBatchCreateSpotLimitOrdersConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): MsgBatchCreateSpotLimitOrders {
      if (decoder is ProtobufMapperDecoder) {
        return MsgBatchCreateSpotLimitOrdersConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = MsgBatchCreateSpotLimitOrdersResponse.KotlinxSerializer::class)
@SerialName(value = MsgBatchCreateSpotLimitOrdersResponse.TYPE_URL)
public data class MsgBatchCreateSpotLimitOrdersResponse(
  @ProtobufIndex(index = 1)
  public val orderHashes: List<String>,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String =
        "/injective.exchange.v1beta1.MsgBatchCreateSpotLimitOrdersResponse"
  }

  public object KotlinxSerializer : KSerializer<MsgBatchCreateSpotLimitOrdersResponse> {
    private val delegator: KSerializer<MsgBatchCreateSpotLimitOrdersResponse> =
        MsgBatchCreateSpotLimitOrdersResponse.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: MsgBatchCreateSpotLimitOrdersResponse):
        Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(MsgBatchCreateSpotLimitOrdersResponseConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): MsgBatchCreateSpotLimitOrdersResponse {
      if (decoder is ProtobufMapperDecoder) {
        return MsgBatchCreateSpotLimitOrdersResponseConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = MsgInstantSpotMarketLaunch.KotlinxSerializer::class)
@SerialName(value = MsgInstantSpotMarketLaunch.TYPE_URL)
public data class MsgInstantSpotMarketLaunch(
  @ProtobufIndex(index = 1)
  public val sender: String,
  @ProtobufIndex(index = 2)
  public val ticker: String,
  @ProtobufIndex(index = 3)
  public val baseDenom: String,
  @ProtobufIndex(index = 4)
  public val quoteDenom: String,
  @ProtobufIndex(index = 5)
  public val minPriceTickSize: String,
  @ProtobufIndex(index = 6)
  public val minQuantityTickSize: String,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/injective.exchange.v1beta1.MsgInstantSpotMarketLaunch"
  }

  public object KotlinxSerializer : KSerializer<MsgInstantSpotMarketLaunch> {
    private val delegator: KSerializer<MsgInstantSpotMarketLaunch> =
        MsgInstantSpotMarketLaunch.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: MsgInstantSpotMarketLaunch): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(MsgInstantSpotMarketLaunchConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): MsgInstantSpotMarketLaunch {
      if (decoder is ProtobufMapperDecoder) {
        return MsgInstantSpotMarketLaunchConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = MsgInstantSpotMarketLaunchResponse.KotlinxSerializer::class)
@SerialName(value = MsgInstantSpotMarketLaunchResponse.TYPE_URL)
public class MsgInstantSpotMarketLaunchResponse() : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String =
        "/injective.exchange.v1beta1.MsgInstantSpotMarketLaunchResponse"
  }

  public object KotlinxSerializer : KSerializer<MsgInstantSpotMarketLaunchResponse> {
    private val delegator: KSerializer<MsgInstantSpotMarketLaunchResponse> =
        MsgInstantSpotMarketLaunchResponse.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: MsgInstantSpotMarketLaunchResponse):
        Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(MsgInstantSpotMarketLaunchResponseConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): MsgInstantSpotMarketLaunchResponse {
      if (decoder is ProtobufMapperDecoder) {
        return MsgInstantSpotMarketLaunchResponseConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = MsgInstantPerpetualMarketLaunch.KotlinxSerializer::class)
@SerialName(value = MsgInstantPerpetualMarketLaunch.TYPE_URL)
public data class MsgInstantPerpetualMarketLaunch(
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
  public val oracleScaleFactor: UInt,
  @ProtobufIndex(index = 7)
  public val oracleType: OracleType,
  @ProtobufIndex(index = 8)
  public val makerFeeRate: String,
  @ProtobufIndex(index = 9)
  public val takerFeeRate: String,
  @ProtobufIndex(index = 10)
  public val initialMarginRatio: String,
  @ProtobufIndex(index = 11)
  public val maintenanceMarginRatio: String,
  @ProtobufIndex(index = 12)
  public val minPriceTickSize: String,
  @ProtobufIndex(index = 13)
  public val minQuantityTickSize: String,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String =
        "/injective.exchange.v1beta1.MsgInstantPerpetualMarketLaunch"
  }

  public object KotlinxSerializer : KSerializer<MsgInstantPerpetualMarketLaunch> {
    private val delegator: KSerializer<MsgInstantPerpetualMarketLaunch> =
        MsgInstantPerpetualMarketLaunch.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: MsgInstantPerpetualMarketLaunch):
        Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(MsgInstantPerpetualMarketLaunchConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): MsgInstantPerpetualMarketLaunch {
      if (decoder is ProtobufMapperDecoder) {
        return MsgInstantPerpetualMarketLaunchConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = MsgInstantPerpetualMarketLaunchResponse.KotlinxSerializer::class)
@SerialName(value = MsgInstantPerpetualMarketLaunchResponse.TYPE_URL)
public class MsgInstantPerpetualMarketLaunchResponse() : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String =
        "/injective.exchange.v1beta1.MsgInstantPerpetualMarketLaunchResponse"
  }

  public object KotlinxSerializer : KSerializer<MsgInstantPerpetualMarketLaunchResponse> {
    private val delegator: KSerializer<MsgInstantPerpetualMarketLaunchResponse> =
        MsgInstantPerpetualMarketLaunchResponse.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder,
        `value`: MsgInstantPerpetualMarketLaunchResponse): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(MsgInstantPerpetualMarketLaunchResponseConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): MsgInstantPerpetualMarketLaunchResponse {
      if (decoder is ProtobufMapperDecoder) {
        return MsgInstantPerpetualMarketLaunchResponseConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = MsgInstantBinaryOptionsMarketLaunch.KotlinxSerializer::class)
@SerialName(value = MsgInstantBinaryOptionsMarketLaunch.TYPE_URL)
public data class MsgInstantBinaryOptionsMarketLaunch(
  @ProtobufIndex(index = 1)
  public val sender: String,
  @ProtobufIndex(index = 2)
  public val ticker: String,
  @ProtobufIndex(index = 3)
  public val oracleSymbol: String,
  @ProtobufIndex(index = 4)
  public val oracleProvider: String,
  @ProtobufIndex(index = 5)
  public val oracleType: OracleType,
  @ProtobufIndex(index = 6)
  public val oracleScaleFactor: UInt,
  @ProtobufIndex(index = 7)
  public val makerFeeRate: String,
  @ProtobufIndex(index = 8)
  public val takerFeeRate: String,
  @ProtobufIndex(index = 9)
  public val expirationTimestamp: Long,
  @ProtobufIndex(index = 10)
  public val settlementTimestamp: Long,
  @ProtobufIndex(index = 11)
  public val admin: String,
  @ProtobufIndex(index = 12)
  public val quoteDenom: String,
  @ProtobufIndex(index = 13)
  public val minPriceTickSize: String,
  @ProtobufIndex(index = 14)
  public val minQuantityTickSize: String,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String =
        "/injective.exchange.v1beta1.MsgInstantBinaryOptionsMarketLaunch"
  }

  public object KotlinxSerializer : KSerializer<MsgInstantBinaryOptionsMarketLaunch> {
    private val delegator: KSerializer<MsgInstantBinaryOptionsMarketLaunch> =
        MsgInstantBinaryOptionsMarketLaunch.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: MsgInstantBinaryOptionsMarketLaunch):
        Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(MsgInstantBinaryOptionsMarketLaunchConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): MsgInstantBinaryOptionsMarketLaunch {
      if (decoder is ProtobufMapperDecoder) {
        return MsgInstantBinaryOptionsMarketLaunchConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = MsgInstantBinaryOptionsMarketLaunchResponse.KotlinxSerializer::class)
@SerialName(value = MsgInstantBinaryOptionsMarketLaunchResponse.TYPE_URL)
public class MsgInstantBinaryOptionsMarketLaunchResponse() : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String =
        "/injective.exchange.v1beta1.MsgInstantBinaryOptionsMarketLaunchResponse"
  }

  public object KotlinxSerializer : KSerializer<MsgInstantBinaryOptionsMarketLaunchResponse> {
    private val delegator: KSerializer<MsgInstantBinaryOptionsMarketLaunchResponse> =
        MsgInstantBinaryOptionsMarketLaunchResponse.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder,
        `value`: MsgInstantBinaryOptionsMarketLaunchResponse): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(MsgInstantBinaryOptionsMarketLaunchResponseConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): MsgInstantBinaryOptionsMarketLaunchResponse {
      if (decoder is ProtobufMapperDecoder) {
        return MsgInstantBinaryOptionsMarketLaunchResponseConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = MsgInstantExpiryFuturesMarketLaunch.KotlinxSerializer::class)
@SerialName(value = MsgInstantExpiryFuturesMarketLaunch.TYPE_URL)
public data class MsgInstantExpiryFuturesMarketLaunch(
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
  public val oracleScaleFactor: UInt,
  @ProtobufIndex(index = 8)
  public val expiry: Long,
  @ProtobufIndex(index = 9)
  public val makerFeeRate: String,
  @ProtobufIndex(index = 10)
  public val takerFeeRate: String,
  @ProtobufIndex(index = 11)
  public val initialMarginRatio: String,
  @ProtobufIndex(index = 12)
  public val maintenanceMarginRatio: String,
  @ProtobufIndex(index = 13)
  public val minPriceTickSize: String,
  @ProtobufIndex(index = 14)
  public val minQuantityTickSize: String,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String =
        "/injective.exchange.v1beta1.MsgInstantExpiryFuturesMarketLaunch"
  }

  public object KotlinxSerializer : KSerializer<MsgInstantExpiryFuturesMarketLaunch> {
    private val delegator: KSerializer<MsgInstantExpiryFuturesMarketLaunch> =
        MsgInstantExpiryFuturesMarketLaunch.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: MsgInstantExpiryFuturesMarketLaunch):
        Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(MsgInstantExpiryFuturesMarketLaunchConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): MsgInstantExpiryFuturesMarketLaunch {
      if (decoder is ProtobufMapperDecoder) {
        return MsgInstantExpiryFuturesMarketLaunchConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = MsgInstantExpiryFuturesMarketLaunchResponse.KotlinxSerializer::class)
@SerialName(value = MsgInstantExpiryFuturesMarketLaunchResponse.TYPE_URL)
public class MsgInstantExpiryFuturesMarketLaunchResponse() : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String =
        "/injective.exchange.v1beta1.MsgInstantExpiryFuturesMarketLaunchResponse"
  }

  public object KotlinxSerializer : KSerializer<MsgInstantExpiryFuturesMarketLaunchResponse> {
    private val delegator: KSerializer<MsgInstantExpiryFuturesMarketLaunchResponse> =
        MsgInstantExpiryFuturesMarketLaunchResponse.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder,
        `value`: MsgInstantExpiryFuturesMarketLaunchResponse): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(MsgInstantExpiryFuturesMarketLaunchResponseConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): MsgInstantExpiryFuturesMarketLaunchResponse {
      if (decoder is ProtobufMapperDecoder) {
        return MsgInstantExpiryFuturesMarketLaunchResponseConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = MsgCreateSpotMarketOrder.KotlinxSerializer::class)
@SerialName(value = MsgCreateSpotMarketOrder.TYPE_URL)
public data class MsgCreateSpotMarketOrder(
  @ProtobufIndex(index = 1)
  public val sender: String,
  @ProtobufIndex(index = 2)
  public val order: SpotOrder,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/injective.exchange.v1beta1.MsgCreateSpotMarketOrder"
  }

  public object KotlinxSerializer : KSerializer<MsgCreateSpotMarketOrder> {
    private val delegator: KSerializer<MsgCreateSpotMarketOrder> =
        MsgCreateSpotMarketOrder.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: MsgCreateSpotMarketOrder): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(MsgCreateSpotMarketOrderConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): MsgCreateSpotMarketOrder {
      if (decoder is ProtobufMapperDecoder) {
        return MsgCreateSpotMarketOrderConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = MsgCreateSpotMarketOrderResponse.KotlinxSerializer::class)
@SerialName(value = MsgCreateSpotMarketOrderResponse.TYPE_URL)
public data class MsgCreateSpotMarketOrderResponse(
  @ProtobufIndex(index = 1)
  public val orderHash: String,
  @ProtobufIndex(index = 2)
  public val results: SpotMarketOrderResults,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String =
        "/injective.exchange.v1beta1.MsgCreateSpotMarketOrderResponse"
  }

  public object KotlinxSerializer : KSerializer<MsgCreateSpotMarketOrderResponse> {
    private val delegator: KSerializer<MsgCreateSpotMarketOrderResponse> =
        MsgCreateSpotMarketOrderResponse.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: MsgCreateSpotMarketOrderResponse):
        Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(MsgCreateSpotMarketOrderResponseConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): MsgCreateSpotMarketOrderResponse {
      if (decoder is ProtobufMapperDecoder) {
        return MsgCreateSpotMarketOrderResponseConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = SpotMarketOrderResults.KotlinxSerializer::class)
@SerialName(value = SpotMarketOrderResults.TYPE_URL)
public data class SpotMarketOrderResults(
  @ProtobufIndex(index = 1)
  public val quantity: String,
  @ProtobufIndex(index = 2)
  public val price: String,
  @ProtobufIndex(index = 3)
  public val fee: String,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/injective.exchange.v1beta1.SpotMarketOrderResults"
  }

  public object KotlinxSerializer : KSerializer<SpotMarketOrderResults> {
    private val delegator: KSerializer<SpotMarketOrderResults> = SpotMarketOrderResults.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: SpotMarketOrderResults): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(SpotMarketOrderResultsConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): SpotMarketOrderResults {
      if (decoder is ProtobufMapperDecoder) {
        return SpotMarketOrderResultsConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = MsgCreateDerivativeLimitOrder.KotlinxSerializer::class)
@SerialName(value = MsgCreateDerivativeLimitOrder.TYPE_URL)
public data class MsgCreateDerivativeLimitOrder(
  @ProtobufIndex(index = 1)
  public val sender: String,
  @ProtobufIndex(index = 2)
  public val order: DerivativeOrder,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/injective.exchange.v1beta1.MsgCreateDerivativeLimitOrder"
  }

  public object KotlinxSerializer : KSerializer<MsgCreateDerivativeLimitOrder> {
    private val delegator: KSerializer<MsgCreateDerivativeLimitOrder> =
        MsgCreateDerivativeLimitOrder.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: MsgCreateDerivativeLimitOrder): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(MsgCreateDerivativeLimitOrderConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): MsgCreateDerivativeLimitOrder {
      if (decoder is ProtobufMapperDecoder) {
        return MsgCreateDerivativeLimitOrderConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = MsgCreateDerivativeLimitOrderResponse.KotlinxSerializer::class)
@SerialName(value = MsgCreateDerivativeLimitOrderResponse.TYPE_URL)
public data class MsgCreateDerivativeLimitOrderResponse(
  @ProtobufIndex(index = 1)
  public val orderHash: String,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String =
        "/injective.exchange.v1beta1.MsgCreateDerivativeLimitOrderResponse"
  }

  public object KotlinxSerializer : KSerializer<MsgCreateDerivativeLimitOrderResponse> {
    private val delegator: KSerializer<MsgCreateDerivativeLimitOrderResponse> =
        MsgCreateDerivativeLimitOrderResponse.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: MsgCreateDerivativeLimitOrderResponse):
        Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(MsgCreateDerivativeLimitOrderResponseConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): MsgCreateDerivativeLimitOrderResponse {
      if (decoder is ProtobufMapperDecoder) {
        return MsgCreateDerivativeLimitOrderResponseConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = MsgCreateBinaryOptionsLimitOrder.KotlinxSerializer::class)
@SerialName(value = MsgCreateBinaryOptionsLimitOrder.TYPE_URL)
public data class MsgCreateBinaryOptionsLimitOrder(
  @ProtobufIndex(index = 1)
  public val sender: String,
  @ProtobufIndex(index = 2)
  public val order: DerivativeOrder,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String =
        "/injective.exchange.v1beta1.MsgCreateBinaryOptionsLimitOrder"
  }

  public object KotlinxSerializer : KSerializer<MsgCreateBinaryOptionsLimitOrder> {
    private val delegator: KSerializer<MsgCreateBinaryOptionsLimitOrder> =
        MsgCreateBinaryOptionsLimitOrder.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: MsgCreateBinaryOptionsLimitOrder):
        Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(MsgCreateBinaryOptionsLimitOrderConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): MsgCreateBinaryOptionsLimitOrder {
      if (decoder is ProtobufMapperDecoder) {
        return MsgCreateBinaryOptionsLimitOrderConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = MsgCreateBinaryOptionsLimitOrderResponse.KotlinxSerializer::class)
@SerialName(value = MsgCreateBinaryOptionsLimitOrderResponse.TYPE_URL)
public data class MsgCreateBinaryOptionsLimitOrderResponse(
  @ProtobufIndex(index = 1)
  public val orderHash: String,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String =
        "/injective.exchange.v1beta1.MsgCreateBinaryOptionsLimitOrderResponse"
  }

  public object KotlinxSerializer : KSerializer<MsgCreateBinaryOptionsLimitOrderResponse> {
    private val delegator: KSerializer<MsgCreateBinaryOptionsLimitOrderResponse> =
        MsgCreateBinaryOptionsLimitOrderResponse.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder,
        `value`: MsgCreateBinaryOptionsLimitOrderResponse): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(MsgCreateBinaryOptionsLimitOrderResponseConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): MsgCreateBinaryOptionsLimitOrderResponse {
      if (decoder is ProtobufMapperDecoder) {
        return MsgCreateBinaryOptionsLimitOrderResponseConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = MsgBatchCreateDerivativeLimitOrders.KotlinxSerializer::class)
@SerialName(value = MsgBatchCreateDerivativeLimitOrders.TYPE_URL)
public data class MsgBatchCreateDerivativeLimitOrders(
  @ProtobufIndex(index = 1)
  public val sender: String,
  @ProtobufIndex(index = 2)
  public val orders: List<DerivativeOrder>,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String =
        "/injective.exchange.v1beta1.MsgBatchCreateDerivativeLimitOrders"
  }

  public object KotlinxSerializer : KSerializer<MsgBatchCreateDerivativeLimitOrders> {
    private val delegator: KSerializer<MsgBatchCreateDerivativeLimitOrders> =
        MsgBatchCreateDerivativeLimitOrders.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: MsgBatchCreateDerivativeLimitOrders):
        Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(MsgBatchCreateDerivativeLimitOrdersConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): MsgBatchCreateDerivativeLimitOrders {
      if (decoder is ProtobufMapperDecoder) {
        return MsgBatchCreateDerivativeLimitOrdersConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = MsgBatchCreateDerivativeLimitOrdersResponse.KotlinxSerializer::class)
@SerialName(value = MsgBatchCreateDerivativeLimitOrdersResponse.TYPE_URL)
public data class MsgBatchCreateDerivativeLimitOrdersResponse(
  @ProtobufIndex(index = 1)
  public val orderHashes: List<String>,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String =
        "/injective.exchange.v1beta1.MsgBatchCreateDerivativeLimitOrdersResponse"
  }

  public object KotlinxSerializer : KSerializer<MsgBatchCreateDerivativeLimitOrdersResponse> {
    private val delegator: KSerializer<MsgBatchCreateDerivativeLimitOrdersResponse> =
        MsgBatchCreateDerivativeLimitOrdersResponse.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder,
        `value`: MsgBatchCreateDerivativeLimitOrdersResponse): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(MsgBatchCreateDerivativeLimitOrdersResponseConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): MsgBatchCreateDerivativeLimitOrdersResponse {
      if (decoder is ProtobufMapperDecoder) {
        return MsgBatchCreateDerivativeLimitOrdersResponseConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = MsgCancelSpotOrder.KotlinxSerializer::class)
@SerialName(value = MsgCancelSpotOrder.TYPE_URL)
public data class MsgCancelSpotOrder(
  @ProtobufIndex(index = 1)
  public val sender: String,
  @ProtobufIndex(index = 2)
  public val marketId: String,
  @ProtobufIndex(index = 3)
  public val subaccountId: String,
  @ProtobufIndex(index = 4)
  public val orderHash: String,
  @ProtobufIndex(index = 5)
  public val cid: String,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/injective.exchange.v1beta1.MsgCancelSpotOrder"
  }

  public object KotlinxSerializer : KSerializer<MsgCancelSpotOrder> {
    private val delegator: KSerializer<MsgCancelSpotOrder> = MsgCancelSpotOrder.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: MsgCancelSpotOrder): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(MsgCancelSpotOrderConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): MsgCancelSpotOrder {
      if (decoder is ProtobufMapperDecoder) {
        return MsgCancelSpotOrderConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = MsgCancelSpotOrderResponse.KotlinxSerializer::class)
@SerialName(value = MsgCancelSpotOrderResponse.TYPE_URL)
public class MsgCancelSpotOrderResponse() : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/injective.exchange.v1beta1.MsgCancelSpotOrderResponse"
  }

  public object KotlinxSerializer : KSerializer<MsgCancelSpotOrderResponse> {
    private val delegator: KSerializer<MsgCancelSpotOrderResponse> =
        MsgCancelSpotOrderResponse.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: MsgCancelSpotOrderResponse): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(MsgCancelSpotOrderResponseConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): MsgCancelSpotOrderResponse {
      if (decoder is ProtobufMapperDecoder) {
        return MsgCancelSpotOrderResponseConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = MsgBatchCancelSpotOrders.KotlinxSerializer::class)
@SerialName(value = MsgBatchCancelSpotOrders.TYPE_URL)
public data class MsgBatchCancelSpotOrders(
  @ProtobufIndex(index = 1)
  public val sender: String,
  @ProtobufIndex(index = 2)
  public val `data`: List<OrderData>,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/injective.exchange.v1beta1.MsgBatchCancelSpotOrders"
  }

  public object KotlinxSerializer : KSerializer<MsgBatchCancelSpotOrders> {
    private val delegator: KSerializer<MsgBatchCancelSpotOrders> =
        MsgBatchCancelSpotOrders.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: MsgBatchCancelSpotOrders): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(MsgBatchCancelSpotOrdersConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): MsgBatchCancelSpotOrders {
      if (decoder is ProtobufMapperDecoder) {
        return MsgBatchCancelSpotOrdersConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = MsgBatchCancelSpotOrdersResponse.KotlinxSerializer::class)
@SerialName(value = MsgBatchCancelSpotOrdersResponse.TYPE_URL)
public data class MsgBatchCancelSpotOrdersResponse(
  @ProtobufIndex(index = 1)
  public val success: List<Boolean>,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String =
        "/injective.exchange.v1beta1.MsgBatchCancelSpotOrdersResponse"
  }

  public object KotlinxSerializer : KSerializer<MsgBatchCancelSpotOrdersResponse> {
    private val delegator: KSerializer<MsgBatchCancelSpotOrdersResponse> =
        MsgBatchCancelSpotOrdersResponse.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: MsgBatchCancelSpotOrdersResponse):
        Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(MsgBatchCancelSpotOrdersResponseConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): MsgBatchCancelSpotOrdersResponse {
      if (decoder is ProtobufMapperDecoder) {
        return MsgBatchCancelSpotOrdersResponseConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = MsgBatchCancelBinaryOptionsOrders.KotlinxSerializer::class)
@SerialName(value = MsgBatchCancelBinaryOptionsOrders.TYPE_URL)
public data class MsgBatchCancelBinaryOptionsOrders(
  @ProtobufIndex(index = 1)
  public val sender: String,
  @ProtobufIndex(index = 2)
  public val `data`: List<OrderData>,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String =
        "/injective.exchange.v1beta1.MsgBatchCancelBinaryOptionsOrders"
  }

  public object KotlinxSerializer : KSerializer<MsgBatchCancelBinaryOptionsOrders> {
    private val delegator: KSerializer<MsgBatchCancelBinaryOptionsOrders> =
        MsgBatchCancelBinaryOptionsOrders.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: MsgBatchCancelBinaryOptionsOrders):
        Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(MsgBatchCancelBinaryOptionsOrdersConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): MsgBatchCancelBinaryOptionsOrders {
      if (decoder is ProtobufMapperDecoder) {
        return MsgBatchCancelBinaryOptionsOrdersConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = MsgBatchCancelBinaryOptionsOrdersResponse.KotlinxSerializer::class)
@SerialName(value = MsgBatchCancelBinaryOptionsOrdersResponse.TYPE_URL)
public data class MsgBatchCancelBinaryOptionsOrdersResponse(
  @ProtobufIndex(index = 1)
  public val success: List<Boolean>,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String =
        "/injective.exchange.v1beta1.MsgBatchCancelBinaryOptionsOrdersResponse"
  }

  public object KotlinxSerializer : KSerializer<MsgBatchCancelBinaryOptionsOrdersResponse> {
    private val delegator: KSerializer<MsgBatchCancelBinaryOptionsOrdersResponse> =
        MsgBatchCancelBinaryOptionsOrdersResponse.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder,
        `value`: MsgBatchCancelBinaryOptionsOrdersResponse): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(MsgBatchCancelBinaryOptionsOrdersResponseConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): MsgBatchCancelBinaryOptionsOrdersResponse {
      if (decoder is ProtobufMapperDecoder) {
        return MsgBatchCancelBinaryOptionsOrdersResponseConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = MsgBatchUpdateOrders.KotlinxSerializer::class)
@SerialName(value = MsgBatchUpdateOrders.TYPE_URL)
public data class MsgBatchUpdateOrders(
  @ProtobufIndex(index = 1)
  public val sender: String,
  @ProtobufIndex(index = 2)
  public val subaccountId: String,
  @ProtobufIndex(index = 3)
  public val spotMarketIdsToCancelAll: List<String>,
  @ProtobufIndex(index = 4)
  public val derivativeMarketIdsToCancelAll: List<String>,
  @ProtobufIndex(index = 5)
  public val spotOrdersToCancel: List<OrderData>,
  @ProtobufIndex(index = 6)
  public val derivativeOrdersToCancel: List<OrderData>,
  @ProtobufIndex(index = 7)
  public val spotOrdersToCreate: List<SpotOrder>,
  @ProtobufIndex(index = 8)
  public val derivativeOrdersToCreate: List<DerivativeOrder>,
  @ProtobufIndex(index = 9)
  public val binaryOptionsOrdersToCancel: List<OrderData>,
  @ProtobufIndex(index = 10)
  public val binaryOptionsMarketIdsToCancelAll: List<String>,
  @ProtobufIndex(index = 11)
  public val binaryOptionsOrdersToCreate: List<DerivativeOrder>,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/injective.exchange.v1beta1.MsgBatchUpdateOrders"
  }

  public object KotlinxSerializer : KSerializer<MsgBatchUpdateOrders> {
    private val delegator: KSerializer<MsgBatchUpdateOrders> = MsgBatchUpdateOrders.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: MsgBatchUpdateOrders): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(MsgBatchUpdateOrdersConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): MsgBatchUpdateOrders {
      if (decoder is ProtobufMapperDecoder) {
        return MsgBatchUpdateOrdersConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = MsgBatchUpdateOrdersResponse.KotlinxSerializer::class)
@SerialName(value = MsgBatchUpdateOrdersResponse.TYPE_URL)
public data class MsgBatchUpdateOrdersResponse(
  @ProtobufIndex(index = 1)
  public val spotCancelSuccess: List<Boolean>,
  @ProtobufIndex(index = 2)
  public val derivativeCancelSuccess: List<Boolean>,
  @ProtobufIndex(index = 3)
  public val spotOrderHashes: List<String>,
  @ProtobufIndex(index = 4)
  public val derivativeOrderHashes: List<String>,
  @ProtobufIndex(index = 5)
  public val binaryOptionsCancelSuccess: List<Boolean>,
  @ProtobufIndex(index = 6)
  public val binaryOptionsOrderHashes: List<String>,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/injective.exchange.v1beta1.MsgBatchUpdateOrdersResponse"
  }

  public object KotlinxSerializer : KSerializer<MsgBatchUpdateOrdersResponse> {
    private val delegator: KSerializer<MsgBatchUpdateOrdersResponse> =
        MsgBatchUpdateOrdersResponse.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: MsgBatchUpdateOrdersResponse): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(MsgBatchUpdateOrdersResponseConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): MsgBatchUpdateOrdersResponse {
      if (decoder is ProtobufMapperDecoder) {
        return MsgBatchUpdateOrdersResponseConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = MsgCreateDerivativeMarketOrder.KotlinxSerializer::class)
@SerialName(value = MsgCreateDerivativeMarketOrder.TYPE_URL)
public data class MsgCreateDerivativeMarketOrder(
  @ProtobufIndex(index = 1)
  public val sender: String,
  @ProtobufIndex(index = 2)
  public val order: DerivativeOrder,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/injective.exchange.v1beta1.MsgCreateDerivativeMarketOrder"
  }

  public object KotlinxSerializer : KSerializer<MsgCreateDerivativeMarketOrder> {
    private val delegator: KSerializer<MsgCreateDerivativeMarketOrder> =
        MsgCreateDerivativeMarketOrder.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: MsgCreateDerivativeMarketOrder): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(MsgCreateDerivativeMarketOrderConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): MsgCreateDerivativeMarketOrder {
      if (decoder is ProtobufMapperDecoder) {
        return MsgCreateDerivativeMarketOrderConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = MsgCreateDerivativeMarketOrderResponse.KotlinxSerializer::class)
@SerialName(value = MsgCreateDerivativeMarketOrderResponse.TYPE_URL)
public data class MsgCreateDerivativeMarketOrderResponse(
  @ProtobufIndex(index = 1)
  public val orderHash: String,
  @ProtobufIndex(index = 2)
  public val results: DerivativeMarketOrderResults,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String =
        "/injective.exchange.v1beta1.MsgCreateDerivativeMarketOrderResponse"
  }

  public object KotlinxSerializer : KSerializer<MsgCreateDerivativeMarketOrderResponse> {
    private val delegator: KSerializer<MsgCreateDerivativeMarketOrderResponse> =
        MsgCreateDerivativeMarketOrderResponse.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder,
        `value`: MsgCreateDerivativeMarketOrderResponse): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(MsgCreateDerivativeMarketOrderResponseConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): MsgCreateDerivativeMarketOrderResponse {
      if (decoder is ProtobufMapperDecoder) {
        return MsgCreateDerivativeMarketOrderResponseConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = DerivativeMarketOrderResults.KotlinxSerializer::class)
@SerialName(value = DerivativeMarketOrderResults.TYPE_URL)
public data class DerivativeMarketOrderResults(
  @ProtobufIndex(index = 1)
  public val quantity: String,
  @ProtobufIndex(index = 2)
  public val price: String,
  @ProtobufIndex(index = 3)
  public val fee: String,
  @ProtobufIndex(index = 4)
  public val positionDelta: PositionDelta,
  @ProtobufIndex(index = 5)
  public val payout: String,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/injective.exchange.v1beta1.DerivativeMarketOrderResults"
  }

  public object KotlinxSerializer : KSerializer<DerivativeMarketOrderResults> {
    private val delegator: KSerializer<DerivativeMarketOrderResults> =
        DerivativeMarketOrderResults.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: DerivativeMarketOrderResults): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(DerivativeMarketOrderResultsConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): DerivativeMarketOrderResults {
      if (decoder is ProtobufMapperDecoder) {
        return DerivativeMarketOrderResultsConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = MsgCreateBinaryOptionsMarketOrder.KotlinxSerializer::class)
@SerialName(value = MsgCreateBinaryOptionsMarketOrder.TYPE_URL)
public data class MsgCreateBinaryOptionsMarketOrder(
  @ProtobufIndex(index = 1)
  public val sender: String,
  @ProtobufIndex(index = 2)
  public val order: DerivativeOrder,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String =
        "/injective.exchange.v1beta1.MsgCreateBinaryOptionsMarketOrder"
  }

  public object KotlinxSerializer : KSerializer<MsgCreateBinaryOptionsMarketOrder> {
    private val delegator: KSerializer<MsgCreateBinaryOptionsMarketOrder> =
        MsgCreateBinaryOptionsMarketOrder.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: MsgCreateBinaryOptionsMarketOrder):
        Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(MsgCreateBinaryOptionsMarketOrderConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): MsgCreateBinaryOptionsMarketOrder {
      if (decoder is ProtobufMapperDecoder) {
        return MsgCreateBinaryOptionsMarketOrderConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = MsgCreateBinaryOptionsMarketOrderResponse.KotlinxSerializer::class)
@SerialName(value = MsgCreateBinaryOptionsMarketOrderResponse.TYPE_URL)
public data class MsgCreateBinaryOptionsMarketOrderResponse(
  @ProtobufIndex(index = 1)
  public val orderHash: String,
  @ProtobufIndex(index = 2)
  public val results: DerivativeMarketOrderResults,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String =
        "/injective.exchange.v1beta1.MsgCreateBinaryOptionsMarketOrderResponse"
  }

  public object KotlinxSerializer : KSerializer<MsgCreateBinaryOptionsMarketOrderResponse> {
    private val delegator: KSerializer<MsgCreateBinaryOptionsMarketOrderResponse> =
        MsgCreateBinaryOptionsMarketOrderResponse.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder,
        `value`: MsgCreateBinaryOptionsMarketOrderResponse): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(MsgCreateBinaryOptionsMarketOrderResponseConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): MsgCreateBinaryOptionsMarketOrderResponse {
      if (decoder is ProtobufMapperDecoder) {
        return MsgCreateBinaryOptionsMarketOrderResponseConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = MsgCancelDerivativeOrder.KotlinxSerializer::class)
@SerialName(value = MsgCancelDerivativeOrder.TYPE_URL)
public data class MsgCancelDerivativeOrder(
  @ProtobufIndex(index = 1)
  public val sender: String,
  @ProtobufIndex(index = 2)
  public val marketId: String,
  @ProtobufIndex(index = 3)
  public val subaccountId: String,
  @ProtobufIndex(index = 4)
  public val orderHash: String,
  @ProtobufIndex(index = 5)
  public val orderMask: Int,
  @ProtobufIndex(index = 6)
  public val cid: String,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/injective.exchange.v1beta1.MsgCancelDerivativeOrder"
  }

  public object KotlinxSerializer : KSerializer<MsgCancelDerivativeOrder> {
    private val delegator: KSerializer<MsgCancelDerivativeOrder> =
        MsgCancelDerivativeOrder.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: MsgCancelDerivativeOrder): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(MsgCancelDerivativeOrderConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): MsgCancelDerivativeOrder {
      if (decoder is ProtobufMapperDecoder) {
        return MsgCancelDerivativeOrderConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = MsgCancelDerivativeOrderResponse.KotlinxSerializer::class)
@SerialName(value = MsgCancelDerivativeOrderResponse.TYPE_URL)
public class MsgCancelDerivativeOrderResponse() : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String =
        "/injective.exchange.v1beta1.MsgCancelDerivativeOrderResponse"
  }

  public object KotlinxSerializer : KSerializer<MsgCancelDerivativeOrderResponse> {
    private val delegator: KSerializer<MsgCancelDerivativeOrderResponse> =
        MsgCancelDerivativeOrderResponse.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: MsgCancelDerivativeOrderResponse):
        Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(MsgCancelDerivativeOrderResponseConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): MsgCancelDerivativeOrderResponse {
      if (decoder is ProtobufMapperDecoder) {
        return MsgCancelDerivativeOrderResponseConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = MsgCancelBinaryOptionsOrder.KotlinxSerializer::class)
@SerialName(value = MsgCancelBinaryOptionsOrder.TYPE_URL)
public data class MsgCancelBinaryOptionsOrder(
  @ProtobufIndex(index = 1)
  public val sender: String,
  @ProtobufIndex(index = 2)
  public val marketId: String,
  @ProtobufIndex(index = 3)
  public val subaccountId: String,
  @ProtobufIndex(index = 4)
  public val orderHash: String,
  @ProtobufIndex(index = 5)
  public val orderMask: Int,
  @ProtobufIndex(index = 6)
  public val cid: String,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/injective.exchange.v1beta1.MsgCancelBinaryOptionsOrder"
  }

  public object KotlinxSerializer : KSerializer<MsgCancelBinaryOptionsOrder> {
    private val delegator: KSerializer<MsgCancelBinaryOptionsOrder> =
        MsgCancelBinaryOptionsOrder.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: MsgCancelBinaryOptionsOrder): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(MsgCancelBinaryOptionsOrderConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): MsgCancelBinaryOptionsOrder {
      if (decoder is ProtobufMapperDecoder) {
        return MsgCancelBinaryOptionsOrderConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = MsgCancelBinaryOptionsOrderResponse.KotlinxSerializer::class)
@SerialName(value = MsgCancelBinaryOptionsOrderResponse.TYPE_URL)
public class MsgCancelBinaryOptionsOrderResponse() : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String =
        "/injective.exchange.v1beta1.MsgCancelBinaryOptionsOrderResponse"
  }

  public object KotlinxSerializer : KSerializer<MsgCancelBinaryOptionsOrderResponse> {
    private val delegator: KSerializer<MsgCancelBinaryOptionsOrderResponse> =
        MsgCancelBinaryOptionsOrderResponse.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: MsgCancelBinaryOptionsOrderResponse):
        Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(MsgCancelBinaryOptionsOrderResponseConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): MsgCancelBinaryOptionsOrderResponse {
      if (decoder is ProtobufMapperDecoder) {
        return MsgCancelBinaryOptionsOrderResponseConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = OrderData.KotlinxSerializer::class)
@SerialName(value = OrderData.TYPE_URL)
public data class OrderData(
  @ProtobufIndex(index = 1)
  public val marketId: String,
  @ProtobufIndex(index = 2)
  public val subaccountId: String,
  @ProtobufIndex(index = 3)
  public val orderHash: String,
  @ProtobufIndex(index = 4)
  public val orderMask: Int,
  @ProtobufIndex(index = 5)
  public val cid: String,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/injective.exchange.v1beta1.OrderData"
  }

  public object KotlinxSerializer : KSerializer<OrderData> {
    private val delegator: KSerializer<OrderData> = OrderData.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: OrderData): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(OrderDataConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): OrderData {
      if (decoder is ProtobufMapperDecoder) {
        return OrderDataConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = MsgBatchCancelDerivativeOrders.KotlinxSerializer::class)
@SerialName(value = MsgBatchCancelDerivativeOrders.TYPE_URL)
public data class MsgBatchCancelDerivativeOrders(
  @ProtobufIndex(index = 1)
  public val sender: String,
  @ProtobufIndex(index = 2)
  public val `data`: List<OrderData>,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/injective.exchange.v1beta1.MsgBatchCancelDerivativeOrders"
  }

  public object KotlinxSerializer : KSerializer<MsgBatchCancelDerivativeOrders> {
    private val delegator: KSerializer<MsgBatchCancelDerivativeOrders> =
        MsgBatchCancelDerivativeOrders.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: MsgBatchCancelDerivativeOrders): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(MsgBatchCancelDerivativeOrdersConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): MsgBatchCancelDerivativeOrders {
      if (decoder is ProtobufMapperDecoder) {
        return MsgBatchCancelDerivativeOrdersConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = MsgBatchCancelDerivativeOrdersResponse.KotlinxSerializer::class)
@SerialName(value = MsgBatchCancelDerivativeOrdersResponse.TYPE_URL)
public data class MsgBatchCancelDerivativeOrdersResponse(
  @ProtobufIndex(index = 1)
  public val success: List<Boolean>,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String =
        "/injective.exchange.v1beta1.MsgBatchCancelDerivativeOrdersResponse"
  }

  public object KotlinxSerializer : KSerializer<MsgBatchCancelDerivativeOrdersResponse> {
    private val delegator: KSerializer<MsgBatchCancelDerivativeOrdersResponse> =
        MsgBatchCancelDerivativeOrdersResponse.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder,
        `value`: MsgBatchCancelDerivativeOrdersResponse): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(MsgBatchCancelDerivativeOrdersResponseConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): MsgBatchCancelDerivativeOrdersResponse {
      if (decoder is ProtobufMapperDecoder) {
        return MsgBatchCancelDerivativeOrdersResponseConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = MsgSubaccountTransfer.KotlinxSerializer::class)
@SerialName(value = MsgSubaccountTransfer.TYPE_URL)
public data class MsgSubaccountTransfer(
  @ProtobufIndex(index = 1)
  public val sender: String,
  @ProtobufIndex(index = 2)
  public val sourceSubaccountId: String,
  @ProtobufIndex(index = 3)
  public val destinationSubaccountId: String,
  @ProtobufIndex(index = 4)
  public val amount: Coin,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/injective.exchange.v1beta1.MsgSubaccountTransfer"
  }

  public object KotlinxSerializer : KSerializer<MsgSubaccountTransfer> {
    private val delegator: KSerializer<MsgSubaccountTransfer> = MsgSubaccountTransfer.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: MsgSubaccountTransfer): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(MsgSubaccountTransferConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): MsgSubaccountTransfer {
      if (decoder is ProtobufMapperDecoder) {
        return MsgSubaccountTransferConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = MsgSubaccountTransferResponse.KotlinxSerializer::class)
@SerialName(value = MsgSubaccountTransferResponse.TYPE_URL)
public class MsgSubaccountTransferResponse() : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/injective.exchange.v1beta1.MsgSubaccountTransferResponse"
  }

  public object KotlinxSerializer : KSerializer<MsgSubaccountTransferResponse> {
    private val delegator: KSerializer<MsgSubaccountTransferResponse> =
        MsgSubaccountTransferResponse.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: MsgSubaccountTransferResponse): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(MsgSubaccountTransferResponseConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): MsgSubaccountTransferResponse {
      if (decoder is ProtobufMapperDecoder) {
        return MsgSubaccountTransferResponseConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = MsgExternalTransfer.KotlinxSerializer::class)
@SerialName(value = MsgExternalTransfer.TYPE_URL)
public data class MsgExternalTransfer(
  @ProtobufIndex(index = 1)
  public val sender: String,
  @ProtobufIndex(index = 2)
  public val sourceSubaccountId: String,
  @ProtobufIndex(index = 3)
  public val destinationSubaccountId: String,
  @ProtobufIndex(index = 4)
  public val amount: Coin,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/injective.exchange.v1beta1.MsgExternalTransfer"
  }

  public object KotlinxSerializer : KSerializer<MsgExternalTransfer> {
    private val delegator: KSerializer<MsgExternalTransfer> = MsgExternalTransfer.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: MsgExternalTransfer): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(MsgExternalTransferConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): MsgExternalTransfer {
      if (decoder is ProtobufMapperDecoder) {
        return MsgExternalTransferConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = MsgExternalTransferResponse.KotlinxSerializer::class)
@SerialName(value = MsgExternalTransferResponse.TYPE_URL)
public class MsgExternalTransferResponse() : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/injective.exchange.v1beta1.MsgExternalTransferResponse"
  }

  public object KotlinxSerializer : KSerializer<MsgExternalTransferResponse> {
    private val delegator: KSerializer<MsgExternalTransferResponse> =
        MsgExternalTransferResponse.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: MsgExternalTransferResponse): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(MsgExternalTransferResponseConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): MsgExternalTransferResponse {
      if (decoder is ProtobufMapperDecoder) {
        return MsgExternalTransferResponseConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = MsgLiquidatePosition.KotlinxSerializer::class)
@SerialName(value = MsgLiquidatePosition.TYPE_URL)
public data class MsgLiquidatePosition(
  @ProtobufIndex(index = 1)
  public val sender: String,
  @ProtobufIndex(index = 2)
  public val subaccountId: String,
  @ProtobufIndex(index = 3)
  public val marketId: String,
  @ProtobufIndex(index = 4)
  public val order: DerivativeOrder,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/injective.exchange.v1beta1.MsgLiquidatePosition"
  }

  public object KotlinxSerializer : KSerializer<MsgLiquidatePosition> {
    private val delegator: KSerializer<MsgLiquidatePosition> = MsgLiquidatePosition.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: MsgLiquidatePosition): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(MsgLiquidatePositionConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): MsgLiquidatePosition {
      if (decoder is ProtobufMapperDecoder) {
        return MsgLiquidatePositionConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = MsgLiquidatePositionResponse.KotlinxSerializer::class)
@SerialName(value = MsgLiquidatePositionResponse.TYPE_URL)
public class MsgLiquidatePositionResponse() : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/injective.exchange.v1beta1.MsgLiquidatePositionResponse"
  }

  public object KotlinxSerializer : KSerializer<MsgLiquidatePositionResponse> {
    private val delegator: KSerializer<MsgLiquidatePositionResponse> =
        MsgLiquidatePositionResponse.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: MsgLiquidatePositionResponse): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(MsgLiquidatePositionResponseConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): MsgLiquidatePositionResponse {
      if (decoder is ProtobufMapperDecoder) {
        return MsgLiquidatePositionResponseConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = MsgEmergencySettleMarket.KotlinxSerializer::class)
@SerialName(value = MsgEmergencySettleMarket.TYPE_URL)
public data class MsgEmergencySettleMarket(
  @ProtobufIndex(index = 1)
  public val sender: String,
  @ProtobufIndex(index = 2)
  public val subaccountId: String,
  @ProtobufIndex(index = 3)
  public val marketId: String,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/injective.exchange.v1beta1.MsgEmergencySettleMarket"
  }

  public object KotlinxSerializer : KSerializer<MsgEmergencySettleMarket> {
    private val delegator: KSerializer<MsgEmergencySettleMarket> =
        MsgEmergencySettleMarket.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: MsgEmergencySettleMarket): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(MsgEmergencySettleMarketConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): MsgEmergencySettleMarket {
      if (decoder is ProtobufMapperDecoder) {
        return MsgEmergencySettleMarketConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = MsgEmergencySettleMarketResponse.KotlinxSerializer::class)
@SerialName(value = MsgEmergencySettleMarketResponse.TYPE_URL)
public class MsgEmergencySettleMarketResponse() : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String =
        "/injective.exchange.v1beta1.MsgEmergencySettleMarketResponse"
  }

  public object KotlinxSerializer : KSerializer<MsgEmergencySettleMarketResponse> {
    private val delegator: KSerializer<MsgEmergencySettleMarketResponse> =
        MsgEmergencySettleMarketResponse.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: MsgEmergencySettleMarketResponse):
        Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(MsgEmergencySettleMarketResponseConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): MsgEmergencySettleMarketResponse {
      if (decoder is ProtobufMapperDecoder) {
        return MsgEmergencySettleMarketResponseConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = MsgIncreasePositionMargin.KotlinxSerializer::class)
@SerialName(value = MsgIncreasePositionMargin.TYPE_URL)
public data class MsgIncreasePositionMargin(
  @ProtobufIndex(index = 1)
  public val sender: String,
  @ProtobufIndex(index = 2)
  public val sourceSubaccountId: String,
  @ProtobufIndex(index = 3)
  public val destinationSubaccountId: String,
  @ProtobufIndex(index = 4)
  public val marketId: String,
  @ProtobufIndex(index = 5)
  public val amount: String,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/injective.exchange.v1beta1.MsgIncreasePositionMargin"
  }

  public object KotlinxSerializer : KSerializer<MsgIncreasePositionMargin> {
    private val delegator: KSerializer<MsgIncreasePositionMargin> =
        MsgIncreasePositionMargin.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: MsgIncreasePositionMargin): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(MsgIncreasePositionMarginConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): MsgIncreasePositionMargin {
      if (decoder is ProtobufMapperDecoder) {
        return MsgIncreasePositionMarginConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = MsgIncreasePositionMarginResponse.KotlinxSerializer::class)
@SerialName(value = MsgIncreasePositionMarginResponse.TYPE_URL)
public class MsgIncreasePositionMarginResponse() : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String =
        "/injective.exchange.v1beta1.MsgIncreasePositionMarginResponse"
  }

  public object KotlinxSerializer : KSerializer<MsgIncreasePositionMarginResponse> {
    private val delegator: KSerializer<MsgIncreasePositionMarginResponse> =
        MsgIncreasePositionMarginResponse.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: MsgIncreasePositionMarginResponse):
        Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(MsgIncreasePositionMarginResponseConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): MsgIncreasePositionMarginResponse {
      if (decoder is ProtobufMapperDecoder) {
        return MsgIncreasePositionMarginResponseConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = MsgPrivilegedExecuteContract.KotlinxSerializer::class)
@SerialName(value = MsgPrivilegedExecuteContract.TYPE_URL)
public data class MsgPrivilegedExecuteContract(
  @ProtobufIndex(index = 1)
  public val sender: String,
  @ProtobufIndex(index = 2)
  public val funds: String,
  @ProtobufIndex(index = 3)
  public val contractAddress: String,
  @ProtobufIndex(index = 4)
  public val `data`: String,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/injective.exchange.v1beta1.MsgPrivilegedExecuteContract"
  }

  public object KotlinxSerializer : KSerializer<MsgPrivilegedExecuteContract> {
    private val delegator: KSerializer<MsgPrivilegedExecuteContract> =
        MsgPrivilegedExecuteContract.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: MsgPrivilegedExecuteContract): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(MsgPrivilegedExecuteContractConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): MsgPrivilegedExecuteContract {
      if (decoder is ProtobufMapperDecoder) {
        return MsgPrivilegedExecuteContractConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = MsgPrivilegedExecuteContractResponse.KotlinxSerializer::class)
@SerialName(value = MsgPrivilegedExecuteContractResponse.TYPE_URL)
public data class MsgPrivilegedExecuteContractResponse(
  @ProtobufIndex(index = 1)
  public val fundsDiff: List<Coin>,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String =
        "/injective.exchange.v1beta1.MsgPrivilegedExecuteContractResponse"
  }

  public object KotlinxSerializer : KSerializer<MsgPrivilegedExecuteContractResponse> {
    private val delegator: KSerializer<MsgPrivilegedExecuteContractResponse> =
        MsgPrivilegedExecuteContractResponse.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: MsgPrivilegedExecuteContractResponse):
        Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(MsgPrivilegedExecuteContractResponseConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): MsgPrivilegedExecuteContractResponse {
      if (decoder is ProtobufMapperDecoder) {
        return MsgPrivilegedExecuteContractResponseConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = MsgRewardsOptOut.KotlinxSerializer::class)
@SerialName(value = MsgRewardsOptOut.TYPE_URL)
public data class MsgRewardsOptOut(
  @ProtobufIndex(index = 1)
  public val sender: String,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/injective.exchange.v1beta1.MsgRewardsOptOut"
  }

  public object KotlinxSerializer : KSerializer<MsgRewardsOptOut> {
    private val delegator: KSerializer<MsgRewardsOptOut> = MsgRewardsOptOut.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: MsgRewardsOptOut): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(MsgRewardsOptOutConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): MsgRewardsOptOut {
      if (decoder is ProtobufMapperDecoder) {
        return MsgRewardsOptOutConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = MsgRewardsOptOutResponse.KotlinxSerializer::class)
@SerialName(value = MsgRewardsOptOutResponse.TYPE_URL)
public class MsgRewardsOptOutResponse() : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/injective.exchange.v1beta1.MsgRewardsOptOutResponse"
  }

  public object KotlinxSerializer : KSerializer<MsgRewardsOptOutResponse> {
    private val delegator: KSerializer<MsgRewardsOptOutResponse> =
        MsgRewardsOptOutResponse.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: MsgRewardsOptOutResponse): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(MsgRewardsOptOutResponseConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): MsgRewardsOptOutResponse {
      if (decoder is ProtobufMapperDecoder) {
        return MsgRewardsOptOutResponseConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = MsgReclaimLockedFunds.KotlinxSerializer::class)
@SerialName(value = MsgReclaimLockedFunds.TYPE_URL)
public data class MsgReclaimLockedFunds(
  @ProtobufIndex(index = 1)
  public val sender: String,
  @ProtobufIndex(index = 2)
  public val lockedAccountPubKey: ByteArray,
  @ProtobufIndex(index = 3)
  public val signature: ByteArray,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/injective.exchange.v1beta1.MsgReclaimLockedFunds"
  }

  public object KotlinxSerializer : KSerializer<MsgReclaimLockedFunds> {
    private val delegator: KSerializer<MsgReclaimLockedFunds> = MsgReclaimLockedFunds.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: MsgReclaimLockedFunds): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(MsgReclaimLockedFundsConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): MsgReclaimLockedFunds {
      if (decoder is ProtobufMapperDecoder) {
        return MsgReclaimLockedFundsConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = MsgReclaimLockedFundsResponse.KotlinxSerializer::class)
@SerialName(value = MsgReclaimLockedFundsResponse.TYPE_URL)
public class MsgReclaimLockedFundsResponse() : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/injective.exchange.v1beta1.MsgReclaimLockedFundsResponse"
  }

  public object KotlinxSerializer : KSerializer<MsgReclaimLockedFundsResponse> {
    private val delegator: KSerializer<MsgReclaimLockedFundsResponse> =
        MsgReclaimLockedFundsResponse.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: MsgReclaimLockedFundsResponse): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(MsgReclaimLockedFundsResponseConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): MsgReclaimLockedFundsResponse {
      if (decoder is ProtobufMapperDecoder) {
        return MsgReclaimLockedFundsResponseConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = MsgSignData.KotlinxSerializer::class)
@SerialName(value = MsgSignData.TYPE_URL)
public data class MsgSignData(
  @ProtobufIndex(index = 1)
  public val signer: ByteArray,
  @ProtobufIndex(index = 2)
  public val `data`: ByteArray,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/injective.exchange.v1beta1.MsgSignData"
  }

  public object KotlinxSerializer : KSerializer<MsgSignData> {
    private val delegator: KSerializer<MsgSignData> = MsgSignData.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: MsgSignData): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(MsgSignDataConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): MsgSignData {
      if (decoder is ProtobufMapperDecoder) {
        return MsgSignDataConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = MsgSignDoc.KotlinxSerializer::class)
@SerialName(value = MsgSignDoc.TYPE_URL)
public data class MsgSignDoc(
  @ProtobufIndex(index = 1)
  public val signType: String,
  @ProtobufIndex(index = 2)
  public val `value`: MsgSignData,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/injective.exchange.v1beta1.MsgSignDoc"
  }

  public object KotlinxSerializer : KSerializer<MsgSignDoc> {
    private val delegator: KSerializer<MsgSignDoc> = MsgSignDoc.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: MsgSignDoc): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(MsgSignDocConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): MsgSignDoc {
      if (decoder is ProtobufMapperDecoder) {
        return MsgSignDocConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = MsgAdminUpdateBinaryOptionsMarket.KotlinxSerializer::class)
@SerialName(value = MsgAdminUpdateBinaryOptionsMarket.TYPE_URL)
public data class MsgAdminUpdateBinaryOptionsMarket(
  @ProtobufIndex(index = 1)
  public val sender: String,
  @ProtobufIndex(index = 2)
  public val marketId: String,
  @ProtobufIndex(index = 3)
  public val settlementPrice: String,
  @ProtobufIndex(index = 4)
  public val expirationTimestamp: Long,
  @ProtobufIndex(index = 5)
  public val settlementTimestamp: Long,
  @ProtobufIndex(index = 6)
  public val status: MarketStatus,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String =
        "/injective.exchange.v1beta1.MsgAdminUpdateBinaryOptionsMarket"
  }

  public object KotlinxSerializer : KSerializer<MsgAdminUpdateBinaryOptionsMarket> {
    private val delegator: KSerializer<MsgAdminUpdateBinaryOptionsMarket> =
        MsgAdminUpdateBinaryOptionsMarket.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: MsgAdminUpdateBinaryOptionsMarket):
        Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(MsgAdminUpdateBinaryOptionsMarketConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): MsgAdminUpdateBinaryOptionsMarket {
      if (decoder is ProtobufMapperDecoder) {
        return MsgAdminUpdateBinaryOptionsMarketConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = MsgAdminUpdateBinaryOptionsMarketResponse.KotlinxSerializer::class)
@SerialName(value = MsgAdminUpdateBinaryOptionsMarketResponse.TYPE_URL)
public class MsgAdminUpdateBinaryOptionsMarketResponse() : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String =
        "/injective.exchange.v1beta1.MsgAdminUpdateBinaryOptionsMarketResponse"
  }

  public object KotlinxSerializer : KSerializer<MsgAdminUpdateBinaryOptionsMarketResponse> {
    private val delegator: KSerializer<MsgAdminUpdateBinaryOptionsMarketResponse> =
        MsgAdminUpdateBinaryOptionsMarketResponse.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder,
        `value`: MsgAdminUpdateBinaryOptionsMarketResponse): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(MsgAdminUpdateBinaryOptionsMarketResponseConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): MsgAdminUpdateBinaryOptionsMarketResponse {
      if (decoder is ProtobufMapperDecoder) {
        return MsgAdminUpdateBinaryOptionsMarketResponseConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}
