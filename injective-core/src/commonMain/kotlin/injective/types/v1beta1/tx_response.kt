// Transform from injective/types/v1beta1/tx_response.proto
@file:ProtobufSyntax(syntax = "PROTO3")
@file:GeneratorVersion(version = "0.3.1")

package injective.types.v1beta1

import kotlin.ByteArray
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

@Serializable(with = TxResponseGenericMessage.KotlinxSerializer::class)
@SerialName(value = TxResponseGenericMessage.TYPE_URL)
public data class TxResponseGenericMessage(
  @ProtobufIndex(index = 1)
  public val `header`: String,
  @ProtobufIndex(index = 2)
  public val `data`: ByteArray,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/injective.types.v1beta1.TxResponseGenericMessage"
  }

  public object KotlinxSerializer : KSerializer<TxResponseGenericMessage> {
    private val delegator: KSerializer<TxResponseGenericMessage> =
        TxResponseGenericMessage.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: TxResponseGenericMessage): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(TxResponseGenericMessageConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): TxResponseGenericMessage {
      if (decoder is ProtobufMapperDecoder) {
        return TxResponseGenericMessageConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = TxResponseData.KotlinxSerializer::class)
@SerialName(value = TxResponseData.TYPE_URL)
public data class TxResponseData(
  @ProtobufIndex(index = 1)
  public val messages: List<TxResponseGenericMessage>,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/injective.types.v1beta1.TxResponseData"
  }

  public object KotlinxSerializer : KSerializer<TxResponseData> {
    private val delegator: KSerializer<TxResponseData> = TxResponseData.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: TxResponseData): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(TxResponseDataConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): TxResponseData {
      if (decoder is ProtobufMapperDecoder) {
        return TxResponseDataConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}
