package Expressions;

import java.util.ArrayList;
import java.util.Random;

public class Test {
    public static void main(String[] args) {
        ExtendsList<Integer> myList = new ExtendsList<>();
        myList.add(6);
        myList.add(8);
        myList.add(20);
        myList.add(21);

        System.out.println(myList.map(n -> n * n));
        System.out.println(myList.fill(() -> (int) (Math.random() * 100), 10));
        System.out.println(myList.forAll(num -> (num % 2) == 0));

        ArrayList[] arrayList = myList.partition(num -> num % 2 == 0);
        System.out.println(arrayList[0]);
        System.out.println(arrayList[1]);

        System.out.println(myList.reduce(Integer::sum, 0));
        
    }
}
