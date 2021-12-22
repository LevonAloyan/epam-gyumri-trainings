package extendedlist;

import java.util.ArrayList;
import java.util.Random;

public class ExtendedListTest {

        public static void main(String[] args) {
            ExtendedList<Integer> list = new ExtendedList<>();
            list.add(1);
            list.add(2);
            list.add(7);
            list.add(10);
            System.out.println(list.map(i -> i * i));
            System.out.println(list.fill(() -> (int) (Math.random() * 100), 25));

            System.out.println(list.forAll(i -> i % 2 == 0));
            System.out.println((list.partition(x -> (x % 2) == 0)));

            int sum = list.reduce(Integer::sum, 0);
            System.out.println(sum);
        }
    }
