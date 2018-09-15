/*
 * Created by Matt Stefanski on 8/18/18 11:23 AM
 *
 * Copyright (c) 2018. All rights reserved
 *
 * Last modified 8/18/18 11:23 AM
 */

package com.kodilla.patterns2.adapter.bookclassifier;

import com.kodilla.patterns2.adapter.bookclassifier.libraryb.Book;
import com.kodilla.patterns2.adapter.bookclassifier.librarya.Classifier;
import com.kodilla.patterns2.adapter.bookclassifier.libraryb.BookSignature;

import java.awt.*;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class MedianAdapter extends MedianAdaptee implements Classifier {
    @Override
    public int publicationYearMedian(Set<com.kodilla.patterns2.adapter.bookclassifier.librarya.Book> bookSet) {

        HashMap<BookSignature,Book> bookMap=new HashMap<>();
        for (com.kodilla.patterns2.adapter.bookclassifier.librarya.Book book:bookSet){
            bookMap.put(new BookSignature(book.getSignature()),new Book(book.getAuthor(),book.getTitle(),book.getPublicationYear()));
        }

        return medianPublicationYear(bookMap);
    }
}
