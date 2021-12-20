package mycollections;

public class DynamicArrayTest {
    private static DynamicArray<Integer> dynamicArray = new DynamicArray<>();

    public static void main(String[] args) {


        System.out.println("Dynamic Array Test ");
        addTest();
        sizeTest();
        containsTest();
        removeByIndexTest();
        getTest();
        lastIndexOfTest();
        indexOfTest();
        addByIndexTest();
        set(0, 9);
        remove();
        isEmptyTest();

    }

    public static void sizeTest() {
        System.out.println("Dynamic array size is - " + dynamicArray.size());
        System.out.println();
    }

    public static void isEmptyTest() {
        System.out.println("Array is empty - " + dynamicArray.isEmpty());
        System.out.println();
    }

    public static void containsTest() {
        System.out.println("Array contains of 7 - " + dynamicArray.contains(7));
        System.out.println();
    }

    public static void indexOfTest() {
        System.out.println("Index of that element - " + dynamicArray.indexOf(4));
        System.out.println();
    }

    public static void lastIndexOfTest() {
        System.out.println("Last index of that element - " + dynamicArray.lastIndexOf(4));
        System.out.println();
    }

    public static void getTest() {
        System.out.println("The element at the specified position in this list - " + dynamicArray.get(5));
        dynamicArray.print();
        System.out.println();
    }

    public static void set(int index, Integer element) {
        System.out.println("The element previously at the specified position - " + dynamicArray.set(index, element));
        dynamicArray.print();
        System.out.println();
    }

    public static void addTest() {
        System.out.println(dynamicArray.add(9));
        System.out.println(dynamicArray.add(8));
        System.out.println(dynamicArray.add(68));
        System.out.println(dynamicArray.add(4));
        System.out.println(dynamicArray.add(1));
        System.out.println(dynamicArray.add(4));
        System.out.println(dynamicArray.add(18));
        System.out.println(dynamicArray.add(4));
        System.out.println(dynamicArray.add(7));
        System.out.println(dynamicArray.add(21));
        dynamicArray.print();
        System.out.println();
    }

    public static void addByIndexTest() {
        System.out.println("Add an element to the mass by index");
        dynamicArray.add(11, 15);
        dynamicArray.print();
        System.out.println();
    }

    public static void removeByIndexTest() {
        System.out.println("Remove by index - " + dynamicArray.removeByIndex(2));
        dynamicArray.print();
        System.out.println();
    }

    public static void remove() {
        System.out.println("Remove element 4 - " + dynamicArray.remove(4));
        dynamicArray.print();
        System.out.println();
    }
}
