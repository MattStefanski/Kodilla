/*
 * Created by Matt Stefanski on 8/18/18 11:14 AM
 *
 * Copyright (c) 2018. All rights reserved
 *
 * Last modified 8/18/18 11:14 AM
 */

package com.kodilla.patterns2.adapter.bookclassifier.libraryb;

public class Book {
    private final String author;
    private final String title;
    private final int yearOfPublication;

    public Book(String author, String title, int yearOfPublication) {
        this.author = author;
        this.title = title;
        this.yearOfPublication = yearOfPublication;
    }

    public String getAuthor() {
        return author;
    }

    public String getTitle() {
        return title;
    }

    public int getYearOfPublication() {
        return yearOfPublication;
    }
}