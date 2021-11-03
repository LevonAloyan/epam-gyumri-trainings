package arrays;


/**
 * An utility class containing methods for convenient work with arrays
 */
public class ArrayUtil {


    /**
     * Create an array with the given size, fill it with the different values and print it.
     */
    public static void createArray(int size) {
        System.out.println("createArray");

        int[] arr = new int[size];
        for (int i : arr) {
            System.out.print(i + ", ");
        }
        System.out.println();
        System.out.println("_______________________");
    }

    /**
     * Create two dimensional array with the given sizes, fill it with different values and print it.
     */
    public static void create2dArray(int x, int y) {
        System.out.println("create2dArray");

        int[][] arr1 = new int[x][y];
        for (int i = 0; i < y; i++) {
            System.out.print(i + ", ");
        }
        System.out.println();
        for (int j = 0; j < x; j++) {
            System.out.print(j + ", ");
        }
        System.out.println();
        System.out.println("_______________________");
    }


    /**
     * Add the given value at the beginning of the given array
     *
     * @return new array.
     */
    public static int[] addFirst(int[] array, int valueToAdd) {
        System.out.println("addFirst");

        int[] arr = new int[array.length];
        arr[0] = valueToAdd;
        System.arraycopy(arr, 0, array, 0, 1);
        return array;
    }


    /**
     * Implement a method that will check if the given value contains in the array
     */
    public static boolean contains(int[] array1, int value) {
        System.out.println("contains");

        for (int i : array1) {
            if (value == array1[i]) {
                return true;
            }
        }
        return false;
    }

    /**
     * @param array2 An array to search in.
     * @param value The value to search for.
     * @return the first index of value in the array, if array does not contain given element return -1.
     */
    public static int indexOf(int[] array2, int value) {
        System.out.println("indexOf");

        for (int i : array2) {
            if (value == array2[i]) {
                return value;
            }
        }
        return -1;
    }

    /**
     * Remove the element by the given index.
     * Print new array
     */
    public static void remove(int[] array3, int index) {
        System.out.println("remove");

        int[] arr = new int[array3.length - 1];
        for (int i : array3) {
            System.out.print(i + ", ");
        }
        System.out.println();
        if (index > array3.length - 1) {
            System.out.print("index chka");
        } else {
            for (int i = 0; i < array3.length - 1; i++) {
                if (i < index) {
                    arr[i] = array3[i];
                } else {
                    arr[i] = array3[i + 1];
                }
            }
            for (int i : arr) {
                System.out.print(i + ", ");
            }
        }
        System.out.println();
        System.out.println("_______________________");
    }


    /**
     * Calculate and return sum of array's elements.
     */
    public static long sum(int[] array5) {
        System.out.println("sum");

        int sum = 0;
        for (int i : array5) {
            sum += array5[i];
        }
        return sum;
    }


    /**
     * Get the max value from the array.
     */
    public static int getMax(int[] array6) {
        System.out.println("getMax");

        int max = array6[0];
        for (int i : array6) {
            if (max < array6[i]) {
                max = array6[i];
            }
        }
        return max;
    }

    /**
     * Get the minimum value from the array
     */
    public static void getMin(int[] array7) {
        System.out.println("getMin");

        int min = array7[0];
        int j = min;
        for (int i : array7) {
            if (min > array7[i]) {
                min = array7[i];
            }
        }
        System.out.println(j);
    }

    /**
     * Calculate average of array
     */
    public static double getAvg(int[] array8) {
        System.out.println("getAvg");

        double sum = 0;
        for (int i : array8) {
            sum += array8[i];
        }
        return sum / array8.length;
    }

}
