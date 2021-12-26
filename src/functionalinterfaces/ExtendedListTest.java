package functionalinterfaces;

public class ExtendedListTest {
    public static void main(String[] args) {
        ExtendedList<Integer> extendedList = new ExtendedList<>();

        extendedList.add(1);
        extendedList.add(2);
        extendedList.add(3);
        extendedList.add(4);
        extendedList.add(5);
        extendedList.add(6);
        extendedList.add(7);
        extendedList.add(8);
        extendedList.add(9);

        System.out.println(extendedList.map(extendedList, x -> x * x));
        System.out.println(extendedList.forAll(extendedList, x -> x > 0));
        System.out.println(extendedList.partition(extendedList, x -> x % 2 == 0));
        System.out.println(extendedList.reduce(extendedList, Integer::sum, 0));
        System.out.println(extendedList.fill(() -> (int) (Math.random() * 100)));
    }
}
