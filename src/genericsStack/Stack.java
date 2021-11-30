package genericsStack;

public class Stack<S> implements MyStack<S> {
    static final int DEFAULT_SIZE = 16;
    private S[] data;
    private int tos; //index which determines the top of stack

    public Stack() {
        this(DEFAULT_SIZE);
    }

    public Stack(int size) {
        data = (S[]) new Object[size];
        this.tos = -1;
    }

    /**
     * Add element into stack
     */
    public void push(S value) {
        if (tos == data.length - 1) {
            throw new StackOverflowException("Fully stack.");
        } else {
            data[++tos] = value;
        }
    }
    /**
     * Get element from the stack
     *
     * @return
     */
    public S pop() {
        if (tos < 0) {
            throw new EmptyStackException("Empty stack.");
        } else
            return data[tos--];
    }

    /**
     * Clear stack
     */
    public void clear() {
        for (int i = 0; i < data.length; i++) {
            data[i] = null;
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
    public void ensureCapacity() {
        S [] newArray = (S[]) new Object[data.length * 2];
        System.arraycopy(data, 0, newArray, 0, data.length);
        this.data = newArray;
    }
}
