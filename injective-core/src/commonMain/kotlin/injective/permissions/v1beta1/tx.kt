// Transform from injective/permissions/v1beta1/tx.proto
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

@Serializable(with = MsgUpdateParams.KotlinxSerializer::class)
@SerialName(value = MsgUpdateParams.TYPE_URL)
public data class MsgUpdateParams(
  @ProtobufIndex(index = 1)
  public val authority: String,
  @ProtobufIndex(index = 2)
  public val params: Params,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/injective.permissions.v1beta1.MsgUpdateParams"
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
    public const val TYPE_URL: String = "/injective.permissions.v1beta1.MsgUpdateParamsResponse"
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

@Serializable(with = MsgCreateNamespace.KotlinxSerializer::class)
@SerialName(value = MsgCreateNamespace.TYPE_URL)
public data class MsgCreateNamespace(
  @ProtobufIndex(index = 1)
  public val sender: String,
  @ProtobufIndex(index = 2)
  public val namespace: Namespace,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/injective.permissions.v1beta1.MsgCreateNamespace"
  }

  public object KotlinxSerializer : KSerializer<MsgCreateNamespace> {
    private val delegator: KSerializer<MsgCreateNamespace> = MsgCreateNamespace.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: MsgCreateNamespace): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(MsgCreateNamespaceConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): MsgCreateNamespace {
      if (decoder is ProtobufMapperDecoder) {
        return MsgCreateNamespaceConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = MsgCreateNamespaceResponse.KotlinxSerializer::class)
@SerialName(value = MsgCreateNamespaceResponse.TYPE_URL)
public class MsgCreateNamespaceResponse() : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/injective.permissions.v1beta1.MsgCreateNamespaceResponse"
  }

  public object KotlinxSerializer : KSerializer<MsgCreateNamespaceResponse> {
    private val delegator: KSerializer<MsgCreateNamespaceResponse> =
        MsgCreateNamespaceResponse.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: MsgCreateNamespaceResponse): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(MsgCreateNamespaceResponseConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): MsgCreateNamespaceResponse {
      if (decoder is ProtobufMapperDecoder) {
        return MsgCreateNamespaceResponseConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = MsgDeleteNamespace.KotlinxSerializer::class)
@SerialName(value = MsgDeleteNamespace.TYPE_URL)
public data class MsgDeleteNamespace(
  @ProtobufIndex(index = 1)
  public val sender: String,
  @ProtobufIndex(index = 2)
  public val namespaceDenom: String,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/injective.permissions.v1beta1.MsgDeleteNamespace"
  }

  public object KotlinxSerializer : KSerializer<MsgDeleteNamespace> {
    private val delegator: KSerializer<MsgDeleteNamespace> = MsgDeleteNamespace.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: MsgDeleteNamespace): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(MsgDeleteNamespaceConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): MsgDeleteNamespace {
      if (decoder is ProtobufMapperDecoder) {
        return MsgDeleteNamespaceConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = MsgDeleteNamespaceResponse.KotlinxSerializer::class)
@SerialName(value = MsgDeleteNamespaceResponse.TYPE_URL)
public class MsgDeleteNamespaceResponse() : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/injective.permissions.v1beta1.MsgDeleteNamespaceResponse"
  }

  public object KotlinxSerializer : KSerializer<MsgDeleteNamespaceResponse> {
    private val delegator: KSerializer<MsgDeleteNamespaceResponse> =
        MsgDeleteNamespaceResponse.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: MsgDeleteNamespaceResponse): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(MsgDeleteNamespaceResponseConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): MsgDeleteNamespaceResponse {
      if (decoder is ProtobufMapperDecoder) {
        return MsgDeleteNamespaceResponseConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = MsgUpdateNamespace.KotlinxSerializer::class)
@SerialName(value = MsgUpdateNamespace.TYPE_URL)
public data class MsgUpdateNamespace(
  @ProtobufIndex(index = 1)
  public val sender: String,
  @ProtobufIndex(index = 2)
  public val namespaceDenom: String,
  @ProtobufIndex(index = 3)
  public val wasmHook: MsgSetWasmHook,
  @ProtobufIndex(index = 4)
  public val mintsPaused: MsgSetMintsPaused,
  @ProtobufIndex(index = 5)
  public val sendsPaused: MsgSetSendsPaused,
  @ProtobufIndex(index = 6)
  public val burnsPaused: MsgSetBurnsPaused,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/injective.permissions.v1beta1.MsgUpdateNamespace"
  }

  @Serializable(with = MsgSetWasmHook.KotlinxSerializer::class)
  @SerialName(value = MsgSetWasmHook.TYPE_URL)
  public data class MsgSetWasmHook(
    @ProtobufIndex(index = 1)
    public val newValue: String,
  ) : ProtobufMessage {
    public companion object {
      public const val TYPE_URL: String =
          "/injective.permissions.v1beta1.MsgUpdateNamespace.MsgSetWasmHook"
    }

    public object KotlinxSerializer : KSerializer<MsgSetWasmHook> {
      private val delegator: KSerializer<MsgSetWasmHook> = MsgSetWasmHook.serializer()

      public override val descriptor: SerialDescriptor = delegator.descriptor

      public override fun serialize(encoder: Encoder, `value`: MsgSetWasmHook): Unit {
        if (encoder is ProtobufConverterEncoder) {
          encoder.encodeValue(MsgUpdateNamespaceConverter.MsgSetWasmHookConverter.serialize(value))
          return
        }
        delegator.serialize(encoder, value)
      }

      public override fun deserialize(decoder: Decoder): MsgSetWasmHook {
        if (decoder is ProtobufMapperDecoder) {
          return MsgUpdateNamespaceConverter.MsgSetWasmHookConverter.deserialize(decoder.decodeByteArray())
        }
        return delegator.deserialize(decoder)
      }
    }
  }

  @Serializable(with = MsgSetMintsPaused.KotlinxSerializer::class)
  @SerialName(value = MsgSetMintsPaused.TYPE_URL)
  public data class MsgSetMintsPaused(
    @ProtobufIndex(index = 1)
    public val newValue: Boolean,
  ) : ProtobufMessage {
    public companion object {
      public const val TYPE_URL: String =
          "/injective.permissions.v1beta1.MsgUpdateNamespace.MsgSetMintsPaused"
    }

    public object KotlinxSerializer : KSerializer<MsgSetMintsPaused> {
      private val delegator: KSerializer<MsgSetMintsPaused> = MsgSetMintsPaused.serializer()

      public override val descriptor: SerialDescriptor = delegator.descriptor

      public override fun serialize(encoder: Encoder, `value`: MsgSetMintsPaused): Unit {
        if (encoder is ProtobufConverterEncoder) {
          encoder.encodeValue(MsgUpdateNamespaceConverter.MsgSetMintsPausedConverter.serialize(value))
          return
        }
        delegator.serialize(encoder, value)
      }

      public override fun deserialize(decoder: Decoder): MsgSetMintsPaused {
        if (decoder is ProtobufMapperDecoder) {
          return MsgUpdateNamespaceConverter.MsgSetMintsPausedConverter.deserialize(decoder.decodeByteArray())
        }
        return delegator.deserialize(decoder)
      }
    }
  }

  @Serializable(with = MsgSetSendsPaused.KotlinxSerializer::class)
  @SerialName(value = MsgSetSendsPaused.TYPE_URL)
  public data class MsgSetSendsPaused(
    @ProtobufIndex(index = 1)
    public val newValue: Boolean,
  ) : ProtobufMessage {
    public companion object {
      public const val TYPE_URL: String =
          "/injective.permissions.v1beta1.MsgUpdateNamespace.MsgSetSendsPaused"
    }

    public object KotlinxSerializer : KSerializer<MsgSetSendsPaused> {
      private val delegator: KSerializer<MsgSetSendsPaused> = MsgSetSendsPaused.serializer()

      public override val descriptor: SerialDescriptor = delegator.descriptor

      public override fun serialize(encoder: Encoder, `value`: MsgSetSendsPaused): Unit {
        if (encoder is ProtobufConverterEncoder) {
          encoder.encodeValue(MsgUpdateNamespaceConverter.MsgSetSendsPausedConverter.serialize(value))
          return
        }
        delegator.serialize(encoder, value)
      }

      public override fun deserialize(decoder: Decoder): MsgSetSendsPaused {
        if (decoder is ProtobufMapperDecoder) {
          return MsgUpdateNamespaceConverter.MsgSetSendsPausedConverter.deserialize(decoder.decodeByteArray())
        }
        return delegator.deserialize(decoder)
      }
    }
  }

  @Serializable(with = MsgSetBurnsPaused.KotlinxSerializer::class)
  @SerialName(value = MsgSetBurnsPaused.TYPE_URL)
  public data class MsgSetBurnsPaused(
    @ProtobufIndex(index = 1)
    public val newValue: Boolean,
  ) : ProtobufMessage {
    public companion object {
      public const val TYPE_URL: String =
          "/injective.permissions.v1beta1.MsgUpdateNamespace.MsgSetBurnsPaused"
    }

    public object KotlinxSerializer : KSerializer<MsgSetBurnsPaused> {
      private val delegator: KSerializer<MsgSetBurnsPaused> = MsgSetBurnsPaused.serializer()

      public override val descriptor: SerialDescriptor = delegator.descriptor

      public override fun serialize(encoder: Encoder, `value`: MsgSetBurnsPaused): Unit {
        if (encoder is ProtobufConverterEncoder) {
          encoder.encodeValue(MsgUpdateNamespaceConverter.MsgSetBurnsPausedConverter.serialize(value))
          return
        }
        delegator.serialize(encoder, value)
      }

      public override fun deserialize(decoder: Decoder): MsgSetBurnsPaused {
        if (decoder is ProtobufMapperDecoder) {
          return MsgUpdateNamespaceConverter.MsgSetBurnsPausedConverter.deserialize(decoder.decodeByteArray())
        }
        return delegator.deserialize(decoder)
      }
    }
  }

  public object KotlinxSerializer : KSerializer<MsgUpdateNamespace> {
    private val delegator: KSerializer<MsgUpdateNamespace> = MsgUpdateNamespace.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: MsgUpdateNamespace): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(MsgUpdateNamespaceConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): MsgUpdateNamespace {
      if (decoder is ProtobufMapperDecoder) {
        return MsgUpdateNamespaceConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = MsgUpdateNamespaceResponse.KotlinxSerializer::class)
@SerialName(value = MsgUpdateNamespaceResponse.TYPE_URL)
public class MsgUpdateNamespaceResponse() : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/injective.permissions.v1beta1.MsgUpdateNamespaceResponse"
  }

  public object KotlinxSerializer : KSerializer<MsgUpdateNamespaceResponse> {
    private val delegator: KSerializer<MsgUpdateNamespaceResponse> =
        MsgUpdateNamespaceResponse.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: MsgUpdateNamespaceResponse): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(MsgUpdateNamespaceResponseConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): MsgUpdateNamespaceResponse {
      if (decoder is ProtobufMapperDecoder) {
        return MsgUpdateNamespaceResponseConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = MsgUpdateNamespaceRoles.KotlinxSerializer::class)
@SerialName(value = MsgUpdateNamespaceRoles.TYPE_URL)
public data class MsgUpdateNamespaceRoles(
  @ProtobufIndex(index = 1)
  public val sender: String,
  @ProtobufIndex(index = 2)
  public val namespaceDenom: String,
  @ProtobufIndex(index = 3)
  public val rolePermissions: List<Role>,
  @ProtobufIndex(index = 4)
  public val addressRoles: List<AddressRoles>,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/injective.permissions.v1beta1.MsgUpdateNamespaceRoles"
  }

  public object KotlinxSerializer : KSerializer<MsgUpdateNamespaceRoles> {
    private val delegator: KSerializer<MsgUpdateNamespaceRoles> =
        MsgUpdateNamespaceRoles.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: MsgUpdateNamespaceRoles): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(MsgUpdateNamespaceRolesConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): MsgUpdateNamespaceRoles {
      if (decoder is ProtobufMapperDecoder) {
        return MsgUpdateNamespaceRolesConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = MsgUpdateNamespaceRolesResponse.KotlinxSerializer::class)
@SerialName(value = MsgUpdateNamespaceRolesResponse.TYPE_URL)
public class MsgUpdateNamespaceRolesResponse() : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String =
        "/injective.permissions.v1beta1.MsgUpdateNamespaceRolesResponse"
  }

  public object KotlinxSerializer : KSerializer<MsgUpdateNamespaceRolesResponse> {
    private val delegator: KSerializer<MsgUpdateNamespaceRolesResponse> =
        MsgUpdateNamespaceRolesResponse.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: MsgUpdateNamespaceRolesResponse):
        Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(MsgUpdateNamespaceRolesResponseConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): MsgUpdateNamespaceRolesResponse {
      if (decoder is ProtobufMapperDecoder) {
        return MsgUpdateNamespaceRolesResponseConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = MsgRevokeNamespaceRoles.KotlinxSerializer::class)
@SerialName(value = MsgRevokeNamespaceRoles.TYPE_URL)
public data class MsgRevokeNamespaceRoles(
  @ProtobufIndex(index = 1)
  public val sender: String,
  @ProtobufIndex(index = 2)
  public val namespaceDenom: String,
  @ProtobufIndex(index = 3)
  public val addressRolesToRevoke: List<AddressRoles>,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/injective.permissions.v1beta1.MsgRevokeNamespaceRoles"
  }

  public object KotlinxSerializer : KSerializer<MsgRevokeNamespaceRoles> {
    private val delegator: KSerializer<MsgRevokeNamespaceRoles> =
        MsgRevokeNamespaceRoles.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: MsgRevokeNamespaceRoles): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(MsgRevokeNamespaceRolesConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): MsgRevokeNamespaceRoles {
      if (decoder is ProtobufMapperDecoder) {
        return MsgRevokeNamespaceRolesConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = MsgRevokeNamespaceRolesResponse.KotlinxSerializer::class)
@SerialName(value = MsgRevokeNamespaceRolesResponse.TYPE_URL)
public class MsgRevokeNamespaceRolesResponse() : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String =
        "/injective.permissions.v1beta1.MsgRevokeNamespaceRolesResponse"
  }

  public object KotlinxSerializer : KSerializer<MsgRevokeNamespaceRolesResponse> {
    private val delegator: KSerializer<MsgRevokeNamespaceRolesResponse> =
        MsgRevokeNamespaceRolesResponse.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: MsgRevokeNamespaceRolesResponse):
        Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(MsgRevokeNamespaceRolesResponseConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): MsgRevokeNamespaceRolesResponse {
      if (decoder is ProtobufMapperDecoder) {
        return MsgRevokeNamespaceRolesResponseConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = MsgClaimVoucher.KotlinxSerializer::class)
@SerialName(value = MsgClaimVoucher.TYPE_URL)
public data class MsgClaimVoucher(
  @ProtobufIndex(index = 1)
  public val sender: String,
  @ProtobufIndex(index = 2)
  public val originator: String,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/injective.permissions.v1beta1.MsgClaimVoucher"
  }

  public object KotlinxSerializer : KSerializer<MsgClaimVoucher> {
    private val delegator: KSerializer<MsgClaimVoucher> = MsgClaimVoucher.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: MsgClaimVoucher): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(MsgClaimVoucherConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): MsgClaimVoucher {
      if (decoder is ProtobufMapperDecoder) {
        return MsgClaimVoucherConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = MsgClaimVoucherResponse.KotlinxSerializer::class)
@SerialName(value = MsgClaimVoucherResponse.TYPE_URL)
public class MsgClaimVoucherResponse() : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/injective.permissions.v1beta1.MsgClaimVoucherResponse"
  }

  public object KotlinxSerializer : KSerializer<MsgClaimVoucherResponse> {
    private val delegator: KSerializer<MsgClaimVoucherResponse> =
        MsgClaimVoucherResponse.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: MsgClaimVoucherResponse): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(MsgClaimVoucherResponseConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): MsgClaimVoucherResponse {
      if (decoder is ProtobufMapperDecoder) {
        return MsgClaimVoucherResponseConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}
