package stack;

import stack.exceptions.EmptyStackException;
import stack.exceptions.StackOverFlowException;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

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
        if (tos<0){
            throw new StackOverFlowException("Stack is full");
        }else {
           value= data[++tos];
        }

    }

    /**
     * Get element from the stack
     *
     * @return
     */
    public int pop() {
if (isEmpty()){
    throw new EmptyStackException("Stack is empti");
}else {
    return data[--tos];
}

    }


    /**
     * Clear stack
     */
    public void clear() {
        int [] arr=new int[data.length];
        arr=data;

    }

    /**
     * Check if stack is empty
     *
     * @return
     */
    public boolean isEmpty() {
        if (tos<0){
            return true;
        }else {
            return false;
        }
    }

    /**
     * Increase the stack capacity if there is not enough space to add additional items
     */
    private void ensureCapacity() {

	}
}