// Transform from injective/insurance/v1beta1/insurance.proto
@file:GeneratorVersion(version = "0.3.1")

package injective.insurance.v1beta1

import google.protobuf.Any
import java.lang.IllegalStateException
import kr.jadekim.protobuf.`annotation`.GeneratorVersion
import kr.jadekim.protobuf.converter.ProtobufConverter
import kr.jadekim.protobuf.converter.parseProtobuf

public expect object ParamsConverter : ProtobufConverter<Params>

public fun Params.toAny(): Any = Any(Params.TYPE_URL, with(ParamsConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<Params>): Params {
  if (typeUrl != Params.TYPE_URL) throw IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object InsuranceFundConverter : ProtobufConverter<InsuranceFund>

public fun InsuranceFund.toAny(): Any = Any(InsuranceFund.TYPE_URL, with(InsuranceFundConverter) {
    toByteArray() })

public fun Any.parse(converter: ProtobufConverter<InsuranceFund>): InsuranceFund {
  if (typeUrl != InsuranceFund.TYPE_URL) throw IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object RedemptionScheduleConverter : ProtobufConverter<RedemptionSchedule>

public fun RedemptionSchedule.toAny(): Any = Any(RedemptionSchedule.TYPE_URL,
    with(RedemptionScheduleConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<RedemptionSchedule>): RedemptionSchedule {
  if (typeUrl != RedemptionSchedule.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}
