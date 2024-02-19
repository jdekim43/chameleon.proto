// Transform from injective/types/v1beta1/tx_response.proto
@file:GeneratorVersion(version = "0.3.1")

package injective.types.v1beta1

import kr.jadekim.protobuf.`annotation`.GeneratorVersion
import kr.jadekim.protobuf.converter.ProtobufConverter

public actual object TxResponseGenericMessageConverter : ProtobufConverter<TxResponseGenericMessage>
    by TxResponseGenericMessageJvmConverter

public actual object TxResponseDataConverter : ProtobufConverter<TxResponseData> by
    TxResponseDataJvmConverter
