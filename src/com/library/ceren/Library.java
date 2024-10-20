package com.library.ceren;

import java.util.*;

public class Library {
    private Map<String, Book> books = new HashMap<>();
    private Set<Person> members = new HashSet<>();
    private List<BorrowingRecord> borrowingRecords = new ArrayList<>();
    private List<Receipt> receipts = new ArrayList<>();  // Faturalar



    // Fatura kesme
    public void issueReceipt(Reader reader, Book book) {
        double amount = 5.0;  //  kitap ücreti
        Receipt receipt = new Receipt(reader, book, amount);
        receipts.add(receipt);
        receipt.displayReceipt();
    }



    public List<Book> listBooksByCategory(String category) {
        List<Book> booksInCategory = new ArrayList<>();
        for (Book book : books.values()) {
            if (book.getCategory().equalsIgnoreCase(category)) {
                booksInCategory.add(book);
            }
        }
        return booksInCategory;
    }
    public List<Book> listBooksByAuthor(String author) {
        List<Book> booksByAuthor = new ArrayList<>();
        for (Book book : books.values()) {
            if (book.getAuthor().equalsIgnoreCase(author)) {
                booksByAuthor.add(book);
            }
        }
        return booksByAuthor;
    }

}

