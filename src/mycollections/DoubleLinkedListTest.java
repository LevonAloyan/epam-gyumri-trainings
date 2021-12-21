package mycollections;

public class DoubleLinkedListTest {
    private  static DoubleLinkedList<Integer> myLinkedList = new DoubleLinkedList<>();

        public static void main(String[] args) {
            System.out.println("LinkedList Test ");
            isEmptyTest();
            addTest();
            isEmptyTest();
            myLinkedList.print();
            sizeTest();
            addByIndexTest();
            myLinkedList.print();
            sizeTest();
            indexOfTest();
            lastIndexOfTest();
            containsTest();
            myLinkedList.print();
            System.out.println();
            remove();
            myLinkedList.print();
            System.out.println();
            getTest();
            removeByIndexTest();
            myLinkedList.print();
            System.out.println();
            set(3, 77);
            myLinkedList.print();
            System.out.println();
        }

        public static void sizeTest() {
            System.out.println("Dynamic array size is - " + myLinkedList.size());
            System.out.println();
        }

        public static void isEmptyTest() {
            System.out.println("Array is empty - " + myLinkedList.isEmpty());
            System.out.println();
        }

        public static void containsTest() {
            System.out.println("Array contains of 17 - " + myLinkedList.contains(17));
            System.out.println();
        }

        public static void indexOfTest() {
            System.out.println("Index of that element - " + myLinkedList.indexOf(6));
            System.out.println();
        }

        public static void lastIndexOfTest() {
            System.out.println("Last index of that element - " + myLinkedList.lastIndexOf(3));
            System.out.println();
        }

        public static void getTest() {
            System.out.println("The element at the specified position in this list - " + myLinkedList.get(2));
        }

        public static void set(int index, Integer element) {
            System.out.println("The element previously at the specified position - " + myLinkedList.set(index, element));
        }

        public static void addTest() {
            System.out.println(myLinkedList.add(3));
            System.out.println(myLinkedList.add(6));
            System.out.println(myLinkedList.add(7));
            System.out.println(myLinkedList.add(1));
            System.out.println(myLinkedList.add(0));
            System.out.println(myLinkedList.add(3));
            System.out.println(myLinkedList.add(8));
            System.out.println(myLinkedList.add(11));
            System.out.println(myLinkedList.add(17));
            System.out.println(myLinkedList.add(3));
            System.out.println();
        }

        public static void addByIndexTest() {
            System.out.println("Add by index");
            myLinkedList.add(6, 22);
        }

        public static void removeByIndexTest() {
            System.out.println("Remove by index - " + myLinkedList.removeByIndex(1));
        }

        public static void remove() {
            System.out.println("Remove element 11 - " + myLinkedList.remove(11));
        }
}
