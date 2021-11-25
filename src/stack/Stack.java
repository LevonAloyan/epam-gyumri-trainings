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

    }

    /**
     * Add element into stack
     */
    public void push(int value) throws StackOverFlowException {
        if (tos == DEFAULT_SIZE) {
            throw new StackOverFlowException();
        }
        data[tos++] = value;
    }

    /**
     * Get element from the stack
     */
    public int pop() throws EmptyStackException {

        if (tos == 0) {
            throw new EmptyStackException();
        } else return data[tos--];
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

    public static void main(String[] args) throws EmptyStackException, StackOverFlowException {
        Stack stack = new Stack();

        stack.pop();
        for (int i = 0; i <= DEFAULT_SIZE; i++) {
            stack.push(i);
        }
    }
}

