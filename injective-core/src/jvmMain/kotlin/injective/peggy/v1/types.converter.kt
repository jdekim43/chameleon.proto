// Transform from injective/peggy/v1/types.proto
@file:GeneratorVersion(version = "0.3.1")

package injective.peggy.v1

import kr.jadekim.protobuf.`annotation`.GeneratorVersion
import kr.jadekim.protobuf.converter.ProtobufConverter

public actual object BridgeValidatorConverter : ProtobufConverter<BridgeValidator> by
    BridgeValidatorJvmConverter

public actual object ValsetConverter : ProtobufConverter<Valset> by ValsetJvmConverter

public actual object LastObservedEthereumBlockHeightConverter :
    ProtobufConverter<LastObservedEthereumBlockHeight> by
    LastObservedEthereumBlockHeightJvmConverter

public actual object LastClaimEventConverter : ProtobufConverter<LastClaimEvent> by
    LastClaimEventJvmConverter

public actual object ERC20ToDenomConverter : ProtobufConverter<ERC20ToDenom> by
    ERC20ToDenomJvmConverter
