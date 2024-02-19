// Transform from injective/exchange/v1beta1/authz.proto
@file:ProtobufSyntax(syntax = "PROTO3")
@file:GeneratorVersion(version = "0.3.1")

package injective.exchange.v1beta1

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

@Serializable(with = CreateSpotLimitOrderAuthz.KotlinxSerializer::class)
@SerialName(value = CreateSpotLimitOrderAuthz.TYPE_URL)
public data class CreateSpotLimitOrderAuthz(
  @ProtobufIndex(index = 1)
  public val subaccountId: String,
  @ProtobufIndex(index = 2)
  public val marketIds: List<String>,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/injective.exchange.v1beta1.CreateSpotLimitOrderAuthz"
  }

  public object KotlinxSerializer : KSerializer<CreateSpotLimitOrderAuthz> {
    private val delegator: KSerializer<CreateSpotLimitOrderAuthz> =
        CreateSpotLimitOrderAuthz.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: CreateSpotLimitOrderAuthz): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(CreateSpotLimitOrderAuthzConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): CreateSpotLimitOrderAuthz {
      if (decoder is ProtobufMapperDecoder) {
        return CreateSpotLimitOrderAuthzConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = CreateSpotMarketOrderAuthz.KotlinxSerializer::class)
@SerialName(value = CreateSpotMarketOrderAuthz.TYPE_URL)
public data class CreateSpotMarketOrderAuthz(
  @ProtobufIndex(index = 1)
  public val subaccountId: String,
  @ProtobufIndex(index = 2)
  public val marketIds: List<String>,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/injective.exchange.v1beta1.CreateSpotMarketOrderAuthz"
  }

  public object KotlinxSerializer : KSerializer<CreateSpotMarketOrderAuthz> {
    private val delegator: KSerializer<CreateSpotMarketOrderAuthz> =
        CreateSpotMarketOrderAuthz.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: CreateSpotMarketOrderAuthz): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(CreateSpotMarketOrderAuthzConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): CreateSpotMarketOrderAuthz {
      if (decoder is ProtobufMapperDecoder) {
        return CreateSpotMarketOrderAuthzConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = BatchCreateSpotLimitOrdersAuthz.KotlinxSerializer::class)
@SerialName(value = BatchCreateSpotLimitOrdersAuthz.TYPE_URL)
public data class BatchCreateSpotLimitOrdersAuthz(
  @ProtobufIndex(index = 1)
  public val subaccountId: String,
  @ProtobufIndex(index = 2)
  public val marketIds: List<String>,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String =
        "/injective.exchange.v1beta1.BatchCreateSpotLimitOrdersAuthz"
  }

  public object KotlinxSerializer : KSerializer<BatchCreateSpotLimitOrdersAuthz> {
    private val delegator: KSerializer<BatchCreateSpotLimitOrdersAuthz> =
        BatchCreateSpotLimitOrdersAuthz.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: BatchCreateSpotLimitOrdersAuthz):
        Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(BatchCreateSpotLimitOrdersAuthzConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): BatchCreateSpotLimitOrdersAuthz {
      if (decoder is ProtobufMapperDecoder) {
        return BatchCreateSpotLimitOrdersAuthzConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = CancelSpotOrderAuthz.KotlinxSerializer::class)
@SerialName(value = CancelSpotOrderAuthz.TYPE_URL)
public data class CancelSpotOrderAuthz(
  @ProtobufIndex(index = 1)
  public val subaccountId: String,
  @ProtobufIndex(index = 2)
  public val marketIds: List<String>,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/injective.exchange.v1beta1.CancelSpotOrderAuthz"
  }

  public object KotlinxSerializer : KSerializer<CancelSpotOrderAuthz> {
    private val delegator: KSerializer<CancelSpotOrderAuthz> = CancelSpotOrderAuthz.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: CancelSpotOrderAuthz): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(CancelSpotOrderAuthzConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): CancelSpotOrderAuthz {
      if (decoder is ProtobufMapperDecoder) {
        return CancelSpotOrderAuthzConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = BatchCancelSpotOrdersAuthz.KotlinxSerializer::class)
@SerialName(value = BatchCancelSpotOrdersAuthz.TYPE_URL)
public data class BatchCancelSpotOrdersAuthz(
  @ProtobufIndex(index = 1)
  public val subaccountId: String,
  @ProtobufIndex(index = 2)
  public val marketIds: List<String>,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/injective.exchange.v1beta1.BatchCancelSpotOrdersAuthz"
  }

  public object KotlinxSerializer : KSerializer<BatchCancelSpotOrdersAuthz> {
    private val delegator: KSerializer<BatchCancelSpotOrdersAuthz> =
        BatchCancelSpotOrdersAuthz.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: BatchCancelSpotOrdersAuthz): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(BatchCancelSpotOrdersAuthzConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): BatchCancelSpotOrdersAuthz {
      if (decoder is ProtobufMapperDecoder) {
        return BatchCancelSpotOrdersAuthzConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = CreateDerivativeLimitOrderAuthz.KotlinxSerializer::class)
@SerialName(value = CreateDerivativeLimitOrderAuthz.TYPE_URL)
public data class CreateDerivativeLimitOrderAuthz(
  @ProtobufIndex(index = 1)
  public val subaccountId: String,
  @ProtobufIndex(index = 2)
  public val marketIds: List<String>,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String =
        "/injective.exchange.v1beta1.CreateDerivativeLimitOrderAuthz"
  }

  public object KotlinxSerializer : KSerializer<CreateDerivativeLimitOrderAuthz> {
    private val delegator: KSerializer<CreateDerivativeLimitOrderAuthz> =
        CreateDerivativeLimitOrderAuthz.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: CreateDerivativeLimitOrderAuthz):
        Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(CreateDerivativeLimitOrderAuthzConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): CreateDerivativeLimitOrderAuthz {
      if (decoder is ProtobufMapperDecoder) {
        return CreateDerivativeLimitOrderAuthzConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = CreateDerivativeMarketOrderAuthz.KotlinxSerializer::class)
@SerialName(value = CreateDerivativeMarketOrderAuthz.TYPE_URL)
public data class CreateDerivativeMarketOrderAuthz(
  @ProtobufIndex(index = 1)
  public val subaccountId: String,
  @ProtobufIndex(index = 2)
  public val marketIds: List<String>,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String =
        "/injective.exchange.v1beta1.CreateDerivativeMarketOrderAuthz"
  }

  public object KotlinxSerializer : KSerializer<CreateDerivativeMarketOrderAuthz> {
    private val delegator: KSerializer<CreateDerivativeMarketOrderAuthz> =
        CreateDerivativeMarketOrderAuthz.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: CreateDerivativeMarketOrderAuthz):
        Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(CreateDerivativeMarketOrderAuthzConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): CreateDerivativeMarketOrderAuthz {
      if (decoder is ProtobufMapperDecoder) {
        return CreateDerivativeMarketOrderAuthzConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = BatchCreateDerivativeLimitOrdersAuthz.KotlinxSerializer::class)
@SerialName(value = BatchCreateDerivativeLimitOrdersAuthz.TYPE_URL)
public data class BatchCreateDerivativeLimitOrdersAuthz(
  @ProtobufIndex(index = 1)
  public val subaccountId: String,
  @ProtobufIndex(index = 2)
  public val marketIds: List<String>,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String =
        "/injective.exchange.v1beta1.BatchCreateDerivativeLimitOrdersAuthz"
  }

  public object KotlinxSerializer : KSerializer<BatchCreateDerivativeLimitOrdersAuthz> {
    private val delegator: KSerializer<BatchCreateDerivativeLimitOrdersAuthz> =
        BatchCreateDerivativeLimitOrdersAuthz.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: BatchCreateDerivativeLimitOrdersAuthz):
        Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(BatchCreateDerivativeLimitOrdersAuthzConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): BatchCreateDerivativeLimitOrdersAuthz {
      if (decoder is ProtobufMapperDecoder) {
        return BatchCreateDerivativeLimitOrdersAuthzConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = CancelDerivativeOrderAuthz.KotlinxSerializer::class)
@SerialName(value = CancelDerivativeOrderAuthz.TYPE_URL)
public data class CancelDerivativeOrderAuthz(
  @ProtobufIndex(index = 1)
  public val subaccountId: String,
  @ProtobufIndex(index = 2)
  public val marketIds: List<String>,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/injective.exchange.v1beta1.CancelDerivativeOrderAuthz"
  }

  public object KotlinxSerializer : KSerializer<CancelDerivativeOrderAuthz> {
    private val delegator: KSerializer<CancelDerivativeOrderAuthz> =
        CancelDerivativeOrderAuthz.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: CancelDerivativeOrderAuthz): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(CancelDerivativeOrderAuthzConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): CancelDerivativeOrderAuthz {
      if (decoder is ProtobufMapperDecoder) {
        return CancelDerivativeOrderAuthzConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = BatchCancelDerivativeOrdersAuthz.KotlinxSerializer::class)
@SerialName(value = BatchCancelDerivativeOrdersAuthz.TYPE_URL)
public data class BatchCancelDerivativeOrdersAuthz(
  @ProtobufIndex(index = 1)
  public val subaccountId: String,
  @ProtobufIndex(index = 2)
  public val marketIds: List<String>,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String =
        "/injective.exchange.v1beta1.BatchCancelDerivativeOrdersAuthz"
  }

  public object KotlinxSerializer : KSerializer<BatchCancelDerivativeOrdersAuthz> {
    private val delegator: KSerializer<BatchCancelDerivativeOrdersAuthz> =
        BatchCancelDerivativeOrdersAuthz.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: BatchCancelDerivativeOrdersAuthz):
        Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(BatchCancelDerivativeOrdersAuthzConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): BatchCancelDerivativeOrdersAuthz {
      if (decoder is ProtobufMapperDecoder) {
        return BatchCancelDerivativeOrdersAuthzConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = BatchUpdateOrdersAuthz.KotlinxSerializer::class)
@SerialName(value = BatchUpdateOrdersAuthz.TYPE_URL)
public data class BatchUpdateOrdersAuthz(
  @ProtobufIndex(index = 1)
  public val subaccountId: String,
  @ProtobufIndex(index = 2)
  public val spotMarkets: List<String>,
  @ProtobufIndex(index = 3)
  public val derivativeMarkets: List<String>,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/injective.exchange.v1beta1.BatchUpdateOrdersAuthz"
  }

  public object KotlinxSerializer : KSerializer<BatchUpdateOrdersAuthz> {
    private val delegator: KSerializer<BatchUpdateOrdersAuthz> = BatchUpdateOrdersAuthz.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: BatchUpdateOrdersAuthz): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(BatchUpdateOrdersAuthzConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): BatchUpdateOrdersAuthz {
      if (decoder is ProtobufMapperDecoder) {
        return BatchUpdateOrdersAuthzConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}
