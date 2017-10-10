package hu.uni.miskolc.iit.swtest.library.service;

import hu.uni.miskolc.iit.swtest.library.model.*;

import java.util.Collection;

/**
 * Created by tothzs on 2017.10.10..
 */
public interface BorrowingService {

    void requestBook(User user, Book book);

    Collection<BookRequest> listRequests();
    Collection<BookRequest> listOpenRequests();
    Collection<BookRequest> listRequestsOfUser(User user);

    void lendBook(BookRequest request, BookInstance instance);

    Collection<Borrow> listBorrows();
    Collection<Borrow> listOpenBorrows();
    Collection<Borrow> listExpiredBorrows();

    Collection<Borrow> listBorrowsOfUser(User user);

    void closeBorrow(Borrow borrow);
}
