package mycollections;


public class DynamicArrayTest {

    public static void main(String[] args) {
        DynamicArray<String> dynamicArray = new DynamicArray<>(3);
        dynamicArray.add("Gugo");
        dynamicArray.add("Hayk");
        dynamicArray.add("Artur");
        System.out.println(dynamicArray.contains("Gugo"));
        dynamicArray.print();
        System.out.println(dynamicArray.indexOf("Hovo"));
        System.out.println(dynamicArray.lastIndexOf("Hovo"));
        System.out.println(dynamicArray.get(2));
        dynamicArray.set(2,"Garik");
        dynamicArray.print();
        dynamicArray.add(2,"Karen");
        dynamicArray.print();
        dynamicArray.remove(3);
        dynamicArray.remove(2);
        dynamicArray.print();
        dynamicArray.remove(0);
        dynamicArray.print();

        DoubleLinkedList<Integer > doubleLinkedList = new DoubleLinkedList<>();
        doubleLinkedList.add(10);
        doubleLinkedList.add(15);
        doubleLinkedList.add(20);
        doubleLinkedList.add(25);
        doubleLinkedList.add(30);
        System.out.println(doubleLinkedList.size());
        System.out.println(doubleLinkedList.isEmpty());
        System.out.println(doubleLinkedList.contains(10));
        System.out.println(doubleLinkedList.indexOf(15));
        System.out.println(doubleLinkedList.lastIndexOf(20));
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
















