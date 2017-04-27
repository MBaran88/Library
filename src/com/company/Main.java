package com.company;

import java.awt.print.Book;
import java.util.ArrayList;
import java.util.List;


public class Main {

    public static void main(String[] args) {
        Book book1 = new Book(title:"Pan Tadeusz");
        Book book2 = new Book(title:"Matrix");
        Book book3 = new Book(title:"Ogniem i Mieczem");

        List<Book> booksForLibrary = new ArrayList<>();
        booksForLibrary.add(book1);
        booksForLibrary.add(book2);
        booksForLibrary.add(book3);

        Library library = new Library();

        //Library.addBook(book1);
        //Library.addBook(book2);
        //Library.addBook(book3);
        System.out.println(library.allBooks.size());
    }
}