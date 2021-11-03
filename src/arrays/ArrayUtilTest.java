package arrays;

import java.util.Arrays;

public class ArrayUtilTest {



    public static void main(String[] args) {
            int[] array = {1,2,78,56,45,42,12};
        ArrayUtil.createArray(7);
        ArrayUtil.create2dArray(2,5);
        System.out.println(Arrays.toString(ArrayUtil.addFirst(array,51)));
        System.out.println(ArrayUtil.contains(array,56));
        System.out.println(ArrayUtil.indexOf(array,78));
        ArrayUtil.remove(array,2);
        System.out.println(ArrayUtil.sum(array));
        System.out.println(ArrayUtil.getMax(array));
        System.out.println(ArrayUtil.getMin(array));
        System.out.println(ArrayUtil.getAvg(array));

    }
}
