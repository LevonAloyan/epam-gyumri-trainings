package arrays;

import java.util.Arrays;

public class ArrayUtilTest {

    public static void main(String[] args) {
        int[] array = {23,12,21,34,54,65,43,12,11,12,1,9};
        ArrayUtil.createArray(6);
        ArrayUtil.create2dArray(2, 2);
        System.out.println("AddFirst " +Arrays.toString(ArrayUtil.addFirst(array, 550)));
        System.out.println("Contains " + ArrayUtil.contains(array, 865));
        System.out.println("IndexOf " + ArrayUtil.indexOf(array, 5));
        ArrayUtil.remove(array, 2);
        System.out.println("Sum " + ArrayUtil.sum(array));
        System.out.println("GetMax " + ArrayUtil.getMax(array));
        ArrayUtil.getMin(array);
        System.out.println("Avg " + ArrayUtil.getAvg(array));
    }
}
