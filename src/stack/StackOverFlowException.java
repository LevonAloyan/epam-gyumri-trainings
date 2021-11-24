package stack;

public class StackOverFlowException extends Exception {

    StackOverFlowException() {
        super("Stack is full. You can't add items any more");
    }
}
