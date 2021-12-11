package ThreadWin;

public class BufferBounded<T> {
    private boolean variable = false;
    private volatile T data;

    protected synchronized void put(T data) {
        while (variable) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        if (this.data == null) {
            variable = true;

            this.data = data;
            System.out.println("Put " + data);
            notify();
        }
    }

    protected synchronized T take() {
        while (!variable) {
            try {
                wait();

            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        if (this.data != null) {
            variable = false;
            System.out.println("Take " + data);
            this.data = null;
            notify();
        }
        return data;
    }
}

