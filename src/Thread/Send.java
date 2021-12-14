package Thread;

public class Send<T> implements Runnable{
    BoundedBlockingBuffer<T> boundedBlockingBuffer;
    T value;

    public Send(BoundedBlockingBuffer<T> boundedBlockingBuffer, T value) {
        this.boundedBlockingBuffer = boundedBlockingBuffer;
        this.value = value;
        new Thread(this, "transfer").start();
    }

    @Override
    public void run() {
        boundedBlockingBuffer.put(value);
    }
}
