package myextendedlist;

import java.util.ArrayList;
import java.util.Random;

public class ExtendedListTest {
    public static void main(String[] args) {
        ExtendedList<Integer> numbers = new ExtendedList<>();
        numbers.add(2);
        numbers.add(4);
        numbers.add(7);
        numbers.add(13);
        numbers.add(18);
        numbers.add(21);

        System.out.println("\n Method map: ");
        System.out.println(numbers.map((t) -> t * t, numbers));

        System.out.println("\n Method fill: ");
        ExtendedList<Integer> randomList = new ExtendedList<>();
        Random random = new Random();
        randomList.fill(random, 6);
        System.out.println(randomList);

        System.out.println("\n Method for all:");
        System.out.println(numbers.forAll((integer) -> (integer % 2 == 0)));
        System.out.println(numbers);

        System.out.println("\n Method partition:");
        ArrayList[] arrayLists = numbers.partition((i) -> i % 2 == 0);
        System.out.println("Even numbers list - " + arrayLists[0]);
        System.out.println("Odd numbers list - " + arrayLists[1]);

        System.out.println("\n Method reduce:");
        int sum = numbers.reduce( (number, identityElement)-> number= number+identityElement,0);
        System.out.println(sum);
    }
}
