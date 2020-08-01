package com.bigdata.rpc.grpc.server.greeting.impl;

import com.bigdata.rpc.grpc.api.greeting.GreetingGrpc;
import com.bigdata.rpc.grpc.api.greeting.GreetingRequest;
import com.bigdata.rpc.grpc.api.greeting.GreetingResponse;
import io.grpc.stub.StreamObserver;

public class GreetingGrpcImpl extends GreetingGrpc.GreetingImplBase  {

    @Override
    public void sayHello(GreetingRequest req, StreamObserver<GreetingResponse> responseObserver) {
        GreetingResponse reply = GreetingResponse.newBuilder().setMsg("Hello " + req.getName()).build();
        responseObserver.onNext(reply);
        responseObserver.onCompleted();
    }

}
