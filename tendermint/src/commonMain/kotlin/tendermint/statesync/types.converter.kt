// Transform from tendermint/statesync/types.proto
@file:GeneratorVersion(version = "0.3.1")

package tendermint.statesync

import google.protobuf.Any
import java.lang.IllegalStateException
import kr.jadekim.protobuf.`annotation`.GeneratorVersion
import kr.jadekim.protobuf.converter.ProtobufConverter
import kr.jadekim.protobuf.converter.parseProtobuf

public expect object MessageConverter : ProtobufConverter<Message>

public fun Message.toAny(): Any = Any(Message.TYPE_URL, with(MessageConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<Message>): Message {
  if (typeUrl != Message.TYPE_URL) throw IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object SnapshotsRequestConverter : ProtobufConverter<SnapshotsRequest>

public fun SnapshotsRequest.toAny(): Any = Any(SnapshotsRequest.TYPE_URL,
    with(SnapshotsRequestConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<SnapshotsRequest>): SnapshotsRequest {
  if (typeUrl != SnapshotsRequest.TYPE_URL) throw IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object SnapshotsResponseConverter : ProtobufConverter<SnapshotsResponse>

public fun SnapshotsResponse.toAny(): Any = Any(SnapshotsResponse.TYPE_URL,
    with(SnapshotsResponseConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<SnapshotsResponse>): SnapshotsResponse {
  if (typeUrl != SnapshotsResponse.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object ChunkRequestConverter : ProtobufConverter<ChunkRequest>

public fun ChunkRequest.toAny(): Any = Any(ChunkRequest.TYPE_URL, with(ChunkRequestConverter) {
    toByteArray() })

public fun Any.parse(converter: ProtobufConverter<ChunkRequest>): ChunkRequest {
  if (typeUrl != ChunkRequest.TYPE_URL) throw IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object ChunkResponseConverter : ProtobufConverter<ChunkResponse>

public fun ChunkResponse.toAny(): Any = Any(ChunkResponse.TYPE_URL, with(ChunkResponseConverter) {
    toByteArray() })

public fun Any.parse(converter: ProtobufConverter<ChunkResponse>): ChunkResponse {
  if (typeUrl != ChunkResponse.TYPE_URL) throw IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}
