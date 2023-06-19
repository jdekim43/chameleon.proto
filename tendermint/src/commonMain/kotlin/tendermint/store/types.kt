// Transform from tendermint/store/types.proto
@file:ProtobufSyntax(syntax = "PROTO3")
@file:GeneratorVersion(version = "0.3.1")

package tendermint.store

import kotlin.Long
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

@Serializable(with = BlockStoreState.KotlinxSerializer::class)
@SerialName(value = BlockStoreState.TYPE_URL)
public data class BlockStoreState(
  @ProtobufIndex(index = 1)
  public val base: Long,
  @ProtobufIndex(index = 2)
  public val height: Long,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/tendermint.store.BlockStoreState"
  }

  public object KotlinxSerializer : KSerializer<BlockStoreState> {
    private val delegator: KSerializer<BlockStoreState> = BlockStoreState.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: BlockStoreState): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(BlockStoreStateConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): BlockStoreState {
      if (decoder is ProtobufMapperDecoder) {
        return BlockStoreStateConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}
