// Transform from tendermint/p2p/conn.proto
@file:GeneratorVersion(version = "0.3.1")

package tendermint.p2p

import com.google.protobuf.ByteString
import com.google.protobuf.Descriptors
import com.google.protobuf.Parser
import kr.jadekim.protobuf.`annotation`.GeneratorVersion
import kr.jadekim.protobuf.converter.mapper.ProtobufTypeMapper
import tendermint.crypto.PublicKeyJvmConverter

public object PacketPingJvmConverter : ProtobufTypeMapper<PacketPing, Conn.PacketPing> {
  public override val descriptor: Descriptors.Descriptor = Conn.PacketPing.getDescriptor()

  public override val parser: Parser<Conn.PacketPing> = Conn.PacketPing.parser()

  public override fun convert(obj: Conn.PacketPing): PacketPing = PacketPing(
  )

  public override fun convert(obj: PacketPing): Conn.PacketPing {
    val builder = Conn.PacketPing.newBuilder()
    return builder.build()
  }
}

public object PacketPongJvmConverter : ProtobufTypeMapper<PacketPong, Conn.PacketPong> {
  public override val descriptor: Descriptors.Descriptor = Conn.PacketPong.getDescriptor()

  public override val parser: Parser<Conn.PacketPong> = Conn.PacketPong.parser()

  public override fun convert(obj: Conn.PacketPong): PacketPong = PacketPong(
  )

  public override fun convert(obj: PacketPong): Conn.PacketPong {
    val builder = Conn.PacketPong.newBuilder()
    return builder.build()
  }
}

public object PacketMsgJvmConverter : ProtobufTypeMapper<PacketMsg, Conn.PacketMsg> {
  public override val descriptor: Descriptors.Descriptor = Conn.PacketMsg.getDescriptor()

  public override val parser: Parser<Conn.PacketMsg> = Conn.PacketMsg.parser()

  public override fun convert(obj: Conn.PacketMsg): PacketMsg = PacketMsg(
  	channelId = obj.getChannelId(),
  	eof = obj.getEof(),
  	`data` = obj.getData().toByteArray(),
  )

  public override fun convert(obj: PacketMsg): Conn.PacketMsg {
    val builder = Conn.PacketMsg.newBuilder()
    builder.setChannelId(obj.channelId)
    builder.setEof(obj.eof)
    builder.setData(ByteString.copyFrom(obj.`data`))
    return builder.build()
  }
}

public object PacketJvmConverter : ProtobufTypeMapper<Packet, Conn.Packet> {
  public override val descriptor: Descriptors.Descriptor = Conn.Packet.getDescriptor()

  public override val parser: Parser<Conn.Packet> = Conn.Packet.parser()

  public override fun convert(obj: Conn.Packet): Packet = Packet(
  	sum = mapOf(
  1 to { Packet.SumOneOf.PacketPing(PacketPingJvmConverter.convert(obj.getPacketPing())) },
  2 to { Packet.SumOneOf.PacketPong(PacketPongJvmConverter.convert(obj.getPacketPong())) },
  3 to { Packet.SumOneOf.PacketMsg(PacketMsgJvmConverter.convert(obj.getPacketMsg())) },
  ).getValue(obj.sumCase.number)(),
  )

  public override fun convert(obj: Packet): Conn.Packet {
    val builder = Conn.Packet.newBuilder()
    when (obj.sum) {
      is Packet.SumOneOf.PacketPing ->
          builder.setPacketPing(PacketPingJvmConverter.convert(obj.sum.value))
      is Packet.SumOneOf.PacketPong ->
          builder.setPacketPong(PacketPongJvmConverter.convert(obj.sum.value))
      is Packet.SumOneOf.PacketMsg ->
          builder.setPacketMsg(PacketMsgJvmConverter.convert(obj.sum.value))
    }
    return builder.build()
  }
}

public object AuthSigMessageJvmConverter : ProtobufTypeMapper<AuthSigMessage, Conn.AuthSigMessage> {
  public override val descriptor: Descriptors.Descriptor = Conn.AuthSigMessage.getDescriptor()

  public override val parser: Parser<Conn.AuthSigMessage> = Conn.AuthSigMessage.parser()

  public override fun convert(obj: Conn.AuthSigMessage): AuthSigMessage = AuthSigMessage(
  	pubKey = PublicKeyJvmConverter.convert(obj.getPubKey()),
  	sig = obj.getSig().toByteArray(),
  )

  public override fun convert(obj: AuthSigMessage): Conn.AuthSigMessage {
    val builder = Conn.AuthSigMessage.newBuilder()
    builder.setPubKey(PublicKeyJvmConverter.convert(obj.pubKey))
    builder.setSig(ByteString.copyFrom(obj.sig))
    return builder.build()
  }
}
