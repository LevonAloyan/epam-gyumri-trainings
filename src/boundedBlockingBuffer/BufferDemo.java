package boundedBlockingBuffer;


public class BufferDemo {
    public static void main(String[] args) {
        BoundedBlockingBuffer<Integer> buffer = new BoundedBlockingBuffer<>(2);

        System.out.println("Is buffer empty: " + buffer.isEmpty());

        buffer.put(20);
        buffer.put(100);


        System.out.println("Is buffer full: " + buffer.isFull());

        int value = buffer.take();
        System.out.println("Element taken from buffer: " + value);

        value = buffer.take();
        System.out.println("Another element taken from buffer: " + value);

        System.out.println("Is buffer empty: " + buffer.isEmpty());


    }
}
