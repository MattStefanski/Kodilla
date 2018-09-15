/*
 * Created by Matt Stefanski on 8/18/18 11:27 AM
 *
 * Copyright (c) 2018. All rights reserved
 *
 * Last modified 8/18/18 11:27 AM
 */

package com.kodilla.patterns2.adapter.bookclassifier;

import com.kodilla.patterns2.adapter.bookclassifier.librarya.Book;
import org.junit.Assert;
import org.junit.Test;

import java.util.HashSet;
import java.util.Set;

import static org.junit.Assert.*;


public class MedianAdapterTestSuite {


    @Test
    public void publicationYearMedianTest() {
        //Given

        Book book1 = new Book("J.K.Rowling", "Harry Potter i Kamień Filozoficzny", 2000, "signature1");
        Book book2 = new Book("J.K.Rowling", "Harry Potter i Więzień Azkabanu", 2002, "signature2");
        Book book3 = new Book("J.K.Rowling", "Harry Potter i Czara Ognia", 2003, "signature3");
        Book book4 = new Book("J.K.Rowling", "Harry Potter i Zakon Feniska", 2004, "signature4");
        Book book5 = new Book("J.K.Rowling", "Harry Potter i Książe Półkrwi", 2005, "signature5");

        Set<Book> bookSet = new HashSet<>();
        bookSet.add(book1);
        bookSet.add(book2);
        bookSet.add(book3);
        bookSet.add(book4);
        bookSet.add(book5);
        //When

        MedianAdapter medianAdapter = new MedianAdapter();
        int publicationYearMedian = medianAdapter.publicationYearMedian(bookSet);

        //Then
        Assert.assertEquals(2003, publicationYearMedian);
    }
}