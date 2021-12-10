package thread;

public class BoundedBuffer<T> extends Thread {
    private final Object[] buffer;
    private int put, take, count;

    public BoundedBuffer() {
        buffer = new Object[3];
    }

    public synchronized T take() {
        try {
            Thread.sleep(2000);
            while (isEmpty()) {
                Thread.onSpinWait();
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return doTake();
    }

    public synchronized void put(T data) {
        try {
            Thread.sleep(2000);
            while (isFull()) {
                Thread.onSpinWait();
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        doPut(data);
    }

    public synchronized boolean isFull() {
        return count == buffer.length;
    }

    public synchronized boolean isEmpty() {
        return count == 0;
    }

    protected synchronized void doPut(T data) {
        buffer[put] = data;
        if (++put == buffer.length) {
            put = 0;
        }
        ++count;
    }

    protected synchronized T doTake() {
        T element = (T) buffer[take];
        if (++take == buffer.length) {
            take = 0;
        }
        --count;
        return element;
    }
}
