// Transform from injective/insurance/v1beta1/events.proto
@file:GeneratorVersion(version = "0.3.1")

package injective.insurance.v1beta1

import google.protobuf.Any
import java.lang.IllegalStateException
import kr.jadekim.protobuf.`annotation`.GeneratorVersion
import kr.jadekim.protobuf.converter.ProtobufConverter
import kr.jadekim.protobuf.converter.parseProtobuf

public expect object EventInsuranceFundUpdateConverter : ProtobufConverter<EventInsuranceFundUpdate>

public fun EventInsuranceFundUpdate.toAny(): Any = Any(EventInsuranceFundUpdate.TYPE_URL,
    with(EventInsuranceFundUpdateConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<EventInsuranceFundUpdate>):
    EventInsuranceFundUpdate {
  if (typeUrl != EventInsuranceFundUpdate.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object EventRequestRedemptionConverter : ProtobufConverter<EventRequestRedemption>

public fun EventRequestRedemption.toAny(): Any = Any(EventRequestRedemption.TYPE_URL,
    with(EventRequestRedemptionConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<EventRequestRedemption>): EventRequestRedemption {
  if (typeUrl != EventRequestRedemption.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object EventWithdrawRedemptionConverter : ProtobufConverter<EventWithdrawRedemption>

public fun EventWithdrawRedemption.toAny(): Any = Any(EventWithdrawRedemption.TYPE_URL,
    with(EventWithdrawRedemptionConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<EventWithdrawRedemption>):
    EventWithdrawRedemption {
  if (typeUrl != EventWithdrawRedemption.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object EventUnderwriteConverter : ProtobufConverter<EventUnderwrite>

public fun EventUnderwrite.toAny(): Any = Any(EventUnderwrite.TYPE_URL,
    with(EventUnderwriteConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<EventUnderwrite>): EventUnderwrite {
  if (typeUrl != EventUnderwrite.TYPE_URL) throw IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object EventInsuranceWithdrawConverter : ProtobufConverter<EventInsuranceWithdraw>

public fun EventInsuranceWithdraw.toAny(): Any = Any(EventInsuranceWithdraw.TYPE_URL,
    with(EventInsuranceWithdrawConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<EventInsuranceWithdraw>): EventInsuranceWithdraw {
  if (typeUrl != EventInsuranceWithdraw.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}
