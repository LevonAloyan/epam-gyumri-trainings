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
    for (int i =0; i<array.length; i++){
        array[i] = i;
        System.out.println("CreateArray " + array[i] + " ");
    }
    }

    /**
     * Create two dimensional array with the given sizes, fill it with different values and print it.
     */
    public static void create2dArray(int x, int y) {
        int[][] array = new int[x][y];
        for (int i = 0; i < array.length; i++){
            for (int j = 0; j< array.length; j++ ){
                array[i][j] = i;
                System.out.println("Create2Array " + array[i][j] + " ");
            }
        }
    }

    /**
     * Add the given value at the beginning of the given array
     *
     * @return new array.
     */
    public static int[] addFirst(int[] array, int valueToAdd) {
        int[] newArray = new int [array.length + 1];
        for (int i = 0; i< array.length; i++){
            newArray[0] = valueToAdd;
            newArray[i + 1] = array[i];
        }
        return newArray;
    }

    /**
     * Implement a method that will check if the given value contains in the array
     *
     * @return true if the array contains the given value, otherwise return false.
     */
    public static boolean contains(int[] array, int value) {

        for (int i =0; i<array.length; i++) {
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
            for(int i = 0; i<array.length; i++){
            if (array[i] == value){
                return i;
            }
            }
                return 0;
    }
    /**
     * Remove the element by the given index.
     * Print new array
     */
    public static void remove(int[] array, int index) {
        int[] newArray = new int[array.length - 1];
        int num = 0;
        for (int i = 0; i < array.length; i++) {
            if (i != index) {
                newArray[num++] = array[i];
            }
        }
        System.out.println("Remover " + Arrays.toString(newArray));
    }


    /**
     * Calculate and return sum of array's elements.
     */
    public static long sum(int[] array) {
        int sum = 0;
        for (int i = 0; i<array.length; i++){
            sum+=array[i];
        }
            return sum;
    }


    /**
     * Get the max value from the array.
     */
    public static int getMax(int[] array) {
        int max = 0;
        for (int i = 0; i < array.length; i++) {
            if (max < array[i]) {
                max = array[i];
            }
        }
            return max;
    }

    /**
     * Get the minimum value from the array
     */
    public static void getMin(int[] array) {
        int min = 1;
        for (int i = 0; i < array.length; i++) {
            if (min > array[i]) {
                min = array[i];
            }
        }
        System.out.println("Min " + min + " ");
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