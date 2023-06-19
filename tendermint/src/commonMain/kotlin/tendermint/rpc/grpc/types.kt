// Transform from tendermint/rpc/grpc/types.proto
@file:ProtobufSyntax(syntax = "PROTO3")
@file:GeneratorVersion(version = "0.3.1")

package tendermint.rpc.grpc

import kotlin.ByteArray
import kotlin.String
import kotlin.Unit
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
import tendermint.abci.ResponseCheckTx
import tendermint.abci.ResponseDeliverTx

@Serializable(with = RequestPing.KotlinxSerializer::class)
@SerialName(value = RequestPing.TYPE_URL)
public class RequestPing() : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/tendermint.rpc.grpc.RequestPing"
  }

  public object KotlinxSerializer : KSerializer<RequestPing> {
    private val delegator: KSerializer<RequestPing> = RequestPing.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: RequestPing): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(RequestPingConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): RequestPing {
      if (decoder is ProtobufMapperDecoder) {
        return RequestPingConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = RequestBroadcastTx.KotlinxSerializer::class)
@SerialName(value = RequestBroadcastTx.TYPE_URL)
public data class RequestBroadcastTx(
  @ProtobufIndex(index = 1)
  public val tx: ByteArray,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/tendermint.rpc.grpc.RequestBroadcastTx"
  }

  public object KotlinxSerializer : KSerializer<RequestBroadcastTx> {
    private val delegator: KSerializer<RequestBroadcastTx> = RequestBroadcastTx.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: RequestBroadcastTx): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(RequestBroadcastTxConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): RequestBroadcastTx {
      if (decoder is ProtobufMapperDecoder) {
        return RequestBroadcastTxConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = ResponsePing.KotlinxSerializer::class)
@SerialName(value = ResponsePing.TYPE_URL)
public class ResponsePing() : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/tendermint.rpc.grpc.ResponsePing"
  }

  public object KotlinxSerializer : KSerializer<ResponsePing> {
    private val delegator: KSerializer<ResponsePing> = ResponsePing.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: ResponsePing): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(ResponsePingConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): ResponsePing {
      if (decoder is ProtobufMapperDecoder) {
        return ResponsePingConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = ResponseBroadcastTx.KotlinxSerializer::class)
@SerialName(value = ResponseBroadcastTx.TYPE_URL)
public data class ResponseBroadcastTx(
  @ProtobufIndex(index = 1)
  public val checkTx: ResponseCheckTx,
  @ProtobufIndex(index = 2)
  public val deliverTx: ResponseDeliverTx,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/tendermint.rpc.grpc.ResponseBroadcastTx"
  }

  public object KotlinxSerializer : KSerializer<ResponseBroadcastTx> {
    private val delegator: KSerializer<ResponseBroadcastTx> = ResponseBroadcastTx.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: ResponseBroadcastTx): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(ResponseBroadcastTxConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): ResponseBroadcastTx {
      if (decoder is ProtobufMapperDecoder) {
        return ResponseBroadcastTxConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}
