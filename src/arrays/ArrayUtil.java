package arrays;

/**
 * Create an array with the given size, fill it with the different values and print it.
 */
public static void createArray(int size) {
        int[] newArray = new int [size];

        for(int i = 0; i < newArray.length; i++ ) {
        System.out.print(i + ", ");
        }
        System.out.println();
        }

/**
 * Create two dimensional array with the given sizes, fill it with different values and print it.
 */
public static void create2dArray(int x, int y) {
        int twoD [][] = new int[x][y];
        int k = 0;
        for(int i = 0; i < x; i++) {
        for (int j = 0; j < y ; j++) {
        twoD[i][j] = k;
        k++;
        System.out.print(twoD[i][j] +", ");
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
        int[] newArray = new int [array.length + 1];
        System.arraycopy(array, 0, newArray, 1, array.length);
        newArray[0] = valueToAdd;

        for(int i = 0; i < newArray.length; i++){
        System.out.print(newArray[i] + ", ");
        }
        System.out.println();

        return newArray;
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
        int index = 0;
        for(int i : array) {
        if (i == value) {
        return index;
        }
        index++;
        }
        return -1;
        }

/**
 * Remove the element by the given index.
 * Print new array
 */
public static void remove(int[] array, int index) {
        int[] newArray = new int[array.length - 1];

        for (int i = 0, j = 0; i <= array.length-1; i++) {
        if (i == index) {
        continue;
        }
        newArray[j] = array[i];
        j++;
        }
        for(int i : newArray) {
        System.out.print(i + ", ");
        }
        System.out.println();
        }

/**
 * Calculate and return sum of array's elements.
 */
public static long sum(int[] array) {
        long sum = 0;
        for(int i: array) {
        sum += i;
        }
        return sum;
        }

/**
 * Get the max value from the array.
 */
public static int getMax(int[] array) {
        int max = array[0];
        for (int i = 0; i < array.length; i++) {
        if(array[i] > max){
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
        for (int i = 0; i < array.length; i++) {
        if(array[i] < min){
        min = array[i];
            }
        }
        System.out.println(min);
        }

/**
 * Calculate average of array
 */
public static int getAvg(int[] array) {
        int sum = 0;
        int avg;
        for(int i: array) {
        sum += i;
        }
        avg = sum / array.length;
        return avg;
        }

}