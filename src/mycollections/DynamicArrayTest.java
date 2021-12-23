package mycollections;


public class DynamicArrayTest {

    static DynamicArray<Integer> dynamicArray = new DynamicArray<>();

    public static void main(String[] args) {

        DoubleLinkedList<Integer> integerDoubleLinkedList= new DoubleLinkedList<>();
//        integerDoubleLinkedList.add(5);
//        integerDoubleLinkedList.add(10);
//        integerDoubleLinkedList.add(15);
//        integerDoubleLinkedList.add(10);
//        integerDoubleLinkedList.add(8);
//        System.out.println(integerDoubleLinkedList.size());
//        System.out.println(integerDoubleLinkedList.isEmpty());
//        System.out.println(integerDoubleLinkedList.contains(5));
//        System.out.println(integerDoubleLinkedList.indexOf(10));
//        System.out.println(integerDoubleLinkedList.lastIndexOf(10));
//        System.out.println(integerDoubleLinkedList.set(2,60));
//        System.out.println(integerDoubleLinkedList.remove(0));
//        System.out.println(integerDoubleLinkedList.add(10));
//        System.out.println(integerDoubleLinkedList.remove(15));

        sizeTest();
//        isEmptyTest();
//        containsTest();
//        indexOfTest();
//        lastIndexOfTest();
//        getTest();
//        set(1, 9);
//        addTest();
//        addByIndexTest();
//        remove();
//        removeByIndexTest();
    }

    public static void sizeTest() {
        System.out.println(dynamicArray.size());
    }

    public static void isEmptyTest() {
        System.out.println(dynamicArray.isEmpty());
    }

    public static void containsTest() {
        System.out.println(dynamicArray.contains(2));
    }

    public static void indexOfTest() {
        System.out.println(dynamicArray.indexOf(2));
    }

    public static void lastIndexOfTest() {
        System.out.println(dynamicArray.lastIndexOf(2));
    }

    public static void getTest() {
        System.out.println(dynamicArray.get(0));
    }

    public static void set(int index, Integer element) {
        System.out.println(dynamicArray.set(index, element));
    }

    public static void addTest() {
        System.out.println(dynamicArray.add(1));
    }

    public static void addByIndexTest() {
        dynamicArray.add(1, 3);
    }

    public static void removeByIndexTest() {
        System.out.println(dynamicArray.remove(1));
    }

    public static void remove() {
        System.out.println(dynamicArray.remove(8));
    }

}
