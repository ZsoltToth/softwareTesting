package hu.uni.miskolc.iit.swtest.library.dao;

import com.fasterxml.jackson.databind.ObjectMapper;
import hu.uni.miskolc.iit.swtest.library.core.dao.BookDAO;
import hu.uni.miskolc.iit.swtest.library.core.dao.exceptions.BookAlreadyExistsException;
import hu.uni.miskolc.iit.swtest.library.core.dao.exceptions.BookNotFoundException;
import hu.uni.miskolc.iit.swtest.library.core.model.Author;
import hu.uni.miskolc.iit.swtest.library.core.model.Book;
import hu.uni.miskolc.iit.swtest.library.core.model.Genre;


import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;

/**
 * Hello world!
 *
 */
public class BookJSONDAO implements BookDAO
{
    private File database;

    public BookJSONDAO(File database) {
        this.database = database;
    }

    private Collection<Book> readDatabase(){
        Collection<Book> result = new ArrayList<Book>();
        ObjectMapper mapper = new ObjectMapper();
        try {
            BookBean[] beans = mapper.readValue(database, BookBean[].class);
            for(BookBean bean : beans){
                result. add(bean.extract());
            }
        } catch (IOException e) {
            System.out.println(database.getAbsolutePath());
            e.printStackTrace();

        }
        return result;
    }

    private void writeDatabase(Collection<Book> books){
        ObjectMapper mapper = new ObjectMapper();
        try {
            mapper.writeValue(database, books);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void createBook(Book book) throws BookAlreadyExistsException {
    }

    public Collection<Book> readAllBooks() {
        return readDatabase();
    }

    public Collection<Book> readBooksByGenre(Genre genre) {
        return null;
    }

    public Collection<Book> readBooksByAuthor(Author author) {
        return null;
    }

    public Book readBookByTitle(String title) throws BookNotFoundException {
        return null;
    }

    public Book readBookByISBN(String isbn) throws BookNotFoundException {
        return null;
    }

    public void updateBook(Book book) throws BookNotFoundException {

    }

    public void deleteBook(Book book) throws BookNotFoundException {

    }

    public void deleteBook(String isbn) throws BookNotFoundException {

    }
}
