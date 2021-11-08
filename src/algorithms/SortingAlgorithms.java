package algorithms;

import java.util.Arrays;

public class SortingAlgorithms {

    public static void main(String[] args) {
        int[] array = new int[]{2, -26, -3, 8, -99, 4, 35, 76};
        System.out.print("Default array --> ");
        print(array);
//        sortByBubbleSorting(array);
//        sortBySelectionSorting(array);
//        sortByInsertionSorting(array);
        sortByQuickSorting(array, 0, array.length - 1);
        System.out.print("Array was sorted by using \"Quick Sorting\" method --> ");
        print(array);
//        sortByMergeSorting(array);
//        System.out.print("Array was sorted by using \"Merge Sorting\" method --> ");
//        print(array);

    }

    public static void sortByBubbleSorting(int[] array) {
        if (array.length <= 1) {
            System.out.println("Array is already sorted");
            return;
        }
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    swap(array, j + 1, j);
                }
            }
        }
        System.out.print("Array was sorted by using \"Bubble Sorting\" method --> ");
        print(array);
    }

    public static void sortBySelectionSorting(int[] array) {
        if (array.length < 2) {
            System.out.println("Array is already sorted");
            return;
        }
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length - 1; j++) {
                if (array[i] >= array[j]) {
                    swap(array, i, j);
                }
            }
        }

        System.out.print("Array was sorted by using \"Selection Sorting\" method --> ");
        print(array);
    }

    public static void sortByInsertionSorting(int[] array) {
        if (array.length <= 1) {
            System.out.println("Array is already sorted");
            return;
        }
        for (int i = 1; i < array.length; i++) {
            int currentItem = array[i];
            int currentIndex = i;
            while (currentIndex > 0 && array[currentIndex - 1] > currentItem) {
                swap(array, currentIndex, currentIndex - 1);
                currentIndex -= 1;
            }
        }
        System.out.print("Array was sorted by using \"Insertion Sorting\" method --> ");
        print(array);
    }

    public static void sortByMergeSorting(int[] array) {
        if (array.length < 2)
            return;
        int halfLength = array.length / 2;
        int[] leftHalfOfArray = new int[halfLength];
        int[] rightHalfOfArray = new int[array.length - halfLength];
        System.arraycopy(array, 0, leftHalfOfArray, 0, leftHalfOfArray.length);
        System.arraycopy(array, leftHalfOfArray.length, rightHalfOfArray, 0, rightHalfOfArray.length);
        sortByMergeSorting(rightHalfOfArray);
        sortByMergeSorting(leftHalfOfArray);
        merge(array, leftHalfOfArray, rightHalfOfArray);
    }

    public static void sortByQuickSorting(int[] array, int firstIndex, int lastIndex) {
        if (firstIndex >= lastIndex) {
            return;
        }
        int pivot = array[0];
        while (firstIndex <= lastIndex) {
            while (array[firstIndex] < pivot) {
                firstIndex++;
            }
            while (array[lastIndex] > pivot) {
                lastIndex--;
            }
            if (firstIndex <= lastIndex) {
                swap(array, firstIndex, lastIndex);
            }
            firstIndex++;
            lastIndex--;
        }
        sortByQuickSorting(array, firstIndex, lastIndex);
    }


    private static void merge(int[] destArray, int[] arrayOne, int[] arrayTwo) {
        int i = 0;
        int j = 0;
        int k = 0;
        while (i < arrayOne.length && j < arrayTwo.length) {
            if (arrayOne[i] <= arrayTwo[j]) {
                destArray[k++] = arrayOne[i++];
            } else {
                destArray[k++] = arrayTwo[j];
                arrayTwo[j++] = arrayOne[i];
            }
        }
        while (i < arrayOne.length) {
            destArray[k++] = arrayOne[i++];
        }
        while (j < arrayTwo.length) {
            destArray[k++] = arrayTwo[j++];
        }
    }

    private static void swap(int[] array, int firstIndex, int lastIndex) {
        int tempValue = array[firstIndex];
        array[firstIndex] = array[lastIndex];
        array[lastIndex] = tempValue;
    }

    private static void print(int[] array) {
        for (int element : array) {
            System.out.print(element + " | ");
        }
        System.out.println();
    }
}