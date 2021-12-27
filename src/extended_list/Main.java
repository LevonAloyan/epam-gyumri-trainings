package extended_list;

public class Main {
    public static void main(String[] args) {
        ExtendedList<Integer> extendedList = new ExtendedList<>();
        extendedList.add(2);
        extendedList.add(10);
        extendedList.add(16);
        extendedList.add(32);
        extendedList.add(64);
//        System.out.println(extendedList.map(p -> 2 * p));
//        System.out.println(extendedList.fill(() ->(Math.floorMod(2,3) * 10),10));
//        System.out.println(extendedList.forAll(p -> p % 6 == 0));
        System.out.println(extendedList.partition(p -> p / 10 == 1));
        int sum = extendedList.reduce(Integer::sum, 0);
        System.out.println(sum);
    }
}
