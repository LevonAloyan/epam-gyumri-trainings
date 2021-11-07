package algorithms;

public class SortingAlgorithms {

    public static void main(String[] args) {
        int [] array = new int[]{2,1,8,3,5,5,-26};
        //sortByBubbleSorting(array);
        //sortBySelectionSorting(array);
        //sortByInsertionSorting(array);
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
        for (int i = 0; i< array.length-1; i++){
            int min =i;
            for (int j = i+1; j< array.length; j++){
                if(array[min] > array[j]){
                    swap(array,min,j);
                }
            }
            
         

        }
        
    }

    public static void sortByInsertionSorting(int[] array){
            for (int i =1; i<array.length;i++){
        int current = array[i];
                int j = i-1;
                while(j >=0 && array[j]>current){
                    swap(array, j+1,j);
                    j--;
                }

            }
    }

    public static void sortByMergeSorting(int[] array){

    }

    public static void sortByQuickSorting(int[] array){

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