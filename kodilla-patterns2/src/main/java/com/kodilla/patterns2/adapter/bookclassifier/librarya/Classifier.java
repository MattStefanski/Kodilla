/*
 * Created by Matt Stefanski on 8/18/18 11:13 AM
 *
 * Copyright (c) 2018. All rights reserved
 *
 * Last modified 8/18/18 11:13 AM
 */

package com.kodilla.patterns2.adapter.bookclassifier.librarya;

import java.util.Set;

public interface Classifier {
    int publicationYearMedian(Set<Book> bookSet);
}