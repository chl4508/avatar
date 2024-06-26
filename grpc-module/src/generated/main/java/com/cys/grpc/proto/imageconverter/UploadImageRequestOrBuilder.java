// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: converterImage.proto

// Protobuf Java Version: 3.25.1
package com.cys.grpc.proto.imageconverter;

public interface UploadImageRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:imageConverter.UploadImageRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Assume the image is sent as a Base64-encoded string.
   * </pre>
   *
   * <code>string type = 1;</code>
   * @return The type.
   */
  java.lang.String getType();
  /**
   * <pre>
   * Assume the image is sent as a Base64-encoded string.
   * </pre>
   *
   * <code>string type = 1;</code>
   * @return The bytes for type.
   */
  com.google.protobuf.ByteString
      getTypeBytes();

  /**
   * <code>string imageBase64 = 2;</code>
   * @return The imageBase64.
   */
  java.lang.String getImageBase64();
  /**
   * <code>string imageBase64 = 2;</code>
   * @return The bytes for imageBase64.
   */
  com.google.protobuf.ByteString
      getImageBase64Bytes();
}
