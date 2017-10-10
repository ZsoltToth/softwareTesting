package hu.uni.miskolc.iit.swtest.library.model;

import java.util.Date;

/**
 * Created by tothzs on 2017.10.10..
 */
public class BookRequest {

    private User user;
    private Book book;
    private Date date;
    private boolean isOpen;

    public BookRequest(User user, Book book, Date date) {
        this.user = user;
        this.book = book;
        this.date = date;
        this.isOpen = true;
    }

    public User getUser() {
        return user;
    }

    public Book getBook() {
        return book;
    }

    public Date getDate() {
        return date;
    }

    public boolean isOpen() {
        return isOpen;
    }

    public void closeRequest(){
        this.isOpen = false;
    }

}
