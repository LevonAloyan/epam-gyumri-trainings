package stack;

import javax.print.attribute.Size2DSyntax;

public class Stack {

    static final int DEFAULT_SIZE = 16;
    private int[] data;
    private int tos; //index which determines the top of stack

    public static void main(String[] args) {
        Stack stack = new Stack(DEFAULT_SIZE);
        stack.isEmpty();
        System.out.println(stack.tos);
        stack.push(4);
        stack.push(5);
        stack.push(6);
        stack.push(7);
        System.out.println(stack);
        stack.pop();
        System.out.println(stack.pop());
    }
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
        int i = ++tos;
        data[i] = value;
    }

    /**
     * Get element from the stack
     *
     * @return
     */
    public int pop() {
        if (isEmpty()) {
            System.out.println("The Stack is emptu");
            return 0;
        }
        else{
         return data[tos--];
        }
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
        return (tos == -1);
    }

    /**
     * Increase the stack capacity if there is not enough space to add additional items
     */
    private void ensureCapacity() {

    }
}