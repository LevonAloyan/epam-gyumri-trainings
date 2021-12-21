package mycollections;




public class DynamicArrayTest {
    DynamicArray<String> dA = new DynamicArray<>();

    public static void main(String[] args) throws Exception {
        DynamicArrayTest dT = new DynamicArrayTest();
        dT.sizeTest();
        dT.isEmptyTest();
        dT.addTest();
        dT.sizeTest();
        dT.isEmptyTest();
        dT.indexOfTest("12");
        dT.lastIndexOfTest("12");
        dT.containsTest("4");
        dT.sizeTest();
        dT.addByIndexTest(2, "24");
        dT.sizeTest();
        dT.remove("6");
        dT.print();
        dT.removeByIndexTest(2);
        dT.print();
        dT.set(4, "222");
        dT.print();
        dT.removeAll();
        dT.print();
        dT.isEmptyTest();
    }


    public void sizeTest() {
        System.out.println("Dynamic Array size: " + dA.size());
        System.out.println("**************");
    }

    public void isEmptyTest() {
        System.out.println("Array is empty: " + dA.isEmpty());
        System.out.println("**************");
    }

    public void containsTest(String element) {
        System.out.println("Element: " + element);
        System.out.println("Contains: " + dA.contains(element));
        System.out.println("**************");
    }

    public void indexOfTest(String element) {
        System.out.println("Element: " + element);
        System.out.println("IndexOf: " + dA.indexOf(element));
        System.out.println("**************");
    }

    public void lastIndexOfTest(String element) {
        System.out.println("Element: " + element);
        System.out.println("LastIndexOf: " + dA.lastIndexOf(element));
        System.out.println("**************");
    }

    public void getTest(int index) throws Exception {
        System.out.println("Get: " + dA.get(index));
        System.out.println("**************");

    }

    public void set(int index, String element) throws Exception {
        System.out.println("Ex Element: " + dA.get(index));
        System.out.println("Change Element: " + " Index-" + index + " Element-" + element);
        System.out.println("Set: " + dA.set(index, element));
        System.out.println("**************");

    }

    public void addTest() {
        dA.add("12");
        dA.add("2");
        dA.add("4");
        dA.add("12");
        dA.add("6");
        dA.add("6");
        dA.add("12");
        System.out.println(dA.toString());
        System.out.println("**************");
    }

    public void addByIndexTest(int index, String element) {
        dA.add(index, element);
        System.out.println("Index: " + index + " / New Element: " + element);
        System.out.println("Add new element: " + dA.toString());
        System.out.println("**************");
    }

    public void removeByIndexTest(int index) throws Exception {
        System.out.println("Remove index: " + index);
        System.out.println("Remove Element: " + dA.remove(index));
        System.out.println("**************");
    }

    public void remove(String element) throws Exception {
        System.out.println("Remove Element: " + element);
        System.out.println("Remove: " + dA.remove(element));
        System.out.println("**************");
    }

    public void print() {
        System.out.println("Print Array: " + dA.toString());
        System.out.println("**************");
    }

    public void removeAll() {
        System.out.println("Remove All: ");
        dA.removeAll();
        System.out.println("**************");
    }
}
