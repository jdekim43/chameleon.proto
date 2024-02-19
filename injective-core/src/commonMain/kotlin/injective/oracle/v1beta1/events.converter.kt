// Transform from injective/oracle/v1beta1/events.proto
@file:GeneratorVersion(version = "0.3.1")

package injective.oracle.v1beta1

import google.protobuf.Any
import java.lang.IllegalStateException
import kr.jadekim.protobuf.`annotation`.GeneratorVersion
import kr.jadekim.protobuf.converter.ProtobufConverter
import kr.jadekim.protobuf.converter.parseProtobuf

public expect object SetChainlinkPriceEventConverter : ProtobufConverter<SetChainlinkPriceEvent>

public fun SetChainlinkPriceEvent.toAny(): Any = Any(SetChainlinkPriceEvent.TYPE_URL,
    with(SetChainlinkPriceEventConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<SetChainlinkPriceEvent>): SetChainlinkPriceEvent {
  if (typeUrl != SetChainlinkPriceEvent.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object SetBandPriceEventConverter : ProtobufConverter<SetBandPriceEvent>

public fun SetBandPriceEvent.toAny(): Any = Any(SetBandPriceEvent.TYPE_URL,
    with(SetBandPriceEventConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<SetBandPriceEvent>): SetBandPriceEvent {
  if (typeUrl != SetBandPriceEvent.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object SetBandIBCPriceEventConverter : ProtobufConverter<SetBandIBCPriceEvent>

public fun SetBandIBCPriceEvent.toAny(): Any = Any(SetBandIBCPriceEvent.TYPE_URL,
    with(SetBandIBCPriceEventConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<SetBandIBCPriceEvent>): SetBandIBCPriceEvent {
  if (typeUrl != SetBandIBCPriceEvent.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object EventBandIBCAckSuccessConverter : ProtobufConverter<EventBandIBCAckSuccess>

public fun EventBandIBCAckSuccess.toAny(): Any = Any(EventBandIBCAckSuccess.TYPE_URL,
    with(EventBandIBCAckSuccessConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<EventBandIBCAckSuccess>): EventBandIBCAckSuccess {
  if (typeUrl != EventBandIBCAckSuccess.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object EventBandIBCAckErrorConverter : ProtobufConverter<EventBandIBCAckError>

public fun EventBandIBCAckError.toAny(): Any = Any(EventBandIBCAckError.TYPE_URL,
    with(EventBandIBCAckErrorConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<EventBandIBCAckError>): EventBandIBCAckError {
  if (typeUrl != EventBandIBCAckError.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object EventBandIBCResponseTimeoutConverter :
    ProtobufConverter<EventBandIBCResponseTimeout>

public fun EventBandIBCResponseTimeout.toAny(): Any = Any(EventBandIBCResponseTimeout.TYPE_URL,
    with(EventBandIBCResponseTimeoutConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<EventBandIBCResponseTimeout>):
    EventBandIBCResponseTimeout {
  if (typeUrl != EventBandIBCResponseTimeout.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object SetPriceFeedPriceEventConverter : ProtobufConverter<SetPriceFeedPriceEvent>

public fun SetPriceFeedPriceEvent.toAny(): Any = Any(SetPriceFeedPriceEvent.TYPE_URL,
    with(SetPriceFeedPriceEventConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<SetPriceFeedPriceEvent>): SetPriceFeedPriceEvent {
  if (typeUrl != SetPriceFeedPriceEvent.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object SetProviderPriceEventConverter : ProtobufConverter<SetProviderPriceEvent>

public fun SetProviderPriceEvent.toAny(): Any = Any(SetProviderPriceEvent.TYPE_URL,
    with(SetProviderPriceEventConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<SetProviderPriceEvent>): SetProviderPriceEvent {
  if (typeUrl != SetProviderPriceEvent.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object SetCoinbasePriceEventConverter : ProtobufConverter<SetCoinbasePriceEvent>

public fun SetCoinbasePriceEvent.toAny(): Any = Any(SetCoinbasePriceEvent.TYPE_URL,
    with(SetCoinbasePriceEventConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<SetCoinbasePriceEvent>): SetCoinbasePriceEvent {
  if (typeUrl != SetCoinbasePriceEvent.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object EventSetPythPricesConverter : ProtobufConverter<EventSetPythPrices>

public fun EventSetPythPrices.toAny(): Any = Any(EventSetPythPrices.TYPE_URL,
    with(EventSetPythPricesConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<EventSetPythPrices>): EventSetPythPrices {
  if (typeUrl != EventSetPythPrices.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}
