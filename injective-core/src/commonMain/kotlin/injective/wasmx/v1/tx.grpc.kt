// Transform from injective/wasmx/v1/tx.proto
@file:GeneratorVersion(version = "0.3.1")

package injective.wasmx.v1

import kotlin.coroutines.CoroutineContext
import kotlin.coroutines.EmptyCoroutineContext
import kr.jadekim.protobuf.`annotation`.GeneratorVersion
import kr.jadekim.protobuf.grpc.ClientOption
import kr.jadekim.protobuf.grpc.GrpcService

public expect object Msg : GrpcService<Msg.Interface, Msg.Server, Msg.Client> {
  public interface Interface {
    public suspend fun updateRegistryContractParams(request: MsgUpdateContract):
        MsgUpdateContractResponse

    public suspend fun activateRegistryContract(request: MsgActivateContract):
        MsgActivateContractResponse

    public suspend fun deactivateRegistryContract(request: MsgDeactivateContract):
        MsgDeactivateContractResponse

    public suspend fun executeContractCompat(request: MsgExecuteContractCompat):
        MsgExecuteContractCompatResponse

    public suspend fun updateParams(request: MsgUpdateParams): MsgUpdateParamsResponse

    public suspend fun registerContract(request: MsgRegisterContract): MsgRegisterContractResponse
  }

  public abstract class Server(
    coroutineContext: CoroutineContext = EmptyCoroutineContext,
  ) : Interface

  public open class Client(
    option: ClientOption,
  ) : Interface
}
