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

    public Book borrow(String title){


        return null;
    }

    public void addBook(Book book) {

        allBooks.add(book);
    }
    public void deleteBook(Book book)
    {allBooks.remove(book)}

    public void deleteBook(Book book)
    {String bookTitle)
       boolean isBookToDelete = false;
       int idx = 0;
       Book book = null;

       while (isBookToDelete == false){
           Book book = allBooks.get(idx);
        isBookToDelete = book.getTitle().equals(bookTitle);
        idx = idx + 1;
    }
    if (isBookToDelete == true) {
        allBooks.remove(book);
        System.out.println("removed book:" + book.getTitle());
    }
        {
            for (int i = 0; i < allBooks.size(); i++) {
                Book book = allBooks.get(i);
                boolean isBookToDelete = book.getTitle() .equals(bookTitle);
            }
        }
    }

    public Book searchByBookTitle(String title){
        boolean isBookFound = false;
        int idx = 0;
        Book book = null;

        while (isBookFound == false){
            Book book = allBooks.get(idx);
            isBookFound = book.getTitle().equals(title);
            idx = idx + 1;
        return book;
    }
}

