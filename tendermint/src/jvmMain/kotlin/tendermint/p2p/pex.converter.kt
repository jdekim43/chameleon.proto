// Transform from tendermint/p2p/pex.proto
@file:GeneratorVersion(version = "0.3.1")

package tendermint.p2p

import kr.jadekim.protobuf.`annotation`.GeneratorVersion
import kr.jadekim.protobuf.converter.ProtobufConverter

public actual object PexRequestConverter : ProtobufConverter<PexRequest> by PexRequestJvmConverter

public actual object PexAddrsConverter : ProtobufConverter<PexAddrs> by PexAddrsJvmConverter

public actual object MessageConverter : ProtobufConverter<Message> by MessageJvmConverter
