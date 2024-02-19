// Transform from injective/ocr/v1beta1/tx.proto
@file:ProtobufSyntax(syntax = "PROTO3")
@file:GeneratorVersion(version = "0.3.1")

package injective.ocr.v1beta1

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

  private val createFeedDescriptor: MethodDescriptor<Tx.MsgCreateFeed, Tx.MsgCreateFeedResponse> =
      MsgGrpc.getCreateFeedMethod()!!

  private val updateFeedDescriptor: MethodDescriptor<Tx.MsgUpdateFeed, Tx.MsgUpdateFeedResponse> =
      MsgGrpc.getUpdateFeedMethod()!!

  private val transmitDescriptor: MethodDescriptor<Tx.MsgTransmit, Tx.MsgTransmitResponse> =
      MsgGrpc.getTransmitMethod()!!

  private val fundFeedRewardPoolDescriptor:
      MethodDescriptor<Tx.MsgFundFeedRewardPool, Tx.MsgFundFeedRewardPoolResponse> =
      MsgGrpc.getFundFeedRewardPoolMethod()!!

  private val withdrawFeedRewardPoolDescriptor:
      MethodDescriptor<Tx.MsgWithdrawFeedRewardPool, Tx.MsgWithdrawFeedRewardPoolResponse> =
      MsgGrpc.getWithdrawFeedRewardPoolMethod()!!

  private val setPayeesDescriptor: MethodDescriptor<Tx.MsgSetPayees, Tx.MsgSetPayeesResponse> =
      MsgGrpc.getSetPayeesMethod()!!

  private val transferPayeeshipDescriptor:
      MethodDescriptor<Tx.MsgTransferPayeeship, Tx.MsgTransferPayeeshipResponse> =
      MsgGrpc.getTransferPayeeshipMethod()!!

  private val acceptPayeeshipDescriptor:
      MethodDescriptor<Tx.MsgAcceptPayeeship, Tx.MsgAcceptPayeeshipResponse> =
      MsgGrpc.getAcceptPayeeshipMethod()!!

  private val updateParamsDescriptor:
      MethodDescriptor<Tx.MsgUpdateParams, Tx.MsgUpdateParamsResponse> =
      MsgGrpc.getUpdateParamsMethod()!!

  public abstract class Server(
    coroutineContext: CoroutineContext = EmptyCoroutineContext,
  ) : AbstractCoroutineServerImpl(context = coroutineContext), Msg.Interface {
    public open override suspend fun createFeed(request: MsgCreateFeed): MsgCreateFeedResponse =
        throw
        StatusException(Status.UNIMPLEMENTED.withDescription("Method injective.ocr.v1beta1.Msg.CreateFeed is unimplemented"))

    public open override suspend fun updateFeed(request: MsgUpdateFeed): MsgUpdateFeedResponse =
        throw
        StatusException(Status.UNIMPLEMENTED.withDescription("Method injective.ocr.v1beta1.Msg.UpdateFeed is unimplemented"))

    public open override suspend fun transmit(request: MsgTransmit): MsgTransmitResponse = throw
        StatusException(Status.UNIMPLEMENTED.withDescription("Method injective.ocr.v1beta1.Msg.Transmit is unimplemented"))

    public open override suspend fun fundFeedRewardPool(request: MsgFundFeedRewardPool):
        MsgFundFeedRewardPoolResponse = throw
        StatusException(Status.UNIMPLEMENTED.withDescription("Method injective.ocr.v1beta1.Msg.FundFeedRewardPool is unimplemented"))

    public open override suspend fun withdrawFeedRewardPool(request: MsgWithdrawFeedRewardPool):
        MsgWithdrawFeedRewardPoolResponse = throw
        StatusException(Status.UNIMPLEMENTED.withDescription("Method injective.ocr.v1beta1.Msg.WithdrawFeedRewardPool is unimplemented"))

    public open override suspend fun setPayees(request: MsgSetPayees): MsgSetPayeesResponse = throw
        StatusException(Status.UNIMPLEMENTED.withDescription("Method injective.ocr.v1beta1.Msg.SetPayees is unimplemented"))

    public open override suspend fun transferPayeeship(request: MsgTransferPayeeship):
        MsgTransferPayeeshipResponse = throw
        StatusException(Status.UNIMPLEMENTED.withDescription("Method injective.ocr.v1beta1.Msg.TransferPayeeship is unimplemented"))

    public open override suspend fun acceptPayeeship(request: MsgAcceptPayeeship):
        MsgAcceptPayeeshipResponse = throw
        StatusException(Status.UNIMPLEMENTED.withDescription("Method injective.ocr.v1beta1.Msg.AcceptPayeeship is unimplemented"))

    public open override suspend fun updateParams(request: MsgUpdateParams): MsgUpdateParamsResponse
        = throw
        StatusException(Status.UNIMPLEMENTED.withDescription("Method injective.ocr.v1beta1.Msg.UpdateParams is unimplemented"))

    public override fun bindService(): ServerServiceDefinition =
        ServerServiceDefinition.builder(descriptor)
    		.addMethod(
    			ServerCalls.unaryServerMethodDefinition(
    				context = this.context,
    				descriptor = createFeedDescriptor,
    				implementation = {
        MsgCreateFeedResponseJvmConverter.convert(createFeed(MsgCreateFeedJvmConverter.convert(it)))
        },
    			)
    		)
    		.addMethod(
    			ServerCalls.unaryServerMethodDefinition(
    				context = this.context,
    				descriptor = updateFeedDescriptor,
    				implementation = {
        MsgUpdateFeedResponseJvmConverter.convert(updateFeed(MsgUpdateFeedJvmConverter.convert(it)))
        },
    			)
    		)
    		.addMethod(
    			ServerCalls.unaryServerMethodDefinition(
    				context = this.context,
    				descriptor = transmitDescriptor,
    				implementation = {
        MsgTransmitResponseJvmConverter.convert(transmit(MsgTransmitJvmConverter.convert(it))) },
    			)
    		)
    		.addMethod(
    			ServerCalls.unaryServerMethodDefinition(
    				context = this.context,
    				descriptor = fundFeedRewardPoolDescriptor,
    				implementation = {
        MsgFundFeedRewardPoolResponseJvmConverter.convert(fundFeedRewardPool(MsgFundFeedRewardPoolJvmConverter.convert(it)))
        },
    			)
    		)
    		.addMethod(
    			ServerCalls.unaryServerMethodDefinition(
    				context = this.context,
    				descriptor = withdrawFeedRewardPoolDescriptor,
    				implementation = {
        MsgWithdrawFeedRewardPoolResponseJvmConverter.convert(withdrawFeedRewardPool(MsgWithdrawFeedRewardPoolJvmConverter.convert(it)))
        },
    			)
    		)
    		.addMethod(
    			ServerCalls.unaryServerMethodDefinition(
    				context = this.context,
    				descriptor = setPayeesDescriptor,
    				implementation = {
        MsgSetPayeesResponseJvmConverter.convert(setPayees(MsgSetPayeesJvmConverter.convert(it))) },
    			)
    		)
    		.addMethod(
    			ServerCalls.unaryServerMethodDefinition(
    				context = this.context,
    				descriptor = transferPayeeshipDescriptor,
    				implementation = {
        MsgTransferPayeeshipResponseJvmConverter.convert(transferPayeeship(MsgTransferPayeeshipJvmConverter.convert(it)))
        },
    			)
    		)
    		.addMethod(
    			ServerCalls.unaryServerMethodDefinition(
    				context = this.context,
    				descriptor = acceptPayeeshipDescriptor,
    				implementation = {
        MsgAcceptPayeeshipResponseJvmConverter.convert(acceptPayeeship(MsgAcceptPayeeshipJvmConverter.convert(it)))
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

    public override suspend fun createFeed(request: MsgCreateFeed): MsgCreateFeedResponse =
        createFeed(request, Metadata())

    public suspend fun createFeed(request: MsgCreateFeed, metadata: Metadata): MsgCreateFeedResponse
        = MsgCreateFeedResponseJvmConverter.convert(
    		ClientCalls.unaryRpc(
    			option.channel, createFeedDescriptor,
    			MsgCreateFeedJvmConverter.convert(request),
    			option.callOptions, metadata,
    		),
    	)

    public override suspend fun updateFeed(request: MsgUpdateFeed): MsgUpdateFeedResponse =
        updateFeed(request, Metadata())

    public suspend fun updateFeed(request: MsgUpdateFeed, metadata: Metadata): MsgUpdateFeedResponse
        = MsgUpdateFeedResponseJvmConverter.convert(
    		ClientCalls.unaryRpc(
    			option.channel, updateFeedDescriptor,
    			MsgUpdateFeedJvmConverter.convert(request),
    			option.callOptions, metadata,
    		),
    	)

    public override suspend fun transmit(request: MsgTransmit): MsgTransmitResponse =
        transmit(request, Metadata())

    public suspend fun transmit(request: MsgTransmit, metadata: Metadata): MsgTransmitResponse =
        MsgTransmitResponseJvmConverter.convert(
    		ClientCalls.unaryRpc(
    			option.channel, transmitDescriptor,
    			MsgTransmitJvmConverter.convert(request),
    			option.callOptions, metadata,
    		),
    	)

    public override suspend fun fundFeedRewardPool(request: MsgFundFeedRewardPool):
        MsgFundFeedRewardPoolResponse = fundFeedRewardPool(request, Metadata())

    public suspend fun fundFeedRewardPool(request: MsgFundFeedRewardPool, metadata: Metadata):
        MsgFundFeedRewardPoolResponse = MsgFundFeedRewardPoolResponseJvmConverter.convert(
    		ClientCalls.unaryRpc(
    			option.channel, fundFeedRewardPoolDescriptor,
    			MsgFundFeedRewardPoolJvmConverter.convert(request),
    			option.callOptions, metadata,
    		),
    	)

    public override suspend fun withdrawFeedRewardPool(request: MsgWithdrawFeedRewardPool):
        MsgWithdrawFeedRewardPoolResponse = withdrawFeedRewardPool(request, Metadata())

    public suspend fun withdrawFeedRewardPool(request: MsgWithdrawFeedRewardPool,
        metadata: Metadata): MsgWithdrawFeedRewardPoolResponse =
        MsgWithdrawFeedRewardPoolResponseJvmConverter.convert(
    		ClientCalls.unaryRpc(
    			option.channel, withdrawFeedRewardPoolDescriptor,
    			MsgWithdrawFeedRewardPoolJvmConverter.convert(request),
    			option.callOptions, metadata,
    		),
    	)

    public override suspend fun setPayees(request: MsgSetPayees): MsgSetPayeesResponse =
        setPayees(request, Metadata())

    public suspend fun setPayees(request: MsgSetPayees, metadata: Metadata): MsgSetPayeesResponse =
        MsgSetPayeesResponseJvmConverter.convert(
    		ClientCalls.unaryRpc(
    			option.channel, setPayeesDescriptor,
    			MsgSetPayeesJvmConverter.convert(request),
    			option.callOptions, metadata,
    		),
    	)

    public override suspend fun transferPayeeship(request: MsgTransferPayeeship):
        MsgTransferPayeeshipResponse = transferPayeeship(request, Metadata())

    public suspend fun transferPayeeship(request: MsgTransferPayeeship, metadata: Metadata):
        MsgTransferPayeeshipResponse = MsgTransferPayeeshipResponseJvmConverter.convert(
    		ClientCalls.unaryRpc(
    			option.channel, transferPayeeshipDescriptor,
    			MsgTransferPayeeshipJvmConverter.convert(request),
    			option.callOptions, metadata,
    		),
    	)

    public override suspend fun acceptPayeeship(request: MsgAcceptPayeeship):
        MsgAcceptPayeeshipResponse = acceptPayeeship(request, Metadata())

    public suspend fun acceptPayeeship(request: MsgAcceptPayeeship, metadata: Metadata):
        MsgAcceptPayeeshipResponse = MsgAcceptPayeeshipResponseJvmConverter.convert(
    		ClientCalls.unaryRpc(
    			option.channel, acceptPayeeshipDescriptor,
    			MsgAcceptPayeeshipJvmConverter.convert(request),
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
