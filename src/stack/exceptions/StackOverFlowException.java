package stack.exceptions;

public class StackOverFlowException extends RuntimeException{

    public StackOverFlowException() {
    }

    public StackOverFlowException(String message) {
        super(message);
    }
}
