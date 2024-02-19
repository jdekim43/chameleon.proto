// Transform from injective/oracle/v1beta1/query.proto
@file:GeneratorVersion(version = "0.3.1")

package injective.oracle.v1beta1

import kotlin.coroutines.CoroutineContext
import kr.jadekim.protobuf.`annotation`.GeneratorVersion
import kr.jadekim.protobuf.grpc.ClientOption
import kr.jadekim.protobuf.grpc.GrpcService

public actual object Query : GrpcService<Query.Interface, Query.Server, Query.Client> {
  public override fun createClient(option: ClientOption): Client = Client(option)

  public actual interface Interface {
    public actual suspend fun params(request: QueryParamsRequest): QueryParamsResponse

    public actual suspend fun bandRelayers(request: QueryBandRelayersRequest):
        QueryBandRelayersResponse

    public actual suspend fun bandPriceStates(request: QueryBandPriceStatesRequest):
        QueryBandPriceStatesResponse

    public actual suspend fun bandIBCPriceStates(request: QueryBandIBCPriceStatesRequest):
        QueryBandIBCPriceStatesResponse

    public actual suspend fun priceFeedPriceStates(request: QueryPriceFeedPriceStatesRequest):
        QueryPriceFeedPriceStatesResponse

    public actual suspend fun coinbasePriceStates(request: QueryCoinbasePriceStatesRequest):
        QueryCoinbasePriceStatesResponse

    public actual suspend fun pythPriceStates(request: QueryPythPriceStatesRequest):
        QueryPythPriceStatesResponse

    public actual suspend fun providerPriceState(request: QueryProviderPriceStateRequest):
        QueryProviderPriceStateResponse

    public actual suspend fun oracleModuleState(request: QueryModuleStateRequest):
        QueryModuleStateResponse

    public actual suspend fun historicalPriceRecords(request: QueryHistoricalPriceRecordsRequest):
        QueryHistoricalPriceRecordsResponse

    public actual suspend fun oracleVolatility(request: QueryOracleVolatilityRequest):
        QueryOracleVolatilityResponse

    public actual suspend fun oracleProvidersInfo(request: QueryOracleProvidersInfoRequest):
        QueryOracleProvidersInfoResponse

    public actual suspend fun oracleProviderPrices(request: QueryOracleProviderPricesRequest):
        QueryOracleProviderPricesResponse

    public actual suspend fun oraclePrice(request: QueryOraclePriceRequest):
        QueryOraclePriceResponse

    public actual suspend fun pythPrice(request: QueryPythPriceRequest): QueryPythPriceResponse
  }

  public actual abstract class Server actual constructor(
    coroutineContext: CoroutineContext,
  ) : QueryJvm.Server(coroutineContext), Interface

  public actual open class Client actual constructor(
    option: ClientOption,
  ) : QueryJvm.Client(option), Interface
}
