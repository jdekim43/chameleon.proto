// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: cosmos/base/node/v1beta1/query.proto

package cosmos.base.node.v1beta1;

public final class Query {
  private Query() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface ConfigRequestOrBuilder extends
      // @@protoc_insertion_point(interface_extends:cosmos.base.node.v1beta1.ConfigRequest)
      com.google.protobuf.MessageOrBuilder {
  }
  /**
   * <pre>
   * ConfigRequest defines the request structure for the Config gRPC query.
   * </pre>
   *
   * Protobuf type {@code cosmos.base.node.v1beta1.ConfigRequest}
   */
  public static final class ConfigRequest extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:cosmos.base.node.v1beta1.ConfigRequest)
      ConfigRequestOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use ConfigRequest.newBuilder() to construct.
    private ConfigRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private ConfigRequest() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new ConfigRequest();
    }

    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return cosmos.base.node.v1beta1.Query.internal_static_cosmos_base_node_v1beta1_ConfigRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return cosmos.base.node.v1beta1.Query.internal_static_cosmos_base_node_v1beta1_ConfigRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              cosmos.base.node.v1beta1.Query.ConfigRequest.class, cosmos.base.node.v1beta1.Query.ConfigRequest.Builder.class);
    }

    private byte memoizedIsInitialized = -1;
    @java.lang.Override
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      memoizedIsInitialized = 1;
      return true;
    }

    @java.lang.Override
    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      size += getUnknownFields().getSerializedSize();
      memoizedSize = size;
      return size;
    }

    @java.lang.Override
    public boolean equals(final java.lang.Object obj) {
      if (obj == this) {
       return true;
      }
      if (!(obj instanceof cosmos.base.node.v1beta1.Query.ConfigRequest)) {
        return super.equals(obj);
      }
      cosmos.base.node.v1beta1.Query.ConfigRequest other = (cosmos.base.node.v1beta1.Query.ConfigRequest) obj;

      if (!getUnknownFields().equals(other.getUnknownFields())) return false;
      return true;
    }

    @java.lang.Override
    public int hashCode() {
      if (memoizedHashCode != 0) {
        return memoizedHashCode;
      }
      int hash = 41;
      hash = (19 * hash) + getDescriptor().hashCode();
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static cosmos.base.node.v1beta1.Query.ConfigRequest parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static cosmos.base.node.v1beta1.Query.ConfigRequest parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static cosmos.base.node.v1beta1.Query.ConfigRequest parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static cosmos.base.node.v1beta1.Query.ConfigRequest parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static cosmos.base.node.v1beta1.Query.ConfigRequest parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static cosmos.base.node.v1beta1.Query.ConfigRequest parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static cosmos.base.node.v1beta1.Query.ConfigRequest parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static cosmos.base.node.v1beta1.Query.ConfigRequest parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static cosmos.base.node.v1beta1.Query.ConfigRequest parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static cosmos.base.node.v1beta1.Query.ConfigRequest parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static cosmos.base.node.v1beta1.Query.ConfigRequest parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static cosmos.base.node.v1beta1.Query.ConfigRequest parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    @java.lang.Override
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
    }
    public static Builder newBuilder(cosmos.base.node.v1beta1.Query.ConfigRequest prototype) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }
    @java.lang.Override
    public Builder toBuilder() {
      return this == DEFAULT_INSTANCE
          ? new Builder() : new Builder().mergeFrom(this);
    }

    @java.lang.Override
    protected Builder newBuilderForType(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    /**
     * <pre>
     * ConfigRequest defines the request structure for the Config gRPC query.
     * </pre>
     *
     * Protobuf type {@code cosmos.base.node.v1beta1.ConfigRequest}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:cosmos.base.node.v1beta1.ConfigRequest)
        cosmos.base.node.v1beta1.Query.ConfigRequestOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return cosmos.base.node.v1beta1.Query.internal_static_cosmos_base_node_v1beta1_ConfigRequest_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return cosmos.base.node.v1beta1.Query.internal_static_cosmos_base_node_v1beta1_ConfigRequest_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                cosmos.base.node.v1beta1.Query.ConfigRequest.class, cosmos.base.node.v1beta1.Query.ConfigRequest.Builder.class);
      }

      // Construct using cosmos.base.node.v1beta1.Query.ConfigRequest.newBuilder()
      private Builder() {

      }

      private Builder(
          com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);

      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return cosmos.base.node.v1beta1.Query.internal_static_cosmos_base_node_v1beta1_ConfigRequest_descriptor;
      }

      @java.lang.Override
      public cosmos.base.node.v1beta1.Query.ConfigRequest getDefaultInstanceForType() {
        return cosmos.base.node.v1beta1.Query.ConfigRequest.getDefaultInstance();
      }

      @java.lang.Override
      public cosmos.base.node.v1beta1.Query.ConfigRequest build() {
        cosmos.base.node.v1beta1.Query.ConfigRequest result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public cosmos.base.node.v1beta1.Query.ConfigRequest buildPartial() {
        cosmos.base.node.v1beta1.Query.ConfigRequest result = new cosmos.base.node.v1beta1.Query.ConfigRequest(this);
        onBuilt();
        return result;
      }

      @java.lang.Override
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof cosmos.base.node.v1beta1.Query.ConfigRequest) {
          return mergeFrom((cosmos.base.node.v1beta1.Query.ConfigRequest)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(cosmos.base.node.v1beta1.Query.ConfigRequest other) {
        if (other == cosmos.base.node.v1beta1.Query.ConfigRequest.getDefaultInstance()) return this;
        this.mergeUnknownFields(other.getUnknownFields());
        onChanged();
        return this;
      }

      @java.lang.Override
      public final boolean isInitialized() {
        return true;
      }

      @java.lang.Override
      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        if (extensionRegistry == null) {
          throw new java.lang.NullPointerException();
        }
        try {
          boolean done = false;
          while (!done) {
            int tag = input.readTag();
            switch (tag) {
              case 0:
                done = true;
                break;
              default: {
                if (!super.parseUnknownField(input, extensionRegistry, tag)) {
                  done = true; // was an endgroup tag
                }
                break;
              } // default:
            } // switch (tag)
          } // while (!done)
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          throw e.unwrapIOException();
        } finally {
          onChanged();
        } // finally
        return this;
      }
      @java.lang.Override
      public final Builder setUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.setUnknownFields(unknownFields);
      }

      @java.lang.Override
      public final Builder mergeUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.mergeUnknownFields(unknownFields);
      }


      // @@protoc_insertion_point(builder_scope:cosmos.base.node.v1beta1.ConfigRequest)
    }

    // @@protoc_insertion_point(class_scope:cosmos.base.node.v1beta1.ConfigRequest)
    private static final cosmos.base.node.v1beta1.Query.ConfigRequest DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new cosmos.base.node.v1beta1.Query.ConfigRequest();
    }

    public static cosmos.base.node.v1beta1.Query.ConfigRequest getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<ConfigRequest>
        PARSER = new com.google.protobuf.AbstractParser<ConfigRequest>() {
      @java.lang.Override
      public ConfigRequest parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        Builder builder = newBuilder();
        try {
          builder.mergeFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          throw e.setUnfinishedMessage(builder.buildPartial());
        } catch (com.google.protobuf.UninitializedMessageException e) {
          throw e.asInvalidProtocolBufferException().setUnfinishedMessage(builder.buildPartial());
        } catch (java.io.IOException e) {
          throw new com.google.protobuf.InvalidProtocolBufferException(e)
              .setUnfinishedMessage(builder.buildPartial());
        }
        return builder.buildPartial();
      }
    };

    public static com.google.protobuf.Parser<ConfigRequest> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<ConfigRequest> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public cosmos.base.node.v1beta1.Query.ConfigRequest getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  public interface ConfigResponseOrBuilder extends
      // @@protoc_insertion_point(interface_extends:cosmos.base.node.v1beta1.ConfigResponse)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>string minimum_gas_price = 1;</code>
     * @return The minimumGasPrice.
     */
    java.lang.String getMinimumGasPrice();
    /**
     * <code>string minimum_gas_price = 1;</code>
     * @return The bytes for minimumGasPrice.
     */
    com.google.protobuf.ByteString
        getMinimumGasPriceBytes();
  }
  /**
   * <pre>
   * ConfigResponse defines the response structure for the Config gRPC query.
   * </pre>
   *
   * Protobuf type {@code cosmos.base.node.v1beta1.ConfigResponse}
   */
  public static final class ConfigResponse extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:cosmos.base.node.v1beta1.ConfigResponse)
      ConfigResponseOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use ConfigResponse.newBuilder() to construct.
    private ConfigResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private ConfigResponse() {
      minimumGasPrice_ = "";
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new ConfigResponse();
    }

    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return cosmos.base.node.v1beta1.Query.internal_static_cosmos_base_node_v1beta1_ConfigResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return cosmos.base.node.v1beta1.Query.internal_static_cosmos_base_node_v1beta1_ConfigResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              cosmos.base.node.v1beta1.Query.ConfigResponse.class, cosmos.base.node.v1beta1.Query.ConfigResponse.Builder.class);
    }

    public static final int MINIMUM_GAS_PRICE_FIELD_NUMBER = 1;
    @SuppressWarnings("serial")
    private volatile java.lang.Object minimumGasPrice_ = "";
    /**
     * <code>string minimum_gas_price = 1;</code>
     * @return The minimumGasPrice.
     */
    @java.lang.Override
    public java.lang.String getMinimumGasPrice() {
      java.lang.Object ref = minimumGasPrice_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        minimumGasPrice_ = s;
        return s;
      }
    }
    /**
     * <code>string minimum_gas_price = 1;</code>
     * @return The bytes for minimumGasPrice.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString
        getMinimumGasPriceBytes() {
      java.lang.Object ref = minimumGasPrice_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        minimumGasPrice_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    private byte memoizedIsInitialized = -1;
    @java.lang.Override
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      memoizedIsInitialized = 1;
      return true;
    }

    @java.lang.Override
    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(minimumGasPrice_)) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 1, minimumGasPrice_);
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(minimumGasPrice_)) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, minimumGasPrice_);
      }
      size += getUnknownFields().getSerializedSize();
      memoizedSize = size;
      return size;
    }

    @java.lang.Override
    public boolean equals(final java.lang.Object obj) {
      if (obj == this) {
       return true;
      }
      if (!(obj instanceof cosmos.base.node.v1beta1.Query.ConfigResponse)) {
        return super.equals(obj);
      }
      cosmos.base.node.v1beta1.Query.ConfigResponse other = (cosmos.base.node.v1beta1.Query.ConfigResponse) obj;

      if (!getMinimumGasPrice()
          .equals(other.getMinimumGasPrice())) return false;
      if (!getUnknownFields().equals(other.getUnknownFields())) return false;
      return true;
    }

    @java.lang.Override
    public int hashCode() {
      if (memoizedHashCode != 0) {
        return memoizedHashCode;
      }
      int hash = 41;
      hash = (19 * hash) + getDescriptor().hashCode();
      hash = (37 * hash) + MINIMUM_GAS_PRICE_FIELD_NUMBER;
      hash = (53 * hash) + getMinimumGasPrice().hashCode();
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static cosmos.base.node.v1beta1.Query.ConfigResponse parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static cosmos.base.node.v1beta1.Query.ConfigResponse parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static cosmos.base.node.v1beta1.Query.ConfigResponse parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static cosmos.base.node.v1beta1.Query.ConfigResponse parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static cosmos.base.node.v1beta1.Query.ConfigResponse parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static cosmos.base.node.v1beta1.Query.ConfigResponse parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static cosmos.base.node.v1beta1.Query.ConfigResponse parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static cosmos.base.node.v1beta1.Query.ConfigResponse parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static cosmos.base.node.v1beta1.Query.ConfigResponse parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static cosmos.base.node.v1beta1.Query.ConfigResponse parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static cosmos.base.node.v1beta1.Query.ConfigResponse parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static cosmos.base.node.v1beta1.Query.ConfigResponse parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    @java.lang.Override
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
    }
    public static Builder newBuilder(cosmos.base.node.v1beta1.Query.ConfigResponse prototype) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }
    @java.lang.Override
    public Builder toBuilder() {
      return this == DEFAULT_INSTANCE
          ? new Builder() : new Builder().mergeFrom(this);
    }

    @java.lang.Override
    protected Builder newBuilderForType(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    /**
     * <pre>
     * ConfigResponse defines the response structure for the Config gRPC query.
     * </pre>
     *
     * Protobuf type {@code cosmos.base.node.v1beta1.ConfigResponse}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:cosmos.base.node.v1beta1.ConfigResponse)
        cosmos.base.node.v1beta1.Query.ConfigResponseOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return cosmos.base.node.v1beta1.Query.internal_static_cosmos_base_node_v1beta1_ConfigResponse_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return cosmos.base.node.v1beta1.Query.internal_static_cosmos_base_node_v1beta1_ConfigResponse_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                cosmos.base.node.v1beta1.Query.ConfigResponse.class, cosmos.base.node.v1beta1.Query.ConfigResponse.Builder.class);
      }

      // Construct using cosmos.base.node.v1beta1.Query.ConfigResponse.newBuilder()
      private Builder() {

      }

      private Builder(
          com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);

      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        bitField0_ = 0;
        minimumGasPrice_ = "";
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return cosmos.base.node.v1beta1.Query.internal_static_cosmos_base_node_v1beta1_ConfigResponse_descriptor;
      }

      @java.lang.Override
      public cosmos.base.node.v1beta1.Query.ConfigResponse getDefaultInstanceForType() {
        return cosmos.base.node.v1beta1.Query.ConfigResponse.getDefaultInstance();
      }

      @java.lang.Override
      public cosmos.base.node.v1beta1.Query.ConfigResponse build() {
        cosmos.base.node.v1beta1.Query.ConfigResponse result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public cosmos.base.node.v1beta1.Query.ConfigResponse buildPartial() {
        cosmos.base.node.v1beta1.Query.ConfigResponse result = new cosmos.base.node.v1beta1.Query.ConfigResponse(this);
        if (bitField0_ != 0) { buildPartial0(result); }
        onBuilt();
        return result;
      }

      private void buildPartial0(cosmos.base.node.v1beta1.Query.ConfigResponse result) {
        int from_bitField0_ = bitField0_;
        if (((from_bitField0_ & 0x00000001) != 0)) {
          result.minimumGasPrice_ = minimumGasPrice_;
        }
      }

      @java.lang.Override
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof cosmos.base.node.v1beta1.Query.ConfigResponse) {
          return mergeFrom((cosmos.base.node.v1beta1.Query.ConfigResponse)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(cosmos.base.node.v1beta1.Query.ConfigResponse other) {
        if (other == cosmos.base.node.v1beta1.Query.ConfigResponse.getDefaultInstance()) return this;
        if (!other.getMinimumGasPrice().isEmpty()) {
          minimumGasPrice_ = other.minimumGasPrice_;
          bitField0_ |= 0x00000001;
          onChanged();
        }
        this.mergeUnknownFields(other.getUnknownFields());
        onChanged();
        return this;
      }

      @java.lang.Override
      public final boolean isInitialized() {
        return true;
      }

      @java.lang.Override
      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        if (extensionRegistry == null) {
          throw new java.lang.NullPointerException();
        }
        try {
          boolean done = false;
          while (!done) {
            int tag = input.readTag();
            switch (tag) {
              case 0:
                done = true;
                break;
              case 10: {
                minimumGasPrice_ = input.readStringRequireUtf8();
                bitField0_ |= 0x00000001;
                break;
              } // case 10
              default: {
                if (!super.parseUnknownField(input, extensionRegistry, tag)) {
                  done = true; // was an endgroup tag
                }
                break;
              } // default:
            } // switch (tag)
          } // while (!done)
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          throw e.unwrapIOException();
        } finally {
          onChanged();
        } // finally
        return this;
      }
      private int bitField0_;

      private java.lang.Object minimumGasPrice_ = "";
      /**
       * <code>string minimum_gas_price = 1;</code>
       * @return The minimumGasPrice.
       */
      public java.lang.String getMinimumGasPrice() {
        java.lang.Object ref = minimumGasPrice_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          minimumGasPrice_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>string minimum_gas_price = 1;</code>
       * @return The bytes for minimumGasPrice.
       */
      public com.google.protobuf.ByteString
          getMinimumGasPriceBytes() {
        java.lang.Object ref = minimumGasPrice_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          minimumGasPrice_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>string minimum_gas_price = 1;</code>
       * @param value The minimumGasPrice to set.
       * @return This builder for chaining.
       */
      public Builder setMinimumGasPrice(
          java.lang.String value) {
        if (value == null) { throw new NullPointerException(); }
        minimumGasPrice_ = value;
        bitField0_ |= 0x00000001;
        onChanged();
        return this;
      }
      /**
       * <code>string minimum_gas_price = 1;</code>
       * @return This builder for chaining.
       */
      public Builder clearMinimumGasPrice() {
        minimumGasPrice_ = getDefaultInstance().getMinimumGasPrice();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
        return this;
      }
      /**
       * <code>string minimum_gas_price = 1;</code>
       * @param value The bytes for minimumGasPrice to set.
       * @return This builder for chaining.
       */
      public Builder setMinimumGasPriceBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) { throw new NullPointerException(); }
        checkByteStringIsUtf8(value);
        minimumGasPrice_ = value;
        bitField0_ |= 0x00000001;
        onChanged();
        return this;
      }
      @java.lang.Override
      public final Builder setUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.setUnknownFields(unknownFields);
      }

      @java.lang.Override
      public final Builder mergeUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.mergeUnknownFields(unknownFields);
      }


      // @@protoc_insertion_point(builder_scope:cosmos.base.node.v1beta1.ConfigResponse)
    }

    // @@protoc_insertion_point(class_scope:cosmos.base.node.v1beta1.ConfigResponse)
    private static final cosmos.base.node.v1beta1.Query.ConfigResponse DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new cosmos.base.node.v1beta1.Query.ConfigResponse();
    }

    public static cosmos.base.node.v1beta1.Query.ConfigResponse getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<ConfigResponse>
        PARSER = new com.google.protobuf.AbstractParser<ConfigResponse>() {
      @java.lang.Override
      public ConfigResponse parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        Builder builder = newBuilder();
        try {
          builder.mergeFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          throw e.setUnfinishedMessage(builder.buildPartial());
        } catch (com.google.protobuf.UninitializedMessageException e) {
          throw e.asInvalidProtocolBufferException().setUnfinishedMessage(builder.buildPartial());
        } catch (java.io.IOException e) {
          throw new com.google.protobuf.InvalidProtocolBufferException(e)
              .setUnfinishedMessage(builder.buildPartial());
        }
        return builder.buildPartial();
      }
    };

    public static com.google.protobuf.Parser<ConfigResponse> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<ConfigResponse> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public cosmos.base.node.v1beta1.Query.ConfigResponse getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_cosmos_base_node_v1beta1_ConfigRequest_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_cosmos_base_node_v1beta1_ConfigRequest_fieldAccessorTable;
  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_cosmos_base_node_v1beta1_ConfigResponse_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_cosmos_base_node_v1beta1_ConfigResponse_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n$cosmos/base/node/v1beta1/query.proto\022\030" +
      "cosmos.base.node.v1beta1\032\034google/api/ann" +
      "otations.proto\"\017\n\rConfigRequest\"+\n\016Confi" +
      "gResponse\022\031\n\021minimum_gas_price\030\001 \001(\t2\221\001\n" +
      "\007Service\022\205\001\n\006Config\022\'.cosmos.base.node.v" +
      "1beta1.ConfigRequest\032(.cosmos.base.node." +
      "v1beta1.ConfigResponse\"(\202\323\344\223\002\"\022 /cosmos/" +
      "base/node/v1beta1/configB/Z-github.com/c" +
      "osmos/cosmos-sdk/client/grpc/nodeb\006proto" +
      "3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.api.AnnotationsProto.getDescriptor(),
        });
    internal_static_cosmos_base_node_v1beta1_ConfigRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_cosmos_base_node_v1beta1_ConfigRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_cosmos_base_node_v1beta1_ConfigRequest_descriptor,
        new java.lang.String[] { });
    internal_static_cosmos_base_node_v1beta1_ConfigResponse_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_cosmos_base_node_v1beta1_ConfigResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_cosmos_base_node_v1beta1_ConfigResponse_descriptor,
        new java.lang.String[] { "MinimumGasPrice", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.AnnotationsProto.http);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.google.api.AnnotationsProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
