package algorithms;

import java.util.Arrays;

public class SortingAlgorithms {

    public static void main(String[] args) {
        int[] array = new int[]{2, 1, 8, 3, 5, 5, -26};
        System.out.println("Before sorting :");
        print(array);

//        sortByBubbleSorting(array);
//        sortBySelectionSorting(array);
//        sortByInsertionSorting(array);
        sortByMergeSorting(array);
//        sortByQuickSorting(array);


        System.out.println("After sorting :");
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

        for (int i = 0; i < array.length; i++) {
            int min = array[i];
            for (int j = i + 1; j < array.length; j++) {
//               Before sorting [2, 1, 8, 3, 5, 5, -26]
                if (array[j] < min) {
                    min = array[j];
                    swap(array, j, i);
                }
            }
        }
    }

    public static void sortByInsertionSorting(int[] array) {

        for (int i = 1; i < array.length; i++) {
            int min = array[i];
            int index = i - 1;
            for (int j = index; j >= 0; j--) {
                if (array[j] > min) {
                    swap(array, index + 1, index);
                    array[index--] = min;
                }

            }
        }
    }

    public static void sortByMergeSorting(int[] array) {
        splitArray(array, 0, array.length - 1);
    }

    public static void sortByQuickSorting(int[] array) {

        int firsIndex = 0;
        int endIndex = array.length - 1;
        sortByQuick(array, firsIndex, endIndex);
    }

    private static void sortByQuick(int[] array, int firstIndex, int endIndex) {

        int center = array[firstIndex + (endIndex - firstIndex) / 2];

        int tempFirsIndex = firstIndex;
        int tempEndIndex = endIndex;
        while (tempFirsIndex <= tempEndIndex) {
            while (array[tempFirsIndex] < center) {
                tempFirsIndex++;
            }
            while (array[tempEndIndex] > center) {
                tempEndIndex--;
            }
            if (tempFirsIndex <= tempEndIndex) {
                swap(array, tempFirsIndex, tempEndIndex);
                tempFirsIndex++;
                tempEndIndex--;
            }
        }
        if (firstIndex < tempEndIndex) {
            sortByQuick(array, firstIndex, tempEndIndex);
        }
        if (endIndex > tempFirsIndex) {
            sortByQuick(array, tempFirsIndex, endIndex);
        }
    }

    public static void splitArray(int[] array, int first, int end) {

        if (end > first) {
            splitArray(array, 0, ((first + end) / 2));
            splitArray(array, ((first + end) / 2) + 1, end);
            sortingMerge(array, 0, ((first + end) / 2), end);
        }
    }

    public static void sortingMerge(int[] array, int firstIndex, int center, int endIndex) {

        int[] beforeArray = new int[center - firstIndex + 1];
        int[] afterArray = new int[endIndex - center];

        System.arraycopy(array, firstIndex, beforeArray, 0, beforeArray.length);
        System.arraycopy(array, center + 1, afterArray, 0, afterArray.length);

        int beforeArrayIndex = 0;
        int afterArrayIndex = 0;

        for (int i = firstIndex; i < endIndex + 1; i++) {
            if (beforeArrayIndex < beforeArray.length && afterArrayIndex < afterArray.length) {
                if (beforeArray[beforeArrayIndex] < afterArray[afterArrayIndex]) {
                    array[i] = beforeArray[beforeArrayIndex];
                    beforeArrayIndex++;
                } else {
                    array[i] = afterArray[afterArrayIndex];
                    afterArrayIndex++;
                }
            } else if (beforeArrayIndex < beforeArray.length) {
                array[i] = beforeArray[beforeArrayIndex];
                beforeArrayIndex++;
            } else if (afterArrayIndex < afterArray.length) {
                array[i] = afterArray[afterArrayIndex];
                afterArrayIndex++;
            }
        }
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
        System.out.println();
    }
}