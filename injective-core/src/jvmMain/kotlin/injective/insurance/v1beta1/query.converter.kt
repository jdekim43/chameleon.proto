// Transform from injective/insurance/v1beta1/query.proto
@file:GeneratorVersion(version = "0.3.1")

package injective.insurance.v1beta1

import kr.jadekim.protobuf.`annotation`.GeneratorVersion
import kr.jadekim.protobuf.converter.ProtobufConverter

public actual object QueryInsuranceParamsRequestConverter :
    ProtobufConverter<QueryInsuranceParamsRequest> by QueryInsuranceParamsRequestJvmConverter

public actual object QueryInsuranceParamsResponseConverter :
    ProtobufConverter<QueryInsuranceParamsResponse> by QueryInsuranceParamsResponseJvmConverter

public actual object QueryInsuranceFundRequestConverter :
    ProtobufConverter<QueryInsuranceFundRequest> by QueryInsuranceFundRequestJvmConverter

public actual object QueryInsuranceFundResponseConverter :
    ProtobufConverter<QueryInsuranceFundResponse> by QueryInsuranceFundResponseJvmConverter

public actual object QueryInsuranceFundsRequestConverter :
    ProtobufConverter<QueryInsuranceFundsRequest> by QueryInsuranceFundsRequestJvmConverter

public actual object QueryInsuranceFundsResponseConverter :
    ProtobufConverter<QueryInsuranceFundsResponse> by QueryInsuranceFundsResponseJvmConverter

public actual object QueryEstimatedRedemptionsRequestConverter :
    ProtobufConverter<QueryEstimatedRedemptionsRequest> by
    QueryEstimatedRedemptionsRequestJvmConverter

public actual object QueryEstimatedRedemptionsResponseConverter :
    ProtobufConverter<QueryEstimatedRedemptionsResponse> by
    QueryEstimatedRedemptionsResponseJvmConverter

public actual object QueryPendingRedemptionsRequestConverter :
    ProtobufConverter<QueryPendingRedemptionsRequest> by QueryPendingRedemptionsRequestJvmConverter

public actual object QueryPendingRedemptionsResponseConverter :
    ProtobufConverter<QueryPendingRedemptionsResponse> by
    QueryPendingRedemptionsResponseJvmConverter

public actual object QueryModuleStateRequestConverter : ProtobufConverter<QueryModuleStateRequest>
    by QueryModuleStateRequestJvmConverter

public actual object QueryModuleStateResponseConverter : ProtobufConverter<QueryModuleStateResponse>
    by QueryModuleStateResponseJvmConverter
