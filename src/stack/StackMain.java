package stack;

public class StackMain {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        System.out.println(stack.isEmpty());
        stack.push(7);
        stack.push(3);
        stack.clear();
        stack.push(44);
        stack.push(55);
        stack.push(66);
        stack.push(88);
        stack.push(99);
        stack.push(100);
        stack.push(120);
        stack.push(140);
        stack.push(150);
        System.out.println(stack.pop());
       // System.out.println(stack.isEmpty());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
    	System.out.println(stack.isEmpty());

    }
}