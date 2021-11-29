package stack;

public class StackOverFlowException extends Exception {

    public StackOverFlowException() {
        super("Stack is full. You can't add items any more");
    }

}