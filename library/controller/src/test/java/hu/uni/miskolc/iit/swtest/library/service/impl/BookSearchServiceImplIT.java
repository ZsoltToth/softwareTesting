package hu.uni.miskolc.iit.swtest.library.service.impl;

import hu.uni.miskolc.iit.swtest.library.core.dao.BookDAO;
import hu.uni.miskolc.iit.swtest.library.core.service.BookSearchService;
import hu.uni.miskolc.iit.swtest.library.core.service.impl.BookSearchServiceImpl;
import hu.uni.miskolc.iit.swtest.library.dao.BookJSONDAO;
import org.junit.Before;
import org.junit.Test;

import java.io.File;

/**
 * Created by tothzs on 2017.11.14..
 */
public class BookSearchServiceImplIT {



    private BookSearchService searchService;

    @Before
    public void setUp(){
        BookDAO dao = new BookJSONDAO(new File(System.getProperty("book_db_path")));
        searchService = new BookSearchServiceImpl(dao);
    }

    @Test
    public void test(){
        System.out.println(searchService.listBooks());
    }
}
