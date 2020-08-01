package com.bigdata.rpc.thrift.server.greeting.impl;

import com.bigdata.rpc.thrift.api.greeting.GreetingService;
import org.apache.thrift.TException;

public class GreetingServiceImpl implements GreetingService.Iface{
    @Override
    public String sayHi(String name) throws TException {
        return String.format("Hi %s",name);
    }
}
