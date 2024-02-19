// Transform from injective/insurance/v1beta1/query.proto
@file:ProtobufSyntax(syntax = "PROTO3")
@file:GeneratorVersion(version = "0.3.1")

package injective.insurance.v1beta1

import cosmos.base.v1beta1.Coin
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

@Serializable(with = QueryInsuranceParamsRequest.KotlinxSerializer::class)
@SerialName(value = QueryInsuranceParamsRequest.TYPE_URL)
public class QueryInsuranceParamsRequest() : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/injective.insurance.v1beta1.QueryInsuranceParamsRequest"
  }

  public object KotlinxSerializer : KSerializer<QueryInsuranceParamsRequest> {
    private val delegator: KSerializer<QueryInsuranceParamsRequest> =
        QueryInsuranceParamsRequest.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: QueryInsuranceParamsRequest): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(QueryInsuranceParamsRequestConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): QueryInsuranceParamsRequest {
      if (decoder is ProtobufMapperDecoder) {
        return QueryInsuranceParamsRequestConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = QueryInsuranceParamsResponse.KotlinxSerializer::class)
@SerialName(value = QueryInsuranceParamsResponse.TYPE_URL)
public data class QueryInsuranceParamsResponse(
  @ProtobufIndex(index = 1)
  public val params: Params,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/injective.insurance.v1beta1.QueryInsuranceParamsResponse"
  }

  public object KotlinxSerializer : KSerializer<QueryInsuranceParamsResponse> {
    private val delegator: KSerializer<QueryInsuranceParamsResponse> =
        QueryInsuranceParamsResponse.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: QueryInsuranceParamsResponse): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(QueryInsuranceParamsResponseConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): QueryInsuranceParamsResponse {
      if (decoder is ProtobufMapperDecoder) {
        return QueryInsuranceParamsResponseConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = QueryInsuranceFundRequest.KotlinxSerializer::class)
@SerialName(value = QueryInsuranceFundRequest.TYPE_URL)
public data class QueryInsuranceFundRequest(
  @ProtobufIndex(index = 1)
  public val marketId: String,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/injective.insurance.v1beta1.QueryInsuranceFundRequest"
  }

  public object KotlinxSerializer : KSerializer<QueryInsuranceFundRequest> {
    private val delegator: KSerializer<QueryInsuranceFundRequest> =
        QueryInsuranceFundRequest.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: QueryInsuranceFundRequest): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(QueryInsuranceFundRequestConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): QueryInsuranceFundRequest {
      if (decoder is ProtobufMapperDecoder) {
        return QueryInsuranceFundRequestConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = QueryInsuranceFundResponse.KotlinxSerializer::class)
@SerialName(value = QueryInsuranceFundResponse.TYPE_URL)
public data class QueryInsuranceFundResponse(
  @ProtobufIndex(index = 1)
  public val fund: InsuranceFund,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/injective.insurance.v1beta1.QueryInsuranceFundResponse"
  }

  public object KotlinxSerializer : KSerializer<QueryInsuranceFundResponse> {
    private val delegator: KSerializer<QueryInsuranceFundResponse> =
        QueryInsuranceFundResponse.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: QueryInsuranceFundResponse): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(QueryInsuranceFundResponseConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): QueryInsuranceFundResponse {
      if (decoder is ProtobufMapperDecoder) {
        return QueryInsuranceFundResponseConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = QueryInsuranceFundsRequest.KotlinxSerializer::class)
@SerialName(value = QueryInsuranceFundsRequest.TYPE_URL)
public class QueryInsuranceFundsRequest() : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/injective.insurance.v1beta1.QueryInsuranceFundsRequest"
  }

  public object KotlinxSerializer : KSerializer<QueryInsuranceFundsRequest> {
    private val delegator: KSerializer<QueryInsuranceFundsRequest> =
        QueryInsuranceFundsRequest.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: QueryInsuranceFundsRequest): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(QueryInsuranceFundsRequestConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): QueryInsuranceFundsRequest {
      if (decoder is ProtobufMapperDecoder) {
        return QueryInsuranceFundsRequestConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = QueryInsuranceFundsResponse.KotlinxSerializer::class)
@SerialName(value = QueryInsuranceFundsResponse.TYPE_URL)
public data class QueryInsuranceFundsResponse(
  @ProtobufIndex(index = 1)
  public val funds: List<InsuranceFund>,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/injective.insurance.v1beta1.QueryInsuranceFundsResponse"
  }

  public object KotlinxSerializer : KSerializer<QueryInsuranceFundsResponse> {
    private val delegator: KSerializer<QueryInsuranceFundsResponse> =
        QueryInsuranceFundsResponse.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: QueryInsuranceFundsResponse): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(QueryInsuranceFundsResponseConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): QueryInsuranceFundsResponse {
      if (decoder is ProtobufMapperDecoder) {
        return QueryInsuranceFundsResponseConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = QueryEstimatedRedemptionsRequest.KotlinxSerializer::class)
@SerialName(value = QueryEstimatedRedemptionsRequest.TYPE_URL)
public data class QueryEstimatedRedemptionsRequest(
  @ProtobufIndex(index = 1)
  public val marketId: String,
  @ProtobufIndex(index = 2)
  public val address: String,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String =
        "/injective.insurance.v1beta1.QueryEstimatedRedemptionsRequest"
  }

  public object KotlinxSerializer : KSerializer<QueryEstimatedRedemptionsRequest> {
    private val delegator: KSerializer<QueryEstimatedRedemptionsRequest> =
        QueryEstimatedRedemptionsRequest.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: QueryEstimatedRedemptionsRequest):
        Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(QueryEstimatedRedemptionsRequestConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): QueryEstimatedRedemptionsRequest {
      if (decoder is ProtobufMapperDecoder) {
        return QueryEstimatedRedemptionsRequestConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = QueryEstimatedRedemptionsResponse.KotlinxSerializer::class)
@SerialName(value = QueryEstimatedRedemptionsResponse.TYPE_URL)
public data class QueryEstimatedRedemptionsResponse(
  @ProtobufIndex(index = 1)
  public val amount: List<Coin>,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String =
        "/injective.insurance.v1beta1.QueryEstimatedRedemptionsResponse"
  }

  public object KotlinxSerializer : KSerializer<QueryEstimatedRedemptionsResponse> {
    private val delegator: KSerializer<QueryEstimatedRedemptionsResponse> =
        QueryEstimatedRedemptionsResponse.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: QueryEstimatedRedemptionsResponse):
        Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(QueryEstimatedRedemptionsResponseConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): QueryEstimatedRedemptionsResponse {
      if (decoder is ProtobufMapperDecoder) {
        return QueryEstimatedRedemptionsResponseConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = QueryPendingRedemptionsRequest.KotlinxSerializer::class)
@SerialName(value = QueryPendingRedemptionsRequest.TYPE_URL)
public data class QueryPendingRedemptionsRequest(
  @ProtobufIndex(index = 1)
  public val marketId: String,
  @ProtobufIndex(index = 2)
  public val address: String,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String =
        "/injective.insurance.v1beta1.QueryPendingRedemptionsRequest"
  }

  public object KotlinxSerializer : KSerializer<QueryPendingRedemptionsRequest> {
    private val delegator: KSerializer<QueryPendingRedemptionsRequest> =
        QueryPendingRedemptionsRequest.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: QueryPendingRedemptionsRequest): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(QueryPendingRedemptionsRequestConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): QueryPendingRedemptionsRequest {
      if (decoder is ProtobufMapperDecoder) {
        return QueryPendingRedemptionsRequestConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = QueryPendingRedemptionsResponse.KotlinxSerializer::class)
@SerialName(value = QueryPendingRedemptionsResponse.TYPE_URL)
public data class QueryPendingRedemptionsResponse(
  @ProtobufIndex(index = 1)
  public val amount: List<Coin>,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String =
        "/injective.insurance.v1beta1.QueryPendingRedemptionsResponse"
  }

  public object KotlinxSerializer : KSerializer<QueryPendingRedemptionsResponse> {
    private val delegator: KSerializer<QueryPendingRedemptionsResponse> =
        QueryPendingRedemptionsResponse.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: QueryPendingRedemptionsResponse):
        Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(QueryPendingRedemptionsResponseConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): QueryPendingRedemptionsResponse {
      if (decoder is ProtobufMapperDecoder) {
        return QueryPendingRedemptionsResponseConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = QueryModuleStateRequest.KotlinxSerializer::class)
@SerialName(value = QueryModuleStateRequest.TYPE_URL)
public class QueryModuleStateRequest() : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/injective.insurance.v1beta1.QueryModuleStateRequest"
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
    public const val TYPE_URL: String = "/injective.insurance.v1beta1.QueryModuleStateResponse"
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
