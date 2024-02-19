// Transform from injective/permissions/v1beta1/permissions.proto
@file:ProtobufSyntax(syntax = "PROTO3")
@file:GeneratorVersion(version = "0.3.1")

package injective.permissions.v1beta1

import cosmos.base.v1beta1.Coin
import kotlin.Boolean
import kotlin.Int
import kotlin.String
import kotlin.UInt
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

@Serializable
@SerialName(value = "/injective.permissions.v1beta1.Action")
public enum class Action(
  public val number: Int,
) {
  @ProtobufIndex(index = 0)
  UNSPECIFIED(0),
  @ProtobufIndex(index = 1)
  MINT(1),
  @ProtobufIndex(index = 2)
  RECEIVE(2),
  @ProtobufIndex(index = 4)
  BURN(4),
  ;

  public companion object {
    public fun forNumber(number: Int): Action = Action.values()
    	.first { it.number == number }
  }
}

@Serializable(with = Namespace.KotlinxSerializer::class)
@SerialName(value = Namespace.TYPE_URL)
public data class Namespace(
  @ProtobufIndex(index = 1)
  public val denom: String,
  @ProtobufIndex(index = 2)
  public val wasmHook: String,
  @ProtobufIndex(index = 3)
  public val mintsPaused: Boolean,
  @ProtobufIndex(index = 4)
  public val sendsPaused: Boolean,
  @ProtobufIndex(index = 5)
  public val burnsPaused: Boolean,
  @ProtobufIndex(index = 6)
  public val rolePermissions: List<Role>,
  @ProtobufIndex(index = 7)
  public val addressRoles: List<AddressRoles>,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/injective.permissions.v1beta1.Namespace"
  }

  public object KotlinxSerializer : KSerializer<Namespace> {
    private val delegator: KSerializer<Namespace> = Namespace.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: Namespace): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(NamespaceConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): Namespace {
      if (decoder is ProtobufMapperDecoder) {
        return NamespaceConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = AddressRoles.KotlinxSerializer::class)
@SerialName(value = AddressRoles.TYPE_URL)
public data class AddressRoles(
  @ProtobufIndex(index = 1)
  public val address: String,
  @ProtobufIndex(index = 2)
  public val roles: List<String>,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/injective.permissions.v1beta1.AddressRoles"
  }

  public object KotlinxSerializer : KSerializer<AddressRoles> {
    private val delegator: KSerializer<AddressRoles> = AddressRoles.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: AddressRoles): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(AddressRolesConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): AddressRoles {
      if (decoder is ProtobufMapperDecoder) {
        return AddressRolesConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = Role.KotlinxSerializer::class)
@SerialName(value = Role.TYPE_URL)
public data class Role(
  @ProtobufIndex(index = 1)
  public val role: String,
  @ProtobufIndex(index = 2)
  public val permissions: UInt,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/injective.permissions.v1beta1.Role"
  }

  public object KotlinxSerializer : KSerializer<Role> {
    private val delegator: KSerializer<Role> = Role.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: Role): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(RoleConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): Role {
      if (decoder is ProtobufMapperDecoder) {
        return RoleConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = RoleIDs.KotlinxSerializer::class)
@SerialName(value = RoleIDs.TYPE_URL)
public data class RoleIDs(
  @ProtobufIndex(index = 1)
  public val roleIds: List<UInt>,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/injective.permissions.v1beta1.RoleIDs"
  }

  public object KotlinxSerializer : KSerializer<RoleIDs> {
    private val delegator: KSerializer<RoleIDs> = RoleIDs.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: RoleIDs): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(RoleIDsConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): RoleIDs {
      if (decoder is ProtobufMapperDecoder) {
        return RoleIDsConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = Voucher.KotlinxSerializer::class)
@SerialName(value = Voucher.TYPE_URL)
public data class Voucher(
  @ProtobufIndex(index = 1)
  public val coins: List<Coin>,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/injective.permissions.v1beta1.Voucher"
  }

  public object KotlinxSerializer : KSerializer<Voucher> {
    private val delegator: KSerializer<Voucher> = Voucher.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: Voucher): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(VoucherConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): Voucher {
      if (decoder is ProtobufMapperDecoder) {
        return VoucherConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = AddressVoucher.KotlinxSerializer::class)
@SerialName(value = AddressVoucher.TYPE_URL)
public data class AddressVoucher(
  @ProtobufIndex(index = 1)
  public val address: String,
  @ProtobufIndex(index = 2)
  public val voucher: Voucher,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/injective.permissions.v1beta1.AddressVoucher"
  }

  public object KotlinxSerializer : KSerializer<AddressVoucher> {
    private val delegator: KSerializer<AddressVoucher> = AddressVoucher.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: AddressVoucher): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(AddressVoucherConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): AddressVoucher {
      if (decoder is ProtobufMapperDecoder) {
        return AddressVoucherConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}
