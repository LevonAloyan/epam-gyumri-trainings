package stack;

public class EmptyStackException extends RuntimeException{

     EmptyStackException() {
        super("Stack is empty. You can't pop items");
    }

}