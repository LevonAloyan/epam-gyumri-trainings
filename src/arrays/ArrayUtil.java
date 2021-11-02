package arrays;


import java.util.Arrays;
import java.util.stream.IntStream;

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
            array[i] = i+1;
            System.out.print(array[i] + " ");
        }
    }

    /**
     * Create two dimensional array with the given sizes, fill it with different values and print it.
     */
    public static void create2dArray(int x, int y) {
        int[][] dimensionalArray = new int[x][y];
        for (int[] ints : dimensionalArray) {
            System.out.print("{ ");
            System.out.print(Arrays.toString(ints));
            System.out.println(" }");
        }
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
            arrayWithAddedValue[i] = array[i-1];
        }
        return arrayWithAddedValue;
    }

    /**
     * Implement a method that will check if the given value contains in the array
     *
     * @return true if the array contains the given value, otherwise return false.
     */
    public static boolean contains(int[] array, int value) {
        return Arrays.binarySearch(array, value) >= 0;
    }

    /**
     * @param array An array to search in.
     * @param value The value to search for.
     * @return the first index of value in the array, if array does not contain given element return -1.
     */
    public static int indexOf(int[] array, int value) {
        int index = -1;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == value){
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
        if (index < array.length) {
            int[] ints = IntStream.range(0, array.length)
                    .filter(i -> i != index)
                    .map(i -> array[i])
                    .toArray();
            System.out.println(Arrays.toString(ints));
        }
    }


    /**
     * Calculate and return sum of array's elements.
     */
    public static long sum(int[] array) {
        return Arrays.stream(array).sum();
    }


    /**
     * Get the max value from the array.
     */
    public static int getMax(int[] array) {
        return Arrays.stream(array).max().orElse(0);
    }

    /**
     * Get the minimum value from the array
     */
    public static void getMin(int[] array) {
        Arrays.stream(array).min();
    }

    /**
     * Calculate average of array
     */
    public static int getAvg(int[] array) {
        return (int) Arrays.stream(array).average().getAsDouble();
    }


}