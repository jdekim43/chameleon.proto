// Transform from injective/auction/v1beta1/auction.proto
@file:ProtobufSyntax(syntax = "PROTO3")
@file:GeneratorVersion(version = "0.3.1")

package injective.auction.v1beta1

import cosmos.base.v1beta1.Coin
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

@Serializable(with = Params.KotlinxSerializer::class)
@SerialName(value = Params.TYPE_URL)
public data class Params(
  @ProtobufIndex(index = 1)
  public val auctionPeriod: Long,
  @ProtobufIndex(index = 2)
  public val minNextBidIncrementRate: String,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/injective.auction.v1beta1.Params"
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

@Serializable(with = Bid.KotlinxSerializer::class)
@SerialName(value = Bid.TYPE_URL)
public data class Bid(
  @ProtobufIndex(index = 1)
  public val bidder: String,
  @ProtobufIndex(index = 2)
  public val amount: String,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/injective.auction.v1beta1.Bid"
  }

  public object KotlinxSerializer : KSerializer<Bid> {
    private val delegator: KSerializer<Bid> = Bid.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: Bid): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(BidConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): Bid {
      if (decoder is ProtobufMapperDecoder) {
        return BidConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = EventBid.KotlinxSerializer::class)
@SerialName(value = EventBid.TYPE_URL)
public data class EventBid(
  @ProtobufIndex(index = 1)
  public val bidder: String,
  @ProtobufIndex(index = 2)
  public val amount: String,
  @ProtobufIndex(index = 3)
  public val round: ULong,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/injective.auction.v1beta1.EventBid"
  }

  public object KotlinxSerializer : KSerializer<EventBid> {
    private val delegator: KSerializer<EventBid> = EventBid.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: EventBid): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(EventBidConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): EventBid {
      if (decoder is ProtobufMapperDecoder) {
        return EventBidConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = EventAuctionResult.KotlinxSerializer::class)
@SerialName(value = EventAuctionResult.TYPE_URL)
public data class EventAuctionResult(
  @ProtobufIndex(index = 1)
  public val winner: String,
  @ProtobufIndex(index = 2)
  public val amount: String,
  @ProtobufIndex(index = 3)
  public val round: ULong,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/injective.auction.v1beta1.EventAuctionResult"
  }

  public object KotlinxSerializer : KSerializer<EventAuctionResult> {
    private val delegator: KSerializer<EventAuctionResult> = EventAuctionResult.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: EventAuctionResult): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(EventAuctionResultConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): EventAuctionResult {
      if (decoder is ProtobufMapperDecoder) {
        return EventAuctionResultConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = EventAuctionStart.KotlinxSerializer::class)
@SerialName(value = EventAuctionStart.TYPE_URL)
public data class EventAuctionStart(
  @ProtobufIndex(index = 1)
  public val round: ULong,
  @ProtobufIndex(index = 2)
  public val endingTimestamp: Long,
  @ProtobufIndex(index = 3)
  public val newBasket: List<Coin>,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/injective.auction.v1beta1.EventAuctionStart"
  }

  public object KotlinxSerializer : KSerializer<EventAuctionStart> {
    private val delegator: KSerializer<EventAuctionStart> = EventAuctionStart.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: EventAuctionStart): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(EventAuctionStartConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): EventAuctionStart {
      if (decoder is ProtobufMapperDecoder) {
        return EventAuctionStartConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}
