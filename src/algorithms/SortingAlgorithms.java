package algorithms;

public class SortingAlgorithms {

    public static void main(String[] args) {
        int [] array = new int[]{2,1,8,3,5,5,-26};

        System.out.println("\nArray before sorting");
        print(array);
        System.out.println();
        System.out.println();

        System.out.println("BubbleSort");
        sortByBubbleSorting(array);
        print(array);
        System.out.println("\n");

        System.out.println("SelectionSort");
        sortBySelectionSorting(array);
        print(array);
        System.out.println("\n");

        System.out.println("InsertionSort");
        sortByInsertionSorting(array);
        print(array);
        System.out.println("\n");


        System.out.println("MergeSort");
        sortByMergeSorting(array, 0, array.length - 1);
        print(array);
        System.out.println("\n");

        System.out.println("QuickSort");
        sortByQuickSorting(array, 0, array.length - 1);
        print(array);
        System.out.println("\n");
    }

    public static void sortByBubbleSorting(int[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    swapXOR(array, j + 1, j);
                }
            }
        }
    }

    public static void sortBySelectionSorting(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            int min = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < array[min])
                    min = j;
                swapXOR(array, min, i);
            }
        }

    }

    public static void sortByInsertionSorting(int[] array) {
        for (int i = 1; i < array.length; ++i) {
            int key = array[i];
            int j = i - 1;

            while (j >= 0 && array[j] > key) {
                array[j + 1] = array[j];
                j = j - 1;
            }
            array[j + 1] = key;
        }

    }

    public static void sortByMergeSorting(int[] arr, int l, int r) {
        if (l < r) {

            int m = l + (r - l) / 2;

            sortByMergeSorting(arr, l, m);
            sortByMergeSorting(arr, m + 1, r);

            sort(arr, l, m, r);
        }

    }

    private static void sort(int[] arr, int l, int m, int r) {

        int n1 = m - l + 1;
        int n2 = r - m;

        int[] L = new int[n1];
        int[] R = new int[n2];

        System.arraycopy(arr, l, L, 0, n1);
        for (int j = 0; j < n2; ++j)
            R[j] = arr[m + 1 + j];

        int i = 0, j = 0;

        int k = l;
        while (i < n1 && j < n2) {
            if (L[i] <= R[j]) {
                arr[k] = L[i];
                i++;
            } else {
                arr[k] = R[j];
                j++;
            }
            k++;
        }

        while (i < n1) {
            arr[k] = L[i];
            i++;
            k++;
        }

        while (j < n2) {
            arr[k] = R[j];
            j++;
            k++;
        }


    }

    public static void sortByQuickSorting(int[] array, int low, int high) {
        if (low < high) {
            int p = partition(array, low, high);
            sortByQuickSorting(array, low, p - 1);
            sortByQuickSorting(array, p + 1, high);
        }

    }

    private static int partition(int[] arr, int low, int high) {
        int pivot = arr[high];

        int i = low - 1;

        for (int j = low; j <= high - 1; j++) {
            if (arr[j] < pivot) {
                i++;
                swap(arr, i, j);
            }
        }
        swapXOR(arr, i + 1, high);

        return i + 1;
    }


    private static void swap(int[] array, int first, int last) {
        int x = array[first];
        int y = array[last];

        x = x + y;
        y = x - y;
        x = x - y;

        array[first] = x;
        array[last] = y;
    } // swap without temp value

    private static void swapXOR(int[] array, int first, int second) {
        try {
            int x = array[first];
            int y = array[second];

            x = x ^ y;
            y = x ^ y;
            x = x ^ y;

            array[first] = x;
            array[second] = y;
        } catch (IndexOutOfBoundsException e) {
            System.err.println("Index is more than array.length");
        }


    } // BONUS

    private static void print(int[] array) {
        for (int element : array) {
            System.out.print(element + ",");
        }
    }
}