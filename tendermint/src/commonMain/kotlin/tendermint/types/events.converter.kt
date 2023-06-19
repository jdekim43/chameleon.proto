// Transform from tendermint/types/events.proto
@file:GeneratorVersion(version = "0.3.1")

package tendermint.types

import google.protobuf.Any
import java.lang.IllegalStateException
import kr.jadekim.protobuf.`annotation`.GeneratorVersion
import kr.jadekim.protobuf.converter.ProtobufConverter
import kr.jadekim.protobuf.converter.parseProtobuf

public expect object EventDataRoundStateConverter : ProtobufConverter<EventDataRoundState>

public fun EventDataRoundState.toAny(): Any = Any(EventDataRoundState.TYPE_URL,
    with(EventDataRoundStateConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<EventDataRoundState>): EventDataRoundState {
  if (typeUrl != EventDataRoundState.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}
