// Transform from injective/wasmx/v1/tx.proto
@file:ProtobufSyntax(syntax = "PROTO3")
@file:GeneratorVersion(version = "0.3.1")

package injective.wasmx.v1

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

@Serializable(with = MsgExecuteContractCompat.KotlinxSerializer::class)
@SerialName(value = MsgExecuteContractCompat.TYPE_URL)
public data class MsgExecuteContractCompat(
  @ProtobufIndex(index = 1)
  public val sender: String,
  @ProtobufIndex(index = 2)
  public val contract: String,
  @ProtobufIndex(index = 3)
  public val msg: String,
  @ProtobufIndex(index = 4)
  public val funds: String,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/injective.wasmx.v1.MsgExecuteContractCompat"
  }

  public object KotlinxSerializer : KSerializer<MsgExecuteContractCompat> {
    private val delegator: KSerializer<MsgExecuteContractCompat> =
        MsgExecuteContractCompat.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: MsgExecuteContractCompat): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(MsgExecuteContractCompatConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): MsgExecuteContractCompat {
      if (decoder is ProtobufMapperDecoder) {
        return MsgExecuteContractCompatConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = MsgExecuteContractCompatResponse.KotlinxSerializer::class)
@SerialName(value = MsgExecuteContractCompatResponse.TYPE_URL)
public data class MsgExecuteContractCompatResponse(
  @ProtobufIndex(index = 1)
  public val `data`: ByteArray,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/injective.wasmx.v1.MsgExecuteContractCompatResponse"
  }

  public object KotlinxSerializer : KSerializer<MsgExecuteContractCompatResponse> {
    private val delegator: KSerializer<MsgExecuteContractCompatResponse> =
        MsgExecuteContractCompatResponse.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: MsgExecuteContractCompatResponse):
        Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(MsgExecuteContractCompatResponseConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): MsgExecuteContractCompatResponse {
      if (decoder is ProtobufMapperDecoder) {
        return MsgExecuteContractCompatResponseConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = MsgUpdateContract.KotlinxSerializer::class)
@SerialName(value = MsgUpdateContract.TYPE_URL)
public data class MsgUpdateContract(
  @ProtobufIndex(index = 1)
  public val sender: String,
  @ProtobufIndex(index = 2)
  public val contractAddress: String,
  @ProtobufIndex(index = 3)
  public val gasLimit: ULong,
  @ProtobufIndex(index = 4)
  public val gasPrice: ULong,
  @ProtobufIndex(index = 5)
  public val adminAddress: String,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/injective.wasmx.v1.MsgUpdateContract"
  }

  public object KotlinxSerializer : KSerializer<MsgUpdateContract> {
    private val delegator: KSerializer<MsgUpdateContract> = MsgUpdateContract.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: MsgUpdateContract): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(MsgUpdateContractConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): MsgUpdateContract {
      if (decoder is ProtobufMapperDecoder) {
        return MsgUpdateContractConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = MsgUpdateContractResponse.KotlinxSerializer::class)
@SerialName(value = MsgUpdateContractResponse.TYPE_URL)
public class MsgUpdateContractResponse() : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/injective.wasmx.v1.MsgUpdateContractResponse"
  }

  public object KotlinxSerializer : KSerializer<MsgUpdateContractResponse> {
    private val delegator: KSerializer<MsgUpdateContractResponse> =
        MsgUpdateContractResponse.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: MsgUpdateContractResponse): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(MsgUpdateContractResponseConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): MsgUpdateContractResponse {
      if (decoder is ProtobufMapperDecoder) {
        return MsgUpdateContractResponseConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = MsgActivateContract.KotlinxSerializer::class)
@SerialName(value = MsgActivateContract.TYPE_URL)
public data class MsgActivateContract(
  @ProtobufIndex(index = 1)
  public val sender: String,
  @ProtobufIndex(index = 2)
  public val contractAddress: String,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/injective.wasmx.v1.MsgActivateContract"
  }

  public object KotlinxSerializer : KSerializer<MsgActivateContract> {
    private val delegator: KSerializer<MsgActivateContract> = MsgActivateContract.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: MsgActivateContract): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(MsgActivateContractConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): MsgActivateContract {
      if (decoder is ProtobufMapperDecoder) {
        return MsgActivateContractConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = MsgActivateContractResponse.KotlinxSerializer::class)
@SerialName(value = MsgActivateContractResponse.TYPE_URL)
public class MsgActivateContractResponse() : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/injective.wasmx.v1.MsgActivateContractResponse"
  }

  public object KotlinxSerializer : KSerializer<MsgActivateContractResponse> {
    private val delegator: KSerializer<MsgActivateContractResponse> =
        MsgActivateContractResponse.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: MsgActivateContractResponse): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(MsgActivateContractResponseConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): MsgActivateContractResponse {
      if (decoder is ProtobufMapperDecoder) {
        return MsgActivateContractResponseConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = MsgDeactivateContract.KotlinxSerializer::class)
@SerialName(value = MsgDeactivateContract.TYPE_URL)
public data class MsgDeactivateContract(
  @ProtobufIndex(index = 1)
  public val sender: String,
  @ProtobufIndex(index = 2)
  public val contractAddress: String,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/injective.wasmx.v1.MsgDeactivateContract"
  }

  public object KotlinxSerializer : KSerializer<MsgDeactivateContract> {
    private val delegator: KSerializer<MsgDeactivateContract> = MsgDeactivateContract.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: MsgDeactivateContract): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(MsgDeactivateContractConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): MsgDeactivateContract {
      if (decoder is ProtobufMapperDecoder) {
        return MsgDeactivateContractConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = MsgDeactivateContractResponse.KotlinxSerializer::class)
@SerialName(value = MsgDeactivateContractResponse.TYPE_URL)
public class MsgDeactivateContractResponse() : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/injective.wasmx.v1.MsgDeactivateContractResponse"
  }

  public object KotlinxSerializer : KSerializer<MsgDeactivateContractResponse> {
    private val delegator: KSerializer<MsgDeactivateContractResponse> =
        MsgDeactivateContractResponse.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: MsgDeactivateContractResponse): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(MsgDeactivateContractResponseConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): MsgDeactivateContractResponse {
      if (decoder is ProtobufMapperDecoder) {
        return MsgDeactivateContractResponseConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = MsgUpdateParams.KotlinxSerializer::class)
@SerialName(value = MsgUpdateParams.TYPE_URL)
public data class MsgUpdateParams(
  @ProtobufIndex(index = 1)
  public val authority: String,
  @ProtobufIndex(index = 2)
  public val params: Params,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/injective.wasmx.v1.MsgUpdateParams"
  }

  public object KotlinxSerializer : KSerializer<MsgUpdateParams> {
    private val delegator: KSerializer<MsgUpdateParams> = MsgUpdateParams.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: MsgUpdateParams): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(MsgUpdateParamsConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): MsgUpdateParams {
      if (decoder is ProtobufMapperDecoder) {
        return MsgUpdateParamsConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = MsgUpdateParamsResponse.KotlinxSerializer::class)
@SerialName(value = MsgUpdateParamsResponse.TYPE_URL)
public class MsgUpdateParamsResponse() : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/injective.wasmx.v1.MsgUpdateParamsResponse"
  }

  public object KotlinxSerializer : KSerializer<MsgUpdateParamsResponse> {
    private val delegator: KSerializer<MsgUpdateParamsResponse> =
        MsgUpdateParamsResponse.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: MsgUpdateParamsResponse): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(MsgUpdateParamsResponseConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): MsgUpdateParamsResponse {
      if (decoder is ProtobufMapperDecoder) {
        return MsgUpdateParamsResponseConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = MsgRegisterContract.KotlinxSerializer::class)
@SerialName(value = MsgRegisterContract.TYPE_URL)
public data class MsgRegisterContract(
  @ProtobufIndex(index = 1)
  public val sender: String,
  @ProtobufIndex(index = 2)
  public val contractRegistrationRequest: ContractRegistrationRequest,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/injective.wasmx.v1.MsgRegisterContract"
  }

  public object KotlinxSerializer : KSerializer<MsgRegisterContract> {
    private val delegator: KSerializer<MsgRegisterContract> = MsgRegisterContract.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: MsgRegisterContract): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(MsgRegisterContractConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): MsgRegisterContract {
      if (decoder is ProtobufMapperDecoder) {
        return MsgRegisterContractConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = MsgRegisterContractResponse.KotlinxSerializer::class)
@SerialName(value = MsgRegisterContractResponse.TYPE_URL)
public class MsgRegisterContractResponse() : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/injective.wasmx.v1.MsgRegisterContractResponse"
  }

  public object KotlinxSerializer : KSerializer<MsgRegisterContractResponse> {
    private val delegator: KSerializer<MsgRegisterContractResponse> =
        MsgRegisterContractResponse.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: MsgRegisterContractResponse): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(MsgRegisterContractResponseConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): MsgRegisterContractResponse {
      if (decoder is ProtobufMapperDecoder) {
        return MsgRegisterContractResponseConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}
