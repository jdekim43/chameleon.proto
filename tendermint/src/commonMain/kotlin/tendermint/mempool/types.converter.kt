// Transform from tendermint/mempool/types.proto
@file:GeneratorVersion(version = "0.3.1")

package tendermint.mempool

import google.protobuf.Any
import java.lang.IllegalStateException
import kr.jadekim.protobuf.`annotation`.GeneratorVersion
import kr.jadekim.protobuf.converter.ProtobufConverter
import kr.jadekim.protobuf.converter.parseProtobuf

public expect object TxsConverter : ProtobufConverter<Txs>

public fun Txs.toAny(): Any = Any(Txs.TYPE_URL, with(TxsConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<Txs>): Txs {
  if (typeUrl != Txs.TYPE_URL) throw IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object MessageConverter : ProtobufConverter<Message>

public fun Message.toAny(): Any = Any(Message.TYPE_URL, with(MessageConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<Message>): Message {
  if (typeUrl != Message.TYPE_URL) throw IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}
