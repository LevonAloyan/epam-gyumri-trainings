package stack.exceptions;

public class EmptyStackException extends Exception{

    public EmptyStackException(String message) {
        super(message);
    }

    public EmptyStackException(Throwable e) {
        super(e);
    }

    public EmptyStackException(String message, Throwable e) {
        super(message, e);
    }
}
