package genericsStack;

public class EmptyStackException extends RuntimeException{
    public EmptyStackException(){
    }

    public EmptyStackException(String str) {
        super(str);
    }
}
