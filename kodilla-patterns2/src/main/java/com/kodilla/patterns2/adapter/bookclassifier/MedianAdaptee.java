/*
 * Created by Matt Stefanski on 8/18/18 11:16 AM
 *
 * Copyright (c) 2018. All rights reserved
 *
 * Last modified 8/18/18 11:16 AM
 */

package com.kodilla.patterns2.adapter.bookclassifier;

import com.kodilla.patterns2.adapter.bookclassifier.libraryb.Book;
import com.kodilla.patterns2.adapter.bookclassifier.libraryb.BookSignature;
import com.kodilla.patterns2.adapter.bookclassifier.libraryb.BookStatistics;
import com.kodilla.patterns2.adapter.bookclassifier.libraryb.Statistics;


import java.util.Map;

public class MedianAdaptee implements BookStatistics {


    @Override
    public int averagePublicationYear(Map<BookSignature, Book> books) {
        Statistics statistics=new Statistics();
        return statistics.averagePublicationYear(books);
    }

    @Override
    public int medianPublicationYear(Map<BookSignature, Book> books) {
        Statistics statistics=new Statistics();
        return statistics.medianPublicationYear(books);
    }


}
