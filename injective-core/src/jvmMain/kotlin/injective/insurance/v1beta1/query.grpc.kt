// Transform from injective/insurance/v1beta1/query.proto
@file:GeneratorVersion(version = "0.3.1")

package injective.insurance.v1beta1

import kotlin.coroutines.CoroutineContext
import kr.jadekim.protobuf.`annotation`.GeneratorVersion
import kr.jadekim.protobuf.grpc.ClientOption
import kr.jadekim.protobuf.grpc.GrpcService

public actual object Query : GrpcService<Query.Interface, Query.Server, Query.Client> {
  public override fun createClient(option: ClientOption): Client = Client(option)

  public actual interface Interface {
    public actual suspend fun insuranceParams(request: QueryInsuranceParamsRequest):
        QueryInsuranceParamsResponse

    public actual suspend fun insuranceFund(request: QueryInsuranceFundRequest):
        QueryInsuranceFundResponse

    public actual suspend fun insuranceFunds(request: QueryInsuranceFundsRequest):
        QueryInsuranceFundsResponse

    public actual suspend fun estimatedRedemptions(request: QueryEstimatedRedemptionsRequest):
        QueryEstimatedRedemptionsResponse

    public actual suspend fun pendingRedemptions(request: QueryPendingRedemptionsRequest):
        QueryPendingRedemptionsResponse

    public actual suspend fun insuranceModuleState(request: QueryModuleStateRequest):
        QueryModuleStateResponse
  }

  public actual abstract class Server actual constructor(
    coroutineContext: CoroutineContext,
  ) : QueryJvm.Server(coroutineContext), Interface

  public actual open class Client actual constructor(
    option: ClientOption,
  ) : QueryJvm.Client(option), Interface
}
