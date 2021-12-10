package thread;

import java.util.concurrent.atomic.AtomicInteger;

public class BoundedBlockingBuffer {
    private boolean a = false;
    int data;

    public synchronized void put(int data) {
        if (data == 0) {
            a = true;
            this.data = data;

            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        } else {
            System.out.println("put" + data);

            notify();


        }
    }

    public synchronized int take() {
        if (a) {
            try {
                wait();

            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        } else {
            notify();
            System.out.println("take" + data);
            data = 0;

        }
        return data;
    }

}
