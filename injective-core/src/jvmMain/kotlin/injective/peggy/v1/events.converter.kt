// Transform from injective/peggy/v1/events.proto
@file:GeneratorVersion(version = "0.3.1")

package injective.peggy.v1

import kr.jadekim.protobuf.`annotation`.GeneratorVersion
import kr.jadekim.protobuf.converter.ProtobufConverter

public actual object EventAttestationObservedConverter : ProtobufConverter<EventAttestationObserved>
    by EventAttestationObservedJvmConverter

public actual object EventBridgeWithdrawCanceledConverter :
    ProtobufConverter<EventBridgeWithdrawCanceled> by EventBridgeWithdrawCanceledJvmConverter

public actual object EventOutgoingBatchConverter : ProtobufConverter<EventOutgoingBatch> by
    EventOutgoingBatchJvmConverter

public actual object EventOutgoingBatchCanceledConverter :
    ProtobufConverter<EventOutgoingBatchCanceled> by EventOutgoingBatchCanceledJvmConverter

public actual object EventValsetUpdateRequestConverter : ProtobufConverter<EventValsetUpdateRequest>
    by EventValsetUpdateRequestJvmConverter

public actual object EventSetOrchestratorAddressesConverter :
    ProtobufConverter<EventSetOrchestratorAddresses> by EventSetOrchestratorAddressesJvmConverter

public actual object EventValsetConfirmConverter : ProtobufConverter<EventValsetConfirm> by
    EventValsetConfirmJvmConverter

public actual object EventSendToEthConverter : ProtobufConverter<EventSendToEth> by
    EventSendToEthJvmConverter

public actual object EventConfirmBatchConverter : ProtobufConverter<EventConfirmBatch> by
    EventConfirmBatchJvmConverter

public actual object EventAttestationVoteConverter : ProtobufConverter<EventAttestationVote> by
    EventAttestationVoteJvmConverter

public actual object EventDepositClaimConverter : ProtobufConverter<EventDepositClaim> by
    EventDepositClaimJvmConverter

public actual object EventWithdrawClaimConverter : ProtobufConverter<EventWithdrawClaim> by
    EventWithdrawClaimJvmConverter

public actual object EventERC20DeployedClaimConverter : ProtobufConverter<EventERC20DeployedClaim>
    by EventERC20DeployedClaimJvmConverter

public actual object EventValsetUpdateClaimConverter : ProtobufConverter<EventValsetUpdateClaim> by
    EventValsetUpdateClaimJvmConverter

public actual object EventCancelSendToEthConverter : ProtobufConverter<EventCancelSendToEth> by
    EventCancelSendToEthJvmConverter

public actual object EventSubmitBadSignatureEvidenceConverter :
    ProtobufConverter<EventSubmitBadSignatureEvidence> by
    EventSubmitBadSignatureEvidenceJvmConverter

public actual object EventValidatorSlashConverter : ProtobufConverter<EventValidatorSlash> by
    EventValidatorSlashJvmConverter
