// Transform from injective/wasmx/v1/query.proto
@file:ProtobufSyntax(syntax = "PROTO3")
@file:GeneratorVersion(version = "0.3.1")

package injective.wasmx.v1

import kotlin.String
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

@Serializable(with = QueryWasmxParamsRequest.KotlinxSerializer::class)
@SerialName(value = QueryWasmxParamsRequest.TYPE_URL)
public class QueryWasmxParamsRequest() : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/injective.wasmx.v1.QueryWasmxParamsRequest"
  }

  public object KotlinxSerializer : KSerializer<QueryWasmxParamsRequest> {
    private val delegator: KSerializer<QueryWasmxParamsRequest> =
        QueryWasmxParamsRequest.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: QueryWasmxParamsRequest): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(QueryWasmxParamsRequestConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): QueryWasmxParamsRequest {
      if (decoder is ProtobufMapperDecoder) {
        return QueryWasmxParamsRequestConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = QueryWasmxParamsResponse.KotlinxSerializer::class)
@SerialName(value = QueryWasmxParamsResponse.TYPE_URL)
public data class QueryWasmxParamsResponse(
  @ProtobufIndex(index = 1)
  public val params: Params,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/injective.wasmx.v1.QueryWasmxParamsResponse"
  }

  public object KotlinxSerializer : KSerializer<QueryWasmxParamsResponse> {
    private val delegator: KSerializer<QueryWasmxParamsResponse> =
        QueryWasmxParamsResponse.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: QueryWasmxParamsResponse): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(QueryWasmxParamsResponseConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): QueryWasmxParamsResponse {
      if (decoder is ProtobufMapperDecoder) {
        return QueryWasmxParamsResponseConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = QueryModuleStateRequest.KotlinxSerializer::class)
@SerialName(value = QueryModuleStateRequest.TYPE_URL)
public class QueryModuleStateRequest() : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/injective.wasmx.v1.QueryModuleStateRequest"
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
    public const val TYPE_URL: String = "/injective.wasmx.v1.QueryModuleStateResponse"
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

@Serializable(with = QueryContractRegistrationInfoRequest.KotlinxSerializer::class)
@SerialName(value = QueryContractRegistrationInfoRequest.TYPE_URL)
public data class QueryContractRegistrationInfoRequest(
  @ProtobufIndex(index = 1)
  public val contractAddress: String,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/injective.wasmx.v1.QueryContractRegistrationInfoRequest"
  }

  public object KotlinxSerializer : KSerializer<QueryContractRegistrationInfoRequest> {
    private val delegator: KSerializer<QueryContractRegistrationInfoRequest> =
        QueryContractRegistrationInfoRequest.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: QueryContractRegistrationInfoRequest):
        Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(QueryContractRegistrationInfoRequestConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): QueryContractRegistrationInfoRequest {
      if (decoder is ProtobufMapperDecoder) {
        return QueryContractRegistrationInfoRequestConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = QueryContractRegistrationInfoResponse.KotlinxSerializer::class)
@SerialName(value = QueryContractRegistrationInfoResponse.TYPE_URL)
public data class QueryContractRegistrationInfoResponse(
  @ProtobufIndex(index = 1)
  public val contract: RegisteredContract,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/injective.wasmx.v1.QueryContractRegistrationInfoResponse"
  }

  public object KotlinxSerializer : KSerializer<QueryContractRegistrationInfoResponse> {
    private val delegator: KSerializer<QueryContractRegistrationInfoResponse> =
        QueryContractRegistrationInfoResponse.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: QueryContractRegistrationInfoResponse):
        Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(QueryContractRegistrationInfoResponseConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): QueryContractRegistrationInfoResponse {
      if (decoder is ProtobufMapperDecoder) {
        return QueryContractRegistrationInfoResponseConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}
