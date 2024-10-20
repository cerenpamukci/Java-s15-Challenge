package com.library.ceren;

public class Librarian extends Person {
    public Librarian(String name) {
        super(name);
    }


    //Method Overloading addBook(Book book)

    public void addBook(Book book) {
        // Book adding logic
        System.out.println("Book: " + book.getTitle() + " added by librarian: " + name);
    }

    public void removeBook(Book book) {
        // Book removing logic
        System.out.println("Book: " + book.getTitle() + " removed by librarian: " + name);
    }

    @Override
    public void displayRole() {
        System.out.println(name + " is a Librarian.");
    }
}
