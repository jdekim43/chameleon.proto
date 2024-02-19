// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: injective/auction/v1beta1/genesis.proto

package injective.auction.v1beta1;

public final class Genesis {
  private Genesis() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface GenesisStateOrBuilder extends
      // @@protoc_insertion_point(interface_extends:injective.auction.v1beta1.GenesisState)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <pre>
     * params defines all the parameters of related to auction.
     * </pre>
     *
     * <code>.injective.auction.v1beta1.Params params = 1 [(.gogoproto.nullable) = false];</code>
     * @return Whether the params field is set.
     */
    boolean hasParams();
    /**
     * <pre>
     * params defines all the parameters of related to auction.
     * </pre>
     *
     * <code>.injective.auction.v1beta1.Params params = 1 [(.gogoproto.nullable) = false];</code>
     * @return The params.
     */
    injective.auction.v1beta1.Auction.Params getParams();
    /**
     * <pre>
     * params defines all the parameters of related to auction.
     * </pre>
     *
     * <code>.injective.auction.v1beta1.Params params = 1 [(.gogoproto.nullable) = false];</code>
     */
    injective.auction.v1beta1.Auction.ParamsOrBuilder getParamsOrBuilder();

    /**
     * <pre>
     * current auction round
     * </pre>
     *
     * <code>uint64 auction_round = 2;</code>
     * @return The auctionRound.
     */
    long getAuctionRound();

    /**
     * <pre>
     * current highest bid
     * </pre>
     *
     * <code>.injective.auction.v1beta1.Bid highest_bid = 3;</code>
     * @return Whether the highestBid field is set.
     */
    boolean hasHighestBid();
    /**
     * <pre>
     * current highest bid
     * </pre>
     *
     * <code>.injective.auction.v1beta1.Bid highest_bid = 3;</code>
     * @return The highestBid.
     */
    injective.auction.v1beta1.Auction.Bid getHighestBid();
    /**
     * <pre>
     * current highest bid
     * </pre>
     *
     * <code>.injective.auction.v1beta1.Bid highest_bid = 3;</code>
     */
    injective.auction.v1beta1.Auction.BidOrBuilder getHighestBidOrBuilder();

    /**
     * <pre>
     * auction ending timestamp
     * </pre>
     *
     * <code>int64 auction_ending_timestamp = 4;</code>
     * @return The auctionEndingTimestamp.
     */
    long getAuctionEndingTimestamp();
  }
  /**
   * <pre>
   * GenesisState defines the auction module's genesis state.
   * </pre>
   *
   * Protobuf type {@code injective.auction.v1beta1.GenesisState}
   */
  public static final class GenesisState extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:injective.auction.v1beta1.GenesisState)
      GenesisStateOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use GenesisState.newBuilder() to construct.
    private GenesisState(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private GenesisState() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new GenesisState();
    }

    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return injective.auction.v1beta1.Genesis.internal_static_injective_auction_v1beta1_GenesisState_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return injective.auction.v1beta1.Genesis.internal_static_injective_auction_v1beta1_GenesisState_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              injective.auction.v1beta1.Genesis.GenesisState.class, injective.auction.v1beta1.Genesis.GenesisState.Builder.class);
    }

    public static final int PARAMS_FIELD_NUMBER = 1;
    private injective.auction.v1beta1.Auction.Params params_;
    /**
     * <pre>
     * params defines all the parameters of related to auction.
     * </pre>
     *
     * <code>.injective.auction.v1beta1.Params params = 1 [(.gogoproto.nullable) = false];</code>
     * @return Whether the params field is set.
     */
    @java.lang.Override
    public boolean hasParams() {
      return params_ != null;
    }
    /**
     * <pre>
     * params defines all the parameters of related to auction.
     * </pre>
     *
     * <code>.injective.auction.v1beta1.Params params = 1 [(.gogoproto.nullable) = false];</code>
     * @return The params.
     */
    @java.lang.Override
    public injective.auction.v1beta1.Auction.Params getParams() {
      return params_ == null ? injective.auction.v1beta1.Auction.Params.getDefaultInstance() : params_;
    }
    /**
     * <pre>
     * params defines all the parameters of related to auction.
     * </pre>
     *
     * <code>.injective.auction.v1beta1.Params params = 1 [(.gogoproto.nullable) = false];</code>
     */
    @java.lang.Override
    public injective.auction.v1beta1.Auction.ParamsOrBuilder getParamsOrBuilder() {
      return params_ == null ? injective.auction.v1beta1.Auction.Params.getDefaultInstance() : params_;
    }

    public static final int AUCTION_ROUND_FIELD_NUMBER = 2;
    private long auctionRound_ = 0L;
    /**
     * <pre>
     * current auction round
     * </pre>
     *
     * <code>uint64 auction_round = 2;</code>
     * @return The auctionRound.
     */
    @java.lang.Override
    public long getAuctionRound() {
      return auctionRound_;
    }

    public static final int HIGHEST_BID_FIELD_NUMBER = 3;
    private injective.auction.v1beta1.Auction.Bid highestBid_;
    /**
     * <pre>
     * current highest bid
     * </pre>
     *
     * <code>.injective.auction.v1beta1.Bid highest_bid = 3;</code>
     * @return Whether the highestBid field is set.
     */
    @java.lang.Override
    public boolean hasHighestBid() {
      return highestBid_ != null;
    }
    /**
     * <pre>
     * current highest bid
     * </pre>
     *
     * <code>.injective.auction.v1beta1.Bid highest_bid = 3;</code>
     * @return The highestBid.
     */
    @java.lang.Override
    public injective.auction.v1beta1.Auction.Bid getHighestBid() {
      return highestBid_ == null ? injective.auction.v1beta1.Auction.Bid.getDefaultInstance() : highestBid_;
    }
    /**
     * <pre>
     * current highest bid
     * </pre>
     *
     * <code>.injective.auction.v1beta1.Bid highest_bid = 3;</code>
     */
    @java.lang.Override
    public injective.auction.v1beta1.Auction.BidOrBuilder getHighestBidOrBuilder() {
      return highestBid_ == null ? injective.auction.v1beta1.Auction.Bid.getDefaultInstance() : highestBid_;
    }

    public static final int AUCTION_ENDING_TIMESTAMP_FIELD_NUMBER = 4;
    private long auctionEndingTimestamp_ = 0L;
    /**
     * <pre>
     * auction ending timestamp
     * </pre>
     *
     * <code>int64 auction_ending_timestamp = 4;</code>
     * @return The auctionEndingTimestamp.
     */
    @java.lang.Override
    public long getAuctionEndingTimestamp() {
      return auctionEndingTimestamp_;
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
      if (params_ != null) {
        output.writeMessage(1, getParams());
      }
      if (auctionRound_ != 0L) {
        output.writeUInt64(2, auctionRound_);
      }
      if (highestBid_ != null) {
        output.writeMessage(3, getHighestBid());
      }
      if (auctionEndingTimestamp_ != 0L) {
        output.writeInt64(4, auctionEndingTimestamp_);
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (params_ != null) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(1, getParams());
      }
      if (auctionRound_ != 0L) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt64Size(2, auctionRound_);
      }
      if (highestBid_ != null) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(3, getHighestBid());
      }
      if (auctionEndingTimestamp_ != 0L) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt64Size(4, auctionEndingTimestamp_);
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
      if (!(obj instanceof injective.auction.v1beta1.Genesis.GenesisState)) {
        return super.equals(obj);
      }
      injective.auction.v1beta1.Genesis.GenesisState other = (injective.auction.v1beta1.Genesis.GenesisState) obj;

      if (hasParams() != other.hasParams()) return false;
      if (hasParams()) {
        if (!getParams()
            .equals(other.getParams())) return false;
      }
      if (getAuctionRound()
          != other.getAuctionRound()) return false;
      if (hasHighestBid() != other.hasHighestBid()) return false;
      if (hasHighestBid()) {
        if (!getHighestBid()
            .equals(other.getHighestBid())) return false;
      }
      if (getAuctionEndingTimestamp()
          != other.getAuctionEndingTimestamp()) return false;
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
      if (hasParams()) {
        hash = (37 * hash) + PARAMS_FIELD_NUMBER;
        hash = (53 * hash) + getParams().hashCode();
      }
      hash = (37 * hash) + AUCTION_ROUND_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
          getAuctionRound());
      if (hasHighestBid()) {
        hash = (37 * hash) + HIGHEST_BID_FIELD_NUMBER;
        hash = (53 * hash) + getHighestBid().hashCode();
      }
      hash = (37 * hash) + AUCTION_ENDING_TIMESTAMP_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
          getAuctionEndingTimestamp());
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static injective.auction.v1beta1.Genesis.GenesisState parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static injective.auction.v1beta1.Genesis.GenesisState parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static injective.auction.v1beta1.Genesis.GenesisState parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static injective.auction.v1beta1.Genesis.GenesisState parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static injective.auction.v1beta1.Genesis.GenesisState parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static injective.auction.v1beta1.Genesis.GenesisState parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static injective.auction.v1beta1.Genesis.GenesisState parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static injective.auction.v1beta1.Genesis.GenesisState parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static injective.auction.v1beta1.Genesis.GenesisState parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static injective.auction.v1beta1.Genesis.GenesisState parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static injective.auction.v1beta1.Genesis.GenesisState parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static injective.auction.v1beta1.Genesis.GenesisState parseFrom(
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
    public static Builder newBuilder(injective.auction.v1beta1.Genesis.GenesisState prototype) {
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
     * GenesisState defines the auction module's genesis state.
     * </pre>
     *
     * Protobuf type {@code injective.auction.v1beta1.GenesisState}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:injective.auction.v1beta1.GenesisState)
        injective.auction.v1beta1.Genesis.GenesisStateOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return injective.auction.v1beta1.Genesis.internal_static_injective_auction_v1beta1_GenesisState_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return injective.auction.v1beta1.Genesis.internal_static_injective_auction_v1beta1_GenesisState_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                injective.auction.v1beta1.Genesis.GenesisState.class, injective.auction.v1beta1.Genesis.GenesisState.Builder.class);
      }

      // Construct using injective.auction.v1beta1.Genesis.GenesisState.newBuilder()
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
        params_ = null;
        if (paramsBuilder_ != null) {
          paramsBuilder_.dispose();
          paramsBuilder_ = null;
        }
        auctionRound_ = 0L;
        highestBid_ = null;
        if (highestBidBuilder_ != null) {
          highestBidBuilder_.dispose();
          highestBidBuilder_ = null;
        }
        auctionEndingTimestamp_ = 0L;
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return injective.auction.v1beta1.Genesis.internal_static_injective_auction_v1beta1_GenesisState_descriptor;
      }

      @java.lang.Override
      public injective.auction.v1beta1.Genesis.GenesisState getDefaultInstanceForType() {
        return injective.auction.v1beta1.Genesis.GenesisState.getDefaultInstance();
      }

      @java.lang.Override
      public injective.auction.v1beta1.Genesis.GenesisState build() {
        injective.auction.v1beta1.Genesis.GenesisState result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public injective.auction.v1beta1.Genesis.GenesisState buildPartial() {
        injective.auction.v1beta1.Genesis.GenesisState result = new injective.auction.v1beta1.Genesis.GenesisState(this);
        if (bitField0_ != 0) { buildPartial0(result); }
        onBuilt();
        return result;
      }

      private void buildPartial0(injective.auction.v1beta1.Genesis.GenesisState result) {
        int from_bitField0_ = bitField0_;
        if (((from_bitField0_ & 0x00000001) != 0)) {
          result.params_ = paramsBuilder_ == null
              ? params_
              : paramsBuilder_.build();
        }
        if (((from_bitField0_ & 0x00000002) != 0)) {
          result.auctionRound_ = auctionRound_;
        }
        if (((from_bitField0_ & 0x00000004) != 0)) {
          result.highestBid_ = highestBidBuilder_ == null
              ? highestBid_
              : highestBidBuilder_.build();
        }
        if (((from_bitField0_ & 0x00000008) != 0)) {
          result.auctionEndingTimestamp_ = auctionEndingTimestamp_;
        }
      }

      @java.lang.Override
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof injective.auction.v1beta1.Genesis.GenesisState) {
          return mergeFrom((injective.auction.v1beta1.Genesis.GenesisState)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(injective.auction.v1beta1.Genesis.GenesisState other) {
        if (other == injective.auction.v1beta1.Genesis.GenesisState.getDefaultInstance()) return this;
        if (other.hasParams()) {
          mergeParams(other.getParams());
        }
        if (other.getAuctionRound() != 0L) {
          setAuctionRound(other.getAuctionRound());
        }
        if (other.hasHighestBid()) {
          mergeHighestBid(other.getHighestBid());
        }
        if (other.getAuctionEndingTimestamp() != 0L) {
          setAuctionEndingTimestamp(other.getAuctionEndingTimestamp());
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
                input.readMessage(
                    getParamsFieldBuilder().getBuilder(),
                    extensionRegistry);
                bitField0_ |= 0x00000001;
                break;
              } // case 10
              case 16: {
                auctionRound_ = input.readUInt64();
                bitField0_ |= 0x00000002;
                break;
              } // case 16
              case 26: {
                input.readMessage(
                    getHighestBidFieldBuilder().getBuilder(),
                    extensionRegistry);
                bitField0_ |= 0x00000004;
                break;
              } // case 26
              case 32: {
                auctionEndingTimestamp_ = input.readInt64();
                bitField0_ |= 0x00000008;
                break;
              } // case 32
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

      private injective.auction.v1beta1.Auction.Params params_;
      private com.google.protobuf.SingleFieldBuilderV3<
          injective.auction.v1beta1.Auction.Params, injective.auction.v1beta1.Auction.Params.Builder, injective.auction.v1beta1.Auction.ParamsOrBuilder> paramsBuilder_;
      /**
       * <pre>
       * params defines all the parameters of related to auction.
       * </pre>
       *
       * <code>.injective.auction.v1beta1.Params params = 1 [(.gogoproto.nullable) = false];</code>
       * @return Whether the params field is set.
       */
      public boolean hasParams() {
        return ((bitField0_ & 0x00000001) != 0);
      }
      /**
       * <pre>
       * params defines all the parameters of related to auction.
       * </pre>
       *
       * <code>.injective.auction.v1beta1.Params params = 1 [(.gogoproto.nullable) = false];</code>
       * @return The params.
       */
      public injective.auction.v1beta1.Auction.Params getParams() {
        if (paramsBuilder_ == null) {
          return params_ == null ? injective.auction.v1beta1.Auction.Params.getDefaultInstance() : params_;
        } else {
          return paramsBuilder_.getMessage();
        }
      }
      /**
       * <pre>
       * params defines all the parameters of related to auction.
       * </pre>
       *
       * <code>.injective.auction.v1beta1.Params params = 1 [(.gogoproto.nullable) = false];</code>
       */
      public Builder setParams(injective.auction.v1beta1.Auction.Params value) {
        if (paramsBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          params_ = value;
        } else {
          paramsBuilder_.setMessage(value);
        }
        bitField0_ |= 0x00000001;
        onChanged();
        return this;
      }
      /**
       * <pre>
       * params defines all the parameters of related to auction.
       * </pre>
       *
       * <code>.injective.auction.v1beta1.Params params = 1 [(.gogoproto.nullable) = false];</code>
       */
      public Builder setParams(
          injective.auction.v1beta1.Auction.Params.Builder builderForValue) {
        if (paramsBuilder_ == null) {
          params_ = builderForValue.build();
        } else {
          paramsBuilder_.setMessage(builderForValue.build());
        }
        bitField0_ |= 0x00000001;
        onChanged();
        return this;
      }
      /**
       * <pre>
       * params defines all the parameters of related to auction.
       * </pre>
       *
       * <code>.injective.auction.v1beta1.Params params = 1 [(.gogoproto.nullable) = false];</code>
       */
      public Builder mergeParams(injective.auction.v1beta1.Auction.Params value) {
        if (paramsBuilder_ == null) {
          if (((bitField0_ & 0x00000001) != 0) &&
            params_ != null &&
            params_ != injective.auction.v1beta1.Auction.Params.getDefaultInstance()) {
            getParamsBuilder().mergeFrom(value);
          } else {
            params_ = value;
          }
        } else {
          paramsBuilder_.mergeFrom(value);
        }
        bitField0_ |= 0x00000001;
        onChanged();
        return this;
      }
      /**
       * <pre>
       * params defines all the parameters of related to auction.
       * </pre>
       *
       * <code>.injective.auction.v1beta1.Params params = 1 [(.gogoproto.nullable) = false];</code>
       */
      public Builder clearParams() {
        bitField0_ = (bitField0_ & ~0x00000001);
        params_ = null;
        if (paramsBuilder_ != null) {
          paramsBuilder_.dispose();
          paramsBuilder_ = null;
        }
        onChanged();
        return this;
      }
      /**
       * <pre>
       * params defines all the parameters of related to auction.
       * </pre>
       *
       * <code>.injective.auction.v1beta1.Params params = 1 [(.gogoproto.nullable) = false];</code>
       */
      public injective.auction.v1beta1.Auction.Params.Builder getParamsBuilder() {
        bitField0_ |= 0x00000001;
        onChanged();
        return getParamsFieldBuilder().getBuilder();
      }
      /**
       * <pre>
       * params defines all the parameters of related to auction.
       * </pre>
       *
       * <code>.injective.auction.v1beta1.Params params = 1 [(.gogoproto.nullable) = false];</code>
       */
      public injective.auction.v1beta1.Auction.ParamsOrBuilder getParamsOrBuilder() {
        if (paramsBuilder_ != null) {
          return paramsBuilder_.getMessageOrBuilder();
        } else {
          return params_ == null ?
              injective.auction.v1beta1.Auction.Params.getDefaultInstance() : params_;
        }
      }
      /**
       * <pre>
       * params defines all the parameters of related to auction.
       * </pre>
       *
       * <code>.injective.auction.v1beta1.Params params = 1 [(.gogoproto.nullable) = false];</code>
       */
      private com.google.protobuf.SingleFieldBuilderV3<
          injective.auction.v1beta1.Auction.Params, injective.auction.v1beta1.Auction.Params.Builder, injective.auction.v1beta1.Auction.ParamsOrBuilder> 
          getParamsFieldBuilder() {
        if (paramsBuilder_ == null) {
          paramsBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
              injective.auction.v1beta1.Auction.Params, injective.auction.v1beta1.Auction.Params.Builder, injective.auction.v1beta1.Auction.ParamsOrBuilder>(
                  getParams(),
                  getParentForChildren(),
                  isClean());
          params_ = null;
        }
        return paramsBuilder_;
      }

      private long auctionRound_ ;
      /**
       * <pre>
       * current auction round
       * </pre>
       *
       * <code>uint64 auction_round = 2;</code>
       * @return The auctionRound.
       */
      @java.lang.Override
      public long getAuctionRound() {
        return auctionRound_;
      }
      /**
       * <pre>
       * current auction round
       * </pre>
       *
       * <code>uint64 auction_round = 2;</code>
       * @param value The auctionRound to set.
       * @return This builder for chaining.
       */
      public Builder setAuctionRound(long value) {

        auctionRound_ = value;
        bitField0_ |= 0x00000002;
        onChanged();
        return this;
      }
      /**
       * <pre>
       * current auction round
       * </pre>
       *
       * <code>uint64 auction_round = 2;</code>
       * @return This builder for chaining.
       */
      public Builder clearAuctionRound() {
        bitField0_ = (bitField0_ & ~0x00000002);
        auctionRound_ = 0L;
        onChanged();
        return this;
      }

      private injective.auction.v1beta1.Auction.Bid highestBid_;
      private com.google.protobuf.SingleFieldBuilderV3<
          injective.auction.v1beta1.Auction.Bid, injective.auction.v1beta1.Auction.Bid.Builder, injective.auction.v1beta1.Auction.BidOrBuilder> highestBidBuilder_;
      /**
       * <pre>
       * current highest bid
       * </pre>
       *
       * <code>.injective.auction.v1beta1.Bid highest_bid = 3;</code>
       * @return Whether the highestBid field is set.
       */
      public boolean hasHighestBid() {
        return ((bitField0_ & 0x00000004) != 0);
      }
      /**
       * <pre>
       * current highest bid
       * </pre>
       *
       * <code>.injective.auction.v1beta1.Bid highest_bid = 3;</code>
       * @return The highestBid.
       */
      public injective.auction.v1beta1.Auction.Bid getHighestBid() {
        if (highestBidBuilder_ == null) {
          return highestBid_ == null ? injective.auction.v1beta1.Auction.Bid.getDefaultInstance() : highestBid_;
        } else {
          return highestBidBuilder_.getMessage();
        }
      }
      /**
       * <pre>
       * current highest bid
       * </pre>
       *
       * <code>.injective.auction.v1beta1.Bid highest_bid = 3;</code>
       */
      public Builder setHighestBid(injective.auction.v1beta1.Auction.Bid value) {
        if (highestBidBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          highestBid_ = value;
        } else {
          highestBidBuilder_.setMessage(value);
        }
        bitField0_ |= 0x00000004;
        onChanged();
        return this;
      }
      /**
       * <pre>
       * current highest bid
       * </pre>
       *
       * <code>.injective.auction.v1beta1.Bid highest_bid = 3;</code>
       */
      public Builder setHighestBid(
          injective.auction.v1beta1.Auction.Bid.Builder builderForValue) {
        if (highestBidBuilder_ == null) {
          highestBid_ = builderForValue.build();
        } else {
          highestBidBuilder_.setMessage(builderForValue.build());
        }
        bitField0_ |= 0x00000004;
        onChanged();
        return this;
      }
      /**
       * <pre>
       * current highest bid
       * </pre>
       *
       * <code>.injective.auction.v1beta1.Bid highest_bid = 3;</code>
       */
      public Builder mergeHighestBid(injective.auction.v1beta1.Auction.Bid value) {
        if (highestBidBuilder_ == null) {
          if (((bitField0_ & 0x00000004) != 0) &&
            highestBid_ != null &&
            highestBid_ != injective.auction.v1beta1.Auction.Bid.getDefaultInstance()) {
            getHighestBidBuilder().mergeFrom(value);
          } else {
            highestBid_ = value;
          }
        } else {
          highestBidBuilder_.mergeFrom(value);
        }
        bitField0_ |= 0x00000004;
        onChanged();
        return this;
      }
      /**
       * <pre>
       * current highest bid
       * </pre>
       *
       * <code>.injective.auction.v1beta1.Bid highest_bid = 3;</code>
       */
      public Builder clearHighestBid() {
        bitField0_ = (bitField0_ & ~0x00000004);
        highestBid_ = null;
        if (highestBidBuilder_ != null) {
          highestBidBuilder_.dispose();
          highestBidBuilder_ = null;
        }
        onChanged();
        return this;
      }
      /**
       * <pre>
       * current highest bid
       * </pre>
       *
       * <code>.injective.auction.v1beta1.Bid highest_bid = 3;</code>
       */
      public injective.auction.v1beta1.Auction.Bid.Builder getHighestBidBuilder() {
        bitField0_ |= 0x00000004;
        onChanged();
        return getHighestBidFieldBuilder().getBuilder();
      }
      /**
       * <pre>
       * current highest bid
       * </pre>
       *
       * <code>.injective.auction.v1beta1.Bid highest_bid = 3;</code>
       */
      public injective.auction.v1beta1.Auction.BidOrBuilder getHighestBidOrBuilder() {
        if (highestBidBuilder_ != null) {
          return highestBidBuilder_.getMessageOrBuilder();
        } else {
          return highestBid_ == null ?
              injective.auction.v1beta1.Auction.Bid.getDefaultInstance() : highestBid_;
        }
      }
      /**
       * <pre>
       * current highest bid
       * </pre>
       *
       * <code>.injective.auction.v1beta1.Bid highest_bid = 3;</code>
       */
      private com.google.protobuf.SingleFieldBuilderV3<
          injective.auction.v1beta1.Auction.Bid, injective.auction.v1beta1.Auction.Bid.Builder, injective.auction.v1beta1.Auction.BidOrBuilder> 
          getHighestBidFieldBuilder() {
        if (highestBidBuilder_ == null) {
          highestBidBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
              injective.auction.v1beta1.Auction.Bid, injective.auction.v1beta1.Auction.Bid.Builder, injective.auction.v1beta1.Auction.BidOrBuilder>(
                  getHighestBid(),
                  getParentForChildren(),
                  isClean());
          highestBid_ = null;
        }
        return highestBidBuilder_;
      }

      private long auctionEndingTimestamp_ ;
      /**
       * <pre>
       * auction ending timestamp
       * </pre>
       *
       * <code>int64 auction_ending_timestamp = 4;</code>
       * @return The auctionEndingTimestamp.
       */
      @java.lang.Override
      public long getAuctionEndingTimestamp() {
        return auctionEndingTimestamp_;
      }
      /**
       * <pre>
       * auction ending timestamp
       * </pre>
       *
       * <code>int64 auction_ending_timestamp = 4;</code>
       * @param value The auctionEndingTimestamp to set.
       * @return This builder for chaining.
       */
      public Builder setAuctionEndingTimestamp(long value) {

        auctionEndingTimestamp_ = value;
        bitField0_ |= 0x00000008;
        onChanged();
        return this;
      }
      /**
       * <pre>
       * auction ending timestamp
       * </pre>
       *
       * <code>int64 auction_ending_timestamp = 4;</code>
       * @return This builder for chaining.
       */
      public Builder clearAuctionEndingTimestamp() {
        bitField0_ = (bitField0_ & ~0x00000008);
        auctionEndingTimestamp_ = 0L;
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


      // @@protoc_insertion_point(builder_scope:injective.auction.v1beta1.GenesisState)
    }

    // @@protoc_insertion_point(class_scope:injective.auction.v1beta1.GenesisState)
    private static final injective.auction.v1beta1.Genesis.GenesisState DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new injective.auction.v1beta1.Genesis.GenesisState();
    }

    public static injective.auction.v1beta1.Genesis.GenesisState getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<GenesisState>
        PARSER = new com.google.protobuf.AbstractParser<GenesisState>() {
      @java.lang.Override
      public GenesisState parsePartialFrom(
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

    public static com.google.protobuf.Parser<GenesisState> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<GenesisState> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public injective.auction.v1beta1.Genesis.GenesisState getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_injective_auction_v1beta1_GenesisState_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_injective_auction_v1beta1_GenesisState_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\'injective/auction/v1beta1/genesis.prot" +
      "o\022\031injective.auction.v1beta1\032\'injective/" +
      "auction/v1beta1/auction.proto\032\024gogoproto" +
      "/gogo.proto\"\265\001\n\014GenesisState\0227\n\006params\030\001" +
      " \001(\0132!.injective.auction.v1beta1.ParamsB" +
      "\004\310\336\037\000\022\025\n\rauction_round\030\002 \001(\004\0223\n\013highest_" +
      "bid\030\003 \001(\0132\036.injective.auction.v1beta1.Bi" +
      "d\022 \n\030auction_ending_timestamp\030\004 \001(\003BOZMg" +
      "ithub.com/InjectiveLabs/injective-core/i" +
      "njective-chain/modules/auction/typesb\006pr" +
      "oto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          injective.auction.v1beta1.Auction.getDescriptor(),
          com.google.protobuf.GoGoProtos.getDescriptor(),
        });
    internal_static_injective_auction_v1beta1_GenesisState_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_injective_auction_v1beta1_GenesisState_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_injective_auction_v1beta1_GenesisState_descriptor,
        new java.lang.String[] { "Params", "AuctionRound", "HighestBid", "AuctionEndingTimestamp", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.protobuf.GoGoProtos.nullable);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    injective.auction.v1beta1.Auction.getDescriptor();
    com.google.protobuf.GoGoProtos.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
