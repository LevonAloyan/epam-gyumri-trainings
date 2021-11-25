package stack;


import java.util.EmptyStackException;



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
    public void push(int value) throws StackOverflowError {
        if (this.tos == data.length - 1) {
            throw new StackOverflowError();
        } else {
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
        if (!isEmpty()) {
            for (int i = 0; i < data.length; i++) {
                pop();
            }
            tos = -1;
        }
        System.out.println("tos = " + tos);
    }

    /**
     * Check if stack is empty
     *
     * @return
     */
    public boolean isEmpty() {
        if (this.tos < 0) {
            return true;
        } else {
            return false;
        }
    }

    /**
     * Increase the stack capacity if there is not enough space to add additional items
     */
    private void ensureCapacity() {
        int[] newArray = new int[data.length * 2];
        System.arraycopy(data, 0, newArray, 0, data.length);
        this.data = newArray;
        System.out.println(newArray.length);
    }

    public static void main(String[] args) {
        Stack mystack = new Stack();
        for (int i = 0; i < DEFAULT_SIZE; i++) {
            mystack.push(i);
        }

        System.out.println(mystack.isEmpty());

        for (int i = 0; i < 2; i++) {
            System.out.println(mystack.pop());
        }


        mystack.clear();
        System.out.println(mystack.isEmpty());
        mystack.ensureCapacity();
    }
}

