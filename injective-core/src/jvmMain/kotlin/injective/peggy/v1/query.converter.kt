// Transform from injective/peggy/v1/query.proto
@file:GeneratorVersion(version = "0.3.1")

package injective.peggy.v1

import kr.jadekim.protobuf.`annotation`.GeneratorVersion
import kr.jadekim.protobuf.converter.ProtobufConverter

public actual object QueryParamsRequestConverter : ProtobufConverter<QueryParamsRequest> by
    QueryParamsRequestJvmConverter

public actual object QueryParamsResponseConverter : ProtobufConverter<QueryParamsResponse> by
    QueryParamsResponseJvmConverter

public actual object QueryCurrentValsetRequestConverter :
    ProtobufConverter<QueryCurrentValsetRequest> by QueryCurrentValsetRequestJvmConverter

public actual object QueryCurrentValsetResponseConverter :
    ProtobufConverter<QueryCurrentValsetResponse> by QueryCurrentValsetResponseJvmConverter

public actual object QueryValsetRequestRequestConverter :
    ProtobufConverter<QueryValsetRequestRequest> by QueryValsetRequestRequestJvmConverter

public actual object QueryValsetRequestResponseConverter :
    ProtobufConverter<QueryValsetRequestResponse> by QueryValsetRequestResponseJvmConverter

public actual object QueryValsetConfirmRequestConverter :
    ProtobufConverter<QueryValsetConfirmRequest> by QueryValsetConfirmRequestJvmConverter

public actual object QueryValsetConfirmResponseConverter :
    ProtobufConverter<QueryValsetConfirmResponse> by QueryValsetConfirmResponseJvmConverter

public actual object QueryValsetConfirmsByNonceRequestConverter :
    ProtobufConverter<QueryValsetConfirmsByNonceRequest> by
    QueryValsetConfirmsByNonceRequestJvmConverter

public actual object QueryValsetConfirmsByNonceResponseConverter :
    ProtobufConverter<QueryValsetConfirmsByNonceResponse> by
    QueryValsetConfirmsByNonceResponseJvmConverter

public actual object QueryLastValsetRequestsRequestConverter :
    ProtobufConverter<QueryLastValsetRequestsRequest> by QueryLastValsetRequestsRequestJvmConverter

public actual object QueryLastValsetRequestsResponseConverter :
    ProtobufConverter<QueryLastValsetRequestsResponse> by
    QueryLastValsetRequestsResponseJvmConverter

public actual object QueryLastPendingValsetRequestByAddrRequestConverter :
    ProtobufConverter<QueryLastPendingValsetRequestByAddrRequest> by
    QueryLastPendingValsetRequestByAddrRequestJvmConverter

public actual object QueryLastPendingValsetRequestByAddrResponseConverter :
    ProtobufConverter<QueryLastPendingValsetRequestByAddrResponse> by
    QueryLastPendingValsetRequestByAddrResponseJvmConverter

public actual object QueryBatchFeeRequestConverter : ProtobufConverter<QueryBatchFeeRequest> by
    QueryBatchFeeRequestJvmConverter

public actual object QueryBatchFeeResponseConverter : ProtobufConverter<QueryBatchFeeResponse> by
    QueryBatchFeeResponseJvmConverter

public actual object QueryLastPendingBatchRequestByAddrRequestConverter :
    ProtobufConverter<QueryLastPendingBatchRequestByAddrRequest> by
    QueryLastPendingBatchRequestByAddrRequestJvmConverter

public actual object QueryLastPendingBatchRequestByAddrResponseConverter :
    ProtobufConverter<QueryLastPendingBatchRequestByAddrResponse> by
    QueryLastPendingBatchRequestByAddrResponseJvmConverter

public actual object QueryOutgoingTxBatchesRequestConverter :
    ProtobufConverter<QueryOutgoingTxBatchesRequest> by QueryOutgoingTxBatchesRequestJvmConverter

public actual object QueryOutgoingTxBatchesResponseConverter :
    ProtobufConverter<QueryOutgoingTxBatchesResponse> by QueryOutgoingTxBatchesResponseJvmConverter

public actual object QueryBatchRequestByNonceRequestConverter :
    ProtobufConverter<QueryBatchRequestByNonceRequest> by
    QueryBatchRequestByNonceRequestJvmConverter

public actual object QueryBatchRequestByNonceResponseConverter :
    ProtobufConverter<QueryBatchRequestByNonceResponse> by
    QueryBatchRequestByNonceResponseJvmConverter

public actual object QueryBatchConfirmsRequestConverter :
    ProtobufConverter<QueryBatchConfirmsRequest> by QueryBatchConfirmsRequestJvmConverter

public actual object QueryBatchConfirmsResponseConverter :
    ProtobufConverter<QueryBatchConfirmsResponse> by QueryBatchConfirmsResponseJvmConverter

public actual object QueryLastEventByAddrRequestConverter :
    ProtobufConverter<QueryLastEventByAddrRequest> by QueryLastEventByAddrRequestJvmConverter

public actual object QueryLastEventByAddrResponseConverter :
    ProtobufConverter<QueryLastEventByAddrResponse> by QueryLastEventByAddrResponseJvmConverter

public actual object QueryERC20ToDenomRequestConverter : ProtobufConverter<QueryERC20ToDenomRequest>
    by QueryERC20ToDenomRequestJvmConverter

public actual object QueryERC20ToDenomResponseConverter :
    ProtobufConverter<QueryERC20ToDenomResponse> by QueryERC20ToDenomResponseJvmConverter

public actual object QueryDenomToERC20RequestConverter : ProtobufConverter<QueryDenomToERC20Request>
    by QueryDenomToERC20RequestJvmConverter

public actual object QueryDenomToERC20ResponseConverter :
    ProtobufConverter<QueryDenomToERC20Response> by QueryDenomToERC20ResponseJvmConverter

public actual object QueryDelegateKeysByValidatorAddressConverter :
    ProtobufConverter<QueryDelegateKeysByValidatorAddress> by
    QueryDelegateKeysByValidatorAddressJvmConverter

public actual object QueryDelegateKeysByValidatorAddressResponseConverter :
    ProtobufConverter<QueryDelegateKeysByValidatorAddressResponse> by
    QueryDelegateKeysByValidatorAddressResponseJvmConverter

public actual object QueryDelegateKeysByEthAddressConverter :
    ProtobufConverter<QueryDelegateKeysByEthAddress> by QueryDelegateKeysByEthAddressJvmConverter

public actual object QueryDelegateKeysByEthAddressResponseConverter :
    ProtobufConverter<QueryDelegateKeysByEthAddressResponse> by
    QueryDelegateKeysByEthAddressResponseJvmConverter

public actual object QueryDelegateKeysByOrchestratorAddressConverter :
    ProtobufConverter<QueryDelegateKeysByOrchestratorAddress> by
    QueryDelegateKeysByOrchestratorAddressJvmConverter

public actual object QueryDelegateKeysByOrchestratorAddressResponseConverter :
    ProtobufConverter<QueryDelegateKeysByOrchestratorAddressResponse> by
    QueryDelegateKeysByOrchestratorAddressResponseJvmConverter

public actual object QueryPendingSendToEthConverter : ProtobufConverter<QueryPendingSendToEth> by
    QueryPendingSendToEthJvmConverter

public actual object QueryPendingSendToEthResponseConverter :
    ProtobufConverter<QueryPendingSendToEthResponse> by QueryPendingSendToEthResponseJvmConverter

public actual object QueryModuleStateRequestConverter : ProtobufConverter<QueryModuleStateRequest>
    by QueryModuleStateRequestJvmConverter

public actual object QueryModuleStateResponseConverter : ProtobufConverter<QueryModuleStateResponse>
    by QueryModuleStateResponseJvmConverter

public actual object MissingNoncesRequestConverter : ProtobufConverter<MissingNoncesRequest> by
    MissingNoncesRequestJvmConverter

public actual object MissingNoncesResponseConverter : ProtobufConverter<MissingNoncesResponse> by
    MissingNoncesResponseJvmConverter
