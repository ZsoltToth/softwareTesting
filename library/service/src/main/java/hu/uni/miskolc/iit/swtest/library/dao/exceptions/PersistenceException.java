package hu.uni.miskolc.iit.swtest.library.dao.exceptions;

/**
 * Created by tothzs on 2017.10.24..
 *
 * Super class for each exception related to storage.
 */
public class PersistenceException extends Exception {
    public PersistenceException() {
    }

    public PersistenceException(String message) {
        super(message);
    }

    public PersistenceException(String message, Throwable cause) {
        super(message, cause);
    }

    public PersistenceException(Throwable cause) {
        super(cause);
    }

    public PersistenceException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
