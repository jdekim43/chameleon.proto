// Transform from injective/peggy/v1/batch.proto
@file:GeneratorVersion(version = "0.3.1")

package injective.peggy.v1

import google.protobuf.Any
import java.lang.IllegalStateException
import kr.jadekim.protobuf.`annotation`.GeneratorVersion
import kr.jadekim.protobuf.converter.ProtobufConverter
import kr.jadekim.protobuf.converter.parseProtobuf

public expect object OutgoingTxBatchConverter : ProtobufConverter<OutgoingTxBatch>

public fun OutgoingTxBatch.toAny(): Any = Any(OutgoingTxBatch.TYPE_URL,
    with(OutgoingTxBatchConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<OutgoingTxBatch>): OutgoingTxBatch {
  if (typeUrl != OutgoingTxBatch.TYPE_URL) throw IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object OutgoingTransferTxConverter : ProtobufConverter<OutgoingTransferTx>

public fun OutgoingTransferTx.toAny(): Any = Any(OutgoingTransferTx.TYPE_URL,
    with(OutgoingTransferTxConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<OutgoingTransferTx>): OutgoingTransferTx {
  if (typeUrl != OutgoingTransferTx.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}
