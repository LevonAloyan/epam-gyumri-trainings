package algorithms;

public class SortingAlgorithms {

    public static void main(String[] args) {
        int[] array = new int[]{2, 1, 8, 3, 5, 5, -26};

//        sortByBubbleSorting(array);
//        sortByInsertionSorting(array);
//        sortBySelectionSorting(array);
//        print(array);
        sortByMergeSorting(array);
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
            for (int j = minIndex + 1; j < array.length; j++) {
                if (array[j] < array[minIndex]) {
                    minIndex = j;
                }
            }
            if (array[i] != array[minIndex]) {
                swap(array, minIndex, i);
            }
        }

    }

    public static void sortByInsertionSorting(int[] array) {
        for (int i = 0; i < array.length; i++) {
            int value = array[i];
            int index = i;
            for (int j = i - 1; j >= 0 && value < array[j]; j--) {
                array[j + 1] = array[j];
                index = j;
            }
            array[index] = value;
        }
    }

    public static void sortByMergeSorting(int[] array) {
        if (array.length < 2) {
            return;
        }
        int mid = array.length / 2;

        int[] leftArr = new int[mid];
        int[] rightArr = new int[array.length - mid];

        System.arraycopy(array, 0, leftArr, 0, mid);
        if (array.length - mid >= 0) System.arraycopy(array, mid, rightArr, 0, array.length - mid);

        sortByMergeSorting(leftArr);
        sortByMergeSorting(rightArr);

        int i = 0;
        int j = 0;
        int n = 0;

        while (i < leftArr.length && j < rightArr.length) {
            if (leftArr[i] <= rightArr[j]) {
                array[n++] = leftArr[i++];
            } else {
                array[n++] = rightArr[j++];
            }
        }
        while (i < leftArr.length) {
            array[n++] = leftArr[i++];
        }
        while (j < rightArr.length) {
            array[n++] = rightArr[j++];
        }

    }

    public static void sortByQuickSorting(int[] array) {

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