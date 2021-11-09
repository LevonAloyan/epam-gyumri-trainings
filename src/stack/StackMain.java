package stack;


public class StackMain {
    public static void main(String[] args) {

        Stack stack = new Stack(6);
//        Stack stack=new Stack();
        System.out.println(stack);
        for (int i = 0; i < 6; i++) {
            stack.push(i * 10);
        }
        System.out.println(stack);
        stack.push(44);
        System.out.println(stack);
        System.out.println(stack.pop());
        System.out.println(stack);
        System.out.println(stack.pop());
        System.out.println(stack);
        System.out.println(stack.isEmpty());
        stack.clear();
        System.out.println(stack.isEmpty());

    }
}
