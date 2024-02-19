// Transform from injective/peggy/v1/query.proto
@file:GeneratorVersion(version = "0.3.1")

package injective.peggy.v1

import kotlin.coroutines.CoroutineContext
import kotlin.coroutines.EmptyCoroutineContext
import kr.jadekim.protobuf.`annotation`.GeneratorVersion
import kr.jadekim.protobuf.grpc.ClientOption
import kr.jadekim.protobuf.grpc.GrpcService

public expect object Query : GrpcService<Query.Interface, Query.Server, Query.Client> {
  public interface Interface {
    public suspend fun params(request: QueryParamsRequest): QueryParamsResponse

    public suspend fun currentValset(request: QueryCurrentValsetRequest): QueryCurrentValsetResponse

    public suspend fun valsetRequest(request: QueryValsetRequestRequest): QueryValsetRequestResponse

    public suspend fun valsetConfirm(request: QueryValsetConfirmRequest): QueryValsetConfirmResponse

    public suspend fun valsetConfirmsByNonce(request: QueryValsetConfirmsByNonceRequest):
        QueryValsetConfirmsByNonceResponse

    public suspend fun lastValsetRequests(request: QueryLastValsetRequestsRequest):
        QueryLastValsetRequestsResponse

    public suspend
        fun lastPendingValsetRequestByAddr(request: QueryLastPendingValsetRequestByAddrRequest):
        QueryLastPendingValsetRequestByAddrResponse

    public suspend fun lastEventByAddr(request: QueryLastEventByAddrRequest):
        QueryLastEventByAddrResponse

    public suspend fun getPendingSendToEth(request: QueryPendingSendToEth):
        QueryPendingSendToEthResponse

    public suspend fun batchFees(request: QueryBatchFeeRequest): QueryBatchFeeResponse

    public suspend fun outgoingTxBatches(request: QueryOutgoingTxBatchesRequest):
        QueryOutgoingTxBatchesResponse

    public suspend
        fun lastPendingBatchRequestByAddr(request: QueryLastPendingBatchRequestByAddrRequest):
        QueryLastPendingBatchRequestByAddrResponse

    public suspend fun batchRequestByNonce(request: QueryBatchRequestByNonceRequest):
        QueryBatchRequestByNonceResponse

    public suspend fun batchConfirms(request: QueryBatchConfirmsRequest): QueryBatchConfirmsResponse

    public suspend fun eRC20ToDenom(request: QueryERC20ToDenomRequest): QueryERC20ToDenomResponse

    public suspend fun denomToERC20(request: QueryDenomToERC20Request): QueryDenomToERC20Response

    public suspend fun getDelegateKeyByValidator(request: QueryDelegateKeysByValidatorAddress):
        QueryDelegateKeysByValidatorAddressResponse

    public suspend fun getDelegateKeyByEth(request: QueryDelegateKeysByEthAddress):
        QueryDelegateKeysByEthAddressResponse

    public suspend
        fun getDelegateKeyByOrchestrator(request: QueryDelegateKeysByOrchestratorAddress):
        QueryDelegateKeysByOrchestratorAddressResponse

    public suspend fun peggyModuleState(request: QueryModuleStateRequest): QueryModuleStateResponse

    public suspend fun missingPeggoNonces(request: MissingNoncesRequest): MissingNoncesResponse
  }

  public abstract class Server(
    coroutineContext: CoroutineContext = EmptyCoroutineContext,
  ) : Interface

  public open class Client(
    option: ClientOption,
  ) : Interface
}
