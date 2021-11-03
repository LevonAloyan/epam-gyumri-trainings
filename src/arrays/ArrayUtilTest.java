package arrays;

public class ArrayUtilTest {

    public static void main(String[] args) {
        //   ArrayUtil.createArray(5);
        //   ArrayUtil.create2dArray(2,3);
        int[] array = {1, 5, 6};
        int[] ints = ArrayUtil.addFirst(array, 8);
        for (int i = 0; i < ints.length; i++) {
            System.out.println(ints[i]);
        }
    }
}
