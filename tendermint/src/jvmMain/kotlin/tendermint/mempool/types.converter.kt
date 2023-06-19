// Transform from tendermint/mempool/types.proto
@file:GeneratorVersion(version = "0.3.1")

package tendermint.mempool

import kr.jadekim.protobuf.`annotation`.GeneratorVersion
import kr.jadekim.protobuf.converter.ProtobufConverter

public actual object TxsConverter : ProtobufConverter<Txs> by TxsJvmConverter

public actual object MessageConverter : ProtobufConverter<Message> by MessageJvmConverter
