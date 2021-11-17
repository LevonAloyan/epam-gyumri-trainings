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
            array[i] = i;
        }
        System.out.println("Array is created" + Arrays.toString(array));
    }



    /**
     * Create two dimensional array with the given sizes, fill it with different values and print it.
     */
    public static void create2dArray(int x, int y) {
        int[][] TwoDArray = new int[x][y];
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y ; j++) {
                TwoDArray[i][j] = j;
            }
        }
        System.out.println("Create TwoD Array" + Arrays.deepToString(TwoDArray));
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
        // return indexOf(array, 2) != -1;
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
            if (value == array[i]){
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
        int[] newArray = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            //   index = array.length - i - 1;
            newArray[i] = array[array.length - i - 1];
        }
        System.out.println(Arrays.toString(newArray));

    }


    /**
     * Calculate and return sum of array's elements.
     */
    public static long sum(int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum = sum + array[i]; //45
        }
        //System.out.println(sum);

        return sum;
    }


    /**
     * Get the max value from the array.
     */
    public static int getMax(int[] array) {
        int getMax = 0;
        for (int i = 0; i < array.length; i++) {
            if (getMax < array[i]) {
                getMax = array[i];
            }
        }
        //System.out.println(getMax);
        return getMax;
    }

    /**
     * Get the minimum value from the array
     */
    public static void getMin(int[] array) {
        int getMin = array[0];
        for (int i = 0; i < array.length; i++) {
            if (getMin > array[i]) {
                getMin = array[i];
            }
        }
        System.out.println(getMin);

    }

    /**
     * Calculate average of array
     */
    public static int getAvg(int[] array) {
        return (int) (sum(array) / array.length);

        // return 0;
    }


}