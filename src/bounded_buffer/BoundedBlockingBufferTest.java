package bounded_buffer;

public class BoundedBlockingBufferTest {

    public static void main(String[] args) {
        BoundedBlockingBuffer<String> boundedBlockingBuffer = new BoundedBlockingBuffer<String>(2);

        boundedBlockingBuffer.put("first");
        boundedBlockingBuffer.put("second");

        System.out.println("Element <" + boundedBlockingBuffer.take() + "> is taken from buffer");
        System.out.println("Another element <" + boundedBlockingBuffer.take() + "> is taken from buffer");

    }
}
