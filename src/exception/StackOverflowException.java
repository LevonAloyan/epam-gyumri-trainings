package exception;

public class StackOverflowException extends RuntimeException {

    public StackOverflowException(){
    }

    public StackOverflowException(String str) {
        super(str);
    }
}
