// Transform from injective/peggy/v1/query.proto
@file:ProtobufSyntax(syntax = "PROTO3")
@file:GeneratorVersion(version = "0.3.1")

package injective.peggy.v1

import io.grpc.CallOptions
import io.grpc.Channel
import io.grpc.Metadata
import io.grpc.MethodDescriptor
import io.grpc.ServerServiceDefinition
import io.grpc.ServiceDescriptor
import io.grpc.Status
import io.grpc.StatusException
import io.grpc.kotlin.AbstractCoroutineServerImpl
import io.grpc.kotlin.AbstractCoroutineStub
import io.grpc.kotlin.ClientCalls
import io.grpc.kotlin.ServerCalls
import kotlin.coroutines.CoroutineContext
import kotlin.coroutines.EmptyCoroutineContext
import kr.jadekim.protobuf.`annotation`.GeneratorVersion
import kr.jadekim.protobuf.`annotation`.ProtobufSyntax
import kr.jadekim.protobuf.grpc.ClientOption

public object QueryJvm {
  private val descriptor: ServiceDescriptor = QueryGrpc.getServiceDescriptor()!!

  private val paramsDescriptor:
      MethodDescriptor<QueryOuterClass.QueryParamsRequest, QueryOuterClass.QueryParamsResponse> =
      QueryGrpc.getParamsMethod()!!

  private val currentValsetDescriptor:
      MethodDescriptor<QueryOuterClass.QueryCurrentValsetRequest, QueryOuterClass.QueryCurrentValsetResponse>
      = QueryGrpc.getCurrentValsetMethod()!!

  private val valsetRequestDescriptor:
      MethodDescriptor<QueryOuterClass.QueryValsetRequestRequest, QueryOuterClass.QueryValsetRequestResponse>
      = QueryGrpc.getValsetRequestMethod()!!

  private val valsetConfirmDescriptor:
      MethodDescriptor<QueryOuterClass.QueryValsetConfirmRequest, QueryOuterClass.QueryValsetConfirmResponse>
      = QueryGrpc.getValsetConfirmMethod()!!

  private val valsetConfirmsByNonceDescriptor:
      MethodDescriptor<QueryOuterClass.QueryValsetConfirmsByNonceRequest, QueryOuterClass.QueryValsetConfirmsByNonceResponse>
      = QueryGrpc.getValsetConfirmsByNonceMethod()!!

  private val lastValsetRequestsDescriptor:
      MethodDescriptor<QueryOuterClass.QueryLastValsetRequestsRequest, QueryOuterClass.QueryLastValsetRequestsResponse>
      = QueryGrpc.getLastValsetRequestsMethod()!!

  private val lastPendingValsetRequestByAddrDescriptor:
      MethodDescriptor<QueryOuterClass.QueryLastPendingValsetRequestByAddrRequest, QueryOuterClass.QueryLastPendingValsetRequestByAddrResponse>
      = QueryGrpc.getLastPendingValsetRequestByAddrMethod()!!

  private val lastEventByAddrDescriptor:
      MethodDescriptor<QueryOuterClass.QueryLastEventByAddrRequest, QueryOuterClass.QueryLastEventByAddrResponse>
      = QueryGrpc.getLastEventByAddrMethod()!!

  private val getPendingSendToEthDescriptor:
      MethodDescriptor<QueryOuterClass.QueryPendingSendToEth, QueryOuterClass.QueryPendingSendToEthResponse>
      = QueryGrpc.getGetPendingSendToEthMethod()!!

  private val batchFeesDescriptor:
      MethodDescriptor<QueryOuterClass.QueryBatchFeeRequest, QueryOuterClass.QueryBatchFeeResponse>
      = QueryGrpc.getBatchFeesMethod()!!

  private val outgoingTxBatchesDescriptor:
      MethodDescriptor<QueryOuterClass.QueryOutgoingTxBatchesRequest, QueryOuterClass.QueryOutgoingTxBatchesResponse>
      = QueryGrpc.getOutgoingTxBatchesMethod()!!

  private val lastPendingBatchRequestByAddrDescriptor:
      MethodDescriptor<QueryOuterClass.QueryLastPendingBatchRequestByAddrRequest, QueryOuterClass.QueryLastPendingBatchRequestByAddrResponse>
      = QueryGrpc.getLastPendingBatchRequestByAddrMethod()!!

  private val batchRequestByNonceDescriptor:
      MethodDescriptor<QueryOuterClass.QueryBatchRequestByNonceRequest, QueryOuterClass.QueryBatchRequestByNonceResponse>
      = QueryGrpc.getBatchRequestByNonceMethod()!!

  private val batchConfirmsDescriptor:
      MethodDescriptor<QueryOuterClass.QueryBatchConfirmsRequest, QueryOuterClass.QueryBatchConfirmsResponse>
      = QueryGrpc.getBatchConfirmsMethod()!!

  private val eRC20ToDenomDescriptor:
      MethodDescriptor<QueryOuterClass.QueryERC20ToDenomRequest, QueryOuterClass.QueryERC20ToDenomResponse>
      = QueryGrpc.getERC20ToDenomMethod()!!

  private val denomToERC20Descriptor:
      MethodDescriptor<QueryOuterClass.QueryDenomToERC20Request, QueryOuterClass.QueryDenomToERC20Response>
      = QueryGrpc.getDenomToERC20Method()!!

  private val getDelegateKeyByValidatorDescriptor:
      MethodDescriptor<QueryOuterClass.QueryDelegateKeysByValidatorAddress, QueryOuterClass.QueryDelegateKeysByValidatorAddressResponse>
      = QueryGrpc.getGetDelegateKeyByValidatorMethod()!!

  private val getDelegateKeyByEthDescriptor:
      MethodDescriptor<QueryOuterClass.QueryDelegateKeysByEthAddress, QueryOuterClass.QueryDelegateKeysByEthAddressResponse>
      = QueryGrpc.getGetDelegateKeyByEthMethod()!!

  private val getDelegateKeyByOrchestratorDescriptor:
      MethodDescriptor<QueryOuterClass.QueryDelegateKeysByOrchestratorAddress, QueryOuterClass.QueryDelegateKeysByOrchestratorAddressResponse>
      = QueryGrpc.getGetDelegateKeyByOrchestratorMethod()!!

  private val peggyModuleStateDescriptor:
      MethodDescriptor<QueryOuterClass.QueryModuleStateRequest, QueryOuterClass.QueryModuleStateResponse>
      = QueryGrpc.getPeggyModuleStateMethod()!!

  private val missingPeggoNoncesDescriptor:
      MethodDescriptor<QueryOuterClass.MissingNoncesRequest, QueryOuterClass.MissingNoncesResponse>
      = QueryGrpc.getMissingPeggoNoncesMethod()!!

  public abstract class Server(
    coroutineContext: CoroutineContext = EmptyCoroutineContext,
  ) : AbstractCoroutineServerImpl(context = coroutineContext), Query.Interface {
    public open override suspend fun params(request: QueryParamsRequest): QueryParamsResponse =
        throw
        StatusException(Status.UNIMPLEMENTED.withDescription("Method injective.peggy.v1.Query.Params is unimplemented"))

    public open override suspend fun currentValset(request: QueryCurrentValsetRequest):
        QueryCurrentValsetResponse = throw
        StatusException(Status.UNIMPLEMENTED.withDescription("Method injective.peggy.v1.Query.CurrentValset is unimplemented"))

    public open override suspend fun valsetRequest(request: QueryValsetRequestRequest):
        QueryValsetRequestResponse = throw
        StatusException(Status.UNIMPLEMENTED.withDescription("Method injective.peggy.v1.Query.ValsetRequest is unimplemented"))

    public open override suspend fun valsetConfirm(request: QueryValsetConfirmRequest):
        QueryValsetConfirmResponse = throw
        StatusException(Status.UNIMPLEMENTED.withDescription("Method injective.peggy.v1.Query.ValsetConfirm is unimplemented"))

    public open override suspend
        fun valsetConfirmsByNonce(request: QueryValsetConfirmsByNonceRequest):
        QueryValsetConfirmsByNonceResponse = throw
        StatusException(Status.UNIMPLEMENTED.withDescription("Method injective.peggy.v1.Query.ValsetConfirmsByNonce is unimplemented"))

    public open override suspend fun lastValsetRequests(request: QueryLastValsetRequestsRequest):
        QueryLastValsetRequestsResponse = throw
        StatusException(Status.UNIMPLEMENTED.withDescription("Method injective.peggy.v1.Query.LastValsetRequests is unimplemented"))

    public open override suspend
        fun lastPendingValsetRequestByAddr(request: QueryLastPendingValsetRequestByAddrRequest):
        QueryLastPendingValsetRequestByAddrResponse = throw
        StatusException(Status.UNIMPLEMENTED.withDescription("Method injective.peggy.v1.Query.LastPendingValsetRequestByAddr is unimplemented"))

    public open override suspend fun lastEventByAddr(request: QueryLastEventByAddrRequest):
        QueryLastEventByAddrResponse = throw
        StatusException(Status.UNIMPLEMENTED.withDescription("Method injective.peggy.v1.Query.LastEventByAddr is unimplemented"))

    public open override suspend fun getPendingSendToEth(request: QueryPendingSendToEth):
        QueryPendingSendToEthResponse = throw
        StatusException(Status.UNIMPLEMENTED.withDescription("Method injective.peggy.v1.Query.GetPendingSendToEth is unimplemented"))

    public open override suspend fun batchFees(request: QueryBatchFeeRequest): QueryBatchFeeResponse
        = throw
        StatusException(Status.UNIMPLEMENTED.withDescription("Method injective.peggy.v1.Query.BatchFees is unimplemented"))

    public open override suspend fun outgoingTxBatches(request: QueryOutgoingTxBatchesRequest):
        QueryOutgoingTxBatchesResponse = throw
        StatusException(Status.UNIMPLEMENTED.withDescription("Method injective.peggy.v1.Query.OutgoingTxBatches is unimplemented"))

    public open override suspend
        fun lastPendingBatchRequestByAddr(request: QueryLastPendingBatchRequestByAddrRequest):
        QueryLastPendingBatchRequestByAddrResponse = throw
        StatusException(Status.UNIMPLEMENTED.withDescription("Method injective.peggy.v1.Query.LastPendingBatchRequestByAddr is unimplemented"))

    public open override suspend fun batchRequestByNonce(request: QueryBatchRequestByNonceRequest):
        QueryBatchRequestByNonceResponse = throw
        StatusException(Status.UNIMPLEMENTED.withDescription("Method injective.peggy.v1.Query.BatchRequestByNonce is unimplemented"))

    public open override suspend fun batchConfirms(request: QueryBatchConfirmsRequest):
        QueryBatchConfirmsResponse = throw
        StatusException(Status.UNIMPLEMENTED.withDescription("Method injective.peggy.v1.Query.BatchConfirms is unimplemented"))

    public open override suspend fun eRC20ToDenom(request: QueryERC20ToDenomRequest):
        QueryERC20ToDenomResponse = throw
        StatusException(Status.UNIMPLEMENTED.withDescription("Method injective.peggy.v1.Query.ERC20ToDenom is unimplemented"))

    public open override suspend fun denomToERC20(request: QueryDenomToERC20Request):
        QueryDenomToERC20Response = throw
        StatusException(Status.UNIMPLEMENTED.withDescription("Method injective.peggy.v1.Query.DenomToERC20 is unimplemented"))

    public open override suspend
        fun getDelegateKeyByValidator(request: QueryDelegateKeysByValidatorAddress):
        QueryDelegateKeysByValidatorAddressResponse = throw
        StatusException(Status.UNIMPLEMENTED.withDescription("Method injective.peggy.v1.Query.GetDelegateKeyByValidator is unimplemented"))

    public open override suspend fun getDelegateKeyByEth(request: QueryDelegateKeysByEthAddress):
        QueryDelegateKeysByEthAddressResponse = throw
        StatusException(Status.UNIMPLEMENTED.withDescription("Method injective.peggy.v1.Query.GetDelegateKeyByEth is unimplemented"))

    public open override suspend
        fun getDelegateKeyByOrchestrator(request: QueryDelegateKeysByOrchestratorAddress):
        QueryDelegateKeysByOrchestratorAddressResponse = throw
        StatusException(Status.UNIMPLEMENTED.withDescription("Method injective.peggy.v1.Query.GetDelegateKeyByOrchestrator is unimplemented"))

    public open override suspend fun peggyModuleState(request: QueryModuleStateRequest):
        QueryModuleStateResponse = throw
        StatusException(Status.UNIMPLEMENTED.withDescription("Method injective.peggy.v1.Query.PeggyModuleState is unimplemented"))

    public open override suspend fun missingPeggoNonces(request: MissingNoncesRequest):
        MissingNoncesResponse = throw
        StatusException(Status.UNIMPLEMENTED.withDescription("Method injective.peggy.v1.Query.MissingPeggoNonces is unimplemented"))

    public override fun bindService(): ServerServiceDefinition =
        ServerServiceDefinition.builder(descriptor)
    		.addMethod(
    			ServerCalls.unaryServerMethodDefinition(
    				context = this.context,
    				descriptor = paramsDescriptor,
    				implementation = {
        QueryParamsResponseJvmConverter.convert(params(QueryParamsRequestJvmConverter.convert(it)))
        },
    			)
    		)
    		.addMethod(
    			ServerCalls.unaryServerMethodDefinition(
    				context = this.context,
    				descriptor = currentValsetDescriptor,
    				implementation = {
        QueryCurrentValsetResponseJvmConverter.convert(currentValset(QueryCurrentValsetRequestJvmConverter.convert(it)))
        },
    			)
    		)
    		.addMethod(
    			ServerCalls.unaryServerMethodDefinition(
    				context = this.context,
    				descriptor = valsetRequestDescriptor,
    				implementation = {
        QueryValsetRequestResponseJvmConverter.convert(valsetRequest(QueryValsetRequestRequestJvmConverter.convert(it)))
        },
    			)
    		)
    		.addMethod(
    			ServerCalls.unaryServerMethodDefinition(
    				context = this.context,
    				descriptor = valsetConfirmDescriptor,
    				implementation = {
        QueryValsetConfirmResponseJvmConverter.convert(valsetConfirm(QueryValsetConfirmRequestJvmConverter.convert(it)))
        },
    			)
    		)
    		.addMethod(
    			ServerCalls.unaryServerMethodDefinition(
    				context = this.context,
    				descriptor = valsetConfirmsByNonceDescriptor,
    				implementation = {
        QueryValsetConfirmsByNonceResponseJvmConverter.convert(valsetConfirmsByNonce(QueryValsetConfirmsByNonceRequestJvmConverter.convert(it)))
        },
    			)
    		)
    		.addMethod(
    			ServerCalls.unaryServerMethodDefinition(
    				context = this.context,
    				descriptor = lastValsetRequestsDescriptor,
    				implementation = {
        QueryLastValsetRequestsResponseJvmConverter.convert(lastValsetRequests(QueryLastValsetRequestsRequestJvmConverter.convert(it)))
        },
    			)
    		)
    		.addMethod(
    			ServerCalls.unaryServerMethodDefinition(
    				context = this.context,
    				descriptor = lastPendingValsetRequestByAddrDescriptor,
    				implementation = {
        QueryLastPendingValsetRequestByAddrResponseJvmConverter.convert(lastPendingValsetRequestByAddr(QueryLastPendingValsetRequestByAddrRequestJvmConverter.convert(it)))
        },
    			)
    		)
    		.addMethod(
    			ServerCalls.unaryServerMethodDefinition(
    				context = this.context,
    				descriptor = lastEventByAddrDescriptor,
    				implementation = {
        QueryLastEventByAddrResponseJvmConverter.convert(lastEventByAddr(QueryLastEventByAddrRequestJvmConverter.convert(it)))
        },
    			)
    		)
    		.addMethod(
    			ServerCalls.unaryServerMethodDefinition(
    				context = this.context,
    				descriptor = getPendingSendToEthDescriptor,
    				implementation = {
        QueryPendingSendToEthResponseJvmConverter.convert(getPendingSendToEth(QueryPendingSendToEthJvmConverter.convert(it)))
        },
    			)
    		)
    		.addMethod(
    			ServerCalls.unaryServerMethodDefinition(
    				context = this.context,
    				descriptor = batchFeesDescriptor,
    				implementation = {
        QueryBatchFeeResponseJvmConverter.convert(batchFees(QueryBatchFeeRequestJvmConverter.convert(it)))
        },
    			)
    		)
    		.addMethod(
    			ServerCalls.unaryServerMethodDefinition(
    				context = this.context,
    				descriptor = outgoingTxBatchesDescriptor,
    				implementation = {
        QueryOutgoingTxBatchesResponseJvmConverter.convert(outgoingTxBatches(QueryOutgoingTxBatchesRequestJvmConverter.convert(it)))
        },
    			)
    		)
    		.addMethod(
    			ServerCalls.unaryServerMethodDefinition(
    				context = this.context,
    				descriptor = lastPendingBatchRequestByAddrDescriptor,
    				implementation = {
        QueryLastPendingBatchRequestByAddrResponseJvmConverter.convert(lastPendingBatchRequestByAddr(QueryLastPendingBatchRequestByAddrRequestJvmConverter.convert(it)))
        },
    			)
    		)
    		.addMethod(
    			ServerCalls.unaryServerMethodDefinition(
    				context = this.context,
    				descriptor = batchRequestByNonceDescriptor,
    				implementation = {
        QueryBatchRequestByNonceResponseJvmConverter.convert(batchRequestByNonce(QueryBatchRequestByNonceRequestJvmConverter.convert(it)))
        },
    			)
    		)
    		.addMethod(
    			ServerCalls.unaryServerMethodDefinition(
    				context = this.context,
    				descriptor = batchConfirmsDescriptor,
    				implementation = {
        QueryBatchConfirmsResponseJvmConverter.convert(batchConfirms(QueryBatchConfirmsRequestJvmConverter.convert(it)))
        },
    			)
    		)
    		.addMethod(
    			ServerCalls.unaryServerMethodDefinition(
    				context = this.context,
    				descriptor = eRC20ToDenomDescriptor,
    				implementation = {
        QueryERC20ToDenomResponseJvmConverter.convert(eRC20ToDenom(QueryERC20ToDenomRequestJvmConverter.convert(it)))
        },
    			)
    		)
    		.addMethod(
    			ServerCalls.unaryServerMethodDefinition(
    				context = this.context,
    				descriptor = denomToERC20Descriptor,
    				implementation = {
        QueryDenomToERC20ResponseJvmConverter.convert(denomToERC20(QueryDenomToERC20RequestJvmConverter.convert(it)))
        },
    			)
    		)
    		.addMethod(
    			ServerCalls.unaryServerMethodDefinition(
    				context = this.context,
    				descriptor = getDelegateKeyByValidatorDescriptor,
    				implementation = {
        QueryDelegateKeysByValidatorAddressResponseJvmConverter.convert(getDelegateKeyByValidator(QueryDelegateKeysByValidatorAddressJvmConverter.convert(it)))
        },
    			)
    		)
    		.addMethod(
    			ServerCalls.unaryServerMethodDefinition(
    				context = this.context,
    				descriptor = getDelegateKeyByEthDescriptor,
    				implementation = {
        QueryDelegateKeysByEthAddressResponseJvmConverter.convert(getDelegateKeyByEth(QueryDelegateKeysByEthAddressJvmConverter.convert(it)))
        },
    			)
    		)
    		.addMethod(
    			ServerCalls.unaryServerMethodDefinition(
    				context = this.context,
    				descriptor = getDelegateKeyByOrchestratorDescriptor,
    				implementation = {
        QueryDelegateKeysByOrchestratorAddressResponseJvmConverter.convert(getDelegateKeyByOrchestrator(QueryDelegateKeysByOrchestratorAddressJvmConverter.convert(it)))
        },
    			)
    		)
    		.addMethod(
    			ServerCalls.unaryServerMethodDefinition(
    				context = this.context,
    				descriptor = peggyModuleStateDescriptor,
    				implementation = {
        QueryModuleStateResponseJvmConverter.convert(peggyModuleState(QueryModuleStateRequestJvmConverter.convert(it)))
        },
    			)
    		)
    		.addMethod(
    			ServerCalls.unaryServerMethodDefinition(
    				context = this.context,
    				descriptor = missingPeggoNoncesDescriptor,
    				implementation = {
        MissingNoncesResponseJvmConverter.convert(missingPeggoNonces(MissingNoncesRequestJvmConverter.convert(it)))
        },
    			)
    		)
    		.build()
  }

  public open class Client(
    private val option: ClientOption,
  ) : AbstractCoroutineStub<Query.Client>(channel = option.channel, callOptions =
      option.callOptions), Query.Interface {
    public override fun build(channel: Channel, callOptions: CallOptions): Query.Client =
        Query.Client(ClientOption(channel, callOptions))

    public override suspend fun params(request: QueryParamsRequest): QueryParamsResponse =
        params(request, Metadata())

    public suspend fun params(request: QueryParamsRequest, metadata: Metadata): QueryParamsResponse
        = QueryParamsResponseJvmConverter.convert(
    		ClientCalls.unaryRpc(
    			option.channel, paramsDescriptor,
    			QueryParamsRequestJvmConverter.convert(request),
    			option.callOptions, metadata,
    		),
    	)

    public override suspend fun currentValset(request: QueryCurrentValsetRequest):
        QueryCurrentValsetResponse = currentValset(request, Metadata())

    public suspend fun currentValset(request: QueryCurrentValsetRequest, metadata: Metadata):
        QueryCurrentValsetResponse = QueryCurrentValsetResponseJvmConverter.convert(
    		ClientCalls.unaryRpc(
    			option.channel, currentValsetDescriptor,
    			QueryCurrentValsetRequestJvmConverter.convert(request),
    			option.callOptions, metadata,
    		),
    	)

    public override suspend fun valsetRequest(request: QueryValsetRequestRequest):
        QueryValsetRequestResponse = valsetRequest(request, Metadata())

    public suspend fun valsetRequest(request: QueryValsetRequestRequest, metadata: Metadata):
        QueryValsetRequestResponse = QueryValsetRequestResponseJvmConverter.convert(
    		ClientCalls.unaryRpc(
    			option.channel, valsetRequestDescriptor,
    			QueryValsetRequestRequestJvmConverter.convert(request),
    			option.callOptions, metadata,
    		),
    	)

    public override suspend fun valsetConfirm(request: QueryValsetConfirmRequest):
        QueryValsetConfirmResponse = valsetConfirm(request, Metadata())

    public suspend fun valsetConfirm(request: QueryValsetConfirmRequest, metadata: Metadata):
        QueryValsetConfirmResponse = QueryValsetConfirmResponseJvmConverter.convert(
    		ClientCalls.unaryRpc(
    			option.channel, valsetConfirmDescriptor,
    			QueryValsetConfirmRequestJvmConverter.convert(request),
    			option.callOptions, metadata,
    		),
    	)

    public override suspend fun valsetConfirmsByNonce(request: QueryValsetConfirmsByNonceRequest):
        QueryValsetConfirmsByNonceResponse = valsetConfirmsByNonce(request, Metadata())

    public suspend fun valsetConfirmsByNonce(request: QueryValsetConfirmsByNonceRequest,
        metadata: Metadata): QueryValsetConfirmsByNonceResponse =
        QueryValsetConfirmsByNonceResponseJvmConverter.convert(
    		ClientCalls.unaryRpc(
    			option.channel, valsetConfirmsByNonceDescriptor,
    			QueryValsetConfirmsByNonceRequestJvmConverter.convert(request),
    			option.callOptions, metadata,
    		),
    	)

    public override suspend fun lastValsetRequests(request: QueryLastValsetRequestsRequest):
        QueryLastValsetRequestsResponse = lastValsetRequests(request, Metadata())

    public suspend fun lastValsetRequests(request: QueryLastValsetRequestsRequest,
        metadata: Metadata): QueryLastValsetRequestsResponse =
        QueryLastValsetRequestsResponseJvmConverter.convert(
    		ClientCalls.unaryRpc(
    			option.channel, lastValsetRequestsDescriptor,
    			QueryLastValsetRequestsRequestJvmConverter.convert(request),
    			option.callOptions, metadata,
    		),
    	)

    public override suspend
        fun lastPendingValsetRequestByAddr(request: QueryLastPendingValsetRequestByAddrRequest):
        QueryLastPendingValsetRequestByAddrResponse = lastPendingValsetRequestByAddr(request,
        Metadata())

    public suspend
        fun lastPendingValsetRequestByAddr(request: QueryLastPendingValsetRequestByAddrRequest,
        metadata: Metadata): QueryLastPendingValsetRequestByAddrResponse =
        QueryLastPendingValsetRequestByAddrResponseJvmConverter.convert(
    		ClientCalls.unaryRpc(
    			option.channel, lastPendingValsetRequestByAddrDescriptor,
    			QueryLastPendingValsetRequestByAddrRequestJvmConverter.convert(request),
    			option.callOptions, metadata,
    		),
    	)

    public override suspend fun lastEventByAddr(request: QueryLastEventByAddrRequest):
        QueryLastEventByAddrResponse = lastEventByAddr(request, Metadata())

    public suspend fun lastEventByAddr(request: QueryLastEventByAddrRequest, metadata: Metadata):
        QueryLastEventByAddrResponse = QueryLastEventByAddrResponseJvmConverter.convert(
    		ClientCalls.unaryRpc(
    			option.channel, lastEventByAddrDescriptor,
    			QueryLastEventByAddrRequestJvmConverter.convert(request),
    			option.callOptions, metadata,
    		),
    	)

    public override suspend fun getPendingSendToEth(request: QueryPendingSendToEth):
        QueryPendingSendToEthResponse = getPendingSendToEth(request, Metadata())

    public suspend fun getPendingSendToEth(request: QueryPendingSendToEth, metadata: Metadata):
        QueryPendingSendToEthResponse = QueryPendingSendToEthResponseJvmConverter.convert(
    		ClientCalls.unaryRpc(
    			option.channel, getPendingSendToEthDescriptor,
    			QueryPendingSendToEthJvmConverter.convert(request),
    			option.callOptions, metadata,
    		),
    	)

    public override suspend fun batchFees(request: QueryBatchFeeRequest): QueryBatchFeeResponse =
        batchFees(request, Metadata())

    public suspend fun batchFees(request: QueryBatchFeeRequest, metadata: Metadata):
        QueryBatchFeeResponse = QueryBatchFeeResponseJvmConverter.convert(
    		ClientCalls.unaryRpc(
    			option.channel, batchFeesDescriptor,
    			QueryBatchFeeRequestJvmConverter.convert(request),
    			option.callOptions, metadata,
    		),
    	)

    public override suspend fun outgoingTxBatches(request: QueryOutgoingTxBatchesRequest):
        QueryOutgoingTxBatchesResponse = outgoingTxBatches(request, Metadata())

    public suspend fun outgoingTxBatches(request: QueryOutgoingTxBatchesRequest,
        metadata: Metadata): QueryOutgoingTxBatchesResponse =
        QueryOutgoingTxBatchesResponseJvmConverter.convert(
    		ClientCalls.unaryRpc(
    			option.channel, outgoingTxBatchesDescriptor,
    			QueryOutgoingTxBatchesRequestJvmConverter.convert(request),
    			option.callOptions, metadata,
    		),
    	)

    public override suspend
        fun lastPendingBatchRequestByAddr(request: QueryLastPendingBatchRequestByAddrRequest):
        QueryLastPendingBatchRequestByAddrResponse = lastPendingBatchRequestByAddr(request,
        Metadata())

    public suspend
        fun lastPendingBatchRequestByAddr(request: QueryLastPendingBatchRequestByAddrRequest,
        metadata: Metadata): QueryLastPendingBatchRequestByAddrResponse =
        QueryLastPendingBatchRequestByAddrResponseJvmConverter.convert(
    		ClientCalls.unaryRpc(
    			option.channel, lastPendingBatchRequestByAddrDescriptor,
    			QueryLastPendingBatchRequestByAddrRequestJvmConverter.convert(request),
    			option.callOptions, metadata,
    		),
    	)

    public override suspend fun batchRequestByNonce(request: QueryBatchRequestByNonceRequest):
        QueryBatchRequestByNonceResponse = batchRequestByNonce(request, Metadata())

    public suspend fun batchRequestByNonce(request: QueryBatchRequestByNonceRequest,
        metadata: Metadata): QueryBatchRequestByNonceResponse =
        QueryBatchRequestByNonceResponseJvmConverter.convert(
    		ClientCalls.unaryRpc(
    			option.channel, batchRequestByNonceDescriptor,
    			QueryBatchRequestByNonceRequestJvmConverter.convert(request),
    			option.callOptions, metadata,
    		),
    	)

    public override suspend fun batchConfirms(request: QueryBatchConfirmsRequest):
        QueryBatchConfirmsResponse = batchConfirms(request, Metadata())

    public suspend fun batchConfirms(request: QueryBatchConfirmsRequest, metadata: Metadata):
        QueryBatchConfirmsResponse = QueryBatchConfirmsResponseJvmConverter.convert(
    		ClientCalls.unaryRpc(
    			option.channel, batchConfirmsDescriptor,
    			QueryBatchConfirmsRequestJvmConverter.convert(request),
    			option.callOptions, metadata,
    		),
    	)

    public override suspend fun eRC20ToDenom(request: QueryERC20ToDenomRequest):
        QueryERC20ToDenomResponse = eRC20ToDenom(request, Metadata())

    public suspend fun eRC20ToDenom(request: QueryERC20ToDenomRequest, metadata: Metadata):
        QueryERC20ToDenomResponse = QueryERC20ToDenomResponseJvmConverter.convert(
    		ClientCalls.unaryRpc(
    			option.channel, eRC20ToDenomDescriptor,
    			QueryERC20ToDenomRequestJvmConverter.convert(request),
    			option.callOptions, metadata,
    		),
    	)

    public override suspend fun denomToERC20(request: QueryDenomToERC20Request):
        QueryDenomToERC20Response = denomToERC20(request, Metadata())

    public suspend fun denomToERC20(request: QueryDenomToERC20Request, metadata: Metadata):
        QueryDenomToERC20Response = QueryDenomToERC20ResponseJvmConverter.convert(
    		ClientCalls.unaryRpc(
    			option.channel, denomToERC20Descriptor,
    			QueryDenomToERC20RequestJvmConverter.convert(request),
    			option.callOptions, metadata,
    		),
    	)

    public override suspend
        fun getDelegateKeyByValidator(request: QueryDelegateKeysByValidatorAddress):
        QueryDelegateKeysByValidatorAddressResponse = getDelegateKeyByValidator(request, Metadata())

    public suspend fun getDelegateKeyByValidator(request: QueryDelegateKeysByValidatorAddress,
        metadata: Metadata): QueryDelegateKeysByValidatorAddressResponse =
        QueryDelegateKeysByValidatorAddressResponseJvmConverter.convert(
    		ClientCalls.unaryRpc(
    			option.channel, getDelegateKeyByValidatorDescriptor,
    			QueryDelegateKeysByValidatorAddressJvmConverter.convert(request),
    			option.callOptions, metadata,
    		),
    	)

    public override suspend fun getDelegateKeyByEth(request: QueryDelegateKeysByEthAddress):
        QueryDelegateKeysByEthAddressResponse = getDelegateKeyByEth(request, Metadata())

    public suspend fun getDelegateKeyByEth(request: QueryDelegateKeysByEthAddress,
        metadata: Metadata): QueryDelegateKeysByEthAddressResponse =
        QueryDelegateKeysByEthAddressResponseJvmConverter.convert(
    		ClientCalls.unaryRpc(
    			option.channel, getDelegateKeyByEthDescriptor,
    			QueryDelegateKeysByEthAddressJvmConverter.convert(request),
    			option.callOptions, metadata,
    		),
    	)

    public override suspend
        fun getDelegateKeyByOrchestrator(request: QueryDelegateKeysByOrchestratorAddress):
        QueryDelegateKeysByOrchestratorAddressResponse = getDelegateKeyByOrchestrator(request,
        Metadata())

    public suspend fun getDelegateKeyByOrchestrator(request: QueryDelegateKeysByOrchestratorAddress,
        metadata: Metadata): QueryDelegateKeysByOrchestratorAddressResponse =
        QueryDelegateKeysByOrchestratorAddressResponseJvmConverter.convert(
    		ClientCalls.unaryRpc(
    			option.channel, getDelegateKeyByOrchestratorDescriptor,
    			QueryDelegateKeysByOrchestratorAddressJvmConverter.convert(request),
    			option.callOptions, metadata,
    		),
    	)

    public override suspend fun peggyModuleState(request: QueryModuleStateRequest):
        QueryModuleStateResponse = peggyModuleState(request, Metadata())

    public suspend fun peggyModuleState(request: QueryModuleStateRequest, metadata: Metadata):
        QueryModuleStateResponse = QueryModuleStateResponseJvmConverter.convert(
    		ClientCalls.unaryRpc(
    			option.channel, peggyModuleStateDescriptor,
    			QueryModuleStateRequestJvmConverter.convert(request),
    			option.callOptions, metadata,
    		),
    	)

    public override suspend fun missingPeggoNonces(request: MissingNoncesRequest):
        MissingNoncesResponse = missingPeggoNonces(request, Metadata())

    public suspend fun missingPeggoNonces(request: MissingNoncesRequest, metadata: Metadata):
        MissingNoncesResponse = MissingNoncesResponseJvmConverter.convert(
    		ClientCalls.unaryRpc(
    			option.channel, missingPeggoNoncesDescriptor,
    			MissingNoncesRequestJvmConverter.convert(request),
    			option.callOptions, metadata,
    		),
    	)
  }
}
