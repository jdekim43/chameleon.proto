// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: cosmos/bank/module/v1/module.proto

package cosmos.bank.module.v1;

public final class ModuleOuterClass {
  private ModuleOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface ModuleOrBuilder extends
      // @@protoc_insertion_point(interface_extends:cosmos.bank.module.v1.Module)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <pre>
     * blocked_module_accounts configures exceptional module accounts which should be blocked from receiving funds.
     * If left empty it defaults to the list of account names supplied in the auth module configuration as
     * module_account_permissions
     * </pre>
     *
     * <code>repeated string blocked_module_accounts_override = 1;</code>
     * @return A list containing the blockedModuleAccountsOverride.
     */
    java.util.List<java.lang.String>
        getBlockedModuleAccountsOverrideList();
    /**
     * <pre>
     * blocked_module_accounts configures exceptional module accounts which should be blocked from receiving funds.
     * If left empty it defaults to the list of account names supplied in the auth module configuration as
     * module_account_permissions
     * </pre>
     *
     * <code>repeated string blocked_module_accounts_override = 1;</code>
     * @return The count of blockedModuleAccountsOverride.
     */
    int getBlockedModuleAccountsOverrideCount();
    /**
     * <pre>
     * blocked_module_accounts configures exceptional module accounts which should be blocked from receiving funds.
     * If left empty it defaults to the list of account names supplied in the auth module configuration as
     * module_account_permissions
     * </pre>
     *
     * <code>repeated string blocked_module_accounts_override = 1;</code>
     * @param index The index of the element to return.
     * @return The blockedModuleAccountsOverride at the given index.
     */
    java.lang.String getBlockedModuleAccountsOverride(int index);
    /**
     * <pre>
     * blocked_module_accounts configures exceptional module accounts which should be blocked from receiving funds.
     * If left empty it defaults to the list of account names supplied in the auth module configuration as
     * module_account_permissions
     * </pre>
     *
     * <code>repeated string blocked_module_accounts_override = 1;</code>
     * @param index The index of the value to return.
     * @return The bytes of the blockedModuleAccountsOverride at the given index.
     */
    com.google.protobuf.ByteString
        getBlockedModuleAccountsOverrideBytes(int index);

    /**
     * <pre>
     * authority defines the custom module authority. If not set, defaults to the governance module.
     * </pre>
     *
     * <code>string authority = 2;</code>
     * @return The authority.
     */
    java.lang.String getAuthority();
    /**
     * <pre>
     * authority defines the custom module authority. If not set, defaults to the governance module.
     * </pre>
     *
     * <code>string authority = 2;</code>
     * @return The bytes for authority.
     */
    com.google.protobuf.ByteString
        getAuthorityBytes();
  }
  /**
   * <pre>
   * Module is the config object of the bank module.
   * </pre>
   *
   * Protobuf type {@code cosmos.bank.module.v1.Module}
   */
  public static final class Module extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:cosmos.bank.module.v1.Module)
      ModuleOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use Module.newBuilder() to construct.
    private Module(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private Module() {
      blockedModuleAccountsOverride_ =
          com.google.protobuf.LazyStringArrayList.emptyList();
      authority_ = "";
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new Module();
    }

    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return cosmos.bank.module.v1.ModuleOuterClass.internal_static_cosmos_bank_module_v1_Module_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return cosmos.bank.module.v1.ModuleOuterClass.internal_static_cosmos_bank_module_v1_Module_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              cosmos.bank.module.v1.ModuleOuterClass.Module.class, cosmos.bank.module.v1.ModuleOuterClass.Module.Builder.class);
    }

    public static final int BLOCKED_MODULE_ACCOUNTS_OVERRIDE_FIELD_NUMBER = 1;
    @SuppressWarnings("serial")
    private com.google.protobuf.LazyStringArrayList blockedModuleAccountsOverride_ =
        com.google.protobuf.LazyStringArrayList.emptyList();
    /**
     * <pre>
     * blocked_module_accounts configures exceptional module accounts which should be blocked from receiving funds.
     * If left empty it defaults to the list of account names supplied in the auth module configuration as
     * module_account_permissions
     * </pre>
     *
     * <code>repeated string blocked_module_accounts_override = 1;</code>
     * @return A list containing the blockedModuleAccountsOverride.
     */
    public com.google.protobuf.ProtocolStringList
        getBlockedModuleAccountsOverrideList() {
      return blockedModuleAccountsOverride_;
    }
    /**
     * <pre>
     * blocked_module_accounts configures exceptional module accounts which should be blocked from receiving funds.
     * If left empty it defaults to the list of account names supplied in the auth module configuration as
     * module_account_permissions
     * </pre>
     *
     * <code>repeated string blocked_module_accounts_override = 1;</code>
     * @return The count of blockedModuleAccountsOverride.
     */
    public int getBlockedModuleAccountsOverrideCount() {
      return blockedModuleAccountsOverride_.size();
    }
    /**
     * <pre>
     * blocked_module_accounts configures exceptional module accounts which should be blocked from receiving funds.
     * If left empty it defaults to the list of account names supplied in the auth module configuration as
     * module_account_permissions
     * </pre>
     *
     * <code>repeated string blocked_module_accounts_override = 1;</code>
     * @param index The index of the element to return.
     * @return The blockedModuleAccountsOverride at the given index.
     */
    public java.lang.String getBlockedModuleAccountsOverride(int index) {
      return blockedModuleAccountsOverride_.get(index);
    }
    /**
     * <pre>
     * blocked_module_accounts configures exceptional module accounts which should be blocked from receiving funds.
     * If left empty it defaults to the list of account names supplied in the auth module configuration as
     * module_account_permissions
     * </pre>
     *
     * <code>repeated string blocked_module_accounts_override = 1;</code>
     * @param index The index of the value to return.
     * @return The bytes of the blockedModuleAccountsOverride at the given index.
     */
    public com.google.protobuf.ByteString
        getBlockedModuleAccountsOverrideBytes(int index) {
      return blockedModuleAccountsOverride_.getByteString(index);
    }

    public static final int AUTHORITY_FIELD_NUMBER = 2;
    @SuppressWarnings("serial")
    private volatile java.lang.Object authority_ = "";
    /**
     * <pre>
     * authority defines the custom module authority. If not set, defaults to the governance module.
     * </pre>
     *
     * <code>string authority = 2;</code>
     * @return The authority.
     */
    @java.lang.Override
    public java.lang.String getAuthority() {
      java.lang.Object ref = authority_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        authority_ = s;
        return s;
      }
    }
    /**
     * <pre>
     * authority defines the custom module authority. If not set, defaults to the governance module.
     * </pre>
     *
     * <code>string authority = 2;</code>
     * @return The bytes for authority.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString
        getAuthorityBytes() {
      java.lang.Object ref = authority_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        authority_ = b;
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
      for (int i = 0; i < blockedModuleAccountsOverride_.size(); i++) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 1, blockedModuleAccountsOverride_.getRaw(i));
      }
      if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(authority_)) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 2, authority_);
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      {
        int dataSize = 0;
        for (int i = 0; i < blockedModuleAccountsOverride_.size(); i++) {
          dataSize += computeStringSizeNoTag(blockedModuleAccountsOverride_.getRaw(i));
        }
        size += dataSize;
        size += 1 * getBlockedModuleAccountsOverrideList().size();
      }
      if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(authority_)) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, authority_);
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
      if (!(obj instanceof cosmos.bank.module.v1.ModuleOuterClass.Module)) {
        return super.equals(obj);
      }
      cosmos.bank.module.v1.ModuleOuterClass.Module other = (cosmos.bank.module.v1.ModuleOuterClass.Module) obj;

      if (!getBlockedModuleAccountsOverrideList()
          .equals(other.getBlockedModuleAccountsOverrideList())) return false;
      if (!getAuthority()
          .equals(other.getAuthority())) return false;
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
      if (getBlockedModuleAccountsOverrideCount() > 0) {
        hash = (37 * hash) + BLOCKED_MODULE_ACCOUNTS_OVERRIDE_FIELD_NUMBER;
        hash = (53 * hash) + getBlockedModuleAccountsOverrideList().hashCode();
      }
      hash = (37 * hash) + AUTHORITY_FIELD_NUMBER;
      hash = (53 * hash) + getAuthority().hashCode();
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static cosmos.bank.module.v1.ModuleOuterClass.Module parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static cosmos.bank.module.v1.ModuleOuterClass.Module parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static cosmos.bank.module.v1.ModuleOuterClass.Module parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static cosmos.bank.module.v1.ModuleOuterClass.Module parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static cosmos.bank.module.v1.ModuleOuterClass.Module parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static cosmos.bank.module.v1.ModuleOuterClass.Module parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static cosmos.bank.module.v1.ModuleOuterClass.Module parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static cosmos.bank.module.v1.ModuleOuterClass.Module parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static cosmos.bank.module.v1.ModuleOuterClass.Module parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static cosmos.bank.module.v1.ModuleOuterClass.Module parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static cosmos.bank.module.v1.ModuleOuterClass.Module parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static cosmos.bank.module.v1.ModuleOuterClass.Module parseFrom(
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
    public static Builder newBuilder(cosmos.bank.module.v1.ModuleOuterClass.Module prototype) {
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
     * Module is the config object of the bank module.
     * </pre>
     *
     * Protobuf type {@code cosmos.bank.module.v1.Module}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:cosmos.bank.module.v1.Module)
        cosmos.bank.module.v1.ModuleOuterClass.ModuleOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return cosmos.bank.module.v1.ModuleOuterClass.internal_static_cosmos_bank_module_v1_Module_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return cosmos.bank.module.v1.ModuleOuterClass.internal_static_cosmos_bank_module_v1_Module_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                cosmos.bank.module.v1.ModuleOuterClass.Module.class, cosmos.bank.module.v1.ModuleOuterClass.Module.Builder.class);
      }

      // Construct using cosmos.bank.module.v1.ModuleOuterClass.Module.newBuilder()
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
        blockedModuleAccountsOverride_ =
            com.google.protobuf.LazyStringArrayList.emptyList();
        authority_ = "";
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return cosmos.bank.module.v1.ModuleOuterClass.internal_static_cosmos_bank_module_v1_Module_descriptor;
      }

      @java.lang.Override
      public cosmos.bank.module.v1.ModuleOuterClass.Module getDefaultInstanceForType() {
        return cosmos.bank.module.v1.ModuleOuterClass.Module.getDefaultInstance();
      }

      @java.lang.Override
      public cosmos.bank.module.v1.ModuleOuterClass.Module build() {
        cosmos.bank.module.v1.ModuleOuterClass.Module result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public cosmos.bank.module.v1.ModuleOuterClass.Module buildPartial() {
        cosmos.bank.module.v1.ModuleOuterClass.Module result = new cosmos.bank.module.v1.ModuleOuterClass.Module(this);
        if (bitField0_ != 0) { buildPartial0(result); }
        onBuilt();
        return result;
      }

      private void buildPartial0(cosmos.bank.module.v1.ModuleOuterClass.Module result) {
        int from_bitField0_ = bitField0_;
        if (((from_bitField0_ & 0x00000001) != 0)) {
          blockedModuleAccountsOverride_.makeImmutable();
          result.blockedModuleAccountsOverride_ = blockedModuleAccountsOverride_;
        }
        if (((from_bitField0_ & 0x00000002) != 0)) {
          result.authority_ = authority_;
        }
      }

      @java.lang.Override
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof cosmos.bank.module.v1.ModuleOuterClass.Module) {
          return mergeFrom((cosmos.bank.module.v1.ModuleOuterClass.Module)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(cosmos.bank.module.v1.ModuleOuterClass.Module other) {
        if (other == cosmos.bank.module.v1.ModuleOuterClass.Module.getDefaultInstance()) return this;
        if (!other.blockedModuleAccountsOverride_.isEmpty()) {
          if (blockedModuleAccountsOverride_.isEmpty()) {
            blockedModuleAccountsOverride_ = other.blockedModuleAccountsOverride_;
            bitField0_ |= 0x00000001;
          } else {
            ensureBlockedModuleAccountsOverrideIsMutable();
            blockedModuleAccountsOverride_.addAll(other.blockedModuleAccountsOverride_);
          }
          onChanged();
        }
        if (!other.getAuthority().isEmpty()) {
          authority_ = other.authority_;
          bitField0_ |= 0x00000002;
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
                java.lang.String s = input.readStringRequireUtf8();
                ensureBlockedModuleAccountsOverrideIsMutable();
                blockedModuleAccountsOverride_.add(s);
                break;
              } // case 10
              case 18: {
                authority_ = input.readStringRequireUtf8();
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

      private com.google.protobuf.LazyStringArrayList blockedModuleAccountsOverride_ =
          com.google.protobuf.LazyStringArrayList.emptyList();
      private void ensureBlockedModuleAccountsOverrideIsMutable() {
        if (!blockedModuleAccountsOverride_.isModifiable()) {
          blockedModuleAccountsOverride_ = new com.google.protobuf.LazyStringArrayList(blockedModuleAccountsOverride_);
        }
        bitField0_ |= 0x00000001;
      }
      /**
       * <pre>
       * blocked_module_accounts configures exceptional module accounts which should be blocked from receiving funds.
       * If left empty it defaults to the list of account names supplied in the auth module configuration as
       * module_account_permissions
       * </pre>
       *
       * <code>repeated string blocked_module_accounts_override = 1;</code>
       * @return A list containing the blockedModuleAccountsOverride.
       */
      public com.google.protobuf.ProtocolStringList
          getBlockedModuleAccountsOverrideList() {
        blockedModuleAccountsOverride_.makeImmutable();
        return blockedModuleAccountsOverride_;
      }
      /**
       * <pre>
       * blocked_module_accounts configures exceptional module accounts which should be blocked from receiving funds.
       * If left empty it defaults to the list of account names supplied in the auth module configuration as
       * module_account_permissions
       * </pre>
       *
       * <code>repeated string blocked_module_accounts_override = 1;</code>
       * @return The count of blockedModuleAccountsOverride.
       */
      public int getBlockedModuleAccountsOverrideCount() {
        return blockedModuleAccountsOverride_.size();
      }
      /**
       * <pre>
       * blocked_module_accounts configures exceptional module accounts which should be blocked from receiving funds.
       * If left empty it defaults to the list of account names supplied in the auth module configuration as
       * module_account_permissions
       * </pre>
       *
       * <code>repeated string blocked_module_accounts_override = 1;</code>
       * @param index The index of the element to return.
       * @return The blockedModuleAccountsOverride at the given index.
       */
      public java.lang.String getBlockedModuleAccountsOverride(int index) {
        return blockedModuleAccountsOverride_.get(index);
      }
      /**
       * <pre>
       * blocked_module_accounts configures exceptional module accounts which should be blocked from receiving funds.
       * If left empty it defaults to the list of account names supplied in the auth module configuration as
       * module_account_permissions
       * </pre>
       *
       * <code>repeated string blocked_module_accounts_override = 1;</code>
       * @param index The index of the value to return.
       * @return The bytes of the blockedModuleAccountsOverride at the given index.
       */
      public com.google.protobuf.ByteString
          getBlockedModuleAccountsOverrideBytes(int index) {
        return blockedModuleAccountsOverride_.getByteString(index);
      }
      /**
       * <pre>
       * blocked_module_accounts configures exceptional module accounts which should be blocked from receiving funds.
       * If left empty it defaults to the list of account names supplied in the auth module configuration as
       * module_account_permissions
       * </pre>
       *
       * <code>repeated string blocked_module_accounts_override = 1;</code>
       * @param index The index to set the value at.
       * @param value The blockedModuleAccountsOverride to set.
       * @return This builder for chaining.
       */
      public Builder setBlockedModuleAccountsOverride(
          int index, java.lang.String value) {
        if (value == null) { throw new NullPointerException(); }
        ensureBlockedModuleAccountsOverrideIsMutable();
        blockedModuleAccountsOverride_.set(index, value);
        bitField0_ |= 0x00000001;
        onChanged();
        return this;
      }
      /**
       * <pre>
       * blocked_module_accounts configures exceptional module accounts which should be blocked from receiving funds.
       * If left empty it defaults to the list of account names supplied in the auth module configuration as
       * module_account_permissions
       * </pre>
       *
       * <code>repeated string blocked_module_accounts_override = 1;</code>
       * @param value The blockedModuleAccountsOverride to add.
       * @return This builder for chaining.
       */
      public Builder addBlockedModuleAccountsOverride(
          java.lang.String value) {
        if (value == null) { throw new NullPointerException(); }
        ensureBlockedModuleAccountsOverrideIsMutable();
        blockedModuleAccountsOverride_.add(value);
        bitField0_ |= 0x00000001;
        onChanged();
        return this;
      }
      /**
       * <pre>
       * blocked_module_accounts configures exceptional module accounts which should be blocked from receiving funds.
       * If left empty it defaults to the list of account names supplied in the auth module configuration as
       * module_account_permissions
       * </pre>
       *
       * <code>repeated string blocked_module_accounts_override = 1;</code>
       * @param values The blockedModuleAccountsOverride to add.
       * @return This builder for chaining.
       */
      public Builder addAllBlockedModuleAccountsOverride(
          java.lang.Iterable<java.lang.String> values) {
        ensureBlockedModuleAccountsOverrideIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, blockedModuleAccountsOverride_);
        bitField0_ |= 0x00000001;
        onChanged();
        return this;
      }
      /**
       * <pre>
       * blocked_module_accounts configures exceptional module accounts which should be blocked from receiving funds.
       * If left empty it defaults to the list of account names supplied in the auth module configuration as
       * module_account_permissions
       * </pre>
       *
       * <code>repeated string blocked_module_accounts_override = 1;</code>
       * @return This builder for chaining.
       */
      public Builder clearBlockedModuleAccountsOverride() {
        blockedModuleAccountsOverride_ =
          com.google.protobuf.LazyStringArrayList.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);;
        onChanged();
        return this;
      }
      /**
       * <pre>
       * blocked_module_accounts configures exceptional module accounts which should be blocked from receiving funds.
       * If left empty it defaults to the list of account names supplied in the auth module configuration as
       * module_account_permissions
       * </pre>
       *
       * <code>repeated string blocked_module_accounts_override = 1;</code>
       * @param value The bytes of the blockedModuleAccountsOverride to add.
       * @return This builder for chaining.
       */
      public Builder addBlockedModuleAccountsOverrideBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) { throw new NullPointerException(); }
        checkByteStringIsUtf8(value);
        ensureBlockedModuleAccountsOverrideIsMutable();
        blockedModuleAccountsOverride_.add(value);
        bitField0_ |= 0x00000001;
        onChanged();
        return this;
      }

      private java.lang.Object authority_ = "";
      /**
       * <pre>
       * authority defines the custom module authority. If not set, defaults to the governance module.
       * </pre>
       *
       * <code>string authority = 2;</code>
       * @return The authority.
       */
      public java.lang.String getAuthority() {
        java.lang.Object ref = authority_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          authority_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <pre>
       * authority defines the custom module authority. If not set, defaults to the governance module.
       * </pre>
       *
       * <code>string authority = 2;</code>
       * @return The bytes for authority.
       */
      public com.google.protobuf.ByteString
          getAuthorityBytes() {
        java.lang.Object ref = authority_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          authority_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <pre>
       * authority defines the custom module authority. If not set, defaults to the governance module.
       * </pre>
       *
       * <code>string authority = 2;</code>
       * @param value The authority to set.
       * @return This builder for chaining.
       */
      public Builder setAuthority(
          java.lang.String value) {
        if (value == null) { throw new NullPointerException(); }
        authority_ = value;
        bitField0_ |= 0x00000002;
        onChanged();
        return this;
      }
      /**
       * <pre>
       * authority defines the custom module authority. If not set, defaults to the governance module.
       * </pre>
       *
       * <code>string authority = 2;</code>
       * @return This builder for chaining.
       */
      public Builder clearAuthority() {
        authority_ = getDefaultInstance().getAuthority();
        bitField0_ = (bitField0_ & ~0x00000002);
        onChanged();
        return this;
      }
      /**
       * <pre>
       * authority defines the custom module authority. If not set, defaults to the governance module.
       * </pre>
       *
       * <code>string authority = 2;</code>
       * @param value The bytes for authority to set.
       * @return This builder for chaining.
       */
      public Builder setAuthorityBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) { throw new NullPointerException(); }
        checkByteStringIsUtf8(value);
        authority_ = value;
        bitField0_ |= 0x00000002;
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


      // @@protoc_insertion_point(builder_scope:cosmos.bank.module.v1.Module)
    }

    // @@protoc_insertion_point(class_scope:cosmos.bank.module.v1.Module)
    private static final cosmos.bank.module.v1.ModuleOuterClass.Module DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new cosmos.bank.module.v1.ModuleOuterClass.Module();
    }

    public static cosmos.bank.module.v1.ModuleOuterClass.Module getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<Module>
        PARSER = new com.google.protobuf.AbstractParser<Module>() {
      @java.lang.Override
      public Module parsePartialFrom(
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

    public static com.google.protobuf.Parser<Module> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<Module> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public cosmos.bank.module.v1.ModuleOuterClass.Module getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_cosmos_bank_module_v1_Module_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_cosmos_bank_module_v1_Module_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\"cosmos/bank/module/v1/module.proto\022\025co" +
      "smos.bank.module.v1\032 cosmos/app/v1alpha1" +
      "/module.proto\"r\n\006Module\022(\n blocked_modul" +
      "e_accounts_override\030\001 \003(\t\022\021\n\tauthority\030\002" +
      " \001(\t:+\272\300\226\332\001%\n#github.com/cosmos/cosmos-s" +
      "dk/x/bankb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          cosmos.app.v1alpha1.Module.getDescriptor(),
        });
    internal_static_cosmos_bank_module_v1_Module_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_cosmos_bank_module_v1_Module_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_cosmos_bank_module_v1_Module_descriptor,
        new java.lang.String[] { "BlockedModuleAccountsOverride", "Authority", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(cosmos.app.v1alpha1.Module.module);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    cosmos.app.v1alpha1.Module.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
