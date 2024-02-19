// Transform from injective/exchange/v1beta1/query.proto
@file:ProtobufSyntax(syntax = "PROTO3")
@file:GeneratorVersion(version = "0.3.1")

package injective.exchange.v1beta1

import injective.oracle.v1beta1.MetadataStatistics
import kotlin.Boolean
import kotlin.Int
import kotlin.Long
import kotlin.String
import kotlin.UInt
import kotlin.ULong
import kotlin.Unit
import kotlin.collections.List
import kotlin.collections.Map
import kotlin.jvm.JvmInline
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
@SerialName(value = "/injective.exchange.v1beta1.OrderSide")
public enum class OrderSide(
  public val number: Int,
) {
  @ProtobufIndex(index = 0)
  Side_Unspecified(0),
  @ProtobufIndex(index = 1)
  Buy(1),
  @ProtobufIndex(index = 2)
  Sell(2),
  ;

  public companion object {
    public fun forNumber(number: Int): OrderSide = OrderSide.values()
    	.first { it.number == number }
  }
}

@Serializable
@SerialName(value = "/injective.exchange.v1beta1.CancellationStrategy")
public enum class CancellationStrategy(
  public val number: Int,
) {
  @ProtobufIndex(index = 0)
  UnspecifiedOrder(0),
  @ProtobufIndex(index = 1)
  FromWorstToBest(1),
  @ProtobufIndex(index = 2)
  FromBestToWorst(2),
  ;

  public companion object {
    public fun forNumber(number: Int): CancellationStrategy = CancellationStrategy.values()
    	.first { it.number == number }
  }
}

@Serializable(with = Subaccount.KotlinxSerializer::class)
@SerialName(value = Subaccount.TYPE_URL)
public data class Subaccount(
  @ProtobufIndex(index = 1)
  public val trader: String,
  @ProtobufIndex(index = 2)
  public val subaccountNonce: UInt,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/injective.exchange.v1beta1.Subaccount"
  }

  public object KotlinxSerializer : KSerializer<Subaccount> {
    private val delegator: KSerializer<Subaccount> = Subaccount.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: Subaccount): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(SubaccountConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): Subaccount {
      if (decoder is ProtobufMapperDecoder) {
        return SubaccountConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = QuerySubaccountOrdersRequest.KotlinxSerializer::class)
@SerialName(value = QuerySubaccountOrdersRequest.TYPE_URL)
public data class QuerySubaccountOrdersRequest(
  @ProtobufIndex(index = 1)
  public val subaccountId: String,
  @ProtobufIndex(index = 2)
  public val marketId: String,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/injective.exchange.v1beta1.QuerySubaccountOrdersRequest"
  }

  public object KotlinxSerializer : KSerializer<QuerySubaccountOrdersRequest> {
    private val delegator: KSerializer<QuerySubaccountOrdersRequest> =
        QuerySubaccountOrdersRequest.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: QuerySubaccountOrdersRequest): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(QuerySubaccountOrdersRequestConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): QuerySubaccountOrdersRequest {
      if (decoder is ProtobufMapperDecoder) {
        return QuerySubaccountOrdersRequestConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = QuerySubaccountOrdersResponse.KotlinxSerializer::class)
@SerialName(value = QuerySubaccountOrdersResponse.TYPE_URL)
public data class QuerySubaccountOrdersResponse(
  @ProtobufIndex(index = 1)
  public val buyOrders: List<SubaccountOrderData>,
  @ProtobufIndex(index = 2)
  public val sellOrders: List<SubaccountOrderData>,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/injective.exchange.v1beta1.QuerySubaccountOrdersResponse"
  }

  public object KotlinxSerializer : KSerializer<QuerySubaccountOrdersResponse> {
    private val delegator: KSerializer<QuerySubaccountOrdersResponse> =
        QuerySubaccountOrdersResponse.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: QuerySubaccountOrdersResponse): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(QuerySubaccountOrdersResponseConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): QuerySubaccountOrdersResponse {
      if (decoder is ProtobufMapperDecoder) {
        return QuerySubaccountOrdersResponseConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = SubaccountOrderbookMetadataWithMarket.KotlinxSerializer::class)
@SerialName(value = SubaccountOrderbookMetadataWithMarket.TYPE_URL)
public data class SubaccountOrderbookMetadataWithMarket(
  @ProtobufIndex(index = 1)
  public val metadata: SubaccountOrderbookMetadata,
  @ProtobufIndex(index = 2)
  public val marketId: String,
  @ProtobufIndex(index = 3)
  public val isBuy: Boolean,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String =
        "/injective.exchange.v1beta1.SubaccountOrderbookMetadataWithMarket"
  }

  public object KotlinxSerializer : KSerializer<SubaccountOrderbookMetadataWithMarket> {
    private val delegator: KSerializer<SubaccountOrderbookMetadataWithMarket> =
        SubaccountOrderbookMetadataWithMarket.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: SubaccountOrderbookMetadataWithMarket):
        Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(SubaccountOrderbookMetadataWithMarketConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): SubaccountOrderbookMetadataWithMarket {
      if (decoder is ProtobufMapperDecoder) {
        return SubaccountOrderbookMetadataWithMarketConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = QueryExchangeParamsRequest.KotlinxSerializer::class)
@SerialName(value = QueryExchangeParamsRequest.TYPE_URL)
public class QueryExchangeParamsRequest() : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/injective.exchange.v1beta1.QueryExchangeParamsRequest"
  }

  public object KotlinxSerializer : KSerializer<QueryExchangeParamsRequest> {
    private val delegator: KSerializer<QueryExchangeParamsRequest> =
        QueryExchangeParamsRequest.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: QueryExchangeParamsRequest): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(QueryExchangeParamsRequestConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): QueryExchangeParamsRequest {
      if (decoder is ProtobufMapperDecoder) {
        return QueryExchangeParamsRequestConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = QueryExchangeParamsResponse.KotlinxSerializer::class)
@SerialName(value = QueryExchangeParamsResponse.TYPE_URL)
public data class QueryExchangeParamsResponse(
  @ProtobufIndex(index = 1)
  public val params: Params,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/injective.exchange.v1beta1.QueryExchangeParamsResponse"
  }

  public object KotlinxSerializer : KSerializer<QueryExchangeParamsResponse> {
    private val delegator: KSerializer<QueryExchangeParamsResponse> =
        QueryExchangeParamsResponse.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: QueryExchangeParamsResponse): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(QueryExchangeParamsResponseConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): QueryExchangeParamsResponse {
      if (decoder is ProtobufMapperDecoder) {
        return QueryExchangeParamsResponseConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = QuerySubaccountDepositsRequest.KotlinxSerializer::class)
@SerialName(value = QuerySubaccountDepositsRequest.TYPE_URL)
public data class QuerySubaccountDepositsRequest(
  @ProtobufIndex(index = 1)
  public val subaccountId: String,
  @ProtobufIndex(index = 2)
  public val subaccount: Subaccount,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/injective.exchange.v1beta1.QuerySubaccountDepositsRequest"
  }

  public object KotlinxSerializer : KSerializer<QuerySubaccountDepositsRequest> {
    private val delegator: KSerializer<QuerySubaccountDepositsRequest> =
        QuerySubaccountDepositsRequest.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: QuerySubaccountDepositsRequest): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(QuerySubaccountDepositsRequestConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): QuerySubaccountDepositsRequest {
      if (decoder is ProtobufMapperDecoder) {
        return QuerySubaccountDepositsRequestConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = QuerySubaccountDepositsResponse.KotlinxSerializer::class)
@SerialName(value = QuerySubaccountDepositsResponse.TYPE_URL)
public data class QuerySubaccountDepositsResponse(
  @ProtobufIndex(index = 1)
  public val deposits: Map<String, Deposit>,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String =
        "/injective.exchange.v1beta1.QuerySubaccountDepositsResponse"
  }

  public object KotlinxSerializer : KSerializer<QuerySubaccountDepositsResponse> {
    private val delegator: KSerializer<QuerySubaccountDepositsResponse> =
        QuerySubaccountDepositsResponse.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: QuerySubaccountDepositsResponse):
        Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(QuerySubaccountDepositsResponseConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): QuerySubaccountDepositsResponse {
      if (decoder is ProtobufMapperDecoder) {
        return QuerySubaccountDepositsResponseConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = QueryExchangeBalancesRequest.KotlinxSerializer::class)
@SerialName(value = QueryExchangeBalancesRequest.TYPE_URL)
public class QueryExchangeBalancesRequest() : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/injective.exchange.v1beta1.QueryExchangeBalancesRequest"
  }

  public object KotlinxSerializer : KSerializer<QueryExchangeBalancesRequest> {
    private val delegator: KSerializer<QueryExchangeBalancesRequest> =
        QueryExchangeBalancesRequest.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: QueryExchangeBalancesRequest): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(QueryExchangeBalancesRequestConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): QueryExchangeBalancesRequest {
      if (decoder is ProtobufMapperDecoder) {
        return QueryExchangeBalancesRequestConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = QueryExchangeBalancesResponse.KotlinxSerializer::class)
@SerialName(value = QueryExchangeBalancesResponse.TYPE_URL)
public data class QueryExchangeBalancesResponse(
  @ProtobufIndex(index = 1)
  public val balances: List<Balance>,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/injective.exchange.v1beta1.QueryExchangeBalancesResponse"
  }

  public object KotlinxSerializer : KSerializer<QueryExchangeBalancesResponse> {
    private val delegator: KSerializer<QueryExchangeBalancesResponse> =
        QueryExchangeBalancesResponse.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: QueryExchangeBalancesResponse): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(QueryExchangeBalancesResponseConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): QueryExchangeBalancesResponse {
      if (decoder is ProtobufMapperDecoder) {
        return QueryExchangeBalancesResponseConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = QueryAggregateVolumeRequest.KotlinxSerializer::class)
@SerialName(value = QueryAggregateVolumeRequest.TYPE_URL)
public data class QueryAggregateVolumeRequest(
  @ProtobufIndex(index = 1)
  public val account: String,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/injective.exchange.v1beta1.QueryAggregateVolumeRequest"
  }

  public object KotlinxSerializer : KSerializer<QueryAggregateVolumeRequest> {
    private val delegator: KSerializer<QueryAggregateVolumeRequest> =
        QueryAggregateVolumeRequest.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: QueryAggregateVolumeRequest): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(QueryAggregateVolumeRequestConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): QueryAggregateVolumeRequest {
      if (decoder is ProtobufMapperDecoder) {
        return QueryAggregateVolumeRequestConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = QueryAggregateVolumeResponse.KotlinxSerializer::class)
@SerialName(value = QueryAggregateVolumeResponse.TYPE_URL)
public data class QueryAggregateVolumeResponse(
  @ProtobufIndex(index = 1)
  public val aggregateVolumes: List<MarketVolume>,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/injective.exchange.v1beta1.QueryAggregateVolumeResponse"
  }

  public object KotlinxSerializer : KSerializer<QueryAggregateVolumeResponse> {
    private val delegator: KSerializer<QueryAggregateVolumeResponse> =
        QueryAggregateVolumeResponse.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: QueryAggregateVolumeResponse): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(QueryAggregateVolumeResponseConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): QueryAggregateVolumeResponse {
      if (decoder is ProtobufMapperDecoder) {
        return QueryAggregateVolumeResponseConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = QueryAggregateVolumesRequest.KotlinxSerializer::class)
@SerialName(value = QueryAggregateVolumesRequest.TYPE_URL)
public data class QueryAggregateVolumesRequest(
  @ProtobufIndex(index = 1)
  public val accounts: List<String>,
  @ProtobufIndex(index = 2)
  public val marketIds: List<String>,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/injective.exchange.v1beta1.QueryAggregateVolumesRequest"
  }

  public object KotlinxSerializer : KSerializer<QueryAggregateVolumesRequest> {
    private val delegator: KSerializer<QueryAggregateVolumesRequest> =
        QueryAggregateVolumesRequest.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: QueryAggregateVolumesRequest): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(QueryAggregateVolumesRequestConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): QueryAggregateVolumesRequest {
      if (decoder is ProtobufMapperDecoder) {
        return QueryAggregateVolumesRequestConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = QueryAggregateVolumesResponse.KotlinxSerializer::class)
@SerialName(value = QueryAggregateVolumesResponse.TYPE_URL)
public data class QueryAggregateVolumesResponse(
  @ProtobufIndex(index = 1)
  public val aggregateAccountVolumes: List<AggregateAccountVolumeRecord>,
  @ProtobufIndex(index = 2)
  public val aggregateMarketVolumes: List<MarketVolume>,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/injective.exchange.v1beta1.QueryAggregateVolumesResponse"
  }

  public object KotlinxSerializer : KSerializer<QueryAggregateVolumesResponse> {
    private val delegator: KSerializer<QueryAggregateVolumesResponse> =
        QueryAggregateVolumesResponse.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: QueryAggregateVolumesResponse): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(QueryAggregateVolumesResponseConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): QueryAggregateVolumesResponse {
      if (decoder is ProtobufMapperDecoder) {
        return QueryAggregateVolumesResponseConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = QueryAggregateMarketVolumeRequest.KotlinxSerializer::class)
@SerialName(value = QueryAggregateMarketVolumeRequest.TYPE_URL)
public data class QueryAggregateMarketVolumeRequest(
  @ProtobufIndex(index = 1)
  public val marketId: String,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String =
        "/injective.exchange.v1beta1.QueryAggregateMarketVolumeRequest"
  }

  public object KotlinxSerializer : KSerializer<QueryAggregateMarketVolumeRequest> {
    private val delegator: KSerializer<QueryAggregateMarketVolumeRequest> =
        QueryAggregateMarketVolumeRequest.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: QueryAggregateMarketVolumeRequest):
        Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(QueryAggregateMarketVolumeRequestConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): QueryAggregateMarketVolumeRequest {
      if (decoder is ProtobufMapperDecoder) {
        return QueryAggregateMarketVolumeRequestConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = QueryAggregateMarketVolumeResponse.KotlinxSerializer::class)
@SerialName(value = QueryAggregateMarketVolumeResponse.TYPE_URL)
public data class QueryAggregateMarketVolumeResponse(
  @ProtobufIndex(index = 1)
  public val volume: VolumeRecord,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String =
        "/injective.exchange.v1beta1.QueryAggregateMarketVolumeResponse"
  }

  public object KotlinxSerializer : KSerializer<QueryAggregateMarketVolumeResponse> {
    private val delegator: KSerializer<QueryAggregateMarketVolumeResponse> =
        QueryAggregateMarketVolumeResponse.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: QueryAggregateMarketVolumeResponse):
        Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(QueryAggregateMarketVolumeResponseConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): QueryAggregateMarketVolumeResponse {
      if (decoder is ProtobufMapperDecoder) {
        return QueryAggregateMarketVolumeResponseConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = QueryDenomDecimalRequest.KotlinxSerializer::class)
@SerialName(value = QueryDenomDecimalRequest.TYPE_URL)
public data class QueryDenomDecimalRequest(
  @ProtobufIndex(index = 1)
  public val denom: String,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/injective.exchange.v1beta1.QueryDenomDecimalRequest"
  }

  public object KotlinxSerializer : KSerializer<QueryDenomDecimalRequest> {
    private val delegator: KSerializer<QueryDenomDecimalRequest> =
        QueryDenomDecimalRequest.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: QueryDenomDecimalRequest): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(QueryDenomDecimalRequestConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): QueryDenomDecimalRequest {
      if (decoder is ProtobufMapperDecoder) {
        return QueryDenomDecimalRequestConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = QueryDenomDecimalResponse.KotlinxSerializer::class)
@SerialName(value = QueryDenomDecimalResponse.TYPE_URL)
public data class QueryDenomDecimalResponse(
  @ProtobufIndex(index = 1)
  public val decimal: ULong,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/injective.exchange.v1beta1.QueryDenomDecimalResponse"
  }

  public object KotlinxSerializer : KSerializer<QueryDenomDecimalResponse> {
    private val delegator: KSerializer<QueryDenomDecimalResponse> =
        QueryDenomDecimalResponse.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: QueryDenomDecimalResponse): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(QueryDenomDecimalResponseConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): QueryDenomDecimalResponse {
      if (decoder is ProtobufMapperDecoder) {
        return QueryDenomDecimalResponseConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = QueryDenomDecimalsRequest.KotlinxSerializer::class)
@SerialName(value = QueryDenomDecimalsRequest.TYPE_URL)
public data class QueryDenomDecimalsRequest(
  @ProtobufIndex(index = 1)
  public val denoms: List<String>,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/injective.exchange.v1beta1.QueryDenomDecimalsRequest"
  }

  public object KotlinxSerializer : KSerializer<QueryDenomDecimalsRequest> {
    private val delegator: KSerializer<QueryDenomDecimalsRequest> =
        QueryDenomDecimalsRequest.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: QueryDenomDecimalsRequest): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(QueryDenomDecimalsRequestConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): QueryDenomDecimalsRequest {
      if (decoder is ProtobufMapperDecoder) {
        return QueryDenomDecimalsRequestConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = QueryDenomDecimalsResponse.KotlinxSerializer::class)
@SerialName(value = QueryDenomDecimalsResponse.TYPE_URL)
public data class QueryDenomDecimalsResponse(
  @ProtobufIndex(index = 1)
  public val denomDecimals: List<DenomDecimals>,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/injective.exchange.v1beta1.QueryDenomDecimalsResponse"
  }

  public object KotlinxSerializer : KSerializer<QueryDenomDecimalsResponse> {
    private val delegator: KSerializer<QueryDenomDecimalsResponse> =
        QueryDenomDecimalsResponse.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: QueryDenomDecimalsResponse): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(QueryDenomDecimalsResponseConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): QueryDenomDecimalsResponse {
      if (decoder is ProtobufMapperDecoder) {
        return QueryDenomDecimalsResponseConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = QueryAggregateMarketVolumesRequest.KotlinxSerializer::class)
@SerialName(value = QueryAggregateMarketVolumesRequest.TYPE_URL)
public data class QueryAggregateMarketVolumesRequest(
  @ProtobufIndex(index = 1)
  public val marketIds: List<String>,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String =
        "/injective.exchange.v1beta1.QueryAggregateMarketVolumesRequest"
  }

  public object KotlinxSerializer : KSerializer<QueryAggregateMarketVolumesRequest> {
    private val delegator: KSerializer<QueryAggregateMarketVolumesRequest> =
        QueryAggregateMarketVolumesRequest.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: QueryAggregateMarketVolumesRequest):
        Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(QueryAggregateMarketVolumesRequestConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): QueryAggregateMarketVolumesRequest {
      if (decoder is ProtobufMapperDecoder) {
        return QueryAggregateMarketVolumesRequestConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = QueryAggregateMarketVolumesResponse.KotlinxSerializer::class)
@SerialName(value = QueryAggregateMarketVolumesResponse.TYPE_URL)
public data class QueryAggregateMarketVolumesResponse(
  @ProtobufIndex(index = 1)
  public val volumes: List<MarketVolume>,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String =
        "/injective.exchange.v1beta1.QueryAggregateMarketVolumesResponse"
  }

  public object KotlinxSerializer : KSerializer<QueryAggregateMarketVolumesResponse> {
    private val delegator: KSerializer<QueryAggregateMarketVolumesResponse> =
        QueryAggregateMarketVolumesResponse.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: QueryAggregateMarketVolumesResponse):
        Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(QueryAggregateMarketVolumesResponseConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): QueryAggregateMarketVolumesResponse {
      if (decoder is ProtobufMapperDecoder) {
        return QueryAggregateMarketVolumesResponseConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = QuerySubaccountDepositRequest.KotlinxSerializer::class)
@SerialName(value = QuerySubaccountDepositRequest.TYPE_URL)
public data class QuerySubaccountDepositRequest(
  @ProtobufIndex(index = 1)
  public val subaccountId: String,
  @ProtobufIndex(index = 2)
  public val denom: String,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/injective.exchange.v1beta1.QuerySubaccountDepositRequest"
  }

  public object KotlinxSerializer : KSerializer<QuerySubaccountDepositRequest> {
    private val delegator: KSerializer<QuerySubaccountDepositRequest> =
        QuerySubaccountDepositRequest.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: QuerySubaccountDepositRequest): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(QuerySubaccountDepositRequestConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): QuerySubaccountDepositRequest {
      if (decoder is ProtobufMapperDecoder) {
        return QuerySubaccountDepositRequestConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = QuerySubaccountDepositResponse.KotlinxSerializer::class)
@SerialName(value = QuerySubaccountDepositResponse.TYPE_URL)
public data class QuerySubaccountDepositResponse(
  @ProtobufIndex(index = 1)
  public val deposits: Deposit,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/injective.exchange.v1beta1.QuerySubaccountDepositResponse"
  }

  public object KotlinxSerializer : KSerializer<QuerySubaccountDepositResponse> {
    private val delegator: KSerializer<QuerySubaccountDepositResponse> =
        QuerySubaccountDepositResponse.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: QuerySubaccountDepositResponse): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(QuerySubaccountDepositResponseConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): QuerySubaccountDepositResponse {
      if (decoder is ProtobufMapperDecoder) {
        return QuerySubaccountDepositResponseConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = QuerySpotMarketsRequest.KotlinxSerializer::class)
@SerialName(value = QuerySpotMarketsRequest.TYPE_URL)
public data class QuerySpotMarketsRequest(
  @ProtobufIndex(index = 1)
  public val status: String,
  @ProtobufIndex(index = 2)
  public val marketIds: List<String>,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/injective.exchange.v1beta1.QuerySpotMarketsRequest"
  }

  public object KotlinxSerializer : KSerializer<QuerySpotMarketsRequest> {
    private val delegator: KSerializer<QuerySpotMarketsRequest> =
        QuerySpotMarketsRequest.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: QuerySpotMarketsRequest): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(QuerySpotMarketsRequestConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): QuerySpotMarketsRequest {
      if (decoder is ProtobufMapperDecoder) {
        return QuerySpotMarketsRequestConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = QuerySpotMarketsResponse.KotlinxSerializer::class)
@SerialName(value = QuerySpotMarketsResponse.TYPE_URL)
public data class QuerySpotMarketsResponse(
  @ProtobufIndex(index = 1)
  public val markets: List<SpotMarket>,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/injective.exchange.v1beta1.QuerySpotMarketsResponse"
  }

  public object KotlinxSerializer : KSerializer<QuerySpotMarketsResponse> {
    private val delegator: KSerializer<QuerySpotMarketsResponse> =
        QuerySpotMarketsResponse.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: QuerySpotMarketsResponse): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(QuerySpotMarketsResponseConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): QuerySpotMarketsResponse {
      if (decoder is ProtobufMapperDecoder) {
        return QuerySpotMarketsResponseConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = QuerySpotMarketRequest.KotlinxSerializer::class)
@SerialName(value = QuerySpotMarketRequest.TYPE_URL)
public data class QuerySpotMarketRequest(
  @ProtobufIndex(index = 1)
  public val marketId: String,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/injective.exchange.v1beta1.QuerySpotMarketRequest"
  }

  public object KotlinxSerializer : KSerializer<QuerySpotMarketRequest> {
    private val delegator: KSerializer<QuerySpotMarketRequest> = QuerySpotMarketRequest.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: QuerySpotMarketRequest): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(QuerySpotMarketRequestConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): QuerySpotMarketRequest {
      if (decoder is ProtobufMapperDecoder) {
        return QuerySpotMarketRequestConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = QuerySpotMarketResponse.KotlinxSerializer::class)
@SerialName(value = QuerySpotMarketResponse.TYPE_URL)
public data class QuerySpotMarketResponse(
  @ProtobufIndex(index = 1)
  public val market: SpotMarket,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/injective.exchange.v1beta1.QuerySpotMarketResponse"
  }

  public object KotlinxSerializer : KSerializer<QuerySpotMarketResponse> {
    private val delegator: KSerializer<QuerySpotMarketResponse> =
        QuerySpotMarketResponse.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: QuerySpotMarketResponse): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(QuerySpotMarketResponseConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): QuerySpotMarketResponse {
      if (decoder is ProtobufMapperDecoder) {
        return QuerySpotMarketResponseConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = QuerySpotOrderbookRequest.KotlinxSerializer::class)
@SerialName(value = QuerySpotOrderbookRequest.TYPE_URL)
public data class QuerySpotOrderbookRequest(
  @ProtobufIndex(index = 1)
  public val marketId: String,
  @ProtobufIndex(index = 2)
  public val limit: ULong,
  @ProtobufIndex(index = 3)
  public val orderSide: OrderSide,
  @ProtobufIndex(index = 4)
  public val limitCumulativeNotional: String,
  @ProtobufIndex(index = 5)
  public val limitCumulativeQuantity: String,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/injective.exchange.v1beta1.QuerySpotOrderbookRequest"
  }

  public object KotlinxSerializer : KSerializer<QuerySpotOrderbookRequest> {
    private val delegator: KSerializer<QuerySpotOrderbookRequest> =
        QuerySpotOrderbookRequest.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: QuerySpotOrderbookRequest): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(QuerySpotOrderbookRequestConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): QuerySpotOrderbookRequest {
      if (decoder is ProtobufMapperDecoder) {
        return QuerySpotOrderbookRequestConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = QuerySpotOrderbookResponse.KotlinxSerializer::class)
@SerialName(value = QuerySpotOrderbookResponse.TYPE_URL)
public data class QuerySpotOrderbookResponse(
  @ProtobufIndex(index = 1)
  public val buysPriceLevel: List<Level>,
  @ProtobufIndex(index = 2)
  public val sellsPriceLevel: List<Level>,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/injective.exchange.v1beta1.QuerySpotOrderbookResponse"
  }

  public object KotlinxSerializer : KSerializer<QuerySpotOrderbookResponse> {
    private val delegator: KSerializer<QuerySpotOrderbookResponse> =
        QuerySpotOrderbookResponse.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: QuerySpotOrderbookResponse): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(QuerySpotOrderbookResponseConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): QuerySpotOrderbookResponse {
      if (decoder is ProtobufMapperDecoder) {
        return QuerySpotOrderbookResponseConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = FullSpotMarket.KotlinxSerializer::class)
@SerialName(value = FullSpotMarket.TYPE_URL)
public data class FullSpotMarket(
  @ProtobufIndex(index = 1)
  public val market: SpotMarket,
  @ProtobufIndex(index = 2)
  public val midPriceAndTob: MidPriceAndTOB,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/injective.exchange.v1beta1.FullSpotMarket"
  }

  public object KotlinxSerializer : KSerializer<FullSpotMarket> {
    private val delegator: KSerializer<FullSpotMarket> = FullSpotMarket.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: FullSpotMarket): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(FullSpotMarketConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): FullSpotMarket {
      if (decoder is ProtobufMapperDecoder) {
        return FullSpotMarketConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = QueryFullSpotMarketsRequest.KotlinxSerializer::class)
@SerialName(value = QueryFullSpotMarketsRequest.TYPE_URL)
public data class QueryFullSpotMarketsRequest(
  @ProtobufIndex(index = 1)
  public val status: String,
  @ProtobufIndex(index = 2)
  public val marketIds: List<String>,
  @ProtobufIndex(index = 3)
  public val withMidPriceAndTob: Boolean,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/injective.exchange.v1beta1.QueryFullSpotMarketsRequest"
  }

  public object KotlinxSerializer : KSerializer<QueryFullSpotMarketsRequest> {
    private val delegator: KSerializer<QueryFullSpotMarketsRequest> =
        QueryFullSpotMarketsRequest.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: QueryFullSpotMarketsRequest): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(QueryFullSpotMarketsRequestConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): QueryFullSpotMarketsRequest {
      if (decoder is ProtobufMapperDecoder) {
        return QueryFullSpotMarketsRequestConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = QueryFullSpotMarketsResponse.KotlinxSerializer::class)
@SerialName(value = QueryFullSpotMarketsResponse.TYPE_URL)
public data class QueryFullSpotMarketsResponse(
  @ProtobufIndex(index = 1)
  public val markets: List<FullSpotMarket>,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/injective.exchange.v1beta1.QueryFullSpotMarketsResponse"
  }

  public object KotlinxSerializer : KSerializer<QueryFullSpotMarketsResponse> {
    private val delegator: KSerializer<QueryFullSpotMarketsResponse> =
        QueryFullSpotMarketsResponse.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: QueryFullSpotMarketsResponse): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(QueryFullSpotMarketsResponseConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): QueryFullSpotMarketsResponse {
      if (decoder is ProtobufMapperDecoder) {
        return QueryFullSpotMarketsResponseConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = QueryFullSpotMarketRequest.KotlinxSerializer::class)
@SerialName(value = QueryFullSpotMarketRequest.TYPE_URL)
public data class QueryFullSpotMarketRequest(
  @ProtobufIndex(index = 1)
  public val marketId: String,
  @ProtobufIndex(index = 2)
  public val withMidPriceAndTob: Boolean,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/injective.exchange.v1beta1.QueryFullSpotMarketRequest"
  }

  public object KotlinxSerializer : KSerializer<QueryFullSpotMarketRequest> {
    private val delegator: KSerializer<QueryFullSpotMarketRequest> =
        QueryFullSpotMarketRequest.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: QueryFullSpotMarketRequest): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(QueryFullSpotMarketRequestConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): QueryFullSpotMarketRequest {
      if (decoder is ProtobufMapperDecoder) {
        return QueryFullSpotMarketRequestConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = QueryFullSpotMarketResponse.KotlinxSerializer::class)
@SerialName(value = QueryFullSpotMarketResponse.TYPE_URL)
public data class QueryFullSpotMarketResponse(
  @ProtobufIndex(index = 1)
  public val market: FullSpotMarket,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/injective.exchange.v1beta1.QueryFullSpotMarketResponse"
  }

  public object KotlinxSerializer : KSerializer<QueryFullSpotMarketResponse> {
    private val delegator: KSerializer<QueryFullSpotMarketResponse> =
        QueryFullSpotMarketResponse.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: QueryFullSpotMarketResponse): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(QueryFullSpotMarketResponseConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): QueryFullSpotMarketResponse {
      if (decoder is ProtobufMapperDecoder) {
        return QueryFullSpotMarketResponseConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = QuerySpotOrdersByHashesRequest.KotlinxSerializer::class)
@SerialName(value = QuerySpotOrdersByHashesRequest.TYPE_URL)
public data class QuerySpotOrdersByHashesRequest(
  @ProtobufIndex(index = 1)
  public val marketId: String,
  @ProtobufIndex(index = 2)
  public val subaccountId: String,
  @ProtobufIndex(index = 3)
  public val orderHashes: List<String>,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/injective.exchange.v1beta1.QuerySpotOrdersByHashesRequest"
  }

  public object KotlinxSerializer : KSerializer<QuerySpotOrdersByHashesRequest> {
    private val delegator: KSerializer<QuerySpotOrdersByHashesRequest> =
        QuerySpotOrdersByHashesRequest.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: QuerySpotOrdersByHashesRequest): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(QuerySpotOrdersByHashesRequestConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): QuerySpotOrdersByHashesRequest {
      if (decoder is ProtobufMapperDecoder) {
        return QuerySpotOrdersByHashesRequestConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = QuerySpotOrdersByHashesResponse.KotlinxSerializer::class)
@SerialName(value = QuerySpotOrdersByHashesResponse.TYPE_URL)
public data class QuerySpotOrdersByHashesResponse(
  @ProtobufIndex(index = 1)
  public val orders: List<TrimmedSpotLimitOrder>,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String =
        "/injective.exchange.v1beta1.QuerySpotOrdersByHashesResponse"
  }

  public object KotlinxSerializer : KSerializer<QuerySpotOrdersByHashesResponse> {
    private val delegator: KSerializer<QuerySpotOrdersByHashesResponse> =
        QuerySpotOrdersByHashesResponse.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: QuerySpotOrdersByHashesResponse):
        Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(QuerySpotOrdersByHashesResponseConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): QuerySpotOrdersByHashesResponse {
      if (decoder is ProtobufMapperDecoder) {
        return QuerySpotOrdersByHashesResponseConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = QueryTraderSpotOrdersRequest.KotlinxSerializer::class)
@SerialName(value = QueryTraderSpotOrdersRequest.TYPE_URL)
public data class QueryTraderSpotOrdersRequest(
  @ProtobufIndex(index = 1)
  public val marketId: String,
  @ProtobufIndex(index = 2)
  public val subaccountId: String,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/injective.exchange.v1beta1.QueryTraderSpotOrdersRequest"
  }

  public object KotlinxSerializer : KSerializer<QueryTraderSpotOrdersRequest> {
    private val delegator: KSerializer<QueryTraderSpotOrdersRequest> =
        QueryTraderSpotOrdersRequest.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: QueryTraderSpotOrdersRequest): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(QueryTraderSpotOrdersRequestConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): QueryTraderSpotOrdersRequest {
      if (decoder is ProtobufMapperDecoder) {
        return QueryTraderSpotOrdersRequestConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = QueryAccountAddressSpotOrdersRequest.KotlinxSerializer::class)
@SerialName(value = QueryAccountAddressSpotOrdersRequest.TYPE_URL)
public data class QueryAccountAddressSpotOrdersRequest(
  @ProtobufIndex(index = 1)
  public val marketId: String,
  @ProtobufIndex(index = 2)
  public val accountAddress: String,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String =
        "/injective.exchange.v1beta1.QueryAccountAddressSpotOrdersRequest"
  }

  public object KotlinxSerializer : KSerializer<QueryAccountAddressSpotOrdersRequest> {
    private val delegator: KSerializer<QueryAccountAddressSpotOrdersRequest> =
        QueryAccountAddressSpotOrdersRequest.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: QueryAccountAddressSpotOrdersRequest):
        Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(QueryAccountAddressSpotOrdersRequestConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): QueryAccountAddressSpotOrdersRequest {
      if (decoder is ProtobufMapperDecoder) {
        return QueryAccountAddressSpotOrdersRequestConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = TrimmedSpotLimitOrder.KotlinxSerializer::class)
@SerialName(value = TrimmedSpotLimitOrder.TYPE_URL)
public data class TrimmedSpotLimitOrder(
  @ProtobufIndex(index = 1)
  public val price: String,
  @ProtobufIndex(index = 2)
  public val quantity: String,
  @ProtobufIndex(index = 3)
  public val fillable: String,
  @ProtobufIndex(index = 4)
  public val isBuy: Boolean,
  @ProtobufIndex(index = 5)
  public val orderHash: String,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/injective.exchange.v1beta1.TrimmedSpotLimitOrder"
  }

  public object KotlinxSerializer : KSerializer<TrimmedSpotLimitOrder> {
    private val delegator: KSerializer<TrimmedSpotLimitOrder> = TrimmedSpotLimitOrder.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: TrimmedSpotLimitOrder): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(TrimmedSpotLimitOrderConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): TrimmedSpotLimitOrder {
      if (decoder is ProtobufMapperDecoder) {
        return TrimmedSpotLimitOrderConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = QueryTraderSpotOrdersResponse.KotlinxSerializer::class)
@SerialName(value = QueryTraderSpotOrdersResponse.TYPE_URL)
public data class QueryTraderSpotOrdersResponse(
  @ProtobufIndex(index = 1)
  public val orders: List<TrimmedSpotLimitOrder>,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/injective.exchange.v1beta1.QueryTraderSpotOrdersResponse"
  }

  public object KotlinxSerializer : KSerializer<QueryTraderSpotOrdersResponse> {
    private val delegator: KSerializer<QueryTraderSpotOrdersResponse> =
        QueryTraderSpotOrdersResponse.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: QueryTraderSpotOrdersResponse): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(QueryTraderSpotOrdersResponseConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): QueryTraderSpotOrdersResponse {
      if (decoder is ProtobufMapperDecoder) {
        return QueryTraderSpotOrdersResponseConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = QueryAccountAddressSpotOrdersResponse.KotlinxSerializer::class)
@SerialName(value = QueryAccountAddressSpotOrdersResponse.TYPE_URL)
public data class QueryAccountAddressSpotOrdersResponse(
  @ProtobufIndex(index = 1)
  public val orders: List<TrimmedSpotLimitOrder>,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String =
        "/injective.exchange.v1beta1.QueryAccountAddressSpotOrdersResponse"
  }

  public object KotlinxSerializer : KSerializer<QueryAccountAddressSpotOrdersResponse> {
    private val delegator: KSerializer<QueryAccountAddressSpotOrdersResponse> =
        QueryAccountAddressSpotOrdersResponse.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: QueryAccountAddressSpotOrdersResponse):
        Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(QueryAccountAddressSpotOrdersResponseConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): QueryAccountAddressSpotOrdersResponse {
      if (decoder is ProtobufMapperDecoder) {
        return QueryAccountAddressSpotOrdersResponseConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = QuerySpotMidPriceAndTOBRequest.KotlinxSerializer::class)
@SerialName(value = QuerySpotMidPriceAndTOBRequest.TYPE_URL)
public data class QuerySpotMidPriceAndTOBRequest(
  @ProtobufIndex(index = 1)
  public val marketId: String,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/injective.exchange.v1beta1.QuerySpotMidPriceAndTOBRequest"
  }

  public object KotlinxSerializer : KSerializer<QuerySpotMidPriceAndTOBRequest> {
    private val delegator: KSerializer<QuerySpotMidPriceAndTOBRequest> =
        QuerySpotMidPriceAndTOBRequest.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: QuerySpotMidPriceAndTOBRequest): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(QuerySpotMidPriceAndTOBRequestConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): QuerySpotMidPriceAndTOBRequest {
      if (decoder is ProtobufMapperDecoder) {
        return QuerySpotMidPriceAndTOBRequestConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = QuerySpotMidPriceAndTOBResponse.KotlinxSerializer::class)
@SerialName(value = QuerySpotMidPriceAndTOBResponse.TYPE_URL)
public data class QuerySpotMidPriceAndTOBResponse(
  @ProtobufIndex(index = 1)
  public val midPrice: String,
  @ProtobufIndex(index = 2)
  public val bestBuyPrice: String,
  @ProtobufIndex(index = 3)
  public val bestSellPrice: String,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String =
        "/injective.exchange.v1beta1.QuerySpotMidPriceAndTOBResponse"
  }

  public object KotlinxSerializer : KSerializer<QuerySpotMidPriceAndTOBResponse> {
    private val delegator: KSerializer<QuerySpotMidPriceAndTOBResponse> =
        QuerySpotMidPriceAndTOBResponse.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: QuerySpotMidPriceAndTOBResponse):
        Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(QuerySpotMidPriceAndTOBResponseConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): QuerySpotMidPriceAndTOBResponse {
      if (decoder is ProtobufMapperDecoder) {
        return QuerySpotMidPriceAndTOBResponseConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = QueryDerivativeMidPriceAndTOBRequest.KotlinxSerializer::class)
@SerialName(value = QueryDerivativeMidPriceAndTOBRequest.TYPE_URL)
public data class QueryDerivativeMidPriceAndTOBRequest(
  @ProtobufIndex(index = 1)
  public val marketId: String,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String =
        "/injective.exchange.v1beta1.QueryDerivativeMidPriceAndTOBRequest"
  }

  public object KotlinxSerializer : KSerializer<QueryDerivativeMidPriceAndTOBRequest> {
    private val delegator: KSerializer<QueryDerivativeMidPriceAndTOBRequest> =
        QueryDerivativeMidPriceAndTOBRequest.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: QueryDerivativeMidPriceAndTOBRequest):
        Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(QueryDerivativeMidPriceAndTOBRequestConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): QueryDerivativeMidPriceAndTOBRequest {
      if (decoder is ProtobufMapperDecoder) {
        return QueryDerivativeMidPriceAndTOBRequestConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = QueryDerivativeMidPriceAndTOBResponse.KotlinxSerializer::class)
@SerialName(value = QueryDerivativeMidPriceAndTOBResponse.TYPE_URL)
public data class QueryDerivativeMidPriceAndTOBResponse(
  @ProtobufIndex(index = 1)
  public val midPrice: String,
  @ProtobufIndex(index = 2)
  public val bestBuyPrice: String,
  @ProtobufIndex(index = 3)
  public val bestSellPrice: String,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String =
        "/injective.exchange.v1beta1.QueryDerivativeMidPriceAndTOBResponse"
  }

  public object KotlinxSerializer : KSerializer<QueryDerivativeMidPriceAndTOBResponse> {
    private val delegator: KSerializer<QueryDerivativeMidPriceAndTOBResponse> =
        QueryDerivativeMidPriceAndTOBResponse.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: QueryDerivativeMidPriceAndTOBResponse):
        Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(QueryDerivativeMidPriceAndTOBResponseConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): QueryDerivativeMidPriceAndTOBResponse {
      if (decoder is ProtobufMapperDecoder) {
        return QueryDerivativeMidPriceAndTOBResponseConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = QueryDerivativeOrderbookRequest.KotlinxSerializer::class)
@SerialName(value = QueryDerivativeOrderbookRequest.TYPE_URL)
public data class QueryDerivativeOrderbookRequest(
  @ProtobufIndex(index = 1)
  public val marketId: String,
  @ProtobufIndex(index = 2)
  public val limit: ULong,
  @ProtobufIndex(index = 3)
  public val limitCumulativeNotional: String,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String =
        "/injective.exchange.v1beta1.QueryDerivativeOrderbookRequest"
  }

  public object KotlinxSerializer : KSerializer<QueryDerivativeOrderbookRequest> {
    private val delegator: KSerializer<QueryDerivativeOrderbookRequest> =
        QueryDerivativeOrderbookRequest.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: QueryDerivativeOrderbookRequest):
        Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(QueryDerivativeOrderbookRequestConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): QueryDerivativeOrderbookRequest {
      if (decoder is ProtobufMapperDecoder) {
        return QueryDerivativeOrderbookRequestConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = QueryDerivativeOrderbookResponse.KotlinxSerializer::class)
@SerialName(value = QueryDerivativeOrderbookResponse.TYPE_URL)
public data class QueryDerivativeOrderbookResponse(
  @ProtobufIndex(index = 1)
  public val buysPriceLevel: List<Level>,
  @ProtobufIndex(index = 2)
  public val sellsPriceLevel: List<Level>,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String =
        "/injective.exchange.v1beta1.QueryDerivativeOrderbookResponse"
  }

  public object KotlinxSerializer : KSerializer<QueryDerivativeOrderbookResponse> {
    private val delegator: KSerializer<QueryDerivativeOrderbookResponse> =
        QueryDerivativeOrderbookResponse.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: QueryDerivativeOrderbookResponse):
        Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(QueryDerivativeOrderbookResponseConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): QueryDerivativeOrderbookResponse {
      if (decoder is ProtobufMapperDecoder) {
        return QueryDerivativeOrderbookResponseConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = QueryTraderSpotOrdersToCancelUpToAmountRequest.KotlinxSerializer::class)
@SerialName(value = QueryTraderSpotOrdersToCancelUpToAmountRequest.TYPE_URL)
public data class QueryTraderSpotOrdersToCancelUpToAmountRequest(
  @ProtobufIndex(index = 1)
  public val marketId: String,
  @ProtobufIndex(index = 2)
  public val subaccountId: String,
  @ProtobufIndex(index = 3)
  public val baseAmount: String,
  @ProtobufIndex(index = 4)
  public val quoteAmount: String,
  @ProtobufIndex(index = 5)
  public val strategy: CancellationStrategy,
  @ProtobufIndex(index = 6)
  public val referencePrice: String,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String =
        "/injective.exchange.v1beta1.QueryTraderSpotOrdersToCancelUpToAmountRequest"
  }

  public object KotlinxSerializer : KSerializer<QueryTraderSpotOrdersToCancelUpToAmountRequest> {
    private val delegator: KSerializer<QueryTraderSpotOrdersToCancelUpToAmountRequest> =
        QueryTraderSpotOrdersToCancelUpToAmountRequest.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder,
        `value`: QueryTraderSpotOrdersToCancelUpToAmountRequest): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(QueryTraderSpotOrdersToCancelUpToAmountRequestConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder):
        QueryTraderSpotOrdersToCancelUpToAmountRequest {
      if (decoder is ProtobufMapperDecoder) {
        return QueryTraderSpotOrdersToCancelUpToAmountRequestConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = QueryTraderDerivativeOrdersToCancelUpToAmountRequest.KotlinxSerializer::class)
@SerialName(value = QueryTraderDerivativeOrdersToCancelUpToAmountRequest.TYPE_URL)
public data class QueryTraderDerivativeOrdersToCancelUpToAmountRequest(
  @ProtobufIndex(index = 1)
  public val marketId: String,
  @ProtobufIndex(index = 2)
  public val subaccountId: String,
  @ProtobufIndex(index = 3)
  public val quoteAmount: String,
  @ProtobufIndex(index = 4)
  public val strategy: CancellationStrategy,
  @ProtobufIndex(index = 5)
  public val referencePrice: String,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String =
        "/injective.exchange.v1beta1.QueryTraderDerivativeOrdersToCancelUpToAmountRequest"
  }

  public object KotlinxSerializer :
      KSerializer<QueryTraderDerivativeOrdersToCancelUpToAmountRequest> {
    private val delegator: KSerializer<QueryTraderDerivativeOrdersToCancelUpToAmountRequest> =
        QueryTraderDerivativeOrdersToCancelUpToAmountRequest.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder,
        `value`: QueryTraderDerivativeOrdersToCancelUpToAmountRequest): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(QueryTraderDerivativeOrdersToCancelUpToAmountRequestConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder):
        QueryTraderDerivativeOrdersToCancelUpToAmountRequest {
      if (decoder is ProtobufMapperDecoder) {
        return QueryTraderDerivativeOrdersToCancelUpToAmountRequestConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = QueryTraderDerivativeOrdersRequest.KotlinxSerializer::class)
@SerialName(value = QueryTraderDerivativeOrdersRequest.TYPE_URL)
public data class QueryTraderDerivativeOrdersRequest(
  @ProtobufIndex(index = 1)
  public val marketId: String,
  @ProtobufIndex(index = 2)
  public val subaccountId: String,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String =
        "/injective.exchange.v1beta1.QueryTraderDerivativeOrdersRequest"
  }

  public object KotlinxSerializer : KSerializer<QueryTraderDerivativeOrdersRequest> {
    private val delegator: KSerializer<QueryTraderDerivativeOrdersRequest> =
        QueryTraderDerivativeOrdersRequest.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: QueryTraderDerivativeOrdersRequest):
        Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(QueryTraderDerivativeOrdersRequestConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): QueryTraderDerivativeOrdersRequest {
      if (decoder is ProtobufMapperDecoder) {
        return QueryTraderDerivativeOrdersRequestConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = QueryAccountAddressDerivativeOrdersRequest.KotlinxSerializer::class)
@SerialName(value = QueryAccountAddressDerivativeOrdersRequest.TYPE_URL)
public data class QueryAccountAddressDerivativeOrdersRequest(
  @ProtobufIndex(index = 1)
  public val marketId: String,
  @ProtobufIndex(index = 2)
  public val accountAddress: String,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String =
        "/injective.exchange.v1beta1.QueryAccountAddressDerivativeOrdersRequest"
  }

  public object KotlinxSerializer : KSerializer<QueryAccountAddressDerivativeOrdersRequest> {
    private val delegator: KSerializer<QueryAccountAddressDerivativeOrdersRequest> =
        QueryAccountAddressDerivativeOrdersRequest.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder,
        `value`: QueryAccountAddressDerivativeOrdersRequest): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(QueryAccountAddressDerivativeOrdersRequestConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): QueryAccountAddressDerivativeOrdersRequest {
      if (decoder is ProtobufMapperDecoder) {
        return QueryAccountAddressDerivativeOrdersRequestConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = TrimmedDerivativeLimitOrder.KotlinxSerializer::class)
@SerialName(value = TrimmedDerivativeLimitOrder.TYPE_URL)
public data class TrimmedDerivativeLimitOrder(
  @ProtobufIndex(index = 1)
  public val price: String,
  @ProtobufIndex(index = 2)
  public val quantity: String,
  @ProtobufIndex(index = 3)
  public val margin: String,
  @ProtobufIndex(index = 4)
  public val fillable: String,
  @ProtobufIndex(index = 5)
  public val isBuy: Boolean,
  @ProtobufIndex(index = 6)
  public val orderHash: String,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/injective.exchange.v1beta1.TrimmedDerivativeLimitOrder"
  }

  public object KotlinxSerializer : KSerializer<TrimmedDerivativeLimitOrder> {
    private val delegator: KSerializer<TrimmedDerivativeLimitOrder> =
        TrimmedDerivativeLimitOrder.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: TrimmedDerivativeLimitOrder): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(TrimmedDerivativeLimitOrderConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): TrimmedDerivativeLimitOrder {
      if (decoder is ProtobufMapperDecoder) {
        return TrimmedDerivativeLimitOrderConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = QueryTraderDerivativeOrdersResponse.KotlinxSerializer::class)
@SerialName(value = QueryTraderDerivativeOrdersResponse.TYPE_URL)
public data class QueryTraderDerivativeOrdersResponse(
  @ProtobufIndex(index = 1)
  public val orders: List<TrimmedDerivativeLimitOrder>,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String =
        "/injective.exchange.v1beta1.QueryTraderDerivativeOrdersResponse"
  }

  public object KotlinxSerializer : KSerializer<QueryTraderDerivativeOrdersResponse> {
    private val delegator: KSerializer<QueryTraderDerivativeOrdersResponse> =
        QueryTraderDerivativeOrdersResponse.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: QueryTraderDerivativeOrdersResponse):
        Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(QueryTraderDerivativeOrdersResponseConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): QueryTraderDerivativeOrdersResponse {
      if (decoder is ProtobufMapperDecoder) {
        return QueryTraderDerivativeOrdersResponseConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = QueryAccountAddressDerivativeOrdersResponse.KotlinxSerializer::class)
@SerialName(value = QueryAccountAddressDerivativeOrdersResponse.TYPE_URL)
public data class QueryAccountAddressDerivativeOrdersResponse(
  @ProtobufIndex(index = 1)
  public val orders: List<TrimmedDerivativeLimitOrder>,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String =
        "/injective.exchange.v1beta1.QueryAccountAddressDerivativeOrdersResponse"
  }

  public object KotlinxSerializer : KSerializer<QueryAccountAddressDerivativeOrdersResponse> {
    private val delegator: KSerializer<QueryAccountAddressDerivativeOrdersResponse> =
        QueryAccountAddressDerivativeOrdersResponse.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder,
        `value`: QueryAccountAddressDerivativeOrdersResponse): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(QueryAccountAddressDerivativeOrdersResponseConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): QueryAccountAddressDerivativeOrdersResponse {
      if (decoder is ProtobufMapperDecoder) {
        return QueryAccountAddressDerivativeOrdersResponseConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = QueryDerivativeOrdersByHashesRequest.KotlinxSerializer::class)
@SerialName(value = QueryDerivativeOrdersByHashesRequest.TYPE_URL)
public data class QueryDerivativeOrdersByHashesRequest(
  @ProtobufIndex(index = 1)
  public val marketId: String,
  @ProtobufIndex(index = 2)
  public val subaccountId: String,
  @ProtobufIndex(index = 3)
  public val orderHashes: List<String>,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String =
        "/injective.exchange.v1beta1.QueryDerivativeOrdersByHashesRequest"
  }

  public object KotlinxSerializer : KSerializer<QueryDerivativeOrdersByHashesRequest> {
    private val delegator: KSerializer<QueryDerivativeOrdersByHashesRequest> =
        QueryDerivativeOrdersByHashesRequest.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: QueryDerivativeOrdersByHashesRequest):
        Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(QueryDerivativeOrdersByHashesRequestConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): QueryDerivativeOrdersByHashesRequest {
      if (decoder is ProtobufMapperDecoder) {
        return QueryDerivativeOrdersByHashesRequestConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = QueryDerivativeOrdersByHashesResponse.KotlinxSerializer::class)
@SerialName(value = QueryDerivativeOrdersByHashesResponse.TYPE_URL)
public data class QueryDerivativeOrdersByHashesResponse(
  @ProtobufIndex(index = 1)
  public val orders: List<TrimmedDerivativeLimitOrder>,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String =
        "/injective.exchange.v1beta1.QueryDerivativeOrdersByHashesResponse"
  }

  public object KotlinxSerializer : KSerializer<QueryDerivativeOrdersByHashesResponse> {
    private val delegator: KSerializer<QueryDerivativeOrdersByHashesResponse> =
        QueryDerivativeOrdersByHashesResponse.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: QueryDerivativeOrdersByHashesResponse):
        Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(QueryDerivativeOrdersByHashesResponseConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): QueryDerivativeOrdersByHashesResponse {
      if (decoder is ProtobufMapperDecoder) {
        return QueryDerivativeOrdersByHashesResponseConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = QueryDerivativeMarketsRequest.KotlinxSerializer::class)
@SerialName(value = QueryDerivativeMarketsRequest.TYPE_URL)
public data class QueryDerivativeMarketsRequest(
  @ProtobufIndex(index = 1)
  public val status: String,
  @ProtobufIndex(index = 2)
  public val marketIds: List<String>,
  @ProtobufIndex(index = 3)
  public val withMidPriceAndTob: Boolean,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/injective.exchange.v1beta1.QueryDerivativeMarketsRequest"
  }

  public object KotlinxSerializer : KSerializer<QueryDerivativeMarketsRequest> {
    private val delegator: KSerializer<QueryDerivativeMarketsRequest> =
        QueryDerivativeMarketsRequest.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: QueryDerivativeMarketsRequest): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(QueryDerivativeMarketsRequestConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): QueryDerivativeMarketsRequest {
      if (decoder is ProtobufMapperDecoder) {
        return QueryDerivativeMarketsRequestConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = PriceLevel.KotlinxSerializer::class)
@SerialName(value = PriceLevel.TYPE_URL)
public data class PriceLevel(
  @ProtobufIndex(index = 1)
  public val price: String,
  @ProtobufIndex(index = 2)
  public val quantity: String,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/injective.exchange.v1beta1.PriceLevel"
  }

  public object KotlinxSerializer : KSerializer<PriceLevel> {
    private val delegator: KSerializer<PriceLevel> = PriceLevel.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: PriceLevel): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(PriceLevelConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): PriceLevel {
      if (decoder is ProtobufMapperDecoder) {
        return PriceLevelConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = PerpetualMarketState.KotlinxSerializer::class)
@SerialName(value = PerpetualMarketState.TYPE_URL)
public data class PerpetualMarketState(
  @ProtobufIndex(index = 1)
  public val marketInfo: PerpetualMarketInfo,
  @ProtobufIndex(index = 2)
  public val fundingInfo: PerpetualMarketFunding,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/injective.exchange.v1beta1.PerpetualMarketState"
  }

  public object KotlinxSerializer : KSerializer<PerpetualMarketState> {
    private val delegator: KSerializer<PerpetualMarketState> = PerpetualMarketState.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: PerpetualMarketState): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(PerpetualMarketStateConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): PerpetualMarketState {
      if (decoder is ProtobufMapperDecoder) {
        return PerpetualMarketStateConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = FullDerivativeMarket.KotlinxSerializer::class)
@SerialName(value = FullDerivativeMarket.TYPE_URL)
public data class FullDerivativeMarket(
  @ProtobufIndex(index = 1)
  public val market: DerivativeMarket,
  @ProtobufIndex(index = 4)
  public val markPrice: String,
  @ProtobufIndex(index = 5)
  public val midPriceAndTob: MidPriceAndTOB,
  public val info: InfoOneOf,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/injective.exchange.v1beta1.FullDerivativeMarket"
  }

  @Serializable
  public sealed interface InfoOneOf {
    @JvmInline
    public value class PerpetualInfo(
      @ProtobufIndex(index = 2)
      public val `value`: PerpetualMarketState,
    ) : InfoOneOf

    @JvmInline
    public value class FuturesInfo(
      @ProtobufIndex(index = 3)
      public val `value`: ExpiryFuturesMarketInfo,
    ) : InfoOneOf
  }

  public object KotlinxSerializer : KSerializer<FullDerivativeMarket> {
    private val delegator: KSerializer<FullDerivativeMarket> = FullDerivativeMarket.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: FullDerivativeMarket): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(FullDerivativeMarketConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): FullDerivativeMarket {
      if (decoder is ProtobufMapperDecoder) {
        return FullDerivativeMarketConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = QueryDerivativeMarketsResponse.KotlinxSerializer::class)
@SerialName(value = QueryDerivativeMarketsResponse.TYPE_URL)
public data class QueryDerivativeMarketsResponse(
  @ProtobufIndex(index = 1)
  public val markets: List<FullDerivativeMarket>,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/injective.exchange.v1beta1.QueryDerivativeMarketsResponse"
  }

  public object KotlinxSerializer : KSerializer<QueryDerivativeMarketsResponse> {
    private val delegator: KSerializer<QueryDerivativeMarketsResponse> =
        QueryDerivativeMarketsResponse.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: QueryDerivativeMarketsResponse): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(QueryDerivativeMarketsResponseConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): QueryDerivativeMarketsResponse {
      if (decoder is ProtobufMapperDecoder) {
        return QueryDerivativeMarketsResponseConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = QueryDerivativeMarketRequest.KotlinxSerializer::class)
@SerialName(value = QueryDerivativeMarketRequest.TYPE_URL)
public data class QueryDerivativeMarketRequest(
  @ProtobufIndex(index = 1)
  public val marketId: String,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/injective.exchange.v1beta1.QueryDerivativeMarketRequest"
  }

  public object KotlinxSerializer : KSerializer<QueryDerivativeMarketRequest> {
    private val delegator: KSerializer<QueryDerivativeMarketRequest> =
        QueryDerivativeMarketRequest.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: QueryDerivativeMarketRequest): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(QueryDerivativeMarketRequestConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): QueryDerivativeMarketRequest {
      if (decoder is ProtobufMapperDecoder) {
        return QueryDerivativeMarketRequestConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = QueryDerivativeMarketResponse.KotlinxSerializer::class)
@SerialName(value = QueryDerivativeMarketResponse.TYPE_URL)
public data class QueryDerivativeMarketResponse(
  @ProtobufIndex(index = 1)
  public val market: FullDerivativeMarket,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/injective.exchange.v1beta1.QueryDerivativeMarketResponse"
  }

  public object KotlinxSerializer : KSerializer<QueryDerivativeMarketResponse> {
    private val delegator: KSerializer<QueryDerivativeMarketResponse> =
        QueryDerivativeMarketResponse.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: QueryDerivativeMarketResponse): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(QueryDerivativeMarketResponseConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): QueryDerivativeMarketResponse {
      if (decoder is ProtobufMapperDecoder) {
        return QueryDerivativeMarketResponseConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = QueryDerivativeMarketAddressRequest.KotlinxSerializer::class)
@SerialName(value = QueryDerivativeMarketAddressRequest.TYPE_URL)
public data class QueryDerivativeMarketAddressRequest(
  @ProtobufIndex(index = 1)
  public val marketId: String,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String =
        "/injective.exchange.v1beta1.QueryDerivativeMarketAddressRequest"
  }

  public object KotlinxSerializer : KSerializer<QueryDerivativeMarketAddressRequest> {
    private val delegator: KSerializer<QueryDerivativeMarketAddressRequest> =
        QueryDerivativeMarketAddressRequest.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: QueryDerivativeMarketAddressRequest):
        Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(QueryDerivativeMarketAddressRequestConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): QueryDerivativeMarketAddressRequest {
      if (decoder is ProtobufMapperDecoder) {
        return QueryDerivativeMarketAddressRequestConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = QueryDerivativeMarketAddressResponse.KotlinxSerializer::class)
@SerialName(value = QueryDerivativeMarketAddressResponse.TYPE_URL)
public data class QueryDerivativeMarketAddressResponse(
  @ProtobufIndex(index = 1)
  public val address: String,
  @ProtobufIndex(index = 2)
  public val subaccountId: String,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String =
        "/injective.exchange.v1beta1.QueryDerivativeMarketAddressResponse"
  }

  public object KotlinxSerializer : KSerializer<QueryDerivativeMarketAddressResponse> {
    private val delegator: KSerializer<QueryDerivativeMarketAddressResponse> =
        QueryDerivativeMarketAddressResponse.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: QueryDerivativeMarketAddressResponse):
        Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(QueryDerivativeMarketAddressResponseConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): QueryDerivativeMarketAddressResponse {
      if (decoder is ProtobufMapperDecoder) {
        return QueryDerivativeMarketAddressResponseConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = QuerySubaccountTradeNonceRequest.KotlinxSerializer::class)
@SerialName(value = QuerySubaccountTradeNonceRequest.TYPE_URL)
public data class QuerySubaccountTradeNonceRequest(
  @ProtobufIndex(index = 1)
  public val subaccountId: String,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String =
        "/injective.exchange.v1beta1.QuerySubaccountTradeNonceRequest"
  }

  public object KotlinxSerializer : KSerializer<QuerySubaccountTradeNonceRequest> {
    private val delegator: KSerializer<QuerySubaccountTradeNonceRequest> =
        QuerySubaccountTradeNonceRequest.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: QuerySubaccountTradeNonceRequest):
        Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(QuerySubaccountTradeNonceRequestConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): QuerySubaccountTradeNonceRequest {
      if (decoder is ProtobufMapperDecoder) {
        return QuerySubaccountTradeNonceRequestConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = QuerySubaccountPositionsRequest.KotlinxSerializer::class)
@SerialName(value = QuerySubaccountPositionsRequest.TYPE_URL)
public data class QuerySubaccountPositionsRequest(
  @ProtobufIndex(index = 1)
  public val subaccountId: String,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String =
        "/injective.exchange.v1beta1.QuerySubaccountPositionsRequest"
  }

  public object KotlinxSerializer : KSerializer<QuerySubaccountPositionsRequest> {
    private val delegator: KSerializer<QuerySubaccountPositionsRequest> =
        QuerySubaccountPositionsRequest.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: QuerySubaccountPositionsRequest):
        Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(QuerySubaccountPositionsRequestConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): QuerySubaccountPositionsRequest {
      if (decoder is ProtobufMapperDecoder) {
        return QuerySubaccountPositionsRequestConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = QuerySubaccountPositionInMarketRequest.KotlinxSerializer::class)
@SerialName(value = QuerySubaccountPositionInMarketRequest.TYPE_URL)
public data class QuerySubaccountPositionInMarketRequest(
  @ProtobufIndex(index = 1)
  public val subaccountId: String,
  @ProtobufIndex(index = 2)
  public val marketId: String,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String =
        "/injective.exchange.v1beta1.QuerySubaccountPositionInMarketRequest"
  }

  public object KotlinxSerializer : KSerializer<QuerySubaccountPositionInMarketRequest> {
    private val delegator: KSerializer<QuerySubaccountPositionInMarketRequest> =
        QuerySubaccountPositionInMarketRequest.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder,
        `value`: QuerySubaccountPositionInMarketRequest): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(QuerySubaccountPositionInMarketRequestConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): QuerySubaccountPositionInMarketRequest {
      if (decoder is ProtobufMapperDecoder) {
        return QuerySubaccountPositionInMarketRequestConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = QuerySubaccountEffectivePositionInMarketRequest.KotlinxSerializer::class)
@SerialName(value = QuerySubaccountEffectivePositionInMarketRequest.TYPE_URL)
public data class QuerySubaccountEffectivePositionInMarketRequest(
  @ProtobufIndex(index = 1)
  public val subaccountId: String,
  @ProtobufIndex(index = 2)
  public val marketId: String,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String =
        "/injective.exchange.v1beta1.QuerySubaccountEffectivePositionInMarketRequest"
  }

  public object KotlinxSerializer : KSerializer<QuerySubaccountEffectivePositionInMarketRequest> {
    private val delegator: KSerializer<QuerySubaccountEffectivePositionInMarketRequest> =
        QuerySubaccountEffectivePositionInMarketRequest.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder,
        `value`: QuerySubaccountEffectivePositionInMarketRequest): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(QuerySubaccountEffectivePositionInMarketRequestConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder):
        QuerySubaccountEffectivePositionInMarketRequest {
      if (decoder is ProtobufMapperDecoder) {
        return QuerySubaccountEffectivePositionInMarketRequestConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = QuerySubaccountOrderMetadataRequest.KotlinxSerializer::class)
@SerialName(value = QuerySubaccountOrderMetadataRequest.TYPE_URL)
public data class QuerySubaccountOrderMetadataRequest(
  @ProtobufIndex(index = 1)
  public val subaccountId: String,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String =
        "/injective.exchange.v1beta1.QuerySubaccountOrderMetadataRequest"
  }

  public object KotlinxSerializer : KSerializer<QuerySubaccountOrderMetadataRequest> {
    private val delegator: KSerializer<QuerySubaccountOrderMetadataRequest> =
        QuerySubaccountOrderMetadataRequest.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: QuerySubaccountOrderMetadataRequest):
        Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(QuerySubaccountOrderMetadataRequestConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): QuerySubaccountOrderMetadataRequest {
      if (decoder is ProtobufMapperDecoder) {
        return QuerySubaccountOrderMetadataRequestConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = QuerySubaccountPositionsResponse.KotlinxSerializer::class)
@SerialName(value = QuerySubaccountPositionsResponse.TYPE_URL)
public data class QuerySubaccountPositionsResponse(
  @ProtobufIndex(index = 1)
  public val state: List<DerivativePosition>,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String =
        "/injective.exchange.v1beta1.QuerySubaccountPositionsResponse"
  }

  public object KotlinxSerializer : KSerializer<QuerySubaccountPositionsResponse> {
    private val delegator: KSerializer<QuerySubaccountPositionsResponse> =
        QuerySubaccountPositionsResponse.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: QuerySubaccountPositionsResponse):
        Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(QuerySubaccountPositionsResponseConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): QuerySubaccountPositionsResponse {
      if (decoder is ProtobufMapperDecoder) {
        return QuerySubaccountPositionsResponseConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = QuerySubaccountPositionInMarketResponse.KotlinxSerializer::class)
@SerialName(value = QuerySubaccountPositionInMarketResponse.TYPE_URL)
public data class QuerySubaccountPositionInMarketResponse(
  @ProtobufIndex(index = 1)
  public val state: Position,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String =
        "/injective.exchange.v1beta1.QuerySubaccountPositionInMarketResponse"
  }

  public object KotlinxSerializer : KSerializer<QuerySubaccountPositionInMarketResponse> {
    private val delegator: KSerializer<QuerySubaccountPositionInMarketResponse> =
        QuerySubaccountPositionInMarketResponse.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder,
        `value`: QuerySubaccountPositionInMarketResponse): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(QuerySubaccountPositionInMarketResponseConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): QuerySubaccountPositionInMarketResponse {
      if (decoder is ProtobufMapperDecoder) {
        return QuerySubaccountPositionInMarketResponseConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = EffectivePosition.KotlinxSerializer::class)
@SerialName(value = EffectivePosition.TYPE_URL)
public data class EffectivePosition(
  @ProtobufIndex(index = 1)
  public val isLong: Boolean,
  @ProtobufIndex(index = 2)
  public val quantity: String,
  @ProtobufIndex(index = 3)
  public val entryPrice: String,
  @ProtobufIndex(index = 4)
  public val effectiveMargin: String,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/injective.exchange.v1beta1.EffectivePosition"
  }

  public object KotlinxSerializer : KSerializer<EffectivePosition> {
    private val delegator: KSerializer<EffectivePosition> = EffectivePosition.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: EffectivePosition): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(EffectivePositionConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): EffectivePosition {
      if (decoder is ProtobufMapperDecoder) {
        return EffectivePositionConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = QuerySubaccountEffectivePositionInMarketResponse.KotlinxSerializer::class)
@SerialName(value = QuerySubaccountEffectivePositionInMarketResponse.TYPE_URL)
public data class QuerySubaccountEffectivePositionInMarketResponse(
  @ProtobufIndex(index = 1)
  public val state: EffectivePosition,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String =
        "/injective.exchange.v1beta1.QuerySubaccountEffectivePositionInMarketResponse"
  }

  public object KotlinxSerializer : KSerializer<QuerySubaccountEffectivePositionInMarketResponse> {
    private val delegator: KSerializer<QuerySubaccountEffectivePositionInMarketResponse> =
        QuerySubaccountEffectivePositionInMarketResponse.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder,
        `value`: QuerySubaccountEffectivePositionInMarketResponse): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(QuerySubaccountEffectivePositionInMarketResponseConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder):
        QuerySubaccountEffectivePositionInMarketResponse {
      if (decoder is ProtobufMapperDecoder) {
        return QuerySubaccountEffectivePositionInMarketResponseConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = QueryPerpetualMarketInfoRequest.KotlinxSerializer::class)
@SerialName(value = QueryPerpetualMarketInfoRequest.TYPE_URL)
public data class QueryPerpetualMarketInfoRequest(
  @ProtobufIndex(index = 1)
  public val marketId: String,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String =
        "/injective.exchange.v1beta1.QueryPerpetualMarketInfoRequest"
  }

  public object KotlinxSerializer : KSerializer<QueryPerpetualMarketInfoRequest> {
    private val delegator: KSerializer<QueryPerpetualMarketInfoRequest> =
        QueryPerpetualMarketInfoRequest.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: QueryPerpetualMarketInfoRequest):
        Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(QueryPerpetualMarketInfoRequestConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): QueryPerpetualMarketInfoRequest {
      if (decoder is ProtobufMapperDecoder) {
        return QueryPerpetualMarketInfoRequestConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = QueryPerpetualMarketInfoResponse.KotlinxSerializer::class)
@SerialName(value = QueryPerpetualMarketInfoResponse.TYPE_URL)
public data class QueryPerpetualMarketInfoResponse(
  @ProtobufIndex(index = 1)
  public val info: PerpetualMarketInfo,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String =
        "/injective.exchange.v1beta1.QueryPerpetualMarketInfoResponse"
  }

  public object KotlinxSerializer : KSerializer<QueryPerpetualMarketInfoResponse> {
    private val delegator: KSerializer<QueryPerpetualMarketInfoResponse> =
        QueryPerpetualMarketInfoResponse.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: QueryPerpetualMarketInfoResponse):
        Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(QueryPerpetualMarketInfoResponseConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): QueryPerpetualMarketInfoResponse {
      if (decoder is ProtobufMapperDecoder) {
        return QueryPerpetualMarketInfoResponseConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = QueryExpiryFuturesMarketInfoRequest.KotlinxSerializer::class)
@SerialName(value = QueryExpiryFuturesMarketInfoRequest.TYPE_URL)
public data class QueryExpiryFuturesMarketInfoRequest(
  @ProtobufIndex(index = 1)
  public val marketId: String,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String =
        "/injective.exchange.v1beta1.QueryExpiryFuturesMarketInfoRequest"
  }

  public object KotlinxSerializer : KSerializer<QueryExpiryFuturesMarketInfoRequest> {
    private val delegator: KSerializer<QueryExpiryFuturesMarketInfoRequest> =
        QueryExpiryFuturesMarketInfoRequest.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: QueryExpiryFuturesMarketInfoRequest):
        Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(QueryExpiryFuturesMarketInfoRequestConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): QueryExpiryFuturesMarketInfoRequest {
      if (decoder is ProtobufMapperDecoder) {
        return QueryExpiryFuturesMarketInfoRequestConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = QueryExpiryFuturesMarketInfoResponse.KotlinxSerializer::class)
@SerialName(value = QueryExpiryFuturesMarketInfoResponse.TYPE_URL)
public data class QueryExpiryFuturesMarketInfoResponse(
  @ProtobufIndex(index = 1)
  public val info: ExpiryFuturesMarketInfo,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String =
        "/injective.exchange.v1beta1.QueryExpiryFuturesMarketInfoResponse"
  }

  public object KotlinxSerializer : KSerializer<QueryExpiryFuturesMarketInfoResponse> {
    private val delegator: KSerializer<QueryExpiryFuturesMarketInfoResponse> =
        QueryExpiryFuturesMarketInfoResponse.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: QueryExpiryFuturesMarketInfoResponse):
        Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(QueryExpiryFuturesMarketInfoResponseConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): QueryExpiryFuturesMarketInfoResponse {
      if (decoder is ProtobufMapperDecoder) {
        return QueryExpiryFuturesMarketInfoResponseConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = QueryPerpetualMarketFundingRequest.KotlinxSerializer::class)
@SerialName(value = QueryPerpetualMarketFundingRequest.TYPE_URL)
public data class QueryPerpetualMarketFundingRequest(
  @ProtobufIndex(index = 1)
  public val marketId: String,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String =
        "/injective.exchange.v1beta1.QueryPerpetualMarketFundingRequest"
  }

  public object KotlinxSerializer : KSerializer<QueryPerpetualMarketFundingRequest> {
    private val delegator: KSerializer<QueryPerpetualMarketFundingRequest> =
        QueryPerpetualMarketFundingRequest.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: QueryPerpetualMarketFundingRequest):
        Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(QueryPerpetualMarketFundingRequestConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): QueryPerpetualMarketFundingRequest {
      if (decoder is ProtobufMapperDecoder) {
        return QueryPerpetualMarketFundingRequestConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = QueryPerpetualMarketFundingResponse.KotlinxSerializer::class)
@SerialName(value = QueryPerpetualMarketFundingResponse.TYPE_URL)
public data class QueryPerpetualMarketFundingResponse(
  @ProtobufIndex(index = 1)
  public val state: PerpetualMarketFunding,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String =
        "/injective.exchange.v1beta1.QueryPerpetualMarketFundingResponse"
  }

  public object KotlinxSerializer : KSerializer<QueryPerpetualMarketFundingResponse> {
    private val delegator: KSerializer<QueryPerpetualMarketFundingResponse> =
        QueryPerpetualMarketFundingResponse.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: QueryPerpetualMarketFundingResponse):
        Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(QueryPerpetualMarketFundingResponseConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): QueryPerpetualMarketFundingResponse {
      if (decoder is ProtobufMapperDecoder) {
        return QueryPerpetualMarketFundingResponseConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = QuerySubaccountOrderMetadataResponse.KotlinxSerializer::class)
@SerialName(value = QuerySubaccountOrderMetadataResponse.TYPE_URL)
public data class QuerySubaccountOrderMetadataResponse(
  @ProtobufIndex(index = 1)
  public val metadata: List<SubaccountOrderbookMetadataWithMarket>,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String =
        "/injective.exchange.v1beta1.QuerySubaccountOrderMetadataResponse"
  }

  public object KotlinxSerializer : KSerializer<QuerySubaccountOrderMetadataResponse> {
    private val delegator: KSerializer<QuerySubaccountOrderMetadataResponse> =
        QuerySubaccountOrderMetadataResponse.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: QuerySubaccountOrderMetadataResponse):
        Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(QuerySubaccountOrderMetadataResponseConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): QuerySubaccountOrderMetadataResponse {
      if (decoder is ProtobufMapperDecoder) {
        return QuerySubaccountOrderMetadataResponseConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = QuerySubaccountTradeNonceResponse.KotlinxSerializer::class)
@SerialName(value = QuerySubaccountTradeNonceResponse.TYPE_URL)
public data class QuerySubaccountTradeNonceResponse(
  @ProtobufIndex(index = 1)
  public val nonce: UInt,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String =
        "/injective.exchange.v1beta1.QuerySubaccountTradeNonceResponse"
  }

  public object KotlinxSerializer : KSerializer<QuerySubaccountTradeNonceResponse> {
    private val delegator: KSerializer<QuerySubaccountTradeNonceResponse> =
        QuerySubaccountTradeNonceResponse.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: QuerySubaccountTradeNonceResponse):
        Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(QuerySubaccountTradeNonceResponseConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): QuerySubaccountTradeNonceResponse {
      if (decoder is ProtobufMapperDecoder) {
        return QuerySubaccountTradeNonceResponseConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = QueryModuleStateRequest.KotlinxSerializer::class)
@SerialName(value = QueryModuleStateRequest.TYPE_URL)
public class QueryModuleStateRequest() : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/injective.exchange.v1beta1.QueryModuleStateRequest"
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
    public const val TYPE_URL: String = "/injective.exchange.v1beta1.QueryModuleStateResponse"
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

@Serializable(with = QueryPositionsRequest.KotlinxSerializer::class)
@SerialName(value = QueryPositionsRequest.TYPE_URL)
public class QueryPositionsRequest() : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/injective.exchange.v1beta1.QueryPositionsRequest"
  }

  public object KotlinxSerializer : KSerializer<QueryPositionsRequest> {
    private val delegator: KSerializer<QueryPositionsRequest> = QueryPositionsRequest.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: QueryPositionsRequest): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(QueryPositionsRequestConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): QueryPositionsRequest {
      if (decoder is ProtobufMapperDecoder) {
        return QueryPositionsRequestConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = QueryPositionsResponse.KotlinxSerializer::class)
@SerialName(value = QueryPositionsResponse.TYPE_URL)
public data class QueryPositionsResponse(
  @ProtobufIndex(index = 1)
  public val state: List<DerivativePosition>,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/injective.exchange.v1beta1.QueryPositionsResponse"
  }

  public object KotlinxSerializer : KSerializer<QueryPositionsResponse> {
    private val delegator: KSerializer<QueryPositionsResponse> = QueryPositionsResponse.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: QueryPositionsResponse): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(QueryPositionsResponseConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): QueryPositionsResponse {
      if (decoder is ProtobufMapperDecoder) {
        return QueryPositionsResponseConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = QueryTradeRewardPointsRequest.KotlinxSerializer::class)
@SerialName(value = QueryTradeRewardPointsRequest.TYPE_URL)
public data class QueryTradeRewardPointsRequest(
  @ProtobufIndex(index = 1)
  public val accounts: List<String>,
  @ProtobufIndex(index = 2)
  public val pendingPoolTimestamp: Long,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/injective.exchange.v1beta1.QueryTradeRewardPointsRequest"
  }

  public object KotlinxSerializer : KSerializer<QueryTradeRewardPointsRequest> {
    private val delegator: KSerializer<QueryTradeRewardPointsRequest> =
        QueryTradeRewardPointsRequest.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: QueryTradeRewardPointsRequest): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(QueryTradeRewardPointsRequestConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): QueryTradeRewardPointsRequest {
      if (decoder is ProtobufMapperDecoder) {
        return QueryTradeRewardPointsRequestConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = QueryTradeRewardPointsResponse.KotlinxSerializer::class)
@SerialName(value = QueryTradeRewardPointsResponse.TYPE_URL)
public data class QueryTradeRewardPointsResponse(
  @ProtobufIndex(index = 1)
  public val accountTradeRewardPoints: List<String>,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/injective.exchange.v1beta1.QueryTradeRewardPointsResponse"
  }

  public object KotlinxSerializer : KSerializer<QueryTradeRewardPointsResponse> {
    private val delegator: KSerializer<QueryTradeRewardPointsResponse> =
        QueryTradeRewardPointsResponse.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: QueryTradeRewardPointsResponse): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(QueryTradeRewardPointsResponseConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): QueryTradeRewardPointsResponse {
      if (decoder is ProtobufMapperDecoder) {
        return QueryTradeRewardPointsResponseConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = QueryTradeRewardCampaignRequest.KotlinxSerializer::class)
@SerialName(value = QueryTradeRewardCampaignRequest.TYPE_URL)
public class QueryTradeRewardCampaignRequest() : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String =
        "/injective.exchange.v1beta1.QueryTradeRewardCampaignRequest"
  }

  public object KotlinxSerializer : KSerializer<QueryTradeRewardCampaignRequest> {
    private val delegator: KSerializer<QueryTradeRewardCampaignRequest> =
        QueryTradeRewardCampaignRequest.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: QueryTradeRewardCampaignRequest):
        Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(QueryTradeRewardCampaignRequestConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): QueryTradeRewardCampaignRequest {
      if (decoder is ProtobufMapperDecoder) {
        return QueryTradeRewardCampaignRequestConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = QueryTradeRewardCampaignResponse.KotlinxSerializer::class)
@SerialName(value = QueryTradeRewardCampaignResponse.TYPE_URL)
public data class QueryTradeRewardCampaignResponse(
  @ProtobufIndex(index = 1)
  public val tradingRewardCampaignInfo: TradingRewardCampaignInfo,
  @ProtobufIndex(index = 2)
  public val tradingRewardPoolCampaignSchedule: List<CampaignRewardPool>,
  @ProtobufIndex(index = 3)
  public val totalTradeRewardPoints: String,
  @ProtobufIndex(index = 4)
  public val pendingTradingRewardPoolCampaignSchedule: List<CampaignRewardPool>,
  @ProtobufIndex(index = 5)
  public val pendingTotalTradeRewardPoints: List<String>,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String =
        "/injective.exchange.v1beta1.QueryTradeRewardCampaignResponse"
  }

  public object KotlinxSerializer : KSerializer<QueryTradeRewardCampaignResponse> {
    private val delegator: KSerializer<QueryTradeRewardCampaignResponse> =
        QueryTradeRewardCampaignResponse.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: QueryTradeRewardCampaignResponse):
        Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(QueryTradeRewardCampaignResponseConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): QueryTradeRewardCampaignResponse {
      if (decoder is ProtobufMapperDecoder) {
        return QueryTradeRewardCampaignResponseConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = QueryIsOptedOutOfRewardsRequest.KotlinxSerializer::class)
@SerialName(value = QueryIsOptedOutOfRewardsRequest.TYPE_URL)
public data class QueryIsOptedOutOfRewardsRequest(
  @ProtobufIndex(index = 1)
  public val account: String,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String =
        "/injective.exchange.v1beta1.QueryIsOptedOutOfRewardsRequest"
  }

  public object KotlinxSerializer : KSerializer<QueryIsOptedOutOfRewardsRequest> {
    private val delegator: KSerializer<QueryIsOptedOutOfRewardsRequest> =
        QueryIsOptedOutOfRewardsRequest.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: QueryIsOptedOutOfRewardsRequest):
        Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(QueryIsOptedOutOfRewardsRequestConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): QueryIsOptedOutOfRewardsRequest {
      if (decoder is ProtobufMapperDecoder) {
        return QueryIsOptedOutOfRewardsRequestConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = QueryIsOptedOutOfRewardsResponse.KotlinxSerializer::class)
@SerialName(value = QueryIsOptedOutOfRewardsResponse.TYPE_URL)
public data class QueryIsOptedOutOfRewardsResponse(
  @ProtobufIndex(index = 1)
  public val isOptedOut: Boolean,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String =
        "/injective.exchange.v1beta1.QueryIsOptedOutOfRewardsResponse"
  }

  public object KotlinxSerializer : KSerializer<QueryIsOptedOutOfRewardsResponse> {
    private val delegator: KSerializer<QueryIsOptedOutOfRewardsResponse> =
        QueryIsOptedOutOfRewardsResponse.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: QueryIsOptedOutOfRewardsResponse):
        Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(QueryIsOptedOutOfRewardsResponseConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): QueryIsOptedOutOfRewardsResponse {
      if (decoder is ProtobufMapperDecoder) {
        return QueryIsOptedOutOfRewardsResponseConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = QueryOptedOutOfRewardsAccountsRequest.KotlinxSerializer::class)
@SerialName(value = QueryOptedOutOfRewardsAccountsRequest.TYPE_URL)
public class QueryOptedOutOfRewardsAccountsRequest() : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String =
        "/injective.exchange.v1beta1.QueryOptedOutOfRewardsAccountsRequest"
  }

  public object KotlinxSerializer : KSerializer<QueryOptedOutOfRewardsAccountsRequest> {
    private val delegator: KSerializer<QueryOptedOutOfRewardsAccountsRequest> =
        QueryOptedOutOfRewardsAccountsRequest.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: QueryOptedOutOfRewardsAccountsRequest):
        Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(QueryOptedOutOfRewardsAccountsRequestConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): QueryOptedOutOfRewardsAccountsRequest {
      if (decoder is ProtobufMapperDecoder) {
        return QueryOptedOutOfRewardsAccountsRequestConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = QueryOptedOutOfRewardsAccountsResponse.KotlinxSerializer::class)
@SerialName(value = QueryOptedOutOfRewardsAccountsResponse.TYPE_URL)
public data class QueryOptedOutOfRewardsAccountsResponse(
  @ProtobufIndex(index = 1)
  public val accounts: List<String>,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String =
        "/injective.exchange.v1beta1.QueryOptedOutOfRewardsAccountsResponse"
  }

  public object KotlinxSerializer : KSerializer<QueryOptedOutOfRewardsAccountsResponse> {
    private val delegator: KSerializer<QueryOptedOutOfRewardsAccountsResponse> =
        QueryOptedOutOfRewardsAccountsResponse.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder,
        `value`: QueryOptedOutOfRewardsAccountsResponse): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(QueryOptedOutOfRewardsAccountsResponseConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): QueryOptedOutOfRewardsAccountsResponse {
      if (decoder is ProtobufMapperDecoder) {
        return QueryOptedOutOfRewardsAccountsResponseConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = QueryFeeDiscountAccountInfoRequest.KotlinxSerializer::class)
@SerialName(value = QueryFeeDiscountAccountInfoRequest.TYPE_URL)
public data class QueryFeeDiscountAccountInfoRequest(
  @ProtobufIndex(index = 1)
  public val account: String,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String =
        "/injective.exchange.v1beta1.QueryFeeDiscountAccountInfoRequest"
  }

  public object KotlinxSerializer : KSerializer<QueryFeeDiscountAccountInfoRequest> {
    private val delegator: KSerializer<QueryFeeDiscountAccountInfoRequest> =
        QueryFeeDiscountAccountInfoRequest.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: QueryFeeDiscountAccountInfoRequest):
        Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(QueryFeeDiscountAccountInfoRequestConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): QueryFeeDiscountAccountInfoRequest {
      if (decoder is ProtobufMapperDecoder) {
        return QueryFeeDiscountAccountInfoRequestConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = QueryFeeDiscountAccountInfoResponse.KotlinxSerializer::class)
@SerialName(value = QueryFeeDiscountAccountInfoResponse.TYPE_URL)
public data class QueryFeeDiscountAccountInfoResponse(
  @ProtobufIndex(index = 1)
  public val tierLevel: ULong,
  @ProtobufIndex(index = 2)
  public val accountInfo: FeeDiscountTierInfo,
  @ProtobufIndex(index = 3)
  public val accountTtl: FeeDiscountTierTTL,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String =
        "/injective.exchange.v1beta1.QueryFeeDiscountAccountInfoResponse"
  }

  public object KotlinxSerializer : KSerializer<QueryFeeDiscountAccountInfoResponse> {
    private val delegator: KSerializer<QueryFeeDiscountAccountInfoResponse> =
        QueryFeeDiscountAccountInfoResponse.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: QueryFeeDiscountAccountInfoResponse):
        Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(QueryFeeDiscountAccountInfoResponseConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): QueryFeeDiscountAccountInfoResponse {
      if (decoder is ProtobufMapperDecoder) {
        return QueryFeeDiscountAccountInfoResponseConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = QueryFeeDiscountScheduleRequest.KotlinxSerializer::class)
@SerialName(value = QueryFeeDiscountScheduleRequest.TYPE_URL)
public class QueryFeeDiscountScheduleRequest() : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String =
        "/injective.exchange.v1beta1.QueryFeeDiscountScheduleRequest"
  }

  public object KotlinxSerializer : KSerializer<QueryFeeDiscountScheduleRequest> {
    private val delegator: KSerializer<QueryFeeDiscountScheduleRequest> =
        QueryFeeDiscountScheduleRequest.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: QueryFeeDiscountScheduleRequest):
        Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(QueryFeeDiscountScheduleRequestConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): QueryFeeDiscountScheduleRequest {
      if (decoder is ProtobufMapperDecoder) {
        return QueryFeeDiscountScheduleRequestConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = QueryFeeDiscountScheduleResponse.KotlinxSerializer::class)
@SerialName(value = QueryFeeDiscountScheduleResponse.TYPE_URL)
public data class QueryFeeDiscountScheduleResponse(
  @ProtobufIndex(index = 1)
  public val feeDiscountSchedule: FeeDiscountSchedule,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String =
        "/injective.exchange.v1beta1.QueryFeeDiscountScheduleResponse"
  }

  public object KotlinxSerializer : KSerializer<QueryFeeDiscountScheduleResponse> {
    private val delegator: KSerializer<QueryFeeDiscountScheduleResponse> =
        QueryFeeDiscountScheduleResponse.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: QueryFeeDiscountScheduleResponse):
        Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(QueryFeeDiscountScheduleResponseConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): QueryFeeDiscountScheduleResponse {
      if (decoder is ProtobufMapperDecoder) {
        return QueryFeeDiscountScheduleResponseConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = QueryBalanceMismatchesRequest.KotlinxSerializer::class)
@SerialName(value = QueryBalanceMismatchesRequest.TYPE_URL)
public data class QueryBalanceMismatchesRequest(
  @ProtobufIndex(index = 1)
  public val dustFactor: Long,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/injective.exchange.v1beta1.QueryBalanceMismatchesRequest"
  }

  public object KotlinxSerializer : KSerializer<QueryBalanceMismatchesRequest> {
    private val delegator: KSerializer<QueryBalanceMismatchesRequest> =
        QueryBalanceMismatchesRequest.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: QueryBalanceMismatchesRequest): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(QueryBalanceMismatchesRequestConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): QueryBalanceMismatchesRequest {
      if (decoder is ProtobufMapperDecoder) {
        return QueryBalanceMismatchesRequestConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = BalanceMismatch.KotlinxSerializer::class)
@SerialName(value = BalanceMismatch.TYPE_URL)
public data class BalanceMismatch(
  @ProtobufIndex(index = 1)
  public val subaccountId: String,
  @ProtobufIndex(index = 2)
  public val denom: String,
  @ProtobufIndex(index = 3)
  public val available: String,
  @ProtobufIndex(index = 4)
  public val total: String,
  @ProtobufIndex(index = 5)
  public val balanceHold: String,
  @ProtobufIndex(index = 6)
  public val expectedTotal: String,
  @ProtobufIndex(index = 7)
  public val difference: String,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/injective.exchange.v1beta1.BalanceMismatch"
  }

  public object KotlinxSerializer : KSerializer<BalanceMismatch> {
    private val delegator: KSerializer<BalanceMismatch> = BalanceMismatch.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: BalanceMismatch): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(BalanceMismatchConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): BalanceMismatch {
      if (decoder is ProtobufMapperDecoder) {
        return BalanceMismatchConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = QueryBalanceMismatchesResponse.KotlinxSerializer::class)
@SerialName(value = QueryBalanceMismatchesResponse.TYPE_URL)
public data class QueryBalanceMismatchesResponse(
  @ProtobufIndex(index = 1)
  public val balanceMismatches: List<BalanceMismatch>,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/injective.exchange.v1beta1.QueryBalanceMismatchesResponse"
  }

  public object KotlinxSerializer : KSerializer<QueryBalanceMismatchesResponse> {
    private val delegator: KSerializer<QueryBalanceMismatchesResponse> =
        QueryBalanceMismatchesResponse.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: QueryBalanceMismatchesResponse): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(QueryBalanceMismatchesResponseConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): QueryBalanceMismatchesResponse {
      if (decoder is ProtobufMapperDecoder) {
        return QueryBalanceMismatchesResponseConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = QueryBalanceWithBalanceHoldsRequest.KotlinxSerializer::class)
@SerialName(value = QueryBalanceWithBalanceHoldsRequest.TYPE_URL)
public class QueryBalanceWithBalanceHoldsRequest() : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String =
        "/injective.exchange.v1beta1.QueryBalanceWithBalanceHoldsRequest"
  }

  public object KotlinxSerializer : KSerializer<QueryBalanceWithBalanceHoldsRequest> {
    private val delegator: KSerializer<QueryBalanceWithBalanceHoldsRequest> =
        QueryBalanceWithBalanceHoldsRequest.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: QueryBalanceWithBalanceHoldsRequest):
        Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(QueryBalanceWithBalanceHoldsRequestConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): QueryBalanceWithBalanceHoldsRequest {
      if (decoder is ProtobufMapperDecoder) {
        return QueryBalanceWithBalanceHoldsRequestConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = BalanceWithMarginHold.KotlinxSerializer::class)
@SerialName(value = BalanceWithMarginHold.TYPE_URL)
public data class BalanceWithMarginHold(
  @ProtobufIndex(index = 1)
  public val subaccountId: String,
  @ProtobufIndex(index = 2)
  public val denom: String,
  @ProtobufIndex(index = 3)
  public val available: String,
  @ProtobufIndex(index = 4)
  public val total: String,
  @ProtobufIndex(index = 5)
  public val balanceHold: String,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/injective.exchange.v1beta1.BalanceWithMarginHold"
  }

  public object KotlinxSerializer : KSerializer<BalanceWithMarginHold> {
    private val delegator: KSerializer<BalanceWithMarginHold> = BalanceWithMarginHold.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: BalanceWithMarginHold): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(BalanceWithMarginHoldConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): BalanceWithMarginHold {
      if (decoder is ProtobufMapperDecoder) {
        return BalanceWithMarginHoldConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = QueryBalanceWithBalanceHoldsResponse.KotlinxSerializer::class)
@SerialName(value = QueryBalanceWithBalanceHoldsResponse.TYPE_URL)
public data class QueryBalanceWithBalanceHoldsResponse(
  @ProtobufIndex(index = 1)
  public val balanceWithBalanceHolds: List<BalanceWithMarginHold>,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String =
        "/injective.exchange.v1beta1.QueryBalanceWithBalanceHoldsResponse"
  }

  public object KotlinxSerializer : KSerializer<QueryBalanceWithBalanceHoldsResponse> {
    private val delegator: KSerializer<QueryBalanceWithBalanceHoldsResponse> =
        QueryBalanceWithBalanceHoldsResponse.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: QueryBalanceWithBalanceHoldsResponse):
        Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(QueryBalanceWithBalanceHoldsResponseConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): QueryBalanceWithBalanceHoldsResponse {
      if (decoder is ProtobufMapperDecoder) {
        return QueryBalanceWithBalanceHoldsResponseConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = QueryFeeDiscountTierStatisticsRequest.KotlinxSerializer::class)
@SerialName(value = QueryFeeDiscountTierStatisticsRequest.TYPE_URL)
public class QueryFeeDiscountTierStatisticsRequest() : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String =
        "/injective.exchange.v1beta1.QueryFeeDiscountTierStatisticsRequest"
  }

  public object KotlinxSerializer : KSerializer<QueryFeeDiscountTierStatisticsRequest> {
    private val delegator: KSerializer<QueryFeeDiscountTierStatisticsRequest> =
        QueryFeeDiscountTierStatisticsRequest.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: QueryFeeDiscountTierStatisticsRequest):
        Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(QueryFeeDiscountTierStatisticsRequestConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): QueryFeeDiscountTierStatisticsRequest {
      if (decoder is ProtobufMapperDecoder) {
        return QueryFeeDiscountTierStatisticsRequestConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = TierStatistic.KotlinxSerializer::class)
@SerialName(value = TierStatistic.TYPE_URL)
public data class TierStatistic(
  @ProtobufIndex(index = 1)
  public val tier: ULong,
  @ProtobufIndex(index = 2)
  public val count: ULong,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/injective.exchange.v1beta1.TierStatistic"
  }

  public object KotlinxSerializer : KSerializer<TierStatistic> {
    private val delegator: KSerializer<TierStatistic> = TierStatistic.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: TierStatistic): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(TierStatisticConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): TierStatistic {
      if (decoder is ProtobufMapperDecoder) {
        return TierStatisticConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = QueryFeeDiscountTierStatisticsResponse.KotlinxSerializer::class)
@SerialName(value = QueryFeeDiscountTierStatisticsResponse.TYPE_URL)
public data class QueryFeeDiscountTierStatisticsResponse(
  @ProtobufIndex(index = 1)
  public val statistics: List<TierStatistic>,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String =
        "/injective.exchange.v1beta1.QueryFeeDiscountTierStatisticsResponse"
  }

  public object KotlinxSerializer : KSerializer<QueryFeeDiscountTierStatisticsResponse> {
    private val delegator: KSerializer<QueryFeeDiscountTierStatisticsResponse> =
        QueryFeeDiscountTierStatisticsResponse.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder,
        `value`: QueryFeeDiscountTierStatisticsResponse): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(QueryFeeDiscountTierStatisticsResponseConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): QueryFeeDiscountTierStatisticsResponse {
      if (decoder is ProtobufMapperDecoder) {
        return QueryFeeDiscountTierStatisticsResponseConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = MitoVaultInfosRequest.KotlinxSerializer::class)
@SerialName(value = MitoVaultInfosRequest.TYPE_URL)
public class MitoVaultInfosRequest() : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/injective.exchange.v1beta1.MitoVaultInfosRequest"
  }

  public object KotlinxSerializer : KSerializer<MitoVaultInfosRequest> {
    private val delegator: KSerializer<MitoVaultInfosRequest> = MitoVaultInfosRequest.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: MitoVaultInfosRequest): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(MitoVaultInfosRequestConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): MitoVaultInfosRequest {
      if (decoder is ProtobufMapperDecoder) {
        return MitoVaultInfosRequestConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = MitoVaultInfosResponse.KotlinxSerializer::class)
@SerialName(value = MitoVaultInfosResponse.TYPE_URL)
public data class MitoVaultInfosResponse(
  @ProtobufIndex(index = 1)
  public val masterAddresses: List<String>,
  @ProtobufIndex(index = 2)
  public val derivativeAddresses: List<String>,
  @ProtobufIndex(index = 3)
  public val spotAddresses: List<String>,
  @ProtobufIndex(index = 4)
  public val cw20Addresses: List<String>,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/injective.exchange.v1beta1.MitoVaultInfosResponse"
  }

  public object KotlinxSerializer : KSerializer<MitoVaultInfosResponse> {
    private val delegator: KSerializer<MitoVaultInfosResponse> = MitoVaultInfosResponse.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: MitoVaultInfosResponse): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(MitoVaultInfosResponseConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): MitoVaultInfosResponse {
      if (decoder is ProtobufMapperDecoder) {
        return MitoVaultInfosResponseConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = QueryMarketIDFromVaultRequest.KotlinxSerializer::class)
@SerialName(value = QueryMarketIDFromVaultRequest.TYPE_URL)
public data class QueryMarketIDFromVaultRequest(
  @ProtobufIndex(index = 1)
  public val vaultAddress: String,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/injective.exchange.v1beta1.QueryMarketIDFromVaultRequest"
  }

  public object KotlinxSerializer : KSerializer<QueryMarketIDFromVaultRequest> {
    private val delegator: KSerializer<QueryMarketIDFromVaultRequest> =
        QueryMarketIDFromVaultRequest.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: QueryMarketIDFromVaultRequest): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(QueryMarketIDFromVaultRequestConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): QueryMarketIDFromVaultRequest {
      if (decoder is ProtobufMapperDecoder) {
        return QueryMarketIDFromVaultRequestConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = QueryMarketIDFromVaultResponse.KotlinxSerializer::class)
@SerialName(value = QueryMarketIDFromVaultResponse.TYPE_URL)
public data class QueryMarketIDFromVaultResponse(
  @ProtobufIndex(index = 1)
  public val marketId: String,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/injective.exchange.v1beta1.QueryMarketIDFromVaultResponse"
  }

  public object KotlinxSerializer : KSerializer<QueryMarketIDFromVaultResponse> {
    private val delegator: KSerializer<QueryMarketIDFromVaultResponse> =
        QueryMarketIDFromVaultResponse.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: QueryMarketIDFromVaultResponse): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(QueryMarketIDFromVaultResponseConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): QueryMarketIDFromVaultResponse {
      if (decoder is ProtobufMapperDecoder) {
        return QueryMarketIDFromVaultResponseConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = QueryHistoricalTradeRecordsRequest.KotlinxSerializer::class)
@SerialName(value = QueryHistoricalTradeRecordsRequest.TYPE_URL)
public data class QueryHistoricalTradeRecordsRequest(
  @ProtobufIndex(index = 1)
  public val marketId: String,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String =
        "/injective.exchange.v1beta1.QueryHistoricalTradeRecordsRequest"
  }

  public object KotlinxSerializer : KSerializer<QueryHistoricalTradeRecordsRequest> {
    private val delegator: KSerializer<QueryHistoricalTradeRecordsRequest> =
        QueryHistoricalTradeRecordsRequest.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: QueryHistoricalTradeRecordsRequest):
        Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(QueryHistoricalTradeRecordsRequestConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): QueryHistoricalTradeRecordsRequest {
      if (decoder is ProtobufMapperDecoder) {
        return QueryHistoricalTradeRecordsRequestConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = QueryHistoricalTradeRecordsResponse.KotlinxSerializer::class)
@SerialName(value = QueryHistoricalTradeRecordsResponse.TYPE_URL)
public data class QueryHistoricalTradeRecordsResponse(
  @ProtobufIndex(index = 1)
  public val tradeRecords: List<TradeRecords>,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String =
        "/injective.exchange.v1beta1.QueryHistoricalTradeRecordsResponse"
  }

  public object KotlinxSerializer : KSerializer<QueryHistoricalTradeRecordsResponse> {
    private val delegator: KSerializer<QueryHistoricalTradeRecordsResponse> =
        QueryHistoricalTradeRecordsResponse.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: QueryHistoricalTradeRecordsResponse):
        Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(QueryHistoricalTradeRecordsResponseConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): QueryHistoricalTradeRecordsResponse {
      if (decoder is ProtobufMapperDecoder) {
        return QueryHistoricalTradeRecordsResponseConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = TradeHistoryOptions.KotlinxSerializer::class)
@SerialName(value = TradeHistoryOptions.TYPE_URL)
public data class TradeHistoryOptions(
  @ProtobufIndex(index = 1)
  public val tradeGroupingSec: ULong,
  @ProtobufIndex(index = 2)
  public val maxAge: ULong,
  @ProtobufIndex(index = 4)
  public val includeRawHistory: Boolean,
  @ProtobufIndex(index = 5)
  public val includeMetadata: Boolean,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/injective.exchange.v1beta1.TradeHistoryOptions"
  }

  public object KotlinxSerializer : KSerializer<TradeHistoryOptions> {
    private val delegator: KSerializer<TradeHistoryOptions> = TradeHistoryOptions.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: TradeHistoryOptions): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(TradeHistoryOptionsConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): TradeHistoryOptions {
      if (decoder is ProtobufMapperDecoder) {
        return TradeHistoryOptionsConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = QueryMarketVolatilityRequest.KotlinxSerializer::class)
@SerialName(value = QueryMarketVolatilityRequest.TYPE_URL)
public data class QueryMarketVolatilityRequest(
  @ProtobufIndex(index = 1)
  public val marketId: String,
  @ProtobufIndex(index = 2)
  public val tradeHistoryOptions: TradeHistoryOptions,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/injective.exchange.v1beta1.QueryMarketVolatilityRequest"
  }

  public object KotlinxSerializer : KSerializer<QueryMarketVolatilityRequest> {
    private val delegator: KSerializer<QueryMarketVolatilityRequest> =
        QueryMarketVolatilityRequest.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: QueryMarketVolatilityRequest): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(QueryMarketVolatilityRequestConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): QueryMarketVolatilityRequest {
      if (decoder is ProtobufMapperDecoder) {
        return QueryMarketVolatilityRequestConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = QueryMarketVolatilityResponse.KotlinxSerializer::class)
@SerialName(value = QueryMarketVolatilityResponse.TYPE_URL)
public data class QueryMarketVolatilityResponse(
  @ProtobufIndex(index = 1)
  public val volatility: String,
  @ProtobufIndex(index = 2)
  public val historyMetadata: MetadataStatistics,
  @ProtobufIndex(index = 3)
  public val rawHistory: List<TradeRecord>,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/injective.exchange.v1beta1.QueryMarketVolatilityResponse"
  }

  public object KotlinxSerializer : KSerializer<QueryMarketVolatilityResponse> {
    private val delegator: KSerializer<QueryMarketVolatilityResponse> =
        QueryMarketVolatilityResponse.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: QueryMarketVolatilityResponse): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(QueryMarketVolatilityResponseConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): QueryMarketVolatilityResponse {
      if (decoder is ProtobufMapperDecoder) {
        return QueryMarketVolatilityResponseConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = QueryBinaryMarketsRequest.KotlinxSerializer::class)
@SerialName(value = QueryBinaryMarketsRequest.TYPE_URL)
public data class QueryBinaryMarketsRequest(
  @ProtobufIndex(index = 1)
  public val status: String,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/injective.exchange.v1beta1.QueryBinaryMarketsRequest"
  }

  public object KotlinxSerializer : KSerializer<QueryBinaryMarketsRequest> {
    private val delegator: KSerializer<QueryBinaryMarketsRequest> =
        QueryBinaryMarketsRequest.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: QueryBinaryMarketsRequest): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(QueryBinaryMarketsRequestConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): QueryBinaryMarketsRequest {
      if (decoder is ProtobufMapperDecoder) {
        return QueryBinaryMarketsRequestConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = QueryBinaryMarketsResponse.KotlinxSerializer::class)
@SerialName(value = QueryBinaryMarketsResponse.TYPE_URL)
public data class QueryBinaryMarketsResponse(
  @ProtobufIndex(index = 1)
  public val markets: List<BinaryOptionsMarket>,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/injective.exchange.v1beta1.QueryBinaryMarketsResponse"
  }

  public object KotlinxSerializer : KSerializer<QueryBinaryMarketsResponse> {
    private val delegator: KSerializer<QueryBinaryMarketsResponse> =
        QueryBinaryMarketsResponse.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: QueryBinaryMarketsResponse): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(QueryBinaryMarketsResponseConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): QueryBinaryMarketsResponse {
      if (decoder is ProtobufMapperDecoder) {
        return QueryBinaryMarketsResponseConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = QueryTraderDerivativeConditionalOrdersRequest.KotlinxSerializer::class)
@SerialName(value = QueryTraderDerivativeConditionalOrdersRequest.TYPE_URL)
public data class QueryTraderDerivativeConditionalOrdersRequest(
  @ProtobufIndex(index = 1)
  public val subaccountId: String,
  @ProtobufIndex(index = 2)
  public val marketId: String,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String =
        "/injective.exchange.v1beta1.QueryTraderDerivativeConditionalOrdersRequest"
  }

  public object KotlinxSerializer : KSerializer<QueryTraderDerivativeConditionalOrdersRequest> {
    private val delegator: KSerializer<QueryTraderDerivativeConditionalOrdersRequest> =
        QueryTraderDerivativeConditionalOrdersRequest.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder,
        `value`: QueryTraderDerivativeConditionalOrdersRequest): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(QueryTraderDerivativeConditionalOrdersRequestConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder):
        QueryTraderDerivativeConditionalOrdersRequest {
      if (decoder is ProtobufMapperDecoder) {
        return QueryTraderDerivativeConditionalOrdersRequestConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = TrimmedDerivativeConditionalOrder.KotlinxSerializer::class)
@SerialName(value = TrimmedDerivativeConditionalOrder.TYPE_URL)
public data class TrimmedDerivativeConditionalOrder(
  @ProtobufIndex(index = 1)
  public val price: String,
  @ProtobufIndex(index = 2)
  public val quantity: String,
  @ProtobufIndex(index = 3)
  public val margin: String,
  @ProtobufIndex(index = 4)
  public val triggerPrice: String,
  @ProtobufIndex(index = 5)
  public val isBuy: Boolean,
  @ProtobufIndex(index = 6)
  public val isLimit: Boolean,
  @ProtobufIndex(index = 7)
  public val orderHash: String,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String =
        "/injective.exchange.v1beta1.TrimmedDerivativeConditionalOrder"
  }

  public object KotlinxSerializer : KSerializer<TrimmedDerivativeConditionalOrder> {
    private val delegator: KSerializer<TrimmedDerivativeConditionalOrder> =
        TrimmedDerivativeConditionalOrder.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: TrimmedDerivativeConditionalOrder):
        Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(TrimmedDerivativeConditionalOrderConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): TrimmedDerivativeConditionalOrder {
      if (decoder is ProtobufMapperDecoder) {
        return TrimmedDerivativeConditionalOrderConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = QueryTraderDerivativeConditionalOrdersResponse.KotlinxSerializer::class)
@SerialName(value = QueryTraderDerivativeConditionalOrdersResponse.TYPE_URL)
public data class QueryTraderDerivativeConditionalOrdersResponse(
  @ProtobufIndex(index = 1)
  public val orders: List<TrimmedDerivativeConditionalOrder>,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String =
        "/injective.exchange.v1beta1.QueryTraderDerivativeConditionalOrdersResponse"
  }

  public object KotlinxSerializer : KSerializer<QueryTraderDerivativeConditionalOrdersResponse> {
    private val delegator: KSerializer<QueryTraderDerivativeConditionalOrdersResponse> =
        QueryTraderDerivativeConditionalOrdersResponse.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder,
        `value`: QueryTraderDerivativeConditionalOrdersResponse): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(QueryTraderDerivativeConditionalOrdersResponseConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder):
        QueryTraderDerivativeConditionalOrdersResponse {
      if (decoder is ProtobufMapperDecoder) {
        return QueryTraderDerivativeConditionalOrdersResponseConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = QueryMarketAtomicExecutionFeeMultiplierRequest.KotlinxSerializer::class)
@SerialName(value = QueryMarketAtomicExecutionFeeMultiplierRequest.TYPE_URL)
public data class QueryMarketAtomicExecutionFeeMultiplierRequest(
  @ProtobufIndex(index = 1)
  public val marketId: String,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String =
        "/injective.exchange.v1beta1.QueryMarketAtomicExecutionFeeMultiplierRequest"
  }

  public object KotlinxSerializer : KSerializer<QueryMarketAtomicExecutionFeeMultiplierRequest> {
    private val delegator: KSerializer<QueryMarketAtomicExecutionFeeMultiplierRequest> =
        QueryMarketAtomicExecutionFeeMultiplierRequest.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder,
        `value`: QueryMarketAtomicExecutionFeeMultiplierRequest): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(QueryMarketAtomicExecutionFeeMultiplierRequestConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder):
        QueryMarketAtomicExecutionFeeMultiplierRequest {
      if (decoder is ProtobufMapperDecoder) {
        return QueryMarketAtomicExecutionFeeMultiplierRequestConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = QueryMarketAtomicExecutionFeeMultiplierResponse.KotlinxSerializer::class)
@SerialName(value = QueryMarketAtomicExecutionFeeMultiplierResponse.TYPE_URL)
public data class QueryMarketAtomicExecutionFeeMultiplierResponse(
  @ProtobufIndex(index = 1)
  public val multiplier: String,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String =
        "/injective.exchange.v1beta1.QueryMarketAtomicExecutionFeeMultiplierResponse"
  }

  public object KotlinxSerializer : KSerializer<QueryMarketAtomicExecutionFeeMultiplierResponse> {
    private val delegator: KSerializer<QueryMarketAtomicExecutionFeeMultiplierResponse> =
        QueryMarketAtomicExecutionFeeMultiplierResponse.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder,
        `value`: QueryMarketAtomicExecutionFeeMultiplierResponse): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(QueryMarketAtomicExecutionFeeMultiplierResponseConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder):
        QueryMarketAtomicExecutionFeeMultiplierResponse {
      if (decoder is ProtobufMapperDecoder) {
        return QueryMarketAtomicExecutionFeeMultiplierResponseConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}
