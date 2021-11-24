package stack;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Stack {
    public static void main(String args[]) throws StackOverFlowException {
        Stack data = new Stack();
//        data.push(5);
//        data.push(10);
//        data.push(15);
        data.push(20);
        data.push(25);
        System.out.println("Pop - " + data.pop());
        System.out.println("Pop - " + data.pop());
        System.out.println("Pop - " + data.pop());
//        System.out.println("Pop - " + data.pop());
//        System.out.println("Pop - " + data.pop());
    }

    static final int DEFAULT_SIZE = 4;
    private int[] data;
    private int tos; //index which determines the top of stack

    public Stack() {
        this(DEFAULT_SIZE);
    }

    public Stack(int size) {
        data = new int[size];
        this.tos = -1;
    }

    public void push(int value) throws StackOverFlowException {
        if (tos == data.length - 1) {
            throw new StackOverFlowException("StackOverFlowException");
        }
        data[++tos] = value;
    }

    public int pop() throws StackOverFlowException {
        if (tos < 0) {
            throw new StackOverFlowException("EmptyStackException");
        }
        return data[tos--];
    }
}