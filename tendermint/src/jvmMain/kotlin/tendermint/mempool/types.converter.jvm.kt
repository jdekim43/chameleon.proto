// Transform from tendermint/mempool/types.proto
@file:GeneratorVersion(version = "0.3.1")

package tendermint.mempool

import com.google.protobuf.ByteString
import com.google.protobuf.Descriptors
import com.google.protobuf.Parser
import kr.jadekim.protobuf.`annotation`.GeneratorVersion
import kr.jadekim.protobuf.converter.mapper.ProtobufTypeMapper

public object TxsJvmConverter : ProtobufTypeMapper<Txs, Types.Txs> {
  public override val descriptor: Descriptors.Descriptor = Types.Txs.getDescriptor()

  public override val parser: Parser<Types.Txs> = Types.Txs.parser()

  public override fun convert(obj: Types.Txs): Txs = Txs(
  	txs = obj.getTxsList().map { it.toByteArray() },
  )

  public override fun convert(obj: Txs): Types.Txs {
    val builder = Types.Txs.newBuilder()
    builder.addAllTxs(obj.txs.map { ByteString.copyFrom(it) })
    return builder.build()
  }
}

public object MessageJvmConverter : ProtobufTypeMapper<Message, Types.Message> {
  public override val descriptor: Descriptors.Descriptor = Types.Message.getDescriptor()

  public override val parser: Parser<Types.Message> = Types.Message.parser()

  public override fun convert(obj: Types.Message): Message = Message(
  	sum = mapOf(
  1 to { Message.SumOneOf.Txs(TxsJvmConverter.convert(obj.getTxs())) },
  ).getValue(obj.sumCase.number)(),
  )

  public override fun convert(obj: Message): Types.Message {
    val builder = Types.Message.newBuilder()
    when (obj.sum) {
      is Message.SumOneOf.Txs -> builder.setTxs(TxsJvmConverter.convert(obj.sum.value))
    }
    return builder.build()
  }
}
