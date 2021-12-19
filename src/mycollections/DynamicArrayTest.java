package mycollections;


public class DynamicArrayTest {
    private final DynamicArray <Integer> mDynamicArrayImplementation
            = new DynamicArray<>();
    private final DynamicArray <String> mStringDynamicArrayImplementation
            = new DynamicArray<>();
    private final DynamicArray <Character> mCharDynamicArrayImplementation
            = new DynamicArray<>();

    public static void main(String[] args) {
        DynamicArrayTest dynamicArrayTest = new DynamicArrayTest();
        dynamicArrayTest.addTest();
        dynamicArrayTest.isEmptyTest();
        dynamicArrayTest.containsTest();
        dynamicArrayTest.indexOfTest();
        dynamicArrayTest.lastIndexOfTest();
        dynamicArrayTest.addByIndexTest(2, 20);
        dynamicArrayTest.set(2, 20);
        dynamicArrayTest.getTest();
        dynamicArrayTest.removeByIndexTest();
        dynamicArrayTest.sizeTest();
        dynamicArrayTest.clear();

    }

    public void sizeTest() {
        int size = mDynamicArrayImplementation.size();
        System.out.println("size " + size);
    }

    public void isEmptyTest() {
        boolean isEmpty = mDynamicArrayImplementation.isEmpty();
        System.out.println("is empty " + isEmpty);
    }

    public void containsTest() {
        boolean contains = mDynamicArrayImplementation.contains(10);
        System.out.println("contains " + contains);
    }

    public void indexOfTest() {
        int index = mCharDynamicArrayImplementation.indexOf('%');
        System.out.println("indexOf " + index);
        index = mCharDynamicArrayImplementation.indexOf('&');
        System.out.println("indexOf " + index);
        index = mDynamicArrayImplementation.indexOf(18);
        System.out.println("indexOf " + index);
    }

    public void lastIndexOfTest() {
        int lastIndex = mDynamicArrayImplementation.lastIndexOf(20);
        System.out.println("lastIndexOf " + lastIndex);
    }

    public void getTest() {
        // int getInt = mDynamicArrayImplementation.get(2);
        // char getChar  = mCharDynamicArrayImplementation.get(0);
        String getString = mStringDynamicArrayImplementation.get(0);
        System.out.println("get " + getString);
    }

    public <T> void set(int index, T element) {
        // int set = mDynamicArrayImplementation.set(2, 0);
        char set = mCharDynamicArrayImplementation.set(1, (char) 0);
        System.out.println("set " + set);
    }

    public boolean addTest() {
        mStringDynamicArrayImplementation.add("string");
        mCharDynamicArrayImplementation.add('%');
        mDynamicArrayImplementation.add(15);
        mDynamicArrayImplementation.add(20);
        mStringDynamicArrayImplementation.add("string");
        mDynamicArrayImplementation.add(18);
        mCharDynamicArrayImplementation.add('&');
        mDynamicArrayImplementation.add(20);
        return true;
    }

    public <T> void addByIndexTest(int index, T element) {
        mStringDynamicArrayImplementation.add(0,"Hello");
    }

    public void removeByIndexTest() {
        int removedElement = mDynamicArrayImplementation.remove(0);
        System.out.println("remove " + removedElement);
    }

    public void clear() {
        mDynamicArrayImplementation.clear();
    }
}