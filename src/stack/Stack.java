package stack;

import java.util.Arrays;

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
    public int pop() {
        if (isEmpty()) {
            System.out.print(" Stack is empty ");
            return -1;
        } else {
            return data[tos--];
        }
    }


    /**
     * Clear stack
     */
    public void clear() {

        data = new int[DEFAULT_SIZE];
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

        int[] dataTemp = new int[data.length + 10];
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