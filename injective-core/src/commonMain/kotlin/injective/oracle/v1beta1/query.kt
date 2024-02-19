// Transform from injective/oracle/v1beta1/query.proto
@file:ProtobufSyntax(syntax = "PROTO3")
@file:GeneratorVersion(version = "0.3.1")

package injective.oracle.v1beta1

import kotlin.Boolean
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

@Serializable(with = QueryPythPriceRequest.KotlinxSerializer::class)
@SerialName(value = QueryPythPriceRequest.TYPE_URL)
public data class QueryPythPriceRequest(
  @ProtobufIndex(index = 1)
  public val priceId: String,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/injective.oracle.v1beta1.QueryPythPriceRequest"
  }

  public object KotlinxSerializer : KSerializer<QueryPythPriceRequest> {
    private val delegator: KSerializer<QueryPythPriceRequest> = QueryPythPriceRequest.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: QueryPythPriceRequest): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(QueryPythPriceRequestConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): QueryPythPriceRequest {
      if (decoder is ProtobufMapperDecoder) {
        return QueryPythPriceRequestConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = QueryPythPriceResponse.KotlinxSerializer::class)
@SerialName(value = QueryPythPriceResponse.TYPE_URL)
public data class QueryPythPriceResponse(
  @ProtobufIndex(index = 1)
  public val priceState: PythPriceState,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/injective.oracle.v1beta1.QueryPythPriceResponse"
  }

  public object KotlinxSerializer : KSerializer<QueryPythPriceResponse> {
    private val delegator: KSerializer<QueryPythPriceResponse> = QueryPythPriceResponse.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: QueryPythPriceResponse): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(QueryPythPriceResponseConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): QueryPythPriceResponse {
      if (decoder is ProtobufMapperDecoder) {
        return QueryPythPriceResponseConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = QueryParamsRequest.KotlinxSerializer::class)
@SerialName(value = QueryParamsRequest.TYPE_URL)
public class QueryParamsRequest() : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/injective.oracle.v1beta1.QueryParamsRequest"
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
    public const val TYPE_URL: String = "/injective.oracle.v1beta1.QueryParamsResponse"
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

@Serializable(with = QueryBandRelayersRequest.KotlinxSerializer::class)
@SerialName(value = QueryBandRelayersRequest.TYPE_URL)
public class QueryBandRelayersRequest() : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/injective.oracle.v1beta1.QueryBandRelayersRequest"
  }

  public object KotlinxSerializer : KSerializer<QueryBandRelayersRequest> {
    private val delegator: KSerializer<QueryBandRelayersRequest> =
        QueryBandRelayersRequest.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: QueryBandRelayersRequest): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(QueryBandRelayersRequestConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): QueryBandRelayersRequest {
      if (decoder is ProtobufMapperDecoder) {
        return QueryBandRelayersRequestConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = QueryBandRelayersResponse.KotlinxSerializer::class)
@SerialName(value = QueryBandRelayersResponse.TYPE_URL)
public data class QueryBandRelayersResponse(
  @ProtobufIndex(index = 1)
  public val relayers: List<String>,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/injective.oracle.v1beta1.QueryBandRelayersResponse"
  }

  public object KotlinxSerializer : KSerializer<QueryBandRelayersResponse> {
    private val delegator: KSerializer<QueryBandRelayersResponse> =
        QueryBandRelayersResponse.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: QueryBandRelayersResponse): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(QueryBandRelayersResponseConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): QueryBandRelayersResponse {
      if (decoder is ProtobufMapperDecoder) {
        return QueryBandRelayersResponseConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = QueryBandPriceStatesRequest.KotlinxSerializer::class)
@SerialName(value = QueryBandPriceStatesRequest.TYPE_URL)
public class QueryBandPriceStatesRequest() : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/injective.oracle.v1beta1.QueryBandPriceStatesRequest"
  }

  public object KotlinxSerializer : KSerializer<QueryBandPriceStatesRequest> {
    private val delegator: KSerializer<QueryBandPriceStatesRequest> =
        QueryBandPriceStatesRequest.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: QueryBandPriceStatesRequest): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(QueryBandPriceStatesRequestConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): QueryBandPriceStatesRequest {
      if (decoder is ProtobufMapperDecoder) {
        return QueryBandPriceStatesRequestConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = QueryBandPriceStatesResponse.KotlinxSerializer::class)
@SerialName(value = QueryBandPriceStatesResponse.TYPE_URL)
public data class QueryBandPriceStatesResponse(
  @ProtobufIndex(index = 1)
  public val priceStates: List<BandPriceState>,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/injective.oracle.v1beta1.QueryBandPriceStatesResponse"
  }

  public object KotlinxSerializer : KSerializer<QueryBandPriceStatesResponse> {
    private val delegator: KSerializer<QueryBandPriceStatesResponse> =
        QueryBandPriceStatesResponse.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: QueryBandPriceStatesResponse): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(QueryBandPriceStatesResponseConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): QueryBandPriceStatesResponse {
      if (decoder is ProtobufMapperDecoder) {
        return QueryBandPriceStatesResponseConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = QueryBandIBCPriceStatesRequest.KotlinxSerializer::class)
@SerialName(value = QueryBandIBCPriceStatesRequest.TYPE_URL)
public class QueryBandIBCPriceStatesRequest() : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/injective.oracle.v1beta1.QueryBandIBCPriceStatesRequest"
  }

  public object KotlinxSerializer : KSerializer<QueryBandIBCPriceStatesRequest> {
    private val delegator: KSerializer<QueryBandIBCPriceStatesRequest> =
        QueryBandIBCPriceStatesRequest.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: QueryBandIBCPriceStatesRequest): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(QueryBandIBCPriceStatesRequestConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): QueryBandIBCPriceStatesRequest {
      if (decoder is ProtobufMapperDecoder) {
        return QueryBandIBCPriceStatesRequestConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = QueryBandIBCPriceStatesResponse.KotlinxSerializer::class)
@SerialName(value = QueryBandIBCPriceStatesResponse.TYPE_URL)
public data class QueryBandIBCPriceStatesResponse(
  @ProtobufIndex(index = 1)
  public val priceStates: List<BandPriceState>,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/injective.oracle.v1beta1.QueryBandIBCPriceStatesResponse"
  }

  public object KotlinxSerializer : KSerializer<QueryBandIBCPriceStatesResponse> {
    private val delegator: KSerializer<QueryBandIBCPriceStatesResponse> =
        QueryBandIBCPriceStatesResponse.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: QueryBandIBCPriceStatesResponse):
        Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(QueryBandIBCPriceStatesResponseConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): QueryBandIBCPriceStatesResponse {
      if (decoder is ProtobufMapperDecoder) {
        return QueryBandIBCPriceStatesResponseConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = QueryPriceFeedPriceStatesRequest.KotlinxSerializer::class)
@SerialName(value = QueryPriceFeedPriceStatesRequest.TYPE_URL)
public class QueryPriceFeedPriceStatesRequest() : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/injective.oracle.v1beta1.QueryPriceFeedPriceStatesRequest"
  }

  public object KotlinxSerializer : KSerializer<QueryPriceFeedPriceStatesRequest> {
    private val delegator: KSerializer<QueryPriceFeedPriceStatesRequest> =
        QueryPriceFeedPriceStatesRequest.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: QueryPriceFeedPriceStatesRequest):
        Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(QueryPriceFeedPriceStatesRequestConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): QueryPriceFeedPriceStatesRequest {
      if (decoder is ProtobufMapperDecoder) {
        return QueryPriceFeedPriceStatesRequestConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = QueryPriceFeedPriceStatesResponse.KotlinxSerializer::class)
@SerialName(value = QueryPriceFeedPriceStatesResponse.TYPE_URL)
public data class QueryPriceFeedPriceStatesResponse(
  @ProtobufIndex(index = 1)
  public val priceStates: List<PriceFeedState>,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String =
        "/injective.oracle.v1beta1.QueryPriceFeedPriceStatesResponse"
  }

  public object KotlinxSerializer : KSerializer<QueryPriceFeedPriceStatesResponse> {
    private val delegator: KSerializer<QueryPriceFeedPriceStatesResponse> =
        QueryPriceFeedPriceStatesResponse.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: QueryPriceFeedPriceStatesResponse):
        Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(QueryPriceFeedPriceStatesResponseConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): QueryPriceFeedPriceStatesResponse {
      if (decoder is ProtobufMapperDecoder) {
        return QueryPriceFeedPriceStatesResponseConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = QueryCoinbasePriceStatesRequest.KotlinxSerializer::class)
@SerialName(value = QueryCoinbasePriceStatesRequest.TYPE_URL)
public class QueryCoinbasePriceStatesRequest() : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/injective.oracle.v1beta1.QueryCoinbasePriceStatesRequest"
  }

  public object KotlinxSerializer : KSerializer<QueryCoinbasePriceStatesRequest> {
    private val delegator: KSerializer<QueryCoinbasePriceStatesRequest> =
        QueryCoinbasePriceStatesRequest.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: QueryCoinbasePriceStatesRequest):
        Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(QueryCoinbasePriceStatesRequestConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): QueryCoinbasePriceStatesRequest {
      if (decoder is ProtobufMapperDecoder) {
        return QueryCoinbasePriceStatesRequestConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = QueryCoinbasePriceStatesResponse.KotlinxSerializer::class)
@SerialName(value = QueryCoinbasePriceStatesResponse.TYPE_URL)
public data class QueryCoinbasePriceStatesResponse(
  @ProtobufIndex(index = 1)
  public val priceStates: List<CoinbasePriceState>,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/injective.oracle.v1beta1.QueryCoinbasePriceStatesResponse"
  }

  public object KotlinxSerializer : KSerializer<QueryCoinbasePriceStatesResponse> {
    private val delegator: KSerializer<QueryCoinbasePriceStatesResponse> =
        QueryCoinbasePriceStatesResponse.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: QueryCoinbasePriceStatesResponse):
        Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(QueryCoinbasePriceStatesResponseConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): QueryCoinbasePriceStatesResponse {
      if (decoder is ProtobufMapperDecoder) {
        return QueryCoinbasePriceStatesResponseConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = QueryPythPriceStatesRequest.KotlinxSerializer::class)
@SerialName(value = QueryPythPriceStatesRequest.TYPE_URL)
public class QueryPythPriceStatesRequest() : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/injective.oracle.v1beta1.QueryPythPriceStatesRequest"
  }

  public object KotlinxSerializer : KSerializer<QueryPythPriceStatesRequest> {
    private val delegator: KSerializer<QueryPythPriceStatesRequest> =
        QueryPythPriceStatesRequest.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: QueryPythPriceStatesRequest): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(QueryPythPriceStatesRequestConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): QueryPythPriceStatesRequest {
      if (decoder is ProtobufMapperDecoder) {
        return QueryPythPriceStatesRequestConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = QueryPythPriceStatesResponse.KotlinxSerializer::class)
@SerialName(value = QueryPythPriceStatesResponse.TYPE_URL)
public data class QueryPythPriceStatesResponse(
  @ProtobufIndex(index = 1)
  public val priceStates: List<PythPriceState>,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/injective.oracle.v1beta1.QueryPythPriceStatesResponse"
  }

  public object KotlinxSerializer : KSerializer<QueryPythPriceStatesResponse> {
    private val delegator: KSerializer<QueryPythPriceStatesResponse> =
        QueryPythPriceStatesResponse.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: QueryPythPriceStatesResponse): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(QueryPythPriceStatesResponseConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): QueryPythPriceStatesResponse {
      if (decoder is ProtobufMapperDecoder) {
        return QueryPythPriceStatesResponseConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = QueryProviderPriceStateRequest.KotlinxSerializer::class)
@SerialName(value = QueryProviderPriceStateRequest.TYPE_URL)
public data class QueryProviderPriceStateRequest(
  @ProtobufIndex(index = 1)
  public val provider: String,
  @ProtobufIndex(index = 2)
  public val symbol: String,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/injective.oracle.v1beta1.QueryProviderPriceStateRequest"
  }

  public object KotlinxSerializer : KSerializer<QueryProviderPriceStateRequest> {
    private val delegator: KSerializer<QueryProviderPriceStateRequest> =
        QueryProviderPriceStateRequest.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: QueryProviderPriceStateRequest): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(QueryProviderPriceStateRequestConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): QueryProviderPriceStateRequest {
      if (decoder is ProtobufMapperDecoder) {
        return QueryProviderPriceStateRequestConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = QueryProviderPriceStateResponse.KotlinxSerializer::class)
@SerialName(value = QueryProviderPriceStateResponse.TYPE_URL)
public data class QueryProviderPriceStateResponse(
  @ProtobufIndex(index = 1)
  public val priceState: PriceState,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/injective.oracle.v1beta1.QueryProviderPriceStateResponse"
  }

  public object KotlinxSerializer : KSerializer<QueryProviderPriceStateResponse> {
    private val delegator: KSerializer<QueryProviderPriceStateResponse> =
        QueryProviderPriceStateResponse.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: QueryProviderPriceStateResponse):
        Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(QueryProviderPriceStateResponseConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): QueryProviderPriceStateResponse {
      if (decoder is ProtobufMapperDecoder) {
        return QueryProviderPriceStateResponseConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = QueryModuleStateRequest.KotlinxSerializer::class)
@SerialName(value = QueryModuleStateRequest.TYPE_URL)
public class QueryModuleStateRequest() : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/injective.oracle.v1beta1.QueryModuleStateRequest"
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
    public const val TYPE_URL: String = "/injective.oracle.v1beta1.QueryModuleStateResponse"
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

@Serializable(with = QueryHistoricalPriceRecordsRequest.KotlinxSerializer::class)
@SerialName(value = QueryHistoricalPriceRecordsRequest.TYPE_URL)
public data class QueryHistoricalPriceRecordsRequest(
  @ProtobufIndex(index = 1)
  public val oracle: OracleType,
  @ProtobufIndex(index = 2)
  public val symbolId: String,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String =
        "/injective.oracle.v1beta1.QueryHistoricalPriceRecordsRequest"
  }

  public object KotlinxSerializer : KSerializer<QueryHistoricalPriceRecordsRequest> {
    private val delegator: KSerializer<QueryHistoricalPriceRecordsRequest> =
        QueryHistoricalPriceRecordsRequest.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: QueryHistoricalPriceRecordsRequest):
        Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(QueryHistoricalPriceRecordsRequestConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): QueryHistoricalPriceRecordsRequest {
      if (decoder is ProtobufMapperDecoder) {
        return QueryHistoricalPriceRecordsRequestConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = QueryHistoricalPriceRecordsResponse.KotlinxSerializer::class)
@SerialName(value = QueryHistoricalPriceRecordsResponse.TYPE_URL)
public data class QueryHistoricalPriceRecordsResponse(
  @ProtobufIndex(index = 1)
  public val priceRecords: List<PriceRecords>,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String =
        "/injective.oracle.v1beta1.QueryHistoricalPriceRecordsResponse"
  }

  public object KotlinxSerializer : KSerializer<QueryHistoricalPriceRecordsResponse> {
    private val delegator: KSerializer<QueryHistoricalPriceRecordsResponse> =
        QueryHistoricalPriceRecordsResponse.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: QueryHistoricalPriceRecordsResponse):
        Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(QueryHistoricalPriceRecordsResponseConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): QueryHistoricalPriceRecordsResponse {
      if (decoder is ProtobufMapperDecoder) {
        return QueryHistoricalPriceRecordsResponseConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = OracleHistoryOptions.KotlinxSerializer::class)
@SerialName(value = OracleHistoryOptions.TYPE_URL)
public data class OracleHistoryOptions(
  @ProtobufIndex(index = 1)
  public val maxAge: ULong,
  @ProtobufIndex(index = 2)
  public val includeRawHistory: Boolean,
  @ProtobufIndex(index = 3)
  public val includeMetadata: Boolean,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/injective.oracle.v1beta1.OracleHistoryOptions"
  }

  public object KotlinxSerializer : KSerializer<OracleHistoryOptions> {
    private val delegator: KSerializer<OracleHistoryOptions> = OracleHistoryOptions.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: OracleHistoryOptions): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(OracleHistoryOptionsConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): OracleHistoryOptions {
      if (decoder is ProtobufMapperDecoder) {
        return OracleHistoryOptionsConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = QueryOracleVolatilityRequest.KotlinxSerializer::class)
@SerialName(value = QueryOracleVolatilityRequest.TYPE_URL)
public data class QueryOracleVolatilityRequest(
  @ProtobufIndex(index = 1)
  public val baseInfo: OracleInfo,
  @ProtobufIndex(index = 2)
  public val quoteInfo: OracleInfo,
  @ProtobufIndex(index = 3)
  public val oracleHistoryOptions: OracleHistoryOptions,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/injective.oracle.v1beta1.QueryOracleVolatilityRequest"
  }

  public object KotlinxSerializer : KSerializer<QueryOracleVolatilityRequest> {
    private val delegator: KSerializer<QueryOracleVolatilityRequest> =
        QueryOracleVolatilityRequest.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: QueryOracleVolatilityRequest): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(QueryOracleVolatilityRequestConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): QueryOracleVolatilityRequest {
      if (decoder is ProtobufMapperDecoder) {
        return QueryOracleVolatilityRequestConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = QueryOracleVolatilityResponse.KotlinxSerializer::class)
@SerialName(value = QueryOracleVolatilityResponse.TYPE_URL)
public data class QueryOracleVolatilityResponse(
  @ProtobufIndex(index = 1)
  public val volatility: String,
  @ProtobufIndex(index = 2)
  public val historyMetadata: MetadataStatistics,
  @ProtobufIndex(index = 3)
  public val rawHistory: List<PriceRecord>,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/injective.oracle.v1beta1.QueryOracleVolatilityResponse"
  }

  public object KotlinxSerializer : KSerializer<QueryOracleVolatilityResponse> {
    private val delegator: KSerializer<QueryOracleVolatilityResponse> =
        QueryOracleVolatilityResponse.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: QueryOracleVolatilityResponse): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(QueryOracleVolatilityResponseConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): QueryOracleVolatilityResponse {
      if (decoder is ProtobufMapperDecoder) {
        return QueryOracleVolatilityResponseConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = QueryOracleProvidersInfoRequest.KotlinxSerializer::class)
@SerialName(value = QueryOracleProvidersInfoRequest.TYPE_URL)
public class QueryOracleProvidersInfoRequest() : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/injective.oracle.v1beta1.QueryOracleProvidersInfoRequest"
  }

  public object KotlinxSerializer : KSerializer<QueryOracleProvidersInfoRequest> {
    private val delegator: KSerializer<QueryOracleProvidersInfoRequest> =
        QueryOracleProvidersInfoRequest.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: QueryOracleProvidersInfoRequest):
        Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(QueryOracleProvidersInfoRequestConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): QueryOracleProvidersInfoRequest {
      if (decoder is ProtobufMapperDecoder) {
        return QueryOracleProvidersInfoRequestConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = QueryOracleProvidersInfoResponse.KotlinxSerializer::class)
@SerialName(value = QueryOracleProvidersInfoResponse.TYPE_URL)
public data class QueryOracleProvidersInfoResponse(
  @ProtobufIndex(index = 1)
  public val providers: List<ProviderInfo>,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/injective.oracle.v1beta1.QueryOracleProvidersInfoResponse"
  }

  public object KotlinxSerializer : KSerializer<QueryOracleProvidersInfoResponse> {
    private val delegator: KSerializer<QueryOracleProvidersInfoResponse> =
        QueryOracleProvidersInfoResponse.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: QueryOracleProvidersInfoResponse):
        Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(QueryOracleProvidersInfoResponseConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): QueryOracleProvidersInfoResponse {
      if (decoder is ProtobufMapperDecoder) {
        return QueryOracleProvidersInfoResponseConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = QueryOracleProviderPricesRequest.KotlinxSerializer::class)
@SerialName(value = QueryOracleProviderPricesRequest.TYPE_URL)
public data class QueryOracleProviderPricesRequest(
  @ProtobufIndex(index = 1)
  public val provider: String,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/injective.oracle.v1beta1.QueryOracleProviderPricesRequest"
  }

  public object KotlinxSerializer : KSerializer<QueryOracleProviderPricesRequest> {
    private val delegator: KSerializer<QueryOracleProviderPricesRequest> =
        QueryOracleProviderPricesRequest.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: QueryOracleProviderPricesRequest):
        Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(QueryOracleProviderPricesRequestConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): QueryOracleProviderPricesRequest {
      if (decoder is ProtobufMapperDecoder) {
        return QueryOracleProviderPricesRequestConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = QueryOracleProviderPricesResponse.KotlinxSerializer::class)
@SerialName(value = QueryOracleProviderPricesResponse.TYPE_URL)
public data class QueryOracleProviderPricesResponse(
  @ProtobufIndex(index = 1)
  public val providerState: List<ProviderState>,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String =
        "/injective.oracle.v1beta1.QueryOracleProviderPricesResponse"
  }

  public object KotlinxSerializer : KSerializer<QueryOracleProviderPricesResponse> {
    private val delegator: KSerializer<QueryOracleProviderPricesResponse> =
        QueryOracleProviderPricesResponse.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: QueryOracleProviderPricesResponse):
        Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(QueryOracleProviderPricesResponseConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): QueryOracleProviderPricesResponse {
      if (decoder is ProtobufMapperDecoder) {
        return QueryOracleProviderPricesResponseConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = QueryOraclePriceRequest.KotlinxSerializer::class)
@SerialName(value = QueryOraclePriceRequest.TYPE_URL)
public data class QueryOraclePriceRequest(
  @ProtobufIndex(index = 1)
  public val oracleType: OracleType,
  @ProtobufIndex(index = 2)
  public val base: String,
  @ProtobufIndex(index = 3)
  public val quote: String,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/injective.oracle.v1beta1.QueryOraclePriceRequest"
  }

  public object KotlinxSerializer : KSerializer<QueryOraclePriceRequest> {
    private val delegator: KSerializer<QueryOraclePriceRequest> =
        QueryOraclePriceRequest.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: QueryOraclePriceRequest): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(QueryOraclePriceRequestConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): QueryOraclePriceRequest {
      if (decoder is ProtobufMapperDecoder) {
        return QueryOraclePriceRequestConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = PricePairState.KotlinxSerializer::class)
@SerialName(value = PricePairState.TYPE_URL)
public data class PricePairState(
  @ProtobufIndex(index = 1)
  public val pairPrice: String,
  @ProtobufIndex(index = 2)
  public val basePrice: String,
  @ProtobufIndex(index = 3)
  public val quotePrice: String,
  @ProtobufIndex(index = 4)
  public val baseCumulativePrice: String,
  @ProtobufIndex(index = 5)
  public val quoteCumulativePrice: String,
  @ProtobufIndex(index = 6)
  public val baseTimestamp: Long,
  @ProtobufIndex(index = 7)
  public val quoteTimestamp: Long,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/injective.oracle.v1beta1.PricePairState"
  }

  public object KotlinxSerializer : KSerializer<PricePairState> {
    private val delegator: KSerializer<PricePairState> = PricePairState.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: PricePairState): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(PricePairStateConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): PricePairState {
      if (decoder is ProtobufMapperDecoder) {
        return PricePairStateConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = QueryOraclePriceResponse.KotlinxSerializer::class)
@SerialName(value = QueryOraclePriceResponse.TYPE_URL)
public data class QueryOraclePriceResponse(
  @ProtobufIndex(index = 1)
  public val pricePairState: PricePairState,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/injective.oracle.v1beta1.QueryOraclePriceResponse"
  }

  public object KotlinxSerializer : KSerializer<QueryOraclePriceResponse> {
    private val delegator: KSerializer<QueryOraclePriceResponse> =
        QueryOraclePriceResponse.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: QueryOraclePriceResponse): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(QueryOraclePriceResponseConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): QueryOraclePriceResponse {
      if (decoder is ProtobufMapperDecoder) {
        return QueryOraclePriceResponseConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}
