package stack;


import stack.exception.NoItemsFoundInStackException;

public class StackMain {
    public static void main(String[] args) throws NoItemsFoundInStackException {

        Stack<Integer> integerStack = new Stack<>(6);
        Stack<Double> doubleStack=new Stack<>();

        System.out.println(integerStack);
        System.out.println(doubleStack);
//        for (int i = 1; i <= 6; i++) {
//            integerStack.push(i * 10);
//            doubleStack.push(i * 2.2);
//        }
        //integer test
        System.out.println(integerStack);
        integerStack.push(44);
        System.out.println(integerStack);
        System.out.println(integerStack.pop());
        System.out.println(integerStack);
        System.out.println(integerStack.pop());
        System.out.println(integerStack);
        System.out.println(integerStack.isEmpty());
        integerStack.clear();
        System.out.println(integerStack);
        System.out.println(integerStack.isEmpty());

        //double test

        System.out.println(doubleStack);
        doubleStack.push(44.4);
        System.out.println(doubleStack);
        System.out.println(doubleStack.pop());
        System.out.println(doubleStack);
        System.out.println(doubleStack.pop());
        System.out.println(doubleStack);
        System.out.println(doubleStack.isEmpty());
        doubleStack.clear();
        System.out.println(doubleStack.isEmpty());


    }
}
