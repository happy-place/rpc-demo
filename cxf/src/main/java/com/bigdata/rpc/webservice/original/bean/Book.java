package com.bigdata.rpc.webservice.original.bean;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="book")
public class Book implements Serializable {

    private int id;
    private String title;
    private double price;

    public Book() {
    }

    public Book(int id, String title, double price) {
        this.id = id;
        this.title = title;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", price=" + price +
                '}';
    }
}
