package mycollections;

public class Main {
    public static void main(String[] args) {
        DoubleLinkedList<Integer> list = new DoubleLinkedList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(30);
        list.add(40);
        list.add(50);
        list.add(30);

//        System.out.println(list.contains(40));
//        System.out.println(list.remove(Integer.valueOf(40)));
//        list.add(3, 2);
//        list.print(list);
//        list.remove(0);
//        list.print(list);
        System.out.println(list.lastIndexOf(30));
        list.set(4, 100);
        list.print(list);
   }
}
