// Transform from injective/oracle/v1beta1/tx.proto
@file:GeneratorVersion(version = "0.3.1")

package injective.oracle.v1beta1

import google.protobuf.Any
import java.lang.IllegalStateException
import kr.jadekim.protobuf.`annotation`.GeneratorVersion
import kr.jadekim.protobuf.converter.ProtobufConverter
import kr.jadekim.protobuf.converter.parseProtobuf

public expect object MsgRelayProviderPricesConverter : ProtobufConverter<MsgRelayProviderPrices>

public fun MsgRelayProviderPrices.toAny(): Any = Any(MsgRelayProviderPrices.TYPE_URL,
    with(MsgRelayProviderPricesConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<MsgRelayProviderPrices>): MsgRelayProviderPrices {
  if (typeUrl != MsgRelayProviderPrices.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object MsgRelayProviderPricesResponseConverter :
    ProtobufConverter<MsgRelayProviderPricesResponse>

public fun MsgRelayProviderPricesResponse.toAny(): Any =
    Any(MsgRelayProviderPricesResponse.TYPE_URL, with(MsgRelayProviderPricesResponseConverter) {
    toByteArray() })

public fun Any.parse(converter: ProtobufConverter<MsgRelayProviderPricesResponse>):
    MsgRelayProviderPricesResponse {
  if (typeUrl != MsgRelayProviderPricesResponse.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object MsgRelayPriceFeedPriceConverter : ProtobufConverter<MsgRelayPriceFeedPrice>

public fun MsgRelayPriceFeedPrice.toAny(): Any = Any(MsgRelayPriceFeedPrice.TYPE_URL,
    with(MsgRelayPriceFeedPriceConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<MsgRelayPriceFeedPrice>): MsgRelayPriceFeedPrice {
  if (typeUrl != MsgRelayPriceFeedPrice.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object MsgRelayPriceFeedPriceResponseConverter :
    ProtobufConverter<MsgRelayPriceFeedPriceResponse>

public fun MsgRelayPriceFeedPriceResponse.toAny(): Any =
    Any(MsgRelayPriceFeedPriceResponse.TYPE_URL, with(MsgRelayPriceFeedPriceResponseConverter) {
    toByteArray() })

public fun Any.parse(converter: ProtobufConverter<MsgRelayPriceFeedPriceResponse>):
    MsgRelayPriceFeedPriceResponse {
  if (typeUrl != MsgRelayPriceFeedPriceResponse.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object MsgRelayBandRatesConverter : ProtobufConverter<MsgRelayBandRates>

public fun MsgRelayBandRates.toAny(): Any = Any(MsgRelayBandRates.TYPE_URL,
    with(MsgRelayBandRatesConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<MsgRelayBandRates>): MsgRelayBandRates {
  if (typeUrl != MsgRelayBandRates.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object MsgRelayBandRatesResponseConverter :
    ProtobufConverter<MsgRelayBandRatesResponse>

public fun MsgRelayBandRatesResponse.toAny(): Any = Any(MsgRelayBandRatesResponse.TYPE_URL,
    with(MsgRelayBandRatesResponseConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<MsgRelayBandRatesResponse>):
    MsgRelayBandRatesResponse {
  if (typeUrl != MsgRelayBandRatesResponse.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object MsgRelayCoinbaseMessagesConverter : ProtobufConverter<MsgRelayCoinbaseMessages>

public fun MsgRelayCoinbaseMessages.toAny(): Any = Any(MsgRelayCoinbaseMessages.TYPE_URL,
    with(MsgRelayCoinbaseMessagesConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<MsgRelayCoinbaseMessages>):
    MsgRelayCoinbaseMessages {
  if (typeUrl != MsgRelayCoinbaseMessages.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object MsgRelayCoinbaseMessagesResponseConverter :
    ProtobufConverter<MsgRelayCoinbaseMessagesResponse>

public fun MsgRelayCoinbaseMessagesResponse.toAny(): Any =
    Any(MsgRelayCoinbaseMessagesResponse.TYPE_URL, with(MsgRelayCoinbaseMessagesResponseConverter) {
    toByteArray() })

public fun Any.parse(converter: ProtobufConverter<MsgRelayCoinbaseMessagesResponse>):
    MsgRelayCoinbaseMessagesResponse {
  if (typeUrl != MsgRelayCoinbaseMessagesResponse.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object MsgRequestBandIBCRatesConverter : ProtobufConverter<MsgRequestBandIBCRates>

public fun MsgRequestBandIBCRates.toAny(): Any = Any(MsgRequestBandIBCRates.TYPE_URL,
    with(MsgRequestBandIBCRatesConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<MsgRequestBandIBCRates>): MsgRequestBandIBCRates {
  if (typeUrl != MsgRequestBandIBCRates.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object MsgRequestBandIBCRatesResponseConverter :
    ProtobufConverter<MsgRequestBandIBCRatesResponse>

public fun MsgRequestBandIBCRatesResponse.toAny(): Any =
    Any(MsgRequestBandIBCRatesResponse.TYPE_URL, with(MsgRequestBandIBCRatesResponseConverter) {
    toByteArray() })

public fun Any.parse(converter: ProtobufConverter<MsgRequestBandIBCRatesResponse>):
    MsgRequestBandIBCRatesResponse {
  if (typeUrl != MsgRequestBandIBCRatesResponse.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object MsgRelayPythPricesConverter : ProtobufConverter<MsgRelayPythPrices>

public fun MsgRelayPythPrices.toAny(): Any = Any(MsgRelayPythPrices.TYPE_URL,
    with(MsgRelayPythPricesConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<MsgRelayPythPrices>): MsgRelayPythPrices {
  if (typeUrl != MsgRelayPythPrices.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object MsgRelayPythPricesResponseConverter :
    ProtobufConverter<MsgRelayPythPricesResponse>

public fun MsgRelayPythPricesResponse.toAny(): Any = Any(MsgRelayPythPricesResponse.TYPE_URL,
    with(MsgRelayPythPricesResponseConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<MsgRelayPythPricesResponse>):
    MsgRelayPythPricesResponse {
  if (typeUrl != MsgRelayPythPricesResponse.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object MsgUpdateParamsConverter : ProtobufConverter<MsgUpdateParams>

public fun MsgUpdateParams.toAny(): Any = Any(MsgUpdateParams.TYPE_URL,
    with(MsgUpdateParamsConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<MsgUpdateParams>): MsgUpdateParams {
  if (typeUrl != MsgUpdateParams.TYPE_URL) throw IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object MsgUpdateParamsResponseConverter : ProtobufConverter<MsgUpdateParamsResponse>

public fun MsgUpdateParamsResponse.toAny(): Any = Any(MsgUpdateParamsResponse.TYPE_URL,
    with(MsgUpdateParamsResponseConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<MsgUpdateParamsResponse>):
    MsgUpdateParamsResponse {
  if (typeUrl != MsgUpdateParamsResponse.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}
