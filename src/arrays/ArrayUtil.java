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
            array[i] = i + 1;
            System.out.print(array[i] + " ");
        }
    }

    /**
     * Create two dimensional array with the given sizes, fill it with different values and print it.
     */
    public static void create2dArray(int x, int y) {
        int[][] dimensionalArray = new int[x][y];
        for (int[] ints : dimensionalArray) {
            for (int i = 0; i < ints.length; i++) {
                ints[i] = i;
            }
            System.out.print("{ ");
            System.out.print(Arrays.toString(ints));
            System.out.println(" }");
        }
        System.out.println();
    }


    /**
     * Add the given value at the beginning of the given array
     *
     * @return new array.
     */
    public static int[] addFirst(int[] array, int valueToAdd) {
        int[] arrayWithAddedValue = new int[array.length + 1];
        arrayWithAddedValue[0] = valueToAdd;
        for (int i = 1; i < arrayWithAddedValue.length; i++) {
            arrayWithAddedValue[i] = array[i - 1];
        }
        return arrayWithAddedValue;
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
        int index = -1;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == value) {
                index = i;
                break;
            }
        }
        return index;
    }

    /**
     * Remove the element by the given index.
     * Print new array
     */
    public static void remove(int[] array, int index) {
        int[] newArray = new int[array.length - 1];
        for (int i = 0, j = 0; i < array.length; i++) {
            if (i != index) {
                newArray[j++] = array[i];
            }
        }
        System.out.println(Arrays.toString(newArray));
    }


    /**
     * Calculate and return sum of array's elements.
     */
    public static long sum(int[] array) {
        int sum = 0;
        for (int i : array) {
            sum += i;
        }
        return sum;
    }


    /**
     * Get the max value from the array.
     */

    public static int getMax(int[] array) {
        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        return max;
    }

    /**
     * Get the minimum value from the array
     */
    public static int getMin(int[] array) {
        int min = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        return min;
    }

    /**
     * Calculate average of array
     */
    public static long getAvg(int[] array) {
        return sum(array) / array.length;
    }


}