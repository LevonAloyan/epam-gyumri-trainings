package thread;


public class DataTransfer<T> implements Runnable {
    BoundedBlockingBuffer<T> blockingBuffer;
    T value;

    DataTransfer(BoundedBlockingBuffer<T> blockingBuffer, T value) {
        this.blockingBuffer = blockingBuffer;
        this.value = value;
        new Thread(this, "data exchanger").start();
    }

    @Override
    public void run() {
        blockingBuffer.put(value);
    }

}