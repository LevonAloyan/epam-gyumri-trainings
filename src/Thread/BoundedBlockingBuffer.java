package Thread;

public class BoundedBlockingBuffer<T> {
    T data;
    boolean isEmpty = true;

    public synchronized T take() {
        while (isEmpty) {
            if (this.data == null) {
                try {
                    wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            } else {
                isEmpty = false;
                this.data = data;
                System.out.println("Take " + this.data);
                notify();
            }

        }
        return this.data;
    }


    public synchronized void put(T data) {
        while (isEmpty) {
            if (data == null) {
                this.data = data;
                System.out.println("Put " + this.data);
                notify();
                isEmpty = false;
            } else {
                try {
                    wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }

}
