package hu.uni.miskolc.iit.swtest.network;

public class MalformattedIPAddressException extends Exception {

    public MalformattedIPAddressException() {
        super();
    }

    public MalformattedIPAddressException(String message) {
        super(message);
    }

    public MalformattedIPAddressException(String message, Throwable cause) {
        super(message, cause);
    }

    public MalformattedIPAddressException(Throwable cause) {
        super(cause);
    }

    protected MalformattedIPAddressException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
