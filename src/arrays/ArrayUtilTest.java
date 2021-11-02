package arrays;

public class ArrayUtilTest {

    public static void main(String[] args) {

        ArrayUtil.createArray(10);
        ArrayUtil.create2dArray(5, 6);
        ArrayUtil.addFirst(new int[] {4, 5, 9, 10, 15, 20}, 16 );
        System.out.println(ArrayUtil.contains(new int[]{10, 20, 25, 30, 45}, 0));
        System.out.println(ArrayUtil.indexOf(new int[]{12, 25, 11, 0, -10, 20, 25}, -15));
        ArrayUtil.remove(new int[]{11, 25, 65, 98, 16, 3, 4}, 2);
        System.out.println(ArrayUtil.sum(new int[]{1, 2, 0, 3, 4}));
        System.out.println(ArrayUtil.getMax(new int[]{1, 2, 0, 99, -5, 0, 3, 4}));
        ArrayUtil.getMin(new int[]{1, 2, 0, 99, -5, 0, 3, 4});
        System.out.println(ArrayUtil.getAvg(new int[]{1, 2, 3, 4, 20}));

    }
}
