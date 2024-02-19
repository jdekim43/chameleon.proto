// Transform from injective/peggy/v1/msgs.proto
@file:GeneratorVersion(version = "0.3.1")

package injective.peggy.v1

import google.protobuf.Any
import java.lang.IllegalStateException
import kr.jadekim.protobuf.`annotation`.GeneratorVersion
import kr.jadekim.protobuf.converter.ProtobufConverter
import kr.jadekim.protobuf.converter.parseProtobuf

public expect object MsgSetOrchestratorAddressesConverter :
    ProtobufConverter<MsgSetOrchestratorAddresses>

public fun MsgSetOrchestratorAddresses.toAny(): Any = Any(MsgSetOrchestratorAddresses.TYPE_URL,
    with(MsgSetOrchestratorAddressesConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<MsgSetOrchestratorAddresses>):
    MsgSetOrchestratorAddresses {
  if (typeUrl != MsgSetOrchestratorAddresses.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object MsgSetOrchestratorAddressesResponseConverter :
    ProtobufConverter<MsgSetOrchestratorAddressesResponse>

public fun MsgSetOrchestratorAddressesResponse.toAny(): Any =
    Any(MsgSetOrchestratorAddressesResponse.TYPE_URL,
    with(MsgSetOrchestratorAddressesResponseConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<MsgSetOrchestratorAddressesResponse>):
    MsgSetOrchestratorAddressesResponse {
  if (typeUrl != MsgSetOrchestratorAddressesResponse.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object MsgValsetConfirmConverter : ProtobufConverter<MsgValsetConfirm>

public fun MsgValsetConfirm.toAny(): Any = Any(MsgValsetConfirm.TYPE_URL,
    with(MsgValsetConfirmConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<MsgValsetConfirm>): MsgValsetConfirm {
  if (typeUrl != MsgValsetConfirm.TYPE_URL) throw IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object MsgValsetConfirmResponseConverter : ProtobufConverter<MsgValsetConfirmResponse>

public fun MsgValsetConfirmResponse.toAny(): Any = Any(MsgValsetConfirmResponse.TYPE_URL,
    with(MsgValsetConfirmResponseConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<MsgValsetConfirmResponse>):
    MsgValsetConfirmResponse {
  if (typeUrl != MsgValsetConfirmResponse.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object MsgSendToEthConverter : ProtobufConverter<MsgSendToEth>

public fun MsgSendToEth.toAny(): Any = Any(MsgSendToEth.TYPE_URL, with(MsgSendToEthConverter) {
    toByteArray() })

public fun Any.parse(converter: ProtobufConverter<MsgSendToEth>): MsgSendToEth {
  if (typeUrl != MsgSendToEth.TYPE_URL) throw IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object MsgSendToEthResponseConverter : ProtobufConverter<MsgSendToEthResponse>

public fun MsgSendToEthResponse.toAny(): Any = Any(MsgSendToEthResponse.TYPE_URL,
    with(MsgSendToEthResponseConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<MsgSendToEthResponse>): MsgSendToEthResponse {
  if (typeUrl != MsgSendToEthResponse.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object MsgRequestBatchConverter : ProtobufConverter<MsgRequestBatch>

public fun MsgRequestBatch.toAny(): Any = Any(MsgRequestBatch.TYPE_URL,
    with(MsgRequestBatchConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<MsgRequestBatch>): MsgRequestBatch {
  if (typeUrl != MsgRequestBatch.TYPE_URL) throw IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object MsgRequestBatchResponseConverter : ProtobufConverter<MsgRequestBatchResponse>

public fun MsgRequestBatchResponse.toAny(): Any = Any(MsgRequestBatchResponse.TYPE_URL,
    with(MsgRequestBatchResponseConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<MsgRequestBatchResponse>):
    MsgRequestBatchResponse {
  if (typeUrl != MsgRequestBatchResponse.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object MsgConfirmBatchConverter : ProtobufConverter<MsgConfirmBatch>

public fun MsgConfirmBatch.toAny(): Any = Any(MsgConfirmBatch.TYPE_URL,
    with(MsgConfirmBatchConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<MsgConfirmBatch>): MsgConfirmBatch {
  if (typeUrl != MsgConfirmBatch.TYPE_URL) throw IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object MsgConfirmBatchResponseConverter : ProtobufConverter<MsgConfirmBatchResponse>

public fun MsgConfirmBatchResponse.toAny(): Any = Any(MsgConfirmBatchResponse.TYPE_URL,
    with(MsgConfirmBatchResponseConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<MsgConfirmBatchResponse>):
    MsgConfirmBatchResponse {
  if (typeUrl != MsgConfirmBatchResponse.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object MsgDepositClaimConverter : ProtobufConverter<MsgDepositClaim>

public fun MsgDepositClaim.toAny(): Any = Any(MsgDepositClaim.TYPE_URL,
    with(MsgDepositClaimConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<MsgDepositClaim>): MsgDepositClaim {
  if (typeUrl != MsgDepositClaim.TYPE_URL) throw IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object MsgDepositClaimResponseConverter : ProtobufConverter<MsgDepositClaimResponse>

public fun MsgDepositClaimResponse.toAny(): Any = Any(MsgDepositClaimResponse.TYPE_URL,
    with(MsgDepositClaimResponseConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<MsgDepositClaimResponse>):
    MsgDepositClaimResponse {
  if (typeUrl != MsgDepositClaimResponse.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object MsgWithdrawClaimConverter : ProtobufConverter<MsgWithdrawClaim>

public fun MsgWithdrawClaim.toAny(): Any = Any(MsgWithdrawClaim.TYPE_URL,
    with(MsgWithdrawClaimConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<MsgWithdrawClaim>): MsgWithdrawClaim {
  if (typeUrl != MsgWithdrawClaim.TYPE_URL) throw IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object MsgWithdrawClaimResponseConverter : ProtobufConverter<MsgWithdrawClaimResponse>

public fun MsgWithdrawClaimResponse.toAny(): Any = Any(MsgWithdrawClaimResponse.TYPE_URL,
    with(MsgWithdrawClaimResponseConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<MsgWithdrawClaimResponse>):
    MsgWithdrawClaimResponse {
  if (typeUrl != MsgWithdrawClaimResponse.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object MsgERC20DeployedClaimConverter : ProtobufConverter<MsgERC20DeployedClaim>

public fun MsgERC20DeployedClaim.toAny(): Any = Any(MsgERC20DeployedClaim.TYPE_URL,
    with(MsgERC20DeployedClaimConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<MsgERC20DeployedClaim>): MsgERC20DeployedClaim {
  if (typeUrl != MsgERC20DeployedClaim.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object MsgERC20DeployedClaimResponseConverter :
    ProtobufConverter<MsgERC20DeployedClaimResponse>

public fun MsgERC20DeployedClaimResponse.toAny(): Any = Any(MsgERC20DeployedClaimResponse.TYPE_URL,
    with(MsgERC20DeployedClaimResponseConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<MsgERC20DeployedClaimResponse>):
    MsgERC20DeployedClaimResponse {
  if (typeUrl != MsgERC20DeployedClaimResponse.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object MsgCancelSendToEthConverter : ProtobufConverter<MsgCancelSendToEth>

public fun MsgCancelSendToEth.toAny(): Any = Any(MsgCancelSendToEth.TYPE_URL,
    with(MsgCancelSendToEthConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<MsgCancelSendToEth>): MsgCancelSendToEth {
  if (typeUrl != MsgCancelSendToEth.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object MsgCancelSendToEthResponseConverter :
    ProtobufConverter<MsgCancelSendToEthResponse>

public fun MsgCancelSendToEthResponse.toAny(): Any = Any(MsgCancelSendToEthResponse.TYPE_URL,
    with(MsgCancelSendToEthResponseConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<MsgCancelSendToEthResponse>):
    MsgCancelSendToEthResponse {
  if (typeUrl != MsgCancelSendToEthResponse.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object MsgSubmitBadSignatureEvidenceConverter :
    ProtobufConverter<MsgSubmitBadSignatureEvidence>

public fun MsgSubmitBadSignatureEvidence.toAny(): Any = Any(MsgSubmitBadSignatureEvidence.TYPE_URL,
    with(MsgSubmitBadSignatureEvidenceConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<MsgSubmitBadSignatureEvidence>):
    MsgSubmitBadSignatureEvidence {
  if (typeUrl != MsgSubmitBadSignatureEvidence.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object MsgSubmitBadSignatureEvidenceResponseConverter :
    ProtobufConverter<MsgSubmitBadSignatureEvidenceResponse>

public fun MsgSubmitBadSignatureEvidenceResponse.toAny(): Any =
    Any(MsgSubmitBadSignatureEvidenceResponse.TYPE_URL,
    with(MsgSubmitBadSignatureEvidenceResponseConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<MsgSubmitBadSignatureEvidenceResponse>):
    MsgSubmitBadSignatureEvidenceResponse {
  if (typeUrl != MsgSubmitBadSignatureEvidenceResponse.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object MsgValsetUpdatedClaimConverter : ProtobufConverter<MsgValsetUpdatedClaim>

public fun MsgValsetUpdatedClaim.toAny(): Any = Any(MsgValsetUpdatedClaim.TYPE_URL,
    with(MsgValsetUpdatedClaimConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<MsgValsetUpdatedClaim>): MsgValsetUpdatedClaim {
  if (typeUrl != MsgValsetUpdatedClaim.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object MsgValsetUpdatedClaimResponseConverter :
    ProtobufConverter<MsgValsetUpdatedClaimResponse>

public fun MsgValsetUpdatedClaimResponse.toAny(): Any = Any(MsgValsetUpdatedClaimResponse.TYPE_URL,
    with(MsgValsetUpdatedClaimResponseConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<MsgValsetUpdatedClaimResponse>):
    MsgValsetUpdatedClaimResponse {
  if (typeUrl != MsgValsetUpdatedClaimResponse.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object MsgUpdateParamsConverter : ProtobufConverter<MsgUpdateParams>

public fun MsgUpdateParams.toAny(): Any = Any(MsgUpdateParams.TYPE_URL,
    with(MsgUpdateParamsConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<MsgUpdateParams>): MsgUpdateParams {
  if (typeUrl != MsgUpdateParams.TYPE_URL) throw IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object MsgUpdateParamsResponseConverter : ProtobufConverter<MsgUpdateParamsResponse>

public fun MsgUpdateParamsResponse.toAny(): Any = Any(MsgUpdateParamsResponse.TYPE_URL,
    with(MsgUpdateParamsResponseConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<MsgUpdateParamsResponse>):
    MsgUpdateParamsResponse {
  if (typeUrl != MsgUpdateParamsResponse.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}
