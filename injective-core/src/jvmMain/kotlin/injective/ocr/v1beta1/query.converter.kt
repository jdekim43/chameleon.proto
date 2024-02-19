// Transform from injective/ocr/v1beta1/query.proto
@file:GeneratorVersion(version = "0.3.1")

package injective.ocr.v1beta1

import kr.jadekim.protobuf.`annotation`.GeneratorVersion
import kr.jadekim.protobuf.converter.ProtobufConverter

public actual object QueryParamsRequestConverter : ProtobufConverter<QueryParamsRequest> by
    QueryParamsRequestJvmConverter

public actual object QueryParamsResponseConverter : ProtobufConverter<QueryParamsResponse> by
    QueryParamsResponseJvmConverter

public actual object QueryFeedConfigRequestConverter : ProtobufConverter<QueryFeedConfigRequest> by
    QueryFeedConfigRequestJvmConverter

public actual object QueryFeedConfigResponseConverter : ProtobufConverter<QueryFeedConfigResponse>
    by QueryFeedConfigResponseJvmConverter

public actual object QueryFeedConfigInfoRequestConverter :
    ProtobufConverter<QueryFeedConfigInfoRequest> by QueryFeedConfigInfoRequestJvmConverter

public actual object QueryFeedConfigInfoResponseConverter :
    ProtobufConverter<QueryFeedConfigInfoResponse> by QueryFeedConfigInfoResponseJvmConverter

public actual object QueryLatestRoundRequestConverter : ProtobufConverter<QueryLatestRoundRequest>
    by QueryLatestRoundRequestJvmConverter

public actual object QueryLatestRoundResponseConverter : ProtobufConverter<QueryLatestRoundResponse>
    by QueryLatestRoundResponseJvmConverter

public actual object QueryLatestTransmissionDetailsRequestConverter :
    ProtobufConverter<QueryLatestTransmissionDetailsRequest> by
    QueryLatestTransmissionDetailsRequestJvmConverter

public actual object QueryLatestTransmissionDetailsResponseConverter :
    ProtobufConverter<QueryLatestTransmissionDetailsResponse> by
    QueryLatestTransmissionDetailsResponseJvmConverter

public actual object QueryOwedAmountRequestConverter : ProtobufConverter<QueryOwedAmountRequest> by
    QueryOwedAmountRequestJvmConverter

public actual object QueryOwedAmountResponseConverter : ProtobufConverter<QueryOwedAmountResponse>
    by QueryOwedAmountResponseJvmConverter

public actual object QueryModuleStateRequestConverter : ProtobufConverter<QueryModuleStateRequest>
    by QueryModuleStateRequestJvmConverter

public actual object QueryModuleStateResponseConverter : ProtobufConverter<QueryModuleStateResponse>
    by QueryModuleStateResponseJvmConverter
