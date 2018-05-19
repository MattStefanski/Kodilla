/*
 * Created by Matt Stefanski on 5/19/18 11:34 AM
 *
 * Copyright (c) 2018. All rights reserved
 *
 * Last modified 5/19/18 11:34 AM
 */

package com.kodilla.patterns.prototype.library;

import org.junit.Assert;
import org.junit.Test;

import java.time.LocalDate;

public class LibraryTestSuite {

    @Test
    public void testGetBooks() {

        //Given
        Library library1 = new Library("Library");

        //When
        Book book1 = new Book("Harry Potter and Deadly Hallows", "J.K. Rowlling", LocalDate.of(2002, 10, 3));
        Book book2 = new Book("Lord of Rings", "Tolkien", LocalDate.of(1983, 8, 1));
        Book book3 = new Book("Last Watch", "Stephan King", LocalDate.of(2016, 3, 30));

        library1.getBooks().add(book1);
        library1.getBooks().add(book2);


        Library library2 = null;
        Library library3 = null;
        try {
            library2 = library1.shallowCopy();
        } catch (CloneNotSupportedException e) {
            System.out.println(e);
        }
        try {
            library3 = library1.deepCopy();
        } catch (CloneNotSupportedException e) {
            System.out.println(e);
        }

        library3.getBooks().add(book3);
        library1.getBooks().remove(book1);


        //Then

        Assert.assertEquals(1, library1.getBooks().size());
        Assert.assertEquals(1, library2.getBooks().size());
        Assert.assertEquals(3, library3.getBooks().size());


    }

}
