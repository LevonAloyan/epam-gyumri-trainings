package stack;


import stack.exceptions.EmptyStackException;
import stack.exceptions.StackOverFlowException;

public class Stack <T>{
    static final int DEFAULT_SIZE = 16;
    private T[] data;
    private int tos; //index which determines the top of stack
    public Stack() {
        this(DEFAULT_SIZE);
    }

    public Stack(int size) {
        data = (T[]) new Object[size];
        this.tos = -1;
    }
    public void  push(T value) {
        if (tos<0){
            throw new StackOverFlowException("Stack is full");
        }else {
            value= data[++tos];
        }

    }
    public T pop() {
        if (isEmpty()) {
            throw new EmptyStackException("Stack is empti");
        } else {
            return data[--tos];
        }
    }
    public boolean isEmpty() {
        if (tos<0){
            return true;
        }else {
            return false;
        }
    }
}
