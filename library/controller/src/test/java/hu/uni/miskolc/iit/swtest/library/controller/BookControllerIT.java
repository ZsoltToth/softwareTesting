package hu.uni.miskolc.iit.swtest.library.controller;

import hu.uni.miskolc.iit.swtest.library.core.dao.BookDAO;
import hu.uni.miskolc.iit.swtest.library.core.service.BookSearchService;
import hu.uni.miskolc.iit.swtest.library.core.service.impl.BookSearchServiceImpl;
import hu.uni.miskolc.iit.swtest.library.dao.BookJSONDAO;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
import java.io.File;

/**
 * Created by tothzs on 2017.11.14..
 */
public class BookControllerIT {

    private BookController controller;

    @Before
    public void setUp(){
        BookDAO dao = new BookJSONDAO(new File("src/test/resources/BookDBTemplate.json"));
        BookSearchService searchService =  new BookSearchServiceImpl(dao);
        controller = new BookController(searchService);
    }

    @Test
    public void test(){
//        System.out.println(controller.listAllBooks());
        assertEquals(3,controller.listAllBooks().size());
        //TODO writer proper checking
    }
}
