package stack;

public class Stack<T> {

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
    public void push(T value) {
        if (tos == data.length - 1) {
            ensureCapacity();
        } else {

            data[++tos] = value;
        }
    }

    /**
     * Get element from the stack
     *
     * @return
     */
    public T pop() {
        if (tos == -1) {
            System.out.println("empty");
            return (T) "";
        } else {
            return (T) data[tos--];
        }
    }

    /**
     * Clear stack
     */
    public void clear() {
        if (data.length == 800) {
            for (int i = 0; i < data.length; i++) {
                tos = -1;
            }
        } else {
            data = new Object[DEFAULT_SIZE];
            tos = -1;
        }
    }

    /**
     * Check if stack is empty
     *
     * @return
     */
    public boolean isEmpty() {
        return tos == -1;
    }

    /**
     * Increase the stack capacity if there is not enough space to add additional items
     */
    private void ensureCapacity() {
        int length = (int) ((data.length * 2) / 1.5);
        Object[] newStack = new Object[length];
        System.arraycopy(data, 0, newStack, 0, data.length);
        data = newStack;
    }
}