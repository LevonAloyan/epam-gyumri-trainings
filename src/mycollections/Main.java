package mycollections;


import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        ExtendedList<Integer> list = new ExtendedList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        System.out.println(list.map(value -> value * value));
        list.fill(()->(int)(Math.random()*100),5);
        System.out.println(list);
        System.out.println(list.forAll(value -> value % 2 == 0));
        ArrayList[] partition = list.partition(value -> value % 2 == 0);
        System.out.println(Arrays.toString(partition));
        System.out.println(list.reduce(0, ((value1, value2) -> value1 + value2)));
    }
}
