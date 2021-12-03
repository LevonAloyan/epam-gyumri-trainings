package stack;

public class StackTest {
    public static void main(String[] args) {

       Stack<Integer> stack = new Stack<>();
       stack.push(1);
       stack.push(2);
       stack.clear();
       stack.push(7);
       stack.push(6);
       System.out.println(stack.pop());
       System.out.println(stack.pop());
       System.out.println(stack.pop());
       System.out.println(stack.pop());

    }
}
