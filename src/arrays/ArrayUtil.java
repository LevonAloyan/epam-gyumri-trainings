package arrays;


/**
 * An utility class containing methods for convenient work with arrays
 */
public class ArrayUtil {


    /**
     * Create an array with the given size, fill it with the different values and print it.
     */

    public static void createArray(int size) {
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = i + 2;
        }
        for (int s = 0; s < size; s++) {
            System.out.println(array[s]);
        }
    }

    /**
     * Create two dimensional array with the given sizes, fill it with different values and print it.
     */
    public static void create2dArray(int x, int y) {
        int array[][] = new int[x][y];
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                array[i][j] = j + 1 + i;
            }
        }
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }

    }

    /**
     * Add the given value at the beginning of the given array
     *
     * @return new array.
     */
    public static int[] addFirst(int[] array, int valueToAdd) {
        int[] newArray = new int[array.length + 1];
        System.arraycopy(array, 0, newArray, 1, array.length);
        newArray[0] = valueToAdd;
        return newArray;
    }

    /**
     * Implement a method that will check if the given value contains in the array
     *
     * @return true if the array contains the given value, otherwise return false.
     */
    public static boolean contains(int[] array, int value) {

        return false;
    }

    /**
     * @param array An array to search in.
     * @param value The value to search for.
     * @return the first index of value in the array, if array does not contain given element return -1.
     */
    public static int indexOf(int[] array, int value) {

        return 0;
    }

    /**
     * Remove the element by the given index.
     * Print new array
     */
    public static void remove(int[] array, int index) {

    }


    /**
     * Calculate and return sum of array's elements.
     */
    public static long sum(int[] array) {

        return 0;
    }


    /**
     * Get the max value from the array.
     */
    public static int getMax(int[] array) {

        return 0;
    }

    /**
     * Get the minimum value from the array
     */
    public static void getMin(int[] array) {

    }

    /**
     * Calculate average of array
     */
    public static int getAvg(int[] array) {

        return 0;
    }


}