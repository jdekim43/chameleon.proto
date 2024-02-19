// Transform from injective/types/v1beta1/tx_ext.proto
@file:GeneratorVersion(version = "0.3.1")

package injective.types.v1beta1

import kr.jadekim.protobuf.`annotation`.GeneratorVersion
import kr.jadekim.protobuf.converter.ProtobufConverter

public actual object ExtensionOptionsWeb3TxConverter : ProtobufConverter<ExtensionOptionsWeb3Tx> by
    ExtensionOptionsWeb3TxJvmConverter
