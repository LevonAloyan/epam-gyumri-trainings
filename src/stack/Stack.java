package stack;


import java.util.Arrays;

public class Stack <T> implements StackInterface<T> {

    private static final int DEFAULT_SIZE = 4;
    private T[] data;
    private int tos;

    public Stack() {
        this(DEFAULT_SIZE);
    }

    public Stack(int size) {
        data = (T[]) new Object[size];
        this.tos = -1;
    }

    public void push(T value) {
        if (tos == data.length-1 && data.length > 10) {
            ensureCapacity();
        } else if (data.length > 10) {
            try {
                throw new StackOverFlowException();
            } catch (StackOverFlowException e) {
                e.printStackTrace();
            }
        }
        data[tos++] = value;
    }

    public T pop() {
        if (tos == -1) {
            throw new EmptyStackException();
        }
        return data[tos--];
    }

    public void clear() {
        if (data.length < 1000) {
            Arrays.fill(data, 0);
        } else {
            data = (T[]) new Object[DEFAULT_SIZE];
        }
        tos = -1;
    }


    public boolean isEmpty() {
        return tos == -1;
    }

    private void ensureCapacity() {
        int length = (data.length + 5);
        T[] result = (T[]) new Object[length];
        System.arraycopy(data,0,result,0,data.length);
        data = result;
    }
}