package stack;

public class StackOverFlowException extends RuntimeException {

    StackOverFlowException() {
        super("Stack is full. You can't add items any more");
    }
}
