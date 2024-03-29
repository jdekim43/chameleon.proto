// Transform from injective/wasmx/v1/tx.proto
@file:GeneratorVersion(version = "0.3.1")

package injective.wasmx.v1

import kotlin.coroutines.CoroutineContext
import kr.jadekim.protobuf.`annotation`.GeneratorVersion
import kr.jadekim.protobuf.grpc.ClientOption
import kr.jadekim.protobuf.grpc.GrpcService

public actual object Msg : GrpcService<Msg.Interface, Msg.Server, Msg.Client> {
  public override fun createClient(option: ClientOption): Client = Client(option)

  public actual interface Interface {
    public actual suspend fun updateRegistryContractParams(request: MsgUpdateContract):
        MsgUpdateContractResponse

    public actual suspend fun activateRegistryContract(request: MsgActivateContract):
        MsgActivateContractResponse

    public actual suspend fun deactivateRegistryContract(request: MsgDeactivateContract):
        MsgDeactivateContractResponse

    public actual suspend fun executeContractCompat(request: MsgExecuteContractCompat):
        MsgExecuteContractCompatResponse

    public actual suspend fun updateParams(request: MsgUpdateParams): MsgUpdateParamsResponse

    public actual suspend fun registerContract(request: MsgRegisterContract):
        MsgRegisterContractResponse
  }

  public actual abstract class Server actual constructor(
    coroutineContext: CoroutineContext,
  ) : MsgJvm.Server(coroutineContext), Interface

  public actual open class Client actual constructor(
    option: ClientOption,
  ) : MsgJvm.Client(option), Interface
}
