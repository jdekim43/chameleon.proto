// Transform from injective/ocr/v1beta1/tx.proto
@file:GeneratorVersion(version = "0.3.1")

package injective.ocr.v1beta1

import kotlin.coroutines.CoroutineContext
import kr.jadekim.protobuf.`annotation`.GeneratorVersion
import kr.jadekim.protobuf.grpc.ClientOption
import kr.jadekim.protobuf.grpc.GrpcService

public actual object Msg : GrpcService<Msg.Interface, Msg.Server, Msg.Client> {
  public override fun createClient(option: ClientOption): Client = Client(option)

  public actual interface Interface {
    public actual suspend fun createFeed(request: MsgCreateFeed): MsgCreateFeedResponse

    public actual suspend fun updateFeed(request: MsgUpdateFeed): MsgUpdateFeedResponse

    public actual suspend fun transmit(request: MsgTransmit): MsgTransmitResponse

    public actual suspend fun fundFeedRewardPool(request: MsgFundFeedRewardPool):
        MsgFundFeedRewardPoolResponse

    public actual suspend fun withdrawFeedRewardPool(request: MsgWithdrawFeedRewardPool):
        MsgWithdrawFeedRewardPoolResponse

    public actual suspend fun setPayees(request: MsgSetPayees): MsgSetPayeesResponse

    public actual suspend fun transferPayeeship(request: MsgTransferPayeeship):
        MsgTransferPayeeshipResponse

    public actual suspend fun acceptPayeeship(request: MsgAcceptPayeeship):
        MsgAcceptPayeeshipResponse

    public actual suspend fun updateParams(request: MsgUpdateParams): MsgUpdateParamsResponse
  }

  public actual abstract class Server actual constructor(
    coroutineContext: CoroutineContext,
  ) : MsgJvm.Server(coroutineContext), Interface

  public actual open class Client actual constructor(
    option: ClientOption,
  ) : MsgJvm.Client(option), Interface
}
