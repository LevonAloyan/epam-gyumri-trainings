package arrays;

import java.util.Random;

public class ArrayUtilTest {

    public static void main(String[] args) {
        ArrayUtil.createArray(7);
        System.out.println();
        System.out.println("--------------------");
        ArrayUtil.create2dArray(4,5);
        System.out.println();
        System.out.println("--------------------");
        int[] array = new int[5];
        ArrayUtil.addFirst(array, 7);
        for (int i : array) {
            System.out.print(i + " ");
        }
        System.out.println();
        System.out.println("--------------------");
        int[] arr = new int[]{2, 6, 9, 8, 1};
        System.out.println(ArrayUtil.contains(arr, 8));
        System.out.println("--------------------");
        int[] arr1 = new int[]{7, 5, 5, 8, 3};
        System.out.println(ArrayUtil.indexOf(arr1, 5));
        System.out.println("--------------------");
        int[] arr2 = new int[]{4, 1, 2, 8, 9};
        ArrayUtil.remove(arr2, 3);
        System.out.println();
        System.out.println("--------------------");
        int[] arr3 = new int[]{2, 5, 1, 4, 3};
        System.out.println(ArrayUtil.sum(arr2));
        System.out.println("--------------------");
        int[] arr4 = new int[]{2, 5, 1, 7, 3};
        System.out.println(ArrayUtil.getMax(arr4));
        System.out.println("--------------------");
        int[] arr5 = new int[]{9, 6, 5, 2, 4};
        ArrayUtil.getMin(arr5);
        System.out.println("--------------------");
        int[] arr6 = new int[]{3, 1, 2, 3, 7};
        System.out.println(ArrayUtil.getAvg(arr6));
    }
}

