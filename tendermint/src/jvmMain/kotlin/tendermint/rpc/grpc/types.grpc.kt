// Transform from tendermint/rpc/grpc/types.proto
@file:GeneratorVersion(version = "0.3.1")

package tendermint.rpc.grpc

import kotlin.coroutines.CoroutineContext
import kr.jadekim.protobuf.`annotation`.GeneratorVersion
import kr.jadekim.protobuf.grpc.ClientOption
import kr.jadekim.protobuf.grpc.GrpcService

public actual object BroadcastAPI :
    GrpcService<BroadcastAPI.Interface, BroadcastAPI.Server, BroadcastAPI.Client> {
  public override fun createClient(option: ClientOption): Client = Client(option)

  public actual interface Interface {
    public actual suspend fun ping(request: RequestPing): ResponsePing

    public actual suspend fun broadcastTx(request: RequestBroadcastTx): ResponseBroadcastTx
  }

  public actual abstract class Server actual constructor(
    coroutineContext: CoroutineContext,
  ) : BroadcastAPIJvm.Server(coroutineContext), Interface

  public actual open class Client actual constructor(
    option: ClientOption,
  ) : BroadcastAPIJvm.Client(option), Interface
}
