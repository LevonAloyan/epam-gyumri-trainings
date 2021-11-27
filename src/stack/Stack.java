package stack;

import stack.exception.NoItemsFoundInStackException;

import java.util.Arrays;

public class Stack<T> {

    static final int DEFAULT_SIZE = 16;
    private T[] data;
    private int tos; //index which determines the top of stack


    public Stack() {
        this(DEFAULT_SIZE);
    }

    public Stack(int size) {
        data = (T[]) new Object[size];
        this.tos = -1;
    }

    /**
     * Add element into stack
     */
    public void push(T value) {
        if (tos == data.length - 1) {
            ensureCapacity();
        }
        data[++tos] = value;
    }

    /**
     * Get element from the stack
     *
     * @return
     */
    public T pop() throws NoItemsFoundInStackException {
        if (isEmpty()) {
            throw new NoItemsFoundInStackException("Stack is empty, no items found on the Stack");

        } else {
            return data[tos--];
        }
    }


    /**
     * Clear stack
     */
    public void clear() {

        data = (T[]) new Object[DEFAULT_SIZE];
        tos = -1;

    }

    /**
     * Check if stack is empty
     *
     * @return
     */
    public boolean isEmpty() {
        return 0 > tos;
    }

    /**
     * Increase the stack capacity if there is not enough space to add additional items
     */
    private void ensureCapacity() {

        T[] dataTemp = (T[]) new Object[data.length + 10];
        System.arraycopy(data, 0, dataTemp, 0, data.length);
        data = dataTemp;

    }

    @Override
    public String toString() {
        return "Stack{" +
                "data=" + Arrays.toString(data) +
                ", tos=" + tos +
                '}';
    }
}