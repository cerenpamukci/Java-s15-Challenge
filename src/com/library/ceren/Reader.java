package com.library.ceren;

public class Reader extends Person {
    private int booksBorrowed;
    private static final int MAX_BOOK_LIMIT = 5;

    public Reader(String name) {
        super(name);
        this.booksBorrowed = 0;
    }
// eğer ödünç alınan kitap sayısı 5 ten düşükse yeni kitap alabilecek şekilde ayarla!
    // kitap barrowed olduysa ödünç alındığı belirtilsin

    public int getBooksBorrowed() {
        return booksBorrowed;
    }

    public void borrowBook(Book book) {
        if (booksBorrowed < MAX_BOOK_LIMIT && book.getStatus() == BookStatus.AVAILABLE) {
            booksBorrowed++;
            book.setStatus(BookStatus.BORROWED);
            System.out.println(name + " has borrowed the book: " + book.getTitle());
        } else {
            System.out.println("Cannot borrow more books or book is not available.");
        }
    }

    public void returnBook(Book book) {
        if (booksBorrowed > 0 && book.getStatus() == BookStatus.BORROWED) {
            booksBorrowed--;
            book.setStatus(BookStatus.AVAILABLE);
            System.out.println(name + " has returned the book: " + book.getTitle());
        }
    }

    @Override
    public void displayRole() {
        System.out.println(name + " is a Reader.");
    }
}
