package mycollections;

import java.util.LinkedList;

public class DoubleLinkedArrayTest {
    private final DoubleLinkedList<Double> doubleLinkedList = new DoubleLinkedList<>();
    // LinkedList

    public static void main(String[] args) {
        DoubleLinkedArrayTest test = new DoubleLinkedArrayTest();
      //  test.isEmptyTest();
     //   test.containsTest(5.77);
        test.addTest(4.7);
        test.addTest(2.7);
        test.addTest(6.67);
        test.addTest(2.788);
//        test.addTest(4.7);
//        test.addByIndexTest(1, 5.66);
//        test.getTest(1);
//        test.sizeTest();
 //       test.set(2, 33.3);
//        test.getTest(2);
//        test.indexOfTest(4.7);
 //       test.lastIndexOfTest(4.7);
 //       test.remove(4.7);
//        test.removeByIndexTest(2);
        test.print();
    }


    public void sizeTest() {
        System.out.println("Size of linked array is -> " + doubleLinkedList.size());
    }

    public void isEmptyTest() {
        System.out.println("Check if lincked array is empty -> "
                + doubleLinkedList.isEmpty());
    }

    public <T> void containsTest(T element) {
        System.out.println("Linked array contains element -> "
                + doubleLinkedList.contains((Double) element));
    }

    public <T> void indexOfTest(T element) {
        System.out.println("Index of element in linked array is -> "
                + doubleLinkedList.indexOf((Double) element));
    }

    public <T> void lastIndexOfTest(T element) {
        System.out.println("Last index of element in linked array is -> "
                + doubleLinkedList.lastIndexOf((Double) element));
    }

    public void getTest(int index) {
        System.out.println("Get by index from linked array -> " + doubleLinkedList.get(index));
    }

    public <T> void set(int index, T element) {
        System.out.println("Set an element by index in linked array -> "
                + doubleLinkedList.set(index, (Double) element));
    }

    public <T> void addTest(T element) {
        System.out.println("Adding an element to linked array was made successfully -> "
                + doubleLinkedList.add((Double) element));
    }

    public <T> void addByIndexTest(int index, T element) {
        System.out.println("Adding an element to linked array by index was made successfully -> " + element);
        doubleLinkedList.add(index, (Double) element);
    }

    public void removeByIndexTest(int index) {
        System.out.println("Element remove from linked array by index. Removed element is -> "
                + doubleLinkedList.remove(index));
    }

    public <T> void remove(T element) {
        System.out.println("Element remove from linked array was made successfully -> "
                + doubleLinkedList.remove((Double) element));
    }

    public void print() {
        doubleLinkedList.printElements();
        System.out.println();
    }


}
