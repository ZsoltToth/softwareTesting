package hu.uni.miskolc.iit.swtest.library.core.model;

import org.junit.Assume;
import org.junit.Before;
import org.junit.Test;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;

import static org.junit.Assert.*;

/**
 * Created by tothzs on 2017.10.10..
 */
public class BorrowTest {

    private Borrow borrow;

    @Before
    public void setUp() throws Exception {
        User user = new User("John Doe","john@doe.com");
        Book book = new Book(
                "isbn123",
                "Title00",
                100.00,
                Arrays.asList(
                        new Author("Arnold Author",Nationality.GB)
                ),
                Arrays.asList(Genre.NOVEL));
        BookInstance instance = new BookInstance(1,book);
        DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
        try {
            Date startDate = df.parse("2017-01-01");
            Date expirationDate = df.parse("2017-03-01");
            Date givenBackDate = df.parse("2017-04-01");
            this.borrow = new Borrow(user, instance, startDate, expirationDate, givenBackDate);
        }
        catch (ParseException ex){
            Assume.assumeNoException(ex);
        }
    }

    @Test
    public void getUser() throws Exception {
    }

    @Test
    public void getBook() throws Exception {
    }

    @Test
    public void getStartDate() throws Exception {
    }

    @Test
    public void getExpirationDate() throws Exception {
    }

    @Test
    public void getGivenBack() throws Exception {
    }

    @Test
    public void setGivenBack() throws Exception {
    }

    @Test
    public void isLate() throws Exception {
        boolean expected = true;
        boolean actual = borrow.isLate();
        assertEquals(expected,actual);
    }


}