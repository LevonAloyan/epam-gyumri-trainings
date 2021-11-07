package algorithms;

public class SortingAlgorithms {

    public static void main(String[] args) {
        int [] array = new int[]{2,1,8,3,5,5,-26};
        /* sortByBubbleSorting(array);
        sortBySelectionSorting(array);
        sortByInsertionSorting(array);
        sortByMergeSorting(array); */
        sortByQuickSorting(array,0,array.length-1);
        print(array);
    }

    public static void sortByBubbleSorting(int[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length-i-1; j++) {
                if (array[j] > array[j+1]) {
                    swap(array, j+1, j);
                }
            }
        }
    }

    public static void sortBySelectionSorting(int[] array){
        for (int i = 0; i < array.length; i++) {
            int min = array[i];
            int minIndex = i;
            for (int j = i+1; j < array.length; j++) {
                if (array[j] < min) {
                    min = array[j];
                    minIndex = j;
                }
            }
            swap(array,min,array[minIndex]);
        }
    }

    public static void sortByInsertionSorting(int[] array){
        for (int i = 1; i < array.length; i++) {
            int current = array[i];
            int j = i - 1;
            while(j >= 0 && current < array[j]) {
                array[j+1] = array[j];
                j--;
            }
            array[j+1] = current;
        }
    }

    public static void sortByMergeSorting(int[] array, int firstIndex, int lastIndex){
        int mid = (firstIndex + lastIndex) / 2;
        if (firstIndex < lastIndex) {
            sortByMergeSorting(array, firstIndex, mid);
            sortByMergeSorting(array, mid + 1, lastIndex);
        }
        int i = 0, first = firstIndex, last = mid + 1;
        int[] temp = new int[lastIndex - firstIndex + 1];

        while (first <= mid && last <= lastIndex) {
            temp[i++] = array[first] < array[last] ? array[first++] : array[last++];
        }
        while (first <= mid) {
            temp[i++] = array[first++];
        }
        while (last <= lastIndex) {
            temp[i++] = array[last++];
        }
        i = 0;
        while (firstIndex <= lastIndex) {
            array[firstIndex++] = temp[i++];
        }
    }

    public static void sortByQuickSorting(int[] array ,int first,int last){
        if (last <= first) return;
        int pivot = partition(array, first, last);
        sortByQuickSorting(array, first, pivot-1);
        sortByQuickSorting(array, pivot+1, last);
    }
    static int partition(int[] array, int first, int last) {
        int pivot = last;

        int counter = first;
        for (int i = first; i < last; i++) {
            if (array[i] < array[pivot]) {
                int temp = array[counter];
                array[counter] = array[i];
                array[i] = temp;
                counter++;
            }
        }
        int temp = array[pivot];
        array[pivot] = array[counter];
        array[counter] = temp;

        return counter;
    }


    private static void swap(int [] array, int firstIndex, int lastIndex) {
        int tempValue = array[firstIndex];
        array[firstIndex] = array[lastIndex];
        array[lastIndex] = tempValue;
    }
    private static void print (int [] array){
        for(int element : array){
            System.out.print(element+",");
        }
    }
}