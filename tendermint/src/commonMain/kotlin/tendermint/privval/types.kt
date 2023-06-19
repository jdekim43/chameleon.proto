// Transform from tendermint/privval/types.proto
@file:ProtobufSyntax(syntax = "PROTO3")
@file:GeneratorVersion(version = "0.3.1")

package tendermint.privval

import kotlin.Int
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmInline
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
import tendermint.crypto.PublicKey
import tendermint.types.Proposal
import tendermint.types.Vote

@Serializable
@SerialName(value = "/tendermint.privval.Errors")
public enum class Errors(
  public val number: Int,
) {
  @ProtobufIndex(index = 0)
  ERRORS_UNKNOWN(0),
  @ProtobufIndex(index = 1)
  ERRORS_UNEXPECTED_RESPONSE(1),
  @ProtobufIndex(index = 2)
  ERRORS_NO_CONNECTION(2),
  @ProtobufIndex(index = 3)
  ERRORS_CONNECTION_TIMEOUT(3),
  @ProtobufIndex(index = 4)
  ERRORS_READ_TIMEOUT(4),
  @ProtobufIndex(index = 5)
  ERRORS_WRITE_TIMEOUT(5),
  ;

  public companion object {
    public fun forNumber(number: Int): Errors = Errors.values()
    	.first { it.number == number }
  }
}

@Serializable(with = RemoteSignerError.KotlinxSerializer::class)
@SerialName(value = RemoteSignerError.TYPE_URL)
public data class RemoteSignerError(
  @ProtobufIndex(index = 1)
  public val code: Int,
  @ProtobufIndex(index = 2)
  public val description: String,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/tendermint.privval.RemoteSignerError"
  }

  public object KotlinxSerializer : KSerializer<RemoteSignerError> {
    private val delegator: KSerializer<RemoteSignerError> = RemoteSignerError.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: RemoteSignerError): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(RemoteSignerErrorConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): RemoteSignerError {
      if (decoder is ProtobufMapperDecoder) {
        return RemoteSignerErrorConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = PubKeyRequest.KotlinxSerializer::class)
@SerialName(value = PubKeyRequest.TYPE_URL)
public data class PubKeyRequest(
  @ProtobufIndex(index = 1)
  public val chainId: String,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/tendermint.privval.PubKeyRequest"
  }

  public object KotlinxSerializer : KSerializer<PubKeyRequest> {
    private val delegator: KSerializer<PubKeyRequest> = PubKeyRequest.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: PubKeyRequest): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(PubKeyRequestConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): PubKeyRequest {
      if (decoder is ProtobufMapperDecoder) {
        return PubKeyRequestConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = PubKeyResponse.KotlinxSerializer::class)
@SerialName(value = PubKeyResponse.TYPE_URL)
public data class PubKeyResponse(
  @ProtobufIndex(index = 1)
  public val pubKey: PublicKey,
  @ProtobufIndex(index = 2)
  public val error: RemoteSignerError,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/tendermint.privval.PubKeyResponse"
  }

  public object KotlinxSerializer : KSerializer<PubKeyResponse> {
    private val delegator: KSerializer<PubKeyResponse> = PubKeyResponse.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: PubKeyResponse): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(PubKeyResponseConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): PubKeyResponse {
      if (decoder is ProtobufMapperDecoder) {
        return PubKeyResponseConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = SignVoteRequest.KotlinxSerializer::class)
@SerialName(value = SignVoteRequest.TYPE_URL)
public data class SignVoteRequest(
  @ProtobufIndex(index = 1)
  public val vote: Vote,
  @ProtobufIndex(index = 2)
  public val chainId: String,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/tendermint.privval.SignVoteRequest"
  }

  public object KotlinxSerializer : KSerializer<SignVoteRequest> {
    private val delegator: KSerializer<SignVoteRequest> = SignVoteRequest.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: SignVoteRequest): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(SignVoteRequestConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): SignVoteRequest {
      if (decoder is ProtobufMapperDecoder) {
        return SignVoteRequestConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = SignedVoteResponse.KotlinxSerializer::class)
@SerialName(value = SignedVoteResponse.TYPE_URL)
public data class SignedVoteResponse(
  @ProtobufIndex(index = 1)
  public val vote: Vote,
  @ProtobufIndex(index = 2)
  public val error: RemoteSignerError,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/tendermint.privval.SignedVoteResponse"
  }

  public object KotlinxSerializer : KSerializer<SignedVoteResponse> {
    private val delegator: KSerializer<SignedVoteResponse> = SignedVoteResponse.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: SignedVoteResponse): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(SignedVoteResponseConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): SignedVoteResponse {
      if (decoder is ProtobufMapperDecoder) {
        return SignedVoteResponseConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = SignProposalRequest.KotlinxSerializer::class)
@SerialName(value = SignProposalRequest.TYPE_URL)
public data class SignProposalRequest(
  @ProtobufIndex(index = 1)
  public val proposal: Proposal,
  @ProtobufIndex(index = 2)
  public val chainId: String,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/tendermint.privval.SignProposalRequest"
  }

  public object KotlinxSerializer : KSerializer<SignProposalRequest> {
    private val delegator: KSerializer<SignProposalRequest> = SignProposalRequest.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: SignProposalRequest): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(SignProposalRequestConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): SignProposalRequest {
      if (decoder is ProtobufMapperDecoder) {
        return SignProposalRequestConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = SignedProposalResponse.KotlinxSerializer::class)
@SerialName(value = SignedProposalResponse.TYPE_URL)
public data class SignedProposalResponse(
  @ProtobufIndex(index = 1)
  public val proposal: Proposal,
  @ProtobufIndex(index = 2)
  public val error: RemoteSignerError,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/tendermint.privval.SignedProposalResponse"
  }

  public object KotlinxSerializer : KSerializer<SignedProposalResponse> {
    private val delegator: KSerializer<SignedProposalResponse> = SignedProposalResponse.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: SignedProposalResponse): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(SignedProposalResponseConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): SignedProposalResponse {
      if (decoder is ProtobufMapperDecoder) {
        return SignedProposalResponseConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = PingRequest.KotlinxSerializer::class)
@SerialName(value = PingRequest.TYPE_URL)
public class PingRequest() : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/tendermint.privval.PingRequest"
  }

  public object KotlinxSerializer : KSerializer<PingRequest> {
    private val delegator: KSerializer<PingRequest> = PingRequest.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: PingRequest): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(PingRequestConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): PingRequest {
      if (decoder is ProtobufMapperDecoder) {
        return PingRequestConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = PingResponse.KotlinxSerializer::class)
@SerialName(value = PingResponse.TYPE_URL)
public class PingResponse() : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/tendermint.privval.PingResponse"
  }

  public object KotlinxSerializer : KSerializer<PingResponse> {
    private val delegator: KSerializer<PingResponse> = PingResponse.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: PingResponse): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(PingResponseConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): PingResponse {
      if (decoder is ProtobufMapperDecoder) {
        return PingResponseConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = Message.KotlinxSerializer::class)
@SerialName(value = Message.TYPE_URL)
public data class Message(
  public val sum: SumOneOf,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/tendermint.privval.Message"
  }

  @Serializable
  public sealed interface SumOneOf {
    @JvmInline
    public value class PubKeyRequest(
      @ProtobufIndex(index = 1)
      public val `value`: tendermint.privval.PubKeyRequest,
    ) : SumOneOf

    @JvmInline
    public value class PubKeyResponse(
      @ProtobufIndex(index = 2)
      public val `value`: tendermint.privval.PubKeyResponse,
    ) : SumOneOf

    @JvmInline
    public value class SignVoteRequest(
      @ProtobufIndex(index = 3)
      public val `value`: tendermint.privval.SignVoteRequest,
    ) : SumOneOf

    @JvmInline
    public value class SignedVoteResponse(
      @ProtobufIndex(index = 4)
      public val `value`: tendermint.privval.SignedVoteResponse,
    ) : SumOneOf

    @JvmInline
    public value class SignProposalRequest(
      @ProtobufIndex(index = 5)
      public val `value`: tendermint.privval.SignProposalRequest,
    ) : SumOneOf

    @JvmInline
    public value class SignedProposalResponse(
      @ProtobufIndex(index = 6)
      public val `value`: tendermint.privval.SignedProposalResponse,
    ) : SumOneOf

    @JvmInline
    public value class PingRequest(
      @ProtobufIndex(index = 7)
      public val `value`: tendermint.privval.PingRequest,
    ) : SumOneOf

    @JvmInline
    public value class PingResponse(
      @ProtobufIndex(index = 8)
      public val `value`: tendermint.privval.PingResponse,
    ) : SumOneOf
  }

  public object KotlinxSerializer : KSerializer<Message> {
    private val delegator: KSerializer<Message> = Message.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: Message): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(MessageConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): Message {
      if (decoder is ProtobufMapperDecoder) {
        return MessageConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}
