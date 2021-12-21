package thread;

public class DataReceive<T> implements Runnable {
    BoundedBlockingBuffer<T> blockingBuffer;

    DataReceive(BoundedBlockingBuffer<T> blockingBuffer) {
        this.blockingBuffer = blockingBuffer;
        new Thread(this, "data receiver").start();
    }


    @Override
    public void run() {
        System.out.println(blockingBuffer.take());
    }
}