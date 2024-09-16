package thread;

public class BoundedBlockingBuffer<T> {

    private T data;

    private boolean isEmpty = true;

    public synchronized void put(T data) throws InterruptedException {
        while (!isEmpty) {
            System.out.println("Waiting to put - " + Thread.currentThread().getName());
            wait();

        }
        isEmpty = false;
        this.data = data;
        System.out.println("Putting data - " + Thread.currentThread().getName());
        notifyAll();
    }

    public synchronized T take() throws InterruptedException {
        while (isEmpty) {
            System.out.println("Waiting to take - " + Thread.currentThread().getName());
            wait();

        }
        isEmpty = true;
        notifyAll();
        System.out.println("Taking data - " + Thread.currentThread().getName());
        return data;
    }


}

