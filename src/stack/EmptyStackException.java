package stack;

public class EmptyStackException extends Exception {

    @Override
    public String getMessage() {
        return "Stack is empty";
    }
}
