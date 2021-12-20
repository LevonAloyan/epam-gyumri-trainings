package mycollections;


public class DynamicArrayTest {

    private static DynamicArray<Integer> dynamicArray = new DynamicArray<>();

    public static void main(String[] args) {
        addTest();
        sizeTest();
        isEmptyTest();
        containsTest();
        indexOfTest();
        lastIndexOfTest();
        getTest();
        set(1,5);
        addByIndexTest();


    }

    public static void sizeTest() {
        //TODO change body of implemented methods
        System.out.println("Dynamic array size is: " + dynamicArray.size());

    }

    public static void isEmptyTest() {
        //TODO: change body of implemented methods
        System.out.println("Array is empty: " + dynamicArray.isEmpty());

    }

    public static void containsTest() {
        //TODO: change body of implemented methods

        System.out.println("Array contains of 7: " + dynamicArray.contains(6));

    }

    public static void indexOfTest() {
        //TODO: change body of implemented methods

        System.out.println("Index of that element: " + dynamicArray.indexOf(8));

    }

    public static void lastIndexOfTest() {
        //TODO: change body of implemented methods
        System.out.println("Last index of that element: " + dynamicArray.lastIndexOf(4));

    }

    public static void getTest() {
        //TODO: change body of implemented methods


        System.out.println("The element at the specified position in this list: " + dynamicArray.get(6));

    }

    public static void set(int index, Integer element) {
        //TODO: change body of implemented methods
        System.out.println("The element previously at the specified position: " + dynamicArray.set(index, element));

    }

    public static void addTest() {
        //TODO: change body of implemented methods
        System.out.println(dynamicArray.add(6));
        System.out.println(dynamicArray.add(4));
        System.out.println(dynamicArray.add(36));
        System.out.println(dynamicArray.add(30));
        System.out.println(dynamicArray.add(12));
        System.out.println(dynamicArray.add(29));
        System.out.println(dynamicArray.add(8));
        System.out.println(dynamicArray.add(15));
        System.out.println(dynamicArray.add(71));
        System.out.println(dynamicArray.add(24));

        System.out.println();
    }

    public static void addByIndexTest() {
        //TODO: change body of implemented methods
        System.out.println("Add an element to the mass by index");
        dynamicArray.add(11, 91);

    }

    public static void removeByIndexTest() {
        //TODO: change body of implemented methods

    }

    public static void remove() {
         //TODO: change body of implemented methods

    }

}
