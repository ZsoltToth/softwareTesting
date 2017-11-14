package hu.uni.miskolc.iit.swtest.library.dao;


import hu.uni.miskolc.iit.swtest.library.core.dao.BookDAO;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import java.io.File;

/**
 * Unit test for simple App.
 */
public class BookJSONDAOTest{

    private static File bookTemplateDB;

    private BookDAO dao;

    @BeforeClass
    public static void beforeClass(){
        bookTemplateDB = new File("src/test/resources/BookDBTemplate.json");
    }

    @Before
    public void setUp(){
        this.dao = new BookJSONDAO(bookTemplateDB);
    }


    @Test
    public void test(){
        System.out.println(dao.readAllBooks());
    }
}
