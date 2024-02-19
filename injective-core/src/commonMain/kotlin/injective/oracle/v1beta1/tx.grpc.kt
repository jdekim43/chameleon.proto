// Transform from injective/oracle/v1beta1/tx.proto
@file:GeneratorVersion(version = "0.3.1")

package injective.oracle.v1beta1

import kotlin.coroutines.CoroutineContext
import kotlin.coroutines.EmptyCoroutineContext
import kr.jadekim.protobuf.`annotation`.GeneratorVersion
import kr.jadekim.protobuf.grpc.ClientOption
import kr.jadekim.protobuf.grpc.GrpcService

public expect object Msg : GrpcService<Msg.Interface, Msg.Server, Msg.Client> {
  public interface Interface {
    public suspend fun relayProviderPrices(request: MsgRelayProviderPrices):
        MsgRelayProviderPricesResponse

    public suspend fun relayPriceFeedPrice(request: MsgRelayPriceFeedPrice):
        MsgRelayPriceFeedPriceResponse

    public suspend fun relayBandRates(request: MsgRelayBandRates): MsgRelayBandRatesResponse

    public suspend fun requestBandIBCRates(request: MsgRequestBandIBCRates):
        MsgRequestBandIBCRatesResponse

    public suspend fun relayCoinbaseMessages(request: MsgRelayCoinbaseMessages):
        MsgRelayCoinbaseMessagesResponse

    public suspend fun relayPythPrices(request: MsgRelayPythPrices): MsgRelayPythPricesResponse

    public suspend fun updateParams(request: MsgUpdateParams): MsgUpdateParamsResponse
  }

  public abstract class Server(
    coroutineContext: CoroutineContext = EmptyCoroutineContext,
  ) : Interface

  public open class Client(
    option: ClientOption,
  ) : Interface
}
