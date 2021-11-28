package stack;


import java.util.EmptyStackException;



public class Stack<T> {

    static final int DEFAULT_SIZE = 16;
    private T[] data;
    private int tos; //index which determines the top of stack

    public Stack() {
        this(DEFAULT_SIZE);
    }

    public Stack(int size) {
        this.data = (T[])new Stack[size];
        this.tos = -1;
    }

    /**
     * Add element into stack
     */
    public void push(T value) throws StackOverflowError {
        if (this.tos == data.length - 1) {
            throw new StackOverflowError();
        } else {
            this.data[++tos] = value;
        }
    }

    /**
     * Get element from the stack
     *
     * @return
     */
    public T pop() throws EmptyStackException {
        if (this.tos < 0) {
            throw new EmptyStackException();
        } else {
            return this.data[tos--];
        }
    }


    /**
     * Clear stack
     */
    public void clear() {
        if (!isEmpty()) {
            for (int i = 0; i < this.data.length; i++) {
                pop();
            }
            this.tos = -1;
        }
        System.out.println("tos = " + this.tos);
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
        T[] newArray = (T[])new Object[this.data.length * 2];
        System.arraycopy(data, 0, newArray, 0, this.data.length);
        this.data = newArray;
        System.out.println(newArray.length);
    }

    public static void main(String[] args) {
        Stack<String> mystackString = new Stack<String>(3);
        mystackString.push("hello");
        mystackString.push("object");
        mystackString.push("world");
        mystackString.ensureCapacity();

        System.out.println(mystackString.isEmpty());

        Stack<Integer> mystackInteger = new Stack<Integer>(2);
        mystackInteger.push(15);
        mystackInteger.push(25);





    }
}

