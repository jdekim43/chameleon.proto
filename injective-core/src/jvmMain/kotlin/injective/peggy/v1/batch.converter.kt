// Transform from injective/peggy/v1/batch.proto
@file:GeneratorVersion(version = "0.3.1")

package injective.peggy.v1

import kr.jadekim.protobuf.`annotation`.GeneratorVersion
import kr.jadekim.protobuf.converter.ProtobufConverter

public actual object OutgoingTxBatchConverter : ProtobufConverter<OutgoingTxBatch> by
    OutgoingTxBatchJvmConverter

public actual object OutgoingTransferTxConverter : ProtobufConverter<OutgoingTransferTx> by
    OutgoingTransferTxJvmConverter
