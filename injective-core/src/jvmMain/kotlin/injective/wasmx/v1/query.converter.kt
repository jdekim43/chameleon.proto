// Transform from injective/wasmx/v1/query.proto
@file:GeneratorVersion(version = "0.3.1")

package injective.wasmx.v1

import kr.jadekim.protobuf.`annotation`.GeneratorVersion
import kr.jadekim.protobuf.converter.ProtobufConverter

public actual object QueryWasmxParamsRequestConverter : ProtobufConverter<QueryWasmxParamsRequest>
    by QueryWasmxParamsRequestJvmConverter

public actual object QueryWasmxParamsResponseConverter : ProtobufConverter<QueryWasmxParamsResponse>
    by QueryWasmxParamsResponseJvmConverter

public actual object QueryModuleStateRequestConverter : ProtobufConverter<QueryModuleStateRequest>
    by QueryModuleStateRequestJvmConverter

public actual object QueryModuleStateResponseConverter : ProtobufConverter<QueryModuleStateResponse>
    by QueryModuleStateResponseJvmConverter

public actual object QueryContractRegistrationInfoRequestConverter :
    ProtobufConverter<QueryContractRegistrationInfoRequest> by
    QueryContractRegistrationInfoRequestJvmConverter

public actual object QueryContractRegistrationInfoResponseConverter :
    ProtobufConverter<QueryContractRegistrationInfoResponse> by
    QueryContractRegistrationInfoResponseJvmConverter
