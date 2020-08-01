package com.bigdata.rpc.thrift.server.greeting;

import com.bigdata.rpc.thrift.api.greeting.GreetingService;
import com.bigdata.rpc.thrift.server.greeting.impl.GreetingServiceImpl;
import org.apache.thrift.TProcessor;
import org.apache.thrift.protocol.TBinaryProtocol;
import org.apache.thrift.server.TServer;
import org.apache.thrift.server.TSimpleServer;
import org.apache.thrift.transport.TServerSocket;
import org.apache.thrift.transport.TTransportException;

public class GreetingServer {
    public static void main(String args[]){
        try {
            System.out.println("服务端开启....");
            TProcessor tprocessor = new GreetingService.Processor<GreetingService.Iface>(new GreetingServiceImpl());
            TServerSocket serverTransport = new TServerSocket(50005);
            TServer.Args tArgs = new TServer.Args(serverTransport);
            tArgs.processor(tprocessor);
            tArgs.protocolFactory(new TBinaryProtocol.Factory());
            TServer server = new TSimpleServer(tArgs);
            server.serve();
        }catch (TTransportException e) {
            e.printStackTrace();
        }
    }
}
