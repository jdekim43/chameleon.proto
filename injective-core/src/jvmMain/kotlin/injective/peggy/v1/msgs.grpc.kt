// Transform from injective/peggy/v1/msgs.proto
@file:GeneratorVersion(version = "0.3.1")

package injective.peggy.v1

import kotlin.coroutines.CoroutineContext
import kr.jadekim.protobuf.`annotation`.GeneratorVersion
import kr.jadekim.protobuf.grpc.ClientOption
import kr.jadekim.protobuf.grpc.GrpcService

public actual object Msg : GrpcService<Msg.Interface, Msg.Server, Msg.Client> {
  public override fun createClient(option: ClientOption): Client = Client(option)

  public actual interface Interface {
    public actual suspend fun valsetConfirm(request: MsgValsetConfirm): MsgValsetConfirmResponse

    public actual suspend fun sendToEth(request: MsgSendToEth): MsgSendToEthResponse

    public actual suspend fun requestBatch(request: MsgRequestBatch): MsgRequestBatchResponse

    public actual suspend fun confirmBatch(request: MsgConfirmBatch): MsgConfirmBatchResponse

    public actual suspend fun depositClaim(request: MsgDepositClaim): MsgDepositClaimResponse

    public actual suspend fun withdrawClaim(request: MsgWithdrawClaim): MsgWithdrawClaimResponse

    public actual suspend fun valsetUpdateClaim(request: MsgValsetUpdatedClaim):
        MsgValsetUpdatedClaimResponse

    public actual suspend fun eRC20DeployedClaim(request: MsgERC20DeployedClaim):
        MsgERC20DeployedClaimResponse

    public actual suspend fun setOrchestratorAddresses(request: MsgSetOrchestratorAddresses):
        MsgSetOrchestratorAddressesResponse

    public actual suspend fun cancelSendToEth(request: MsgCancelSendToEth):
        MsgCancelSendToEthResponse

    public actual suspend fun submitBadSignatureEvidence(request: MsgSubmitBadSignatureEvidence):
        MsgSubmitBadSignatureEvidenceResponse

    public actual suspend fun updateParams(request: MsgUpdateParams): MsgUpdateParamsResponse
  }

  public actual abstract class Server actual constructor(
    coroutineContext: CoroutineContext,
  ) : MsgJvm.Server(coroutineContext), Interface

  public actual open class Client actual constructor(
    option: ClientOption,
  ) : MsgJvm.Client(option), Interface
}
