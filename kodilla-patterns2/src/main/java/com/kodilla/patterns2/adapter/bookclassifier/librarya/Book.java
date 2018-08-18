/*
 * Created by Matt Stefanski on 8/18/18 11:11 AM
 *
 * Copyright (c) 2018. All rights reserved
 *
 * Last modified 8/18/18 11:11 AM
 */

package com.kodilla.patterns2.adapter.bookclassifier.librarya;

public class Book {
    private final String author;
    private final String title;
    private final int publicationYear;
    private final String signature;

    public Book(String author, String title, int publicationYear, String signature) {
        this.author = author;
        this.title = title;
        this.publicationYear = publicationYear;
        this.signature = signature;
    }

    public String getAuthor() {
        return author;
    }

    public String getTitle() {
        return title;
    }

    public int getPublicationYear() {
        return publicationYear;
    }

    public String getSignature() {
        return signature;
    }
}
