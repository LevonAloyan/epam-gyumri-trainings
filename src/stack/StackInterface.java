package stack;

public interface StackInterface<T> {

    void push (T value);

    T pop();

    void clear();

    boolean isEmpty();

}
