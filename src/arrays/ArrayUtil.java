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
        for(int i = 0; i< size; i++){
            array[i] = i;
        }
        System.out.println("Array" + Arrays.toString(array));
    }

    /**
     * Create two dimensional array with the given sizes, fill it with different values and print it.
     */
    public static void create2dArray(int x, int y) {
        int[][] array2 = new int[x][y];
        for (int i = 0; i < x; i++){
            for (int k = 0; k < y; k++){
                array2[i][k] = k;
            }
        }
        System.out.println("Two-dimensional array" + Arrays.deepToString(array2));
    }

    /**
     * Add the given value at the beginning of the given array
     *
     * @return new array.
     */
    public static int[] addFirst(int[] array, int valueToAdd) {
        int[] newArray = new int[array.length + 1];
        for(int i = 0; i <= array.length; i++){
            if(i != 0){
                newArray[i] = array[i - 1];
            }else {
                newArray[i] = valueToAdd;
            }

        }
        return newArray;
    }

    /**
     * Implement a method that will check if the given value contains in the array
     *
     * @return true if the array contains the given value, otherwise return false.
     */
    public static boolean contains(int[] array, int value) {
        for(int val: array){
            if (val == value){
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
        for(int i = 0;i < array.length; i++ ){
            if (array[i] == value){
                return i;
            }
        }
        return index;
    }

    /**
     * Remove the element by the given index.
     * Print new array
     */
    public static void remove(int[] array, int index) {
        int[] clonArray = new int[array.length - 1];
        for(int i = 0 , j = 0; i< array.length; i++){
            if(i != index){
                clonArray[j++] = array[i];
            }
        }
        System.out.println(Arrays.toString(clonArray));
    }


    /**
     * Calculate and return sum of array's elements.
     */
    public static long sum(int[] array) {
        int sum = 0;
        for(int val: array){
            sum += val;
        }
        return sum;
    }


    /**
     * Get the max value from the array.
     */
    public static int getMax(int[] array) {
        int max = 0;
        for(int val: array){
            if(max  < val) {
                max = val;
            }
        }
        return max;
    }

    /**
     * Get the minimum value from the array
     */
    public static void getMin(int[] array) {
        int min = array[0];
        for (int val: array){
            if(min > val){
                min = val;
            }
        }
        System.out.println(min);
    }

    /**
     * Calculate average of array
     */
    public static int getAvg(int[] array) {
        int average = 0;
        int sum = 0;
        for(int val: array){
            sum += val;
        }
        average = sum/array.length;

        return average;
    }
}