// Transform from epoch/tx.proto
@file:GeneratorVersion(version = "0.3.1")

package seiprotocol.seichain.epoch

import kotlin.coroutines.CoroutineContext
import kr.jadekim.protobuf.`annotation`.GeneratorVersion
import kr.jadekim.protobuf.grpc.ClientOption
import kr.jadekim.protobuf.grpc.GrpcService

public actual object Msg : GrpcService<Msg.Interface, Msg.Server, Msg.Client> {
  public override fun createClient(option: ClientOption): Client = Client(option)

  public actual interface Interface

  public actual abstract class Server actual constructor(
    coroutineContext: CoroutineContext,
  ) : MsgJvm.Server(coroutineContext), Interface

  public actual open class Client actual constructor(
    option: ClientOption,
  ) : MsgJvm.Client(option), Interface
}
