package stack;

import stack.stackExceptions.EmptyStackException;
import stack.stackExceptions.StackOverFlowException;

public class Stack<E> {

    static final int DEFAULT_SIZE = 16;
    private Object[] data;
    private int tos; //index which determines the top of stack

    public Stack() {
        this(DEFAULT_SIZE);
    }

    public Stack(int size) {
        data = new Object[size];
        this.tos = -1;
    }

    /**
     * Add element into stack
     */
    public void push(E el) {
        if (this.isFully()) {
            throw new StackOverFlowException("Stack is fully. You can't add any more element.");
//            this.ensureCapacity();
        }
        this.data[++this.tos] = el;
    }

    /**
     * Get element from the stack
     *
     * @return
     */
    @SuppressWarnings("unchecked")
    public E pop() {
        if (this.isEmpty()) {
            throw new EmptyStackException("Stack is empty. There is no element to get.");
        }
        return (E)this.data[this.tos--];
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
        return this.tos == -1;
    }

    /**
     * Check if stack is fully
     *
     * @return
     */
    public boolean isFully() {
        return this.tos == this.data.length - 1;
    }

    /**
     * Increase the stack capacity if there is not enough space to add additional items
     */
    private void ensureCapacity() {
        Object [] newData = new Object[data.length * 2];
        System.arraycopy(data, 0, newData, 0, data.length);
        this.data = newData;
    }

}