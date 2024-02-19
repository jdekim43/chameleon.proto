// Transform from injective/peggy/v1/query.proto
@file:ProtobufSyntax(syntax = "PROTO3")
@file:GeneratorVersion(version = "0.3.1")

package injective.peggy.v1

import kotlin.Boolean
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

@Serializable(with = QueryParamsRequest.KotlinxSerializer::class)
@SerialName(value = QueryParamsRequest.TYPE_URL)
public class QueryParamsRequest() : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/injective.peggy.v1.QueryParamsRequest"
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
    public const val TYPE_URL: String = "/injective.peggy.v1.QueryParamsResponse"
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

@Serializable(with = QueryCurrentValsetRequest.KotlinxSerializer::class)
@SerialName(value = QueryCurrentValsetRequest.TYPE_URL)
public class QueryCurrentValsetRequest() : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/injective.peggy.v1.QueryCurrentValsetRequest"
  }

  public object KotlinxSerializer : KSerializer<QueryCurrentValsetRequest> {
    private val delegator: KSerializer<QueryCurrentValsetRequest> =
        QueryCurrentValsetRequest.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: QueryCurrentValsetRequest): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(QueryCurrentValsetRequestConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): QueryCurrentValsetRequest {
      if (decoder is ProtobufMapperDecoder) {
        return QueryCurrentValsetRequestConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = QueryCurrentValsetResponse.KotlinxSerializer::class)
@SerialName(value = QueryCurrentValsetResponse.TYPE_URL)
public data class QueryCurrentValsetResponse(
  @ProtobufIndex(index = 1)
  public val valset: Valset,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/injective.peggy.v1.QueryCurrentValsetResponse"
  }

  public object KotlinxSerializer : KSerializer<QueryCurrentValsetResponse> {
    private val delegator: KSerializer<QueryCurrentValsetResponse> =
        QueryCurrentValsetResponse.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: QueryCurrentValsetResponse): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(QueryCurrentValsetResponseConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): QueryCurrentValsetResponse {
      if (decoder is ProtobufMapperDecoder) {
        return QueryCurrentValsetResponseConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = QueryValsetRequestRequest.KotlinxSerializer::class)
@SerialName(value = QueryValsetRequestRequest.TYPE_URL)
public data class QueryValsetRequestRequest(
  @ProtobufIndex(index = 1)
  public val nonce: ULong,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/injective.peggy.v1.QueryValsetRequestRequest"
  }

  public object KotlinxSerializer : KSerializer<QueryValsetRequestRequest> {
    private val delegator: KSerializer<QueryValsetRequestRequest> =
        QueryValsetRequestRequest.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: QueryValsetRequestRequest): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(QueryValsetRequestRequestConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): QueryValsetRequestRequest {
      if (decoder is ProtobufMapperDecoder) {
        return QueryValsetRequestRequestConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = QueryValsetRequestResponse.KotlinxSerializer::class)
@SerialName(value = QueryValsetRequestResponse.TYPE_URL)
public data class QueryValsetRequestResponse(
  @ProtobufIndex(index = 1)
  public val valset: Valset,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/injective.peggy.v1.QueryValsetRequestResponse"
  }

  public object KotlinxSerializer : KSerializer<QueryValsetRequestResponse> {
    private val delegator: KSerializer<QueryValsetRequestResponse> =
        QueryValsetRequestResponse.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: QueryValsetRequestResponse): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(QueryValsetRequestResponseConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): QueryValsetRequestResponse {
      if (decoder is ProtobufMapperDecoder) {
        return QueryValsetRequestResponseConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = QueryValsetConfirmRequest.KotlinxSerializer::class)
@SerialName(value = QueryValsetConfirmRequest.TYPE_URL)
public data class QueryValsetConfirmRequest(
  @ProtobufIndex(index = 1)
  public val nonce: ULong,
  @ProtobufIndex(index = 2)
  public val address: String,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/injective.peggy.v1.QueryValsetConfirmRequest"
  }

  public object KotlinxSerializer : KSerializer<QueryValsetConfirmRequest> {
    private val delegator: KSerializer<QueryValsetConfirmRequest> =
        QueryValsetConfirmRequest.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: QueryValsetConfirmRequest): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(QueryValsetConfirmRequestConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): QueryValsetConfirmRequest {
      if (decoder is ProtobufMapperDecoder) {
        return QueryValsetConfirmRequestConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = QueryValsetConfirmResponse.KotlinxSerializer::class)
@SerialName(value = QueryValsetConfirmResponse.TYPE_URL)
public data class QueryValsetConfirmResponse(
  @ProtobufIndex(index = 1)
  public val confirm: MsgValsetConfirm,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/injective.peggy.v1.QueryValsetConfirmResponse"
  }

  public object KotlinxSerializer : KSerializer<QueryValsetConfirmResponse> {
    private val delegator: KSerializer<QueryValsetConfirmResponse> =
        QueryValsetConfirmResponse.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: QueryValsetConfirmResponse): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(QueryValsetConfirmResponseConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): QueryValsetConfirmResponse {
      if (decoder is ProtobufMapperDecoder) {
        return QueryValsetConfirmResponseConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = QueryValsetConfirmsByNonceRequest.KotlinxSerializer::class)
@SerialName(value = QueryValsetConfirmsByNonceRequest.TYPE_URL)
public data class QueryValsetConfirmsByNonceRequest(
  @ProtobufIndex(index = 1)
  public val nonce: ULong,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/injective.peggy.v1.QueryValsetConfirmsByNonceRequest"
  }

  public object KotlinxSerializer : KSerializer<QueryValsetConfirmsByNonceRequest> {
    private val delegator: KSerializer<QueryValsetConfirmsByNonceRequest> =
        QueryValsetConfirmsByNonceRequest.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: QueryValsetConfirmsByNonceRequest):
        Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(QueryValsetConfirmsByNonceRequestConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): QueryValsetConfirmsByNonceRequest {
      if (decoder is ProtobufMapperDecoder) {
        return QueryValsetConfirmsByNonceRequestConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = QueryValsetConfirmsByNonceResponse.KotlinxSerializer::class)
@SerialName(value = QueryValsetConfirmsByNonceResponse.TYPE_URL)
public data class QueryValsetConfirmsByNonceResponse(
  @ProtobufIndex(index = 1)
  public val confirms: List<MsgValsetConfirm>,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/injective.peggy.v1.QueryValsetConfirmsByNonceResponse"
  }

  public object KotlinxSerializer : KSerializer<QueryValsetConfirmsByNonceResponse> {
    private val delegator: KSerializer<QueryValsetConfirmsByNonceResponse> =
        QueryValsetConfirmsByNonceResponse.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: QueryValsetConfirmsByNonceResponse):
        Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(QueryValsetConfirmsByNonceResponseConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): QueryValsetConfirmsByNonceResponse {
      if (decoder is ProtobufMapperDecoder) {
        return QueryValsetConfirmsByNonceResponseConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = QueryLastValsetRequestsRequest.KotlinxSerializer::class)
@SerialName(value = QueryLastValsetRequestsRequest.TYPE_URL)
public class QueryLastValsetRequestsRequest() : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/injective.peggy.v1.QueryLastValsetRequestsRequest"
  }

  public object KotlinxSerializer : KSerializer<QueryLastValsetRequestsRequest> {
    private val delegator: KSerializer<QueryLastValsetRequestsRequest> =
        QueryLastValsetRequestsRequest.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: QueryLastValsetRequestsRequest): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(QueryLastValsetRequestsRequestConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): QueryLastValsetRequestsRequest {
      if (decoder is ProtobufMapperDecoder) {
        return QueryLastValsetRequestsRequestConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = QueryLastValsetRequestsResponse.KotlinxSerializer::class)
@SerialName(value = QueryLastValsetRequestsResponse.TYPE_URL)
public data class QueryLastValsetRequestsResponse(
  @ProtobufIndex(index = 1)
  public val valsets: List<Valset>,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/injective.peggy.v1.QueryLastValsetRequestsResponse"
  }

  public object KotlinxSerializer : KSerializer<QueryLastValsetRequestsResponse> {
    private val delegator: KSerializer<QueryLastValsetRequestsResponse> =
        QueryLastValsetRequestsResponse.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: QueryLastValsetRequestsResponse):
        Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(QueryLastValsetRequestsResponseConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): QueryLastValsetRequestsResponse {
      if (decoder is ProtobufMapperDecoder) {
        return QueryLastValsetRequestsResponseConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = QueryLastPendingValsetRequestByAddrRequest.KotlinxSerializer::class)
@SerialName(value = QueryLastPendingValsetRequestByAddrRequest.TYPE_URL)
public data class QueryLastPendingValsetRequestByAddrRequest(
  @ProtobufIndex(index = 1)
  public val address: String,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String =
        "/injective.peggy.v1.QueryLastPendingValsetRequestByAddrRequest"
  }

  public object KotlinxSerializer : KSerializer<QueryLastPendingValsetRequestByAddrRequest> {
    private val delegator: KSerializer<QueryLastPendingValsetRequestByAddrRequest> =
        QueryLastPendingValsetRequestByAddrRequest.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder,
        `value`: QueryLastPendingValsetRequestByAddrRequest): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(QueryLastPendingValsetRequestByAddrRequestConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): QueryLastPendingValsetRequestByAddrRequest {
      if (decoder is ProtobufMapperDecoder) {
        return QueryLastPendingValsetRequestByAddrRequestConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = QueryLastPendingValsetRequestByAddrResponse.KotlinxSerializer::class)
@SerialName(value = QueryLastPendingValsetRequestByAddrResponse.TYPE_URL)
public data class QueryLastPendingValsetRequestByAddrResponse(
  @ProtobufIndex(index = 1)
  public val valsets: List<Valset>,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String =
        "/injective.peggy.v1.QueryLastPendingValsetRequestByAddrResponse"
  }

  public object KotlinxSerializer : KSerializer<QueryLastPendingValsetRequestByAddrResponse> {
    private val delegator: KSerializer<QueryLastPendingValsetRequestByAddrResponse> =
        QueryLastPendingValsetRequestByAddrResponse.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder,
        `value`: QueryLastPendingValsetRequestByAddrResponse): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(QueryLastPendingValsetRequestByAddrResponseConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): QueryLastPendingValsetRequestByAddrResponse {
      if (decoder is ProtobufMapperDecoder) {
        return QueryLastPendingValsetRequestByAddrResponseConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = QueryBatchFeeRequest.KotlinxSerializer::class)
@SerialName(value = QueryBatchFeeRequest.TYPE_URL)
public class QueryBatchFeeRequest() : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/injective.peggy.v1.QueryBatchFeeRequest"
  }

  public object KotlinxSerializer : KSerializer<QueryBatchFeeRequest> {
    private val delegator: KSerializer<QueryBatchFeeRequest> = QueryBatchFeeRequest.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: QueryBatchFeeRequest): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(QueryBatchFeeRequestConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): QueryBatchFeeRequest {
      if (decoder is ProtobufMapperDecoder) {
        return QueryBatchFeeRequestConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = QueryBatchFeeResponse.KotlinxSerializer::class)
@SerialName(value = QueryBatchFeeResponse.TYPE_URL)
public data class QueryBatchFeeResponse(
  @ProtobufIndex(index = 1)
  public val batchFees: List<BatchFees>,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/injective.peggy.v1.QueryBatchFeeResponse"
  }

  public object KotlinxSerializer : KSerializer<QueryBatchFeeResponse> {
    private val delegator: KSerializer<QueryBatchFeeResponse> = QueryBatchFeeResponse.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: QueryBatchFeeResponse): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(QueryBatchFeeResponseConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): QueryBatchFeeResponse {
      if (decoder is ProtobufMapperDecoder) {
        return QueryBatchFeeResponseConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = QueryLastPendingBatchRequestByAddrRequest.KotlinxSerializer::class)
@SerialName(value = QueryLastPendingBatchRequestByAddrRequest.TYPE_URL)
public data class QueryLastPendingBatchRequestByAddrRequest(
  @ProtobufIndex(index = 1)
  public val address: String,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String =
        "/injective.peggy.v1.QueryLastPendingBatchRequestByAddrRequest"
  }

  public object KotlinxSerializer : KSerializer<QueryLastPendingBatchRequestByAddrRequest> {
    private val delegator: KSerializer<QueryLastPendingBatchRequestByAddrRequest> =
        QueryLastPendingBatchRequestByAddrRequest.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder,
        `value`: QueryLastPendingBatchRequestByAddrRequest): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(QueryLastPendingBatchRequestByAddrRequestConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): QueryLastPendingBatchRequestByAddrRequest {
      if (decoder is ProtobufMapperDecoder) {
        return QueryLastPendingBatchRequestByAddrRequestConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = QueryLastPendingBatchRequestByAddrResponse.KotlinxSerializer::class)
@SerialName(value = QueryLastPendingBatchRequestByAddrResponse.TYPE_URL)
public data class QueryLastPendingBatchRequestByAddrResponse(
  @ProtobufIndex(index = 1)
  public val batch: OutgoingTxBatch,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String =
        "/injective.peggy.v1.QueryLastPendingBatchRequestByAddrResponse"
  }

  public object KotlinxSerializer : KSerializer<QueryLastPendingBatchRequestByAddrResponse> {
    private val delegator: KSerializer<QueryLastPendingBatchRequestByAddrResponse> =
        QueryLastPendingBatchRequestByAddrResponse.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder,
        `value`: QueryLastPendingBatchRequestByAddrResponse): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(QueryLastPendingBatchRequestByAddrResponseConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): QueryLastPendingBatchRequestByAddrResponse {
      if (decoder is ProtobufMapperDecoder) {
        return QueryLastPendingBatchRequestByAddrResponseConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = QueryOutgoingTxBatchesRequest.KotlinxSerializer::class)
@SerialName(value = QueryOutgoingTxBatchesRequest.TYPE_URL)
public class QueryOutgoingTxBatchesRequest() : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/injective.peggy.v1.QueryOutgoingTxBatchesRequest"
  }

  public object KotlinxSerializer : KSerializer<QueryOutgoingTxBatchesRequest> {
    private val delegator: KSerializer<QueryOutgoingTxBatchesRequest> =
        QueryOutgoingTxBatchesRequest.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: QueryOutgoingTxBatchesRequest): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(QueryOutgoingTxBatchesRequestConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): QueryOutgoingTxBatchesRequest {
      if (decoder is ProtobufMapperDecoder) {
        return QueryOutgoingTxBatchesRequestConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = QueryOutgoingTxBatchesResponse.KotlinxSerializer::class)
@SerialName(value = QueryOutgoingTxBatchesResponse.TYPE_URL)
public data class QueryOutgoingTxBatchesResponse(
  @ProtobufIndex(index = 1)
  public val batches: List<OutgoingTxBatch>,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/injective.peggy.v1.QueryOutgoingTxBatchesResponse"
  }

  public object KotlinxSerializer : KSerializer<QueryOutgoingTxBatchesResponse> {
    private val delegator: KSerializer<QueryOutgoingTxBatchesResponse> =
        QueryOutgoingTxBatchesResponse.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: QueryOutgoingTxBatchesResponse): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(QueryOutgoingTxBatchesResponseConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): QueryOutgoingTxBatchesResponse {
      if (decoder is ProtobufMapperDecoder) {
        return QueryOutgoingTxBatchesResponseConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = QueryBatchRequestByNonceRequest.KotlinxSerializer::class)
@SerialName(value = QueryBatchRequestByNonceRequest.TYPE_URL)
public data class QueryBatchRequestByNonceRequest(
  @ProtobufIndex(index = 1)
  public val nonce: ULong,
  @ProtobufIndex(index = 2)
  public val contractAddress: String,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/injective.peggy.v1.QueryBatchRequestByNonceRequest"
  }

  public object KotlinxSerializer : KSerializer<QueryBatchRequestByNonceRequest> {
    private val delegator: KSerializer<QueryBatchRequestByNonceRequest> =
        QueryBatchRequestByNonceRequest.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: QueryBatchRequestByNonceRequest):
        Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(QueryBatchRequestByNonceRequestConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): QueryBatchRequestByNonceRequest {
      if (decoder is ProtobufMapperDecoder) {
        return QueryBatchRequestByNonceRequestConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = QueryBatchRequestByNonceResponse.KotlinxSerializer::class)
@SerialName(value = QueryBatchRequestByNonceResponse.TYPE_URL)
public data class QueryBatchRequestByNonceResponse(
  @ProtobufIndex(index = 1)
  public val batch: OutgoingTxBatch,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/injective.peggy.v1.QueryBatchRequestByNonceResponse"
  }

  public object KotlinxSerializer : KSerializer<QueryBatchRequestByNonceResponse> {
    private val delegator: KSerializer<QueryBatchRequestByNonceResponse> =
        QueryBatchRequestByNonceResponse.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: QueryBatchRequestByNonceResponse):
        Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(QueryBatchRequestByNonceResponseConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): QueryBatchRequestByNonceResponse {
      if (decoder is ProtobufMapperDecoder) {
        return QueryBatchRequestByNonceResponseConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = QueryBatchConfirmsRequest.KotlinxSerializer::class)
@SerialName(value = QueryBatchConfirmsRequest.TYPE_URL)
public data class QueryBatchConfirmsRequest(
  @ProtobufIndex(index = 1)
  public val nonce: ULong,
  @ProtobufIndex(index = 2)
  public val contractAddress: String,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/injective.peggy.v1.QueryBatchConfirmsRequest"
  }

  public object KotlinxSerializer : KSerializer<QueryBatchConfirmsRequest> {
    private val delegator: KSerializer<QueryBatchConfirmsRequest> =
        QueryBatchConfirmsRequest.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: QueryBatchConfirmsRequest): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(QueryBatchConfirmsRequestConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): QueryBatchConfirmsRequest {
      if (decoder is ProtobufMapperDecoder) {
        return QueryBatchConfirmsRequestConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = QueryBatchConfirmsResponse.KotlinxSerializer::class)
@SerialName(value = QueryBatchConfirmsResponse.TYPE_URL)
public data class QueryBatchConfirmsResponse(
  @ProtobufIndex(index = 1)
  public val confirms: List<MsgConfirmBatch>,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/injective.peggy.v1.QueryBatchConfirmsResponse"
  }

  public object KotlinxSerializer : KSerializer<QueryBatchConfirmsResponse> {
    private val delegator: KSerializer<QueryBatchConfirmsResponse> =
        QueryBatchConfirmsResponse.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: QueryBatchConfirmsResponse): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(QueryBatchConfirmsResponseConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): QueryBatchConfirmsResponse {
      if (decoder is ProtobufMapperDecoder) {
        return QueryBatchConfirmsResponseConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = QueryLastEventByAddrRequest.KotlinxSerializer::class)
@SerialName(value = QueryLastEventByAddrRequest.TYPE_URL)
public data class QueryLastEventByAddrRequest(
  @ProtobufIndex(index = 1)
  public val address: String,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/injective.peggy.v1.QueryLastEventByAddrRequest"
  }

  public object KotlinxSerializer : KSerializer<QueryLastEventByAddrRequest> {
    private val delegator: KSerializer<QueryLastEventByAddrRequest> =
        QueryLastEventByAddrRequest.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: QueryLastEventByAddrRequest): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(QueryLastEventByAddrRequestConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): QueryLastEventByAddrRequest {
      if (decoder is ProtobufMapperDecoder) {
        return QueryLastEventByAddrRequestConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = QueryLastEventByAddrResponse.KotlinxSerializer::class)
@SerialName(value = QueryLastEventByAddrResponse.TYPE_URL)
public data class QueryLastEventByAddrResponse(
  @ProtobufIndex(index = 1)
  public val lastClaimEvent: LastClaimEvent,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/injective.peggy.v1.QueryLastEventByAddrResponse"
  }

  public object KotlinxSerializer : KSerializer<QueryLastEventByAddrResponse> {
    private val delegator: KSerializer<QueryLastEventByAddrResponse> =
        QueryLastEventByAddrResponse.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: QueryLastEventByAddrResponse): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(QueryLastEventByAddrResponseConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): QueryLastEventByAddrResponse {
      if (decoder is ProtobufMapperDecoder) {
        return QueryLastEventByAddrResponseConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = QueryERC20ToDenomRequest.KotlinxSerializer::class)
@SerialName(value = QueryERC20ToDenomRequest.TYPE_URL)
public data class QueryERC20ToDenomRequest(
  @ProtobufIndex(index = 1)
  public val erc20: String,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/injective.peggy.v1.QueryERC20ToDenomRequest"
  }

  public object KotlinxSerializer : KSerializer<QueryERC20ToDenomRequest> {
    private val delegator: KSerializer<QueryERC20ToDenomRequest> =
        QueryERC20ToDenomRequest.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: QueryERC20ToDenomRequest): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(QueryERC20ToDenomRequestConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): QueryERC20ToDenomRequest {
      if (decoder is ProtobufMapperDecoder) {
        return QueryERC20ToDenomRequestConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = QueryERC20ToDenomResponse.KotlinxSerializer::class)
@SerialName(value = QueryERC20ToDenomResponse.TYPE_URL)
public data class QueryERC20ToDenomResponse(
  @ProtobufIndex(index = 1)
  public val denom: String,
  @ProtobufIndex(index = 2)
  public val cosmosOriginated: Boolean,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/injective.peggy.v1.QueryERC20ToDenomResponse"
  }

  public object KotlinxSerializer : KSerializer<QueryERC20ToDenomResponse> {
    private val delegator: KSerializer<QueryERC20ToDenomResponse> =
        QueryERC20ToDenomResponse.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: QueryERC20ToDenomResponse): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(QueryERC20ToDenomResponseConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): QueryERC20ToDenomResponse {
      if (decoder is ProtobufMapperDecoder) {
        return QueryERC20ToDenomResponseConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = QueryDenomToERC20Request.KotlinxSerializer::class)
@SerialName(value = QueryDenomToERC20Request.TYPE_URL)
public data class QueryDenomToERC20Request(
  @ProtobufIndex(index = 1)
  public val denom: String,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/injective.peggy.v1.QueryDenomToERC20Request"
  }

  public object KotlinxSerializer : KSerializer<QueryDenomToERC20Request> {
    private val delegator: KSerializer<QueryDenomToERC20Request> =
        QueryDenomToERC20Request.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: QueryDenomToERC20Request): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(QueryDenomToERC20RequestConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): QueryDenomToERC20Request {
      if (decoder is ProtobufMapperDecoder) {
        return QueryDenomToERC20RequestConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = QueryDenomToERC20Response.KotlinxSerializer::class)
@SerialName(value = QueryDenomToERC20Response.TYPE_URL)
public data class QueryDenomToERC20Response(
  @ProtobufIndex(index = 1)
  public val erc20: String,
  @ProtobufIndex(index = 2)
  public val cosmosOriginated: Boolean,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/injective.peggy.v1.QueryDenomToERC20Response"
  }

  public object KotlinxSerializer : KSerializer<QueryDenomToERC20Response> {
    private val delegator: KSerializer<QueryDenomToERC20Response> =
        QueryDenomToERC20Response.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: QueryDenomToERC20Response): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(QueryDenomToERC20ResponseConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): QueryDenomToERC20Response {
      if (decoder is ProtobufMapperDecoder) {
        return QueryDenomToERC20ResponseConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = QueryDelegateKeysByValidatorAddress.KotlinxSerializer::class)
@SerialName(value = QueryDelegateKeysByValidatorAddress.TYPE_URL)
public data class QueryDelegateKeysByValidatorAddress(
  @ProtobufIndex(index = 1)
  public val validatorAddress: String,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/injective.peggy.v1.QueryDelegateKeysByValidatorAddress"
  }

  public object KotlinxSerializer : KSerializer<QueryDelegateKeysByValidatorAddress> {
    private val delegator: KSerializer<QueryDelegateKeysByValidatorAddress> =
        QueryDelegateKeysByValidatorAddress.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: QueryDelegateKeysByValidatorAddress):
        Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(QueryDelegateKeysByValidatorAddressConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): QueryDelegateKeysByValidatorAddress {
      if (decoder is ProtobufMapperDecoder) {
        return QueryDelegateKeysByValidatorAddressConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = QueryDelegateKeysByValidatorAddressResponse.KotlinxSerializer::class)
@SerialName(value = QueryDelegateKeysByValidatorAddressResponse.TYPE_URL)
public data class QueryDelegateKeysByValidatorAddressResponse(
  @ProtobufIndex(index = 1)
  public val ethAddress: String,
  @ProtobufIndex(index = 2)
  public val orchestratorAddress: String,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String =
        "/injective.peggy.v1.QueryDelegateKeysByValidatorAddressResponse"
  }

  public object KotlinxSerializer : KSerializer<QueryDelegateKeysByValidatorAddressResponse> {
    private val delegator: KSerializer<QueryDelegateKeysByValidatorAddressResponse> =
        QueryDelegateKeysByValidatorAddressResponse.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder,
        `value`: QueryDelegateKeysByValidatorAddressResponse): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(QueryDelegateKeysByValidatorAddressResponseConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): QueryDelegateKeysByValidatorAddressResponse {
      if (decoder is ProtobufMapperDecoder) {
        return QueryDelegateKeysByValidatorAddressResponseConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = QueryDelegateKeysByEthAddress.KotlinxSerializer::class)
@SerialName(value = QueryDelegateKeysByEthAddress.TYPE_URL)
public data class QueryDelegateKeysByEthAddress(
  @ProtobufIndex(index = 1)
  public val ethAddress: String,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/injective.peggy.v1.QueryDelegateKeysByEthAddress"
  }

  public object KotlinxSerializer : KSerializer<QueryDelegateKeysByEthAddress> {
    private val delegator: KSerializer<QueryDelegateKeysByEthAddress> =
        QueryDelegateKeysByEthAddress.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: QueryDelegateKeysByEthAddress): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(QueryDelegateKeysByEthAddressConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): QueryDelegateKeysByEthAddress {
      if (decoder is ProtobufMapperDecoder) {
        return QueryDelegateKeysByEthAddressConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = QueryDelegateKeysByEthAddressResponse.KotlinxSerializer::class)
@SerialName(value = QueryDelegateKeysByEthAddressResponse.TYPE_URL)
public data class QueryDelegateKeysByEthAddressResponse(
  @ProtobufIndex(index = 1)
  public val validatorAddress: String,
  @ProtobufIndex(index = 2)
  public val orchestratorAddress: String,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/injective.peggy.v1.QueryDelegateKeysByEthAddressResponse"
  }

  public object KotlinxSerializer : KSerializer<QueryDelegateKeysByEthAddressResponse> {
    private val delegator: KSerializer<QueryDelegateKeysByEthAddressResponse> =
        QueryDelegateKeysByEthAddressResponse.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: QueryDelegateKeysByEthAddressResponse):
        Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(QueryDelegateKeysByEthAddressResponseConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): QueryDelegateKeysByEthAddressResponse {
      if (decoder is ProtobufMapperDecoder) {
        return QueryDelegateKeysByEthAddressResponseConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = QueryDelegateKeysByOrchestratorAddress.KotlinxSerializer::class)
@SerialName(value = QueryDelegateKeysByOrchestratorAddress.TYPE_URL)
public data class QueryDelegateKeysByOrchestratorAddress(
  @ProtobufIndex(index = 1)
  public val orchestratorAddress: String,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/injective.peggy.v1.QueryDelegateKeysByOrchestratorAddress"
  }

  public object KotlinxSerializer : KSerializer<QueryDelegateKeysByOrchestratorAddress> {
    private val delegator: KSerializer<QueryDelegateKeysByOrchestratorAddress> =
        QueryDelegateKeysByOrchestratorAddress.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder,
        `value`: QueryDelegateKeysByOrchestratorAddress): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(QueryDelegateKeysByOrchestratorAddressConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): QueryDelegateKeysByOrchestratorAddress {
      if (decoder is ProtobufMapperDecoder) {
        return QueryDelegateKeysByOrchestratorAddressConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = QueryDelegateKeysByOrchestratorAddressResponse.KotlinxSerializer::class)
@SerialName(value = QueryDelegateKeysByOrchestratorAddressResponse.TYPE_URL)
public data class QueryDelegateKeysByOrchestratorAddressResponse(
  @ProtobufIndex(index = 1)
  public val validatorAddress: String,
  @ProtobufIndex(index = 2)
  public val ethAddress: String,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String =
        "/injective.peggy.v1.QueryDelegateKeysByOrchestratorAddressResponse"
  }

  public object KotlinxSerializer : KSerializer<QueryDelegateKeysByOrchestratorAddressResponse> {
    private val delegator: KSerializer<QueryDelegateKeysByOrchestratorAddressResponse> =
        QueryDelegateKeysByOrchestratorAddressResponse.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder,
        `value`: QueryDelegateKeysByOrchestratorAddressResponse): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(QueryDelegateKeysByOrchestratorAddressResponseConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder):
        QueryDelegateKeysByOrchestratorAddressResponse {
      if (decoder is ProtobufMapperDecoder) {
        return QueryDelegateKeysByOrchestratorAddressResponseConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = QueryPendingSendToEth.KotlinxSerializer::class)
@SerialName(value = QueryPendingSendToEth.TYPE_URL)
public data class QueryPendingSendToEth(
  @ProtobufIndex(index = 1)
  public val senderAddress: String,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/injective.peggy.v1.QueryPendingSendToEth"
  }

  public object KotlinxSerializer : KSerializer<QueryPendingSendToEth> {
    private val delegator: KSerializer<QueryPendingSendToEth> = QueryPendingSendToEth.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: QueryPendingSendToEth): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(QueryPendingSendToEthConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): QueryPendingSendToEth {
      if (decoder is ProtobufMapperDecoder) {
        return QueryPendingSendToEthConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = QueryPendingSendToEthResponse.KotlinxSerializer::class)
@SerialName(value = QueryPendingSendToEthResponse.TYPE_URL)
public data class QueryPendingSendToEthResponse(
  @ProtobufIndex(index = 1)
  public val transfersInBatches: List<OutgoingTransferTx>,
  @ProtobufIndex(index = 2)
  public val unbatchedTransfers: List<OutgoingTransferTx>,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/injective.peggy.v1.QueryPendingSendToEthResponse"
  }

  public object KotlinxSerializer : KSerializer<QueryPendingSendToEthResponse> {
    private val delegator: KSerializer<QueryPendingSendToEthResponse> =
        QueryPendingSendToEthResponse.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: QueryPendingSendToEthResponse): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(QueryPendingSendToEthResponseConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): QueryPendingSendToEthResponse {
      if (decoder is ProtobufMapperDecoder) {
        return QueryPendingSendToEthResponseConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = QueryModuleStateRequest.KotlinxSerializer::class)
@SerialName(value = QueryModuleStateRequest.TYPE_URL)
public class QueryModuleStateRequest() : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/injective.peggy.v1.QueryModuleStateRequest"
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
    public const val TYPE_URL: String = "/injective.peggy.v1.QueryModuleStateResponse"
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

@Serializable(with = MissingNoncesRequest.KotlinxSerializer::class)
@SerialName(value = MissingNoncesRequest.TYPE_URL)
public class MissingNoncesRequest() : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/injective.peggy.v1.MissingNoncesRequest"
  }

  public object KotlinxSerializer : KSerializer<MissingNoncesRequest> {
    private val delegator: KSerializer<MissingNoncesRequest> = MissingNoncesRequest.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: MissingNoncesRequest): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(MissingNoncesRequestConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): MissingNoncesRequest {
      if (decoder is ProtobufMapperDecoder) {
        return MissingNoncesRequestConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = MissingNoncesResponse.KotlinxSerializer::class)
@SerialName(value = MissingNoncesResponse.TYPE_URL)
public data class MissingNoncesResponse(
  @ProtobufIndex(index = 1)
  public val operatorAddresses: List<String>,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/injective.peggy.v1.MissingNoncesResponse"
  }

  public object KotlinxSerializer : KSerializer<MissingNoncesResponse> {
    private val delegator: KSerializer<MissingNoncesResponse> = MissingNoncesResponse.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: MissingNoncesResponse): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(MissingNoncesResponseConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): MissingNoncesResponse {
      if (decoder is ProtobufMapperDecoder) {
        return MissingNoncesResponseConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}
