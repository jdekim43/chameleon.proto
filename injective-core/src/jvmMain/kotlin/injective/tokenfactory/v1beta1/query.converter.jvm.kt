// Transform from injective/tokenfactory/v1beta1/query.proto
@file:GeneratorVersion(version = "0.3.1")

package injective.tokenfactory.v1beta1

import com.google.protobuf.Descriptors
import com.google.protobuf.Parser
import kr.jadekim.protobuf.`annotation`.GeneratorVersion
import kr.jadekim.protobuf.converter.mapper.ProtobufTypeMapper

public object QueryParamsRequestJvmConverter :
    ProtobufTypeMapper<QueryParamsRequest, QueryOuterClass.QueryParamsRequest> {
  public override val descriptor: Descriptors.Descriptor =
      QueryOuterClass.QueryParamsRequest.getDescriptor()

  public override val parser: Parser<QueryOuterClass.QueryParamsRequest> =
      QueryOuterClass.QueryParamsRequest.parser()

  public override fun convert(obj: QueryOuterClass.QueryParamsRequest): QueryParamsRequest =
      QueryParamsRequest(
  )

  public override fun convert(obj: QueryParamsRequest): QueryOuterClass.QueryParamsRequest {
    val builder = QueryOuterClass.QueryParamsRequest.newBuilder()
    return builder.build()
  }
}

public object QueryParamsResponseJvmConverter :
    ProtobufTypeMapper<QueryParamsResponse, QueryOuterClass.QueryParamsResponse> {
  public override val descriptor: Descriptors.Descriptor =
      QueryOuterClass.QueryParamsResponse.getDescriptor()

  public override val parser: Parser<QueryOuterClass.QueryParamsResponse> =
      QueryOuterClass.QueryParamsResponse.parser()

  public override fun convert(obj: QueryOuterClass.QueryParamsResponse): QueryParamsResponse =
      QueryParamsResponse(
  	params = ParamsJvmConverter.convert(obj.getParams()),
  )

  public override fun convert(obj: QueryParamsResponse): QueryOuterClass.QueryParamsResponse {
    val builder = QueryOuterClass.QueryParamsResponse.newBuilder()
    builder.setParams(ParamsJvmConverter.convert(obj.params))
    return builder.build()
  }
}

public object QueryDenomAuthorityMetadataRequestJvmConverter :
    ProtobufTypeMapper<QueryDenomAuthorityMetadataRequest, QueryOuterClass.QueryDenomAuthorityMetadataRequest>
    {
  public override val descriptor: Descriptors.Descriptor =
      QueryOuterClass.QueryDenomAuthorityMetadataRequest.getDescriptor()

  public override val parser: Parser<QueryOuterClass.QueryDenomAuthorityMetadataRequest> =
      QueryOuterClass.QueryDenomAuthorityMetadataRequest.parser()

  public override fun convert(obj: QueryOuterClass.QueryDenomAuthorityMetadataRequest):
      QueryDenomAuthorityMetadataRequest = QueryDenomAuthorityMetadataRequest(
  	creator = obj.getCreator(),
  	subDenom = obj.getSubDenom(),
  )

  public override fun convert(obj: QueryDenomAuthorityMetadataRequest):
      QueryOuterClass.QueryDenomAuthorityMetadataRequest {
    val builder = QueryOuterClass.QueryDenomAuthorityMetadataRequest.newBuilder()
    builder.setCreator(obj.creator)
    builder.setSubDenom(obj.subDenom)
    return builder.build()
  }
}

public object QueryDenomAuthorityMetadataResponseJvmConverter :
    ProtobufTypeMapper<QueryDenomAuthorityMetadataResponse, QueryOuterClass.QueryDenomAuthorityMetadataResponse>
    {
  public override val descriptor: Descriptors.Descriptor =
      QueryOuterClass.QueryDenomAuthorityMetadataResponse.getDescriptor()

  public override val parser: Parser<QueryOuterClass.QueryDenomAuthorityMetadataResponse> =
      QueryOuterClass.QueryDenomAuthorityMetadataResponse.parser()

  public override fun convert(obj: QueryOuterClass.QueryDenomAuthorityMetadataResponse):
      QueryDenomAuthorityMetadataResponse = QueryDenomAuthorityMetadataResponse(
  	authorityMetadata = DenomAuthorityMetadataJvmConverter.convert(obj.getAuthorityMetadata()),
  )

  public override fun convert(obj: QueryDenomAuthorityMetadataResponse):
      QueryOuterClass.QueryDenomAuthorityMetadataResponse {
    val builder = QueryOuterClass.QueryDenomAuthorityMetadataResponse.newBuilder()
    builder.setAuthorityMetadata(DenomAuthorityMetadataJvmConverter.convert(obj.authorityMetadata))
    return builder.build()
  }
}

public object QueryDenomsFromCreatorRequestJvmConverter :
    ProtobufTypeMapper<QueryDenomsFromCreatorRequest, QueryOuterClass.QueryDenomsFromCreatorRequest>
    {
  public override val descriptor: Descriptors.Descriptor =
      QueryOuterClass.QueryDenomsFromCreatorRequest.getDescriptor()

  public override val parser: Parser<QueryOuterClass.QueryDenomsFromCreatorRequest> =
      QueryOuterClass.QueryDenomsFromCreatorRequest.parser()

  public override fun convert(obj: QueryOuterClass.QueryDenomsFromCreatorRequest):
      QueryDenomsFromCreatorRequest = QueryDenomsFromCreatorRequest(
  	creator = obj.getCreator(),
  )

  public override fun convert(obj: QueryDenomsFromCreatorRequest):
      QueryOuterClass.QueryDenomsFromCreatorRequest {
    val builder = QueryOuterClass.QueryDenomsFromCreatorRequest.newBuilder()
    builder.setCreator(obj.creator)
    return builder.build()
  }
}

public object QueryDenomsFromCreatorResponseJvmConverter :
    ProtobufTypeMapper<QueryDenomsFromCreatorResponse, QueryOuterClass.QueryDenomsFromCreatorResponse>
    {
  public override val descriptor: Descriptors.Descriptor =
      QueryOuterClass.QueryDenomsFromCreatorResponse.getDescriptor()

  public override val parser: Parser<QueryOuterClass.QueryDenomsFromCreatorResponse> =
      QueryOuterClass.QueryDenomsFromCreatorResponse.parser()

  public override fun convert(obj: QueryOuterClass.QueryDenomsFromCreatorResponse):
      QueryDenomsFromCreatorResponse = QueryDenomsFromCreatorResponse(
  	denoms = obj.getDenomsList().map { it },
  )

  public override fun convert(obj: QueryDenomsFromCreatorResponse):
      QueryOuterClass.QueryDenomsFromCreatorResponse {
    val builder = QueryOuterClass.QueryDenomsFromCreatorResponse.newBuilder()
    builder.addAllDenoms(obj.denoms.map { it })
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
