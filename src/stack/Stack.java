package stack;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Stack {

    static final int DEFAULT_SIZE = 16;
    private int[] data;
    private int tos; //index which determines the top of stack

    public Stack() {
        this(DEFAULT_SIZE);
    }

    public Stack(int size) {
        data = new int[size];
        this.tos = -1;
    }

    /**
     * Add element into stack
     */
    public void push(int value) {

    }

    /**
     * Get element from the stack
     *
     * @return
     */
    public int pop() {

        return 0;
    }


    /**
     * Clear stack
     */
    public void clear() {

    }

    /**
     * Check if stack is empty
     *
     * @return
     */
    public boolean isEmpty() {
        return false;
    }

    /**
     * Increase the stack capacity if there is not enough space to add additional items
     */
    private void ensureCapacity() {

	}
}