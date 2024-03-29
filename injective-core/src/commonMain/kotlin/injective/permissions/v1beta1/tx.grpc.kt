// Transform from injective/permissions/v1beta1/tx.proto
@file:GeneratorVersion(version = "0.3.1")

package injective.permissions.v1beta1

import kotlin.coroutines.CoroutineContext
import kotlin.coroutines.EmptyCoroutineContext
import kr.jadekim.protobuf.`annotation`.GeneratorVersion
import kr.jadekim.protobuf.grpc.ClientOption
import kr.jadekim.protobuf.grpc.GrpcService

public expect object Msg : GrpcService<Msg.Interface, Msg.Server, Msg.Client> {
  public interface Interface {
    public suspend fun updateParams(request: MsgUpdateParams): MsgUpdateParamsResponse

    public suspend fun createNamespace(request: MsgCreateNamespace): MsgCreateNamespaceResponse

    public suspend fun deleteNamespace(request: MsgDeleteNamespace): MsgDeleteNamespaceResponse

    public suspend fun updateNamespace(request: MsgUpdateNamespace): MsgUpdateNamespaceResponse

    public suspend fun updateNamespaceRoles(request: MsgUpdateNamespaceRoles):
        MsgUpdateNamespaceRolesResponse

    public suspend fun revokeNamespaceRoles(request: MsgRevokeNamespaceRoles):
        MsgRevokeNamespaceRolesResponse

    public suspend fun claimVoucher(request: MsgClaimVoucher): MsgClaimVoucherResponse
  }

  public abstract class Server(
    coroutineContext: CoroutineContext = EmptyCoroutineContext,
  ) : Interface

  public open class Client(
    option: ClientOption,
  ) : Interface
}
