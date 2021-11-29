package genericValidator.exceptions;

public class NotMatchedTypeException  extends RuntimeException{
    public NotMatchedTypeException() {
    }

    public NotMatchedTypeException(String message) {
        super(message);
    }

    public NotMatchedTypeException(String message, Throwable cause) {
        super(message, cause);
    }
}
