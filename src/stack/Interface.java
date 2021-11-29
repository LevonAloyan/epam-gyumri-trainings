package stack;

public interface Interface<T> {

    void push (T value);

    T pop();

    void clear();

    boolean isEmpty();

}