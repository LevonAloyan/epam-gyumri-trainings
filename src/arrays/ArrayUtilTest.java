package arrays;

import java.util.Arrays;

public class ArrayUtilTest {

    public static void main(String[] args) {
        ArrayUtil.createArray(5);
        ArrayUtil.create2dArray(2,3);
        int[] arrayValues = {0,1,2,3,4,5,6,7};
        System.out.println(Arrays.toString(arrayValues));
        System.out.println(ArrayUtil.indexOf(arrayValues, 3));
        System.out.println(ArrayUtil.contains(arrayValues,4));
        System.out.println(ArrayUtil.sum(arrayValues));
        System.out.println(ArrayUtil.getMax(arrayValues));
        System.out.println(ArrayUtil.getMin(arrayValues));
        System.out.println(ArrayUtil.getAvg(arrayValues));
        arrayValues = ArrayUtil.addFirst(arrayValues,3);
        ArrayUtil.remove(arrayValues, -5);
    }
}
