package com.book.reader;

public class Book {
    String id;
    String name;
    double price;

    public void show() {
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Price: " + price);
    }
}
