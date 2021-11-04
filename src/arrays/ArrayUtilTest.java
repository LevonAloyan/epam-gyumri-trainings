package arrays;

public class ArrayUtilTest {
    private static final int[] array = new int[]{2, 3, 5};
    public static void main(String[] args) {
        ArrayUtil.createArray(5);
        ArrayUtil.create2dArray(5,5);
        ArrayUtil.addFirst(array, 1);
        System.out.println(ArrayUtil.contains(array, 1));
        System.out.println(ArrayUtil.indexOf(array, 3));
        ArrayUtil.remove(array, 2);
        System.out.println(ArrayUtil.sum(array));
        System.out.println(ArrayUtil.getMax(array));
        System.out.println(ArrayUtil.getAvg(array));
    }
}
