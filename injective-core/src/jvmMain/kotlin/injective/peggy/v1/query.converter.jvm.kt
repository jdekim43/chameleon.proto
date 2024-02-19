// Transform from injective/peggy/v1/query.proto
@file:GeneratorVersion(version = "0.3.1")

package injective.peggy.v1

import com.google.protobuf.Descriptors
import com.google.protobuf.Parser
import kr.jadekim.protobuf.`annotation`.GeneratorVersion
import kr.jadekim.protobuf.converter.mapper.ProtobufTypeMapper
import kr.jadekim.protobuf.util.asJavaType
import kr.jadekim.protobuf.util.asKotlinType

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

public object QueryCurrentValsetRequestJvmConverter :
    ProtobufTypeMapper<QueryCurrentValsetRequest, QueryOuterClass.QueryCurrentValsetRequest> {
  public override val descriptor: Descriptors.Descriptor =
      QueryOuterClass.QueryCurrentValsetRequest.getDescriptor()

  public override val parser: Parser<QueryOuterClass.QueryCurrentValsetRequest> =
      QueryOuterClass.QueryCurrentValsetRequest.parser()

  public override fun convert(obj: QueryOuterClass.QueryCurrentValsetRequest):
      QueryCurrentValsetRequest = QueryCurrentValsetRequest(
  )

  public override fun convert(obj: QueryCurrentValsetRequest):
      QueryOuterClass.QueryCurrentValsetRequest {
    val builder = QueryOuterClass.QueryCurrentValsetRequest.newBuilder()
    return builder.build()
  }
}

public object QueryCurrentValsetResponseJvmConverter :
    ProtobufTypeMapper<QueryCurrentValsetResponse, QueryOuterClass.QueryCurrentValsetResponse> {
  public override val descriptor: Descriptors.Descriptor =
      QueryOuterClass.QueryCurrentValsetResponse.getDescriptor()

  public override val parser: Parser<QueryOuterClass.QueryCurrentValsetResponse> =
      QueryOuterClass.QueryCurrentValsetResponse.parser()

  public override fun convert(obj: QueryOuterClass.QueryCurrentValsetResponse):
      QueryCurrentValsetResponse = QueryCurrentValsetResponse(
  	valset = ValsetJvmConverter.convert(obj.getValset()),
  )

  public override fun convert(obj: QueryCurrentValsetResponse):
      QueryOuterClass.QueryCurrentValsetResponse {
    val builder = QueryOuterClass.QueryCurrentValsetResponse.newBuilder()
    builder.setValset(ValsetJvmConverter.convert(obj.valset))
    return builder.build()
  }
}

public object QueryValsetRequestRequestJvmConverter :
    ProtobufTypeMapper<QueryValsetRequestRequest, QueryOuterClass.QueryValsetRequestRequest> {
  public override val descriptor: Descriptors.Descriptor =
      QueryOuterClass.QueryValsetRequestRequest.getDescriptor()

  public override val parser: Parser<QueryOuterClass.QueryValsetRequestRequest> =
      QueryOuterClass.QueryValsetRequestRequest.parser()

  public override fun convert(obj: QueryOuterClass.QueryValsetRequestRequest):
      QueryValsetRequestRequest = QueryValsetRequestRequest(
  	nonce = obj.getNonce().asKotlinType,
  )

  public override fun convert(obj: QueryValsetRequestRequest):
      QueryOuterClass.QueryValsetRequestRequest {
    val builder = QueryOuterClass.QueryValsetRequestRequest.newBuilder()
    builder.setNonce(obj.nonce.asJavaType)
    return builder.build()
  }
}

public object QueryValsetRequestResponseJvmConverter :
    ProtobufTypeMapper<QueryValsetRequestResponse, QueryOuterClass.QueryValsetRequestResponse> {
  public override val descriptor: Descriptors.Descriptor =
      QueryOuterClass.QueryValsetRequestResponse.getDescriptor()

  public override val parser: Parser<QueryOuterClass.QueryValsetRequestResponse> =
      QueryOuterClass.QueryValsetRequestResponse.parser()

  public override fun convert(obj: QueryOuterClass.QueryValsetRequestResponse):
      QueryValsetRequestResponse = QueryValsetRequestResponse(
  	valset = ValsetJvmConverter.convert(obj.getValset()),
  )

  public override fun convert(obj: QueryValsetRequestResponse):
      QueryOuterClass.QueryValsetRequestResponse {
    val builder = QueryOuterClass.QueryValsetRequestResponse.newBuilder()
    builder.setValset(ValsetJvmConverter.convert(obj.valset))
    return builder.build()
  }
}

public object QueryValsetConfirmRequestJvmConverter :
    ProtobufTypeMapper<QueryValsetConfirmRequest, QueryOuterClass.QueryValsetConfirmRequest> {
  public override val descriptor: Descriptors.Descriptor =
      QueryOuterClass.QueryValsetConfirmRequest.getDescriptor()

  public override val parser: Parser<QueryOuterClass.QueryValsetConfirmRequest> =
      QueryOuterClass.QueryValsetConfirmRequest.parser()

  public override fun convert(obj: QueryOuterClass.QueryValsetConfirmRequest):
      QueryValsetConfirmRequest = QueryValsetConfirmRequest(
  	nonce = obj.getNonce().asKotlinType,
  	address = obj.getAddress(),
  )

  public override fun convert(obj: QueryValsetConfirmRequest):
      QueryOuterClass.QueryValsetConfirmRequest {
    val builder = QueryOuterClass.QueryValsetConfirmRequest.newBuilder()
    builder.setNonce(obj.nonce.asJavaType)
    builder.setAddress(obj.address)
    return builder.build()
  }
}

public object QueryValsetConfirmResponseJvmConverter :
    ProtobufTypeMapper<QueryValsetConfirmResponse, QueryOuterClass.QueryValsetConfirmResponse> {
  public override val descriptor: Descriptors.Descriptor =
      QueryOuterClass.QueryValsetConfirmResponse.getDescriptor()

  public override val parser: Parser<QueryOuterClass.QueryValsetConfirmResponse> =
      QueryOuterClass.QueryValsetConfirmResponse.parser()

  public override fun convert(obj: QueryOuterClass.QueryValsetConfirmResponse):
      QueryValsetConfirmResponse = QueryValsetConfirmResponse(
  	confirm = MsgValsetConfirmJvmConverter.convert(obj.getConfirm()),
  )

  public override fun convert(obj: QueryValsetConfirmResponse):
      QueryOuterClass.QueryValsetConfirmResponse {
    val builder = QueryOuterClass.QueryValsetConfirmResponse.newBuilder()
    builder.setConfirm(MsgValsetConfirmJvmConverter.convert(obj.confirm))
    return builder.build()
  }
}

public object QueryValsetConfirmsByNonceRequestJvmConverter :
    ProtobufTypeMapper<QueryValsetConfirmsByNonceRequest, QueryOuterClass.QueryValsetConfirmsByNonceRequest>
    {
  public override val descriptor: Descriptors.Descriptor =
      QueryOuterClass.QueryValsetConfirmsByNonceRequest.getDescriptor()

  public override val parser: Parser<QueryOuterClass.QueryValsetConfirmsByNonceRequest> =
      QueryOuterClass.QueryValsetConfirmsByNonceRequest.parser()

  public override fun convert(obj: QueryOuterClass.QueryValsetConfirmsByNonceRequest):
      QueryValsetConfirmsByNonceRequest = QueryValsetConfirmsByNonceRequest(
  	nonce = obj.getNonce().asKotlinType,
  )

  public override fun convert(obj: QueryValsetConfirmsByNonceRequest):
      QueryOuterClass.QueryValsetConfirmsByNonceRequest {
    val builder = QueryOuterClass.QueryValsetConfirmsByNonceRequest.newBuilder()
    builder.setNonce(obj.nonce.asJavaType)
    return builder.build()
  }
}

public object QueryValsetConfirmsByNonceResponseJvmConverter :
    ProtobufTypeMapper<QueryValsetConfirmsByNonceResponse, QueryOuterClass.QueryValsetConfirmsByNonceResponse>
    {
  public override val descriptor: Descriptors.Descriptor =
      QueryOuterClass.QueryValsetConfirmsByNonceResponse.getDescriptor()

  public override val parser: Parser<QueryOuterClass.QueryValsetConfirmsByNonceResponse> =
      QueryOuterClass.QueryValsetConfirmsByNonceResponse.parser()

  public override fun convert(obj: QueryOuterClass.QueryValsetConfirmsByNonceResponse):
      QueryValsetConfirmsByNonceResponse = QueryValsetConfirmsByNonceResponse(
  	confirms = obj.getConfirmsList().map { MsgValsetConfirmJvmConverter.convert(it) },
  )

  public override fun convert(obj: QueryValsetConfirmsByNonceResponse):
      QueryOuterClass.QueryValsetConfirmsByNonceResponse {
    val builder = QueryOuterClass.QueryValsetConfirmsByNonceResponse.newBuilder()
    builder.addAllConfirms(obj.confirms.map { MsgValsetConfirmJvmConverter.convert(it) })
    return builder.build()
  }
}

public object QueryLastValsetRequestsRequestJvmConverter :
    ProtobufTypeMapper<QueryLastValsetRequestsRequest, QueryOuterClass.QueryLastValsetRequestsRequest>
    {
  public override val descriptor: Descriptors.Descriptor =
      QueryOuterClass.QueryLastValsetRequestsRequest.getDescriptor()

  public override val parser: Parser<QueryOuterClass.QueryLastValsetRequestsRequest> =
      QueryOuterClass.QueryLastValsetRequestsRequest.parser()

  public override fun convert(obj: QueryOuterClass.QueryLastValsetRequestsRequest):
      QueryLastValsetRequestsRequest = QueryLastValsetRequestsRequest(
  )

  public override fun convert(obj: QueryLastValsetRequestsRequest):
      QueryOuterClass.QueryLastValsetRequestsRequest {
    val builder = QueryOuterClass.QueryLastValsetRequestsRequest.newBuilder()
    return builder.build()
  }
}

public object QueryLastValsetRequestsResponseJvmConverter :
    ProtobufTypeMapper<QueryLastValsetRequestsResponse, QueryOuterClass.QueryLastValsetRequestsResponse>
    {
  public override val descriptor: Descriptors.Descriptor =
      QueryOuterClass.QueryLastValsetRequestsResponse.getDescriptor()

  public override val parser: Parser<QueryOuterClass.QueryLastValsetRequestsResponse> =
      QueryOuterClass.QueryLastValsetRequestsResponse.parser()

  public override fun convert(obj: QueryOuterClass.QueryLastValsetRequestsResponse):
      QueryLastValsetRequestsResponse = QueryLastValsetRequestsResponse(
  	valsets = obj.getValsetsList().map { ValsetJvmConverter.convert(it) },
  )

  public override fun convert(obj: QueryLastValsetRequestsResponse):
      QueryOuterClass.QueryLastValsetRequestsResponse {
    val builder = QueryOuterClass.QueryLastValsetRequestsResponse.newBuilder()
    builder.addAllValsets(obj.valsets.map { ValsetJvmConverter.convert(it) })
    return builder.build()
  }
}

public object QueryLastPendingValsetRequestByAddrRequestJvmConverter :
    ProtobufTypeMapper<QueryLastPendingValsetRequestByAddrRequest, QueryOuterClass.QueryLastPendingValsetRequestByAddrRequest>
    {
  public override val descriptor: Descriptors.Descriptor =
      QueryOuterClass.QueryLastPendingValsetRequestByAddrRequest.getDescriptor()

  public override val parser: Parser<QueryOuterClass.QueryLastPendingValsetRequestByAddrRequest> =
      QueryOuterClass.QueryLastPendingValsetRequestByAddrRequest.parser()

  public override fun convert(obj: QueryOuterClass.QueryLastPendingValsetRequestByAddrRequest):
      QueryLastPendingValsetRequestByAddrRequest = QueryLastPendingValsetRequestByAddrRequest(
  	address = obj.getAddress(),
  )

  public override fun convert(obj: QueryLastPendingValsetRequestByAddrRequest):
      QueryOuterClass.QueryLastPendingValsetRequestByAddrRequest {
    val builder = QueryOuterClass.QueryLastPendingValsetRequestByAddrRequest.newBuilder()
    builder.setAddress(obj.address)
    return builder.build()
  }
}

public object QueryLastPendingValsetRequestByAddrResponseJvmConverter :
    ProtobufTypeMapper<QueryLastPendingValsetRequestByAddrResponse, QueryOuterClass.QueryLastPendingValsetRequestByAddrResponse>
    {
  public override val descriptor: Descriptors.Descriptor =
      QueryOuterClass.QueryLastPendingValsetRequestByAddrResponse.getDescriptor()

  public override val parser: Parser<QueryOuterClass.QueryLastPendingValsetRequestByAddrResponse> =
      QueryOuterClass.QueryLastPendingValsetRequestByAddrResponse.parser()

  public override fun convert(obj: QueryOuterClass.QueryLastPendingValsetRequestByAddrResponse):
      QueryLastPendingValsetRequestByAddrResponse = QueryLastPendingValsetRequestByAddrResponse(
  	valsets = obj.getValsetsList().map { ValsetJvmConverter.convert(it) },
  )

  public override fun convert(obj: QueryLastPendingValsetRequestByAddrResponse):
      QueryOuterClass.QueryLastPendingValsetRequestByAddrResponse {
    val builder = QueryOuterClass.QueryLastPendingValsetRequestByAddrResponse.newBuilder()
    builder.addAllValsets(obj.valsets.map { ValsetJvmConverter.convert(it) })
    return builder.build()
  }
}

public object QueryBatchFeeRequestJvmConverter :
    ProtobufTypeMapper<QueryBatchFeeRequest, QueryOuterClass.QueryBatchFeeRequest> {
  public override val descriptor: Descriptors.Descriptor =
      QueryOuterClass.QueryBatchFeeRequest.getDescriptor()

  public override val parser: Parser<QueryOuterClass.QueryBatchFeeRequest> =
      QueryOuterClass.QueryBatchFeeRequest.parser()

  public override fun convert(obj: QueryOuterClass.QueryBatchFeeRequest): QueryBatchFeeRequest =
      QueryBatchFeeRequest(
  )

  public override fun convert(obj: QueryBatchFeeRequest): QueryOuterClass.QueryBatchFeeRequest {
    val builder = QueryOuterClass.QueryBatchFeeRequest.newBuilder()
    return builder.build()
  }
}

public object QueryBatchFeeResponseJvmConverter :
    ProtobufTypeMapper<QueryBatchFeeResponse, QueryOuterClass.QueryBatchFeeResponse> {
  public override val descriptor: Descriptors.Descriptor =
      QueryOuterClass.QueryBatchFeeResponse.getDescriptor()

  public override val parser: Parser<QueryOuterClass.QueryBatchFeeResponse> =
      QueryOuterClass.QueryBatchFeeResponse.parser()

  public override fun convert(obj: QueryOuterClass.QueryBatchFeeResponse): QueryBatchFeeResponse =
      QueryBatchFeeResponse(
  	batchFees = obj.getBatchFeesList().map { BatchFeesJvmConverter.convert(it) },
  )

  public override fun convert(obj: QueryBatchFeeResponse): QueryOuterClass.QueryBatchFeeResponse {
    val builder = QueryOuterClass.QueryBatchFeeResponse.newBuilder()
    builder.addAllBatchFees(obj.batchFees.map { BatchFeesJvmConverter.convert(it) })
    return builder.build()
  }
}

public object QueryLastPendingBatchRequestByAddrRequestJvmConverter :
    ProtobufTypeMapper<QueryLastPendingBatchRequestByAddrRequest, QueryOuterClass.QueryLastPendingBatchRequestByAddrRequest>
    {
  public override val descriptor: Descriptors.Descriptor =
      QueryOuterClass.QueryLastPendingBatchRequestByAddrRequest.getDescriptor()

  public override val parser: Parser<QueryOuterClass.QueryLastPendingBatchRequestByAddrRequest> =
      QueryOuterClass.QueryLastPendingBatchRequestByAddrRequest.parser()

  public override fun convert(obj: QueryOuterClass.QueryLastPendingBatchRequestByAddrRequest):
      QueryLastPendingBatchRequestByAddrRequest = QueryLastPendingBatchRequestByAddrRequest(
  	address = obj.getAddress(),
  )

  public override fun convert(obj: QueryLastPendingBatchRequestByAddrRequest):
      QueryOuterClass.QueryLastPendingBatchRequestByAddrRequest {
    val builder = QueryOuterClass.QueryLastPendingBatchRequestByAddrRequest.newBuilder()
    builder.setAddress(obj.address)
    return builder.build()
  }
}

public object QueryLastPendingBatchRequestByAddrResponseJvmConverter :
    ProtobufTypeMapper<QueryLastPendingBatchRequestByAddrResponse, QueryOuterClass.QueryLastPendingBatchRequestByAddrResponse>
    {
  public override val descriptor: Descriptors.Descriptor =
      QueryOuterClass.QueryLastPendingBatchRequestByAddrResponse.getDescriptor()

  public override val parser: Parser<QueryOuterClass.QueryLastPendingBatchRequestByAddrResponse> =
      QueryOuterClass.QueryLastPendingBatchRequestByAddrResponse.parser()

  public override fun convert(obj: QueryOuterClass.QueryLastPendingBatchRequestByAddrResponse):
      QueryLastPendingBatchRequestByAddrResponse = QueryLastPendingBatchRequestByAddrResponse(
  	batch = OutgoingTxBatchJvmConverter.convert(obj.getBatch()),
  )

  public override fun convert(obj: QueryLastPendingBatchRequestByAddrResponse):
      QueryOuterClass.QueryLastPendingBatchRequestByAddrResponse {
    val builder = QueryOuterClass.QueryLastPendingBatchRequestByAddrResponse.newBuilder()
    builder.setBatch(OutgoingTxBatchJvmConverter.convert(obj.batch))
    return builder.build()
  }
}

public object QueryOutgoingTxBatchesRequestJvmConverter :
    ProtobufTypeMapper<QueryOutgoingTxBatchesRequest, QueryOuterClass.QueryOutgoingTxBatchesRequest>
    {
  public override val descriptor: Descriptors.Descriptor =
      QueryOuterClass.QueryOutgoingTxBatchesRequest.getDescriptor()

  public override val parser: Parser<QueryOuterClass.QueryOutgoingTxBatchesRequest> =
      QueryOuterClass.QueryOutgoingTxBatchesRequest.parser()

  public override fun convert(obj: QueryOuterClass.QueryOutgoingTxBatchesRequest):
      QueryOutgoingTxBatchesRequest = QueryOutgoingTxBatchesRequest(
  )

  public override fun convert(obj: QueryOutgoingTxBatchesRequest):
      QueryOuterClass.QueryOutgoingTxBatchesRequest {
    val builder = QueryOuterClass.QueryOutgoingTxBatchesRequest.newBuilder()
    return builder.build()
  }
}

public object QueryOutgoingTxBatchesResponseJvmConverter :
    ProtobufTypeMapper<QueryOutgoingTxBatchesResponse, QueryOuterClass.QueryOutgoingTxBatchesResponse>
    {
  public override val descriptor: Descriptors.Descriptor =
      QueryOuterClass.QueryOutgoingTxBatchesResponse.getDescriptor()

  public override val parser: Parser<QueryOuterClass.QueryOutgoingTxBatchesResponse> =
      QueryOuterClass.QueryOutgoingTxBatchesResponse.parser()

  public override fun convert(obj: QueryOuterClass.QueryOutgoingTxBatchesResponse):
      QueryOutgoingTxBatchesResponse = QueryOutgoingTxBatchesResponse(
  	batches = obj.getBatchesList().map { OutgoingTxBatchJvmConverter.convert(it) },
  )

  public override fun convert(obj: QueryOutgoingTxBatchesResponse):
      QueryOuterClass.QueryOutgoingTxBatchesResponse {
    val builder = QueryOuterClass.QueryOutgoingTxBatchesResponse.newBuilder()
    builder.addAllBatches(obj.batches.map { OutgoingTxBatchJvmConverter.convert(it) })
    return builder.build()
  }
}

public object QueryBatchRequestByNonceRequestJvmConverter :
    ProtobufTypeMapper<QueryBatchRequestByNonceRequest, QueryOuterClass.QueryBatchRequestByNonceRequest>
    {
  public override val descriptor: Descriptors.Descriptor =
      QueryOuterClass.QueryBatchRequestByNonceRequest.getDescriptor()

  public override val parser: Parser<QueryOuterClass.QueryBatchRequestByNonceRequest> =
      QueryOuterClass.QueryBatchRequestByNonceRequest.parser()

  public override fun convert(obj: QueryOuterClass.QueryBatchRequestByNonceRequest):
      QueryBatchRequestByNonceRequest = QueryBatchRequestByNonceRequest(
  	nonce = obj.getNonce().asKotlinType,
  	contractAddress = obj.getContractAddress(),
  )

  public override fun convert(obj: QueryBatchRequestByNonceRequest):
      QueryOuterClass.QueryBatchRequestByNonceRequest {
    val builder = QueryOuterClass.QueryBatchRequestByNonceRequest.newBuilder()
    builder.setNonce(obj.nonce.asJavaType)
    builder.setContractAddress(obj.contractAddress)
    return builder.build()
  }
}

public object QueryBatchRequestByNonceResponseJvmConverter :
    ProtobufTypeMapper<QueryBatchRequestByNonceResponse, QueryOuterClass.QueryBatchRequestByNonceResponse>
    {
  public override val descriptor: Descriptors.Descriptor =
      QueryOuterClass.QueryBatchRequestByNonceResponse.getDescriptor()

  public override val parser: Parser<QueryOuterClass.QueryBatchRequestByNonceResponse> =
      QueryOuterClass.QueryBatchRequestByNonceResponse.parser()

  public override fun convert(obj: QueryOuterClass.QueryBatchRequestByNonceResponse):
      QueryBatchRequestByNonceResponse = QueryBatchRequestByNonceResponse(
  	batch = OutgoingTxBatchJvmConverter.convert(obj.getBatch()),
  )

  public override fun convert(obj: QueryBatchRequestByNonceResponse):
      QueryOuterClass.QueryBatchRequestByNonceResponse {
    val builder = QueryOuterClass.QueryBatchRequestByNonceResponse.newBuilder()
    builder.setBatch(OutgoingTxBatchJvmConverter.convert(obj.batch))
    return builder.build()
  }
}

public object QueryBatchConfirmsRequestJvmConverter :
    ProtobufTypeMapper<QueryBatchConfirmsRequest, QueryOuterClass.QueryBatchConfirmsRequest> {
  public override val descriptor: Descriptors.Descriptor =
      QueryOuterClass.QueryBatchConfirmsRequest.getDescriptor()

  public override val parser: Parser<QueryOuterClass.QueryBatchConfirmsRequest> =
      QueryOuterClass.QueryBatchConfirmsRequest.parser()

  public override fun convert(obj: QueryOuterClass.QueryBatchConfirmsRequest):
      QueryBatchConfirmsRequest = QueryBatchConfirmsRequest(
  	nonce = obj.getNonce().asKotlinType,
  	contractAddress = obj.getContractAddress(),
  )

  public override fun convert(obj: QueryBatchConfirmsRequest):
      QueryOuterClass.QueryBatchConfirmsRequest {
    val builder = QueryOuterClass.QueryBatchConfirmsRequest.newBuilder()
    builder.setNonce(obj.nonce.asJavaType)
    builder.setContractAddress(obj.contractAddress)
    return builder.build()
  }
}

public object QueryBatchConfirmsResponseJvmConverter :
    ProtobufTypeMapper<QueryBatchConfirmsResponse, QueryOuterClass.QueryBatchConfirmsResponse> {
  public override val descriptor: Descriptors.Descriptor =
      QueryOuterClass.QueryBatchConfirmsResponse.getDescriptor()

  public override val parser: Parser<QueryOuterClass.QueryBatchConfirmsResponse> =
      QueryOuterClass.QueryBatchConfirmsResponse.parser()

  public override fun convert(obj: QueryOuterClass.QueryBatchConfirmsResponse):
      QueryBatchConfirmsResponse = QueryBatchConfirmsResponse(
  	confirms = obj.getConfirmsList().map { MsgConfirmBatchJvmConverter.convert(it) },
  )

  public override fun convert(obj: QueryBatchConfirmsResponse):
      QueryOuterClass.QueryBatchConfirmsResponse {
    val builder = QueryOuterClass.QueryBatchConfirmsResponse.newBuilder()
    builder.addAllConfirms(obj.confirms.map { MsgConfirmBatchJvmConverter.convert(it) })
    return builder.build()
  }
}

public object QueryLastEventByAddrRequestJvmConverter :
    ProtobufTypeMapper<QueryLastEventByAddrRequest, QueryOuterClass.QueryLastEventByAddrRequest> {
  public override val descriptor: Descriptors.Descriptor =
      QueryOuterClass.QueryLastEventByAddrRequest.getDescriptor()

  public override val parser: Parser<QueryOuterClass.QueryLastEventByAddrRequest> =
      QueryOuterClass.QueryLastEventByAddrRequest.parser()

  public override fun convert(obj: QueryOuterClass.QueryLastEventByAddrRequest):
      QueryLastEventByAddrRequest = QueryLastEventByAddrRequest(
  	address = obj.getAddress(),
  )

  public override fun convert(obj: QueryLastEventByAddrRequest):
      QueryOuterClass.QueryLastEventByAddrRequest {
    val builder = QueryOuterClass.QueryLastEventByAddrRequest.newBuilder()
    builder.setAddress(obj.address)
    return builder.build()
  }
}

public object QueryLastEventByAddrResponseJvmConverter :
    ProtobufTypeMapper<QueryLastEventByAddrResponse, QueryOuterClass.QueryLastEventByAddrResponse> {
  public override val descriptor: Descriptors.Descriptor =
      QueryOuterClass.QueryLastEventByAddrResponse.getDescriptor()

  public override val parser: Parser<QueryOuterClass.QueryLastEventByAddrResponse> =
      QueryOuterClass.QueryLastEventByAddrResponse.parser()

  public override fun convert(obj: QueryOuterClass.QueryLastEventByAddrResponse):
      QueryLastEventByAddrResponse = QueryLastEventByAddrResponse(
  	lastClaimEvent = LastClaimEventJvmConverter.convert(obj.getLastClaimEvent()),
  )

  public override fun convert(obj: QueryLastEventByAddrResponse):
      QueryOuterClass.QueryLastEventByAddrResponse {
    val builder = QueryOuterClass.QueryLastEventByAddrResponse.newBuilder()
    builder.setLastClaimEvent(LastClaimEventJvmConverter.convert(obj.lastClaimEvent))
    return builder.build()
  }
}

public object QueryERC20ToDenomRequestJvmConverter :
    ProtobufTypeMapper<QueryERC20ToDenomRequest, QueryOuterClass.QueryERC20ToDenomRequest> {
  public override val descriptor: Descriptors.Descriptor =
      QueryOuterClass.QueryERC20ToDenomRequest.getDescriptor()

  public override val parser: Parser<QueryOuterClass.QueryERC20ToDenomRequest> =
      QueryOuterClass.QueryERC20ToDenomRequest.parser()

  public override fun convert(obj: QueryOuterClass.QueryERC20ToDenomRequest):
      QueryERC20ToDenomRequest = QueryERC20ToDenomRequest(
  	erc20 = obj.getErc20(),
  )

  public override fun convert(obj: QueryERC20ToDenomRequest):
      QueryOuterClass.QueryERC20ToDenomRequest {
    val builder = QueryOuterClass.QueryERC20ToDenomRequest.newBuilder()
    builder.setErc20(obj.erc20)
    return builder.build()
  }
}

public object QueryERC20ToDenomResponseJvmConverter :
    ProtobufTypeMapper<QueryERC20ToDenomResponse, QueryOuterClass.QueryERC20ToDenomResponse> {
  public override val descriptor: Descriptors.Descriptor =
      QueryOuterClass.QueryERC20ToDenomResponse.getDescriptor()

  public override val parser: Parser<QueryOuterClass.QueryERC20ToDenomResponse> =
      QueryOuterClass.QueryERC20ToDenomResponse.parser()

  public override fun convert(obj: QueryOuterClass.QueryERC20ToDenomResponse):
      QueryERC20ToDenomResponse = QueryERC20ToDenomResponse(
  	denom = obj.getDenom(),
  	cosmosOriginated = obj.getCosmosOriginated(),
  )

  public override fun convert(obj: QueryERC20ToDenomResponse):
      QueryOuterClass.QueryERC20ToDenomResponse {
    val builder = QueryOuterClass.QueryERC20ToDenomResponse.newBuilder()
    builder.setDenom(obj.denom)
    builder.setCosmosOriginated(obj.cosmosOriginated)
    return builder.build()
  }
}

public object QueryDenomToERC20RequestJvmConverter :
    ProtobufTypeMapper<QueryDenomToERC20Request, QueryOuterClass.QueryDenomToERC20Request> {
  public override val descriptor: Descriptors.Descriptor =
      QueryOuterClass.QueryDenomToERC20Request.getDescriptor()

  public override val parser: Parser<QueryOuterClass.QueryDenomToERC20Request> =
      QueryOuterClass.QueryDenomToERC20Request.parser()

  public override fun convert(obj: QueryOuterClass.QueryDenomToERC20Request):
      QueryDenomToERC20Request = QueryDenomToERC20Request(
  	denom = obj.getDenom(),
  )

  public override fun convert(obj: QueryDenomToERC20Request):
      QueryOuterClass.QueryDenomToERC20Request {
    val builder = QueryOuterClass.QueryDenomToERC20Request.newBuilder()
    builder.setDenom(obj.denom)
    return builder.build()
  }
}

public object QueryDenomToERC20ResponseJvmConverter :
    ProtobufTypeMapper<QueryDenomToERC20Response, QueryOuterClass.QueryDenomToERC20Response> {
  public override val descriptor: Descriptors.Descriptor =
      QueryOuterClass.QueryDenomToERC20Response.getDescriptor()

  public override val parser: Parser<QueryOuterClass.QueryDenomToERC20Response> =
      QueryOuterClass.QueryDenomToERC20Response.parser()

  public override fun convert(obj: QueryOuterClass.QueryDenomToERC20Response):
      QueryDenomToERC20Response = QueryDenomToERC20Response(
  	erc20 = obj.getErc20(),
  	cosmosOriginated = obj.getCosmosOriginated(),
  )

  public override fun convert(obj: QueryDenomToERC20Response):
      QueryOuterClass.QueryDenomToERC20Response {
    val builder = QueryOuterClass.QueryDenomToERC20Response.newBuilder()
    builder.setErc20(obj.erc20)
    builder.setCosmosOriginated(obj.cosmosOriginated)
    return builder.build()
  }
}

public object QueryDelegateKeysByValidatorAddressJvmConverter :
    ProtobufTypeMapper<QueryDelegateKeysByValidatorAddress, QueryOuterClass.QueryDelegateKeysByValidatorAddress>
    {
  public override val descriptor: Descriptors.Descriptor =
      QueryOuterClass.QueryDelegateKeysByValidatorAddress.getDescriptor()

  public override val parser: Parser<QueryOuterClass.QueryDelegateKeysByValidatorAddress> =
      QueryOuterClass.QueryDelegateKeysByValidatorAddress.parser()

  public override fun convert(obj: QueryOuterClass.QueryDelegateKeysByValidatorAddress):
      QueryDelegateKeysByValidatorAddress = QueryDelegateKeysByValidatorAddress(
  	validatorAddress = obj.getValidatorAddress(),
  )

  public override fun convert(obj: QueryDelegateKeysByValidatorAddress):
      QueryOuterClass.QueryDelegateKeysByValidatorAddress {
    val builder = QueryOuterClass.QueryDelegateKeysByValidatorAddress.newBuilder()
    builder.setValidatorAddress(obj.validatorAddress)
    return builder.build()
  }
}

public object QueryDelegateKeysByValidatorAddressResponseJvmConverter :
    ProtobufTypeMapper<QueryDelegateKeysByValidatorAddressResponse, QueryOuterClass.QueryDelegateKeysByValidatorAddressResponse>
    {
  public override val descriptor: Descriptors.Descriptor =
      QueryOuterClass.QueryDelegateKeysByValidatorAddressResponse.getDescriptor()

  public override val parser: Parser<QueryOuterClass.QueryDelegateKeysByValidatorAddressResponse> =
      QueryOuterClass.QueryDelegateKeysByValidatorAddressResponse.parser()

  public override fun convert(obj: QueryOuterClass.QueryDelegateKeysByValidatorAddressResponse):
      QueryDelegateKeysByValidatorAddressResponse = QueryDelegateKeysByValidatorAddressResponse(
  	ethAddress = obj.getEthAddress(),
  	orchestratorAddress = obj.getOrchestratorAddress(),
  )

  public override fun convert(obj: QueryDelegateKeysByValidatorAddressResponse):
      QueryOuterClass.QueryDelegateKeysByValidatorAddressResponse {
    val builder = QueryOuterClass.QueryDelegateKeysByValidatorAddressResponse.newBuilder()
    builder.setEthAddress(obj.ethAddress)
    builder.setOrchestratorAddress(obj.orchestratorAddress)
    return builder.build()
  }
}

public object QueryDelegateKeysByEthAddressJvmConverter :
    ProtobufTypeMapper<QueryDelegateKeysByEthAddress, QueryOuterClass.QueryDelegateKeysByEthAddress>
    {
  public override val descriptor: Descriptors.Descriptor =
      QueryOuterClass.QueryDelegateKeysByEthAddress.getDescriptor()

  public override val parser: Parser<QueryOuterClass.QueryDelegateKeysByEthAddress> =
      QueryOuterClass.QueryDelegateKeysByEthAddress.parser()

  public override fun convert(obj: QueryOuterClass.QueryDelegateKeysByEthAddress):
      QueryDelegateKeysByEthAddress = QueryDelegateKeysByEthAddress(
  	ethAddress = obj.getEthAddress(),
  )

  public override fun convert(obj: QueryDelegateKeysByEthAddress):
      QueryOuterClass.QueryDelegateKeysByEthAddress {
    val builder = QueryOuterClass.QueryDelegateKeysByEthAddress.newBuilder()
    builder.setEthAddress(obj.ethAddress)
    return builder.build()
  }
}

public object QueryDelegateKeysByEthAddressResponseJvmConverter :
    ProtobufTypeMapper<QueryDelegateKeysByEthAddressResponse, QueryOuterClass.QueryDelegateKeysByEthAddressResponse>
    {
  public override val descriptor: Descriptors.Descriptor =
      QueryOuterClass.QueryDelegateKeysByEthAddressResponse.getDescriptor()

  public override val parser: Parser<QueryOuterClass.QueryDelegateKeysByEthAddressResponse> =
      QueryOuterClass.QueryDelegateKeysByEthAddressResponse.parser()

  public override fun convert(obj: QueryOuterClass.QueryDelegateKeysByEthAddressResponse):
      QueryDelegateKeysByEthAddressResponse = QueryDelegateKeysByEthAddressResponse(
  	validatorAddress = obj.getValidatorAddress(),
  	orchestratorAddress = obj.getOrchestratorAddress(),
  )

  public override fun convert(obj: QueryDelegateKeysByEthAddressResponse):
      QueryOuterClass.QueryDelegateKeysByEthAddressResponse {
    val builder = QueryOuterClass.QueryDelegateKeysByEthAddressResponse.newBuilder()
    builder.setValidatorAddress(obj.validatorAddress)
    builder.setOrchestratorAddress(obj.orchestratorAddress)
    return builder.build()
  }
}

public object QueryDelegateKeysByOrchestratorAddressJvmConverter :
    ProtobufTypeMapper<QueryDelegateKeysByOrchestratorAddress, QueryOuterClass.QueryDelegateKeysByOrchestratorAddress>
    {
  public override val descriptor: Descriptors.Descriptor =
      QueryOuterClass.QueryDelegateKeysByOrchestratorAddress.getDescriptor()

  public override val parser: Parser<QueryOuterClass.QueryDelegateKeysByOrchestratorAddress> =
      QueryOuterClass.QueryDelegateKeysByOrchestratorAddress.parser()

  public override fun convert(obj: QueryOuterClass.QueryDelegateKeysByOrchestratorAddress):
      QueryDelegateKeysByOrchestratorAddress = QueryDelegateKeysByOrchestratorAddress(
  	orchestratorAddress = obj.getOrchestratorAddress(),
  )

  public override fun convert(obj: QueryDelegateKeysByOrchestratorAddress):
      QueryOuterClass.QueryDelegateKeysByOrchestratorAddress {
    val builder = QueryOuterClass.QueryDelegateKeysByOrchestratorAddress.newBuilder()
    builder.setOrchestratorAddress(obj.orchestratorAddress)
    return builder.build()
  }
}

public object QueryDelegateKeysByOrchestratorAddressResponseJvmConverter :
    ProtobufTypeMapper<QueryDelegateKeysByOrchestratorAddressResponse, QueryOuterClass.QueryDelegateKeysByOrchestratorAddressResponse>
    {
  public override val descriptor: Descriptors.Descriptor =
      QueryOuterClass.QueryDelegateKeysByOrchestratorAddressResponse.getDescriptor()

  public override val parser: Parser<QueryOuterClass.QueryDelegateKeysByOrchestratorAddressResponse>
      = QueryOuterClass.QueryDelegateKeysByOrchestratorAddressResponse.parser()

  public override fun convert(obj: QueryOuterClass.QueryDelegateKeysByOrchestratorAddressResponse):
      QueryDelegateKeysByOrchestratorAddressResponse =
      QueryDelegateKeysByOrchestratorAddressResponse(
  	validatorAddress = obj.getValidatorAddress(),
  	ethAddress = obj.getEthAddress(),
  )

  public override fun convert(obj: QueryDelegateKeysByOrchestratorAddressResponse):
      QueryOuterClass.QueryDelegateKeysByOrchestratorAddressResponse {
    val builder = QueryOuterClass.QueryDelegateKeysByOrchestratorAddressResponse.newBuilder()
    builder.setValidatorAddress(obj.validatorAddress)
    builder.setEthAddress(obj.ethAddress)
    return builder.build()
  }
}

public object QueryPendingSendToEthJvmConverter :
    ProtobufTypeMapper<QueryPendingSendToEth, QueryOuterClass.QueryPendingSendToEth> {
  public override val descriptor: Descriptors.Descriptor =
      QueryOuterClass.QueryPendingSendToEth.getDescriptor()

  public override val parser: Parser<QueryOuterClass.QueryPendingSendToEth> =
      QueryOuterClass.QueryPendingSendToEth.parser()

  public override fun convert(obj: QueryOuterClass.QueryPendingSendToEth): QueryPendingSendToEth =
      QueryPendingSendToEth(
  	senderAddress = obj.getSenderAddress(),
  )

  public override fun convert(obj: QueryPendingSendToEth): QueryOuterClass.QueryPendingSendToEth {
    val builder = QueryOuterClass.QueryPendingSendToEth.newBuilder()
    builder.setSenderAddress(obj.senderAddress)
    return builder.build()
  }
}

public object QueryPendingSendToEthResponseJvmConverter :
    ProtobufTypeMapper<QueryPendingSendToEthResponse, QueryOuterClass.QueryPendingSendToEthResponse>
    {
  public override val descriptor: Descriptors.Descriptor =
      QueryOuterClass.QueryPendingSendToEthResponse.getDescriptor()

  public override val parser: Parser<QueryOuterClass.QueryPendingSendToEthResponse> =
      QueryOuterClass.QueryPendingSendToEthResponse.parser()

  public override fun convert(obj: QueryOuterClass.QueryPendingSendToEthResponse):
      QueryPendingSendToEthResponse = QueryPendingSendToEthResponse(
  	transfersInBatches = obj.getTransfersInBatchesList().map {
      OutgoingTransferTxJvmConverter.convert(it) },
  	unbatchedTransfers = obj.getUnbatchedTransfersList().map {
      OutgoingTransferTxJvmConverter.convert(it) },
  )

  public override fun convert(obj: QueryPendingSendToEthResponse):
      QueryOuterClass.QueryPendingSendToEthResponse {
    val builder = QueryOuterClass.QueryPendingSendToEthResponse.newBuilder()
    builder.addAllTransfersInBatches(obj.transfersInBatches.map {
        OutgoingTransferTxJvmConverter.convert(it) })
    builder.addAllUnbatchedTransfers(obj.unbatchedTransfers.map {
        OutgoingTransferTxJvmConverter.convert(it) })
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

public object MissingNoncesRequestJvmConverter :
    ProtobufTypeMapper<MissingNoncesRequest, QueryOuterClass.MissingNoncesRequest> {
  public override val descriptor: Descriptors.Descriptor =
      QueryOuterClass.MissingNoncesRequest.getDescriptor()

  public override val parser: Parser<QueryOuterClass.MissingNoncesRequest> =
      QueryOuterClass.MissingNoncesRequest.parser()

  public override fun convert(obj: QueryOuterClass.MissingNoncesRequest): MissingNoncesRequest =
      MissingNoncesRequest(
  )

  public override fun convert(obj: MissingNoncesRequest): QueryOuterClass.MissingNoncesRequest {
    val builder = QueryOuterClass.MissingNoncesRequest.newBuilder()
    return builder.build()
  }
}

public object MissingNoncesResponseJvmConverter :
    ProtobufTypeMapper<MissingNoncesResponse, QueryOuterClass.MissingNoncesResponse> {
  public override val descriptor: Descriptors.Descriptor =
      QueryOuterClass.MissingNoncesResponse.getDescriptor()

  public override val parser: Parser<QueryOuterClass.MissingNoncesResponse> =
      QueryOuterClass.MissingNoncesResponse.parser()

  public override fun convert(obj: QueryOuterClass.MissingNoncesResponse): MissingNoncesResponse =
      MissingNoncesResponse(
  	operatorAddresses = obj.getOperatorAddressesList().map { it },
  )

  public override fun convert(obj: MissingNoncesResponse): QueryOuterClass.MissingNoncesResponse {
    val builder = QueryOuterClass.MissingNoncesResponse.newBuilder()
    builder.addAllOperatorAddresses(obj.operatorAddresses.map { it })
    return builder.build()
  }
}
