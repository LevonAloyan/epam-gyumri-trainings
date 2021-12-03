package stack;

import java.util.EmptyStackException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Stack extends RuntimeException {

    static final int DEFAULT_SIZE = 16;
    private int[] data;
    private int tos; //index which determines the top of stack

    public Stack() {
        this(DEFAULT_SIZE);
    }

    public Stack(int size) {
        data = new int[size];

    }

    /**
     * Add element into stack
     */
    public void push(int value) {
        if (tos == data.length - 1) {
            throw new StackOverflowError();
        }
        this.data[this.tos++] = value;
    }

    /**
     * Get element from the stack
     *
     * @return
     */
    public int pop() {
        if (this.isEmpty()) {
            throw new EmptyStackException();
        }

        return this.data[--this.tos];
    }


    /**
     * Clear stack
     */
    public void clear() {
        for (int i = 0; i < data.length; i++) {
            data[i] = 0;
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
        int[] newArray = new int[data.length * 2];
        System.arraycopy(data, 0, newArray, 0, data.length);
        this.data = newArray;
    }
}
