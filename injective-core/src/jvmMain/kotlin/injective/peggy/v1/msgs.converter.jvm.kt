// Transform from injective/peggy/v1/msgs.proto
@file:GeneratorVersion(version = "0.3.1")

package injective.peggy.v1

import com.google.protobuf.Descriptors
import com.google.protobuf.Parser
import cosmos.base.v1beta1.CoinJvmConverter
import google.protobuf.AnyJvmConverter
import kr.jadekim.protobuf.`annotation`.GeneratorVersion
import kr.jadekim.protobuf.converter.mapper.ProtobufTypeMapper
import kr.jadekim.protobuf.util.asJavaType
import kr.jadekim.protobuf.util.asKotlinType

public object MsgSetOrchestratorAddressesJvmConverter :
    ProtobufTypeMapper<MsgSetOrchestratorAddresses, Msgs.MsgSetOrchestratorAddresses> {
  public override val descriptor: Descriptors.Descriptor =
      Msgs.MsgSetOrchestratorAddresses.getDescriptor()

  public override val parser: Parser<Msgs.MsgSetOrchestratorAddresses> =
      Msgs.MsgSetOrchestratorAddresses.parser()

  public override fun convert(obj: Msgs.MsgSetOrchestratorAddresses): MsgSetOrchestratorAddresses =
      MsgSetOrchestratorAddresses(
  	sender = obj.getSender(),
  	orchestrator = obj.getOrchestrator(),
  	ethAddress = obj.getEthAddress(),
  )

  public override fun convert(obj: MsgSetOrchestratorAddresses): Msgs.MsgSetOrchestratorAddresses {
    val builder = Msgs.MsgSetOrchestratorAddresses.newBuilder()
    builder.setSender(obj.sender)
    builder.setOrchestrator(obj.orchestrator)
    builder.setEthAddress(obj.ethAddress)
    return builder.build()
  }
}

public object MsgSetOrchestratorAddressesResponseJvmConverter :
    ProtobufTypeMapper<MsgSetOrchestratorAddressesResponse, Msgs.MsgSetOrchestratorAddressesResponse>
    {
  public override val descriptor: Descriptors.Descriptor =
      Msgs.MsgSetOrchestratorAddressesResponse.getDescriptor()

  public override val parser: Parser<Msgs.MsgSetOrchestratorAddressesResponse> =
      Msgs.MsgSetOrchestratorAddressesResponse.parser()

  public override fun convert(obj: Msgs.MsgSetOrchestratorAddressesResponse):
      MsgSetOrchestratorAddressesResponse = MsgSetOrchestratorAddressesResponse(
  )

  public override fun convert(obj: MsgSetOrchestratorAddressesResponse):
      Msgs.MsgSetOrchestratorAddressesResponse {
    val builder = Msgs.MsgSetOrchestratorAddressesResponse.newBuilder()
    return builder.build()
  }
}

public object MsgValsetConfirmJvmConverter :
    ProtobufTypeMapper<MsgValsetConfirm, Msgs.MsgValsetConfirm> {
  public override val descriptor: Descriptors.Descriptor = Msgs.MsgValsetConfirm.getDescriptor()

  public override val parser: Parser<Msgs.MsgValsetConfirm> = Msgs.MsgValsetConfirm.parser()

  public override fun convert(obj: Msgs.MsgValsetConfirm): MsgValsetConfirm = MsgValsetConfirm(
  	nonce = obj.getNonce().asKotlinType,
  	orchestrator = obj.getOrchestrator(),
  	ethAddress = obj.getEthAddress(),
  	signature = obj.getSignature(),
  )

  public override fun convert(obj: MsgValsetConfirm): Msgs.MsgValsetConfirm {
    val builder = Msgs.MsgValsetConfirm.newBuilder()
    builder.setNonce(obj.nonce.asJavaType)
    builder.setOrchestrator(obj.orchestrator)
    builder.setEthAddress(obj.ethAddress)
    builder.setSignature(obj.signature)
    return builder.build()
  }
}

public object MsgValsetConfirmResponseJvmConverter :
    ProtobufTypeMapper<MsgValsetConfirmResponse, Msgs.MsgValsetConfirmResponse> {
  public override val descriptor: Descriptors.Descriptor =
      Msgs.MsgValsetConfirmResponse.getDescriptor()

  public override val parser: Parser<Msgs.MsgValsetConfirmResponse> =
      Msgs.MsgValsetConfirmResponse.parser()

  public override fun convert(obj: Msgs.MsgValsetConfirmResponse): MsgValsetConfirmResponse =
      MsgValsetConfirmResponse(
  )

  public override fun convert(obj: MsgValsetConfirmResponse): Msgs.MsgValsetConfirmResponse {
    val builder = Msgs.MsgValsetConfirmResponse.newBuilder()
    return builder.build()
  }
}

public object MsgSendToEthJvmConverter : ProtobufTypeMapper<MsgSendToEth, Msgs.MsgSendToEth> {
  public override val descriptor: Descriptors.Descriptor = Msgs.MsgSendToEth.getDescriptor()

  public override val parser: Parser<Msgs.MsgSendToEth> = Msgs.MsgSendToEth.parser()

  public override fun convert(obj: Msgs.MsgSendToEth): MsgSendToEth = MsgSendToEth(
  	sender = obj.getSender(),
  	ethDest = obj.getEthDest(),
  	amount = CoinJvmConverter.convert(obj.getAmount()),
  	bridgeFee = CoinJvmConverter.convert(obj.getBridgeFee()),
  )

  public override fun convert(obj: MsgSendToEth): Msgs.MsgSendToEth {
    val builder = Msgs.MsgSendToEth.newBuilder()
    builder.setSender(obj.sender)
    builder.setEthDest(obj.ethDest)
    builder.setAmount(CoinJvmConverter.convert(obj.amount))
    builder.setBridgeFee(CoinJvmConverter.convert(obj.bridgeFee))
    return builder.build()
  }
}

public object MsgSendToEthResponseJvmConverter :
    ProtobufTypeMapper<MsgSendToEthResponse, Msgs.MsgSendToEthResponse> {
  public override val descriptor: Descriptors.Descriptor = Msgs.MsgSendToEthResponse.getDescriptor()

  public override val parser: Parser<Msgs.MsgSendToEthResponse> = Msgs.MsgSendToEthResponse.parser()

  public override fun convert(obj: Msgs.MsgSendToEthResponse): MsgSendToEthResponse =
      MsgSendToEthResponse(
  )

  public override fun convert(obj: MsgSendToEthResponse): Msgs.MsgSendToEthResponse {
    val builder = Msgs.MsgSendToEthResponse.newBuilder()
    return builder.build()
  }
}

public object MsgRequestBatchJvmConverter :
    ProtobufTypeMapper<MsgRequestBatch, Msgs.MsgRequestBatch> {
  public override val descriptor: Descriptors.Descriptor = Msgs.MsgRequestBatch.getDescriptor()

  public override val parser: Parser<Msgs.MsgRequestBatch> = Msgs.MsgRequestBatch.parser()

  public override fun convert(obj: Msgs.MsgRequestBatch): MsgRequestBatch = MsgRequestBatch(
  	orchestrator = obj.getOrchestrator(),
  	denom = obj.getDenom(),
  )

  public override fun convert(obj: MsgRequestBatch): Msgs.MsgRequestBatch {
    val builder = Msgs.MsgRequestBatch.newBuilder()
    builder.setOrchestrator(obj.orchestrator)
    builder.setDenom(obj.denom)
    return builder.build()
  }
}

public object MsgRequestBatchResponseJvmConverter :
    ProtobufTypeMapper<MsgRequestBatchResponse, Msgs.MsgRequestBatchResponse> {
  public override val descriptor: Descriptors.Descriptor =
      Msgs.MsgRequestBatchResponse.getDescriptor()

  public override val parser: Parser<Msgs.MsgRequestBatchResponse> =
      Msgs.MsgRequestBatchResponse.parser()

  public override fun convert(obj: Msgs.MsgRequestBatchResponse): MsgRequestBatchResponse =
      MsgRequestBatchResponse(
  )

  public override fun convert(obj: MsgRequestBatchResponse): Msgs.MsgRequestBatchResponse {
    val builder = Msgs.MsgRequestBatchResponse.newBuilder()
    return builder.build()
  }
}

public object MsgConfirmBatchJvmConverter :
    ProtobufTypeMapper<MsgConfirmBatch, Msgs.MsgConfirmBatch> {
  public override val descriptor: Descriptors.Descriptor = Msgs.MsgConfirmBatch.getDescriptor()

  public override val parser: Parser<Msgs.MsgConfirmBatch> = Msgs.MsgConfirmBatch.parser()

  public override fun convert(obj: Msgs.MsgConfirmBatch): MsgConfirmBatch = MsgConfirmBatch(
  	nonce = obj.getNonce().asKotlinType,
  	tokenContract = obj.getTokenContract(),
  	ethSigner = obj.getEthSigner(),
  	orchestrator = obj.getOrchestrator(),
  	signature = obj.getSignature(),
  )

  public override fun convert(obj: MsgConfirmBatch): Msgs.MsgConfirmBatch {
    val builder = Msgs.MsgConfirmBatch.newBuilder()
    builder.setNonce(obj.nonce.asJavaType)
    builder.setTokenContract(obj.tokenContract)
    builder.setEthSigner(obj.ethSigner)
    builder.setOrchestrator(obj.orchestrator)
    builder.setSignature(obj.signature)
    return builder.build()
  }
}

public object MsgConfirmBatchResponseJvmConverter :
    ProtobufTypeMapper<MsgConfirmBatchResponse, Msgs.MsgConfirmBatchResponse> {
  public override val descriptor: Descriptors.Descriptor =
      Msgs.MsgConfirmBatchResponse.getDescriptor()

  public override val parser: Parser<Msgs.MsgConfirmBatchResponse> =
      Msgs.MsgConfirmBatchResponse.parser()

  public override fun convert(obj: Msgs.MsgConfirmBatchResponse): MsgConfirmBatchResponse =
      MsgConfirmBatchResponse(
  )

  public override fun convert(obj: MsgConfirmBatchResponse): Msgs.MsgConfirmBatchResponse {
    val builder = Msgs.MsgConfirmBatchResponse.newBuilder()
    return builder.build()
  }
}

public object MsgDepositClaimJvmConverter :
    ProtobufTypeMapper<MsgDepositClaim, Msgs.MsgDepositClaim> {
  public override val descriptor: Descriptors.Descriptor = Msgs.MsgDepositClaim.getDescriptor()

  public override val parser: Parser<Msgs.MsgDepositClaim> = Msgs.MsgDepositClaim.parser()

  public override fun convert(obj: Msgs.MsgDepositClaim): MsgDepositClaim = MsgDepositClaim(
  	eventNonce = obj.getEventNonce().asKotlinType,
  	blockHeight = obj.getBlockHeight().asKotlinType,
  	tokenContract = obj.getTokenContract(),
  	amount = obj.getAmount(),
  	ethereumSender = obj.getEthereumSender(),
  	cosmosReceiver = obj.getCosmosReceiver(),
  	orchestrator = obj.getOrchestrator(),
  	`data` = obj.getData(),
  )

  public override fun convert(obj: MsgDepositClaim): Msgs.MsgDepositClaim {
    val builder = Msgs.MsgDepositClaim.newBuilder()
    builder.setEventNonce(obj.eventNonce.asJavaType)
    builder.setBlockHeight(obj.blockHeight.asJavaType)
    builder.setTokenContract(obj.tokenContract)
    builder.setAmount(obj.amount)
    builder.setEthereumSender(obj.ethereumSender)
    builder.setCosmosReceiver(obj.cosmosReceiver)
    builder.setOrchestrator(obj.orchestrator)
    builder.setData(obj.`data`)
    return builder.build()
  }
}

public object MsgDepositClaimResponseJvmConverter :
    ProtobufTypeMapper<MsgDepositClaimResponse, Msgs.MsgDepositClaimResponse> {
  public override val descriptor: Descriptors.Descriptor =
      Msgs.MsgDepositClaimResponse.getDescriptor()

  public override val parser: Parser<Msgs.MsgDepositClaimResponse> =
      Msgs.MsgDepositClaimResponse.parser()

  public override fun convert(obj: Msgs.MsgDepositClaimResponse): MsgDepositClaimResponse =
      MsgDepositClaimResponse(
  )

  public override fun convert(obj: MsgDepositClaimResponse): Msgs.MsgDepositClaimResponse {
    val builder = Msgs.MsgDepositClaimResponse.newBuilder()
    return builder.build()
  }
}

public object MsgWithdrawClaimJvmConverter :
    ProtobufTypeMapper<MsgWithdrawClaim, Msgs.MsgWithdrawClaim> {
  public override val descriptor: Descriptors.Descriptor = Msgs.MsgWithdrawClaim.getDescriptor()

  public override val parser: Parser<Msgs.MsgWithdrawClaim> = Msgs.MsgWithdrawClaim.parser()

  public override fun convert(obj: Msgs.MsgWithdrawClaim): MsgWithdrawClaim = MsgWithdrawClaim(
  	eventNonce = obj.getEventNonce().asKotlinType,
  	blockHeight = obj.getBlockHeight().asKotlinType,
  	batchNonce = obj.getBatchNonce().asKotlinType,
  	tokenContract = obj.getTokenContract(),
  	orchestrator = obj.getOrchestrator(),
  )

  public override fun convert(obj: MsgWithdrawClaim): Msgs.MsgWithdrawClaim {
    val builder = Msgs.MsgWithdrawClaim.newBuilder()
    builder.setEventNonce(obj.eventNonce.asJavaType)
    builder.setBlockHeight(obj.blockHeight.asJavaType)
    builder.setBatchNonce(obj.batchNonce.asJavaType)
    builder.setTokenContract(obj.tokenContract)
    builder.setOrchestrator(obj.orchestrator)
    return builder.build()
  }
}

public object MsgWithdrawClaimResponseJvmConverter :
    ProtobufTypeMapper<MsgWithdrawClaimResponse, Msgs.MsgWithdrawClaimResponse> {
  public override val descriptor: Descriptors.Descriptor =
      Msgs.MsgWithdrawClaimResponse.getDescriptor()

  public override val parser: Parser<Msgs.MsgWithdrawClaimResponse> =
      Msgs.MsgWithdrawClaimResponse.parser()

  public override fun convert(obj: Msgs.MsgWithdrawClaimResponse): MsgWithdrawClaimResponse =
      MsgWithdrawClaimResponse(
  )

  public override fun convert(obj: MsgWithdrawClaimResponse): Msgs.MsgWithdrawClaimResponse {
    val builder = Msgs.MsgWithdrawClaimResponse.newBuilder()
    return builder.build()
  }
}

public object MsgERC20DeployedClaimJvmConverter :
    ProtobufTypeMapper<MsgERC20DeployedClaim, Msgs.MsgERC20DeployedClaim> {
  public override val descriptor: Descriptors.Descriptor =
      Msgs.MsgERC20DeployedClaim.getDescriptor()

  public override val parser: Parser<Msgs.MsgERC20DeployedClaim> =
      Msgs.MsgERC20DeployedClaim.parser()

  public override fun convert(obj: Msgs.MsgERC20DeployedClaim): MsgERC20DeployedClaim =
      MsgERC20DeployedClaim(
  	eventNonce = obj.getEventNonce().asKotlinType,
  	blockHeight = obj.getBlockHeight().asKotlinType,
  	cosmosDenom = obj.getCosmosDenom(),
  	tokenContract = obj.getTokenContract(),
  	name = obj.getName(),
  	symbol = obj.getSymbol(),
  	decimals = obj.getDecimals().asKotlinType,
  	orchestrator = obj.getOrchestrator(),
  )

  public override fun convert(obj: MsgERC20DeployedClaim): Msgs.MsgERC20DeployedClaim {
    val builder = Msgs.MsgERC20DeployedClaim.newBuilder()
    builder.setEventNonce(obj.eventNonce.asJavaType)
    builder.setBlockHeight(obj.blockHeight.asJavaType)
    builder.setCosmosDenom(obj.cosmosDenom)
    builder.setTokenContract(obj.tokenContract)
    builder.setName(obj.name)
    builder.setSymbol(obj.symbol)
    builder.setDecimals(obj.decimals.asJavaType)
    builder.setOrchestrator(obj.orchestrator)
    return builder.build()
  }
}

public object MsgERC20DeployedClaimResponseJvmConverter :
    ProtobufTypeMapper<MsgERC20DeployedClaimResponse, Msgs.MsgERC20DeployedClaimResponse> {
  public override val descriptor: Descriptors.Descriptor =
      Msgs.MsgERC20DeployedClaimResponse.getDescriptor()

  public override val parser: Parser<Msgs.MsgERC20DeployedClaimResponse> =
      Msgs.MsgERC20DeployedClaimResponse.parser()

  public override fun convert(obj: Msgs.MsgERC20DeployedClaimResponse):
      MsgERC20DeployedClaimResponse = MsgERC20DeployedClaimResponse(
  )

  public override fun convert(obj: MsgERC20DeployedClaimResponse):
      Msgs.MsgERC20DeployedClaimResponse {
    val builder = Msgs.MsgERC20DeployedClaimResponse.newBuilder()
    return builder.build()
  }
}

public object MsgCancelSendToEthJvmConverter :
    ProtobufTypeMapper<MsgCancelSendToEth, Msgs.MsgCancelSendToEth> {
  public override val descriptor: Descriptors.Descriptor = Msgs.MsgCancelSendToEth.getDescriptor()

  public override val parser: Parser<Msgs.MsgCancelSendToEth> = Msgs.MsgCancelSendToEth.parser()

  public override fun convert(obj: Msgs.MsgCancelSendToEth): MsgCancelSendToEth =
      MsgCancelSendToEth(
  	transactionId = obj.getTransactionId().asKotlinType,
  	sender = obj.getSender(),
  )

  public override fun convert(obj: MsgCancelSendToEth): Msgs.MsgCancelSendToEth {
    val builder = Msgs.MsgCancelSendToEth.newBuilder()
    builder.setTransactionId(obj.transactionId.asJavaType)
    builder.setSender(obj.sender)
    return builder.build()
  }
}

public object MsgCancelSendToEthResponseJvmConverter :
    ProtobufTypeMapper<MsgCancelSendToEthResponse, Msgs.MsgCancelSendToEthResponse> {
  public override val descriptor: Descriptors.Descriptor =
      Msgs.MsgCancelSendToEthResponse.getDescriptor()

  public override val parser: Parser<Msgs.MsgCancelSendToEthResponse> =
      Msgs.MsgCancelSendToEthResponse.parser()

  public override fun convert(obj: Msgs.MsgCancelSendToEthResponse): MsgCancelSendToEthResponse =
      MsgCancelSendToEthResponse(
  )

  public override fun convert(obj: MsgCancelSendToEthResponse): Msgs.MsgCancelSendToEthResponse {
    val builder = Msgs.MsgCancelSendToEthResponse.newBuilder()
    return builder.build()
  }
}

public object MsgSubmitBadSignatureEvidenceJvmConverter :
    ProtobufTypeMapper<MsgSubmitBadSignatureEvidence, Msgs.MsgSubmitBadSignatureEvidence> {
  public override val descriptor: Descriptors.Descriptor =
      Msgs.MsgSubmitBadSignatureEvidence.getDescriptor()

  public override val parser: Parser<Msgs.MsgSubmitBadSignatureEvidence> =
      Msgs.MsgSubmitBadSignatureEvidence.parser()

  public override fun convert(obj: Msgs.MsgSubmitBadSignatureEvidence):
      MsgSubmitBadSignatureEvidence = MsgSubmitBadSignatureEvidence(
  	subject = AnyJvmConverter.convert(obj.getSubject()),
  	signature = obj.getSignature(),
  	sender = obj.getSender(),
  )

  public override fun convert(obj: MsgSubmitBadSignatureEvidence):
      Msgs.MsgSubmitBadSignatureEvidence {
    val builder = Msgs.MsgSubmitBadSignatureEvidence.newBuilder()
    builder.setSubject(AnyJvmConverter.convert(obj.subject))
    builder.setSignature(obj.signature)
    builder.setSender(obj.sender)
    return builder.build()
  }
}

public object MsgSubmitBadSignatureEvidenceResponseJvmConverter :
    ProtobufTypeMapper<MsgSubmitBadSignatureEvidenceResponse, Msgs.MsgSubmitBadSignatureEvidenceResponse>
    {
  public override val descriptor: Descriptors.Descriptor =
      Msgs.MsgSubmitBadSignatureEvidenceResponse.getDescriptor()

  public override val parser: Parser<Msgs.MsgSubmitBadSignatureEvidenceResponse> =
      Msgs.MsgSubmitBadSignatureEvidenceResponse.parser()

  public override fun convert(obj: Msgs.MsgSubmitBadSignatureEvidenceResponse):
      MsgSubmitBadSignatureEvidenceResponse = MsgSubmitBadSignatureEvidenceResponse(
  )

  public override fun convert(obj: MsgSubmitBadSignatureEvidenceResponse):
      Msgs.MsgSubmitBadSignatureEvidenceResponse {
    val builder = Msgs.MsgSubmitBadSignatureEvidenceResponse.newBuilder()
    return builder.build()
  }
}

public object MsgValsetUpdatedClaimJvmConverter :
    ProtobufTypeMapper<MsgValsetUpdatedClaim, Msgs.MsgValsetUpdatedClaim> {
  public override val descriptor: Descriptors.Descriptor =
      Msgs.MsgValsetUpdatedClaim.getDescriptor()

  public override val parser: Parser<Msgs.MsgValsetUpdatedClaim> =
      Msgs.MsgValsetUpdatedClaim.parser()

  public override fun convert(obj: Msgs.MsgValsetUpdatedClaim): MsgValsetUpdatedClaim =
      MsgValsetUpdatedClaim(
  	eventNonce = obj.getEventNonce().asKotlinType,
  	valsetNonce = obj.getValsetNonce().asKotlinType,
  	blockHeight = obj.getBlockHeight().asKotlinType,
  	members = obj.getMembersList().map { BridgeValidatorJvmConverter.convert(it) },
  	rewardAmount = obj.getRewardAmount(),
  	rewardToken = obj.getRewardToken(),
  	orchestrator = obj.getOrchestrator(),
  )

  public override fun convert(obj: MsgValsetUpdatedClaim): Msgs.MsgValsetUpdatedClaim {
    val builder = Msgs.MsgValsetUpdatedClaim.newBuilder()
    builder.setEventNonce(obj.eventNonce.asJavaType)
    builder.setValsetNonce(obj.valsetNonce.asJavaType)
    builder.setBlockHeight(obj.blockHeight.asJavaType)
    builder.addAllMembers(obj.members.map { BridgeValidatorJvmConverter.convert(it) })
    builder.setRewardAmount(obj.rewardAmount)
    builder.setRewardToken(obj.rewardToken)
    builder.setOrchestrator(obj.orchestrator)
    return builder.build()
  }
}

public object MsgValsetUpdatedClaimResponseJvmConverter :
    ProtobufTypeMapper<MsgValsetUpdatedClaimResponse, Msgs.MsgValsetUpdatedClaimResponse> {
  public override val descriptor: Descriptors.Descriptor =
      Msgs.MsgValsetUpdatedClaimResponse.getDescriptor()

  public override val parser: Parser<Msgs.MsgValsetUpdatedClaimResponse> =
      Msgs.MsgValsetUpdatedClaimResponse.parser()

  public override fun convert(obj: Msgs.MsgValsetUpdatedClaimResponse):
      MsgValsetUpdatedClaimResponse = MsgValsetUpdatedClaimResponse(
  )

  public override fun convert(obj: MsgValsetUpdatedClaimResponse):
      Msgs.MsgValsetUpdatedClaimResponse {
    val builder = Msgs.MsgValsetUpdatedClaimResponse.newBuilder()
    return builder.build()
  }
}

public object MsgUpdateParamsJvmConverter :
    ProtobufTypeMapper<MsgUpdateParams, Msgs.MsgUpdateParams> {
  public override val descriptor: Descriptors.Descriptor = Msgs.MsgUpdateParams.getDescriptor()

  public override val parser: Parser<Msgs.MsgUpdateParams> = Msgs.MsgUpdateParams.parser()

  public override fun convert(obj: Msgs.MsgUpdateParams): MsgUpdateParams = MsgUpdateParams(
  	authority = obj.getAuthority(),
  	params = ParamsJvmConverter.convert(obj.getParams()),
  )

  public override fun convert(obj: MsgUpdateParams): Msgs.MsgUpdateParams {
    val builder = Msgs.MsgUpdateParams.newBuilder()
    builder.setAuthority(obj.authority)
    builder.setParams(ParamsJvmConverter.convert(obj.params))
    return builder.build()
  }
}

public object MsgUpdateParamsResponseJvmConverter :
    ProtobufTypeMapper<MsgUpdateParamsResponse, Msgs.MsgUpdateParamsResponse> {
  public override val descriptor: Descriptors.Descriptor =
      Msgs.MsgUpdateParamsResponse.getDescriptor()

  public override val parser: Parser<Msgs.MsgUpdateParamsResponse> =
      Msgs.MsgUpdateParamsResponse.parser()

  public override fun convert(obj: Msgs.MsgUpdateParamsResponse): MsgUpdateParamsResponse =
      MsgUpdateParamsResponse(
  )

  public override fun convert(obj: MsgUpdateParamsResponse): Msgs.MsgUpdateParamsResponse {
    val builder = Msgs.MsgUpdateParamsResponse.newBuilder()
    return builder.build()
  }
}
