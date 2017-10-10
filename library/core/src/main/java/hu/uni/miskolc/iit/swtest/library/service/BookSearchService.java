package hu.uni.miskolc.iit.swtest.library.service;

import hu.uni.miskolc.iit.swtest.library.model.Author;
import hu.uni.miskolc.iit.swtest.library.model.Book;
import hu.uni.miskolc.iit.swtest.library.model.BookInstance;
import hu.uni.miskolc.iit.swtest.library.model.Genre;
import hu.uni.miskolc.iit.swtest.library.service.exception.BookNotExistsException;

import java.util.Collection;

/**
 * Created by tothzs on 2017.10.10..
 */
public interface BookSearchService {

    Collection<Book> listBooks();
    Collection<Book> listBooksByGenre(Genre genre);
    Collection<Book> listBooksByAuthor(Author author);

    Book searchBookByTitle(String title) throws BookNotExistsException;
    Book searchBookByISBN(String isbn) throws BookNotExistsException;


    Collection<BookInstance> listInstancesOfBook(Book book);
    Collection<BookInstance> listAvailabelBookInstances();
    Collection<BookInstance> listAvailabelBookInstances(Book book);

}
