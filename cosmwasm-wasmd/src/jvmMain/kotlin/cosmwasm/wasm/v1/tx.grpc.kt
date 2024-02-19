// Transform from cosmwasm/wasm/v1/tx.proto
@file:GeneratorVersion(version = "0.3.1")

package cosmwasm.wasm.v1

import kotlin.coroutines.CoroutineContext
import kr.jadekim.protobuf.`annotation`.GeneratorVersion
import kr.jadekim.protobuf.grpc.ClientOption
import kr.jadekim.protobuf.grpc.GrpcService

public actual object Msg : GrpcService<Msg.Interface, Msg.Server, Msg.Client> {
  public override fun createClient(option: ClientOption): Client = Client(option)

  public actual interface Interface {
    public actual suspend fun storeCode(request: MsgStoreCode): MsgStoreCodeResponse

    public actual suspend fun instantiateContract(request: MsgInstantiateContract):
        MsgInstantiateContractResponse

    public actual suspend fun instantiateContract2(request: MsgInstantiateContract2):
        MsgInstantiateContract2Response

    public actual suspend fun executeContract(request: MsgExecuteContract):
        MsgExecuteContractResponse

    public actual suspend fun migrateContract(request: MsgMigrateContract):
        MsgMigrateContractResponse

    public actual suspend fun updateAdmin(request: MsgUpdateAdmin): MsgUpdateAdminResponse

    public actual suspend fun clearAdmin(request: MsgClearAdmin): MsgClearAdminResponse

    public actual suspend fun updateInstantiateConfig(request: MsgUpdateInstantiateConfig):
        MsgUpdateInstantiateConfigResponse

    public actual suspend fun updateParams(request: MsgUpdateParams): MsgUpdateParamsResponse

    public actual suspend fun sudoContract(request: MsgSudoContract): MsgSudoContractResponse

    public actual suspend fun pinCodes(request: MsgPinCodes): MsgPinCodesResponse

    public actual suspend fun unpinCodes(request: MsgUnpinCodes): MsgUnpinCodesResponse

    public actual suspend fun storeAndInstantiateContract(request: MsgStoreAndInstantiateContract):
        MsgStoreAndInstantiateContractResponse

    public actual suspend
        fun removeCodeUploadParamsAddresses(request: MsgRemoveCodeUploadParamsAddresses):
        MsgRemoveCodeUploadParamsAddressesResponse

    public actual suspend
        fun addCodeUploadParamsAddresses(request: MsgAddCodeUploadParamsAddresses):
        MsgAddCodeUploadParamsAddressesResponse

    public actual suspend fun storeAndMigrateContract(request: MsgStoreAndMigrateContract):
        MsgStoreAndMigrateContractResponse

    public actual suspend fun updateContractLabel(request: MsgUpdateContractLabel):
        MsgUpdateContractLabelResponse
  }

  public actual abstract class Server actual constructor(
    coroutineContext: CoroutineContext,
  ) : MsgJvm.Server(coroutineContext), Interface

  public actual open class Client actual constructor(
    option: ClientOption,
  ) : MsgJvm.Client(option), Interface
}
