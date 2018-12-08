package com.zl.lqian;

import com.zl.lqian.servcer.AccountQueryGrpcServer;


public class ServerMain {

    public static void main(String[] args){

        final AccountQueryGrpcServer accountQueryGrpcServer = new AccountQueryGrpcServer();
        try {
            accountQueryGrpcServer.start();
            accountQueryGrpcServer.blockUntilShutdown();
            System.out.println("grpc server is running .....");
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
