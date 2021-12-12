package threads;

import java.util.ArrayList;
import java.util.List;

public class BlockingBufferTest {
    public static void main(String[] args) {
        BoundedBlockingBuffer<List<Integer>> buffer = new BoundedBlockingBuffer<>(2);
        List<Integer> nums = new ArrayList<>();
        nums.add(2);
        nums.add(3);
        nums.add(4);
        nums.add(5);
        new DataTransfer<>(buffer,nums);
        new DataReceive<>(buffer);

        BoundedBlockingBuffer<List<String>> buffer1 = new BoundedBlockingBuffer<>(2);
        List<String> strings = new ArrayList<>();
        strings.add("Heghine");
        strings.add("tried");
        strings.add("to make");
        strings.add("the task");
        new DataTransfer<>(buffer1,strings);
        new DataReceive<>(buffer1);

        BoundedBlockingBuffer<Double> buffer2 = new BoundedBlockingBuffer<>(3);
        new DataTransfer<>(buffer2, 1.4);
        new DataReceive<>(buffer2);


    }

}
