// Transform from tendermint/rpc/grpc/types.proto
@file:GeneratorVersion(version = "0.3.1")

package tendermint.rpc.grpc

import kotlin.coroutines.CoroutineContext
import kotlin.coroutines.EmptyCoroutineContext
import kr.jadekim.protobuf.`annotation`.GeneratorVersion
import kr.jadekim.protobuf.grpc.ClientOption
import kr.jadekim.protobuf.grpc.GrpcService

public expect object BroadcastAPI :
    GrpcService<BroadcastAPI.Interface, BroadcastAPI.Server, BroadcastAPI.Client> {
  public interface Interface {
    public suspend fun ping(request: RequestPing): ResponsePing

    public suspend fun broadcastTx(request: RequestBroadcastTx): ResponseBroadcastTx
  }

  public abstract class Server(
    coroutineContext: CoroutineContext = EmptyCoroutineContext,
  ) : Interface

  public open class Client(
    option: ClientOption,
  ) : Interface
}
