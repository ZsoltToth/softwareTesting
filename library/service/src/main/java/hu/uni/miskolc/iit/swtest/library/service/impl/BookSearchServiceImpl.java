package hu.uni.miskolc.iit.swtest.library.service.impl;

import hu.uni.miskolc.iit.swtest.library.model.Author;
import hu.uni.miskolc.iit.swtest.library.model.Book;
import hu.uni.miskolc.iit.swtest.library.model.BookInstance;
import hu.uni.miskolc.iit.swtest.library.model.Genre;
import hu.uni.miskolc.iit.swtest.library.service.BookSearchService;
import hu.uni.miskolc.iit.swtest.library.service.exception.BookNotExistsException;

import java.util.Collection;

/**
 * Hello world!
 *
 */
public class BookSearchServiceImpl implements BookSearchService
{


    public Collection<Book> listBooks() {
        return null;
    }

    public Collection<Book> listBooksByGenre(Genre genre) {
        return null;
    }

    public Collection<Book> listBooksByAuthor(Author author) {
        return null;
    }

    public Book searchBookByTitle(String title) throws BookNotExistsException {
        return null;
    }

    public Book searchBookByISBN(String isbn) throws BookNotExistsException {
        return null;
    }

    public Collection<BookInstance> listInstancesOfBook(Book book) {
        return null;
    }

    public Collection<BookInstance> listAvailabelBookInstances() {
        return null;
    }

    public Collection<BookInstance> listAvailabelBookInstances(Book book) {
        return null;
    }
}
