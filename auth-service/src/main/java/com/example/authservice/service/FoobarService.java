package com.example.authservice.service;

import net.devh.boot.grpc.client.inject.GrpcClient;
import org.example.grpc.HelloRequest;
import org.example.grpc.MyServiceGrpc;
import org.springframework.stereotype.Service;

/**
 * @author dinry
 * @date 2022/12/2 16:26
 */
@Service
public class FoobarService {
    @GrpcClient("userService")
    private MyServiceGrpc.MyServiceBlockingStub myServiceBlockingStub;

    public String receiveGreeting(String name) {
        HelloRequest request = HelloRequest.newBuilder()
                .setName(name)
                .build();
        return myServiceBlockingStub.sayHello(request).getMessage();
    }


}
