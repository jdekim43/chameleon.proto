// Transform from injective/stream/v1beta1/query.proto
@file:ProtobufSyntax(syntax = "PROTO3")
@file:GeneratorVersion(version = "0.3.1")

package injective.stream.v1beta1

import cosmos.base.v1beta1.Coin
import injective.exchange.v1beta1.Deposit
import injective.exchange.v1beta1.DerivativeLimitOrder
import injective.exchange.v1beta1.Level
import injective.exchange.v1beta1.PositionDelta
import injective.exchange.v1beta1.SpotLimitOrder
import kotlin.Boolean
import kotlin.ByteArray
import kotlin.Int
import kotlin.Long
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

@Serializable
@SerialName(value = "/injective.stream.v1beta1.OrderUpdateStatus")
public enum class OrderUpdateStatus(
  public val number: Int,
) {
  @ProtobufIndex(index = 0)
  Unspecified(0),
  @ProtobufIndex(index = 1)
  Booked(1),
  @ProtobufIndex(index = 2)
  Matched(2),
  @ProtobufIndex(index = 3)
  Cancelled(3),
  ;

  public companion object {
    public fun forNumber(number: Int): OrderUpdateStatus = OrderUpdateStatus.values()
    	.first { it.number == number }
  }
}

@Serializable(with = StreamRequest.KotlinxSerializer::class)
@SerialName(value = StreamRequest.TYPE_URL)
public data class StreamRequest(
  @ProtobufIndex(index = 1)
  public val bankBalancesFilter: BankBalancesFilter,
  @ProtobufIndex(index = 2)
  public val subaccountDepositsFilter: SubaccountDepositsFilter,
  @ProtobufIndex(index = 3)
  public val spotTradesFilter: TradesFilter,
  @ProtobufIndex(index = 4)
  public val derivativeTradesFilter: TradesFilter,
  @ProtobufIndex(index = 5)
  public val spotOrdersFilter: OrdersFilter,
  @ProtobufIndex(index = 6)
  public val derivativeOrdersFilter: OrdersFilter,
  @ProtobufIndex(index = 7)
  public val spotOrderbooksFilter: OrderbookFilter,
  @ProtobufIndex(index = 8)
  public val derivativeOrderbooksFilter: OrderbookFilter,
  @ProtobufIndex(index = 9)
  public val positionsFilter: PositionsFilter,
  @ProtobufIndex(index = 10)
  public val oraclePriceFilter: OraclePriceFilter,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/injective.stream.v1beta1.StreamRequest"
  }

  public object KotlinxSerializer : KSerializer<StreamRequest> {
    private val delegator: KSerializer<StreamRequest> = StreamRequest.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: StreamRequest): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(StreamRequestConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): StreamRequest {
      if (decoder is ProtobufMapperDecoder) {
        return StreamRequestConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = StreamResponse.KotlinxSerializer::class)
@SerialName(value = StreamResponse.TYPE_URL)
public data class StreamResponse(
  @ProtobufIndex(index = 1)
  public val blockHeight: ULong,
  @ProtobufIndex(index = 2)
  public val blockTime: Long,
  @ProtobufIndex(index = 3)
  public val bankBalances: List<BankBalance>,
  @ProtobufIndex(index = 4)
  public val subaccountDeposits: List<SubaccountDeposits>,
  @ProtobufIndex(index = 5)
  public val spotTrades: List<SpotTrade>,
  @ProtobufIndex(index = 6)
  public val derivativeTrades: List<DerivativeTrade>,
  @ProtobufIndex(index = 7)
  public val spotOrders: List<SpotOrderUpdate>,
  @ProtobufIndex(index = 8)
  public val derivativeOrders: List<DerivativeOrderUpdate>,
  @ProtobufIndex(index = 9)
  public val spotOrderbookUpdates: List<OrderbookUpdate>,
  @ProtobufIndex(index = 10)
  public val derivativeOrderbookUpdates: List<OrderbookUpdate>,
  @ProtobufIndex(index = 11)
  public val positions: List<Position>,
  @ProtobufIndex(index = 12)
  public val oraclePrices: List<OraclePrice>,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/injective.stream.v1beta1.StreamResponse"
  }

  public object KotlinxSerializer : KSerializer<StreamResponse> {
    private val delegator: KSerializer<StreamResponse> = StreamResponse.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: StreamResponse): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(StreamResponseConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): StreamResponse {
      if (decoder is ProtobufMapperDecoder) {
        return StreamResponseConverter.deserialize(decoder.decodeByteArray())
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
    public const val TYPE_URL: String = "/injective.stream.v1beta1.OrderbookUpdate"
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
  public val marketId: String,
  @ProtobufIndex(index = 2)
  public val buyLevels: List<Level>,
  @ProtobufIndex(index = 3)
  public val sellLevels: List<Level>,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/injective.stream.v1beta1.Orderbook"
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

@Serializable(with = BankBalance.KotlinxSerializer::class)
@SerialName(value = BankBalance.TYPE_URL)
public data class BankBalance(
  @ProtobufIndex(index = 1)
  public val account: String,
  @ProtobufIndex(index = 2)
  public val balances: List<Coin>,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/injective.stream.v1beta1.BankBalance"
  }

  public object KotlinxSerializer : KSerializer<BankBalance> {
    private val delegator: KSerializer<BankBalance> = BankBalance.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: BankBalance): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(BankBalanceConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): BankBalance {
      if (decoder is ProtobufMapperDecoder) {
        return BankBalanceConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = SubaccountDeposits.KotlinxSerializer::class)
@SerialName(value = SubaccountDeposits.TYPE_URL)
public data class SubaccountDeposits(
  @ProtobufIndex(index = 1)
  public val subaccountId: String,
  @ProtobufIndex(index = 2)
  public val deposits: List<SubaccountDeposit>,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/injective.stream.v1beta1.SubaccountDeposits"
  }

  public object KotlinxSerializer : KSerializer<SubaccountDeposits> {
    private val delegator: KSerializer<SubaccountDeposits> = SubaccountDeposits.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: SubaccountDeposits): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(SubaccountDepositsConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): SubaccountDeposits {
      if (decoder is ProtobufMapperDecoder) {
        return SubaccountDepositsConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = SubaccountDeposit.KotlinxSerializer::class)
@SerialName(value = SubaccountDeposit.TYPE_URL)
public data class SubaccountDeposit(
  @ProtobufIndex(index = 1)
  public val denom: String,
  @ProtobufIndex(index = 2)
  public val deposit: Deposit,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/injective.stream.v1beta1.SubaccountDeposit"
  }

  public object KotlinxSerializer : KSerializer<SubaccountDeposit> {
    private val delegator: KSerializer<SubaccountDeposit> = SubaccountDeposit.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: SubaccountDeposit): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(SubaccountDepositConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): SubaccountDeposit {
      if (decoder is ProtobufMapperDecoder) {
        return SubaccountDepositConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = SpotOrderUpdate.KotlinxSerializer::class)
@SerialName(value = SpotOrderUpdate.TYPE_URL)
public data class SpotOrderUpdate(
  @ProtobufIndex(index = 1)
  public val status: OrderUpdateStatus,
  @ProtobufIndex(index = 2)
  public val orderHash: ByteArray,
  @ProtobufIndex(index = 3)
  public val cid: String,
  @ProtobufIndex(index = 4)
  public val order: SpotOrder,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/injective.stream.v1beta1.SpotOrderUpdate"
  }

  public object KotlinxSerializer : KSerializer<SpotOrderUpdate> {
    private val delegator: KSerializer<SpotOrderUpdate> = SpotOrderUpdate.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: SpotOrderUpdate): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(SpotOrderUpdateConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): SpotOrderUpdate {
      if (decoder is ProtobufMapperDecoder) {
        return SpotOrderUpdateConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = SpotOrder.KotlinxSerializer::class)
@SerialName(value = SpotOrder.TYPE_URL)
public data class SpotOrder(
  @ProtobufIndex(index = 1)
  public val marketId: String,
  @ProtobufIndex(index = 2)
  public val order: SpotLimitOrder,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/injective.stream.v1beta1.SpotOrder"
  }

  public object KotlinxSerializer : KSerializer<SpotOrder> {
    private val delegator: KSerializer<SpotOrder> = SpotOrder.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: SpotOrder): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(SpotOrderConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): SpotOrder {
      if (decoder is ProtobufMapperDecoder) {
        return SpotOrderConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = DerivativeOrderUpdate.KotlinxSerializer::class)
@SerialName(value = DerivativeOrderUpdate.TYPE_URL)
public data class DerivativeOrderUpdate(
  @ProtobufIndex(index = 1)
  public val status: OrderUpdateStatus,
  @ProtobufIndex(index = 2)
  public val orderHash: ByteArray,
  @ProtobufIndex(index = 3)
  public val cid: String,
  @ProtobufIndex(index = 4)
  public val order: DerivativeOrder,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/injective.stream.v1beta1.DerivativeOrderUpdate"
  }

  public object KotlinxSerializer : KSerializer<DerivativeOrderUpdate> {
    private val delegator: KSerializer<DerivativeOrderUpdate> = DerivativeOrderUpdate.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: DerivativeOrderUpdate): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(DerivativeOrderUpdateConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): DerivativeOrderUpdate {
      if (decoder is ProtobufMapperDecoder) {
        return DerivativeOrderUpdateConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = DerivativeOrder.KotlinxSerializer::class)
@SerialName(value = DerivativeOrder.TYPE_URL)
public data class DerivativeOrder(
  @ProtobufIndex(index = 1)
  public val marketId: String,
  @ProtobufIndex(index = 2)
  public val order: DerivativeLimitOrder,
  @ProtobufIndex(index = 3)
  public val isMarket: Boolean,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/injective.stream.v1beta1.DerivativeOrder"
  }

  public object KotlinxSerializer : KSerializer<DerivativeOrder> {
    private val delegator: KSerializer<DerivativeOrder> = DerivativeOrder.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: DerivativeOrder): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(DerivativeOrderConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): DerivativeOrder {
      if (decoder is ProtobufMapperDecoder) {
        return DerivativeOrderConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = Position.KotlinxSerializer::class)
@SerialName(value = Position.TYPE_URL)
public data class Position(
  @ProtobufIndex(index = 1)
  public val marketId: String,
  @ProtobufIndex(index = 2)
  public val subaccountId: String,
  @ProtobufIndex(index = 3)
  public val isLong: Boolean,
  @ProtobufIndex(index = 4)
  public val quantity: String,
  @ProtobufIndex(index = 5)
  public val entryPrice: String,
  @ProtobufIndex(index = 6)
  public val margin: String,
  @ProtobufIndex(index = 7)
  public val cumulativeFundingEntry: String,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/injective.stream.v1beta1.Position"
  }

  public object KotlinxSerializer : KSerializer<Position> {
    private val delegator: KSerializer<Position> = Position.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: Position): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(PositionConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): Position {
      if (decoder is ProtobufMapperDecoder) {
        return PositionConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = OraclePrice.KotlinxSerializer::class)
@SerialName(value = OraclePrice.TYPE_URL)
public data class OraclePrice(
  @ProtobufIndex(index = 1)
  public val symbol: String,
  @ProtobufIndex(index = 2)
  public val price: String,
  @ProtobufIndex(index = 3)
  public val type: String,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/injective.stream.v1beta1.OraclePrice"
  }

  public object KotlinxSerializer : KSerializer<OraclePrice> {
    private val delegator: KSerializer<OraclePrice> = OraclePrice.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: OraclePrice): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(OraclePriceConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): OraclePrice {
      if (decoder is ProtobufMapperDecoder) {
        return OraclePriceConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = SpotTrade.KotlinxSerializer::class)
@SerialName(value = SpotTrade.TYPE_URL)
public data class SpotTrade(
  @ProtobufIndex(index = 1)
  public val marketId: String,
  @ProtobufIndex(index = 2)
  public val isBuy: Boolean,
  @ProtobufIndex(index = 3)
  public val executionType: String,
  @ProtobufIndex(index = 4)
  public val quantity: String,
  @ProtobufIndex(index = 5)
  public val price: String,
  @ProtobufIndex(index = 6)
  public val subaccountId: String,
  @ProtobufIndex(index = 7)
  public val fee: String,
  @ProtobufIndex(index = 8)
  public val orderHash: ByteArray,
  @ProtobufIndex(index = 9)
  public val feeRecipientAddress: String,
  @ProtobufIndex(index = 10)
  public val cid: String,
  @ProtobufIndex(index = 11)
  public val tradeId: String,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/injective.stream.v1beta1.SpotTrade"
  }

  public object KotlinxSerializer : KSerializer<SpotTrade> {
    private val delegator: KSerializer<SpotTrade> = SpotTrade.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: SpotTrade): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(SpotTradeConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): SpotTrade {
      if (decoder is ProtobufMapperDecoder) {
        return SpotTradeConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = DerivativeTrade.KotlinxSerializer::class)
@SerialName(value = DerivativeTrade.TYPE_URL)
public data class DerivativeTrade(
  @ProtobufIndex(index = 1)
  public val marketId: String,
  @ProtobufIndex(index = 2)
  public val isBuy: Boolean,
  @ProtobufIndex(index = 3)
  public val executionType: String,
  @ProtobufIndex(index = 4)
  public val subaccountId: String,
  @ProtobufIndex(index = 5)
  public val positionDelta: PositionDelta,
  @ProtobufIndex(index = 6)
  public val payout: String,
  @ProtobufIndex(index = 7)
  public val fee: String,
  @ProtobufIndex(index = 8)
  public val orderHash: String,
  @ProtobufIndex(index = 9)
  public val feeRecipientAddress: String,
  @ProtobufIndex(index = 10)
  public val cid: String,
  @ProtobufIndex(index = 11)
  public val tradeId: String,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/injective.stream.v1beta1.DerivativeTrade"
  }

  public object KotlinxSerializer : KSerializer<DerivativeTrade> {
    private val delegator: KSerializer<DerivativeTrade> = DerivativeTrade.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: DerivativeTrade): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(DerivativeTradeConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): DerivativeTrade {
      if (decoder is ProtobufMapperDecoder) {
        return DerivativeTradeConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = TradesFilter.KotlinxSerializer::class)
@SerialName(value = TradesFilter.TYPE_URL)
public data class TradesFilter(
  @ProtobufIndex(index = 1)
  public val subaccountIds: List<String>,
  @ProtobufIndex(index = 2)
  public val marketIds: List<String>,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/injective.stream.v1beta1.TradesFilter"
  }

  public object KotlinxSerializer : KSerializer<TradesFilter> {
    private val delegator: KSerializer<TradesFilter> = TradesFilter.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: TradesFilter): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(TradesFilterConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): TradesFilter {
      if (decoder is ProtobufMapperDecoder) {
        return TradesFilterConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = PositionsFilter.KotlinxSerializer::class)
@SerialName(value = PositionsFilter.TYPE_URL)
public data class PositionsFilter(
  @ProtobufIndex(index = 1)
  public val subaccountIds: List<String>,
  @ProtobufIndex(index = 2)
  public val marketIds: List<String>,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/injective.stream.v1beta1.PositionsFilter"
  }

  public object KotlinxSerializer : KSerializer<PositionsFilter> {
    private val delegator: KSerializer<PositionsFilter> = PositionsFilter.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: PositionsFilter): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(PositionsFilterConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): PositionsFilter {
      if (decoder is ProtobufMapperDecoder) {
        return PositionsFilterConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = OrdersFilter.KotlinxSerializer::class)
@SerialName(value = OrdersFilter.TYPE_URL)
public data class OrdersFilter(
  @ProtobufIndex(index = 1)
  public val subaccountIds: List<String>,
  @ProtobufIndex(index = 2)
  public val marketIds: List<String>,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/injective.stream.v1beta1.OrdersFilter"
  }

  public object KotlinxSerializer : KSerializer<OrdersFilter> {
    private val delegator: KSerializer<OrdersFilter> = OrdersFilter.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: OrdersFilter): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(OrdersFilterConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): OrdersFilter {
      if (decoder is ProtobufMapperDecoder) {
        return OrdersFilterConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = OrderbookFilter.KotlinxSerializer::class)
@SerialName(value = OrderbookFilter.TYPE_URL)
public data class OrderbookFilter(
  @ProtobufIndex(index = 1)
  public val marketIds: List<String>,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/injective.stream.v1beta1.OrderbookFilter"
  }

  public object KotlinxSerializer : KSerializer<OrderbookFilter> {
    private val delegator: KSerializer<OrderbookFilter> = OrderbookFilter.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: OrderbookFilter): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(OrderbookFilterConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): OrderbookFilter {
      if (decoder is ProtobufMapperDecoder) {
        return OrderbookFilterConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = BankBalancesFilter.KotlinxSerializer::class)
@SerialName(value = BankBalancesFilter.TYPE_URL)
public data class BankBalancesFilter(
  @ProtobufIndex(index = 1)
  public val accounts: List<String>,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/injective.stream.v1beta1.BankBalancesFilter"
  }

  public object KotlinxSerializer : KSerializer<BankBalancesFilter> {
    private val delegator: KSerializer<BankBalancesFilter> = BankBalancesFilter.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: BankBalancesFilter): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(BankBalancesFilterConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): BankBalancesFilter {
      if (decoder is ProtobufMapperDecoder) {
        return BankBalancesFilterConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = SubaccountDepositsFilter.KotlinxSerializer::class)
@SerialName(value = SubaccountDepositsFilter.TYPE_URL)
public data class SubaccountDepositsFilter(
  @ProtobufIndex(index = 1)
  public val subaccountIds: List<String>,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/injective.stream.v1beta1.SubaccountDepositsFilter"
  }

  public object KotlinxSerializer : KSerializer<SubaccountDepositsFilter> {
    private val delegator: KSerializer<SubaccountDepositsFilter> =
        SubaccountDepositsFilter.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: SubaccountDepositsFilter): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(SubaccountDepositsFilterConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): SubaccountDepositsFilter {
      if (decoder is ProtobufMapperDecoder) {
        return SubaccountDepositsFilterConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = OraclePriceFilter.KotlinxSerializer::class)
@SerialName(value = OraclePriceFilter.TYPE_URL)
public data class OraclePriceFilter(
  @ProtobufIndex(index = 1)
  public val symbol: List<String>,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/injective.stream.v1beta1.OraclePriceFilter"
  }

  public object KotlinxSerializer : KSerializer<OraclePriceFilter> {
    private val delegator: KSerializer<OraclePriceFilter> = OraclePriceFilter.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: OraclePriceFilter): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(OraclePriceFilterConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): OraclePriceFilter {
      if (decoder is ProtobufMapperDecoder) {
        return OraclePriceFilterConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}
