// Transform from injective/types/v1beta1/account.proto
@file:GeneratorVersion(version = "0.3.1")

package injective.types.v1beta1

import google.protobuf.Any
import java.lang.IllegalStateException
import kr.jadekim.protobuf.`annotation`.GeneratorVersion
import kr.jadekim.protobuf.converter.ProtobufConverter
import kr.jadekim.protobuf.converter.parseProtobuf

public expect object EthAccountConverter : ProtobufConverter<EthAccount>

public fun EthAccount.toAny(): Any = Any(EthAccount.TYPE_URL, with(EthAccountConverter) {
    toByteArray() })

public fun Any.parse(converter: ProtobufConverter<EthAccount>): EthAccount {
  if (typeUrl != EthAccount.TYPE_URL) throw IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}
