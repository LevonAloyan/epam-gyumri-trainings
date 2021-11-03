package arrays;

import java.util.Arrays;

public class ArrayUtilTest {

    public static void main(String[] args) {
        ArrayUtil.createArray(7);
        ArrayUtil.create2dArray(3,4);
        int[] array = new  int[5];
        array = ArrayUtil.addFirst(array,4);
        System.out.println(Arrays.toString(array));
        System.out.println(ArrayUtil.contains(array,4));
        System.out.println(ArrayUtil.indexOf(array,0));
        ArrayUtil.remove(array,4);
        System.out.println(ArrayUtil.sum(array));
        System.out.println(ArrayUtil.getMax(array));
        ArrayUtil.getMin(array);
        System.out.println(ArrayUtil.getAvg(array));
    }
}
