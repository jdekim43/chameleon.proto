// Transform from injective/tokenfactory/v1beta1/query.proto
@file:GeneratorVersion(version = "0.3.1")

package injective.tokenfactory.v1beta1

import kr.jadekim.protobuf.`annotation`.GeneratorVersion
import kr.jadekim.protobuf.converter.ProtobufConverter

public actual object QueryParamsRequestConverter : ProtobufConverter<QueryParamsRequest> by
    QueryParamsRequestJvmConverter

public actual object QueryParamsResponseConverter : ProtobufConverter<QueryParamsResponse> by
    QueryParamsResponseJvmConverter

public actual object QueryDenomAuthorityMetadataRequestConverter :
    ProtobufConverter<QueryDenomAuthorityMetadataRequest> by
    QueryDenomAuthorityMetadataRequestJvmConverter

public actual object QueryDenomAuthorityMetadataResponseConverter :
    ProtobufConverter<QueryDenomAuthorityMetadataResponse> by
    QueryDenomAuthorityMetadataResponseJvmConverter

public actual object QueryDenomsFromCreatorRequestConverter :
    ProtobufConverter<QueryDenomsFromCreatorRequest> by QueryDenomsFromCreatorRequestJvmConverter

public actual object QueryDenomsFromCreatorResponseConverter :
    ProtobufConverter<QueryDenomsFromCreatorResponse> by QueryDenomsFromCreatorResponseJvmConverter

public actual object QueryModuleStateRequestConverter : ProtobufConverter<QueryModuleStateRequest>
    by QueryModuleStateRequestJvmConverter

public actual object QueryModuleStateResponseConverter : ProtobufConverter<QueryModuleStateResponse>
    by QueryModuleStateResponseJvmConverter
