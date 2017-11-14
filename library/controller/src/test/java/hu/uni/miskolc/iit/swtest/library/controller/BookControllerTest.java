package hu.uni.miskolc.iit.swtest.library.controller;

import hu.uni.miskolc.iit.swtest.library.core.model.Author;
import hu.uni.miskolc.iit.swtest.library.core.model.Book;
import hu.uni.miskolc.iit.swtest.library.core.model.Genre;
import hu.uni.miskolc.iit.swtest.library.core.model.Nationality;
import hu.uni.miskolc.iit.swtest.library.core.service.BookSearchService;
import org.easymock.EasyMock;
import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

/**
 * Created by tothzs on 2017.11.14..
 * Unit Test Mock Everyting
 */
public class BookControllerTest {

    private BookController controller;

    @Before
    public void setUp(){
        BookSearchService searchService = EasyMock.createMock(BookSearchService.class);
        EasyMock.expect(searchService.listBooks()).andReturn(
                Arrays.asList(
                        new Book(
                                "isbn1",
                                "title1",
                                12,
                                Arrays.asList(
                                        new Author(
                                                "John Doe",
                                                Nationality.FR)),
                                Arrays.asList(Genre.POEM)))).anyTimes();
        EasyMock.replay(searchService);
        controller = new BookController(searchService);
    }

    @Test
    public void listAllBooks() throws Exception {
//        System.out.println(controller.listAllBooks());
        assertEquals(1,controller.listAllBooks().size());
        //TODO write proper matcher
    }

}