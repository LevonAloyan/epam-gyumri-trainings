package stack;

public class StackOverFlowException extends Exception{

    @Override
    public String getMessage() {
        return "Stack is overflow";
    }
}
