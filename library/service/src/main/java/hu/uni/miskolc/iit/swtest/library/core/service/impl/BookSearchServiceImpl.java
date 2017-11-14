package hu.uni.miskolc.iit.swtest.library.core.service.impl;

import hu.uni.miskolc.iit.swtest.library.core.dao.BookDAO;
import hu.uni.miskolc.iit.swtest.library.core.dao.exceptions.BookNotFoundException;
import hu.uni.miskolc.iit.swtest.library.core.model.Book;
import hu.uni.miskolc.iit.swtest.library.core.service.BookSearchService;
import hu.uni.miskolc.iit.swtest.library.core.model.Author;
import hu.uni.miskolc.iit.swtest.library.core.model.BookInstance;
import hu.uni.miskolc.iit.swtest.library.core.model.Genre;
import hu.uni.miskolc.iit.swtest.library.core.service.exception.BookNotExistsException;

import java.util.Collection;

/**
 * Hello world!
 *
 */
public class BookSearchServiceImpl implements BookSearchService
{

    private BookDAO dao;

    public BookSearchServiceImpl(BookDAO dao) {
        this.dao = dao;
    }

    public Collection<Book> listBooks() {
        return dao.readAllBooks();
    }

    public Collection<Book> listBooksByGenre(Genre genre) {
        return dao.readBooksByGenre(genre);
    }

    public Collection<Book> listBooksByAuthor(Author author) {
        return dao.readBooksByAuthor(author);
    }

    public Book searchBookByTitle(String title) throws BookNotExistsException {
        try {
            return dao.readBookByTitle(title);
        } catch (BookNotFoundException e) {
            throw new BookNotExistsException(title,e);
        }
    }

    public Book searchBookByISBN(String isbn) throws BookNotExistsException {
        try {
            return dao.readBookByISBN(isbn);
        } catch (BookNotFoundException e) {
            throw new BookNotExistsException(isbn,e);
        }
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
