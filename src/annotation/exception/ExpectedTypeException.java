package annotation.exception;

public class ExpectedTypeException extends Exception{

    public ExpectedTypeException() {
        super();
    }

    public ExpectedTypeException(String message) {
        super(message="Expected type and received type are not compatible");
    }

    public ExpectedTypeException(String message, Throwable cause) {
        super(message, cause);
    }

    public ExpectedTypeException(Throwable cause) {
        super(cause);
    }

    protected ExpectedTypeException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
