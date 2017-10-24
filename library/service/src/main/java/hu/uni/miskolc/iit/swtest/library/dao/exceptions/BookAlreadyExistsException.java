package hu.uni.miskolc.iit.swtest.library.dao.exceptions;

/**
 * Created by tothzs on 2017.10.24..
 */
public class BookAlreadyExistsException extends PersistenceException {
    public BookAlreadyExistsException() {
    }

    public BookAlreadyExistsException(String message) {
        super(message);
    }

    public BookAlreadyExistsException(String message, Throwable cause) {
        super(message, cause);
    }

    public BookAlreadyExistsException(Throwable cause) {
        super(cause);
    }

    public BookAlreadyExistsException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
