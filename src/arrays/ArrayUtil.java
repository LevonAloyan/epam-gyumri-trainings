package arrays;


import java.io.RandomAccessFile;
import java.security.SecureRandom;
import java.util.Arrays;
import java.util.Random;
import java.util.RandomAccess;

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
            array[i] = new Random().nextInt();
            System.out.println(array[i]);
        }
        System.out.println("Create an array");
    }

    /**
     * Create two dimensional array with the given sizes, fill it with different values and print it.
     */
    public static void create2dArray(int x, int y) {

    }

    /**
     * Add the given value at the beginning of the given array
     *
     * @return new array.
     */
    public static int[] addFirst(int[] array, int valueToAdd) {
        int[] newArray = new int[array.length + 1];
        newArray[0] = valueToAdd;
        for (int i = 1; i < newArray.length; i++) {
            newArray[i] = array[i - 1];
        }
        return newArray;
    }

    /**
     * Implement a method that will check if the given value contains in the array
     *
     * @return true if the array contains the given value, otherwise return false.
     */
    public static boolean contains(int[] array, int value) {
        for (int i = 0; i < array.length; i++) {
            if (value == array[i]){
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
            if (array[i] == value) {
                return i;
            }
        }
        return -1;
    }

    /**
     * Remove the element by the given index.
     * Print new array
     */
    public static void remove(int[] array, int index) {
        if (array.length > 0 && array.length > index && index >= 0) {
            int[] newArray = new int[array.length - 1];
            for (int i = 0; i < newArray.length; i++) {
                if (i < index) {
                    newArray[i] = array[i];
                }else if (index<=i+1){
                    newArray[i] = array[i+1];
                }
            }
            for (int i = 0; i < array.length; i++) {
                System.out.print(array[i]+" - ");
            }
            System.out.println("  ");
            for (int i = 0; i < newArray.length; i++) {
                System.out.print(newArray[i]+" - ");
            }

        }
    }


    /**
     * Calculate and return sum of array's elements.
     */
    public static long sum(int[] array) {
        int  result = 0;
        for (int i = 0; i < array.length; i++) {
            result += array[i];
        }
        return result;
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
    public static int getAvg(int[] array) {
        int sums = 0;
        for (int i = 0; i < array.length; i++) {
            sums += array[i];
        }
        return sums / array.length;
    }
}
