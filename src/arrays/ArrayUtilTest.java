package arrays;

import java.io.OutputStream;
import java.util.Arrays;

import static arrays.ArrayUtil.remove;

public class ArrayUtilTest {

    public static void main(String[] args) {
        ArrayUtil.createArray(5);

        ArrayUtil.create2dArray(10, 8);

        int[] array = {0, 1, 2, 3, 4, 5, 6, 7};
        System.out.println(Arrays.toString(ArrayUtil.addFirst(array, 15)));
        System.out.println("_______________________");

        int[] array1 = {0, 1, 2, 3, 4, 5, 6, 7};
        System.out.println(ArrayUtil.contains(array1, 4));
        System.out.println("_______________________");

        int[] array2 = {0, 1, 2, 3, 4, 5, 6, 7};
        System.out.println(ArrayUtil.indexOf(array2, 6));
        System.out.println("_______________________");

        int[] array3 = {0, 1, 2, 3, 4, 5, 6, 7};
        ArrayUtil.remove(array3, 4);


        int[] array5 = {0, 1, 2, 3, 4, 5, 6, 7};
        System.out.println(ArrayUtil.sum(array5));
        System.out.println("_______________________");

        int[] array6 = {0, 1, 2, 3, 4, 5, 6, 7};
        System.out.println(ArrayUtil.getMax(array6));
        System.out.println("_______________________");

        int[] array7 = {0, 1, 2, 3, 4, 5, 6, 7};
        ArrayUtil.getMin(array7);
        System.out.println("_______________________");

        int[] array8 = {0, 1, 2, 3, 4, 5, 6, 7};
        System.out.println(ArrayUtil.getAvg(array8));
        System.out.println("_______________________");
    }
}
