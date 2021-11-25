package stack.exceptions;

public class StackOverFlowException extends Exception {

    public StackOverFlowException(String message) {
        super(message);
    }

    public StackOverFlowException(Throwable e) {
        super(e);
    }

    public StackOverFlowException(String message, Throwable e) {
        super(message, e);
    }
}
