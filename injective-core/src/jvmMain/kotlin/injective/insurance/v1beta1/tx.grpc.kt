// Transform from injective/insurance/v1beta1/tx.proto
@file:GeneratorVersion(version = "0.3.1")

package injective.insurance.v1beta1

import kotlin.coroutines.CoroutineContext
import kr.jadekim.protobuf.`annotation`.GeneratorVersion
import kr.jadekim.protobuf.grpc.ClientOption
import kr.jadekim.protobuf.grpc.GrpcService

public actual object Msg : GrpcService<Msg.Interface, Msg.Server, Msg.Client> {
  public override fun createClient(option: ClientOption): Client = Client(option)

  public actual interface Interface {
    public actual suspend fun createInsuranceFund(request: MsgCreateInsuranceFund):
        MsgCreateInsuranceFundResponse

    public actual suspend fun underwrite(request: MsgUnderwrite): MsgUnderwriteResponse

    public actual suspend fun requestRedemption(request: MsgRequestRedemption):
        MsgRequestRedemptionResponse

    public actual suspend fun updateParams(request: MsgUpdateParams): MsgUpdateParamsResponse
  }

  public actual abstract class Server actual constructor(
    coroutineContext: CoroutineContext,
  ) : MsgJvm.Server(coroutineContext), Interface

  public actual open class Client actual constructor(
    option: ClientOption,
  ) : MsgJvm.Client(option), Interface
}
