// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: terra/market/v1beta1/market.proto

package terra.market.v1beta1;

public final class Market {
  private Market() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface ParamsOrBuilder extends
      // @@protoc_insertion_point(interface_extends:terra.market.v1beta1.Params)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>bytes base_pool = 1 [(.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Dec", (.gogoproto.moretags) = "yaml:&#92;"base_pool&#92;""];</code>
     * @return The basePool.
     */
    com.google.protobuf.ByteString getBasePool();

    /**
     * <code>uint64 pool_recovery_period = 2 [(.gogoproto.moretags) = "yaml:&#92;"pool_recovery_period&#92;""];</code>
     * @return The poolRecoveryPeriod.
     */
    long getPoolRecoveryPeriod();

    /**
     * <code>bytes min_stability_spread = 3 [(.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Dec", (.gogoproto.moretags) = "yaml:&#92;"min_stability_spread&#92;""];</code>
     * @return The minStabilitySpread.
     */
    com.google.protobuf.ByteString getMinStabilitySpread();
  }
  /**
   * <pre>
   * Params defines the parameters for the market module.
   * </pre>
   *
   * Protobuf type {@code terra.market.v1beta1.Params}
   */
  public static final class Params extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:terra.market.v1beta1.Params)
      ParamsOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use Params.newBuilder() to construct.
    private Params(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private Params() {
      basePool_ = com.google.protobuf.ByteString.EMPTY;
      minStabilitySpread_ = com.google.protobuf.ByteString.EMPTY;
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new Params();
    }

    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return terra.market.v1beta1.Market.internal_static_terra_market_v1beta1_Params_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return terra.market.v1beta1.Market.internal_static_terra_market_v1beta1_Params_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              terra.market.v1beta1.Market.Params.class, terra.market.v1beta1.Market.Params.Builder.class);
    }

    public static final int BASE_POOL_FIELD_NUMBER = 1;
    private com.google.protobuf.ByteString basePool_ = com.google.protobuf.ByteString.EMPTY;
    /**
     * <code>bytes base_pool = 1 [(.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Dec", (.gogoproto.moretags) = "yaml:&#92;"base_pool&#92;""];</code>
     * @return The basePool.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString getBasePool() {
      return basePool_;
    }

    public static final int POOL_RECOVERY_PERIOD_FIELD_NUMBER = 2;
    private long poolRecoveryPeriod_ = 0L;
    /**
     * <code>uint64 pool_recovery_period = 2 [(.gogoproto.moretags) = "yaml:&#92;"pool_recovery_period&#92;""];</code>
     * @return The poolRecoveryPeriod.
     */
    @java.lang.Override
    public long getPoolRecoveryPeriod() {
      return poolRecoveryPeriod_;
    }

    public static final int MIN_STABILITY_SPREAD_FIELD_NUMBER = 3;
    private com.google.protobuf.ByteString minStabilitySpread_ = com.google.protobuf.ByteString.EMPTY;
    /**
     * <code>bytes min_stability_spread = 3 [(.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Dec", (.gogoproto.moretags) = "yaml:&#92;"min_stability_spread&#92;""];</code>
     * @return The minStabilitySpread.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString getMinStabilitySpread() {
      return minStabilitySpread_;
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
      if (!basePool_.isEmpty()) {
        output.writeBytes(1, basePool_);
      }
      if (poolRecoveryPeriod_ != 0L) {
        output.writeUInt64(2, poolRecoveryPeriod_);
      }
      if (!minStabilitySpread_.isEmpty()) {
        output.writeBytes(3, minStabilitySpread_);
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (!basePool_.isEmpty()) {
        size += com.google.protobuf.CodedOutputStream
          .computeBytesSize(1, basePool_);
      }
      if (poolRecoveryPeriod_ != 0L) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt64Size(2, poolRecoveryPeriod_);
      }
      if (!minStabilitySpread_.isEmpty()) {
        size += com.google.protobuf.CodedOutputStream
          .computeBytesSize(3, minStabilitySpread_);
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
      if (!(obj instanceof terra.market.v1beta1.Market.Params)) {
        return super.equals(obj);
      }
      terra.market.v1beta1.Market.Params other = (terra.market.v1beta1.Market.Params) obj;

      if (!getBasePool()
          .equals(other.getBasePool())) return false;
      if (getPoolRecoveryPeriod()
          != other.getPoolRecoveryPeriod()) return false;
      if (!getMinStabilitySpread()
          .equals(other.getMinStabilitySpread())) return false;
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
      hash = (37 * hash) + BASE_POOL_FIELD_NUMBER;
      hash = (53 * hash) + getBasePool().hashCode();
      hash = (37 * hash) + POOL_RECOVERY_PERIOD_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
          getPoolRecoveryPeriod());
      hash = (37 * hash) + MIN_STABILITY_SPREAD_FIELD_NUMBER;
      hash = (53 * hash) + getMinStabilitySpread().hashCode();
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static terra.market.v1beta1.Market.Params parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static terra.market.v1beta1.Market.Params parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static terra.market.v1beta1.Market.Params parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static terra.market.v1beta1.Market.Params parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static terra.market.v1beta1.Market.Params parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static terra.market.v1beta1.Market.Params parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static terra.market.v1beta1.Market.Params parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static terra.market.v1beta1.Market.Params parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static terra.market.v1beta1.Market.Params parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static terra.market.v1beta1.Market.Params parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static terra.market.v1beta1.Market.Params parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static terra.market.v1beta1.Market.Params parseFrom(
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
    public static Builder newBuilder(terra.market.v1beta1.Market.Params prototype) {
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
     * Params defines the parameters for the market module.
     * </pre>
     *
     * Protobuf type {@code terra.market.v1beta1.Params}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:terra.market.v1beta1.Params)
        terra.market.v1beta1.Market.ParamsOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return terra.market.v1beta1.Market.internal_static_terra_market_v1beta1_Params_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return terra.market.v1beta1.Market.internal_static_terra_market_v1beta1_Params_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                terra.market.v1beta1.Market.Params.class, terra.market.v1beta1.Market.Params.Builder.class);
      }

      // Construct using terra.market.v1beta1.Market.Params.newBuilder()
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
        basePool_ = com.google.protobuf.ByteString.EMPTY;
        poolRecoveryPeriod_ = 0L;
        minStabilitySpread_ = com.google.protobuf.ByteString.EMPTY;
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return terra.market.v1beta1.Market.internal_static_terra_market_v1beta1_Params_descriptor;
      }

      @java.lang.Override
      public terra.market.v1beta1.Market.Params getDefaultInstanceForType() {
        return terra.market.v1beta1.Market.Params.getDefaultInstance();
      }

      @java.lang.Override
      public terra.market.v1beta1.Market.Params build() {
        terra.market.v1beta1.Market.Params result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public terra.market.v1beta1.Market.Params buildPartial() {
        terra.market.v1beta1.Market.Params result = new terra.market.v1beta1.Market.Params(this);
        if (bitField0_ != 0) { buildPartial0(result); }
        onBuilt();
        return result;
      }

      private void buildPartial0(terra.market.v1beta1.Market.Params result) {
        int from_bitField0_ = bitField0_;
        if (((from_bitField0_ & 0x00000001) != 0)) {
          result.basePool_ = basePool_;
        }
        if (((from_bitField0_ & 0x00000002) != 0)) {
          result.poolRecoveryPeriod_ = poolRecoveryPeriod_;
        }
        if (((from_bitField0_ & 0x00000004) != 0)) {
          result.minStabilitySpread_ = minStabilitySpread_;
        }
      }

      @java.lang.Override
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof terra.market.v1beta1.Market.Params) {
          return mergeFrom((terra.market.v1beta1.Market.Params)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(terra.market.v1beta1.Market.Params other) {
        if (other == terra.market.v1beta1.Market.Params.getDefaultInstance()) return this;
        if (other.getBasePool() != com.google.protobuf.ByteString.EMPTY) {
          setBasePool(other.getBasePool());
        }
        if (other.getPoolRecoveryPeriod() != 0L) {
          setPoolRecoveryPeriod(other.getPoolRecoveryPeriod());
        }
        if (other.getMinStabilitySpread() != com.google.protobuf.ByteString.EMPTY) {
          setMinStabilitySpread(other.getMinStabilitySpread());
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
                basePool_ = input.readBytes();
                bitField0_ |= 0x00000001;
                break;
              } // case 10
              case 16: {
                poolRecoveryPeriod_ = input.readUInt64();
                bitField0_ |= 0x00000002;
                break;
              } // case 16
              case 26: {
                minStabilitySpread_ = input.readBytes();
                bitField0_ |= 0x00000004;
                break;
              } // case 26
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

      private com.google.protobuf.ByteString basePool_ = com.google.protobuf.ByteString.EMPTY;
      /**
       * <code>bytes base_pool = 1 [(.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Dec", (.gogoproto.moretags) = "yaml:&#92;"base_pool&#92;""];</code>
       * @return The basePool.
       */
      @java.lang.Override
      public com.google.protobuf.ByteString getBasePool() {
        return basePool_;
      }
      /**
       * <code>bytes base_pool = 1 [(.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Dec", (.gogoproto.moretags) = "yaml:&#92;"base_pool&#92;""];</code>
       * @param value The basePool to set.
       * @return This builder for chaining.
       */
      public Builder setBasePool(com.google.protobuf.ByteString value) {
        if (value == null) { throw new NullPointerException(); }
        basePool_ = value;
        bitField0_ |= 0x00000001;
        onChanged();
        return this;
      }
      /**
       * <code>bytes base_pool = 1 [(.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Dec", (.gogoproto.moretags) = "yaml:&#92;"base_pool&#92;""];</code>
       * @return This builder for chaining.
       */
      public Builder clearBasePool() {
        bitField0_ = (bitField0_ & ~0x00000001);
        basePool_ = getDefaultInstance().getBasePool();
        onChanged();
        return this;
      }

      private long poolRecoveryPeriod_ ;
      /**
       * <code>uint64 pool_recovery_period = 2 [(.gogoproto.moretags) = "yaml:&#92;"pool_recovery_period&#92;""];</code>
       * @return The poolRecoveryPeriod.
       */
      @java.lang.Override
      public long getPoolRecoveryPeriod() {
        return poolRecoveryPeriod_;
      }
      /**
       * <code>uint64 pool_recovery_period = 2 [(.gogoproto.moretags) = "yaml:&#92;"pool_recovery_period&#92;""];</code>
       * @param value The poolRecoveryPeriod to set.
       * @return This builder for chaining.
       */
      public Builder setPoolRecoveryPeriod(long value) {

        poolRecoveryPeriod_ = value;
        bitField0_ |= 0x00000002;
        onChanged();
        return this;
      }
      /**
       * <code>uint64 pool_recovery_period = 2 [(.gogoproto.moretags) = "yaml:&#92;"pool_recovery_period&#92;""];</code>
       * @return This builder for chaining.
       */
      public Builder clearPoolRecoveryPeriod() {
        bitField0_ = (bitField0_ & ~0x00000002);
        poolRecoveryPeriod_ = 0L;
        onChanged();
        return this;
      }

      private com.google.protobuf.ByteString minStabilitySpread_ = com.google.protobuf.ByteString.EMPTY;
      /**
       * <code>bytes min_stability_spread = 3 [(.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Dec", (.gogoproto.moretags) = "yaml:&#92;"min_stability_spread&#92;""];</code>
       * @return The minStabilitySpread.
       */
      @java.lang.Override
      public com.google.protobuf.ByteString getMinStabilitySpread() {
        return minStabilitySpread_;
      }
      /**
       * <code>bytes min_stability_spread = 3 [(.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Dec", (.gogoproto.moretags) = "yaml:&#92;"min_stability_spread&#92;""];</code>
       * @param value The minStabilitySpread to set.
       * @return This builder for chaining.
       */
      public Builder setMinStabilitySpread(com.google.protobuf.ByteString value) {
        if (value == null) { throw new NullPointerException(); }
        minStabilitySpread_ = value;
        bitField0_ |= 0x00000004;
        onChanged();
        return this;
      }
      /**
       * <code>bytes min_stability_spread = 3 [(.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Dec", (.gogoproto.moretags) = "yaml:&#92;"min_stability_spread&#92;""];</code>
       * @return This builder for chaining.
       */
      public Builder clearMinStabilitySpread() {
        bitField0_ = (bitField0_ & ~0x00000004);
        minStabilitySpread_ = getDefaultInstance().getMinStabilitySpread();
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


      // @@protoc_insertion_point(builder_scope:terra.market.v1beta1.Params)
    }

    // @@protoc_insertion_point(class_scope:terra.market.v1beta1.Params)
    private static final terra.market.v1beta1.Market.Params DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new terra.market.v1beta1.Market.Params();
    }

    public static terra.market.v1beta1.Market.Params getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<Params>
        PARSER = new com.google.protobuf.AbstractParser<Params>() {
      @java.lang.Override
      public Params parsePartialFrom(
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

    public static com.google.protobuf.Parser<Params> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<Params> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public terra.market.v1beta1.Market.Params getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_terra_market_v1beta1_Params_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_terra_market_v1beta1_Params_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n!terra/market/v1beta1/market.proto\022\024ter" +
      "ra.market.v1beta1\032\024gogoproto/gogo.proto\"" +
      "\225\002\n\006Params\022U\n\tbase_pool\030\001 \001(\014BB\310\336\037\000\332\336\037&g" +
      "ithub.com/cosmos/cosmos-sdk/types.Dec\362\336\037" +
      "\020yaml:\"base_pool\"\022=\n\024pool_recovery_perio" +
      "d\030\002 \001(\004B\037\362\336\037\033yaml:\"pool_recovery_period\"" +
      "\022k\n\024min_stability_spread\030\003 \001(\014BM\310\336\037\000\332\336\037&" +
      "github.com/cosmos/cosmos-sdk/types.Dec\362\336" +
      "\037\033yaml:\"min_stability_spread\":\010\230\240\037\000\350\240\037\001B" +
      ".Z,github.com/classic-terra/core/x/marke" +
      "t/typesb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.protobuf.GoGoProtos.getDescriptor(),
        });
    internal_static_terra_market_v1beta1_Params_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_terra_market_v1beta1_Params_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_terra_market_v1beta1_Params_descriptor,
        new java.lang.String[] { "BasePool", "PoolRecoveryPeriod", "MinStabilitySpread", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.protobuf.GoGoProtos.customtype);
    registry.add(com.google.protobuf.GoGoProtos.equal);
    registry.add(com.google.protobuf.GoGoProtos.goprotoStringer);
    registry.add(com.google.protobuf.GoGoProtos.moretags);
    registry.add(com.google.protobuf.GoGoProtos.nullable);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.google.protobuf.GoGoProtos.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
