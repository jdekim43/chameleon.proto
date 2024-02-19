// Transform from injective/peggy/v1/msgs.proto
@file:GeneratorVersion(version = "0.3.1")

package injective.peggy.v1

import kr.jadekim.protobuf.`annotation`.GeneratorVersion
import kr.jadekim.protobuf.converter.ProtobufConverter

public actual object MsgSetOrchestratorAddressesConverter :
    ProtobufConverter<MsgSetOrchestratorAddresses> by MsgSetOrchestratorAddressesJvmConverter

public actual object MsgSetOrchestratorAddressesResponseConverter :
    ProtobufConverter<MsgSetOrchestratorAddressesResponse> by
    MsgSetOrchestratorAddressesResponseJvmConverter

public actual object MsgValsetConfirmConverter : ProtobufConverter<MsgValsetConfirm> by
    MsgValsetConfirmJvmConverter

public actual object MsgValsetConfirmResponseConverter : ProtobufConverter<MsgValsetConfirmResponse>
    by MsgValsetConfirmResponseJvmConverter

public actual object MsgSendToEthConverter : ProtobufConverter<MsgSendToEth> by
    MsgSendToEthJvmConverter

public actual object MsgSendToEthResponseConverter : ProtobufConverter<MsgSendToEthResponse> by
    MsgSendToEthResponseJvmConverter

public actual object MsgRequestBatchConverter : ProtobufConverter<MsgRequestBatch> by
    MsgRequestBatchJvmConverter

public actual object MsgRequestBatchResponseConverter : ProtobufConverter<MsgRequestBatchResponse>
    by MsgRequestBatchResponseJvmConverter

public actual object MsgConfirmBatchConverter : ProtobufConverter<MsgConfirmBatch> by
    MsgConfirmBatchJvmConverter

public actual object MsgConfirmBatchResponseConverter : ProtobufConverter<MsgConfirmBatchResponse>
    by MsgConfirmBatchResponseJvmConverter

public actual object MsgDepositClaimConverter : ProtobufConverter<MsgDepositClaim> by
    MsgDepositClaimJvmConverter

public actual object MsgDepositClaimResponseConverter : ProtobufConverter<MsgDepositClaimResponse>
    by MsgDepositClaimResponseJvmConverter

public actual object MsgWithdrawClaimConverter : ProtobufConverter<MsgWithdrawClaim> by
    MsgWithdrawClaimJvmConverter

public actual object MsgWithdrawClaimResponseConverter : ProtobufConverter<MsgWithdrawClaimResponse>
    by MsgWithdrawClaimResponseJvmConverter

public actual object MsgERC20DeployedClaimConverter : ProtobufConverter<MsgERC20DeployedClaim> by
    MsgERC20DeployedClaimJvmConverter

public actual object MsgERC20DeployedClaimResponseConverter :
    ProtobufConverter<MsgERC20DeployedClaimResponse> by MsgERC20DeployedClaimResponseJvmConverter

public actual object MsgCancelSendToEthConverter : ProtobufConverter<MsgCancelSendToEth> by
    MsgCancelSendToEthJvmConverter

public actual object MsgCancelSendToEthResponseConverter :
    ProtobufConverter<MsgCancelSendToEthResponse> by MsgCancelSendToEthResponseJvmConverter

public actual object MsgSubmitBadSignatureEvidenceConverter :
    ProtobufConverter<MsgSubmitBadSignatureEvidence> by MsgSubmitBadSignatureEvidenceJvmConverter

public actual object MsgSubmitBadSignatureEvidenceResponseConverter :
    ProtobufConverter<MsgSubmitBadSignatureEvidenceResponse> by
    MsgSubmitBadSignatureEvidenceResponseJvmConverter

public actual object MsgValsetUpdatedClaimConverter : ProtobufConverter<MsgValsetUpdatedClaim> by
    MsgValsetUpdatedClaimJvmConverter

public actual object MsgValsetUpdatedClaimResponseConverter :
    ProtobufConverter<MsgValsetUpdatedClaimResponse> by MsgValsetUpdatedClaimResponseJvmConverter

public actual object MsgUpdateParamsConverter : ProtobufConverter<MsgUpdateParams> by
    MsgUpdateParamsJvmConverter

public actual object MsgUpdateParamsResponseConverter : ProtobufConverter<MsgUpdateParamsResponse>
    by MsgUpdateParamsResponseJvmConverter
