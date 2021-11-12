package stack;

public class StackTest {
    public static void main(String[] args) {
        Stack stack=new Stack();
        stack.push(7);
        stack.push(14);
        stack.push(25);
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.isEmpty());
        stack.clear();
    }
}
