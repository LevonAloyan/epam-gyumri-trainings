package concurrency;

public class BoundedBlockingBuffer<T> {
    private T data;
    private boolean condition = true;


    public synchronized void put(T data)  {
        while (!condition) {
                System.out.println("Waiting for " + Thread.currentThread().getName() + " to put.");
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
            condition = false;
            this.data = data;
            System.out.println("Putting " + Thread.currentThread().getName());
            notifyAll();
        }



    public synchronized T take()  {
        while (condition) {
                System.out.println("Waiting for " + Thread.currentThread().getName() + " to take.");
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        condition = true;
        notifyAll();
        System.out.println("Taking " + Thread.currentThread().getName());
        return data;
    }
}
