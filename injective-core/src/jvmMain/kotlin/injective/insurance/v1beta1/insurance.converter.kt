// Transform from injective/insurance/v1beta1/insurance.proto
@file:GeneratorVersion(version = "0.3.1")

package injective.insurance.v1beta1

import kr.jadekim.protobuf.`annotation`.GeneratorVersion
import kr.jadekim.protobuf.converter.ProtobufConverter

public actual object ParamsConverter : ProtobufConverter<Params> by ParamsJvmConverter

public actual object InsuranceFundConverter : ProtobufConverter<InsuranceFund> by
    InsuranceFundJvmConverter

public actual object RedemptionScheduleConverter : ProtobufConverter<RedemptionSchedule> by
    RedemptionScheduleJvmConverter
