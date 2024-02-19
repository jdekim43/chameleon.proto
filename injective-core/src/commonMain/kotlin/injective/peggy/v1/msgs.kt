// Transform from injective/peggy/v1/msgs.proto
@file:ProtobufSyntax(syntax = "PROTO3")
@file:GeneratorVersion(version = "0.3.1")

package injective.peggy.v1

import cosmos.base.v1beta1.Coin
import google.protobuf.Any
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

@Serializable(with = MsgSetOrchestratorAddresses.KotlinxSerializer::class)
@SerialName(value = MsgSetOrchestratorAddresses.TYPE_URL)
public data class MsgSetOrchestratorAddresses(
  @ProtobufIndex(index = 1)
  public val sender: String,
  @ProtobufIndex(index = 2)
  public val orchestrator: String,
  @ProtobufIndex(index = 3)
  public val ethAddress: String,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/injective.peggy.v1.MsgSetOrchestratorAddresses"
  }

  public object KotlinxSerializer : KSerializer<MsgSetOrchestratorAddresses> {
    private val delegator: KSerializer<MsgSetOrchestratorAddresses> =
        MsgSetOrchestratorAddresses.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: MsgSetOrchestratorAddresses): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(MsgSetOrchestratorAddressesConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): MsgSetOrchestratorAddresses {
      if (decoder is ProtobufMapperDecoder) {
        return MsgSetOrchestratorAddressesConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = MsgSetOrchestratorAddressesResponse.KotlinxSerializer::class)
@SerialName(value = MsgSetOrchestratorAddressesResponse.TYPE_URL)
public class MsgSetOrchestratorAddressesResponse() : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/injective.peggy.v1.MsgSetOrchestratorAddressesResponse"
  }

  public object KotlinxSerializer : KSerializer<MsgSetOrchestratorAddressesResponse> {
    private val delegator: KSerializer<MsgSetOrchestratorAddressesResponse> =
        MsgSetOrchestratorAddressesResponse.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: MsgSetOrchestratorAddressesResponse):
        Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(MsgSetOrchestratorAddressesResponseConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): MsgSetOrchestratorAddressesResponse {
      if (decoder is ProtobufMapperDecoder) {
        return MsgSetOrchestratorAddressesResponseConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = MsgValsetConfirm.KotlinxSerializer::class)
@SerialName(value = MsgValsetConfirm.TYPE_URL)
public data class MsgValsetConfirm(
  @ProtobufIndex(index = 1)
  public val nonce: ULong,
  @ProtobufIndex(index = 2)
  public val orchestrator: String,
  @ProtobufIndex(index = 3)
  public val ethAddress: String,
  @ProtobufIndex(index = 4)
  public val signature: String,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/injective.peggy.v1.MsgValsetConfirm"
  }

  public object KotlinxSerializer : KSerializer<MsgValsetConfirm> {
    private val delegator: KSerializer<MsgValsetConfirm> = MsgValsetConfirm.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: MsgValsetConfirm): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(MsgValsetConfirmConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): MsgValsetConfirm {
      if (decoder is ProtobufMapperDecoder) {
        return MsgValsetConfirmConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = MsgValsetConfirmResponse.KotlinxSerializer::class)
@SerialName(value = MsgValsetConfirmResponse.TYPE_URL)
public class MsgValsetConfirmResponse() : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/injective.peggy.v1.MsgValsetConfirmResponse"
  }

  public object KotlinxSerializer : KSerializer<MsgValsetConfirmResponse> {
    private val delegator: KSerializer<MsgValsetConfirmResponse> =
        MsgValsetConfirmResponse.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: MsgValsetConfirmResponse): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(MsgValsetConfirmResponseConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): MsgValsetConfirmResponse {
      if (decoder is ProtobufMapperDecoder) {
        return MsgValsetConfirmResponseConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = MsgSendToEth.KotlinxSerializer::class)
@SerialName(value = MsgSendToEth.TYPE_URL)
public data class MsgSendToEth(
  @ProtobufIndex(index = 1)
  public val sender: String,
  @ProtobufIndex(index = 2)
  public val ethDest: String,
  @ProtobufIndex(index = 3)
  public val amount: Coin,
  @ProtobufIndex(index = 4)
  public val bridgeFee: Coin,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/injective.peggy.v1.MsgSendToEth"
  }

  public object KotlinxSerializer : KSerializer<MsgSendToEth> {
    private val delegator: KSerializer<MsgSendToEth> = MsgSendToEth.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: MsgSendToEth): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(MsgSendToEthConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): MsgSendToEth {
      if (decoder is ProtobufMapperDecoder) {
        return MsgSendToEthConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = MsgSendToEthResponse.KotlinxSerializer::class)
@SerialName(value = MsgSendToEthResponse.TYPE_URL)
public class MsgSendToEthResponse() : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/injective.peggy.v1.MsgSendToEthResponse"
  }

  public object KotlinxSerializer : KSerializer<MsgSendToEthResponse> {
    private val delegator: KSerializer<MsgSendToEthResponse> = MsgSendToEthResponse.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: MsgSendToEthResponse): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(MsgSendToEthResponseConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): MsgSendToEthResponse {
      if (decoder is ProtobufMapperDecoder) {
        return MsgSendToEthResponseConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = MsgRequestBatch.KotlinxSerializer::class)
@SerialName(value = MsgRequestBatch.TYPE_URL)
public data class MsgRequestBatch(
  @ProtobufIndex(index = 1)
  public val orchestrator: String,
  @ProtobufIndex(index = 2)
  public val denom: String,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/injective.peggy.v1.MsgRequestBatch"
  }

  public object KotlinxSerializer : KSerializer<MsgRequestBatch> {
    private val delegator: KSerializer<MsgRequestBatch> = MsgRequestBatch.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: MsgRequestBatch): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(MsgRequestBatchConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): MsgRequestBatch {
      if (decoder is ProtobufMapperDecoder) {
        return MsgRequestBatchConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = MsgRequestBatchResponse.KotlinxSerializer::class)
@SerialName(value = MsgRequestBatchResponse.TYPE_URL)
public class MsgRequestBatchResponse() : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/injective.peggy.v1.MsgRequestBatchResponse"
  }

  public object KotlinxSerializer : KSerializer<MsgRequestBatchResponse> {
    private val delegator: KSerializer<MsgRequestBatchResponse> =
        MsgRequestBatchResponse.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: MsgRequestBatchResponse): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(MsgRequestBatchResponseConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): MsgRequestBatchResponse {
      if (decoder is ProtobufMapperDecoder) {
        return MsgRequestBatchResponseConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = MsgConfirmBatch.KotlinxSerializer::class)
@SerialName(value = MsgConfirmBatch.TYPE_URL)
public data class MsgConfirmBatch(
  @ProtobufIndex(index = 1)
  public val nonce: ULong,
  @ProtobufIndex(index = 2)
  public val tokenContract: String,
  @ProtobufIndex(index = 3)
  public val ethSigner: String,
  @ProtobufIndex(index = 4)
  public val orchestrator: String,
  @ProtobufIndex(index = 5)
  public val signature: String,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/injective.peggy.v1.MsgConfirmBatch"
  }

  public object KotlinxSerializer : KSerializer<MsgConfirmBatch> {
    private val delegator: KSerializer<MsgConfirmBatch> = MsgConfirmBatch.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: MsgConfirmBatch): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(MsgConfirmBatchConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): MsgConfirmBatch {
      if (decoder is ProtobufMapperDecoder) {
        return MsgConfirmBatchConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = MsgConfirmBatchResponse.KotlinxSerializer::class)
@SerialName(value = MsgConfirmBatchResponse.TYPE_URL)
public class MsgConfirmBatchResponse() : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/injective.peggy.v1.MsgConfirmBatchResponse"
  }

  public object KotlinxSerializer : KSerializer<MsgConfirmBatchResponse> {
    private val delegator: KSerializer<MsgConfirmBatchResponse> =
        MsgConfirmBatchResponse.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: MsgConfirmBatchResponse): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(MsgConfirmBatchResponseConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): MsgConfirmBatchResponse {
      if (decoder is ProtobufMapperDecoder) {
        return MsgConfirmBatchResponseConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = MsgDepositClaim.KotlinxSerializer::class)
@SerialName(value = MsgDepositClaim.TYPE_URL)
public data class MsgDepositClaim(
  @ProtobufIndex(index = 1)
  public val eventNonce: ULong,
  @ProtobufIndex(index = 2)
  public val blockHeight: ULong,
  @ProtobufIndex(index = 3)
  public val tokenContract: String,
  @ProtobufIndex(index = 4)
  public val amount: String,
  @ProtobufIndex(index = 5)
  public val ethereumSender: String,
  @ProtobufIndex(index = 6)
  public val cosmosReceiver: String,
  @ProtobufIndex(index = 7)
  public val orchestrator: String,
  @ProtobufIndex(index = 8)
  public val `data`: String,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/injective.peggy.v1.MsgDepositClaim"
  }

  public object KotlinxSerializer : KSerializer<MsgDepositClaim> {
    private val delegator: KSerializer<MsgDepositClaim> = MsgDepositClaim.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: MsgDepositClaim): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(MsgDepositClaimConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): MsgDepositClaim {
      if (decoder is ProtobufMapperDecoder) {
        return MsgDepositClaimConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = MsgDepositClaimResponse.KotlinxSerializer::class)
@SerialName(value = MsgDepositClaimResponse.TYPE_URL)
public class MsgDepositClaimResponse() : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/injective.peggy.v1.MsgDepositClaimResponse"
  }

  public object KotlinxSerializer : KSerializer<MsgDepositClaimResponse> {
    private val delegator: KSerializer<MsgDepositClaimResponse> =
        MsgDepositClaimResponse.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: MsgDepositClaimResponse): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(MsgDepositClaimResponseConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): MsgDepositClaimResponse {
      if (decoder is ProtobufMapperDecoder) {
        return MsgDepositClaimResponseConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = MsgWithdrawClaim.KotlinxSerializer::class)
@SerialName(value = MsgWithdrawClaim.TYPE_URL)
public data class MsgWithdrawClaim(
  @ProtobufIndex(index = 1)
  public val eventNonce: ULong,
  @ProtobufIndex(index = 2)
  public val blockHeight: ULong,
  @ProtobufIndex(index = 3)
  public val batchNonce: ULong,
  @ProtobufIndex(index = 4)
  public val tokenContract: String,
  @ProtobufIndex(index = 5)
  public val orchestrator: String,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/injective.peggy.v1.MsgWithdrawClaim"
  }

  public object KotlinxSerializer : KSerializer<MsgWithdrawClaim> {
    private val delegator: KSerializer<MsgWithdrawClaim> = MsgWithdrawClaim.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: MsgWithdrawClaim): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(MsgWithdrawClaimConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): MsgWithdrawClaim {
      if (decoder is ProtobufMapperDecoder) {
        return MsgWithdrawClaimConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = MsgWithdrawClaimResponse.KotlinxSerializer::class)
@SerialName(value = MsgWithdrawClaimResponse.TYPE_URL)
public class MsgWithdrawClaimResponse() : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/injective.peggy.v1.MsgWithdrawClaimResponse"
  }

  public object KotlinxSerializer : KSerializer<MsgWithdrawClaimResponse> {
    private val delegator: KSerializer<MsgWithdrawClaimResponse> =
        MsgWithdrawClaimResponse.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: MsgWithdrawClaimResponse): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(MsgWithdrawClaimResponseConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): MsgWithdrawClaimResponse {
      if (decoder is ProtobufMapperDecoder) {
        return MsgWithdrawClaimResponseConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = MsgERC20DeployedClaim.KotlinxSerializer::class)
@SerialName(value = MsgERC20DeployedClaim.TYPE_URL)
public data class MsgERC20DeployedClaim(
  @ProtobufIndex(index = 1)
  public val eventNonce: ULong,
  @ProtobufIndex(index = 2)
  public val blockHeight: ULong,
  @ProtobufIndex(index = 3)
  public val cosmosDenom: String,
  @ProtobufIndex(index = 4)
  public val tokenContract: String,
  @ProtobufIndex(index = 5)
  public val name: String,
  @ProtobufIndex(index = 6)
  public val symbol: String,
  @ProtobufIndex(index = 7)
  public val decimals: ULong,
  @ProtobufIndex(index = 8)
  public val orchestrator: String,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/injective.peggy.v1.MsgERC20DeployedClaim"
  }

  public object KotlinxSerializer : KSerializer<MsgERC20DeployedClaim> {
    private val delegator: KSerializer<MsgERC20DeployedClaim> = MsgERC20DeployedClaim.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: MsgERC20DeployedClaim): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(MsgERC20DeployedClaimConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): MsgERC20DeployedClaim {
      if (decoder is ProtobufMapperDecoder) {
        return MsgERC20DeployedClaimConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = MsgERC20DeployedClaimResponse.KotlinxSerializer::class)
@SerialName(value = MsgERC20DeployedClaimResponse.TYPE_URL)
public class MsgERC20DeployedClaimResponse() : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/injective.peggy.v1.MsgERC20DeployedClaimResponse"
  }

  public object KotlinxSerializer : KSerializer<MsgERC20DeployedClaimResponse> {
    private val delegator: KSerializer<MsgERC20DeployedClaimResponse> =
        MsgERC20DeployedClaimResponse.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: MsgERC20DeployedClaimResponse): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(MsgERC20DeployedClaimResponseConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): MsgERC20DeployedClaimResponse {
      if (decoder is ProtobufMapperDecoder) {
        return MsgERC20DeployedClaimResponseConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = MsgCancelSendToEth.KotlinxSerializer::class)
@SerialName(value = MsgCancelSendToEth.TYPE_URL)
public data class MsgCancelSendToEth(
  @ProtobufIndex(index = 1)
  public val transactionId: ULong,
  @ProtobufIndex(index = 2)
  public val sender: String,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/injective.peggy.v1.MsgCancelSendToEth"
  }

  public object KotlinxSerializer : KSerializer<MsgCancelSendToEth> {
    private val delegator: KSerializer<MsgCancelSendToEth> = MsgCancelSendToEth.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: MsgCancelSendToEth): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(MsgCancelSendToEthConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): MsgCancelSendToEth {
      if (decoder is ProtobufMapperDecoder) {
        return MsgCancelSendToEthConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = MsgCancelSendToEthResponse.KotlinxSerializer::class)
@SerialName(value = MsgCancelSendToEthResponse.TYPE_URL)
public class MsgCancelSendToEthResponse() : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/injective.peggy.v1.MsgCancelSendToEthResponse"
  }

  public object KotlinxSerializer : KSerializer<MsgCancelSendToEthResponse> {
    private val delegator: KSerializer<MsgCancelSendToEthResponse> =
        MsgCancelSendToEthResponse.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: MsgCancelSendToEthResponse): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(MsgCancelSendToEthResponseConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): MsgCancelSendToEthResponse {
      if (decoder is ProtobufMapperDecoder) {
        return MsgCancelSendToEthResponseConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = MsgSubmitBadSignatureEvidence.KotlinxSerializer::class)
@SerialName(value = MsgSubmitBadSignatureEvidence.TYPE_URL)
public data class MsgSubmitBadSignatureEvidence(
  @ProtobufIndex(index = 1)
  public val subject: Any,
  @ProtobufIndex(index = 2)
  public val signature: String,
  @ProtobufIndex(index = 3)
  public val sender: String,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/injective.peggy.v1.MsgSubmitBadSignatureEvidence"
  }

  public object KotlinxSerializer : KSerializer<MsgSubmitBadSignatureEvidence> {
    private val delegator: KSerializer<MsgSubmitBadSignatureEvidence> =
        MsgSubmitBadSignatureEvidence.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: MsgSubmitBadSignatureEvidence): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(MsgSubmitBadSignatureEvidenceConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): MsgSubmitBadSignatureEvidence {
      if (decoder is ProtobufMapperDecoder) {
        return MsgSubmitBadSignatureEvidenceConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = MsgSubmitBadSignatureEvidenceResponse.KotlinxSerializer::class)
@SerialName(value = MsgSubmitBadSignatureEvidenceResponse.TYPE_URL)
public class MsgSubmitBadSignatureEvidenceResponse() : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/injective.peggy.v1.MsgSubmitBadSignatureEvidenceResponse"
  }

  public object KotlinxSerializer : KSerializer<MsgSubmitBadSignatureEvidenceResponse> {
    private val delegator: KSerializer<MsgSubmitBadSignatureEvidenceResponse> =
        MsgSubmitBadSignatureEvidenceResponse.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: MsgSubmitBadSignatureEvidenceResponse):
        Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(MsgSubmitBadSignatureEvidenceResponseConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): MsgSubmitBadSignatureEvidenceResponse {
      if (decoder is ProtobufMapperDecoder) {
        return MsgSubmitBadSignatureEvidenceResponseConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = MsgValsetUpdatedClaim.KotlinxSerializer::class)
@SerialName(value = MsgValsetUpdatedClaim.TYPE_URL)
public data class MsgValsetUpdatedClaim(
  @ProtobufIndex(index = 1)
  public val eventNonce: ULong,
  @ProtobufIndex(index = 2)
  public val valsetNonce: ULong,
  @ProtobufIndex(index = 3)
  public val blockHeight: ULong,
  @ProtobufIndex(index = 4)
  public val members: List<BridgeValidator>,
  @ProtobufIndex(index = 5)
  public val rewardAmount: String,
  @ProtobufIndex(index = 6)
  public val rewardToken: String,
  @ProtobufIndex(index = 7)
  public val orchestrator: String,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/injective.peggy.v1.MsgValsetUpdatedClaim"
  }

  public object KotlinxSerializer : KSerializer<MsgValsetUpdatedClaim> {
    private val delegator: KSerializer<MsgValsetUpdatedClaim> = MsgValsetUpdatedClaim.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: MsgValsetUpdatedClaim): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(MsgValsetUpdatedClaimConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): MsgValsetUpdatedClaim {
      if (decoder is ProtobufMapperDecoder) {
        return MsgValsetUpdatedClaimConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = MsgValsetUpdatedClaimResponse.KotlinxSerializer::class)
@SerialName(value = MsgValsetUpdatedClaimResponse.TYPE_URL)
public class MsgValsetUpdatedClaimResponse() : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/injective.peggy.v1.MsgValsetUpdatedClaimResponse"
  }

  public object KotlinxSerializer : KSerializer<MsgValsetUpdatedClaimResponse> {
    private val delegator: KSerializer<MsgValsetUpdatedClaimResponse> =
        MsgValsetUpdatedClaimResponse.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: MsgValsetUpdatedClaimResponse): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(MsgValsetUpdatedClaimResponseConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): MsgValsetUpdatedClaimResponse {
      if (decoder is ProtobufMapperDecoder) {
        return MsgValsetUpdatedClaimResponseConverter.deserialize(decoder.decodeByteArray())
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
    public const val TYPE_URL: String = "/injective.peggy.v1.MsgUpdateParams"
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
    public const val TYPE_URL: String = "/injective.peggy.v1.MsgUpdateParamsResponse"
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
