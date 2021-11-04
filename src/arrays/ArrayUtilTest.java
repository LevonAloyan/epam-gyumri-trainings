package arrays;

import java.util.Arrays;

public class ArrayUtilTest {

    public static void main(String[] args) {
        int[] arr0 = {2, 20, 4, 17, 8, 15};
        System.out.println("--------------------------------------------------------");
        System.out.println("1. Create new Array:");
        ArrayUtil.createArray(4);

        System.out.println("--------------------------------------------------------");
        System.out.println("2. Create 2d array:");
        ArrayUtil.create2dArray(3,2);

        System.out.println("--------------------------------------------------------");
        System.out.println("3. Add the given value at the beginning of the given array:");
        System.out.println(Arrays.toString(ArrayUtil.addFirst(arr0, 17)));

        System.out.println("--------------------------------------------------------");
        System.out.println("4.Implement a method that will check if the given value contains in the array: ");
        System.out.println(ArrayUtil.contains(arr0, 17));

        System.out.println("--------------------------------------------------------");
        System.out.println("5.@return the first index of value in the array, if array does not contain given element return -1.");
        System.out.println(ArrayUtil.indexOf(arr0, 17));

        System.out.println("--------------------------------------------------------");
        System.out.println("6.Remove the element by the given index.");
        ArrayUtil.remove(arr0, 1);

        System.out.println("--------------------------------------------------------");
        System.out.println("7.Calculate and return sum of array's elements.: ");
        System.out.println("Sum of array elements: " + ArrayUtil.sum(arr0));

        System.out.println("--------------------------------------------------------");
        System.out.println("8.Get the max value from the array");
        System.out.println("Max array element: " + ArrayUtil.getMax(arr0));

        System.out.println("--------------------------------------------------------");
        System.out.println("9.Get the minimum value from the array");
        System.out.println("Min array element: " + ArrayUtil.getMin(arr0));

        System.out.println("--------------------------------------------------------");
        System.out.println("10.Calculate average of array:");
        System.out.println("Arrays averege is: " + ArrayUtil.getAvg(arr0));

        System.out.println("--------------------------------------------------------");

    }
}

