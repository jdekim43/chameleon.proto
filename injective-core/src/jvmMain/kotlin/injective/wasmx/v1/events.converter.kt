// Transform from injective/wasmx/v1/events.proto
@file:GeneratorVersion(version = "0.3.1")

package injective.wasmx.v1

import kr.jadekim.protobuf.`annotation`.GeneratorVersion
import kr.jadekim.protobuf.converter.ProtobufConverter

public actual object EventContractExecutionConverter : ProtobufConverter<EventContractExecution> by
    EventContractExecutionJvmConverter

public actual object EventContractRegisteredConverter : ProtobufConverter<EventContractRegistered>
    by EventContractRegisteredJvmConverter

public actual object EventContractDeregisteredConverter :
    ProtobufConverter<EventContractDeregistered> by EventContractDeregisteredJvmConverter
