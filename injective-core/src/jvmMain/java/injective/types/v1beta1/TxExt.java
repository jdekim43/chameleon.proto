// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: injective/types/v1beta1/tx_ext.proto

package injective.types.v1beta1;

public final class TxExt {
  private TxExt() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface ExtensionOptionsWeb3TxOrBuilder extends
      // @@protoc_insertion_point(interface_extends:injective.types.v1beta1.ExtensionOptionsWeb3Tx)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <pre>
     * typedDataChainID used only in EIP712 Domain and should match
     * Ethereum network ID in a Web3 provider (e.g. Metamask).
     * </pre>
     *
     * <code>uint64 typedDataChainID = 1;</code>
     * @return The typedDataChainID.
     */
    long getTypedDataChainID();

    /**
     * <pre>
     * feePayer is an account address for the fee payer. It will be validated
     * during EIP712 signature checking.
     * </pre>
     *
     * <code>string feePayer = 2;</code>
     * @return The feePayer.
     */
    java.lang.String getFeePayer();
    /**
     * <pre>
     * feePayer is an account address for the fee payer. It will be validated
     * during EIP712 signature checking.
     * </pre>
     *
     * <code>string feePayer = 2;</code>
     * @return The bytes for feePayer.
     */
    com.google.protobuf.ByteString
        getFeePayerBytes();

    /**
     * <pre>
     * feePayerSig is a signature data from the fee paying account,
     * allows to perform fee delegation when using EIP712 Domain.
     * </pre>
     *
     * <code>bytes feePayerSig = 3;</code>
     * @return The feePayerSig.
     */
    com.google.protobuf.ByteString getFeePayerSig();
  }
  /**
   * Protobuf type {@code injective.types.v1beta1.ExtensionOptionsWeb3Tx}
   */
  public static final class ExtensionOptionsWeb3Tx extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:injective.types.v1beta1.ExtensionOptionsWeb3Tx)
      ExtensionOptionsWeb3TxOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use ExtensionOptionsWeb3Tx.newBuilder() to construct.
    private ExtensionOptionsWeb3Tx(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private ExtensionOptionsWeb3Tx() {
      feePayer_ = "";
      feePayerSig_ = com.google.protobuf.ByteString.EMPTY;
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new ExtensionOptionsWeb3Tx();
    }

    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return injective.types.v1beta1.TxExt.internal_static_injective_types_v1beta1_ExtensionOptionsWeb3Tx_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return injective.types.v1beta1.TxExt.internal_static_injective_types_v1beta1_ExtensionOptionsWeb3Tx_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              injective.types.v1beta1.TxExt.ExtensionOptionsWeb3Tx.class, injective.types.v1beta1.TxExt.ExtensionOptionsWeb3Tx.Builder.class);
    }

    public static final int TYPEDDATACHAINID_FIELD_NUMBER = 1;
    private long typedDataChainID_ = 0L;
    /**
     * <pre>
     * typedDataChainID used only in EIP712 Domain and should match
     * Ethereum network ID in a Web3 provider (e.g. Metamask).
     * </pre>
     *
     * <code>uint64 typedDataChainID = 1;</code>
     * @return The typedDataChainID.
     */
    @java.lang.Override
    public long getTypedDataChainID() {
      return typedDataChainID_;
    }

    public static final int FEEPAYER_FIELD_NUMBER = 2;
    @SuppressWarnings("serial")
    private volatile java.lang.Object feePayer_ = "";
    /**
     * <pre>
     * feePayer is an account address for the fee payer. It will be validated
     * during EIP712 signature checking.
     * </pre>
     *
     * <code>string feePayer = 2;</code>
     * @return The feePayer.
     */
    @java.lang.Override
    public java.lang.String getFeePayer() {
      java.lang.Object ref = feePayer_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        feePayer_ = s;
        return s;
      }
    }
    /**
     * <pre>
     * feePayer is an account address for the fee payer. It will be validated
     * during EIP712 signature checking.
     * </pre>
     *
     * <code>string feePayer = 2;</code>
     * @return The bytes for feePayer.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString
        getFeePayerBytes() {
      java.lang.Object ref = feePayer_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        feePayer_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int FEEPAYERSIG_FIELD_NUMBER = 3;
    private com.google.protobuf.ByteString feePayerSig_ = com.google.protobuf.ByteString.EMPTY;
    /**
     * <pre>
     * feePayerSig is a signature data from the fee paying account,
     * allows to perform fee delegation when using EIP712 Domain.
     * </pre>
     *
     * <code>bytes feePayerSig = 3;</code>
     * @return The feePayerSig.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString getFeePayerSig() {
      return feePayerSig_;
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
      if (typedDataChainID_ != 0L) {
        output.writeUInt64(1, typedDataChainID_);
      }
      if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(feePayer_)) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 2, feePayer_);
      }
      if (!feePayerSig_.isEmpty()) {
        output.writeBytes(3, feePayerSig_);
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (typedDataChainID_ != 0L) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt64Size(1, typedDataChainID_);
      }
      if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(feePayer_)) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, feePayer_);
      }
      if (!feePayerSig_.isEmpty()) {
        size += com.google.protobuf.CodedOutputStream
          .computeBytesSize(3, feePayerSig_);
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
      if (!(obj instanceof injective.types.v1beta1.TxExt.ExtensionOptionsWeb3Tx)) {
        return super.equals(obj);
      }
      injective.types.v1beta1.TxExt.ExtensionOptionsWeb3Tx other = (injective.types.v1beta1.TxExt.ExtensionOptionsWeb3Tx) obj;

      if (getTypedDataChainID()
          != other.getTypedDataChainID()) return false;
      if (!getFeePayer()
          .equals(other.getFeePayer())) return false;
      if (!getFeePayerSig()
          .equals(other.getFeePayerSig())) return false;
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
      hash = (37 * hash) + TYPEDDATACHAINID_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
          getTypedDataChainID());
      hash = (37 * hash) + FEEPAYER_FIELD_NUMBER;
      hash = (53 * hash) + getFeePayer().hashCode();
      hash = (37 * hash) + FEEPAYERSIG_FIELD_NUMBER;
      hash = (53 * hash) + getFeePayerSig().hashCode();
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static injective.types.v1beta1.TxExt.ExtensionOptionsWeb3Tx parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static injective.types.v1beta1.TxExt.ExtensionOptionsWeb3Tx parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static injective.types.v1beta1.TxExt.ExtensionOptionsWeb3Tx parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static injective.types.v1beta1.TxExt.ExtensionOptionsWeb3Tx parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static injective.types.v1beta1.TxExt.ExtensionOptionsWeb3Tx parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static injective.types.v1beta1.TxExt.ExtensionOptionsWeb3Tx parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static injective.types.v1beta1.TxExt.ExtensionOptionsWeb3Tx parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static injective.types.v1beta1.TxExt.ExtensionOptionsWeb3Tx parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static injective.types.v1beta1.TxExt.ExtensionOptionsWeb3Tx parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static injective.types.v1beta1.TxExt.ExtensionOptionsWeb3Tx parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static injective.types.v1beta1.TxExt.ExtensionOptionsWeb3Tx parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static injective.types.v1beta1.TxExt.ExtensionOptionsWeb3Tx parseFrom(
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
    public static Builder newBuilder(injective.types.v1beta1.TxExt.ExtensionOptionsWeb3Tx prototype) {
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
     * Protobuf type {@code injective.types.v1beta1.ExtensionOptionsWeb3Tx}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:injective.types.v1beta1.ExtensionOptionsWeb3Tx)
        injective.types.v1beta1.TxExt.ExtensionOptionsWeb3TxOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return injective.types.v1beta1.TxExt.internal_static_injective_types_v1beta1_ExtensionOptionsWeb3Tx_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return injective.types.v1beta1.TxExt.internal_static_injective_types_v1beta1_ExtensionOptionsWeb3Tx_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                injective.types.v1beta1.TxExt.ExtensionOptionsWeb3Tx.class, injective.types.v1beta1.TxExt.ExtensionOptionsWeb3Tx.Builder.class);
      }

      // Construct using injective.types.v1beta1.TxExt.ExtensionOptionsWeb3Tx.newBuilder()
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
        typedDataChainID_ = 0L;
        feePayer_ = "";
        feePayerSig_ = com.google.protobuf.ByteString.EMPTY;
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return injective.types.v1beta1.TxExt.internal_static_injective_types_v1beta1_ExtensionOptionsWeb3Tx_descriptor;
      }

      @java.lang.Override
      public injective.types.v1beta1.TxExt.ExtensionOptionsWeb3Tx getDefaultInstanceForType() {
        return injective.types.v1beta1.TxExt.ExtensionOptionsWeb3Tx.getDefaultInstance();
      }

      @java.lang.Override
      public injective.types.v1beta1.TxExt.ExtensionOptionsWeb3Tx build() {
        injective.types.v1beta1.TxExt.ExtensionOptionsWeb3Tx result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public injective.types.v1beta1.TxExt.ExtensionOptionsWeb3Tx buildPartial() {
        injective.types.v1beta1.TxExt.ExtensionOptionsWeb3Tx result = new injective.types.v1beta1.TxExt.ExtensionOptionsWeb3Tx(this);
        if (bitField0_ != 0) { buildPartial0(result); }
        onBuilt();
        return result;
      }

      private void buildPartial0(injective.types.v1beta1.TxExt.ExtensionOptionsWeb3Tx result) {
        int from_bitField0_ = bitField0_;
        if (((from_bitField0_ & 0x00000001) != 0)) {
          result.typedDataChainID_ = typedDataChainID_;
        }
        if (((from_bitField0_ & 0x00000002) != 0)) {
          result.feePayer_ = feePayer_;
        }
        if (((from_bitField0_ & 0x00000004) != 0)) {
          result.feePayerSig_ = feePayerSig_;
        }
      }

      @java.lang.Override
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof injective.types.v1beta1.TxExt.ExtensionOptionsWeb3Tx) {
          return mergeFrom((injective.types.v1beta1.TxExt.ExtensionOptionsWeb3Tx)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(injective.types.v1beta1.TxExt.ExtensionOptionsWeb3Tx other) {
        if (other == injective.types.v1beta1.TxExt.ExtensionOptionsWeb3Tx.getDefaultInstance()) return this;
        if (other.getTypedDataChainID() != 0L) {
          setTypedDataChainID(other.getTypedDataChainID());
        }
        if (!other.getFeePayer().isEmpty()) {
          feePayer_ = other.feePayer_;
          bitField0_ |= 0x00000002;
          onChanged();
        }
        if (other.getFeePayerSig() != com.google.protobuf.ByteString.EMPTY) {
          setFeePayerSig(other.getFeePayerSig());
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
              case 8: {
                typedDataChainID_ = input.readUInt64();
                bitField0_ |= 0x00000001;
                break;
              } // case 8
              case 18: {
                feePayer_ = input.readStringRequireUtf8();
                bitField0_ |= 0x00000002;
                break;
              } // case 18
              case 26: {
                feePayerSig_ = input.readBytes();
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

      private long typedDataChainID_ ;
      /**
       * <pre>
       * typedDataChainID used only in EIP712 Domain and should match
       * Ethereum network ID in a Web3 provider (e.g. Metamask).
       * </pre>
       *
       * <code>uint64 typedDataChainID = 1;</code>
       * @return The typedDataChainID.
       */
      @java.lang.Override
      public long getTypedDataChainID() {
        return typedDataChainID_;
      }
      /**
       * <pre>
       * typedDataChainID used only in EIP712 Domain and should match
       * Ethereum network ID in a Web3 provider (e.g. Metamask).
       * </pre>
       *
       * <code>uint64 typedDataChainID = 1;</code>
       * @param value The typedDataChainID to set.
       * @return This builder for chaining.
       */
      public Builder setTypedDataChainID(long value) {

        typedDataChainID_ = value;
        bitField0_ |= 0x00000001;
        onChanged();
        return this;
      }
      /**
       * <pre>
       * typedDataChainID used only in EIP712 Domain and should match
       * Ethereum network ID in a Web3 provider (e.g. Metamask).
       * </pre>
       *
       * <code>uint64 typedDataChainID = 1;</code>
       * @return This builder for chaining.
       */
      public Builder clearTypedDataChainID() {
        bitField0_ = (bitField0_ & ~0x00000001);
        typedDataChainID_ = 0L;
        onChanged();
        return this;
      }

      private java.lang.Object feePayer_ = "";
      /**
       * <pre>
       * feePayer is an account address for the fee payer. It will be validated
       * during EIP712 signature checking.
       * </pre>
       *
       * <code>string feePayer = 2;</code>
       * @return The feePayer.
       */
      public java.lang.String getFeePayer() {
        java.lang.Object ref = feePayer_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          feePayer_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <pre>
       * feePayer is an account address for the fee payer. It will be validated
       * during EIP712 signature checking.
       * </pre>
       *
       * <code>string feePayer = 2;</code>
       * @return The bytes for feePayer.
       */
      public com.google.protobuf.ByteString
          getFeePayerBytes() {
        java.lang.Object ref = feePayer_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          feePayer_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <pre>
       * feePayer is an account address for the fee payer. It will be validated
       * during EIP712 signature checking.
       * </pre>
       *
       * <code>string feePayer = 2;</code>
       * @param value The feePayer to set.
       * @return This builder for chaining.
       */
      public Builder setFeePayer(
          java.lang.String value) {
        if (value == null) { throw new NullPointerException(); }
        feePayer_ = value;
        bitField0_ |= 0x00000002;
        onChanged();
        return this;
      }
      /**
       * <pre>
       * feePayer is an account address for the fee payer. It will be validated
       * during EIP712 signature checking.
       * </pre>
       *
       * <code>string feePayer = 2;</code>
       * @return This builder for chaining.
       */
      public Builder clearFeePayer() {
        feePayer_ = getDefaultInstance().getFeePayer();
        bitField0_ = (bitField0_ & ~0x00000002);
        onChanged();
        return this;
      }
      /**
       * <pre>
       * feePayer is an account address for the fee payer. It will be validated
       * during EIP712 signature checking.
       * </pre>
       *
       * <code>string feePayer = 2;</code>
       * @param value The bytes for feePayer to set.
       * @return This builder for chaining.
       */
      public Builder setFeePayerBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) { throw new NullPointerException(); }
        checkByteStringIsUtf8(value);
        feePayer_ = value;
        bitField0_ |= 0x00000002;
        onChanged();
        return this;
      }

      private com.google.protobuf.ByteString feePayerSig_ = com.google.protobuf.ByteString.EMPTY;
      /**
       * <pre>
       * feePayerSig is a signature data from the fee paying account,
       * allows to perform fee delegation when using EIP712 Domain.
       * </pre>
       *
       * <code>bytes feePayerSig = 3;</code>
       * @return The feePayerSig.
       */
      @java.lang.Override
      public com.google.protobuf.ByteString getFeePayerSig() {
        return feePayerSig_;
      }
      /**
       * <pre>
       * feePayerSig is a signature data from the fee paying account,
       * allows to perform fee delegation when using EIP712 Domain.
       * </pre>
       *
       * <code>bytes feePayerSig = 3;</code>
       * @param value The feePayerSig to set.
       * @return This builder for chaining.
       */
      public Builder setFeePayerSig(com.google.protobuf.ByteString value) {
        if (value == null) { throw new NullPointerException(); }
        feePayerSig_ = value;
        bitField0_ |= 0x00000004;
        onChanged();
        return this;
      }
      /**
       * <pre>
       * feePayerSig is a signature data from the fee paying account,
       * allows to perform fee delegation when using EIP712 Domain.
       * </pre>
       *
       * <code>bytes feePayerSig = 3;</code>
       * @return This builder for chaining.
       */
      public Builder clearFeePayerSig() {
        bitField0_ = (bitField0_ & ~0x00000004);
        feePayerSig_ = getDefaultInstance().getFeePayerSig();
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


      // @@protoc_insertion_point(builder_scope:injective.types.v1beta1.ExtensionOptionsWeb3Tx)
    }

    // @@protoc_insertion_point(class_scope:injective.types.v1beta1.ExtensionOptionsWeb3Tx)
    private static final injective.types.v1beta1.TxExt.ExtensionOptionsWeb3Tx DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new injective.types.v1beta1.TxExt.ExtensionOptionsWeb3Tx();
    }

    public static injective.types.v1beta1.TxExt.ExtensionOptionsWeb3Tx getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<ExtensionOptionsWeb3Tx>
        PARSER = new com.google.protobuf.AbstractParser<ExtensionOptionsWeb3Tx>() {
      @java.lang.Override
      public ExtensionOptionsWeb3Tx parsePartialFrom(
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

    public static com.google.protobuf.Parser<ExtensionOptionsWeb3Tx> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<ExtensionOptionsWeb3Tx> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public injective.types.v1beta1.TxExt.ExtensionOptionsWeb3Tx getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_injective_types_v1beta1_ExtensionOptionsWeb3Tx_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_injective_types_v1beta1_ExtensionOptionsWeb3Tx_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n$injective/types/v1beta1/tx_ext.proto\022\027" +
      "injective.types.v1beta1\032\024gogoproto/gogo." +
      "proto\"_\n\026ExtensionOptionsWeb3Tx\022\030\n\020typed" +
      "DataChainID\030\001 \001(\004\022\020\n\010feePayer\030\002 \001(\t\022\023\n\013f" +
      "eePayerSig\030\003 \001(\014:\004\210\240\037\000B?Z=github.com/Inj" +
      "ectiveLabs/injective-core/injective-chai" +
      "n/typesb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.protobuf.GoGoProtos.getDescriptor(),
        });
    internal_static_injective_types_v1beta1_ExtensionOptionsWeb3Tx_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_injective_types_v1beta1_ExtensionOptionsWeb3Tx_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_injective_types_v1beta1_ExtensionOptionsWeb3Tx_descriptor,
        new java.lang.String[] { "TypedDataChainID", "FeePayer", "FeePayerSig", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.protobuf.GoGoProtos.goprotoGetters);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.google.protobuf.GoGoProtos.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}