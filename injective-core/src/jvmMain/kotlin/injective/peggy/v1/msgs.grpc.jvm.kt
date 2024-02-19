// Transform from injective/peggy/v1/msgs.proto
@file:ProtobufSyntax(syntax = "PROTO3")
@file:GeneratorVersion(version = "0.3.1")

package injective.peggy.v1

import io.grpc.CallOptions
import io.grpc.Channel
import io.grpc.Metadata
import io.grpc.MethodDescriptor
import io.grpc.ServerServiceDefinition
import io.grpc.ServiceDescriptor
import io.grpc.Status
import io.grpc.StatusException
import io.grpc.kotlin.AbstractCoroutineServerImpl
import io.grpc.kotlin.AbstractCoroutineStub
import io.grpc.kotlin.ClientCalls
import io.grpc.kotlin.ServerCalls
import kotlin.coroutines.CoroutineContext
import kotlin.coroutines.EmptyCoroutineContext
import kr.jadekim.protobuf.`annotation`.GeneratorVersion
import kr.jadekim.protobuf.`annotation`.ProtobufSyntax
import kr.jadekim.protobuf.grpc.ClientOption

public object MsgJvm {
  private val descriptor: ServiceDescriptor = MsgGrpc.getServiceDescriptor()!!

  private val valsetConfirmDescriptor:
      MethodDescriptor<Msgs.MsgValsetConfirm, Msgs.MsgValsetConfirmResponse> =
      MsgGrpc.getValsetConfirmMethod()!!

  private val sendToEthDescriptor: MethodDescriptor<Msgs.MsgSendToEth, Msgs.MsgSendToEthResponse> =
      MsgGrpc.getSendToEthMethod()!!

  private val requestBatchDescriptor:
      MethodDescriptor<Msgs.MsgRequestBatch, Msgs.MsgRequestBatchResponse> =
      MsgGrpc.getRequestBatchMethod()!!

  private val confirmBatchDescriptor:
      MethodDescriptor<Msgs.MsgConfirmBatch, Msgs.MsgConfirmBatchResponse> =
      MsgGrpc.getConfirmBatchMethod()!!

  private val depositClaimDescriptor:
      MethodDescriptor<Msgs.MsgDepositClaim, Msgs.MsgDepositClaimResponse> =
      MsgGrpc.getDepositClaimMethod()!!

  private val withdrawClaimDescriptor:
      MethodDescriptor<Msgs.MsgWithdrawClaim, Msgs.MsgWithdrawClaimResponse> =
      MsgGrpc.getWithdrawClaimMethod()!!

  private val valsetUpdateClaimDescriptor:
      MethodDescriptor<Msgs.MsgValsetUpdatedClaim, Msgs.MsgValsetUpdatedClaimResponse> =
      MsgGrpc.getValsetUpdateClaimMethod()!!

  private val eRC20DeployedClaimDescriptor:
      MethodDescriptor<Msgs.MsgERC20DeployedClaim, Msgs.MsgERC20DeployedClaimResponse> =
      MsgGrpc.getERC20DeployedClaimMethod()!!

  private val setOrchestratorAddressesDescriptor:
      MethodDescriptor<Msgs.MsgSetOrchestratorAddresses, Msgs.MsgSetOrchestratorAddressesResponse> =
      MsgGrpc.getSetOrchestratorAddressesMethod()!!

  private val cancelSendToEthDescriptor:
      MethodDescriptor<Msgs.MsgCancelSendToEth, Msgs.MsgCancelSendToEthResponse> =
      MsgGrpc.getCancelSendToEthMethod()!!

  private val submitBadSignatureEvidenceDescriptor:
      MethodDescriptor<Msgs.MsgSubmitBadSignatureEvidence, Msgs.MsgSubmitBadSignatureEvidenceResponse>
      = MsgGrpc.getSubmitBadSignatureEvidenceMethod()!!

  private val updateParamsDescriptor:
      MethodDescriptor<Msgs.MsgUpdateParams, Msgs.MsgUpdateParamsResponse> =
      MsgGrpc.getUpdateParamsMethod()!!

  public abstract class Server(
    coroutineContext: CoroutineContext = EmptyCoroutineContext,
  ) : AbstractCoroutineServerImpl(context = coroutineContext), Msg.Interface {
    public open override suspend fun valsetConfirm(request: MsgValsetConfirm):
        MsgValsetConfirmResponse = throw
        StatusException(Status.UNIMPLEMENTED.withDescription("Method injective.peggy.v1.Msg.ValsetConfirm is unimplemented"))

    public open override suspend fun sendToEth(request: MsgSendToEth): MsgSendToEthResponse = throw
        StatusException(Status.UNIMPLEMENTED.withDescription("Method injective.peggy.v1.Msg.SendToEth is unimplemented"))

    public open override suspend fun requestBatch(request: MsgRequestBatch): MsgRequestBatchResponse
        = throw
        StatusException(Status.UNIMPLEMENTED.withDescription("Method injective.peggy.v1.Msg.RequestBatch is unimplemented"))

    public open override suspend fun confirmBatch(request: MsgConfirmBatch): MsgConfirmBatchResponse
        = throw
        StatusException(Status.UNIMPLEMENTED.withDescription("Method injective.peggy.v1.Msg.ConfirmBatch is unimplemented"))

    public open override suspend fun depositClaim(request: MsgDepositClaim): MsgDepositClaimResponse
        = throw
        StatusException(Status.UNIMPLEMENTED.withDescription("Method injective.peggy.v1.Msg.DepositClaim is unimplemented"))

    public open override suspend fun withdrawClaim(request: MsgWithdrawClaim):
        MsgWithdrawClaimResponse = throw
        StatusException(Status.UNIMPLEMENTED.withDescription("Method injective.peggy.v1.Msg.WithdrawClaim is unimplemented"))

    public open override suspend fun valsetUpdateClaim(request: MsgValsetUpdatedClaim):
        MsgValsetUpdatedClaimResponse = throw
        StatusException(Status.UNIMPLEMENTED.withDescription("Method injective.peggy.v1.Msg.ValsetUpdateClaim is unimplemented"))

    public open override suspend fun eRC20DeployedClaim(request: MsgERC20DeployedClaim):
        MsgERC20DeployedClaimResponse = throw
        StatusException(Status.UNIMPLEMENTED.withDescription("Method injective.peggy.v1.Msg.ERC20DeployedClaim is unimplemented"))

    public open override suspend fun setOrchestratorAddresses(request: MsgSetOrchestratorAddresses):
        MsgSetOrchestratorAddressesResponse = throw
        StatusException(Status.UNIMPLEMENTED.withDescription("Method injective.peggy.v1.Msg.SetOrchestratorAddresses is unimplemented"))

    public open override suspend fun cancelSendToEth(request: MsgCancelSendToEth):
        MsgCancelSendToEthResponse = throw
        StatusException(Status.UNIMPLEMENTED.withDescription("Method injective.peggy.v1.Msg.CancelSendToEth is unimplemented"))

    public open override suspend
        fun submitBadSignatureEvidence(request: MsgSubmitBadSignatureEvidence):
        MsgSubmitBadSignatureEvidenceResponse = throw
        StatusException(Status.UNIMPLEMENTED.withDescription("Method injective.peggy.v1.Msg.SubmitBadSignatureEvidence is unimplemented"))

    public open override suspend fun updateParams(request: MsgUpdateParams): MsgUpdateParamsResponse
        = throw
        StatusException(Status.UNIMPLEMENTED.withDescription("Method injective.peggy.v1.Msg.UpdateParams is unimplemented"))

    public override fun bindService(): ServerServiceDefinition =
        ServerServiceDefinition.builder(descriptor)
    		.addMethod(
    			ServerCalls.unaryServerMethodDefinition(
    				context = this.context,
    				descriptor = valsetConfirmDescriptor,
    				implementation = {
        MsgValsetConfirmResponseJvmConverter.convert(valsetConfirm(MsgValsetConfirmJvmConverter.convert(it)))
        },
    			)
    		)
    		.addMethod(
    			ServerCalls.unaryServerMethodDefinition(
    				context = this.context,
    				descriptor = sendToEthDescriptor,
    				implementation = {
        MsgSendToEthResponseJvmConverter.convert(sendToEth(MsgSendToEthJvmConverter.convert(it))) },
    			)
    		)
    		.addMethod(
    			ServerCalls.unaryServerMethodDefinition(
    				context = this.context,
    				descriptor = requestBatchDescriptor,
    				implementation = {
        MsgRequestBatchResponseJvmConverter.convert(requestBatch(MsgRequestBatchJvmConverter.convert(it)))
        },
    			)
    		)
    		.addMethod(
    			ServerCalls.unaryServerMethodDefinition(
    				context = this.context,
    				descriptor = confirmBatchDescriptor,
    				implementation = {
        MsgConfirmBatchResponseJvmConverter.convert(confirmBatch(MsgConfirmBatchJvmConverter.convert(it)))
        },
    			)
    		)
    		.addMethod(
    			ServerCalls.unaryServerMethodDefinition(
    				context = this.context,
    				descriptor = depositClaimDescriptor,
    				implementation = {
        MsgDepositClaimResponseJvmConverter.convert(depositClaim(MsgDepositClaimJvmConverter.convert(it)))
        },
    			)
    		)
    		.addMethod(
    			ServerCalls.unaryServerMethodDefinition(
    				context = this.context,
    				descriptor = withdrawClaimDescriptor,
    				implementation = {
        MsgWithdrawClaimResponseJvmConverter.convert(withdrawClaim(MsgWithdrawClaimJvmConverter.convert(it)))
        },
    			)
    		)
    		.addMethod(
    			ServerCalls.unaryServerMethodDefinition(
    				context = this.context,
    				descriptor = valsetUpdateClaimDescriptor,
    				implementation = {
        MsgValsetUpdatedClaimResponseJvmConverter.convert(valsetUpdateClaim(MsgValsetUpdatedClaimJvmConverter.convert(it)))
        },
    			)
    		)
    		.addMethod(
    			ServerCalls.unaryServerMethodDefinition(
    				context = this.context,
    				descriptor = eRC20DeployedClaimDescriptor,
    				implementation = {
        MsgERC20DeployedClaimResponseJvmConverter.convert(eRC20DeployedClaim(MsgERC20DeployedClaimJvmConverter.convert(it)))
        },
    			)
    		)
    		.addMethod(
    			ServerCalls.unaryServerMethodDefinition(
    				context = this.context,
    				descriptor = setOrchestratorAddressesDescriptor,
    				implementation = {
        MsgSetOrchestratorAddressesResponseJvmConverter.convert(setOrchestratorAddresses(MsgSetOrchestratorAddressesJvmConverter.convert(it)))
        },
    			)
    		)
    		.addMethod(
    			ServerCalls.unaryServerMethodDefinition(
    				context = this.context,
    				descriptor = cancelSendToEthDescriptor,
    				implementation = {
        MsgCancelSendToEthResponseJvmConverter.convert(cancelSendToEth(MsgCancelSendToEthJvmConverter.convert(it)))
        },
    			)
    		)
    		.addMethod(
    			ServerCalls.unaryServerMethodDefinition(
    				context = this.context,
    				descriptor = submitBadSignatureEvidenceDescriptor,
    				implementation = {
        MsgSubmitBadSignatureEvidenceResponseJvmConverter.convert(submitBadSignatureEvidence(MsgSubmitBadSignatureEvidenceJvmConverter.convert(it)))
        },
    			)
    		)
    		.addMethod(
    			ServerCalls.unaryServerMethodDefinition(
    				context = this.context,
    				descriptor = updateParamsDescriptor,
    				implementation = {
        MsgUpdateParamsResponseJvmConverter.convert(updateParams(MsgUpdateParamsJvmConverter.convert(it)))
        },
    			)
    		)
    		.build()
  }

  public open class Client(
    private val option: ClientOption,
  ) : AbstractCoroutineStub<Msg.Client>(channel = option.channel, callOptions = option.callOptions),
      Msg.Interface {
    public override fun build(channel: Channel, callOptions: CallOptions): Msg.Client =
        Msg.Client(ClientOption(channel, callOptions))

    public override suspend fun valsetConfirm(request: MsgValsetConfirm): MsgValsetConfirmResponse =
        valsetConfirm(request, Metadata())

    public suspend fun valsetConfirm(request: MsgValsetConfirm, metadata: Metadata):
        MsgValsetConfirmResponse = MsgValsetConfirmResponseJvmConverter.convert(
    		ClientCalls.unaryRpc(
    			option.channel, valsetConfirmDescriptor,
    			MsgValsetConfirmJvmConverter.convert(request),
    			option.callOptions, metadata,
    		),
    	)

    public override suspend fun sendToEth(request: MsgSendToEth): MsgSendToEthResponse =
        sendToEth(request, Metadata())

    public suspend fun sendToEth(request: MsgSendToEth, metadata: Metadata): MsgSendToEthResponse =
        MsgSendToEthResponseJvmConverter.convert(
    		ClientCalls.unaryRpc(
    			option.channel, sendToEthDescriptor,
    			MsgSendToEthJvmConverter.convert(request),
    			option.callOptions, metadata,
    		),
    	)

    public override suspend fun requestBatch(request: MsgRequestBatch): MsgRequestBatchResponse =
        requestBatch(request, Metadata())

    public suspend fun requestBatch(request: MsgRequestBatch, metadata: Metadata):
        MsgRequestBatchResponse = MsgRequestBatchResponseJvmConverter.convert(
    		ClientCalls.unaryRpc(
    			option.channel, requestBatchDescriptor,
    			MsgRequestBatchJvmConverter.convert(request),
    			option.callOptions, metadata,
    		),
    	)

    public override suspend fun confirmBatch(request: MsgConfirmBatch): MsgConfirmBatchResponse =
        confirmBatch(request, Metadata())

    public suspend fun confirmBatch(request: MsgConfirmBatch, metadata: Metadata):
        MsgConfirmBatchResponse = MsgConfirmBatchResponseJvmConverter.convert(
    		ClientCalls.unaryRpc(
    			option.channel, confirmBatchDescriptor,
    			MsgConfirmBatchJvmConverter.convert(request),
    			option.callOptions, metadata,
    		),
    	)

    public override suspend fun depositClaim(request: MsgDepositClaim): MsgDepositClaimResponse =
        depositClaim(request, Metadata())

    public suspend fun depositClaim(request: MsgDepositClaim, metadata: Metadata):
        MsgDepositClaimResponse = MsgDepositClaimResponseJvmConverter.convert(
    		ClientCalls.unaryRpc(
    			option.channel, depositClaimDescriptor,
    			MsgDepositClaimJvmConverter.convert(request),
    			option.callOptions, metadata,
    		),
    	)

    public override suspend fun withdrawClaim(request: MsgWithdrawClaim): MsgWithdrawClaimResponse =
        withdrawClaim(request, Metadata())

    public suspend fun withdrawClaim(request: MsgWithdrawClaim, metadata: Metadata):
        MsgWithdrawClaimResponse = MsgWithdrawClaimResponseJvmConverter.convert(
    		ClientCalls.unaryRpc(
    			option.channel, withdrawClaimDescriptor,
    			MsgWithdrawClaimJvmConverter.convert(request),
    			option.callOptions, metadata,
    		),
    	)

    public override suspend fun valsetUpdateClaim(request: MsgValsetUpdatedClaim):
        MsgValsetUpdatedClaimResponse = valsetUpdateClaim(request, Metadata())

    public suspend fun valsetUpdateClaim(request: MsgValsetUpdatedClaim, metadata: Metadata):
        MsgValsetUpdatedClaimResponse = MsgValsetUpdatedClaimResponseJvmConverter.convert(
    		ClientCalls.unaryRpc(
    			option.channel, valsetUpdateClaimDescriptor,
    			MsgValsetUpdatedClaimJvmConverter.convert(request),
    			option.callOptions, metadata,
    		),
    	)

    public override suspend fun eRC20DeployedClaim(request: MsgERC20DeployedClaim):
        MsgERC20DeployedClaimResponse = eRC20DeployedClaim(request, Metadata())

    public suspend fun eRC20DeployedClaim(request: MsgERC20DeployedClaim, metadata: Metadata):
        MsgERC20DeployedClaimResponse = MsgERC20DeployedClaimResponseJvmConverter.convert(
    		ClientCalls.unaryRpc(
    			option.channel, eRC20DeployedClaimDescriptor,
    			MsgERC20DeployedClaimJvmConverter.convert(request),
    			option.callOptions, metadata,
    		),
    	)

    public override suspend fun setOrchestratorAddresses(request: MsgSetOrchestratorAddresses):
        MsgSetOrchestratorAddressesResponse = setOrchestratorAddresses(request, Metadata())

    public suspend fun setOrchestratorAddresses(request: MsgSetOrchestratorAddresses,
        metadata: Metadata): MsgSetOrchestratorAddressesResponse =
        MsgSetOrchestratorAddressesResponseJvmConverter.convert(
    		ClientCalls.unaryRpc(
    			option.channel, setOrchestratorAddressesDescriptor,
    			MsgSetOrchestratorAddressesJvmConverter.convert(request),
    			option.callOptions, metadata,
    		),
    	)

    public override suspend fun cancelSendToEth(request: MsgCancelSendToEth):
        MsgCancelSendToEthResponse = cancelSendToEth(request, Metadata())

    public suspend fun cancelSendToEth(request: MsgCancelSendToEth, metadata: Metadata):
        MsgCancelSendToEthResponse = MsgCancelSendToEthResponseJvmConverter.convert(
    		ClientCalls.unaryRpc(
    			option.channel, cancelSendToEthDescriptor,
    			MsgCancelSendToEthJvmConverter.convert(request),
    			option.callOptions, metadata,
    		),
    	)

    public override suspend fun submitBadSignatureEvidence(request: MsgSubmitBadSignatureEvidence):
        MsgSubmitBadSignatureEvidenceResponse = submitBadSignatureEvidence(request, Metadata())

    public suspend fun submitBadSignatureEvidence(request: MsgSubmitBadSignatureEvidence,
        metadata: Metadata): MsgSubmitBadSignatureEvidenceResponse =
        MsgSubmitBadSignatureEvidenceResponseJvmConverter.convert(
    		ClientCalls.unaryRpc(
    			option.channel, submitBadSignatureEvidenceDescriptor,
    			MsgSubmitBadSignatureEvidenceJvmConverter.convert(request),
    			option.callOptions, metadata,
    		),
    	)

    public override suspend fun updateParams(request: MsgUpdateParams): MsgUpdateParamsResponse =
        updateParams(request, Metadata())

    public suspend fun updateParams(request: MsgUpdateParams, metadata: Metadata):
        MsgUpdateParamsResponse = MsgUpdateParamsResponseJvmConverter.convert(
    		ClientCalls.unaryRpc(
    			option.channel, updateParamsDescriptor,
    			MsgUpdateParamsJvmConverter.convert(request),
    			option.callOptions, metadata,
    		),
    	)
  }
}
