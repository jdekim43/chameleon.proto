// Transform from injective/ocr/v1beta1/query.proto
@file:ProtobufSyntax(syntax = "PROTO3")
@file:GeneratorVersion(version = "0.3.1")

package injective.ocr.v1beta1

import cosmos.base.v1beta1.Coin
import kotlin.ByteArray
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

@Serializable(with = QueryParamsRequest.KotlinxSerializer::class)
@SerialName(value = QueryParamsRequest.TYPE_URL)
public class QueryParamsRequest() : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/injective.ocr.v1beta1.QueryParamsRequest"
  }

  public object KotlinxSerializer : KSerializer<QueryParamsRequest> {
    private val delegator: KSerializer<QueryParamsRequest> = QueryParamsRequest.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: QueryParamsRequest): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(QueryParamsRequestConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): QueryParamsRequest {
      if (decoder is ProtobufMapperDecoder) {
        return QueryParamsRequestConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = QueryParamsResponse.KotlinxSerializer::class)
@SerialName(value = QueryParamsResponse.TYPE_URL)
public data class QueryParamsResponse(
  @ProtobufIndex(index = 1)
  public val params: Params,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/injective.ocr.v1beta1.QueryParamsResponse"
  }

  public object KotlinxSerializer : KSerializer<QueryParamsResponse> {
    private val delegator: KSerializer<QueryParamsResponse> = QueryParamsResponse.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: QueryParamsResponse): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(QueryParamsResponseConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): QueryParamsResponse {
      if (decoder is ProtobufMapperDecoder) {
        return QueryParamsResponseConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = QueryFeedConfigRequest.KotlinxSerializer::class)
@SerialName(value = QueryFeedConfigRequest.TYPE_URL)
public data class QueryFeedConfigRequest(
  @ProtobufIndex(index = 1)
  public val feedId: String,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/injective.ocr.v1beta1.QueryFeedConfigRequest"
  }

  public object KotlinxSerializer : KSerializer<QueryFeedConfigRequest> {
    private val delegator: KSerializer<QueryFeedConfigRequest> = QueryFeedConfigRequest.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: QueryFeedConfigRequest): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(QueryFeedConfigRequestConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): QueryFeedConfigRequest {
      if (decoder is ProtobufMapperDecoder) {
        return QueryFeedConfigRequestConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = QueryFeedConfigResponse.KotlinxSerializer::class)
@SerialName(value = QueryFeedConfigResponse.TYPE_URL)
public data class QueryFeedConfigResponse(
  @ProtobufIndex(index = 1)
  public val feedConfigInfo: FeedConfigInfo,
  @ProtobufIndex(index = 2)
  public val feedConfig: FeedConfig,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/injective.ocr.v1beta1.QueryFeedConfigResponse"
  }

  public object KotlinxSerializer : KSerializer<QueryFeedConfigResponse> {
    private val delegator: KSerializer<QueryFeedConfigResponse> =
        QueryFeedConfigResponse.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: QueryFeedConfigResponse): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(QueryFeedConfigResponseConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): QueryFeedConfigResponse {
      if (decoder is ProtobufMapperDecoder) {
        return QueryFeedConfigResponseConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = QueryFeedConfigInfoRequest.KotlinxSerializer::class)
@SerialName(value = QueryFeedConfigInfoRequest.TYPE_URL)
public data class QueryFeedConfigInfoRequest(
  @ProtobufIndex(index = 1)
  public val feedId: String,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/injective.ocr.v1beta1.QueryFeedConfigInfoRequest"
  }

  public object KotlinxSerializer : KSerializer<QueryFeedConfigInfoRequest> {
    private val delegator: KSerializer<QueryFeedConfigInfoRequest> =
        QueryFeedConfigInfoRequest.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: QueryFeedConfigInfoRequest): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(QueryFeedConfigInfoRequestConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): QueryFeedConfigInfoRequest {
      if (decoder is ProtobufMapperDecoder) {
        return QueryFeedConfigInfoRequestConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = QueryFeedConfigInfoResponse.KotlinxSerializer::class)
@SerialName(value = QueryFeedConfigInfoResponse.TYPE_URL)
public data class QueryFeedConfigInfoResponse(
  @ProtobufIndex(index = 1)
  public val feedConfigInfo: FeedConfigInfo,
  @ProtobufIndex(index = 2)
  public val epochAndRound: EpochAndRound,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/injective.ocr.v1beta1.QueryFeedConfigInfoResponse"
  }

  public object KotlinxSerializer : KSerializer<QueryFeedConfigInfoResponse> {
    private val delegator: KSerializer<QueryFeedConfigInfoResponse> =
        QueryFeedConfigInfoResponse.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: QueryFeedConfigInfoResponse): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(QueryFeedConfigInfoResponseConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): QueryFeedConfigInfoResponse {
      if (decoder is ProtobufMapperDecoder) {
        return QueryFeedConfigInfoResponseConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = QueryLatestRoundRequest.KotlinxSerializer::class)
@SerialName(value = QueryLatestRoundRequest.TYPE_URL)
public data class QueryLatestRoundRequest(
  @ProtobufIndex(index = 1)
  public val feedId: String,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/injective.ocr.v1beta1.QueryLatestRoundRequest"
  }

  public object KotlinxSerializer : KSerializer<QueryLatestRoundRequest> {
    private val delegator: KSerializer<QueryLatestRoundRequest> =
        QueryLatestRoundRequest.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: QueryLatestRoundRequest): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(QueryLatestRoundRequestConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): QueryLatestRoundRequest {
      if (decoder is ProtobufMapperDecoder) {
        return QueryLatestRoundRequestConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = QueryLatestRoundResponse.KotlinxSerializer::class)
@SerialName(value = QueryLatestRoundResponse.TYPE_URL)
public data class QueryLatestRoundResponse(
  @ProtobufIndex(index = 1)
  public val latestRoundId: ULong,
  @ProtobufIndex(index = 2)
  public val `data`: Transmission,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/injective.ocr.v1beta1.QueryLatestRoundResponse"
  }

  public object KotlinxSerializer : KSerializer<QueryLatestRoundResponse> {
    private val delegator: KSerializer<QueryLatestRoundResponse> =
        QueryLatestRoundResponse.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: QueryLatestRoundResponse): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(QueryLatestRoundResponseConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): QueryLatestRoundResponse {
      if (decoder is ProtobufMapperDecoder) {
        return QueryLatestRoundResponseConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = QueryLatestTransmissionDetailsRequest.KotlinxSerializer::class)
@SerialName(value = QueryLatestTransmissionDetailsRequest.TYPE_URL)
public data class QueryLatestTransmissionDetailsRequest(
  @ProtobufIndex(index = 1)
  public val feedId: String,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String =
        "/injective.ocr.v1beta1.QueryLatestTransmissionDetailsRequest"
  }

  public object KotlinxSerializer : KSerializer<QueryLatestTransmissionDetailsRequest> {
    private val delegator: KSerializer<QueryLatestTransmissionDetailsRequest> =
        QueryLatestTransmissionDetailsRequest.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: QueryLatestTransmissionDetailsRequest):
        Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(QueryLatestTransmissionDetailsRequestConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): QueryLatestTransmissionDetailsRequest {
      if (decoder is ProtobufMapperDecoder) {
        return QueryLatestTransmissionDetailsRequestConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = QueryLatestTransmissionDetailsResponse.KotlinxSerializer::class)
@SerialName(value = QueryLatestTransmissionDetailsResponse.TYPE_URL)
public data class QueryLatestTransmissionDetailsResponse(
  @ProtobufIndex(index = 1)
  public val configDigest: ByteArray,
  @ProtobufIndex(index = 2)
  public val epochAndRound: EpochAndRound,
  @ProtobufIndex(index = 3)
  public val `data`: Transmission,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String =
        "/injective.ocr.v1beta1.QueryLatestTransmissionDetailsResponse"
  }

  public object KotlinxSerializer : KSerializer<QueryLatestTransmissionDetailsResponse> {
    private val delegator: KSerializer<QueryLatestTransmissionDetailsResponse> =
        QueryLatestTransmissionDetailsResponse.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder,
        `value`: QueryLatestTransmissionDetailsResponse): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(QueryLatestTransmissionDetailsResponseConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): QueryLatestTransmissionDetailsResponse {
      if (decoder is ProtobufMapperDecoder) {
        return QueryLatestTransmissionDetailsResponseConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = QueryOwedAmountRequest.KotlinxSerializer::class)
@SerialName(value = QueryOwedAmountRequest.TYPE_URL)
public data class QueryOwedAmountRequest(
  @ProtobufIndex(index = 1)
  public val transmitter: String,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/injective.ocr.v1beta1.QueryOwedAmountRequest"
  }

  public object KotlinxSerializer : KSerializer<QueryOwedAmountRequest> {
    private val delegator: KSerializer<QueryOwedAmountRequest> = QueryOwedAmountRequest.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: QueryOwedAmountRequest): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(QueryOwedAmountRequestConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): QueryOwedAmountRequest {
      if (decoder is ProtobufMapperDecoder) {
        return QueryOwedAmountRequestConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = QueryOwedAmountResponse.KotlinxSerializer::class)
@SerialName(value = QueryOwedAmountResponse.TYPE_URL)
public data class QueryOwedAmountResponse(
  @ProtobufIndex(index = 1)
  public val amount: Coin,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/injective.ocr.v1beta1.QueryOwedAmountResponse"
  }

  public object KotlinxSerializer : KSerializer<QueryOwedAmountResponse> {
    private val delegator: KSerializer<QueryOwedAmountResponse> =
        QueryOwedAmountResponse.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: QueryOwedAmountResponse): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(QueryOwedAmountResponseConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): QueryOwedAmountResponse {
      if (decoder is ProtobufMapperDecoder) {
        return QueryOwedAmountResponseConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = QueryModuleStateRequest.KotlinxSerializer::class)
@SerialName(value = QueryModuleStateRequest.TYPE_URL)
public class QueryModuleStateRequest() : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/injective.ocr.v1beta1.QueryModuleStateRequest"
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
    public const val TYPE_URL: String = "/injective.ocr.v1beta1.QueryModuleStateResponse"
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
