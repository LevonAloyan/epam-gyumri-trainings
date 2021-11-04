package arrays;


import java.util.Arrays;
import java.util.Scanner;

/**
 * An utility class containing methods for convenient work with arrays
 */
public class ArrayUtil {
    /**
     * Create an array with the given size, fill it with the different values and print it.
     */
    public static void createArray(int size) {
        int [] arr1 = new int[size];
        System.out.println("Enter the values in the array: " + size + " elements ");

        for (int i = 0; i<size; i++ ) {
            Scanner input = new Scanner(System.in);
            arr1[i] = input.nextInt();
        }
        System.out.println("Your Array is: ");
        for (int i = 0; i < size; i++) {
            System.out.print(arr1[i] + ", ");
        }
        System.out.println();
    }

    /**
     * Create two dimensional array with the given sizes, fill it with different values and print it.
     */
    public static void create2dArray(int x, int y) {

        int [][] arr2 = new int[x][y];
        System.out.println("Enter the values in the array: "  );

        for (int i = 0; i < x; i++ ) {
            for (int j = 0; j < y; j++ ) {
                Scanner input = new Scanner(System.in);
                arr2[i][j] = input.nextInt();
            }
            System.out.println("Next) ");
        }
        System.out.println("Your 2dArray is: ");
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++ ) {
                System.out.print(arr2[i][j] + ", ");
            }
            System.out.println();
        }
        System.out.println();

    }

    /**
     * Add the given value at the beginning of the given array
     *
     * @return new array;
     */
    public static int[] addFirst(int[] array, int valueToAdd) {

        int[] newarr0 = new int[array.length + 1];
        newarr0[0] = valueToAdd;
        System.arraycopy(array, 0, newarr0, 1, array.length);

        System.out.println();
        return newarr0;
    }




    /**
     * Implement a method that will check if the given value contains in the array
     *
     * @return true if the array contains the given value, otherwise return false.
     */
    public static boolean contains(int[] array, int value) {

        for (int i = 0; i < array.length; i++){
            if (array[i] == value) {
                return true;
            }
        }
        System.out.println();

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

        System.out.println();

        return -1;
    }

    /**
     * Remove the element by the given index.
     * Print new array
     */
    public static void remove(int[] array, int index) {
        int[] newarr0 = new int[array.length - 1];
        if ( array.length >= index) {
            for (int i = 0; i < array.length; i++) {
                for (int ind = 0 ; ind < index; ind++) {
                    newarr0[ind] = array[ind];
                }
                for (int j = i; j < array.length - 1; j++){
                    newarr0[j] = array[j+1];
                }
            }
            for (int i = 0 ; i < newarr0.length; i++) {
                System.out.print(newarr0[i] + " ");
            }
        } else {
            System.out.print("out of range");
        }

        System.out.println();

    }


    /**
     * Calculate and return sum of array's elements.
     */
    public static long sum(int[] array) {
        int SumArrEl = 0;

        for (int i = 0; i < array.length; i++) {
            SumArrEl += array[i];
        }

        System.out.println();

        return SumArrEl;
    }


    /**
     * Get the max value from the array.
     */
    public static int getMax(int[] array) {
        int ArrMax = array[0];
        for (int i = 1; i < array.length; i++) {
            if ( ArrMax < array[i] ) {
                ArrMax = array[i];
            }
        }
        System.out.println();

        return ArrMax;
    }

    /**
     * Get the minimum value from the array
     */
    public static int getMin(int[] array) {
        int ArrMin = array[0];
        for (int i = 1; i < array.length; i++) {
            if ( ArrMin > array[i] ) {
                ArrMin = array[i];
            }
        }
        System.out.println();

        return ArrMin;
    }

    /**
     * Calculate average of array
     */
    public static int getAvg(int[] array) {
        int ArrAvg = 0;
        for (int i = 0; i < array.length; i++) {
            ArrAvg += array[i];
        }

        System.out.println();

        return ArrAvg/array.length;
    }


}
