package com.bigdata.rpc.webservice.original.service;

import com.bigdata.rpc.webservice.original.bean.Book;

import javax.jws.WebMethod;
import javax.jws.WebService;
import java.util.ArrayList;
import java.util.List;

@WebService
public class BookServiceImpl implements BookService{

    @WebMethod(exclude = true)
    @Override
    public boolean delete(int id) {
        return false;
    }

    @WebMethod(exclude = true)
    @Override
    public boolean update(Book book) {
        return false;
    }

    @WebMethod(exclude = true)
    @Override
    public boolean save(Book book) {
        return false;
    }

    @WebMethod
    @Override
    public Book getById(int id) {
        Book book = new Book(id, "hello world", 20.0);
        return book;
    }

    @WebMethod
    @Override
    public List<Book> getAll() {
        Book book1 = new Book(1, "hello world", 20.0);
        Book book2 = new Book(2, "hello java", 20.0);
        ArrayList<Book> books = new ArrayList<>();
        books.add(book1);
        books.add(book2);
        return books;
    }
}
