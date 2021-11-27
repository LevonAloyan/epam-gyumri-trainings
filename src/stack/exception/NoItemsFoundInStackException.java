package stack.exception;

public class NoItemsFoundInStackException extends Exception {

    public NoItemsFoundInStackException() {
        super();
    }

    public NoItemsFoundInStackException(String message) {
        super(message);
    }

    public NoItemsFoundInStackException(String message, Throwable cause) {
        super(message, cause);
    }

    public NoItemsFoundInStackException(Throwable cause) {
        super(cause);
    }

    protected NoItemsFoundInStackException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
