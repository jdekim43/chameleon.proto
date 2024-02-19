// Transform from injective/wasmx/v1/query.proto
@file:GeneratorVersion(version = "0.3.1")

package injective.wasmx.v1

import kotlin.coroutines.CoroutineContext
import kotlin.coroutines.EmptyCoroutineContext
import kr.jadekim.protobuf.`annotation`.GeneratorVersion
import kr.jadekim.protobuf.grpc.ClientOption
import kr.jadekim.protobuf.grpc.GrpcService

public expect object Query : GrpcService<Query.Interface, Query.Server, Query.Client> {
  public interface Interface {
    public suspend fun wasmxParams(request: QueryWasmxParamsRequest): QueryWasmxParamsResponse

    public suspend fun contractRegistrationInfo(request: QueryContractRegistrationInfoRequest):
        QueryContractRegistrationInfoResponse

    public suspend fun wasmxModuleState(request: QueryModuleStateRequest): QueryModuleStateResponse
  }

  public abstract class Server(
    coroutineContext: CoroutineContext = EmptyCoroutineContext,
  ) : Interface

  public open class Client(
    option: ClientOption,
  ) : Interface
}
