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
            array[i] = (int) (Math.random() * 100);
        }
        System.out.println(Arrays.toString(array));
    }

    /**
     * Create two dimensional array with the given sizes, fill it with different values and print it.
     */
    public static void create2dArray(int x, int y) {
        int[][] array = new int[x][y];
        System.out.print("[ ");
        for (int i = 0; i < array.length; i++) {
            System.out.print("[ ");
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = (int) (Math.random() * 100);
                System.out.print(array[i][j] + " ");
            }
            if ( i == array.length - 1 ) {
                 System.out.print("]");
            } else { 
                System.out.print("], ");
            }
        }
        System.out.print(" ]");
        System.out.println();
    }

    /**
     * Add the given value at the beginning of the given array
     *
     * @return new array.
     */
    public static int[] addFirst(int[] array, int valueToAdd) {
        int [] newArr = new int[array.length + 1];
        newArr[0] = valueToAdd;
        for (int i = 1; i < newArr.length; i++) {
            newArr[i] = array[i - 1];
        }
        return newArr;
    }

    /**
     * Implement a method that will check if the given value contains in the array
     *
     * @return true if the array contains the given value, otherwise return false.
     */
    public static boolean contains(int[] array, int value) {
        int i = 0;
        while ( i < array.length) {
            if (array[i] == value) {
                return true;
            }
        i++;
        }
        return false;
    }

    /**
     * @param array An array to search in.
     * @param value The value to search for.
     * @return the first index of value in the array, if array does not contain given element return -1.
     */
    public static int indexOf(int[] array, int value) {
        // int not = -1
        int i = 0;
        while ( i < array.length) {
            if (array[i] == value) {
                return i;
            }
        i++;
        }
        return -1;
    }

    /**
     * Remove the element by the given index.
     * Print new array
     */
    public static void remove(int[] array, int index) {
        int [] newArr = new int[array.length - 1];
        int j = 0;
        for (int i = 0; i < array.length; i++ ){
            if (i != index){
                newArr[j] = array[i];
                j++;
            }
        }
        System.out.println(Arrays.toString(newArr));
     }


    /**
     * Calculate and return sum of array's elements.
     */
    public static long sum(int[] array) {
        long sum = 0L;
        for (int i = 0; i < array.length; i++){
            sum  +=  array[i];
        }
        return sum;
    }


    /**
     * Get the max value from the array.
     */
    public static int getMax(int[] array) {
        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (max < array[i]){
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
            if (min > array[i]){
                min = array[i];
            }
        }
       System.out.print(min);
    }

    /**
     * Calculate average of array
     */
    public static int getAvg(int[] array) {
        long sum = 0L;
        for (int i = 0; i < array.length; i++){
            sum  +=  array[i];
        }
        return (int) sum / array.length ;
    }
}