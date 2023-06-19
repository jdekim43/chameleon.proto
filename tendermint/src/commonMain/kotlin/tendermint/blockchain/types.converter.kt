// Transform from tendermint/blockchain/types.proto
@file:GeneratorVersion(version = "0.3.1")

package tendermint.blockchain

import google.protobuf.Any
import java.lang.IllegalStateException
import kr.jadekim.protobuf.`annotation`.GeneratorVersion
import kr.jadekim.protobuf.converter.ProtobufConverter
import kr.jadekim.protobuf.converter.parseProtobuf

public expect object BlockRequestConverter : ProtobufConverter<BlockRequest>

public fun BlockRequest.toAny(): Any = Any(BlockRequest.TYPE_URL, with(BlockRequestConverter) {
    toByteArray() })

public fun Any.parse(converter: ProtobufConverter<BlockRequest>): BlockRequest {
  if (typeUrl != BlockRequest.TYPE_URL) throw IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object NoBlockResponseConverter : ProtobufConverter<NoBlockResponse>

public fun NoBlockResponse.toAny(): Any = Any(NoBlockResponse.TYPE_URL,
    with(NoBlockResponseConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<NoBlockResponse>): NoBlockResponse {
  if (typeUrl != NoBlockResponse.TYPE_URL) throw IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object BlockResponseConverter : ProtobufConverter<BlockResponse>

public fun BlockResponse.toAny(): Any = Any(BlockResponse.TYPE_URL, with(BlockResponseConverter) {
    toByteArray() })

public fun Any.parse(converter: ProtobufConverter<BlockResponse>): BlockResponse {
  if (typeUrl != BlockResponse.TYPE_URL) throw IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object StatusRequestConverter : ProtobufConverter<StatusRequest>

public fun StatusRequest.toAny(): Any = Any(StatusRequest.TYPE_URL, with(StatusRequestConverter) {
    toByteArray() })

public fun Any.parse(converter: ProtobufConverter<StatusRequest>): StatusRequest {
  if (typeUrl != StatusRequest.TYPE_URL) throw IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object StatusResponseConverter : ProtobufConverter<StatusResponse>

public fun StatusResponse.toAny(): Any = Any(StatusResponse.TYPE_URL, with(StatusResponseConverter)
    { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<StatusResponse>): StatusResponse {
  if (typeUrl != StatusResponse.TYPE_URL) throw IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object MessageConverter : ProtobufConverter<Message>

public fun Message.toAny(): Any = Any(Message.TYPE_URL, with(MessageConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<Message>): Message {
  if (typeUrl != Message.TYPE_URL) throw IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}
