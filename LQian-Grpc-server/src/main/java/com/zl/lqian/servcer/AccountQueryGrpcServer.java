package com.zl.lqian.servcer;


import com.lqian.zl.proto.grpc.qryaccount.QryAccountProto;
import com.lqian.zl.proto.grpc.qryaccount.QryAccountServiceGrpc;
import io.grpc.Server;
import io.grpc.ServerBuilder;
import io.grpc.stub.StreamObserver;

import java.io.IOException;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * @Author zl
 */
public class AccountQueryGrpcServer {


    private  int port = 50015;

    private Server server;

    private final AtomicInteger atomicInteger = new AtomicInteger(0);

    public void start() throws IOException {

        server = ServerBuilder.forPort(port).
                addService(new QueryAccountImp()).build().start();
        //hook 函数
        Runtime.getRuntime().addShutdownHook(new Thread(()->{
            System.err.println("******shutting down gRPC server since JVM is shutting down!");
            AccountQueryGrpcServer.this.stop();
            System.err.println("** server shut down!");
        }));
    }

    private void stop() {
        if (!Objects.isNull(server)) {
            server.shutdown();
        }
    }


    public void blockUntilShutdown() throws InterruptedException {
        if (!Objects.isNull(server)) {
            server.awaitTermination();
        }
    }

    private class QueryAccountImp extends QryAccountServiceGrpc.QryAccountServiceImplBase{


        @Override
        public void qryAccount(QryAccountProto.AccountQryRequest request, StreamObserver<QryAccountProto.AccountQryResponse> responseObserver) {

            QryAccountProto.AccountQryResponse reply =
                    QryAccountProto.AccountQryResponse.newBuilder().setRc(0).setRequestId(
                            request.getRequestId()).setAmount(atomicInteger.incrementAndGet()).setMsg(
                            "Success").build();
            System.out.println("server receive : " + request.getRequestId());
            System.out.println("response client : " + reply.getAmount());

            //返回响应
            responseObserver.onNext(reply);
            responseObserver.onCompleted();

        }
    }
}
