// Transform from injective/peggy/v1/pool.proto
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

@Serializable(with = IDSet.KotlinxSerializer::class)
@SerialName(value = IDSet.TYPE_URL)
public data class IDSet(
  @ProtobufIndex(index = 1)
  public val ids: List<ULong>,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/injective.peggy.v1.IDSet"
  }

  public object KotlinxSerializer : KSerializer<IDSet> {
    private val delegator: KSerializer<IDSet> = IDSet.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: IDSet): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(IDSetConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): IDSet {
      if (decoder is ProtobufMapperDecoder) {
        return IDSetConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = BatchFees.KotlinxSerializer::class)
@SerialName(value = BatchFees.TYPE_URL)
public data class BatchFees(
  @ProtobufIndex(index = 1)
  public val token: String,
  @ProtobufIndex(index = 2)
  public val totalFees: String,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/injective.peggy.v1.BatchFees"
  }

  public object KotlinxSerializer : KSerializer<BatchFees> {
    private val delegator: KSerializer<BatchFees> = BatchFees.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: BatchFees): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(BatchFeesConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): BatchFees {
      if (decoder is ProtobufMapperDecoder) {
        return BatchFeesConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}
