// Transform from injective/oracle/v1beta1/tx.proto
@file:ProtobufSyntax(syntax = "PROTO3")
@file:GeneratorVersion(version = "0.3.1")

package injective.oracle.v1beta1

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

  private val relayProviderPricesDescriptor:
      MethodDescriptor<Tx.MsgRelayProviderPrices, Tx.MsgRelayProviderPricesResponse> =
      MsgGrpc.getRelayProviderPricesMethod()!!

  private val relayPriceFeedPriceDescriptor:
      MethodDescriptor<Tx.MsgRelayPriceFeedPrice, Tx.MsgRelayPriceFeedPriceResponse> =
      MsgGrpc.getRelayPriceFeedPriceMethod()!!

  private val relayBandRatesDescriptor:
      MethodDescriptor<Tx.MsgRelayBandRates, Tx.MsgRelayBandRatesResponse> =
      MsgGrpc.getRelayBandRatesMethod()!!

  private val requestBandIBCRatesDescriptor:
      MethodDescriptor<Tx.MsgRequestBandIBCRates, Tx.MsgRequestBandIBCRatesResponse> =
      MsgGrpc.getRequestBandIBCRatesMethod()!!

  private val relayCoinbaseMessagesDescriptor:
      MethodDescriptor<Tx.MsgRelayCoinbaseMessages, Tx.MsgRelayCoinbaseMessagesResponse> =
      MsgGrpc.getRelayCoinbaseMessagesMethod()!!

  private val relayPythPricesDescriptor:
      MethodDescriptor<Tx.MsgRelayPythPrices, Tx.MsgRelayPythPricesResponse> =
      MsgGrpc.getRelayPythPricesMethod()!!

  private val updateParamsDescriptor:
      MethodDescriptor<Tx.MsgUpdateParams, Tx.MsgUpdateParamsResponse> =
      MsgGrpc.getUpdateParamsMethod()!!

  public abstract class Server(
    coroutineContext: CoroutineContext = EmptyCoroutineContext,
  ) : AbstractCoroutineServerImpl(context = coroutineContext), Msg.Interface {
    public open override suspend fun relayProviderPrices(request: MsgRelayProviderPrices):
        MsgRelayProviderPricesResponse = throw
        StatusException(Status.UNIMPLEMENTED.withDescription("Method injective.oracle.v1beta1.Msg.RelayProviderPrices is unimplemented"))

    public open override suspend fun relayPriceFeedPrice(request: MsgRelayPriceFeedPrice):
        MsgRelayPriceFeedPriceResponse = throw
        StatusException(Status.UNIMPLEMENTED.withDescription("Method injective.oracle.v1beta1.Msg.RelayPriceFeedPrice is unimplemented"))

    public open override suspend fun relayBandRates(request: MsgRelayBandRates):
        MsgRelayBandRatesResponse = throw
        StatusException(Status.UNIMPLEMENTED.withDescription("Method injective.oracle.v1beta1.Msg.RelayBandRates is unimplemented"))

    public open override suspend fun requestBandIBCRates(request: MsgRequestBandIBCRates):
        MsgRequestBandIBCRatesResponse = throw
        StatusException(Status.UNIMPLEMENTED.withDescription("Method injective.oracle.v1beta1.Msg.RequestBandIBCRates is unimplemented"))

    public open override suspend fun relayCoinbaseMessages(request: MsgRelayCoinbaseMessages):
        MsgRelayCoinbaseMessagesResponse = throw
        StatusException(Status.UNIMPLEMENTED.withDescription("Method injective.oracle.v1beta1.Msg.RelayCoinbaseMessages is unimplemented"))

    public open override suspend fun relayPythPrices(request: MsgRelayPythPrices):
        MsgRelayPythPricesResponse = throw
        StatusException(Status.UNIMPLEMENTED.withDescription("Method injective.oracle.v1beta1.Msg.RelayPythPrices is unimplemented"))

    public open override suspend fun updateParams(request: MsgUpdateParams): MsgUpdateParamsResponse
        = throw
        StatusException(Status.UNIMPLEMENTED.withDescription("Method injective.oracle.v1beta1.Msg.UpdateParams is unimplemented"))

    public override fun bindService(): ServerServiceDefinition =
        ServerServiceDefinition.builder(descriptor)
    		.addMethod(
    			ServerCalls.unaryServerMethodDefinition(
    				context = this.context,
    				descriptor = relayProviderPricesDescriptor,
    				implementation = {
        MsgRelayProviderPricesResponseJvmConverter.convert(relayProviderPrices(MsgRelayProviderPricesJvmConverter.convert(it)))
        },
    			)
    		)
    		.addMethod(
    			ServerCalls.unaryServerMethodDefinition(
    				context = this.context,
    				descriptor = relayPriceFeedPriceDescriptor,
    				implementation = {
        MsgRelayPriceFeedPriceResponseJvmConverter.convert(relayPriceFeedPrice(MsgRelayPriceFeedPriceJvmConverter.convert(it)))
        },
    			)
    		)
    		.addMethod(
    			ServerCalls.unaryServerMethodDefinition(
    				context = this.context,
    				descriptor = relayBandRatesDescriptor,
    				implementation = {
        MsgRelayBandRatesResponseJvmConverter.convert(relayBandRates(MsgRelayBandRatesJvmConverter.convert(it)))
        },
    			)
    		)
    		.addMethod(
    			ServerCalls.unaryServerMethodDefinition(
    				context = this.context,
    				descriptor = requestBandIBCRatesDescriptor,
    				implementation = {
        MsgRequestBandIBCRatesResponseJvmConverter.convert(requestBandIBCRates(MsgRequestBandIBCRatesJvmConverter.convert(it)))
        },
    			)
    		)
    		.addMethod(
    			ServerCalls.unaryServerMethodDefinition(
    				context = this.context,
    				descriptor = relayCoinbaseMessagesDescriptor,
    				implementation = {
        MsgRelayCoinbaseMessagesResponseJvmConverter.convert(relayCoinbaseMessages(MsgRelayCoinbaseMessagesJvmConverter.convert(it)))
        },
    			)
    		)
    		.addMethod(
    			ServerCalls.unaryServerMethodDefinition(
    				context = this.context,
    				descriptor = relayPythPricesDescriptor,
    				implementation = {
        MsgRelayPythPricesResponseJvmConverter.convert(relayPythPrices(MsgRelayPythPricesJvmConverter.convert(it)))
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

    public override suspend fun relayProviderPrices(request: MsgRelayProviderPrices):
        MsgRelayProviderPricesResponse = relayProviderPrices(request, Metadata())

    public suspend fun relayProviderPrices(request: MsgRelayProviderPrices, metadata: Metadata):
        MsgRelayProviderPricesResponse = MsgRelayProviderPricesResponseJvmConverter.convert(
    		ClientCalls.unaryRpc(
    			option.channel, relayProviderPricesDescriptor,
    			MsgRelayProviderPricesJvmConverter.convert(request),
    			option.callOptions, metadata,
    		),
    	)

    public override suspend fun relayPriceFeedPrice(request: MsgRelayPriceFeedPrice):
        MsgRelayPriceFeedPriceResponse = relayPriceFeedPrice(request, Metadata())

    public suspend fun relayPriceFeedPrice(request: MsgRelayPriceFeedPrice, metadata: Metadata):
        MsgRelayPriceFeedPriceResponse = MsgRelayPriceFeedPriceResponseJvmConverter.convert(
    		ClientCalls.unaryRpc(
    			option.channel, relayPriceFeedPriceDescriptor,
    			MsgRelayPriceFeedPriceJvmConverter.convert(request),
    			option.callOptions, metadata,
    		),
    	)

    public override suspend fun relayBandRates(request: MsgRelayBandRates):
        MsgRelayBandRatesResponse = relayBandRates(request, Metadata())

    public suspend fun relayBandRates(request: MsgRelayBandRates, metadata: Metadata):
        MsgRelayBandRatesResponse = MsgRelayBandRatesResponseJvmConverter.convert(
    		ClientCalls.unaryRpc(
    			option.channel, relayBandRatesDescriptor,
    			MsgRelayBandRatesJvmConverter.convert(request),
    			option.callOptions, metadata,
    		),
    	)

    public override suspend fun requestBandIBCRates(request: MsgRequestBandIBCRates):
        MsgRequestBandIBCRatesResponse = requestBandIBCRates(request, Metadata())

    public suspend fun requestBandIBCRates(request: MsgRequestBandIBCRates, metadata: Metadata):
        MsgRequestBandIBCRatesResponse = MsgRequestBandIBCRatesResponseJvmConverter.convert(
    		ClientCalls.unaryRpc(
    			option.channel, requestBandIBCRatesDescriptor,
    			MsgRequestBandIBCRatesJvmConverter.convert(request),
    			option.callOptions, metadata,
    		),
    	)

    public override suspend fun relayCoinbaseMessages(request: MsgRelayCoinbaseMessages):
        MsgRelayCoinbaseMessagesResponse = relayCoinbaseMessages(request, Metadata())

    public suspend fun relayCoinbaseMessages(request: MsgRelayCoinbaseMessages, metadata: Metadata):
        MsgRelayCoinbaseMessagesResponse = MsgRelayCoinbaseMessagesResponseJvmConverter.convert(
    		ClientCalls.unaryRpc(
    			option.channel, relayCoinbaseMessagesDescriptor,
    			MsgRelayCoinbaseMessagesJvmConverter.convert(request),
    			option.callOptions, metadata,
    		),
    	)

    public override suspend fun relayPythPrices(request: MsgRelayPythPrices):
        MsgRelayPythPricesResponse = relayPythPrices(request, Metadata())

    public suspend fun relayPythPrices(request: MsgRelayPythPrices, metadata: Metadata):
        MsgRelayPythPricesResponse = MsgRelayPythPricesResponseJvmConverter.convert(
    		ClientCalls.unaryRpc(
    			option.channel, relayPythPricesDescriptor,
    			MsgRelayPythPricesJvmConverter.convert(request),
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
