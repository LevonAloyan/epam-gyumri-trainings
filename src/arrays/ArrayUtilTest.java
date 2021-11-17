package arrays;

import java.util.Arrays;

public class ArrayUtilTest {

    public static void main(String[] args) {
        int[] array = {0,1,2,3,4,5,6,7,8,9};

        ArrayUtil.createArray(5);
        ArrayUtil.create2dArray(5, 7);
        System.out.println(Arrays.toString(ArrayUtil.addFirst(array, 2)));
        System.out.println(ArrayUtil.contains(array, 22 ));
        System.out.println(ArrayUtil.indexOf(array, 12));
        ArrayUtil.remove(array, 3);
        System.out.println(ArrayUtil.sum(array));
        System.out.println(ArrayUtil.getMax(array));
        ArrayUtil.getMin(array);
        System.out.println(ArrayUtil.getAvg(array));
    }

}
