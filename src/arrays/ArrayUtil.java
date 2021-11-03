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
        int[]array = new int[size];
        for(int i = 0; i < array.length; i++) {
            array[i] = i * 2;
        }
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }


    }


    /**
     * Create two dimensional array with the given sizes, fill it with different values and print it.
     */
    public static void create2dArray(int x, int y) {
        int[][]array2D = new int[x][y];
        for (int i = 0; i < array2D.length; i++) {
            for (int j = 0; j < array2D[i].length-1; j++) {
                array2D[i][j] = 5 * i;
            }

        }
        for (int i = 0; i < array2D.length; i++) {
            for (int j = 0; j < array2D[i].length-1; j++) {
                System.out.print(array2D[i][j] + " ");
            }
        }

    }

    /**
     * Add the given value at the beginning of the given array
     *
     * @return new array.
     */
    public static int[] addFirst(int[] array, int valueToAdd) {
        int[]result = new int[array.length+1];
        System.arraycopy(array,0,result,1,array.length);
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
            if (array[i] == value);
            return i;

        }
        return -1;
    }

    /**
     * Remove the element by the given index.
     * Print new array
     */
    public static void remove(int[] array, int index) {

        int[] result = new int[array.length - 1];
        for (int i = 0; i < array.length - 1; i++) {
            if (i >= index)
                result[i] = array[i + 1];
            else
                result[i] = array[i];

        }
        System.out.println(Arrays.toString(result));
    }


    /**
     * Calculate and return sum of array's elements.
     */
    public static long sum(int[] array) {
        long sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum = sum+array[i];
        }
      return sum;
    }


    /**
     * Get the max value from the array.
     */
    public static int getMax(int[] array) {
        int max = array[0];
        for (int i = 0; i < array.length; i++) {
            if (max < array[i])  {
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
        for (int i = 0; i < array.length; i++) {
            if (min > array[i]){
                min = array[i];
            }

        }
        return min;
    }

    /**
     * Calculate average of array
     */
    public static int getAvg(int[] array) {
        int avg = 0;
        for (int i = 0; i < array.length; i++) {
            avg = (int) (sum(array)/array.length);
        }
        return avg;
    }


}