package arrays;

import java.util.Arrays;

public class ArrayUtilTest {

    public static void main(String[] args) {
        ArrayUtil.createArray(6);
        System.out.println("___________________________");
        ArrayUtil.create2dArray(8, 4);
        System.out.println("___________________________");
        System.out.println(Arrays.toString(ArrayUtil.addFirst(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9}, 10)));
        System.out.println("___________________________");
        System.out.println(ArrayUtil.contains(new int[]{1, 2, 3, 4, 5, 6}, 3));
        System.out.println("___________________________");
        System.out.println(ArrayUtil.indexOf(new int[]{1, 2, 3, 4, 5, 6}, 5));
        System.out.println("___________________________");
        ArrayUtil.remove(new int[]{1, 2, 3, 4, 5, 6}, 5);
        System.out.println("___________________________");
        System.out.println(ArrayUtil.getMax(new int[]{1, 2, 3, 5}));
        System.out.println("____________________________");
        System.out.println(ArrayUtil.getMin(new int[]{1, 2, 3, 5}));
        System.out.println("____________________________");
        System.out.println(ArrayUtil.getAvg(new int[]{1, 2, 3, 7}));


    }
}
