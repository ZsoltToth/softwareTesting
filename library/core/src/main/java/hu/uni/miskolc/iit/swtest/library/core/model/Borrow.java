package hu.uni.miskolc.iit.swtest.library.core.model;

import java.util.Date;

/**
 * Created by tothzs on 2017.10.10..
 */
public class Borrow {

    private final User user;
    private final BookInstance book;
    private final Date startDate;
    private final Date expirationDate;
    private Date givenBack;

    public Borrow(User user, BookInstance book, Date startDate, Date expirationDate) {
        this.user = user;
        this.book = book;
        this.startDate = startDate;
        this.expirationDate = expirationDate;
    }

    public Borrow(User user, BookInstance book, Date startDate, Date expirationDate, Date givenBack) {
        this.user = user;
        this.book = book;
        this.startDate = startDate;
        this.expirationDate = expirationDate;
        this.givenBack = givenBack;
    }

    public Borrow(BookRequest request, BookInstance book, Date startDate, Date expirationDate) {
        this.user = request.getUser();
        this.book = book;
        this.startDate = startDate;
        this.expirationDate = expirationDate;
    }

    public User getUser() {
        return user;
    }

    public BookInstance getBook() {
        return book;
    }

    public Date getStartDate() {
        return startDate;
    }

    public Date getExpirationDate() {
        return expirationDate;
    }

    public Date getGivenBack() {
        return givenBack;
    }

    public void setGivenBack(Date givenBack) {
        this.givenBack = givenBack;
    }

    public boolean isLate(){
//        Date d = givenBack == null ? new Date() : givenBack;
        Date d = givenBack != null ? givenBack : new Date();
        return expirationDate.before(d);
    }

    public boolean isInProgress(){
        return givenBack == null;
    }
}
