package mycollections;

public class DynamicArrayTest {

    static DynamicArray<String> dynamicArray = new DynamicArray<>();

    public static void main(String[] args) {

        addTest();
        System.out.println(dynamicArray);
        sizeTest();
        isEmptyTest();
        System.out.println(dynamicArray);
        sizeTest();

    }


    public static void sizeTest() {
        System.out.println(dynamicArray.size());
    }

    public static void isEmptyTest() {
        System.out.println(dynamicArray.isEmpty());
    }

    public static void containsTest() {
        System.out.println(dynamicArray.contains("12"));
    }

    public static void indexOfTest() {
        System.out.println(dynamicArray.indexOf("20"));
    }

    public static void lastIndexOfTest() {
        System.out.println(dynamicArray.lastIndexOf("20"));
    }

    public static void getTest() {
        System.out.println(dynamicArray.get(2));
    }

    public static void set(int index, String element) {
        System.out.println(dynamicArray.set(index, element));
    }

    public static void addTest() {
        dynamicArray.add("12");
        dynamicArray.add("20");
        dynamicArray.add("7");
        dynamicArray.add("20");
        dynamicArray.add("16");
        dynamicArray.add("20");
    }

    public static void addByIndexTest() {
        dynamicArray.add(3, "12");
    }

    public static void removeByIndexTest() {
        System.out.println(dynamicArray.remove(4));
    }

    public static void remove() {
        System.out.println(dynamicArray.remove("20"));
    }
}
