// Transform from injective/ocr/v1beta1/query.proto
@file:GeneratorVersion(version = "0.3.1")

package injective.ocr.v1beta1

import kotlin.coroutines.CoroutineContext
import kotlin.coroutines.EmptyCoroutineContext
import kr.jadekim.protobuf.`annotation`.GeneratorVersion
import kr.jadekim.protobuf.grpc.ClientOption
import kr.jadekim.protobuf.grpc.GrpcService

public expect object Query : GrpcService<Query.Interface, Query.Server, Query.Client> {
  public interface Interface {
    public suspend fun params(request: QueryParamsRequest): QueryParamsResponse

    public suspend fun feedConfig(request: QueryFeedConfigRequest): QueryFeedConfigResponse

    public suspend fun feedConfigInfo(request: QueryFeedConfigInfoRequest):
        QueryFeedConfigInfoResponse

    public suspend fun latestRound(request: QueryLatestRoundRequest): QueryLatestRoundResponse

    public suspend fun latestTransmissionDetails(request: QueryLatestTransmissionDetailsRequest):
        QueryLatestTransmissionDetailsResponse

    public suspend fun owedAmount(request: QueryOwedAmountRequest): QueryOwedAmountResponse

    public suspend fun ocrModuleState(request: QueryModuleStateRequest): QueryModuleStateResponse
  }

  public abstract class Server(
    coroutineContext: CoroutineContext = EmptyCoroutineContext,
  ) : Interface

  public open class Client(
    option: ClientOption,
  ) : Interface
}
