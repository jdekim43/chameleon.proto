// Transform from injective/auction/v1beta1/query.proto
@file:GeneratorVersion(version = "0.3.1")

package injective.auction.v1beta1

import kotlin.coroutines.CoroutineContext
import kotlin.coroutines.EmptyCoroutineContext
import kr.jadekim.protobuf.`annotation`.GeneratorVersion
import kr.jadekim.protobuf.grpc.ClientOption
import kr.jadekim.protobuf.grpc.GrpcService

public expect object Query : GrpcService<Query.Interface, Query.Server, Query.Client> {
  public interface Interface {
    public suspend fun auctionParams(request: QueryAuctionParamsRequest): QueryAuctionParamsResponse

    public suspend fun currentAuctionBasket(request: QueryCurrentAuctionBasketRequest):
        QueryCurrentAuctionBasketResponse

    public suspend fun auctionModuleState(request: QueryModuleStateRequest):
        QueryModuleStateResponse
  }

  public abstract class Server(
    coroutineContext: CoroutineContext = EmptyCoroutineContext,
  ) : Interface

  public open class Client(
    option: ClientOption,
  ) : Interface
}
