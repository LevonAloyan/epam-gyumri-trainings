package algorithms;

import java.util.Arrays;

public class SortingAlgorithms {

    public static void main(String[] args) {
        int[] array = new int[]{2, 1, 8, 3, 5, 5, -26};
        /*sortByBubbleSorting(array);*/
        /*sortBySelectionSorting(array);*/
        /*sortByInsertionSorting(array);*/
        /*sortByMergeSorting(array, 0, array.length - 1);*/
        sortByQuickSorting(array, 0, array.length - 1);
        print(array);
    }


    public static void sortByBubbleSorting(int[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    swap(array, j + 1, j);
                }
            }
        }
    }

    public static void sortBySelectionSorting(int[] array) {

        for (int i = 0; i < array.length - 1; i++) {
            int index = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < array[index]) {
                    index = j;
                }
            }
            int minNumber = array[index];
            array[index] = array[i];
            array[i] = minNumber;
        }
    }

    public static void sortByInsertionSorting(int[] array) {
        for (int j = 1; j < array.length; j++) {
            int value = array[j];
            int i = j - 1;
            while ((i > -1) && (array[i] > value)) {
                array[i + 1] = array[i];
                i--;
            }
            array[i + 1] = value;
        }
    }


    private static void sortByMergeSorting(int[] arr, int firstIndex, int lastIndex) {

        int mid = (firstIndex + lastIndex) / 2;
        if (firstIndex < lastIndex) {
            sortByMergeSorting(arr, firstIndex, mid);
            sortByMergeSorting(arr, mid + 1, lastIndex);
        }
        int i = 0, first = firstIndex, last = mid + 1;
        int[] temp = new int[lastIndex - firstIndex + 1];

        while (first <= mid && last <= lastIndex) {
            temp[i++] = arr[first] < arr[last] ? arr[first++] : arr[last++];
        }
        while (first <= mid) {
            temp[i++] = arr[first++];
        }
        while (last <= lastIndex) {
            temp[i++] = arr[last++];
        }
        i = 0;
        while (firstIndex <= lastIndex) {
            arr[firstIndex++] = temp[i++];
        }
    }


    private static void sortByQuickSorting(int[] array,int firstIndex, int lastIndex) {

        int partition = partition(array, firstIndex, lastIndex);

        if (partition - 1 > firstIndex) {
            sortByQuickSorting(array, firstIndex, partition - 1);
        }
        if (partition + 1 < lastIndex) {
            sortByQuickSorting(array, partition + 1, lastIndex);
        }
    }

    public static int partition(int[] arr, int firstIndex, int lastIndex) {
        int turn = arr[lastIndex];

        for (int i = firstIndex; i < lastIndex; i++) {
            if (arr[i] < turn) {
                int temp = arr[firstIndex];
                arr[firstIndex] = arr[i];
                arr[i] = temp;
                firstIndex++;
            }
        }

        int temp = arr[firstIndex];
        arr[firstIndex] = turn;
        arr[lastIndex] = temp;

        return firstIndex;
    }


    private static void swap(int[] array, int firstIndex, int lastIndex) {
        int tempValue = array[firstIndex];
        array[firstIndex] = array[lastIndex];
        array[lastIndex] = tempValue;

    }

    private static void print(int[] array) {
        for (int element : array) {
            System.out.print(element + ",");
        }
    }
}
