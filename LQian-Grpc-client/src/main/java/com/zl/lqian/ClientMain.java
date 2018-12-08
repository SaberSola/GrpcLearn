package com.zl.lqian;



import com.zl.lqian.client.AccountQueryGrpcClient;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ClientMain {


    public static void main(String[] args) {
        final AccountQueryGrpcClient client = new AccountQueryGrpcClient("127.0.0.1",50015);
        final ExecutorService es = Executors.newFixedThreadPool(500);
        for (int i = 0 ; i < 10000 ; i ++) {
            es.execute(() -> {
                client.query();
            });
        }
    }
}
