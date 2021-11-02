package arrays;
import java.util.Random;

/**
 * An utility class containing methods for convenient work with arrays
 */
public class ArrayUtil {


    /**
     * Create an array with the given size, fill it with the different values and print it.
     */
    public static void createArray(int size) {
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = new Random().nextInt(100);
        }
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }

    /**
     * Create two dimensional array with the given sizes, fill it with different values and print it.
     */
    public static void create2dArray(int x, int y) {
        int[][] arr = new int[x][y];
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                arr[i][j] = new Random().nextInt(100);
            }
        }
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.print("| ");
        }
    }


    /**
     * Add the given value at the beginning of the given array
     *
     * @return new array.
     */
    public static int[] addFirst(int[] array, int valueToAdd) {
        array[0] = valueToAdd;
        return array;
    }

    /**
     * Implement a method that will check if the given value contains in the array
     *
     * @return true if the array contains the given value, otherwise return false.
     */
    public static boolean contains(int[] array, int value) {
        for (int i : array) {
            if (i == value) return true;
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
            if (array[i] == value) return i;
        }
        return -1;
    }

    /**
     * Remove the element by the given index.
     * Print new array
     */
    public static void remove(int[] array, int index) {
        array[index] = 0;
        for (int i : array) {
            System.out.print(i + " ");
        }
    }


    /**
     * Calculate and return sum of array's elements.
     */
    public static long sum(int[] array) {
        long sum = 0;
        for (int i : array) {
            sum += i;
        }
        return sum;
    }


    /**
     * Get the max value from the array.
     */
    public static int getMax(int[] array) {
        int max = 0;
        for (int i : array) {
            if (i > max) max = i;
        }
        return max;
    }

    /**
     * Get the minimum value from the array
     */
    public static void getMin(int[] array) {
        int min = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] < min) min = array[i];
        }
        System.out.println(min);
    }

    /**
     * Calculate average of array
     */
    public static int getAvg(int[] array) {
        long sum = 0;
        for (int i : array) {
            sum += i;
        }
        return (int) sum / (array.length);
    }

}