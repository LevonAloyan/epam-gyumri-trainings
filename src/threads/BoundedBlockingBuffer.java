package threads;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class BoundedBlockingBuffer<T> {
    private T data;
    private Lock bufferLock = new ReentrantLock();
    private Condition isEmptyCondition = bufferLock.newCondition();


    public void put(T data) throws InterruptedException {
        bufferLock.lock();
        System.out.println(Thread.currentThread().getName() + " is waiting to put.");
        try {
            this.data = data;
            isEmptyCondition.await();
            System.out.println(Thread.currentThread().getName() + " has put.");
            isEmptyCondition.signalAll();
        } finally {
            bufferLock.unlock();
        }
    }

    public T take() throws InterruptedException {
        bufferLock.lock();
        try {
            System.out.println(Thread.currentThread().getName() + " is waiting to take.");
            while (true) {
                System.out.println(Thread.currentThread().getName() + " has taken.");
                isEmptyCondition.signalAll();
                return data;
            }
        } finally {
            bufferLock.unlock();
        }
    }
}
