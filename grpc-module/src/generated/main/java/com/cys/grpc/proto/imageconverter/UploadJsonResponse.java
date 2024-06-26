// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: converterImage.proto

// Protobuf Java Version: 3.25.1
package com.cys.grpc.proto.imageconverter;

/**
 * Protobuf type {@code imageConverter.UploadJsonResponse}
 */
public final class UploadJsonResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:imageConverter.UploadJsonResponse)
    UploadJsonResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use UploadJsonResponse.newBuilder() to construct.
  private UploadJsonResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private UploadJsonResponse() {
    imageJson_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new UploadJsonResponse();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.cys.grpc.proto.imageconverter.ConverterImage.internal_static_imageConverter_UploadJsonResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.cys.grpc.proto.imageconverter.ConverterImage.internal_static_imageConverter_UploadJsonResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.cys.grpc.proto.imageconverter.UploadJsonResponse.class, com.cys.grpc.proto.imageconverter.UploadJsonResponse.Builder.class);
  }

  public static final int IMAGEJSON_FIELD_NUMBER = 2;
  @SuppressWarnings("serial")
  private volatile java.lang.Object imageJson_ = "";
  /**
   * <code>string imageJson = 2;</code>
   * @return The imageJson.
   */
  @java.lang.Override
  public java.lang.String getImageJson() {
    java.lang.Object ref = imageJson_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      imageJson_ = s;
      return s;
    }
  }
  /**
   * <code>string imageJson = 2;</code>
   * @return The bytes for imageJson.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getImageJsonBytes() {
    java.lang.Object ref = imageJson_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      imageJson_ = b;
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(imageJson_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, imageJson_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(imageJson_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, imageJson_);
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
    if (!(obj instanceof com.cys.grpc.proto.imageconverter.UploadJsonResponse)) {
      return super.equals(obj);
    }
    com.cys.grpc.proto.imageconverter.UploadJsonResponse other = (com.cys.grpc.proto.imageconverter.UploadJsonResponse) obj;

    if (!getImageJson()
        .equals(other.getImageJson())) return false;
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
    hash = (37 * hash) + IMAGEJSON_FIELD_NUMBER;
    hash = (53 * hash) + getImageJson().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.cys.grpc.proto.imageconverter.UploadJsonResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.cys.grpc.proto.imageconverter.UploadJsonResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.cys.grpc.proto.imageconverter.UploadJsonResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.cys.grpc.proto.imageconverter.UploadJsonResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.cys.grpc.proto.imageconverter.UploadJsonResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.cys.grpc.proto.imageconverter.UploadJsonResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.cys.grpc.proto.imageconverter.UploadJsonResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.cys.grpc.proto.imageconverter.UploadJsonResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.cys.grpc.proto.imageconverter.UploadJsonResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.cys.grpc.proto.imageconverter.UploadJsonResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.cys.grpc.proto.imageconverter.UploadJsonResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.cys.grpc.proto.imageconverter.UploadJsonResponse parseFrom(
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
  public static Builder newBuilder(com.cys.grpc.proto.imageconverter.UploadJsonResponse prototype) {
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
   * Protobuf type {@code imageConverter.UploadJsonResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:imageConverter.UploadJsonResponse)
      com.cys.grpc.proto.imageconverter.UploadJsonResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.cys.grpc.proto.imageconverter.ConverterImage.internal_static_imageConverter_UploadJsonResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.cys.grpc.proto.imageconverter.ConverterImage.internal_static_imageConverter_UploadJsonResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.cys.grpc.proto.imageconverter.UploadJsonResponse.class, com.cys.grpc.proto.imageconverter.UploadJsonResponse.Builder.class);
    }

    // Construct using com.cys.grpc.proto.imageconverter.UploadJsonResponse.newBuilder()
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
      imageJson_ = "";
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.cys.grpc.proto.imageconverter.ConverterImage.internal_static_imageConverter_UploadJsonResponse_descriptor;
    }

    @java.lang.Override
    public com.cys.grpc.proto.imageconverter.UploadJsonResponse getDefaultInstanceForType() {
      return com.cys.grpc.proto.imageconverter.UploadJsonResponse.getDefaultInstance();
    }

    @java.lang.Override
    public com.cys.grpc.proto.imageconverter.UploadJsonResponse build() {
      com.cys.grpc.proto.imageconverter.UploadJsonResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.cys.grpc.proto.imageconverter.UploadJsonResponse buildPartial() {
      com.cys.grpc.proto.imageconverter.UploadJsonResponse result = new com.cys.grpc.proto.imageconverter.UploadJsonResponse(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.cys.grpc.proto.imageconverter.UploadJsonResponse result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.imageJson_ = imageJson_;
      }
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.cys.grpc.proto.imageconverter.UploadJsonResponse) {
        return mergeFrom((com.cys.grpc.proto.imageconverter.UploadJsonResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.cys.grpc.proto.imageconverter.UploadJsonResponse other) {
      if (other == com.cys.grpc.proto.imageconverter.UploadJsonResponse.getDefaultInstance()) return this;
      if (!other.getImageJson().isEmpty()) {
        imageJson_ = other.imageJson_;
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
            case 18: {
              imageJson_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000001;
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

    private java.lang.Object imageJson_ = "";
    /**
     * <code>string imageJson = 2;</code>
     * @return The imageJson.
     */
    public java.lang.String getImageJson() {
      java.lang.Object ref = imageJson_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        imageJson_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string imageJson = 2;</code>
     * @return The bytes for imageJson.
     */
    public com.google.protobuf.ByteString
        getImageJsonBytes() {
      java.lang.Object ref = imageJson_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        imageJson_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string imageJson = 2;</code>
     * @param value The imageJson to set.
     * @return This builder for chaining.
     */
    public Builder setImageJson(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      imageJson_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>string imageJson = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearImageJson() {
      imageJson_ = getDefaultInstance().getImageJson();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <code>string imageJson = 2;</code>
     * @param value The bytes for imageJson to set.
     * @return This builder for chaining.
     */
    public Builder setImageJsonBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      imageJson_ = value;
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


    // @@protoc_insertion_point(builder_scope:imageConverter.UploadJsonResponse)
  }

  // @@protoc_insertion_point(class_scope:imageConverter.UploadJsonResponse)
  private static final com.cys.grpc.proto.imageconverter.UploadJsonResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.cys.grpc.proto.imageconverter.UploadJsonResponse();
  }

  public static com.cys.grpc.proto.imageconverter.UploadJsonResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<UploadJsonResponse>
      PARSER = new com.google.protobuf.AbstractParser<UploadJsonResponse>() {
    @java.lang.Override
    public UploadJsonResponse parsePartialFrom(
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

  public static com.google.protobuf.Parser<UploadJsonResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<UploadJsonResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.cys.grpc.proto.imageconverter.UploadJsonResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

