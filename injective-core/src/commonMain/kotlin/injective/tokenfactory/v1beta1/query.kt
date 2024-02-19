// Transform from injective/tokenfactory/v1beta1/query.proto
@file:ProtobufSyntax(syntax = "PROTO3")
@file:GeneratorVersion(version = "0.3.1")

package injective.tokenfactory.v1beta1

import kotlin.String
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
    public const val TYPE_URL: String = "/injective.tokenfactory.v1beta1.QueryParamsRequest"
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
    public const val TYPE_URL: String = "/injective.tokenfactory.v1beta1.QueryParamsResponse"
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

@Serializable(with = QueryDenomAuthorityMetadataRequest.KotlinxSerializer::class)
@SerialName(value = QueryDenomAuthorityMetadataRequest.TYPE_URL)
public data class QueryDenomAuthorityMetadataRequest(
  @ProtobufIndex(index = 1)
  public val creator: String,
  @ProtobufIndex(index = 2)
  public val subDenom: String,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String =
        "/injective.tokenfactory.v1beta1.QueryDenomAuthorityMetadataRequest"
  }

  public object KotlinxSerializer : KSerializer<QueryDenomAuthorityMetadataRequest> {
    private val delegator: KSerializer<QueryDenomAuthorityMetadataRequest> =
        QueryDenomAuthorityMetadataRequest.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: QueryDenomAuthorityMetadataRequest):
        Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(QueryDenomAuthorityMetadataRequestConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): QueryDenomAuthorityMetadataRequest {
      if (decoder is ProtobufMapperDecoder) {
        return QueryDenomAuthorityMetadataRequestConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = QueryDenomAuthorityMetadataResponse.KotlinxSerializer::class)
@SerialName(value = QueryDenomAuthorityMetadataResponse.TYPE_URL)
public data class QueryDenomAuthorityMetadataResponse(
  @ProtobufIndex(index = 1)
  public val authorityMetadata: DenomAuthorityMetadata,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String =
        "/injective.tokenfactory.v1beta1.QueryDenomAuthorityMetadataResponse"
  }

  public object KotlinxSerializer : KSerializer<QueryDenomAuthorityMetadataResponse> {
    private val delegator: KSerializer<QueryDenomAuthorityMetadataResponse> =
        QueryDenomAuthorityMetadataResponse.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: QueryDenomAuthorityMetadataResponse):
        Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(QueryDenomAuthorityMetadataResponseConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): QueryDenomAuthorityMetadataResponse {
      if (decoder is ProtobufMapperDecoder) {
        return QueryDenomAuthorityMetadataResponseConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = QueryDenomsFromCreatorRequest.KotlinxSerializer::class)
@SerialName(value = QueryDenomsFromCreatorRequest.TYPE_URL)
public data class QueryDenomsFromCreatorRequest(
  @ProtobufIndex(index = 1)
  public val creator: String,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String =
        "/injective.tokenfactory.v1beta1.QueryDenomsFromCreatorRequest"
  }

  public object KotlinxSerializer : KSerializer<QueryDenomsFromCreatorRequest> {
    private val delegator: KSerializer<QueryDenomsFromCreatorRequest> =
        QueryDenomsFromCreatorRequest.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: QueryDenomsFromCreatorRequest): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(QueryDenomsFromCreatorRequestConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): QueryDenomsFromCreatorRequest {
      if (decoder is ProtobufMapperDecoder) {
        return QueryDenomsFromCreatorRequestConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = QueryDenomsFromCreatorResponse.KotlinxSerializer::class)
@SerialName(value = QueryDenomsFromCreatorResponse.TYPE_URL)
public data class QueryDenomsFromCreatorResponse(
  @ProtobufIndex(index = 1)
  public val denoms: List<String>,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String =
        "/injective.tokenfactory.v1beta1.QueryDenomsFromCreatorResponse"
  }

  public object KotlinxSerializer : KSerializer<QueryDenomsFromCreatorResponse> {
    private val delegator: KSerializer<QueryDenomsFromCreatorResponse> =
        QueryDenomsFromCreatorResponse.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: QueryDenomsFromCreatorResponse): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(QueryDenomsFromCreatorResponseConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): QueryDenomsFromCreatorResponse {
      if (decoder is ProtobufMapperDecoder) {
        return QueryDenomsFromCreatorResponseConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = QueryModuleStateRequest.KotlinxSerializer::class)
@SerialName(value = QueryModuleStateRequest.TYPE_URL)
public class QueryModuleStateRequest() : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/injective.tokenfactory.v1beta1.QueryModuleStateRequest"
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
    public const val TYPE_URL: String = "/injective.tokenfactory.v1beta1.QueryModuleStateResponse"
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
