// Transform from tendermint/p2p/pex.proto
@file:GeneratorVersion(version = "0.3.1")

package tendermint.p2p

import google.protobuf.Any
import java.lang.IllegalStateException
import kr.jadekim.protobuf.`annotation`.GeneratorVersion
import kr.jadekim.protobuf.converter.ProtobufConverter
import kr.jadekim.protobuf.converter.parseProtobuf

public expect object PexRequestConverter : ProtobufConverter<PexRequest>

public fun PexRequest.toAny(): Any = Any(PexRequest.TYPE_URL, with(PexRequestConverter) {
    toByteArray() })

public fun Any.parse(converter: ProtobufConverter<PexRequest>): PexRequest {
  if (typeUrl != PexRequest.TYPE_URL) throw IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object PexAddrsConverter : ProtobufConverter<PexAddrs>

public fun PexAddrs.toAny(): Any = Any(PexAddrs.TYPE_URL, with(PexAddrsConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<PexAddrs>): PexAddrs {
  if (typeUrl != PexAddrs.TYPE_URL) throw IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object MessageConverter : ProtobufConverter<Message>

public fun Message.toAny(): Any = Any(Message.TYPE_URL, with(MessageConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<Message>): Message {
  if (typeUrl != Message.TYPE_URL) throw IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}
