package mycollections;

public class DoubleLinkedArrayTest {
    private final DoubleLinkedList<Double> doubleLinkedList = new DoubleLinkedList<>();

    public static void main(String[] args) {
        DoubleLinkedArrayTest test = new DoubleLinkedArrayTest();
        test.isEmptyTest();
        test.linkLast(5.77);
        test.containsTest(5.77);
        test.linkFirst(2.5);
        test.addTest(4.7);
        test.addTest(2.7);
        test.linkLast(5.6);
        test.addTest(4.7);
        test.addTest(4.7);
        test.addByIndexTest(1,45.6);
        test.set(3,33.3);
        test.indexOfTest(3.33);
        test.lastIndexOfTest(4.7);
        test.sizeTest();
        test.remove(45.6);
        test.removeByIndexTest(1);
        test.getTest(0);
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
                + doubleLinkedList.indexOf((Double) element));
    }

    public void getTest(int index) {
        System.out.println("Get by index from linked array -> " + doubleLinkedList.get(index));
    }

    public <T> void set(int index, T element) {
        System.out.println("Set an element by index in linked array -> "
                + doubleLinkedList.set(index,(Double) element));
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

    public <T> void linkFirst (T element) {
        System.out.println("Linking element to the first position -> " + element);
        doubleLinkedList.linkFirst((Double) element);
    }

    public <T> void linkLast (T element) {
        System.out.println("Linking element to the last position -> " + element);
        doubleLinkedList.linkLast((Double) element);
    }

    public void print () {
        doubleLinkedList.printLinkedArray();
        System.out.println();
    }

}
