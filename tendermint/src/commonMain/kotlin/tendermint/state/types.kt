// Transform from tendermint/state/types.proto
@file:ProtobufSyntax(syntax = "PROTO3")
@file:GeneratorVersion(version = "0.3.1")

package tendermint.state

import google.protobuf.Timestamp
import kotlin.ByteArray
import kotlin.Long
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
import tendermint.abci.ResponseBeginBlock
import tendermint.abci.ResponseDeliverTx
import tendermint.abci.ResponseEndBlock
import tendermint.types.BlockID
import tendermint.types.ConsensusParams
import tendermint.types.ValidatorSet
import tendermint.version.Consensus

@Serializable(with = ABCIResponses.KotlinxSerializer::class)
@SerialName(value = ABCIResponses.TYPE_URL)
public data class ABCIResponses(
  @ProtobufIndex(index = 1)
  public val deliverTxs: List<ResponseDeliverTx>,
  @ProtobufIndex(index = 2)
  public val endBlock: ResponseEndBlock,
  @ProtobufIndex(index = 3)
  public val beginBlock: ResponseBeginBlock,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/tendermint.state.ABCIResponses"
  }

  public object KotlinxSerializer : KSerializer<ABCIResponses> {
    private val delegator: KSerializer<ABCIResponses> = ABCIResponses.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: ABCIResponses): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(ABCIResponsesConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): ABCIResponses {
      if (decoder is ProtobufMapperDecoder) {
        return ABCIResponsesConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = ValidatorsInfo.KotlinxSerializer::class)
@SerialName(value = ValidatorsInfo.TYPE_URL)
public data class ValidatorsInfo(
  @ProtobufIndex(index = 1)
  public val validatorSet: ValidatorSet,
  @ProtobufIndex(index = 2)
  public val lastHeightChanged: Long,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/tendermint.state.ValidatorsInfo"
  }

  public object KotlinxSerializer : KSerializer<ValidatorsInfo> {
    private val delegator: KSerializer<ValidatorsInfo> = ValidatorsInfo.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: ValidatorsInfo): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(ValidatorsInfoConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): ValidatorsInfo {
      if (decoder is ProtobufMapperDecoder) {
        return ValidatorsInfoConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = ConsensusParamsInfo.KotlinxSerializer::class)
@SerialName(value = ConsensusParamsInfo.TYPE_URL)
public data class ConsensusParamsInfo(
  @ProtobufIndex(index = 1)
  public val consensusParams: ConsensusParams,
  @ProtobufIndex(index = 2)
  public val lastHeightChanged: Long,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/tendermint.state.ConsensusParamsInfo"
  }

  public object KotlinxSerializer : KSerializer<ConsensusParamsInfo> {
    private val delegator: KSerializer<ConsensusParamsInfo> = ConsensusParamsInfo.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: ConsensusParamsInfo): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(ConsensusParamsInfoConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): ConsensusParamsInfo {
      if (decoder is ProtobufMapperDecoder) {
        return ConsensusParamsInfoConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = ABCIResponsesInfo.KotlinxSerializer::class)
@SerialName(value = ABCIResponsesInfo.TYPE_URL)
public data class ABCIResponsesInfo(
  @ProtobufIndex(index = 1)
  public val abciResponses: ABCIResponses,
  @ProtobufIndex(index = 2)
  public val height: Long,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/tendermint.state.ABCIResponsesInfo"
  }

  public object KotlinxSerializer : KSerializer<ABCIResponsesInfo> {
    private val delegator: KSerializer<ABCIResponsesInfo> = ABCIResponsesInfo.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: ABCIResponsesInfo): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(ABCIResponsesInfoConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): ABCIResponsesInfo {
      if (decoder is ProtobufMapperDecoder) {
        return ABCIResponsesInfoConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = Version.KotlinxSerializer::class)
@SerialName(value = Version.TYPE_URL)
public data class Version(
  @ProtobufIndex(index = 1)
  public val consensus: Consensus,
  @ProtobufIndex(index = 2)
  public val software: String,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/tendermint.state.Version"
  }

  public object KotlinxSerializer : KSerializer<Version> {
    private val delegator: KSerializer<Version> = Version.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: Version): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(VersionConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): Version {
      if (decoder is ProtobufMapperDecoder) {
        return VersionConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = State.KotlinxSerializer::class)
@SerialName(value = State.TYPE_URL)
public data class State(
  @ProtobufIndex(index = 1)
  public val version: Version,
  @ProtobufIndex(index = 2)
  public val chainId: String,
  @ProtobufIndex(index = 14)
  public val initialHeight: Long,
  @ProtobufIndex(index = 3)
  public val lastBlockHeight: Long,
  @ProtobufIndex(index = 4)
  public val lastBlockId: BlockID,
  @ProtobufIndex(index = 5)
  public val lastBlockTime: Timestamp,
  @ProtobufIndex(index = 6)
  public val nextValidators: ValidatorSet,
  @ProtobufIndex(index = 7)
  public val validators: ValidatorSet,
  @ProtobufIndex(index = 8)
  public val lastValidators: ValidatorSet,
  @ProtobufIndex(index = 9)
  public val lastHeightValidatorsChanged: Long,
  @ProtobufIndex(index = 10)
  public val consensusParams: ConsensusParams,
  @ProtobufIndex(index = 11)
  public val lastHeightConsensusParamsChanged: Long,
  @ProtobufIndex(index = 12)
  public val lastResultsHash: ByteArray,
  @ProtobufIndex(index = 13)
  public val appHash: ByteArray,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/tendermint.state.State"
  }

  public object KotlinxSerializer : KSerializer<State> {
    private val delegator: KSerializer<State> = State.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: State): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(StateConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): State {
      if (decoder is ProtobufMapperDecoder) {
        return StateConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}
