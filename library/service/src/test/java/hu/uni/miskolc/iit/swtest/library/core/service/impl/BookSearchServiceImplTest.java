package hu.uni.miskolc.iit.swtest.library.core.service.impl;

import hu.uni.miskolc.iit.swtest.library.core.dao.BookDAO;
import hu.uni.miskolc.iit.swtest.library.core.model.Book;
import hu.uni.miskolc.iit.swtest.library.core.model.Author;
import hu.uni.miskolc.iit.swtest.library.core.model.Genre;
import hu.uni.miskolc.iit.swtest.library.core.model.Nationality;
import hu.uni.miskolc.iit.swtest.library.core.service.BookSearchService;
import org.easymock.EasyMock;
import org.hamcrest.CoreMatchers;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.*;

/**
 * Created by tothzs on 2017.10.24..
 */
public class BookSearchServiceImplTest {

    private BookSearchService searchService;

    private Book harryPotter;
    private Book inferno;
    private Book lotr;

    private Author jkRowling;
    private Author danBrown;
    private Author tolkein;


    @Before
    public void setUp() throws Exception {
        BookDAO dao = null;
        //Initialize expected objects
        jkRowling = new Author("J. K. Rowling", Nationality.GB);
        danBrown = new Author("Dan Brown", Nationality.US);
        tolkein = new Author("Tolkein", Nationality.GB);

        harryPotter = new Book("isbn00","Harry Potter",100.0, Arrays.asList(jkRowling), Arrays.asList(Genre.NOVEL));
        inferno = new Book("isbn01","Inferno",200.0, Arrays.asList(danBrown), Arrays.asList(Genre.SCIFI));
        lotr = new Book("isbn02","Lord of the Rings",300.0, Arrays.asList(tolkein), Arrays.asList(Genre.NOVEL));
        Collection<Book> allBooks = Arrays.asList(harryPotter,inferno,lotr);
        //Initialize and teach Mock Object
        dao = EasyMock.createMock(BookDAO.class);
        EasyMock.expect(dao.readAllBooks()).andReturn(allBooks);
        //Replay Mock
        EasyMock.replay(dao);
        searchService = new BookSearchServiceImpl(dao);
    }

    @After
    public void tearDown() throws Exception {
    }



    @Test
    public void listBooks() throws Exception {
        Collection<Book> expected = Arrays.asList(lotr,inferno,harryPotter);
        Collection<Book> actual = searchService.listBooks();
//        Print result of the Mock
//        System.out.println(actual);

//      Fail due to the ordering of the elements
//        assertEquals(expected,actual);

        assertThat(actual, CoreMatchers.hasItems(expected.toArray(new Book[expected.size()])));

    }

    @Test
    public void listBooksByGenre() throws Exception {
    }

    @Test
    public void listBooksByAuthor() throws Exception {
    }

    @Test
    public void searchBookByTitle() throws Exception {
    }

    @Test
    public void searchBookByISBN() throws Exception {
    }

}