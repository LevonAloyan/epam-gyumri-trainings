package arrays;
import java.util.Random;

public class ArrayUtil {
    public static void createArray(int size) {
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = i + 2;
            System.out.print(array[i] + " ");
        }
        System.out.println();
        System.out.println("done 1");

    }

    public static void create2dArray(int x, int y) {
        int array2d[][] = new int[x][y];

        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                array2d[i][j] = i + j;
                System.out.print(array2d[i][j] + " ");


            }
            System.out.println();


        }
        System.out.println("Done 2");


    }

    public static int[] addFirst(int valueToAdd) {
        int[] array = new int[]{21, 32, 33, 22, 2};
        for (int i = 0; i < array.length; i++) {
            array[0] = valueToAdd;
            System.out.print(array[i] + " ");
        }
        System.out.println();
        System.out.println("Done 3");

        return array;
    }

    public static boolean contains(int value) {
        int array1[] = new int[]{32, 43, 45, 56, 56, 7, 88, 9};
        for (int i = 0; i < array1.length; i++) {
            if (array1[i] == value) {
                System.out.println(true);
            }else;



        }

        System.out.println("done 4");
        return false;

    }

        public static int indexOf ( int value1){
            int[] array = new int[]{53, 543, 54, 6, 7, 788, 9, 54, 6, 7, 8, 23};
            for (int i = 0; i < array.length; i++) {

                if (array[i] == value1) {
                    int k = array[0];
                    array[0] = array[i];
                    array[i] = k;
                }
                System.out.print(array[i]+" ");

            }
            System.out.println();
                System.out.println("Done 5");

        return -1;}




        public static void remove(int index){
        int[] array = new int[]{23,69,3,43,4345,6,7,88,9,76};
        for(int i=0;i<array.length; i++) {
            if(i==index) {
                array[index] = 44;
            }
            System.out.print(array[i] + " ");
        }
            System.out.println();
            System.out.println("Done 6");
        }
        public static long sum(){
        int  sum = 0;
        int[ ]array = new int[10];
        for(int i=0;i<10;i++) {
            array[i] = i * 2 + 4;
            System.out.print(array[i] + " ");
            sum += array[i];
        }
            System.out.println();
            System.out.println("Sum of array elements equal " +sum);
            System.out.println("Done 7");

        return 0;
        }
        public static void getMax(){
        int[] array = new int[] {32,334,45,2345,678,9,544346,788,};
        int maxValue = array[0];

        for(int i=0;i<array.length;i++) {
            if (array[i] > maxValue) {
                maxValue = array[i];
            }
        }
            System.out.println("max value equla "+maxValue);
            System.out.println("Done 8");

        }

        public static void getMin(){
        int[] array=new int []{43,43,34,54,6665,776,2765,334,5656};
        int minValue = array[0];
        for( int i=0; i<array.length; i++){
            if(array[i]<minValue){
                minValue =array[i];
            }
        }
            System.out.println("min value equl "+ minValue);
            System.out.println("Done 9");
        }
        public static void getAvg(){
        int array[]= new int[10];
        Random rnd = new Random();
        for(int i=0;i<array.length;i++){
           array[i]=rnd.nextInt(23);
            System.out.print(array[i]+" ");

        }
        double avg =0;
        for(int i=0;i<array.length; i++){
            avg+=array[i]/array.length;
        }
            System.out.println();
            System.out.println("avarage value is "+avg);
            System.out.println("Done 10");


        }
    }





