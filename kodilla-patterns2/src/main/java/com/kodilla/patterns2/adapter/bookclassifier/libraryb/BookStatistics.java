/*
 * Created by Matt Stefanski on 8/18/18 11:14 AM
 *
 * Copyright (c) 2018. All rights reserved
 *
 * Last modified 8/18/18 11:14 AM
 */

package com.kodilla.patterns2.adapter.bookclassifier.libraryb;

import java.util.Map;

public interface BookStatistics {
    int averagePublicationYear(Map<BookSignature,Book> books);
    int medianPublicationYear(Map<BookSignature, Book> books);
}