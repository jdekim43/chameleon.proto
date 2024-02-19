// Transform from injective/oracle/v1beta1/tx.proto
@file:GeneratorVersion(version = "0.3.1")

package injective.oracle.v1beta1

import kr.jadekim.protobuf.`annotation`.GeneratorVersion
import kr.jadekim.protobuf.converter.ProtobufConverter

public actual object MsgRelayProviderPricesConverter : ProtobufConverter<MsgRelayProviderPrices> by
    MsgRelayProviderPricesJvmConverter

public actual object MsgRelayProviderPricesResponseConverter :
    ProtobufConverter<MsgRelayProviderPricesResponse> by MsgRelayProviderPricesResponseJvmConverter

public actual object MsgRelayPriceFeedPriceConverter : ProtobufConverter<MsgRelayPriceFeedPrice> by
    MsgRelayPriceFeedPriceJvmConverter

public actual object MsgRelayPriceFeedPriceResponseConverter :
    ProtobufConverter<MsgRelayPriceFeedPriceResponse> by MsgRelayPriceFeedPriceResponseJvmConverter

public actual object MsgRelayBandRatesConverter : ProtobufConverter<MsgRelayBandRates> by
    MsgRelayBandRatesJvmConverter

public actual object MsgRelayBandRatesResponseConverter :
    ProtobufConverter<MsgRelayBandRatesResponse> by MsgRelayBandRatesResponseJvmConverter

public actual object MsgRelayCoinbaseMessagesConverter : ProtobufConverter<MsgRelayCoinbaseMessages>
    by MsgRelayCoinbaseMessagesJvmConverter

public actual object MsgRelayCoinbaseMessagesResponseConverter :
    ProtobufConverter<MsgRelayCoinbaseMessagesResponse> by
    MsgRelayCoinbaseMessagesResponseJvmConverter

public actual object MsgRequestBandIBCRatesConverter : ProtobufConverter<MsgRequestBandIBCRates> by
    MsgRequestBandIBCRatesJvmConverter

public actual object MsgRequestBandIBCRatesResponseConverter :
    ProtobufConverter<MsgRequestBandIBCRatesResponse> by MsgRequestBandIBCRatesResponseJvmConverter

public actual object MsgRelayPythPricesConverter : ProtobufConverter<MsgRelayPythPrices> by
    MsgRelayPythPricesJvmConverter

public actual object MsgRelayPythPricesResponseConverter :
    ProtobufConverter<MsgRelayPythPricesResponse> by MsgRelayPythPricesResponseJvmConverter

public actual object MsgUpdateParamsConverter : ProtobufConverter<MsgUpdateParams> by
    MsgUpdateParamsJvmConverter

public actual object MsgUpdateParamsResponseConverter : ProtobufConverter<MsgUpdateParamsResponse>
    by MsgUpdateParamsResponseJvmConverter
