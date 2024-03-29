// Transform from alliance/tx.proto
@file:GeneratorVersion(version = "0.3.1")

package alliance

import kotlin.coroutines.CoroutineContext
import kr.jadekim.protobuf.`annotation`.GeneratorVersion
import kr.jadekim.protobuf.grpc.ClientOption
import kr.jadekim.protobuf.grpc.GrpcService

public actual object Msg : GrpcService<Msg.Interface, Msg.Server, Msg.Client> {
  public override fun createClient(option: ClientOption): Client = Client(option)

  public actual interface Interface {
    public actual suspend fun `delegate`(request: MsgDelegate): MsgDelegateResponse

    public actual suspend fun redelegate(request: MsgRedelegate): MsgRedelegateResponse

    public actual suspend fun undelegate(request: MsgUndelegate): MsgUndelegateResponse

    public actual suspend fun claimDelegationRewards(request: MsgClaimDelegationRewards):
        MsgClaimDelegationRewardsResponse
  }

  public actual abstract class Server actual constructor(
    coroutineContext: CoroutineContext,
  ) : MsgJvm.Server(coroutineContext), Interface

  public actual open class Client actual constructor(
    option: ClientOption,
  ) : MsgJvm.Client(option), Interface
}
