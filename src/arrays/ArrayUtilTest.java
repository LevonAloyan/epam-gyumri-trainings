package arrays;

public class ArrayUtilTest {

    public static void main(String[] args) {

                   ArrayUtil.createArray(4);
                  ArrayUtil.create2dArray(2,3);
                 ArrayUtil.addFirst(new int [] {5,4,8,1}, 2);
                ArrayUtil.contains(new int [] {0,4,5,6,8}, 5);
               ArrayUtil.indexOf(new int [] {25,1,45,7,0,9}, 0);
              ArrayUtil.remove (new int[] {4,5,6,2,5,8}, 2);
             ArrayUtil.sum(new int [] {5,8,9,21,1});
            ArrayUtil.getMax (new int [] {5,69,12,89,25,90,0});
           ArrayUtil.getMin(new int [] {24,5,15,64,-5,1});
          ArrayUtil.getAvg(new int [] {5,6,7,8,9,1});


    }
}
