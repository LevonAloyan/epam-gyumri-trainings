package exception;

public class StackDemo {
    public static void main(String[] args) {
        MyStack<String> stack = new Stack<String>(2);
        try {
            stack.push("1");
            stack.push("2");
            stack.push("3");
            stack.pop();
        }catch (StackOverflowException | EmptyStackException exc){
            exc.printStackTrace();
        }
        System.out.println("After try catch block.");
    }
}
