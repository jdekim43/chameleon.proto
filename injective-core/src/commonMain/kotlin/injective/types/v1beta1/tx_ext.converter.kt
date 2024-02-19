// Transform from injective/types/v1beta1/tx_ext.proto
@file:GeneratorVersion(version = "0.3.1")

package injective.types.v1beta1

import google.protobuf.Any
import java.lang.IllegalStateException
import kr.jadekim.protobuf.`annotation`.GeneratorVersion
import kr.jadekim.protobuf.converter.ProtobufConverter
import kr.jadekim.protobuf.converter.parseProtobuf

public expect object ExtensionOptionsWeb3TxConverter : ProtobufConverter<ExtensionOptionsWeb3Tx>

public fun ExtensionOptionsWeb3Tx.toAny(): Any = Any(ExtensionOptionsWeb3Tx.TYPE_URL,
    with(ExtensionOptionsWeb3TxConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<ExtensionOptionsWeb3Tx>): ExtensionOptionsWeb3Tx {
  if (typeUrl != ExtensionOptionsWeb3Tx.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}
