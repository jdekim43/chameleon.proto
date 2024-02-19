package injective.oracle.v1beta1;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * Msg defines the oracle Msg service.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.54.0)",
    comments = "Source: injective/oracle/v1beta1/tx.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class MsgGrpc {

  private MsgGrpc() {}

  public static final String SERVICE_NAME = "injective.oracle.v1beta1.Msg";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<injective.oracle.v1beta1.Tx.MsgRelayProviderPrices,
      injective.oracle.v1beta1.Tx.MsgRelayProviderPricesResponse> getRelayProviderPricesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "RelayProviderPrices",
      requestType = injective.oracle.v1beta1.Tx.MsgRelayProviderPrices.class,
      responseType = injective.oracle.v1beta1.Tx.MsgRelayProviderPricesResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<injective.oracle.v1beta1.Tx.MsgRelayProviderPrices,
      injective.oracle.v1beta1.Tx.MsgRelayProviderPricesResponse> getRelayProviderPricesMethod() {
    io.grpc.MethodDescriptor<injective.oracle.v1beta1.Tx.MsgRelayProviderPrices, injective.oracle.v1beta1.Tx.MsgRelayProviderPricesResponse> getRelayProviderPricesMethod;
    if ((getRelayProviderPricesMethod = MsgGrpc.getRelayProviderPricesMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getRelayProviderPricesMethod = MsgGrpc.getRelayProviderPricesMethod) == null) {
          MsgGrpc.getRelayProviderPricesMethod = getRelayProviderPricesMethod =
              io.grpc.MethodDescriptor.<injective.oracle.v1beta1.Tx.MsgRelayProviderPrices, injective.oracle.v1beta1.Tx.MsgRelayProviderPricesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "RelayProviderPrices"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  injective.oracle.v1beta1.Tx.MsgRelayProviderPrices.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  injective.oracle.v1beta1.Tx.MsgRelayProviderPricesResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("RelayProviderPrices"))
              .build();
        }
      }
    }
    return getRelayProviderPricesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<injective.oracle.v1beta1.Tx.MsgRelayPriceFeedPrice,
      injective.oracle.v1beta1.Tx.MsgRelayPriceFeedPriceResponse> getRelayPriceFeedPriceMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "RelayPriceFeedPrice",
      requestType = injective.oracle.v1beta1.Tx.MsgRelayPriceFeedPrice.class,
      responseType = injective.oracle.v1beta1.Tx.MsgRelayPriceFeedPriceResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<injective.oracle.v1beta1.Tx.MsgRelayPriceFeedPrice,
      injective.oracle.v1beta1.Tx.MsgRelayPriceFeedPriceResponse> getRelayPriceFeedPriceMethod() {
    io.grpc.MethodDescriptor<injective.oracle.v1beta1.Tx.MsgRelayPriceFeedPrice, injective.oracle.v1beta1.Tx.MsgRelayPriceFeedPriceResponse> getRelayPriceFeedPriceMethod;
    if ((getRelayPriceFeedPriceMethod = MsgGrpc.getRelayPriceFeedPriceMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getRelayPriceFeedPriceMethod = MsgGrpc.getRelayPriceFeedPriceMethod) == null) {
          MsgGrpc.getRelayPriceFeedPriceMethod = getRelayPriceFeedPriceMethod =
              io.grpc.MethodDescriptor.<injective.oracle.v1beta1.Tx.MsgRelayPriceFeedPrice, injective.oracle.v1beta1.Tx.MsgRelayPriceFeedPriceResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "RelayPriceFeedPrice"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  injective.oracle.v1beta1.Tx.MsgRelayPriceFeedPrice.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  injective.oracle.v1beta1.Tx.MsgRelayPriceFeedPriceResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("RelayPriceFeedPrice"))
              .build();
        }
      }
    }
    return getRelayPriceFeedPriceMethod;
  }

  private static volatile io.grpc.MethodDescriptor<injective.oracle.v1beta1.Tx.MsgRelayBandRates,
      injective.oracle.v1beta1.Tx.MsgRelayBandRatesResponse> getRelayBandRatesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "RelayBandRates",
      requestType = injective.oracle.v1beta1.Tx.MsgRelayBandRates.class,
      responseType = injective.oracle.v1beta1.Tx.MsgRelayBandRatesResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<injective.oracle.v1beta1.Tx.MsgRelayBandRates,
      injective.oracle.v1beta1.Tx.MsgRelayBandRatesResponse> getRelayBandRatesMethod() {
    io.grpc.MethodDescriptor<injective.oracle.v1beta1.Tx.MsgRelayBandRates, injective.oracle.v1beta1.Tx.MsgRelayBandRatesResponse> getRelayBandRatesMethod;
    if ((getRelayBandRatesMethod = MsgGrpc.getRelayBandRatesMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getRelayBandRatesMethod = MsgGrpc.getRelayBandRatesMethod) == null) {
          MsgGrpc.getRelayBandRatesMethod = getRelayBandRatesMethod =
              io.grpc.MethodDescriptor.<injective.oracle.v1beta1.Tx.MsgRelayBandRates, injective.oracle.v1beta1.Tx.MsgRelayBandRatesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "RelayBandRates"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  injective.oracle.v1beta1.Tx.MsgRelayBandRates.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  injective.oracle.v1beta1.Tx.MsgRelayBandRatesResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("RelayBandRates"))
              .build();
        }
      }
    }
    return getRelayBandRatesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<injective.oracle.v1beta1.Tx.MsgRequestBandIBCRates,
      injective.oracle.v1beta1.Tx.MsgRequestBandIBCRatesResponse> getRequestBandIBCRatesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "RequestBandIBCRates",
      requestType = injective.oracle.v1beta1.Tx.MsgRequestBandIBCRates.class,
      responseType = injective.oracle.v1beta1.Tx.MsgRequestBandIBCRatesResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<injective.oracle.v1beta1.Tx.MsgRequestBandIBCRates,
      injective.oracle.v1beta1.Tx.MsgRequestBandIBCRatesResponse> getRequestBandIBCRatesMethod() {
    io.grpc.MethodDescriptor<injective.oracle.v1beta1.Tx.MsgRequestBandIBCRates, injective.oracle.v1beta1.Tx.MsgRequestBandIBCRatesResponse> getRequestBandIBCRatesMethod;
    if ((getRequestBandIBCRatesMethod = MsgGrpc.getRequestBandIBCRatesMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getRequestBandIBCRatesMethod = MsgGrpc.getRequestBandIBCRatesMethod) == null) {
          MsgGrpc.getRequestBandIBCRatesMethod = getRequestBandIBCRatesMethod =
              io.grpc.MethodDescriptor.<injective.oracle.v1beta1.Tx.MsgRequestBandIBCRates, injective.oracle.v1beta1.Tx.MsgRequestBandIBCRatesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "RequestBandIBCRates"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  injective.oracle.v1beta1.Tx.MsgRequestBandIBCRates.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  injective.oracle.v1beta1.Tx.MsgRequestBandIBCRatesResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("RequestBandIBCRates"))
              .build();
        }
      }
    }
    return getRequestBandIBCRatesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<injective.oracle.v1beta1.Tx.MsgRelayCoinbaseMessages,
      injective.oracle.v1beta1.Tx.MsgRelayCoinbaseMessagesResponse> getRelayCoinbaseMessagesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "RelayCoinbaseMessages",
      requestType = injective.oracle.v1beta1.Tx.MsgRelayCoinbaseMessages.class,
      responseType = injective.oracle.v1beta1.Tx.MsgRelayCoinbaseMessagesResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<injective.oracle.v1beta1.Tx.MsgRelayCoinbaseMessages,
      injective.oracle.v1beta1.Tx.MsgRelayCoinbaseMessagesResponse> getRelayCoinbaseMessagesMethod() {
    io.grpc.MethodDescriptor<injective.oracle.v1beta1.Tx.MsgRelayCoinbaseMessages, injective.oracle.v1beta1.Tx.MsgRelayCoinbaseMessagesResponse> getRelayCoinbaseMessagesMethod;
    if ((getRelayCoinbaseMessagesMethod = MsgGrpc.getRelayCoinbaseMessagesMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getRelayCoinbaseMessagesMethod = MsgGrpc.getRelayCoinbaseMessagesMethod) == null) {
          MsgGrpc.getRelayCoinbaseMessagesMethod = getRelayCoinbaseMessagesMethod =
              io.grpc.MethodDescriptor.<injective.oracle.v1beta1.Tx.MsgRelayCoinbaseMessages, injective.oracle.v1beta1.Tx.MsgRelayCoinbaseMessagesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "RelayCoinbaseMessages"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  injective.oracle.v1beta1.Tx.MsgRelayCoinbaseMessages.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  injective.oracle.v1beta1.Tx.MsgRelayCoinbaseMessagesResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("RelayCoinbaseMessages"))
              .build();
        }
      }
    }
    return getRelayCoinbaseMessagesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<injective.oracle.v1beta1.Tx.MsgRelayPythPrices,
      injective.oracle.v1beta1.Tx.MsgRelayPythPricesResponse> getRelayPythPricesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "RelayPythPrices",
      requestType = injective.oracle.v1beta1.Tx.MsgRelayPythPrices.class,
      responseType = injective.oracle.v1beta1.Tx.MsgRelayPythPricesResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<injective.oracle.v1beta1.Tx.MsgRelayPythPrices,
      injective.oracle.v1beta1.Tx.MsgRelayPythPricesResponse> getRelayPythPricesMethod() {
    io.grpc.MethodDescriptor<injective.oracle.v1beta1.Tx.MsgRelayPythPrices, injective.oracle.v1beta1.Tx.MsgRelayPythPricesResponse> getRelayPythPricesMethod;
    if ((getRelayPythPricesMethod = MsgGrpc.getRelayPythPricesMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getRelayPythPricesMethod = MsgGrpc.getRelayPythPricesMethod) == null) {
          MsgGrpc.getRelayPythPricesMethod = getRelayPythPricesMethod =
              io.grpc.MethodDescriptor.<injective.oracle.v1beta1.Tx.MsgRelayPythPrices, injective.oracle.v1beta1.Tx.MsgRelayPythPricesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "RelayPythPrices"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  injective.oracle.v1beta1.Tx.MsgRelayPythPrices.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  injective.oracle.v1beta1.Tx.MsgRelayPythPricesResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("RelayPythPrices"))
              .build();
        }
      }
    }
    return getRelayPythPricesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<injective.oracle.v1beta1.Tx.MsgUpdateParams,
      injective.oracle.v1beta1.Tx.MsgUpdateParamsResponse> getUpdateParamsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateParams",
      requestType = injective.oracle.v1beta1.Tx.MsgUpdateParams.class,
      responseType = injective.oracle.v1beta1.Tx.MsgUpdateParamsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<injective.oracle.v1beta1.Tx.MsgUpdateParams,
      injective.oracle.v1beta1.Tx.MsgUpdateParamsResponse> getUpdateParamsMethod() {
    io.grpc.MethodDescriptor<injective.oracle.v1beta1.Tx.MsgUpdateParams, injective.oracle.v1beta1.Tx.MsgUpdateParamsResponse> getUpdateParamsMethod;
    if ((getUpdateParamsMethod = MsgGrpc.getUpdateParamsMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getUpdateParamsMethod = MsgGrpc.getUpdateParamsMethod) == null) {
          MsgGrpc.getUpdateParamsMethod = getUpdateParamsMethod =
              io.grpc.MethodDescriptor.<injective.oracle.v1beta1.Tx.MsgUpdateParams, injective.oracle.v1beta1.Tx.MsgUpdateParamsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateParams"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  injective.oracle.v1beta1.Tx.MsgUpdateParams.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  injective.oracle.v1beta1.Tx.MsgUpdateParamsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("UpdateParams"))
              .build();
        }
      }
    }
    return getUpdateParamsMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static MsgStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<MsgStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<MsgStub>() {
        @java.lang.Override
        public MsgStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new MsgStub(channel, callOptions);
        }
      };
    return MsgStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static MsgBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<MsgBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<MsgBlockingStub>() {
        @java.lang.Override
        public MsgBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new MsgBlockingStub(channel, callOptions);
        }
      };
    return MsgBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static MsgFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<MsgFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<MsgFutureStub>() {
        @java.lang.Override
        public MsgFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new MsgFutureStub(channel, callOptions);
        }
      };
    return MsgFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * Msg defines the oracle Msg service.
   * </pre>
   */
  public interface AsyncService {

    /**
     * <pre>
     * RelayProviderPrice defines a method for relaying a price for a
     * provider-based oracle
     * </pre>
     */
    default void relayProviderPrices(injective.oracle.v1beta1.Tx.MsgRelayProviderPrices request,
        io.grpc.stub.StreamObserver<injective.oracle.v1beta1.Tx.MsgRelayProviderPricesResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getRelayProviderPricesMethod(), responseObserver);
    }

    /**
     * <pre>
     * RelayPriceFeedPrice defines a method for relaying a price for a price
     * feeder-based oracle
     * </pre>
     */
    default void relayPriceFeedPrice(injective.oracle.v1beta1.Tx.MsgRelayPriceFeedPrice request,
        io.grpc.stub.StreamObserver<injective.oracle.v1beta1.Tx.MsgRelayPriceFeedPriceResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getRelayPriceFeedPriceMethod(), responseObserver);
    }

    /**
     * <pre>
     * RelayBandRates defines a method for relaying rates from Band
     * </pre>
     */
    default void relayBandRates(injective.oracle.v1beta1.Tx.MsgRelayBandRates request,
        io.grpc.stub.StreamObserver<injective.oracle.v1beta1.Tx.MsgRelayBandRatesResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getRelayBandRatesMethod(), responseObserver);
    }

    /**
     * <pre>
     * RequestBandIBCRates defines a method for fetching rates from Band ibc
     * </pre>
     */
    default void requestBandIBCRates(injective.oracle.v1beta1.Tx.MsgRequestBandIBCRates request,
        io.grpc.stub.StreamObserver<injective.oracle.v1beta1.Tx.MsgRequestBandIBCRatesResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getRequestBandIBCRatesMethod(), responseObserver);
    }

    /**
     * <pre>
     * RelayCoinbaseMessages defines a method for relaying price messages from
     * Coinbase API
     * </pre>
     */
    default void relayCoinbaseMessages(injective.oracle.v1beta1.Tx.MsgRelayCoinbaseMessages request,
        io.grpc.stub.StreamObserver<injective.oracle.v1beta1.Tx.MsgRelayCoinbaseMessagesResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getRelayCoinbaseMessagesMethod(), responseObserver);
    }

    /**
     * <pre>
     * RelayPythPrices defines a method for relaying rates from the Pyth contract
     * </pre>
     */
    default void relayPythPrices(injective.oracle.v1beta1.Tx.MsgRelayPythPrices request,
        io.grpc.stub.StreamObserver<injective.oracle.v1beta1.Tx.MsgRelayPythPricesResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getRelayPythPricesMethod(), responseObserver);
    }

    /**
     * <pre>
     *  UpdateParams enables updating oracle module's params via governance
     * </pre>
     */
    default void updateParams(injective.oracle.v1beta1.Tx.MsgUpdateParams request,
        io.grpc.stub.StreamObserver<injective.oracle.v1beta1.Tx.MsgUpdateParamsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateParamsMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service Msg.
   * <pre>
   * Msg defines the oracle Msg service.
   * </pre>
   */
  public static abstract class MsgImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return MsgGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service Msg.
   * <pre>
   * Msg defines the oracle Msg service.
   * </pre>
   */
  public static final class MsgStub
      extends io.grpc.stub.AbstractAsyncStub<MsgStub> {
    private MsgStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected MsgStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new MsgStub(channel, callOptions);
    }

    /**
     * <pre>
     * RelayProviderPrice defines a method for relaying a price for a
     * provider-based oracle
     * </pre>
     */
    public void relayProviderPrices(injective.oracle.v1beta1.Tx.MsgRelayProviderPrices request,
        io.grpc.stub.StreamObserver<injective.oracle.v1beta1.Tx.MsgRelayProviderPricesResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getRelayProviderPricesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * RelayPriceFeedPrice defines a method for relaying a price for a price
     * feeder-based oracle
     * </pre>
     */
    public void relayPriceFeedPrice(injective.oracle.v1beta1.Tx.MsgRelayPriceFeedPrice request,
        io.grpc.stub.StreamObserver<injective.oracle.v1beta1.Tx.MsgRelayPriceFeedPriceResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getRelayPriceFeedPriceMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * RelayBandRates defines a method for relaying rates from Band
     * </pre>
     */
    public void relayBandRates(injective.oracle.v1beta1.Tx.MsgRelayBandRates request,
        io.grpc.stub.StreamObserver<injective.oracle.v1beta1.Tx.MsgRelayBandRatesResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getRelayBandRatesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * RequestBandIBCRates defines a method for fetching rates from Band ibc
     * </pre>
     */
    public void requestBandIBCRates(injective.oracle.v1beta1.Tx.MsgRequestBandIBCRates request,
        io.grpc.stub.StreamObserver<injective.oracle.v1beta1.Tx.MsgRequestBandIBCRatesResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getRequestBandIBCRatesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * RelayCoinbaseMessages defines a method for relaying price messages from
     * Coinbase API
     * </pre>
     */
    public void relayCoinbaseMessages(injective.oracle.v1beta1.Tx.MsgRelayCoinbaseMessages request,
        io.grpc.stub.StreamObserver<injective.oracle.v1beta1.Tx.MsgRelayCoinbaseMessagesResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getRelayCoinbaseMessagesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * RelayPythPrices defines a method for relaying rates from the Pyth contract
     * </pre>
     */
    public void relayPythPrices(injective.oracle.v1beta1.Tx.MsgRelayPythPrices request,
        io.grpc.stub.StreamObserver<injective.oracle.v1beta1.Tx.MsgRelayPythPricesResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getRelayPythPricesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     *  UpdateParams enables updating oracle module's params via governance
     * </pre>
     */
    public void updateParams(injective.oracle.v1beta1.Tx.MsgUpdateParams request,
        io.grpc.stub.StreamObserver<injective.oracle.v1beta1.Tx.MsgUpdateParamsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateParamsMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service Msg.
   * <pre>
   * Msg defines the oracle Msg service.
   * </pre>
   */
  public static final class MsgBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<MsgBlockingStub> {
    private MsgBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected MsgBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new MsgBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * RelayProviderPrice defines a method for relaying a price for a
     * provider-based oracle
     * </pre>
     */
    public injective.oracle.v1beta1.Tx.MsgRelayProviderPricesResponse relayProviderPrices(injective.oracle.v1beta1.Tx.MsgRelayProviderPrices request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getRelayProviderPricesMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * RelayPriceFeedPrice defines a method for relaying a price for a price
     * feeder-based oracle
     * </pre>
     */
    public injective.oracle.v1beta1.Tx.MsgRelayPriceFeedPriceResponse relayPriceFeedPrice(injective.oracle.v1beta1.Tx.MsgRelayPriceFeedPrice request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getRelayPriceFeedPriceMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * RelayBandRates defines a method for relaying rates from Band
     * </pre>
     */
    public injective.oracle.v1beta1.Tx.MsgRelayBandRatesResponse relayBandRates(injective.oracle.v1beta1.Tx.MsgRelayBandRates request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getRelayBandRatesMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * RequestBandIBCRates defines a method for fetching rates from Band ibc
     * </pre>
     */
    public injective.oracle.v1beta1.Tx.MsgRequestBandIBCRatesResponse requestBandIBCRates(injective.oracle.v1beta1.Tx.MsgRequestBandIBCRates request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getRequestBandIBCRatesMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * RelayCoinbaseMessages defines a method for relaying price messages from
     * Coinbase API
     * </pre>
     */
    public injective.oracle.v1beta1.Tx.MsgRelayCoinbaseMessagesResponse relayCoinbaseMessages(injective.oracle.v1beta1.Tx.MsgRelayCoinbaseMessages request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getRelayCoinbaseMessagesMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * RelayPythPrices defines a method for relaying rates from the Pyth contract
     * </pre>
     */
    public injective.oracle.v1beta1.Tx.MsgRelayPythPricesResponse relayPythPrices(injective.oracle.v1beta1.Tx.MsgRelayPythPrices request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getRelayPythPricesMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     *  UpdateParams enables updating oracle module's params via governance
     * </pre>
     */
    public injective.oracle.v1beta1.Tx.MsgUpdateParamsResponse updateParams(injective.oracle.v1beta1.Tx.MsgUpdateParams request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateParamsMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service Msg.
   * <pre>
   * Msg defines the oracle Msg service.
   * </pre>
   */
  public static final class MsgFutureStub
      extends io.grpc.stub.AbstractFutureStub<MsgFutureStub> {
    private MsgFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected MsgFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new MsgFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * RelayProviderPrice defines a method for relaying a price for a
     * provider-based oracle
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<injective.oracle.v1beta1.Tx.MsgRelayProviderPricesResponse> relayProviderPrices(
        injective.oracle.v1beta1.Tx.MsgRelayProviderPrices request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getRelayProviderPricesMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * RelayPriceFeedPrice defines a method for relaying a price for a price
     * feeder-based oracle
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<injective.oracle.v1beta1.Tx.MsgRelayPriceFeedPriceResponse> relayPriceFeedPrice(
        injective.oracle.v1beta1.Tx.MsgRelayPriceFeedPrice request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getRelayPriceFeedPriceMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * RelayBandRates defines a method for relaying rates from Band
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<injective.oracle.v1beta1.Tx.MsgRelayBandRatesResponse> relayBandRates(
        injective.oracle.v1beta1.Tx.MsgRelayBandRates request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getRelayBandRatesMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * RequestBandIBCRates defines a method for fetching rates from Band ibc
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<injective.oracle.v1beta1.Tx.MsgRequestBandIBCRatesResponse> requestBandIBCRates(
        injective.oracle.v1beta1.Tx.MsgRequestBandIBCRates request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getRequestBandIBCRatesMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * RelayCoinbaseMessages defines a method for relaying price messages from
     * Coinbase API
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<injective.oracle.v1beta1.Tx.MsgRelayCoinbaseMessagesResponse> relayCoinbaseMessages(
        injective.oracle.v1beta1.Tx.MsgRelayCoinbaseMessages request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getRelayCoinbaseMessagesMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * RelayPythPrices defines a method for relaying rates from the Pyth contract
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<injective.oracle.v1beta1.Tx.MsgRelayPythPricesResponse> relayPythPrices(
        injective.oracle.v1beta1.Tx.MsgRelayPythPrices request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getRelayPythPricesMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     *  UpdateParams enables updating oracle module's params via governance
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<injective.oracle.v1beta1.Tx.MsgUpdateParamsResponse> updateParams(
        injective.oracle.v1beta1.Tx.MsgUpdateParams request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateParamsMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_RELAY_PROVIDER_PRICES = 0;
  private static final int METHODID_RELAY_PRICE_FEED_PRICE = 1;
  private static final int METHODID_RELAY_BAND_RATES = 2;
  private static final int METHODID_REQUEST_BAND_IBCRATES = 3;
  private static final int METHODID_RELAY_COINBASE_MESSAGES = 4;
  private static final int METHODID_RELAY_PYTH_PRICES = 5;
  private static final int METHODID_UPDATE_PARAMS = 6;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final AsyncService serviceImpl;
    private final int methodId;

    MethodHandlers(AsyncService serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_RELAY_PROVIDER_PRICES:
          serviceImpl.relayProviderPrices((injective.oracle.v1beta1.Tx.MsgRelayProviderPrices) request,
              (io.grpc.stub.StreamObserver<injective.oracle.v1beta1.Tx.MsgRelayProviderPricesResponse>) responseObserver);
          break;
        case METHODID_RELAY_PRICE_FEED_PRICE:
          serviceImpl.relayPriceFeedPrice((injective.oracle.v1beta1.Tx.MsgRelayPriceFeedPrice) request,
              (io.grpc.stub.StreamObserver<injective.oracle.v1beta1.Tx.MsgRelayPriceFeedPriceResponse>) responseObserver);
          break;
        case METHODID_RELAY_BAND_RATES:
          serviceImpl.relayBandRates((injective.oracle.v1beta1.Tx.MsgRelayBandRates) request,
              (io.grpc.stub.StreamObserver<injective.oracle.v1beta1.Tx.MsgRelayBandRatesResponse>) responseObserver);
          break;
        case METHODID_REQUEST_BAND_IBCRATES:
          serviceImpl.requestBandIBCRates((injective.oracle.v1beta1.Tx.MsgRequestBandIBCRates) request,
              (io.grpc.stub.StreamObserver<injective.oracle.v1beta1.Tx.MsgRequestBandIBCRatesResponse>) responseObserver);
          break;
        case METHODID_RELAY_COINBASE_MESSAGES:
          serviceImpl.relayCoinbaseMessages((injective.oracle.v1beta1.Tx.MsgRelayCoinbaseMessages) request,
              (io.grpc.stub.StreamObserver<injective.oracle.v1beta1.Tx.MsgRelayCoinbaseMessagesResponse>) responseObserver);
          break;
        case METHODID_RELAY_PYTH_PRICES:
          serviceImpl.relayPythPrices((injective.oracle.v1beta1.Tx.MsgRelayPythPrices) request,
              (io.grpc.stub.StreamObserver<injective.oracle.v1beta1.Tx.MsgRelayPythPricesResponse>) responseObserver);
          break;
        case METHODID_UPDATE_PARAMS:
          serviceImpl.updateParams((injective.oracle.v1beta1.Tx.MsgUpdateParams) request,
              (io.grpc.stub.StreamObserver<injective.oracle.v1beta1.Tx.MsgUpdateParamsResponse>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }
  }

  public static final io.grpc.ServerServiceDefinition bindService(AsyncService service) {
    return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
        .addMethod(
          getRelayProviderPricesMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              injective.oracle.v1beta1.Tx.MsgRelayProviderPrices,
              injective.oracle.v1beta1.Tx.MsgRelayProviderPricesResponse>(
                service, METHODID_RELAY_PROVIDER_PRICES)))
        .addMethod(
          getRelayPriceFeedPriceMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              injective.oracle.v1beta1.Tx.MsgRelayPriceFeedPrice,
              injective.oracle.v1beta1.Tx.MsgRelayPriceFeedPriceResponse>(
                service, METHODID_RELAY_PRICE_FEED_PRICE)))
        .addMethod(
          getRelayBandRatesMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              injective.oracle.v1beta1.Tx.MsgRelayBandRates,
              injective.oracle.v1beta1.Tx.MsgRelayBandRatesResponse>(
                service, METHODID_RELAY_BAND_RATES)))
        .addMethod(
          getRequestBandIBCRatesMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              injective.oracle.v1beta1.Tx.MsgRequestBandIBCRates,
              injective.oracle.v1beta1.Tx.MsgRequestBandIBCRatesResponse>(
                service, METHODID_REQUEST_BAND_IBCRATES)))
        .addMethod(
          getRelayCoinbaseMessagesMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              injective.oracle.v1beta1.Tx.MsgRelayCoinbaseMessages,
              injective.oracle.v1beta1.Tx.MsgRelayCoinbaseMessagesResponse>(
                service, METHODID_RELAY_COINBASE_MESSAGES)))
        .addMethod(
          getRelayPythPricesMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              injective.oracle.v1beta1.Tx.MsgRelayPythPrices,
              injective.oracle.v1beta1.Tx.MsgRelayPythPricesResponse>(
                service, METHODID_RELAY_PYTH_PRICES)))
        .addMethod(
          getUpdateParamsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              injective.oracle.v1beta1.Tx.MsgUpdateParams,
              injective.oracle.v1beta1.Tx.MsgUpdateParamsResponse>(
                service, METHODID_UPDATE_PARAMS)))
        .build();
  }

  private static abstract class MsgBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    MsgBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return injective.oracle.v1beta1.Tx.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("Msg");
    }
  }

  private static final class MsgFileDescriptorSupplier
      extends MsgBaseDescriptorSupplier {
    MsgFileDescriptorSupplier() {}
  }

  private static final class MsgMethodDescriptorSupplier
      extends MsgBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    MsgMethodDescriptorSupplier(String methodName) {
      this.methodName = methodName;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (MsgGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new MsgFileDescriptorSupplier())
              .addMethod(getRelayProviderPricesMethod())
              .addMethod(getRelayPriceFeedPriceMethod())
              .addMethod(getRelayBandRatesMethod())
              .addMethod(getRequestBandIBCRatesMethod())
              .addMethod(getRelayCoinbaseMessagesMethod())
              .addMethod(getRelayPythPricesMethod())
              .addMethod(getUpdateParamsMethod())
              .build();
        }
      }
    }
    return result;
  }
}
