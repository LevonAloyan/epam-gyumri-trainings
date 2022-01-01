package mycollections;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
//        DoubleLinkedList<Integer> list = new DoubleLinkedList<>();
//        list.add(10);
//        list.add(20);
//        list.add(30);
//        list.add(30);
//        list.add(40);
//        list.add(50);
//        list.add(30);
//        System.out.println(list.contains(40));
//        System.out.println(list.remove(Integer.valueOf(40)));
//        list.add(3, 2);
//        list.print(list);
//        list.remove(0);
//        list.print(list);
//        System.out.println(list.lastIndexOf(30));
//        list.set(4, 100);
//        list.print(list);

        DynamicArray<Integer> array = new DynamicArray<>();
        array.add(10);
        array.add(30);
        array.add(20);
        array.add(30);
//        System.out.println(array.size());
//        System.out.println(array.isEmpty());
//        System.out.println(array.contains(10));
//        System.out.println(array.indexOf(30));
//        System.out.println(array.lastIndexOf(30));
//        System.out.println(array.get(4));
//        System.out.println(array.set(3, 50));
//        array.add(4, 9);
        System.out.println(array.add(9));
        System.out.println(array.remove(Integer.valueOf(30)));
        System.out.println(array.remove(4));
        array.print();
    }
}
