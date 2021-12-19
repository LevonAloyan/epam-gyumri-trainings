package mycollections;

public class DynamicArrayTest {

    public static void main(String[] args) {
        DynamicArray<String> arraylist = new DynamicArray<>();
        arraylist.add("A");
        arraylist.add("B");
        arraylist.add("C");
        arraylist.add("D");
        arraylist.add("A");
        System.out.println(arraylist.add("E"));
        arraylist.print();
        arraylist.add(2,"X");
        arraylist.print();
        System.out.println(arraylist.remove(4));
        arraylist.print();
        System.out.println(arraylist.remove("C"));
        arraylist.print();
        System.out.println(arraylist.isEmpty());
        System.out.println(arraylist.size());
        System.out.println(arraylist.indexOf("B"));
        System.out.println(arraylist.lastIndexOf("A"));
        System.out.println(arraylist.contains("E"));
        System.out.println(arraylist.set(1,"I"));
        arraylist.print();

        DoubleLinkedList<String> linkedList = new DoubleLinkedList<>();
        linkedList.add("K");
        linkedList.add("M");
        linkedList.add("L");
        linkedList.add("O");
        linkedList.add("K");
        System.out.println(linkedList.add("S"));
        linkedList.print();
        linkedList.add(3,"Y");
        linkedList.print();
        System.out.println(linkedList.remove(2));
        linkedList.print();
        System.out.println(linkedList.remove("O"));
        linkedList.print();
        System.out.println(linkedList.isEmpty());
        System.out.println(linkedList.size());
        System.out.println(linkedList.indexOf("M"));
        System.out.println(linkedList.lastIndexOf("K"));
        System.out.println(linkedList.contains("M"));
        System.out.println(linkedList.set(2,"Z"));
        linkedList.print();
    }
}
