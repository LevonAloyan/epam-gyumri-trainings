package stack;

public class EmptyStackException extends RuntimeException{

    public EmptyStackException() {
        super("Stack is empty. You can't pop items");
    }

}