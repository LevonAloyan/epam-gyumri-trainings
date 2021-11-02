package arrays;
import java.util.Arrays;

public class ArrayUtilTest {

    public static void main(String[] args) {
        int[] array = {11, 22, 33, 44, 55, 44};

        ArrayUtil.createArray(5);
        ArrayUtil.create2dArray(5, 7);
        System.out.println(Arrays.toString(ArrayUtil.addFirst(array, 99)));
        System.out.println(ArrayUtil.contains(array, 44));
        System.out.println(ArrayUtil.indexOf(array, 44));
        ArrayUtil.remove(array, 3);
        System.out.println(ArrayUtil.sum(array));
        System.out.println(ArrayUtil.getMax(array));
        ArrayUtil.getMin(array);
        System.out.println(ArrayUtil.getAvg(array));
    }
}
