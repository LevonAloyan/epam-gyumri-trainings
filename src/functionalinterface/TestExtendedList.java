package functionalinterface;

import java.util.Arrays;

public class TestExtendedList {
    public static void main(String[] args) {
        ExtendedList<Integer> list = new ExtendedList<>();
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        System.out.println(list.map(x -> x * x));

        System.out.println(list.fill(() -> (int) (Math.random() * 100), 25));

        System.out.println(list.forAll(x -> (x % 2) == 0));

        System.out.println((list.partition(x -> (x % 2) == 0)));

        System.out.println(list.reduce(Integer::sum, 0));

    }
}
