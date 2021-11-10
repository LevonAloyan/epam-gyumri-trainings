package stack;

public class StackTest {

    private static Stack stack = new Stack();

    public static void main(String[] args) {
        for (int i = 0; i < 20; i++) {
          stack.push(i);
        }

        for (int i = 0; i < 10; i++) {
            System.out.println(stack.pop());
        }
        stack.clear();



    }
}
