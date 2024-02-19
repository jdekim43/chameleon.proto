// Transform from injective/peggy/v1/batch.proto
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

@Serializable(with = OutgoingTxBatch.KotlinxSerializer::class)
@SerialName(value = OutgoingTxBatch.TYPE_URL)
public data class OutgoingTxBatch(
  @ProtobufIndex(index = 1)
  public val batchNonce: ULong,
  @ProtobufIndex(index = 2)
  public val batchTimeout: ULong,
  @ProtobufIndex(index = 3)
  public val transactions: List<OutgoingTransferTx>,
  @ProtobufIndex(index = 4)
  public val tokenContract: String,
  @ProtobufIndex(index = 5)
  public val block: ULong,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/injective.peggy.v1.OutgoingTxBatch"
  }

  public object KotlinxSerializer : KSerializer<OutgoingTxBatch> {
    private val delegator: KSerializer<OutgoingTxBatch> = OutgoingTxBatch.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: OutgoingTxBatch): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(OutgoingTxBatchConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): OutgoingTxBatch {
      if (decoder is ProtobufMapperDecoder) {
        return OutgoingTxBatchConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = OutgoingTransferTx.KotlinxSerializer::class)
@SerialName(value = OutgoingTransferTx.TYPE_URL)
public data class OutgoingTransferTx(
  @ProtobufIndex(index = 1)
  public val id: ULong,
  @ProtobufIndex(index = 2)
  public val sender: String,
  @ProtobufIndex(index = 3)
  public val destAddress: String,
  @ProtobufIndex(index = 4)
  public val erc20Token: ERC20Token,
  @ProtobufIndex(index = 5)
  public val erc20Fee: ERC20Token,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/injective.peggy.v1.OutgoingTransferTx"
  }

  public object KotlinxSerializer : KSerializer<OutgoingTransferTx> {
    private val delegator: KSerializer<OutgoingTransferTx> = OutgoingTransferTx.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: OutgoingTransferTx): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(OutgoingTransferTxConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): OutgoingTransferTx {
      if (decoder is ProtobufMapperDecoder) {
        return OutgoingTransferTxConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}
