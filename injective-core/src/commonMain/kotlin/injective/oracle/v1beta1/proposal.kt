// Transform from injective/oracle/v1beta1/proposal.proto
@file:ProtobufSyntax(syntax = "PROTO3")
@file:GeneratorVersion(version = "0.3.1")

package injective.oracle.v1beta1

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

@Serializable(with = GrantBandOraclePrivilegeProposal.KotlinxSerializer::class)
@SerialName(value = GrantBandOraclePrivilegeProposal.TYPE_URL)
public data class GrantBandOraclePrivilegeProposal(
  @ProtobufIndex(index = 1)
  public val title: String,
  @ProtobufIndex(index = 2)
  public val description: String,
  @ProtobufIndex(index = 3)
  public val relayers: List<String>,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/injective.oracle.v1beta1.GrantBandOraclePrivilegeProposal"
  }

  public object KotlinxSerializer : KSerializer<GrantBandOraclePrivilegeProposal> {
    private val delegator: KSerializer<GrantBandOraclePrivilegeProposal> =
        GrantBandOraclePrivilegeProposal.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: GrantBandOraclePrivilegeProposal):
        Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(GrantBandOraclePrivilegeProposalConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): GrantBandOraclePrivilegeProposal {
      if (decoder is ProtobufMapperDecoder) {
        return GrantBandOraclePrivilegeProposalConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = RevokeBandOraclePrivilegeProposal.KotlinxSerializer::class)
@SerialName(value = RevokeBandOraclePrivilegeProposal.TYPE_URL)
public data class RevokeBandOraclePrivilegeProposal(
  @ProtobufIndex(index = 1)
  public val title: String,
  @ProtobufIndex(index = 2)
  public val description: String,
  @ProtobufIndex(index = 3)
  public val relayers: List<String>,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String =
        "/injective.oracle.v1beta1.RevokeBandOraclePrivilegeProposal"
  }

  public object KotlinxSerializer : KSerializer<RevokeBandOraclePrivilegeProposal> {
    private val delegator: KSerializer<RevokeBandOraclePrivilegeProposal> =
        RevokeBandOraclePrivilegeProposal.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: RevokeBandOraclePrivilegeProposal):
        Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(RevokeBandOraclePrivilegeProposalConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): RevokeBandOraclePrivilegeProposal {
      if (decoder is ProtobufMapperDecoder) {
        return RevokeBandOraclePrivilegeProposalConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = GrantPriceFeederPrivilegeProposal.KotlinxSerializer::class)
@SerialName(value = GrantPriceFeederPrivilegeProposal.TYPE_URL)
public data class GrantPriceFeederPrivilegeProposal(
  @ProtobufIndex(index = 1)
  public val title: String,
  @ProtobufIndex(index = 2)
  public val description: String,
  @ProtobufIndex(index = 3)
  public val base: String,
  @ProtobufIndex(index = 4)
  public val quote: String,
  @ProtobufIndex(index = 5)
  public val relayers: List<String>,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String =
        "/injective.oracle.v1beta1.GrantPriceFeederPrivilegeProposal"
  }

  public object KotlinxSerializer : KSerializer<GrantPriceFeederPrivilegeProposal> {
    private val delegator: KSerializer<GrantPriceFeederPrivilegeProposal> =
        GrantPriceFeederPrivilegeProposal.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: GrantPriceFeederPrivilegeProposal):
        Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(GrantPriceFeederPrivilegeProposalConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): GrantPriceFeederPrivilegeProposal {
      if (decoder is ProtobufMapperDecoder) {
        return GrantPriceFeederPrivilegeProposalConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = GrantProviderPrivilegeProposal.KotlinxSerializer::class)
@SerialName(value = GrantProviderPrivilegeProposal.TYPE_URL)
public data class GrantProviderPrivilegeProposal(
  @ProtobufIndex(index = 1)
  public val title: String,
  @ProtobufIndex(index = 2)
  public val description: String,
  @ProtobufIndex(index = 3)
  public val provider: String,
  @ProtobufIndex(index = 4)
  public val relayers: List<String>,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/injective.oracle.v1beta1.GrantProviderPrivilegeProposal"
  }

  public object KotlinxSerializer : KSerializer<GrantProviderPrivilegeProposal> {
    private val delegator: KSerializer<GrantProviderPrivilegeProposal> =
        GrantProviderPrivilegeProposal.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: GrantProviderPrivilegeProposal): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(GrantProviderPrivilegeProposalConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): GrantProviderPrivilegeProposal {
      if (decoder is ProtobufMapperDecoder) {
        return GrantProviderPrivilegeProposalConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = RevokeProviderPrivilegeProposal.KotlinxSerializer::class)
@SerialName(value = RevokeProviderPrivilegeProposal.TYPE_URL)
public data class RevokeProviderPrivilegeProposal(
  @ProtobufIndex(index = 1)
  public val title: String,
  @ProtobufIndex(index = 2)
  public val description: String,
  @ProtobufIndex(index = 3)
  public val provider: String,
  @ProtobufIndex(index = 5)
  public val relayers: List<String>,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/injective.oracle.v1beta1.RevokeProviderPrivilegeProposal"
  }

  public object KotlinxSerializer : KSerializer<RevokeProviderPrivilegeProposal> {
    private val delegator: KSerializer<RevokeProviderPrivilegeProposal> =
        RevokeProviderPrivilegeProposal.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: RevokeProviderPrivilegeProposal):
        Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(RevokeProviderPrivilegeProposalConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): RevokeProviderPrivilegeProposal {
      if (decoder is ProtobufMapperDecoder) {
        return RevokeProviderPrivilegeProposalConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = RevokePriceFeederPrivilegeProposal.KotlinxSerializer::class)
@SerialName(value = RevokePriceFeederPrivilegeProposal.TYPE_URL)
public data class RevokePriceFeederPrivilegeProposal(
  @ProtobufIndex(index = 1)
  public val title: String,
  @ProtobufIndex(index = 2)
  public val description: String,
  @ProtobufIndex(index = 3)
  public val base: String,
  @ProtobufIndex(index = 4)
  public val quote: String,
  @ProtobufIndex(index = 5)
  public val relayers: List<String>,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String =
        "/injective.oracle.v1beta1.RevokePriceFeederPrivilegeProposal"
  }

  public object KotlinxSerializer : KSerializer<RevokePriceFeederPrivilegeProposal> {
    private val delegator: KSerializer<RevokePriceFeederPrivilegeProposal> =
        RevokePriceFeederPrivilegeProposal.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: RevokePriceFeederPrivilegeProposal):
        Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(RevokePriceFeederPrivilegeProposalConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): RevokePriceFeederPrivilegeProposal {
      if (decoder is ProtobufMapperDecoder) {
        return RevokePriceFeederPrivilegeProposalConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = AuthorizeBandOracleRequestProposal.KotlinxSerializer::class)
@SerialName(value = AuthorizeBandOracleRequestProposal.TYPE_URL)
public data class AuthorizeBandOracleRequestProposal(
  @ProtobufIndex(index = 1)
  public val title: String,
  @ProtobufIndex(index = 2)
  public val description: String,
  @ProtobufIndex(index = 3)
  public val request: BandOracleRequest,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String =
        "/injective.oracle.v1beta1.AuthorizeBandOracleRequestProposal"
  }

  public object KotlinxSerializer : KSerializer<AuthorizeBandOracleRequestProposal> {
    private val delegator: KSerializer<AuthorizeBandOracleRequestProposal> =
        AuthorizeBandOracleRequestProposal.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: AuthorizeBandOracleRequestProposal):
        Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(AuthorizeBandOracleRequestProposalConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): AuthorizeBandOracleRequestProposal {
      if (decoder is ProtobufMapperDecoder) {
        return AuthorizeBandOracleRequestProposalConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = UpdateBandOracleRequestProposal.KotlinxSerializer::class)
@SerialName(value = UpdateBandOracleRequestProposal.TYPE_URL)
public data class UpdateBandOracleRequestProposal(
  @ProtobufIndex(index = 1)
  public val title: String,
  @ProtobufIndex(index = 2)
  public val description: String,
  @ProtobufIndex(index = 3)
  public val deleteRequestIds: List<ULong>,
  @ProtobufIndex(index = 4)
  public val updateOracleRequest: BandOracleRequest,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/injective.oracle.v1beta1.UpdateBandOracleRequestProposal"
  }

  public object KotlinxSerializer : KSerializer<UpdateBandOracleRequestProposal> {
    private val delegator: KSerializer<UpdateBandOracleRequestProposal> =
        UpdateBandOracleRequestProposal.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: UpdateBandOracleRequestProposal):
        Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(UpdateBandOracleRequestProposalConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): UpdateBandOracleRequestProposal {
      if (decoder is ProtobufMapperDecoder) {
        return UpdateBandOracleRequestProposalConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = EnableBandIBCProposal.KotlinxSerializer::class)
@SerialName(value = EnableBandIBCProposal.TYPE_URL)
public data class EnableBandIBCProposal(
  @ProtobufIndex(index = 1)
  public val title: String,
  @ProtobufIndex(index = 2)
  public val description: String,
  @ProtobufIndex(index = 3)
  public val bandIbcParams: BandIBCParams,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/injective.oracle.v1beta1.EnableBandIBCProposal"
  }

  public object KotlinxSerializer : KSerializer<EnableBandIBCProposal> {
    private val delegator: KSerializer<EnableBandIBCProposal> = EnableBandIBCProposal.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: EnableBandIBCProposal): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(EnableBandIBCProposalConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): EnableBandIBCProposal {
      if (decoder is ProtobufMapperDecoder) {
        return EnableBandIBCProposalConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}
