package com.cys.grpc.proto.imageconverter;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * The greeting service definition.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.60.1)",
    comments = "Source: converterImage.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class imageConverterGrpc {

  private imageConverterGrpc() {}

  public static final java.lang.String SERVICE_NAME = "imageConverter.imageConverter";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.cys.grpc.proto.imageconverter.UploadImageRequest,
      com.cys.grpc.proto.imageconverter.UploadImageResponse> getUploadImageMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UploadImage",
      requestType = com.cys.grpc.proto.imageconverter.UploadImageRequest.class,
      responseType = com.cys.grpc.proto.imageconverter.UploadImageResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.cys.grpc.proto.imageconverter.UploadImageRequest,
      com.cys.grpc.proto.imageconverter.UploadImageResponse> getUploadImageMethod() {
    io.grpc.MethodDescriptor<com.cys.grpc.proto.imageconverter.UploadImageRequest, com.cys.grpc.proto.imageconverter.UploadImageResponse> getUploadImageMethod;
    if ((getUploadImageMethod = imageConverterGrpc.getUploadImageMethod) == null) {
      synchronized (imageConverterGrpc.class) {
        if ((getUploadImageMethod = imageConverterGrpc.getUploadImageMethod) == null) {
          imageConverterGrpc.getUploadImageMethod = getUploadImageMethod =
              io.grpc.MethodDescriptor.<com.cys.grpc.proto.imageconverter.UploadImageRequest, com.cys.grpc.proto.imageconverter.UploadImageResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UploadImage"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.cys.grpc.proto.imageconverter.UploadImageRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.cys.grpc.proto.imageconverter.UploadImageResponse.getDefaultInstance()))
              .setSchemaDescriptor(new imageConverterMethodDescriptorSupplier("UploadImage"))
              .build();
        }
      }
    }
    return getUploadImageMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.cys.grpc.proto.imageconverter.UploadJsonRequest,
      com.cys.grpc.proto.imageconverter.UploadJsonResponse> getUploadJsonMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UploadJson",
      requestType = com.cys.grpc.proto.imageconverter.UploadJsonRequest.class,
      responseType = com.cys.grpc.proto.imageconverter.UploadJsonResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.cys.grpc.proto.imageconverter.UploadJsonRequest,
      com.cys.grpc.proto.imageconverter.UploadJsonResponse> getUploadJsonMethod() {
    io.grpc.MethodDescriptor<com.cys.grpc.proto.imageconverter.UploadJsonRequest, com.cys.grpc.proto.imageconverter.UploadJsonResponse> getUploadJsonMethod;
    if ((getUploadJsonMethod = imageConverterGrpc.getUploadJsonMethod) == null) {
      synchronized (imageConverterGrpc.class) {
        if ((getUploadJsonMethod = imageConverterGrpc.getUploadJsonMethod) == null) {
          imageConverterGrpc.getUploadJsonMethod = getUploadJsonMethod =
              io.grpc.MethodDescriptor.<com.cys.grpc.proto.imageconverter.UploadJsonRequest, com.cys.grpc.proto.imageconverter.UploadJsonResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UploadJson"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.cys.grpc.proto.imageconverter.UploadJsonRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.cys.grpc.proto.imageconverter.UploadJsonResponse.getDefaultInstance()))
              .setSchemaDescriptor(new imageConverterMethodDescriptorSupplier("UploadJson"))
              .build();
        }
      }
    }
    return getUploadJsonMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static imageConverterStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<imageConverterStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<imageConverterStub>() {
        @java.lang.Override
        public imageConverterStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new imageConverterStub(channel, callOptions);
        }
      };
    return imageConverterStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static imageConverterBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<imageConverterBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<imageConverterBlockingStub>() {
        @java.lang.Override
        public imageConverterBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new imageConverterBlockingStub(channel, callOptions);
        }
      };
    return imageConverterBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static imageConverterFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<imageConverterFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<imageConverterFutureStub>() {
        @java.lang.Override
        public imageConverterFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new imageConverterFutureStub(channel, callOptions);
        }
      };
    return imageConverterFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * The greeting service definition.
   * </pre>
   */
  public interface AsyncService {

    /**
     */
    default void uploadImage(com.cys.grpc.proto.imageconverter.UploadImageRequest request,
        io.grpc.stub.StreamObserver<com.cys.grpc.proto.imageconverter.UploadImageResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUploadImageMethod(), responseObserver);
    }

    /**
     */
    default void uploadJson(com.cys.grpc.proto.imageconverter.UploadJsonRequest request,
        io.grpc.stub.StreamObserver<com.cys.grpc.proto.imageconverter.UploadJsonResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUploadJsonMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service imageConverter.
   * <pre>
   * The greeting service definition.
   * </pre>
   */
  public static abstract class imageConverterImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return imageConverterGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service imageConverter.
   * <pre>
   * The greeting service definition.
   * </pre>
   */
  public static final class imageConverterStub
      extends io.grpc.stub.AbstractAsyncStub<imageConverterStub> {
    private imageConverterStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected imageConverterStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new imageConverterStub(channel, callOptions);
    }

    /**
     */
    public void uploadImage(com.cys.grpc.proto.imageconverter.UploadImageRequest request,
        io.grpc.stub.StreamObserver<com.cys.grpc.proto.imageconverter.UploadImageResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUploadImageMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void uploadJson(com.cys.grpc.proto.imageconverter.UploadJsonRequest request,
        io.grpc.stub.StreamObserver<com.cys.grpc.proto.imageconverter.UploadJsonResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUploadJsonMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service imageConverter.
   * <pre>
   * The greeting service definition.
   * </pre>
   */
  public static final class imageConverterBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<imageConverterBlockingStub> {
    private imageConverterBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected imageConverterBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new imageConverterBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.cys.grpc.proto.imageconverter.UploadImageResponse uploadImage(com.cys.grpc.proto.imageconverter.UploadImageRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUploadImageMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.cys.grpc.proto.imageconverter.UploadJsonResponse uploadJson(com.cys.grpc.proto.imageconverter.UploadJsonRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUploadJsonMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service imageConverter.
   * <pre>
   * The greeting service definition.
   * </pre>
   */
  public static final class imageConverterFutureStub
      extends io.grpc.stub.AbstractFutureStub<imageConverterFutureStub> {
    private imageConverterFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected imageConverterFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new imageConverterFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.cys.grpc.proto.imageconverter.UploadImageResponse> uploadImage(
        com.cys.grpc.proto.imageconverter.UploadImageRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUploadImageMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.cys.grpc.proto.imageconverter.UploadJsonResponse> uploadJson(
        com.cys.grpc.proto.imageconverter.UploadJsonRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUploadJsonMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_UPLOAD_IMAGE = 0;
  private static final int METHODID_UPLOAD_JSON = 1;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final AsyncService serviceImpl;
    private final int methodId;

    MethodHandlers(AsyncService serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_UPLOAD_IMAGE:
          serviceImpl.uploadImage((com.cys.grpc.proto.imageconverter.UploadImageRequest) request,
              (io.grpc.stub.StreamObserver<com.cys.grpc.proto.imageconverter.UploadImageResponse>) responseObserver);
          break;
        case METHODID_UPLOAD_JSON:
          serviceImpl.uploadJson((com.cys.grpc.proto.imageconverter.UploadJsonRequest) request,
              (io.grpc.stub.StreamObserver<com.cys.grpc.proto.imageconverter.UploadJsonResponse>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }
  }

  public static final io.grpc.ServerServiceDefinition bindService(AsyncService service) {
    return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
        .addMethod(
          getUploadImageMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.cys.grpc.proto.imageconverter.UploadImageRequest,
              com.cys.grpc.proto.imageconverter.UploadImageResponse>(
                service, METHODID_UPLOAD_IMAGE)))
        .addMethod(
          getUploadJsonMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.cys.grpc.proto.imageconverter.UploadJsonRequest,
              com.cys.grpc.proto.imageconverter.UploadJsonResponse>(
                service, METHODID_UPLOAD_JSON)))
        .build();
  }

  private static abstract class imageConverterBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    imageConverterBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.cys.grpc.proto.imageconverter.ConverterImage.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("imageConverter");
    }
  }

  private static final class imageConverterFileDescriptorSupplier
      extends imageConverterBaseDescriptorSupplier {
    imageConverterFileDescriptorSupplier() {}
  }

  private static final class imageConverterMethodDescriptorSupplier
      extends imageConverterBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    imageConverterMethodDescriptorSupplier(java.lang.String methodName) {
      this.methodName = methodName;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (imageConverterGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new imageConverterFileDescriptorSupplier())
              .addMethod(getUploadImageMethod())
              .addMethod(getUploadJsonMethod())
              .build();
        }
      }
    }
    return result;
  }
}
