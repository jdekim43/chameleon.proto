// Transform from injective/oracle/v1beta1/events.proto
@file:GeneratorVersion(version = "0.3.1")

package injective.oracle.v1beta1

import kr.jadekim.protobuf.`annotation`.GeneratorVersion
import kr.jadekim.protobuf.converter.ProtobufConverter

public actual object SetChainlinkPriceEventConverter : ProtobufConverter<SetChainlinkPriceEvent> by
    SetChainlinkPriceEventJvmConverter

public actual object SetBandPriceEventConverter : ProtobufConverter<SetBandPriceEvent> by
    SetBandPriceEventJvmConverter

public actual object SetBandIBCPriceEventConverter : ProtobufConverter<SetBandIBCPriceEvent> by
    SetBandIBCPriceEventJvmConverter

public actual object EventBandIBCAckSuccessConverter : ProtobufConverter<EventBandIBCAckSuccess> by
    EventBandIBCAckSuccessJvmConverter

public actual object EventBandIBCAckErrorConverter : ProtobufConverter<EventBandIBCAckError> by
    EventBandIBCAckErrorJvmConverter

public actual object EventBandIBCResponseTimeoutConverter :
    ProtobufConverter<EventBandIBCResponseTimeout> by EventBandIBCResponseTimeoutJvmConverter

public actual object SetPriceFeedPriceEventConverter : ProtobufConverter<SetPriceFeedPriceEvent> by
    SetPriceFeedPriceEventJvmConverter

public actual object SetProviderPriceEventConverter : ProtobufConverter<SetProviderPriceEvent> by
    SetProviderPriceEventJvmConverter

public actual object SetCoinbasePriceEventConverter : ProtobufConverter<SetCoinbasePriceEvent> by
    SetCoinbasePriceEventJvmConverter

public actual object EventSetPythPricesConverter : ProtobufConverter<EventSetPythPrices> by
    EventSetPythPricesJvmConverter
