package arrays;

import java.util.Arrays;

public class ArrayUtilTest {

    public static void main(String[] args) {
        int[] array = {1,2,3,4,5,6,7,8,9,10};
        ArrayUtil.createArray(2);
        ArrayUtil.create2dArray(1, 2);
        System.out.println(Arrays.toString(ArrayUtil.addFirst(array, 0)));
        System.out.println(ArrayUtil.contains(array, 5));
        System.out.println(ArrayUtil.indexOf(array, 4));
        ArrayUtil.remove(array, 6);
        System.out.println(ArrayUtil.sum(array));
        System.out.println(ArrayUtil.getMax(array));
        System.out.println(ArrayUtil.getMin(array));
        System.out.println(ArrayUtil.getAvg(array));
    }
}