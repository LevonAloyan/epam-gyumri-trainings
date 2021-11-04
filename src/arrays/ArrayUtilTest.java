package arrays;

public class ArrayUtilTest {

    public static void main(String[] args) {
        ArrayUtil.createArray(5);


        int array[] = {24, 2, 3, 6, 8, 0, 90};
        int newArray[] = ArrayUtil.addFirst(array, 10);
        for (int i = 0; i < newArray.length; i++) {
            System.out.println(newArray[i]);
        }

        boolean contains = ArrayUtil.contains(array, 10);
        System.out.println(contains);

        int index = ArrayUtil.indexOf(array, 4);
        System.out.println(index);

        long sum = ArrayUtil.sum(array);
        System.out.println(sum);

        int avg = ArrayUtil.getAvg(array);
        System.out.println(avg);

        int max = ArrayUtil.getMax(array);
        System.out.println(max);

        int min = ArrayUtil.getMin(array);
        System.out.println(min);

        ArrayUtil.remove(array, 6);
    }
}
