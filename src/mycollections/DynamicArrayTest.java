package mycollections;


public class DynamicArrayTest {

    static DynamicArray<String> DArray = new DynamicArray<>();
    static DynamicArray<String> DArrayInitCapacity = new DynamicArray<>(20);


    public static void main(String[] args) {

        isEmptyTest();
        sizeTest();

        addTest();
        addByIndexTest();
        System.out.println(DArray);

        isEmptyTest();
        sizeTest();
        System.out.println("isEmpty (() and size() after adding");

        containsTest();
        indexOfTest();
        lastIndexOfTest();
        getTest();
        setTest(3,5);
        System.out.println("after set()");

        removeByIndexTest();
        System.out.println("after remove(INDEX)");
        remove();

    }

    public static void sizeTest() {
        //TODO change body of implemented methods
        System.out.println(DArray.size());
    }

    public static void isEmptyTest() {
        //TODO: change body of implemented methods
        System.out.println(DArray.isEmpty());
    }

    public static void containsTest() {
        //TODO: change body of implemented methods
        System.out.println(DArray.contains("contains"));
    }

    public static void indexOfTest() {
        //TODO: change body of implemented methods
        System.out.println(DArray.indexOf("indexOf"));

    }

    public static void lastIndexOfTest() {
        //TODO: change body of implemented methods
        System.out.println(DArray.lastIndexOf("lastIndex"));
    }

    public static void getTest() {
        //TODO: change body of implemented methods
        System.out.println(DArray.get(1));
    }

    public static void setTest(int index, Integer element) {
        //TODO: change body of implemented methods
        System.out.println(DArray.set(index, "set"+element));
    }

    public static void addTest() {
        //TODO: change body of implemented methods
        System.out.println(DArray.add("a"));
        for (int i = 0; i < 5; i++) {
            DArray.add("" + i);
        }
        DArray.add("lastIndex");
        DArray.add("indexOf");
        DArray.add("contains");
        DArray.add("lastIndex");
        DArray.add("indexOf");

    }

    public static void addByIndexTest() {
        //TODO: change body of implemented methods
        DArray.add(0, "new a");
    }

    public static void removeByIndexTest() {
        //TODO: change body of implemented methods
        System.out.println(DArray.remove(0));
    }

    public static void remove() {
        //TODO: change body of implemented methods
        System.out.println(DArray.remove("4"));
    }
}
