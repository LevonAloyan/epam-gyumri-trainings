package arrays;


import java.util.Arrays;

/**
 * An utility class containing methods for convenient work with arrays
 */
public class ArrayUtil {

    /**
     * Create an array with the given size, fill it with the different values and print it.
     */
    public static void createArray(int size) {
        int[] array = new int[size];
        for (int i = 0; i < array.length; i++) {
            array[i] = (i + 1) * 2;
        }
        System.out.println("Array is created " + Arrays.toString(array));
    }

    /**
     * Create two dimensional array with the given sizes, fill it with different values and print it.
     */
    public static void create2dArray(int x, int y) {
        int[][] twoDArray = new int[x][y];
        for (int i = 0; i < twoDArray.length; i++) {
            for (int j = 0; j < twoDArray[i].length; j++) {
                twoDArray[i][j] = (i + 1) * (j + 1);
            }
        }
        System.out.println("TwoD array is created " + Arrays.deepToString(twoDArray));
    }


    /**
     * Add the given value at the beginning of the given array
     *
     * @return new array.
     */
    public static int[] addFirst(int[] array, int valueToAdd) {

        int[] result = new int[array.length + 1];
        System.arraycopy(array,0, result, 1, array.length);
        result[0] = valueToAdd;
        array = result;
        return array;
    }


    /**
     * Implement a method that will check if the given value contains in the array
     *
     * @return true if the array contains the given value, otherwise return false.
     */
    public static boolean contains(int[] array, int value) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == value) {
                return true;
            }
        }
        return false;
    }


    /**
     * @param array An array to search in.
     * @param value The value to search for.
     * @return the first index of value in the array, if array does not contain given element return -1.
     */
    public static int indexOf(int[] array, int value) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == value)
                return i;
        }
        return -1;
    }


    /**
     * Remove the element by the given index.
     * Print new array
     */
    public static void remove(int[] array, int index) {
        if (index < 0)
            System.out.println("Incorrect index");
        int[] result = new int[array.length - 1];
        for (int i = 0; i < array.length - 1; i++) {
            if (i >= index)
                result[i] = array[i + 1];
            else
                result[i] = array[i];
        }
        System.out.println("Removed index " + index +
                " from array, " + Arrays.toString(array) + "\n" +
                "and the result is " + Arrays.toString(result));
    }


    /**
     * Calculate and return sum of array's elements.
     */
    public static long sum(int[] array) {

        long sumValue = 0L;
        for (int i = 0; i < array.length; i++) {
            sumValue += array[i];
        }
        return sumValue;
    }

    /**
     * Get the max value from the array.
     */
    public static int getMax(int[] array) {
        int maxValue = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > maxValue)
                maxValue = array[i];
        }

        return maxValue;
    }

    /**
     * Get the minimum value from the array
     * @return
     */
    public static int getMin(int[] array) {
        int minValue = array[0];
        for (int value : array) {
            if (minValue > value)
                minValue = value;
        }
        return minValue;
    }


    /**
     * Calculate average of array
     */
    public static int getAvg(int[] array) {

        long average = 0L;
        for (int i = 0; i < array.length; i++) {
            average = sum(array) / array.length;
        }
        return (int) average;
    }


}
