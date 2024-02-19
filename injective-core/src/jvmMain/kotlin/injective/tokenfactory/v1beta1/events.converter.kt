// Transform from injective/tokenfactory/v1beta1/events.proto
@file:GeneratorVersion(version = "0.3.1")

package injective.tokenfactory.v1beta1

import kr.jadekim.protobuf.`annotation`.GeneratorVersion
import kr.jadekim.protobuf.converter.ProtobufConverter

public actual object EventCreateTFDenomConverter : ProtobufConverter<EventCreateTFDenom> by
    EventCreateTFDenomJvmConverter

public actual object EventMintTFDenomConverter : ProtobufConverter<EventMintTFDenom> by
    EventMintTFDenomJvmConverter

public actual object EventBurnDenomConverter : ProtobufConverter<EventBurnDenom> by
    EventBurnDenomJvmConverter

public actual object EventChangeTFAdminConverter : ProtobufConverter<EventChangeTFAdmin> by
    EventChangeTFAdminJvmConverter

public actual object EventSetTFDenomMetadataConverter : ProtobufConverter<EventSetTFDenomMetadata>
    by EventSetTFDenomMetadataJvmConverter
