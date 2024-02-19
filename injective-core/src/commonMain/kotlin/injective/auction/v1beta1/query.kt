// Transform from injective/auction/v1beta1/query.proto
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

@Serializable(with = QueryAuctionParamsRequest.KotlinxSerializer::class)
@SerialName(value = QueryAuctionParamsRequest.TYPE_URL)
public class QueryAuctionParamsRequest() : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/injective.auction.v1beta1.QueryAuctionParamsRequest"
  }

  public object KotlinxSerializer : KSerializer<QueryAuctionParamsRequest> {
    private val delegator: KSerializer<QueryAuctionParamsRequest> =
        QueryAuctionParamsRequest.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: QueryAuctionParamsRequest): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(QueryAuctionParamsRequestConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): QueryAuctionParamsRequest {
      if (decoder is ProtobufMapperDecoder) {
        return QueryAuctionParamsRequestConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = QueryAuctionParamsResponse.KotlinxSerializer::class)
@SerialName(value = QueryAuctionParamsResponse.TYPE_URL)
public data class QueryAuctionParamsResponse(
  @ProtobufIndex(index = 1)
  public val params: Params,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/injective.auction.v1beta1.QueryAuctionParamsResponse"
  }

  public object KotlinxSerializer : KSerializer<QueryAuctionParamsResponse> {
    private val delegator: KSerializer<QueryAuctionParamsResponse> =
        QueryAuctionParamsResponse.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: QueryAuctionParamsResponse): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(QueryAuctionParamsResponseConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): QueryAuctionParamsResponse {
      if (decoder is ProtobufMapperDecoder) {
        return QueryAuctionParamsResponseConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = QueryCurrentAuctionBasketRequest.KotlinxSerializer::class)
@SerialName(value = QueryCurrentAuctionBasketRequest.TYPE_URL)
public class QueryCurrentAuctionBasketRequest() : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String =
        "/injective.auction.v1beta1.QueryCurrentAuctionBasketRequest"
  }

  public object KotlinxSerializer : KSerializer<QueryCurrentAuctionBasketRequest> {
    private val delegator: KSerializer<QueryCurrentAuctionBasketRequest> =
        QueryCurrentAuctionBasketRequest.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: QueryCurrentAuctionBasketRequest):
        Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(QueryCurrentAuctionBasketRequestConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): QueryCurrentAuctionBasketRequest {
      if (decoder is ProtobufMapperDecoder) {
        return QueryCurrentAuctionBasketRequestConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = QueryCurrentAuctionBasketResponse.KotlinxSerializer::class)
@SerialName(value = QueryCurrentAuctionBasketResponse.TYPE_URL)
public data class QueryCurrentAuctionBasketResponse(
  @ProtobufIndex(index = 1)
  public val amount: List<Coin>,
  @ProtobufIndex(index = 2)
  public val auctionRound: ULong,
  @ProtobufIndex(index = 3)
  public val auctionClosingTime: Long,
  @ProtobufIndex(index = 4)
  public val highestBidder: String,
  @ProtobufIndex(index = 5)
  public val highestBidAmount: String,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String =
        "/injective.auction.v1beta1.QueryCurrentAuctionBasketResponse"
  }

  public object KotlinxSerializer : KSerializer<QueryCurrentAuctionBasketResponse> {
    private val delegator: KSerializer<QueryCurrentAuctionBasketResponse> =
        QueryCurrentAuctionBasketResponse.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: QueryCurrentAuctionBasketResponse):
        Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(QueryCurrentAuctionBasketResponseConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): QueryCurrentAuctionBasketResponse {
      if (decoder is ProtobufMapperDecoder) {
        return QueryCurrentAuctionBasketResponseConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = QueryModuleStateRequest.KotlinxSerializer::class)
@SerialName(value = QueryModuleStateRequest.TYPE_URL)
public class QueryModuleStateRequest() : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/injective.auction.v1beta1.QueryModuleStateRequest"
  }

  public object KotlinxSerializer : KSerializer<QueryModuleStateRequest> {
    private val delegator: KSerializer<QueryModuleStateRequest> =
        QueryModuleStateRequest.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: QueryModuleStateRequest): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(QueryModuleStateRequestConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): QueryModuleStateRequest {
      if (decoder is ProtobufMapperDecoder) {
        return QueryModuleStateRequestConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = QueryModuleStateResponse.KotlinxSerializer::class)
@SerialName(value = QueryModuleStateResponse.TYPE_URL)
public data class QueryModuleStateResponse(
  @ProtobufIndex(index = 1)
  public val state: GenesisState,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/injective.auction.v1beta1.QueryModuleStateResponse"
  }

  public object KotlinxSerializer : KSerializer<QueryModuleStateResponse> {
    private val delegator: KSerializer<QueryModuleStateResponse> =
        QueryModuleStateResponse.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: QueryModuleStateResponse): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(QueryModuleStateResponseConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): QueryModuleStateResponse {
      if (decoder is ProtobufMapperDecoder) {
        return QueryModuleStateResponseConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}
