// Transform from injective/peggy/v1/query.proto
@file:GeneratorVersion(version = "0.3.1")

package injective.peggy.v1

import kotlin.coroutines.CoroutineContext
import kr.jadekim.protobuf.`annotation`.GeneratorVersion
import kr.jadekim.protobuf.grpc.ClientOption
import kr.jadekim.protobuf.grpc.GrpcService

public actual object Query : GrpcService<Query.Interface, Query.Server, Query.Client> {
  public override fun createClient(option: ClientOption): Client = Client(option)

  public actual interface Interface {
    public actual suspend fun params(request: QueryParamsRequest): QueryParamsResponse

    public actual suspend fun currentValset(request: QueryCurrentValsetRequest):
        QueryCurrentValsetResponse

    public actual suspend fun valsetRequest(request: QueryValsetRequestRequest):
        QueryValsetRequestResponse

    public actual suspend fun valsetConfirm(request: QueryValsetConfirmRequest):
        QueryValsetConfirmResponse

    public actual suspend fun valsetConfirmsByNonce(request: QueryValsetConfirmsByNonceRequest):
        QueryValsetConfirmsByNonceResponse

    public actual suspend fun lastValsetRequests(request: QueryLastValsetRequestsRequest):
        QueryLastValsetRequestsResponse

    public actual suspend
        fun lastPendingValsetRequestByAddr(request: QueryLastPendingValsetRequestByAddrRequest):
        QueryLastPendingValsetRequestByAddrResponse

    public actual suspend fun lastEventByAddr(request: QueryLastEventByAddrRequest):
        QueryLastEventByAddrResponse

    public actual suspend fun getPendingSendToEth(request: QueryPendingSendToEth):
        QueryPendingSendToEthResponse

    public actual suspend fun batchFees(request: QueryBatchFeeRequest): QueryBatchFeeResponse

    public actual suspend fun outgoingTxBatches(request: QueryOutgoingTxBatchesRequest):
        QueryOutgoingTxBatchesResponse

    public actual suspend
        fun lastPendingBatchRequestByAddr(request: QueryLastPendingBatchRequestByAddrRequest):
        QueryLastPendingBatchRequestByAddrResponse

    public actual suspend fun batchRequestByNonce(request: QueryBatchRequestByNonceRequest):
        QueryBatchRequestByNonceResponse

    public actual suspend fun batchConfirms(request: QueryBatchConfirmsRequest):
        QueryBatchConfirmsResponse

    public actual suspend fun eRC20ToDenom(request: QueryERC20ToDenomRequest):
        QueryERC20ToDenomResponse

    public actual suspend fun denomToERC20(request: QueryDenomToERC20Request):
        QueryDenomToERC20Response

    public actual suspend
        fun getDelegateKeyByValidator(request: QueryDelegateKeysByValidatorAddress):
        QueryDelegateKeysByValidatorAddressResponse

    public actual suspend fun getDelegateKeyByEth(request: QueryDelegateKeysByEthAddress):
        QueryDelegateKeysByEthAddressResponse

    public actual suspend
        fun getDelegateKeyByOrchestrator(request: QueryDelegateKeysByOrchestratorAddress):
        QueryDelegateKeysByOrchestratorAddressResponse

    public actual suspend fun peggyModuleState(request: QueryModuleStateRequest):
        QueryModuleStateResponse

    public actual suspend fun missingPeggoNonces(request: MissingNoncesRequest):
        MissingNoncesResponse
  }

  public actual abstract class Server actual constructor(
    coroutineContext: CoroutineContext,
  ) : QueryJvm.Server(coroutineContext), Interface

  public actual open class Client actual constructor(
    option: ClientOption,
  ) : QueryJvm.Client(option), Interface
}
