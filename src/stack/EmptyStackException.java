package stack;

public class EmptyStackException extends Exception {

    EmptyStackException() {
        super("Stack is empty. You can't pop items");
    }
}
