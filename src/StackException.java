import java.util.EmptyStackException;

public class StackException {
    static final int DEFAULT_SIZE = 16;
    private int[] data;
    private int tos; //index which determines the top of stack

    public StackException() {
        this(DEFAULT_SIZE);
    }

    public StackException(int size) {
        data = new int[size];
        this.tos = -1;
    }

    /**
     * Add element into stack
     */
    public void push(int value) throws StackOverflowError {
        if (tos == data.length - 1) {
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
        if (tos < 0) {
            throw new EmptyStackException();
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
        StackException stack = new StackException(2);
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.pop();
        System.out.println(stack.isEmpty());
        stack.clear();
        stack.ensureCapacity();
    }
}
