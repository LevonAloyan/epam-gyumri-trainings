package stack;

public class StackTest {
    public static void main(String[] args) {
        Stack mystack1 = new Stack();
        Stack mystack2 = new Stack();

        for (int i = 0; i < 10; i++) {
            mystack1.push(i);
            System.out.print(i+ ",");
        };
        System.out.println("Contents stack my stack");

        for (int i = 0; i < 10; i++) {
            System.out.print(mystack1.pop()+",");

        }

    }
}
