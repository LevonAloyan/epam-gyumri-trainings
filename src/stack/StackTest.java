package stack;

import algorithms.SortingAlgorithms;

import java.sql.SQLOutput;

public class StackTest {
    public static void main(String[] args) throws EmptyStackException, StackOverFlowException {
        Stack stack = new Stack();
        for (int i = 0; i < 10; i++) {
            stack.push(i);
        }
        for (int i = 0; i < 50; i++) {
            System.out.print(stack.pop()+",");
        }
//        System.out.println("______________________");
//        stack.push(41);
//        System.out.println("______________________");
//        stack.print();
//        System.out.println("______________________");
//
//        stack.clear();
//        stack.push(72);
//        System.out.println("______________________");
//        stack.print();
    }
}