package thread;


import java.util.ArrayDeque;
import java.util.Deque;

public class BoundedBlockingBuffer<T> {
    private volatile T data;
    private final int capacity;
    private final Deque<T> buffer;

    public BoundedBlockingBuffer(int capacity) {
        this.capacity = capacity;
        this.buffer = new ArrayDeque<>(capacity);
    }

    protected synchronized void put(T data) {
        while (buffer.size() == capacity) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        this.data = data;
        buffer.add(data);
        System.out.println(Thread.currentThread().getName() + " put ----> " + data);
        notify();
    }

    protected synchronized T take() {
        while (buffer.size() == 0) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        buffer.poll();
        System.out.print(Thread.currentThread().getName() + " get ----> ");
        notify();
        return this.data;
    }
}