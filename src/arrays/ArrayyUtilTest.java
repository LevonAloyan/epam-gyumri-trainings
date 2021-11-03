package arrays;
import java.util.Arrays;

public class ArrayyUtilTest {
    public static void main(String[] args) {
        ArrayUtil arrays = new ArrayUtil();

        System.out.println("1.Create array with random values");
        ArrayUtil.createArray(6);
        System.out.println();

        System.out.println("2.Create two dimensional array");
        ArrayUtil.create2dArray(7,8);

        System.out.println("3.Add the given value at the beginning of the given array");
        int array[]= {4,5,9,7,7};
        array=ArrayUtil.addFirst(array,2);
        System.out.println(Arrays.toString(array));

        System.out.println("4.Return true if the array contains the given value, otherwise return false");
        System.out.println(ArrayUtil.contains(array,3));

        System.out.println("5.Return the first index of value in the array, if array does not contain given element return -1.");
        System.out.println(ArrayUtil.indexOf(array,3));

        System.out.println("6.Remove the element by the given index.");
        int arr[]={7,8,5,4,2,6,4};
        ArrayUtil.remove(arr,2);

        System.out.println("7.Calculate and return sum of array's elements.");
        System.out.println("Sum="+ArrayUtil.sum(arr));

        System.out.println("8.Get the max value from the array.");
        System.out.println("max="+ArrayUtil.getMax(arr));

        System.out.println("9.Get the minimum value from the array");
        ArrayUtil.getMin(arr);

        System.out.println("10.Calculate average of array");
        System.out.println("Average="+ArrayUtil.getAvg(arr));
    }
}
