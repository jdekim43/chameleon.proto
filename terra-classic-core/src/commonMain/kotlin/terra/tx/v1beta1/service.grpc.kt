// Transform from terra/tx/v1beta1/service.proto
@file:GeneratorVersion(version = "0.3.1")

package terra.tx.v1beta1

import kotlin.coroutines.CoroutineContext
import kotlin.coroutines.EmptyCoroutineContext
import kr.jadekim.protobuf.`annotation`.GeneratorVersion
import kr.jadekim.protobuf.grpc.ClientOption
import kr.jadekim.protobuf.grpc.GrpcService

public expect object Service : GrpcService<Service.Interface, Service.Server, Service.Client> {
  public interface Interface {
    public suspend fun computeTax(request: ComputeTaxRequest): ComputeTaxResponse
  }

  public abstract class Server(
    coroutineContext: CoroutineContext = EmptyCoroutineContext,
  ) : Interface

  public open class Client(
    option: ClientOption,
  ) : Interface
}
