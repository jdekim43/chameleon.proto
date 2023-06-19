// Transform from tendermint/consensus/wal.proto
@file:GeneratorVersion(version = "0.3.1")

package tendermint.consensus

import google.protobuf.Any
import java.lang.IllegalStateException
import kr.jadekim.protobuf.`annotation`.GeneratorVersion
import kr.jadekim.protobuf.converter.ProtobufConverter
import kr.jadekim.protobuf.converter.parseProtobuf

public expect object MsgInfoConverter : ProtobufConverter<MsgInfo>

public fun MsgInfo.toAny(): Any = Any(MsgInfo.TYPE_URL, with(MsgInfoConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<MsgInfo>): MsgInfo {
  if (typeUrl != MsgInfo.TYPE_URL) throw IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object TimeoutInfoConverter : ProtobufConverter<TimeoutInfo>

public fun TimeoutInfo.toAny(): Any = Any(TimeoutInfo.TYPE_URL, with(TimeoutInfoConverter) {
    toByteArray() })

public fun Any.parse(converter: ProtobufConverter<TimeoutInfo>): TimeoutInfo {
  if (typeUrl != TimeoutInfo.TYPE_URL) throw IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object EndHeightConverter : ProtobufConverter<EndHeight>

public fun EndHeight.toAny(): Any = Any(EndHeight.TYPE_URL, with(EndHeightConverter) { toByteArray()
    })

public fun Any.parse(converter: ProtobufConverter<EndHeight>): EndHeight {
  if (typeUrl != EndHeight.TYPE_URL) throw IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object WALMessageConverter : ProtobufConverter<WALMessage>

public fun WALMessage.toAny(): Any = Any(WALMessage.TYPE_URL, with(WALMessageConverter) {
    toByteArray() })

public fun Any.parse(converter: ProtobufConverter<WALMessage>): WALMessage {
  if (typeUrl != WALMessage.TYPE_URL) throw IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object TimedWALMessageConverter : ProtobufConverter<TimedWALMessage>

public fun TimedWALMessage.toAny(): Any = Any(TimedWALMessage.TYPE_URL,
    with(TimedWALMessageConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<TimedWALMessage>): TimedWALMessage {
  if (typeUrl != TimedWALMessage.TYPE_URL) throw IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}
