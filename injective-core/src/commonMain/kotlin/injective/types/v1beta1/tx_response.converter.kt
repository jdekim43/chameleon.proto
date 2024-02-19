// Transform from injective/types/v1beta1/tx_response.proto
@file:GeneratorVersion(version = "0.3.1")

package injective.types.v1beta1

import google.protobuf.Any
import java.lang.IllegalStateException
import kr.jadekim.protobuf.`annotation`.GeneratorVersion
import kr.jadekim.protobuf.converter.ProtobufConverter
import kr.jadekim.protobuf.converter.parseProtobuf

public expect object TxResponseGenericMessageConverter : ProtobufConverter<TxResponseGenericMessage>

public fun TxResponseGenericMessage.toAny(): Any = Any(TxResponseGenericMessage.TYPE_URL,
    with(TxResponseGenericMessageConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<TxResponseGenericMessage>):
    TxResponseGenericMessage {
  if (typeUrl != TxResponseGenericMessage.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object TxResponseDataConverter : ProtobufConverter<TxResponseData>

public fun TxResponseData.toAny(): Any = Any(TxResponseData.TYPE_URL, with(TxResponseDataConverter)
    { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<TxResponseData>): TxResponseData {
  if (typeUrl != TxResponseData.TYPE_URL) throw IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}
