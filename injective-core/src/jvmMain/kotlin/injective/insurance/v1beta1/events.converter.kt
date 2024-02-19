// Transform from injective/insurance/v1beta1/events.proto
@file:GeneratorVersion(version = "0.3.1")

package injective.insurance.v1beta1

import kr.jadekim.protobuf.`annotation`.GeneratorVersion
import kr.jadekim.protobuf.converter.ProtobufConverter

public actual object EventInsuranceFundUpdateConverter : ProtobufConverter<EventInsuranceFundUpdate>
    by EventInsuranceFundUpdateJvmConverter

public actual object EventRequestRedemptionConverter : ProtobufConverter<EventRequestRedemption> by
    EventRequestRedemptionJvmConverter

public actual object EventWithdrawRedemptionConverter : ProtobufConverter<EventWithdrawRedemption>
    by EventWithdrawRedemptionJvmConverter

public actual object EventUnderwriteConverter : ProtobufConverter<EventUnderwrite> by
    EventUnderwriteJvmConverter

public actual object EventInsuranceWithdrawConverter : ProtobufConverter<EventInsuranceWithdraw> by
    EventInsuranceWithdrawJvmConverter
