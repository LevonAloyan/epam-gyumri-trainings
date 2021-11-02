package arrays;

import java.util.Arrays;

public class ArrayUtilTest {

    public static void main(String[] args) {

        int[] array = {1, 2, 3, 511};

        ArrayUtil.createArray(10);
        ArrayUtil.create2dArray(3, 5);
        System.out.println(Arrays.toString(ArrayUtil.addFirst(array, 7)));
        System.out.println(ArrayUtil.contains(array, 4));
        System.out.println(ArrayUtil.indexOf(array, 1));
        ArrayUtil.remove(array, 1);
        System.out.println(ArrayUtil.sum(array));
        System.out.println(ArrayUtil.getMax(array));
        System.out.println(ArrayUtil.getMin(array));
        System.out.println(ArrayUtil.getAvg(array));
    }
}
