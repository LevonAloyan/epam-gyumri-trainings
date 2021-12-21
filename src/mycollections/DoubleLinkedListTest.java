package mycollections;

public class DoubleLinkedListTest {

    private static DoubleLinkedList<Integer> doubleLinkedList = new DoubleLinkedList<>();

    public static void main(String[] args) {
        System.out.println("LinkedList Test ");
        isEmptyTest();
        addTest();
        isEmptyTest();
        doubleLinkedList.print();
        sizeTest();
        addByIndexTest();
        doubleLinkedList.print();
        sizeTest();
        indexOfTest();
        lastIndexOfTest();
        containsTest();
        doubleLinkedList.print();
        System.out.println();
        remove();
        doubleLinkedList.print();
        System.out.println();
        getTest();
        removeByIndexTest();
        doubleLinkedList.print();
        System.out.println();
        set(3, 77);
        doubleLinkedList.print();
        System.out.println();
    }

    public static void sizeTest() {
        System.out.println("Dynamic array size is - " + doubleLinkedList.size());
        System.out.println();
    }

    public static void isEmptyTest() {
        System.out.println("Array is empty - " + doubleLinkedList.isEmpty());
        System.out.println();
    }

    public static void containsTest() {
        System.out.println("Array contains of 17 - " + doubleLinkedList.contains(17));
        System.out.println();
    }

    public static void indexOfTest() {
        System.out.println("Index of that element - " + doubleLinkedList.indexOf(6));
        System.out.println();
    }

    public static void lastIndexOfTest() {
        System.out.println("Last index of that element - " + doubleLinkedList.lastIndexOf(5));
        System.out.println();
    }

    public static void getTest() {
        System.out.println("The element at the specified position in this list - " + doubleLinkedList.get(2));
    }

    public static void set(int index, Integer element) {
        System.out.println("The element previously at the specified position - " + doubleLinkedList.set(index, element));
    }

    public static void addTest() {
        System.out.println(doubleLinkedList.add(5));
        System.out.println(doubleLinkedList.add(6));
        System.out.println(doubleLinkedList.add(7));
        System.out.println(doubleLinkedList.add(1));
        System.out.println(doubleLinkedList.add(0));
        System.out.println(doubleLinkedList.add(5));
        System.out.println(doubleLinkedList.add(8));
        System.out.println(doubleLinkedList.add(11));
        System.out.println(doubleLinkedList.add(17));
        System.out.println(doubleLinkedList.add(5));
        System.out.println();
    }

    public static void addByIndexTest() {
        System.out.println("Add by index");
        doubleLinkedList.add(2, 22);
    }

    public static void removeByIndexTest() {
        System.out.println("Remove by index - " + doubleLinkedList.removeByIndex(1));
    }

    public static void remove() {
        System.out.println("Remove element 11 - " + doubleLinkedList.remove(11));
    }
}
