// Transform from tendermint/p2p/conn.proto
@file:GeneratorVersion(version = "0.3.1")

package tendermint.p2p

import google.protobuf.Any
import java.lang.IllegalStateException
import kr.jadekim.protobuf.`annotation`.GeneratorVersion
import kr.jadekim.protobuf.converter.ProtobufConverter
import kr.jadekim.protobuf.converter.parseProtobuf

public expect object PacketPingConverter : ProtobufConverter<PacketPing>

public fun PacketPing.toAny(): Any = Any(PacketPing.TYPE_URL, with(PacketPingConverter) {
    toByteArray() })

public fun Any.parse(converter: ProtobufConverter<PacketPing>): PacketPing {
  if (typeUrl != PacketPing.TYPE_URL) throw IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object PacketPongConverter : ProtobufConverter<PacketPong>

public fun PacketPong.toAny(): Any = Any(PacketPong.TYPE_URL, with(PacketPongConverter) {
    toByteArray() })

public fun Any.parse(converter: ProtobufConverter<PacketPong>): PacketPong {
  if (typeUrl != PacketPong.TYPE_URL) throw IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object PacketMsgConverter : ProtobufConverter<PacketMsg>

public fun PacketMsg.toAny(): Any = Any(PacketMsg.TYPE_URL, with(PacketMsgConverter) { toByteArray()
    })

public fun Any.parse(converter: ProtobufConverter<PacketMsg>): PacketMsg {
  if (typeUrl != PacketMsg.TYPE_URL) throw IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object PacketConverter : ProtobufConverter<Packet>

public fun Packet.toAny(): Any = Any(Packet.TYPE_URL, with(PacketConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<Packet>): Packet {
  if (typeUrl != Packet.TYPE_URL) throw IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object AuthSigMessageConverter : ProtobufConverter<AuthSigMessage>

public fun AuthSigMessage.toAny(): Any = Any(AuthSigMessage.TYPE_URL, with(AuthSigMessageConverter)
    { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<AuthSigMessage>): AuthSigMessage {
  if (typeUrl != AuthSigMessage.TYPE_URL) throw IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}
