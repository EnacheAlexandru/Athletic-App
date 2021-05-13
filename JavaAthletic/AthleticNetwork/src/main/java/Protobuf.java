// source: Protocol_v3.proto

public final class Protobuf {
  private Protobuf() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  /**
   * Protobuf enum {@code Event}
   */
  public enum Event
      implements com.google.protobuf.ProtocolMessageEnum {
    /**
     * <code>NONE = 0;</code>
     */
    NONE(0),
    /**
     * <code>E50M = 1;</code>
     */
    E50M(1),
    /**
     * <code>E100M = 2;</code>
     */
    E100M(2),
    /**
     * <code>E1000M = 3;</code>
     */
    E1000M(3),
    /**
     * <code>E1500M = 4;</code>
     */
    E1500M(4),
    UNRECOGNIZED(-1),
    ;

    /**
     * <code>NONE = 0;</code>
     */
    public static final int NONE_VALUE = 0;
    /**
     * <code>E50M = 1;</code>
     */
    public static final int E50M_VALUE = 1;
    /**
     * <code>E100M = 2;</code>
     */
    public static final int E100M_VALUE = 2;
    /**
     * <code>E1000M = 3;</code>
     */
    public static final int E1000M_VALUE = 3;
    /**
     * <code>E1500M = 4;</code>
     */
    public static final int E1500M_VALUE = 4;


    public final int getNumber() {
      if (this == UNRECOGNIZED) {
        throw new IllegalArgumentException(
            "Can't get the number of an unknown enum value.");
      }
      return value;
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     * @deprecated Use {@link #forNumber(int)} instead.
     */
    @Deprecated
    public static Event valueOf(int value) {
      return forNumber(value);
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     */
    public static Event forNumber(int value) {
      switch (value) {
        case 0: return NONE;
        case 1: return E50M;
        case 2: return E100M;
        case 3: return E1000M;
        case 4: return E1500M;
        default: return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<Event>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static final com.google.protobuf.Internal.EnumLiteMap<
        Event> internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<Event>() {
            public Event findValueByNumber(int number) {
              return Event.forNumber(number);
            }
          };

    public final com.google.protobuf.Descriptors.EnumValueDescriptor
        getValueDescriptor() {
      if (this == UNRECOGNIZED) {
        throw new IllegalStateException(
            "Can't get the descriptor of an unrecognized enum value.");
      }
      return getDescriptor().getValues().get(ordinal());
    }
    public final com.google.protobuf.Descriptors.EnumDescriptor
        getDescriptorForType() {
      return getDescriptor();
    }
    public static final com.google.protobuf.Descriptors.EnumDescriptor
        getDescriptor() {
      return Protobuf.getDescriptor().getEnumTypes().get(0);
    }

    private static final Event[] VALUES = values();

    public static Event valueOf(
        com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
      if (desc.getType() != getDescriptor()) {
        throw new IllegalArgumentException(
          "EnumValueDescriptor is not for this type.");
      }
      if (desc.getIndex() == -1) {
        return UNRECOGNIZED;
      }
      return VALUES[desc.getIndex()];
    }

    private final int value;

    private Event(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:Event)
  }

  /**
   * Protobuf enum {@code AgeGroup}
   */
  public enum AgeGroup
      implements com.google.protobuf.ProtocolMessageEnum {
    /**
     * <code>A6_8Y = 0;</code>
     */
    A6_8Y(0),
    /**
     * <code>A9_11Y = 1;</code>
     */
    A9_11Y(1),
    /**
     * <code>A12_15Y = 2;</code>
     */
    A12_15Y(2),
    UNRECOGNIZED(-1),
    ;

    /**
     * <code>A6_8Y = 0;</code>
     */
    public static final int A6_8Y_VALUE = 0;
    /**
     * <code>A9_11Y = 1;</code>
     */
    public static final int A9_11Y_VALUE = 1;
    /**
     * <code>A12_15Y = 2;</code>
     */
    public static final int A12_15Y_VALUE = 2;


    public final int getNumber() {
      if (this == UNRECOGNIZED) {
        throw new IllegalArgumentException(
            "Can't get the number of an unknown enum value.");
      }
      return value;
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     * @deprecated Use {@link #forNumber(int)} instead.
     */
    @Deprecated
    public static AgeGroup valueOf(int value) {
      return forNumber(value);
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     */
    public static AgeGroup forNumber(int value) {
      switch (value) {
        case 0: return A6_8Y;
        case 1: return A9_11Y;
        case 2: return A12_15Y;
        default: return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<AgeGroup>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static final com.google.protobuf.Internal.EnumLiteMap<
        AgeGroup> internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<AgeGroup>() {
            public AgeGroup findValueByNumber(int number) {
              return AgeGroup.forNumber(number);
            }
          };

    public final com.google.protobuf.Descriptors.EnumValueDescriptor
        getValueDescriptor() {
      if (this == UNRECOGNIZED) {
        throw new IllegalStateException(
            "Can't get the descriptor of an unrecognized enum value.");
      }
      return getDescriptor().getValues().get(ordinal());
    }
    public final com.google.protobuf.Descriptors.EnumDescriptor
        getDescriptorForType() {
      return getDescriptor();
    }
    public static final com.google.protobuf.Descriptors.EnumDescriptor
        getDescriptor() {
      return Protobuf.getDescriptor().getEnumTypes().get(1);
    }

    private static final AgeGroup[] VALUES = values();

    public static AgeGroup valueOf(
        com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
      if (desc.getType() != getDescriptor()) {
        throw new IllegalArgumentException(
          "EnumValueDescriptor is not for this type.");
      }
      if (desc.getIndex() == -1) {
        return UNRECOGNIZED;
      }
      return VALUES[desc.getIndex()];
    }

    private final int value;

    private AgeGroup(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:AgeGroup)
  }

  public interface UserOrBuilder extends
      // @@protoc_insertion_point(interface_extends:User)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>string username = 1;</code>
     * @return The username.
     */
    String getUsername();
    /**
     * <code>string username = 1;</code>
     * @return The bytes for username.
     */
    com.google.protobuf.ByteString
        getUsernameBytes();

    /**
     * <code>string password = 2;</code>
     * @return The password.
     */
    String getPassword();
    /**
     * <code>string password = 2;</code>
     * @return The bytes for password.
     */
    com.google.protobuf.ByteString
        getPasswordBytes();
  }
  /**
   * Protobuf type {@code User}
   */
  public static final class User extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:User)
      UserOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use User.newBuilder() to construct.
    private User(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private User() {
      username_ = "";
      password_ = "";
    }

    @Override
    @SuppressWarnings({"unused"})
    protected Object newInstance(
        UnusedPrivateParameter unused) {
      return new User();
    }

    @Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private User(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      this();
      if (extensionRegistry == null) {
        throw new NullPointerException();
      }
      com.google.protobuf.UnknownFieldSet.Builder unknownFields =
          com.google.protobuf.UnknownFieldSet.newBuilder();
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            case 10: {
              String s = input.readStringRequireUtf8();

              username_ = s;
              break;
            }
            case 18: {
              String s = input.readStringRequireUtf8();

              password_ = s;
              break;
            }
            default: {
              if (!parseUnknownField(
                  input, unknownFields, extensionRegistry, tag)) {
                done = true;
              }
              break;
            }
          }
        }
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(this);
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(
            e).setUnfinishedMessage(this);
      } finally {
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return Protobuf.internal_static_User_descriptor;
    }

    @Override
    protected FieldAccessorTable
        internalGetFieldAccessorTable() {
      return Protobuf.internal_static_User_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              User.class, Builder.class);
    }

    public static final int USERNAME_FIELD_NUMBER = 1;
    private volatile Object username_;
    /**
     * <code>string username = 1;</code>
     * @return The username.
     */
    @Override
    public String getUsername() {
      Object ref = username_;
      if (ref instanceof String) {
        return (String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        String s = bs.toStringUtf8();
        username_ = s;
        return s;
      }
    }
    /**
     * <code>string username = 1;</code>
     * @return The bytes for username.
     */
    @Override
    public com.google.protobuf.ByteString
        getUsernameBytes() {
      Object ref = username_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (String) ref);
        username_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int PASSWORD_FIELD_NUMBER = 2;
    private volatile Object password_;
    /**
     * <code>string password = 2;</code>
     * @return The password.
     */
    @Override
    public String getPassword() {
      Object ref = password_;
      if (ref instanceof String) {
        return (String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        String s = bs.toStringUtf8();
        password_ = s;
        return s;
      }
    }
    /**
     * <code>string password = 2;</code>
     * @return The bytes for password.
     */
    @Override
    public com.google.protobuf.ByteString
        getPasswordBytes() {
      Object ref = password_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (String) ref);
        password_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    private byte memoizedIsInitialized = -1;
    @Override
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      memoizedIsInitialized = 1;
      return true;
    }

    @Override
    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      if (!getUsernameBytes().isEmpty()) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 1, username_);
      }
      if (!getPasswordBytes().isEmpty()) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 2, password_);
      }
      unknownFields.writeTo(output);
    }

    @Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (!getUsernameBytes().isEmpty()) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, username_);
      }
      if (!getPasswordBytes().isEmpty()) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, password_);
      }
      size += unknownFields.getSerializedSize();
      memoizedSize = size;
      return size;
    }

    @Override
    public boolean equals(final Object obj) {
      if (obj == this) {
       return true;
      }
      if (!(obj instanceof User)) {
        return super.equals(obj);
      }
      User other = (User) obj;

      if (!getUsername()
          .equals(other.getUsername())) return false;
      if (!getPassword()
          .equals(other.getPassword())) return false;
      if (!unknownFields.equals(other.unknownFields)) return false;
      return true;
    }

    @Override
    public int hashCode() {
      if (memoizedHashCode != 0) {
        return memoizedHashCode;
      }
      int hash = 41;
      hash = (19 * hash) + getDescriptor().hashCode();
      hash = (37 * hash) + USERNAME_FIELD_NUMBER;
      hash = (53 * hash) + getUsername().hashCode();
      hash = (37 * hash) + PASSWORD_FIELD_NUMBER;
      hash = (53 * hash) + getPassword().hashCode();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static User parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static User parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static User parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static User parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static User parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static User parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static User parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static User parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static User parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static User parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static User parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static User parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    @Override
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
    }
    public static Builder newBuilder(User prototype) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }
    @Override
    public Builder toBuilder() {
      return this == DEFAULT_INSTANCE
          ? new Builder() : new Builder().mergeFrom(this);
    }

    @Override
    protected Builder newBuilderForType(
        BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    /**
     * Protobuf type {@code User}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:User)
        UserOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return Protobuf.internal_static_User_descriptor;
      }

      @Override
      protected FieldAccessorTable
          internalGetFieldAccessorTable() {
        return Protobuf.internal_static_User_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                User.class, Builder.class);
      }

      // Construct using Protobuf.User.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }

      private Builder(
          BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }
      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessageV3
                .alwaysUseFieldBuilders) {
        }
      }
      @Override
      public Builder clear() {
        super.clear();
        username_ = "";

        password_ = "";

        return this;
      }

      @Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return Protobuf.internal_static_User_descriptor;
      }

      @Override
      public User getDefaultInstanceForType() {
        return User.getDefaultInstance();
      }

      @Override
      public User build() {
        User result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @Override
      public User buildPartial() {
        User result = new User(this);
        result.username_ = username_;
        result.password_ = password_;
        onBuilt();
        return result;
      }

      @Override
      public Builder clone() {
        return super.clone();
      }
      @Override
      public Builder setField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          Object value) {
        return super.setField(field, value);
      }
      @Override
      public Builder clearField(
          com.google.protobuf.Descriptors.FieldDescriptor field) {
        return super.clearField(field);
      }
      @Override
      public Builder clearOneof(
          com.google.protobuf.Descriptors.OneofDescriptor oneof) {
        return super.clearOneof(oneof);
      }
      @Override
      public Builder setRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          int index, Object value) {
        return super.setRepeatedField(field, index, value);
      }
      @Override
      public Builder addRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          Object value) {
        return super.addRepeatedField(field, value);
      }
      @Override
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof User) {
          return mergeFrom((User)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(User other) {
        if (other == User.getDefaultInstance()) return this;
        if (!other.getUsername().isEmpty()) {
          username_ = other.username_;
          onChanged();
        }
        if (!other.getPassword().isEmpty()) {
          password_ = other.password_;
          onChanged();
        }
        this.mergeUnknownFields(other.unknownFields);
        onChanged();
        return this;
      }

      @Override
      public final boolean isInitialized() {
        return true;
      }

      @Override
      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        User parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (User) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private Object username_ = "";
      /**
       * <code>string username = 1;</code>
       * @return The username.
       */
      public String getUsername() {
        Object ref = username_;
        if (!(ref instanceof String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          String s = bs.toStringUtf8();
          username_ = s;
          return s;
        } else {
          return (String) ref;
        }
      }
      /**
       * <code>string username = 1;</code>
       * @return The bytes for username.
       */
      public com.google.protobuf.ByteString
          getUsernameBytes() {
        Object ref = username_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (String) ref);
          username_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>string username = 1;</code>
       * @param value The username to set.
       * @return This builder for chaining.
       */
      public Builder setUsername(
          String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  
        username_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>string username = 1;</code>
       * @return This builder for chaining.
       */
      public Builder clearUsername() {
        
        username_ = getDefaultInstance().getUsername();
        onChanged();
        return this;
      }
      /**
       * <code>string username = 1;</code>
       * @param value The bytes for username to set.
       * @return This builder for chaining.
       */
      public Builder setUsernameBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
        
        username_ = value;
        onChanged();
        return this;
      }

      private Object password_ = "";
      /**
       * <code>string password = 2;</code>
       * @return The password.
       */
      public String getPassword() {
        Object ref = password_;
        if (!(ref instanceof String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          String s = bs.toStringUtf8();
          password_ = s;
          return s;
        } else {
          return (String) ref;
        }
      }
      /**
       * <code>string password = 2;</code>
       * @return The bytes for password.
       */
      public com.google.protobuf.ByteString
          getPasswordBytes() {
        Object ref = password_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (String) ref);
          password_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>string password = 2;</code>
       * @param value The password to set.
       * @return This builder for chaining.
       */
      public Builder setPassword(
          String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  
        password_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>string password = 2;</code>
       * @return This builder for chaining.
       */
      public Builder clearPassword() {
        
        password_ = getDefaultInstance().getPassword();
        onChanged();
        return this;
      }
      /**
       * <code>string password = 2;</code>
       * @param value The bytes for password to set.
       * @return This builder for chaining.
       */
      public Builder setPasswordBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
        
        password_ = value;
        onChanged();
        return this;
      }
      @Override
      public final Builder setUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.setUnknownFields(unknownFields);
      }

      @Override
      public final Builder mergeUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.mergeUnknownFields(unknownFields);
      }


      // @@protoc_insertion_point(builder_scope:User)
    }

    // @@protoc_insertion_point(class_scope:User)
    private static final User DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new User();
    }

    public static User getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<User>
        PARSER = new com.google.protobuf.AbstractParser<User>() {
      @Override
      public User parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new User(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<User> parser() {
      return PARSER;
    }

    @Override
    public com.google.protobuf.Parser<User> getParserForType() {
      return PARSER;
    }

    @Override
    public User getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  public interface ChildOrBuilder extends
      // @@protoc_insertion_point(interface_extends:Child)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>string name = 1;</code>
     * @return The name.
     */
    String getName();
    /**
     * <code>string name = 1;</code>
     * @return The bytes for name.
     */
    com.google.protobuf.ByteString
        getNameBytes();

    /**
     * <code>int32 age = 2;</code>
     * @return The age.
     */
    int getAge();
  }
  /**
   * Protobuf type {@code Child}
   */
  public static final class Child extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:Child)
      ChildOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use Child.newBuilder() to construct.
    private Child(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private Child() {
      name_ = "";
    }

    @Override
    @SuppressWarnings({"unused"})
    protected Object newInstance(
        UnusedPrivateParameter unused) {
      return new Child();
    }

    @Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private Child(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      this();
      if (extensionRegistry == null) {
        throw new NullPointerException();
      }
      com.google.protobuf.UnknownFieldSet.Builder unknownFields =
          com.google.protobuf.UnknownFieldSet.newBuilder();
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            case 10: {
              String s = input.readStringRequireUtf8();

              name_ = s;
              break;
            }
            case 16: {

              age_ = input.readInt32();
              break;
            }
            default: {
              if (!parseUnknownField(
                  input, unknownFields, extensionRegistry, tag)) {
                done = true;
              }
              break;
            }
          }
        }
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(this);
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(
            e).setUnfinishedMessage(this);
      } finally {
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return Protobuf.internal_static_Child_descriptor;
    }

    @Override
    protected FieldAccessorTable
        internalGetFieldAccessorTable() {
      return Protobuf.internal_static_Child_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              Child.class, Builder.class);
    }

    public static final int NAME_FIELD_NUMBER = 1;
    private volatile Object name_;
    /**
     * <code>string name = 1;</code>
     * @return The name.
     */
    @Override
    public String getName() {
      Object ref = name_;
      if (ref instanceof String) {
        return (String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        String s = bs.toStringUtf8();
        name_ = s;
        return s;
      }
    }
    /**
     * <code>string name = 1;</code>
     * @return The bytes for name.
     */
    @Override
    public com.google.protobuf.ByteString
        getNameBytes() {
      Object ref = name_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (String) ref);
        name_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int AGE_FIELD_NUMBER = 2;
    private int age_;
    /**
     * <code>int32 age = 2;</code>
     * @return The age.
     */
    @Override
    public int getAge() {
      return age_;
    }

    private byte memoizedIsInitialized = -1;
    @Override
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      memoizedIsInitialized = 1;
      return true;
    }

    @Override
    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      if (!getNameBytes().isEmpty()) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 1, name_);
      }
      if (age_ != 0) {
        output.writeInt32(2, age_);
      }
      unknownFields.writeTo(output);
    }

    @Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (!getNameBytes().isEmpty()) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, name_);
      }
      if (age_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(2, age_);
      }
      size += unknownFields.getSerializedSize();
      memoizedSize = size;
      return size;
    }

    @Override
    public boolean equals(final Object obj) {
      if (obj == this) {
       return true;
      }
      if (!(obj instanceof Child)) {
        return super.equals(obj);
      }
      Child other = (Child) obj;

      if (!getName()
          .equals(other.getName())) return false;
      if (getAge()
          != other.getAge()) return false;
      if (!unknownFields.equals(other.unknownFields)) return false;
      return true;
    }

    @Override
    public int hashCode() {
      if (memoizedHashCode != 0) {
        return memoizedHashCode;
      }
      int hash = 41;
      hash = (19 * hash) + getDescriptor().hashCode();
      hash = (37 * hash) + NAME_FIELD_NUMBER;
      hash = (53 * hash) + getName().hashCode();
      hash = (37 * hash) + AGE_FIELD_NUMBER;
      hash = (53 * hash) + getAge();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static Child parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static Child parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static Child parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static Child parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static Child parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static Child parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static Child parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static Child parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static Child parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static Child parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static Child parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static Child parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    @Override
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
    }
    public static Builder newBuilder(Child prototype) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }
    @Override
    public Builder toBuilder() {
      return this == DEFAULT_INSTANCE
          ? new Builder() : new Builder().mergeFrom(this);
    }

    @Override
    protected Builder newBuilderForType(
        BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    /**
     * Protobuf type {@code Child}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:Child)
        ChildOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return Protobuf.internal_static_Child_descriptor;
      }

      @Override
      protected FieldAccessorTable
          internalGetFieldAccessorTable() {
        return Protobuf.internal_static_Child_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                Child.class, Builder.class);
      }

      // Construct using Protobuf.Child.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }

      private Builder(
          BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }
      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessageV3
                .alwaysUseFieldBuilders) {
        }
      }
      @Override
      public Builder clear() {
        super.clear();
        name_ = "";

        age_ = 0;

        return this;
      }

      @Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return Protobuf.internal_static_Child_descriptor;
      }

      @Override
      public Child getDefaultInstanceForType() {
        return Child.getDefaultInstance();
      }

      @Override
      public Child build() {
        Child result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @Override
      public Child buildPartial() {
        Child result = new Child(this);
        result.name_ = name_;
        result.age_ = age_;
        onBuilt();
        return result;
      }

      @Override
      public Builder clone() {
        return super.clone();
      }
      @Override
      public Builder setField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          Object value) {
        return super.setField(field, value);
      }
      @Override
      public Builder clearField(
          com.google.protobuf.Descriptors.FieldDescriptor field) {
        return super.clearField(field);
      }
      @Override
      public Builder clearOneof(
          com.google.protobuf.Descriptors.OneofDescriptor oneof) {
        return super.clearOneof(oneof);
      }
      @Override
      public Builder setRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          int index, Object value) {
        return super.setRepeatedField(field, index, value);
      }
      @Override
      public Builder addRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          Object value) {
        return super.addRepeatedField(field, value);
      }
      @Override
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof Child) {
          return mergeFrom((Child)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(Child other) {
        if (other == Child.getDefaultInstance()) return this;
        if (!other.getName().isEmpty()) {
          name_ = other.name_;
          onChanged();
        }
        if (other.getAge() != 0) {
          setAge(other.getAge());
        }
        this.mergeUnknownFields(other.unknownFields);
        onChanged();
        return this;
      }

      @Override
      public final boolean isInitialized() {
        return true;
      }

      @Override
      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        Child parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (Child) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private Object name_ = "";
      /**
       * <code>string name = 1;</code>
       * @return The name.
       */
      public String getName() {
        Object ref = name_;
        if (!(ref instanceof String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          String s = bs.toStringUtf8();
          name_ = s;
          return s;
        } else {
          return (String) ref;
        }
      }
      /**
       * <code>string name = 1;</code>
       * @return The bytes for name.
       */
      public com.google.protobuf.ByteString
          getNameBytes() {
        Object ref = name_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (String) ref);
          name_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>string name = 1;</code>
       * @param value The name to set.
       * @return This builder for chaining.
       */
      public Builder setName(
          String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  
        name_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>string name = 1;</code>
       * @return This builder for chaining.
       */
      public Builder clearName() {
        
        name_ = getDefaultInstance().getName();
        onChanged();
        return this;
      }
      /**
       * <code>string name = 1;</code>
       * @param value The bytes for name to set.
       * @return This builder for chaining.
       */
      public Builder setNameBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
        
        name_ = value;
        onChanged();
        return this;
      }

      private int age_ ;
      /**
       * <code>int32 age = 2;</code>
       * @return The age.
       */
      @Override
      public int getAge() {
        return age_;
      }
      /**
       * <code>int32 age = 2;</code>
       * @param value The age to set.
       * @return This builder for chaining.
       */
      public Builder setAge(int value) {
        
        age_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>int32 age = 2;</code>
       * @return This builder for chaining.
       */
      public Builder clearAge() {
        
        age_ = 0;
        onChanged();
        return this;
      }
      @Override
      public final Builder setUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.setUnknownFields(unknownFields);
      }

      @Override
      public final Builder mergeUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.mergeUnknownFields(unknownFields);
      }


      // @@protoc_insertion_point(builder_scope:Child)
    }

    // @@protoc_insertion_point(class_scope:Child)
    private static final Child DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new Child();
    }

    public static Child getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<Child>
        PARSER = new com.google.protobuf.AbstractParser<Child>() {
      @Override
      public Child parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new Child(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<Child> parser() {
      return PARSER;
    }

    @Override
    public com.google.protobuf.Parser<Child> getParserForType() {
      return PARSER;
    }

    @Override
    public Child getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  public interface ParticipantDetailsDTOOrBuilder extends
      // @@protoc_insertion_point(interface_extends:ParticipantDetailsDTO)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>string name = 1;</code>
     * @return The name.
     */
    String getName();
    /**
     * <code>string name = 1;</code>
     * @return The bytes for name.
     */
    com.google.protobuf.ByteString
        getNameBytes();

    /**
     * <code>int32 age = 2;</code>
     * @return The age.
     */
    int getAge();

    /**
     * <code>.Event event1 = 3;</code>
     * @return The enum numeric value on the wire for event1.
     */
    int getEvent1Value();
    /**
     * <code>.Event event1 = 3;</code>
     * @return The event1.
     */
    Event getEvent1();

    /**
     * <code>.Event event2 = 4;</code>
     * @return The enum numeric value on the wire for event2.
     */
    int getEvent2Value();
    /**
     * <code>.Event event2 = 4;</code>
     * @return The event2.
     */
    Event getEvent2();
  }
  /**
   * Protobuf type {@code ParticipantDetailsDTO}
   */
  public static final class ParticipantDetailsDTO extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:ParticipantDetailsDTO)
      ParticipantDetailsDTOOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use ParticipantDetailsDTO.newBuilder() to construct.
    private ParticipantDetailsDTO(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private ParticipantDetailsDTO() {
      name_ = "";
      event1_ = 0;
      event2_ = 0;
    }

    @Override
    @SuppressWarnings({"unused"})
    protected Object newInstance(
        UnusedPrivateParameter unused) {
      return new ParticipantDetailsDTO();
    }

    @Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private ParticipantDetailsDTO(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      this();
      if (extensionRegistry == null) {
        throw new NullPointerException();
      }
      com.google.protobuf.UnknownFieldSet.Builder unknownFields =
          com.google.protobuf.UnknownFieldSet.newBuilder();
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            case 10: {
              String s = input.readStringRequireUtf8();

              name_ = s;
              break;
            }
            case 16: {

              age_ = input.readInt32();
              break;
            }
            case 24: {
              int rawValue = input.readEnum();

              event1_ = rawValue;
              break;
            }
            case 32: {
              int rawValue = input.readEnum();

              event2_ = rawValue;
              break;
            }
            default: {
              if (!parseUnknownField(
                  input, unknownFields, extensionRegistry, tag)) {
                done = true;
              }
              break;
            }
          }
        }
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(this);
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(
            e).setUnfinishedMessage(this);
      } finally {
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return Protobuf.internal_static_ParticipantDetailsDTO_descriptor;
    }

    @Override
    protected FieldAccessorTable
        internalGetFieldAccessorTable() {
      return Protobuf.internal_static_ParticipantDetailsDTO_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              ParticipantDetailsDTO.class, Builder.class);
    }

    public static final int NAME_FIELD_NUMBER = 1;
    private volatile Object name_;
    /**
     * <code>string name = 1;</code>
     * @return The name.
     */
    @Override
    public String getName() {
      Object ref = name_;
      if (ref instanceof String) {
        return (String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        String s = bs.toStringUtf8();
        name_ = s;
        return s;
      }
    }
    /**
     * <code>string name = 1;</code>
     * @return The bytes for name.
     */
    @Override
    public com.google.protobuf.ByteString
        getNameBytes() {
      Object ref = name_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (String) ref);
        name_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int AGE_FIELD_NUMBER = 2;
    private int age_;
    /**
     * <code>int32 age = 2;</code>
     * @return The age.
     */
    @Override
    public int getAge() {
      return age_;
    }

    public static final int EVENT1_FIELD_NUMBER = 3;
    private int event1_;
    /**
     * <code>.Event event1 = 3;</code>
     * @return The enum numeric value on the wire for event1.
     */
    @Override public int getEvent1Value() {
      return event1_;
    }
    /**
     * <code>.Event event1 = 3;</code>
     * @return The event1.
     */
    @Override public Event getEvent1() {
      @SuppressWarnings("deprecation")
      Event result = Event.valueOf(event1_);
      return result == null ? Event.UNRECOGNIZED : result;
    }

    public static final int EVENT2_FIELD_NUMBER = 4;
    private int event2_;
    /**
     * <code>.Event event2 = 4;</code>
     * @return The enum numeric value on the wire for event2.
     */
    @Override public int getEvent2Value() {
      return event2_;
    }
    /**
     * <code>.Event event2 = 4;</code>
     * @return The event2.
     */
    @Override public Event getEvent2() {
      @SuppressWarnings("deprecation")
      Event result = Event.valueOf(event2_);
      return result == null ? Event.UNRECOGNIZED : result;
    }

    private byte memoizedIsInitialized = -1;
    @Override
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      memoizedIsInitialized = 1;
      return true;
    }

    @Override
    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      if (!getNameBytes().isEmpty()) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 1, name_);
      }
      if (age_ != 0) {
        output.writeInt32(2, age_);
      }
      if (event1_ != Event.NONE.getNumber()) {
        output.writeEnum(3, event1_);
      }
      if (event2_ != Event.NONE.getNumber()) {
        output.writeEnum(4, event2_);
      }
      unknownFields.writeTo(output);
    }

    @Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (!getNameBytes().isEmpty()) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, name_);
      }
      if (age_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(2, age_);
      }
      if (event1_ != Event.NONE.getNumber()) {
        size += com.google.protobuf.CodedOutputStream
          .computeEnumSize(3, event1_);
      }
      if (event2_ != Event.NONE.getNumber()) {
        size += com.google.protobuf.CodedOutputStream
          .computeEnumSize(4, event2_);
      }
      size += unknownFields.getSerializedSize();
      memoizedSize = size;
      return size;
    }

    @Override
    public boolean equals(final Object obj) {
      if (obj == this) {
       return true;
      }
      if (!(obj instanceof ParticipantDetailsDTO)) {
        return super.equals(obj);
      }
      ParticipantDetailsDTO other = (ParticipantDetailsDTO) obj;

      if (!getName()
          .equals(other.getName())) return false;
      if (getAge()
          != other.getAge()) return false;
      if (event1_ != other.event1_) return false;
      if (event2_ != other.event2_) return false;
      if (!unknownFields.equals(other.unknownFields)) return false;
      return true;
    }

    @Override
    public int hashCode() {
      if (memoizedHashCode != 0) {
        return memoizedHashCode;
      }
      int hash = 41;
      hash = (19 * hash) + getDescriptor().hashCode();
      hash = (37 * hash) + NAME_FIELD_NUMBER;
      hash = (53 * hash) + getName().hashCode();
      hash = (37 * hash) + AGE_FIELD_NUMBER;
      hash = (53 * hash) + getAge();
      hash = (37 * hash) + EVENT1_FIELD_NUMBER;
      hash = (53 * hash) + event1_;
      hash = (37 * hash) + EVENT2_FIELD_NUMBER;
      hash = (53 * hash) + event2_;
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static ParticipantDetailsDTO parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static ParticipantDetailsDTO parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static ParticipantDetailsDTO parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static ParticipantDetailsDTO parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static ParticipantDetailsDTO parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static ParticipantDetailsDTO parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static ParticipantDetailsDTO parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static ParticipantDetailsDTO parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static ParticipantDetailsDTO parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static ParticipantDetailsDTO parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static ParticipantDetailsDTO parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static ParticipantDetailsDTO parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    @Override
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
    }
    public static Builder newBuilder(ParticipantDetailsDTO prototype) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }
    @Override
    public Builder toBuilder() {
      return this == DEFAULT_INSTANCE
          ? new Builder() : new Builder().mergeFrom(this);
    }

    @Override
    protected Builder newBuilderForType(
        BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    /**
     * Protobuf type {@code ParticipantDetailsDTO}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:ParticipantDetailsDTO)
        ParticipantDetailsDTOOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return Protobuf.internal_static_ParticipantDetailsDTO_descriptor;
      }

      @Override
      protected FieldAccessorTable
          internalGetFieldAccessorTable() {
        return Protobuf.internal_static_ParticipantDetailsDTO_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                ParticipantDetailsDTO.class, Builder.class);
      }

      // Construct using Protobuf.ParticipantDetailsDTO.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }

      private Builder(
          BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }
      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessageV3
                .alwaysUseFieldBuilders) {
        }
      }
      @Override
      public Builder clear() {
        super.clear();
        name_ = "";

        age_ = 0;

        event1_ = 0;

        event2_ = 0;

        return this;
      }

      @Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return Protobuf.internal_static_ParticipantDetailsDTO_descriptor;
      }

      @Override
      public ParticipantDetailsDTO getDefaultInstanceForType() {
        return ParticipantDetailsDTO.getDefaultInstance();
      }

      @Override
      public ParticipantDetailsDTO build() {
        ParticipantDetailsDTO result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @Override
      public ParticipantDetailsDTO buildPartial() {
        ParticipantDetailsDTO result = new ParticipantDetailsDTO(this);
        result.name_ = name_;
        result.age_ = age_;
        result.event1_ = event1_;
        result.event2_ = event2_;
        onBuilt();
        return result;
      }

      @Override
      public Builder clone() {
        return super.clone();
      }
      @Override
      public Builder setField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          Object value) {
        return super.setField(field, value);
      }
      @Override
      public Builder clearField(
          com.google.protobuf.Descriptors.FieldDescriptor field) {
        return super.clearField(field);
      }
      @Override
      public Builder clearOneof(
          com.google.protobuf.Descriptors.OneofDescriptor oneof) {
        return super.clearOneof(oneof);
      }
      @Override
      public Builder setRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          int index, Object value) {
        return super.setRepeatedField(field, index, value);
      }
      @Override
      public Builder addRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          Object value) {
        return super.addRepeatedField(field, value);
      }
      @Override
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof ParticipantDetailsDTO) {
          return mergeFrom((ParticipantDetailsDTO)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(ParticipantDetailsDTO other) {
        if (other == ParticipantDetailsDTO.getDefaultInstance()) return this;
        if (!other.getName().isEmpty()) {
          name_ = other.name_;
          onChanged();
        }
        if (other.getAge() != 0) {
          setAge(other.getAge());
        }
        if (other.event1_ != 0) {
          setEvent1Value(other.getEvent1Value());
        }
        if (other.event2_ != 0) {
          setEvent2Value(other.getEvent2Value());
        }
        this.mergeUnknownFields(other.unknownFields);
        onChanged();
        return this;
      }

      @Override
      public final boolean isInitialized() {
        return true;
      }

      @Override
      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        ParticipantDetailsDTO parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (ParticipantDetailsDTO) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private Object name_ = "";
      /**
       * <code>string name = 1;</code>
       * @return The name.
       */
      public String getName() {
        Object ref = name_;
        if (!(ref instanceof String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          String s = bs.toStringUtf8();
          name_ = s;
          return s;
        } else {
          return (String) ref;
        }
      }
      /**
       * <code>string name = 1;</code>
       * @return The bytes for name.
       */
      public com.google.protobuf.ByteString
          getNameBytes() {
        Object ref = name_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (String) ref);
          name_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>string name = 1;</code>
       * @param value The name to set.
       * @return This builder for chaining.
       */
      public Builder setName(
          String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  
        name_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>string name = 1;</code>
       * @return This builder for chaining.
       */
      public Builder clearName() {
        
        name_ = getDefaultInstance().getName();
        onChanged();
        return this;
      }
      /**
       * <code>string name = 1;</code>
       * @param value The bytes for name to set.
       * @return This builder for chaining.
       */
      public Builder setNameBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
        
        name_ = value;
        onChanged();
        return this;
      }

      private int age_ ;
      /**
       * <code>int32 age = 2;</code>
       * @return The age.
       */
      @Override
      public int getAge() {
        return age_;
      }
      /**
       * <code>int32 age = 2;</code>
       * @param value The age to set.
       * @return This builder for chaining.
       */
      public Builder setAge(int value) {
        
        age_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>int32 age = 2;</code>
       * @return This builder for chaining.
       */
      public Builder clearAge() {
        
        age_ = 0;
        onChanged();
        return this;
      }

      private int event1_ = 0;
      /**
       * <code>.Event event1 = 3;</code>
       * @return The enum numeric value on the wire for event1.
       */
      @Override public int getEvent1Value() {
        return event1_;
      }
      /**
       * <code>.Event event1 = 3;</code>
       * @param value The enum numeric value on the wire for event1 to set.
       * @return This builder for chaining.
       */
      public Builder setEvent1Value(int value) {
        
        event1_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>.Event event1 = 3;</code>
       * @return The event1.
       */
      @Override
      public Event getEvent1() {
        @SuppressWarnings("deprecation")
        Event result = Event.valueOf(event1_);
        return result == null ? Event.UNRECOGNIZED : result;
      }
      /**
       * <code>.Event event1 = 3;</code>
       * @param value The event1 to set.
       * @return This builder for chaining.
       */
      public Builder setEvent1(Event value) {
        if (value == null) {
          throw new NullPointerException();
        }
        
        event1_ = value.getNumber();
        onChanged();
        return this;
      }
      /**
       * <code>.Event event1 = 3;</code>
       * @return This builder for chaining.
       */
      public Builder clearEvent1() {
        
        event1_ = 0;
        onChanged();
        return this;
      }

      private int event2_ = 0;
      /**
       * <code>.Event event2 = 4;</code>
       * @return The enum numeric value on the wire for event2.
       */
      @Override public int getEvent2Value() {
        return event2_;
      }
      /**
       * <code>.Event event2 = 4;</code>
       * @param value The enum numeric value on the wire for event2 to set.
       * @return This builder for chaining.
       */
      public Builder setEvent2Value(int value) {
        
        event2_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>.Event event2 = 4;</code>
       * @return The event2.
       */
      @Override
      public Event getEvent2() {
        @SuppressWarnings("deprecation")
        Event result = Event.valueOf(event2_);
        return result == null ? Event.UNRECOGNIZED : result;
      }
      /**
       * <code>.Event event2 = 4;</code>
       * @param value The event2 to set.
       * @return This builder for chaining.
       */
      public Builder setEvent2(Event value) {
        if (value == null) {
          throw new NullPointerException();
        }
        
        event2_ = value.getNumber();
        onChanged();
        return this;
      }
      /**
       * <code>.Event event2 = 4;</code>
       * @return This builder for chaining.
       */
      public Builder clearEvent2() {
        
        event2_ = 0;
        onChanged();
        return this;
      }
      @Override
      public final Builder setUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.setUnknownFields(unknownFields);
      }

      @Override
      public final Builder mergeUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.mergeUnknownFields(unknownFields);
      }


      // @@protoc_insertion_point(builder_scope:ParticipantDetailsDTO)
    }

    // @@protoc_insertion_point(class_scope:ParticipantDetailsDTO)
    private static final ParticipantDetailsDTO DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new ParticipantDetailsDTO();
    }

    public static ParticipantDetailsDTO getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<ParticipantDetailsDTO>
        PARSER = new com.google.protobuf.AbstractParser<ParticipantDetailsDTO>() {
      @Override
      public ParticipantDetailsDTO parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new ParticipantDetailsDTO(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<ParticipantDetailsDTO> parser() {
      return PARSER;
    }

    @Override
    public com.google.protobuf.Parser<ParticipantDetailsDTO> getParserForType() {
      return PARSER;
    }

    @Override
    public ParticipantDetailsDTO getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  public interface ChildNoEventsDTOOrBuilder extends
      // @@protoc_insertion_point(interface_extends:ChildNoEventsDTO)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>.Child child = 1;</code>
     * @return Whether the child field is set.
     */
    boolean hasChild();
    /**
     * <code>.Child child = 1;</code>
     * @return The child.
     */
    Child getChild();
    /**
     * <code>.Child child = 1;</code>
     */
    ChildOrBuilder getChildOrBuilder();

    /**
     * <code>int32 noEvents = 2;</code>
     * @return The noEvents.
     */
    int getNoEvents();
  }
  /**
   * Protobuf type {@code ChildNoEventsDTO}
   */
  public static final class ChildNoEventsDTO extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:ChildNoEventsDTO)
      ChildNoEventsDTOOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use ChildNoEventsDTO.newBuilder() to construct.
    private ChildNoEventsDTO(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private ChildNoEventsDTO() {
    }

    @Override
    @SuppressWarnings({"unused"})
    protected Object newInstance(
        UnusedPrivateParameter unused) {
      return new ChildNoEventsDTO();
    }

    @Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private ChildNoEventsDTO(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      this();
      if (extensionRegistry == null) {
        throw new NullPointerException();
      }
      com.google.protobuf.UnknownFieldSet.Builder unknownFields =
          com.google.protobuf.UnknownFieldSet.newBuilder();
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            case 10: {
              Child.Builder subBuilder = null;
              if (child_ != null) {
                subBuilder = child_.toBuilder();
              }
              child_ = input.readMessage(Child.parser(), extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(child_);
                child_ = subBuilder.buildPartial();
              }

              break;
            }
            case 16: {

              noEvents_ = input.readInt32();
              break;
            }
            default: {
              if (!parseUnknownField(
                  input, unknownFields, extensionRegistry, tag)) {
                done = true;
              }
              break;
            }
          }
        }
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(this);
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(
            e).setUnfinishedMessage(this);
      } finally {
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return Protobuf.internal_static_ChildNoEventsDTO_descriptor;
    }

    @Override
    protected FieldAccessorTable
        internalGetFieldAccessorTable() {
      return Protobuf.internal_static_ChildNoEventsDTO_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              ChildNoEventsDTO.class, Builder.class);
    }

    public static final int CHILD_FIELD_NUMBER = 1;
    private Child child_;
    /**
     * <code>.Child child = 1;</code>
     * @return Whether the child field is set.
     */
    @Override
    public boolean hasChild() {
      return child_ != null;
    }
    /**
     * <code>.Child child = 1;</code>
     * @return The child.
     */
    @Override
    public Child getChild() {
      return child_ == null ? Child.getDefaultInstance() : child_;
    }
    /**
     * <code>.Child child = 1;</code>
     */
    @Override
    public ChildOrBuilder getChildOrBuilder() {
      return getChild();
    }

    public static final int NOEVENTS_FIELD_NUMBER = 2;
    private int noEvents_;
    /**
     * <code>int32 noEvents = 2;</code>
     * @return The noEvents.
     */
    @Override
    public int getNoEvents() {
      return noEvents_;
    }

    private byte memoizedIsInitialized = -1;
    @Override
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      memoizedIsInitialized = 1;
      return true;
    }

    @Override
    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      if (child_ != null) {
        output.writeMessage(1, getChild());
      }
      if (noEvents_ != 0) {
        output.writeInt32(2, noEvents_);
      }
      unknownFields.writeTo(output);
    }

    @Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (child_ != null) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(1, getChild());
      }
      if (noEvents_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(2, noEvents_);
      }
      size += unknownFields.getSerializedSize();
      memoizedSize = size;
      return size;
    }

    @Override
    public boolean equals(final Object obj) {
      if (obj == this) {
       return true;
      }
      if (!(obj instanceof ChildNoEventsDTO)) {
        return super.equals(obj);
      }
      ChildNoEventsDTO other = (ChildNoEventsDTO) obj;

      if (hasChild() != other.hasChild()) return false;
      if (hasChild()) {
        if (!getChild()
            .equals(other.getChild())) return false;
      }
      if (getNoEvents()
          != other.getNoEvents()) return false;
      if (!unknownFields.equals(other.unknownFields)) return false;
      return true;
    }

    @Override
    public int hashCode() {
      if (memoizedHashCode != 0) {
        return memoizedHashCode;
      }
      int hash = 41;
      hash = (19 * hash) + getDescriptor().hashCode();
      if (hasChild()) {
        hash = (37 * hash) + CHILD_FIELD_NUMBER;
        hash = (53 * hash) + getChild().hashCode();
      }
      hash = (37 * hash) + NOEVENTS_FIELD_NUMBER;
      hash = (53 * hash) + getNoEvents();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static ChildNoEventsDTO parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static ChildNoEventsDTO parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static ChildNoEventsDTO parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static ChildNoEventsDTO parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static ChildNoEventsDTO parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static ChildNoEventsDTO parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static ChildNoEventsDTO parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static ChildNoEventsDTO parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static ChildNoEventsDTO parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static ChildNoEventsDTO parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static ChildNoEventsDTO parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static ChildNoEventsDTO parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    @Override
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
    }
    public static Builder newBuilder(ChildNoEventsDTO prototype) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }
    @Override
    public Builder toBuilder() {
      return this == DEFAULT_INSTANCE
          ? new Builder() : new Builder().mergeFrom(this);
    }

    @Override
    protected Builder newBuilderForType(
        BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    /**
     * Protobuf type {@code ChildNoEventsDTO}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:ChildNoEventsDTO)
        ChildNoEventsDTOOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return Protobuf.internal_static_ChildNoEventsDTO_descriptor;
      }

      @Override
      protected FieldAccessorTable
          internalGetFieldAccessorTable() {
        return Protobuf.internal_static_ChildNoEventsDTO_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                ChildNoEventsDTO.class, Builder.class);
      }

      // Construct using Protobuf.ChildNoEventsDTO.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }

      private Builder(
          BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }
      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessageV3
                .alwaysUseFieldBuilders) {
        }
      }
      @Override
      public Builder clear() {
        super.clear();
        if (childBuilder_ == null) {
          child_ = null;
        } else {
          child_ = null;
          childBuilder_ = null;
        }
        noEvents_ = 0;

        return this;
      }

      @Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return Protobuf.internal_static_ChildNoEventsDTO_descriptor;
      }

      @Override
      public ChildNoEventsDTO getDefaultInstanceForType() {
        return ChildNoEventsDTO.getDefaultInstance();
      }

      @Override
      public ChildNoEventsDTO build() {
        ChildNoEventsDTO result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @Override
      public ChildNoEventsDTO buildPartial() {
        ChildNoEventsDTO result = new ChildNoEventsDTO(this);
        if (childBuilder_ == null) {
          result.child_ = child_;
        } else {
          result.child_ = childBuilder_.build();
        }
        result.noEvents_ = noEvents_;
        onBuilt();
        return result;
      }

      @Override
      public Builder clone() {
        return super.clone();
      }
      @Override
      public Builder setField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          Object value) {
        return super.setField(field, value);
      }
      @Override
      public Builder clearField(
          com.google.protobuf.Descriptors.FieldDescriptor field) {
        return super.clearField(field);
      }
      @Override
      public Builder clearOneof(
          com.google.protobuf.Descriptors.OneofDescriptor oneof) {
        return super.clearOneof(oneof);
      }
      @Override
      public Builder setRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          int index, Object value) {
        return super.setRepeatedField(field, index, value);
      }
      @Override
      public Builder addRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          Object value) {
        return super.addRepeatedField(field, value);
      }
      @Override
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof ChildNoEventsDTO) {
          return mergeFrom((ChildNoEventsDTO)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(ChildNoEventsDTO other) {
        if (other == ChildNoEventsDTO.getDefaultInstance()) return this;
        if (other.hasChild()) {
          mergeChild(other.getChild());
        }
        if (other.getNoEvents() != 0) {
          setNoEvents(other.getNoEvents());
        }
        this.mergeUnknownFields(other.unknownFields);
        onChanged();
        return this;
      }

      @Override
      public final boolean isInitialized() {
        return true;
      }

      @Override
      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        ChildNoEventsDTO parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (ChildNoEventsDTO) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private Child child_;
      private com.google.protobuf.SingleFieldBuilderV3<
          Child, Child.Builder, ChildOrBuilder> childBuilder_;
      /**
       * <code>.Child child = 1;</code>
       * @return Whether the child field is set.
       */
      public boolean hasChild() {
        return childBuilder_ != null || child_ != null;
      }
      /**
       * <code>.Child child = 1;</code>
       * @return The child.
       */
      public Child getChild() {
        if (childBuilder_ == null) {
          return child_ == null ? Child.getDefaultInstance() : child_;
        } else {
          return childBuilder_.getMessage();
        }
      }
      /**
       * <code>.Child child = 1;</code>
       */
      public Builder setChild(Child value) {
        if (childBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          child_ = value;
          onChanged();
        } else {
          childBuilder_.setMessage(value);
        }

        return this;
      }
      /**
       * <code>.Child child = 1;</code>
       */
      public Builder setChild(
          Child.Builder builderForValue) {
        if (childBuilder_ == null) {
          child_ = builderForValue.build();
          onChanged();
        } else {
          childBuilder_.setMessage(builderForValue.build());
        }

        return this;
      }
      /**
       * <code>.Child child = 1;</code>
       */
      public Builder mergeChild(Child value) {
        if (childBuilder_ == null) {
          if (child_ != null) {
            child_ =
              Child.newBuilder(child_).mergeFrom(value).buildPartial();
          } else {
            child_ = value;
          }
          onChanged();
        } else {
          childBuilder_.mergeFrom(value);
        }

        return this;
      }
      /**
       * <code>.Child child = 1;</code>
       */
      public Builder clearChild() {
        if (childBuilder_ == null) {
          child_ = null;
          onChanged();
        } else {
          child_ = null;
          childBuilder_ = null;
        }

        return this;
      }
      /**
       * <code>.Child child = 1;</code>
       */
      public Child.Builder getChildBuilder() {
        
        onChanged();
        return getChildFieldBuilder().getBuilder();
      }
      /**
       * <code>.Child child = 1;</code>
       */
      public ChildOrBuilder getChildOrBuilder() {
        if (childBuilder_ != null) {
          return childBuilder_.getMessageOrBuilder();
        } else {
          return child_ == null ?
              Child.getDefaultInstance() : child_;
        }
      }
      /**
       * <code>.Child child = 1;</code>
       */
      private com.google.protobuf.SingleFieldBuilderV3<
          Child, Child.Builder, ChildOrBuilder>
          getChildFieldBuilder() {
        if (childBuilder_ == null) {
          childBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
              Child, Child.Builder, ChildOrBuilder>(
                  getChild(),
                  getParentForChildren(),
                  isClean());
          child_ = null;
        }
        return childBuilder_;
      }

      private int noEvents_ ;
      /**
       * <code>int32 noEvents = 2;</code>
       * @return The noEvents.
       */
      @Override
      public int getNoEvents() {
        return noEvents_;
      }
      /**
       * <code>int32 noEvents = 2;</code>
       * @param value The noEvents to set.
       * @return This builder for chaining.
       */
      public Builder setNoEvents(int value) {
        
        noEvents_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>int32 noEvents = 2;</code>
       * @return This builder for chaining.
       */
      public Builder clearNoEvents() {
        
        noEvents_ = 0;
        onChanged();
        return this;
      }
      @Override
      public final Builder setUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.setUnknownFields(unknownFields);
      }

      @Override
      public final Builder mergeUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.mergeUnknownFields(unknownFields);
      }


      // @@protoc_insertion_point(builder_scope:ChildNoEventsDTO)
    }

    // @@protoc_insertion_point(class_scope:ChildNoEventsDTO)
    private static final ChildNoEventsDTO DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new ChildNoEventsDTO();
    }

    public static ChildNoEventsDTO getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<ChildNoEventsDTO>
        PARSER = new com.google.protobuf.AbstractParser<ChildNoEventsDTO>() {
      @Override
      public ChildNoEventsDTO parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new ChildNoEventsDTO(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<ChildNoEventsDTO> parser() {
      return PARSER;
    }

    @Override
    public com.google.protobuf.Parser<ChildNoEventsDTO> getParserForType() {
      return PARSER;
    }

    @Override
    public ChildNoEventsDTO getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  public interface EventAgeGroupDTOOrBuilder extends
      // @@protoc_insertion_point(interface_extends:EventAgeGroupDTO)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>.Event event = 1;</code>
     * @return The enum numeric value on the wire for event.
     */
    int getEventValue();
    /**
     * <code>.Event event = 1;</code>
     * @return The event.
     */
    Event getEvent();

    /**
     * <code>.AgeGroup ageGroup = 2;</code>
     * @return The enum numeric value on the wire for ageGroup.
     */
    int getAgeGroupValue();
    /**
     * <code>.AgeGroup ageGroup = 2;</code>
     * @return The ageGroup.
     */
    AgeGroup getAgeGroup();
  }
  /**
   * Protobuf type {@code EventAgeGroupDTO}
   */
  public static final class EventAgeGroupDTO extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:EventAgeGroupDTO)
      EventAgeGroupDTOOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use EventAgeGroupDTO.newBuilder() to construct.
    private EventAgeGroupDTO(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private EventAgeGroupDTO() {
      event_ = 0;
      ageGroup_ = 0;
    }

    @Override
    @SuppressWarnings({"unused"})
    protected Object newInstance(
        UnusedPrivateParameter unused) {
      return new EventAgeGroupDTO();
    }

    @Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private EventAgeGroupDTO(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      this();
      if (extensionRegistry == null) {
        throw new NullPointerException();
      }
      com.google.protobuf.UnknownFieldSet.Builder unknownFields =
          com.google.protobuf.UnknownFieldSet.newBuilder();
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            case 8: {
              int rawValue = input.readEnum();

              event_ = rawValue;
              break;
            }
            case 16: {
              int rawValue = input.readEnum();

              ageGroup_ = rawValue;
              break;
            }
            default: {
              if (!parseUnknownField(
                  input, unknownFields, extensionRegistry, tag)) {
                done = true;
              }
              break;
            }
          }
        }
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(this);
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(
            e).setUnfinishedMessage(this);
      } finally {
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return Protobuf.internal_static_EventAgeGroupDTO_descriptor;
    }

    @Override
    protected FieldAccessorTable
        internalGetFieldAccessorTable() {
      return Protobuf.internal_static_EventAgeGroupDTO_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              EventAgeGroupDTO.class, Builder.class);
    }

    public static final int EVENT_FIELD_NUMBER = 1;
    private int event_;
    /**
     * <code>.Event event = 1;</code>
     * @return The enum numeric value on the wire for event.
     */
    @Override public int getEventValue() {
      return event_;
    }
    /**
     * <code>.Event event = 1;</code>
     * @return The event.
     */
    @Override public Event getEvent() {
      @SuppressWarnings("deprecation")
      Event result = Event.valueOf(event_);
      return result == null ? Event.UNRECOGNIZED : result;
    }

    public static final int AGEGROUP_FIELD_NUMBER = 2;
    private int ageGroup_;
    /**
     * <code>.AgeGroup ageGroup = 2;</code>
     * @return The enum numeric value on the wire for ageGroup.
     */
    @Override public int getAgeGroupValue() {
      return ageGroup_;
    }
    /**
     * <code>.AgeGroup ageGroup = 2;</code>
     * @return The ageGroup.
     */
    @Override public AgeGroup getAgeGroup() {
      @SuppressWarnings("deprecation")
      AgeGroup result = AgeGroup.valueOf(ageGroup_);
      return result == null ? AgeGroup.UNRECOGNIZED : result;
    }

    private byte memoizedIsInitialized = -1;
    @Override
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      memoizedIsInitialized = 1;
      return true;
    }

    @Override
    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      if (event_ != Event.NONE.getNumber()) {
        output.writeEnum(1, event_);
      }
      if (ageGroup_ != AgeGroup.A6_8Y.getNumber()) {
        output.writeEnum(2, ageGroup_);
      }
      unknownFields.writeTo(output);
    }

    @Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (event_ != Event.NONE.getNumber()) {
        size += com.google.protobuf.CodedOutputStream
          .computeEnumSize(1, event_);
      }
      if (ageGroup_ != AgeGroup.A6_8Y.getNumber()) {
        size += com.google.protobuf.CodedOutputStream
          .computeEnumSize(2, ageGroup_);
      }
      size += unknownFields.getSerializedSize();
      memoizedSize = size;
      return size;
    }

    @Override
    public boolean equals(final Object obj) {
      if (obj == this) {
       return true;
      }
      if (!(obj instanceof EventAgeGroupDTO)) {
        return super.equals(obj);
      }
      EventAgeGroupDTO other = (EventAgeGroupDTO) obj;

      if (event_ != other.event_) return false;
      if (ageGroup_ != other.ageGroup_) return false;
      if (!unknownFields.equals(other.unknownFields)) return false;
      return true;
    }

    @Override
    public int hashCode() {
      if (memoizedHashCode != 0) {
        return memoizedHashCode;
      }
      int hash = 41;
      hash = (19 * hash) + getDescriptor().hashCode();
      hash = (37 * hash) + EVENT_FIELD_NUMBER;
      hash = (53 * hash) + event_;
      hash = (37 * hash) + AGEGROUP_FIELD_NUMBER;
      hash = (53 * hash) + ageGroup_;
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static EventAgeGroupDTO parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static EventAgeGroupDTO parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static EventAgeGroupDTO parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static EventAgeGroupDTO parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static EventAgeGroupDTO parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static EventAgeGroupDTO parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static EventAgeGroupDTO parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static EventAgeGroupDTO parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static EventAgeGroupDTO parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static EventAgeGroupDTO parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static EventAgeGroupDTO parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static EventAgeGroupDTO parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    @Override
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
    }
    public static Builder newBuilder(EventAgeGroupDTO prototype) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }
    @Override
    public Builder toBuilder() {
      return this == DEFAULT_INSTANCE
          ? new Builder() : new Builder().mergeFrom(this);
    }

    @Override
    protected Builder newBuilderForType(
        BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    /**
     * Protobuf type {@code EventAgeGroupDTO}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:EventAgeGroupDTO)
        EventAgeGroupDTOOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return Protobuf.internal_static_EventAgeGroupDTO_descriptor;
      }

      @Override
      protected FieldAccessorTable
          internalGetFieldAccessorTable() {
        return Protobuf.internal_static_EventAgeGroupDTO_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                EventAgeGroupDTO.class, Builder.class);
      }

      // Construct using Protobuf.EventAgeGroupDTO.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }

      private Builder(
          BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }
      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessageV3
                .alwaysUseFieldBuilders) {
        }
      }
      @Override
      public Builder clear() {
        super.clear();
        event_ = 0;

        ageGroup_ = 0;

        return this;
      }

      @Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return Protobuf.internal_static_EventAgeGroupDTO_descriptor;
      }

      @Override
      public EventAgeGroupDTO getDefaultInstanceForType() {
        return EventAgeGroupDTO.getDefaultInstance();
      }

      @Override
      public EventAgeGroupDTO build() {
        EventAgeGroupDTO result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @Override
      public EventAgeGroupDTO buildPartial() {
        EventAgeGroupDTO result = new EventAgeGroupDTO(this);
        result.event_ = event_;
        result.ageGroup_ = ageGroup_;
        onBuilt();
        return result;
      }

      @Override
      public Builder clone() {
        return super.clone();
      }
      @Override
      public Builder setField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          Object value) {
        return super.setField(field, value);
      }
      @Override
      public Builder clearField(
          com.google.protobuf.Descriptors.FieldDescriptor field) {
        return super.clearField(field);
      }
      @Override
      public Builder clearOneof(
          com.google.protobuf.Descriptors.OneofDescriptor oneof) {
        return super.clearOneof(oneof);
      }
      @Override
      public Builder setRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          int index, Object value) {
        return super.setRepeatedField(field, index, value);
      }
      @Override
      public Builder addRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          Object value) {
        return super.addRepeatedField(field, value);
      }
      @Override
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof EventAgeGroupDTO) {
          return mergeFrom((EventAgeGroupDTO)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(EventAgeGroupDTO other) {
        if (other == EventAgeGroupDTO.getDefaultInstance()) return this;
        if (other.event_ != 0) {
          setEventValue(other.getEventValue());
        }
        if (other.ageGroup_ != 0) {
          setAgeGroupValue(other.getAgeGroupValue());
        }
        this.mergeUnknownFields(other.unknownFields);
        onChanged();
        return this;
      }

      @Override
      public final boolean isInitialized() {
        return true;
      }

      @Override
      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        EventAgeGroupDTO parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (EventAgeGroupDTO) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private int event_ = 0;
      /**
       * <code>.Event event = 1;</code>
       * @return The enum numeric value on the wire for event.
       */
      @Override public int getEventValue() {
        return event_;
      }
      /**
       * <code>.Event event = 1;</code>
       * @param value The enum numeric value on the wire for event to set.
       * @return This builder for chaining.
       */
      public Builder setEventValue(int value) {
        
        event_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>.Event event = 1;</code>
       * @return The event.
       */
      @Override
      public Event getEvent() {
        @SuppressWarnings("deprecation")
        Event result = Event.valueOf(event_);
        return result == null ? Event.UNRECOGNIZED : result;
      }
      /**
       * <code>.Event event = 1;</code>
       * @param value The event to set.
       * @return This builder for chaining.
       */
      public Builder setEvent(Event value) {
        if (value == null) {
          throw new NullPointerException();
        }
        
        event_ = value.getNumber();
        onChanged();
        return this;
      }
      /**
       * <code>.Event event = 1;</code>
       * @return This builder for chaining.
       */
      public Builder clearEvent() {
        
        event_ = 0;
        onChanged();
        return this;
      }

      private int ageGroup_ = 0;
      /**
       * <code>.AgeGroup ageGroup = 2;</code>
       * @return The enum numeric value on the wire for ageGroup.
       */
      @Override public int getAgeGroupValue() {
        return ageGroup_;
      }
      /**
       * <code>.AgeGroup ageGroup = 2;</code>
       * @param value The enum numeric value on the wire for ageGroup to set.
       * @return This builder for chaining.
       */
      public Builder setAgeGroupValue(int value) {
        
        ageGroup_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>.AgeGroup ageGroup = 2;</code>
       * @return The ageGroup.
       */
      @Override
      public AgeGroup getAgeGroup() {
        @SuppressWarnings("deprecation")
        AgeGroup result = AgeGroup.valueOf(ageGroup_);
        return result == null ? AgeGroup.UNRECOGNIZED : result;
      }
      /**
       * <code>.AgeGroup ageGroup = 2;</code>
       * @param value The ageGroup to set.
       * @return This builder for chaining.
       */
      public Builder setAgeGroup(AgeGroup value) {
        if (value == null) {
          throw new NullPointerException();
        }
        
        ageGroup_ = value.getNumber();
        onChanged();
        return this;
      }
      /**
       * <code>.AgeGroup ageGroup = 2;</code>
       * @return This builder for chaining.
       */
      public Builder clearAgeGroup() {
        
        ageGroup_ = 0;
        onChanged();
        return this;
      }
      @Override
      public final Builder setUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.setUnknownFields(unknownFields);
      }

      @Override
      public final Builder mergeUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.mergeUnknownFields(unknownFields);
      }


      // @@protoc_insertion_point(builder_scope:EventAgeGroupDTO)
    }

    // @@protoc_insertion_point(class_scope:EventAgeGroupDTO)
    private static final EventAgeGroupDTO DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new EventAgeGroupDTO();
    }

    public static EventAgeGroupDTO getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<EventAgeGroupDTO>
        PARSER = new com.google.protobuf.AbstractParser<EventAgeGroupDTO>() {
      @Override
      public EventAgeGroupDTO parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new EventAgeGroupDTO(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<EventAgeGroupDTO> parser() {
      return PARSER;
    }

    @Override
    public com.google.protobuf.Parser<EventAgeGroupDTO> getParserForType() {
      return PARSER;
    }

    @Override
    public EventAgeGroupDTO getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  public interface EventCountDTOOrBuilder extends
      // @@protoc_insertion_point(interface_extends:EventCountDTO)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>.Event event = 1;</code>
     * @return The enum numeric value on the wire for event.
     */
    int getEventValue();
    /**
     * <code>.Event event = 1;</code>
     * @return The event.
     */
    Event getEvent();

    /**
     * <code>.AgeGroup ageGroup = 2;</code>
     * @return The enum numeric value on the wire for ageGroup.
     */
    int getAgeGroupValue();
    /**
     * <code>.AgeGroup ageGroup = 2;</code>
     * @return The ageGroup.
     */
    AgeGroup getAgeGroup();

    /**
     * <code>int64 count = 3;</code>
     * @return The count.
     */
    long getCount();
  }
  /**
   * Protobuf type {@code EventCountDTO}
   */
  public static final class EventCountDTO extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:EventCountDTO)
      EventCountDTOOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use EventCountDTO.newBuilder() to construct.
    private EventCountDTO(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private EventCountDTO() {
      event_ = 0;
      ageGroup_ = 0;
    }

    @Override
    @SuppressWarnings({"unused"})
    protected Object newInstance(
        UnusedPrivateParameter unused) {
      return new EventCountDTO();
    }

    @Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private EventCountDTO(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      this();
      if (extensionRegistry == null) {
        throw new NullPointerException();
      }
      com.google.protobuf.UnknownFieldSet.Builder unknownFields =
          com.google.protobuf.UnknownFieldSet.newBuilder();
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            case 8: {
              int rawValue = input.readEnum();

              event_ = rawValue;
              break;
            }
            case 16: {
              int rawValue = input.readEnum();

              ageGroup_ = rawValue;
              break;
            }
            case 24: {

              count_ = input.readInt64();
              break;
            }
            default: {
              if (!parseUnknownField(
                  input, unknownFields, extensionRegistry, tag)) {
                done = true;
              }
              break;
            }
          }
        }
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(this);
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(
            e).setUnfinishedMessage(this);
      } finally {
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return Protobuf.internal_static_EventCountDTO_descriptor;
    }

    @Override
    protected FieldAccessorTable
        internalGetFieldAccessorTable() {
      return Protobuf.internal_static_EventCountDTO_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              EventCountDTO.class, Builder.class);
    }

    public static final int EVENT_FIELD_NUMBER = 1;
    private int event_;
    /**
     * <code>.Event event = 1;</code>
     * @return The enum numeric value on the wire for event.
     */
    @Override public int getEventValue() {
      return event_;
    }
    /**
     * <code>.Event event = 1;</code>
     * @return The event.
     */
    @Override public Event getEvent() {
      @SuppressWarnings("deprecation")
      Event result = Event.valueOf(event_);
      return result == null ? Event.UNRECOGNIZED : result;
    }

    public static final int AGEGROUP_FIELD_NUMBER = 2;
    private int ageGroup_;
    /**
     * <code>.AgeGroup ageGroup = 2;</code>
     * @return The enum numeric value on the wire for ageGroup.
     */
    @Override public int getAgeGroupValue() {
      return ageGroup_;
    }
    /**
     * <code>.AgeGroup ageGroup = 2;</code>
     * @return The ageGroup.
     */
    @Override public AgeGroup getAgeGroup() {
      @SuppressWarnings("deprecation")
      AgeGroup result = AgeGroup.valueOf(ageGroup_);
      return result == null ? AgeGroup.UNRECOGNIZED : result;
    }

    public static final int COUNT_FIELD_NUMBER = 3;
    private long count_;
    /**
     * <code>int64 count = 3;</code>
     * @return The count.
     */
    @Override
    public long getCount() {
      return count_;
    }

    private byte memoizedIsInitialized = -1;
    @Override
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      memoizedIsInitialized = 1;
      return true;
    }

    @Override
    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      if (event_ != Event.NONE.getNumber()) {
        output.writeEnum(1, event_);
      }
      if (ageGroup_ != AgeGroup.A6_8Y.getNumber()) {
        output.writeEnum(2, ageGroup_);
      }
      if (count_ != 0L) {
        output.writeInt64(3, count_);
      }
      unknownFields.writeTo(output);
    }

    @Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (event_ != Event.NONE.getNumber()) {
        size += com.google.protobuf.CodedOutputStream
          .computeEnumSize(1, event_);
      }
      if (ageGroup_ != AgeGroup.A6_8Y.getNumber()) {
        size += com.google.protobuf.CodedOutputStream
          .computeEnumSize(2, ageGroup_);
      }
      if (count_ != 0L) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt64Size(3, count_);
      }
      size += unknownFields.getSerializedSize();
      memoizedSize = size;
      return size;
    }

    @Override
    public boolean equals(final Object obj) {
      if (obj == this) {
       return true;
      }
      if (!(obj instanceof EventCountDTO)) {
        return super.equals(obj);
      }
      EventCountDTO other = (EventCountDTO) obj;

      if (event_ != other.event_) return false;
      if (ageGroup_ != other.ageGroup_) return false;
      if (getCount()
          != other.getCount()) return false;
      if (!unknownFields.equals(other.unknownFields)) return false;
      return true;
    }

    @Override
    public int hashCode() {
      if (memoizedHashCode != 0) {
        return memoizedHashCode;
      }
      int hash = 41;
      hash = (19 * hash) + getDescriptor().hashCode();
      hash = (37 * hash) + EVENT_FIELD_NUMBER;
      hash = (53 * hash) + event_;
      hash = (37 * hash) + AGEGROUP_FIELD_NUMBER;
      hash = (53 * hash) + ageGroup_;
      hash = (37 * hash) + COUNT_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
          getCount());
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static EventCountDTO parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static EventCountDTO parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static EventCountDTO parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static EventCountDTO parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static EventCountDTO parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static EventCountDTO parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static EventCountDTO parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static EventCountDTO parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static EventCountDTO parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static EventCountDTO parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static EventCountDTO parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static EventCountDTO parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    @Override
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
    }
    public static Builder newBuilder(EventCountDTO prototype) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }
    @Override
    public Builder toBuilder() {
      return this == DEFAULT_INSTANCE
          ? new Builder() : new Builder().mergeFrom(this);
    }

    @Override
    protected Builder newBuilderForType(
        BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    /**
     * Protobuf type {@code EventCountDTO}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:EventCountDTO)
        EventCountDTOOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return Protobuf.internal_static_EventCountDTO_descriptor;
      }

      @Override
      protected FieldAccessorTable
          internalGetFieldAccessorTable() {
        return Protobuf.internal_static_EventCountDTO_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                EventCountDTO.class, Builder.class);
      }

      // Construct using Protobuf.EventCountDTO.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }

      private Builder(
          BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }
      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessageV3
                .alwaysUseFieldBuilders) {
        }
      }
      @Override
      public Builder clear() {
        super.clear();
        event_ = 0;

        ageGroup_ = 0;

        count_ = 0L;

        return this;
      }

      @Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return Protobuf.internal_static_EventCountDTO_descriptor;
      }

      @Override
      public EventCountDTO getDefaultInstanceForType() {
        return EventCountDTO.getDefaultInstance();
      }

      @Override
      public EventCountDTO build() {
        EventCountDTO result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @Override
      public EventCountDTO buildPartial() {
        EventCountDTO result = new EventCountDTO(this);
        result.event_ = event_;
        result.ageGroup_ = ageGroup_;
        result.count_ = count_;
        onBuilt();
        return result;
      }

      @Override
      public Builder clone() {
        return super.clone();
      }
      @Override
      public Builder setField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          Object value) {
        return super.setField(field, value);
      }
      @Override
      public Builder clearField(
          com.google.protobuf.Descriptors.FieldDescriptor field) {
        return super.clearField(field);
      }
      @Override
      public Builder clearOneof(
          com.google.protobuf.Descriptors.OneofDescriptor oneof) {
        return super.clearOneof(oneof);
      }
      @Override
      public Builder setRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          int index, Object value) {
        return super.setRepeatedField(field, index, value);
      }
      @Override
      public Builder addRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          Object value) {
        return super.addRepeatedField(field, value);
      }
      @Override
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof EventCountDTO) {
          return mergeFrom((EventCountDTO)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(EventCountDTO other) {
        if (other == EventCountDTO.getDefaultInstance()) return this;
        if (other.event_ != 0) {
          setEventValue(other.getEventValue());
        }
        if (other.ageGroup_ != 0) {
          setAgeGroupValue(other.getAgeGroupValue());
        }
        if (other.getCount() != 0L) {
          setCount(other.getCount());
        }
        this.mergeUnknownFields(other.unknownFields);
        onChanged();
        return this;
      }

      @Override
      public final boolean isInitialized() {
        return true;
      }

      @Override
      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        EventCountDTO parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (EventCountDTO) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private int event_ = 0;
      /**
       * <code>.Event event = 1;</code>
       * @return The enum numeric value on the wire for event.
       */
      @Override public int getEventValue() {
        return event_;
      }
      /**
       * <code>.Event event = 1;</code>
       * @param value The enum numeric value on the wire for event to set.
       * @return This builder for chaining.
       */
      public Builder setEventValue(int value) {
        
        event_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>.Event event = 1;</code>
       * @return The event.
       */
      @Override
      public Event getEvent() {
        @SuppressWarnings("deprecation")
        Event result = Event.valueOf(event_);
        return result == null ? Event.UNRECOGNIZED : result;
      }
      /**
       * <code>.Event event = 1;</code>
       * @param value The event to set.
       * @return This builder for chaining.
       */
      public Builder setEvent(Event value) {
        if (value == null) {
          throw new NullPointerException();
        }
        
        event_ = value.getNumber();
        onChanged();
        return this;
      }
      /**
       * <code>.Event event = 1;</code>
       * @return This builder for chaining.
       */
      public Builder clearEvent() {
        
        event_ = 0;
        onChanged();
        return this;
      }

      private int ageGroup_ = 0;
      /**
       * <code>.AgeGroup ageGroup = 2;</code>
       * @return The enum numeric value on the wire for ageGroup.
       */
      @Override public int getAgeGroupValue() {
        return ageGroup_;
      }
      /**
       * <code>.AgeGroup ageGroup = 2;</code>
       * @param value The enum numeric value on the wire for ageGroup to set.
       * @return This builder for chaining.
       */
      public Builder setAgeGroupValue(int value) {
        
        ageGroup_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>.AgeGroup ageGroup = 2;</code>
       * @return The ageGroup.
       */
      @Override
      public AgeGroup getAgeGroup() {
        @SuppressWarnings("deprecation")
        AgeGroup result = AgeGroup.valueOf(ageGroup_);
        return result == null ? AgeGroup.UNRECOGNIZED : result;
      }
      /**
       * <code>.AgeGroup ageGroup = 2;</code>
       * @param value The ageGroup to set.
       * @return This builder for chaining.
       */
      public Builder setAgeGroup(AgeGroup value) {
        if (value == null) {
          throw new NullPointerException();
        }
        
        ageGroup_ = value.getNumber();
        onChanged();
        return this;
      }
      /**
       * <code>.AgeGroup ageGroup = 2;</code>
       * @return This builder for chaining.
       */
      public Builder clearAgeGroup() {
        
        ageGroup_ = 0;
        onChanged();
        return this;
      }

      private long count_ ;
      /**
       * <code>int64 count = 3;</code>
       * @return The count.
       */
      @Override
      public long getCount() {
        return count_;
      }
      /**
       * <code>int64 count = 3;</code>
       * @param value The count to set.
       * @return This builder for chaining.
       */
      public Builder setCount(long value) {
        
        count_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>int64 count = 3;</code>
       * @return This builder for chaining.
       */
      public Builder clearCount() {
        
        count_ = 0L;
        onChanged();
        return this;
      }
      @Override
      public final Builder setUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.setUnknownFields(unknownFields);
      }

      @Override
      public final Builder mergeUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.mergeUnknownFields(unknownFields);
      }


      // @@protoc_insertion_point(builder_scope:EventCountDTO)
    }

    // @@protoc_insertion_point(class_scope:EventCountDTO)
    private static final EventCountDTO DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new EventCountDTO();
    }

    public static EventCountDTO getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<EventCountDTO>
        PARSER = new com.google.protobuf.AbstractParser<EventCountDTO>() {
      @Override
      public EventCountDTO parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new EventCountDTO(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<EventCountDTO> parser() {
      return PARSER;
    }

    @Override
    public com.google.protobuf.Parser<EventCountDTO> getParserForType() {
      return PARSER;
    }

    @Override
    public EventCountDTO getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  public interface RequestOrBuilder extends
      // @@protoc_insertion_point(interface_extends:Request)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>.Request.Type type = 1;</code>
     * @return The enum numeric value on the wire for type.
     */
    int getTypeValue();
    /**
     * <code>.Request.Type type = 1;</code>
     * @return The type.
     */
    Request.Type getType();

    /**
     * <code>.User user = 2;</code>
     * @return Whether the user field is set.
     */
    boolean hasUser();
    /**
     * <code>.User user = 2;</code>
     * @return The user.
     */
    User getUser();
    /**
     * <code>.User user = 2;</code>
     */
    UserOrBuilder getUserOrBuilder();

    /**
     * <code>.EventAgeGroupDTO eag = 3;</code>
     * @return Whether the eag field is set.
     */
    boolean hasEag();
    /**
     * <code>.EventAgeGroupDTO eag = 3;</code>
     * @return The eag.
     */
    EventAgeGroupDTO getEag();
    /**
     * <code>.EventAgeGroupDTO eag = 3;</code>
     */
    EventAgeGroupDTOOrBuilder getEagOrBuilder();

    /**
     * <code>.ParticipantDetailsDTO pd = 4;</code>
     * @return Whether the pd field is set.
     */
    boolean hasPd();
    /**
     * <code>.ParticipantDetailsDTO pd = 4;</code>
     * @return The pd.
     */
    ParticipantDetailsDTO getPd();
    /**
     * <code>.ParticipantDetailsDTO pd = 4;</code>
     */
    ParticipantDetailsDTOOrBuilder getPdOrBuilder();
  }
  /**
   * Protobuf type {@code Request}
   */
  public static final class Request extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:Request)
      RequestOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use Request.newBuilder() to construct.
    private Request(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private Request() {
      type_ = 0;
    }

    @Override
    @SuppressWarnings({"unused"})
    protected Object newInstance(
        UnusedPrivateParameter unused) {
      return new Request();
    }

    @Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private Request(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      this();
      if (extensionRegistry == null) {
        throw new NullPointerException();
      }
      com.google.protobuf.UnknownFieldSet.Builder unknownFields =
          com.google.protobuf.UnknownFieldSet.newBuilder();
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            case 8: {
              int rawValue = input.readEnum();

              type_ = rawValue;
              break;
            }
            case 18: {
              User.Builder subBuilder = null;
              if (user_ != null) {
                subBuilder = user_.toBuilder();
              }
              user_ = input.readMessage(User.parser(), extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(user_);
                user_ = subBuilder.buildPartial();
              }

              break;
            }
            case 26: {
              EventAgeGroupDTO.Builder subBuilder = null;
              if (eag_ != null) {
                subBuilder = eag_.toBuilder();
              }
              eag_ = input.readMessage(EventAgeGroupDTO.parser(), extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(eag_);
                eag_ = subBuilder.buildPartial();
              }

              break;
            }
            case 34: {
              ParticipantDetailsDTO.Builder subBuilder = null;
              if (pd_ != null) {
                subBuilder = pd_.toBuilder();
              }
              pd_ = input.readMessage(ParticipantDetailsDTO.parser(), extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(pd_);
                pd_ = subBuilder.buildPartial();
              }

              break;
            }
            default: {
              if (!parseUnknownField(
                  input, unknownFields, extensionRegistry, tag)) {
                done = true;
              }
              break;
            }
          }
        }
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(this);
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(
            e).setUnfinishedMessage(this);
      } finally {
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return Protobuf.internal_static_Request_descriptor;
    }

    @Override
    protected FieldAccessorTable
        internalGetFieldAccessorTable() {
      return Protobuf.internal_static_Request_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              Request.class, Builder.class);
    }

    /**
     * Protobuf enum {@code Request.Type}
     */
    public enum Type
        implements com.google.protobuf.ProtocolMessageEnum {
      /**
       * <code>UNKNOWN = 0;</code>
       */
      UNKNOWN(0),
      /**
       * <code>LOGIN = 1;</code>
       */
      LOGIN(1),
      /**
       * <code>LOGOUT = 2;</code>
       */
      LOGOUT(2),
      /**
       * <code>CHILDREN_EVENTS = 3;</code>
       */
      CHILDREN_EVENTS(3),
      /**
       * <code>ADD_PARTICIPANT = 4;</code>
       */
      ADD_PARTICIPANT(4),
      /**
       * <code>EVENT_COUNT = 5;</code>
       */
      EVENT_COUNT(5),
      UNRECOGNIZED(-1),
      ;

      /**
       * <code>UNKNOWN = 0;</code>
       */
      public static final int UNKNOWN_VALUE = 0;
      /**
       * <code>LOGIN = 1;</code>
       */
      public static final int LOGIN_VALUE = 1;
      /**
       * <code>LOGOUT = 2;</code>
       */
      public static final int LOGOUT_VALUE = 2;
      /**
       * <code>CHILDREN_EVENTS = 3;</code>
       */
      public static final int CHILDREN_EVENTS_VALUE = 3;
      /**
       * <code>ADD_PARTICIPANT = 4;</code>
       */
      public static final int ADD_PARTICIPANT_VALUE = 4;
      /**
       * <code>EVENT_COUNT = 5;</code>
       */
      public static final int EVENT_COUNT_VALUE = 5;


      public final int getNumber() {
        if (this == UNRECOGNIZED) {
          throw new IllegalArgumentException(
              "Can't get the number of an unknown enum value.");
        }
        return value;
      }

      /**
       * @param value The numeric wire value of the corresponding enum entry.
       * @return The enum associated with the given numeric wire value.
       * @deprecated Use {@link #forNumber(int)} instead.
       */
      @Deprecated
      public static Type valueOf(int value) {
        return forNumber(value);
      }

      /**
       * @param value The numeric wire value of the corresponding enum entry.
       * @return The enum associated with the given numeric wire value.
       */
      public static Type forNumber(int value) {
        switch (value) {
          case 0: return UNKNOWN;
          case 1: return LOGIN;
          case 2: return LOGOUT;
          case 3: return CHILDREN_EVENTS;
          case 4: return ADD_PARTICIPANT;
          case 5: return EVENT_COUNT;
          default: return null;
        }
      }

      public static com.google.protobuf.Internal.EnumLiteMap<Type>
          internalGetValueMap() {
        return internalValueMap;
      }
      private static final com.google.protobuf.Internal.EnumLiteMap<
          Type> internalValueMap =
            new com.google.protobuf.Internal.EnumLiteMap<Type>() {
              public Type findValueByNumber(int number) {
                return Type.forNumber(number);
              }
            };

      public final com.google.protobuf.Descriptors.EnumValueDescriptor
          getValueDescriptor() {
        if (this == UNRECOGNIZED) {
          throw new IllegalStateException(
              "Can't get the descriptor of an unrecognized enum value.");
        }
        return getDescriptor().getValues().get(ordinal());
      }
      public final com.google.protobuf.Descriptors.EnumDescriptor
          getDescriptorForType() {
        return getDescriptor();
      }
      public static final com.google.protobuf.Descriptors.EnumDescriptor
          getDescriptor() {
        return Request.getDescriptor().getEnumTypes().get(0);
      }

      private static final Type[] VALUES = values();

      public static Type valueOf(
          com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
        if (desc.getType() != getDescriptor()) {
          throw new IllegalArgumentException(
            "EnumValueDescriptor is not for this type.");
        }
        if (desc.getIndex() == -1) {
          return UNRECOGNIZED;
        }
        return VALUES[desc.getIndex()];
      }

      private final int value;

      private Type(int value) {
        this.value = value;
      }

      // @@protoc_insertion_point(enum_scope:Request.Type)
    }

    public static final int TYPE_FIELD_NUMBER = 1;
    private int type_;
    /**
     * <code>.Request.Type type = 1;</code>
     * @return The enum numeric value on the wire for type.
     */
    @Override public int getTypeValue() {
      return type_;
    }
    /**
     * <code>.Request.Type type = 1;</code>
     * @return The type.
     */
    @Override public Type getType() {
      @SuppressWarnings("deprecation")
      Type result = Type.valueOf(type_);
      return result == null ? Type.UNRECOGNIZED : result;
    }

    public static final int USER_FIELD_NUMBER = 2;
    private User user_;
    /**
     * <code>.User user = 2;</code>
     * @return Whether the user field is set.
     */
    @Override
    public boolean hasUser() {
      return user_ != null;
    }
    /**
     * <code>.User user = 2;</code>
     * @return The user.
     */
    @Override
    public User getUser() {
      return user_ == null ? User.getDefaultInstance() : user_;
    }
    /**
     * <code>.User user = 2;</code>
     */
    @Override
    public UserOrBuilder getUserOrBuilder() {
      return getUser();
    }

    public static final int EAG_FIELD_NUMBER = 3;
    private EventAgeGroupDTO eag_;
    /**
     * <code>.EventAgeGroupDTO eag = 3;</code>
     * @return Whether the eag field is set.
     */
    @Override
    public boolean hasEag() {
      return eag_ != null;
    }
    /**
     * <code>.EventAgeGroupDTO eag = 3;</code>
     * @return The eag.
     */
    @Override
    public EventAgeGroupDTO getEag() {
      return eag_ == null ? EventAgeGroupDTO.getDefaultInstance() : eag_;
    }
    /**
     * <code>.EventAgeGroupDTO eag = 3;</code>
     */
    @Override
    public EventAgeGroupDTOOrBuilder getEagOrBuilder() {
      return getEag();
    }

    public static final int PD_FIELD_NUMBER = 4;
    private ParticipantDetailsDTO pd_;
    /**
     * <code>.ParticipantDetailsDTO pd = 4;</code>
     * @return Whether the pd field is set.
     */
    @Override
    public boolean hasPd() {
      return pd_ != null;
    }
    /**
     * <code>.ParticipantDetailsDTO pd = 4;</code>
     * @return The pd.
     */
    @Override
    public ParticipantDetailsDTO getPd() {
      return pd_ == null ? ParticipantDetailsDTO.getDefaultInstance() : pd_;
    }
    /**
     * <code>.ParticipantDetailsDTO pd = 4;</code>
     */
    @Override
    public ParticipantDetailsDTOOrBuilder getPdOrBuilder() {
      return getPd();
    }

    private byte memoizedIsInitialized = -1;
    @Override
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      memoizedIsInitialized = 1;
      return true;
    }

    @Override
    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      if (type_ != Type.UNKNOWN.getNumber()) {
        output.writeEnum(1, type_);
      }
      if (user_ != null) {
        output.writeMessage(2, getUser());
      }
      if (eag_ != null) {
        output.writeMessage(3, getEag());
      }
      if (pd_ != null) {
        output.writeMessage(4, getPd());
      }
      unknownFields.writeTo(output);
    }

    @Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (type_ != Type.UNKNOWN.getNumber()) {
        size += com.google.protobuf.CodedOutputStream
          .computeEnumSize(1, type_);
      }
      if (user_ != null) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(2, getUser());
      }
      if (eag_ != null) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(3, getEag());
      }
      if (pd_ != null) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(4, getPd());
      }
      size += unknownFields.getSerializedSize();
      memoizedSize = size;
      return size;
    }

    @Override
    public boolean equals(final Object obj) {
      if (obj == this) {
       return true;
      }
      if (!(obj instanceof Request)) {
        return super.equals(obj);
      }
      Request other = (Request) obj;

      if (type_ != other.type_) return false;
      if (hasUser() != other.hasUser()) return false;
      if (hasUser()) {
        if (!getUser()
            .equals(other.getUser())) return false;
      }
      if (hasEag() != other.hasEag()) return false;
      if (hasEag()) {
        if (!getEag()
            .equals(other.getEag())) return false;
      }
      if (hasPd() != other.hasPd()) return false;
      if (hasPd()) {
        if (!getPd()
            .equals(other.getPd())) return false;
      }
      if (!unknownFields.equals(other.unknownFields)) return false;
      return true;
    }

    @Override
    public int hashCode() {
      if (memoizedHashCode != 0) {
        return memoizedHashCode;
      }
      int hash = 41;
      hash = (19 * hash) + getDescriptor().hashCode();
      hash = (37 * hash) + TYPE_FIELD_NUMBER;
      hash = (53 * hash) + type_;
      if (hasUser()) {
        hash = (37 * hash) + USER_FIELD_NUMBER;
        hash = (53 * hash) + getUser().hashCode();
      }
      if (hasEag()) {
        hash = (37 * hash) + EAG_FIELD_NUMBER;
        hash = (53 * hash) + getEag().hashCode();
      }
      if (hasPd()) {
        hash = (37 * hash) + PD_FIELD_NUMBER;
        hash = (53 * hash) + getPd().hashCode();
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static Request parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static Request parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static Request parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static Request parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static Request parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static Request parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static Request parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static Request parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static Request parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static Request parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static Request parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static Request parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    @Override
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
    }
    public static Builder newBuilder(Request prototype) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }
    @Override
    public Builder toBuilder() {
      return this == DEFAULT_INSTANCE
          ? new Builder() : new Builder().mergeFrom(this);
    }

    @Override
    protected Builder newBuilderForType(
        BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    /**
     * Protobuf type {@code Request}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:Request)
        RequestOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return Protobuf.internal_static_Request_descriptor;
      }

      @Override
      protected FieldAccessorTable
          internalGetFieldAccessorTable() {
        return Protobuf.internal_static_Request_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                Request.class, Builder.class);
      }

      // Construct using Protobuf.Request.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }

      private Builder(
          BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }
      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessageV3
                .alwaysUseFieldBuilders) {
        }
      }
      @Override
      public Builder clear() {
        super.clear();
        type_ = 0;

        if (userBuilder_ == null) {
          user_ = null;
        } else {
          user_ = null;
          userBuilder_ = null;
        }
        if (eagBuilder_ == null) {
          eag_ = null;
        } else {
          eag_ = null;
          eagBuilder_ = null;
        }
        if (pdBuilder_ == null) {
          pd_ = null;
        } else {
          pd_ = null;
          pdBuilder_ = null;
        }
        return this;
      }

      @Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return Protobuf.internal_static_Request_descriptor;
      }

      @Override
      public Request getDefaultInstanceForType() {
        return Request.getDefaultInstance();
      }

      @Override
      public Request build() {
        Request result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @Override
      public Request buildPartial() {
        Request result = new Request(this);
        result.type_ = type_;
        if (userBuilder_ == null) {
          result.user_ = user_;
        } else {
          result.user_ = userBuilder_.build();
        }
        if (eagBuilder_ == null) {
          result.eag_ = eag_;
        } else {
          result.eag_ = eagBuilder_.build();
        }
        if (pdBuilder_ == null) {
          result.pd_ = pd_;
        } else {
          result.pd_ = pdBuilder_.build();
        }
        onBuilt();
        return result;
      }

      @Override
      public Builder clone() {
        return super.clone();
      }
      @Override
      public Builder setField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          Object value) {
        return super.setField(field, value);
      }
      @Override
      public Builder clearField(
          com.google.protobuf.Descriptors.FieldDescriptor field) {
        return super.clearField(field);
      }
      @Override
      public Builder clearOneof(
          com.google.protobuf.Descriptors.OneofDescriptor oneof) {
        return super.clearOneof(oneof);
      }
      @Override
      public Builder setRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          int index, Object value) {
        return super.setRepeatedField(field, index, value);
      }
      @Override
      public Builder addRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          Object value) {
        return super.addRepeatedField(field, value);
      }
      @Override
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof Request) {
          return mergeFrom((Request)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(Request other) {
        if (other == Request.getDefaultInstance()) return this;
        if (other.type_ != 0) {
          setTypeValue(other.getTypeValue());
        }
        if (other.hasUser()) {
          mergeUser(other.getUser());
        }
        if (other.hasEag()) {
          mergeEag(other.getEag());
        }
        if (other.hasPd()) {
          mergePd(other.getPd());
        }
        this.mergeUnknownFields(other.unknownFields);
        onChanged();
        return this;
      }

      @Override
      public final boolean isInitialized() {
        return true;
      }

      @Override
      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        Request parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (Request) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private int type_ = 0;
      /**
       * <code>.Request.Type type = 1;</code>
       * @return The enum numeric value on the wire for type.
       */
      @Override public int getTypeValue() {
        return type_;
      }
      /**
       * <code>.Request.Type type = 1;</code>
       * @param value The enum numeric value on the wire for type to set.
       * @return This builder for chaining.
       */
      public Builder setTypeValue(int value) {
        
        type_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>.Request.Type type = 1;</code>
       * @return The type.
       */
      @Override
      public Type getType() {
        @SuppressWarnings("deprecation")
        Type result = Type.valueOf(type_);
        return result == null ? Type.UNRECOGNIZED : result;
      }
      /**
       * <code>.Request.Type type = 1;</code>
       * @param value The type to set.
       * @return This builder for chaining.
       */
      public Builder setType(Type value) {
        if (value == null) {
          throw new NullPointerException();
        }
        
        type_ = value.getNumber();
        onChanged();
        return this;
      }
      /**
       * <code>.Request.Type type = 1;</code>
       * @return This builder for chaining.
       */
      public Builder clearType() {
        
        type_ = 0;
        onChanged();
        return this;
      }

      private User user_;
      private com.google.protobuf.SingleFieldBuilderV3<
          User, User.Builder, UserOrBuilder> userBuilder_;
      /**
       * <code>.User user = 2;</code>
       * @return Whether the user field is set.
       */
      public boolean hasUser() {
        return userBuilder_ != null || user_ != null;
      }
      /**
       * <code>.User user = 2;</code>
       * @return The user.
       */
      public User getUser() {
        if (userBuilder_ == null) {
          return user_ == null ? User.getDefaultInstance() : user_;
        } else {
          return userBuilder_.getMessage();
        }
      }
      /**
       * <code>.User user = 2;</code>
       */
      public Builder setUser(User value) {
        if (userBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          user_ = value;
          onChanged();
        } else {
          userBuilder_.setMessage(value);
        }

        return this;
      }
      /**
       * <code>.User user = 2;</code>
       */
      public Builder setUser(
          User.Builder builderForValue) {
        if (userBuilder_ == null) {
          user_ = builderForValue.build();
          onChanged();
        } else {
          userBuilder_.setMessage(builderForValue.build());
        }

        return this;
      }
      /**
       * <code>.User user = 2;</code>
       */
      public Builder mergeUser(User value) {
        if (userBuilder_ == null) {
          if (user_ != null) {
            user_ =
              User.newBuilder(user_).mergeFrom(value).buildPartial();
          } else {
            user_ = value;
          }
          onChanged();
        } else {
          userBuilder_.mergeFrom(value);
        }

        return this;
      }
      /**
       * <code>.User user = 2;</code>
       */
      public Builder clearUser() {
        if (userBuilder_ == null) {
          user_ = null;
          onChanged();
        } else {
          user_ = null;
          userBuilder_ = null;
        }

        return this;
      }
      /**
       * <code>.User user = 2;</code>
       */
      public User.Builder getUserBuilder() {
        
        onChanged();
        return getUserFieldBuilder().getBuilder();
      }
      /**
       * <code>.User user = 2;</code>
       */
      public UserOrBuilder getUserOrBuilder() {
        if (userBuilder_ != null) {
          return userBuilder_.getMessageOrBuilder();
        } else {
          return user_ == null ?
              User.getDefaultInstance() : user_;
        }
      }
      /**
       * <code>.User user = 2;</code>
       */
      private com.google.protobuf.SingleFieldBuilderV3<
          User, User.Builder, UserOrBuilder>
          getUserFieldBuilder() {
        if (userBuilder_ == null) {
          userBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
              User, User.Builder, UserOrBuilder>(
                  getUser(),
                  getParentForChildren(),
                  isClean());
          user_ = null;
        }
        return userBuilder_;
      }

      private EventAgeGroupDTO eag_;
      private com.google.protobuf.SingleFieldBuilderV3<
          EventAgeGroupDTO, EventAgeGroupDTO.Builder, EventAgeGroupDTOOrBuilder> eagBuilder_;
      /**
       * <code>.EventAgeGroupDTO eag = 3;</code>
       * @return Whether the eag field is set.
       */
      public boolean hasEag() {
        return eagBuilder_ != null || eag_ != null;
      }
      /**
       * <code>.EventAgeGroupDTO eag = 3;</code>
       * @return The eag.
       */
      public EventAgeGroupDTO getEag() {
        if (eagBuilder_ == null) {
          return eag_ == null ? EventAgeGroupDTO.getDefaultInstance() : eag_;
        } else {
          return eagBuilder_.getMessage();
        }
      }
      /**
       * <code>.EventAgeGroupDTO eag = 3;</code>
       */
      public Builder setEag(EventAgeGroupDTO value) {
        if (eagBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          eag_ = value;
          onChanged();
        } else {
          eagBuilder_.setMessage(value);
        }

        return this;
      }
      /**
       * <code>.EventAgeGroupDTO eag = 3;</code>
       */
      public Builder setEag(
          EventAgeGroupDTO.Builder builderForValue) {
        if (eagBuilder_ == null) {
          eag_ = builderForValue.build();
          onChanged();
        } else {
          eagBuilder_.setMessage(builderForValue.build());
        }

        return this;
      }
      /**
       * <code>.EventAgeGroupDTO eag = 3;</code>
       */
      public Builder mergeEag(EventAgeGroupDTO value) {
        if (eagBuilder_ == null) {
          if (eag_ != null) {
            eag_ =
              EventAgeGroupDTO.newBuilder(eag_).mergeFrom(value).buildPartial();
          } else {
            eag_ = value;
          }
          onChanged();
        } else {
          eagBuilder_.mergeFrom(value);
        }

        return this;
      }
      /**
       * <code>.EventAgeGroupDTO eag = 3;</code>
       */
      public Builder clearEag() {
        if (eagBuilder_ == null) {
          eag_ = null;
          onChanged();
        } else {
          eag_ = null;
          eagBuilder_ = null;
        }

        return this;
      }
      /**
       * <code>.EventAgeGroupDTO eag = 3;</code>
       */
      public EventAgeGroupDTO.Builder getEagBuilder() {
        
        onChanged();
        return getEagFieldBuilder().getBuilder();
      }
      /**
       * <code>.EventAgeGroupDTO eag = 3;</code>
       */
      public EventAgeGroupDTOOrBuilder getEagOrBuilder() {
        if (eagBuilder_ != null) {
          return eagBuilder_.getMessageOrBuilder();
        } else {
          return eag_ == null ?
              EventAgeGroupDTO.getDefaultInstance() : eag_;
        }
      }
      /**
       * <code>.EventAgeGroupDTO eag = 3;</code>
       */
      private com.google.protobuf.SingleFieldBuilderV3<
          EventAgeGroupDTO, EventAgeGroupDTO.Builder, EventAgeGroupDTOOrBuilder>
          getEagFieldBuilder() {
        if (eagBuilder_ == null) {
          eagBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
              EventAgeGroupDTO, EventAgeGroupDTO.Builder, EventAgeGroupDTOOrBuilder>(
                  getEag(),
                  getParentForChildren(),
                  isClean());
          eag_ = null;
        }
        return eagBuilder_;
      }

      private ParticipantDetailsDTO pd_;
      private com.google.protobuf.SingleFieldBuilderV3<
          ParticipantDetailsDTO, ParticipantDetailsDTO.Builder, ParticipantDetailsDTOOrBuilder> pdBuilder_;
      /**
       * <code>.ParticipantDetailsDTO pd = 4;</code>
       * @return Whether the pd field is set.
       */
      public boolean hasPd() {
        return pdBuilder_ != null || pd_ != null;
      }
      /**
       * <code>.ParticipantDetailsDTO pd = 4;</code>
       * @return The pd.
       */
      public ParticipantDetailsDTO getPd() {
        if (pdBuilder_ == null) {
          return pd_ == null ? ParticipantDetailsDTO.getDefaultInstance() : pd_;
        } else {
          return pdBuilder_.getMessage();
        }
      }
      /**
       * <code>.ParticipantDetailsDTO pd = 4;</code>
       */
      public Builder setPd(ParticipantDetailsDTO value) {
        if (pdBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          pd_ = value;
          onChanged();
        } else {
          pdBuilder_.setMessage(value);
        }

        return this;
      }
      /**
       * <code>.ParticipantDetailsDTO pd = 4;</code>
       */
      public Builder setPd(
          ParticipantDetailsDTO.Builder builderForValue) {
        if (pdBuilder_ == null) {
          pd_ = builderForValue.build();
          onChanged();
        } else {
          pdBuilder_.setMessage(builderForValue.build());
        }

        return this;
      }
      /**
       * <code>.ParticipantDetailsDTO pd = 4;</code>
       */
      public Builder mergePd(ParticipantDetailsDTO value) {
        if (pdBuilder_ == null) {
          if (pd_ != null) {
            pd_ =
              ParticipantDetailsDTO.newBuilder(pd_).mergeFrom(value).buildPartial();
          } else {
            pd_ = value;
          }
          onChanged();
        } else {
          pdBuilder_.mergeFrom(value);
        }

        return this;
      }
      /**
       * <code>.ParticipantDetailsDTO pd = 4;</code>
       */
      public Builder clearPd() {
        if (pdBuilder_ == null) {
          pd_ = null;
          onChanged();
        } else {
          pd_ = null;
          pdBuilder_ = null;
        }

        return this;
      }
      /**
       * <code>.ParticipantDetailsDTO pd = 4;</code>
       */
      public ParticipantDetailsDTO.Builder getPdBuilder() {
        
        onChanged();
        return getPdFieldBuilder().getBuilder();
      }
      /**
       * <code>.ParticipantDetailsDTO pd = 4;</code>
       */
      public ParticipantDetailsDTOOrBuilder getPdOrBuilder() {
        if (pdBuilder_ != null) {
          return pdBuilder_.getMessageOrBuilder();
        } else {
          return pd_ == null ?
              ParticipantDetailsDTO.getDefaultInstance() : pd_;
        }
      }
      /**
       * <code>.ParticipantDetailsDTO pd = 4;</code>
       */
      private com.google.protobuf.SingleFieldBuilderV3<
          ParticipantDetailsDTO, ParticipantDetailsDTO.Builder, ParticipantDetailsDTOOrBuilder>
          getPdFieldBuilder() {
        if (pdBuilder_ == null) {
          pdBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
              ParticipantDetailsDTO, ParticipantDetailsDTO.Builder, ParticipantDetailsDTOOrBuilder>(
                  getPd(),
                  getParentForChildren(),
                  isClean());
          pd_ = null;
        }
        return pdBuilder_;
      }
      @Override
      public final Builder setUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.setUnknownFields(unknownFields);
      }

      @Override
      public final Builder mergeUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.mergeUnknownFields(unknownFields);
      }


      // @@protoc_insertion_point(builder_scope:Request)
    }

    // @@protoc_insertion_point(class_scope:Request)
    private static final Request DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new Request();
    }

    public static Request getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<Request>
        PARSER = new com.google.protobuf.AbstractParser<Request>() {
      @Override
      public Request parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new Request(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<Request> parser() {
      return PARSER;
    }

    @Override
    public com.google.protobuf.Parser<Request> getParserForType() {
      return PARSER;
    }

    @Override
    public Request getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  public interface ResponseOrBuilder extends
      // @@protoc_insertion_point(interface_extends:Response)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>.Response.Type type = 1;</code>
     * @return The enum numeric value on the wire for type.
     */
    int getTypeValue();
    /**
     * <code>.Response.Type type = 1;</code>
     * @return The type.
     */
    Response.Type getType();

    /**
     * <code>string error = 2;</code>
     * @return The error.
     */
    String getError();
    /**
     * <code>string error = 2;</code>
     * @return The bytes for error.
     */
    com.google.protobuf.ByteString
        getErrorBytes();

    /**
     * <code>repeated .EventCountDTO ec = 3;</code>
     */
    java.util.List<EventCountDTO>
        getEcList();
    /**
     * <code>repeated .EventCountDTO ec = 3;</code>
     */
    EventCountDTO getEc(int index);
    /**
     * <code>repeated .EventCountDTO ec = 3;</code>
     */
    int getEcCount();
    /**
     * <code>repeated .EventCountDTO ec = 3;</code>
     */
    java.util.List<? extends EventCountDTOOrBuilder>
        getEcOrBuilderList();
    /**
     * <code>repeated .EventCountDTO ec = 3;</code>
     */
    EventCountDTOOrBuilder getEcOrBuilder(
        int index);

    /**
     * <code>repeated .ChildNoEventsDTO cne = 4;</code>
     */
    java.util.List<ChildNoEventsDTO>
        getCneList();
    /**
     * <code>repeated .ChildNoEventsDTO cne = 4;</code>
     */
    ChildNoEventsDTO getCne(int index);
    /**
     * <code>repeated .ChildNoEventsDTO cne = 4;</code>
     */
    int getCneCount();
    /**
     * <code>repeated .ChildNoEventsDTO cne = 4;</code>
     */
    java.util.List<? extends ChildNoEventsDTOOrBuilder>
        getCneOrBuilderList();
    /**
     * <code>repeated .ChildNoEventsDTO cne = 4;</code>
     */
    ChildNoEventsDTOOrBuilder getCneOrBuilder(
        int index);
  }
  /**
   * Protobuf type {@code Response}
   */
  public static final class Response extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:Response)
      ResponseOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use Response.newBuilder() to construct.
    private Response(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private Response() {
      type_ = 0;
      error_ = "";
      ec_ = java.util.Collections.emptyList();
      cne_ = java.util.Collections.emptyList();
    }

    @Override
    @SuppressWarnings({"unused"})
    protected Object newInstance(
        UnusedPrivateParameter unused) {
      return new Response();
    }

    @Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private Response(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      this();
      if (extensionRegistry == null) {
        throw new NullPointerException();
      }
      int mutable_bitField0_ = 0;
      com.google.protobuf.UnknownFieldSet.Builder unknownFields =
          com.google.protobuf.UnknownFieldSet.newBuilder();
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            case 8: {
              int rawValue = input.readEnum();

              type_ = rawValue;
              break;
            }
            case 18: {
              String s = input.readStringRequireUtf8();

              error_ = s;
              break;
            }
            case 26: {
              if (!((mutable_bitField0_ & 0x00000001) != 0)) {
                ec_ = new java.util.ArrayList<EventCountDTO>();
                mutable_bitField0_ |= 0x00000001;
              }
              ec_.add(
                  input.readMessage(EventCountDTO.parser(), extensionRegistry));
              break;
            }
            case 34: {
              if (!((mutable_bitField0_ & 0x00000002) != 0)) {
                cne_ = new java.util.ArrayList<ChildNoEventsDTO>();
                mutable_bitField0_ |= 0x00000002;
              }
              cne_.add(
                  input.readMessage(ChildNoEventsDTO.parser(), extensionRegistry));
              break;
            }
            default: {
              if (!parseUnknownField(
                  input, unknownFields, extensionRegistry, tag)) {
                done = true;
              }
              break;
            }
          }
        }
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(this);
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(
            e).setUnfinishedMessage(this);
      } finally {
        if (((mutable_bitField0_ & 0x00000001) != 0)) {
          ec_ = java.util.Collections.unmodifiableList(ec_);
        }
        if (((mutable_bitField0_ & 0x00000002) != 0)) {
          cne_ = java.util.Collections.unmodifiableList(cne_);
        }
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return Protobuf.internal_static_Response_descriptor;
    }

    @Override
    protected FieldAccessorTable
        internalGetFieldAccessorTable() {
      return Protobuf.internal_static_Response_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              Response.class, Builder.class);
    }

    /**
     * Protobuf enum {@code Response.Type}
     */
    public enum Type
        implements com.google.protobuf.ProtocolMessageEnum {
      /**
       * <code>UNKNOWN = 0;</code>
       */
      UNKNOWN(0),
      /**
       * <code>OK = 1;</code>
       */
      OK(1),
      /**
       * <code>ERROR = 2;</code>
       */
      ERROR(2),
      /**
       * <code>CHILDREN_EVENTS = 3;</code>
       */
      CHILDREN_EVENTS(3),
      /**
       * <code>EVENT_COUNT = 4;</code>
       */
      EVENT_COUNT(4),
      /**
       * <code>REFRESH_EVENTS = 5;</code>
       */
      REFRESH_EVENTS(5),
      UNRECOGNIZED(-1),
      ;

      /**
       * <code>UNKNOWN = 0;</code>
       */
      public static final int UNKNOWN_VALUE = 0;
      /**
       * <code>OK = 1;</code>
       */
      public static final int OK_VALUE = 1;
      /**
       * <code>ERROR = 2;</code>
       */
      public static final int ERROR_VALUE = 2;
      /**
       * <code>CHILDREN_EVENTS = 3;</code>
       */
      public static final int CHILDREN_EVENTS_VALUE = 3;
      /**
       * <code>EVENT_COUNT = 4;</code>
       */
      public static final int EVENT_COUNT_VALUE = 4;
      /**
       * <code>REFRESH_EVENTS = 5;</code>
       */
      public static final int REFRESH_EVENTS_VALUE = 5;


      public final int getNumber() {
        if (this == UNRECOGNIZED) {
          throw new IllegalArgumentException(
              "Can't get the number of an unknown enum value.");
        }
        return value;
      }

      /**
       * @param value The numeric wire value of the corresponding enum entry.
       * @return The enum associated with the given numeric wire value.
       * @deprecated Use {@link #forNumber(int)} instead.
       */
      @Deprecated
      public static Type valueOf(int value) {
        return forNumber(value);
      }

      /**
       * @param value The numeric wire value of the corresponding enum entry.
       * @return The enum associated with the given numeric wire value.
       */
      public static Type forNumber(int value) {
        switch (value) {
          case 0: return UNKNOWN;
          case 1: return OK;
          case 2: return ERROR;
          case 3: return CHILDREN_EVENTS;
          case 4: return EVENT_COUNT;
          case 5: return REFRESH_EVENTS;
          default: return null;
        }
      }

      public static com.google.protobuf.Internal.EnumLiteMap<Type>
          internalGetValueMap() {
        return internalValueMap;
      }
      private static final com.google.protobuf.Internal.EnumLiteMap<
          Type> internalValueMap =
            new com.google.protobuf.Internal.EnumLiteMap<Type>() {
              public Type findValueByNumber(int number) {
                return Type.forNumber(number);
              }
            };

      public final com.google.protobuf.Descriptors.EnumValueDescriptor
          getValueDescriptor() {
        if (this == UNRECOGNIZED) {
          throw new IllegalStateException(
              "Can't get the descriptor of an unrecognized enum value.");
        }
        return getDescriptor().getValues().get(ordinal());
      }
      public final com.google.protobuf.Descriptors.EnumDescriptor
          getDescriptorForType() {
        return getDescriptor();
      }
      public static final com.google.protobuf.Descriptors.EnumDescriptor
          getDescriptor() {
        return Response.getDescriptor().getEnumTypes().get(0);
      }

      private static final Type[] VALUES = values();

      public static Type valueOf(
          com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
        if (desc.getType() != getDescriptor()) {
          throw new IllegalArgumentException(
            "EnumValueDescriptor is not for this type.");
        }
        if (desc.getIndex() == -1) {
          return UNRECOGNIZED;
        }
        return VALUES[desc.getIndex()];
      }

      private final int value;

      private Type(int value) {
        this.value = value;
      }

      // @@protoc_insertion_point(enum_scope:Response.Type)
    }

    public static final int TYPE_FIELD_NUMBER = 1;
    private int type_;
    /**
     * <code>.Response.Type type = 1;</code>
     * @return The enum numeric value on the wire for type.
     */
    @Override public int getTypeValue() {
      return type_;
    }
    /**
     * <code>.Response.Type type = 1;</code>
     * @return The type.
     */
    @Override public Type getType() {
      @SuppressWarnings("deprecation")
      Type result = Type.valueOf(type_);
      return result == null ? Type.UNRECOGNIZED : result;
    }

    public static final int ERROR_FIELD_NUMBER = 2;
    private volatile Object error_;
    /**
     * <code>string error = 2;</code>
     * @return The error.
     */
    @Override
    public String getError() {
      Object ref = error_;
      if (ref instanceof String) {
        return (String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        String s = bs.toStringUtf8();
        error_ = s;
        return s;
      }
    }
    /**
     * <code>string error = 2;</code>
     * @return The bytes for error.
     */
    @Override
    public com.google.protobuf.ByteString
        getErrorBytes() {
      Object ref = error_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (String) ref);
        error_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int EC_FIELD_NUMBER = 3;
    private java.util.List<EventCountDTO> ec_;
    /**
     * <code>repeated .EventCountDTO ec = 3;</code>
     */
    @Override
    public java.util.List<EventCountDTO> getEcList() {
      return ec_;
    }
    /**
     * <code>repeated .EventCountDTO ec = 3;</code>
     */
    @Override
    public java.util.List<? extends EventCountDTOOrBuilder>
        getEcOrBuilderList() {
      return ec_;
    }
    /**
     * <code>repeated .EventCountDTO ec = 3;</code>
     */
    @Override
    public int getEcCount() {
      return ec_.size();
    }
    /**
     * <code>repeated .EventCountDTO ec = 3;</code>
     */
    @Override
    public EventCountDTO getEc(int index) {
      return ec_.get(index);
    }
    /**
     * <code>repeated .EventCountDTO ec = 3;</code>
     */
    @Override
    public EventCountDTOOrBuilder getEcOrBuilder(
        int index) {
      return ec_.get(index);
    }

    public static final int CNE_FIELD_NUMBER = 4;
    private java.util.List<ChildNoEventsDTO> cne_;
    /**
     * <code>repeated .ChildNoEventsDTO cne = 4;</code>
     */
    @Override
    public java.util.List<ChildNoEventsDTO> getCneList() {
      return cne_;
    }
    /**
     * <code>repeated .ChildNoEventsDTO cne = 4;</code>
     */
    @Override
    public java.util.List<? extends ChildNoEventsDTOOrBuilder>
        getCneOrBuilderList() {
      return cne_;
    }
    /**
     * <code>repeated .ChildNoEventsDTO cne = 4;</code>
     */
    @Override
    public int getCneCount() {
      return cne_.size();
    }
    /**
     * <code>repeated .ChildNoEventsDTO cne = 4;</code>
     */
    @Override
    public ChildNoEventsDTO getCne(int index) {
      return cne_.get(index);
    }
    /**
     * <code>repeated .ChildNoEventsDTO cne = 4;</code>
     */
    @Override
    public ChildNoEventsDTOOrBuilder getCneOrBuilder(
        int index) {
      return cne_.get(index);
    }

    private byte memoizedIsInitialized = -1;
    @Override
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      memoizedIsInitialized = 1;
      return true;
    }

    @Override
    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      if (type_ != Type.UNKNOWN.getNumber()) {
        output.writeEnum(1, type_);
      }
      if (!getErrorBytes().isEmpty()) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 2, error_);
      }
      for (int i = 0; i < ec_.size(); i++) {
        output.writeMessage(3, ec_.get(i));
      }
      for (int i = 0; i < cne_.size(); i++) {
        output.writeMessage(4, cne_.get(i));
      }
      unknownFields.writeTo(output);
    }

    @Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (type_ != Type.UNKNOWN.getNumber()) {
        size += com.google.protobuf.CodedOutputStream
          .computeEnumSize(1, type_);
      }
      if (!getErrorBytes().isEmpty()) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, error_);
      }
      for (int i = 0; i < ec_.size(); i++) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(3, ec_.get(i));
      }
      for (int i = 0; i < cne_.size(); i++) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(4, cne_.get(i));
      }
      size += unknownFields.getSerializedSize();
      memoizedSize = size;
      return size;
    }

    @Override
    public boolean equals(final Object obj) {
      if (obj == this) {
       return true;
      }
      if (!(obj instanceof Response)) {
        return super.equals(obj);
      }
      Response other = (Response) obj;

      if (type_ != other.type_) return false;
      if (!getError()
          .equals(other.getError())) return false;
      if (!getEcList()
          .equals(other.getEcList())) return false;
      if (!getCneList()
          .equals(other.getCneList())) return false;
      if (!unknownFields.equals(other.unknownFields)) return false;
      return true;
    }

    @Override
    public int hashCode() {
      if (memoizedHashCode != 0) {
        return memoizedHashCode;
      }
      int hash = 41;
      hash = (19 * hash) + getDescriptor().hashCode();
      hash = (37 * hash) + TYPE_FIELD_NUMBER;
      hash = (53 * hash) + type_;
      hash = (37 * hash) + ERROR_FIELD_NUMBER;
      hash = (53 * hash) + getError().hashCode();
      if (getEcCount() > 0) {
        hash = (37 * hash) + EC_FIELD_NUMBER;
        hash = (53 * hash) + getEcList().hashCode();
      }
      if (getCneCount() > 0) {
        hash = (37 * hash) + CNE_FIELD_NUMBER;
        hash = (53 * hash) + getCneList().hashCode();
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static Response parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static Response parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static Response parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static Response parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static Response parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static Response parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static Response parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static Response parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static Response parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static Response parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static Response parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static Response parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    @Override
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
    }
    public static Builder newBuilder(Response prototype) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }
    @Override
    public Builder toBuilder() {
      return this == DEFAULT_INSTANCE
          ? new Builder() : new Builder().mergeFrom(this);
    }

    @Override
    protected Builder newBuilderForType(
        BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    /**
     * Protobuf type {@code Response}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:Response)
        ResponseOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return Protobuf.internal_static_Response_descriptor;
      }

      @Override
      protected FieldAccessorTable
          internalGetFieldAccessorTable() {
        return Protobuf.internal_static_Response_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                Response.class, Builder.class);
      }

      // Construct using Protobuf.Response.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }

      private Builder(
          BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }
      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessageV3
                .alwaysUseFieldBuilders) {
          getEcFieldBuilder();
          getCneFieldBuilder();
        }
      }
      @Override
      public Builder clear() {
        super.clear();
        type_ = 0;

        error_ = "";

        if (ecBuilder_ == null) {
          ec_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000001);
        } else {
          ecBuilder_.clear();
        }
        if (cneBuilder_ == null) {
          cne_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000002);
        } else {
          cneBuilder_.clear();
        }
        return this;
      }

      @Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return Protobuf.internal_static_Response_descriptor;
      }

      @Override
      public Response getDefaultInstanceForType() {
        return Response.getDefaultInstance();
      }

      @Override
      public Response build() {
        Response result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @Override
      public Response buildPartial() {
        Response result = new Response(this);
        int from_bitField0_ = bitField0_;
        result.type_ = type_;
        result.error_ = error_;
        if (ecBuilder_ == null) {
          if (((bitField0_ & 0x00000001) != 0)) {
            ec_ = java.util.Collections.unmodifiableList(ec_);
            bitField0_ = (bitField0_ & ~0x00000001);
          }
          result.ec_ = ec_;
        } else {
          result.ec_ = ecBuilder_.build();
        }
        if (cneBuilder_ == null) {
          if (((bitField0_ & 0x00000002) != 0)) {
            cne_ = java.util.Collections.unmodifiableList(cne_);
            bitField0_ = (bitField0_ & ~0x00000002);
          }
          result.cne_ = cne_;
        } else {
          result.cne_ = cneBuilder_.build();
        }
        onBuilt();
        return result;
      }

      @Override
      public Builder clone() {
        return super.clone();
      }
      @Override
      public Builder setField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          Object value) {
        return super.setField(field, value);
      }
      @Override
      public Builder clearField(
          com.google.protobuf.Descriptors.FieldDescriptor field) {
        return super.clearField(field);
      }
      @Override
      public Builder clearOneof(
          com.google.protobuf.Descriptors.OneofDescriptor oneof) {
        return super.clearOneof(oneof);
      }
      @Override
      public Builder setRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          int index, Object value) {
        return super.setRepeatedField(field, index, value);
      }
      @Override
      public Builder addRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          Object value) {
        return super.addRepeatedField(field, value);
      }
      @Override
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof Response) {
          return mergeFrom((Response)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(Response other) {
        if (other == Response.getDefaultInstance()) return this;
        if (other.type_ != 0) {
          setTypeValue(other.getTypeValue());
        }
        if (!other.getError().isEmpty()) {
          error_ = other.error_;
          onChanged();
        }
        if (ecBuilder_ == null) {
          if (!other.ec_.isEmpty()) {
            if (ec_.isEmpty()) {
              ec_ = other.ec_;
              bitField0_ = (bitField0_ & ~0x00000001);
            } else {
              ensureEcIsMutable();
              ec_.addAll(other.ec_);
            }
            onChanged();
          }
        } else {
          if (!other.ec_.isEmpty()) {
            if (ecBuilder_.isEmpty()) {
              ecBuilder_.dispose();
              ecBuilder_ = null;
              ec_ = other.ec_;
              bitField0_ = (bitField0_ & ~0x00000001);
              ecBuilder_ = 
                com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                   getEcFieldBuilder() : null;
            } else {
              ecBuilder_.addAllMessages(other.ec_);
            }
          }
        }
        if (cneBuilder_ == null) {
          if (!other.cne_.isEmpty()) {
            if (cne_.isEmpty()) {
              cne_ = other.cne_;
              bitField0_ = (bitField0_ & ~0x00000002);
            } else {
              ensureCneIsMutable();
              cne_.addAll(other.cne_);
            }
            onChanged();
          }
        } else {
          if (!other.cne_.isEmpty()) {
            if (cneBuilder_.isEmpty()) {
              cneBuilder_.dispose();
              cneBuilder_ = null;
              cne_ = other.cne_;
              bitField0_ = (bitField0_ & ~0x00000002);
              cneBuilder_ = 
                com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                   getCneFieldBuilder() : null;
            } else {
              cneBuilder_.addAllMessages(other.cne_);
            }
          }
        }
        this.mergeUnknownFields(other.unknownFields);
        onChanged();
        return this;
      }

      @Override
      public final boolean isInitialized() {
        return true;
      }

      @Override
      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        Response parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (Response) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private int type_ = 0;
      /**
       * <code>.Response.Type type = 1;</code>
       * @return The enum numeric value on the wire for type.
       */
      @Override public int getTypeValue() {
        return type_;
      }
      /**
       * <code>.Response.Type type = 1;</code>
       * @param value The enum numeric value on the wire for type to set.
       * @return This builder for chaining.
       */
      public Builder setTypeValue(int value) {
        
        type_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>.Response.Type type = 1;</code>
       * @return The type.
       */
      @Override
      public Type getType() {
        @SuppressWarnings("deprecation")
        Type result = Type.valueOf(type_);
        return result == null ? Type.UNRECOGNIZED : result;
      }
      /**
       * <code>.Response.Type type = 1;</code>
       * @param value The type to set.
       * @return This builder for chaining.
       */
      public Builder setType(Type value) {
        if (value == null) {
          throw new NullPointerException();
        }
        
        type_ = value.getNumber();
        onChanged();
        return this;
      }
      /**
       * <code>.Response.Type type = 1;</code>
       * @return This builder for chaining.
       */
      public Builder clearType() {
        
        type_ = 0;
        onChanged();
        return this;
      }

      private Object error_ = "";
      /**
       * <code>string error = 2;</code>
       * @return The error.
       */
      public String getError() {
        Object ref = error_;
        if (!(ref instanceof String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          String s = bs.toStringUtf8();
          error_ = s;
          return s;
        } else {
          return (String) ref;
        }
      }
      /**
       * <code>string error = 2;</code>
       * @return The bytes for error.
       */
      public com.google.protobuf.ByteString
          getErrorBytes() {
        Object ref = error_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (String) ref);
          error_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>string error = 2;</code>
       * @param value The error to set.
       * @return This builder for chaining.
       */
      public Builder setError(
          String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  
        error_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>string error = 2;</code>
       * @return This builder for chaining.
       */
      public Builder clearError() {
        
        error_ = getDefaultInstance().getError();
        onChanged();
        return this;
      }
      /**
       * <code>string error = 2;</code>
       * @param value The bytes for error to set.
       * @return This builder for chaining.
       */
      public Builder setErrorBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
        
        error_ = value;
        onChanged();
        return this;
      }

      private java.util.List<EventCountDTO> ec_ =
        java.util.Collections.emptyList();
      private void ensureEcIsMutable() {
        if (!((bitField0_ & 0x00000001) != 0)) {
          ec_ = new java.util.ArrayList<EventCountDTO>(ec_);
          bitField0_ |= 0x00000001;
         }
      }

      private com.google.protobuf.RepeatedFieldBuilderV3<
          EventCountDTO, EventCountDTO.Builder, EventCountDTOOrBuilder> ecBuilder_;

      /**
       * <code>repeated .EventCountDTO ec = 3;</code>
       */
      public java.util.List<EventCountDTO> getEcList() {
        if (ecBuilder_ == null) {
          return java.util.Collections.unmodifiableList(ec_);
        } else {
          return ecBuilder_.getMessageList();
        }
      }
      /**
       * <code>repeated .EventCountDTO ec = 3;</code>
       */
      public int getEcCount() {
        if (ecBuilder_ == null) {
          return ec_.size();
        } else {
          return ecBuilder_.getCount();
        }
      }
      /**
       * <code>repeated .EventCountDTO ec = 3;</code>
       */
      public EventCountDTO getEc(int index) {
        if (ecBuilder_ == null) {
          return ec_.get(index);
        } else {
          return ecBuilder_.getMessage(index);
        }
      }
      /**
       * <code>repeated .EventCountDTO ec = 3;</code>
       */
      public Builder setEc(
          int index, EventCountDTO value) {
        if (ecBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureEcIsMutable();
          ec_.set(index, value);
          onChanged();
        } else {
          ecBuilder_.setMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .EventCountDTO ec = 3;</code>
       */
      public Builder setEc(
          int index, EventCountDTO.Builder builderForValue) {
        if (ecBuilder_ == null) {
          ensureEcIsMutable();
          ec_.set(index, builderForValue.build());
          onChanged();
        } else {
          ecBuilder_.setMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .EventCountDTO ec = 3;</code>
       */
      public Builder addEc(EventCountDTO value) {
        if (ecBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureEcIsMutable();
          ec_.add(value);
          onChanged();
        } else {
          ecBuilder_.addMessage(value);
        }
        return this;
      }
      /**
       * <code>repeated .EventCountDTO ec = 3;</code>
       */
      public Builder addEc(
          int index, EventCountDTO value) {
        if (ecBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureEcIsMutable();
          ec_.add(index, value);
          onChanged();
        } else {
          ecBuilder_.addMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .EventCountDTO ec = 3;</code>
       */
      public Builder addEc(
          EventCountDTO.Builder builderForValue) {
        if (ecBuilder_ == null) {
          ensureEcIsMutable();
          ec_.add(builderForValue.build());
          onChanged();
        } else {
          ecBuilder_.addMessage(builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .EventCountDTO ec = 3;</code>
       */
      public Builder addEc(
          int index, EventCountDTO.Builder builderForValue) {
        if (ecBuilder_ == null) {
          ensureEcIsMutable();
          ec_.add(index, builderForValue.build());
          onChanged();
        } else {
          ecBuilder_.addMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .EventCountDTO ec = 3;</code>
       */
      public Builder addAllEc(
          Iterable<? extends EventCountDTO> values) {
        if (ecBuilder_ == null) {
          ensureEcIsMutable();
          com.google.protobuf.AbstractMessageLite.Builder.addAll(
              values, ec_);
          onChanged();
        } else {
          ecBuilder_.addAllMessages(values);
        }
        return this;
      }
      /**
       * <code>repeated .EventCountDTO ec = 3;</code>
       */
      public Builder clearEc() {
        if (ecBuilder_ == null) {
          ec_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000001);
          onChanged();
        } else {
          ecBuilder_.clear();
        }
        return this;
      }
      /**
       * <code>repeated .EventCountDTO ec = 3;</code>
       */
      public Builder removeEc(int index) {
        if (ecBuilder_ == null) {
          ensureEcIsMutable();
          ec_.remove(index);
          onChanged();
        } else {
          ecBuilder_.remove(index);
        }
        return this;
      }
      /**
       * <code>repeated .EventCountDTO ec = 3;</code>
       */
      public EventCountDTO.Builder getEcBuilder(
          int index) {
        return getEcFieldBuilder().getBuilder(index);
      }
      /**
       * <code>repeated .EventCountDTO ec = 3;</code>
       */
      public EventCountDTOOrBuilder getEcOrBuilder(
          int index) {
        if (ecBuilder_ == null) {
          return ec_.get(index);  } else {
          return ecBuilder_.getMessageOrBuilder(index);
        }
      }
      /**
       * <code>repeated .EventCountDTO ec = 3;</code>
       */
      public java.util.List<? extends EventCountDTOOrBuilder>
           getEcOrBuilderList() {
        if (ecBuilder_ != null) {
          return ecBuilder_.getMessageOrBuilderList();
        } else {
          return java.util.Collections.unmodifiableList(ec_);
        }
      }
      /**
       * <code>repeated .EventCountDTO ec = 3;</code>
       */
      public EventCountDTO.Builder addEcBuilder() {
        return getEcFieldBuilder().addBuilder(
            EventCountDTO.getDefaultInstance());
      }
      /**
       * <code>repeated .EventCountDTO ec = 3;</code>
       */
      public EventCountDTO.Builder addEcBuilder(
          int index) {
        return getEcFieldBuilder().addBuilder(
            index, EventCountDTO.getDefaultInstance());
      }
      /**
       * <code>repeated .EventCountDTO ec = 3;</code>
       */
      public java.util.List<EventCountDTO.Builder>
           getEcBuilderList() {
        return getEcFieldBuilder().getBuilderList();
      }
      private com.google.protobuf.RepeatedFieldBuilderV3<
          EventCountDTO, EventCountDTO.Builder, EventCountDTOOrBuilder>
          getEcFieldBuilder() {
        if (ecBuilder_ == null) {
          ecBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
              EventCountDTO, EventCountDTO.Builder, EventCountDTOOrBuilder>(
                  ec_,
                  ((bitField0_ & 0x00000001) != 0),
                  getParentForChildren(),
                  isClean());
          ec_ = null;
        }
        return ecBuilder_;
      }

      private java.util.List<ChildNoEventsDTO> cne_ =
        java.util.Collections.emptyList();
      private void ensureCneIsMutable() {
        if (!((bitField0_ & 0x00000002) != 0)) {
          cne_ = new java.util.ArrayList<ChildNoEventsDTO>(cne_);
          bitField0_ |= 0x00000002;
         }
      }

      private com.google.protobuf.RepeatedFieldBuilderV3<
          ChildNoEventsDTO, ChildNoEventsDTO.Builder, ChildNoEventsDTOOrBuilder> cneBuilder_;

      /**
       * <code>repeated .ChildNoEventsDTO cne = 4;</code>
       */
      public java.util.List<ChildNoEventsDTO> getCneList() {
        if (cneBuilder_ == null) {
          return java.util.Collections.unmodifiableList(cne_);
        } else {
          return cneBuilder_.getMessageList();
        }
      }
      /**
       * <code>repeated .ChildNoEventsDTO cne = 4;</code>
       */
      public int getCneCount() {
        if (cneBuilder_ == null) {
          return cne_.size();
        } else {
          return cneBuilder_.getCount();
        }
      }
      /**
       * <code>repeated .ChildNoEventsDTO cne = 4;</code>
       */
      public ChildNoEventsDTO getCne(int index) {
        if (cneBuilder_ == null) {
          return cne_.get(index);
        } else {
          return cneBuilder_.getMessage(index);
        }
      }
      /**
       * <code>repeated .ChildNoEventsDTO cne = 4;</code>
       */
      public Builder setCne(
          int index, ChildNoEventsDTO value) {
        if (cneBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureCneIsMutable();
          cne_.set(index, value);
          onChanged();
        } else {
          cneBuilder_.setMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .ChildNoEventsDTO cne = 4;</code>
       */
      public Builder setCne(
          int index, ChildNoEventsDTO.Builder builderForValue) {
        if (cneBuilder_ == null) {
          ensureCneIsMutable();
          cne_.set(index, builderForValue.build());
          onChanged();
        } else {
          cneBuilder_.setMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .ChildNoEventsDTO cne = 4;</code>
       */
      public Builder addCne(ChildNoEventsDTO value) {
        if (cneBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureCneIsMutable();
          cne_.add(value);
          onChanged();
        } else {
          cneBuilder_.addMessage(value);
        }
        return this;
      }
      /**
       * <code>repeated .ChildNoEventsDTO cne = 4;</code>
       */
      public Builder addCne(
          int index, ChildNoEventsDTO value) {
        if (cneBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureCneIsMutable();
          cne_.add(index, value);
          onChanged();
        } else {
          cneBuilder_.addMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .ChildNoEventsDTO cne = 4;</code>
       */
      public Builder addCne(
          ChildNoEventsDTO.Builder builderForValue) {
        if (cneBuilder_ == null) {
          ensureCneIsMutable();
          cne_.add(builderForValue.build());
          onChanged();
        } else {
          cneBuilder_.addMessage(builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .ChildNoEventsDTO cne = 4;</code>
       */
      public Builder addCne(
          int index, ChildNoEventsDTO.Builder builderForValue) {
        if (cneBuilder_ == null) {
          ensureCneIsMutable();
          cne_.add(index, builderForValue.build());
          onChanged();
        } else {
          cneBuilder_.addMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .ChildNoEventsDTO cne = 4;</code>
       */
      public Builder addAllCne(
          Iterable<? extends ChildNoEventsDTO> values) {
        if (cneBuilder_ == null) {
          ensureCneIsMutable();
          com.google.protobuf.AbstractMessageLite.Builder.addAll(
              values, cne_);
          onChanged();
        } else {
          cneBuilder_.addAllMessages(values);
        }
        return this;
      }
      /**
       * <code>repeated .ChildNoEventsDTO cne = 4;</code>
       */
      public Builder clearCne() {
        if (cneBuilder_ == null) {
          cne_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000002);
          onChanged();
        } else {
          cneBuilder_.clear();
        }
        return this;
      }
      /**
       * <code>repeated .ChildNoEventsDTO cne = 4;</code>
       */
      public Builder removeCne(int index) {
        if (cneBuilder_ == null) {
          ensureCneIsMutable();
          cne_.remove(index);
          onChanged();
        } else {
          cneBuilder_.remove(index);
        }
        return this;
      }
      /**
       * <code>repeated .ChildNoEventsDTO cne = 4;</code>
       */
      public ChildNoEventsDTO.Builder getCneBuilder(
          int index) {
        return getCneFieldBuilder().getBuilder(index);
      }
      /**
       * <code>repeated .ChildNoEventsDTO cne = 4;</code>
       */
      public ChildNoEventsDTOOrBuilder getCneOrBuilder(
          int index) {
        if (cneBuilder_ == null) {
          return cne_.get(index);  } else {
          return cneBuilder_.getMessageOrBuilder(index);
        }
      }
      /**
       * <code>repeated .ChildNoEventsDTO cne = 4;</code>
       */
      public java.util.List<? extends ChildNoEventsDTOOrBuilder>
           getCneOrBuilderList() {
        if (cneBuilder_ != null) {
          return cneBuilder_.getMessageOrBuilderList();
        } else {
          return java.util.Collections.unmodifiableList(cne_);
        }
      }
      /**
       * <code>repeated .ChildNoEventsDTO cne = 4;</code>
       */
      public ChildNoEventsDTO.Builder addCneBuilder() {
        return getCneFieldBuilder().addBuilder(
            ChildNoEventsDTO.getDefaultInstance());
      }
      /**
       * <code>repeated .ChildNoEventsDTO cne = 4;</code>
       */
      public ChildNoEventsDTO.Builder addCneBuilder(
          int index) {
        return getCneFieldBuilder().addBuilder(
            index, ChildNoEventsDTO.getDefaultInstance());
      }
      /**
       * <code>repeated .ChildNoEventsDTO cne = 4;</code>
       */
      public java.util.List<ChildNoEventsDTO.Builder>
           getCneBuilderList() {
        return getCneFieldBuilder().getBuilderList();
      }
      private com.google.protobuf.RepeatedFieldBuilderV3<
          ChildNoEventsDTO, ChildNoEventsDTO.Builder, ChildNoEventsDTOOrBuilder>
          getCneFieldBuilder() {
        if (cneBuilder_ == null) {
          cneBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
              ChildNoEventsDTO, ChildNoEventsDTO.Builder, ChildNoEventsDTOOrBuilder>(
                  cne_,
                  ((bitField0_ & 0x00000002) != 0),
                  getParentForChildren(),
                  isClean());
          cne_ = null;
        }
        return cneBuilder_;
      }
      @Override
      public final Builder setUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.setUnknownFields(unknownFields);
      }

      @Override
      public final Builder mergeUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.mergeUnknownFields(unknownFields);
      }


      // @@protoc_insertion_point(builder_scope:Response)
    }

    // @@protoc_insertion_point(class_scope:Response)
    private static final Response DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new Response();
    }

    public static Response getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<Response>
        PARSER = new com.google.protobuf.AbstractParser<Response>() {
      @Override
      public Response parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new Response(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<Response> parser() {
      return PARSER;
    }

    @Override
    public com.google.protobuf.Parser<Response> getParserForType() {
      return PARSER;
    }

    @Override
    public Response getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_User_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_User_fieldAccessorTable;
  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_Child_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_Child_fieldAccessorTable;
  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_ParticipantDetailsDTO_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_ParticipantDetailsDTO_fieldAccessorTable;
  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_ChildNoEventsDTO_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_ChildNoEventsDTO_fieldAccessorTable;
  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_EventAgeGroupDTO_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_EventAgeGroupDTO_fieldAccessorTable;
  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_EventCountDTO_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_EventCountDTO_fieldAccessorTable;
  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_Request_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_Request_fieldAccessorTable;
  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_Response_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_Response_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    String[] descriptorData = {
      "\n\021Protocol_v3.proto\"*\n\004User\022\020\n\010username\030" +
      "\001 \001(\t\022\020\n\010password\030\002 \001(\t\"\"\n\005Child\022\014\n\004name" +
      "\030\001 \001(\t\022\013\n\003age\030\002 \001(\005\"b\n\025ParticipantDetail" +
      "sDTO\022\014\n\004name\030\001 \001(\t\022\013\n\003age\030\002 \001(\005\022\026\n\006event" +
      "1\030\003 \001(\0162\006.Event\022\026\n\006event2\030\004 \001(\0162\006.Event\"" +
      ";\n\020ChildNoEventsDTO\022\025\n\005child\030\001 \001(\0132\006.Chi" +
      "ld\022\020\n\010noEvents\030\002 \001(\005\"F\n\020EventAgeGroupDTO" +
      "\022\025\n\005event\030\001 \001(\0162\006.Event\022\033\n\010ageGroup\030\002 \001(" +
      "\0162\t.AgeGroup\"R\n\rEventCountDTO\022\025\n\005event\030\001" +
      " \001(\0162\006.Event\022\033\n\010ageGroup\030\002 \001(\0162\t.AgeGrou" +
      "p\022\r\n\005count\030\003 \001(\003\"\346\001\n\007Request\022\033\n\004type\030\001 \001" +
      "(\0162\r.Request.Type\022\023\n\004user\030\002 \001(\0132\005.User\022\036" +
      "\n\003eag\030\003 \001(\0132\021.EventAgeGroupDTO\022\"\n\002pd\030\004 \001" +
      "(\0132\026.ParticipantDetailsDTO\"e\n\004Type\022\013\n\007UN" +
      "KNOWN\020\000\022\t\n\005LOGIN\020\001\022\n\n\006LOGOUT\020\002\022\023\n\017CHILDR" +
      "EN_EVENTS\020\003\022\023\n\017ADD_PARTICIPANT\020\004\022\017\n\013EVEN" +
      "T_COUNT\020\005\"\325\001\n\010Response\022\034\n\004type\030\001 \001(\0162\016.R" +
      "esponse.Type\022\r\n\005error\030\002 \001(\t\022\032\n\002ec\030\003 \003(\0132" +
      "\016.EventCountDTO\022\036\n\003cne\030\004 \003(\0132\021.ChildNoEv" +
      "entsDTO\"`\n\004Type\022\013\n\007UNKNOWN\020\000\022\006\n\002OK\020\001\022\t\n\005" +
      "ERROR\020\002\022\023\n\017CHILDREN_EVENTS\020\003\022\017\n\013EVENT_CO" +
      "UNT\020\004\022\022\n\016REFRESH_EVENTS\020\005*>\n\005Event\022\010\n\004NO" +
      "NE\020\000\022\010\n\004E50M\020\001\022\t\n\005E100M\020\002\022\n\n\006E1000M\020\003\022\n\n" +
      "\006E1500M\020\004*.\n\010AgeGroup\022\t\n\005A6_8Y\020\000\022\n\n\006A9_1" +
      "1Y\020\001\022\013\n\007A12_15Y\020\002B\nB\010Protobufb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_User_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_User_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_User_descriptor,
        new String[] { "Username", "Password", });
    internal_static_Child_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_Child_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_Child_descriptor,
        new String[] { "Name", "Age", });
    internal_static_ParticipantDetailsDTO_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_ParticipantDetailsDTO_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_ParticipantDetailsDTO_descriptor,
        new String[] { "Name", "Age", "Event1", "Event2", });
    internal_static_ChildNoEventsDTO_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_ChildNoEventsDTO_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_ChildNoEventsDTO_descriptor,
        new String[] { "Child", "NoEvents", });
    internal_static_EventAgeGroupDTO_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_EventAgeGroupDTO_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_EventAgeGroupDTO_descriptor,
        new String[] { "Event", "AgeGroup", });
    internal_static_EventCountDTO_descriptor =
      getDescriptor().getMessageTypes().get(5);
    internal_static_EventCountDTO_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_EventCountDTO_descriptor,
        new String[] { "Event", "AgeGroup", "Count", });
    internal_static_Request_descriptor =
      getDescriptor().getMessageTypes().get(6);
    internal_static_Request_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_Request_descriptor,
        new String[] { "Type", "User", "Eag", "Pd", });
    internal_static_Response_descriptor =
      getDescriptor().getMessageTypes().get(7);
    internal_static_Response_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_Response_descriptor,
        new String[] { "Type", "Error", "Ec", "Cne", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
