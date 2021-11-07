package algorithms;

import java.util.Arrays;

public class SortingAlgorithms {

    public static void main(String[] args) {
        int[] array = new int[]{2, -26, 1, 3, -65, 8, -99, 4, 35, 76};
        System.out.print("Default array --> ");
        print(array);
        sortByBubbleSorting(array);
        sortBySelectionSorting(array);
        sortByInsertionSorting(array);
        sortByQuickSorting(array);
        System.out.print("Array was sorted by using \"Quick Sorting\" method --> ");
        print(array);
        sortByMergeSorting(array);
        System.out.print("Array was sorted by using \"Merge Sorting\" method --> ");
        print(array);

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
        if (array.length <= 1) {
            System.out.println("Array is already sorted");
            return;
        }
        int size = 0;
        int minValue = array[0];
        for (int i = 0; i < array.length - 1; ) {
            for (int j = i; j < array.length; j++) {
                if (array[j] < minValue) {
                    minValue = array[j];
                    swap(array, i, j);
                    array[size] = minValue;
                }
            }
            size++;
            i++;
            minValue = array[i];
            if (i == array.length - 1) {
                array[size] = minValue;
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
        for (int i = 0; i < array.length; i++) {
            int index = 0;
            for (int j = 0; j < array.length - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    swap(array, j, j + 1);
                } else if (array[j] < array[index]) {
                    swap(array, j, index);
                    index++;
                }
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
        for (int i = 0; i < leftHalfOfArray.length; i++) {
            leftHalfOfArray[i] = array[i];
        }
        for (int i = 0; i < rightHalfOfArray.length; i++) {
            rightHalfOfArray[i] = array[leftHalfOfArray.length + i];
        }
        sortByMergeSorting(rightHalfOfArray);
        sortByMergeSorting(leftHalfOfArray);
        merge(array, leftHalfOfArray, rightHalfOfArray);
    }

    public static void sortByQuickSorting(int[] array) {
        if (array.length <= 1)
            return;
        int index = 0;
        int pivot = array[index];
        for (int i = 0; i < array.length; ) {
            for (int j = array.length - 1; j > 0; j--) {
                if (pivot > array[j]) {
                    swap(array, index, j);
                    index = j;
                    break;
                }
            }
            int pivotIndex = index;
            while (i < pivotIndex) {
                if (pivot > array[i]) {
                    i++;
                } else {
                    swap(array, index, i);
                    index = i;
                }
                while (index == i && i < pivotIndex) {
                    if (pivot < array[pivotIndex]) {
                        pivotIndex--;
                    } else if (pivot > array[pivotIndex]) {
                        swap(array, index, pivotIndex);
                        index = pivotIndex;
                        i++;
                    }
                }
            }
            pivot = array[index];
            break;
        }
        int[] leftHalfOfArray = new int[array.length - index - 1];
        int[] rightHalfOfArray = new int[array.length - leftHalfOfArray.length];
        for (int i = 0; i < leftHalfOfArray.length; i++) {
            leftHalfOfArray[i] = array[i];
        }
        for (int i = 0; i < rightHalfOfArray.length; i++) {
            rightHalfOfArray[i] = array[leftHalfOfArray.length + i];
        }
        sortByQuickSorting(leftHalfOfArray);
        sortByQuickSorting(rightHalfOfArray);
    }

    private static void merge(int[] destArray, int[] arrayOne, int[] arrayTwo) {
        int i = 0;
        int j = 0;
        int k = 0;
        while (i < arrayOne.length && j < arrayTwo.length) {
            if (arrayOne[i] <= arrayTwo[j]) {
                destArray[k] = arrayOne[i];
                i++;
            } else {
                destArray[k] = arrayTwo[j];
                arrayTwo[j] = arrayOne[i];
                j++;
            }
            k++;
        }
        while (i < arrayOne.length) {
            destArray[k] = arrayOne[i];
            i++;
            k++;
        }

        while (j < arrayTwo.length) {
            destArray[k] = arrayTwo[j];
            j++;
            k++;
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