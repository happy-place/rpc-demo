package com.bigdata.rpc.webservice.original;

import com.bigdata.rpc.webservice.original.service.BookServiceImpl;
import com.bigdata.rpc.webservice.original.service.BookService;

import javax.xml.ws.Endpoint;

public class BookRpcServer {
    public static void main(String[] args) {
        String address = "http://127.0.0.1:8080/book/ws?wsdl";
        BookService bookService = new BookServiceImpl();
        Endpoint.publish(address,bookService);
        System.out.println(String.format("%s 发版成功",address));
    }
}
