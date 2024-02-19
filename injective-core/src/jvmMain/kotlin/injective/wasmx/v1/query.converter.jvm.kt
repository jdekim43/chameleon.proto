// Transform from injective/wasmx/v1/query.proto
@file:GeneratorVersion(version = "0.3.1")

package injective.wasmx.v1

import com.google.protobuf.Descriptors
import com.google.protobuf.Parser
import kr.jadekim.protobuf.`annotation`.GeneratorVersion
import kr.jadekim.protobuf.converter.mapper.ProtobufTypeMapper

public object QueryWasmxParamsRequestJvmConverter :
    ProtobufTypeMapper<QueryWasmxParamsRequest, QueryOuterClass.QueryWasmxParamsRequest> {
  public override val descriptor: Descriptors.Descriptor =
      QueryOuterClass.QueryWasmxParamsRequest.getDescriptor()

  public override val parser: Parser<QueryOuterClass.QueryWasmxParamsRequest> =
      QueryOuterClass.QueryWasmxParamsRequest.parser()

  public override fun convert(obj: QueryOuterClass.QueryWasmxParamsRequest): QueryWasmxParamsRequest
      = QueryWasmxParamsRequest(
  )

  public override fun convert(obj: QueryWasmxParamsRequest):
      QueryOuterClass.QueryWasmxParamsRequest {
    val builder = QueryOuterClass.QueryWasmxParamsRequest.newBuilder()
    return builder.build()
  }
}

public object QueryWasmxParamsResponseJvmConverter :
    ProtobufTypeMapper<QueryWasmxParamsResponse, QueryOuterClass.QueryWasmxParamsResponse> {
  public override val descriptor: Descriptors.Descriptor =
      QueryOuterClass.QueryWasmxParamsResponse.getDescriptor()

  public override val parser: Parser<QueryOuterClass.QueryWasmxParamsResponse> =
      QueryOuterClass.QueryWasmxParamsResponse.parser()

  public override fun convert(obj: QueryOuterClass.QueryWasmxParamsResponse):
      QueryWasmxParamsResponse = QueryWasmxParamsResponse(
  	params = ParamsJvmConverter.convert(obj.getParams()),
  )

  public override fun convert(obj: QueryWasmxParamsResponse):
      QueryOuterClass.QueryWasmxParamsResponse {
    val builder = QueryOuterClass.QueryWasmxParamsResponse.newBuilder()
    builder.setParams(ParamsJvmConverter.convert(obj.params))
    return builder.build()
  }
}

public object QueryModuleStateRequestJvmConverter :
    ProtobufTypeMapper<QueryModuleStateRequest, QueryOuterClass.QueryModuleStateRequest> {
  public override val descriptor: Descriptors.Descriptor =
      QueryOuterClass.QueryModuleStateRequest.getDescriptor()

  public override val parser: Parser<QueryOuterClass.QueryModuleStateRequest> =
      QueryOuterClass.QueryModuleStateRequest.parser()

  public override fun convert(obj: QueryOuterClass.QueryModuleStateRequest): QueryModuleStateRequest
      = QueryModuleStateRequest(
  )

  public override fun convert(obj: QueryModuleStateRequest):
      QueryOuterClass.QueryModuleStateRequest {
    val builder = QueryOuterClass.QueryModuleStateRequest.newBuilder()
    return builder.build()
  }
}

public object QueryModuleStateResponseJvmConverter :
    ProtobufTypeMapper<QueryModuleStateResponse, QueryOuterClass.QueryModuleStateResponse> {
  public override val descriptor: Descriptors.Descriptor =
      QueryOuterClass.QueryModuleStateResponse.getDescriptor()

  public override val parser: Parser<QueryOuterClass.QueryModuleStateResponse> =
      QueryOuterClass.QueryModuleStateResponse.parser()

  public override fun convert(obj: QueryOuterClass.QueryModuleStateResponse):
      QueryModuleStateResponse = QueryModuleStateResponse(
  	state = GenesisStateJvmConverter.convert(obj.getState()),
  )

  public override fun convert(obj: QueryModuleStateResponse):
      QueryOuterClass.QueryModuleStateResponse {
    val builder = QueryOuterClass.QueryModuleStateResponse.newBuilder()
    builder.setState(GenesisStateJvmConverter.convert(obj.state))
    return builder.build()
  }
}

public object QueryContractRegistrationInfoRequestJvmConverter :
    ProtobufTypeMapper<QueryContractRegistrationInfoRequest, QueryOuterClass.QueryContractRegistrationInfoRequest>
    {
  public override val descriptor: Descriptors.Descriptor =
      QueryOuterClass.QueryContractRegistrationInfoRequest.getDescriptor()

  public override val parser: Parser<QueryOuterClass.QueryContractRegistrationInfoRequest> =
      QueryOuterClass.QueryContractRegistrationInfoRequest.parser()

  public override fun convert(obj: QueryOuterClass.QueryContractRegistrationInfoRequest):
      QueryContractRegistrationInfoRequest = QueryContractRegistrationInfoRequest(
  	contractAddress = obj.getContractAddress(),
  )

  public override fun convert(obj: QueryContractRegistrationInfoRequest):
      QueryOuterClass.QueryContractRegistrationInfoRequest {
    val builder = QueryOuterClass.QueryContractRegistrationInfoRequest.newBuilder()
    builder.setContractAddress(obj.contractAddress)
    return builder.build()
  }
}

public object QueryContractRegistrationInfoResponseJvmConverter :
    ProtobufTypeMapper<QueryContractRegistrationInfoResponse, QueryOuterClass.QueryContractRegistrationInfoResponse>
    {
  public override val descriptor: Descriptors.Descriptor =
      QueryOuterClass.QueryContractRegistrationInfoResponse.getDescriptor()

  public override val parser: Parser<QueryOuterClass.QueryContractRegistrationInfoResponse> =
      QueryOuterClass.QueryContractRegistrationInfoResponse.parser()

  public override fun convert(obj: QueryOuterClass.QueryContractRegistrationInfoResponse):
      QueryContractRegistrationInfoResponse = QueryContractRegistrationInfoResponse(
  	contract = RegisteredContractJvmConverter.convert(obj.getContract()),
  )

  public override fun convert(obj: QueryContractRegistrationInfoResponse):
      QueryOuterClass.QueryContractRegistrationInfoResponse {
    val builder = QueryOuterClass.QueryContractRegistrationInfoResponse.newBuilder()
    builder.setContract(RegisteredContractJvmConverter.convert(obj.contract))
    return builder.build()
  }
}
