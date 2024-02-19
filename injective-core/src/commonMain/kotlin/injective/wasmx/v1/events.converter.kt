// Transform from injective/wasmx/v1/events.proto
@file:GeneratorVersion(version = "0.3.1")

package injective.wasmx.v1

import google.protobuf.Any
import java.lang.IllegalStateException
import kr.jadekim.protobuf.`annotation`.GeneratorVersion
import kr.jadekim.protobuf.converter.ProtobufConverter
import kr.jadekim.protobuf.converter.parseProtobuf

public expect object EventContractExecutionConverter : ProtobufConverter<EventContractExecution>

public fun EventContractExecution.toAny(): Any = Any(EventContractExecution.TYPE_URL,
    with(EventContractExecutionConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<EventContractExecution>): EventContractExecution {
  if (typeUrl != EventContractExecution.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object EventContractRegisteredConverter : ProtobufConverter<EventContractRegistered>

public fun EventContractRegistered.toAny(): Any = Any(EventContractRegistered.TYPE_URL,
    with(EventContractRegisteredConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<EventContractRegistered>):
    EventContractRegistered {
  if (typeUrl != EventContractRegistered.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object EventContractDeregisteredConverter :
    ProtobufConverter<EventContractDeregistered>

public fun EventContractDeregistered.toAny(): Any = Any(EventContractDeregistered.TYPE_URL,
    with(EventContractDeregisteredConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<EventContractDeregistered>):
    EventContractDeregistered {
  if (typeUrl != EventContractDeregistered.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}
