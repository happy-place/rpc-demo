package com.bigdata.rpc.webservice.wsimport.client;

import com.bigdata.rpc.webservice.wsimport.refer.Book;
import com.bigdata.rpc.webservice.wsimport.refer.BookServiceImpl;
import com.bigdata.rpc.webservice.wsimport.refer.BookServiceImplService;
import com.bigdata.webservice.wsimport.refer.*;

public class BookClient {

    public static void main(String[] args) {
        BookServiceImplService bookServiceImplService = new BookServiceImplService();
        BookServiceImpl bookServiceImplPort = bookServiceImplService.getBookServiceImplPort();
        Book book = bookServiceImplPort.getById(1);
        System.out.println(book);
    }

}
