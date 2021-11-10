package stack;

import java.util.Arrays;

public class Stack {
    public static void main(String[] args) {
        Stack stack = new Stack(5);
        System.out.println(stack);
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);
        stack.push(6);
        stack.push(7);
        System.out.println(stack);
        stack.pop();
        System.out.println(stack);
        System.out.println(stack.isEmpty());
        stack.clear();
        System.out.println(stack);


    }

    static final int DEFAULT_SIZE = 16;
    private int[] data;
    private int tos; //index which determines the top of stack

    public Stack() {
        this(DEFAULT_SIZE);
    }

    public Stack(int size) {
        data = new int[size];
        this.tos = 0;
    }

    /**
     * Add element into stack
     */
    public void push(int value) {
        if (tos == data.length) {
            ensureCapacity();
            data[tos++] = value;
        } else {
            data[tos++] = value;
        }
    }

    /**
     * Get element from the stack
     *
     * @return
     */
    public int pop() {
        if (isEmpty()) {
            return -1;
        } else {
            return data[--tos];
        }
    }


    /**
     * Clear stack
     */
    public void clear() {
        if (isEmpty()) {
            System.out.println("Stack is empty.");
        } else {
            for (int i = data.length - 1; i >= 0; i--) {
                data[i] = 0;
            }
        }
    }

    /**
     * Check if stack is empty
     *
     * @return
     */
    public boolean isEmpty() {
        return tos == 0;
    }

    /**
     * Increase the stack capacity if there is not enough space to add additional items
     */
    private void ensureCapacity() {
        if (tos == data.length) {
            int[] newData = new int[3 * data.length/2];
            for (int i = 0; i < data.length; i++) {
                newData[i] = data[i];
            }
            data = newData;
        }
    }

    @Override
    public String toString() {
        int[] itmes = Arrays.copyOfRange(data, 0, tos);
        return Arrays.toString(itmes);
    }
}