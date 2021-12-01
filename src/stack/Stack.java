package stack;

public class Stack <T>{

    static final int DEFAULT_SIZE = 16;
    private T [] data;
    private int tos; //index which determines the top of stack

    public Stack() {
        data = (T[]) new Object[DEFAULT_SIZE];    }

    public Stack(int size) {
        data = (T[]) new Object[size];
        this.tos = -1;
    }

    /**
     * Add element into stack
     */
    public void push(T value) {

        if (tos >= data.length-1) {
            throw new StackOverFlowException("Stack is fully");
        }

        data[++tos] = value;
    }

    /**
     * Get element from the stack
     */
    public T pop() {

           if (isEmpty()){
               throw new EmptyStackException("Stack is empty");
           }


        return data[tos--];
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
        return tos < 0;

    }

    /**
     * Increase the stack capacity if there is not enough space to add additional items
     */
    private void ensureCapacity() {
        T newData[] = (T[]) new Object[data.length * 2];
        System.arraycopy(data, 0, newData, 0, data.length);
        data = newData;
    }


    public void print() {
        for (int i = 0; i <= tos; i++) {
            System.out.print(data[i] + ",");
        }
        System.out.println();
    }

}