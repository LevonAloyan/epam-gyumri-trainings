package ThreadWin;

public class BufferBounded<T> {
    private boolean variable = false;
    volatile T data;

    public synchronized void put(T data) {
        while (variable) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        variable = true;
        data = (T) "1";
        this.data = data;
        System.out.println("Put " + data);
        notify();
    }

    public synchronized T take() {
        while (!variable) {
            try {
                wait();

            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        variable = false;
        System.out.println("Take " + data);

        data = null;
        notify();
        return data;
    }
}

