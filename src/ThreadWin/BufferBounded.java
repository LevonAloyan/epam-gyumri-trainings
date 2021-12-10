package ThreadWin;

public class BufferBounded {
    private boolean variable = false;
    volatile int  data;

    public synchronized void put(int data) {
        while (variable) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        variable = true;
        ++data;
        this.data = data;
        System.out.println("Put " + data);
        notify();
}
    public synchronized int take() {
        while (!variable) {
            try {
                wait();

            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        variable= false;
        System.out.println("Take " + data);

        data = 0;
        notify();
        return data;
    }
}

