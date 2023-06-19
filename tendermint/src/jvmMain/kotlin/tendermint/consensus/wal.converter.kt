// Transform from tendermint/consensus/wal.proto
@file:GeneratorVersion(version = "0.3.1")

package tendermint.consensus

import kr.jadekim.protobuf.`annotation`.GeneratorVersion
import kr.jadekim.protobuf.converter.ProtobufConverter

public actual object MsgInfoConverter : ProtobufConverter<MsgInfo> by MsgInfoJvmConverter

public actual object TimeoutInfoConverter : ProtobufConverter<TimeoutInfo> by
    TimeoutInfoJvmConverter

public actual object EndHeightConverter : ProtobufConverter<EndHeight> by EndHeightJvmConverter

public actual object WALMessageConverter : ProtobufConverter<WALMessage> by WALMessageJvmConverter

public actual object TimedWALMessageConverter : ProtobufConverter<TimedWALMessage> by
    TimedWALMessageJvmConverter
