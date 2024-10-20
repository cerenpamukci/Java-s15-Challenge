package com.library.ceren;

import java.util.Date;

public class Receipt {
    private static int counter = 0;  // Fatura numaralarını sıralı şekilde oluşturacak sayaç
    private String receiptId;
    private Reader reader;
    private Book book;
    private double amount;
    private Date issueDate;

    public Receipt(Reader reader, Book book, double amount) {
        this.receiptId = generateReceiptId();
        this.reader = reader;
        this.book = book;
        this.amount = amount;
        this.issueDate = new Date();  // Fatura tarihi
    }

    //  fatura numarası üretimi
    private String generateReceiptId() {
        counter++;
        return "-" + counter;
    }

    public void displayReceipt() {
        System.out.println("Receipt ID: " + receiptId);
        System.out.println("Reader: " + reader.getName());
        System.out.println("Book: " + book.getTitle());
        System.out.println("Amount: $" + amount);
        System.out.println("Date: " + issueDate);
    }
}
