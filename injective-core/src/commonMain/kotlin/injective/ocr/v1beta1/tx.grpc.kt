// Transform from injective/ocr/v1beta1/tx.proto
@file:GeneratorVersion(version = "0.3.1")

package injective.ocr.v1beta1

import kotlin.coroutines.CoroutineContext
import kotlin.coroutines.EmptyCoroutineContext
import kr.jadekim.protobuf.`annotation`.GeneratorVersion
import kr.jadekim.protobuf.grpc.ClientOption
import kr.jadekim.protobuf.grpc.GrpcService

public expect object Msg : GrpcService<Msg.Interface, Msg.Server, Msg.Client> {
  public interface Interface {
    public suspend fun createFeed(request: MsgCreateFeed): MsgCreateFeedResponse

    public suspend fun updateFeed(request: MsgUpdateFeed): MsgUpdateFeedResponse

    public suspend fun transmit(request: MsgTransmit): MsgTransmitResponse

    public suspend fun fundFeedRewardPool(request: MsgFundFeedRewardPool):
        MsgFundFeedRewardPoolResponse

    public suspend fun withdrawFeedRewardPool(request: MsgWithdrawFeedRewardPool):
        MsgWithdrawFeedRewardPoolResponse

    public suspend fun setPayees(request: MsgSetPayees): MsgSetPayeesResponse

    public suspend fun transferPayeeship(request: MsgTransferPayeeship):
        MsgTransferPayeeshipResponse

    public suspend fun acceptPayeeship(request: MsgAcceptPayeeship): MsgAcceptPayeeshipResponse

    public suspend fun updateParams(request: MsgUpdateParams): MsgUpdateParamsResponse
  }

  public abstract class Server(
    coroutineContext: CoroutineContext = EmptyCoroutineContext,
  ) : Interface

  public open class Client(
    option: ClientOption,
  ) : Interface
}
