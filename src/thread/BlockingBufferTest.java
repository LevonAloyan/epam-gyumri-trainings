package thread;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

public class BlockingBufferTest {
    public static void main(String[] args) {
        BoundedBlockingBuffer<Deque<Integer>> buffer = new BoundedBlockingBuffer<>(2);
        Deque<Integer> nums = new ArrayDeque<>();
        nums.add(2);
        nums.add(3);
        nums.add(4);
        nums.add(5);
        new DataTransfer<>(buffer,nums);
        new DataReceive<>(buffer);

        BoundedBlockingBuffer<Deque<String>> buffer1 = new BoundedBlockingBuffer<>(2);
        Deque<String> strings = new ArrayDeque<>();
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