package algorithms;

import java.util.Arrays;

public class SortingAlgorithms {

    public static void main(String[] args) {
//        int [] array = new int[]{2,1,8,3,5,5,-26};
        int[] array = new int[]{20, 10, 80, 30, 50, 50, -26};
//        sortByBubbleSorting(array);
//        sortBySelectionSorting(array);
        sortByInsertionSorting(array);
        print(array);
    }

    public static void sortByBubbleSorting(int[] array) {
        System.out.println("Before sorting " + Arrays.toString(array));
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    swap(array, j + 1, j);
                }
            }
        }
    }

    public static void sortBySelectionSorting(int[] array) {

        System.out.println("Before sorting " + Arrays.toString(array));

        for (int i = 0; i < array.length; i++) {
            int min = array[i];
            for (int j = i + 1; j < array.length; j++) {
//               Before sorting [20, 10, 80, 30, 50, 50, -26]
                if (array[j] < min) {
                    min = array[j];
                    swap(array, j, i);
                }
            }
        }
    }

    public static void sortByInsertionSorting(int[] array) {

        System.out.println("Before sorting " + Arrays.toString(array));

        for (int i = 1; i < array.length; i++) {
            int min = array[i];
            int index = i - 1;
            for (int j = index; j >=0 ; j--) {
                if (array[j]>min){
                    swap(array,index+1,index);
                    array[index--] = min;
                }

            }
        }
    }

    public static void sortByMergeSorting(int[] array) {


    }

    public static void sortByQuickSorting(int[] array) {

    }

    private static void swap(int[] array, int firstIndex, int lastIndex) {
        int tempValue = array[firstIndex];
        array[firstIndex] = array[lastIndex];
        array[lastIndex] = tempValue;
    }

    private static void print(int[] array) {
        System.out.print("After sorting " + Arrays.toString(array) + "\n");
    }
}