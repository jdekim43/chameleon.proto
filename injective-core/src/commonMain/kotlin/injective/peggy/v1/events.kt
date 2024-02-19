// Transform from injective/peggy/v1/events.proto
@file:ProtobufSyntax(syntax = "PROTO3")
@file:GeneratorVersion(version = "0.3.1")

package injective.peggy.v1

import kotlin.ByteArray
import kotlin.Long
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

@Serializable(with = EventAttestationObserved.KotlinxSerializer::class)
@SerialName(value = EventAttestationObserved.TYPE_URL)
public data class EventAttestationObserved(
  @ProtobufIndex(index = 1)
  public val attestationType: ClaimType,
  @ProtobufIndex(index = 2)
  public val bridgeContract: String,
  @ProtobufIndex(index = 3)
  public val bridgeChainId: ULong,
  @ProtobufIndex(index = 4)
  public val attestationId: ByteArray,
  @ProtobufIndex(index = 5)
  public val nonce: ULong,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/injective.peggy.v1.EventAttestationObserved"
  }

  public object KotlinxSerializer : KSerializer<EventAttestationObserved> {
    private val delegator: KSerializer<EventAttestationObserved> =
        EventAttestationObserved.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: EventAttestationObserved): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(EventAttestationObservedConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): EventAttestationObserved {
      if (decoder is ProtobufMapperDecoder) {
        return EventAttestationObservedConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = EventBridgeWithdrawCanceled.KotlinxSerializer::class)
@SerialName(value = EventBridgeWithdrawCanceled.TYPE_URL)
public data class EventBridgeWithdrawCanceled(
  @ProtobufIndex(index = 1)
  public val bridgeContract: String,
  @ProtobufIndex(index = 2)
  public val bridgeChainId: ULong,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/injective.peggy.v1.EventBridgeWithdrawCanceled"
  }

  public object KotlinxSerializer : KSerializer<EventBridgeWithdrawCanceled> {
    private val delegator: KSerializer<EventBridgeWithdrawCanceled> =
        EventBridgeWithdrawCanceled.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: EventBridgeWithdrawCanceled): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(EventBridgeWithdrawCanceledConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): EventBridgeWithdrawCanceled {
      if (decoder is ProtobufMapperDecoder) {
        return EventBridgeWithdrawCanceledConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = EventOutgoingBatch.KotlinxSerializer::class)
@SerialName(value = EventOutgoingBatch.TYPE_URL)
public data class EventOutgoingBatch(
  @ProtobufIndex(index = 1)
  public val denom: String,
  @ProtobufIndex(index = 2)
  public val orchestratorAddress: String,
  @ProtobufIndex(index = 3)
  public val batchNonce: ULong,
  @ProtobufIndex(index = 4)
  public val batchTimeout: ULong,
  @ProtobufIndex(index = 5)
  public val batchTxIds: List<ULong>,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/injective.peggy.v1.EventOutgoingBatch"
  }

  public object KotlinxSerializer : KSerializer<EventOutgoingBatch> {
    private val delegator: KSerializer<EventOutgoingBatch> = EventOutgoingBatch.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: EventOutgoingBatch): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(EventOutgoingBatchConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): EventOutgoingBatch {
      if (decoder is ProtobufMapperDecoder) {
        return EventOutgoingBatchConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = EventOutgoingBatchCanceled.KotlinxSerializer::class)
@SerialName(value = EventOutgoingBatchCanceled.TYPE_URL)
public data class EventOutgoingBatchCanceled(
  @ProtobufIndex(index = 1)
  public val bridgeContract: String,
  @ProtobufIndex(index = 2)
  public val bridgeChainId: ULong,
  @ProtobufIndex(index = 3)
  public val batchId: ULong,
  @ProtobufIndex(index = 4)
  public val nonce: ULong,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/injective.peggy.v1.EventOutgoingBatchCanceled"
  }

  public object KotlinxSerializer : KSerializer<EventOutgoingBatchCanceled> {
    private val delegator: KSerializer<EventOutgoingBatchCanceled> =
        EventOutgoingBatchCanceled.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: EventOutgoingBatchCanceled): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(EventOutgoingBatchCanceledConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): EventOutgoingBatchCanceled {
      if (decoder is ProtobufMapperDecoder) {
        return EventOutgoingBatchCanceledConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = EventValsetUpdateRequest.KotlinxSerializer::class)
@SerialName(value = EventValsetUpdateRequest.TYPE_URL)
public data class EventValsetUpdateRequest(
  @ProtobufIndex(index = 1)
  public val valsetNonce: ULong,
  @ProtobufIndex(index = 2)
  public val valsetHeight: ULong,
  @ProtobufIndex(index = 3)
  public val valsetMembers: List<BridgeValidator>,
  @ProtobufIndex(index = 4)
  public val rewardAmount: String,
  @ProtobufIndex(index = 5)
  public val rewardToken: String,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/injective.peggy.v1.EventValsetUpdateRequest"
  }

  public object KotlinxSerializer : KSerializer<EventValsetUpdateRequest> {
    private val delegator: KSerializer<EventValsetUpdateRequest> =
        EventValsetUpdateRequest.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: EventValsetUpdateRequest): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(EventValsetUpdateRequestConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): EventValsetUpdateRequest {
      if (decoder is ProtobufMapperDecoder) {
        return EventValsetUpdateRequestConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = EventSetOrchestratorAddresses.KotlinxSerializer::class)
@SerialName(value = EventSetOrchestratorAddresses.TYPE_URL)
public data class EventSetOrchestratorAddresses(
  @ProtobufIndex(index = 1)
  public val validatorAddress: String,
  @ProtobufIndex(index = 2)
  public val orchestratorAddress: String,
  @ProtobufIndex(index = 3)
  public val operatorEthAddress: String,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/injective.peggy.v1.EventSetOrchestratorAddresses"
  }

  public object KotlinxSerializer : KSerializer<EventSetOrchestratorAddresses> {
    private val delegator: KSerializer<EventSetOrchestratorAddresses> =
        EventSetOrchestratorAddresses.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: EventSetOrchestratorAddresses): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(EventSetOrchestratorAddressesConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): EventSetOrchestratorAddresses {
      if (decoder is ProtobufMapperDecoder) {
        return EventSetOrchestratorAddressesConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = EventValsetConfirm.KotlinxSerializer::class)
@SerialName(value = EventValsetConfirm.TYPE_URL)
public data class EventValsetConfirm(
  @ProtobufIndex(index = 1)
  public val valsetNonce: ULong,
  @ProtobufIndex(index = 2)
  public val orchestratorAddress: String,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/injective.peggy.v1.EventValsetConfirm"
  }

  public object KotlinxSerializer : KSerializer<EventValsetConfirm> {
    private val delegator: KSerializer<EventValsetConfirm> = EventValsetConfirm.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: EventValsetConfirm): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(EventValsetConfirmConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): EventValsetConfirm {
      if (decoder is ProtobufMapperDecoder) {
        return EventValsetConfirmConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = EventSendToEth.KotlinxSerializer::class)
@SerialName(value = EventSendToEth.TYPE_URL)
public data class EventSendToEth(
  @ProtobufIndex(index = 1)
  public val outgoingTxId: ULong,
  @ProtobufIndex(index = 2)
  public val sender: String,
  @ProtobufIndex(index = 3)
  public val `receiver`: String,
  @ProtobufIndex(index = 4)
  public val amount: String,
  @ProtobufIndex(index = 5)
  public val bridgeFee: String,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/injective.peggy.v1.EventSendToEth"
  }

  public object KotlinxSerializer : KSerializer<EventSendToEth> {
    private val delegator: KSerializer<EventSendToEth> = EventSendToEth.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: EventSendToEth): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(EventSendToEthConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): EventSendToEth {
      if (decoder is ProtobufMapperDecoder) {
        return EventSendToEthConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = EventConfirmBatch.KotlinxSerializer::class)
@SerialName(value = EventConfirmBatch.TYPE_URL)
public data class EventConfirmBatch(
  @ProtobufIndex(index = 1)
  public val batchNonce: ULong,
  @ProtobufIndex(index = 2)
  public val orchestratorAddress: String,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/injective.peggy.v1.EventConfirmBatch"
  }

  public object KotlinxSerializer : KSerializer<EventConfirmBatch> {
    private val delegator: KSerializer<EventConfirmBatch> = EventConfirmBatch.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: EventConfirmBatch): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(EventConfirmBatchConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): EventConfirmBatch {
      if (decoder is ProtobufMapperDecoder) {
        return EventConfirmBatchConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = EventAttestationVote.KotlinxSerializer::class)
@SerialName(value = EventAttestationVote.TYPE_URL)
public data class EventAttestationVote(
  @ProtobufIndex(index = 1)
  public val eventNonce: ULong,
  @ProtobufIndex(index = 2)
  public val attestationId: ByteArray,
  @ProtobufIndex(index = 3)
  public val voter: String,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/injective.peggy.v1.EventAttestationVote"
  }

  public object KotlinxSerializer : KSerializer<EventAttestationVote> {
    private val delegator: KSerializer<EventAttestationVote> = EventAttestationVote.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: EventAttestationVote): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(EventAttestationVoteConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): EventAttestationVote {
      if (decoder is ProtobufMapperDecoder) {
        return EventAttestationVoteConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = EventDepositClaim.KotlinxSerializer::class)
@SerialName(value = EventDepositClaim.TYPE_URL)
public data class EventDepositClaim(
  @ProtobufIndex(index = 1)
  public val eventNonce: ULong,
  @ProtobufIndex(index = 2)
  public val eventHeight: ULong,
  @ProtobufIndex(index = 3)
  public val attestationId: ByteArray,
  @ProtobufIndex(index = 4)
  public val ethereumSender: String,
  @ProtobufIndex(index = 5)
  public val cosmosReceiver: String,
  @ProtobufIndex(index = 6)
  public val tokenContract: String,
  @ProtobufIndex(index = 7)
  public val amount: String,
  @ProtobufIndex(index = 8)
  public val orchestratorAddress: String,
  @ProtobufIndex(index = 9)
  public val `data`: String,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/injective.peggy.v1.EventDepositClaim"
  }

  public object KotlinxSerializer : KSerializer<EventDepositClaim> {
    private val delegator: KSerializer<EventDepositClaim> = EventDepositClaim.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: EventDepositClaim): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(EventDepositClaimConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): EventDepositClaim {
      if (decoder is ProtobufMapperDecoder) {
        return EventDepositClaimConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = EventWithdrawClaim.KotlinxSerializer::class)
@SerialName(value = EventWithdrawClaim.TYPE_URL)
public data class EventWithdrawClaim(
  @ProtobufIndex(index = 1)
  public val eventNonce: ULong,
  @ProtobufIndex(index = 2)
  public val eventHeight: ULong,
  @ProtobufIndex(index = 3)
  public val attestationId: ByteArray,
  @ProtobufIndex(index = 4)
  public val batchNonce: ULong,
  @ProtobufIndex(index = 5)
  public val tokenContract: String,
  @ProtobufIndex(index = 6)
  public val orchestratorAddress: String,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/injective.peggy.v1.EventWithdrawClaim"
  }

  public object KotlinxSerializer : KSerializer<EventWithdrawClaim> {
    private val delegator: KSerializer<EventWithdrawClaim> = EventWithdrawClaim.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: EventWithdrawClaim): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(EventWithdrawClaimConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): EventWithdrawClaim {
      if (decoder is ProtobufMapperDecoder) {
        return EventWithdrawClaimConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = EventERC20DeployedClaim.KotlinxSerializer::class)
@SerialName(value = EventERC20DeployedClaim.TYPE_URL)
public data class EventERC20DeployedClaim(
  @ProtobufIndex(index = 1)
  public val eventNonce: ULong,
  @ProtobufIndex(index = 2)
  public val eventHeight: ULong,
  @ProtobufIndex(index = 3)
  public val attestationId: ByteArray,
  @ProtobufIndex(index = 4)
  public val cosmosDenom: String,
  @ProtobufIndex(index = 5)
  public val tokenContract: String,
  @ProtobufIndex(index = 6)
  public val name: String,
  @ProtobufIndex(index = 7)
  public val symbol: String,
  @ProtobufIndex(index = 8)
  public val decimals: ULong,
  @ProtobufIndex(index = 9)
  public val orchestratorAddress: String,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/injective.peggy.v1.EventERC20DeployedClaim"
  }

  public object KotlinxSerializer : KSerializer<EventERC20DeployedClaim> {
    private val delegator: KSerializer<EventERC20DeployedClaim> =
        EventERC20DeployedClaim.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: EventERC20DeployedClaim): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(EventERC20DeployedClaimConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): EventERC20DeployedClaim {
      if (decoder is ProtobufMapperDecoder) {
        return EventERC20DeployedClaimConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = EventValsetUpdateClaim.KotlinxSerializer::class)
@SerialName(value = EventValsetUpdateClaim.TYPE_URL)
public data class EventValsetUpdateClaim(
  @ProtobufIndex(index = 1)
  public val eventNonce: ULong,
  @ProtobufIndex(index = 2)
  public val eventHeight: ULong,
  @ProtobufIndex(index = 3)
  public val attestationId: ByteArray,
  @ProtobufIndex(index = 4)
  public val valsetNonce: ULong,
  @ProtobufIndex(index = 5)
  public val valsetMembers: List<BridgeValidator>,
  @ProtobufIndex(index = 6)
  public val rewardAmount: String,
  @ProtobufIndex(index = 7)
  public val rewardToken: String,
  @ProtobufIndex(index = 8)
  public val orchestratorAddress: String,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/injective.peggy.v1.EventValsetUpdateClaim"
  }

  public object KotlinxSerializer : KSerializer<EventValsetUpdateClaim> {
    private val delegator: KSerializer<EventValsetUpdateClaim> = EventValsetUpdateClaim.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: EventValsetUpdateClaim): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(EventValsetUpdateClaimConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): EventValsetUpdateClaim {
      if (decoder is ProtobufMapperDecoder) {
        return EventValsetUpdateClaimConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = EventCancelSendToEth.KotlinxSerializer::class)
@SerialName(value = EventCancelSendToEth.TYPE_URL)
public data class EventCancelSendToEth(
  @ProtobufIndex(index = 1)
  public val outgoingTxId: ULong,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/injective.peggy.v1.EventCancelSendToEth"
  }

  public object KotlinxSerializer : KSerializer<EventCancelSendToEth> {
    private val delegator: KSerializer<EventCancelSendToEth> = EventCancelSendToEth.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: EventCancelSendToEth): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(EventCancelSendToEthConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): EventCancelSendToEth {
      if (decoder is ProtobufMapperDecoder) {
        return EventCancelSendToEthConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = EventSubmitBadSignatureEvidence.KotlinxSerializer::class)
@SerialName(value = EventSubmitBadSignatureEvidence.TYPE_URL)
public data class EventSubmitBadSignatureEvidence(
  @ProtobufIndex(index = 1)
  public val badEthSignature: String,
  @ProtobufIndex(index = 2)
  public val badEthSignatureSubject: String,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/injective.peggy.v1.EventSubmitBadSignatureEvidence"
  }

  public object KotlinxSerializer : KSerializer<EventSubmitBadSignatureEvidence> {
    private val delegator: KSerializer<EventSubmitBadSignatureEvidence> =
        EventSubmitBadSignatureEvidence.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: EventSubmitBadSignatureEvidence):
        Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(EventSubmitBadSignatureEvidenceConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): EventSubmitBadSignatureEvidence {
      if (decoder is ProtobufMapperDecoder) {
        return EventSubmitBadSignatureEvidenceConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = EventValidatorSlash.KotlinxSerializer::class)
@SerialName(value = EventValidatorSlash.TYPE_URL)
public data class EventValidatorSlash(
  @ProtobufIndex(index = 1)
  public val power: Long,
  @ProtobufIndex(index = 2)
  public val reason: String,
  @ProtobufIndex(index = 3)
  public val consensusAddress: String,
  @ProtobufIndex(index = 4)
  public val operatorAddress: String,
  @ProtobufIndex(index = 5)
  public val moniker: String,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/injective.peggy.v1.EventValidatorSlash"
  }

  public object KotlinxSerializer : KSerializer<EventValidatorSlash> {
    private val delegator: KSerializer<EventValidatorSlash> = EventValidatorSlash.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: EventValidatorSlash): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(EventValidatorSlashConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): EventValidatorSlash {
      if (decoder is ProtobufMapperDecoder) {
        return EventValidatorSlashConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}
