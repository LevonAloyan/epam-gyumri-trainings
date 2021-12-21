package extendedList;

import java.util.ArrayList;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        ExtendedList<Integer> list = new ExtendedList<>();
        list.add(1);
        list.add(2);
        list.add(7);
        list.add(10);
        System.out.println(list.map(i -> i * i));
        ExtendedList<Integer> list1 = new ExtendedList<>();
        list1.fill(() -> new Random().nextInt(100), 5);
        System.out.println(list1);
        System.out.println(list.forAll(i -> i % 2 == 0));
        ArrayList[] array = list.partition(i -> i % 2 == 0);
        System.out.println(array[0]);
        System.out.println(array[1]);
    }
}
