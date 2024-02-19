// Transform from injective/insurance/v1beta1/query.proto
@file:GeneratorVersion(version = "0.3.1")

package injective.insurance.v1beta1

import com.google.protobuf.Descriptors
import com.google.protobuf.Parser
import cosmos.base.v1beta1.CoinJvmConverter
import kr.jadekim.protobuf.`annotation`.GeneratorVersion
import kr.jadekim.protobuf.converter.mapper.ProtobufTypeMapper

public object QueryInsuranceParamsRequestJvmConverter :
    ProtobufTypeMapper<QueryInsuranceParamsRequest, QueryOuterClass.QueryInsuranceParamsRequest> {
  public override val descriptor: Descriptors.Descriptor =
      QueryOuterClass.QueryInsuranceParamsRequest.getDescriptor()

  public override val parser: Parser<QueryOuterClass.QueryInsuranceParamsRequest> =
      QueryOuterClass.QueryInsuranceParamsRequest.parser()

  public override fun convert(obj: QueryOuterClass.QueryInsuranceParamsRequest):
      QueryInsuranceParamsRequest = QueryInsuranceParamsRequest(
  )

  public override fun convert(obj: QueryInsuranceParamsRequest):
      QueryOuterClass.QueryInsuranceParamsRequest {
    val builder = QueryOuterClass.QueryInsuranceParamsRequest.newBuilder()
    return builder.build()
  }
}

public object QueryInsuranceParamsResponseJvmConverter :
    ProtobufTypeMapper<QueryInsuranceParamsResponse, QueryOuterClass.QueryInsuranceParamsResponse> {
  public override val descriptor: Descriptors.Descriptor =
      QueryOuterClass.QueryInsuranceParamsResponse.getDescriptor()

  public override val parser: Parser<QueryOuterClass.QueryInsuranceParamsResponse> =
      QueryOuterClass.QueryInsuranceParamsResponse.parser()

  public override fun convert(obj: QueryOuterClass.QueryInsuranceParamsResponse):
      QueryInsuranceParamsResponse = QueryInsuranceParamsResponse(
  	params = ParamsJvmConverter.convert(obj.getParams()),
  )

  public override fun convert(obj: QueryInsuranceParamsResponse):
      QueryOuterClass.QueryInsuranceParamsResponse {
    val builder = QueryOuterClass.QueryInsuranceParamsResponse.newBuilder()
    builder.setParams(ParamsJvmConverter.convert(obj.params))
    return builder.build()
  }
}

public object QueryInsuranceFundRequestJvmConverter :
    ProtobufTypeMapper<QueryInsuranceFundRequest, QueryOuterClass.QueryInsuranceFundRequest> {
  public override val descriptor: Descriptors.Descriptor =
      QueryOuterClass.QueryInsuranceFundRequest.getDescriptor()

  public override val parser: Parser<QueryOuterClass.QueryInsuranceFundRequest> =
      QueryOuterClass.QueryInsuranceFundRequest.parser()

  public override fun convert(obj: QueryOuterClass.QueryInsuranceFundRequest):
      QueryInsuranceFundRequest = QueryInsuranceFundRequest(
  	marketId = obj.getMarketId(),
  )

  public override fun convert(obj: QueryInsuranceFundRequest):
      QueryOuterClass.QueryInsuranceFundRequest {
    val builder = QueryOuterClass.QueryInsuranceFundRequest.newBuilder()
    builder.setMarketId(obj.marketId)
    return builder.build()
  }
}

public object QueryInsuranceFundResponseJvmConverter :
    ProtobufTypeMapper<QueryInsuranceFundResponse, QueryOuterClass.QueryInsuranceFundResponse> {
  public override val descriptor: Descriptors.Descriptor =
      QueryOuterClass.QueryInsuranceFundResponse.getDescriptor()

  public override val parser: Parser<QueryOuterClass.QueryInsuranceFundResponse> =
      QueryOuterClass.QueryInsuranceFundResponse.parser()

  public override fun convert(obj: QueryOuterClass.QueryInsuranceFundResponse):
      QueryInsuranceFundResponse = QueryInsuranceFundResponse(
  	fund = InsuranceFundJvmConverter.convert(obj.getFund()),
  )

  public override fun convert(obj: QueryInsuranceFundResponse):
      QueryOuterClass.QueryInsuranceFundResponse {
    val builder = QueryOuterClass.QueryInsuranceFundResponse.newBuilder()
    builder.setFund(InsuranceFundJvmConverter.convert(obj.fund))
    return builder.build()
  }
}

public object QueryInsuranceFundsRequestJvmConverter :
    ProtobufTypeMapper<QueryInsuranceFundsRequest, QueryOuterClass.QueryInsuranceFundsRequest> {
  public override val descriptor: Descriptors.Descriptor =
      QueryOuterClass.QueryInsuranceFundsRequest.getDescriptor()

  public override val parser: Parser<QueryOuterClass.QueryInsuranceFundsRequest> =
      QueryOuterClass.QueryInsuranceFundsRequest.parser()

  public override fun convert(obj: QueryOuterClass.QueryInsuranceFundsRequest):
      QueryInsuranceFundsRequest = QueryInsuranceFundsRequest(
  )

  public override fun convert(obj: QueryInsuranceFundsRequest):
      QueryOuterClass.QueryInsuranceFundsRequest {
    val builder = QueryOuterClass.QueryInsuranceFundsRequest.newBuilder()
    return builder.build()
  }
}

public object QueryInsuranceFundsResponseJvmConverter :
    ProtobufTypeMapper<QueryInsuranceFundsResponse, QueryOuterClass.QueryInsuranceFundsResponse> {
  public override val descriptor: Descriptors.Descriptor =
      QueryOuterClass.QueryInsuranceFundsResponse.getDescriptor()

  public override val parser: Parser<QueryOuterClass.QueryInsuranceFundsResponse> =
      QueryOuterClass.QueryInsuranceFundsResponse.parser()

  public override fun convert(obj: QueryOuterClass.QueryInsuranceFundsResponse):
      QueryInsuranceFundsResponse = QueryInsuranceFundsResponse(
  	funds = obj.getFundsList().map { InsuranceFundJvmConverter.convert(it) },
  )

  public override fun convert(obj: QueryInsuranceFundsResponse):
      QueryOuterClass.QueryInsuranceFundsResponse {
    val builder = QueryOuterClass.QueryInsuranceFundsResponse.newBuilder()
    builder.addAllFunds(obj.funds.map { InsuranceFundJvmConverter.convert(it) })
    return builder.build()
  }
}

public object QueryEstimatedRedemptionsRequestJvmConverter :
    ProtobufTypeMapper<QueryEstimatedRedemptionsRequest, QueryOuterClass.QueryEstimatedRedemptionsRequest>
    {
  public override val descriptor: Descriptors.Descriptor =
      QueryOuterClass.QueryEstimatedRedemptionsRequest.getDescriptor()

  public override val parser: Parser<QueryOuterClass.QueryEstimatedRedemptionsRequest> =
      QueryOuterClass.QueryEstimatedRedemptionsRequest.parser()

  public override fun convert(obj: QueryOuterClass.QueryEstimatedRedemptionsRequest):
      QueryEstimatedRedemptionsRequest = QueryEstimatedRedemptionsRequest(
  	marketId = obj.getMarketId(),
  	address = obj.getAddress(),
  )

  public override fun convert(obj: QueryEstimatedRedemptionsRequest):
      QueryOuterClass.QueryEstimatedRedemptionsRequest {
    val builder = QueryOuterClass.QueryEstimatedRedemptionsRequest.newBuilder()
    builder.setMarketId(obj.marketId)
    builder.setAddress(obj.address)
    return builder.build()
  }
}

public object QueryEstimatedRedemptionsResponseJvmConverter :
    ProtobufTypeMapper<QueryEstimatedRedemptionsResponse, QueryOuterClass.QueryEstimatedRedemptionsResponse>
    {
  public override val descriptor: Descriptors.Descriptor =
      QueryOuterClass.QueryEstimatedRedemptionsResponse.getDescriptor()

  public override val parser: Parser<QueryOuterClass.QueryEstimatedRedemptionsResponse> =
      QueryOuterClass.QueryEstimatedRedemptionsResponse.parser()

  public override fun convert(obj: QueryOuterClass.QueryEstimatedRedemptionsResponse):
      QueryEstimatedRedemptionsResponse = QueryEstimatedRedemptionsResponse(
  	amount = obj.getAmountList().map { CoinJvmConverter.convert(it) },
  )

  public override fun convert(obj: QueryEstimatedRedemptionsResponse):
      QueryOuterClass.QueryEstimatedRedemptionsResponse {
    val builder = QueryOuterClass.QueryEstimatedRedemptionsResponse.newBuilder()
    builder.addAllAmount(obj.amount.map { CoinJvmConverter.convert(it) })
    return builder.build()
  }
}

public object QueryPendingRedemptionsRequestJvmConverter :
    ProtobufTypeMapper<QueryPendingRedemptionsRequest, QueryOuterClass.QueryPendingRedemptionsRequest>
    {
  public override val descriptor: Descriptors.Descriptor =
      QueryOuterClass.QueryPendingRedemptionsRequest.getDescriptor()

  public override val parser: Parser<QueryOuterClass.QueryPendingRedemptionsRequest> =
      QueryOuterClass.QueryPendingRedemptionsRequest.parser()

  public override fun convert(obj: QueryOuterClass.QueryPendingRedemptionsRequest):
      QueryPendingRedemptionsRequest = QueryPendingRedemptionsRequest(
  	marketId = obj.getMarketId(),
  	address = obj.getAddress(),
  )

  public override fun convert(obj: QueryPendingRedemptionsRequest):
      QueryOuterClass.QueryPendingRedemptionsRequest {
    val builder = QueryOuterClass.QueryPendingRedemptionsRequest.newBuilder()
    builder.setMarketId(obj.marketId)
    builder.setAddress(obj.address)
    return builder.build()
  }
}

public object QueryPendingRedemptionsResponseJvmConverter :
    ProtobufTypeMapper<QueryPendingRedemptionsResponse, QueryOuterClass.QueryPendingRedemptionsResponse>
    {
  public override val descriptor: Descriptors.Descriptor =
      QueryOuterClass.QueryPendingRedemptionsResponse.getDescriptor()

  public override val parser: Parser<QueryOuterClass.QueryPendingRedemptionsResponse> =
      QueryOuterClass.QueryPendingRedemptionsResponse.parser()

  public override fun convert(obj: QueryOuterClass.QueryPendingRedemptionsResponse):
      QueryPendingRedemptionsResponse = QueryPendingRedemptionsResponse(
  	amount = obj.getAmountList().map { CoinJvmConverter.convert(it) },
  )

  public override fun convert(obj: QueryPendingRedemptionsResponse):
      QueryOuterClass.QueryPendingRedemptionsResponse {
    val builder = QueryOuterClass.QueryPendingRedemptionsResponse.newBuilder()
    builder.addAllAmount(obj.amount.map { CoinJvmConverter.convert(it) })
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
