// Transform from injective/peggy/v1/events.proto
@file:GeneratorVersion(version = "0.3.1")

package injective.peggy.v1

import com.google.protobuf.ByteString
import com.google.protobuf.Descriptors
import com.google.protobuf.Parser
import kr.jadekim.protobuf.`annotation`.GeneratorVersion
import kr.jadekim.protobuf.converter.mapper.ProtobufTypeMapper
import kr.jadekim.protobuf.util.asJavaType
import kr.jadekim.protobuf.util.asKotlinType

public object EventAttestationObservedJvmConverter :
    ProtobufTypeMapper<EventAttestationObserved, Events.EventAttestationObserved> {
  public override val descriptor: Descriptors.Descriptor =
      Events.EventAttestationObserved.getDescriptor()

  public override val parser: Parser<Events.EventAttestationObserved> =
      Events.EventAttestationObserved.parser()

  public override fun convert(obj: Events.EventAttestationObserved): EventAttestationObserved =
      EventAttestationObserved(
  	attestationType = ClaimType.forNumber(obj.getAttestationType().number),
  	bridgeContract = obj.getBridgeContract(),
  	bridgeChainId = obj.getBridgeChainId().asKotlinType,
  	attestationId = obj.getAttestationId().toByteArray(),
  	nonce = obj.getNonce().asKotlinType,
  )

  public override fun convert(obj: EventAttestationObserved): Events.EventAttestationObserved {
    val builder = Events.EventAttestationObserved.newBuilder()
    builder.setAttestationType(AttestationOuterClass.ClaimType.forNumber(obj.attestationType.number))
    builder.setBridgeContract(obj.bridgeContract)
    builder.setBridgeChainId(obj.bridgeChainId.asJavaType)
    builder.setAttestationId(ByteString.copyFrom(obj.attestationId))
    builder.setNonce(obj.nonce.asJavaType)
    return builder.build()
  }
}

public object EventBridgeWithdrawCanceledJvmConverter :
    ProtobufTypeMapper<EventBridgeWithdrawCanceled, Events.EventBridgeWithdrawCanceled> {
  public override val descriptor: Descriptors.Descriptor =
      Events.EventBridgeWithdrawCanceled.getDescriptor()

  public override val parser: Parser<Events.EventBridgeWithdrawCanceled> =
      Events.EventBridgeWithdrawCanceled.parser()

  public override fun convert(obj: Events.EventBridgeWithdrawCanceled): EventBridgeWithdrawCanceled
      = EventBridgeWithdrawCanceled(
  	bridgeContract = obj.getBridgeContract(),
  	bridgeChainId = obj.getBridgeChainId().asKotlinType,
  )

  public override fun convert(obj: EventBridgeWithdrawCanceled):
      Events.EventBridgeWithdrawCanceled {
    val builder = Events.EventBridgeWithdrawCanceled.newBuilder()
    builder.setBridgeContract(obj.bridgeContract)
    builder.setBridgeChainId(obj.bridgeChainId.asJavaType)
    return builder.build()
  }
}

public object EventOutgoingBatchJvmConverter :
    ProtobufTypeMapper<EventOutgoingBatch, Events.EventOutgoingBatch> {
  public override val descriptor: Descriptors.Descriptor = Events.EventOutgoingBatch.getDescriptor()

  public override val parser: Parser<Events.EventOutgoingBatch> = Events.EventOutgoingBatch.parser()

  public override fun convert(obj: Events.EventOutgoingBatch): EventOutgoingBatch =
      EventOutgoingBatch(
  	denom = obj.getDenom(),
  	orchestratorAddress = obj.getOrchestratorAddress(),
  	batchNonce = obj.getBatchNonce().asKotlinType,
  	batchTimeout = obj.getBatchTimeout().asKotlinType,
  	batchTxIds = obj.getBatchTxIdsList().map { it.asKotlinType },
  )

  public override fun convert(obj: EventOutgoingBatch): Events.EventOutgoingBatch {
    val builder = Events.EventOutgoingBatch.newBuilder()
    builder.setDenom(obj.denom)
    builder.setOrchestratorAddress(obj.orchestratorAddress)
    builder.setBatchNonce(obj.batchNonce.asJavaType)
    builder.setBatchTimeout(obj.batchTimeout.asJavaType)
    builder.addAllBatchTxIds(obj.batchTxIds.map { it.asJavaType })
    return builder.build()
  }
}

public object EventOutgoingBatchCanceledJvmConverter :
    ProtobufTypeMapper<EventOutgoingBatchCanceled, Events.EventOutgoingBatchCanceled> {
  public override val descriptor: Descriptors.Descriptor =
      Events.EventOutgoingBatchCanceled.getDescriptor()

  public override val parser: Parser<Events.EventOutgoingBatchCanceled> =
      Events.EventOutgoingBatchCanceled.parser()

  public override fun convert(obj: Events.EventOutgoingBatchCanceled): EventOutgoingBatchCanceled =
      EventOutgoingBatchCanceled(
  	bridgeContract = obj.getBridgeContract(),
  	bridgeChainId = obj.getBridgeChainId().asKotlinType,
  	batchId = obj.getBatchId().asKotlinType,
  	nonce = obj.getNonce().asKotlinType,
  )

  public override fun convert(obj: EventOutgoingBatchCanceled): Events.EventOutgoingBatchCanceled {
    val builder = Events.EventOutgoingBatchCanceled.newBuilder()
    builder.setBridgeContract(obj.bridgeContract)
    builder.setBridgeChainId(obj.bridgeChainId.asJavaType)
    builder.setBatchId(obj.batchId.asJavaType)
    builder.setNonce(obj.nonce.asJavaType)
    return builder.build()
  }
}

public object EventValsetUpdateRequestJvmConverter :
    ProtobufTypeMapper<EventValsetUpdateRequest, Events.EventValsetUpdateRequest> {
  public override val descriptor: Descriptors.Descriptor =
      Events.EventValsetUpdateRequest.getDescriptor()

  public override val parser: Parser<Events.EventValsetUpdateRequest> =
      Events.EventValsetUpdateRequest.parser()

  public override fun convert(obj: Events.EventValsetUpdateRequest): EventValsetUpdateRequest =
      EventValsetUpdateRequest(
  	valsetNonce = obj.getValsetNonce().asKotlinType,
  	valsetHeight = obj.getValsetHeight().asKotlinType,
  	valsetMembers = obj.getValsetMembersList().map { BridgeValidatorJvmConverter.convert(it) },
  	rewardAmount = obj.getRewardAmount(),
  	rewardToken = obj.getRewardToken(),
  )

  public override fun convert(obj: EventValsetUpdateRequest): Events.EventValsetUpdateRequest {
    val builder = Events.EventValsetUpdateRequest.newBuilder()
    builder.setValsetNonce(obj.valsetNonce.asJavaType)
    builder.setValsetHeight(obj.valsetHeight.asJavaType)
    builder.addAllValsetMembers(obj.valsetMembers.map { BridgeValidatorJvmConverter.convert(it) })
    builder.setRewardAmount(obj.rewardAmount)
    builder.setRewardToken(obj.rewardToken)
    return builder.build()
  }
}

public object EventSetOrchestratorAddressesJvmConverter :
    ProtobufTypeMapper<EventSetOrchestratorAddresses, Events.EventSetOrchestratorAddresses> {
  public override val descriptor: Descriptors.Descriptor =
      Events.EventSetOrchestratorAddresses.getDescriptor()

  public override val parser: Parser<Events.EventSetOrchestratorAddresses> =
      Events.EventSetOrchestratorAddresses.parser()

  public override fun convert(obj: Events.EventSetOrchestratorAddresses):
      EventSetOrchestratorAddresses = EventSetOrchestratorAddresses(
  	validatorAddress = obj.getValidatorAddress(),
  	orchestratorAddress = obj.getOrchestratorAddress(),
  	operatorEthAddress = obj.getOperatorEthAddress(),
  )

  public override fun convert(obj: EventSetOrchestratorAddresses):
      Events.EventSetOrchestratorAddresses {
    val builder = Events.EventSetOrchestratorAddresses.newBuilder()
    builder.setValidatorAddress(obj.validatorAddress)
    builder.setOrchestratorAddress(obj.orchestratorAddress)
    builder.setOperatorEthAddress(obj.operatorEthAddress)
    return builder.build()
  }
}

public object EventValsetConfirmJvmConverter :
    ProtobufTypeMapper<EventValsetConfirm, Events.EventValsetConfirm> {
  public override val descriptor: Descriptors.Descriptor = Events.EventValsetConfirm.getDescriptor()

  public override val parser: Parser<Events.EventValsetConfirm> = Events.EventValsetConfirm.parser()

  public override fun convert(obj: Events.EventValsetConfirm): EventValsetConfirm =
      EventValsetConfirm(
  	valsetNonce = obj.getValsetNonce().asKotlinType,
  	orchestratorAddress = obj.getOrchestratorAddress(),
  )

  public override fun convert(obj: EventValsetConfirm): Events.EventValsetConfirm {
    val builder = Events.EventValsetConfirm.newBuilder()
    builder.setValsetNonce(obj.valsetNonce.asJavaType)
    builder.setOrchestratorAddress(obj.orchestratorAddress)
    return builder.build()
  }
}

public object EventSendToEthJvmConverter : ProtobufTypeMapper<EventSendToEth, Events.EventSendToEth>
    {
  public override val descriptor: Descriptors.Descriptor = Events.EventSendToEth.getDescriptor()

  public override val parser: Parser<Events.EventSendToEth> = Events.EventSendToEth.parser()

  public override fun convert(obj: Events.EventSendToEth): EventSendToEth = EventSendToEth(
  	outgoingTxId = obj.getOutgoingTxId().asKotlinType,
  	sender = obj.getSender(),
  	`receiver` = obj.getReceiver(),
  	amount = obj.getAmount(),
  	bridgeFee = obj.getBridgeFee(),
  )

  public override fun convert(obj: EventSendToEth): Events.EventSendToEth {
    val builder = Events.EventSendToEth.newBuilder()
    builder.setOutgoingTxId(obj.outgoingTxId.asJavaType)
    builder.setSender(obj.sender)
    builder.setReceiver(obj.`receiver`)
    builder.setAmount(obj.amount)
    builder.setBridgeFee(obj.bridgeFee)
    return builder.build()
  }
}

public object EventConfirmBatchJvmConverter :
    ProtobufTypeMapper<EventConfirmBatch, Events.EventConfirmBatch> {
  public override val descriptor: Descriptors.Descriptor = Events.EventConfirmBatch.getDescriptor()

  public override val parser: Parser<Events.EventConfirmBatch> = Events.EventConfirmBatch.parser()

  public override fun convert(obj: Events.EventConfirmBatch): EventConfirmBatch = EventConfirmBatch(
  	batchNonce = obj.getBatchNonce().asKotlinType,
  	orchestratorAddress = obj.getOrchestratorAddress(),
  )

  public override fun convert(obj: EventConfirmBatch): Events.EventConfirmBatch {
    val builder = Events.EventConfirmBatch.newBuilder()
    builder.setBatchNonce(obj.batchNonce.asJavaType)
    builder.setOrchestratorAddress(obj.orchestratorAddress)
    return builder.build()
  }
}

public object EventAttestationVoteJvmConverter :
    ProtobufTypeMapper<EventAttestationVote, Events.EventAttestationVote> {
  public override val descriptor: Descriptors.Descriptor =
      Events.EventAttestationVote.getDescriptor()

  public override val parser: Parser<Events.EventAttestationVote> =
      Events.EventAttestationVote.parser()

  public override fun convert(obj: Events.EventAttestationVote): EventAttestationVote =
      EventAttestationVote(
  	eventNonce = obj.getEventNonce().asKotlinType,
  	attestationId = obj.getAttestationId().toByteArray(),
  	voter = obj.getVoter(),
  )

  public override fun convert(obj: EventAttestationVote): Events.EventAttestationVote {
    val builder = Events.EventAttestationVote.newBuilder()
    builder.setEventNonce(obj.eventNonce.asJavaType)
    builder.setAttestationId(ByteString.copyFrom(obj.attestationId))
    builder.setVoter(obj.voter)
    return builder.build()
  }
}

public object EventDepositClaimJvmConverter :
    ProtobufTypeMapper<EventDepositClaim, Events.EventDepositClaim> {
  public override val descriptor: Descriptors.Descriptor = Events.EventDepositClaim.getDescriptor()

  public override val parser: Parser<Events.EventDepositClaim> = Events.EventDepositClaim.parser()

  public override fun convert(obj: Events.EventDepositClaim): EventDepositClaim = EventDepositClaim(
  	eventNonce = obj.getEventNonce().asKotlinType,
  	eventHeight = obj.getEventHeight().asKotlinType,
  	attestationId = obj.getAttestationId().toByteArray(),
  	ethereumSender = obj.getEthereumSender(),
  	cosmosReceiver = obj.getCosmosReceiver(),
  	tokenContract = obj.getTokenContract(),
  	amount = obj.getAmount(),
  	orchestratorAddress = obj.getOrchestratorAddress(),
  	`data` = obj.getData(),
  )

  public override fun convert(obj: EventDepositClaim): Events.EventDepositClaim {
    val builder = Events.EventDepositClaim.newBuilder()
    builder.setEventNonce(obj.eventNonce.asJavaType)
    builder.setEventHeight(obj.eventHeight.asJavaType)
    builder.setAttestationId(ByteString.copyFrom(obj.attestationId))
    builder.setEthereumSender(obj.ethereumSender)
    builder.setCosmosReceiver(obj.cosmosReceiver)
    builder.setTokenContract(obj.tokenContract)
    builder.setAmount(obj.amount)
    builder.setOrchestratorAddress(obj.orchestratorAddress)
    builder.setData(obj.`data`)
    return builder.build()
  }
}

public object EventWithdrawClaimJvmConverter :
    ProtobufTypeMapper<EventWithdrawClaim, Events.EventWithdrawClaim> {
  public override val descriptor: Descriptors.Descriptor = Events.EventWithdrawClaim.getDescriptor()

  public override val parser: Parser<Events.EventWithdrawClaim> = Events.EventWithdrawClaim.parser()

  public override fun convert(obj: Events.EventWithdrawClaim): EventWithdrawClaim =
      EventWithdrawClaim(
  	eventNonce = obj.getEventNonce().asKotlinType,
  	eventHeight = obj.getEventHeight().asKotlinType,
  	attestationId = obj.getAttestationId().toByteArray(),
  	batchNonce = obj.getBatchNonce().asKotlinType,
  	tokenContract = obj.getTokenContract(),
  	orchestratorAddress = obj.getOrchestratorAddress(),
  )

  public override fun convert(obj: EventWithdrawClaim): Events.EventWithdrawClaim {
    val builder = Events.EventWithdrawClaim.newBuilder()
    builder.setEventNonce(obj.eventNonce.asJavaType)
    builder.setEventHeight(obj.eventHeight.asJavaType)
    builder.setAttestationId(ByteString.copyFrom(obj.attestationId))
    builder.setBatchNonce(obj.batchNonce.asJavaType)
    builder.setTokenContract(obj.tokenContract)
    builder.setOrchestratorAddress(obj.orchestratorAddress)
    return builder.build()
  }
}

public object EventERC20DeployedClaimJvmConverter :
    ProtobufTypeMapper<EventERC20DeployedClaim, Events.EventERC20DeployedClaim> {
  public override val descriptor: Descriptors.Descriptor =
      Events.EventERC20DeployedClaim.getDescriptor()

  public override val parser: Parser<Events.EventERC20DeployedClaim> =
      Events.EventERC20DeployedClaim.parser()

  public override fun convert(obj: Events.EventERC20DeployedClaim): EventERC20DeployedClaim =
      EventERC20DeployedClaim(
  	eventNonce = obj.getEventNonce().asKotlinType,
  	eventHeight = obj.getEventHeight().asKotlinType,
  	attestationId = obj.getAttestationId().toByteArray(),
  	cosmosDenom = obj.getCosmosDenom(),
  	tokenContract = obj.getTokenContract(),
  	name = obj.getName(),
  	symbol = obj.getSymbol(),
  	decimals = obj.getDecimals().asKotlinType,
  	orchestratorAddress = obj.getOrchestratorAddress(),
  )

  public override fun convert(obj: EventERC20DeployedClaim): Events.EventERC20DeployedClaim {
    val builder = Events.EventERC20DeployedClaim.newBuilder()
    builder.setEventNonce(obj.eventNonce.asJavaType)
    builder.setEventHeight(obj.eventHeight.asJavaType)
    builder.setAttestationId(ByteString.copyFrom(obj.attestationId))
    builder.setCosmosDenom(obj.cosmosDenom)
    builder.setTokenContract(obj.tokenContract)
    builder.setName(obj.name)
    builder.setSymbol(obj.symbol)
    builder.setDecimals(obj.decimals.asJavaType)
    builder.setOrchestratorAddress(obj.orchestratorAddress)
    return builder.build()
  }
}

public object EventValsetUpdateClaimJvmConverter :
    ProtobufTypeMapper<EventValsetUpdateClaim, Events.EventValsetUpdateClaim> {
  public override val descriptor: Descriptors.Descriptor =
      Events.EventValsetUpdateClaim.getDescriptor()

  public override val parser: Parser<Events.EventValsetUpdateClaim> =
      Events.EventValsetUpdateClaim.parser()

  public override fun convert(obj: Events.EventValsetUpdateClaim): EventValsetUpdateClaim =
      EventValsetUpdateClaim(
  	eventNonce = obj.getEventNonce().asKotlinType,
  	eventHeight = obj.getEventHeight().asKotlinType,
  	attestationId = obj.getAttestationId().toByteArray(),
  	valsetNonce = obj.getValsetNonce().asKotlinType,
  	valsetMembers = obj.getValsetMembersList().map { BridgeValidatorJvmConverter.convert(it) },
  	rewardAmount = obj.getRewardAmount(),
  	rewardToken = obj.getRewardToken(),
  	orchestratorAddress = obj.getOrchestratorAddress(),
  )

  public override fun convert(obj: EventValsetUpdateClaim): Events.EventValsetUpdateClaim {
    val builder = Events.EventValsetUpdateClaim.newBuilder()
    builder.setEventNonce(obj.eventNonce.asJavaType)
    builder.setEventHeight(obj.eventHeight.asJavaType)
    builder.setAttestationId(ByteString.copyFrom(obj.attestationId))
    builder.setValsetNonce(obj.valsetNonce.asJavaType)
    builder.addAllValsetMembers(obj.valsetMembers.map { BridgeValidatorJvmConverter.convert(it) })
    builder.setRewardAmount(obj.rewardAmount)
    builder.setRewardToken(obj.rewardToken)
    builder.setOrchestratorAddress(obj.orchestratorAddress)
    return builder.build()
  }
}

public object EventCancelSendToEthJvmConverter :
    ProtobufTypeMapper<EventCancelSendToEth, Events.EventCancelSendToEth> {
  public override val descriptor: Descriptors.Descriptor =
      Events.EventCancelSendToEth.getDescriptor()

  public override val parser: Parser<Events.EventCancelSendToEth> =
      Events.EventCancelSendToEth.parser()

  public override fun convert(obj: Events.EventCancelSendToEth): EventCancelSendToEth =
      EventCancelSendToEth(
  	outgoingTxId = obj.getOutgoingTxId().asKotlinType,
  )

  public override fun convert(obj: EventCancelSendToEth): Events.EventCancelSendToEth {
    val builder = Events.EventCancelSendToEth.newBuilder()
    builder.setOutgoingTxId(obj.outgoingTxId.asJavaType)
    return builder.build()
  }
}

public object EventSubmitBadSignatureEvidenceJvmConverter :
    ProtobufTypeMapper<EventSubmitBadSignatureEvidence, Events.EventSubmitBadSignatureEvidence> {
  public override val descriptor: Descriptors.Descriptor =
      Events.EventSubmitBadSignatureEvidence.getDescriptor()

  public override val parser: Parser<Events.EventSubmitBadSignatureEvidence> =
      Events.EventSubmitBadSignatureEvidence.parser()

  public override fun convert(obj: Events.EventSubmitBadSignatureEvidence):
      EventSubmitBadSignatureEvidence = EventSubmitBadSignatureEvidence(
  	badEthSignature = obj.getBadEthSignature(),
  	badEthSignatureSubject = obj.getBadEthSignatureSubject(),
  )

  public override fun convert(obj: EventSubmitBadSignatureEvidence):
      Events.EventSubmitBadSignatureEvidence {
    val builder = Events.EventSubmitBadSignatureEvidence.newBuilder()
    builder.setBadEthSignature(obj.badEthSignature)
    builder.setBadEthSignatureSubject(obj.badEthSignatureSubject)
    return builder.build()
  }
}

public object EventValidatorSlashJvmConverter :
    ProtobufTypeMapper<EventValidatorSlash, Events.EventValidatorSlash> {
  public override val descriptor: Descriptors.Descriptor =
      Events.EventValidatorSlash.getDescriptor()

  public override val parser: Parser<Events.EventValidatorSlash> =
      Events.EventValidatorSlash.parser()

  public override fun convert(obj: Events.EventValidatorSlash): EventValidatorSlash =
      EventValidatorSlash(
  	power = obj.getPower(),
  	reason = obj.getReason(),
  	consensusAddress = obj.getConsensusAddress(),
  	operatorAddress = obj.getOperatorAddress(),
  	moniker = obj.getMoniker(),
  )

  public override fun convert(obj: EventValidatorSlash): Events.EventValidatorSlash {
    val builder = Events.EventValidatorSlash.newBuilder()
    builder.setPower(obj.power)
    builder.setReason(obj.reason)
    builder.setConsensusAddress(obj.consensusAddress)
    builder.setOperatorAddress(obj.operatorAddress)
    builder.setMoniker(obj.moniker)
    return builder.build()
  }
}
