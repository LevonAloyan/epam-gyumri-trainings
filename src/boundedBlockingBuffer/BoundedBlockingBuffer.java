package boundedBlockingBuffer;

public class BoundedBlockingBuffer<T> {

    private final Object[] buffer;
    private int put, take, count;

    public BoundedBlockingBuffer(int size) {
        buffer = new Object[size];
    }

    public synchronized void put(T object) {
        try {
            while (isFull()) {
                wait();
            }
        } catch (InterruptedException e) {
            System.out.println(e);
        }
        doPut(object);
        notifyAll();
    }

    public synchronized T take() {
        try {
            while (isEmpty()) {
                wait();
            }

        } catch (InterruptedException e) {
            System.out.println(e);
        }
        T element = doTake();
        notifyAll();
        return element;
    }

    public synchronized boolean isFull() {
        return count == buffer.length;
    }

    public synchronized boolean isEmpty() {
        return count == 0;
    }

    public synchronized void doPut(T object) {
        buffer[put] = object;
        if (++put == buffer.length) {
            put = 0;
        }
        ++count;
    }

    public synchronized T doTake() {
        T element = (T) buffer[take];
        if (++take == buffer.length) {
            take = 0;
        }
        --count;
        return element;
    }
}
