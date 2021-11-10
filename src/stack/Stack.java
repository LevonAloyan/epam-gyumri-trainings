package stack;

public class Stack {
    public static void main(String args[]) {
        Stack data = new Stack();
        data.push(5);
        data.push(10);
        data.push(15);
        System.out.println("Pop - " + data.pop());
        System.out.println("Pop - " + data.pop());
        System.out.println("Stack is empty - " + data.isEmpty());
        System.out.println("Clear stack ");
        data.clear();
        System.out.println("Stack is empty - " + data.isEmpty());
        for (int i = 0; i < data.data.length; i++) {
            data.push(i);
        }
        ensureCapacity();
    }

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
     * -* Add element into stack
     */
    public void push(int value) {
        if (tos == 15) {
            return;
        }
        data[++tos] = value;
    }

    /**
     * Get element from the stack
     *
     * @return
     */
    public int pop() {
        if (tos < 0) {
            return 0;
        }
        return data[tos--];
    }


    /**
     * Clear stack
     */
    public void clear() {
        if (tos == -1) {
            return;
        }
        for (int i = tos; i > -1; i--) {
            pop();
        }
    }

    /**
     * Check if stack is empty
     *
     * @return
     */
    public boolean isEmpty() {
        if (tos == -1) {
            return true;
        }
        return false;
    }

    /**
     * Increase the stack capacity if there is not enough space to add additional items
     */
    private void ensureCapacity() {

        if (tos >= DEFAULT_SIZE) {
            int newCapacity = (DEFAULT_SIZE * 2) + 1;
            data[DEFAULT_SIZE] = data[newCapacity];
        }
    }
}