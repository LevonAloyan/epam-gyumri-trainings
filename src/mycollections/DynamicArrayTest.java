package mycollections;

public class DynamicArrayTest {
    private final DynamicArray<Integer> integerDynamicArray = new DynamicArray<>(2);

    public static void main(String[] args) {
        DynamicArrayTest test = new DynamicArrayTest();
        test.indexOfTest(4);
        test.addTest(36);
        test.addTest(35);
        test.addTest(34);
        test.addTest(33);
        test.addByIndexTest(0, null);
        test.containsTest(5);
        test.lastIndexOfTest(3);
        test.getTest(2);
        test.remove(null);
        test.indexOfTest(2);
        test.removeByIndexTest(2);
        System.out.println("________________________________");
    }

    public void sizeTest() {
        System.out.println("Size of dynamic array is -> " + integerDynamicArray.size());
    }

    public void isEmptyTest() {
        System.out.println("Check if dynamic array is empty -> "
                + integerDynamicArray.isEmpty());
    }

    public <T> void containsTest(T element) {
        System.out.println("Dynamic array contains element -> "
                + integerDynamicArray.contains((Integer) element));
    }

    public <T> void indexOfTest(T element) {
        System.out.println("Index of element in dynamic array is -> "
                + integerDynamicArray.indexOf((Integer) element));
    }

    public <T> void lastIndexOfTest(T element) {
        System.out.println("Last index of element in dynamic array is -> "
                + integerDynamicArray.indexOf((Integer) element));
    }

    public void getTest(int index) {
        System.out.println("Get by index from dynamic array -> " + integerDynamicArray.get(index));
    }

    public <T> void set(int index, T element) {
        System.out.println("Set an element by index in dynamic array -> "
                + integerDynamicArray.set(index, (Integer) element));
    }

    public <T> void addTest(T element) {
        System.out.println("Adding an element to dynamic array was made successfully -> "
                + integerDynamicArray.add((Integer) element));
    }

    public <T> void addByIndexTest(int index, T element) {
        System.out.println("Adding an element to dynamic array by index was made successfully -> ");
        integerDynamicArray.add(index, (Integer) element);
    }

    public void removeByIndexTest(int index) {
        System.out.println("Element remove from dynamic array by index. Removed element is -> "
                + integerDynamicArray.remove(index));
    }

    public <T> void remove(T element) {
        System.out.println("Element remove from dynamic array was made successfully -> "
                + integerDynamicArray.remove((Integer) element));
    }

}
