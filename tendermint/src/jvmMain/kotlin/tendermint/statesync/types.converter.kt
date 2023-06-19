// Transform from tendermint/statesync/types.proto
@file:GeneratorVersion(version = "0.3.1")

package tendermint.statesync

import kr.jadekim.protobuf.`annotation`.GeneratorVersion
import kr.jadekim.protobuf.converter.ProtobufConverter

public actual object MessageConverter : ProtobufConverter<Message> by MessageJvmConverter

public actual object SnapshotsRequestConverter : ProtobufConverter<SnapshotsRequest> by
    SnapshotsRequestJvmConverter

public actual object SnapshotsResponseConverter : ProtobufConverter<SnapshotsResponse> by
    SnapshotsResponseJvmConverter

public actual object ChunkRequestConverter : ProtobufConverter<ChunkRequest> by
    ChunkRequestJvmConverter

public actual object ChunkResponseConverter : ProtobufConverter<ChunkResponse> by
    ChunkResponseJvmConverter
