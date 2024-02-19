// Transform from injective/tokenfactory/v1beta1/query.proto
@file:GeneratorVersion(version = "0.3.1")

package injective.tokenfactory.v1beta1

import kotlin.coroutines.CoroutineContext
import kr.jadekim.protobuf.`annotation`.GeneratorVersion
import kr.jadekim.protobuf.grpc.ClientOption
import kr.jadekim.protobuf.grpc.GrpcService

public actual object Query : GrpcService<Query.Interface, Query.Server, Query.Client> {
  public override fun createClient(option: ClientOption): Client = Client(option)

  public actual interface Interface {
    public actual suspend fun params(request: QueryParamsRequest): QueryParamsResponse

    public actual suspend fun denomAuthorityMetadata(request: QueryDenomAuthorityMetadataRequest):
        QueryDenomAuthorityMetadataResponse

    public actual suspend fun denomsFromCreator(request: QueryDenomsFromCreatorRequest):
        QueryDenomsFromCreatorResponse

    public actual suspend fun tokenfactoryModuleState(request: QueryModuleStateRequest):
        QueryModuleStateResponse
  }

  public actual abstract class Server actual constructor(
    coroutineContext: CoroutineContext,
  ) : QueryJvm.Server(coroutineContext), Interface

  public actual open class Client actual constructor(
    option: ClientOption,
  ) : QueryJvm.Client(option), Interface
}
