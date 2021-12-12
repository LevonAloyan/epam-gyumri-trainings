package threads;

import java.util.ArrayList;
import java.util.List;

public class BoundedBlockingBuffer<T> {
    private final List<T> buffer = new ArrayList<>();
    private volatile T data;
    private volatile int capacity;

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
        capacity--;
        System.out.println(Thread.currentThread().getName() + " put ----> " + data);
        notify();
    }

    protected synchronized T take() {
        while (buffer.size() != capacity) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.print(Thread.currentThread().getName() + " get ----> " );
        capacity++;
            notify();
        return data;
    }
}
