package exception;

public interface MyStack <S> {
    void push(S value);
    S pop();
    void clear();
    boolean isEmpty();
    void ensureCapacity();
}
