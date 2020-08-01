package com.bigdata.rpc.webservice.original.service;

import com.bigdata.rpc.webservice.original.bean.Book;

import java.util.List;

public interface BookService {

    boolean delete(int id);

    boolean update(Book book);

    boolean save(Book book);

    Book getById(int id);

    List<Book> getAll();

}
