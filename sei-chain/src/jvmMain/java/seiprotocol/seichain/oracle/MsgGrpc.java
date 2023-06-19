package seiprotocol.seichain.oracle;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * Msg defines the oracle Msg service.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.54.0)",
    comments = "Source: oracle/tx.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class MsgGrpc {

  private MsgGrpc() {}

  public static final String SERVICE_NAME = "seiprotocol.seichain.oracle.Msg";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<seiprotocol.seichain.oracle.Tx.MsgAggregateExchangeRateVote,
      seiprotocol.seichain.oracle.Tx.MsgAggregateExchangeRateVoteResponse> getAggregateExchangeRateVoteMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "AggregateExchangeRateVote",
      requestType = seiprotocol.seichain.oracle.Tx.MsgAggregateExchangeRateVote.class,
      responseType = seiprotocol.seichain.oracle.Tx.MsgAggregateExchangeRateVoteResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<seiprotocol.seichain.oracle.Tx.MsgAggregateExchangeRateVote,
      seiprotocol.seichain.oracle.Tx.MsgAggregateExchangeRateVoteResponse> getAggregateExchangeRateVoteMethod() {
    io.grpc.MethodDescriptor<seiprotocol.seichain.oracle.Tx.MsgAggregateExchangeRateVote, seiprotocol.seichain.oracle.Tx.MsgAggregateExchangeRateVoteResponse> getAggregateExchangeRateVoteMethod;
    if ((getAggregateExchangeRateVoteMethod = MsgGrpc.getAggregateExchangeRateVoteMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getAggregateExchangeRateVoteMethod = MsgGrpc.getAggregateExchangeRateVoteMethod) == null) {
          MsgGrpc.getAggregateExchangeRateVoteMethod = getAggregateExchangeRateVoteMethod =
              io.grpc.MethodDescriptor.<seiprotocol.seichain.oracle.Tx.MsgAggregateExchangeRateVote, seiprotocol.seichain.oracle.Tx.MsgAggregateExchangeRateVoteResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "AggregateExchangeRateVote"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  seiprotocol.seichain.oracle.Tx.MsgAggregateExchangeRateVote.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  seiprotocol.seichain.oracle.Tx.MsgAggregateExchangeRateVoteResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("AggregateExchangeRateVote"))
              .build();
        }
      }
    }
    return getAggregateExchangeRateVoteMethod;
  }

  private static volatile io.grpc.MethodDescriptor<seiprotocol.seichain.oracle.Tx.MsgDelegateFeedConsent,
      seiprotocol.seichain.oracle.Tx.MsgDelegateFeedConsentResponse> getDelegateFeedConsentMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DelegateFeedConsent",
      requestType = seiprotocol.seichain.oracle.Tx.MsgDelegateFeedConsent.class,
      responseType = seiprotocol.seichain.oracle.Tx.MsgDelegateFeedConsentResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<seiprotocol.seichain.oracle.Tx.MsgDelegateFeedConsent,
      seiprotocol.seichain.oracle.Tx.MsgDelegateFeedConsentResponse> getDelegateFeedConsentMethod() {
    io.grpc.MethodDescriptor<seiprotocol.seichain.oracle.Tx.MsgDelegateFeedConsent, seiprotocol.seichain.oracle.Tx.MsgDelegateFeedConsentResponse> getDelegateFeedConsentMethod;
    if ((getDelegateFeedConsentMethod = MsgGrpc.getDelegateFeedConsentMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getDelegateFeedConsentMethod = MsgGrpc.getDelegateFeedConsentMethod) == null) {
          MsgGrpc.getDelegateFeedConsentMethod = getDelegateFeedConsentMethod =
              io.grpc.MethodDescriptor.<seiprotocol.seichain.oracle.Tx.MsgDelegateFeedConsent, seiprotocol.seichain.oracle.Tx.MsgDelegateFeedConsentResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DelegateFeedConsent"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  seiprotocol.seichain.oracle.Tx.MsgDelegateFeedConsent.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  seiprotocol.seichain.oracle.Tx.MsgDelegateFeedConsentResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("DelegateFeedConsent"))
              .build();
        }
      }
    }
    return getDelegateFeedConsentMethod;
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
     * AggregateExchangeRateVote defines a method for submitting
     * aggregate exchange rate vote
     * </pre>
     */
    default void aggregateExchangeRateVote(seiprotocol.seichain.oracle.Tx.MsgAggregateExchangeRateVote request,
        io.grpc.stub.StreamObserver<seiprotocol.seichain.oracle.Tx.MsgAggregateExchangeRateVoteResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getAggregateExchangeRateVoteMethod(), responseObserver);
    }

    /**
     * <pre>
     * DelegateFeedConsent defines a method for setting the feeder delegation
     * </pre>
     */
    default void delegateFeedConsent(seiprotocol.seichain.oracle.Tx.MsgDelegateFeedConsent request,
        io.grpc.stub.StreamObserver<seiprotocol.seichain.oracle.Tx.MsgDelegateFeedConsentResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDelegateFeedConsentMethod(), responseObserver);
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
     * AggregateExchangeRateVote defines a method for submitting
     * aggregate exchange rate vote
     * </pre>
     */
    public void aggregateExchangeRateVote(seiprotocol.seichain.oracle.Tx.MsgAggregateExchangeRateVote request,
        io.grpc.stub.StreamObserver<seiprotocol.seichain.oracle.Tx.MsgAggregateExchangeRateVoteResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getAggregateExchangeRateVoteMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * DelegateFeedConsent defines a method for setting the feeder delegation
     * </pre>
     */
    public void delegateFeedConsent(seiprotocol.seichain.oracle.Tx.MsgDelegateFeedConsent request,
        io.grpc.stub.StreamObserver<seiprotocol.seichain.oracle.Tx.MsgDelegateFeedConsentResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDelegateFeedConsentMethod(), getCallOptions()), request, responseObserver);
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
     * AggregateExchangeRateVote defines a method for submitting
     * aggregate exchange rate vote
     * </pre>
     */
    public seiprotocol.seichain.oracle.Tx.MsgAggregateExchangeRateVoteResponse aggregateExchangeRateVote(seiprotocol.seichain.oracle.Tx.MsgAggregateExchangeRateVote request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getAggregateExchangeRateVoteMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * DelegateFeedConsent defines a method for setting the feeder delegation
     * </pre>
     */
    public seiprotocol.seichain.oracle.Tx.MsgDelegateFeedConsentResponse delegateFeedConsent(seiprotocol.seichain.oracle.Tx.MsgDelegateFeedConsent request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDelegateFeedConsentMethod(), getCallOptions(), request);
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
     * AggregateExchangeRateVote defines a method for submitting
     * aggregate exchange rate vote
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<seiprotocol.seichain.oracle.Tx.MsgAggregateExchangeRateVoteResponse> aggregateExchangeRateVote(
        seiprotocol.seichain.oracle.Tx.MsgAggregateExchangeRateVote request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getAggregateExchangeRateVoteMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * DelegateFeedConsent defines a method for setting the feeder delegation
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<seiprotocol.seichain.oracle.Tx.MsgDelegateFeedConsentResponse> delegateFeedConsent(
        seiprotocol.seichain.oracle.Tx.MsgDelegateFeedConsent request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDelegateFeedConsentMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_AGGREGATE_EXCHANGE_RATE_VOTE = 0;
  private static final int METHODID_DELEGATE_FEED_CONSENT = 1;

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
        case METHODID_AGGREGATE_EXCHANGE_RATE_VOTE:
          serviceImpl.aggregateExchangeRateVote((seiprotocol.seichain.oracle.Tx.MsgAggregateExchangeRateVote) request,
              (io.grpc.stub.StreamObserver<seiprotocol.seichain.oracle.Tx.MsgAggregateExchangeRateVoteResponse>) responseObserver);
          break;
        case METHODID_DELEGATE_FEED_CONSENT:
          serviceImpl.delegateFeedConsent((seiprotocol.seichain.oracle.Tx.MsgDelegateFeedConsent) request,
              (io.grpc.stub.StreamObserver<seiprotocol.seichain.oracle.Tx.MsgDelegateFeedConsentResponse>) responseObserver);
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
          getAggregateExchangeRateVoteMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              seiprotocol.seichain.oracle.Tx.MsgAggregateExchangeRateVote,
              seiprotocol.seichain.oracle.Tx.MsgAggregateExchangeRateVoteResponse>(
                service, METHODID_AGGREGATE_EXCHANGE_RATE_VOTE)))
        .addMethod(
          getDelegateFeedConsentMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              seiprotocol.seichain.oracle.Tx.MsgDelegateFeedConsent,
              seiprotocol.seichain.oracle.Tx.MsgDelegateFeedConsentResponse>(
                service, METHODID_DELEGATE_FEED_CONSENT)))
        .build();
  }

  private static abstract class MsgBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    MsgBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return seiprotocol.seichain.oracle.Tx.getDescriptor();
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
              .addMethod(getAggregateExchangeRateVoteMethod())
              .addMethod(getDelegateFeedConsentMethod())
              .build();
        }
      }
    }
    return result;
  }
}
