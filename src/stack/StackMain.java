package stack;

public class StackMain {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        System.out.println(stack.isEmpty());
        stack.push(7);
        stack.push(3);
        stack.clear();
        stack.push(4);
        stack.push(5);
        stack.push(6);
        stack.push(8);
        stack.push(8);
        stack.push(8);
        stack.push(9);
        stack.push(9);
        stack.push(10);
        stack.push(12);
        stack.push(14);
     //   stack.push(155);
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());

    }
}