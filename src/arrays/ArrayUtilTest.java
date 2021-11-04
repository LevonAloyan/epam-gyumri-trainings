package arrays;


import java.util.Arrays;

public class ArrayUtilTest {

    public static void main(String[] args) {
        ArrayUtil.createArray(3);
        System.out.println("----------------");
        ArrayUtil.create2dArray(5,4);
        System.out.println("----------------");
        System.out.println(Arrays.toString(ArrayUtil.addFirst(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9}, 10)));
        System.out.println("----------------");
        System.out.println(ArrayUtil.contains(new int[]{1, 2, 3, 4}, 2));
        System.out.println("----------------");
        System.out.println(ArrayUtil.indexOf(new int[]{1, 2, 3, 4, 5}, -1));
        System.out.println("----------------");
        ArrayUtil.remove(new int[]{1,2,3,4,5,6},5);
        System.out.println("----------------");
        System.out.println(ArrayUtil.getMax(new int[]{1, 2, 3, 4, 5, 6}));
        System.out.println("----------------");
        System.out.println(ArrayUtil.getMin(new int[]{1, 2, 3, 4, 5, 6}));
        System.out.println("----------------");
        System.out.println(ArrayUtil.getAvg(new int[]{1, 2, 3, 4, 5, 6}));
    }

}
