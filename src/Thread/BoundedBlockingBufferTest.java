package Thread;

public class BoundedBlockingBufferTest {
    public static void main(String[] args) {

        BoundedBlockingBuffer<String> boundedBlockingBuffer1 = new BoundedBlockingBuffer<String>();
        new Send<String>(boundedBlockingBuffer1, "threads");
        new Recieve<String>(boundedBlockingBuffer1);

        BoundedBlockingBuffer<String> boundedBlockingBuffer2 = new BoundedBlockingBuffer<String>();
        new Send<String>(boundedBlockingBuffer2, "56");
        new Recieve<String>(boundedBlockingBuffer2);


    }
}
