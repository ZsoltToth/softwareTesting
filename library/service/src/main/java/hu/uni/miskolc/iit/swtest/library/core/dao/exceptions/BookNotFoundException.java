package hu.uni.miskolc.iit.swtest.library.core.dao.exceptions;

/**
 * Created by tothzs on 2017.10.24..
 */
public class BookNotFoundException extends PersistenceException {

    public BookNotFoundException() {
    }

    public BookNotFoundException(String message) {
        super(message);
    }

    public BookNotFoundException(String message, Throwable cause) {
        super(message, cause);
    }

    public BookNotFoundException(Throwable cause) {
        super(cause);
    }

    public BookNotFoundException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
