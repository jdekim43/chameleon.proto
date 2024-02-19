// Transform from injective/peggy/v1/types.proto
@file:ProtobufSyntax(syntax = "PROTO3")
@file:GeneratorVersion(version = "0.3.1")

package injective.peggy.v1

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

@Serializable(with = BridgeValidator.KotlinxSerializer::class)
@SerialName(value = BridgeValidator.TYPE_URL)
public data class BridgeValidator(
  @ProtobufIndex(index = 1)
  public val power: ULong,
  @ProtobufIndex(index = 2)
  public val ethereumAddress: String,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/injective.peggy.v1.BridgeValidator"
  }

  public object KotlinxSerializer : KSerializer<BridgeValidator> {
    private val delegator: KSerializer<BridgeValidator> = BridgeValidator.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: BridgeValidator): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(BridgeValidatorConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): BridgeValidator {
      if (decoder is ProtobufMapperDecoder) {
        return BridgeValidatorConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = Valset.KotlinxSerializer::class)
@SerialName(value = Valset.TYPE_URL)
public data class Valset(
  @ProtobufIndex(index = 1)
  public val nonce: ULong,
  @ProtobufIndex(index = 2)
  public val members: List<BridgeValidator>,
  @ProtobufIndex(index = 3)
  public val height: ULong,
  @ProtobufIndex(index = 4)
  public val rewardAmount: String,
  @ProtobufIndex(index = 5)
  public val rewardToken: String,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/injective.peggy.v1.Valset"
  }

  public object KotlinxSerializer : KSerializer<Valset> {
    private val delegator: KSerializer<Valset> = Valset.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: Valset): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(ValsetConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): Valset {
      if (decoder is ProtobufMapperDecoder) {
        return ValsetConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = LastObservedEthereumBlockHeight.KotlinxSerializer::class)
@SerialName(value = LastObservedEthereumBlockHeight.TYPE_URL)
public data class LastObservedEthereumBlockHeight(
  @ProtobufIndex(index = 1)
  public val cosmosBlockHeight: ULong,
  @ProtobufIndex(index = 2)
  public val ethereumBlockHeight: ULong,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/injective.peggy.v1.LastObservedEthereumBlockHeight"
  }

  public object KotlinxSerializer : KSerializer<LastObservedEthereumBlockHeight> {
    private val delegator: KSerializer<LastObservedEthereumBlockHeight> =
        LastObservedEthereumBlockHeight.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: LastObservedEthereumBlockHeight):
        Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(LastObservedEthereumBlockHeightConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): LastObservedEthereumBlockHeight {
      if (decoder is ProtobufMapperDecoder) {
        return LastObservedEthereumBlockHeightConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = LastClaimEvent.KotlinxSerializer::class)
@SerialName(value = LastClaimEvent.TYPE_URL)
public data class LastClaimEvent(
  @ProtobufIndex(index = 1)
  public val ethereumEventNonce: ULong,
  @ProtobufIndex(index = 2)
  public val ethereumEventHeight: ULong,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/injective.peggy.v1.LastClaimEvent"
  }

  public object KotlinxSerializer : KSerializer<LastClaimEvent> {
    private val delegator: KSerializer<LastClaimEvent> = LastClaimEvent.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: LastClaimEvent): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(LastClaimEventConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): LastClaimEvent {
      if (decoder is ProtobufMapperDecoder) {
        return LastClaimEventConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = ERC20ToDenom.KotlinxSerializer::class)
@SerialName(value = ERC20ToDenom.TYPE_URL)
public data class ERC20ToDenom(
  @ProtobufIndex(index = 1)
  public val erc20: String,
  @ProtobufIndex(index = 2)
  public val denom: String,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/injective.peggy.v1.ERC20ToDenom"
  }

  public object KotlinxSerializer : KSerializer<ERC20ToDenom> {
    private val delegator: KSerializer<ERC20ToDenom> = ERC20ToDenom.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: ERC20ToDenom): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(ERC20ToDenomConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): ERC20ToDenom {
      if (decoder is ProtobufMapperDecoder) {
        return ERC20ToDenomConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}
