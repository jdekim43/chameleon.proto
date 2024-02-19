// Transform from injective/insurance/v1beta1/query.proto
@file:GeneratorVersion(version = "0.3.1")

package injective.insurance.v1beta1

import kotlin.coroutines.CoroutineContext
import kotlin.coroutines.EmptyCoroutineContext
import kr.jadekim.protobuf.`annotation`.GeneratorVersion
import kr.jadekim.protobuf.grpc.ClientOption
import kr.jadekim.protobuf.grpc.GrpcService

public expect object Query : GrpcService<Query.Interface, Query.Server, Query.Client> {
  public interface Interface {
    public suspend fun insuranceParams(request: QueryInsuranceParamsRequest):
        QueryInsuranceParamsResponse

    public suspend fun insuranceFund(request: QueryInsuranceFundRequest): QueryInsuranceFundResponse

    public suspend fun insuranceFunds(request: QueryInsuranceFundsRequest):
        QueryInsuranceFundsResponse

    public suspend fun estimatedRedemptions(request: QueryEstimatedRedemptionsRequest):
        QueryEstimatedRedemptionsResponse

    public suspend fun pendingRedemptions(request: QueryPendingRedemptionsRequest):
        QueryPendingRedemptionsResponse

    public suspend fun insuranceModuleState(request: QueryModuleStateRequest):
        QueryModuleStateResponse
  }

  public abstract class Server(
    coroutineContext: CoroutineContext = EmptyCoroutineContext,
  ) : Interface

  public open class Client(
    option: ClientOption,
  ) : Interface
}
