package stack;

import java.util.EmptyStackException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Stack <T>   {

    static final int DEFAULT_SIZE = 16;
    private T [] data;
    private int tos; //index which determines the top of stack

    public Stack() {
        this(DEFAULT_SIZE);
    }

    public Stack(int size) {
        data = (T[]) new Object[size];

    }

    /**
     * Add element into stack
     */
    public void push( T value) {
        if (tos == data.length - 1) {
            throw new StackException("Stack is overflow");
        }
        this.data[this.tos++] = value;
    }

    /**
     * Get element from the stack
     *
     * @return
     */
    public T pop() {
        if (this.isEmpty()) {
            throw new StackException("Stack is empty");
        }

        return this.data[--this.tos];
    }


    /**
     * Clear stack
     */
    public void clear() {
        for (int i = 0; i < data.length; i++) {
            data[i] = null;
        }
    }

    /**
     * Check if stack is empty
     *
     * @return
     */
    public boolean isEmpty() {
        return this.tos == 0;
    }

    /**
     * Increase the stack capacity if there is not enough space to add additional items
     */
    private void ensureCapacity() {
        T [] newArray = (T[]) new Object [data.length * 2];
        System.arraycopy(data, 0, newArray, 0, data.length);
        this.data = newArray;
    }
}
