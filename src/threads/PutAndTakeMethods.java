package threads;

public class PutAndTakeMethods<T> {

    private T data;
    private boolean var = false;

    public synchronized void put(T data) {
        while (var)
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        var = true;
        data = (T) "1";

        this.data = data;
        System.out.println("Put " + data);
        notifyAll();
    }

    public synchronized T take() {
        while (!var)
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        var = false;
        System.out.println("Take" + data);
        data = null;
        notifyAll();
        return data;
    }
}
