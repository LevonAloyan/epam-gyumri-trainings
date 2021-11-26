package stack;

import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Stack<T> {
    static final int DEFAULT_SIZE = 16;
    private Object[] data;
    private int tos = -1; //index which determines the top of stack

    public Stack() {
        this(DEFAULT_SIZE);
    }

    public Stack(int size) {
        this.data = new Object[size];
    }

    /**
     * Add element into stack
     */
    public T push(T value)  {
        if (tos >= data.length - 1) {
            ensureCapacity();
        }
        data[++tos] = value;
        return value;
    }

    /**
     * Get element from the stack
     *
     * @return
     */
    public T pop()  {
        if (isEmpty()) {
            throw new ExceptionStack("Stack is Empty");
        } else {
            return (T) data[tos--];
        }
    }

    /**
     * Clear stack
     */
    public void clear() {
        this.tos = -1;
    }

    /**
     * Check if stack is empty
     *
     * @return
     */
    public boolean isEmpty() {
        if (this.tos == -1) {
            return true;
        } else {
            return false;
        }
    }

    /**
     * Increase the stack capacity if there is not enough space to add additional items
     */
    private void ensureCapacity() {
        Object[] newData = new Object[this.data.length * 2];
        System.arraycopy(this.data, 0, newData, 0, this.data.length);
        this.data = newData;
    }
}
