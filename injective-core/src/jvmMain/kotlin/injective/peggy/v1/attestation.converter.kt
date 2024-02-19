// Transform from injective/peggy/v1/attestation.proto
@file:GeneratorVersion(version = "0.3.1")

package injective.peggy.v1

import kr.jadekim.protobuf.`annotation`.GeneratorVersion
import kr.jadekim.protobuf.converter.ProtobufConverter

public actual object AttestationConverter : ProtobufConverter<Attestation> by
    AttestationJvmConverter

public actual object ERC20TokenConverter : ProtobufConverter<ERC20Token> by ERC20TokenJvmConverter
