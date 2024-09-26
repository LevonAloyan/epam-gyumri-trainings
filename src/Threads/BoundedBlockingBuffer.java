package Threads;

public class BoundedBlockingBuffer<T> {
    private T data;
    private boolean isEmpty = true;

    public boolean isEmpty() {
        return isEmpty;
    }

    public void setEmpty(boolean empty) {
        isEmpty = empty;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public synchronized T take() {
        while (!isEmpty) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        isEmpty = false;
        System.out.println("Take " +this.data);
        notify();
        return this.data;
    }

    public synchronized void put(T data) {
        while (isEmpty) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        isEmpty = true;
        this.data = data;
        System.out.println("Put " + this.data);
        notify();
    }
}



