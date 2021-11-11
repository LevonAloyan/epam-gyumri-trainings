package stack;

public class StackTest {

    public static void main(String[] args) {
        Stack stack = new Stack();
        for (int i = 0; i < 54; i++) {
            stack.push(i);

        }
        for (int i=0; i<50;i++){
            System.out.print(stack.pop()+ ",");
        }
        System.out.println("---------------");
        stack.push(41);
        System.out.println("---------------");
        stack.print();
        System.out.println("---------------");
        stack.clear();
        stack.push(72);
        System.out.println("---------------");
        stack.print();


    }
}
