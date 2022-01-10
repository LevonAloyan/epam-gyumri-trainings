package mycollections;


public class DynamicArrayTest {
    static DynamicArray<Integer> integerDynamicArray = new DynamicArray<>();

    public static void main(String[] args) {
        //        DynamicArrayTest dynamicArrayTest = new DynamicArrayTest();
        DynamicArray<Integer> dynamicArray = new DynamicArray<>();
        System.out.println(dynamicArray.isEmpty());
        System.out.println(dynamicArray.size());
        dynamicArray.add(5);
        dynamicArray.add(65);
        dynamicArray.add(7);
        dynamicArray.add(97);
        dynamicArray.add(23);
        dynamicArray.add(34);
        dynamicArray.printList();
        dynamicArray.add(2, 5439);
        dynamicArray.printList();
        System.out.println(dynamicArray.isEmpty());
        System.out.println(dynamicArray.size());
        System.out.println(dynamicArray.contains(65));
        System.out.println(dynamicArray.indexOf(23));
        dynamicArray.set(0, 465);
        dynamicArray.printList();
        System.out.println(dynamicArray.get(4));
        System.out.println(dynamicArray.remove(dynamicArray.get(4)));
        dynamicArray.printList();

//        dynamicArrayTest.isEmptyTest();
//        dynamicArrayTest.sizeTest();
////        dynamicArrayTest.addByIndexTest();
//        dynamicArrayTest.addTest();
////        dynamicArrayTest.addByIndexTest();
//
//        dynamicArrayTest.containsTest();
//        dynamicArrayTest.indexOfTest();
//        dynamicArrayTest.lastIndexOfTest();
//        dynamicArrayTest.getTest();
//        dynamicArrayTest.set(2, 6);
//        System.out.println("After set method.");

    }

    public void sizeTest() {
        System.out.println(integerDynamicArray.size());
    }

    public void isEmptyTest() {
        System.out.println(integerDynamicArray.isEmpty());
    }

    public void containsTest() {
        System.out.println(integerDynamicArray.contains(6));
    }

    public void indexOfTest() {
        System.out.println(integerDynamicArray.indexOf(0));
    }

    public void lastIndexOfTest() {
        System.out.println(integerDynamicArray.lastIndexOf(0));
    }

    public void getTest() {
        System.out.println(integerDynamicArray.get(2));
    }

    public void set(int index, Integer element) {
        System.out.println(integerDynamicArray.set(index, element));
    }

    public void addTest() {
        System.out.println(integerDynamicArray.add(6));
        System.out.println(integerDynamicArray.add(9));
        System.out.println(integerDynamicArray.add(54));
    }

    public void addByIndexTest() {
        integerDynamicArray.add(0, 9);
    }

    public void removeByIndexTest() {
        System.out.println(integerDynamicArray.remove(7));
    }

    public void remove() {
        System.out.println(integerDynamicArray.remove(67));
    }

}
