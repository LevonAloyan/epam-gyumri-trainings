package stack;

public class StackTest {
    public static void main(String[] args) {
        Stack stack = new Stack();
        System.out.println(stack.isEmpty());
        stack.push(7);
        stack.push(3);
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
        try {
            System.out.println(stack.pop());
            System.out.println(stack.pop());
            System.out.println(stack.pop());
            System.out.println(stack.pop());
            System.out.println(stack.pop());
//            System.out.println(stack.pop());
//            System.out.println(stack.pop());
//            System.out.println(stack.pop());
//            System.out.println(stack.pop());
//            System.out.println(stack.pop());
//            System.out.println(stack.pop());
        } catch (EmptyStackException exception) {
            exception.printStackTrace();
        }
    }
}
