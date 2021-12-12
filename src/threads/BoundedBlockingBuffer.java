package threads;

import java.util.ArrayList;
import java.util.List;

public class BoundedBlockingBuffer<T> {
    private volatile T data;
    private volatile int capacity;
    private final List<T> buffer = new ArrayList<>(capacity);

    public BoundedBlockingBuffer(int capacity) {
        this.capacity = capacity;
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
        System.out.print(Thread.currentThread().getName() + " get ----> " );
            notify();
        return data;
    }
}
