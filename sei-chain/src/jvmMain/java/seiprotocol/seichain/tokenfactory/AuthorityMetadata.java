// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: tokenfactory/authorityMetadata.proto

package seiprotocol.seichain.tokenfactory;

public final class AuthorityMetadata {
  private AuthorityMetadata() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface DenomAuthorityMetadataOrBuilder extends
      // @@protoc_insertion_point(interface_extends:seiprotocol.seichain.tokenfactory.DenomAuthorityMetadata)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <pre>
     * Can be empty for no admin, or a valid sei address
     * </pre>
     *
     * <code>string admin = 1 [(.gogoproto.moretags) = "yaml:&#92;"admin&#92;""];</code>
     * @return The admin.
     */
    java.lang.String getAdmin();
    /**
     * <pre>
     * Can be empty for no admin, or a valid sei address
     * </pre>
     *
     * <code>string admin = 1 [(.gogoproto.moretags) = "yaml:&#92;"admin&#92;""];</code>
     * @return The bytes for admin.
     */
    com.google.protobuf.ByteString
        getAdminBytes();
  }
  /**
   * <pre>
   * DenomAuthorityMetadata specifies metadata for addresses that have specific
   * capabilities over a token factory denom. Right now there is only one Admin
   * permission, but is planned to be extended to the future.
   * </pre>
   *
   * Protobuf type {@code seiprotocol.seichain.tokenfactory.DenomAuthorityMetadata}
   */
  public static final class DenomAuthorityMetadata extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:seiprotocol.seichain.tokenfactory.DenomAuthorityMetadata)
      DenomAuthorityMetadataOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use DenomAuthorityMetadata.newBuilder() to construct.
    private DenomAuthorityMetadata(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private DenomAuthorityMetadata() {
      admin_ = "";
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new DenomAuthorityMetadata();
    }

    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return seiprotocol.seichain.tokenfactory.AuthorityMetadata.internal_static_seiprotocol_seichain_tokenfactory_DenomAuthorityMetadata_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return seiprotocol.seichain.tokenfactory.AuthorityMetadata.internal_static_seiprotocol_seichain_tokenfactory_DenomAuthorityMetadata_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              seiprotocol.seichain.tokenfactory.AuthorityMetadata.DenomAuthorityMetadata.class, seiprotocol.seichain.tokenfactory.AuthorityMetadata.DenomAuthorityMetadata.Builder.class);
    }

    public static final int ADMIN_FIELD_NUMBER = 1;
    @SuppressWarnings("serial")
    private volatile java.lang.Object admin_ = "";
    /**
     * <pre>
     * Can be empty for no admin, or a valid sei address
     * </pre>
     *
     * <code>string admin = 1 [(.gogoproto.moretags) = "yaml:&#92;"admin&#92;""];</code>
     * @return The admin.
     */
    @java.lang.Override
    public java.lang.String getAdmin() {
      java.lang.Object ref = admin_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        admin_ = s;
        return s;
      }
    }
    /**
     * <pre>
     * Can be empty for no admin, or a valid sei address
     * </pre>
     *
     * <code>string admin = 1 [(.gogoproto.moretags) = "yaml:&#92;"admin&#92;""];</code>
     * @return The bytes for admin.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString
        getAdminBytes() {
      java.lang.Object ref = admin_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        admin_ = b;
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
      if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(admin_)) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 1, admin_);
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(admin_)) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, admin_);
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
      if (!(obj instanceof seiprotocol.seichain.tokenfactory.AuthorityMetadata.DenomAuthorityMetadata)) {
        return super.equals(obj);
      }
      seiprotocol.seichain.tokenfactory.AuthorityMetadata.DenomAuthorityMetadata other = (seiprotocol.seichain.tokenfactory.AuthorityMetadata.DenomAuthorityMetadata) obj;

      if (!getAdmin()
          .equals(other.getAdmin())) return false;
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
      hash = (37 * hash) + ADMIN_FIELD_NUMBER;
      hash = (53 * hash) + getAdmin().hashCode();
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static seiprotocol.seichain.tokenfactory.AuthorityMetadata.DenomAuthorityMetadata parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static seiprotocol.seichain.tokenfactory.AuthorityMetadata.DenomAuthorityMetadata parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static seiprotocol.seichain.tokenfactory.AuthorityMetadata.DenomAuthorityMetadata parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static seiprotocol.seichain.tokenfactory.AuthorityMetadata.DenomAuthorityMetadata parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static seiprotocol.seichain.tokenfactory.AuthorityMetadata.DenomAuthorityMetadata parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static seiprotocol.seichain.tokenfactory.AuthorityMetadata.DenomAuthorityMetadata parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static seiprotocol.seichain.tokenfactory.AuthorityMetadata.DenomAuthorityMetadata parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static seiprotocol.seichain.tokenfactory.AuthorityMetadata.DenomAuthorityMetadata parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static seiprotocol.seichain.tokenfactory.AuthorityMetadata.DenomAuthorityMetadata parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static seiprotocol.seichain.tokenfactory.AuthorityMetadata.DenomAuthorityMetadata parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static seiprotocol.seichain.tokenfactory.AuthorityMetadata.DenomAuthorityMetadata parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static seiprotocol.seichain.tokenfactory.AuthorityMetadata.DenomAuthorityMetadata parseFrom(
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
    public static Builder newBuilder(seiprotocol.seichain.tokenfactory.AuthorityMetadata.DenomAuthorityMetadata prototype) {
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
     * DenomAuthorityMetadata specifies metadata for addresses that have specific
     * capabilities over a token factory denom. Right now there is only one Admin
     * permission, but is planned to be extended to the future.
     * </pre>
     *
     * Protobuf type {@code seiprotocol.seichain.tokenfactory.DenomAuthorityMetadata}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:seiprotocol.seichain.tokenfactory.DenomAuthorityMetadata)
        seiprotocol.seichain.tokenfactory.AuthorityMetadata.DenomAuthorityMetadataOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return seiprotocol.seichain.tokenfactory.AuthorityMetadata.internal_static_seiprotocol_seichain_tokenfactory_DenomAuthorityMetadata_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return seiprotocol.seichain.tokenfactory.AuthorityMetadata.internal_static_seiprotocol_seichain_tokenfactory_DenomAuthorityMetadata_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                seiprotocol.seichain.tokenfactory.AuthorityMetadata.DenomAuthorityMetadata.class, seiprotocol.seichain.tokenfactory.AuthorityMetadata.DenomAuthorityMetadata.Builder.class);
      }

      // Construct using seiprotocol.seichain.tokenfactory.AuthorityMetadata.DenomAuthorityMetadata.newBuilder()
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
        admin_ = "";
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return seiprotocol.seichain.tokenfactory.AuthorityMetadata.internal_static_seiprotocol_seichain_tokenfactory_DenomAuthorityMetadata_descriptor;
      }

      @java.lang.Override
      public seiprotocol.seichain.tokenfactory.AuthorityMetadata.DenomAuthorityMetadata getDefaultInstanceForType() {
        return seiprotocol.seichain.tokenfactory.AuthorityMetadata.DenomAuthorityMetadata.getDefaultInstance();
      }

      @java.lang.Override
      public seiprotocol.seichain.tokenfactory.AuthorityMetadata.DenomAuthorityMetadata build() {
        seiprotocol.seichain.tokenfactory.AuthorityMetadata.DenomAuthorityMetadata result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public seiprotocol.seichain.tokenfactory.AuthorityMetadata.DenomAuthorityMetadata buildPartial() {
        seiprotocol.seichain.tokenfactory.AuthorityMetadata.DenomAuthorityMetadata result = new seiprotocol.seichain.tokenfactory.AuthorityMetadata.DenomAuthorityMetadata(this);
        if (bitField0_ != 0) { buildPartial0(result); }
        onBuilt();
        return result;
      }

      private void buildPartial0(seiprotocol.seichain.tokenfactory.AuthorityMetadata.DenomAuthorityMetadata result) {
        int from_bitField0_ = bitField0_;
        if (((from_bitField0_ & 0x00000001) != 0)) {
          result.admin_ = admin_;
        }
      }

      @java.lang.Override
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof seiprotocol.seichain.tokenfactory.AuthorityMetadata.DenomAuthorityMetadata) {
          return mergeFrom((seiprotocol.seichain.tokenfactory.AuthorityMetadata.DenomAuthorityMetadata)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(seiprotocol.seichain.tokenfactory.AuthorityMetadata.DenomAuthorityMetadata other) {
        if (other == seiprotocol.seichain.tokenfactory.AuthorityMetadata.DenomAuthorityMetadata.getDefaultInstance()) return this;
        if (!other.getAdmin().isEmpty()) {
          admin_ = other.admin_;
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
                admin_ = input.readStringRequireUtf8();
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

      private java.lang.Object admin_ = "";
      /**
       * <pre>
       * Can be empty for no admin, or a valid sei address
       * </pre>
       *
       * <code>string admin = 1 [(.gogoproto.moretags) = "yaml:&#92;"admin&#92;""];</code>
       * @return The admin.
       */
      public java.lang.String getAdmin() {
        java.lang.Object ref = admin_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          admin_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <pre>
       * Can be empty for no admin, or a valid sei address
       * </pre>
       *
       * <code>string admin = 1 [(.gogoproto.moretags) = "yaml:&#92;"admin&#92;""];</code>
       * @return The bytes for admin.
       */
      public com.google.protobuf.ByteString
          getAdminBytes() {
        java.lang.Object ref = admin_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          admin_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <pre>
       * Can be empty for no admin, or a valid sei address
       * </pre>
       *
       * <code>string admin = 1 [(.gogoproto.moretags) = "yaml:&#92;"admin&#92;""];</code>
       * @param value The admin to set.
       * @return This builder for chaining.
       */
      public Builder setAdmin(
          java.lang.String value) {
        if (value == null) { throw new NullPointerException(); }
        admin_ = value;
        bitField0_ |= 0x00000001;
        onChanged();
        return this;
      }
      /**
       * <pre>
       * Can be empty for no admin, or a valid sei address
       * </pre>
       *
       * <code>string admin = 1 [(.gogoproto.moretags) = "yaml:&#92;"admin&#92;""];</code>
       * @return This builder for chaining.
       */
      public Builder clearAdmin() {
        admin_ = getDefaultInstance().getAdmin();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
        return this;
      }
      /**
       * <pre>
       * Can be empty for no admin, or a valid sei address
       * </pre>
       *
       * <code>string admin = 1 [(.gogoproto.moretags) = "yaml:&#92;"admin&#92;""];</code>
       * @param value The bytes for admin to set.
       * @return This builder for chaining.
       */
      public Builder setAdminBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) { throw new NullPointerException(); }
        checkByteStringIsUtf8(value);
        admin_ = value;
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


      // @@protoc_insertion_point(builder_scope:seiprotocol.seichain.tokenfactory.DenomAuthorityMetadata)
    }

    // @@protoc_insertion_point(class_scope:seiprotocol.seichain.tokenfactory.DenomAuthorityMetadata)
    private static final seiprotocol.seichain.tokenfactory.AuthorityMetadata.DenomAuthorityMetadata DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new seiprotocol.seichain.tokenfactory.AuthorityMetadata.DenomAuthorityMetadata();
    }

    public static seiprotocol.seichain.tokenfactory.AuthorityMetadata.DenomAuthorityMetadata getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<DenomAuthorityMetadata>
        PARSER = new com.google.protobuf.AbstractParser<DenomAuthorityMetadata>() {
      @java.lang.Override
      public DenomAuthorityMetadata parsePartialFrom(
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

    public static com.google.protobuf.Parser<DenomAuthorityMetadata> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<DenomAuthorityMetadata> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public seiprotocol.seichain.tokenfactory.AuthorityMetadata.DenomAuthorityMetadata getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_seiprotocol_seichain_tokenfactory_DenomAuthorityMetadata_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_seiprotocol_seichain_tokenfactory_DenomAuthorityMetadata_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n$tokenfactory/authorityMetadata.proto\022!" +
      "seiprotocol.seichain.tokenfactory\032\024gogop" +
      "roto/gogo.proto\032\036cosmos/base/v1beta1/coi" +
      "n.proto\"?\n\026DenomAuthorityMetadata\022\037\n\005adm" +
      "in\030\001 \001(\tB\020\362\336\037\014yaml:\"admin\":\004\350\240\037\001B8Z6gith" +
      "ub.com/sei-protocol/sei-chain/x/tokenfac" +
      "tory/typesb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.protobuf.GoGoProtos.getDescriptor(),
          cosmos.base.v1beta1.CoinOuterClass.getDescriptor(),
        });
    internal_static_seiprotocol_seichain_tokenfactory_DenomAuthorityMetadata_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_seiprotocol_seichain_tokenfactory_DenomAuthorityMetadata_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_seiprotocol_seichain_tokenfactory_DenomAuthorityMetadata_descriptor,
        new java.lang.String[] { "Admin", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.protobuf.GoGoProtos.equal);
    registry.add(com.google.protobuf.GoGoProtos.moretags);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.google.protobuf.GoGoProtos.getDescriptor();
    cosmos.base.v1beta1.CoinOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
