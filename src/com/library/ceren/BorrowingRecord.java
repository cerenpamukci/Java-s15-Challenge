package com.library.ceren;

import java.util.Date;
//kitapların kimde olduğu ve ne zaman ödünç alındığı

public class BorrowingRecord {
    private Book book;
    private Reader reader;
    private Date borrowDate;
    private Date returnDate;

    public BorrowingRecord(Book book, Reader reader, Date borrowDate) {
        this.book = book;
        this.reader = reader;
        this.borrowDate = borrowDate;  //kitap ödünç alma
        this.returnDate = null;  // Kitap iade edilmesi
    }

    public Book getBook() { return book; }
    public Reader getReader() { return reader; }
    public Date getBorrowDate() { return borrowDate; }
    public Date getReturnDate() { return returnDate; }

    public void setReturnDate(Date returnDate) {
        this.returnDate = returnDate;
    }

    public boolean isReturned() {
        return this.returnDate != null;
    }

    public void displayRecord() {
        System.out.println("Book: " + book.getTitle() + " | Borrowed by: " + reader.getName() + " | Borrow Date: " + borrowDate);
        if (returnDate != null) {
            System.out.println("Returned on: " + returnDate);
        }
    }
}
