// Transform from tendermint/rpc/grpc/types.proto
@file:GeneratorVersion(version = "0.3.1")

package tendermint.rpc.grpc

import kr.jadekim.protobuf.`annotation`.GeneratorVersion
import kr.jadekim.protobuf.converter.ProtobufConverter

public actual object RequestPingConverter : ProtobufConverter<RequestPing> by
    RequestPingJvmConverter

public actual object RequestBroadcastTxConverter : ProtobufConverter<RequestBroadcastTx> by
    RequestBroadcastTxJvmConverter

public actual object ResponsePingConverter : ProtobufConverter<ResponsePing> by
    ResponsePingJvmConverter

public actual object ResponseBroadcastTxConverter : ProtobufConverter<ResponseBroadcastTx> by
    ResponseBroadcastTxJvmConverter
