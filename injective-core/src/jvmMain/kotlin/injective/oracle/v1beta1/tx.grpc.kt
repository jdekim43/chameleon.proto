// Transform from injective/oracle/v1beta1/tx.proto
@file:GeneratorVersion(version = "0.3.1")

package injective.oracle.v1beta1

import kotlin.coroutines.CoroutineContext
import kr.jadekim.protobuf.`annotation`.GeneratorVersion
import kr.jadekim.protobuf.grpc.ClientOption
import kr.jadekim.protobuf.grpc.GrpcService

public actual object Msg : GrpcService<Msg.Interface, Msg.Server, Msg.Client> {
  public override fun createClient(option: ClientOption): Client = Client(option)

  public actual interface Interface {
    public actual suspend fun relayProviderPrices(request: MsgRelayProviderPrices):
        MsgRelayProviderPricesResponse

    public actual suspend fun relayPriceFeedPrice(request: MsgRelayPriceFeedPrice):
        MsgRelayPriceFeedPriceResponse

    public actual suspend fun relayBandRates(request: MsgRelayBandRates): MsgRelayBandRatesResponse

    public actual suspend fun requestBandIBCRates(request: MsgRequestBandIBCRates):
        MsgRequestBandIBCRatesResponse

    public actual suspend fun relayCoinbaseMessages(request: MsgRelayCoinbaseMessages):
        MsgRelayCoinbaseMessagesResponse

    public actual suspend fun relayPythPrices(request: MsgRelayPythPrices):
        MsgRelayPythPricesResponse

    public actual suspend fun updateParams(request: MsgUpdateParams): MsgUpdateParamsResponse
  }

  public actual abstract class Server actual constructor(
    coroutineContext: CoroutineContext,
  ) : MsgJvm.Server(coroutineContext), Interface

  public actual open class Client actual constructor(
    option: ClientOption,
  ) : MsgJvm.Client(option), Interface
}
