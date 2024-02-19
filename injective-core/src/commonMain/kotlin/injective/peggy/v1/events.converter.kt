// Transform from injective/peggy/v1/events.proto
@file:GeneratorVersion(version = "0.3.1")

package injective.peggy.v1

import google.protobuf.Any
import java.lang.IllegalStateException
import kr.jadekim.protobuf.`annotation`.GeneratorVersion
import kr.jadekim.protobuf.converter.ProtobufConverter
import kr.jadekim.protobuf.converter.parseProtobuf

public expect object EventAttestationObservedConverter : ProtobufConverter<EventAttestationObserved>

public fun EventAttestationObserved.toAny(): Any = Any(EventAttestationObserved.TYPE_URL,
    with(EventAttestationObservedConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<EventAttestationObserved>):
    EventAttestationObserved {
  if (typeUrl != EventAttestationObserved.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object EventBridgeWithdrawCanceledConverter :
    ProtobufConverter<EventBridgeWithdrawCanceled>

public fun EventBridgeWithdrawCanceled.toAny(): Any = Any(EventBridgeWithdrawCanceled.TYPE_URL,
    with(EventBridgeWithdrawCanceledConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<EventBridgeWithdrawCanceled>):
    EventBridgeWithdrawCanceled {
  if (typeUrl != EventBridgeWithdrawCanceled.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object EventOutgoingBatchConverter : ProtobufConverter<EventOutgoingBatch>

public fun EventOutgoingBatch.toAny(): Any = Any(EventOutgoingBatch.TYPE_URL,
    with(EventOutgoingBatchConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<EventOutgoingBatch>): EventOutgoingBatch {
  if (typeUrl != EventOutgoingBatch.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object EventOutgoingBatchCanceledConverter :
    ProtobufConverter<EventOutgoingBatchCanceled>

public fun EventOutgoingBatchCanceled.toAny(): Any = Any(EventOutgoingBatchCanceled.TYPE_URL,
    with(EventOutgoingBatchCanceledConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<EventOutgoingBatchCanceled>):
    EventOutgoingBatchCanceled {
  if (typeUrl != EventOutgoingBatchCanceled.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object EventValsetUpdateRequestConverter : ProtobufConverter<EventValsetUpdateRequest>

public fun EventValsetUpdateRequest.toAny(): Any = Any(EventValsetUpdateRequest.TYPE_URL,
    with(EventValsetUpdateRequestConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<EventValsetUpdateRequest>):
    EventValsetUpdateRequest {
  if (typeUrl != EventValsetUpdateRequest.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object EventSetOrchestratorAddressesConverter :
    ProtobufConverter<EventSetOrchestratorAddresses>

public fun EventSetOrchestratorAddresses.toAny(): Any = Any(EventSetOrchestratorAddresses.TYPE_URL,
    with(EventSetOrchestratorAddressesConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<EventSetOrchestratorAddresses>):
    EventSetOrchestratorAddresses {
  if (typeUrl != EventSetOrchestratorAddresses.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object EventValsetConfirmConverter : ProtobufConverter<EventValsetConfirm>

public fun EventValsetConfirm.toAny(): Any = Any(EventValsetConfirm.TYPE_URL,
    with(EventValsetConfirmConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<EventValsetConfirm>): EventValsetConfirm {
  if (typeUrl != EventValsetConfirm.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object EventSendToEthConverter : ProtobufConverter<EventSendToEth>

public fun EventSendToEth.toAny(): Any = Any(EventSendToEth.TYPE_URL, with(EventSendToEthConverter)
    { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<EventSendToEth>): EventSendToEth {
  if (typeUrl != EventSendToEth.TYPE_URL) throw IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object EventConfirmBatchConverter : ProtobufConverter<EventConfirmBatch>

public fun EventConfirmBatch.toAny(): Any = Any(EventConfirmBatch.TYPE_URL,
    with(EventConfirmBatchConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<EventConfirmBatch>): EventConfirmBatch {
  if (typeUrl != EventConfirmBatch.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object EventAttestationVoteConverter : ProtobufConverter<EventAttestationVote>

public fun EventAttestationVote.toAny(): Any = Any(EventAttestationVote.TYPE_URL,
    with(EventAttestationVoteConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<EventAttestationVote>): EventAttestationVote {
  if (typeUrl != EventAttestationVote.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object EventDepositClaimConverter : ProtobufConverter<EventDepositClaim>

public fun EventDepositClaim.toAny(): Any = Any(EventDepositClaim.TYPE_URL,
    with(EventDepositClaimConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<EventDepositClaim>): EventDepositClaim {
  if (typeUrl != EventDepositClaim.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object EventWithdrawClaimConverter : ProtobufConverter<EventWithdrawClaim>

public fun EventWithdrawClaim.toAny(): Any = Any(EventWithdrawClaim.TYPE_URL,
    with(EventWithdrawClaimConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<EventWithdrawClaim>): EventWithdrawClaim {
  if (typeUrl != EventWithdrawClaim.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object EventERC20DeployedClaimConverter : ProtobufConverter<EventERC20DeployedClaim>

public fun EventERC20DeployedClaim.toAny(): Any = Any(EventERC20DeployedClaim.TYPE_URL,
    with(EventERC20DeployedClaimConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<EventERC20DeployedClaim>):
    EventERC20DeployedClaim {
  if (typeUrl != EventERC20DeployedClaim.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object EventValsetUpdateClaimConverter : ProtobufConverter<EventValsetUpdateClaim>

public fun EventValsetUpdateClaim.toAny(): Any = Any(EventValsetUpdateClaim.TYPE_URL,
    with(EventValsetUpdateClaimConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<EventValsetUpdateClaim>): EventValsetUpdateClaim {
  if (typeUrl != EventValsetUpdateClaim.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object EventCancelSendToEthConverter : ProtobufConverter<EventCancelSendToEth>

public fun EventCancelSendToEth.toAny(): Any = Any(EventCancelSendToEth.TYPE_URL,
    with(EventCancelSendToEthConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<EventCancelSendToEth>): EventCancelSendToEth {
  if (typeUrl != EventCancelSendToEth.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object EventSubmitBadSignatureEvidenceConverter :
    ProtobufConverter<EventSubmitBadSignatureEvidence>

public fun EventSubmitBadSignatureEvidence.toAny(): Any =
    Any(EventSubmitBadSignatureEvidence.TYPE_URL, with(EventSubmitBadSignatureEvidenceConverter) {
    toByteArray() })

public fun Any.parse(converter: ProtobufConverter<EventSubmitBadSignatureEvidence>):
    EventSubmitBadSignatureEvidence {
  if (typeUrl != EventSubmitBadSignatureEvidence.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object EventValidatorSlashConverter : ProtobufConverter<EventValidatorSlash>

public fun EventValidatorSlash.toAny(): Any = Any(EventValidatorSlash.TYPE_URL,
    with(EventValidatorSlashConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<EventValidatorSlash>): EventValidatorSlash {
  if (typeUrl != EventValidatorSlash.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}
