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

        int [] newArray= new int[size];
        for(int i = 0; i < newArray.length; i++) {
            newArray[i] = i;
            System.out.print(newArray[i] + " ");
        }
        System.out.println();
    }

    /**
     * Create two dimensional array with the given sizes, fill it with different values and print it.
     */
    public static void create2dArray(int x, int y) {

        int[][] newArray = new int[x][y];
        int k = 4;
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                newArray[i][j] = k;
                System.out.print(newArray[i][j] + " ");
                k += 3;
            }
            System.out.println();
        }
        System.out.println();
    }


    /**
     * Add the given value at the beginning of the given array
     *
     * @return new array.
     */
    public static int[] addFirst(int[] array, int valueToAdd) {

        array[0] = valueToAdd;
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
        return null;
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

        for (int i = 0; i < array.length; i++){
            if(array[i] == value){
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

        int indexOfSecondArray = 0;
        if (array.length > 0 && array != null) {
            int[] newArray = new int[array.length - 1];
            for (int i = 0; i < array.length; i++) {
                if (i != index) {
                    newArray[indexOfSecondArray++] = array[i];
                }
            }
            System.out.println(Arrays.toString(newArray));
        }
    }


    /**
     * Calculate and return sum of array's elements.
     */
    public static long sum(int[] array) {
        long sum = 0;
        for(int i = 0; i < array.length; i++){
            sum += array[i];
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
    public static void getMin(int[] array) {

        int min = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        System.out.println(min);
    }

    /**
     * Calculate average of array
     */
    public static int getAvg(int[] array) {
        int sum = 0;
        int average;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        average = sum / array.length;
        return average;
    }

}