// Transform from injective/peggy/v1/attestation.proto
@file:GeneratorVersion(version = "0.3.1")

package injective.peggy.v1

import google.protobuf.Any
import java.lang.IllegalStateException
import kr.jadekim.protobuf.`annotation`.GeneratorVersion
import kr.jadekim.protobuf.converter.ProtobufConverter
import kr.jadekim.protobuf.converter.parseProtobuf

public expect object AttestationConverter : ProtobufConverter<Attestation>

public fun Attestation.toAny(): Any = Any(Attestation.TYPE_URL, with(AttestationConverter) {
    toByteArray() })

public fun Any.parse(converter: ProtobufConverter<Attestation>): Attestation {
  if (typeUrl != Attestation.TYPE_URL) throw IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object ERC20TokenConverter : ProtobufConverter<ERC20Token>

public fun ERC20Token.toAny(): Any = Any(ERC20Token.TYPE_URL, with(ERC20TokenConverter) {
    toByteArray() })

public fun Any.parse(converter: ProtobufConverter<ERC20Token>): ERC20Token {
  if (typeUrl != ERC20Token.TYPE_URL) throw IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}
