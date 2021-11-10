package stack;

public class Stack {

    public static void main(String[] args) {
        Stack stack=new Stack(10);
        int value =10;
        while (!stack.isFull()) {
            stack.push(value--);
        }
        while (!stack.isEmpty()){
            System.out.println(stack.pop());
        }
    }


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
        if (this.isFull()){
            System.err.println("Error Stack is Full");
            return;
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
            System.err.println("Error Stack is Empty");
            return -1;
        }

        return this.data[--this.tos];
    }


    /**
     * Clear stack
     */
    public void clear() {
        pop();
    }

    /**
     * Check if stack is empty
     *
     * @return
     */
    public boolean isEmpty() {
        return this.tos == 0;
    }

    public boolean isFull() {
        return this.tos == this.data.length;
    }

    /**
     * Increase the stack capacity if there is not enough space to add additional items
     */
    private void ensureCapacity() {

    }
}