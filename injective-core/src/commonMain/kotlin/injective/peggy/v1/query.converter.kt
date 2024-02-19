// Transform from injective/peggy/v1/query.proto
@file:GeneratorVersion(version = "0.3.1")

package injective.peggy.v1

import google.protobuf.Any
import java.lang.IllegalStateException
import kr.jadekim.protobuf.`annotation`.GeneratorVersion
import kr.jadekim.protobuf.converter.ProtobufConverter
import kr.jadekim.protobuf.converter.parseProtobuf

public expect object QueryParamsRequestConverter : ProtobufConverter<QueryParamsRequest>

public fun QueryParamsRequest.toAny(): Any = Any(QueryParamsRequest.TYPE_URL,
    with(QueryParamsRequestConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<QueryParamsRequest>): QueryParamsRequest {
  if (typeUrl != QueryParamsRequest.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object QueryParamsResponseConverter : ProtobufConverter<QueryParamsResponse>

public fun QueryParamsResponse.toAny(): Any = Any(QueryParamsResponse.TYPE_URL,
    with(QueryParamsResponseConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<QueryParamsResponse>): QueryParamsResponse {
  if (typeUrl != QueryParamsResponse.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object QueryCurrentValsetRequestConverter :
    ProtobufConverter<QueryCurrentValsetRequest>

public fun QueryCurrentValsetRequest.toAny(): Any = Any(QueryCurrentValsetRequest.TYPE_URL,
    with(QueryCurrentValsetRequestConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<QueryCurrentValsetRequest>):
    QueryCurrentValsetRequest {
  if (typeUrl != QueryCurrentValsetRequest.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object QueryCurrentValsetResponseConverter :
    ProtobufConverter<QueryCurrentValsetResponse>

public fun QueryCurrentValsetResponse.toAny(): Any = Any(QueryCurrentValsetResponse.TYPE_URL,
    with(QueryCurrentValsetResponseConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<QueryCurrentValsetResponse>):
    QueryCurrentValsetResponse {
  if (typeUrl != QueryCurrentValsetResponse.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object QueryValsetRequestRequestConverter :
    ProtobufConverter<QueryValsetRequestRequest>

public fun QueryValsetRequestRequest.toAny(): Any = Any(QueryValsetRequestRequest.TYPE_URL,
    with(QueryValsetRequestRequestConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<QueryValsetRequestRequest>):
    QueryValsetRequestRequest {
  if (typeUrl != QueryValsetRequestRequest.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object QueryValsetRequestResponseConverter :
    ProtobufConverter<QueryValsetRequestResponse>

public fun QueryValsetRequestResponse.toAny(): Any = Any(QueryValsetRequestResponse.TYPE_URL,
    with(QueryValsetRequestResponseConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<QueryValsetRequestResponse>):
    QueryValsetRequestResponse {
  if (typeUrl != QueryValsetRequestResponse.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object QueryValsetConfirmRequestConverter :
    ProtobufConverter<QueryValsetConfirmRequest>

public fun QueryValsetConfirmRequest.toAny(): Any = Any(QueryValsetConfirmRequest.TYPE_URL,
    with(QueryValsetConfirmRequestConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<QueryValsetConfirmRequest>):
    QueryValsetConfirmRequest {
  if (typeUrl != QueryValsetConfirmRequest.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object QueryValsetConfirmResponseConverter :
    ProtobufConverter<QueryValsetConfirmResponse>

public fun QueryValsetConfirmResponse.toAny(): Any = Any(QueryValsetConfirmResponse.TYPE_URL,
    with(QueryValsetConfirmResponseConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<QueryValsetConfirmResponse>):
    QueryValsetConfirmResponse {
  if (typeUrl != QueryValsetConfirmResponse.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object QueryValsetConfirmsByNonceRequestConverter :
    ProtobufConverter<QueryValsetConfirmsByNonceRequest>

public fun QueryValsetConfirmsByNonceRequest.toAny(): Any =
    Any(QueryValsetConfirmsByNonceRequest.TYPE_URL, with(QueryValsetConfirmsByNonceRequestConverter)
    { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<QueryValsetConfirmsByNonceRequest>):
    QueryValsetConfirmsByNonceRequest {
  if (typeUrl != QueryValsetConfirmsByNonceRequest.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object QueryValsetConfirmsByNonceResponseConverter :
    ProtobufConverter<QueryValsetConfirmsByNonceResponse>

public fun QueryValsetConfirmsByNonceResponse.toAny(): Any =
    Any(QueryValsetConfirmsByNonceResponse.TYPE_URL,
    with(QueryValsetConfirmsByNonceResponseConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<QueryValsetConfirmsByNonceResponse>):
    QueryValsetConfirmsByNonceResponse {
  if (typeUrl != QueryValsetConfirmsByNonceResponse.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object QueryLastValsetRequestsRequestConverter :
    ProtobufConverter<QueryLastValsetRequestsRequest>

public fun QueryLastValsetRequestsRequest.toAny(): Any =
    Any(QueryLastValsetRequestsRequest.TYPE_URL, with(QueryLastValsetRequestsRequestConverter) {
    toByteArray() })

public fun Any.parse(converter: ProtobufConverter<QueryLastValsetRequestsRequest>):
    QueryLastValsetRequestsRequest {
  if (typeUrl != QueryLastValsetRequestsRequest.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object QueryLastValsetRequestsResponseConverter :
    ProtobufConverter<QueryLastValsetRequestsResponse>

public fun QueryLastValsetRequestsResponse.toAny(): Any =
    Any(QueryLastValsetRequestsResponse.TYPE_URL, with(QueryLastValsetRequestsResponseConverter) {
    toByteArray() })

public fun Any.parse(converter: ProtobufConverter<QueryLastValsetRequestsResponse>):
    QueryLastValsetRequestsResponse {
  if (typeUrl != QueryLastValsetRequestsResponse.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object QueryLastPendingValsetRequestByAddrRequestConverter :
    ProtobufConverter<QueryLastPendingValsetRequestByAddrRequest>

public fun QueryLastPendingValsetRequestByAddrRequest.toAny(): Any =
    Any(QueryLastPendingValsetRequestByAddrRequest.TYPE_URL,
    with(QueryLastPendingValsetRequestByAddrRequestConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<QueryLastPendingValsetRequestByAddrRequest>):
    QueryLastPendingValsetRequestByAddrRequest {
  if (typeUrl != QueryLastPendingValsetRequestByAddrRequest.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object QueryLastPendingValsetRequestByAddrResponseConverter :
    ProtobufConverter<QueryLastPendingValsetRequestByAddrResponse>

public fun QueryLastPendingValsetRequestByAddrResponse.toAny(): Any =
    Any(QueryLastPendingValsetRequestByAddrResponse.TYPE_URL,
    with(QueryLastPendingValsetRequestByAddrResponseConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<QueryLastPendingValsetRequestByAddrResponse>):
    QueryLastPendingValsetRequestByAddrResponse {
  if (typeUrl != QueryLastPendingValsetRequestByAddrResponse.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object QueryBatchFeeRequestConverter : ProtobufConverter<QueryBatchFeeRequest>

public fun QueryBatchFeeRequest.toAny(): Any = Any(QueryBatchFeeRequest.TYPE_URL,
    with(QueryBatchFeeRequestConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<QueryBatchFeeRequest>): QueryBatchFeeRequest {
  if (typeUrl != QueryBatchFeeRequest.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object QueryBatchFeeResponseConverter : ProtobufConverter<QueryBatchFeeResponse>

public fun QueryBatchFeeResponse.toAny(): Any = Any(QueryBatchFeeResponse.TYPE_URL,
    with(QueryBatchFeeResponseConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<QueryBatchFeeResponse>): QueryBatchFeeResponse {
  if (typeUrl != QueryBatchFeeResponse.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object QueryLastPendingBatchRequestByAddrRequestConverter :
    ProtobufConverter<QueryLastPendingBatchRequestByAddrRequest>

public fun QueryLastPendingBatchRequestByAddrRequest.toAny(): Any =
    Any(QueryLastPendingBatchRequestByAddrRequest.TYPE_URL,
    with(QueryLastPendingBatchRequestByAddrRequestConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<QueryLastPendingBatchRequestByAddrRequest>):
    QueryLastPendingBatchRequestByAddrRequest {
  if (typeUrl != QueryLastPendingBatchRequestByAddrRequest.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object QueryLastPendingBatchRequestByAddrResponseConverter :
    ProtobufConverter<QueryLastPendingBatchRequestByAddrResponse>

public fun QueryLastPendingBatchRequestByAddrResponse.toAny(): Any =
    Any(QueryLastPendingBatchRequestByAddrResponse.TYPE_URL,
    with(QueryLastPendingBatchRequestByAddrResponseConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<QueryLastPendingBatchRequestByAddrResponse>):
    QueryLastPendingBatchRequestByAddrResponse {
  if (typeUrl != QueryLastPendingBatchRequestByAddrResponse.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object QueryOutgoingTxBatchesRequestConverter :
    ProtobufConverter<QueryOutgoingTxBatchesRequest>

public fun QueryOutgoingTxBatchesRequest.toAny(): Any = Any(QueryOutgoingTxBatchesRequest.TYPE_URL,
    with(QueryOutgoingTxBatchesRequestConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<QueryOutgoingTxBatchesRequest>):
    QueryOutgoingTxBatchesRequest {
  if (typeUrl != QueryOutgoingTxBatchesRequest.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object QueryOutgoingTxBatchesResponseConverter :
    ProtobufConverter<QueryOutgoingTxBatchesResponse>

public fun QueryOutgoingTxBatchesResponse.toAny(): Any =
    Any(QueryOutgoingTxBatchesResponse.TYPE_URL, with(QueryOutgoingTxBatchesResponseConverter) {
    toByteArray() })

public fun Any.parse(converter: ProtobufConverter<QueryOutgoingTxBatchesResponse>):
    QueryOutgoingTxBatchesResponse {
  if (typeUrl != QueryOutgoingTxBatchesResponse.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object QueryBatchRequestByNonceRequestConverter :
    ProtobufConverter<QueryBatchRequestByNonceRequest>

public fun QueryBatchRequestByNonceRequest.toAny(): Any =
    Any(QueryBatchRequestByNonceRequest.TYPE_URL, with(QueryBatchRequestByNonceRequestConverter) {
    toByteArray() })

public fun Any.parse(converter: ProtobufConverter<QueryBatchRequestByNonceRequest>):
    QueryBatchRequestByNonceRequest {
  if (typeUrl != QueryBatchRequestByNonceRequest.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object QueryBatchRequestByNonceResponseConverter :
    ProtobufConverter<QueryBatchRequestByNonceResponse>

public fun QueryBatchRequestByNonceResponse.toAny(): Any =
    Any(QueryBatchRequestByNonceResponse.TYPE_URL, with(QueryBatchRequestByNonceResponseConverter) {
    toByteArray() })

public fun Any.parse(converter: ProtobufConverter<QueryBatchRequestByNonceResponse>):
    QueryBatchRequestByNonceResponse {
  if (typeUrl != QueryBatchRequestByNonceResponse.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object QueryBatchConfirmsRequestConverter :
    ProtobufConverter<QueryBatchConfirmsRequest>

public fun QueryBatchConfirmsRequest.toAny(): Any = Any(QueryBatchConfirmsRequest.TYPE_URL,
    with(QueryBatchConfirmsRequestConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<QueryBatchConfirmsRequest>):
    QueryBatchConfirmsRequest {
  if (typeUrl != QueryBatchConfirmsRequest.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object QueryBatchConfirmsResponseConverter :
    ProtobufConverter<QueryBatchConfirmsResponse>

public fun QueryBatchConfirmsResponse.toAny(): Any = Any(QueryBatchConfirmsResponse.TYPE_URL,
    with(QueryBatchConfirmsResponseConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<QueryBatchConfirmsResponse>):
    QueryBatchConfirmsResponse {
  if (typeUrl != QueryBatchConfirmsResponse.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object QueryLastEventByAddrRequestConverter :
    ProtobufConverter<QueryLastEventByAddrRequest>

public fun QueryLastEventByAddrRequest.toAny(): Any = Any(QueryLastEventByAddrRequest.TYPE_URL,
    with(QueryLastEventByAddrRequestConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<QueryLastEventByAddrRequest>):
    QueryLastEventByAddrRequest {
  if (typeUrl != QueryLastEventByAddrRequest.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object QueryLastEventByAddrResponseConverter :
    ProtobufConverter<QueryLastEventByAddrResponse>

public fun QueryLastEventByAddrResponse.toAny(): Any = Any(QueryLastEventByAddrResponse.TYPE_URL,
    with(QueryLastEventByAddrResponseConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<QueryLastEventByAddrResponse>):
    QueryLastEventByAddrResponse {
  if (typeUrl != QueryLastEventByAddrResponse.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object QueryERC20ToDenomRequestConverter : ProtobufConverter<QueryERC20ToDenomRequest>

public fun QueryERC20ToDenomRequest.toAny(): Any = Any(QueryERC20ToDenomRequest.TYPE_URL,
    with(QueryERC20ToDenomRequestConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<QueryERC20ToDenomRequest>):
    QueryERC20ToDenomRequest {
  if (typeUrl != QueryERC20ToDenomRequest.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object QueryERC20ToDenomResponseConverter :
    ProtobufConverter<QueryERC20ToDenomResponse>

public fun QueryERC20ToDenomResponse.toAny(): Any = Any(QueryERC20ToDenomResponse.TYPE_URL,
    with(QueryERC20ToDenomResponseConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<QueryERC20ToDenomResponse>):
    QueryERC20ToDenomResponse {
  if (typeUrl != QueryERC20ToDenomResponse.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object QueryDenomToERC20RequestConverter : ProtobufConverter<QueryDenomToERC20Request>

public fun QueryDenomToERC20Request.toAny(): Any = Any(QueryDenomToERC20Request.TYPE_URL,
    with(QueryDenomToERC20RequestConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<QueryDenomToERC20Request>):
    QueryDenomToERC20Request {
  if (typeUrl != QueryDenomToERC20Request.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object QueryDenomToERC20ResponseConverter :
    ProtobufConverter<QueryDenomToERC20Response>

public fun QueryDenomToERC20Response.toAny(): Any = Any(QueryDenomToERC20Response.TYPE_URL,
    with(QueryDenomToERC20ResponseConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<QueryDenomToERC20Response>):
    QueryDenomToERC20Response {
  if (typeUrl != QueryDenomToERC20Response.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object QueryDelegateKeysByValidatorAddressConverter :
    ProtobufConverter<QueryDelegateKeysByValidatorAddress>

public fun QueryDelegateKeysByValidatorAddress.toAny(): Any =
    Any(QueryDelegateKeysByValidatorAddress.TYPE_URL,
    with(QueryDelegateKeysByValidatorAddressConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<QueryDelegateKeysByValidatorAddress>):
    QueryDelegateKeysByValidatorAddress {
  if (typeUrl != QueryDelegateKeysByValidatorAddress.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object QueryDelegateKeysByValidatorAddressResponseConverter :
    ProtobufConverter<QueryDelegateKeysByValidatorAddressResponse>

public fun QueryDelegateKeysByValidatorAddressResponse.toAny(): Any =
    Any(QueryDelegateKeysByValidatorAddressResponse.TYPE_URL,
    with(QueryDelegateKeysByValidatorAddressResponseConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<QueryDelegateKeysByValidatorAddressResponse>):
    QueryDelegateKeysByValidatorAddressResponse {
  if (typeUrl != QueryDelegateKeysByValidatorAddressResponse.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object QueryDelegateKeysByEthAddressConverter :
    ProtobufConverter<QueryDelegateKeysByEthAddress>

public fun QueryDelegateKeysByEthAddress.toAny(): Any = Any(QueryDelegateKeysByEthAddress.TYPE_URL,
    with(QueryDelegateKeysByEthAddressConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<QueryDelegateKeysByEthAddress>):
    QueryDelegateKeysByEthAddress {
  if (typeUrl != QueryDelegateKeysByEthAddress.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object QueryDelegateKeysByEthAddressResponseConverter :
    ProtobufConverter<QueryDelegateKeysByEthAddressResponse>

public fun QueryDelegateKeysByEthAddressResponse.toAny(): Any =
    Any(QueryDelegateKeysByEthAddressResponse.TYPE_URL,
    with(QueryDelegateKeysByEthAddressResponseConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<QueryDelegateKeysByEthAddressResponse>):
    QueryDelegateKeysByEthAddressResponse {
  if (typeUrl != QueryDelegateKeysByEthAddressResponse.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object QueryDelegateKeysByOrchestratorAddressConverter :
    ProtobufConverter<QueryDelegateKeysByOrchestratorAddress>

public fun QueryDelegateKeysByOrchestratorAddress.toAny(): Any =
    Any(QueryDelegateKeysByOrchestratorAddress.TYPE_URL,
    with(QueryDelegateKeysByOrchestratorAddressConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<QueryDelegateKeysByOrchestratorAddress>):
    QueryDelegateKeysByOrchestratorAddress {
  if (typeUrl != QueryDelegateKeysByOrchestratorAddress.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object QueryDelegateKeysByOrchestratorAddressResponseConverter :
    ProtobufConverter<QueryDelegateKeysByOrchestratorAddressResponse>

public fun QueryDelegateKeysByOrchestratorAddressResponse.toAny(): Any =
    Any(QueryDelegateKeysByOrchestratorAddressResponse.TYPE_URL,
    with(QueryDelegateKeysByOrchestratorAddressResponseConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<QueryDelegateKeysByOrchestratorAddressResponse>):
    QueryDelegateKeysByOrchestratorAddressResponse {
  if (typeUrl != QueryDelegateKeysByOrchestratorAddressResponse.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object QueryPendingSendToEthConverter : ProtobufConverter<QueryPendingSendToEth>

public fun QueryPendingSendToEth.toAny(): Any = Any(QueryPendingSendToEth.TYPE_URL,
    with(QueryPendingSendToEthConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<QueryPendingSendToEth>): QueryPendingSendToEth {
  if (typeUrl != QueryPendingSendToEth.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object QueryPendingSendToEthResponseConverter :
    ProtobufConverter<QueryPendingSendToEthResponse>

public fun QueryPendingSendToEthResponse.toAny(): Any = Any(QueryPendingSendToEthResponse.TYPE_URL,
    with(QueryPendingSendToEthResponseConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<QueryPendingSendToEthResponse>):
    QueryPendingSendToEthResponse {
  if (typeUrl != QueryPendingSendToEthResponse.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object QueryModuleStateRequestConverter : ProtobufConverter<QueryModuleStateRequest>

public fun QueryModuleStateRequest.toAny(): Any = Any(QueryModuleStateRequest.TYPE_URL,
    with(QueryModuleStateRequestConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<QueryModuleStateRequest>):
    QueryModuleStateRequest {
  if (typeUrl != QueryModuleStateRequest.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object QueryModuleStateResponseConverter : ProtobufConverter<QueryModuleStateResponse>

public fun QueryModuleStateResponse.toAny(): Any = Any(QueryModuleStateResponse.TYPE_URL,
    with(QueryModuleStateResponseConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<QueryModuleStateResponse>):
    QueryModuleStateResponse {
  if (typeUrl != QueryModuleStateResponse.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object MissingNoncesRequestConverter : ProtobufConverter<MissingNoncesRequest>

public fun MissingNoncesRequest.toAny(): Any = Any(MissingNoncesRequest.TYPE_URL,
    with(MissingNoncesRequestConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<MissingNoncesRequest>): MissingNoncesRequest {
  if (typeUrl != MissingNoncesRequest.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object MissingNoncesResponseConverter : ProtobufConverter<MissingNoncesResponse>

public fun MissingNoncesResponse.toAny(): Any = Any(MissingNoncesResponse.TYPE_URL,
    with(MissingNoncesResponseConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<MissingNoncesResponse>): MissingNoncesResponse {
  if (typeUrl != MissingNoncesResponse.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}
