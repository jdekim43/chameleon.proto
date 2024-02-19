// Transform from injective/stream/v1beta1/query.proto
@file:GeneratorVersion(version = "0.3.1")

package injective.stream.v1beta1

import kotlin.coroutines.CoroutineContext
import kotlin.coroutines.EmptyCoroutineContext
import kr.jadekim.protobuf.`annotation`.GeneratorVersion
import kr.jadekim.protobuf.grpc.ClientOption
import kr.jadekim.protobuf.grpc.GrpcService

public expect object Stream : GrpcService<Stream.Interface, Stream.Server, Stream.Client> {
  public interface Interface {
    public suspend fun stream(request: StreamRequest): StreamResponse
  }

  public abstract class Server(
    coroutineContext: CoroutineContext = EmptyCoroutineContext,
  ) : Interface

  public open class Client(
    option: ClientOption,
  ) : Interface
}
