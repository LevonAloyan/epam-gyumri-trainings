package algorithms;

public class SortingAlgorithms {

    public static void main(String[] args) {
        int[] array = new int[]{2, 1, 8, 3, 5, 5, -26};
//        sortByBubbleSorting(array);
        sortBySelectionSorting(array);
//        sortByInsertionSorting(array);
//        sortByMergeSorting(array);
//        sortByQuickSorting(array);
        print(array);
    }

    public static void sortByBubbleSorting(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    swap(array, j + 1, j);
                }
            }
        }
    }

    public static void sortBySelectionSorting(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            int minIndex = i;
            for (int j = i; j < array.length - 1; j++) {
                if (array[j + 1] < array[minIndex]) {
                    minIndex = j + 1;
                }
            }
            if (minIndex != i) {
                swap(array, i, minIndex);
            }
        }
    }

    public static void sortByInsertionSorting(int[] array) {
        for (int i = 1; i < array.length; i++) {
            int currentValue = array[i];
            int j = i - 1;
            while (j >= 0 && currentValue < array[j]) {
                array[j + 1] = array[j];
                j--;
            }
            if (currentValue != array[j + 1]) {
                array[j + 1] = currentValue;
            }
        }
    }


    public static void sortByMergeSorting(int[] array) {
        if (array == null) {
            return;
        }
        if (array.length < 2) {
            return;
        }

        int[] arrayB = new int[array.length / 2];
        System.arraycopy(array, 0, arrayB, 0, array.length / 2);

        int[] arrayC = new int[array.length - arrayB.length];
        System.arraycopy(array, arrayB.length, arrayC, 0, array.length - arrayB.length);

        sortByMergeSorting(arrayB);
        sortByMergeSorting(arrayC);

        mergeArray(array, arrayB, arrayC);
    }

    private static void mergeArray(int[] array, int[] arrayB, int[] arrayC) {

        int positionB = 0;
        int positionC = 0;

        for (int i = 0; i < array.length; i++) {
            if (positionB == arrayB.length) {
                array[i] = arrayC[positionC];
                positionC++;
            } else if (positionC == arrayC.length) {
                array[i] = arrayB[positionB];
                positionB++;
            } else if (arrayB[positionB] < arrayC[positionC]) {
                array[i] = arrayB[positionB];
                positionB++;
            } else {
                array[i] = arrayC[positionC];
                positionC++;
            }
        }
    }

    public static void sortByQuickSorting(int[] array) {
        quickSort(array, 0, array.length - 1);
    }

    public static void quickSort(int[] array, int start, int end) {
        if (array.length == 0)
            return;
        if (start >= end)
            return;
        int middle = (start + end) / 2;
        int pivot = array[middle];
        int i = start, j = end;
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
        if (start < j)
            quickSort(array, start, j);

        if (end > i)
            quickSort(array, i, end);
    }

    private static void swap(int[] array, int firstIndex, int lastIndex) {
        int tempValue = array[firstIndex];
        array[firstIndex] = array[lastIndex];
        array[lastIndex] = tempValue;

//      array[firstIndex] ^= array[lastIndex];
//      array[lastIndex] ^= array[firstIndex];
//      array[firstIndex] ^= array[lastIndex];

    }

    private static void print(int[] array) {
        for (int element : array) {
            System.out.print(element + ",");
        }
    }
}