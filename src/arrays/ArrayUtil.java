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
            array[i] = i + 1;
        }

        for (int i = 0; i < size; i++) {
            System.out.println(array[i]);
        }

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
        int newArray [] = new int[array.length + 1];
        newArray[0] = valueToAdd;
        for (int i = 0; i < array.length; i++) {
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
        for (int i = 0; i < array.length; i++) {
            if (array[i] == value){
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
        int newArray[] = new int[array.length - 1];
        for (int i = 0; i < index; i++) {
            newArray[i] = array[i];
        }

        for (int i = index; i <array.length - 1; i++) {
            newArray[i] = array[i + 1];
        }

        for (int i = 0; i < newArray.length; i++) {
            System.out.println(newArray[i]);
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
        int x = array[0];
        for (int i = 1; i < array.length; i++) {
            if (x < array[i]) {
                x = array[i];
            }
        }
        return x;
    }

    /**
     * Get the minimum value from the array
     */
    public static int getMin(int[] array) {
        int x = array[0];
        for (int i = 1; i < array.length; i++) {
            if (x > array[i]) {
                x = array[i];
            }
        }
        return x;
    }

    /**
     * Calculate average of array
     */
    //{5,6,7}
    public static int getAvg(int[] array) {
        int sum = 0;

        for (int i = 0; i < array.length; i++) {
            sum = sum +  array[i];
        }
        return sum/array.length;
    }


}