// Transform from injective/oracle/v1beta1/query.proto
@file:GeneratorVersion(version = "0.3.1")

package injective.oracle.v1beta1

import kotlin.coroutines.CoroutineContext
import kotlin.coroutines.EmptyCoroutineContext
import kr.jadekim.protobuf.`annotation`.GeneratorVersion
import kr.jadekim.protobuf.grpc.ClientOption
import kr.jadekim.protobuf.grpc.GrpcService

public expect object Query : GrpcService<Query.Interface, Query.Server, Query.Client> {
  public interface Interface {
    public suspend fun params(request: QueryParamsRequest): QueryParamsResponse

    public suspend fun bandRelayers(request: QueryBandRelayersRequest): QueryBandRelayersResponse

    public suspend fun bandPriceStates(request: QueryBandPriceStatesRequest):
        QueryBandPriceStatesResponse

    public suspend fun bandIBCPriceStates(request: QueryBandIBCPriceStatesRequest):
        QueryBandIBCPriceStatesResponse

    public suspend fun priceFeedPriceStates(request: QueryPriceFeedPriceStatesRequest):
        QueryPriceFeedPriceStatesResponse

    public suspend fun coinbasePriceStates(request: QueryCoinbasePriceStatesRequest):
        QueryCoinbasePriceStatesResponse

    public suspend fun pythPriceStates(request: QueryPythPriceStatesRequest):
        QueryPythPriceStatesResponse

    public suspend fun providerPriceState(request: QueryProviderPriceStateRequest):
        QueryProviderPriceStateResponse

    public suspend fun oracleModuleState(request: QueryModuleStateRequest): QueryModuleStateResponse

    public suspend fun historicalPriceRecords(request: QueryHistoricalPriceRecordsRequest):
        QueryHistoricalPriceRecordsResponse

    public suspend fun oracleVolatility(request: QueryOracleVolatilityRequest):
        QueryOracleVolatilityResponse

    public suspend fun oracleProvidersInfo(request: QueryOracleProvidersInfoRequest):
        QueryOracleProvidersInfoResponse

    public suspend fun oracleProviderPrices(request: QueryOracleProviderPricesRequest):
        QueryOracleProviderPricesResponse

    public suspend fun oraclePrice(request: QueryOraclePriceRequest): QueryOraclePriceResponse

    public suspend fun pythPrice(request: QueryPythPriceRequest): QueryPythPriceResponse
  }

  public abstract class Server(
    coroutineContext: CoroutineContext = EmptyCoroutineContext,
  ) : Interface

  public open class Client(
    option: ClientOption,
  ) : Interface
}
