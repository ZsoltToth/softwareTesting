package hu.uni.miskolc.iit.swtest.library.core.dao;

import hu.uni.miskolc.iit.swtest.library.core.dao.exceptions.BookAlreadyExistsException;
import hu.uni.miskolc.iit.swtest.library.core.dao.exceptions.BookNotFoundException;
import hu.uni.miskolc.iit.swtest.library.core.model.Book;
import hu.uni.miskolc.iit.swtest.library.core.model.Author;
import hu.uni.miskolc.iit.swtest.library.core.model.Genre;



import java.util.Collection;

/**
 * Created by tothzs on 2017.10.24..
 *
 * CRUD methods for Book Objects
 *
 * Create
 * Read
 * Update
 * Delete
 */
public interface BookDAO {

    void createBook(Book book) throws BookAlreadyExistsException;

    Collection<Book> readAllBooks();
    Collection<Book> readBooksByGenre(Genre genre);
    Collection<Book> readBooksByAuthor(Author author);

    Book readBookByTitle(String title) throws BookNotFoundException;
    Book readBookByISBN(String isbn) throws BookNotFoundException;

    void updateBook(Book book) throws BookNotFoundException;

    void deleteBook(Book book) throws  BookNotFoundException;
    void deleteBook(String isbn) throws BookNotFoundException;
}
