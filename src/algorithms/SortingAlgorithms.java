package algorithms;

public class SortingAlgorithms {

    public static void main(String[] args) {

        int[] array = {-50, 2, 1, 8, 3, -100, 5, 5, -26};

        sortByBubbleSorting(array);
        print(array);
        System.out.println();
        sortBySelectionSorting(array);
        System.out.println();
        sortByInsertionSorting(array);
        System.out.println();
        sortByMergeSorting(array);
        print(array);
        System.out.println();
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
            int min = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < array[min]) {
                    min = j;
                }
            }
            swap(array, min, i);
        }
        print(array);
    }

    public static void sortByInsertionSorting(int[] array) {

        for (int i = 1; i < array.length; i++) {
            int j, currentElement;
            currentElement = array[i];

            for (j = i - 1; j >= 0 && array[j] > currentElement; j--) {
                array[j + 1] = array[j];
            }
            array[j + 1] = currentElement;
        }
        print(array);
    }

    public static void sortByMergeSorting(int[] array) {

        if (array.length < 2) {
            return;
        }

        int middle = array.length / 2;
        int[] arrayLeft = new int[middle];
        int[] arrayRight = new int[array.length - middle];

        for (int i = 0; i < middle; i++) {
            arrayLeft[i] = array[i];
        }

        for (int j = middle; j < array.length; j++) {
            arrayRight[j - middle] = array[j];
        }

        sortByMergeSorting(arrayLeft);
        sortByMergeSorting(arrayRight);
        mergeSortingArrays(array, arrayLeft, arrayRight);
    }

    private static void mergeSortingArrays(int[] array, int[] firstArray, int[] secondArray) {
        int i = 0;
        int j = 0;
        int n = 0;

        while (i < firstArray.length && j < secondArray.length) {
            if (firstArray[i] <= secondArray[j]) {
                array[n++] = firstArray[i++];
            } else {
                array[n++] = secondArray[j++];
            }
        }
        while (i < firstArray.length) {
            array[n++] = firstArray[i++];
        }
        while (j < secondArray.length) {
            array[n++] = secondArray[j++];
        }
    }


    public static void sortByQuickSorting(int[] array, int begin, int end) {
        if (array.length == 0 && begin >= end) {
            return;
        }

        int middle = (begin + (end - begin)) / 2;
        int pivot = array[middle];
        int i = begin;
        int j = end;
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
        if (begin < j) {
            sortByQuickSorting(array, begin, j);
        }
        if (end > i) {
            sortByQuickSorting(array, i, end - 1);
        }
    }


    private static void swap(int[] array, int firstIndex, int lastIndex) {

        int tempValue = array[firstIndex];
        array[firstIndex] = array[lastIndex];
        array[lastIndex] = tempValue;
    }


    private static void print(int[] array) {

        for (int element : array) {
            System.out.print(element + ", ");
        }
    }
}