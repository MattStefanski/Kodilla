package com.kodilla.testing.library;

import org.junit.*;
import static org.junit.Assert.*;
import java.util.List;
import java.util.ArrayList;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class BookDirectoryTestSuite {
    private List<Book> generateListOfNBooks(int booksQuantity) {
        List<Book> resultList = new ArrayList<Book>();
        for(int n = 1; n <= booksQuantity; n++){
            Book theBook = new Book("Title " + n, "Author " + n, 1970 + n);
            resultList.add(theBook);
        }
        return resultList;
    }

    @Test
    public void listBooksInHandsOf0 (){
        //Given
        LibraryDatabase libDatabase=mock(LibraryDatabase.class);
        BookLibrary bookLibrary = new BookLibrary(libDatabase);
        List<Book> resultListOf0Books = generateListOfNBooks(0);
        when(bookLibrary.libraryDatabase.listBooksInHandsOf(new LibraryUser("UserName0","UserSurname0","UserPesel0"))).thenReturn(resultListOf0Books);
        //When
        List<Book> booksInHandsOf0= bookLibrary.libraryDatabase.listBooksInHandsOf(new LibraryUser("UserName0","UserSurname0","UserPesel0"));
        //Then
        assertEquals(0, booksInHandsOf0.size());

    }

    @Test
    public void listBooksInHandsOf1 (){
        //Given
        LibraryDatabase libDatabase=mock(LibraryDatabase.class);
        BookLibrary bookLibrary = new BookLibrary(libDatabase);
        List<Book> resultListOf1Books= generateListOfNBooks(1);
        when(bookLibrary.libraryDatabase.listBooksInHandsOf(new LibraryUser("UserName1","UserSurname1","UserPesel1"))).thenReturn(resultListOf1Books);
        //When
        List<Book> booksInHandsOf1= bookLibrary.libraryDatabase.listBooksInHandsOf(new LibraryUser("UserName1","UserSurname1","UserPesel1"));
        //Then
        assertEquals(1, booksInHandsOf1.size());

    }


    @Test
    public void listBooksInHandsOf5 (){
        //Given
        LibraryDatabase libDatabase=mock(LibraryDatabase.class);
        BookLibrary bookLibrary = new BookLibrary(libDatabase);
        List<Book> resultListOf5Books = generateListOfNBooks(5);
        when(bookLibrary.libraryDatabase.listBooksInHandsOf(new LibraryUser("UserName5","UserSurname5","UserPesel5"))).thenReturn(resultListOf5Books);
        //When
        List<Book> booksInHandsOf5 = bookLibrary.libraryDatabase.listBooksInHandsOf(new LibraryUser("UserName5","UserSurname5","UserPesel5"));
        //Then
        assertEquals(5, booksInHandsOf5.size());
    }
}
