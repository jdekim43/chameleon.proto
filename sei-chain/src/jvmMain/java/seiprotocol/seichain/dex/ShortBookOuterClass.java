// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: dex/short_book.proto

package seiprotocol.seichain.dex;

public final class ShortBookOuterClass {
  private ShortBookOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface ShortBookOrBuilder extends
      // @@protoc_insertion_point(interface_extends:seiprotocol.seichain.dex.ShortBook)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>string price = 1 [(.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Dec", (.gogoproto.jsontag) = "price", (.gogoproto.moretags) = "yaml:&#92;"price&#92;""];</code>
     * @return The price.
     */
    java.lang.String getPrice();
    /**
     * <code>string price = 1 [(.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Dec", (.gogoproto.jsontag) = "price", (.gogoproto.moretags) = "yaml:&#92;"price&#92;""];</code>
     * @return The bytes for price.
     */
    com.google.protobuf.ByteString
        getPriceBytes();

    /**
     * <code>.seiprotocol.seichain.dex.OrderEntry entry = 2 [(.gogoproto.jsontag) = "entry"];</code>
     * @return Whether the entry field is set.
     */
    boolean hasEntry();
    /**
     * <code>.seiprotocol.seichain.dex.OrderEntry entry = 2 [(.gogoproto.jsontag) = "entry"];</code>
     * @return The entry.
     */
    seiprotocol.seichain.dex.OrderEntryOuterClass.OrderEntry getEntry();
    /**
     * <code>.seiprotocol.seichain.dex.OrderEntry entry = 2 [(.gogoproto.jsontag) = "entry"];</code>
     */
    seiprotocol.seichain.dex.OrderEntryOuterClass.OrderEntryOrBuilder getEntryOrBuilder();
  }
  /**
   * Protobuf type {@code seiprotocol.seichain.dex.ShortBook}
   */
  public static final class ShortBook extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:seiprotocol.seichain.dex.ShortBook)
      ShortBookOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use ShortBook.newBuilder() to construct.
    private ShortBook(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private ShortBook() {
      price_ = "";
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new ShortBook();
    }

    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return seiprotocol.seichain.dex.ShortBookOuterClass.internal_static_seiprotocol_seichain_dex_ShortBook_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return seiprotocol.seichain.dex.ShortBookOuterClass.internal_static_seiprotocol_seichain_dex_ShortBook_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              seiprotocol.seichain.dex.ShortBookOuterClass.ShortBook.class, seiprotocol.seichain.dex.ShortBookOuterClass.ShortBook.Builder.class);
    }

    public static final int PRICE_FIELD_NUMBER = 1;
    @SuppressWarnings("serial")
    private volatile java.lang.Object price_ = "";
    /**
     * <code>string price = 1 [(.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Dec", (.gogoproto.jsontag) = "price", (.gogoproto.moretags) = "yaml:&#92;"price&#92;""];</code>
     * @return The price.
     */
    @java.lang.Override
    public java.lang.String getPrice() {
      java.lang.Object ref = price_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        price_ = s;
        return s;
      }
    }
    /**
     * <code>string price = 1 [(.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Dec", (.gogoproto.jsontag) = "price", (.gogoproto.moretags) = "yaml:&#92;"price&#92;""];</code>
     * @return The bytes for price.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString
        getPriceBytes() {
      java.lang.Object ref = price_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        price_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int ENTRY_FIELD_NUMBER = 2;
    private seiprotocol.seichain.dex.OrderEntryOuterClass.OrderEntry entry_;
    /**
     * <code>.seiprotocol.seichain.dex.OrderEntry entry = 2 [(.gogoproto.jsontag) = "entry"];</code>
     * @return Whether the entry field is set.
     */
    @java.lang.Override
    public boolean hasEntry() {
      return entry_ != null;
    }
    /**
     * <code>.seiprotocol.seichain.dex.OrderEntry entry = 2 [(.gogoproto.jsontag) = "entry"];</code>
     * @return The entry.
     */
    @java.lang.Override
    public seiprotocol.seichain.dex.OrderEntryOuterClass.OrderEntry getEntry() {
      return entry_ == null ? seiprotocol.seichain.dex.OrderEntryOuterClass.OrderEntry.getDefaultInstance() : entry_;
    }
    /**
     * <code>.seiprotocol.seichain.dex.OrderEntry entry = 2 [(.gogoproto.jsontag) = "entry"];</code>
     */
    @java.lang.Override
    public seiprotocol.seichain.dex.OrderEntryOuterClass.OrderEntryOrBuilder getEntryOrBuilder() {
      return entry_ == null ? seiprotocol.seichain.dex.OrderEntryOuterClass.OrderEntry.getDefaultInstance() : entry_;
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
      if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(price_)) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 1, price_);
      }
      if (entry_ != null) {
        output.writeMessage(2, getEntry());
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(price_)) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, price_);
      }
      if (entry_ != null) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(2, getEntry());
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
      if (!(obj instanceof seiprotocol.seichain.dex.ShortBookOuterClass.ShortBook)) {
        return super.equals(obj);
      }
      seiprotocol.seichain.dex.ShortBookOuterClass.ShortBook other = (seiprotocol.seichain.dex.ShortBookOuterClass.ShortBook) obj;

      if (!getPrice()
          .equals(other.getPrice())) return false;
      if (hasEntry() != other.hasEntry()) return false;
      if (hasEntry()) {
        if (!getEntry()
            .equals(other.getEntry())) return false;
      }
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
      hash = (37 * hash) + PRICE_FIELD_NUMBER;
      hash = (53 * hash) + getPrice().hashCode();
      if (hasEntry()) {
        hash = (37 * hash) + ENTRY_FIELD_NUMBER;
        hash = (53 * hash) + getEntry().hashCode();
      }
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static seiprotocol.seichain.dex.ShortBookOuterClass.ShortBook parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static seiprotocol.seichain.dex.ShortBookOuterClass.ShortBook parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static seiprotocol.seichain.dex.ShortBookOuterClass.ShortBook parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static seiprotocol.seichain.dex.ShortBookOuterClass.ShortBook parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static seiprotocol.seichain.dex.ShortBookOuterClass.ShortBook parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static seiprotocol.seichain.dex.ShortBookOuterClass.ShortBook parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static seiprotocol.seichain.dex.ShortBookOuterClass.ShortBook parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static seiprotocol.seichain.dex.ShortBookOuterClass.ShortBook parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static seiprotocol.seichain.dex.ShortBookOuterClass.ShortBook parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static seiprotocol.seichain.dex.ShortBookOuterClass.ShortBook parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static seiprotocol.seichain.dex.ShortBookOuterClass.ShortBook parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static seiprotocol.seichain.dex.ShortBookOuterClass.ShortBook parseFrom(
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
    public static Builder newBuilder(seiprotocol.seichain.dex.ShortBookOuterClass.ShortBook prototype) {
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
     * Protobuf type {@code seiprotocol.seichain.dex.ShortBook}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:seiprotocol.seichain.dex.ShortBook)
        seiprotocol.seichain.dex.ShortBookOuterClass.ShortBookOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return seiprotocol.seichain.dex.ShortBookOuterClass.internal_static_seiprotocol_seichain_dex_ShortBook_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return seiprotocol.seichain.dex.ShortBookOuterClass.internal_static_seiprotocol_seichain_dex_ShortBook_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                seiprotocol.seichain.dex.ShortBookOuterClass.ShortBook.class, seiprotocol.seichain.dex.ShortBookOuterClass.ShortBook.Builder.class);
      }

      // Construct using seiprotocol.seichain.dex.ShortBookOuterClass.ShortBook.newBuilder()
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
        price_ = "";
        entry_ = null;
        if (entryBuilder_ != null) {
          entryBuilder_.dispose();
          entryBuilder_ = null;
        }
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return seiprotocol.seichain.dex.ShortBookOuterClass.internal_static_seiprotocol_seichain_dex_ShortBook_descriptor;
      }

      @java.lang.Override
      public seiprotocol.seichain.dex.ShortBookOuterClass.ShortBook getDefaultInstanceForType() {
        return seiprotocol.seichain.dex.ShortBookOuterClass.ShortBook.getDefaultInstance();
      }

      @java.lang.Override
      public seiprotocol.seichain.dex.ShortBookOuterClass.ShortBook build() {
        seiprotocol.seichain.dex.ShortBookOuterClass.ShortBook result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public seiprotocol.seichain.dex.ShortBookOuterClass.ShortBook buildPartial() {
        seiprotocol.seichain.dex.ShortBookOuterClass.ShortBook result = new seiprotocol.seichain.dex.ShortBookOuterClass.ShortBook(this);
        if (bitField0_ != 0) { buildPartial0(result); }
        onBuilt();
        return result;
      }

      private void buildPartial0(seiprotocol.seichain.dex.ShortBookOuterClass.ShortBook result) {
        int from_bitField0_ = bitField0_;
        if (((from_bitField0_ & 0x00000001) != 0)) {
          result.price_ = price_;
        }
        if (((from_bitField0_ & 0x00000002) != 0)) {
          result.entry_ = entryBuilder_ == null
              ? entry_
              : entryBuilder_.build();
        }
      }

      @java.lang.Override
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof seiprotocol.seichain.dex.ShortBookOuterClass.ShortBook) {
          return mergeFrom((seiprotocol.seichain.dex.ShortBookOuterClass.ShortBook)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(seiprotocol.seichain.dex.ShortBookOuterClass.ShortBook other) {
        if (other == seiprotocol.seichain.dex.ShortBookOuterClass.ShortBook.getDefaultInstance()) return this;
        if (!other.getPrice().isEmpty()) {
          price_ = other.price_;
          bitField0_ |= 0x00000001;
          onChanged();
        }
        if (other.hasEntry()) {
          mergeEntry(other.getEntry());
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
                price_ = input.readStringRequireUtf8();
                bitField0_ |= 0x00000001;
                break;
              } // case 10
              case 18: {
                input.readMessage(
                    getEntryFieldBuilder().getBuilder(),
                    extensionRegistry);
                bitField0_ |= 0x00000002;
                break;
              } // case 18
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

      private java.lang.Object price_ = "";
      /**
       * <code>string price = 1 [(.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Dec", (.gogoproto.jsontag) = "price", (.gogoproto.moretags) = "yaml:&#92;"price&#92;""];</code>
       * @return The price.
       */
      public java.lang.String getPrice() {
        java.lang.Object ref = price_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          price_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>string price = 1 [(.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Dec", (.gogoproto.jsontag) = "price", (.gogoproto.moretags) = "yaml:&#92;"price&#92;""];</code>
       * @return The bytes for price.
       */
      public com.google.protobuf.ByteString
          getPriceBytes() {
        java.lang.Object ref = price_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          price_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>string price = 1 [(.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Dec", (.gogoproto.jsontag) = "price", (.gogoproto.moretags) = "yaml:&#92;"price&#92;""];</code>
       * @param value The price to set.
       * @return This builder for chaining.
       */
      public Builder setPrice(
          java.lang.String value) {
        if (value == null) { throw new NullPointerException(); }
        price_ = value;
        bitField0_ |= 0x00000001;
        onChanged();
        return this;
      }
      /**
       * <code>string price = 1 [(.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Dec", (.gogoproto.jsontag) = "price", (.gogoproto.moretags) = "yaml:&#92;"price&#92;""];</code>
       * @return This builder for chaining.
       */
      public Builder clearPrice() {
        price_ = getDefaultInstance().getPrice();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
        return this;
      }
      /**
       * <code>string price = 1 [(.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Dec", (.gogoproto.jsontag) = "price", (.gogoproto.moretags) = "yaml:&#92;"price&#92;""];</code>
       * @param value The bytes for price to set.
       * @return This builder for chaining.
       */
      public Builder setPriceBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) { throw new NullPointerException(); }
        checkByteStringIsUtf8(value);
        price_ = value;
        bitField0_ |= 0x00000001;
        onChanged();
        return this;
      }

      private seiprotocol.seichain.dex.OrderEntryOuterClass.OrderEntry entry_;
      private com.google.protobuf.SingleFieldBuilderV3<
          seiprotocol.seichain.dex.OrderEntryOuterClass.OrderEntry, seiprotocol.seichain.dex.OrderEntryOuterClass.OrderEntry.Builder, seiprotocol.seichain.dex.OrderEntryOuterClass.OrderEntryOrBuilder> entryBuilder_;
      /**
       * <code>.seiprotocol.seichain.dex.OrderEntry entry = 2 [(.gogoproto.jsontag) = "entry"];</code>
       * @return Whether the entry field is set.
       */
      public boolean hasEntry() {
        return ((bitField0_ & 0x00000002) != 0);
      }
      /**
       * <code>.seiprotocol.seichain.dex.OrderEntry entry = 2 [(.gogoproto.jsontag) = "entry"];</code>
       * @return The entry.
       */
      public seiprotocol.seichain.dex.OrderEntryOuterClass.OrderEntry getEntry() {
        if (entryBuilder_ == null) {
          return entry_ == null ? seiprotocol.seichain.dex.OrderEntryOuterClass.OrderEntry.getDefaultInstance() : entry_;
        } else {
          return entryBuilder_.getMessage();
        }
      }
      /**
       * <code>.seiprotocol.seichain.dex.OrderEntry entry = 2 [(.gogoproto.jsontag) = "entry"];</code>
       */
      public Builder setEntry(seiprotocol.seichain.dex.OrderEntryOuterClass.OrderEntry value) {
        if (entryBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          entry_ = value;
        } else {
          entryBuilder_.setMessage(value);
        }
        bitField0_ |= 0x00000002;
        onChanged();
        return this;
      }
      /**
       * <code>.seiprotocol.seichain.dex.OrderEntry entry = 2 [(.gogoproto.jsontag) = "entry"];</code>
       */
      public Builder setEntry(
          seiprotocol.seichain.dex.OrderEntryOuterClass.OrderEntry.Builder builderForValue) {
        if (entryBuilder_ == null) {
          entry_ = builderForValue.build();
        } else {
          entryBuilder_.setMessage(builderForValue.build());
        }
        bitField0_ |= 0x00000002;
        onChanged();
        return this;
      }
      /**
       * <code>.seiprotocol.seichain.dex.OrderEntry entry = 2 [(.gogoproto.jsontag) = "entry"];</code>
       */
      public Builder mergeEntry(seiprotocol.seichain.dex.OrderEntryOuterClass.OrderEntry value) {
        if (entryBuilder_ == null) {
          if (((bitField0_ & 0x00000002) != 0) &&
            entry_ != null &&
            entry_ != seiprotocol.seichain.dex.OrderEntryOuterClass.OrderEntry.getDefaultInstance()) {
            getEntryBuilder().mergeFrom(value);
          } else {
            entry_ = value;
          }
        } else {
          entryBuilder_.mergeFrom(value);
        }
        bitField0_ |= 0x00000002;
        onChanged();
        return this;
      }
      /**
       * <code>.seiprotocol.seichain.dex.OrderEntry entry = 2 [(.gogoproto.jsontag) = "entry"];</code>
       */
      public Builder clearEntry() {
        bitField0_ = (bitField0_ & ~0x00000002);
        entry_ = null;
        if (entryBuilder_ != null) {
          entryBuilder_.dispose();
          entryBuilder_ = null;
        }
        onChanged();
        return this;
      }
      /**
       * <code>.seiprotocol.seichain.dex.OrderEntry entry = 2 [(.gogoproto.jsontag) = "entry"];</code>
       */
      public seiprotocol.seichain.dex.OrderEntryOuterClass.OrderEntry.Builder getEntryBuilder() {
        bitField0_ |= 0x00000002;
        onChanged();
        return getEntryFieldBuilder().getBuilder();
      }
      /**
       * <code>.seiprotocol.seichain.dex.OrderEntry entry = 2 [(.gogoproto.jsontag) = "entry"];</code>
       */
      public seiprotocol.seichain.dex.OrderEntryOuterClass.OrderEntryOrBuilder getEntryOrBuilder() {
        if (entryBuilder_ != null) {
          return entryBuilder_.getMessageOrBuilder();
        } else {
          return entry_ == null ?
              seiprotocol.seichain.dex.OrderEntryOuterClass.OrderEntry.getDefaultInstance() : entry_;
        }
      }
      /**
       * <code>.seiprotocol.seichain.dex.OrderEntry entry = 2 [(.gogoproto.jsontag) = "entry"];</code>
       */
      private com.google.protobuf.SingleFieldBuilderV3<
          seiprotocol.seichain.dex.OrderEntryOuterClass.OrderEntry, seiprotocol.seichain.dex.OrderEntryOuterClass.OrderEntry.Builder, seiprotocol.seichain.dex.OrderEntryOuterClass.OrderEntryOrBuilder> 
          getEntryFieldBuilder() {
        if (entryBuilder_ == null) {
          entryBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
              seiprotocol.seichain.dex.OrderEntryOuterClass.OrderEntry, seiprotocol.seichain.dex.OrderEntryOuterClass.OrderEntry.Builder, seiprotocol.seichain.dex.OrderEntryOuterClass.OrderEntryOrBuilder>(
                  getEntry(),
                  getParentForChildren(),
                  isClean());
          entry_ = null;
        }
        return entryBuilder_;
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


      // @@protoc_insertion_point(builder_scope:seiprotocol.seichain.dex.ShortBook)
    }

    // @@protoc_insertion_point(class_scope:seiprotocol.seichain.dex.ShortBook)
    private static final seiprotocol.seichain.dex.ShortBookOuterClass.ShortBook DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new seiprotocol.seichain.dex.ShortBookOuterClass.ShortBook();
    }

    public static seiprotocol.seichain.dex.ShortBookOuterClass.ShortBook getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<ShortBook>
        PARSER = new com.google.protobuf.AbstractParser<ShortBook>() {
      @java.lang.Override
      public ShortBook parsePartialFrom(
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

    public static com.google.protobuf.Parser<ShortBook> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<ShortBook> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public seiprotocol.seichain.dex.ShortBookOuterClass.ShortBook getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_seiprotocol_seichain_dex_ShortBook_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_seiprotocol_seichain_dex_ShortBook_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\024dex/short_book.proto\022\030seiprotocol.seic" +
      "hain.dex\032\025dex/order_entry.proto\032\024gogopro" +
      "to/gogo.proto\"\243\001\n\tShortBook\022V\n\005price\030\001 \001" +
      "(\tBG\310\336\037\000\332\336\037&github.com/cosmos/cosmos-sdk" +
      "/types.Dec\352\336\037\005price\362\336\037\014yaml:\"price\"\022>\n\005e" +
      "ntry\030\002 \001(\0132$.seiprotocol.seichain.dex.Or" +
      "derEntryB\t\352\336\037\005entryB/Z-github.com/sei-pr" +
      "otocol/sei-chain/x/dex/typesb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          seiprotocol.seichain.dex.OrderEntryOuterClass.getDescriptor(),
          com.google.protobuf.GoGoProtos.getDescriptor(),
        });
    internal_static_seiprotocol_seichain_dex_ShortBook_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_seiprotocol_seichain_dex_ShortBook_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_seiprotocol_seichain_dex_ShortBook_descriptor,
        new java.lang.String[] { "Price", "Entry", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.protobuf.GoGoProtos.customtype);
    registry.add(com.google.protobuf.GoGoProtos.jsontag);
    registry.add(com.google.protobuf.GoGoProtos.moretags);
    registry.add(com.google.protobuf.GoGoProtos.nullable);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    seiprotocol.seichain.dex.OrderEntryOuterClass.getDescriptor();
    com.google.protobuf.GoGoProtos.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
