package thread;

public class BoundedBlockingBuffer<T> {

    T data;
    boolean valueSet = false;

    synchronized T take() {
        while (!valueSet) {
            if (data != null) {
                System.out.println("Take " + data);
                valueSet=true;
               data = null;
                notify();
            } else {
                try {
                    wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
        return data;
    }

    synchronized void put(T d) {
        while (!valueSet) {
            if (data == null) {
                data = d;
                System.out.println("Put " + data);
                notify();
                valueSet=false;
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


