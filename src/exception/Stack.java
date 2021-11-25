package exception;

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
                throw new StackOverflowException("Stack is full.");
            } else {
                data[++tos] = value;
            }

    }
    /**
     * Get element from the stack
     *
     * @return
     */
    public int pop() {
        if (tos < 0) {
            throw new EmptyStackException("Stack is empty.");
        } else
            return data[tos--];
    }


    /**
     * Clear stack
     */
    public void clear() {
        for (int i = 0; i < data.length; i++) {
            data[i] = 0;
        }
    }

    /**
     * Check if stack is empty
     *
     * @return
     */
    public boolean isEmpty() {
        return DEFAULT_SIZE == 0;
    }

    /**
     * Increase the stack capacity if there is not enough space to add additional items
     */
    private void ensureCapacity() {
        int[] newArray = new int[data.length * 2];
        System.arraycopy(data, 0, newArray, 0, data.length);
        this.data = newArray;
    }

    public static void main(String[] args) {
        Stack stack = new Stack(2);
        try {
            stack.push(1);
            stack.push(2);
            stack.push(3);
            stack.pop();
        }catch (StackOverflowException | EmptyStackException exc){
            exc.printStackTrace();
        }
        System.out.println("After try catch block.");
    }
}
