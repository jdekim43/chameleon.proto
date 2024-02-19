// Transform from injective/peggy/v1/attestation.proto
@file:ProtobufSyntax(syntax = "PROTO3")
@file:GeneratorVersion(version = "0.3.1")

package injective.peggy.v1

import google.protobuf.Any
import kotlin.Boolean
import kotlin.Int
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

@Serializable
@SerialName(value = "/injective.peggy.v1.ClaimType")
public enum class ClaimType(
  public val number: Int,
) {
  @ProtobufIndex(index = 0)
  CLAIM_TYPE_UNKNOWN(0),
  @ProtobufIndex(index = 1)
  CLAIM_TYPE_DEPOSIT(1),
  @ProtobufIndex(index = 2)
  CLAIM_TYPE_WITHDRAW(2),
  @ProtobufIndex(index = 3)
  CLAIM_TYPE_ERC20_DEPLOYED(3),
  @ProtobufIndex(index = 4)
  CLAIM_TYPE_VALSET_UPDATED(4),
  ;

  public companion object {
    public fun forNumber(number: Int): ClaimType = ClaimType.values()
    	.first { it.number == number }
  }
}

@Serializable(with = Attestation.KotlinxSerializer::class)
@SerialName(value = Attestation.TYPE_URL)
public data class Attestation(
  @ProtobufIndex(index = 1)
  public val observed: Boolean,
  @ProtobufIndex(index = 2)
  public val votes: List<String>,
  @ProtobufIndex(index = 3)
  public val height: ULong,
  @ProtobufIndex(index = 4)
  public val claim: Any,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/injective.peggy.v1.Attestation"
  }

  public object KotlinxSerializer : KSerializer<Attestation> {
    private val delegator: KSerializer<Attestation> = Attestation.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: Attestation): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(AttestationConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): Attestation {
      if (decoder is ProtobufMapperDecoder) {
        return AttestationConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = ERC20Token.KotlinxSerializer::class)
@SerialName(value = ERC20Token.TYPE_URL)
public data class ERC20Token(
  @ProtobufIndex(index = 1)
  public val contract: String,
  @ProtobufIndex(index = 2)
  public val amount: String,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/injective.peggy.v1.ERC20Token"
  }

  public object KotlinxSerializer : KSerializer<ERC20Token> {
    private val delegator: KSerializer<ERC20Token> = ERC20Token.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: ERC20Token): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(ERC20TokenConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): ERC20Token {
      if (decoder is ProtobufMapperDecoder) {
        return ERC20TokenConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}
