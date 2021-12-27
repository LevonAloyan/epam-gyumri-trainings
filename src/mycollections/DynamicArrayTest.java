package mycollections;


public class DynamicArrayTest {
    DynamicArray<Integer> dynamicArray = new DynamicArray<>();

    public static void main(String[] args) {

        DynamicArrayTest dynamicArrayTest = new DynamicArrayTest();
        dynamicArrayTest.addTest();
        dynamicArrayTest.isEmptyTest();
        dynamicArrayTest.containsTest();
        dynamicArrayTest.indexOfTest();
        dynamicArrayTest.lastIndexOfTest();
        dynamicArrayTest.getTest();
        dynamicArrayTest.set(10, 2);
        dynamicArrayTest.addByIndexTest(10, 2);
        dynamicArrayTest.removeByIndexTest();
        dynamicArrayTest.sizeTest();
        dynamicArrayTest.clear();

    }

    public void sizeTest() {
        int size = dynamicArray.size();
        System.out.println("size" + size);
    }


    public void isEmptyTest() {
        boolean isEmptyTest = dynamicArray.isEmpty();
        System.out.println("is empty" + isEmptyTest);

    }

    public void containsTest() {
        boolean contains = dynamicArray.contains(10);
        System.out.println("contains" + contains);
    }

    public void indexOfTest() {
        int index = (int) dynamicArray.indexOf(10);
        System.out.println("indexOf" + index);
    }

    public void lastIndexOfTest() {
        int lastIndexof = (int) dynamicArray.lastIndexOf(10);
        System.out.println("lastIndexOf" + lastIndexof);
    }

    public void getTest() {
        int get = (int) dynamicArray.get(0);
        System.out.println("get " + get);
    }

    public void set(int index, Integer element) {
        dynamicArray.set(index, element);
    }

    public void addTest() {
        dynamicArray.add(10);
        dynamicArray.add(10);
        dynamicArray.add(6);
        dynamicArray.add(5);
        dynamicArray.add(7);

    }

    public void addByIndexTest(int index, int element) {
        dynamicArray.add(index, element);
    }

    public void removeByIndexTest() {
        int removedEelement = dynamicArray.remove(2);
        System.out.println("remove" + removedEelement);
    }

    public void clear() {
        dynamicArray.clear();
    }
}
