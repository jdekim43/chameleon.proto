// Transform from injective/peggy/v1/msgs.proto
@file:GeneratorVersion(version = "0.3.1")

package injective.peggy.v1

import kotlin.coroutines.CoroutineContext
import kotlin.coroutines.EmptyCoroutineContext
import kr.jadekim.protobuf.`annotation`.GeneratorVersion
import kr.jadekim.protobuf.grpc.ClientOption
import kr.jadekim.protobuf.grpc.GrpcService

public expect object Msg : GrpcService<Msg.Interface, Msg.Server, Msg.Client> {
  public interface Interface {
    public suspend fun valsetConfirm(request: MsgValsetConfirm): MsgValsetConfirmResponse

    public suspend fun sendToEth(request: MsgSendToEth): MsgSendToEthResponse

    public suspend fun requestBatch(request: MsgRequestBatch): MsgRequestBatchResponse

    public suspend fun confirmBatch(request: MsgConfirmBatch): MsgConfirmBatchResponse

    public suspend fun depositClaim(request: MsgDepositClaim): MsgDepositClaimResponse

    public suspend fun withdrawClaim(request: MsgWithdrawClaim): MsgWithdrawClaimResponse

    public suspend fun valsetUpdateClaim(request: MsgValsetUpdatedClaim):
        MsgValsetUpdatedClaimResponse

    public suspend fun eRC20DeployedClaim(request: MsgERC20DeployedClaim):
        MsgERC20DeployedClaimResponse

    public suspend fun setOrchestratorAddresses(request: MsgSetOrchestratorAddresses):
        MsgSetOrchestratorAddressesResponse

    public suspend fun cancelSendToEth(request: MsgCancelSendToEth): MsgCancelSendToEthResponse

    public suspend fun submitBadSignatureEvidence(request: MsgSubmitBadSignatureEvidence):
        MsgSubmitBadSignatureEvidenceResponse

    public suspend fun updateParams(request: MsgUpdateParams): MsgUpdateParamsResponse
  }

  public abstract class Server(
    coroutineContext: CoroutineContext = EmptyCoroutineContext,
  ) : Interface

  public open class Client(
    option: ClientOption,
  ) : Interface
}
