package stack;

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
        if (tos == data.length-1) {
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
        if (tos < 0)
            System.out.println("Stack is empty");
        return 0;
    }


    /**
     * Clear stack
     */
    public void clear() {
        tos = -1;
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
        int [] temp = new int [data.length * 2 ];
        System.arraycopy(data,0,temp,0,data.length);
        data = temp;

    }
}