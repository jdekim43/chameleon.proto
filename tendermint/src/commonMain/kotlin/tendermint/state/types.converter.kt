// Transform from tendermint/state/types.proto
@file:GeneratorVersion(version = "0.3.1")

package tendermint.state

import google.protobuf.Any
import java.lang.IllegalStateException
import kr.jadekim.protobuf.`annotation`.GeneratorVersion
import kr.jadekim.protobuf.converter.ProtobufConverter
import kr.jadekim.protobuf.converter.parseProtobuf

public expect object ABCIResponsesConverter : ProtobufConverter<ABCIResponses>

public fun ABCIResponses.toAny(): Any = Any(ABCIResponses.TYPE_URL, with(ABCIResponsesConverter) {
    toByteArray() })

public fun Any.parse(converter: ProtobufConverter<ABCIResponses>): ABCIResponses {
  if (typeUrl != ABCIResponses.TYPE_URL) throw IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object ValidatorsInfoConverter : ProtobufConverter<ValidatorsInfo>

public fun ValidatorsInfo.toAny(): Any = Any(ValidatorsInfo.TYPE_URL, with(ValidatorsInfoConverter)
    { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<ValidatorsInfo>): ValidatorsInfo {
  if (typeUrl != ValidatorsInfo.TYPE_URL) throw IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object ConsensusParamsInfoConverter : ProtobufConverter<ConsensusParamsInfo>

public fun ConsensusParamsInfo.toAny(): Any = Any(ConsensusParamsInfo.TYPE_URL,
    with(ConsensusParamsInfoConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<ConsensusParamsInfo>): ConsensusParamsInfo {
  if (typeUrl != ConsensusParamsInfo.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object ABCIResponsesInfoConverter : ProtobufConverter<ABCIResponsesInfo>

public fun ABCIResponsesInfo.toAny(): Any = Any(ABCIResponsesInfo.TYPE_URL,
    with(ABCIResponsesInfoConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<ABCIResponsesInfo>): ABCIResponsesInfo {
  if (typeUrl != ABCIResponsesInfo.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object VersionConverter : ProtobufConverter<Version>

public fun Version.toAny(): Any = Any(Version.TYPE_URL, with(VersionConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<Version>): Version {
  if (typeUrl != Version.TYPE_URL) throw IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object StateConverter : ProtobufConverter<State>

public fun State.toAny(): Any = Any(State.TYPE_URL, with(StateConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<State>): State {
  if (typeUrl != State.TYPE_URL) throw IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}
