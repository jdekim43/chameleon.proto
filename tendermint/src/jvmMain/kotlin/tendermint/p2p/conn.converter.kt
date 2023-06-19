// Transform from tendermint/p2p/conn.proto
@file:GeneratorVersion(version = "0.3.1")

package tendermint.p2p

import kr.jadekim.protobuf.`annotation`.GeneratorVersion
import kr.jadekim.protobuf.converter.ProtobufConverter

public actual object PacketPingConverter : ProtobufConverter<PacketPing> by PacketPingJvmConverter

public actual object PacketPongConverter : ProtobufConverter<PacketPong> by PacketPongJvmConverter

public actual object PacketMsgConverter : ProtobufConverter<PacketMsg> by PacketMsgJvmConverter

public actual object PacketConverter : ProtobufConverter<Packet> by PacketJvmConverter

public actual object AuthSigMessageConverter : ProtobufConverter<AuthSigMessage> by
    AuthSigMessageJvmConverter
