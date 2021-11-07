package algorithms;

public class SortingAlgorithms {

    public static void main(String[] args) {
        int [] array = new int[]{2,1,8,3,5,5,-26,1};
        sortByBubbleSorting(array);
        sortBySelectionSorting(array);
        sortByInsertionSorting(array);
        sortByMergeSorting(array);
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
        for (int i = 0; i < array.length; i++){
            for(int j = i+1; j < array.length; j++){
                if(array[i]>array[j]){
                    swap(array, j , i);
                    continue;
                }
            }
        }
    }

    public static void sortByInsertionSorting(int[] array){
        for (int i = 0; i < array.length; i++){
            for (int j = i+1; j < array.length; j++){
                if(i == 0) {
                    if (array[i] > array[j]) {
                        swap(array, j, i);
                    }
                }else if(i > 0){
                    while (array[j] < array[i]){
                        swap(array, j, i);
                        i--;
                    }
                }
            }
        }
    }

    public static void sortByMergeSorting(int[] array){
        /*int[] leftArray = new int[array.length/2];
        int[] rightArray = new int[array.length - array.length/2];



        if (array.length % 2 == 0){
            for (int i = 0; i < array.length/2; i++){
                for (int j = array.length/2; j < array.length; j++){

                }
            }
        }*/
    }

    public static void sortByQuickSorting(int[] array){

    }

    private static void swap(int [] array, int firstIndex, int lastIndex) {
        int tempValue = array[firstIndex];
        array[firstIndex] = array[lastIndex];
        array[lastIndex] = tempValue;
    }
    private static void print(int [] array){
        for(int element : array){
            System.out.print(element+",");
        }
    }
}