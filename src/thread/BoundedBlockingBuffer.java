package thread;

public class BoundedBlockingBuffer<T> {

    T data;
    boolean valueSet = false;

    synchronized T take() {
        while (!valueSet) {
            if (data != null) {
                System.out.println("Take " + data);
                valueSet=false;
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
        while (valueSet) {
            if (data == null) {
                data = d;
                valueSet=true;
                System.out.println("Put " + data);
                notify();
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


