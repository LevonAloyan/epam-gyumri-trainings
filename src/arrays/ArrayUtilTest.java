package arrays;

public class ArrayUtilTest {

    public static void main(String[] args) {
        ArrayUtil.createArray(6);
        ArrayUtil.create2dArray(3,5);
        int[] na = ArrayUtil.addFirst(new int[]{1,2,3},9);
        boolean num = ArrayUtil.contains(new int[] { 3}, 9);
        long number = ArrayUtil.sum( new int [] { 6,7,8});
        int maximum = ArrayUtil.getMax(new int[] {6,7,8});
        int minimum = ArrayUtil.getMin( new int[] {6,7,8});
        int average = ArrayUtil.getAvg(new int [] {6,7,8});


    }
}
