package hu.uni.miskolc.iit.swtest.library.core.service.exception;

/**
 * Created by tothzs on 2017.10.10..
 */
public class BookNotExistsException extends Exception {

    public BookNotExistsException() {
    }

    public BookNotExistsException(String message) {
        super(message);
    }

    public BookNotExistsException(String message, Throwable cause) {
        super(message, cause);
    }

    public BookNotExistsException(Throwable cause) {
        super(cause);
    }

    public BookNotExistsException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
