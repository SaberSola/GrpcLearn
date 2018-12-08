package com.lqian.zl.proto.grpc.qryaccount;

import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.asyncServerStreamingCall;
import static io.grpc.stub.ClientCalls.asyncClientStreamingCall;
import static io.grpc.stub.ClientCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.blockingServerStreamingCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncServerStreamingCall;
import static io.grpc.stub.ServerCalls.asyncClientStreamingCall;
import static io.grpc.stub.ServerCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall;

/**
 * <pre>
 **
 * 账户操查询服务
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.0.0)",
    comments = "Source: AccountQry.proto")
public class QryAccountServiceGrpc {

  private QryAccountServiceGrpc() {}

  public static final String SERVICE_NAME = "accountService.QryAccountService";

  // Static method descriptors that strictly reflect the proto.
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.lqian.zl.proto.grpc.qryaccount.QryAccountProto.AccountQryRequest,
      com.lqian.zl.proto.grpc.qryaccount.QryAccountProto.AccountQryResponse> METHOD_QRY_ACCOUNT =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "accountService.QryAccountService", "QryAccount"),
          io.grpc.protobuf.ProtoUtils.marshaller(com.lqian.zl.proto.grpc.qryaccount.QryAccountProto.AccountQryRequest.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(com.lqian.zl.proto.grpc.qryaccount.QryAccountProto.AccountQryResponse.getDefaultInstance()));

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static QryAccountServiceStub newStub(io.grpc.Channel channel) {
    return new QryAccountServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static QryAccountServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new QryAccountServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary and streaming output calls on the service
   */
  public static QryAccountServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new QryAccountServiceFutureStub(channel);
  }

  /**
   * <pre>
   **
   * 账户操查询服务
   * </pre>
   */
  public static abstract class QryAccountServiceImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     *账户查询方法
     * </pre>
     */
    public void qryAccount(com.lqian.zl.proto.grpc.qryaccount.QryAccountProto.AccountQryRequest request,
        io.grpc.stub.StreamObserver<com.lqian.zl.proto.grpc.qryaccount.QryAccountProto.AccountQryResponse> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_QRY_ACCOUNT, responseObserver);
    }

    @java.lang.Override public io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            METHOD_QRY_ACCOUNT,
            asyncUnaryCall(
              new MethodHandlers<
                com.lqian.zl.proto.grpc.qryaccount.QryAccountProto.AccountQryRequest,
                com.lqian.zl.proto.grpc.qryaccount.QryAccountProto.AccountQryResponse>(
                  this, METHODID_QRY_ACCOUNT)))
          .build();
    }
  }

  /**
   * <pre>
   **
   * 账户操查询服务
   * </pre>
   */
  public static final class QryAccountServiceStub extends io.grpc.stub.AbstractStub<QryAccountServiceStub> {
    private QryAccountServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private QryAccountServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected QryAccountServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new QryAccountServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     *账户查询方法
     * </pre>
     */
    public void qryAccount(com.lqian.zl.proto.grpc.qryaccount.QryAccountProto.AccountQryRequest request,
        io.grpc.stub.StreamObserver<com.lqian.zl.proto.grpc.qryaccount.QryAccountProto.AccountQryResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_QRY_ACCOUNT, getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   **
   * 账户操查询服务
   * </pre>
   */
  public static final class QryAccountServiceBlockingStub extends io.grpc.stub.AbstractStub<QryAccountServiceBlockingStub> {
    private QryAccountServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private QryAccountServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected QryAccountServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new QryAccountServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     *账户查询方法
     * </pre>
     */
    public com.lqian.zl.proto.grpc.qryaccount.QryAccountProto.AccountQryResponse qryAccount(com.lqian.zl.proto.grpc.qryaccount.QryAccountProto.AccountQryRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_QRY_ACCOUNT, getCallOptions(), request);
    }
  }

  /**
   * <pre>
   **
   * 账户操查询服务
   * </pre>
   */
  public static final class QryAccountServiceFutureStub extends io.grpc.stub.AbstractStub<QryAccountServiceFutureStub> {
    private QryAccountServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private QryAccountServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected QryAccountServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new QryAccountServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     *账户查询方法
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.lqian.zl.proto.grpc.qryaccount.QryAccountProto.AccountQryResponse> qryAccount(
        com.lqian.zl.proto.grpc.qryaccount.QryAccountProto.AccountQryRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_QRY_ACCOUNT, getCallOptions()), request);
    }
  }

  private static final int METHODID_QRY_ACCOUNT = 0;

  private static class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final QryAccountServiceImplBase serviceImpl;
    private final int methodId;

    public MethodHandlers(QryAccountServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_QRY_ACCOUNT:
          serviceImpl.qryAccount((com.lqian.zl.proto.grpc.qryaccount.QryAccountProto.AccountQryRequest) request,
              (io.grpc.stub.StreamObserver<com.lqian.zl.proto.grpc.qryaccount.QryAccountProto.AccountQryResponse>) responseObserver);
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

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    return new io.grpc.ServiceDescriptor(SERVICE_NAME,
        METHOD_QRY_ACCOUNT);
  }

}
