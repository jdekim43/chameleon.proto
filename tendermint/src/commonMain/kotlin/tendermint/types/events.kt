// Transform from tendermint/types/events.proto
@file:ProtobufSyntax(syntax = "PROTO3")
@file:GeneratorVersion(version = "0.3.1")

package tendermint.types

import kotlin.Int
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

@Serializable(with = EventDataRoundState.KotlinxSerializer::class)
@SerialName(value = EventDataRoundState.TYPE_URL)
public data class EventDataRoundState(
  @ProtobufIndex(index = 1)
  public val height: Long,
  @ProtobufIndex(index = 2)
  public val round: Int,
  @ProtobufIndex(index = 3)
  public val step: String,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/tendermint.types.EventDataRoundState"
  }

  public object KotlinxSerializer : KSerializer<EventDataRoundState> {
    private val delegator: KSerializer<EventDataRoundState> = EventDataRoundState.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: EventDataRoundState): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(EventDataRoundStateConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): EventDataRoundState {
      if (decoder is ProtobufMapperDecoder) {
        return EventDataRoundStateConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}
