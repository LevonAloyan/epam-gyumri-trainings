package arrays;


/**
 * An utility class containing methods for convenient work with arrays
 */
public class ArrayUtil {


    /**
     * Create an array with the given size, fill it with the different values and print it.
     */


    public static void createArray(int size) {
        int array[] = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = i;
            System.out.print(array[i] + " ");
        }
    }

    /**
     * Create two dimensional array with the given sizes, fill it with different values and print it.
     */
    public static void create2dArray(int x, int y) {
        int array[][] = new int[x][y];
        for (int i = 0; i < x; i++)
            for (int j = 0; j < y; j++)
                array[i][j] = i + j;
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                System.out.print(array[i][j]);
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
        boolean contains = false;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == value) {
                return contains = true;
            }
        }
        return contains;
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
            }

        }
        return index;
    }

    /**
     * Remove the element by the given index.
     * Print new array
     */
    public static void remove(int[] array, int index) {
        int size = array.length;
        for (int i = index + 1; i < array.length; i++) {
            array[i - 1] = array[i];
        }
        for (int i = 0; i < array.length - 1; i++) {
                System.out.print(array[i]);
        }
    }


    /**
     * Calculate and return sum of array's elements.
     */
    public static long sum(int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum = sum + array[i];
        }
        return sum;
    }


    /**
     * Get the max value from the array.
     */
    public static int getMax(int[] array) {
        int max = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max)
                max = array[i];
        }
        return max;
    }

    /**
     * Get the minimum value from the array
     */
    public static void getMin(int[] array) {
        int min = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] < min)
                min = array[i];
        }
        System.out.println(min);
    }

    /**
     * Calculate average of array
     */
    public static int getAvg(int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum = sum + array[i];
        }
        return sum / array.length;
    }


}