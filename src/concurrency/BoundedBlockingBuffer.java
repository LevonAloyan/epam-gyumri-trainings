package concurrency;

public class BoundedBlockingBuffer<T> {
    private T data;
    private boolean condition = true;


    public synchronized void put(T data)  {
        while (!condition) {
                System.out.println(Thread.currentThread().getName() + " is waiting to put." );
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
            condition = false;
            this.data = data;
            System.out.println( Thread.currentThread().getName()+" has put.");
            notifyAll();
        }



    public synchronized T take()  {
        while (condition) {
                System.out.println(Thread.currentThread().getName() +" is waiting to take.");
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        condition = true;
        notifyAll();
        System.out.println(Thread.currentThread().getName()+" has taken.");
        return data;
    }
}
