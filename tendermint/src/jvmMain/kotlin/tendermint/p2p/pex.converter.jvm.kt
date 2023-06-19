// Transform from tendermint/p2p/pex.proto
@file:GeneratorVersion(version = "0.3.1")

package tendermint.p2p

import com.google.protobuf.Descriptors
import com.google.protobuf.Parser
import kr.jadekim.protobuf.`annotation`.GeneratorVersion
import kr.jadekim.protobuf.converter.mapper.ProtobufTypeMapper

public object PexRequestJvmConverter : ProtobufTypeMapper<PexRequest, Pex.PexRequest> {
  public override val descriptor: Descriptors.Descriptor = Pex.PexRequest.getDescriptor()

  public override val parser: Parser<Pex.PexRequest> = Pex.PexRequest.parser()

  public override fun convert(obj: Pex.PexRequest): PexRequest = PexRequest(
  )

  public override fun convert(obj: PexRequest): Pex.PexRequest {
    val builder = Pex.PexRequest.newBuilder()
    return builder.build()
  }
}

public object PexAddrsJvmConverter : ProtobufTypeMapper<PexAddrs, Pex.PexAddrs> {
  public override val descriptor: Descriptors.Descriptor = Pex.PexAddrs.getDescriptor()

  public override val parser: Parser<Pex.PexAddrs> = Pex.PexAddrs.parser()

  public override fun convert(obj: Pex.PexAddrs): PexAddrs = PexAddrs(
  	addrs = obj.getAddrsList().map { NetAddressJvmConverter.convert(it) },
  )

  public override fun convert(obj: PexAddrs): Pex.PexAddrs {
    val builder = Pex.PexAddrs.newBuilder()
    builder.addAllAddrs(obj.addrs.map { NetAddressJvmConverter.convert(it) })
    return builder.build()
  }
}

public object MessageJvmConverter : ProtobufTypeMapper<Message, Pex.Message> {
  public override val descriptor: Descriptors.Descriptor = Pex.Message.getDescriptor()

  public override val parser: Parser<Pex.Message> = Pex.Message.parser()

  public override fun convert(obj: Pex.Message): Message = Message(
  	sum = mapOf(
  1 to { Message.SumOneOf.PexRequest(PexRequestJvmConverter.convert(obj.getPexRequest())) },
  2 to { Message.SumOneOf.PexAddrs(PexAddrsJvmConverter.convert(obj.getPexAddrs())) },
  ).getValue(obj.sumCase.number)(),
  )

  public override fun convert(obj: Message): Pex.Message {
    val builder = Pex.Message.newBuilder()
    when (obj.sum) {
      is Message.SumOneOf.PexRequest ->
          builder.setPexRequest(PexRequestJvmConverter.convert(obj.sum.value))
      is Message.SumOneOf.PexAddrs ->
          builder.setPexAddrs(PexAddrsJvmConverter.convert(obj.sum.value))
    }
    return builder.build()
  }
}
