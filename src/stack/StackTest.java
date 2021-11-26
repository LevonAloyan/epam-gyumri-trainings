package stack;

import static stack.Stack.DEFAULT_SIZE;

public class StackTest {
    public static void main(String[] args)  {
        Stack<String> stack = new Stack<>();
        System.out.println(stack.push("Garik"));
        System.out.println(stack.push("Hayk"));
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
    }
}
