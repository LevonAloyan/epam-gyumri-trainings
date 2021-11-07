package algorithms;

public class SortingAlgorithms {

    public static void main(String[] args) {
        int[] array = new int[]{2, 1, 8, 3, 5, 8, 444, 65, 5, -26};
//        sortByBubbleSorting(array);
//        sortByInsertionSorting(array);
        sortBySelectionSorting(array);
//        sortByMergeSorting(array);
        //  sortByQuickSorting(array);
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
            int minIndex = i;
            for (int j = i; j < array.length; j++) {
                if (array[j] < array[minIndex]) {
                    minIndex = j;
                }
            }
            swap(array, minIndex, i);
        }
    }

    public static void sortByInsertionSorting(int[] array) {
        for (int i = 1; i < array.length; i++) {
            int current = array[i];
            int j = i - 1;
            while (j > 0 && array[j] > current) {
                array[j + 1] = array[j];
                j--;
            }
            array[j] = current;
        }
    }

    public static void sortByMergeSorting(int[] array) {
        if (array.length < 2) {
            return;
        }
        int middle = array.length / 2;

        int[] left = new int[middle];
        for (int i = 0; i < middle; i++) {
            left[i] = array[i];
        }
        int[] right = new int[array.length - middle];
        for (int i = middle; i < array.length; i++) {
            right[i - middle] = array[i];
        }
        sortByMergeSorting(left);
        sortByMergeSorting(right);
        merge(left, right, array);
    }

    private static void merge(int[] left, int[] right, int[] result) {
        int i = 0, j = 0, k = 0;

        while (i < left.length && j < right.length) {
            if (left[i] <= right[j]) {
                result[k++] = left[i++];
            } else {
                result[k++] = right[j++];
            }
        }
        while (i < left.length) {
            result[k++] = left[i++];
        }
        while (j < right.length) {
            result[k++] = right[j++];
        }
    }


    public static void sortByQuickSorting(int[] array) {
        sort(array, 0, array.length - 1);
    }

    private static void sort(int[] array, int start, int end) {
        if (start >= end) {
            return;
        }
        int boundary = partition(array, start, end);

        sort(array, start, boundary - 1);
        sort(array, boundary + 1, end);
    }

    private static int partition(int[] array, int start, int end) {
        int pivot = array[end];
        int boundary = start - 1;
        for (int i = start; i <= end; i++) {
            if (array[i] <= pivot) {
                swap(array, i, ++boundary);
            }
        }
        return boundary;
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