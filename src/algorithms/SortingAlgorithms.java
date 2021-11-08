package algorithms;

public class SortingAlgorithms {

    public static void main(String[] args) {
        int [] array = new int[]{2,1,8,3,5,5,-26};
        sortByBubbleSorting(array);
        print(array);
        int [] array1 = new int[]{-5, -14,18,28,-100,8,-4,-6,0};
        sortBySelectionSorting(array1);
        print(array1);
        int [] array2 = new int[]{-5, -14,18,28,-100,8,-4,-6,0};
        sortByInsertionSorting(array2);
        print(array2);
        int [] array3 = new int[]{-5, -14,18,28,-100,8,-4,-6};
        sortByMergeSorting(array3); // I used Google
        print(array3);
        int [] array4 = new int[]{-5, -14,18,28,-100,8,-4,-6};
        sortByQuickSorting(array4); // I used Google
        print(array4);
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
        for (int i = 0; i < array.length; i++){
            for (int j = i+1; j < array.length; j++){
                if(array[i] > array[j]){
                    swap(array, i, j);
                }
            }
        }
    }

    public static void sortByInsertionSorting(int[] array){
        for (int i = 1; i < array.length; i++){
                for (int j = i - 1; j >= 0; j--) {
                    if (array[j] > array[j+1]) {
                        swap(array, j, j+1);
                    }else {
                        break;
                    }
            }
        }
    }

    public static void sortByMergeSorting(int[] array){
        mergeSort(array, array.length);
    }
    private static void mergeSort(int[] partArray, int lenght){
        if (lenght < 2) {
            return;
        }
        int mid = lenght / 2;
        int[] left = new int[mid];
        int[] right = new int[lenght - mid];

        for (int i = 0; i < mid; i++) {
            left[i] = partArray[i];
        }
        for (int i = mid; i < lenght; i++) {
            right[i - mid] = partArray[i];
        }
        mergeSort(left, mid);
        mergeSort(right, lenght -mid);

        merge(partArray, left, right, mid, lenght - mid);
    }
    private static void merge (int[] array, int[] left, int [] right,int leftPart, int rightPart){
        int i = 0, j = 0, k = 0;
        while (i < leftPart && j < rightPart) {
            if (left[i] <= right[j]) {
                array[k++] = left[i++];
            }
            else {
                    array[k++] = right[j++];
            }
        }
        while (i < leftPart) {
            array[k++] = left[i++];
        }
        while (j < rightPart) {
            array[k++] = right[j++];
        }
    }
    public static void sortByQuickSorting(int[] array){
        quickSort(array, 0, array.length - 1);
    }

    private static void quickSort(int[] array, int begin, int end) {
        if (begin < end) {
            int partitionIndex = partition(array, begin, end);

            quickSort(array, begin, partitionIndex-1);
            quickSort(array, partitionIndex+1, end);
        }
    }

    private static int partition(int array[], int begin, int end) {
        int pivot = array[end];
        int i = (begin-1);

        for (int j = begin; j < end; j++) {
            if (array[j] <= pivot) {
                i++;

                swap(array, i, j);
            }
        }

        swap(array, i+1, end);

        return i+1;
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
        System.out.println(" ");
    }
}