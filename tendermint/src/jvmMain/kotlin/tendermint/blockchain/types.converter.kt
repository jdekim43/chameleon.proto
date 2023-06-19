// Transform from tendermint/blockchain/types.proto
@file:GeneratorVersion(version = "0.3.1")

package tendermint.blockchain

import kr.jadekim.protobuf.`annotation`.GeneratorVersion
import kr.jadekim.protobuf.converter.ProtobufConverter

public actual object BlockRequestConverter : ProtobufConverter<BlockRequest> by
    BlockRequestJvmConverter

public actual object NoBlockResponseConverter : ProtobufConverter<NoBlockResponse> by
    NoBlockResponseJvmConverter

public actual object BlockResponseConverter : ProtobufConverter<BlockResponse> by
    BlockResponseJvmConverter

public actual object StatusRequestConverter : ProtobufConverter<StatusRequest> by
    StatusRequestJvmConverter

public actual object StatusResponseConverter : ProtobufConverter<StatusResponse> by
    StatusResponseJvmConverter

public actual object MessageConverter : ProtobufConverter<Message> by MessageJvmConverter
