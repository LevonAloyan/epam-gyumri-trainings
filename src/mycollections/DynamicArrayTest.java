package mycollections;


public class DynamicArrayTest {
//static DoubleLinkedList<Integer> integerDoubleLinkedList = new DoubleLinkedList<>();

    public static void main(String[] args) {
        DynamicArray<String> dynamicArray = new DynamicArray<>(3);
        dynamicArray.add("Gugo");
        dynamicArray.add("Hayk");
        dynamicArray.add("Hovo");
        dynamicArray.add("Hovo");
//        System.out.println(dynamicArray.contains("Hovo"));
//        dynamicArray.print();
//        System.out.println(dynamicArray.indexOf("Hovo"));
//        System.out.println(dynamicArray.lastIndexOf("Hovo"));
//        System.out.println(dynamicArray.get(2));
//        dynamicArray.set(2,"Garik");
//        dynamicArray.print();
//        dynamicArray.add(2,"Karen");
//        dynamicArray.print();
//        dynamicArray.remove(3);
//        dynamicArray.remove(2);
//        dynamicArray.print();
        dynamicArray.remove(0);
        dynamicArray.print();

        DoubleLinkedList<Integer> integerDoubleLinkedList= new DoubleLinkedList<>();
        integerDoubleLinkedList.add(5);
        integerDoubleLinkedList.add(10);
        integerDoubleLinkedList.add(15);
        integerDoubleLinkedList.add(10);
        integerDoubleLinkedList.add(8);
        System.out.println(integerDoubleLinkedList.size());
        System.out.println(integerDoubleLinkedList.isEmpty());
        System.out.println(integerDoubleLinkedList.contains(5));
        System.out.println(integerDoubleLinkedList.indexOf(10));
        System.out.println(integerDoubleLinkedList.lastIndexOf(10));
        System.out.println(integerDoubleLinkedList.set(2,60));
        System.out.println(integerDoubleLinkedList.remove(0));
        System.out.println(integerDoubleLinkedList.add(10));
        System.out.println(integerDoubleLinkedList.remove(15));


    }

    public void sizeTest() {
        //TODO change body of implemented methods
    }

    public void isEmptyTest() {
        //TODO: change body of implemented methods
    }

    public void containsTest() {
        //TODO: change body of implemented methods
    }

    public void indexOfTest() {
        //TODO: change body of implemented methods
    }

    public void lastIndexOfTest() {
        //TODO: change body of implemented methods
    }

    public void getTest() {
        //TODO: change body of implemented methods
    }

    public void set(int index, Integer element) {
        //TODO: change body of implemented methods
    }

    public void addTest() {
        //TODO: change body of implemented methods
    }

    public void addByIndexTest() {
        //TODO: change body of implemented methods
    }

    public void removeByIndexTest() {
        //TODO: change body of implemented methods
    }

    public void remove() {
        //TODO: change body of implemented methods
    }

}
