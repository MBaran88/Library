package com.company;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by RENT on 2017-04-27.
 */
public class Library {

    List<Book> allBooks = new ArrayList<>();

    Library(List<Book> acquiredBooks) {
        allBooks.addAll(acquiredBooks);
    }

    public void addBook(Book book) {

        allBooks.add(book);
    }
}

