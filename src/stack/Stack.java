package stack;

import java.util.EmptyStackException;



public class Stack <T> {

    static final int DEFAULT_SIZE = 16;
    private T[] data;
    private int tos; //index which determines the top of stack

    public Stack() {
        this(DEFAULT_SIZE);
    }

    public Stack(int size) {
        data =(T []) new Object [size];

    }

    /**
     * Add element into stack
     */
    public void push(T value) {
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
    public  T pop ()  {
        if (this.isEmpty()) {
            throw new EmptyStackException();
        }


    }


    /**
     * Clear stack
     */
    public boolean isEmpty() {
        data = (T[]) new Object[DEFAULT_SIZE];
        tos = -1;


    }

        /**
         * Increase the stack capacity if there is not enough space to add additional items
         */
        private void ensureCapacity () {
            if (tos >= DEFAULT_SIZE) {
                T[] newCapacity = (T[]) new Object[(DEFAULT_SIZE * 2) + 1];
            }
        }
    }


