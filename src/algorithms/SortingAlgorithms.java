package algorithms;

public class SortingAlgorithms {

    public static void main(String[] args) {
       // int[] array = new int[]{2, 1, 3, 5, 5, -26};
        int[] array = new int[]{2, 7, 8, 3, 5, 9, 1, 4, 6};
       // sortByBubbleSorting(array);
      //  sortBySelectionSorting(array);
       // sortByInsertionSorting(array);
       // sortByMergeSorting(array);
       // sortByQuickSorting(array);
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
            for (int j = 0; j < array.length; j++) {
                if (array[i] < array[j]) {
                    swap(array, j, i);
                }
            }
        }
    }


    public static void sortByInsertionSorting(int[] array) {
        for (int i = 1; i < array.length; i++) {
            while (array[i] < array[i - 1]) {
                swap(array, i - 1, i);
                if (i > 1) {
                    i--;
                }
            }
        }

    }

    public static void sortByMergeSorting(int[] array) {

        if (array.length < 2) {
            return;
        }
        int midIndex = array.length / 2;
        int[] leftHalf = new int[midIndex];
        int[] rightHalf = new int[array.length - midIndex];

        for (int i = 0; i < midIndex; i++) {
            leftHalf[i] = array[i];
        }
        for (int i = midIndex; i < array.length; i++) {
            rightHalf[i - midIndex] = array[i];
        }
        sortByMergeSorting(leftHalf);
        sortByMergeSorting(rightHalf);
        marge(array, leftHalf, rightHalf);
    }

    public static void marge(int[] array, int[] leftHalf, int[] rightHalf) {

        int i = 0, j = 0, k = 0;

        while (i < leftHalf.length && j < rightHalf.length) {
            if (leftHalf[i] <= rightHalf[j]) {
                array[k] = leftHalf[i];
                i++;
            } else {
                array[k] = rightHalf[j];
                j++;
            }
            k++;
        }
        while (i < leftHalf.length) {
            array[k] = leftHalf[i];
            i++;
            k++;
        }
        while (j < rightHalf.length) {
            array[k] = rightHalf[j];
            j++;
            k++;
        }


    }

    public static void sortByQuickSorting(int[] array) {
        int low = 0;
        int high = array.length - 1;
        quickSort(array, low, high);
    }

    private static void quickSort(int[] array, int low, int high) {
        if (array.length == 0) {
            return;
        }
        if (low >= high) {
            return;
        }
        int middle = low + (high - low) / 2;
        int centerElement = array[middle];
        int i = low, j = high;
        while (i <= j) {
            while (array[i] < centerElement) {
                i++;
            }
            while (array[j] > centerElement) {
                j--;
            }
            if (i <= j) {
                swap(array, i, j);
                i++;
                j--;
            }
            if (low < j) {
                quickSort(array, low, j);
            }
            if (high > i) {
                quickSort(array, i, high);
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
    }
}