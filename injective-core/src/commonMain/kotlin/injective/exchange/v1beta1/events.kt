// Transform from injective/exchange/v1beta1/events.proto
@file:ProtobufSyntax(syntax = "PROTO3")
@file:GeneratorVersion(version = "0.3.1")

package injective.exchange.v1beta1

import cosmos.base.v1beta1.Coin
import kotlin.Boolean
import kotlin.ByteArray
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

@Serializable(with = EventBatchSpotExecution.KotlinxSerializer::class)
@SerialName(value = EventBatchSpotExecution.TYPE_URL)
public data class EventBatchSpotExecution(
  @ProtobufIndex(index = 1)
  public val marketId: String,
  @ProtobufIndex(index = 2)
  public val isBuy: Boolean,
  @ProtobufIndex(index = 3)
  public val executionType: ExecutionType,
  @ProtobufIndex(index = 4)
  public val trades: List<TradeLog>,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/injective.exchange.v1beta1.EventBatchSpotExecution"
  }

  public object KotlinxSerializer : KSerializer<EventBatchSpotExecution> {
    private val delegator: KSerializer<EventBatchSpotExecution> =
        EventBatchSpotExecution.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: EventBatchSpotExecution): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(EventBatchSpotExecutionConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): EventBatchSpotExecution {
      if (decoder is ProtobufMapperDecoder) {
        return EventBatchSpotExecutionConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = EventBatchDerivativeExecution.KotlinxSerializer::class)
@SerialName(value = EventBatchDerivativeExecution.TYPE_URL)
public data class EventBatchDerivativeExecution(
  @ProtobufIndex(index = 1)
  public val marketId: String,
  @ProtobufIndex(index = 2)
  public val isBuy: Boolean,
  @ProtobufIndex(index = 3)
  public val isLiquidation: Boolean,
  @ProtobufIndex(index = 4)
  public val cumulativeFunding: String,
  @ProtobufIndex(index = 5)
  public val executionType: ExecutionType,
  @ProtobufIndex(index = 6)
  public val trades: List<DerivativeTradeLog>,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/injective.exchange.v1beta1.EventBatchDerivativeExecution"
  }

  public object KotlinxSerializer : KSerializer<EventBatchDerivativeExecution> {
    private val delegator: KSerializer<EventBatchDerivativeExecution> =
        EventBatchDerivativeExecution.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: EventBatchDerivativeExecution): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(EventBatchDerivativeExecutionConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): EventBatchDerivativeExecution {
      if (decoder is ProtobufMapperDecoder) {
        return EventBatchDerivativeExecutionConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = EventLostFundsFromLiquidation.KotlinxSerializer::class)
@SerialName(value = EventLostFundsFromLiquidation.TYPE_URL)
public data class EventLostFundsFromLiquidation(
  @ProtobufIndex(index = 1)
  public val marketId: String,
  @ProtobufIndex(index = 2)
  public val subaccountId: ByteArray,
  @ProtobufIndex(index = 3)
  public val lostFundsFromAvailableDuringPayout: String,
  @ProtobufIndex(index = 4)
  public val lostFundsFromOrderCancels: String,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/injective.exchange.v1beta1.EventLostFundsFromLiquidation"
  }

  public object KotlinxSerializer : KSerializer<EventLostFundsFromLiquidation> {
    private val delegator: KSerializer<EventLostFundsFromLiquidation> =
        EventLostFundsFromLiquidation.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: EventLostFundsFromLiquidation): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(EventLostFundsFromLiquidationConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): EventLostFundsFromLiquidation {
      if (decoder is ProtobufMapperDecoder) {
        return EventLostFundsFromLiquidationConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = EventBatchDerivativePosition.KotlinxSerializer::class)
@SerialName(value = EventBatchDerivativePosition.TYPE_URL)
public data class EventBatchDerivativePosition(
  @ProtobufIndex(index = 1)
  public val marketId: String,
  @ProtobufIndex(index = 2)
  public val positions: List<SubaccountPosition>,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/injective.exchange.v1beta1.EventBatchDerivativePosition"
  }

  public object KotlinxSerializer : KSerializer<EventBatchDerivativePosition> {
    private val delegator: KSerializer<EventBatchDerivativePosition> =
        EventBatchDerivativePosition.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: EventBatchDerivativePosition): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(EventBatchDerivativePositionConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): EventBatchDerivativePosition {
      if (decoder is ProtobufMapperDecoder) {
        return EventBatchDerivativePositionConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = EventDerivativeMarketPaused.KotlinxSerializer::class)
@SerialName(value = EventDerivativeMarketPaused.TYPE_URL)
public data class EventDerivativeMarketPaused(
  @ProtobufIndex(index = 1)
  public val marketId: String,
  @ProtobufIndex(index = 2)
  public val settlePrice: String,
  @ProtobufIndex(index = 3)
  public val totalMissingFunds: String,
  @ProtobufIndex(index = 4)
  public val missingFundsRate: String,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/injective.exchange.v1beta1.EventDerivativeMarketPaused"
  }

  public object KotlinxSerializer : KSerializer<EventDerivativeMarketPaused> {
    private val delegator: KSerializer<EventDerivativeMarketPaused> =
        EventDerivativeMarketPaused.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: EventDerivativeMarketPaused): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(EventDerivativeMarketPausedConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): EventDerivativeMarketPaused {
      if (decoder is ProtobufMapperDecoder) {
        return EventDerivativeMarketPausedConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = EventMarketBeyondBankruptcy.KotlinxSerializer::class)
@SerialName(value = EventMarketBeyondBankruptcy.TYPE_URL)
public data class EventMarketBeyondBankruptcy(
  @ProtobufIndex(index = 1)
  public val marketId: String,
  @ProtobufIndex(index = 2)
  public val settlePrice: String,
  @ProtobufIndex(index = 3)
  public val missingMarketFunds: String,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/injective.exchange.v1beta1.EventMarketBeyondBankruptcy"
  }

  public object KotlinxSerializer : KSerializer<EventMarketBeyondBankruptcy> {
    private val delegator: KSerializer<EventMarketBeyondBankruptcy> =
        EventMarketBeyondBankruptcy.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: EventMarketBeyondBankruptcy): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(EventMarketBeyondBankruptcyConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): EventMarketBeyondBankruptcy {
      if (decoder is ProtobufMapperDecoder) {
        return EventMarketBeyondBankruptcyConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = EventAllPositionsHaircut.KotlinxSerializer::class)
@SerialName(value = EventAllPositionsHaircut.TYPE_URL)
public data class EventAllPositionsHaircut(
  @ProtobufIndex(index = 1)
  public val marketId: String,
  @ProtobufIndex(index = 2)
  public val settlePrice: String,
  @ProtobufIndex(index = 3)
  public val missingFundsRate: String,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/injective.exchange.v1beta1.EventAllPositionsHaircut"
  }

  public object KotlinxSerializer : KSerializer<EventAllPositionsHaircut> {
    private val delegator: KSerializer<EventAllPositionsHaircut> =
        EventAllPositionsHaircut.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: EventAllPositionsHaircut): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(EventAllPositionsHaircutConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): EventAllPositionsHaircut {
      if (decoder is ProtobufMapperDecoder) {
        return EventAllPositionsHaircutConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = EventBinaryOptionsMarketUpdate.KotlinxSerializer::class)
@SerialName(value = EventBinaryOptionsMarketUpdate.TYPE_URL)
public data class EventBinaryOptionsMarketUpdate(
  @ProtobufIndex(index = 1)
  public val market: BinaryOptionsMarket,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/injective.exchange.v1beta1.EventBinaryOptionsMarketUpdate"
  }

  public object KotlinxSerializer : KSerializer<EventBinaryOptionsMarketUpdate> {
    private val delegator: KSerializer<EventBinaryOptionsMarketUpdate> =
        EventBinaryOptionsMarketUpdate.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: EventBinaryOptionsMarketUpdate): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(EventBinaryOptionsMarketUpdateConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): EventBinaryOptionsMarketUpdate {
      if (decoder is ProtobufMapperDecoder) {
        return EventBinaryOptionsMarketUpdateConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = EventNewSpotOrders.KotlinxSerializer::class)
@SerialName(value = EventNewSpotOrders.TYPE_URL)
public data class EventNewSpotOrders(
  @ProtobufIndex(index = 1)
  public val marketId: String,
  @ProtobufIndex(index = 2)
  public val buyOrders: List<SpotLimitOrder>,
  @ProtobufIndex(index = 3)
  public val sellOrders: List<SpotLimitOrder>,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/injective.exchange.v1beta1.EventNewSpotOrders"
  }

  public object KotlinxSerializer : KSerializer<EventNewSpotOrders> {
    private val delegator: KSerializer<EventNewSpotOrders> = EventNewSpotOrders.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: EventNewSpotOrders): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(EventNewSpotOrdersConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): EventNewSpotOrders {
      if (decoder is ProtobufMapperDecoder) {
        return EventNewSpotOrdersConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = EventNewDerivativeOrders.KotlinxSerializer::class)
@SerialName(value = EventNewDerivativeOrders.TYPE_URL)
public data class EventNewDerivativeOrders(
  @ProtobufIndex(index = 1)
  public val marketId: String,
  @ProtobufIndex(index = 2)
  public val buyOrders: List<DerivativeLimitOrder>,
  @ProtobufIndex(index = 3)
  public val sellOrders: List<DerivativeLimitOrder>,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/injective.exchange.v1beta1.EventNewDerivativeOrders"
  }

  public object KotlinxSerializer : KSerializer<EventNewDerivativeOrders> {
    private val delegator: KSerializer<EventNewDerivativeOrders> =
        EventNewDerivativeOrders.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: EventNewDerivativeOrders): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(EventNewDerivativeOrdersConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): EventNewDerivativeOrders {
      if (decoder is ProtobufMapperDecoder) {
        return EventNewDerivativeOrdersConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = EventCancelSpotOrder.KotlinxSerializer::class)
@SerialName(value = EventCancelSpotOrder.TYPE_URL)
public data class EventCancelSpotOrder(
  @ProtobufIndex(index = 1)
  public val marketId: String,
  @ProtobufIndex(index = 2)
  public val order: SpotLimitOrder,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/injective.exchange.v1beta1.EventCancelSpotOrder"
  }

  public object KotlinxSerializer : KSerializer<EventCancelSpotOrder> {
    private val delegator: KSerializer<EventCancelSpotOrder> = EventCancelSpotOrder.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: EventCancelSpotOrder): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(EventCancelSpotOrderConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): EventCancelSpotOrder {
      if (decoder is ProtobufMapperDecoder) {
        return EventCancelSpotOrderConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = EventSpotMarketUpdate.KotlinxSerializer::class)
@SerialName(value = EventSpotMarketUpdate.TYPE_URL)
public data class EventSpotMarketUpdate(
  @ProtobufIndex(index = 1)
  public val market: SpotMarket,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/injective.exchange.v1beta1.EventSpotMarketUpdate"
  }

  public object KotlinxSerializer : KSerializer<EventSpotMarketUpdate> {
    private val delegator: KSerializer<EventSpotMarketUpdate> = EventSpotMarketUpdate.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: EventSpotMarketUpdate): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(EventSpotMarketUpdateConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): EventSpotMarketUpdate {
      if (decoder is ProtobufMapperDecoder) {
        return EventSpotMarketUpdateConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = EventPerpetualMarketUpdate.KotlinxSerializer::class)
@SerialName(value = EventPerpetualMarketUpdate.TYPE_URL)
public data class EventPerpetualMarketUpdate(
  @ProtobufIndex(index = 1)
  public val market: DerivativeMarket,
  @ProtobufIndex(index = 2)
  public val perpetualMarketInfo: PerpetualMarketInfo,
  @ProtobufIndex(index = 3)
  public val funding: PerpetualMarketFunding,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/injective.exchange.v1beta1.EventPerpetualMarketUpdate"
  }

  public object KotlinxSerializer : KSerializer<EventPerpetualMarketUpdate> {
    private val delegator: KSerializer<EventPerpetualMarketUpdate> =
        EventPerpetualMarketUpdate.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: EventPerpetualMarketUpdate): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(EventPerpetualMarketUpdateConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): EventPerpetualMarketUpdate {
      if (decoder is ProtobufMapperDecoder) {
        return EventPerpetualMarketUpdateConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = EventExpiryFuturesMarketUpdate.KotlinxSerializer::class)
@SerialName(value = EventExpiryFuturesMarketUpdate.TYPE_URL)
public data class EventExpiryFuturesMarketUpdate(
  @ProtobufIndex(index = 1)
  public val market: DerivativeMarket,
  @ProtobufIndex(index = 3)
  public val expiryFuturesMarketInfo: ExpiryFuturesMarketInfo,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/injective.exchange.v1beta1.EventExpiryFuturesMarketUpdate"
  }

  public object KotlinxSerializer : KSerializer<EventExpiryFuturesMarketUpdate> {
    private val delegator: KSerializer<EventExpiryFuturesMarketUpdate> =
        EventExpiryFuturesMarketUpdate.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: EventExpiryFuturesMarketUpdate): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(EventExpiryFuturesMarketUpdateConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): EventExpiryFuturesMarketUpdate {
      if (decoder is ProtobufMapperDecoder) {
        return EventExpiryFuturesMarketUpdateConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = EventPerpetualMarketFundingUpdate.KotlinxSerializer::class)
@SerialName(value = EventPerpetualMarketFundingUpdate.TYPE_URL)
public data class EventPerpetualMarketFundingUpdate(
  @ProtobufIndex(index = 1)
  public val marketId: String,
  @ProtobufIndex(index = 2)
  public val funding: PerpetualMarketFunding,
  @ProtobufIndex(index = 3)
  public val isHourlyFunding: Boolean,
  @ProtobufIndex(index = 4)
  public val fundingRate: String,
  @ProtobufIndex(index = 5)
  public val markPrice: String,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String =
        "/injective.exchange.v1beta1.EventPerpetualMarketFundingUpdate"
  }

  public object KotlinxSerializer : KSerializer<EventPerpetualMarketFundingUpdate> {
    private val delegator: KSerializer<EventPerpetualMarketFundingUpdate> =
        EventPerpetualMarketFundingUpdate.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: EventPerpetualMarketFundingUpdate):
        Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(EventPerpetualMarketFundingUpdateConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): EventPerpetualMarketFundingUpdate {
      if (decoder is ProtobufMapperDecoder) {
        return EventPerpetualMarketFundingUpdateConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = EventSubaccountDeposit.KotlinxSerializer::class)
@SerialName(value = EventSubaccountDeposit.TYPE_URL)
public data class EventSubaccountDeposit(
  @ProtobufIndex(index = 1)
  public val srcAddress: String,
  @ProtobufIndex(index = 2)
  public val subaccountId: ByteArray,
  @ProtobufIndex(index = 3)
  public val amount: Coin,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/injective.exchange.v1beta1.EventSubaccountDeposit"
  }

  public object KotlinxSerializer : KSerializer<EventSubaccountDeposit> {
    private val delegator: KSerializer<EventSubaccountDeposit> = EventSubaccountDeposit.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: EventSubaccountDeposit): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(EventSubaccountDepositConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): EventSubaccountDeposit {
      if (decoder is ProtobufMapperDecoder) {
        return EventSubaccountDepositConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = EventSubaccountWithdraw.KotlinxSerializer::class)
@SerialName(value = EventSubaccountWithdraw.TYPE_URL)
public data class EventSubaccountWithdraw(
  @ProtobufIndex(index = 1)
  public val subaccountId: ByteArray,
  @ProtobufIndex(index = 2)
  public val dstAddress: String,
  @ProtobufIndex(index = 3)
  public val amount: Coin,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/injective.exchange.v1beta1.EventSubaccountWithdraw"
  }

  public object KotlinxSerializer : KSerializer<EventSubaccountWithdraw> {
    private val delegator: KSerializer<EventSubaccountWithdraw> =
        EventSubaccountWithdraw.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: EventSubaccountWithdraw): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(EventSubaccountWithdrawConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): EventSubaccountWithdraw {
      if (decoder is ProtobufMapperDecoder) {
        return EventSubaccountWithdrawConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = EventSubaccountBalanceTransfer.KotlinxSerializer::class)
@SerialName(value = EventSubaccountBalanceTransfer.TYPE_URL)
public data class EventSubaccountBalanceTransfer(
  @ProtobufIndex(index = 1)
  public val srcSubaccountId: String,
  @ProtobufIndex(index = 2)
  public val dstSubaccountId: String,
  @ProtobufIndex(index = 3)
  public val amount: Coin,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/injective.exchange.v1beta1.EventSubaccountBalanceTransfer"
  }

  public object KotlinxSerializer : KSerializer<EventSubaccountBalanceTransfer> {
    private val delegator: KSerializer<EventSubaccountBalanceTransfer> =
        EventSubaccountBalanceTransfer.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: EventSubaccountBalanceTransfer): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(EventSubaccountBalanceTransferConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): EventSubaccountBalanceTransfer {
      if (decoder is ProtobufMapperDecoder) {
        return EventSubaccountBalanceTransferConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = EventBatchDepositUpdate.KotlinxSerializer::class)
@SerialName(value = EventBatchDepositUpdate.TYPE_URL)
public data class EventBatchDepositUpdate(
  @ProtobufIndex(index = 1)
  public val depositUpdates: List<DepositUpdate>,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/injective.exchange.v1beta1.EventBatchDepositUpdate"
  }

  public object KotlinxSerializer : KSerializer<EventBatchDepositUpdate> {
    private val delegator: KSerializer<EventBatchDepositUpdate> =
        EventBatchDepositUpdate.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: EventBatchDepositUpdate): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(EventBatchDepositUpdateConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): EventBatchDepositUpdate {
      if (decoder is ProtobufMapperDecoder) {
        return EventBatchDepositUpdateConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = DerivativeMarketOrderCancel.KotlinxSerializer::class)
@SerialName(value = DerivativeMarketOrderCancel.TYPE_URL)
public data class DerivativeMarketOrderCancel(
  @ProtobufIndex(index = 1)
  public val marketOrder: DerivativeMarketOrder,
  @ProtobufIndex(index = 2)
  public val cancelQuantity: String,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/injective.exchange.v1beta1.DerivativeMarketOrderCancel"
  }

  public object KotlinxSerializer : KSerializer<DerivativeMarketOrderCancel> {
    private val delegator: KSerializer<DerivativeMarketOrderCancel> =
        DerivativeMarketOrderCancel.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: DerivativeMarketOrderCancel): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(DerivativeMarketOrderCancelConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): DerivativeMarketOrderCancel {
      if (decoder is ProtobufMapperDecoder) {
        return DerivativeMarketOrderCancelConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = EventCancelDerivativeOrder.KotlinxSerializer::class)
@SerialName(value = EventCancelDerivativeOrder.TYPE_URL)
public data class EventCancelDerivativeOrder(
  @ProtobufIndex(index = 1)
  public val marketId: String,
  @ProtobufIndex(index = 2)
  public val isLimitCancel: Boolean,
  @ProtobufIndex(index = 3)
  public val limitOrder: DerivativeLimitOrder,
  @ProtobufIndex(index = 4)
  public val marketOrderCancel: DerivativeMarketOrderCancel,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/injective.exchange.v1beta1.EventCancelDerivativeOrder"
  }

  public object KotlinxSerializer : KSerializer<EventCancelDerivativeOrder> {
    private val delegator: KSerializer<EventCancelDerivativeOrder> =
        EventCancelDerivativeOrder.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: EventCancelDerivativeOrder): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(EventCancelDerivativeOrderConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): EventCancelDerivativeOrder {
      if (decoder is ProtobufMapperDecoder) {
        return EventCancelDerivativeOrderConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = EventFeeDiscountSchedule.KotlinxSerializer::class)
@SerialName(value = EventFeeDiscountSchedule.TYPE_URL)
public data class EventFeeDiscountSchedule(
  @ProtobufIndex(index = 1)
  public val schedule: FeeDiscountSchedule,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/injective.exchange.v1beta1.EventFeeDiscountSchedule"
  }

  public object KotlinxSerializer : KSerializer<EventFeeDiscountSchedule> {
    private val delegator: KSerializer<EventFeeDiscountSchedule> =
        EventFeeDiscountSchedule.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: EventFeeDiscountSchedule): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(EventFeeDiscountScheduleConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): EventFeeDiscountSchedule {
      if (decoder is ProtobufMapperDecoder) {
        return EventFeeDiscountScheduleConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = EventTradingRewardCampaignUpdate.KotlinxSerializer::class)
@SerialName(value = EventTradingRewardCampaignUpdate.TYPE_URL)
public data class EventTradingRewardCampaignUpdate(
  @ProtobufIndex(index = 1)
  public val campaignInfo: TradingRewardCampaignInfo,
  @ProtobufIndex(index = 2)
  public val campaignRewardPools: List<CampaignRewardPool>,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String =
        "/injective.exchange.v1beta1.EventTradingRewardCampaignUpdate"
  }

  public object KotlinxSerializer : KSerializer<EventTradingRewardCampaignUpdate> {
    private val delegator: KSerializer<EventTradingRewardCampaignUpdate> =
        EventTradingRewardCampaignUpdate.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: EventTradingRewardCampaignUpdate):
        Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(EventTradingRewardCampaignUpdateConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): EventTradingRewardCampaignUpdate {
      if (decoder is ProtobufMapperDecoder) {
        return EventTradingRewardCampaignUpdateConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = EventTradingRewardDistribution.KotlinxSerializer::class)
@SerialName(value = EventTradingRewardDistribution.TYPE_URL)
public data class EventTradingRewardDistribution(
  @ProtobufIndex(index = 1)
  public val accountRewards: List<AccountRewards>,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/injective.exchange.v1beta1.EventTradingRewardDistribution"
  }

  public object KotlinxSerializer : KSerializer<EventTradingRewardDistribution> {
    private val delegator: KSerializer<EventTradingRewardDistribution> =
        EventTradingRewardDistribution.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: EventTradingRewardDistribution): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(EventTradingRewardDistributionConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): EventTradingRewardDistribution {
      if (decoder is ProtobufMapperDecoder) {
        return EventTradingRewardDistributionConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = EventNewConditionalDerivativeOrder.KotlinxSerializer::class)
@SerialName(value = EventNewConditionalDerivativeOrder.TYPE_URL)
public data class EventNewConditionalDerivativeOrder(
  @ProtobufIndex(index = 1)
  public val marketId: String,
  @ProtobufIndex(index = 2)
  public val order: DerivativeOrder,
  @ProtobufIndex(index = 3)
  public val hash: ByteArray,
  @ProtobufIndex(index = 4)
  public val isMarket: Boolean,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String =
        "/injective.exchange.v1beta1.EventNewConditionalDerivativeOrder"
  }

  public object KotlinxSerializer : KSerializer<EventNewConditionalDerivativeOrder> {
    private val delegator: KSerializer<EventNewConditionalDerivativeOrder> =
        EventNewConditionalDerivativeOrder.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: EventNewConditionalDerivativeOrder):
        Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(EventNewConditionalDerivativeOrderConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): EventNewConditionalDerivativeOrder {
      if (decoder is ProtobufMapperDecoder) {
        return EventNewConditionalDerivativeOrderConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = EventCancelConditionalDerivativeOrder.KotlinxSerializer::class)
@SerialName(value = EventCancelConditionalDerivativeOrder.TYPE_URL)
public data class EventCancelConditionalDerivativeOrder(
  @ProtobufIndex(index = 1)
  public val marketId: String,
  @ProtobufIndex(index = 2)
  public val isLimitCancel: Boolean,
  @ProtobufIndex(index = 3)
  public val limitOrder: DerivativeLimitOrder,
  @ProtobufIndex(index = 4)
  public val marketOrder: DerivativeMarketOrder,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String =
        "/injective.exchange.v1beta1.EventCancelConditionalDerivativeOrder"
  }

  public object KotlinxSerializer : KSerializer<EventCancelConditionalDerivativeOrder> {
    private val delegator: KSerializer<EventCancelConditionalDerivativeOrder> =
        EventCancelConditionalDerivativeOrder.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: EventCancelConditionalDerivativeOrder):
        Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(EventCancelConditionalDerivativeOrderConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): EventCancelConditionalDerivativeOrder {
      if (decoder is ProtobufMapperDecoder) {
        return EventCancelConditionalDerivativeOrderConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = EventConditionalDerivativeOrderTrigger.KotlinxSerializer::class)
@SerialName(value = EventConditionalDerivativeOrderTrigger.TYPE_URL)
public data class EventConditionalDerivativeOrderTrigger(
  @ProtobufIndex(index = 1)
  public val marketId: ByteArray,
  @ProtobufIndex(index = 2)
  public val isLimitTrigger: Boolean,
  @ProtobufIndex(index = 3)
  public val triggeredOrderHash: ByteArray,
  @ProtobufIndex(index = 4)
  public val placedOrderHash: ByteArray,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String =
        "/injective.exchange.v1beta1.EventConditionalDerivativeOrderTrigger"
  }

  public object KotlinxSerializer : KSerializer<EventConditionalDerivativeOrderTrigger> {
    private val delegator: KSerializer<EventConditionalDerivativeOrderTrigger> =
        EventConditionalDerivativeOrderTrigger.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder,
        `value`: EventConditionalDerivativeOrderTrigger): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(EventConditionalDerivativeOrderTriggerConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): EventConditionalDerivativeOrderTrigger {
      if (decoder is ProtobufMapperDecoder) {
        return EventConditionalDerivativeOrderTriggerConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = EventOrderFail.KotlinxSerializer::class)
@SerialName(value = EventOrderFail.TYPE_URL)
public data class EventOrderFail(
  @ProtobufIndex(index = 1)
  public val account: ByteArray,
  @ProtobufIndex(index = 2)
  public val hashes: List<ByteArray>,
  @ProtobufIndex(index = 3)
  public val flags: List<UInt>,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/injective.exchange.v1beta1.EventOrderFail"
  }

  public object KotlinxSerializer : KSerializer<EventOrderFail> {
    private val delegator: KSerializer<EventOrderFail> = EventOrderFail.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: EventOrderFail): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(EventOrderFailConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): EventOrderFail {
      if (decoder is ProtobufMapperDecoder) {
        return EventOrderFailConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = EventAtomicMarketOrderFeeMultipliersUpdated.KotlinxSerializer::class)
@SerialName(value = EventAtomicMarketOrderFeeMultipliersUpdated.TYPE_URL)
public data class EventAtomicMarketOrderFeeMultipliersUpdated(
  @ProtobufIndex(index = 1)
  public val marketFeeMultipliers: List<MarketFeeMultiplier>,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String =
        "/injective.exchange.v1beta1.EventAtomicMarketOrderFeeMultipliersUpdated"
  }

  public object KotlinxSerializer : KSerializer<EventAtomicMarketOrderFeeMultipliersUpdated> {
    private val delegator: KSerializer<EventAtomicMarketOrderFeeMultipliersUpdated> =
        EventAtomicMarketOrderFeeMultipliersUpdated.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder,
        `value`: EventAtomicMarketOrderFeeMultipliersUpdated): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(EventAtomicMarketOrderFeeMultipliersUpdatedConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): EventAtomicMarketOrderFeeMultipliersUpdated {
      if (decoder is ProtobufMapperDecoder) {
        return EventAtomicMarketOrderFeeMultipliersUpdatedConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = EventOrderbookUpdate.KotlinxSerializer::class)
@SerialName(value = EventOrderbookUpdate.TYPE_URL)
public data class EventOrderbookUpdate(
  @ProtobufIndex(index = 1)
  public val spotUpdates: List<OrderbookUpdate>,
  @ProtobufIndex(index = 2)
  public val derivativeUpdates: List<OrderbookUpdate>,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/injective.exchange.v1beta1.EventOrderbookUpdate"
  }

  public object KotlinxSerializer : KSerializer<EventOrderbookUpdate> {
    private val delegator: KSerializer<EventOrderbookUpdate> = EventOrderbookUpdate.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: EventOrderbookUpdate): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(EventOrderbookUpdateConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): EventOrderbookUpdate {
      if (decoder is ProtobufMapperDecoder) {
        return EventOrderbookUpdateConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = OrderbookUpdate.KotlinxSerializer::class)
@SerialName(value = OrderbookUpdate.TYPE_URL)
public data class OrderbookUpdate(
  @ProtobufIndex(index = 1)
  public val seq: ULong,
  @ProtobufIndex(index = 2)
  public val orderbook: Orderbook,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/injective.exchange.v1beta1.OrderbookUpdate"
  }

  public object KotlinxSerializer : KSerializer<OrderbookUpdate> {
    private val delegator: KSerializer<OrderbookUpdate> = OrderbookUpdate.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: OrderbookUpdate): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(OrderbookUpdateConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): OrderbookUpdate {
      if (decoder is ProtobufMapperDecoder) {
        return OrderbookUpdateConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = Orderbook.KotlinxSerializer::class)
@SerialName(value = Orderbook.TYPE_URL)
public data class Orderbook(
  @ProtobufIndex(index = 1)
  public val marketId: ByteArray,
  @ProtobufIndex(index = 2)
  public val buyLevels: List<Level>,
  @ProtobufIndex(index = 3)
  public val sellLevels: List<Level>,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/injective.exchange.v1beta1.Orderbook"
  }

  public object KotlinxSerializer : KSerializer<Orderbook> {
    private val delegator: KSerializer<Orderbook> = Orderbook.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: Orderbook): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(OrderbookConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): Orderbook {
      if (decoder is ProtobufMapperDecoder) {
        return OrderbookConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}
