package functional;

import java.util.function.BinaryOperator;

public class Main {

    public static void main(String[] args) {

        ExtendedList<Integer> integerList = new ExtendedList<>();
        integerList.add(2);
        integerList.add(10);
        integerList.add(8);
        integerList.add(6);
        integerList.add(20);

        System.out.println(integerList.reduce((x,y)->x+y,0));

        System.out.println(integerList.map(e -> e * e));

        System.out.println(integerList.forAll(x -> x % 2 == 0));

        System.out.println(integerList.partition(x -> x % 2 == 0));

        System.out.println(integerList.fill(5, () ->(int) (Math.random() * 100)));
    }

}
