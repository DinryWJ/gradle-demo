package com.example.user.service;

import io.grpc.stub.StreamObserver;
import net.devh.boot.grpc.server.service.GrpcService;
import org.example.grpc.HelloReply;
import org.example.grpc.HelloRequest;
import org.example.grpc.MyServiceGrpc;

/**
 * @author dinry
 * @date 2022/11/29 14:55
 */
@GrpcService
public class MyServiceImpl extends MyServiceGrpc.MyServiceImplBase {
    @Override
    public void sayHello(HelloRequest request, StreamObserver<HelloReply> responseObserver) {
        HelloReply build = HelloReply.newBuilder().setMessage("Hello ===> " + request.getName()).build();
        responseObserver.onNext(build);
        responseObserver.onCompleted();
    }
}
