// Transform from tendermint/rpc/grpc/types.proto
@file:GeneratorVersion(version = "0.3.1")

package tendermint.rpc.grpc

import google.protobuf.Any
import java.lang.IllegalStateException
import kr.jadekim.protobuf.`annotation`.GeneratorVersion
import kr.jadekim.protobuf.converter.ProtobufConverter
import kr.jadekim.protobuf.converter.parseProtobuf

public expect object RequestPingConverter : ProtobufConverter<RequestPing>

public fun RequestPing.toAny(): Any = Any(RequestPing.TYPE_URL, with(RequestPingConverter) {
    toByteArray() })

public fun Any.parse(converter: ProtobufConverter<RequestPing>): RequestPing {
  if (typeUrl != RequestPing.TYPE_URL) throw IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object RequestBroadcastTxConverter : ProtobufConverter<RequestBroadcastTx>

public fun RequestBroadcastTx.toAny(): Any = Any(RequestBroadcastTx.TYPE_URL,
    with(RequestBroadcastTxConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<RequestBroadcastTx>): RequestBroadcastTx {
  if (typeUrl != RequestBroadcastTx.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object ResponsePingConverter : ProtobufConverter<ResponsePing>

public fun ResponsePing.toAny(): Any = Any(ResponsePing.TYPE_URL, with(ResponsePingConverter) {
    toByteArray() })

public fun Any.parse(converter: ProtobufConverter<ResponsePing>): ResponsePing {
  if (typeUrl != ResponsePing.TYPE_URL) throw IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object ResponseBroadcastTxConverter : ProtobufConverter<ResponseBroadcastTx>

public fun ResponseBroadcastTx.toAny(): Any = Any(ResponseBroadcastTx.TYPE_URL,
    with(ResponseBroadcastTxConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<ResponseBroadcastTx>): ResponseBroadcastTx {
  if (typeUrl != ResponseBroadcastTx.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}
