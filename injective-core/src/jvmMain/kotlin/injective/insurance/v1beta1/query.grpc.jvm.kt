// Transform from injective/insurance/v1beta1/query.proto
@file:ProtobufSyntax(syntax = "PROTO3")
@file:GeneratorVersion(version = "0.3.1")

package injective.insurance.v1beta1

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

  private val insuranceParamsDescriptor:
      MethodDescriptor<QueryOuterClass.QueryInsuranceParamsRequest, QueryOuterClass.QueryInsuranceParamsResponse>
      = QueryGrpc.getInsuranceParamsMethod()!!

  private val insuranceFundDescriptor:
      MethodDescriptor<QueryOuterClass.QueryInsuranceFundRequest, QueryOuterClass.QueryInsuranceFundResponse>
      = QueryGrpc.getInsuranceFundMethod()!!

  private val insuranceFundsDescriptor:
      MethodDescriptor<QueryOuterClass.QueryInsuranceFundsRequest, QueryOuterClass.QueryInsuranceFundsResponse>
      = QueryGrpc.getInsuranceFundsMethod()!!

  private val estimatedRedemptionsDescriptor:
      MethodDescriptor<QueryOuterClass.QueryEstimatedRedemptionsRequest, QueryOuterClass.QueryEstimatedRedemptionsResponse>
      = QueryGrpc.getEstimatedRedemptionsMethod()!!

  private val pendingRedemptionsDescriptor:
      MethodDescriptor<QueryOuterClass.QueryPendingRedemptionsRequest, QueryOuterClass.QueryPendingRedemptionsResponse>
      = QueryGrpc.getPendingRedemptionsMethod()!!

  private val insuranceModuleStateDescriptor:
      MethodDescriptor<QueryOuterClass.QueryModuleStateRequest, QueryOuterClass.QueryModuleStateResponse>
      = QueryGrpc.getInsuranceModuleStateMethod()!!

  public abstract class Server(
    coroutineContext: CoroutineContext = EmptyCoroutineContext,
  ) : AbstractCoroutineServerImpl(context = coroutineContext), Query.Interface {
    public open override suspend fun insuranceParams(request: QueryInsuranceParamsRequest):
        QueryInsuranceParamsResponse = throw
        StatusException(Status.UNIMPLEMENTED.withDescription("Method injective.insurance.v1beta1.Query.InsuranceParams is unimplemented"))

    public open override suspend fun insuranceFund(request: QueryInsuranceFundRequest):
        QueryInsuranceFundResponse = throw
        StatusException(Status.UNIMPLEMENTED.withDescription("Method injective.insurance.v1beta1.Query.InsuranceFund is unimplemented"))

    public open override suspend fun insuranceFunds(request: QueryInsuranceFundsRequest):
        QueryInsuranceFundsResponse = throw
        StatusException(Status.UNIMPLEMENTED.withDescription("Method injective.insurance.v1beta1.Query.InsuranceFunds is unimplemented"))

    public open override suspend
        fun estimatedRedemptions(request: QueryEstimatedRedemptionsRequest):
        QueryEstimatedRedemptionsResponse = throw
        StatusException(Status.UNIMPLEMENTED.withDescription("Method injective.insurance.v1beta1.Query.EstimatedRedemptions is unimplemented"))

    public open override suspend fun pendingRedemptions(request: QueryPendingRedemptionsRequest):
        QueryPendingRedemptionsResponse = throw
        StatusException(Status.UNIMPLEMENTED.withDescription("Method injective.insurance.v1beta1.Query.PendingRedemptions is unimplemented"))

    public open override suspend fun insuranceModuleState(request: QueryModuleStateRequest):
        QueryModuleStateResponse = throw
        StatusException(Status.UNIMPLEMENTED.withDescription("Method injective.insurance.v1beta1.Query.InsuranceModuleState is unimplemented"))

    public override fun bindService(): ServerServiceDefinition =
        ServerServiceDefinition.builder(descriptor)
    		.addMethod(
    			ServerCalls.unaryServerMethodDefinition(
    				context = this.context,
    				descriptor = insuranceParamsDescriptor,
    				implementation = {
        QueryInsuranceParamsResponseJvmConverter.convert(insuranceParams(QueryInsuranceParamsRequestJvmConverter.convert(it)))
        },
    			)
    		)
    		.addMethod(
    			ServerCalls.unaryServerMethodDefinition(
    				context = this.context,
    				descriptor = insuranceFundDescriptor,
    				implementation = {
        QueryInsuranceFundResponseJvmConverter.convert(insuranceFund(QueryInsuranceFundRequestJvmConverter.convert(it)))
        },
    			)
    		)
    		.addMethod(
    			ServerCalls.unaryServerMethodDefinition(
    				context = this.context,
    				descriptor = insuranceFundsDescriptor,
    				implementation = {
        QueryInsuranceFundsResponseJvmConverter.convert(insuranceFunds(QueryInsuranceFundsRequestJvmConverter.convert(it)))
        },
    			)
    		)
    		.addMethod(
    			ServerCalls.unaryServerMethodDefinition(
    				context = this.context,
    				descriptor = estimatedRedemptionsDescriptor,
    				implementation = {
        QueryEstimatedRedemptionsResponseJvmConverter.convert(estimatedRedemptions(QueryEstimatedRedemptionsRequestJvmConverter.convert(it)))
        },
    			)
    		)
    		.addMethod(
    			ServerCalls.unaryServerMethodDefinition(
    				context = this.context,
    				descriptor = pendingRedemptionsDescriptor,
    				implementation = {
        QueryPendingRedemptionsResponseJvmConverter.convert(pendingRedemptions(QueryPendingRedemptionsRequestJvmConverter.convert(it)))
        },
    			)
    		)
    		.addMethod(
    			ServerCalls.unaryServerMethodDefinition(
    				context = this.context,
    				descriptor = insuranceModuleStateDescriptor,
    				implementation = {
        QueryModuleStateResponseJvmConverter.convert(insuranceModuleState(QueryModuleStateRequestJvmConverter.convert(it)))
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

    public override suspend fun insuranceParams(request: QueryInsuranceParamsRequest):
        QueryInsuranceParamsResponse = insuranceParams(request, Metadata())

    public suspend fun insuranceParams(request: QueryInsuranceParamsRequest, metadata: Metadata):
        QueryInsuranceParamsResponse = QueryInsuranceParamsResponseJvmConverter.convert(
    		ClientCalls.unaryRpc(
    			option.channel, insuranceParamsDescriptor,
    			QueryInsuranceParamsRequestJvmConverter.convert(request),
    			option.callOptions, metadata,
    		),
    	)

    public override suspend fun insuranceFund(request: QueryInsuranceFundRequest):
        QueryInsuranceFundResponse = insuranceFund(request, Metadata())

    public suspend fun insuranceFund(request: QueryInsuranceFundRequest, metadata: Metadata):
        QueryInsuranceFundResponse = QueryInsuranceFundResponseJvmConverter.convert(
    		ClientCalls.unaryRpc(
    			option.channel, insuranceFundDescriptor,
    			QueryInsuranceFundRequestJvmConverter.convert(request),
    			option.callOptions, metadata,
    		),
    	)

    public override suspend fun insuranceFunds(request: QueryInsuranceFundsRequest):
        QueryInsuranceFundsResponse = insuranceFunds(request, Metadata())

    public suspend fun insuranceFunds(request: QueryInsuranceFundsRequest, metadata: Metadata):
        QueryInsuranceFundsResponse = QueryInsuranceFundsResponseJvmConverter.convert(
    		ClientCalls.unaryRpc(
    			option.channel, insuranceFundsDescriptor,
    			QueryInsuranceFundsRequestJvmConverter.convert(request),
    			option.callOptions, metadata,
    		),
    	)

    public override suspend fun estimatedRedemptions(request: QueryEstimatedRedemptionsRequest):
        QueryEstimatedRedemptionsResponse = estimatedRedemptions(request, Metadata())

    public suspend fun estimatedRedemptions(request: QueryEstimatedRedemptionsRequest,
        metadata: Metadata): QueryEstimatedRedemptionsResponse =
        QueryEstimatedRedemptionsResponseJvmConverter.convert(
    		ClientCalls.unaryRpc(
    			option.channel, estimatedRedemptionsDescriptor,
    			QueryEstimatedRedemptionsRequestJvmConverter.convert(request),
    			option.callOptions, metadata,
    		),
    	)

    public override suspend fun pendingRedemptions(request: QueryPendingRedemptionsRequest):
        QueryPendingRedemptionsResponse = pendingRedemptions(request, Metadata())

    public suspend fun pendingRedemptions(request: QueryPendingRedemptionsRequest,
        metadata: Metadata): QueryPendingRedemptionsResponse =
        QueryPendingRedemptionsResponseJvmConverter.convert(
    		ClientCalls.unaryRpc(
    			option.channel, pendingRedemptionsDescriptor,
    			QueryPendingRedemptionsRequestJvmConverter.convert(request),
    			option.callOptions, metadata,
    		),
    	)

    public override suspend fun insuranceModuleState(request: QueryModuleStateRequest):
        QueryModuleStateResponse = insuranceModuleState(request, Metadata())

    public suspend fun insuranceModuleState(request: QueryModuleStateRequest, metadata: Metadata):
        QueryModuleStateResponse = QueryModuleStateResponseJvmConverter.convert(
    		ClientCalls.unaryRpc(
    			option.channel, insuranceModuleStateDescriptor,
    			QueryModuleStateRequestJvmConverter.convert(request),
    			option.callOptions, metadata,
    		),
    	)
  }
}
