package arrays;

public class ArrayUtilTest {

    public static void main(String[] args) {
        int[] arr = {125, 123,43, 54, 122};
        int max = ArrayUtil.getMax(arr);
        System.out.println(max);

        System.out.println("___________________________________________________________");
        int [] arr1 = {1, 9, 8, 98, 8};
        int min = ArrayUtil.getMin(arr1);
        System.out.println(min);


        System.out.println("___________________________________________________________");
        double array [] = { 2.8, 9.8, 7.4, 3.65};
        double average = ArrayUtil.getAvg(array);
        System.out.println(average);

        System.out.println("___________________________________________________________");
        int array2 [] = {2,2,2,2,2,2};
        long total = ArrayUtil.sum(array2);
        System.out.println(total);

    }
}
