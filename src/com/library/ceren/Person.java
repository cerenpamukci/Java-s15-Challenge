package com.library.ceren;
//Person abstract class olarak yapıldı. ****Abstraction
// Reader ve Librarian sınıfları extends edilerek ***inheritance oop kullanıldı


//Person sınıfında tanımlanan displayRole() metodu reader ve librarianda method overriding yapıldı
//yani ****polymorphism

// crud uygula
// Create: addBook kitap ekleme
//Read: listbooksbycategory  searchbookbyId kitapları sorgulama
//Update: Kitabı set metodları ile güncelleme
//Delete: removebook ile silme

public abstract class Person {
    protected String name;

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public abstract void displayRole();
}

