// Transform from injective/wasmx/v1/proposal.proto
@file:ProtobufSyntax(syntax = "PROTO3")
@file:GeneratorVersion(version = "0.3.1")

package injective.wasmx.v1

import cosmwasm.wasm.v1.StoreCodeProposal
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
@SerialName(value = "/injective.wasmx.v1.FundingMode")
public enum class FundingMode(
  public val number: Int,
) {
  @ProtobufIndex(index = 0)
  Unspecified(0),
  @ProtobufIndex(index = 1)
  SelfFunded(1),
  @ProtobufIndex(index = 2)
  GrantOnly(2),
  @ProtobufIndex(index = 3)
  Dual(3),
  ;

  public companion object {
    public fun forNumber(number: Int): FundingMode = FundingMode.values()
    	.first { it.number == number }
  }
}

@Serializable(with = ContractRegistrationRequestProposal.KotlinxSerializer::class)
@SerialName(value = ContractRegistrationRequestProposal.TYPE_URL)
public data class ContractRegistrationRequestProposal(
  @ProtobufIndex(index = 1)
  public val title: String,
  @ProtobufIndex(index = 2)
  public val description: String,
  @ProtobufIndex(index = 3)
  public val contractRegistrationRequest: ContractRegistrationRequest,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/injective.wasmx.v1.ContractRegistrationRequestProposal"
  }

  public object KotlinxSerializer : KSerializer<ContractRegistrationRequestProposal> {
    private val delegator: KSerializer<ContractRegistrationRequestProposal> =
        ContractRegistrationRequestProposal.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: ContractRegistrationRequestProposal):
        Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(ContractRegistrationRequestProposalConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): ContractRegistrationRequestProposal {
      if (decoder is ProtobufMapperDecoder) {
        return ContractRegistrationRequestProposalConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = BatchContractRegistrationRequestProposal.KotlinxSerializer::class)
@SerialName(value = BatchContractRegistrationRequestProposal.TYPE_URL)
public data class BatchContractRegistrationRequestProposal(
  @ProtobufIndex(index = 1)
  public val title: String,
  @ProtobufIndex(index = 2)
  public val description: String,
  @ProtobufIndex(index = 3)
  public val contractRegistrationRequests: List<ContractRegistrationRequest>,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String =
        "/injective.wasmx.v1.BatchContractRegistrationRequestProposal"
  }

  public object KotlinxSerializer : KSerializer<BatchContractRegistrationRequestProposal> {
    private val delegator: KSerializer<BatchContractRegistrationRequestProposal> =
        BatchContractRegistrationRequestProposal.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder,
        `value`: BatchContractRegistrationRequestProposal): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(BatchContractRegistrationRequestProposalConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): BatchContractRegistrationRequestProposal {
      if (decoder is ProtobufMapperDecoder) {
        return BatchContractRegistrationRequestProposalConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = BatchContractDeregistrationProposal.KotlinxSerializer::class)
@SerialName(value = BatchContractDeregistrationProposal.TYPE_URL)
public data class BatchContractDeregistrationProposal(
  @ProtobufIndex(index = 1)
  public val title: String,
  @ProtobufIndex(index = 2)
  public val description: String,
  @ProtobufIndex(index = 3)
  public val contracts: List<String>,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/injective.wasmx.v1.BatchContractDeregistrationProposal"
  }

  public object KotlinxSerializer : KSerializer<BatchContractDeregistrationProposal> {
    private val delegator: KSerializer<BatchContractDeregistrationProposal> =
        BatchContractDeregistrationProposal.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: BatchContractDeregistrationProposal):
        Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(BatchContractDeregistrationProposalConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): BatchContractDeregistrationProposal {
      if (decoder is ProtobufMapperDecoder) {
        return BatchContractDeregistrationProposalConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = ContractRegistrationRequest.KotlinxSerializer::class)
@SerialName(value = ContractRegistrationRequest.TYPE_URL)
public data class ContractRegistrationRequest(
  @ProtobufIndex(index = 1)
  public val contractAddress: String,
  @ProtobufIndex(index = 2)
  public val gasLimit: ULong,
  @ProtobufIndex(index = 3)
  public val gasPrice: ULong,
  @ProtobufIndex(index = 4)
  public val shouldPinContract: Boolean,
  @ProtobufIndex(index = 5)
  public val isMigrationAllowed: Boolean,
  @ProtobufIndex(index = 6)
  public val codeId: ULong,
  @ProtobufIndex(index = 7)
  public val adminAddress: String,
  @ProtobufIndex(index = 8)
  public val granterAddress: String,
  @ProtobufIndex(index = 9)
  public val fundingMode: FundingMode,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/injective.wasmx.v1.ContractRegistrationRequest"
  }

  public object KotlinxSerializer : KSerializer<ContractRegistrationRequest> {
    private val delegator: KSerializer<ContractRegistrationRequest> =
        ContractRegistrationRequest.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: ContractRegistrationRequest): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(ContractRegistrationRequestConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): ContractRegistrationRequest {
      if (decoder is ProtobufMapperDecoder) {
        return ContractRegistrationRequestConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = BatchStoreCodeProposal.KotlinxSerializer::class)
@SerialName(value = BatchStoreCodeProposal.TYPE_URL)
public data class BatchStoreCodeProposal(
  @ProtobufIndex(index = 1)
  public val title: String,
  @ProtobufIndex(index = 2)
  public val description: String,
  @ProtobufIndex(index = 3)
  public val proposals: List<StoreCodeProposal>,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/injective.wasmx.v1.BatchStoreCodeProposal"
  }

  public object KotlinxSerializer : KSerializer<BatchStoreCodeProposal> {
    private val delegator: KSerializer<BatchStoreCodeProposal> = BatchStoreCodeProposal.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: BatchStoreCodeProposal): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(BatchStoreCodeProposalConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): BatchStoreCodeProposal {
      if (decoder is ProtobufMapperDecoder) {
        return BatchStoreCodeProposalConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}
