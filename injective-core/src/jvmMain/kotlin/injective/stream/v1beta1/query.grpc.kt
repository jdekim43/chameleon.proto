// Transform from injective/stream/v1beta1/query.proto
@file:GeneratorVersion(version = "0.3.1")

package injective.stream.v1beta1

import kotlin.coroutines.CoroutineContext
import kr.jadekim.protobuf.`annotation`.GeneratorVersion
import kr.jadekim.protobuf.grpc.ClientOption
import kr.jadekim.protobuf.grpc.GrpcService

public actual object Stream : GrpcService<Stream.Interface, Stream.Server, Stream.Client> {
  public override fun createClient(option: ClientOption): Client = Client(option)

  public actual interface Interface {
    public actual suspend fun stream(request: StreamRequest): StreamResponse
  }

  public actual abstract class Server actual constructor(
    coroutineContext: CoroutineContext,
  ) : StreamJvm.Server(coroutineContext), Interface

  public actual open class Client actual constructor(
    option: ClientOption,
  ) : StreamJvm.Client(option), Interface
}
