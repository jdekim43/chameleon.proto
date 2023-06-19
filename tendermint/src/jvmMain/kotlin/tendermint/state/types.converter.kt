// Transform from tendermint/state/types.proto
@file:GeneratorVersion(version = "0.3.1")

package tendermint.state

import kr.jadekim.protobuf.`annotation`.GeneratorVersion
import kr.jadekim.protobuf.converter.ProtobufConverter

public actual object ABCIResponsesConverter : ProtobufConverter<ABCIResponses> by
    ABCIResponsesJvmConverter

public actual object ValidatorsInfoConverter : ProtobufConverter<ValidatorsInfo> by
    ValidatorsInfoJvmConverter

public actual object ConsensusParamsInfoConverter : ProtobufConverter<ConsensusParamsInfo> by
    ConsensusParamsInfoJvmConverter

public actual object ABCIResponsesInfoConverter : ProtobufConverter<ABCIResponsesInfo> by
    ABCIResponsesInfoJvmConverter

public actual object VersionConverter : ProtobufConverter<Version> by VersionJvmConverter

public actual object StateConverter : ProtobufConverter<State> by StateJvmConverter
