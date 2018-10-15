package com.example.kangbaibai.bookprovider.model;

/**
 * Created by kangbaibai on 2018/10/12.
 */

public class Book {
    public int bookId;
    public String bookName;

    @Override
    public String toString() {
        return "Book{" +
                "bookId=" + bookId +
                ", bookName='" + bookName + '\'' +
                '}';
    }
}
