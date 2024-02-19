// Transform from injective/permissions/v1beta1/query.proto
@file:ProtobufSyntax(syntax = "PROTO3")
@file:GeneratorVersion(version = "0.3.1")

package injective.permissions.v1beta1

import kotlin.Boolean
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
    public const val TYPE_URL: String = "/injective.permissions.v1beta1.QueryParamsRequest"
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
    public const val TYPE_URL: String = "/injective.permissions.v1beta1.QueryParamsResponse"
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

@Serializable(with = QueryAllNamespacesRequest.KotlinxSerializer::class)
@SerialName(value = QueryAllNamespacesRequest.TYPE_URL)
public class QueryAllNamespacesRequest() : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/injective.permissions.v1beta1.QueryAllNamespacesRequest"
  }

  public object KotlinxSerializer : KSerializer<QueryAllNamespacesRequest> {
    private val delegator: KSerializer<QueryAllNamespacesRequest> =
        QueryAllNamespacesRequest.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: QueryAllNamespacesRequest): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(QueryAllNamespacesRequestConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): QueryAllNamespacesRequest {
      if (decoder is ProtobufMapperDecoder) {
        return QueryAllNamespacesRequestConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = QueryAllNamespacesResponse.KotlinxSerializer::class)
@SerialName(value = QueryAllNamespacesResponse.TYPE_URL)
public data class QueryAllNamespacesResponse(
  @ProtobufIndex(index = 1)
  public val namespaces: List<Namespace>,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/injective.permissions.v1beta1.QueryAllNamespacesResponse"
  }

  public object KotlinxSerializer : KSerializer<QueryAllNamespacesResponse> {
    private val delegator: KSerializer<QueryAllNamespacesResponse> =
        QueryAllNamespacesResponse.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: QueryAllNamespacesResponse): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(QueryAllNamespacesResponseConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): QueryAllNamespacesResponse {
      if (decoder is ProtobufMapperDecoder) {
        return QueryAllNamespacesResponseConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = QueryNamespaceByDenomRequest.KotlinxSerializer::class)
@SerialName(value = QueryNamespaceByDenomRequest.TYPE_URL)
public data class QueryNamespaceByDenomRequest(
  @ProtobufIndex(index = 1)
  public val denom: String,
  @ProtobufIndex(index = 2)
  public val includeRoles: Boolean,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String =
        "/injective.permissions.v1beta1.QueryNamespaceByDenomRequest"
  }

  public object KotlinxSerializer : KSerializer<QueryNamespaceByDenomRequest> {
    private val delegator: KSerializer<QueryNamespaceByDenomRequest> =
        QueryNamespaceByDenomRequest.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: QueryNamespaceByDenomRequest): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(QueryNamespaceByDenomRequestConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): QueryNamespaceByDenomRequest {
      if (decoder is ProtobufMapperDecoder) {
        return QueryNamespaceByDenomRequestConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = QueryNamespaceByDenomResponse.KotlinxSerializer::class)
@SerialName(value = QueryNamespaceByDenomResponse.TYPE_URL)
public data class QueryNamespaceByDenomResponse(
  @ProtobufIndex(index = 1)
  public val namespace: Namespace,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String =
        "/injective.permissions.v1beta1.QueryNamespaceByDenomResponse"
  }

  public object KotlinxSerializer : KSerializer<QueryNamespaceByDenomResponse> {
    private val delegator: KSerializer<QueryNamespaceByDenomResponse> =
        QueryNamespaceByDenomResponse.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: QueryNamespaceByDenomResponse): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(QueryNamespaceByDenomResponseConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): QueryNamespaceByDenomResponse {
      if (decoder is ProtobufMapperDecoder) {
        return QueryNamespaceByDenomResponseConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = QueryAddressesByRoleRequest.KotlinxSerializer::class)
@SerialName(value = QueryAddressesByRoleRequest.TYPE_URL)
public data class QueryAddressesByRoleRequest(
  @ProtobufIndex(index = 1)
  public val denom: String,
  @ProtobufIndex(index = 2)
  public val role: String,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/injective.permissions.v1beta1.QueryAddressesByRoleRequest"
  }

  public object KotlinxSerializer : KSerializer<QueryAddressesByRoleRequest> {
    private val delegator: KSerializer<QueryAddressesByRoleRequest> =
        QueryAddressesByRoleRequest.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: QueryAddressesByRoleRequest): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(QueryAddressesByRoleRequestConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): QueryAddressesByRoleRequest {
      if (decoder is ProtobufMapperDecoder) {
        return QueryAddressesByRoleRequestConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = QueryAddressesByRoleResponse.KotlinxSerializer::class)
@SerialName(value = QueryAddressesByRoleResponse.TYPE_URL)
public data class QueryAddressesByRoleResponse(
  @ProtobufIndex(index = 1)
  public val addresses: List<String>,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String =
        "/injective.permissions.v1beta1.QueryAddressesByRoleResponse"
  }

  public object KotlinxSerializer : KSerializer<QueryAddressesByRoleResponse> {
    private val delegator: KSerializer<QueryAddressesByRoleResponse> =
        QueryAddressesByRoleResponse.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: QueryAddressesByRoleResponse): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(QueryAddressesByRoleResponseConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): QueryAddressesByRoleResponse {
      if (decoder is ProtobufMapperDecoder) {
        return QueryAddressesByRoleResponseConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = QueryAddressRolesRequest.KotlinxSerializer::class)
@SerialName(value = QueryAddressRolesRequest.TYPE_URL)
public data class QueryAddressRolesRequest(
  @ProtobufIndex(index = 1)
  public val denom: String,
  @ProtobufIndex(index = 2)
  public val address: String,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/injective.permissions.v1beta1.QueryAddressRolesRequest"
  }

  public object KotlinxSerializer : KSerializer<QueryAddressRolesRequest> {
    private val delegator: KSerializer<QueryAddressRolesRequest> =
        QueryAddressRolesRequest.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: QueryAddressRolesRequest): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(QueryAddressRolesRequestConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): QueryAddressRolesRequest {
      if (decoder is ProtobufMapperDecoder) {
        return QueryAddressRolesRequestConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = QueryAddressRolesResponse.KotlinxSerializer::class)
@SerialName(value = QueryAddressRolesResponse.TYPE_URL)
public data class QueryAddressRolesResponse(
  @ProtobufIndex(index = 1)
  public val roles: List<String>,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/injective.permissions.v1beta1.QueryAddressRolesResponse"
  }

  public object KotlinxSerializer : KSerializer<QueryAddressRolesResponse> {
    private val delegator: KSerializer<QueryAddressRolesResponse> =
        QueryAddressRolesResponse.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: QueryAddressRolesResponse): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(QueryAddressRolesResponseConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): QueryAddressRolesResponse {
      if (decoder is ProtobufMapperDecoder) {
        return QueryAddressRolesResponseConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = QueryVouchersForAddressRequest.KotlinxSerializer::class)
@SerialName(value = QueryVouchersForAddressRequest.TYPE_URL)
public data class QueryVouchersForAddressRequest(
  @ProtobufIndex(index = 1)
  public val address: String,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String =
        "/injective.permissions.v1beta1.QueryVouchersForAddressRequest"
  }

  public object KotlinxSerializer : KSerializer<QueryVouchersForAddressRequest> {
    private val delegator: KSerializer<QueryVouchersForAddressRequest> =
        QueryVouchersForAddressRequest.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: QueryVouchersForAddressRequest): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(QueryVouchersForAddressRequestConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): QueryVouchersForAddressRequest {
      if (decoder is ProtobufMapperDecoder) {
        return QueryVouchersForAddressRequestConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = QueryVouchersForAddressResponse.KotlinxSerializer::class)
@SerialName(value = QueryVouchersForAddressResponse.TYPE_URL)
public data class QueryVouchersForAddressResponse(
  @ProtobufIndex(index = 1)
  public val vouchers: List<AddressVoucher>,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String =
        "/injective.permissions.v1beta1.QueryVouchersForAddressResponse"
  }

  public object KotlinxSerializer : KSerializer<QueryVouchersForAddressResponse> {
    private val delegator: KSerializer<QueryVouchersForAddressResponse> =
        QueryVouchersForAddressResponse.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: QueryVouchersForAddressResponse):
        Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(QueryVouchersForAddressResponseConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): QueryVouchersForAddressResponse {
      if (decoder is ProtobufMapperDecoder) {
        return QueryVouchersForAddressResponseConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}
