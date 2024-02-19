// Transform from injective/types/v1beta1/tx_ext.proto
@file:ProtobufSyntax(syntax = "PROTO3")
@file:GeneratorVersion(version = "0.3.1")

package injective.types.v1beta1

import kotlin.ByteArray
import kotlin.String
import kotlin.ULong
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

@Serializable(with = ExtensionOptionsWeb3Tx.KotlinxSerializer::class)
@SerialName(value = ExtensionOptionsWeb3Tx.TYPE_URL)
public data class ExtensionOptionsWeb3Tx(
  @ProtobufIndex(index = 1)
  public val typedDataChainID: ULong,
  @ProtobufIndex(index = 2)
  public val feePayer: String,
  @ProtobufIndex(index = 3)
  public val feePayerSig: ByteArray,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/injective.types.v1beta1.ExtensionOptionsWeb3Tx"
  }

  public object KotlinxSerializer : KSerializer<ExtensionOptionsWeb3Tx> {
    private val delegator: KSerializer<ExtensionOptionsWeb3Tx> = ExtensionOptionsWeb3Tx.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: ExtensionOptionsWeb3Tx): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(ExtensionOptionsWeb3TxConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): ExtensionOptionsWeb3Tx {
      if (decoder is ProtobufMapperDecoder) {
        return ExtensionOptionsWeb3TxConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}
