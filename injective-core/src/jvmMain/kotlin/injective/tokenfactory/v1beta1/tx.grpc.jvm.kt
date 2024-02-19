// Transform from injective/tokenfactory/v1beta1/tx.proto
@file:ProtobufSyntax(syntax = "PROTO3")
@file:GeneratorVersion(version = "0.3.1")

package injective.tokenfactory.v1beta1

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

  private val createDenomDescriptor: MethodDescriptor<Tx.MsgCreateDenom, Tx.MsgCreateDenomResponse>
      = MsgGrpc.getCreateDenomMethod()!!

  private val mintDescriptor: MethodDescriptor<Tx.MsgMint, Tx.MsgMintResponse> =
      MsgGrpc.getMintMethod()!!

  private val burnDescriptor: MethodDescriptor<Tx.MsgBurn, Tx.MsgBurnResponse> =
      MsgGrpc.getBurnMethod()!!

  private val changeAdminDescriptor: MethodDescriptor<Tx.MsgChangeAdmin, Tx.MsgChangeAdminResponse>
      = MsgGrpc.getChangeAdminMethod()!!

  private val setDenomMetadataDescriptor:
      MethodDescriptor<Tx.MsgSetDenomMetadata, Tx.MsgSetDenomMetadataResponse> =
      MsgGrpc.getSetDenomMetadataMethod()!!

  private val updateParamsDescriptor:
      MethodDescriptor<Tx.MsgUpdateParams, Tx.MsgUpdateParamsResponse> =
      MsgGrpc.getUpdateParamsMethod()!!

  public abstract class Server(
    coroutineContext: CoroutineContext = EmptyCoroutineContext,
  ) : AbstractCoroutineServerImpl(context = coroutineContext), Msg.Interface {
    public open override suspend fun createDenom(request: MsgCreateDenom): MsgCreateDenomResponse =
        throw
        StatusException(Status.UNIMPLEMENTED.withDescription("Method injective.tokenfactory.v1beta1.Msg.CreateDenom is unimplemented"))

    public open override suspend fun mint(request: MsgMint): MsgMintResponse = throw
        StatusException(Status.UNIMPLEMENTED.withDescription("Method injective.tokenfactory.v1beta1.Msg.Mint is unimplemented"))

    public open override suspend fun burn(request: MsgBurn): MsgBurnResponse = throw
        StatusException(Status.UNIMPLEMENTED.withDescription("Method injective.tokenfactory.v1beta1.Msg.Burn is unimplemented"))

    public open override suspend fun changeAdmin(request: MsgChangeAdmin): MsgChangeAdminResponse =
        throw
        StatusException(Status.UNIMPLEMENTED.withDescription("Method injective.tokenfactory.v1beta1.Msg.ChangeAdmin is unimplemented"))

    public open override suspend fun setDenomMetadata(request: MsgSetDenomMetadata):
        MsgSetDenomMetadataResponse = throw
        StatusException(Status.UNIMPLEMENTED.withDescription("Method injective.tokenfactory.v1beta1.Msg.SetDenomMetadata is unimplemented"))

    public open override suspend fun updateParams(request: MsgUpdateParams): MsgUpdateParamsResponse
        = throw
        StatusException(Status.UNIMPLEMENTED.withDescription("Method injective.tokenfactory.v1beta1.Msg.UpdateParams is unimplemented"))

    public override fun bindService(): ServerServiceDefinition =
        ServerServiceDefinition.builder(descriptor)
    		.addMethod(
    			ServerCalls.unaryServerMethodDefinition(
    				context = this.context,
    				descriptor = createDenomDescriptor,
    				implementation = {
        MsgCreateDenomResponseJvmConverter.convert(createDenom(MsgCreateDenomJvmConverter.convert(it)))
        },
    			)
    		)
    		.addMethod(
    			ServerCalls.unaryServerMethodDefinition(
    				context = this.context,
    				descriptor = mintDescriptor,
    				implementation = {
        MsgMintResponseJvmConverter.convert(mint(MsgMintJvmConverter.convert(it))) },
    			)
    		)
    		.addMethod(
    			ServerCalls.unaryServerMethodDefinition(
    				context = this.context,
    				descriptor = burnDescriptor,
    				implementation = {
        MsgBurnResponseJvmConverter.convert(burn(MsgBurnJvmConverter.convert(it))) },
    			)
    		)
    		.addMethod(
    			ServerCalls.unaryServerMethodDefinition(
    				context = this.context,
    				descriptor = changeAdminDescriptor,
    				implementation = {
        MsgChangeAdminResponseJvmConverter.convert(changeAdmin(MsgChangeAdminJvmConverter.convert(it)))
        },
    			)
    		)
    		.addMethod(
    			ServerCalls.unaryServerMethodDefinition(
    				context = this.context,
    				descriptor = setDenomMetadataDescriptor,
    				implementation = {
        MsgSetDenomMetadataResponseJvmConverter.convert(setDenomMetadata(MsgSetDenomMetadataJvmConverter.convert(it)))
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

    public override suspend fun createDenom(request: MsgCreateDenom): MsgCreateDenomResponse =
        createDenom(request, Metadata())

    public suspend fun createDenom(request: MsgCreateDenom, metadata: Metadata):
        MsgCreateDenomResponse = MsgCreateDenomResponseJvmConverter.convert(
    		ClientCalls.unaryRpc(
    			option.channel, createDenomDescriptor,
    			MsgCreateDenomJvmConverter.convert(request),
    			option.callOptions, metadata,
    		),
    	)

    public override suspend fun mint(request: MsgMint): MsgMintResponse = mint(request, Metadata())

    public suspend fun mint(request: MsgMint, metadata: Metadata): MsgMintResponse =
        MsgMintResponseJvmConverter.convert(
    		ClientCalls.unaryRpc(
    			option.channel, mintDescriptor,
    			MsgMintJvmConverter.convert(request),
    			option.callOptions, metadata,
    		),
    	)

    public override suspend fun burn(request: MsgBurn): MsgBurnResponse = burn(request, Metadata())

    public suspend fun burn(request: MsgBurn, metadata: Metadata): MsgBurnResponse =
        MsgBurnResponseJvmConverter.convert(
    		ClientCalls.unaryRpc(
    			option.channel, burnDescriptor,
    			MsgBurnJvmConverter.convert(request),
    			option.callOptions, metadata,
    		),
    	)

    public override suspend fun changeAdmin(request: MsgChangeAdmin): MsgChangeAdminResponse =
        changeAdmin(request, Metadata())

    public suspend fun changeAdmin(request: MsgChangeAdmin, metadata: Metadata):
        MsgChangeAdminResponse = MsgChangeAdminResponseJvmConverter.convert(
    		ClientCalls.unaryRpc(
    			option.channel, changeAdminDescriptor,
    			MsgChangeAdminJvmConverter.convert(request),
    			option.callOptions, metadata,
    		),
    	)

    public override suspend fun setDenomMetadata(request: MsgSetDenomMetadata):
        MsgSetDenomMetadataResponse = setDenomMetadata(request, Metadata())

    public suspend fun setDenomMetadata(request: MsgSetDenomMetadata, metadata: Metadata):
        MsgSetDenomMetadataResponse = MsgSetDenomMetadataResponseJvmConverter.convert(
    		ClientCalls.unaryRpc(
    			option.channel, setDenomMetadataDescriptor,
    			MsgSetDenomMetadataJvmConverter.convert(request),
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
