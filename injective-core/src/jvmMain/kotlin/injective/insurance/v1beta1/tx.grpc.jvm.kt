// Transform from injective/insurance/v1beta1/tx.proto
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

public object MsgJvm {
  private val descriptor: ServiceDescriptor = MsgGrpc.getServiceDescriptor()!!

  private val createInsuranceFundDescriptor:
      MethodDescriptor<Tx.MsgCreateInsuranceFund, Tx.MsgCreateInsuranceFundResponse> =
      MsgGrpc.getCreateInsuranceFundMethod()!!

  private val underwriteDescriptor: MethodDescriptor<Tx.MsgUnderwrite, Tx.MsgUnderwriteResponse> =
      MsgGrpc.getUnderwriteMethod()!!

  private val requestRedemptionDescriptor:
      MethodDescriptor<Tx.MsgRequestRedemption, Tx.MsgRequestRedemptionResponse> =
      MsgGrpc.getRequestRedemptionMethod()!!

  private val updateParamsDescriptor:
      MethodDescriptor<Tx.MsgUpdateParams, Tx.MsgUpdateParamsResponse> =
      MsgGrpc.getUpdateParamsMethod()!!

  public abstract class Server(
    coroutineContext: CoroutineContext = EmptyCoroutineContext,
  ) : AbstractCoroutineServerImpl(context = coroutineContext), Msg.Interface {
    public open override suspend fun createInsuranceFund(request: MsgCreateInsuranceFund):
        MsgCreateInsuranceFundResponse = throw
        StatusException(Status.UNIMPLEMENTED.withDescription("Method injective.insurance.v1beta1.Msg.CreateInsuranceFund is unimplemented"))

    public open override suspend fun underwrite(request: MsgUnderwrite): MsgUnderwriteResponse =
        throw
        StatusException(Status.UNIMPLEMENTED.withDescription("Method injective.insurance.v1beta1.Msg.Underwrite is unimplemented"))

    public open override suspend fun requestRedemption(request: MsgRequestRedemption):
        MsgRequestRedemptionResponse = throw
        StatusException(Status.UNIMPLEMENTED.withDescription("Method injective.insurance.v1beta1.Msg.RequestRedemption is unimplemented"))

    public open override suspend fun updateParams(request: MsgUpdateParams): MsgUpdateParamsResponse
        = throw
        StatusException(Status.UNIMPLEMENTED.withDescription("Method injective.insurance.v1beta1.Msg.UpdateParams is unimplemented"))

    public override fun bindService(): ServerServiceDefinition =
        ServerServiceDefinition.builder(descriptor)
    		.addMethod(
    			ServerCalls.unaryServerMethodDefinition(
    				context = this.context,
    				descriptor = createInsuranceFundDescriptor,
    				implementation = {
        MsgCreateInsuranceFundResponseJvmConverter.convert(createInsuranceFund(MsgCreateInsuranceFundJvmConverter.convert(it)))
        },
    			)
    		)
    		.addMethod(
    			ServerCalls.unaryServerMethodDefinition(
    				context = this.context,
    				descriptor = underwriteDescriptor,
    				implementation = {
        MsgUnderwriteResponseJvmConverter.convert(underwrite(MsgUnderwriteJvmConverter.convert(it)))
        },
    			)
    		)
    		.addMethod(
    			ServerCalls.unaryServerMethodDefinition(
    				context = this.context,
    				descriptor = requestRedemptionDescriptor,
    				implementation = {
        MsgRequestRedemptionResponseJvmConverter.convert(requestRedemption(MsgRequestRedemptionJvmConverter.convert(it)))
        },
    			)
    		)
    		.addMethod(
    			ServerCalls.unaryServerMethodDefinition(
    				context = this.context,
    				descriptor = updateParamsDescriptor,
    				implementation = {
        MsgUpdateParamsResponseJvmConverter.convert(updateParams(MsgUpdateParamsJvmConverter.convert(it)))
        },
    			)
    		)
    		.build()
  }

  public open class Client(
    private val option: ClientOption,
  ) : AbstractCoroutineStub<Msg.Client>(channel = option.channel, callOptions = option.callOptions),
      Msg.Interface {
    public override fun build(channel: Channel, callOptions: CallOptions): Msg.Client =
        Msg.Client(ClientOption(channel, callOptions))

    public override suspend fun createInsuranceFund(request: MsgCreateInsuranceFund):
        MsgCreateInsuranceFundResponse = createInsuranceFund(request, Metadata())

    public suspend fun createInsuranceFund(request: MsgCreateInsuranceFund, metadata: Metadata):
        MsgCreateInsuranceFundResponse = MsgCreateInsuranceFundResponseJvmConverter.convert(
    		ClientCalls.unaryRpc(
    			option.channel, createInsuranceFundDescriptor,
    			MsgCreateInsuranceFundJvmConverter.convert(request),
    			option.callOptions, metadata,
    		),
    	)

    public override suspend fun underwrite(request: MsgUnderwrite): MsgUnderwriteResponse =
        underwrite(request, Metadata())

    public suspend fun underwrite(request: MsgUnderwrite, metadata: Metadata): MsgUnderwriteResponse
        = MsgUnderwriteResponseJvmConverter.convert(
    		ClientCalls.unaryRpc(
    			option.channel, underwriteDescriptor,
    			MsgUnderwriteJvmConverter.convert(request),
    			option.callOptions, metadata,
    		),
    	)

    public override suspend fun requestRedemption(request: MsgRequestRedemption):
        MsgRequestRedemptionResponse = requestRedemption(request, Metadata())

    public suspend fun requestRedemption(request: MsgRequestRedemption, metadata: Metadata):
        MsgRequestRedemptionResponse = MsgRequestRedemptionResponseJvmConverter.convert(
    		ClientCalls.unaryRpc(
    			option.channel, requestRedemptionDescriptor,
    			MsgRequestRedemptionJvmConverter.convert(request),
    			option.callOptions, metadata,
    		),
    	)

    public override suspend fun updateParams(request: MsgUpdateParams): MsgUpdateParamsResponse =
        updateParams(request, Metadata())

    public suspend fun updateParams(request: MsgUpdateParams, metadata: Metadata):
        MsgUpdateParamsResponse = MsgUpdateParamsResponseJvmConverter.convert(
    		ClientCalls.unaryRpc(
    			option.channel, updateParamsDescriptor,
    			MsgUpdateParamsJvmConverter.convert(request),
    			option.callOptions, metadata,
    		),
    	)
  }
}
