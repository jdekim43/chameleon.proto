// Transform from injective/peggy/v1/proposal.proto
@file:ProtobufSyntax(syntax = "PROTO3")
@file:GeneratorVersion(version = "0.3.1")

package injective.peggy.v1

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

@Serializable(with = BlacklistEthereumAddressesProposal.KotlinxSerializer::class)
@SerialName(value = BlacklistEthereumAddressesProposal.TYPE_URL)
public data class BlacklistEthereumAddressesProposal(
  @ProtobufIndex(index = 1)
  public val title: String,
  @ProtobufIndex(index = 2)
  public val description: String,
  @ProtobufIndex(index = 3)
  public val blacklistAddresses: List<String>,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/injective.peggy.v1.BlacklistEthereumAddressesProposal"
  }

  public object KotlinxSerializer : KSerializer<BlacklistEthereumAddressesProposal> {
    private val delegator: KSerializer<BlacklistEthereumAddressesProposal> =
        BlacklistEthereumAddressesProposal.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: BlacklistEthereumAddressesProposal):
        Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(BlacklistEthereumAddressesProposalConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): BlacklistEthereumAddressesProposal {
      if (decoder is ProtobufMapperDecoder) {
        return BlacklistEthereumAddressesProposalConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = RevokeEthereumBlacklistProposal.KotlinxSerializer::class)
@SerialName(value = RevokeEthereumBlacklistProposal.TYPE_URL)
public data class RevokeEthereumBlacklistProposal(
  @ProtobufIndex(index = 1)
  public val title: String,
  @ProtobufIndex(index = 2)
  public val description: String,
  @ProtobufIndex(index = 3)
  public val blacklistAddresses: List<String>,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/injective.peggy.v1.RevokeEthereumBlacklistProposal"
  }

  public object KotlinxSerializer : KSerializer<RevokeEthereumBlacklistProposal> {
    private val delegator: KSerializer<RevokeEthereumBlacklistProposal> =
        RevokeEthereumBlacklistProposal.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: RevokeEthereumBlacklistProposal):
        Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(RevokeEthereumBlacklistProposalConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): RevokeEthereumBlacklistProposal {
      if (decoder is ProtobufMapperDecoder) {
        return RevokeEthereumBlacklistProposalConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}
