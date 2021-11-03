package arrays;

import java.util.Arrays;

public class ArrayUtilTest {

    public static void main(String[] args) {
        ArrayUtil.createArray(7);
        ArrayUtil.create2dArray(2,2);
        int[]array = {1,2,3,4,5};
        array = ArrayUtil.addFirst(array,0);
        System.out.print(Arrays.toString(array));
        System.out.println(ArrayUtil.contains(array, 5));
        ArrayUtil.remove(array,4);
        System.out.println(ArrayUtil.sum(array));
        System.out.println(ArrayUtil.getMax(array));
        System.out.println(ArrayUtil.getMin(array));
        System.out.println(ArrayUtil.getAvg(array));
    }
}
