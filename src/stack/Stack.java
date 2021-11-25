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
    public void push(int value) throws StackOverFlowException{
        if (tos > this.tos-1) {
            throw new StackOverFlowException();
        }else {

            data[++tos] = value;
        }


    }

    /**
     * Get element from the stack
     *
     * @return
     */
    public int pop() throws EmptyStackException {

            if (this.tos < 0) {
                throw new EmptyStackException();
            } else {
                return data[tos--];
            }
    }


    /**
     * Clear stack
     */
    public void clear() {
        for (int i = 0; i <= tos; i++) {
            data[i] = 0;
        }
        tos = -1;

    }

    /**
     * Check if stack is empty
     *
     * @return
     */
    public boolean isEmpty() {
        if (tos < 0) {
            return true;
        }
        return false;
    }

    /**
     * Increase the stack capacity if there is not enough space to add additional items
     */
    private void ensureCapacity() {
        int newData[] = new int[data.length * 2];
        System.arraycopy(data, 0, newData, 0, data.length);
        data = newData;
    }

    public void print() {
        for (int i = 0; i <= tos; i++) {
            System.out.print(data[i] + ",");
        }
    }
}