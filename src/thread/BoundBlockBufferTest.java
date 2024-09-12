package thread;

public class BoundBlockBufferTest {
    public static void main(String[] args) {
        BoundedBlockingBuffer boundedBlockingBuffer = new BoundedBlockingBuffer();
        new PutThread(boundedBlockingBuffer);
        new TackThread(boundedBlockingBuffer);
    }
}
