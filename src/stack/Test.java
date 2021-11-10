package stack;

public class Test {
    private static Stack stack = new Stack();

    public static void main(String[] args) {
        for (int i = 1; i < 14; i++) {
            stack.push(i);
        }
        for (int i = 0; i < 6; i++) {
            System.out.println(stack.pop());
        }
        stack.clear();
    }
}
