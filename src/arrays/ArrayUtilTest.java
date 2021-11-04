package arrays;

public class ArrayUtilTest {

    public static void main(String[] args) {
        ArrayUtil.createArray(12);
        ArrayUtil.create2dArray(3,5);
        int[]array = {18,35,26,90,74};
        System.out.println(ArrayUtil.contains(array,35));
        System.out.println("Implement a method that will check if the given value contains in the array");
        ArrayUtil.remove(array,3);
        System.out.println("\nRemove the element by the given index\nPrint new array");
        System.out.println(ArrayUtil.sum(array));
        System.out.println("Calculate average of array");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]+" --- ");
        }
        System.out.println("");
        int[] addedResult = ArrayUtil.addFirst(array,28);
        for (int i = 0; i < addedResult.length; i++) {
            System.out.print(addedResult[i]+" --- ");
        }
        System.out.println("\nAdd the given value at the beginning of the given array-");
        int[] masiv = {1,17,-8,3,7};
        int[] masiv1 = {7,8,-4,9,-2};
        System.out.println(ArrayUtil.getMin(masiv));
        System.out.println(ArrayUtil.getMin(masiv1));
        System.out.println("Get the minimum value from the array");
        System.out.println(ArrayUtil.getMax(masiv));
        System.out.println(ArrayUtil.getMax(masiv1));
        System.out.println("Get the maximum value from the array");
        int[]masiv2 = {23,12,56,-9,-24,3,18};
        System.out.println(ArrayUtil.getAvg(masiv2));
        System.out.println("Calculate average of array");
    }
}
