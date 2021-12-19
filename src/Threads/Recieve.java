package Threads;

public class Recieve<T> implements Runnable {
    BoundedBlockingBuffer<T> boundedBlockingBuffer;

    public Recieve(BoundedBlockingBuffer<T> boundedBlockingBuffer) {
        this.boundedBlockingBuffer = boundedBlockingBuffer;
        new Thread(this, "reciever").start();

    }

    @Override
    public void run() {
        System.out.println(this.boundedBlockingBuffer.take());

    }
}
