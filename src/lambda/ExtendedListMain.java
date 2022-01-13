package lambda;

import java.util.ArrayList;
import java.util.Random;

public class ExtendedListMain {
    public static void main(String[] args) {
        ExtendedList<Integer> number = new ExtendedList<>();
        number.add(7);
        number.add(34);
        number.add(8);
        number.add(4);
        number.add(43);

        number.printArrayList(number);

        number.map(number, integer -> integer*integer).forEach(System.out::println);
        System.out.println(number.map(number, integer -> integer*integer));

        ExtendedList<Integer> randomList = new ExtendedList<>();
        randomList.fill(() -> new Random().nextInt(100), 10).forEach(System.out::println);

        System.out.println(number.forAll(number, i -> i % 2 == 0));
        System.out.println("SortByOddAndEven: ");
        System.out.println(number.partition(i -> i % 2 == 0));

        System.out.println(number.reduce(0, (a, b) -> a+b) );

    }
}
