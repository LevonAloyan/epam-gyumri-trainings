package mycollections;


public class DynamicArrayTest {

    public static DynamicArray<Integer> dynamicArray = new DynamicArray<>();

    public static void main(String[] args) {
        sizeTest();
        isEmptyTest();
        addTest();
        lastIndexOfTest();
        removeByIndexTest();
        remove();
        getTest();
        indexOfTest();
        containsTest();
        addByIndexTest();



    }

    public static void sizeTest() {
        System.out.println("Array size is " + dynamicArray.size());
    }

    public static  void isEmptyTest() {
        System.out.println("Array is empty: " + dynamicArray.isEmpty());
    }

    public static  void containsTest() {
        System.out.println("Array is contains of 15" + dynamicArray.contains(15));
    }

    public static void indexOfTest() {
        System.out.println("The indexOf 15 is " + dynamicArray.indexOf(15));
    }

    public static  void lastIndexOfTest() {
        System.out.println("The indexOf 15 is " + dynamicArray.indexOf(15));
    }

    public static void getTest() {
        System.out.println("Тhe element position is: " + dynamicArray.get(16));
    }

    public static void set(int index, Integer element) {
        System.out.println(dynamicArray.set(4, 65));
    }

    public static void addTest() {
        System.out.println(dynamicArray.add(15));
        System.out.println(dynamicArray.add(0));
        System.out.println(dynamicArray.add(26));
        System.out.println(dynamicArray.add(-10));
        System.out.println(dynamicArray.add(16));
        System.out.println(dynamicArray.add(15));
        System.out.println(dynamicArray.add(24));
        System.out.println(dynamicArray.add(60));
        System.out.println(dynamicArray.add(8));
    }

    public static void addByIndexTest() {
        dynamicArray.add(2, 30);
        dynamicArray.add(3, 300);
    }

    public static void removeByIndexTest() {
        System.out.println(dynamicArray.remove(4));
    }

    public static void remove() {
        System.out.println(dynamicArray.remove(5));

    }

}

