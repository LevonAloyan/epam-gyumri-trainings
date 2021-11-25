package stack;

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
        this.tos = 0;
    }

    /**
     * Add element into stack
     */
    public int push(int value) throws ExceptionStack  {
        data[tos] = value;
        tos++;
        if (tos >= DEFAULT_SIZE){
            throw new ExceptionStack("Stack is Full");
        }
       // if (tos >= data.length){
        //    ensureCapacity();
       // }
        else {
            data[tos] = value;
            tos++;
        }
        return value;
    }

    /**
     * Get element from the stack
     *
     * @return
     */
    public int pop() throws ExceptionStack {

        if (tos == 0) {
             throw new ExceptionStack("Stack is Empty");
        } else {
            return data[tos--];
        }
    }


    /**
     * Clear stack
     */
    public void clear() {
        this.tos = -1;
    }

    /**
     * Check if stack is empty
     *
     * @return
     */
    public boolean isEmpty() {
        if(this.tos == -1){
            return true;
        }else {
            return false;
        }
    }

    /**
     * Increase the stack capacity if there is not enough space to add additional items
     */
    private void ensureCapacity()  {
        int[] newData = new int[this.data.length * 2];
        System.arraycopy(this.data, 0, newData, 0, this.data.length);
        this.data = newData;

	}

    public static void main(String[] args) throws ExceptionStack {
        Stack stack = new Stack();
        stack.pop();
        stack.isEmpty();
        for (int i = 0; i <= DEFAULT_SIZE; i++) {
            stack.push(i);
        }


    }
}
