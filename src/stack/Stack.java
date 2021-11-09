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
        if (this.isFully()) {
            this.ensureCapacity();
        }
        this.data[++this.tos] = value;
    }

    /**
     * Get element from the stack
     *
     * @return
     */
    public int pop() {
        if (this.isEmpty()) {
            throw new RuntimeException("Stack is empty");
        }
        return this.data[this.tos--];
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
        int[] newData = new int[data.length * 2];
        System.arraycopy(data, 0, newData, 0, data.length);
        this.data = newData;
    }

}