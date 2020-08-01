package com.bigdata.rpc.thrift.client.greeting;

import com.bigdata.rpc.thrift.api.greeting.GreetingService;
import org.apache.thrift.TException;
import org.apache.thrift.protocol.TBinaryProtocol;
import org.apache.thrift.protocol.TProtocol;
import org.apache.thrift.transport.TSocket;
import org.apache.thrift.transport.TTransport;
import org.apache.thrift.transport.TTransportException;

public class GreetingClient {

    public static void main(String[] args) {
        System.out.println("客户端启动....");
        TTransport transport = null;
        try {
            transport = new TSocket("localhost", 50005);
            TProtocol protocol = new TBinaryProtocol(transport);
            GreetingService.Client client = new GreetingService.Client(protocol);
            transport.open();
            String result = client.sayHi("liyao");
            System.out.println(result);
        } catch (TTransportException e) {
            e.printStackTrace();
        } catch (TException e) {
            e.printStackTrace();
        } finally {
            if (null != transport) {
                transport.close();
            }
        }
    }
}
