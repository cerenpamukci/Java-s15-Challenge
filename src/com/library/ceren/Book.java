package com.library.ceren;

import java.util.Date;
// encapsulation uygulandı. stateler private tanımlandı ve getter setter yazıldı. :)

//Library sınıfının bir Book objectine sahip olması (composition***)


public class Book {
    private String id;
    private String title;
    private String author;
    private String category;
    private BookStatus status;
    private Date dateOfPurchase;

    public Book(String id, String title, String author, String category, Date dateOfPurchase) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.category = category;
        this.status = BookStatus.AVAILABLE;
        this.dateOfPurchase = dateOfPurchase; //gerekli mi bak?
    }

    // Getter ve setterları ekle
    public String getId() { return id; }
    public void setId(String id) { this.id = id; }

    public String getTitle() { return title; }
    public void setTitle(String title) { this.title = title; }

    public String getAuthor() { return author; }
    public void setAuthor(String author) { this.author = author; }

    public String getCategory() { return category; }
    public void setCategory(String category) { this.category = category; }

    public BookStatus getStatus() { return status; }
    public void setStatus(BookStatus status) { this.status = status; }

    public Date getDateOfPurchase() { return dateOfPurchase; }
    public void setDateOfPurchase(Date dateOfPurchase) { this.dateOfPurchase = dateOfPurchase; }

    public void displayBookInfo() {
        System.out.println("ID: " + id + ", Title: " + title + ", Author: " + author + ", Status: " + status);
    }
}