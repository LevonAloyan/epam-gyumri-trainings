package algorithms;

import java.util.Arrays;

public class SortingAlgorithms {

    public static void main(String[] args) {
<<<<<<< HEAD
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
=======
        int [] array = new int[]{2,1,8,3,5,5,-26};
        sortByMergeSorting(array);
>>>>>>> 497e268dd8bc3b8476417d92cce16ab6da1a1adb
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

<<<<<<< HEAD
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
=======
    public static void sortBySelectionSorting(int[] array){
        for (int i = 0; i < array.length; i++) {
            int min = array[i];
            for (int j = i; j < array.length; j++) {
                if (min > array[j]) {
                    min = array[j];
                    swap(array, i, j);
                }
            }
        }
    }

    public static void sortByInsertionSorting(int[] array){
        for (int i = 1; i < array.length; i++) {
            int value = array[i];
            int j = i - 1;

            while (j >= 0 && array[j] > value) {
                array[j + 1] = array[j];
                j = j - 1;
            }
            array[j + 1] = value;
        }
    }

    public static void sortByMergeSorting(int[] array){
        if (array.length < 2) {
            return;
        }

        int[] leftArray = new int[array.length / 2];
        System.arraycopy(array, 0, leftArray, 0, array.length / 2);

        int[] rightArray = new int[array.length - leftArray.length];
        System.arraycopy(array, leftArray.length, rightArray, 0, rightArray.length);

        sortByMergeSorting(leftArray);
        sortByMergeSorting(rightArray);

        mergeArray(array, leftArray, rightArray);
>>>>>>> 497e268dd8bc3b8476417d92cce16ab6da1a1adb
    }
    private static void mergeArray(int[] array, int[] leftArray, int[] rightArray) {

        int leftArrayIndex = 0;
        int rightArrayIndex = 0;

<<<<<<< HEAD
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
=======
        for (int i = 0; i < array.length; i++) {
            if (leftArrayIndex == leftArray.length) {
                array[i] = rightArray[rightArrayIndex];
                rightArrayIndex++;
            } else if (rightArrayIndex == rightArray.length) {
                array[i] = leftArray[leftArrayIndex];
                leftArrayIndex++;
            } else if (leftArray[leftArrayIndex] < rightArray[rightArrayIndex]) {
                array[i] = leftArray[leftArrayIndex];
                leftArrayIndex++;
            } else {
                array[i] = rightArray[rightArrayIndex];
                rightArrayIndex++;
            }
        }
    }

    public static void sortByQuickSorting(int[] array, int startIndex, int endIndex){
        if (array.length == 0) {
            return;
        }
        if (startIndex >= endIndex) {
            return;
        }
        int middle = (startIndex + endIndex) / 2;
        int pivot = array[middle];
        int i = startIndex;
        int j = endIndex;
        while (i <= j) {
            while (array[i] < pivot) {
                i++;
            }
            while (array[j] > pivot) {
                j--;
            }
            if (i <= j) {
                swap(array, i, j);
                i++;
                j--;
            }
        }
        if (startIndex < j)
            sortByQuickSorting(array, startIndex, j);

        if (endIndex > i)
            sortByQuickSorting(array, i, endIndex);
>>>>>>> 497e268dd8bc3b8476417d92cce16ab6da1a1adb
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